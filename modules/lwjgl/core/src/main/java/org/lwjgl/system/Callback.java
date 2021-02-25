/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import org.lwjgl.*;
import org.lwjgl.system.libffi.*;

import javax.annotation.*;
import java.lang.reflect.*;
import java.util.concurrent.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.jni.JNINativeInterface.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/**
 * Base class for dynamically created native functions that call into Java code.
 *
 * <p>Callback instances use native resources and must be explicitly freed when no longer used by calling the {@link #free} method.</p>
 */
public abstract class Callback implements Pointer, NativeResource {

    private static final boolean DEBUG_ALLOCATOR = Configuration.DEBUG_MEMORY_ALLOCATOR.get(false);

    private static final ClosureRegistry CLOSURE_REGISTRY;

    private interface ClosureRegistry {
        void put(long executableAddress, FFIClosure closure);
        FFIClosure get(long executableAddress);
        FFIClosure remove(long executableAddress);
    }

    static {
        // Detect whether we need to maintain a mapping from executable addresses to FFIClosure structs.
        try (MemoryStack stack = stackPush()) {
            PointerBuffer code = stack.mallocPointer(1);

            FFIClosure closure = ffi_closure_alloc(FFIClosure.SIZEOF, code);
            if (closure == null) {
                throw new OutOfMemoryError();
            }

            if (code.get(0) == closure.address()) {
                // When the closure address matches the executable address, we don't have to maintain any mappings.
                // We can simply cast the executable address to ffi_closure. This is true on many platforms.
                CLOSURE_REGISTRY = new ClosureRegistry() {
                    @Override
                    public void put(long executableAddress, FFIClosure closure) {
                        // no-op
                    }
                    @Override
                    public FFIClosure get(long executableAddress) {
                        return FFIClosure.create(executableAddress);
                    }
                    @Override
                    public FFIClosure remove(long executableAddress) {
                        return get(executableAddress);
                    }
                };
            } else {
                CLOSURE_REGISTRY = new ClosureRegistry() {
                    private final ConcurrentHashMap<Long, FFIClosure> map = new ConcurrentHashMap<>();

                    @Override
                    public void put(long executableAddress, FFIClosure closure) {
                        map.put(executableAddress, closure);
                    }
                    @Override
                    public FFIClosure get(long executableAddress) {
                        return map.get(executableAddress);
                    }
                    @Override
                    public FFIClosure remove(long executableAddress) {
                        return map.remove(executableAddress);
                    }
                };
            }
            ffi_closure_free(closure);
        }
    }

    /** Address of the native callback handler that will call the Java method when the native callback function is invoked. */
    private static final long CALLBACK_HANDLER;

    static {
        // Setup the native callback handler.
        try {
            CALLBACK_HANDLER = getCallbackHandler(CallbackI.class.getDeclaredMethod("callback", long.class, long.class));
        } catch (Exception e) {
            throw new IllegalStateException("Failed to initialize the native callback handler.", e);
        }

        MemoryUtil.getAllocator();
    }

    private long address;

    /**
     * Creates a callback instance using the specified libffi CIF.
     *
     * @param cif the libffi CIF
     */
    protected Callback(FFICIF cif) {
        this.address = create(cif, this);
    }

    /**
     * Creates a callback instance using the specified function address
     *
     * @param address the function address
     */
    protected Callback(long address) {
        if (CHECKS) {
            check(address);
        }
        this.address = address;
    }

    @Override
    public long address() {
        return address;
    }

    @Override
    public void free() {
        free(address());
    }

    private static native long getCallbackHandler(Method callback);

    /**
     * Creates a native function that delegates to the specified instance when called.
     *
     * <p>The native function uses the default calling convention.</p>
     *
     * @param cif      the {@code libffi} CIF
     * @param instance the callback instance
     *
     * @return the dynamically generated native function
     */
    static long create(FFICIF cif, Object instance) {
        FFIClosure closure;

        long executableAddress;
        try (MemoryStack stack = stackPush()) {
            PointerBuffer code = stack.mallocPointer(1);

            closure = ffi_closure_alloc(FFIClosure.SIZEOF, code);
            if (closure == null) {
                throw new OutOfMemoryError();
            }
            if (DEBUG_ALLOCATOR) {
                MemoryManage.DebugAllocator.track(closure.address(), FFIClosure.SIZEOF);
            }
            executableAddress = code.get(0);
        }

        long user_data = NewGlobalRef(instance);

        int errcode = ffi_prep_closure_loc(closure, cif, CALLBACK_HANDLER, user_data, executableAddress);
        if (errcode != FFI_OK) {
            DeleteGlobalRef(user_data);
            ffi_closure_free(closure);
            throw new RuntimeException("Failed to prepare the libffi closure");
        }

        CLOSURE_REGISTRY.put(executableAddress, closure);

        return executableAddress;
    }

    /**
     * Converts the specified function pointer to the {@code CallbackI} instance associated with it.
     *
     * @param functionPointer a function pointer
     * @param <T>             the {@code CallbackI} instance type
     *
     * @return the {@code CallbackI} instance
     */
    public static <T extends CallbackI> T get(long functionPointer) {
        return memGlobalRefToObject(CLOSURE_REGISTRY.get(functionPointer).user_data());
    }

    /** Like {@link #get}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static <T extends CallbackI> T getSafe(long functionPointer) {
        return functionPointer == NULL ? null : get(functionPointer);
    }

    /**
     * Frees any resources held by the specified function pointer.
     *
     * @param functionPointer the function pointer
     */
    public static void free(long functionPointer) {
        if (DEBUG_ALLOCATOR) {
            MemoryManage.DebugAllocator.untrack(functionPointer);
        }

        FFIClosure closure = CLOSURE_REGISTRY.get(functionPointer);

        DeleteGlobalRef(closure.user_data());
        ffi_closure_free(closure);
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Callback)) {
            return false;
        }

        Callback that = (Callback)o;

        return address == that.address();
    }

    public int hashCode() {
        return (int)(address ^ (address >>> 32));
    }

    @Override
    public String toString() {
        return String.format("%s pointer [0x%X]", getClass().getSimpleName(), address);
    }

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import org.lwjgl.*;
import org.lwjgl.system.libffi.*;

import java.lang.reflect.*;
import java.util.concurrent.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.jni.JNINativeInterface.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/**
 * Multi-release backend for upcalls.
 *
 * <p>The default backend uses libffi to implement upcalls. The public API also uses libffi FFICIF structures to configure upcalls. Any new backend should be
 * compatible with the same API.</p>
 */
final class Upcalls {

    private static final boolean DEBUG_ALLOCATOR = Configuration.DEBUG_MEMORY_ALLOCATOR.get(false);

    private static final int CLOSURE_SIZE = (int)ffi_get_closure_size();

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

            FFIClosure closure = ffi_closure_alloc(CLOSURE_SIZE, code);
            if (closure == null) {
                throw new OutOfMemoryError();
            }

            if (code.get(0) == closure.address()) {
                apiLog("Closure Registry: simple");

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
                apiLog("Closure Registry: ConcurrentHashMap");

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

    /** Address of the native upcall handler that will call the Java method when the native callback function is invoked. */
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

    private Upcalls() {
    }

    private static native long getCallbackHandler(Method callback);

    /**
     * Creates a native function that delegates to the specified instance when called.
     *
     * <p>The native function uses the default calling convention.</p>
     *
     * @param descriptor      the upcall descriptor
     * @param instance the callback instance
     *
     * @return the dynamically generated native function
     */
    static long upcallCreate(Callback.Descriptor descriptor, Object instance) {
        FFIClosure closure;

        long executableAddress;
        try (MemoryStack stack = stackPush()) {
            PointerBuffer code = stack.mallocPointer(1);

            closure = ffi_closure_alloc(CLOSURE_SIZE, code);
            if (closure == null) {
                throw new OutOfMemoryError();
            }
            executableAddress = code.get(0);
            if (DEBUG_ALLOCATOR) {
                MemoryManage.DebugAllocator.track(executableAddress, CLOSURE_SIZE);
            }
        }

        long user_data = NewGlobalRef(instance);

        int errcode = ffi_prep_closure_loc(closure, descriptor.cif, CALLBACK_HANDLER, user_data, executableAddress);
        if (errcode != FFI_OK) {
            DeleteGlobalRef(user_data);
            ffi_closure_free(closure);
            throw new RuntimeException("Failed to prepare the libffi closure");
        }

        CLOSURE_REGISTRY.put(executableAddress, closure);

        return executableAddress;
    }

    static <T extends CallbackI> T upcallGet(long functionPointer) {
        return memGlobalRefToObject(CLOSURE_REGISTRY.get(functionPointer).user_data());
    }

    static void upcallFree(long functionPointer) {
        if (DEBUG_ALLOCATOR) {
            MemoryManage.DebugAllocator.untrack(functionPointer);
        }

        FFIClosure closure = CLOSURE_REGISTRY.remove(functionPointer);

        DeleteGlobalRef(closure.user_data());
        ffi_closure_free(closure);
    }


}

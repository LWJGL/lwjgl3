/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import org.lwjgl.*;

import javax.annotation.*;
import java.lang.reflect.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;
import static org.lwjgl.system.jni.JNINativeInterface.*;

/**
 * Base class for dynamically created native functions that call into Java code.
 *
 * <p>Callback instances use native resources and must be explicitly freed when no longer used by calling the {@link #free} method.</p>
 */
public abstract class Callback implements Pointer, NativeResource {

    private static final boolean DEBUG_ALLOCATOR = Configuration.DEBUG_MEMORY_ALLOCATOR.get(false);

    private static final long
        VOID,
        BOOLEAN,
        BYTE,
        SHORT,
        INT,
        LONG,
        CLONG,
        FLOAT,
        DOUBLE,
        PTR;

    static {
        // Setup native callbacks
        try (MemoryStack stack = stackPush()) {
            Class<?>[] params = new Class<?>[] {long.class};

            Method[] methods = {
                CallbackI.V.class.getDeclaredMethod("callback", params),
                CallbackI.Z.class.getDeclaredMethod("callback", params),
                CallbackI.B.class.getDeclaredMethod("callback", params),
                CallbackI.S.class.getDeclaredMethod("callback", params),
                CallbackI.I.class.getDeclaredMethod("callback", params),
                CallbackI.J.class.getDeclaredMethod("callback", params),
                CallbackI.N.class.getDeclaredMethod("callback", params),
                CallbackI.F.class.getDeclaredMethod("callback", params),
                CallbackI.D.class.getDeclaredMethod("callback", params),
                CallbackI.P.class.getDeclaredMethod("callback", params)
            };

            PointerBuffer callbacks = stack.mallocPointer(methods.length);

            getNativeCallbacks(methods, memAddress(callbacks));

            VOID = callbacks.get();
            BOOLEAN = callbacks.get();
            BYTE = callbacks.get();
            SHORT = callbacks.get();
            INT = callbacks.get();
            LONG = callbacks.get();
            CLONG = callbacks.get();
            FLOAT = callbacks.get();
            DOUBLE = callbacks.get();
            PTR = callbacks.get();
        } catch (Exception e) {
            throw new IllegalStateException("Failed to initialize native callbacks.", e);
        }

        MemoryUtil.getAllocator();
    }

    private long address;

    /**
     * Creates a callback instance using the specified dyncall signature
     *
     * @param signature the dyncall signature
     */
    protected Callback(String signature) {
        this.address = create(signature, this);
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

    private static native long getNativeCallbacks(Method[] methods, long callbacks);

    public static String __stdcall(String signature) {
        return Platform.get() == Platform.WINDOWS && Pointer.BITS32 ? "_s" + signature : signature;
    }

    /**
     * Creates a native function that delegates to the specified instance when called.
     *
     * <p>The native function uses the default calling convention.</p>
     *
     * @param signature the {@code dyncall} function signature
     * @param instance  the callback instance
     *
     * @return the dynamically generated native function
     */
    static long create(String signature, Object instance) {
        long funcptr = getNativeFunction(signature.charAt(signature.length() - 1));

        long handle = dcbNewCallback(signature, funcptr, NewGlobalRef(instance));
        if (handle == NULL) {
            throw new IllegalStateException("Failed to create the DCCallback object");
        }

        if (DEBUG_ALLOCATOR) {
            MemoryManage.DebugAllocator.track(handle, 2L * POINTER_SIZE);
        }

        return handle;
    }

    private static long getNativeFunction(char type) {
        switch (type) {
            case 'v':
                return VOID;
            case 'B':
                return BOOLEAN;
            case 'c':
                return BYTE;
            case 's':
                return SHORT;
            case 'i':
                return INT;
            case 'l':
                return LONG;
            case 'j':
                return CLONG;
            case 'p':
                return PTR;
            case 'f':
                return FLOAT;
            case 'd':
                return DOUBLE;
            default:
                throw new IllegalArgumentException();
        }
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
        return memGlobalRefToObject(dcbGetUserData(functionPointer));
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

        DeleteGlobalRef(dcbGetUserData(functionPointer));
        dcbFreeCallback(functionPointer);
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
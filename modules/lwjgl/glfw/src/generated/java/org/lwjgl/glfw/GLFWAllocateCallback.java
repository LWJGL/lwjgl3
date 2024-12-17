/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke GLFWallocatefun} */
public abstract class GLFWAllocateCallback extends Callback implements GLFWAllocateCallbackI {

    /**
     * Creates a {@code GLFWAllocateCallback} instance from the specified function pointer.
     *
     * @return the new {@code GLFWAllocateCallback}
     */
    public static GLFWAllocateCallback create(long functionPointer) {
        GLFWAllocateCallbackI instance = Callback.get(functionPointer);
        return instance instanceof GLFWAllocateCallback
            ? (GLFWAllocateCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable GLFWAllocateCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code GLFWAllocateCallback} instance that delegates to the specified {@code GLFWAllocateCallbackI} instance. */
    public static GLFWAllocateCallback create(GLFWAllocateCallbackI instance) {
        return instance instanceof GLFWAllocateCallback
            ? (GLFWAllocateCallback)instance
            : new Container(instance.address(), instance);
    }

    protected GLFWAllocateCallback() {
        super(CIF);
    }

    GLFWAllocateCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends GLFWAllocateCallback {

        private final GLFWAllocateCallbackI delegate;

        Container(long functionPointer, GLFWAllocateCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long size, long user) {
            return delegate.invoke(size, user);
        }

    }

}
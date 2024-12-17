/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke GLFWdeallocatefun} */
public abstract class GLFWDeallocateCallback extends Callback implements GLFWDeallocateCallbackI {

    /**
     * Creates a {@code GLFWDeallocateCallback} instance from the specified function pointer.
     *
     * @return the new {@code GLFWDeallocateCallback}
     */
    public static GLFWDeallocateCallback create(long functionPointer) {
        GLFWDeallocateCallbackI instance = Callback.get(functionPointer);
        return instance instanceof GLFWDeallocateCallback
            ? (GLFWDeallocateCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable GLFWDeallocateCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code GLFWDeallocateCallback} instance that delegates to the specified {@code GLFWDeallocateCallbackI} instance. */
    public static GLFWDeallocateCallback create(GLFWDeallocateCallbackI instance) {
        return instance instanceof GLFWDeallocateCallback
            ? (GLFWDeallocateCallback)instance
            : new Container(instance.address(), instance);
    }

    protected GLFWDeallocateCallback() {
        super(CIF);
    }

    GLFWDeallocateCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends GLFWDeallocateCallback {

        private final GLFWDeallocateCallbackI delegate;

        Container(long functionPointer, GLFWDeallocateCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long block, long user) {
            delegate.invoke(block, user);
        }

    }

}
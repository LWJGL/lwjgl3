/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.glfw.GLFW.*;

/** Callback function: {@link #invoke GLFWcursorposfun} */
public abstract class GLFWCursorPosCallback extends Callback implements GLFWCursorPosCallbackI {

    /**
     * Creates a {@code GLFWCursorPosCallback} instance from the specified function pointer.
     *
     * @return the new {@code GLFWCursorPosCallback}
     */
    public static GLFWCursorPosCallback create(long functionPointer) {
        GLFWCursorPosCallbackI instance = Callback.get(functionPointer);
        return instance instanceof GLFWCursorPosCallback
            ? (GLFWCursorPosCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable GLFWCursorPosCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code GLFWCursorPosCallback} instance that delegates to the specified {@code GLFWCursorPosCallbackI} instance. */
    public static GLFWCursorPosCallback create(GLFWCursorPosCallbackI instance) {
        return instance instanceof GLFWCursorPosCallback
            ? (GLFWCursorPosCallback)instance
            : new Container(instance.address(), instance);
    }

    protected GLFWCursorPosCallback() {
        super(CIF);
    }

    GLFWCursorPosCallback(long functionPointer) {
        super(functionPointer);
    }

    /** See {@link GLFW#glfwSetCursorPosCallback SetCursorPosCallback}. */
    public GLFWCursorPosCallback set(long window) {
        glfwSetCursorPosCallback(window, this);
        return this;
    }

    private static final class Container extends GLFWCursorPosCallback {

        private final GLFWCursorPosCallbackI delegate;

        Container(long functionPointer, GLFWCursorPosCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long window, double xpos, double ypos) {
            delegate.invoke(window, xpos, ypos);
        }

    }

}
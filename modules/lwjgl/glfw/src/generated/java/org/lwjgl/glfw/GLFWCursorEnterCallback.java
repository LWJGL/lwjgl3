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

/** Callback function: {@link #invoke GLFWcursorenterfun} */
public abstract class GLFWCursorEnterCallback extends Callback implements GLFWCursorEnterCallbackI {

    /**
     * Creates a {@code GLFWCursorEnterCallback} instance from the specified function pointer.
     *
     * @return the new {@code GLFWCursorEnterCallback}
     */
    public static GLFWCursorEnterCallback create(long functionPointer) {
        GLFWCursorEnterCallbackI instance = Callback.get(functionPointer);
        return instance instanceof GLFWCursorEnterCallback
            ? (GLFWCursorEnterCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable GLFWCursorEnterCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code GLFWCursorEnterCallback} instance that delegates to the specified {@code GLFWCursorEnterCallbackI} instance. */
    public static GLFWCursorEnterCallback create(GLFWCursorEnterCallbackI instance) {
        return instance instanceof GLFWCursorEnterCallback
            ? (GLFWCursorEnterCallback)instance
            : new Container(instance.address(), instance);
    }

    protected GLFWCursorEnterCallback() {
        super(CIF);
    }

    GLFWCursorEnterCallback(long functionPointer) {
        super(functionPointer);
    }

    /** See {@link GLFW#glfwSetCursorEnterCallback SetCursorEnterCallback}. */
    public GLFWCursorEnterCallback set(long window) {
        glfwSetCursorEnterCallback(window, this);
        return this;
    }

    private static final class Container extends GLFWCursorEnterCallback {

        private final GLFWCursorEnterCallbackI delegate;

        Container(long functionPointer, GLFWCursorEnterCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long window, boolean entered) {
            delegate.invoke(window, entered);
        }

    }

}
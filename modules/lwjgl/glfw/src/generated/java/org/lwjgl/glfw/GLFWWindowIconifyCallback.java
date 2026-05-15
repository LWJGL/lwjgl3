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

/** Callback function: {@link #invoke GLFWwindowiconifyfun} */
public abstract class GLFWWindowIconifyCallback extends Callback implements GLFWWindowIconifyCallbackI {

    /**
     * Creates a {@code GLFWWindowIconifyCallback} instance from the specified function pointer.
     *
     * @return the new {@code GLFWWindowIconifyCallback}
     */
    public static GLFWWindowIconifyCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable GLFWWindowIconifyCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code GLFWWindowIconifyCallback} instance that delegates to the specified {@code GLFWWindowIconifyCallbackI} instance. */
    public static GLFWWindowIconifyCallback create(GLFWWindowIconifyCallbackI instance) { return create(instance, instance.address()); }

    private static GLFWWindowIconifyCallback create(GLFWWindowIconifyCallbackI instance, long functionPointer) {
        return instance instanceof GLFWWindowIconifyCallback
            ? (GLFWWindowIconifyCallback)instance
            : new GLFWWindowIconifyCallback(functionPointer) {
                @Override public void invoke(long window, boolean iconified) {
                    instance.invoke(window, iconified);
                }
            };
    }

    protected GLFWWindowIconifyCallback() {
        super(DESCRIPTOR);
    }

    GLFWWindowIconifyCallback(long functionPointer) {
        super(functionPointer);
    }

    /** See {@link GLFW#glfwSetWindowIconifyCallback SetWindowIconifyCallback}. */
    public GLFWWindowIconifyCallback set(long window) {
        glfwSetWindowIconifyCallback(window, this);
        return this;
    }

}
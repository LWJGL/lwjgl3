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

/** Callback function: {@link #invoke GLFWwindowclosefun} */
public abstract class GLFWWindowCloseCallback extends Callback implements GLFWWindowCloseCallbackI {

    /**
     * Creates a {@code GLFWWindowCloseCallback} instance from the specified function pointer.
     *
     * @return the new {@code GLFWWindowCloseCallback}
     */
    public static GLFWWindowCloseCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable GLFWWindowCloseCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code GLFWWindowCloseCallback} instance that delegates to the specified {@code GLFWWindowCloseCallbackI} instance. */
    public static GLFWWindowCloseCallback create(GLFWWindowCloseCallbackI instance) { return create(instance, instance.address()); }

    private static GLFWWindowCloseCallback create(GLFWWindowCloseCallbackI instance, long functionPointer) {
        return instance instanceof GLFWWindowCloseCallback
            ? (GLFWWindowCloseCallback)instance
            : new GLFWWindowCloseCallback(functionPointer) {
                @Override public void invoke(long window) {
                    instance.invoke(window);
                }
            };
    }

    protected GLFWWindowCloseCallback() {
        super(DESCRIPTOR);
    }

    GLFWWindowCloseCallback(long functionPointer) {
        super(functionPointer);
    }

    /** See {@link GLFW#glfwSetWindowCloseCallback SetWindowCloseCallback}. */
    public GLFWWindowCloseCallback set(long window) {
        glfwSetWindowCloseCallback(window, this);
        return this;
    }

}
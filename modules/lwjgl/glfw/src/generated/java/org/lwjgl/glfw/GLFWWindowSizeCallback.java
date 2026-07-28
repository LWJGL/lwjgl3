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

/** Callback function: {@link #invoke GLFWwindowsizefun} */
public abstract class GLFWWindowSizeCallback extends Callback implements GLFWWindowSizeCallbackI {

    /**
     * Creates a {@code GLFWWindowSizeCallback} instance from the specified function pointer.
     *
     * @return the new {@code GLFWWindowSizeCallback}
     */
    public static GLFWWindowSizeCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable GLFWWindowSizeCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code GLFWWindowSizeCallback} instance that delegates to the specified {@code GLFWWindowSizeCallbackI} instance. */
    public static GLFWWindowSizeCallback create(GLFWWindowSizeCallbackI instance) { return create(instance, instance.address()); }

    private static GLFWWindowSizeCallback create(GLFWWindowSizeCallbackI instance, long functionPointer) {
        return instance instanceof GLFWWindowSizeCallback
            ? (GLFWWindowSizeCallback)instance
            : new GLFWWindowSizeCallback(functionPointer) {
                @Override public void invoke(long window, int width, int height) {
                    instance.invoke(window, width, height);
                }
            };
    }

    protected GLFWWindowSizeCallback() {
        super(DESCRIPTOR);
    }

    GLFWWindowSizeCallback(long functionPointer) {
        super(functionPointer);
    }

    /** See {@link GLFW#glfwSetWindowSizeCallback SetWindowSizeCallback}. */
    public GLFWWindowSizeCallback set(long window) {
        glfwSetWindowSizeCallback(window, this);
        return this;
    }

}
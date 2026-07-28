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

/** Callback function: {@link #invoke GLFWwindowmaximizefun} */
public abstract class GLFWWindowMaximizeCallback extends Callback implements GLFWWindowMaximizeCallbackI {

    /**
     * Creates a {@code GLFWWindowMaximizeCallback} instance from the specified function pointer.
     *
     * @return the new {@code GLFWWindowMaximizeCallback}
     */
    public static GLFWWindowMaximizeCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable GLFWWindowMaximizeCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code GLFWWindowMaximizeCallback} instance that delegates to the specified {@code GLFWWindowMaximizeCallbackI} instance. */
    public static GLFWWindowMaximizeCallback create(GLFWWindowMaximizeCallbackI instance) { return create(instance, instance.address()); }

    private static GLFWWindowMaximizeCallback create(GLFWWindowMaximizeCallbackI instance, long functionPointer) {
        return instance instanceof GLFWWindowMaximizeCallback
            ? (GLFWWindowMaximizeCallback)instance
            : new GLFWWindowMaximizeCallback(functionPointer) {
                @Override public void invoke(long window, boolean maximized) {
                    instance.invoke(window, maximized);
                }
            };
    }

    protected GLFWWindowMaximizeCallback() {
        super(DESCRIPTOR);
    }

    GLFWWindowMaximizeCallback(long functionPointer) {
        super(functionPointer);
    }

    /** See {@link GLFW#glfwSetWindowMaximizeCallback SetWindowMaximizeCallback}. */
    public GLFWWindowMaximizeCallback set(long window) {
        glfwSetWindowMaximizeCallback(window, this);
        return this;
    }

}
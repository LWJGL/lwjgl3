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

/** Callback function: {@link #invoke GLFWwindowfocusfun} */
public abstract class GLFWWindowFocusCallback extends Callback implements GLFWWindowFocusCallbackI {

    /**
     * Creates a {@code GLFWWindowFocusCallback} instance from the specified function pointer.
     *
     * @return the new {@code GLFWWindowFocusCallback}
     */
    public static GLFWWindowFocusCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable GLFWWindowFocusCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code GLFWWindowFocusCallback} instance that delegates to the specified {@code GLFWWindowFocusCallbackI} instance. */
    public static GLFWWindowFocusCallback create(GLFWWindowFocusCallbackI instance) { return create(instance, instance.address()); }

    private static GLFWWindowFocusCallback create(GLFWWindowFocusCallbackI instance, long functionPointer) {
        return instance instanceof GLFWWindowFocusCallback
            ? (GLFWWindowFocusCallback)instance
            : new GLFWWindowFocusCallback(functionPointer) {
                @Override public void invoke(long window, boolean focused) {
                    instance.invoke(window, focused);
                }
            };
    }

    protected GLFWWindowFocusCallback() {
        super(DESCRIPTOR);
    }

    GLFWWindowFocusCallback(long functionPointer) {
        super(functionPointer);
    }

    /** See {@link GLFW#glfwSetWindowFocusCallback SetWindowFocusCallback}. */
    public GLFWWindowFocusCallback set(long window) {
        glfwSetWindowFocusCallback(window, this);
        return this;
    }

}
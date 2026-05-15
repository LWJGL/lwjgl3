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

/** Callback function: {@link #invoke GLFWwindowposfun} */
public abstract class GLFWWindowPosCallback extends Callback implements GLFWWindowPosCallbackI {

    /**
     * Creates a {@code GLFWWindowPosCallback} instance from the specified function pointer.
     *
     * @return the new {@code GLFWWindowPosCallback}
     */
    public static GLFWWindowPosCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable GLFWWindowPosCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code GLFWWindowPosCallback} instance that delegates to the specified {@code GLFWWindowPosCallbackI} instance. */
    public static GLFWWindowPosCallback create(GLFWWindowPosCallbackI instance) { return create(instance, instance.address()); }

    private static GLFWWindowPosCallback create(GLFWWindowPosCallbackI instance, long functionPointer) {
        return instance instanceof GLFWWindowPosCallback
            ? (GLFWWindowPosCallback)instance
            : new GLFWWindowPosCallback(functionPointer) {
                @Override public void invoke(long window, int xpos, int ypos) {
                    instance.invoke(window, xpos, ypos);
                }
            };
    }

    protected GLFWWindowPosCallback() {
        super(DESCRIPTOR);
    }

    GLFWWindowPosCallback(long functionPointer) {
        super(functionPointer);
    }

    /** See {@link GLFW#glfwSetWindowPosCallback SetWindowPosCallback}. */
    public GLFWWindowPosCallback set(long window) {
        glfwSetWindowPosCallback(window, this);
        return this;
    }

}
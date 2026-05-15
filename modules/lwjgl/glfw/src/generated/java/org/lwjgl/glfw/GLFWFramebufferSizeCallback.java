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

/** Callback function: {@link #invoke GLFWframebuffersizefun} */
public abstract class GLFWFramebufferSizeCallback extends Callback implements GLFWFramebufferSizeCallbackI {

    /**
     * Creates a {@code GLFWFramebufferSizeCallback} instance from the specified function pointer.
     *
     * @return the new {@code GLFWFramebufferSizeCallback}
     */
    public static GLFWFramebufferSizeCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable GLFWFramebufferSizeCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code GLFWFramebufferSizeCallback} instance that delegates to the specified {@code GLFWFramebufferSizeCallbackI} instance. */
    public static GLFWFramebufferSizeCallback create(GLFWFramebufferSizeCallbackI instance) { return create(instance, instance.address()); }

    private static GLFWFramebufferSizeCallback create(GLFWFramebufferSizeCallbackI instance, long functionPointer) {
        return instance instanceof GLFWFramebufferSizeCallback
            ? (GLFWFramebufferSizeCallback)instance
            : new GLFWFramebufferSizeCallback(functionPointer) {
                @Override public void invoke(long window, int width, int height) {
                    instance.invoke(window, width, height);
                }
            };
    }

    protected GLFWFramebufferSizeCallback() {
        super(DESCRIPTOR);
    }

    GLFWFramebufferSizeCallback(long functionPointer) {
        super(functionPointer);
    }

    /** See {@link GLFW#glfwSetFramebufferSizeCallback SetFramebufferSizeCallback}. */
    public GLFWFramebufferSizeCallback set(long window) {
        glfwSetFramebufferSizeCallback(window, this);
        return this;
    }

}
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

/** Callback function: {@link #invoke GLFWwindowcontentscalefun} */
public abstract class GLFWWindowContentScaleCallback extends Callback implements GLFWWindowContentScaleCallbackI {

    /**
     * Creates a {@code GLFWWindowContentScaleCallback} instance from the specified function pointer.
     *
     * @return the new {@code GLFWWindowContentScaleCallback}
     */
    public static GLFWWindowContentScaleCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable GLFWWindowContentScaleCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code GLFWWindowContentScaleCallback} instance that delegates to the specified {@code GLFWWindowContentScaleCallbackI} instance. */
    public static GLFWWindowContentScaleCallback create(GLFWWindowContentScaleCallbackI instance) { return create(instance, instance.address()); }

    private static GLFWWindowContentScaleCallback create(GLFWWindowContentScaleCallbackI instance, long functionPointer) {
        return instance instanceof GLFWWindowContentScaleCallback
            ? (GLFWWindowContentScaleCallback)instance
            : new GLFWWindowContentScaleCallback(functionPointer) {
                @Override public void invoke(long window, float xscale, float yscale) {
                    instance.invoke(window, xscale, yscale);
                }
            };
    }

    protected GLFWWindowContentScaleCallback() {
        super(DESCRIPTOR);
    }

    GLFWWindowContentScaleCallback(long functionPointer) {
        super(functionPointer);
    }

    /** See {@link GLFW#glfwSetWindowContentScaleCallback SetWindowContentScaleCallback}. */
    public GLFWWindowContentScaleCallback set(long window) {
        glfwSetWindowContentScaleCallback(window, this);
        return this;
    }

}
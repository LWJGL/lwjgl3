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

/** Callback function: {@link #invoke GLFWmousebuttonfun} */
public abstract class GLFWMouseButtonCallback extends Callback implements GLFWMouseButtonCallbackI {

    /**
     * Creates a {@code GLFWMouseButtonCallback} instance from the specified function pointer.
     *
     * @return the new {@code GLFWMouseButtonCallback}
     */
    public static GLFWMouseButtonCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable GLFWMouseButtonCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code GLFWMouseButtonCallback} instance that delegates to the specified {@code GLFWMouseButtonCallbackI} instance. */
    public static GLFWMouseButtonCallback create(GLFWMouseButtonCallbackI instance) { return create(instance, instance.address()); }

    private static GLFWMouseButtonCallback create(GLFWMouseButtonCallbackI instance, long functionPointer) {
        return instance instanceof GLFWMouseButtonCallback
            ? (GLFWMouseButtonCallback)instance
            : new GLFWMouseButtonCallback(functionPointer) {
                @Override public void invoke(long window, int button, int action, int mods) {
                    instance.invoke(window, button, action, mods);
                }
            };
    }

    protected GLFWMouseButtonCallback() {
        super(DESCRIPTOR);
    }

    GLFWMouseButtonCallback(long functionPointer) {
        super(functionPointer);
    }

    /** See {@link GLFW#glfwSetMouseButtonCallback SetMouseButtonCallback}. */
    public GLFWMouseButtonCallback set(long window) {
        glfwSetMouseButtonCallback(window, this);
        return this;
    }

}
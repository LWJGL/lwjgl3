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

/** Callback function: {@link #invoke GLFWkeyfun} */
public abstract class GLFWKeyCallback extends Callback implements GLFWKeyCallbackI {

    /**
     * Creates a {@code GLFWKeyCallback} instance from the specified function pointer.
     *
     * @return the new {@code GLFWKeyCallback}
     */
    public static GLFWKeyCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable GLFWKeyCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code GLFWKeyCallback} instance that delegates to the specified {@code GLFWKeyCallbackI} instance. */
    public static GLFWKeyCallback create(GLFWKeyCallbackI instance) { return create(instance, instance.address()); }

    private static GLFWKeyCallback create(GLFWKeyCallbackI instance, long functionPointer) {
        return instance instanceof GLFWKeyCallback
            ? (GLFWKeyCallback)instance
            : new GLFWKeyCallback(functionPointer) {
                @Override public void invoke(long window, int key, int scancode, int action, int mods) {
                    instance.invoke(window, key, scancode, action, mods);
                }
            };
    }

    protected GLFWKeyCallback() {
        super(DESCRIPTOR);
    }

    GLFWKeyCallback(long functionPointer) {
        super(functionPointer);
    }

    /** See {@link GLFW#glfwSetKeyCallback SetKeyCallback}. */
    public GLFWKeyCallback set(long window) {
        glfwSetKeyCallback(window, this);
        return this;
    }

}
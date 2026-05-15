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

/** Callback function: {@link #invoke GLFWcharfun} */
public abstract class GLFWCharCallback extends Callback implements GLFWCharCallbackI {

    /**
     * Creates a {@code GLFWCharCallback} instance from the specified function pointer.
     *
     * @return the new {@code GLFWCharCallback}
     */
    public static GLFWCharCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable GLFWCharCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code GLFWCharCallback} instance that delegates to the specified {@code GLFWCharCallbackI} instance. */
    public static GLFWCharCallback create(GLFWCharCallbackI instance) { return create(instance, instance.address()); }

    private static GLFWCharCallback create(GLFWCharCallbackI instance, long functionPointer) {
        return instance instanceof GLFWCharCallback
            ? (GLFWCharCallback)instance
            : new GLFWCharCallback(functionPointer) {
                @Override public void invoke(long window, int codepoint) {
                    instance.invoke(window, codepoint);
                }
            };
    }

    protected GLFWCharCallback() {
        super(DESCRIPTOR);
    }

    GLFWCharCallback(long functionPointer) {
        super(functionPointer);
    }

    /** See {@link GLFW#glfwSetCharCallback SetCharCallback}. */
    public GLFWCharCallback set(long window) {
        glfwSetCharCallback(window, this);
        return this;
    }

}
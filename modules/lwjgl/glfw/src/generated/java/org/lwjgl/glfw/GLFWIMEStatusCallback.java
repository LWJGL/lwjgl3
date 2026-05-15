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

/** Callback function: {@link #invoke GLFWimestatusfun} */
public abstract class GLFWIMEStatusCallback extends Callback implements GLFWIMEStatusCallbackI {

    /**
     * Creates a {@code GLFWIMEStatusCallback} instance from the specified function pointer.
     *
     * @return the new {@code GLFWIMEStatusCallback}
     */
    public static GLFWIMEStatusCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable GLFWIMEStatusCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code GLFWIMEStatusCallback} instance that delegates to the specified {@code GLFWIMEStatusCallbackI} instance. */
    public static GLFWIMEStatusCallback create(GLFWIMEStatusCallbackI instance) { return create(instance, instance.address()); }

    private static GLFWIMEStatusCallback create(GLFWIMEStatusCallbackI instance, long functionPointer) {
        return instance instanceof GLFWIMEStatusCallback
            ? (GLFWIMEStatusCallback)instance
            : new GLFWIMEStatusCallback(functionPointer) {
                @Override public void invoke(long window) {
                    instance.invoke(window);
                }
            };
    }

    protected GLFWIMEStatusCallback() {
        super(DESCRIPTOR);
    }

    GLFWIMEStatusCallback(long functionPointer) {
        super(functionPointer);
    }

    /** See {@link GLFW#glfwSetIMEStatusCallback SetIMEStatusCallback}. */
    public GLFWIMEStatusCallback set(long window) {
        glfwSetIMEStatusCallback(window, this);
        return this;
    }

}
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

/** Callback function: {@link #invoke GLFWcursorposfun} */
public abstract class GLFWCursorPosCallback extends Callback implements GLFWCursorPosCallbackI {

    /**
     * Creates a {@code GLFWCursorPosCallback} instance from the specified function pointer.
     *
     * @return the new {@code GLFWCursorPosCallback}
     */
    public static GLFWCursorPosCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable GLFWCursorPosCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code GLFWCursorPosCallback} instance that delegates to the specified {@code GLFWCursorPosCallbackI} instance. */
    public static GLFWCursorPosCallback create(GLFWCursorPosCallbackI instance) { return create(instance, instance.address()); }

    private static GLFWCursorPosCallback create(GLFWCursorPosCallbackI instance, long functionPointer) {
        return instance instanceof GLFWCursorPosCallback
            ? (GLFWCursorPosCallback)instance
            : new GLFWCursorPosCallback(functionPointer) {
                @Override public void invoke(long window, double xpos, double ypos) {
                    instance.invoke(window, xpos, ypos);
                }
            };
    }

    protected GLFWCursorPosCallback() {
        super(DESCRIPTOR);
    }

    GLFWCursorPosCallback(long functionPointer) {
        super(functionPointer);
    }

    /** See {@link GLFW#glfwSetCursorPosCallback SetCursorPosCallback}. */
    public GLFWCursorPosCallback set(long window) {
        glfwSetCursorPosCallback(window, this);
        return this;
    }

}
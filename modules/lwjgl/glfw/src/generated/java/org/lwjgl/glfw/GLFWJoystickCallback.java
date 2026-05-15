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

/** Callback function: {@link #invoke GLFWjoystickfun} */
public abstract class GLFWJoystickCallback extends Callback implements GLFWJoystickCallbackI {

    /**
     * Creates a {@code GLFWJoystickCallback} instance from the specified function pointer.
     *
     * @return the new {@code GLFWJoystickCallback}
     */
    public static GLFWJoystickCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable GLFWJoystickCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code GLFWJoystickCallback} instance that delegates to the specified {@code GLFWJoystickCallbackI} instance. */
    public static GLFWJoystickCallback create(GLFWJoystickCallbackI instance) { return create(instance, instance.address()); }

    private static GLFWJoystickCallback create(GLFWJoystickCallbackI instance, long functionPointer) {
        return instance instanceof GLFWJoystickCallback
            ? (GLFWJoystickCallback)instance
            : new GLFWJoystickCallback(functionPointer) {
                @Override public void invoke(int jid, int event) {
                    instance.invoke(jid, event);
                }
            };
    }

    protected GLFWJoystickCallback() {
        super(DESCRIPTOR);
    }

    GLFWJoystickCallback(long functionPointer) {
        super(functionPointer);
    }

    /** See {@link GLFW#glfwSetJoystickCallback SetJoystickCallback}. */
    public GLFWJoystickCallback set() {
        glfwSetJoystickCallback(this);
        return this;
    }

}
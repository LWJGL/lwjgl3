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

/** Callback function: {@link #invoke GLFWmonitorfun} */
public abstract class GLFWMonitorCallback extends Callback implements GLFWMonitorCallbackI {

    /**
     * Creates a {@code GLFWMonitorCallback} instance from the specified function pointer.
     *
     * @return the new {@code GLFWMonitorCallback}
     */
    public static GLFWMonitorCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable GLFWMonitorCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code GLFWMonitorCallback} instance that delegates to the specified {@code GLFWMonitorCallbackI} instance. */
    public static GLFWMonitorCallback create(GLFWMonitorCallbackI instance) { return create(instance, instance.address()); }

    private static GLFWMonitorCallback create(GLFWMonitorCallbackI instance, long functionPointer) {
        return instance instanceof GLFWMonitorCallback
            ? (GLFWMonitorCallback)instance
            : new GLFWMonitorCallback(functionPointer) {
                @Override public void invoke(long monitor, int event) {
                    instance.invoke(monitor, event);
                }
            };
    }

    protected GLFWMonitorCallback() {
        super(DESCRIPTOR);
    }

    GLFWMonitorCallback(long functionPointer) {
        super(functionPointer);
    }

    /** See {@link GLFW#glfwSetMonitorCallback SetMonitorCallback}. */
    public GLFWMonitorCallback set() {
        glfwSetMonitorCallback(this);
        return this;
    }

}
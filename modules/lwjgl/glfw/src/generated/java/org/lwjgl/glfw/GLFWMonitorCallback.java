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
    public static GLFWMonitorCallback create(long functionPointer) {
        GLFWMonitorCallbackI instance = Callback.get(functionPointer);
        return instance instanceof GLFWMonitorCallback
            ? (GLFWMonitorCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable GLFWMonitorCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code GLFWMonitorCallback} instance that delegates to the specified {@code GLFWMonitorCallbackI} instance. */
    public static GLFWMonitorCallback create(GLFWMonitorCallbackI instance) {
        return instance instanceof GLFWMonitorCallback
            ? (GLFWMonitorCallback)instance
            : new Container(instance.address(), instance);
    }

    protected GLFWMonitorCallback() {
        super(CIF);
    }

    GLFWMonitorCallback(long functionPointer) {
        super(functionPointer);
    }

    /** See {@link GLFW#glfwSetMonitorCallback SetMonitorCallback}. */
    public GLFWMonitorCallback set() {
        glfwSetMonitorCallback(this);
        return this;
    }

    private static final class Container extends GLFWMonitorCallback {

        private final GLFWMonitorCallbackI delegate;

        Container(long functionPointer, GLFWMonitorCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long monitor, int event) {
            delegate.invoke(monitor, event);
        }

    }

}
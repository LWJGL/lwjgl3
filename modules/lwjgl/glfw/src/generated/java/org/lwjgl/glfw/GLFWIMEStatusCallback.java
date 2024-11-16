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

/**
 * Instances of this class may be passed to the {@link GLFW#glfwSetIMEStatusCallback SetIMEStatusCallback} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*{@link #invoke}) (
 *     GLFWwindow *window
 * )</code></pre>
 *
 * @since version 3.X
 */
public abstract class GLFWIMEStatusCallback extends Callback implements GLFWIMEStatusCallbackI {

    /**
     * Creates a {@code GLFWIMEStatusCallback} instance from the specified function pointer.
     *
     * @return the new {@code GLFWIMEStatusCallback}
     */
    public static GLFWIMEStatusCallback create(long functionPointer) {
        GLFWIMEStatusCallbackI instance = Callback.get(functionPointer);
        return instance instanceof GLFWIMEStatusCallback
            ? (GLFWIMEStatusCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable GLFWIMEStatusCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code GLFWIMEStatusCallback} instance that delegates to the specified {@code GLFWIMEStatusCallbackI} instance. */
    public static GLFWIMEStatusCallback create(GLFWIMEStatusCallbackI instance) {
        return instance instanceof GLFWIMEStatusCallback
            ? (GLFWIMEStatusCallback)instance
            : new Container(instance.address(), instance);
    }

    protected GLFWIMEStatusCallback() {
        super(CIF);
    }

    GLFWIMEStatusCallback(long functionPointer) {
        super(functionPointer);
    }

    /** See {@link GLFW#glfwSetIMEStatusCallback SetIMEStatusCallback}. */
    public GLFWIMEStatusCallback set(long window) {
        glfwSetIMEStatusCallback(window, this);
        return this;
    }

    private static final class Container extends GLFWIMEStatusCallback {

        private final GLFWIMEStatusCallbackI delegate;

        Container(long functionPointer, GLFWIMEStatusCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long window) {
            delegate.invoke(window);
        }

    }

}
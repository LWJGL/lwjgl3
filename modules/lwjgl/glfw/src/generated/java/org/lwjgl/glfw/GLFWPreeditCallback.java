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

/** Callback function: {@link #invoke GLFWpreeditfun} */
public abstract class GLFWPreeditCallback extends Callback implements GLFWPreeditCallbackI {

    /**
     * Creates a {@code GLFWPreeditCallback} instance from the specified function pointer.
     *
     * @return the new {@code GLFWPreeditCallback}
     */
    public static GLFWPreeditCallback create(long functionPointer) {
        GLFWPreeditCallbackI instance = Callback.get(functionPointer);
        return instance instanceof GLFWPreeditCallback
            ? (GLFWPreeditCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable GLFWPreeditCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code GLFWPreeditCallback} instance that delegates to the specified {@code GLFWPreeditCallbackI} instance. */
    public static GLFWPreeditCallback create(GLFWPreeditCallbackI instance) {
        return instance instanceof GLFWPreeditCallback
            ? (GLFWPreeditCallback)instance
            : new Container(instance.address(), instance);
    }

    protected GLFWPreeditCallback() {
        super(CIF);
    }

    GLFWPreeditCallback(long functionPointer) {
        super(functionPointer);
    }

    /** See {@link GLFW#glfwSetPreeditCallback SetPreeditCallback}. */
    public GLFWPreeditCallback set(long window) {
        glfwSetPreeditCallback(window, this);
        return this;
    }

    private static final class Container extends GLFWPreeditCallback {

        private final GLFWPreeditCallbackI delegate;

        Container(long functionPointer, GLFWPreeditCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long window, int preedit_count, long preedit_string, int block_count, long block_sizes, int focused_block, int caret) {
            delegate.invoke(window, preedit_count, preedit_string, block_count, block_sizes, focused_block, caret);
        }

    }

}
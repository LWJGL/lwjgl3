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

/** Callback function: {@link #invoke GLFWpreeditcandidatefun} */
public abstract class GLFWPreeditCandidateCallback extends Callback implements GLFWPreeditCandidateCallbackI {

    /**
     * Creates a {@code GLFWPreeditCandidateCallback} instance from the specified function pointer.
     *
     * @return the new {@code GLFWPreeditCandidateCallback}
     */
    public static GLFWPreeditCandidateCallback create(long functionPointer) {
        GLFWPreeditCandidateCallbackI instance = Callback.get(functionPointer);
        return instance instanceof GLFWPreeditCandidateCallback
            ? (GLFWPreeditCandidateCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable GLFWPreeditCandidateCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code GLFWPreeditCandidateCallback} instance that delegates to the specified {@code GLFWPreeditCandidateCallbackI} instance. */
    public static GLFWPreeditCandidateCallback create(GLFWPreeditCandidateCallbackI instance) {
        return instance instanceof GLFWPreeditCandidateCallback
            ? (GLFWPreeditCandidateCallback)instance
            : new Container(instance.address(), instance);
    }

    protected GLFWPreeditCandidateCallback() {
        super(CIF);
    }

    GLFWPreeditCandidateCallback(long functionPointer) {
        super(functionPointer);
    }

    /** See {@link GLFW#glfwSetPreeditCandidateCallback SetPreeditCandidateCallback}. */
    public GLFWPreeditCandidateCallback set(long window) {
        glfwSetPreeditCandidateCallback(window, this);
        return this;
    }

    private static final class Container extends GLFWPreeditCandidateCallback {

        private final GLFWPreeditCandidateCallbackI delegate;

        Container(long functionPointer, GLFWPreeditCandidateCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long window, int candidates_count, int selected_index, int page_start, int page_size) {
            delegate.invoke(window, candidates_count, selected_index, page_start, page_size);
        }

    }

}
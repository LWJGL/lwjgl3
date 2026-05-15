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
    public static GLFWPreeditCandidateCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable GLFWPreeditCandidateCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code GLFWPreeditCandidateCallback} instance that delegates to the specified {@code GLFWPreeditCandidateCallbackI} instance. */
    public static GLFWPreeditCandidateCallback create(GLFWPreeditCandidateCallbackI instance) { return create(instance, instance.address()); }

    private static GLFWPreeditCandidateCallback create(GLFWPreeditCandidateCallbackI instance, long functionPointer) {
        return instance instanceof GLFWPreeditCandidateCallback
            ? (GLFWPreeditCandidateCallback)instance
            : new GLFWPreeditCandidateCallback(functionPointer) {
                @Override public void invoke(long window, int candidates_count, int selected_index, int page_start, int page_size) {
                    instance.invoke(window, candidates_count, selected_index, page_start, page_size);
                }
            };
    }

    protected GLFWPreeditCandidateCallback() {
        super(DESCRIPTOR);
    }

    GLFWPreeditCandidateCallback(long functionPointer) {
        super(functionPointer);
    }

    /** See {@link GLFW#glfwSetPreeditCandidateCallback SetPreeditCandidateCallback}. */
    public GLFWPreeditCandidateCallback set(long window) {
        glfwSetPreeditCandidateCallback(window, this);
        return this;
    }

}
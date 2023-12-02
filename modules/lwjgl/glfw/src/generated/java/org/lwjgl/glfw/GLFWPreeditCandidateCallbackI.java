/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/**
 * Instances of this interface may be passed to the {@link GLFW#glfwSetPreeditCandidateCallback SetPreeditCandidateCallback} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*{@link #invoke}) (
 *     GLFWwindow *window,
 *     int candidates_count,
 *     int selected_index,
 *     int page_start,
 *     int page_size
 * )</code></pre>
 *
 * @since version 3.X
 */
@FunctionalInterface
@NativeType("GLFWpreeditcandidatefun")
public interface GLFWPreeditCandidateCallbackI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_void,
        ffi_type_pointer, ffi_type_sint32, ffi_type_sint32, ffi_type_sint32, ffi_type_sint32
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetAddress(memGetAddress(args)),
            memGetInt(memGetAddress(args + POINTER_SIZE)),
            memGetInt(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 3 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 4 * POINTER_SIZE))
        );
    }

    /**
     * The function pointer type for preedit candidate callbacks.
     * 
     * <p>Use {@link GLFW#glfwGetPreeditCandidate GetPreeditCandidate} to get the candidate text for a specific index.</p>
     *
     * @param window           the window that received the event
     * @param candidates_count candidates count
     * @param selected_index   index of selected candidate
     * @param page_start       start index of candidate currently displayed
     * @param page_size        count of candidates currently displayed
     */
    void invoke(@NativeType("GLFWwindow *") long window, int candidates_count, int selected_index, int page_start, int page_size);

}
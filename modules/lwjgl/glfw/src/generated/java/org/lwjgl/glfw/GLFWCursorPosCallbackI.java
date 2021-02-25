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
 * Instances of this interface may be passed to the {@link GLFW#glfwSetCursorPosCallback SetCursorPosCallback} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     GLFWwindow *window,
 *     double xpos,
 *     double ypos
 * )</code></pre>
 *
 * @since version 3.0
 */
@FunctionalInterface
@NativeType("GLFWcursorposfun")
public interface GLFWCursorPosCallbackI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_void,
        ffi_type_pointer, ffi_type_double, ffi_type_double
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetAddress(memGetAddress(args)),
            memGetDouble(memGetAddress(args + POINTER_SIZE)),
            memGetDouble(memGetAddress(args + 2 * POINTER_SIZE))
        );
    }

    /**
     * Will be called when the cursor is moved.
     * 
     * <p>The callback function receives the cursor position, measured in screen coordinates but relative to the top-left corner of the window client area. On
     * platforms that provide it, the full sub-pixel cursor position is passed on.</p>
     *
     * @param window the window that received the event
     * @param xpos   the new cursor x-coordinate, relative to the left edge of the content area
     * @param ypos   the new cursor y-coordinate, relative to the top edge of the content area
     */
    void invoke(@NativeType("GLFWwindow *") long window, double xpos, double ypos);

}
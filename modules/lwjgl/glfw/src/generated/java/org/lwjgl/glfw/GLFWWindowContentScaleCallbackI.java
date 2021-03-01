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
 * Instances of this interface may be passed to the {@link GLFW#glfwSetWindowContentScaleCallback SetWindowContentScaleCallback} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*{@link #invoke}) (
 *     GLFWwindow *window,
 *     float xscale,
 *     float yscale
 * )</code></pre>
 *
 * @since version 3.3
 */
@FunctionalInterface
@NativeType("GLFWwindowcontentscalefun")
public interface GLFWWindowContentScaleCallbackI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_void,
        ffi_type_pointer, ffi_type_float, ffi_type_float
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetAddress(memGetAddress(args)),
            memGetFloat(memGetAddress(args + POINTER_SIZE)),
            memGetFloat(memGetAddress(args + 2 * POINTER_SIZE))
        );
    }

    /**
     * Will be called when the window content scale changes.
     *
     * @param window the window whose content scale changed
     * @param xscale the new x-axis content scale of the window
     * @param yscale the new y-axis content scale of the window
     */
    void invoke(@NativeType("GLFWwindow *") long window, float xscale, float yscale);

}
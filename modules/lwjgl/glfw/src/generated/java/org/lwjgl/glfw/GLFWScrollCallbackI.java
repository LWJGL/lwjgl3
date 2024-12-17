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

/** Callback function: {@link #invoke GLFWscrollfun} */
@FunctionalInterface
@NativeType("GLFWscrollfun")
public interface GLFWScrollCallbackI extends CallbackI {

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

    /** {@code void (* GLFWscrollfun) (GLFWwindow * window, double xoffset, double yoffset)} */
    void invoke(@NativeType("GLFWwindow *") long window, double xoffset, double yoffset);

}
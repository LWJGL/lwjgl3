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

/** Callback function: {@link #invoke GLFWkeyfun} */
@FunctionalInterface
@NativeType("GLFWkeyfun")
public interface GLFWKeyCallbackI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
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

    /** {@code void (* GLFWkeyfun) (GLFWwindow * window, int key, int scancode, int action, int mods)} */
    void invoke(@NativeType("GLFWwindow *") long window, int key, int scancode, int action, int mods);

}
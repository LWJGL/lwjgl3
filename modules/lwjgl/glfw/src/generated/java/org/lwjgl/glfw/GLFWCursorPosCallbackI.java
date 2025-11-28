/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.lwjgl.system.*;

import java.lang.invoke.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Callback function: {@link #invoke GLFWcursorposfun} */
@FunctionalInterface
@NativeType("GLFWcursorposfun")
public interface GLFWCursorPosCallbackI extends CallbackI {

    Callback.Descriptor DESCRIPTOR = new Callback.Descriptor(
        MethodHandles.lookup(),
        apiCreateCIF(
            ffi_type_void,
            ffi_type_pointer, ffi_type_double, ffi_type_double
        )
    );

    @Override
    default Callback.Descriptor getDescriptor() { return DESCRIPTOR; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetAddress(memGetAddress(args)),
            memGetDouble(memGetAddress(args + POINTER_SIZE)),
            memGetDouble(memGetAddress(args + 2 * POINTER_SIZE))
        );
    }

    /** {@code void (* GLFWcursorposfun) (GLFWwindow * window, double xpos, double ypos)} */
    void invoke(@NativeType("GLFWwindow *") long window, double xpos, double ypos);

}
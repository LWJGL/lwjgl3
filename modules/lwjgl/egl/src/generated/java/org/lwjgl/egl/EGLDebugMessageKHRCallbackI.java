/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Callback function: {@link #invoke EGLDEBUGPROCKHR} */
@FunctionalInterface
@NativeType("EGLDEBUGPROCKHR")
public interface EGLDebugMessageKHRCallbackI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        apiStdcall(),
        ffi_type_void,
        ffi_type_uint32, ffi_type_pointer, ffi_type_sint32, ffi_type_pointer, ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetInt(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetInt(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 3 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 4 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 5 * POINTER_SIZE))
        );
    }

    /** {@code void (* EGLDEBUGPROCKHR) (EGLenum error, char const * command, EGLint messageType, EGLLabelKHR threadLabel, EGLLabelKHR objectLabel, char const * message)} */
    void invoke(@NativeType("EGLenum") int error, @NativeType("char const *") long command, @NativeType("EGLint") int messageType, @NativeType("EGLLabelKHR") long threadLabel, @NativeType("EGLLabelKHR") long objectLabel, @NativeType("char const *") long message);

}
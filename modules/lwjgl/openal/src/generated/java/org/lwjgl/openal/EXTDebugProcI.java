/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Callback function: {@link #invoke ALDEBUGPROCEXT} */
@FunctionalInterface
@NativeType("ALDEBUGPROCEXT")
public interface EXTDebugProcI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_void,
        ffi_type_sint32, ffi_type_sint32, ffi_type_uint32, ffi_type_sint32, ffi_type_sint32, ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetInt(memGetAddress(args)),
            memGetInt(memGetAddress(args + POINTER_SIZE)),
            memGetInt(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 3 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 4 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 5 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 6 * POINTER_SIZE))
        );
    }

    /** {@code void (* ALDEBUGPROCEXT) (ALenum source, ALenum type, ALuint id, ALenum severity, ALsizei length, ALchar const * message, ALvoid * userParam)} */
    void invoke(@NativeType("ALenum") int source, @NativeType("ALenum") int type, @NativeType("ALuint") int id, @NativeType("ALenum") int severity, @NativeType("ALsizei") int length, @NativeType("ALchar const *") long message, @NativeType("ALvoid *") long userParam);

}
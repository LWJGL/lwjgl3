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

/** Callback function: {@link #invoke ALBUFFERCALLBACKTYPESOFT} */
@FunctionalInterface
@NativeType("ALBUFFERCALLBACKTYPESOFT")
public interface SOFTCallbackBufferTypeI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_sint32,
        ffi_type_pointer, ffi_type_pointer, ffi_type_sint32
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        int __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetInt(memGetAddress(args + 2 * POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /** {@code ALsizei (* ALBUFFERCALLBACKTYPESOFT) (ALvoid * userptr, ALvoid * sampledata, ALsizei numbytes)} */
    @NativeType("ALsizei") int invoke(@NativeType("ALvoid *") long userptr, @NativeType("ALvoid *") long sampledata, @NativeType("ALsizei") int numbytes);

}
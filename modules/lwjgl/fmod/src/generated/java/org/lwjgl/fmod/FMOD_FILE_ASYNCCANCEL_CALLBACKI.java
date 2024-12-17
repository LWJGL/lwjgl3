/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.fmod;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Callback function: {@link #invoke FMOD_FILE_ASYNCCANCEL_CALLBACK} */
@FunctionalInterface
@NativeType("FMOD_FILE_ASYNCCANCEL_CALLBACK")
public interface FMOD_FILE_ASYNCCANCEL_CALLBACKI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        apiStdcall(),
        ffi_type_uint32,
        ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        int __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /** {@code FMOD_RESULT (* FMOD_FILE_ASYNCCANCEL_CALLBACK) (struct FMOD_ASYNCREADINFO * info, void * userdata)} */
    @NativeType("FMOD_RESULT") int invoke(@NativeType("struct FMOD_ASYNCREADINFO *") long info, @NativeType("void *") long userdata);

}
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

/** Callback function: {@link #invoke FMOD_FILE_ASYNCDONE_FUNC} */
@FunctionalInterface
@NativeType("FMOD_FILE_ASYNCDONE_FUNC")
public interface FMOD_FILE_ASYNCDONE_FUNCI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        apiStdcall(),
        ffi_type_void,
        ffi_type_pointer, ffi_type_uint32
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetAddress(memGetAddress(args)),
            memGetInt(memGetAddress(args + POINTER_SIZE))
        );
    }

    /** {@code void (* FMOD_FILE_ASYNCDONE_FUNC) (struct FMOD_ASYNCREADINFO * info, FMOD_RESULT result)} */
    void invoke(@NativeType("struct FMOD_ASYNCREADINFO *") long info, @NativeType("FMOD_RESULT") int result);

}
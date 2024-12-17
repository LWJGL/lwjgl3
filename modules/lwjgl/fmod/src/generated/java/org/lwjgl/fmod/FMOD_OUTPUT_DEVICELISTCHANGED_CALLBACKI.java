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

/** Callback function: {@link #invoke FMOD_OUTPUT_DEVICELISTCHANGED_CALLBACK} */
@FunctionalInterface
@NativeType("FMOD_OUTPUT_DEVICELISTCHANGED_CALLBACK")
public interface FMOD_OUTPUT_DEVICELISTCHANGED_CALLBACKI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        apiStdcall(),
        ffi_type_uint32,
        ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        int __result = invoke(
            memGetAddress(memGetAddress(args))
        );
        apiClosureRet(ret, __result);
    }

    /** {@code FMOD_RESULT (* FMOD_OUTPUT_DEVICELISTCHANGED_CALLBACK) (struct FMOD_OUTPUT_STATE * output_state)} */
    @NativeType("FMOD_RESULT") int invoke(@NativeType("struct FMOD_OUTPUT_STATE *") long output_state);

}
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

/** Callback function: {@link #invoke FMOD_SOUND_PCMSETPOS_CALLBACK} */
@FunctionalInterface
@NativeType("FMOD_SOUND_PCMSETPOS_CALLBACK")
public interface FMOD_SOUND_PCMSETPOS_CALLBACKI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        apiStdcall(),
        ffi_type_uint32,
        ffi_type_pointer, ffi_type_sint32, ffi_type_uint32, ffi_type_uint32
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        int __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetInt(memGetAddress(args + POINTER_SIZE)),
            memGetInt(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 3 * POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /** {@code FMOD_RESULT (* FMOD_SOUND_PCMSETPOS_CALLBACK) (FMOD_SOUND * sound, int subsound, unsigned int position, FMOD_TIMEUNIT postype)} */
    @NativeType("FMOD_RESULT") int invoke(@NativeType("FMOD_SOUND *") long sound, int subsound, @NativeType("unsigned int") int position, @NativeType("FMOD_TIMEUNIT") int postype);

}
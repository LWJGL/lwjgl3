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

/** Callback function: {@link #invoke FMOD_OUTPUT_OPENPORT_CALLBACK} */
@FunctionalInterface
@NativeType("FMOD_OUTPUT_OPENPORT_CALLBACK")
public interface FMOD_OUTPUT_OPENPORT_CALLBACKI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        apiStdcall(),
        ffi_type_uint32,
        ffi_type_pointer, ffi_type_uint32, ffi_type_uint64, ffi_type_pointer, ffi_type_pointer, ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        int __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetInt(memGetAddress(args + POINTER_SIZE)),
            memGetLong(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 3 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 4 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 5 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 6 * POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /** {@code FMOD_RESULT (* FMOD_OUTPUT_OPENPORT_CALLBACK) (struct FMOD_OUTPUT_STATE * output_state, FMOD_PORT_TYPE portType, FMOD_PORT_INDEX portIndex, int * portId, int * portRate, int * portChannels, FMOD_SOUND_FORMAT * portFormat)} */
    @NativeType("FMOD_RESULT") int invoke(@NativeType("struct FMOD_OUTPUT_STATE *") long output_state, @NativeType("FMOD_PORT_TYPE") int portType, @NativeType("FMOD_PORT_INDEX") long portIndex, @NativeType("int *") long portId, @NativeType("int *") long portRate, @NativeType("int *") long portChannels, @NativeType("FMOD_SOUND_FORMAT *") long portFormat);

}
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

/** Callback function: {@link #invoke FMOD_DSP_PROCESS_CALLBACK} */
@FunctionalInterface
@NativeType("FMOD_DSP_PROCESS_CALLBACK")
public interface FMOD_DSP_PROCESS_CALLBACKI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        apiStdcall(),
        ffi_type_uint32,
        ffi_type_pointer, ffi_type_uint32, ffi_type_pointer, ffi_type_pointer, ffi_type_sint32, ffi_type_uint32
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        int __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetInt(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 3 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 4 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 5 * POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /** {@code FMOD_RESULT (* FMOD_DSP_PROCESS_CALLBACK) (struct FMOD_DSP_STATE * dsp_state, unsigned int length, struct FMOD_DSP_BUFFER_ARRAY const * inbufferarray, struct FMOD_DSP_BUFFER_ARRAY * outbufferarray, FMOD_BOOL inputsidle, FMOD_DSP_PROCESS_OPERATION op)} */
    @NativeType("FMOD_RESULT") int invoke(@NativeType("struct FMOD_DSP_STATE *") long dsp_state, @NativeType("unsigned int") int length, @NativeType("struct FMOD_DSP_BUFFER_ARRAY const *") long inbufferarray, @NativeType("struct FMOD_DSP_BUFFER_ARRAY *") long outbufferarray, @NativeType("FMOD_BOOL") int inputsidle, @NativeType("FMOD_DSP_PROCESS_OPERATION") int op);

}
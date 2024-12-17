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

/** Callback function: {@link #invoke FMOD_OUTPUT_INIT_CALLBACK} */
@FunctionalInterface
@NativeType("FMOD_OUTPUT_INIT_CALLBACK")
public interface FMOD_OUTPUT_INIT_CALLBACKI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        apiStdcall(),
        ffi_type_uint32,
        ffi_type_pointer, ffi_type_sint32, ffi_type_uint32, ffi_type_pointer, ffi_type_pointer, ffi_type_pointer, ffi_type_pointer, ffi_type_sint32, ffi_type_pointer, ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        int __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetInt(memGetAddress(args + POINTER_SIZE)),
            memGetInt(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 3 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 4 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 5 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 6 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 7 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 8 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 9 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 10 * POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /** {@code FMOD_RESULT (* FMOD_OUTPUT_INIT_CALLBACK) (struct FMOD_OUTPUT_STATE * output_state, int selecteddriver, FMOD_INITFLAGS flags, int * outputrate, FMOD_SPEAKERMODE * speakermode, int * speakermodechannels, FMOD_SOUND_FORMAT * outputformat, int dspbufferlength, int * dspnumbuffers, int * dspnumadditionalbuffers, void * extradriverdata)} */
    @NativeType("FMOD_RESULT") int invoke(@NativeType("struct FMOD_OUTPUT_STATE *") long output_state, int selecteddriver, @NativeType("FMOD_INITFLAGS") int flags, @NativeType("int *") long outputrate, @NativeType("FMOD_SPEAKERMODE *") long speakermode, @NativeType("int *") long speakermodechannels, @NativeType("FMOD_SOUND_FORMAT *") long outputformat, int dspbufferlength, @NativeType("int *") long dspnumbuffers, @NativeType("int *") long dspnumadditionalbuffers, @NativeType("void *") long extradriverdata);

}
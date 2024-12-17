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

/** Callback function: {@link #invoke FMOD_OUTPUT_COPYPORT_FUNC} */
@FunctionalInterface
@NativeType("FMOD_OUTPUT_COPYPORT_FUNC")
public interface FMOD_OUTPUT_COPYPORT_FUNCI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        apiStdcall(),
        ffi_type_uint32,
        ffi_type_pointer, ffi_type_sint32, ffi_type_pointer, ffi_type_uint32
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        int __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetInt(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 3 * POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /** {@code FMOD_RESULT (* FMOD_OUTPUT_COPYPORT_FUNC) (struct FMOD_OUTPUT_STATE * output_state, int portId, void * buffer, unsigned int length)} */
    @NativeType("FMOD_RESULT") int invoke(@NativeType("struct FMOD_OUTPUT_STATE *") long output_state, int portId, @NativeType("void *") long buffer, @NativeType("unsigned int") int length);

}
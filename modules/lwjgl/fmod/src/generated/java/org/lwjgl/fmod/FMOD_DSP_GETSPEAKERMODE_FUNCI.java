/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.fmod;

import org.lwjgl.system.*;

import java.lang.invoke.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Callback function: {@link #invoke FMOD_DSP_GETSPEAKERMODE_FUNC} */
@FunctionalInterface
@NativeType("FMOD_DSP_GETSPEAKERMODE_FUNC")
public interface FMOD_DSP_GETSPEAKERMODE_FUNCI extends CallbackI {

    Callback.Descriptor DESCRIPTOR = new Callback.Descriptor(
        MethodHandles.lookup(),
        apiCreateCIF(
            apiStdcall(),
            ffi_type_uint32,
            ffi_type_pointer, ffi_type_pointer, ffi_type_pointer
        )
    );

    @Override
    default Callback.Descriptor getDescriptor() { return DESCRIPTOR; }

    @Override
    default void callback(long ret, long args) {
        int __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /** {@code FMOD_RESULT (* FMOD_DSP_GETSPEAKERMODE_FUNC) (struct FMOD_DSP_STATE * dsp_state, FMOD_SPEAKERMODE * speakermode_mixer, FMOD_SPEAKERMODE * speakermode_output)} */
    @NativeType("FMOD_RESULT") int invoke(@NativeType("struct FMOD_DSP_STATE *") long dsp_state, @NativeType("FMOD_SPEAKERMODE *") long speakermode_mixer, @NativeType("FMOD_SPEAKERMODE *") long speakermode_output);

}
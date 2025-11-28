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

/** Callback function: {@link #invoke FMOD_CODEC_CLOSE_CALLBACK} */
@FunctionalInterface
@NativeType("FMOD_CODEC_CLOSE_CALLBACK")
public interface FMOD_CODEC_CLOSE_CALLBACKI extends CallbackI {

    Callback.Descriptor DESCRIPTOR = new Callback.Descriptor(
        MethodHandles.lookup(),
        apiCreateCIF(
            apiStdcall(),
            ffi_type_uint32,
            ffi_type_pointer
        )
    );

    @Override
    default Callback.Descriptor getDescriptor() { return DESCRIPTOR; }

    @Override
    default void callback(long ret, long args) {
        int __result = invoke(
            memGetAddress(memGetAddress(args))
        );
        apiClosureRet(ret, __result);
    }

    /** {@code FMOD_RESULT (* FMOD_CODEC_CLOSE_CALLBACK) (struct FMOD_CODEC_STATE * codec_state)} */
    @NativeType("FMOD_RESULT") int invoke(@NativeType("struct FMOD_CODEC_STATE *") long codec_state);

}
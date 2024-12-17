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

/** Callback function: {@link #invoke FMOD_3D_ROLLOFF_CALLBACK} */
@FunctionalInterface
@NativeType("FMOD_3D_ROLLOFF_CALLBACK")
public interface FMOD_3D_ROLLOFF_CALLBACKI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        apiStdcall(),
        ffi_type_float,
        ffi_type_pointer, ffi_type_float
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        float __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetFloat(memGetAddress(args + POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /** {@code float (* FMOD_3D_ROLLOFF_CALLBACK) (FMOD_CHANNELCONTROL * channelcontrol, float distance)} */
    float invoke(@NativeType("FMOD_CHANNELCONTROL *") long channelcontrol, float distance);

}
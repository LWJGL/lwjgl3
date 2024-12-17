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

/** Callback function: {@link #invoke FMOD_CHANNELCONTROL_CALLBACK} */
@FunctionalInterface
@NativeType("FMOD_CHANNELCONTROL_CALLBACK")
public interface FMOD_CHANNELCONTROL_CALLBACKI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        apiStdcall(),
        ffi_type_uint32,
        ffi_type_pointer, ffi_type_uint32, ffi_type_uint32, ffi_type_pointer, ffi_type_pointer
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
            memGetAddress(memGetAddress(args + 4 * POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /** {@code FMOD_RESULT (* FMOD_CHANNELCONTROL_CALLBACK) (FMOD_CHANNELCONTROL * channelcontrol, FMOD_CHANNELCONTROL_TYPE controltype, FMOD_CHANNELCONTROL_CALLBACK_TYPE callbacktype, void * commanddata1, void * commanddata2)} */
    @NativeType("FMOD_RESULT") int invoke(@NativeType("FMOD_CHANNELCONTROL *") long channelcontrol, @NativeType("FMOD_CHANNELCONTROL_TYPE") int controltype, @NativeType("FMOD_CHANNELCONTROL_CALLBACK_TYPE") int callbacktype, @NativeType("void *") long commanddata1, @NativeType("void *") long commanddata2);

}
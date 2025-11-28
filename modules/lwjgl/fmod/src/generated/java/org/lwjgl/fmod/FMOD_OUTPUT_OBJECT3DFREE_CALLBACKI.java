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

/** Callback function: {@link #invoke FMOD_OUTPUT_OBJECT3DFREE_CALLBACK} */
@FunctionalInterface
@NativeType("FMOD_OUTPUT_OBJECT3DFREE_CALLBACK")
public interface FMOD_OUTPUT_OBJECT3DFREE_CALLBACKI extends CallbackI {

    Callback.Descriptor DESCRIPTOR = new Callback.Descriptor(
        MethodHandles.lookup(),
        apiCreateCIF(
            apiStdcall(),
            ffi_type_uint32,
            ffi_type_pointer, ffi_type_pointer
        )
    );

    @Override
    default Callback.Descriptor getDescriptor() { return DESCRIPTOR; }

    @Override
    default void callback(long ret, long args) {
        int __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /** {@code FMOD_RESULT (* FMOD_OUTPUT_OBJECT3DFREE_CALLBACK) (struct FMOD_OUTPUT_STATE * output_state, void * object3d)} */
    @NativeType("FMOD_RESULT") int invoke(@NativeType("struct FMOD_OUTPUT_STATE *") long output_state, @NativeType("void *") long object3d);

}
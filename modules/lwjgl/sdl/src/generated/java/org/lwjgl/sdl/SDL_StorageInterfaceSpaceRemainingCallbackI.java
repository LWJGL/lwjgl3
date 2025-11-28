/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.lwjgl.system.*;

import java.lang.invoke.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Callback function: {@link #invoke (* anonymous)} */
@FunctionalInterface
@NativeType("Uint64 (*) (void *)")
public interface SDL_StorageInterfaceSpaceRemainingCallbackI extends CallbackI {

    Callback.Descriptor DESCRIPTOR = new Callback.Descriptor(
        MethodHandles.lookup(),
        apiCreateCIF(
            ffi_type_uint64,
            ffi_type_pointer
        )
    );

    @Override
    default Callback.Descriptor getDescriptor() { return DESCRIPTOR; }

    @Override
    default void callback(long ret, long args) {
        long __result = invoke(
            memGetAddress(memGetAddress(args))
        );
        apiClosureRetL(ret, __result);
    }

    /** {@code Uint64 (*) (void * userdata)} */
    @NativeType("Uint64") long invoke(@NativeType("void *") long userdata);

}
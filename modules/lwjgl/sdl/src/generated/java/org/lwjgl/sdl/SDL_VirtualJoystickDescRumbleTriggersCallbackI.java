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
@NativeType("bool (*) (void *, Uint16, Uint16)")
public interface SDL_VirtualJoystickDescRumbleTriggersCallbackI extends CallbackI {

    Callback.Descriptor DESCRIPTOR = new Callback.Descriptor(
        MethodHandles.lookup(),
        apiCreateCIF(
            ffi_type_uint8,
            ffi_type_pointer, ffi_type_uint16, ffi_type_uint16
        )
    );

    @Override
    default Callback.Descriptor getDescriptor() { return DESCRIPTOR; }

    @Override
    default void callback(long ret, long args) {
        boolean __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetShort(memGetAddress(args + POINTER_SIZE)),
            memGetShort(memGetAddress(args + 2 * POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /** {@code bool (*) (void * userdata, Uint16 left_rumble, Uint16 right_rumble)} */
    @NativeType("bool") boolean invoke(@NativeType("void *") long userdata, @NativeType("Uint16") short left_rumble, @NativeType("Uint16") short right_rumble);

}
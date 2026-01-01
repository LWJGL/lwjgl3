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

/** Callback function: {@link #invoke SDL_MouseMotionTransformCallback} */
@FunctionalInterface
@NativeType("SDL_MouseMotionTransformCallback")
public interface SDL_MouseMotionTransformCallbackI extends CallbackI {

    Callback.Descriptor DESCRIPTOR = new Callback.Descriptor(
        MethodHandles.lookup(),
        apiCreateCIF(
            ffi_type_void,
            ffi_type_pointer, ffi_type_uint64, ffi_type_pointer, ffi_type_uint32, ffi_type_pointer, ffi_type_pointer
        )
    );

    @Override
    default Callback.Descriptor getDescriptor() { return DESCRIPTOR; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetAddress(memGetAddress(args)),
            memGetLong(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 3 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 4 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 5 * POINTER_SIZE))
        );
    }

    /** {@code void (* SDL_MouseMotionTransformCallback) (void * userdata, Uint64 timestamp, SDL_Window * window, SDL_MouseID mouseID, float * x, float * y)} */
    void invoke(@NativeType("void *") long userdata, @NativeType("Uint64") long timestamp, @NativeType("SDL_Window *") long window, @NativeType("SDL_MouseID") int mouseID, @NativeType("float *") long x, @NativeType("float *") long y);

}
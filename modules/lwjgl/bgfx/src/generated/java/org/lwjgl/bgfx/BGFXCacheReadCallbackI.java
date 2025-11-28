/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import org.lwjgl.system.*;

import java.lang.invoke.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Callback function: {@link #invoke (* anonymous)} */
@FunctionalInterface
@NativeType("bool (*) (bgfx_callback_interface_t *, uint64_t, void *, uint32_t)")
public interface BGFXCacheReadCallbackI extends CallbackI {

    Callback.Descriptor DESCRIPTOR = new Callback.Descriptor(
        MethodHandles.lookup(),
        apiCreateCIF(
            ffi_type_uint8,
            ffi_type_pointer, ffi_type_uint64, ffi_type_pointer, ffi_type_uint32
        )
    );

    @Override
    default Callback.Descriptor getDescriptor() { return DESCRIPTOR; }

    @Override
    default void callback(long ret, long args) {
        boolean __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetLong(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 3 * POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /** {@code bool (*) (bgfx_callback_interface_t * _this, uint64_t _id, void * _data, uint32_t _size)} */
    @NativeType("bool") boolean invoke(@NativeType("bgfx_callback_interface_t *") long _this, @NativeType("uint64_t") long _id, @NativeType("void *") long _data, @NativeType("uint32_t") int _size);

}
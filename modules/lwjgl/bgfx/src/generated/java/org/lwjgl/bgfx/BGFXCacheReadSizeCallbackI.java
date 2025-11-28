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
@NativeType("uint32_t (*) (bgfx_callback_interface_t *, uint64_t)")
public interface BGFXCacheReadSizeCallbackI extends CallbackI {

    Callback.Descriptor DESCRIPTOR = new Callback.Descriptor(
        MethodHandles.lookup(),
        apiCreateCIF(
            ffi_type_uint32,
            ffi_type_pointer, ffi_type_uint64
        )
    );

    @Override
    default Callback.Descriptor getDescriptor() { return DESCRIPTOR; }

    @Override
    default void callback(long ret, long args) {
        int __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetLong(memGetAddress(args + POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /** {@code uint32_t (*) (bgfx_callback_interface_t * _this, uint64_t _id)} */
    @NativeType("uint32_t") int invoke(@NativeType("bgfx_callback_interface_t *") long _this, @NativeType("uint64_t") long _id);

}
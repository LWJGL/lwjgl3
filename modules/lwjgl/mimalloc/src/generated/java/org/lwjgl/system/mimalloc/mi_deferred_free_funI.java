/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.mimalloc;

import org.lwjgl.system.*;

import java.lang.invoke.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Callback function: {@link #invoke mi_deferred_free_fun} */
@FunctionalInterface
@NativeType("mi_deferred_free_fun")
public interface mi_deferred_free_funI extends CallbackI {

    Callback.Descriptor DESCRIPTOR = new Callback.Descriptor(
        mi_deferred_free_funI.class,
        MethodHandles.lookup(),
        apiCreateCIF(
            ffi_type_void,
            ffi_type_uint8, ffi_type_uint64, ffi_type_pointer
        )
    );

    @Override
    default Callback.Descriptor getDescriptor() { return DESCRIPTOR; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetByte(memGetAddress(args)) != 0,
            memGetLong(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE))
        );
    }

    /** {@code void (* mi_deferred_free_fun) (bool force, unsigned long long heartbeat, void * arg)} */
    void invoke(@NativeType("bool") boolean force, @NativeType("unsigned long long") long heartbeat, @NativeType("void *") long arg);

}
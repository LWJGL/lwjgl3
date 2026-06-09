/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.tinyexr;

import org.lwjgl.system.*;

import java.lang.invoke.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Callback function: {@link #invoke ExrWriteCallback} */
@FunctionalInterface
@NativeType("ExrWriteCallback")
public interface ExrWriteCallbackI extends CallbackI {

    Callback.Descriptor DESCRIPTOR = new Callback.Descriptor(
        ExrWriteCallbackI.class,
        MethodHandles.lookup(),
        apiCreateCIF(
            ffi_type_uint32,
            ffi_type_pointer, ffi_type_uint64, ffi_type_pointer, ffi_type_uint64, ffi_type_pointer, ffi_type_pointer
        )
    );

    @Override
    default Callback.Descriptor getDescriptor() { return DESCRIPTOR; }

    @Override
    default void callback(long ret, long args) {
        int __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetLong(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetLong(memGetAddress(args + 3 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 4 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 5 * POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /** {@code ExrResult (* ExrWriteCallback) (void * userdata, uint64_t offset, void const * data, uint64_t size, ExrFetchComplete on_complete, void * complete_userdata)} */
    @NativeType("ExrResult") int invoke(@NativeType("void *") long userdata, @NativeType("uint64_t") long offset, @NativeType("void const *") long data, @NativeType("uint64_t") long size, @NativeType("ExrFetchComplete") long on_complete, @NativeType("void *") long complete_userdata);

}
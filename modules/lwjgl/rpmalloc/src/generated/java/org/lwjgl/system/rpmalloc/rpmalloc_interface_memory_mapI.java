/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.rpmalloc;

import org.lwjgl.system.*;

import java.lang.invoke.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Callback function: {@link #invoke (* anonymous)} */
@FunctionalInterface
@NativeType("void * (*) (size_t, size_t, size_t *, size_t *)")
public interface rpmalloc_interface_memory_mapI extends CallbackI {

    Callback.Descriptor DESCRIPTOR = new Callback.Descriptor(
        rpmalloc_interface_memory_mapI.class,
        MethodHandles.lookup(),
        apiCreateCIF(
            ffi_type_pointer,
            ffi_type_pointer, ffi_type_pointer, ffi_type_pointer, ffi_type_pointer
        )
    );

    @Override
    default Callback.Descriptor getDescriptor() { return DESCRIPTOR; }

    @Override
    default void callback(long ret, long args) {
        long __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 3 * POINTER_SIZE))
        );
        apiClosureRetP(ret, __result);
    }

    /** {@code void * (*) (size_t size, size_t alignment, size_t * offset, size_t * mapped_size)} */
    @NativeType("void *") long invoke(@NativeType("size_t") long size, @NativeType("size_t") long alignment, @NativeType("size_t *") long offset, @NativeType("size_t *") long mapped_size);

}
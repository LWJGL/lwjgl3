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

/** Callback function: {@link #invoke mi_block_visit_fun} */
@FunctionalInterface
@NativeType("mi_block_visit_fun")
public interface mi_block_visit_funI extends CallbackI {

    Callback.Descriptor DESCRIPTOR = new Callback.Descriptor(
        mi_block_visit_funI.class,
        MethodHandles.lookup(),
        apiCreateCIF(
            ffi_type_uint8,
            ffi_type_pointer, ffi_type_pointer, ffi_type_pointer, ffi_type_pointer, ffi_type_pointer
        )
    );

    @Override
    default Callback.Descriptor getDescriptor() { return DESCRIPTOR; }

    @Override
    default void callback(long ret, long args) {
        boolean __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 3 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 4 * POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /** {@code bool (* mi_block_visit_fun) (mi_heap_t const * heap, mi_heap_area_t const * area, void * block, size_t block_size, void * arg)} */
    @NativeType("bool") boolean invoke(@NativeType("mi_heap_t const *") long heap, @NativeType("mi_heap_area_t const *") long area, @NativeType("void *") long block, @NativeType("size_t") long block_size, @NativeType("void *") long arg);

}
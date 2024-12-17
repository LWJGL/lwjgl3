/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.harfbuzz;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Callback function: {@link #invoke hb_get_table_tags_func_t} */
@FunctionalInterface
@NativeType("hb_get_table_tags_func_t")
public interface hb_get_table_tags_func_tI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_uint32,
        ffi_type_pointer, ffi_type_uint32, ffi_type_pointer, ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        int __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetInt(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 3 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 4 * POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /** {@code unsigned int (* hb_get_table_tags_func_t) (hb_face_t const * face, unsigned int start_offset, unsigned int * table_count, hb_tag_t * table_tags, void * user_data)} */
    @NativeType("unsigned int") int invoke(@NativeType("hb_face_t const *") long face, @NativeType("unsigned int") int start_offset, @NativeType("unsigned int *") long table_count, @NativeType("hb_tag_t *") long table_tags, @NativeType("void *") long user_data);

}
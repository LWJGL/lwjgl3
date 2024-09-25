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

/**
 * <h3>Type</h3>
 * 
 * <pre><code>
 * unsigned int (*{@link #invoke}) (
 *     hb_face_t const *face,
 *     unsigned int start_offset,
 *     unsigned int *table_count,
 *     hb_tag_t *table_tags,
 *     void *user_data
 * )</code></pre>
 */
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

    /**
     * Callback function for {@link HarfBuzz#hb_face_get_table_tags face_get_table_tags}.
     * 
     * <p>Return value: Total number of tables, or zero if it is not possible to list.</p>
     *
     * @param face         a face object
     * @param start_offset the index of first table tag to retrieve
     * @param table_count  Input = the maximum number of table tags to return; Output = the actual number of table tags returned (may be zero)
     * @param table_tags   (out) (array length={@code table_count}): The array of table tags found
     * @param user_data    user data pointer passed by the caller
     *
     * @since 10.0.0
     */
    @NativeType("unsigned int") int invoke(@NativeType("hb_face_t const *") long face, @NativeType("unsigned int") int start_offset, @NativeType("unsigned int *") long table_count, @NativeType("hb_tag_t *") long table_tags, @NativeType("void *") long user_data);

}
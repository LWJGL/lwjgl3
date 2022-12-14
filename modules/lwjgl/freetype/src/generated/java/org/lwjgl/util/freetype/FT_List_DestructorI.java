/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/**
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*{@link #invoke}) (
 *     FT_Memory memory,
 *     void *data,
 *     void *user
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("FT_List_Destructor")
public interface FT_List_DestructorI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_void,
        ffi_type_pointer, ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE))
        );
    }

    /** An {@code FT_List} iterator function that is called during a list finalization by {@link FreeType#FT_List_Finalize List_Finalize} to destroy all elements in a given list. */
    void invoke(@NativeType("FT_Memory") long memory, @NativeType("void *") long data, @NativeType("void *") long user);

}
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
 * void * (*{@link #invoke}) (
 *     FT_Memory memory,
 *     long cur_size,
 *     long new_size,
 *     void *block
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("FT_Realloc_Func")
public interface FT_Realloc_FuncI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_pointer,
        ffi_type_pointer, ffi_type_slong, ffi_type_slong, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        long __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetCLong(memGetAddress(args + POINTER_SIZE)),
            memGetCLong(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 3 * POINTER_SIZE))
        );
        apiClosureRetP(ret, __result);
    }

    /** A function used to re-allocate a given block of memory. */
    @NativeType("void *") long invoke(@NativeType("FT_Memory") long memory, long cur_size, long new_size, @NativeType("void *") long block);

}
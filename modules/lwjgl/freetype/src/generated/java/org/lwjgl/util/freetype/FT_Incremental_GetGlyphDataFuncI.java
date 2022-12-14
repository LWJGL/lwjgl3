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
 * FT_Error (*{@link #invoke}) (
 *     FT_Incremental incremental,
 *     FT_UInt glyph_index,
 *     FT_Data *adata
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("FT_Incremental_GetGlyphDataFunc")
public interface FT_Incremental_GetGlyphDataFuncI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_sint32,
        ffi_type_pointer, ffi_type_uint32, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        int __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetInt(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /** A function called by FreeType to access a given glyph's data bytes during {@link FreeType#FT_Load_Glyph Load_Glyph} or {@link FreeType#FT_Load_Char Load_Char} if incremental loading is enabled. */
    @NativeType("FT_Error") int invoke(@NativeType("FT_Incremental") long incremental, @NativeType("FT_UInt") int glyph_index, @NativeType("FT_Data *") long adata);

}
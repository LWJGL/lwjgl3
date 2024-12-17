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

/** Callback function: {@link #invoke FT_Incremental_GetGlyphMetricsFunc} */
@FunctionalInterface
@NativeType("FT_Incremental_GetGlyphMetricsFunc")
public interface FT_Incremental_GetGlyphMetricsFuncI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_sint32,
        ffi_type_pointer, ffi_type_uint32, ffi_type_uint8, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        int __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetInt(memGetAddress(args + POINTER_SIZE)),
            memGetByte(memGetAddress(args + 2 * POINTER_SIZE)) != 0,
            memGetAddress(memGetAddress(args + 3 * POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /** {@code FT_Error (* FT_Incremental_GetGlyphMetricsFunc) (FT_Incremental incremental, FT_UInt glyph_index, FT_Bool vertical, FT_Incremental_MetricsRec * ametrics)} */
    @NativeType("FT_Error") int invoke(@NativeType("FT_Incremental") long incremental, @NativeType("FT_UInt") int glyph_index, @NativeType("FT_Bool") boolean vertical, @NativeType("FT_Incremental_MetricsRec *") long ametrics);

}
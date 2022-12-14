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
 * int (*{@link #invoke}) (
 *     FT_Raster raster,
 *     FT_Raster_Params const *params
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("FT_Raster_RenderFunc")
public interface FT_Raster_RenderFuncI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_sint32,
        ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        int __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /** Invoke a given raster to scan-convert a given glyph image into a target bitmap. */
    int invoke(@NativeType("FT_Raster") long raster, @NativeType("FT_Raster_Params const *") long params);

}
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
 *     FT_Incremental incremental,
 *     FT_Data *data
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("FT_Incremental_FreeGlyphDataFunc")
public interface FT_Incremental_FreeGlyphDataFuncI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_void,
        ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE))
        );
    }

    /** A function used to release the glyph data bytes returned by a successful call to {@link FT_Incremental_GetGlyphDataFunc}. */
    void invoke(@NativeType("FT_Incremental") long incremental, @NativeType("FT_Data *") long data);

}
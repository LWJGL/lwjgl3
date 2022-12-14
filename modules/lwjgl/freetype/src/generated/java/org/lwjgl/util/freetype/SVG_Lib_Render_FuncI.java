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
 *     FT_GlyphSlot slot,
 *     FT_Pointer *data_pointer
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("SVG_Lib_Render_Func")
public interface SVG_Lib_Render_FuncI extends CallbackI {

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

    /** A callback that is called to render an OT-SVG glyph. */
    @NativeType("FT_Error") int invoke(@NativeType("FT_GlyphSlot") long slot, @NativeType("FT_Pointer *") long data_pointer);

}
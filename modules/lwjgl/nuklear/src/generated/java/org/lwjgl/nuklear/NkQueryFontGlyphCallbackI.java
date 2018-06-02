/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * Instances of this interface may be set to the {@link NkUserFont} struct.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     nk_handle handle,
 *     float font_height,
 *     struct nk_user_font_glyph *glyph,
 *     nk_rune codepoint,
 *     nk_rune next_codepoint
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("nk_query_font_glyph_f")
public interface NkQueryFontGlyphCallbackI extends CallbackI.V {

    String SIGNATURE = "(pfpii)v";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default void callback(long args) {
        invoke(
            dcbArgPointer(args),
            dcbArgFloat(args),
            dcbArgPointer(args),
            dcbArgInt(args),
            dcbArgInt(args)
        );
    }

    void invoke(@NativeType("nk_handle") long handle, float font_height, @NativeType("struct nk_user_font_glyph *") long glyph, @NativeType("nk_rune") int codepoint, @NativeType("nk_rune") int next_codepoint);

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke nk_query_font_glyph_f} */
public abstract class NkQueryFontGlyphCallback extends Callback implements NkQueryFontGlyphCallbackI {

    /**
     * Creates a {@code NkQueryFontGlyphCallback} instance from the specified function pointer.
     *
     * @return the new {@code NkQueryFontGlyphCallback}
     */
    public static NkQueryFontGlyphCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable NkQueryFontGlyphCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code NkQueryFontGlyphCallback} instance that delegates to the specified {@code NkQueryFontGlyphCallbackI} instance. */
    public static NkQueryFontGlyphCallback create(NkQueryFontGlyphCallbackI instance) { return create(instance, instance.address()); }

    private static NkQueryFontGlyphCallback create(NkQueryFontGlyphCallbackI instance, long functionPointer) {
        return instance instanceof NkQueryFontGlyphCallback
            ? (NkQueryFontGlyphCallback)instance
            : new NkQueryFontGlyphCallback(functionPointer) {
                @Override public void invoke(long handle, float font_height, long glyph, int codepoint, int next_codepoint) {
                    instance.invoke(handle, font_height, glyph, codepoint, next_codepoint);
                }
            };
    }

    protected NkQueryFontGlyphCallback() {
        super(DESCRIPTOR);
    }

    NkQueryFontGlyphCallback(long functionPointer) {
        super(functionPointer);
    }

}
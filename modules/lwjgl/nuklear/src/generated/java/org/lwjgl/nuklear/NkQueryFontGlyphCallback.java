/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Instances of this class may be set to the {@link NkUserFont} struct.
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
public abstract class NkQueryFontGlyphCallback extends Callback implements NkQueryFontGlyphCallbackI {

    /**
     * Creates a {@code NkQueryFontGlyphCallback} instance from the specified function pointer.
     *
     * @return the new {@code NkQueryFontGlyphCallback}
     */
    public static NkQueryFontGlyphCallback create(long functionPointer) {
        NkQueryFontGlyphCallbackI instance = Callback.get(functionPointer);
        return instance instanceof NkQueryFontGlyphCallback
            ? (NkQueryFontGlyphCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static NkQueryFontGlyphCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code NkQueryFontGlyphCallback} instance that delegates to the specified {@code NkQueryFontGlyphCallbackI} instance. */
    public static NkQueryFontGlyphCallback create(NkQueryFontGlyphCallbackI instance) {
        return instance instanceof NkQueryFontGlyphCallback
            ? (NkQueryFontGlyphCallback)instance
            : new Container(instance.address(), instance);
    }

    protected NkQueryFontGlyphCallback() {
        super(CIF);
    }

    NkQueryFontGlyphCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends NkQueryFontGlyphCallback {

        private final NkQueryFontGlyphCallbackI delegate;

        Container(long functionPointer, NkQueryFontGlyphCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long handle, float font_height, long glyph, int codepoint, int next_codepoint) {
            delegate.invoke(handle, font_height, glyph, codepoint, next_codepoint);
        }

    }

}
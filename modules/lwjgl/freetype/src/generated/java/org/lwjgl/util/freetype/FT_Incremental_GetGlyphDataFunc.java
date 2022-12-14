/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

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
public abstract class FT_Incremental_GetGlyphDataFunc extends Callback implements FT_Incremental_GetGlyphDataFuncI {

    /**
     * Creates a {@code FT_Incremental_GetGlyphDataFunc} instance from the specified function pointer.
     *
     * @return the new {@code FT_Incremental_GetGlyphDataFunc}
     */
    public static FT_Incremental_GetGlyphDataFunc create(long functionPointer) {
        FT_Incremental_GetGlyphDataFuncI instance = Callback.get(functionPointer);
        return instance instanceof FT_Incremental_GetGlyphDataFunc
            ? (FT_Incremental_GetGlyphDataFunc)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static FT_Incremental_GetGlyphDataFunc createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code FT_Incremental_GetGlyphDataFunc} instance that delegates to the specified {@code FT_Incremental_GetGlyphDataFuncI} instance. */
    public static FT_Incremental_GetGlyphDataFunc create(FT_Incremental_GetGlyphDataFuncI instance) {
        return instance instanceof FT_Incremental_GetGlyphDataFunc
            ? (FT_Incremental_GetGlyphDataFunc)instance
            : new Container(instance.address(), instance);
    }

    protected FT_Incremental_GetGlyphDataFunc() {
        super(CIF);
    }

    FT_Incremental_GetGlyphDataFunc(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends FT_Incremental_GetGlyphDataFunc {

        private final FT_Incremental_GetGlyphDataFuncI delegate;

        Container(long functionPointer, FT_Incremental_GetGlyphDataFuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long incremental, int glyph_index, long adata) {
            return delegate.invoke(incremental, glyph_index, adata);
        }

    }

}
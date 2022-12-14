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
 *     FT_Bool vertical,
 *     FT_Incremental_MetricsRec *ametrics
 * )</code></pre>
 */
public abstract class FT_Incremental_GetGlyphMetricsFunc extends Callback implements FT_Incremental_GetGlyphMetricsFuncI {

    /**
     * Creates a {@code FT_Incremental_GetGlyphMetricsFunc} instance from the specified function pointer.
     *
     * @return the new {@code FT_Incremental_GetGlyphMetricsFunc}
     */
    public static FT_Incremental_GetGlyphMetricsFunc create(long functionPointer) {
        FT_Incremental_GetGlyphMetricsFuncI instance = Callback.get(functionPointer);
        return instance instanceof FT_Incremental_GetGlyphMetricsFunc
            ? (FT_Incremental_GetGlyphMetricsFunc)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static FT_Incremental_GetGlyphMetricsFunc createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code FT_Incremental_GetGlyphMetricsFunc} instance that delegates to the specified {@code FT_Incremental_GetGlyphMetricsFuncI} instance. */
    public static FT_Incremental_GetGlyphMetricsFunc create(FT_Incremental_GetGlyphMetricsFuncI instance) {
        return instance instanceof FT_Incremental_GetGlyphMetricsFunc
            ? (FT_Incremental_GetGlyphMetricsFunc)instance
            : new Container(instance.address(), instance);
    }

    protected FT_Incremental_GetGlyphMetricsFunc() {
        super(CIF);
    }

    FT_Incremental_GetGlyphMetricsFunc(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends FT_Incremental_GetGlyphMetricsFunc {

        private final FT_Incremental_GetGlyphMetricsFuncI delegate;

        Container(long functionPointer, FT_Incremental_GetGlyphMetricsFuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long incremental, int glyph_index, boolean vertical, long ametrics) {
            return delegate.invoke(incremental, glyph_index, vertical, ametrics);
        }

    }

}
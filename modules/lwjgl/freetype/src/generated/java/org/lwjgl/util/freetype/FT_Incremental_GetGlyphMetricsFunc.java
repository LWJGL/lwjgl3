/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke FT_Incremental_GetGlyphMetricsFunc} */
public abstract class FT_Incremental_GetGlyphMetricsFunc extends Callback implements FT_Incremental_GetGlyphMetricsFuncI {

    /**
     * Creates a {@code FT_Incremental_GetGlyphMetricsFunc} instance from the specified function pointer.
     *
     * @return the new {@code FT_Incremental_GetGlyphMetricsFunc}
     */
    public static FT_Incremental_GetGlyphMetricsFunc create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable FT_Incremental_GetGlyphMetricsFunc createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code FT_Incremental_GetGlyphMetricsFunc} instance that delegates to the specified {@code FT_Incremental_GetGlyphMetricsFuncI} instance. */
    public static FT_Incremental_GetGlyphMetricsFunc create(FT_Incremental_GetGlyphMetricsFuncI instance) { return create(instance, instance.address()); }

    private static FT_Incremental_GetGlyphMetricsFunc create(FT_Incremental_GetGlyphMetricsFuncI instance, long functionPointer) {
        return instance instanceof FT_Incremental_GetGlyphMetricsFunc
            ? (FT_Incremental_GetGlyphMetricsFunc)instance
            : new FT_Incremental_GetGlyphMetricsFunc(functionPointer) {
                @Override public int invoke(long incremental, int glyph_index, boolean vertical, long ametrics) {
                    return instance.invoke(incremental, glyph_index, vertical, ametrics);
                }
            };
    }

    protected FT_Incremental_GetGlyphMetricsFunc() {
        super(DESCRIPTOR);
    }

    FT_Incremental_GetGlyphMetricsFunc(long functionPointer) {
        super(functionPointer);
    }

}
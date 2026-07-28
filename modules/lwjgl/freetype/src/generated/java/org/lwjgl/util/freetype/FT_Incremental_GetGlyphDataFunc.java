/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke FT_Incremental_GetGlyphDataFunc} */
public abstract class FT_Incremental_GetGlyphDataFunc extends Callback implements FT_Incremental_GetGlyphDataFuncI {

    /**
     * Creates a {@code FT_Incremental_GetGlyphDataFunc} instance from the specified function pointer.
     *
     * @return the new {@code FT_Incremental_GetGlyphDataFunc}
     */
    public static FT_Incremental_GetGlyphDataFunc create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable FT_Incremental_GetGlyphDataFunc createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code FT_Incremental_GetGlyphDataFunc} instance that delegates to the specified {@code FT_Incremental_GetGlyphDataFuncI} instance. */
    public static FT_Incremental_GetGlyphDataFunc create(FT_Incremental_GetGlyphDataFuncI instance) { return create(instance, instance.address()); }

    private static FT_Incremental_GetGlyphDataFunc create(FT_Incremental_GetGlyphDataFuncI instance, long functionPointer) {
        return instance instanceof FT_Incremental_GetGlyphDataFunc
            ? (FT_Incremental_GetGlyphDataFunc)instance
            : new FT_Incremental_GetGlyphDataFunc(functionPointer) {
                @Override public int invoke(long incremental, int glyph_index, long adata) {
                    return instance.invoke(incremental, glyph_index, adata);
                }
            };
    }

    protected FT_Incremental_GetGlyphDataFunc() {
        super(DESCRIPTOR);
    }

    FT_Incremental_GetGlyphDataFunc(long functionPointer) {
        super(functionPointer);
    }

}
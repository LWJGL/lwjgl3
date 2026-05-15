/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke FT_Incremental_FreeGlyphDataFunc} */
public abstract class FT_Incremental_FreeGlyphDataFunc extends Callback implements FT_Incremental_FreeGlyphDataFuncI {

    /**
     * Creates a {@code FT_Incremental_FreeGlyphDataFunc} instance from the specified function pointer.
     *
     * @return the new {@code FT_Incremental_FreeGlyphDataFunc}
     */
    public static FT_Incremental_FreeGlyphDataFunc create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable FT_Incremental_FreeGlyphDataFunc createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code FT_Incremental_FreeGlyphDataFunc} instance that delegates to the specified {@code FT_Incremental_FreeGlyphDataFuncI} instance. */
    public static FT_Incremental_FreeGlyphDataFunc create(FT_Incremental_FreeGlyphDataFuncI instance) { return create(instance, instance.address()); }

    private static FT_Incremental_FreeGlyphDataFunc create(FT_Incremental_FreeGlyphDataFuncI instance, long functionPointer) {
        return instance instanceof FT_Incremental_FreeGlyphDataFunc
            ? (FT_Incremental_FreeGlyphDataFunc)instance
            : new FT_Incremental_FreeGlyphDataFunc(functionPointer) {
                @Override public void invoke(long incremental, long data) {
                    instance.invoke(incremental, data);
                }
            };
    }

    protected FT_Incremental_FreeGlyphDataFunc() {
        super(DESCRIPTOR);
    }

    FT_Incremental_FreeGlyphDataFunc(long functionPointer) {
        super(functionPointer);
    }

}
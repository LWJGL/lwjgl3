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
 * void (*{@link #invoke}) (
 *     FT_Incremental incremental,
 *     FT_Data *data
 * )</code></pre>
 */
public abstract class FT_Incremental_FreeGlyphDataFunc extends Callback implements FT_Incremental_FreeGlyphDataFuncI {

    /**
     * Creates a {@code FT_Incremental_FreeGlyphDataFunc} instance from the specified function pointer.
     *
     * @return the new {@code FT_Incremental_FreeGlyphDataFunc}
     */
    public static FT_Incremental_FreeGlyphDataFunc create(long functionPointer) {
        FT_Incremental_FreeGlyphDataFuncI instance = Callback.get(functionPointer);
        return instance instanceof FT_Incremental_FreeGlyphDataFunc
            ? (FT_Incremental_FreeGlyphDataFunc)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static FT_Incremental_FreeGlyphDataFunc createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code FT_Incremental_FreeGlyphDataFunc} instance that delegates to the specified {@code FT_Incremental_FreeGlyphDataFuncI} instance. */
    public static FT_Incremental_FreeGlyphDataFunc create(FT_Incremental_FreeGlyphDataFuncI instance) {
        return instance instanceof FT_Incremental_FreeGlyphDataFunc
            ? (FT_Incremental_FreeGlyphDataFunc)instance
            : new Container(instance.address(), instance);
    }

    protected FT_Incremental_FreeGlyphDataFunc() {
        super(CIF);
    }

    FT_Incremental_FreeGlyphDataFunc(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends FT_Incremental_FreeGlyphDataFunc {

        private final FT_Incremental_FreeGlyphDataFuncI delegate;

        Container(long functionPointer, FT_Incremental_FreeGlyphDataFuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long incremental, long data) {
            delegate.invoke(incremental, data);
        }

    }

}
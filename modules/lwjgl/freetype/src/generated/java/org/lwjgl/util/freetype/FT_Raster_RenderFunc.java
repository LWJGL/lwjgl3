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
 * int (*{@link #invoke}) (
 *     FT_Raster raster,
 *     FT_Raster_Params const *params
 * )</code></pre>
 */
public abstract class FT_Raster_RenderFunc extends Callback implements FT_Raster_RenderFuncI {

    /**
     * Creates a {@code FT_Raster_RenderFunc} instance from the specified function pointer.
     *
     * @return the new {@code FT_Raster_RenderFunc}
     */
    public static FT_Raster_RenderFunc create(long functionPointer) {
        FT_Raster_RenderFuncI instance = Callback.get(functionPointer);
        return instance instanceof FT_Raster_RenderFunc
            ? (FT_Raster_RenderFunc)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static FT_Raster_RenderFunc createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code FT_Raster_RenderFunc} instance that delegates to the specified {@code FT_Raster_RenderFuncI} instance. */
    public static FT_Raster_RenderFunc create(FT_Raster_RenderFuncI instance) {
        return instance instanceof FT_Raster_RenderFunc
            ? (FT_Raster_RenderFunc)instance
            : new Container(instance.address(), instance);
    }

    protected FT_Raster_RenderFunc() {
        super(CIF);
    }

    FT_Raster_RenderFunc(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends FT_Raster_RenderFunc {

        private final FT_Raster_RenderFuncI delegate;

        Container(long functionPointer, FT_Raster_RenderFuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long raster, long params) {
            return delegate.invoke(raster, params);
        }

    }

}
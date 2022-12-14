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
 *     FT_Raster raster,
 *     unsigned char *pool_base,
 *     unsigned long pool_size
 * )</code></pre>
 */
public abstract class FT_Raster_ResetFunc extends Callback implements FT_Raster_ResetFuncI {

    /**
     * Creates a {@code FT_Raster_ResetFunc} instance from the specified function pointer.
     *
     * @return the new {@code FT_Raster_ResetFunc}
     */
    public static FT_Raster_ResetFunc create(long functionPointer) {
        FT_Raster_ResetFuncI instance = Callback.get(functionPointer);
        return instance instanceof FT_Raster_ResetFunc
            ? (FT_Raster_ResetFunc)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static FT_Raster_ResetFunc createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code FT_Raster_ResetFunc} instance that delegates to the specified {@code FT_Raster_ResetFuncI} instance. */
    public static FT_Raster_ResetFunc create(FT_Raster_ResetFuncI instance) {
        return instance instanceof FT_Raster_ResetFunc
            ? (FT_Raster_ResetFunc)instance
            : new Container(instance.address(), instance);
    }

    protected FT_Raster_ResetFunc() {
        super(CIF);
    }

    FT_Raster_ResetFunc(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends FT_Raster_ResetFunc {

        private final FT_Raster_ResetFuncI delegate;

        Container(long functionPointer, FT_Raster_ResetFuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long raster, long pool_base, long pool_size) {
            delegate.invoke(raster, pool_base, pool_size);
        }

    }

}
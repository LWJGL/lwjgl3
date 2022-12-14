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
 *     FT_Raster raster
 * )</code></pre>
 */
public abstract class FT_Raster_DoneFunc extends Callback implements FT_Raster_DoneFuncI {

    /**
     * Creates a {@code FT_Raster_DoneFunc} instance from the specified function pointer.
     *
     * @return the new {@code FT_Raster_DoneFunc}
     */
    public static FT_Raster_DoneFunc create(long functionPointer) {
        FT_Raster_DoneFuncI instance = Callback.get(functionPointer);
        return instance instanceof FT_Raster_DoneFunc
            ? (FT_Raster_DoneFunc)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static FT_Raster_DoneFunc createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code FT_Raster_DoneFunc} instance that delegates to the specified {@code FT_Raster_DoneFuncI} instance. */
    public static FT_Raster_DoneFunc create(FT_Raster_DoneFuncI instance) {
        return instance instanceof FT_Raster_DoneFunc
            ? (FT_Raster_DoneFunc)instance
            : new Container(instance.address(), instance);
    }

    protected FT_Raster_DoneFunc() {
        super(CIF);
    }

    FT_Raster_DoneFunc(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends FT_Raster_DoneFunc {

        private final FT_Raster_DoneFuncI delegate;

        Container(long functionPointer, FT_Raster_DoneFuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long raster) {
            delegate.invoke(raster);
        }

    }

}
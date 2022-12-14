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
 *     unsigned long mode,
 *     void *args
 * )</code></pre>
 */
public abstract class FT_Raster_SetModeFunc extends Callback implements FT_Raster_SetModeFuncI {

    /**
     * Creates a {@code FT_Raster_SetModeFunc} instance from the specified function pointer.
     *
     * @return the new {@code FT_Raster_SetModeFunc}
     */
    public static FT_Raster_SetModeFunc create(long functionPointer) {
        FT_Raster_SetModeFuncI instance = Callback.get(functionPointer);
        return instance instanceof FT_Raster_SetModeFunc
            ? (FT_Raster_SetModeFunc)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static FT_Raster_SetModeFunc createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code FT_Raster_SetModeFunc} instance that delegates to the specified {@code FT_Raster_SetModeFuncI} instance. */
    public static FT_Raster_SetModeFunc create(FT_Raster_SetModeFuncI instance) {
        return instance instanceof FT_Raster_SetModeFunc
            ? (FT_Raster_SetModeFunc)instance
            : new Container(instance.address(), instance);
    }

    protected FT_Raster_SetModeFunc() {
        super(CIF);
    }

    FT_Raster_SetModeFunc(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends FT_Raster_SetModeFunc {

        private final FT_Raster_SetModeFuncI delegate;

        Container(long functionPointer, FT_Raster_SetModeFuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long raster, long mode, long args) {
            return delegate.invoke(raster, mode, args);
        }

    }

}
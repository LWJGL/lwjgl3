/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke FT_Raster_DoneFunc} */
public abstract class FT_Raster_DoneFunc extends Callback implements FT_Raster_DoneFuncI {

    /**
     * Creates a {@code FT_Raster_DoneFunc} instance from the specified function pointer.
     *
     * @return the new {@code FT_Raster_DoneFunc}
     */
    public static FT_Raster_DoneFunc create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable FT_Raster_DoneFunc createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code FT_Raster_DoneFunc} instance that delegates to the specified {@code FT_Raster_DoneFuncI} instance. */
    public static FT_Raster_DoneFunc create(FT_Raster_DoneFuncI instance) { return create(instance, instance.address()); }

    private static FT_Raster_DoneFunc create(FT_Raster_DoneFuncI instance, long functionPointer) {
        return instance instanceof FT_Raster_DoneFunc
            ? (FT_Raster_DoneFunc)instance
            : new FT_Raster_DoneFunc(functionPointer) {
                @Override public void invoke(long raster) {
                    instance.invoke(raster);
                }
            };
    }

    protected FT_Raster_DoneFunc() {
        super(DESCRIPTOR);
    }

    FT_Raster_DoneFunc(long functionPointer) {
        super(functionPointer);
    }

}
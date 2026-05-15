/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke FT_Raster_RenderFunc} */
public abstract class FT_Raster_RenderFunc extends Callback implements FT_Raster_RenderFuncI {

    /**
     * Creates a {@code FT_Raster_RenderFunc} instance from the specified function pointer.
     *
     * @return the new {@code FT_Raster_RenderFunc}
     */
    public static FT_Raster_RenderFunc create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable FT_Raster_RenderFunc createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code FT_Raster_RenderFunc} instance that delegates to the specified {@code FT_Raster_RenderFuncI} instance. */
    public static FT_Raster_RenderFunc create(FT_Raster_RenderFuncI instance) { return create(instance, instance.address()); }

    private static FT_Raster_RenderFunc create(FT_Raster_RenderFuncI instance, long functionPointer) {
        return instance instanceof FT_Raster_RenderFunc
            ? (FT_Raster_RenderFunc)instance
            : new FT_Raster_RenderFunc(functionPointer) {
                @Override public int invoke(long raster, long params) {
                    return instance.invoke(raster, params);
                }
            };
    }

    protected FT_Raster_RenderFunc() {
        super(DESCRIPTOR);
    }

    FT_Raster_RenderFunc(long functionPointer) {
        super(functionPointer);
    }

}
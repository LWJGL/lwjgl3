/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke FT_Raster_SetModeFunc} */
public abstract class FT_Raster_SetModeFunc extends Callback implements FT_Raster_SetModeFuncI {

    /**
     * Creates a {@code FT_Raster_SetModeFunc} instance from the specified function pointer.
     *
     * @return the new {@code FT_Raster_SetModeFunc}
     */
    public static FT_Raster_SetModeFunc create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable FT_Raster_SetModeFunc createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code FT_Raster_SetModeFunc} instance that delegates to the specified {@code FT_Raster_SetModeFuncI} instance. */
    public static FT_Raster_SetModeFunc create(FT_Raster_SetModeFuncI instance) { return create(instance, instance.address()); }

    private static FT_Raster_SetModeFunc create(FT_Raster_SetModeFuncI instance, long functionPointer) {
        return instance instanceof FT_Raster_SetModeFunc
            ? (FT_Raster_SetModeFunc)instance
            : new FT_Raster_SetModeFunc(functionPointer) {
                @Override public int invoke(long raster, long mode, long args) {
                    return instance.invoke(raster, mode, args);
                }
            };
    }

    protected FT_Raster_SetModeFunc() {
        super(DESCRIPTOR);
    }

    FT_Raster_SetModeFunc(long functionPointer) {
        super(functionPointer);
    }

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke FT_Raster_NewFunc} */
public abstract class FT_Raster_NewFunc extends Callback implements FT_Raster_NewFuncI {

    /**
     * Creates a {@code FT_Raster_NewFunc} instance from the specified function pointer.
     *
     * @return the new {@code FT_Raster_NewFunc}
     */
    public static FT_Raster_NewFunc create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable FT_Raster_NewFunc createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code FT_Raster_NewFunc} instance that delegates to the specified {@code FT_Raster_NewFuncI} instance. */
    public static FT_Raster_NewFunc create(FT_Raster_NewFuncI instance) { return create(instance, instance.address()); }

    private static FT_Raster_NewFunc create(FT_Raster_NewFuncI instance, long functionPointer) {
        return instance instanceof FT_Raster_NewFunc
            ? (FT_Raster_NewFunc)instance
            : new FT_Raster_NewFunc(functionPointer) {
                @Override public int invoke(long memory, long raster) {
                    return instance.invoke(memory, raster);
                }
            };
    }

    protected FT_Raster_NewFunc() {
        super(DESCRIPTOR);
    }

    FT_Raster_NewFunc(long functionPointer) {
        super(functionPointer);
    }

}
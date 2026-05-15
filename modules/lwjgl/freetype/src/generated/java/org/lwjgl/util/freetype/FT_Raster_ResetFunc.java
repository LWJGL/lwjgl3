/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke FT_Raster_ResetFunc} */
public abstract class FT_Raster_ResetFunc extends Callback implements FT_Raster_ResetFuncI {

    /**
     * Creates a {@code FT_Raster_ResetFunc} instance from the specified function pointer.
     *
     * @return the new {@code FT_Raster_ResetFunc}
     */
    public static FT_Raster_ResetFunc create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable FT_Raster_ResetFunc createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code FT_Raster_ResetFunc} instance that delegates to the specified {@code FT_Raster_ResetFuncI} instance. */
    public static FT_Raster_ResetFunc create(FT_Raster_ResetFuncI instance) { return create(instance, instance.address()); }

    private static FT_Raster_ResetFunc create(FT_Raster_ResetFuncI instance, long functionPointer) {
        return instance instanceof FT_Raster_ResetFunc
            ? (FT_Raster_ResetFunc)instance
            : new FT_Raster_ResetFunc(functionPointer) {
                @Override public void invoke(long raster, long pool_base, long pool_size) {
                    instance.invoke(raster, pool_base, pool_size);
                }
            };
    }

    protected FT_Raster_ResetFunc() {
        super(DESCRIPTOR);
    }

    FT_Raster_ResetFunc(long functionPointer) {
        super(functionPointer);
    }

}
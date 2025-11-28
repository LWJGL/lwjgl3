/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import org.lwjgl.system.*;

import java.lang.invoke.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Callback function: {@link #invoke FT_Raster_ResetFunc} */
@FunctionalInterface
@NativeType("FT_Raster_ResetFunc")
public interface FT_Raster_ResetFuncI extends CallbackI {

    Callback.Descriptor DESCRIPTOR = new Callback.Descriptor(
        MethodHandles.lookup(),
        apiCreateCIF(
            ffi_type_void,
            ffi_type_pointer, ffi_type_pointer, ffi_type_ulong
        )
    );

    @Override
    default Callback.Descriptor getDescriptor() { return DESCRIPTOR; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetCLong(memGetAddress(args + 2 * POINTER_SIZE))
        );
    }

    /** {@code void (* FT_Raster_ResetFunc) (FT_Raster raster, unsigned char * pool_base, unsigned long pool_size)} */
    void invoke(@NativeType("FT_Raster") long raster, @NativeType("unsigned char *") long pool_base, @NativeType("unsigned long") long pool_size);

}
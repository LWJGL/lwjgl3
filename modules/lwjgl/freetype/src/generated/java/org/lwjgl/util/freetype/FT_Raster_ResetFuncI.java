/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

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
@FunctionalInterface
@NativeType("FT_Raster_ResetFunc")
public interface FT_Raster_ResetFuncI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_void,
        ffi_type_pointer, ffi_type_pointer, ffi_type_ulong
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetCLong(memGetAddress(args + 2 * POINTER_SIZE))
        );
    }

    /**
     * FreeType used to provide an area of memory called the 'render pool' available to all registered rasterizers. This was not thread safe, however, and now
     * FreeType never allocates this pool.
     * 
     * <p>This function is called after a new raster object is created.</p>
     */
    void invoke(@NativeType("FT_Raster") long raster, @NativeType("unsigned char *") long pool_base, @NativeType("unsigned long") long pool_size);

}
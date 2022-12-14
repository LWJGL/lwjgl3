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
 *     FT_Raster raster
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("FT_Raster_DoneFunc")
public interface FT_Raster_DoneFuncI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_void,
        ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetAddress(memGetAddress(args))
        );
    }

    /** A function used to destroy a given raster object. */
    void invoke(@NativeType("FT_Raster") long raster);

}
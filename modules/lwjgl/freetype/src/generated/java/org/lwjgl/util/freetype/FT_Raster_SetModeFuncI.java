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
 * int (*{@link #invoke}) (
 *     FT_Raster raster,
 *     unsigned long mode,
 *     void *args
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("FT_Raster_SetModeFunc")
public interface FT_Raster_SetModeFuncI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_sint32,
        ffi_type_pointer, ffi_type_ulong, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        int __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetCLong(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /**
     * This function is a generic facility to change modes or attributes in a given raster. This can be used for debugging purposes, or simply
     * to allow implementation-specific 'features' in a given raster module.
     */
    int invoke(@NativeType("FT_Raster") long raster, @NativeType("unsigned long") long mode, @NativeType("void *") long args);

}
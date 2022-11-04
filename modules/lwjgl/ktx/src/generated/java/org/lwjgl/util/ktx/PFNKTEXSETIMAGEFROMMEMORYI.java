/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.ktx;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/**
 * <h3>Type</h3>
 * 
 * <pre><code>
 * KTX_error_code (*{@link #invoke}) (
 *     ktxTexture *This,
 *     ktx_uint32_t level,
 *     ktx_uint32_t layer,
 *     ktx_uint32_t faceSlice,
 *     ktx_uint8_t const *src,
 *     ktx_size_t srcSize
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("PFNKTEXSETIMAGEFROMMEMORY")
public interface PFNKTEXSETIMAGEFROMMEMORYI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        apiStdcall(),
        ffi_type_uint32,
        ffi_type_pointer, ffi_type_uint32, ffi_type_uint32, ffi_type_uint32, ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        int __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetInt(memGetAddress(args + POINTER_SIZE)),
            memGetInt(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 3 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 4 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 5 * POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    @NativeType("KTX_error_code") int invoke(@NativeType("ktxTexture *") long This, @NativeType("ktx_uint32_t") int level, @NativeType("ktx_uint32_t") int layer, @NativeType("ktx_uint32_t") int faceSlice, @NativeType("ktx_uint8_t const *") long src, @NativeType("ktx_size_t") long srcSize);

}
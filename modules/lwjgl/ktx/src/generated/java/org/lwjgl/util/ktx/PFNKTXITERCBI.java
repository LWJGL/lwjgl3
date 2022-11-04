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
 *     int miplevel,
 *     int face,
 *     int width,
 *     int height,
 *     int depth,
 *     ktx_uint64_t faceLodSize,
 *     void *pixels,
 *     void *userdata
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("PFNKTXITERCB")
public interface PFNKTXITERCBI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_uint32,
        ffi_type_sint32, ffi_type_sint32, ffi_type_sint32, ffi_type_sint32, ffi_type_sint32, ffi_type_uint64, ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        int __result = invoke(
            memGetInt(memGetAddress(args)),
            memGetInt(memGetAddress(args + POINTER_SIZE)),
            memGetInt(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 3 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 4 * POINTER_SIZE)),
            memGetLong(memGetAddress(args + 5 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 6 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 7 * POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /**
     * Signature of function called by the {@code ktxTexture_Iterate*} functions to receive image data.
     * 
     * <p>The function parameters are used to pass values which change for each image. Obtain values which are uniform across all images from the
     * {@code ktxTexture} object.</p>
     *
     * @param miplevel    MIP level from 0 to the max level which is dependent on the texture size
     * @param face        usually 0; for cube maps, one of the 6 cube faces in the order +X, -X, +Y, -Y, +Z, -Z, 0 to 5
     * @param width       width of the image
     * @param height      height of the image or, for 1D textures textures, 1
     * @param depth       depth of the image or, for 1D &amp; 2D textures, 1
     * @param faceLodSize number of bytes of data pointed at by {@code pixels}
     * @param pixels      pointer to the image data
     * @param userdata    pointer for the application to pass data to and from the callback function
     */
    @NativeType("KTX_error_code") int invoke(int miplevel, int face, int width, int height, int depth, @NativeType("ktx_uint64_t") long faceLodSize, @NativeType("void *") long pixels, @NativeType("void *") long userdata);

}
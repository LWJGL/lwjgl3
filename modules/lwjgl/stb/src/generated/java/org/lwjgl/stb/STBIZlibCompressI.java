/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/**
 * Instances of this interface may be set to {@link STBImageWrite#stbi_zlib_compress}.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * unsigned char * (*) (
 *     unsigned char *data,
 *     int data_len,
 *     int *out_len,
 *     int quality
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("unsigned char * (*) (unsigned char *, int, int *, int)")
public interface STBIZlibCompressI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_pointer,
        ffi_type_pointer, ffi_type_sint32, ffi_type_pointer, ffi_type_sint32
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        long __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetInt(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 3 * POINTER_SIZE))
        );
        apiClosureRetP(ret, __result);
    }

    /**
     * Compresses a block of data using Zlib compression.
     * 
     * <p>The returned data will be freed with {@link MemoryUtil#memFree} so it must be heap allocated with {@link MemoryUtil#memAlloc}.</p>
     *
     * @param data     the data to compress
     * @param data_len the data length, in bytes
     * @param out_len  returns the compressed data length, in bytes
     * @param quality  the compression quality to use
     *
     * @return the compressed data
     */
    @NativeType("unsigned char *") long invoke(@NativeType("unsigned char *") long data, int data_len, @NativeType("int *") long out_len, int quality);

}
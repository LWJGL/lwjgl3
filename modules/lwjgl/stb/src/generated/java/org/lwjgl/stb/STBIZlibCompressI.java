/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

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
public interface STBIZlibCompressI extends CallbackI.P {

    String SIGNATURE = "(pipi)p";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default long callback(long args) {
        return invoke(
            dcbArgPointer(args),
            dcbArgInt(args),
            dcbArgPointer(args),
            dcbArgInt(args)
        );
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
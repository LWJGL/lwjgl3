/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_compressed_texture_pixel_storage.txt">ARB_compressed_texture_pixel_storage</a> extension.
 * 
 * <p>This extension expands the functionality of the {@link GL11C#glPixelStorei PixelStorei} modes to allow {@link GL11#GL_UNPACK_ROW_LENGTH UNPACK_ROW_LENGTH}, {@link GL11#GL_UNPACK_SKIP_ROWS UNPACK_SKIP_ROWS},
 * {@link GL11#GL_UNPACK_SKIP_PIXELS UNPACK_SKIP_PIXELS}, {@link GL12#GL_UNPACK_IMAGE_HEIGHT UNPACK_IMAGE_HEIGHT} and {@link GL12#GL_UNPACK_SKIP_IMAGES UNPACK_SKIP_IMAGES} to affect the operation of CompressedTexImage*D and
 * CompressedTexSubImage*D. Similarly, it also allows {@link GL11#GL_PACK_ROW_LENGTH PACK_ROW_LENGTH}, {@link GL11#GL_PACK_SKIP_ROWS PACK_SKIP_ROWS}, {@link GL11#GL_PACK_SKIP_PIXELS PACK_SKIP_PIXELS}, {@link GL12#GL_PACK_IMAGE_HEIGHT PACK_IMAGE_HEIGHT} and
 * {@link GL12#GL_PACK_SKIP_IMAGES PACK_SKIP_IMAGES} to affect the operation of GetCompressedTexImage*D. This allows data to be transferred to or from a specified sub-rectangle of a
 * larger compressed image.</p>
 * 
 * <p>This extension is designed primarily to support compressed image formats with fixed-size blocks. To use this new mechanism, an application should
 * program new parameters UNPACK_COMPRESSED_BLOCK_{WIDTH,HEIGHT,DEPTH,SIZE} to indicate the number of texels in each dimension of the fixed-size block as
 * well as the number of bytes consumed by each block. These parameters, in addition to the existing PixelStore parameters, are used to identify a
 * collection of bytes in client memory or a buffer object's data store to use as compressed texture data. This operation is unlikely to have the desired
 * results if the client programs a block size inconsistent with the underlying compressed image format, or if the compressed image format has
 * variable-sized blocks.</p>
 * 
 * <p>Requires {@link GL21 OpenGL 2.1}. Promoted to core in {@link GL42 OpenGL 4.2}.</p>
 */
public final class ARBCompressedTexturePixelStorage {

    /** Accepted by the {@code pname} parameter of PixelStore[fi], GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev. */
    public static final int
        GL_UNPACK_COMPRESSED_BLOCK_WIDTH  = 0x9127,
        GL_UNPACK_COMPRESSED_BLOCK_HEIGHT = 0x9128,
        GL_UNPACK_COMPRESSED_BLOCK_DEPTH  = 0x9129,
        GL_UNPACK_COMPRESSED_BLOCK_SIZE   = 0x912A,
        GL_PACK_COMPRESSED_BLOCK_WIDTH    = 0x912B,
        GL_PACK_COMPRESSED_BLOCK_HEIGHT   = 0x912C,
        GL_PACK_COMPRESSED_BLOCK_DEPTH    = 0x912D,
        GL_PACK_COMPRESSED_BLOCK_SIZE     = 0x912E;

    private ARBCompressedTexturePixelStorage() {}

}
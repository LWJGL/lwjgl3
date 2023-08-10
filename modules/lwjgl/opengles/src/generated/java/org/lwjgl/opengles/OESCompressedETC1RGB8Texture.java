/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/OES/OES_compressed_ETC1_RGB8_texture.txt">OES_compressed_ETC1_RGB8_texture</a> extension.
 * 
 * <p>The goal of this extension is to allow direct support of compressed textures in the Ericsson Texture Compression (ETC) formats in OpenGL ES.</p>
 * 
 * <p>ETC-compressed textures are handled in OpenGL ES using the CompressedTexImage2D call.</p>
 * 
 * <p>The definition of the "internalformat" parameter in the CompressedTexImage2D call has been extended to support ETC-compressed textures.</p>
 */
public final class OESCompressedETC1RGB8Texture {

    /** Accepted by the {@code internalformat} parameter of CompressedTexImage2D. */
    public static final int GL_ETC1_RGB8_OES = 0x8D64;

    private OESCompressedETC1RGB8Texture() {}

}
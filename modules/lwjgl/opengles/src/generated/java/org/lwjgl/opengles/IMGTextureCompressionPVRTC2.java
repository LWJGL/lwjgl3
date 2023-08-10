/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/IMG/IMG_texture_compression_pvrtc2.txt">IMG_texture_compression_pvrtc2</a> extension.
 * 
 * <p>This extension provides additional texture compression functionality specific to Imagination Technologies PowerVR Texture compression format (called
 * PVRTC2) subject to all the requirements and limitations described by the OpenGL ES 2.0 specification.</p>
 * 
 * <p>This extension supports 4 and 2 bit per pixel texture compression formats. Because the compression of PVRTC2 is CPU intensive, it is not appropriate to
 * carry out compression on the target platform. Therefore this extension only supports the loading of compressed texture data.</p>
 * 
 * <p>Requires {@link GLES20 GLES 2.0} and {@link GLESCapabilities#GL_OES_texture_npot OES_texture_npot}.</p>
 */
public final class IMGTextureCompressionPVRTC2 {

    /** Accepted by the {@code internalformat} parameter of CompressedTexImage2D and the {@code format} parameter of CompressedTexSubImage2D. */
    public static final int
        GL_COMPRESSED_RGBA_PVRTC_2BPPV2_IMG = 0x9137,
        GL_COMPRESSED_RGBA_PVRTC_4BPPV2_IMG = 0x9138;

    private IMGTextureCompressionPVRTC2() {}

}
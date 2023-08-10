/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/IMG/IMG_texture_compression_pvrtc.txt">IMG_texture_compression_pvrtc</a> extension.
 * 
 * <p>This extension provides additional texture compression functionality specific to Imagination Technologies PowerVR Texture compression format (called
 * PVRTC) subject to all the requirements and limitations described by the OpenGL 1.3 specifications.</p>
 * 
 * <p>This extension supports 4 and 2 bit per pixel texture compression formats. Because the compression of PVRTC is very CPU intensive, it is not
 * appropriate to carry out compression on the target platform. Therefore this extension only supports the loading of compressed texture data.</p>
 */
public final class IMGTextureCompressionPVRTC {

    /** Accepted by the {@code internalformat} parameter of CompressedTexImage2D and the {@code format} parameter of CompressedTexSubImage2D. */
    public static final int
        GL_COMPRESSED_RGB_PVRTC_4BPPV1_IMG  = 0x8C00,
        GL_COMPRESSED_RGB_PVRTC_2BPPV1_IMG  = 0x8C01,
        GL_COMPRESSED_RGBA_PVRTC_4BPPV1_IMG = 0x8C02,
        GL_COMPRESSED_RGBA_PVRTC_2BPPV1_IMG = 0x8C03;

    private IMGTextureCompressionPVRTC() {}

}
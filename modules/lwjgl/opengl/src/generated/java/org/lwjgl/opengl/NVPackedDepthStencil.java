/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * This extension provides a new data format, {@link #GL_DEPTH_STENCIL_NV DEPTH_STENCIL_NV}, that can be used with the glDrawPixels, glReadPixels, and glCopyPixels commands, as well
 * as a packed data type, {@link #GL_UNSIGNED_INT_24_8_NV UNSIGNED_INT_24_8_NV}, that is meant to be used with GL_DEPTH_STENCIL_NV. No other formats are supported with
 * GL_DEPTH_STENCIL_NV. If <a href="https://www.khronos.org/registry/OpenGL/extensions/SGIX/SGIX_depth_texture.txt">SGIX_depth_texture</a> is supported, GL_DEPTH_STENCIL_NV/GL_UNSIGNED_INT_24_8_NV data can also be used for
 * textures; this provides a more efficient way to supply data for a 24-bit depth texture.
 */
public final class NVPackedDepthStencil {

    /**
     * Accepted by the {@code format} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D,
     * and GetTexImage, and by the {@code type} parameter of CopyPixels.
     */
    public static final int GL_DEPTH_STENCIL_NV = 0x84F9;

    /**
     * Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, and
     * GetTexImage.
     */
    public static final int GL_UNSIGNED_INT_24_8_NV = 0x84FA;

    private NVPackedDepthStencil() {}

}
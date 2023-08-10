/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_depth_buffer_float.txt">ARB_depth_buffer_float</a> extension.
 * 
 * <p>This extension provides new texture internal formats whose depth components are stored as 32-bit floating-point values, rather than the normalized
 * unsigned integers used in existing depth formats. Floating-point depth textures support all the functionality supported for fixed-point depth textures,
 * including shadow mapping and rendering support via {@link EXTFramebufferObject EXT_framebuffer_object}. Floating-point depth textures can store values outside the range
 * {@code [0,1]}.</p>
 * 
 * <p>Additionally, this extension provides new packed depth/stencil pixel formats (see {@link EXTPackedDepthStencil EXT_packed_depth_stencil}) that have 64-bit pixels consisting
 * of a 32-bit floating-point depth value, 8 bits of stencil, and 24 unused bites. A packed depth/stencil texture internal format is also provided.</p>
 * 
 * <p>Requires {@link GL20 OpenGL 2.0}, {@link ARBColorBufferFloat ARB_color_buffer_float}, {@link EXTPackedDepthStencil EXT_packed_depth_stencil} and {@link ARBFramebufferObject ARB_framebuffer_object}.
 * Promoted to core in {@link GL30 OpenGL 3.0}.</p>
 */
public final class ARBDepthBufferFloat {

    /**
     * Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D, and RenderbufferStorageEXT, and
     * returned in the {@code data} parameter of GetTexLevelParameter and GetRenderbufferParameterivEXT.
     */
    public static final int
        GL_DEPTH_COMPONENT32F = 0x8CAC,
        GL_DEPTH32F_STENCIL8  = 0x8CAD;

    /**
     * Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, and
     * GetTexImage.
     */
    public static final int GL_FLOAT_32_UNSIGNED_INT_24_8_REV = 0x8DAD;

    private ARBDepthBufferFloat() {}

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_texture_shader3.txt">NV_texture_shader3</a> extension.
 * 
 * <p>{@code NV_texture_shader3} extends the {@code NV_texture_shader} functionality by adding several new texture shader operations, extending several
 * existing texture shader operations, adding a new {@code HILO8} internal format, and adding new and more flexible re-mapping modes for dot product and
 * dependent texture shader operations.</p>
 * 
 * <p>Requires {@link NVTextureShader NV_texture_shader} and {@link NVTextureShader2 NV_texture_shader2}.</p>
 */
public final class NVTextureShader3 {

    /**
     * When the {@code target} and {@code pname} parameters of TexEnvf, TexEnvfv, TexEnvi, and TexEnviv are TEXTURE_SHADER_NV and SHADER_OPERATION_NV
     * respectively, then the value of {@code param} or the value pointed to by {@code params} may be.
     */
    public static final int
        GL_OFFSET_PROJECTIVE_TEXTURE_2D_NV              = 0x8850,
        GL_OFFSET_PROJECTIVE_TEXTURE_2D_SCALE_NV        = 0x8851,
        GL_OFFSET_PROJECTIVE_TEXTURE_RECTANGLE_NV       = 0x8852,
        GL_OFFSET_PROJECTIVE_TEXTURE_RECTANGLE_SCALE_NV = 0x8853,
        GL_OFFSET_HILO_TEXTURE_2D_NV                    = 0x8854,
        GL_OFFSET_HILO_TEXTURE_RECTANGLE_NV             = 0x8855,
        GL_OFFSET_HILO_PROJECTIVE_TEXTURE_2D_NV         = 0x8856,
        GL_OFFSET_HILO_PROJECTIVE_TEXTURE_RECTANGLE_NV  = 0x8857,
        GL_DEPENDENT_HILO_TEXTURE_2D_NV                 = 0x8858,
        GL_DEPENDENT_RGB_TEXTURE_3D_NV                  = 0x8859,
        GL_DEPENDENT_RGB_TEXTURE_CUBE_MAP_NV            = 0x885A,
        GL_DOT_PRODUCT_PASS_THROUGH_NV                  = 0x885B,
        GL_DOT_PRODUCT_TEXTURE_1D_NV                    = 0x885C,
        GL_DOT_PRODUCT_AFFINE_DEPTH_REPLACE_NV          = 0x885D;

    /** Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, and TexImage3D. */
    public static final int
        GL_HILO8_NV        = 0x885E,
        GL_SIGNED_HILO8_NV = 0x885F;

    /**
     * When the {@code target} and {@code pname} parameters of TexEnvf, TexEnvfv, TexEnvi, and TexEnviv are TEXTURE_SHADER_NV and
     * RGBA_UNSIGNED_DOT_PRODUCT_MAPPING_NV respectively, then the value of {@code param} or the value pointed to by {@code params} may be.
     */
    public static final int GL_FORCE_BLUE_TO_ONE_NV = 0x8860;

    private NVTextureShader3() {}

}
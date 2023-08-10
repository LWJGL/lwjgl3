/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_texture_shader2.txt">NV_texture_shader2</a> extension.
 * 
 * <p>This extension extends the {@code NV_texture_shader} functionality to support texture shader operations for 3D textures.</p>
 * 
 * <p>Requires {@link NVTextureShader NV_texture_shader}.</p>
 */
public final class NVTextureShader2 {

    /**
     * When the {@code target} and {@code pname} parameters of TexEnvf, TexEnvfv, TexEnvi, and TexEnviv are TEXTURE_SHADER_NV and SHADER_OPERATION_NV
     * respectively, then the value of {@code param} or the value pointed to by {@code params} may be.
     */
    public static final int GL_DOT_PRODUCT_TEXTURE_3D_NV = 0x86EF;

    private NVTextureShader2() {}

}
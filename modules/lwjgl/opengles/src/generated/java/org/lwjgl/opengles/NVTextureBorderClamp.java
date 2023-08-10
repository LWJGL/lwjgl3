/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_texture_border_clamp.txt">NV_texture_border_clamp</a> extension.
 * 
 * <p>OpenGL ES provides only a single clamping wrap mode: CLAMP_TO_EDGE. However, the ability to clamp to a constant border color can be useful to quickly
 * detect texture coordinates that exceed their expected limits or to dummy out any such accesses with transparency or a neutral color in tiling or light
 * maps.</p>
 * 
 * <p>This extension defines an additional texture clamping algorithm. CLAMP_TO_BORDER_NV clamps texture coordinates at all mipmap levels such that NEAREST
 * and LINEAR filters of clamped coordinates return only the constant border color. This does not add the ability for textures to specify borders using
 * glTexImage2D, but only to clamp to a constant border value set using glTexParameter.</p>
 * 
 * <p>Requires {@link GLES20 GLES 2.0}.</p>
 */
public final class NVTextureBorderClamp {

    /** Accepted by the {@code pname} parameter of TexParameteri, TexParameterf, TexParameteriv, and TexParameterfv. */
    public static final int GL_TEXTURE_BORDER_COLOR_NV = 0x1004;

    /**
     * Accepted by the {@code param} parameter of TexParameteri and TexParameterf, and by the {@code params} parameter of TexParameteriv and TexParameterfv,
     * and returned by the {@code params} parameter of GetTexParameteriv and GetTexParameterfv when their {@code pname} parameter is TEXTURE_WRAP_S,
     * TEXTURE_WRAP_T, or TEXTURE_WRAP_R_OES.
     */
    public static final int GL_CLAMP_TO_BORDER_NV = 0x812D;

    private NVTextureBorderClamp() {}

}
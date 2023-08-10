/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_texture_rectangle.txt">ARB_texture_rectangle</a> extension.
 * 
 * <p>OpenGL texturing is limited to images with power-of-two dimensions and an optional 1-texel border. The ARB_texture_rectangle extension adds a new
 * texture target that supports 2D textures without requiring power-of-two dimensions.</p>
 * 
 * <p>Non-power-of-two sized (NPOTS) textures are useful for storing video images that do not have power-of-two sized (POTS). Re-sampling artifacts are
 * avoided and less texture memory may be required by using non-power-of-two sized textures. Non-power-of-two sized textures are also useful for shadow
 * maps and window-space texturing.</p>
 * 
 * <p>However, non-power-of-two sized textures have limitations that do not apply to power-of-two sized textures. NPOTS textures may not use mipmap filtering;
 * POTS textures support both mipmapped and non-mipmapped filtering. NPOTS textures support only the {@link GL11#GL_CLAMP CLAMP}, {@link GL12#GL_CLAMP_TO_EDGE CLAMP_TO_EDGE}, and
 * {@link GL13#GL_CLAMP_TO_BORDER CLAMP_TO_BORDER} wrap modes; POTS textures support {@link GL12#GL_CLAMP_TO_EDGE CLAMP_TO_EDGE}, {@link GL11#GL_REPEAT REPEAT}, {@link GL11#GL_CLAMP CLAMP}, {@link GL14#GL_MIRRORED_REPEAT MIRRORED_REPEAT}, and {@link GL13#GL_CLAMP_TO_BORDER CLAMP_TO_BORDER}
 * (and GL_MIRROR_CLAMP_ATI and GL_MIRROR_CLAMP_TO_EDGE_ATI if <a href="https://www.khronos.org/registry/OpenGL/extensions/ATI/ATI_texture_mirror_once.txt">ATI_texture_mirror_once</a> is supported). NPOTS textures do not
 * support an optional 1-texel border; POTS textures do support an optional 1-texel border.</p>
 * 
 * <p>NPOTS textures are accessed by dimension-dependent (aka non-normalized) texture coordinates. So instead of thinking of the texture image lying in a
 * [0..1]x[0..1] range, the NPOTS texture image lies in a [0..w]x[0..h] range.</p>
 * 
 * <p>This extension adds a new texture target and related state (proxy, binding, max texture size).</p>
 */
public final class ARBTextureRectangle {

    /**
     * Accepted by the {@code cap} parameter of Enable, Disable and IsEnabled; by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv and
     * GetDoublev; and by the {@code target} parameter of BindTexture, GetTexParameterfv, GetTexParameteriv, TexParameterf, TexParameteri, TexParameterfv and
     * TexParameteriv.
     */
    public static final int GL_TEXTURE_RECTANGLE_ARB = 0x84F5;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv and GetDoublev. */
    public static final int GL_TEXTURE_BINDING_RECTANGLE_ARB = 0x84F6;

    /** Accepted by the {@code target} parameter of GetTexLevelParameteriv, GetTexLevelParameterfv, GetTexParameteriv and TexImage2D. */
    public static final int GL_PROXY_TEXTURE_RECTANGLE_ARB = 0x84F7;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv and GetFloatv. */
    public static final int GL_MAX_RECTANGLE_TEXTURE_SIZE_ARB = 0x84F8;

    /**
     * TEXTURE_RECTANGLE_ARB Returned by {@code type} parameter of GetActiveUniform when the location {@code index} for program object {@code program} is of
     * type sampler2DRect.
     */
    public static final int GL_SAMPLER_2D_RECT_ARB = 0x8B63;

    /**
     * Returned by {@code type} parameter of GetActiveUniform when the location {@code index} for program object {@code program} is of type
     * sampler2DRectShadow.
     */
    public static final int GL_SAMPLER_2D_RECT_SHADOW_ARB = 0x8B64;

    private ARBTextureRectangle() {}

}
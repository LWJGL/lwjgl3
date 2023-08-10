/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_texture_border_clamp.txt">ARB_texture_border_clamp</a> extension.
 * 
 * <p>The base OpenGL provides clamping such that the texture coordinates are limited to exactly the range [0,1]. When a texture coordinate is clamped using
 * this algorithm, the texture sampling filter straddles the edge of the texture image, taking 1/2 its sample values from within the texture image, and the
 * other 1/2 from the texture border. It is sometimes desirable for a texture to be clamped to the border color, rather than to an average of the border
 * and edge colors.</p>
 * 
 * <p>This extension defines an additional texture clamping algorithm. {@link #GL_CLAMP_TO_BORDER_ARB CLAMP_TO_BORDER_ARB} clamps texture coordinates at all mipmap levels such that
 * {@link GL11#GL_NEAREST NEAREST} and {@link GL11#GL_LINEAR LINEAR} filters return only the color of the border texels.</p>
 * 
 * <p>Promoted to core in {@link GL13 OpenGL 1.3}.</p>
 */
public final class ARBTextureBorderClamp {

    /**
     * Accepted by the {@code param} parameter of {@link GL11C#glTexParameteri TexParameteri} and {@link GL11C#glTexParameterf TexParameterf}, and by the {@code params} parameter of {@link GL11C#glTexParameteriv TexParameteriv}
     * and {@link GL11C#glTexParameterfv TexParameterfv}, when their {@code pname} parameter is {@link GL11#GL_TEXTURE_WRAP_S TEXTURE_WRAP_S}, {@link GL11#GL_TEXTURE_WRAP_T TEXTURE_WRAP_T}, or {@link GL12#GL_TEXTURE_WRAP_R TEXTURE_WRAP_R}.
     */
    public static final int GL_CLAMP_TO_BORDER_ARB = 0x812D;

    private ARBTextureBorderClamp() {}

}
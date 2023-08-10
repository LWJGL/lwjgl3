/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_texture_sRGB_decode.txt">EXT_texture_sRGB_decode</a> extension.
 * 
 * <p>The EXT_texture_sRGB extension (promoted to core in OpenGL 2.1) provides a texture format stored in the sRGB color space. Sampling one of these
 * textures will always return the color value decoded into a linear color space. However, an application may wish to sample and retrieve the undecoded
 * sRGB data from the texture and manipulate that directly.</p>
 * 
 * <p>This extension adds a Texture Parameter and Sampler Object parameter to allow sRGB textures to be read directly, without decoding.</p>
 * 
 * <p>The new parameter, {@link #GL_TEXTURE_SRGB_DECODE_EXT TEXTURE_SRGB_DECODE_EXT} controls whether the decoding happens at sample time. It only applies to textures with an internal format
 * that is sRGB and is ignored for all other textures. This value defaults to {@link #GL_DECODE_EXT DECODE_EXT}, which indicates the texture should be decoded to linear color
 * space.</p>
 * 
 * <p>Requires {@link GL21 OpenGL 2.1} or {@link EXTTextureSRGB EXT_texture_sRGB}.</p>
 */
public final class EXTTextureSRGBDecode {

    /**
     * Accepted by the {@code pname} parameter of TexParameterf, TexParameteri, TexParameterfv, TexParameteriv, TexParameterIiv, TexParameterIuiv,
     * TexParameterIivEXT, TexParameterIuivEXT, TextureParameterfEXT, TextureParameterfvEXT, TextureParameteriEXT, TextureParameterivEXT,
     * TextureParameterIivEXT, TextureParameterIuivEXT, MultiTexParameterfEXT, MultiTexParameterfvEXT, MultiTexParameteriEXT, MultiTexParameterivEXT,
     * MultiTexParameterIivEXT, MultiTexParameterIuivEXT, GetTexParameterfv, GetTexParameteriv, GetTexParameterIiv, GetTexParameterIuiv, GetTexParameterIivEXT,
     * GetTexParameterIuivEXT, GetTextureParameterfEXT, GetTextureParameterfvEXT, GetTextureParameteriEXT, GetTextureParameterivEXT, GetTextureParameterIivEXT,
     * GetTextureParameterIuivEXT, GetMultiTexParameterfEXT, GetMultiTexParameterfvEXT, GetMultiTexParameteriEXT, GetMultiTexParameterivEXT,
     * GetMultiTexParameterIivEXT, GetMultiTexParameterIuivEXT, SamplerParameteri, SamplerParameterf, SamplerParameteriv, SamplerParameterfv,
     * SamplerParameterIiv, SamplerParameterIuiv, GetSamplerParameteriv, GetSamplerParameterfv, GetSamplerParameterIiv, and GetSamplerParameterIuiv.
     */
    public static final int GL_TEXTURE_SRGB_DECODE_EXT = 0x8A48;

    /**
     * Accepted by the {@code param} parameter of TexParameterf, TexParameteri, TexParameterfv, TexParameteriv, TexParameterIiv, TexParameterIuiv,
     * TexParameterIivEXT, TexParameterIuivEXT, TextureParameterfEXT, TextureParameterfvEXT, TextureParameteriEXT, TextureParameterivEXT,
     * TextureParameterIivEXT, TextureParameterIuivEXT, MultiTexParameterfEXT, MultiTexParameterfvEXT, MultiTexParameteriEXT, MultiTexParameterivEXT,
     * MultiTexParameterIivEXT, MultiTexParameterIuivEXT, SamplerParameteri, SamplerParameterf, SamplerParameteriv, SamplerParameterfv, SamplerParameterIiv,
     * and SamplerParameterIuiv.
     */
    public static final int
        GL_DECODE_EXT      = 0x8A49,
        GL_SKIP_DECODE_EXT = 0x8A4A;

    private EXTTextureSRGBDecode() {}

}
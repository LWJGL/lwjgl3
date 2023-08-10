/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_texture_format_sRGB_override.txt">EXT_texture_format_sRGB_override</a> extension.
 * 
 * <p>This extension provides a new texture parameter to override the internal format of a texture object; allowing a non-sRGB format to be overridden to a
 * corresponding sRGB format. For example, an RGB8 texture can be overridden to SRGB8. Such an override will cause the RGB components to be "decoded" from
 * sRGB color space to linear as part of texture filtering. This can be useful for applications where a texture was written with sRGB data using
 * {@link EXTSRGBWriteControl EXT_sRGB_write_control} or when sampling from an {@code EGLImage} that is known to contain sRGB color values.</p>
 */
public final class EXTTextureFormatSRGBOverride {

    /**
     * Accepted by the {@code pname} parameter of TexParameterf, TexParameterfv, TexParameteri, TexParameteriv, TexParameterIiv, TexParameterIuiv,
     * TexParameterIivEXT, TexParameterIuivEXT, GetTexParameterfv, GetTexParameteriv, GetTexParameterIiv, GetTexParameterIuiv, GetTexParameterIivEXT,
     * GetTexParameterIuivEXT.
     */
    public static final int GL_TEXTURE_FORMAT_SRGB_OVERRIDE_EXT = 0x8FBF;

    private EXTTextureFormatSRGBOverride() {}

}
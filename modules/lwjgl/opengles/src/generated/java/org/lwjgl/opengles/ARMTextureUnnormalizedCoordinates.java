/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARM/ARM_texture_unnormalized_coordinates.txt">ARM_texture_unnormalized_coordinates</a> extension.
 * 
 * <p>This extension provides the option to switch to unnormalized coordinates for texture lookups using a sampler parameter.</p>
 * 
 * <p>Texture lookup in OpenGL ES is done using normalized coordinates. For certain applications it is convenient to work with non-normalized coordinates
 * instead. It also beneficial to keep support for bilinear filtering.</p>
 * 
 * <p>Additional restrictions apply to textures with non-normalized coordinates that affect texture completeness and the available texture lookup functions.</p>
 * 
 * <p>Requires {@link GLES30 GLES 3.0}.</p>
 */
public final class ARMTextureUnnormalizedCoordinates {

    /**
     * Accepted by the {@code pname} parameter of TexParameteri, TexParameterf, TexParameteriv, TexParameterfv, SamplerParameteri, SamplerParameterf,
     * SamplerParameteriv, SamplerParameterfv, TexParameterIivEXT, TexParameterIuivEXT, SamplerParameterIivEXT, SamplerParameterIuivEXT, GetTexParameteriv,
     * GetTexParameterfv, GetTexParameterIivEXT, GetTexParameterIuivEXT, GetSamplerParameteriv, GetSamplerParameterfv, GetSamplerParameterIivEXT, and
     * GetSamplerParameterIuivEXT.
     */
    public static final int GL_TEXTURE_UNNORMALIZED_COORDINATES_ARM = 0x8F6A;

    private ARMTextureUnnormalizedCoordinates() {}

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/IMG/IMG_texture_filter_cubic.txt">IMG_texture_filter_cubic</a> extension.
 * 
 * <p>OpenGL ES provides two sampling methods available; nearest neighbor or linear filtering, with optional MIP Map sampling modes added to move between
 * differently sized textures when downsampling.</p>
 * 
 * <p>This extension adds an additional, high quality cubic filtering mode, using a Catmull-Rom bicubic filter. Performing this kind of filtering can be done
 * in a shader by using 16 samples, but this can be inefficient. The cubic filter mode exposes an optimized high quality texture sampling using fixed
 * functionality.</p>
 * 
 * <p>This extension affects the way textures are sampled, by modifying the way texels within the same MIP-Map level are sampled and resolved. It does not
 * affect MIP-Map filtering, which is still limited to linear or nearest.</p>
 */
public final class IMGTextureFilterCubic {

    /**
     * Accepted by the {@code params} parameters of TexParameterf, TexParameterfv, TexParameteri, TexParameteriv, SamplerParameterf, SamplerParameterfv,
     * SamperParameteri and SamplerParameteriv, and returned in {@code params} by GetTexParameterfv, GetTexParameteriv, GetSamplerParameterfv and
     * GetSamplerParameteriv when {@code pname} is TEXTURE_MIN_FILTER or TEXTURE_MAG_FILTER in either case.
     */
    public static final int GL_CUBIC_IMG = 0x9139;

    /** Accepted as above only when {@code pname} is TEXTURE_MIN_FILTER. */
    public static final int
        GL_CUBIC_MIPMAP_NEAREST_IMG = 0x913A,
        GL_CUBIC_MIPMAP_LINEAR_IMG  = 0x913B;

    private IMGTextureFilterCubic() {}

}
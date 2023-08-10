/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_texture_filter_anisotropic.txt">ARB_texture_filter_anisotropic</a> extension.
 * 
 * <p>Texture mapping using OpenGL's existing mipmap texture filtering modes assumes that the projection of the pixel filter footprint into texture space is
 * a square (ie, isotropic). In practice however, the footprint may be long and narrow (ie, anisotropic). Consequently, mipmap filtering severely blurs
 * images on surfaces angled obliquely away from the viewer.</p>
 * 
 * <p>Several approaches exist for improving texture sampling by accounting for the anisotropic nature of the pixel filter footprint into texture space. This
 * extension provides a general mechanism for supporting anisotropic texturing filtering schemes without specifying a particular formulation of
 * anisotropic filtering.</p>
 * 
 * <p>The extension permits the OpenGL application to specify on a per-texture or -sampler object basis the maximum degree of anisotropy to account for in
 * texture filtering.</p>
 * 
 * <p>Increasing the maximum degree of anisotropy may improve texture filtering, but may also significantly reduce the implementation's texture filtering
 * rate. Implementations are free to clamp the specified degree of anisotropy to the implementation's maximum supported degree of anisotropy.</p>
 * 
 * <p>A sampler or texture's maximum degree of anisotropy is specified independently from its minification and magnification filter (as opposed to being
 * supported as an entirely new filtering mode). Implementations are free to use the specified minification and magnification filter to select a
 * particular anisotropic texture filtering scheme. For example, a NEAREST filter with a maximum degree of anisotropy of two could be treated as a 2-tap
 * filter that accounts for the direction of anisotropy. Implementations are also permitted to ignore the minification or magnification filter and
 * implement the highest quality of anisotropic filtering possible.</p>
 * 
 * <p>Applications seeking the highest quality anisotropic filtering available are advised to request a {@link GL11#GL_LINEAR_MIPMAP_LINEAR LINEAR_MIPMAP_LINEAR} minification filter, a {@link GL11#GL_LINEAR LINEAR}
 * magnification filter, and a large maximum degree of anisotropy.</p>
 * 
 * <p>Requires {@link GL12 OpenGL 1.2}.</p>
 */
public final class ARBTextureFilterAnisotropic {

    /** Accepted by the {@code pname} parameters of GetTexParameterfv, GetTexParameteriv, TexParameterf, TexParameterfv, TexParameteri, and TexParameteriv. */
    public static final int GL_TEXTURE_MAX_ANISOTROPY = 0x84FE;

    /** Accepted by the {@code pname} parameters of GetBooleanv, GetDoublev, GetFloatv, and GetIntegerv. */
    public static final int GL_MAX_TEXTURE_MAX_ANISOTROPY = 0x84FF;

    private ARBTextureFilterAnisotropic() {}

}
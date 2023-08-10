/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/AMD/AMD_compressed_3DC_texture.txt">AMD_compressed_3DC_texture</a> extension.
 * 
 * <p>Two compression formats are introduced:</p>
 * 
 * <ul>
 * <li>A compression format for two component textures. When used to store normal vectors, the two components are commonly used with a fragment shader
 * that derives the third component.</li>
 * <li>A compression format for single component textures. The single component may be used as a luminance or an alpha value.</li>
 * </ul>
 * 
 * <p>There are a large number of games that use luminance only and/or alpha only textures. For example, monochrome light maps used in a few popular games
 * are 8-bit luminance textures. This extension describes a compression format that provides a 2:1 compression ratio for 8-bit single channel textures.</p>
 * 
 * <p>Normal maps are special textures that are used to add detail to 3D surfaces. They are an extension of earlier "bump map" textures, which contained per-
 * pixel height values and were used to create the appearance of bumpiness on otherwise smooth surfaces. Normal maps contain more detailed surface
 * information, allowing them to represent much more complex shapes.</p>
 * 
 * <p>Normal mapping is one of the key features that makes the current generation of games look so much better than earlier titles. A limitation to the
 * effectiveness of this technique is the size of the textures required. In an ideal case where every surface has both a color texture map and a normal
 * texture map, the texture memory and bandwidth requirements would double compared to using color maps alone.</p>
 * 
 * <p>In fact, the problem is much worse because existing block based compression methods such as DXTc, ETC, and S3TC are ineffective at compressing normal
 * maps. They tend to have trouble capturing the small edges and subtle curvature that normal maps are designed to capture, and they also introduce
 * unsightly block artifacts.</p>
 * 
 * <p>Because normal maps are used to capture light reflections and realistic surface highlights, these problems are amplified relative to their impact on
 * color textures. The results are sufficiently poor that game artists and developers would rather not use normal map compression at all on most surfaces,
 * and instead limit themselves to lower resolution maps on selected parts of the rendered scene.</p>
 * 
 * <p>3DC provides an ideal solution to the normal map compression problem. It provides up to 4:1 compression of normal maps, with image quality that is
 * virtually indistinguishable from the uncompressed version. The technique is hardware accelerated, so the performance impact is minimal. Thus,
 * developers are freed to use higher resolution, more detailed normal maps, and/or use them on all of the objects in a scene rather than just a select
 * few.</p>
 */
public final class AMDCompressed3DCTexture {

    /** Accepted by the {@code internalFormat} parameter of CompressedTexImage2D and CompressedTexImage3DOES. */
    public static final int
        GL_3DC_X_AMD  = 0x87F9,
        GL_3DC_XY_AMD = 0x87FA;

    private AMDCompressed3DCTexture() {}

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/AMD/AMD_compressed_ATC_texture.txt">AMD_compressed_ATC_texture</a> extension.
 * 
 * <p>This extension enables support for ATC compressed texture formats. ATC is AMD's proprietary compression algorithm for compressing textures for handheld
 * devices to save on power consumption, memory footprint and bandwidth.</p>
 * 
 * <p>Three compression formats are introduced:</p>
 * 
 * <ul>
 * <li>A compression format for RGB textures.</li>
 * <li>A compression format for RGBA textures using explicit alpha encoding.</li>
 * <li>A compression format for RGBA textures using interpolated alpha encoding.</li>
 * </ul>
 */
public final class AMDCompressedATCTexture {

    /** Accepted by the {@code internalformat} parameter of CompressedTexImage2D and CompressedTexImage3DOES. */
    public static final int
        GL_ATC_RGB_AMD                     = 0x8C92,
        GL_ATC_RGBA_EXPLICIT_ALPHA_AMD     = 0x8C93,
        GL_ATC_RGBA_INTERPOLATED_ALPHA_AMD = 0x87EE;

    private AMDCompressedATCTexture() {}

}
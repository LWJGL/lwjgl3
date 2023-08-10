/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/APPLE/APPLE_texture_format_BGRA8888.txt">APPLE_texture_format_BGRA8888</a> extension.
 * 
 * <p>This extension introduces BGRA_EXT as an acceptable external format. This avoids byte swizzling when loading RGBA internal format textures, which may
 * be stored in BGRA order internally.</p>
 */
public final class APPLETextureFormatBGRA8888 {

    /** Accepted by the {@code format} parameters of TexImage2D and TexSubImage2D. */
    public static final int GL_BGRA_EXT = 0x80E1;

    /** Accepted by the {@code internalformat} parameters of TexStorage2D and TexStorage3D. */
    public static final int GL_BGRA8_EXT = 0x93A1;

    private APPLETextureFormatBGRA8888() {}

}
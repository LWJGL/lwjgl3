/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_texture_sRGB_R8.txt">EXT_texture_sRGB_R8</a> extension.
 * 
 * <p>This extension introduces SR8_EXT as an acceptable internal format. This allows efficient sRGB sampling for source images stored as a separate texture
 * per channel.</p>
 * 
 * <p>Requires {@link GLES30 GLES 3.0}.</p>
 */
public final class EXTTextureSRGBR8 {

    /** Accepted by the {@code internalformat} parameters of TexImage2D, TexImage3D, TexStorage2D and TexStorage3D. */
    public static final int GL_SR8_EXT = 0x8FBD;

    private EXTTextureSRGBR8() {}

}
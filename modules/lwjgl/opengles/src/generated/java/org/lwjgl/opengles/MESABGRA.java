/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/MESA/MESA_bgra.txt">MESA_bgra</a> extension.
 * 
 * <p>{@code MESA_bgra} extends the list of combinations host-memory color formats with internal formats to include {@code BGRA} and {@code BGR} as
 * acceptable formats with {@code RGB8/SRGB8} and {@code RGBA/sRGB8_ALPHA8} as internal formats respectively. This feature is of interest in virtualized
 * environments, where the host supports OpenGL ES only, and the virtualized guest is supposed to support a subset of OpenGL including textures created
 * with the format {@code BGRA}.</p>
 */
public final class MESABGRA {

    /** Accepted by the {@code format} parameter of TexImage2D and TexSubImage2D. */
    public static final int
        GL_BGR_EXT  = 0x80E0,
        GL_BGRA_EXT = 0x80E1;

    private MESABGRA() {}

}
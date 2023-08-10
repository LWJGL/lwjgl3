/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_unpack_subimage.txt">EXT_unpack_subimage</a> extension.
 * 
 * <p>This OpenGL ES 2.0 extension adds support for GL_UNPACK_ROW_LENGTH, GL_UNPACK_SKIP_ROWS and GL_UNPACK_SKIP_PIXELS as valid enums to PixelStore. The
 * functionality is the same as in OpenGL. These are useful for updating textures with a sub-rectangle of pixel data coming from a larger image in host
 * memory.</p>
 */
public final class EXTUnpackSubimage {

    /** Accepted by the {@code pname} parameters of PixelStorei, GetIntegerv, and GetFloatv. */
    public static final int
        GL_UNPACK_ROW_LENGTH_EXT  = 0xCF2,
        GL_UNPACK_SKIP_ROWS_EXT   = 0xCF3,
        GL_UNPACK_SKIP_PIXELS_EXT = 0xCF4;

    private EXTUnpackSubimage() {}

}
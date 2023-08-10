/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_pack_subimage.txt">NV_pack_subimage</a> extension.
 * 
 * <p>This OpenGL ES 2.0 extension adds support for {@link #GL_PACK_ROW_LENGTH_NV PACK_ROW_LENGTH_NV}, {@link #GL_PACK_SKIP_ROWS_NV PACK_SKIP_ROWS_NV} and {@link #GL_PACK_SKIP_PIXELS_NV PACK_SKIP_PIXELS_NV} as valid enums to {@link GLES20#glPixelStorei PixelStorei}.</p>
 * 
 * <p>The functionality is the same as in OpenGL. These are useful to update a sub-rectangle in host memory with data that can be read from the framebuffer
 * or a texture (using FBO and texture attachments).</p>
 */
public final class NVPackSubimage {

    /** Accepted by the {@code pname} parameters of {@link GLES20#glPixelStorei PixelStorei}, {@link GLES20#glGetIntegerv GetIntegerv}, and {@link GLES20#glGetFloatv GetFloatv}. */
    public static final int
        GL_PACK_ROW_LENGTH_NV  = 0xD02,
        GL_PACK_SKIP_ROWS_NV   = 0xD03,
        GL_PACK_SKIP_PIXELS_NV = 0xD04;

    private NVPackSubimage() {}

}
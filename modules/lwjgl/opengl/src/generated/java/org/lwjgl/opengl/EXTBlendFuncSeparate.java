/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class EXTBlendFuncSeparate {

    static { GL.initialize(); }

    public static final int
        GL_BLEND_DST_RGB_EXT   = 0x80C8,
        GL_BLEND_SRC_RGB_EXT   = 0x80C9,
        GL_BLEND_DST_ALPHA_EXT = 0x80CA,
        GL_BLEND_SRC_ALPHA_EXT = 0x80CB;

    protected EXTBlendFuncSeparate() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBlendFuncSeparateEXT ] ---

    /** {@code void glBlendFuncSeparateEXT(GLenum sfactorRGB, GLenum dfactorRGB, GLenum sfactorAlpha, GLenum dfactorAlpha)} */
    public static native void glBlendFuncSeparateEXT(@NativeType("GLenum") int sfactorRGB, @NativeType("GLenum") int dfactorRGB, @NativeType("GLenum") int sfactorAlpha, @NativeType("GLenum") int dfactorAlpha);

}
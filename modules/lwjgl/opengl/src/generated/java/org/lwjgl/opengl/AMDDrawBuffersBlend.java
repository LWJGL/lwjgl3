/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class AMDDrawBuffersBlend {

    static { GL.initialize(); }

    protected AMDDrawBuffersBlend() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBlendFuncIndexedAMD ] ---

    /** {@code void glBlendFuncIndexedAMD(GLuint buf, GLenum src, GLenum dst)} */
    public static native void glBlendFuncIndexedAMD(@NativeType("GLuint") int buf, @NativeType("GLenum") int src, @NativeType("GLenum") int dst);

    // --- [ glBlendFuncSeparateIndexedAMD ] ---

    /** {@code void glBlendFuncSeparateIndexedAMD(GLuint buf, GLenum srcRGB, GLenum dstRGB, GLenum srcAlpha, GLenum dstAlpha)} */
    public static native void glBlendFuncSeparateIndexedAMD(@NativeType("GLuint") int buf, @NativeType("GLenum") int srcRGB, @NativeType("GLenum") int dstRGB, @NativeType("GLenum") int srcAlpha, @NativeType("GLenum") int dstAlpha);

    // --- [ glBlendEquationIndexedAMD ] ---

    /** {@code void glBlendEquationIndexedAMD(GLuint buf, GLenum mode)} */
    public static native void glBlendEquationIndexedAMD(@NativeType("GLuint") int buf, @NativeType("GLenum") int mode);

    // --- [ glBlendEquationSeparateIndexedAMD ] ---

    /** {@code void glBlendEquationSeparateIndexedAMD(GLuint buf, GLenum modeRGB, GLenum modeAlpha)} */
    public static native void glBlendEquationSeparateIndexedAMD(@NativeType("GLuint") int buf, @NativeType("GLenum") int modeRGB, @NativeType("GLenum") int modeAlpha);

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

public class EXTDrawBuffersIndexed {

    static { GLES.initialize(); }

    protected EXTDrawBuffersIndexed() {
        throw new UnsupportedOperationException();
    }

    // --- [ glEnableiEXT ] ---

    /** {@code void glEnableiEXT(GLenum target, GLuint index)} */
    public static native void glEnableiEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index);

    // --- [ glDisableiEXT ] ---

    /** {@code void glDisableiEXT(GLenum target, GLuint index)} */
    public static native void glDisableiEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index);

    // --- [ glBlendEquationiEXT ] ---

    /** {@code void glBlendEquationiEXT(GLuint buf, GLenum mode)} */
    public static native void glBlendEquationiEXT(@NativeType("GLuint") int buf, @NativeType("GLenum") int mode);

    // --- [ glBlendEquationSeparateiEXT ] ---

    /** {@code void glBlendEquationSeparateiEXT(GLuint buf, GLenum modeRGB, GLenum modeAlpha)} */
    public static native void glBlendEquationSeparateiEXT(@NativeType("GLuint") int buf, @NativeType("GLenum") int modeRGB, @NativeType("GLenum") int modeAlpha);

    // --- [ glBlendFunciEXT ] ---

    /** {@code void glBlendFunciEXT(GLuint buf, GLenum src, GLenum dst)} */
    public static native void glBlendFunciEXT(@NativeType("GLuint") int buf, @NativeType("GLenum") int src, @NativeType("GLenum") int dst);

    // --- [ glBlendFuncSeparateiEXT ] ---

    /** {@code void glBlendFuncSeparateiEXT(GLuint buf, GLenum srcRGB, GLenum dstRGB, GLenum srcAlpha, GLenum dstAlpha)} */
    public static native void glBlendFuncSeparateiEXT(@NativeType("GLuint") int buf, @NativeType("GLenum") int srcRGB, @NativeType("GLenum") int dstRGB, @NativeType("GLenum") int srcAlpha, @NativeType("GLenum") int dstAlpha);

    // --- [ glColorMaskiEXT ] ---

    /** {@code void glColorMaskiEXT(GLuint index, GLboolean r, GLboolean g, GLboolean b, GLboolean a)} */
    public static native void glColorMaskiEXT(@NativeType("GLuint") int index, @NativeType("GLboolean") boolean r, @NativeType("GLboolean") boolean g, @NativeType("GLboolean") boolean b, @NativeType("GLboolean") boolean a);

    // --- [ glIsEnablediEXT ] ---

    /** {@code GLboolean glIsEnablediEXT(GLenum target, GLuint index)} */
    @NativeType("GLboolean")
    public static native boolean glIsEnablediEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index);

}
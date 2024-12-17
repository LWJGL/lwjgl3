/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

public class OESDrawBuffersIndexed {

    static { GLES.initialize(); }

    protected OESDrawBuffersIndexed() {
        throw new UnsupportedOperationException();
    }

    // --- [ glEnableiOES ] ---

    /** {@code void glEnableiOES(GLenum target, GLuint index)} */
    public static native void glEnableiOES(@NativeType("GLenum") int target, @NativeType("GLuint") int index);

    // --- [ glDisableiOES ] ---

    /** {@code void glDisableiOES(GLenum target, GLuint index)} */
    public static native void glDisableiOES(@NativeType("GLenum") int target, @NativeType("GLuint") int index);

    // --- [ glBlendEquationiOES ] ---

    /** {@code void glBlendEquationiOES(GLuint buf, GLenum mode)} */
    public static native void glBlendEquationiOES(@NativeType("GLuint") int buf, @NativeType("GLenum") int mode);

    // --- [ glBlendEquationSeparateiOES ] ---

    /** {@code void glBlendEquationSeparateiOES(GLuint buf, GLenum modeRGB, GLenum modeAlpha)} */
    public static native void glBlendEquationSeparateiOES(@NativeType("GLuint") int buf, @NativeType("GLenum") int modeRGB, @NativeType("GLenum") int modeAlpha);

    // --- [ glBlendFunciOES ] ---

    /** {@code void glBlendFunciOES(GLuint buf, GLenum src, GLenum dst)} */
    public static native void glBlendFunciOES(@NativeType("GLuint") int buf, @NativeType("GLenum") int src, @NativeType("GLenum") int dst);

    // --- [ glBlendFuncSeparateiOES ] ---

    /** {@code void glBlendFuncSeparateiOES(GLuint buf, GLenum srcRGB, GLenum dstRGB, GLenum srcAlpha, GLenum dstAlpha)} */
    public static native void glBlendFuncSeparateiOES(@NativeType("GLuint") int buf, @NativeType("GLenum") int srcRGB, @NativeType("GLenum") int dstRGB, @NativeType("GLenum") int srcAlpha, @NativeType("GLenum") int dstAlpha);

    // --- [ glColorMaskiOES ] ---

    /** {@code void glColorMaskiOES(GLuint index, GLboolean r, GLboolean g, GLboolean b, GLboolean a)} */
    public static native void glColorMaskiOES(@NativeType("GLuint") int index, @NativeType("GLboolean") boolean r, @NativeType("GLboolean") boolean g, @NativeType("GLboolean") boolean b, @NativeType("GLboolean") boolean a);

    // --- [ glIsEnablediOES ] ---

    /** {@code GLboolean glIsEnablediOES(GLenum target, GLuint index)} */
    @NativeType("GLboolean")
    public static native boolean glIsEnablediOES(@NativeType("GLenum") int target, @NativeType("GLuint") int index);

}
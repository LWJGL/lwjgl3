/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class ARBDrawBuffersBlend {

    static { GL.initialize(); }

    protected ARBDrawBuffersBlend() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBlendEquationiARB ] ---

    /** {@code void glBlendEquationiARB(GLuint buf, GLenum mode)} */
    public static native void glBlendEquationiARB(@NativeType("GLuint") int buf, @NativeType("GLenum") int mode);

    // --- [ glBlendEquationSeparateiARB ] ---

    /** {@code void glBlendEquationSeparateiARB(GLuint buf, GLenum modeRGB, GLenum modeAlpha)} */
    public static native void glBlendEquationSeparateiARB(@NativeType("GLuint") int buf, @NativeType("GLenum") int modeRGB, @NativeType("GLenum") int modeAlpha);

    // --- [ glBlendFunciARB ] ---

    /** {@code void glBlendFunciARB(GLuint buf, GLenum src, GLenum dst)} */
    public static native void glBlendFunciARB(@NativeType("GLuint") int buf, @NativeType("GLenum") int src, @NativeType("GLenum") int dst);

    // --- [ glBlendFuncSeparateiARB ] ---

    /** {@code void glBlendFuncSeparateiARB(GLuint buf, GLenum srcRGB, GLenum dstRGB, GLenum srcAlpha, GLenum dstAlpha)} */
    public static native void glBlendFuncSeparateiARB(@NativeType("GLuint") int buf, @NativeType("GLenum") int srcRGB, @NativeType("GLenum") int dstRGB, @NativeType("GLenum") int srcAlpha, @NativeType("GLenum") int dstAlpha);

}
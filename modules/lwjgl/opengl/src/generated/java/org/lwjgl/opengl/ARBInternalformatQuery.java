/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

public class ARBInternalformatQuery {

    static { GL.initialize(); }

    public static final int GL_NUM_SAMPLE_COUNTS = 0x9380;

    protected ARBInternalformatQuery() {
        throw new UnsupportedOperationException();
    }

    // --- [ glGetInternalformativ ] ---

    /** {@code void glGetInternalformativ(GLenum target, GLenum internalformat, GLenum pname, GLsizei bufSize, GLint * params)} */
    public static void nglGetInternalformativ(int target, int internalformat, int pname, int bufSize, long params) {
        GL42C.nglGetInternalformativ(target, internalformat, pname, bufSize, params);
    }

    /** {@code void glGetInternalformativ(GLenum target, GLenum internalformat, GLenum pname, GLsizei bufSize, GLint * params)} */
    public static void glGetInternalformativ(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        GL42C.glGetInternalformativ(target, internalformat, pname, params);
    }

    /** {@code void glGetInternalformativ(GLenum target, GLenum internalformat, GLenum pname, GLsizei bufSize, GLint * params)} */
    @NativeType("void")
    public static int glGetInternalformati(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int pname) {
        return GL42C.glGetInternalformati(target, internalformat, pname);
    }

    /** {@code void glGetInternalformativ(GLenum target, GLenum internalformat, GLenum pname, GLsizei bufSize, GLint * params)} */
    public static void glGetInternalformativ(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        GL42C.glGetInternalformativ(target, internalformat, pname, params);
    }

}
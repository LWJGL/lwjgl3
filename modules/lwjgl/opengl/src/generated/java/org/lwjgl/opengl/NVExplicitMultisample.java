/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class NVExplicitMultisample {

    static { GL.initialize(); }

    public static final int GL_SAMPLE_POSITION_NV = 0x8E50;

    public static final int GL_SAMPLE_MASK_NV = 0x8E51;

    public static final int GL_SAMPLE_MASK_VALUE_NV = 0x8E52;

    public static final int
        GL_TEXTURE_BINDING_RENDERBUFFER_NV            = 0x8E53,
        GL_TEXTURE_RENDERBUFFER_DATA_STORE_BINDING_NV = 0x8E54,
        GL_MAX_SAMPLE_MASK_WORDS_NV                   = 0x8E59;

    public static final int GL_TEXTURE_RENDERBUFFER_NV = 0x8E55;

    public static final int
        GL_SAMPLER_RENDERBUFFER_NV              = 0x8E56,
        GL_INT_SAMPLER_RENDERBUFFER_NV          = 0x8E57,
        GL_UNSIGNED_INT_SAMPLER_RENDERBUFFER_NV = 0x8E58;

    protected NVExplicitMultisample() {
        throw new UnsupportedOperationException();
    }

    // --- [ glGetMultisamplefvNV ] ---

    /** {@code void glGetMultisamplefvNV(GLenum pname, GLuint index, GLfloat * val)} */
    public static native void nglGetMultisamplefvNV(int pname, int index, long val);

    /** {@code void glGetMultisamplefvNV(GLenum pname, GLuint index, GLfloat * val)} */
    public static void glGetMultisamplefvNV(@NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLfloat *") FloatBuffer val) {
        if (CHECKS) {
            check(val, 2);
        }
        nglGetMultisamplefvNV(pname, index, memAddress(val));
    }

    // --- [ glSampleMaskIndexedNV ] ---

    /** {@code void glSampleMaskIndexedNV(GLuint index, GLbitfield mask)} */
    public static native void glSampleMaskIndexedNV(@NativeType("GLuint") int index, @NativeType("GLbitfield") int mask);

    // --- [ glTexRenderbufferNV ] ---

    /** {@code void glTexRenderbufferNV(GLenum target, GLuint renderbuffer)} */
    public static native void glTexRenderbufferNV(@NativeType("GLenum") int target, @NativeType("GLuint") int renderbuffer);

    /** {@code void glGetMultisamplefvNV(GLenum pname, GLuint index, GLfloat * val)} */
    public static void glGetMultisamplefvNV(@NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLfloat *") float[] val) {
        long __functionAddress = GL.getICD().glGetMultisamplefvNV;
        if (CHECKS) {
            check(__functionAddress);
            check(val, 2);
        }
        callPV(pname, index, val, __functionAddress);
    }

}
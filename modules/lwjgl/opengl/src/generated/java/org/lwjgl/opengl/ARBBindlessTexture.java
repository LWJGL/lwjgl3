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
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class ARBBindlessTexture {

    static { GL.initialize(); }

    public static final int GL_UNSIGNED_INT64_ARB = 0x140F;

    protected ARBBindlessTexture() {
        throw new UnsupportedOperationException();
    }

    // --- [ glGetTextureHandleARB ] ---

    /** {@code GLuint64 glGetTextureHandleARB(GLuint texture)} */
    @NativeType("GLuint64")
    public static native long glGetTextureHandleARB(@NativeType("GLuint") int texture);

    // --- [ glGetTextureSamplerHandleARB ] ---

    /** {@code GLuint64 glGetTextureSamplerHandleARB(GLuint texture, GLuint sampler)} */
    @NativeType("GLuint64")
    public static native long glGetTextureSamplerHandleARB(@NativeType("GLuint") int texture, @NativeType("GLuint") int sampler);

    // --- [ glMakeTextureHandleResidentARB ] ---

    /** {@code void glMakeTextureHandleResidentARB(GLuint64 handle)} */
    public static native void glMakeTextureHandleResidentARB(@NativeType("GLuint64") long handle);

    // --- [ glMakeTextureHandleNonResidentARB ] ---

    /** {@code void glMakeTextureHandleNonResidentARB(GLuint64 handle)} */
    public static native void glMakeTextureHandleNonResidentARB(@NativeType("GLuint64") long handle);

    // --- [ glGetImageHandleARB ] ---

    /** {@code GLuint64 glGetImageHandleARB(GLuint texture, GLint level, GLboolean layered, GLint layer, GLenum format)} */
    @NativeType("GLuint64")
    public static native long glGetImageHandleARB(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLboolean") boolean layered, @NativeType("GLint") int layer, @NativeType("GLenum") int format);

    // --- [ glMakeImageHandleResidentARB ] ---

    /** {@code void glMakeImageHandleResidentARB(GLuint64 handle, GLenum access)} */
    public static native void glMakeImageHandleResidentARB(@NativeType("GLuint64") long handle, @NativeType("GLenum") int access);

    // --- [ glMakeImageHandleNonResidentARB ] ---

    /** {@code void glMakeImageHandleNonResidentARB(GLuint64 handle)} */
    public static native void glMakeImageHandleNonResidentARB(@NativeType("GLuint64") long handle);

    // --- [ glUniformHandleui64ARB ] ---

    /** {@code void glUniformHandleui64ARB(GLint location, GLuint64 value)} */
    public static native void glUniformHandleui64ARB(@NativeType("GLint") int location, @NativeType("GLuint64") long value);

    // --- [ glUniformHandleui64vARB ] ---

    /** {@code void glUniformHandleui64vARB(GLint location, GLsizei count, GLuint64 const * values)} */
    public static native void nglUniformHandleui64vARB(int location, int count, long values);

    /** {@code void glUniformHandleui64vARB(GLint location, GLsizei count, GLuint64 const * values)} */
    public static void glUniformHandleui64vARB(@NativeType("GLint") int location, @NativeType("GLuint64 const *") LongBuffer values) {
        nglUniformHandleui64vARB(location, values.remaining(), memAddress(values));
    }

    // --- [ glProgramUniformHandleui64ARB ] ---

    /** {@code void glProgramUniformHandleui64ARB(GLuint program, GLint location, GLuint64 value)} */
    public static native void glProgramUniformHandleui64ARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64") long value);

    // --- [ glProgramUniformHandleui64vARB ] ---

    /** {@code void glProgramUniformHandleui64vARB(GLuint program, GLint location, GLsizei count, GLuint64 const * values)} */
    public static native void nglProgramUniformHandleui64vARB(int program, int location, int count, long values);

    /** {@code void glProgramUniformHandleui64vARB(GLuint program, GLint location, GLsizei count, GLuint64 const * values)} */
    public static void glProgramUniformHandleui64vARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64 const *") LongBuffer values) {
        nglProgramUniformHandleui64vARB(program, location, values.remaining(), memAddress(values));
    }

    // --- [ glIsTextureHandleResidentARB ] ---

    /** {@code GLboolean glIsTextureHandleResidentARB(GLuint64 handle)} */
    @NativeType("GLboolean")
    public static native boolean glIsTextureHandleResidentARB(@NativeType("GLuint64") long handle);

    // --- [ glIsImageHandleResidentARB ] ---

    /** {@code GLboolean glIsImageHandleResidentARB(GLuint64 handle)} */
    @NativeType("GLboolean")
    public static native boolean glIsImageHandleResidentARB(@NativeType("GLuint64") long handle);

    // --- [ glVertexAttribL1ui64ARB ] ---

    /** {@code void glVertexAttribL1ui64ARB(GLuint index, GLuint64 x)} */
    public static native void glVertexAttribL1ui64ARB(@NativeType("GLuint") int index, @NativeType("GLuint64") long x);

    // --- [ glVertexAttribL1ui64vARB ] ---

    /** {@code void glVertexAttribL1ui64vARB(GLuint index, GLuint64 const * v)} */
    public static native void nglVertexAttribL1ui64vARB(int index, long v);

    /** {@code void glVertexAttribL1ui64vARB(GLuint index, GLuint64 const * v)} */
    public static void glVertexAttribL1ui64vARB(@NativeType("GLuint") int index, @NativeType("GLuint64 const *") LongBuffer v) {
        if (CHECKS) {
            check(v, 1);
        }
        nglVertexAttribL1ui64vARB(index, memAddress(v));
    }

    // --- [ glGetVertexAttribLui64vARB ] ---

    /** {@code void glGetVertexAttribLui64vARB(GLuint index, GLenum pname, GLuint64 * params)} */
    public static native void nglGetVertexAttribLui64vARB(int index, int pname, long params);

    /** {@code void glGetVertexAttribLui64vARB(GLuint index, GLenum pname, GLuint64 * params)} */
    public static void glGetVertexAttribLui64vARB(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLuint64 *") LongBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetVertexAttribLui64vARB(index, pname, memAddress(params));
    }

    /** {@code void glGetVertexAttribLui64vARB(GLuint index, GLenum pname, GLuint64 * params)} */
    @NativeType("void")
    public static long glGetVertexAttribLui64ARB(@NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer params = stack.callocLong(1);
            nglGetVertexAttribLui64vARB(index, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glUniformHandleui64vARB(GLint location, GLsizei count, GLuint64 const * values)} */
    public static void glUniformHandleui64vARB(@NativeType("GLint") int location, @NativeType("GLuint64 const *") long[] values) {
        long __functionAddress = GL.getICD().glUniformHandleui64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, values.length, values, __functionAddress);
    }

    /** {@code void glProgramUniformHandleui64vARB(GLuint program, GLint location, GLsizei count, GLuint64 const * values)} */
    public static void glProgramUniformHandleui64vARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64 const *") long[] values) {
        long __functionAddress = GL.getICD().glProgramUniformHandleui64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, values.length, values, __functionAddress);
    }

    /** {@code void glVertexAttribL1ui64vARB(GLuint index, GLuint64 const * v)} */
    public static void glVertexAttribL1ui64vARB(@NativeType("GLuint") int index, @NativeType("GLuint64 const *") long[] v) {
        long __functionAddress = GL.getICD().glVertexAttribL1ui64vARB;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 1);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glGetVertexAttribLui64vARB(GLuint index, GLenum pname, GLuint64 * params)} */
    public static void glGetVertexAttribLui64vARB(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLuint64 *") long[] params) {
        long __functionAddress = GL.getICD().glGetVertexAttribLui64vARB;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(index, pname, params, __functionAddress);
    }

}
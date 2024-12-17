/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class NVNonSquareMatrices {

    static { GLES.initialize(); }

    public static final int
        GL_FLOAT_MAT2x3_NV = 0x8B65,
        GL_FLOAT_MAT2x4_NV = 0x8B66,
        GL_FLOAT_MAT3x2_NV = 0x8B67,
        GL_FLOAT_MAT3x4_NV = 0x8B68,
        GL_FLOAT_MAT4x2_NV = 0x8B69,
        GL_FLOAT_MAT4x3_NV = 0x8B6A;

    protected NVNonSquareMatrices() {
        throw new UnsupportedOperationException();
    }

    // --- [ glUniformMatrix2x3fvNV ] ---

    /** {@code void glUniformMatrix2x3fvNV(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglUniformMatrix2x3fvNV(int location, int count, boolean transpose, long value);

    /** {@code void glUniformMatrix2x3fvNV(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glUniformMatrix2x3fvNV(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglUniformMatrix2x3fvNV(location, value.remaining() / 6, transpose, memAddress(value));
    }

    // --- [ glUniformMatrix3x2fvNV ] ---

    /** {@code void glUniformMatrix3x2fvNV(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglUniformMatrix3x2fvNV(int location, int count, boolean transpose, long value);

    /** {@code void glUniformMatrix3x2fvNV(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glUniformMatrix3x2fvNV(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglUniformMatrix3x2fvNV(location, value.remaining() / 6, transpose, memAddress(value));
    }

    // --- [ glUniformMatrix2x4fvNV ] ---

    /** {@code void glUniformMatrix2x4fvNV(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglUniformMatrix2x4fvNV(int location, int count, boolean transpose, long value);

    /** {@code void glUniformMatrix2x4fvNV(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glUniformMatrix2x4fvNV(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglUniformMatrix2x4fvNV(location, value.remaining() >> 3, transpose, memAddress(value));
    }

    // --- [ glUniformMatrix4x2fvNV ] ---

    /** {@code void glUniformMatrix4x2fvNV(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglUniformMatrix4x2fvNV(int location, int count, boolean transpose, long value);

    /** {@code void glUniformMatrix4x2fvNV(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glUniformMatrix4x2fvNV(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglUniformMatrix4x2fvNV(location, value.remaining() >> 3, transpose, memAddress(value));
    }

    // --- [ glUniformMatrix3x4fvNV ] ---

    /** {@code void glUniformMatrix3x4fvNV(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglUniformMatrix3x4fvNV(int location, int count, boolean transpose, long value);

    /** {@code void glUniformMatrix3x4fvNV(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glUniformMatrix3x4fvNV(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglUniformMatrix3x4fvNV(location, value.remaining() / 12, transpose, memAddress(value));
    }

    // --- [ glUniformMatrix4x3fvNV ] ---

    /** {@code void glUniformMatrix4x3fvNV(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglUniformMatrix4x3fvNV(int location, int count, boolean transpose, long value);

    /** {@code void glUniformMatrix4x3fvNV(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glUniformMatrix4x3fvNV(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglUniformMatrix4x3fvNV(location, value.remaining() / 12, transpose, memAddress(value));
    }

    /** {@code void glUniformMatrix2x3fvNV(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glUniformMatrix2x3fvNV(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glUniformMatrix2x3fvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length / 6, transpose, value, __functionAddress);
    }

    /** {@code void glUniformMatrix3x2fvNV(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glUniformMatrix3x2fvNV(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glUniformMatrix3x2fvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length / 6, transpose, value, __functionAddress);
    }

    /** {@code void glUniformMatrix2x4fvNV(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glUniformMatrix2x4fvNV(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glUniformMatrix2x4fvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length >> 3, transpose, value, __functionAddress);
    }

    /** {@code void glUniformMatrix4x2fvNV(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glUniformMatrix4x2fvNV(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glUniformMatrix4x2fvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length >> 3, transpose, value, __functionAddress);
    }

    /** {@code void glUniformMatrix3x4fvNV(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glUniformMatrix3x4fvNV(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glUniformMatrix3x4fvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length / 12, transpose, value, __functionAddress);
    }

    /** {@code void glUniformMatrix4x3fvNV(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glUniformMatrix4x3fvNV(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glUniformMatrix4x3fvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length / 12, transpose, value, __functionAddress);
    }

}
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

public class ARBGPUShaderFP64 {

    static { GL.initialize(); }

    public static final int
        GL_DOUBLE_VEC2   = 0x8FFC,
        GL_DOUBLE_VEC3   = 0x8FFD,
        GL_DOUBLE_VEC4   = 0x8FFE,
        GL_DOUBLE_MAT2   = 0x8F46,
        GL_DOUBLE_MAT3   = 0x8F47,
        GL_DOUBLE_MAT4   = 0x8F48,
        GL_DOUBLE_MAT2x3 = 0x8F49,
        GL_DOUBLE_MAT2x4 = 0x8F4A,
        GL_DOUBLE_MAT3x2 = 0x8F4B,
        GL_DOUBLE_MAT3x4 = 0x8F4C,
        GL_DOUBLE_MAT4x2 = 0x8F4D,
        GL_DOUBLE_MAT4x3 = 0x8F4E;

    protected ARBGPUShaderFP64() {
        throw new UnsupportedOperationException();
    }

    // --- [ glUniform1d ] ---

    /** {@code void glUniform1d(GLint location, GLdouble x)} */
    public static void glUniform1d(@NativeType("GLint") int location, @NativeType("GLdouble") double x) {
        GL40C.glUniform1d(location, x);
    }

    // --- [ glUniform2d ] ---

    /** {@code void glUniform2d(GLint location, GLdouble x, GLdouble y)} */
    public static void glUniform2d(@NativeType("GLint") int location, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y) {
        GL40C.glUniform2d(location, x, y);
    }

    // --- [ glUniform3d ] ---

    /** {@code void glUniform3d(GLint location, GLdouble x, GLdouble y, GLdouble z)} */
    public static void glUniform3d(@NativeType("GLint") int location, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z) {
        GL40C.glUniform3d(location, x, y, z);
    }

    // --- [ glUniform4d ] ---

    /** {@code void glUniform4d(GLint location, GLdouble x, GLdouble y, GLdouble z, GLdouble w)} */
    public static void glUniform4d(@NativeType("GLint") int location, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z, @NativeType("GLdouble") double w) {
        GL40C.glUniform4d(location, x, y, z, w);
    }

    // --- [ glUniform1dv ] ---

    /** {@code void glUniform1dv(GLint location, GLsizei count, GLdouble const * value)} */
    public static void nglUniform1dv(int location, int count, long value) {
        GL40C.nglUniform1dv(location, count, value);
    }

    /** {@code void glUniform1dv(GLint location, GLsizei count, GLdouble const * value)} */
    public static void glUniform1dv(@NativeType("GLint") int location, @NativeType("GLdouble const *") DoubleBuffer value) {
        GL40C.glUniform1dv(location, value);
    }

    // --- [ glUniform2dv ] ---

    /** {@code void glUniform2dv(GLint location, GLsizei count, GLdouble const * value)} */
    public static void nglUniform2dv(int location, int count, long value) {
        GL40C.nglUniform2dv(location, count, value);
    }

    /** {@code void glUniform2dv(GLint location, GLsizei count, GLdouble const * value)} */
    public static void glUniform2dv(@NativeType("GLint") int location, @NativeType("GLdouble const *") DoubleBuffer value) {
        GL40C.glUniform2dv(location, value);
    }

    // --- [ glUniform3dv ] ---

    /** {@code void glUniform3dv(GLint location, GLsizei count, GLdouble const * value)} */
    public static void nglUniform3dv(int location, int count, long value) {
        GL40C.nglUniform3dv(location, count, value);
    }

    /** {@code void glUniform3dv(GLint location, GLsizei count, GLdouble const * value)} */
    public static void glUniform3dv(@NativeType("GLint") int location, @NativeType("GLdouble const *") DoubleBuffer value) {
        GL40C.glUniform3dv(location, value);
    }

    // --- [ glUniform4dv ] ---

    /** {@code void glUniform4dv(GLint location, GLsizei count, GLdouble const * value)} */
    public static void nglUniform4dv(int location, int count, long value) {
        GL40C.nglUniform4dv(location, count, value);
    }

    /** {@code void glUniform4dv(GLint location, GLsizei count, GLdouble const * value)} */
    public static void glUniform4dv(@NativeType("GLint") int location, @NativeType("GLdouble const *") DoubleBuffer value) {
        GL40C.glUniform4dv(location, value);
    }

    // --- [ glUniformMatrix2dv ] ---

    /** {@code void glUniformMatrix2dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void nglUniformMatrix2dv(int location, int count, boolean transpose, long value) {
        GL40C.nglUniformMatrix2dv(location, count, transpose, value);
    }

    /** {@code void glUniformMatrix2dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glUniformMatrix2dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        GL40C.glUniformMatrix2dv(location, transpose, value);
    }

    // --- [ glUniformMatrix3dv ] ---

    /** {@code void glUniformMatrix3dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void nglUniformMatrix3dv(int location, int count, boolean transpose, long value) {
        GL40C.nglUniformMatrix3dv(location, count, transpose, value);
    }

    /** {@code void glUniformMatrix3dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glUniformMatrix3dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        GL40C.glUniformMatrix3dv(location, transpose, value);
    }

    // --- [ glUniformMatrix4dv ] ---

    /** {@code void glUniformMatrix4dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void nglUniformMatrix4dv(int location, int count, boolean transpose, long value) {
        GL40C.nglUniformMatrix4dv(location, count, transpose, value);
    }

    /** {@code void glUniformMatrix4dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glUniformMatrix4dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        GL40C.glUniformMatrix4dv(location, transpose, value);
    }

    // --- [ glUniformMatrix2x3dv ] ---

    /** {@code void glUniformMatrix2x3dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void nglUniformMatrix2x3dv(int location, int count, boolean transpose, long value) {
        GL40C.nglUniformMatrix2x3dv(location, count, transpose, value);
    }

    /** {@code void glUniformMatrix2x3dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glUniformMatrix2x3dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        GL40C.glUniformMatrix2x3dv(location, transpose, value);
    }

    // --- [ glUniformMatrix2x4dv ] ---

    /** {@code void glUniformMatrix2x4dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void nglUniformMatrix2x4dv(int location, int count, boolean transpose, long value) {
        GL40C.nglUniformMatrix2x4dv(location, count, transpose, value);
    }

    /** {@code void glUniformMatrix2x4dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glUniformMatrix2x4dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        GL40C.glUniformMatrix2x4dv(location, transpose, value);
    }

    // --- [ glUniformMatrix3x2dv ] ---

    /** {@code void glUniformMatrix3x2dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void nglUniformMatrix3x2dv(int location, int count, boolean transpose, long value) {
        GL40C.nglUniformMatrix3x2dv(location, count, transpose, value);
    }

    /** {@code void glUniformMatrix3x2dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glUniformMatrix3x2dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        GL40C.glUniformMatrix3x2dv(location, transpose, value);
    }

    // --- [ glUniformMatrix3x4dv ] ---

    /** {@code void glUniformMatrix3x4dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void nglUniformMatrix3x4dv(int location, int count, boolean transpose, long value) {
        GL40C.nglUniformMatrix3x4dv(location, count, transpose, value);
    }

    /** {@code void glUniformMatrix3x4dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glUniformMatrix3x4dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        GL40C.glUniformMatrix3x4dv(location, transpose, value);
    }

    // --- [ glUniformMatrix4x2dv ] ---

    /** {@code void glUniformMatrix4x2dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void nglUniformMatrix4x2dv(int location, int count, boolean transpose, long value) {
        GL40C.nglUniformMatrix4x2dv(location, count, transpose, value);
    }

    /** {@code void glUniformMatrix4x2dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glUniformMatrix4x2dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        GL40C.glUniformMatrix4x2dv(location, transpose, value);
    }

    // --- [ glUniformMatrix4x3dv ] ---

    /** {@code void glUniformMatrix4x3dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void nglUniformMatrix4x3dv(int location, int count, boolean transpose, long value) {
        GL40C.nglUniformMatrix4x3dv(location, count, transpose, value);
    }

    /** {@code void glUniformMatrix4x3dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glUniformMatrix4x3dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        GL40C.glUniformMatrix4x3dv(location, transpose, value);
    }

    // --- [ glGetUniformdv ] ---

    /** {@code void glGetUniformdv(GLuint program, GLint location, GLdouble * params)} */
    public static void nglGetUniformdv(int program, int location, long params) {
        GL40C.nglGetUniformdv(program, location, params);
    }

    /** {@code void glGetUniformdv(GLuint program, GLint location, GLdouble * params)} */
    public static void glGetUniformdv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble *") DoubleBuffer params) {
        GL40C.glGetUniformdv(program, location, params);
    }

    /** {@code void glGetUniformdv(GLuint program, GLint location, GLdouble * params)} */
    @NativeType("void")
    public static double glGetUniformd(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        return GL40C.glGetUniformd(program, location);
    }

    // --- [ glProgramUniform1dEXT ] ---

    /** {@code void glProgramUniform1dEXT(GLuint program, GLint location, GLdouble x)} */
    public static native void glProgramUniform1dEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble") double x);

    // --- [ glProgramUniform2dEXT ] ---

    /** {@code void glProgramUniform2dEXT(GLuint program, GLint location, GLdouble x, GLdouble y)} */
    public static native void glProgramUniform2dEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y);

    // --- [ glProgramUniform3dEXT ] ---

    /** {@code void glProgramUniform3dEXT(GLuint program, GLint location, GLdouble x, GLdouble y, GLdouble z)} */
    public static native void glProgramUniform3dEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z);

    // --- [ glProgramUniform4dEXT ] ---

    /** {@code void glProgramUniform4dEXT(GLuint program, GLint location, GLdouble x, GLdouble y, GLdouble z, GLdouble w)} */
    public static native void glProgramUniform4dEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z, @NativeType("GLdouble") double w);

    // --- [ glProgramUniform1dvEXT ] ---

    /** {@code void glProgramUniform1dvEXT(GLuint program, GLint location, GLsizei count, GLdouble const * value)} */
    public static native void nglProgramUniform1dvEXT(int program, int location, int count, long value);

    /** {@code void glProgramUniform1dvEXT(GLuint program, GLint location, GLsizei count, GLdouble const * value)} */
    public static void glProgramUniform1dvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble const *") DoubleBuffer value) {
        nglProgramUniform1dvEXT(program, location, value.remaining(), memAddress(value));
    }

    // --- [ glProgramUniform2dvEXT ] ---

    /** {@code void glProgramUniform2dvEXT(GLuint program, GLint location, GLsizei count, GLdouble const * value)} */
    public static native void nglProgramUniform2dvEXT(int program, int location, int count, long value);

    /** {@code void glProgramUniform2dvEXT(GLuint program, GLint location, GLsizei count, GLdouble const * value)} */
    public static void glProgramUniform2dvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble const *") DoubleBuffer value) {
        nglProgramUniform2dvEXT(program, location, value.remaining() >> 1, memAddress(value));
    }

    // --- [ glProgramUniform3dvEXT ] ---

    /** {@code void glProgramUniform3dvEXT(GLuint program, GLint location, GLsizei count, GLdouble const * value)} */
    public static native void nglProgramUniform3dvEXT(int program, int location, int count, long value);

    /** {@code void glProgramUniform3dvEXT(GLuint program, GLint location, GLsizei count, GLdouble const * value)} */
    public static void glProgramUniform3dvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble const *") DoubleBuffer value) {
        nglProgramUniform3dvEXT(program, location, value.remaining() / 3, memAddress(value));
    }

    // --- [ glProgramUniform4dvEXT ] ---

    /** {@code void glProgramUniform4dvEXT(GLuint program, GLint location, GLsizei count, GLdouble const * value)} */
    public static native void nglProgramUniform4dvEXT(int program, int location, int count, long value);

    /** {@code void glProgramUniform4dvEXT(GLuint program, GLint location, GLsizei count, GLdouble const * value)} */
    public static void glProgramUniform4dvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble const *") DoubleBuffer value) {
        nglProgramUniform4dvEXT(program, location, value.remaining() >> 2, memAddress(value));
    }

    // --- [ glProgramUniformMatrix2dvEXT ] ---

    /** {@code void glProgramUniformMatrix2dvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static native void nglProgramUniformMatrix2dvEXT(int program, int location, int count, boolean transpose, long value);

    /** {@code void glProgramUniformMatrix2dvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glProgramUniformMatrix2dvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        nglProgramUniformMatrix2dvEXT(program, location, value.remaining() >> 2, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix3dvEXT ] ---

    /** {@code void glProgramUniformMatrix3dvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static native void nglProgramUniformMatrix3dvEXT(int program, int location, int count, boolean transpose, long value);

    /** {@code void glProgramUniformMatrix3dvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glProgramUniformMatrix3dvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        nglProgramUniformMatrix3dvEXT(program, location, value.remaining() / 9, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix4dvEXT ] ---

    /** {@code void glProgramUniformMatrix4dvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static native void nglProgramUniformMatrix4dvEXT(int program, int location, int count, boolean transpose, long value);

    /** {@code void glProgramUniformMatrix4dvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glProgramUniformMatrix4dvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        nglProgramUniformMatrix4dvEXT(program, location, value.remaining() >> 4, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix2x3dvEXT ] ---

    /** {@code void glProgramUniformMatrix2x3dvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static native void nglProgramUniformMatrix2x3dvEXT(int program, int location, int count, boolean transpose, long value);

    /** {@code void glProgramUniformMatrix2x3dvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glProgramUniformMatrix2x3dvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        nglProgramUniformMatrix2x3dvEXT(program, location, value.remaining() / 6, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix2x4dvEXT ] ---

    /** {@code void glProgramUniformMatrix2x4dvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static native void nglProgramUniformMatrix2x4dvEXT(int program, int location, int count, boolean transpose, long value);

    /** {@code void glProgramUniformMatrix2x4dvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glProgramUniformMatrix2x4dvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        nglProgramUniformMatrix2x4dvEXT(program, location, value.remaining() >> 3, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix3x2dvEXT ] ---

    /** {@code void glProgramUniformMatrix3x2dvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static native void nglProgramUniformMatrix3x2dvEXT(int program, int location, int count, boolean transpose, long value);

    /** {@code void glProgramUniformMatrix3x2dvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glProgramUniformMatrix3x2dvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        nglProgramUniformMatrix3x2dvEXT(program, location, value.remaining() / 6, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix3x4dvEXT ] ---

    /** {@code void glProgramUniformMatrix3x4dvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static native void nglProgramUniformMatrix3x4dvEXT(int program, int location, int count, boolean transpose, long value);

    /** {@code void glProgramUniformMatrix3x4dvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glProgramUniformMatrix3x4dvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        nglProgramUniformMatrix3x4dvEXT(program, location, value.remaining() / 12, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix4x2dvEXT ] ---

    /** {@code void glProgramUniformMatrix4x2dvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static native void nglProgramUniformMatrix4x2dvEXT(int program, int location, int count, boolean transpose, long value);

    /** {@code void glProgramUniformMatrix4x2dvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glProgramUniformMatrix4x2dvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        nglProgramUniformMatrix4x2dvEXT(program, location, value.remaining() >> 3, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix4x3dvEXT ] ---

    /** {@code void glProgramUniformMatrix4x3dvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static native void nglProgramUniformMatrix4x3dvEXT(int program, int location, int count, boolean transpose, long value);

    /** {@code void glProgramUniformMatrix4x3dvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glProgramUniformMatrix4x3dvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        nglProgramUniformMatrix4x3dvEXT(program, location, value.remaining() / 12, transpose, memAddress(value));
    }

    /** {@code void glUniform1dv(GLint location, GLsizei count, GLdouble const * value)} */
    public static void glUniform1dv(@NativeType("GLint") int location, @NativeType("GLdouble const *") double[] value) {
        GL40C.glUniform1dv(location, value);
    }

    /** {@code void glUniform2dv(GLint location, GLsizei count, GLdouble const * value)} */
    public static void glUniform2dv(@NativeType("GLint") int location, @NativeType("GLdouble const *") double[] value) {
        GL40C.glUniform2dv(location, value);
    }

    /** {@code void glUniform3dv(GLint location, GLsizei count, GLdouble const * value)} */
    public static void glUniform3dv(@NativeType("GLint") int location, @NativeType("GLdouble const *") double[] value) {
        GL40C.glUniform3dv(location, value);
    }

    /** {@code void glUniform4dv(GLint location, GLsizei count, GLdouble const * value)} */
    public static void glUniform4dv(@NativeType("GLint") int location, @NativeType("GLdouble const *") double[] value) {
        GL40C.glUniform4dv(location, value);
    }

    /** {@code void glUniformMatrix2dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glUniformMatrix2dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        GL40C.glUniformMatrix2dv(location, transpose, value);
    }

    /** {@code void glUniformMatrix3dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glUniformMatrix3dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        GL40C.glUniformMatrix3dv(location, transpose, value);
    }

    /** {@code void glUniformMatrix4dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glUniformMatrix4dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        GL40C.glUniformMatrix4dv(location, transpose, value);
    }

    /** {@code void glUniformMatrix2x3dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glUniformMatrix2x3dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        GL40C.glUniformMatrix2x3dv(location, transpose, value);
    }

    /** {@code void glUniformMatrix2x4dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glUniformMatrix2x4dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        GL40C.glUniformMatrix2x4dv(location, transpose, value);
    }

    /** {@code void glUniformMatrix3x2dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glUniformMatrix3x2dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        GL40C.glUniformMatrix3x2dv(location, transpose, value);
    }

    /** {@code void glUniformMatrix3x4dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glUniformMatrix3x4dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        GL40C.glUniformMatrix3x4dv(location, transpose, value);
    }

    /** {@code void glUniformMatrix4x2dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glUniformMatrix4x2dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        GL40C.glUniformMatrix4x2dv(location, transpose, value);
    }

    /** {@code void glUniformMatrix4x3dv(GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glUniformMatrix4x3dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        GL40C.glUniformMatrix4x3dv(location, transpose, value);
    }

    /** {@code void glGetUniformdv(GLuint program, GLint location, GLdouble * params)} */
    public static void glGetUniformdv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble *") double[] params) {
        GL40C.glGetUniformdv(program, location, params);
    }

    /** {@code void glProgramUniform1dvEXT(GLuint program, GLint location, GLsizei count, GLdouble const * value)} */
    public static void glProgramUniform1dvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble const *") double[] value) {
        long __functionAddress = GL.getICD().glProgramUniform1dvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length, value, __functionAddress);
    }

    /** {@code void glProgramUniform2dvEXT(GLuint program, GLint location, GLsizei count, GLdouble const * value)} */
    public static void glProgramUniform2dvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble const *") double[] value) {
        long __functionAddress = GL.getICD().glProgramUniform2dvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 1, value, __functionAddress);
    }

    /** {@code void glProgramUniform3dvEXT(GLuint program, GLint location, GLsizei count, GLdouble const * value)} */
    public static void glProgramUniform3dvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble const *") double[] value) {
        long __functionAddress = GL.getICD().glProgramUniform3dvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 3, value, __functionAddress);
    }

    /** {@code void glProgramUniform4dvEXT(GLuint program, GLint location, GLsizei count, GLdouble const * value)} */
    public static void glProgramUniform4dvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble const *") double[] value) {
        long __functionAddress = GL.getICD().glProgramUniform4dvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 2, value, __functionAddress);
    }

    /** {@code void glProgramUniformMatrix2dvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glProgramUniformMatrix2dvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix2dvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 2, transpose, value, __functionAddress);
    }

    /** {@code void glProgramUniformMatrix3dvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glProgramUniformMatrix3dvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix3dvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 9, transpose, value, __functionAddress);
    }

    /** {@code void glProgramUniformMatrix4dvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glProgramUniformMatrix4dvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix4dvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 4, transpose, value, __functionAddress);
    }

    /** {@code void glProgramUniformMatrix2x3dvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glProgramUniformMatrix2x3dvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix2x3dvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 6, transpose, value, __functionAddress);
    }

    /** {@code void glProgramUniformMatrix2x4dvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glProgramUniformMatrix2x4dvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix2x4dvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 3, transpose, value, __functionAddress);
    }

    /** {@code void glProgramUniformMatrix3x2dvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glProgramUniformMatrix3x2dvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix3x2dvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 6, transpose, value, __functionAddress);
    }

    /** {@code void glProgramUniformMatrix3x4dvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glProgramUniformMatrix3x4dvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix3x4dvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 12, transpose, value, __functionAddress);
    }

    /** {@code void glProgramUniformMatrix4x2dvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glProgramUniformMatrix4x2dvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix4x2dvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 3, transpose, value, __functionAddress);
    }

    /** {@code void glProgramUniformMatrix4x3dvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glProgramUniformMatrix4x3dvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix4x3dvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 12, transpose, value, __functionAddress);
    }

}
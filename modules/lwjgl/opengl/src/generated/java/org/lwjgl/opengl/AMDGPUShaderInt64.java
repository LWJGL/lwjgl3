/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

public class AMDGPUShaderInt64 {

    static { GL.initialize(); }

    public static final int
        GL_INT64_NV               = 0x140E,
        GL_UNSIGNED_INT64_NV      = 0x140F,
        GL_INT8_NV                = 0x8FE0,
        GL_INT8_VEC2_NV           = 0x8FE1,
        GL_INT8_VEC3_NV           = 0x8FE2,
        GL_INT8_VEC4_NV           = 0x8FE3,
        GL_INT16_NV               = 0x8FE4,
        GL_INT16_VEC2_NV          = 0x8FE5,
        GL_INT16_VEC3_NV          = 0x8FE6,
        GL_INT16_VEC4_NV          = 0x8FE7,
        GL_INT64_VEC2_NV          = 0x8FE9,
        GL_INT64_VEC3_NV          = 0x8FEA,
        GL_INT64_VEC4_NV          = 0x8FEB,
        GL_UNSIGNED_INT8_NV       = 0x8FEC,
        GL_UNSIGNED_INT8_VEC2_NV  = 0x8FED,
        GL_UNSIGNED_INT8_VEC3_NV  = 0x8FEE,
        GL_UNSIGNED_INT8_VEC4_NV  = 0x8FEF,
        GL_UNSIGNED_INT16_NV      = 0x8FF0,
        GL_UNSIGNED_INT16_VEC2_NV = 0x8FF1,
        GL_UNSIGNED_INT16_VEC3_NV = 0x8FF2,
        GL_UNSIGNED_INT16_VEC4_NV = 0x8FF3,
        GL_UNSIGNED_INT64_VEC2_NV = 0x8FF5,
        GL_UNSIGNED_INT64_VEC3_NV = 0x8FF6,
        GL_UNSIGNED_INT64_VEC4_NV = 0x8FF7,
        GL_FLOAT16_NV             = 0x8FF8,
        GL_FLOAT16_VEC2_NV        = 0x8FF9,
        GL_FLOAT16_VEC3_NV        = 0x8FFA,
        GL_FLOAT16_VEC4_NV        = 0x8FFB;

    protected AMDGPUShaderInt64() {
        throw new UnsupportedOperationException();
    }

    // --- [ glUniform1i64NV ] ---

    /** {@code void glUniform1i64NV(GLint location, GLint64EXT x)} */
    public static void glUniform1i64NV(@NativeType("GLint") int location, @NativeType("GLint64EXT") long x) {
        NVGPUShader5.glUniform1i64NV(location, x);
    }

    // --- [ glUniform2i64NV ] ---

    /** {@code void glUniform2i64NV(GLint location, GLint64EXT x, GLint64EXT y)} */
    public static void glUniform2i64NV(@NativeType("GLint") int location, @NativeType("GLint64EXT") long x, @NativeType("GLint64EXT") long y) {
        NVGPUShader5.glUniform2i64NV(location, x, y);
    }

    // --- [ glUniform3i64NV ] ---

    /** {@code void glUniform3i64NV(GLint location, GLint64EXT x, GLint64EXT y, GLint64EXT z)} */
    public static void glUniform3i64NV(@NativeType("GLint") int location, @NativeType("GLint64EXT") long x, @NativeType("GLint64EXT") long y, @NativeType("GLint64EXT") long z) {
        NVGPUShader5.glUniform3i64NV(location, x, y, z);
    }

    // --- [ glUniform4i64NV ] ---

    /** {@code void glUniform4i64NV(GLint location, GLint64EXT x, GLint64EXT y, GLint64EXT z, GLint64EXT w)} */
    public static void glUniform4i64NV(@NativeType("GLint") int location, @NativeType("GLint64EXT") long x, @NativeType("GLint64EXT") long y, @NativeType("GLint64EXT") long z, @NativeType("GLint64EXT") long w) {
        NVGPUShader5.glUniform4i64NV(location, x, y, z, w);
    }

    // --- [ glUniform1i64vNV ] ---

    /** {@code void glUniform1i64vNV(GLint location, GLsizei count, GLint64EXT const * value)} */
    public static void nglUniform1i64vNV(int location, int count, long value) {
        NVGPUShader5.nglUniform1i64vNV(location, count, value);
    }

    /** {@code void glUniform1i64vNV(GLint location, GLsizei count, GLint64EXT const * value)} */
    public static void glUniform1i64vNV(@NativeType("GLint") int location, @NativeType("GLint64EXT const *") LongBuffer value) {
        NVGPUShader5.glUniform1i64vNV(location, value);
    }

    // --- [ glUniform2i64vNV ] ---

    /** {@code void glUniform2i64vNV(GLint location, GLsizei count, GLint64EXT const * value)} */
    public static void nglUniform2i64vNV(int location, int count, long value) {
        NVGPUShader5.nglUniform2i64vNV(location, count, value);
    }

    /** {@code void glUniform2i64vNV(GLint location, GLsizei count, GLint64EXT const * value)} */
    public static void glUniform2i64vNV(@NativeType("GLint") int location, @NativeType("GLint64EXT const *") LongBuffer value) {
        NVGPUShader5.glUniform2i64vNV(location, value);
    }

    // --- [ glUniform3i64vNV ] ---

    /** {@code void glUniform3i64vNV(GLint location, GLsizei count, GLint64EXT const * value)} */
    public static void nglUniform3i64vNV(int location, int count, long value) {
        NVGPUShader5.nglUniform3i64vNV(location, count, value);
    }

    /** {@code void glUniform3i64vNV(GLint location, GLsizei count, GLint64EXT const * value)} */
    public static void glUniform3i64vNV(@NativeType("GLint") int location, @NativeType("GLint64EXT const *") LongBuffer value) {
        NVGPUShader5.glUniform3i64vNV(location, value);
    }

    // --- [ glUniform4i64vNV ] ---

    /** {@code void glUniform4i64vNV(GLint location, GLsizei count, GLint64EXT const * value)} */
    public static void nglUniform4i64vNV(int location, int count, long value) {
        NVGPUShader5.nglUniform4i64vNV(location, count, value);
    }

    /** {@code void glUniform4i64vNV(GLint location, GLsizei count, GLint64EXT const * value)} */
    public static void glUniform4i64vNV(@NativeType("GLint") int location, @NativeType("GLint64EXT const *") LongBuffer value) {
        NVGPUShader5.glUniform4i64vNV(location, value);
    }

    // --- [ glUniform1ui64NV ] ---

    /** {@code void glUniform1ui64NV(GLint location, GLuint64EXT x)} */
    public static void glUniform1ui64NV(@NativeType("GLint") int location, @NativeType("GLuint64EXT") long x) {
        NVGPUShader5.glUniform1ui64NV(location, x);
    }

    // --- [ glUniform2ui64NV ] ---

    /** {@code void glUniform2ui64NV(GLint location, GLuint64EXT x, GLuint64EXT y)} */
    public static void glUniform2ui64NV(@NativeType("GLint") int location, @NativeType("GLuint64EXT") long x, @NativeType("GLuint64EXT") long y) {
        NVGPUShader5.glUniform2ui64NV(location, x, y);
    }

    // --- [ glUniform3ui64NV ] ---

    /** {@code void glUniform3ui64NV(GLint location, GLuint64EXT x, GLuint64EXT y, GLuint64EXT z)} */
    public static void glUniform3ui64NV(@NativeType("GLint") int location, @NativeType("GLuint64EXT") long x, @NativeType("GLuint64EXT") long y, @NativeType("GLuint64EXT") long z) {
        NVGPUShader5.glUniform3ui64NV(location, x, y, z);
    }

    // --- [ glUniform4ui64NV ] ---

    /** {@code void glUniform4ui64NV(GLint location, GLuint64EXT x, GLuint64EXT y, GLuint64EXT z, GLuint64EXT w)} */
    public static void glUniform4ui64NV(@NativeType("GLint") int location, @NativeType("GLuint64EXT") long x, @NativeType("GLuint64EXT") long y, @NativeType("GLuint64EXT") long z, @NativeType("GLuint64EXT") long w) {
        NVGPUShader5.glUniform4ui64NV(location, x, y, z, w);
    }

    // --- [ glUniform1ui64vNV ] ---

    /** {@code void glUniform1ui64vNV(GLint location, GLsizei count, GLuint64EXT const * value)} */
    public static void nglUniform1ui64vNV(int location, int count, long value) {
        NVGPUShader5.nglUniform1ui64vNV(location, count, value);
    }

    /** {@code void glUniform1ui64vNV(GLint location, GLsizei count, GLuint64EXT const * value)} */
    public static void glUniform1ui64vNV(@NativeType("GLint") int location, @NativeType("GLuint64EXT const *") LongBuffer value) {
        NVGPUShader5.glUniform1ui64vNV(location, value);
    }

    // --- [ glUniform2ui64vNV ] ---

    /** {@code void glUniform2ui64vNV(GLint location, GLsizei count, GLuint64EXT * value)} */
    public static void nglUniform2ui64vNV(int location, int count, long value) {
        NVGPUShader5.nglUniform2ui64vNV(location, count, value);
    }

    /** {@code void glUniform2ui64vNV(GLint location, GLsizei count, GLuint64EXT * value)} */
    public static void glUniform2ui64vNV(@NativeType("GLint") int location, @NativeType("GLuint64EXT *") LongBuffer value) {
        NVGPUShader5.glUniform2ui64vNV(location, value);
    }

    // --- [ glUniform3ui64vNV ] ---

    /** {@code void glUniform3ui64vNV(GLint location, GLsizei count, GLuint64EXT const * value)} */
    public static void nglUniform3ui64vNV(int location, int count, long value) {
        NVGPUShader5.nglUniform3ui64vNV(location, count, value);
    }

    /** {@code void glUniform3ui64vNV(GLint location, GLsizei count, GLuint64EXT const * value)} */
    public static void glUniform3ui64vNV(@NativeType("GLint") int location, @NativeType("GLuint64EXT const *") LongBuffer value) {
        NVGPUShader5.glUniform3ui64vNV(location, value);
    }

    // --- [ glUniform4ui64vNV ] ---

    /** {@code void glUniform4ui64vNV(GLint location, GLsizei count, GLuint64EXT const * value)} */
    public static void nglUniform4ui64vNV(int location, int count, long value) {
        NVGPUShader5.nglUniform4ui64vNV(location, count, value);
    }

    /** {@code void glUniform4ui64vNV(GLint location, GLsizei count, GLuint64EXT const * value)} */
    public static void glUniform4ui64vNV(@NativeType("GLint") int location, @NativeType("GLuint64EXT const *") LongBuffer value) {
        NVGPUShader5.glUniform4ui64vNV(location, value);
    }

    // --- [ glGetUniformi64vNV ] ---

    /** {@code void glGetUniformi64vNV(GLuint program, GLint location, GLint64EXT * params)} */
    public static void nglGetUniformi64vNV(int program, int location, long params) {
        NVGPUShader5.nglGetUniformi64vNV(program, location, params);
    }

    /** {@code void glGetUniformi64vNV(GLuint program, GLint location, GLint64EXT * params)} */
    public static void glGetUniformi64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64EXT *") LongBuffer params) {
        NVGPUShader5.glGetUniformi64vNV(program, location, params);
    }

    /** {@code void glGetUniformi64vNV(GLuint program, GLint location, GLint64EXT * params)} */
    @NativeType("void")
    public static long glGetUniformi64NV(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        return NVGPUShader5.glGetUniformi64NV(program, location);
    }

    // --- [ glGetUniformui64vNV ] ---

    /** {@code void glGetUniformui64vNV(GLuint program, GLint location, GLuint64EXT * params)} */
    public static void nglGetUniformui64vNV(int program, int location, long params) {
        NVShaderBufferLoad.nglGetUniformui64vNV(program, location, params);
    }

    /** {@code void glGetUniformui64vNV(GLuint program, GLint location, GLuint64EXT * params)} */
    public static void glGetUniformui64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64EXT *") LongBuffer params) {
        NVShaderBufferLoad.glGetUniformui64vNV(program, location, params);
    }

    /** {@code void glGetUniformui64vNV(GLuint program, GLint location, GLuint64EXT * params)} */
    @NativeType("void")
    public static long glGetUniformui64NV(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        return NVShaderBufferLoad.glGetUniformui64NV(program, location);
    }

    // --- [ glProgramUniform1i64NV ] ---

    /** {@code void glProgramUniform1i64NV(GLuint program, GLint location, GLint64EXT x)} */
    public static void glProgramUniform1i64NV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64EXT") long x) {
        NVGPUShader5.glProgramUniform1i64NV(program, location, x);
    }

    // --- [ glProgramUniform2i64NV ] ---

    /** {@code void glProgramUniform2i64NV(GLuint program, GLint location, GLint64EXT x, GLint64EXT y)} */
    public static void glProgramUniform2i64NV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64EXT") long x, @NativeType("GLint64EXT") long y) {
        NVGPUShader5.glProgramUniform2i64NV(program, location, x, y);
    }

    // --- [ glProgramUniform3i64NV ] ---

    /** {@code void glProgramUniform3i64NV(GLuint program, GLint location, GLint64EXT x, GLint64EXT y, GLint64EXT z)} */
    public static void glProgramUniform3i64NV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64EXT") long x, @NativeType("GLint64EXT") long y, @NativeType("GLint64EXT") long z) {
        NVGPUShader5.glProgramUniform3i64NV(program, location, x, y, z);
    }

    // --- [ glProgramUniform4i64NV ] ---

    /** {@code void glProgramUniform4i64NV(GLuint program, GLint location, GLint64EXT x, GLint64EXT y, GLint64EXT z, GLint64EXT w)} */
    public static void glProgramUniform4i64NV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64EXT") long x, @NativeType("GLint64EXT") long y, @NativeType("GLint64EXT") long z, @NativeType("GLint64EXT") long w) {
        NVGPUShader5.glProgramUniform4i64NV(program, location, x, y, z, w);
    }

    // --- [ glProgramUniform1i64vNV ] ---

    /** {@code void glProgramUniform1i64vNV(GLuint program, GLint location, GLsizei count, GLint64EXT const * value)} */
    public static void nglProgramUniform1i64vNV(int program, int location, int count, long value) {
        NVGPUShader5.nglProgramUniform1i64vNV(program, location, count, value);
    }

    /** {@code void glProgramUniform1i64vNV(GLuint program, GLint location, GLsizei count, GLint64EXT const * value)} */
    public static void glProgramUniform1i64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64EXT const *") LongBuffer value) {
        NVGPUShader5.glProgramUniform1i64vNV(program, location, value);
    }

    // --- [ glProgramUniform2i64vNV ] ---

    /** {@code void glProgramUniform2i64vNV(GLuint program, GLint location, GLsizei count, GLint64EXT const * value)} */
    public static void nglProgramUniform2i64vNV(int program, int location, int count, long value) {
        NVGPUShader5.nglProgramUniform2i64vNV(program, location, count, value);
    }

    /** {@code void glProgramUniform2i64vNV(GLuint program, GLint location, GLsizei count, GLint64EXT const * value)} */
    public static void glProgramUniform2i64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64EXT const *") LongBuffer value) {
        NVGPUShader5.glProgramUniform2i64vNV(program, location, value);
    }

    // --- [ glProgramUniform3i64vNV ] ---

    /** {@code void glProgramUniform3i64vNV(GLuint program, GLint location, GLsizei count, GLint64EXT const * value)} */
    public static void nglProgramUniform3i64vNV(int program, int location, int count, long value) {
        NVGPUShader5.nglProgramUniform3i64vNV(program, location, count, value);
    }

    /** {@code void glProgramUniform3i64vNV(GLuint program, GLint location, GLsizei count, GLint64EXT const * value)} */
    public static void glProgramUniform3i64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64EXT const *") LongBuffer value) {
        NVGPUShader5.glProgramUniform3i64vNV(program, location, value);
    }

    // --- [ glProgramUniform4i64vNV ] ---

    /** {@code void glProgramUniform4i64vNV(GLuint program, GLint location, GLsizei count, GLint64EXT const * value)} */
    public static void nglProgramUniform4i64vNV(int program, int location, int count, long value) {
        NVGPUShader5.nglProgramUniform4i64vNV(program, location, count, value);
    }

    /** {@code void glProgramUniform4i64vNV(GLuint program, GLint location, GLsizei count, GLint64EXT const * value)} */
    public static void glProgramUniform4i64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64EXT const *") LongBuffer value) {
        NVGPUShader5.glProgramUniform4i64vNV(program, location, value);
    }

    // --- [ glProgramUniform1ui64NV ] ---

    /** {@code void glProgramUniform1ui64NV(GLuint program, GLint location, GLuint64EXT x)} */
    public static void glProgramUniform1ui64NV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64EXT") long x) {
        NVGPUShader5.glProgramUniform1ui64NV(program, location, x);
    }

    // --- [ glProgramUniform2ui64NV ] ---

    /** {@code void glProgramUniform2ui64NV(GLuint program, GLint location, GLuint64EXT x, GLuint64EXT y)} */
    public static void glProgramUniform2ui64NV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64EXT") long x, @NativeType("GLuint64EXT") long y) {
        NVGPUShader5.glProgramUniform2ui64NV(program, location, x, y);
    }

    // --- [ glProgramUniform3ui64NV ] ---

    /** {@code void glProgramUniform3ui64NV(GLuint program, GLint location, GLuint64EXT x, GLuint64EXT y, GLuint64EXT z)} */
    public static void glProgramUniform3ui64NV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64EXT") long x, @NativeType("GLuint64EXT") long y, @NativeType("GLuint64EXT") long z) {
        NVGPUShader5.glProgramUniform3ui64NV(program, location, x, y, z);
    }

    // --- [ glProgramUniform4ui64NV ] ---

    /** {@code void glProgramUniform4ui64NV(GLuint program, GLint location, GLuint64EXT x, GLuint64EXT y, GLuint64EXT z, GLuint64EXT w)} */
    public static void glProgramUniform4ui64NV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64EXT") long x, @NativeType("GLuint64EXT") long y, @NativeType("GLuint64EXT") long z, @NativeType("GLuint64EXT") long w) {
        NVGPUShader5.glProgramUniform4ui64NV(program, location, x, y, z, w);
    }

    // --- [ glProgramUniform1ui64vNV ] ---

    /** {@code void glProgramUniform1ui64vNV(GLuint program, GLint location, GLsizei count, GLuint64EXT const * value)} */
    public static void nglProgramUniform1ui64vNV(int program, int location, int count, long value) {
        NVGPUShader5.nglProgramUniform1ui64vNV(program, location, count, value);
    }

    /** {@code void glProgramUniform1ui64vNV(GLuint program, GLint location, GLsizei count, GLuint64EXT const * value)} */
    public static void glProgramUniform1ui64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64EXT const *") LongBuffer value) {
        NVGPUShader5.glProgramUniform1ui64vNV(program, location, value);
    }

    // --- [ glProgramUniform2ui64vNV ] ---

    /** {@code void glProgramUniform2ui64vNV(GLuint program, GLint location, GLsizei count, GLuint64EXT const * value)} */
    public static void nglProgramUniform2ui64vNV(int program, int location, int count, long value) {
        NVGPUShader5.nglProgramUniform2ui64vNV(program, location, count, value);
    }

    /** {@code void glProgramUniform2ui64vNV(GLuint program, GLint location, GLsizei count, GLuint64EXT const * value)} */
    public static void glProgramUniform2ui64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64EXT const *") LongBuffer value) {
        NVGPUShader5.glProgramUniform2ui64vNV(program, location, value);
    }

    // --- [ glProgramUniform3ui64vNV ] ---

    /** {@code void glProgramUniform3ui64vNV(GLuint program, GLint location, GLsizei count, GLuint64EXT const * value)} */
    public static void nglProgramUniform3ui64vNV(int program, int location, int count, long value) {
        NVGPUShader5.nglProgramUniform3ui64vNV(program, location, count, value);
    }

    /** {@code void glProgramUniform3ui64vNV(GLuint program, GLint location, GLsizei count, GLuint64EXT const * value)} */
    public static void glProgramUniform3ui64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64EXT const *") LongBuffer value) {
        NVGPUShader5.glProgramUniform3ui64vNV(program, location, value);
    }

    // --- [ glProgramUniform4ui64vNV ] ---

    /** {@code void glProgramUniform4ui64vNV(GLuint program, GLint location, GLsizei count, GLuint64EXT const * value)} */
    public static void nglProgramUniform4ui64vNV(int program, int location, int count, long value) {
        NVGPUShader5.nglProgramUniform4ui64vNV(program, location, count, value);
    }

    /** {@code void glProgramUniform4ui64vNV(GLuint program, GLint location, GLsizei count, GLuint64EXT const * value)} */
    public static void glProgramUniform4ui64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64EXT const *") LongBuffer value) {
        NVGPUShader5.glProgramUniform4ui64vNV(program, location, value);
    }

    /** {@code void glUniform1i64vNV(GLint location, GLsizei count, GLint64EXT const * value)} */
    public static void glUniform1i64vNV(@NativeType("GLint") int location, @NativeType("GLint64EXT const *") long[] value) {
        NVGPUShader5.glUniform1i64vNV(location, value);
    }

    /** {@code void glUniform2i64vNV(GLint location, GLsizei count, GLint64EXT const * value)} */
    public static void glUniform2i64vNV(@NativeType("GLint") int location, @NativeType("GLint64EXT const *") long[] value) {
        NVGPUShader5.glUniform2i64vNV(location, value);
    }

    /** {@code void glUniform3i64vNV(GLint location, GLsizei count, GLint64EXT const * value)} */
    public static void glUniform3i64vNV(@NativeType("GLint") int location, @NativeType("GLint64EXT const *") long[] value) {
        NVGPUShader5.glUniform3i64vNV(location, value);
    }

    /** {@code void glUniform4i64vNV(GLint location, GLsizei count, GLint64EXT const * value)} */
    public static void glUniform4i64vNV(@NativeType("GLint") int location, @NativeType("GLint64EXT const *") long[] value) {
        NVGPUShader5.glUniform4i64vNV(location, value);
    }

    /** {@code void glUniform1ui64vNV(GLint location, GLsizei count, GLuint64EXT const * value)} */
    public static void glUniform1ui64vNV(@NativeType("GLint") int location, @NativeType("GLuint64EXT const *") long[] value) {
        NVGPUShader5.glUniform1ui64vNV(location, value);
    }

    /** {@code void glUniform2ui64vNV(GLint location, GLsizei count, GLuint64EXT * value)} */
    public static void glUniform2ui64vNV(@NativeType("GLint") int location, @NativeType("GLuint64EXT *") long[] value) {
        NVGPUShader5.glUniform2ui64vNV(location, value);
    }

    /** {@code void glUniform3ui64vNV(GLint location, GLsizei count, GLuint64EXT const * value)} */
    public static void glUniform3ui64vNV(@NativeType("GLint") int location, @NativeType("GLuint64EXT const *") long[] value) {
        NVGPUShader5.glUniform3ui64vNV(location, value);
    }

    /** {@code void glUniform4ui64vNV(GLint location, GLsizei count, GLuint64EXT const * value)} */
    public static void glUniform4ui64vNV(@NativeType("GLint") int location, @NativeType("GLuint64EXT const *") long[] value) {
        NVGPUShader5.glUniform4ui64vNV(location, value);
    }

    /** {@code void glGetUniformi64vNV(GLuint program, GLint location, GLint64EXT * params)} */
    public static void glGetUniformi64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64EXT *") long[] params) {
        NVGPUShader5.glGetUniformi64vNV(program, location, params);
    }

    /** {@code void glGetUniformui64vNV(GLuint program, GLint location, GLuint64EXT * params)} */
    public static void glGetUniformui64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64EXT *") long[] params) {
        NVShaderBufferLoad.glGetUniformui64vNV(program, location, params);
    }

    /** {@code void glProgramUniform1i64vNV(GLuint program, GLint location, GLsizei count, GLint64EXT const * value)} */
    public static void glProgramUniform1i64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64EXT const *") long[] value) {
        NVGPUShader5.glProgramUniform1i64vNV(program, location, value);
    }

    /** {@code void glProgramUniform2i64vNV(GLuint program, GLint location, GLsizei count, GLint64EXT const * value)} */
    public static void glProgramUniform2i64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64EXT const *") long[] value) {
        NVGPUShader5.glProgramUniform2i64vNV(program, location, value);
    }

    /** {@code void glProgramUniform3i64vNV(GLuint program, GLint location, GLsizei count, GLint64EXT const * value)} */
    public static void glProgramUniform3i64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64EXT const *") long[] value) {
        NVGPUShader5.glProgramUniform3i64vNV(program, location, value);
    }

    /** {@code void glProgramUniform4i64vNV(GLuint program, GLint location, GLsizei count, GLint64EXT const * value)} */
    public static void glProgramUniform4i64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64EXT const *") long[] value) {
        NVGPUShader5.glProgramUniform4i64vNV(program, location, value);
    }

    /** {@code void glProgramUniform1ui64vNV(GLuint program, GLint location, GLsizei count, GLuint64EXT const * value)} */
    public static void glProgramUniform1ui64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64EXT const *") long[] value) {
        NVGPUShader5.glProgramUniform1ui64vNV(program, location, value);
    }

    /** {@code void glProgramUniform2ui64vNV(GLuint program, GLint location, GLsizei count, GLuint64EXT const * value)} */
    public static void glProgramUniform2ui64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64EXT const *") long[] value) {
        NVGPUShader5.glProgramUniform2ui64vNV(program, location, value);
    }

    /** {@code void glProgramUniform3ui64vNV(GLuint program, GLint location, GLsizei count, GLuint64EXT const * value)} */
    public static void glProgramUniform3ui64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64EXT const *") long[] value) {
        NVGPUShader5.glProgramUniform3ui64vNV(program, location, value);
    }

    /** {@code void glProgramUniform4ui64vNV(GLuint program, GLint location, GLsizei count, GLuint64EXT const * value)} */
    public static void glProgramUniform4ui64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64EXT const *") long[] value) {
        NVGPUShader5.glProgramUniform4ui64vNV(program, location, value);
    }

}
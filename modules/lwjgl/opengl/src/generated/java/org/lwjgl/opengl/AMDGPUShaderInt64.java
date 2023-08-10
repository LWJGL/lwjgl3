/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/AMD/AMD_gpu_shader_int64.txt">AMD_gpu_shader_int64</a> extension.
 * 
 * <p>This extension was developed based on the NV_gpu_shader5 extension to allow implementations supporting 64-bit integers to expose the feature without
 * the additional requirements that are present in NV_gpu_shader5.</p>
 * 
 * <p>The extension introduces the following features for all shader types:</p>
 * 
 * <ul>
 * <li>support for 64-bit scalar and vector integer data types, including uniform API, uniform buffer object, transform feedback, and shader input and
 * output support;</li>
 * <li>new built-in functions to pack and unpack 64-bit integer types into a two-component 32-bit integer vector;</li>
 * <li>new built-in functions to convert double-precision floating-point values to or from their 64-bit integer bit encodings;</li>
 * <li>vector relational functions supporting comparisons of vectors of 64-bit integer types; and</li>
 * <li>common functions abs, sign, min, max, clamp, and mix supporting arguments of 64-bit integer types.</li>
 * </ul>
 * 
 * <p>This extension is designed to be a functional superset of the 64-bit integer support introduced by NV_gpu_shader5 and to be source code compatible with
 * that, thus the new procedures, functions, and tokens are identical to those found in that extension.</p>
 * 
 * <p>Requires {@link GL40 OpenGL 4.0} and GLSL 4.00.</p>
 */
public class AMDGPUShaderInt64 {

    static { GL.initialize(); }

    /** Returned by the {@code type} parameter of GetActiveAttrib, GetActiveUniform, and GetTransformFeedbackVarying. */
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

    public static void glUniform1i64NV(@NativeType("GLint") int location, @NativeType("GLint64EXT") long x) {
        NVGPUShader5.glUniform1i64NV(location, x);
    }

    // --- [ glUniform2i64NV ] ---

    public static void glUniform2i64NV(@NativeType("GLint") int location, @NativeType("GLint64EXT") long x, @NativeType("GLint64EXT") long y) {
        NVGPUShader5.glUniform2i64NV(location, x, y);
    }

    // --- [ glUniform3i64NV ] ---

    public static void glUniform3i64NV(@NativeType("GLint") int location, @NativeType("GLint64EXT") long x, @NativeType("GLint64EXT") long y, @NativeType("GLint64EXT") long z) {
        NVGPUShader5.glUniform3i64NV(location, x, y, z);
    }

    // --- [ glUniform4i64NV ] ---

    public static void glUniform4i64NV(@NativeType("GLint") int location, @NativeType("GLint64EXT") long x, @NativeType("GLint64EXT") long y, @NativeType("GLint64EXT") long z, @NativeType("GLint64EXT") long w) {
        NVGPUShader5.glUniform4i64NV(location, x, y, z, w);
    }

    // --- [ glUniform1i64vNV ] ---

    public static void nglUniform1i64vNV(int location, int count, long value) {
        NVGPUShader5.nglUniform1i64vNV(location, count, value);
    }

    public static void glUniform1i64vNV(@NativeType("GLint") int location, @NativeType("GLint64EXT const *") LongBuffer value) {
        NVGPUShader5.glUniform1i64vNV(location, value);
    }

    // --- [ glUniform2i64vNV ] ---

    public static void nglUniform2i64vNV(int location, int count, long value) {
        NVGPUShader5.nglUniform2i64vNV(location, count, value);
    }

    public static void glUniform2i64vNV(@NativeType("GLint") int location, @NativeType("GLint64EXT const *") LongBuffer value) {
        NVGPUShader5.glUniform2i64vNV(location, value);
    }

    // --- [ glUniform3i64vNV ] ---

    public static void nglUniform3i64vNV(int location, int count, long value) {
        NVGPUShader5.nglUniform3i64vNV(location, count, value);
    }

    public static void glUniform3i64vNV(@NativeType("GLint") int location, @NativeType("GLint64EXT const *") LongBuffer value) {
        NVGPUShader5.glUniform3i64vNV(location, value);
    }

    // --- [ glUniform4i64vNV ] ---

    public static void nglUniform4i64vNV(int location, int count, long value) {
        NVGPUShader5.nglUniform4i64vNV(location, count, value);
    }

    public static void glUniform4i64vNV(@NativeType("GLint") int location, @NativeType("GLint64EXT const *") LongBuffer value) {
        NVGPUShader5.glUniform4i64vNV(location, value);
    }

    // --- [ glUniform1ui64NV ] ---

    public static void glUniform1ui64NV(@NativeType("GLint") int location, @NativeType("GLuint64EXT") long x) {
        NVGPUShader5.glUniform1ui64NV(location, x);
    }

    // --- [ glUniform2ui64NV ] ---

    public static void glUniform2ui64NV(@NativeType("GLint") int location, @NativeType("GLuint64EXT") long x, @NativeType("GLuint64EXT") long y) {
        NVGPUShader5.glUniform2ui64NV(location, x, y);
    }

    // --- [ glUniform3ui64NV ] ---

    public static void glUniform3ui64NV(@NativeType("GLint") int location, @NativeType("GLuint64EXT") long x, @NativeType("GLuint64EXT") long y, @NativeType("GLuint64EXT") long z) {
        NVGPUShader5.glUniform3ui64NV(location, x, y, z);
    }

    // --- [ glUniform4ui64NV ] ---

    public static void glUniform4ui64NV(@NativeType("GLint") int location, @NativeType("GLuint64EXT") long x, @NativeType("GLuint64EXT") long y, @NativeType("GLuint64EXT") long z, @NativeType("GLuint64EXT") long w) {
        NVGPUShader5.glUniform4ui64NV(location, x, y, z, w);
    }

    // --- [ glUniform1ui64vNV ] ---

    public static void nglUniform1ui64vNV(int location, int count, long value) {
        NVGPUShader5.nglUniform1ui64vNV(location, count, value);
    }

    public static void glUniform1ui64vNV(@NativeType("GLint") int location, @NativeType("GLuint64EXT const *") LongBuffer value) {
        NVGPUShader5.glUniform1ui64vNV(location, value);
    }

    // --- [ glUniform2ui64vNV ] ---

    public static void nglUniform2ui64vNV(int location, int count, long value) {
        NVGPUShader5.nglUniform2ui64vNV(location, count, value);
    }

    public static void glUniform2ui64vNV(@NativeType("GLint") int location, @NativeType("GLuint64EXT *") LongBuffer value) {
        NVGPUShader5.glUniform2ui64vNV(location, value);
    }

    // --- [ glUniform3ui64vNV ] ---

    public static void nglUniform3ui64vNV(int location, int count, long value) {
        NVGPUShader5.nglUniform3ui64vNV(location, count, value);
    }

    public static void glUniform3ui64vNV(@NativeType("GLint") int location, @NativeType("GLuint64EXT const *") LongBuffer value) {
        NVGPUShader5.glUniform3ui64vNV(location, value);
    }

    // --- [ glUniform4ui64vNV ] ---

    public static void nglUniform4ui64vNV(int location, int count, long value) {
        NVGPUShader5.nglUniform4ui64vNV(location, count, value);
    }

    public static void glUniform4ui64vNV(@NativeType("GLint") int location, @NativeType("GLuint64EXT const *") LongBuffer value) {
        NVGPUShader5.glUniform4ui64vNV(location, value);
    }

    // --- [ glGetUniformi64vNV ] ---

    public static void nglGetUniformi64vNV(int program, int location, long params) {
        NVGPUShader5.nglGetUniformi64vNV(program, location, params);
    }

    public static void glGetUniformi64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64EXT *") LongBuffer params) {
        NVGPUShader5.glGetUniformi64vNV(program, location, params);
    }

    @NativeType("void")
    public static long glGetUniformi64NV(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        return NVGPUShader5.glGetUniformi64NV(program, location);
    }

    // --- [ glGetUniformui64vNV ] ---

    public static void nglGetUniformui64vNV(int program, int location, long params) {
        NVShaderBufferLoad.nglGetUniformui64vNV(program, location, params);
    }

    public static void glGetUniformui64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64EXT *") LongBuffer params) {
        NVShaderBufferLoad.glGetUniformui64vNV(program, location, params);
    }

    @NativeType("void")
    public static long glGetUniformui64NV(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        return NVShaderBufferLoad.glGetUniformui64NV(program, location);
    }

    // --- [ glProgramUniform1i64NV ] ---

    public static void glProgramUniform1i64NV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64EXT") long x) {
        NVGPUShader5.glProgramUniform1i64NV(program, location, x);
    }

    // --- [ glProgramUniform2i64NV ] ---

    public static void glProgramUniform2i64NV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64EXT") long x, @NativeType("GLint64EXT") long y) {
        NVGPUShader5.glProgramUniform2i64NV(program, location, x, y);
    }

    // --- [ glProgramUniform3i64NV ] ---

    public static void glProgramUniform3i64NV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64EXT") long x, @NativeType("GLint64EXT") long y, @NativeType("GLint64EXT") long z) {
        NVGPUShader5.glProgramUniform3i64NV(program, location, x, y, z);
    }

    // --- [ glProgramUniform4i64NV ] ---

    public static void glProgramUniform4i64NV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64EXT") long x, @NativeType("GLint64EXT") long y, @NativeType("GLint64EXT") long z, @NativeType("GLint64EXT") long w) {
        NVGPUShader5.glProgramUniform4i64NV(program, location, x, y, z, w);
    }

    // --- [ glProgramUniform1i64vNV ] ---

    public static void nglProgramUniform1i64vNV(int program, int location, int count, long value) {
        NVGPUShader5.nglProgramUniform1i64vNV(program, location, count, value);
    }

    public static void glProgramUniform1i64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64EXT const *") LongBuffer value) {
        NVGPUShader5.glProgramUniform1i64vNV(program, location, value);
    }

    // --- [ glProgramUniform2i64vNV ] ---

    public static void nglProgramUniform2i64vNV(int program, int location, int count, long value) {
        NVGPUShader5.nglProgramUniform2i64vNV(program, location, count, value);
    }

    public static void glProgramUniform2i64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64EXT const *") LongBuffer value) {
        NVGPUShader5.glProgramUniform2i64vNV(program, location, value);
    }

    // --- [ glProgramUniform3i64vNV ] ---

    public static void nglProgramUniform3i64vNV(int program, int location, int count, long value) {
        NVGPUShader5.nglProgramUniform3i64vNV(program, location, count, value);
    }

    public static void glProgramUniform3i64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64EXT const *") LongBuffer value) {
        NVGPUShader5.glProgramUniform3i64vNV(program, location, value);
    }

    // --- [ glProgramUniform4i64vNV ] ---

    public static void nglProgramUniform4i64vNV(int program, int location, int count, long value) {
        NVGPUShader5.nglProgramUniform4i64vNV(program, location, count, value);
    }

    public static void glProgramUniform4i64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64EXT const *") LongBuffer value) {
        NVGPUShader5.glProgramUniform4i64vNV(program, location, value);
    }

    // --- [ glProgramUniform1ui64NV ] ---

    public static void glProgramUniform1ui64NV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64EXT") long x) {
        NVGPUShader5.glProgramUniform1ui64NV(program, location, x);
    }

    // --- [ glProgramUniform2ui64NV ] ---

    public static void glProgramUniform2ui64NV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64EXT") long x, @NativeType("GLuint64EXT") long y) {
        NVGPUShader5.glProgramUniform2ui64NV(program, location, x, y);
    }

    // --- [ glProgramUniform3ui64NV ] ---

    public static void glProgramUniform3ui64NV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64EXT") long x, @NativeType("GLuint64EXT") long y, @NativeType("GLuint64EXT") long z) {
        NVGPUShader5.glProgramUniform3ui64NV(program, location, x, y, z);
    }

    // --- [ glProgramUniform4ui64NV ] ---

    public static void glProgramUniform4ui64NV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64EXT") long x, @NativeType("GLuint64EXT") long y, @NativeType("GLuint64EXT") long z, @NativeType("GLuint64EXT") long w) {
        NVGPUShader5.glProgramUniform4ui64NV(program, location, x, y, z, w);
    }

    // --- [ glProgramUniform1ui64vNV ] ---

    public static void nglProgramUniform1ui64vNV(int program, int location, int count, long value) {
        NVGPUShader5.nglProgramUniform1ui64vNV(program, location, count, value);
    }

    public static void glProgramUniform1ui64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64EXT const *") LongBuffer value) {
        NVGPUShader5.glProgramUniform1ui64vNV(program, location, value);
    }

    // --- [ glProgramUniform2ui64vNV ] ---

    public static void nglProgramUniform2ui64vNV(int program, int location, int count, long value) {
        NVGPUShader5.nglProgramUniform2ui64vNV(program, location, count, value);
    }

    public static void glProgramUniform2ui64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64EXT const *") LongBuffer value) {
        NVGPUShader5.glProgramUniform2ui64vNV(program, location, value);
    }

    // --- [ glProgramUniform3ui64vNV ] ---

    public static void nglProgramUniform3ui64vNV(int program, int location, int count, long value) {
        NVGPUShader5.nglProgramUniform3ui64vNV(program, location, count, value);
    }

    public static void glProgramUniform3ui64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64EXT const *") LongBuffer value) {
        NVGPUShader5.glProgramUniform3ui64vNV(program, location, value);
    }

    // --- [ glProgramUniform4ui64vNV ] ---

    public static void nglProgramUniform4ui64vNV(int program, int location, int count, long value) {
        NVGPUShader5.nglProgramUniform4ui64vNV(program, location, count, value);
    }

    public static void glProgramUniform4ui64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64EXT const *") LongBuffer value) {
        NVGPUShader5.glProgramUniform4ui64vNV(program, location, value);
    }

    /** Array version of: {@link #glUniform1i64vNV Uniform1i64vNV} */
    public static void glUniform1i64vNV(@NativeType("GLint") int location, @NativeType("GLint64EXT const *") long[] value) {
        NVGPUShader5.glUniform1i64vNV(location, value);
    }

    /** Array version of: {@link #glUniform2i64vNV Uniform2i64vNV} */
    public static void glUniform2i64vNV(@NativeType("GLint") int location, @NativeType("GLint64EXT const *") long[] value) {
        NVGPUShader5.glUniform2i64vNV(location, value);
    }

    /** Array version of: {@link #glUniform3i64vNV Uniform3i64vNV} */
    public static void glUniform3i64vNV(@NativeType("GLint") int location, @NativeType("GLint64EXT const *") long[] value) {
        NVGPUShader5.glUniform3i64vNV(location, value);
    }

    /** Array version of: {@link #glUniform4i64vNV Uniform4i64vNV} */
    public static void glUniform4i64vNV(@NativeType("GLint") int location, @NativeType("GLint64EXT const *") long[] value) {
        NVGPUShader5.glUniform4i64vNV(location, value);
    }

    /** Array version of: {@link #glUniform1ui64vNV Uniform1ui64vNV} */
    public static void glUniform1ui64vNV(@NativeType("GLint") int location, @NativeType("GLuint64EXT const *") long[] value) {
        NVGPUShader5.glUniform1ui64vNV(location, value);
    }

    /** Array version of: {@link #glUniform2ui64vNV Uniform2ui64vNV} */
    public static void glUniform2ui64vNV(@NativeType("GLint") int location, @NativeType("GLuint64EXT *") long[] value) {
        NVGPUShader5.glUniform2ui64vNV(location, value);
    }

    /** Array version of: {@link #glUniform3ui64vNV Uniform3ui64vNV} */
    public static void glUniform3ui64vNV(@NativeType("GLint") int location, @NativeType("GLuint64EXT const *") long[] value) {
        NVGPUShader5.glUniform3ui64vNV(location, value);
    }

    /** Array version of: {@link #glUniform4ui64vNV Uniform4ui64vNV} */
    public static void glUniform4ui64vNV(@NativeType("GLint") int location, @NativeType("GLuint64EXT const *") long[] value) {
        NVGPUShader5.glUniform4ui64vNV(location, value);
    }

    /** Array version of: {@link #glGetUniformi64vNV GetUniformi64vNV} */
    public static void glGetUniformi64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64EXT *") long[] params) {
        NVGPUShader5.glGetUniformi64vNV(program, location, params);
    }

    /** Array version of: {@link #glGetUniformui64vNV GetUniformui64vNV} */
    public static void glGetUniformui64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64EXT *") long[] params) {
        NVShaderBufferLoad.glGetUniformui64vNV(program, location, params);
    }

    /** Array version of: {@link #glProgramUniform1i64vNV ProgramUniform1i64vNV} */
    public static void glProgramUniform1i64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64EXT const *") long[] value) {
        NVGPUShader5.glProgramUniform1i64vNV(program, location, value);
    }

    /** Array version of: {@link #glProgramUniform2i64vNV ProgramUniform2i64vNV} */
    public static void glProgramUniform2i64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64EXT const *") long[] value) {
        NVGPUShader5.glProgramUniform2i64vNV(program, location, value);
    }

    /** Array version of: {@link #glProgramUniform3i64vNV ProgramUniform3i64vNV} */
    public static void glProgramUniform3i64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64EXT const *") long[] value) {
        NVGPUShader5.glProgramUniform3i64vNV(program, location, value);
    }

    /** Array version of: {@link #glProgramUniform4i64vNV ProgramUniform4i64vNV} */
    public static void glProgramUniform4i64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64EXT const *") long[] value) {
        NVGPUShader5.glProgramUniform4i64vNV(program, location, value);
    }

    /** Array version of: {@link #glProgramUniform1ui64vNV ProgramUniform1ui64vNV} */
    public static void glProgramUniform1ui64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64EXT const *") long[] value) {
        NVGPUShader5.glProgramUniform1ui64vNV(program, location, value);
    }

    /** Array version of: {@link #glProgramUniform2ui64vNV ProgramUniform2ui64vNV} */
    public static void glProgramUniform2ui64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64EXT const *") long[] value) {
        NVGPUShader5.glProgramUniform2ui64vNV(program, location, value);
    }

    /** Array version of: {@link #glProgramUniform3ui64vNV ProgramUniform3ui64vNV} */
    public static void glProgramUniform3ui64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64EXT const *") long[] value) {
        NVGPUShader5.glProgramUniform3ui64vNV(program, location, value);
    }

    /** Array version of: {@link #glProgramUniform4ui64vNV ProgramUniform4ui64vNV} */
    public static void glProgramUniform4ui64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64EXT const *") long[] value) {
        NVGPUShader5.glProgramUniform4ui64vNV(program, location, value);
    }

}
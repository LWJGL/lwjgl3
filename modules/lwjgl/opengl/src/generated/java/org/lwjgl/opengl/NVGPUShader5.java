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

public class NVGPUShader5 {

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

    protected NVGPUShader5() {
        throw new UnsupportedOperationException();
    }

    // --- [ glUniform1i64NV ] ---

    /** {@code void glUniform1i64NV(GLint location, GLint64EXT x)} */
    public static native void glUniform1i64NV(@NativeType("GLint") int location, @NativeType("GLint64EXT") long x);

    // --- [ glUniform2i64NV ] ---

    /** {@code void glUniform2i64NV(GLint location, GLint64EXT x, GLint64EXT y)} */
    public static native void glUniform2i64NV(@NativeType("GLint") int location, @NativeType("GLint64EXT") long x, @NativeType("GLint64EXT") long y);

    // --- [ glUniform3i64NV ] ---

    /** {@code void glUniform3i64NV(GLint location, GLint64EXT x, GLint64EXT y, GLint64EXT z)} */
    public static native void glUniform3i64NV(@NativeType("GLint") int location, @NativeType("GLint64EXT") long x, @NativeType("GLint64EXT") long y, @NativeType("GLint64EXT") long z);

    // --- [ glUniform4i64NV ] ---

    /** {@code void glUniform4i64NV(GLint location, GLint64EXT x, GLint64EXT y, GLint64EXT z, GLint64EXT w)} */
    public static native void glUniform4i64NV(@NativeType("GLint") int location, @NativeType("GLint64EXT") long x, @NativeType("GLint64EXT") long y, @NativeType("GLint64EXT") long z, @NativeType("GLint64EXT") long w);

    // --- [ glUniform1i64vNV ] ---

    /** {@code void glUniform1i64vNV(GLint location, GLsizei count, GLint64EXT const * value)} */
    public static native void nglUniform1i64vNV(int location, int count, long value);

    /** {@code void glUniform1i64vNV(GLint location, GLsizei count, GLint64EXT const * value)} */
    public static void glUniform1i64vNV(@NativeType("GLint") int location, @NativeType("GLint64EXT const *") LongBuffer value) {
        nglUniform1i64vNV(location, value.remaining(), memAddress(value));
    }

    // --- [ glUniform2i64vNV ] ---

    /** {@code void glUniform2i64vNV(GLint location, GLsizei count, GLint64EXT const * value)} */
    public static native void nglUniform2i64vNV(int location, int count, long value);

    /** {@code void glUniform2i64vNV(GLint location, GLsizei count, GLint64EXT const * value)} */
    public static void glUniform2i64vNV(@NativeType("GLint") int location, @NativeType("GLint64EXT const *") LongBuffer value) {
        nglUniform2i64vNV(location, value.remaining() >> 1, memAddress(value));
    }

    // --- [ glUniform3i64vNV ] ---

    /** {@code void glUniform3i64vNV(GLint location, GLsizei count, GLint64EXT const * value)} */
    public static native void nglUniform3i64vNV(int location, int count, long value);

    /** {@code void glUniform3i64vNV(GLint location, GLsizei count, GLint64EXT const * value)} */
    public static void glUniform3i64vNV(@NativeType("GLint") int location, @NativeType("GLint64EXT const *") LongBuffer value) {
        nglUniform3i64vNV(location, value.remaining() / 3, memAddress(value));
    }

    // --- [ glUniform4i64vNV ] ---

    /** {@code void glUniform4i64vNV(GLint location, GLsizei count, GLint64EXT const * value)} */
    public static native void nglUniform4i64vNV(int location, int count, long value);

    /** {@code void glUniform4i64vNV(GLint location, GLsizei count, GLint64EXT const * value)} */
    public static void glUniform4i64vNV(@NativeType("GLint") int location, @NativeType("GLint64EXT const *") LongBuffer value) {
        nglUniform4i64vNV(location, value.remaining() >> 2, memAddress(value));
    }

    // --- [ glUniform1ui64NV ] ---

    /** {@code void glUniform1ui64NV(GLint location, GLuint64EXT x)} */
    public static native void glUniform1ui64NV(@NativeType("GLint") int location, @NativeType("GLuint64EXT") long x);

    // --- [ glUniform2ui64NV ] ---

    /** {@code void glUniform2ui64NV(GLint location, GLuint64EXT x, GLuint64EXT y)} */
    public static native void glUniform2ui64NV(@NativeType("GLint") int location, @NativeType("GLuint64EXT") long x, @NativeType("GLuint64EXT") long y);

    // --- [ glUniform3ui64NV ] ---

    /** {@code void glUniform3ui64NV(GLint location, GLuint64EXT x, GLuint64EXT y, GLuint64EXT z)} */
    public static native void glUniform3ui64NV(@NativeType("GLint") int location, @NativeType("GLuint64EXT") long x, @NativeType("GLuint64EXT") long y, @NativeType("GLuint64EXT") long z);

    // --- [ glUniform4ui64NV ] ---

    /** {@code void glUniform4ui64NV(GLint location, GLuint64EXT x, GLuint64EXT y, GLuint64EXT z, GLuint64EXT w)} */
    public static native void glUniform4ui64NV(@NativeType("GLint") int location, @NativeType("GLuint64EXT") long x, @NativeType("GLuint64EXT") long y, @NativeType("GLuint64EXT") long z, @NativeType("GLuint64EXT") long w);

    // --- [ glUniform1ui64vNV ] ---

    /** {@code void glUniform1ui64vNV(GLint location, GLsizei count, GLuint64EXT const * value)} */
    public static native void nglUniform1ui64vNV(int location, int count, long value);

    /** {@code void glUniform1ui64vNV(GLint location, GLsizei count, GLuint64EXT const * value)} */
    public static void glUniform1ui64vNV(@NativeType("GLint") int location, @NativeType("GLuint64EXT const *") LongBuffer value) {
        nglUniform1ui64vNV(location, value.remaining(), memAddress(value));
    }

    // --- [ glUniform2ui64vNV ] ---

    /** {@code void glUniform2ui64vNV(GLint location, GLsizei count, GLuint64EXT * value)} */
    public static native void nglUniform2ui64vNV(int location, int count, long value);

    /** {@code void glUniform2ui64vNV(GLint location, GLsizei count, GLuint64EXT * value)} */
    public static void glUniform2ui64vNV(@NativeType("GLint") int location, @NativeType("GLuint64EXT *") LongBuffer value) {
        nglUniform2ui64vNV(location, value.remaining() >> 1, memAddress(value));
    }

    // --- [ glUniform3ui64vNV ] ---

    /** {@code void glUniform3ui64vNV(GLint location, GLsizei count, GLuint64EXT const * value)} */
    public static native void nglUniform3ui64vNV(int location, int count, long value);

    /** {@code void glUniform3ui64vNV(GLint location, GLsizei count, GLuint64EXT const * value)} */
    public static void glUniform3ui64vNV(@NativeType("GLint") int location, @NativeType("GLuint64EXT const *") LongBuffer value) {
        nglUniform3ui64vNV(location, value.remaining() / 3, memAddress(value));
    }

    // --- [ glUniform4ui64vNV ] ---

    /** {@code void glUniform4ui64vNV(GLint location, GLsizei count, GLuint64EXT const * value)} */
    public static native void nglUniform4ui64vNV(int location, int count, long value);

    /** {@code void glUniform4ui64vNV(GLint location, GLsizei count, GLuint64EXT const * value)} */
    public static void glUniform4ui64vNV(@NativeType("GLint") int location, @NativeType("GLuint64EXT const *") LongBuffer value) {
        nglUniform4ui64vNV(location, value.remaining() >> 2, memAddress(value));
    }

    // --- [ glGetUniformi64vNV ] ---

    /** {@code void glGetUniformi64vNV(GLuint program, GLint location, GLint64EXT * params)} */
    public static native void nglGetUniformi64vNV(int program, int location, long params);

    /** {@code void glGetUniformi64vNV(GLuint program, GLint location, GLint64EXT * params)} */
    public static void glGetUniformi64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64EXT *") LongBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetUniformi64vNV(program, location, memAddress(params));
    }

    /** {@code void glGetUniformi64vNV(GLuint program, GLint location, GLint64EXT * params)} */
    @NativeType("void")
    public static long glGetUniformi64NV(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer params = stack.callocLong(1);
            nglGetUniformi64vNV(program, location, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
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
    public static native void glProgramUniform1i64NV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64EXT") long x);

    // --- [ glProgramUniform2i64NV ] ---

    /** {@code void glProgramUniform2i64NV(GLuint program, GLint location, GLint64EXT x, GLint64EXT y)} */
    public static native void glProgramUniform2i64NV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64EXT") long x, @NativeType("GLint64EXT") long y);

    // --- [ glProgramUniform3i64NV ] ---

    /** {@code void glProgramUniform3i64NV(GLuint program, GLint location, GLint64EXT x, GLint64EXT y, GLint64EXT z)} */
    public static native void glProgramUniform3i64NV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64EXT") long x, @NativeType("GLint64EXT") long y, @NativeType("GLint64EXT") long z);

    // --- [ glProgramUniform4i64NV ] ---

    /** {@code void glProgramUniform4i64NV(GLuint program, GLint location, GLint64EXT x, GLint64EXT y, GLint64EXT z, GLint64EXT w)} */
    public static native void glProgramUniform4i64NV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64EXT") long x, @NativeType("GLint64EXT") long y, @NativeType("GLint64EXT") long z, @NativeType("GLint64EXT") long w);

    // --- [ glProgramUniform1i64vNV ] ---

    /** {@code void glProgramUniform1i64vNV(GLuint program, GLint location, GLsizei count, GLint64EXT const * value)} */
    public static native void nglProgramUniform1i64vNV(int program, int location, int count, long value);

    /** {@code void glProgramUniform1i64vNV(GLuint program, GLint location, GLsizei count, GLint64EXT const * value)} */
    public static void glProgramUniform1i64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64EXT const *") LongBuffer value) {
        nglProgramUniform1i64vNV(program, location, value.remaining(), memAddress(value));
    }

    // --- [ glProgramUniform2i64vNV ] ---

    /** {@code void glProgramUniform2i64vNV(GLuint program, GLint location, GLsizei count, GLint64EXT const * value)} */
    public static native void nglProgramUniform2i64vNV(int program, int location, int count, long value);

    /** {@code void glProgramUniform2i64vNV(GLuint program, GLint location, GLsizei count, GLint64EXT const * value)} */
    public static void glProgramUniform2i64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64EXT const *") LongBuffer value) {
        nglProgramUniform2i64vNV(program, location, value.remaining() >> 1, memAddress(value));
    }

    // --- [ glProgramUniform3i64vNV ] ---

    /** {@code void glProgramUniform3i64vNV(GLuint program, GLint location, GLsizei count, GLint64EXT const * value)} */
    public static native void nglProgramUniform3i64vNV(int program, int location, int count, long value);

    /** {@code void glProgramUniform3i64vNV(GLuint program, GLint location, GLsizei count, GLint64EXT const * value)} */
    public static void glProgramUniform3i64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64EXT const *") LongBuffer value) {
        nglProgramUniform3i64vNV(program, location, value.remaining() / 3, memAddress(value));
    }

    // --- [ glProgramUniform4i64vNV ] ---

    /** {@code void glProgramUniform4i64vNV(GLuint program, GLint location, GLsizei count, GLint64EXT const * value)} */
    public static native void nglProgramUniform4i64vNV(int program, int location, int count, long value);

    /** {@code void glProgramUniform4i64vNV(GLuint program, GLint location, GLsizei count, GLint64EXT const * value)} */
    public static void glProgramUniform4i64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64EXT const *") LongBuffer value) {
        nglProgramUniform4i64vNV(program, location, value.remaining() >> 2, memAddress(value));
    }

    // --- [ glProgramUniform1ui64NV ] ---

    /** {@code void glProgramUniform1ui64NV(GLuint program, GLint location, GLuint64EXT x)} */
    public static native void glProgramUniform1ui64NV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64EXT") long x);

    // --- [ glProgramUniform2ui64NV ] ---

    /** {@code void glProgramUniform2ui64NV(GLuint program, GLint location, GLuint64EXT x, GLuint64EXT y)} */
    public static native void glProgramUniform2ui64NV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64EXT") long x, @NativeType("GLuint64EXT") long y);

    // --- [ glProgramUniform3ui64NV ] ---

    /** {@code void glProgramUniform3ui64NV(GLuint program, GLint location, GLuint64EXT x, GLuint64EXT y, GLuint64EXT z)} */
    public static native void glProgramUniform3ui64NV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64EXT") long x, @NativeType("GLuint64EXT") long y, @NativeType("GLuint64EXT") long z);

    // --- [ glProgramUniform4ui64NV ] ---

    /** {@code void glProgramUniform4ui64NV(GLuint program, GLint location, GLuint64EXT x, GLuint64EXT y, GLuint64EXT z, GLuint64EXT w)} */
    public static native void glProgramUniform4ui64NV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64EXT") long x, @NativeType("GLuint64EXT") long y, @NativeType("GLuint64EXT") long z, @NativeType("GLuint64EXT") long w);

    // --- [ glProgramUniform1ui64vNV ] ---

    /** {@code void glProgramUniform1ui64vNV(GLuint program, GLint location, GLsizei count, GLuint64EXT const * value)} */
    public static native void nglProgramUniform1ui64vNV(int program, int location, int count, long value);

    /** {@code void glProgramUniform1ui64vNV(GLuint program, GLint location, GLsizei count, GLuint64EXT const * value)} */
    public static void glProgramUniform1ui64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64EXT const *") LongBuffer value) {
        nglProgramUniform1ui64vNV(program, location, value.remaining(), memAddress(value));
    }

    // --- [ glProgramUniform2ui64vNV ] ---

    /** {@code void glProgramUniform2ui64vNV(GLuint program, GLint location, GLsizei count, GLuint64EXT const * value)} */
    public static native void nglProgramUniform2ui64vNV(int program, int location, int count, long value);

    /** {@code void glProgramUniform2ui64vNV(GLuint program, GLint location, GLsizei count, GLuint64EXT const * value)} */
    public static void glProgramUniform2ui64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64EXT const *") LongBuffer value) {
        nglProgramUniform2ui64vNV(program, location, value.remaining() >> 1, memAddress(value));
    }

    // --- [ glProgramUniform3ui64vNV ] ---

    /** {@code void glProgramUniform3ui64vNV(GLuint program, GLint location, GLsizei count, GLuint64EXT const * value)} */
    public static native void nglProgramUniform3ui64vNV(int program, int location, int count, long value);

    /** {@code void glProgramUniform3ui64vNV(GLuint program, GLint location, GLsizei count, GLuint64EXT const * value)} */
    public static void glProgramUniform3ui64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64EXT const *") LongBuffer value) {
        nglProgramUniform3ui64vNV(program, location, value.remaining() / 3, memAddress(value));
    }

    // --- [ glProgramUniform4ui64vNV ] ---

    /** {@code void glProgramUniform4ui64vNV(GLuint program, GLint location, GLsizei count, GLuint64EXT const * value)} */
    public static native void nglProgramUniform4ui64vNV(int program, int location, int count, long value);

    /** {@code void glProgramUniform4ui64vNV(GLuint program, GLint location, GLsizei count, GLuint64EXT const * value)} */
    public static void glProgramUniform4ui64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64EXT const *") LongBuffer value) {
        nglProgramUniform4ui64vNV(program, location, value.remaining() >> 2, memAddress(value));
    }

    /** {@code void glUniform1i64vNV(GLint location, GLsizei count, GLint64EXT const * value)} */
    public static void glUniform1i64vNV(@NativeType("GLint") int location, @NativeType("GLint64EXT const *") long[] value) {
        long __functionAddress = GL.getICD().glUniform1i64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length, value, __functionAddress);
    }

    /** {@code void glUniform2i64vNV(GLint location, GLsizei count, GLint64EXT const * value)} */
    public static void glUniform2i64vNV(@NativeType("GLint") int location, @NativeType("GLint64EXT const *") long[] value) {
        long __functionAddress = GL.getICD().glUniform2i64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length >> 1, value, __functionAddress);
    }

    /** {@code void glUniform3i64vNV(GLint location, GLsizei count, GLint64EXT const * value)} */
    public static void glUniform3i64vNV(@NativeType("GLint") int location, @NativeType("GLint64EXT const *") long[] value) {
        long __functionAddress = GL.getICD().glUniform3i64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length / 3, value, __functionAddress);
    }

    /** {@code void glUniform4i64vNV(GLint location, GLsizei count, GLint64EXT const * value)} */
    public static void glUniform4i64vNV(@NativeType("GLint") int location, @NativeType("GLint64EXT const *") long[] value) {
        long __functionAddress = GL.getICD().glUniform4i64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length >> 2, value, __functionAddress);
    }

    /** {@code void glUniform1ui64vNV(GLint location, GLsizei count, GLuint64EXT const * value)} */
    public static void glUniform1ui64vNV(@NativeType("GLint") int location, @NativeType("GLuint64EXT const *") long[] value) {
        long __functionAddress = GL.getICD().glUniform1ui64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length, value, __functionAddress);
    }

    /** {@code void glUniform2ui64vNV(GLint location, GLsizei count, GLuint64EXT * value)} */
    public static void glUniform2ui64vNV(@NativeType("GLint") int location, @NativeType("GLuint64EXT *") long[] value) {
        long __functionAddress = GL.getICD().glUniform2ui64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length >> 1, value, __functionAddress);
    }

    /** {@code void glUniform3ui64vNV(GLint location, GLsizei count, GLuint64EXT const * value)} */
    public static void glUniform3ui64vNV(@NativeType("GLint") int location, @NativeType("GLuint64EXT const *") long[] value) {
        long __functionAddress = GL.getICD().glUniform3ui64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length / 3, value, __functionAddress);
    }

    /** {@code void glUniform4ui64vNV(GLint location, GLsizei count, GLuint64EXT const * value)} */
    public static void glUniform4ui64vNV(@NativeType("GLint") int location, @NativeType("GLuint64EXT const *") long[] value) {
        long __functionAddress = GL.getICD().glUniform4ui64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length >> 2, value, __functionAddress);
    }

    /** {@code void glGetUniformi64vNV(GLuint program, GLint location, GLint64EXT * params)} */
    public static void glGetUniformi64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64EXT *") long[] params) {
        long __functionAddress = GL.getICD().glGetUniformi64vNV;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(program, location, params, __functionAddress);
    }

    /** {@code void glGetUniformui64vNV(GLuint program, GLint location, GLuint64EXT * params)} */
    public static void glGetUniformui64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64EXT *") long[] params) {
        NVShaderBufferLoad.glGetUniformui64vNV(program, location, params);
    }

    /** {@code void glProgramUniform1i64vNV(GLuint program, GLint location, GLsizei count, GLint64EXT const * value)} */
    public static void glProgramUniform1i64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64EXT const *") long[] value) {
        long __functionAddress = GL.getICD().glProgramUniform1i64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length, value, __functionAddress);
    }

    /** {@code void glProgramUniform2i64vNV(GLuint program, GLint location, GLsizei count, GLint64EXT const * value)} */
    public static void glProgramUniform2i64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64EXT const *") long[] value) {
        long __functionAddress = GL.getICD().glProgramUniform2i64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 1, value, __functionAddress);
    }

    /** {@code void glProgramUniform3i64vNV(GLuint program, GLint location, GLsizei count, GLint64EXT const * value)} */
    public static void glProgramUniform3i64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64EXT const *") long[] value) {
        long __functionAddress = GL.getICD().glProgramUniform3i64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 3, value, __functionAddress);
    }

    /** {@code void glProgramUniform4i64vNV(GLuint program, GLint location, GLsizei count, GLint64EXT const * value)} */
    public static void glProgramUniform4i64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64EXT const *") long[] value) {
        long __functionAddress = GL.getICD().glProgramUniform4i64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 2, value, __functionAddress);
    }

    /** {@code void glProgramUniform1ui64vNV(GLuint program, GLint location, GLsizei count, GLuint64EXT const * value)} */
    public static void glProgramUniform1ui64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64EXT const *") long[] value) {
        long __functionAddress = GL.getICD().glProgramUniform1ui64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length, value, __functionAddress);
    }

    /** {@code void glProgramUniform2ui64vNV(GLuint program, GLint location, GLsizei count, GLuint64EXT const * value)} */
    public static void glProgramUniform2ui64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64EXT const *") long[] value) {
        long __functionAddress = GL.getICD().glProgramUniform2ui64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 1, value, __functionAddress);
    }

    /** {@code void glProgramUniform3ui64vNV(GLuint program, GLint location, GLsizei count, GLuint64EXT const * value)} */
    public static void glProgramUniform3ui64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64EXT const *") long[] value) {
        long __functionAddress = GL.getICD().glProgramUniform3ui64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 3, value, __functionAddress);
    }

    /** {@code void glProgramUniform4ui64vNV(GLuint program, GLint location, GLsizei count, GLuint64EXT const * value)} */
    public static void glProgramUniform4ui64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64EXT const *") long[] value) {
        long __functionAddress = GL.getICD().glProgramUniform4ui64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 2, value, __functionAddress);
    }

}
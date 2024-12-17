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

public class ARBGPUShaderInt64 {

    static { GL.initialize(); }

    public static final int
        GL_INT64_ARB               = 0x140E,
        GL_UNSIGNED_INT64_ARB      = 0x140F,
        GL_INT64_VEC2_ARB          = 0x8FE9,
        GL_INT64_VEC3_ARB          = 0x8FEA,
        GL_INT64_VEC4_ARB          = 0x8FEB,
        GL_UNSIGNED_INT64_VEC2_ARB = 0x8FF5,
        GL_UNSIGNED_INT64_VEC3_ARB = 0x8FF6,
        GL_UNSIGNED_INT64_VEC4_ARB = 0x8FF7;

    protected ARBGPUShaderInt64() {
        throw new UnsupportedOperationException();
    }

    // --- [ glUniform1i64ARB ] ---

    /** {@code void glUniform1i64ARB(GLint location, GLint64 x)} */
    public static native void glUniform1i64ARB(@NativeType("GLint") int location, @NativeType("GLint64") long x);

    // --- [ glUniform1i64vARB ] ---

    /** {@code void glUniform1i64vARB(GLint location, GLsizei count, GLint64 * value)} */
    public static native void nglUniform1i64vARB(int location, int count, long value);

    /** {@code void glUniform1i64vARB(GLint location, GLsizei count, GLint64 * value)} */
    public static void glUniform1i64vARB(@NativeType("GLint") int location, @NativeType("GLint64 *") LongBuffer value) {
        nglUniform1i64vARB(location, value.remaining(), memAddress(value));
    }

    // --- [ glProgramUniform1i64ARB ] ---

    /** {@code void glProgramUniform1i64ARB(GLuint program, GLint location, GLint64 x)} */
    public static native void glProgramUniform1i64ARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64") long x);

    // --- [ glProgramUniform1i64vARB ] ---

    /** {@code void glProgramUniform1i64vARB(GLuint program, GLint location, GLsizei count, GLint64 * value)} */
    public static native void nglProgramUniform1i64vARB(int program, int location, int count, long value);

    /** {@code void glProgramUniform1i64vARB(GLuint program, GLint location, GLsizei count, GLint64 * value)} */
    public static void glProgramUniform1i64vARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64 *") LongBuffer value) {
        nglProgramUniform1i64vARB(program, location, value.remaining(), memAddress(value));
    }

    // --- [ glUniform2i64ARB ] ---

    /** {@code void glUniform2i64ARB(GLint location, GLint64 x, GLint64 y)} */
    public static native void glUniform2i64ARB(@NativeType("GLint") int location, @NativeType("GLint64") long x, @NativeType("GLint64") long y);

    // --- [ glUniform2i64vARB ] ---

    /** {@code void glUniform2i64vARB(GLint location, GLsizei count, GLint64 * value)} */
    public static native void nglUniform2i64vARB(int location, int count, long value);

    /** {@code void glUniform2i64vARB(GLint location, GLsizei count, GLint64 * value)} */
    public static void glUniform2i64vARB(@NativeType("GLint") int location, @NativeType("GLint64 *") LongBuffer value) {
        nglUniform2i64vARB(location, value.remaining() >> 1, memAddress(value));
    }

    // --- [ glProgramUniform2i64ARB ] ---

    /** {@code void glProgramUniform2i64ARB(GLuint program, GLint location, GLint64 x, GLint64 y)} */
    public static native void glProgramUniform2i64ARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64") long x, @NativeType("GLint64") long y);

    // --- [ glProgramUniform2i64vARB ] ---

    /** {@code void glProgramUniform2i64vARB(GLuint program, GLint location, GLsizei count, GLint64 * value)} */
    public static native void nglProgramUniform2i64vARB(int program, int location, int count, long value);

    /** {@code void glProgramUniform2i64vARB(GLuint program, GLint location, GLsizei count, GLint64 * value)} */
    public static void glProgramUniform2i64vARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64 *") LongBuffer value) {
        nglProgramUniform2i64vARB(program, location, value.remaining() >> 1, memAddress(value));
    }

    // --- [ glUniform3i64ARB ] ---

    /** {@code void glUniform3i64ARB(GLint location, GLint64 x, GLint64 y, GLint64 z)} */
    public static native void glUniform3i64ARB(@NativeType("GLint") int location, @NativeType("GLint64") long x, @NativeType("GLint64") long y, @NativeType("GLint64") long z);

    // --- [ glUniform3i64vARB ] ---

    /** {@code void glUniform3i64vARB(GLint location, GLsizei count, GLint64 * value)} */
    public static native void nglUniform3i64vARB(int location, int count, long value);

    /** {@code void glUniform3i64vARB(GLint location, GLsizei count, GLint64 * value)} */
    public static void glUniform3i64vARB(@NativeType("GLint") int location, @NativeType("GLint64 *") LongBuffer value) {
        nglUniform3i64vARB(location, value.remaining() / 3, memAddress(value));
    }

    // --- [ glProgramUniform3i64ARB ] ---

    /** {@code void glProgramUniform3i64ARB(GLuint program, GLint location, GLint64 x, GLint64 y, GLint64 z)} */
    public static native void glProgramUniform3i64ARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64") long x, @NativeType("GLint64") long y, @NativeType("GLint64") long z);

    // --- [ glProgramUniform3i64vARB ] ---

    /** {@code void glProgramUniform3i64vARB(GLuint program, GLint location, GLsizei count, GLint64 * value)} */
    public static native void nglProgramUniform3i64vARB(int program, int location, int count, long value);

    /** {@code void glProgramUniform3i64vARB(GLuint program, GLint location, GLsizei count, GLint64 * value)} */
    public static void glProgramUniform3i64vARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64 *") LongBuffer value) {
        nglProgramUniform3i64vARB(program, location, value.remaining() / 3, memAddress(value));
    }

    // --- [ glUniform4i64ARB ] ---

    /** {@code void glUniform4i64ARB(GLint location, GLint64 x, GLint64 y, GLint64 z, GLint64 w)} */
    public static native void glUniform4i64ARB(@NativeType("GLint") int location, @NativeType("GLint64") long x, @NativeType("GLint64") long y, @NativeType("GLint64") long z, @NativeType("GLint64") long w);

    // --- [ glUniform4i64vARB ] ---

    /** {@code void glUniform4i64vARB(GLint location, GLsizei count, GLint64 * value)} */
    public static native void nglUniform4i64vARB(int location, int count, long value);

    /** {@code void glUniform4i64vARB(GLint location, GLsizei count, GLint64 * value)} */
    public static void glUniform4i64vARB(@NativeType("GLint") int location, @NativeType("GLint64 *") LongBuffer value) {
        nglUniform4i64vARB(location, value.remaining() >> 2, memAddress(value));
    }

    // --- [ glProgramUniform4i64ARB ] ---

    /** {@code void glProgramUniform4i64ARB(GLuint program, GLint location, GLint64 x, GLint64 y, GLint64 z, GLint64 w)} */
    public static native void glProgramUniform4i64ARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64") long x, @NativeType("GLint64") long y, @NativeType("GLint64") long z, @NativeType("GLint64") long w);

    // --- [ glProgramUniform4i64vARB ] ---

    /** {@code void glProgramUniform4i64vARB(GLuint program, GLint location, GLsizei count, GLint64 * value)} */
    public static native void nglProgramUniform4i64vARB(int program, int location, int count, long value);

    /** {@code void glProgramUniform4i64vARB(GLuint program, GLint location, GLsizei count, GLint64 * value)} */
    public static void glProgramUniform4i64vARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64 *") LongBuffer value) {
        nglProgramUniform4i64vARB(program, location, value.remaining() >> 2, memAddress(value));
    }

    // --- [ glUniform1ui64ARB ] ---

    /** {@code void glUniform1ui64ARB(GLint location, GLuint64 x)} */
    public static native void glUniform1ui64ARB(@NativeType("GLint") int location, @NativeType("GLuint64") long x);

    // --- [ glUniform1ui64vARB ] ---

    /** {@code void glUniform1ui64vARB(GLint location, GLsizei count, GLuint64 const * value)} */
    public static native void nglUniform1ui64vARB(int location, int count, long value);

    /** {@code void glUniform1ui64vARB(GLint location, GLsizei count, GLuint64 const * value)} */
    public static void glUniform1ui64vARB(@NativeType("GLint") int location, @NativeType("GLuint64 const *") LongBuffer value) {
        nglUniform1ui64vARB(location, value.remaining(), memAddress(value));
    }

    // --- [ glProgramUniform1ui64ARB ] ---

    /** {@code void glProgramUniform1ui64ARB(GLuint program, GLint location, GLuint64 x)} */
    public static native void glProgramUniform1ui64ARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64") long x);

    // --- [ glProgramUniform1ui64vARB ] ---

    /** {@code void glProgramUniform1ui64vARB(GLuint program, GLint location, GLsizei count, GLuint64 const * value)} */
    public static native void nglProgramUniform1ui64vARB(int program, int location, int count, long value);

    /** {@code void glProgramUniform1ui64vARB(GLuint program, GLint location, GLsizei count, GLuint64 const * value)} */
    public static void glProgramUniform1ui64vARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64 const *") LongBuffer value) {
        nglProgramUniform1ui64vARB(program, location, value.remaining(), memAddress(value));
    }

    // --- [ glUniform2ui64ARB ] ---

    /** {@code void glUniform2ui64ARB(GLint location, GLuint64 x, GLuint64 y)} */
    public static native void glUniform2ui64ARB(@NativeType("GLint") int location, @NativeType("GLuint64") long x, @NativeType("GLuint64") long y);

    // --- [ glUniform2ui64vARB ] ---

    /** {@code void glUniform2ui64vARB(GLint location, GLsizei count, GLuint64 const * value)} */
    public static native void nglUniform2ui64vARB(int location, int count, long value);

    /** {@code void glUniform2ui64vARB(GLint location, GLsizei count, GLuint64 const * value)} */
    public static void glUniform2ui64vARB(@NativeType("GLint") int location, @NativeType("GLuint64 const *") LongBuffer value) {
        nglUniform2ui64vARB(location, value.remaining() >> 1, memAddress(value));
    }

    // --- [ glProgramUniform2ui64ARB ] ---

    /** {@code void glProgramUniform2ui64ARB(GLuint program, GLint location, GLuint64 x, GLuint64 y)} */
    public static native void glProgramUniform2ui64ARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64") long x, @NativeType("GLuint64") long y);

    // --- [ glProgramUniform2ui64vARB ] ---

    /** {@code void glProgramUniform2ui64vARB(GLuint program, GLint location, GLsizei count, GLuint64 const * value)} */
    public static native void nglProgramUniform2ui64vARB(int program, int location, int count, long value);

    /** {@code void glProgramUniform2ui64vARB(GLuint program, GLint location, GLsizei count, GLuint64 const * value)} */
    public static void glProgramUniform2ui64vARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64 const *") LongBuffer value) {
        nglProgramUniform2ui64vARB(program, location, value.remaining() >> 1, memAddress(value));
    }

    // --- [ glUniform3ui64ARB ] ---

    /** {@code void glUniform3ui64ARB(GLint location, GLuint64 x, GLuint64 y, GLuint64 z)} */
    public static native void glUniform3ui64ARB(@NativeType("GLint") int location, @NativeType("GLuint64") long x, @NativeType("GLuint64") long y, @NativeType("GLuint64") long z);

    // --- [ glUniform3ui64vARB ] ---

    /** {@code void glUniform3ui64vARB(GLint location, GLsizei count, GLuint64 const * value)} */
    public static native void nglUniform3ui64vARB(int location, int count, long value);

    /** {@code void glUniform3ui64vARB(GLint location, GLsizei count, GLuint64 const * value)} */
    public static void glUniform3ui64vARB(@NativeType("GLint") int location, @NativeType("GLuint64 const *") LongBuffer value) {
        nglUniform3ui64vARB(location, value.remaining() / 3, memAddress(value));
    }

    // --- [ glProgramUniform3ui64ARB ] ---

    /** {@code void glProgramUniform3ui64ARB(GLuint program, GLint location, GLuint64 x, GLuint64 y, GLuint64 z)} */
    public static native void glProgramUniform3ui64ARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64") long x, @NativeType("GLuint64") long y, @NativeType("GLuint64") long z);

    // --- [ glProgramUniform3ui64vARB ] ---

    /** {@code void glProgramUniform3ui64vARB(GLuint program, GLint location, GLsizei count, GLuint64 const * value)} */
    public static native void nglProgramUniform3ui64vARB(int program, int location, int count, long value);

    /** {@code void glProgramUniform3ui64vARB(GLuint program, GLint location, GLsizei count, GLuint64 const * value)} */
    public static void glProgramUniform3ui64vARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64 const *") LongBuffer value) {
        nglProgramUniform3ui64vARB(program, location, value.remaining() / 3, memAddress(value));
    }

    // --- [ glUniform4ui64ARB ] ---

    /** {@code void glUniform4ui64ARB(GLint location, GLuint64 x, GLuint64 y, GLuint64 z, GLuint64 w)} */
    public static native void glUniform4ui64ARB(@NativeType("GLint") int location, @NativeType("GLuint64") long x, @NativeType("GLuint64") long y, @NativeType("GLuint64") long z, @NativeType("GLuint64") long w);

    // --- [ glUniform4ui64vARB ] ---

    /** {@code void glUniform4ui64vARB(GLint location, GLsizei count, GLuint64 const * value)} */
    public static native void nglUniform4ui64vARB(int location, int count, long value);

    /** {@code void glUniform4ui64vARB(GLint location, GLsizei count, GLuint64 const * value)} */
    public static void glUniform4ui64vARB(@NativeType("GLint") int location, @NativeType("GLuint64 const *") LongBuffer value) {
        nglUniform4ui64vARB(location, value.remaining() >> 2, memAddress(value));
    }

    // --- [ glProgramUniform4ui64ARB ] ---

    /** {@code void glProgramUniform4ui64ARB(GLuint program, GLint location, GLuint64 x, GLuint64 y, GLuint64 z, GLuint64 w)} */
    public static native void glProgramUniform4ui64ARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64") long x, @NativeType("GLuint64") long y, @NativeType("GLuint64") long z, @NativeType("GLuint64") long w);

    // --- [ glProgramUniform4ui64vARB ] ---

    /** {@code void glProgramUniform4ui64vARB(GLuint program, GLint location, GLsizei count, GLuint64 const * value)} */
    public static native void nglProgramUniform4ui64vARB(int program, int location, int count, long value);

    /** {@code void glProgramUniform4ui64vARB(GLuint program, GLint location, GLsizei count, GLuint64 const * value)} */
    public static void glProgramUniform4ui64vARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64 const *") LongBuffer value) {
        nglProgramUniform4ui64vARB(program, location, value.remaining() >> 2, memAddress(value));
    }

    // --- [ glGetUniformi64vARB ] ---

    /** {@code void glGetUniformi64vARB(GLuint program, GLint location, GLint64 * params)} */
    public static native void nglGetUniformi64vARB(int program, int location, long params);

    /** {@code void glGetUniformi64vARB(GLuint program, GLint location, GLint64 * params)} */
    public static void glGetUniformi64vARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64 *") LongBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetUniformi64vARB(program, location, memAddress(params));
    }

    /** {@code void glGetUniformi64vARB(GLuint program, GLint location, GLint64 * params)} */
    @NativeType("void")
    public static long glGetUniformi64vARB(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer params = stack.callocLong(1);
            nglGetUniformi64vARB(program, location, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetUniformui64vARB ] ---

    /** {@code void glGetUniformui64vARB(GLuint program, GLint location, GLuint64 * params)} */
    public static native void nglGetUniformui64vARB(int program, int location, long params);

    /** {@code void glGetUniformui64vARB(GLuint program, GLint location, GLuint64 * params)} */
    public static void glGetUniformui64vARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64 *") LongBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetUniformui64vARB(program, location, memAddress(params));
    }

    /** {@code void glGetUniformui64vARB(GLuint program, GLint location, GLuint64 * params)} */
    @NativeType("void")
    public static long glGetUniformui64vARB(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer params = stack.callocLong(1);
            nglGetUniformui64vARB(program, location, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetnUniformi64vARB ] ---

    /** {@code void glGetnUniformi64vARB(GLuint program, GLint location, GLsizei bufSize, GLint64 * params)} */
    public static native void nglGetnUniformi64vARB(int program, int location, int bufSize, long params);

    /** {@code void glGetnUniformi64vARB(GLuint program, GLint location, GLsizei bufSize, GLint64 * params)} */
    public static void glGetnUniformi64vARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64 *") LongBuffer params) {
        nglGetnUniformi64vARB(program, location, params.remaining(), memAddress(params));
    }

    /** {@code void glGetnUniformi64vARB(GLuint program, GLint location, GLsizei bufSize, GLint64 * params)} */
    @NativeType("void")
    public static long glGetnUniformi64vARB(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer params = stack.callocLong(1);
            nglGetnUniformi64vARB(program, location, 1, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetnUniformui64vARB ] ---

    /** {@code void glGetnUniformui64vARB(GLuint program, GLint location, GLsizei bufSize, GLuint64 * params)} */
    public static native void nglGetnUniformui64vARB(int program, int location, int bufSize, long params);

    /** {@code void glGetnUniformui64vARB(GLuint program, GLint location, GLsizei bufSize, GLuint64 * params)} */
    public static void glGetnUniformui64vARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64 *") LongBuffer params) {
        nglGetnUniformui64vARB(program, location, params.remaining(), memAddress(params));
    }

    /** {@code void glGetnUniformui64vARB(GLuint program, GLint location, GLsizei bufSize, GLuint64 * params)} */
    @NativeType("void")
    public static long glGetnUniformui64vARB(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer params = stack.callocLong(1);
            nglGetnUniformui64vARB(program, location, 1, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glUniform1i64vARB(GLint location, GLsizei count, GLint64 * value)} */
    public static void glUniform1i64vARB(@NativeType("GLint") int location, @NativeType("GLint64 *") long[] value) {
        long __functionAddress = GL.getICD().glUniform1i64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length, value, __functionAddress);
    }

    /** {@code void glProgramUniform1i64vARB(GLuint program, GLint location, GLsizei count, GLint64 * value)} */
    public static void glProgramUniform1i64vARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64 *") long[] value) {
        long __functionAddress = GL.getICD().glProgramUniform1i64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length, value, __functionAddress);
    }

    /** {@code void glUniform2i64vARB(GLint location, GLsizei count, GLint64 * value)} */
    public static void glUniform2i64vARB(@NativeType("GLint") int location, @NativeType("GLint64 *") long[] value) {
        long __functionAddress = GL.getICD().glUniform2i64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length >> 1, value, __functionAddress);
    }

    /** {@code void glProgramUniform2i64vARB(GLuint program, GLint location, GLsizei count, GLint64 * value)} */
    public static void glProgramUniform2i64vARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64 *") long[] value) {
        long __functionAddress = GL.getICD().glProgramUniform2i64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 1, value, __functionAddress);
    }

    /** {@code void glUniform3i64vARB(GLint location, GLsizei count, GLint64 * value)} */
    public static void glUniform3i64vARB(@NativeType("GLint") int location, @NativeType("GLint64 *") long[] value) {
        long __functionAddress = GL.getICD().glUniform3i64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length / 3, value, __functionAddress);
    }

    /** {@code void glProgramUniform3i64vARB(GLuint program, GLint location, GLsizei count, GLint64 * value)} */
    public static void glProgramUniform3i64vARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64 *") long[] value) {
        long __functionAddress = GL.getICD().glProgramUniform3i64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 3, value, __functionAddress);
    }

    /** {@code void glUniform4i64vARB(GLint location, GLsizei count, GLint64 * value)} */
    public static void glUniform4i64vARB(@NativeType("GLint") int location, @NativeType("GLint64 *") long[] value) {
        long __functionAddress = GL.getICD().glUniform4i64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length >> 2, value, __functionAddress);
    }

    /** {@code void glProgramUniform4i64vARB(GLuint program, GLint location, GLsizei count, GLint64 * value)} */
    public static void glProgramUniform4i64vARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64 *") long[] value) {
        long __functionAddress = GL.getICD().glProgramUniform4i64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 2, value, __functionAddress);
    }

    /** {@code void glUniform1ui64vARB(GLint location, GLsizei count, GLuint64 const * value)} */
    public static void glUniform1ui64vARB(@NativeType("GLint") int location, @NativeType("GLuint64 const *") long[] value) {
        long __functionAddress = GL.getICD().glUniform1ui64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length, value, __functionAddress);
    }

    /** {@code void glProgramUniform1ui64vARB(GLuint program, GLint location, GLsizei count, GLuint64 const * value)} */
    public static void glProgramUniform1ui64vARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64 const *") long[] value) {
        long __functionAddress = GL.getICD().glProgramUniform1ui64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length, value, __functionAddress);
    }

    /** {@code void glUniform2ui64vARB(GLint location, GLsizei count, GLuint64 const * value)} */
    public static void glUniform2ui64vARB(@NativeType("GLint") int location, @NativeType("GLuint64 const *") long[] value) {
        long __functionAddress = GL.getICD().glUniform2ui64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length >> 1, value, __functionAddress);
    }

    /** {@code void glProgramUniform2ui64vARB(GLuint program, GLint location, GLsizei count, GLuint64 const * value)} */
    public static void glProgramUniform2ui64vARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64 const *") long[] value) {
        long __functionAddress = GL.getICD().glProgramUniform2ui64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 1, value, __functionAddress);
    }

    /** {@code void glUniform3ui64vARB(GLint location, GLsizei count, GLuint64 const * value)} */
    public static void glUniform3ui64vARB(@NativeType("GLint") int location, @NativeType("GLuint64 const *") long[] value) {
        long __functionAddress = GL.getICD().glUniform3ui64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length / 3, value, __functionAddress);
    }

    /** {@code void glProgramUniform3ui64vARB(GLuint program, GLint location, GLsizei count, GLuint64 const * value)} */
    public static void glProgramUniform3ui64vARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64 const *") long[] value) {
        long __functionAddress = GL.getICD().glProgramUniform3ui64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 3, value, __functionAddress);
    }

    /** {@code void glUniform4ui64vARB(GLint location, GLsizei count, GLuint64 const * value)} */
    public static void glUniform4ui64vARB(@NativeType("GLint") int location, @NativeType("GLuint64 const *") long[] value) {
        long __functionAddress = GL.getICD().glUniform4ui64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length >> 2, value, __functionAddress);
    }

    /** {@code void glProgramUniform4ui64vARB(GLuint program, GLint location, GLsizei count, GLuint64 const * value)} */
    public static void glProgramUniform4ui64vARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64 const *") long[] value) {
        long __functionAddress = GL.getICD().glProgramUniform4ui64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 2, value, __functionAddress);
    }

    /** {@code void glGetUniformi64vARB(GLuint program, GLint location, GLint64 * params)} */
    public static void glGetUniformi64vARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64 *") long[] params) {
        long __functionAddress = GL.getICD().glGetUniformi64vARB;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(program, location, params, __functionAddress);
    }

    /** {@code void glGetUniformui64vARB(GLuint program, GLint location, GLuint64 * params)} */
    public static void glGetUniformui64vARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64 *") long[] params) {
        long __functionAddress = GL.getICD().glGetUniformui64vARB;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(program, location, params, __functionAddress);
    }

    /** {@code void glGetnUniformi64vARB(GLuint program, GLint location, GLsizei bufSize, GLint64 * params)} */
    public static void glGetnUniformi64vARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64 *") long[] params) {
        long __functionAddress = GL.getICD().glGetnUniformi64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, params.length, params, __functionAddress);
    }

    /** {@code void glGetnUniformui64vARB(GLuint program, GLint location, GLsizei bufSize, GLuint64 * params)} */
    public static void glGetnUniformui64vARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64 *") long[] params) {
        long __functionAddress = GL.getICD().glGetnUniformui64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, params.length, params, __functionAddress);
    }

}
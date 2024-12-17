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

public class NVShaderBufferLoad {

    static { GL.initialize(); }

    public static final int GL_BUFFER_GPU_ADDRESS_NV = 0x8F1D;

    public static final int GL_GPU_ADDRESS_NV = 0x8F34;

    public static final int GL_MAX_SHADER_BUFFER_ADDRESS_NV = 0x8F35;

    protected NVShaderBufferLoad() {
        throw new UnsupportedOperationException();
    }

    // --- [ glMakeBufferResidentNV ] ---

    /** {@code void glMakeBufferResidentNV(GLenum target, GLenum access)} */
    public static native void glMakeBufferResidentNV(@NativeType("GLenum") int target, @NativeType("GLenum") int access);

    // --- [ glMakeBufferNonResidentNV ] ---

    /** {@code void glMakeBufferNonResidentNV(GLenum target)} */
    public static native void glMakeBufferNonResidentNV(@NativeType("GLenum") int target);

    // --- [ glIsBufferResidentNV ] ---

    /** {@code GLboolean glIsBufferResidentNV(GLenum target)} */
    @NativeType("GLboolean")
    public static native boolean glIsBufferResidentNV(@NativeType("GLenum") int target);

    // --- [ glMakeNamedBufferResidentNV ] ---

    /** {@code void glMakeNamedBufferResidentNV(GLuint buffer, GLenum access)} */
    public static native void glMakeNamedBufferResidentNV(@NativeType("GLuint") int buffer, @NativeType("GLenum") int access);

    // --- [ glMakeNamedBufferNonResidentNV ] ---

    /** {@code void glMakeNamedBufferNonResidentNV(GLuint buffer)} */
    public static native void glMakeNamedBufferNonResidentNV(@NativeType("GLuint") int buffer);

    // --- [ glIsNamedBufferResidentNV ] ---

    /** {@code GLboolean glIsNamedBufferResidentNV(GLuint buffer)} */
    @NativeType("GLboolean")
    public static native boolean glIsNamedBufferResidentNV(@NativeType("GLuint") int buffer);

    // --- [ glGetBufferParameterui64vNV ] ---

    /** {@code void glGetBufferParameterui64vNV(GLenum target, GLenum pname, GLuint64EXT * params)} */
    public static native void nglGetBufferParameterui64vNV(int target, int pname, long params);

    /** {@code void glGetBufferParameterui64vNV(GLenum target, GLenum pname, GLuint64EXT * params)} */
    public static void glGetBufferParameterui64vNV(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint64EXT *") LongBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetBufferParameterui64vNV(target, pname, memAddress(params));
    }

    /** {@code void glGetBufferParameterui64vNV(GLenum target, GLenum pname, GLuint64EXT * params)} */
    @NativeType("void")
    public static long glGetBufferParameterui64NV(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer params = stack.callocLong(1);
            nglGetBufferParameterui64vNV(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetNamedBufferParameterui64vNV ] ---

    /** {@code void glGetNamedBufferParameterui64vNV(GLuint buffer, GLenum pname, GLuint64EXT * params)} */
    public static native void nglGetNamedBufferParameterui64vNV(int buffer, int pname, long params);

    /** {@code void glGetNamedBufferParameterui64vNV(GLuint buffer, GLenum pname, GLuint64EXT * params)} */
    public static void glGetNamedBufferParameterui64vNV(@NativeType("GLuint") int buffer, @NativeType("GLenum") int pname, @NativeType("GLuint64EXT *") LongBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetNamedBufferParameterui64vNV(buffer, pname, memAddress(params));
    }

    /** {@code void glGetNamedBufferParameterui64vNV(GLuint buffer, GLenum pname, GLuint64EXT * params)} */
    @NativeType("void")
    public static long glGetNamedBufferParameterui64NV(@NativeType("GLuint") int buffer, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer params = stack.callocLong(1);
            nglGetNamedBufferParameterui64vNV(buffer, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetIntegerui64vNV ] ---

    /** {@code void glGetIntegerui64vNV(GLenum value, GLuint64EXT * result)} */
    public static native void nglGetIntegerui64vNV(int value, long result);

    /** {@code void glGetIntegerui64vNV(GLenum value, GLuint64EXT * result)} */
    public static void glGetIntegerui64vNV(@NativeType("GLenum") int value, @NativeType("GLuint64EXT *") LongBuffer result) {
        if (CHECKS) {
            check(result, 1);
        }
        nglGetIntegerui64vNV(value, memAddress(result));
    }

    /** {@code void glGetIntegerui64vNV(GLenum value, GLuint64EXT * result)} */
    @NativeType("void")
    public static long glGetIntegerui64NV(@NativeType("GLenum") int value) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer result = stack.callocLong(1);
            nglGetIntegerui64vNV(value, memAddress(result));
            return result.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glUniformui64NV ] ---

    /** {@code void glUniformui64NV(GLint location, GLuint64EXT value)} */
    public static native void glUniformui64NV(@NativeType("GLint") int location, @NativeType("GLuint64EXT") long value);

    // --- [ glUniformui64vNV ] ---

    /** {@code void glUniformui64vNV(GLint location, GLsizei count, GLuint64EXT const * value)} */
    public static native void nglUniformui64vNV(int location, int count, long value);

    /** {@code void glUniformui64vNV(GLint location, GLsizei count, GLuint64EXT const * value)} */
    public static void glUniformui64vNV(@NativeType("GLint") int location, @NativeType("GLuint64EXT const *") LongBuffer value) {
        nglUniformui64vNV(location, value.remaining(), memAddress(value));
    }

    // --- [ glGetUniformui64vNV ] ---

    /** {@code void glGetUniformui64vNV(GLuint program, GLint location, GLuint64EXT * params)} */
    public static native void nglGetUniformui64vNV(int program, int location, long params);

    /** {@code void glGetUniformui64vNV(GLuint program, GLint location, GLuint64EXT * params)} */
    public static void glGetUniformui64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64EXT *") LongBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetUniformui64vNV(program, location, memAddress(params));
    }

    /** {@code void glGetUniformui64vNV(GLuint program, GLint location, GLuint64EXT * params)} */
    @NativeType("void")
    public static long glGetUniformui64NV(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer params = stack.callocLong(1);
            nglGetUniformui64vNV(program, location, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glProgramUniformui64NV ] ---

    /** {@code void glProgramUniformui64NV(GLuint program, GLint location, GLuint64EXT value)} */
    public static native void glProgramUniformui64NV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64EXT") long value);

    // --- [ glProgramUniformui64vNV ] ---

    /** {@code void glProgramUniformui64vNV(GLuint program, GLint location, GLsizei count, GLuint64EXT const * value)} */
    public static native void nglProgramUniformui64vNV(int program, int location, int count, long value);

    /** {@code void glProgramUniformui64vNV(GLuint program, GLint location, GLsizei count, GLuint64EXT const * value)} */
    public static void glProgramUniformui64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64EXT const *") LongBuffer value) {
        nglProgramUniformui64vNV(program, location, value.remaining(), memAddress(value));
    }

    /** {@code void glGetBufferParameterui64vNV(GLenum target, GLenum pname, GLuint64EXT * params)} */
    public static void glGetBufferParameterui64vNV(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint64EXT *") long[] params) {
        long __functionAddress = GL.getICD().glGetBufferParameterui64vNV;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** {@code void glGetNamedBufferParameterui64vNV(GLuint buffer, GLenum pname, GLuint64EXT * params)} */
    public static void glGetNamedBufferParameterui64vNV(@NativeType("GLuint") int buffer, @NativeType("GLenum") int pname, @NativeType("GLuint64EXT *") long[] params) {
        long __functionAddress = GL.getICD().glGetNamedBufferParameterui64vNV;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(buffer, pname, params, __functionAddress);
    }

    /** {@code void glGetIntegerui64vNV(GLenum value, GLuint64EXT * result)} */
    public static void glGetIntegerui64vNV(@NativeType("GLenum") int value, @NativeType("GLuint64EXT *") long[] result) {
        long __functionAddress = GL.getICD().glGetIntegerui64vNV;
        if (CHECKS) {
            check(__functionAddress);
            check(result, 1);
        }
        callPV(value, result, __functionAddress);
    }

    /** {@code void glUniformui64vNV(GLint location, GLsizei count, GLuint64EXT const * value)} */
    public static void glUniformui64vNV(@NativeType("GLint") int location, @NativeType("GLuint64EXT const *") long[] value) {
        long __functionAddress = GL.getICD().glUniformui64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length, value, __functionAddress);
    }

    /** {@code void glGetUniformui64vNV(GLuint program, GLint location, GLuint64EXT * params)} */
    public static void glGetUniformui64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64EXT *") long[] params) {
        long __functionAddress = GL.getICD().glGetUniformui64vNV;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(program, location, params, __functionAddress);
    }

    /** {@code void glProgramUniformui64vNV(GLuint program, GLint location, GLsizei count, GLuint64EXT const * value)} */
    public static void glProgramUniformui64vNV(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64EXT const *") long[] value) {
        long __functionAddress = GL.getICD().glProgramUniformui64vNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length, value, __functionAddress);
    }

}
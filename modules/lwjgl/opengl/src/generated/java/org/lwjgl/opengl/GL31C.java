/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class GL31C extends GL30C {

    static { GL.initialize(); }

    public static final int
        GL_R8_SNORM     = 0x8F94,
        GL_RG8_SNORM    = 0x8F95,
        GL_RGB8_SNORM   = 0x8F96,
        GL_RGBA8_SNORM  = 0x8F97,
        GL_R16_SNORM    = 0x8F98,
        GL_RG16_SNORM   = 0x8F99,
        GL_RGB16_SNORM  = 0x8F9A,
        GL_RGBA16_SNORM = 0x8F9B;

    public static final int GL_SIGNED_NORMALIZED = 0x8F9C;

    public static final int
        GL_SAMPLER_BUFFER               = 0x8DC2,
        GL_INT_SAMPLER_2D_RECT          = 0x8DCD,
        GL_INT_SAMPLER_BUFFER           = 0x8DD0,
        GL_UNSIGNED_INT_SAMPLER_2D_RECT = 0x8DD5,
        GL_UNSIGNED_INT_SAMPLER_BUFFER  = 0x8DD8;

    public static final int
        GL_COPY_READ_BUFFER  = 0x8F36,
        GL_COPY_WRITE_BUFFER = 0x8F37;

    public static final int GL_PRIMITIVE_RESTART = 0x8F9D;

    public static final int GL_PRIMITIVE_RESTART_INDEX = 0x8F9E;

    public static final int GL_TEXTURE_BUFFER = 0x8C2A;

    public static final int
        GL_MAX_TEXTURE_BUFFER_SIZE           = 0x8C2B,
        GL_TEXTURE_BINDING_BUFFER            = 0x8C2C,
        GL_TEXTURE_BUFFER_DATA_STORE_BINDING = 0x8C2D;

    public static final int GL_TEXTURE_RECTANGLE = 0x84F5;

    public static final int GL_TEXTURE_BINDING_RECTANGLE = 0x84F6;

    public static final int GL_PROXY_TEXTURE_RECTANGLE = 0x84F7;

    public static final int GL_MAX_RECTANGLE_TEXTURE_SIZE = 0x84F8;

    public static final int GL_SAMPLER_2D_RECT = 0x8B63;

    public static final int GL_SAMPLER_2D_RECT_SHADOW = 0x8B64;

    public static final int GL_UNIFORM_BUFFER = 0x8A11;

    public static final int GL_UNIFORM_BUFFER_BINDING = 0x8A28;

    public static final int
        GL_UNIFORM_BUFFER_START = 0x8A29,
        GL_UNIFORM_BUFFER_SIZE  = 0x8A2A;

    public static final int
        GL_MAX_VERTEX_UNIFORM_BLOCKS                = 0x8A2B,
        GL_MAX_GEOMETRY_UNIFORM_BLOCKS              = 0x8A2C,
        GL_MAX_FRAGMENT_UNIFORM_BLOCKS              = 0x8A2D,
        GL_MAX_COMBINED_UNIFORM_BLOCKS              = 0x8A2E,
        GL_MAX_UNIFORM_BUFFER_BINDINGS              = 0x8A2F,
        GL_MAX_UNIFORM_BLOCK_SIZE                   = 0x8A30,
        GL_MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS   = 0x8A31,
        GL_MAX_COMBINED_GEOMETRY_UNIFORM_COMPONENTS = 0x8A32,
        GL_MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS = 0x8A33,
        GL_UNIFORM_BUFFER_OFFSET_ALIGNMENT          = 0x8A34;

    public static final int
        GL_ACTIVE_UNIFORM_BLOCK_MAX_NAME_LENGTH = 0x8A35,
        GL_ACTIVE_UNIFORM_BLOCKS                = 0x8A36;

    public static final int
        GL_UNIFORM_TYPE          = 0x8A37,
        GL_UNIFORM_SIZE          = 0x8A38,
        GL_UNIFORM_NAME_LENGTH   = 0x8A39,
        GL_UNIFORM_BLOCK_INDEX   = 0x8A3A,
        GL_UNIFORM_OFFSET        = 0x8A3B,
        GL_UNIFORM_ARRAY_STRIDE  = 0x8A3C,
        GL_UNIFORM_MATRIX_STRIDE = 0x8A3D,
        GL_UNIFORM_IS_ROW_MAJOR  = 0x8A3E;

    public static final int
        GL_UNIFORM_BLOCK_BINDING                       = 0x8A3F,
        GL_UNIFORM_BLOCK_DATA_SIZE                     = 0x8A40,
        GL_UNIFORM_BLOCK_NAME_LENGTH                   = 0x8A41,
        GL_UNIFORM_BLOCK_ACTIVE_UNIFORMS               = 0x8A42,
        GL_UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES        = 0x8A43,
        GL_UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER   = 0x8A44,
        GL_UNIFORM_BLOCK_REFERENCED_BY_GEOMETRY_SHADER = 0x8A45,
        GL_UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER = 0x8A46;

    public static final int GL_INVALID_INDEX = 0xFFFFFFFF;

    protected GL31C() {
        throw new UnsupportedOperationException();
    }

    // --- [ glDrawArraysInstanced ] ---

    /** {@code void glDrawArraysInstanced(GLenum mode, GLint first, GLsizei count, GLsizei primcount)} */
    public static native void glDrawArraysInstanced(@NativeType("GLenum") int mode, @NativeType("GLint") int first, @NativeType("GLsizei") int count, @NativeType("GLsizei") int primcount);

    // --- [ glDrawElementsInstanced ] ---

    /** {@code void glDrawElementsInstanced(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount)} */
    public static native void nglDrawElementsInstanced(int mode, int count, int type, long indices, int primcount);

    /** {@code void glDrawElementsInstanced(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount)} */
    public static void glDrawElementsInstanced(@NativeType("GLenum") int mode, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices, @NativeType("GLsizei") int primcount) {
        nglDrawElementsInstanced(mode, count, type, indices, primcount);
    }

    /** {@code void glDrawElementsInstanced(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount)} */
    public static void glDrawElementsInstanced(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int primcount) {
        nglDrawElementsInstanced(mode, indices.remaining() >> GLChecks.typeToByteShift(type), type, memAddress(indices), primcount);
    }

    /** {@code void glDrawElementsInstanced(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount)} */
    public static void glDrawElementsInstanced(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int primcount) {
        nglDrawElementsInstanced(mode, indices.remaining(), GL11.GL_UNSIGNED_BYTE, memAddress(indices), primcount);
    }

    /** {@code void glDrawElementsInstanced(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount)} */
    public static void glDrawElementsInstanced(@NativeType("GLenum") int mode, @NativeType("void const *") ShortBuffer indices, @NativeType("GLsizei") int primcount) {
        nglDrawElementsInstanced(mode, indices.remaining(), GL11.GL_UNSIGNED_SHORT, memAddress(indices), primcount);
    }

    /** {@code void glDrawElementsInstanced(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount)} */
    public static void glDrawElementsInstanced(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indices, @NativeType("GLsizei") int primcount) {
        nglDrawElementsInstanced(mode, indices.remaining(), GL11.GL_UNSIGNED_INT, memAddress(indices), primcount);
    }

    // --- [ glCopyBufferSubData ] ---

    /** {@code void glCopyBufferSubData(GLenum readTarget, GLenum writeTarget, GLintptr readOffset, GLintptr writeOffset, GLsizeiptr size)} */
    public static native void glCopyBufferSubData(@NativeType("GLenum") int readTarget, @NativeType("GLenum") int writeTarget, @NativeType("GLintptr") long readOffset, @NativeType("GLintptr") long writeOffset, @NativeType("GLsizeiptr") long size);

    // --- [ glPrimitiveRestartIndex ] ---

    /** {@code void glPrimitiveRestartIndex(GLuint index)} */
    public static native void glPrimitiveRestartIndex(@NativeType("GLuint") int index);

    // --- [ glTexBuffer ] ---

    /** {@code void glTexBuffer(GLenum target, GLenum internalformat, GLuint buffer)} */
    public static native void glTexBuffer(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLuint") int buffer);

    // --- [ glGetUniformIndices ] ---

    /** {@code void glGetUniformIndices(GLuint program, GLsizei uniformCount, GLchar const * const * uniformNames, GLuint * uniformIndices)} */
    public static native void nglGetUniformIndices(int program, int uniformCount, long uniformNames, long uniformIndices);

    /** {@code void glGetUniformIndices(GLuint program, GLsizei uniformCount, GLchar const * const * uniformNames, GLuint * uniformIndices)} */
    public static void glGetUniformIndices(@NativeType("GLuint") int program, @NativeType("GLchar const * const *") PointerBuffer uniformNames, @NativeType("GLuint *") IntBuffer uniformIndices) {
        if (CHECKS) {
            check(uniformIndices, uniformNames.remaining());
        }
        nglGetUniformIndices(program, uniformNames.remaining(), memAddress(uniformNames), memAddress(uniformIndices));
    }

    /** {@code void glGetUniformIndices(GLuint program, GLsizei uniformCount, GLchar const * const * uniformNames, GLuint * uniformIndices)} */
    public static void glGetUniformIndices(@NativeType("GLuint") int program, @NativeType("GLchar const * const *") CharSequence[] uniformNames, @NativeType("GLuint *") IntBuffer uniformIndices) {
        if (CHECKS) {
            check(uniformIndices, uniformNames.length);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long uniformNamesAddress = org.lwjgl.system.APIUtil.apiArray(stack, MemoryUtil::memASCII, uniformNames);
            nglGetUniformIndices(program, uniformNames.length, uniformNamesAddress, memAddress(uniformIndices));
            org.lwjgl.system.APIUtil.apiArrayFree(uniformNamesAddress, uniformNames.length);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glGetUniformIndices(GLuint program, GLsizei uniformCount, GLchar const * const * uniformNames, GLuint * uniformIndices)} */
    @NativeType("void")
    public static int glGetUniformIndices(@NativeType("GLuint") int program, @NativeType("GLchar const * const *") CharSequence uniformName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long uniformNamesAddress = org.lwjgl.system.APIUtil.apiArray(stack, MemoryUtil::memASCII, uniformName);
            IntBuffer uniformIndices = stack.callocInt(1);
            nglGetUniformIndices(program, 1, uniformNamesAddress, memAddress(uniformIndices));
            org.lwjgl.system.APIUtil.apiArrayFree(uniformNamesAddress, 1);
            return uniformIndices.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetActiveUniformsiv ] ---

    /** {@code void glGetActiveUniformsiv(GLuint program, GLsizei uniformCount, GLuint const * uniformIndices, GLenum pname, GLint * params)} */
    public static native void nglGetActiveUniformsiv(int program, int uniformCount, long uniformIndices, int pname, long params);

    /** {@code void glGetActiveUniformsiv(GLuint program, GLsizei uniformCount, GLuint const * uniformIndices, GLenum pname, GLint * params)} */
    public static void glGetActiveUniformsiv(@NativeType("GLuint") int program, @NativeType("GLuint const *") IntBuffer uniformIndices, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, uniformIndices.remaining());
        }
        nglGetActiveUniformsiv(program, uniformIndices.remaining(), memAddress(uniformIndices), pname, memAddress(params));
    }

    /** {@code void glGetActiveUniformsiv(GLuint program, GLsizei uniformCount, GLuint const * uniformIndices, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetActiveUniformsi(@NativeType("GLuint") int program, @NativeType("GLuint const *") int uniformIndex, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            IntBuffer uniformIndices = stack.ints(uniformIndex);
            nglGetActiveUniformsiv(program, 1, memAddress(uniformIndices), pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetActiveUniformName ] ---

    /** {@code void glGetActiveUniformName(GLuint program, GLuint uniformIndex, GLsizei bufSize, GLsizei * length, GLchar * uniformName)} */
    public static native void nglGetActiveUniformName(int program, int uniformIndex, int bufSize, long length, long uniformName);

    /** {@code void glGetActiveUniformName(GLuint program, GLuint uniformIndex, GLsizei bufSize, GLsizei * length, GLchar * uniformName)} */
    public static void glGetActiveUniformName(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformIndex, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLchar *") ByteBuffer uniformName) {
        if (CHECKS) {
            checkSafe(length, 1);
        }
        nglGetActiveUniformName(program, uniformIndex, uniformName.remaining(), memAddressSafe(length), memAddress(uniformName));
    }

    /** {@code void glGetActiveUniformName(GLuint program, GLuint uniformIndex, GLsizei bufSize, GLsizei * length, GLchar * uniformName)} */
    @NativeType("void")
    public static String glGetActiveUniformName(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformIndex, @NativeType("GLsizei") int bufSize) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer length = stack.ints(0);
            ByteBuffer uniformName = stack.malloc(bufSize);
            nglGetActiveUniformName(program, uniformIndex, bufSize, memAddress(length), memAddress(uniformName));
            return memASCII(uniformName, length.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glGetActiveUniformName(GLuint program, GLuint uniformIndex, GLsizei bufSize, GLsizei * length, GLchar * uniformName)} */
    @NativeType("void")
    public static String glGetActiveUniformName(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformIndex) {
        return glGetActiveUniformName(program, uniformIndex, glGetActiveUniformsi(program, uniformIndex, GL_UNIFORM_NAME_LENGTH));
    }

    // --- [ glGetUniformBlockIndex ] ---

    /** {@code GLuint glGetUniformBlockIndex(GLuint program, GLchar const * uniformBlockName)} */
    public static native int nglGetUniformBlockIndex(int program, long uniformBlockName);

    /** {@code GLuint glGetUniformBlockIndex(GLuint program, GLchar const * uniformBlockName)} */
    @NativeType("GLuint")
    public static int glGetUniformBlockIndex(@NativeType("GLuint") int program, @NativeType("GLchar const *") ByteBuffer uniformBlockName) {
        if (CHECKS) {
            checkNT1(uniformBlockName);
        }
        return nglGetUniformBlockIndex(program, memAddress(uniformBlockName));
    }

    /** {@code GLuint glGetUniformBlockIndex(GLuint program, GLchar const * uniformBlockName)} */
    @NativeType("GLuint")
    public static int glGetUniformBlockIndex(@NativeType("GLuint") int program, @NativeType("GLchar const *") CharSequence uniformBlockName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(uniformBlockName, true);
            long uniformBlockNameEncoded = stack.getPointerAddress();
            return nglGetUniformBlockIndex(program, uniformBlockNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetActiveUniformBlockiv ] ---

    /** {@code void glGetActiveUniformBlockiv(GLuint program, GLuint uniformBlockIndex, GLenum pname, GLint * params)} */
    public static native void nglGetActiveUniformBlockiv(int program, int uniformBlockIndex, int pname, long params);

    /** {@code void glGetActiveUniformBlockiv(GLuint program, GLuint uniformBlockIndex, GLenum pname, GLint * params)} */
    public static void glGetActiveUniformBlockiv(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformBlockIndex, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetActiveUniformBlockiv(program, uniformBlockIndex, pname, memAddress(params));
    }

    /** {@code void glGetActiveUniformBlockiv(GLuint program, GLuint uniformBlockIndex, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetActiveUniformBlocki(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformBlockIndex, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetActiveUniformBlockiv(program, uniformBlockIndex, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetActiveUniformBlockName ] ---

    /** {@code void glGetActiveUniformBlockName(GLuint program, GLuint uniformBlockIndex, GLsizei bufSize, GLsizei * length, GLchar * uniformBlockName)} */
    public static native void nglGetActiveUniformBlockName(int program, int uniformBlockIndex, int bufSize, long length, long uniformBlockName);

    /** {@code void glGetActiveUniformBlockName(GLuint program, GLuint uniformBlockIndex, GLsizei bufSize, GLsizei * length, GLchar * uniformBlockName)} */
    public static void glGetActiveUniformBlockName(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformBlockIndex, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLchar *") ByteBuffer uniformBlockName) {
        if (CHECKS) {
            checkSafe(length, 1);
        }
        nglGetActiveUniformBlockName(program, uniformBlockIndex, uniformBlockName.remaining(), memAddressSafe(length), memAddress(uniformBlockName));
    }

    /** {@code void glGetActiveUniformBlockName(GLuint program, GLuint uniformBlockIndex, GLsizei bufSize, GLsizei * length, GLchar * uniformBlockName)} */
    @NativeType("void")
    public static String glGetActiveUniformBlockName(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformBlockIndex, @NativeType("GLsizei") int bufSize) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer length = stack.ints(0);
            ByteBuffer uniformBlockName = stack.malloc(bufSize);
            nglGetActiveUniformBlockName(program, uniformBlockIndex, bufSize, memAddress(length), memAddress(uniformBlockName));
            return memASCII(uniformBlockName, length.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glGetActiveUniformBlockName(GLuint program, GLuint uniformBlockIndex, GLsizei bufSize, GLsizei * length, GLchar * uniformBlockName)} */
    @NativeType("void")
    public static String glGetActiveUniformBlockName(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformBlockIndex) {
        return glGetActiveUniformBlockName(program, uniformBlockIndex, glGetActiveUniformBlocki(program, uniformBlockIndex, GL_UNIFORM_BLOCK_NAME_LENGTH));
    }

    // --- [ glUniformBlockBinding ] ---

    /** {@code void glUniformBlockBinding(GLuint program, GLuint uniformBlockIndex, GLuint uniformBlockBinding)} */
    public static native void glUniformBlockBinding(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformBlockIndex, @NativeType("GLuint") int uniformBlockBinding);

    /** {@code void glGetUniformIndices(GLuint program, GLsizei uniformCount, GLchar const * const * uniformNames, GLuint * uniformIndices)} */
    public static void glGetUniformIndices(@NativeType("GLuint") int program, @NativeType("GLchar const * const *") PointerBuffer uniformNames, @NativeType("GLuint *") int[] uniformIndices) {
        long __functionAddress = GL.getICD().glGetUniformIndices;
        if (CHECKS) {
            check(__functionAddress);
            check(uniformIndices, uniformNames.remaining());
        }
        callPPV(program, uniformNames.remaining(), memAddress(uniformNames), uniformIndices, __functionAddress);
    }

    /** {@code void glGetActiveUniformsiv(GLuint program, GLsizei uniformCount, GLuint const * uniformIndices, GLenum pname, GLint * params)} */
    public static void glGetActiveUniformsiv(@NativeType("GLuint") int program, @NativeType("GLuint const *") int[] uniformIndices, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetActiveUniformsiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, uniformIndices.length);
        }
        callPPV(program, uniformIndices.length, uniformIndices, pname, params, __functionAddress);
    }

    /** {@code void glGetActiveUniformName(GLuint program, GLuint uniformIndex, GLsizei bufSize, GLsizei * length, GLchar * uniformName)} */
    public static void glGetActiveUniformName(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformIndex, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLchar *") ByteBuffer uniformName) {
        long __functionAddress = GL.getICD().glGetActiveUniformName;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(length, 1);
        }
        callPPV(program, uniformIndex, uniformName.remaining(), length, memAddress(uniformName), __functionAddress);
    }

    /** {@code void glGetActiveUniformBlockiv(GLuint program, GLuint uniformBlockIndex, GLenum pname, GLint * params)} */
    public static void glGetActiveUniformBlockiv(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformBlockIndex, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetActiveUniformBlockiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(program, uniformBlockIndex, pname, params, __functionAddress);
    }

    /** {@code void glGetActiveUniformBlockName(GLuint program, GLuint uniformBlockIndex, GLsizei bufSize, GLsizei * length, GLchar * uniformBlockName)} */
    public static void glGetActiveUniformBlockName(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformBlockIndex, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLchar *") ByteBuffer uniformBlockName) {
        long __functionAddress = GL.getICD().glGetActiveUniformBlockName;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(length, 1);
        }
        callPPV(program, uniformBlockIndex, uniformBlockName.remaining(), length, memAddress(uniformBlockName), __functionAddress);
    }

}
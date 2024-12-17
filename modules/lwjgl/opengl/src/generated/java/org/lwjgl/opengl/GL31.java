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

public class GL31 extends GL30 {

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

    protected GL31() {
        throw new UnsupportedOperationException();
    }

    // --- [ glDrawArraysInstanced ] ---

    /** {@code void glDrawArraysInstanced(GLenum mode, GLint first, GLsizei count, GLsizei primcount)} */
    public static void glDrawArraysInstanced(@NativeType("GLenum") int mode, @NativeType("GLint") int first, @NativeType("GLsizei") int count, @NativeType("GLsizei") int primcount) {
        GL31C.glDrawArraysInstanced(mode, first, count, primcount);
    }

    // --- [ glDrawElementsInstanced ] ---

    /** {@code void glDrawElementsInstanced(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount)} */
    public static void nglDrawElementsInstanced(int mode, int count, int type, long indices, int primcount) {
        GL31C.nglDrawElementsInstanced(mode, count, type, indices, primcount);
    }

    /** {@code void glDrawElementsInstanced(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount)} */
    public static void glDrawElementsInstanced(@NativeType("GLenum") int mode, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices, @NativeType("GLsizei") int primcount) {
        GL31C.glDrawElementsInstanced(mode, count, type, indices, primcount);
    }

    /** {@code void glDrawElementsInstanced(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount)} */
    public static void glDrawElementsInstanced(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int primcount) {
        GL31C.glDrawElementsInstanced(mode, type, indices, primcount);
    }

    /** {@code void glDrawElementsInstanced(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount)} */
    public static void glDrawElementsInstanced(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int primcount) {
        GL31C.glDrawElementsInstanced(mode, indices, primcount);
    }

    /** {@code void glDrawElementsInstanced(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount)} */
    public static void glDrawElementsInstanced(@NativeType("GLenum") int mode, @NativeType("void const *") ShortBuffer indices, @NativeType("GLsizei") int primcount) {
        GL31C.glDrawElementsInstanced(mode, indices, primcount);
    }

    /** {@code void glDrawElementsInstanced(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount)} */
    public static void glDrawElementsInstanced(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indices, @NativeType("GLsizei") int primcount) {
        GL31C.glDrawElementsInstanced(mode, indices, primcount);
    }

    // --- [ glCopyBufferSubData ] ---

    /** {@code void glCopyBufferSubData(GLenum readTarget, GLenum writeTarget, GLintptr readOffset, GLintptr writeOffset, GLsizeiptr size)} */
    public static void glCopyBufferSubData(@NativeType("GLenum") int readTarget, @NativeType("GLenum") int writeTarget, @NativeType("GLintptr") long readOffset, @NativeType("GLintptr") long writeOffset, @NativeType("GLsizeiptr") long size) {
        GL31C.glCopyBufferSubData(readTarget, writeTarget, readOffset, writeOffset, size);
    }

    // --- [ glPrimitiveRestartIndex ] ---

    /** {@code void glPrimitiveRestartIndex(GLuint index)} */
    public static void glPrimitiveRestartIndex(@NativeType("GLuint") int index) {
        GL31C.glPrimitiveRestartIndex(index);
    }

    // --- [ glTexBuffer ] ---

    /** {@code void glTexBuffer(GLenum target, GLenum internalformat, GLuint buffer)} */
    public static void glTexBuffer(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLuint") int buffer) {
        GL31C.glTexBuffer(target, internalformat, buffer);
    }

    // --- [ glGetUniformIndices ] ---

    /** {@code void glGetUniformIndices(GLuint program, GLsizei uniformCount, GLchar const * const * uniformNames, GLuint * uniformIndices)} */
    public static void nglGetUniformIndices(int program, int uniformCount, long uniformNames, long uniformIndices) {
        GL31C.nglGetUniformIndices(program, uniformCount, uniformNames, uniformIndices);
    }

    /** {@code void glGetUniformIndices(GLuint program, GLsizei uniformCount, GLchar const * const * uniformNames, GLuint * uniformIndices)} */
    public static void glGetUniformIndices(@NativeType("GLuint") int program, @NativeType("GLchar const * const *") PointerBuffer uniformNames, @NativeType("GLuint *") IntBuffer uniformIndices) {
        GL31C.glGetUniformIndices(program, uniformNames, uniformIndices);
    }

    /** {@code void glGetUniformIndices(GLuint program, GLsizei uniformCount, GLchar const * const * uniformNames, GLuint * uniformIndices)} */
    public static void glGetUniformIndices(@NativeType("GLuint") int program, @NativeType("GLchar const * const *") CharSequence[] uniformNames, @NativeType("GLuint *") IntBuffer uniformIndices) {
        GL31C.glGetUniformIndices(program, uniformNames, uniformIndices);
    }

    /** {@code void glGetUniformIndices(GLuint program, GLsizei uniformCount, GLchar const * const * uniformNames, GLuint * uniformIndices)} */
    @NativeType("void")
    public static int glGetUniformIndices(@NativeType("GLuint") int program, @NativeType("GLchar const * const *") CharSequence uniformName) {
        return GL31C.glGetUniformIndices(program, uniformName);
    }

    // --- [ glGetActiveUniformsiv ] ---

    /** {@code void glGetActiveUniformsiv(GLuint program, GLsizei uniformCount, GLuint const * uniformIndices, GLenum pname, GLint * params)} */
    public static void nglGetActiveUniformsiv(int program, int uniformCount, long uniformIndices, int pname, long params) {
        GL31C.nglGetActiveUniformsiv(program, uniformCount, uniformIndices, pname, params);
    }

    /** {@code void glGetActiveUniformsiv(GLuint program, GLsizei uniformCount, GLuint const * uniformIndices, GLenum pname, GLint * params)} */
    public static void glGetActiveUniformsiv(@NativeType("GLuint") int program, @NativeType("GLuint const *") IntBuffer uniformIndices, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        GL31C.glGetActiveUniformsiv(program, uniformIndices, pname, params);
    }

    /** {@code void glGetActiveUniformsiv(GLuint program, GLsizei uniformCount, GLuint const * uniformIndices, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetActiveUniformsi(@NativeType("GLuint") int program, @NativeType("GLuint const *") int uniformIndex, @NativeType("GLenum") int pname) {
        return GL31C.glGetActiveUniformsi(program, uniformIndex, pname);
    }

    // --- [ glGetActiveUniformName ] ---

    /** {@code void glGetActiveUniformName(GLuint program, GLuint uniformIndex, GLsizei bufSize, GLsizei * length, GLchar * uniformName)} */
    public static void nglGetActiveUniformName(int program, int uniformIndex, int bufSize, long length, long uniformName) {
        GL31C.nglGetActiveUniformName(program, uniformIndex, bufSize, length, uniformName);
    }

    /** {@code void glGetActiveUniformName(GLuint program, GLuint uniformIndex, GLsizei bufSize, GLsizei * length, GLchar * uniformName)} */
    public static void glGetActiveUniformName(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformIndex, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLchar *") ByteBuffer uniformName) {
        GL31C.glGetActiveUniformName(program, uniformIndex, length, uniformName);
    }

    /** {@code void glGetActiveUniformName(GLuint program, GLuint uniformIndex, GLsizei bufSize, GLsizei * length, GLchar * uniformName)} */
    @NativeType("void")
    public static String glGetActiveUniformName(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformIndex, @NativeType("GLsizei") int bufSize) {
        return GL31C.glGetActiveUniformName(program, uniformIndex, bufSize);
    }

    /** {@code void glGetActiveUniformName(GLuint program, GLuint uniformIndex, GLsizei bufSize, GLsizei * length, GLchar * uniformName)} */
    @NativeType("void")
    public static String glGetActiveUniformName(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformIndex) {
        return glGetActiveUniformName(program, uniformIndex, glGetActiveUniformsi(program, uniformIndex, GL_UNIFORM_NAME_LENGTH));
    }

    // --- [ glGetUniformBlockIndex ] ---

    /** {@code GLuint glGetUniformBlockIndex(GLuint program, GLchar const * uniformBlockName)} */
    public static int nglGetUniformBlockIndex(int program, long uniformBlockName) {
        return GL31C.nglGetUniformBlockIndex(program, uniformBlockName);
    }

    /** {@code GLuint glGetUniformBlockIndex(GLuint program, GLchar const * uniformBlockName)} */
    @NativeType("GLuint")
    public static int glGetUniformBlockIndex(@NativeType("GLuint") int program, @NativeType("GLchar const *") ByteBuffer uniformBlockName) {
        return GL31C.glGetUniformBlockIndex(program, uniformBlockName);
    }

    /** {@code GLuint glGetUniformBlockIndex(GLuint program, GLchar const * uniformBlockName)} */
    @NativeType("GLuint")
    public static int glGetUniformBlockIndex(@NativeType("GLuint") int program, @NativeType("GLchar const *") CharSequence uniformBlockName) {
        return GL31C.glGetUniformBlockIndex(program, uniformBlockName);
    }

    // --- [ glGetActiveUniformBlockiv ] ---

    /** {@code void glGetActiveUniformBlockiv(GLuint program, GLuint uniformBlockIndex, GLenum pname, GLint * params)} */
    public static void nglGetActiveUniformBlockiv(int program, int uniformBlockIndex, int pname, long params) {
        GL31C.nglGetActiveUniformBlockiv(program, uniformBlockIndex, pname, params);
    }

    /** {@code void glGetActiveUniformBlockiv(GLuint program, GLuint uniformBlockIndex, GLenum pname, GLint * params)} */
    public static void glGetActiveUniformBlockiv(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformBlockIndex, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        GL31C.glGetActiveUniformBlockiv(program, uniformBlockIndex, pname, params);
    }

    /** {@code void glGetActiveUniformBlockiv(GLuint program, GLuint uniformBlockIndex, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetActiveUniformBlocki(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformBlockIndex, @NativeType("GLenum") int pname) {
        return GL31C.glGetActiveUniformBlocki(program, uniformBlockIndex, pname);
    }

    // --- [ glGetActiveUniformBlockName ] ---

    /** {@code void glGetActiveUniformBlockName(GLuint program, GLuint uniformBlockIndex, GLsizei bufSize, GLsizei * length, GLchar * uniformBlockName)} */
    public static void nglGetActiveUniformBlockName(int program, int uniformBlockIndex, int bufSize, long length, long uniformBlockName) {
        GL31C.nglGetActiveUniformBlockName(program, uniformBlockIndex, bufSize, length, uniformBlockName);
    }

    /** {@code void glGetActiveUniformBlockName(GLuint program, GLuint uniformBlockIndex, GLsizei bufSize, GLsizei * length, GLchar * uniformBlockName)} */
    public static void glGetActiveUniformBlockName(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformBlockIndex, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLchar *") ByteBuffer uniformBlockName) {
        GL31C.glGetActiveUniformBlockName(program, uniformBlockIndex, length, uniformBlockName);
    }

    /** {@code void glGetActiveUniformBlockName(GLuint program, GLuint uniformBlockIndex, GLsizei bufSize, GLsizei * length, GLchar * uniformBlockName)} */
    @NativeType("void")
    public static String glGetActiveUniformBlockName(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformBlockIndex, @NativeType("GLsizei") int bufSize) {
        return GL31C.glGetActiveUniformBlockName(program, uniformBlockIndex, bufSize);
    }

    /** {@code void glGetActiveUniformBlockName(GLuint program, GLuint uniformBlockIndex, GLsizei bufSize, GLsizei * length, GLchar * uniformBlockName)} */
    @NativeType("void")
    public static String glGetActiveUniformBlockName(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformBlockIndex) {
        return glGetActiveUniformBlockName(program, uniformBlockIndex, glGetActiveUniformBlocki(program, uniformBlockIndex, GL_UNIFORM_BLOCK_NAME_LENGTH));
    }

    // --- [ glUniformBlockBinding ] ---

    /** {@code void glUniformBlockBinding(GLuint program, GLuint uniformBlockIndex, GLuint uniformBlockBinding)} */
    public static void glUniformBlockBinding(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformBlockIndex, @NativeType("GLuint") int uniformBlockBinding) {
        GL31C.glUniformBlockBinding(program, uniformBlockIndex, uniformBlockBinding);
    }

    /** {@code void glGetUniformIndices(GLuint program, GLsizei uniformCount, GLchar const * const * uniformNames, GLuint * uniformIndices)} */
    public static void glGetUniformIndices(@NativeType("GLuint") int program, @NativeType("GLchar const * const *") PointerBuffer uniformNames, @NativeType("GLuint *") int[] uniformIndices) {
        GL31C.glGetUniformIndices(program, uniformNames, uniformIndices);
    }

    /** {@code void glGetActiveUniformsiv(GLuint program, GLsizei uniformCount, GLuint const * uniformIndices, GLenum pname, GLint * params)} */
    public static void glGetActiveUniformsiv(@NativeType("GLuint") int program, @NativeType("GLuint const *") int[] uniformIndices, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        GL31C.glGetActiveUniformsiv(program, uniformIndices, pname, params);
    }

    /** {@code void glGetActiveUniformName(GLuint program, GLuint uniformIndex, GLsizei bufSize, GLsizei * length, GLchar * uniformName)} */
    public static void glGetActiveUniformName(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformIndex, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLchar *") ByteBuffer uniformName) {
        GL31C.glGetActiveUniformName(program, uniformIndex, length, uniformName);
    }

    /** {@code void glGetActiveUniformBlockiv(GLuint program, GLuint uniformBlockIndex, GLenum pname, GLint * params)} */
    public static void glGetActiveUniformBlockiv(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformBlockIndex, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        GL31C.glGetActiveUniformBlockiv(program, uniformBlockIndex, pname, params);
    }

    /** {@code void glGetActiveUniformBlockName(GLuint program, GLuint uniformBlockIndex, GLsizei bufSize, GLsizei * length, GLchar * uniformBlockName)} */
    public static void glGetActiveUniformBlockName(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformBlockIndex, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLchar *") ByteBuffer uniformBlockName) {
        GL31C.glGetActiveUniformBlockName(program, uniformBlockIndex, length, uniformBlockName);
    }

}
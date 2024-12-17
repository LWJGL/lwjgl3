/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

public class GL46 extends GL45 {

    static { GL.initialize(); }

    public static final int GL_PARAMETER_BUFFER = 0x80EE;

    public static final int GL_PARAMETER_BUFFER_BINDING = 0x80EF;

    public static final int
        GL_VERTICES_SUBMITTED                 = 0x82EE,
        GL_PRIMITIVES_SUBMITTED               = 0x82EF,
        GL_VERTEX_SHADER_INVOCATIONS          = 0x82F0,
        GL_TESS_CONTROL_SHADER_PATCHES        = 0x82F1,
        GL_TESS_EVALUATION_SHADER_INVOCATIONS = 0x82F2,
        GL_GEOMETRY_SHADER_PRIMITIVES_EMITTED = 0x82F3,
        GL_FRAGMENT_SHADER_INVOCATIONS        = 0x82F4,
        GL_COMPUTE_SHADER_INVOCATIONS         = 0x82F5,
        GL_CLIPPING_INPUT_PRIMITIVES          = 0x82F6,
        GL_CLIPPING_OUTPUT_PRIMITIVES         = 0x82F7;

    public static final int GL_POLYGON_OFFSET_CLAMP = 0x8E1B;

    public static final int GL_CONTEXT_FLAG_NO_ERROR_BIT = 0x8;

    public static final int GL_SHADER_BINARY_FORMAT_SPIR_V = 0x9551;

    public static final int GL_SPIR_V_BINARY = 0x9552;

    public static final int GL_SPIR_V_EXTENSIONS = 0x9553;

    public static final int GL_NUM_SPIR_V_EXTENSIONS = 0x9554;

    public static final int GL_TEXTURE_MAX_ANISOTROPY = 0x84FE;

    public static final int GL_MAX_TEXTURE_MAX_ANISOTROPY = 0x84FF;

    public static final int
        GL_TRANSFORM_FEEDBACK_OVERFLOW        = 0x82EC,
        GL_TRANSFORM_FEEDBACK_STREAM_OVERFLOW = 0x82ED;

    protected GL46() {
        throw new UnsupportedOperationException();
    }

    // --- [ glMultiDrawArraysIndirectCount ] ---

    /** {@code void glMultiDrawArraysIndirectCount(GLenum mode, void const * indirect, GLintptr drawcount, GLsizei maxdrawcount, GLsizei stride)} */
    public static void nglMultiDrawArraysIndirectCount(int mode, long indirect, long drawcount, int maxdrawcount, int stride) {
        GL46C.nglMultiDrawArraysIndirectCount(mode, indirect, drawcount, maxdrawcount, stride);
    }

    /** {@code void glMultiDrawArraysIndirectCount(GLenum mode, void const * indirect, GLintptr drawcount, GLsizei maxdrawcount, GLsizei stride)} */
    public static void glMultiDrawArraysIndirectCount(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indirect, @NativeType("GLintptr") long drawcount, @NativeType("GLsizei") int maxdrawcount, @NativeType("GLsizei") int stride) {
        GL46C.glMultiDrawArraysIndirectCount(mode, indirect, drawcount, maxdrawcount, stride);
    }

    /** {@code void glMultiDrawArraysIndirectCount(GLenum mode, void const * indirect, GLintptr drawcount, GLsizei maxdrawcount, GLsizei stride)} */
    public static void glMultiDrawArraysIndirectCount(@NativeType("GLenum") int mode, @NativeType("void const *") long indirect, @NativeType("GLintptr") long drawcount, @NativeType("GLsizei") int maxdrawcount, @NativeType("GLsizei") int stride) {
        GL46C.glMultiDrawArraysIndirectCount(mode, indirect, drawcount, maxdrawcount, stride);
    }

    /** {@code void glMultiDrawArraysIndirectCount(GLenum mode, void const * indirect, GLintptr drawcount, GLsizei maxdrawcount, GLsizei stride)} */
    public static void glMultiDrawArraysIndirectCount(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indirect, @NativeType("GLintptr") long drawcount, @NativeType("GLsizei") int maxdrawcount, @NativeType("GLsizei") int stride) {
        GL46C.glMultiDrawArraysIndirectCount(mode, indirect, drawcount, maxdrawcount, stride);
    }

    // --- [ glMultiDrawElementsIndirectCount ] ---

    /** {@code void glMultiDrawElementsIndirectCount(GLenum mode, GLenum type, void const * indirect, GLintptr drawcount, GLsizei maxdrawcount, GLsizei stride)} */
    public static void nglMultiDrawElementsIndirectCount(int mode, int type, long indirect, long drawcount, int maxdrawcount, int stride) {
        GL46C.nglMultiDrawElementsIndirectCount(mode, type, indirect, drawcount, maxdrawcount, stride);
    }

    /** {@code void glMultiDrawElementsIndirectCount(GLenum mode, GLenum type, void const * indirect, GLintptr drawcount, GLsizei maxdrawcount, GLsizei stride)} */
    public static void glMultiDrawElementsIndirectCount(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indirect, @NativeType("GLintptr") long drawcount, @NativeType("GLsizei") int maxdrawcount, @NativeType("GLsizei") int stride) {
        GL46C.glMultiDrawElementsIndirectCount(mode, type, indirect, drawcount, maxdrawcount, stride);
    }

    /** {@code void glMultiDrawElementsIndirectCount(GLenum mode, GLenum type, void const * indirect, GLintptr drawcount, GLsizei maxdrawcount, GLsizei stride)} */
    public static void glMultiDrawElementsIndirectCount(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") long indirect, @NativeType("GLintptr") long drawcount, @NativeType("GLsizei") int maxdrawcount, @NativeType("GLsizei") int stride) {
        GL46C.glMultiDrawElementsIndirectCount(mode, type, indirect, drawcount, maxdrawcount, stride);
    }

    /** {@code void glMultiDrawElementsIndirectCount(GLenum mode, GLenum type, void const * indirect, GLintptr drawcount, GLsizei maxdrawcount, GLsizei stride)} */
    public static void glMultiDrawElementsIndirectCount(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer indirect, @NativeType("GLintptr") long drawcount, @NativeType("GLsizei") int maxdrawcount, @NativeType("GLsizei") int stride) {
        GL46C.glMultiDrawElementsIndirectCount(mode, type, indirect, drawcount, maxdrawcount, stride);
    }

    // --- [ glPolygonOffsetClamp ] ---

    /** {@code void glPolygonOffsetClamp(GLfloat factor, GLfloat units, GLfloat clamp)} */
    public static void glPolygonOffsetClamp(@NativeType("GLfloat") float factor, @NativeType("GLfloat") float units, @NativeType("GLfloat") float clamp) {
        GL46C.glPolygonOffsetClamp(factor, units, clamp);
    }

    // --- [ glSpecializeShader ] ---

    /** {@code void glSpecializeShader(GLuint shader, GLchar const * pEntryPoint, GLuint numSpecializationConstants, GLuint const * pConstantIndex, GLuint const * pConstantValue)} */
    public static void nglSpecializeShader(int shader, long pEntryPoint, int numSpecializationConstants, long pConstantIndex, long pConstantValue) {
        GL46C.nglSpecializeShader(shader, pEntryPoint, numSpecializationConstants, pConstantIndex, pConstantValue);
    }

    /** {@code void glSpecializeShader(GLuint shader, GLchar const * pEntryPoint, GLuint numSpecializationConstants, GLuint const * pConstantIndex, GLuint const * pConstantValue)} */
    public static void glSpecializeShader(@NativeType("GLuint") int shader, @NativeType("GLchar const *") ByteBuffer pEntryPoint, @NativeType("GLuint const *") @Nullable IntBuffer pConstantIndex, @NativeType("GLuint const *") @Nullable IntBuffer pConstantValue) {
        GL46C.glSpecializeShader(shader, pEntryPoint, pConstantIndex, pConstantValue);
    }

    /** {@code void glSpecializeShader(GLuint shader, GLchar const * pEntryPoint, GLuint numSpecializationConstants, GLuint const * pConstantIndex, GLuint const * pConstantValue)} */
    public static void glSpecializeShader(@NativeType("GLuint") int shader, @NativeType("GLchar const *") CharSequence pEntryPoint, @NativeType("GLuint const *") @Nullable IntBuffer pConstantIndex, @NativeType("GLuint const *") @Nullable IntBuffer pConstantValue) {
        GL46C.glSpecializeShader(shader, pEntryPoint, pConstantIndex, pConstantValue);
    }

    /** {@code void glMultiDrawArraysIndirectCount(GLenum mode, void const * indirect, GLintptr drawcount, GLsizei maxdrawcount, GLsizei stride)} */
    public static void glMultiDrawArraysIndirectCount(@NativeType("GLenum") int mode, @NativeType("void const *") int[] indirect, @NativeType("GLintptr") long drawcount, @NativeType("GLsizei") int maxdrawcount, @NativeType("GLsizei") int stride) {
        GL46C.glMultiDrawArraysIndirectCount(mode, indirect, drawcount, maxdrawcount, stride);
    }

    /** {@code void glMultiDrawElementsIndirectCount(GLenum mode, GLenum type, void const * indirect, GLintptr drawcount, GLsizei maxdrawcount, GLsizei stride)} */
    public static void glMultiDrawElementsIndirectCount(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") int[] indirect, @NativeType("GLintptr") long drawcount, @NativeType("GLsizei") int maxdrawcount, @NativeType("GLsizei") int stride) {
        GL46C.glMultiDrawElementsIndirectCount(mode, type, indirect, drawcount, maxdrawcount, stride);
    }

    /** {@code void glSpecializeShader(GLuint shader, GLchar const * pEntryPoint, GLuint numSpecializationConstants, GLuint const * pConstantIndex, GLuint const * pConstantValue)} */
    public static void glSpecializeShader(@NativeType("GLuint") int shader, @NativeType("GLchar const *") ByteBuffer pEntryPoint, @NativeType("GLuint const *") int @Nullable [] pConstantIndex, @NativeType("GLuint const *") int @Nullable [] pConstantValue) {
        GL46C.glSpecializeShader(shader, pEntryPoint, pConstantIndex, pConstantValue);
    }

    /** {@code void glSpecializeShader(GLuint shader, GLchar const * pEntryPoint, GLuint numSpecializationConstants, GLuint const * pConstantIndex, GLuint const * pConstantValue)} */
    public static void glSpecializeShader(@NativeType("GLuint") int shader, @NativeType("GLchar const *") CharSequence pEntryPoint, @NativeType("GLuint const *") int @Nullable [] pConstantIndex, @NativeType("GLuint const *") int @Nullable [] pConstantValue) {
        GL46C.glSpecializeShader(shader, pEntryPoint, pConstantIndex, pConstantValue);
    }

}
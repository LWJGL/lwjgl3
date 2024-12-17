/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class GL46C extends GL45C {

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

    protected GL46C() {
        throw new UnsupportedOperationException();
    }

    // --- [ glMultiDrawArraysIndirectCount ] ---

    /** {@code void glMultiDrawArraysIndirectCount(GLenum mode, void const * indirect, GLintptr drawcount, GLsizei maxdrawcount, GLsizei stride)} */
    public static native void nglMultiDrawArraysIndirectCount(int mode, long indirect, long drawcount, int maxdrawcount, int stride);

    /** {@code void glMultiDrawArraysIndirectCount(GLenum mode, void const * indirect, GLintptr drawcount, GLsizei maxdrawcount, GLsizei stride)} */
    public static void glMultiDrawArraysIndirectCount(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indirect, @NativeType("GLintptr") long drawcount, @NativeType("GLsizei") int maxdrawcount, @NativeType("GLsizei") int stride) {
        if (CHECKS) {
            check(indirect, maxdrawcount * (stride == 0 ? (4 * 4) : stride));
        }
        nglMultiDrawArraysIndirectCount(mode, memAddress(indirect), drawcount, maxdrawcount, stride);
    }

    /** {@code void glMultiDrawArraysIndirectCount(GLenum mode, void const * indirect, GLintptr drawcount, GLsizei maxdrawcount, GLsizei stride)} */
    public static void glMultiDrawArraysIndirectCount(@NativeType("GLenum") int mode, @NativeType("void const *") long indirect, @NativeType("GLintptr") long drawcount, @NativeType("GLsizei") int maxdrawcount, @NativeType("GLsizei") int stride) {
        nglMultiDrawArraysIndirectCount(mode, indirect, drawcount, maxdrawcount, stride);
    }

    /** {@code void glMultiDrawArraysIndirectCount(GLenum mode, void const * indirect, GLintptr drawcount, GLsizei maxdrawcount, GLsizei stride)} */
    public static void glMultiDrawArraysIndirectCount(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indirect, @NativeType("GLintptr") long drawcount, @NativeType("GLsizei") int maxdrawcount, @NativeType("GLsizei") int stride) {
        if (CHECKS) {
            check(indirect, (maxdrawcount * (stride == 0 ? (4 * 4) : stride)) >> 2);
        }
        nglMultiDrawArraysIndirectCount(mode, memAddress(indirect), drawcount, maxdrawcount, stride);
    }

    // --- [ glMultiDrawElementsIndirectCount ] ---

    /** {@code void glMultiDrawElementsIndirectCount(GLenum mode, GLenum type, void const * indirect, GLintptr drawcount, GLsizei maxdrawcount, GLsizei stride)} */
    public static native void nglMultiDrawElementsIndirectCount(int mode, int type, long indirect, long drawcount, int maxdrawcount, int stride);

    /** {@code void glMultiDrawElementsIndirectCount(GLenum mode, GLenum type, void const * indirect, GLintptr drawcount, GLsizei maxdrawcount, GLsizei stride)} */
    public static void glMultiDrawElementsIndirectCount(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indirect, @NativeType("GLintptr") long drawcount, @NativeType("GLsizei") int maxdrawcount, @NativeType("GLsizei") int stride) {
        if (CHECKS) {
            check(indirect, maxdrawcount * (stride == 0 ? (5 * 4) : stride));
        }
        nglMultiDrawElementsIndirectCount(mode, type, memAddress(indirect), drawcount, maxdrawcount, stride);
    }

    /** {@code void glMultiDrawElementsIndirectCount(GLenum mode, GLenum type, void const * indirect, GLintptr drawcount, GLsizei maxdrawcount, GLsizei stride)} */
    public static void glMultiDrawElementsIndirectCount(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") long indirect, @NativeType("GLintptr") long drawcount, @NativeType("GLsizei") int maxdrawcount, @NativeType("GLsizei") int stride) {
        nglMultiDrawElementsIndirectCount(mode, type, indirect, drawcount, maxdrawcount, stride);
    }

    /** {@code void glMultiDrawElementsIndirectCount(GLenum mode, GLenum type, void const * indirect, GLintptr drawcount, GLsizei maxdrawcount, GLsizei stride)} */
    public static void glMultiDrawElementsIndirectCount(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer indirect, @NativeType("GLintptr") long drawcount, @NativeType("GLsizei") int maxdrawcount, @NativeType("GLsizei") int stride) {
        if (CHECKS) {
            check(indirect, (maxdrawcount * (stride == 0 ? (5 * 4) : stride)) >> 2);
        }
        nglMultiDrawElementsIndirectCount(mode, type, memAddress(indirect), drawcount, maxdrawcount, stride);
    }

    // --- [ glPolygonOffsetClamp ] ---

    /** {@code void glPolygonOffsetClamp(GLfloat factor, GLfloat units, GLfloat clamp)} */
    public static native void glPolygonOffsetClamp(@NativeType("GLfloat") float factor, @NativeType("GLfloat") float units, @NativeType("GLfloat") float clamp);

    // --- [ glSpecializeShader ] ---

    /** {@code void glSpecializeShader(GLuint shader, GLchar const * pEntryPoint, GLuint numSpecializationConstants, GLuint const * pConstantIndex, GLuint const * pConstantValue)} */
    public static native void nglSpecializeShader(int shader, long pEntryPoint, int numSpecializationConstants, long pConstantIndex, long pConstantValue);

    /** {@code void glSpecializeShader(GLuint shader, GLchar const * pEntryPoint, GLuint numSpecializationConstants, GLuint const * pConstantIndex, GLuint const * pConstantValue)} */
    public static void glSpecializeShader(@NativeType("GLuint") int shader, @NativeType("GLchar const *") ByteBuffer pEntryPoint, @NativeType("GLuint const *") @Nullable IntBuffer pConstantIndex, @NativeType("GLuint const *") @Nullable IntBuffer pConstantValue) {
        if (CHECKS) {
            checkNT1(pEntryPoint);
            checkSafe(pConstantValue, remainingSafe(pConstantIndex));
        }
        nglSpecializeShader(shader, memAddress(pEntryPoint), remainingSafe(pConstantIndex), memAddressSafe(pConstantIndex), memAddressSafe(pConstantValue));
    }

    /** {@code void glSpecializeShader(GLuint shader, GLchar const * pEntryPoint, GLuint numSpecializationConstants, GLuint const * pConstantIndex, GLuint const * pConstantValue)} */
    public static void glSpecializeShader(@NativeType("GLuint") int shader, @NativeType("GLchar const *") CharSequence pEntryPoint, @NativeType("GLuint const *") @Nullable IntBuffer pConstantIndex, @NativeType("GLuint const *") @Nullable IntBuffer pConstantValue) {
        if (CHECKS) {
            checkSafe(pConstantValue, remainingSafe(pConstantIndex));
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(pEntryPoint, true);
            long pEntryPointEncoded = stack.getPointerAddress();
            nglSpecializeShader(shader, pEntryPointEncoded, remainingSafe(pConstantIndex), memAddressSafe(pConstantIndex), memAddressSafe(pConstantValue));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glMultiDrawArraysIndirectCount(GLenum mode, void const * indirect, GLintptr drawcount, GLsizei maxdrawcount, GLsizei stride)} */
    public static void glMultiDrawArraysIndirectCount(@NativeType("GLenum") int mode, @NativeType("void const *") int[] indirect, @NativeType("GLintptr") long drawcount, @NativeType("GLsizei") int maxdrawcount, @NativeType("GLsizei") int stride) {
        long __functionAddress = GL.getICD().glMultiDrawArraysIndirectCount;
        if (CHECKS) {
            check(__functionAddress);
            check(indirect, (maxdrawcount * (stride == 0 ? (4 * 4) : stride)) >> 2);
        }
        callPPV(mode, indirect, drawcount, maxdrawcount, stride, __functionAddress);
    }

    /** {@code void glMultiDrawElementsIndirectCount(GLenum mode, GLenum type, void const * indirect, GLintptr drawcount, GLsizei maxdrawcount, GLsizei stride)} */
    public static void glMultiDrawElementsIndirectCount(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") int[] indirect, @NativeType("GLintptr") long drawcount, @NativeType("GLsizei") int maxdrawcount, @NativeType("GLsizei") int stride) {
        long __functionAddress = GL.getICD().glMultiDrawElementsIndirectCount;
        if (CHECKS) {
            check(__functionAddress);
            check(indirect, (maxdrawcount * (stride == 0 ? (5 * 4) : stride)) >> 2);
        }
        callPPV(mode, type, indirect, drawcount, maxdrawcount, stride, __functionAddress);
    }

    /** {@code void glSpecializeShader(GLuint shader, GLchar const * pEntryPoint, GLuint numSpecializationConstants, GLuint const * pConstantIndex, GLuint const * pConstantValue)} */
    public static void glSpecializeShader(@NativeType("GLuint") int shader, @NativeType("GLchar const *") ByteBuffer pEntryPoint, @NativeType("GLuint const *") int @Nullable [] pConstantIndex, @NativeType("GLuint const *") int @Nullable [] pConstantValue) {
        long __functionAddress = GL.getICD().glSpecializeShader;
        if (CHECKS) {
            check(__functionAddress);
            checkNT1(pEntryPoint);
            checkSafe(pConstantValue, lengthSafe(pConstantIndex));
        }
        callPPPV(shader, memAddress(pEntryPoint), lengthSafe(pConstantIndex), pConstantIndex, pConstantValue, __functionAddress);
    }

    /** {@code void glSpecializeShader(GLuint shader, GLchar const * pEntryPoint, GLuint numSpecializationConstants, GLuint const * pConstantIndex, GLuint const * pConstantValue)} */
    public static void glSpecializeShader(@NativeType("GLuint") int shader, @NativeType("GLchar const *") CharSequence pEntryPoint, @NativeType("GLuint const *") int @Nullable [] pConstantIndex, @NativeType("GLuint const *") int @Nullable [] pConstantValue) {
        long __functionAddress = GL.getICD().glSpecializeShader;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(pConstantValue, lengthSafe(pConstantIndex));
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(pEntryPoint, true);
            long pEntryPointEncoded = stack.getPointerAddress();
            callPPPV(shader, pEntryPointEncoded, lengthSafe(pConstantIndex), pConstantIndex, pConstantValue, __functionAddress);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

}
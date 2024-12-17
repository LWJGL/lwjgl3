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

public class EXTTransformFeedback {

    static { GL.initialize(); }

    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_EXT = 0x8C8E;

    public static final int
        GL_TRANSFORM_FEEDBACK_BUFFER_START_EXT = 0x8C84,
        GL_TRANSFORM_FEEDBACK_BUFFER_SIZE_EXT  = 0x8C85;

    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_BINDING_EXT = 0x8C8F;

    public static final int
        GL_INTERLEAVED_ATTRIBS_EXT = 0x8C8C,
        GL_SEPARATE_ATTRIBS_EXT    = 0x8C8D;

    public static final int
        GL_PRIMITIVES_GENERATED_EXT                  = 0x8C87,
        GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN_EXT = 0x8C88;

    public static final int GL_RASTERIZER_DISCARD_EXT = 0x8C89;

    public static final int
        GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS_EXT = 0x8C8A,
        GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS_EXT       = 0x8C8B,
        GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS_EXT    = 0x8C80;

    public static final int
        GL_TRANSFORM_FEEDBACK_VARYINGS_EXT           = 0x8C83,
        GL_TRANSFORM_FEEDBACK_BUFFER_MODE_EXT        = 0x8C7F,
        GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH_EXT = 0x8C76;

    protected EXTTransformFeedback() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBindBufferRangeEXT ] ---

    /** {@code void glBindBufferRangeEXT(GLenum target, GLuint index, GLuint buffer, GLintptr offset, GLsizeiptr size)} */
    public static native void glBindBufferRangeEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size);

    // --- [ glBindBufferOffsetEXT ] ---

    /** {@code void glBindBufferOffsetEXT(GLenum target, GLuint index, GLuint buffer, GLintptr offset)} */
    public static native void glBindBufferOffsetEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset);

    // --- [ glBindBufferBaseEXT ] ---

    /** {@code void glBindBufferBaseEXT(GLenum target, GLuint index, GLuint buffer)} */
    public static native void glBindBufferBaseEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLuint") int buffer);

    // --- [ glBeginTransformFeedbackEXT ] ---

    /** {@code void glBeginTransformFeedbackEXT(GLenum primitiveMode)} */
    public static native void glBeginTransformFeedbackEXT(@NativeType("GLenum") int primitiveMode);

    // --- [ glEndTransformFeedbackEXT ] ---

    /** {@code void glEndTransformFeedbackEXT(void)} */
    public static native void glEndTransformFeedbackEXT();

    // --- [ glTransformFeedbackVaryingsEXT ] ---

    /** {@code void glTransformFeedbackVaryingsEXT(GLuint program, GLsizei count, GLchar const * const * varyings, GLenum bufferMode)} */
    public static native void nglTransformFeedbackVaryingsEXT(int program, int count, long varyings, int bufferMode);

    /** {@code void glTransformFeedbackVaryingsEXT(GLuint program, GLsizei count, GLchar const * const * varyings, GLenum bufferMode)} */
    public static void glTransformFeedbackVaryingsEXT(@NativeType("GLuint") int program, @NativeType("GLchar const * const *") PointerBuffer varyings, @NativeType("GLenum") int bufferMode) {
        nglTransformFeedbackVaryingsEXT(program, varyings.remaining(), memAddress(varyings), bufferMode);
    }

    /** {@code void glTransformFeedbackVaryingsEXT(GLuint program, GLsizei count, GLchar const * const * varyings, GLenum bufferMode)} */
    public static void glTransformFeedbackVaryingsEXT(@NativeType("GLuint") int program, @NativeType("GLchar const * const *") CharSequence[] varyings, @NativeType("GLenum") int bufferMode) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long varyingsAddress = org.lwjgl.system.APIUtil.apiArray(stack, MemoryUtil::memASCII, varyings);
            nglTransformFeedbackVaryingsEXT(program, varyings.length, varyingsAddress, bufferMode);
            org.lwjgl.system.APIUtil.apiArrayFree(varyingsAddress, varyings.length);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glTransformFeedbackVaryingsEXT(GLuint program, GLsizei count, GLchar const * const * varyings, GLenum bufferMode)} */
    public static void glTransformFeedbackVaryingsEXT(@NativeType("GLuint") int program, @NativeType("GLchar const * const *") CharSequence varying, @NativeType("GLenum") int bufferMode) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long varyingsAddress = org.lwjgl.system.APIUtil.apiArray(stack, MemoryUtil::memASCII, varying);
            nglTransformFeedbackVaryingsEXT(program, 1, varyingsAddress, bufferMode);
            org.lwjgl.system.APIUtil.apiArrayFree(varyingsAddress, 1);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetTransformFeedbackVaryingEXT ] ---

    /** {@code void glGetTransformFeedbackVaryingEXT(GLuint program, GLuint index, GLsizei bufSize, GLsizei * length, GLsizei * size, GLenum * type, GLchar * name)} */
    public static native void nglGetTransformFeedbackVaryingEXT(int program, int index, int bufSize, long length, long size, long type, long name);

    /** {@code void glGetTransformFeedbackVaryingEXT(GLuint program, GLuint index, GLsizei bufSize, GLsizei * length, GLsizei * size, GLenum * type, GLchar * name)} */
    public static void glGetTransformFeedbackVaryingEXT(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLsizei *") IntBuffer size, @NativeType("GLenum *") IntBuffer type, @NativeType("GLchar *") ByteBuffer name) {
        if (CHECKS) {
            checkSafe(length, 1);
            check(size, 1);
            check(type, 1);
        }
        nglGetTransformFeedbackVaryingEXT(program, index, name.remaining(), memAddressSafe(length), memAddress(size), memAddress(type), memAddress(name));
    }

    /** {@code void glGetTransformFeedbackVaryingEXT(GLuint program, GLuint index, GLsizei bufSize, GLsizei * length, GLsizei * size, GLenum * type, GLchar * name)} */
    @NativeType("void")
    public static String glGetTransformFeedbackVaryingEXT(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLsizei") int bufSize, @NativeType("GLsizei *") IntBuffer size, @NativeType("GLenum *") IntBuffer type) {
        if (CHECKS) {
            check(size, 1);
            check(type, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer length = stack.ints(0);
            ByteBuffer name = stack.malloc(bufSize);
            nglGetTransformFeedbackVaryingEXT(program, index, bufSize, memAddress(length), memAddress(size), memAddress(type), memAddress(name));
            return memASCII(name, length.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glGetTransformFeedbackVaryingEXT(GLuint program, GLuint index, GLsizei bufSize, GLsizei * length, GLsizei * size, GLenum * type, GLchar * name)} */
    @NativeType("void")
    public static String glGetTransformFeedbackVaryingEXT(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLsizei *") IntBuffer size, @NativeType("GLenum *") IntBuffer type) {
        return glGetTransformFeedbackVaryingEXT(program, index, GL.getCapabilities().OpenGL20
            ? GL20.glGetProgrami(program, GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH_EXT)
            : ARBShaderObjects.glGetObjectParameteriARB(program, GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH_EXT), size, type);
    }

    // --- [ glGetIntegerIndexedvEXT ] ---

    /** {@code void glGetIntegerIndexedvEXT(GLenum target, GLuint index, GLint * data)} */
    public static void nglGetIntegerIndexedvEXT(int target, int index, long data) {
        EXTDrawBuffers2.nglGetIntegerIndexedvEXT(target, index, data);
    }

    /** {@code void glGetIntegerIndexedvEXT(GLenum target, GLuint index, GLint * data)} */
    public static void glGetIntegerIndexedvEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLint *") IntBuffer data) {
        EXTDrawBuffers2.glGetIntegerIndexedvEXT(target, index, data);
    }

    /** {@code void glGetIntegerIndexedvEXT(GLenum target, GLuint index, GLint * data)} */
    @NativeType("void")
    public static int glGetIntegerIndexedEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        return EXTDrawBuffers2.glGetIntegerIndexedEXT(target, index);
    }

    // --- [ glGetBooleanIndexedvEXT ] ---

    /** {@code void glGetBooleanIndexedvEXT(GLenum target, GLuint index, GLboolean * data)} */
    public static void nglGetBooleanIndexedvEXT(int target, int index, long data) {
        EXTDrawBuffers2.nglGetBooleanIndexedvEXT(target, index, data);
    }

    /** {@code void glGetBooleanIndexedvEXT(GLenum target, GLuint index, GLboolean * data)} */
    public static void glGetBooleanIndexedvEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLboolean *") ByteBuffer data) {
        EXTDrawBuffers2.glGetBooleanIndexedvEXT(target, index, data);
    }

    /** {@code void glGetBooleanIndexedvEXT(GLenum target, GLuint index, GLboolean * data)} */
    @NativeType("void")
    public static boolean glGetBooleanIndexedEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        return EXTDrawBuffers2.glGetBooleanIndexedEXT(target, index);
    }

    /** {@code void glGetTransformFeedbackVaryingEXT(GLuint program, GLuint index, GLsizei bufSize, GLsizei * length, GLsizei * size, GLenum * type, GLchar * name)} */
    public static void glGetTransformFeedbackVaryingEXT(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLsizei *") int[] size, @NativeType("GLenum *") int[] type, @NativeType("GLchar *") ByteBuffer name) {
        long __functionAddress = GL.getICD().glGetTransformFeedbackVaryingEXT;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(length, 1);
            check(size, 1);
            check(type, 1);
        }
        callPPPPV(program, index, name.remaining(), length, size, type, memAddress(name), __functionAddress);
    }

    /** {@code void glGetIntegerIndexedvEXT(GLenum target, GLuint index, GLint * data)} */
    public static void glGetIntegerIndexedvEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLint *") int[] data) {
        EXTDrawBuffers2.glGetIntegerIndexedvEXT(target, index, data);
    }

}
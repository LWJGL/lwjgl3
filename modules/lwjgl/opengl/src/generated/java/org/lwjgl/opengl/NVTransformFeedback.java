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

public class NVTransformFeedback {

    static { GL.initialize(); }

    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_NV = 0x8C8E;

    public static final int
        GL_TRANSFORM_FEEDBACK_BUFFER_START_NV = 0x8C84,
        GL_TRANSFORM_FEEDBACK_BUFFER_SIZE_NV  = 0x8C85,
        GL_TRANSFORM_FEEDBACK_RECORD_NV       = 0x8C86;

    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_BINDING_NV = 0x8C8F;

    public static final int
        GL_INTERLEAVED_ATTRIBS_NV = 0x8C8C,
        GL_SEPARATE_ATTRIBS_NV    = 0x8C8D;

    public static final int
        GL_PRIMITIVES_GENERATED_NV                  = 0x8C87,
        GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN_NV = 0x8C88;

    public static final int GL_RASTERIZER_DISCARD_NV = 0x8C89;

    public static final int
        GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS_NV = 0x8C8A,
        GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS_NV       = 0x8C8B,
        GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS_NV    = 0x8C80,
        GL_TRANSFORM_FEEDBACK_ATTRIBS_NV                    = 0x8C7E;

    public static final int
        GL_ACTIVE_VARYINGS_NV             = 0x8C81,
        GL_ACTIVE_VARYING_MAX_LENGTH_NV   = 0x8C82,
        GL_TRANSFORM_FEEDBACK_VARYINGS_NV = 0x8C83;

    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_MODE_NV = 0x8C7F;

    public static final int
        GL_BACK_PRIMARY_COLOR_NV   = 0x8C77,
        GL_BACK_SECONDARY_COLOR_NV = 0x8C78,
        GL_TEXTURE_COORD_NV        = 0x8C79,
        GL_CLIP_DISTANCE_NV        = 0x8C7A,
        GL_VERTEX_ID_NV            = 0x8C7B,
        GL_PRIMITIVE_ID_NV         = 0x8C7C,
        GL_GENERIC_ATTRIB_NV       = 0x8C7D,
        GL_SECONDARY_COLOR_NV      = 0x852D,
        GL_LAYER_NV                = 0x8DAA;

    protected NVTransformFeedback() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBeginTransformFeedbackNV ] ---

    /** {@code void glBeginTransformFeedbackNV(GLenum primitiveMode)} */
    public static native void glBeginTransformFeedbackNV(@NativeType("GLenum") int primitiveMode);

    // --- [ glEndTransformFeedbackNV ] ---

    /** {@code void glEndTransformFeedbackNV(void)} */
    public static native void glEndTransformFeedbackNV();

    // --- [ glTransformFeedbackAttribsNV ] ---

    /** {@code void glTransformFeedbackAttribsNV(GLsizei count, GLint const * attribs, GLenum bufferMode)} */
    public static native void nglTransformFeedbackAttribsNV(int count, long attribs, int bufferMode);

    /** {@code void glTransformFeedbackAttribsNV(GLsizei count, GLint const * attribs, GLenum bufferMode)} */
    public static void glTransformFeedbackAttribsNV(@NativeType("GLint const *") IntBuffer attribs, @NativeType("GLenum") int bufferMode) {
        nglTransformFeedbackAttribsNV(attribs.remaining(), memAddress(attribs), bufferMode);
    }

    // --- [ glBindBufferRangeNV ] ---

    /** {@code void glBindBufferRangeNV(GLenum target, GLuint index, GLuint buffer, GLintptr offset, GLsizeiptr size)} */
    public static native void glBindBufferRangeNV(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size);

    // --- [ glBindBufferOffsetNV ] ---

    /** {@code void glBindBufferOffsetNV(GLenum target, GLuint index, GLuint buffer, GLintptr offset)} */
    public static native void glBindBufferOffsetNV(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset);

    // --- [ glBindBufferBaseNV ] ---

    /** {@code void glBindBufferBaseNV(GLenum target, GLuint index, GLuint buffer)} */
    public static native void glBindBufferBaseNV(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLuint") int buffer);

    // --- [ glTransformFeedbackVaryingsNV ] ---

    /** {@code void glTransformFeedbackVaryingsNV(GLuint program, GLsizei count, GLint const * locations, GLenum bufferMode)} */
    public static native void nglTransformFeedbackVaryingsNV(int program, int count, long locations, int bufferMode);

    /** {@code void glTransformFeedbackVaryingsNV(GLuint program, GLsizei count, GLint const * locations, GLenum bufferMode)} */
    public static void glTransformFeedbackVaryingsNV(@NativeType("GLuint") int program, @NativeType("GLint const *") IntBuffer locations, @NativeType("GLenum") int bufferMode) {
        nglTransformFeedbackVaryingsNV(program, locations.remaining(), memAddress(locations), bufferMode);
    }

    // --- [ glActiveVaryingNV ] ---

    /** {@code void glActiveVaryingNV(GLuint program, GLchar const * name)} */
    public static native void nglActiveVaryingNV(int program, long name);

    /** {@code void glActiveVaryingNV(GLuint program, GLchar const * name)} */
    public static void glActiveVaryingNV(@NativeType("GLuint") int program, @NativeType("GLchar const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        nglActiveVaryingNV(program, memAddress(name));
    }

    /** {@code void glActiveVaryingNV(GLuint program, GLchar const * name)} */
    public static void glActiveVaryingNV(@NativeType("GLuint") int program, @NativeType("GLchar const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            nglActiveVaryingNV(program, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetVaryingLocationNV ] ---

    /** {@code GLint glGetVaryingLocationNV(GLuint program, GLchar const * name)} */
    public static native int nglGetVaryingLocationNV(int program, long name);

    /** {@code GLint glGetVaryingLocationNV(GLuint program, GLchar const * name)} */
    @NativeType("GLint")
    public static int glGetVaryingLocationNV(@NativeType("GLuint") int program, @NativeType("GLchar const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nglGetVaryingLocationNV(program, memAddress(name));
    }

    /** {@code GLint glGetVaryingLocationNV(GLuint program, GLchar const * name)} */
    @NativeType("GLint")
    public static int glGetVaryingLocationNV(@NativeType("GLuint") int program, @NativeType("GLchar const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nglGetVaryingLocationNV(program, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetActiveVaryingNV ] ---

    /** {@code void glGetActiveVaryingNV(GLuint program, GLuint index, GLsizei bufSize, GLsizei * length, GLsizei * size, GLenum * type, GLchar * name)} */
    public static native void nglGetActiveVaryingNV(int program, int index, int bufSize, long length, long size, long type, long name);

    /** {@code void glGetActiveVaryingNV(GLuint program, GLuint index, GLsizei bufSize, GLsizei * length, GLsizei * size, GLenum * type, GLchar * name)} */
    public static void glGetActiveVaryingNV(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLsizei *") IntBuffer size, @NativeType("GLenum *") IntBuffer type, @NativeType("GLchar *") ByteBuffer name) {
        if (CHECKS) {
            checkSafe(length, 1);
            check(size, 1);
            check(type, 1);
        }
        nglGetActiveVaryingNV(program, index, name.remaining(), memAddressSafe(length), memAddress(size), memAddress(type), memAddress(name));
    }

    // --- [ glGetTransformFeedbackVaryingNV ] ---

    /** {@code void glGetTransformFeedbackVaryingNV(GLuint program, GLuint index, GLint * location)} */
    public static native void nglGetTransformFeedbackVaryingNV(int program, int index, long location);

    /** {@code void glGetTransformFeedbackVaryingNV(GLuint program, GLuint index, GLint * location)} */
    public static void glGetTransformFeedbackVaryingNV(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLint *") IntBuffer location) {
        if (CHECKS) {
            check(location, 1);
        }
        nglGetTransformFeedbackVaryingNV(program, index, memAddress(location));
    }

    /** {@code void glGetTransformFeedbackVaryingNV(GLuint program, GLuint index, GLint * location)} */
    @NativeType("void")
    public static int glGetTransformFeedbackVaryingNV(@NativeType("GLuint") int program, @NativeType("GLuint") int index) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer location = stack.callocInt(1);
            nglGetTransformFeedbackVaryingNV(program, index, memAddress(location));
            return location.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glTransformFeedbackStreamAttribsNV ] ---

    /** {@code void glTransformFeedbackStreamAttribsNV(GLsizei count, GLint const * attribs, GLsizei nbuffers, GLint const * bufstreams, GLenum bufferMode)} */
    public static native void nglTransformFeedbackStreamAttribsNV(int count, long attribs, int nbuffers, long bufstreams, int bufferMode);

    /** {@code void glTransformFeedbackStreamAttribsNV(GLsizei count, GLint const * attribs, GLsizei nbuffers, GLint const * bufstreams, GLenum bufferMode)} */
    public static void glTransformFeedbackStreamAttribsNV(@NativeType("GLint const *") IntBuffer attribs, @NativeType("GLint const *") IntBuffer bufstreams, @NativeType("GLenum") int bufferMode) {
        nglTransformFeedbackStreamAttribsNV(attribs.remaining(), memAddress(attribs), bufstreams.remaining(), memAddress(bufstreams), bufferMode);
    }

    /** {@code void glTransformFeedbackAttribsNV(GLsizei count, GLint const * attribs, GLenum bufferMode)} */
    public static void glTransformFeedbackAttribsNV(@NativeType("GLint const *") int[] attribs, @NativeType("GLenum") int bufferMode) {
        long __functionAddress = GL.getICD().glTransformFeedbackAttribsNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(attribs.length, attribs, bufferMode, __functionAddress);
    }

    /** {@code void glTransformFeedbackVaryingsNV(GLuint program, GLsizei count, GLint const * locations, GLenum bufferMode)} */
    public static void glTransformFeedbackVaryingsNV(@NativeType("GLuint") int program, @NativeType("GLint const *") int[] locations, @NativeType("GLenum") int bufferMode) {
        long __functionAddress = GL.getICD().glTransformFeedbackVaryingsNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, locations.length, locations, bufferMode, __functionAddress);
    }

    /** {@code void glGetActiveVaryingNV(GLuint program, GLuint index, GLsizei bufSize, GLsizei * length, GLsizei * size, GLenum * type, GLchar * name)} */
    public static void glGetActiveVaryingNV(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLsizei *") int[] size, @NativeType("GLenum *") int[] type, @NativeType("GLchar *") ByteBuffer name) {
        long __functionAddress = GL.getICD().glGetActiveVaryingNV;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(length, 1);
            check(size, 1);
            check(type, 1);
        }
        callPPPPV(program, index, name.remaining(), length, size, type, memAddress(name), __functionAddress);
    }

    /** {@code void glGetTransformFeedbackVaryingNV(GLuint program, GLuint index, GLint * location)} */
    public static void glGetTransformFeedbackVaryingNV(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLint *") int[] location) {
        long __functionAddress = GL.getICD().glGetTransformFeedbackVaryingNV;
        if (CHECKS) {
            check(__functionAddress);
            check(location, 1);
        }
        callPV(program, index, location, __functionAddress);
    }

    /** {@code void glTransformFeedbackStreamAttribsNV(GLsizei count, GLint const * attribs, GLsizei nbuffers, GLint const * bufstreams, GLenum bufferMode)} */
    public static void glTransformFeedbackStreamAttribsNV(@NativeType("GLint const *") int[] attribs, @NativeType("GLint const *") int[] bufstreams, @NativeType("GLenum") int bufferMode) {
        long __functionAddress = GL.getICD().glTransformFeedbackStreamAttribsNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(attribs.length, attribs, bufstreams.length, bufstreams, bufferMode, __functionAddress);
    }

}
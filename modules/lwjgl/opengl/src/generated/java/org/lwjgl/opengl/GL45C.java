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

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class GL45C extends GL44C {

    static { GL.initialize(); }

    public static final int
        GL_NEGATIVE_ONE_TO_ONE = 0x935E,
        GL_ZERO_TO_ONE         = 0x935F;

    public static final int
        GL_CLIP_ORIGIN     = 0x935C,
        GL_CLIP_DEPTH_MODE = 0x935D;

    public static final int
        GL_QUERY_WAIT_INVERTED              = 0x8E17,
        GL_QUERY_NO_WAIT_INVERTED           = 0x8E18,
        GL_QUERY_BY_REGION_WAIT_INVERTED    = 0x8E19,
        GL_QUERY_BY_REGION_NO_WAIT_INVERTED = 0x8E1A;

    public static final int
        GL_MAX_CULL_DISTANCES                   = 0x82F9,
        GL_MAX_COMBINED_CLIP_AND_CULL_DISTANCES = 0x82FA;

    public static final int GL_TEXTURE_TARGET = 0x1006;

    public static final int GL_QUERY_TARGET = 0x82EA;

    public static final int GL_CONTEXT_RELEASE_BEHAVIOR = 0x82FB;

    public static final int GL_CONTEXT_RELEASE_BEHAVIOR_FLUSH = 0x82FC;

    public static final int
        GL_GUILTY_CONTEXT_RESET   = 0x8253,
        GL_INNOCENT_CONTEXT_RESET = 0x8254,
        GL_UNKNOWN_CONTEXT_RESET  = 0x8255;

    public static final int GL_RESET_NOTIFICATION_STRATEGY = 0x8256;

    public static final int
        GL_LOSE_CONTEXT_ON_RESET = 0x8252,
        GL_NO_RESET_NOTIFICATION = 0x8261;

    public static final int GL_CONTEXT_FLAG_ROBUST_ACCESS_BIT = 0x4;

    public static final int GL_CONTEXT_LOST = 0x507;

    protected GL45C() {
        throw new UnsupportedOperationException();
    }

    // --- [ glClipControl ] ---

    /** {@code void glClipControl(GLenum origin, GLenum depth)} */
    public static native void glClipControl(@NativeType("GLenum") int origin, @NativeType("GLenum") int depth);

    // --- [ glCreateTransformFeedbacks ] ---

    /** {@code void glCreateTransformFeedbacks(GLsizei n, GLuint * ids)} */
    public static native void nglCreateTransformFeedbacks(int n, long ids);

    /** {@code void glCreateTransformFeedbacks(GLsizei n, GLuint * ids)} */
    public static void glCreateTransformFeedbacks(@NativeType("GLuint *") IntBuffer ids) {
        nglCreateTransformFeedbacks(ids.remaining(), memAddress(ids));
    }

    /** {@code void glCreateTransformFeedbacks(GLsizei n, GLuint * ids)} */
    @NativeType("void")
    public static int glCreateTransformFeedbacks() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer ids = stack.callocInt(1);
            nglCreateTransformFeedbacks(1, memAddress(ids));
            return ids.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glTransformFeedbackBufferBase ] ---

    /** {@code void glTransformFeedbackBufferBase(GLuint xfb, GLuint index, GLuint buffer)} */
    public static native void glTransformFeedbackBufferBase(@NativeType("GLuint") int xfb, @NativeType("GLuint") int index, @NativeType("GLuint") int buffer);

    // --- [ glTransformFeedbackBufferRange ] ---

    /** {@code void glTransformFeedbackBufferRange(GLuint xfb, GLuint index, GLuint buffer, GLintptr offset, GLsizeiptr size)} */
    public static native void glTransformFeedbackBufferRange(@NativeType("GLuint") int xfb, @NativeType("GLuint") int index, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size);

    // --- [ glGetTransformFeedbackiv ] ---

    /** {@code void glGetTransformFeedbackiv(GLuint xfb, GLenum pname, GLint * param)} */
    public static native void nglGetTransformFeedbackiv(int xfb, int pname, long param);

    /** {@code void glGetTransformFeedbackiv(GLuint xfb, GLenum pname, GLint * param)} */
    public static void glGetTransformFeedbackiv(@NativeType("GLuint") int xfb, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer param) {
        if (CHECKS) {
            check(param, 1);
        }
        nglGetTransformFeedbackiv(xfb, pname, memAddress(param));
    }

    /** {@code void glGetTransformFeedbackiv(GLuint xfb, GLenum pname, GLint * param)} */
    @NativeType("void")
    public static int glGetTransformFeedbacki(@NativeType("GLuint") int xfb, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer param = stack.callocInt(1);
            nglGetTransformFeedbackiv(xfb, pname, memAddress(param));
            return param.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetTransformFeedbacki_v ] ---

    /** {@code void glGetTransformFeedbacki_v(GLuint xfb, GLenum pname, GLuint index, GLint * param)} */
    public static native void nglGetTransformFeedbacki_v(int xfb, int pname, int index, long param);

    /** {@code void glGetTransformFeedbacki_v(GLuint xfb, GLenum pname, GLuint index, GLint * param)} */
    public static void glGetTransformFeedbacki_v(@NativeType("GLuint") int xfb, @NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLint *") IntBuffer param) {
        if (CHECKS) {
            check(param, 1);
        }
        nglGetTransformFeedbacki_v(xfb, pname, index, memAddress(param));
    }

    /** {@code void glGetTransformFeedbacki_v(GLuint xfb, GLenum pname, GLuint index, GLint * param)} */
    @NativeType("void")
    public static int glGetTransformFeedbacki(@NativeType("GLuint") int xfb, @NativeType("GLenum") int pname, @NativeType("GLuint") int index) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer param = stack.callocInt(1);
            nglGetTransformFeedbacki_v(xfb, pname, index, memAddress(param));
            return param.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetTransformFeedbacki64_v ] ---

    /** {@code void glGetTransformFeedbacki64_v(GLuint xfb, GLenum pname, GLuint index, GLint64 * param)} */
    public static native void nglGetTransformFeedbacki64_v(int xfb, int pname, int index, long param);

    /** {@code void glGetTransformFeedbacki64_v(GLuint xfb, GLenum pname, GLuint index, GLint64 * param)} */
    public static void glGetTransformFeedbacki64_v(@NativeType("GLuint") int xfb, @NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLint64 *") LongBuffer param) {
        if (CHECKS) {
            check(param, 1);
        }
        nglGetTransformFeedbacki64_v(xfb, pname, index, memAddress(param));
    }

    /** {@code void glGetTransformFeedbacki64_v(GLuint xfb, GLenum pname, GLuint index, GLint64 * param)} */
    @NativeType("void")
    public static long glGetTransformFeedbacki64(@NativeType("GLuint") int xfb, @NativeType("GLenum") int pname, @NativeType("GLuint") int index) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer param = stack.callocLong(1);
            nglGetTransformFeedbacki64_v(xfb, pname, index, memAddress(param));
            return param.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glCreateBuffers ] ---

    /** {@code void glCreateBuffers(GLsizei n, GLuint * buffers)} */
    public static native void nglCreateBuffers(int n, long buffers);

    /** {@code void glCreateBuffers(GLsizei n, GLuint * buffers)} */
    public static void glCreateBuffers(@NativeType("GLuint *") IntBuffer buffers) {
        nglCreateBuffers(buffers.remaining(), memAddress(buffers));
    }

    /** {@code void glCreateBuffers(GLsizei n, GLuint * buffers)} */
    @NativeType("void")
    public static int glCreateBuffers() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer buffers = stack.callocInt(1);
            nglCreateBuffers(1, memAddress(buffers));
            return buffers.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glNamedBufferStorage ] ---

    /** {@code void glNamedBufferStorage(GLuint buffer, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static native void nglNamedBufferStorage(int buffer, long size, long data, int flags);

    /** {@code void glNamedBufferStorage(GLuint buffer, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glNamedBufferStorage(@NativeType("GLuint") int buffer, @NativeType("GLsizeiptr") long size, @NativeType("GLbitfield") int flags) {
        nglNamedBufferStorage(buffer, size, NULL, flags);
    }

    /** {@code void glNamedBufferStorage(GLuint buffer, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glNamedBufferStorage(@NativeType("GLuint") int buffer, @NativeType("void const *") ByteBuffer data, @NativeType("GLbitfield") int flags) {
        nglNamedBufferStorage(buffer, data.remaining(), memAddress(data), flags);
    }

    /** {@code void glNamedBufferStorage(GLuint buffer, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glNamedBufferStorage(@NativeType("GLuint") int buffer, @NativeType("void const *") ShortBuffer data, @NativeType("GLbitfield") int flags) {
        nglNamedBufferStorage(buffer, Integer.toUnsignedLong(data.remaining()) << 1, memAddress(data), flags);
    }

    /** {@code void glNamedBufferStorage(GLuint buffer, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glNamedBufferStorage(@NativeType("GLuint") int buffer, @NativeType("void const *") IntBuffer data, @NativeType("GLbitfield") int flags) {
        nglNamedBufferStorage(buffer, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data), flags);
    }

    /** {@code void glNamedBufferStorage(GLuint buffer, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glNamedBufferStorage(@NativeType("GLuint") int buffer, @NativeType("void const *") FloatBuffer data, @NativeType("GLbitfield") int flags) {
        nglNamedBufferStorage(buffer, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data), flags);
    }

    /** {@code void glNamedBufferStorage(GLuint buffer, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glNamedBufferStorage(@NativeType("GLuint") int buffer, @NativeType("void const *") DoubleBuffer data, @NativeType("GLbitfield") int flags) {
        nglNamedBufferStorage(buffer, Integer.toUnsignedLong(data.remaining()) << 3, memAddress(data), flags);
    }

    // --- [ glNamedBufferData ] ---

    /** {@code void glNamedBufferData(GLuint buffer, GLsizeiptr size, void const * data, GLenum usage)} */
    public static native void nglNamedBufferData(int buffer, long size, long data, int usage);

    /** {@code void glNamedBufferData(GLuint buffer, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int usage) {
        nglNamedBufferData(buffer, size, NULL, usage);
    }

    /** {@code void glNamedBufferData(GLuint buffer, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("void const *") ByteBuffer data, @NativeType("GLenum") int usage) {
        nglNamedBufferData(buffer, data.remaining(), memAddress(data), usage);
    }

    /** {@code void glNamedBufferData(GLuint buffer, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("void const *") ShortBuffer data, @NativeType("GLenum") int usage) {
        nglNamedBufferData(buffer, Integer.toUnsignedLong(data.remaining()) << 1, memAddress(data), usage);
    }

    /** {@code void glNamedBufferData(GLuint buffer, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("void const *") IntBuffer data, @NativeType("GLenum") int usage) {
        nglNamedBufferData(buffer, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data), usage);
    }

    /** {@code void glNamedBufferData(GLuint buffer, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("void const *") LongBuffer data, @NativeType("GLenum") int usage) {
        nglNamedBufferData(buffer, Integer.toUnsignedLong(data.remaining()) << 3, memAddress(data), usage);
    }

    /** {@code void glNamedBufferData(GLuint buffer, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("void const *") FloatBuffer data, @NativeType("GLenum") int usage) {
        nglNamedBufferData(buffer, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data), usage);
    }

    /** {@code void glNamedBufferData(GLuint buffer, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("void const *") DoubleBuffer data, @NativeType("GLenum") int usage) {
        nglNamedBufferData(buffer, Integer.toUnsignedLong(data.remaining()) << 3, memAddress(data), usage);
    }

    // --- [ glNamedBufferSubData ] ---

    /** {@code void glNamedBufferSubData(GLuint buffer, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static native void nglNamedBufferSubData(int buffer, long offset, long size, long data);

    /** {@code void glNamedBufferSubData(GLuint buffer, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") ByteBuffer data) {
        nglNamedBufferSubData(buffer, offset, data.remaining(), memAddress(data));
    }

    /** {@code void glNamedBufferSubData(GLuint buffer, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") ShortBuffer data) {
        nglNamedBufferSubData(buffer, offset, Integer.toUnsignedLong(data.remaining()) << 1, memAddress(data));
    }

    /** {@code void glNamedBufferSubData(GLuint buffer, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") IntBuffer data) {
        nglNamedBufferSubData(buffer, offset, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data));
    }

    /** {@code void glNamedBufferSubData(GLuint buffer, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") LongBuffer data) {
        nglNamedBufferSubData(buffer, offset, Integer.toUnsignedLong(data.remaining()) << 3, memAddress(data));
    }

    /** {@code void glNamedBufferSubData(GLuint buffer, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") FloatBuffer data) {
        nglNamedBufferSubData(buffer, offset, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data));
    }

    /** {@code void glNamedBufferSubData(GLuint buffer, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") DoubleBuffer data) {
        nglNamedBufferSubData(buffer, offset, Integer.toUnsignedLong(data.remaining()) << 3, memAddress(data));
    }

    // --- [ glCopyNamedBufferSubData ] ---

    /** {@code void glCopyNamedBufferSubData(GLuint readBuffer, GLuint writeBuffer, GLintptr readOffset, GLintptr writeOffset, GLsizeiptr size)} */
    public static native void glCopyNamedBufferSubData(@NativeType("GLuint") int readBuffer, @NativeType("GLuint") int writeBuffer, @NativeType("GLintptr") long readOffset, @NativeType("GLintptr") long writeOffset, @NativeType("GLsizeiptr") long size);

    // --- [ glClearNamedBufferData ] ---

    /** {@code void glClearNamedBufferData(GLuint buffer, GLenum internalformat, GLenum format, GLenum type, void const * data)} */
    public static native void nglClearNamedBufferData(int buffer, int internalformat, int format, int type, long data);

    /** {@code void glClearNamedBufferData(GLuint buffer, GLenum internalformat, GLenum format, GLenum type, void const * data)} */
    public static void glClearNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable ByteBuffer data) {
        nglClearNamedBufferData(buffer, internalformat, format, type, memAddressSafe(data));
    }

    /** {@code void glClearNamedBufferData(GLuint buffer, GLenum internalformat, GLenum format, GLenum type, void const * data)} */
    public static void glClearNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable ShortBuffer data) {
        nglClearNamedBufferData(buffer, internalformat, format, type, memAddressSafe(data));
    }

    /** {@code void glClearNamedBufferData(GLuint buffer, GLenum internalformat, GLenum format, GLenum type, void const * data)} */
    public static void glClearNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable IntBuffer data) {
        nglClearNamedBufferData(buffer, internalformat, format, type, memAddressSafe(data));
    }

    /** {@code void glClearNamedBufferData(GLuint buffer, GLenum internalformat, GLenum format, GLenum type, void const * data)} */
    public static void glClearNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable FloatBuffer data) {
        nglClearNamedBufferData(buffer, internalformat, format, type, memAddressSafe(data));
    }

    // --- [ glClearNamedBufferSubData ] ---

    /** {@code void glClearNamedBufferSubData(GLuint buffer, GLenum internalformat, GLintptr offset, GLsizeiptr size, GLenum format, GLenum type, void const * data)} */
    public static native void nglClearNamedBufferSubData(int buffer, int internalformat, long offset, long size, int format, int type, long data);

    /** {@code void glClearNamedBufferSubData(GLuint buffer, GLenum internalformat, GLintptr offset, GLsizeiptr size, GLenum format, GLenum type, void const * data)} */
    public static void glClearNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable ByteBuffer data) {
        nglClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, memAddressSafe(data));
    }

    /** {@code void glClearNamedBufferSubData(GLuint buffer, GLenum internalformat, GLintptr offset, GLsizeiptr size, GLenum format, GLenum type, void const * data)} */
    public static void glClearNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable ShortBuffer data) {
        nglClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, memAddressSafe(data));
    }

    /** {@code void glClearNamedBufferSubData(GLuint buffer, GLenum internalformat, GLintptr offset, GLsizeiptr size, GLenum format, GLenum type, void const * data)} */
    public static void glClearNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable IntBuffer data) {
        nglClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, memAddressSafe(data));
    }

    /** {@code void glClearNamedBufferSubData(GLuint buffer, GLenum internalformat, GLintptr offset, GLsizeiptr size, GLenum format, GLenum type, void const * data)} */
    public static void glClearNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable FloatBuffer data) {
        nglClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, memAddressSafe(data));
    }

    // --- [ glMapNamedBuffer ] ---

    /** {@code void * glMapNamedBuffer(GLuint buffer, GLenum access)} */
    public static native long nglMapNamedBuffer(int buffer, int access);

    /** {@code void * glMapNamedBuffer(GLuint buffer, GLenum access)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer glMapNamedBuffer(@NativeType("GLuint") int buffer, @NativeType("GLenum") int access) {
        long __result = nglMapNamedBuffer(buffer, access);
        return memByteBufferSafe(__result, glGetNamedBufferParameteri(buffer, GL15.GL_BUFFER_SIZE));
    }

    /** {@code void * glMapNamedBuffer(GLuint buffer, GLenum access)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer glMapNamedBuffer(@NativeType("GLuint") int buffer, @NativeType("GLenum") int access, @Nullable ByteBuffer old_buffer) {
        long __result = nglMapNamedBuffer(buffer, access);
        int length = glGetNamedBufferParameteri(buffer, GL15.GL_BUFFER_SIZE);
        return apiGetMappedBuffer(old_buffer, __result, length);
    }

    /** {@code void * glMapNamedBuffer(GLuint buffer, GLenum access)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer glMapNamedBuffer(@NativeType("GLuint") int buffer, @NativeType("GLenum") int access, long length, @Nullable ByteBuffer old_buffer) {
        long __result = nglMapNamedBuffer(buffer, access);
        return apiGetMappedBuffer(old_buffer, __result, (int)length);
    }

    // --- [ glMapNamedBufferRange ] ---

    /** {@code void * glMapNamedBufferRange(GLuint buffer, GLintptr offset, GLsizeiptr length, GLbitfield access)} */
    public static native long nglMapNamedBufferRange(int buffer, long offset, long length, int access);

    /** {@code void * glMapNamedBufferRange(GLuint buffer, GLintptr offset, GLsizeiptr length, GLbitfield access)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer glMapNamedBufferRange(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long length, @NativeType("GLbitfield") int access) {
        long __result = nglMapNamedBufferRange(buffer, offset, length, access);
        return memByteBufferSafe(__result, (int)length);
    }

    /** {@code void * glMapNamedBufferRange(GLuint buffer, GLintptr offset, GLsizeiptr length, GLbitfield access)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer glMapNamedBufferRange(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long length, @NativeType("GLbitfield") int access, @Nullable ByteBuffer old_buffer) {
        long __result = nglMapNamedBufferRange(buffer, offset, length, access);
        return apiGetMappedBuffer(old_buffer, __result, (int)length);
    }

    // --- [ glUnmapNamedBuffer ] ---

    /** {@code GLboolean glUnmapNamedBuffer(GLuint buffer)} */
    @NativeType("GLboolean")
    public static native boolean glUnmapNamedBuffer(@NativeType("GLuint") int buffer);

    // --- [ glFlushMappedNamedBufferRange ] ---

    /** {@code void glFlushMappedNamedBufferRange(GLuint buffer, GLintptr offset, GLsizeiptr length)} */
    public static native void glFlushMappedNamedBufferRange(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long length);

    // --- [ glGetNamedBufferParameteriv ] ---

    /** {@code void glGetNamedBufferParameteriv(GLuint buffer, GLenum pname, GLint * params)} */
    public static native void nglGetNamedBufferParameteriv(int buffer, int pname, long params);

    /** {@code void glGetNamedBufferParameteriv(GLuint buffer, GLenum pname, GLint * params)} */
    public static void glGetNamedBufferParameteriv(@NativeType("GLuint") int buffer, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetNamedBufferParameteriv(buffer, pname, memAddress(params));
    }

    /** {@code void glGetNamedBufferParameteriv(GLuint buffer, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetNamedBufferParameteri(@NativeType("GLuint") int buffer, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetNamedBufferParameteriv(buffer, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetNamedBufferParameteri64v ] ---

    /** {@code void glGetNamedBufferParameteri64v(GLuint buffer, GLenum pname, GLint64 * params)} */
    public static native void nglGetNamedBufferParameteri64v(int buffer, int pname, long params);

    /** {@code void glGetNamedBufferParameteri64v(GLuint buffer, GLenum pname, GLint64 * params)} */
    public static void glGetNamedBufferParameteri64v(@NativeType("GLuint") int buffer, @NativeType("GLenum") int pname, @NativeType("GLint64 *") LongBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetNamedBufferParameteri64v(buffer, pname, memAddress(params));
    }

    /** {@code void glGetNamedBufferParameteri64v(GLuint buffer, GLenum pname, GLint64 * params)} */
    @NativeType("void")
    public static long glGetNamedBufferParameteri64(@NativeType("GLuint") int buffer, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer params = stack.callocLong(1);
            nglGetNamedBufferParameteri64v(buffer, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetNamedBufferPointerv ] ---

    /** {@code void glGetNamedBufferPointerv(GLuint buffer, GLenum pname, void ** params)} */
    public static native void nglGetNamedBufferPointerv(int buffer, int pname, long params);

    /** {@code void glGetNamedBufferPointerv(GLuint buffer, GLenum pname, void ** params)} */
    public static void glGetNamedBufferPointerv(@NativeType("GLuint") int buffer, @NativeType("GLenum") int pname, @NativeType("void **") PointerBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetNamedBufferPointerv(buffer, pname, memAddress(params));
    }

    /** {@code void glGetNamedBufferPointerv(GLuint buffer, GLenum pname, void ** params)} */
    @NativeType("void")
    public static long glGetNamedBufferPointer(@NativeType("GLuint") int buffer, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer params = stack.callocPointer(1);
            nglGetNamedBufferPointerv(buffer, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetNamedBufferSubData ] ---

    /** {@code void glGetNamedBufferSubData(GLuint buffer, GLintptr offset, GLsizeiptr size, void * data)} */
    public static native void nglGetNamedBufferSubData(int buffer, long offset, long size, long data);

    /** {@code void glGetNamedBufferSubData(GLuint buffer, GLintptr offset, GLsizeiptr size, void * data)} */
    public static void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") ByteBuffer data) {
        nglGetNamedBufferSubData(buffer, offset, data.remaining(), memAddress(data));
    }

    /** {@code void glGetNamedBufferSubData(GLuint buffer, GLintptr offset, GLsizeiptr size, void * data)} */
    public static void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") ShortBuffer data) {
        nglGetNamedBufferSubData(buffer, offset, Integer.toUnsignedLong(data.remaining()) << 1, memAddress(data));
    }

    /** {@code void glGetNamedBufferSubData(GLuint buffer, GLintptr offset, GLsizeiptr size, void * data)} */
    public static void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") IntBuffer data) {
        nglGetNamedBufferSubData(buffer, offset, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data));
    }

    /** {@code void glGetNamedBufferSubData(GLuint buffer, GLintptr offset, GLsizeiptr size, void * data)} */
    public static void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") LongBuffer data) {
        nglGetNamedBufferSubData(buffer, offset, Integer.toUnsignedLong(data.remaining()) << 3, memAddress(data));
    }

    /** {@code void glGetNamedBufferSubData(GLuint buffer, GLintptr offset, GLsizeiptr size, void * data)} */
    public static void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") FloatBuffer data) {
        nglGetNamedBufferSubData(buffer, offset, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data));
    }

    /** {@code void glGetNamedBufferSubData(GLuint buffer, GLintptr offset, GLsizeiptr size, void * data)} */
    public static void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") DoubleBuffer data) {
        nglGetNamedBufferSubData(buffer, offset, Integer.toUnsignedLong(data.remaining()) << 3, memAddress(data));
    }

    // --- [ glCreateFramebuffers ] ---

    /** {@code void glCreateFramebuffers(GLsizei n, GLuint * framebuffers)} */
    public static native void nglCreateFramebuffers(int n, long framebuffers);

    /** {@code void glCreateFramebuffers(GLsizei n, GLuint * framebuffers)} */
    public static void glCreateFramebuffers(@NativeType("GLuint *") IntBuffer framebuffers) {
        nglCreateFramebuffers(framebuffers.remaining(), memAddress(framebuffers));
    }

    /** {@code void glCreateFramebuffers(GLsizei n, GLuint * framebuffers)} */
    @NativeType("void")
    public static int glCreateFramebuffers() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer framebuffers = stack.callocInt(1);
            nglCreateFramebuffers(1, memAddress(framebuffers));
            return framebuffers.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glNamedFramebufferRenderbuffer ] ---

    /** {@code void glNamedFramebufferRenderbuffer(GLuint framebuffer, GLenum attachment, GLenum renderbuffertarget, GLuint renderbuffer)} */
    public static native void glNamedFramebufferRenderbuffer(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLenum") int renderbuffertarget, @NativeType("GLuint") int renderbuffer);

    // --- [ glNamedFramebufferParameteri ] ---

    /** {@code void glNamedFramebufferParameteri(GLuint framebuffer, GLenum pname, GLint param)} */
    public static native void glNamedFramebufferParameteri(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int pname, @NativeType("GLint") int param);

    // --- [ glNamedFramebufferTexture ] ---

    /** {@code void glNamedFramebufferTexture(GLuint framebuffer, GLenum attachment, GLuint texture, GLint level)} */
    public static native void glNamedFramebufferTexture(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level);

    // --- [ glNamedFramebufferTextureLayer ] ---

    /** {@code void glNamedFramebufferTextureLayer(GLuint framebuffer, GLenum attachment, GLuint texture, GLint level, GLint layer)} */
    public static native void glNamedFramebufferTextureLayer(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int layer);

    // --- [ glNamedFramebufferDrawBuffer ] ---

    /** {@code void glNamedFramebufferDrawBuffer(GLuint framebuffer, GLenum buf)} */
    public static native void glNamedFramebufferDrawBuffer(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int buf);

    // --- [ glNamedFramebufferDrawBuffers ] ---

    /** {@code void glNamedFramebufferDrawBuffers(GLuint framebuffer, GLsizei n, GLenum const * bufs)} */
    public static native void nglNamedFramebufferDrawBuffers(int framebuffer, int n, long bufs);

    /** {@code void glNamedFramebufferDrawBuffers(GLuint framebuffer, GLsizei n, GLenum const * bufs)} */
    public static void glNamedFramebufferDrawBuffers(@NativeType("GLuint") int framebuffer, @NativeType("GLenum const *") IntBuffer bufs) {
        nglNamedFramebufferDrawBuffers(framebuffer, bufs.remaining(), memAddress(bufs));
    }

    /** {@code void glNamedFramebufferDrawBuffers(GLuint framebuffer, GLsizei n, GLenum const * bufs)} */
    public static void glNamedFramebufferDrawBuffers(@NativeType("GLuint") int framebuffer, @NativeType("GLenum const *") int buf) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer bufs = stack.ints(buf);
            nglNamedFramebufferDrawBuffers(framebuffer, 1, memAddress(bufs));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glNamedFramebufferReadBuffer ] ---

    /** {@code void glNamedFramebufferReadBuffer(GLuint framebuffer, GLenum src)} */
    public static native void glNamedFramebufferReadBuffer(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int src);

    // --- [ glInvalidateNamedFramebufferData ] ---

    /** {@code void glInvalidateNamedFramebufferData(GLuint framebuffer, GLsizei numAttachments, GLenum const * attachments)} */
    public static native void nglInvalidateNamedFramebufferData(int framebuffer, int numAttachments, long attachments);

    /** {@code void glInvalidateNamedFramebufferData(GLuint framebuffer, GLsizei numAttachments, GLenum const * attachments)} */
    public static void glInvalidateNamedFramebufferData(@NativeType("GLuint") int framebuffer, @NativeType("GLenum const *") IntBuffer attachments) {
        nglInvalidateNamedFramebufferData(framebuffer, attachments.remaining(), memAddress(attachments));
    }

    /** {@code void glInvalidateNamedFramebufferData(GLuint framebuffer, GLsizei numAttachments, GLenum const * attachments)} */
    public static void glInvalidateNamedFramebufferData(@NativeType("GLuint") int framebuffer, @NativeType("GLenum const *") int attachment) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer attachments = stack.ints(attachment);
            nglInvalidateNamedFramebufferData(framebuffer, 1, memAddress(attachments));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glInvalidateNamedFramebufferSubData ] ---

    /** {@code void glInvalidateNamedFramebufferSubData(GLuint framebuffer, GLsizei numAttachments, GLenum const * attachments, GLint x, GLint y, GLsizei width, GLsizei height)} */
    public static native void nglInvalidateNamedFramebufferSubData(int framebuffer, int numAttachments, long attachments, int x, int y, int width, int height);

    /** {@code void glInvalidateNamedFramebufferSubData(GLuint framebuffer, GLsizei numAttachments, GLenum const * attachments, GLint x, GLint y, GLsizei width, GLsizei height)} */
    public static void glInvalidateNamedFramebufferSubData(@NativeType("GLuint") int framebuffer, @NativeType("GLenum const *") IntBuffer attachments, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        nglInvalidateNamedFramebufferSubData(framebuffer, attachments.remaining(), memAddress(attachments), x, y, width, height);
    }

    /** {@code void glInvalidateNamedFramebufferSubData(GLuint framebuffer, GLsizei numAttachments, GLenum const * attachments, GLint x, GLint y, GLsizei width, GLsizei height)} */
    public static void glInvalidateNamedFramebufferSubData(@NativeType("GLuint") int framebuffer, @NativeType("GLenum const *") int attachment, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer attachments = stack.ints(attachment);
            nglInvalidateNamedFramebufferSubData(framebuffer, 1, memAddress(attachments), x, y, width, height);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glClearNamedFramebufferiv ] ---

    /** {@code void glClearNamedFramebufferiv(GLuint framebuffer, GLenum buffer, GLint drawbuffer, GLint const * value)} */
    public static native void nglClearNamedFramebufferiv(int framebuffer, int buffer, int drawbuffer, long value);

    /** {@code void glClearNamedFramebufferiv(GLuint framebuffer, GLenum buffer, GLint drawbuffer, GLint const * value)} */
    public static void glClearNamedFramebufferiv(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLint const *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nglClearNamedFramebufferiv(framebuffer, buffer, drawbuffer, memAddress(value));
    }

    // --- [ glClearNamedFramebufferuiv ] ---

    /** {@code void glClearNamedFramebufferuiv(GLuint framebuffer, GLenum buffer, GLint drawbuffer, GLint const * value)} */
    public static native void nglClearNamedFramebufferuiv(int framebuffer, int buffer, int drawbuffer, long value);

    /** {@code void glClearNamedFramebufferuiv(GLuint framebuffer, GLenum buffer, GLint drawbuffer, GLint const * value)} */
    public static void glClearNamedFramebufferuiv(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLint const *") IntBuffer value) {
        if (CHECKS) {
            check(value, 4);
        }
        nglClearNamedFramebufferuiv(framebuffer, buffer, drawbuffer, memAddress(value));
    }

    // --- [ glClearNamedFramebufferfv ] ---

    /** {@code void glClearNamedFramebufferfv(GLuint framebuffer, GLenum buffer, GLint drawbuffer, GLfloat const * value)} */
    public static native void nglClearNamedFramebufferfv(int framebuffer, int buffer, int drawbuffer, long value);

    /** {@code void glClearNamedFramebufferfv(GLuint framebuffer, GLenum buffer, GLint drawbuffer, GLfloat const * value)} */
    public static void glClearNamedFramebufferfv(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLfloat const *") FloatBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nglClearNamedFramebufferfv(framebuffer, buffer, drawbuffer, memAddress(value));
    }

    // --- [ glClearNamedFramebufferfi ] ---

    /** {@code void glClearNamedFramebufferfi(GLuint framebuffer, GLenum buffer, GLint drawbuffer, GLfloat depth, GLint stencil)} */
    public static native void glClearNamedFramebufferfi(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLfloat") float depth, @NativeType("GLint") int stencil);

    // --- [ glBlitNamedFramebuffer ] ---

    /** {@code void glBlitNamedFramebuffer(GLuint readFramebuffer, GLuint drawFramebuffer, GLint srcX0, GLint srcY0, GLint srcX1, GLint srcY1, GLint dstX0, GLint dstY0, GLint dstX1, GLint dstY1, GLbitfield mask, GLenum filter)} */
    public static native void glBlitNamedFramebuffer(@NativeType("GLuint") int readFramebuffer, @NativeType("GLuint") int drawFramebuffer, @NativeType("GLint") int srcX0, @NativeType("GLint") int srcY0, @NativeType("GLint") int srcX1, @NativeType("GLint") int srcY1, @NativeType("GLint") int dstX0, @NativeType("GLint") int dstY0, @NativeType("GLint") int dstX1, @NativeType("GLint") int dstY1, @NativeType("GLbitfield") int mask, @NativeType("GLenum") int filter);

    // --- [ glCheckNamedFramebufferStatus ] ---

    /** {@code GLenum glCheckNamedFramebufferStatus(GLuint framebuffer, GLenum target)} */
    @NativeType("GLenum")
    public static native int glCheckNamedFramebufferStatus(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int target);

    // --- [ glGetNamedFramebufferParameteriv ] ---

    /** {@code void glGetNamedFramebufferParameteriv(GLuint framebuffer, GLenum pname, GLint * params)} */
    public static native void nglGetNamedFramebufferParameteriv(int framebuffer, int pname, long params);

    /** {@code void glGetNamedFramebufferParameteriv(GLuint framebuffer, GLenum pname, GLint * params)} */
    public static void glGetNamedFramebufferParameteriv(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetNamedFramebufferParameteriv(framebuffer, pname, memAddress(params));
    }

    /** {@code void glGetNamedFramebufferParameteriv(GLuint framebuffer, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetNamedFramebufferParameteri(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetNamedFramebufferParameteriv(framebuffer, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetNamedFramebufferAttachmentParameteriv ] ---

    /** {@code void glGetNamedFramebufferAttachmentParameteriv(GLuint framebuffer, GLenum attachment, GLenum pname, GLint * params)} */
    public static native void nglGetNamedFramebufferAttachmentParameteriv(int framebuffer, int attachment, int pname, long params);

    /** {@code void glGetNamedFramebufferAttachmentParameteriv(GLuint framebuffer, GLenum attachment, GLenum pname, GLint * params)} */
    public static void glGetNamedFramebufferAttachmentParameteriv(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetNamedFramebufferAttachmentParameteriv(framebuffer, attachment, pname, memAddress(params));
    }

    /** {@code void glGetNamedFramebufferAttachmentParameteriv(GLuint framebuffer, GLenum attachment, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetNamedFramebufferAttachmentParameteri(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetNamedFramebufferAttachmentParameteriv(framebuffer, attachment, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glCreateRenderbuffers ] ---

    /** {@code void glCreateRenderbuffers(GLsizei n, GLuint * renderbuffers)} */
    public static native void nglCreateRenderbuffers(int n, long renderbuffers);

    /** {@code void glCreateRenderbuffers(GLsizei n, GLuint * renderbuffers)} */
    public static void glCreateRenderbuffers(@NativeType("GLuint *") IntBuffer renderbuffers) {
        nglCreateRenderbuffers(renderbuffers.remaining(), memAddress(renderbuffers));
    }

    /** {@code void glCreateRenderbuffers(GLsizei n, GLuint * renderbuffers)} */
    @NativeType("void")
    public static int glCreateRenderbuffers() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer renderbuffers = stack.callocInt(1);
            nglCreateRenderbuffers(1, memAddress(renderbuffers));
            return renderbuffers.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glNamedRenderbufferStorage ] ---

    /** {@code void glNamedRenderbufferStorage(GLuint renderbuffer, GLenum internalformat, GLsizei width, GLsizei height)} */
    public static native void glNamedRenderbufferStorage(@NativeType("GLuint") int renderbuffer, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

    // --- [ glNamedRenderbufferStorageMultisample ] ---

    /** {@code void glNamedRenderbufferStorageMultisample(GLuint renderbuffer, GLsizei samples, GLenum internalformat, GLsizei width, GLsizei height)} */
    public static native void glNamedRenderbufferStorageMultisample(@NativeType("GLuint") int renderbuffer, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

    // --- [ glGetNamedRenderbufferParameteriv ] ---

    /** {@code void glGetNamedRenderbufferParameteriv(GLuint renderbuffer, GLenum pname, GLint * params)} */
    public static native void nglGetNamedRenderbufferParameteriv(int renderbuffer, int pname, long params);

    /** {@code void glGetNamedRenderbufferParameteriv(GLuint renderbuffer, GLenum pname, GLint * params)} */
    public static void glGetNamedRenderbufferParameteriv(@NativeType("GLuint") int renderbuffer, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetNamedRenderbufferParameteriv(renderbuffer, pname, memAddress(params));
    }

    /** {@code void glGetNamedRenderbufferParameteriv(GLuint renderbuffer, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetNamedRenderbufferParameteri(@NativeType("GLuint") int renderbuffer, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetNamedRenderbufferParameteriv(renderbuffer, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glCreateTextures ] ---

    /** {@code void glCreateTextures(GLenum target, GLsizei n, GLuint * textures)} */
    public static native void nglCreateTextures(int target, int n, long textures);

    /** {@code void glCreateTextures(GLenum target, GLsizei n, GLuint * textures)} */
    public static void glCreateTextures(@NativeType("GLenum") int target, @NativeType("GLuint *") IntBuffer textures) {
        nglCreateTextures(target, textures.remaining(), memAddress(textures));
    }

    /** {@code void glCreateTextures(GLenum target, GLsizei n, GLuint * textures)} */
    @NativeType("void")
    public static int glCreateTextures(@NativeType("GLenum") int target) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer textures = stack.callocInt(1);
            nglCreateTextures(target, 1, memAddress(textures));
            return textures.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glTextureBuffer ] ---

    /** {@code void glTextureBuffer(GLuint texture, GLenum internalformat, GLuint buffer)} */
    public static native void glTextureBuffer(@NativeType("GLuint") int texture, @NativeType("GLenum") int internalformat, @NativeType("GLuint") int buffer);

    // --- [ glTextureBufferRange ] ---

    /** {@code void glTextureBufferRange(GLuint texture, GLenum internalformat, GLuint buffer, GLintptr offset, GLsizeiptr size)} */
    public static native void glTextureBufferRange(@NativeType("GLuint") int texture, @NativeType("GLenum") int internalformat, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size);

    // --- [ glTextureStorage1D ] ---

    /** {@code void glTextureStorage1D(GLuint texture, GLsizei levels, GLenum internalformat, GLsizei width)} */
    public static native void glTextureStorage1D(@NativeType("GLuint") int texture, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width);

    // --- [ glTextureStorage2D ] ---

    /** {@code void glTextureStorage2D(GLuint texture, GLsizei levels, GLenum internalformat, GLsizei width, GLsizei height)} */
    public static native void glTextureStorage2D(@NativeType("GLuint") int texture, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

    // --- [ glTextureStorage3D ] ---

    /** {@code void glTextureStorage3D(GLuint texture, GLsizei levels, GLenum internalformat, GLsizei width, GLsizei height, GLsizei depth)} */
    public static native void glTextureStorage3D(@NativeType("GLuint") int texture, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth);

    // --- [ glTextureStorage2DMultisample ] ---

    /** {@code void glTextureStorage2DMultisample(GLuint texture, GLsizei samples, GLenum internalformat, GLsizei width, GLsizei height, GLboolean fixedsamplelocations)} */
    public static native void glTextureStorage2DMultisample(@NativeType("GLuint") int texture, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLboolean") boolean fixedsamplelocations);

    // --- [ glTextureStorage3DMultisample ] ---

    /** {@code void glTextureStorage3DMultisample(GLuint texture, GLsizei samples, GLenum internalformat, GLsizei width, GLsizei height, GLsizei depth, GLboolean fixedsamplelocations)} */
    public static native void glTextureStorage3DMultisample(@NativeType("GLuint") int texture, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLboolean") boolean fixedsamplelocations);

    // --- [ glTextureSubImage1D ] ---

    /** {@code void glTextureSubImage1D(GLuint texture, GLint level, GLint xoffset, GLsizei width, GLenum format, GLenum type, void const * pixels)} */
    public static native void nglTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, long pixels);

    /** {@code void glTextureSubImage1D(GLuint texture, GLint level, GLint xoffset, GLsizei width, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer pixels) {
        nglTextureSubImage1D(texture, level, xoffset, width, format, type, memAddress(pixels));
    }

    /** {@code void glTextureSubImage1D(GLuint texture, GLint level, GLint xoffset, GLsizei width, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        nglTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
    }

    /** {@code void glTextureSubImage1D(GLuint texture, GLint level, GLint xoffset, GLsizei width, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ShortBuffer pixels) {
        nglTextureSubImage1D(texture, level, xoffset, width, format, type, memAddress(pixels));
    }

    /** {@code void glTextureSubImage1D(GLuint texture, GLint level, GLint xoffset, GLsizei width, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer pixels) {
        nglTextureSubImage1D(texture, level, xoffset, width, format, type, memAddress(pixels));
    }

    /** {@code void glTextureSubImage1D(GLuint texture, GLint level, GLint xoffset, GLsizei width, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") FloatBuffer pixels) {
        nglTextureSubImage1D(texture, level, xoffset, width, format, type, memAddress(pixels));
    }

    /** {@code void glTextureSubImage1D(GLuint texture, GLint level, GLint xoffset, GLsizei width, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") DoubleBuffer pixels) {
        nglTextureSubImage1D(texture, level, xoffset, width, format, type, memAddress(pixels));
    }

    // --- [ glTextureSubImage2D ] ---

    /** {@code void glTextureSubImage2D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static native void nglTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels);

    /** {@code void glTextureSubImage2D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer pixels) {
        nglTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
    }

    /** {@code void glTextureSubImage2D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        nglTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    /** {@code void glTextureSubImage2D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ShortBuffer pixels) {
        nglTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
    }

    /** {@code void glTextureSubImage2D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer pixels) {
        nglTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
    }

    /** {@code void glTextureSubImage2D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") FloatBuffer pixels) {
        nglTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
    }

    /** {@code void glTextureSubImage2D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") DoubleBuffer pixels) {
        nglTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
    }

    // --- [ glTextureSubImage3D ] ---

    /** {@code void glTextureSubImage3D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static native void nglTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels);

    /** {@code void glTextureSubImage3D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer pixels) {
        nglTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
    }

    /** {@code void glTextureSubImage3D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        nglTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    /** {@code void glTextureSubImage3D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ShortBuffer pixels) {
        nglTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
    }

    /** {@code void glTextureSubImage3D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer pixels) {
        nglTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
    }

    /** {@code void glTextureSubImage3D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") FloatBuffer pixels) {
        nglTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
    }

    /** {@code void glTextureSubImage3D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") DoubleBuffer pixels) {
        nglTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
    }

    // --- [ glCompressedTextureSubImage1D ] ---

    /** {@code void glCompressedTextureSubImage1D(GLuint texture, GLint level, GLint xoffset, GLsizei width, GLenum format, GLsizei imageSize, void const * data)} */
    public static native void nglCompressedTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int imageSize, long data);

    /** {@code void glCompressedTextureSubImage1D(GLuint texture, GLint level, GLint xoffset, GLsizei width, GLenum format, GLsizei imageSize, void const * data)} */
    public static void glCompressedTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        nglCompressedTextureSubImage1D(texture, level, xoffset, width, format, imageSize, data);
    }

    /** {@code void glCompressedTextureSubImage1D(GLuint texture, GLint level, GLint xoffset, GLsizei width, GLenum format, GLsizei imageSize, void const * data)} */
    public static void glCompressedTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("void const *") ByteBuffer data) {
        nglCompressedTextureSubImage1D(texture, level, xoffset, width, format, data.remaining(), memAddress(data));
    }

    // --- [ glCompressedTextureSubImage2D ] ---

    /** {@code void glCompressedTextureSubImage2D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLsizei imageSize, void const * data)} */
    public static native void nglCompressedTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long data);

    /** {@code void glCompressedTextureSubImage2D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLsizei imageSize, void const * data)} */
    public static void glCompressedTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        nglCompressedTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, imageSize, data);
    }

    /** {@code void glCompressedTextureSubImage2D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLsizei imageSize, void const * data)} */
    public static void glCompressedTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("void const *") ByteBuffer data) {
        nglCompressedTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, data.remaining(), memAddress(data));
    }

    // --- [ glCompressedTextureSubImage3D ] ---

    /** {@code void glCompressedTextureSubImage3D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLsizei imageSize, void const * data)} */
    public static native void nglCompressedTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data);

    /** {@code void glCompressedTextureSubImage3D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLsizei imageSize, void const * data)} */
    public static void glCompressedTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        nglCompressedTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
    }

    /** {@code void glCompressedTextureSubImage3D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLsizei imageSize, void const * data)} */
    public static void glCompressedTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("void const *") ByteBuffer data) {
        nglCompressedTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, data.remaining(), memAddress(data));
    }

    // --- [ glCopyTextureSubImage1D ] ---

    /** {@code void glCopyTextureSubImage1D(GLuint texture, GLint level, GLint xoffset, GLint x, GLint y, GLsizei width)} */
    public static native void glCopyTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width);

    // --- [ glCopyTextureSubImage2D ] ---

    /** {@code void glCopyTextureSubImage2D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint x, GLint y, GLsizei width, GLsizei height)} */
    public static native void glCopyTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

    // --- [ glCopyTextureSubImage3D ] ---

    /** {@code void glCopyTextureSubImage3D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLint x, GLint y, GLsizei width, GLsizei height)} */
    public static native void glCopyTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

    // --- [ glTextureParameterf ] ---

    /** {@code void glTextureParameterf(GLuint texture, GLenum pname, GLfloat param)} */
    public static native void glTextureParameterf(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLfloat") float param);

    // --- [ glTextureParameterfv ] ---

    /** {@code void glTextureParameterfv(GLuint texture, GLenum pname, GLfloat const * params)} */
    public static native void nglTextureParameterfv(int texture, int pname, long params);

    /** {@code void glTextureParameterfv(GLuint texture, GLenum pname, GLfloat const * params)} */
    public static void glTextureParameterfv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglTextureParameterfv(texture, pname, memAddress(params));
    }

    // --- [ glTextureParameteri ] ---

    /** {@code void glTextureParameteri(GLuint texture, GLenum pname, GLint param)} */
    public static native void glTextureParameteri(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLint") int param);

    // --- [ glTextureParameterIiv ] ---

    /** {@code void glTextureParameterIiv(GLuint texture, GLenum pname, GLint const * params)} */
    public static native void nglTextureParameterIiv(int texture, int pname, long params);

    /** {@code void glTextureParameterIiv(GLuint texture, GLenum pname, GLint const * params)} */
    public static void glTextureParameterIiv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglTextureParameterIiv(texture, pname, memAddress(params));
    }

    /** {@code void glTextureParameterIiv(GLuint texture, GLenum pname, GLint const * params)} */
    public static void glTextureParameterIi(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLint const *") int param) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.ints(param);
            nglTextureParameterIiv(texture, pname, memAddress(params));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glTextureParameterIuiv ] ---

    /** {@code void glTextureParameterIuiv(GLuint texture, GLenum pname, GLuint const * params)} */
    public static native void nglTextureParameterIuiv(int texture, int pname, long params);

    /** {@code void glTextureParameterIuiv(GLuint texture, GLenum pname, GLuint const * params)} */
    public static void glTextureParameterIuiv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLuint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglTextureParameterIuiv(texture, pname, memAddress(params));
    }

    /** {@code void glTextureParameterIuiv(GLuint texture, GLenum pname, GLuint const * params)} */
    public static void glTextureParameterIui(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLuint const *") int param) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.ints(param);
            nglTextureParameterIuiv(texture, pname, memAddress(params));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glTextureParameteriv ] ---

    /** {@code void glTextureParameteriv(GLuint texture, GLenum pname, GLint const * params)} */
    public static native void nglTextureParameteriv(int texture, int pname, long params);

    /** {@code void glTextureParameteriv(GLuint texture, GLenum pname, GLint const * params)} */
    public static void glTextureParameteriv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglTextureParameteriv(texture, pname, memAddress(params));
    }

    // --- [ glGenerateTextureMipmap ] ---

    /** {@code void glGenerateTextureMipmap(GLuint texture)} */
    public static native void glGenerateTextureMipmap(@NativeType("GLuint") int texture);

    // --- [ glBindTextureUnit ] ---

    /** {@code void glBindTextureUnit(GLuint unit, GLuint texture)} */
    public static native void glBindTextureUnit(@NativeType("GLuint") int unit, @NativeType("GLuint") int texture);

    // --- [ glGetTextureImage ] ---

    /** {@code void glGetTextureImage(GLuint texture, GLint level, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static native void nglGetTextureImage(int texture, int level, int format, int type, int bufSize, long pixels);

    /** {@code void glGetTextureImage(GLuint texture, GLint level, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glGetTextureImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("GLsizei") int bufSize, @NativeType("void *") long pixels) {
        nglGetTextureImage(texture, level, format, type, bufSize, pixels);
    }

    /** {@code void glGetTextureImage(GLuint texture, GLint level, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glGetTextureImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer pixels) {
        nglGetTextureImage(texture, level, format, type, pixels.remaining(), memAddress(pixels));
    }

    /** {@code void glGetTextureImage(GLuint texture, GLint level, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glGetTextureImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ShortBuffer pixels) {
        nglGetTextureImage(texture, level, format, type, pixels.remaining() << 1, memAddress(pixels));
    }

    /** {@code void glGetTextureImage(GLuint texture, GLint level, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glGetTextureImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") IntBuffer pixels) {
        nglGetTextureImage(texture, level, format, type, pixels.remaining() << 2, memAddress(pixels));
    }

    /** {@code void glGetTextureImage(GLuint texture, GLint level, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glGetTextureImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") FloatBuffer pixels) {
        nglGetTextureImage(texture, level, format, type, pixels.remaining() << 2, memAddress(pixels));
    }

    /** {@code void glGetTextureImage(GLuint texture, GLint level, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glGetTextureImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") DoubleBuffer pixels) {
        nglGetTextureImage(texture, level, format, type, pixels.remaining() << 3, memAddress(pixels));
    }

    // --- [ glGetCompressedTextureImage ] ---

    /** {@code void glGetCompressedTextureImage(GLuint texture, GLint level, GLsizei bufSize, void * pixels)} */
    public static native void nglGetCompressedTextureImage(int texture, int level, int bufSize, long pixels);

    /** {@code void glGetCompressedTextureImage(GLuint texture, GLint level, GLsizei bufSize, void * pixels)} */
    public static void glGetCompressedTextureImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLsizei") int bufSize, @NativeType("void *") long pixels) {
        nglGetCompressedTextureImage(texture, level, bufSize, pixels);
    }

    /** {@code void glGetCompressedTextureImage(GLuint texture, GLint level, GLsizei bufSize, void * pixels)} */
    public static void glGetCompressedTextureImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("void *") ByteBuffer pixels) {
        if (CHECKS) {
            if (DEBUG) {
                check(pixels, glGetTextureLevelParameteri(texture, level, GL13.GL_TEXTURE_COMPRESSED_IMAGE_SIZE));
            }
        }
        nglGetCompressedTextureImage(texture, level, pixels.remaining(), memAddress(pixels));
    }

    // --- [ glGetTextureLevelParameterfv ] ---

    /** {@code void glGetTextureLevelParameterfv(GLuint texture, GLint level, GLenum pname, GLfloat * params)} */
    public static native void nglGetTextureLevelParameterfv(int texture, int level, int pname, long params);

    /** {@code void glGetTextureLevelParameterfv(GLuint texture, GLint level, GLenum pname, GLfloat * params)} */
    public static void glGetTextureLevelParameterfv(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetTextureLevelParameterfv(texture, level, pname, memAddress(params));
    }

    /** {@code void glGetTextureLevelParameterfv(GLuint texture, GLint level, GLenum pname, GLfloat * params)} */
    @NativeType("void")
    public static float glGetTextureLevelParameterf(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetTextureLevelParameterfv(texture, level, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetTextureLevelParameteriv ] ---

    /** {@code void glGetTextureLevelParameteriv(GLuint texture, GLint level, GLenum pname, GLint * params)} */
    public static native void nglGetTextureLevelParameteriv(int texture, int level, int pname, long params);

    /** {@code void glGetTextureLevelParameteriv(GLuint texture, GLint level, GLenum pname, GLint * params)} */
    public static void glGetTextureLevelParameteriv(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetTextureLevelParameteriv(texture, level, pname, memAddress(params));
    }

    /** {@code void glGetTextureLevelParameteriv(GLuint texture, GLint level, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetTextureLevelParameteri(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetTextureLevelParameteriv(texture, level, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetTextureParameterfv ] ---

    /** {@code void glGetTextureParameterfv(GLuint texture, GLenum pname, GLfloat * params)} */
    public static native void nglGetTextureParameterfv(int texture, int pname, long params);

    /** {@code void glGetTextureParameterfv(GLuint texture, GLenum pname, GLfloat * params)} */
    public static void glGetTextureParameterfv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetTextureParameterfv(texture, pname, memAddress(params));
    }

    /** {@code void glGetTextureParameterfv(GLuint texture, GLenum pname, GLfloat * params)} */
    @NativeType("void")
    public static float glGetTextureParameterf(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetTextureParameterfv(texture, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetTextureParameterIiv ] ---

    /** {@code void glGetTextureParameterIiv(GLuint texture, GLenum pname, GLint * params)} */
    public static native void nglGetTextureParameterIiv(int texture, int pname, long params);

    /** {@code void glGetTextureParameterIiv(GLuint texture, GLenum pname, GLint * params)} */
    public static void glGetTextureParameterIiv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetTextureParameterIiv(texture, pname, memAddress(params));
    }

    /** {@code void glGetTextureParameterIiv(GLuint texture, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetTextureParameterIi(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetTextureParameterIiv(texture, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetTextureParameterIuiv ] ---

    /** {@code void glGetTextureParameterIuiv(GLuint texture, GLenum pname, GLuint * params)} */
    public static native void nglGetTextureParameterIuiv(int texture, int pname, long params);

    /** {@code void glGetTextureParameterIuiv(GLuint texture, GLenum pname, GLuint * params)} */
    public static void glGetTextureParameterIuiv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLuint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetTextureParameterIuiv(texture, pname, memAddress(params));
    }

    /** {@code void glGetTextureParameterIuiv(GLuint texture, GLenum pname, GLuint * params)} */
    @NativeType("void")
    public static int glGetTextureParameterIui(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetTextureParameterIuiv(texture, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetTextureParameteriv ] ---

    /** {@code void glGetTextureParameteriv(GLuint texture, GLenum pname, GLint * params)} */
    public static native void nglGetTextureParameteriv(int texture, int pname, long params);

    /** {@code void glGetTextureParameteriv(GLuint texture, GLenum pname, GLint * params)} */
    public static void glGetTextureParameteriv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetTextureParameteriv(texture, pname, memAddress(params));
    }

    /** {@code void glGetTextureParameteriv(GLuint texture, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetTextureParameteri(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetTextureParameteriv(texture, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glCreateVertexArrays ] ---

    /** {@code void glCreateVertexArrays(GLsizei n, GLuint * arrays)} */
    public static native void nglCreateVertexArrays(int n, long arrays);

    /** {@code void glCreateVertexArrays(GLsizei n, GLuint * arrays)} */
    public static void glCreateVertexArrays(@NativeType("GLuint *") IntBuffer arrays) {
        nglCreateVertexArrays(arrays.remaining(), memAddress(arrays));
    }

    /** {@code void glCreateVertexArrays(GLsizei n, GLuint * arrays)} */
    @NativeType("void")
    public static int glCreateVertexArrays() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer arrays = stack.callocInt(1);
            nglCreateVertexArrays(1, memAddress(arrays));
            return arrays.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glDisableVertexArrayAttrib ] ---

    /** {@code void glDisableVertexArrayAttrib(GLuint vaobj, GLuint index)} */
    public static native void glDisableVertexArrayAttrib(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index);

    // --- [ glEnableVertexArrayAttrib ] ---

    /** {@code void glEnableVertexArrayAttrib(GLuint vaobj, GLuint index)} */
    public static native void glEnableVertexArrayAttrib(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index);

    // --- [ glVertexArrayElementBuffer ] ---

    /** {@code void glVertexArrayElementBuffer(GLuint vaobj, GLuint buffer)} */
    public static native void glVertexArrayElementBuffer(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int buffer);

    // --- [ glVertexArrayVertexBuffer ] ---

    /** {@code void glVertexArrayVertexBuffer(GLuint vaobj, GLuint bindingindex, GLuint buffer, GLintptr offset, GLsizei stride)} */
    public static native void glVertexArrayVertexBuffer(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int bindingindex, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizei") int stride);

    // --- [ glVertexArrayVertexBuffers ] ---

    /** {@code void glVertexArrayVertexBuffers(GLuint vaobj, GLuint first, GLsizei count, GLuint const * buffers, GLintptr const * offsets, GLsizei const * strides)} */
    public static native void nglVertexArrayVertexBuffers(int vaobj, int first, int count, long buffers, long offsets, long strides);

    /** {@code void glVertexArrayVertexBuffers(GLuint vaobj, GLuint first, GLsizei count, GLuint const * buffers, GLintptr const * offsets, GLsizei const * strides)} */
    public static void glVertexArrayVertexBuffers(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int first, @NativeType("GLuint const *") @Nullable IntBuffer buffers, @NativeType("GLintptr const *") @Nullable PointerBuffer offsets, @NativeType("GLsizei const *") @Nullable IntBuffer strides) {
        if (CHECKS) {
            checkSafe(offsets, remainingSafe(buffers));
            checkSafe(strides, remainingSafe(buffers));
        }
        nglVertexArrayVertexBuffers(vaobj, first, remainingSafe(buffers), memAddressSafe(buffers), memAddressSafe(offsets), memAddressSafe(strides));
    }

    // --- [ glVertexArrayAttribFormat ] ---

    /** {@code void glVertexArrayAttribFormat(GLuint vaobj, GLuint attribindex, GLint size, GLenum type, GLboolean normalized, GLuint relativeoffset)} */
    public static native void glVertexArrayAttribFormat(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int attribindex, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint") int relativeoffset);

    // --- [ glVertexArrayAttribIFormat ] ---

    /** {@code void glVertexArrayAttribIFormat(GLuint vaobj, GLuint attribindex, GLint size, GLenum type, GLuint relativeoffset)} */
    public static native void glVertexArrayAttribIFormat(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int attribindex, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLuint") int relativeoffset);

    // --- [ glVertexArrayAttribLFormat ] ---

    /** {@code void glVertexArrayAttribLFormat(GLuint vaobj, GLuint attribindex, GLint size, GLenum type, GLuint relativeoffset)} */
    public static native void glVertexArrayAttribLFormat(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int attribindex, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLuint") int relativeoffset);

    // --- [ glVertexArrayAttribBinding ] ---

    /** {@code void glVertexArrayAttribBinding(GLuint vaobj, GLuint attribindex, GLuint bindingindex)} */
    public static native void glVertexArrayAttribBinding(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int attribindex, @NativeType("GLuint") int bindingindex);

    // --- [ glVertexArrayBindingDivisor ] ---

    /** {@code void glVertexArrayBindingDivisor(GLuint vaobj, GLuint bindingindex, GLuint divisor)} */
    public static native void glVertexArrayBindingDivisor(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int bindingindex, @NativeType("GLuint") int divisor);

    // --- [ glGetVertexArrayiv ] ---

    /** {@code void glGetVertexArrayiv(GLuint vaobj, GLenum pname, GLint * param)} */
    public static native void nglGetVertexArrayiv(int vaobj, int pname, long param);

    /** {@code void glGetVertexArrayiv(GLuint vaobj, GLenum pname, GLint * param)} */
    public static void glGetVertexArrayiv(@NativeType("GLuint") int vaobj, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer param) {
        if (CHECKS) {
            check(param, 1);
        }
        nglGetVertexArrayiv(vaobj, pname, memAddress(param));
    }

    /** {@code void glGetVertexArrayiv(GLuint vaobj, GLenum pname, GLint * param)} */
    @NativeType("void")
    public static int glGetVertexArrayi(@NativeType("GLuint") int vaobj, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer param = stack.callocInt(1);
            nglGetVertexArrayiv(vaobj, pname, memAddress(param));
            return param.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetVertexArrayIndexediv ] ---

    /** {@code void glGetVertexArrayIndexediv(GLuint vaobj, GLuint index, GLenum pname, GLint * param)} */
    public static native void nglGetVertexArrayIndexediv(int vaobj, int index, int pname, long param);

    /** {@code void glGetVertexArrayIndexediv(GLuint vaobj, GLuint index, GLenum pname, GLint * param)} */
    public static void glGetVertexArrayIndexediv(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer param) {
        if (CHECKS) {
            check(param, 1);
        }
        nglGetVertexArrayIndexediv(vaobj, index, pname, memAddress(param));
    }

    /** {@code void glGetVertexArrayIndexediv(GLuint vaobj, GLuint index, GLenum pname, GLint * param)} */
    @NativeType("void")
    public static int glGetVertexArrayIndexedi(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer param = stack.callocInt(1);
            nglGetVertexArrayIndexediv(vaobj, index, pname, memAddress(param));
            return param.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetVertexArrayIndexed64iv ] ---

    /** {@code void glGetVertexArrayIndexed64iv(GLuint vaobj, GLuint index, GLenum pname, GLint64 * param)} */
    public static native void nglGetVertexArrayIndexed64iv(int vaobj, int index, int pname, long param);

    /** {@code void glGetVertexArrayIndexed64iv(GLuint vaobj, GLuint index, GLenum pname, GLint64 * param)} */
    public static void glGetVertexArrayIndexed64iv(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint64 *") LongBuffer param) {
        if (CHECKS) {
            check(param, 1);
        }
        nglGetVertexArrayIndexed64iv(vaobj, index, pname, memAddress(param));
    }

    /** {@code void glGetVertexArrayIndexed64iv(GLuint vaobj, GLuint index, GLenum pname, GLint64 * param)} */
    @NativeType("void")
    public static long glGetVertexArrayIndexed64i(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer param = stack.callocLong(1);
            nglGetVertexArrayIndexed64iv(vaobj, index, pname, memAddress(param));
            return param.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glCreateSamplers ] ---

    /** {@code void glCreateSamplers(GLsizei n, GLuint * samplers)} */
    public static native void nglCreateSamplers(int n, long samplers);

    /** {@code void glCreateSamplers(GLsizei n, GLuint * samplers)} */
    public static void glCreateSamplers(@NativeType("GLuint *") IntBuffer samplers) {
        nglCreateSamplers(samplers.remaining(), memAddress(samplers));
    }

    /** {@code void glCreateSamplers(GLsizei n, GLuint * samplers)} */
    @NativeType("void")
    public static int glCreateSamplers() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer samplers = stack.callocInt(1);
            nglCreateSamplers(1, memAddress(samplers));
            return samplers.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glCreateProgramPipelines ] ---

    /** {@code void glCreateProgramPipelines(GLsizei n, GLuint * pipelines)} */
    public static native void nglCreateProgramPipelines(int n, long pipelines);

    /** {@code void glCreateProgramPipelines(GLsizei n, GLuint * pipelines)} */
    public static void glCreateProgramPipelines(@NativeType("GLuint *") IntBuffer pipelines) {
        nglCreateProgramPipelines(pipelines.remaining(), memAddress(pipelines));
    }

    /** {@code void glCreateProgramPipelines(GLsizei n, GLuint * pipelines)} */
    @NativeType("void")
    public static int glCreateProgramPipelines() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer pipelines = stack.callocInt(1);
            nglCreateProgramPipelines(1, memAddress(pipelines));
            return pipelines.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glCreateQueries ] ---

    /** {@code void glCreateQueries(GLenum target, GLsizei n, GLuint * ids)} */
    public static native void nglCreateQueries(int target, int n, long ids);

    /** {@code void glCreateQueries(GLenum target, GLsizei n, GLuint * ids)} */
    public static void glCreateQueries(@NativeType("GLenum") int target, @NativeType("GLuint *") IntBuffer ids) {
        nglCreateQueries(target, ids.remaining(), memAddress(ids));
    }

    /** {@code void glCreateQueries(GLenum target, GLsizei n, GLuint * ids)} */
    @NativeType("void")
    public static int glCreateQueries(@NativeType("GLenum") int target) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer ids = stack.callocInt(1);
            nglCreateQueries(target, 1, memAddress(ids));
            return ids.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetQueryBufferObjectiv ] ---

    /** {@code void glGetQueryBufferObjectiv(GLuint id, GLuint buffer, GLenum pname, GLintptr offset)} */
    public static native void glGetQueryBufferObjectiv(@NativeType("GLuint") int id, @NativeType("GLuint") int buffer, @NativeType("GLenum") int pname, @NativeType("GLintptr") long offset);

    // --- [ glGetQueryBufferObjectuiv ] ---

    /** {@code void glGetQueryBufferObjectuiv(GLuint id, GLuint buffer, GLenum pname, GLintptr offset)} */
    public static native void glGetQueryBufferObjectuiv(@NativeType("GLuint") int id, @NativeType("GLuint") int buffer, @NativeType("GLenum") int pname, @NativeType("GLintptr") long offset);

    // --- [ glGetQueryBufferObjecti64v ] ---

    /** {@code void glGetQueryBufferObjecti64v(GLuint id, GLuint buffer, GLenum pname, GLintptr offset)} */
    public static native void glGetQueryBufferObjecti64v(@NativeType("GLuint") int id, @NativeType("GLuint") int buffer, @NativeType("GLenum") int pname, @NativeType("GLintptr") long offset);

    // --- [ glGetQueryBufferObjectui64v ] ---

    /** {@code void glGetQueryBufferObjectui64v(GLuint id, GLuint buffer, GLenum pname, GLintptr offset)} */
    public static native void glGetQueryBufferObjectui64v(@NativeType("GLuint") int id, @NativeType("GLuint") int buffer, @NativeType("GLenum") int pname, @NativeType("GLintptr") long offset);

    // --- [ glMemoryBarrierByRegion ] ---

    /** {@code void glMemoryBarrierByRegion(GLbitfield barriers)} */
    public static native void glMemoryBarrierByRegion(@NativeType("GLbitfield") int barriers);

    // --- [ glGetTextureSubImage ] ---

    /** {@code void glGetTextureSubImage(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static native void nglGetTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int bufSize, long pixels);

    /** {@code void glGetTextureSubImage(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glGetTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("GLsizei") int bufSize, @NativeType("void *") long pixels) {
        nglGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, bufSize, pixels);
    }

    /** {@code void glGetTextureSubImage(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glGetTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer pixels) {
        nglGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels.remaining(), memAddress(pixels));
    }

    /** {@code void glGetTextureSubImage(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glGetTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ShortBuffer pixels) {
        nglGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels.remaining() << 1, memAddress(pixels));
    }

    /** {@code void glGetTextureSubImage(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glGetTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") IntBuffer pixels) {
        nglGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels.remaining() << 2, memAddress(pixels));
    }

    /** {@code void glGetTextureSubImage(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glGetTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") FloatBuffer pixels) {
        nglGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels.remaining() << 2, memAddress(pixels));
    }

    /** {@code void glGetTextureSubImage(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glGetTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") DoubleBuffer pixels) {
        nglGetTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels.remaining() << 3, memAddress(pixels));
    }

    // --- [ glGetCompressedTextureSubImage ] ---

    /** {@code void glGetCompressedTextureSubImage(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLsizei bufSize, void * pixels)} */
    public static native void nglGetCompressedTextureSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int bufSize, long pixels);

    /** {@code void glGetCompressedTextureSubImage(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLsizei bufSize, void * pixels)} */
    public static void glGetCompressedTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLsizei") int bufSize, @NativeType("void *") long pixels) {
        nglGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, bufSize, pixels);
    }

    /** {@code void glGetCompressedTextureSubImage(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLsizei bufSize, void * pixels)} */
    public static void glGetCompressedTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("void *") ByteBuffer pixels) {
        nglGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels.remaining(), memAddress(pixels));
    }

    /** {@code void glGetCompressedTextureSubImage(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLsizei bufSize, void * pixels)} */
    public static void glGetCompressedTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("void *") ShortBuffer pixels) {
        nglGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels.remaining() << 1, memAddress(pixels));
    }

    /** {@code void glGetCompressedTextureSubImage(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLsizei bufSize, void * pixels)} */
    public static void glGetCompressedTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("void *") IntBuffer pixels) {
        nglGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels.remaining() << 2, memAddress(pixels));
    }

    /** {@code void glGetCompressedTextureSubImage(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLsizei bufSize, void * pixels)} */
    public static void glGetCompressedTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("void *") FloatBuffer pixels) {
        nglGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels.remaining() << 2, memAddress(pixels));
    }

    /** {@code void glGetCompressedTextureSubImage(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLsizei bufSize, void * pixels)} */
    public static void glGetCompressedTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("void *") DoubleBuffer pixels) {
        nglGetCompressedTextureSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels.remaining() << 3, memAddress(pixels));
    }

    // --- [ glTextureBarrier ] ---

    /** {@code void glTextureBarrier(void)} */
    public static native void glTextureBarrier();

    // --- [ glGetGraphicsResetStatus ] ---

    /** {@code GLenum glGetGraphicsResetStatus(void)} */
    @NativeType("GLenum")
    public static native int glGetGraphicsResetStatus();

    // --- [ glGetnTexImage ] ---

    /** {@code void glGetnTexImage(GLenum tex, GLint level, GLenum format, GLenum type, GLsizei bufSize, void * img)} */
    public static native void nglGetnTexImage(int tex, int level, int format, int type, int bufSize, long img);

    /** {@code void glGetnTexImage(GLenum tex, GLint level, GLenum format, GLenum type, GLsizei bufSize, void * img)} */
    public static void glGetnTexImage(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("GLsizei") int bufSize, @NativeType("void *") long img) {
        nglGetnTexImage(tex, level, format, type, bufSize, img);
    }

    /** {@code void glGetnTexImage(GLenum tex, GLint level, GLenum format, GLenum type, GLsizei bufSize, void * img)} */
    public static void glGetnTexImage(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer img) {
        nglGetnTexImage(tex, level, format, type, img.remaining(), memAddress(img));
    }

    /** {@code void glGetnTexImage(GLenum tex, GLint level, GLenum format, GLenum type, GLsizei bufSize, void * img)} */
    public static void glGetnTexImage(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ShortBuffer img) {
        nglGetnTexImage(tex, level, format, type, img.remaining() << 1, memAddress(img));
    }

    /** {@code void glGetnTexImage(GLenum tex, GLint level, GLenum format, GLenum type, GLsizei bufSize, void * img)} */
    public static void glGetnTexImage(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") IntBuffer img) {
        nglGetnTexImage(tex, level, format, type, img.remaining() << 2, memAddress(img));
    }

    /** {@code void glGetnTexImage(GLenum tex, GLint level, GLenum format, GLenum type, GLsizei bufSize, void * img)} */
    public static void glGetnTexImage(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") FloatBuffer img) {
        nglGetnTexImage(tex, level, format, type, img.remaining() << 2, memAddress(img));
    }

    /** {@code void glGetnTexImage(GLenum tex, GLint level, GLenum format, GLenum type, GLsizei bufSize, void * img)} */
    public static void glGetnTexImage(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") DoubleBuffer img) {
        nglGetnTexImage(tex, level, format, type, img.remaining() << 3, memAddress(img));
    }

    // --- [ glReadnPixels ] ---

    /** {@code void glReadnPixels(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static native void nglReadnPixels(int x, int y, int width, int height, int format, int type, int bufSize, long pixels);

    /** {@code void glReadnPixels(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glReadnPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("GLsizei") int bufSize, @NativeType("void *") long pixels) {
        nglReadnPixels(x, y, width, height, format, type, bufSize, pixels);
    }

    /** {@code void glReadnPixels(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glReadnPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer pixels) {
        nglReadnPixels(x, y, width, height, format, type, pixels.remaining(), memAddress(pixels));
    }

    /** {@code void glReadnPixels(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glReadnPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ShortBuffer pixels) {
        nglReadnPixels(x, y, width, height, format, type, pixels.remaining() << 1, memAddress(pixels));
    }

    /** {@code void glReadnPixels(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glReadnPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") IntBuffer pixels) {
        nglReadnPixels(x, y, width, height, format, type, pixels.remaining() << 2, memAddress(pixels));
    }

    /** {@code void glReadnPixels(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glReadnPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") FloatBuffer pixels) {
        nglReadnPixels(x, y, width, height, format, type, pixels.remaining() << 2, memAddress(pixels));
    }

    // --- [ glGetnCompressedTexImage ] ---

    /** {@code void glGetnCompressedTexImage(GLenum target, GLint level, GLsizei bufSize, void * img)} */
    public static native void nglGetnCompressedTexImage(int target, int level, int bufSize, long img);

    /** {@code void glGetnCompressedTexImage(GLenum target, GLint level, GLsizei bufSize, void * img)} */
    public static void glGetnCompressedTexImage(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLsizei") int bufSize, @NativeType("void *") long img) {
        nglGetnCompressedTexImage(target, level, bufSize, img);
    }

    /** {@code void glGetnCompressedTexImage(GLenum target, GLint level, GLsizei bufSize, void * img)} */
    public static void glGetnCompressedTexImage(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("void *") ByteBuffer img) {
        if (CHECKS) {
            if (DEBUG) {
                check(img, GL11.glGetTexLevelParameteri(target, level, GL13.GL_TEXTURE_COMPRESSED_IMAGE_SIZE));
            }
        }
        nglGetnCompressedTexImage(target, level, img.remaining(), memAddress(img));
    }

    // --- [ glGetnUniformfv ] ---

    /** {@code void glGetnUniformfv(GLuint program, GLint location, GLsizei bufSize, GLfloat * params)} */
    public static native void nglGetnUniformfv(int program, int location, int bufSize, long params);

    /** {@code void glGetnUniformfv(GLuint program, GLint location, GLsizei bufSize, GLfloat * params)} */
    public static void glGetnUniformfv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat *") FloatBuffer params) {
        nglGetnUniformfv(program, location, params.remaining(), memAddress(params));
    }

    /** {@code void glGetnUniformfv(GLuint program, GLint location, GLsizei bufSize, GLfloat * params)} */
    @NativeType("void")
    public static float glGetnUniformf(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetnUniformfv(program, location, 1, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetnUniformdv ] ---

    /** {@code void glGetnUniformdv(GLuint program, GLint location, GLsizei bufSize, GLdouble * params)} */
    public static native void nglGetnUniformdv(int program, int location, int bufSize, long params);

    /** {@code void glGetnUniformdv(GLuint program, GLint location, GLsizei bufSize, GLdouble * params)} */
    public static void glGetnUniformdv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble *") DoubleBuffer params) {
        nglGetnUniformdv(program, location, params.remaining(), memAddress(params));
    }

    /** {@code void glGetnUniformdv(GLuint program, GLint location, GLsizei bufSize, GLdouble * params)} */
    @NativeType("void")
    public static double glGetnUniformd(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            DoubleBuffer params = stack.callocDouble(1);
            nglGetnUniformdv(program, location, 1, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetnUniformiv ] ---

    /** {@code void glGetnUniformiv(GLuint program, GLint location, GLsizei bufSize, GLint * params)} */
    public static native void nglGetnUniformiv(int program, int location, int bufSize, long params);

    /** {@code void glGetnUniformiv(GLuint program, GLint location, GLsizei bufSize, GLint * params)} */
    public static void glGetnUniformiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint *") IntBuffer params) {
        nglGetnUniformiv(program, location, params.remaining(), memAddress(params));
    }

    /** {@code void glGetnUniformiv(GLuint program, GLint location, GLsizei bufSize, GLint * params)} */
    @NativeType("void")
    public static int glGetnUniformi(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetnUniformiv(program, location, 1, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetnUniformuiv ] ---

    /** {@code void glGetnUniformuiv(GLuint program, GLint location, GLsizei bufSize, GLuint * params)} */
    public static native void nglGetnUniformuiv(int program, int location, int bufSize, long params);

    /** {@code void glGetnUniformuiv(GLuint program, GLint location, GLsizei bufSize, GLuint * params)} */
    public static void glGetnUniformuiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint *") IntBuffer params) {
        nglGetnUniformuiv(program, location, params.remaining(), memAddress(params));
    }

    /** {@code void glGetnUniformuiv(GLuint program, GLint location, GLsizei bufSize, GLuint * params)} */
    @NativeType("void")
    public static int glGetnUniformui(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetnUniformuiv(program, location, 1, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glCreateTransformFeedbacks(GLsizei n, GLuint * ids)} */
    public static void glCreateTransformFeedbacks(@NativeType("GLuint *") int[] ids) {
        long __functionAddress = GL.getICD().glCreateTransformFeedbacks;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(ids.length, ids, __functionAddress);
    }

    /** {@code void glGetTransformFeedbackiv(GLuint xfb, GLenum pname, GLint * param)} */
    public static void glGetTransformFeedbackiv(@NativeType("GLuint") int xfb, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] param) {
        long __functionAddress = GL.getICD().glGetTransformFeedbackiv;
        if (CHECKS) {
            check(__functionAddress);
            check(param, 1);
        }
        callPV(xfb, pname, param, __functionAddress);
    }

    /** {@code void glGetTransformFeedbacki_v(GLuint xfb, GLenum pname, GLuint index, GLint * param)} */
    public static void glGetTransformFeedbacki_v(@NativeType("GLuint") int xfb, @NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLint *") int[] param) {
        long __functionAddress = GL.getICD().glGetTransformFeedbacki_v;
        if (CHECKS) {
            check(__functionAddress);
            check(param, 1);
        }
        callPV(xfb, pname, index, param, __functionAddress);
    }

    /** {@code void glGetTransformFeedbacki64_v(GLuint xfb, GLenum pname, GLuint index, GLint64 * param)} */
    public static void glGetTransformFeedbacki64_v(@NativeType("GLuint") int xfb, @NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLint64 *") long[] param) {
        long __functionAddress = GL.getICD().glGetTransformFeedbacki64_v;
        if (CHECKS) {
            check(__functionAddress);
            check(param, 1);
        }
        callPV(xfb, pname, index, param, __functionAddress);
    }

    /** {@code void glCreateBuffers(GLsizei n, GLuint * buffers)} */
    public static void glCreateBuffers(@NativeType("GLuint *") int[] buffers) {
        long __functionAddress = GL.getICD().glCreateBuffers;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(buffers.length, buffers, __functionAddress);
    }

    /** {@code void glNamedBufferStorage(GLuint buffer, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glNamedBufferStorage(@NativeType("GLuint") int buffer, @NativeType("void const *") short[] data, @NativeType("GLbitfield") int flags) {
        long __functionAddress = GL.getICD().glNamedBufferStorage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(buffer, Integer.toUnsignedLong(data.length) << 1, data, flags, __functionAddress);
    }

    /** {@code void glNamedBufferStorage(GLuint buffer, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glNamedBufferStorage(@NativeType("GLuint") int buffer, @NativeType("void const *") int[] data, @NativeType("GLbitfield") int flags) {
        long __functionAddress = GL.getICD().glNamedBufferStorage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(buffer, Integer.toUnsignedLong(data.length) << 2, data, flags, __functionAddress);
    }

    /** {@code void glNamedBufferStorage(GLuint buffer, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glNamedBufferStorage(@NativeType("GLuint") int buffer, @NativeType("void const *") float[] data, @NativeType("GLbitfield") int flags) {
        long __functionAddress = GL.getICD().glNamedBufferStorage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(buffer, Integer.toUnsignedLong(data.length) << 2, data, flags, __functionAddress);
    }

    /** {@code void glNamedBufferStorage(GLuint buffer, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glNamedBufferStorage(@NativeType("GLuint") int buffer, @NativeType("void const *") double[] data, @NativeType("GLbitfield") int flags) {
        long __functionAddress = GL.getICD().glNamedBufferStorage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(buffer, Integer.toUnsignedLong(data.length) << 3, data, flags, __functionAddress);
    }

    /** {@code void glNamedBufferData(GLuint buffer, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("void const *") short[] data, @NativeType("GLenum") int usage) {
        long __functionAddress = GL.getICD().glNamedBufferData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(buffer, Integer.toUnsignedLong(data.length) << 1, data, usage, __functionAddress);
    }

    /** {@code void glNamedBufferData(GLuint buffer, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("void const *") int[] data, @NativeType("GLenum") int usage) {
        long __functionAddress = GL.getICD().glNamedBufferData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(buffer, Integer.toUnsignedLong(data.length) << 2, data, usage, __functionAddress);
    }

    /** {@code void glNamedBufferData(GLuint buffer, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("void const *") long[] data, @NativeType("GLenum") int usage) {
        long __functionAddress = GL.getICD().glNamedBufferData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(buffer, Integer.toUnsignedLong(data.length) << 3, data, usage, __functionAddress);
    }

    /** {@code void glNamedBufferData(GLuint buffer, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("void const *") float[] data, @NativeType("GLenum") int usage) {
        long __functionAddress = GL.getICD().glNamedBufferData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(buffer, Integer.toUnsignedLong(data.length) << 2, data, usage, __functionAddress);
    }

    /** {@code void glNamedBufferData(GLuint buffer, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("void const *") double[] data, @NativeType("GLenum") int usage) {
        long __functionAddress = GL.getICD().glNamedBufferData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(buffer, Integer.toUnsignedLong(data.length) << 3, data, usage, __functionAddress);
    }

    /** {@code void glNamedBufferSubData(GLuint buffer, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") short[] data) {
        long __functionAddress = GL.getICD().glNamedBufferSubData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(buffer, offset, Integer.toUnsignedLong(data.length) << 1, data, __functionAddress);
    }

    /** {@code void glNamedBufferSubData(GLuint buffer, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") int[] data) {
        long __functionAddress = GL.getICD().glNamedBufferSubData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(buffer, offset, Integer.toUnsignedLong(data.length) << 2, data, __functionAddress);
    }

    /** {@code void glNamedBufferSubData(GLuint buffer, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") long[] data) {
        long __functionAddress = GL.getICD().glNamedBufferSubData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(buffer, offset, Integer.toUnsignedLong(data.length) << 3, data, __functionAddress);
    }

    /** {@code void glNamedBufferSubData(GLuint buffer, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") float[] data) {
        long __functionAddress = GL.getICD().glNamedBufferSubData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(buffer, offset, Integer.toUnsignedLong(data.length) << 2, data, __functionAddress);
    }

    /** {@code void glNamedBufferSubData(GLuint buffer, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") double[] data) {
        long __functionAddress = GL.getICD().glNamedBufferSubData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(buffer, offset, Integer.toUnsignedLong(data.length) << 3, data, __functionAddress);
    }

    /** {@code void glClearNamedBufferData(GLuint buffer, GLenum internalformat, GLenum format, GLenum type, void const * data)} */
    public static void glClearNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short @Nullable [] data) {
        long __functionAddress = GL.getICD().glClearNamedBufferData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(buffer, internalformat, format, type, data, __functionAddress);
    }

    /** {@code void glClearNamedBufferData(GLuint buffer, GLenum internalformat, GLenum format, GLenum type, void const * data)} */
    public static void glClearNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int @Nullable [] data) {
        long __functionAddress = GL.getICD().glClearNamedBufferData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(buffer, internalformat, format, type, data, __functionAddress);
    }

    /** {@code void glClearNamedBufferData(GLuint buffer, GLenum internalformat, GLenum format, GLenum type, void const * data)} */
    public static void glClearNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float @Nullable [] data) {
        long __functionAddress = GL.getICD().glClearNamedBufferData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(buffer, internalformat, format, type, data, __functionAddress);
    }

    /** {@code void glClearNamedBufferSubData(GLuint buffer, GLenum internalformat, GLintptr offset, GLsizeiptr size, GLenum format, GLenum type, void const * data)} */
    public static void glClearNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short @Nullable [] data) {
        long __functionAddress = GL.getICD().glClearNamedBufferSubData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(buffer, internalformat, offset, size, format, type, data, __functionAddress);
    }

    /** {@code void glClearNamedBufferSubData(GLuint buffer, GLenum internalformat, GLintptr offset, GLsizeiptr size, GLenum format, GLenum type, void const * data)} */
    public static void glClearNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int @Nullable [] data) {
        long __functionAddress = GL.getICD().glClearNamedBufferSubData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(buffer, internalformat, offset, size, format, type, data, __functionAddress);
    }

    /** {@code void glClearNamedBufferSubData(GLuint buffer, GLenum internalformat, GLintptr offset, GLsizeiptr size, GLenum format, GLenum type, void const * data)} */
    public static void glClearNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float @Nullable [] data) {
        long __functionAddress = GL.getICD().glClearNamedBufferSubData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(buffer, internalformat, offset, size, format, type, data, __functionAddress);
    }

    /** {@code void glGetNamedBufferParameteriv(GLuint buffer, GLenum pname, GLint * params)} */
    public static void glGetNamedBufferParameteriv(@NativeType("GLuint") int buffer, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetNamedBufferParameteriv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(buffer, pname, params, __functionAddress);
    }

    /** {@code void glGetNamedBufferParameteri64v(GLuint buffer, GLenum pname, GLint64 * params)} */
    public static void glGetNamedBufferParameteri64v(@NativeType("GLuint") int buffer, @NativeType("GLenum") int pname, @NativeType("GLint64 *") long[] params) {
        long __functionAddress = GL.getICD().glGetNamedBufferParameteri64v;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(buffer, pname, params, __functionAddress);
    }

    /** {@code void glGetNamedBufferSubData(GLuint buffer, GLintptr offset, GLsizeiptr size, void * data)} */
    public static void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") short[] data) {
        long __functionAddress = GL.getICD().glGetNamedBufferSubData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(buffer, offset, Integer.toUnsignedLong(data.length) << 1, data, __functionAddress);
    }

    /** {@code void glGetNamedBufferSubData(GLuint buffer, GLintptr offset, GLsizeiptr size, void * data)} */
    public static void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") int[] data) {
        long __functionAddress = GL.getICD().glGetNamedBufferSubData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(buffer, offset, Integer.toUnsignedLong(data.length) << 2, data, __functionAddress);
    }

    /** {@code void glGetNamedBufferSubData(GLuint buffer, GLintptr offset, GLsizeiptr size, void * data)} */
    public static void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") long[] data) {
        long __functionAddress = GL.getICD().glGetNamedBufferSubData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(buffer, offset, Integer.toUnsignedLong(data.length) << 3, data, __functionAddress);
    }

    /** {@code void glGetNamedBufferSubData(GLuint buffer, GLintptr offset, GLsizeiptr size, void * data)} */
    public static void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") float[] data) {
        long __functionAddress = GL.getICD().glGetNamedBufferSubData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(buffer, offset, Integer.toUnsignedLong(data.length) << 2, data, __functionAddress);
    }

    /** {@code void glGetNamedBufferSubData(GLuint buffer, GLintptr offset, GLsizeiptr size, void * data)} */
    public static void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") double[] data) {
        long __functionAddress = GL.getICD().glGetNamedBufferSubData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(buffer, offset, Integer.toUnsignedLong(data.length) << 3, data, __functionAddress);
    }

    /** {@code void glCreateFramebuffers(GLsizei n, GLuint * framebuffers)} */
    public static void glCreateFramebuffers(@NativeType("GLuint *") int[] framebuffers) {
        long __functionAddress = GL.getICD().glCreateFramebuffers;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(framebuffers.length, framebuffers, __functionAddress);
    }

    /** {@code void glNamedFramebufferDrawBuffers(GLuint framebuffer, GLsizei n, GLenum const * bufs)} */
    public static void glNamedFramebufferDrawBuffers(@NativeType("GLuint") int framebuffer, @NativeType("GLenum const *") int[] bufs) {
        long __functionAddress = GL.getICD().glNamedFramebufferDrawBuffers;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(framebuffer, bufs.length, bufs, __functionAddress);
    }

    /** {@code void glInvalidateNamedFramebufferData(GLuint framebuffer, GLsizei numAttachments, GLenum const * attachments)} */
    public static void glInvalidateNamedFramebufferData(@NativeType("GLuint") int framebuffer, @NativeType("GLenum const *") int[] attachments) {
        long __functionAddress = GL.getICD().glInvalidateNamedFramebufferData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(framebuffer, attachments.length, attachments, __functionAddress);
    }

    /** {@code void glInvalidateNamedFramebufferSubData(GLuint framebuffer, GLsizei numAttachments, GLenum const * attachments, GLint x, GLint y, GLsizei width, GLsizei height)} */
    public static void glInvalidateNamedFramebufferSubData(@NativeType("GLuint") int framebuffer, @NativeType("GLenum const *") int[] attachments, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        long __functionAddress = GL.getICD().glInvalidateNamedFramebufferSubData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(framebuffer, attachments.length, attachments, x, y, width, height, __functionAddress);
    }

    /** {@code void glClearNamedFramebufferiv(GLuint framebuffer, GLenum buffer, GLint drawbuffer, GLint const * value)} */
    public static void glClearNamedFramebufferiv(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLint const *") int[] value) {
        long __functionAddress = GL.getICD().glClearNamedFramebufferiv;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        callPV(framebuffer, buffer, drawbuffer, value, __functionAddress);
    }

    /** {@code void glClearNamedFramebufferuiv(GLuint framebuffer, GLenum buffer, GLint drawbuffer, GLint const * value)} */
    public static void glClearNamedFramebufferuiv(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLint const *") int[] value) {
        long __functionAddress = GL.getICD().glClearNamedFramebufferuiv;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 4);
        }
        callPV(framebuffer, buffer, drawbuffer, value, __functionAddress);
    }

    /** {@code void glClearNamedFramebufferfv(GLuint framebuffer, GLenum buffer, GLint drawbuffer, GLfloat const * value)} */
    public static void glClearNamedFramebufferfv(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glClearNamedFramebufferfv;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        callPV(framebuffer, buffer, drawbuffer, value, __functionAddress);
    }

    /** {@code void glGetNamedFramebufferParameteriv(GLuint framebuffer, GLenum pname, GLint * params)} */
    public static void glGetNamedFramebufferParameteriv(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetNamedFramebufferParameteriv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(framebuffer, pname, params, __functionAddress);
    }

    /** {@code void glGetNamedFramebufferAttachmentParameteriv(GLuint framebuffer, GLenum attachment, GLenum pname, GLint * params)} */
    public static void glGetNamedFramebufferAttachmentParameteriv(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetNamedFramebufferAttachmentParameteriv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(framebuffer, attachment, pname, params, __functionAddress);
    }

    /** {@code void glCreateRenderbuffers(GLsizei n, GLuint * renderbuffers)} */
    public static void glCreateRenderbuffers(@NativeType("GLuint *") int[] renderbuffers) {
        long __functionAddress = GL.getICD().glCreateRenderbuffers;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(renderbuffers.length, renderbuffers, __functionAddress);
    }

    /** {@code void glGetNamedRenderbufferParameteriv(GLuint renderbuffer, GLenum pname, GLint * params)} */
    public static void glGetNamedRenderbufferParameteriv(@NativeType("GLuint") int renderbuffer, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetNamedRenderbufferParameteriv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(renderbuffer, pname, params, __functionAddress);
    }

    /** {@code void glCreateTextures(GLenum target, GLsizei n, GLuint * textures)} */
    public static void glCreateTextures(@NativeType("GLenum") int target, @NativeType("GLuint *") int[] textures) {
        long __functionAddress = GL.getICD().glCreateTextures;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, textures.length, textures, __functionAddress);
    }

    /** {@code void glTextureSubImage1D(GLuint texture, GLint level, GLint xoffset, GLsizei width, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short[] pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage1D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, xoffset, width, format, type, pixels, __functionAddress);
    }

    /** {@code void glTextureSubImage1D(GLuint texture, GLint level, GLint xoffset, GLsizei width, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int[] pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage1D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, xoffset, width, format, type, pixels, __functionAddress);
    }

    /** {@code void glTextureSubImage1D(GLuint texture, GLint level, GLint xoffset, GLsizei width, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float[] pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage1D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, xoffset, width, format, type, pixels, __functionAddress);
    }

    /** {@code void glTextureSubImage1D(GLuint texture, GLint level, GLint xoffset, GLsizei width, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") double[] pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage1D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, xoffset, width, format, type, pixels, __functionAddress);
    }

    /** {@code void glTextureSubImage2D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short[] pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage2D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, xoffset, yoffset, width, height, format, type, pixels, __functionAddress);
    }

    /** {@code void glTextureSubImage2D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int[] pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage2D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, xoffset, yoffset, width, height, format, type, pixels, __functionAddress);
    }

    /** {@code void glTextureSubImage2D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float[] pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage2D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, xoffset, yoffset, width, height, format, type, pixels, __functionAddress);
    }

    /** {@code void glTextureSubImage2D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") double[] pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage2D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, xoffset, yoffset, width, height, format, type, pixels, __functionAddress);
    }

    /** {@code void glTextureSubImage3D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short[] pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage3D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels, __functionAddress);
    }

    /** {@code void glTextureSubImage3D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int[] pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage3D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels, __functionAddress);
    }

    /** {@code void glTextureSubImage3D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float[] pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage3D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels, __functionAddress);
    }

    /** {@code void glTextureSubImage3D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") double[] pixels) {
        long __functionAddress = GL.getICD().glTextureSubImage3D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels, __functionAddress);
    }

    /** {@code void glTextureParameterfv(GLuint texture, GLenum pname, GLfloat const * params)} */
    public static void glTextureParameterfv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") float[] params) {
        long __functionAddress = GL.getICD().glTextureParameterfv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(texture, pname, params, __functionAddress);
    }

    /** {@code void glTextureParameterIiv(GLuint texture, GLenum pname, GLint const * params)} */
    public static void glTextureParameterIiv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        long __functionAddress = GL.getICD().glTextureParameterIiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(texture, pname, params, __functionAddress);
    }

    /** {@code void glTextureParameterIuiv(GLuint texture, GLenum pname, GLuint const * params)} */
    public static void glTextureParameterIuiv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLuint const *") int[] params) {
        long __functionAddress = GL.getICD().glTextureParameterIuiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(texture, pname, params, __functionAddress);
    }

    /** {@code void glTextureParameteriv(GLuint texture, GLenum pname, GLint const * params)} */
    public static void glTextureParameteriv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        long __functionAddress = GL.getICD().glTextureParameteriv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(texture, pname, params, __functionAddress);
    }

    /** {@code void glGetTextureImage(GLuint texture, GLint level, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glGetTextureImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") short[] pixels) {
        long __functionAddress = GL.getICD().glGetTextureImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, format, type, pixels.length << 1, pixels, __functionAddress);
    }

    /** {@code void glGetTextureImage(GLuint texture, GLint level, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glGetTextureImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") int[] pixels) {
        long __functionAddress = GL.getICD().glGetTextureImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, format, type, pixels.length << 2, pixels, __functionAddress);
    }

    /** {@code void glGetTextureImage(GLuint texture, GLint level, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glGetTextureImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") float[] pixels) {
        long __functionAddress = GL.getICD().glGetTextureImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, format, type, pixels.length << 2, pixels, __functionAddress);
    }

    /** {@code void glGetTextureImage(GLuint texture, GLint level, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glGetTextureImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") double[] pixels) {
        long __functionAddress = GL.getICD().glGetTextureImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, format, type, pixels.length << 3, pixels, __functionAddress);
    }

    /** {@code void glGetTextureLevelParameterfv(GLuint texture, GLint level, GLenum pname, GLfloat * params)} */
    public static void glGetTextureLevelParameterfv(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GL.getICD().glGetTextureLevelParameterfv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(texture, level, pname, params, __functionAddress);
    }

    /** {@code void glGetTextureLevelParameteriv(GLuint texture, GLint level, GLenum pname, GLint * params)} */
    public static void glGetTextureLevelParameteriv(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetTextureLevelParameteriv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(texture, level, pname, params, __functionAddress);
    }

    /** {@code void glGetTextureParameterfv(GLuint texture, GLenum pname, GLfloat * params)} */
    public static void glGetTextureParameterfv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GL.getICD().glGetTextureParameterfv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(texture, pname, params, __functionAddress);
    }

    /** {@code void glGetTextureParameterIiv(GLuint texture, GLenum pname, GLint * params)} */
    public static void glGetTextureParameterIiv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetTextureParameterIiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(texture, pname, params, __functionAddress);
    }

    /** {@code void glGetTextureParameterIuiv(GLuint texture, GLenum pname, GLuint * params)} */
    public static void glGetTextureParameterIuiv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] params) {
        long __functionAddress = GL.getICD().glGetTextureParameterIuiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(texture, pname, params, __functionAddress);
    }

    /** {@code void glGetTextureParameteriv(GLuint texture, GLenum pname, GLint * params)} */
    public static void glGetTextureParameteriv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetTextureParameteriv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(texture, pname, params, __functionAddress);
    }

    /** {@code void glCreateVertexArrays(GLsizei n, GLuint * arrays)} */
    public static void glCreateVertexArrays(@NativeType("GLuint *") int[] arrays) {
        long __functionAddress = GL.getICD().glCreateVertexArrays;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(arrays.length, arrays, __functionAddress);
    }

    /** {@code void glVertexArrayVertexBuffers(GLuint vaobj, GLuint first, GLsizei count, GLuint const * buffers, GLintptr const * offsets, GLsizei const * strides)} */
    public static void glVertexArrayVertexBuffers(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int first, @NativeType("GLuint const *") int @Nullable [] buffers, @NativeType("GLintptr const *") @Nullable PointerBuffer offsets, @NativeType("GLsizei const *") int @Nullable [] strides) {
        long __functionAddress = GL.getICD().glVertexArrayVertexBuffers;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(offsets, lengthSafe(buffers));
            checkSafe(strides, lengthSafe(buffers));
        }
        callPPPV(vaobj, first, lengthSafe(buffers), buffers, memAddressSafe(offsets), strides, __functionAddress);
    }

    /** {@code void glGetVertexArrayiv(GLuint vaobj, GLenum pname, GLint * param)} */
    public static void glGetVertexArrayiv(@NativeType("GLuint") int vaobj, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] param) {
        long __functionAddress = GL.getICD().glGetVertexArrayiv;
        if (CHECKS) {
            check(__functionAddress);
            check(param, 1);
        }
        callPV(vaobj, pname, param, __functionAddress);
    }

    /** {@code void glGetVertexArrayIndexediv(GLuint vaobj, GLuint index, GLenum pname, GLint * param)} */
    public static void glGetVertexArrayIndexediv(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] param) {
        long __functionAddress = GL.getICD().glGetVertexArrayIndexediv;
        if (CHECKS) {
            check(__functionAddress);
            check(param, 1);
        }
        callPV(vaobj, index, pname, param, __functionAddress);
    }

    /** {@code void glGetVertexArrayIndexed64iv(GLuint vaobj, GLuint index, GLenum pname, GLint64 * param)} */
    public static void glGetVertexArrayIndexed64iv(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint64 *") long[] param) {
        long __functionAddress = GL.getICD().glGetVertexArrayIndexed64iv;
        if (CHECKS) {
            check(__functionAddress);
            check(param, 1);
        }
        callPV(vaobj, index, pname, param, __functionAddress);
    }

    /** {@code void glCreateSamplers(GLsizei n, GLuint * samplers)} */
    public static void glCreateSamplers(@NativeType("GLuint *") int[] samplers) {
        long __functionAddress = GL.getICD().glCreateSamplers;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(samplers.length, samplers, __functionAddress);
    }

    /** {@code void glCreateProgramPipelines(GLsizei n, GLuint * pipelines)} */
    public static void glCreateProgramPipelines(@NativeType("GLuint *") int[] pipelines) {
        long __functionAddress = GL.getICD().glCreateProgramPipelines;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(pipelines.length, pipelines, __functionAddress);
    }

    /** {@code void glCreateQueries(GLenum target, GLsizei n, GLuint * ids)} */
    public static void glCreateQueries(@NativeType("GLenum") int target, @NativeType("GLuint *") int[] ids) {
        long __functionAddress = GL.getICD().glCreateQueries;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, ids.length, ids, __functionAddress);
    }

    /** {@code void glGetTextureSubImage(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glGetTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") short[] pixels) {
        long __functionAddress = GL.getICD().glGetTextureSubImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels.length << 1, pixels, __functionAddress);
    }

    /** {@code void glGetTextureSubImage(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glGetTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") int[] pixels) {
        long __functionAddress = GL.getICD().glGetTextureSubImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels.length << 2, pixels, __functionAddress);
    }

    /** {@code void glGetTextureSubImage(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glGetTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") float[] pixels) {
        long __functionAddress = GL.getICD().glGetTextureSubImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels.length << 2, pixels, __functionAddress);
    }

    /** {@code void glGetTextureSubImage(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glGetTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") double[] pixels) {
        long __functionAddress = GL.getICD().glGetTextureSubImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels.length << 3, pixels, __functionAddress);
    }

    /** {@code void glGetCompressedTextureSubImage(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLsizei bufSize, void * pixels)} */
    public static void glGetCompressedTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("void *") short[] pixels) {
        long __functionAddress = GL.getICD().glGetCompressedTextureSubImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels.length << 1, pixels, __functionAddress);
    }

    /** {@code void glGetCompressedTextureSubImage(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLsizei bufSize, void * pixels)} */
    public static void glGetCompressedTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("void *") int[] pixels) {
        long __functionAddress = GL.getICD().glGetCompressedTextureSubImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels.length << 2, pixels, __functionAddress);
    }

    /** {@code void glGetCompressedTextureSubImage(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLsizei bufSize, void * pixels)} */
    public static void glGetCompressedTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("void *") float[] pixels) {
        long __functionAddress = GL.getICD().glGetCompressedTextureSubImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels.length << 2, pixels, __functionAddress);
    }

    /** {@code void glGetCompressedTextureSubImage(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLsizei bufSize, void * pixels)} */
    public static void glGetCompressedTextureSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("void *") double[] pixels) {
        long __functionAddress = GL.getICD().glGetCompressedTextureSubImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, xoffset, yoffset, zoffset, width, height, depth, pixels.length << 3, pixels, __functionAddress);
    }

    /** {@code void glGetnTexImage(GLenum tex, GLint level, GLenum format, GLenum type, GLsizei bufSize, void * img)} */
    public static void glGetnTexImage(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") short[] img) {
        long __functionAddress = GL.getICD().glGetnTexImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(tex, level, format, type, img.length << 1, img, __functionAddress);
    }

    /** {@code void glGetnTexImage(GLenum tex, GLint level, GLenum format, GLenum type, GLsizei bufSize, void * img)} */
    public static void glGetnTexImage(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") int[] img) {
        long __functionAddress = GL.getICD().glGetnTexImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(tex, level, format, type, img.length << 2, img, __functionAddress);
    }

    /** {@code void glGetnTexImage(GLenum tex, GLint level, GLenum format, GLenum type, GLsizei bufSize, void * img)} */
    public static void glGetnTexImage(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") float[] img) {
        long __functionAddress = GL.getICD().glGetnTexImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(tex, level, format, type, img.length << 2, img, __functionAddress);
    }

    /** {@code void glGetnTexImage(GLenum tex, GLint level, GLenum format, GLenum type, GLsizei bufSize, void * img)} */
    public static void glGetnTexImage(@NativeType("GLenum") int tex, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") double[] img) {
        long __functionAddress = GL.getICD().glGetnTexImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(tex, level, format, type, img.length << 3, img, __functionAddress);
    }

    /** {@code void glReadnPixels(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glReadnPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") short[] pixels) {
        long __functionAddress = GL.getICD().glReadnPixels;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(x, y, width, height, format, type, pixels.length << 1, pixels, __functionAddress);
    }

    /** {@code void glReadnPixels(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glReadnPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") int[] pixels) {
        long __functionAddress = GL.getICD().glReadnPixels;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(x, y, width, height, format, type, pixels.length << 2, pixels, __functionAddress);
    }

    /** {@code void glReadnPixels(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glReadnPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") float[] pixels) {
        long __functionAddress = GL.getICD().glReadnPixels;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(x, y, width, height, format, type, pixels.length << 2, pixels, __functionAddress);
    }

    /** {@code void glGetnUniformfv(GLuint program, GLint location, GLsizei bufSize, GLfloat * params)} */
    public static void glGetnUniformfv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GL.getICD().glGetnUniformfv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, params.length, params, __functionAddress);
    }

    /** {@code void glGetnUniformdv(GLuint program, GLint location, GLsizei bufSize, GLdouble * params)} */
    public static void glGetnUniformdv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble *") double[] params) {
        long __functionAddress = GL.getICD().glGetnUniformdv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, params.length, params, __functionAddress);
    }

    /** {@code void glGetnUniformiv(GLuint program, GLint location, GLsizei bufSize, GLint * params)} */
    public static void glGetnUniformiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetnUniformiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, params.length, params, __functionAddress);
    }

    /** {@code void glGetnUniformuiv(GLuint program, GLint location, GLsizei bufSize, GLuint * params)} */
    public static void glGetnUniformuiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint *") int[] params) {
        long __functionAddress = GL.getICD().glGetnUniformuiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, params.length, params, __functionAddress);
    }

}
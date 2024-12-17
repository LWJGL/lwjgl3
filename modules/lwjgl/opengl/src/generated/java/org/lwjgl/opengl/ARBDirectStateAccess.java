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

public class ARBDirectStateAccess {

    static { GL.initialize(); }

    public static final int GL_TEXTURE_TARGET = 0x1006;

    public static final int GL_QUERY_TARGET = 0x82EA;

    protected ARBDirectStateAccess() {
        throw new UnsupportedOperationException();
    }

    // --- [ glCreateTransformFeedbacks ] ---

    /** {@code void glCreateTransformFeedbacks(GLsizei n, GLuint * ids)} */
    public static void nglCreateTransformFeedbacks(int n, long ids) {
        GL45C.nglCreateTransformFeedbacks(n, ids);
    }

    /** {@code void glCreateTransformFeedbacks(GLsizei n, GLuint * ids)} */
    public static void glCreateTransformFeedbacks(@NativeType("GLuint *") IntBuffer ids) {
        GL45C.glCreateTransformFeedbacks(ids);
    }

    /** {@code void glCreateTransformFeedbacks(GLsizei n, GLuint * ids)} */
    @NativeType("void")
    public static int glCreateTransformFeedbacks() {
        return GL45C.glCreateTransformFeedbacks();
    }

    // --- [ glTransformFeedbackBufferBase ] ---

    /** {@code void glTransformFeedbackBufferBase(GLuint xfb, GLuint index, GLuint buffer)} */
    public static void glTransformFeedbackBufferBase(@NativeType("GLuint") int xfb, @NativeType("GLuint") int index, @NativeType("GLuint") int buffer) {
        GL45C.glTransformFeedbackBufferBase(xfb, index, buffer);
    }

    // --- [ glTransformFeedbackBufferRange ] ---

    /** {@code void glTransformFeedbackBufferRange(GLuint xfb, GLuint index, GLuint buffer, GLintptr offset, GLsizeiptr size)} */
    public static void glTransformFeedbackBufferRange(@NativeType("GLuint") int xfb, @NativeType("GLuint") int index, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size) {
        GL45C.glTransformFeedbackBufferRange(xfb, index, buffer, offset, size);
    }

    // --- [ glGetTransformFeedbackiv ] ---

    /** {@code void glGetTransformFeedbackiv(GLuint xfb, GLenum pname, GLint * param)} */
    public static void nglGetTransformFeedbackiv(int xfb, int pname, long param) {
        GL45C.nglGetTransformFeedbackiv(xfb, pname, param);
    }

    /** {@code void glGetTransformFeedbackiv(GLuint xfb, GLenum pname, GLint * param)} */
    public static void glGetTransformFeedbackiv(@NativeType("GLuint") int xfb, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer param) {
        GL45C.glGetTransformFeedbackiv(xfb, pname, param);
    }

    /** {@code void glGetTransformFeedbackiv(GLuint xfb, GLenum pname, GLint * param)} */
    @NativeType("void")
    public static int glGetTransformFeedbacki(@NativeType("GLuint") int xfb, @NativeType("GLenum") int pname) {
        return GL45C.glGetTransformFeedbacki(xfb, pname);
    }

    // --- [ glGetTransformFeedbacki_v ] ---

    /** {@code void glGetTransformFeedbacki_v(GLuint xfb, GLenum pname, GLuint index, GLint * param)} */
    public static void nglGetTransformFeedbacki_v(int xfb, int pname, int index, long param) {
        GL45C.nglGetTransformFeedbacki_v(xfb, pname, index, param);
    }

    /** {@code void glGetTransformFeedbacki_v(GLuint xfb, GLenum pname, GLuint index, GLint * param)} */
    public static void glGetTransformFeedbacki_v(@NativeType("GLuint") int xfb, @NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLint *") IntBuffer param) {
        GL45C.glGetTransformFeedbacki_v(xfb, pname, index, param);
    }

    /** {@code void glGetTransformFeedbacki_v(GLuint xfb, GLenum pname, GLuint index, GLint * param)} */
    @NativeType("void")
    public static int glGetTransformFeedbacki(@NativeType("GLuint") int xfb, @NativeType("GLenum") int pname, @NativeType("GLuint") int index) {
        return GL45C.glGetTransformFeedbacki(xfb, pname, index);
    }

    // --- [ glGetTransformFeedbacki64_v ] ---

    /** {@code void glGetTransformFeedbacki64_v(GLuint xfb, GLenum pname, GLuint index, GLint64 * param)} */
    public static void nglGetTransformFeedbacki64_v(int xfb, int pname, int index, long param) {
        GL45C.nglGetTransformFeedbacki64_v(xfb, pname, index, param);
    }

    /** {@code void glGetTransformFeedbacki64_v(GLuint xfb, GLenum pname, GLuint index, GLint64 * param)} */
    public static void glGetTransformFeedbacki64_v(@NativeType("GLuint") int xfb, @NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLint64 *") LongBuffer param) {
        GL45C.glGetTransformFeedbacki64_v(xfb, pname, index, param);
    }

    /** {@code void glGetTransformFeedbacki64_v(GLuint xfb, GLenum pname, GLuint index, GLint64 * param)} */
    @NativeType("void")
    public static long glGetTransformFeedbacki64(@NativeType("GLuint") int xfb, @NativeType("GLenum") int pname, @NativeType("GLuint") int index) {
        return GL45C.glGetTransformFeedbacki64(xfb, pname, index);
    }

    // --- [ glCreateBuffers ] ---

    /** {@code void glCreateBuffers(GLsizei n, GLuint * buffers)} */
    public static void nglCreateBuffers(int n, long buffers) {
        GL45C.nglCreateBuffers(n, buffers);
    }

    /** {@code void glCreateBuffers(GLsizei n, GLuint * buffers)} */
    public static void glCreateBuffers(@NativeType("GLuint *") IntBuffer buffers) {
        GL45C.glCreateBuffers(buffers);
    }

    /** {@code void glCreateBuffers(GLsizei n, GLuint * buffers)} */
    @NativeType("void")
    public static int glCreateBuffers() {
        return GL45C.glCreateBuffers();
    }

    // --- [ glNamedBufferStorage ] ---

    /** {@code void glNamedBufferStorage(GLuint buffer, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void nglNamedBufferStorage(int buffer, long size, long data, int flags) {
        GL45C.nglNamedBufferStorage(buffer, size, data, flags);
    }

    /** {@code void glNamedBufferStorage(GLuint buffer, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glNamedBufferStorage(@NativeType("GLuint") int buffer, @NativeType("GLsizeiptr") long size, @NativeType("GLbitfield") int flags) {
        GL45C.glNamedBufferStorage(buffer, size, flags);
    }

    /** {@code void glNamedBufferStorage(GLuint buffer, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glNamedBufferStorage(@NativeType("GLuint") int buffer, @NativeType("void const *") ByteBuffer data, @NativeType("GLbitfield") int flags) {
        GL45C.glNamedBufferStorage(buffer, data, flags);
    }

    /** {@code void glNamedBufferStorage(GLuint buffer, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glNamedBufferStorage(@NativeType("GLuint") int buffer, @NativeType("void const *") ShortBuffer data, @NativeType("GLbitfield") int flags) {
        GL45C.glNamedBufferStorage(buffer, data, flags);
    }

    /** {@code void glNamedBufferStorage(GLuint buffer, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glNamedBufferStorage(@NativeType("GLuint") int buffer, @NativeType("void const *") IntBuffer data, @NativeType("GLbitfield") int flags) {
        GL45C.glNamedBufferStorage(buffer, data, flags);
    }

    /** {@code void glNamedBufferStorage(GLuint buffer, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glNamedBufferStorage(@NativeType("GLuint") int buffer, @NativeType("void const *") FloatBuffer data, @NativeType("GLbitfield") int flags) {
        GL45C.glNamedBufferStorage(buffer, data, flags);
    }

    /** {@code void glNamedBufferStorage(GLuint buffer, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glNamedBufferStorage(@NativeType("GLuint") int buffer, @NativeType("void const *") DoubleBuffer data, @NativeType("GLbitfield") int flags) {
        GL45C.glNamedBufferStorage(buffer, data, flags);
    }

    // --- [ glNamedBufferData ] ---

    /** {@code void glNamedBufferData(GLuint buffer, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void nglNamedBufferData(int buffer, long size, long data, int usage) {
        GL45C.nglNamedBufferData(buffer, size, data, usage);
    }

    /** {@code void glNamedBufferData(GLuint buffer, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int usage) {
        GL45C.glNamedBufferData(buffer, size, usage);
    }

    /** {@code void glNamedBufferData(GLuint buffer, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("void const *") ByteBuffer data, @NativeType("GLenum") int usage) {
        GL45C.glNamedBufferData(buffer, data, usage);
    }

    /** {@code void glNamedBufferData(GLuint buffer, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("void const *") ShortBuffer data, @NativeType("GLenum") int usage) {
        GL45C.glNamedBufferData(buffer, data, usage);
    }

    /** {@code void glNamedBufferData(GLuint buffer, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("void const *") IntBuffer data, @NativeType("GLenum") int usage) {
        GL45C.glNamedBufferData(buffer, data, usage);
    }

    /** {@code void glNamedBufferData(GLuint buffer, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("void const *") LongBuffer data, @NativeType("GLenum") int usage) {
        GL45C.glNamedBufferData(buffer, data, usage);
    }

    /** {@code void glNamedBufferData(GLuint buffer, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("void const *") FloatBuffer data, @NativeType("GLenum") int usage) {
        GL45C.glNamedBufferData(buffer, data, usage);
    }

    /** {@code void glNamedBufferData(GLuint buffer, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("void const *") DoubleBuffer data, @NativeType("GLenum") int usage) {
        GL45C.glNamedBufferData(buffer, data, usage);
    }

    // --- [ glNamedBufferSubData ] ---

    /** {@code void glNamedBufferSubData(GLuint buffer, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void nglNamedBufferSubData(int buffer, long offset, long size, long data) {
        GL45C.nglNamedBufferSubData(buffer, offset, size, data);
    }

    /** {@code void glNamedBufferSubData(GLuint buffer, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") ByteBuffer data) {
        GL45C.glNamedBufferSubData(buffer, offset, data);
    }

    /** {@code void glNamedBufferSubData(GLuint buffer, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") ShortBuffer data) {
        GL45C.glNamedBufferSubData(buffer, offset, data);
    }

    /** {@code void glNamedBufferSubData(GLuint buffer, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") IntBuffer data) {
        GL45C.glNamedBufferSubData(buffer, offset, data);
    }

    /** {@code void glNamedBufferSubData(GLuint buffer, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") LongBuffer data) {
        GL45C.glNamedBufferSubData(buffer, offset, data);
    }

    /** {@code void glNamedBufferSubData(GLuint buffer, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") FloatBuffer data) {
        GL45C.glNamedBufferSubData(buffer, offset, data);
    }

    /** {@code void glNamedBufferSubData(GLuint buffer, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") DoubleBuffer data) {
        GL45C.glNamedBufferSubData(buffer, offset, data);
    }

    // --- [ glCopyNamedBufferSubData ] ---

    /** {@code void glCopyNamedBufferSubData(GLuint readBuffer, GLuint writeBuffer, GLintptr readOffset, GLintptr writeOffset, GLsizeiptr size)} */
    public static void glCopyNamedBufferSubData(@NativeType("GLuint") int readBuffer, @NativeType("GLuint") int writeBuffer, @NativeType("GLintptr") long readOffset, @NativeType("GLintptr") long writeOffset, @NativeType("GLsizeiptr") long size) {
        GL45C.glCopyNamedBufferSubData(readBuffer, writeBuffer, readOffset, writeOffset, size);
    }

    // --- [ glClearNamedBufferData ] ---

    /** {@code void glClearNamedBufferData(GLuint buffer, GLenum internalformat, GLenum format, GLenum type, void const * data)} */
    public static void nglClearNamedBufferData(int buffer, int internalformat, int format, int type, long data) {
        GL45C.nglClearNamedBufferData(buffer, internalformat, format, type, data);
    }

    /** {@code void glClearNamedBufferData(GLuint buffer, GLenum internalformat, GLenum format, GLenum type, void const * data)} */
    public static void glClearNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable ByteBuffer data) {
        GL45C.glClearNamedBufferData(buffer, internalformat, format, type, data);
    }

    /** {@code void glClearNamedBufferData(GLuint buffer, GLenum internalformat, GLenum format, GLenum type, void const * data)} */
    public static void glClearNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable ShortBuffer data) {
        GL45C.glClearNamedBufferData(buffer, internalformat, format, type, data);
    }

    /** {@code void glClearNamedBufferData(GLuint buffer, GLenum internalformat, GLenum format, GLenum type, void const * data)} */
    public static void glClearNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable IntBuffer data) {
        GL45C.glClearNamedBufferData(buffer, internalformat, format, type, data);
    }

    /** {@code void glClearNamedBufferData(GLuint buffer, GLenum internalformat, GLenum format, GLenum type, void const * data)} */
    public static void glClearNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable FloatBuffer data) {
        GL45C.glClearNamedBufferData(buffer, internalformat, format, type, data);
    }

    // --- [ glClearNamedBufferSubData ] ---

    /** {@code void glClearNamedBufferSubData(GLuint buffer, GLenum internalformat, GLintptr offset, GLsizeiptr size, GLenum format, GLenum type, void const * data)} */
    public static void nglClearNamedBufferSubData(int buffer, int internalformat, long offset, long size, int format, int type, long data) {
        GL45C.nglClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, data);
    }

    /** {@code void glClearNamedBufferSubData(GLuint buffer, GLenum internalformat, GLintptr offset, GLsizeiptr size, GLenum format, GLenum type, void const * data)} */
    public static void glClearNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable ByteBuffer data) {
        GL45C.glClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, data);
    }

    /** {@code void glClearNamedBufferSubData(GLuint buffer, GLenum internalformat, GLintptr offset, GLsizeiptr size, GLenum format, GLenum type, void const * data)} */
    public static void glClearNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable ShortBuffer data) {
        GL45C.glClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, data);
    }

    /** {@code void glClearNamedBufferSubData(GLuint buffer, GLenum internalformat, GLintptr offset, GLsizeiptr size, GLenum format, GLenum type, void const * data)} */
    public static void glClearNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable IntBuffer data) {
        GL45C.glClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, data);
    }

    /** {@code void glClearNamedBufferSubData(GLuint buffer, GLenum internalformat, GLintptr offset, GLsizeiptr size, GLenum format, GLenum type, void const * data)} */
    public static void glClearNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable FloatBuffer data) {
        GL45C.glClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, data);
    }

    // --- [ glMapNamedBuffer ] ---

    /** {@code void * glMapNamedBuffer(GLuint buffer, GLenum access)} */
    public static long nglMapNamedBuffer(int buffer, int access) {
        return GL45C.nglMapNamedBuffer(buffer, access);
    }

    /** {@code void * glMapNamedBuffer(GLuint buffer, GLenum access)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer glMapNamedBuffer(@NativeType("GLuint") int buffer, @NativeType("GLenum") int access) {
        return GL45C.glMapNamedBuffer(buffer, access);
    }

    /** {@code void * glMapNamedBuffer(GLuint buffer, GLenum access)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer glMapNamedBuffer(@NativeType("GLuint") int buffer, @NativeType("GLenum") int access, @Nullable ByteBuffer old_buffer) {
        return GL45C.glMapNamedBuffer(buffer, access, old_buffer);
    }

    /** {@code void * glMapNamedBuffer(GLuint buffer, GLenum access)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer glMapNamedBuffer(@NativeType("GLuint") int buffer, @NativeType("GLenum") int access, long length, @Nullable ByteBuffer old_buffer) {
        return GL45C.glMapNamedBuffer(buffer, access, length, old_buffer);
    }

    // --- [ glMapNamedBufferRange ] ---

    /** {@code void * glMapNamedBufferRange(GLuint buffer, GLintptr offset, GLsizeiptr length, GLbitfield access)} */
    public static long nglMapNamedBufferRange(int buffer, long offset, long length, int access) {
        return GL45C.nglMapNamedBufferRange(buffer, offset, length, access);
    }

    /** {@code void * glMapNamedBufferRange(GLuint buffer, GLintptr offset, GLsizeiptr length, GLbitfield access)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer glMapNamedBufferRange(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long length, @NativeType("GLbitfield") int access) {
        return GL45C.glMapNamedBufferRange(buffer, offset, length, access);
    }

    /** {@code void * glMapNamedBufferRange(GLuint buffer, GLintptr offset, GLsizeiptr length, GLbitfield access)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer glMapNamedBufferRange(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long length, @NativeType("GLbitfield") int access, @Nullable ByteBuffer old_buffer) {
        return GL45C.glMapNamedBufferRange(buffer, offset, length, access, old_buffer);
    }

    // --- [ glUnmapNamedBuffer ] ---

    /** {@code GLboolean glUnmapNamedBuffer(GLuint buffer)} */
    @NativeType("GLboolean")
    public static boolean glUnmapNamedBuffer(@NativeType("GLuint") int buffer) {
        return GL45C.glUnmapNamedBuffer(buffer);
    }

    // --- [ glFlushMappedNamedBufferRange ] ---

    /** {@code void glFlushMappedNamedBufferRange(GLuint buffer, GLintptr offset, GLsizeiptr length)} */
    public static void glFlushMappedNamedBufferRange(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long length) {
        GL45C.glFlushMappedNamedBufferRange(buffer, offset, length);
    }

    // --- [ glGetNamedBufferParameteriv ] ---

    /** {@code void glGetNamedBufferParameteriv(GLuint buffer, GLenum pname, GLint * params)} */
    public static void nglGetNamedBufferParameteriv(int buffer, int pname, long params) {
        GL45C.nglGetNamedBufferParameteriv(buffer, pname, params);
    }

    /** {@code void glGetNamedBufferParameteriv(GLuint buffer, GLenum pname, GLint * params)} */
    public static void glGetNamedBufferParameteriv(@NativeType("GLuint") int buffer, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        GL45C.glGetNamedBufferParameteriv(buffer, pname, params);
    }

    /** {@code void glGetNamedBufferParameteriv(GLuint buffer, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetNamedBufferParameteri(@NativeType("GLuint") int buffer, @NativeType("GLenum") int pname) {
        return GL45C.glGetNamedBufferParameteri(buffer, pname);
    }

    // --- [ glGetNamedBufferParameteri64v ] ---

    /** {@code void glGetNamedBufferParameteri64v(GLuint buffer, GLenum pname, GLint64 * params)} */
    public static void nglGetNamedBufferParameteri64v(int buffer, int pname, long params) {
        GL45C.nglGetNamedBufferParameteri64v(buffer, pname, params);
    }

    /** {@code void glGetNamedBufferParameteri64v(GLuint buffer, GLenum pname, GLint64 * params)} */
    public static void glGetNamedBufferParameteri64v(@NativeType("GLuint") int buffer, @NativeType("GLenum") int pname, @NativeType("GLint64 *") LongBuffer params) {
        GL45C.glGetNamedBufferParameteri64v(buffer, pname, params);
    }

    /** {@code void glGetNamedBufferParameteri64v(GLuint buffer, GLenum pname, GLint64 * params)} */
    @NativeType("void")
    public static long glGetNamedBufferParameteri64(@NativeType("GLuint") int buffer, @NativeType("GLenum") int pname) {
        return GL45C.glGetNamedBufferParameteri64(buffer, pname);
    }

    // --- [ glGetNamedBufferPointerv ] ---

    /** {@code void glGetNamedBufferPointerv(GLuint buffer, GLenum pname, void ** params)} */
    public static void nglGetNamedBufferPointerv(int buffer, int pname, long params) {
        GL45C.nglGetNamedBufferPointerv(buffer, pname, params);
    }

    /** {@code void glGetNamedBufferPointerv(GLuint buffer, GLenum pname, void ** params)} */
    public static void glGetNamedBufferPointerv(@NativeType("GLuint") int buffer, @NativeType("GLenum") int pname, @NativeType("void **") PointerBuffer params) {
        GL45C.glGetNamedBufferPointerv(buffer, pname, params);
    }

    /** {@code void glGetNamedBufferPointerv(GLuint buffer, GLenum pname, void ** params)} */
    @NativeType("void")
    public static long glGetNamedBufferPointer(@NativeType("GLuint") int buffer, @NativeType("GLenum") int pname) {
        return GL45C.glGetNamedBufferPointer(buffer, pname);
    }

    // --- [ glGetNamedBufferSubData ] ---

    /** {@code void glGetNamedBufferSubData(GLuint buffer, GLintptr offset, GLsizeiptr size, void * data)} */
    public static void nglGetNamedBufferSubData(int buffer, long offset, long size, long data) {
        GL45C.nglGetNamedBufferSubData(buffer, offset, size, data);
    }

    /** {@code void glGetNamedBufferSubData(GLuint buffer, GLintptr offset, GLsizeiptr size, void * data)} */
    public static void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") ByteBuffer data) {
        GL45C.glGetNamedBufferSubData(buffer, offset, data);
    }

    /** {@code void glGetNamedBufferSubData(GLuint buffer, GLintptr offset, GLsizeiptr size, void * data)} */
    public static void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") ShortBuffer data) {
        GL45C.glGetNamedBufferSubData(buffer, offset, data);
    }

    /** {@code void glGetNamedBufferSubData(GLuint buffer, GLintptr offset, GLsizeiptr size, void * data)} */
    public static void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") IntBuffer data) {
        GL45C.glGetNamedBufferSubData(buffer, offset, data);
    }

    /** {@code void glGetNamedBufferSubData(GLuint buffer, GLintptr offset, GLsizeiptr size, void * data)} */
    public static void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") LongBuffer data) {
        GL45C.glGetNamedBufferSubData(buffer, offset, data);
    }

    /** {@code void glGetNamedBufferSubData(GLuint buffer, GLintptr offset, GLsizeiptr size, void * data)} */
    public static void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") FloatBuffer data) {
        GL45C.glGetNamedBufferSubData(buffer, offset, data);
    }

    /** {@code void glGetNamedBufferSubData(GLuint buffer, GLintptr offset, GLsizeiptr size, void * data)} */
    public static void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") DoubleBuffer data) {
        GL45C.glGetNamedBufferSubData(buffer, offset, data);
    }

    // --- [ glCreateFramebuffers ] ---

    /** {@code void glCreateFramebuffers(GLsizei n, GLuint * framebuffers)} */
    public static void nglCreateFramebuffers(int n, long framebuffers) {
        GL45C.nglCreateFramebuffers(n, framebuffers);
    }

    /** {@code void glCreateFramebuffers(GLsizei n, GLuint * framebuffers)} */
    public static void glCreateFramebuffers(@NativeType("GLuint *") IntBuffer framebuffers) {
        GL45C.glCreateFramebuffers(framebuffers);
    }

    /** {@code void glCreateFramebuffers(GLsizei n, GLuint * framebuffers)} */
    @NativeType("void")
    public static int glCreateFramebuffers() {
        return GL45C.glCreateFramebuffers();
    }

    // --- [ glNamedFramebufferRenderbuffer ] ---

    /** {@code void glNamedFramebufferRenderbuffer(GLuint framebuffer, GLenum attachment, GLenum renderbuffertarget, GLuint renderbuffer)} */
    public static void glNamedFramebufferRenderbuffer(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLenum") int renderbuffertarget, @NativeType("GLuint") int renderbuffer) {
        GL45C.glNamedFramebufferRenderbuffer(framebuffer, attachment, renderbuffertarget, renderbuffer);
    }

    // --- [ glNamedFramebufferParameteri ] ---

    /** {@code void glNamedFramebufferParameteri(GLuint framebuffer, GLenum pname, GLint param)} */
    public static void glNamedFramebufferParameteri(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int pname, @NativeType("GLint") int param) {
        GL45C.glNamedFramebufferParameteri(framebuffer, pname, param);
    }

    // --- [ glNamedFramebufferTexture ] ---

    /** {@code void glNamedFramebufferTexture(GLuint framebuffer, GLenum attachment, GLuint texture, GLint level)} */
    public static void glNamedFramebufferTexture(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level) {
        GL45C.glNamedFramebufferTexture(framebuffer, attachment, texture, level);
    }

    // --- [ glNamedFramebufferTextureLayer ] ---

    /** {@code void glNamedFramebufferTextureLayer(GLuint framebuffer, GLenum attachment, GLuint texture, GLint level, GLint layer)} */
    public static void glNamedFramebufferTextureLayer(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int layer) {
        GL45C.glNamedFramebufferTextureLayer(framebuffer, attachment, texture, level, layer);
    }

    // --- [ glNamedFramebufferDrawBuffer ] ---

    /** {@code void glNamedFramebufferDrawBuffer(GLuint framebuffer, GLenum buf)} */
    public static void glNamedFramebufferDrawBuffer(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int buf) {
        GL45C.glNamedFramebufferDrawBuffer(framebuffer, buf);
    }

    // --- [ glNamedFramebufferDrawBuffers ] ---

    /** {@code void glNamedFramebufferDrawBuffers(GLuint framebuffer, GLsizei n, GLenum const * bufs)} */
    public static void nglNamedFramebufferDrawBuffers(int framebuffer, int n, long bufs) {
        GL45C.nglNamedFramebufferDrawBuffers(framebuffer, n, bufs);
    }

    /** {@code void glNamedFramebufferDrawBuffers(GLuint framebuffer, GLsizei n, GLenum const * bufs)} */
    public static void glNamedFramebufferDrawBuffers(@NativeType("GLuint") int framebuffer, @NativeType("GLenum const *") IntBuffer bufs) {
        GL45C.glNamedFramebufferDrawBuffers(framebuffer, bufs);
    }

    /** {@code void glNamedFramebufferDrawBuffers(GLuint framebuffer, GLsizei n, GLenum const * bufs)} */
    public static void glNamedFramebufferDrawBuffers(@NativeType("GLuint") int framebuffer, @NativeType("GLenum const *") int buf) {
        GL45C.glNamedFramebufferDrawBuffers(framebuffer, buf);
    }

    // --- [ glNamedFramebufferReadBuffer ] ---

    /** {@code void glNamedFramebufferReadBuffer(GLuint framebuffer, GLenum src)} */
    public static void glNamedFramebufferReadBuffer(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int src) {
        GL45C.glNamedFramebufferReadBuffer(framebuffer, src);
    }

    // --- [ glInvalidateNamedFramebufferData ] ---

    /** {@code void glInvalidateNamedFramebufferData(GLuint framebuffer, GLsizei numAttachments, GLenum const * attachments)} */
    public static void nglInvalidateNamedFramebufferData(int framebuffer, int numAttachments, long attachments) {
        GL45C.nglInvalidateNamedFramebufferData(framebuffer, numAttachments, attachments);
    }

    /** {@code void glInvalidateNamedFramebufferData(GLuint framebuffer, GLsizei numAttachments, GLenum const * attachments)} */
    public static void glInvalidateNamedFramebufferData(@NativeType("GLuint") int framebuffer, @NativeType("GLenum const *") IntBuffer attachments) {
        GL45C.glInvalidateNamedFramebufferData(framebuffer, attachments);
    }

    /** {@code void glInvalidateNamedFramebufferData(GLuint framebuffer, GLsizei numAttachments, GLenum const * attachments)} */
    public static void glInvalidateNamedFramebufferData(@NativeType("GLuint") int framebuffer, @NativeType("GLenum const *") int attachment) {
        GL45C.glInvalidateNamedFramebufferData(framebuffer, attachment);
    }

    // --- [ glInvalidateNamedFramebufferSubData ] ---

    /** {@code void glInvalidateNamedFramebufferSubData(GLuint framebuffer, GLsizei numAttachments, GLenum const * attachments, GLint x, GLint y, GLsizei width, GLsizei height)} */
    public static void nglInvalidateNamedFramebufferSubData(int framebuffer, int numAttachments, long attachments, int x, int y, int width, int height) {
        GL45C.nglInvalidateNamedFramebufferSubData(framebuffer, numAttachments, attachments, x, y, width, height);
    }

    /** {@code void glInvalidateNamedFramebufferSubData(GLuint framebuffer, GLsizei numAttachments, GLenum const * attachments, GLint x, GLint y, GLsizei width, GLsizei height)} */
    public static void glInvalidateNamedFramebufferSubData(@NativeType("GLuint") int framebuffer, @NativeType("GLenum const *") IntBuffer attachments, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        GL45C.glInvalidateNamedFramebufferSubData(framebuffer, attachments, x, y, width, height);
    }

    /** {@code void glInvalidateNamedFramebufferSubData(GLuint framebuffer, GLsizei numAttachments, GLenum const * attachments, GLint x, GLint y, GLsizei width, GLsizei height)} */
    public static void glInvalidateNamedFramebufferSubData(@NativeType("GLuint") int framebuffer, @NativeType("GLenum const *") int attachment, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        GL45C.glInvalidateNamedFramebufferSubData(framebuffer, attachment, x, y, width, height);
    }

    // --- [ glClearNamedFramebufferiv ] ---

    /** {@code void glClearNamedFramebufferiv(GLuint framebuffer, GLenum buffer, GLint drawbuffer, GLint const * value)} */
    public static void nglClearNamedFramebufferiv(int framebuffer, int buffer, int drawbuffer, long value) {
        GL45C.nglClearNamedFramebufferiv(framebuffer, buffer, drawbuffer, value);
    }

    /** {@code void glClearNamedFramebufferiv(GLuint framebuffer, GLenum buffer, GLint drawbuffer, GLint const * value)} */
    public static void glClearNamedFramebufferiv(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLint const *") IntBuffer value) {
        GL45C.glClearNamedFramebufferiv(framebuffer, buffer, drawbuffer, value);
    }

    // --- [ glClearNamedFramebufferuiv ] ---

    /** {@code void glClearNamedFramebufferuiv(GLuint framebuffer, GLenum buffer, GLint drawbuffer, GLint const * value)} */
    public static void nglClearNamedFramebufferuiv(int framebuffer, int buffer, int drawbuffer, long value) {
        GL45C.nglClearNamedFramebufferuiv(framebuffer, buffer, drawbuffer, value);
    }

    /** {@code void glClearNamedFramebufferuiv(GLuint framebuffer, GLenum buffer, GLint drawbuffer, GLint const * value)} */
    public static void glClearNamedFramebufferuiv(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLint const *") IntBuffer value) {
        GL45C.glClearNamedFramebufferuiv(framebuffer, buffer, drawbuffer, value);
    }

    // --- [ glClearNamedFramebufferfv ] ---

    /** {@code void glClearNamedFramebufferfv(GLuint framebuffer, GLenum buffer, GLint drawbuffer, GLfloat const * value)} */
    public static void nglClearNamedFramebufferfv(int framebuffer, int buffer, int drawbuffer, long value) {
        GL45C.nglClearNamedFramebufferfv(framebuffer, buffer, drawbuffer, value);
    }

    /** {@code void glClearNamedFramebufferfv(GLuint framebuffer, GLenum buffer, GLint drawbuffer, GLfloat const * value)} */
    public static void glClearNamedFramebufferfv(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLfloat const *") FloatBuffer value) {
        GL45C.glClearNamedFramebufferfv(framebuffer, buffer, drawbuffer, value);
    }

    // --- [ glClearNamedFramebufferfi ] ---

    /** {@code void glClearNamedFramebufferfi(GLuint framebuffer, GLenum buffer, GLint drawbuffer, GLfloat depth, GLint stencil)} */
    public static void glClearNamedFramebufferfi(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLfloat") float depth, @NativeType("GLint") int stencil) {
        GL45C.glClearNamedFramebufferfi(framebuffer, buffer, drawbuffer, depth, stencil);
    }

    // --- [ glBlitNamedFramebuffer ] ---

    /** {@code void glBlitNamedFramebuffer(GLuint readFramebuffer, GLuint drawFramebuffer, GLint srcX0, GLint srcY0, GLint srcX1, GLint srcY1, GLint dstX0, GLint dstY0, GLint dstX1, GLint dstY1, GLbitfield mask, GLenum filter)} */
    public static void glBlitNamedFramebuffer(@NativeType("GLuint") int readFramebuffer, @NativeType("GLuint") int drawFramebuffer, @NativeType("GLint") int srcX0, @NativeType("GLint") int srcY0, @NativeType("GLint") int srcX1, @NativeType("GLint") int srcY1, @NativeType("GLint") int dstX0, @NativeType("GLint") int dstY0, @NativeType("GLint") int dstX1, @NativeType("GLint") int dstY1, @NativeType("GLbitfield") int mask, @NativeType("GLenum") int filter) {
        GL45C.glBlitNamedFramebuffer(readFramebuffer, drawFramebuffer, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
    }

    // --- [ glCheckNamedFramebufferStatus ] ---

    /** {@code GLenum glCheckNamedFramebufferStatus(GLuint framebuffer, GLenum target)} */
    @NativeType("GLenum")
    public static int glCheckNamedFramebufferStatus(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int target) {
        return GL45C.glCheckNamedFramebufferStatus(framebuffer, target);
    }

    // --- [ glGetNamedFramebufferParameteriv ] ---

    /** {@code void glGetNamedFramebufferParameteriv(GLuint framebuffer, GLenum pname, GLint * params)} */
    public static void nglGetNamedFramebufferParameteriv(int framebuffer, int pname, long params) {
        GL45C.nglGetNamedFramebufferParameteriv(framebuffer, pname, params);
    }

    /** {@code void glGetNamedFramebufferParameteriv(GLuint framebuffer, GLenum pname, GLint * params)} */
    public static void glGetNamedFramebufferParameteriv(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        GL45C.glGetNamedFramebufferParameteriv(framebuffer, pname, params);
    }

    /** {@code void glGetNamedFramebufferParameteriv(GLuint framebuffer, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetNamedFramebufferParameteri(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int pname) {
        return GL45C.glGetNamedFramebufferParameteri(framebuffer, pname);
    }

    // --- [ glGetNamedFramebufferAttachmentParameteriv ] ---

    /** {@code void glGetNamedFramebufferAttachmentParameteriv(GLuint framebuffer, GLenum attachment, GLenum pname, GLint * params)} */
    public static void nglGetNamedFramebufferAttachmentParameteriv(int framebuffer, int attachment, int pname, long params) {
        GL45C.nglGetNamedFramebufferAttachmentParameteriv(framebuffer, attachment, pname, params);
    }

    /** {@code void glGetNamedFramebufferAttachmentParameteriv(GLuint framebuffer, GLenum attachment, GLenum pname, GLint * params)} */
    public static void glGetNamedFramebufferAttachmentParameteriv(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        GL45C.glGetNamedFramebufferAttachmentParameteriv(framebuffer, attachment, pname, params);
    }

    /** {@code void glGetNamedFramebufferAttachmentParameteriv(GLuint framebuffer, GLenum attachment, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetNamedFramebufferAttachmentParameteri(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLenum") int pname) {
        return GL45C.glGetNamedFramebufferAttachmentParameteri(framebuffer, attachment, pname);
    }

    // --- [ glCreateRenderbuffers ] ---

    /** {@code void glCreateRenderbuffers(GLsizei n, GLuint * renderbuffers)} */
    public static void nglCreateRenderbuffers(int n, long renderbuffers) {
        GL45C.nglCreateRenderbuffers(n, renderbuffers);
    }

    /** {@code void glCreateRenderbuffers(GLsizei n, GLuint * renderbuffers)} */
    public static void glCreateRenderbuffers(@NativeType("GLuint *") IntBuffer renderbuffers) {
        GL45C.glCreateRenderbuffers(renderbuffers);
    }

    /** {@code void glCreateRenderbuffers(GLsizei n, GLuint * renderbuffers)} */
    @NativeType("void")
    public static int glCreateRenderbuffers() {
        return GL45C.glCreateRenderbuffers();
    }

    // --- [ glNamedRenderbufferStorage ] ---

    /** {@code void glNamedRenderbufferStorage(GLuint renderbuffer, GLenum internalformat, GLsizei width, GLsizei height)} */
    public static void glNamedRenderbufferStorage(@NativeType("GLuint") int renderbuffer, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        GL45C.glNamedRenderbufferStorage(renderbuffer, internalformat, width, height);
    }

    // --- [ glNamedRenderbufferStorageMultisample ] ---

    /** {@code void glNamedRenderbufferStorageMultisample(GLuint renderbuffer, GLsizei samples, GLenum internalformat, GLsizei width, GLsizei height)} */
    public static void glNamedRenderbufferStorageMultisample(@NativeType("GLuint") int renderbuffer, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        GL45C.glNamedRenderbufferStorageMultisample(renderbuffer, samples, internalformat, width, height);
    }

    // --- [ glGetNamedRenderbufferParameteriv ] ---

    /** {@code void glGetNamedRenderbufferParameteriv(GLuint renderbuffer, GLenum pname, GLint * params)} */
    public static void nglGetNamedRenderbufferParameteriv(int renderbuffer, int pname, long params) {
        GL45C.nglGetNamedRenderbufferParameteriv(renderbuffer, pname, params);
    }

    /** {@code void glGetNamedRenderbufferParameteriv(GLuint renderbuffer, GLenum pname, GLint * params)} */
    public static void glGetNamedRenderbufferParameteriv(@NativeType("GLuint") int renderbuffer, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        GL45C.glGetNamedRenderbufferParameteriv(renderbuffer, pname, params);
    }

    /** {@code void glGetNamedRenderbufferParameteriv(GLuint renderbuffer, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetNamedRenderbufferParameteri(@NativeType("GLuint") int renderbuffer, @NativeType("GLenum") int pname) {
        return GL45C.glGetNamedRenderbufferParameteri(renderbuffer, pname);
    }

    // --- [ glCreateTextures ] ---

    /** {@code void glCreateTextures(GLenum target, GLsizei n, GLuint * textures)} */
    public static void nglCreateTextures(int target, int n, long textures) {
        GL45C.nglCreateTextures(target, n, textures);
    }

    /** {@code void glCreateTextures(GLenum target, GLsizei n, GLuint * textures)} */
    public static void glCreateTextures(@NativeType("GLenum") int target, @NativeType("GLuint *") IntBuffer textures) {
        GL45C.glCreateTextures(target, textures);
    }

    /** {@code void glCreateTextures(GLenum target, GLsizei n, GLuint * textures)} */
    @NativeType("void")
    public static int glCreateTextures(@NativeType("GLenum") int target) {
        return GL45C.glCreateTextures(target);
    }

    // --- [ glTextureBuffer ] ---

    /** {@code void glTextureBuffer(GLuint texture, GLenum internalformat, GLuint buffer)} */
    public static void glTextureBuffer(@NativeType("GLuint") int texture, @NativeType("GLenum") int internalformat, @NativeType("GLuint") int buffer) {
        GL45C.glTextureBuffer(texture, internalformat, buffer);
    }

    // --- [ glTextureBufferRange ] ---

    /** {@code void glTextureBufferRange(GLuint texture, GLenum internalformat, GLuint buffer, GLintptr offset, GLsizeiptr size)} */
    public static void glTextureBufferRange(@NativeType("GLuint") int texture, @NativeType("GLenum") int internalformat, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size) {
        GL45C.glTextureBufferRange(texture, internalformat, buffer, offset, size);
    }

    // --- [ glTextureStorage1D ] ---

    /** {@code void glTextureStorage1D(GLuint texture, GLsizei levels, GLenum internalformat, GLsizei width)} */
    public static void glTextureStorage1D(@NativeType("GLuint") int texture, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width) {
        GL45C.glTextureStorage1D(texture, levels, internalformat, width);
    }

    // --- [ glTextureStorage2D ] ---

    /** {@code void glTextureStorage2D(GLuint texture, GLsizei levels, GLenum internalformat, GLsizei width, GLsizei height)} */
    public static void glTextureStorage2D(@NativeType("GLuint") int texture, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        GL45C.glTextureStorage2D(texture, levels, internalformat, width, height);
    }

    // --- [ glTextureStorage3D ] ---

    /** {@code void glTextureStorage3D(GLuint texture, GLsizei levels, GLenum internalformat, GLsizei width, GLsizei height, GLsizei depth)} */
    public static void glTextureStorage3D(@NativeType("GLuint") int texture, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth) {
        GL45C.glTextureStorage3D(texture, levels, internalformat, width, height, depth);
    }

    // --- [ glTextureStorage2DMultisample ] ---

    /** {@code void glTextureStorage2DMultisample(GLuint texture, GLsizei samples, GLenum internalformat, GLsizei width, GLsizei height, GLboolean fixedsamplelocations)} */
    public static void glTextureStorage2DMultisample(@NativeType("GLuint") int texture, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLboolean") boolean fixedsamplelocations) {
        GL45C.glTextureStorage2DMultisample(texture, samples, internalformat, width, height, fixedsamplelocations);
    }

    // --- [ glTextureStorage3DMultisample ] ---

    /** {@code void glTextureStorage3DMultisample(GLuint texture, GLsizei samples, GLenum internalformat, GLsizei width, GLsizei height, GLsizei depth, GLboolean fixedsamplelocations)} */
    public static void glTextureStorage3DMultisample(@NativeType("GLuint") int texture, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLboolean") boolean fixedsamplelocations) {
        GL45C.glTextureStorage3DMultisample(texture, samples, internalformat, width, height, depth, fixedsamplelocations);
    }

    // --- [ glTextureSubImage1D ] ---

    /** {@code void glTextureSubImage1D(GLuint texture, GLint level, GLint xoffset, GLsizei width, GLenum format, GLenum type, void const * pixels)} */
    public static void nglTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int type, long pixels) {
        GL45C.nglTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
    }

    /** {@code void glTextureSubImage1D(GLuint texture, GLint level, GLint xoffset, GLsizei width, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer pixels) {
        GL45C.glTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
    }

    /** {@code void glTextureSubImage1D(GLuint texture, GLint level, GLint xoffset, GLsizei width, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        GL45C.glTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
    }

    /** {@code void glTextureSubImage1D(GLuint texture, GLint level, GLint xoffset, GLsizei width, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ShortBuffer pixels) {
        GL45C.glTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
    }

    /** {@code void glTextureSubImage1D(GLuint texture, GLint level, GLint xoffset, GLsizei width, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer pixels) {
        GL45C.glTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
    }

    /** {@code void glTextureSubImage1D(GLuint texture, GLint level, GLint xoffset, GLsizei width, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") FloatBuffer pixels) {
        GL45C.glTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
    }

    /** {@code void glTextureSubImage1D(GLuint texture, GLint level, GLint xoffset, GLsizei width, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") DoubleBuffer pixels) {
        GL45C.glTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
    }

    // --- [ glTextureSubImage2D ] ---

    /** {@code void glTextureSubImage2D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static void nglTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels) {
        GL45C.nglTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    /** {@code void glTextureSubImage2D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer pixels) {
        GL45C.glTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    /** {@code void glTextureSubImage2D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        GL45C.glTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    /** {@code void glTextureSubImage2D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ShortBuffer pixels) {
        GL45C.glTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    /** {@code void glTextureSubImage2D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer pixels) {
        GL45C.glTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    /** {@code void glTextureSubImage2D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") FloatBuffer pixels) {
        GL45C.glTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    /** {@code void glTextureSubImage2D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") DoubleBuffer pixels) {
        GL45C.glTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    // --- [ glTextureSubImage3D ] ---

    /** {@code void glTextureSubImage3D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void nglTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels) {
        GL45C.nglTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    /** {@code void glTextureSubImage3D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer pixels) {
        GL45C.glTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    /** {@code void glTextureSubImage3D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        GL45C.glTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    /** {@code void glTextureSubImage3D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ShortBuffer pixels) {
        GL45C.glTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    /** {@code void glTextureSubImage3D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer pixels) {
        GL45C.glTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    /** {@code void glTextureSubImage3D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") FloatBuffer pixels) {
        GL45C.glTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    /** {@code void glTextureSubImage3D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") DoubleBuffer pixels) {
        GL45C.glTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    // --- [ glCompressedTextureSubImage1D ] ---

    /** {@code void glCompressedTextureSubImage1D(GLuint texture, GLint level, GLint xoffset, GLsizei width, GLenum format, GLsizei imageSize, void const * data)} */
    public static void nglCompressedTextureSubImage1D(int texture, int level, int xoffset, int width, int format, int imageSize, long data) {
        GL45C.nglCompressedTextureSubImage1D(texture, level, xoffset, width, format, imageSize, data);
    }

    /** {@code void glCompressedTextureSubImage1D(GLuint texture, GLint level, GLint xoffset, GLsizei width, GLenum format, GLsizei imageSize, void const * data)} */
    public static void glCompressedTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        GL45C.glCompressedTextureSubImage1D(texture, level, xoffset, width, format, imageSize, data);
    }

    /** {@code void glCompressedTextureSubImage1D(GLuint texture, GLint level, GLint xoffset, GLsizei width, GLenum format, GLsizei imageSize, void const * data)} */
    public static void glCompressedTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("void const *") ByteBuffer data) {
        GL45C.glCompressedTextureSubImage1D(texture, level, xoffset, width, format, data);
    }

    // --- [ glCompressedTextureSubImage2D ] ---

    /** {@code void glCompressedTextureSubImage2D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLsizei imageSize, void const * data)} */
    public static void nglCompressedTextureSubImage2D(int texture, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long data) {
        GL45C.nglCompressedTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, imageSize, data);
    }

    /** {@code void glCompressedTextureSubImage2D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLsizei imageSize, void const * data)} */
    public static void glCompressedTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        GL45C.glCompressedTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, imageSize, data);
    }

    /** {@code void glCompressedTextureSubImage2D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLsizei imageSize, void const * data)} */
    public static void glCompressedTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("void const *") ByteBuffer data) {
        GL45C.glCompressedTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, data);
    }

    // --- [ glCompressedTextureSubImage3D ] ---

    /** {@code void glCompressedTextureSubImage3D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLsizei imageSize, void const * data)} */
    public static void nglCompressedTextureSubImage3D(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data) {
        GL45C.nglCompressedTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
    }

    /** {@code void glCompressedTextureSubImage3D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLsizei imageSize, void const * data)} */
    public static void glCompressedTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        GL45C.glCompressedTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
    }

    /** {@code void glCompressedTextureSubImage3D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLsizei imageSize, void const * data)} */
    public static void glCompressedTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("void const *") ByteBuffer data) {
        GL45C.glCompressedTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, data);
    }

    // --- [ glCopyTextureSubImage1D ] ---

    /** {@code void glCopyTextureSubImage1D(GLuint texture, GLint level, GLint xoffset, GLint x, GLint y, GLsizei width)} */
    public static void glCopyTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width) {
        GL45C.glCopyTextureSubImage1D(texture, level, xoffset, x, y, width);
    }

    // --- [ glCopyTextureSubImage2D ] ---

    /** {@code void glCopyTextureSubImage2D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint x, GLint y, GLsizei width, GLsizei height)} */
    public static void glCopyTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        GL45C.glCopyTextureSubImage2D(texture, level, xoffset, yoffset, x, y, width, height);
    }

    // --- [ glCopyTextureSubImage3D ] ---

    /** {@code void glCopyTextureSubImage3D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLint x, GLint y, GLsizei width, GLsizei height)} */
    public static void glCopyTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        GL45C.glCopyTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, x, y, width, height);
    }

    // --- [ glTextureParameterf ] ---

    /** {@code void glTextureParameterf(GLuint texture, GLenum pname, GLfloat param)} */
    public static void glTextureParameterf(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLfloat") float param) {
        GL45C.glTextureParameterf(texture, pname, param);
    }

    // --- [ glTextureParameterfv ] ---

    /** {@code void glTextureParameterfv(GLuint texture, GLenum pname, GLfloat const * params)} */
    public static void nglTextureParameterfv(int texture, int pname, long params) {
        GL45C.nglTextureParameterfv(texture, pname, params);
    }

    /** {@code void glTextureParameterfv(GLuint texture, GLenum pname, GLfloat const * params)} */
    public static void glTextureParameterfv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer params) {
        GL45C.glTextureParameterfv(texture, pname, params);
    }

    // --- [ glTextureParameteri ] ---

    /** {@code void glTextureParameteri(GLuint texture, GLenum pname, GLint param)} */
    public static void glTextureParameteri(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLint") int param) {
        GL45C.glTextureParameteri(texture, pname, param);
    }

    // --- [ glTextureParameterIiv ] ---

    /** {@code void glTextureParameterIiv(GLuint texture, GLenum pname, GLint const * params)} */
    public static void nglTextureParameterIiv(int texture, int pname, long params) {
        GL45C.nglTextureParameterIiv(texture, pname, params);
    }

    /** {@code void glTextureParameterIiv(GLuint texture, GLenum pname, GLint const * params)} */
    public static void glTextureParameterIiv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        GL45C.glTextureParameterIiv(texture, pname, params);
    }

    /** {@code void glTextureParameterIiv(GLuint texture, GLenum pname, GLint const * params)} */
    public static void glTextureParameterIi(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLint const *") int param) {
        GL45C.glTextureParameterIi(texture, pname, param);
    }

    // --- [ glTextureParameterIuiv ] ---

    /** {@code void glTextureParameterIuiv(GLuint texture, GLenum pname, GLuint const * params)} */
    public static void nglTextureParameterIuiv(int texture, int pname, long params) {
        GL45C.nglTextureParameterIuiv(texture, pname, params);
    }

    /** {@code void glTextureParameterIuiv(GLuint texture, GLenum pname, GLuint const * params)} */
    public static void glTextureParameterIuiv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLuint const *") IntBuffer params) {
        GL45C.glTextureParameterIuiv(texture, pname, params);
    }

    /** {@code void glTextureParameterIuiv(GLuint texture, GLenum pname, GLuint const * params)} */
    public static void glTextureParameterIui(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLuint const *") int param) {
        GL45C.glTextureParameterIui(texture, pname, param);
    }

    // --- [ glTextureParameteriv ] ---

    /** {@code void glTextureParameteriv(GLuint texture, GLenum pname, GLint const * params)} */
    public static void nglTextureParameteriv(int texture, int pname, long params) {
        GL45C.nglTextureParameteriv(texture, pname, params);
    }

    /** {@code void glTextureParameteriv(GLuint texture, GLenum pname, GLint const * params)} */
    public static void glTextureParameteriv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        GL45C.glTextureParameteriv(texture, pname, params);
    }

    // --- [ glGenerateTextureMipmap ] ---

    /** {@code void glGenerateTextureMipmap(GLuint texture)} */
    public static void glGenerateTextureMipmap(@NativeType("GLuint") int texture) {
        GL45C.glGenerateTextureMipmap(texture);
    }

    // --- [ glBindTextureUnit ] ---

    /** {@code void glBindTextureUnit(GLuint unit, GLuint texture)} */
    public static void glBindTextureUnit(@NativeType("GLuint") int unit, @NativeType("GLuint") int texture) {
        GL45C.glBindTextureUnit(unit, texture);
    }

    // --- [ glGetTextureImage ] ---

    /** {@code void glGetTextureImage(GLuint texture, GLint level, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void nglGetTextureImage(int texture, int level, int format, int type, int bufSize, long pixels) {
        GL45C.nglGetTextureImage(texture, level, format, type, bufSize, pixels);
    }

    /** {@code void glGetTextureImage(GLuint texture, GLint level, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glGetTextureImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("GLsizei") int bufSize, @NativeType("void *") long pixels) {
        GL45C.glGetTextureImage(texture, level, format, type, bufSize, pixels);
    }

    /** {@code void glGetTextureImage(GLuint texture, GLint level, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glGetTextureImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer pixels) {
        GL45C.glGetTextureImage(texture, level, format, type, pixels);
    }

    /** {@code void glGetTextureImage(GLuint texture, GLint level, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glGetTextureImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ShortBuffer pixels) {
        GL45C.glGetTextureImage(texture, level, format, type, pixels);
    }

    /** {@code void glGetTextureImage(GLuint texture, GLint level, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glGetTextureImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") IntBuffer pixels) {
        GL45C.glGetTextureImage(texture, level, format, type, pixels);
    }

    /** {@code void glGetTextureImage(GLuint texture, GLint level, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glGetTextureImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") FloatBuffer pixels) {
        GL45C.glGetTextureImage(texture, level, format, type, pixels);
    }

    /** {@code void glGetTextureImage(GLuint texture, GLint level, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glGetTextureImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") DoubleBuffer pixels) {
        GL45C.glGetTextureImage(texture, level, format, type, pixels);
    }

    // --- [ glGetCompressedTextureImage ] ---

    /** {@code void glGetCompressedTextureImage(GLuint texture, GLint level, GLsizei bufSize, void * pixels)} */
    public static void nglGetCompressedTextureImage(int texture, int level, int bufSize, long pixels) {
        GL45C.nglGetCompressedTextureImage(texture, level, bufSize, pixels);
    }

    /** {@code void glGetCompressedTextureImage(GLuint texture, GLint level, GLsizei bufSize, void * pixels)} */
    public static void glGetCompressedTextureImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLsizei") int bufSize, @NativeType("void *") long pixels) {
        GL45C.glGetCompressedTextureImage(texture, level, bufSize, pixels);
    }

    /** {@code void glGetCompressedTextureImage(GLuint texture, GLint level, GLsizei bufSize, void * pixels)} */
    public static void glGetCompressedTextureImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("void *") ByteBuffer pixels) {
        GL45C.glGetCompressedTextureImage(texture, level, pixels);
    }

    // --- [ glGetTextureLevelParameterfv ] ---

    /** {@code void glGetTextureLevelParameterfv(GLuint texture, GLint level, GLenum pname, GLfloat * params)} */
    public static void nglGetTextureLevelParameterfv(int texture, int level, int pname, long params) {
        GL45C.nglGetTextureLevelParameterfv(texture, level, pname, params);
    }

    /** {@code void glGetTextureLevelParameterfv(GLuint texture, GLint level, GLenum pname, GLfloat * params)} */
    public static void glGetTextureLevelParameterfv(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        GL45C.glGetTextureLevelParameterfv(texture, level, pname, params);
    }

    /** {@code void glGetTextureLevelParameterfv(GLuint texture, GLint level, GLenum pname, GLfloat * params)} */
    @NativeType("void")
    public static float glGetTextureLevelParameterf(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int pname) {
        return GL45C.glGetTextureLevelParameterf(texture, level, pname);
    }

    // --- [ glGetTextureLevelParameteriv ] ---

    /** {@code void glGetTextureLevelParameteriv(GLuint texture, GLint level, GLenum pname, GLint * params)} */
    public static void nglGetTextureLevelParameteriv(int texture, int level, int pname, long params) {
        GL45C.nglGetTextureLevelParameteriv(texture, level, pname, params);
    }

    /** {@code void glGetTextureLevelParameteriv(GLuint texture, GLint level, GLenum pname, GLint * params)} */
    public static void glGetTextureLevelParameteriv(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        GL45C.glGetTextureLevelParameteriv(texture, level, pname, params);
    }

    /** {@code void glGetTextureLevelParameteriv(GLuint texture, GLint level, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetTextureLevelParameteri(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int pname) {
        return GL45C.glGetTextureLevelParameteri(texture, level, pname);
    }

    // --- [ glGetTextureParameterfv ] ---

    /** {@code void glGetTextureParameterfv(GLuint texture, GLenum pname, GLfloat * params)} */
    public static void nglGetTextureParameterfv(int texture, int pname, long params) {
        GL45C.nglGetTextureParameterfv(texture, pname, params);
    }

    /** {@code void glGetTextureParameterfv(GLuint texture, GLenum pname, GLfloat * params)} */
    public static void glGetTextureParameterfv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        GL45C.glGetTextureParameterfv(texture, pname, params);
    }

    /** {@code void glGetTextureParameterfv(GLuint texture, GLenum pname, GLfloat * params)} */
    @NativeType("void")
    public static float glGetTextureParameterf(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname) {
        return GL45C.glGetTextureParameterf(texture, pname);
    }

    // --- [ glGetTextureParameterIiv ] ---

    /** {@code void glGetTextureParameterIiv(GLuint texture, GLenum pname, GLint * params)} */
    public static void nglGetTextureParameterIiv(int texture, int pname, long params) {
        GL45C.nglGetTextureParameterIiv(texture, pname, params);
    }

    /** {@code void glGetTextureParameterIiv(GLuint texture, GLenum pname, GLint * params)} */
    public static void glGetTextureParameterIiv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        GL45C.glGetTextureParameterIiv(texture, pname, params);
    }

    /** {@code void glGetTextureParameterIiv(GLuint texture, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetTextureParameterIi(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname) {
        return GL45C.glGetTextureParameterIi(texture, pname);
    }

    // --- [ glGetTextureParameterIuiv ] ---

    /** {@code void glGetTextureParameterIuiv(GLuint texture, GLenum pname, GLuint * params)} */
    public static void nglGetTextureParameterIuiv(int texture, int pname, long params) {
        GL45C.nglGetTextureParameterIuiv(texture, pname, params);
    }

    /** {@code void glGetTextureParameterIuiv(GLuint texture, GLenum pname, GLuint * params)} */
    public static void glGetTextureParameterIuiv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLuint *") IntBuffer params) {
        GL45C.glGetTextureParameterIuiv(texture, pname, params);
    }

    /** {@code void glGetTextureParameterIuiv(GLuint texture, GLenum pname, GLuint * params)} */
    @NativeType("void")
    public static int glGetTextureParameterIui(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname) {
        return GL45C.glGetTextureParameterIui(texture, pname);
    }

    // --- [ glGetTextureParameteriv ] ---

    /** {@code void glGetTextureParameteriv(GLuint texture, GLenum pname, GLint * params)} */
    public static void nglGetTextureParameteriv(int texture, int pname, long params) {
        GL45C.nglGetTextureParameteriv(texture, pname, params);
    }

    /** {@code void glGetTextureParameteriv(GLuint texture, GLenum pname, GLint * params)} */
    public static void glGetTextureParameteriv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        GL45C.glGetTextureParameteriv(texture, pname, params);
    }

    /** {@code void glGetTextureParameteriv(GLuint texture, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetTextureParameteri(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname) {
        return GL45C.glGetTextureParameteri(texture, pname);
    }

    // --- [ glCreateVertexArrays ] ---

    /** {@code void glCreateVertexArrays(GLsizei n, GLuint * arrays)} */
    public static void nglCreateVertexArrays(int n, long arrays) {
        GL45C.nglCreateVertexArrays(n, arrays);
    }

    /** {@code void glCreateVertexArrays(GLsizei n, GLuint * arrays)} */
    public static void glCreateVertexArrays(@NativeType("GLuint *") IntBuffer arrays) {
        GL45C.glCreateVertexArrays(arrays);
    }

    /** {@code void glCreateVertexArrays(GLsizei n, GLuint * arrays)} */
    @NativeType("void")
    public static int glCreateVertexArrays() {
        return GL45C.glCreateVertexArrays();
    }

    // --- [ glDisableVertexArrayAttrib ] ---

    /** {@code void glDisableVertexArrayAttrib(GLuint vaobj, GLuint index)} */
    public static void glDisableVertexArrayAttrib(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index) {
        GL45C.glDisableVertexArrayAttrib(vaobj, index);
    }

    // --- [ glEnableVertexArrayAttrib ] ---

    /** {@code void glEnableVertexArrayAttrib(GLuint vaobj, GLuint index)} */
    public static void glEnableVertexArrayAttrib(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index) {
        GL45C.glEnableVertexArrayAttrib(vaobj, index);
    }

    // --- [ glVertexArrayElementBuffer ] ---

    /** {@code void glVertexArrayElementBuffer(GLuint vaobj, GLuint buffer)} */
    public static void glVertexArrayElementBuffer(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int buffer) {
        GL45C.glVertexArrayElementBuffer(vaobj, buffer);
    }

    // --- [ glVertexArrayVertexBuffer ] ---

    /** {@code void glVertexArrayVertexBuffer(GLuint vaobj, GLuint bindingindex, GLuint buffer, GLintptr offset, GLsizei stride)} */
    public static void glVertexArrayVertexBuffer(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int bindingindex, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizei") int stride) {
        GL45C.glVertexArrayVertexBuffer(vaobj, bindingindex, buffer, offset, stride);
    }

    // --- [ glVertexArrayVertexBuffers ] ---

    /** {@code void glVertexArrayVertexBuffers(GLuint vaobj, GLuint first, GLsizei count, GLuint const * buffers, GLintptr const * offsets, GLsizei const * strides)} */
    public static void nglVertexArrayVertexBuffers(int vaobj, int first, int count, long buffers, long offsets, long strides) {
        GL45C.nglVertexArrayVertexBuffers(vaobj, first, count, buffers, offsets, strides);
    }

    /** {@code void glVertexArrayVertexBuffers(GLuint vaobj, GLuint first, GLsizei count, GLuint const * buffers, GLintptr const * offsets, GLsizei const * strides)} */
    public static void glVertexArrayVertexBuffers(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int first, @NativeType("GLuint const *") @Nullable IntBuffer buffers, @NativeType("GLintptr const *") @Nullable PointerBuffer offsets, @NativeType("GLsizei const *") @Nullable IntBuffer strides) {
        GL45C.glVertexArrayVertexBuffers(vaobj, first, buffers, offsets, strides);
    }

    // --- [ glVertexArrayAttribFormat ] ---

    /** {@code void glVertexArrayAttribFormat(GLuint vaobj, GLuint attribindex, GLint size, GLenum type, GLboolean normalized, GLuint relativeoffset)} */
    public static void glVertexArrayAttribFormat(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int attribindex, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint") int relativeoffset) {
        GL45C.glVertexArrayAttribFormat(vaobj, attribindex, size, type, normalized, relativeoffset);
    }

    // --- [ glVertexArrayAttribIFormat ] ---

    /** {@code void glVertexArrayAttribIFormat(GLuint vaobj, GLuint attribindex, GLint size, GLenum type, GLuint relativeoffset)} */
    public static void glVertexArrayAttribIFormat(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int attribindex, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLuint") int relativeoffset) {
        GL45C.glVertexArrayAttribIFormat(vaobj, attribindex, size, type, relativeoffset);
    }

    // --- [ glVertexArrayAttribLFormat ] ---

    /** {@code void glVertexArrayAttribLFormat(GLuint vaobj, GLuint attribindex, GLint size, GLenum type, GLuint relativeoffset)} */
    public static void glVertexArrayAttribLFormat(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int attribindex, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLuint") int relativeoffset) {
        GL45C.glVertexArrayAttribLFormat(vaobj, attribindex, size, type, relativeoffset);
    }

    // --- [ glVertexArrayAttribBinding ] ---

    /** {@code void glVertexArrayAttribBinding(GLuint vaobj, GLuint attribindex, GLuint bindingindex)} */
    public static void glVertexArrayAttribBinding(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int attribindex, @NativeType("GLuint") int bindingindex) {
        GL45C.glVertexArrayAttribBinding(vaobj, attribindex, bindingindex);
    }

    // --- [ glVertexArrayBindingDivisor ] ---

    /** {@code void glVertexArrayBindingDivisor(GLuint vaobj, GLuint bindingindex, GLuint divisor)} */
    public static void glVertexArrayBindingDivisor(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int bindingindex, @NativeType("GLuint") int divisor) {
        GL45C.glVertexArrayBindingDivisor(vaobj, bindingindex, divisor);
    }

    // --- [ glGetVertexArrayiv ] ---

    /** {@code void glGetVertexArrayiv(GLuint vaobj, GLenum pname, GLint * param)} */
    public static void nglGetVertexArrayiv(int vaobj, int pname, long param) {
        GL45C.nglGetVertexArrayiv(vaobj, pname, param);
    }

    /** {@code void glGetVertexArrayiv(GLuint vaobj, GLenum pname, GLint * param)} */
    public static void glGetVertexArrayiv(@NativeType("GLuint") int vaobj, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer param) {
        GL45C.glGetVertexArrayiv(vaobj, pname, param);
    }

    /** {@code void glGetVertexArrayiv(GLuint vaobj, GLenum pname, GLint * param)} */
    @NativeType("void")
    public static int glGetVertexArrayi(@NativeType("GLuint") int vaobj, @NativeType("GLenum") int pname) {
        return GL45C.glGetVertexArrayi(vaobj, pname);
    }

    // --- [ glGetVertexArrayIndexediv ] ---

    /** {@code void glGetVertexArrayIndexediv(GLuint vaobj, GLuint index, GLenum pname, GLint * param)} */
    public static void nglGetVertexArrayIndexediv(int vaobj, int index, int pname, long param) {
        GL45C.nglGetVertexArrayIndexediv(vaobj, index, pname, param);
    }

    /** {@code void glGetVertexArrayIndexediv(GLuint vaobj, GLuint index, GLenum pname, GLint * param)} */
    public static void glGetVertexArrayIndexediv(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer param) {
        GL45C.glGetVertexArrayIndexediv(vaobj, index, pname, param);
    }

    /** {@code void glGetVertexArrayIndexediv(GLuint vaobj, GLuint index, GLenum pname, GLint * param)} */
    @NativeType("void")
    public static int glGetVertexArrayIndexedi(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        return GL45C.glGetVertexArrayIndexedi(vaobj, index, pname);
    }

    // --- [ glGetVertexArrayIndexed64iv ] ---

    /** {@code void glGetVertexArrayIndexed64iv(GLuint vaobj, GLuint index, GLenum pname, GLint64 * param)} */
    public static void nglGetVertexArrayIndexed64iv(int vaobj, int index, int pname, long param) {
        GL45C.nglGetVertexArrayIndexed64iv(vaobj, index, pname, param);
    }

    /** {@code void glGetVertexArrayIndexed64iv(GLuint vaobj, GLuint index, GLenum pname, GLint64 * param)} */
    public static void glGetVertexArrayIndexed64iv(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint64 *") LongBuffer param) {
        GL45C.glGetVertexArrayIndexed64iv(vaobj, index, pname, param);
    }

    /** {@code void glGetVertexArrayIndexed64iv(GLuint vaobj, GLuint index, GLenum pname, GLint64 * param)} */
    @NativeType("void")
    public static long glGetVertexArrayIndexed64i(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        return GL45C.glGetVertexArrayIndexed64i(vaobj, index, pname);
    }

    // --- [ glCreateSamplers ] ---

    /** {@code void glCreateSamplers(GLsizei n, GLuint * samplers)} */
    public static void nglCreateSamplers(int n, long samplers) {
        GL45C.nglCreateSamplers(n, samplers);
    }

    /** {@code void glCreateSamplers(GLsizei n, GLuint * samplers)} */
    public static void glCreateSamplers(@NativeType("GLuint *") IntBuffer samplers) {
        GL45C.glCreateSamplers(samplers);
    }

    /** {@code void glCreateSamplers(GLsizei n, GLuint * samplers)} */
    @NativeType("void")
    public static int glCreateSamplers() {
        return GL45C.glCreateSamplers();
    }

    // --- [ glCreateProgramPipelines ] ---

    /** {@code void glCreateProgramPipelines(GLsizei n, GLuint * pipelines)} */
    public static void nglCreateProgramPipelines(int n, long pipelines) {
        GL45C.nglCreateProgramPipelines(n, pipelines);
    }

    /** {@code void glCreateProgramPipelines(GLsizei n, GLuint * pipelines)} */
    public static void glCreateProgramPipelines(@NativeType("GLuint *") IntBuffer pipelines) {
        GL45C.glCreateProgramPipelines(pipelines);
    }

    /** {@code void glCreateProgramPipelines(GLsizei n, GLuint * pipelines)} */
    @NativeType("void")
    public static int glCreateProgramPipelines() {
        return GL45C.glCreateProgramPipelines();
    }

    // --- [ glCreateQueries ] ---

    /** {@code void glCreateQueries(GLenum target, GLsizei n, GLuint * ids)} */
    public static void nglCreateQueries(int target, int n, long ids) {
        GL45C.nglCreateQueries(target, n, ids);
    }

    /** {@code void glCreateQueries(GLenum target, GLsizei n, GLuint * ids)} */
    public static void glCreateQueries(@NativeType("GLenum") int target, @NativeType("GLuint *") IntBuffer ids) {
        GL45C.glCreateQueries(target, ids);
    }

    /** {@code void glCreateQueries(GLenum target, GLsizei n, GLuint * ids)} */
    @NativeType("void")
    public static int glCreateQueries(@NativeType("GLenum") int target) {
        return GL45C.glCreateQueries(target);
    }

    // --- [ glGetQueryBufferObjecti64v ] ---

    /** {@code void glGetQueryBufferObjecti64v(GLuint id, GLuint buffer, GLenum pname, GLintptr offset)} */
    public static void glGetQueryBufferObjecti64v(@NativeType("GLuint") int id, @NativeType("GLuint") int buffer, @NativeType("GLenum") int pname, @NativeType("GLintptr") long offset) {
        GL45C.glGetQueryBufferObjecti64v(id, buffer, pname, offset);
    }

    // --- [ glGetQueryBufferObjectiv ] ---

    /** {@code void glGetQueryBufferObjectiv(GLuint id, GLuint buffer, GLenum pname, GLintptr offset)} */
    public static void glGetQueryBufferObjectiv(@NativeType("GLuint") int id, @NativeType("GLuint") int buffer, @NativeType("GLenum") int pname, @NativeType("GLintptr") long offset) {
        GL45C.glGetQueryBufferObjectiv(id, buffer, pname, offset);
    }

    // --- [ glGetQueryBufferObjectui64v ] ---

    /** {@code void glGetQueryBufferObjectui64v(GLuint id, GLuint buffer, GLenum pname, GLintptr offset)} */
    public static void glGetQueryBufferObjectui64v(@NativeType("GLuint") int id, @NativeType("GLuint") int buffer, @NativeType("GLenum") int pname, @NativeType("GLintptr") long offset) {
        GL45C.glGetQueryBufferObjectui64v(id, buffer, pname, offset);
    }

    // --- [ glGetQueryBufferObjectuiv ] ---

    /** {@code void glGetQueryBufferObjectuiv(GLuint id, GLuint buffer, GLenum pname, GLintptr offset)} */
    public static void glGetQueryBufferObjectuiv(@NativeType("GLuint") int id, @NativeType("GLuint") int buffer, @NativeType("GLenum") int pname, @NativeType("GLintptr") long offset) {
        GL45C.glGetQueryBufferObjectuiv(id, buffer, pname, offset);
    }

    /** {@code void glCreateTransformFeedbacks(GLsizei n, GLuint * ids)} */
    public static void glCreateTransformFeedbacks(@NativeType("GLuint *") int[] ids) {
        GL45C.glCreateTransformFeedbacks(ids);
    }

    /** {@code void glGetTransformFeedbackiv(GLuint xfb, GLenum pname, GLint * param)} */
    public static void glGetTransformFeedbackiv(@NativeType("GLuint") int xfb, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] param) {
        GL45C.glGetTransformFeedbackiv(xfb, pname, param);
    }

    /** {@code void glGetTransformFeedbacki_v(GLuint xfb, GLenum pname, GLuint index, GLint * param)} */
    public static void glGetTransformFeedbacki_v(@NativeType("GLuint") int xfb, @NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLint *") int[] param) {
        GL45C.glGetTransformFeedbacki_v(xfb, pname, index, param);
    }

    /** {@code void glGetTransformFeedbacki64_v(GLuint xfb, GLenum pname, GLuint index, GLint64 * param)} */
    public static void glGetTransformFeedbacki64_v(@NativeType("GLuint") int xfb, @NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLint64 *") long[] param) {
        GL45C.glGetTransformFeedbacki64_v(xfb, pname, index, param);
    }

    /** {@code void glCreateBuffers(GLsizei n, GLuint * buffers)} */
    public static void glCreateBuffers(@NativeType("GLuint *") int[] buffers) {
        GL45C.glCreateBuffers(buffers);
    }

    /** {@code void glNamedBufferStorage(GLuint buffer, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glNamedBufferStorage(@NativeType("GLuint") int buffer, @NativeType("void const *") short[] data, @NativeType("GLbitfield") int flags) {
        GL45C.glNamedBufferStorage(buffer, data, flags);
    }

    /** {@code void glNamedBufferStorage(GLuint buffer, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glNamedBufferStorage(@NativeType("GLuint") int buffer, @NativeType("void const *") int[] data, @NativeType("GLbitfield") int flags) {
        GL45C.glNamedBufferStorage(buffer, data, flags);
    }

    /** {@code void glNamedBufferStorage(GLuint buffer, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glNamedBufferStorage(@NativeType("GLuint") int buffer, @NativeType("void const *") float[] data, @NativeType("GLbitfield") int flags) {
        GL45C.glNamedBufferStorage(buffer, data, flags);
    }

    /** {@code void glNamedBufferStorage(GLuint buffer, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glNamedBufferStorage(@NativeType("GLuint") int buffer, @NativeType("void const *") double[] data, @NativeType("GLbitfield") int flags) {
        GL45C.glNamedBufferStorage(buffer, data, flags);
    }

    /** {@code void glNamedBufferData(GLuint buffer, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("void const *") short[] data, @NativeType("GLenum") int usage) {
        GL45C.glNamedBufferData(buffer, data, usage);
    }

    /** {@code void glNamedBufferData(GLuint buffer, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("void const *") int[] data, @NativeType("GLenum") int usage) {
        GL45C.glNamedBufferData(buffer, data, usage);
    }

    /** {@code void glNamedBufferData(GLuint buffer, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("void const *") long[] data, @NativeType("GLenum") int usage) {
        GL45C.glNamedBufferData(buffer, data, usage);
    }

    /** {@code void glNamedBufferData(GLuint buffer, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("void const *") float[] data, @NativeType("GLenum") int usage) {
        GL45C.glNamedBufferData(buffer, data, usage);
    }

    /** {@code void glNamedBufferData(GLuint buffer, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("void const *") double[] data, @NativeType("GLenum") int usage) {
        GL45C.glNamedBufferData(buffer, data, usage);
    }

    /** {@code void glNamedBufferSubData(GLuint buffer, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") short[] data) {
        GL45C.glNamedBufferSubData(buffer, offset, data);
    }

    /** {@code void glNamedBufferSubData(GLuint buffer, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") int[] data) {
        GL45C.glNamedBufferSubData(buffer, offset, data);
    }

    /** {@code void glNamedBufferSubData(GLuint buffer, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") long[] data) {
        GL45C.glNamedBufferSubData(buffer, offset, data);
    }

    /** {@code void glNamedBufferSubData(GLuint buffer, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") float[] data) {
        GL45C.glNamedBufferSubData(buffer, offset, data);
    }

    /** {@code void glNamedBufferSubData(GLuint buffer, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void const *") double[] data) {
        GL45C.glNamedBufferSubData(buffer, offset, data);
    }

    /** {@code void glClearNamedBufferData(GLuint buffer, GLenum internalformat, GLenum format, GLenum type, void const * data)} */
    public static void glClearNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short @Nullable [] data) {
        GL45C.glClearNamedBufferData(buffer, internalformat, format, type, data);
    }

    /** {@code void glClearNamedBufferData(GLuint buffer, GLenum internalformat, GLenum format, GLenum type, void const * data)} */
    public static void glClearNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int @Nullable [] data) {
        GL45C.glClearNamedBufferData(buffer, internalformat, format, type, data);
    }

    /** {@code void glClearNamedBufferData(GLuint buffer, GLenum internalformat, GLenum format, GLenum type, void const * data)} */
    public static void glClearNamedBufferData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float @Nullable [] data) {
        GL45C.glClearNamedBufferData(buffer, internalformat, format, type, data);
    }

    /** {@code void glClearNamedBufferSubData(GLuint buffer, GLenum internalformat, GLintptr offset, GLsizeiptr size, GLenum format, GLenum type, void const * data)} */
    public static void glClearNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short @Nullable [] data) {
        GL45C.glClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, data);
    }

    /** {@code void glClearNamedBufferSubData(GLuint buffer, GLenum internalformat, GLintptr offset, GLsizeiptr size, GLenum format, GLenum type, void const * data)} */
    public static void glClearNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int @Nullable [] data) {
        GL45C.glClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, data);
    }

    /** {@code void glClearNamedBufferSubData(GLuint buffer, GLenum internalformat, GLintptr offset, GLsizeiptr size, GLenum format, GLenum type, void const * data)} */
    public static void glClearNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float @Nullable [] data) {
        GL45C.glClearNamedBufferSubData(buffer, internalformat, offset, size, format, type, data);
    }

    /** {@code void glGetNamedBufferParameteriv(GLuint buffer, GLenum pname, GLint * params)} */
    public static void glGetNamedBufferParameteriv(@NativeType("GLuint") int buffer, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        GL45C.glGetNamedBufferParameteriv(buffer, pname, params);
    }

    /** {@code void glGetNamedBufferParameteri64v(GLuint buffer, GLenum pname, GLint64 * params)} */
    public static void glGetNamedBufferParameteri64v(@NativeType("GLuint") int buffer, @NativeType("GLenum") int pname, @NativeType("GLint64 *") long[] params) {
        GL45C.glGetNamedBufferParameteri64v(buffer, pname, params);
    }

    /** {@code void glGetNamedBufferSubData(GLuint buffer, GLintptr offset, GLsizeiptr size, void * data)} */
    public static void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") short[] data) {
        GL45C.glGetNamedBufferSubData(buffer, offset, data);
    }

    /** {@code void glGetNamedBufferSubData(GLuint buffer, GLintptr offset, GLsizeiptr size, void * data)} */
    public static void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") int[] data) {
        GL45C.glGetNamedBufferSubData(buffer, offset, data);
    }

    /** {@code void glGetNamedBufferSubData(GLuint buffer, GLintptr offset, GLsizeiptr size, void * data)} */
    public static void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") long[] data) {
        GL45C.glGetNamedBufferSubData(buffer, offset, data);
    }

    /** {@code void glGetNamedBufferSubData(GLuint buffer, GLintptr offset, GLsizeiptr size, void * data)} */
    public static void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") float[] data) {
        GL45C.glGetNamedBufferSubData(buffer, offset, data);
    }

    /** {@code void glGetNamedBufferSubData(GLuint buffer, GLintptr offset, GLsizeiptr size, void * data)} */
    public static void glGetNamedBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("void *") double[] data) {
        GL45C.glGetNamedBufferSubData(buffer, offset, data);
    }

    /** {@code void glCreateFramebuffers(GLsizei n, GLuint * framebuffers)} */
    public static void glCreateFramebuffers(@NativeType("GLuint *") int[] framebuffers) {
        GL45C.glCreateFramebuffers(framebuffers);
    }

    /** {@code void glNamedFramebufferDrawBuffers(GLuint framebuffer, GLsizei n, GLenum const * bufs)} */
    public static void glNamedFramebufferDrawBuffers(@NativeType("GLuint") int framebuffer, @NativeType("GLenum const *") int[] bufs) {
        GL45C.glNamedFramebufferDrawBuffers(framebuffer, bufs);
    }

    /** {@code void glInvalidateNamedFramebufferData(GLuint framebuffer, GLsizei numAttachments, GLenum const * attachments)} */
    public static void glInvalidateNamedFramebufferData(@NativeType("GLuint") int framebuffer, @NativeType("GLenum const *") int[] attachments) {
        GL45C.glInvalidateNamedFramebufferData(framebuffer, attachments);
    }

    /** {@code void glInvalidateNamedFramebufferSubData(GLuint framebuffer, GLsizei numAttachments, GLenum const * attachments, GLint x, GLint y, GLsizei width, GLsizei height)} */
    public static void glInvalidateNamedFramebufferSubData(@NativeType("GLuint") int framebuffer, @NativeType("GLenum const *") int[] attachments, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        GL45C.glInvalidateNamedFramebufferSubData(framebuffer, attachments, x, y, width, height);
    }

    /** {@code void glClearNamedFramebufferiv(GLuint framebuffer, GLenum buffer, GLint drawbuffer, GLint const * value)} */
    public static void glClearNamedFramebufferiv(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLint const *") int[] value) {
        GL45C.glClearNamedFramebufferiv(framebuffer, buffer, drawbuffer, value);
    }

    /** {@code void glClearNamedFramebufferuiv(GLuint framebuffer, GLenum buffer, GLint drawbuffer, GLint const * value)} */
    public static void glClearNamedFramebufferuiv(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLint const *") int[] value) {
        GL45C.glClearNamedFramebufferuiv(framebuffer, buffer, drawbuffer, value);
    }

    /** {@code void glClearNamedFramebufferfv(GLuint framebuffer, GLenum buffer, GLint drawbuffer, GLfloat const * value)} */
    public static void glClearNamedFramebufferfv(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLfloat const *") float[] value) {
        GL45C.glClearNamedFramebufferfv(framebuffer, buffer, drawbuffer, value);
    }

    /** {@code void glGetNamedFramebufferParameteriv(GLuint framebuffer, GLenum pname, GLint * params)} */
    public static void glGetNamedFramebufferParameteriv(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        GL45C.glGetNamedFramebufferParameteriv(framebuffer, pname, params);
    }

    /** {@code void glGetNamedFramebufferAttachmentParameteriv(GLuint framebuffer, GLenum attachment, GLenum pname, GLint * params)} */
    public static void glGetNamedFramebufferAttachmentParameteriv(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int attachment, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        GL45C.glGetNamedFramebufferAttachmentParameteriv(framebuffer, attachment, pname, params);
    }

    /** {@code void glCreateRenderbuffers(GLsizei n, GLuint * renderbuffers)} */
    public static void glCreateRenderbuffers(@NativeType("GLuint *") int[] renderbuffers) {
        GL45C.glCreateRenderbuffers(renderbuffers);
    }

    /** {@code void glGetNamedRenderbufferParameteriv(GLuint renderbuffer, GLenum pname, GLint * params)} */
    public static void glGetNamedRenderbufferParameteriv(@NativeType("GLuint") int renderbuffer, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        GL45C.glGetNamedRenderbufferParameteriv(renderbuffer, pname, params);
    }

    /** {@code void glCreateTextures(GLenum target, GLsizei n, GLuint * textures)} */
    public static void glCreateTextures(@NativeType("GLenum") int target, @NativeType("GLuint *") int[] textures) {
        GL45C.glCreateTextures(target, textures);
    }

    /** {@code void glTextureSubImage1D(GLuint texture, GLint level, GLint xoffset, GLsizei width, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short[] pixels) {
        GL45C.glTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
    }

    /** {@code void glTextureSubImage1D(GLuint texture, GLint level, GLint xoffset, GLsizei width, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int[] pixels) {
        GL45C.glTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
    }

    /** {@code void glTextureSubImage1D(GLuint texture, GLint level, GLint xoffset, GLsizei width, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float[] pixels) {
        GL45C.glTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
    }

    /** {@code void glTextureSubImage1D(GLuint texture, GLint level, GLint xoffset, GLsizei width, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage1D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLsizei") int width, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") double[] pixels) {
        GL45C.glTextureSubImage1D(texture, level, xoffset, width, format, type, pixels);
    }

    /** {@code void glTextureSubImage2D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short[] pixels) {
        GL45C.glTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    /** {@code void glTextureSubImage2D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int[] pixels) {
        GL45C.glTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    /** {@code void glTextureSubImage2D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float[] pixels) {
        GL45C.glTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    /** {@code void glTextureSubImage2D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage2D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") double[] pixels) {
        GL45C.glTextureSubImage2D(texture, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    /** {@code void glTextureSubImage3D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short[] pixels) {
        GL45C.glTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    /** {@code void glTextureSubImage3D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int[] pixels) {
        GL45C.glTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    /** {@code void glTextureSubImage3D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float[] pixels) {
        GL45C.glTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    /** {@code void glTextureSubImage3D(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glTextureSubImage3D(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") double[] pixels) {
        GL45C.glTextureSubImage3D(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    /** {@code void glTextureParameterfv(GLuint texture, GLenum pname, GLfloat const * params)} */
    public static void glTextureParameterfv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") float[] params) {
        GL45C.glTextureParameterfv(texture, pname, params);
    }

    /** {@code void glTextureParameterIiv(GLuint texture, GLenum pname, GLint const * params)} */
    public static void glTextureParameterIiv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        GL45C.glTextureParameterIiv(texture, pname, params);
    }

    /** {@code void glTextureParameterIuiv(GLuint texture, GLenum pname, GLuint const * params)} */
    public static void glTextureParameterIuiv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLuint const *") int[] params) {
        GL45C.glTextureParameterIuiv(texture, pname, params);
    }

    /** {@code void glTextureParameteriv(GLuint texture, GLenum pname, GLint const * params)} */
    public static void glTextureParameteriv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        GL45C.glTextureParameteriv(texture, pname, params);
    }

    /** {@code void glGetTextureImage(GLuint texture, GLint level, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glGetTextureImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") short[] pixels) {
        GL45C.glGetTextureImage(texture, level, format, type, pixels);
    }

    /** {@code void glGetTextureImage(GLuint texture, GLint level, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glGetTextureImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") int[] pixels) {
        GL45C.glGetTextureImage(texture, level, format, type, pixels);
    }

    /** {@code void glGetTextureImage(GLuint texture, GLint level, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glGetTextureImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") float[] pixels) {
        GL45C.glGetTextureImage(texture, level, format, type, pixels);
    }

    /** {@code void glGetTextureImage(GLuint texture, GLint level, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glGetTextureImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") double[] pixels) {
        GL45C.glGetTextureImage(texture, level, format, type, pixels);
    }

    /** {@code void glGetTextureLevelParameterfv(GLuint texture, GLint level, GLenum pname, GLfloat * params)} */
    public static void glGetTextureLevelParameterfv(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        GL45C.glGetTextureLevelParameterfv(texture, level, pname, params);
    }

    /** {@code void glGetTextureLevelParameteriv(GLuint texture, GLint level, GLenum pname, GLint * params)} */
    public static void glGetTextureLevelParameteriv(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        GL45C.glGetTextureLevelParameteriv(texture, level, pname, params);
    }

    /** {@code void glGetTextureParameterfv(GLuint texture, GLenum pname, GLfloat * params)} */
    public static void glGetTextureParameterfv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        GL45C.glGetTextureParameterfv(texture, pname, params);
    }

    /** {@code void glGetTextureParameterIiv(GLuint texture, GLenum pname, GLint * params)} */
    public static void glGetTextureParameterIiv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        GL45C.glGetTextureParameterIiv(texture, pname, params);
    }

    /** {@code void glGetTextureParameterIuiv(GLuint texture, GLenum pname, GLuint * params)} */
    public static void glGetTextureParameterIuiv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] params) {
        GL45C.glGetTextureParameterIuiv(texture, pname, params);
    }

    /** {@code void glGetTextureParameteriv(GLuint texture, GLenum pname, GLint * params)} */
    public static void glGetTextureParameteriv(@NativeType("GLuint") int texture, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        GL45C.glGetTextureParameteriv(texture, pname, params);
    }

    /** {@code void glCreateVertexArrays(GLsizei n, GLuint * arrays)} */
    public static void glCreateVertexArrays(@NativeType("GLuint *") int[] arrays) {
        GL45C.glCreateVertexArrays(arrays);
    }

    /** {@code void glVertexArrayVertexBuffers(GLuint vaobj, GLuint first, GLsizei count, GLuint const * buffers, GLintptr const * offsets, GLsizei const * strides)} */
    public static void glVertexArrayVertexBuffers(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int first, @NativeType("GLuint const *") int @Nullable [] buffers, @NativeType("GLintptr const *") @Nullable PointerBuffer offsets, @NativeType("GLsizei const *") int @Nullable [] strides) {
        GL45C.glVertexArrayVertexBuffers(vaobj, first, buffers, offsets, strides);
    }

    /** {@code void glGetVertexArrayiv(GLuint vaobj, GLenum pname, GLint * param)} */
    public static void glGetVertexArrayiv(@NativeType("GLuint") int vaobj, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] param) {
        GL45C.glGetVertexArrayiv(vaobj, pname, param);
    }

    /** {@code void glGetVertexArrayIndexediv(GLuint vaobj, GLuint index, GLenum pname, GLint * param)} */
    public static void glGetVertexArrayIndexediv(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] param) {
        GL45C.glGetVertexArrayIndexediv(vaobj, index, pname, param);
    }

    /** {@code void glGetVertexArrayIndexed64iv(GLuint vaobj, GLuint index, GLenum pname, GLint64 * param)} */
    public static void glGetVertexArrayIndexed64iv(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint64 *") long[] param) {
        GL45C.glGetVertexArrayIndexed64iv(vaobj, index, pname, param);
    }

    /** {@code void glCreateSamplers(GLsizei n, GLuint * samplers)} */
    public static void glCreateSamplers(@NativeType("GLuint *") int[] samplers) {
        GL45C.glCreateSamplers(samplers);
    }

    /** {@code void glCreateProgramPipelines(GLsizei n, GLuint * pipelines)} */
    public static void glCreateProgramPipelines(@NativeType("GLuint *") int[] pipelines) {
        GL45C.glCreateProgramPipelines(pipelines);
    }

    /** {@code void glCreateQueries(GLenum target, GLsizei n, GLuint * ids)} */
    public static void glCreateQueries(@NativeType("GLenum") int target, @NativeType("GLuint *") int[] ids) {
        GL45C.glCreateQueries(target, ids);
    }

}
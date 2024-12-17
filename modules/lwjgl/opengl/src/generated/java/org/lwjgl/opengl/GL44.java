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

public class GL44 extends GL43 {

    static { GL.initialize(); }

    public static final int GL_MAX_VERTEX_ATTRIB_STRIDE = 0x82E5;

    public static final int GL_PRIMITIVE_RESTART_FOR_PATCHES_SUPPORTED = 0x8221;

    public static final int GL_TEXTURE_BUFFER_BINDING = 0x8C2A;

    public static final int
        GL_MAP_PERSISTENT_BIT  = 0x40,
        GL_MAP_COHERENT_BIT    = 0x80,
        GL_DYNAMIC_STORAGE_BIT = 0x100,
        GL_CLIENT_STORAGE_BIT  = 0x200;

    public static final int
        GL_BUFFER_IMMUTABLE_STORAGE = 0x821F,
        GL_BUFFER_STORAGE_FLAGS     = 0x8220;

    public static final int GL_CLIENT_MAPPED_BUFFER_BARRIER_BIT = 0x4000;

    public static final int GL_CLEAR_TEXTURE = 0x9365;

    public static final int
        GL_LOCATION_COMPONENT               = 0x934A,
        GL_TRANSFORM_FEEDBACK_BUFFER_INDEX  = 0x934B,
        GL_TRANSFORM_FEEDBACK_BUFFER_STRIDE = 0x934C;

    public static final int GL_QUERY_RESULT_NO_WAIT = 0x9194;

    public static final int GL_QUERY_BUFFER = 0x9192;

    public static final int GL_QUERY_BUFFER_BINDING = 0x9193;

    public static final int GL_QUERY_BUFFER_BARRIER_BIT = 0x8000;

    public static final int GL_MIRROR_CLAMP_TO_EDGE = 0x8743;

    protected GL44() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBufferStorage ] ---

    /** {@code void glBufferStorage(GLenum target, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void nglBufferStorage(int target, long size, long data, int flags) {
        GL44C.nglBufferStorage(target, size, data, flags);
    }

    /** {@code void glBufferStorage(GLenum target, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glBufferStorage(@NativeType("GLenum") int target, @NativeType("GLsizeiptr") long size, @NativeType("GLbitfield") int flags) {
        GL44C.glBufferStorage(target, size, flags);
    }

    /** {@code void glBufferStorage(GLenum target, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glBufferStorage(@NativeType("GLenum") int target, @NativeType("void const *") ByteBuffer data, @NativeType("GLbitfield") int flags) {
        GL44C.glBufferStorage(target, data, flags);
    }

    /** {@code void glBufferStorage(GLenum target, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glBufferStorage(@NativeType("GLenum") int target, @NativeType("void const *") ShortBuffer data, @NativeType("GLbitfield") int flags) {
        GL44C.glBufferStorage(target, data, flags);
    }

    /** {@code void glBufferStorage(GLenum target, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glBufferStorage(@NativeType("GLenum") int target, @NativeType("void const *") IntBuffer data, @NativeType("GLbitfield") int flags) {
        GL44C.glBufferStorage(target, data, flags);
    }

    /** {@code void glBufferStorage(GLenum target, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glBufferStorage(@NativeType("GLenum") int target, @NativeType("void const *") FloatBuffer data, @NativeType("GLbitfield") int flags) {
        GL44C.glBufferStorage(target, data, flags);
    }

    /** {@code void glBufferStorage(GLenum target, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glBufferStorage(@NativeType("GLenum") int target, @NativeType("void const *") DoubleBuffer data, @NativeType("GLbitfield") int flags) {
        GL44C.glBufferStorage(target, data, flags);
    }

    // --- [ glClearTexSubImage ] ---

    /** {@code void glClearTexSubImage(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * data)} */
    public static void nglClearTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long data) {
        GL44C.nglClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
    }

    /** {@code void glClearTexSubImage(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * data)} */
    public static void glClearTexSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable ByteBuffer data) {
        GL44C.glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
    }

    /** {@code void glClearTexSubImage(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * data)} */
    public static void glClearTexSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable ShortBuffer data) {
        GL44C.glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
    }

    /** {@code void glClearTexSubImage(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * data)} */
    public static void glClearTexSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable IntBuffer data) {
        GL44C.glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
    }

    /** {@code void glClearTexSubImage(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * data)} */
    public static void glClearTexSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable FloatBuffer data) {
        GL44C.glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
    }

    /** {@code void glClearTexSubImage(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * data)} */
    public static void glClearTexSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable DoubleBuffer data) {
        GL44C.glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
    }

    // --- [ glClearTexImage ] ---

    /** {@code void glClearTexImage(GLuint texture, GLint level, GLenum format, GLenum type, void const * data)} */
    public static void nglClearTexImage(int texture, int level, int format, int type, long data) {
        GL44C.nglClearTexImage(texture, level, format, type, data);
    }

    /** {@code void glClearTexImage(GLuint texture, GLint level, GLenum format, GLenum type, void const * data)} */
    public static void glClearTexImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable ByteBuffer data) {
        GL44C.glClearTexImage(texture, level, format, type, data);
    }

    /** {@code void glClearTexImage(GLuint texture, GLint level, GLenum format, GLenum type, void const * data)} */
    public static void glClearTexImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable ShortBuffer data) {
        GL44C.glClearTexImage(texture, level, format, type, data);
    }

    /** {@code void glClearTexImage(GLuint texture, GLint level, GLenum format, GLenum type, void const * data)} */
    public static void glClearTexImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable IntBuffer data) {
        GL44C.glClearTexImage(texture, level, format, type, data);
    }

    /** {@code void glClearTexImage(GLuint texture, GLint level, GLenum format, GLenum type, void const * data)} */
    public static void glClearTexImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable FloatBuffer data) {
        GL44C.glClearTexImage(texture, level, format, type, data);
    }

    /** {@code void glClearTexImage(GLuint texture, GLint level, GLenum format, GLenum type, void const * data)} */
    public static void glClearTexImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable DoubleBuffer data) {
        GL44C.glClearTexImage(texture, level, format, type, data);
    }

    // --- [ glBindBuffersBase ] ---

    /** {@code void glBindBuffersBase(GLenum target, GLuint first, GLsizei count, GLuint const * buffers)} */
    public static void nglBindBuffersBase(int target, int first, int count, long buffers) {
        GL44C.nglBindBuffersBase(target, first, count, buffers);
    }

    /** {@code void glBindBuffersBase(GLenum target, GLuint first, GLsizei count, GLuint const * buffers)} */
    public static void glBindBuffersBase(@NativeType("GLenum") int target, @NativeType("GLuint") int first, @NativeType("GLuint const *") @Nullable IntBuffer buffers) {
        GL44C.glBindBuffersBase(target, first, buffers);
    }

    // --- [ glBindBuffersRange ] ---

    /** {@code void glBindBuffersRange(GLenum target, GLuint first, GLsizei count, GLuint const * buffers, GLintptr const * offsets, GLsizeiptr const * sizes)} */
    public static void nglBindBuffersRange(int target, int first, int count, long buffers, long offsets, long sizes) {
        GL44C.nglBindBuffersRange(target, first, count, buffers, offsets, sizes);
    }

    /** {@code void glBindBuffersRange(GLenum target, GLuint first, GLsizei count, GLuint const * buffers, GLintptr const * offsets, GLsizeiptr const * sizes)} */
    public static void glBindBuffersRange(@NativeType("GLenum") int target, @NativeType("GLuint") int first, @NativeType("GLuint const *") @Nullable IntBuffer buffers, @NativeType("GLintptr const *") @Nullable PointerBuffer offsets, @NativeType("GLsizeiptr const *") @Nullable PointerBuffer sizes) {
        GL44C.glBindBuffersRange(target, first, buffers, offsets, sizes);
    }

    // --- [ glBindTextures ] ---

    /** {@code void glBindTextures(GLuint first, GLsizei count, GLuint const * textures)} */
    public static void nglBindTextures(int first, int count, long textures) {
        GL44C.nglBindTextures(first, count, textures);
    }

    /** {@code void glBindTextures(GLuint first, GLsizei count, GLuint const * textures)} */
    public static void glBindTextures(@NativeType("GLuint") int first, @NativeType("GLuint const *") @Nullable IntBuffer textures) {
        GL44C.glBindTextures(first, textures);
    }

    // --- [ glBindSamplers ] ---

    /** {@code void glBindSamplers(GLuint first, GLsizei count, GLuint const * samplers)} */
    public static void nglBindSamplers(int first, int count, long samplers) {
        GL44C.nglBindSamplers(first, count, samplers);
    }

    /** {@code void glBindSamplers(GLuint first, GLsizei count, GLuint const * samplers)} */
    public static void glBindSamplers(@NativeType("GLuint") int first, @NativeType("GLuint const *") @Nullable IntBuffer samplers) {
        GL44C.glBindSamplers(first, samplers);
    }

    // --- [ glBindImageTextures ] ---

    /** {@code void glBindImageTextures(GLuint first, GLsizei count, GLuint const * textures)} */
    public static void nglBindImageTextures(int first, int count, long textures) {
        GL44C.nglBindImageTextures(first, count, textures);
    }

    /** {@code void glBindImageTextures(GLuint first, GLsizei count, GLuint const * textures)} */
    public static void glBindImageTextures(@NativeType("GLuint") int first, @NativeType("GLuint const *") @Nullable IntBuffer textures) {
        GL44C.glBindImageTextures(first, textures);
    }

    // --- [ glBindVertexBuffers ] ---

    /** {@code void glBindVertexBuffers(GLuint first, GLsizei count, GLuint const * buffers, GLintptr const * offsets, GLsizei const * strides)} */
    public static void nglBindVertexBuffers(int first, int count, long buffers, long offsets, long strides) {
        GL44C.nglBindVertexBuffers(first, count, buffers, offsets, strides);
    }

    /** {@code void glBindVertexBuffers(GLuint first, GLsizei count, GLuint const * buffers, GLintptr const * offsets, GLsizei const * strides)} */
    public static void glBindVertexBuffers(@NativeType("GLuint") int first, @NativeType("GLuint const *") @Nullable IntBuffer buffers, @NativeType("GLintptr const *") @Nullable PointerBuffer offsets, @NativeType("GLsizei const *") @Nullable IntBuffer strides) {
        GL44C.glBindVertexBuffers(first, buffers, offsets, strides);
    }

    /** {@code void glBufferStorage(GLenum target, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glBufferStorage(@NativeType("GLenum") int target, @NativeType("void const *") short[] data, @NativeType("GLbitfield") int flags) {
        GL44C.glBufferStorage(target, data, flags);
    }

    /** {@code void glBufferStorage(GLenum target, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glBufferStorage(@NativeType("GLenum") int target, @NativeType("void const *") int[] data, @NativeType("GLbitfield") int flags) {
        GL44C.glBufferStorage(target, data, flags);
    }

    /** {@code void glBufferStorage(GLenum target, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glBufferStorage(@NativeType("GLenum") int target, @NativeType("void const *") float[] data, @NativeType("GLbitfield") int flags) {
        GL44C.glBufferStorage(target, data, flags);
    }

    /** {@code void glBufferStorage(GLenum target, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glBufferStorage(@NativeType("GLenum") int target, @NativeType("void const *") double[] data, @NativeType("GLbitfield") int flags) {
        GL44C.glBufferStorage(target, data, flags);
    }

    /** {@code void glClearTexSubImage(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * data)} */
    public static void glClearTexSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short @Nullable [] data) {
        GL44C.glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
    }

    /** {@code void glClearTexSubImage(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * data)} */
    public static void glClearTexSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int @Nullable [] data) {
        GL44C.glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
    }

    /** {@code void glClearTexSubImage(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * data)} */
    public static void glClearTexSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float @Nullable [] data) {
        GL44C.glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
    }

    /** {@code void glClearTexSubImage(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * data)} */
    public static void glClearTexSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") double @Nullable [] data) {
        GL44C.glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
    }

    /** {@code void glClearTexImage(GLuint texture, GLint level, GLenum format, GLenum type, void const * data)} */
    public static void glClearTexImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short @Nullable [] data) {
        GL44C.glClearTexImage(texture, level, format, type, data);
    }

    /** {@code void glClearTexImage(GLuint texture, GLint level, GLenum format, GLenum type, void const * data)} */
    public static void glClearTexImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int @Nullable [] data) {
        GL44C.glClearTexImage(texture, level, format, type, data);
    }

    /** {@code void glClearTexImage(GLuint texture, GLint level, GLenum format, GLenum type, void const * data)} */
    public static void glClearTexImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float @Nullable [] data) {
        GL44C.glClearTexImage(texture, level, format, type, data);
    }

    /** {@code void glClearTexImage(GLuint texture, GLint level, GLenum format, GLenum type, void const * data)} */
    public static void glClearTexImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") double @Nullable [] data) {
        GL44C.glClearTexImage(texture, level, format, type, data);
    }

    /** {@code void glBindBuffersBase(GLenum target, GLuint first, GLsizei count, GLuint const * buffers)} */
    public static void glBindBuffersBase(@NativeType("GLenum") int target, @NativeType("GLuint") int first, @NativeType("GLuint const *") int @Nullable [] buffers) {
        GL44C.glBindBuffersBase(target, first, buffers);
    }

    /** {@code void glBindBuffersRange(GLenum target, GLuint first, GLsizei count, GLuint const * buffers, GLintptr const * offsets, GLsizeiptr const * sizes)} */
    public static void glBindBuffersRange(@NativeType("GLenum") int target, @NativeType("GLuint") int first, @NativeType("GLuint const *") int @Nullable [] buffers, @NativeType("GLintptr const *") @Nullable PointerBuffer offsets, @NativeType("GLsizeiptr const *") @Nullable PointerBuffer sizes) {
        GL44C.glBindBuffersRange(target, first, buffers, offsets, sizes);
    }

    /** {@code void glBindTextures(GLuint first, GLsizei count, GLuint const * textures)} */
    public static void glBindTextures(@NativeType("GLuint") int first, @NativeType("GLuint const *") int @Nullable [] textures) {
        GL44C.glBindTextures(first, textures);
    }

    /** {@code void glBindSamplers(GLuint first, GLsizei count, GLuint const * samplers)} */
    public static void glBindSamplers(@NativeType("GLuint") int first, @NativeType("GLuint const *") int @Nullable [] samplers) {
        GL44C.glBindSamplers(first, samplers);
    }

    /** {@code void glBindImageTextures(GLuint first, GLsizei count, GLuint const * textures)} */
    public static void glBindImageTextures(@NativeType("GLuint") int first, @NativeType("GLuint const *") int @Nullable [] textures) {
        GL44C.glBindImageTextures(first, textures);
    }

    /** {@code void glBindVertexBuffers(GLuint first, GLsizei count, GLuint const * buffers, GLintptr const * offsets, GLsizei const * strides)} */
    public static void glBindVertexBuffers(@NativeType("GLuint") int first, @NativeType("GLuint const *") int @Nullable [] buffers, @NativeType("GLintptr const *") @Nullable PointerBuffer offsets, @NativeType("GLsizei const *") int @Nullable [] strides) {
        GL44C.glBindVertexBuffers(first, buffers, offsets, strides);
    }

}
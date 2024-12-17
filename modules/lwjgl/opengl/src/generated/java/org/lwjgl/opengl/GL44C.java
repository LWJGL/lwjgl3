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
import static org.lwjgl.system.MemoryUtil.*;

public class GL44C extends GL43C {

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

    protected GL44C() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBufferStorage ] ---

    /** {@code void glBufferStorage(GLenum target, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static native void nglBufferStorage(int target, long size, long data, int flags);

    /** {@code void glBufferStorage(GLenum target, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glBufferStorage(@NativeType("GLenum") int target, @NativeType("GLsizeiptr") long size, @NativeType("GLbitfield") int flags) {
        nglBufferStorage(target, size, NULL, flags);
    }

    /** {@code void glBufferStorage(GLenum target, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glBufferStorage(@NativeType("GLenum") int target, @NativeType("void const *") ByteBuffer data, @NativeType("GLbitfield") int flags) {
        nglBufferStorage(target, data.remaining(), memAddress(data), flags);
    }

    /** {@code void glBufferStorage(GLenum target, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glBufferStorage(@NativeType("GLenum") int target, @NativeType("void const *") ShortBuffer data, @NativeType("GLbitfield") int flags) {
        nglBufferStorage(target, Integer.toUnsignedLong(data.remaining()) << 1, memAddress(data), flags);
    }

    /** {@code void glBufferStorage(GLenum target, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glBufferStorage(@NativeType("GLenum") int target, @NativeType("void const *") IntBuffer data, @NativeType("GLbitfield") int flags) {
        nglBufferStorage(target, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data), flags);
    }

    /** {@code void glBufferStorage(GLenum target, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glBufferStorage(@NativeType("GLenum") int target, @NativeType("void const *") FloatBuffer data, @NativeType("GLbitfield") int flags) {
        nglBufferStorage(target, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data), flags);
    }

    /** {@code void glBufferStorage(GLenum target, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glBufferStorage(@NativeType("GLenum") int target, @NativeType("void const *") DoubleBuffer data, @NativeType("GLbitfield") int flags) {
        nglBufferStorage(target, Integer.toUnsignedLong(data.remaining()) << 3, memAddress(data), flags);
    }

    // --- [ glClearTexSubImage ] ---

    /** {@code void glClearTexSubImage(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * data)} */
    public static native void nglClearTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long data);

    /** {@code void glClearTexSubImage(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * data)} */
    public static void glClearTexSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable ByteBuffer data) {
        nglClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddressSafe(data));
    }

    /** {@code void glClearTexSubImage(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * data)} */
    public static void glClearTexSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable ShortBuffer data) {
        nglClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddressSafe(data));
    }

    /** {@code void glClearTexSubImage(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * data)} */
    public static void glClearTexSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable IntBuffer data) {
        nglClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddressSafe(data));
    }

    /** {@code void glClearTexSubImage(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * data)} */
    public static void glClearTexSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable FloatBuffer data) {
        nglClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddressSafe(data));
    }

    /** {@code void glClearTexSubImage(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * data)} */
    public static void glClearTexSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable DoubleBuffer data) {
        nglClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddressSafe(data));
    }

    // --- [ glClearTexImage ] ---

    /** {@code void glClearTexImage(GLuint texture, GLint level, GLenum format, GLenum type, void const * data)} */
    public static native void nglClearTexImage(int texture, int level, int format, int type, long data);

    /** {@code void glClearTexImage(GLuint texture, GLint level, GLenum format, GLenum type, void const * data)} */
    public static void glClearTexImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable ByteBuffer data) {
        nglClearTexImage(texture, level, format, type, memAddressSafe(data));
    }

    /** {@code void glClearTexImage(GLuint texture, GLint level, GLenum format, GLenum type, void const * data)} */
    public static void glClearTexImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable ShortBuffer data) {
        nglClearTexImage(texture, level, format, type, memAddressSafe(data));
    }

    /** {@code void glClearTexImage(GLuint texture, GLint level, GLenum format, GLenum type, void const * data)} */
    public static void glClearTexImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable IntBuffer data) {
        nglClearTexImage(texture, level, format, type, memAddressSafe(data));
    }

    /** {@code void glClearTexImage(GLuint texture, GLint level, GLenum format, GLenum type, void const * data)} */
    public static void glClearTexImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable FloatBuffer data) {
        nglClearTexImage(texture, level, format, type, memAddressSafe(data));
    }

    /** {@code void glClearTexImage(GLuint texture, GLint level, GLenum format, GLenum type, void const * data)} */
    public static void glClearTexImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable DoubleBuffer data) {
        nglClearTexImage(texture, level, format, type, memAddressSafe(data));
    }

    // --- [ glBindBuffersBase ] ---

    /** {@code void glBindBuffersBase(GLenum target, GLuint first, GLsizei count, GLuint const * buffers)} */
    public static native void nglBindBuffersBase(int target, int first, int count, long buffers);

    /** {@code void glBindBuffersBase(GLenum target, GLuint first, GLsizei count, GLuint const * buffers)} */
    public static void glBindBuffersBase(@NativeType("GLenum") int target, @NativeType("GLuint") int first, @NativeType("GLuint const *") @Nullable IntBuffer buffers) {
        nglBindBuffersBase(target, first, remainingSafe(buffers), memAddressSafe(buffers));
    }

    // --- [ glBindBuffersRange ] ---

    /** {@code void glBindBuffersRange(GLenum target, GLuint first, GLsizei count, GLuint const * buffers, GLintptr const * offsets, GLsizeiptr const * sizes)} */
    public static native void nglBindBuffersRange(int target, int first, int count, long buffers, long offsets, long sizes);

    /** {@code void glBindBuffersRange(GLenum target, GLuint first, GLsizei count, GLuint const * buffers, GLintptr const * offsets, GLsizeiptr const * sizes)} */
    public static void glBindBuffersRange(@NativeType("GLenum") int target, @NativeType("GLuint") int first, @NativeType("GLuint const *") @Nullable IntBuffer buffers, @NativeType("GLintptr const *") @Nullable PointerBuffer offsets, @NativeType("GLsizeiptr const *") @Nullable PointerBuffer sizes) {
        if (CHECKS) {
            checkSafe(offsets, remainingSafe(buffers));
            checkSafe(sizes, remainingSafe(buffers));
        }
        nglBindBuffersRange(target, first, remainingSafe(buffers), memAddressSafe(buffers), memAddressSafe(offsets), memAddressSafe(sizes));
    }

    // --- [ glBindTextures ] ---

    /** {@code void glBindTextures(GLuint first, GLsizei count, GLuint const * textures)} */
    public static native void nglBindTextures(int first, int count, long textures);

    /** {@code void glBindTextures(GLuint first, GLsizei count, GLuint const * textures)} */
    public static void glBindTextures(@NativeType("GLuint") int first, @NativeType("GLuint const *") @Nullable IntBuffer textures) {
        nglBindTextures(first, remainingSafe(textures), memAddressSafe(textures));
    }

    // --- [ glBindSamplers ] ---

    /** {@code void glBindSamplers(GLuint first, GLsizei count, GLuint const * samplers)} */
    public static native void nglBindSamplers(int first, int count, long samplers);

    /** {@code void glBindSamplers(GLuint first, GLsizei count, GLuint const * samplers)} */
    public static void glBindSamplers(@NativeType("GLuint") int first, @NativeType("GLuint const *") @Nullable IntBuffer samplers) {
        nglBindSamplers(first, remainingSafe(samplers), memAddressSafe(samplers));
    }

    // --- [ glBindImageTextures ] ---

    /** {@code void glBindImageTextures(GLuint first, GLsizei count, GLuint const * textures)} */
    public static native void nglBindImageTextures(int first, int count, long textures);

    /** {@code void glBindImageTextures(GLuint first, GLsizei count, GLuint const * textures)} */
    public static void glBindImageTextures(@NativeType("GLuint") int first, @NativeType("GLuint const *") @Nullable IntBuffer textures) {
        nglBindImageTextures(first, remainingSafe(textures), memAddressSafe(textures));
    }

    // --- [ glBindVertexBuffers ] ---

    /** {@code void glBindVertexBuffers(GLuint first, GLsizei count, GLuint const * buffers, GLintptr const * offsets, GLsizei const * strides)} */
    public static native void nglBindVertexBuffers(int first, int count, long buffers, long offsets, long strides);

    /** {@code void glBindVertexBuffers(GLuint first, GLsizei count, GLuint const * buffers, GLintptr const * offsets, GLsizei const * strides)} */
    public static void glBindVertexBuffers(@NativeType("GLuint") int first, @NativeType("GLuint const *") @Nullable IntBuffer buffers, @NativeType("GLintptr const *") @Nullable PointerBuffer offsets, @NativeType("GLsizei const *") @Nullable IntBuffer strides) {
        if (CHECKS) {
            checkSafe(offsets, remainingSafe(buffers));
            checkSafe(strides, remainingSafe(buffers));
        }
        nglBindVertexBuffers(first, remainingSafe(buffers), memAddressSafe(buffers), memAddressSafe(offsets), memAddressSafe(strides));
    }

    /** {@code void glBufferStorage(GLenum target, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glBufferStorage(@NativeType("GLenum") int target, @NativeType("void const *") short[] data, @NativeType("GLbitfield") int flags) {
        long __functionAddress = GL.getICD().glBufferStorage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(target, Integer.toUnsignedLong(data.length) << 1, data, flags, __functionAddress);
    }

    /** {@code void glBufferStorage(GLenum target, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glBufferStorage(@NativeType("GLenum") int target, @NativeType("void const *") int[] data, @NativeType("GLbitfield") int flags) {
        long __functionAddress = GL.getICD().glBufferStorage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(target, Integer.toUnsignedLong(data.length) << 2, data, flags, __functionAddress);
    }

    /** {@code void glBufferStorage(GLenum target, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glBufferStorage(@NativeType("GLenum") int target, @NativeType("void const *") float[] data, @NativeType("GLbitfield") int flags) {
        long __functionAddress = GL.getICD().glBufferStorage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(target, Integer.toUnsignedLong(data.length) << 2, data, flags, __functionAddress);
    }

    /** {@code void glBufferStorage(GLenum target, GLsizeiptr size, void const * data, GLbitfield flags)} */
    public static void glBufferStorage(@NativeType("GLenum") int target, @NativeType("void const *") double[] data, @NativeType("GLbitfield") int flags) {
        long __functionAddress = GL.getICD().glBufferStorage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(target, Integer.toUnsignedLong(data.length) << 3, data, flags, __functionAddress);
    }

    /** {@code void glClearTexSubImage(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * data)} */
    public static void glClearTexSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short @Nullable [] data) {
        long __functionAddress = GL.getICD().glClearTexSubImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data, __functionAddress);
    }

    /** {@code void glClearTexSubImage(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * data)} */
    public static void glClearTexSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int @Nullable [] data) {
        long __functionAddress = GL.getICD().glClearTexSubImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data, __functionAddress);
    }

    /** {@code void glClearTexSubImage(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * data)} */
    public static void glClearTexSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float @Nullable [] data) {
        long __functionAddress = GL.getICD().glClearTexSubImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data, __functionAddress);
    }

    /** {@code void glClearTexSubImage(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * data)} */
    public static void glClearTexSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") double @Nullable [] data) {
        long __functionAddress = GL.getICD().glClearTexSubImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data, __functionAddress);
    }

    /** {@code void glClearTexImage(GLuint texture, GLint level, GLenum format, GLenum type, void const * data)} */
    public static void glClearTexImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short @Nullable [] data) {
        long __functionAddress = GL.getICD().glClearTexImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, format, type, data, __functionAddress);
    }

    /** {@code void glClearTexImage(GLuint texture, GLint level, GLenum format, GLenum type, void const * data)} */
    public static void glClearTexImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int @Nullable [] data) {
        long __functionAddress = GL.getICD().glClearTexImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, format, type, data, __functionAddress);
    }

    /** {@code void glClearTexImage(GLuint texture, GLint level, GLenum format, GLenum type, void const * data)} */
    public static void glClearTexImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float @Nullable [] data) {
        long __functionAddress = GL.getICD().glClearTexImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, format, type, data, __functionAddress);
    }

    /** {@code void glClearTexImage(GLuint texture, GLint level, GLenum format, GLenum type, void const * data)} */
    public static void glClearTexImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") double @Nullable [] data) {
        long __functionAddress = GL.getICD().glClearTexImage;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, format, type, data, __functionAddress);
    }

    /** {@code void glBindBuffersBase(GLenum target, GLuint first, GLsizei count, GLuint const * buffers)} */
    public static void glBindBuffersBase(@NativeType("GLenum") int target, @NativeType("GLuint") int first, @NativeType("GLuint const *") int @Nullable [] buffers) {
        long __functionAddress = GL.getICD().glBindBuffersBase;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, first, lengthSafe(buffers), buffers, __functionAddress);
    }

    /** {@code void glBindBuffersRange(GLenum target, GLuint first, GLsizei count, GLuint const * buffers, GLintptr const * offsets, GLsizeiptr const * sizes)} */
    public static void glBindBuffersRange(@NativeType("GLenum") int target, @NativeType("GLuint") int first, @NativeType("GLuint const *") int @Nullable [] buffers, @NativeType("GLintptr const *") @Nullable PointerBuffer offsets, @NativeType("GLsizeiptr const *") @Nullable PointerBuffer sizes) {
        long __functionAddress = GL.getICD().glBindBuffersRange;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(offsets, lengthSafe(buffers));
            checkSafe(sizes, lengthSafe(buffers));
        }
        callPPPV(target, first, lengthSafe(buffers), buffers, memAddressSafe(offsets), memAddressSafe(sizes), __functionAddress);
    }

    /** {@code void glBindTextures(GLuint first, GLsizei count, GLuint const * textures)} */
    public static void glBindTextures(@NativeType("GLuint") int first, @NativeType("GLuint const *") int @Nullable [] textures) {
        long __functionAddress = GL.getICD().glBindTextures;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(first, lengthSafe(textures), textures, __functionAddress);
    }

    /** {@code void glBindSamplers(GLuint first, GLsizei count, GLuint const * samplers)} */
    public static void glBindSamplers(@NativeType("GLuint") int first, @NativeType("GLuint const *") int @Nullable [] samplers) {
        long __functionAddress = GL.getICD().glBindSamplers;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(first, lengthSafe(samplers), samplers, __functionAddress);
    }

    /** {@code void glBindImageTextures(GLuint first, GLsizei count, GLuint const * textures)} */
    public static void glBindImageTextures(@NativeType("GLuint") int first, @NativeType("GLuint const *") int @Nullable [] textures) {
        long __functionAddress = GL.getICD().glBindImageTextures;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(first, lengthSafe(textures), textures, __functionAddress);
    }

    /** {@code void glBindVertexBuffers(GLuint first, GLsizei count, GLuint const * buffers, GLintptr const * offsets, GLsizei const * strides)} */
    public static void glBindVertexBuffers(@NativeType("GLuint") int first, @NativeType("GLuint const *") int @Nullable [] buffers, @NativeType("GLintptr const *") @Nullable PointerBuffer offsets, @NativeType("GLsizei const *") int @Nullable [] strides) {
        long __functionAddress = GL.getICD().glBindVertexBuffers;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(offsets, lengthSafe(buffers));
            checkSafe(strides, lengthSafe(buffers));
        }
        callPPPV(first, lengthSafe(buffers), buffers, memAddressSafe(offsets), strides, __functionAddress);
    }

}
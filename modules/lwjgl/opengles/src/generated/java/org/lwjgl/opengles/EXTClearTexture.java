/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class EXTClearTexture {

    static { GLES.initialize(); }

    protected EXTClearTexture() {
        throw new UnsupportedOperationException();
    }

    // --- [ glClearTexImageEXT ] ---

    /** {@code void glClearTexImageEXT(GLuint texture, GLint level, GLenum format, GLenum type, void const * data)} */
    public static native void nglClearTexImageEXT(int texture, int level, int format, int type, long data);

    /** {@code void glClearTexImageEXT(GLuint texture, GLint level, GLenum format, GLenum type, void const * data)} */
    public static void glClearTexImageEXT(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable ByteBuffer data) {
        nglClearTexImageEXT(texture, level, format, type, memAddressSafe(data));
    }

    /** {@code void glClearTexImageEXT(GLuint texture, GLint level, GLenum format, GLenum type, void const * data)} */
    public static void glClearTexImageEXT(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable ShortBuffer data) {
        nglClearTexImageEXT(texture, level, format, type, memAddressSafe(data));
    }

    /** {@code void glClearTexImageEXT(GLuint texture, GLint level, GLenum format, GLenum type, void const * data)} */
    public static void glClearTexImageEXT(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable IntBuffer data) {
        nglClearTexImageEXT(texture, level, format, type, memAddressSafe(data));
    }

    /** {@code void glClearTexImageEXT(GLuint texture, GLint level, GLenum format, GLenum type, void const * data)} */
    public static void glClearTexImageEXT(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable FloatBuffer data) {
        nglClearTexImageEXT(texture, level, format, type, memAddressSafe(data));
    }

    // --- [ glClearTexSubImageEXT ] ---

    /** {@code void glClearTexSubImageEXT(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * data)} */
    public static native void nglClearTexSubImageEXT(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long data);

    /** {@code void glClearTexSubImageEXT(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * data)} */
    public static void glClearTexSubImageEXT(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable ByteBuffer data) {
        nglClearTexSubImageEXT(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddressSafe(data));
    }

    /** {@code void glClearTexSubImageEXT(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * data)} */
    public static void glClearTexSubImageEXT(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable ShortBuffer data) {
        nglClearTexSubImageEXT(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddressSafe(data));
    }

    /** {@code void glClearTexSubImageEXT(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * data)} */
    public static void glClearTexSubImageEXT(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable IntBuffer data) {
        nglClearTexSubImageEXT(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddressSafe(data));
    }

    /** {@code void glClearTexSubImageEXT(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * data)} */
    public static void glClearTexSubImageEXT(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable FloatBuffer data) {
        nglClearTexSubImageEXT(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddressSafe(data));
    }

    /** {@code void glClearTexImageEXT(GLuint texture, GLint level, GLenum format, GLenum type, void const * data)} */
    public static void glClearTexImageEXT(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short @Nullable [] data) {
        long __functionAddress = GLES.getICD().glClearTexImageEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, format, type, data, __functionAddress);
    }

    /** {@code void glClearTexImageEXT(GLuint texture, GLint level, GLenum format, GLenum type, void const * data)} */
    public static void glClearTexImageEXT(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int @Nullable [] data) {
        long __functionAddress = GLES.getICD().glClearTexImageEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, format, type, data, __functionAddress);
    }

    /** {@code void glClearTexImageEXT(GLuint texture, GLint level, GLenum format, GLenum type, void const * data)} */
    public static void glClearTexImageEXT(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float @Nullable [] data) {
        long __functionAddress = GLES.getICD().glClearTexImageEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, format, type, data, __functionAddress);
    }

    /** {@code void glClearTexSubImageEXT(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * data)} */
    public static void glClearTexSubImageEXT(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short @Nullable [] data) {
        long __functionAddress = GLES.getICD().glClearTexSubImageEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data, __functionAddress);
    }

    /** {@code void glClearTexSubImageEXT(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * data)} */
    public static void glClearTexSubImageEXT(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int @Nullable [] data) {
        long __functionAddress = GLES.getICD().glClearTexSubImageEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data, __functionAddress);
    }

    /** {@code void glClearTexSubImageEXT(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * data)} */
    public static void glClearTexSubImageEXT(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float @Nullable [] data) {
        long __functionAddress = GLES.getICD().glClearTexSubImageEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data, __functionAddress);
    }

}
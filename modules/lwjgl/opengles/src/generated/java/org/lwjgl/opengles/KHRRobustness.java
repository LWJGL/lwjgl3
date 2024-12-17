/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class KHRRobustness {

    static { GLES.initialize(); }

    public static final int
        GL_GUILTY_CONTEXT_RESET_KHR   = 0x8253,
        GL_INNOCENT_CONTEXT_RESET_KHR = 0x8254,
        GL_UNKNOWN_CONTEXT_RESET_KHR  = 0x8255;

    public static final int
        GL_CONTEXT_ROBUST_ACCESS_KHR       = 0x90F3,
        GL_RESET_NOTIFICATION_STRATEGY_KHR = 0x8256;

    public static final int
        GL_LOSE_CONTEXT_ON_RESET_KHR = 0x8252,
        GL_NO_RESET_NOTIFICATION_KHR = 0x8261;

    public static final int GL_CONTEXT_LOST_KHR = 0x507;

    protected KHRRobustness() {
        throw new UnsupportedOperationException();
    }

    // --- [ glGetGraphicsResetStatusKHR ] ---

    /** {@code GLenum glGetGraphicsResetStatusKHR(void)} */
    @NativeType("GLenum")
    public static native int glGetGraphicsResetStatusKHR();

    // --- [ glReadnPixelsKHR ] ---

    /** {@code void glReadnPixelsKHR(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static native void nglReadnPixelsKHR(int x, int y, int width, int height, int format, int type, int bufSize, long pixels);

    /** {@code void glReadnPixelsKHR(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glReadnPixelsKHR(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("GLsizei") int bufSize, @NativeType("void *") long pixels) {
        nglReadnPixelsKHR(x, y, width, height, format, type, bufSize, pixels);
    }

    /** {@code void glReadnPixelsKHR(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glReadnPixelsKHR(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer pixels) {
        nglReadnPixelsKHR(x, y, width, height, format, type, pixels.remaining(), memAddress(pixels));
    }

    /** {@code void glReadnPixelsKHR(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glReadnPixelsKHR(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ShortBuffer pixels) {
        nglReadnPixelsKHR(x, y, width, height, format, type, pixels.remaining() << 1, memAddress(pixels));
    }

    /** {@code void glReadnPixelsKHR(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glReadnPixelsKHR(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") IntBuffer pixels) {
        nglReadnPixelsKHR(x, y, width, height, format, type, pixels.remaining() << 2, memAddress(pixels));
    }

    /** {@code void glReadnPixelsKHR(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glReadnPixelsKHR(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") FloatBuffer pixels) {
        nglReadnPixelsKHR(x, y, width, height, format, type, pixels.remaining() << 2, memAddress(pixels));
    }

    // --- [ glGetnUniformfvKHR ] ---

    /** {@code void glGetnUniformfvKHR(GLuint program, GLint location, GLsizei bufSize, GLfloat * params)} */
    public static native void nglGetnUniformfvKHR(int program, int location, int bufSize, long params);

    /** {@code void glGetnUniformfvKHR(GLuint program, GLint location, GLsizei bufSize, GLfloat * params)} */
    public static void glGetnUniformfvKHR(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat *") FloatBuffer params) {
        nglGetnUniformfvKHR(program, location, params.remaining(), memAddress(params));
    }

    /** {@code void glGetnUniformfvKHR(GLuint program, GLint location, GLsizei bufSize, GLfloat * params)} */
    @NativeType("void")
    public static float glGetnUniformfKHR(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetnUniformfvKHR(program, location, 1, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetnUniformivKHR ] ---

    /** {@code void glGetnUniformivKHR(GLuint program, GLint location, GLsizei bufSize, GLfloat * params)} */
    public static native void nglGetnUniformivKHR(int program, int location, int bufSize, long params);

    /** {@code void glGetnUniformivKHR(GLuint program, GLint location, GLsizei bufSize, GLfloat * params)} */
    public static void glGetnUniformivKHR(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat *") FloatBuffer params) {
        nglGetnUniformivKHR(program, location, params.remaining(), memAddress(params));
    }

    /** {@code void glGetnUniformivKHR(GLuint program, GLint location, GLsizei bufSize, GLfloat * params)} */
    @NativeType("void")
    public static float glGetnUniformiKHR(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetnUniformivKHR(program, location, 1, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetnUniformuivKHR ] ---

    /** {@code void glGetnUniformuivKHR(GLuint program, GLint location, GLsizei bufSize, GLfloat * params)} */
    public static native void nglGetnUniformuivKHR(int program, int location, int bufSize, long params);

    /** {@code void glGetnUniformuivKHR(GLuint program, GLint location, GLsizei bufSize, GLfloat * params)} */
    public static void glGetnUniformuivKHR(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat *") FloatBuffer params) {
        nglGetnUniformuivKHR(program, location, params.remaining(), memAddress(params));
    }

    /** {@code void glGetnUniformuivKHR(GLuint program, GLint location, GLsizei bufSize, GLfloat * params)} */
    @NativeType("void")
    public static float glGetnUniformuiKHR(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetnUniformuivKHR(program, location, 1, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glReadnPixelsKHR(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glReadnPixelsKHR(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") short[] pixels) {
        long __functionAddress = GLES.getICD().glReadnPixelsKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(x, y, width, height, format, type, pixels.length << 1, pixels, __functionAddress);
    }

    /** {@code void glReadnPixelsKHR(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glReadnPixelsKHR(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") int[] pixels) {
        long __functionAddress = GLES.getICD().glReadnPixelsKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(x, y, width, height, format, type, pixels.length << 2, pixels, __functionAddress);
    }

    /** {@code void glReadnPixelsKHR(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glReadnPixelsKHR(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") float[] pixels) {
        long __functionAddress = GLES.getICD().glReadnPixelsKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(x, y, width, height, format, type, pixels.length << 2, pixels, __functionAddress);
    }

    /** {@code void glGetnUniformfvKHR(GLuint program, GLint location, GLsizei bufSize, GLfloat * params)} */
    public static void glGetnUniformfvKHR(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GLES.getICD().glGetnUniformfvKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, params.length, params, __functionAddress);
    }

    /** {@code void glGetnUniformivKHR(GLuint program, GLint location, GLsizei bufSize, GLfloat * params)} */
    public static void glGetnUniformivKHR(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GLES.getICD().glGetnUniformivKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, params.length, params, __functionAddress);
    }

    /** {@code void glGetnUniformuivKHR(GLuint program, GLint location, GLsizei bufSize, GLfloat * params)} */
    public static void glGetnUniformuivKHR(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GLES.getICD().glGetnUniformuivKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, params.length, params, __functionAddress);
    }

}
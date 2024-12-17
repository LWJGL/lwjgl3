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

public class EXTRobustness {

    static { GLES.initialize(); }

    public static final int
        GL_GUILTY_CONTEXT_RESET_EXT   = 0x8253,
        GL_INNOCENT_CONTEXT_RESET_EXT = 0x8254,
        GL_UNKNOWN_CONTEXT_RESET_EXT  = 0x8255;

    public static final int
        GL_CONTEXT_ROBUST_ACCESS_EXT       = 0x90F3,
        GL_RESET_NOTIFICATION_STRATEGY_EXT = 0x8256;

    public static final int
        GL_LOSE_CONTEXT_ON_RESET_EXT = 0x8252,
        GL_NO_RESET_NOTIFICATION_EXT = 0x8261;

    protected EXTRobustness() {
        throw new UnsupportedOperationException();
    }

    // --- [ glGetGraphicsResetStatusEXT ] ---

    /** {@code GLenum glGetGraphicsResetStatusEXT(void)} */
    @NativeType("GLenum")
    public static native int glGetGraphicsResetStatusEXT();

    // --- [ glReadnPixelsEXT ] ---

    /** {@code void glReadnPixelsEXT(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, GLsizei bufSize, void * data)} */
    public static native void nglReadnPixelsEXT(int x, int y, int width, int height, int format, int type, int bufSize, long data);

    /** {@code void glReadnPixelsEXT(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, GLsizei bufSize, void * data)} */
    public static void glReadnPixelsEXT(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("GLsizei") int bufSize, @NativeType("void *") long data) {
        nglReadnPixelsEXT(x, y, width, height, format, type, bufSize, data);
    }

    /** {@code void glReadnPixelsEXT(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, GLsizei bufSize, void * data)} */
    public static void glReadnPixelsEXT(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer data) {
        nglReadnPixelsEXT(x, y, width, height, format, type, data.remaining(), memAddress(data));
    }

    /** {@code void glReadnPixelsEXT(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, GLsizei bufSize, void * data)} */
    public static void glReadnPixelsEXT(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ShortBuffer data) {
        nglReadnPixelsEXT(x, y, width, height, format, type, data.remaining() << 1, memAddress(data));
    }

    /** {@code void glReadnPixelsEXT(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, GLsizei bufSize, void * data)} */
    public static void glReadnPixelsEXT(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") IntBuffer data) {
        nglReadnPixelsEXT(x, y, width, height, format, type, data.remaining() << 2, memAddress(data));
    }

    /** {@code void glReadnPixelsEXT(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, GLsizei bufSize, void * data)} */
    public static void glReadnPixelsEXT(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") FloatBuffer data) {
        nglReadnPixelsEXT(x, y, width, height, format, type, data.remaining() << 2, memAddress(data));
    }

    // --- [ glGetnUniformfvEXT ] ---

    /** {@code void glGetnUniformfvEXT(GLuint program, GLint location, GLsizei bufSize, GLfloat * params)} */
    public static native void nglGetnUniformfvEXT(int program, int location, int bufSize, long params);

    /** {@code void glGetnUniformfvEXT(GLuint program, GLint location, GLsizei bufSize, GLfloat * params)} */
    public static void glGetnUniformfvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat *") FloatBuffer params) {
        nglGetnUniformfvEXT(program, location, params.remaining(), memAddress(params));
    }

    /** {@code void glGetnUniformfvEXT(GLuint program, GLint location, GLsizei bufSize, GLfloat * params)} */
    @NativeType("void")
    public static float glGetnUniformfEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetnUniformfvEXT(program, location, 1, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetnUniformivEXT ] ---

    /** {@code void glGetnUniformivEXT(GLuint program, GLint location, GLsizei bufSize, GLint * params)} */
    public static native void nglGetnUniformivEXT(int program, int location, int bufSize, long params);

    /** {@code void glGetnUniformivEXT(GLuint program, GLint location, GLsizei bufSize, GLint * params)} */
    public static void glGetnUniformivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint *") IntBuffer params) {
        nglGetnUniformivEXT(program, location, params.remaining(), memAddress(params));
    }

    /** {@code void glGetnUniformivEXT(GLuint program, GLint location, GLsizei bufSize, GLint * params)} */
    @NativeType("void")
    public static int glGetnUniformiEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetnUniformivEXT(program, location, 1, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glReadnPixelsEXT(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, GLsizei bufSize, void * data)} */
    public static void glReadnPixelsEXT(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") short[] data) {
        long __functionAddress = GLES.getICD().glReadnPixelsEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(x, y, width, height, format, type, data.length << 1, data, __functionAddress);
    }

    /** {@code void glReadnPixelsEXT(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, GLsizei bufSize, void * data)} */
    public static void glReadnPixelsEXT(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") int[] data) {
        long __functionAddress = GLES.getICD().glReadnPixelsEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(x, y, width, height, format, type, data.length << 2, data, __functionAddress);
    }

    /** {@code void glReadnPixelsEXT(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, GLsizei bufSize, void * data)} */
    public static void glReadnPixelsEXT(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") float[] data) {
        long __functionAddress = GLES.getICD().glReadnPixelsEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(x, y, width, height, format, type, data.length << 2, data, __functionAddress);
    }

    /** {@code void glGetnUniformfvEXT(GLuint program, GLint location, GLsizei bufSize, GLfloat * params)} */
    public static void glGetnUniformfvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GLES.getICD().glGetnUniformfvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, params.length, params, __functionAddress);
    }

    /** {@code void glGetnUniformivEXT(GLuint program, GLint location, GLsizei bufSize, GLint * params)} */
    public static void glGetnUniformivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetnUniformivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, params.length, params, __functionAddress);
    }

}
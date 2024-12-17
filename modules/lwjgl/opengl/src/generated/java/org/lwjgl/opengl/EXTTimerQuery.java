/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class EXTTimerQuery {

    static { GL.initialize(); }

    public static final int GL_TIME_ELAPSED_EXT = 0x88BF;

    protected EXTTimerQuery() {
        throw new UnsupportedOperationException();
    }

    // --- [ glGetQueryObjecti64vEXT ] ---

    /** {@code void glGetQueryObjecti64vEXT(GLuint id, GLenum pname, GLint64 * params)} */
    public static native void nglGetQueryObjecti64vEXT(int id, int pname, long params);

    /** {@code void glGetQueryObjecti64vEXT(GLuint id, GLenum pname, GLint64 * params)} */
    public static void glGetQueryObjecti64vEXT(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint64 *") LongBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetQueryObjecti64vEXT(id, pname, memAddress(params));
    }

    /** {@code void glGetQueryObjecti64vEXT(GLuint id, GLenum pname, GLint64 * params)} */
    public static void glGetQueryObjecti64vEXT(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint64 *") long params) {
        nglGetQueryObjecti64vEXT(id, pname, params);
    }

    /** {@code void glGetQueryObjecti64vEXT(GLuint id, GLenum pname, GLint64 * params)} */
    @NativeType("void")
    public static long glGetQueryObjecti64EXT(@NativeType("GLuint") int id, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer params = stack.callocLong(1);
            nglGetQueryObjecti64vEXT(id, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetQueryObjectui64vEXT ] ---

    /** {@code void glGetQueryObjectui64vEXT(GLuint id, GLenum pname, GLuint64 * params)} */
    public static native void nglGetQueryObjectui64vEXT(int id, int pname, long params);

    /** {@code void glGetQueryObjectui64vEXT(GLuint id, GLenum pname, GLuint64 * params)} */
    public static void glGetQueryObjectui64vEXT(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint64 *") LongBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetQueryObjectui64vEXT(id, pname, memAddress(params));
    }

    /** {@code void glGetQueryObjectui64vEXT(GLuint id, GLenum pname, GLuint64 * params)} */
    public static void glGetQueryObjectui64vEXT(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint64 *") long params) {
        nglGetQueryObjectui64vEXT(id, pname, params);
    }

    /** {@code void glGetQueryObjectui64vEXT(GLuint id, GLenum pname, GLuint64 * params)} */
    @NativeType("void")
    public static long glGetQueryObjectui64EXT(@NativeType("GLuint") int id, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer params = stack.callocLong(1);
            nglGetQueryObjectui64vEXT(id, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glGetQueryObjecti64vEXT(GLuint id, GLenum pname, GLint64 * params)} */
    public static void glGetQueryObjecti64vEXT(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint64 *") long[] params) {
        long __functionAddress = GL.getICD().glGetQueryObjecti64vEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(id, pname, params, __functionAddress);
    }

    /** {@code void glGetQueryObjectui64vEXT(GLuint id, GLenum pname, GLuint64 * params)} */
    public static void glGetQueryObjectui64vEXT(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint64 *") long[] params) {
        long __functionAddress = GL.getICD().glGetQueryObjectui64vEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(id, pname, params, __functionAddress);
    }

}
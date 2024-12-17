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

public class NVTimelineSemaphore {

    static { GLES.initialize(); }

    public static final int GL_SEMAPHORE_TYPE_NV = 0x95B3;

    public static final int
        GL_SEMAPHORE_TYPE_BINARY_NV   = 0x95B4,
        GL_SEMAPHORE_TYPE_TIMELINE_NV = 0x95B5;

    public static final int GL_TIMELINE_SEMAPHORE_VALUE_NV = 0x9595;

    public static final int GL_MAX_TIMELINE_SEMAPHORE_VALUE_DIFFERENCE_NV = 0x95B6;

    protected NVTimelineSemaphore() {
        throw new UnsupportedOperationException();
    }

    // --- [ glCreateSemaphoresNV ] ---

    /** {@code void glCreateSemaphoresNV(GLsizei n, GLuint * semaphores)} */
    public static native void nglCreateSemaphoresNV(int n, long semaphores);

    /** {@code void glCreateSemaphoresNV(GLsizei n, GLuint * semaphores)} */
    public static void glCreateSemaphoresNV(@NativeType("GLuint *") IntBuffer semaphores) {
        nglCreateSemaphoresNV(semaphores.remaining(), memAddress(semaphores));
    }

    /** {@code void glCreateSemaphoresNV(GLsizei n, GLuint * semaphores)} */
    @NativeType("void")
    public static int glCreateSemaphoresNV() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer semaphores = stack.callocInt(1);
            nglCreateSemaphoresNV(1, memAddress(semaphores));
            return semaphores.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glSemaphoreParameterivNV ] ---

    /** {@code void glSemaphoreParameterivNV(GLuint semaphore, GLenum pname, GLint const * params)} */
    public static native void nglSemaphoreParameterivNV(int semaphore, int pname, long params);

    /** {@code void glSemaphoreParameterivNV(GLuint semaphore, GLenum pname, GLint const * params)} */
    public static void glSemaphoreParameterivNV(@NativeType("GLuint") int semaphore, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglSemaphoreParameterivNV(semaphore, pname, memAddress(params));
    }

    // --- [ glGetSemaphoreParameterivNV ] ---

    /** {@code void glGetSemaphoreParameterivNV(GLuint semaphore, GLenum pname, GLint * params)} */
    public static native void nglGetSemaphoreParameterivNV(int semaphore, int pname, long params);

    /** {@code void glGetSemaphoreParameterivNV(GLuint semaphore, GLenum pname, GLint * params)} */
    public static void glGetSemaphoreParameterivNV(@NativeType("GLuint") int semaphore, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetSemaphoreParameterivNV(semaphore, pname, memAddress(params));
    }

    /** {@code void glCreateSemaphoresNV(GLsizei n, GLuint * semaphores)} */
    public static void glCreateSemaphoresNV(@NativeType("GLuint *") int[] semaphores) {
        long __functionAddress = GLES.getICD().glCreateSemaphoresNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(semaphores.length, semaphores, __functionAddress);
    }

    /** {@code void glSemaphoreParameterivNV(GLuint semaphore, GLenum pname, GLint const * params)} */
    public static void glSemaphoreParameterivNV(@NativeType("GLuint") int semaphore, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        long __functionAddress = GLES.getICD().glSemaphoreParameterivNV;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(semaphore, pname, params, __functionAddress);
    }

    /** {@code void glGetSemaphoreParameterivNV(GLuint semaphore, GLenum pname, GLint * params)} */
    public static void glGetSemaphoreParameterivNV(@NativeType("GLuint") int semaphore, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetSemaphoreParameterivNV;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(semaphore, pname, params, __functionAddress);
    }

}
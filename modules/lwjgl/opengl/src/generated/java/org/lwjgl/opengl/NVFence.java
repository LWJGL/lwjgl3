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

public class NVFence {

    static { GL.initialize(); }

    public static final int GL_ALL_COMPLETED_NV = 0x84F2;

    public static final int
        GL_FENCE_STATUS_NV    = 0x84F3,
        GL_FENCE_CONDITION_NV = 0x84F4;

    protected NVFence() {
        throw new UnsupportedOperationException();
    }

    // --- [ glDeleteFencesNV ] ---

    /** {@code void glDeleteFencesNV(GLsizei n, GLuint const * fences)} */
    public static native void nglDeleteFencesNV(int n, long fences);

    /** {@code void glDeleteFencesNV(GLsizei n, GLuint const * fences)} */
    public static void glDeleteFencesNV(@NativeType("GLuint const *") IntBuffer fences) {
        nglDeleteFencesNV(fences.remaining(), memAddress(fences));
    }

    /** {@code void glDeleteFencesNV(GLsizei n, GLuint const * fences)} */
    public static void glDeleteFencesNV(@NativeType("GLuint const *") int fence) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer fences = stack.ints(fence);
            nglDeleteFencesNV(1, memAddress(fences));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGenFencesNV ] ---

    /** {@code void glGenFencesNV(GLsizei n, GLuint * fences)} */
    public static native void nglGenFencesNV(int n, long fences);

    /** {@code void glGenFencesNV(GLsizei n, GLuint * fences)} */
    public static void glGenFencesNV(@NativeType("GLuint *") IntBuffer fences) {
        nglGenFencesNV(fences.remaining(), memAddress(fences));
    }

    /** {@code void glGenFencesNV(GLsizei n, GLuint * fences)} */
    @NativeType("void")
    public static int glGenFencesNV() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer fences = stack.callocInt(1);
            nglGenFencesNV(1, memAddress(fences));
            return fences.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glIsFenceNV ] ---

    /** {@code GLboolean glIsFenceNV(GLuint fence)} */
    @NativeType("GLboolean")
    public static native boolean glIsFenceNV(@NativeType("GLuint") int fence);

    // --- [ glTestFenceNV ] ---

    /** {@code GLboolean glTestFenceNV(GLuint fence)} */
    @NativeType("GLboolean")
    public static native boolean glTestFenceNV(@NativeType("GLuint") int fence);

    // --- [ glGetFenceivNV ] ---

    /** {@code void glGetFenceivNV(GLuint fence, GLenum pname, GLint * params)} */
    public static native void nglGetFenceivNV(int fence, int pname, long params);

    /** {@code void glGetFenceivNV(GLuint fence, GLenum pname, GLint * params)} */
    public static void glGetFenceivNV(@NativeType("GLuint") int fence, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetFenceivNV(fence, pname, memAddress(params));
    }

    /** {@code void glGetFenceivNV(GLuint fence, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetFenceiNV(@NativeType("GLuint") int fence, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetFenceivNV(fence, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glFinishFenceNV ] ---

    /** {@code void glFinishFenceNV(GLuint fence)} */
    public static native void glFinishFenceNV(@NativeType("GLuint") int fence);

    // --- [ glSetFenceNV ] ---

    /** {@code void glSetFenceNV(GLuint fence, GLenum condition)} */
    public static native void glSetFenceNV(@NativeType("GLuint") int fence, @NativeType("GLenum") int condition);

    /** {@code void glDeleteFencesNV(GLsizei n, GLuint const * fences)} */
    public static void glDeleteFencesNV(@NativeType("GLuint const *") int[] fences) {
        long __functionAddress = GL.getICD().glDeleteFencesNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(fences.length, fences, __functionAddress);
    }

    /** {@code void glGenFencesNV(GLsizei n, GLuint * fences)} */
    public static void glGenFencesNV(@NativeType("GLuint *") int[] fences) {
        long __functionAddress = GL.getICD().glGenFencesNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(fences.length, fences, __functionAddress);
    }

    /** {@code void glGetFenceivNV(GLuint fence, GLenum pname, GLint * params)} */
    public static void glGetFenceivNV(@NativeType("GLuint") int fence, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetFenceivNV;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(fence, pname, params, __functionAddress);
    }

}
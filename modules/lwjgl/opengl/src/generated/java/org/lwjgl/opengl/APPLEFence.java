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

public class APPLEFence {

    static { GL.initialize(); }

    public static final int
        GL_DRAW_PIXELS_APPLE = 0x8A0A,
        GL_FENCE_APPLE       = 0x8A0B;

    protected APPLEFence() {
        throw new UnsupportedOperationException();
    }

    // --- [ glGenFencesAPPLE ] ---

    /** {@code void glGenFencesAPPLE(GLsizei n, GLuint * fences)} */
    public static native void nglGenFencesAPPLE(int n, long fences);

    /** {@code void glGenFencesAPPLE(GLsizei n, GLuint * fences)} */
    public static void glGenFencesAPPLE(@NativeType("GLuint *") IntBuffer fences) {
        nglGenFencesAPPLE(fences.remaining(), memAddress(fences));
    }

    /** {@code void glGenFencesAPPLE(GLsizei n, GLuint * fences)} */
    @NativeType("void")
    public static int glGenFencesAPPLE() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer fences = stack.callocInt(1);
            nglGenFencesAPPLE(1, memAddress(fences));
            return fences.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glDeleteFencesAPPLE ] ---

    /** {@code void glDeleteFencesAPPLE(GLsizei n, GLuint const * fences)} */
    public static native void nglDeleteFencesAPPLE(int n, long fences);

    /** {@code void glDeleteFencesAPPLE(GLsizei n, GLuint const * fences)} */
    public static void glDeleteFencesAPPLE(@NativeType("GLuint const *") IntBuffer fences) {
        nglDeleteFencesAPPLE(fences.remaining(), memAddress(fences));
    }

    /** {@code void glDeleteFencesAPPLE(GLsizei n, GLuint const * fences)} */
    public static void glDeleteFencesAPPLE(@NativeType("GLuint const *") int fence) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer fences = stack.ints(fence);
            nglDeleteFencesAPPLE(1, memAddress(fences));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glSetFenceAPPLE ] ---

    /** {@code void glSetFenceAPPLE(GLuint fence)} */
    public static native void glSetFenceAPPLE(@NativeType("GLuint") int fence);

    // --- [ glIsFenceAPPLE ] ---

    /** {@code GLboolean glIsFenceAPPLE(GLuint fence)} */
    @NativeType("GLboolean")
    public static native boolean glIsFenceAPPLE(@NativeType("GLuint") int fence);

    // --- [ glTestFenceAPPLE ] ---

    /** {@code GLboolean glTestFenceAPPLE(GLuint fence)} */
    @NativeType("GLboolean")
    public static native boolean glTestFenceAPPLE(@NativeType("GLuint") int fence);

    // --- [ glFinishFenceAPPLE ] ---

    /** {@code void glFinishFenceAPPLE(GLuint fence)} */
    public static native void glFinishFenceAPPLE(@NativeType("GLuint") int fence);

    // --- [ glTestObjectAPPLE ] ---

    /** {@code GLboolean glTestObjectAPPLE(GLenum object, GLuint name)} */
    @NativeType("GLboolean")
    public static native boolean glTestObjectAPPLE(@NativeType("GLenum") int object, @NativeType("GLuint") int name);

    // --- [ glFinishObjectAPPLE ] ---

    /** {@code void glFinishObjectAPPLE(GLenum object, GLint name)} */
    public static native void glFinishObjectAPPLE(@NativeType("GLenum") int object, @NativeType("GLint") int name);

    /** {@code void glGenFencesAPPLE(GLsizei n, GLuint * fences)} */
    public static void glGenFencesAPPLE(@NativeType("GLuint *") int[] fences) {
        long __functionAddress = GL.getICD().glGenFencesAPPLE;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(fences.length, fences, __functionAddress);
    }

    /** {@code void glDeleteFencesAPPLE(GLsizei n, GLuint const * fences)} */
    public static void glDeleteFencesAPPLE(@NativeType("GLuint const *") int[] fences) {
        long __functionAddress = GL.getICD().glDeleteFencesAPPLE;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(fences.length, fences, __functionAddress);
    }

}
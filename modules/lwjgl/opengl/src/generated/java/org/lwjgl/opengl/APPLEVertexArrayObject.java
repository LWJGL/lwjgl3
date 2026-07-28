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

public class APPLEVertexArrayObject {

    static { GL.initialize(); }

    public static final int GL_VERTEX_ARRAY_BINDING_APPLE = 0x85B5;

    protected APPLEVertexArrayObject() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBindVertexArrayAPPLE ] ---

    /** {@code void glBindVertexArrayAPPLE(GLuint array)} */
    public static native void glBindVertexArrayAPPLE(@NativeType("GLuint") int array);

    // --- [ glDeleteVertexArraysAPPLE ] ---

    /** {@code void glDeleteVertexArraysAPPLE(GLsizei n, GLuint const * arrays)} */
    public static native void nglDeleteVertexArraysAPPLE(int n, long arrays);

    /** {@code void glDeleteVertexArraysAPPLE(GLsizei n, GLuint const * arrays)} */
    public static void glDeleteVertexArraysAPPLE(@NativeType("GLuint const *") IntBuffer arrays) {
        nglDeleteVertexArraysAPPLE(arrays.remaining(), memAddress(arrays));
    }

    /** {@code void glDeleteVertexArraysAPPLE(GLsizei n, GLuint const * arrays)} */
    public static void glDeleteVertexArraysAPPLE(@NativeType("GLuint const *") int array) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer arrays = stack.ints(array);
            nglDeleteVertexArraysAPPLE(1, memAddress(arrays));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGenVertexArraysAPPLE ] ---

    /** {@code void glGenVertexArraysAPPLE(GLsizei n, GLuint * arrays)} */
    public static native void nglGenVertexArraysAPPLE(int n, long arrays);

    /** {@code void glGenVertexArraysAPPLE(GLsizei n, GLuint * arrays)} */
    public static void glGenVertexArraysAPPLE(@NativeType("GLuint *") IntBuffer arrays) {
        nglGenVertexArraysAPPLE(arrays.remaining(), memAddress(arrays));
    }

    /** {@code void glGenVertexArraysAPPLE(GLsizei n, GLuint * arrays)} */
    @NativeType("void")
    public static int glGenVertexArraysAPPLE() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer arrays = stack.callocInt(1);
            nglGenVertexArraysAPPLE(1, memAddress(arrays));
            return arrays.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glIsVertexArrayAPPLE ] ---

    /** {@code GLboolean glIsVertexArrayAPPLE(GLuint array)} */
    @NativeType("GLboolean")
    public static native boolean glIsVertexArrayAPPLE(@NativeType("GLuint") int array);

    /** {@code void glDeleteVertexArraysAPPLE(GLsizei n, GLuint const * arrays)} */
    public static void glDeleteVertexArraysAPPLE(@NativeType("GLuint const *") int[] arrays) {
        long __functionAddress = GL.getICD().glDeleteVertexArraysAPPLE;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(arrays.length, arrays, __functionAddress);
    }

    /** {@code void glGenVertexArraysAPPLE(GLsizei n, GLuint * arrays)} */
    public static void glGenVertexArraysAPPLE(@NativeType("GLuint *") int[] arrays) {
        long __functionAddress = GL.getICD().glGenVertexArraysAPPLE;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(arrays.length, arrays, __functionAddress);
    }

}
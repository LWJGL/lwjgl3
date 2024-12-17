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

public class OESVertexArrayObject {

    static { GLES.initialize(); }

    public static final int GL_VERTEX_ARRAY_BINDING_OES = 0x85B5;

    protected OESVertexArrayObject() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBindVertexArrayOES ] ---

    /** {@code void glBindVertexArrayOES(GLuint array)} */
    public static native void glBindVertexArrayOES(@NativeType("GLuint") int array);

    // --- [ glDeleteVertexArraysOES ] ---

    /** {@code void glDeleteVertexArraysOES(GLsizei n, GLuint const * arrays)} */
    public static native void nglDeleteVertexArraysOES(int n, long arrays);

    /** {@code void glDeleteVertexArraysOES(GLsizei n, GLuint const * arrays)} */
    public static void glDeleteVertexArraysOES(@NativeType("GLuint const *") IntBuffer arrays) {
        nglDeleteVertexArraysOES(arrays.remaining(), memAddress(arrays));
    }

    /** {@code void glDeleteVertexArraysOES(GLsizei n, GLuint const * arrays)} */
    public static void glDeleteVertexArraysOES(@NativeType("GLuint const *") int array) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer arrays = stack.ints(array);
            nglDeleteVertexArraysOES(1, memAddress(arrays));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGenVertexArraysOES ] ---

    /** {@code void glGenVertexArraysOES(GLsizei n, GLuint * arrays)} */
    public static native void nglGenVertexArraysOES(int n, long arrays);

    /** {@code void glGenVertexArraysOES(GLsizei n, GLuint * arrays)} */
    public static void glGenVertexArraysOES(@NativeType("GLuint *") IntBuffer arrays) {
        if (CHECKS) {
            check(arrays, 1);
        }
        nglGenVertexArraysOES(arrays.remaining(), memAddress(arrays));
    }

    /** {@code void glGenVertexArraysOES(GLsizei n, GLuint * arrays)} */
    @NativeType("void")
    public static int glGenVertexArraysOES() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer arrays = stack.callocInt(1);
            nglGenVertexArraysOES(1, memAddress(arrays));
            return arrays.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glIsVertexArrayOES ] ---

    /** {@code GLboolean glIsVertexArrayOES(GLuint array)} */
    @NativeType("GLboolean")
    public static native boolean glIsVertexArrayOES(@NativeType("GLuint") int array);

    /** {@code void glDeleteVertexArraysOES(GLsizei n, GLuint const * arrays)} */
    public static void glDeleteVertexArraysOES(@NativeType("GLuint const *") int[] arrays) {
        long __functionAddress = GLES.getICD().glDeleteVertexArraysOES;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(arrays.length, arrays, __functionAddress);
    }

    /** {@code void glGenVertexArraysOES(GLsizei n, GLuint * arrays)} */
    public static void glGenVertexArraysOES(@NativeType("GLuint *") int[] arrays) {
        long __functionAddress = GLES.getICD().glGenVertexArraysOES;
        if (CHECKS) {
            check(__functionAddress);
            check(arrays, 1);
        }
        callPV(arrays.length, arrays, __functionAddress);
    }

}
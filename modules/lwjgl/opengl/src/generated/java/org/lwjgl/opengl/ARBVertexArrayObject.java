/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

public class ARBVertexArrayObject {

    static { GL.initialize(); }

    public static final int GL_VERTEX_ARRAY_BINDING = 0x85B5;

    protected ARBVertexArrayObject() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBindVertexArray ] ---

    /** {@code void glBindVertexArray(GLuint array)} */
    public static void glBindVertexArray(@NativeType("GLuint") int array) {
        GL30C.glBindVertexArray(array);
    }

    // --- [ glDeleteVertexArrays ] ---

    /** {@code void glDeleteVertexArrays(GLsizei n, GLuint const * arrays)} */
    public static void nglDeleteVertexArrays(int n, long arrays) {
        GL30C.nglDeleteVertexArrays(n, arrays);
    }

    /** {@code void glDeleteVertexArrays(GLsizei n, GLuint const * arrays)} */
    public static void glDeleteVertexArrays(@NativeType("GLuint const *") IntBuffer arrays) {
        GL30C.glDeleteVertexArrays(arrays);
    }

    /** {@code void glDeleteVertexArrays(GLsizei n, GLuint const * arrays)} */
    public static void glDeleteVertexArrays(@NativeType("GLuint const *") int array) {
        GL30C.glDeleteVertexArrays(array);
    }

    // --- [ glGenVertexArrays ] ---

    /** {@code void glGenVertexArrays(GLsizei n, GLuint * arrays)} */
    public static void nglGenVertexArrays(int n, long arrays) {
        GL30C.nglGenVertexArrays(n, arrays);
    }

    /** {@code void glGenVertexArrays(GLsizei n, GLuint * arrays)} */
    public static void glGenVertexArrays(@NativeType("GLuint *") IntBuffer arrays) {
        GL30C.glGenVertexArrays(arrays);
    }

    /** {@code void glGenVertexArrays(GLsizei n, GLuint * arrays)} */
    @NativeType("void")
    public static int glGenVertexArrays() {
        return GL30C.glGenVertexArrays();
    }

    // --- [ glIsVertexArray ] ---

    /** {@code GLboolean glIsVertexArray(GLuint array)} */
    @NativeType("GLboolean")
    public static boolean glIsVertexArray(@NativeType("GLuint") int array) {
        return GL30C.glIsVertexArray(array);
    }

    /** {@code void glDeleteVertexArrays(GLsizei n, GLuint const * arrays)} */
    public static void glDeleteVertexArrays(@NativeType("GLuint const *") int[] arrays) {
        GL30C.glDeleteVertexArrays(arrays);
    }

    /** {@code void glGenVertexArrays(GLsizei n, GLuint * arrays)} */
    public static void glGenVertexArrays(@NativeType("GLuint *") int[] arrays) {
        GL30C.glGenVertexArrays(arrays);
    }

}
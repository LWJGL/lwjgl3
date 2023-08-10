/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_vertex_array_object.txt">ARB_vertex_array_object</a> extension.
 * 
 * <p>This extension introduces named vertex array objects which encapsulate vertex array state on the client side. These objects allow applications to
 * rapidly switch between large sets of array state. In addition, layered libraries can return to the default array state by simply creating and binding a
 * new vertex array object.</p>
 * 
 * <p>This extension differs from GL_APPLE_vertex_array_object in that client memory cannot be accessed through a non-zero vertex array object. It also
 * differs in that vertex array objects are explicitly not sharable between contexts.</p>
 * 
 * <p>Promoted to core in {@link GL30 OpenGL 3.0}.</p>
 */
public class ARBVertexArrayObject {

    static { GL.initialize(); }

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int GL_VERTEX_ARRAY_BINDING = 0x85B5;

    protected ARBVertexArrayObject() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBindVertexArray ] ---

    /**
     * Binds a vertex array object
     *
     * @param array the name of the vertex array to bind
     */
    public static void glBindVertexArray(@NativeType("GLuint") int array) {
        GL30C.glBindVertexArray(array);
    }

    // --- [ glDeleteVertexArrays ] ---

    /**
     * Unsafe version of: {@link #glDeleteVertexArrays DeleteVertexArrays}
     *
     * @param n the number of vertex array objects to be deleted
     */
    public static void nglDeleteVertexArrays(int n, long arrays) {
        GL30C.nglDeleteVertexArrays(n, arrays);
    }

    /**
     * Deletes vertex array objects.
     *
     * @param arrays an array containing the n names of the objects to be deleted
     */
    public static void glDeleteVertexArrays(@NativeType("GLuint const *") IntBuffer arrays) {
        GL30C.glDeleteVertexArrays(arrays);
    }

    /** Deletes vertex array objects. */
    public static void glDeleteVertexArrays(@NativeType("GLuint const *") int array) {
        GL30C.glDeleteVertexArrays(array);
    }

    // --- [ glGenVertexArrays ] ---

    /**
     * Unsafe version of: {@link #glGenVertexArrays GenVertexArrays}
     *
     * @param n the number of vertex array object names to generate
     */
    public static void nglGenVertexArrays(int n, long arrays) {
        GL30C.nglGenVertexArrays(n, arrays);
    }

    /**
     * Generates vertex array object names.
     *
     * @param arrays a buffer in which the generated vertex array object names are stored
     */
    public static void glGenVertexArrays(@NativeType("GLuint *") IntBuffer arrays) {
        GL30C.glGenVertexArrays(arrays);
    }

    /** Generates vertex array object names. */
    @NativeType("void")
    public static int glGenVertexArrays() {
        return GL30C.glGenVertexArrays();
    }

    // --- [ glIsVertexArray ] ---

    /**
     * Determines if a name corresponds to a vertex array object.
     *
     * @param array a value that may be the name of a vertex array object
     */
    @NativeType("GLboolean")
    public static boolean glIsVertexArray(@NativeType("GLuint") int array) {
        return GL30C.glIsVertexArray(array);
    }

    /** Array version of: {@link #glDeleteVertexArrays DeleteVertexArrays} */
    public static void glDeleteVertexArrays(@NativeType("GLuint const *") int[] arrays) {
        GL30C.glDeleteVertexArrays(arrays);
    }

    /** Array version of: {@link #glGenVertexArrays GenVertexArrays} */
    public static void glGenVertexArrays(@NativeType("GLuint *") int[] arrays) {
        GL30C.glGenVertexArrays(arrays);
    }

}
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

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/OES/OES_vertex_array_object.txt">OES_vertex_array_object</a> extension.
 * 
 * <p>This extension introduces vertex array objects which encapsulate vertex array states on the server side (vertex buffer objects). These objects aim to
 * keep pointers to vertex data and to provide names for different sets of vertex data. Therefore applications are allowed to rapidly switch between
 * different sets of vertex array state, and to easily return to the default vertex array state.</p>
 */
public class OESVertexArrayObject {

    static { GLES.initialize(); }

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv. */
    public static final int GL_VERTEX_ARRAY_BINDING_OES = 0x85B5;

    protected OESVertexArrayObject() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBindVertexArrayOES ] ---

    public static native void glBindVertexArrayOES(@NativeType("GLuint") int array);

    // --- [ glDeleteVertexArraysOES ] ---

    public static native void nglDeleteVertexArraysOES(int n, long arrays);

    public static void glDeleteVertexArraysOES(@NativeType("GLuint const *") IntBuffer arrays) {
        nglDeleteVertexArraysOES(arrays.remaining(), memAddress(arrays));
    }

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

    public static native void nglGenVertexArraysOES(int n, long arrays);

    public static void glGenVertexArraysOES(@NativeType("GLuint *") IntBuffer arrays) {
        if (CHECKS) {
            check(arrays, 1);
        }
        nglGenVertexArraysOES(arrays.remaining(), memAddress(arrays));
    }

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

    @NativeType("GLboolean")
    public static native boolean glIsVertexArrayOES(@NativeType("GLuint") int array);

    /** Array version of: {@link #glDeleteVertexArraysOES DeleteVertexArraysOES} */
    public static void glDeleteVertexArraysOES(@NativeType("GLuint const *") int[] arrays) {
        long __functionAddress = GLES.getICD().glDeleteVertexArraysOES;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(arrays.length, arrays, __functionAddress);
    }

    /** Array version of: {@link #glGenVertexArraysOES GenVertexArraysOES} */
    public static void glGenVertexArraysOES(@NativeType("GLuint *") int[] arrays) {
        long __functionAddress = GLES.getICD().glGenVertexArraysOES;
        if (CHECKS) {
            check(__functionAddress);
            check(arrays, 1);
        }
        callPV(arrays.length, arrays, __functionAddress);
    }

}
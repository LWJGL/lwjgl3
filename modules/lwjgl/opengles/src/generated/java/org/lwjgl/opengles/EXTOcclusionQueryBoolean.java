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

public class EXTOcclusionQueryBoolean {

    static { GLES.initialize(); }

    public static final int
        GL_ANY_SAMPLES_PASSED_EXT              = 0x8C2F,
        GL_ANY_SAMPLES_PASSED_CONSERVATIVE_EXT = 0x8D6A;

    public static final int GL_CURRENT_QUERY_EXT = 0x8865;

    public static final int
        GL_QUERY_RESULT_EXT           = 0x8866,
        GL_QUERY_RESULT_AVAILABLE_EXT = 0x8867;

    protected EXTOcclusionQueryBoolean() {
        throw new UnsupportedOperationException();
    }

    // --- [ glGenQueriesEXT ] ---

    /** {@code void glGenQueriesEXT(GLsizei n, GLuint * ids)} */
    public static native void nglGenQueriesEXT(int n, long ids);

    /** {@code void glGenQueriesEXT(GLsizei n, GLuint * ids)} */
    public static void glGenQueriesEXT(@NativeType("GLuint *") IntBuffer ids) {
        nglGenQueriesEXT(ids.remaining(), memAddress(ids));
    }

    /** {@code void glGenQueriesEXT(GLsizei n, GLuint * ids)} */
    @NativeType("void")
    public static int glGenQueriesEXT() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer ids = stack.callocInt(1);
            nglGenQueriesEXT(1, memAddress(ids));
            return ids.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glDeleteQueriesEXT ] ---

    /** {@code void glDeleteQueriesEXT(GLsizei n, GLuint const * ids)} */
    public static native void nglDeleteQueriesEXT(int n, long ids);

    /** {@code void glDeleteQueriesEXT(GLsizei n, GLuint const * ids)} */
    public static void glDeleteQueriesEXT(@NativeType("GLuint const *") IntBuffer ids) {
        nglDeleteQueriesEXT(ids.remaining(), memAddress(ids));
    }

    /** {@code void glDeleteQueriesEXT(GLsizei n, GLuint const * ids)} */
    public static void glDeleteQueriesEXT(@NativeType("GLuint const *") int id) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer ids = stack.ints(id);
            nglDeleteQueriesEXT(1, memAddress(ids));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glIsQueryEXT ] ---

    /** {@code GLboolean glIsQueryEXT(GLuint id)} */
    @NativeType("GLboolean")
    public static native boolean glIsQueryEXT(@NativeType("GLuint") int id);

    // --- [ glBeginQueryEXT ] ---

    /** {@code void glBeginQueryEXT(GLenum target, GLuint id)} */
    public static native void glBeginQueryEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int id);

    // --- [ glEndQueryEXT ] ---

    /** {@code void glEndQueryEXT(GLenum target)} */
    public static native void glEndQueryEXT(@NativeType("GLenum") int target);

    // --- [ glGetQueryivEXT ] ---

    /** {@code void glGetQueryivEXT(GLenum target, GLenum pname, GLint * params)} */
    public static native void nglGetQueryivEXT(int target, int pname, long params);

    /** {@code void glGetQueryivEXT(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetQueryivEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetQueryivEXT(target, pname, memAddress(params));
    }

    /** {@code void glGetQueryivEXT(GLenum target, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetQueryiEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetQueryivEXT(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetQueryObjectuivEXT ] ---

    /** {@code void glGetQueryObjectuivEXT(GLuint id, GLenum pname, GLuint * params)} */
    public static native void nglGetQueryObjectuivEXT(int id, int pname, long params);

    /** {@code void glGetQueryObjectuivEXT(GLuint id, GLenum pname, GLuint * params)} */
    public static void glGetQueryObjectuivEXT(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetQueryObjectuivEXT(id, pname, memAddress(params));
    }

    /** {@code void glGetQueryObjectuivEXT(GLuint id, GLenum pname, GLuint * params)} */
    @NativeType("void")
    public static int glGetQueryObjectuiEXT(@NativeType("GLuint") int id, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetQueryObjectuivEXT(id, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glGenQueriesEXT(GLsizei n, GLuint * ids)} */
    public static void glGenQueriesEXT(@NativeType("GLuint *") int[] ids) {
        long __functionAddress = GLES.getICD().glGenQueriesEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(ids.length, ids, __functionAddress);
    }

    /** {@code void glDeleteQueriesEXT(GLsizei n, GLuint const * ids)} */
    public static void glDeleteQueriesEXT(@NativeType("GLuint const *") int[] ids) {
        long __functionAddress = GLES.getICD().glDeleteQueriesEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(ids.length, ids, __functionAddress);
    }

    /** {@code void glGetQueryivEXT(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetQueryivEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetQueryivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** {@code void glGetQueryObjectuivEXT(GLuint id, GLenum pname, GLuint * params)} */
    public static void glGetQueryObjectuivEXT(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetQueryObjectuivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(id, pname, params, __functionAddress);
    }

}
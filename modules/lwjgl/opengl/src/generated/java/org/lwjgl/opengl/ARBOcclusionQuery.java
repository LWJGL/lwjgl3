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

public class ARBOcclusionQuery {

    static { GL.initialize(); }

    public static final int GL_SAMPLES_PASSED_ARB = 0x8914;

    public static final int
        GL_QUERY_COUNTER_BITS_ARB = 0x8864,
        GL_CURRENT_QUERY_ARB      = 0x8865;

    public static final int
        GL_QUERY_RESULT_ARB           = 0x8866,
        GL_QUERY_RESULT_AVAILABLE_ARB = 0x8867;

    protected ARBOcclusionQuery() {
        throw new UnsupportedOperationException();
    }

    // --- [ glGenQueriesARB ] ---

    /** {@code void glGenQueriesARB(GLsizei n, GLuint * ids)} */
    public static native void nglGenQueriesARB(int n, long ids);

    /** {@code void glGenQueriesARB(GLsizei n, GLuint * ids)} */
    public static void glGenQueriesARB(@NativeType("GLuint *") IntBuffer ids) {
        nglGenQueriesARB(ids.remaining(), memAddress(ids));
    }

    /** {@code void glGenQueriesARB(GLsizei n, GLuint * ids)} */
    @NativeType("void")
    public static int glGenQueriesARB() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer ids = stack.callocInt(1);
            nglGenQueriesARB(1, memAddress(ids));
            return ids.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glDeleteQueriesARB ] ---

    /** {@code void glDeleteQueriesARB(GLsizei n, GLuint const * ids)} */
    public static native void nglDeleteQueriesARB(int n, long ids);

    /** {@code void glDeleteQueriesARB(GLsizei n, GLuint const * ids)} */
    public static void glDeleteQueriesARB(@NativeType("GLuint const *") IntBuffer ids) {
        nglDeleteQueriesARB(ids.remaining(), memAddress(ids));
    }

    /** {@code void glDeleteQueriesARB(GLsizei n, GLuint const * ids)} */
    public static void glDeleteQueriesARB(@NativeType("GLuint const *") int id) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer ids = stack.ints(id);
            nglDeleteQueriesARB(1, memAddress(ids));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glIsQueryARB ] ---

    /** {@code GLboolean glIsQueryARB(GLuint id)} */
    @NativeType("GLboolean")
    public static native boolean glIsQueryARB(@NativeType("GLuint") int id);

    // --- [ glBeginQueryARB ] ---

    /** {@code void glBeginQueryARB(GLenum target, GLuint id)} */
    public static native void glBeginQueryARB(@NativeType("GLenum") int target, @NativeType("GLuint") int id);

    // --- [ glEndQueryARB ] ---

    /** {@code void glEndQueryARB(GLenum target)} */
    public static native void glEndQueryARB(@NativeType("GLenum") int target);

    // --- [ glGetQueryivARB ] ---

    /** {@code void glGetQueryivARB(GLenum target, GLenum pname, GLint * params)} */
    public static native void nglGetQueryivARB(int target, int pname, long params);

    /** {@code void glGetQueryivARB(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetQueryivARB(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetQueryivARB(target, pname, memAddress(params));
    }

    /** {@code void glGetQueryivARB(GLenum target, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetQueryiARB(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetQueryivARB(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetQueryObjectivARB ] ---

    /** {@code void glGetQueryObjectivARB(GLuint id, GLenum pname, GLint * params)} */
    public static native void nglGetQueryObjectivARB(int id, int pname, long params);

    /** {@code void glGetQueryObjectivARB(GLuint id, GLenum pname, GLint * params)} */
    public static void glGetQueryObjectivARB(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetQueryObjectivARB(id, pname, memAddress(params));
    }

    /** {@code void glGetQueryObjectivARB(GLuint id, GLenum pname, GLint * params)} */
    public static void glGetQueryObjectivARB(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint *") long params) {
        nglGetQueryObjectivARB(id, pname, params);
    }

    /** {@code void glGetQueryObjectivARB(GLuint id, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetQueryObjectiARB(@NativeType("GLuint") int id, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetQueryObjectivARB(id, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetQueryObjectuivARB ] ---

    /** {@code void glGetQueryObjectuivARB(GLuint id, GLenum pname, GLuint * params)} */
    public static native void nglGetQueryObjectuivARB(int id, int pname, long params);

    /** {@code void glGetQueryObjectuivARB(GLuint id, GLenum pname, GLuint * params)} */
    public static void glGetQueryObjectuivARB(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetQueryObjectuivARB(id, pname, memAddress(params));
    }

    /** {@code void glGetQueryObjectuivARB(GLuint id, GLenum pname, GLuint * params)} */
    public static void glGetQueryObjectuivARB(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint *") long params) {
        nglGetQueryObjectuivARB(id, pname, params);
    }

    /** {@code void glGetQueryObjectuivARB(GLuint id, GLenum pname, GLuint * params)} */
    @NativeType("void")
    public static int glGetQueryObjectuiARB(@NativeType("GLuint") int id, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetQueryObjectuivARB(id, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glGenQueriesARB(GLsizei n, GLuint * ids)} */
    public static void glGenQueriesARB(@NativeType("GLuint *") int[] ids) {
        long __functionAddress = GL.getICD().glGenQueriesARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(ids.length, ids, __functionAddress);
    }

    /** {@code void glDeleteQueriesARB(GLsizei n, GLuint const * ids)} */
    public static void glDeleteQueriesARB(@NativeType("GLuint const *") int[] ids) {
        long __functionAddress = GL.getICD().glDeleteQueriesARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(ids.length, ids, __functionAddress);
    }

    /** {@code void glGetQueryivARB(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetQueryivARB(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetQueryivARB;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** {@code void glGetQueryObjectivARB(GLuint id, GLenum pname, GLint * params)} */
    public static void glGetQueryObjectivARB(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetQueryObjectivARB;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(id, pname, params, __functionAddress);
    }

    /** {@code void glGetQueryObjectuivARB(GLuint id, GLenum pname, GLuint * params)} */
    public static void glGetQueryObjectuivARB(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] params) {
        long __functionAddress = GL.getICD().glGetQueryObjectuivARB;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(id, pname, params, __functionAddress);
    }

}
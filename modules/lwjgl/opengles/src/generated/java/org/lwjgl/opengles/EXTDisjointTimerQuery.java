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

public class EXTDisjointTimerQuery {

    static { GLES.initialize(); }

    public static final int
        GL_QUERY_COUNTER_BITS_EXT = 0x8864,
        GL_CURRENT_QUERY_EXT      = 0x8865;

    public static final int
        GL_QUERY_RESULT_EXT           = 0x8866,
        GL_QUERY_RESULT_AVAILABLE_EXT = 0x8867;

    public static final int GL_TIME_ELAPSED_EXT = 0x88BF;

    public static final int GL_TIMESTAMP_EXT = 0x8E28;

    public static final int GL_GPU_DISJOINT_EXT = 0x8FBB;

    protected EXTDisjointTimerQuery() {
        throw new UnsupportedOperationException();
    }

    // --- [ glGenQueriesEXT ] ---

    /** {@code void glGenQueriesEXT(GLsizei n, GLuint * ids)} */
    public static void nglGenQueriesEXT(int n, long ids) {
        EXTOcclusionQueryBoolean.nglGenQueriesEXT(n, ids);
    }

    /** {@code void glGenQueriesEXT(GLsizei n, GLuint * ids)} */
    public static void glGenQueriesEXT(@NativeType("GLuint *") IntBuffer ids) {
        EXTOcclusionQueryBoolean.glGenQueriesEXT(ids);
    }

    /** {@code void glGenQueriesEXT(GLsizei n, GLuint * ids)} */
    @NativeType("void")
    public static int glGenQueriesEXT() {
        return EXTOcclusionQueryBoolean.glGenQueriesEXT();
    }

    // --- [ glDeleteQueriesEXT ] ---

    /** {@code void glDeleteQueriesEXT(GLsizei n, GLuint const * ids)} */
    public static void nglDeleteQueriesEXT(int n, long ids) {
        EXTOcclusionQueryBoolean.nglDeleteQueriesEXT(n, ids);
    }

    /** {@code void glDeleteQueriesEXT(GLsizei n, GLuint const * ids)} */
    public static void glDeleteQueriesEXT(@NativeType("GLuint const *") IntBuffer ids) {
        EXTOcclusionQueryBoolean.glDeleteQueriesEXT(ids);
    }

    /** {@code void glDeleteQueriesEXT(GLsizei n, GLuint const * ids)} */
    public static void glDeleteQueriesEXT(@NativeType("GLuint const *") int id) {
        EXTOcclusionQueryBoolean.glDeleteQueriesEXT(id);
    }

    // --- [ glIsQueryEXT ] ---

    /** {@code GLboolean glIsQueryEXT(GLuint id)} */
    @NativeType("GLboolean")
    public static boolean glIsQueryEXT(@NativeType("GLuint") int id) {
        return EXTOcclusionQueryBoolean.glIsQueryEXT(id);
    }

    // --- [ glBeginQueryEXT ] ---

    /** {@code void glBeginQueryEXT(GLenum target, GLuint id)} */
    public static void glBeginQueryEXT(@NativeType("GLenum") int target, @NativeType("GLuint") int id) {
        EXTOcclusionQueryBoolean.glBeginQueryEXT(target, id);
    }

    // --- [ glEndQueryEXT ] ---

    /** {@code void glEndQueryEXT(GLenum target)} */
    public static void glEndQueryEXT(@NativeType("GLenum") int target) {
        EXTOcclusionQueryBoolean.glEndQueryEXT(target);
    }

    // --- [ glGetQueryivEXT ] ---

    /** {@code void glGetQueryivEXT(GLenum target, GLenum pname, GLint * params)} */
    public static void nglGetQueryivEXT(int target, int pname, long params) {
        EXTOcclusionQueryBoolean.nglGetQueryivEXT(target, pname, params);
    }

    /** {@code void glGetQueryivEXT(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetQueryivEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        EXTOcclusionQueryBoolean.glGetQueryivEXT(target, pname, params);
    }

    /** {@code void glGetQueryivEXT(GLenum target, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetQueryiEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        return EXTOcclusionQueryBoolean.glGetQueryiEXT(target, pname);
    }

    // --- [ glGetQueryObjectuivEXT ] ---

    /** {@code void glGetQueryObjectuivEXT(GLuint id, GLenum pname, GLuint * params)} */
    public static void nglGetQueryObjectuivEXT(int id, int pname, long params) {
        EXTOcclusionQueryBoolean.nglGetQueryObjectuivEXT(id, pname, params);
    }

    /** {@code void glGetQueryObjectuivEXT(GLuint id, GLenum pname, GLuint * params)} */
    public static void glGetQueryObjectuivEXT(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint *") IntBuffer params) {
        EXTOcclusionQueryBoolean.glGetQueryObjectuivEXT(id, pname, params);
    }

    /** {@code void glGetQueryObjectuivEXT(GLuint id, GLenum pname, GLuint * params)} */
    @NativeType("void")
    public static int glGetQueryObjectuiEXT(@NativeType("GLuint") int id, @NativeType("GLenum") int pname) {
        return EXTOcclusionQueryBoolean.glGetQueryObjectuiEXT(id, pname);
    }

    // --- [ glQueryCounterEXT ] ---

    /** {@code void glQueryCounterEXT(GLuint id, GLenum target)} */
    public static native void glQueryCounterEXT(@NativeType("GLuint") int id, @NativeType("GLenum") int target);

    // --- [ glGetQueryObjectivEXT ] ---

    /** {@code void glGetQueryObjectivEXT(GLuint id, GLenum pname, GLint * params)} */
    public static native void nglGetQueryObjectivEXT(int id, int pname, long params);

    /** {@code void glGetQueryObjectivEXT(GLuint id, GLenum pname, GLint * params)} */
    public static void glGetQueryObjectivEXT(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetQueryObjectivEXT(id, pname, memAddress(params));
    }

    /** {@code void glGetQueryObjectivEXT(GLuint id, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetQueryObjectiEXT(@NativeType("GLuint") int id, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetQueryObjectivEXT(id, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetQueryObjecti64vEXT ] ---

    /** {@code void glGetQueryObjecti64vEXT(GLuint id, GLenum pname, GLint64 * params)} */
    public static native void nglGetQueryObjecti64vEXT(int id, int pname, long params);

    /** {@code void glGetQueryObjecti64vEXT(GLuint id, GLenum pname, GLint64 * params)} */
    public static void glGetQueryObjecti64vEXT(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint64 *") LongBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetQueryObjecti64vEXT(id, pname, memAddress(params));
    }

    /** {@code void glGetQueryObjecti64vEXT(GLuint id, GLenum pname, GLint64 * params)} */
    @NativeType("void")
    public static long glGetQueryObjecti64EXT(@NativeType("GLuint") int id, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer params = stack.callocLong(1);
            nglGetQueryObjecti64vEXT(id, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetQueryObjectui64vEXT ] ---

    /** {@code void glGetQueryObjectui64vEXT(GLuint id, GLenum pname, GLuint64 * params)} */
    public static native void nglGetQueryObjectui64vEXT(int id, int pname, long params);

    /** {@code void glGetQueryObjectui64vEXT(GLuint id, GLenum pname, GLuint64 * params)} */
    public static void glGetQueryObjectui64vEXT(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint64 *") LongBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetQueryObjectui64vEXT(id, pname, memAddress(params));
    }

    /** {@code void glGetQueryObjectui64vEXT(GLuint id, GLenum pname, GLuint64 * params)} */
    @NativeType("void")
    public static long glGetQueryObjectui64EXT(@NativeType("GLuint") int id, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer params = stack.callocLong(1);
            nglGetQueryObjectui64vEXT(id, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetInteger64vEXT ] ---

    /** {@code void glGetInteger64vEXT(GLenum pname, GLint64 * data)} */
    public static native void nglGetInteger64vEXT(int pname, long data);

    /** {@code void glGetInteger64vEXT(GLenum pname, GLint64 * data)} */
    public static void glGetInteger64vEXT(@NativeType("GLenum") int pname, @NativeType("GLint64 *") LongBuffer data) {
        if (CHECKS) {
            check(data, 1);
        }
        nglGetInteger64vEXT(pname, memAddress(data));
    }

    /** {@code void glGetInteger64vEXT(GLenum pname, GLint64 * data)} */
    @NativeType("void")
    public static long glGetInteger64EXT(@NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer data = stack.callocLong(1);
            nglGetInteger64vEXT(pname, memAddress(data));
            return data.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glGenQueriesEXT(GLsizei n, GLuint * ids)} */
    public static void glGenQueriesEXT(@NativeType("GLuint *") int[] ids) {
        EXTOcclusionQueryBoolean.glGenQueriesEXT(ids);
    }

    /** {@code void glDeleteQueriesEXT(GLsizei n, GLuint const * ids)} */
    public static void glDeleteQueriesEXT(@NativeType("GLuint const *") int[] ids) {
        EXTOcclusionQueryBoolean.glDeleteQueriesEXT(ids);
    }

    /** {@code void glGetQueryivEXT(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetQueryivEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        EXTOcclusionQueryBoolean.glGetQueryivEXT(target, pname, params);
    }

    /** {@code void glGetQueryObjectuivEXT(GLuint id, GLenum pname, GLuint * params)} */
    public static void glGetQueryObjectuivEXT(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] params) {
        EXTOcclusionQueryBoolean.glGetQueryObjectuivEXT(id, pname, params);
    }

    /** {@code void glGetQueryObjectivEXT(GLuint id, GLenum pname, GLint * params)} */
    public static void glGetQueryObjectivEXT(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetQueryObjectivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(id, pname, params, __functionAddress);
    }

    /** {@code void glGetQueryObjecti64vEXT(GLuint id, GLenum pname, GLint64 * params)} */
    public static void glGetQueryObjecti64vEXT(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint64 *") long[] params) {
        long __functionAddress = GLES.getICD().glGetQueryObjecti64vEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(id, pname, params, __functionAddress);
    }

    /** {@code void glGetQueryObjectui64vEXT(GLuint id, GLenum pname, GLuint64 * params)} */
    public static void glGetQueryObjectui64vEXT(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint64 *") long[] params) {
        long __functionAddress = GLES.getICD().glGetQueryObjectui64vEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(id, pname, params, __functionAddress);
    }

    /** {@code void glGetInteger64vEXT(GLenum pname, GLint64 * data)} */
    public static void glGetInteger64vEXT(@NativeType("GLenum") int pname, @NativeType("GLint64 *") long[] data) {
        long __functionAddress = GLES.getICD().glGetInteger64vEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(data, 1);
        }
        callPV(pname, data, __functionAddress);
    }

}
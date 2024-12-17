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

public class NVVertexAttribInteger64bit {

    static { GL.initialize(); }

    public static final int
        GL_INT64_NV          = 0x140E,
        GL_UNSIGNED_INT64_NV = 0x140F;

    protected NVVertexAttribInteger64bit() {
        throw new UnsupportedOperationException();
    }

    // --- [ glVertexAttribL1i64NV ] ---

    /** {@code void glVertexAttribL1i64NV(GLuint index, GLint64EXT x)} */
    public static native void glVertexAttribL1i64NV(@NativeType("GLuint") int index, @NativeType("GLint64EXT") long x);

    // --- [ glVertexAttribL2i64NV ] ---

    /** {@code void glVertexAttribL2i64NV(GLuint index, GLint64EXT x, GLint64EXT y)} */
    public static native void glVertexAttribL2i64NV(@NativeType("GLuint") int index, @NativeType("GLint64EXT") long x, @NativeType("GLint64EXT") long y);

    // --- [ glVertexAttribL3i64NV ] ---

    /** {@code void glVertexAttribL3i64NV(GLuint index, GLint64EXT x, GLint64EXT y, GLint64EXT z)} */
    public static native void glVertexAttribL3i64NV(@NativeType("GLuint") int index, @NativeType("GLint64EXT") long x, @NativeType("GLint64EXT") long y, @NativeType("GLint64EXT") long z);

    // --- [ glVertexAttribL4i64NV ] ---

    /** {@code void glVertexAttribL4i64NV(GLuint index, GLint64EXT x, GLint64EXT y, GLint64EXT z, GLint64EXT w)} */
    public static native void glVertexAttribL4i64NV(@NativeType("GLuint") int index, @NativeType("GLint64EXT") long x, @NativeType("GLint64EXT") long y, @NativeType("GLint64EXT") long z, @NativeType("GLint64EXT") long w);

    // --- [ glVertexAttribL1i64vNV ] ---

    /** {@code void glVertexAttribL1i64vNV(GLuint index, GLint64EXT const * v)} */
    public static native void nglVertexAttribL1i64vNV(int index, long v);

    /** {@code void glVertexAttribL1i64vNV(GLuint index, GLint64EXT const * v)} */
    public static void glVertexAttribL1i64vNV(@NativeType("GLuint") int index, @NativeType("GLint64EXT const *") LongBuffer v) {
        if (CHECKS) {
            check(v, 1);
        }
        nglVertexAttribL1i64vNV(index, memAddress(v));
    }

    // --- [ glVertexAttribL2i64vNV ] ---

    /** {@code void glVertexAttribL2i64vNV(GLuint index, GLint64EXT const * v)} */
    public static native void nglVertexAttribL2i64vNV(int index, long v);

    /** {@code void glVertexAttribL2i64vNV(GLuint index, GLint64EXT const * v)} */
    public static void glVertexAttribL2i64vNV(@NativeType("GLuint") int index, @NativeType("GLint64EXT const *") LongBuffer v) {
        if (CHECKS) {
            check(v, 2);
        }
        nglVertexAttribL2i64vNV(index, memAddress(v));
    }

    // --- [ glVertexAttribL3i64vNV ] ---

    /** {@code void glVertexAttribL3i64vNV(GLuint index, GLint64EXT const * v)} */
    public static native void nglVertexAttribL3i64vNV(int index, long v);

    /** {@code void glVertexAttribL3i64vNV(GLuint index, GLint64EXT const * v)} */
    public static void glVertexAttribL3i64vNV(@NativeType("GLuint") int index, @NativeType("GLint64EXT const *") LongBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglVertexAttribL3i64vNV(index, memAddress(v));
    }

    // --- [ glVertexAttribL4i64vNV ] ---

    /** {@code void glVertexAttribL4i64vNV(GLuint index, GLint64EXT const * v)} */
    public static native void nglVertexAttribL4i64vNV(int index, long v);

    /** {@code void glVertexAttribL4i64vNV(GLuint index, GLint64EXT const * v)} */
    public static void glVertexAttribL4i64vNV(@NativeType("GLuint") int index, @NativeType("GLint64EXT const *") LongBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttribL4i64vNV(index, memAddress(v));
    }

    // --- [ glVertexAttribL1ui64NV ] ---

    /** {@code void glVertexAttribL1ui64NV(GLuint index, GLuint64EXT x)} */
    public static native void glVertexAttribL1ui64NV(@NativeType("GLuint") int index, @NativeType("GLuint64EXT") long x);

    // --- [ glVertexAttribL2ui64NV ] ---

    /** {@code void glVertexAttribL2ui64NV(GLuint index, GLuint64EXT x, GLuint64EXT y)} */
    public static native void glVertexAttribL2ui64NV(@NativeType("GLuint") int index, @NativeType("GLuint64EXT") long x, @NativeType("GLuint64EXT") long y);

    // --- [ glVertexAttribL3ui64NV ] ---

    /** {@code void glVertexAttribL3ui64NV(GLuint index, GLuint64EXT x, GLuint64EXT y, GLuint64EXT z)} */
    public static native void glVertexAttribL3ui64NV(@NativeType("GLuint") int index, @NativeType("GLuint64EXT") long x, @NativeType("GLuint64EXT") long y, @NativeType("GLuint64EXT") long z);

    // --- [ glVertexAttribL4ui64NV ] ---

    /** {@code void glVertexAttribL4ui64NV(GLuint index, GLuint64EXT x, GLuint64EXT y, GLuint64EXT z, GLuint64EXT w)} */
    public static native void glVertexAttribL4ui64NV(@NativeType("GLuint") int index, @NativeType("GLuint64EXT") long x, @NativeType("GLuint64EXT") long y, @NativeType("GLuint64EXT") long z, @NativeType("GLuint64EXT") long w);

    // --- [ glVertexAttribL1ui64vNV ] ---

    /** {@code void glVertexAttribL1ui64vNV(GLuint index, GLuint64EXT const * v)} */
    public static native void nglVertexAttribL1ui64vNV(int index, long v);

    /** {@code void glVertexAttribL1ui64vNV(GLuint index, GLuint64EXT const * v)} */
    public static void glVertexAttribL1ui64vNV(@NativeType("GLuint") int index, @NativeType("GLuint64EXT const *") LongBuffer v) {
        if (CHECKS) {
            check(v, 1);
        }
        nglVertexAttribL1ui64vNV(index, memAddress(v));
    }

    // --- [ glVertexAttribL2ui64vNV ] ---

    /** {@code void glVertexAttribL2ui64vNV(GLuint index, GLuint64EXT const * v)} */
    public static native void nglVertexAttribL2ui64vNV(int index, long v);

    /** {@code void glVertexAttribL2ui64vNV(GLuint index, GLuint64EXT const * v)} */
    public static void glVertexAttribL2ui64vNV(@NativeType("GLuint") int index, @NativeType("GLuint64EXT const *") LongBuffer v) {
        if (CHECKS) {
            check(v, 2);
        }
        nglVertexAttribL2ui64vNV(index, memAddress(v));
    }

    // --- [ glVertexAttribL3ui64vNV ] ---

    /** {@code void glVertexAttribL3ui64vNV(GLuint index, GLuint64EXT const * v)} */
    public static native void nglVertexAttribL3ui64vNV(int index, long v);

    /** {@code void glVertexAttribL3ui64vNV(GLuint index, GLuint64EXT const * v)} */
    public static void glVertexAttribL3ui64vNV(@NativeType("GLuint") int index, @NativeType("GLuint64EXT const *") LongBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglVertexAttribL3ui64vNV(index, memAddress(v));
    }

    // --- [ glVertexAttribL4ui64vNV ] ---

    /** {@code void glVertexAttribL4ui64vNV(GLuint index, GLuint64EXT const * v)} */
    public static native void nglVertexAttribL4ui64vNV(int index, long v);

    /** {@code void glVertexAttribL4ui64vNV(GLuint index, GLuint64EXT const * v)} */
    public static void glVertexAttribL4ui64vNV(@NativeType("GLuint") int index, @NativeType("GLuint64EXT const *") LongBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttribL4ui64vNV(index, memAddress(v));
    }

    // --- [ glGetVertexAttribLi64vNV ] ---

    /** {@code void glGetVertexAttribLi64vNV(GLuint index, GLenum pname, GLint64EXT * params)} */
    public static native void nglGetVertexAttribLi64vNV(int index, int pname, long params);

    /** {@code void glGetVertexAttribLi64vNV(GLuint index, GLenum pname, GLint64EXT * params)} */
    public static void glGetVertexAttribLi64vNV(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint64EXT *") LongBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetVertexAttribLi64vNV(index, pname, memAddress(params));
    }

    /** {@code void glGetVertexAttribLi64vNV(GLuint index, GLenum pname, GLint64EXT * params)} */
    @NativeType("void")
    public static long glGetVertexAttribLi64NV(@NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer params = stack.callocLong(1);
            nglGetVertexAttribLi64vNV(index, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetVertexAttribLui64vNV ] ---

    /** {@code void glGetVertexAttribLui64vNV(GLuint index, GLenum pname, GLuint64EXT * params)} */
    public static native void nglGetVertexAttribLui64vNV(int index, int pname, long params);

    /** {@code void glGetVertexAttribLui64vNV(GLuint index, GLenum pname, GLuint64EXT * params)} */
    public static void glGetVertexAttribLui64vNV(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLuint64EXT *") LongBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetVertexAttribLui64vNV(index, pname, memAddress(params));
    }

    /** {@code void glGetVertexAttribLui64vNV(GLuint index, GLenum pname, GLuint64EXT * params)} */
    @NativeType("void")
    public static long glGetVertexAttribLui64NV(@NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer params = stack.callocLong(1);
            nglGetVertexAttribLui64vNV(index, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glVertexAttribLFormatNV ] ---

    /** {@code void glVertexAttribLFormatNV(GLuint index, GLint size, GLenum type, GLsizei stride)} */
    public static native void glVertexAttribLFormatNV(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride);

    /** {@code void glVertexAttribL1i64vNV(GLuint index, GLint64EXT const * v)} */
    public static void glVertexAttribL1i64vNV(@NativeType("GLuint") int index, @NativeType("GLint64EXT const *") long[] v) {
        long __functionAddress = GL.getICD().glVertexAttribL1i64vNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 1);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttribL2i64vNV(GLuint index, GLint64EXT const * v)} */
    public static void glVertexAttribL2i64vNV(@NativeType("GLuint") int index, @NativeType("GLint64EXT const *") long[] v) {
        long __functionAddress = GL.getICD().glVertexAttribL2i64vNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 2);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttribL3i64vNV(GLuint index, GLint64EXT const * v)} */
    public static void glVertexAttribL3i64vNV(@NativeType("GLuint") int index, @NativeType("GLint64EXT const *") long[] v) {
        long __functionAddress = GL.getICD().glVertexAttribL3i64vNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttribL4i64vNV(GLuint index, GLint64EXT const * v)} */
    public static void glVertexAttribL4i64vNV(@NativeType("GLuint") int index, @NativeType("GLint64EXT const *") long[] v) {
        long __functionAddress = GL.getICD().glVertexAttribL4i64vNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttribL1ui64vNV(GLuint index, GLuint64EXT const * v)} */
    public static void glVertexAttribL1ui64vNV(@NativeType("GLuint") int index, @NativeType("GLuint64EXT const *") long[] v) {
        long __functionAddress = GL.getICD().glVertexAttribL1ui64vNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 1);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttribL2ui64vNV(GLuint index, GLuint64EXT const * v)} */
    public static void glVertexAttribL2ui64vNV(@NativeType("GLuint") int index, @NativeType("GLuint64EXT const *") long[] v) {
        long __functionAddress = GL.getICD().glVertexAttribL2ui64vNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 2);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttribL3ui64vNV(GLuint index, GLuint64EXT const * v)} */
    public static void glVertexAttribL3ui64vNV(@NativeType("GLuint") int index, @NativeType("GLuint64EXT const *") long[] v) {
        long __functionAddress = GL.getICD().glVertexAttribL3ui64vNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttribL4ui64vNV(GLuint index, GLuint64EXT const * v)} */
    public static void glVertexAttribL4ui64vNV(@NativeType("GLuint") int index, @NativeType("GLuint64EXT const *") long[] v) {
        long __functionAddress = GL.getICD().glVertexAttribL4ui64vNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glGetVertexAttribLi64vNV(GLuint index, GLenum pname, GLint64EXT * params)} */
    public static void glGetVertexAttribLi64vNV(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint64EXT *") long[] params) {
        long __functionAddress = GL.getICD().glGetVertexAttribLi64vNV;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(index, pname, params, __functionAddress);
    }

    /** {@code void glGetVertexAttribLui64vNV(GLuint index, GLenum pname, GLuint64EXT * params)} */
    public static void glGetVertexAttribLui64vNV(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLuint64EXT *") long[] params) {
        long __functionAddress = GL.getICD().glGetVertexAttribLui64vNV;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(index, pname, params, __functionAddress);
    }

}
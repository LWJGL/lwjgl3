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

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_vertex_attrib_integer_64bit.txt">NV_vertex_attrib_integer_64bit</a> extension.
 * 
 * <p>This extension provides support for specifying vertex attributes with 64-bit integer components, analagous to the 64-bit floating point support added
 * in EXT_vertex_attrib_64bit.</p>
 * 
 * <p>Additionally, it provides the VertexAttribLFormatNV entry point to specify bindless vertex attribute arrays with 64-bit integer or floating-point
 * components in conjunction with the NV_vertex_buffer_unified_memory extension.</p>
 * 
 * <p>Requires {@link GL30 OpenGL 3.0}, GLSL 1.30, {@link NVGPUShader5 NV_gpu_shader5} or equivalent functionality and {@link EXTVertexAttrib64bit EXT_vertex_attrib_64bit}.</p>
 */
public class NVVertexAttribInteger64bit {

    static { GL.initialize(); }

    /** Accepted by the {@code type} parameter of VertexAttribLPointerEXT, VertexArrayVertexAttribLOffsetEXT, and VertexAttribLFormatNV. */
    public static final int
        GL_INT64_NV          = 0x140E,
        GL_UNSIGNED_INT64_NV = 0x140F;

    protected NVVertexAttribInteger64bit() {
        throw new UnsupportedOperationException();
    }

    // --- [ glVertexAttribL1i64NV ] ---

    public static native void glVertexAttribL1i64NV(@NativeType("GLuint") int index, @NativeType("GLint64EXT") long x);

    // --- [ glVertexAttribL2i64NV ] ---

    public static native void glVertexAttribL2i64NV(@NativeType("GLuint") int index, @NativeType("GLint64EXT") long x, @NativeType("GLint64EXT") long y);

    // --- [ glVertexAttribL3i64NV ] ---

    public static native void glVertexAttribL3i64NV(@NativeType("GLuint") int index, @NativeType("GLint64EXT") long x, @NativeType("GLint64EXT") long y, @NativeType("GLint64EXT") long z);

    // --- [ glVertexAttribL4i64NV ] ---

    public static native void glVertexAttribL4i64NV(@NativeType("GLuint") int index, @NativeType("GLint64EXT") long x, @NativeType("GLint64EXT") long y, @NativeType("GLint64EXT") long z, @NativeType("GLint64EXT") long w);

    // --- [ glVertexAttribL1i64vNV ] ---

    public static native void nglVertexAttribL1i64vNV(int index, long v);

    public static void glVertexAttribL1i64vNV(@NativeType("GLuint") int index, @NativeType("GLint64EXT const *") LongBuffer v) {
        if (CHECKS) {
            check(v, 1);
        }
        nglVertexAttribL1i64vNV(index, memAddress(v));
    }

    // --- [ glVertexAttribL2i64vNV ] ---

    public static native void nglVertexAttribL2i64vNV(int index, long v);

    public static void glVertexAttribL2i64vNV(@NativeType("GLuint") int index, @NativeType("GLint64EXT const *") LongBuffer v) {
        if (CHECKS) {
            check(v, 2);
        }
        nglVertexAttribL2i64vNV(index, memAddress(v));
    }

    // --- [ glVertexAttribL3i64vNV ] ---

    public static native void nglVertexAttribL3i64vNV(int index, long v);

    public static void glVertexAttribL3i64vNV(@NativeType("GLuint") int index, @NativeType("GLint64EXT const *") LongBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglVertexAttribL3i64vNV(index, memAddress(v));
    }

    // --- [ glVertexAttribL4i64vNV ] ---

    public static native void nglVertexAttribL4i64vNV(int index, long v);

    public static void glVertexAttribL4i64vNV(@NativeType("GLuint") int index, @NativeType("GLint64EXT const *") LongBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttribL4i64vNV(index, memAddress(v));
    }

    // --- [ glVertexAttribL1ui64NV ] ---

    public static native void glVertexAttribL1ui64NV(@NativeType("GLuint") int index, @NativeType("GLuint64EXT") long x);

    // --- [ glVertexAttribL2ui64NV ] ---

    public static native void glVertexAttribL2ui64NV(@NativeType("GLuint") int index, @NativeType("GLuint64EXT") long x, @NativeType("GLuint64EXT") long y);

    // --- [ glVertexAttribL3ui64NV ] ---

    public static native void glVertexAttribL3ui64NV(@NativeType("GLuint") int index, @NativeType("GLuint64EXT") long x, @NativeType("GLuint64EXT") long y, @NativeType("GLuint64EXT") long z);

    // --- [ glVertexAttribL4ui64NV ] ---

    public static native void glVertexAttribL4ui64NV(@NativeType("GLuint") int index, @NativeType("GLuint64EXT") long x, @NativeType("GLuint64EXT") long y, @NativeType("GLuint64EXT") long z, @NativeType("GLuint64EXT") long w);

    // --- [ glVertexAttribL1ui64vNV ] ---

    public static native void nglVertexAttribL1ui64vNV(int index, long v);

    public static void glVertexAttribL1ui64vNV(@NativeType("GLuint") int index, @NativeType("GLuint64EXT const *") LongBuffer v) {
        if (CHECKS) {
            check(v, 1);
        }
        nglVertexAttribL1ui64vNV(index, memAddress(v));
    }

    // --- [ glVertexAttribL2ui64vNV ] ---

    public static native void nglVertexAttribL2ui64vNV(int index, long v);

    public static void glVertexAttribL2ui64vNV(@NativeType("GLuint") int index, @NativeType("GLuint64EXT const *") LongBuffer v) {
        if (CHECKS) {
            check(v, 2);
        }
        nglVertexAttribL2ui64vNV(index, memAddress(v));
    }

    // --- [ glVertexAttribL3ui64vNV ] ---

    public static native void nglVertexAttribL3ui64vNV(int index, long v);

    public static void glVertexAttribL3ui64vNV(@NativeType("GLuint") int index, @NativeType("GLuint64EXT const *") LongBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglVertexAttribL3ui64vNV(index, memAddress(v));
    }

    // --- [ glVertexAttribL4ui64vNV ] ---

    public static native void nglVertexAttribL4ui64vNV(int index, long v);

    public static void glVertexAttribL4ui64vNV(@NativeType("GLuint") int index, @NativeType("GLuint64EXT const *") LongBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttribL4ui64vNV(index, memAddress(v));
    }

    // --- [ glGetVertexAttribLi64vNV ] ---

    public static native void nglGetVertexAttribLi64vNV(int index, int pname, long params);

    public static void glGetVertexAttribLi64vNV(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint64EXT *") LongBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetVertexAttribLi64vNV(index, pname, memAddress(params));
    }

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

    public static native void nglGetVertexAttribLui64vNV(int index, int pname, long params);

    public static void glGetVertexAttribLui64vNV(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLuint64EXT *") LongBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetVertexAttribLui64vNV(index, pname, memAddress(params));
    }

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

    public static native void glVertexAttribLFormatNV(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride);

    /** Array version of: {@link #glVertexAttribL1i64vNV VertexAttribL1i64vNV} */
    public static void glVertexAttribL1i64vNV(@NativeType("GLuint") int index, @NativeType("GLint64EXT const *") long[] v) {
        long __functionAddress = GL.getICD().glVertexAttribL1i64vNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 1);
        }
        callPV(index, v, __functionAddress);
    }

    /** Array version of: {@link #glVertexAttribL2i64vNV VertexAttribL2i64vNV} */
    public static void glVertexAttribL2i64vNV(@NativeType("GLuint") int index, @NativeType("GLint64EXT const *") long[] v) {
        long __functionAddress = GL.getICD().glVertexAttribL2i64vNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 2);
        }
        callPV(index, v, __functionAddress);
    }

    /** Array version of: {@link #glVertexAttribL3i64vNV VertexAttribL3i64vNV} */
    public static void glVertexAttribL3i64vNV(@NativeType("GLuint") int index, @NativeType("GLint64EXT const *") long[] v) {
        long __functionAddress = GL.getICD().glVertexAttribL3i64vNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(index, v, __functionAddress);
    }

    /** Array version of: {@link #glVertexAttribL4i64vNV VertexAttribL4i64vNV} */
    public static void glVertexAttribL4i64vNV(@NativeType("GLuint") int index, @NativeType("GLint64EXT const *") long[] v) {
        long __functionAddress = GL.getICD().glVertexAttribL4i64vNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(index, v, __functionAddress);
    }

    /** Array version of: {@link #glVertexAttribL1ui64vNV VertexAttribL1ui64vNV} */
    public static void glVertexAttribL1ui64vNV(@NativeType("GLuint") int index, @NativeType("GLuint64EXT const *") long[] v) {
        long __functionAddress = GL.getICD().glVertexAttribL1ui64vNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 1);
        }
        callPV(index, v, __functionAddress);
    }

    /** Array version of: {@link #glVertexAttribL2ui64vNV VertexAttribL2ui64vNV} */
    public static void glVertexAttribL2ui64vNV(@NativeType("GLuint") int index, @NativeType("GLuint64EXT const *") long[] v) {
        long __functionAddress = GL.getICD().glVertexAttribL2ui64vNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 2);
        }
        callPV(index, v, __functionAddress);
    }

    /** Array version of: {@link #glVertexAttribL3ui64vNV VertexAttribL3ui64vNV} */
    public static void glVertexAttribL3ui64vNV(@NativeType("GLuint") int index, @NativeType("GLuint64EXT const *") long[] v) {
        long __functionAddress = GL.getICD().glVertexAttribL3ui64vNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(index, v, __functionAddress);
    }

    /** Array version of: {@link #glVertexAttribL4ui64vNV VertexAttribL4ui64vNV} */
    public static void glVertexAttribL4ui64vNV(@NativeType("GLuint") int index, @NativeType("GLuint64EXT const *") long[] v) {
        long __functionAddress = GL.getICD().glVertexAttribL4ui64vNV;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(index, v, __functionAddress);
    }

    /** Array version of: {@link #glGetVertexAttribLi64vNV GetVertexAttribLi64vNV} */
    public static void glGetVertexAttribLi64vNV(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint64EXT *") long[] params) {
        long __functionAddress = GL.getICD().glGetVertexAttribLi64vNV;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(index, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glGetVertexAttribLui64vNV GetVertexAttribLui64vNV} */
    public static void glGetVertexAttribLui64vNV(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLuint64EXT *") long[] params) {
        long __functionAddress = GL.getICD().glGetVertexAttribLui64vNV;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(index, pname, params, __functionAddress);
    }

}
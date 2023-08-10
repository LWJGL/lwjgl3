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
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_vertex_attrib_64bit.txt">EXT_vertex_attrib_64bit</a> extension.
 * 
 * <p>This extension provides OpenGL shading language support for vertex shader inputs with 64-bit floating-point components and OpenGL API support for
 * specifying the value of those inputs using vertex array or immediate mode entry points. This builds on the support for general-purpose support for
 * 64-bit floating-point values in the ARB_gpu_shader_fp64 extension.</p>
 * 
 * <p>This extension provides a new class of vertex attribute functions, beginning with "VertexAttribL" ("L" for "long"), that can be used to specify
 * attributes with 64-bit floating-point components. This extension provides no automatic type conversion between attribute and shader variables;
 * single-precision attributes are not automatically converted to double-precision or vice versa. For shader variables with 64-bit component types, the
 * "VertexAttribL" functions must be used to specify attribute values. For other shader variables, the "VertexAttribL" functions must not be used. If a
 * vertex attribute is specified using the wrong attribute function, the values of the corresponding shader input are undefined. This approach requiring
 * matching types is identical to that used for the "VertexAttribI" functions provided by OpenGL 3.0 and the EXT_gpu_shader4 extension.</p>
 * 
 * <p>Additionally, some vertex shader inputs using the wider 64-bit components may count double against the implementation-dependent limit on the number of
 * vertex shader attribute vectors. A 64-bit scalar or a two-component vector consumes only a single generic vertex attribute; three- and four-component
 * "long" may count as two. This approach is similar to the one used in the current GL where matrix attributes consume multiple attributes.</p>
 * 
 * <p>Note that 64-bit generic vertex attributes were nominally supported beginning with the introduction of vertex shaders in OpenGL 2.0. However, the
 * OpenGL Shading Language at the time had no support for 64-bit data types, so any such values were automatically converted to 32-bit.</p>
 * 
 * <p>Support for 64-bit floating-point vertex attributes in this extension can be combined with other extensions. In particular, this extension provides an
 * entry point that can be used with EXT_direct_state_access to directly set state for any vertex array object. Also, the related
 * NV_vertex_attrib_integer_64bit extension provides an entry point to specify bindless vertex attribute arrays with 64-bit components, integer or
 * floating-point.</p>
 * 
 * <p>Requires {@link GL30 OpenGL 3.0} and {@link ARBGPUShaderFP64 ARB_gpu_shader_fp64} (or equivalent functionality).</p>
 */
public class EXTVertexAttrib64bit {

    static { GL.initialize(); }

    /** Returned in the {@code type} parameter of GetActiveAttrib. */
    public static final int
        GL_DOUBLE_VEC2_EXT   = 0x8FFC,
        GL_DOUBLE_VEC3_EXT   = 0x8FFD,
        GL_DOUBLE_VEC4_EXT   = 0x8FFE,
        GL_DOUBLE_MAT2_EXT   = 0x8F46,
        GL_DOUBLE_MAT3_EXT   = 0x8F47,
        GL_DOUBLE_MAT4_EXT   = 0x8F48,
        GL_DOUBLE_MAT2x3_EXT = 0x8F49,
        GL_DOUBLE_MAT2x4_EXT = 0x8F4A,
        GL_DOUBLE_MAT3x2_EXT = 0x8F4B,
        GL_DOUBLE_MAT3x4_EXT = 0x8F4C,
        GL_DOUBLE_MAT4x2_EXT = 0x8F4D,
        GL_DOUBLE_MAT4x3_EXT = 0x8F4E;

    protected EXTVertexAttrib64bit() {
        throw new UnsupportedOperationException();
    }

    // --- [ glVertexAttribL1dEXT ] ---

    public static native void glVertexAttribL1dEXT(@NativeType("GLuint") int index, @NativeType("GLdouble") double x);

    // --- [ glVertexAttribL2dEXT ] ---

    public static native void glVertexAttribL2dEXT(@NativeType("GLuint") int index, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y);

    // --- [ glVertexAttribL3dEXT ] ---

    public static native void glVertexAttribL3dEXT(@NativeType("GLuint") int index, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z);

    // --- [ glVertexAttribL4dEXT ] ---

    public static native void glVertexAttribL4dEXT(@NativeType("GLuint") int index, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z, @NativeType("GLdouble") double w);

    // --- [ glVertexAttribL1dvEXT ] ---

    public static native void nglVertexAttribL1dvEXT(int index, long v);

    public static void glVertexAttribL1dvEXT(@NativeType("GLuint") int index, @NativeType("GLdouble const *") DoubleBuffer v) {
        if (CHECKS) {
            check(v, 1);
        }
        nglVertexAttribL1dvEXT(index, memAddress(v));
    }

    // --- [ glVertexAttribL2dvEXT ] ---

    public static native void nglVertexAttribL2dvEXT(int index, long v);

    public static void glVertexAttribL2dvEXT(@NativeType("GLuint") int index, @NativeType("GLdouble const *") DoubleBuffer v) {
        if (CHECKS) {
            check(v, 2);
        }
        nglVertexAttribL2dvEXT(index, memAddress(v));
    }

    // --- [ glVertexAttribL3dvEXT ] ---

    public static native void nglVertexAttribL3dvEXT(int index, long v);

    public static void glVertexAttribL3dvEXT(@NativeType("GLuint") int index, @NativeType("GLdouble const *") DoubleBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglVertexAttribL3dvEXT(index, memAddress(v));
    }

    // --- [ glVertexAttribL4dvEXT ] ---

    public static native void nglVertexAttribL4dvEXT(int index, long v);

    public static void glVertexAttribL4dvEXT(@NativeType("GLuint") int index, @NativeType("GLdouble const *") DoubleBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttribL4dvEXT(index, memAddress(v));
    }

    // --- [ glVertexAttribLPointerEXT ] ---

    public static native void nglVertexAttribLPointerEXT(int index, int size, int type, int stride, long pointer);

    public static void glVertexAttribLPointerEXT(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ByteBuffer pointer) {
        nglVertexAttribLPointerEXT(index, size, type, stride, memAddress(pointer));
    }

    public static void glVertexAttribLPointerEXT(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") long pointer) {
        nglVertexAttribLPointerEXT(index, size, type, stride, pointer);
    }

    public static void glVertexAttribLPointerEXT(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLsizei") int stride, @NativeType("void const *") DoubleBuffer pointer) {
        nglVertexAttribLPointerEXT(index, size, GL11.GL_DOUBLE, stride, memAddress(pointer));
    }

    // --- [ glGetVertexAttribLdvEXT ] ---

    public static native void nglGetVertexAttribLdvEXT(int index, int pname, long params);

    public static void glGetVertexAttribLdvEXT(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLdouble *") DoubleBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglGetVertexAttribLdvEXT(index, pname, memAddress(params));
    }

    // --- [ glVertexArrayVertexAttribLOffsetEXT ] ---

    /**
     * DSA version of {@link ARBVertexAttrib64Bit#glVertexAttribLPointer VertexAttribLPointer}.
     *
     * @param vaobj  the vertex array object
     * @param buffer the buffer object
     * @param index  the index of the generic vertex attribute to be modified
     * @param size   the number of values per vertex that are stored in the array. The initial value is 4. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>
     * @param type   the data type of each component in the array. Must be:<br><table><tr><td>{@link GL11#GL_DOUBLE DOUBLE}</td></tr></table>
     * @param stride the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in
     *               the array. The initial value is 0.
     * @param offset the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer. The initial value is 0.
     */
    public static void glVertexArrayVertexAttribLOffsetEXT(@NativeType("GLuint") int vaobj, @NativeType("GLuint") int buffer, @NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("GLintptr") long offset) {
        ARBVertexAttrib64Bit.glVertexArrayVertexAttribLOffsetEXT(vaobj, buffer, index, size, type, stride, offset);
    }

    /** Array version of: {@link #glVertexAttribL1dvEXT VertexAttribL1dvEXT} */
    public static void glVertexAttribL1dvEXT(@NativeType("GLuint") int index, @NativeType("GLdouble const *") double[] v) {
        long __functionAddress = GL.getICD().glVertexAttribL1dvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 1);
        }
        callPV(index, v, __functionAddress);
    }

    /** Array version of: {@link #glVertexAttribL2dvEXT VertexAttribL2dvEXT} */
    public static void glVertexAttribL2dvEXT(@NativeType("GLuint") int index, @NativeType("GLdouble const *") double[] v) {
        long __functionAddress = GL.getICD().glVertexAttribL2dvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 2);
        }
        callPV(index, v, __functionAddress);
    }

    /** Array version of: {@link #glVertexAttribL3dvEXT VertexAttribL3dvEXT} */
    public static void glVertexAttribL3dvEXT(@NativeType("GLuint") int index, @NativeType("GLdouble const *") double[] v) {
        long __functionAddress = GL.getICD().glVertexAttribL3dvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(index, v, __functionAddress);
    }

    /** Array version of: {@link #glVertexAttribL4dvEXT VertexAttribL4dvEXT} */
    public static void glVertexAttribL4dvEXT(@NativeType("GLuint") int index, @NativeType("GLdouble const *") double[] v) {
        long __functionAddress = GL.getICD().glVertexAttribL4dvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(index, v, __functionAddress);
    }

    /** Array version of: {@link #glGetVertexAttribLdvEXT GetVertexAttribLdvEXT} */
    public static void glGetVertexAttribLdvEXT(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLdouble *") double[] params) {
        long __functionAddress = GL.getICD().glGetVertexAttribLdvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(index, pname, params, __functionAddress);
    }

}
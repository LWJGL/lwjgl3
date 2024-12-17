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

public class EXTGPUShader4 {

    static { GL.initialize(); }

    public static final int GL_VERTEX_ATTRIB_ARRAY_INTEGER_EXT = 0x88FD;

    public static final int
        GL_SAMPLER_1D_ARRAY_EXT              = 0x8DC0,
        GL_SAMPLER_2D_ARRAY_EXT              = 0x8DC1,
        GL_SAMPLER_BUFFER_EXT                = 0x8DC2,
        GL_SAMPLER_1D_ARRAY_SHADOW_EXT       = 0x8DC3,
        GL_SAMPLER_2D_ARRAY_SHADOW_EXT       = 0x8DC4,
        GL_SAMPLER_CUBE_SHADOW_EXT           = 0x8DC5,
        GL_UNSIGNED_INT_VEC2_EXT             = 0x8DC6,
        GL_UNSIGNED_INT_VEC3_EXT             = 0x8DC7,
        GL_UNSIGNED_INT_VEC4_EXT             = 0x8DC8,
        GL_INT_SAMPLER_1D_EXT                = 0x8DC9,
        GL_INT_SAMPLER_2D_EXT                = 0x8DCA,
        GL_INT_SAMPLER_3D_EXT                = 0x8DCB,
        GL_INT_SAMPLER_CUBE_EXT              = 0x8DCC,
        GL_INT_SAMPLER_2D_RECT_EXT           = 0x8DCD,
        GL_INT_SAMPLER_1D_ARRAY_EXT          = 0x8DCE,
        GL_INT_SAMPLER_2D_ARRAY_EXT          = 0x8DCF,
        GL_INT_SAMPLER_BUFFER_EXT            = 0x8DD0,
        GL_UNSIGNED_INT_SAMPLER_1D_EXT       = 0x8DD1,
        GL_UNSIGNED_INT_SAMPLER_2D_EXT       = 0x8DD2,
        GL_UNSIGNED_INT_SAMPLER_3D_EXT       = 0x8DD3,
        GL_UNSIGNED_INT_SAMPLER_CUBE_EXT     = 0x8DD4,
        GL_UNSIGNED_INT_SAMPLER_2D_RECT_EXT  = 0x8DD5,
        GL_UNSIGNED_INT_SAMPLER_1D_ARRAY_EXT = 0x8DD6,
        GL_UNSIGNED_INT_SAMPLER_2D_ARRAY_EXT = 0x8DD7,
        GL_UNSIGNED_INT_SAMPLER_BUFFER_EXT   = 0x8DD8;

    public static final int
        GL_MIN_PROGRAM_TEXEL_OFFSET_EXT = 0x8904,
        GL_MAX_PROGRAM_TEXEL_OFFSET_EXT = 0x8905;

    protected EXTGPUShader4() {
        throw new UnsupportedOperationException();
    }

    // --- [ glVertexAttribI1iEXT ] ---

    /** {@code void glVertexAttribI1iEXT(GLuint index, GLint x)} */
    public static native void glVertexAttribI1iEXT(@NativeType("GLuint") int index, @NativeType("GLint") int x);

    // --- [ glVertexAttribI2iEXT ] ---

    /** {@code void glVertexAttribI2iEXT(GLuint index, GLint x, GLint y)} */
    public static native void glVertexAttribI2iEXT(@NativeType("GLuint") int index, @NativeType("GLint") int x, @NativeType("GLint") int y);

    // --- [ glVertexAttribI3iEXT ] ---

    /** {@code void glVertexAttribI3iEXT(GLuint index, GLint x, GLint y, GLint z)} */
    public static native void glVertexAttribI3iEXT(@NativeType("GLuint") int index, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z);

    // --- [ glVertexAttribI4iEXT ] ---

    /** {@code void glVertexAttribI4iEXT(GLuint index, GLint x, GLint y, GLint z, GLint w)} */
    public static native void glVertexAttribI4iEXT(@NativeType("GLuint") int index, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z, @NativeType("GLint") int w);

    // --- [ glVertexAttribI1uiEXT ] ---

    /** {@code void glVertexAttribI1uiEXT(GLuint index, GLuint x)} */
    public static native void glVertexAttribI1uiEXT(@NativeType("GLuint") int index, @NativeType("GLuint") int x);

    // --- [ glVertexAttribI2uiEXT ] ---

    /** {@code void glVertexAttribI2uiEXT(GLuint index, GLuint x, GLuint y)} */
    public static native void glVertexAttribI2uiEXT(@NativeType("GLuint") int index, @NativeType("GLuint") int x, @NativeType("GLuint") int y);

    // --- [ glVertexAttribI3uiEXT ] ---

    /** {@code void glVertexAttribI3uiEXT(GLuint index, GLint x, GLint y, GLint z)} */
    public static native void glVertexAttribI3uiEXT(@NativeType("GLuint") int index, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z);

    // --- [ glVertexAttribI4uiEXT ] ---

    /** {@code void glVertexAttribI4uiEXT(GLuint index, GLint x, GLint y, GLint z, GLint w)} */
    public static native void glVertexAttribI4uiEXT(@NativeType("GLuint") int index, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z, @NativeType("GLint") int w);

    // --- [ glVertexAttribI1ivEXT ] ---

    /** {@code void glVertexAttribI1ivEXT(GLuint index, GLint const * v)} */
    public static native void nglVertexAttribI1ivEXT(int index, long v);

    /** {@code void glVertexAttribI1ivEXT(GLuint index, GLint const * v)} */
    public static void glVertexAttribI1ivEXT(@NativeType("GLuint") int index, @NativeType("GLint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 1);
        }
        nglVertexAttribI1ivEXT(index, memAddress(v));
    }

    // --- [ glVertexAttribI2ivEXT ] ---

    /** {@code void glVertexAttribI2ivEXT(GLuint index, GLint const * v)} */
    public static native void nglVertexAttribI2ivEXT(int index, long v);

    /** {@code void glVertexAttribI2ivEXT(GLuint index, GLint const * v)} */
    public static void glVertexAttribI2ivEXT(@NativeType("GLuint") int index, @NativeType("GLint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 2);
        }
        nglVertexAttribI2ivEXT(index, memAddress(v));
    }

    // --- [ glVertexAttribI3ivEXT ] ---

    /** {@code void glVertexAttribI3ivEXT(GLuint index, GLint const * v)} */
    public static native void nglVertexAttribI3ivEXT(int index, long v);

    /** {@code void glVertexAttribI3ivEXT(GLuint index, GLint const * v)} */
    public static void glVertexAttribI3ivEXT(@NativeType("GLuint") int index, @NativeType("GLint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglVertexAttribI3ivEXT(index, memAddress(v));
    }

    // --- [ glVertexAttribI4ivEXT ] ---

    /** {@code void glVertexAttribI4ivEXT(GLuint index, GLint const * v)} */
    public static native void nglVertexAttribI4ivEXT(int index, long v);

    /** {@code void glVertexAttribI4ivEXT(GLuint index, GLint const * v)} */
    public static void glVertexAttribI4ivEXT(@NativeType("GLuint") int index, @NativeType("GLint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttribI4ivEXT(index, memAddress(v));
    }

    // --- [ glVertexAttribI1uivEXT ] ---

    /** {@code void glVertexAttribI1uivEXT(GLuint index, GLuint const * v)} */
    public static native void nglVertexAttribI1uivEXT(int index, long v);

    /** {@code void glVertexAttribI1uivEXT(GLuint index, GLuint const * v)} */
    public static void glVertexAttribI1uivEXT(@NativeType("GLuint") int index, @NativeType("GLuint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 1);
        }
        nglVertexAttribI1uivEXT(index, memAddress(v));
    }

    // --- [ glVertexAttribI2uivEXT ] ---

    /** {@code void glVertexAttribI2uivEXT(GLuint index, GLuint const * v)} */
    public static native void nglVertexAttribI2uivEXT(int index, long v);

    /** {@code void glVertexAttribI2uivEXT(GLuint index, GLuint const * v)} */
    public static void glVertexAttribI2uivEXT(@NativeType("GLuint") int index, @NativeType("GLuint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 2);
        }
        nglVertexAttribI2uivEXT(index, memAddress(v));
    }

    // --- [ glVertexAttribI3uivEXT ] ---

    /** {@code void glVertexAttribI3uivEXT(GLuint index, GLuint const * v)} */
    public static native void nglVertexAttribI3uivEXT(int index, long v);

    /** {@code void glVertexAttribI3uivEXT(GLuint index, GLuint const * v)} */
    public static void glVertexAttribI3uivEXT(@NativeType("GLuint") int index, @NativeType("GLuint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglVertexAttribI3uivEXT(index, memAddress(v));
    }

    // --- [ glVertexAttribI4uivEXT ] ---

    /** {@code void glVertexAttribI4uivEXT(GLuint index, GLuint const * v)} */
    public static native void nglVertexAttribI4uivEXT(int index, long v);

    /** {@code void glVertexAttribI4uivEXT(GLuint index, GLuint const * v)} */
    public static void glVertexAttribI4uivEXT(@NativeType("GLuint") int index, @NativeType("GLuint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttribI4uivEXT(index, memAddress(v));
    }

    // --- [ glVertexAttribI4bvEXT ] ---

    /** {@code void glVertexAttribI4bvEXT(GLuint index, GLbyte const * v)} */
    public static native void nglVertexAttribI4bvEXT(int index, long v);

    /** {@code void glVertexAttribI4bvEXT(GLuint index, GLbyte const * v)} */
    public static void glVertexAttribI4bvEXT(@NativeType("GLuint") int index, @NativeType("GLbyte const *") ByteBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttribI4bvEXT(index, memAddress(v));
    }

    // --- [ glVertexAttribI4svEXT ] ---

    /** {@code void glVertexAttribI4svEXT(GLuint index, GLshort const * v)} */
    public static native void nglVertexAttribI4svEXT(int index, long v);

    /** {@code void glVertexAttribI4svEXT(GLuint index, GLshort const * v)} */
    public static void glVertexAttribI4svEXT(@NativeType("GLuint") int index, @NativeType("GLshort const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttribI4svEXT(index, memAddress(v));
    }

    // --- [ glVertexAttribI4ubvEXT ] ---

    /** {@code void glVertexAttribI4ubvEXT(GLuint index, GLbyte const * v)} */
    public static native void nglVertexAttribI4ubvEXT(int index, long v);

    /** {@code void glVertexAttribI4ubvEXT(GLuint index, GLbyte const * v)} */
    public static void glVertexAttribI4ubvEXT(@NativeType("GLuint") int index, @NativeType("GLbyte const *") ByteBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttribI4ubvEXT(index, memAddress(v));
    }

    // --- [ glVertexAttribI4usvEXT ] ---

    /** {@code void glVertexAttribI4usvEXT(GLuint index, GLshort const * v)} */
    public static native void nglVertexAttribI4usvEXT(int index, long v);

    /** {@code void glVertexAttribI4usvEXT(GLuint index, GLshort const * v)} */
    public static void glVertexAttribI4usvEXT(@NativeType("GLuint") int index, @NativeType("GLshort const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttribI4usvEXT(index, memAddress(v));
    }

    // --- [ glVertexAttribIPointerEXT ] ---

    /** {@code void glVertexAttribIPointerEXT(GLuint index, GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static native void nglVertexAttribIPointerEXT(int index, int size, int type, int stride, long pointer);

    /** {@code void glVertexAttribIPointerEXT(GLuint index, GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void glVertexAttribIPointerEXT(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ByteBuffer pointer) {
        nglVertexAttribIPointerEXT(index, size, type, stride, memAddress(pointer));
    }

    /** {@code void glVertexAttribIPointerEXT(GLuint index, GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void glVertexAttribIPointerEXT(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") long pointer) {
        nglVertexAttribIPointerEXT(index, size, type, stride, pointer);
    }

    /** {@code void glVertexAttribIPointerEXT(GLuint index, GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void glVertexAttribIPointerEXT(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ShortBuffer pointer) {
        nglVertexAttribIPointerEXT(index, size, type, stride, memAddress(pointer));
    }

    /** {@code void glVertexAttribIPointerEXT(GLuint index, GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void glVertexAttribIPointerEXT(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") IntBuffer pointer) {
        nglVertexAttribIPointerEXT(index, size, type, stride, memAddress(pointer));
    }

    // --- [ glGetVertexAttribIivEXT ] ---

    /** {@code void glGetVertexAttribIivEXT(GLuint index, GLenum pname, GLint * params)} */
    public static native void nglGetVertexAttribIivEXT(int index, int pname, long params);

    /** {@code void glGetVertexAttribIivEXT(GLuint index, GLenum pname, GLint * params)} */
    public static void glGetVertexAttribIivEXT(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglGetVertexAttribIivEXT(index, pname, memAddress(params));
    }

    /** {@code void glGetVertexAttribIivEXT(GLuint index, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetVertexAttribIiEXT(@NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetVertexAttribIivEXT(index, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetVertexAttribIuivEXT ] ---

    /** {@code void glGetVertexAttribIuivEXT(GLuint index, GLenum pname, GLuint * params)} */
    public static native void nglGetVertexAttribIuivEXT(int index, int pname, long params);

    /** {@code void glGetVertexAttribIuivEXT(GLuint index, GLenum pname, GLuint * params)} */
    public static void glGetVertexAttribIuivEXT(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLuint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglGetVertexAttribIuivEXT(index, pname, memAddress(params));
    }

    /** {@code void glGetVertexAttribIuivEXT(GLuint index, GLenum pname, GLuint * params)} */
    @NativeType("void")
    public static int glGetVertexAttribIuiEXT(@NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetVertexAttribIuivEXT(index, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetUniformuivEXT ] ---

    /** {@code void glGetUniformuivEXT(GLuint program, GLint location, GLuint * params)} */
    public static native void nglGetUniformuivEXT(int program, int location, long params);

    /** {@code void glGetUniformuivEXT(GLuint program, GLint location, GLuint * params)} */
    public static void glGetUniformuivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetUniformuivEXT(program, location, memAddress(params));
    }

    /** {@code void glGetUniformuivEXT(GLuint program, GLint location, GLuint * params)} */
    @NativeType("void")
    public static int glGetUniformuiEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetUniformuivEXT(program, location, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glBindFragDataLocationEXT ] ---

    /** {@code void glBindFragDataLocationEXT(GLuint program, GLuint color, GLchar const * name)} */
    public static native void nglBindFragDataLocationEXT(int program, int color, long name);

    /** {@code void glBindFragDataLocationEXT(GLuint program, GLuint color, GLchar const * name)} */
    public static void glBindFragDataLocationEXT(@NativeType("GLuint") int program, @NativeType("GLuint") int color, @NativeType("GLchar const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        nglBindFragDataLocationEXT(program, color, memAddress(name));
    }

    /** {@code void glBindFragDataLocationEXT(GLuint program, GLuint color, GLchar const * name)} */
    public static void glBindFragDataLocationEXT(@NativeType("GLuint") int program, @NativeType("GLuint") int color, @NativeType("GLchar const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            nglBindFragDataLocationEXT(program, color, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetFragDataLocationEXT ] ---

    /** {@code GLint glGetFragDataLocationEXT(GLuint program, GLchar const * name)} */
    public static native int nglGetFragDataLocationEXT(int program, long name);

    /** {@code GLint glGetFragDataLocationEXT(GLuint program, GLchar const * name)} */
    @NativeType("GLint")
    public static int glGetFragDataLocationEXT(@NativeType("GLuint") int program, @NativeType("GLchar const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nglGetFragDataLocationEXT(program, memAddress(name));
    }

    /** {@code GLint glGetFragDataLocationEXT(GLuint program, GLchar const * name)} */
    @NativeType("GLint")
    public static int glGetFragDataLocationEXT(@NativeType("GLuint") int program, @NativeType("GLchar const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nglGetFragDataLocationEXT(program, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glUniform1uiEXT ] ---

    /** {@code void glUniform1uiEXT(GLint location, GLuint v0)} */
    public static native void glUniform1uiEXT(@NativeType("GLint") int location, @NativeType("GLuint") int v0);

    // --- [ glUniform2uiEXT ] ---

    /** {@code void glUniform2uiEXT(GLint location, GLuint v0, GLuint v1)} */
    public static native void glUniform2uiEXT(@NativeType("GLint") int location, @NativeType("GLuint") int v0, @NativeType("GLuint") int v1);

    // --- [ glUniform3uiEXT ] ---

    /** {@code void glUniform3uiEXT(GLint location, GLuint v0, GLuint v1, GLuint v2)} */
    public static native void glUniform3uiEXT(@NativeType("GLint") int location, @NativeType("GLuint") int v0, @NativeType("GLuint") int v1, @NativeType("GLuint") int v2);

    // --- [ glUniform4uiEXT ] ---

    /** {@code void glUniform4uiEXT(GLint location, GLuint v0, GLuint v1, GLuint v2, GLuint v3)} */
    public static native void glUniform4uiEXT(@NativeType("GLint") int location, @NativeType("GLuint") int v0, @NativeType("GLuint") int v1, @NativeType("GLuint") int v2, @NativeType("GLuint") int v3);

    // --- [ glUniform1uivEXT ] ---

    /** {@code void glUniform1uivEXT(GLint location, GLsizei count, GLuint const * value)} */
    public static native void nglUniform1uivEXT(int location, int count, long value);

    /** {@code void glUniform1uivEXT(GLint location, GLsizei count, GLuint const * value)} */
    public static void glUniform1uivEXT(@NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        nglUniform1uivEXT(location, value.remaining(), memAddress(value));
    }

    // --- [ glUniform2uivEXT ] ---

    /** {@code void glUniform2uivEXT(GLint location, GLsizei count, GLuint const * value)} */
    public static native void nglUniform2uivEXT(int location, int count, long value);

    /** {@code void glUniform2uivEXT(GLint location, GLsizei count, GLuint const * value)} */
    public static void glUniform2uivEXT(@NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        nglUniform2uivEXT(location, value.remaining() >> 1, memAddress(value));
    }

    // --- [ glUniform3uivEXT ] ---

    /** {@code void glUniform3uivEXT(GLint location, GLsizei count, GLuint const * value)} */
    public static native void nglUniform3uivEXT(int location, int count, long value);

    /** {@code void glUniform3uivEXT(GLint location, GLsizei count, GLuint const * value)} */
    public static void glUniform3uivEXT(@NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        nglUniform3uivEXT(location, value.remaining() / 3, memAddress(value));
    }

    // --- [ glUniform4uivEXT ] ---

    /** {@code void glUniform4uivEXT(GLint location, GLsizei count, GLuint const * value)} */
    public static native void nglUniform4uivEXT(int location, int count, long value);

    /** {@code void glUniform4uivEXT(GLint location, GLsizei count, GLuint const * value)} */
    public static void glUniform4uivEXT(@NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        nglUniform4uivEXT(location, value.remaining() >> 2, memAddress(value));
    }

    /** {@code void glVertexAttribI1ivEXT(GLuint index, GLint const * v)} */
    public static void glVertexAttribI1ivEXT(@NativeType("GLuint") int index, @NativeType("GLint const *") int[] v) {
        long __functionAddress = GL.getICD().glVertexAttribI1ivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 1);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttribI2ivEXT(GLuint index, GLint const * v)} */
    public static void glVertexAttribI2ivEXT(@NativeType("GLuint") int index, @NativeType("GLint const *") int[] v) {
        long __functionAddress = GL.getICD().glVertexAttribI2ivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 2);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttribI3ivEXT(GLuint index, GLint const * v)} */
    public static void glVertexAttribI3ivEXT(@NativeType("GLuint") int index, @NativeType("GLint const *") int[] v) {
        long __functionAddress = GL.getICD().glVertexAttribI3ivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttribI4ivEXT(GLuint index, GLint const * v)} */
    public static void glVertexAttribI4ivEXT(@NativeType("GLuint") int index, @NativeType("GLint const *") int[] v) {
        long __functionAddress = GL.getICD().glVertexAttribI4ivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttribI1uivEXT(GLuint index, GLuint const * v)} */
    public static void glVertexAttribI1uivEXT(@NativeType("GLuint") int index, @NativeType("GLuint const *") int[] v) {
        long __functionAddress = GL.getICD().glVertexAttribI1uivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 1);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttribI2uivEXT(GLuint index, GLuint const * v)} */
    public static void glVertexAttribI2uivEXT(@NativeType("GLuint") int index, @NativeType("GLuint const *") int[] v) {
        long __functionAddress = GL.getICD().glVertexAttribI2uivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 2);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttribI3uivEXT(GLuint index, GLuint const * v)} */
    public static void glVertexAttribI3uivEXT(@NativeType("GLuint") int index, @NativeType("GLuint const *") int[] v) {
        long __functionAddress = GL.getICD().glVertexAttribI3uivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttribI4uivEXT(GLuint index, GLuint const * v)} */
    public static void glVertexAttribI4uivEXT(@NativeType("GLuint") int index, @NativeType("GLuint const *") int[] v) {
        long __functionAddress = GL.getICD().glVertexAttribI4uivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttribI4svEXT(GLuint index, GLshort const * v)} */
    public static void glVertexAttribI4svEXT(@NativeType("GLuint") int index, @NativeType("GLshort const *") short[] v) {
        long __functionAddress = GL.getICD().glVertexAttribI4svEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttribI4usvEXT(GLuint index, GLshort const * v)} */
    public static void glVertexAttribI4usvEXT(@NativeType("GLuint") int index, @NativeType("GLshort const *") short[] v) {
        long __functionAddress = GL.getICD().glVertexAttribI4usvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttribIPointerEXT(GLuint index, GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void glVertexAttribIPointerEXT(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") short[] pointer) {
        long __functionAddress = GL.getICD().glVertexAttribIPointerEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, size, type, stride, pointer, __functionAddress);
    }

    /** {@code void glVertexAttribIPointerEXT(GLuint index, GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void glVertexAttribIPointerEXT(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") int[] pointer) {
        long __functionAddress = GL.getICD().glVertexAttribIPointerEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, size, type, stride, pointer, __functionAddress);
    }

    /** {@code void glGetVertexAttribIivEXT(GLuint index, GLenum pname, GLint * params)} */
    public static void glGetVertexAttribIivEXT(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetVertexAttribIivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(index, pname, params, __functionAddress);
    }

    /** {@code void glGetVertexAttribIuivEXT(GLuint index, GLenum pname, GLuint * params)} */
    public static void glGetVertexAttribIuivEXT(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] params) {
        long __functionAddress = GL.getICD().glGetVertexAttribIuivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(index, pname, params, __functionAddress);
    }

    /** {@code void glGetUniformuivEXT(GLuint program, GLint location, GLuint * params)} */
    public static void glGetUniformuivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint *") int[] params) {
        long __functionAddress = GL.getICD().glGetUniformuivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(program, location, params, __functionAddress);
    }

    /** {@code void glUniform1uivEXT(GLint location, GLsizei count, GLuint const * value)} */
    public static void glUniform1uivEXT(@NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GL.getICD().glUniform1uivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length, value, __functionAddress);
    }

    /** {@code void glUniform2uivEXT(GLint location, GLsizei count, GLuint const * value)} */
    public static void glUniform2uivEXT(@NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GL.getICD().glUniform2uivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length >> 1, value, __functionAddress);
    }

    /** {@code void glUniform3uivEXT(GLint location, GLsizei count, GLuint const * value)} */
    public static void glUniform3uivEXT(@NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GL.getICD().glUniform3uivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length / 3, value, __functionAddress);
    }

    /** {@code void glUniform4uivEXT(GLint location, GLsizei count, GLuint const * value)} */
    public static void glUniform4uivEXT(@NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GL.getICD().glUniform4uivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length >> 2, value, __functionAddress);
    }

}
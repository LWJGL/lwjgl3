/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class ARBVertexShader {

    static { GL.initialize(); }

    public static final int GL_VERTEX_SHADER_ARB = 0x8B31;

    public static final int
        GL_MAX_VERTEX_UNIFORM_COMPONENTS_ARB    = 0x8B4A,
        GL_MAX_VARYING_FLOATS_ARB               = 0x8B4B,
        GL_MAX_VERTEX_ATTRIBS_ARB               = 0x8869,
        GL_MAX_TEXTURE_IMAGE_UNITS_ARB          = 0x8872,
        GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS_ARB   = 0x8B4C,
        GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS_ARB = 0x8B4D,
        GL_MAX_TEXTURE_COORDS_ARB               = 0x8871;

    public static final int
        GL_VERTEX_PROGRAM_POINT_SIZE_ARB = 0x8642,
        GL_VERTEX_PROGRAM_TWO_SIDE_ARB   = 0x8643;

    public static final int
        GL_OBJECT_ACTIVE_ATTRIBUTES_ARB           = 0x8B89,
        GL_OBJECT_ACTIVE_ATTRIBUTE_MAX_LENGTH_ARB = 0x8B8A;

    public static final int
        GL_VERTEX_ATTRIB_ARRAY_ENABLED_ARB    = 0x8622,
        GL_VERTEX_ATTRIB_ARRAY_SIZE_ARB       = 0x8623,
        GL_VERTEX_ATTRIB_ARRAY_STRIDE_ARB     = 0x8624,
        GL_VERTEX_ATTRIB_ARRAY_TYPE_ARB       = 0x8625,
        GL_VERTEX_ATTRIB_ARRAY_NORMALIZED_ARB = 0x886A,
        GL_CURRENT_VERTEX_ATTRIB_ARB          = 0x8626;

    public static final int GL_VERTEX_ATTRIB_ARRAY_POINTER_ARB = 0x8645;

    public static final int
        GL_FLOAT_VEC2_ARB = 0x8B50,
        GL_FLOAT_VEC3_ARB = 0x8B51,
        GL_FLOAT_VEC4_ARB = 0x8B52,
        GL_FLOAT_MAT2_ARB = 0x8B5A,
        GL_FLOAT_MAT3_ARB = 0x8B5B,
        GL_FLOAT_MAT4_ARB = 0x8B5C;

    protected ARBVertexShader() {
        throw new UnsupportedOperationException();
    }

    // --- [ glVertexAttrib1fARB ] ---

    /** {@code void glVertexAttrib1fARB(GLuint index, GLfloat v0)} */
    public static native void glVertexAttrib1fARB(@NativeType("GLuint") int index, @NativeType("GLfloat") float v0);

    // --- [ glVertexAttrib1sARB ] ---

    /** {@code void glVertexAttrib1sARB(GLuint index, GLshort v0)} */
    public static native void glVertexAttrib1sARB(@NativeType("GLuint") int index, @NativeType("GLshort") short v0);

    // --- [ glVertexAttrib1dARB ] ---

    /** {@code void glVertexAttrib1dARB(GLuint index, GLdouble v0)} */
    public static native void glVertexAttrib1dARB(@NativeType("GLuint") int index, @NativeType("GLdouble") double v0);

    // --- [ glVertexAttrib2fARB ] ---

    /** {@code void glVertexAttrib2fARB(GLuint index, GLfloat v0, GLfloat v1)} */
    public static native void glVertexAttrib2fARB(@NativeType("GLuint") int index, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1);

    // --- [ glVertexAttrib2sARB ] ---

    /** {@code void glVertexAttrib2sARB(GLuint index, GLshort v0, GLshort v1)} */
    public static native void glVertexAttrib2sARB(@NativeType("GLuint") int index, @NativeType("GLshort") short v0, @NativeType("GLshort") short v1);

    // --- [ glVertexAttrib2dARB ] ---

    /** {@code void glVertexAttrib2dARB(GLuint index, GLdouble v0, GLdouble v1)} */
    public static native void glVertexAttrib2dARB(@NativeType("GLuint") int index, @NativeType("GLdouble") double v0, @NativeType("GLdouble") double v1);

    // --- [ glVertexAttrib3fARB ] ---

    /** {@code void glVertexAttrib3fARB(GLuint index, GLfloat v0, GLfloat v1, GLfloat v2)} */
    public static native void glVertexAttrib3fARB(@NativeType("GLuint") int index, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2);

    // --- [ glVertexAttrib3sARB ] ---

    /** {@code void glVertexAttrib3sARB(GLuint index, GLshort v0, GLshort v1, GLshort v2)} */
    public static native void glVertexAttrib3sARB(@NativeType("GLuint") int index, @NativeType("GLshort") short v0, @NativeType("GLshort") short v1, @NativeType("GLshort") short v2);

    // --- [ glVertexAttrib3dARB ] ---

    /** {@code void glVertexAttrib3dARB(GLuint index, GLdouble v0, GLdouble v1, GLdouble v2)} */
    public static native void glVertexAttrib3dARB(@NativeType("GLuint") int index, @NativeType("GLdouble") double v0, @NativeType("GLdouble") double v1, @NativeType("GLdouble") double v2);

    // --- [ glVertexAttrib4fARB ] ---

    /** {@code void glVertexAttrib4fARB(GLuint index, GLfloat v0, GLfloat v1, GLfloat v2, GLfloat v3)} */
    public static native void glVertexAttrib4fARB(@NativeType("GLuint") int index, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2, @NativeType("GLfloat") float v3);

    // --- [ glVertexAttrib4sARB ] ---

    /** {@code void glVertexAttrib4sARB(GLuint index, GLshort v0, GLshort v1, GLshort v2, GLshort v3)} */
    public static native void glVertexAttrib4sARB(@NativeType("GLuint") int index, @NativeType("GLshort") short v0, @NativeType("GLshort") short v1, @NativeType("GLshort") short v2, @NativeType("GLshort") short v3);

    // --- [ glVertexAttrib4dARB ] ---

    /** {@code void glVertexAttrib4dARB(GLuint index, GLdouble v0, GLdouble v1, GLdouble v2, GLdouble v3)} */
    public static native void glVertexAttrib4dARB(@NativeType("GLuint") int index, @NativeType("GLdouble") double v0, @NativeType("GLdouble") double v1, @NativeType("GLdouble") double v2, @NativeType("GLdouble") double v3);

    // --- [ glVertexAttrib4NubARB ] ---

    /** {@code void glVertexAttrib4NubARB(GLuint index, GLubyte x, GLubyte y, GLubyte z, GLubyte w)} */
    public static native void glVertexAttrib4NubARB(@NativeType("GLuint") int index, @NativeType("GLubyte") byte x, @NativeType("GLubyte") byte y, @NativeType("GLubyte") byte z, @NativeType("GLubyte") byte w);

    // --- [ glVertexAttrib1fvARB ] ---

    /** {@code void glVertexAttrib1fvARB(GLuint index, GLfloat const * v)} */
    public static native void nglVertexAttrib1fvARB(int index, long v);

    /** {@code void glVertexAttrib1fvARB(GLuint index, GLfloat const * v)} */
    public static void glVertexAttrib1fvARB(@NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer v) {
        if (CHECKS) {
            check(v, 1);
        }
        nglVertexAttrib1fvARB(index, memAddress(v));
    }

    // --- [ glVertexAttrib1svARB ] ---

    /** {@code void glVertexAttrib1svARB(GLuint index, GLshort const * v)} */
    public static native void nglVertexAttrib1svARB(int index, long v);

    /** {@code void glVertexAttrib1svARB(GLuint index, GLshort const * v)} */
    public static void glVertexAttrib1svARB(@NativeType("GLuint") int index, @NativeType("GLshort const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 1);
        }
        nglVertexAttrib1svARB(index, memAddress(v));
    }

    // --- [ glVertexAttrib1dvARB ] ---

    /** {@code void glVertexAttrib1dvARB(GLuint index, GLdouble const * v)} */
    public static native void nglVertexAttrib1dvARB(int index, long v);

    /** {@code void glVertexAttrib1dvARB(GLuint index, GLdouble const * v)} */
    public static void glVertexAttrib1dvARB(@NativeType("GLuint") int index, @NativeType("GLdouble const *") DoubleBuffer v) {
        if (CHECKS) {
            check(v, 1);
        }
        nglVertexAttrib1dvARB(index, memAddress(v));
    }

    // --- [ glVertexAttrib2fvARB ] ---

    /** {@code void glVertexAttrib2fvARB(GLuint index, GLfloat const * v)} */
    public static native void nglVertexAttrib2fvARB(int index, long v);

    /** {@code void glVertexAttrib2fvARB(GLuint index, GLfloat const * v)} */
    public static void glVertexAttrib2fvARB(@NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer v) {
        if (CHECKS) {
            check(v, 2);
        }
        nglVertexAttrib2fvARB(index, memAddress(v));
    }

    // --- [ glVertexAttrib2svARB ] ---

    /** {@code void glVertexAttrib2svARB(GLuint index, GLshort const * v)} */
    public static native void nglVertexAttrib2svARB(int index, long v);

    /** {@code void glVertexAttrib2svARB(GLuint index, GLshort const * v)} */
    public static void glVertexAttrib2svARB(@NativeType("GLuint") int index, @NativeType("GLshort const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 2);
        }
        nglVertexAttrib2svARB(index, memAddress(v));
    }

    // --- [ glVertexAttrib2dvARB ] ---

    /** {@code void glVertexAttrib2dvARB(GLuint index, GLdouble const * v)} */
    public static native void nglVertexAttrib2dvARB(int index, long v);

    /** {@code void glVertexAttrib2dvARB(GLuint index, GLdouble const * v)} */
    public static void glVertexAttrib2dvARB(@NativeType("GLuint") int index, @NativeType("GLdouble const *") DoubleBuffer v) {
        if (CHECKS) {
            check(v, 2);
        }
        nglVertexAttrib2dvARB(index, memAddress(v));
    }

    // --- [ glVertexAttrib3fvARB ] ---

    /** {@code void glVertexAttrib3fvARB(GLuint index, GLfloat const * v)} */
    public static native void nglVertexAttrib3fvARB(int index, long v);

    /** {@code void glVertexAttrib3fvARB(GLuint index, GLfloat const * v)} */
    public static void glVertexAttrib3fvARB(@NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglVertexAttrib3fvARB(index, memAddress(v));
    }

    // --- [ glVertexAttrib3svARB ] ---

    /** {@code void glVertexAttrib3svARB(GLuint index, GLshort const * v)} */
    public static native void nglVertexAttrib3svARB(int index, long v);

    /** {@code void glVertexAttrib3svARB(GLuint index, GLshort const * v)} */
    public static void glVertexAttrib3svARB(@NativeType("GLuint") int index, @NativeType("GLshort const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglVertexAttrib3svARB(index, memAddress(v));
    }

    // --- [ glVertexAttrib3dvARB ] ---

    /** {@code void glVertexAttrib3dvARB(GLuint index, GLdouble const * v)} */
    public static native void nglVertexAttrib3dvARB(int index, long v);

    /** {@code void glVertexAttrib3dvARB(GLuint index, GLdouble const * v)} */
    public static void glVertexAttrib3dvARB(@NativeType("GLuint") int index, @NativeType("GLdouble const *") DoubleBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglVertexAttrib3dvARB(index, memAddress(v));
    }

    // --- [ glVertexAttrib4fvARB ] ---

    /** {@code void glVertexAttrib4fvARB(GLuint index, GLfloat const * v)} */
    public static native void nglVertexAttrib4fvARB(int index, long v);

    /** {@code void glVertexAttrib4fvARB(GLuint index, GLfloat const * v)} */
    public static void glVertexAttrib4fvARB(@NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttrib4fvARB(index, memAddress(v));
    }

    // --- [ glVertexAttrib4svARB ] ---

    /** {@code void glVertexAttrib4svARB(GLuint index, GLshort const * v)} */
    public static native void nglVertexAttrib4svARB(int index, long v);

    /** {@code void glVertexAttrib4svARB(GLuint index, GLshort const * v)} */
    public static void glVertexAttrib4svARB(@NativeType("GLuint") int index, @NativeType("GLshort const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttrib4svARB(index, memAddress(v));
    }

    // --- [ glVertexAttrib4dvARB ] ---

    /** {@code void glVertexAttrib4dvARB(GLuint index, GLdouble const * v)} */
    public static native void nglVertexAttrib4dvARB(int index, long v);

    /** {@code void glVertexAttrib4dvARB(GLuint index, GLdouble const * v)} */
    public static void glVertexAttrib4dvARB(@NativeType("GLuint") int index, @NativeType("GLdouble const *") DoubleBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttrib4dvARB(index, memAddress(v));
    }

    // --- [ glVertexAttrib4ivARB ] ---

    /** {@code void glVertexAttrib4ivARB(GLuint index, GLint const * v)} */
    public static native void nglVertexAttrib4ivARB(int index, long v);

    /** {@code void glVertexAttrib4ivARB(GLuint index, GLint const * v)} */
    public static void glVertexAttrib4ivARB(@NativeType("GLuint") int index, @NativeType("GLint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttrib4ivARB(index, memAddress(v));
    }

    // --- [ glVertexAttrib4bvARB ] ---

    /** {@code void glVertexAttrib4bvARB(GLuint index, GLbyte const * v)} */
    public static native void nglVertexAttrib4bvARB(int index, long v);

    /** {@code void glVertexAttrib4bvARB(GLuint index, GLbyte const * v)} */
    public static void glVertexAttrib4bvARB(@NativeType("GLuint") int index, @NativeType("GLbyte const *") ByteBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttrib4bvARB(index, memAddress(v));
    }

    // --- [ glVertexAttrib4ubvARB ] ---

    /** {@code void glVertexAttrib4ubvARB(GLuint index, GLubyte const * v)} */
    public static native void nglVertexAttrib4ubvARB(int index, long v);

    /** {@code void glVertexAttrib4ubvARB(GLuint index, GLubyte const * v)} */
    public static void glVertexAttrib4ubvARB(@NativeType("GLuint") int index, @NativeType("GLubyte const *") ByteBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttrib4ubvARB(index, memAddress(v));
    }

    // --- [ glVertexAttrib4usvARB ] ---

    /** {@code void glVertexAttrib4usvARB(GLuint index, GLushort const * v)} */
    public static native void nglVertexAttrib4usvARB(int index, long v);

    /** {@code void glVertexAttrib4usvARB(GLuint index, GLushort const * v)} */
    public static void glVertexAttrib4usvARB(@NativeType("GLuint") int index, @NativeType("GLushort const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttrib4usvARB(index, memAddress(v));
    }

    // --- [ glVertexAttrib4uivARB ] ---

    /** {@code void glVertexAttrib4uivARB(GLuint index, GLuint const * v)} */
    public static native void nglVertexAttrib4uivARB(int index, long v);

    /** {@code void glVertexAttrib4uivARB(GLuint index, GLuint const * v)} */
    public static void glVertexAttrib4uivARB(@NativeType("GLuint") int index, @NativeType("GLuint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttrib4uivARB(index, memAddress(v));
    }

    // --- [ glVertexAttrib4NbvARB ] ---

    /** {@code void glVertexAttrib4NbvARB(GLuint index, GLbyte const * v)} */
    public static native void nglVertexAttrib4NbvARB(int index, long v);

    /** {@code void glVertexAttrib4NbvARB(GLuint index, GLbyte const * v)} */
    public static void glVertexAttrib4NbvARB(@NativeType("GLuint") int index, @NativeType("GLbyte const *") ByteBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttrib4NbvARB(index, memAddress(v));
    }

    // --- [ glVertexAttrib4NsvARB ] ---

    /** {@code void glVertexAttrib4NsvARB(GLuint index, GLshort const * v)} */
    public static native void nglVertexAttrib4NsvARB(int index, long v);

    /** {@code void glVertexAttrib4NsvARB(GLuint index, GLshort const * v)} */
    public static void glVertexAttrib4NsvARB(@NativeType("GLuint") int index, @NativeType("GLshort const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttrib4NsvARB(index, memAddress(v));
    }

    // --- [ glVertexAttrib4NivARB ] ---

    /** {@code void glVertexAttrib4NivARB(GLuint index, GLint const * v)} */
    public static native void nglVertexAttrib4NivARB(int index, long v);

    /** {@code void glVertexAttrib4NivARB(GLuint index, GLint const * v)} */
    public static void glVertexAttrib4NivARB(@NativeType("GLuint") int index, @NativeType("GLint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttrib4NivARB(index, memAddress(v));
    }

    // --- [ glVertexAttrib4NubvARB ] ---

    /** {@code void glVertexAttrib4NubvARB(GLuint index, GLubyte const * v)} */
    public static native void nglVertexAttrib4NubvARB(int index, long v);

    /** {@code void glVertexAttrib4NubvARB(GLuint index, GLubyte const * v)} */
    public static void glVertexAttrib4NubvARB(@NativeType("GLuint") int index, @NativeType("GLubyte const *") ByteBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttrib4NubvARB(index, memAddress(v));
    }

    // --- [ glVertexAttrib4NusvARB ] ---

    /** {@code void glVertexAttrib4NusvARB(GLuint index, GLushort const * v)} */
    public static native void nglVertexAttrib4NusvARB(int index, long v);

    /** {@code void glVertexAttrib4NusvARB(GLuint index, GLushort const * v)} */
    public static void glVertexAttrib4NusvARB(@NativeType("GLuint") int index, @NativeType("GLushort const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttrib4NusvARB(index, memAddress(v));
    }

    // --- [ glVertexAttrib4NuivARB ] ---

    /** {@code void glVertexAttrib4NuivARB(GLuint index, GLuint const * v)} */
    public static native void nglVertexAttrib4NuivARB(int index, long v);

    /** {@code void glVertexAttrib4NuivARB(GLuint index, GLuint const * v)} */
    public static void glVertexAttrib4NuivARB(@NativeType("GLuint") int index, @NativeType("GLuint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttrib4NuivARB(index, memAddress(v));
    }

    // --- [ glVertexAttribPointerARB ] ---

    /** {@code void glVertexAttribPointerARB(GLuint index, GLint size, GLenum type, GLboolean normalized, GLsizei stride, void const * pointer)} */
    public static native void nglVertexAttribPointerARB(int index, int size, int type, boolean normalized, int stride, long pointer);

    /** {@code void glVertexAttribPointerARB(GLuint index, GLint size, GLenum type, GLboolean normalized, GLsizei stride, void const * pointer)} */
    public static void glVertexAttribPointerARB(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLsizei") int stride, @NativeType("void const *") ByteBuffer pointer) {
        nglVertexAttribPointerARB(index, size, type, normalized, stride, memAddress(pointer));
    }

    /** {@code void glVertexAttribPointerARB(GLuint index, GLint size, GLenum type, GLboolean normalized, GLsizei stride, void const * pointer)} */
    public static void glVertexAttribPointerARB(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLsizei") int stride, @NativeType("void const *") long pointer) {
        nglVertexAttribPointerARB(index, size, type, normalized, stride, pointer);
    }

    /** {@code void glVertexAttribPointerARB(GLuint index, GLint size, GLenum type, GLboolean normalized, GLsizei stride, void const * pointer)} */
    public static void glVertexAttribPointerARB(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLsizei") int stride, @NativeType("void const *") ShortBuffer pointer) {
        nglVertexAttribPointerARB(index, size, type, normalized, stride, memAddress(pointer));
    }

    /** {@code void glVertexAttribPointerARB(GLuint index, GLint size, GLenum type, GLboolean normalized, GLsizei stride, void const * pointer)} */
    public static void glVertexAttribPointerARB(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLsizei") int stride, @NativeType("void const *") IntBuffer pointer) {
        nglVertexAttribPointerARB(index, size, type, normalized, stride, memAddress(pointer));
    }

    /** {@code void glVertexAttribPointerARB(GLuint index, GLint size, GLenum type, GLboolean normalized, GLsizei stride, void const * pointer)} */
    public static void glVertexAttribPointerARB(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLsizei") int stride, @NativeType("void const *") FloatBuffer pointer) {
        nglVertexAttribPointerARB(index, size, type, normalized, stride, memAddress(pointer));
    }

    // --- [ glEnableVertexAttribArrayARB ] ---

    /** {@code void glEnableVertexAttribArrayARB(GLuint index)} */
    public static native void glEnableVertexAttribArrayARB(@NativeType("GLuint") int index);

    // --- [ glDisableVertexAttribArrayARB ] ---

    /** {@code void glDisableVertexAttribArrayARB(GLuint index)} */
    public static native void glDisableVertexAttribArrayARB(@NativeType("GLuint") int index);

    // --- [ glBindAttribLocationARB ] ---

    /** {@code void glBindAttribLocationARB(GLhandleARB programObj, GLuint index, GLchar const * name)} */
    public static native void nglBindAttribLocationARB(int programObj, int index, long name);

    /** {@code void glBindAttribLocationARB(GLhandleARB programObj, GLuint index, GLchar const * name)} */
    public static void glBindAttribLocationARB(@NativeType("GLhandleARB") int programObj, @NativeType("GLuint") int index, @NativeType("GLchar const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        nglBindAttribLocationARB(programObj, index, memAddress(name));
    }

    /** {@code void glBindAttribLocationARB(GLhandleARB programObj, GLuint index, GLchar const * name)} */
    public static void glBindAttribLocationARB(@NativeType("GLhandleARB") int programObj, @NativeType("GLuint") int index, @NativeType("GLchar const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            nglBindAttribLocationARB(programObj, index, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetActiveAttribARB ] ---

    /** {@code void glGetActiveAttribARB(GLhandleARB programObj, GLuint index, GLsizei maxLength, GLsizei * length, GLint * size, GLenum * type, GLchar * name)} */
    public static native void nglGetActiveAttribARB(int programObj, int index, int maxLength, long length, long size, long type, long name);

    /** {@code void glGetActiveAttribARB(GLhandleARB programObj, GLuint index, GLsizei maxLength, GLsizei * length, GLint * size, GLenum * type, GLchar * name)} */
    public static void glGetActiveAttribARB(@NativeType("GLhandleARB") int programObj, @NativeType("GLuint") int index, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLint *") IntBuffer size, @NativeType("GLenum *") IntBuffer type, @NativeType("GLchar *") ByteBuffer name) {
        if (CHECKS) {
            checkSafe(length, 1);
            check(size, 1);
            check(type, 1);
        }
        nglGetActiveAttribARB(programObj, index, name.remaining(), memAddressSafe(length), memAddress(size), memAddress(type), memAddress(name));
    }

    /** {@code void glGetActiveAttribARB(GLhandleARB programObj, GLuint index, GLsizei maxLength, GLsizei * length, GLint * size, GLenum * type, GLchar * name)} */
    @NativeType("void")
    public static String glGetActiveAttribARB(@NativeType("GLhandleARB") int programObj, @NativeType("GLuint") int index, @NativeType("GLsizei") int maxLength, @NativeType("GLint *") IntBuffer size, @NativeType("GLenum *") IntBuffer type) {
        if (CHECKS) {
            check(size, 1);
            check(type, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer length = stack.ints(0);
            ByteBuffer name = stack.malloc(maxLength);
            nglGetActiveAttribARB(programObj, index, maxLength, memAddress(length), memAddress(size), memAddress(type), memAddress(name));
            return memASCII(name, length.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glGetActiveAttribARB(GLhandleARB programObj, GLuint index, GLsizei maxLength, GLsizei * length, GLint * size, GLenum * type, GLchar * name)} */
    @NativeType("void")
    public static String glGetActiveAttribARB(@NativeType("GLhandleARB") int programObj, @NativeType("GLuint") int index, @NativeType("GLint *") IntBuffer size, @NativeType("GLenum *") IntBuffer type) {
        return glGetActiveAttribARB(programObj, index, ARBShaderObjects.glGetObjectParameteriARB(programObj, GL_OBJECT_ACTIVE_ATTRIBUTE_MAX_LENGTH_ARB), size, type);
    }

    // --- [ glGetAttribLocationARB ] ---

    /** {@code GLint glGetAttribLocationARB(GLhandleARB programObj, GLchar const * name)} */
    public static native int nglGetAttribLocationARB(int programObj, long name);

    /** {@code GLint glGetAttribLocationARB(GLhandleARB programObj, GLchar const * name)} */
    @NativeType("GLint")
    public static int glGetAttribLocationARB(@NativeType("GLhandleARB") int programObj, @NativeType("GLchar const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nglGetAttribLocationARB(programObj, memAddress(name));
    }

    /** {@code GLint glGetAttribLocationARB(GLhandleARB programObj, GLchar const * name)} */
    @NativeType("GLint")
    public static int glGetAttribLocationARB(@NativeType("GLhandleARB") int programObj, @NativeType("GLchar const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nglGetAttribLocationARB(programObj, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetVertexAttribivARB ] ---

    /** {@code void glGetVertexAttribivARB(GLuint index, GLenum pname, GLint * params)} */
    public static native void nglGetVertexAttribivARB(int index, int pname, long params);

    /** {@code void glGetVertexAttribivARB(GLuint index, GLenum pname, GLint * params)} */
    public static void glGetVertexAttribivARB(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetVertexAttribivARB(index, pname, memAddress(params));
    }

    /** {@code void glGetVertexAttribivARB(GLuint index, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetVertexAttribiARB(@NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetVertexAttribivARB(index, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetVertexAttribfvARB ] ---

    /** {@code void glGetVertexAttribfvARB(GLuint index, GLenum pname, GLfloat * params)} */
    public static native void nglGetVertexAttribfvARB(int index, int pname, long params);

    /** {@code void glGetVertexAttribfvARB(GLuint index, GLenum pname, GLfloat * params)} */
    public static void glGetVertexAttribfvARB(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglGetVertexAttribfvARB(index, pname, memAddress(params));
    }

    // --- [ glGetVertexAttribdvARB ] ---

    /** {@code void glGetVertexAttribdvARB(GLuint index, GLenum pname, GLdouble * params)} */
    public static native void nglGetVertexAttribdvARB(int index, int pname, long params);

    /** {@code void glGetVertexAttribdvARB(GLuint index, GLenum pname, GLdouble * params)} */
    public static void glGetVertexAttribdvARB(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLdouble *") DoubleBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglGetVertexAttribdvARB(index, pname, memAddress(params));
    }

    // --- [ glGetVertexAttribPointervARB ] ---

    /** {@code void glGetVertexAttribPointervARB(GLuint index, GLenum pname, void ** pointer)} */
    public static native void nglGetVertexAttribPointervARB(int index, int pname, long pointer);

    /** {@code void glGetVertexAttribPointervARB(GLuint index, GLenum pname, void ** pointer)} */
    public static void glGetVertexAttribPointervARB(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("void **") PointerBuffer pointer) {
        if (CHECKS) {
            check(pointer, 1);
        }
        nglGetVertexAttribPointervARB(index, pname, memAddress(pointer));
    }

    /** {@code void glGetVertexAttribPointervARB(GLuint index, GLenum pname, void ** pointer)} */
    @NativeType("void")
    public static long glGetVertexAttribPointerARB(@NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer pointer = stack.callocPointer(1);
            nglGetVertexAttribPointervARB(index, pname, memAddress(pointer));
            return pointer.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glVertexAttrib1fvARB(GLuint index, GLfloat const * v)} */
    public static void glVertexAttrib1fvARB(@NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib1fvARB;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 1);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttrib1svARB(GLuint index, GLshort const * v)} */
    public static void glVertexAttrib1svARB(@NativeType("GLuint") int index, @NativeType("GLshort const *") short[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib1svARB;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 1);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttrib1dvARB(GLuint index, GLdouble const * v)} */
    public static void glVertexAttrib1dvARB(@NativeType("GLuint") int index, @NativeType("GLdouble const *") double[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib1dvARB;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 1);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttrib2fvARB(GLuint index, GLfloat const * v)} */
    public static void glVertexAttrib2fvARB(@NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib2fvARB;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 2);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttrib2svARB(GLuint index, GLshort const * v)} */
    public static void glVertexAttrib2svARB(@NativeType("GLuint") int index, @NativeType("GLshort const *") short[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib2svARB;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 2);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttrib2dvARB(GLuint index, GLdouble const * v)} */
    public static void glVertexAttrib2dvARB(@NativeType("GLuint") int index, @NativeType("GLdouble const *") double[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib2dvARB;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 2);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttrib3fvARB(GLuint index, GLfloat const * v)} */
    public static void glVertexAttrib3fvARB(@NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib3fvARB;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttrib3svARB(GLuint index, GLshort const * v)} */
    public static void glVertexAttrib3svARB(@NativeType("GLuint") int index, @NativeType("GLshort const *") short[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib3svARB;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttrib3dvARB(GLuint index, GLdouble const * v)} */
    public static void glVertexAttrib3dvARB(@NativeType("GLuint") int index, @NativeType("GLdouble const *") double[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib3dvARB;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttrib4fvARB(GLuint index, GLfloat const * v)} */
    public static void glVertexAttrib4fvARB(@NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib4fvARB;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttrib4svARB(GLuint index, GLshort const * v)} */
    public static void glVertexAttrib4svARB(@NativeType("GLuint") int index, @NativeType("GLshort const *") short[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib4svARB;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttrib4dvARB(GLuint index, GLdouble const * v)} */
    public static void glVertexAttrib4dvARB(@NativeType("GLuint") int index, @NativeType("GLdouble const *") double[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib4dvARB;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttrib4ivARB(GLuint index, GLint const * v)} */
    public static void glVertexAttrib4ivARB(@NativeType("GLuint") int index, @NativeType("GLint const *") int[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib4ivARB;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttrib4usvARB(GLuint index, GLushort const * v)} */
    public static void glVertexAttrib4usvARB(@NativeType("GLuint") int index, @NativeType("GLushort const *") short[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib4usvARB;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttrib4uivARB(GLuint index, GLuint const * v)} */
    public static void glVertexAttrib4uivARB(@NativeType("GLuint") int index, @NativeType("GLuint const *") int[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib4uivARB;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttrib4NsvARB(GLuint index, GLshort const * v)} */
    public static void glVertexAttrib4NsvARB(@NativeType("GLuint") int index, @NativeType("GLshort const *") short[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib4NsvARB;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttrib4NivARB(GLuint index, GLint const * v)} */
    public static void glVertexAttrib4NivARB(@NativeType("GLuint") int index, @NativeType("GLint const *") int[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib4NivARB;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttrib4NusvARB(GLuint index, GLushort const * v)} */
    public static void glVertexAttrib4NusvARB(@NativeType("GLuint") int index, @NativeType("GLushort const *") short[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib4NusvARB;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttrib4NuivARB(GLuint index, GLuint const * v)} */
    public static void glVertexAttrib4NuivARB(@NativeType("GLuint") int index, @NativeType("GLuint const *") int[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib4NuivARB;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttribPointerARB(GLuint index, GLint size, GLenum type, GLboolean normalized, GLsizei stride, void const * pointer)} */
    public static void glVertexAttribPointerARB(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLsizei") int stride, @NativeType("void const *") short[] pointer) {
        long __functionAddress = GL.getICD().glVertexAttribPointerARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, size, type, normalized, stride, pointer, __functionAddress);
    }

    /** {@code void glVertexAttribPointerARB(GLuint index, GLint size, GLenum type, GLboolean normalized, GLsizei stride, void const * pointer)} */
    public static void glVertexAttribPointerARB(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLsizei") int stride, @NativeType("void const *") int[] pointer) {
        long __functionAddress = GL.getICD().glVertexAttribPointerARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, size, type, normalized, stride, pointer, __functionAddress);
    }

    /** {@code void glVertexAttribPointerARB(GLuint index, GLint size, GLenum type, GLboolean normalized, GLsizei stride, void const * pointer)} */
    public static void glVertexAttribPointerARB(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLsizei") int stride, @NativeType("void const *") float[] pointer) {
        long __functionAddress = GL.getICD().glVertexAttribPointerARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(index, size, type, normalized, stride, pointer, __functionAddress);
    }

    /** {@code void glGetActiveAttribARB(GLhandleARB programObj, GLuint index, GLsizei maxLength, GLsizei * length, GLint * size, GLenum * type, GLchar * name)} */
    public static void glGetActiveAttribARB(@NativeType("GLhandleARB") int programObj, @NativeType("GLuint") int index, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLint *") int[] size, @NativeType("GLenum *") int[] type, @NativeType("GLchar *") ByteBuffer name) {
        long __functionAddress = GL.getICD().glGetActiveAttribARB;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(length, 1);
            check(size, 1);
            check(type, 1);
        }
        callPPPPV(programObj, index, name.remaining(), length, size, type, memAddress(name), __functionAddress);
    }

    /** {@code void glGetVertexAttribivARB(GLuint index, GLenum pname, GLint * params)} */
    public static void glGetVertexAttribivARB(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetVertexAttribivARB;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(index, pname, params, __functionAddress);
    }

    /** {@code void glGetVertexAttribfvARB(GLuint index, GLenum pname, GLfloat * params)} */
    public static void glGetVertexAttribfvARB(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GL.getICD().glGetVertexAttribfvARB;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(index, pname, params, __functionAddress);
    }

    /** {@code void glGetVertexAttribdvARB(GLuint index, GLenum pname, GLdouble * params)} */
    public static void glGetVertexAttribdvARB(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLdouble *") double[] params) {
        long __functionAddress = GL.getICD().glGetVertexAttribdvARB;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(index, pname, params, __functionAddress);
    }

}
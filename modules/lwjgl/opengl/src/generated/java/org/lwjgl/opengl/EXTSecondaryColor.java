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

public class EXTSecondaryColor {

    static { GL.initialize(); }

    public static final int GL_COLOR_SUM_EXT = 0x8458;

    public static final int
        GL_CURRENT_SECONDARY_COLOR_EXT      = 0x8459,
        GL_SECONDARY_COLOR_ARRAY_SIZE_EXT   = 0x845A,
        GL_SECONDARY_COLOR_ARRAY_TYPE_EXT   = 0x845B,
        GL_SECONDARY_COLOR_ARRAY_STRIDE_EXT = 0x845C;

    public static final int GL_SECONDARY_COLOR_ARRAY_POINTER_EXT = 0x845D;

    public static final int GL_SECONDARY_COLOR_ARRAY_EXT = 0x845E;

    protected EXTSecondaryColor() {
        throw new UnsupportedOperationException();
    }

    // --- [ glSecondaryColor3bEXT ] ---

    /** {@code void glSecondaryColor3bEXT(GLbyte red, GLbyte green, GLbyte blue)} */
    public static native void glSecondaryColor3bEXT(@NativeType("GLbyte") byte red, @NativeType("GLbyte") byte green, @NativeType("GLbyte") byte blue);

    // --- [ glSecondaryColor3sEXT ] ---

    /** {@code void glSecondaryColor3sEXT(GLshort red, GLshort green, GLshort blue)} */
    public static native void glSecondaryColor3sEXT(@NativeType("GLshort") short red, @NativeType("GLshort") short green, @NativeType("GLshort") short blue);

    // --- [ glSecondaryColor3iEXT ] ---

    /** {@code void glSecondaryColor3iEXT(GLint red, GLint green, GLint blue)} */
    public static native void glSecondaryColor3iEXT(@NativeType("GLint") int red, @NativeType("GLint") int green, @NativeType("GLint") int blue);

    // --- [ glSecondaryColor3fEXT ] ---

    /** {@code void glSecondaryColor3fEXT(GLfloat red, GLfloat green, GLfloat blue)} */
    public static native void glSecondaryColor3fEXT(@NativeType("GLfloat") float red, @NativeType("GLfloat") float green, @NativeType("GLfloat") float blue);

    // --- [ glSecondaryColor3dEXT ] ---

    /** {@code void glSecondaryColor3dEXT(GLdouble red, GLdouble green, GLdouble blue)} */
    public static native void glSecondaryColor3dEXT(@NativeType("GLdouble") double red, @NativeType("GLdouble") double green, @NativeType("GLdouble") double blue);

    // --- [ glSecondaryColor3ubEXT ] ---

    /** {@code void glSecondaryColor3ubEXT(GLubyte red, GLubyte green, GLubyte blue)} */
    public static native void glSecondaryColor3ubEXT(@NativeType("GLubyte") byte red, @NativeType("GLubyte") byte green, @NativeType("GLubyte") byte blue);

    // --- [ glSecondaryColor3usEXT ] ---

    /** {@code void glSecondaryColor3usEXT(GLushort red, GLushort green, GLushort blue)} */
    public static native void glSecondaryColor3usEXT(@NativeType("GLushort") short red, @NativeType("GLushort") short green, @NativeType("GLushort") short blue);

    // --- [ glSecondaryColor3uiEXT ] ---

    /** {@code void glSecondaryColor3uiEXT(GLint red, GLint green, GLint blue)} */
    public static native void glSecondaryColor3uiEXT(@NativeType("GLint") int red, @NativeType("GLint") int green, @NativeType("GLint") int blue);

    // --- [ glSecondaryColor3bvEXT ] ---

    /** {@code void glSecondaryColor3bvEXT(GLbyte const * v)} */
    public static native void nglSecondaryColor3bvEXT(long v);

    /** {@code void glSecondaryColor3bvEXT(GLbyte const * v)} */
    public static void glSecondaryColor3bvEXT(@NativeType("GLbyte const *") ByteBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglSecondaryColor3bvEXT(memAddress(v));
    }

    // --- [ glSecondaryColor3svEXT ] ---

    /** {@code void glSecondaryColor3svEXT(GLshort const * v)} */
    public static native void nglSecondaryColor3svEXT(long v);

    /** {@code void glSecondaryColor3svEXT(GLshort const * v)} */
    public static void glSecondaryColor3svEXT(@NativeType("GLshort const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglSecondaryColor3svEXT(memAddress(v));
    }

    // --- [ glSecondaryColor3ivEXT ] ---

    /** {@code void glSecondaryColor3ivEXT(GLint const * v)} */
    public static native void nglSecondaryColor3ivEXT(long v);

    /** {@code void glSecondaryColor3ivEXT(GLint const * v)} */
    public static void glSecondaryColor3ivEXT(@NativeType("GLint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglSecondaryColor3ivEXT(memAddress(v));
    }

    // --- [ glSecondaryColor3fvEXT ] ---

    /** {@code void glSecondaryColor3fvEXT(GLfloat const * v)} */
    public static native void nglSecondaryColor3fvEXT(long v);

    /** {@code void glSecondaryColor3fvEXT(GLfloat const * v)} */
    public static void glSecondaryColor3fvEXT(@NativeType("GLfloat const *") FloatBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglSecondaryColor3fvEXT(memAddress(v));
    }

    // --- [ glSecondaryColor3dvEXT ] ---

    /** {@code void glSecondaryColor3dvEXT(GLdouble const * v)} */
    public static native void nglSecondaryColor3dvEXT(long v);

    /** {@code void glSecondaryColor3dvEXT(GLdouble const * v)} */
    public static void glSecondaryColor3dvEXT(@NativeType("GLdouble const *") DoubleBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglSecondaryColor3dvEXT(memAddress(v));
    }

    // --- [ glSecondaryColor3ubvEXT ] ---

    /** {@code void glSecondaryColor3ubvEXT(GLubyte const * v)} */
    public static native void nglSecondaryColor3ubvEXT(long v);

    /** {@code void glSecondaryColor3ubvEXT(GLubyte const * v)} */
    public static void glSecondaryColor3ubvEXT(@NativeType("GLubyte const *") ByteBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglSecondaryColor3ubvEXT(memAddress(v));
    }

    // --- [ glSecondaryColor3usvEXT ] ---

    /** {@code void glSecondaryColor3usvEXT(GLushort const * v)} */
    public static native void nglSecondaryColor3usvEXT(long v);

    /** {@code void glSecondaryColor3usvEXT(GLushort const * v)} */
    public static void glSecondaryColor3usvEXT(@NativeType("GLushort const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglSecondaryColor3usvEXT(memAddress(v));
    }

    // --- [ glSecondaryColor3uivEXT ] ---

    /** {@code void glSecondaryColor3uivEXT(GLuint const * v)} */
    public static native void nglSecondaryColor3uivEXT(long v);

    /** {@code void glSecondaryColor3uivEXT(GLuint const * v)} */
    public static void glSecondaryColor3uivEXT(@NativeType("GLuint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglSecondaryColor3uivEXT(memAddress(v));
    }

    // --- [ glSecondaryColorPointerEXT ] ---

    /** {@code void glSecondaryColorPointerEXT(GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static native void nglSecondaryColorPointerEXT(int size, int type, int stride, long pointer);

    /** {@code void glSecondaryColorPointerEXT(GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void glSecondaryColorPointerEXT(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ByteBuffer pointer) {
        nglSecondaryColorPointerEXT(size, type, stride, memAddress(pointer));
    }

    /** {@code void glSecondaryColorPointerEXT(GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void glSecondaryColorPointerEXT(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") long pointer) {
        nglSecondaryColorPointerEXT(size, type, stride, pointer);
    }

    /** {@code void glSecondaryColorPointerEXT(GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void glSecondaryColorPointerEXT(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ShortBuffer pointer) {
        nglSecondaryColorPointerEXT(size, type, stride, memAddress(pointer));
    }

    /** {@code void glSecondaryColorPointerEXT(GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void glSecondaryColorPointerEXT(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") IntBuffer pointer) {
        nglSecondaryColorPointerEXT(size, type, stride, memAddress(pointer));
    }

    /** {@code void glSecondaryColorPointerEXT(GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void glSecondaryColorPointerEXT(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") FloatBuffer pointer) {
        nglSecondaryColorPointerEXT(size, type, stride, memAddress(pointer));
    }

    /** {@code void glSecondaryColor3svEXT(GLshort const * v)} */
    public static void glSecondaryColor3svEXT(@NativeType("GLshort const *") short[] v) {
        long __functionAddress = GL.getICD().glSecondaryColor3svEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(v, __functionAddress);
    }

    /** {@code void glSecondaryColor3ivEXT(GLint const * v)} */
    public static void glSecondaryColor3ivEXT(@NativeType("GLint const *") int[] v) {
        long __functionAddress = GL.getICD().glSecondaryColor3ivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(v, __functionAddress);
    }

    /** {@code void glSecondaryColor3fvEXT(GLfloat const * v)} */
    public static void glSecondaryColor3fvEXT(@NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GL.getICD().glSecondaryColor3fvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(v, __functionAddress);
    }

    /** {@code void glSecondaryColor3dvEXT(GLdouble const * v)} */
    public static void glSecondaryColor3dvEXT(@NativeType("GLdouble const *") double[] v) {
        long __functionAddress = GL.getICD().glSecondaryColor3dvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(v, __functionAddress);
    }

    /** {@code void glSecondaryColor3usvEXT(GLushort const * v)} */
    public static void glSecondaryColor3usvEXT(@NativeType("GLushort const *") short[] v) {
        long __functionAddress = GL.getICD().glSecondaryColor3usvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(v, __functionAddress);
    }

    /** {@code void glSecondaryColor3uivEXT(GLuint const * v)} */
    public static void glSecondaryColor3uivEXT(@NativeType("GLuint const *") int[] v) {
        long __functionAddress = GL.getICD().glSecondaryColor3uivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(v, __functionAddress);
    }

    /** {@code void glSecondaryColorPointerEXT(GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void glSecondaryColorPointerEXT(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") short[] pointer) {
        long __functionAddress = GL.getICD().glSecondaryColorPointerEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(size, type, stride, pointer, __functionAddress);
    }

    /** {@code void glSecondaryColorPointerEXT(GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void glSecondaryColorPointerEXT(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") int[] pointer) {
        long __functionAddress = GL.getICD().glSecondaryColorPointerEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(size, type, stride, pointer, __functionAddress);
    }

    /** {@code void glSecondaryColorPointerEXT(GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void glSecondaryColorPointerEXT(@NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") float[] pointer) {
        long __functionAddress = GL.getICD().glSecondaryColorPointerEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(size, type, stride, pointer, __functionAddress);
    }

}
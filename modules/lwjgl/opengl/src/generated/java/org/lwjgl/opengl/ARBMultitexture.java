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

public class ARBMultitexture {

    static { GL.initialize(); }

    public static final int
        GL_TEXTURE0_ARB  = 0x84C0,
        GL_TEXTURE1_ARB  = 0x84C1,
        GL_TEXTURE2_ARB  = 0x84C2,
        GL_TEXTURE3_ARB  = 0x84C3,
        GL_TEXTURE4_ARB  = 0x84C4,
        GL_TEXTURE5_ARB  = 0x84C5,
        GL_TEXTURE6_ARB  = 0x84C6,
        GL_TEXTURE7_ARB  = 0x84C7,
        GL_TEXTURE8_ARB  = 0x84C8,
        GL_TEXTURE9_ARB  = 0x84C9,
        GL_TEXTURE10_ARB = 0x84CA,
        GL_TEXTURE11_ARB = 0x84CB,
        GL_TEXTURE12_ARB = 0x84CC,
        GL_TEXTURE13_ARB = 0x84CD,
        GL_TEXTURE14_ARB = 0x84CE,
        GL_TEXTURE15_ARB = 0x84CF,
        GL_TEXTURE16_ARB = 0x84D0,
        GL_TEXTURE17_ARB = 0x84D1,
        GL_TEXTURE18_ARB = 0x84D2,
        GL_TEXTURE19_ARB = 0x84D3,
        GL_TEXTURE20_ARB = 0x84D4,
        GL_TEXTURE21_ARB = 0x84D5,
        GL_TEXTURE22_ARB = 0x84D6,
        GL_TEXTURE23_ARB = 0x84D7,
        GL_TEXTURE24_ARB = 0x84D8,
        GL_TEXTURE25_ARB = 0x84D9,
        GL_TEXTURE26_ARB = 0x84DA,
        GL_TEXTURE27_ARB = 0x84DB,
        GL_TEXTURE28_ARB = 0x84DC,
        GL_TEXTURE29_ARB = 0x84DD,
        GL_TEXTURE30_ARB = 0x84DE,
        GL_TEXTURE31_ARB = 0x84DF;

    public static final int
        GL_ACTIVE_TEXTURE_ARB        = 0x84E0,
        GL_CLIENT_ACTIVE_TEXTURE_ARB = 0x84E1,
        GL_MAX_TEXTURE_UNITS_ARB     = 0x84E2;

    protected ARBMultitexture() {
        throw new UnsupportedOperationException();
    }

    // --- [ glActiveTextureARB ] ---

    /** {@code void glActiveTextureARB(GLenum texture)} */
    public static native void glActiveTextureARB(@NativeType("GLenum") int texture);

    // --- [ glClientActiveTextureARB ] ---

    /** {@code void glClientActiveTextureARB(GLenum texture)} */
    public static native void glClientActiveTextureARB(@NativeType("GLenum") int texture);

    // --- [ glMultiTexCoord1fARB ] ---

    /** {@code void glMultiTexCoord1fARB(GLenum texture, GLfloat s)} */
    public static native void glMultiTexCoord1fARB(@NativeType("GLenum") int texture, @NativeType("GLfloat") float s);

    // --- [ glMultiTexCoord1sARB ] ---

    /** {@code void glMultiTexCoord1sARB(GLenum texture, GLshort s)} */
    public static native void glMultiTexCoord1sARB(@NativeType("GLenum") int texture, @NativeType("GLshort") short s);

    // --- [ glMultiTexCoord1iARB ] ---

    /** {@code void glMultiTexCoord1iARB(GLenum texture, GLint s)} */
    public static native void glMultiTexCoord1iARB(@NativeType("GLenum") int texture, @NativeType("GLint") int s);

    // --- [ glMultiTexCoord1dARB ] ---

    /** {@code void glMultiTexCoord1dARB(GLenum texture, GLdouble s)} */
    public static native void glMultiTexCoord1dARB(@NativeType("GLenum") int texture, @NativeType("GLdouble") double s);

    // --- [ glMultiTexCoord1fvARB ] ---

    /** {@code void glMultiTexCoord1fvARB(GLenum texture, GLfloat const * v)} */
    public static native void nglMultiTexCoord1fvARB(int texture, long v);

    /** {@code void glMultiTexCoord1fvARB(GLenum texture, GLfloat const * v)} */
    public static void glMultiTexCoord1fvARB(@NativeType("GLenum") int texture, @NativeType("GLfloat const *") FloatBuffer v) {
        if (CHECKS) {
            check(v, 1);
        }
        nglMultiTexCoord1fvARB(texture, memAddress(v));
    }

    // --- [ glMultiTexCoord1svARB ] ---

    /** {@code void glMultiTexCoord1svARB(GLenum texture, GLshort const * v)} */
    public static native void nglMultiTexCoord1svARB(int texture, long v);

    /** {@code void glMultiTexCoord1svARB(GLenum texture, GLshort const * v)} */
    public static void glMultiTexCoord1svARB(@NativeType("GLenum") int texture, @NativeType("GLshort const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 1);
        }
        nglMultiTexCoord1svARB(texture, memAddress(v));
    }

    // --- [ glMultiTexCoord1ivARB ] ---

    /** {@code void glMultiTexCoord1ivARB(GLenum texture, GLint const * v)} */
    public static native void nglMultiTexCoord1ivARB(int texture, long v);

    /** {@code void glMultiTexCoord1ivARB(GLenum texture, GLint const * v)} */
    public static void glMultiTexCoord1ivARB(@NativeType("GLenum") int texture, @NativeType("GLint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 1);
        }
        nglMultiTexCoord1ivARB(texture, memAddress(v));
    }

    // --- [ glMultiTexCoord1dvARB ] ---

    /** {@code void glMultiTexCoord1dvARB(GLenum texture, GLdouble const * v)} */
    public static native void nglMultiTexCoord1dvARB(int texture, long v);

    /** {@code void glMultiTexCoord1dvARB(GLenum texture, GLdouble const * v)} */
    public static void glMultiTexCoord1dvARB(@NativeType("GLenum") int texture, @NativeType("GLdouble const *") DoubleBuffer v) {
        if (CHECKS) {
            check(v, 1);
        }
        nglMultiTexCoord1dvARB(texture, memAddress(v));
    }

    // --- [ glMultiTexCoord2fARB ] ---

    /** {@code void glMultiTexCoord2fARB(GLenum texture, GLfloat s, GLfloat t)} */
    public static native void glMultiTexCoord2fARB(@NativeType("GLenum") int texture, @NativeType("GLfloat") float s, @NativeType("GLfloat") float t);

    // --- [ glMultiTexCoord2sARB ] ---

    /** {@code void glMultiTexCoord2sARB(GLenum texture, GLshort s, GLshort t)} */
    public static native void glMultiTexCoord2sARB(@NativeType("GLenum") int texture, @NativeType("GLshort") short s, @NativeType("GLshort") short t);

    // --- [ glMultiTexCoord2iARB ] ---

    /** {@code void glMultiTexCoord2iARB(GLenum texture, GLint s, GLint t)} */
    public static native void glMultiTexCoord2iARB(@NativeType("GLenum") int texture, @NativeType("GLint") int s, @NativeType("GLint") int t);

    // --- [ glMultiTexCoord2dARB ] ---

    /** {@code void glMultiTexCoord2dARB(GLenum texture, GLdouble s, GLdouble t)} */
    public static native void glMultiTexCoord2dARB(@NativeType("GLenum") int texture, @NativeType("GLdouble") double s, @NativeType("GLdouble") double t);

    // --- [ glMultiTexCoord2fvARB ] ---

    /** {@code void glMultiTexCoord2fvARB(GLenum texture, GLfloat const * v)} */
    public static native void nglMultiTexCoord2fvARB(int texture, long v);

    /** {@code void glMultiTexCoord2fvARB(GLenum texture, GLfloat const * v)} */
    public static void glMultiTexCoord2fvARB(@NativeType("GLenum") int texture, @NativeType("GLfloat const *") FloatBuffer v) {
        if (CHECKS) {
            check(v, 2);
        }
        nglMultiTexCoord2fvARB(texture, memAddress(v));
    }

    // --- [ glMultiTexCoord2svARB ] ---

    /** {@code void glMultiTexCoord2svARB(GLenum texture, GLshort const * v)} */
    public static native void nglMultiTexCoord2svARB(int texture, long v);

    /** {@code void glMultiTexCoord2svARB(GLenum texture, GLshort const * v)} */
    public static void glMultiTexCoord2svARB(@NativeType("GLenum") int texture, @NativeType("GLshort const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 2);
        }
        nglMultiTexCoord2svARB(texture, memAddress(v));
    }

    // --- [ glMultiTexCoord2ivARB ] ---

    /** {@code void glMultiTexCoord2ivARB(GLenum texture, GLint const * v)} */
    public static native void nglMultiTexCoord2ivARB(int texture, long v);

    /** {@code void glMultiTexCoord2ivARB(GLenum texture, GLint const * v)} */
    public static void glMultiTexCoord2ivARB(@NativeType("GLenum") int texture, @NativeType("GLint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 2);
        }
        nglMultiTexCoord2ivARB(texture, memAddress(v));
    }

    // --- [ glMultiTexCoord2dvARB ] ---

    /** {@code void glMultiTexCoord2dvARB(GLenum texture, GLdouble const * v)} */
    public static native void nglMultiTexCoord2dvARB(int texture, long v);

    /** {@code void glMultiTexCoord2dvARB(GLenum texture, GLdouble const * v)} */
    public static void glMultiTexCoord2dvARB(@NativeType("GLenum") int texture, @NativeType("GLdouble const *") DoubleBuffer v) {
        if (CHECKS) {
            check(v, 2);
        }
        nglMultiTexCoord2dvARB(texture, memAddress(v));
    }

    // --- [ glMultiTexCoord3fARB ] ---

    /** {@code void glMultiTexCoord3fARB(GLenum texture, GLfloat s, GLfloat t, GLfloat r)} */
    public static native void glMultiTexCoord3fARB(@NativeType("GLenum") int texture, @NativeType("GLfloat") float s, @NativeType("GLfloat") float t, @NativeType("GLfloat") float r);

    // --- [ glMultiTexCoord3sARB ] ---

    /** {@code void glMultiTexCoord3sARB(GLenum texture, GLshort s, GLshort t, GLshort r)} */
    public static native void glMultiTexCoord3sARB(@NativeType("GLenum") int texture, @NativeType("GLshort") short s, @NativeType("GLshort") short t, @NativeType("GLshort") short r);

    // --- [ glMultiTexCoord3iARB ] ---

    /** {@code void glMultiTexCoord3iARB(GLenum texture, GLint s, GLint t, GLint r)} */
    public static native void glMultiTexCoord3iARB(@NativeType("GLenum") int texture, @NativeType("GLint") int s, @NativeType("GLint") int t, @NativeType("GLint") int r);

    // --- [ glMultiTexCoord3dARB ] ---

    /** {@code void glMultiTexCoord3dARB(GLenum texture, GLdouble s, GLdouble t, GLdouble r)} */
    public static native void glMultiTexCoord3dARB(@NativeType("GLenum") int texture, @NativeType("GLdouble") double s, @NativeType("GLdouble") double t, @NativeType("GLdouble") double r);

    // --- [ glMultiTexCoord3fvARB ] ---

    /** {@code void glMultiTexCoord3fvARB(GLenum texture, GLfloat const * v)} */
    public static native void nglMultiTexCoord3fvARB(int texture, long v);

    /** {@code void glMultiTexCoord3fvARB(GLenum texture, GLfloat const * v)} */
    public static void glMultiTexCoord3fvARB(@NativeType("GLenum") int texture, @NativeType("GLfloat const *") FloatBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglMultiTexCoord3fvARB(texture, memAddress(v));
    }

    // --- [ glMultiTexCoord3svARB ] ---

    /** {@code void glMultiTexCoord3svARB(GLenum texture, GLshort const * v)} */
    public static native void nglMultiTexCoord3svARB(int texture, long v);

    /** {@code void glMultiTexCoord3svARB(GLenum texture, GLshort const * v)} */
    public static void glMultiTexCoord3svARB(@NativeType("GLenum") int texture, @NativeType("GLshort const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglMultiTexCoord3svARB(texture, memAddress(v));
    }

    // --- [ glMultiTexCoord3ivARB ] ---

    /** {@code void glMultiTexCoord3ivARB(GLenum texture, GLint const * v)} */
    public static native void nglMultiTexCoord3ivARB(int texture, long v);

    /** {@code void glMultiTexCoord3ivARB(GLenum texture, GLint const * v)} */
    public static void glMultiTexCoord3ivARB(@NativeType("GLenum") int texture, @NativeType("GLint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglMultiTexCoord3ivARB(texture, memAddress(v));
    }

    // --- [ glMultiTexCoord3dvARB ] ---

    /** {@code void glMultiTexCoord3dvARB(GLenum texture, GLdouble const * v)} */
    public static native void nglMultiTexCoord3dvARB(int texture, long v);

    /** {@code void glMultiTexCoord3dvARB(GLenum texture, GLdouble const * v)} */
    public static void glMultiTexCoord3dvARB(@NativeType("GLenum") int texture, @NativeType("GLdouble const *") DoubleBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglMultiTexCoord3dvARB(texture, memAddress(v));
    }

    // --- [ glMultiTexCoord4fARB ] ---

    /** {@code void glMultiTexCoord4fARB(GLenum texture, GLfloat s, GLfloat t, GLfloat r, GLfloat q)} */
    public static native void glMultiTexCoord4fARB(@NativeType("GLenum") int texture, @NativeType("GLfloat") float s, @NativeType("GLfloat") float t, @NativeType("GLfloat") float r, @NativeType("GLfloat") float q);

    // --- [ glMultiTexCoord4sARB ] ---

    /** {@code void glMultiTexCoord4sARB(GLenum texture, GLshort s, GLshort t, GLshort r, GLshort q)} */
    public static native void glMultiTexCoord4sARB(@NativeType("GLenum") int texture, @NativeType("GLshort") short s, @NativeType("GLshort") short t, @NativeType("GLshort") short r, @NativeType("GLshort") short q);

    // --- [ glMultiTexCoord4iARB ] ---

    /** {@code void glMultiTexCoord4iARB(GLenum texture, GLint s, GLint t, GLint r, GLint q)} */
    public static native void glMultiTexCoord4iARB(@NativeType("GLenum") int texture, @NativeType("GLint") int s, @NativeType("GLint") int t, @NativeType("GLint") int r, @NativeType("GLint") int q);

    // --- [ glMultiTexCoord4dARB ] ---

    /** {@code void glMultiTexCoord4dARB(GLenum texture, GLdouble s, GLdouble t, GLdouble r, GLdouble q)} */
    public static native void glMultiTexCoord4dARB(@NativeType("GLenum") int texture, @NativeType("GLdouble") double s, @NativeType("GLdouble") double t, @NativeType("GLdouble") double r, @NativeType("GLdouble") double q);

    // --- [ glMultiTexCoord4fvARB ] ---

    /** {@code void glMultiTexCoord4fvARB(GLenum texture, GLfloat const * v)} */
    public static native void nglMultiTexCoord4fvARB(int texture, long v);

    /** {@code void glMultiTexCoord4fvARB(GLenum texture, GLfloat const * v)} */
    public static void glMultiTexCoord4fvARB(@NativeType("GLenum") int texture, @NativeType("GLfloat const *") FloatBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglMultiTexCoord4fvARB(texture, memAddress(v));
    }

    // --- [ glMultiTexCoord4svARB ] ---

    /** {@code void glMultiTexCoord4svARB(GLenum texture, GLshort const * v)} */
    public static native void nglMultiTexCoord4svARB(int texture, long v);

    /** {@code void glMultiTexCoord4svARB(GLenum texture, GLshort const * v)} */
    public static void glMultiTexCoord4svARB(@NativeType("GLenum") int texture, @NativeType("GLshort const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglMultiTexCoord4svARB(texture, memAddress(v));
    }

    // --- [ glMultiTexCoord4ivARB ] ---

    /** {@code void glMultiTexCoord4ivARB(GLenum texture, GLint const * v)} */
    public static native void nglMultiTexCoord4ivARB(int texture, long v);

    /** {@code void glMultiTexCoord4ivARB(GLenum texture, GLint const * v)} */
    public static void glMultiTexCoord4ivARB(@NativeType("GLenum") int texture, @NativeType("GLint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglMultiTexCoord4ivARB(texture, memAddress(v));
    }

    // --- [ glMultiTexCoord4dvARB ] ---

    /** {@code void glMultiTexCoord4dvARB(GLenum texture, GLdouble const * v)} */
    public static native void nglMultiTexCoord4dvARB(int texture, long v);

    /** {@code void glMultiTexCoord4dvARB(GLenum texture, GLdouble const * v)} */
    public static void glMultiTexCoord4dvARB(@NativeType("GLenum") int texture, @NativeType("GLdouble const *") DoubleBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglMultiTexCoord4dvARB(texture, memAddress(v));
    }

    /** {@code void glMultiTexCoord1fvARB(GLenum texture, GLfloat const * v)} */
    public static void glMultiTexCoord1fvARB(@NativeType("GLenum") int texture, @NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GL.getICD().glMultiTexCoord1fvARB;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 1);
        }
        callPV(texture, v, __functionAddress);
    }

    /** {@code void glMultiTexCoord1svARB(GLenum texture, GLshort const * v)} */
    public static void glMultiTexCoord1svARB(@NativeType("GLenum") int texture, @NativeType("GLshort const *") short[] v) {
        long __functionAddress = GL.getICD().glMultiTexCoord1svARB;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 1);
        }
        callPV(texture, v, __functionAddress);
    }

    /** {@code void glMultiTexCoord1ivARB(GLenum texture, GLint const * v)} */
    public static void glMultiTexCoord1ivARB(@NativeType("GLenum") int texture, @NativeType("GLint const *") int[] v) {
        long __functionAddress = GL.getICD().glMultiTexCoord1ivARB;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 1);
        }
        callPV(texture, v, __functionAddress);
    }

    /** {@code void glMultiTexCoord1dvARB(GLenum texture, GLdouble const * v)} */
    public static void glMultiTexCoord1dvARB(@NativeType("GLenum") int texture, @NativeType("GLdouble const *") double[] v) {
        long __functionAddress = GL.getICD().glMultiTexCoord1dvARB;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 1);
        }
        callPV(texture, v, __functionAddress);
    }

    /** {@code void glMultiTexCoord2fvARB(GLenum texture, GLfloat const * v)} */
    public static void glMultiTexCoord2fvARB(@NativeType("GLenum") int texture, @NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GL.getICD().glMultiTexCoord2fvARB;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 2);
        }
        callPV(texture, v, __functionAddress);
    }

    /** {@code void glMultiTexCoord2svARB(GLenum texture, GLshort const * v)} */
    public static void glMultiTexCoord2svARB(@NativeType("GLenum") int texture, @NativeType("GLshort const *") short[] v) {
        long __functionAddress = GL.getICD().glMultiTexCoord2svARB;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 2);
        }
        callPV(texture, v, __functionAddress);
    }

    /** {@code void glMultiTexCoord2ivARB(GLenum texture, GLint const * v)} */
    public static void glMultiTexCoord2ivARB(@NativeType("GLenum") int texture, @NativeType("GLint const *") int[] v) {
        long __functionAddress = GL.getICD().glMultiTexCoord2ivARB;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 2);
        }
        callPV(texture, v, __functionAddress);
    }

    /** {@code void glMultiTexCoord2dvARB(GLenum texture, GLdouble const * v)} */
    public static void glMultiTexCoord2dvARB(@NativeType("GLenum") int texture, @NativeType("GLdouble const *") double[] v) {
        long __functionAddress = GL.getICD().glMultiTexCoord2dvARB;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 2);
        }
        callPV(texture, v, __functionAddress);
    }

    /** {@code void glMultiTexCoord3fvARB(GLenum texture, GLfloat const * v)} */
    public static void glMultiTexCoord3fvARB(@NativeType("GLenum") int texture, @NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GL.getICD().glMultiTexCoord3fvARB;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(texture, v, __functionAddress);
    }

    /** {@code void glMultiTexCoord3svARB(GLenum texture, GLshort const * v)} */
    public static void glMultiTexCoord3svARB(@NativeType("GLenum") int texture, @NativeType("GLshort const *") short[] v) {
        long __functionAddress = GL.getICD().glMultiTexCoord3svARB;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(texture, v, __functionAddress);
    }

    /** {@code void glMultiTexCoord3ivARB(GLenum texture, GLint const * v)} */
    public static void glMultiTexCoord3ivARB(@NativeType("GLenum") int texture, @NativeType("GLint const *") int[] v) {
        long __functionAddress = GL.getICD().glMultiTexCoord3ivARB;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(texture, v, __functionAddress);
    }

    /** {@code void glMultiTexCoord3dvARB(GLenum texture, GLdouble const * v)} */
    public static void glMultiTexCoord3dvARB(@NativeType("GLenum") int texture, @NativeType("GLdouble const *") double[] v) {
        long __functionAddress = GL.getICD().glMultiTexCoord3dvARB;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(texture, v, __functionAddress);
    }

    /** {@code void glMultiTexCoord4fvARB(GLenum texture, GLfloat const * v)} */
    public static void glMultiTexCoord4fvARB(@NativeType("GLenum") int texture, @NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GL.getICD().glMultiTexCoord4fvARB;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(texture, v, __functionAddress);
    }

    /** {@code void glMultiTexCoord4svARB(GLenum texture, GLshort const * v)} */
    public static void glMultiTexCoord4svARB(@NativeType("GLenum") int texture, @NativeType("GLshort const *") short[] v) {
        long __functionAddress = GL.getICD().glMultiTexCoord4svARB;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(texture, v, __functionAddress);
    }

    /** {@code void glMultiTexCoord4ivARB(GLenum texture, GLint const * v)} */
    public static void glMultiTexCoord4ivARB(@NativeType("GLenum") int texture, @NativeType("GLint const *") int[] v) {
        long __functionAddress = GL.getICD().glMultiTexCoord4ivARB;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(texture, v, __functionAddress);
    }

    /** {@code void glMultiTexCoord4dvARB(GLenum texture, GLdouble const * v)} */
    public static void glMultiTexCoord4dvARB(@NativeType("GLenum") int texture, @NativeType("GLdouble const *") double[] v) {
        long __functionAddress = GL.getICD().glMultiTexCoord4dvARB;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(texture, v, __functionAddress);
    }

}
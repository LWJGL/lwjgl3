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

public class ARBWindowPos {

    static { GL.initialize(); }

    protected ARBWindowPos() {
        throw new UnsupportedOperationException();
    }

    // --- [ glWindowPos2iARB ] ---

    /** {@code void glWindowPos2iARB(GLint x, GLint y)} */
    public static native void glWindowPos2iARB(@NativeType("GLint") int x, @NativeType("GLint") int y);

    // --- [ glWindowPos2sARB ] ---

    /** {@code void glWindowPos2sARB(GLshort x, GLshort y)} */
    public static native void glWindowPos2sARB(@NativeType("GLshort") short x, @NativeType("GLshort") short y);

    // --- [ glWindowPos2fARB ] ---

    /** {@code void glWindowPos2fARB(GLfloat x, GLfloat y)} */
    public static native void glWindowPos2fARB(@NativeType("GLfloat") float x, @NativeType("GLfloat") float y);

    // --- [ glWindowPos2dARB ] ---

    /** {@code void glWindowPos2dARB(GLdouble x, GLdouble y)} */
    public static native void glWindowPos2dARB(@NativeType("GLdouble") double x, @NativeType("GLdouble") double y);

    // --- [ glWindowPos2ivARB ] ---

    /** {@code void glWindowPos2ivARB(GLint const * p)} */
    public static native void nglWindowPos2ivARB(long p);

    /** {@code void glWindowPos2ivARB(GLint const * p)} */
    public static void glWindowPos2ivARB(@NativeType("GLint const *") IntBuffer p) {
        if (CHECKS) {
            check(p, 2);
        }
        nglWindowPos2ivARB(memAddress(p));
    }

    // --- [ glWindowPos2svARB ] ---

    /** {@code void glWindowPos2svARB(GLshort const * p)} */
    public static native void nglWindowPos2svARB(long p);

    /** {@code void glWindowPos2svARB(GLshort const * p)} */
    public static void glWindowPos2svARB(@NativeType("GLshort const *") ShortBuffer p) {
        if (CHECKS) {
            check(p, 2);
        }
        nglWindowPos2svARB(memAddress(p));
    }

    // --- [ glWindowPos2fvARB ] ---

    /** {@code void glWindowPos2fvARB(GLfloat const * p)} */
    public static native void nglWindowPos2fvARB(long p);

    /** {@code void glWindowPos2fvARB(GLfloat const * p)} */
    public static void glWindowPos2fvARB(@NativeType("GLfloat const *") FloatBuffer p) {
        if (CHECKS) {
            check(p, 2);
        }
        nglWindowPos2fvARB(memAddress(p));
    }

    // --- [ glWindowPos2dvARB ] ---

    /** {@code void glWindowPos2dvARB(GLdouble const * p)} */
    public static native void nglWindowPos2dvARB(long p);

    /** {@code void glWindowPos2dvARB(GLdouble const * p)} */
    public static void glWindowPos2dvARB(@NativeType("GLdouble const *") DoubleBuffer p) {
        if (CHECKS) {
            check(p, 2);
        }
        nglWindowPos2dvARB(memAddress(p));
    }

    // --- [ glWindowPos3iARB ] ---

    /** {@code void glWindowPos3iARB(GLint x, GLint y, GLint z)} */
    public static native void glWindowPos3iARB(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z);

    // --- [ glWindowPos3sARB ] ---

    /** {@code void glWindowPos3sARB(GLshort x, GLshort y, GLshort z)} */
    public static native void glWindowPos3sARB(@NativeType("GLshort") short x, @NativeType("GLshort") short y, @NativeType("GLshort") short z);

    // --- [ glWindowPos3fARB ] ---

    /** {@code void glWindowPos3fARB(GLfloat x, GLfloat y, GLfloat z)} */
    public static native void glWindowPos3fARB(@NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float z);

    // --- [ glWindowPos3dARB ] ---

    /** {@code void glWindowPos3dARB(GLdouble x, GLdouble y, GLdouble z)} */
    public static native void glWindowPos3dARB(@NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z);

    // --- [ glWindowPos3ivARB ] ---

    /** {@code void glWindowPos3ivARB(GLint const * p)} */
    public static native void nglWindowPos3ivARB(long p);

    /** {@code void glWindowPos3ivARB(GLint const * p)} */
    public static void glWindowPos3ivARB(@NativeType("GLint const *") IntBuffer p) {
        if (CHECKS) {
            check(p, 3);
        }
        nglWindowPos3ivARB(memAddress(p));
    }

    // --- [ glWindowPos3svARB ] ---

    /** {@code void glWindowPos3svARB(GLshort const * p)} */
    public static native void nglWindowPos3svARB(long p);

    /** {@code void glWindowPos3svARB(GLshort const * p)} */
    public static void glWindowPos3svARB(@NativeType("GLshort const *") ShortBuffer p) {
        if (CHECKS) {
            check(p, 3);
        }
        nglWindowPos3svARB(memAddress(p));
    }

    // --- [ glWindowPos3fvARB ] ---

    /** {@code void glWindowPos3fvARB(GLfloat const * p)} */
    public static native void nglWindowPos3fvARB(long p);

    /** {@code void glWindowPos3fvARB(GLfloat const * p)} */
    public static void glWindowPos3fvARB(@NativeType("GLfloat const *") FloatBuffer p) {
        if (CHECKS) {
            check(p, 3);
        }
        nglWindowPos3fvARB(memAddress(p));
    }

    // --- [ glWindowPos3dvARB ] ---

    /** {@code void glWindowPos3dvARB(GLdouble const * p)} */
    public static native void nglWindowPos3dvARB(long p);

    /** {@code void glWindowPos3dvARB(GLdouble const * p)} */
    public static void glWindowPos3dvARB(@NativeType("GLdouble const *") DoubleBuffer p) {
        if (CHECKS) {
            check(p, 3);
        }
        nglWindowPos3dvARB(memAddress(p));
    }

    /** {@code void glWindowPos2ivARB(GLint const * p)} */
    public static void glWindowPos2ivARB(@NativeType("GLint const *") int[] p) {
        long __functionAddress = GL.getICD().glWindowPos2ivARB;
        if (CHECKS) {
            check(__functionAddress);
            check(p, 2);
        }
        callPV(p, __functionAddress);
    }

    /** {@code void glWindowPos2svARB(GLshort const * p)} */
    public static void glWindowPos2svARB(@NativeType("GLshort const *") short[] p) {
        long __functionAddress = GL.getICD().glWindowPos2svARB;
        if (CHECKS) {
            check(__functionAddress);
            check(p, 2);
        }
        callPV(p, __functionAddress);
    }

    /** {@code void glWindowPos2fvARB(GLfloat const * p)} */
    public static void glWindowPos2fvARB(@NativeType("GLfloat const *") float[] p) {
        long __functionAddress = GL.getICD().glWindowPos2fvARB;
        if (CHECKS) {
            check(__functionAddress);
            check(p, 2);
        }
        callPV(p, __functionAddress);
    }

    /** {@code void glWindowPos2dvARB(GLdouble const * p)} */
    public static void glWindowPos2dvARB(@NativeType("GLdouble const *") double[] p) {
        long __functionAddress = GL.getICD().glWindowPos2dvARB;
        if (CHECKS) {
            check(__functionAddress);
            check(p, 2);
        }
        callPV(p, __functionAddress);
    }

    /** {@code void glWindowPos3ivARB(GLint const * p)} */
    public static void glWindowPos3ivARB(@NativeType("GLint const *") int[] p) {
        long __functionAddress = GL.getICD().glWindowPos3ivARB;
        if (CHECKS) {
            check(__functionAddress);
            check(p, 3);
        }
        callPV(p, __functionAddress);
    }

    /** {@code void glWindowPos3svARB(GLshort const * p)} */
    public static void glWindowPos3svARB(@NativeType("GLshort const *") short[] p) {
        long __functionAddress = GL.getICD().glWindowPos3svARB;
        if (CHECKS) {
            check(__functionAddress);
            check(p, 3);
        }
        callPV(p, __functionAddress);
    }

    /** {@code void glWindowPos3fvARB(GLfloat const * p)} */
    public static void glWindowPos3fvARB(@NativeType("GLfloat const *") float[] p) {
        long __functionAddress = GL.getICD().glWindowPos3fvARB;
        if (CHECKS) {
            check(__functionAddress);
            check(p, 3);
        }
        callPV(p, __functionAddress);
    }

    /** {@code void glWindowPos3dvARB(GLdouble const * p)} */
    public static void glWindowPos3dvARB(@NativeType("GLdouble const *") double[] p) {
        long __functionAddress = GL.getICD().glWindowPos3dvARB;
        if (CHECKS) {
            check(__functionAddress);
            check(p, 3);
        }
        callPV(p, __functionAddress);
    }

}
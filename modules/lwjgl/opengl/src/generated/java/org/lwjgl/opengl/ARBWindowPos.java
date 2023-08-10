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
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_window_pos.txt">ARB_window_pos</a> extension.
 * 
 * <p>In order to set the current raster position to a specific window coordinate with the {@link GL11#glRasterPos2i RasterPos2i} command, the modelview matrix, projection matrix
 * and viewport must be set very carefully. Furthermore, if the desired window coordinate is outside of the window's bounds one must rely on a subtle
 * side-effect of the {@link GL11#glBitmap Bitmap} command in order to avoid frustum clipping.</p>
 * 
 * <p>This extension provides a set of functions to directly set the current raster position in window coordinates, bypassing the modelview matrix, the
 * projection matrix and the viewport-to-window mapping. Furthermore, clip testing is not performed, so that the current raster position is always valid.</p>
 * 
 * <p>This greatly simplifies the process of setting the current raster position to a specific window coordinate prior to calling {@link GL11#glDrawPixels DrawPixels},
 * {@link GL11#glCopyPixels CopyPixels} or {@link GL11#glBitmap Bitmap}. Many matrix operations can be avoided when mixing 2D and 3D rendering.</p>
 * 
 * <p>Promoted to core in {@link GL14 OpenGL 1.4}.</p>
 */
public class ARBWindowPos {

    static { GL.initialize(); }

    protected ARBWindowPos() {
        throw new UnsupportedOperationException();
    }

    // --- [ glWindowPos2iARB ] ---

    /**
     * Alternate way to set the current raster position. {@code z} is implictly set to 0.
     *
     * @param x the x value
     * @param y the y value
     */
    public static native void glWindowPos2iARB(@NativeType("GLint") int x, @NativeType("GLint") int y);

    // --- [ glWindowPos2sARB ] ---

    /**
     * Short version of {@link #glWindowPos2iARB WindowPos2iARB}.
     *
     * @param x the x value
     * @param y the y value
     */
    public static native void glWindowPos2sARB(@NativeType("GLshort") short x, @NativeType("GLshort") short y);

    // --- [ glWindowPos2fARB ] ---

    /**
     * Float version of {@link #glWindowPos2iARB WindowPos2iARB}.
     *
     * @param x the x value
     * @param y the y value
     */
    public static native void glWindowPos2fARB(@NativeType("GLfloat") float x, @NativeType("GLfloat") float y);

    // --- [ glWindowPos2dARB ] ---

    /**
     * Double version of {@link #glWindowPos2iARB WindowPos2iARB}.
     *
     * @param x the x value
     * @param y the y value
     */
    public static native void glWindowPos2dARB(@NativeType("GLdouble") double x, @NativeType("GLdouble") double y);

    // --- [ glWindowPos2ivARB ] ---

    /** Unsafe version of: {@link #glWindowPos2ivARB WindowPos2ivARB} */
    public static native void nglWindowPos2ivARB(long p);

    /**
     * Pointer version of {@link #glWindowPos2iARB WindowPos2iARB}.
     *
     * @param p the position value
     */
    public static void glWindowPos2ivARB(@NativeType("GLint const *") IntBuffer p) {
        if (CHECKS) {
            check(p, 2);
        }
        nglWindowPos2ivARB(memAddress(p));
    }

    // --- [ glWindowPos2svARB ] ---

    /** Unsafe version of: {@link #glWindowPos2svARB WindowPos2svARB} */
    public static native void nglWindowPos2svARB(long p);

    /**
     * Pointer version of {@link #glWindowPos2sARB WindowPos2sARB}.
     *
     * @param p the position value
     */
    public static void glWindowPos2svARB(@NativeType("GLshort const *") ShortBuffer p) {
        if (CHECKS) {
            check(p, 2);
        }
        nglWindowPos2svARB(memAddress(p));
    }

    // --- [ glWindowPos2fvARB ] ---

    /** Unsafe version of: {@link #glWindowPos2fvARB WindowPos2fvARB} */
    public static native void nglWindowPos2fvARB(long p);

    /**
     * Pointer version of {@link #glWindowPos2fARB WindowPos2fARB}.
     *
     * @param p the position value
     */
    public static void glWindowPos2fvARB(@NativeType("GLfloat const *") FloatBuffer p) {
        if (CHECKS) {
            check(p, 2);
        }
        nglWindowPos2fvARB(memAddress(p));
    }

    // --- [ glWindowPos2dvARB ] ---

    /** Unsafe version of: {@link #glWindowPos2dvARB WindowPos2dvARB} */
    public static native void nglWindowPos2dvARB(long p);

    /**
     * Pointer version of {@link #glWindowPos2dARB WindowPos2dARB}.
     *
     * @param p the position value
     */
    public static void glWindowPos2dvARB(@NativeType("GLdouble const *") DoubleBuffer p) {
        if (CHECKS) {
            check(p, 2);
        }
        nglWindowPos2dvARB(memAddress(p));
    }

    // --- [ glWindowPos3iARB ] ---

    /**
     * Alternate way to set the current raster position.
     *
     * @param x the x value
     * @param y the y value
     * @param z the z value
     */
    public static native void glWindowPos3iARB(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z);

    // --- [ glWindowPos3sARB ] ---

    /**
     * Short version of {@link #glWindowPos3iARB WindowPos3iARB}.
     *
     * @param x the x value
     * @param y the y value
     * @param z the z value
     */
    public static native void glWindowPos3sARB(@NativeType("GLshort") short x, @NativeType("GLshort") short y, @NativeType("GLshort") short z);

    // --- [ glWindowPos3fARB ] ---

    /**
     * Float version of {@link #glWindowPos3iARB WindowPos3iARB}.
     *
     * @param x the x value
     * @param y the y value
     * @param z the z value
     */
    public static native void glWindowPos3fARB(@NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float z);

    // --- [ glWindowPos3dARB ] ---

    /**
     * Double version of {@link #glWindowPos3iARB WindowPos3iARB}.
     *
     * @param x the x value
     * @param y the y value
     * @param z the z value
     */
    public static native void glWindowPos3dARB(@NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z);

    // --- [ glWindowPos3ivARB ] ---

    /** Unsafe version of: {@link #glWindowPos3ivARB WindowPos3ivARB} */
    public static native void nglWindowPos3ivARB(long p);

    /**
     * Pointer version of {@link #glWindowPos3iARB WindowPos3iARB}.
     *
     * @param p the position value
     */
    public static void glWindowPos3ivARB(@NativeType("GLint const *") IntBuffer p) {
        if (CHECKS) {
            check(p, 3);
        }
        nglWindowPos3ivARB(memAddress(p));
    }

    // --- [ glWindowPos3svARB ] ---

    /** Unsafe version of: {@link #glWindowPos3svARB WindowPos3svARB} */
    public static native void nglWindowPos3svARB(long p);

    /**
     * Pointer version of {@link #glWindowPos3sARB WindowPos3sARB}.
     *
     * @param p the position value
     */
    public static void glWindowPos3svARB(@NativeType("GLshort const *") ShortBuffer p) {
        if (CHECKS) {
            check(p, 3);
        }
        nglWindowPos3svARB(memAddress(p));
    }

    // --- [ glWindowPos3fvARB ] ---

    /** Unsafe version of: {@link #glWindowPos3fvARB WindowPos3fvARB} */
    public static native void nglWindowPos3fvARB(long p);

    /**
     * Pointer version of {@link #glWindowPos3fARB WindowPos3fARB}.
     *
     * @param p the position value
     */
    public static void glWindowPos3fvARB(@NativeType("GLfloat const *") FloatBuffer p) {
        if (CHECKS) {
            check(p, 3);
        }
        nglWindowPos3fvARB(memAddress(p));
    }

    // --- [ glWindowPos3dvARB ] ---

    /** Unsafe version of: {@link #glWindowPos3dvARB WindowPos3dvARB} */
    public static native void nglWindowPos3dvARB(long p);

    /**
     * Pointer version of {@link #glWindowPos3dARB WindowPos3dARB}.
     *
     * @param p the position value
     */
    public static void glWindowPos3dvARB(@NativeType("GLdouble const *") DoubleBuffer p) {
        if (CHECKS) {
            check(p, 3);
        }
        nglWindowPos3dvARB(memAddress(p));
    }

    /** Array version of: {@link #glWindowPos2ivARB WindowPos2ivARB} */
    public static void glWindowPos2ivARB(@NativeType("GLint const *") int[] p) {
        long __functionAddress = GL.getICD().glWindowPos2ivARB;
        if (CHECKS) {
            check(__functionAddress);
            check(p, 2);
        }
        callPV(p, __functionAddress);
    }

    /** Array version of: {@link #glWindowPos2svARB WindowPos2svARB} */
    public static void glWindowPos2svARB(@NativeType("GLshort const *") short[] p) {
        long __functionAddress = GL.getICD().glWindowPos2svARB;
        if (CHECKS) {
            check(__functionAddress);
            check(p, 2);
        }
        callPV(p, __functionAddress);
    }

    /** Array version of: {@link #glWindowPos2fvARB WindowPos2fvARB} */
    public static void glWindowPos2fvARB(@NativeType("GLfloat const *") float[] p) {
        long __functionAddress = GL.getICD().glWindowPos2fvARB;
        if (CHECKS) {
            check(__functionAddress);
            check(p, 2);
        }
        callPV(p, __functionAddress);
    }

    /** Array version of: {@link #glWindowPos2dvARB WindowPos2dvARB} */
    public static void glWindowPos2dvARB(@NativeType("GLdouble const *") double[] p) {
        long __functionAddress = GL.getICD().glWindowPos2dvARB;
        if (CHECKS) {
            check(__functionAddress);
            check(p, 2);
        }
        callPV(p, __functionAddress);
    }

    /** Array version of: {@link #glWindowPos3ivARB WindowPos3ivARB} */
    public static void glWindowPos3ivARB(@NativeType("GLint const *") int[] p) {
        long __functionAddress = GL.getICD().glWindowPos3ivARB;
        if (CHECKS) {
            check(__functionAddress);
            check(p, 3);
        }
        callPV(p, __functionAddress);
    }

    /** Array version of: {@link #glWindowPos3svARB WindowPos3svARB} */
    public static void glWindowPos3svARB(@NativeType("GLshort const *") short[] p) {
        long __functionAddress = GL.getICD().glWindowPos3svARB;
        if (CHECKS) {
            check(__functionAddress);
            check(p, 3);
        }
        callPV(p, __functionAddress);
    }

    /** Array version of: {@link #glWindowPos3fvARB WindowPos3fvARB} */
    public static void glWindowPos3fvARB(@NativeType("GLfloat const *") float[] p) {
        long __functionAddress = GL.getICD().glWindowPos3fvARB;
        if (CHECKS) {
            check(__functionAddress);
            check(p, 3);
        }
        callPV(p, __functionAddress);
    }

    /** Array version of: {@link #glWindowPos3dvARB WindowPos3dvARB} */
    public static void glWindowPos3dvARB(@NativeType("GLdouble const *") double[] p) {
        long __functionAddress = GL.getICD().glWindowPos3dvARB;
        if (CHECKS) {
            check(__functionAddress);
            check(p, 3);
        }
        callPV(p, __functionAddress);
    }

}
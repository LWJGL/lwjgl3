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

public class ARBPointParameters {

    static { GL.initialize(); }

    public static final int
        GL_POINT_SIZE_MIN_ARB             = 0x8126,
        GL_POINT_SIZE_MAX_ARB             = 0x8127,
        GL_POINT_FADE_THRESHOLD_SIZE_ARB  = 0x8128,
        GL_POINT_DISTANCE_ATTENUATION_ARB = 0x8129;

    protected ARBPointParameters() {
        throw new UnsupportedOperationException();
    }

    // --- [ glPointParameterfARB ] ---

    /** {@code void glPointParameterfARB(GLenum pname, GLfloat param)} */
    public static native void glPointParameterfARB(@NativeType("GLenum") int pname, @NativeType("GLfloat") float param);

    // --- [ glPointParameterfvARB ] ---

    /** {@code void glPointParameterfvARB(GLenum pname, GLfloat const * params)} */
    public static native void nglPointParameterfvARB(int pname, long params);

    /** {@code void glPointParameterfvARB(GLenum pname, GLfloat const * params)} */
    public static void glPointParameterfvARB(@NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 3);
        }
        nglPointParameterfvARB(pname, memAddress(params));
    }

    /** {@code void glPointParameterfvARB(GLenum pname, GLfloat const * params)} */
    public static void glPointParameterfvARB(@NativeType("GLenum") int pname, @NativeType("GLfloat const *") float[] params) {
        long __functionAddress = GL.getICD().glPointParameterfvARB;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 3);
        }
        callPV(pname, params, __functionAddress);
    }

}
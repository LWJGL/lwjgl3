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

public class EXTPointParameters {

    static { GL.initialize(); }

    public static final int
        GL_POINT_SIZE_MIN_EXT            = 0x8126,
        GL_POINT_SIZE_MAX_EXT            = 0x8127,
        GL_POINT_FADE_THRESHOLD_SIZE_EXT = 0x8128,
        GL_DISTANCE_ATTENUATION_EXT      = 0x8129;

    protected EXTPointParameters() {
        throw new UnsupportedOperationException();
    }

    // --- [ glPointParameterfEXT ] ---

    /** {@code void glPointParameterfEXT(GLenum pname, GLfloat param)} */
    public static native void glPointParameterfEXT(@NativeType("GLenum") int pname, @NativeType("GLfloat") float param);

    // --- [ glPointParameterfvEXT ] ---

    /** {@code void glPointParameterfvEXT(GLenum pname, GLfloat const * params)} */
    public static native void nglPointParameterfvEXT(int pname, long params);

    /** {@code void glPointParameterfvEXT(GLenum pname, GLfloat const * params)} */
    public static void glPointParameterfvEXT(@NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglPointParameterfvEXT(pname, memAddress(params));
    }

    /** {@code void glPointParameterfvEXT(GLenum pname, GLfloat const * params)} */
    public static void glPointParameterfvEXT(@NativeType("GLenum") int pname, @NativeType("GLfloat const *") float[] params) {
        long __functionAddress = GL.getICD().glPointParameterfvEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(pname, params, __functionAddress);
    }

}
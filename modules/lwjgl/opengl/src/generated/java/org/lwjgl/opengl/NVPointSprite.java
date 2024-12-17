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

public class NVPointSprite {

    static { GL.initialize(); }

    public static final int GL_POINT_SPRITE_NV = 0x8861;

    public static final int GL_COORD_REPLACE_NV = 0x8862;

    public static final int GL_POINT_SPRITE_R_MODE_NV = 0x8863;

    protected NVPointSprite() {
        throw new UnsupportedOperationException();
    }

    // --- [ glPointParameteriNV ] ---

    /** {@code void glPointParameteriNV(GLenum pname, GLint param)} */
    public static native void glPointParameteriNV(@NativeType("GLenum") int pname, @NativeType("GLint") int param);

    // --- [ glPointParameterivNV ] ---

    /** {@code void glPointParameterivNV(GLenum pname, GLint const * params)} */
    public static native void nglPointParameterivNV(int pname, long params);

    /** {@code void glPointParameterivNV(GLenum pname, GLint const * params)} */
    public static void glPointParameterivNV(@NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglPointParameterivNV(pname, memAddress(params));
    }

    /** {@code void glPointParameterivNV(GLenum pname, GLint const * params)} */
    public static void glPointParameterivNV(@NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        long __functionAddress = GL.getICD().glPointParameterivNV;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(pname, params, __functionAddress);
    }

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class MESAFramebufferFlipY {

    static { GLES.initialize(); }

    public static final int GL_FRAMEBUFFER_FLIP_Y_MESA = 0x8BBB;

    protected MESAFramebufferFlipY() {
        throw new UnsupportedOperationException();
    }

    // --- [ glFramebufferParameteriMESA ] ---

    /** {@code void glFramebufferParameteriMESA(GLenum target, GLenum pname, GLint param)} */
    public static native void glFramebufferParameteriMESA(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint") int param);

    // --- [ glGetFramebufferParameterivMESA ] ---

    /** {@code void glGetFramebufferParameterivMESA(GLenum target, GLenum pname, GLint * params)} */
    public static native void nglGetFramebufferParameterivMESA(int target, int pname, long params);

    /** {@code void glGetFramebufferParameterivMESA(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetFramebufferParameterivMESA(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetFramebufferParameterivMESA(target, pname, memAddress(params));
    }

    /** {@code void glGetFramebufferParameterivMESA(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetFramebufferParameterivMESA(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetFramebufferParameterivMESA;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

}
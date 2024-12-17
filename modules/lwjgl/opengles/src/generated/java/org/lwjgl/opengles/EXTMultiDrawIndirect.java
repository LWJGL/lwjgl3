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

public class EXTMultiDrawIndirect {

    static { GLES.initialize(); }

    protected EXTMultiDrawIndirect() {
        throw new UnsupportedOperationException();
    }

    // --- [ glMultiDrawArraysIndirectEXT ] ---

    /** {@code void glMultiDrawArraysIndirectEXT(GLenum mode, void const * indirect, GLsizei drawcount, GLsizei stride)} */
    public static native void nglMultiDrawArraysIndirectEXT(int mode, long indirect, int drawcount, int stride);

    /** {@code void glMultiDrawArraysIndirectEXT(GLenum mode, void const * indirect, GLsizei drawcount, GLsizei stride)} */
    public static void glMultiDrawArraysIndirectEXT(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indirect, @NativeType("GLsizei") int drawcount, @NativeType("GLsizei") int stride) {
        if (CHECKS) {
            check(indirect, drawcount * (stride == 0 ? (4 * 4) : stride));
        }
        nglMultiDrawArraysIndirectEXT(mode, memAddress(indirect), drawcount, stride);
    }

    /** {@code void glMultiDrawArraysIndirectEXT(GLenum mode, void const * indirect, GLsizei drawcount, GLsizei stride)} */
    public static void glMultiDrawArraysIndirectEXT(@NativeType("GLenum") int mode, @NativeType("void const *") long indirect, @NativeType("GLsizei") int drawcount, @NativeType("GLsizei") int stride) {
        nglMultiDrawArraysIndirectEXT(mode, indirect, drawcount, stride);
    }

    /** {@code void glMultiDrawArraysIndirectEXT(GLenum mode, void const * indirect, GLsizei drawcount, GLsizei stride)} */
    public static void glMultiDrawArraysIndirectEXT(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indirect, @NativeType("GLsizei") int drawcount, @NativeType("GLsizei") int stride) {
        if (CHECKS) {
            check(indirect, (drawcount * (stride == 0 ? (4 * 4) : stride)) >> 2);
        }
        nglMultiDrawArraysIndirectEXT(mode, memAddress(indirect), drawcount, stride);
    }

    // --- [ glMultiDrawElementsIndirectEXT ] ---

    /** {@code void glMultiDrawElementsIndirectEXT(GLenum mode, GLenum type, void const * indirect, GLsizei drawcount, GLsizei stride)} */
    public static native void nglMultiDrawElementsIndirectEXT(int mode, int type, long indirect, int drawcount, int stride);

    /** {@code void glMultiDrawElementsIndirectEXT(GLenum mode, GLenum type, void const * indirect, GLsizei drawcount, GLsizei stride)} */
    public static void glMultiDrawElementsIndirectEXT(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indirect, @NativeType("GLsizei") int drawcount, @NativeType("GLsizei") int stride) {
        if (CHECKS) {
            check(indirect, drawcount * (stride == 0 ? (5 * 4) : stride));
        }
        nglMultiDrawElementsIndirectEXT(mode, type, memAddress(indirect), drawcount, stride);
    }

    /** {@code void glMultiDrawElementsIndirectEXT(GLenum mode, GLenum type, void const * indirect, GLsizei drawcount, GLsizei stride)} */
    public static void glMultiDrawElementsIndirectEXT(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") long indirect, @NativeType("GLsizei") int drawcount, @NativeType("GLsizei") int stride) {
        nglMultiDrawElementsIndirectEXT(mode, type, indirect, drawcount, stride);
    }

    /** {@code void glMultiDrawElementsIndirectEXT(GLenum mode, GLenum type, void const * indirect, GLsizei drawcount, GLsizei stride)} */
    public static void glMultiDrawElementsIndirectEXT(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer indirect, @NativeType("GLsizei") int drawcount, @NativeType("GLsizei") int stride) {
        if (CHECKS) {
            check(indirect, (drawcount * (stride == 0 ? (5 * 4) : stride)) >> 2);
        }
        nglMultiDrawElementsIndirectEXT(mode, type, memAddress(indirect), drawcount, stride);
    }

    /** {@code void glMultiDrawArraysIndirectEXT(GLenum mode, void const * indirect, GLsizei drawcount, GLsizei stride)} */
    public static void glMultiDrawArraysIndirectEXT(@NativeType("GLenum") int mode, @NativeType("void const *") int[] indirect, @NativeType("GLsizei") int drawcount, @NativeType("GLsizei") int stride) {
        long __functionAddress = GLES.getICD().glMultiDrawArraysIndirectEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(indirect, (drawcount * (stride == 0 ? (4 * 4) : stride)) >> 2);
        }
        callPV(mode, indirect, drawcount, stride, __functionAddress);
    }

    /** {@code void glMultiDrawElementsIndirectEXT(GLenum mode, GLenum type, void const * indirect, GLsizei drawcount, GLsizei stride)} */
    public static void glMultiDrawElementsIndirectEXT(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") int[] indirect, @NativeType("GLsizei") int drawcount, @NativeType("GLsizei") int stride) {
        long __functionAddress = GLES.getICD().glMultiDrawElementsIndirectEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(indirect, (drawcount * (stride == 0 ? (5 * 4) : stride)) >> 2);
        }
        callPV(mode, type, indirect, drawcount, stride, __functionAddress);
    }

}
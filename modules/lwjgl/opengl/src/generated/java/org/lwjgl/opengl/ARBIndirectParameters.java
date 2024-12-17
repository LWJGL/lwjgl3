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

public class ARBIndirectParameters {

    static { GL.initialize(); }

    public static final int GL_PARAMETER_BUFFER_ARB = 0x80EE;

    public static final int GL_PARAMETER_BUFFER_BINDING_ARB = 0x80EF;

    protected ARBIndirectParameters() {
        throw new UnsupportedOperationException();
    }

    // --- [ glMultiDrawArraysIndirectCountARB ] ---

    /** {@code void glMultiDrawArraysIndirectCountARB(GLenum mode, void const * indirect, GLintptr drawcount, GLsizei maxdrawcount, GLsizei stride)} */
    public static native void nglMultiDrawArraysIndirectCountARB(int mode, long indirect, long drawcount, int maxdrawcount, int stride);

    /** {@code void glMultiDrawArraysIndirectCountARB(GLenum mode, void const * indirect, GLintptr drawcount, GLsizei maxdrawcount, GLsizei stride)} */
    public static void glMultiDrawArraysIndirectCountARB(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indirect, @NativeType("GLintptr") long drawcount, @NativeType("GLsizei") int maxdrawcount, @NativeType("GLsizei") int stride) {
        if (CHECKS) {
            check(indirect, maxdrawcount * (stride == 0 ? (4 * 4) : stride));
        }
        nglMultiDrawArraysIndirectCountARB(mode, memAddress(indirect), drawcount, maxdrawcount, stride);
    }

    /** {@code void glMultiDrawArraysIndirectCountARB(GLenum mode, void const * indirect, GLintptr drawcount, GLsizei maxdrawcount, GLsizei stride)} */
    public static void glMultiDrawArraysIndirectCountARB(@NativeType("GLenum") int mode, @NativeType("void const *") long indirect, @NativeType("GLintptr") long drawcount, @NativeType("GLsizei") int maxdrawcount, @NativeType("GLsizei") int stride) {
        nglMultiDrawArraysIndirectCountARB(mode, indirect, drawcount, maxdrawcount, stride);
    }

    /** {@code void glMultiDrawArraysIndirectCountARB(GLenum mode, void const * indirect, GLintptr drawcount, GLsizei maxdrawcount, GLsizei stride)} */
    public static void glMultiDrawArraysIndirectCountARB(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indirect, @NativeType("GLintptr") long drawcount, @NativeType("GLsizei") int maxdrawcount, @NativeType("GLsizei") int stride) {
        if (CHECKS) {
            check(indirect, (maxdrawcount * (stride == 0 ? (4 * 4) : stride)) >> 2);
        }
        nglMultiDrawArraysIndirectCountARB(mode, memAddress(indirect), drawcount, maxdrawcount, stride);
    }

    // --- [ glMultiDrawElementsIndirectCountARB ] ---

    /** {@code void glMultiDrawElementsIndirectCountARB(GLenum mode, GLenum type, void const * indirect, GLintptr drawcount, GLsizei maxdrawcount, GLsizei stride)} */
    public static native void nglMultiDrawElementsIndirectCountARB(int mode, int type, long indirect, long drawcount, int maxdrawcount, int stride);

    /** {@code void glMultiDrawElementsIndirectCountARB(GLenum mode, GLenum type, void const * indirect, GLintptr drawcount, GLsizei maxdrawcount, GLsizei stride)} */
    public static void glMultiDrawElementsIndirectCountARB(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indirect, @NativeType("GLintptr") long drawcount, @NativeType("GLsizei") int maxdrawcount, @NativeType("GLsizei") int stride) {
        if (CHECKS) {
            check(indirect, maxdrawcount * (stride == 0 ? (5 * 4) : stride));
        }
        nglMultiDrawElementsIndirectCountARB(mode, type, memAddress(indirect), drawcount, maxdrawcount, stride);
    }

    /** {@code void glMultiDrawElementsIndirectCountARB(GLenum mode, GLenum type, void const * indirect, GLintptr drawcount, GLsizei maxdrawcount, GLsizei stride)} */
    public static void glMultiDrawElementsIndirectCountARB(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") long indirect, @NativeType("GLintptr") long drawcount, @NativeType("GLsizei") int maxdrawcount, @NativeType("GLsizei") int stride) {
        nglMultiDrawElementsIndirectCountARB(mode, type, indirect, drawcount, maxdrawcount, stride);
    }

    /** {@code void glMultiDrawElementsIndirectCountARB(GLenum mode, GLenum type, void const * indirect, GLintptr drawcount, GLsizei maxdrawcount, GLsizei stride)} */
    public static void glMultiDrawElementsIndirectCountARB(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer indirect, @NativeType("GLintptr") long drawcount, @NativeType("GLsizei") int maxdrawcount, @NativeType("GLsizei") int stride) {
        if (CHECKS) {
            check(indirect, (maxdrawcount * (stride == 0 ? (5 * 4) : stride)) >> 2);
        }
        nglMultiDrawElementsIndirectCountARB(mode, type, memAddress(indirect), drawcount, maxdrawcount, stride);
    }

    /** {@code void glMultiDrawArraysIndirectCountARB(GLenum mode, void const * indirect, GLintptr drawcount, GLsizei maxdrawcount, GLsizei stride)} */
    public static void glMultiDrawArraysIndirectCountARB(@NativeType("GLenum") int mode, @NativeType("void const *") int[] indirect, @NativeType("GLintptr") long drawcount, @NativeType("GLsizei") int maxdrawcount, @NativeType("GLsizei") int stride) {
        long __functionAddress = GL.getICD().glMultiDrawArraysIndirectCountARB;
        if (CHECKS) {
            check(__functionAddress);
            check(indirect, (maxdrawcount * (stride == 0 ? (4 * 4) : stride)) >> 2);
        }
        callPPV(mode, indirect, drawcount, maxdrawcount, stride, __functionAddress);
    }

    /** {@code void glMultiDrawElementsIndirectCountARB(GLenum mode, GLenum type, void const * indirect, GLintptr drawcount, GLsizei maxdrawcount, GLsizei stride)} */
    public static void glMultiDrawElementsIndirectCountARB(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") int[] indirect, @NativeType("GLintptr") long drawcount, @NativeType("GLsizei") int maxdrawcount, @NativeType("GLsizei") int stride) {
        long __functionAddress = GL.getICD().glMultiDrawElementsIndirectCountARB;
        if (CHECKS) {
            check(__functionAddress);
            check(indirect, (maxdrawcount * (stride == 0 ? (5 * 4) : stride)) >> 2);
        }
        callPPV(mode, type, indirect, drawcount, maxdrawcount, stride, __functionAddress);
    }

}
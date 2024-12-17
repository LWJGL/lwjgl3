/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

public class ARBMultiDrawIndirect {

    static { GL.initialize(); }

    protected ARBMultiDrawIndirect() {
        throw new UnsupportedOperationException();
    }

    // --- [ glMultiDrawArraysIndirect ] ---

    /** {@code void glMultiDrawArraysIndirect(GLenum mode, void const * indirect, GLsizei drawcount, GLsizei stride)} */
    public static void nglMultiDrawArraysIndirect(int mode, long indirect, int drawcount, int stride) {
        GL43C.nglMultiDrawArraysIndirect(mode, indirect, drawcount, stride);
    }

    /** {@code void glMultiDrawArraysIndirect(GLenum mode, void const * indirect, GLsizei drawcount, GLsizei stride)} */
    public static void glMultiDrawArraysIndirect(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indirect, @NativeType("GLsizei") int drawcount, @NativeType("GLsizei") int stride) {
        GL43C.glMultiDrawArraysIndirect(mode, indirect, drawcount, stride);
    }

    /** {@code void glMultiDrawArraysIndirect(GLenum mode, void const * indirect, GLsizei drawcount, GLsizei stride)} */
    public static void glMultiDrawArraysIndirect(@NativeType("GLenum") int mode, @NativeType("void const *") long indirect, @NativeType("GLsizei") int drawcount, @NativeType("GLsizei") int stride) {
        GL43C.glMultiDrawArraysIndirect(mode, indirect, drawcount, stride);
    }

    /** {@code void glMultiDrawArraysIndirect(GLenum mode, void const * indirect, GLsizei drawcount, GLsizei stride)} */
    public static void glMultiDrawArraysIndirect(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indirect, @NativeType("GLsizei") int drawcount, @NativeType("GLsizei") int stride) {
        GL43C.glMultiDrawArraysIndirect(mode, indirect, drawcount, stride);
    }

    // --- [ glMultiDrawElementsIndirect ] ---

    /** {@code void glMultiDrawElementsIndirect(GLenum mode, GLenum type, void const * indirect, GLsizei drawcount, GLsizei stride)} */
    public static void nglMultiDrawElementsIndirect(int mode, int type, long indirect, int drawcount, int stride) {
        GL43C.nglMultiDrawElementsIndirect(mode, type, indirect, drawcount, stride);
    }

    /** {@code void glMultiDrawElementsIndirect(GLenum mode, GLenum type, void const * indirect, GLsizei drawcount, GLsizei stride)} */
    public static void glMultiDrawElementsIndirect(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indirect, @NativeType("GLsizei") int drawcount, @NativeType("GLsizei") int stride) {
        GL43C.glMultiDrawElementsIndirect(mode, type, indirect, drawcount, stride);
    }

    /** {@code void glMultiDrawElementsIndirect(GLenum mode, GLenum type, void const * indirect, GLsizei drawcount, GLsizei stride)} */
    public static void glMultiDrawElementsIndirect(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") long indirect, @NativeType("GLsizei") int drawcount, @NativeType("GLsizei") int stride) {
        GL43C.glMultiDrawElementsIndirect(mode, type, indirect, drawcount, stride);
    }

    /** {@code void glMultiDrawElementsIndirect(GLenum mode, GLenum type, void const * indirect, GLsizei drawcount, GLsizei stride)} */
    public static void glMultiDrawElementsIndirect(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer indirect, @NativeType("GLsizei") int drawcount, @NativeType("GLsizei") int stride) {
        GL43C.glMultiDrawElementsIndirect(mode, type, indirect, drawcount, stride);
    }

    /** {@code void glMultiDrawArraysIndirect(GLenum mode, void const * indirect, GLsizei drawcount, GLsizei stride)} */
    public static void glMultiDrawArraysIndirect(@NativeType("GLenum") int mode, @NativeType("void const *") int[] indirect, @NativeType("GLsizei") int drawcount, @NativeType("GLsizei") int stride) {
        GL43C.glMultiDrawArraysIndirect(mode, indirect, drawcount, stride);
    }

    /** {@code void glMultiDrawElementsIndirect(GLenum mode, GLenum type, void const * indirect, GLsizei drawcount, GLsizei stride)} */
    public static void glMultiDrawElementsIndirect(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") int[] indirect, @NativeType("GLsizei") int drawcount, @NativeType("GLsizei") int stride) {
        GL43C.glMultiDrawElementsIndirect(mode, type, indirect, drawcount, stride);
    }

}
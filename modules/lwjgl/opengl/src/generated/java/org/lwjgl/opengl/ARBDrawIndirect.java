/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

public class ARBDrawIndirect {

    static { GL.initialize(); }

    public static final int GL_DRAW_INDIRECT_BUFFER = 0x8F3F;

    public static final int GL_DRAW_INDIRECT_BUFFER_BINDING = 0x8F43;

    protected ARBDrawIndirect() {
        throw new UnsupportedOperationException();
    }

    // --- [ glDrawArraysIndirect ] ---

    /** {@code void glDrawArraysIndirect(GLenum mode, void const * indirect)} */
    public static void nglDrawArraysIndirect(int mode, long indirect) {
        GL40C.nglDrawArraysIndirect(mode, indirect);
    }

    /** {@code void glDrawArraysIndirect(GLenum mode, void const * indirect)} */
    public static void glDrawArraysIndirect(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indirect) {
        GL40C.glDrawArraysIndirect(mode, indirect);
    }

    /** {@code void glDrawArraysIndirect(GLenum mode, void const * indirect)} */
    public static void glDrawArraysIndirect(@NativeType("GLenum") int mode, @NativeType("void const *") long indirect) {
        GL40C.glDrawArraysIndirect(mode, indirect);
    }

    /** {@code void glDrawArraysIndirect(GLenum mode, void const * indirect)} */
    public static void glDrawArraysIndirect(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indirect) {
        GL40C.glDrawArraysIndirect(mode, indirect);
    }

    // --- [ glDrawElementsIndirect ] ---

    /** {@code void glDrawElementsIndirect(GLenum mode, GLenum type, void const * indirect)} */
    public static void nglDrawElementsIndirect(int mode, int type, long indirect) {
        GL40C.nglDrawElementsIndirect(mode, type, indirect);
    }

    /** {@code void glDrawElementsIndirect(GLenum mode, GLenum type, void const * indirect)} */
    public static void glDrawElementsIndirect(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indirect) {
        GL40C.glDrawElementsIndirect(mode, type, indirect);
    }

    /** {@code void glDrawElementsIndirect(GLenum mode, GLenum type, void const * indirect)} */
    public static void glDrawElementsIndirect(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") long indirect) {
        GL40C.glDrawElementsIndirect(mode, type, indirect);
    }

    /** {@code void glDrawElementsIndirect(GLenum mode, GLenum type, void const * indirect)} */
    public static void glDrawElementsIndirect(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer indirect) {
        GL40C.glDrawElementsIndirect(mode, type, indirect);
    }

    /** {@code void glDrawArraysIndirect(GLenum mode, void const * indirect)} */
    public static void glDrawArraysIndirect(@NativeType("GLenum") int mode, @NativeType("void const *") int[] indirect) {
        GL40C.glDrawArraysIndirect(mode, indirect);
    }

    /** {@code void glDrawElementsIndirect(GLenum mode, GLenum type, void const * indirect)} */
    public static void glDrawElementsIndirect(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") int[] indirect) {
        GL40C.glDrawElementsIndirect(mode, type, indirect);
    }

}
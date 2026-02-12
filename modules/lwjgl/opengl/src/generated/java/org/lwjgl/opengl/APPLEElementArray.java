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

public class APPLEElementArray {

    static { GL.initialize(); }

    public static final int GL_ELEMENT_ARRAY_APPLE = 0x8A0C;

    public static final int GL_ELEMENT_ARRAY_TYPE_APPLE = 0x8A0D;

    public static final int GL_ELEMENT_ARRAY_POINTER_APPLE = 0x8A0E;

    protected APPLEElementArray() {
        throw new UnsupportedOperationException();
    }

    // --- [ glElementPointerAPPLE ] ---

    /** {@code void glElementPointerAPPLE(GLenum type, void const * pointer)} */
    public static native void nglElementPointerAPPLE(int type, long pointer);

    /** {@code void glElementPointerAPPLE(GLenum type, void const * pointer)} */
    public static void glElementPointerAPPLE(@NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer pointer) {
        nglElementPointerAPPLE(type, memAddress(pointer));
    }

    /** {@code void glElementPointerAPPLE(GLenum type, void const * pointer)} */
    public static void glElementPointerAPPLE(@NativeType("GLenum") int type, @NativeType("void const *") long pointer) {
        nglElementPointerAPPLE(type, pointer);
    }

    /** {@code void glElementPointerAPPLE(GLenum type, void const * pointer)} */
    public static void glElementPointerAPPLE(@NativeType("void const *") ByteBuffer pointer) {
        nglElementPointerAPPLE(GL11.GL_UNSIGNED_BYTE, memAddress(pointer));
    }

    /** {@code void glElementPointerAPPLE(GLenum type, void const * pointer)} */
    public static void glElementPointerAPPLE(@NativeType("void const *") ShortBuffer pointer) {
        nglElementPointerAPPLE(GL11.GL_UNSIGNED_SHORT, memAddress(pointer));
    }

    /** {@code void glElementPointerAPPLE(GLenum type, void const * pointer)} */
    public static void glElementPointerAPPLE(@NativeType("void const *") IntBuffer pointer) {
        nglElementPointerAPPLE(GL11.GL_UNSIGNED_INT, memAddress(pointer));
    }

    // --- [ glDrawElementArrayAPPLE ] ---

    /** {@code void glDrawElementArrayAPPLE(GLenum mode, GLint first, GLsizei count)} */
    public static native void glDrawElementArrayAPPLE(@NativeType("GLenum") int mode, @NativeType("GLint") int first, @NativeType("GLsizei") int count);

    // --- [ glDrawRangeElementArrayAPPLE ] ---

    /** {@code void glDrawRangeElementArrayAPPLE(GLenum mode, GLuint start, GLuint end, GLint first, GLsizei count)} */
    public static native void glDrawRangeElementArrayAPPLE(@NativeType("GLenum") int mode, @NativeType("GLuint") int start, @NativeType("GLuint") int end, @NativeType("GLint") int first, @NativeType("GLsizei") int count);

    // --- [ glMultiDrawElementArrayAPPLE ] ---

    /** {@code void glMultiDrawElementArrayAPPLE(GLenum mode, GLint const * first, GLsizei const * count, GLsizei primcount)} */
    public static native void nglMultiDrawElementArrayAPPLE(int mode, long first, long count, int primcount);

    /** {@code void glMultiDrawElementArrayAPPLE(GLenum mode, GLint const * first, GLsizei const * count, GLsizei primcount)} */
    public static void glMultiDrawElementArrayAPPLE(@NativeType("GLenum") int mode, @NativeType("GLint const *") IntBuffer first, @NativeType("GLsizei const *") IntBuffer count) {
        if (CHECKS) {
            check(count, first.remaining());
        }
        nglMultiDrawElementArrayAPPLE(mode, memAddress(first), memAddress(count), first.remaining());
    }

    // --- [ glMultiDrawRangeElementArrayAPPLE ] ---

    /** {@code void glMultiDrawRangeElementArrayAPPLE(GLenum mode, GLuint start, GLuint end, GLint const * first, GLsizei const * count, GLsizei primcount)} */
    public static native void nglMultiDrawRangeElementArrayAPPLE(int mode, int start, int end, long first, long count, int primcount);

    /** {@code void glMultiDrawRangeElementArrayAPPLE(GLenum mode, GLuint start, GLuint end, GLint const * first, GLsizei const * count, GLsizei primcount)} */
    public static void glMultiDrawRangeElementArrayAPPLE(@NativeType("GLenum") int mode, @NativeType("GLuint") int start, @NativeType("GLuint") int end, @NativeType("GLint const *") IntBuffer first, @NativeType("GLsizei const *") IntBuffer count) {
        if (CHECKS) {
            check(count, first.remaining());
        }
        nglMultiDrawRangeElementArrayAPPLE(mode, start, end, memAddress(first), memAddress(count), first.remaining());
    }

    /** {@code void glMultiDrawElementArrayAPPLE(GLenum mode, GLint const * first, GLsizei const * count, GLsizei primcount)} */
    public static void glMultiDrawElementArrayAPPLE(@NativeType("GLenum") int mode, @NativeType("GLint const *") int[] first, @NativeType("GLsizei const *") int[] count) {
        long __functionAddress = GL.getICD().glMultiDrawElementArrayAPPLE;
        if (CHECKS) {
            check(__functionAddress);
            check(count, first.length);
        }
        callPPV(mode, first, count, first.length, __functionAddress);
    }

    /** {@code void glMultiDrawRangeElementArrayAPPLE(GLenum mode, GLuint start, GLuint end, GLint const * first, GLsizei const * count, GLsizei primcount)} */
    public static void glMultiDrawRangeElementArrayAPPLE(@NativeType("GLenum") int mode, @NativeType("GLuint") int start, @NativeType("GLuint") int end, @NativeType("GLint const *") int[] first, @NativeType("GLsizei const *") int[] count) {
        long __functionAddress = GL.getICD().glMultiDrawRangeElementArrayAPPLE;
        if (CHECKS) {
            check(__functionAddress);
            check(count, first.length);
        }
        callPPV(mode, start, end, first, count, first.length, __functionAddress);
    }

}
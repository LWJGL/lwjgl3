/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

public class ARBDrawInstanced {

    static { GL.initialize(); }

    protected ARBDrawInstanced() {
        throw new UnsupportedOperationException();
    }

    // --- [ glDrawArraysInstancedARB ] ---

    /** {@code void glDrawArraysInstancedARB(GLenum mode, GLint first, GLsizei count, GLsizei primcount)} */
    public static native void glDrawArraysInstancedARB(@NativeType("GLenum") int mode, @NativeType("GLint") int first, @NativeType("GLsizei") int count, @NativeType("GLsizei") int primcount);

    // --- [ glDrawElementsInstancedARB ] ---

    /** {@code void glDrawElementsInstancedARB(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount)} */
    public static native void nglDrawElementsInstancedARB(int mode, int count, int type, long indices, int primcount);

    /** {@code void glDrawElementsInstancedARB(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount)} */
    public static void glDrawElementsInstancedARB(@NativeType("GLenum") int mode, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices, @NativeType("GLsizei") int primcount) {
        nglDrawElementsInstancedARB(mode, count, type, indices, primcount);
    }

    /** {@code void glDrawElementsInstancedARB(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount)} */
    public static void glDrawElementsInstancedARB(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int primcount) {
        nglDrawElementsInstancedARB(mode, indices.remaining() >> GLChecks.typeToByteShift(type), type, memAddress(indices), primcount);
    }

    /** {@code void glDrawElementsInstancedARB(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount)} */
    public static void glDrawElementsInstancedARB(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int primcount) {
        nglDrawElementsInstancedARB(mode, indices.remaining(), GL11.GL_UNSIGNED_BYTE, memAddress(indices), primcount);
    }

    /** {@code void glDrawElementsInstancedARB(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount)} */
    public static void glDrawElementsInstancedARB(@NativeType("GLenum") int mode, @NativeType("void const *") ShortBuffer indices, @NativeType("GLsizei") int primcount) {
        nglDrawElementsInstancedARB(mode, indices.remaining(), GL11.GL_UNSIGNED_SHORT, memAddress(indices), primcount);
    }

    /** {@code void glDrawElementsInstancedARB(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount)} */
    public static void glDrawElementsInstancedARB(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indices, @NativeType("GLsizei") int primcount) {
        nglDrawElementsInstancedARB(mode, indices.remaining(), GL11.GL_UNSIGNED_INT, memAddress(indices), primcount);
    }

}
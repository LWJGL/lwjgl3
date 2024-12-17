/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class OESDrawElementsBaseVertex {

    static { GLES.initialize(); }

    protected OESDrawElementsBaseVertex() {
        throw new UnsupportedOperationException();
    }

    // --- [ glDrawElementsBaseVertexOES ] ---

    /** {@code void glDrawElementsBaseVertexOES(GLenum mode, GLsizei count, GLenum type, void const * indices, GLint basevertex)} */
    public static native void nglDrawElementsBaseVertexOES(int mode, int count, int type, long indices, int basevertex);

    /** {@code void glDrawElementsBaseVertexOES(GLenum mode, GLsizei count, GLenum type, void const * indices, GLint basevertex)} */
    public static void glDrawElementsBaseVertexOES(@NativeType("GLenum") int mode, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices, @NativeType("GLint") int basevertex) {
        nglDrawElementsBaseVertexOES(mode, count, type, indices, basevertex);
    }

    /** {@code void glDrawElementsBaseVertexOES(GLenum mode, GLsizei count, GLenum type, void const * indices, GLint basevertex)} */
    public static void glDrawElementsBaseVertexOES(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices, @NativeType("GLint") int basevertex) {
        nglDrawElementsBaseVertexOES(mode, indices.remaining() >> GLESChecks.typeToByteShift(type), type, memAddress(indices), basevertex);
    }

    /** {@code void glDrawElementsBaseVertexOES(GLenum mode, GLsizei count, GLenum type, void const * indices, GLint basevertex)} */
    public static void glDrawElementsBaseVertexOES(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indices, @NativeType("GLint") int basevertex) {
        nglDrawElementsBaseVertexOES(mode, indices.remaining(), GLES20.GL_UNSIGNED_BYTE, memAddress(indices), basevertex);
    }

    /** {@code void glDrawElementsBaseVertexOES(GLenum mode, GLsizei count, GLenum type, void const * indices, GLint basevertex)} */
    public static void glDrawElementsBaseVertexOES(@NativeType("GLenum") int mode, @NativeType("void const *") ShortBuffer indices, @NativeType("GLint") int basevertex) {
        nglDrawElementsBaseVertexOES(mode, indices.remaining(), GLES20.GL_UNSIGNED_SHORT, memAddress(indices), basevertex);
    }

    /** {@code void glDrawElementsBaseVertexOES(GLenum mode, GLsizei count, GLenum type, void const * indices, GLint basevertex)} */
    public static void glDrawElementsBaseVertexOES(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indices, @NativeType("GLint") int basevertex) {
        nglDrawElementsBaseVertexOES(mode, indices.remaining(), GLES20.GL_UNSIGNED_INT, memAddress(indices), basevertex);
    }

    // --- [ glDrawRangeElementsBaseVertexOES ] ---

    /** {@code void glDrawRangeElementsBaseVertexOES(GLenum mode, GLuint start, GLuint end, GLsizei count, GLenum type, void const * indices, GLint basevertex)} */
    public static native void nglDrawRangeElementsBaseVertexOES(int mode, int start, int end, int count, int type, long indices, int basevertex);

    /** {@code void glDrawRangeElementsBaseVertexOES(GLenum mode, GLuint start, GLuint end, GLsizei count, GLenum type, void const * indices, GLint basevertex)} */
    public static void glDrawRangeElementsBaseVertexOES(@NativeType("GLenum") int mode, @NativeType("GLuint") int start, @NativeType("GLuint") int end, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices, @NativeType("GLint") int basevertex) {
        nglDrawRangeElementsBaseVertexOES(mode, start, end, count, type, indices, basevertex);
    }

    /** {@code void glDrawRangeElementsBaseVertexOES(GLenum mode, GLuint start, GLuint end, GLsizei count, GLenum type, void const * indices, GLint basevertex)} */
    public static void glDrawRangeElementsBaseVertexOES(@NativeType("GLenum") int mode, @NativeType("GLuint") int start, @NativeType("GLuint") int end, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices, @NativeType("GLint") int basevertex) {
        nglDrawRangeElementsBaseVertexOES(mode, start, end, indices.remaining() >> GLESChecks.typeToByteShift(type), type, memAddress(indices), basevertex);
    }

    /** {@code void glDrawRangeElementsBaseVertexOES(GLenum mode, GLuint start, GLuint end, GLsizei count, GLenum type, void const * indices, GLint basevertex)} */
    public static void glDrawRangeElementsBaseVertexOES(@NativeType("GLenum") int mode, @NativeType("GLuint") int start, @NativeType("GLuint") int end, @NativeType("void const *") ByteBuffer indices, @NativeType("GLint") int basevertex) {
        nglDrawRangeElementsBaseVertexOES(mode, start, end, indices.remaining(), GLES20.GL_UNSIGNED_BYTE, memAddress(indices), basevertex);
    }

    /** {@code void glDrawRangeElementsBaseVertexOES(GLenum mode, GLuint start, GLuint end, GLsizei count, GLenum type, void const * indices, GLint basevertex)} */
    public static void glDrawRangeElementsBaseVertexOES(@NativeType("GLenum") int mode, @NativeType("GLuint") int start, @NativeType("GLuint") int end, @NativeType("void const *") ShortBuffer indices, @NativeType("GLint") int basevertex) {
        nglDrawRangeElementsBaseVertexOES(mode, start, end, indices.remaining(), GLES20.GL_UNSIGNED_SHORT, memAddress(indices), basevertex);
    }

    /** {@code void glDrawRangeElementsBaseVertexOES(GLenum mode, GLuint start, GLuint end, GLsizei count, GLenum type, void const * indices, GLint basevertex)} */
    public static void glDrawRangeElementsBaseVertexOES(@NativeType("GLenum") int mode, @NativeType("GLuint") int start, @NativeType("GLuint") int end, @NativeType("void const *") IntBuffer indices, @NativeType("GLint") int basevertex) {
        nglDrawRangeElementsBaseVertexOES(mode, start, end, indices.remaining(), GLES20.GL_UNSIGNED_INT, memAddress(indices), basevertex);
    }

    // --- [ glDrawElementsInstancedBaseVertexOES ] ---

    /** {@code void glDrawElementsInstancedBaseVertexOES(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei instancecount, GLint basevertex)} */
    public static native void nglDrawElementsInstancedBaseVertexOES(int mode, int count, int type, long indices, int instancecount, int basevertex);

    /** {@code void glDrawElementsInstancedBaseVertexOES(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei instancecount, GLint basevertex)} */
    public static void glDrawElementsInstancedBaseVertexOES(@NativeType("GLenum") int mode, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices, @NativeType("GLsizei") int instancecount, @NativeType("GLint") int basevertex) {
        nglDrawElementsInstancedBaseVertexOES(mode, count, type, indices, instancecount, basevertex);
    }

    /** {@code void glDrawElementsInstancedBaseVertexOES(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei instancecount, GLint basevertex)} */
    public static void glDrawElementsInstancedBaseVertexOES(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int instancecount, @NativeType("GLint") int basevertex) {
        nglDrawElementsInstancedBaseVertexOES(mode, indices.remaining() >> GLESChecks.typeToByteShift(type), type, memAddress(indices), instancecount, basevertex);
    }

    /** {@code void glDrawElementsInstancedBaseVertexOES(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei instancecount, GLint basevertex)} */
    public static void glDrawElementsInstancedBaseVertexOES(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int instancecount, @NativeType("GLint") int basevertex) {
        nglDrawElementsInstancedBaseVertexOES(mode, indices.remaining(), GLES20.GL_UNSIGNED_BYTE, memAddress(indices), instancecount, basevertex);
    }

    /** {@code void glDrawElementsInstancedBaseVertexOES(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei instancecount, GLint basevertex)} */
    public static void glDrawElementsInstancedBaseVertexOES(@NativeType("GLenum") int mode, @NativeType("void const *") ShortBuffer indices, @NativeType("GLsizei") int instancecount, @NativeType("GLint") int basevertex) {
        nglDrawElementsInstancedBaseVertexOES(mode, indices.remaining(), GLES20.GL_UNSIGNED_SHORT, memAddress(indices), instancecount, basevertex);
    }

    /** {@code void glDrawElementsInstancedBaseVertexOES(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei instancecount, GLint basevertex)} */
    public static void glDrawElementsInstancedBaseVertexOES(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indices, @NativeType("GLsizei") int instancecount, @NativeType("GLint") int basevertex) {
        nglDrawElementsInstancedBaseVertexOES(mode, indices.remaining(), GLES20.GL_UNSIGNED_INT, memAddress(indices), instancecount, basevertex);
    }

    // --- [ glMultiDrawElementsBaseVertexOES ] ---

    /** {@code void glMultiDrawElementsBaseVertexOES(GLenum mode, GLsizei const * count, GLenum type, void const * const * indices, GLsizei drawcount, GLint const * basevertex)} */
    public static native void nglMultiDrawElementsBaseVertexOES(int mode, long count, int type, long indices, int drawcount, long basevertex);

    /** {@code void glMultiDrawElementsBaseVertexOES(GLenum mode, GLsizei const * count, GLenum type, void const * const * indices, GLsizei drawcount, GLint const * basevertex)} */
    public static void glMultiDrawElementsBaseVertexOES(@NativeType("GLenum") int mode, @NativeType("GLsizei const *") IntBuffer count, @NativeType("GLenum") int type, @NativeType("void const * const *") PointerBuffer indices, @NativeType("GLint const *") IntBuffer basevertex) {
        if (CHECKS) {
            check(indices, count.remaining());
            check(basevertex, count.remaining());
        }
        nglMultiDrawElementsBaseVertexOES(mode, memAddress(count), type, memAddress(indices), count.remaining(), memAddress(basevertex));
    }

    /** {@code void glMultiDrawElementsBaseVertexOES(GLenum mode, GLsizei const * count, GLenum type, void const * const * indices, GLsizei drawcount, GLint const * basevertex)} */
    public static void glMultiDrawElementsBaseVertexOES(@NativeType("GLenum") int mode, @NativeType("GLsizei const *") int[] count, @NativeType("GLenum") int type, @NativeType("void const * const *") PointerBuffer indices, @NativeType("GLint const *") int[] basevertex) {
        long __functionAddress = GLES.getICD().glMultiDrawElementsBaseVertexOES;
        if (CHECKS) {
            check(__functionAddress);
            check(indices, count.length);
            check(basevertex, count.length);
        }
        callPPPV(mode, count, type, memAddress(indices), count.length, basevertex, __functionAddress);
    }

}
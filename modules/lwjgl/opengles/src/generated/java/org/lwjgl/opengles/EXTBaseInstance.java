/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

public class EXTBaseInstance {

    static { GLES.initialize(); }

    protected EXTBaseInstance() {
        throw new UnsupportedOperationException();
    }

    // --- [ glDrawArraysInstancedBaseInstanceEXT ] ---

    /** {@code void glDrawArraysInstancedBaseInstanceEXT(GLenum mode, GLint first, GLsizei count, GLsizei instancecount, GLuint baseinstance)} */
    public static native void glDrawArraysInstancedBaseInstanceEXT(@NativeType("GLenum") int mode, @NativeType("GLint") int first, @NativeType("GLsizei") int count, @NativeType("GLsizei") int instancecount, @NativeType("GLuint") int baseinstance);

    // --- [ glDrawElementsInstancedBaseInstanceEXT ] ---

    /** {@code void glDrawElementsInstancedBaseInstanceEXT(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei instancecount, GLuint baseinstance)} */
    public static native void nglDrawElementsInstancedBaseInstanceEXT(int mode, int count, int type, long indices, int instancecount, int baseinstance);

    /** {@code void glDrawElementsInstancedBaseInstanceEXT(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei instancecount, GLuint baseinstance)} */
    public static void glDrawElementsInstancedBaseInstanceEXT(@NativeType("GLenum") int mode, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices, @NativeType("GLsizei") int instancecount, @NativeType("GLuint") int baseinstance) {
        nglDrawElementsInstancedBaseInstanceEXT(mode, count, type, indices, instancecount, baseinstance);
    }

    /** {@code void glDrawElementsInstancedBaseInstanceEXT(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei instancecount, GLuint baseinstance)} */
    public static void glDrawElementsInstancedBaseInstanceEXT(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int instancecount, @NativeType("GLuint") int baseinstance) {
        nglDrawElementsInstancedBaseInstanceEXT(mode, indices.remaining() >> GLESChecks.typeToByteShift(type), type, memAddress(indices), instancecount, baseinstance);
    }

    /** {@code void glDrawElementsInstancedBaseInstanceEXT(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei instancecount, GLuint baseinstance)} */
    public static void glDrawElementsInstancedBaseInstanceEXT(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int instancecount, @NativeType("GLuint") int baseinstance) {
        nglDrawElementsInstancedBaseInstanceEXT(mode, indices.remaining(), GLES20.GL_UNSIGNED_BYTE, memAddress(indices), instancecount, baseinstance);
    }

    /** {@code void glDrawElementsInstancedBaseInstanceEXT(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei instancecount, GLuint baseinstance)} */
    public static void glDrawElementsInstancedBaseInstanceEXT(@NativeType("GLenum") int mode, @NativeType("void const *") ShortBuffer indices, @NativeType("GLsizei") int instancecount, @NativeType("GLuint") int baseinstance) {
        nglDrawElementsInstancedBaseInstanceEXT(mode, indices.remaining(), GLES20.GL_UNSIGNED_SHORT, memAddress(indices), instancecount, baseinstance);
    }

    /** {@code void glDrawElementsInstancedBaseInstanceEXT(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei instancecount, GLuint baseinstance)} */
    public static void glDrawElementsInstancedBaseInstanceEXT(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indices, @NativeType("GLsizei") int instancecount, @NativeType("GLuint") int baseinstance) {
        nglDrawElementsInstancedBaseInstanceEXT(mode, indices.remaining(), GLES20.GL_UNSIGNED_INT, memAddress(indices), instancecount, baseinstance);
    }

    // --- [ glDrawElementsInstancedBaseVertexBaseInstanceEXT ] ---

    /** {@code void glDrawElementsInstancedBaseVertexBaseInstanceEXT(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei instancecount, GLint basevertex, GLuint baseinstance)} */
    public static native void nglDrawElementsInstancedBaseVertexBaseInstanceEXT(int mode, int count, int type, long indices, int instancecount, int basevertex, int baseinstance);

    /** {@code void glDrawElementsInstancedBaseVertexBaseInstanceEXT(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei instancecount, GLint basevertex, GLuint baseinstance)} */
    public static void glDrawElementsInstancedBaseVertexBaseInstanceEXT(@NativeType("GLenum") int mode, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices, @NativeType("GLsizei") int instancecount, @NativeType("GLint") int basevertex, @NativeType("GLuint") int baseinstance) {
        nglDrawElementsInstancedBaseVertexBaseInstanceEXT(mode, count, type, indices, instancecount, basevertex, baseinstance);
    }

    /** {@code void glDrawElementsInstancedBaseVertexBaseInstanceEXT(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei instancecount, GLint basevertex, GLuint baseinstance)} */
    public static void glDrawElementsInstancedBaseVertexBaseInstanceEXT(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int instancecount, @NativeType("GLint") int basevertex, @NativeType("GLuint") int baseinstance) {
        nglDrawElementsInstancedBaseVertexBaseInstanceEXT(mode, indices.remaining() >> GLESChecks.typeToByteShift(type), type, memAddress(indices), instancecount, basevertex, baseinstance);
    }

    /** {@code void glDrawElementsInstancedBaseVertexBaseInstanceEXT(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei instancecount, GLint basevertex, GLuint baseinstance)} */
    public static void glDrawElementsInstancedBaseVertexBaseInstanceEXT(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int instancecount, @NativeType("GLint") int basevertex, @NativeType("GLuint") int baseinstance) {
        nglDrawElementsInstancedBaseVertexBaseInstanceEXT(mode, indices.remaining(), GLES20.GL_UNSIGNED_BYTE, memAddress(indices), instancecount, basevertex, baseinstance);
    }

    /** {@code void glDrawElementsInstancedBaseVertexBaseInstanceEXT(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei instancecount, GLint basevertex, GLuint baseinstance)} */
    public static void glDrawElementsInstancedBaseVertexBaseInstanceEXT(@NativeType("GLenum") int mode, @NativeType("void const *") ShortBuffer indices, @NativeType("GLsizei") int instancecount, @NativeType("GLint") int basevertex, @NativeType("GLuint") int baseinstance) {
        nglDrawElementsInstancedBaseVertexBaseInstanceEXT(mode, indices.remaining(), GLES20.GL_UNSIGNED_SHORT, memAddress(indices), instancecount, basevertex, baseinstance);
    }

    /** {@code void glDrawElementsInstancedBaseVertexBaseInstanceEXT(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei instancecount, GLint basevertex, GLuint baseinstance)} */
    public static void glDrawElementsInstancedBaseVertexBaseInstanceEXT(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indices, @NativeType("GLsizei") int instancecount, @NativeType("GLint") int basevertex, @NativeType("GLuint") int baseinstance) {
        nglDrawElementsInstancedBaseVertexBaseInstanceEXT(mode, indices.remaining(), GLES20.GL_UNSIGNED_INT, memAddress(indices), instancecount, basevertex, baseinstance);
    }

}
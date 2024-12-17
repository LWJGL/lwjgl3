/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

public class ARBBaseInstance {

    static { GL.initialize(); }

    protected ARBBaseInstance() {
        throw new UnsupportedOperationException();
    }

    // --- [ glDrawArraysInstancedBaseInstance ] ---

    /** {@code void glDrawArraysInstancedBaseInstance(GLenum mode, GLint first, GLsizei count, GLsizei primcount, GLuint baseinstance)} */
    public static void glDrawArraysInstancedBaseInstance(@NativeType("GLenum") int mode, @NativeType("GLint") int first, @NativeType("GLsizei") int count, @NativeType("GLsizei") int primcount, @NativeType("GLuint") int baseinstance) {
        GL42C.glDrawArraysInstancedBaseInstance(mode, first, count, primcount, baseinstance);
    }

    // --- [ glDrawElementsInstancedBaseInstance ] ---

    /** {@code void glDrawElementsInstancedBaseInstance(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount, GLuint baseinstance)} */
    public static void nglDrawElementsInstancedBaseInstance(int mode, int count, int type, long indices, int primcount, int baseinstance) {
        GL42C.nglDrawElementsInstancedBaseInstance(mode, count, type, indices, primcount, baseinstance);
    }

    /** {@code void glDrawElementsInstancedBaseInstance(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount, GLuint baseinstance)} */
    public static void glDrawElementsInstancedBaseInstance(@NativeType("GLenum") int mode, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices, @NativeType("GLsizei") int primcount, @NativeType("GLuint") int baseinstance) {
        GL42C.glDrawElementsInstancedBaseInstance(mode, count, type, indices, primcount, baseinstance);
    }

    /** {@code void glDrawElementsInstancedBaseInstance(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount, GLuint baseinstance)} */
    public static void glDrawElementsInstancedBaseInstance(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int primcount, @NativeType("GLuint") int baseinstance) {
        GL42C.glDrawElementsInstancedBaseInstance(mode, type, indices, primcount, baseinstance);
    }

    /** {@code void glDrawElementsInstancedBaseInstance(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount, GLuint baseinstance)} */
    public static void glDrawElementsInstancedBaseInstance(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int primcount, @NativeType("GLuint") int baseinstance) {
        GL42C.glDrawElementsInstancedBaseInstance(mode, indices, primcount, baseinstance);
    }

    /** {@code void glDrawElementsInstancedBaseInstance(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount, GLuint baseinstance)} */
    public static void glDrawElementsInstancedBaseInstance(@NativeType("GLenum") int mode, @NativeType("void const *") ShortBuffer indices, @NativeType("GLsizei") int primcount, @NativeType("GLuint") int baseinstance) {
        GL42C.glDrawElementsInstancedBaseInstance(mode, indices, primcount, baseinstance);
    }

    /** {@code void glDrawElementsInstancedBaseInstance(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount, GLuint baseinstance)} */
    public static void glDrawElementsInstancedBaseInstance(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indices, @NativeType("GLsizei") int primcount, @NativeType("GLuint") int baseinstance) {
        GL42C.glDrawElementsInstancedBaseInstance(mode, indices, primcount, baseinstance);
    }

    // --- [ glDrawElementsInstancedBaseVertexBaseInstance ] ---

    /** {@code void glDrawElementsInstancedBaseVertexBaseInstance(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount, GLint basevertex, GLuint baseinstance)} */
    public static void nglDrawElementsInstancedBaseVertexBaseInstance(int mode, int count, int type, long indices, int primcount, int basevertex, int baseinstance) {
        GL42C.nglDrawElementsInstancedBaseVertexBaseInstance(mode, count, type, indices, primcount, basevertex, baseinstance);
    }

    /** {@code void glDrawElementsInstancedBaseVertexBaseInstance(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount, GLint basevertex, GLuint baseinstance)} */
    public static void glDrawElementsInstancedBaseVertexBaseInstance(@NativeType("GLenum") int mode, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices, @NativeType("GLsizei") int primcount, @NativeType("GLint") int basevertex, @NativeType("GLuint") int baseinstance) {
        GL42C.glDrawElementsInstancedBaseVertexBaseInstance(mode, count, type, indices, primcount, basevertex, baseinstance);
    }

    /** {@code void glDrawElementsInstancedBaseVertexBaseInstance(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount, GLint basevertex, GLuint baseinstance)} */
    public static void glDrawElementsInstancedBaseVertexBaseInstance(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int primcount, @NativeType("GLint") int basevertex, @NativeType("GLuint") int baseinstance) {
        GL42C.glDrawElementsInstancedBaseVertexBaseInstance(mode, type, indices, primcount, basevertex, baseinstance);
    }

    /** {@code void glDrawElementsInstancedBaseVertexBaseInstance(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount, GLint basevertex, GLuint baseinstance)} */
    public static void glDrawElementsInstancedBaseVertexBaseInstance(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int primcount, @NativeType("GLint") int basevertex, @NativeType("GLuint") int baseinstance) {
        GL42C.glDrawElementsInstancedBaseVertexBaseInstance(mode, indices, primcount, basevertex, baseinstance);
    }

    /** {@code void glDrawElementsInstancedBaseVertexBaseInstance(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount, GLint basevertex, GLuint baseinstance)} */
    public static void glDrawElementsInstancedBaseVertexBaseInstance(@NativeType("GLenum") int mode, @NativeType("void const *") ShortBuffer indices, @NativeType("GLsizei") int primcount, @NativeType("GLint") int basevertex, @NativeType("GLuint") int baseinstance) {
        GL42C.glDrawElementsInstancedBaseVertexBaseInstance(mode, indices, primcount, basevertex, baseinstance);
    }

    /** {@code void glDrawElementsInstancedBaseVertexBaseInstance(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei primcount, GLint basevertex, GLuint baseinstance)} */
    public static void glDrawElementsInstancedBaseVertexBaseInstance(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indices, @NativeType("GLsizei") int primcount, @NativeType("GLint") int basevertex, @NativeType("GLuint") int baseinstance) {
        GL42C.glDrawElementsInstancedBaseVertexBaseInstance(mode, indices, primcount, basevertex, baseinstance);
    }

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

public class ARBMultiBind {

    static { GL.initialize(); }

    protected ARBMultiBind() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBindBuffersBase ] ---

    /** {@code void glBindBuffersBase(GLenum target, GLuint first, GLsizei count, GLuint const * buffers)} */
    public static void nglBindBuffersBase(int target, int first, int count, long buffers) {
        GL44C.nglBindBuffersBase(target, first, count, buffers);
    }

    /** {@code void glBindBuffersBase(GLenum target, GLuint first, GLsizei count, GLuint const * buffers)} */
    public static void glBindBuffersBase(@NativeType("GLenum") int target, @NativeType("GLuint") int first, @NativeType("GLuint const *") @Nullable IntBuffer buffers) {
        GL44C.glBindBuffersBase(target, first, buffers);
    }

    // --- [ glBindBuffersRange ] ---

    /** {@code void glBindBuffersRange(GLenum target, GLuint first, GLsizei count, GLuint const * buffers, GLintptr const * offsets, GLsizeiptr const * sizes)} */
    public static void nglBindBuffersRange(int target, int first, int count, long buffers, long offsets, long sizes) {
        GL44C.nglBindBuffersRange(target, first, count, buffers, offsets, sizes);
    }

    /** {@code void glBindBuffersRange(GLenum target, GLuint first, GLsizei count, GLuint const * buffers, GLintptr const * offsets, GLsizeiptr const * sizes)} */
    public static void glBindBuffersRange(@NativeType("GLenum") int target, @NativeType("GLuint") int first, @NativeType("GLuint const *") @Nullable IntBuffer buffers, @NativeType("GLintptr const *") @Nullable PointerBuffer offsets, @NativeType("GLsizeiptr const *") @Nullable PointerBuffer sizes) {
        GL44C.glBindBuffersRange(target, first, buffers, offsets, sizes);
    }

    // --- [ glBindTextures ] ---

    /** {@code void glBindTextures(GLuint first, GLsizei count, GLuint const * textures)} */
    public static void nglBindTextures(int first, int count, long textures) {
        GL44C.nglBindTextures(first, count, textures);
    }

    /** {@code void glBindTextures(GLuint first, GLsizei count, GLuint const * textures)} */
    public static void glBindTextures(@NativeType("GLuint") int first, @NativeType("GLuint const *") @Nullable IntBuffer textures) {
        GL44C.glBindTextures(first, textures);
    }

    // --- [ glBindSamplers ] ---

    /** {@code void glBindSamplers(GLuint first, GLsizei count, GLuint const * samplers)} */
    public static void nglBindSamplers(int first, int count, long samplers) {
        GL44C.nglBindSamplers(first, count, samplers);
    }

    /** {@code void glBindSamplers(GLuint first, GLsizei count, GLuint const * samplers)} */
    public static void glBindSamplers(@NativeType("GLuint") int first, @NativeType("GLuint const *") @Nullable IntBuffer samplers) {
        GL44C.glBindSamplers(first, samplers);
    }

    // --- [ glBindImageTextures ] ---

    /** {@code void glBindImageTextures(GLuint first, GLsizei count, GLuint const * textures)} */
    public static void nglBindImageTextures(int first, int count, long textures) {
        GL44C.nglBindImageTextures(first, count, textures);
    }

    /** {@code void glBindImageTextures(GLuint first, GLsizei count, GLuint const * textures)} */
    public static void glBindImageTextures(@NativeType("GLuint") int first, @NativeType("GLuint const *") @Nullable IntBuffer textures) {
        GL44C.glBindImageTextures(first, textures);
    }

    // --- [ glBindVertexBuffers ] ---

    /** {@code void glBindVertexBuffers(GLuint first, GLsizei count, GLuint const * buffers, GLintptr const * offsets, GLsizei const * strides)} */
    public static void nglBindVertexBuffers(int first, int count, long buffers, long offsets, long strides) {
        GL44C.nglBindVertexBuffers(first, count, buffers, offsets, strides);
    }

    /** {@code void glBindVertexBuffers(GLuint first, GLsizei count, GLuint const * buffers, GLintptr const * offsets, GLsizei const * strides)} */
    public static void glBindVertexBuffers(@NativeType("GLuint") int first, @NativeType("GLuint const *") @Nullable IntBuffer buffers, @NativeType("GLintptr const *") @Nullable PointerBuffer offsets, @NativeType("GLsizei const *") @Nullable IntBuffer strides) {
        GL44C.glBindVertexBuffers(first, buffers, offsets, strides);
    }

    /** {@code void glBindBuffersBase(GLenum target, GLuint first, GLsizei count, GLuint const * buffers)} */
    public static void glBindBuffersBase(@NativeType("GLenum") int target, @NativeType("GLuint") int first, @NativeType("GLuint const *") int @Nullable [] buffers) {
        GL44C.glBindBuffersBase(target, first, buffers);
    }

    /** {@code void glBindBuffersRange(GLenum target, GLuint first, GLsizei count, GLuint const * buffers, GLintptr const * offsets, GLsizeiptr const * sizes)} */
    public static void glBindBuffersRange(@NativeType("GLenum") int target, @NativeType("GLuint") int first, @NativeType("GLuint const *") int @Nullable [] buffers, @NativeType("GLintptr const *") @Nullable PointerBuffer offsets, @NativeType("GLsizeiptr const *") @Nullable PointerBuffer sizes) {
        GL44C.glBindBuffersRange(target, first, buffers, offsets, sizes);
    }

    /** {@code void glBindTextures(GLuint first, GLsizei count, GLuint const * textures)} */
    public static void glBindTextures(@NativeType("GLuint") int first, @NativeType("GLuint const *") int @Nullable [] textures) {
        GL44C.glBindTextures(first, textures);
    }

    /** {@code void glBindSamplers(GLuint first, GLsizei count, GLuint const * samplers)} */
    public static void glBindSamplers(@NativeType("GLuint") int first, @NativeType("GLuint const *") int @Nullable [] samplers) {
        GL44C.glBindSamplers(first, samplers);
    }

    /** {@code void glBindImageTextures(GLuint first, GLsizei count, GLuint const * textures)} */
    public static void glBindImageTextures(@NativeType("GLuint") int first, @NativeType("GLuint const *") int @Nullable [] textures) {
        GL44C.glBindImageTextures(first, textures);
    }

    /** {@code void glBindVertexBuffers(GLuint first, GLsizei count, GLuint const * buffers, GLintptr const * offsets, GLsizei const * strides)} */
    public static void glBindVertexBuffers(@NativeType("GLuint") int first, @NativeType("GLuint const *") int @Nullable [] buffers, @NativeType("GLintptr const *") @Nullable PointerBuffer offsets, @NativeType("GLsizei const *") int @Nullable [] strides) {
        GL44C.glBindVertexBuffers(first, buffers, offsets, strides);
    }

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

public class ARBInvalidateSubdata {

    static { GL.initialize(); }

    protected ARBInvalidateSubdata() {
        throw new UnsupportedOperationException();
    }

    // --- [ glInvalidateTexSubImage ] ---

    /** {@code void glInvalidateTexSubImage(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth)} */
    public static void glInvalidateTexSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth) {
        GL43C.glInvalidateTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth);
    }

    // --- [ glInvalidateTexImage ] ---

    /** {@code void glInvalidateTexImage(GLuint texture, GLint level)} */
    public static void glInvalidateTexImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level) {
        GL43C.glInvalidateTexImage(texture, level);
    }

    // --- [ glInvalidateBufferSubData ] ---

    /** {@code void glInvalidateBufferSubData(GLuint buffer, GLintptr offset, GLsizeiptr length)} */
    public static void glInvalidateBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long length) {
        GL43C.glInvalidateBufferSubData(buffer, offset, length);
    }

    // --- [ glInvalidateBufferData ] ---

    /** {@code void glInvalidateBufferData(GLuint buffer)} */
    public static void glInvalidateBufferData(@NativeType("GLuint") int buffer) {
        GL43C.glInvalidateBufferData(buffer);
    }

    // --- [ glInvalidateFramebuffer ] ---

    /** {@code void glInvalidateFramebuffer(GLenum target, GLsizei numAttachments, GLenum const * attachments)} */
    public static void nglInvalidateFramebuffer(int target, int numAttachments, long attachments) {
        GL43C.nglInvalidateFramebuffer(target, numAttachments, attachments);
    }

    /** {@code void glInvalidateFramebuffer(GLenum target, GLsizei numAttachments, GLenum const * attachments)} */
    public static void glInvalidateFramebuffer(@NativeType("GLenum") int target, @NativeType("GLenum const *") IntBuffer attachments) {
        GL43C.glInvalidateFramebuffer(target, attachments);
    }

    /** {@code void glInvalidateFramebuffer(GLenum target, GLsizei numAttachments, GLenum const * attachments)} */
    public static void glInvalidateFramebuffer(@NativeType("GLenum") int target, @NativeType("GLenum const *") int attachment) {
        GL43C.glInvalidateFramebuffer(target, attachment);
    }

    // --- [ glInvalidateSubFramebuffer ] ---

    /** {@code void glInvalidateSubFramebuffer(GLenum target, GLsizei numAttachments, GLenum const * attachments, GLint x, GLint y, GLsizei width, GLsizei height)} */
    public static void nglInvalidateSubFramebuffer(int target, int numAttachments, long attachments, int x, int y, int width, int height) {
        GL43C.nglInvalidateSubFramebuffer(target, numAttachments, attachments, x, y, width, height);
    }

    /** {@code void glInvalidateSubFramebuffer(GLenum target, GLsizei numAttachments, GLenum const * attachments, GLint x, GLint y, GLsizei width, GLsizei height)} */
    public static void glInvalidateSubFramebuffer(@NativeType("GLenum") int target, @NativeType("GLenum const *") IntBuffer attachments, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        GL43C.glInvalidateSubFramebuffer(target, attachments, x, y, width, height);
    }

    /** {@code void glInvalidateSubFramebuffer(GLenum target, GLsizei numAttachments, GLenum const * attachments, GLint x, GLint y, GLsizei width, GLsizei height)} */
    public static void glInvalidateSubFramebuffer(@NativeType("GLenum") int target, @NativeType("GLenum const *") int attachment, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        GL43C.glInvalidateSubFramebuffer(target, attachment, x, y, width, height);
    }

    /** {@code void glInvalidateFramebuffer(GLenum target, GLsizei numAttachments, GLenum const * attachments)} */
    public static void glInvalidateFramebuffer(@NativeType("GLenum") int target, @NativeType("GLenum const *") int[] attachments) {
        GL43C.glInvalidateFramebuffer(target, attachments);
    }

    /** {@code void glInvalidateSubFramebuffer(GLenum target, GLsizei numAttachments, GLenum const * attachments, GLint x, GLint y, GLsizei width, GLsizei height)} */
    public static void glInvalidateSubFramebuffer(@NativeType("GLenum") int target, @NativeType("GLenum const *") int[] attachments, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        GL43C.glInvalidateSubFramebuffer(target, attachments, x, y, width, height);
    }

}
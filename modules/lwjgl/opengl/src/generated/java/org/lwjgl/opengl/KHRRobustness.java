/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

public class KHRRobustness {

    static { GL.initialize(); }

    public static final int
        GL_NO_ERROR               = 0x0,
        GL_GUILTY_CONTEXT_RESET   = 0x8253,
        GL_INNOCENT_CONTEXT_RESET = 0x8254,
        GL_UNKNOWN_CONTEXT_RESET  = 0x8255;

    public static final int
        GL_CONTEXT_ROBUST_ACCESS       = 0x90F3,
        GL_RESET_NOTIFICATION_STRATEGY = 0x8256;

    public static final int
        GL_LOSE_CONTEXT_ON_RESET = 0x8252,
        GL_NO_RESET_NOTIFICATION = 0x8261;

    public static final int GL_CONTEXT_LOST = 0x507;

    protected KHRRobustness() {
        throw new UnsupportedOperationException();
    }

    // --- [ glGetGraphicsResetStatus ] ---

    /** {@code GLenum glGetGraphicsResetStatus(void)} */
    @NativeType("GLenum")
    public static int glGetGraphicsResetStatus() {
        return GL45C.glGetGraphicsResetStatus();
    }

    // --- [ glReadnPixels ] ---

    /** {@code void glReadnPixels(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void nglReadnPixels(int x, int y, int width, int height, int format, int type, int bufSize, long pixels) {
        GL45C.nglReadnPixels(x, y, width, height, format, type, bufSize, pixels);
    }

    /** {@code void glReadnPixels(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glReadnPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("GLsizei") int bufSize, @NativeType("void *") long pixels) {
        GL45C.glReadnPixels(x, y, width, height, format, type, bufSize, pixels);
    }

    /** {@code void glReadnPixels(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glReadnPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer pixels) {
        GL45C.glReadnPixels(x, y, width, height, format, type, pixels);
    }

    /** {@code void glReadnPixels(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glReadnPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ShortBuffer pixels) {
        GL45C.glReadnPixels(x, y, width, height, format, type, pixels);
    }

    /** {@code void glReadnPixels(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glReadnPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") IntBuffer pixels) {
        GL45C.glReadnPixels(x, y, width, height, format, type, pixels);
    }

    /** {@code void glReadnPixels(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glReadnPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") FloatBuffer pixels) {
        GL45C.glReadnPixels(x, y, width, height, format, type, pixels);
    }

    // --- [ glGetnUniformfv ] ---

    /** {@code void glGetnUniformfv(GLuint program, GLint location, GLsizei bufSize, GLfloat * params)} */
    public static void nglGetnUniformfv(int program, int location, int bufSize, long params) {
        GL45C.nglGetnUniformfv(program, location, bufSize, params);
    }

    /** {@code void glGetnUniformfv(GLuint program, GLint location, GLsizei bufSize, GLfloat * params)} */
    public static void glGetnUniformfv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat *") FloatBuffer params) {
        GL45C.glGetnUniformfv(program, location, params);
    }

    /** {@code void glGetnUniformfv(GLuint program, GLint location, GLsizei bufSize, GLfloat * params)} */
    @NativeType("void")
    public static float glGetnUniformf(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        return GL45C.glGetnUniformf(program, location);
    }

    // --- [ glGetnUniformiv ] ---

    /** {@code void glGetnUniformiv(GLuint program, GLint location, GLsizei bufSize, GLint * params)} */
    public static void nglGetnUniformiv(int program, int location, int bufSize, long params) {
        GL45C.nglGetnUniformiv(program, location, bufSize, params);
    }

    /** {@code void glGetnUniformiv(GLuint program, GLint location, GLsizei bufSize, GLint * params)} */
    public static void glGetnUniformiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint *") IntBuffer params) {
        GL45C.glGetnUniformiv(program, location, params);
    }

    /** {@code void glGetnUniformiv(GLuint program, GLint location, GLsizei bufSize, GLint * params)} */
    @NativeType("void")
    public static int glGetnUniformi(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        return GL45C.glGetnUniformi(program, location);
    }

    // --- [ glGetnUniformuiv ] ---

    /** {@code void glGetnUniformuiv(GLuint program, GLint location, GLsizei bufSize, GLuint * params)} */
    public static void nglGetnUniformuiv(int program, int location, int bufSize, long params) {
        GL45C.nglGetnUniformuiv(program, location, bufSize, params);
    }

    /** {@code void glGetnUniformuiv(GLuint program, GLint location, GLsizei bufSize, GLuint * params)} */
    public static void glGetnUniformuiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint *") IntBuffer params) {
        GL45C.glGetnUniformuiv(program, location, params);
    }

    /** {@code void glGetnUniformuiv(GLuint program, GLint location, GLsizei bufSize, GLuint * params)} */
    @NativeType("void")
    public static int glGetnUniformui(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        return GL45C.glGetnUniformui(program, location);
    }

    /** {@code void glReadnPixels(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glReadnPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") short[] pixels) {
        GL45C.glReadnPixels(x, y, width, height, format, type, pixels);
    }

    /** {@code void glReadnPixels(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glReadnPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") int[] pixels) {
        GL45C.glReadnPixels(x, y, width, height, format, type, pixels);
    }

    /** {@code void glReadnPixels(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, GLsizei bufSize, void * pixels)} */
    public static void glReadnPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") float[] pixels) {
        GL45C.glReadnPixels(x, y, width, height, format, type, pixels);
    }

    /** {@code void glGetnUniformfv(GLuint program, GLint location, GLsizei bufSize, GLfloat * params)} */
    public static void glGetnUniformfv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat *") float[] params) {
        GL45C.glGetnUniformfv(program, location, params);
    }

    /** {@code void glGetnUniformiv(GLuint program, GLint location, GLsizei bufSize, GLint * params)} */
    public static void glGetnUniformiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint *") int[] params) {
        GL45C.glGetnUniformiv(program, location, params);
    }

    /** {@code void glGetnUniformuiv(GLuint program, GLint location, GLsizei bufSize, GLuint * params)} */
    public static void glGetnUniformuiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint *") int[] params) {
        GL45C.glGetnUniformuiv(program, location, params);
    }

}
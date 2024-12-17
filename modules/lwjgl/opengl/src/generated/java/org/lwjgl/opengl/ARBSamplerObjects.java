/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

public class ARBSamplerObjects {

    static { GL.initialize(); }

    public static final int GL_SAMPLER_BINDING = 0x8919;

    protected ARBSamplerObjects() {
        throw new UnsupportedOperationException();
    }

    // --- [ glGenSamplers ] ---

    /** {@code void glGenSamplers(GLsizei count, GLuint * samplers)} */
    public static void nglGenSamplers(int count, long samplers) {
        GL33C.nglGenSamplers(count, samplers);
    }

    /** {@code void glGenSamplers(GLsizei count, GLuint * samplers)} */
    public static void glGenSamplers(@NativeType("GLuint *") IntBuffer samplers) {
        GL33C.glGenSamplers(samplers);
    }

    /** {@code void glGenSamplers(GLsizei count, GLuint * samplers)} */
    @NativeType("void")
    public static int glGenSamplers() {
        return GL33C.glGenSamplers();
    }

    // --- [ glDeleteSamplers ] ---

    /** {@code void glDeleteSamplers(GLsizei count, GLuint const * samplers)} */
    public static void nglDeleteSamplers(int count, long samplers) {
        GL33C.nglDeleteSamplers(count, samplers);
    }

    /** {@code void glDeleteSamplers(GLsizei count, GLuint const * samplers)} */
    public static void glDeleteSamplers(@NativeType("GLuint const *") IntBuffer samplers) {
        GL33C.glDeleteSamplers(samplers);
    }

    /** {@code void glDeleteSamplers(GLsizei count, GLuint const * samplers)} */
    public static void glDeleteSamplers(@NativeType("GLuint const *") int sampler) {
        GL33C.glDeleteSamplers(sampler);
    }

    // --- [ glIsSampler ] ---

    /** {@code GLboolean glIsSampler(GLuint sampler)} */
    @NativeType("GLboolean")
    public static boolean glIsSampler(@NativeType("GLuint") int sampler) {
        return GL33C.glIsSampler(sampler);
    }

    // --- [ glBindSampler ] ---

    /** {@code void glBindSampler(GLuint unit, GLuint sampler)} */
    public static void glBindSampler(@NativeType("GLuint") int unit, @NativeType("GLuint") int sampler) {
        GL33C.glBindSampler(unit, sampler);
    }

    // --- [ glSamplerParameteri ] ---

    /** {@code void glSamplerParameteri(GLuint sampler, GLenum pname, GLint param)} */
    public static void glSamplerParameteri(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint") int param) {
        GL33C.glSamplerParameteri(sampler, pname, param);
    }

    // --- [ glSamplerParameterf ] ---

    /** {@code void glSamplerParameterf(GLuint sampler, GLenum pname, GLfloat param)} */
    public static void glSamplerParameterf(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLfloat") float param) {
        GL33C.glSamplerParameterf(sampler, pname, param);
    }

    // --- [ glSamplerParameteriv ] ---

    /** {@code void glSamplerParameteriv(GLuint sampler, GLenum pname, GLint const * params)} */
    public static void nglSamplerParameteriv(int sampler, int pname, long params) {
        GL33C.nglSamplerParameteriv(sampler, pname, params);
    }

    /** {@code void glSamplerParameteriv(GLuint sampler, GLenum pname, GLint const * params)} */
    public static void glSamplerParameteriv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        GL33C.glSamplerParameteriv(sampler, pname, params);
    }

    // --- [ glSamplerParameterfv ] ---

    /** {@code void glSamplerParameterfv(GLuint sampler, GLenum pname, GLfloat const * params)} */
    public static void nglSamplerParameterfv(int sampler, int pname, long params) {
        GL33C.nglSamplerParameterfv(sampler, pname, params);
    }

    /** {@code void glSamplerParameterfv(GLuint sampler, GLenum pname, GLfloat const * params)} */
    public static void glSamplerParameterfv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer params) {
        GL33C.glSamplerParameterfv(sampler, pname, params);
    }

    // --- [ glSamplerParameterIiv ] ---

    /** {@code void glSamplerParameterIiv(GLuint sampler, GLenum pname, GLint const * params)} */
    public static void nglSamplerParameterIiv(int sampler, int pname, long params) {
        GL33C.nglSamplerParameterIiv(sampler, pname, params);
    }

    /** {@code void glSamplerParameterIiv(GLuint sampler, GLenum pname, GLint const * params)} */
    public static void glSamplerParameterIiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        GL33C.glSamplerParameterIiv(sampler, pname, params);
    }

    // --- [ glSamplerParameterIuiv ] ---

    /** {@code void glSamplerParameterIuiv(GLuint sampler, GLenum pname, GLuint const * params)} */
    public static void nglSamplerParameterIuiv(int sampler, int pname, long params) {
        GL33C.nglSamplerParameterIuiv(sampler, pname, params);
    }

    /** {@code void glSamplerParameterIuiv(GLuint sampler, GLenum pname, GLuint const * params)} */
    public static void glSamplerParameterIuiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLuint const *") IntBuffer params) {
        GL33C.glSamplerParameterIuiv(sampler, pname, params);
    }

    // --- [ glGetSamplerParameteriv ] ---

    /** {@code void glGetSamplerParameteriv(GLuint sampler, GLenum pname, GLint * params)} */
    public static void nglGetSamplerParameteriv(int sampler, int pname, long params) {
        GL33C.nglGetSamplerParameteriv(sampler, pname, params);
    }

    /** {@code void glGetSamplerParameteriv(GLuint sampler, GLenum pname, GLint * params)} */
    public static void glGetSamplerParameteriv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        GL33C.glGetSamplerParameteriv(sampler, pname, params);
    }

    /** {@code void glGetSamplerParameteriv(GLuint sampler, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetSamplerParameteri(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname) {
        return GL33C.glGetSamplerParameteri(sampler, pname);
    }

    // --- [ glGetSamplerParameterfv ] ---

    /** {@code void glGetSamplerParameterfv(GLuint sampler, GLenum pname, GLfloat * params)} */
    public static void nglGetSamplerParameterfv(int sampler, int pname, long params) {
        GL33C.nglGetSamplerParameterfv(sampler, pname, params);
    }

    /** {@code void glGetSamplerParameterfv(GLuint sampler, GLenum pname, GLfloat * params)} */
    public static void glGetSamplerParameterfv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        GL33C.glGetSamplerParameterfv(sampler, pname, params);
    }

    /** {@code void glGetSamplerParameterfv(GLuint sampler, GLenum pname, GLfloat * params)} */
    @NativeType("void")
    public static float glGetSamplerParameterf(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname) {
        return GL33C.glGetSamplerParameterf(sampler, pname);
    }

    // --- [ glGetSamplerParameterIiv ] ---

    /** {@code void glGetSamplerParameterIiv(GLuint sampler, GLenum pname, GLint * params)} */
    public static void nglGetSamplerParameterIiv(int sampler, int pname, long params) {
        GL33C.nglGetSamplerParameterIiv(sampler, pname, params);
    }

    /** {@code void glGetSamplerParameterIiv(GLuint sampler, GLenum pname, GLint * params)} */
    public static void glGetSamplerParameterIiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        GL33C.glGetSamplerParameterIiv(sampler, pname, params);
    }

    /** {@code void glGetSamplerParameterIiv(GLuint sampler, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetSamplerParameterIi(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname) {
        return GL33C.glGetSamplerParameterIi(sampler, pname);
    }

    // --- [ glGetSamplerParameterIuiv ] ---

    /** {@code void glGetSamplerParameterIuiv(GLuint sampler, GLenum pname, GLuint * params)} */
    public static void nglGetSamplerParameterIuiv(int sampler, int pname, long params) {
        GL33C.nglGetSamplerParameterIuiv(sampler, pname, params);
    }

    /** {@code void glGetSamplerParameterIuiv(GLuint sampler, GLenum pname, GLuint * params)} */
    public static void glGetSamplerParameterIuiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLuint *") IntBuffer params) {
        GL33C.glGetSamplerParameterIuiv(sampler, pname, params);
    }

    /** {@code void glGetSamplerParameterIuiv(GLuint sampler, GLenum pname, GLuint * params)} */
    @NativeType("void")
    public static int glGetSamplerParameterIui(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname) {
        return GL33C.glGetSamplerParameterIui(sampler, pname);
    }

    /** {@code void glGenSamplers(GLsizei count, GLuint * samplers)} */
    public static void glGenSamplers(@NativeType("GLuint *") int[] samplers) {
        GL33C.glGenSamplers(samplers);
    }

    /** {@code void glDeleteSamplers(GLsizei count, GLuint const * samplers)} */
    public static void glDeleteSamplers(@NativeType("GLuint const *") int[] samplers) {
        GL33C.glDeleteSamplers(samplers);
    }

    /** {@code void glSamplerParameteriv(GLuint sampler, GLenum pname, GLint const * params)} */
    public static void glSamplerParameteriv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        GL33C.glSamplerParameteriv(sampler, pname, params);
    }

    /** {@code void glSamplerParameterfv(GLuint sampler, GLenum pname, GLfloat const * params)} */
    public static void glSamplerParameterfv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") float[] params) {
        GL33C.glSamplerParameterfv(sampler, pname, params);
    }

    /** {@code void glSamplerParameterIiv(GLuint sampler, GLenum pname, GLint const * params)} */
    public static void glSamplerParameterIiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        GL33C.glSamplerParameterIiv(sampler, pname, params);
    }

    /** {@code void glSamplerParameterIuiv(GLuint sampler, GLenum pname, GLuint const * params)} */
    public static void glSamplerParameterIuiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLuint const *") int[] params) {
        GL33C.glSamplerParameterIuiv(sampler, pname, params);
    }

    /** {@code void glGetSamplerParameteriv(GLuint sampler, GLenum pname, GLint * params)} */
    public static void glGetSamplerParameteriv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        GL33C.glGetSamplerParameteriv(sampler, pname, params);
    }

    /** {@code void glGetSamplerParameterfv(GLuint sampler, GLenum pname, GLfloat * params)} */
    public static void glGetSamplerParameterfv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        GL33C.glGetSamplerParameterfv(sampler, pname, params);
    }

    /** {@code void glGetSamplerParameterIiv(GLuint sampler, GLenum pname, GLint * params)} */
    public static void glGetSamplerParameterIiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        GL33C.glGetSamplerParameterIiv(sampler, pname, params);
    }

    /** {@code void glGetSamplerParameterIuiv(GLuint sampler, GLenum pname, GLuint * params)} */
    public static void glGetSamplerParameterIuiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] params) {
        GL33C.glGetSamplerParameterIuiv(sampler, pname, params);
    }

}
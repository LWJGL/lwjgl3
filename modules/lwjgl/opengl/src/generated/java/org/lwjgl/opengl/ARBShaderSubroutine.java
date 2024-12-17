/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

public class ARBShaderSubroutine {

    static { GL.initialize(); }

    public static final int
        GL_ACTIVE_SUBROUTINES                   = 0x8DE5,
        GL_ACTIVE_SUBROUTINE_UNIFORMS           = 0x8DE6,
        GL_ACTIVE_SUBROUTINE_UNIFORM_LOCATIONS  = 0x8E47,
        GL_ACTIVE_SUBROUTINE_MAX_LENGTH         = 0x8E48,
        GL_ACTIVE_SUBROUTINE_UNIFORM_MAX_LENGTH = 0x8E49;

    public static final int
        GL_MAX_SUBROUTINES                  = 0x8DE7,
        GL_MAX_SUBROUTINE_UNIFORM_LOCATIONS = 0x8DE8;

    public static final int
        GL_NUM_COMPATIBLE_SUBROUTINES = 0x8E4A,
        GL_COMPATIBLE_SUBROUTINES     = 0x8E4B;

    protected ARBShaderSubroutine() {
        throw new UnsupportedOperationException();
    }

    // --- [ glGetSubroutineUniformLocation ] ---

    /** {@code GLint glGetSubroutineUniformLocation(GLuint program, GLenum shadertype, GLchar const * name)} */
    public static int nglGetSubroutineUniformLocation(int program, int shadertype, long name) {
        return GL40C.nglGetSubroutineUniformLocation(program, shadertype, name);
    }

    /** {@code GLint glGetSubroutineUniformLocation(GLuint program, GLenum shadertype, GLchar const * name)} */
    @NativeType("GLint")
    public static int glGetSubroutineUniformLocation(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLchar const *") ByteBuffer name) {
        return GL40C.glGetSubroutineUniformLocation(program, shadertype, name);
    }

    /** {@code GLint glGetSubroutineUniformLocation(GLuint program, GLenum shadertype, GLchar const * name)} */
    @NativeType("GLint")
    public static int glGetSubroutineUniformLocation(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLchar const *") CharSequence name) {
        return GL40C.glGetSubroutineUniformLocation(program, shadertype, name);
    }

    // --- [ glGetSubroutineIndex ] ---

    /** {@code GLuint glGetSubroutineIndex(GLuint program, GLenum shadertype, GLchar const * name)} */
    public static int nglGetSubroutineIndex(int program, int shadertype, long name) {
        return GL40C.nglGetSubroutineIndex(program, shadertype, name);
    }

    /** {@code GLuint glGetSubroutineIndex(GLuint program, GLenum shadertype, GLchar const * name)} */
    @NativeType("GLuint")
    public static int glGetSubroutineIndex(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLchar const *") ByteBuffer name) {
        return GL40C.glGetSubroutineIndex(program, shadertype, name);
    }

    /** {@code GLuint glGetSubroutineIndex(GLuint program, GLenum shadertype, GLchar const * name)} */
    @NativeType("GLuint")
    public static int glGetSubroutineIndex(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLchar const *") CharSequence name) {
        return GL40C.glGetSubroutineIndex(program, shadertype, name);
    }

    // --- [ glGetActiveSubroutineUniformiv ] ---

    /** {@code void glGetActiveSubroutineUniformiv(GLuint program, GLenum shadertype, GLuint index, GLenum pname, GLint * values)} */
    public static void nglGetActiveSubroutineUniformiv(int program, int shadertype, int index, int pname, long values) {
        GL40C.nglGetActiveSubroutineUniformiv(program, shadertype, index, pname, values);
    }

    /** {@code void glGetActiveSubroutineUniformiv(GLuint program, GLenum shadertype, GLuint index, GLenum pname, GLint * values)} */
    public static void glGetActiveSubroutineUniformiv(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer values) {
        GL40C.glGetActiveSubroutineUniformiv(program, shadertype, index, pname, values);
    }

    /** {@code void glGetActiveSubroutineUniformiv(GLuint program, GLenum shadertype, GLuint index, GLenum pname, GLint * values)} */
    @NativeType("void")
    public static int glGetActiveSubroutineUniformi(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        return GL40C.glGetActiveSubroutineUniformi(program, shadertype, index, pname);
    }

    // --- [ glGetActiveSubroutineUniformName ] ---

    /** {@code void glGetActiveSubroutineUniformName(GLuint program, GLenum shadertype, GLuint index, GLsizei bufsize, GLsizei * length, GLchar * name)} */
    public static void nglGetActiveSubroutineUniformName(int program, int shadertype, int index, int bufsize, long length, long name) {
        GL40C.nglGetActiveSubroutineUniformName(program, shadertype, index, bufsize, length, name);
    }

    /** {@code void glGetActiveSubroutineUniformName(GLuint program, GLenum shadertype, GLuint index, GLsizei bufsize, GLsizei * length, GLchar * name)} */
    public static void glGetActiveSubroutineUniformName(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLchar *") ByteBuffer name) {
        GL40C.glGetActiveSubroutineUniformName(program, shadertype, index, length, name);
    }

    /** {@code void glGetActiveSubroutineUniformName(GLuint program, GLenum shadertype, GLuint index, GLsizei bufsize, GLsizei * length, GLchar * name)} */
    @NativeType("void")
    public static String glGetActiveSubroutineUniformName(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index, @NativeType("GLsizei") int bufsize) {
        return GL40C.glGetActiveSubroutineUniformName(program, shadertype, index, bufsize);
    }

    /** {@code void glGetActiveSubroutineUniformName(GLuint program, GLenum shadertype, GLuint index, GLsizei bufsize, GLsizei * length, GLchar * name)} */
    @NativeType("void")
    public static String glGetActiveSubroutineUniformName(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index) {
        return glGetActiveSubroutineUniformName(program, shadertype, index, glGetActiveSubroutineUniformi(program, shadertype, index, GL31.GL_UNIFORM_NAME_LENGTH));
    }

    // --- [ glGetActiveSubroutineName ] ---

    /** {@code void glGetActiveSubroutineName(GLuint program, GLenum shadertype, GLuint index, GLsizei bufsize, GLsizei * length, GLchar * name)} */
    public static void nglGetActiveSubroutineName(int program, int shadertype, int index, int bufsize, long length, long name) {
        GL40C.nglGetActiveSubroutineName(program, shadertype, index, bufsize, length, name);
    }

    /** {@code void glGetActiveSubroutineName(GLuint program, GLenum shadertype, GLuint index, GLsizei bufsize, GLsizei * length, GLchar * name)} */
    public static void glGetActiveSubroutineName(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLchar *") ByteBuffer name) {
        GL40C.glGetActiveSubroutineName(program, shadertype, index, length, name);
    }

    /** {@code void glGetActiveSubroutineName(GLuint program, GLenum shadertype, GLuint index, GLsizei bufsize, GLsizei * length, GLchar * name)} */
    @NativeType("void")
    public static String glGetActiveSubroutineName(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index, @NativeType("GLsizei") int bufsize) {
        return GL40C.glGetActiveSubroutineName(program, shadertype, index, bufsize);
    }

    /** {@code void glGetActiveSubroutineName(GLuint program, GLenum shadertype, GLuint index, GLsizei bufsize, GLsizei * length, GLchar * name)} */
    @NativeType("void")
    public static String glGetActiveSubroutineName(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index) {
        return glGetActiveSubroutineName(program, shadertype, index, glGetProgramStagei(program, shadertype, GL_ACTIVE_SUBROUTINE_MAX_LENGTH));
    }

    // --- [ glUniformSubroutinesuiv ] ---

    /** {@code void glUniformSubroutinesuiv(GLenum shadertype, GLsizei count, GLuint const * indices)} */
    public static void nglUniformSubroutinesuiv(int shadertype, int count, long indices) {
        GL40C.nglUniformSubroutinesuiv(shadertype, count, indices);
    }

    /** {@code void glUniformSubroutinesuiv(GLenum shadertype, GLsizei count, GLuint const * indices)} */
    public static void glUniformSubroutinesuiv(@NativeType("GLenum") int shadertype, @NativeType("GLuint const *") IntBuffer indices) {
        GL40C.glUniformSubroutinesuiv(shadertype, indices);
    }

    /** {@code void glUniformSubroutinesuiv(GLenum shadertype, GLsizei count, GLuint const * indices)} */
    public static void glUniformSubroutinesui(@NativeType("GLenum") int shadertype, @NativeType("GLuint const *") int index) {
        GL40C.glUniformSubroutinesui(shadertype, index);
    }

    // --- [ glGetUniformSubroutineuiv ] ---

    /** {@code void glGetUniformSubroutineuiv(GLenum shadertype, GLint location, GLuint * params)} */
    public static void nglGetUniformSubroutineuiv(int shadertype, int location, long params) {
        GL40C.nglGetUniformSubroutineuiv(shadertype, location, params);
    }

    /** {@code void glGetUniformSubroutineuiv(GLenum shadertype, GLint location, GLuint * params)} */
    public static void glGetUniformSubroutineuiv(@NativeType("GLenum") int shadertype, @NativeType("GLint") int location, @NativeType("GLuint *") IntBuffer params) {
        GL40C.glGetUniformSubroutineuiv(shadertype, location, params);
    }

    /** {@code void glGetUniformSubroutineuiv(GLenum shadertype, GLint location, GLuint * params)} */
    @NativeType("void")
    public static int glGetUniformSubroutineui(@NativeType("GLenum") int shadertype, @NativeType("GLint") int location) {
        return GL40C.glGetUniformSubroutineui(shadertype, location);
    }

    // --- [ glGetProgramStageiv ] ---

    /** {@code void glGetProgramStageiv(GLuint program, GLenum shadertype, GLenum pname, GLint * values)} */
    public static void nglGetProgramStageiv(int program, int shadertype, int pname, long values) {
        GL40C.nglGetProgramStageiv(program, shadertype, pname, values);
    }

    /** {@code void glGetProgramStageiv(GLuint program, GLenum shadertype, GLenum pname, GLint * values)} */
    public static void glGetProgramStageiv(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer values) {
        GL40C.glGetProgramStageiv(program, shadertype, pname, values);
    }

    /** {@code void glGetProgramStageiv(GLuint program, GLenum shadertype, GLenum pname, GLint * values)} */
    @NativeType("void")
    public static int glGetProgramStagei(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLenum") int pname) {
        return GL40C.glGetProgramStagei(program, shadertype, pname);
    }

    /** {@code void glGetActiveSubroutineUniformiv(GLuint program, GLenum shadertype, GLuint index, GLenum pname, GLint * values)} */
    public static void glGetActiveSubroutineUniformiv(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] values) {
        GL40C.glGetActiveSubroutineUniformiv(program, shadertype, index, pname, values);
    }

    /** {@code void glGetActiveSubroutineUniformName(GLuint program, GLenum shadertype, GLuint index, GLsizei bufsize, GLsizei * length, GLchar * name)} */
    public static void glGetActiveSubroutineUniformName(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLchar *") ByteBuffer name) {
        GL40C.glGetActiveSubroutineUniformName(program, shadertype, index, length, name);
    }

    /** {@code void glGetActiveSubroutineName(GLuint program, GLenum shadertype, GLuint index, GLsizei bufsize, GLsizei * length, GLchar * name)} */
    public static void glGetActiveSubroutineName(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLchar *") ByteBuffer name) {
        GL40C.glGetActiveSubroutineName(program, shadertype, index, length, name);
    }

    /** {@code void glUniformSubroutinesuiv(GLenum shadertype, GLsizei count, GLuint const * indices)} */
    public static void glUniformSubroutinesuiv(@NativeType("GLenum") int shadertype, @NativeType("GLuint const *") int[] indices) {
        GL40C.glUniformSubroutinesuiv(shadertype, indices);
    }

    /** {@code void glGetUniformSubroutineuiv(GLenum shadertype, GLint location, GLuint * params)} */
    public static void glGetUniformSubroutineuiv(@NativeType("GLenum") int shadertype, @NativeType("GLint") int location, @NativeType("GLuint *") int[] params) {
        GL40C.glGetUniformSubroutineuiv(shadertype, location, params);
    }

    /** {@code void glGetProgramStageiv(GLuint program, GLenum shadertype, GLenum pname, GLint * values)} */
    public static void glGetProgramStageiv(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] values) {
        GL40C.glGetProgramStageiv(program, shadertype, pname, values);
    }

}
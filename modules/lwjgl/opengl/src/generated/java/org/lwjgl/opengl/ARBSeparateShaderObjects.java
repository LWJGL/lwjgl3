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

public class ARBSeparateShaderObjects {

    static { GL.initialize(); }

    public static final int
        GL_VERTEX_SHADER_BIT          = 0x1,
        GL_FRAGMENT_SHADER_BIT        = 0x2,
        GL_GEOMETRY_SHADER_BIT        = 0x4,
        GL_TESS_CONTROL_SHADER_BIT    = 0x8,
        GL_TESS_EVALUATION_SHADER_BIT = 0x10,
        GL_ALL_SHADER_BITS            = 0xFFFFFFFF;

    public static final int GL_PROGRAM_SEPARABLE = 0x8258;

    public static final int GL_ACTIVE_PROGRAM = 0x8259;

    public static final int GL_PROGRAM_PIPELINE_BINDING = 0x825A;

    protected ARBSeparateShaderObjects() {
        throw new UnsupportedOperationException();
    }

    // --- [ glUseProgramStages ] ---

    /** {@code void glUseProgramStages(GLuint pipeline, GLbitfield stages, GLuint program)} */
    public static void glUseProgramStages(@NativeType("GLuint") int pipeline, @NativeType("GLbitfield") int stages, @NativeType("GLuint") int program) {
        GL41C.glUseProgramStages(pipeline, stages, program);
    }

    // --- [ glActiveShaderProgram ] ---

    /** {@code void glActiveShaderProgram(GLuint pipeline, GLuint program)} */
    public static void glActiveShaderProgram(@NativeType("GLuint") int pipeline, @NativeType("GLuint") int program) {
        GL41C.glActiveShaderProgram(pipeline, program);
    }

    // --- [ glCreateShaderProgramv ] ---

    /** {@code GLuint glCreateShaderProgramv(GLenum type, GLsizei count, GLchar const * const * strings)} */
    public static int nglCreateShaderProgramv(int type, int count, long strings) {
        return GL41C.nglCreateShaderProgramv(type, count, strings);
    }

    /** {@code GLuint glCreateShaderProgramv(GLenum type, GLsizei count, GLchar const * const * strings)} */
    @NativeType("GLuint")
    public static int glCreateShaderProgramv(@NativeType("GLenum") int type, @NativeType("GLchar const * const *") PointerBuffer strings) {
        return GL41C.glCreateShaderProgramv(type, strings);
    }

    /** {@code GLuint glCreateShaderProgramv(GLenum type, GLsizei count, GLchar const * const * strings)} */
    @NativeType("GLuint")
    public static int glCreateShaderProgramv(@NativeType("GLenum") int type, @NativeType("GLchar const * const *") CharSequence... strings) {
        return GL41C.glCreateShaderProgramv(type, strings);
    }

    /** {@code GLuint glCreateShaderProgramv(GLenum type, GLsizei count, GLchar const * const * strings)} */
    @NativeType("GLuint")
    public static int glCreateShaderProgramv(@NativeType("GLenum") int type, @NativeType("GLchar const * const *") CharSequence string) {
        return GL41C.glCreateShaderProgramv(type, string);
    }

    // --- [ glBindProgramPipeline ] ---

    /** {@code void glBindProgramPipeline(GLuint pipeline)} */
    public static void glBindProgramPipeline(@NativeType("GLuint") int pipeline) {
        GL41C.glBindProgramPipeline(pipeline);
    }

    // --- [ glDeleteProgramPipelines ] ---

    /** {@code void glDeleteProgramPipelines(GLsizei n, GLuint const * pipelines)} */
    public static void nglDeleteProgramPipelines(int n, long pipelines) {
        GL41C.nglDeleteProgramPipelines(n, pipelines);
    }

    /** {@code void glDeleteProgramPipelines(GLsizei n, GLuint const * pipelines)} */
    public static void glDeleteProgramPipelines(@NativeType("GLuint const *") IntBuffer pipelines) {
        GL41C.glDeleteProgramPipelines(pipelines);
    }

    /** {@code void glDeleteProgramPipelines(GLsizei n, GLuint const * pipelines)} */
    public static void glDeleteProgramPipelines(@NativeType("GLuint const *") int pipeline) {
        GL41C.glDeleteProgramPipelines(pipeline);
    }

    // --- [ glGenProgramPipelines ] ---

    /** {@code void glGenProgramPipelines(GLsizei n, GLuint * pipelines)} */
    public static void nglGenProgramPipelines(int n, long pipelines) {
        GL41C.nglGenProgramPipelines(n, pipelines);
    }

    /** {@code void glGenProgramPipelines(GLsizei n, GLuint * pipelines)} */
    public static void glGenProgramPipelines(@NativeType("GLuint *") IntBuffer pipelines) {
        GL41C.glGenProgramPipelines(pipelines);
    }

    /** {@code void glGenProgramPipelines(GLsizei n, GLuint * pipelines)} */
    @NativeType("void")
    public static int glGenProgramPipelines() {
        return GL41C.glGenProgramPipelines();
    }

    // --- [ glIsProgramPipeline ] ---

    /** {@code GLboolean glIsProgramPipeline(GLuint pipeline)} */
    @NativeType("GLboolean")
    public static boolean glIsProgramPipeline(@NativeType("GLuint") int pipeline) {
        return GL41C.glIsProgramPipeline(pipeline);
    }

    // --- [ glProgramParameteri ] ---

    /** {@code void glProgramParameteri(GLuint program, GLenum pname, GLint value)} */
    public static void glProgramParameteri(@NativeType("GLuint") int program, @NativeType("GLenum") int pname, @NativeType("GLint") int value) {
        GL41C.glProgramParameteri(program, pname, value);
    }

    // --- [ glGetProgramPipelineiv ] ---

    /** {@code void glGetProgramPipelineiv(GLuint pipeline, GLenum pname, GLint * params)} */
    public static void nglGetProgramPipelineiv(int pipeline, int pname, long params) {
        GL41C.nglGetProgramPipelineiv(pipeline, pname, params);
    }

    /** {@code void glGetProgramPipelineiv(GLuint pipeline, GLenum pname, GLint * params)} */
    public static void glGetProgramPipelineiv(@NativeType("GLuint") int pipeline, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        GL41C.glGetProgramPipelineiv(pipeline, pname, params);
    }

    /** {@code void glGetProgramPipelineiv(GLuint pipeline, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetProgramPipelinei(@NativeType("GLuint") int pipeline, @NativeType("GLenum") int pname) {
        return GL41C.glGetProgramPipelinei(pipeline, pname);
    }

    // --- [ glProgramUniform1i ] ---

    /** {@code void glProgramUniform1i(GLuint program, GLint location, GLint x)} */
    public static void glProgramUniform1i(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint") int x) {
        GL41C.glProgramUniform1i(program, location, x);
    }

    // --- [ glProgramUniform2i ] ---

    /** {@code void glProgramUniform2i(GLuint program, GLint location, GLint x, GLint y)} */
    public static void glProgramUniform2i(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint") int x, @NativeType("GLint") int y) {
        GL41C.glProgramUniform2i(program, location, x, y);
    }

    // --- [ glProgramUniform3i ] ---

    /** {@code void glProgramUniform3i(GLuint program, GLint location, GLint x, GLint y, GLint z)} */
    public static void glProgramUniform3i(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z) {
        GL41C.glProgramUniform3i(program, location, x, y, z);
    }

    // --- [ glProgramUniform4i ] ---

    /** {@code void glProgramUniform4i(GLuint program, GLint location, GLint x, GLint y, GLint z, GLint w)} */
    public static void glProgramUniform4i(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z, @NativeType("GLint") int w) {
        GL41C.glProgramUniform4i(program, location, x, y, z, w);
    }

    // --- [ glProgramUniform1ui ] ---

    /** {@code void glProgramUniform1ui(GLuint program, GLint location, GLuint x)} */
    public static void glProgramUniform1ui(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint") int x) {
        GL41C.glProgramUniform1ui(program, location, x);
    }

    // --- [ glProgramUniform2ui ] ---

    /** {@code void glProgramUniform2ui(GLuint program, GLint location, GLuint x, GLuint y)} */
    public static void glProgramUniform2ui(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint") int x, @NativeType("GLuint") int y) {
        GL41C.glProgramUniform2ui(program, location, x, y);
    }

    // --- [ glProgramUniform3ui ] ---

    /** {@code void glProgramUniform3ui(GLuint program, GLint location, GLuint x, GLuint y, GLuint z)} */
    public static void glProgramUniform3ui(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint") int x, @NativeType("GLuint") int y, @NativeType("GLuint") int z) {
        GL41C.glProgramUniform3ui(program, location, x, y, z);
    }

    // --- [ glProgramUniform4ui ] ---

    /** {@code void glProgramUniform4ui(GLuint program, GLint location, GLuint x, GLuint y, GLuint z, GLuint w)} */
    public static void glProgramUniform4ui(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint") int x, @NativeType("GLuint") int y, @NativeType("GLuint") int z, @NativeType("GLuint") int w) {
        GL41C.glProgramUniform4ui(program, location, x, y, z, w);
    }

    // --- [ glProgramUniform1f ] ---

    /** {@code void glProgramUniform1f(GLuint program, GLint location, GLfloat x)} */
    public static void glProgramUniform1f(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat") float x) {
        GL41C.glProgramUniform1f(program, location, x);
    }

    // --- [ glProgramUniform2f ] ---

    /** {@code void glProgramUniform2f(GLuint program, GLint location, GLfloat x, GLfloat y)} */
    public static void glProgramUniform2f(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat") float x, @NativeType("GLfloat") float y) {
        GL41C.glProgramUniform2f(program, location, x, y);
    }

    // --- [ glProgramUniform3f ] ---

    /** {@code void glProgramUniform3f(GLuint program, GLint location, GLfloat x, GLfloat y, GLfloat z)} */
    public static void glProgramUniform3f(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float z) {
        GL41C.glProgramUniform3f(program, location, x, y, z);
    }

    // --- [ glProgramUniform4f ] ---

    /** {@code void glProgramUniform4f(GLuint program, GLint location, GLfloat x, GLfloat y, GLfloat z, GLfloat w)} */
    public static void glProgramUniform4f(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float z, @NativeType("GLfloat") float w) {
        GL41C.glProgramUniform4f(program, location, x, y, z, w);
    }

    // --- [ glProgramUniform1d ] ---

    /** {@code void glProgramUniform1d(GLuint program, GLint location, GLdouble x)} */
    public static void glProgramUniform1d(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble") double x) {
        GL41C.glProgramUniform1d(program, location, x);
    }

    // --- [ glProgramUniform2d ] ---

    /** {@code void glProgramUniform2d(GLuint program, GLint location, GLdouble x, GLdouble y)} */
    public static void glProgramUniform2d(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y) {
        GL41C.glProgramUniform2d(program, location, x, y);
    }

    // --- [ glProgramUniform3d ] ---

    /** {@code void glProgramUniform3d(GLuint program, GLint location, GLdouble x, GLdouble y, GLdouble z)} */
    public static void glProgramUniform3d(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z) {
        GL41C.glProgramUniform3d(program, location, x, y, z);
    }

    // --- [ glProgramUniform4d ] ---

    /** {@code void glProgramUniform4d(GLuint program, GLint location, GLdouble x, GLdouble y, GLdouble z, GLdouble w)} */
    public static void glProgramUniform4d(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z, @NativeType("GLdouble") double w) {
        GL41C.glProgramUniform4d(program, location, x, y, z, w);
    }

    // --- [ glProgramUniform1iv ] ---

    /** {@code void glProgramUniform1iv(GLuint program, GLint location, GLsizei count, GLint const * value)} */
    public static void nglProgramUniform1iv(int program, int location, int count, long value) {
        GL41C.nglProgramUniform1iv(program, location, count, value);
    }

    /** {@code void glProgramUniform1iv(GLuint program, GLint location, GLsizei count, GLint const * value)} */
    public static void glProgramUniform1iv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        GL41C.glProgramUniform1iv(program, location, value);
    }

    // --- [ glProgramUniform2iv ] ---

    /** {@code void glProgramUniform2iv(GLuint program, GLint location, GLsizei count, GLint const * value)} */
    public static void nglProgramUniform2iv(int program, int location, int count, long value) {
        GL41C.nglProgramUniform2iv(program, location, count, value);
    }

    /** {@code void glProgramUniform2iv(GLuint program, GLint location, GLsizei count, GLint const * value)} */
    public static void glProgramUniform2iv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        GL41C.glProgramUniform2iv(program, location, value);
    }

    // --- [ glProgramUniform3iv ] ---

    /** {@code void glProgramUniform3iv(GLuint program, GLint location, GLsizei count, GLint const * value)} */
    public static void nglProgramUniform3iv(int program, int location, int count, long value) {
        GL41C.nglProgramUniform3iv(program, location, count, value);
    }

    /** {@code void glProgramUniform3iv(GLuint program, GLint location, GLsizei count, GLint const * value)} */
    public static void glProgramUniform3iv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        GL41C.glProgramUniform3iv(program, location, value);
    }

    // --- [ glProgramUniform4iv ] ---

    /** {@code void glProgramUniform4iv(GLuint program, GLint location, GLsizei count, GLint const * value)} */
    public static void nglProgramUniform4iv(int program, int location, int count, long value) {
        GL41C.nglProgramUniform4iv(program, location, count, value);
    }

    /** {@code void glProgramUniform4iv(GLuint program, GLint location, GLsizei count, GLint const * value)} */
    public static void glProgramUniform4iv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        GL41C.glProgramUniform4iv(program, location, value);
    }

    // --- [ glProgramUniform1uiv ] ---

    /** {@code void glProgramUniform1uiv(GLuint program, GLint location, GLsizei count, GLuint const * value)} */
    public static void nglProgramUniform1uiv(int program, int location, int count, long value) {
        GL41C.nglProgramUniform1uiv(program, location, count, value);
    }

    /** {@code void glProgramUniform1uiv(GLuint program, GLint location, GLsizei count, GLuint const * value)} */
    public static void glProgramUniform1uiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        GL41C.glProgramUniform1uiv(program, location, value);
    }

    // --- [ glProgramUniform2uiv ] ---

    /** {@code void glProgramUniform2uiv(GLuint program, GLint location, GLsizei count, GLuint const * value)} */
    public static void nglProgramUniform2uiv(int program, int location, int count, long value) {
        GL41C.nglProgramUniform2uiv(program, location, count, value);
    }

    /** {@code void glProgramUniform2uiv(GLuint program, GLint location, GLsizei count, GLuint const * value)} */
    public static void glProgramUniform2uiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        GL41C.glProgramUniform2uiv(program, location, value);
    }

    // --- [ glProgramUniform3uiv ] ---

    /** {@code void glProgramUniform3uiv(GLuint program, GLint location, GLsizei count, GLuint const * value)} */
    public static void nglProgramUniform3uiv(int program, int location, int count, long value) {
        GL41C.nglProgramUniform3uiv(program, location, count, value);
    }

    /** {@code void glProgramUniform3uiv(GLuint program, GLint location, GLsizei count, GLuint const * value)} */
    public static void glProgramUniform3uiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        GL41C.glProgramUniform3uiv(program, location, value);
    }

    // --- [ glProgramUniform4uiv ] ---

    /** {@code void glProgramUniform4uiv(GLuint program, GLint location, GLsizei count, GLuint const * value)} */
    public static void nglProgramUniform4uiv(int program, int location, int count, long value) {
        GL41C.nglProgramUniform4uiv(program, location, count, value);
    }

    /** {@code void glProgramUniform4uiv(GLuint program, GLint location, GLsizei count, GLuint const * value)} */
    public static void glProgramUniform4uiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        GL41C.glProgramUniform4uiv(program, location, value);
    }

    // --- [ glProgramUniform1fv ] ---

    /** {@code void glProgramUniform1fv(GLuint program, GLint location, GLsizei count, GLfloat const * value)} */
    public static void nglProgramUniform1fv(int program, int location, int count, long value) {
        GL41C.nglProgramUniform1fv(program, location, count, value);
    }

    /** {@code void glProgramUniform1fv(GLuint program, GLint location, GLsizei count, GLfloat const * value)} */
    public static void glProgramUniform1fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        GL41C.glProgramUniform1fv(program, location, value);
    }

    // --- [ glProgramUniform2fv ] ---

    /** {@code void glProgramUniform2fv(GLuint program, GLint location, GLsizei count, GLfloat const * value)} */
    public static void nglProgramUniform2fv(int program, int location, int count, long value) {
        GL41C.nglProgramUniform2fv(program, location, count, value);
    }

    /** {@code void glProgramUniform2fv(GLuint program, GLint location, GLsizei count, GLfloat const * value)} */
    public static void glProgramUniform2fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        GL41C.glProgramUniform2fv(program, location, value);
    }

    // --- [ glProgramUniform3fv ] ---

    /** {@code void glProgramUniform3fv(GLuint program, GLint location, GLsizei count, GLfloat const * value)} */
    public static void nglProgramUniform3fv(int program, int location, int count, long value) {
        GL41C.nglProgramUniform3fv(program, location, count, value);
    }

    /** {@code void glProgramUniform3fv(GLuint program, GLint location, GLsizei count, GLfloat const * value)} */
    public static void glProgramUniform3fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        GL41C.glProgramUniform3fv(program, location, value);
    }

    // --- [ glProgramUniform4fv ] ---

    /** {@code void glProgramUniform4fv(GLuint program, GLint location, GLsizei count, GLfloat const * value)} */
    public static void nglProgramUniform4fv(int program, int location, int count, long value) {
        GL41C.nglProgramUniform4fv(program, location, count, value);
    }

    /** {@code void glProgramUniform4fv(GLuint program, GLint location, GLsizei count, GLfloat const * value)} */
    public static void glProgramUniform4fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        GL41C.glProgramUniform4fv(program, location, value);
    }

    // --- [ glProgramUniform1dv ] ---

    /** {@code void glProgramUniform1dv(GLuint program, GLint location, GLsizei count, GLdouble const * value)} */
    public static void nglProgramUniform1dv(int program, int location, int count, long value) {
        GL41C.nglProgramUniform1dv(program, location, count, value);
    }

    /** {@code void glProgramUniform1dv(GLuint program, GLint location, GLsizei count, GLdouble const * value)} */
    public static void glProgramUniform1dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble const *") DoubleBuffer value) {
        GL41C.glProgramUniform1dv(program, location, value);
    }

    // --- [ glProgramUniform2dv ] ---

    /** {@code void glProgramUniform2dv(GLuint program, GLint location, GLsizei count, GLdouble const * value)} */
    public static void nglProgramUniform2dv(int program, int location, int count, long value) {
        GL41C.nglProgramUniform2dv(program, location, count, value);
    }

    /** {@code void glProgramUniform2dv(GLuint program, GLint location, GLsizei count, GLdouble const * value)} */
    public static void glProgramUniform2dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble const *") DoubleBuffer value) {
        GL41C.glProgramUniform2dv(program, location, value);
    }

    // --- [ glProgramUniform3dv ] ---

    /** {@code void glProgramUniform3dv(GLuint program, GLint location, GLsizei count, GLdouble const * value)} */
    public static void nglProgramUniform3dv(int program, int location, int count, long value) {
        GL41C.nglProgramUniform3dv(program, location, count, value);
    }

    /** {@code void glProgramUniform3dv(GLuint program, GLint location, GLsizei count, GLdouble const * value)} */
    public static void glProgramUniform3dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble const *") DoubleBuffer value) {
        GL41C.glProgramUniform3dv(program, location, value);
    }

    // --- [ glProgramUniform4dv ] ---

    /** {@code void glProgramUniform4dv(GLuint program, GLint location, GLsizei count, GLdouble const * value)} */
    public static void nglProgramUniform4dv(int program, int location, int count, long value) {
        GL41C.nglProgramUniform4dv(program, location, count, value);
    }

    /** {@code void glProgramUniform4dv(GLuint program, GLint location, GLsizei count, GLdouble const * value)} */
    public static void glProgramUniform4dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble const *") DoubleBuffer value) {
        GL41C.glProgramUniform4dv(program, location, value);
    }

    // --- [ glProgramUniformMatrix2fv ] ---

    /** {@code void glProgramUniformMatrix2fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void nglProgramUniformMatrix2fv(int program, int location, int count, boolean transpose, long value) {
        GL41C.nglProgramUniformMatrix2fv(program, location, count, transpose, value);
    }

    /** {@code void glProgramUniformMatrix2fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix2fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        GL41C.glProgramUniformMatrix2fv(program, location, transpose, value);
    }

    // --- [ glProgramUniformMatrix3fv ] ---

    /** {@code void glProgramUniformMatrix3fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void nglProgramUniformMatrix3fv(int program, int location, int count, boolean transpose, long value) {
        GL41C.nglProgramUniformMatrix3fv(program, location, count, transpose, value);
    }

    /** {@code void glProgramUniformMatrix3fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix3fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        GL41C.glProgramUniformMatrix3fv(program, location, transpose, value);
    }

    // --- [ glProgramUniformMatrix4fv ] ---

    /** {@code void glProgramUniformMatrix4fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void nglProgramUniformMatrix4fv(int program, int location, int count, boolean transpose, long value) {
        GL41C.nglProgramUniformMatrix4fv(program, location, count, transpose, value);
    }

    /** {@code void glProgramUniformMatrix4fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix4fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        GL41C.glProgramUniformMatrix4fv(program, location, transpose, value);
    }

    // --- [ glProgramUniformMatrix2dv ] ---

    /** {@code void glProgramUniformMatrix2dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void nglProgramUniformMatrix2dv(int program, int location, int count, boolean transpose, long value) {
        GL41C.nglProgramUniformMatrix2dv(program, location, count, transpose, value);
    }

    /** {@code void glProgramUniformMatrix2dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glProgramUniformMatrix2dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        GL41C.glProgramUniformMatrix2dv(program, location, transpose, value);
    }

    // --- [ glProgramUniformMatrix3dv ] ---

    /** {@code void glProgramUniformMatrix3dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void nglProgramUniformMatrix3dv(int program, int location, int count, boolean transpose, long value) {
        GL41C.nglProgramUniformMatrix3dv(program, location, count, transpose, value);
    }

    /** {@code void glProgramUniformMatrix3dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glProgramUniformMatrix3dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        GL41C.glProgramUniformMatrix3dv(program, location, transpose, value);
    }

    // --- [ glProgramUniformMatrix4dv ] ---

    /** {@code void glProgramUniformMatrix4dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void nglProgramUniformMatrix4dv(int program, int location, int count, boolean transpose, long value) {
        GL41C.nglProgramUniformMatrix4dv(program, location, count, transpose, value);
    }

    /** {@code void glProgramUniformMatrix4dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glProgramUniformMatrix4dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        GL41C.glProgramUniformMatrix4dv(program, location, transpose, value);
    }

    // --- [ glProgramUniformMatrix2x3fv ] ---

    /** {@code void glProgramUniformMatrix2x3fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void nglProgramUniformMatrix2x3fv(int program, int location, int count, boolean transpose, long value) {
        GL41C.nglProgramUniformMatrix2x3fv(program, location, count, transpose, value);
    }

    /** {@code void glProgramUniformMatrix2x3fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix2x3fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        GL41C.glProgramUniformMatrix2x3fv(program, location, transpose, value);
    }

    // --- [ glProgramUniformMatrix3x2fv ] ---

    /** {@code void glProgramUniformMatrix3x2fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void nglProgramUniformMatrix3x2fv(int program, int location, int count, boolean transpose, long value) {
        GL41C.nglProgramUniformMatrix3x2fv(program, location, count, transpose, value);
    }

    /** {@code void glProgramUniformMatrix3x2fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix3x2fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        GL41C.glProgramUniformMatrix3x2fv(program, location, transpose, value);
    }

    // --- [ glProgramUniformMatrix2x4fv ] ---

    /** {@code void glProgramUniformMatrix2x4fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void nglProgramUniformMatrix2x4fv(int program, int location, int count, boolean transpose, long value) {
        GL41C.nglProgramUniformMatrix2x4fv(program, location, count, transpose, value);
    }

    /** {@code void glProgramUniformMatrix2x4fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix2x4fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        GL41C.glProgramUniformMatrix2x4fv(program, location, transpose, value);
    }

    // --- [ glProgramUniformMatrix4x2fv ] ---

    /** {@code void glProgramUniformMatrix4x2fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void nglProgramUniformMatrix4x2fv(int program, int location, int count, boolean transpose, long value) {
        GL41C.nglProgramUniformMatrix4x2fv(program, location, count, transpose, value);
    }

    /** {@code void glProgramUniformMatrix4x2fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix4x2fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        GL41C.glProgramUniformMatrix4x2fv(program, location, transpose, value);
    }

    // --- [ glProgramUniformMatrix3x4fv ] ---

    /** {@code void glProgramUniformMatrix3x4fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void nglProgramUniformMatrix3x4fv(int program, int location, int count, boolean transpose, long value) {
        GL41C.nglProgramUniformMatrix3x4fv(program, location, count, transpose, value);
    }

    /** {@code void glProgramUniformMatrix3x4fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix3x4fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        GL41C.glProgramUniformMatrix3x4fv(program, location, transpose, value);
    }

    // --- [ glProgramUniformMatrix4x3fv ] ---

    /** {@code void glProgramUniformMatrix4x3fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void nglProgramUniformMatrix4x3fv(int program, int location, int count, boolean transpose, long value) {
        GL41C.nglProgramUniformMatrix4x3fv(program, location, count, transpose, value);
    }

    /** {@code void glProgramUniformMatrix4x3fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix4x3fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        GL41C.glProgramUniformMatrix4x3fv(program, location, transpose, value);
    }

    // --- [ glProgramUniformMatrix2x3dv ] ---

    /** {@code void glProgramUniformMatrix2x3dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void nglProgramUniformMatrix2x3dv(int program, int location, int count, boolean transpose, long value) {
        GL41C.nglProgramUniformMatrix2x3dv(program, location, count, transpose, value);
    }

    /** {@code void glProgramUniformMatrix2x3dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glProgramUniformMatrix2x3dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        GL41C.glProgramUniformMatrix2x3dv(program, location, transpose, value);
    }

    // --- [ glProgramUniformMatrix3x2dv ] ---

    /** {@code void glProgramUniformMatrix3x2dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void nglProgramUniformMatrix3x2dv(int program, int location, int count, boolean transpose, long value) {
        GL41C.nglProgramUniformMatrix3x2dv(program, location, count, transpose, value);
    }

    /** {@code void glProgramUniformMatrix3x2dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glProgramUniformMatrix3x2dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        GL41C.glProgramUniformMatrix3x2dv(program, location, transpose, value);
    }

    // --- [ glProgramUniformMatrix2x4dv ] ---

    /** {@code void glProgramUniformMatrix2x4dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void nglProgramUniformMatrix2x4dv(int program, int location, int count, boolean transpose, long value) {
        GL41C.nglProgramUniformMatrix2x4dv(program, location, count, transpose, value);
    }

    /** {@code void glProgramUniformMatrix2x4dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glProgramUniformMatrix2x4dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        GL41C.glProgramUniformMatrix2x4dv(program, location, transpose, value);
    }

    // --- [ glProgramUniformMatrix4x2dv ] ---

    /** {@code void glProgramUniformMatrix4x2dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void nglProgramUniformMatrix4x2dv(int program, int location, int count, boolean transpose, long value) {
        GL41C.nglProgramUniformMatrix4x2dv(program, location, count, transpose, value);
    }

    /** {@code void glProgramUniformMatrix4x2dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glProgramUniformMatrix4x2dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        GL41C.glProgramUniformMatrix4x2dv(program, location, transpose, value);
    }

    // --- [ glProgramUniformMatrix3x4dv ] ---

    /** {@code void glProgramUniformMatrix3x4dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void nglProgramUniformMatrix3x4dv(int program, int location, int count, boolean transpose, long value) {
        GL41C.nglProgramUniformMatrix3x4dv(program, location, count, transpose, value);
    }

    /** {@code void glProgramUniformMatrix3x4dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glProgramUniformMatrix3x4dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        GL41C.glProgramUniformMatrix3x4dv(program, location, transpose, value);
    }

    // --- [ glProgramUniformMatrix4x3dv ] ---

    /** {@code void glProgramUniformMatrix4x3dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void nglProgramUniformMatrix4x3dv(int program, int location, int count, boolean transpose, long value) {
        GL41C.nglProgramUniformMatrix4x3dv(program, location, count, transpose, value);
    }

    /** {@code void glProgramUniformMatrix4x3dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glProgramUniformMatrix4x3dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        GL41C.glProgramUniformMatrix4x3dv(program, location, transpose, value);
    }

    // --- [ glValidateProgramPipeline ] ---

    /** {@code void glValidateProgramPipeline(GLuint pipeline)} */
    public static void glValidateProgramPipeline(@NativeType("GLuint") int pipeline) {
        GL41C.glValidateProgramPipeline(pipeline);
    }

    // --- [ glGetProgramPipelineInfoLog ] ---

    /** {@code void glGetProgramPipelineInfoLog(GLuint pipeline, GLsizei bufSize, GLsizei * length, GLchar * infoLog)} */
    public static void nglGetProgramPipelineInfoLog(int pipeline, int bufSize, long length, long infoLog) {
        GL41C.nglGetProgramPipelineInfoLog(pipeline, bufSize, length, infoLog);
    }

    /** {@code void glGetProgramPipelineInfoLog(GLuint pipeline, GLsizei bufSize, GLsizei * length, GLchar * infoLog)} */
    public static void glGetProgramPipelineInfoLog(@NativeType("GLuint") int pipeline, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLchar *") ByteBuffer infoLog) {
        GL41C.glGetProgramPipelineInfoLog(pipeline, length, infoLog);
    }

    /** {@code void glGetProgramPipelineInfoLog(GLuint pipeline, GLsizei bufSize, GLsizei * length, GLchar * infoLog)} */
    @NativeType("void")
    public static String glGetProgramPipelineInfoLog(@NativeType("GLuint") int pipeline, @NativeType("GLsizei") int bufSize) {
        return GL41C.glGetProgramPipelineInfoLog(pipeline, bufSize);
    }

    /** {@code void glGetProgramPipelineInfoLog(GLuint pipeline, GLsizei bufSize, GLsizei * length, GLchar * infoLog)} */
    @NativeType("void")
    public static String glGetProgramPipelineInfoLog(@NativeType("GLuint") int pipeline) {
        return glGetProgramPipelineInfoLog(pipeline, glGetProgramPipelinei(pipeline, GL20.GL_INFO_LOG_LENGTH));
    }

    /** {@code void glDeleteProgramPipelines(GLsizei n, GLuint const * pipelines)} */
    public static void glDeleteProgramPipelines(@NativeType("GLuint const *") int[] pipelines) {
        GL41C.glDeleteProgramPipelines(pipelines);
    }

    /** {@code void glGenProgramPipelines(GLsizei n, GLuint * pipelines)} */
    public static void glGenProgramPipelines(@NativeType("GLuint *") int[] pipelines) {
        GL41C.glGenProgramPipelines(pipelines);
    }

    /** {@code void glGetProgramPipelineiv(GLuint pipeline, GLenum pname, GLint * params)} */
    public static void glGetProgramPipelineiv(@NativeType("GLuint") int pipeline, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        GL41C.glGetProgramPipelineiv(pipeline, pname, params);
    }

    /** {@code void glProgramUniform1iv(GLuint program, GLint location, GLsizei count, GLint const * value)} */
    public static void glProgramUniform1iv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        GL41C.glProgramUniform1iv(program, location, value);
    }

    /** {@code void glProgramUniform2iv(GLuint program, GLint location, GLsizei count, GLint const * value)} */
    public static void glProgramUniform2iv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        GL41C.glProgramUniform2iv(program, location, value);
    }

    /** {@code void glProgramUniform3iv(GLuint program, GLint location, GLsizei count, GLint const * value)} */
    public static void glProgramUniform3iv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        GL41C.glProgramUniform3iv(program, location, value);
    }

    /** {@code void glProgramUniform4iv(GLuint program, GLint location, GLsizei count, GLint const * value)} */
    public static void glProgramUniform4iv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        GL41C.glProgramUniform4iv(program, location, value);
    }

    /** {@code void glProgramUniform1uiv(GLuint program, GLint location, GLsizei count, GLuint const * value)} */
    public static void glProgramUniform1uiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        GL41C.glProgramUniform1uiv(program, location, value);
    }

    /** {@code void glProgramUniform2uiv(GLuint program, GLint location, GLsizei count, GLuint const * value)} */
    public static void glProgramUniform2uiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        GL41C.glProgramUniform2uiv(program, location, value);
    }

    /** {@code void glProgramUniform3uiv(GLuint program, GLint location, GLsizei count, GLuint const * value)} */
    public static void glProgramUniform3uiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        GL41C.glProgramUniform3uiv(program, location, value);
    }

    /** {@code void glProgramUniform4uiv(GLuint program, GLint location, GLsizei count, GLuint const * value)} */
    public static void glProgramUniform4uiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        GL41C.glProgramUniform4uiv(program, location, value);
    }

    /** {@code void glProgramUniform1fv(GLuint program, GLint location, GLsizei count, GLfloat const * value)} */
    public static void glProgramUniform1fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        GL41C.glProgramUniform1fv(program, location, value);
    }

    /** {@code void glProgramUniform2fv(GLuint program, GLint location, GLsizei count, GLfloat const * value)} */
    public static void glProgramUniform2fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        GL41C.glProgramUniform2fv(program, location, value);
    }

    /** {@code void glProgramUniform3fv(GLuint program, GLint location, GLsizei count, GLfloat const * value)} */
    public static void glProgramUniform3fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        GL41C.glProgramUniform3fv(program, location, value);
    }

    /** {@code void glProgramUniform4fv(GLuint program, GLint location, GLsizei count, GLfloat const * value)} */
    public static void glProgramUniform4fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        GL41C.glProgramUniform4fv(program, location, value);
    }

    /** {@code void glProgramUniform1dv(GLuint program, GLint location, GLsizei count, GLdouble const * value)} */
    public static void glProgramUniform1dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble const *") double[] value) {
        GL41C.glProgramUniform1dv(program, location, value);
    }

    /** {@code void glProgramUniform2dv(GLuint program, GLint location, GLsizei count, GLdouble const * value)} */
    public static void glProgramUniform2dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble const *") double[] value) {
        GL41C.glProgramUniform2dv(program, location, value);
    }

    /** {@code void glProgramUniform3dv(GLuint program, GLint location, GLsizei count, GLdouble const * value)} */
    public static void glProgramUniform3dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble const *") double[] value) {
        GL41C.glProgramUniform3dv(program, location, value);
    }

    /** {@code void glProgramUniform4dv(GLuint program, GLint location, GLsizei count, GLdouble const * value)} */
    public static void glProgramUniform4dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble const *") double[] value) {
        GL41C.glProgramUniform4dv(program, location, value);
    }

    /** {@code void glProgramUniformMatrix2fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix2fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        GL41C.glProgramUniformMatrix2fv(program, location, transpose, value);
    }

    /** {@code void glProgramUniformMatrix3fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix3fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        GL41C.glProgramUniformMatrix3fv(program, location, transpose, value);
    }

    /** {@code void glProgramUniformMatrix4fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix4fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        GL41C.glProgramUniformMatrix4fv(program, location, transpose, value);
    }

    /** {@code void glProgramUniformMatrix2dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glProgramUniformMatrix2dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        GL41C.glProgramUniformMatrix2dv(program, location, transpose, value);
    }

    /** {@code void glProgramUniformMatrix3dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glProgramUniformMatrix3dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        GL41C.glProgramUniformMatrix3dv(program, location, transpose, value);
    }

    /** {@code void glProgramUniformMatrix4dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glProgramUniformMatrix4dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        GL41C.glProgramUniformMatrix4dv(program, location, transpose, value);
    }

    /** {@code void glProgramUniformMatrix2x3fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix2x3fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        GL41C.glProgramUniformMatrix2x3fv(program, location, transpose, value);
    }

    /** {@code void glProgramUniformMatrix3x2fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix3x2fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        GL41C.glProgramUniformMatrix3x2fv(program, location, transpose, value);
    }

    /** {@code void glProgramUniformMatrix2x4fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix2x4fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        GL41C.glProgramUniformMatrix2x4fv(program, location, transpose, value);
    }

    /** {@code void glProgramUniformMatrix4x2fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix4x2fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        GL41C.glProgramUniformMatrix4x2fv(program, location, transpose, value);
    }

    /** {@code void glProgramUniformMatrix3x4fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix3x4fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        GL41C.glProgramUniformMatrix3x4fv(program, location, transpose, value);
    }

    /** {@code void glProgramUniformMatrix4x3fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix4x3fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        GL41C.glProgramUniformMatrix4x3fv(program, location, transpose, value);
    }

    /** {@code void glProgramUniformMatrix2x3dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glProgramUniformMatrix2x3dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        GL41C.glProgramUniformMatrix2x3dv(program, location, transpose, value);
    }

    /** {@code void glProgramUniformMatrix3x2dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glProgramUniformMatrix3x2dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        GL41C.glProgramUniformMatrix3x2dv(program, location, transpose, value);
    }

    /** {@code void glProgramUniformMatrix2x4dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glProgramUniformMatrix2x4dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        GL41C.glProgramUniformMatrix2x4dv(program, location, transpose, value);
    }

    /** {@code void glProgramUniformMatrix4x2dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glProgramUniformMatrix4x2dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        GL41C.glProgramUniformMatrix4x2dv(program, location, transpose, value);
    }

    /** {@code void glProgramUniformMatrix3x4dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glProgramUniformMatrix3x4dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        GL41C.glProgramUniformMatrix3x4dv(program, location, transpose, value);
    }

    /** {@code void glProgramUniformMatrix4x3dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glProgramUniformMatrix4x3dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        GL41C.glProgramUniformMatrix4x3dv(program, location, transpose, value);
    }

    /** {@code void glGetProgramPipelineInfoLog(GLuint pipeline, GLsizei bufSize, GLsizei * length, GLchar * infoLog)} */
    public static void glGetProgramPipelineInfoLog(@NativeType("GLuint") int pipeline, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLchar *") ByteBuffer infoLog) {
        GL41C.glGetProgramPipelineInfoLog(pipeline, length, infoLog);
    }

}
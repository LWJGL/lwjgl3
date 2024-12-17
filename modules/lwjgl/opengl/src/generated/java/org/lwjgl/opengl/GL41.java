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

public class GL41 extends GL40 {

    static { GL.initialize(); }

    public static final int
        GL_SHADER_COMPILER                  = 0x8DFA,
        GL_SHADER_BINARY_FORMATS            = 0x8DF8,
        GL_NUM_SHADER_BINARY_FORMATS        = 0x8DF9,
        GL_MAX_VERTEX_UNIFORM_VECTORS       = 0x8DFB,
        GL_MAX_VARYING_VECTORS              = 0x8DFC,
        GL_MAX_FRAGMENT_UNIFORM_VECTORS     = 0x8DFD,
        GL_IMPLEMENTATION_COLOR_READ_TYPE   = 0x8B9A,
        GL_IMPLEMENTATION_COLOR_READ_FORMAT = 0x8B9B;

    public static final int GL_FIXED = 0x140C;

    public static final int
        GL_LOW_FLOAT    = 0x8DF0,
        GL_MEDIUM_FLOAT = 0x8DF1,
        GL_HIGH_FLOAT   = 0x8DF2,
        GL_LOW_INT      = 0x8DF3,
        GL_MEDIUM_INT   = 0x8DF4,
        GL_HIGH_INT     = 0x8DF5;

    public static final int GL_RGB565 = 0x8D62;

    public static final int GL_PROGRAM_BINARY_RETRIEVABLE_HINT = 0x8257;

    public static final int GL_PROGRAM_BINARY_LENGTH = 0x8741;

    public static final int
        GL_NUM_PROGRAM_BINARY_FORMATS = 0x87FE,
        GL_PROGRAM_BINARY_FORMATS     = 0x87FF;

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

    public static final int
        GL_MAX_VIEWPORTS                   = 0x825B,
        GL_VIEWPORT_SUBPIXEL_BITS          = 0x825C,
        GL_VIEWPORT_BOUNDS_RANGE           = 0x825D,
        GL_LAYER_PROVOKING_VERTEX          = 0x825E,
        GL_VIEWPORT_INDEX_PROVOKING_VERTEX = 0x825F;

    public static final int GL_UNDEFINED_VERTEX = 0x8260;

    protected GL41() {
        throw new UnsupportedOperationException();
    }

    // --- [ glReleaseShaderCompiler ] ---

    /** {@code void glReleaseShaderCompiler(void)} */
    public static void glReleaseShaderCompiler() {
        GL41C.glReleaseShaderCompiler();
    }

    // --- [ glShaderBinary ] ---

    /** {@code void glShaderBinary(GLsizei count, GLuint const * shaders, GLenum binaryformat, void const * binary, GLsizei length)} */
    public static void nglShaderBinary(int count, long shaders, int binaryformat, long binary, int length) {
        GL41C.nglShaderBinary(count, shaders, binaryformat, binary, length);
    }

    /** {@code void glShaderBinary(GLsizei count, GLuint const * shaders, GLenum binaryformat, void const * binary, GLsizei length)} */
    public static void glShaderBinary(@NativeType("GLuint const *") IntBuffer shaders, @NativeType("GLenum") int binaryformat, @NativeType("void const *") ByteBuffer binary) {
        GL41C.glShaderBinary(shaders, binaryformat, binary);
    }

    // --- [ glGetShaderPrecisionFormat ] ---

    /** {@code void glGetShaderPrecisionFormat(GLenum shadertype, GLenum precisiontype, GLint * range, GLint * precision)} */
    public static void nglGetShaderPrecisionFormat(int shadertype, int precisiontype, long range, long precision) {
        GL41C.nglGetShaderPrecisionFormat(shadertype, precisiontype, range, precision);
    }

    /** {@code void glGetShaderPrecisionFormat(GLenum shadertype, GLenum precisiontype, GLint * range, GLint * precision)} */
    public static void glGetShaderPrecisionFormat(@NativeType("GLenum") int shadertype, @NativeType("GLenum") int precisiontype, @NativeType("GLint *") IntBuffer range, @NativeType("GLint *") IntBuffer precision) {
        GL41C.glGetShaderPrecisionFormat(shadertype, precisiontype, range, precision);
    }

    /** {@code void glGetShaderPrecisionFormat(GLenum shadertype, GLenum precisiontype, GLint * range, GLint * precision)} */
    @NativeType("void")
    public static int glGetShaderPrecisionFormat(@NativeType("GLenum") int shadertype, @NativeType("GLenum") int precisiontype, @NativeType("GLint *") IntBuffer range) {
        return GL41C.glGetShaderPrecisionFormat(shadertype, precisiontype, range);
    }

    // --- [ glDepthRangef ] ---

    /** {@code void glDepthRangef(GLfloat zNear, GLfloat zFar)} */
    public static void glDepthRangef(@NativeType("GLfloat") float zNear, @NativeType("GLfloat") float zFar) {
        GL41C.glDepthRangef(zNear, zFar);
    }

    // --- [ glClearDepthf ] ---

    /** {@code void glClearDepthf(GLfloat depth)} */
    public static void glClearDepthf(@NativeType("GLfloat") float depth) {
        GL41C.glClearDepthf(depth);
    }

    // --- [ glGetProgramBinary ] ---

    /** {@code void glGetProgramBinary(GLuint program, GLsizei bufSize, GLsizei * length, GLenum * binaryFormat, void * binary)} */
    public static void nglGetProgramBinary(int program, int bufSize, long length, long binaryFormat, long binary) {
        GL41C.nglGetProgramBinary(program, bufSize, length, binaryFormat, binary);
    }

    /** {@code void glGetProgramBinary(GLuint program, GLsizei bufSize, GLsizei * length, GLenum * binaryFormat, void * binary)} */
    public static void glGetProgramBinary(@NativeType("GLuint") int program, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLenum *") IntBuffer binaryFormat, @NativeType("void *") ByteBuffer binary) {
        GL41C.glGetProgramBinary(program, length, binaryFormat, binary);
    }

    // --- [ glProgramBinary ] ---

    /** {@code void glProgramBinary(GLuint program, GLenum binaryFormat, void const * binary, GLsizei length)} */
    public static void nglProgramBinary(int program, int binaryFormat, long binary, int length) {
        GL41C.nglProgramBinary(program, binaryFormat, binary, length);
    }

    /** {@code void glProgramBinary(GLuint program, GLenum binaryFormat, void const * binary, GLsizei length)} */
    public static void glProgramBinary(@NativeType("GLuint") int program, @NativeType("GLenum") int binaryFormat, @NativeType("void const *") ByteBuffer binary) {
        GL41C.glProgramBinary(program, binaryFormat, binary);
    }

    // --- [ glProgramParameteri ] ---

    /** {@code void glProgramParameteri(GLuint program, GLenum pname, GLint value)} */
    public static void glProgramParameteri(@NativeType("GLuint") int program, @NativeType("GLenum") int pname, @NativeType("GLint") int value) {
        GL41C.glProgramParameteri(program, pname, value);
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

    // --- [ glVertexAttribL1d ] ---

    /** {@code void glVertexAttribL1d(GLuint index, GLdouble x)} */
    public static void glVertexAttribL1d(@NativeType("GLuint") int index, @NativeType("GLdouble") double x) {
        GL41C.glVertexAttribL1d(index, x);
    }

    // --- [ glVertexAttribL2d ] ---

    /** {@code void glVertexAttribL2d(GLuint index, GLdouble x, GLdouble y)} */
    public static void glVertexAttribL2d(@NativeType("GLuint") int index, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y) {
        GL41C.glVertexAttribL2d(index, x, y);
    }

    // --- [ glVertexAttribL3d ] ---

    /** {@code void glVertexAttribL3d(GLuint index, GLdouble x, GLdouble y, GLdouble z)} */
    public static void glVertexAttribL3d(@NativeType("GLuint") int index, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z) {
        GL41C.glVertexAttribL3d(index, x, y, z);
    }

    // --- [ glVertexAttribL4d ] ---

    /** {@code void glVertexAttribL4d(GLuint index, GLdouble x, GLdouble y, GLdouble z, GLdouble w)} */
    public static void glVertexAttribL4d(@NativeType("GLuint") int index, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z, @NativeType("GLdouble") double w) {
        GL41C.glVertexAttribL4d(index, x, y, z, w);
    }

    // --- [ glVertexAttribL1dv ] ---

    /** {@code void glVertexAttribL1dv(GLuint index, GLdouble const * v)} */
    public static void nglVertexAttribL1dv(int index, long v) {
        GL41C.nglVertexAttribL1dv(index, v);
    }

    /** {@code void glVertexAttribL1dv(GLuint index, GLdouble const * v)} */
    public static void glVertexAttribL1dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") DoubleBuffer v) {
        GL41C.glVertexAttribL1dv(index, v);
    }

    // --- [ glVertexAttribL2dv ] ---

    /** {@code void glVertexAttribL2dv(GLuint index, GLdouble const * v)} */
    public static void nglVertexAttribL2dv(int index, long v) {
        GL41C.nglVertexAttribL2dv(index, v);
    }

    /** {@code void glVertexAttribL2dv(GLuint index, GLdouble const * v)} */
    public static void glVertexAttribL2dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") DoubleBuffer v) {
        GL41C.glVertexAttribL2dv(index, v);
    }

    // --- [ glVertexAttribL3dv ] ---

    /** {@code void glVertexAttribL3dv(GLuint index, GLdouble const * v)} */
    public static void nglVertexAttribL3dv(int index, long v) {
        GL41C.nglVertexAttribL3dv(index, v);
    }

    /** {@code void glVertexAttribL3dv(GLuint index, GLdouble const * v)} */
    public static void glVertexAttribL3dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") DoubleBuffer v) {
        GL41C.glVertexAttribL3dv(index, v);
    }

    // --- [ glVertexAttribL4dv ] ---

    /** {@code void glVertexAttribL4dv(GLuint index, GLdouble const * v)} */
    public static void nglVertexAttribL4dv(int index, long v) {
        GL41C.nglVertexAttribL4dv(index, v);
    }

    /** {@code void glVertexAttribL4dv(GLuint index, GLdouble const * v)} */
    public static void glVertexAttribL4dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") DoubleBuffer v) {
        GL41C.glVertexAttribL4dv(index, v);
    }

    // --- [ glVertexAttribLPointer ] ---

    /** {@code void glVertexAttribLPointer(GLuint index, GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void nglVertexAttribLPointer(int index, int size, int type, int stride, long pointer) {
        GL41C.nglVertexAttribLPointer(index, size, type, stride, pointer);
    }

    /** {@code void glVertexAttribLPointer(GLuint index, GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void glVertexAttribLPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ByteBuffer pointer) {
        GL41C.glVertexAttribLPointer(index, size, type, stride, pointer);
    }

    /** {@code void glVertexAttribLPointer(GLuint index, GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void glVertexAttribLPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") long pointer) {
        GL41C.glVertexAttribLPointer(index, size, type, stride, pointer);
    }

    /** {@code void glVertexAttribLPointer(GLuint index, GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void glVertexAttribLPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLsizei") int stride, @NativeType("void const *") DoubleBuffer pointer) {
        GL41C.glVertexAttribLPointer(index, size, stride, pointer);
    }

    // --- [ glGetVertexAttribLdv ] ---

    /** {@code void glGetVertexAttribLdv(GLuint index, GLenum pname, GLdouble * params)} */
    public static void nglGetVertexAttribLdv(int index, int pname, long params) {
        GL41C.nglGetVertexAttribLdv(index, pname, params);
    }

    /** {@code void glGetVertexAttribLdv(GLuint index, GLenum pname, GLdouble * params)} */
    public static void glGetVertexAttribLdv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLdouble *") DoubleBuffer params) {
        GL41C.glGetVertexAttribLdv(index, pname, params);
    }

    // --- [ glViewportArrayv ] ---

    /** {@code void glViewportArrayv(GLuint first, GLsizei count, GLfloat const * v)} */
    public static void nglViewportArrayv(int first, int count, long v) {
        GL41C.nglViewportArrayv(first, count, v);
    }

    /** {@code void glViewportArrayv(GLuint first, GLsizei count, GLfloat const * v)} */
    public static void glViewportArrayv(@NativeType("GLuint") int first, @NativeType("GLfloat const *") FloatBuffer v) {
        GL41C.glViewportArrayv(first, v);
    }

    // --- [ glViewportIndexedf ] ---

    /** {@code void glViewportIndexedf(GLuint index, GLfloat x, GLfloat y, GLfloat w, GLfloat h)} */
    public static void glViewportIndexedf(@NativeType("GLuint") int index, @NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float w, @NativeType("GLfloat") float h) {
        GL41C.glViewportIndexedf(index, x, y, w, h);
    }

    // --- [ glViewportIndexedfv ] ---

    /** {@code void glViewportIndexedfv(GLuint index, GLfloat const * v)} */
    public static void nglViewportIndexedfv(int index, long v) {
        GL41C.nglViewportIndexedfv(index, v);
    }

    /** {@code void glViewportIndexedfv(GLuint index, GLfloat const * v)} */
    public static void glViewportIndexedfv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer v) {
        GL41C.glViewportIndexedfv(index, v);
    }

    // --- [ glScissorArrayv ] ---

    /** {@code void glScissorArrayv(GLuint first, GLsizei count, GLint const * v)} */
    public static void nglScissorArrayv(int first, int count, long v) {
        GL41C.nglScissorArrayv(first, count, v);
    }

    /** {@code void glScissorArrayv(GLuint first, GLsizei count, GLint const * v)} */
    public static void glScissorArrayv(@NativeType("GLuint") int first, @NativeType("GLint const *") IntBuffer v) {
        GL41C.glScissorArrayv(first, v);
    }

    // --- [ glScissorIndexed ] ---

    /** {@code void glScissorIndexed(GLuint index, GLint left, GLint bottom, GLsizei width, GLsizei height)} */
    public static void glScissorIndexed(@NativeType("GLuint") int index, @NativeType("GLint") int left, @NativeType("GLint") int bottom, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        GL41C.glScissorIndexed(index, left, bottom, width, height);
    }

    // --- [ glScissorIndexedv ] ---

    /** {@code void glScissorIndexedv(GLuint index, GLint const * v)} */
    public static void nglScissorIndexedv(int index, long v) {
        GL41C.nglScissorIndexedv(index, v);
    }

    /** {@code void glScissorIndexedv(GLuint index, GLint const * v)} */
    public static void glScissorIndexedv(@NativeType("GLuint") int index, @NativeType("GLint const *") IntBuffer v) {
        GL41C.glScissorIndexedv(index, v);
    }

    // --- [ glDepthRangeArrayv ] ---

    /** {@code void glDepthRangeArrayv(GLuint first, GLsizei count, GLdouble const * v)} */
    public static void nglDepthRangeArrayv(int first, int count, long v) {
        GL41C.nglDepthRangeArrayv(first, count, v);
    }

    /** {@code void glDepthRangeArrayv(GLuint first, GLsizei count, GLdouble const * v)} */
    public static void glDepthRangeArrayv(@NativeType("GLuint") int first, @NativeType("GLdouble const *") DoubleBuffer v) {
        GL41C.glDepthRangeArrayv(first, v);
    }

    // --- [ glDepthRangeIndexed ] ---

    /** {@code void glDepthRangeIndexed(GLuint index, GLdouble zNear, GLdouble zFar)} */
    public static void glDepthRangeIndexed(@NativeType("GLuint") int index, @NativeType("GLdouble") double zNear, @NativeType("GLdouble") double zFar) {
        GL41C.glDepthRangeIndexed(index, zNear, zFar);
    }

    // --- [ glGetFloati_v ] ---

    /** {@code void glGetFloati_v(GLenum target, GLuint index, GLfloat * data)} */
    public static void nglGetFloati_v(int target, int index, long data) {
        GL41C.nglGetFloati_v(target, index, data);
    }

    /** {@code void glGetFloati_v(GLenum target, GLuint index, GLfloat * data)} */
    public static void glGetFloati_v(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat *") FloatBuffer data) {
        GL41C.glGetFloati_v(target, index, data);
    }

    /** {@code void glGetFloati_v(GLenum target, GLuint index, GLfloat * data)} */
    @NativeType("void")
    public static float glGetFloati(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        return GL41C.glGetFloati(target, index);
    }

    // --- [ glGetDoublei_v ] ---

    /** {@code void glGetDoublei_v(GLenum target, GLuint index, GLdouble * data)} */
    public static void nglGetDoublei_v(int target, int index, long data) {
        GL41C.nglGetDoublei_v(target, index, data);
    }

    /** {@code void glGetDoublei_v(GLenum target, GLuint index, GLdouble * data)} */
    public static void glGetDoublei_v(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLdouble *") DoubleBuffer data) {
        GL41C.glGetDoublei_v(target, index, data);
    }

    /** {@code void glGetDoublei_v(GLenum target, GLuint index, GLdouble * data)} */
    @NativeType("void")
    public static double glGetDoublei(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        return GL41C.glGetDoublei(target, index);
    }

    /** {@code void glShaderBinary(GLsizei count, GLuint const * shaders, GLenum binaryformat, void const * binary, GLsizei length)} */
    public static void glShaderBinary(@NativeType("GLuint const *") int[] shaders, @NativeType("GLenum") int binaryformat, @NativeType("void const *") ByteBuffer binary) {
        GL41C.glShaderBinary(shaders, binaryformat, binary);
    }

    /** {@code void glGetShaderPrecisionFormat(GLenum shadertype, GLenum precisiontype, GLint * range, GLint * precision)} */
    public static void glGetShaderPrecisionFormat(@NativeType("GLenum") int shadertype, @NativeType("GLenum") int precisiontype, @NativeType("GLint *") int[] range, @NativeType("GLint *") int[] precision) {
        GL41C.glGetShaderPrecisionFormat(shadertype, precisiontype, range, precision);
    }

    /** {@code void glGetProgramBinary(GLuint program, GLsizei bufSize, GLsizei * length, GLenum * binaryFormat, void * binary)} */
    public static void glGetProgramBinary(@NativeType("GLuint") int program, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLenum *") int[] binaryFormat, @NativeType("void *") ByteBuffer binary) {
        GL41C.glGetProgramBinary(program, length, binaryFormat, binary);
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

    /** {@code void glVertexAttribL1dv(GLuint index, GLdouble const * v)} */
    public static void glVertexAttribL1dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") double[] v) {
        GL41C.glVertexAttribL1dv(index, v);
    }

    /** {@code void glVertexAttribL2dv(GLuint index, GLdouble const * v)} */
    public static void glVertexAttribL2dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") double[] v) {
        GL41C.glVertexAttribL2dv(index, v);
    }

    /** {@code void glVertexAttribL3dv(GLuint index, GLdouble const * v)} */
    public static void glVertexAttribL3dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") double[] v) {
        GL41C.glVertexAttribL3dv(index, v);
    }

    /** {@code void glVertexAttribL4dv(GLuint index, GLdouble const * v)} */
    public static void glVertexAttribL4dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") double[] v) {
        GL41C.glVertexAttribL4dv(index, v);
    }

    /** {@code void glGetVertexAttribLdv(GLuint index, GLenum pname, GLdouble * params)} */
    public static void glGetVertexAttribLdv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLdouble *") double[] params) {
        GL41C.glGetVertexAttribLdv(index, pname, params);
    }

    /** {@code void glViewportArrayv(GLuint first, GLsizei count, GLfloat const * v)} */
    public static void glViewportArrayv(@NativeType("GLuint") int first, @NativeType("GLfloat const *") float[] v) {
        GL41C.glViewportArrayv(first, v);
    }

    /** {@code void glViewportIndexedfv(GLuint index, GLfloat const * v)} */
    public static void glViewportIndexedfv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] v) {
        GL41C.glViewportIndexedfv(index, v);
    }

    /** {@code void glScissorArrayv(GLuint first, GLsizei count, GLint const * v)} */
    public static void glScissorArrayv(@NativeType("GLuint") int first, @NativeType("GLint const *") int[] v) {
        GL41C.glScissorArrayv(first, v);
    }

    /** {@code void glScissorIndexedv(GLuint index, GLint const * v)} */
    public static void glScissorIndexedv(@NativeType("GLuint") int index, @NativeType("GLint const *") int[] v) {
        GL41C.glScissorIndexedv(index, v);
    }

    /** {@code void glDepthRangeArrayv(GLuint first, GLsizei count, GLdouble const * v)} */
    public static void glDepthRangeArrayv(@NativeType("GLuint") int first, @NativeType("GLdouble const *") double[] v) {
        GL41C.glDepthRangeArrayv(first, v);
    }

    /** {@code void glGetFloati_v(GLenum target, GLuint index, GLfloat * data)} */
    public static void glGetFloati_v(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat *") float[] data) {
        GL41C.glGetFloati_v(target, index, data);
    }

    /** {@code void glGetDoublei_v(GLenum target, GLuint index, GLdouble * data)} */
    public static void glGetDoublei_v(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLdouble *") double[] data) {
        GL41C.glGetDoublei_v(target, index, data);
    }

}
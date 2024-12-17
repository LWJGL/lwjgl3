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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class GL41C extends GL40C {

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

    protected GL41C() {
        throw new UnsupportedOperationException();
    }

    // --- [ glReleaseShaderCompiler ] ---

    /** {@code void glReleaseShaderCompiler(void)} */
    public static native void glReleaseShaderCompiler();

    // --- [ glShaderBinary ] ---

    /** {@code void glShaderBinary(GLsizei count, GLuint const * shaders, GLenum binaryformat, void const * binary, GLsizei length)} */
    public static native void nglShaderBinary(int count, long shaders, int binaryformat, long binary, int length);

    /** {@code void glShaderBinary(GLsizei count, GLuint const * shaders, GLenum binaryformat, void const * binary, GLsizei length)} */
    public static void glShaderBinary(@NativeType("GLuint const *") IntBuffer shaders, @NativeType("GLenum") int binaryformat, @NativeType("void const *") ByteBuffer binary) {
        nglShaderBinary(shaders.remaining(), memAddress(shaders), binaryformat, memAddress(binary), binary.remaining());
    }

    // --- [ glGetShaderPrecisionFormat ] ---

    /** {@code void glGetShaderPrecisionFormat(GLenum shadertype, GLenum precisiontype, GLint * range, GLint * precision)} */
    public static native void nglGetShaderPrecisionFormat(int shadertype, int precisiontype, long range, long precision);

    /** {@code void glGetShaderPrecisionFormat(GLenum shadertype, GLenum precisiontype, GLint * range, GLint * precision)} */
    public static void glGetShaderPrecisionFormat(@NativeType("GLenum") int shadertype, @NativeType("GLenum") int precisiontype, @NativeType("GLint *") IntBuffer range, @NativeType("GLint *") IntBuffer precision) {
        if (CHECKS) {
            check(range, 2);
            check(precision, 1);
        }
        nglGetShaderPrecisionFormat(shadertype, precisiontype, memAddress(range), memAddress(precision));
    }

    /** {@code void glGetShaderPrecisionFormat(GLenum shadertype, GLenum precisiontype, GLint * range, GLint * precision)} */
    @NativeType("void")
    public static int glGetShaderPrecisionFormat(@NativeType("GLenum") int shadertype, @NativeType("GLenum") int precisiontype, @NativeType("GLint *") IntBuffer range) {
        if (CHECKS) {
            check(range, 2);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer precision = stack.callocInt(1);
            nglGetShaderPrecisionFormat(shadertype, precisiontype, memAddress(range), memAddress(precision));
            return precision.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glDepthRangef ] ---

    /** {@code void glDepthRangef(GLfloat zNear, GLfloat zFar)} */
    public static native void glDepthRangef(@NativeType("GLfloat") float zNear, @NativeType("GLfloat") float zFar);

    // --- [ glClearDepthf ] ---

    /** {@code void glClearDepthf(GLfloat depth)} */
    public static native void glClearDepthf(@NativeType("GLfloat") float depth);

    // --- [ glGetProgramBinary ] ---

    /** {@code void glGetProgramBinary(GLuint program, GLsizei bufSize, GLsizei * length, GLenum * binaryFormat, void * binary)} */
    public static native void nglGetProgramBinary(int program, int bufSize, long length, long binaryFormat, long binary);

    /** {@code void glGetProgramBinary(GLuint program, GLsizei bufSize, GLsizei * length, GLenum * binaryFormat, void * binary)} */
    public static void glGetProgramBinary(@NativeType("GLuint") int program, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLenum *") IntBuffer binaryFormat, @NativeType("void *") ByteBuffer binary) {
        if (CHECKS) {
            checkSafe(length, 1);
            check(binaryFormat, 1);
        }
        nglGetProgramBinary(program, binary.remaining(), memAddressSafe(length), memAddress(binaryFormat), memAddress(binary));
    }

    // --- [ glProgramBinary ] ---

    /** {@code void glProgramBinary(GLuint program, GLenum binaryFormat, void const * binary, GLsizei length)} */
    public static native void nglProgramBinary(int program, int binaryFormat, long binary, int length);

    /** {@code void glProgramBinary(GLuint program, GLenum binaryFormat, void const * binary, GLsizei length)} */
    public static void glProgramBinary(@NativeType("GLuint") int program, @NativeType("GLenum") int binaryFormat, @NativeType("void const *") ByteBuffer binary) {
        nglProgramBinary(program, binaryFormat, memAddress(binary), binary.remaining());
    }

    // --- [ glProgramParameteri ] ---

    /** {@code void glProgramParameteri(GLuint program, GLenum pname, GLint value)} */
    public static native void glProgramParameteri(@NativeType("GLuint") int program, @NativeType("GLenum") int pname, @NativeType("GLint") int value);

    // --- [ glUseProgramStages ] ---

    /** {@code void glUseProgramStages(GLuint pipeline, GLbitfield stages, GLuint program)} */
    public static native void glUseProgramStages(@NativeType("GLuint") int pipeline, @NativeType("GLbitfield") int stages, @NativeType("GLuint") int program);

    // --- [ glActiveShaderProgram ] ---

    /** {@code void glActiveShaderProgram(GLuint pipeline, GLuint program)} */
    public static native void glActiveShaderProgram(@NativeType("GLuint") int pipeline, @NativeType("GLuint") int program);

    // --- [ glCreateShaderProgramv ] ---

    /** {@code GLuint glCreateShaderProgramv(GLenum type, GLsizei count, GLchar const * const * strings)} */
    public static native int nglCreateShaderProgramv(int type, int count, long strings);

    /** {@code GLuint glCreateShaderProgramv(GLenum type, GLsizei count, GLchar const * const * strings)} */
    @NativeType("GLuint")
    public static int glCreateShaderProgramv(@NativeType("GLenum") int type, @NativeType("GLchar const * const *") PointerBuffer strings) {
        return nglCreateShaderProgramv(type, strings.remaining(), memAddress(strings));
    }

    /** {@code GLuint glCreateShaderProgramv(GLenum type, GLsizei count, GLchar const * const * strings)} */
    @NativeType("GLuint")
    public static int glCreateShaderProgramv(@NativeType("GLenum") int type, @NativeType("GLchar const * const *") CharSequence... strings) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long stringsAddress = org.lwjgl.system.APIUtil.apiArray(stack, MemoryUtil::memUTF8, strings);
            int __result = nglCreateShaderProgramv(type, strings.length, stringsAddress);
            org.lwjgl.system.APIUtil.apiArrayFree(stringsAddress, strings.length);
            return __result;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code GLuint glCreateShaderProgramv(GLenum type, GLsizei count, GLchar const * const * strings)} */
    @NativeType("GLuint")
    public static int glCreateShaderProgramv(@NativeType("GLenum") int type, @NativeType("GLchar const * const *") CharSequence string) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long stringsAddress = org.lwjgl.system.APIUtil.apiArray(stack, MemoryUtil::memUTF8, string);
            int __result = nglCreateShaderProgramv(type, 1, stringsAddress);
            org.lwjgl.system.APIUtil.apiArrayFree(stringsAddress, 1);
            return __result;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glBindProgramPipeline ] ---

    /** {@code void glBindProgramPipeline(GLuint pipeline)} */
    public static native void glBindProgramPipeline(@NativeType("GLuint") int pipeline);

    // --- [ glDeleteProgramPipelines ] ---

    /** {@code void glDeleteProgramPipelines(GLsizei n, GLuint const * pipelines)} */
    public static native void nglDeleteProgramPipelines(int n, long pipelines);

    /** {@code void glDeleteProgramPipelines(GLsizei n, GLuint const * pipelines)} */
    public static void glDeleteProgramPipelines(@NativeType("GLuint const *") IntBuffer pipelines) {
        nglDeleteProgramPipelines(pipelines.remaining(), memAddress(pipelines));
    }

    /** {@code void glDeleteProgramPipelines(GLsizei n, GLuint const * pipelines)} */
    public static void glDeleteProgramPipelines(@NativeType("GLuint const *") int pipeline) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer pipelines = stack.ints(pipeline);
            nglDeleteProgramPipelines(1, memAddress(pipelines));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGenProgramPipelines ] ---

    /** {@code void glGenProgramPipelines(GLsizei n, GLuint * pipelines)} */
    public static native void nglGenProgramPipelines(int n, long pipelines);

    /** {@code void glGenProgramPipelines(GLsizei n, GLuint * pipelines)} */
    public static void glGenProgramPipelines(@NativeType("GLuint *") IntBuffer pipelines) {
        nglGenProgramPipelines(pipelines.remaining(), memAddress(pipelines));
    }

    /** {@code void glGenProgramPipelines(GLsizei n, GLuint * pipelines)} */
    @NativeType("void")
    public static int glGenProgramPipelines() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer pipelines = stack.callocInt(1);
            nglGenProgramPipelines(1, memAddress(pipelines));
            return pipelines.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glIsProgramPipeline ] ---

    /** {@code GLboolean glIsProgramPipeline(GLuint pipeline)} */
    @NativeType("GLboolean")
    public static native boolean glIsProgramPipeline(@NativeType("GLuint") int pipeline);

    // --- [ glGetProgramPipelineiv ] ---

    /** {@code void glGetProgramPipelineiv(GLuint pipeline, GLenum pname, GLint * params)} */
    public static native void nglGetProgramPipelineiv(int pipeline, int pname, long params);

    /** {@code void glGetProgramPipelineiv(GLuint pipeline, GLenum pname, GLint * params)} */
    public static void glGetProgramPipelineiv(@NativeType("GLuint") int pipeline, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetProgramPipelineiv(pipeline, pname, memAddress(params));
    }

    /** {@code void glGetProgramPipelineiv(GLuint pipeline, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetProgramPipelinei(@NativeType("GLuint") int pipeline, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetProgramPipelineiv(pipeline, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glProgramUniform1i ] ---

    /** {@code void glProgramUniform1i(GLuint program, GLint location, GLint x)} */
    public static native void glProgramUniform1i(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint") int x);

    // --- [ glProgramUniform2i ] ---

    /** {@code void glProgramUniform2i(GLuint program, GLint location, GLint x, GLint y)} */
    public static native void glProgramUniform2i(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint") int x, @NativeType("GLint") int y);

    // --- [ glProgramUniform3i ] ---

    /** {@code void glProgramUniform3i(GLuint program, GLint location, GLint x, GLint y, GLint z)} */
    public static native void glProgramUniform3i(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z);

    // --- [ glProgramUniform4i ] ---

    /** {@code void glProgramUniform4i(GLuint program, GLint location, GLint x, GLint y, GLint z, GLint w)} */
    public static native void glProgramUniform4i(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z, @NativeType("GLint") int w);

    // --- [ glProgramUniform1ui ] ---

    /** {@code void glProgramUniform1ui(GLuint program, GLint location, GLuint x)} */
    public static native void glProgramUniform1ui(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint") int x);

    // --- [ glProgramUniform2ui ] ---

    /** {@code void glProgramUniform2ui(GLuint program, GLint location, GLuint x, GLuint y)} */
    public static native void glProgramUniform2ui(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint") int x, @NativeType("GLuint") int y);

    // --- [ glProgramUniform3ui ] ---

    /** {@code void glProgramUniform3ui(GLuint program, GLint location, GLuint x, GLuint y, GLuint z)} */
    public static native void glProgramUniform3ui(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint") int x, @NativeType("GLuint") int y, @NativeType("GLuint") int z);

    // --- [ glProgramUniform4ui ] ---

    /** {@code void glProgramUniform4ui(GLuint program, GLint location, GLuint x, GLuint y, GLuint z, GLuint w)} */
    public static native void glProgramUniform4ui(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint") int x, @NativeType("GLuint") int y, @NativeType("GLuint") int z, @NativeType("GLuint") int w);

    // --- [ glProgramUniform1f ] ---

    /** {@code void glProgramUniform1f(GLuint program, GLint location, GLfloat x)} */
    public static native void glProgramUniform1f(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat") float x);

    // --- [ glProgramUniform2f ] ---

    /** {@code void glProgramUniform2f(GLuint program, GLint location, GLfloat x, GLfloat y)} */
    public static native void glProgramUniform2f(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat") float x, @NativeType("GLfloat") float y);

    // --- [ glProgramUniform3f ] ---

    /** {@code void glProgramUniform3f(GLuint program, GLint location, GLfloat x, GLfloat y, GLfloat z)} */
    public static native void glProgramUniform3f(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float z);

    // --- [ glProgramUniform4f ] ---

    /** {@code void glProgramUniform4f(GLuint program, GLint location, GLfloat x, GLfloat y, GLfloat z, GLfloat w)} */
    public static native void glProgramUniform4f(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float z, @NativeType("GLfloat") float w);

    // --- [ glProgramUniform1d ] ---

    /** {@code void glProgramUniform1d(GLuint program, GLint location, GLdouble x)} */
    public static native void glProgramUniform1d(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble") double x);

    // --- [ glProgramUniform2d ] ---

    /** {@code void glProgramUniform2d(GLuint program, GLint location, GLdouble x, GLdouble y)} */
    public static native void glProgramUniform2d(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y);

    // --- [ glProgramUniform3d ] ---

    /** {@code void glProgramUniform3d(GLuint program, GLint location, GLdouble x, GLdouble y, GLdouble z)} */
    public static native void glProgramUniform3d(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z);

    // --- [ glProgramUniform4d ] ---

    /** {@code void glProgramUniform4d(GLuint program, GLint location, GLdouble x, GLdouble y, GLdouble z, GLdouble w)} */
    public static native void glProgramUniform4d(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z, @NativeType("GLdouble") double w);

    // --- [ glProgramUniform1iv ] ---

    /** {@code void glProgramUniform1iv(GLuint program, GLint location, GLsizei count, GLint const * value)} */
    public static native void nglProgramUniform1iv(int program, int location, int count, long value);

    /** {@code void glProgramUniform1iv(GLuint program, GLint location, GLsizei count, GLint const * value)} */
    public static void glProgramUniform1iv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        nglProgramUniform1iv(program, location, value.remaining(), memAddress(value));
    }

    // --- [ glProgramUniform2iv ] ---

    /** {@code void glProgramUniform2iv(GLuint program, GLint location, GLsizei count, GLint const * value)} */
    public static native void nglProgramUniform2iv(int program, int location, int count, long value);

    /** {@code void glProgramUniform2iv(GLuint program, GLint location, GLsizei count, GLint const * value)} */
    public static void glProgramUniform2iv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        nglProgramUniform2iv(program, location, value.remaining() >> 1, memAddress(value));
    }

    // --- [ glProgramUniform3iv ] ---

    /** {@code void glProgramUniform3iv(GLuint program, GLint location, GLsizei count, GLint const * value)} */
    public static native void nglProgramUniform3iv(int program, int location, int count, long value);

    /** {@code void glProgramUniform3iv(GLuint program, GLint location, GLsizei count, GLint const * value)} */
    public static void glProgramUniform3iv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        nglProgramUniform3iv(program, location, value.remaining() / 3, memAddress(value));
    }

    // --- [ glProgramUniform4iv ] ---

    /** {@code void glProgramUniform4iv(GLuint program, GLint location, GLsizei count, GLint const * value)} */
    public static native void nglProgramUniform4iv(int program, int location, int count, long value);

    /** {@code void glProgramUniform4iv(GLuint program, GLint location, GLsizei count, GLint const * value)} */
    public static void glProgramUniform4iv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        nglProgramUniform4iv(program, location, value.remaining() >> 2, memAddress(value));
    }

    // --- [ glProgramUniform1uiv ] ---

    /** {@code void glProgramUniform1uiv(GLuint program, GLint location, GLsizei count, GLuint const * value)} */
    public static native void nglProgramUniform1uiv(int program, int location, int count, long value);

    /** {@code void glProgramUniform1uiv(GLuint program, GLint location, GLsizei count, GLuint const * value)} */
    public static void glProgramUniform1uiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        nglProgramUniform1uiv(program, location, value.remaining(), memAddress(value));
    }

    // --- [ glProgramUniform2uiv ] ---

    /** {@code void glProgramUniform2uiv(GLuint program, GLint location, GLsizei count, GLuint const * value)} */
    public static native void nglProgramUniform2uiv(int program, int location, int count, long value);

    /** {@code void glProgramUniform2uiv(GLuint program, GLint location, GLsizei count, GLuint const * value)} */
    public static void glProgramUniform2uiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        nglProgramUniform2uiv(program, location, value.remaining() >> 1, memAddress(value));
    }

    // --- [ glProgramUniform3uiv ] ---

    /** {@code void glProgramUniform3uiv(GLuint program, GLint location, GLsizei count, GLuint const * value)} */
    public static native void nglProgramUniform3uiv(int program, int location, int count, long value);

    /** {@code void glProgramUniform3uiv(GLuint program, GLint location, GLsizei count, GLuint const * value)} */
    public static void glProgramUniform3uiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        nglProgramUniform3uiv(program, location, value.remaining() / 3, memAddress(value));
    }

    // --- [ glProgramUniform4uiv ] ---

    /** {@code void glProgramUniform4uiv(GLuint program, GLint location, GLsizei count, GLuint const * value)} */
    public static native void nglProgramUniform4uiv(int program, int location, int count, long value);

    /** {@code void glProgramUniform4uiv(GLuint program, GLint location, GLsizei count, GLuint const * value)} */
    public static void glProgramUniform4uiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        nglProgramUniform4uiv(program, location, value.remaining() >> 2, memAddress(value));
    }

    // --- [ glProgramUniform1fv ] ---

    /** {@code void glProgramUniform1fv(GLuint program, GLint location, GLsizei count, GLfloat const * value)} */
    public static native void nglProgramUniform1fv(int program, int location, int count, long value);

    /** {@code void glProgramUniform1fv(GLuint program, GLint location, GLsizei count, GLfloat const * value)} */
    public static void glProgramUniform1fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniform1fv(program, location, value.remaining(), memAddress(value));
    }

    // --- [ glProgramUniform2fv ] ---

    /** {@code void glProgramUniform2fv(GLuint program, GLint location, GLsizei count, GLfloat const * value)} */
    public static native void nglProgramUniform2fv(int program, int location, int count, long value);

    /** {@code void glProgramUniform2fv(GLuint program, GLint location, GLsizei count, GLfloat const * value)} */
    public static void glProgramUniform2fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniform2fv(program, location, value.remaining() >> 1, memAddress(value));
    }

    // --- [ glProgramUniform3fv ] ---

    /** {@code void glProgramUniform3fv(GLuint program, GLint location, GLsizei count, GLfloat const * value)} */
    public static native void nglProgramUniform3fv(int program, int location, int count, long value);

    /** {@code void glProgramUniform3fv(GLuint program, GLint location, GLsizei count, GLfloat const * value)} */
    public static void glProgramUniform3fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniform3fv(program, location, value.remaining() / 3, memAddress(value));
    }

    // --- [ glProgramUniform4fv ] ---

    /** {@code void glProgramUniform4fv(GLuint program, GLint location, GLsizei count, GLfloat const * value)} */
    public static native void nglProgramUniform4fv(int program, int location, int count, long value);

    /** {@code void glProgramUniform4fv(GLuint program, GLint location, GLsizei count, GLfloat const * value)} */
    public static void glProgramUniform4fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniform4fv(program, location, value.remaining() >> 2, memAddress(value));
    }

    // --- [ glProgramUniform1dv ] ---

    /** {@code void glProgramUniform1dv(GLuint program, GLint location, GLsizei count, GLdouble const * value)} */
    public static native void nglProgramUniform1dv(int program, int location, int count, long value);

    /** {@code void glProgramUniform1dv(GLuint program, GLint location, GLsizei count, GLdouble const * value)} */
    public static void glProgramUniform1dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble const *") DoubleBuffer value) {
        nglProgramUniform1dv(program, location, value.remaining(), memAddress(value));
    }

    // --- [ glProgramUniform2dv ] ---

    /** {@code void glProgramUniform2dv(GLuint program, GLint location, GLsizei count, GLdouble const * value)} */
    public static native void nglProgramUniform2dv(int program, int location, int count, long value);

    /** {@code void glProgramUniform2dv(GLuint program, GLint location, GLsizei count, GLdouble const * value)} */
    public static void glProgramUniform2dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble const *") DoubleBuffer value) {
        nglProgramUniform2dv(program, location, value.remaining() >> 1, memAddress(value));
    }

    // --- [ glProgramUniform3dv ] ---

    /** {@code void glProgramUniform3dv(GLuint program, GLint location, GLsizei count, GLdouble const * value)} */
    public static native void nglProgramUniform3dv(int program, int location, int count, long value);

    /** {@code void glProgramUniform3dv(GLuint program, GLint location, GLsizei count, GLdouble const * value)} */
    public static void glProgramUniform3dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble const *") DoubleBuffer value) {
        nglProgramUniform3dv(program, location, value.remaining() / 3, memAddress(value));
    }

    // --- [ glProgramUniform4dv ] ---

    /** {@code void glProgramUniform4dv(GLuint program, GLint location, GLsizei count, GLdouble const * value)} */
    public static native void nglProgramUniform4dv(int program, int location, int count, long value);

    /** {@code void glProgramUniform4dv(GLuint program, GLint location, GLsizei count, GLdouble const * value)} */
    public static void glProgramUniform4dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble const *") DoubleBuffer value) {
        nglProgramUniform4dv(program, location, value.remaining() >> 2, memAddress(value));
    }

    // --- [ glProgramUniformMatrix2fv ] ---

    /** {@code void glProgramUniformMatrix2fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglProgramUniformMatrix2fv(int program, int location, int count, boolean transpose, long value);

    /** {@code void glProgramUniformMatrix2fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix2fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix2fv(program, location, value.remaining() >> 2, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix3fv ] ---

    /** {@code void glProgramUniformMatrix3fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglProgramUniformMatrix3fv(int program, int location, int count, boolean transpose, long value);

    /** {@code void glProgramUniformMatrix3fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix3fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix3fv(program, location, value.remaining() / 9, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix4fv ] ---

    /** {@code void glProgramUniformMatrix4fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglProgramUniformMatrix4fv(int program, int location, int count, boolean transpose, long value);

    /** {@code void glProgramUniformMatrix4fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix4fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix4fv(program, location, value.remaining() >> 4, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix2dv ] ---

    /** {@code void glProgramUniformMatrix2dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static native void nglProgramUniformMatrix2dv(int program, int location, int count, boolean transpose, long value);

    /** {@code void glProgramUniformMatrix2dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glProgramUniformMatrix2dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        nglProgramUniformMatrix2dv(program, location, value.remaining() >> 2, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix3dv ] ---

    /** {@code void glProgramUniformMatrix3dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static native void nglProgramUniformMatrix3dv(int program, int location, int count, boolean transpose, long value);

    /** {@code void glProgramUniformMatrix3dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glProgramUniformMatrix3dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        nglProgramUniformMatrix3dv(program, location, value.remaining() / 9, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix4dv ] ---

    /** {@code void glProgramUniformMatrix4dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static native void nglProgramUniformMatrix4dv(int program, int location, int count, boolean transpose, long value);

    /** {@code void glProgramUniformMatrix4dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glProgramUniformMatrix4dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        nglProgramUniformMatrix4dv(program, location, value.remaining() >> 4, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix2x3fv ] ---

    /** {@code void glProgramUniformMatrix2x3fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglProgramUniformMatrix2x3fv(int program, int location, int count, boolean transpose, long value);

    /** {@code void glProgramUniformMatrix2x3fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix2x3fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix2x3fv(program, location, value.remaining() / 6, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix3x2fv ] ---

    /** {@code void glProgramUniformMatrix3x2fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglProgramUniformMatrix3x2fv(int program, int location, int count, boolean transpose, long value);

    /** {@code void glProgramUniformMatrix3x2fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix3x2fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix3x2fv(program, location, value.remaining() / 6, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix2x4fv ] ---

    /** {@code void glProgramUniformMatrix2x4fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglProgramUniformMatrix2x4fv(int program, int location, int count, boolean transpose, long value);

    /** {@code void glProgramUniformMatrix2x4fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix2x4fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix2x4fv(program, location, value.remaining() >> 3, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix4x2fv ] ---

    /** {@code void glProgramUniformMatrix4x2fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglProgramUniformMatrix4x2fv(int program, int location, int count, boolean transpose, long value);

    /** {@code void glProgramUniformMatrix4x2fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix4x2fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix4x2fv(program, location, value.remaining() >> 3, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix3x4fv ] ---

    /** {@code void glProgramUniformMatrix3x4fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglProgramUniformMatrix3x4fv(int program, int location, int count, boolean transpose, long value);

    /** {@code void glProgramUniformMatrix3x4fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix3x4fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix3x4fv(program, location, value.remaining() / 12, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix4x3fv ] ---

    /** {@code void glProgramUniformMatrix4x3fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglProgramUniformMatrix4x3fv(int program, int location, int count, boolean transpose, long value);

    /** {@code void glProgramUniformMatrix4x3fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix4x3fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix4x3fv(program, location, value.remaining() / 12, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix2x3dv ] ---

    /** {@code void glProgramUniformMatrix2x3dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static native void nglProgramUniformMatrix2x3dv(int program, int location, int count, boolean transpose, long value);

    /** {@code void glProgramUniformMatrix2x3dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glProgramUniformMatrix2x3dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        nglProgramUniformMatrix2x3dv(program, location, value.remaining() / 6, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix3x2dv ] ---

    /** {@code void glProgramUniformMatrix3x2dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static native void nglProgramUniformMatrix3x2dv(int program, int location, int count, boolean transpose, long value);

    /** {@code void glProgramUniformMatrix3x2dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glProgramUniformMatrix3x2dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        nglProgramUniformMatrix3x2dv(program, location, value.remaining() / 6, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix2x4dv ] ---

    /** {@code void glProgramUniformMatrix2x4dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static native void nglProgramUniformMatrix2x4dv(int program, int location, int count, boolean transpose, long value);

    /** {@code void glProgramUniformMatrix2x4dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glProgramUniformMatrix2x4dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        nglProgramUniformMatrix2x4dv(program, location, value.remaining() >> 3, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix4x2dv ] ---

    /** {@code void glProgramUniformMatrix4x2dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static native void nglProgramUniformMatrix4x2dv(int program, int location, int count, boolean transpose, long value);

    /** {@code void glProgramUniformMatrix4x2dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glProgramUniformMatrix4x2dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        nglProgramUniformMatrix4x2dv(program, location, value.remaining() >> 3, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix3x4dv ] ---

    /** {@code void glProgramUniformMatrix3x4dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static native void nglProgramUniformMatrix3x4dv(int program, int location, int count, boolean transpose, long value);

    /** {@code void glProgramUniformMatrix3x4dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glProgramUniformMatrix3x4dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        nglProgramUniformMatrix3x4dv(program, location, value.remaining() / 12, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix4x3dv ] ---

    /** {@code void glProgramUniformMatrix4x3dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static native void nglProgramUniformMatrix4x3dv(int program, int location, int count, boolean transpose, long value);

    /** {@code void glProgramUniformMatrix4x3dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glProgramUniformMatrix4x3dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        nglProgramUniformMatrix4x3dv(program, location, value.remaining() / 12, transpose, memAddress(value));
    }

    // --- [ glValidateProgramPipeline ] ---

    /** {@code void glValidateProgramPipeline(GLuint pipeline)} */
    public static native void glValidateProgramPipeline(@NativeType("GLuint") int pipeline);

    // --- [ glGetProgramPipelineInfoLog ] ---

    /** {@code void glGetProgramPipelineInfoLog(GLuint pipeline, GLsizei bufSize, GLsizei * length, GLchar * infoLog)} */
    public static native void nglGetProgramPipelineInfoLog(int pipeline, int bufSize, long length, long infoLog);

    /** {@code void glGetProgramPipelineInfoLog(GLuint pipeline, GLsizei bufSize, GLsizei * length, GLchar * infoLog)} */
    public static void glGetProgramPipelineInfoLog(@NativeType("GLuint") int pipeline, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLchar *") ByteBuffer infoLog) {
        if (CHECKS) {
            checkSafe(length, 1);
        }
        nglGetProgramPipelineInfoLog(pipeline, infoLog.remaining(), memAddressSafe(length), memAddress(infoLog));
    }

    /** {@code void glGetProgramPipelineInfoLog(GLuint pipeline, GLsizei bufSize, GLsizei * length, GLchar * infoLog)} */
    @NativeType("void")
    public static String glGetProgramPipelineInfoLog(@NativeType("GLuint") int pipeline, @NativeType("GLsizei") int bufSize) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        ByteBuffer infoLog = memAlloc(bufSize);
        try {
            IntBuffer length = stack.ints(0);
            nglGetProgramPipelineInfoLog(pipeline, bufSize, memAddress(length), memAddress(infoLog));
            return memUTF8(infoLog, length.get(0));
        } finally {
            memFree(infoLog);
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glGetProgramPipelineInfoLog(GLuint pipeline, GLsizei bufSize, GLsizei * length, GLchar * infoLog)} */
    @NativeType("void")
    public static String glGetProgramPipelineInfoLog(@NativeType("GLuint") int pipeline) {
        return glGetProgramPipelineInfoLog(pipeline, glGetProgramPipelinei(pipeline, GL20.GL_INFO_LOG_LENGTH));
    }

    // --- [ glVertexAttribL1d ] ---

    /** {@code void glVertexAttribL1d(GLuint index, GLdouble x)} */
    public static native void glVertexAttribL1d(@NativeType("GLuint") int index, @NativeType("GLdouble") double x);

    // --- [ glVertexAttribL2d ] ---

    /** {@code void glVertexAttribL2d(GLuint index, GLdouble x, GLdouble y)} */
    public static native void glVertexAttribL2d(@NativeType("GLuint") int index, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y);

    // --- [ glVertexAttribL3d ] ---

    /** {@code void glVertexAttribL3d(GLuint index, GLdouble x, GLdouble y, GLdouble z)} */
    public static native void glVertexAttribL3d(@NativeType("GLuint") int index, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z);

    // --- [ glVertexAttribL4d ] ---

    /** {@code void glVertexAttribL4d(GLuint index, GLdouble x, GLdouble y, GLdouble z, GLdouble w)} */
    public static native void glVertexAttribL4d(@NativeType("GLuint") int index, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z, @NativeType("GLdouble") double w);

    // --- [ glVertexAttribL1dv ] ---

    /** {@code void glVertexAttribL1dv(GLuint index, GLdouble const * v)} */
    public static native void nglVertexAttribL1dv(int index, long v);

    /** {@code void glVertexAttribL1dv(GLuint index, GLdouble const * v)} */
    public static void glVertexAttribL1dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") DoubleBuffer v) {
        if (CHECKS) {
            check(v, 1);
        }
        nglVertexAttribL1dv(index, memAddress(v));
    }

    // --- [ glVertexAttribL2dv ] ---

    /** {@code void glVertexAttribL2dv(GLuint index, GLdouble const * v)} */
    public static native void nglVertexAttribL2dv(int index, long v);

    /** {@code void glVertexAttribL2dv(GLuint index, GLdouble const * v)} */
    public static void glVertexAttribL2dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") DoubleBuffer v) {
        if (CHECKS) {
            check(v, 2);
        }
        nglVertexAttribL2dv(index, memAddress(v));
    }

    // --- [ glVertexAttribL3dv ] ---

    /** {@code void glVertexAttribL3dv(GLuint index, GLdouble const * v)} */
    public static native void nglVertexAttribL3dv(int index, long v);

    /** {@code void glVertexAttribL3dv(GLuint index, GLdouble const * v)} */
    public static void glVertexAttribL3dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") DoubleBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglVertexAttribL3dv(index, memAddress(v));
    }

    // --- [ glVertexAttribL4dv ] ---

    /** {@code void glVertexAttribL4dv(GLuint index, GLdouble const * v)} */
    public static native void nglVertexAttribL4dv(int index, long v);

    /** {@code void glVertexAttribL4dv(GLuint index, GLdouble const * v)} */
    public static void glVertexAttribL4dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") DoubleBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttribL4dv(index, memAddress(v));
    }

    // --- [ glVertexAttribLPointer ] ---

    /** {@code void glVertexAttribLPointer(GLuint index, GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static native void nglVertexAttribLPointer(int index, int size, int type, int stride, long pointer);

    /** {@code void glVertexAttribLPointer(GLuint index, GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void glVertexAttribLPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ByteBuffer pointer) {
        nglVertexAttribLPointer(index, size, type, stride, memAddress(pointer));
    }

    /** {@code void glVertexAttribLPointer(GLuint index, GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void glVertexAttribLPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") long pointer) {
        nglVertexAttribLPointer(index, size, type, stride, pointer);
    }

    /** {@code void glVertexAttribLPointer(GLuint index, GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void glVertexAttribLPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLsizei") int stride, @NativeType("void const *") DoubleBuffer pointer) {
        nglVertexAttribLPointer(index, size, GL11.GL_DOUBLE, stride, memAddress(pointer));
    }

    // --- [ glGetVertexAttribLdv ] ---

    /** {@code void glGetVertexAttribLdv(GLuint index, GLenum pname, GLdouble * params)} */
    public static native void nglGetVertexAttribLdv(int index, int pname, long params);

    /** {@code void glGetVertexAttribLdv(GLuint index, GLenum pname, GLdouble * params)} */
    public static void glGetVertexAttribLdv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLdouble *") DoubleBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetVertexAttribLdv(index, pname, memAddress(params));
    }

    // --- [ glViewportArrayv ] ---

    /** {@code void glViewportArrayv(GLuint first, GLsizei count, GLfloat const * v)} */
    public static native void nglViewportArrayv(int first, int count, long v);

    /** {@code void glViewportArrayv(GLuint first, GLsizei count, GLfloat const * v)} */
    public static void glViewportArrayv(@NativeType("GLuint") int first, @NativeType("GLfloat const *") FloatBuffer v) {
        nglViewportArrayv(first, v.remaining() >> 2, memAddress(v));
    }

    // --- [ glViewportIndexedf ] ---

    /** {@code void glViewportIndexedf(GLuint index, GLfloat x, GLfloat y, GLfloat w, GLfloat h)} */
    public static native void glViewportIndexedf(@NativeType("GLuint") int index, @NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float w, @NativeType("GLfloat") float h);

    // --- [ glViewportIndexedfv ] ---

    /** {@code void glViewportIndexedfv(GLuint index, GLfloat const * v)} */
    public static native void nglViewportIndexedfv(int index, long v);

    /** {@code void glViewportIndexedfv(GLuint index, GLfloat const * v)} */
    public static void glViewportIndexedfv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglViewportIndexedfv(index, memAddress(v));
    }

    // --- [ glScissorArrayv ] ---

    /** {@code void glScissorArrayv(GLuint first, GLsizei count, GLint const * v)} */
    public static native void nglScissorArrayv(int first, int count, long v);

    /** {@code void glScissorArrayv(GLuint first, GLsizei count, GLint const * v)} */
    public static void glScissorArrayv(@NativeType("GLuint") int first, @NativeType("GLint const *") IntBuffer v) {
        nglScissorArrayv(first, v.remaining() >> 2, memAddress(v));
    }

    // --- [ glScissorIndexed ] ---

    /** {@code void glScissorIndexed(GLuint index, GLint left, GLint bottom, GLsizei width, GLsizei height)} */
    public static native void glScissorIndexed(@NativeType("GLuint") int index, @NativeType("GLint") int left, @NativeType("GLint") int bottom, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

    // --- [ glScissorIndexedv ] ---

    /** {@code void glScissorIndexedv(GLuint index, GLint const * v)} */
    public static native void nglScissorIndexedv(int index, long v);

    /** {@code void glScissorIndexedv(GLuint index, GLint const * v)} */
    public static void glScissorIndexedv(@NativeType("GLuint") int index, @NativeType("GLint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglScissorIndexedv(index, memAddress(v));
    }

    // --- [ glDepthRangeArrayv ] ---

    /** {@code void glDepthRangeArrayv(GLuint first, GLsizei count, GLdouble const * v)} */
    public static native void nglDepthRangeArrayv(int first, int count, long v);

    /** {@code void glDepthRangeArrayv(GLuint first, GLsizei count, GLdouble const * v)} */
    public static void glDepthRangeArrayv(@NativeType("GLuint") int first, @NativeType("GLdouble const *") DoubleBuffer v) {
        nglDepthRangeArrayv(first, v.remaining() >> 1, memAddress(v));
    }

    // --- [ glDepthRangeIndexed ] ---

    /** {@code void glDepthRangeIndexed(GLuint index, GLdouble zNear, GLdouble zFar)} */
    public static native void glDepthRangeIndexed(@NativeType("GLuint") int index, @NativeType("GLdouble") double zNear, @NativeType("GLdouble") double zFar);

    // --- [ glGetFloati_v ] ---

    /** {@code void glGetFloati_v(GLenum target, GLuint index, GLfloat * data)} */
    public static native void nglGetFloati_v(int target, int index, long data);

    /** {@code void glGetFloati_v(GLenum target, GLuint index, GLfloat * data)} */
    public static void glGetFloati_v(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat *") FloatBuffer data) {
        if (CHECKS) {
            check(data, 1);
        }
        nglGetFloati_v(target, index, memAddress(data));
    }

    /** {@code void glGetFloati_v(GLenum target, GLuint index, GLfloat * data)} */
    @NativeType("void")
    public static float glGetFloati(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer data = stack.callocFloat(1);
            nglGetFloati_v(target, index, memAddress(data));
            return data.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetDoublei_v ] ---

    /** {@code void glGetDoublei_v(GLenum target, GLuint index, GLdouble * data)} */
    public static native void nglGetDoublei_v(int target, int index, long data);

    /** {@code void glGetDoublei_v(GLenum target, GLuint index, GLdouble * data)} */
    public static void glGetDoublei_v(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLdouble *") DoubleBuffer data) {
        if (CHECKS) {
            check(data, 1);
        }
        nglGetDoublei_v(target, index, memAddress(data));
    }

    /** {@code void glGetDoublei_v(GLenum target, GLuint index, GLdouble * data)} */
    @NativeType("void")
    public static double glGetDoublei(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            DoubleBuffer data = stack.callocDouble(1);
            nglGetDoublei_v(target, index, memAddress(data));
            return data.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glShaderBinary(GLsizei count, GLuint const * shaders, GLenum binaryformat, void const * binary, GLsizei length)} */
    public static void glShaderBinary(@NativeType("GLuint const *") int[] shaders, @NativeType("GLenum") int binaryformat, @NativeType("void const *") ByteBuffer binary) {
        long __functionAddress = GL.getICD().glShaderBinary;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(shaders.length, shaders, binaryformat, memAddress(binary), binary.remaining(), __functionAddress);
    }

    /** {@code void glGetShaderPrecisionFormat(GLenum shadertype, GLenum precisiontype, GLint * range, GLint * precision)} */
    public static void glGetShaderPrecisionFormat(@NativeType("GLenum") int shadertype, @NativeType("GLenum") int precisiontype, @NativeType("GLint *") int[] range, @NativeType("GLint *") int[] precision) {
        long __functionAddress = GL.getICD().glGetShaderPrecisionFormat;
        if (CHECKS) {
            check(__functionAddress);
            check(range, 2);
            check(precision, 1);
        }
        callPPV(shadertype, precisiontype, range, precision, __functionAddress);
    }

    /** {@code void glGetProgramBinary(GLuint program, GLsizei bufSize, GLsizei * length, GLenum * binaryFormat, void * binary)} */
    public static void glGetProgramBinary(@NativeType("GLuint") int program, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLenum *") int[] binaryFormat, @NativeType("void *") ByteBuffer binary) {
        long __functionAddress = GL.getICD().glGetProgramBinary;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(length, 1);
            check(binaryFormat, 1);
        }
        callPPPV(program, binary.remaining(), length, binaryFormat, memAddress(binary), __functionAddress);
    }

    /** {@code void glDeleteProgramPipelines(GLsizei n, GLuint const * pipelines)} */
    public static void glDeleteProgramPipelines(@NativeType("GLuint const *") int[] pipelines) {
        long __functionAddress = GL.getICD().glDeleteProgramPipelines;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(pipelines.length, pipelines, __functionAddress);
    }

    /** {@code void glGenProgramPipelines(GLsizei n, GLuint * pipelines)} */
    public static void glGenProgramPipelines(@NativeType("GLuint *") int[] pipelines) {
        long __functionAddress = GL.getICD().glGenProgramPipelines;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(pipelines.length, pipelines, __functionAddress);
    }

    /** {@code void glGetProgramPipelineiv(GLuint pipeline, GLenum pname, GLint * params)} */
    public static void glGetProgramPipelineiv(@NativeType("GLuint") int pipeline, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetProgramPipelineiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(pipeline, pname, params, __functionAddress);
    }

    /** {@code void glProgramUniform1iv(GLuint program, GLint location, GLsizei count, GLint const * value)} */
    public static void glProgramUniform1iv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        long __functionAddress = GL.getICD().glProgramUniform1iv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length, value, __functionAddress);
    }

    /** {@code void glProgramUniform2iv(GLuint program, GLint location, GLsizei count, GLint const * value)} */
    public static void glProgramUniform2iv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        long __functionAddress = GL.getICD().glProgramUniform2iv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 1, value, __functionAddress);
    }

    /** {@code void glProgramUniform3iv(GLuint program, GLint location, GLsizei count, GLint const * value)} */
    public static void glProgramUniform3iv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        long __functionAddress = GL.getICD().glProgramUniform3iv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 3, value, __functionAddress);
    }

    /** {@code void glProgramUniform4iv(GLuint program, GLint location, GLsizei count, GLint const * value)} */
    public static void glProgramUniform4iv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        long __functionAddress = GL.getICD().glProgramUniform4iv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 2, value, __functionAddress);
    }

    /** {@code void glProgramUniform1uiv(GLuint program, GLint location, GLsizei count, GLuint const * value)} */
    public static void glProgramUniform1uiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GL.getICD().glProgramUniform1uiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length, value, __functionAddress);
    }

    /** {@code void glProgramUniform2uiv(GLuint program, GLint location, GLsizei count, GLuint const * value)} */
    public static void glProgramUniform2uiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GL.getICD().glProgramUniform2uiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 1, value, __functionAddress);
    }

    /** {@code void glProgramUniform3uiv(GLuint program, GLint location, GLsizei count, GLuint const * value)} */
    public static void glProgramUniform3uiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GL.getICD().glProgramUniform3uiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 3, value, __functionAddress);
    }

    /** {@code void glProgramUniform4uiv(GLuint program, GLint location, GLsizei count, GLuint const * value)} */
    public static void glProgramUniform4uiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GL.getICD().glProgramUniform4uiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 2, value, __functionAddress);
    }

    /** {@code void glProgramUniform1fv(GLuint program, GLint location, GLsizei count, GLfloat const * value)} */
    public static void glProgramUniform1fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glProgramUniform1fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length, value, __functionAddress);
    }

    /** {@code void glProgramUniform2fv(GLuint program, GLint location, GLsizei count, GLfloat const * value)} */
    public static void glProgramUniform2fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glProgramUniform2fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 1, value, __functionAddress);
    }

    /** {@code void glProgramUniform3fv(GLuint program, GLint location, GLsizei count, GLfloat const * value)} */
    public static void glProgramUniform3fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glProgramUniform3fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 3, value, __functionAddress);
    }

    /** {@code void glProgramUniform4fv(GLuint program, GLint location, GLsizei count, GLfloat const * value)} */
    public static void glProgramUniform4fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glProgramUniform4fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 2, value, __functionAddress);
    }

    /** {@code void glProgramUniform1dv(GLuint program, GLint location, GLsizei count, GLdouble const * value)} */
    public static void glProgramUniform1dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble const *") double[] value) {
        long __functionAddress = GL.getICD().glProgramUniform1dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length, value, __functionAddress);
    }

    /** {@code void glProgramUniform2dv(GLuint program, GLint location, GLsizei count, GLdouble const * value)} */
    public static void glProgramUniform2dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble const *") double[] value) {
        long __functionAddress = GL.getICD().glProgramUniform2dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 1, value, __functionAddress);
    }

    /** {@code void glProgramUniform3dv(GLuint program, GLint location, GLsizei count, GLdouble const * value)} */
    public static void glProgramUniform3dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble const *") double[] value) {
        long __functionAddress = GL.getICD().glProgramUniform3dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 3, value, __functionAddress);
    }

    /** {@code void glProgramUniform4dv(GLuint program, GLint location, GLsizei count, GLdouble const * value)} */
    public static void glProgramUniform4dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble const *") double[] value) {
        long __functionAddress = GL.getICD().glProgramUniform4dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 2, value, __functionAddress);
    }

    /** {@code void glProgramUniformMatrix2fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix2fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix2fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 2, transpose, value, __functionAddress);
    }

    /** {@code void glProgramUniformMatrix3fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix3fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix3fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 9, transpose, value, __functionAddress);
    }

    /** {@code void glProgramUniformMatrix4fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix4fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix4fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 4, transpose, value, __functionAddress);
    }

    /** {@code void glProgramUniformMatrix2dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glProgramUniformMatrix2dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix2dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 2, transpose, value, __functionAddress);
    }

    /** {@code void glProgramUniformMatrix3dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glProgramUniformMatrix3dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix3dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 9, transpose, value, __functionAddress);
    }

    /** {@code void glProgramUniformMatrix4dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glProgramUniformMatrix4dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix4dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 4, transpose, value, __functionAddress);
    }

    /** {@code void glProgramUniformMatrix2x3fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix2x3fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix2x3fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 6, transpose, value, __functionAddress);
    }

    /** {@code void glProgramUniformMatrix3x2fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix3x2fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix3x2fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 6, transpose, value, __functionAddress);
    }

    /** {@code void glProgramUniformMatrix2x4fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix2x4fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix2x4fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 3, transpose, value, __functionAddress);
    }

    /** {@code void glProgramUniformMatrix4x2fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix4x2fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix4x2fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 3, transpose, value, __functionAddress);
    }

    /** {@code void glProgramUniformMatrix3x4fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix3x4fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix3x4fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 12, transpose, value, __functionAddress);
    }

    /** {@code void glProgramUniformMatrix4x3fv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix4x3fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix4x3fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 12, transpose, value, __functionAddress);
    }

    /** {@code void glProgramUniformMatrix2x3dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glProgramUniformMatrix2x3dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix2x3dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 6, transpose, value, __functionAddress);
    }

    /** {@code void glProgramUniformMatrix3x2dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glProgramUniformMatrix3x2dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix3x2dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 6, transpose, value, __functionAddress);
    }

    /** {@code void glProgramUniformMatrix2x4dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glProgramUniformMatrix2x4dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix2x4dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 3, transpose, value, __functionAddress);
    }

    /** {@code void glProgramUniformMatrix4x2dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glProgramUniformMatrix4x2dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix4x2dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 3, transpose, value, __functionAddress);
    }

    /** {@code void glProgramUniformMatrix3x4dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glProgramUniformMatrix3x4dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix3x4dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 12, transpose, value, __functionAddress);
    }

    /** {@code void glProgramUniformMatrix4x3dv(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLdouble const * value)} */
    public static void glProgramUniformMatrix4x3dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        long __functionAddress = GL.getICD().glProgramUniformMatrix4x3dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 12, transpose, value, __functionAddress);
    }

    /** {@code void glGetProgramPipelineInfoLog(GLuint pipeline, GLsizei bufSize, GLsizei * length, GLchar * infoLog)} */
    public static void glGetProgramPipelineInfoLog(@NativeType("GLuint") int pipeline, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLchar *") ByteBuffer infoLog) {
        long __functionAddress = GL.getICD().glGetProgramPipelineInfoLog;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(length, 1);
        }
        callPPV(pipeline, infoLog.remaining(), length, memAddress(infoLog), __functionAddress);
    }

    /** {@code void glVertexAttribL1dv(GLuint index, GLdouble const * v)} */
    public static void glVertexAttribL1dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") double[] v) {
        long __functionAddress = GL.getICD().glVertexAttribL1dv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 1);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttribL2dv(GLuint index, GLdouble const * v)} */
    public static void glVertexAttribL2dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") double[] v) {
        long __functionAddress = GL.getICD().glVertexAttribL2dv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 2);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttribL3dv(GLuint index, GLdouble const * v)} */
    public static void glVertexAttribL3dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") double[] v) {
        long __functionAddress = GL.getICD().glVertexAttribL3dv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttribL4dv(GLuint index, GLdouble const * v)} */
    public static void glVertexAttribL4dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") double[] v) {
        long __functionAddress = GL.getICD().glVertexAttribL4dv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glGetVertexAttribLdv(GLuint index, GLenum pname, GLdouble * params)} */
    public static void glGetVertexAttribLdv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLdouble *") double[] params) {
        long __functionAddress = GL.getICD().glGetVertexAttribLdv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(index, pname, params, __functionAddress);
    }

    /** {@code void glViewportArrayv(GLuint first, GLsizei count, GLfloat const * v)} */
    public static void glViewportArrayv(@NativeType("GLuint") int first, @NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GL.getICD().glViewportArrayv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(first, v.length >> 2, v, __functionAddress);
    }

    /** {@code void glViewportIndexedfv(GLuint index, GLfloat const * v)} */
    public static void glViewportIndexedfv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GL.getICD().glViewportIndexedfv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glScissorArrayv(GLuint first, GLsizei count, GLint const * v)} */
    public static void glScissorArrayv(@NativeType("GLuint") int first, @NativeType("GLint const *") int[] v) {
        long __functionAddress = GL.getICD().glScissorArrayv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(first, v.length >> 2, v, __functionAddress);
    }

    /** {@code void glScissorIndexedv(GLuint index, GLint const * v)} */
    public static void glScissorIndexedv(@NativeType("GLuint") int index, @NativeType("GLint const *") int[] v) {
        long __functionAddress = GL.getICD().glScissorIndexedv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glDepthRangeArrayv(GLuint first, GLsizei count, GLdouble const * v)} */
    public static void glDepthRangeArrayv(@NativeType("GLuint") int first, @NativeType("GLdouble const *") double[] v) {
        long __functionAddress = GL.getICD().glDepthRangeArrayv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(first, v.length >> 1, v, __functionAddress);
    }

    /** {@code void glGetFloati_v(GLenum target, GLuint index, GLfloat * data)} */
    public static void glGetFloati_v(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLfloat *") float[] data) {
        long __functionAddress = GL.getICD().glGetFloati_v;
        if (CHECKS) {
            check(__functionAddress);
            check(data, 1);
        }
        callPV(target, index, data, __functionAddress);
    }

    /** {@code void glGetDoublei_v(GLenum target, GLuint index, GLdouble * data)} */
    public static void glGetDoublei_v(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLdouble *") double[] data) {
        long __functionAddress = GL.getICD().glGetDoublei_v;
        if (CHECKS) {
            check(__functionAddress);
            check(data, 1);
        }
        callPV(target, index, data, __functionAddress);
    }

}
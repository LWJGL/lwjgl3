/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class EXTSeparateShaderObjects {

    static { GLES.initialize(); }

    public static final int
        GL_VERTEX_SHADER_BIT_EXT   = 0x1,
        GL_FRAGMENT_SHADER_BIT_EXT = 0x2,
        GL_ALL_SHADER_BITS_EXT     = 0xFFFFFFFF;

    public static final int GL_PROGRAM_SEPARABLE_EXT = 0x8258;

    public static final int GL_ACTIVE_PROGRAM_EXT = 0x8259;

    public static final int GL_PROGRAM_PIPELINE_BINDING_EXT = 0x825A;

    protected EXTSeparateShaderObjects() {
        throw new UnsupportedOperationException();
    }

    // --- [ glActiveShaderProgramEXT ] ---

    /** {@code void glActiveShaderProgramEXT(GLuint pipeline, GLuint program)} */
    public static native void glActiveShaderProgramEXT(@NativeType("GLuint") int pipeline, @NativeType("GLuint") int program);

    // --- [ glBindProgramPipelineEXT ] ---

    /** {@code void glBindProgramPipelineEXT(GLuint pipeline)} */
    public static native void glBindProgramPipelineEXT(@NativeType("GLuint") int pipeline);

    // --- [ glCreateShaderProgramvEXT ] ---

    /** {@code GLuint glCreateShaderProgramvEXT(GLenum type, GLsizei count, GLchar const * const * strings)} */
    public static native int nglCreateShaderProgramvEXT(int type, int count, long strings);

    /** {@code GLuint glCreateShaderProgramvEXT(GLenum type, GLsizei count, GLchar const * const * strings)} */
    @NativeType("GLuint")
    public static int glCreateShaderProgramvEXT(@NativeType("GLenum") int type, @NativeType("GLchar const * const *") PointerBuffer strings) {
        return nglCreateShaderProgramvEXT(type, strings.remaining(), memAddress(strings));
    }

    /** {@code GLuint glCreateShaderProgramvEXT(GLenum type, GLsizei count, GLchar const * const * strings)} */
    @NativeType("GLuint")
    public static int glCreateShaderProgramvEXT(@NativeType("GLenum") int type, @NativeType("GLchar const * const *") CharSequence... strings) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long stringsAddress = org.lwjgl.system.APIUtil.apiArray(stack, MemoryUtil::memUTF8, strings);
            int __result = nglCreateShaderProgramvEXT(type, strings.length, stringsAddress);
            org.lwjgl.system.APIUtil.apiArrayFree(stringsAddress, strings.length);
            return __result;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code GLuint glCreateShaderProgramvEXT(GLenum type, GLsizei count, GLchar const * const * strings)} */
    @NativeType("GLuint")
    public static int glCreateShaderProgramvEXT(@NativeType("GLenum") int type, @NativeType("GLchar const * const *") CharSequence string) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long stringsAddress = org.lwjgl.system.APIUtil.apiArray(stack, MemoryUtil::memUTF8, string);
            int __result = nglCreateShaderProgramvEXT(type, 1, stringsAddress);
            org.lwjgl.system.APIUtil.apiArrayFree(stringsAddress, 1);
            return __result;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glDeleteProgramPipelinesEXT ] ---

    /** {@code void glDeleteProgramPipelinesEXT(GLsizei n, GLuint const * pipelines)} */
    public static native void nglDeleteProgramPipelinesEXT(int n, long pipelines);

    /** {@code void glDeleteProgramPipelinesEXT(GLsizei n, GLuint const * pipelines)} */
    public static void glDeleteProgramPipelinesEXT(@NativeType("GLuint const *") IntBuffer pipelines) {
        nglDeleteProgramPipelinesEXT(pipelines.remaining(), memAddress(pipelines));
    }

    /** {@code void glDeleteProgramPipelinesEXT(GLsizei n, GLuint const * pipelines)} */
    public static void glDeleteProgramPipelinesEXT(@NativeType("GLuint const *") int pipeline) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer pipelines = stack.ints(pipeline);
            nglDeleteProgramPipelinesEXT(1, memAddress(pipelines));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGenProgramPipelinesEXT ] ---

    /** {@code void glGenProgramPipelinesEXT(GLsizei n, GLuint * pipelines)} */
    public static native void nglGenProgramPipelinesEXT(int n, long pipelines);

    /** {@code void glGenProgramPipelinesEXT(GLsizei n, GLuint * pipelines)} */
    public static void glGenProgramPipelinesEXT(@NativeType("GLuint *") IntBuffer pipelines) {
        nglGenProgramPipelinesEXT(pipelines.remaining(), memAddress(pipelines));
    }

    /** {@code void glGenProgramPipelinesEXT(GLsizei n, GLuint * pipelines)} */
    @NativeType("void")
    public static int glGenProgramPipelinesEXT() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer pipelines = stack.callocInt(1);
            nglGenProgramPipelinesEXT(1, memAddress(pipelines));
            return pipelines.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetProgramPipelineInfoLogEXT ] ---

    /** {@code void glGetProgramPipelineInfoLogEXT(GLuint pipeline, GLsizei bufSize, GLsizei * length, GLchar * infoLog)} */
    public static native void nglGetProgramPipelineInfoLogEXT(int pipeline, int bufSize, long length, long infoLog);

    /** {@code void glGetProgramPipelineInfoLogEXT(GLuint pipeline, GLsizei bufSize, GLsizei * length, GLchar * infoLog)} */
    public static void glGetProgramPipelineInfoLogEXT(@NativeType("GLuint") int pipeline, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLchar *") ByteBuffer infoLog) {
        if (CHECKS) {
            checkSafe(length, 1);
        }
        nglGetProgramPipelineInfoLogEXT(pipeline, infoLog.remaining(), memAddressSafe(length), memAddress(infoLog));
    }

    /** {@code void glGetProgramPipelineInfoLogEXT(GLuint pipeline, GLsizei bufSize, GLsizei * length, GLchar * infoLog)} */
    @NativeType("void")
    public static String glGetProgramPipelineInfoLogEXT(@NativeType("GLuint") int pipeline, @NativeType("GLsizei") int bufSize) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        ByteBuffer infoLog = memAlloc(bufSize);
        try {
            IntBuffer length = stack.ints(0);
            nglGetProgramPipelineInfoLogEXT(pipeline, bufSize, memAddress(length), memAddress(infoLog));
            return memUTF8(infoLog, length.get(0));
        } finally {
            memFree(infoLog);
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glGetProgramPipelineInfoLogEXT(GLuint pipeline, GLsizei bufSize, GLsizei * length, GLchar * infoLog)} */
    @NativeType("void")
    public static String glGetProgramPipelineInfoLogEXT(@NativeType("GLuint") int pipeline) {
        return glGetProgramPipelineInfoLogEXT(pipeline, glGetProgramPipelineiEXT(pipeline, GLES20.GL_INFO_LOG_LENGTH));
    }

    // --- [ glGetProgramPipelineivEXT ] ---

    /** {@code void glGetProgramPipelineivEXT(GLuint pipeline, GLenum pname, GLint * params)} */
    public static native void nglGetProgramPipelineivEXT(int pipeline, int pname, long params);

    /** {@code void glGetProgramPipelineivEXT(GLuint pipeline, GLenum pname, GLint * params)} */
    public static void glGetProgramPipelineivEXT(@NativeType("GLuint") int pipeline, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetProgramPipelineivEXT(pipeline, pname, memAddress(params));
    }

    /** {@code void glGetProgramPipelineivEXT(GLuint pipeline, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetProgramPipelineiEXT(@NativeType("GLuint") int pipeline, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetProgramPipelineivEXT(pipeline, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glIsProgramPipelineEXT ] ---

    /** {@code GLboolean glIsProgramPipelineEXT(GLuint pipeline)} */
    @NativeType("GLboolean")
    public static native boolean glIsProgramPipelineEXT(@NativeType("GLuint") int pipeline);

    // --- [ glProgramParameteriEXT ] ---

    /** {@code void glProgramParameteriEXT(GLuint program, GLenum pname, GLint value)} */
    public static native void glProgramParameteriEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int pname, @NativeType("GLint") int value);

    // --- [ glProgramUniform1fEXT ] ---

    /** {@code void glProgramUniform1fEXT(GLuint program, GLint location, GLfloat v0)} */
    public static native void glProgramUniform1fEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat") float v0);

    // --- [ glProgramUniform1fvEXT ] ---

    /** {@code void glProgramUniform1fvEXT(GLuint program, GLint location, GLsizei count, GLfloat const * value)} */
    public static native void nglProgramUniform1fvEXT(int program, int location, int count, long value);

    /** {@code void glProgramUniform1fvEXT(GLuint program, GLint location, GLsizei count, GLfloat const * value)} */
    public static void glProgramUniform1fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniform1fvEXT(program, location, value.remaining(), memAddress(value));
    }

    // --- [ glProgramUniform1iEXT ] ---

    /** {@code void glProgramUniform1iEXT(GLuint program, GLint location, GLint v0)} */
    public static native void glProgramUniform1iEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint") int v0);

    // --- [ glProgramUniform1ivEXT ] ---

    /** {@code void glProgramUniform1ivEXT(GLuint program, GLint location, GLsizei count, GLint const * value)} */
    public static native void nglProgramUniform1ivEXT(int program, int location, int count, long value);

    /** {@code void glProgramUniform1ivEXT(GLuint program, GLint location, GLsizei count, GLint const * value)} */
    public static void glProgramUniform1ivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        nglProgramUniform1ivEXT(program, location, value.remaining(), memAddress(value));
    }

    // --- [ glProgramUniform2fEXT ] ---

    /** {@code void glProgramUniform2fEXT(GLuint program, GLint location, GLfloat v0, GLfloat v1)} */
    public static native void glProgramUniform2fEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1);

    // --- [ glProgramUniform2fvEXT ] ---

    /** {@code void glProgramUniform2fvEXT(GLuint program, GLint location, GLsizei count, GLfloat const * value)} */
    public static native void nglProgramUniform2fvEXT(int program, int location, int count, long value);

    /** {@code void glProgramUniform2fvEXT(GLuint program, GLint location, GLsizei count, GLfloat const * value)} */
    public static void glProgramUniform2fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniform2fvEXT(program, location, value.remaining() >> 1, memAddress(value));
    }

    // --- [ glProgramUniform2iEXT ] ---

    /** {@code void glProgramUniform2iEXT(GLuint program, GLint location, GLint v0, GLint v1)} */
    public static native void glProgramUniform2iEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint") int v0, @NativeType("GLint") int v1);

    // --- [ glProgramUniform2ivEXT ] ---

    /** {@code void glProgramUniform2ivEXT(GLuint program, GLint location, GLsizei count, GLint const * value)} */
    public static native void nglProgramUniform2ivEXT(int program, int location, int count, long value);

    /** {@code void glProgramUniform2ivEXT(GLuint program, GLint location, GLsizei count, GLint const * value)} */
    public static void glProgramUniform2ivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        nglProgramUniform2ivEXT(program, location, value.remaining() >> 1, memAddress(value));
    }

    // --- [ glProgramUniform3fEXT ] ---

    /** {@code void glProgramUniform3fEXT(GLuint program, GLint location, GLfloat v0, GLfloat v1, GLfloat v2)} */
    public static native void glProgramUniform3fEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2);

    // --- [ glProgramUniform3fvEXT ] ---

    /** {@code void glProgramUniform3fvEXT(GLuint program, GLint location, GLsizei count, GLfloat const * value)} */
    public static native void nglProgramUniform3fvEXT(int program, int location, int count, long value);

    /** {@code void glProgramUniform3fvEXT(GLuint program, GLint location, GLsizei count, GLfloat const * value)} */
    public static void glProgramUniform3fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniform3fvEXT(program, location, value.remaining() / 3, memAddress(value));
    }

    // --- [ glProgramUniform3iEXT ] ---

    /** {@code void glProgramUniform3iEXT(GLuint program, GLint location, GLint v0, GLint v1, GLint v2)} */
    public static native void glProgramUniform3iEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint") int v0, @NativeType("GLint") int v1, @NativeType("GLint") int v2);

    // --- [ glProgramUniform3ivEXT ] ---

    /** {@code void glProgramUniform3ivEXT(GLuint program, GLint location, GLsizei count, GLint const * value)} */
    public static native void nglProgramUniform3ivEXT(int program, int location, int count, long value);

    /** {@code void glProgramUniform3ivEXT(GLuint program, GLint location, GLsizei count, GLint const * value)} */
    public static void glProgramUniform3ivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        nglProgramUniform3ivEXT(program, location, value.remaining() / 3, memAddress(value));
    }

    // --- [ glProgramUniform4fEXT ] ---

    /** {@code void glProgramUniform4fEXT(GLuint program, GLint location, GLfloat v0, GLfloat v1, GLfloat v2, GLfloat v3)} */
    public static native void glProgramUniform4fEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2, @NativeType("GLfloat") float v3);

    // --- [ glProgramUniform4fvEXT ] ---

    /** {@code void glProgramUniform4fvEXT(GLuint program, GLint location, GLsizei count, GLfloat const * value)} */
    public static native void nglProgramUniform4fvEXT(int program, int location, int count, long value);

    /** {@code void glProgramUniform4fvEXT(GLuint program, GLint location, GLsizei count, GLfloat const * value)} */
    public static void glProgramUniform4fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniform4fvEXT(program, location, value.remaining() >> 2, memAddress(value));
    }

    // --- [ glProgramUniform4iEXT ] ---

    /** {@code void glProgramUniform4iEXT(GLuint program, GLint location, GLint v0, GLint v1, GLint v2, GLint v3)} */
    public static native void glProgramUniform4iEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint") int v0, @NativeType("GLint") int v1, @NativeType("GLint") int v2, @NativeType("GLint") int v3);

    // --- [ glProgramUniform4ivEXT ] ---

    /** {@code void glProgramUniform4ivEXT(GLuint program, GLint location, GLsizei count, GLint const * value)} */
    public static native void nglProgramUniform4ivEXT(int program, int location, int count, long value);

    /** {@code void glProgramUniform4ivEXT(GLuint program, GLint location, GLsizei count, GLint const * value)} */
    public static void glProgramUniform4ivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        nglProgramUniform4ivEXT(program, location, value.remaining() >> 2, memAddress(value));
    }

    // --- [ glProgramUniformMatrix2fvEXT ] ---

    /** {@code void glProgramUniformMatrix2fvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglProgramUniformMatrix2fvEXT(int program, int location, int count, boolean transpose, long value);

    /** {@code void glProgramUniformMatrix2fvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix2fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix2fvEXT(program, location, value.remaining() >> 2, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix3fvEXT ] ---

    /** {@code void glProgramUniformMatrix3fvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglProgramUniformMatrix3fvEXT(int program, int location, int count, boolean transpose, long value);

    /** {@code void glProgramUniformMatrix3fvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix3fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix3fvEXT(program, location, value.remaining() / 9, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix4fvEXT ] ---

    /** {@code void glProgramUniformMatrix4fvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglProgramUniformMatrix4fvEXT(int program, int location, int count, boolean transpose, long value);

    /** {@code void glProgramUniformMatrix4fvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix4fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix4fvEXT(program, location, value.remaining() >> 4, transpose, memAddress(value));
    }

    // --- [ glUseProgramStagesEXT ] ---

    /** {@code void glUseProgramStagesEXT(GLuint pipeline, GLbitfield stages, GLuint program)} */
    public static native void glUseProgramStagesEXT(@NativeType("GLuint") int pipeline, @NativeType("GLbitfield") int stages, @NativeType("GLuint") int program);

    // --- [ glValidateProgramPipelineEXT ] ---

    /** {@code void glValidateProgramPipelineEXT(GLuint pipeline)} */
    public static native void glValidateProgramPipelineEXT(@NativeType("GLuint") int pipeline);

    // --- [ glProgramUniform1uiEXT ] ---

    /** {@code void glProgramUniform1uiEXT(GLuint program, GLint location, GLuint v0)} */
    public static native void glProgramUniform1uiEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint") int v0);

    // --- [ glProgramUniform2uiEXT ] ---

    /** {@code void glProgramUniform2uiEXT(GLuint program, GLint location, GLuint v0, GLuint v1)} */
    public static native void glProgramUniform2uiEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint") int v0, @NativeType("GLuint") int v1);

    // --- [ glProgramUniform3uiEXT ] ---

    /** {@code void glProgramUniform3uiEXT(GLuint program, GLint location, GLuint v0, GLuint v1, GLuint v2)} */
    public static native void glProgramUniform3uiEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint") int v0, @NativeType("GLuint") int v1, @NativeType("GLuint") int v2);

    // --- [ glProgramUniform4uiEXT ] ---

    /** {@code void glProgramUniform4uiEXT(GLuint program, GLint location, GLuint v0, GLuint v1, GLuint v2, GLuint v3)} */
    public static native void glProgramUniform4uiEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint") int v0, @NativeType("GLuint") int v1, @NativeType("GLuint") int v2, @NativeType("GLuint") int v3);

    // --- [ glProgramUniform1uivEXT ] ---

    /** {@code void glProgramUniform1uivEXT(GLuint program, GLint location, GLsizei count, GLuint const * value)} */
    public static native void nglProgramUniform1uivEXT(int program, int location, int count, long value);

    /** {@code void glProgramUniform1uivEXT(GLuint program, GLint location, GLsizei count, GLuint const * value)} */
    public static void glProgramUniform1uivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        nglProgramUniform1uivEXT(program, location, value.remaining(), memAddress(value));
    }

    // --- [ glProgramUniform2uivEXT ] ---

    /** {@code void glProgramUniform2uivEXT(GLuint program, GLint location, GLsizei count, GLuint const * value)} */
    public static native void nglProgramUniform2uivEXT(int program, int location, int count, long value);

    /** {@code void glProgramUniform2uivEXT(GLuint program, GLint location, GLsizei count, GLuint const * value)} */
    public static void glProgramUniform2uivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        nglProgramUniform2uivEXT(program, location, value.remaining() >> 1, memAddress(value));
    }

    // --- [ glProgramUniform3uivEXT ] ---

    /** {@code void glProgramUniform3uivEXT(GLuint program, GLint location, GLsizei count, GLuint const * value)} */
    public static native void nglProgramUniform3uivEXT(int program, int location, int count, long value);

    /** {@code void glProgramUniform3uivEXT(GLuint program, GLint location, GLsizei count, GLuint const * value)} */
    public static void glProgramUniform3uivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        nglProgramUniform3uivEXT(program, location, value.remaining() / 3, memAddress(value));
    }

    // --- [ glProgramUniform4uivEXT ] ---

    /** {@code void glProgramUniform4uivEXT(GLuint program, GLint location, GLsizei count, GLuint const * value)} */
    public static native void nglProgramUniform4uivEXT(int program, int location, int count, long value);

    /** {@code void glProgramUniform4uivEXT(GLuint program, GLint location, GLsizei count, GLuint const * value)} */
    public static void glProgramUniform4uivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        nglProgramUniform4uivEXT(program, location, value.remaining() >> 2, memAddress(value));
    }

    // --- [ glProgramUniformMatrix2x3fvEXT ] ---

    /** {@code void glProgramUniformMatrix2x3fvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglProgramUniformMatrix2x3fvEXT(int program, int location, int count, boolean transpose, long value);

    /** {@code void glProgramUniformMatrix2x3fvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix2x3fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix2x3fvEXT(program, location, value.remaining() / 6, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix3x2fvEXT ] ---

    /** {@code void glProgramUniformMatrix3x2fvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglProgramUniformMatrix3x2fvEXT(int program, int location, int count, boolean transpose, long value);

    /** {@code void glProgramUniformMatrix3x2fvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix3x2fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix3x2fvEXT(program, location, value.remaining() / 6, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix2x4fvEXT ] ---

    /** {@code void glProgramUniformMatrix2x4fvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglProgramUniformMatrix2x4fvEXT(int program, int location, int count, boolean transpose, long value);

    /** {@code void glProgramUniformMatrix2x4fvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix2x4fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix2x4fvEXT(program, location, value.remaining() >> 3, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix4x2fvEXT ] ---

    /** {@code void glProgramUniformMatrix4x2fvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglProgramUniformMatrix4x2fvEXT(int program, int location, int count, boolean transpose, long value);

    /** {@code void glProgramUniformMatrix4x2fvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix4x2fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix4x2fvEXT(program, location, value.remaining() >> 3, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix3x4fvEXT ] ---

    /** {@code void glProgramUniformMatrix3x4fvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglProgramUniformMatrix3x4fvEXT(int program, int location, int count, boolean transpose, long value);

    /** {@code void glProgramUniformMatrix3x4fvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix3x4fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix3x4fvEXT(program, location, value.remaining() / 12, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix4x3fvEXT ] ---

    /** {@code void glProgramUniformMatrix4x3fvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglProgramUniformMatrix4x3fvEXT(int program, int location, int count, boolean transpose, long value);

    /** {@code void glProgramUniformMatrix4x3fvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix4x3fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix4x3fvEXT(program, location, value.remaining() / 12, transpose, memAddress(value));
    }

    /** {@code void glDeleteProgramPipelinesEXT(GLsizei n, GLuint const * pipelines)} */
    public static void glDeleteProgramPipelinesEXT(@NativeType("GLuint const *") int[] pipelines) {
        long __functionAddress = GLES.getICD().glDeleteProgramPipelinesEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(pipelines.length, pipelines, __functionAddress);
    }

    /** {@code void glGenProgramPipelinesEXT(GLsizei n, GLuint * pipelines)} */
    public static void glGenProgramPipelinesEXT(@NativeType("GLuint *") int[] pipelines) {
        long __functionAddress = GLES.getICD().glGenProgramPipelinesEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(pipelines.length, pipelines, __functionAddress);
    }

    /** {@code void glGetProgramPipelineInfoLogEXT(GLuint pipeline, GLsizei bufSize, GLsizei * length, GLchar * infoLog)} */
    public static void glGetProgramPipelineInfoLogEXT(@NativeType("GLuint") int pipeline, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLchar *") ByteBuffer infoLog) {
        long __functionAddress = GLES.getICD().glGetProgramPipelineInfoLogEXT;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(length, 1);
        }
        callPPV(pipeline, infoLog.remaining(), length, memAddress(infoLog), __functionAddress);
    }

    /** {@code void glGetProgramPipelineivEXT(GLuint pipeline, GLenum pname, GLint * params)} */
    public static void glGetProgramPipelineivEXT(@NativeType("GLuint") int pipeline, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetProgramPipelineivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(pipeline, pname, params, __functionAddress);
    }

    /** {@code void glProgramUniform1fvEXT(GLuint program, GLint location, GLsizei count, GLfloat const * value)} */
    public static void glProgramUniform1fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glProgramUniform1fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length, value, __functionAddress);
    }

    /** {@code void glProgramUniform1ivEXT(GLuint program, GLint location, GLsizei count, GLint const * value)} */
    public static void glProgramUniform1ivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        long __functionAddress = GLES.getICD().glProgramUniform1ivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length, value, __functionAddress);
    }

    /** {@code void glProgramUniform2fvEXT(GLuint program, GLint location, GLsizei count, GLfloat const * value)} */
    public static void glProgramUniform2fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glProgramUniform2fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 1, value, __functionAddress);
    }

    /** {@code void glProgramUniform2ivEXT(GLuint program, GLint location, GLsizei count, GLint const * value)} */
    public static void glProgramUniform2ivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        long __functionAddress = GLES.getICD().glProgramUniform2ivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 1, value, __functionAddress);
    }

    /** {@code void glProgramUniform3fvEXT(GLuint program, GLint location, GLsizei count, GLfloat const * value)} */
    public static void glProgramUniform3fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glProgramUniform3fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 3, value, __functionAddress);
    }

    /** {@code void glProgramUniform3ivEXT(GLuint program, GLint location, GLsizei count, GLint const * value)} */
    public static void glProgramUniform3ivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        long __functionAddress = GLES.getICD().glProgramUniform3ivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 3, value, __functionAddress);
    }

    /** {@code void glProgramUniform4fvEXT(GLuint program, GLint location, GLsizei count, GLfloat const * value)} */
    public static void glProgramUniform4fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glProgramUniform4fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 2, value, __functionAddress);
    }

    /** {@code void glProgramUniform4ivEXT(GLuint program, GLint location, GLsizei count, GLint const * value)} */
    public static void glProgramUniform4ivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        long __functionAddress = GLES.getICD().glProgramUniform4ivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 2, value, __functionAddress);
    }

    /** {@code void glProgramUniformMatrix2fvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix2fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glProgramUniformMatrix2fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 2, transpose, value, __functionAddress);
    }

    /** {@code void glProgramUniformMatrix3fvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix3fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glProgramUniformMatrix3fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 9, transpose, value, __functionAddress);
    }

    /** {@code void glProgramUniformMatrix4fvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix4fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glProgramUniformMatrix4fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 4, transpose, value, __functionAddress);
    }

    /** {@code void glProgramUniform1uivEXT(GLuint program, GLint location, GLsizei count, GLuint const * value)} */
    public static void glProgramUniform1uivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GLES.getICD().glProgramUniform1uivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length, value, __functionAddress);
    }

    /** {@code void glProgramUniform2uivEXT(GLuint program, GLint location, GLsizei count, GLuint const * value)} */
    public static void glProgramUniform2uivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GLES.getICD().glProgramUniform2uivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 1, value, __functionAddress);
    }

    /** {@code void glProgramUniform3uivEXT(GLuint program, GLint location, GLsizei count, GLuint const * value)} */
    public static void glProgramUniform3uivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GLES.getICD().glProgramUniform3uivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 3, value, __functionAddress);
    }

    /** {@code void glProgramUniform4uivEXT(GLuint program, GLint location, GLsizei count, GLuint const * value)} */
    public static void glProgramUniform4uivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GLES.getICD().glProgramUniform4uivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 2, value, __functionAddress);
    }

    /** {@code void glProgramUniformMatrix2x3fvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix2x3fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glProgramUniformMatrix2x3fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 6, transpose, value, __functionAddress);
    }

    /** {@code void glProgramUniformMatrix3x2fvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix3x2fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glProgramUniformMatrix3x2fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 6, transpose, value, __functionAddress);
    }

    /** {@code void glProgramUniformMatrix2x4fvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix2x4fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glProgramUniformMatrix2x4fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 3, transpose, value, __functionAddress);
    }

    /** {@code void glProgramUniformMatrix4x2fvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix4x2fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glProgramUniformMatrix4x2fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 3, transpose, value, __functionAddress);
    }

    /** {@code void glProgramUniformMatrix3x4fvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix3x4fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glProgramUniformMatrix3x4fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 12, transpose, value, __functionAddress);
    }

    /** {@code void glProgramUniformMatrix4x3fvEXT(GLuint program, GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glProgramUniformMatrix4x3fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glProgramUniformMatrix4x3fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 12, transpose, value, __functionAddress);
    }

}
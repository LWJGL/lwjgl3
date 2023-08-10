/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_separate_shader_objects.gles.txt">EXT_separate_shader_objects</a> extension.
 * 
 * <p>This extension is a subset of ARB_separate_shader_objects appropriate for OpenGL ES, and also tacks on ARB_explicit_attrib_location functionality.</p>
 * 
 * <p>Conventional GLSL requires multiple shader stages (vertex and fragment) to be linked into a single monolithic program object to specify a GLSL shader
 * for each stage.</p>
 * 
 * <p>While GLSL's monolithic approach has some advantages for optimizing shaders as a unit that span multiple stages, GPU hardware supports a more flexible
 * mix-and-match approach to specifying shaders independently for these different shader stages. Many developers build their shader content around the
 * mix-and-match approach where they can use a single vertex shader with multiple fragment shaders (or vice versa).</p>
 * 
 * <p>This extension adopts a "mix-and-match" shader stage model for GLSL allowing multiple different GLSL program objects to be bound at once each to an
 * individual rendering pipeline stage independently of other stage bindings. This allows program objects to contain only the shader stages that best suit
 * the application's needs.</p>
 * 
 * <p>This extension introduces the program pipeline object that serves as a container for the program bound to any particular rendering stage. It can be
 * bound, unbound, and rebound to simply save and restore the complete shader stage to program object bindings. Like framebuffer and vertex array objects,
 * program pipeline objects are "container" objects that are not shared between contexts.</p>
 * 
 * <p>To bind a program object to a specific shader stage or set of stages, UseProgramStagesEXT is used. The VERTEX_SHADER_BIT_EXT and
 * FRAGMENT_SHADER_BIT_EXT tokens refer to the conventional vertex and fragment stages, respectively. ActiveShaderProgramEXT specifies the program that
 * Uniform* commands will update.</p>
 * 
 * <p>While ActiveShaderProgramEXT provides a selector for setting and querying uniform values of a program object with the conventional Uniform* commands,
 * the ProgramUniform* commands provide a selector-free way to modify uniforms of a GLSL program object without an explicit bind. This selector-free model
 * reduces API overhead and provides a cleaner interface for applications.</p>
 * 
 * <p>Separate linking creates the possibility that certain output varyings of a shader may go unread by the subsequent shader input varyings. In this case,
 * the output varyings are simply ignored. It is also possible input varyings from a shader may not be written as output varyings of a preceding shader.
 * In this case, the unwritten input varying values are undefined.</p>
 * 
 * <p>This extension also introduces a layout location qualifier to GLSL to pre- assign attribute and varying locations to shader variables. This allows
 * applications to globally assign a particular semantic meaning, such as diffuse color or vertex normal, to a particular attribute and/or varying
 * location without knowing how that variable will be named in any particular shader.</p>
 * 
 * <p>Requires {@link GLES20 GLES 2.0}.</p>
 */
public class EXTSeparateShaderObjects {

    static { GLES.initialize(); }

    /** Accepted by {@code stages} parameter to UseProgramStagesEXT. */
    public static final int
        GL_VERTEX_SHADER_BIT_EXT   = 0x1,
        GL_FRAGMENT_SHADER_BIT_EXT = 0x2,
        GL_ALL_SHADER_BITS_EXT     = 0xFFFFFFFF;

    /** Accepted by the {@code pname} parameter of ProgramParameteriEXT and GetProgramiv. */
    public static final int GL_PROGRAM_SEPARABLE_EXT = 0x8258;

    /** Accepted by {@code type} parameter to GetProgramPipelineivEXT. */
    public static final int GL_ACTIVE_PROGRAM_EXT = 0x8259;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, and GetFloatv. */
    public static final int GL_PROGRAM_PIPELINE_BINDING_EXT = 0x825A;

    protected EXTSeparateShaderObjects() {
        throw new UnsupportedOperationException();
    }

    // --- [ glActiveShaderProgramEXT ] ---

    public static native void glActiveShaderProgramEXT(@NativeType("GLuint") int pipeline, @NativeType("GLuint") int program);

    // --- [ glBindProgramPipelineEXT ] ---

    public static native void glBindProgramPipelineEXT(@NativeType("GLuint") int pipeline);

    // --- [ glCreateShaderProgramvEXT ] ---

    public static native int nglCreateShaderProgramvEXT(int type, int count, long strings);

    @NativeType("GLuint")
    public static int glCreateShaderProgramvEXT(@NativeType("GLenum") int type, @NativeType("GLchar const * const *") PointerBuffer strings) {
        return nglCreateShaderProgramvEXT(type, strings.remaining(), memAddress(strings));
    }

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

    public static native void nglDeleteProgramPipelinesEXT(int n, long pipelines);

    public static void glDeleteProgramPipelinesEXT(@NativeType("GLuint const *") IntBuffer pipelines) {
        nglDeleteProgramPipelinesEXT(pipelines.remaining(), memAddress(pipelines));
    }

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

    public static native void nglGenProgramPipelinesEXT(int n, long pipelines);

    public static void glGenProgramPipelinesEXT(@NativeType("GLuint *") IntBuffer pipelines) {
        nglGenProgramPipelinesEXT(pipelines.remaining(), memAddress(pipelines));
    }

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

    public static native void nglGetProgramPipelineInfoLogEXT(int pipeline, int bufSize, long length, long infoLog);

    public static void glGetProgramPipelineInfoLogEXT(@NativeType("GLuint") int pipeline, @Nullable @NativeType("GLsizei *") IntBuffer length, @NativeType("GLchar *") ByteBuffer infoLog) {
        if (CHECKS) {
            checkSafe(length, 1);
        }
        nglGetProgramPipelineInfoLogEXT(pipeline, infoLog.remaining(), memAddressSafe(length), memAddress(infoLog));
    }

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

    @NativeType("void")
    public static String glGetProgramPipelineInfoLogEXT(@NativeType("GLuint") int pipeline) {
        return glGetProgramPipelineInfoLogEXT(pipeline, glGetProgramPipelineiEXT(pipeline, GLES20.GL_INFO_LOG_LENGTH));
    }

    // --- [ glGetProgramPipelineivEXT ] ---

    public static native void nglGetProgramPipelineivEXT(int pipeline, int pname, long params);

    public static void glGetProgramPipelineivEXT(@NativeType("GLuint") int pipeline, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetProgramPipelineivEXT(pipeline, pname, memAddress(params));
    }

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

    @NativeType("GLboolean")
    public static native boolean glIsProgramPipelineEXT(@NativeType("GLuint") int pipeline);

    // --- [ glProgramParameteriEXT ] ---

    public static native void glProgramParameteriEXT(@NativeType("GLuint") int program, @NativeType("GLenum") int pname, @NativeType("GLint") int value);

    // --- [ glProgramUniform1fEXT ] ---

    public static native void glProgramUniform1fEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat") float v0);

    // --- [ glProgramUniform1fvEXT ] ---

    public static native void nglProgramUniform1fvEXT(int program, int location, int count, long value);

    public static void glProgramUniform1fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniform1fvEXT(program, location, value.remaining(), memAddress(value));
    }

    // --- [ glProgramUniform1iEXT ] ---

    public static native void glProgramUniform1iEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint") int v0);

    // --- [ glProgramUniform1ivEXT ] ---

    public static native void nglProgramUniform1ivEXT(int program, int location, int count, long value);

    public static void glProgramUniform1ivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        nglProgramUniform1ivEXT(program, location, value.remaining(), memAddress(value));
    }

    // --- [ glProgramUniform2fEXT ] ---

    public static native void glProgramUniform2fEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1);

    // --- [ glProgramUniform2fvEXT ] ---

    public static native void nglProgramUniform2fvEXT(int program, int location, int count, long value);

    public static void glProgramUniform2fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniform2fvEXT(program, location, value.remaining() >> 1, memAddress(value));
    }

    // --- [ glProgramUniform2iEXT ] ---

    public static native void glProgramUniform2iEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint") int v0, @NativeType("GLint") int v1);

    // --- [ glProgramUniform2ivEXT ] ---

    public static native void nglProgramUniform2ivEXT(int program, int location, int count, long value);

    public static void glProgramUniform2ivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        nglProgramUniform2ivEXT(program, location, value.remaining() >> 1, memAddress(value));
    }

    // --- [ glProgramUniform3fEXT ] ---

    public static native void glProgramUniform3fEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2);

    // --- [ glProgramUniform3fvEXT ] ---

    public static native void nglProgramUniform3fvEXT(int program, int location, int count, long value);

    public static void glProgramUniform3fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniform3fvEXT(program, location, value.remaining() / 3, memAddress(value));
    }

    // --- [ glProgramUniform3iEXT ] ---

    public static native void glProgramUniform3iEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint") int v0, @NativeType("GLint") int v1, @NativeType("GLint") int v2);

    // --- [ glProgramUniform3ivEXT ] ---

    public static native void nglProgramUniform3ivEXT(int program, int location, int count, long value);

    public static void glProgramUniform3ivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        nglProgramUniform3ivEXT(program, location, value.remaining() / 3, memAddress(value));
    }

    // --- [ glProgramUniform4fEXT ] ---

    public static native void glProgramUniform4fEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2, @NativeType("GLfloat") float v3);

    // --- [ glProgramUniform4fvEXT ] ---

    public static native void nglProgramUniform4fvEXT(int program, int location, int count, long value);

    public static void glProgramUniform4fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniform4fvEXT(program, location, value.remaining() >> 2, memAddress(value));
    }

    // --- [ glProgramUniform4iEXT ] ---

    public static native void glProgramUniform4iEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint") int v0, @NativeType("GLint") int v1, @NativeType("GLint") int v2, @NativeType("GLint") int v3);

    // --- [ glProgramUniform4ivEXT ] ---

    public static native void nglProgramUniform4ivEXT(int program, int location, int count, long value);

    public static void glProgramUniform4ivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        nglProgramUniform4ivEXT(program, location, value.remaining() >> 2, memAddress(value));
    }

    // --- [ glProgramUniformMatrix2fvEXT ] ---

    public static native void nglProgramUniformMatrix2fvEXT(int program, int location, int count, boolean transpose, long value);

    public static void glProgramUniformMatrix2fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix2fvEXT(program, location, value.remaining() >> 2, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix3fvEXT ] ---

    public static native void nglProgramUniformMatrix3fvEXT(int program, int location, int count, boolean transpose, long value);

    public static void glProgramUniformMatrix3fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix3fvEXT(program, location, value.remaining() / 9, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix4fvEXT ] ---

    public static native void nglProgramUniformMatrix4fvEXT(int program, int location, int count, boolean transpose, long value);

    public static void glProgramUniformMatrix4fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix4fvEXT(program, location, value.remaining() >> 4, transpose, memAddress(value));
    }

    // --- [ glUseProgramStagesEXT ] ---

    public static native void glUseProgramStagesEXT(@NativeType("GLuint") int pipeline, @NativeType("GLbitfield") int stages, @NativeType("GLuint") int program);

    // --- [ glValidateProgramPipelineEXT ] ---

    public static native void glValidateProgramPipelineEXT(@NativeType("GLuint") int pipeline);

    // --- [ glProgramUniform1uiEXT ] ---

    public static native void glProgramUniform1uiEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint") int v0);

    // --- [ glProgramUniform2uiEXT ] ---

    public static native void glProgramUniform2uiEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint") int v0, @NativeType("GLuint") int v1);

    // --- [ glProgramUniform3uiEXT ] ---

    public static native void glProgramUniform3uiEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint") int v0, @NativeType("GLuint") int v1, @NativeType("GLuint") int v2);

    // --- [ glProgramUniform4uiEXT ] ---

    public static native void glProgramUniform4uiEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint") int v0, @NativeType("GLuint") int v1, @NativeType("GLuint") int v2, @NativeType("GLuint") int v3);

    // --- [ glProgramUniform1uivEXT ] ---

    public static native void nglProgramUniform1uivEXT(int program, int location, int count, long value);

    public static void glProgramUniform1uivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        nglProgramUniform1uivEXT(program, location, value.remaining(), memAddress(value));
    }

    // --- [ glProgramUniform2uivEXT ] ---

    public static native void nglProgramUniform2uivEXT(int program, int location, int count, long value);

    public static void glProgramUniform2uivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        nglProgramUniform2uivEXT(program, location, value.remaining() >> 1, memAddress(value));
    }

    // --- [ glProgramUniform3uivEXT ] ---

    public static native void nglProgramUniform3uivEXT(int program, int location, int count, long value);

    public static void glProgramUniform3uivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        nglProgramUniform3uivEXT(program, location, value.remaining() / 3, memAddress(value));
    }

    // --- [ glProgramUniform4uivEXT ] ---

    public static native void nglProgramUniform4uivEXT(int program, int location, int count, long value);

    public static void glProgramUniform4uivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        nglProgramUniform4uivEXT(program, location, value.remaining() >> 2, memAddress(value));
    }

    // --- [ glProgramUniformMatrix2x3fvEXT ] ---

    public static native void nglProgramUniformMatrix2x3fvEXT(int program, int location, int count, boolean transpose, long value);

    public static void glProgramUniformMatrix2x3fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix2x3fvEXT(program, location, value.remaining() / 6, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix3x2fvEXT ] ---

    public static native void nglProgramUniformMatrix3x2fvEXT(int program, int location, int count, boolean transpose, long value);

    public static void glProgramUniformMatrix3x2fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix3x2fvEXT(program, location, value.remaining() / 6, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix2x4fvEXT ] ---

    public static native void nglProgramUniformMatrix2x4fvEXT(int program, int location, int count, boolean transpose, long value);

    public static void glProgramUniformMatrix2x4fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix2x4fvEXT(program, location, value.remaining() >> 3, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix4x2fvEXT ] ---

    public static native void nglProgramUniformMatrix4x2fvEXT(int program, int location, int count, boolean transpose, long value);

    public static void glProgramUniformMatrix4x2fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix4x2fvEXT(program, location, value.remaining() >> 3, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix3x4fvEXT ] ---

    public static native void nglProgramUniformMatrix3x4fvEXT(int program, int location, int count, boolean transpose, long value);

    public static void glProgramUniformMatrix3x4fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix3x4fvEXT(program, location, value.remaining() / 12, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix4x3fvEXT ] ---

    public static native void nglProgramUniformMatrix4x3fvEXT(int program, int location, int count, boolean transpose, long value);

    public static void glProgramUniformMatrix4x3fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix4x3fvEXT(program, location, value.remaining() / 12, transpose, memAddress(value));
    }

    /** Array version of: {@link #glDeleteProgramPipelinesEXT DeleteProgramPipelinesEXT} */
    public static void glDeleteProgramPipelinesEXT(@NativeType("GLuint const *") int[] pipelines) {
        long __functionAddress = GLES.getICD().glDeleteProgramPipelinesEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(pipelines.length, pipelines, __functionAddress);
    }

    /** Array version of: {@link #glGenProgramPipelinesEXT GenProgramPipelinesEXT} */
    public static void glGenProgramPipelinesEXT(@NativeType("GLuint *") int[] pipelines) {
        long __functionAddress = GLES.getICD().glGenProgramPipelinesEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(pipelines.length, pipelines, __functionAddress);
    }

    /** Array version of: {@link #glGetProgramPipelineInfoLogEXT GetProgramPipelineInfoLogEXT} */
    public static void glGetProgramPipelineInfoLogEXT(@NativeType("GLuint") int pipeline, @Nullable @NativeType("GLsizei *") int[] length, @NativeType("GLchar *") ByteBuffer infoLog) {
        long __functionAddress = GLES.getICD().glGetProgramPipelineInfoLogEXT;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(length, 1);
        }
        callPPV(pipeline, infoLog.remaining(), length, memAddress(infoLog), __functionAddress);
    }

    /** Array version of: {@link #glGetProgramPipelineivEXT GetProgramPipelineivEXT} */
    public static void glGetProgramPipelineivEXT(@NativeType("GLuint") int pipeline, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetProgramPipelineivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(pipeline, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glProgramUniform1fvEXT ProgramUniform1fvEXT} */
    public static void glProgramUniform1fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glProgramUniform1fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length, value, __functionAddress);
    }

    /** Array version of: {@link #glProgramUniform1ivEXT ProgramUniform1ivEXT} */
    public static void glProgramUniform1ivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        long __functionAddress = GLES.getICD().glProgramUniform1ivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length, value, __functionAddress);
    }

    /** Array version of: {@link #glProgramUniform2fvEXT ProgramUniform2fvEXT} */
    public static void glProgramUniform2fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glProgramUniform2fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 1, value, __functionAddress);
    }

    /** Array version of: {@link #glProgramUniform2ivEXT ProgramUniform2ivEXT} */
    public static void glProgramUniform2ivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        long __functionAddress = GLES.getICD().glProgramUniform2ivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 1, value, __functionAddress);
    }

    /** Array version of: {@link #glProgramUniform3fvEXT ProgramUniform3fvEXT} */
    public static void glProgramUniform3fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glProgramUniform3fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 3, value, __functionAddress);
    }

    /** Array version of: {@link #glProgramUniform3ivEXT ProgramUniform3ivEXT} */
    public static void glProgramUniform3ivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        long __functionAddress = GLES.getICD().glProgramUniform3ivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 3, value, __functionAddress);
    }

    /** Array version of: {@link #glProgramUniform4fvEXT ProgramUniform4fvEXT} */
    public static void glProgramUniform4fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glProgramUniform4fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 2, value, __functionAddress);
    }

    /** Array version of: {@link #glProgramUniform4ivEXT ProgramUniform4ivEXT} */
    public static void glProgramUniform4ivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        long __functionAddress = GLES.getICD().glProgramUniform4ivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 2, value, __functionAddress);
    }

    /** Array version of: {@link #glProgramUniformMatrix2fvEXT ProgramUniformMatrix2fvEXT} */
    public static void glProgramUniformMatrix2fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glProgramUniformMatrix2fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 2, transpose, value, __functionAddress);
    }

    /** Array version of: {@link #glProgramUniformMatrix3fvEXT ProgramUniformMatrix3fvEXT} */
    public static void glProgramUniformMatrix3fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glProgramUniformMatrix3fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 9, transpose, value, __functionAddress);
    }

    /** Array version of: {@link #glProgramUniformMatrix4fvEXT ProgramUniformMatrix4fvEXT} */
    public static void glProgramUniformMatrix4fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glProgramUniformMatrix4fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 4, transpose, value, __functionAddress);
    }

    /** Array version of: {@link #glProgramUniform1uivEXT ProgramUniform1uivEXT} */
    public static void glProgramUniform1uivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GLES.getICD().glProgramUniform1uivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length, value, __functionAddress);
    }

    /** Array version of: {@link #glProgramUniform2uivEXT ProgramUniform2uivEXT} */
    public static void glProgramUniform2uivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GLES.getICD().glProgramUniform2uivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 1, value, __functionAddress);
    }

    /** Array version of: {@link #glProgramUniform3uivEXT ProgramUniform3uivEXT} */
    public static void glProgramUniform3uivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GLES.getICD().glProgramUniform3uivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 3, value, __functionAddress);
    }

    /** Array version of: {@link #glProgramUniform4uivEXT ProgramUniform4uivEXT} */
    public static void glProgramUniform4uivEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GLES.getICD().glProgramUniform4uivEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 2, value, __functionAddress);
    }

    /** Array version of: {@link #glProgramUniformMatrix2x3fvEXT ProgramUniformMatrix2x3fvEXT} */
    public static void glProgramUniformMatrix2x3fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glProgramUniformMatrix2x3fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 6, transpose, value, __functionAddress);
    }

    /** Array version of: {@link #glProgramUniformMatrix3x2fvEXT ProgramUniformMatrix3x2fvEXT} */
    public static void glProgramUniformMatrix3x2fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glProgramUniformMatrix3x2fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 6, transpose, value, __functionAddress);
    }

    /** Array version of: {@link #glProgramUniformMatrix2x4fvEXT ProgramUniformMatrix2x4fvEXT} */
    public static void glProgramUniformMatrix2x4fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glProgramUniformMatrix2x4fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 3, transpose, value, __functionAddress);
    }

    /** Array version of: {@link #glProgramUniformMatrix4x2fvEXT ProgramUniformMatrix4x2fvEXT} */
    public static void glProgramUniformMatrix4x2fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glProgramUniformMatrix4x2fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 3, transpose, value, __functionAddress);
    }

    /** Array version of: {@link #glProgramUniformMatrix3x4fvEXT ProgramUniformMatrix3x4fvEXT} */
    public static void glProgramUniformMatrix3x4fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glProgramUniformMatrix3x4fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 12, transpose, value, __functionAddress);
    }

    /** Array version of: {@link #glProgramUniformMatrix4x3fvEXT ProgramUniformMatrix4x3fvEXT} */
    public static void glProgramUniformMatrix4x3fvEXT(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glProgramUniformMatrix4x3fvEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 12, transpose, value, __functionAddress);
    }

}
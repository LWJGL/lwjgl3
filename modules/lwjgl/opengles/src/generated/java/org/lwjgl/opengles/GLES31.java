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

/** The core OpenGL ES 3.1 functionality. */
public class GLES31 extends GLES30 {

    public static final int
        GL_COMPUTE_SHADER                             = 0x91B9,
        GL_MAX_COMPUTE_UNIFORM_BLOCKS                 = 0x91BB,
        GL_MAX_COMPUTE_TEXTURE_IMAGE_UNITS            = 0x91BC,
        GL_MAX_COMPUTE_IMAGE_UNIFORMS                 = 0x91BD,
        GL_MAX_COMPUTE_SHARED_MEMORY_SIZE             = 0x8262,
        GL_MAX_COMPUTE_UNIFORM_COMPONENTS             = 0x8263,
        GL_MAX_COMPUTE_ATOMIC_COUNTER_BUFFERS         = 0x8264,
        GL_MAX_COMPUTE_ATOMIC_COUNTERS                = 0x8265,
        GL_MAX_COMBINED_COMPUTE_UNIFORM_COMPONENTS    = 0x8266,
        GL_MAX_COMPUTE_WORK_GROUP_INVOCATIONS         = 0x90EB,
        GL_MAX_COMPUTE_WORK_GROUP_COUNT               = 0x91BE,
        GL_MAX_COMPUTE_WORK_GROUP_SIZE                = 0x91BF,
        GL_COMPUTE_WORK_GROUP_SIZE                    = 0x8267,
        GL_DISPATCH_INDIRECT_BUFFER                   = 0x90EE,
        GL_DISPATCH_INDIRECT_BUFFER_BINDING           = 0x90EF,
        GL_COMPUTE_SHADER_BIT                         = 0x20,
        GL_DRAW_INDIRECT_BUFFER                       = 0x8F3F,
        GL_DRAW_INDIRECT_BUFFER_BINDING               = 0x8F43,
        GL_MAX_UNIFORM_LOCATIONS                      = 0x826E,
        GL_FRAMEBUFFER_DEFAULT_WIDTH                  = 0x9310,
        GL_FRAMEBUFFER_DEFAULT_HEIGHT                 = 0x9311,
        GL_FRAMEBUFFER_DEFAULT_SAMPLES                = 0x9313,
        GL_FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS = 0x9314,
        GL_MAX_FRAMEBUFFER_WIDTH                      = 0x9315,
        GL_MAX_FRAMEBUFFER_HEIGHT                     = 0x9316,
        GL_MAX_FRAMEBUFFER_SAMPLES                    = 0x9318,
        GL_UNIFORM                                    = 0x92E1,
        GL_UNIFORM_BLOCK                              = 0x92E2,
        GL_PROGRAM_INPUT                              = 0x92E3,
        GL_PROGRAM_OUTPUT                             = 0x92E4,
        GL_BUFFER_VARIABLE                            = 0x92E5,
        GL_SHADER_STORAGE_BLOCK                       = 0x92E6,
        GL_ATOMIC_COUNTER_BUFFER                      = 0x92C0,
        GL_TRANSFORM_FEEDBACK_VARYING                 = 0x92F4,
        GL_ACTIVE_RESOURCES                           = 0x92F5,
        GL_MAX_NAME_LENGTH                            = 0x92F6,
        GL_MAX_NUM_ACTIVE_VARIABLES                   = 0x92F7,
        GL_NAME_LENGTH                                = 0x92F9,
        GL_TYPE                                       = 0x92FA,
        GL_ARRAY_SIZE                                 = 0x92FB,
        GL_OFFSET                                     = 0x92FC,
        GL_BLOCK_INDEX                                = 0x92FD,
        GL_ARRAY_STRIDE                               = 0x92FE,
        GL_MATRIX_STRIDE                              = 0x92FF,
        GL_IS_ROW_MAJOR                               = 0x9300,
        GL_ATOMIC_COUNTER_BUFFER_INDEX                = 0x9301,
        GL_BUFFER_BINDING                             = 0x9302,
        GL_BUFFER_DATA_SIZE                           = 0x9303,
        GL_NUM_ACTIVE_VARIABLES                       = 0x9304,
        GL_ACTIVE_VARIABLES                           = 0x9305,
        GL_REFERENCED_BY_VERTEX_SHADER                = 0x9306,
        GL_REFERENCED_BY_FRAGMENT_SHADER              = 0x930A,
        GL_REFERENCED_BY_COMPUTE_SHADER               = 0x930B,
        GL_TOP_LEVEL_ARRAY_SIZE                       = 0x930C,
        GL_TOP_LEVEL_ARRAY_STRIDE                     = 0x930D,
        GL_LOCATION                                   = 0x930E,
        GL_VERTEX_SHADER_BIT                          = 0x1,
        GL_FRAGMENT_SHADER_BIT                        = 0x2,
        GL_ALL_SHADER_BITS                            = 0xFFFFFFFF,
        GL_PROGRAM_SEPARABLE                          = 0x8258,
        GL_ACTIVE_PROGRAM                             = 0x8259,
        GL_PROGRAM_PIPELINE_BINDING                   = 0x825A,
        GL_ATOMIC_COUNTER_BUFFER_BINDING              = 0x92C1,
        GL_ATOMIC_COUNTER_BUFFER_START                = 0x92C2,
        GL_ATOMIC_COUNTER_BUFFER_SIZE                 = 0x92C3,
        GL_MAX_VERTEX_ATOMIC_COUNTER_BUFFERS          = 0x92CC,
        GL_MAX_FRAGMENT_ATOMIC_COUNTER_BUFFERS        = 0x92D0,
        GL_MAX_COMBINED_ATOMIC_COUNTER_BUFFERS        = 0x92D1,
        GL_MAX_VERTEX_ATOMIC_COUNTERS                 = 0x92D2,
        GL_MAX_FRAGMENT_ATOMIC_COUNTERS               = 0x92D6,
        GL_MAX_COMBINED_ATOMIC_COUNTERS               = 0x92D7,
        GL_MAX_ATOMIC_COUNTER_BUFFER_SIZE             = 0x92D8,
        GL_MAX_ATOMIC_COUNTER_BUFFER_BINDINGS         = 0x92DC,
        GL_ACTIVE_ATOMIC_COUNTER_BUFFERS              = 0x92D9,
        GL_UNSIGNED_INT_ATOMIC_COUNTER                = 0x92DB,
        GL_MAX_IMAGE_UNITS                            = 0x8F38,
        GL_MAX_VERTEX_IMAGE_UNIFORMS                  = 0x90CA,
        GL_MAX_FRAGMENT_IMAGE_UNIFORMS                = 0x90CE,
        GL_MAX_COMBINED_IMAGE_UNIFORMS                = 0x90CF,
        GL_IMAGE_BINDING_NAME                         = 0x8F3A,
        GL_IMAGE_BINDING_LEVEL                        = 0x8F3B,
        GL_IMAGE_BINDING_LAYERED                      = 0x8F3C,
        GL_IMAGE_BINDING_LAYER                        = 0x8F3D,
        GL_IMAGE_BINDING_ACCESS                       = 0x8F3E,
        GL_IMAGE_BINDING_FORMAT                       = 0x906E,
        GL_VERTEX_ATTRIB_ARRAY_BARRIER_BIT            = 0x1,
        GL_ELEMENT_ARRAY_BARRIER_BIT                  = 0x2,
        GL_UNIFORM_BARRIER_BIT                        = 0x4,
        GL_TEXTURE_FETCH_BARRIER_BIT                  = 0x8,
        GL_SHADER_IMAGE_ACCESS_BARRIER_BIT            = 0x20,
        GL_COMMAND_BARRIER_BIT                        = 0x40,
        GL_PIXEL_BUFFER_BARRIER_BIT                   = 0x80,
        GL_TEXTURE_UPDATE_BARRIER_BIT                 = 0x100,
        GL_BUFFER_UPDATE_BARRIER_BIT                  = 0x200,
        GL_FRAMEBUFFER_BARRIER_BIT                    = 0x400,
        GL_TRANSFORM_FEEDBACK_BARRIER_BIT             = 0x800,
        GL_ATOMIC_COUNTER_BARRIER_BIT                 = 0x1000,
        GL_ALL_BARRIER_BITS                           = 0xFFFFFFFF,
        GL_IMAGE_2D                                   = 0x904D,
        GL_IMAGE_3D                                   = 0x904E,
        GL_IMAGE_CUBE                                 = 0x9050,
        GL_IMAGE_2D_ARRAY                             = 0x9053,
        GL_INT_IMAGE_2D                               = 0x9058,
        GL_INT_IMAGE_3D                               = 0x9059,
        GL_INT_IMAGE_CUBE                             = 0x905B,
        GL_INT_IMAGE_2D_ARRAY                         = 0x905E,
        GL_UNSIGNED_INT_IMAGE_2D                      = 0x9063,
        GL_UNSIGNED_INT_IMAGE_3D                      = 0x9064,
        GL_UNSIGNED_INT_IMAGE_CUBE                    = 0x9066,
        GL_UNSIGNED_INT_IMAGE_2D_ARRAY                = 0x9069,
        GL_IMAGE_FORMAT_COMPATIBILITY_TYPE            = 0x90C7,
        GL_IMAGE_FORMAT_COMPATIBILITY_BY_SIZE         = 0x90C8,
        GL_IMAGE_FORMAT_COMPATIBILITY_BY_CLASS        = 0x90C9,
        GL_READ_ONLY                                  = 0x88B8,
        GL_WRITE_ONLY                                 = 0x88B9,
        GL_READ_WRITE                                 = 0x88BA,
        GL_SHADER_STORAGE_BUFFER                      = 0x90D2,
        GL_SHADER_STORAGE_BUFFER_BINDING              = 0x90D3,
        GL_SHADER_STORAGE_BUFFER_START                = 0x90D4,
        GL_SHADER_STORAGE_BUFFER_SIZE                 = 0x90D5,
        GL_MAX_VERTEX_SHADER_STORAGE_BLOCKS           = 0x90D6,
        GL_MAX_FRAGMENT_SHADER_STORAGE_BLOCKS         = 0x90DA,
        GL_MAX_COMPUTE_SHADER_STORAGE_BLOCKS          = 0x90DB,
        GL_MAX_COMBINED_SHADER_STORAGE_BLOCKS         = 0x90DC,
        GL_MAX_SHADER_STORAGE_BUFFER_BINDINGS         = 0x90DD,
        GL_MAX_SHADER_STORAGE_BLOCK_SIZE              = 0x90DE,
        GL_SHADER_STORAGE_BUFFER_OFFSET_ALIGNMENT     = 0x90DF,
        GL_SHADER_STORAGE_BARRIER_BIT                 = 0x2000,
        GL_MAX_COMBINED_SHADER_OUTPUT_RESOURCES       = 0x8F39,
        GL_DEPTH_STENCIL_TEXTURE_MODE                 = 0x90EA,
        GL_STENCIL_INDEX                              = 0x1901,
        GL_MIN_PROGRAM_TEXTURE_GATHER_OFFSET          = 0x8E5E,
        GL_MAX_PROGRAM_TEXTURE_GATHER_OFFSET          = 0x8E5F,
        GL_SAMPLE_POSITION                            = 0x8E50,
        GL_SAMPLE_MASK                                = 0x8E51,
        GL_SAMPLE_MASK_VALUE                          = 0x8E52,
        GL_TEXTURE_2D_MULTISAMPLE                     = 0x9100,
        GL_MAX_SAMPLE_MASK_WORDS                      = 0x8E59,
        GL_MAX_COLOR_TEXTURE_SAMPLES                  = 0x910E,
        GL_MAX_DEPTH_TEXTURE_SAMPLES                  = 0x910F,
        GL_MAX_INTEGER_SAMPLES                        = 0x9110,
        GL_TEXTURE_BINDING_2D_MULTISAMPLE             = 0x9104,
        GL_TEXTURE_SAMPLES                            = 0x9106,
        GL_TEXTURE_FIXED_SAMPLE_LOCATIONS             = 0x9107,
        GL_TEXTURE_WIDTH                              = 0x1000,
        GL_TEXTURE_HEIGHT                             = 0x1001,
        GL_TEXTURE_DEPTH                              = 0x8071,
        GL_TEXTURE_INTERNAL_FORMAT                    = 0x1003,
        GL_TEXTURE_RED_SIZE                           = 0x805C,
        GL_TEXTURE_GREEN_SIZE                         = 0x805D,
        GL_TEXTURE_BLUE_SIZE                          = 0x805E,
        GL_TEXTURE_ALPHA_SIZE                         = 0x805F,
        GL_TEXTURE_DEPTH_SIZE                         = 0x884A,
        GL_TEXTURE_STENCIL_SIZE                       = 0x88F1,
        GL_TEXTURE_SHARED_SIZE                        = 0x8C3F,
        GL_TEXTURE_RED_TYPE                           = 0x8C10,
        GL_TEXTURE_GREEN_TYPE                         = 0x8C11,
        GL_TEXTURE_BLUE_TYPE                          = 0x8C12,
        GL_TEXTURE_ALPHA_TYPE                         = 0x8C13,
        GL_TEXTURE_DEPTH_TYPE                         = 0x8C16,
        GL_TEXTURE_COMPRESSED                         = 0x86A1,
        GL_SAMPLER_2D_MULTISAMPLE                     = 0x9108,
        GL_INT_SAMPLER_2D_MULTISAMPLE                 = 0x9109,
        GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE        = 0x910A,
        GL_VERTEX_ATTRIB_BINDING                      = 0x82D4,
        GL_VERTEX_ATTRIB_RELATIVE_OFFSET              = 0x82D5,
        GL_VERTEX_BINDING_DIVISOR                     = 0x82D6,
        GL_VERTEX_BINDING_OFFSET                      = 0x82D7,
        GL_VERTEX_BINDING_STRIDE                      = 0x82D8,
        GL_VERTEX_BINDING_BUFFER                      = 0x8F4F,
        GL_MAX_VERTEX_ATTRIB_RELATIVE_OFFSET          = 0x82D9,
        GL_MAX_VERTEX_ATTRIB_BINDINGS                 = 0x82DA,
        GL_MAX_VERTEX_ATTRIB_STRIDE                   = 0x82E5;

    static { GLES.initialize(); }

    protected GLES31() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(GLESCapabilities caps) {
        return checkFunctions(
            caps.glDispatchCompute, caps.glDispatchComputeIndirect, caps.glDrawArraysIndirect, caps.glDrawElementsIndirect, caps.glFramebufferParameteri, 
            caps.glGetFramebufferParameteriv, caps.glGetProgramInterfaceiv, caps.glGetProgramResourceIndex, caps.glGetProgramResourceName, 
            caps.glGetProgramResourceiv, caps.glGetProgramResourceLocation, caps.glUseProgramStages, caps.glActiveShaderProgram, caps.glCreateShaderProgramv, 
            caps.glBindProgramPipeline, caps.glDeleteProgramPipelines, caps.glGenProgramPipelines, caps.glIsProgramPipeline, caps.glGetProgramPipelineiv, 
            caps.glProgramUniform1i, caps.glProgramUniform2i, caps.glProgramUniform3i, caps.glProgramUniform4i, caps.glProgramUniform1ui, 
            caps.glProgramUniform2ui, caps.glProgramUniform3ui, caps.glProgramUniform4ui, caps.glProgramUniform1f, caps.glProgramUniform2f, 
            caps.glProgramUniform3f, caps.glProgramUniform4f, caps.glProgramUniform1iv, caps.glProgramUniform2iv, caps.glProgramUniform3iv, 
            caps.glProgramUniform4iv, caps.glProgramUniform1uiv, caps.glProgramUniform2uiv, caps.glProgramUniform3uiv, caps.glProgramUniform4uiv, 
            caps.glProgramUniform1fv, caps.glProgramUniform2fv, caps.glProgramUniform3fv, caps.glProgramUniform4fv, caps.glProgramUniformMatrix2fv, 
            caps.glProgramUniformMatrix3fv, caps.glProgramUniformMatrix4fv, caps.glProgramUniformMatrix2x3fv, caps.glProgramUniformMatrix3x2fv, 
            caps.glProgramUniformMatrix2x4fv, caps.glProgramUniformMatrix4x2fv, caps.glProgramUniformMatrix3x4fv, caps.glProgramUniformMatrix4x3fv, 
            caps.glValidateProgramPipeline, caps.glGetProgramPipelineInfoLog, caps.glBindImageTexture, caps.glGetBooleani_v, caps.glMemoryBarrier, 
            caps.glMemoryBarrierByRegion, caps.glTexStorage2DMultisample, caps.glGetMultisamplefv, caps.glSampleMaski, caps.glGetTexLevelParameteriv, 
            caps.glGetTexLevelParameterfv, caps.glBindVertexBuffer, caps.glVertexAttribFormat, caps.glVertexAttribIFormat, caps.glVertexAttribBinding, 
            caps.glVertexBindingDivisor
        );
    }

    // --- [ glDispatchCompute ] ---

    /** <a target="_blank" href="http://docs.gl/es3/glDispatchCompute">Reference Page</a> */
    public static native void glDispatchCompute(@NativeType("GLuint") int num_groups_x, @NativeType("GLuint") int num_groups_y, @NativeType("GLuint") int num_groups_z);

    // --- [ glDispatchComputeIndirect ] ---

    /** <a target="_blank" href="http://docs.gl/es3/glDispatchComputeIndirect">Reference Page</a> */
    public static native void glDispatchComputeIndirect(@NativeType("GLintptr") long indirect);

    // --- [ glDrawArraysIndirect ] ---

    public static native void nglDrawArraysIndirect(int mode, long indirect);

    /** <a target="_blank" href="http://docs.gl/es3/glDrawArraysIndirect">Reference Page</a> */
    public static void glDrawArraysIndirect(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indirect) {
        if (CHECKS) {
            check(indirect, 4 * 4);
        }
        nglDrawArraysIndirect(mode, memAddress(indirect));
    }

    /** <a target="_blank" href="http://docs.gl/es3/glDrawArraysIndirect">Reference Page</a> */
    public static void glDrawArraysIndirect(@NativeType("GLenum") int mode, @NativeType("void const *") long indirect) {
        nglDrawArraysIndirect(mode, indirect);
    }

    /** <a target="_blank" href="http://docs.gl/es3/glDrawArraysIndirect">Reference Page</a> */
    public static void glDrawArraysIndirect(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indirect) {
        if (CHECKS) {
            check(indirect, (4 * 4) >> 2);
        }
        nglDrawArraysIndirect(mode, memAddress(indirect));
    }

    // --- [ glDrawElementsIndirect ] ---

    public static native void nglDrawElementsIndirect(int mode, int type, long indirect);

    /** <a target="_blank" href="http://docs.gl/es3/glDrawElementsIndirect">Reference Page</a> */
    public static void glDrawElementsIndirect(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indirect) {
        if (CHECKS) {
            check(indirect, 5 * 4);
        }
        nglDrawElementsIndirect(mode, type, memAddress(indirect));
    }

    /** <a target="_blank" href="http://docs.gl/es3/glDrawElementsIndirect">Reference Page</a> */
    public static void glDrawElementsIndirect(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") long indirect) {
        nglDrawElementsIndirect(mode, type, indirect);
    }

    /** <a target="_blank" href="http://docs.gl/es3/glDrawElementsIndirect">Reference Page</a> */
    public static void glDrawElementsIndirect(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer indirect) {
        if (CHECKS) {
            check(indirect, (5 * 4) >> 2);
        }
        nglDrawElementsIndirect(mode, type, memAddress(indirect));
    }

    // --- [ glFramebufferParameteri ] ---

    /** <a target="_blank" href="http://docs.gl/es3/glFramebufferParameteri">Reference Page</a> */
    public static native void glFramebufferParameteri(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint") int param);

    // --- [ glGetFramebufferParameteriv ] ---

    public static native void nglGetFramebufferParameteriv(int target, int pname, long params);

    /** <a target="_blank" href="http://docs.gl/es3/glGetFramebufferParameter">Reference Page</a> */
    public static void glGetFramebufferParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetFramebufferParameteriv(target, pname, memAddress(params));
    }

    /** <a target="_blank" href="http://docs.gl/es3/glGetFramebufferParameter">Reference Page</a> */
    @NativeType("void")
    public static int glGetFramebufferParameteri(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetFramebufferParameteriv(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetProgramInterfaceiv ] ---

    public static native void nglGetProgramInterfaceiv(int program, int programInterface, int pname, long params);

    /** <a target="_blank" href="http://docs.gl/es3/glGetProgramInterface">Reference Page</a> */
    public static void glGetProgramInterfaceiv(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetProgramInterfaceiv(program, programInterface, pname, memAddress(params));
    }

    /** <a target="_blank" href="http://docs.gl/es3/glGetProgramInterface">Reference Page</a> */
    @NativeType("void")
    public static int glGetProgramInterfacei(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetProgramInterfaceiv(program, programInterface, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetProgramResourceIndex ] ---

    public static native int nglGetProgramResourceIndex(int program, int programInterface, long name);

    /** <a target="_blank" href="http://docs.gl/es3/glGetProgramResourceIndex">Reference Page</a> */
    @NativeType("GLuint")
    public static int glGetProgramResourceIndex(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLchar const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nglGetProgramResourceIndex(program, programInterface, memAddress(name));
    }

    /** <a target="_blank" href="http://docs.gl/es3/glGetProgramResourceIndex">Reference Page</a> */
    @NativeType("GLuint")
    public static int glGetProgramResourceIndex(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLchar const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer nameEncoded = stack.ASCII(name);
            return nglGetProgramResourceIndex(program, programInterface, memAddress(nameEncoded));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetProgramResourceName ] ---

    public static native void nglGetProgramResourceName(int program, int programInterface, int index, int bufSize, long length, long name);

    /** <a target="_blank" href="http://docs.gl/es3/glGetProgramResourceName">Reference Page</a> */
    public static void glGetProgramResourceName(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLuint") int index, @Nullable @NativeType("GLsizei *") IntBuffer length, @NativeType("GLchar *") ByteBuffer name) {
        if (CHECKS) {
            checkSafe(length, 1);
        }
        nglGetProgramResourceName(program, programInterface, index, name.remaining(), memAddressSafe(length), memAddress(name));
    }

    /** <a target="_blank" href="http://docs.gl/es3/glGetProgramResourceName">Reference Page</a> */
    @NativeType("void")
    public static String glGetProgramResourceName(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLuint") int index, @NativeType("GLsizei") int bufSize) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer length = stack.ints(0);
            ByteBuffer name = stack.malloc(bufSize);
            nglGetProgramResourceName(program, programInterface, index, bufSize, memAddress(length), memAddress(name));
            return memASCII(name, length.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** <a target="_blank" href="http://docs.gl/es3/glGetProgramResourceName">Reference Page</a> */
    @NativeType("void")
    public static String glGetProgramResourceName(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLuint") int index) {
        return glGetProgramResourceName(program, programInterface, index, glGetProgramInterfacei(program, programInterface, GL_MAX_NAME_LENGTH));
    }

    // --- [ glGetProgramResourceiv ] ---

    public static native void nglGetProgramResourceiv(int program, int programInterface, int index, int propCount, long props, int bufSize, long length, long params);

    /** <a target="_blank" href="http://docs.gl/es3/glGetProgramResource">Reference Page</a> */
    public static void glGetProgramResourceiv(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLuint") int index, @NativeType("GLenum const *") IntBuffer props, @Nullable @NativeType("GLsizei *") IntBuffer length, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            checkSafe(length, 1);
        }
        nglGetProgramResourceiv(program, programInterface, index, props.remaining(), memAddress(props), params.remaining(), memAddressSafe(length), memAddress(params));
    }

    // --- [ glGetProgramResourceLocation ] ---

    public static native int nglGetProgramResourceLocation(int program, int programInterface, long name);

    /** <a target="_blank" href="http://docs.gl/es3/glGetProgramResourceLocation">Reference Page</a> */
    @NativeType("GLint")
    public static int glGetProgramResourceLocation(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLchar const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nglGetProgramResourceLocation(program, programInterface, memAddress(name));
    }

    /** <a target="_blank" href="http://docs.gl/es3/glGetProgramResourceLocation">Reference Page</a> */
    @NativeType("GLint")
    public static int glGetProgramResourceLocation(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLchar const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer nameEncoded = stack.ASCII(name);
            return nglGetProgramResourceLocation(program, programInterface, memAddress(nameEncoded));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glUseProgramStages ] ---

    /** <a target="_blank" href="http://docs.gl/es3/glUseProgramStages">Reference Page</a> */
    public static native void glUseProgramStages(@NativeType("GLuint") int pipeline, @NativeType("GLbitfield") int stages, @NativeType("GLuint") int program);

    // --- [ glActiveShaderProgram ] ---

    /** <a target="_blank" href="http://docs.gl/es3/glActiveShaderProgram">Reference Page</a> */
    public static native void glActiveShaderProgram(@NativeType("GLuint") int pipeline, @NativeType("GLuint") int program);

    // --- [ glCreateShaderProgramv ] ---

    public static native int nglCreateShaderProgramv(int type, int count, long strings);

    /** <a target="_blank" href="http://docs.gl/es3/glCreateShaderProgramv">Reference Page</a> */
    @NativeType("GLuint")
    public static int glCreateShaderProgramv(@NativeType("GLenum") int type, @NativeType("GLchar const * const *") PointerBuffer strings) {
        return nglCreateShaderProgramv(type, strings.remaining(), memAddress(strings));
    }

    /** <a target="_blank" href="http://docs.gl/es3/glCreateShaderProgramv">Reference Page</a> */
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

    /** <a target="_blank" href="http://docs.gl/es3/glCreateShaderProgramv">Reference Page</a> */
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

    /** <a target="_blank" href="http://docs.gl/es3/glBindProgramPipeline">Reference Page</a> */
    public static native void glBindProgramPipeline(@NativeType("GLuint") int pipeline);

    // --- [ glDeleteProgramPipelines ] ---

    public static native void nglDeleteProgramPipelines(int n, long pipelines);

    /** <a target="_blank" href="http://docs.gl/es3/glDeleteProgramPipelines">Reference Page</a> */
    public static void glDeleteProgramPipelines(@NativeType("GLuint const *") IntBuffer pipelines) {
        nglDeleteProgramPipelines(pipelines.remaining(), memAddress(pipelines));
    }

    /** <a target="_blank" href="http://docs.gl/es3/glDeleteProgramPipelines">Reference Page</a> */
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

    public static native void nglGenProgramPipelines(int n, long pipelines);

    /** <a target="_blank" href="http://docs.gl/es3/glGenProgramPipelines">Reference Page</a> */
    public static void glGenProgramPipelines(@NativeType("GLuint *") IntBuffer pipelines) {
        nglGenProgramPipelines(pipelines.remaining(), memAddress(pipelines));
    }

    /** <a target="_blank" href="http://docs.gl/es3/glGenProgramPipelines">Reference Page</a> */
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

    /** <a target="_blank" href="http://docs.gl/es3/glIsProgramPipeline">Reference Page</a> */
    @NativeType("GLboolean")
    public static native boolean glIsProgramPipeline(@NativeType("GLuint") int pipeline);

    // --- [ glGetProgramPipelineiv ] ---

    public static native void nglGetProgramPipelineiv(int pipeline, int pname, long params);

    /** <a target="_blank" href="http://docs.gl/es3/glGetProgramPipeline">Reference Page</a> */
    public static void glGetProgramPipelineiv(@NativeType("GLuint") int pipeline, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetProgramPipelineiv(pipeline, pname, memAddress(params));
    }

    /** <a target="_blank" href="http://docs.gl/es3/glGetProgramPipeline">Reference Page</a> */
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

    /** <a target="_blank" href="http://docs.gl/es3/glProgramUniform">Reference Page</a> */
    public static native void glProgramUniform1i(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint") int v0);

    // --- [ glProgramUniform2i ] ---

    /** <a target="_blank" href="http://docs.gl/es3/glProgramUniform">Reference Page</a> */
    public static native void glProgramUniform2i(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint") int v0, @NativeType("GLint") int v1);

    // --- [ glProgramUniform3i ] ---

    /** <a target="_blank" href="http://docs.gl/es3/glProgramUniform">Reference Page</a> */
    public static native void glProgramUniform3i(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint") int v0, @NativeType("GLint") int v1, @NativeType("GLint") int v2);

    // --- [ glProgramUniform4i ] ---

    /** <a target="_blank" href="http://docs.gl/es3/glProgramUniform">Reference Page</a> */
    public static native void glProgramUniform4i(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint") int v0, @NativeType("GLint") int v1, @NativeType("GLint") int v2, @NativeType("GLint") int v3);

    // --- [ glProgramUniform1ui ] ---

    /** <a target="_blank" href="http://docs.gl/es3/glProgramUniform">Reference Page</a> */
    public static native void glProgramUniform1ui(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint") int v0);

    // --- [ glProgramUniform2ui ] ---

    /** <a target="_blank" href="http://docs.gl/es3/glProgramUniform">Reference Page</a> */
    public static native void glProgramUniform2ui(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint") int v0, @NativeType("GLuint") int v1);

    // --- [ glProgramUniform3ui ] ---

    /** <a target="_blank" href="http://docs.gl/es3/glProgramUniform">Reference Page</a> */
    public static native void glProgramUniform3ui(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint") int v0, @NativeType("GLuint") int v1, @NativeType("GLuint") int v2);

    // --- [ glProgramUniform4ui ] ---

    /** <a target="_blank" href="http://docs.gl/es3/glProgramUniform">Reference Page</a> */
    public static native void glProgramUniform4ui(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint") int v0, @NativeType("GLuint") int v1, @NativeType("GLuint") int v2, @NativeType("GLuint") int v3);

    // --- [ glProgramUniform1f ] ---

    /** <a target="_blank" href="http://docs.gl/es3/glProgramUniform">Reference Page</a> */
    public static native void glProgramUniform1f(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat") float v0);

    // --- [ glProgramUniform2f ] ---

    /** <a target="_blank" href="http://docs.gl/es3/glProgramUniform">Reference Page</a> */
    public static native void glProgramUniform2f(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1);

    // --- [ glProgramUniform3f ] ---

    /** <a target="_blank" href="http://docs.gl/es3/glProgramUniform">Reference Page</a> */
    public static native void glProgramUniform3f(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2);

    // --- [ glProgramUniform4f ] ---

    /** <a target="_blank" href="http://docs.gl/es3/glProgramUniform">Reference Page</a> */
    public static native void glProgramUniform4f(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2, @NativeType("GLfloat") float v3);

    // --- [ glProgramUniform1iv ] ---

    public static native void nglProgramUniform1iv(int program, int location, int count, long value);

    /** <a target="_blank" href="http://docs.gl/es3/glProgramUniform">Reference Page</a> */
    public static void glProgramUniform1iv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        nglProgramUniform1iv(program, location, value.remaining(), memAddress(value));
    }

    // --- [ glProgramUniform2iv ] ---

    public static native void nglProgramUniform2iv(int program, int location, int count, long value);

    /** <a target="_blank" href="http://docs.gl/es3/glProgramUniform">Reference Page</a> */
    public static void glProgramUniform2iv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        nglProgramUniform2iv(program, location, value.remaining() >> 1, memAddress(value));
    }

    // --- [ glProgramUniform3iv ] ---

    public static native void nglProgramUniform3iv(int program, int location, int count, long value);

    /** <a target="_blank" href="http://docs.gl/es3/glProgramUniform">Reference Page</a> */
    public static void glProgramUniform3iv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        nglProgramUniform3iv(program, location, value.remaining() / 3, memAddress(value));
    }

    // --- [ glProgramUniform4iv ] ---

    public static native void nglProgramUniform4iv(int program, int location, int count, long value);

    /** <a target="_blank" href="http://docs.gl/es3/glProgramUniform">Reference Page</a> */
    public static void glProgramUniform4iv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        nglProgramUniform4iv(program, location, value.remaining() >> 2, memAddress(value));
    }

    // --- [ glProgramUniform1uiv ] ---

    public static native void nglProgramUniform1uiv(int program, int location, int count, long value);

    /** <a target="_blank" href="http://docs.gl/es3/glProgramUniform">Reference Page</a> */
    public static void glProgramUniform1uiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        nglProgramUniform1uiv(program, location, value.remaining(), memAddress(value));
    }

    // --- [ glProgramUniform2uiv ] ---

    public static native void nglProgramUniform2uiv(int program, int location, int count, long value);

    /** <a target="_blank" href="http://docs.gl/es3/glProgramUniform">Reference Page</a> */
    public static void glProgramUniform2uiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        nglProgramUniform2uiv(program, location, value.remaining() >> 1, memAddress(value));
    }

    // --- [ glProgramUniform3uiv ] ---

    public static native void nglProgramUniform3uiv(int program, int location, int count, long value);

    /** <a target="_blank" href="http://docs.gl/es3/glProgramUniform">Reference Page</a> */
    public static void glProgramUniform3uiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        nglProgramUniform3uiv(program, location, value.remaining() / 3, memAddress(value));
    }

    // --- [ glProgramUniform4uiv ] ---

    public static native void nglProgramUniform4uiv(int program, int location, int count, long value);

    /** <a target="_blank" href="http://docs.gl/es3/glProgramUniform">Reference Page</a> */
    public static void glProgramUniform4uiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        nglProgramUniform4uiv(program, location, value.remaining() >> 2, memAddress(value));
    }

    // --- [ glProgramUniform1fv ] ---

    public static native void nglProgramUniform1fv(int program, int location, int count, long value);

    /** <a target="_blank" href="http://docs.gl/es3/glProgramUniform">Reference Page</a> */
    public static void glProgramUniform1fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniform1fv(program, location, value.remaining(), memAddress(value));
    }

    // --- [ glProgramUniform2fv ] ---

    public static native void nglProgramUniform2fv(int program, int location, int count, long value);

    /** <a target="_blank" href="http://docs.gl/es3/glProgramUniform">Reference Page</a> */
    public static void glProgramUniform2fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniform2fv(program, location, value.remaining() >> 1, memAddress(value));
    }

    // --- [ glProgramUniform3fv ] ---

    public static native void nglProgramUniform3fv(int program, int location, int count, long value);

    /** <a target="_blank" href="http://docs.gl/es3/glProgramUniform">Reference Page</a> */
    public static void glProgramUniform3fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniform3fv(program, location, value.remaining() / 3, memAddress(value));
    }

    // --- [ glProgramUniform4fv ] ---

    public static native void nglProgramUniform4fv(int program, int location, int count, long value);

    /** <a target="_blank" href="http://docs.gl/es3/glProgramUniform">Reference Page</a> */
    public static void glProgramUniform4fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniform4fv(program, location, value.remaining() >> 2, memAddress(value));
    }

    // --- [ glProgramUniformMatrix2fv ] ---

    public static native void nglProgramUniformMatrix2fv(int program, int location, int count, boolean transpose, long value);

    /** <a target="_blank" href="http://docs.gl/es3/glProgramUniform">Reference Page</a> */
    public static void glProgramUniformMatrix2fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix2fv(program, location, value.remaining() >> 2, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix3fv ] ---

    public static native void nglProgramUniformMatrix3fv(int program, int location, int count, boolean transpose, long value);

    /** <a target="_blank" href="http://docs.gl/es3/glProgramUniform">Reference Page</a> */
    public static void glProgramUniformMatrix3fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix3fv(program, location, value.remaining() / 9, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix4fv ] ---

    public static native void nglProgramUniformMatrix4fv(int program, int location, int count, boolean transpose, long value);

    /** <a target="_blank" href="http://docs.gl/es3/glProgramUniform">Reference Page</a> */
    public static void glProgramUniformMatrix4fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix4fv(program, location, value.remaining() >> 4, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix2x3fv ] ---

    public static native void nglProgramUniformMatrix2x3fv(int program, int location, int count, boolean transpose, long value);

    /** <a target="_blank" href="http://docs.gl/es3/glProgramUniform">Reference Page</a> */
    public static void glProgramUniformMatrix2x3fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix2x3fv(program, location, value.remaining() / 6, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix3x2fv ] ---

    public static native void nglProgramUniformMatrix3x2fv(int program, int location, int count, boolean transpose, long value);

    /** <a target="_blank" href="http://docs.gl/es3/glProgramUniform">Reference Page</a> */
    public static void glProgramUniformMatrix3x2fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix3x2fv(program, location, value.remaining() / 6, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix2x4fv ] ---

    public static native void nglProgramUniformMatrix2x4fv(int program, int location, int count, boolean transpose, long value);

    /** <a target="_blank" href="http://docs.gl/es3/glProgramUniform">Reference Page</a> */
    public static void glProgramUniformMatrix2x4fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix2x4fv(program, location, value.remaining() >> 3, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix4x2fv ] ---

    public static native void nglProgramUniformMatrix4x2fv(int program, int location, int count, boolean transpose, long value);

    /** <a target="_blank" href="http://docs.gl/es3/glProgramUniform">Reference Page</a> */
    public static void glProgramUniformMatrix4x2fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix4x2fv(program, location, value.remaining() >> 3, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix3x4fv ] ---

    public static native void nglProgramUniformMatrix3x4fv(int program, int location, int count, boolean transpose, long value);

    /** <a target="_blank" href="http://docs.gl/es3/glProgramUniform">Reference Page</a> */
    public static void glProgramUniformMatrix3x4fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix3x4fv(program, location, value.remaining() / 12, transpose, memAddress(value));
    }

    // --- [ glProgramUniformMatrix4x3fv ] ---

    public static native void nglProgramUniformMatrix4x3fv(int program, int location, int count, boolean transpose, long value);

    /** <a target="_blank" href="http://docs.gl/es3/glProgramUniform">Reference Page</a> */
    public static void glProgramUniformMatrix4x3fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglProgramUniformMatrix4x3fv(program, location, value.remaining() / 12, transpose, memAddress(value));
    }

    // --- [ glValidateProgramPipeline ] ---

    /** <a target="_blank" href="http://docs.gl/es3/glValidateProgramPipeline">Reference Page</a> */
    public static native void glValidateProgramPipeline(@NativeType("GLuint") int pipeline);

    // --- [ glGetProgramPipelineInfoLog ] ---

    public static native void nglGetProgramPipelineInfoLog(int pipeline, int bufSize, long length, long infoLog);

    /** <a target="_blank" href="http://docs.gl/es3/glGetProgramPipelineInfoLog">Reference Page</a> */
    public static void glGetProgramPipelineInfoLog(@NativeType("GLuint") int pipeline, @Nullable @NativeType("GLsizei *") IntBuffer length, @NativeType("GLchar *") ByteBuffer infoLog) {
        if (CHECKS) {
            checkSafe(length, 1);
        }
        nglGetProgramPipelineInfoLog(pipeline, infoLog.remaining(), memAddressSafe(length), memAddress(infoLog));
    }

    /** <a target="_blank" href="http://docs.gl/es3/glGetProgramPipelineInfoLog">Reference Page</a> */
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

    /** <a target="_blank" href="http://docs.gl/es3/glGetProgramPipelineInfoLog">Reference Page</a> */
    @NativeType("void")
    public static String glGetProgramPipelineInfoLog(@NativeType("GLuint") int pipeline) {
        return glGetProgramPipelineInfoLog(pipeline, glGetProgramPipelinei(pipeline, GLES20.GL_INFO_LOG_LENGTH));
    }

    // --- [ glBindImageTexture ] ---

    /** <a target="_blank" href="http://docs.gl/es3/glBindImageTexture">Reference Page</a> */
    public static native void glBindImageTexture(@NativeType("GLuint") int unit, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLboolean") boolean layered, @NativeType("GLint") int layer, @NativeType("GLenum") int access, @NativeType("GLenum") int format);

    // --- [ glGetBooleani_v ] ---

    public static native void nglGetBooleani_v(int target, int index, long data);

    /** <a target="_blank" href="http://docs.gl/es3/glGetBooleani_v">Reference Page</a> */
    public static void glGetBooleani_v(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLboolean *") ByteBuffer data) {
        if (CHECKS) {
            check(data, 1);
        }
        nglGetBooleani_v(target, index, memAddress(data));
    }

    /** <a target="_blank" href="http://docs.gl/es3/glGetBooleani_v">Reference Page</a> */
    @NativeType("void")
    public static boolean glGetBooleani(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer data = stack.calloc(1);
            nglGetBooleani_v(target, index, memAddress(data));
            return data.get(0) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glMemoryBarrier ] ---

    /** <a target="_blank" href="http://docs.gl/es3/glMemoryBarrier">Reference Page</a> */
    public static native void glMemoryBarrier(@NativeType("GLbitfield") int barriers);

    // --- [ glMemoryBarrierByRegion ] ---

    /** <a target="_blank" href="http://docs.gl/es3/glMemoryBarrierByRegion">Reference Page</a> */
    public static native void glMemoryBarrierByRegion(@NativeType("GLbitfield") int barriers);

    // --- [ glTexStorage2DMultisample ] ---

    /** <a target="_blank" href="http://docs.gl/es3/glTexStorage2DMultisample">Reference Page</a> */
    public static native void glTexStorage2DMultisample(@NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLboolean") boolean fixedsamplelocations);

    // --- [ glGetMultisamplefv ] ---

    public static native void nglGetMultisamplefv(int pname, int index, long val);

    /** <a target="_blank" href="http://docs.gl/es3/glGetMultisample">Reference Page</a> */
    public static void glGetMultisamplefv(@NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLfloat *") FloatBuffer val) {
        if (CHECKS) {
            check(val, 1);
        }
        nglGetMultisamplefv(pname, index, memAddress(val));
    }

    /** <a target="_blank" href="http://docs.gl/es3/glGetMultisample">Reference Page</a> */
    @NativeType("void")
    public static float glGetMultisamplef(@NativeType("GLenum") int pname, @NativeType("GLuint") int index) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer val = stack.callocFloat(1);
            nglGetMultisamplefv(pname, index, memAddress(val));
            return val.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glSampleMaski ] ---

    /** <a target="_blank" href="http://docs.gl/es3/glSampleMaski">Reference Page</a> */
    public static native void glSampleMaski(@NativeType("GLuint") int maskNumber, @NativeType("GLbitfield") int mask);

    // --- [ glGetTexLevelParameteriv ] ---

    public static native void nglGetTexLevelParameteriv(int target, int level, int pname, long params);

    /** <a target="_blank" href="http://docs.gl/es3/glGetTexLevelParameter">Reference Page</a> */
    public static void glGetTexLevelParameteriv(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetTexLevelParameteriv(target, level, pname, memAddress(params));
    }

    /** <a target="_blank" href="http://docs.gl/es3/glGetTexLevelParameter">Reference Page</a> */
    @NativeType("void")
    public static int glGetTexLevelParameteri(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetTexLevelParameteriv(target, level, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetTexLevelParameterfv ] ---

    public static native void nglGetTexLevelParameterfv(int target, int level, int pname, long params);

    /** <a target="_blank" href="http://docs.gl/es3/glGetTexLevelParameter">Reference Page</a> */
    public static void glGetTexLevelParameterfv(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetTexLevelParameterfv(target, level, pname, memAddress(params));
    }

    /** <a target="_blank" href="http://docs.gl/es3/glGetTexLevelParameter">Reference Page</a> */
    @NativeType("void")
    public static float glGetTexLevelParameterf(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetTexLevelParameterfv(target, level, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glBindVertexBuffer ] ---

    /** <a target="_blank" href="http://docs.gl/es3/glBindVertexBuffer">Reference Page</a> */
    public static native void glBindVertexBuffer(@NativeType("GLuint") int bindingindex, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizei") int stride);

    // --- [ glVertexAttribFormat ] ---

    /** <a target="_blank" href="http://docs.gl/es3/glVertexAttribFormat">Reference Page</a> */
    public static native void glVertexAttribFormat(@NativeType("GLuint") int attribindex, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint") int relativeoffset);

    // --- [ glVertexAttribIFormat ] ---

    /** <a target="_blank" href="http://docs.gl/es3/glVertexAttribIFormat">Reference Page</a> */
    public static native void glVertexAttribIFormat(@NativeType("GLuint") int attribindex, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLuint") int relativeoffset);

    // --- [ glVertexAttribBinding ] ---

    /** <a target="_blank" href="http://docs.gl/es3/glVertexAttribBinding">Reference Page</a> */
    public static native void glVertexAttribBinding(@NativeType("GLuint") int attribindex, @NativeType("GLuint") int bindingindex);

    // --- [ glVertexBindingDivisor ] ---

    /** <a target="_blank" href="http://docs.gl/es3/glVertexBindingDivisor">Reference Page</a> */
    public static native void glVertexBindingDivisor(@NativeType("GLuint") int bindingindex, @NativeType("GLuint") int divisor);

    /**
     * Array version of: {@link #glDrawArraysIndirect DrawArraysIndirect}
     * 
     * @see <a target="_blank" href="http://docs.gl/es3/glDrawArraysIndirect">Reference Page</a>
     */
    public static void glDrawArraysIndirect(@NativeType("GLenum") int mode, @NativeType("void const *") int[] indirect) {
        long __functionAddress = GLES.getICD().glDrawArraysIndirect;
        if (CHECKS) {
            check(__functionAddress);
            check(indirect, (4 * 4) >> 2);
        }
        callPV(__functionAddress, mode, indirect);
    }

    /**
     * Array version of: {@link #glDrawElementsIndirect DrawElementsIndirect}
     * 
     * @see <a target="_blank" href="http://docs.gl/es3/glDrawElementsIndirect">Reference Page</a>
     */
    public static void glDrawElementsIndirect(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") int[] indirect) {
        long __functionAddress = GLES.getICD().glDrawElementsIndirect;
        if (CHECKS) {
            check(__functionAddress);
            check(indirect, (5 * 4) >> 2);
        }
        callPV(__functionAddress, mode, type, indirect);
    }

    /**
     * Array version of: {@link #glGetFramebufferParameteriv GetFramebufferParameteriv}
     * 
     * @see <a target="_blank" href="http://docs.gl/es3/glGetFramebufferParameter">Reference Page</a>
     */
    public static void glGetFramebufferParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetFramebufferParameteriv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, target, pname, params);
    }

    /**
     * Array version of: {@link #glGetProgramInterfaceiv GetProgramInterfaceiv}
     * 
     * @see <a target="_blank" href="http://docs.gl/es3/glGetProgramInterface">Reference Page</a>
     */
    public static void glGetProgramInterfaceiv(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetProgramInterfaceiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, program, programInterface, pname, params);
    }

    /**
     * Array version of: {@link #glGetProgramResourceName GetProgramResourceName}
     * 
     * @see <a target="_blank" href="http://docs.gl/es3/glGetProgramResourceName">Reference Page</a>
     */
    public static void glGetProgramResourceName(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLuint") int index, @Nullable @NativeType("GLsizei *") int[] length, @NativeType("GLchar *") ByteBuffer name) {
        long __functionAddress = GLES.getICD().glGetProgramResourceName;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(length, 1);
        }
        callPPV(__functionAddress, program, programInterface, index, name.remaining(), length, memAddress(name));
    }

    /**
     * Array version of: {@link #glGetProgramResourceiv GetProgramResourceiv}
     * 
     * @see <a target="_blank" href="http://docs.gl/es3/glGetProgramResource">Reference Page</a>
     */
    public static void glGetProgramResourceiv(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLuint") int index, @NativeType("GLenum const *") int[] props, @Nullable @NativeType("GLsizei *") int[] length, @NativeType("GLint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetProgramResourceiv;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(length, 1);
        }
        callPPPV(__functionAddress, program, programInterface, index, props.length, props, params.length, length, params);
    }

    /**
     * Array version of: {@link #glDeleteProgramPipelines DeleteProgramPipelines}
     * 
     * @see <a target="_blank" href="http://docs.gl/es3/glDeleteProgramPipelines">Reference Page</a>
     */
    public static void glDeleteProgramPipelines(@NativeType("GLuint const *") int[] pipelines) {
        long __functionAddress = GLES.getICD().glDeleteProgramPipelines;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, pipelines.length, pipelines);
    }

    /**
     * Array version of: {@link #glGenProgramPipelines GenProgramPipelines}
     * 
     * @see <a target="_blank" href="http://docs.gl/es3/glGenProgramPipelines">Reference Page</a>
     */
    public static void glGenProgramPipelines(@NativeType("GLuint *") int[] pipelines) {
        long __functionAddress = GLES.getICD().glGenProgramPipelines;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, pipelines.length, pipelines);
    }

    /**
     * Array version of: {@link #glGetProgramPipelineiv GetProgramPipelineiv}
     * 
     * @see <a target="_blank" href="http://docs.gl/es3/glGetProgramPipeline">Reference Page</a>
     */
    public static void glGetProgramPipelineiv(@NativeType("GLuint") int pipeline, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetProgramPipelineiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, pipeline, pname, params);
    }

    /**
     * Array version of: {@link #glProgramUniform1iv ProgramUniform1iv}
     * 
     * @see <a target="_blank" href="http://docs.gl/es3/glProgramUniform">Reference Page</a>
     */
    public static void glProgramUniform1iv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        long __functionAddress = GLES.getICD().glProgramUniform1iv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, program, location, value.length, value);
    }

    /**
     * Array version of: {@link #glProgramUniform2iv ProgramUniform2iv}
     * 
     * @see <a target="_blank" href="http://docs.gl/es3/glProgramUniform">Reference Page</a>
     */
    public static void glProgramUniform2iv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        long __functionAddress = GLES.getICD().glProgramUniform2iv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, program, location, value.length >> 1, value);
    }

    /**
     * Array version of: {@link #glProgramUniform3iv ProgramUniform3iv}
     * 
     * @see <a target="_blank" href="http://docs.gl/es3/glProgramUniform">Reference Page</a>
     */
    public static void glProgramUniform3iv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        long __functionAddress = GLES.getICD().glProgramUniform3iv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, program, location, value.length / 3, value);
    }

    /**
     * Array version of: {@link #glProgramUniform4iv ProgramUniform4iv}
     * 
     * @see <a target="_blank" href="http://docs.gl/es3/glProgramUniform">Reference Page</a>
     */
    public static void glProgramUniform4iv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        long __functionAddress = GLES.getICD().glProgramUniform4iv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, program, location, value.length >> 2, value);
    }

    /**
     * Array version of: {@link #glProgramUniform1uiv ProgramUniform1uiv}
     * 
     * @see <a target="_blank" href="http://docs.gl/es3/glProgramUniform">Reference Page</a>
     */
    public static void glProgramUniform1uiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GLES.getICD().glProgramUniform1uiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, program, location, value.length, value);
    }

    /**
     * Array version of: {@link #glProgramUniform2uiv ProgramUniform2uiv}
     * 
     * @see <a target="_blank" href="http://docs.gl/es3/glProgramUniform">Reference Page</a>
     */
    public static void glProgramUniform2uiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GLES.getICD().glProgramUniform2uiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, program, location, value.length >> 1, value);
    }

    /**
     * Array version of: {@link #glProgramUniform3uiv ProgramUniform3uiv}
     * 
     * @see <a target="_blank" href="http://docs.gl/es3/glProgramUniform">Reference Page</a>
     */
    public static void glProgramUniform3uiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GLES.getICD().glProgramUniform3uiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, program, location, value.length / 3, value);
    }

    /**
     * Array version of: {@link #glProgramUniform4uiv ProgramUniform4uiv}
     * 
     * @see <a target="_blank" href="http://docs.gl/es3/glProgramUniform">Reference Page</a>
     */
    public static void glProgramUniform4uiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GLES.getICD().glProgramUniform4uiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, program, location, value.length >> 2, value);
    }

    /**
     * Array version of: {@link #glProgramUniform1fv ProgramUniform1fv}
     * 
     * @see <a target="_blank" href="http://docs.gl/es3/glProgramUniform">Reference Page</a>
     */
    public static void glProgramUniform1fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glProgramUniform1fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, program, location, value.length, value);
    }

    /**
     * Array version of: {@link #glProgramUniform2fv ProgramUniform2fv}
     * 
     * @see <a target="_blank" href="http://docs.gl/es3/glProgramUniform">Reference Page</a>
     */
    public static void glProgramUniform2fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glProgramUniform2fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, program, location, value.length >> 1, value);
    }

    /**
     * Array version of: {@link #glProgramUniform3fv ProgramUniform3fv}
     * 
     * @see <a target="_blank" href="http://docs.gl/es3/glProgramUniform">Reference Page</a>
     */
    public static void glProgramUniform3fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glProgramUniform3fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, program, location, value.length / 3, value);
    }

    /**
     * Array version of: {@link #glProgramUniform4fv ProgramUniform4fv}
     * 
     * @see <a target="_blank" href="http://docs.gl/es3/glProgramUniform">Reference Page</a>
     */
    public static void glProgramUniform4fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glProgramUniform4fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, program, location, value.length >> 2, value);
    }

    /**
     * Array version of: {@link #glProgramUniformMatrix2fv ProgramUniformMatrix2fv}
     * 
     * @see <a target="_blank" href="http://docs.gl/es3/glProgramUniform">Reference Page</a>
     */
    public static void glProgramUniformMatrix2fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glProgramUniformMatrix2fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, program, location, value.length >> 2, transpose, value);
    }

    /**
     * Array version of: {@link #glProgramUniformMatrix3fv ProgramUniformMatrix3fv}
     * 
     * @see <a target="_blank" href="http://docs.gl/es3/glProgramUniform">Reference Page</a>
     */
    public static void glProgramUniformMatrix3fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glProgramUniformMatrix3fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, program, location, value.length / 9, transpose, value);
    }

    /**
     * Array version of: {@link #glProgramUniformMatrix4fv ProgramUniformMatrix4fv}
     * 
     * @see <a target="_blank" href="http://docs.gl/es3/glProgramUniform">Reference Page</a>
     */
    public static void glProgramUniformMatrix4fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glProgramUniformMatrix4fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, program, location, value.length >> 4, transpose, value);
    }

    /**
     * Array version of: {@link #glProgramUniformMatrix2x3fv ProgramUniformMatrix2x3fv}
     * 
     * @see <a target="_blank" href="http://docs.gl/es3/glProgramUniform">Reference Page</a>
     */
    public static void glProgramUniformMatrix2x3fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glProgramUniformMatrix2x3fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, program, location, value.length / 6, transpose, value);
    }

    /**
     * Array version of: {@link #glProgramUniformMatrix3x2fv ProgramUniformMatrix3x2fv}
     * 
     * @see <a target="_blank" href="http://docs.gl/es3/glProgramUniform">Reference Page</a>
     */
    public static void glProgramUniformMatrix3x2fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glProgramUniformMatrix3x2fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, program, location, value.length / 6, transpose, value);
    }

    /**
     * Array version of: {@link #glProgramUniformMatrix2x4fv ProgramUniformMatrix2x4fv}
     * 
     * @see <a target="_blank" href="http://docs.gl/es3/glProgramUniform">Reference Page</a>
     */
    public static void glProgramUniformMatrix2x4fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glProgramUniformMatrix2x4fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, program, location, value.length >> 3, transpose, value);
    }

    /**
     * Array version of: {@link #glProgramUniformMatrix4x2fv ProgramUniformMatrix4x2fv}
     * 
     * @see <a target="_blank" href="http://docs.gl/es3/glProgramUniform">Reference Page</a>
     */
    public static void glProgramUniformMatrix4x2fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glProgramUniformMatrix4x2fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, program, location, value.length >> 3, transpose, value);
    }

    /**
     * Array version of: {@link #glProgramUniformMatrix3x4fv ProgramUniformMatrix3x4fv}
     * 
     * @see <a target="_blank" href="http://docs.gl/es3/glProgramUniform">Reference Page</a>
     */
    public static void glProgramUniformMatrix3x4fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glProgramUniformMatrix3x4fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, program, location, value.length / 12, transpose, value);
    }

    /**
     * Array version of: {@link #glProgramUniformMatrix4x3fv ProgramUniformMatrix4x3fv}
     * 
     * @see <a target="_blank" href="http://docs.gl/es3/glProgramUniform">Reference Page</a>
     */
    public static void glProgramUniformMatrix4x3fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glProgramUniformMatrix4x3fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, program, location, value.length / 12, transpose, value);
    }

    /**
     * Array version of: {@link #glGetProgramPipelineInfoLog GetProgramPipelineInfoLog}
     * 
     * @see <a target="_blank" href="http://docs.gl/es3/glGetProgramPipelineInfoLog">Reference Page</a>
     */
    public static void glGetProgramPipelineInfoLog(@NativeType("GLuint") int pipeline, @Nullable @NativeType("GLsizei *") int[] length, @NativeType("GLchar *") ByteBuffer infoLog) {
        long __functionAddress = GLES.getICD().glGetProgramPipelineInfoLog;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(length, 1);
        }
        callPPV(__functionAddress, pipeline, infoLog.remaining(), length, memAddress(infoLog));
    }

    /**
     * Array version of: {@link #glGetMultisamplefv GetMultisamplefv}
     * 
     * @see <a target="_blank" href="http://docs.gl/es3/glGetMultisample">Reference Page</a>
     */
    public static void glGetMultisamplefv(@NativeType("GLenum") int pname, @NativeType("GLuint") int index, @NativeType("GLfloat *") float[] val) {
        long __functionAddress = GLES.getICD().glGetMultisamplefv;
        if (CHECKS) {
            check(__functionAddress);
            check(val, 1);
        }
        callPV(__functionAddress, pname, index, val);
    }

    /**
     * Array version of: {@link #glGetTexLevelParameteriv GetTexLevelParameteriv}
     * 
     * @see <a target="_blank" href="http://docs.gl/es3/glGetTexLevelParameter">Reference Page</a>
     */
    public static void glGetTexLevelParameteriv(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetTexLevelParameteriv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, target, level, pname, params);
    }

    /**
     * Array version of: {@link #glGetTexLevelParameterfv GetTexLevelParameterfv}
     * 
     * @see <a target="_blank" href="http://docs.gl/es3/glGetTexLevelParameter">Reference Page</a>
     */
    public static void glGetTexLevelParameterfv(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GLES.getICD().glGetTexLevelParameterfv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, target, level, pname, params);
    }

}
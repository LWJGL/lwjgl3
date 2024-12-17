/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class GL43C extends GL42C {

    static { GL.initialize(); }

    public static final int GL_NUM_SHADING_LANGUAGE_VERSIONS = 0x82E9;

    public static final int GL_VERTEX_ATTRIB_ARRAY_LONG = 0x874E;

    public static final int
        GL_COMPRESSED_RGB8_ETC2                      = 0x9274,
        GL_COMPRESSED_SRGB8_ETC2                     = 0x9275,
        GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2  = 0x9276,
        GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 = 0x9277,
        GL_COMPRESSED_RGBA8_ETC2_EAC                 = 0x9278,
        GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC          = 0x9279,
        GL_COMPRESSED_R11_EAC                        = 0x9270,
        GL_COMPRESSED_SIGNED_R11_EAC                 = 0x9271,
        GL_COMPRESSED_RG11_EAC                       = 0x9272,
        GL_COMPRESSED_SIGNED_RG11_EAC                = 0x9273;

    public static final int GL_PRIMITIVE_RESTART_FIXED_INDEX = 0x8D69;

    public static final int GL_ANY_SAMPLES_PASSED_CONSERVATIVE = 0x8D6A;

    public static final int GL_MAX_ELEMENT_INDEX = 0x8D6B;

    public static final int GL_TEXTURE_IMMUTABLE_LEVELS = 0x82DF;

    public static final int GL_COMPUTE_SHADER = 0x91B9;

    public static final int
        GL_MAX_COMPUTE_UNIFORM_BLOCKS              = 0x91BB,
        GL_MAX_COMPUTE_TEXTURE_IMAGE_UNITS         = 0x91BC,
        GL_MAX_COMPUTE_IMAGE_UNIFORMS              = 0x91BD,
        GL_MAX_COMPUTE_SHARED_MEMORY_SIZE          = 0x8262,
        GL_MAX_COMPUTE_UNIFORM_COMPONENTS          = 0x8263,
        GL_MAX_COMPUTE_ATOMIC_COUNTER_BUFFERS      = 0x8264,
        GL_MAX_COMPUTE_ATOMIC_COUNTERS             = 0x8265,
        GL_MAX_COMBINED_COMPUTE_UNIFORM_COMPONENTS = 0x8266,
        GL_MAX_COMPUTE_WORK_GROUP_INVOCATIONS      = 0x90EB;

    public static final int
        GL_MAX_COMPUTE_WORK_GROUP_COUNT = 0x91BE,
        GL_MAX_COMPUTE_WORK_GROUP_SIZE  = 0x91BF;

    public static final int GL_COMPUTE_WORK_GROUP_SIZE = 0x8267;

    public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_COMPUTE_SHADER = 0x90EC;

    public static final int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_COMPUTE_SHADER = 0x90ED;

    public static final int GL_DISPATCH_INDIRECT_BUFFER = 0x90EE;

    public static final int GL_DISPATCH_INDIRECT_BUFFER_BINDING = 0x90EF;

    public static final int GL_COMPUTE_SHADER_BIT = 0x20;

    public static final int
        GL_DEBUG_OUTPUT             = 0x92E0,
        GL_DEBUG_OUTPUT_SYNCHRONOUS = 0x8242;

    public static final int GL_CONTEXT_FLAG_DEBUG_BIT = 0x2;

    public static final int
        GL_MAX_DEBUG_MESSAGE_LENGTH         = 0x9143,
        GL_MAX_DEBUG_LOGGED_MESSAGES        = 0x9144,
        GL_DEBUG_LOGGED_MESSAGES            = 0x9145,
        GL_DEBUG_NEXT_LOGGED_MESSAGE_LENGTH = 0x8243,
        GL_MAX_DEBUG_GROUP_STACK_DEPTH      = 0x826C,
        GL_DEBUG_GROUP_STACK_DEPTH          = 0x826D,
        GL_MAX_LABEL_LENGTH                 = 0x82E8;

    public static final int
        GL_DEBUG_CALLBACK_FUNCTION   = 0x8244,
        GL_DEBUG_CALLBACK_USER_PARAM = 0x8245;

    public static final int
        GL_DEBUG_SOURCE_API             = 0x8246,
        GL_DEBUG_SOURCE_WINDOW_SYSTEM   = 0x8247,
        GL_DEBUG_SOURCE_SHADER_COMPILER = 0x8248,
        GL_DEBUG_SOURCE_THIRD_PARTY     = 0x8249,
        GL_DEBUG_SOURCE_APPLICATION     = 0x824A,
        GL_DEBUG_SOURCE_OTHER           = 0x824B;

    public static final int
        GL_DEBUG_TYPE_ERROR               = 0x824C,
        GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR = 0x824D,
        GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR  = 0x824E,
        GL_DEBUG_TYPE_PORTABILITY         = 0x824F,
        GL_DEBUG_TYPE_PERFORMANCE         = 0x8250,
        GL_DEBUG_TYPE_OTHER               = 0x8251,
        GL_DEBUG_TYPE_MARKER              = 0x8268;

    public static final int
        GL_DEBUG_TYPE_PUSH_GROUP = 0x8269,
        GL_DEBUG_TYPE_POP_GROUP  = 0x826A;

    public static final int
        GL_DEBUG_SEVERITY_HIGH         = 0x9146,
        GL_DEBUG_SEVERITY_MEDIUM       = 0x9147,
        GL_DEBUG_SEVERITY_LOW          = 0x9148,
        GL_DEBUG_SEVERITY_NOTIFICATION = 0x826B;

    public static final int
        GL_BUFFER           = 0x82E0,
        GL_SHADER           = 0x82E1,
        GL_PROGRAM          = 0x82E2,
        GL_QUERY            = 0x82E3,
        GL_PROGRAM_PIPELINE = 0x82E4,
        GL_SAMPLER          = 0x82E6;

    public static final int GL_MAX_UNIFORM_LOCATIONS = 0x826E;

    public static final int
        GL_FRAMEBUFFER_DEFAULT_WIDTH                  = 0x9310,
        GL_FRAMEBUFFER_DEFAULT_HEIGHT                 = 0x9311,
        GL_FRAMEBUFFER_DEFAULT_LAYERS                 = 0x9312,
        GL_FRAMEBUFFER_DEFAULT_SAMPLES                = 0x9313,
        GL_FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS = 0x9314;

    public static final int
        GL_MAX_FRAMEBUFFER_WIDTH   = 0x9315,
        GL_MAX_FRAMEBUFFER_HEIGHT  = 0x9316,
        GL_MAX_FRAMEBUFFER_LAYERS  = 0x9317,
        GL_MAX_FRAMEBUFFER_SAMPLES = 0x9318;

    public static final int
        GL_INTERNALFORMAT_SUPPORTED               = 0x826F,
        GL_INTERNALFORMAT_PREFERRED               = 0x8270,
        GL_INTERNALFORMAT_RED_SIZE                = 0x8271,
        GL_INTERNALFORMAT_GREEN_SIZE              = 0x8272,
        GL_INTERNALFORMAT_BLUE_SIZE               = 0x8273,
        GL_INTERNALFORMAT_ALPHA_SIZE              = 0x8274,
        GL_INTERNALFORMAT_DEPTH_SIZE              = 0x8275,
        GL_INTERNALFORMAT_STENCIL_SIZE            = 0x8276,
        GL_INTERNALFORMAT_SHARED_SIZE             = 0x8277,
        GL_INTERNALFORMAT_RED_TYPE                = 0x8278,
        GL_INTERNALFORMAT_GREEN_TYPE              = 0x8279,
        GL_INTERNALFORMAT_BLUE_TYPE               = 0x827A,
        GL_INTERNALFORMAT_ALPHA_TYPE              = 0x827B,
        GL_INTERNALFORMAT_DEPTH_TYPE              = 0x827C,
        GL_INTERNALFORMAT_STENCIL_TYPE            = 0x827D,
        GL_MAX_WIDTH                              = 0x827E,
        GL_MAX_HEIGHT                             = 0x827F,
        GL_MAX_DEPTH                              = 0x8280,
        GL_MAX_LAYERS                             = 0x8281,
        GL_MAX_COMBINED_DIMENSIONS                = 0x8282,
        GL_COLOR_COMPONENTS                       = 0x8283,
        GL_DEPTH_COMPONENTS                       = 0x8284,
        GL_STENCIL_COMPONENTS                     = 0x8285,
        GL_COLOR_RENDERABLE                       = 0x8286,
        GL_DEPTH_RENDERABLE                       = 0x8287,
        GL_STENCIL_RENDERABLE                     = 0x8288,
        GL_FRAMEBUFFER_RENDERABLE                 = 0x8289,
        GL_FRAMEBUFFER_RENDERABLE_LAYERED         = 0x828A,
        GL_FRAMEBUFFER_BLEND                      = 0x828B,
        GL_READ_PIXELS                            = 0x828C,
        GL_READ_PIXELS_FORMAT                     = 0x828D,
        GL_READ_PIXELS_TYPE                       = 0x828E,
        GL_TEXTURE_IMAGE_FORMAT                   = 0x828F,
        GL_TEXTURE_IMAGE_TYPE                     = 0x8290,
        GL_GET_TEXTURE_IMAGE_FORMAT               = 0x8291,
        GL_GET_TEXTURE_IMAGE_TYPE                 = 0x8292,
        GL_MIPMAP                                 = 0x8293,
        GL_MANUAL_GENERATE_MIPMAP                 = 0x8294,
        GL_AUTO_GENERATE_MIPMAP                   = 0x8295,
        GL_COLOR_ENCODING                         = 0x8296,
        GL_SRGB_READ                              = 0x8297,
        GL_SRGB_WRITE                             = 0x8298,
        GL_FILTER                                 = 0x829A,
        GL_VERTEX_TEXTURE                         = 0x829B,
        GL_TESS_CONTROL_TEXTURE                   = 0x829C,
        GL_TESS_EVALUATION_TEXTURE                = 0x829D,
        GL_GEOMETRY_TEXTURE                       = 0x829E,
        GL_FRAGMENT_TEXTURE                       = 0x829F,
        GL_COMPUTE_TEXTURE                        = 0x82A0,
        GL_TEXTURE_SHADOW                         = 0x82A1,
        GL_TEXTURE_GATHER                         = 0x82A2,
        GL_TEXTURE_GATHER_SHADOW                  = 0x82A3,
        GL_SHADER_IMAGE_LOAD                      = 0x82A4,
        GL_SHADER_IMAGE_STORE                     = 0x82A5,
        GL_SHADER_IMAGE_ATOMIC                    = 0x82A6,
        GL_IMAGE_TEXEL_SIZE                       = 0x82A7,
        GL_IMAGE_COMPATIBILITY_CLASS              = 0x82A8,
        GL_IMAGE_PIXEL_FORMAT                     = 0x82A9,
        GL_IMAGE_PIXEL_TYPE                       = 0x82AA,
        GL_SIMULTANEOUS_TEXTURE_AND_DEPTH_TEST    = 0x82AC,
        GL_SIMULTANEOUS_TEXTURE_AND_STENCIL_TEST  = 0x82AD,
        GL_SIMULTANEOUS_TEXTURE_AND_DEPTH_WRITE   = 0x82AE,
        GL_SIMULTANEOUS_TEXTURE_AND_STENCIL_WRITE = 0x82AF,
        GL_TEXTURE_COMPRESSED_BLOCK_WIDTH         = 0x82B1,
        GL_TEXTURE_COMPRESSED_BLOCK_HEIGHT        = 0x82B2,
        GL_TEXTURE_COMPRESSED_BLOCK_SIZE          = 0x82B3,
        GL_CLEAR_BUFFER                           = 0x82B4,
        GL_TEXTURE_VIEW                           = 0x82B5,
        GL_VIEW_COMPATIBILITY_CLASS               = 0x82B6;

    public static final int
        GL_FULL_SUPPORT              = 0x82B7,
        GL_CAVEAT_SUPPORT            = 0x82B8,
        GL_IMAGE_CLASS_4_X_32        = 0x82B9,
        GL_IMAGE_CLASS_2_X_32        = 0x82BA,
        GL_IMAGE_CLASS_1_X_32        = 0x82BB,
        GL_IMAGE_CLASS_4_X_16        = 0x82BC,
        GL_IMAGE_CLASS_2_X_16        = 0x82BD,
        GL_IMAGE_CLASS_1_X_16        = 0x82BE,
        GL_IMAGE_CLASS_4_X_8         = 0x82BF,
        GL_IMAGE_CLASS_2_X_8         = 0x82C0,
        GL_IMAGE_CLASS_1_X_8         = 0x82C1,
        GL_IMAGE_CLASS_11_11_10      = 0x82C2,
        GL_IMAGE_CLASS_10_10_10_2    = 0x82C3,
        GL_VIEW_CLASS_128_BITS       = 0x82C4,
        GL_VIEW_CLASS_96_BITS        = 0x82C5,
        GL_VIEW_CLASS_64_BITS        = 0x82C6,
        GL_VIEW_CLASS_48_BITS        = 0x82C7,
        GL_VIEW_CLASS_32_BITS        = 0x82C8,
        GL_VIEW_CLASS_24_BITS        = 0x82C9,
        GL_VIEW_CLASS_16_BITS        = 0x82CA,
        GL_VIEW_CLASS_8_BITS         = 0x82CB,
        GL_VIEW_CLASS_S3TC_DXT1_RGB  = 0x82CC,
        GL_VIEW_CLASS_S3TC_DXT1_RGBA = 0x82CD,
        GL_VIEW_CLASS_S3TC_DXT3_RGBA = 0x82CE,
        GL_VIEW_CLASS_S3TC_DXT5_RGBA = 0x82CF,
        GL_VIEW_CLASS_RGTC1_RED      = 0x82D0,
        GL_VIEW_CLASS_RGTC2_RG       = 0x82D1,
        GL_VIEW_CLASS_BPTC_UNORM     = 0x82D2,
        GL_VIEW_CLASS_BPTC_FLOAT     = 0x82D3;

    public static final int
        GL_UNIFORM                            = 0x92E1,
        GL_UNIFORM_BLOCK                      = 0x92E2,
        GL_PROGRAM_INPUT                      = 0x92E3,
        GL_PROGRAM_OUTPUT                     = 0x92E4,
        GL_BUFFER_VARIABLE                    = 0x92E5,
        GL_SHADER_STORAGE_BLOCK               = 0x92E6,
        GL_VERTEX_SUBROUTINE                  = 0x92E8,
        GL_TESS_CONTROL_SUBROUTINE            = 0x92E9,
        GL_TESS_EVALUATION_SUBROUTINE         = 0x92EA,
        GL_GEOMETRY_SUBROUTINE                = 0x92EB,
        GL_FRAGMENT_SUBROUTINE                = 0x92EC,
        GL_COMPUTE_SUBROUTINE                 = 0x92ED,
        GL_VERTEX_SUBROUTINE_UNIFORM          = 0x92EE,
        GL_TESS_CONTROL_SUBROUTINE_UNIFORM    = 0x92EF,
        GL_TESS_EVALUATION_SUBROUTINE_UNIFORM = 0x92F0,
        GL_GEOMETRY_SUBROUTINE_UNIFORM        = 0x92F1,
        GL_FRAGMENT_SUBROUTINE_UNIFORM        = 0x92F2,
        GL_COMPUTE_SUBROUTINE_UNIFORM         = 0x92F3,
        GL_TRANSFORM_FEEDBACK_VARYING         = 0x92F4;

    public static final int
        GL_ACTIVE_RESOURCES               = 0x92F5,
        GL_MAX_NAME_LENGTH                = 0x92F6,
        GL_MAX_NUM_ACTIVE_VARIABLES       = 0x92F7,
        GL_MAX_NUM_COMPATIBLE_SUBROUTINES = 0x92F8;

    public static final int
        GL_NAME_LENGTH                          = 0x92F9,
        GL_TYPE                                 = 0x92FA,
        GL_ARRAY_SIZE                           = 0x92FB,
        GL_OFFSET                               = 0x92FC,
        GL_BLOCK_INDEX                          = 0x92FD,
        GL_ARRAY_STRIDE                         = 0x92FE,
        GL_MATRIX_STRIDE                        = 0x92FF,
        GL_IS_ROW_MAJOR                         = 0x9300,
        GL_ATOMIC_COUNTER_BUFFER_INDEX          = 0x9301,
        GL_BUFFER_BINDING                       = 0x9302,
        GL_BUFFER_DATA_SIZE                     = 0x9303,
        GL_NUM_ACTIVE_VARIABLES                 = 0x9304,
        GL_ACTIVE_VARIABLES                     = 0x9305,
        GL_REFERENCED_BY_VERTEX_SHADER          = 0x9306,
        GL_REFERENCED_BY_TESS_CONTROL_SHADER    = 0x9307,
        GL_REFERENCED_BY_TESS_EVALUATION_SHADER = 0x9308,
        GL_REFERENCED_BY_GEOMETRY_SHADER        = 0x9309,
        GL_REFERENCED_BY_FRAGMENT_SHADER        = 0x930A,
        GL_REFERENCED_BY_COMPUTE_SHADER         = 0x930B,
        GL_TOP_LEVEL_ARRAY_SIZE                 = 0x930C,
        GL_TOP_LEVEL_ARRAY_STRIDE               = 0x930D,
        GL_LOCATION                             = 0x930E,
        GL_LOCATION_INDEX                       = 0x930F,
        GL_IS_PER_PATCH                         = 0x92E7;

    public static final int GL_SHADER_STORAGE_BUFFER = 0x90D2;

    public static final int GL_SHADER_STORAGE_BUFFER_BINDING = 0x90D3;

    public static final int
        GL_SHADER_STORAGE_BUFFER_START = 0x90D4,
        GL_SHADER_STORAGE_BUFFER_SIZE  = 0x90D5;

    public static final int
        GL_MAX_VERTEX_SHADER_STORAGE_BLOCKS          = 0x90D6,
        GL_MAX_GEOMETRY_SHADER_STORAGE_BLOCKS        = 0x90D7,
        GL_MAX_TESS_CONTROL_SHADER_STORAGE_BLOCKS    = 0x90D8,
        GL_MAX_TESS_EVALUATION_SHADER_STORAGE_BLOCKS = 0x90D9,
        GL_MAX_FRAGMENT_SHADER_STORAGE_BLOCKS        = 0x90DA,
        GL_MAX_COMPUTE_SHADER_STORAGE_BLOCKS         = 0x90DB,
        GL_MAX_COMBINED_SHADER_STORAGE_BLOCKS        = 0x90DC,
        GL_MAX_SHADER_STORAGE_BUFFER_BINDINGS        = 0x90DD,
        GL_MAX_SHADER_STORAGE_BLOCK_SIZE             = 0x90DE,
        GL_SHADER_STORAGE_BUFFER_OFFSET_ALIGNMENT    = 0x90DF;

    public static final int GL_SHADER_STORAGE_BARRIER_BIT = 0x2000;

    public static final int GL_MAX_COMBINED_SHADER_OUTPUT_RESOURCES = 0x8F39;

    public static final int GL_DEPTH_STENCIL_TEXTURE_MODE = 0x90EA;

    public static final int
        GL_TEXTURE_BUFFER_OFFSET = 0x919D,
        GL_TEXTURE_BUFFER_SIZE   = 0x919E;

    public static final int GL_TEXTURE_BUFFER_OFFSET_ALIGNMENT = 0x919F;

    public static final int
        GL_TEXTURE_VIEW_MIN_LEVEL  = 0x82DB,
        GL_TEXTURE_VIEW_NUM_LEVELS = 0x82DC,
        GL_TEXTURE_VIEW_MIN_LAYER  = 0x82DD,
        GL_TEXTURE_VIEW_NUM_LAYERS = 0x82DE;

    public static final int
        GL_VERTEX_ATTRIB_BINDING         = 0x82D4,
        GL_VERTEX_ATTRIB_RELATIVE_OFFSET = 0x82D5;

    public static final int
        GL_VERTEX_BINDING_DIVISOR = 0x82D6,
        GL_VERTEX_BINDING_OFFSET  = 0x82D7,
        GL_VERTEX_BINDING_STRIDE  = 0x82D8,
        GL_VERTEX_BINDING_BUFFER  = 0x8F4F;

    public static final int
        GL_MAX_VERTEX_ATTRIB_RELATIVE_OFFSET = 0x82D9,
        GL_MAX_VERTEX_ATTRIB_BINDINGS        = 0x82DA;

    protected GL43C() {
        throw new UnsupportedOperationException();
    }

    // --- [ glClearBufferData ] ---

    /** {@code void glClearBufferData(GLenum target, GLenum internalformat, GLenum format, GLenum type, void const * data)} */
    public static native void nglClearBufferData(int target, int internalformat, int format, int type, long data);

    /** {@code void glClearBufferData(GLenum target, GLenum internalformat, GLenum format, GLenum type, void const * data)} */
    public static void glClearBufferData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable ByteBuffer data) {
        nglClearBufferData(target, internalformat, format, type, memAddressSafe(data));
    }

    /** {@code void glClearBufferData(GLenum target, GLenum internalformat, GLenum format, GLenum type, void const * data)} */
    public static void glClearBufferData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable ShortBuffer data) {
        nglClearBufferData(target, internalformat, format, type, memAddressSafe(data));
    }

    /** {@code void glClearBufferData(GLenum target, GLenum internalformat, GLenum format, GLenum type, void const * data)} */
    public static void glClearBufferData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable IntBuffer data) {
        nglClearBufferData(target, internalformat, format, type, memAddressSafe(data));
    }

    /** {@code void glClearBufferData(GLenum target, GLenum internalformat, GLenum format, GLenum type, void const * data)} */
    public static void glClearBufferData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable FloatBuffer data) {
        nglClearBufferData(target, internalformat, format, type, memAddressSafe(data));
    }

    // --- [ glClearBufferSubData ] ---

    /** {@code void glClearBufferSubData(GLenum target, GLenum internalformat, GLintptr offset, GLsizeiptr size, GLenum format, GLenum type, void const * data)} */
    public static native void nglClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, long data);

    /** {@code void glClearBufferSubData(GLenum target, GLenum internalformat, GLintptr offset, GLsizeiptr size, GLenum format, GLenum type, void const * data)} */
    public static void glClearBufferSubData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable ByteBuffer data) {
        nglClearBufferSubData(target, internalformat, offset, size, format, type, memAddressSafe(data));
    }

    /** {@code void glClearBufferSubData(GLenum target, GLenum internalformat, GLintptr offset, GLsizeiptr size, GLenum format, GLenum type, void const * data)} */
    public static void glClearBufferSubData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable ShortBuffer data) {
        nglClearBufferSubData(target, internalformat, offset, size, format, type, memAddressSafe(data));
    }

    /** {@code void glClearBufferSubData(GLenum target, GLenum internalformat, GLintptr offset, GLsizeiptr size, GLenum format, GLenum type, void const * data)} */
    public static void glClearBufferSubData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable IntBuffer data) {
        nglClearBufferSubData(target, internalformat, offset, size, format, type, memAddressSafe(data));
    }

    /** {@code void glClearBufferSubData(GLenum target, GLenum internalformat, GLintptr offset, GLsizeiptr size, GLenum format, GLenum type, void const * data)} */
    public static void glClearBufferSubData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable FloatBuffer data) {
        nglClearBufferSubData(target, internalformat, offset, size, format, type, memAddressSafe(data));
    }

    // --- [ glDispatchCompute ] ---

    /** {@code void glDispatchCompute(GLuint num_groups_x, GLuint num_groups_y, GLuint num_groups_z)} */
    public static native void glDispatchCompute(@NativeType("GLuint") int num_groups_x, @NativeType("GLuint") int num_groups_y, @NativeType("GLuint") int num_groups_z);

    // --- [ glDispatchComputeIndirect ] ---

    /** {@code void glDispatchComputeIndirect(GLintptr indirect)} */
    public static native void glDispatchComputeIndirect(@NativeType("GLintptr") long indirect);

    // --- [ glCopyImageSubData ] ---

    /** {@code void glCopyImageSubData(GLuint srcName, GLenum srcTarget, GLint srcLevel, GLint srcX, GLint srcY, GLint srcZ, GLuint dstName, GLenum dstTarget, GLint dstLevel, GLint dstX, GLint dstY, GLint dstZ, GLsizei srcWidth, GLsizei srcHeight, GLsizei srcDepth)} */
    public static native void glCopyImageSubData(@NativeType("GLuint") int srcName, @NativeType("GLenum") int srcTarget, @NativeType("GLint") int srcLevel, @NativeType("GLint") int srcX, @NativeType("GLint") int srcY, @NativeType("GLint") int srcZ, @NativeType("GLuint") int dstName, @NativeType("GLenum") int dstTarget, @NativeType("GLint") int dstLevel, @NativeType("GLint") int dstX, @NativeType("GLint") int dstY, @NativeType("GLint") int dstZ, @NativeType("GLsizei") int srcWidth, @NativeType("GLsizei") int srcHeight, @NativeType("GLsizei") int srcDepth);

    // --- [ glDebugMessageControl ] ---

    /** {@code void glDebugMessageControl(GLenum source, GLenum type, GLenum severity, GLsizei count, GLuint const * ids, GLboolean enabled)} */
    public static native void nglDebugMessageControl(int source, int type, int severity, int count, long ids, boolean enabled);

    /** {@code void glDebugMessageControl(GLenum source, GLenum type, GLenum severity, GLsizei count, GLuint const * ids, GLboolean enabled)} */
    public static void glDebugMessageControl(@NativeType("GLenum") int source, @NativeType("GLenum") int type, @NativeType("GLenum") int severity, @NativeType("GLuint const *") @Nullable IntBuffer ids, @NativeType("GLboolean") boolean enabled) {
        nglDebugMessageControl(source, type, severity, remainingSafe(ids), memAddressSafe(ids), enabled);
    }

    /** {@code void glDebugMessageControl(GLenum source, GLenum type, GLenum severity, GLsizei count, GLuint const * ids, GLboolean enabled)} */
    public static void glDebugMessageControl(@NativeType("GLenum") int source, @NativeType("GLenum") int type, @NativeType("GLenum") int severity, @NativeType("GLuint const *") int id, @NativeType("GLboolean") boolean enabled) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer ids = stack.ints(id);
            nglDebugMessageControl(source, type, severity, 1, memAddress(ids), enabled);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glDebugMessageInsert ] ---

    /** {@code void glDebugMessageInsert(GLenum source, GLenum type, GLuint id, GLenum severity, GLsizei length, GLchar const * message)} */
    public static native void nglDebugMessageInsert(int source, int type, int id, int severity, int length, long message);

    /** {@code void glDebugMessageInsert(GLenum source, GLenum type, GLuint id, GLenum severity, GLsizei length, GLchar const * message)} */
    public static void glDebugMessageInsert(@NativeType("GLenum") int source, @NativeType("GLenum") int type, @NativeType("GLuint") int id, @NativeType("GLenum") int severity, @NativeType("GLchar const *") ByteBuffer message) {
        nglDebugMessageInsert(source, type, id, severity, message.remaining(), memAddress(message));
    }

    /** {@code void glDebugMessageInsert(GLenum source, GLenum type, GLuint id, GLenum severity, GLsizei length, GLchar const * message)} */
    public static void glDebugMessageInsert(@NativeType("GLenum") int source, @NativeType("GLenum") int type, @NativeType("GLuint") int id, @NativeType("GLenum") int severity, @NativeType("GLchar const *") CharSequence message) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int messageEncodedLength = stack.nUTF8(message, false);
            long messageEncoded = stack.getPointerAddress();
            nglDebugMessageInsert(source, type, id, severity, messageEncodedLength, messageEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glDebugMessageCallback ] ---

    /** {@code void glDebugMessageCallback(GLDEBUGPROC callback, void const * userParam)} */
    public static native void nglDebugMessageCallback(long callback, long userParam);

    /** {@code void glDebugMessageCallback(GLDEBUGPROC callback, void const * userParam)} */
    public static void glDebugMessageCallback(@NativeType("GLDEBUGPROC") @Nullable GLDebugMessageCallbackI callback, @NativeType("void const *") long userParam) {
        nglDebugMessageCallback(memAddressSafe(callback), userParam);
    }

    // --- [ glGetDebugMessageLog ] ---

    /** {@code GLuint glGetDebugMessageLog(GLuint count, GLsizei bufsize, GLenum * sources, GLenum * types, GLuint * ids, GLenum * severities, GLsizei * lengths, GLchar * messageLog)} */
    public static native int nglGetDebugMessageLog(int count, int bufsize, long sources, long types, long ids, long severities, long lengths, long messageLog);

    /** {@code GLuint glGetDebugMessageLog(GLuint count, GLsizei bufsize, GLenum * sources, GLenum * types, GLuint * ids, GLenum * severities, GLsizei * lengths, GLchar * messageLog)} */
    @NativeType("GLuint")
    public static int glGetDebugMessageLog(@NativeType("GLuint") int count, @NativeType("GLenum *") @Nullable IntBuffer sources, @NativeType("GLenum *") @Nullable IntBuffer types, @NativeType("GLuint *") @Nullable IntBuffer ids, @NativeType("GLenum *") @Nullable IntBuffer severities, @NativeType("GLsizei *") @Nullable IntBuffer lengths, @NativeType("GLchar *") @Nullable ByteBuffer messageLog) {
        if (CHECKS) {
            checkSafe(sources, count);
            checkSafe(types, count);
            checkSafe(ids, count);
            checkSafe(severities, count);
            checkSafe(lengths, count);
        }
        return nglGetDebugMessageLog(count, remainingSafe(messageLog), memAddressSafe(sources), memAddressSafe(types), memAddressSafe(ids), memAddressSafe(severities), memAddressSafe(lengths), memAddressSafe(messageLog));
    }

    // --- [ glPushDebugGroup ] ---

    /** {@code void glPushDebugGroup(GLenum source, GLuint id, GLsizei length, GLchar const * message)} */
    public static native void nglPushDebugGroup(int source, int id, int length, long message);

    /** {@code void glPushDebugGroup(GLenum source, GLuint id, GLsizei length, GLchar const * message)} */
    public static void glPushDebugGroup(@NativeType("GLenum") int source, @NativeType("GLuint") int id, @NativeType("GLchar const *") ByteBuffer message) {
        nglPushDebugGroup(source, id, message.remaining(), memAddress(message));
    }

    /** {@code void glPushDebugGroup(GLenum source, GLuint id, GLsizei length, GLchar const * message)} */
    public static void glPushDebugGroup(@NativeType("GLenum") int source, @NativeType("GLuint") int id, @NativeType("GLchar const *") CharSequence message) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int messageEncodedLength = stack.nUTF8(message, false);
            long messageEncoded = stack.getPointerAddress();
            nglPushDebugGroup(source, id, messageEncodedLength, messageEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glPopDebugGroup ] ---

    /** {@code void glPopDebugGroup(void)} */
    public static native void glPopDebugGroup();

    // --- [ glObjectLabel ] ---

    /** {@code void glObjectLabel(GLenum identifier, GLuint name, GLsizei length, GLchar const * label)} */
    public static native void nglObjectLabel(int identifier, int name, int length, long label);

    /** {@code void glObjectLabel(GLenum identifier, GLuint name, GLsizei length, GLchar const * label)} */
    public static void glObjectLabel(@NativeType("GLenum") int identifier, @NativeType("GLuint") int name, @NativeType("GLchar const *") ByteBuffer label) {
        nglObjectLabel(identifier, name, label.remaining(), memAddress(label));
    }

    /** {@code void glObjectLabel(GLenum identifier, GLuint name, GLsizei length, GLchar const * label)} */
    public static void glObjectLabel(@NativeType("GLenum") int identifier, @NativeType("GLuint") int name, @NativeType("GLchar const *") CharSequence label) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int labelEncodedLength = stack.nUTF8(label, false);
            long labelEncoded = stack.getPointerAddress();
            nglObjectLabel(identifier, name, labelEncodedLength, labelEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetObjectLabel ] ---

    /** {@code void glGetObjectLabel(GLenum identifier, GLuint name, GLsizei bufSize, GLsizei * length, GLchar * label)} */
    public static native void nglGetObjectLabel(int identifier, int name, int bufSize, long length, long label);

    /** {@code void glGetObjectLabel(GLenum identifier, GLuint name, GLsizei bufSize, GLsizei * length, GLchar * label)} */
    public static void glGetObjectLabel(@NativeType("GLenum") int identifier, @NativeType("GLuint") int name, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLchar *") ByteBuffer label) {
        if (CHECKS) {
            checkSafe(length, 1);
        }
        nglGetObjectLabel(identifier, name, label.remaining(), memAddressSafe(length), memAddress(label));
    }

    /** {@code void glGetObjectLabel(GLenum identifier, GLuint name, GLsizei bufSize, GLsizei * length, GLchar * label)} */
    @NativeType("void")
    public static String glGetObjectLabel(@NativeType("GLenum") int identifier, @NativeType("GLuint") int name, @NativeType("GLsizei") int bufSize) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer length = stack.ints(0);
            ByteBuffer label = stack.malloc(bufSize);
            nglGetObjectLabel(identifier, name, bufSize, memAddress(length), memAddress(label));
            return memUTF8(label, length.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glGetObjectLabel(GLenum identifier, GLuint name, GLsizei bufSize, GLsizei * length, GLchar * label)} */
    @NativeType("void")
    public static String glGetObjectLabel(@NativeType("GLenum") int identifier, @NativeType("GLuint") int name) {
        return glGetObjectLabel(identifier, name, GL11.glGetInteger(GL_MAX_LABEL_LENGTH));
    }

    // --- [ glObjectPtrLabel ] ---

    /** {@code void glObjectPtrLabel(void * ptr, GLsizei length, GLchar const * label)} */
    public static native void nglObjectPtrLabel(long ptr, int length, long label);

    /** {@code void glObjectPtrLabel(void * ptr, GLsizei length, GLchar const * label)} */
    public static void glObjectPtrLabel(@NativeType("void *") long ptr, @NativeType("GLchar const *") ByteBuffer label) {
        if (CHECKS) {
            check(ptr);
        }
        nglObjectPtrLabel(ptr, label.remaining(), memAddress(label));
    }

    /** {@code void glObjectPtrLabel(void * ptr, GLsizei length, GLchar const * label)} */
    public static void glObjectPtrLabel(@NativeType("void *") long ptr, @NativeType("GLchar const *") CharSequence label) {
        if (CHECKS) {
            check(ptr);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int labelEncodedLength = stack.nUTF8(label, false);
            long labelEncoded = stack.getPointerAddress();
            nglObjectPtrLabel(ptr, labelEncodedLength, labelEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetObjectPtrLabel ] ---

    /** {@code void glGetObjectPtrLabel(void * ptr, GLsizei bufSize, GLsizei * length, GLchar * label)} */
    public static native void nglGetObjectPtrLabel(long ptr, int bufSize, long length, long label);

    /** {@code void glGetObjectPtrLabel(void * ptr, GLsizei bufSize, GLsizei * length, GLchar * label)} */
    public static void glGetObjectPtrLabel(@NativeType("void *") long ptr, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLchar *") ByteBuffer label) {
        if (CHECKS) {
            check(ptr);
            checkSafe(length, 1);
        }
        nglGetObjectPtrLabel(ptr, label.remaining(), memAddressSafe(length), memAddress(label));
    }

    /** {@code void glGetObjectPtrLabel(void * ptr, GLsizei bufSize, GLsizei * length, GLchar * label)} */
    @NativeType("void")
    public static String glGetObjectPtrLabel(@NativeType("void *") long ptr, @NativeType("GLsizei") int bufSize) {
        if (CHECKS) {
            check(ptr);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer length = stack.ints(0);
            ByteBuffer label = stack.malloc(bufSize);
            nglGetObjectPtrLabel(ptr, bufSize, memAddress(length), memAddress(label));
            return memUTF8(label, length.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glGetObjectPtrLabel(void * ptr, GLsizei bufSize, GLsizei * length, GLchar * label)} */
    @NativeType("void")
    public static String glGetObjectPtrLabel(@NativeType("void *") long ptr) {
        return glGetObjectPtrLabel(ptr, GL11.glGetInteger(GL_MAX_LABEL_LENGTH));
    }

    // --- [ glFramebufferParameteri ] ---

    /** {@code void glFramebufferParameteri(GLenum target, GLenum pname, GLint param)} */
    public static native void glFramebufferParameteri(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint") int param);

    // --- [ glGetFramebufferParameteriv ] ---

    /** {@code void glGetFramebufferParameteriv(GLenum target, GLenum pname, GLint * params)} */
    public static native void nglGetFramebufferParameteriv(int target, int pname, long params);

    /** {@code void glGetFramebufferParameteriv(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetFramebufferParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetFramebufferParameteriv(target, pname, memAddress(params));
    }

    /** {@code void glGetFramebufferParameteriv(GLenum target, GLenum pname, GLint * params)} */
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

    // --- [ glGetInternalformati64v ] ---

    /** {@code void glGetInternalformati64v(GLenum target, GLenum internalformat, GLenum pname, GLsizei bufSize, GLint64 * params)} */
    public static native void nglGetInternalformati64v(int target, int internalformat, int pname, int bufSize, long params);

    /** {@code void glGetInternalformati64v(GLenum target, GLenum internalformat, GLenum pname, GLsizei bufSize, GLint64 * params)} */
    public static void glGetInternalformati64v(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int pname, @NativeType("GLint64 *") LongBuffer params) {
        nglGetInternalformati64v(target, internalformat, pname, params.remaining(), memAddress(params));
    }

    /** {@code void glGetInternalformati64v(GLenum target, GLenum internalformat, GLenum pname, GLsizei bufSize, GLint64 * params)} */
    @NativeType("void")
    public static long glGetInternalformati64(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer params = stack.callocLong(1);
            nglGetInternalformati64v(target, internalformat, pname, 1, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glInvalidateTexSubImage ] ---

    /** {@code void glInvalidateTexSubImage(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth)} */
    public static native void glInvalidateTexSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth);

    // --- [ glInvalidateTexImage ] ---

    /** {@code void glInvalidateTexImage(GLuint texture, GLint level)} */
    public static native void glInvalidateTexImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level);

    // --- [ glInvalidateBufferSubData ] ---

    /** {@code void glInvalidateBufferSubData(GLuint buffer, GLintptr offset, GLsizeiptr length)} */
    public static native void glInvalidateBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long length);

    // --- [ glInvalidateBufferData ] ---

    /** {@code void glInvalidateBufferData(GLuint buffer)} */
    public static native void glInvalidateBufferData(@NativeType("GLuint") int buffer);

    // --- [ glInvalidateFramebuffer ] ---

    /** {@code void glInvalidateFramebuffer(GLenum target, GLsizei numAttachments, GLenum const * attachments)} */
    public static native void nglInvalidateFramebuffer(int target, int numAttachments, long attachments);

    /** {@code void glInvalidateFramebuffer(GLenum target, GLsizei numAttachments, GLenum const * attachments)} */
    public static void glInvalidateFramebuffer(@NativeType("GLenum") int target, @NativeType("GLenum const *") IntBuffer attachments) {
        nglInvalidateFramebuffer(target, attachments.remaining(), memAddress(attachments));
    }

    /** {@code void glInvalidateFramebuffer(GLenum target, GLsizei numAttachments, GLenum const * attachments)} */
    public static void glInvalidateFramebuffer(@NativeType("GLenum") int target, @NativeType("GLenum const *") int attachment) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer attachments = stack.ints(attachment);
            nglInvalidateFramebuffer(target, 1, memAddress(attachments));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glInvalidateSubFramebuffer ] ---

    /** {@code void glInvalidateSubFramebuffer(GLenum target, GLsizei numAttachments, GLenum const * attachments, GLint x, GLint y, GLsizei width, GLsizei height)} */
    public static native void nglInvalidateSubFramebuffer(int target, int numAttachments, long attachments, int x, int y, int width, int height);

    /** {@code void glInvalidateSubFramebuffer(GLenum target, GLsizei numAttachments, GLenum const * attachments, GLint x, GLint y, GLsizei width, GLsizei height)} */
    public static void glInvalidateSubFramebuffer(@NativeType("GLenum") int target, @NativeType("GLenum const *") IntBuffer attachments, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        nglInvalidateSubFramebuffer(target, attachments.remaining(), memAddress(attachments), x, y, width, height);
    }

    /** {@code void glInvalidateSubFramebuffer(GLenum target, GLsizei numAttachments, GLenum const * attachments, GLint x, GLint y, GLsizei width, GLsizei height)} */
    public static void glInvalidateSubFramebuffer(@NativeType("GLenum") int target, @NativeType("GLenum const *") int attachment, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer attachments = stack.ints(attachment);
            nglInvalidateSubFramebuffer(target, 1, memAddress(attachments), x, y, width, height);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glMultiDrawArraysIndirect ] ---

    /** {@code void glMultiDrawArraysIndirect(GLenum mode, void const * indirect, GLsizei drawcount, GLsizei stride)} */
    public static native void nglMultiDrawArraysIndirect(int mode, long indirect, int drawcount, int stride);

    /** {@code void glMultiDrawArraysIndirect(GLenum mode, void const * indirect, GLsizei drawcount, GLsizei stride)} */
    public static void glMultiDrawArraysIndirect(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indirect, @NativeType("GLsizei") int drawcount, @NativeType("GLsizei") int stride) {
        if (CHECKS) {
            check(indirect, drawcount * (stride == 0 ? (4 * 4) : stride));
        }
        nglMultiDrawArraysIndirect(mode, memAddress(indirect), drawcount, stride);
    }

    /** {@code void glMultiDrawArraysIndirect(GLenum mode, void const * indirect, GLsizei drawcount, GLsizei stride)} */
    public static void glMultiDrawArraysIndirect(@NativeType("GLenum") int mode, @NativeType("void const *") long indirect, @NativeType("GLsizei") int drawcount, @NativeType("GLsizei") int stride) {
        nglMultiDrawArraysIndirect(mode, indirect, drawcount, stride);
    }

    /** {@code void glMultiDrawArraysIndirect(GLenum mode, void const * indirect, GLsizei drawcount, GLsizei stride)} */
    public static void glMultiDrawArraysIndirect(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indirect, @NativeType("GLsizei") int drawcount, @NativeType("GLsizei") int stride) {
        if (CHECKS) {
            check(indirect, (drawcount * (stride == 0 ? (4 * 4) : stride)) >> 2);
        }
        nglMultiDrawArraysIndirect(mode, memAddress(indirect), drawcount, stride);
    }

    // --- [ glMultiDrawElementsIndirect ] ---

    /** {@code void glMultiDrawElementsIndirect(GLenum mode, GLenum type, void const * indirect, GLsizei drawcount, GLsizei stride)} */
    public static native void nglMultiDrawElementsIndirect(int mode, int type, long indirect, int drawcount, int stride);

    /** {@code void glMultiDrawElementsIndirect(GLenum mode, GLenum type, void const * indirect, GLsizei drawcount, GLsizei stride)} */
    public static void glMultiDrawElementsIndirect(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indirect, @NativeType("GLsizei") int drawcount, @NativeType("GLsizei") int stride) {
        if (CHECKS) {
            check(indirect, drawcount * (stride == 0 ? (5 * 4) : stride));
        }
        nglMultiDrawElementsIndirect(mode, type, memAddress(indirect), drawcount, stride);
    }

    /** {@code void glMultiDrawElementsIndirect(GLenum mode, GLenum type, void const * indirect, GLsizei drawcount, GLsizei stride)} */
    public static void glMultiDrawElementsIndirect(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") long indirect, @NativeType("GLsizei") int drawcount, @NativeType("GLsizei") int stride) {
        nglMultiDrawElementsIndirect(mode, type, indirect, drawcount, stride);
    }

    /** {@code void glMultiDrawElementsIndirect(GLenum mode, GLenum type, void const * indirect, GLsizei drawcount, GLsizei stride)} */
    public static void glMultiDrawElementsIndirect(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer indirect, @NativeType("GLsizei") int drawcount, @NativeType("GLsizei") int stride) {
        if (CHECKS) {
            check(indirect, (drawcount * (stride == 0 ? (5 * 4) : stride)) >> 2);
        }
        nglMultiDrawElementsIndirect(mode, type, memAddress(indirect), drawcount, stride);
    }

    // --- [ glGetProgramInterfaceiv ] ---

    /** {@code void glGetProgramInterfaceiv(GLuint program, GLenum programInterface, GLenum pname, GLint * params)} */
    public static native void nglGetProgramInterfaceiv(int program, int programInterface, int pname, long params);

    /** {@code void glGetProgramInterfaceiv(GLuint program, GLenum programInterface, GLenum pname, GLint * params)} */
    public static void glGetProgramInterfaceiv(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetProgramInterfaceiv(program, programInterface, pname, memAddress(params));
    }

    /** {@code void glGetProgramInterfaceiv(GLuint program, GLenum programInterface, GLenum pname, GLint * params)} */
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

    /** {@code GLuint glGetProgramResourceIndex(GLuint program, GLenum programInterface, GLchar const * name)} */
    public static native int nglGetProgramResourceIndex(int program, int programInterface, long name);

    /** {@code GLuint glGetProgramResourceIndex(GLuint program, GLenum programInterface, GLchar const * name)} */
    @NativeType("GLuint")
    public static int glGetProgramResourceIndex(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLchar const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nglGetProgramResourceIndex(program, programInterface, memAddress(name));
    }

    /** {@code GLuint glGetProgramResourceIndex(GLuint program, GLenum programInterface, GLchar const * name)} */
    @NativeType("GLuint")
    public static int glGetProgramResourceIndex(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLchar const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nglGetProgramResourceIndex(program, programInterface, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetProgramResourceName ] ---

    /** {@code void glGetProgramResourceName(GLuint program, GLenum programInterface, GLuint index, GLsizei bufSize, GLsizei * length, GLchar * name)} */
    public static native void nglGetProgramResourceName(int program, int programInterface, int index, int bufSize, long length, long name);

    /** {@code void glGetProgramResourceName(GLuint program, GLenum programInterface, GLuint index, GLsizei bufSize, GLsizei * length, GLchar * name)} */
    public static void glGetProgramResourceName(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLuint") int index, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLchar *") ByteBuffer name) {
        if (CHECKS) {
            checkSafe(length, 1);
        }
        nglGetProgramResourceName(program, programInterface, index, name.remaining(), memAddressSafe(length), memAddress(name));
    }

    /** {@code void glGetProgramResourceName(GLuint program, GLenum programInterface, GLuint index, GLsizei bufSize, GLsizei * length, GLchar * name)} */
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

    /** {@code void glGetProgramResourceName(GLuint program, GLenum programInterface, GLuint index, GLsizei bufSize, GLsizei * length, GLchar * name)} */
    @NativeType("void")
    public static String glGetProgramResourceName(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLuint") int index) {
        return glGetProgramResourceName(program, programInterface, index, glGetProgramInterfacei(program, programInterface, GL_MAX_NAME_LENGTH));
    }

    // --- [ glGetProgramResourceiv ] ---

    /** {@code void glGetProgramResourceiv(GLuint program, GLenum programInterface, GLuint index, GLsizei propCount, GLenum const * props, GLsizei bufSize, GLsizei * length, GLint * params)} */
    public static native void nglGetProgramResourceiv(int program, int programInterface, int index, int propCount, long props, int bufSize, long length, long params);

    /** {@code void glGetProgramResourceiv(GLuint program, GLenum programInterface, GLuint index, GLsizei propCount, GLenum const * props, GLsizei bufSize, GLsizei * length, GLint * params)} */
    public static void glGetProgramResourceiv(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLuint") int index, @NativeType("GLenum const *") IntBuffer props, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            checkSafe(length, 1);
        }
        nglGetProgramResourceiv(program, programInterface, index, props.remaining(), memAddress(props), params.remaining(), memAddressSafe(length), memAddress(params));
    }

    // --- [ glGetProgramResourceLocation ] ---

    /** {@code GLint glGetProgramResourceLocation(GLuint program, GLenum programInterface, GLchar const * name)} */
    public static native int nglGetProgramResourceLocation(int program, int programInterface, long name);

    /** {@code GLint glGetProgramResourceLocation(GLuint program, GLenum programInterface, GLchar const * name)} */
    @NativeType("GLint")
    public static int glGetProgramResourceLocation(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLchar const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nglGetProgramResourceLocation(program, programInterface, memAddress(name));
    }

    /** {@code GLint glGetProgramResourceLocation(GLuint program, GLenum programInterface, GLchar const * name)} */
    @NativeType("GLint")
    public static int glGetProgramResourceLocation(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLchar const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nglGetProgramResourceLocation(program, programInterface, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetProgramResourceLocationIndex ] ---

    /** {@code GLint glGetProgramResourceLocationIndex(GLuint program, GLenum programInterface, GLchar const * name)} */
    public static native int nglGetProgramResourceLocationIndex(int program, int programInterface, long name);

    /** {@code GLint glGetProgramResourceLocationIndex(GLuint program, GLenum programInterface, GLchar const * name)} */
    @NativeType("GLint")
    public static int glGetProgramResourceLocationIndex(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLchar const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nglGetProgramResourceLocationIndex(program, programInterface, memAddress(name));
    }

    /** {@code GLint glGetProgramResourceLocationIndex(GLuint program, GLenum programInterface, GLchar const * name)} */
    @NativeType("GLint")
    public static int glGetProgramResourceLocationIndex(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLchar const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nglGetProgramResourceLocationIndex(program, programInterface, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glShaderStorageBlockBinding ] ---

    /** {@code void glShaderStorageBlockBinding(GLuint program, GLuint storageBlockIndex, GLuint storageBlockBinding)} */
    public static native void glShaderStorageBlockBinding(@NativeType("GLuint") int program, @NativeType("GLuint") int storageBlockIndex, @NativeType("GLuint") int storageBlockBinding);

    // --- [ glTexBufferRange ] ---

    /** {@code void glTexBufferRange(GLenum target, GLenum internalformat, GLuint buffer, GLintptr offset, GLsizeiptr size)} */
    public static native void glTexBufferRange(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size);

    // --- [ glTexStorage2DMultisample ] ---

    /** {@code void glTexStorage2DMultisample(GLenum target, GLsizei samples, GLenum internalformat, GLsizei width, GLsizei height, GLboolean fixedsamplelocations)} */
    public static native void glTexStorage2DMultisample(@NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLboolean") boolean fixedsamplelocations);

    // --- [ glTexStorage3DMultisample ] ---

    /** {@code void glTexStorage3DMultisample(GLenum target, GLsizei samples, GLenum internalformat, GLsizei width, GLsizei height, GLsizei depth, GLboolean fixedsamplelocations)} */
    public static native void glTexStorage3DMultisample(@NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLboolean") boolean fixedsamplelocations);

    // --- [ glTextureView ] ---

    /** {@code void glTextureView(GLuint texture, GLenum target, GLuint origtexture, GLenum internalformat, GLuint minlevel, GLuint numlevels, GLuint minlayer, GLuint numlayers)} */
    public static native void glTextureView(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLuint") int origtexture, @NativeType("GLenum") int internalformat, @NativeType("GLuint") int minlevel, @NativeType("GLuint") int numlevels, @NativeType("GLuint") int minlayer, @NativeType("GLuint") int numlayers);

    // --- [ glBindVertexBuffer ] ---

    /** {@code void glBindVertexBuffer(GLuint bindingindex, GLuint buffer, GLintptr offset, GLsizei stride)} */
    public static native void glBindVertexBuffer(@NativeType("GLuint") int bindingindex, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizei") int stride);

    // --- [ glVertexAttribFormat ] ---

    /** {@code void glVertexAttribFormat(GLuint attribindex, GLint size, GLenum type, GLboolean normalized, GLuint relativeoffset)} */
    public static native void glVertexAttribFormat(@NativeType("GLuint") int attribindex, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint") int relativeoffset);

    // --- [ glVertexAttribIFormat ] ---

    /** {@code void glVertexAttribIFormat(GLuint attribindex, GLint size, GLenum type, GLuint relativeoffset)} */
    public static native void glVertexAttribIFormat(@NativeType("GLuint") int attribindex, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLuint") int relativeoffset);

    // --- [ glVertexAttribLFormat ] ---

    /** {@code void glVertexAttribLFormat(GLuint attribindex, GLint size, GLenum type, GLuint relativeoffset)} */
    public static native void glVertexAttribLFormat(@NativeType("GLuint") int attribindex, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLuint") int relativeoffset);

    // --- [ glVertexAttribBinding ] ---

    /** {@code void glVertexAttribBinding(GLuint attribindex, GLuint bindingindex)} */
    public static native void glVertexAttribBinding(@NativeType("GLuint") int attribindex, @NativeType("GLuint") int bindingindex);

    // --- [ glVertexBindingDivisor ] ---

    /** {@code void glVertexBindingDivisor(GLuint bindingindex, GLuint divisor)} */
    public static native void glVertexBindingDivisor(@NativeType("GLuint") int bindingindex, @NativeType("GLuint") int divisor);

    /** {@code void glClearBufferData(GLenum target, GLenum internalformat, GLenum format, GLenum type, void const * data)} */
    public static void glClearBufferData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short @Nullable [] data) {
        long __functionAddress = GL.getICD().glClearBufferData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, internalformat, format, type, data, __functionAddress);
    }

    /** {@code void glClearBufferData(GLenum target, GLenum internalformat, GLenum format, GLenum type, void const * data)} */
    public static void glClearBufferData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int @Nullable [] data) {
        long __functionAddress = GL.getICD().glClearBufferData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, internalformat, format, type, data, __functionAddress);
    }

    /** {@code void glClearBufferData(GLenum target, GLenum internalformat, GLenum format, GLenum type, void const * data)} */
    public static void glClearBufferData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float @Nullable [] data) {
        long __functionAddress = GL.getICD().glClearBufferData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, internalformat, format, type, data, __functionAddress);
    }

    /** {@code void glClearBufferSubData(GLenum target, GLenum internalformat, GLintptr offset, GLsizeiptr size, GLenum format, GLenum type, void const * data)} */
    public static void glClearBufferSubData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short @Nullable [] data) {
        long __functionAddress = GL.getICD().glClearBufferSubData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(target, internalformat, offset, size, format, type, data, __functionAddress);
    }

    /** {@code void glClearBufferSubData(GLenum target, GLenum internalformat, GLintptr offset, GLsizeiptr size, GLenum format, GLenum type, void const * data)} */
    public static void glClearBufferSubData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int @Nullable [] data) {
        long __functionAddress = GL.getICD().glClearBufferSubData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(target, internalformat, offset, size, format, type, data, __functionAddress);
    }

    /** {@code void glClearBufferSubData(GLenum target, GLenum internalformat, GLintptr offset, GLsizeiptr size, GLenum format, GLenum type, void const * data)} */
    public static void glClearBufferSubData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float @Nullable [] data) {
        long __functionAddress = GL.getICD().glClearBufferSubData;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(target, internalformat, offset, size, format, type, data, __functionAddress);
    }

    /** {@code void glDebugMessageControl(GLenum source, GLenum type, GLenum severity, GLsizei count, GLuint const * ids, GLboolean enabled)} */
    public static void glDebugMessageControl(@NativeType("GLenum") int source, @NativeType("GLenum") int type, @NativeType("GLenum") int severity, @NativeType("GLuint const *") int @Nullable [] ids, @NativeType("GLboolean") boolean enabled) {
        long __functionAddress = GL.getICD().glDebugMessageControl;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(source, type, severity, lengthSafe(ids), ids, enabled, __functionAddress);
    }

    /** {@code GLuint glGetDebugMessageLog(GLuint count, GLsizei bufsize, GLenum * sources, GLenum * types, GLuint * ids, GLenum * severities, GLsizei * lengths, GLchar * messageLog)} */
    @NativeType("GLuint")
    public static int glGetDebugMessageLog(@NativeType("GLuint") int count, @NativeType("GLenum *") int @Nullable [] sources, @NativeType("GLenum *") int @Nullable [] types, @NativeType("GLuint *") int @Nullable [] ids, @NativeType("GLenum *") int @Nullable [] severities, @NativeType("GLsizei *") int @Nullable [] lengths, @NativeType("GLchar *") @Nullable ByteBuffer messageLog) {
        long __functionAddress = GL.getICD().glGetDebugMessageLog;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(sources, count);
            checkSafe(types, count);
            checkSafe(ids, count);
            checkSafe(severities, count);
            checkSafe(lengths, count);
        }
        return callPPPPPPI(count, remainingSafe(messageLog), sources, types, ids, severities, lengths, memAddressSafe(messageLog), __functionAddress);
    }

    /** {@code void glGetObjectLabel(GLenum identifier, GLuint name, GLsizei bufSize, GLsizei * length, GLchar * label)} */
    public static void glGetObjectLabel(@NativeType("GLenum") int identifier, @NativeType("GLuint") int name, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLchar *") ByteBuffer label) {
        long __functionAddress = GL.getICD().glGetObjectLabel;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(length, 1);
        }
        callPPV(identifier, name, label.remaining(), length, memAddress(label), __functionAddress);
    }

    /** {@code void glGetObjectPtrLabel(void * ptr, GLsizei bufSize, GLsizei * length, GLchar * label)} */
    public static void glGetObjectPtrLabel(@NativeType("void *") long ptr, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLchar *") ByteBuffer label) {
        long __functionAddress = GL.getICD().glGetObjectPtrLabel;
        if (CHECKS) {
            check(__functionAddress);
            check(ptr);
            checkSafe(length, 1);
        }
        callPPPV(ptr, label.remaining(), length, memAddress(label), __functionAddress);
    }

    /** {@code void glGetFramebufferParameteriv(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetFramebufferParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetFramebufferParameteriv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** {@code void glGetInternalformati64v(GLenum target, GLenum internalformat, GLenum pname, GLsizei bufSize, GLint64 * params)} */
    public static void glGetInternalformati64v(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int pname, @NativeType("GLint64 *") long[] params) {
        long __functionAddress = GL.getICD().glGetInternalformati64v;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, internalformat, pname, params.length, params, __functionAddress);
    }

    /** {@code void glInvalidateFramebuffer(GLenum target, GLsizei numAttachments, GLenum const * attachments)} */
    public static void glInvalidateFramebuffer(@NativeType("GLenum") int target, @NativeType("GLenum const *") int[] attachments) {
        long __functionAddress = GL.getICD().glInvalidateFramebuffer;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, attachments.length, attachments, __functionAddress);
    }

    /** {@code void glInvalidateSubFramebuffer(GLenum target, GLsizei numAttachments, GLenum const * attachments, GLint x, GLint y, GLsizei width, GLsizei height)} */
    public static void glInvalidateSubFramebuffer(@NativeType("GLenum") int target, @NativeType("GLenum const *") int[] attachments, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        long __functionAddress = GL.getICD().glInvalidateSubFramebuffer;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, attachments.length, attachments, x, y, width, height, __functionAddress);
    }

    /** {@code void glMultiDrawArraysIndirect(GLenum mode, void const * indirect, GLsizei drawcount, GLsizei stride)} */
    public static void glMultiDrawArraysIndirect(@NativeType("GLenum") int mode, @NativeType("void const *") int[] indirect, @NativeType("GLsizei") int drawcount, @NativeType("GLsizei") int stride) {
        long __functionAddress = GL.getICD().glMultiDrawArraysIndirect;
        if (CHECKS) {
            check(__functionAddress);
            check(indirect, (drawcount * (stride == 0 ? (4 * 4) : stride)) >> 2);
        }
        callPV(mode, indirect, drawcount, stride, __functionAddress);
    }

    /** {@code void glMultiDrawElementsIndirect(GLenum mode, GLenum type, void const * indirect, GLsizei drawcount, GLsizei stride)} */
    public static void glMultiDrawElementsIndirect(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") int[] indirect, @NativeType("GLsizei") int drawcount, @NativeType("GLsizei") int stride) {
        long __functionAddress = GL.getICD().glMultiDrawElementsIndirect;
        if (CHECKS) {
            check(__functionAddress);
            check(indirect, (drawcount * (stride == 0 ? (5 * 4) : stride)) >> 2);
        }
        callPV(mode, type, indirect, drawcount, stride, __functionAddress);
    }

    /** {@code void glGetProgramInterfaceiv(GLuint program, GLenum programInterface, GLenum pname, GLint * params)} */
    public static void glGetProgramInterfaceiv(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetProgramInterfaceiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(program, programInterface, pname, params, __functionAddress);
    }

    /** {@code void glGetProgramResourceName(GLuint program, GLenum programInterface, GLuint index, GLsizei bufSize, GLsizei * length, GLchar * name)} */
    public static void glGetProgramResourceName(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLuint") int index, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLchar *") ByteBuffer name) {
        long __functionAddress = GL.getICD().glGetProgramResourceName;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(length, 1);
        }
        callPPV(program, programInterface, index, name.remaining(), length, memAddress(name), __functionAddress);
    }

    /** {@code void glGetProgramResourceiv(GLuint program, GLenum programInterface, GLuint index, GLsizei propCount, GLenum const * props, GLsizei bufSize, GLsizei * length, GLint * params)} */
    public static void glGetProgramResourceiv(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLuint") int index, @NativeType("GLenum const *") int[] props, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetProgramResourceiv;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(length, 1);
        }
        callPPPV(program, programInterface, index, props.length, props, params.length, length, params, __functionAddress);
    }

}
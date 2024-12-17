/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

public class GL43 extends GL42 {

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
        GL_SAMPLER          = 0x82E6,
        GL_DISPLAY_LIST     = 0x82E7;

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

    protected GL43() {
        throw new UnsupportedOperationException();
    }

    // --- [ glClearBufferData ] ---

    /** {@code void glClearBufferData(GLenum target, GLenum internalformat, GLenum format, GLenum type, void const * data)} */
    public static void nglClearBufferData(int target, int internalformat, int format, int type, long data) {
        GL43C.nglClearBufferData(target, internalformat, format, type, data);
    }

    /** {@code void glClearBufferData(GLenum target, GLenum internalformat, GLenum format, GLenum type, void const * data)} */
    public static void glClearBufferData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable ByteBuffer data) {
        GL43C.glClearBufferData(target, internalformat, format, type, data);
    }

    /** {@code void glClearBufferData(GLenum target, GLenum internalformat, GLenum format, GLenum type, void const * data)} */
    public static void glClearBufferData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable ShortBuffer data) {
        GL43C.glClearBufferData(target, internalformat, format, type, data);
    }

    /** {@code void glClearBufferData(GLenum target, GLenum internalformat, GLenum format, GLenum type, void const * data)} */
    public static void glClearBufferData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable IntBuffer data) {
        GL43C.glClearBufferData(target, internalformat, format, type, data);
    }

    /** {@code void glClearBufferData(GLenum target, GLenum internalformat, GLenum format, GLenum type, void const * data)} */
    public static void glClearBufferData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable FloatBuffer data) {
        GL43C.glClearBufferData(target, internalformat, format, type, data);
    }

    // --- [ glClearBufferSubData ] ---

    /** {@code void glClearBufferSubData(GLenum target, GLenum internalformat, GLintptr offset, GLsizeiptr size, GLenum format, GLenum type, void const * data)} */
    public static void nglClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, long data) {
        GL43C.nglClearBufferSubData(target, internalformat, offset, size, format, type, data);
    }

    /** {@code void glClearBufferSubData(GLenum target, GLenum internalformat, GLintptr offset, GLsizeiptr size, GLenum format, GLenum type, void const * data)} */
    public static void glClearBufferSubData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable ByteBuffer data) {
        GL43C.glClearBufferSubData(target, internalformat, offset, size, format, type, data);
    }

    /** {@code void glClearBufferSubData(GLenum target, GLenum internalformat, GLintptr offset, GLsizeiptr size, GLenum format, GLenum type, void const * data)} */
    public static void glClearBufferSubData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable ShortBuffer data) {
        GL43C.glClearBufferSubData(target, internalformat, offset, size, format, type, data);
    }

    /** {@code void glClearBufferSubData(GLenum target, GLenum internalformat, GLintptr offset, GLsizeiptr size, GLenum format, GLenum type, void const * data)} */
    public static void glClearBufferSubData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable IntBuffer data) {
        GL43C.glClearBufferSubData(target, internalformat, offset, size, format, type, data);
    }

    /** {@code void glClearBufferSubData(GLenum target, GLenum internalformat, GLintptr offset, GLsizeiptr size, GLenum format, GLenum type, void const * data)} */
    public static void glClearBufferSubData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable FloatBuffer data) {
        GL43C.glClearBufferSubData(target, internalformat, offset, size, format, type, data);
    }

    // --- [ glDispatchCompute ] ---

    /** {@code void glDispatchCompute(GLuint num_groups_x, GLuint num_groups_y, GLuint num_groups_z)} */
    public static void glDispatchCompute(@NativeType("GLuint") int num_groups_x, @NativeType("GLuint") int num_groups_y, @NativeType("GLuint") int num_groups_z) {
        GL43C.glDispatchCompute(num_groups_x, num_groups_y, num_groups_z);
    }

    // --- [ glDispatchComputeIndirect ] ---

    /** {@code void glDispatchComputeIndirect(GLintptr indirect)} */
    public static void glDispatchComputeIndirect(@NativeType("GLintptr") long indirect) {
        GL43C.glDispatchComputeIndirect(indirect);
    }

    // --- [ glCopyImageSubData ] ---

    /** {@code void glCopyImageSubData(GLuint srcName, GLenum srcTarget, GLint srcLevel, GLint srcX, GLint srcY, GLint srcZ, GLuint dstName, GLenum dstTarget, GLint dstLevel, GLint dstX, GLint dstY, GLint dstZ, GLsizei srcWidth, GLsizei srcHeight, GLsizei srcDepth)} */
    public static void glCopyImageSubData(@NativeType("GLuint") int srcName, @NativeType("GLenum") int srcTarget, @NativeType("GLint") int srcLevel, @NativeType("GLint") int srcX, @NativeType("GLint") int srcY, @NativeType("GLint") int srcZ, @NativeType("GLuint") int dstName, @NativeType("GLenum") int dstTarget, @NativeType("GLint") int dstLevel, @NativeType("GLint") int dstX, @NativeType("GLint") int dstY, @NativeType("GLint") int dstZ, @NativeType("GLsizei") int srcWidth, @NativeType("GLsizei") int srcHeight, @NativeType("GLsizei") int srcDepth) {
        GL43C.glCopyImageSubData(srcName, srcTarget, srcLevel, srcX, srcY, srcZ, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, srcWidth, srcHeight, srcDepth);
    }

    // --- [ glDebugMessageControl ] ---

    /** {@code void glDebugMessageControl(GLenum source, GLenum type, GLenum severity, GLsizei count, GLuint const * ids, GLboolean enabled)} */
    public static void nglDebugMessageControl(int source, int type, int severity, int count, long ids, boolean enabled) {
        GL43C.nglDebugMessageControl(source, type, severity, count, ids, enabled);
    }

    /** {@code void glDebugMessageControl(GLenum source, GLenum type, GLenum severity, GLsizei count, GLuint const * ids, GLboolean enabled)} */
    public static void glDebugMessageControl(@NativeType("GLenum") int source, @NativeType("GLenum") int type, @NativeType("GLenum") int severity, @NativeType("GLuint const *") @Nullable IntBuffer ids, @NativeType("GLboolean") boolean enabled) {
        GL43C.glDebugMessageControl(source, type, severity, ids, enabled);
    }

    /** {@code void glDebugMessageControl(GLenum source, GLenum type, GLenum severity, GLsizei count, GLuint const * ids, GLboolean enabled)} */
    public static void glDebugMessageControl(@NativeType("GLenum") int source, @NativeType("GLenum") int type, @NativeType("GLenum") int severity, @NativeType("GLuint const *") int id, @NativeType("GLboolean") boolean enabled) {
        GL43C.glDebugMessageControl(source, type, severity, id, enabled);
    }

    // --- [ glDebugMessageInsert ] ---

    /** {@code void glDebugMessageInsert(GLenum source, GLenum type, GLuint id, GLenum severity, GLsizei length, GLchar const * message)} */
    public static void nglDebugMessageInsert(int source, int type, int id, int severity, int length, long message) {
        GL43C.nglDebugMessageInsert(source, type, id, severity, length, message);
    }

    /** {@code void glDebugMessageInsert(GLenum source, GLenum type, GLuint id, GLenum severity, GLsizei length, GLchar const * message)} */
    public static void glDebugMessageInsert(@NativeType("GLenum") int source, @NativeType("GLenum") int type, @NativeType("GLuint") int id, @NativeType("GLenum") int severity, @NativeType("GLchar const *") ByteBuffer message) {
        GL43C.glDebugMessageInsert(source, type, id, severity, message);
    }

    /** {@code void glDebugMessageInsert(GLenum source, GLenum type, GLuint id, GLenum severity, GLsizei length, GLchar const * message)} */
    public static void glDebugMessageInsert(@NativeType("GLenum") int source, @NativeType("GLenum") int type, @NativeType("GLuint") int id, @NativeType("GLenum") int severity, @NativeType("GLchar const *") CharSequence message) {
        GL43C.glDebugMessageInsert(source, type, id, severity, message);
    }

    // --- [ glDebugMessageCallback ] ---

    /** {@code void glDebugMessageCallback(GLDEBUGPROC callback, void const * userParam)} */
    public static void nglDebugMessageCallback(long callback, long userParam) {
        GL43C.nglDebugMessageCallback(callback, userParam);
    }

    /** {@code void glDebugMessageCallback(GLDEBUGPROC callback, void const * userParam)} */
    public static void glDebugMessageCallback(@NativeType("GLDEBUGPROC") @Nullable GLDebugMessageCallbackI callback, @NativeType("void const *") long userParam) {
        GL43C.glDebugMessageCallback(callback, userParam);
    }

    // --- [ glGetDebugMessageLog ] ---

    /** {@code GLuint glGetDebugMessageLog(GLuint count, GLsizei bufsize, GLenum * sources, GLenum * types, GLuint * ids, GLenum * severities, GLsizei * lengths, GLchar * messageLog)} */
    public static int nglGetDebugMessageLog(int count, int bufsize, long sources, long types, long ids, long severities, long lengths, long messageLog) {
        return GL43C.nglGetDebugMessageLog(count, bufsize, sources, types, ids, severities, lengths, messageLog);
    }

    /** {@code GLuint glGetDebugMessageLog(GLuint count, GLsizei bufsize, GLenum * sources, GLenum * types, GLuint * ids, GLenum * severities, GLsizei * lengths, GLchar * messageLog)} */
    @NativeType("GLuint")
    public static int glGetDebugMessageLog(@NativeType("GLuint") int count, @NativeType("GLenum *") @Nullable IntBuffer sources, @NativeType("GLenum *") @Nullable IntBuffer types, @NativeType("GLuint *") @Nullable IntBuffer ids, @NativeType("GLenum *") @Nullable IntBuffer severities, @NativeType("GLsizei *") @Nullable IntBuffer lengths, @NativeType("GLchar *") @Nullable ByteBuffer messageLog) {
        return GL43C.glGetDebugMessageLog(count, sources, types, ids, severities, lengths, messageLog);
    }

    // --- [ glPushDebugGroup ] ---

    /** {@code void glPushDebugGroup(GLenum source, GLuint id, GLsizei length, GLchar const * message)} */
    public static void nglPushDebugGroup(int source, int id, int length, long message) {
        GL43C.nglPushDebugGroup(source, id, length, message);
    }

    /** {@code void glPushDebugGroup(GLenum source, GLuint id, GLsizei length, GLchar const * message)} */
    public static void glPushDebugGroup(@NativeType("GLenum") int source, @NativeType("GLuint") int id, @NativeType("GLchar const *") ByteBuffer message) {
        GL43C.glPushDebugGroup(source, id, message);
    }

    /** {@code void glPushDebugGroup(GLenum source, GLuint id, GLsizei length, GLchar const * message)} */
    public static void glPushDebugGroup(@NativeType("GLenum") int source, @NativeType("GLuint") int id, @NativeType("GLchar const *") CharSequence message) {
        GL43C.glPushDebugGroup(source, id, message);
    }

    // --- [ glPopDebugGroup ] ---

    /** {@code void glPopDebugGroup(void)} */
    public static void glPopDebugGroup() {
        GL43C.glPopDebugGroup();
    }

    // --- [ glObjectLabel ] ---

    /** {@code void glObjectLabel(GLenum identifier, GLuint name, GLsizei length, GLchar const * label)} */
    public static void nglObjectLabel(int identifier, int name, int length, long label) {
        GL43C.nglObjectLabel(identifier, name, length, label);
    }

    /** {@code void glObjectLabel(GLenum identifier, GLuint name, GLsizei length, GLchar const * label)} */
    public static void glObjectLabel(@NativeType("GLenum") int identifier, @NativeType("GLuint") int name, @NativeType("GLchar const *") ByteBuffer label) {
        GL43C.glObjectLabel(identifier, name, label);
    }

    /** {@code void glObjectLabel(GLenum identifier, GLuint name, GLsizei length, GLchar const * label)} */
    public static void glObjectLabel(@NativeType("GLenum") int identifier, @NativeType("GLuint") int name, @NativeType("GLchar const *") CharSequence label) {
        GL43C.glObjectLabel(identifier, name, label);
    }

    // --- [ glGetObjectLabel ] ---

    /** {@code void glGetObjectLabel(GLenum identifier, GLuint name, GLsizei bufSize, GLsizei * length, GLchar * label)} */
    public static void nglGetObjectLabel(int identifier, int name, int bufSize, long length, long label) {
        GL43C.nglGetObjectLabel(identifier, name, bufSize, length, label);
    }

    /** {@code void glGetObjectLabel(GLenum identifier, GLuint name, GLsizei bufSize, GLsizei * length, GLchar * label)} */
    public static void glGetObjectLabel(@NativeType("GLenum") int identifier, @NativeType("GLuint") int name, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLchar *") ByteBuffer label) {
        GL43C.glGetObjectLabel(identifier, name, length, label);
    }

    /** {@code void glGetObjectLabel(GLenum identifier, GLuint name, GLsizei bufSize, GLsizei * length, GLchar * label)} */
    @NativeType("void")
    public static String glGetObjectLabel(@NativeType("GLenum") int identifier, @NativeType("GLuint") int name, @NativeType("GLsizei") int bufSize) {
        return GL43C.glGetObjectLabel(identifier, name, bufSize);
    }

    /** {@code void glGetObjectLabel(GLenum identifier, GLuint name, GLsizei bufSize, GLsizei * length, GLchar * label)} */
    @NativeType("void")
    public static String glGetObjectLabel(@NativeType("GLenum") int identifier, @NativeType("GLuint") int name) {
        return glGetObjectLabel(identifier, name, GL11.glGetInteger(GL_MAX_LABEL_LENGTH));
    }

    // --- [ glObjectPtrLabel ] ---

    /** {@code void glObjectPtrLabel(void * ptr, GLsizei length, GLchar const * label)} */
    public static void nglObjectPtrLabel(long ptr, int length, long label) {
        GL43C.nglObjectPtrLabel(ptr, length, label);
    }

    /** {@code void glObjectPtrLabel(void * ptr, GLsizei length, GLchar const * label)} */
    public static void glObjectPtrLabel(@NativeType("void *") long ptr, @NativeType("GLchar const *") ByteBuffer label) {
        GL43C.glObjectPtrLabel(ptr, label);
    }

    /** {@code void glObjectPtrLabel(void * ptr, GLsizei length, GLchar const * label)} */
    public static void glObjectPtrLabel(@NativeType("void *") long ptr, @NativeType("GLchar const *") CharSequence label) {
        GL43C.glObjectPtrLabel(ptr, label);
    }

    // --- [ glGetObjectPtrLabel ] ---

    /** {@code void glGetObjectPtrLabel(void * ptr, GLsizei bufSize, GLsizei * length, GLchar * label)} */
    public static void nglGetObjectPtrLabel(long ptr, int bufSize, long length, long label) {
        GL43C.nglGetObjectPtrLabel(ptr, bufSize, length, label);
    }

    /** {@code void glGetObjectPtrLabel(void * ptr, GLsizei bufSize, GLsizei * length, GLchar * label)} */
    public static void glGetObjectPtrLabel(@NativeType("void *") long ptr, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLchar *") ByteBuffer label) {
        GL43C.glGetObjectPtrLabel(ptr, length, label);
    }

    /** {@code void glGetObjectPtrLabel(void * ptr, GLsizei bufSize, GLsizei * length, GLchar * label)} */
    @NativeType("void")
    public static String glGetObjectPtrLabel(@NativeType("void *") long ptr, @NativeType("GLsizei") int bufSize) {
        return GL43C.glGetObjectPtrLabel(ptr, bufSize);
    }

    /** {@code void glGetObjectPtrLabel(void * ptr, GLsizei bufSize, GLsizei * length, GLchar * label)} */
    @NativeType("void")
    public static String glGetObjectPtrLabel(@NativeType("void *") long ptr) {
        return glGetObjectPtrLabel(ptr, GL11.glGetInteger(GL_MAX_LABEL_LENGTH));
    }

    // --- [ glFramebufferParameteri ] ---

    /** {@code void glFramebufferParameteri(GLenum target, GLenum pname, GLint param)} */
    public static void glFramebufferParameteri(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint") int param) {
        GL43C.glFramebufferParameteri(target, pname, param);
    }

    // --- [ glGetFramebufferParameteriv ] ---

    /** {@code void glGetFramebufferParameteriv(GLenum target, GLenum pname, GLint * params)} */
    public static void nglGetFramebufferParameteriv(int target, int pname, long params) {
        GL43C.nglGetFramebufferParameteriv(target, pname, params);
    }

    /** {@code void glGetFramebufferParameteriv(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetFramebufferParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        GL43C.glGetFramebufferParameteriv(target, pname, params);
    }

    /** {@code void glGetFramebufferParameteriv(GLenum target, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetFramebufferParameteri(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        return GL43C.glGetFramebufferParameteri(target, pname);
    }

    // --- [ glGetInternalformati64v ] ---

    /** {@code void glGetInternalformati64v(GLenum target, GLenum internalformat, GLenum pname, GLsizei bufSize, GLint64 * params)} */
    public static void nglGetInternalformati64v(int target, int internalformat, int pname, int bufSize, long params) {
        GL43C.nglGetInternalformati64v(target, internalformat, pname, bufSize, params);
    }

    /** {@code void glGetInternalformati64v(GLenum target, GLenum internalformat, GLenum pname, GLsizei bufSize, GLint64 * params)} */
    public static void glGetInternalformati64v(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int pname, @NativeType("GLint64 *") LongBuffer params) {
        GL43C.glGetInternalformati64v(target, internalformat, pname, params);
    }

    /** {@code void glGetInternalformati64v(GLenum target, GLenum internalformat, GLenum pname, GLsizei bufSize, GLint64 * params)} */
    @NativeType("void")
    public static long glGetInternalformati64(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int pname) {
        return GL43C.glGetInternalformati64(target, internalformat, pname);
    }

    // --- [ glInvalidateTexSubImage ] ---

    /** {@code void glInvalidateTexSubImage(GLuint texture, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth)} */
    public static void glInvalidateTexSubImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth) {
        GL43C.glInvalidateTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth);
    }

    // --- [ glInvalidateTexImage ] ---

    /** {@code void glInvalidateTexImage(GLuint texture, GLint level)} */
    public static void glInvalidateTexImage(@NativeType("GLuint") int texture, @NativeType("GLint") int level) {
        GL43C.glInvalidateTexImage(texture, level);
    }

    // --- [ glInvalidateBufferSubData ] ---

    /** {@code void glInvalidateBufferSubData(GLuint buffer, GLintptr offset, GLsizeiptr length)} */
    public static void glInvalidateBufferSubData(@NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long length) {
        GL43C.glInvalidateBufferSubData(buffer, offset, length);
    }

    // --- [ glInvalidateBufferData ] ---

    /** {@code void glInvalidateBufferData(GLuint buffer)} */
    public static void glInvalidateBufferData(@NativeType("GLuint") int buffer) {
        GL43C.glInvalidateBufferData(buffer);
    }

    // --- [ glInvalidateFramebuffer ] ---

    /** {@code void glInvalidateFramebuffer(GLenum target, GLsizei numAttachments, GLenum const * attachments)} */
    public static void nglInvalidateFramebuffer(int target, int numAttachments, long attachments) {
        GL43C.nglInvalidateFramebuffer(target, numAttachments, attachments);
    }

    /** {@code void glInvalidateFramebuffer(GLenum target, GLsizei numAttachments, GLenum const * attachments)} */
    public static void glInvalidateFramebuffer(@NativeType("GLenum") int target, @NativeType("GLenum const *") IntBuffer attachments) {
        GL43C.glInvalidateFramebuffer(target, attachments);
    }

    /** {@code void glInvalidateFramebuffer(GLenum target, GLsizei numAttachments, GLenum const * attachments)} */
    public static void glInvalidateFramebuffer(@NativeType("GLenum") int target, @NativeType("GLenum const *") int attachment) {
        GL43C.glInvalidateFramebuffer(target, attachment);
    }

    // --- [ glInvalidateSubFramebuffer ] ---

    /** {@code void glInvalidateSubFramebuffer(GLenum target, GLsizei numAttachments, GLenum const * attachments, GLint x, GLint y, GLsizei width, GLsizei height)} */
    public static void nglInvalidateSubFramebuffer(int target, int numAttachments, long attachments, int x, int y, int width, int height) {
        GL43C.nglInvalidateSubFramebuffer(target, numAttachments, attachments, x, y, width, height);
    }

    /** {@code void glInvalidateSubFramebuffer(GLenum target, GLsizei numAttachments, GLenum const * attachments, GLint x, GLint y, GLsizei width, GLsizei height)} */
    public static void glInvalidateSubFramebuffer(@NativeType("GLenum") int target, @NativeType("GLenum const *") IntBuffer attachments, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        GL43C.glInvalidateSubFramebuffer(target, attachments, x, y, width, height);
    }

    /** {@code void glInvalidateSubFramebuffer(GLenum target, GLsizei numAttachments, GLenum const * attachments, GLint x, GLint y, GLsizei width, GLsizei height)} */
    public static void glInvalidateSubFramebuffer(@NativeType("GLenum") int target, @NativeType("GLenum const *") int attachment, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        GL43C.glInvalidateSubFramebuffer(target, attachment, x, y, width, height);
    }

    // --- [ glMultiDrawArraysIndirect ] ---

    /** {@code void glMultiDrawArraysIndirect(GLenum mode, void const * indirect, GLsizei drawcount, GLsizei stride)} */
    public static void nglMultiDrawArraysIndirect(int mode, long indirect, int drawcount, int stride) {
        GL43C.nglMultiDrawArraysIndirect(mode, indirect, drawcount, stride);
    }

    /** {@code void glMultiDrawArraysIndirect(GLenum mode, void const * indirect, GLsizei drawcount, GLsizei stride)} */
    public static void glMultiDrawArraysIndirect(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indirect, @NativeType("GLsizei") int drawcount, @NativeType("GLsizei") int stride) {
        GL43C.glMultiDrawArraysIndirect(mode, indirect, drawcount, stride);
    }

    /** {@code void glMultiDrawArraysIndirect(GLenum mode, void const * indirect, GLsizei drawcount, GLsizei stride)} */
    public static void glMultiDrawArraysIndirect(@NativeType("GLenum") int mode, @NativeType("void const *") long indirect, @NativeType("GLsizei") int drawcount, @NativeType("GLsizei") int stride) {
        GL43C.glMultiDrawArraysIndirect(mode, indirect, drawcount, stride);
    }

    /** {@code void glMultiDrawArraysIndirect(GLenum mode, void const * indirect, GLsizei drawcount, GLsizei stride)} */
    public static void glMultiDrawArraysIndirect(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indirect, @NativeType("GLsizei") int drawcount, @NativeType("GLsizei") int stride) {
        GL43C.glMultiDrawArraysIndirect(mode, indirect, drawcount, stride);
    }

    // --- [ glMultiDrawElementsIndirect ] ---

    /** {@code void glMultiDrawElementsIndirect(GLenum mode, GLenum type, void const * indirect, GLsizei drawcount, GLsizei stride)} */
    public static void nglMultiDrawElementsIndirect(int mode, int type, long indirect, int drawcount, int stride) {
        GL43C.nglMultiDrawElementsIndirect(mode, type, indirect, drawcount, stride);
    }

    /** {@code void glMultiDrawElementsIndirect(GLenum mode, GLenum type, void const * indirect, GLsizei drawcount, GLsizei stride)} */
    public static void glMultiDrawElementsIndirect(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indirect, @NativeType("GLsizei") int drawcount, @NativeType("GLsizei") int stride) {
        GL43C.glMultiDrawElementsIndirect(mode, type, indirect, drawcount, stride);
    }

    /** {@code void glMultiDrawElementsIndirect(GLenum mode, GLenum type, void const * indirect, GLsizei drawcount, GLsizei stride)} */
    public static void glMultiDrawElementsIndirect(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") long indirect, @NativeType("GLsizei") int drawcount, @NativeType("GLsizei") int stride) {
        GL43C.glMultiDrawElementsIndirect(mode, type, indirect, drawcount, stride);
    }

    /** {@code void glMultiDrawElementsIndirect(GLenum mode, GLenum type, void const * indirect, GLsizei drawcount, GLsizei stride)} */
    public static void glMultiDrawElementsIndirect(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer indirect, @NativeType("GLsizei") int drawcount, @NativeType("GLsizei") int stride) {
        GL43C.glMultiDrawElementsIndirect(mode, type, indirect, drawcount, stride);
    }

    // --- [ glGetProgramInterfaceiv ] ---

    /** {@code void glGetProgramInterfaceiv(GLuint program, GLenum programInterface, GLenum pname, GLint * params)} */
    public static void nglGetProgramInterfaceiv(int program, int programInterface, int pname, long params) {
        GL43C.nglGetProgramInterfaceiv(program, programInterface, pname, params);
    }

    /** {@code void glGetProgramInterfaceiv(GLuint program, GLenum programInterface, GLenum pname, GLint * params)} */
    public static void glGetProgramInterfaceiv(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        GL43C.glGetProgramInterfaceiv(program, programInterface, pname, params);
    }

    /** {@code void glGetProgramInterfaceiv(GLuint program, GLenum programInterface, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetProgramInterfacei(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLenum") int pname) {
        return GL43C.glGetProgramInterfacei(program, programInterface, pname);
    }

    // --- [ glGetProgramResourceIndex ] ---

    /** {@code GLuint glGetProgramResourceIndex(GLuint program, GLenum programInterface, GLchar const * name)} */
    public static int nglGetProgramResourceIndex(int program, int programInterface, long name) {
        return GL43C.nglGetProgramResourceIndex(program, programInterface, name);
    }

    /** {@code GLuint glGetProgramResourceIndex(GLuint program, GLenum programInterface, GLchar const * name)} */
    @NativeType("GLuint")
    public static int glGetProgramResourceIndex(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLchar const *") ByteBuffer name) {
        return GL43C.glGetProgramResourceIndex(program, programInterface, name);
    }

    /** {@code GLuint glGetProgramResourceIndex(GLuint program, GLenum programInterface, GLchar const * name)} */
    @NativeType("GLuint")
    public static int glGetProgramResourceIndex(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLchar const *") CharSequence name) {
        return GL43C.glGetProgramResourceIndex(program, programInterface, name);
    }

    // --- [ glGetProgramResourceName ] ---

    /** {@code void glGetProgramResourceName(GLuint program, GLenum programInterface, GLuint index, GLsizei bufSize, GLsizei * length, GLchar * name)} */
    public static void nglGetProgramResourceName(int program, int programInterface, int index, int bufSize, long length, long name) {
        GL43C.nglGetProgramResourceName(program, programInterface, index, bufSize, length, name);
    }

    /** {@code void glGetProgramResourceName(GLuint program, GLenum programInterface, GLuint index, GLsizei bufSize, GLsizei * length, GLchar * name)} */
    public static void glGetProgramResourceName(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLuint") int index, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLchar *") ByteBuffer name) {
        GL43C.glGetProgramResourceName(program, programInterface, index, length, name);
    }

    /** {@code void glGetProgramResourceName(GLuint program, GLenum programInterface, GLuint index, GLsizei bufSize, GLsizei * length, GLchar * name)} */
    @NativeType("void")
    public static String glGetProgramResourceName(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLuint") int index, @NativeType("GLsizei") int bufSize) {
        return GL43C.glGetProgramResourceName(program, programInterface, index, bufSize);
    }

    /** {@code void glGetProgramResourceName(GLuint program, GLenum programInterface, GLuint index, GLsizei bufSize, GLsizei * length, GLchar * name)} */
    @NativeType("void")
    public static String glGetProgramResourceName(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLuint") int index) {
        return glGetProgramResourceName(program, programInterface, index, glGetProgramInterfacei(program, programInterface, GL_MAX_NAME_LENGTH));
    }

    // --- [ glGetProgramResourceiv ] ---

    /** {@code void glGetProgramResourceiv(GLuint program, GLenum programInterface, GLuint index, GLsizei propCount, GLenum const * props, GLsizei bufSize, GLsizei * length, GLint * params)} */
    public static void nglGetProgramResourceiv(int program, int programInterface, int index, int propCount, long props, int bufSize, long length, long params) {
        GL43C.nglGetProgramResourceiv(program, programInterface, index, propCount, props, bufSize, length, params);
    }

    /** {@code void glGetProgramResourceiv(GLuint program, GLenum programInterface, GLuint index, GLsizei propCount, GLenum const * props, GLsizei bufSize, GLsizei * length, GLint * params)} */
    public static void glGetProgramResourceiv(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLuint") int index, @NativeType("GLenum const *") IntBuffer props, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLint *") IntBuffer params) {
        GL43C.glGetProgramResourceiv(program, programInterface, index, props, length, params);
    }

    // --- [ glGetProgramResourceLocation ] ---

    /** {@code GLint glGetProgramResourceLocation(GLuint program, GLenum programInterface, GLchar const * name)} */
    public static int nglGetProgramResourceLocation(int program, int programInterface, long name) {
        return GL43C.nglGetProgramResourceLocation(program, programInterface, name);
    }

    /** {@code GLint glGetProgramResourceLocation(GLuint program, GLenum programInterface, GLchar const * name)} */
    @NativeType("GLint")
    public static int glGetProgramResourceLocation(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLchar const *") ByteBuffer name) {
        return GL43C.glGetProgramResourceLocation(program, programInterface, name);
    }

    /** {@code GLint glGetProgramResourceLocation(GLuint program, GLenum programInterface, GLchar const * name)} */
    @NativeType("GLint")
    public static int glGetProgramResourceLocation(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLchar const *") CharSequence name) {
        return GL43C.glGetProgramResourceLocation(program, programInterface, name);
    }

    // --- [ glGetProgramResourceLocationIndex ] ---

    /** {@code GLint glGetProgramResourceLocationIndex(GLuint program, GLenum programInterface, GLchar const * name)} */
    public static int nglGetProgramResourceLocationIndex(int program, int programInterface, long name) {
        return GL43C.nglGetProgramResourceLocationIndex(program, programInterface, name);
    }

    /** {@code GLint glGetProgramResourceLocationIndex(GLuint program, GLenum programInterface, GLchar const * name)} */
    @NativeType("GLint")
    public static int glGetProgramResourceLocationIndex(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLchar const *") ByteBuffer name) {
        return GL43C.glGetProgramResourceLocationIndex(program, programInterface, name);
    }

    /** {@code GLint glGetProgramResourceLocationIndex(GLuint program, GLenum programInterface, GLchar const * name)} */
    @NativeType("GLint")
    public static int glGetProgramResourceLocationIndex(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLchar const *") CharSequence name) {
        return GL43C.glGetProgramResourceLocationIndex(program, programInterface, name);
    }

    // --- [ glShaderStorageBlockBinding ] ---

    /** {@code void glShaderStorageBlockBinding(GLuint program, GLuint storageBlockIndex, GLuint storageBlockBinding)} */
    public static void glShaderStorageBlockBinding(@NativeType("GLuint") int program, @NativeType("GLuint") int storageBlockIndex, @NativeType("GLuint") int storageBlockBinding) {
        GL43C.glShaderStorageBlockBinding(program, storageBlockIndex, storageBlockBinding);
    }

    // --- [ glTexBufferRange ] ---

    /** {@code void glTexBufferRange(GLenum target, GLenum internalformat, GLuint buffer, GLintptr offset, GLsizeiptr size)} */
    public static void glTexBufferRange(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size) {
        GL43C.glTexBufferRange(target, internalformat, buffer, offset, size);
    }

    // --- [ glTexStorage2DMultisample ] ---

    /** {@code void glTexStorage2DMultisample(GLenum target, GLsizei samples, GLenum internalformat, GLsizei width, GLsizei height, GLboolean fixedsamplelocations)} */
    public static void glTexStorage2DMultisample(@NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLboolean") boolean fixedsamplelocations) {
        GL43C.glTexStorage2DMultisample(target, samples, internalformat, width, height, fixedsamplelocations);
    }

    // --- [ glTexStorage3DMultisample ] ---

    /** {@code void glTexStorage3DMultisample(GLenum target, GLsizei samples, GLenum internalformat, GLsizei width, GLsizei height, GLsizei depth, GLboolean fixedsamplelocations)} */
    public static void glTexStorage3DMultisample(@NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLboolean") boolean fixedsamplelocations) {
        GL43C.glTexStorage3DMultisample(target, samples, internalformat, width, height, depth, fixedsamplelocations);
    }

    // --- [ glTextureView ] ---

    /** {@code void glTextureView(GLuint texture, GLenum target, GLuint origtexture, GLenum internalformat, GLuint minlevel, GLuint numlevels, GLuint minlayer, GLuint numlayers)} */
    public static void glTextureView(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLuint") int origtexture, @NativeType("GLenum") int internalformat, @NativeType("GLuint") int minlevel, @NativeType("GLuint") int numlevels, @NativeType("GLuint") int minlayer, @NativeType("GLuint") int numlayers) {
        GL43C.glTextureView(texture, target, origtexture, internalformat, minlevel, numlevels, minlayer, numlayers);
    }

    // --- [ glBindVertexBuffer ] ---

    /** {@code void glBindVertexBuffer(GLuint bindingindex, GLuint buffer, GLintptr offset, GLsizei stride)} */
    public static void glBindVertexBuffer(@NativeType("GLuint") int bindingindex, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizei") int stride) {
        GL43C.glBindVertexBuffer(bindingindex, buffer, offset, stride);
    }

    // --- [ glVertexAttribFormat ] ---

    /** {@code void glVertexAttribFormat(GLuint attribindex, GLint size, GLenum type, GLboolean normalized, GLuint relativeoffset)} */
    public static void glVertexAttribFormat(@NativeType("GLuint") int attribindex, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint") int relativeoffset) {
        GL43C.glVertexAttribFormat(attribindex, size, type, normalized, relativeoffset);
    }

    // --- [ glVertexAttribIFormat ] ---

    /** {@code void glVertexAttribIFormat(GLuint attribindex, GLint size, GLenum type, GLuint relativeoffset)} */
    public static void glVertexAttribIFormat(@NativeType("GLuint") int attribindex, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLuint") int relativeoffset) {
        GL43C.glVertexAttribIFormat(attribindex, size, type, relativeoffset);
    }

    // --- [ glVertexAttribLFormat ] ---

    /** {@code void glVertexAttribLFormat(GLuint attribindex, GLint size, GLenum type, GLuint relativeoffset)} */
    public static void glVertexAttribLFormat(@NativeType("GLuint") int attribindex, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLuint") int relativeoffset) {
        GL43C.glVertexAttribLFormat(attribindex, size, type, relativeoffset);
    }

    // --- [ glVertexAttribBinding ] ---

    /** {@code void glVertexAttribBinding(GLuint attribindex, GLuint bindingindex)} */
    public static void glVertexAttribBinding(@NativeType("GLuint") int attribindex, @NativeType("GLuint") int bindingindex) {
        GL43C.glVertexAttribBinding(attribindex, bindingindex);
    }

    // --- [ glVertexBindingDivisor ] ---

    /** {@code void glVertexBindingDivisor(GLuint bindingindex, GLuint divisor)} */
    public static void glVertexBindingDivisor(@NativeType("GLuint") int bindingindex, @NativeType("GLuint") int divisor) {
        GL43C.glVertexBindingDivisor(bindingindex, divisor);
    }

    /** {@code void glClearBufferData(GLenum target, GLenum internalformat, GLenum format, GLenum type, void const * data)} */
    public static void glClearBufferData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short @Nullable [] data) {
        GL43C.glClearBufferData(target, internalformat, format, type, data);
    }

    /** {@code void glClearBufferData(GLenum target, GLenum internalformat, GLenum format, GLenum type, void const * data)} */
    public static void glClearBufferData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int @Nullable [] data) {
        GL43C.glClearBufferData(target, internalformat, format, type, data);
    }

    /** {@code void glClearBufferData(GLenum target, GLenum internalformat, GLenum format, GLenum type, void const * data)} */
    public static void glClearBufferData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float @Nullable [] data) {
        GL43C.glClearBufferData(target, internalformat, format, type, data);
    }

    /** {@code void glClearBufferSubData(GLenum target, GLenum internalformat, GLintptr offset, GLsizeiptr size, GLenum format, GLenum type, void const * data)} */
    public static void glClearBufferSubData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short @Nullable [] data) {
        GL43C.glClearBufferSubData(target, internalformat, offset, size, format, type, data);
    }

    /** {@code void glClearBufferSubData(GLenum target, GLenum internalformat, GLintptr offset, GLsizeiptr size, GLenum format, GLenum type, void const * data)} */
    public static void glClearBufferSubData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int @Nullable [] data) {
        GL43C.glClearBufferSubData(target, internalformat, offset, size, format, type, data);
    }

    /** {@code void glClearBufferSubData(GLenum target, GLenum internalformat, GLintptr offset, GLsizeiptr size, GLenum format, GLenum type, void const * data)} */
    public static void glClearBufferSubData(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float @Nullable [] data) {
        GL43C.glClearBufferSubData(target, internalformat, offset, size, format, type, data);
    }

    /** {@code void glDebugMessageControl(GLenum source, GLenum type, GLenum severity, GLsizei count, GLuint const * ids, GLboolean enabled)} */
    public static void glDebugMessageControl(@NativeType("GLenum") int source, @NativeType("GLenum") int type, @NativeType("GLenum") int severity, @NativeType("GLuint const *") int @Nullable [] ids, @NativeType("GLboolean") boolean enabled) {
        GL43C.glDebugMessageControl(source, type, severity, ids, enabled);
    }

    /** {@code GLuint glGetDebugMessageLog(GLuint count, GLsizei bufsize, GLenum * sources, GLenum * types, GLuint * ids, GLenum * severities, GLsizei * lengths, GLchar * messageLog)} */
    @NativeType("GLuint")
    public static int glGetDebugMessageLog(@NativeType("GLuint") int count, @NativeType("GLenum *") int @Nullable [] sources, @NativeType("GLenum *") int @Nullable [] types, @NativeType("GLuint *") int @Nullable [] ids, @NativeType("GLenum *") int @Nullable [] severities, @NativeType("GLsizei *") int @Nullable [] lengths, @NativeType("GLchar *") @Nullable ByteBuffer messageLog) {
        return GL43C.glGetDebugMessageLog(count, sources, types, ids, severities, lengths, messageLog);
    }

    /** {@code void glGetObjectLabel(GLenum identifier, GLuint name, GLsizei bufSize, GLsizei * length, GLchar * label)} */
    public static void glGetObjectLabel(@NativeType("GLenum") int identifier, @NativeType("GLuint") int name, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLchar *") ByteBuffer label) {
        GL43C.glGetObjectLabel(identifier, name, length, label);
    }

    /** {@code void glGetObjectPtrLabel(void * ptr, GLsizei bufSize, GLsizei * length, GLchar * label)} */
    public static void glGetObjectPtrLabel(@NativeType("void *") long ptr, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLchar *") ByteBuffer label) {
        GL43C.glGetObjectPtrLabel(ptr, length, label);
    }

    /** {@code void glGetFramebufferParameteriv(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetFramebufferParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        GL43C.glGetFramebufferParameteriv(target, pname, params);
    }

    /** {@code void glGetInternalformati64v(GLenum target, GLenum internalformat, GLenum pname, GLsizei bufSize, GLint64 * params)} */
    public static void glGetInternalformati64v(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int pname, @NativeType("GLint64 *") long[] params) {
        GL43C.glGetInternalformati64v(target, internalformat, pname, params);
    }

    /** {@code void glInvalidateFramebuffer(GLenum target, GLsizei numAttachments, GLenum const * attachments)} */
    public static void glInvalidateFramebuffer(@NativeType("GLenum") int target, @NativeType("GLenum const *") int[] attachments) {
        GL43C.glInvalidateFramebuffer(target, attachments);
    }

    /** {@code void glInvalidateSubFramebuffer(GLenum target, GLsizei numAttachments, GLenum const * attachments, GLint x, GLint y, GLsizei width, GLsizei height)} */
    public static void glInvalidateSubFramebuffer(@NativeType("GLenum") int target, @NativeType("GLenum const *") int[] attachments, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        GL43C.glInvalidateSubFramebuffer(target, attachments, x, y, width, height);
    }

    /** {@code void glMultiDrawArraysIndirect(GLenum mode, void const * indirect, GLsizei drawcount, GLsizei stride)} */
    public static void glMultiDrawArraysIndirect(@NativeType("GLenum") int mode, @NativeType("void const *") int[] indirect, @NativeType("GLsizei") int drawcount, @NativeType("GLsizei") int stride) {
        GL43C.glMultiDrawArraysIndirect(mode, indirect, drawcount, stride);
    }

    /** {@code void glMultiDrawElementsIndirect(GLenum mode, GLenum type, void const * indirect, GLsizei drawcount, GLsizei stride)} */
    public static void glMultiDrawElementsIndirect(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") int[] indirect, @NativeType("GLsizei") int drawcount, @NativeType("GLsizei") int stride) {
        GL43C.glMultiDrawElementsIndirect(mode, type, indirect, drawcount, stride);
    }

    /** {@code void glGetProgramInterfaceiv(GLuint program, GLenum programInterface, GLenum pname, GLint * params)} */
    public static void glGetProgramInterfaceiv(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        GL43C.glGetProgramInterfaceiv(program, programInterface, pname, params);
    }

    /** {@code void glGetProgramResourceName(GLuint program, GLenum programInterface, GLuint index, GLsizei bufSize, GLsizei * length, GLchar * name)} */
    public static void glGetProgramResourceName(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLuint") int index, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLchar *") ByteBuffer name) {
        GL43C.glGetProgramResourceName(program, programInterface, index, length, name);
    }

    /** {@code void glGetProgramResourceiv(GLuint program, GLenum programInterface, GLuint index, GLsizei propCount, GLenum const * props, GLsizei bufSize, GLsizei * length, GLint * params)} */
    public static void glGetProgramResourceiv(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLuint") int index, @NativeType("GLenum const *") int[] props, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLint *") int[] params) {
        GL43C.glGetProgramResourceiv(program, programInterface, index, props, length, params);
    }

}
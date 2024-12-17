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

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class GLES30 extends GLES20 {

    static { GLES.initialize(); }

    public static final int
        GL_READ_BUFFER                                   = 0xC02,
        GL_UNPACK_ROW_LENGTH                             = 0xCF2,
        GL_UNPACK_SKIP_ROWS                              = 0xCF3,
        GL_UNPACK_SKIP_PIXELS                            = 0xCF4,
        GL_PACK_ROW_LENGTH                               = 0xD02,
        GL_PACK_SKIP_ROWS                                = 0xD03,
        GL_PACK_SKIP_PIXELS                              = 0xD04,
        GL_COLOR                                         = 0x1800,
        GL_DEPTH                                         = 0x1801,
        GL_STENCIL                                       = 0x1802,
        GL_RED                                           = 0x1903,
        GL_RGB8                                          = 0x8051,
        GL_RGBA8                                         = 0x8058,
        GL_RGB10_A2                                      = 0x8059,
        GL_TEXTURE_BINDING_3D                            = 0x806A,
        GL_UNPACK_SKIP_IMAGES                            = 0x806D,
        GL_UNPACK_IMAGE_HEIGHT                           = 0x806E,
        GL_TEXTURE_3D                                    = 0x806F,
        GL_TEXTURE_WRAP_R                                = 0x8072,
        GL_MAX_3D_TEXTURE_SIZE                           = 0x8073,
        GL_UNSIGNED_INT_2_10_10_10_REV                   = 0x8368,
        GL_MAX_ELEMENTS_VERTICES                         = 0x80E8,
        GL_MAX_ELEMENTS_INDICES                          = 0x80E9,
        GL_TEXTURE_MIN_LOD                               = 0x813A,
        GL_TEXTURE_MAX_LOD                               = 0x813B,
        GL_TEXTURE_BASE_LEVEL                            = 0x813C,
        GL_TEXTURE_MAX_LEVEL                             = 0x813D,
        GL_MIN                                           = 0x8007,
        GL_MAX                                           = 0x8008,
        GL_DEPTH_COMPONENT24                             = 0x81A6,
        GL_MAX_TEXTURE_LOD_BIAS                          = 0x84FD,
        GL_TEXTURE_COMPARE_MODE                          = 0x884C,
        GL_TEXTURE_COMPARE_FUNC                          = 0x884D,
        GL_CURRENT_QUERY                                 = 0x8865,
        GL_QUERY_RESULT                                  = 0x8866,
        GL_QUERY_RESULT_AVAILABLE                        = 0x8867,
        GL_BUFFER_MAPPED                                 = 0x88BC,
        GL_BUFFER_MAP_POINTER                            = 0x88BD,
        GL_STREAM_READ                                   = 0x88E1,
        GL_STREAM_COPY                                   = 0x88E2,
        GL_STATIC_READ                                   = 0x88E5,
        GL_STATIC_COPY                                   = 0x88E6,
        GL_DYNAMIC_READ                                  = 0x88E9,
        GL_DYNAMIC_COPY                                  = 0x88EA,
        GL_MAX_DRAW_BUFFERS                              = 0x8824,
        GL_DRAW_BUFFER0                                  = 0x8825,
        GL_DRAW_BUFFER1                                  = 0x8826,
        GL_DRAW_BUFFER2                                  = 0x8827,
        GL_DRAW_BUFFER3                                  = 0x8828,
        GL_DRAW_BUFFER4                                  = 0x8829,
        GL_DRAW_BUFFER5                                  = 0x882A,
        GL_DRAW_BUFFER6                                  = 0x882B,
        GL_DRAW_BUFFER7                                  = 0x882C,
        GL_DRAW_BUFFER8                                  = 0x882D,
        GL_DRAW_BUFFER9                                  = 0x882E,
        GL_DRAW_BUFFER10                                 = 0x882F,
        GL_DRAW_BUFFER11                                 = 0x8830,
        GL_DRAW_BUFFER12                                 = 0x8831,
        GL_DRAW_BUFFER13                                 = 0x8832,
        GL_DRAW_BUFFER14                                 = 0x8833,
        GL_DRAW_BUFFER15                                 = 0x8834,
        GL_MAX_FRAGMENT_UNIFORM_COMPONENTS               = 0x8B49,
        GL_MAX_VERTEX_UNIFORM_COMPONENTS                 = 0x8B4A,
        GL_SAMPLER_3D                                    = 0x8B5F,
        GL_SAMPLER_2D_SHADOW                             = 0x8B62,
        GL_FRAGMENT_SHADER_DERIVATIVE_HINT               = 0x8B8B,
        GL_PIXEL_PACK_BUFFER                             = 0x88EB,
        GL_PIXEL_UNPACK_BUFFER                           = 0x88EC,
        GL_PIXEL_PACK_BUFFER_BINDING                     = 0x88ED,
        GL_PIXEL_UNPACK_BUFFER_BINDING                   = 0x88EF,
        GL_FLOAT_MAT2x3                                  = 0x8B65,
        GL_FLOAT_MAT2x4                                  = 0x8B66,
        GL_FLOAT_MAT3x2                                  = 0x8B67,
        GL_FLOAT_MAT3x4                                  = 0x8B68,
        GL_FLOAT_MAT4x2                                  = 0x8B69,
        GL_FLOAT_MAT4x3                                  = 0x8B6A,
        GL_SRGB                                          = 0x8C40,
        GL_SRGB8                                         = 0x8C41,
        GL_SRGB8_ALPHA8                                  = 0x8C43,
        GL_COMPARE_REF_TO_TEXTURE                        = 0x884E,
        GL_MAJOR_VERSION                                 = 0x821B,
        GL_MINOR_VERSION                                 = 0x821C,
        GL_NUM_EXTENSIONS                                = 0x821D,
        GL_RGBA32F                                       = 0x8814,
        GL_RGB32F                                        = 0x8815,
        GL_RGBA16F                                       = 0x881A,
        GL_RGB16F                                        = 0x881B,
        GL_VERTEX_ATTRIB_ARRAY_INTEGER                   = 0x88FD,
        GL_MAX_ARRAY_TEXTURE_LAYERS                      = 0x88FF,
        GL_MIN_PROGRAM_TEXEL_OFFSET                      = 0x8904,
        GL_MAX_PROGRAM_TEXEL_OFFSET                      = 0x8905,
        GL_MAX_VARYING_COMPONENTS                        = 0x8B4B,
        GL_TEXTURE_2D_ARRAY                              = 0x8C1A,
        GL_TEXTURE_BINDING_2D_ARRAY                      = 0x8C1D,
        GL_R11F_G11F_B10F                                = 0x8C3A,
        GL_UNSIGNED_INT_10F_11F_11F_REV                  = 0x8C3B,
        GL_RGB9_E5                                       = 0x8C3D,
        GL_UNSIGNED_INT_5_9_9_9_REV                      = 0x8C3E,
        GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH         = 0x8C76,
        GL_TRANSFORM_FEEDBACK_BUFFER_MODE                = 0x8C7F,
        GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS    = 0x8C80,
        GL_TRANSFORM_FEEDBACK_VARYINGS                   = 0x8C83,
        GL_TRANSFORM_FEEDBACK_BUFFER_START               = 0x8C84,
        GL_TRANSFORM_FEEDBACK_BUFFER_SIZE                = 0x8C85,
        GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN         = 0x8C88,
        GL_RASTERIZER_DISCARD                            = 0x8C89,
        GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS = 0x8C8A,
        GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS       = 0x8C8B,
        GL_INTERLEAVED_ATTRIBS                           = 0x8C8C,
        GL_SEPARATE_ATTRIBS                              = 0x8C8D,
        GL_TRANSFORM_FEEDBACK_BUFFER                     = 0x8C8E,
        GL_TRANSFORM_FEEDBACK_BUFFER_BINDING             = 0x8C8F,
        GL_RGBA32UI                                      = 0x8D70,
        GL_RGB32UI                                       = 0x8D71,
        GL_RGBA16UI                                      = 0x8D76,
        GL_RGB16UI                                       = 0x8D77,
        GL_RGBA8UI                                       = 0x8D7C,
        GL_RGB8UI                                        = 0x8D7D,
        GL_RGBA32I                                       = 0x8D82,
        GL_RGB32I                                        = 0x8D83,
        GL_RGBA16I                                       = 0x8D88,
        GL_RGB16I                                        = 0x8D89,
        GL_RGBA8I                                        = 0x8D8E,
        GL_RGB8I                                         = 0x8D8F,
        GL_RED_INTEGER                                   = 0x8D94,
        GL_RGB_INTEGER                                   = 0x8D98,
        GL_RGBA_INTEGER                                  = 0x8D99,
        GL_SAMPLER_2D_ARRAY                              = 0x8DC1,
        GL_SAMPLER_2D_ARRAY_SHADOW                       = 0x8DC4,
        GL_SAMPLER_CUBE_SHADOW                           = 0x8DC5,
        GL_UNSIGNED_INT_VEC2                             = 0x8DC6,
        GL_UNSIGNED_INT_VEC3                             = 0x8DC7,
        GL_UNSIGNED_INT_VEC4                             = 0x8DC8,
        GL_INT_SAMPLER_2D                                = 0x8DCA,
        GL_INT_SAMPLER_3D                                = 0x8DCB,
        GL_INT_SAMPLER_CUBE                              = 0x8DCC,
        GL_INT_SAMPLER_2D_ARRAY                          = 0x8DCF,
        GL_UNSIGNED_INT_SAMPLER_2D                       = 0x8DD2,
        GL_UNSIGNED_INT_SAMPLER_3D                       = 0x8DD3,
        GL_UNSIGNED_INT_SAMPLER_CUBE                     = 0x8DD4,
        GL_UNSIGNED_INT_SAMPLER_2D_ARRAY                 = 0x8DD7,
        GL_BUFFER_ACCESS_FLAGS                           = 0x911F,
        GL_BUFFER_MAP_LENGTH                             = 0x9120,
        GL_BUFFER_MAP_OFFSET                             = 0x9121,
        GL_DEPTH_COMPONENT32F                            = 0x8CAC,
        GL_DEPTH32F_STENCIL8                             = 0x8CAD,
        GL_FLOAT_32_UNSIGNED_INT_24_8_REV                = 0x8DAD,
        GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING         = 0x8210,
        GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE         = 0x8211,
        GL_FRAMEBUFFER_ATTACHMENT_RED_SIZE               = 0x8212,
        GL_FRAMEBUFFER_ATTACHMENT_GREEN_SIZE             = 0x8213,
        GL_FRAMEBUFFER_ATTACHMENT_BLUE_SIZE              = 0x8214,
        GL_FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE             = 0x8215,
        GL_FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE             = 0x8216,
        GL_FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE           = 0x8217,
        GL_FRAMEBUFFER_DEFAULT                           = 0x8218,
        GL_FRAMEBUFFER_UNDEFINED                         = 0x8219,
        GL_DEPTH_STENCIL_ATTACHMENT                      = 0x821A,
        GL_DEPTH_STENCIL                                 = 0x84F9,
        GL_UNSIGNED_INT_24_8                             = 0x84FA,
        GL_DEPTH24_STENCIL8                              = 0x88F0,
        GL_UNSIGNED_NORMALIZED                           = 0x8C17,
        GL_DRAW_FRAMEBUFFER_BINDING                      = 0x8CA6,
        GL_READ_FRAMEBUFFER                              = 0x8CA8,
        GL_DRAW_FRAMEBUFFER                              = 0x8CA9,
        GL_READ_FRAMEBUFFER_BINDING                      = 0x8CAA,
        GL_RENDERBUFFER_SAMPLES                          = 0x8CAB,
        GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER          = 0x8CD4,
        GL_MAX_COLOR_ATTACHMENTS                         = 0x8CDF,
        GL_COLOR_ATTACHMENT1                             = 0x8CE1,
        GL_COLOR_ATTACHMENT2                             = 0x8CE2,
        GL_COLOR_ATTACHMENT3                             = 0x8CE3,
        GL_COLOR_ATTACHMENT4                             = 0x8CE4,
        GL_COLOR_ATTACHMENT5                             = 0x8CE5,
        GL_COLOR_ATTACHMENT6                             = 0x8CE6,
        GL_COLOR_ATTACHMENT7                             = 0x8CE7,
        GL_COLOR_ATTACHMENT8                             = 0x8CE8,
        GL_COLOR_ATTACHMENT9                             = 0x8CE9,
        GL_COLOR_ATTACHMENT10                            = 0x8CEA,
        GL_COLOR_ATTACHMENT11                            = 0x8CEB,
        GL_COLOR_ATTACHMENT12                            = 0x8CEC,
        GL_COLOR_ATTACHMENT13                            = 0x8CED,
        GL_COLOR_ATTACHMENT14                            = 0x8CEE,
        GL_COLOR_ATTACHMENT15                            = 0x8CEF,
        GL_COLOR_ATTACHMENT16                            = 0x8CF0,
        GL_COLOR_ATTACHMENT17                            = 0x8CF1,
        GL_COLOR_ATTACHMENT18                            = 0x8CF2,
        GL_COLOR_ATTACHMENT19                            = 0x8CF3,
        GL_COLOR_ATTACHMENT20                            = 0x8CF4,
        GL_COLOR_ATTACHMENT21                            = 0x8CF5,
        GL_COLOR_ATTACHMENT22                            = 0x8CF6,
        GL_COLOR_ATTACHMENT23                            = 0x8CF7,
        GL_COLOR_ATTACHMENT24                            = 0x8CF8,
        GL_COLOR_ATTACHMENT25                            = 0x8CF9,
        GL_COLOR_ATTACHMENT26                            = 0x8CFA,
        GL_COLOR_ATTACHMENT27                            = 0x8CFB,
        GL_COLOR_ATTACHMENT28                            = 0x8CFC,
        GL_COLOR_ATTACHMENT29                            = 0x8CFD,
        GL_COLOR_ATTACHMENT30                            = 0x8CFE,
        GL_COLOR_ATTACHMENT31                            = 0x8CFF,
        GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE            = 0x8D56,
        GL_MAX_SAMPLES                                   = 0x8D57,
        GL_HALF_FLOAT                                    = 0x140B,
        GL_MAP_READ_BIT                                  = 0x1,
        GL_MAP_WRITE_BIT                                 = 0x2,
        GL_MAP_INVALIDATE_RANGE_BIT                      = 0x4,
        GL_MAP_INVALIDATE_BUFFER_BIT                     = 0x8,
        GL_MAP_FLUSH_EXPLICIT_BIT                        = 0x10,
        GL_MAP_UNSYNCHRONIZED_BIT                        = 0x20,
        GL_RG                                            = 0x8227,
        GL_RG_INTEGER                                    = 0x8228,
        GL_R8                                            = 0x8229,
        GL_RG8                                           = 0x822B,
        GL_R16F                                          = 0x822D,
        GL_R32F                                          = 0x822E,
        GL_RG16F                                         = 0x822F,
        GL_RG32F                                         = 0x8230,
        GL_R8I                                           = 0x8231,
        GL_R8UI                                          = 0x8232,
        GL_R16I                                          = 0x8233,
        GL_R16UI                                         = 0x8234,
        GL_R32I                                          = 0x8235,
        GL_R32UI                                         = 0x8236,
        GL_RG8I                                          = 0x8237,
        GL_RG8UI                                         = 0x8238,
        GL_RG16I                                         = 0x8239,
        GL_RG16UI                                        = 0x823A,
        GL_RG32I                                         = 0x823B,
        GL_RG32UI                                        = 0x823C,
        GL_VERTEX_ARRAY_BINDING                          = 0x85B5,
        GL_R8_SNORM                                      = 0x8F94,
        GL_RG8_SNORM                                     = 0x8F95,
        GL_RGB8_SNORM                                    = 0x8F96,
        GL_RGBA8_SNORM                                   = 0x8F97,
        GL_SIGNED_NORMALIZED                             = 0x8F9C,
        GL_PRIMITIVE_RESTART_FIXED_INDEX                 = 0x8D69,
        GL_COPY_READ_BUFFER                              = 0x8F36,
        GL_COPY_WRITE_BUFFER                             = 0x8F37,
        GL_COPY_READ_BUFFER_BINDING                      = 0x8F36,
        GL_COPY_WRITE_BUFFER_BINDING                     = 0x8F37,
        GL_UNIFORM_BUFFER                                = 0x8A11,
        GL_UNIFORM_BUFFER_BINDING                        = 0x8A28,
        GL_UNIFORM_BUFFER_START                          = 0x8A29,
        GL_UNIFORM_BUFFER_SIZE                           = 0x8A2A,
        GL_MAX_VERTEX_UNIFORM_BLOCKS                     = 0x8A2B,
        GL_MAX_FRAGMENT_UNIFORM_BLOCKS                   = 0x8A2D,
        GL_MAX_COMBINED_UNIFORM_BLOCKS                   = 0x8A2E,
        GL_MAX_UNIFORM_BUFFER_BINDINGS                   = 0x8A2F,
        GL_MAX_UNIFORM_BLOCK_SIZE                        = 0x8A30,
        GL_MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS        = 0x8A31,
        GL_MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS      = 0x8A33,
        GL_UNIFORM_BUFFER_OFFSET_ALIGNMENT               = 0x8A34,
        GL_ACTIVE_UNIFORM_BLOCK_MAX_NAME_LENGTH          = 0x8A35,
        GL_ACTIVE_UNIFORM_BLOCKS                         = 0x8A36,
        GL_UNIFORM_TYPE                                  = 0x8A37,
        GL_UNIFORM_SIZE                                  = 0x8A38,
        GL_UNIFORM_NAME_LENGTH                           = 0x8A39,
        GL_UNIFORM_BLOCK_INDEX                           = 0x8A3A,
        GL_UNIFORM_OFFSET                                = 0x8A3B,
        GL_UNIFORM_ARRAY_STRIDE                          = 0x8A3C,
        GL_UNIFORM_MATRIX_STRIDE                         = 0x8A3D,
        GL_UNIFORM_IS_ROW_MAJOR                          = 0x8A3E,
        GL_UNIFORM_BLOCK_BINDING                         = 0x8A3F,
        GL_UNIFORM_BLOCK_DATA_SIZE                       = 0x8A40,
        GL_UNIFORM_BLOCK_NAME_LENGTH                     = 0x8A41,
        GL_UNIFORM_BLOCK_ACTIVE_UNIFORMS                 = 0x8A42,
        GL_UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES          = 0x8A43,
        GL_UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER     = 0x8A44,
        GL_UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER   = 0x8A46,
        GL_INVALID_INDEX                                 = 0xFFFFFFFF,
        GL_MAX_VERTEX_OUTPUT_COMPONENTS                  = 0x9122,
        GL_MAX_FRAGMENT_INPUT_COMPONENTS                 = 0x9125,
        GL_MAX_SERVER_WAIT_TIMEOUT                       = 0x9111,
        GL_OBJECT_TYPE                                   = 0x9112,
        GL_SYNC_CONDITION                                = 0x9113,
        GL_SYNC_STATUS                                   = 0x9114,
        GL_SYNC_FLAGS                                    = 0x9115,
        GL_SYNC_FENCE                                    = 0x9116,
        GL_SYNC_GPU_COMMANDS_COMPLETE                    = 0x9117,
        GL_UNSIGNALED                                    = 0x9118,
        GL_SIGNALED                                      = 0x9119,
        GL_ALREADY_SIGNALED                              = 0x911A,
        GL_TIMEOUT_EXPIRED                               = 0x911B,
        GL_CONDITION_SATISFIED                           = 0x911C,
        GL_WAIT_FAILED                                   = 0x911D,
        GL_SYNC_FLUSH_COMMANDS_BIT                       = 0x1,
        GL_VERTEX_ATTRIB_ARRAY_DIVISOR                   = 0x88FE,
        GL_ANY_SAMPLES_PASSED                            = 0x8C2F,
        GL_ANY_SAMPLES_PASSED_CONSERVATIVE               = 0x8D6A,
        GL_SAMPLER_BINDING                               = 0x8919,
        GL_RGB10_A2UI                                    = 0x906F,
        GL_TEXTURE_SWIZZLE_R                             = 0x8E42,
        GL_TEXTURE_SWIZZLE_G                             = 0x8E43,
        GL_TEXTURE_SWIZZLE_B                             = 0x8E44,
        GL_TEXTURE_SWIZZLE_A                             = 0x8E45,
        GL_GREEN                                         = 0x1904,
        GL_BLUE                                          = 0x1905,
        GL_INT_2_10_10_10_REV                            = 0x8D9F,
        GL_TRANSFORM_FEEDBACK                            = 0x8E22,
        GL_TRANSFORM_FEEDBACK_PAUSED                     = 0x8E23,
        GL_TRANSFORM_FEEDBACK_ACTIVE                     = 0x8E24,
        GL_TRANSFORM_FEEDBACK_BINDING                    = 0x8E25,
        GL_PROGRAM_BINARY_RETRIEVABLE_HINT               = 0x8257,
        GL_PROGRAM_BINARY_LENGTH                         = 0x8741,
        GL_NUM_PROGRAM_BINARY_FORMATS                    = 0x87FE,
        GL_PROGRAM_BINARY_FORMATS                        = 0x87FF,
        GL_COMPRESSED_R11_EAC                            = 0x9270,
        GL_COMPRESSED_SIGNED_R11_EAC                     = 0x9271,
        GL_COMPRESSED_RG11_EAC                           = 0x9272,
        GL_COMPRESSED_SIGNED_RG11_EAC                    = 0x9273,
        GL_COMPRESSED_RGB8_ETC2                          = 0x9274,
        GL_COMPRESSED_SRGB8_ETC2                         = 0x9275,
        GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2      = 0x9276,
        GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2     = 0x9277,
        GL_COMPRESSED_RGBA8_ETC2_EAC                     = 0x9278,
        GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC              = 0x9279,
        GL_TEXTURE_IMMUTABLE_FORMAT                      = 0x912F,
        GL_MAX_ELEMENT_INDEX                             = 0x8D6B,
        GL_NUM_SAMPLE_COUNTS                             = 0x9380,
        GL_TEXTURE_IMMUTABLE_LEVELS                      = 0x82DF;

    public static final long GL_TIMEOUT_IGNORED = 0xFFFFFFFFFFFFFFFFL;

    protected GLES30() {
        throw new UnsupportedOperationException();
    }

    // --- [ glReadBuffer ] ---

    /** {@code void glReadBuffer(GLenum src)} */
    public static native void glReadBuffer(@NativeType("GLenum") int src);

    // --- [ glDrawRangeElements ] ---

    /** {@code void glDrawRangeElements(GLenum mode, GLuint start, GLuint end, GLsizei count, GLenum type, void const * indices)} */
    public static native void nglDrawRangeElements(int mode, int start, int end, int count, int type, long indices);

    /** {@code void glDrawRangeElements(GLenum mode, GLuint start, GLuint end, GLsizei count, GLenum type, void const * indices)} */
    public static void glDrawRangeElements(@NativeType("GLenum") int mode, @NativeType("GLuint") int start, @NativeType("GLuint") int end, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices) {
        nglDrawRangeElements(mode, start, end, count, type, indices);
    }

    /** {@code void glDrawRangeElements(GLenum mode, GLuint start, GLuint end, GLsizei count, GLenum type, void const * indices)} */
    public static void glDrawRangeElements(@NativeType("GLenum") int mode, @NativeType("GLuint") int start, @NativeType("GLuint") int end, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices) {
        nglDrawRangeElements(mode, start, end, indices.remaining() >> GLESChecks.typeToByteShift(type), type, memAddress(indices));
    }

    /** {@code void glDrawRangeElements(GLenum mode, GLuint start, GLuint end, GLsizei count, GLenum type, void const * indices)} */
    public static void glDrawRangeElements(@NativeType("GLenum") int mode, @NativeType("GLuint") int start, @NativeType("GLuint") int end, @NativeType("void const *") ByteBuffer indices) {
        nglDrawRangeElements(mode, start, end, indices.remaining(), GLES20.GL_UNSIGNED_BYTE, memAddress(indices));
    }

    /** {@code void glDrawRangeElements(GLenum mode, GLuint start, GLuint end, GLsizei count, GLenum type, void const * indices)} */
    public static void glDrawRangeElements(@NativeType("GLenum") int mode, @NativeType("GLuint") int start, @NativeType("GLuint") int end, @NativeType("void const *") ShortBuffer indices) {
        nglDrawRangeElements(mode, start, end, indices.remaining(), GLES20.GL_UNSIGNED_SHORT, memAddress(indices));
    }

    /** {@code void glDrawRangeElements(GLenum mode, GLuint start, GLuint end, GLsizei count, GLenum type, void const * indices)} */
    public static void glDrawRangeElements(@NativeType("GLenum") int mode, @NativeType("GLuint") int start, @NativeType("GLuint") int end, @NativeType("void const *") IntBuffer indices) {
        nglDrawRangeElements(mode, start, end, indices.remaining(), GLES20.GL_UNSIGNED_INT, memAddress(indices));
    }

    // --- [ glTexImage3D ] ---

    /** {@code void glTexImage3D(GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static native void nglTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, long pixels);

    /** {@code void glTexImage3D(GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable ByteBuffer pixels) {
        nglTexImage3D(target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
    }

    /** {@code void glTexImage3D(GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        nglTexImage3D(target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    /** {@code void glTexImage3D(GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable ShortBuffer pixels) {
        nglTexImage3D(target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
    }

    /** {@code void glTexImage3D(GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable IntBuffer pixels) {
        nglTexImage3D(target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
    }

    /** {@code void glTexImage3D(GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable FloatBuffer pixels) {
        nglTexImage3D(target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
    }

    // --- [ glTexSubImage3D ] ---

    /** {@code void glTexSubImage3D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static native void nglTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels);

    /** {@code void glTexSubImage3D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexSubImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer pixels) {
        nglTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
    }

    /** {@code void glTexSubImage3D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexSubImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        nglTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    /** {@code void glTexSubImage3D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexSubImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ShortBuffer pixels) {
        nglTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
    }

    /** {@code void glTexSubImage3D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexSubImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer pixels) {
        nglTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
    }

    /** {@code void glTexSubImage3D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexSubImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") FloatBuffer pixels) {
        nglTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
    }

    // --- [ glCopyTexSubImage3D ] ---

    /** {@code void glCopyTexSubImage3D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLint x, GLint y, GLsizei width, GLsizei height)} */
    public static native void glCopyTexSubImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

    // --- [ glCompressedTexImage3D ] ---

    /** {@code void glCompressedTexImage3D(GLenum target, GLint level, GLenum internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLsizei imageSize, void const * data)} */
    public static native void nglCompressedTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long data);

    /** {@code void glCompressedTexImage3D(GLenum target, GLint level, GLenum internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLsizei imageSize, void const * data)} */
    public static void glCompressedTexImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        nglCompressedTexImage3D(target, level, internalformat, width, height, depth, border, imageSize, data);
    }

    /** {@code void glCompressedTexImage3D(GLenum target, GLint level, GLenum internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLsizei imageSize, void const * data)} */
    public static void glCompressedTexImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("void const *") @Nullable ByteBuffer data) {
        nglCompressedTexImage3D(target, level, internalformat, width, height, depth, border, remainingSafe(data), memAddressSafe(data));
    }

    // --- [ glCompressedTexSubImage3D ] ---

    /** {@code void glCompressedTexSubImage3D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLsizei imageSize, void const * data)} */
    public static native void nglCompressedTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data);

    /** {@code void glCompressedTexSubImage3D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLsizei imageSize, void const * data)} */
    public static void glCompressedTexSubImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        nglCompressedTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
    }

    /** {@code void glCompressedTexSubImage3D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLsizei imageSize, void const * data)} */
    public static void glCompressedTexSubImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("void const *") ByteBuffer data) {
        nglCompressedTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, data.remaining(), memAddress(data));
    }

    // --- [ glGenQueries ] ---

    /** {@code void glGenQueries(GLsizei n, GLuint * ids)} */
    public static native void nglGenQueries(int n, long ids);

    /** {@code void glGenQueries(GLsizei n, GLuint * ids)} */
    public static void glGenQueries(@NativeType("GLuint *") IntBuffer ids) {
        nglGenQueries(ids.remaining(), memAddress(ids));
    }

    /** {@code void glGenQueries(GLsizei n, GLuint * ids)} */
    @NativeType("void")
    public static int glGenQueries() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer ids = stack.callocInt(1);
            nglGenQueries(1, memAddress(ids));
            return ids.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glDeleteQueries ] ---

    /** {@code void glDeleteQueries(GLsizei n, GLuint const * ids)} */
    public static native void nglDeleteQueries(int n, long ids);

    /** {@code void glDeleteQueries(GLsizei n, GLuint const * ids)} */
    public static void glDeleteQueries(@NativeType("GLuint const *") IntBuffer ids) {
        nglDeleteQueries(ids.remaining(), memAddress(ids));
    }

    /** {@code void glDeleteQueries(GLsizei n, GLuint const * ids)} */
    public static void glDeleteQueries(@NativeType("GLuint const *") int id) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer ids = stack.ints(id);
            nglDeleteQueries(1, memAddress(ids));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glIsQuery ] ---

    /** {@code GLboolean glIsQuery(GLuint id)} */
    @NativeType("GLboolean")
    public static native boolean glIsQuery(@NativeType("GLuint") int id);

    // --- [ glBeginQuery ] ---

    /** {@code void glBeginQuery(GLenum target, GLuint id)} */
    public static native void glBeginQuery(@NativeType("GLenum") int target, @NativeType("GLuint") int id);

    // --- [ glEndQuery ] ---

    /** {@code void glEndQuery(GLenum target)} */
    public static native void glEndQuery(@NativeType("GLenum") int target);

    // --- [ glGetQueryiv ] ---

    /** {@code void glGetQueryiv(GLenum target, GLenum pname, GLint * params)} */
    public static native void nglGetQueryiv(int target, int pname, long params);

    /** {@code void glGetQueryiv(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetQueryiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetQueryiv(target, pname, memAddress(params));
    }

    /** {@code void glGetQueryiv(GLenum target, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetQueryi(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetQueryiv(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetQueryObjectuiv ] ---

    /** {@code void glGetQueryObjectuiv(GLuint id, GLenum pname, GLuint * params)} */
    public static native void nglGetQueryObjectuiv(int id, int pname, long params);

    /** {@code void glGetQueryObjectuiv(GLuint id, GLenum pname, GLuint * params)} */
    public static void glGetQueryObjectuiv(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetQueryObjectuiv(id, pname, memAddress(params));
    }

    /** {@code void glGetQueryObjectuiv(GLuint id, GLenum pname, GLuint * params)} */
    @NativeType("void")
    public static int glGetQueryObjectui(@NativeType("GLuint") int id, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetQueryObjectuiv(id, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glUnmapBuffer ] ---

    /** {@code GLboolean glUnmapBuffer(GLenum target)} */
    @NativeType("GLboolean")
    public static native boolean glUnmapBuffer(@NativeType("GLenum") int target);

    // --- [ glGetBufferPointerv ] ---

    /** {@code void glGetBufferPointerv(GLenum target, GLenum pname, void ** params)} */
    public static native void nglGetBufferPointerv(int target, int pname, long params);

    /** {@code void glGetBufferPointerv(GLenum target, GLenum pname, void ** params)} */
    public static void glGetBufferPointerv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("void **") PointerBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetBufferPointerv(target, pname, memAddress(params));
    }

    /** {@code void glGetBufferPointerv(GLenum target, GLenum pname, void ** params)} */
    @NativeType("void")
    public static long glGetBufferPointer(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer params = stack.callocPointer(1);
            nglGetBufferPointerv(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glDrawBuffers ] ---

    /** {@code void glDrawBuffers(GLsizei n, GLenum const * bufs)} */
    public static native void nglDrawBuffers(int n, long bufs);

    /** {@code void glDrawBuffers(GLsizei n, GLenum const * bufs)} */
    public static void glDrawBuffers(@NativeType("GLenum const *") IntBuffer bufs) {
        nglDrawBuffers(bufs.remaining(), memAddress(bufs));
    }

    /** {@code void glDrawBuffers(GLsizei n, GLenum const * bufs)} */
    public static void glDrawBuffers(@NativeType("GLenum const *") int buf) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer bufs = stack.ints(buf);
            nglDrawBuffers(1, memAddress(bufs));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glUniformMatrix2x3fv ] ---

    /** {@code void glUniformMatrix2x3fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglUniformMatrix2x3fv(int location, int count, boolean transpose, long value);

    /** {@code void glUniformMatrix2x3fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glUniformMatrix2x3fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglUniformMatrix2x3fv(location, value.remaining() / 6, transpose, memAddress(value));
    }

    // --- [ glUniformMatrix3x2fv ] ---

    /** {@code void glUniformMatrix3x2fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglUniformMatrix3x2fv(int location, int count, boolean transpose, long value);

    /** {@code void glUniformMatrix3x2fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glUniformMatrix3x2fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglUniformMatrix3x2fv(location, value.remaining() / 6, transpose, memAddress(value));
    }

    // --- [ glUniformMatrix2x4fv ] ---

    /** {@code void glUniformMatrix2x4fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglUniformMatrix2x4fv(int location, int count, boolean transpose, long value);

    /** {@code void glUniformMatrix2x4fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glUniformMatrix2x4fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglUniformMatrix2x4fv(location, value.remaining() >> 3, transpose, memAddress(value));
    }

    // --- [ glUniformMatrix4x2fv ] ---

    /** {@code void glUniformMatrix4x2fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglUniformMatrix4x2fv(int location, int count, boolean transpose, long value);

    /** {@code void glUniformMatrix4x2fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glUniformMatrix4x2fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglUniformMatrix4x2fv(location, value.remaining() >> 3, transpose, memAddress(value));
    }

    // --- [ glUniformMatrix3x4fv ] ---

    /** {@code void glUniformMatrix3x4fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglUniformMatrix3x4fv(int location, int count, boolean transpose, long value);

    /** {@code void glUniformMatrix3x4fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glUniformMatrix3x4fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglUniformMatrix3x4fv(location, value.remaining() / 12, transpose, memAddress(value));
    }

    // --- [ glUniformMatrix4x3fv ] ---

    /** {@code void glUniformMatrix4x3fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglUniformMatrix4x3fv(int location, int count, boolean transpose, long value);

    /** {@code void glUniformMatrix4x3fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glUniformMatrix4x3fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglUniformMatrix4x3fv(location, value.remaining() / 12, transpose, memAddress(value));
    }

    // --- [ glBlitFramebuffer ] ---

    /** {@code void glBlitFramebuffer(GLint srcX0, GLint srcY0, GLint srcX1, GLint srcY1, GLint dstX0, GLint dstY0, GLint dstX1, GLint dstY1, GLbitfield mask, GLenum filter)} */
    public static native void glBlitFramebuffer(@NativeType("GLint") int srcX0, @NativeType("GLint") int srcY0, @NativeType("GLint") int srcX1, @NativeType("GLint") int srcY1, @NativeType("GLint") int dstX0, @NativeType("GLint") int dstY0, @NativeType("GLint") int dstX1, @NativeType("GLint") int dstY1, @NativeType("GLbitfield") int mask, @NativeType("GLenum") int filter);

    // --- [ glRenderbufferStorageMultisample ] ---

    /** {@code void glRenderbufferStorageMultisample(GLenum target, GLsizei samples, GLenum internalformat, GLsizei width, GLsizei height)} */
    public static native void glRenderbufferStorageMultisample(@NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

    // --- [ glFramebufferTextureLayer ] ---

    /** {@code void glFramebufferTextureLayer(GLenum target, GLenum attachment, GLuint texture, GLint level, GLint layer)} */
    public static native void glFramebufferTextureLayer(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int layer);

    // --- [ glMapBufferRange ] ---

    /** {@code void * glMapBufferRange(GLenum target, GLintptr offset, GLsizeiptr length, GLbitfield access)} */
    public static native long nglMapBufferRange(int target, long offset, long length, int access);

    /** {@code void * glMapBufferRange(GLenum target, GLintptr offset, GLsizeiptr length, GLbitfield access)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer glMapBufferRange(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long length, @NativeType("GLbitfield") int access) {
        long __result = nglMapBufferRange(target, offset, length, access);
        return memByteBufferSafe(__result, (int)length);
    }

    /** {@code void * glMapBufferRange(GLenum target, GLintptr offset, GLsizeiptr length, GLbitfield access)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer glMapBufferRange(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long length, @NativeType("GLbitfield") int access, @Nullable ByteBuffer old_buffer) {
        long __result = nglMapBufferRange(target, offset, length, access);
        return apiGetMappedBuffer(old_buffer, __result, (int)length);
    }

    // --- [ glFlushMappedBufferRange ] ---

    /** {@code void glFlushMappedBufferRange(GLenum target, GLintptr offset, GLsizeiptr length)} */
    public static native void glFlushMappedBufferRange(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long length);

    // --- [ glBindVertexArray ] ---

    /** {@code void glBindVertexArray(GLuint array)} */
    public static native void glBindVertexArray(@NativeType("GLuint") int array);

    // --- [ glDeleteVertexArrays ] ---

    /** {@code void glDeleteVertexArrays(GLsizei n, GLuint const * arrays)} */
    public static native void nglDeleteVertexArrays(int n, long arrays);

    /** {@code void glDeleteVertexArrays(GLsizei n, GLuint const * arrays)} */
    public static void glDeleteVertexArrays(@NativeType("GLuint const *") IntBuffer arrays) {
        nglDeleteVertexArrays(arrays.remaining(), memAddress(arrays));
    }

    /** {@code void glDeleteVertexArrays(GLsizei n, GLuint const * arrays)} */
    public static void glDeleteVertexArrays(@NativeType("GLuint const *") int array) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer arrays = stack.ints(array);
            nglDeleteVertexArrays(1, memAddress(arrays));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGenVertexArrays ] ---

    /** {@code void glGenVertexArrays(GLsizei n, GLuint * arrays)} */
    public static native void nglGenVertexArrays(int n, long arrays);

    /** {@code void glGenVertexArrays(GLsizei n, GLuint * arrays)} */
    public static void glGenVertexArrays(@NativeType("GLuint *") IntBuffer arrays) {
        nglGenVertexArrays(arrays.remaining(), memAddress(arrays));
    }

    /** {@code void glGenVertexArrays(GLsizei n, GLuint * arrays)} */
    @NativeType("void")
    public static int glGenVertexArrays() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer arrays = stack.callocInt(1);
            nglGenVertexArrays(1, memAddress(arrays));
            return arrays.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glIsVertexArray ] ---

    /** {@code GLboolean glIsVertexArray(GLuint array)} */
    @NativeType("GLboolean")
    public static native boolean glIsVertexArray(@NativeType("GLuint") int array);

    // --- [ glGetIntegeri_v ] ---

    /** {@code void glGetIntegeri_v(GLenum target, GLuint index, GLint * data)} */
    public static native void nglGetIntegeri_v(int target, int index, long data);

    /** {@code void glGetIntegeri_v(GLenum target, GLuint index, GLint * data)} */
    public static void glGetIntegeri_v(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLint *") IntBuffer data) {
        if (CHECKS) {
            check(data, 1);
        }
        nglGetIntegeri_v(target, index, memAddress(data));
    }

    /** {@code void glGetIntegeri_v(GLenum target, GLuint index, GLint * data)} */
    @NativeType("void")
    public static int glGetIntegeri(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer data = stack.callocInt(1);
            nglGetIntegeri_v(target, index, memAddress(data));
            return data.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glBeginTransformFeedback ] ---

    /** {@code void glBeginTransformFeedback(GLenum primitiveMode)} */
    public static native void glBeginTransformFeedback(@NativeType("GLenum") int primitiveMode);

    // --- [ glEndTransformFeedback ] ---

    /** {@code void glEndTransformFeedback(void)} */
    public static native void glEndTransformFeedback();

    // --- [ glBindBufferRange ] ---

    /** {@code void glBindBufferRange(GLenum target, GLuint index, GLuint buffer, GLintptr offset, GLsizeiptr size)} */
    public static native void glBindBufferRange(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size);

    // --- [ glBindBufferBase ] ---

    /** {@code void glBindBufferBase(GLenum target, GLuint index, GLuint buffer)} */
    public static native void glBindBufferBase(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLuint") int buffer);

    // --- [ glTransformFeedbackVaryings ] ---

    /** {@code void glTransformFeedbackVaryings(GLuint program, GLsizei count, GLchar const * const * varyings, GLenum bufferMode)} */
    public static native void nglTransformFeedbackVaryings(int program, int count, long varyings, int bufferMode);

    /** {@code void glTransformFeedbackVaryings(GLuint program, GLsizei count, GLchar const * const * varyings, GLenum bufferMode)} */
    public static void glTransformFeedbackVaryings(@NativeType("GLuint") int program, @NativeType("GLchar const * const *") PointerBuffer varyings, @NativeType("GLenum") int bufferMode) {
        nglTransformFeedbackVaryings(program, varyings.remaining(), memAddress(varyings), bufferMode);
    }

    /** {@code void glTransformFeedbackVaryings(GLuint program, GLsizei count, GLchar const * const * varyings, GLenum bufferMode)} */
    public static void glTransformFeedbackVaryings(@NativeType("GLuint") int program, @NativeType("GLchar const * const *") CharSequence[] varyings, @NativeType("GLenum") int bufferMode) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long varyingsAddress = org.lwjgl.system.APIUtil.apiArray(stack, MemoryUtil::memASCII, varyings);
            nglTransformFeedbackVaryings(program, varyings.length, varyingsAddress, bufferMode);
            org.lwjgl.system.APIUtil.apiArrayFree(varyingsAddress, varyings.length);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glTransformFeedbackVaryings(GLuint program, GLsizei count, GLchar const * const * varyings, GLenum bufferMode)} */
    public static void glTransformFeedbackVaryings(@NativeType("GLuint") int program, @NativeType("GLchar const * const *") CharSequence varying, @NativeType("GLenum") int bufferMode) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long varyingsAddress = org.lwjgl.system.APIUtil.apiArray(stack, MemoryUtil::memASCII, varying);
            nglTransformFeedbackVaryings(program, 1, varyingsAddress, bufferMode);
            org.lwjgl.system.APIUtil.apiArrayFree(varyingsAddress, 1);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetTransformFeedbackVarying ] ---

    /** {@code void glGetTransformFeedbackVarying(GLuint program, GLuint index, GLsizei bufSize, GLsizei * length, GLsizei * size, GLenum * type, GLchar * name)} */
    public static native void nglGetTransformFeedbackVarying(int program, int index, int bufSize, long length, long size, long type, long name);

    /** {@code void glGetTransformFeedbackVarying(GLuint program, GLuint index, GLsizei bufSize, GLsizei * length, GLsizei * size, GLenum * type, GLchar * name)} */
    public static void glGetTransformFeedbackVarying(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLsizei *") IntBuffer size, @NativeType("GLenum *") IntBuffer type, @NativeType("GLchar *") ByteBuffer name) {
        if (CHECKS) {
            checkSafe(length, 1);
            check(size, 1);
            check(type, 1);
        }
        nglGetTransformFeedbackVarying(program, index, name.remaining(), memAddressSafe(length), memAddress(size), memAddress(type), memAddress(name));
    }

    /** {@code void glGetTransformFeedbackVarying(GLuint program, GLuint index, GLsizei bufSize, GLsizei * length, GLsizei * size, GLenum * type, GLchar * name)} */
    @NativeType("void")
    public static String glGetTransformFeedbackVarying(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLsizei") int bufSize, @NativeType("GLsizei *") IntBuffer size, @NativeType("GLenum *") IntBuffer type) {
        if (CHECKS) {
            check(size, 1);
            check(type, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer length = stack.ints(0);
            ByteBuffer name = stack.malloc(bufSize);
            nglGetTransformFeedbackVarying(program, index, bufSize, memAddress(length), memAddress(size), memAddress(type), memAddress(name));
            return memASCII(name, length.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glGetTransformFeedbackVarying(GLuint program, GLuint index, GLsizei bufSize, GLsizei * length, GLsizei * size, GLenum * type, GLchar * name)} */
    @NativeType("void")
    public static String glGetTransformFeedbackVarying(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLsizei *") IntBuffer size, @NativeType("GLenum *") IntBuffer type) {
        return glGetTransformFeedbackVarying(program, index, GLES20.glGetProgrami(program, GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH), size, type);
    }

    // --- [ glVertexAttribIPointer ] ---

    /** {@code void glVertexAttribIPointer(GLuint index, GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static native void nglVertexAttribIPointer(int index, int size, int type, int stride, long pointer);

    /** {@code void glVertexAttribIPointer(GLuint index, GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void glVertexAttribIPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ByteBuffer pointer) {
        nglVertexAttribIPointer(index, size, type, stride, memAddress(pointer));
    }

    /** {@code void glVertexAttribIPointer(GLuint index, GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void glVertexAttribIPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") long pointer) {
        nglVertexAttribIPointer(index, size, type, stride, pointer);
    }

    /** {@code void glVertexAttribIPointer(GLuint index, GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void glVertexAttribIPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ShortBuffer pointer) {
        nglVertexAttribIPointer(index, size, type, stride, memAddress(pointer));
    }

    /** {@code void glVertexAttribIPointer(GLuint index, GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void glVertexAttribIPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") IntBuffer pointer) {
        nglVertexAttribIPointer(index, size, type, stride, memAddress(pointer));
    }

    // --- [ glGetVertexAttribIiv ] ---

    /** {@code void glGetVertexAttribIiv(GLuint index, GLenum pname, GLint * params)} */
    public static native void nglGetVertexAttribIiv(int index, int pname, long params);

    /** {@code void glGetVertexAttribIiv(GLuint index, GLenum pname, GLint * params)} */
    public static void glGetVertexAttribIiv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetVertexAttribIiv(index, pname, memAddress(params));
    }

    /** {@code void glGetVertexAttribIiv(GLuint index, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetVertexAttribIi(@NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetVertexAttribIiv(index, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetVertexAttribIuiv ] ---

    /** {@code void glGetVertexAttribIuiv(GLuint index, GLenum pname, GLuint * params)} */
    public static native void nglGetVertexAttribIuiv(int index, int pname, long params);

    /** {@code void glGetVertexAttribIuiv(GLuint index, GLenum pname, GLuint * params)} */
    public static void glGetVertexAttribIuiv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLuint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetVertexAttribIuiv(index, pname, memAddress(params));
    }

    /** {@code void glGetVertexAttribIuiv(GLuint index, GLenum pname, GLuint * params)} */
    @NativeType("void")
    public static int glGetVertexAttribIui(@NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetVertexAttribIuiv(index, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glVertexAttribI4i ] ---

    /** {@code void glVertexAttribI4i(GLuint index, GLint x, GLint y, GLint z, GLint w)} */
    public static native void glVertexAttribI4i(@NativeType("GLuint") int index, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z, @NativeType("GLint") int w);

    // --- [ glVertexAttribI4ui ] ---

    /** {@code void glVertexAttribI4ui(GLuint index, GLuint x, GLuint y, GLuint z, GLuint w)} */
    public static native void glVertexAttribI4ui(@NativeType("GLuint") int index, @NativeType("GLuint") int x, @NativeType("GLuint") int y, @NativeType("GLuint") int z, @NativeType("GLuint") int w);

    // --- [ glVertexAttribI4iv ] ---

    /** {@code void glVertexAttribI4iv(GLuint index, GLint const * v)} */
    public static native void nglVertexAttribI4iv(int index, long v);

    /** {@code void glVertexAttribI4iv(GLuint index, GLint const * v)} */
    public static void glVertexAttribI4iv(@NativeType("GLuint") int index, @NativeType("GLint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttribI4iv(index, memAddress(v));
    }

    // --- [ glVertexAttribI4uiv ] ---

    /** {@code void glVertexAttribI4uiv(GLuint index, GLuint const * v)} */
    public static native void nglVertexAttribI4uiv(int index, long v);

    /** {@code void glVertexAttribI4uiv(GLuint index, GLuint const * v)} */
    public static void glVertexAttribI4uiv(@NativeType("GLuint") int index, @NativeType("GLuint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttribI4uiv(index, memAddress(v));
    }

    // --- [ glGetUniformuiv ] ---

    /** {@code void glGetUniformuiv(GLuint program, GLint location, GLuint * params)} */
    public static native void nglGetUniformuiv(int program, int location, long params);

    /** {@code void glGetUniformuiv(GLuint program, GLint location, GLuint * params)} */
    public static void glGetUniformuiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetUniformuiv(program, location, memAddress(params));
    }

    /** {@code void glGetUniformuiv(GLuint program, GLint location, GLuint * params)} */
    @NativeType("void")
    public static int glGetUniformui(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetUniformuiv(program, location, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetFragDataLocation ] ---

    /** {@code GLint glGetFragDataLocation(GLuint program, GLchar const * name)} */
    public static native int nglGetFragDataLocation(int program, long name);

    /** {@code GLint glGetFragDataLocation(GLuint program, GLchar const * name)} */
    @NativeType("GLint")
    public static int glGetFragDataLocation(@NativeType("GLuint") int program, @NativeType("GLchar const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nglGetFragDataLocation(program, memAddress(name));
    }

    /** {@code GLint glGetFragDataLocation(GLuint program, GLchar const * name)} */
    @NativeType("GLint")
    public static int glGetFragDataLocation(@NativeType("GLuint") int program, @NativeType("GLchar const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nglGetFragDataLocation(program, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glUniform1ui ] ---

    /** {@code void glUniform1ui(GLint location, GLuint v0)} */
    public static native void glUniform1ui(@NativeType("GLint") int location, @NativeType("GLuint") int v0);

    // --- [ glUniform2ui ] ---

    /** {@code void glUniform2ui(GLint location, GLuint v0, GLuint v1)} */
    public static native void glUniform2ui(@NativeType("GLint") int location, @NativeType("GLuint") int v0, @NativeType("GLuint") int v1);

    // --- [ glUniform3ui ] ---

    /** {@code void glUniform3ui(GLint location, GLuint v0, GLuint v1, GLuint v2)} */
    public static native void glUniform3ui(@NativeType("GLint") int location, @NativeType("GLuint") int v0, @NativeType("GLuint") int v1, @NativeType("GLuint") int v2);

    // --- [ glUniform4ui ] ---

    /** {@code void glUniform4ui(GLint location, GLuint v0, GLuint v1, GLuint v2, GLuint v3)} */
    public static native void glUniform4ui(@NativeType("GLint") int location, @NativeType("GLuint") int v0, @NativeType("GLuint") int v1, @NativeType("GLuint") int v2, @NativeType("GLuint") int v3);

    // --- [ glUniform1uiv ] ---

    /** {@code void glUniform1uiv(GLint location, GLsizei count, GLuint const * value)} */
    public static native void nglUniform1uiv(int location, int count, long value);

    /** {@code void glUniform1uiv(GLint location, GLsizei count, GLuint const * value)} */
    public static void glUniform1uiv(@NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        nglUniform1uiv(location, value.remaining(), memAddress(value));
    }

    // --- [ glUniform2uiv ] ---

    /** {@code void glUniform2uiv(GLint location, GLsizei count, GLuint const * value)} */
    public static native void nglUniform2uiv(int location, int count, long value);

    /** {@code void glUniform2uiv(GLint location, GLsizei count, GLuint const * value)} */
    public static void glUniform2uiv(@NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        nglUniform2uiv(location, value.remaining() >> 1, memAddress(value));
    }

    // --- [ glUniform3uiv ] ---

    /** {@code void glUniform3uiv(GLint location, GLsizei count, GLuint const * value)} */
    public static native void nglUniform3uiv(int location, int count, long value);

    /** {@code void glUniform3uiv(GLint location, GLsizei count, GLuint const * value)} */
    public static void glUniform3uiv(@NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        nglUniform3uiv(location, value.remaining() / 3, memAddress(value));
    }

    // --- [ glUniform4uiv ] ---

    /** {@code void glUniform4uiv(GLint location, GLsizei count, GLuint const * value)} */
    public static native void nglUniform4uiv(int location, int count, long value);

    /** {@code void glUniform4uiv(GLint location, GLsizei count, GLuint const * value)} */
    public static void glUniform4uiv(@NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        nglUniform4uiv(location, value.remaining() >> 2, memAddress(value));
    }

    // --- [ glClearBufferiv ] ---

    /** {@code void glClearBufferiv(GLenum buffer, GLint drawbuffer, GLint const * value)} */
    public static native void nglClearBufferiv(int buffer, int drawbuffer, long value);

    /** {@code void glClearBufferiv(GLenum buffer, GLint drawbuffer, GLint const * value)} */
    public static void glClearBufferiv(@NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLint const *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nglClearBufferiv(buffer, drawbuffer, memAddress(value));
    }

    // --- [ glClearBufferuiv ] ---

    /** {@code void glClearBufferuiv(GLenum buffer, GLint drawbuffer, GLuint const * value)} */
    public static native void nglClearBufferuiv(int buffer, int drawbuffer, long value);

    /** {@code void glClearBufferuiv(GLenum buffer, GLint drawbuffer, GLuint const * value)} */
    public static void glClearBufferuiv(@NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLuint const *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nglClearBufferuiv(buffer, drawbuffer, memAddress(value));
    }

    // --- [ glClearBufferfv ] ---

    /** {@code void glClearBufferfv(GLenum buffer, GLint drawbuffer, GLfloat const * value)} */
    public static native void nglClearBufferfv(int buffer, int drawbuffer, long value);

    /** {@code void glClearBufferfv(GLenum buffer, GLint drawbuffer, GLfloat const * value)} */
    public static void glClearBufferfv(@NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLfloat const *") FloatBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nglClearBufferfv(buffer, drawbuffer, memAddress(value));
    }

    // --- [ glClearBufferfi ] ---

    /** {@code void glClearBufferfi(GLenum buffer, GLint drawbuffer, GLfloat depth, GLint stencil)} */
    public static native void glClearBufferfi(@NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLfloat") float depth, @NativeType("GLint") int stencil);

    // --- [ glGetStringi ] ---

    /** {@code GLubyte const * glGetStringi(GLenum name, GLuint index)} */
    public static native long nglGetStringi(int name, int index);

    /** {@code GLubyte const * glGetStringi(GLenum name, GLuint index)} */
    @NativeType("GLubyte const *")
    public static @Nullable String glGetStringi(@NativeType("GLenum") int name, @NativeType("GLuint") int index) {
        long __result = nglGetStringi(name, index);
        return memUTF8Safe(__result);
    }

    // --- [ glCopyBufferSubData ] ---

    /** {@code void glCopyBufferSubData(GLenum readTarget, GLenum writeTarget, GLintptr readOffset, GLintptr writeOffset, GLsizeiptr size)} */
    public static native void glCopyBufferSubData(@NativeType("GLenum") int readTarget, @NativeType("GLenum") int writeTarget, @NativeType("GLintptr") long readOffset, @NativeType("GLintptr") long writeOffset, @NativeType("GLsizeiptr") long size);

    // --- [ glGetUniformIndices ] ---

    /** {@code void glGetUniformIndices(GLuint program, GLsizei uniformCount, GLchar const * const * uniformNames, GLuint * uniformIndices)} */
    public static native void nglGetUniformIndices(int program, int uniformCount, long uniformNames, long uniformIndices);

    /** {@code void glGetUniformIndices(GLuint program, GLsizei uniformCount, GLchar const * const * uniformNames, GLuint * uniformIndices)} */
    public static void glGetUniformIndices(@NativeType("GLuint") int program, @NativeType("GLchar const * const *") PointerBuffer uniformNames, @NativeType("GLuint *") IntBuffer uniformIndices) {
        if (CHECKS) {
            check(uniformIndices, uniformNames.remaining());
        }
        nglGetUniformIndices(program, uniformNames.remaining(), memAddress(uniformNames), memAddress(uniformIndices));
    }

    // --- [ glGetActiveUniformsiv ] ---

    /** {@code void glGetActiveUniformsiv(GLuint program, GLsizei uniformCount, GLuint const * uniformIndices, GLenum pname, GLint * params)} */
    public static native void nglGetActiveUniformsiv(int program, int uniformCount, long uniformIndices, int pname, long params);

    /** {@code void glGetActiveUniformsiv(GLuint program, GLsizei uniformCount, GLuint const * uniformIndices, GLenum pname, GLint * params)} */
    public static void glGetActiveUniformsiv(@NativeType("GLuint") int program, @NativeType("GLuint const *") IntBuffer uniformIndices, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, uniformIndices.remaining());
        }
        nglGetActiveUniformsiv(program, uniformIndices.remaining(), memAddress(uniformIndices), pname, memAddress(params));
    }

    // --- [ glGetUniformBlockIndex ] ---

    /** {@code GLuint glGetUniformBlockIndex(GLuint program, GLchar const * uniformBlockName)} */
    public static native int nglGetUniformBlockIndex(int program, long uniformBlockName);

    /** {@code GLuint glGetUniformBlockIndex(GLuint program, GLchar const * uniformBlockName)} */
    @NativeType("GLuint")
    public static int glGetUniformBlockIndex(@NativeType("GLuint") int program, @NativeType("GLchar const *") ByteBuffer uniformBlockName) {
        if (CHECKS) {
            checkNT1(uniformBlockName);
        }
        return nglGetUniformBlockIndex(program, memAddress(uniformBlockName));
    }

    /** {@code GLuint glGetUniformBlockIndex(GLuint program, GLchar const * uniformBlockName)} */
    @NativeType("GLuint")
    public static int glGetUniformBlockIndex(@NativeType("GLuint") int program, @NativeType("GLchar const *") CharSequence uniformBlockName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(uniformBlockName, true);
            long uniformBlockNameEncoded = stack.getPointerAddress();
            return nglGetUniformBlockIndex(program, uniformBlockNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetActiveUniformBlockiv ] ---

    /** {@code void glGetActiveUniformBlockiv(GLuint program, GLuint uniformBlockIndex, GLenum pname, GLint * params)} */
    public static native void nglGetActiveUniformBlockiv(int program, int uniformBlockIndex, int pname, long params);

    /** {@code void glGetActiveUniformBlockiv(GLuint program, GLuint uniformBlockIndex, GLenum pname, GLint * params)} */
    public static void glGetActiveUniformBlockiv(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformBlockIndex, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetActiveUniformBlockiv(program, uniformBlockIndex, pname, memAddress(params));
    }

    /** {@code void glGetActiveUniformBlockiv(GLuint program, GLuint uniformBlockIndex, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetActiveUniformBlocki(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformBlockIndex, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetActiveUniformBlockiv(program, uniformBlockIndex, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetActiveUniformBlockName ] ---

    /** {@code void glGetActiveUniformBlockName(GLuint program, GLuint uniformBlockIndex, GLsizei bufSize, GLsizei * length, GLchar * uniformBlockName)} */
    public static native void nglGetActiveUniformBlockName(int program, int uniformBlockIndex, int bufSize, long length, long uniformBlockName);

    /** {@code void glGetActiveUniformBlockName(GLuint program, GLuint uniformBlockIndex, GLsizei bufSize, GLsizei * length, GLchar * uniformBlockName)} */
    public static void glGetActiveUniformBlockName(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformBlockIndex, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLchar *") ByteBuffer uniformBlockName) {
        if (CHECKS) {
            checkSafe(length, 1);
        }
        nglGetActiveUniformBlockName(program, uniformBlockIndex, uniformBlockName.remaining(), memAddressSafe(length), memAddress(uniformBlockName));
    }

    /** {@code void glGetActiveUniformBlockName(GLuint program, GLuint uniformBlockIndex, GLsizei bufSize, GLsizei * length, GLchar * uniformBlockName)} */
    @NativeType("void")
    public static String glGetActiveUniformBlockName(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformBlockIndex, @NativeType("GLsizei") int bufSize) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer length = stack.ints(0);
            ByteBuffer uniformBlockName = stack.malloc(bufSize);
            nglGetActiveUniformBlockName(program, uniformBlockIndex, bufSize, memAddress(length), memAddress(uniformBlockName));
            return memASCII(uniformBlockName, length.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glGetActiveUniformBlockName(GLuint program, GLuint uniformBlockIndex, GLsizei bufSize, GLsizei * length, GLchar * uniformBlockName)} */
    @NativeType("void")
    public static String glGetActiveUniformBlockName(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformBlockIndex) {
        return glGetActiveUniformBlockName(program, uniformBlockIndex, glGetActiveUniformBlocki(program, uniformBlockIndex, GL_UNIFORM_BLOCK_NAME_LENGTH));
    }

    // --- [ glUniformBlockBinding ] ---

    /** {@code void glUniformBlockBinding(GLuint program, GLuint uniformBlockIndex, GLuint uniformBlockBinding)} */
    public static native void glUniformBlockBinding(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformBlockIndex, @NativeType("GLuint") int uniformBlockBinding);

    // --- [ glDrawArraysInstanced ] ---

    /** {@code void glDrawArraysInstanced(GLenum mode, GLint first, GLsizei count, GLsizei instancecount)} */
    public static native void glDrawArraysInstanced(@NativeType("GLenum") int mode, @NativeType("GLint") int first, @NativeType("GLsizei") int count, @NativeType("GLsizei") int instancecount);

    // --- [ glDrawElementsInstanced ] ---

    /** {@code void glDrawElementsInstanced(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei instancecount)} */
    public static native void nglDrawElementsInstanced(int mode, int count, int type, long indices, int instancecount);

    /** {@code void glDrawElementsInstanced(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei instancecount)} */
    public static void glDrawElementsInstanced(@NativeType("GLenum") int mode, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices, @NativeType("GLsizei") int instancecount) {
        nglDrawElementsInstanced(mode, count, type, indices, instancecount);
    }

    /** {@code void glDrawElementsInstanced(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei instancecount)} */
    public static void glDrawElementsInstanced(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int instancecount) {
        nglDrawElementsInstanced(mode, indices.remaining() >> GLESChecks.typeToByteShift(type), type, memAddress(indices), instancecount);
    }

    /** {@code void glDrawElementsInstanced(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei instancecount)} */
    public static void glDrawElementsInstanced(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int instancecount) {
        nglDrawElementsInstanced(mode, indices.remaining(), GLES20.GL_UNSIGNED_BYTE, memAddress(indices), instancecount);
    }

    /** {@code void glDrawElementsInstanced(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei instancecount)} */
    public static void glDrawElementsInstanced(@NativeType("GLenum") int mode, @NativeType("void const *") ShortBuffer indices, @NativeType("GLsizei") int instancecount) {
        nglDrawElementsInstanced(mode, indices.remaining(), GLES20.GL_UNSIGNED_SHORT, memAddress(indices), instancecount);
    }

    /** {@code void glDrawElementsInstanced(GLenum mode, GLsizei count, GLenum type, void const * indices, GLsizei instancecount)} */
    public static void glDrawElementsInstanced(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indices, @NativeType("GLsizei") int instancecount) {
        nglDrawElementsInstanced(mode, indices.remaining(), GLES20.GL_UNSIGNED_INT, memAddress(indices), instancecount);
    }

    // --- [ glFenceSync ] ---

    /** {@code GLsync glFenceSync(GLenum condition, GLbitfield flags)} */
    @NativeType("GLsync")
    public static native long glFenceSync(@NativeType("GLenum") int condition, @NativeType("GLbitfield") int flags);

    // --- [ glIsSync ] ---

    /** {@code GLboolean glIsSync(GLsync sync)} */
    public static native boolean nglIsSync(long sync);

    /** {@code GLboolean glIsSync(GLsync sync)} */
    @NativeType("GLboolean")
    public static boolean glIsSync(@NativeType("GLsync") long sync) {
        if (CHECKS) {
            check(sync);
        }
        return nglIsSync(sync);
    }

    // --- [ glDeleteSync ] ---

    /** {@code void glDeleteSync(GLsync sync)} */
    public static native void nglDeleteSync(long sync);

    /** {@code void glDeleteSync(GLsync sync)} */
    public static void glDeleteSync(@NativeType("GLsync") long sync) {
        if (CHECKS) {
            check(sync);
        }
        nglDeleteSync(sync);
    }

    // --- [ glClientWaitSync ] ---

    /** {@code GLenum glClientWaitSync(GLsync sync, GLbitfield flags, GLuint64 timeout)} */
    public static native int nglClientWaitSync(long sync, int flags, long timeout);

    /** {@code GLenum glClientWaitSync(GLsync sync, GLbitfield flags, GLuint64 timeout)} */
    @NativeType("GLenum")
    public static int glClientWaitSync(@NativeType("GLsync") long sync, @NativeType("GLbitfield") int flags, @NativeType("GLuint64") long timeout) {
        if (CHECKS) {
            check(sync);
        }
        return nglClientWaitSync(sync, flags, timeout);
    }

    // --- [ glWaitSync ] ---

    /** {@code void glWaitSync(GLsync sync, GLbitfield flags, GLuint64 timeout)} */
    public static native void nglWaitSync(long sync, int flags, long timeout);

    /** {@code void glWaitSync(GLsync sync, GLbitfield flags, GLuint64 timeout)} */
    public static void glWaitSync(@NativeType("GLsync") long sync, @NativeType("GLbitfield") int flags, @NativeType("GLuint64") long timeout) {
        if (CHECKS) {
            check(sync);
        }
        nglWaitSync(sync, flags, timeout);
    }

    // --- [ glGetInteger64v ] ---

    /** {@code void glGetInteger64v(GLenum pname, GLint64 * data)} */
    public static native void nglGetInteger64v(int pname, long data);

    /** {@code void glGetInteger64v(GLenum pname, GLint64 * data)} */
    public static void glGetInteger64v(@NativeType("GLenum") int pname, @NativeType("GLint64 *") LongBuffer data) {
        if (CHECKS) {
            check(data, 1);
        }
        nglGetInteger64v(pname, memAddress(data));
    }

    /** {@code void glGetInteger64v(GLenum pname, GLint64 * data)} */
    @NativeType("void")
    public static long glGetInteger64(@NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer data = stack.callocLong(1);
            nglGetInteger64v(pname, memAddress(data));
            return data.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetSynciv ] ---

    /** {@code void glGetSynciv(GLsync sync, GLenum pname, GLsizei bufSize, GLsizei * length, GLint * values)} */
    public static native void nglGetSynciv(long sync, int pname, int bufSize, long length, long values);

    /** {@code void glGetSynciv(GLsync sync, GLenum pname, GLsizei bufSize, GLsizei * length, GLint * values)} */
    public static void glGetSynciv(@NativeType("GLsync") long sync, @NativeType("GLenum") int pname, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLint *") IntBuffer values) {
        if (CHECKS) {
            check(sync);
            checkSafe(length, 1);
        }
        nglGetSynciv(sync, pname, values.remaining(), memAddressSafe(length), memAddress(values));
    }

    /** {@code void glGetSynciv(GLsync sync, GLenum pname, GLsizei bufSize, GLsizei * length, GLint * values)} */
    @NativeType("void")
    public static int glGetSynci(@NativeType("GLsync") long sync, @NativeType("GLenum") int pname, @NativeType("GLsizei *") @Nullable IntBuffer length) {
        if (CHECKS) {
            check(sync);
            checkSafe(length, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer values = stack.callocInt(1);
            nglGetSynciv(sync, pname, 1, memAddressSafe(length), memAddress(values));
            return values.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetInteger64i_v ] ---

    /** {@code void glGetInteger64i_v(GLenum target, GLuint index, GLint64 * data)} */
    public static native void nglGetInteger64i_v(int target, int index, long data);

    /** {@code void glGetInteger64i_v(GLenum target, GLuint index, GLint64 * data)} */
    public static void glGetInteger64i_v(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLint64 *") LongBuffer data) {
        if (CHECKS) {
            check(data, 1);
        }
        nglGetInteger64i_v(target, index, memAddress(data));
    }

    /** {@code void glGetInteger64i_v(GLenum target, GLuint index, GLint64 * data)} */
    @NativeType("void")
    public static long glGetInteger64i(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer data = stack.callocLong(1);
            nglGetInteger64i_v(target, index, memAddress(data));
            return data.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetBufferParameteri64v ] ---

    /** {@code void glGetBufferParameteri64v(GLenum target, GLenum pname, GLint64 * params)} */
    public static native void nglGetBufferParameteri64v(int target, int pname, long params);

    /** {@code void glGetBufferParameteri64v(GLenum target, GLenum pname, GLint64 * params)} */
    public static void glGetBufferParameteri64v(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint64 *") LongBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetBufferParameteri64v(target, pname, memAddress(params));
    }

    /** {@code void glGetBufferParameteri64v(GLenum target, GLenum pname, GLint64 * params)} */
    @NativeType("void")
    public static long glGetBufferParameteri64(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer params = stack.callocLong(1);
            nglGetBufferParameteri64v(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGenSamplers ] ---

    /** {@code void glGenSamplers(GLsizei count, GLuint * samplers)} */
    public static native void nglGenSamplers(int count, long samplers);

    /** {@code void glGenSamplers(GLsizei count, GLuint * samplers)} */
    public static void glGenSamplers(@NativeType("GLuint *") IntBuffer samplers) {
        nglGenSamplers(samplers.remaining(), memAddress(samplers));
    }

    /** {@code void glGenSamplers(GLsizei count, GLuint * samplers)} */
    @NativeType("void")
    public static int glGenSamplers() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer samplers = stack.callocInt(1);
            nglGenSamplers(1, memAddress(samplers));
            return samplers.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glDeleteSamplers ] ---

    /** {@code void glDeleteSamplers(GLsizei count, GLuint const * samplers)} */
    public static native void nglDeleteSamplers(int count, long samplers);

    /** {@code void glDeleteSamplers(GLsizei count, GLuint const * samplers)} */
    public static void glDeleteSamplers(@NativeType("GLuint const *") IntBuffer samplers) {
        nglDeleteSamplers(samplers.remaining(), memAddress(samplers));
    }

    /** {@code void glDeleteSamplers(GLsizei count, GLuint const * samplers)} */
    public static void glDeleteSamplers(@NativeType("GLuint const *") int sampler) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer samplers = stack.ints(sampler);
            nglDeleteSamplers(1, memAddress(samplers));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glIsSampler ] ---

    /** {@code GLboolean glIsSampler(GLuint sampler)} */
    @NativeType("GLboolean")
    public static native boolean glIsSampler(@NativeType("GLuint") int sampler);

    // --- [ glBindSampler ] ---

    /** {@code void glBindSampler(GLuint unit, GLuint sampler)} */
    public static native void glBindSampler(@NativeType("GLuint") int unit, @NativeType("GLuint") int sampler);

    // --- [ glSamplerParameteri ] ---

    /** {@code void glSamplerParameteri(GLuint sampler, GLenum pname, GLint param)} */
    public static native void glSamplerParameteri(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint") int param);

    // --- [ glSamplerParameteriv ] ---

    /** {@code void glSamplerParameteriv(GLuint sampler, GLenum pname, GLint const * param)} */
    public static native void nglSamplerParameteriv(int sampler, int pname, long param);

    /** {@code void glSamplerParameteriv(GLuint sampler, GLenum pname, GLint const * param)} */
    public static void glSamplerParameteriv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer param) {
        if (CHECKS) {
            check(param, 1);
        }
        nglSamplerParameteriv(sampler, pname, memAddress(param));
    }

    // --- [ glSamplerParameterf ] ---

    /** {@code void glSamplerParameterf(GLuint sampler, GLenum pname, GLfloat param)} */
    public static native void glSamplerParameterf(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLfloat") float param);

    // --- [ glSamplerParameterfv ] ---

    /** {@code void glSamplerParameterfv(GLuint sampler, GLenum pname, GLfloat const * param)} */
    public static native void nglSamplerParameterfv(int sampler, int pname, long param);

    /** {@code void glSamplerParameterfv(GLuint sampler, GLenum pname, GLfloat const * param)} */
    public static void glSamplerParameterfv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer param) {
        if (CHECKS) {
            check(param, 1);
        }
        nglSamplerParameterfv(sampler, pname, memAddress(param));
    }

    // --- [ glGetSamplerParameteriv ] ---

    /** {@code void glGetSamplerParameteriv(GLuint sampler, GLenum pname, GLint * params)} */
    public static native void nglGetSamplerParameteriv(int sampler, int pname, long params);

    /** {@code void glGetSamplerParameteriv(GLuint sampler, GLenum pname, GLint * params)} */
    public static void glGetSamplerParameteriv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetSamplerParameteriv(sampler, pname, memAddress(params));
    }

    /** {@code void glGetSamplerParameteriv(GLuint sampler, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetSamplerParameteri(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetSamplerParameteriv(sampler, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetSamplerParameterfv ] ---

    /** {@code void glGetSamplerParameterfv(GLuint sampler, GLenum pname, GLfloat * params)} */
    public static native void nglGetSamplerParameterfv(int sampler, int pname, long params);

    /** {@code void glGetSamplerParameterfv(GLuint sampler, GLenum pname, GLfloat * params)} */
    public static void glGetSamplerParameterfv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetSamplerParameterfv(sampler, pname, memAddress(params));
    }

    /** {@code void glGetSamplerParameterfv(GLuint sampler, GLenum pname, GLfloat * params)} */
    @NativeType("void")
    public static float glGetSamplerParameterf(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetSamplerParameterfv(sampler, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glVertexAttribDivisor ] ---

    /** {@code void glVertexAttribDivisor(GLuint index, GLuint divisor)} */
    public static native void glVertexAttribDivisor(@NativeType("GLuint") int index, @NativeType("GLuint") int divisor);

    // --- [ glBindTransformFeedback ] ---

    /** {@code void glBindTransformFeedback(GLenum target, GLuint id)} */
    public static native void glBindTransformFeedback(@NativeType("GLenum") int target, @NativeType("GLuint") int id);

    // --- [ glDeleteTransformFeedbacks ] ---

    /** {@code void glDeleteTransformFeedbacks(GLsizei n, GLuint const * ids)} */
    public static native void nglDeleteTransformFeedbacks(int n, long ids);

    /** {@code void glDeleteTransformFeedbacks(GLsizei n, GLuint const * ids)} */
    public static void glDeleteTransformFeedbacks(@NativeType("GLuint const *") IntBuffer ids) {
        nglDeleteTransformFeedbacks(ids.remaining(), memAddress(ids));
    }

    /** {@code void glDeleteTransformFeedbacks(GLsizei n, GLuint const * ids)} */
    public static void glDeleteTransformFeedbacks(@NativeType("GLuint const *") int id) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer ids = stack.ints(id);
            nglDeleteTransformFeedbacks(1, memAddress(ids));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGenTransformFeedbacks ] ---

    /** {@code void glGenTransformFeedbacks(GLsizei n, GLuint * ids)} */
    public static native void nglGenTransformFeedbacks(int n, long ids);

    /** {@code void glGenTransformFeedbacks(GLsizei n, GLuint * ids)} */
    public static void glGenTransformFeedbacks(@NativeType("GLuint *") IntBuffer ids) {
        nglGenTransformFeedbacks(ids.remaining(), memAddress(ids));
    }

    /** {@code void glGenTransformFeedbacks(GLsizei n, GLuint * ids)} */
    @NativeType("void")
    public static int glGenTransformFeedbacks() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer ids = stack.callocInt(1);
            nglGenTransformFeedbacks(1, memAddress(ids));
            return ids.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glIsTransformFeedback ] ---

    /** {@code GLboolean glIsTransformFeedback(GLuint id)} */
    @NativeType("GLboolean")
    public static native boolean glIsTransformFeedback(@NativeType("GLuint") int id);

    // --- [ glPauseTransformFeedback ] ---

    /** {@code void glPauseTransformFeedback(void)} */
    public static native void glPauseTransformFeedback();

    // --- [ glResumeTransformFeedback ] ---

    /** {@code void glResumeTransformFeedback(void)} */
    public static native void glResumeTransformFeedback();

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

    // --- [ glTexStorage2D ] ---

    /** {@code void glTexStorage2D(GLenum target, GLsizei levels, GLenum internalformat, GLsizei width, GLsizei height)} */
    public static native void glTexStorage2D(@NativeType("GLenum") int target, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

    // --- [ glTexStorage3D ] ---

    /** {@code void glTexStorage3D(GLenum target, GLsizei levels, GLenum internalformat, GLsizei width, GLsizei height, GLsizei depth)} */
    public static native void glTexStorage3D(@NativeType("GLenum") int target, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth);

    // --- [ glGetInternalformativ ] ---

    /** {@code void glGetInternalformativ(GLenum target, GLenum internalformat, GLenum pname, GLsizei bufSize, GLint * params)} */
    public static native void nglGetInternalformativ(int target, int internalformat, int pname, int bufSize, long params);

    /** {@code void glGetInternalformativ(GLenum target, GLenum internalformat, GLenum pname, GLsizei bufSize, GLint * params)} */
    public static void glGetInternalformativ(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        nglGetInternalformativ(target, internalformat, pname, params.remaining(), memAddress(params));
    }

    /** {@code void glGetInternalformativ(GLenum target, GLenum internalformat, GLenum pname, GLsizei bufSize, GLint * params)} */
    @NativeType("void")
    public static int glGetInternalformati(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetInternalformativ(target, internalformat, pname, 1, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glTexImage3D(GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short @Nullable [] pixels) {
        long __functionAddress = GLES.getICD().glTexImage3D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, internalformat, width, height, depth, border, format, type, pixels, __functionAddress);
    }

    /** {@code void glTexImage3D(GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int @Nullable [] pixels) {
        long __functionAddress = GLES.getICD().glTexImage3D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, internalformat, width, height, depth, border, format, type, pixels, __functionAddress);
    }

    /** {@code void glTexImage3D(GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLsizei depth, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float @Nullable [] pixels) {
        long __functionAddress = GLES.getICD().glTexImage3D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, internalformat, width, height, depth, border, format, type, pixels, __functionAddress);
    }

    /** {@code void glTexSubImage3D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexSubImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short[] pixels) {
        long __functionAddress = GLES.getICD().glTexSubImage3D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels, __functionAddress);
    }

    /** {@code void glTexSubImage3D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexSubImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int[] pixels) {
        long __functionAddress = GLES.getICD().glTexSubImage3D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels, __functionAddress);
    }

    /** {@code void glTexSubImage3D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint zoffset, GLsizei width, GLsizei height, GLsizei depth, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexSubImage3D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float[] pixels) {
        long __functionAddress = GLES.getICD().glTexSubImage3D;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels, __functionAddress);
    }

    /** {@code void glGenQueries(GLsizei n, GLuint * ids)} */
    public static void glGenQueries(@NativeType("GLuint *") int[] ids) {
        long __functionAddress = GLES.getICD().glGenQueries;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(ids.length, ids, __functionAddress);
    }

    /** {@code void glDeleteQueries(GLsizei n, GLuint const * ids)} */
    public static void glDeleteQueries(@NativeType("GLuint const *") int[] ids) {
        long __functionAddress = GLES.getICD().glDeleteQueries;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(ids.length, ids, __functionAddress);
    }

    /** {@code void glGetQueryiv(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetQueryiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetQueryiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** {@code void glGetQueryObjectuiv(GLuint id, GLenum pname, GLuint * params)} */
    public static void glGetQueryObjectuiv(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetQueryObjectuiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(id, pname, params, __functionAddress);
    }

    /** {@code void glDrawBuffers(GLsizei n, GLenum const * bufs)} */
    public static void glDrawBuffers(@NativeType("GLenum const *") int[] bufs) {
        long __functionAddress = GLES.getICD().glDrawBuffers;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(bufs.length, bufs, __functionAddress);
    }

    /** {@code void glUniformMatrix2x3fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glUniformMatrix2x3fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glUniformMatrix2x3fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length / 6, transpose, value, __functionAddress);
    }

    /** {@code void glUniformMatrix3x2fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glUniformMatrix3x2fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glUniformMatrix3x2fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length / 6, transpose, value, __functionAddress);
    }

    /** {@code void glUniformMatrix2x4fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glUniformMatrix2x4fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glUniformMatrix2x4fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length >> 3, transpose, value, __functionAddress);
    }

    /** {@code void glUniformMatrix4x2fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glUniformMatrix4x2fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glUniformMatrix4x2fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length >> 3, transpose, value, __functionAddress);
    }

    /** {@code void glUniformMatrix3x4fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glUniformMatrix3x4fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glUniformMatrix3x4fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length / 12, transpose, value, __functionAddress);
    }

    /** {@code void glUniformMatrix4x3fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glUniformMatrix4x3fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glUniformMatrix4x3fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length / 12, transpose, value, __functionAddress);
    }

    /** {@code void glDeleteVertexArrays(GLsizei n, GLuint const * arrays)} */
    public static void glDeleteVertexArrays(@NativeType("GLuint const *") int[] arrays) {
        long __functionAddress = GLES.getICD().glDeleteVertexArrays;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(arrays.length, arrays, __functionAddress);
    }

    /** {@code void glGenVertexArrays(GLsizei n, GLuint * arrays)} */
    public static void glGenVertexArrays(@NativeType("GLuint *") int[] arrays) {
        long __functionAddress = GLES.getICD().glGenVertexArrays;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(arrays.length, arrays, __functionAddress);
    }

    /** {@code void glGetIntegeri_v(GLenum target, GLuint index, GLint * data)} */
    public static void glGetIntegeri_v(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLint *") int[] data) {
        long __functionAddress = GLES.getICD().glGetIntegeri_v;
        if (CHECKS) {
            check(__functionAddress);
            check(data, 1);
        }
        callPV(target, index, data, __functionAddress);
    }

    /** {@code void glGetTransformFeedbackVarying(GLuint program, GLuint index, GLsizei bufSize, GLsizei * length, GLsizei * size, GLenum * type, GLchar * name)} */
    public static void glGetTransformFeedbackVarying(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLsizei *") int[] size, @NativeType("GLenum *") int[] type, @NativeType("GLchar *") ByteBuffer name) {
        long __functionAddress = GLES.getICD().glGetTransformFeedbackVarying;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(length, 1);
            check(size, 1);
            check(type, 1);
        }
        callPPPPV(program, index, name.remaining(), length, size, type, memAddress(name), __functionAddress);
    }

    /** {@code void glGetVertexAttribIiv(GLuint index, GLenum pname, GLint * params)} */
    public static void glGetVertexAttribIiv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetVertexAttribIiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(index, pname, params, __functionAddress);
    }

    /** {@code void glGetVertexAttribIuiv(GLuint index, GLenum pname, GLuint * params)} */
    public static void glGetVertexAttribIuiv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetVertexAttribIuiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(index, pname, params, __functionAddress);
    }

    /** {@code void glVertexAttribI4iv(GLuint index, GLint const * v)} */
    public static void glVertexAttribI4iv(@NativeType("GLuint") int index, @NativeType("GLint const *") int[] v) {
        long __functionAddress = GLES.getICD().glVertexAttribI4iv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttribI4uiv(GLuint index, GLuint const * v)} */
    public static void glVertexAttribI4uiv(@NativeType("GLuint") int index, @NativeType("GLuint const *") int[] v) {
        long __functionAddress = GLES.getICD().glVertexAttribI4uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glGetUniformuiv(GLuint program, GLint location, GLuint * params)} */
    public static void glGetUniformuiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetUniformuiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(program, location, params, __functionAddress);
    }

    /** {@code void glUniform1uiv(GLint location, GLsizei count, GLuint const * value)} */
    public static void glUniform1uiv(@NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GLES.getICD().glUniform1uiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length, value, __functionAddress);
    }

    /** {@code void glUniform2uiv(GLint location, GLsizei count, GLuint const * value)} */
    public static void glUniform2uiv(@NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GLES.getICD().glUniform2uiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length >> 1, value, __functionAddress);
    }

    /** {@code void glUniform3uiv(GLint location, GLsizei count, GLuint const * value)} */
    public static void glUniform3uiv(@NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GLES.getICD().glUniform3uiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length / 3, value, __functionAddress);
    }

    /** {@code void glUniform4uiv(GLint location, GLsizei count, GLuint const * value)} */
    public static void glUniform4uiv(@NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GLES.getICD().glUniform4uiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length >> 2, value, __functionAddress);
    }

    /** {@code void glClearBufferiv(GLenum buffer, GLint drawbuffer, GLint const * value)} */
    public static void glClearBufferiv(@NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLint const *") int[] value) {
        long __functionAddress = GLES.getICD().glClearBufferiv;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        callPV(buffer, drawbuffer, value, __functionAddress);
    }

    /** {@code void glClearBufferuiv(GLenum buffer, GLint drawbuffer, GLuint const * value)} */
    public static void glClearBufferuiv(@NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GLES.getICD().glClearBufferuiv;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        callPV(buffer, drawbuffer, value, __functionAddress);
    }

    /** {@code void glClearBufferfv(GLenum buffer, GLint drawbuffer, GLfloat const * value)} */
    public static void glClearBufferfv(@NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glClearBufferfv;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        callPV(buffer, drawbuffer, value, __functionAddress);
    }

    /** {@code void glGetUniformIndices(GLuint program, GLsizei uniformCount, GLchar const * const * uniformNames, GLuint * uniformIndices)} */
    public static void glGetUniformIndices(@NativeType("GLuint") int program, @NativeType("GLchar const * const *") PointerBuffer uniformNames, @NativeType("GLuint *") int[] uniformIndices) {
        long __functionAddress = GLES.getICD().glGetUniformIndices;
        if (CHECKS) {
            check(__functionAddress);
            check(uniformIndices, uniformNames.remaining());
        }
        callPPV(program, uniformNames.remaining(), memAddress(uniformNames), uniformIndices, __functionAddress);
    }

    /** {@code void glGetActiveUniformsiv(GLuint program, GLsizei uniformCount, GLuint const * uniformIndices, GLenum pname, GLint * params)} */
    public static void glGetActiveUniformsiv(@NativeType("GLuint") int program, @NativeType("GLuint const *") int[] uniformIndices, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetActiveUniformsiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, uniformIndices.length);
        }
        callPPV(program, uniformIndices.length, uniformIndices, pname, params, __functionAddress);
    }

    /** {@code void glGetActiveUniformBlockiv(GLuint program, GLuint uniformBlockIndex, GLenum pname, GLint * params)} */
    public static void glGetActiveUniformBlockiv(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformBlockIndex, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetActiveUniformBlockiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(program, uniformBlockIndex, pname, params, __functionAddress);
    }

    /** {@code void glGetActiveUniformBlockName(GLuint program, GLuint uniformBlockIndex, GLsizei bufSize, GLsizei * length, GLchar * uniformBlockName)} */
    public static void glGetActiveUniformBlockName(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformBlockIndex, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLchar *") ByteBuffer uniformBlockName) {
        long __functionAddress = GLES.getICD().glGetActiveUniformBlockName;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(length, 1);
        }
        callPPV(program, uniformBlockIndex, uniformBlockName.remaining(), length, memAddress(uniformBlockName), __functionAddress);
    }

    /** {@code void glGetInteger64v(GLenum pname, GLint64 * data)} */
    public static void glGetInteger64v(@NativeType("GLenum") int pname, @NativeType("GLint64 *") long[] data) {
        long __functionAddress = GLES.getICD().glGetInteger64v;
        if (CHECKS) {
            check(__functionAddress);
            check(data, 1);
        }
        callPV(pname, data, __functionAddress);
    }

    /** {@code void glGetSynciv(GLsync sync, GLenum pname, GLsizei bufSize, GLsizei * length, GLint * values)} */
    public static void glGetSynciv(@NativeType("GLsync") long sync, @NativeType("GLenum") int pname, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLint *") int[] values) {
        long __functionAddress = GLES.getICD().glGetSynciv;
        if (CHECKS) {
            check(__functionAddress);
            check(sync);
            checkSafe(length, 1);
        }
        callPPPV(sync, pname, values.length, length, values, __functionAddress);
    }

    /** {@code void glGetInteger64i_v(GLenum target, GLuint index, GLint64 * data)} */
    public static void glGetInteger64i_v(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLint64 *") long[] data) {
        long __functionAddress = GLES.getICD().glGetInteger64i_v;
        if (CHECKS) {
            check(__functionAddress);
            check(data, 1);
        }
        callPV(target, index, data, __functionAddress);
    }

    /** {@code void glGetBufferParameteri64v(GLenum target, GLenum pname, GLint64 * params)} */
    public static void glGetBufferParameteri64v(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint64 *") long[] params) {
        long __functionAddress = GLES.getICD().glGetBufferParameteri64v;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** {@code void glGenSamplers(GLsizei count, GLuint * samplers)} */
    public static void glGenSamplers(@NativeType("GLuint *") int[] samplers) {
        long __functionAddress = GLES.getICD().glGenSamplers;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(samplers.length, samplers, __functionAddress);
    }

    /** {@code void glDeleteSamplers(GLsizei count, GLuint const * samplers)} */
    public static void glDeleteSamplers(@NativeType("GLuint const *") int[] samplers) {
        long __functionAddress = GLES.getICD().glDeleteSamplers;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(samplers.length, samplers, __functionAddress);
    }

    /** {@code void glSamplerParameteriv(GLuint sampler, GLenum pname, GLint const * param)} */
    public static void glSamplerParameteriv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] param) {
        long __functionAddress = GLES.getICD().glSamplerParameteriv;
        if (CHECKS) {
            check(__functionAddress);
            check(param, 1);
        }
        callPV(sampler, pname, param, __functionAddress);
    }

    /** {@code void glSamplerParameterfv(GLuint sampler, GLenum pname, GLfloat const * param)} */
    public static void glSamplerParameterfv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") float[] param) {
        long __functionAddress = GLES.getICD().glSamplerParameterfv;
        if (CHECKS) {
            check(__functionAddress);
            check(param, 1);
        }
        callPV(sampler, pname, param, __functionAddress);
    }

    /** {@code void glGetSamplerParameteriv(GLuint sampler, GLenum pname, GLint * params)} */
    public static void glGetSamplerParameteriv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetSamplerParameteriv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(sampler, pname, params, __functionAddress);
    }

    /** {@code void glGetSamplerParameterfv(GLuint sampler, GLenum pname, GLfloat * params)} */
    public static void glGetSamplerParameterfv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GLES.getICD().glGetSamplerParameterfv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(sampler, pname, params, __functionAddress);
    }

    /** {@code void glDeleteTransformFeedbacks(GLsizei n, GLuint const * ids)} */
    public static void glDeleteTransformFeedbacks(@NativeType("GLuint const *") int[] ids) {
        long __functionAddress = GLES.getICD().glDeleteTransformFeedbacks;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(ids.length, ids, __functionAddress);
    }

    /** {@code void glGenTransformFeedbacks(GLsizei n, GLuint * ids)} */
    public static void glGenTransformFeedbacks(@NativeType("GLuint *") int[] ids) {
        long __functionAddress = GLES.getICD().glGenTransformFeedbacks;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(ids.length, ids, __functionAddress);
    }

    /** {@code void glGetProgramBinary(GLuint program, GLsizei bufSize, GLsizei * length, GLenum * binaryFormat, void * binary)} */
    public static void glGetProgramBinary(@NativeType("GLuint") int program, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLenum *") int[] binaryFormat, @NativeType("void *") ByteBuffer binary) {
        long __functionAddress = GLES.getICD().glGetProgramBinary;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(length, 1);
            check(binaryFormat, 1);
        }
        callPPPV(program, binary.remaining(), length, binaryFormat, memAddress(binary), __functionAddress);
    }

    /** {@code void glInvalidateFramebuffer(GLenum target, GLsizei numAttachments, GLenum const * attachments)} */
    public static void glInvalidateFramebuffer(@NativeType("GLenum") int target, @NativeType("GLenum const *") int[] attachments) {
        long __functionAddress = GLES.getICD().glInvalidateFramebuffer;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, attachments.length, attachments, __functionAddress);
    }

    /** {@code void glInvalidateSubFramebuffer(GLenum target, GLsizei numAttachments, GLenum const * attachments, GLint x, GLint y, GLsizei width, GLsizei height)} */
    public static void glInvalidateSubFramebuffer(@NativeType("GLenum") int target, @NativeType("GLenum const *") int[] attachments, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        long __functionAddress = GLES.getICD().glInvalidateSubFramebuffer;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, attachments.length, attachments, x, y, width, height, __functionAddress);
    }

    /** {@code void glGetInternalformativ(GLenum target, GLenum internalformat, GLenum pname, GLsizei bufSize, GLint * params)} */
    public static void glGetInternalformativ(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetInternalformativ;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, internalformat, pname, params.length, params, __functionAddress);
    }

}
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

public class GLES20 {

    static { GLES.initialize(); }

    public static final int
        GL_DEPTH_BUFFER_BIT                             = 0x100,
        GL_STENCIL_BUFFER_BIT                           = 0x400,
        GL_COLOR_BUFFER_BIT                             = 0x4000,
        GL_FALSE                                        = 0,
        GL_TRUE                                         = 1,
        GL_POINTS                                       = 0x0,
        GL_LINES                                        = 0x1,
        GL_LINE_LOOP                                    = 0x2,
        GL_LINE_STRIP                                   = 0x3,
        GL_TRIANGLES                                    = 0x4,
        GL_TRIANGLE_STRIP                               = 0x5,
        GL_TRIANGLE_FAN                                 = 0x6,
        GL_ZERO                                         = 0,
        GL_ONE                                          = 1,
        GL_SRC_COLOR                                    = 0x300,
        GL_ONE_MINUS_SRC_COLOR                          = 0x301,
        GL_SRC_ALPHA                                    = 0x302,
        GL_ONE_MINUS_SRC_ALPHA                          = 0x303,
        GL_DST_ALPHA                                    = 0x304,
        GL_ONE_MINUS_DST_ALPHA                          = 0x305,
        GL_DST_COLOR                                    = 0x306,
        GL_ONE_MINUS_DST_COLOR                          = 0x307,
        GL_SRC_ALPHA_SATURATE                           = 0x308,
        GL_FUNC_ADD                                     = 0x8006,
        GL_BLEND_EQUATION                               = 0x8009,
        GL_BLEND_EQUATION_RGB                           = 0x8009,
        GL_BLEND_EQUATION_ALPHA                         = 0x883D,
        GL_FUNC_SUBTRACT                                = 0x800A,
        GL_FUNC_REVERSE_SUBTRACT                        = 0x800B,
        GL_BLEND_DST_RGB                                = 0x80C8,
        GL_BLEND_SRC_RGB                                = 0x80C9,
        GL_BLEND_DST_ALPHA                              = 0x80CA,
        GL_BLEND_SRC_ALPHA                              = 0x80CB,
        GL_CONSTANT_COLOR                               = 0x8001,
        GL_ONE_MINUS_CONSTANT_COLOR                     = 0x8002,
        GL_CONSTANT_ALPHA                               = 0x8003,
        GL_ONE_MINUS_CONSTANT_ALPHA                     = 0x8004,
        GL_BLEND_COLOR                                  = 0x8005,
        GL_ARRAY_BUFFER                                 = 0x8892,
        GL_ELEMENT_ARRAY_BUFFER                         = 0x8893,
        GL_ARRAY_BUFFER_BINDING                         = 0x8894,
        GL_ELEMENT_ARRAY_BUFFER_BINDING                 = 0x8895,
        GL_STREAM_DRAW                                  = 0x88E0,
        GL_STATIC_DRAW                                  = 0x88E4,
        GL_DYNAMIC_DRAW                                 = 0x88E8,
        GL_BUFFER_SIZE                                  = 0x8764,
        GL_BUFFER_USAGE                                 = 0x8765,
        GL_CURRENT_VERTEX_ATTRIB                        = 0x8626,
        GL_FRONT                                        = 0x404,
        GL_BACK                                         = 0x405,
        GL_FRONT_AND_BACK                               = 0x408,
        GL_TEXTURE_2D                                   = 0xDE1,
        GL_CULL_FACE                                    = 0xB44,
        GL_BLEND                                        = 0xBE2,
        GL_DITHER                                       = 0xBD0,
        GL_STENCIL_TEST                                 = 0xB90,
        GL_DEPTH_TEST                                   = 0xB71,
        GL_SCISSOR_TEST                                 = 0xC11,
        GL_POLYGON_OFFSET_FILL                          = 0x8037,
        GL_SAMPLE_ALPHA_TO_COVERAGE                     = 0x809E,
        GL_SAMPLE_COVERAGE                              = 0x80A0,
        GL_NO_ERROR                                     = 0,
        GL_INVALID_ENUM                                 = 0x500,
        GL_INVALID_VALUE                                = 0x501,
        GL_INVALID_OPERATION                            = 0x502,
        GL_OUT_OF_MEMORY                                = 0x505,
        GL_CW                                           = 0x900,
        GL_CCW                                          = 0x901,
        GL_LINE_WIDTH                                   = 0xB21,
        GL_ALIASED_POINT_SIZE_RANGE                     = 0x846D,
        GL_ALIASED_LINE_WIDTH_RANGE                     = 0x846E,
        GL_CULL_FACE_MODE                               = 0xB45,
        GL_FRONT_FACE                                   = 0xB46,
        GL_DEPTH_RANGE                                  = 0xB70,
        GL_DEPTH_WRITEMASK                              = 0xB72,
        GL_DEPTH_CLEAR_VALUE                            = 0xB73,
        GL_DEPTH_FUNC                                   = 0xB74,
        GL_STENCIL_CLEAR_VALUE                          = 0xB91,
        GL_STENCIL_FUNC                                 = 0xB92,
        GL_STENCIL_FAIL                                 = 0xB94,
        GL_STENCIL_PASS_DEPTH_FAIL                      = 0xB95,
        GL_STENCIL_PASS_DEPTH_PASS                      = 0xB96,
        GL_STENCIL_REF                                  = 0xB97,
        GL_STENCIL_VALUE_MASK                           = 0xB93,
        GL_STENCIL_WRITEMASK                            = 0xB98,
        GL_STENCIL_BACK_FUNC                            = 0x8800,
        GL_STENCIL_BACK_FAIL                            = 0x8801,
        GL_STENCIL_BACK_PASS_DEPTH_FAIL                 = 0x8802,
        GL_STENCIL_BACK_PASS_DEPTH_PASS                 = 0x8803,
        GL_STENCIL_BACK_REF                             = 0x8CA3,
        GL_STENCIL_BACK_VALUE_MASK                      = 0x8CA4,
        GL_STENCIL_BACK_WRITEMASK                       = 0x8CA5,
        GL_VIEWPORT                                     = 0xBA2,
        GL_SCISSOR_BOX                                  = 0xC10,
        GL_COLOR_CLEAR_VALUE                            = 0xC22,
        GL_COLOR_WRITEMASK                              = 0xC23,
        GL_UNPACK_ALIGNMENT                             = 0xCF5,
        GL_PACK_ALIGNMENT                               = 0xD05,
        GL_MAX_TEXTURE_SIZE                             = 0xD33,
        GL_MAX_VIEWPORT_DIMS                            = 0xD3A,
        GL_SUBPIXEL_BITS                                = 0xD50,
        GL_RED_BITS                                     = 0xD52,
        GL_GREEN_BITS                                   = 0xD53,
        GL_BLUE_BITS                                    = 0xD54,
        GL_ALPHA_BITS                                   = 0xD55,
        GL_DEPTH_BITS                                   = 0xD56,
        GL_STENCIL_BITS                                 = 0xD57,
        GL_POLYGON_OFFSET_UNITS                         = 0x2A00,
        GL_POLYGON_OFFSET_FACTOR                        = 0x8038,
        GL_TEXTURE_BINDING_2D                           = 0x8069,
        GL_SAMPLE_BUFFERS                               = 0x80A8,
        GL_SAMPLES                                      = 0x80A9,
        GL_SAMPLE_COVERAGE_VALUE                        = 0x80AA,
        GL_SAMPLE_COVERAGE_INVERT                       = 0x80AB,
        GL_NUM_COMPRESSED_TEXTURE_FORMATS               = 0x86A2,
        GL_COMPRESSED_TEXTURE_FORMATS                   = 0x86A3,
        GL_DONT_CARE                                    = 0x1100,
        GL_FASTEST                                      = 0x1101,
        GL_NICEST                                       = 0x1102,
        GL_GENERATE_MIPMAP_HINT                         = 0x8192,
        GL_BYTE                                         = 0x1400,
        GL_UNSIGNED_BYTE                                = 0x1401,
        GL_SHORT                                        = 0x1402,
        GL_UNSIGNED_SHORT                               = 0x1403,
        GL_INT                                          = 0x1404,
        GL_UNSIGNED_INT                                 = 0x1405,
        GL_FLOAT                                        = 0x1406,
        GL_FIXED                                        = 0x140C,
        GL_DEPTH_COMPONENT                              = 0x1902,
        GL_ALPHA                                        = 0x1906,
        GL_RGB                                          = 0x1907,
        GL_RGBA                                         = 0x1908,
        GL_LUMINANCE                                    = 0x1909,
        GL_LUMINANCE_ALPHA                              = 0x190A,
        GL_UNSIGNED_SHORT_4_4_4_4                       = 0x8033,
        GL_UNSIGNED_SHORT_5_5_5_1                       = 0x8034,
        GL_UNSIGNED_SHORT_5_6_5                         = 0x8363,
        GL_FRAGMENT_SHADER                              = 0x8B30,
        GL_VERTEX_SHADER                                = 0x8B31,
        GL_MAX_VERTEX_ATTRIBS                           = 0x8869,
        GL_MAX_VERTEX_UNIFORM_VECTORS                   = 0x8DFB,
        GL_MAX_VARYING_VECTORS                          = 0x8DFC,
        GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS             = 0x8B4D,
        GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS               = 0x8B4C,
        GL_MAX_TEXTURE_IMAGE_UNITS                      = 0x8872,
        GL_MAX_FRAGMENT_UNIFORM_VECTORS                 = 0x8DFD,
        GL_SHADER_TYPE                                  = 0x8B4F,
        GL_DELETE_STATUS                                = 0x8B80,
        GL_LINK_STATUS                                  = 0x8B82,
        GL_VALIDATE_STATUS                              = 0x8B83,
        GL_ATTACHED_SHADERS                             = 0x8B85,
        GL_ACTIVE_UNIFORMS                              = 0x8B86,
        GL_ACTIVE_UNIFORM_MAX_LENGTH                    = 0x8B87,
        GL_ACTIVE_ATTRIBUTES                            = 0x8B89,
        GL_ACTIVE_ATTRIBUTE_MAX_LENGTH                  = 0x8B8A,
        GL_SHADING_LANGUAGE_VERSION                     = 0x8B8C,
        GL_CURRENT_PROGRAM                              = 0x8B8D,
        GL_NEVER                                        = 0x200,
        GL_LESS                                         = 0x201,
        GL_EQUAL                                        = 0x202,
        GL_LEQUAL                                       = 0x203,
        GL_GREATER                                      = 0x204,
        GL_NOTEQUAL                                     = 0x205,
        GL_GEQUAL                                       = 0x206,
        GL_ALWAYS                                       = 0x207,
        GL_KEEP                                         = 0x1E00,
        GL_REPLACE                                      = 0x1E01,
        GL_INCR                                         = 0x1E02,
        GL_DECR                                         = 0x1E03,
        GL_INVERT                                       = 0x150A,
        GL_INCR_WRAP                                    = 0x8507,
        GL_DECR_WRAP                                    = 0x8508,
        GL_VENDOR                                       = 0x1F00,
        GL_RENDERER                                     = 0x1F01,
        GL_VERSION                                      = 0x1F02,
        GL_EXTENSIONS                                   = 0x1F03,
        GL_NEAREST                                      = 0x2600,
        GL_LINEAR                                       = 0x2601,
        GL_NEAREST_MIPMAP_NEAREST                       = 0x2700,
        GL_LINEAR_MIPMAP_NEAREST                        = 0x2701,
        GL_NEAREST_MIPMAP_LINEAR                        = 0x2702,
        GL_LINEAR_MIPMAP_LINEAR                         = 0x2703,
        GL_TEXTURE_MAG_FILTER                           = 0x2800,
        GL_TEXTURE_MIN_FILTER                           = 0x2801,
        GL_TEXTURE_WRAP_S                               = 0x2802,
        GL_TEXTURE_WRAP_T                               = 0x2803,
        GL_TEXTURE                                      = 0x1702,
        GL_TEXTURE_CUBE_MAP                             = 0x8513,
        GL_TEXTURE_BINDING_CUBE_MAP                     = 0x8514,
        GL_TEXTURE_CUBE_MAP_POSITIVE_X                  = 0x8515,
        GL_TEXTURE_CUBE_MAP_NEGATIVE_X                  = 0x8516,
        GL_TEXTURE_CUBE_MAP_POSITIVE_Y                  = 0x8517,
        GL_TEXTURE_CUBE_MAP_NEGATIVE_Y                  = 0x8518,
        GL_TEXTURE_CUBE_MAP_POSITIVE_Z                  = 0x8519,
        GL_TEXTURE_CUBE_MAP_NEGATIVE_Z                  = 0x851A,
        GL_MAX_CUBE_MAP_TEXTURE_SIZE                    = 0x851C,
        GL_TEXTURE0                                     = 0x84C0,
        GL_TEXTURE1                                     = 0x84C1,
        GL_TEXTURE2                                     = 0x84C2,
        GL_TEXTURE3                                     = 0x84C3,
        GL_TEXTURE4                                     = 0x84C4,
        GL_TEXTURE5                                     = 0x84C5,
        GL_TEXTURE6                                     = 0x84C6,
        GL_TEXTURE7                                     = 0x84C7,
        GL_TEXTURE8                                     = 0x84C8,
        GL_TEXTURE9                                     = 0x84C9,
        GL_TEXTURE10                                    = 0x84CA,
        GL_TEXTURE11                                    = 0x84CB,
        GL_TEXTURE12                                    = 0x84CC,
        GL_TEXTURE13                                    = 0x84CD,
        GL_TEXTURE14                                    = 0x84CE,
        GL_TEXTURE15                                    = 0x84CF,
        GL_TEXTURE16                                    = 0x84D0,
        GL_TEXTURE17                                    = 0x84D1,
        GL_TEXTURE18                                    = 0x84D2,
        GL_TEXTURE19                                    = 0x84D3,
        GL_TEXTURE20                                    = 0x84D4,
        GL_TEXTURE21                                    = 0x84D5,
        GL_TEXTURE22                                    = 0x84D6,
        GL_TEXTURE23                                    = 0x84D7,
        GL_TEXTURE24                                    = 0x84D8,
        GL_TEXTURE25                                    = 0x84D9,
        GL_TEXTURE26                                    = 0x84DA,
        GL_TEXTURE27                                    = 0x84DB,
        GL_TEXTURE28                                    = 0x84DC,
        GL_TEXTURE29                                    = 0x84DD,
        GL_TEXTURE30                                    = 0x84DE,
        GL_TEXTURE31                                    = 0x84DF,
        GL_ACTIVE_TEXTURE                               = 0x84E0,
        GL_REPEAT                                       = 0x2901,
        GL_CLAMP_TO_EDGE                                = 0x812F,
        GL_MIRRORED_REPEAT                              = 0x8370,
        GL_FLOAT_VEC2                                   = 0x8B50,
        GL_FLOAT_VEC3                                   = 0x8B51,
        GL_FLOAT_VEC4                                   = 0x8B52,
        GL_INT_VEC2                                     = 0x8B53,
        GL_INT_VEC3                                     = 0x8B54,
        GL_INT_VEC4                                     = 0x8B55,
        GL_BOOL                                         = 0x8B56,
        GL_BOOL_VEC2                                    = 0x8B57,
        GL_BOOL_VEC3                                    = 0x8B58,
        GL_BOOL_VEC4                                    = 0x8B59,
        GL_FLOAT_MAT2                                   = 0x8B5A,
        GL_FLOAT_MAT3                                   = 0x8B5B,
        GL_FLOAT_MAT4                                   = 0x8B5C,
        GL_SAMPLER_2D                                   = 0x8B5E,
        GL_SAMPLER_CUBE                                 = 0x8B60,
        GL_VERTEX_ATTRIB_ARRAY_ENABLED                  = 0x8622,
        GL_VERTEX_ATTRIB_ARRAY_SIZE                     = 0x8623,
        GL_VERTEX_ATTRIB_ARRAY_STRIDE                   = 0x8624,
        GL_VERTEX_ATTRIB_ARRAY_TYPE                     = 0x8625,
        GL_VERTEX_ATTRIB_ARRAY_NORMALIZED               = 0x886A,
        GL_VERTEX_ATTRIB_ARRAY_POINTER                  = 0x8645,
        GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING           = 0x889F,
        GL_IMPLEMENTATION_COLOR_READ_TYPE               = 0x8B9A,
        GL_IMPLEMENTATION_COLOR_READ_FORMAT             = 0x8B9B,
        GL_COMPILE_STATUS                               = 0x8B81,
        GL_INFO_LOG_LENGTH                              = 0x8B84,
        GL_SHADER_SOURCE_LENGTH                         = 0x8B88,
        GL_SHADER_COMPILER                              = 0x8DFA,
        GL_SHADER_BINARY_FORMATS                        = 0x8DF8,
        GL_NUM_SHADER_BINARY_FORMATS                    = 0x8DF9,
        GL_LOW_FLOAT                                    = 0x8DF0,
        GL_MEDIUM_FLOAT                                 = 0x8DF1,
        GL_HIGH_FLOAT                                   = 0x8DF2,
        GL_LOW_INT                                      = 0x8DF3,
        GL_MEDIUM_INT                                   = 0x8DF4,
        GL_HIGH_INT                                     = 0x8DF5,
        GL_FRAMEBUFFER                                  = 0x8D40,
        GL_RENDERBUFFER                                 = 0x8D41,
        GL_RGBA4                                        = 0x8056,
        GL_RGB5_A1                                      = 0x8057,
        GL_RGB565                                       = 0x8D62,
        GL_DEPTH_COMPONENT16                            = 0x81A5,
        GL_STENCIL_INDEX8                               = 0x8D48,
        GL_RENDERBUFFER_WIDTH                           = 0x8D42,
        GL_RENDERBUFFER_HEIGHT                          = 0x8D43,
        GL_RENDERBUFFER_INTERNAL_FORMAT                 = 0x8D44,
        GL_RENDERBUFFER_RED_SIZE                        = 0x8D50,
        GL_RENDERBUFFER_GREEN_SIZE                      = 0x8D51,
        GL_RENDERBUFFER_BLUE_SIZE                       = 0x8D52,
        GL_RENDERBUFFER_ALPHA_SIZE                      = 0x8D53,
        GL_RENDERBUFFER_DEPTH_SIZE                      = 0x8D54,
        GL_RENDERBUFFER_STENCIL_SIZE                    = 0x8D55,
        GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE           = 0x8CD0,
        GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME           = 0x8CD1,
        GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL         = 0x8CD2,
        GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE = 0x8CD3,
        GL_COLOR_ATTACHMENT0                            = 0x8CE0,
        GL_DEPTH_ATTACHMENT                             = 0x8D00,
        GL_STENCIL_ATTACHMENT                           = 0x8D20,
        GL_NONE                                         = 0,
        GL_FRAMEBUFFER_COMPLETE                         = 0x8CD5,
        GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT            = 0x8CD6,
        GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT    = 0x8CD7,
        GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS            = 0x8CD9,
        GL_FRAMEBUFFER_UNSUPPORTED                      = 0x8CDD,
        GL_FRAMEBUFFER_BINDING                          = 0x8CA6,
        GL_RENDERBUFFER_BINDING                         = 0x8CA7,
        GL_MAX_RENDERBUFFER_SIZE                        = 0x84E8,
        GL_INVALID_FRAMEBUFFER_OPERATION                = 0x506;

    protected GLES20() {
        throw new UnsupportedOperationException();
    }

    // --- [ glActiveTexture ] ---

    /** {@code void glActiveTexture(GLenum texture)} */
    public static native void glActiveTexture(@NativeType("GLenum") int texture);

    // --- [ glAttachShader ] ---

    /** {@code void glAttachShader(GLuint program, GLuint shader)} */
    public static native void glAttachShader(@NativeType("GLuint") int program, @NativeType("GLuint") int shader);

    // --- [ glBindAttribLocation ] ---

    /** {@code void glBindAttribLocation(GLuint program, GLuint index, GLchar const * name)} */
    public static native void nglBindAttribLocation(int program, int index, long name);

    /** {@code void glBindAttribLocation(GLuint program, GLuint index, GLchar const * name)} */
    public static void glBindAttribLocation(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLchar const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        nglBindAttribLocation(program, index, memAddress(name));
    }

    /** {@code void glBindAttribLocation(GLuint program, GLuint index, GLchar const * name)} */
    public static void glBindAttribLocation(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLchar const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            nglBindAttribLocation(program, index, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glBindBuffer ] ---

    /** {@code void glBindBuffer(GLenum target, GLuint buffer)} */
    public static native void glBindBuffer(@NativeType("GLenum") int target, @NativeType("GLuint") int buffer);

    // --- [ glBindFramebuffer ] ---

    /** {@code void glBindFramebuffer(GLenum target, GLuint framebuffer)} */
    public static native void glBindFramebuffer(@NativeType("GLenum") int target, @NativeType("GLuint") int framebuffer);

    // --- [ glBindRenderbuffer ] ---

    /** {@code void glBindRenderbuffer(GLenum target, GLuint renderbuffer)} */
    public static native void glBindRenderbuffer(@NativeType("GLenum") int target, @NativeType("GLuint") int renderbuffer);

    // --- [ glBindTexture ] ---

    /** {@code void glBindTexture(GLenum target, GLuint texture)} */
    public static native void glBindTexture(@NativeType("GLenum") int target, @NativeType("GLuint") int texture);

    // --- [ glBlendColor ] ---

    /** {@code void glBlendColor(GLfloat red, GLfloat green, GLfloat blue, GLfloat alpha)} */
    public static native void glBlendColor(@NativeType("GLfloat") float red, @NativeType("GLfloat") float green, @NativeType("GLfloat") float blue, @NativeType("GLfloat") float alpha);

    // --- [ glBlendEquation ] ---

    /** {@code void glBlendEquation(GLenum mode)} */
    public static native void glBlendEquation(@NativeType("GLenum") int mode);

    // --- [ glBlendEquationSeparate ] ---

    /** {@code void glBlendEquationSeparate(GLenum modeRGB, GLenum modeAlpha)} */
    public static native void glBlendEquationSeparate(@NativeType("GLenum") int modeRGB, @NativeType("GLenum") int modeAlpha);

    // --- [ glBlendFunc ] ---

    /** {@code void glBlendFunc(GLenum sfactor, GLenum dfactor)} */
    public static native void glBlendFunc(@NativeType("GLenum") int sfactor, @NativeType("GLenum") int dfactor);

    // --- [ glBlendFuncSeparate ] ---

    /** {@code void glBlendFuncSeparate(GLenum sfactorRGB, GLenum dfactorRGB, GLenum sfactorAlpha, GLenum dfactorAlpha)} */
    public static native void glBlendFuncSeparate(@NativeType("GLenum") int sfactorRGB, @NativeType("GLenum") int dfactorRGB, @NativeType("GLenum") int sfactorAlpha, @NativeType("GLenum") int dfactorAlpha);

    // --- [ glBufferData ] ---

    /** {@code void glBufferData(GLenum target, GLsizeiptr size, void const * data, GLenum usage)} */
    public static native void nglBufferData(int target, long size, long data, int usage);

    /** {@code void glBufferData(GLenum target, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glBufferData(@NativeType("GLenum") int target, @NativeType("GLsizeiptr") long size, @NativeType("GLenum") int usage) {
        nglBufferData(target, size, NULL, usage);
    }

    /** {@code void glBufferData(GLenum target, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glBufferData(@NativeType("GLenum") int target, @NativeType("void const *") ByteBuffer data, @NativeType("GLenum") int usage) {
        nglBufferData(target, data.remaining(), memAddress(data), usage);
    }

    /** {@code void glBufferData(GLenum target, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glBufferData(@NativeType("GLenum") int target, @NativeType("void const *") ShortBuffer data, @NativeType("GLenum") int usage) {
        nglBufferData(target, Integer.toUnsignedLong(data.remaining()) << 1, memAddress(data), usage);
    }

    /** {@code void glBufferData(GLenum target, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glBufferData(@NativeType("GLenum") int target, @NativeType("void const *") IntBuffer data, @NativeType("GLenum") int usage) {
        nglBufferData(target, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data), usage);
    }

    /** {@code void glBufferData(GLenum target, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glBufferData(@NativeType("GLenum") int target, @NativeType("void const *") FloatBuffer data, @NativeType("GLenum") int usage) {
        nglBufferData(target, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data), usage);
    }

    // --- [ glBufferSubData ] ---

    /** {@code void glBufferSubData(GLenum target, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static native void nglBufferSubData(int target, long offset, long size, long data);

    /** {@code void glBufferSubData(GLenum target, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void const *") ByteBuffer data) {
        nglBufferSubData(target, offset, data.remaining(), memAddress(data));
    }

    /** {@code void glBufferSubData(GLenum target, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void const *") ShortBuffer data) {
        nglBufferSubData(target, offset, Integer.toUnsignedLong(data.remaining()) << 1, memAddress(data));
    }

    /** {@code void glBufferSubData(GLenum target, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void const *") IntBuffer data) {
        nglBufferSubData(target, offset, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data));
    }

    /** {@code void glBufferSubData(GLenum target, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void const *") FloatBuffer data) {
        nglBufferSubData(target, offset, Integer.toUnsignedLong(data.remaining()) << 2, memAddress(data));
    }

    // --- [ glCheckFramebufferStatus ] ---

    /** {@code GLenum glCheckFramebufferStatus(GLenum target)} */
    @NativeType("GLenum")
    public static native int glCheckFramebufferStatus(@NativeType("GLenum") int target);

    // --- [ glClear ] ---

    /** {@code void glClear(GLbitfield mask)} */
    public static native void glClear(@NativeType("GLbitfield") int mask);

    // --- [ glClearColor ] ---

    /** {@code void glClearColor(GLfloat red, GLfloat green, GLfloat blue, GLfloat alpha)} */
    public static native void glClearColor(@NativeType("GLfloat") float red, @NativeType("GLfloat") float green, @NativeType("GLfloat") float blue, @NativeType("GLfloat") float alpha);

    // --- [ glClearDepthf ] ---

    /** {@code void glClearDepthf(GLfloat d)} */
    public static native void glClearDepthf(@NativeType("GLfloat") float d);

    // --- [ glClearStencil ] ---

    /** {@code void glClearStencil(GLint s)} */
    public static native void glClearStencil(@NativeType("GLint") int s);

    // --- [ glColorMask ] ---

    /** {@code void glColorMask(GLboolean red, GLboolean green, GLboolean blue, GLboolean alpha)} */
    public static native void glColorMask(@NativeType("GLboolean") boolean red, @NativeType("GLboolean") boolean green, @NativeType("GLboolean") boolean blue, @NativeType("GLboolean") boolean alpha);

    // --- [ glCompileShader ] ---

    /** {@code void glCompileShader(GLuint shader)} */
    public static native void glCompileShader(@NativeType("GLuint") int shader);

    // --- [ glCompressedTexImage2D ] ---

    /** {@code void glCompressedTexImage2D(GLenum target, GLint level, GLenum internalformat, GLsizei width, GLsizei height, GLint border, GLsizei imageSize, void const * data)} */
    public static native void nglCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, int imageSize, long data);

    /** {@code void glCompressedTexImage2D(GLenum target, GLint level, GLenum internalformat, GLsizei width, GLsizei height, GLint border, GLsizei imageSize, void const * data)} */
    public static void glCompressedTexImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        nglCompressedTexImage2D(target, level, internalformat, width, height, border, imageSize, data);
    }

    /** {@code void glCompressedTexImage2D(GLenum target, GLint level, GLenum internalformat, GLsizei width, GLsizei height, GLint border, GLsizei imageSize, void const * data)} */
    public static void glCompressedTexImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("void const *") @Nullable ByteBuffer data) {
        nglCompressedTexImage2D(target, level, internalformat, width, height, border, remainingSafe(data), memAddressSafe(data));
    }

    // --- [ glCompressedTexSubImage2D ] ---

    /** {@code void glCompressedTexSubImage2D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLsizei imageSize, void const * data)} */
    public static native void nglCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, long data);

    /** {@code void glCompressedTexSubImage2D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLsizei imageSize, void const * data)} */
    public static void glCompressedTexSubImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        nglCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, imageSize, data);
    }

    /** {@code void glCompressedTexSubImage2D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLsizei imageSize, void const * data)} */
    public static void glCompressedTexSubImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("void const *") ByteBuffer data) {
        nglCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, data.remaining(), memAddress(data));
    }

    // --- [ glCopyTexImage2D ] ---

    /** {@code void glCopyTexImage2D(GLenum target, GLint level, GLenum internalformat, GLint x, GLint y, GLsizei width, GLsizei height, GLint border)} */
    public static native void glCopyTexImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border);

    // --- [ glCopyTexSubImage2D ] ---

    /** {@code void glCopyTexSubImage2D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLint x, GLint y, GLsizei width, GLsizei height)} */
    public static native void glCopyTexSubImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

    // --- [ glCreateProgram ] ---

    /** {@code GLuint glCreateProgram(void)} */
    @NativeType("GLuint")
    public static native int glCreateProgram();

    // --- [ glCreateShader ] ---

    /** {@code GLuint glCreateShader(GLenum type)} */
    @NativeType("GLuint")
    public static native int glCreateShader(@NativeType("GLenum") int type);

    // --- [ glCullFace ] ---

    /** {@code void glCullFace(GLenum mode)} */
    public static native void glCullFace(@NativeType("GLenum") int mode);

    // --- [ glDeleteBuffers ] ---

    /** {@code void glDeleteBuffers(GLsizei n, GLuint const * buffers)} */
    public static native void nglDeleteBuffers(int n, long buffers);

    /** {@code void glDeleteBuffers(GLsizei n, GLuint const * buffers)} */
    public static void glDeleteBuffers(@NativeType("GLuint const *") IntBuffer buffers) {
        nglDeleteBuffers(buffers.remaining(), memAddress(buffers));
    }

    /** {@code void glDeleteBuffers(GLsizei n, GLuint const * buffers)} */
    public static void glDeleteBuffers(@NativeType("GLuint const *") int buffer) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer buffers = stack.ints(buffer);
            nglDeleteBuffers(1, memAddress(buffers));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glDeleteFramebuffers ] ---

    /** {@code void glDeleteFramebuffers(GLsizei n, GLuint const * framebuffers)} */
    public static native void nglDeleteFramebuffers(int n, long framebuffers);

    /** {@code void glDeleteFramebuffers(GLsizei n, GLuint const * framebuffers)} */
    public static void glDeleteFramebuffers(@NativeType("GLuint const *") IntBuffer framebuffers) {
        nglDeleteFramebuffers(framebuffers.remaining(), memAddress(framebuffers));
    }

    /** {@code void glDeleteFramebuffers(GLsizei n, GLuint const * framebuffers)} */
    public static void glDeleteFramebuffers(@NativeType("GLuint const *") int framebuffer) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer framebuffers = stack.ints(framebuffer);
            nglDeleteFramebuffers(1, memAddress(framebuffers));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glDeleteProgram ] ---

    /** {@code void glDeleteProgram(GLuint program)} */
    public static native void glDeleteProgram(@NativeType("GLuint") int program);

    // --- [ glDeleteRenderbuffers ] ---

    /** {@code void glDeleteRenderbuffers(GLsizei n, GLuint const * renderbuffers)} */
    public static native void nglDeleteRenderbuffers(int n, long renderbuffers);

    /** {@code void glDeleteRenderbuffers(GLsizei n, GLuint const * renderbuffers)} */
    public static void glDeleteRenderbuffers(@NativeType("GLuint const *") IntBuffer renderbuffers) {
        nglDeleteRenderbuffers(renderbuffers.remaining(), memAddress(renderbuffers));
    }

    /** {@code void glDeleteRenderbuffers(GLsizei n, GLuint const * renderbuffers)} */
    public static void glDeleteRenderbuffers(@NativeType("GLuint const *") int renderbuffer) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer renderbuffers = stack.ints(renderbuffer);
            nglDeleteRenderbuffers(1, memAddress(renderbuffers));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glDeleteShader ] ---

    /** {@code void glDeleteShader(GLuint shader)} */
    public static native void glDeleteShader(@NativeType("GLuint") int shader);

    // --- [ glDeleteTextures ] ---

    /** {@code void glDeleteTextures(GLsizei n, GLuint const * textures)} */
    public static native void nglDeleteTextures(int n, long textures);

    /** {@code void glDeleteTextures(GLsizei n, GLuint const * textures)} */
    public static void glDeleteTextures(@NativeType("GLuint const *") IntBuffer textures) {
        nglDeleteTextures(textures.remaining(), memAddress(textures));
    }

    /** {@code void glDeleteTextures(GLsizei n, GLuint const * textures)} */
    public static void glDeleteTextures(@NativeType("GLuint const *") int texture) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer textures = stack.ints(texture);
            nglDeleteTextures(1, memAddress(textures));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glDepthFunc ] ---

    /** {@code void glDepthFunc(GLenum func)} */
    public static native void glDepthFunc(@NativeType("GLenum") int func);

    // --- [ glDepthMask ] ---

    /** {@code void glDepthMask(GLboolean flag)} */
    public static native void glDepthMask(@NativeType("GLboolean") boolean flag);

    // --- [ glDepthRangef ] ---

    /** {@code void glDepthRangef(GLfloat n, GLfloat f)} */
    public static native void glDepthRangef(@NativeType("GLfloat") float n, @NativeType("GLfloat") float f);

    // --- [ glDetachShader ] ---

    /** {@code void glDetachShader(GLuint program, GLuint shader)} */
    public static native void glDetachShader(@NativeType("GLuint") int program, @NativeType("GLuint") int shader);

    // --- [ glDisable ] ---

    /** {@code void glDisable(GLenum cap)} */
    public static native void glDisable(@NativeType("GLenum") int cap);

    // --- [ glDisableVertexAttribArray ] ---

    /** {@code void glDisableVertexAttribArray(GLuint index)} */
    public static native void glDisableVertexAttribArray(@NativeType("GLuint") int index);

    // --- [ glDrawArrays ] ---

    /** {@code void glDrawArrays(GLenum mode, GLint first, GLsizei count)} */
    public static native void glDrawArrays(@NativeType("GLenum") int mode, @NativeType("GLint") int first, @NativeType("GLsizei") int count);

    // --- [ glDrawElements ] ---

    /** {@code void glDrawElements(GLenum mode, GLsizei count, GLenum type, void const * indices)} */
    public static native void nglDrawElements(int mode, int count, int type, long indices);

    /** {@code void glDrawElements(GLenum mode, GLsizei count, GLenum type, void const * indices)} */
    public static void glDrawElements(@NativeType("GLenum") int mode, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices) {
        nglDrawElements(mode, count, type, indices);
    }

    /** {@code void glDrawElements(GLenum mode, GLsizei count, GLenum type, void const * indices)} */
    public static void glDrawElements(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices) {
        nglDrawElements(mode, indices.remaining() >> GLESChecks.typeToByteShift(type), type, memAddress(indices));
    }

    /** {@code void glDrawElements(GLenum mode, GLsizei count, GLenum type, void const * indices)} */
    public static void glDrawElements(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indices) {
        nglDrawElements(mode, indices.remaining(), GLES20.GL_UNSIGNED_BYTE, memAddress(indices));
    }

    /** {@code void glDrawElements(GLenum mode, GLsizei count, GLenum type, void const * indices)} */
    public static void glDrawElements(@NativeType("GLenum") int mode, @NativeType("void const *") ShortBuffer indices) {
        nglDrawElements(mode, indices.remaining(), GLES20.GL_UNSIGNED_SHORT, memAddress(indices));
    }

    /** {@code void glDrawElements(GLenum mode, GLsizei count, GLenum type, void const * indices)} */
    public static void glDrawElements(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indices) {
        nglDrawElements(mode, indices.remaining(), GLES20.GL_UNSIGNED_INT, memAddress(indices));
    }

    // --- [ glEnable ] ---

    /** {@code void glEnable(GLenum cap)} */
    public static native void glEnable(@NativeType("GLenum") int cap);

    // --- [ glEnableVertexAttribArray ] ---

    /** {@code void glEnableVertexAttribArray(GLuint index)} */
    public static native void glEnableVertexAttribArray(@NativeType("GLuint") int index);

    // --- [ glFinish ] ---

    /** {@code void glFinish(void)} */
    public static native void glFinish();

    // --- [ glFlush ] ---

    /** {@code void glFlush(void)} */
    public static native void glFlush();

    // --- [ glFramebufferRenderbuffer ] ---

    /** {@code void glFramebufferRenderbuffer(GLenum target, GLenum attachment, GLenum renderbuffertarget, GLuint renderbuffer)} */
    public static native void glFramebufferRenderbuffer(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int renderbuffertarget, @NativeType("GLuint") int renderbuffer);

    // --- [ glFramebufferTexture2D ] ---

    /** {@code void glFramebufferTexture2D(GLenum target, GLenum attachment, GLenum textarget, GLuint texture, GLint level)} */
    public static native void glFramebufferTexture2D(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int textarget, @NativeType("GLuint") int texture, @NativeType("GLint") int level);

    // --- [ glFrontFace ] ---

    /** {@code void glFrontFace(GLenum mode)} */
    public static native void glFrontFace(@NativeType("GLenum") int mode);

    // --- [ glGenBuffers ] ---

    /** {@code void glGenBuffers(GLsizei n, GLuint * buffers)} */
    public static native void nglGenBuffers(int n, long buffers);

    /** {@code void glGenBuffers(GLsizei n, GLuint * buffers)} */
    public static void glGenBuffers(@NativeType("GLuint *") IntBuffer buffers) {
        nglGenBuffers(buffers.remaining(), memAddress(buffers));
    }

    /** {@code void glGenBuffers(GLsizei n, GLuint * buffers)} */
    @NativeType("void")
    public static int glGenBuffers() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer buffers = stack.callocInt(1);
            nglGenBuffers(1, memAddress(buffers));
            return buffers.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGenerateMipmap ] ---

    /** {@code void glGenerateMipmap(GLenum target)} */
    public static native void glGenerateMipmap(@NativeType("GLenum") int target);

    // --- [ glGenFramebuffers ] ---

    /** {@code void glGenFramebuffers(GLsizei n, GLuint * framebuffers)} */
    public static native void nglGenFramebuffers(int n, long framebuffers);

    /** {@code void glGenFramebuffers(GLsizei n, GLuint * framebuffers)} */
    public static void glGenFramebuffers(@NativeType("GLuint *") IntBuffer framebuffers) {
        nglGenFramebuffers(framebuffers.remaining(), memAddress(framebuffers));
    }

    /** {@code void glGenFramebuffers(GLsizei n, GLuint * framebuffers)} */
    @NativeType("void")
    public static int glGenFramebuffers() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer framebuffers = stack.callocInt(1);
            nglGenFramebuffers(1, memAddress(framebuffers));
            return framebuffers.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGenRenderbuffers ] ---

    /** {@code void glGenRenderbuffers(GLsizei n, GLuint * renderbuffers)} */
    public static native void nglGenRenderbuffers(int n, long renderbuffers);

    /** {@code void glGenRenderbuffers(GLsizei n, GLuint * renderbuffers)} */
    public static void glGenRenderbuffers(@NativeType("GLuint *") IntBuffer renderbuffers) {
        nglGenRenderbuffers(renderbuffers.remaining(), memAddress(renderbuffers));
    }

    /** {@code void glGenRenderbuffers(GLsizei n, GLuint * renderbuffers)} */
    @NativeType("void")
    public static int glGenRenderbuffers() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer renderbuffers = stack.callocInt(1);
            nglGenRenderbuffers(1, memAddress(renderbuffers));
            return renderbuffers.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGenTextures ] ---

    /** {@code void glGenTextures(GLsizei n, GLuint * textures)} */
    public static native void nglGenTextures(int n, long textures);

    /** {@code void glGenTextures(GLsizei n, GLuint * textures)} */
    public static void glGenTextures(@NativeType("GLuint *") IntBuffer textures) {
        nglGenTextures(textures.remaining(), memAddress(textures));
    }

    /** {@code void glGenTextures(GLsizei n, GLuint * textures)} */
    @NativeType("void")
    public static int glGenTextures() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer textures = stack.callocInt(1);
            nglGenTextures(1, memAddress(textures));
            return textures.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetActiveAttrib ] ---

    /** {@code void glGetActiveAttrib(GLuint program, GLuint index, GLsizei bufSize, GLsizei * length, GLint * size, GLenum * type, GLchar * name)} */
    public static native void nglGetActiveAttrib(int program, int index, int bufSize, long length, long size, long type, long name);

    /** {@code void glGetActiveAttrib(GLuint program, GLuint index, GLsizei bufSize, GLsizei * length, GLint * size, GLenum * type, GLchar * name)} */
    public static void glGetActiveAttrib(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLint *") IntBuffer size, @NativeType("GLenum *") IntBuffer type, @NativeType("GLchar *") ByteBuffer name) {
        if (CHECKS) {
            checkSafe(length, 1);
            check(size, 1);
            check(type, 1);
        }
        nglGetActiveAttrib(program, index, name.remaining(), memAddressSafe(length), memAddress(size), memAddress(type), memAddress(name));
    }

    /** {@code void glGetActiveAttrib(GLuint program, GLuint index, GLsizei bufSize, GLsizei * length, GLint * size, GLenum * type, GLchar * name)} */
    @NativeType("void")
    public static String glGetActiveAttrib(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLsizei") int bufSize, @NativeType("GLint *") IntBuffer size, @NativeType("GLenum *") IntBuffer type) {
        if (CHECKS) {
            check(size, 1);
            check(type, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer length = stack.ints(0);
            ByteBuffer name = stack.malloc(bufSize);
            nglGetActiveAttrib(program, index, bufSize, memAddress(length), memAddress(size), memAddress(type), memAddress(name));
            return memASCII(name, length.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glGetActiveAttrib(GLuint program, GLuint index, GLsizei bufSize, GLsizei * length, GLint * size, GLenum * type, GLchar * name)} */
    @NativeType("void")
    public static String glGetActiveAttrib(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLint *") IntBuffer size, @NativeType("GLenum *") IntBuffer type) {
        return glGetActiveAttrib(program, index, glGetProgrami(program, GL_ACTIVE_ATTRIBUTE_MAX_LENGTH), size, type);
    }

    // --- [ glGetActiveUniform ] ---

    /** {@code void glGetActiveUniform(GLuint program, GLuint index, GLsizei bufSize, GLsizei * length, GLint * size, GLenum * type, GLchar * name)} */
    public static native void nglGetActiveUniform(int program, int index, int bufSize, long length, long size, long type, long name);

    /** {@code void glGetActiveUniform(GLuint program, GLuint index, GLsizei bufSize, GLsizei * length, GLint * size, GLenum * type, GLchar * name)} */
    public static void glGetActiveUniform(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLint *") IntBuffer size, @NativeType("GLenum *") IntBuffer type, @NativeType("GLchar *") ByteBuffer name) {
        if (CHECKS) {
            checkSafe(length, 1);
            check(size, 1);
            check(type, 1);
        }
        nglGetActiveUniform(program, index, name.remaining(), memAddressSafe(length), memAddress(size), memAddress(type), memAddress(name));
    }

    /** {@code void glGetActiveUniform(GLuint program, GLuint index, GLsizei bufSize, GLsizei * length, GLint * size, GLenum * type, GLchar * name)} */
    @NativeType("void")
    public static String glGetActiveUniform(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLsizei") int bufSize, @NativeType("GLint *") IntBuffer size, @NativeType("GLenum *") IntBuffer type) {
        if (CHECKS) {
            check(size, 1);
            check(type, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer length = stack.ints(0);
            ByteBuffer name = stack.malloc(bufSize);
            nglGetActiveUniform(program, index, bufSize, memAddress(length), memAddress(size), memAddress(type), memAddress(name));
            return memASCII(name, length.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glGetActiveUniform(GLuint program, GLuint index, GLsizei bufSize, GLsizei * length, GLint * size, GLenum * type, GLchar * name)} */
    @NativeType("void")
    public static String glGetActiveUniform(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLint *") IntBuffer size, @NativeType("GLenum *") IntBuffer type) {
        return glGetActiveUniform(program, index, glGetProgrami(program, GL_ACTIVE_UNIFORM_MAX_LENGTH), size, type);
    }

    // --- [ glGetAttachedShaders ] ---

    /** {@code void glGetAttachedShaders(GLuint program, GLsizei maxCount, GLsizei * count, GLuint * shaders)} */
    public static native void nglGetAttachedShaders(int program, int maxCount, long count, long shaders);

    /** {@code void glGetAttachedShaders(GLuint program, GLsizei maxCount, GLsizei * count, GLuint * shaders)} */
    public static void glGetAttachedShaders(@NativeType("GLuint") int program, @NativeType("GLsizei *") @Nullable IntBuffer count, @NativeType("GLuint *") IntBuffer shaders) {
        if (CHECKS) {
            checkSafe(count, 1);
        }
        nglGetAttachedShaders(program, shaders.remaining(), memAddressSafe(count), memAddress(shaders));
    }

    // --- [ glGetAttribLocation ] ---

    /** {@code GLint glGetAttribLocation(GLuint program, GLchar const * name)} */
    public static native int nglGetAttribLocation(int program, long name);

    /** {@code GLint glGetAttribLocation(GLuint program, GLchar const * name)} */
    @NativeType("GLint")
    public static int glGetAttribLocation(@NativeType("GLuint") int program, @NativeType("GLchar const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nglGetAttribLocation(program, memAddress(name));
    }

    /** {@code GLint glGetAttribLocation(GLuint program, GLchar const * name)} */
    @NativeType("GLint")
    public static int glGetAttribLocation(@NativeType("GLuint") int program, @NativeType("GLchar const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nglGetAttribLocation(program, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetBooleanv ] ---

    /** {@code void glGetBooleanv(GLenum pname, GLboolean * data)} */
    public static native void nglGetBooleanv(int pname, long data);

    /** {@code void glGetBooleanv(GLenum pname, GLboolean * data)} */
    public static void glGetBooleanv(@NativeType("GLenum") int pname, @NativeType("GLboolean *") ByteBuffer data) {
        if (CHECKS) {
            check(data, 1);
        }
        nglGetBooleanv(pname, memAddress(data));
    }

    /** {@code void glGetBooleanv(GLenum pname, GLboolean * data)} */
    @NativeType("void")
    public static boolean glGetBoolean(@NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer data = stack.calloc(1);
            nglGetBooleanv(pname, memAddress(data));
            return data.get(0) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetBufferParameteriv ] ---

    /** {@code void glGetBufferParameteriv(GLenum target, GLenum pname, GLint * params)} */
    public static native void nglGetBufferParameteriv(int target, int pname, long params);

    /** {@code void glGetBufferParameteriv(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetBufferParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetBufferParameteriv(target, pname, memAddress(params));
    }

    /** {@code void glGetBufferParameteriv(GLenum target, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetBufferParameteri(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetBufferParameteriv(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetError ] ---

    /** {@code GLenum glGetError(void)} */
    @NativeType("GLenum")
    public static native int glGetError();

    // --- [ glGetFloatv ] ---

    /** {@code void glGetFloatv(GLenum pname, GLfloat * data)} */
    public static native void nglGetFloatv(int pname, long data);

    /** {@code void glGetFloatv(GLenum pname, GLfloat * data)} */
    public static void glGetFloatv(@NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer data) {
        if (CHECKS) {
            check(data, 1);
        }
        nglGetFloatv(pname, memAddress(data));
    }

    /** {@code void glGetFloatv(GLenum pname, GLfloat * data)} */
    @NativeType("void")
    public static float glGetFloat(@NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer data = stack.callocFloat(1);
            nglGetFloatv(pname, memAddress(data));
            return data.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetFramebufferAttachmentParameteriv ] ---

    /** {@code void glGetFramebufferAttachmentParameteriv(GLenum target, GLenum attachment, GLenum pname, GLint * params)} */
    public static native void nglGetFramebufferAttachmentParameteriv(int target, int attachment, int pname, long params);

    /** {@code void glGetFramebufferAttachmentParameteriv(GLenum target, GLenum attachment, GLenum pname, GLint * params)} */
    public static void glGetFramebufferAttachmentParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetFramebufferAttachmentParameteriv(target, attachment, pname, memAddress(params));
    }

    /** {@code void glGetFramebufferAttachmentParameteriv(GLenum target, GLenum attachment, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetFramebufferAttachmentParameteri(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetFramebufferAttachmentParameteriv(target, attachment, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetIntegerv ] ---

    /** {@code void glGetIntegerv(GLenum pname, GLint * data)} */
    public static native void nglGetIntegerv(int pname, long data);

    /** {@code void glGetIntegerv(GLenum pname, GLint * data)} */
    public static void glGetIntegerv(@NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer data) {
        if (CHECKS) {
            check(data, 1);
        }
        nglGetIntegerv(pname, memAddress(data));
    }

    /** {@code void glGetIntegerv(GLenum pname, GLint * data)} */
    @NativeType("void")
    public static int glGetInteger(@NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer data = stack.callocInt(1);
            nglGetIntegerv(pname, memAddress(data));
            return data.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetProgramiv ] ---

    /** {@code void glGetProgramiv(GLuint program, GLenum pname, GLint * params)} */
    public static native void nglGetProgramiv(int program, int pname, long params);

    /** {@code void glGetProgramiv(GLuint program, GLenum pname, GLint * params)} */
    public static void glGetProgramiv(@NativeType("GLuint") int program, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetProgramiv(program, pname, memAddress(params));
    }

    /** {@code void glGetProgramiv(GLuint program, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetProgrami(@NativeType("GLuint") int program, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetProgramiv(program, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetProgramInfoLog ] ---

    /** {@code void glGetProgramInfoLog(GLuint program, GLsizei bufSize, GLsizei * length, GLchar * infoLog)} */
    public static native void nglGetProgramInfoLog(int program, int bufSize, long length, long infoLog);

    /** {@code void glGetProgramInfoLog(GLuint program, GLsizei bufSize, GLsizei * length, GLchar * infoLog)} */
    public static void glGetProgramInfoLog(@NativeType("GLuint") int program, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLchar *") ByteBuffer infoLog) {
        if (CHECKS) {
            checkSafe(length, 1);
        }
        nglGetProgramInfoLog(program, infoLog.remaining(), memAddressSafe(length), memAddress(infoLog));
    }

    /** {@code void glGetProgramInfoLog(GLuint program, GLsizei bufSize, GLsizei * length, GLchar * infoLog)} */
    @NativeType("void")
    public static String glGetProgramInfoLog(@NativeType("GLuint") int program, @NativeType("GLsizei") int bufSize) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        ByteBuffer infoLog = memAlloc(bufSize);
        try {
            IntBuffer length = stack.ints(0);
            nglGetProgramInfoLog(program, bufSize, memAddress(length), memAddress(infoLog));
            return memUTF8(infoLog, length.get(0));
        } finally {
            memFree(infoLog);
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glGetProgramInfoLog(GLuint program, GLsizei bufSize, GLsizei * length, GLchar * infoLog)} */
    @NativeType("void")
    public static String glGetProgramInfoLog(@NativeType("GLuint") int program) {
        return glGetProgramInfoLog(program, glGetProgrami(program, GL_INFO_LOG_LENGTH));
    }

    // --- [ glGetRenderbufferParameteriv ] ---

    /** {@code void glGetRenderbufferParameteriv(GLenum target, GLenum pname, GLint * params)} */
    public static native void nglGetRenderbufferParameteriv(int target, int pname, long params);

    /** {@code void glGetRenderbufferParameteriv(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetRenderbufferParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetRenderbufferParameteriv(target, pname, memAddress(params));
    }

    /** {@code void glGetRenderbufferParameteriv(GLenum target, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetRenderbufferParameteri(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetRenderbufferParameteriv(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetShaderiv ] ---

    /** {@code void glGetShaderiv(GLuint shader, GLenum pname, GLint * params)} */
    public static native void nglGetShaderiv(int shader, int pname, long params);

    /** {@code void glGetShaderiv(GLuint shader, GLenum pname, GLint * params)} */
    public static void glGetShaderiv(@NativeType("GLuint") int shader, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetShaderiv(shader, pname, memAddress(params));
    }

    /** {@code void glGetShaderiv(GLuint shader, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetShaderi(@NativeType("GLuint") int shader, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetShaderiv(shader, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetShaderInfoLog ] ---

    /** {@code void glGetShaderInfoLog(GLuint shader, GLsizei bufSize, GLsizei * length, GLchar * infoLog)} */
    public static native void nglGetShaderInfoLog(int shader, int bufSize, long length, long infoLog);

    /** {@code void glGetShaderInfoLog(GLuint shader, GLsizei bufSize, GLsizei * length, GLchar * infoLog)} */
    public static void glGetShaderInfoLog(@NativeType("GLuint") int shader, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLchar *") ByteBuffer infoLog) {
        if (CHECKS) {
            checkSafe(length, 1);
        }
        nglGetShaderInfoLog(shader, infoLog.remaining(), memAddressSafe(length), memAddress(infoLog));
    }

    /** {@code void glGetShaderInfoLog(GLuint shader, GLsizei bufSize, GLsizei * length, GLchar * infoLog)} */
    @NativeType("void")
    public static String glGetShaderInfoLog(@NativeType("GLuint") int shader, @NativeType("GLsizei") int bufSize) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        ByteBuffer infoLog = memAlloc(bufSize);
        try {
            IntBuffer length = stack.ints(0);
            nglGetShaderInfoLog(shader, bufSize, memAddress(length), memAddress(infoLog));
            return memUTF8(infoLog, length.get(0));
        } finally {
            memFree(infoLog);
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glGetShaderInfoLog(GLuint shader, GLsizei bufSize, GLsizei * length, GLchar * infoLog)} */
    @NativeType("void")
    public static String glGetShaderInfoLog(@NativeType("GLuint") int shader) {
        return glGetShaderInfoLog(shader, glGetShaderi(shader, GL_INFO_LOG_LENGTH));
    }

    // --- [ glGetShaderPrecisionFormat ] ---

    /** {@code void glGetShaderPrecisionFormat(GLenum shadertype, GLenum precisiontype, GLint * range, GLint * precision)} */
    public static native void nglGetShaderPrecisionFormat(int shadertype, int precisiontype, long range, long precision);

    /** {@code void glGetShaderPrecisionFormat(GLenum shadertype, GLenum precisiontype, GLint * range, GLint * precision)} */
    public static void glGetShaderPrecisionFormat(@NativeType("GLenum") int shadertype, @NativeType("GLenum") int precisiontype, @NativeType("GLint *") IntBuffer range, @NativeType("GLint *") IntBuffer precision) {
        if (CHECKS) {
            check(range, 2);
            check(precision, 2);
        }
        nglGetShaderPrecisionFormat(shadertype, precisiontype, memAddress(range), memAddress(precision));
    }

    // --- [ glGetShaderSource ] ---

    /** {@code void glGetShaderSource(GLuint shader, GLsizei bufSize, GLsizei * length, GLchar * source)} */
    public static native void nglGetShaderSource(int shader, int bufSize, long length, long source);

    /** {@code void glGetShaderSource(GLuint shader, GLsizei bufSize, GLsizei * length, GLchar * source)} */
    public static void glGetShaderSource(@NativeType("GLuint") int shader, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLchar *") ByteBuffer source) {
        if (CHECKS) {
            checkSafe(length, 1);
        }
        nglGetShaderSource(shader, source.remaining(), memAddressSafe(length), memAddress(source));
    }

    /** {@code void glGetShaderSource(GLuint shader, GLsizei bufSize, GLsizei * length, GLchar * source)} */
    @NativeType("void")
    public static String glGetShaderSource(@NativeType("GLuint") int shader, @NativeType("GLsizei") int bufSize) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        ByteBuffer source = memAlloc(bufSize);
        try {
            IntBuffer length = stack.ints(0);
            nglGetShaderSource(shader, bufSize, memAddress(length), memAddress(source));
            return memUTF8(source, length.get(0));
        } finally {
            memFree(source);
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glGetShaderSource(GLuint shader, GLsizei bufSize, GLsizei * length, GLchar * source)} */
    @NativeType("void")
    public static String glGetShaderSource(@NativeType("GLuint") int shader) {
        return glGetShaderSource(shader, glGetShaderi(shader, GL_SHADER_SOURCE_LENGTH));
    }

    // --- [ glGetString ] ---

    /** {@code GLubyte const * glGetString(GLenum name)} */
    public static native long nglGetString(int name);

    /** {@code GLubyte const * glGetString(GLenum name)} */
    @NativeType("GLubyte const *")
    public static @Nullable String glGetString(@NativeType("GLenum") int name) {
        long __result = nglGetString(name);
        return memUTF8Safe(__result);
    }

    // --- [ glGetTexParameterfv ] ---

    /** {@code void glGetTexParameterfv(GLenum target, GLenum pname, GLfloat * params)} */
    public static native void nglGetTexParameterfv(int target, int pname, long params);

    /** {@code void glGetTexParameterfv(GLenum target, GLenum pname, GLfloat * params)} */
    public static void glGetTexParameterfv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetTexParameterfv(target, pname, memAddress(params));
    }

    /** {@code void glGetTexParameterfv(GLenum target, GLenum pname, GLfloat * params)} */
    @NativeType("void")
    public static float glGetTexParameterf(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetTexParameterfv(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetTexParameteriv ] ---

    /** {@code void glGetTexParameteriv(GLenum target, GLenum pname, GLint * params)} */
    public static native void nglGetTexParameteriv(int target, int pname, long params);

    /** {@code void glGetTexParameteriv(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetTexParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetTexParameteriv(target, pname, memAddress(params));
    }

    /** {@code void glGetTexParameteriv(GLenum target, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetTexParameteri(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetTexParameteriv(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetUniformfv ] ---

    /** {@code void glGetUniformfv(GLuint program, GLint location, GLfloat * params)} */
    public static native void nglGetUniformfv(int program, int location, long params);

    /** {@code void glGetUniformfv(GLuint program, GLint location, GLfloat * params)} */
    public static void glGetUniformfv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetUniformfv(program, location, memAddress(params));
    }

    /** {@code void glGetUniformfv(GLuint program, GLint location, GLfloat * params)} */
    @NativeType("void")
    public static float glGetUniformf(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetUniformfv(program, location, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetUniformiv ] ---

    /** {@code void glGetUniformiv(GLuint program, GLint location, GLint * params)} */
    public static native void nglGetUniformiv(int program, int location, long params);

    /** {@code void glGetUniformiv(GLuint program, GLint location, GLint * params)} */
    public static void glGetUniformiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetUniformiv(program, location, memAddress(params));
    }

    /** {@code void glGetUniformiv(GLuint program, GLint location, GLint * params)} */
    @NativeType("void")
    public static int glGetUniformi(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetUniformiv(program, location, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetUniformLocation ] ---

    /** {@code GLint glGetUniformLocation(GLuint program, GLchar const * name)} */
    public static native int nglGetUniformLocation(int program, long name);

    /** {@code GLint glGetUniformLocation(GLuint program, GLchar const * name)} */
    @NativeType("GLint")
    public static int glGetUniformLocation(@NativeType("GLuint") int program, @NativeType("GLchar const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nglGetUniformLocation(program, memAddress(name));
    }

    /** {@code GLint glGetUniformLocation(GLuint program, GLchar const * name)} */
    @NativeType("GLint")
    public static int glGetUniformLocation(@NativeType("GLuint") int program, @NativeType("GLchar const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nglGetUniformLocation(program, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetVertexAttribfv ] ---

    /** {@code void glGetVertexAttribfv(GLuint index, GLenum pname, GLfloat * params)} */
    public static native void nglGetVertexAttribfv(int index, int pname, long params);

    /** {@code void glGetVertexAttribfv(GLuint index, GLenum pname, GLfloat * params)} */
    public static void glGetVertexAttribfv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglGetVertexAttribfv(index, pname, memAddress(params));
    }

    // --- [ glGetVertexAttribiv ] ---

    /** {@code void glGetVertexAttribiv(GLuint index, GLenum pname, GLint * params)} */
    public static native void nglGetVertexAttribiv(int index, int pname, long params);

    /** {@code void glGetVertexAttribiv(GLuint index, GLenum pname, GLint * params)} */
    public static void glGetVertexAttribiv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglGetVertexAttribiv(index, pname, memAddress(params));
    }

    // --- [ glGetVertexAttribPointerv ] ---

    /** {@code void glGetVertexAttribPointerv(GLuint index, GLenum pname, void ** pointer)} */
    public static native void nglGetVertexAttribPointerv(int index, int pname, long pointer);

    /** {@code void glGetVertexAttribPointerv(GLuint index, GLenum pname, void ** pointer)} */
    public static void glGetVertexAttribPointerv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("void **") PointerBuffer pointer) {
        if (CHECKS) {
            check(pointer, 1);
        }
        nglGetVertexAttribPointerv(index, pname, memAddress(pointer));
    }

    /** {@code void glGetVertexAttribPointerv(GLuint index, GLenum pname, void ** pointer)} */
    @NativeType("void")
    public static long glGetVertexAttribPointer(@NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer pointer = stack.callocPointer(1);
            nglGetVertexAttribPointerv(index, pname, memAddress(pointer));
            return pointer.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glHint ] ---

    /** {@code void glHint(GLenum target, GLenum mode)} */
    public static native void glHint(@NativeType("GLenum") int target, @NativeType("GLenum") int mode);

    // --- [ glIsBuffer ] ---

    /** {@code GLboolean glIsBuffer(GLuint buffer)} */
    @NativeType("GLboolean")
    public static native boolean glIsBuffer(@NativeType("GLuint") int buffer);

    // --- [ glIsEnabled ] ---

    /** {@code GLboolean glIsEnabled(GLenum cap)} */
    @NativeType("GLboolean")
    public static native boolean glIsEnabled(@NativeType("GLenum") int cap);

    // --- [ glIsFramebuffer ] ---

    /** {@code GLboolean glIsFramebuffer(GLuint framebuffer)} */
    @NativeType("GLboolean")
    public static native boolean glIsFramebuffer(@NativeType("GLuint") int framebuffer);

    // --- [ glIsProgram ] ---

    /** {@code GLboolean glIsProgram(GLuint program)} */
    @NativeType("GLboolean")
    public static native boolean glIsProgram(@NativeType("GLuint") int program);

    // --- [ glIsRenderbuffer ] ---

    /** {@code GLboolean glIsRenderbuffer(GLuint renderbuffer)} */
    @NativeType("GLboolean")
    public static native boolean glIsRenderbuffer(@NativeType("GLuint") int renderbuffer);

    // --- [ glIsShader ] ---

    /** {@code GLboolean glIsShader(GLuint shader)} */
    @NativeType("GLboolean")
    public static native boolean glIsShader(@NativeType("GLuint") int shader);

    // --- [ glIsTexture ] ---

    /** {@code GLboolean glIsTexture(GLuint texture)} */
    @NativeType("GLboolean")
    public static native boolean glIsTexture(@NativeType("GLuint") int texture);

    // --- [ glLineWidth ] ---

    /** {@code void glLineWidth(GLfloat width)} */
    public static native void glLineWidth(@NativeType("GLfloat") float width);

    // --- [ glLinkProgram ] ---

    /** {@code void glLinkProgram(GLuint program)} */
    public static native void glLinkProgram(@NativeType("GLuint") int program);

    // --- [ glPixelStorei ] ---

    /** {@code void glPixelStorei(GLenum pname, GLint param)} */
    public static native void glPixelStorei(@NativeType("GLenum") int pname, @NativeType("GLint") int param);

    // --- [ glPolygonOffset ] ---

    /** {@code void glPolygonOffset(GLfloat factor, GLfloat units)} */
    public static native void glPolygonOffset(@NativeType("GLfloat") float factor, @NativeType("GLfloat") float units);

    // --- [ glReadPixels ] ---

    /** {@code void glReadPixels(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, void * pixels)} */
    public static native void nglReadPixels(int x, int y, int width, int height, int format, int type, long pixels);

    /** {@code void glReadPixels(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, void * pixels)} */
    public static void glReadPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ByteBuffer pixels) {
        nglReadPixels(x, y, width, height, format, type, memAddress(pixels));
    }

    /** {@code void glReadPixels(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, void * pixels)} */
    public static void glReadPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") long pixels) {
        nglReadPixels(x, y, width, height, format, type, pixels);
    }

    /** {@code void glReadPixels(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, void * pixels)} */
    public static void glReadPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") ShortBuffer pixels) {
        nglReadPixels(x, y, width, height, format, type, memAddress(pixels));
    }

    /** {@code void glReadPixels(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, void * pixels)} */
    public static void glReadPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") IntBuffer pixels) {
        nglReadPixels(x, y, width, height, format, type, memAddress(pixels));
    }

    /** {@code void glReadPixels(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, void * pixels)} */
    public static void glReadPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") FloatBuffer pixels) {
        nglReadPixels(x, y, width, height, format, type, memAddress(pixels));
    }

    // --- [ glReleaseShaderCompiler ] ---

    /** {@code void glReleaseShaderCompiler(void)} */
    public static native void glReleaseShaderCompiler();

    // --- [ glRenderbufferStorage ] ---

    /** {@code void glRenderbufferStorage(GLenum target, GLenum internalformat, GLsizei width, GLsizei height)} */
    public static native void glRenderbufferStorage(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

    // --- [ glSampleCoverage ] ---

    /** {@code void glSampleCoverage(GLfloat value, GLboolean invert)} */
    public static native void glSampleCoverage(@NativeType("GLfloat") float value, @NativeType("GLboolean") boolean invert);

    // --- [ glScissor ] ---

    /** {@code void glScissor(GLint x, GLint y, GLsizei width, GLsizei height)} */
    public static native void glScissor(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

    // --- [ glShaderBinary ] ---

    /** {@code void glShaderBinary(GLsizei count, GLuint const * shaders, GLenum binaryformat, void const * binary, GLsizei length)} */
    public static native void nglShaderBinary(int count, long shaders, int binaryformat, long binary, int length);

    /** {@code void glShaderBinary(GLsizei count, GLuint const * shaders, GLenum binaryformat, void const * binary, GLsizei length)} */
    public static void glShaderBinary(@NativeType("GLuint const *") IntBuffer shaders, @NativeType("GLenum") int binaryformat, @NativeType("void const *") ByteBuffer binary) {
        nglShaderBinary(shaders.remaining(), memAddress(shaders), binaryformat, memAddress(binary), binary.remaining());
    }

    // --- [ glShaderSource ] ---

    /** {@code void glShaderSource(GLuint shader, GLsizei count, GLchar const * const * string, GLint const * length)} */
    public static native void nglShaderSource(int shader, int count, long string, long length);

    /** {@code void glShaderSource(GLuint shader, GLsizei count, GLchar const * const * string, GLint const * length)} */
    public static void glShaderSource(@NativeType("GLuint") int shader, @NativeType("GLchar const * const *") PointerBuffer string, @NativeType("GLint const *") @Nullable IntBuffer length) {
        if (CHECKS) {
            checkSafe(length, string.remaining());
        }
        nglShaderSource(shader, string.remaining(), memAddress(string), memAddressSafe(length));
    }

    /** {@code void glShaderSource(GLuint shader, GLsizei count, GLchar const * const * string, GLint const * length)} */
    public static void glShaderSource(@NativeType("GLuint") int shader, @NativeType("GLchar const * const *") CharSequence... string) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long stringAddress = org.lwjgl.system.APIUtil.apiArrayi(stack, MemoryUtil::memUTF8, string);
            nglShaderSource(shader, string.length, stringAddress, stringAddress - (string.length << 2));
            org.lwjgl.system.APIUtil.apiArrayFree(stringAddress, string.length);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glShaderSource(GLuint shader, GLsizei count, GLchar const * const * string, GLint const * length)} */
    public static void glShaderSource(@NativeType("GLuint") int shader, @NativeType("GLchar const * const *") CharSequence string) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long stringAddress = org.lwjgl.system.APIUtil.apiArrayi(stack, MemoryUtil::memUTF8, string);
            nglShaderSource(shader, 1, stringAddress, stringAddress - 4);
            org.lwjgl.system.APIUtil.apiArrayFree(stringAddress, 1);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glStencilFunc ] ---

    /** {@code void glStencilFunc(GLenum func, GLint ref, GLuint mask)} */
    public static native void glStencilFunc(@NativeType("GLenum") int func, @NativeType("GLint") int ref, @NativeType("GLuint") int mask);

    // --- [ glStencilFuncSeparate ] ---

    /** {@code void glStencilFuncSeparate(GLenum face, GLenum func, GLint ref, GLuint mask)} */
    public static native void glStencilFuncSeparate(@NativeType("GLenum") int face, @NativeType("GLenum") int func, @NativeType("GLint") int ref, @NativeType("GLuint") int mask);

    // --- [ glStencilMask ] ---

    /** {@code void glStencilMask(GLuint mask)} */
    public static native void glStencilMask(@NativeType("GLuint") int mask);

    // --- [ glStencilMaskSeparate ] ---

    /** {@code void glStencilMaskSeparate(GLenum face, GLuint mask)} */
    public static native void glStencilMaskSeparate(@NativeType("GLenum") int face, @NativeType("GLuint") int mask);

    // --- [ glStencilOp ] ---

    /** {@code void glStencilOp(GLenum fail, GLenum zfail, GLenum zpass)} */
    public static native void glStencilOp(@NativeType("GLenum") int fail, @NativeType("GLenum") int zfail, @NativeType("GLenum") int zpass);

    // --- [ glStencilOpSeparate ] ---

    /** {@code void glStencilOpSeparate(GLenum face, GLenum sfail, GLenum dpfail, GLenum dppass)} */
    public static native void glStencilOpSeparate(@NativeType("GLenum") int face, @NativeType("GLenum") int sfail, @NativeType("GLenum") int dpfail, @NativeType("GLenum") int dppass);

    // --- [ glTexImage2D ] ---

    /** {@code void glTexImage2D(GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static native void nglTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, long pixels);

    /** {@code void glTexImage2D(GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable ByteBuffer pixels) {
        nglTexImage2D(target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
    }

    /** {@code void glTexImage2D(GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        nglTexImage2D(target, level, internalformat, width, height, border, format, type, pixels);
    }

    /** {@code void glTexImage2D(GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable ShortBuffer pixels) {
        nglTexImage2D(target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
    }

    /** {@code void glTexImage2D(GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable IntBuffer pixels) {
        nglTexImage2D(target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
    }

    /** {@code void glTexImage2D(GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") @Nullable FloatBuffer pixels) {
        nglTexImage2D(target, level, internalformat, width, height, border, format, type, memAddressSafe(pixels));
    }

    // --- [ glTexParameterf ] ---

    /** {@code void glTexParameterf(GLenum target, GLenum pname, GLfloat param)} */
    public static native void glTexParameterf(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat") float param);

    // --- [ glTexParameterfv ] ---

    /** {@code void glTexParameterfv(GLenum target, GLenum pname, GLfloat const * params)} */
    public static native void nglTexParameterfv(int target, int pname, long params);

    /** {@code void glTexParameterfv(GLenum target, GLenum pname, GLfloat const * params)} */
    public static void glTexParameterfv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglTexParameterfv(target, pname, memAddress(params));
    }

    // --- [ glTexParameteri ] ---

    /** {@code void glTexParameteri(GLenum target, GLenum pname, GLint param)} */
    public static native void glTexParameteri(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint") int param);

    // --- [ glTexParameteriv ] ---

    /** {@code void glTexParameteriv(GLenum target, GLenum pname, GLint const * params)} */
    public static native void nglTexParameteriv(int target, int pname, long params);

    /** {@code void glTexParameteriv(GLenum target, GLenum pname, GLint const * params)} */
    public static void glTexParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglTexParameteriv(target, pname, memAddress(params));
    }

    // --- [ glTexSubImage2D ] ---

    /** {@code void glTexSubImage2D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static native void nglTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, long pixels);

    /** {@code void glTexSubImage2D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexSubImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer pixels) {
        nglTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
    }

    /** {@code void glTexSubImage2D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexSubImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        nglTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, pixels);
    }

    /** {@code void glTexSubImage2D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexSubImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ShortBuffer pixels) {
        nglTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
    }

    /** {@code void glTexSubImage2D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexSubImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer pixels) {
        nglTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
    }

    /** {@code void glTexSubImage2D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexSubImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") FloatBuffer pixels) {
        nglTexSubImage2D(target, level, xoffset, yoffset, width, height, format, type, memAddress(pixels));
    }

    // --- [ glUniform1f ] ---

    /** {@code void glUniform1f(GLint location, GLfloat v0)} */
    public static native void glUniform1f(@NativeType("GLint") int location, @NativeType("GLfloat") float v0);

    // --- [ glUniform1fv ] ---

    /** {@code void glUniform1fv(GLint location, GLsizei count, GLfloat const * value)} */
    public static native void nglUniform1fv(int location, int count, long value);

    /** {@code void glUniform1fv(GLint location, GLsizei count, GLfloat const * value)} */
    public static void glUniform1fv(@NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        nglUniform1fv(location, value.remaining(), memAddress(value));
    }

    // --- [ glUniform1i ] ---

    /** {@code void glUniform1i(GLint location, GLint v0)} */
    public static native void glUniform1i(@NativeType("GLint") int location, @NativeType("GLint") int v0);

    // --- [ glUniform1iv ] ---

    /** {@code void glUniform1iv(GLint location, GLsizei count, GLint const * value)} */
    public static native void nglUniform1iv(int location, int count, long value);

    /** {@code void glUniform1iv(GLint location, GLsizei count, GLint const * value)} */
    public static void glUniform1iv(@NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        nglUniform1iv(location, value.remaining(), memAddress(value));
    }

    // --- [ glUniform2f ] ---

    /** {@code void glUniform2f(GLint location, GLfloat v0, GLfloat v1)} */
    public static native void glUniform2f(@NativeType("GLint") int location, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1);

    // --- [ glUniform2fv ] ---

    /** {@code void glUniform2fv(GLint location, GLsizei count, GLfloat const * value)} */
    public static native void nglUniform2fv(int location, int count, long value);

    /** {@code void glUniform2fv(GLint location, GLsizei count, GLfloat const * value)} */
    public static void glUniform2fv(@NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        nglUniform2fv(location, value.remaining() >> 1, memAddress(value));
    }

    // --- [ glUniform2i ] ---

    /** {@code void glUniform2i(GLint location, GLint v0, GLint v1)} */
    public static native void glUniform2i(@NativeType("GLint") int location, @NativeType("GLint") int v0, @NativeType("GLint") int v1);

    // --- [ glUniform2iv ] ---

    /** {@code void glUniform2iv(GLint location, GLsizei count, GLint const * value)} */
    public static native void nglUniform2iv(int location, int count, long value);

    /** {@code void glUniform2iv(GLint location, GLsizei count, GLint const * value)} */
    public static void glUniform2iv(@NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        nglUniform2iv(location, value.remaining() >> 1, memAddress(value));
    }

    // --- [ glUniform3f ] ---

    /** {@code void glUniform3f(GLint location, GLfloat v0, GLfloat v1, GLfloat v2)} */
    public static native void glUniform3f(@NativeType("GLint") int location, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2);

    // --- [ glUniform3fv ] ---

    /** {@code void glUniform3fv(GLint location, GLsizei count, GLfloat const * value)} */
    public static native void nglUniform3fv(int location, int count, long value);

    /** {@code void glUniform3fv(GLint location, GLsizei count, GLfloat const * value)} */
    public static void glUniform3fv(@NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        nglUniform3fv(location, value.remaining() / 3, memAddress(value));
    }

    // --- [ glUniform3i ] ---

    /** {@code void glUniform3i(GLint location, GLint v0, GLint v1, GLint v2)} */
    public static native void glUniform3i(@NativeType("GLint") int location, @NativeType("GLint") int v0, @NativeType("GLint") int v1, @NativeType("GLint") int v2);

    // --- [ glUniform3iv ] ---

    /** {@code void glUniform3iv(GLint location, GLsizei count, GLint const * value)} */
    public static native void nglUniform3iv(int location, int count, long value);

    /** {@code void glUniform3iv(GLint location, GLsizei count, GLint const * value)} */
    public static void glUniform3iv(@NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        nglUniform3iv(location, value.remaining() / 3, memAddress(value));
    }

    // --- [ glUniform4f ] ---

    /** {@code void glUniform4f(GLint location, GLfloat v0, GLfloat v1, GLfloat v2, GLfloat v3)} */
    public static native void glUniform4f(@NativeType("GLint") int location, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2, @NativeType("GLfloat") float v3);

    // --- [ glUniform4fv ] ---

    /** {@code void glUniform4fv(GLint location, GLsizei count, GLfloat const * value)} */
    public static native void nglUniform4fv(int location, int count, long value);

    /** {@code void glUniform4fv(GLint location, GLsizei count, GLfloat const * value)} */
    public static void glUniform4fv(@NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        nglUniform4fv(location, value.remaining() >> 2, memAddress(value));
    }

    // --- [ glUniform4i ] ---

    /** {@code void glUniform4i(GLint location, GLint v0, GLint v1, GLint v2, GLint v3)} */
    public static native void glUniform4i(@NativeType("GLint") int location, @NativeType("GLint") int v0, @NativeType("GLint") int v1, @NativeType("GLint") int v2, @NativeType("GLint") int v3);

    // --- [ glUniform4iv ] ---

    /** {@code void glUniform4iv(GLint location, GLsizei count, GLint const * value)} */
    public static native void nglUniform4iv(int location, int count, long value);

    /** {@code void glUniform4iv(GLint location, GLsizei count, GLint const * value)} */
    public static void glUniform4iv(@NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        nglUniform4iv(location, value.remaining() >> 2, memAddress(value));
    }

    // --- [ glUniformMatrix2fv ] ---

    /** {@code void glUniformMatrix2fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglUniformMatrix2fv(int location, int count, boolean transpose, long value);

    /** {@code void glUniformMatrix2fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glUniformMatrix2fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglUniformMatrix2fv(location, value.remaining() >> 2, transpose, memAddress(value));
    }

    // --- [ glUniformMatrix3fv ] ---

    /** {@code void glUniformMatrix3fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglUniformMatrix3fv(int location, int count, boolean transpose, long value);

    /** {@code void glUniformMatrix3fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glUniformMatrix3fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglUniformMatrix3fv(location, value.remaining() / 9, transpose, memAddress(value));
    }

    // --- [ glUniformMatrix4fv ] ---

    /** {@code void glUniformMatrix4fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglUniformMatrix4fv(int location, int count, boolean transpose, long value);

    /** {@code void glUniformMatrix4fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glUniformMatrix4fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglUniformMatrix4fv(location, value.remaining() >> 4, transpose, memAddress(value));
    }

    // --- [ glUseProgram ] ---

    /** {@code void glUseProgram(GLuint program)} */
    public static native void glUseProgram(@NativeType("GLuint") int program);

    // --- [ glValidateProgram ] ---

    /** {@code void glValidateProgram(GLuint program)} */
    public static native void glValidateProgram(@NativeType("GLuint") int program);

    // --- [ glVertexAttrib1f ] ---

    /** {@code void glVertexAttrib1f(GLuint index, GLfloat x)} */
    public static native void glVertexAttrib1f(@NativeType("GLuint") int index, @NativeType("GLfloat") float x);

    // --- [ glVertexAttrib1fv ] ---

    /** {@code void glVertexAttrib1fv(GLuint index, GLfloat const * v)} */
    public static native void nglVertexAttrib1fv(int index, long v);

    /** {@code void glVertexAttrib1fv(GLuint index, GLfloat const * v)} */
    public static void glVertexAttrib1fv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer v) {
        if (CHECKS) {
            check(v, 1);
        }
        nglVertexAttrib1fv(index, memAddress(v));
    }

    // --- [ glVertexAttrib2f ] ---

    /** {@code void glVertexAttrib2f(GLuint index, GLfloat x, GLfloat y)} */
    public static native void glVertexAttrib2f(@NativeType("GLuint") int index, @NativeType("GLfloat") float x, @NativeType("GLfloat") float y);

    // --- [ glVertexAttrib2fv ] ---

    /** {@code void glVertexAttrib2fv(GLuint index, GLfloat const * v)} */
    public static native void nglVertexAttrib2fv(int index, long v);

    /** {@code void glVertexAttrib2fv(GLuint index, GLfloat const * v)} */
    public static void glVertexAttrib2fv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer v) {
        if (CHECKS) {
            check(v, 2);
        }
        nglVertexAttrib2fv(index, memAddress(v));
    }

    // --- [ glVertexAttrib3f ] ---

    /** {@code void glVertexAttrib3f(GLuint index, GLfloat x, GLfloat y, GLfloat z)} */
    public static native void glVertexAttrib3f(@NativeType("GLuint") int index, @NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float z);

    // --- [ glVertexAttrib3fv ] ---

    /** {@code void glVertexAttrib3fv(GLuint index, GLfloat const * v)} */
    public static native void nglVertexAttrib3fv(int index, long v);

    /** {@code void glVertexAttrib3fv(GLuint index, GLfloat const * v)} */
    public static void glVertexAttrib3fv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglVertexAttrib3fv(index, memAddress(v));
    }

    // --- [ glVertexAttrib4f ] ---

    /** {@code void glVertexAttrib4f(GLuint index, GLfloat x, GLfloat y, GLfloat z, GLfloat w)} */
    public static native void glVertexAttrib4f(@NativeType("GLuint") int index, @NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float z, @NativeType("GLfloat") float w);

    // --- [ glVertexAttrib4fv ] ---

    /** {@code void glVertexAttrib4fv(GLuint index, GLfloat const * v)} */
    public static native void nglVertexAttrib4fv(int index, long v);

    /** {@code void glVertexAttrib4fv(GLuint index, GLfloat const * v)} */
    public static void glVertexAttrib4fv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttrib4fv(index, memAddress(v));
    }

    // --- [ glVertexAttribPointer ] ---

    /** {@code void glVertexAttribPointer(GLuint index, GLint size, GLenum type, GLboolean normalized, GLsizei stride, void const * pointer)} */
    public static native void nglVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, long pointer);

    /** {@code void glVertexAttribPointer(GLuint index, GLint size, GLenum type, GLboolean normalized, GLsizei stride, void const * pointer)} */
    public static void glVertexAttribPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLsizei") int stride, @NativeType("void const *") ByteBuffer pointer) {
        nglVertexAttribPointer(index, size, type, normalized, stride, memAddress(pointer));
    }

    /** {@code void glVertexAttribPointer(GLuint index, GLint size, GLenum type, GLboolean normalized, GLsizei stride, void const * pointer)} */
    public static void glVertexAttribPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLsizei") int stride, @NativeType("void const *") long pointer) {
        nglVertexAttribPointer(index, size, type, normalized, stride, pointer);
    }

    /** {@code void glVertexAttribPointer(GLuint index, GLint size, GLenum type, GLboolean normalized, GLsizei stride, void const * pointer)} */
    public static void glVertexAttribPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLsizei") int stride, @NativeType("void const *") ShortBuffer pointer) {
        nglVertexAttribPointer(index, size, type, normalized, stride, memAddress(pointer));
    }

    /** {@code void glVertexAttribPointer(GLuint index, GLint size, GLenum type, GLboolean normalized, GLsizei stride, void const * pointer)} */
    public static void glVertexAttribPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLsizei") int stride, @NativeType("void const *") IntBuffer pointer) {
        nglVertexAttribPointer(index, size, type, normalized, stride, memAddress(pointer));
    }

    /** {@code void glVertexAttribPointer(GLuint index, GLint size, GLenum type, GLboolean normalized, GLsizei stride, void const * pointer)} */
    public static void glVertexAttribPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLsizei") int stride, @NativeType("void const *") FloatBuffer pointer) {
        nglVertexAttribPointer(index, size, type, normalized, stride, memAddress(pointer));
    }

    // --- [ glViewport ] ---

    /** {@code void glViewport(GLint x, GLint y, GLsizei width, GLsizei height)} */
    public static native void glViewport(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

    /** {@code void glBufferData(GLenum target, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glBufferData(@NativeType("GLenum") int target, @NativeType("void const *") short[] data, @NativeType("GLenum") int usage) {
        long __functionAddress = GLES.getICD().glBufferData;
        callPPV(target, Integer.toUnsignedLong(data.length) << 1, data, usage, __functionAddress);
    }

    /** {@code void glBufferData(GLenum target, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glBufferData(@NativeType("GLenum") int target, @NativeType("void const *") int[] data, @NativeType("GLenum") int usage) {
        long __functionAddress = GLES.getICD().glBufferData;
        callPPV(target, Integer.toUnsignedLong(data.length) << 2, data, usage, __functionAddress);
    }

    /** {@code void glBufferData(GLenum target, GLsizeiptr size, void const * data, GLenum usage)} */
    public static void glBufferData(@NativeType("GLenum") int target, @NativeType("void const *") float[] data, @NativeType("GLenum") int usage) {
        long __functionAddress = GLES.getICD().glBufferData;
        callPPV(target, Integer.toUnsignedLong(data.length) << 2, data, usage, __functionAddress);
    }

    /** {@code void glBufferSubData(GLenum target, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void const *") short[] data) {
        long __functionAddress = GLES.getICD().glBufferSubData;
        callPPPV(target, offset, Integer.toUnsignedLong(data.length) << 1, data, __functionAddress);
    }

    /** {@code void glBufferSubData(GLenum target, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void const *") int[] data) {
        long __functionAddress = GLES.getICD().glBufferSubData;
        callPPPV(target, offset, Integer.toUnsignedLong(data.length) << 2, data, __functionAddress);
    }

    /** {@code void glBufferSubData(GLenum target, GLintptr offset, GLsizeiptr size, void const * data)} */
    public static void glBufferSubData(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("void const *") float[] data) {
        long __functionAddress = GLES.getICD().glBufferSubData;
        callPPPV(target, offset, Integer.toUnsignedLong(data.length) << 2, data, __functionAddress);
    }

    /** {@code void glDeleteBuffers(GLsizei n, GLuint const * buffers)} */
    public static void glDeleteBuffers(@NativeType("GLuint const *") int[] buffers) {
        long __functionAddress = GLES.getICD().glDeleteBuffers;
        callPV(buffers.length, buffers, __functionAddress);
    }

    /** {@code void glDeleteFramebuffers(GLsizei n, GLuint const * framebuffers)} */
    public static void glDeleteFramebuffers(@NativeType("GLuint const *") int[] framebuffers) {
        long __functionAddress = GLES.getICD().glDeleteFramebuffers;
        callPV(framebuffers.length, framebuffers, __functionAddress);
    }

    /** {@code void glDeleteRenderbuffers(GLsizei n, GLuint const * renderbuffers)} */
    public static void glDeleteRenderbuffers(@NativeType("GLuint const *") int[] renderbuffers) {
        long __functionAddress = GLES.getICD().glDeleteRenderbuffers;
        callPV(renderbuffers.length, renderbuffers, __functionAddress);
    }

    /** {@code void glDeleteTextures(GLsizei n, GLuint const * textures)} */
    public static void glDeleteTextures(@NativeType("GLuint const *") int[] textures) {
        long __functionAddress = GLES.getICD().glDeleteTextures;
        callPV(textures.length, textures, __functionAddress);
    }

    /** {@code void glGenBuffers(GLsizei n, GLuint * buffers)} */
    public static void glGenBuffers(@NativeType("GLuint *") int[] buffers) {
        long __functionAddress = GLES.getICD().glGenBuffers;
        callPV(buffers.length, buffers, __functionAddress);
    }

    /** {@code void glGenFramebuffers(GLsizei n, GLuint * framebuffers)} */
    public static void glGenFramebuffers(@NativeType("GLuint *") int[] framebuffers) {
        long __functionAddress = GLES.getICD().glGenFramebuffers;
        callPV(framebuffers.length, framebuffers, __functionAddress);
    }

    /** {@code void glGenRenderbuffers(GLsizei n, GLuint * renderbuffers)} */
    public static void glGenRenderbuffers(@NativeType("GLuint *") int[] renderbuffers) {
        long __functionAddress = GLES.getICD().glGenRenderbuffers;
        callPV(renderbuffers.length, renderbuffers, __functionAddress);
    }

    /** {@code void glGenTextures(GLsizei n, GLuint * textures)} */
    public static void glGenTextures(@NativeType("GLuint *") int[] textures) {
        long __functionAddress = GLES.getICD().glGenTextures;
        callPV(textures.length, textures, __functionAddress);
    }

    /** {@code void glGetActiveAttrib(GLuint program, GLuint index, GLsizei bufSize, GLsizei * length, GLint * size, GLenum * type, GLchar * name)} */
    public static void glGetActiveAttrib(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLint *") int[] size, @NativeType("GLenum *") int[] type, @NativeType("GLchar *") ByteBuffer name) {
        long __functionAddress = GLES.getICD().glGetActiveAttrib;
        if (CHECKS) {
            checkSafe(length, 1);
            check(size, 1);
            check(type, 1);
        }
        callPPPPV(program, index, name.remaining(), length, size, type, memAddress(name), __functionAddress);
    }

    /** {@code void glGetActiveUniform(GLuint program, GLuint index, GLsizei bufSize, GLsizei * length, GLint * size, GLenum * type, GLchar * name)} */
    public static void glGetActiveUniform(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLint *") int[] size, @NativeType("GLenum *") int[] type, @NativeType("GLchar *") ByteBuffer name) {
        long __functionAddress = GLES.getICD().glGetActiveUniform;
        if (CHECKS) {
            checkSafe(length, 1);
            check(size, 1);
            check(type, 1);
        }
        callPPPPV(program, index, name.remaining(), length, size, type, memAddress(name), __functionAddress);
    }

    /** {@code void glGetAttachedShaders(GLuint program, GLsizei maxCount, GLsizei * count, GLuint * shaders)} */
    public static void glGetAttachedShaders(@NativeType("GLuint") int program, @NativeType("GLsizei *") int @Nullable [] count, @NativeType("GLuint *") int[] shaders) {
        long __functionAddress = GLES.getICD().glGetAttachedShaders;
        if (CHECKS) {
            checkSafe(count, 1);
        }
        callPPV(program, shaders.length, count, shaders, __functionAddress);
    }

    /** {@code void glGetBufferParameteriv(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetBufferParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetBufferParameteriv;
        if (CHECKS) {
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** {@code void glGetFloatv(GLenum pname, GLfloat * data)} */
    public static void glGetFloatv(@NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] data) {
        long __functionAddress = GLES.getICD().glGetFloatv;
        if (CHECKS) {
            check(data, 1);
        }
        callPV(pname, data, __functionAddress);
    }

    /** {@code void glGetFramebufferAttachmentParameteriv(GLenum target, GLenum attachment, GLenum pname, GLint * params)} */
    public static void glGetFramebufferAttachmentParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetFramebufferAttachmentParameteriv;
        if (CHECKS) {
            check(params, 1);
        }
        callPV(target, attachment, pname, params, __functionAddress);
    }

    /** {@code void glGetIntegerv(GLenum pname, GLint * data)} */
    public static void glGetIntegerv(@NativeType("GLenum") int pname, @NativeType("GLint *") int[] data) {
        long __functionAddress = GLES.getICD().glGetIntegerv;
        if (CHECKS) {
            check(data, 1);
        }
        callPV(pname, data, __functionAddress);
    }

    /** {@code void glGetProgramiv(GLuint program, GLenum pname, GLint * params)} */
    public static void glGetProgramiv(@NativeType("GLuint") int program, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetProgramiv;
        if (CHECKS) {
            check(params, 1);
        }
        callPV(program, pname, params, __functionAddress);
    }

    /** {@code void glGetProgramInfoLog(GLuint program, GLsizei bufSize, GLsizei * length, GLchar * infoLog)} */
    public static void glGetProgramInfoLog(@NativeType("GLuint") int program, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLchar *") ByteBuffer infoLog) {
        long __functionAddress = GLES.getICD().glGetProgramInfoLog;
        if (CHECKS) {
            checkSafe(length, 1);
        }
        callPPV(program, infoLog.remaining(), length, memAddress(infoLog), __functionAddress);
    }

    /** {@code void glGetRenderbufferParameteriv(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetRenderbufferParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetRenderbufferParameteriv;
        if (CHECKS) {
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** {@code void glGetShaderiv(GLuint shader, GLenum pname, GLint * params)} */
    public static void glGetShaderiv(@NativeType("GLuint") int shader, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetShaderiv;
        if (CHECKS) {
            check(params, 1);
        }
        callPV(shader, pname, params, __functionAddress);
    }

    /** {@code void glGetShaderInfoLog(GLuint shader, GLsizei bufSize, GLsizei * length, GLchar * infoLog)} */
    public static void glGetShaderInfoLog(@NativeType("GLuint") int shader, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLchar *") ByteBuffer infoLog) {
        long __functionAddress = GLES.getICD().glGetShaderInfoLog;
        if (CHECKS) {
            checkSafe(length, 1);
        }
        callPPV(shader, infoLog.remaining(), length, memAddress(infoLog), __functionAddress);
    }

    /** {@code void glGetShaderPrecisionFormat(GLenum shadertype, GLenum precisiontype, GLint * range, GLint * precision)} */
    public static void glGetShaderPrecisionFormat(@NativeType("GLenum") int shadertype, @NativeType("GLenum") int precisiontype, @NativeType("GLint *") int[] range, @NativeType("GLint *") int[] precision) {
        long __functionAddress = GLES.getICD().glGetShaderPrecisionFormat;
        if (CHECKS) {
            check(range, 2);
            check(precision, 2);
        }
        callPPV(shadertype, precisiontype, range, precision, __functionAddress);
    }

    /** {@code void glGetShaderSource(GLuint shader, GLsizei bufSize, GLsizei * length, GLchar * source)} */
    public static void glGetShaderSource(@NativeType("GLuint") int shader, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLchar *") ByteBuffer source) {
        long __functionAddress = GLES.getICD().glGetShaderSource;
        if (CHECKS) {
            checkSafe(length, 1);
        }
        callPPV(shader, source.remaining(), length, memAddress(source), __functionAddress);
    }

    /** {@code void glGetTexParameterfv(GLenum target, GLenum pname, GLfloat * params)} */
    public static void glGetTexParameterfv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GLES.getICD().glGetTexParameterfv;
        if (CHECKS) {
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** {@code void glGetTexParameteriv(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetTexParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetTexParameteriv;
        if (CHECKS) {
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** {@code void glGetUniformfv(GLuint program, GLint location, GLfloat * params)} */
    public static void glGetUniformfv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GLES.getICD().glGetUniformfv;
        if (CHECKS) {
            check(params, 1);
        }
        callPV(program, location, params, __functionAddress);
    }

    /** {@code void glGetUniformiv(GLuint program, GLint location, GLint * params)} */
    public static void glGetUniformiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetUniformiv;
        if (CHECKS) {
            check(params, 1);
        }
        callPV(program, location, params, __functionAddress);
    }

    /** {@code void glGetVertexAttribfv(GLuint index, GLenum pname, GLfloat * params)} */
    public static void glGetVertexAttribfv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GLES.getICD().glGetVertexAttribfv;
        if (CHECKS) {
            check(params, 4);
        }
        callPV(index, pname, params, __functionAddress);
    }

    /** {@code void glGetVertexAttribiv(GLuint index, GLenum pname, GLint * params)} */
    public static void glGetVertexAttribiv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetVertexAttribiv;
        if (CHECKS) {
            check(params, 4);
        }
        callPV(index, pname, params, __functionAddress);
    }

    /** {@code void glReadPixels(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, void * pixels)} */
    public static void glReadPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") short[] pixels) {
        long __functionAddress = GLES.getICD().glReadPixels;
        callPV(x, y, width, height, format, type, pixels, __functionAddress);
    }

    /** {@code void glReadPixels(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, void * pixels)} */
    public static void glReadPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") int[] pixels) {
        long __functionAddress = GLES.getICD().glReadPixels;
        callPV(x, y, width, height, format, type, pixels, __functionAddress);
    }

    /** {@code void glReadPixels(GLint x, GLint y, GLsizei width, GLsizei height, GLenum format, GLenum type, void * pixels)} */
    public static void glReadPixels(@NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void *") float[] pixels) {
        long __functionAddress = GLES.getICD().glReadPixels;
        callPV(x, y, width, height, format, type, pixels, __functionAddress);
    }

    /** {@code void glShaderBinary(GLsizei count, GLuint const * shaders, GLenum binaryformat, void const * binary, GLsizei length)} */
    public static void glShaderBinary(@NativeType("GLuint const *") int[] shaders, @NativeType("GLenum") int binaryformat, @NativeType("void const *") ByteBuffer binary) {
        long __functionAddress = GLES.getICD().glShaderBinary;
        callPPV(shaders.length, shaders, binaryformat, memAddress(binary), binary.remaining(), __functionAddress);
    }

    /** {@code void glShaderSource(GLuint shader, GLsizei count, GLchar const * const * string, GLint const * length)} */
    public static void glShaderSource(@NativeType("GLuint") int shader, @NativeType("GLchar const * const *") PointerBuffer string, @NativeType("GLint const *") int @Nullable [] length) {
        long __functionAddress = GLES.getICD().glShaderSource;
        if (CHECKS) {
            checkSafe(length, string.remaining());
        }
        callPPV(shader, string.remaining(), memAddress(string), length, __functionAddress);
    }

    /** {@code void glTexImage2D(GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short @Nullable [] pixels) {
        long __functionAddress = GLES.getICD().glTexImage2D;
        callPV(target, level, internalformat, width, height, border, format, type, pixels, __functionAddress);
    }

    /** {@code void glTexImage2D(GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int @Nullable [] pixels) {
        long __functionAddress = GLES.getICD().glTexImage2D;
        callPV(target, level, internalformat, width, height, border, format, type, pixels, __functionAddress);
    }

    /** {@code void glTexImage2D(GLenum target, GLint level, GLint internalformat, GLsizei width, GLsizei height, GLint border, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float @Nullable [] pixels) {
        long __functionAddress = GLES.getICD().glTexImage2D;
        callPV(target, level, internalformat, width, height, border, format, type, pixels, __functionAddress);
    }

    /** {@code void glTexParameterfv(GLenum target, GLenum pname, GLfloat const * params)} */
    public static void glTexParameterfv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") float[] params) {
        long __functionAddress = GLES.getICD().glTexParameterfv;
        if (CHECKS) {
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** {@code void glTexParameteriv(GLenum target, GLenum pname, GLint const * params)} */
    public static void glTexParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        long __functionAddress = GLES.getICD().glTexParameteriv;
        if (CHECKS) {
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** {@code void glTexSubImage2D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexSubImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short[] pixels) {
        long __functionAddress = GLES.getICD().glTexSubImage2D;
        callPV(target, level, xoffset, yoffset, width, height, format, type, pixels, __functionAddress);
    }

    /** {@code void glTexSubImage2D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexSubImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int[] pixels) {
        long __functionAddress = GLES.getICD().glTexSubImage2D;
        callPV(target, level, xoffset, yoffset, width, height, format, type, pixels, __functionAddress);
    }

    /** {@code void glTexSubImage2D(GLenum target, GLint level, GLint xoffset, GLint yoffset, GLsizei width, GLsizei height, GLenum format, GLenum type, void const * pixels)} */
    public static void glTexSubImage2D(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float[] pixels) {
        long __functionAddress = GLES.getICD().glTexSubImage2D;
        callPV(target, level, xoffset, yoffset, width, height, format, type, pixels, __functionAddress);
    }

    /** {@code void glUniform1fv(GLint location, GLsizei count, GLfloat const * value)} */
    public static void glUniform1fv(@NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glUniform1fv;
        callPV(location, value.length, value, __functionAddress);
    }

    /** {@code void glUniform1iv(GLint location, GLsizei count, GLint const * value)} */
    public static void glUniform1iv(@NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        long __functionAddress = GLES.getICD().glUniform1iv;
        callPV(location, value.length, value, __functionAddress);
    }

    /** {@code void glUniform2fv(GLint location, GLsizei count, GLfloat const * value)} */
    public static void glUniform2fv(@NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glUniform2fv;
        callPV(location, value.length >> 1, value, __functionAddress);
    }

    /** {@code void glUniform2iv(GLint location, GLsizei count, GLint const * value)} */
    public static void glUniform2iv(@NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        long __functionAddress = GLES.getICD().glUniform2iv;
        callPV(location, value.length >> 1, value, __functionAddress);
    }

    /** {@code void glUniform3fv(GLint location, GLsizei count, GLfloat const * value)} */
    public static void glUniform3fv(@NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glUniform3fv;
        callPV(location, value.length / 3, value, __functionAddress);
    }

    /** {@code void glUniform3iv(GLint location, GLsizei count, GLint const * value)} */
    public static void glUniform3iv(@NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        long __functionAddress = GLES.getICD().glUniform3iv;
        callPV(location, value.length / 3, value, __functionAddress);
    }

    /** {@code void glUniform4fv(GLint location, GLsizei count, GLfloat const * value)} */
    public static void glUniform4fv(@NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glUniform4fv;
        callPV(location, value.length >> 2, value, __functionAddress);
    }

    /** {@code void glUniform4iv(GLint location, GLsizei count, GLint const * value)} */
    public static void glUniform4iv(@NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        long __functionAddress = GLES.getICD().glUniform4iv;
        callPV(location, value.length >> 2, value, __functionAddress);
    }

    /** {@code void glUniformMatrix2fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glUniformMatrix2fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glUniformMatrix2fv;
        callPV(location, value.length >> 2, transpose, value, __functionAddress);
    }

    /** {@code void glUniformMatrix3fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glUniformMatrix3fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glUniformMatrix3fv;
        callPV(location, value.length / 9, transpose, value, __functionAddress);
    }

    /** {@code void glUniformMatrix4fv(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glUniformMatrix4fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GLES.getICD().glUniformMatrix4fv;
        callPV(location, value.length >> 4, transpose, value, __functionAddress);
    }

    /** {@code void glVertexAttrib1fv(GLuint index, GLfloat const * v)} */
    public static void glVertexAttrib1fv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GLES.getICD().glVertexAttrib1fv;
        if (CHECKS) {
            check(v, 1);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttrib2fv(GLuint index, GLfloat const * v)} */
    public static void glVertexAttrib2fv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GLES.getICD().glVertexAttrib2fv;
        if (CHECKS) {
            check(v, 2);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttrib3fv(GLuint index, GLfloat const * v)} */
    public static void glVertexAttrib3fv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GLES.getICD().glVertexAttrib3fv;
        if (CHECKS) {
            check(v, 3);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttrib4fv(GLuint index, GLfloat const * v)} */
    public static void glVertexAttrib4fv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GLES.getICD().glVertexAttrib4fv;
        if (CHECKS) {
            check(v, 4);
        }
        callPV(index, v, __functionAddress);
    }

}
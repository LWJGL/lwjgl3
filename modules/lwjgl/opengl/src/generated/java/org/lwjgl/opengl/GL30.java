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

public class GL30 extends GL21 {

    static { GL.initialize(); }

    public static final int
        GL_MAJOR_VERSION                       = 0x821B,
        GL_MINOR_VERSION                       = 0x821C,
        GL_NUM_EXTENSIONS                      = 0x821D,
        GL_CONTEXT_FLAGS                       = 0x821E,
        GL_CONTEXT_FLAG_FORWARD_COMPATIBLE_BIT = 0x1;

    public static final int
        GL_COMPARE_REF_TO_TEXTURE = GL14.GL_COMPARE_R_TO_TEXTURE,
        GL_CLIP_DISTANCE0         = GL11.GL_CLIP_PLANE0,
        GL_CLIP_DISTANCE1         = GL11.GL_CLIP_PLANE1,
        GL_CLIP_DISTANCE2         = GL11.GL_CLIP_PLANE2,
        GL_CLIP_DISTANCE3         = GL11.GL_CLIP_PLANE3,
        GL_CLIP_DISTANCE4         = GL11.GL_CLIP_PLANE4,
        GL_CLIP_DISTANCE5         = GL11.GL_CLIP_PLANE5,
        GL_CLIP_DISTANCE6         = 0x3006,
        GL_CLIP_DISTANCE7         = 0x3007,
        GL_MAX_CLIP_DISTANCES     = GL11.GL_MAX_CLIP_PLANES,
        GL_MAX_VARYING_COMPONENTS = GL20.GL_MAX_VARYING_FLOATS;

    public static final int GL_VERTEX_ATTRIB_ARRAY_INTEGER = 0x88FD;

    public static final int
        GL_SAMPLER_1D_ARRAY              = 0x8DC0,
        GL_SAMPLER_2D_ARRAY              = 0x8DC1,
        GL_SAMPLER_1D_ARRAY_SHADOW       = 0x8DC3,
        GL_SAMPLER_2D_ARRAY_SHADOW       = 0x8DC4,
        GL_SAMPLER_CUBE_SHADOW           = 0x8DC5,
        GL_UNSIGNED_INT_VEC2             = 0x8DC6,
        GL_UNSIGNED_INT_VEC3             = 0x8DC7,
        GL_UNSIGNED_INT_VEC4             = 0x8DC8,
        GL_INT_SAMPLER_1D                = 0x8DC9,
        GL_INT_SAMPLER_2D                = 0x8DCA,
        GL_INT_SAMPLER_3D                = 0x8DCB,
        GL_INT_SAMPLER_CUBE              = 0x8DCC,
        GL_INT_SAMPLER_1D_ARRAY          = 0x8DCE,
        GL_INT_SAMPLER_2D_ARRAY          = 0x8DCF,
        GL_UNSIGNED_INT_SAMPLER_1D       = 0x8DD1,
        GL_UNSIGNED_INT_SAMPLER_2D       = 0x8DD2,
        GL_UNSIGNED_INT_SAMPLER_3D       = 0x8DD3,
        GL_UNSIGNED_INT_SAMPLER_CUBE     = 0x8DD4,
        GL_UNSIGNED_INT_SAMPLER_1D_ARRAY = 0x8DD6,
        GL_UNSIGNED_INT_SAMPLER_2D_ARRAY = 0x8DD7;

    public static final int
        GL_MIN_PROGRAM_TEXEL_OFFSET = 0x8904,
        GL_MAX_PROGRAM_TEXEL_OFFSET = 0x8905;

    public static final int
        GL_QUERY_WAIT              = 0x8E13,
        GL_QUERY_NO_WAIT           = 0x8E14,
        GL_QUERY_BY_REGION_WAIT    = 0x8E15,
        GL_QUERY_BY_REGION_NO_WAIT = 0x8E16;

    public static final int
        GL_MAP_READ_BIT              = 0x1,
        GL_MAP_WRITE_BIT             = 0x2,
        GL_MAP_INVALIDATE_RANGE_BIT  = 0x4,
        GL_MAP_INVALIDATE_BUFFER_BIT = 0x8,
        GL_MAP_FLUSH_EXPLICIT_BIT    = 0x10,
        GL_MAP_UNSYNCHRONIZED_BIT    = 0x20;

    public static final int
        GL_BUFFER_ACCESS_FLAGS = 0x911F,
        GL_BUFFER_MAP_LENGTH   = 0x9120,
        GL_BUFFER_MAP_OFFSET   = 0x9121;

    public static final int
        GL_CLAMP_VERTEX_COLOR   = 0x891A,
        GL_CLAMP_FRAGMENT_COLOR = 0x891B,
        GL_CLAMP_READ_COLOR     = 0x891C;

    public static final int GL_FIXED_ONLY = 0x891D;

    public static final int
        GL_DEPTH_COMPONENT32F = 0x8CAC,
        GL_DEPTH32F_STENCIL8  = 0x8CAD;

    public static final int GL_FLOAT_32_UNSIGNED_INT_24_8_REV = 0x8DAD;

    public static final int
        GL_TEXTURE_RED_TYPE       = 0x8C10,
        GL_TEXTURE_GREEN_TYPE     = 0x8C11,
        GL_TEXTURE_BLUE_TYPE      = 0x8C12,
        GL_TEXTURE_ALPHA_TYPE     = 0x8C13,
        GL_TEXTURE_LUMINANCE_TYPE = 0x8C14,
        GL_TEXTURE_INTENSITY_TYPE = 0x8C15,
        GL_TEXTURE_DEPTH_TYPE     = 0x8C16;

    public static final int GL_UNSIGNED_NORMALIZED = 0x8C17;

    public static final int
        GL_RGBA32F = 0x8814,
        GL_RGB32F  = 0x8815,
        GL_RGBA16F = 0x881A,
        GL_RGB16F  = 0x881B;

    public static final int GL_R11F_G11F_B10F = 0x8C3A;

    public static final int GL_UNSIGNED_INT_10F_11F_11F_REV = 0x8C3B;

    public static final int GL_RGB9_E5 = 0x8C3D;

    public static final int GL_UNSIGNED_INT_5_9_9_9_REV = 0x8C3E;

    public static final int GL_TEXTURE_SHARED_SIZE = 0x8C3F;

    public static final int
        GL_FRAMEBUFFER      = 0x8D40,
        GL_READ_FRAMEBUFFER = 0x8CA8,
        GL_DRAW_FRAMEBUFFER = 0x8CA9;

    public static final int GL_RENDERBUFFER = 0x8D41;

    public static final int
        GL_STENCIL_INDEX1  = 0x8D46,
        GL_STENCIL_INDEX4  = 0x8D47,
        GL_STENCIL_INDEX8  = 0x8D48,
        GL_STENCIL_INDEX16 = 0x8D49;

    public static final int
        GL_RENDERBUFFER_WIDTH           = 0x8D42,
        GL_RENDERBUFFER_HEIGHT          = 0x8D43,
        GL_RENDERBUFFER_INTERNAL_FORMAT = 0x8D44,
        GL_RENDERBUFFER_RED_SIZE        = 0x8D50,
        GL_RENDERBUFFER_GREEN_SIZE      = 0x8D51,
        GL_RENDERBUFFER_BLUE_SIZE       = 0x8D52,
        GL_RENDERBUFFER_ALPHA_SIZE      = 0x8D53,
        GL_RENDERBUFFER_DEPTH_SIZE      = 0x8D54,
        GL_RENDERBUFFER_STENCIL_SIZE    = 0x8D55,
        GL_RENDERBUFFER_SAMPLES         = 0x8CAB;

    public static final int
        GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE           = 0x8CD0,
        GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME           = 0x8CD1,
        GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL         = 0x8CD2,
        GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE = 0x8CD3,
        GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER         = 0x8CD4,
        GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING        = 0x8210,
        GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE        = 0x8211,
        GL_FRAMEBUFFER_ATTACHMENT_RED_SIZE              = 0x8212,
        GL_FRAMEBUFFER_ATTACHMENT_GREEN_SIZE            = 0x8213,
        GL_FRAMEBUFFER_ATTACHMENT_BLUE_SIZE             = 0x8214,
        GL_FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE            = 0x8215,
        GL_FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE            = 0x8216,
        GL_FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE          = 0x8217;

    public static final int
        GL_FRAMEBUFFER_DEFAULT = 0x8218,
        GL_INDEX               = 0x8222;

    public static final int
        GL_COLOR_ATTACHMENT0        = 0x8CE0,
        GL_COLOR_ATTACHMENT1        = 0x8CE1,
        GL_COLOR_ATTACHMENT2        = 0x8CE2,
        GL_COLOR_ATTACHMENT3        = 0x8CE3,
        GL_COLOR_ATTACHMENT4        = 0x8CE4,
        GL_COLOR_ATTACHMENT5        = 0x8CE5,
        GL_COLOR_ATTACHMENT6        = 0x8CE6,
        GL_COLOR_ATTACHMENT7        = 0x8CE7,
        GL_COLOR_ATTACHMENT8        = 0x8CE8,
        GL_COLOR_ATTACHMENT9        = 0x8CE9,
        GL_COLOR_ATTACHMENT10       = 0x8CEA,
        GL_COLOR_ATTACHMENT11       = 0x8CEB,
        GL_COLOR_ATTACHMENT12       = 0x8CEC,
        GL_COLOR_ATTACHMENT13       = 0x8CED,
        GL_COLOR_ATTACHMENT14       = 0x8CEE,
        GL_COLOR_ATTACHMENT15       = 0x8CEF,
        GL_COLOR_ATTACHMENT16       = 0x8CF0,
        GL_COLOR_ATTACHMENT17       = 0x8CF1,
        GL_COLOR_ATTACHMENT18       = 0x8CF2,
        GL_COLOR_ATTACHMENT19       = 0x8CF3,
        GL_COLOR_ATTACHMENT20       = 0x8CF4,
        GL_COLOR_ATTACHMENT21       = 0x8CF5,
        GL_COLOR_ATTACHMENT22       = 0x8CF6,
        GL_COLOR_ATTACHMENT23       = 0x8CF7,
        GL_COLOR_ATTACHMENT24       = 0x8CF8,
        GL_COLOR_ATTACHMENT25       = 0x8CF9,
        GL_COLOR_ATTACHMENT26       = 0x8CFA,
        GL_COLOR_ATTACHMENT27       = 0x8CFB,
        GL_COLOR_ATTACHMENT28       = 0x8CFC,
        GL_COLOR_ATTACHMENT29       = 0x8CFD,
        GL_COLOR_ATTACHMENT30       = 0x8CFE,
        GL_COLOR_ATTACHMENT31       = 0x8CFF,
        GL_DEPTH_ATTACHMENT         = 0x8D00,
        GL_STENCIL_ATTACHMENT       = 0x8D20,
        GL_DEPTH_STENCIL_ATTACHMENT = 0x821A;

    public static final int GL_MAX_SAMPLES = 0x8D57;

    public static final int
        GL_FRAMEBUFFER_COMPLETE                      = 0x8CD5,
        GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT         = 0x8CD6,
        GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT = 0x8CD7,
        GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER        = 0x8CDB,
        GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER        = 0x8CDC,
        GL_FRAMEBUFFER_UNSUPPORTED                   = 0x8CDD,
        GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE        = 0x8D56,
        GL_FRAMEBUFFER_UNDEFINED                     = 0x8219;

    public static final int
        GL_FRAMEBUFFER_BINDING      = 0x8CA6,
        GL_DRAW_FRAMEBUFFER_BINDING = 0x8CA6,
        GL_READ_FRAMEBUFFER_BINDING = 0x8CAA,
        GL_RENDERBUFFER_BINDING     = 0x8CA7,
        GL_MAX_COLOR_ATTACHMENTS    = 0x8CDF,
        GL_MAX_RENDERBUFFER_SIZE    = 0x84E8;

    public static final int GL_INVALID_FRAMEBUFFER_OPERATION = 0x506;

    public static final int GL_DEPTH_STENCIL = 0x84F9;

    public static final int GL_UNSIGNED_INT_24_8 = 0x84FA;

    public static final int GL_DEPTH24_STENCIL8 = 0x88F0;

    public static final int GL_TEXTURE_STENCIL_SIZE = 0x88F1;

    public static final int GL_HALF_FLOAT = 0x140B;

    public static final int
        GL_RGBA32UI = 0x8D70,
        GL_RGB32UI  = 0x8D71,
        GL_RGBA16UI = 0x8D76,
        GL_RGB16UI  = 0x8D77,
        GL_RGBA8UI  = 0x8D7C,
        GL_RGB8UI   = 0x8D7D,
        GL_RGBA32I  = 0x8D82,
        GL_RGB32I   = 0x8D83,
        GL_RGBA16I  = 0x8D88,
        GL_RGB16I   = 0x8D89,
        GL_RGBA8I   = 0x8D8E,
        GL_RGB8I    = 0x8D8F;

    public static final int
        GL_RED_INTEGER   = 0x8D94,
        GL_GREEN_INTEGER = 0x8D95,
        GL_BLUE_INTEGER  = 0x8D96,
        GL_ALPHA_INTEGER = 0x8D97,
        GL_RGB_INTEGER   = 0x8D98,
        GL_RGBA_INTEGER  = 0x8D99,
        GL_BGR_INTEGER   = 0x8D9A,
        GL_BGRA_INTEGER  = 0x8D9B;

    public static final int
        GL_TEXTURE_1D_ARRAY = 0x8C18,
        GL_TEXTURE_2D_ARRAY = 0x8C1A;

    public static final int GL_PROXY_TEXTURE_2D_ARRAY = 0x8C1B;

    public static final int GL_PROXY_TEXTURE_1D_ARRAY = 0x8C19;

    public static final int
        GL_TEXTURE_BINDING_1D_ARRAY = 0x8C1C,
        GL_TEXTURE_BINDING_2D_ARRAY = 0x8C1D,
        GL_MAX_ARRAY_TEXTURE_LAYERS = 0x88FF;

    public static final int
        GL_COMPRESSED_RED_RGTC1        = 0x8DBB,
        GL_COMPRESSED_SIGNED_RED_RGTC1 = 0x8DBC,
        GL_COMPRESSED_RG_RGTC2         = 0x8DBD,
        GL_COMPRESSED_SIGNED_RG_RGTC2  = 0x8DBE;

    public static final int
        GL_R8             = 0x8229,
        GL_R16            = 0x822A,
        GL_RG8            = 0x822B,
        GL_RG16           = 0x822C,
        GL_R16F           = 0x822D,
        GL_R32F           = 0x822E,
        GL_RG16F          = 0x822F,
        GL_RG32F          = 0x8230,
        GL_R8I            = 0x8231,
        GL_R8UI           = 0x8232,
        GL_R16I           = 0x8233,
        GL_R16UI          = 0x8234,
        GL_R32I           = 0x8235,
        GL_R32UI          = 0x8236,
        GL_RG8I           = 0x8237,
        GL_RG8UI          = 0x8238,
        GL_RG16I          = 0x8239,
        GL_RG16UI         = 0x823A,
        GL_RG32I          = 0x823B,
        GL_RG32UI         = 0x823C,
        GL_RG             = 0x8227,
        GL_COMPRESSED_RED = 0x8225,
        GL_COMPRESSED_RG  = 0x8226;

    public static final int GL_RG_INTEGER = 0x8228;

    public static final int GL_TRANSFORM_FEEDBACK_BUFFER = 0x8C8E;

    public static final int
        GL_TRANSFORM_FEEDBACK_BUFFER_START = 0x8C84,
        GL_TRANSFORM_FEEDBACK_BUFFER_SIZE  = 0x8C85;

    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_BINDING = 0x8C8F;

    public static final int
        GL_INTERLEAVED_ATTRIBS = 0x8C8C,
        GL_SEPARATE_ATTRIBS    = 0x8C8D;

    public static final int
        GL_PRIMITIVES_GENERATED                  = 0x8C87,
        GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN = 0x8C88;

    public static final int GL_RASTERIZER_DISCARD = 0x8C89;

    public static final int
        GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS = 0x8C8A,
        GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS       = 0x8C8B,
        GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS    = 0x8C80;

    public static final int
        GL_TRANSFORM_FEEDBACK_VARYINGS           = 0x8C83,
        GL_TRANSFORM_FEEDBACK_BUFFER_MODE        = 0x8C7F,
        GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH = 0x8C76;

    public static final int GL_VERTEX_ARRAY_BINDING = 0x85B5;

    public static final int GL_FRAMEBUFFER_SRGB = 0x8DB9;

    protected GL30() {
        throw new UnsupportedOperationException();
    }

    // --- [ glGetStringi ] ---

    /** {@code GLubyte const * glGetStringi(GLenum name, GLuint index)} */
    public static long nglGetStringi(int name, int index) {
        return GL30C.nglGetStringi(name, index);
    }

    /** {@code GLubyte const * glGetStringi(GLenum name, GLuint index)} */
    @NativeType("GLubyte const *")
    public static @Nullable String glGetStringi(@NativeType("GLenum") int name, @NativeType("GLuint") int index) {
        return GL30C.glGetStringi(name, index);
    }

    // --- [ glClearBufferiv ] ---

    /** {@code void glClearBufferiv(GLenum buffer, GLint drawbuffer, GLint const * value)} */
    public static void nglClearBufferiv(int buffer, int drawbuffer, long value) {
        GL30C.nglClearBufferiv(buffer, drawbuffer, value);
    }

    /** {@code void glClearBufferiv(GLenum buffer, GLint drawbuffer, GLint const * value)} */
    public static void glClearBufferiv(@NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLint const *") IntBuffer value) {
        GL30C.glClearBufferiv(buffer, drawbuffer, value);
    }

    // --- [ glClearBufferuiv ] ---

    /** {@code void glClearBufferuiv(GLenum buffer, GLint drawbuffer, GLint const * value)} */
    public static void nglClearBufferuiv(int buffer, int drawbuffer, long value) {
        GL30C.nglClearBufferuiv(buffer, drawbuffer, value);
    }

    /** {@code void glClearBufferuiv(GLenum buffer, GLint drawbuffer, GLint const * value)} */
    public static void glClearBufferuiv(@NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLint const *") IntBuffer value) {
        GL30C.glClearBufferuiv(buffer, drawbuffer, value);
    }

    // --- [ glClearBufferfv ] ---

    /** {@code void glClearBufferfv(GLenum buffer, GLint drawbuffer, GLfloat const * value)} */
    public static void nglClearBufferfv(int buffer, int drawbuffer, long value) {
        GL30C.nglClearBufferfv(buffer, drawbuffer, value);
    }

    /** {@code void glClearBufferfv(GLenum buffer, GLint drawbuffer, GLfloat const * value)} */
    public static void glClearBufferfv(@NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLfloat const *") FloatBuffer value) {
        GL30C.glClearBufferfv(buffer, drawbuffer, value);
    }

    // --- [ glClearBufferfi ] ---

    /** {@code void glClearBufferfi(GLenum buffer, GLint drawbuffer, GLfloat depth, GLint stencil)} */
    public static void glClearBufferfi(@NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLfloat") float depth, @NativeType("GLint") int stencil) {
        GL30C.glClearBufferfi(buffer, drawbuffer, depth, stencil);
    }

    // --- [ glVertexAttribI1i ] ---

    /** {@code void glVertexAttribI1i(GLuint index, GLint x)} */
    public static void glVertexAttribI1i(@NativeType("GLuint") int index, @NativeType("GLint") int x) {
        GL30C.glVertexAttribI1i(index, x);
    }

    // --- [ glVertexAttribI2i ] ---

    /** {@code void glVertexAttribI2i(GLuint index, GLint x, GLint y)} */
    public static void glVertexAttribI2i(@NativeType("GLuint") int index, @NativeType("GLint") int x, @NativeType("GLint") int y) {
        GL30C.glVertexAttribI2i(index, x, y);
    }

    // --- [ glVertexAttribI3i ] ---

    /** {@code void glVertexAttribI3i(GLuint index, GLint x, GLint y, GLint z)} */
    public static void glVertexAttribI3i(@NativeType("GLuint") int index, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z) {
        GL30C.glVertexAttribI3i(index, x, y, z);
    }

    // --- [ glVertexAttribI4i ] ---

    /** {@code void glVertexAttribI4i(GLuint index, GLint x, GLint y, GLint z, GLint w)} */
    public static void glVertexAttribI4i(@NativeType("GLuint") int index, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z, @NativeType("GLint") int w) {
        GL30C.glVertexAttribI4i(index, x, y, z, w);
    }

    // --- [ glVertexAttribI1ui ] ---

    /** {@code void glVertexAttribI1ui(GLuint index, GLuint x)} */
    public static void glVertexAttribI1ui(@NativeType("GLuint") int index, @NativeType("GLuint") int x) {
        GL30C.glVertexAttribI1ui(index, x);
    }

    // --- [ glVertexAttribI2ui ] ---

    /** {@code void glVertexAttribI2ui(GLuint index, GLuint x, GLuint y)} */
    public static void glVertexAttribI2ui(@NativeType("GLuint") int index, @NativeType("GLuint") int x, @NativeType("GLuint") int y) {
        GL30C.glVertexAttribI2ui(index, x, y);
    }

    // --- [ glVertexAttribI3ui ] ---

    /** {@code void glVertexAttribI3ui(GLuint index, GLint x, GLint y, GLint z)} */
    public static void glVertexAttribI3ui(@NativeType("GLuint") int index, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z) {
        GL30C.glVertexAttribI3ui(index, x, y, z);
    }

    // --- [ glVertexAttribI4ui ] ---

    /** {@code void glVertexAttribI4ui(GLuint index, GLint x, GLint y, GLint z, GLint w)} */
    public static void glVertexAttribI4ui(@NativeType("GLuint") int index, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z, @NativeType("GLint") int w) {
        GL30C.glVertexAttribI4ui(index, x, y, z, w);
    }

    // --- [ glVertexAttribI1iv ] ---

    /** {@code void glVertexAttribI1iv(GLuint index, GLint const * v)} */
    public static void nglVertexAttribI1iv(int index, long v) {
        GL30C.nglVertexAttribI1iv(index, v);
    }

    /** {@code void glVertexAttribI1iv(GLuint index, GLint const * v)} */
    public static void glVertexAttribI1iv(@NativeType("GLuint") int index, @NativeType("GLint const *") IntBuffer v) {
        GL30C.glVertexAttribI1iv(index, v);
    }

    // --- [ glVertexAttribI2iv ] ---

    /** {@code void glVertexAttribI2iv(GLuint index, GLint const * v)} */
    public static void nglVertexAttribI2iv(int index, long v) {
        GL30C.nglVertexAttribI2iv(index, v);
    }

    /** {@code void glVertexAttribI2iv(GLuint index, GLint const * v)} */
    public static void glVertexAttribI2iv(@NativeType("GLuint") int index, @NativeType("GLint const *") IntBuffer v) {
        GL30C.glVertexAttribI2iv(index, v);
    }

    // --- [ glVertexAttribI3iv ] ---

    /** {@code void glVertexAttribI3iv(GLuint index, GLint const * v)} */
    public static void nglVertexAttribI3iv(int index, long v) {
        GL30C.nglVertexAttribI3iv(index, v);
    }

    /** {@code void glVertexAttribI3iv(GLuint index, GLint const * v)} */
    public static void glVertexAttribI3iv(@NativeType("GLuint") int index, @NativeType("GLint const *") IntBuffer v) {
        GL30C.glVertexAttribI3iv(index, v);
    }

    // --- [ glVertexAttribI4iv ] ---

    /** {@code void glVertexAttribI4iv(GLuint index, GLint const * v)} */
    public static void nglVertexAttribI4iv(int index, long v) {
        GL30C.nglVertexAttribI4iv(index, v);
    }

    /** {@code void glVertexAttribI4iv(GLuint index, GLint const * v)} */
    public static void glVertexAttribI4iv(@NativeType("GLuint") int index, @NativeType("GLint const *") IntBuffer v) {
        GL30C.glVertexAttribI4iv(index, v);
    }

    // --- [ glVertexAttribI1uiv ] ---

    /** {@code void glVertexAttribI1uiv(GLuint index, GLuint const * v)} */
    public static void nglVertexAttribI1uiv(int index, long v) {
        GL30C.nglVertexAttribI1uiv(index, v);
    }

    /** {@code void glVertexAttribI1uiv(GLuint index, GLuint const * v)} */
    public static void glVertexAttribI1uiv(@NativeType("GLuint") int index, @NativeType("GLuint const *") IntBuffer v) {
        GL30C.glVertexAttribI1uiv(index, v);
    }

    // --- [ glVertexAttribI2uiv ] ---

    /** {@code void glVertexAttribI2uiv(GLuint index, GLuint const * v)} */
    public static void nglVertexAttribI2uiv(int index, long v) {
        GL30C.nglVertexAttribI2uiv(index, v);
    }

    /** {@code void glVertexAttribI2uiv(GLuint index, GLuint const * v)} */
    public static void glVertexAttribI2uiv(@NativeType("GLuint") int index, @NativeType("GLuint const *") IntBuffer v) {
        GL30C.glVertexAttribI2uiv(index, v);
    }

    // --- [ glVertexAttribI3uiv ] ---

    /** {@code void glVertexAttribI3uiv(GLuint index, GLuint const * v)} */
    public static void nglVertexAttribI3uiv(int index, long v) {
        GL30C.nglVertexAttribI3uiv(index, v);
    }

    /** {@code void glVertexAttribI3uiv(GLuint index, GLuint const * v)} */
    public static void glVertexAttribI3uiv(@NativeType("GLuint") int index, @NativeType("GLuint const *") IntBuffer v) {
        GL30C.glVertexAttribI3uiv(index, v);
    }

    // --- [ glVertexAttribI4uiv ] ---

    /** {@code void glVertexAttribI4uiv(GLuint index, GLuint const * v)} */
    public static void nglVertexAttribI4uiv(int index, long v) {
        GL30C.nglVertexAttribI4uiv(index, v);
    }

    /** {@code void glVertexAttribI4uiv(GLuint index, GLuint const * v)} */
    public static void glVertexAttribI4uiv(@NativeType("GLuint") int index, @NativeType("GLuint const *") IntBuffer v) {
        GL30C.glVertexAttribI4uiv(index, v);
    }

    // --- [ glVertexAttribI4bv ] ---

    /** {@code void glVertexAttribI4bv(GLuint index, GLbyte const * v)} */
    public static void nglVertexAttribI4bv(int index, long v) {
        GL30C.nglVertexAttribI4bv(index, v);
    }

    /** {@code void glVertexAttribI4bv(GLuint index, GLbyte const * v)} */
    public static void glVertexAttribI4bv(@NativeType("GLuint") int index, @NativeType("GLbyte const *") ByteBuffer v) {
        GL30C.glVertexAttribI4bv(index, v);
    }

    // --- [ glVertexAttribI4sv ] ---

    /** {@code void glVertexAttribI4sv(GLuint index, GLshort const * v)} */
    public static void nglVertexAttribI4sv(int index, long v) {
        GL30C.nglVertexAttribI4sv(index, v);
    }

    /** {@code void glVertexAttribI4sv(GLuint index, GLshort const * v)} */
    public static void glVertexAttribI4sv(@NativeType("GLuint") int index, @NativeType("GLshort const *") ShortBuffer v) {
        GL30C.glVertexAttribI4sv(index, v);
    }

    // --- [ glVertexAttribI4ubv ] ---

    /** {@code void glVertexAttribI4ubv(GLuint index, GLbyte const * v)} */
    public static void nglVertexAttribI4ubv(int index, long v) {
        GL30C.nglVertexAttribI4ubv(index, v);
    }

    /** {@code void glVertexAttribI4ubv(GLuint index, GLbyte const * v)} */
    public static void glVertexAttribI4ubv(@NativeType("GLuint") int index, @NativeType("GLbyte const *") ByteBuffer v) {
        GL30C.glVertexAttribI4ubv(index, v);
    }

    // --- [ glVertexAttribI4usv ] ---

    /** {@code void glVertexAttribI4usv(GLuint index, GLshort const * v)} */
    public static void nglVertexAttribI4usv(int index, long v) {
        GL30C.nglVertexAttribI4usv(index, v);
    }

    /** {@code void glVertexAttribI4usv(GLuint index, GLshort const * v)} */
    public static void glVertexAttribI4usv(@NativeType("GLuint") int index, @NativeType("GLshort const *") ShortBuffer v) {
        GL30C.glVertexAttribI4usv(index, v);
    }

    // --- [ glVertexAttribIPointer ] ---

    /** {@code void glVertexAttribIPointer(GLuint index, GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void nglVertexAttribIPointer(int index, int size, int type, int stride, long pointer) {
        GL30C.nglVertexAttribIPointer(index, size, type, stride, pointer);
    }

    /** {@code void glVertexAttribIPointer(GLuint index, GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void glVertexAttribIPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ByteBuffer pointer) {
        GL30C.glVertexAttribIPointer(index, size, type, stride, pointer);
    }

    /** {@code void glVertexAttribIPointer(GLuint index, GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void glVertexAttribIPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") long pointer) {
        GL30C.glVertexAttribIPointer(index, size, type, stride, pointer);
    }

    /** {@code void glVertexAttribIPointer(GLuint index, GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void glVertexAttribIPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") ShortBuffer pointer) {
        GL30C.glVertexAttribIPointer(index, size, type, stride, pointer);
    }

    /** {@code void glVertexAttribIPointer(GLuint index, GLint size, GLenum type, GLsizei stride, void const * pointer)} */
    public static void glVertexAttribIPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLsizei") int stride, @NativeType("void const *") IntBuffer pointer) {
        GL30C.glVertexAttribIPointer(index, size, type, stride, pointer);
    }

    // --- [ glGetVertexAttribIiv ] ---

    /** {@code void glGetVertexAttribIiv(GLuint index, GLenum pname, GLint * params)} */
    public static void nglGetVertexAttribIiv(int index, int pname, long params) {
        GL30C.nglGetVertexAttribIiv(index, pname, params);
    }

    /** {@code void glGetVertexAttribIiv(GLuint index, GLenum pname, GLint * params)} */
    public static void glGetVertexAttribIiv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        GL30C.glGetVertexAttribIiv(index, pname, params);
    }

    /** {@code void glGetVertexAttribIiv(GLuint index, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetVertexAttribIi(@NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        return GL30C.glGetVertexAttribIi(index, pname);
    }

    // --- [ glGetVertexAttribIuiv ] ---

    /** {@code void glGetVertexAttribIuiv(GLuint index, GLenum pname, GLuint * params)} */
    public static void nglGetVertexAttribIuiv(int index, int pname, long params) {
        GL30C.nglGetVertexAttribIuiv(index, pname, params);
    }

    /** {@code void glGetVertexAttribIuiv(GLuint index, GLenum pname, GLuint * params)} */
    public static void glGetVertexAttribIuiv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLuint *") IntBuffer params) {
        GL30C.glGetVertexAttribIuiv(index, pname, params);
    }

    /** {@code void glGetVertexAttribIuiv(GLuint index, GLenum pname, GLuint * params)} */
    @NativeType("void")
    public static int glGetVertexAttribIui(@NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        return GL30C.glGetVertexAttribIui(index, pname);
    }

    // --- [ glUniform1ui ] ---

    /** {@code void glUniform1ui(GLint location, GLuint v0)} */
    public static void glUniform1ui(@NativeType("GLint") int location, @NativeType("GLuint") int v0) {
        GL30C.glUniform1ui(location, v0);
    }

    // --- [ glUniform2ui ] ---

    /** {@code void glUniform2ui(GLint location, GLuint v0, GLuint v1)} */
    public static void glUniform2ui(@NativeType("GLint") int location, @NativeType("GLuint") int v0, @NativeType("GLuint") int v1) {
        GL30C.glUniform2ui(location, v0, v1);
    }

    // --- [ glUniform3ui ] ---

    /** {@code void glUniform3ui(GLint location, GLuint v0, GLuint v1, GLuint v2)} */
    public static void glUniform3ui(@NativeType("GLint") int location, @NativeType("GLuint") int v0, @NativeType("GLuint") int v1, @NativeType("GLuint") int v2) {
        GL30C.glUniform3ui(location, v0, v1, v2);
    }

    // --- [ glUniform4ui ] ---

    /** {@code void glUniform4ui(GLint location, GLuint v0, GLuint v1, GLuint v2, GLuint v3)} */
    public static void glUniform4ui(@NativeType("GLint") int location, @NativeType("GLuint") int v0, @NativeType("GLuint") int v1, @NativeType("GLuint") int v2, @NativeType("GLuint") int v3) {
        GL30C.glUniform4ui(location, v0, v1, v2, v3);
    }

    // --- [ glUniform1uiv ] ---

    /** {@code void glUniform1uiv(GLint location, GLsizei count, GLuint const * value)} */
    public static void nglUniform1uiv(int location, int count, long value) {
        GL30C.nglUniform1uiv(location, count, value);
    }

    /** {@code void glUniform1uiv(GLint location, GLsizei count, GLuint const * value)} */
    public static void glUniform1uiv(@NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        GL30C.glUniform1uiv(location, value);
    }

    // --- [ glUniform2uiv ] ---

    /** {@code void glUniform2uiv(GLint location, GLsizei count, GLuint const * value)} */
    public static void nglUniform2uiv(int location, int count, long value) {
        GL30C.nglUniform2uiv(location, count, value);
    }

    /** {@code void glUniform2uiv(GLint location, GLsizei count, GLuint const * value)} */
    public static void glUniform2uiv(@NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        GL30C.glUniform2uiv(location, value);
    }

    // --- [ glUniform3uiv ] ---

    /** {@code void glUniform3uiv(GLint location, GLsizei count, GLuint const * value)} */
    public static void nglUniform3uiv(int location, int count, long value) {
        GL30C.nglUniform3uiv(location, count, value);
    }

    /** {@code void glUniform3uiv(GLint location, GLsizei count, GLuint const * value)} */
    public static void glUniform3uiv(@NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        GL30C.glUniform3uiv(location, value);
    }

    // --- [ glUniform4uiv ] ---

    /** {@code void glUniform4uiv(GLint location, GLsizei count, GLuint const * value)} */
    public static void nglUniform4uiv(int location, int count, long value) {
        GL30C.nglUniform4uiv(location, count, value);
    }

    /** {@code void glUniform4uiv(GLint location, GLsizei count, GLuint const * value)} */
    public static void glUniform4uiv(@NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        GL30C.glUniform4uiv(location, value);
    }

    // --- [ glGetUniformuiv ] ---

    /** {@code void glGetUniformuiv(GLuint program, GLint location, GLuint * params)} */
    public static void nglGetUniformuiv(int program, int location, long params) {
        GL30C.nglGetUniformuiv(program, location, params);
    }

    /** {@code void glGetUniformuiv(GLuint program, GLint location, GLuint * params)} */
    public static void glGetUniformuiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint *") IntBuffer params) {
        GL30C.glGetUniformuiv(program, location, params);
    }

    /** {@code void glGetUniformuiv(GLuint program, GLint location, GLuint * params)} */
    @NativeType("void")
    public static int glGetUniformui(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        return GL30C.glGetUniformui(program, location);
    }

    // --- [ glBindFragDataLocation ] ---

    /** {@code void glBindFragDataLocation(GLuint program, GLuint colorNumber, GLchar const * name)} */
    public static void nglBindFragDataLocation(int program, int colorNumber, long name) {
        GL30C.nglBindFragDataLocation(program, colorNumber, name);
    }

    /** {@code void glBindFragDataLocation(GLuint program, GLuint colorNumber, GLchar const * name)} */
    public static void glBindFragDataLocation(@NativeType("GLuint") int program, @NativeType("GLuint") int colorNumber, @NativeType("GLchar const *") ByteBuffer name) {
        GL30C.glBindFragDataLocation(program, colorNumber, name);
    }

    /** {@code void glBindFragDataLocation(GLuint program, GLuint colorNumber, GLchar const * name)} */
    public static void glBindFragDataLocation(@NativeType("GLuint") int program, @NativeType("GLuint") int colorNumber, @NativeType("GLchar const *") CharSequence name) {
        GL30C.glBindFragDataLocation(program, colorNumber, name);
    }

    // --- [ glGetFragDataLocation ] ---

    /** {@code GLint glGetFragDataLocation(GLuint program, GLchar const * name)} */
    public static int nglGetFragDataLocation(int program, long name) {
        return GL30C.nglGetFragDataLocation(program, name);
    }

    /** {@code GLint glGetFragDataLocation(GLuint program, GLchar const * name)} */
    @NativeType("GLint")
    public static int glGetFragDataLocation(@NativeType("GLuint") int program, @NativeType("GLchar const *") ByteBuffer name) {
        return GL30C.glGetFragDataLocation(program, name);
    }

    /** {@code GLint glGetFragDataLocation(GLuint program, GLchar const * name)} */
    @NativeType("GLint")
    public static int glGetFragDataLocation(@NativeType("GLuint") int program, @NativeType("GLchar const *") CharSequence name) {
        return GL30C.glGetFragDataLocation(program, name);
    }

    // --- [ glBeginConditionalRender ] ---

    /** {@code void glBeginConditionalRender(GLuint id, GLenum mode)} */
    public static void glBeginConditionalRender(@NativeType("GLuint") int id, @NativeType("GLenum") int mode) {
        GL30C.glBeginConditionalRender(id, mode);
    }

    // --- [ glEndConditionalRender ] ---

    /** {@code void glEndConditionalRender(void)} */
    public static void glEndConditionalRender() {
        GL30C.glEndConditionalRender();
    }

    // --- [ glMapBufferRange ] ---

    /** {@code void * glMapBufferRange(GLenum target, GLintptr offset, GLsizeiptr length, GLbitfield access)} */
    public static long nglMapBufferRange(int target, long offset, long length, int access) {
        return GL30C.nglMapBufferRange(target, offset, length, access);
    }

    /** {@code void * glMapBufferRange(GLenum target, GLintptr offset, GLsizeiptr length, GLbitfield access)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer glMapBufferRange(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long length, @NativeType("GLbitfield") int access) {
        return GL30C.glMapBufferRange(target, offset, length, access);
    }

    /** {@code void * glMapBufferRange(GLenum target, GLintptr offset, GLsizeiptr length, GLbitfield access)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer glMapBufferRange(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long length, @NativeType("GLbitfield") int access, @Nullable ByteBuffer old_buffer) {
        return GL30C.glMapBufferRange(target, offset, length, access, old_buffer);
    }

    // --- [ glFlushMappedBufferRange ] ---

    /** {@code void glFlushMappedBufferRange(GLenum target, GLintptr offset, GLsizeiptr length)} */
    public static void glFlushMappedBufferRange(@NativeType("GLenum") int target, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long length) {
        GL30C.glFlushMappedBufferRange(target, offset, length);
    }

    // --- [ glClampColor ] ---

    /** {@code void glClampColor(GLenum target, GLenum clamp)} */
    public static void glClampColor(@NativeType("GLenum") int target, @NativeType("GLenum") int clamp) {
        GL30C.glClampColor(target, clamp);
    }

    // --- [ glIsRenderbuffer ] ---

    /** {@code GLboolean glIsRenderbuffer(GLuint renderbuffer)} */
    @NativeType("GLboolean")
    public static boolean glIsRenderbuffer(@NativeType("GLuint") int renderbuffer) {
        return GL30C.glIsRenderbuffer(renderbuffer);
    }

    // --- [ glBindRenderbuffer ] ---

    /** {@code void glBindRenderbuffer(GLenum target, GLuint renderbuffer)} */
    public static void glBindRenderbuffer(@NativeType("GLenum") int target, @NativeType("GLuint") int renderbuffer) {
        GL30C.glBindRenderbuffer(target, renderbuffer);
    }

    // --- [ glDeleteRenderbuffers ] ---

    /** {@code void glDeleteRenderbuffers(GLsizei n, GLuint const * renderbuffers)} */
    public static void nglDeleteRenderbuffers(int n, long renderbuffers) {
        GL30C.nglDeleteRenderbuffers(n, renderbuffers);
    }

    /** {@code void glDeleteRenderbuffers(GLsizei n, GLuint const * renderbuffers)} */
    public static void glDeleteRenderbuffers(@NativeType("GLuint const *") IntBuffer renderbuffers) {
        GL30C.glDeleteRenderbuffers(renderbuffers);
    }

    /** {@code void glDeleteRenderbuffers(GLsizei n, GLuint const * renderbuffers)} */
    public static void glDeleteRenderbuffers(@NativeType("GLuint const *") int renderbuffer) {
        GL30C.glDeleteRenderbuffers(renderbuffer);
    }

    // --- [ glGenRenderbuffers ] ---

    /** {@code void glGenRenderbuffers(GLsizei n, GLuint * renderbuffers)} */
    public static void nglGenRenderbuffers(int n, long renderbuffers) {
        GL30C.nglGenRenderbuffers(n, renderbuffers);
    }

    /** {@code void glGenRenderbuffers(GLsizei n, GLuint * renderbuffers)} */
    public static void glGenRenderbuffers(@NativeType("GLuint *") IntBuffer renderbuffers) {
        GL30C.glGenRenderbuffers(renderbuffers);
    }

    /** {@code void glGenRenderbuffers(GLsizei n, GLuint * renderbuffers)} */
    @NativeType("void")
    public static int glGenRenderbuffers() {
        return GL30C.glGenRenderbuffers();
    }

    // --- [ glRenderbufferStorage ] ---

    /** {@code void glRenderbufferStorage(GLenum target, GLenum internalformat, GLsizei width, GLsizei height)} */
    public static void glRenderbufferStorage(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        GL30C.glRenderbufferStorage(target, internalformat, width, height);
    }

    // --- [ glRenderbufferStorageMultisample ] ---

    /** {@code void glRenderbufferStorageMultisample(GLenum target, GLsizei samples, GLenum internalformat, GLsizei width, GLsizei height)} */
    public static void glRenderbufferStorageMultisample(@NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height) {
        GL30C.glRenderbufferStorageMultisample(target, samples, internalformat, width, height);
    }

    // --- [ glGetRenderbufferParameteriv ] ---

    /** {@code void glGetRenderbufferParameteriv(GLenum target, GLenum pname, GLint * params)} */
    public static void nglGetRenderbufferParameteriv(int target, int pname, long params) {
        GL30C.nglGetRenderbufferParameteriv(target, pname, params);
    }

    /** {@code void glGetRenderbufferParameteriv(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetRenderbufferParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        GL30C.glGetRenderbufferParameteriv(target, pname, params);
    }

    /** {@code void glGetRenderbufferParameteriv(GLenum target, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetRenderbufferParameteri(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        return GL30C.glGetRenderbufferParameteri(target, pname);
    }

    // --- [ glIsFramebuffer ] ---

    /** {@code GLboolean glIsFramebuffer(GLuint framebuffer)} */
    @NativeType("GLboolean")
    public static boolean glIsFramebuffer(@NativeType("GLuint") int framebuffer) {
        return GL30C.glIsFramebuffer(framebuffer);
    }

    // --- [ glBindFramebuffer ] ---

    /** {@code void glBindFramebuffer(GLenum target, GLuint framebuffer)} */
    public static void glBindFramebuffer(@NativeType("GLenum") int target, @NativeType("GLuint") int framebuffer) {
        GL30C.glBindFramebuffer(target, framebuffer);
    }

    // --- [ glDeleteFramebuffers ] ---

    /** {@code void glDeleteFramebuffers(GLsizei n, GLuint const * framebuffers)} */
    public static void nglDeleteFramebuffers(int n, long framebuffers) {
        GL30C.nglDeleteFramebuffers(n, framebuffers);
    }

    /** {@code void glDeleteFramebuffers(GLsizei n, GLuint const * framebuffers)} */
    public static void glDeleteFramebuffers(@NativeType("GLuint const *") IntBuffer framebuffers) {
        GL30C.glDeleteFramebuffers(framebuffers);
    }

    /** {@code void glDeleteFramebuffers(GLsizei n, GLuint const * framebuffers)} */
    public static void glDeleteFramebuffers(@NativeType("GLuint const *") int framebuffer) {
        GL30C.glDeleteFramebuffers(framebuffer);
    }

    // --- [ glGenFramebuffers ] ---

    /** {@code void glGenFramebuffers(GLsizei n, GLuint * framebuffers)} */
    public static void nglGenFramebuffers(int n, long framebuffers) {
        GL30C.nglGenFramebuffers(n, framebuffers);
    }

    /** {@code void glGenFramebuffers(GLsizei n, GLuint * framebuffers)} */
    public static void glGenFramebuffers(@NativeType("GLuint *") IntBuffer framebuffers) {
        GL30C.glGenFramebuffers(framebuffers);
    }

    /** {@code void glGenFramebuffers(GLsizei n, GLuint * framebuffers)} */
    @NativeType("void")
    public static int glGenFramebuffers() {
        return GL30C.glGenFramebuffers();
    }

    // --- [ glCheckFramebufferStatus ] ---

    /** {@code GLenum glCheckFramebufferStatus(GLenum target)} */
    @NativeType("GLenum")
    public static int glCheckFramebufferStatus(@NativeType("GLenum") int target) {
        return GL30C.glCheckFramebufferStatus(target);
    }

    // --- [ glFramebufferTexture1D ] ---

    /** {@code void glFramebufferTexture1D(GLenum target, GLenum attachment, GLenum textarget, GLuint texture, GLint level)} */
    public static void glFramebufferTexture1D(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int textarget, @NativeType("GLuint") int texture, @NativeType("GLint") int level) {
        GL30C.glFramebufferTexture1D(target, attachment, textarget, texture, level);
    }

    // --- [ glFramebufferTexture2D ] ---

    /** {@code void glFramebufferTexture2D(GLenum target, GLenum attachment, GLenum textarget, GLuint texture, GLint level)} */
    public static void glFramebufferTexture2D(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int textarget, @NativeType("GLuint") int texture, @NativeType("GLint") int level) {
        GL30C.glFramebufferTexture2D(target, attachment, textarget, texture, level);
    }

    // --- [ glFramebufferTexture3D ] ---

    /** {@code void glFramebufferTexture3D(GLenum target, GLenum attachment, GLenum textarget, GLuint texture, GLint level, GLint layer)} */
    public static void glFramebufferTexture3D(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int textarget, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int layer) {
        GL30C.glFramebufferTexture3D(target, attachment, textarget, texture, level, layer);
    }

    // --- [ glFramebufferTextureLayer ] ---

    /** {@code void glFramebufferTextureLayer(GLenum target, GLenum attachment, GLuint texture, GLint level, GLint layer)} */
    public static void glFramebufferTextureLayer(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int layer) {
        GL30C.glFramebufferTextureLayer(target, attachment, texture, level, layer);
    }

    // --- [ glFramebufferRenderbuffer ] ---

    /** {@code void glFramebufferRenderbuffer(GLenum target, GLenum attachment, GLenum renderbuffertarget, GLuint renderbuffer)} */
    public static void glFramebufferRenderbuffer(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int renderbuffertarget, @NativeType("GLuint") int renderbuffer) {
        GL30C.glFramebufferRenderbuffer(target, attachment, renderbuffertarget, renderbuffer);
    }

    // --- [ glGetFramebufferAttachmentParameteriv ] ---

    /** {@code void glGetFramebufferAttachmentParameteriv(GLenum target, GLenum attachment, GLenum pname, GLint * params)} */
    public static void nglGetFramebufferAttachmentParameteriv(int target, int attachment, int pname, long params) {
        GL30C.nglGetFramebufferAttachmentParameteriv(target, attachment, pname, params);
    }

    /** {@code void glGetFramebufferAttachmentParameteriv(GLenum target, GLenum attachment, GLenum pname, GLint * params)} */
    public static void glGetFramebufferAttachmentParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        GL30C.glGetFramebufferAttachmentParameteriv(target, attachment, pname, params);
    }

    /** {@code void glGetFramebufferAttachmentParameteriv(GLenum target, GLenum attachment, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetFramebufferAttachmentParameteri(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int pname) {
        return GL30C.glGetFramebufferAttachmentParameteri(target, attachment, pname);
    }

    // --- [ glBlitFramebuffer ] ---

    /** {@code void glBlitFramebuffer(GLint srcX0, GLint srcY0, GLint srcX1, GLint srcY1, GLint dstX0, GLint dstY0, GLint dstX1, GLint dstY1, GLbitfield mask, GLenum filter)} */
    public static void glBlitFramebuffer(@NativeType("GLint") int srcX0, @NativeType("GLint") int srcY0, @NativeType("GLint") int srcX1, @NativeType("GLint") int srcY1, @NativeType("GLint") int dstX0, @NativeType("GLint") int dstY0, @NativeType("GLint") int dstX1, @NativeType("GLint") int dstY1, @NativeType("GLbitfield") int mask, @NativeType("GLenum") int filter) {
        GL30C.glBlitFramebuffer(srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
    }

    // --- [ glGenerateMipmap ] ---

    /** {@code void glGenerateMipmap(GLenum target)} */
    public static void glGenerateMipmap(@NativeType("GLenum") int target) {
        GL30C.glGenerateMipmap(target);
    }

    // --- [ glTexParameterIiv ] ---

    /** {@code void glTexParameterIiv(GLenum target, GLenum pname, GLint const * params)} */
    public static void nglTexParameterIiv(int target, int pname, long params) {
        GL30C.nglTexParameterIiv(target, pname, params);
    }

    /** {@code void glTexParameterIiv(GLenum target, GLenum pname, GLint const * params)} */
    public static void glTexParameterIiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        GL30C.glTexParameterIiv(target, pname, params);
    }

    /** {@code void glTexParameterIiv(GLenum target, GLenum pname, GLint const * params)} */
    public static void glTexParameterIi(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") int param) {
        GL30C.glTexParameterIi(target, pname, param);
    }

    // --- [ glTexParameterIuiv ] ---

    /** {@code void glTexParameterIuiv(GLenum target, GLenum pname, GLuint const * params)} */
    public static void nglTexParameterIuiv(int target, int pname, long params) {
        GL30C.nglTexParameterIuiv(target, pname, params);
    }

    /** {@code void glTexParameterIuiv(GLenum target, GLenum pname, GLuint const * params)} */
    public static void glTexParameterIuiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint const *") IntBuffer params) {
        GL30C.glTexParameterIuiv(target, pname, params);
    }

    /** {@code void glTexParameterIuiv(GLenum target, GLenum pname, GLuint const * params)} */
    public static void glTexParameterIui(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint const *") int param) {
        GL30C.glTexParameterIui(target, pname, param);
    }

    // --- [ glGetTexParameterIiv ] ---

    /** {@code void glGetTexParameterIiv(GLenum target, GLenum pname, GLint * params)} */
    public static void nglGetTexParameterIiv(int target, int pname, long params) {
        GL30C.nglGetTexParameterIiv(target, pname, params);
    }

    /** {@code void glGetTexParameterIiv(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetTexParameterIiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        GL30C.glGetTexParameterIiv(target, pname, params);
    }

    /** {@code void glGetTexParameterIiv(GLenum target, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetTexParameterIi(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        return GL30C.glGetTexParameterIi(target, pname);
    }

    // --- [ glGetTexParameterIuiv ] ---

    /** {@code void glGetTexParameterIuiv(GLenum target, GLenum pname, GLuint * params)} */
    public static void nglGetTexParameterIuiv(int target, int pname, long params) {
        GL30C.nglGetTexParameterIuiv(target, pname, params);
    }

    /** {@code void glGetTexParameterIuiv(GLenum target, GLenum pname, GLuint * params)} */
    public static void glGetTexParameterIuiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint *") IntBuffer params) {
        GL30C.glGetTexParameterIuiv(target, pname, params);
    }

    /** {@code void glGetTexParameterIuiv(GLenum target, GLenum pname, GLuint * params)} */
    @NativeType("void")
    public static int glGetTexParameterIui(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        return GL30C.glGetTexParameterIui(target, pname);
    }

    // --- [ glColorMaski ] ---

    /** {@code void glColorMaski(GLuint buf, GLboolean r, GLboolean g, GLboolean b, GLboolean a)} */
    public static void glColorMaski(@NativeType("GLuint") int buf, @NativeType("GLboolean") boolean r, @NativeType("GLboolean") boolean g, @NativeType("GLboolean") boolean b, @NativeType("GLboolean") boolean a) {
        GL30C.glColorMaski(buf, r, g, b, a);
    }

    // --- [ glGetBooleani_v ] ---

    /** {@code void glGetBooleani_v(GLenum target, GLuint index, GLboolean * data)} */
    public static void nglGetBooleani_v(int target, int index, long data) {
        GL30C.nglGetBooleani_v(target, index, data);
    }

    /** {@code void glGetBooleani_v(GLenum target, GLuint index, GLboolean * data)} */
    public static void glGetBooleani_v(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLboolean *") ByteBuffer data) {
        GL30C.glGetBooleani_v(target, index, data);
    }

    /** {@code void glGetBooleani_v(GLenum target, GLuint index, GLboolean * data)} */
    @NativeType("void")
    public static boolean glGetBooleani(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        return GL30C.glGetBooleani(target, index);
    }

    // --- [ glGetIntegeri_v ] ---

    /** {@code void glGetIntegeri_v(GLenum target, GLuint index, GLint * data)} */
    public static void nglGetIntegeri_v(int target, int index, long data) {
        GL30C.nglGetIntegeri_v(target, index, data);
    }

    /** {@code void glGetIntegeri_v(GLenum target, GLuint index, GLint * data)} */
    public static void glGetIntegeri_v(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLint *") IntBuffer data) {
        GL30C.glGetIntegeri_v(target, index, data);
    }

    /** {@code void glGetIntegeri_v(GLenum target, GLuint index, GLint * data)} */
    @NativeType("void")
    public static int glGetIntegeri(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        return GL30C.glGetIntegeri(target, index);
    }

    // --- [ glEnablei ] ---

    /** {@code void glEnablei(GLenum cap, GLuint index)} */
    public static void glEnablei(@NativeType("GLenum") int cap, @NativeType("GLuint") int index) {
        GL30C.glEnablei(cap, index);
    }

    // --- [ glDisablei ] ---

    /** {@code void glDisablei(GLenum target, GLuint index)} */
    public static void glDisablei(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        GL30C.glDisablei(target, index);
    }

    // --- [ glIsEnabledi ] ---

    /** {@code GLboolean glIsEnabledi(GLenum target, GLuint index)} */
    @NativeType("GLboolean")
    public static boolean glIsEnabledi(@NativeType("GLenum") int target, @NativeType("GLuint") int index) {
        return GL30C.glIsEnabledi(target, index);
    }

    // --- [ glBindBufferRange ] ---

    /** {@code void glBindBufferRange(GLenum target, GLuint index, GLuint buffer, GLintptr offset, GLsizeiptr size)} */
    public static void glBindBufferRange(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size) {
        GL30C.glBindBufferRange(target, index, buffer, offset, size);
    }

    // --- [ glBindBufferBase ] ---

    /** {@code void glBindBufferBase(GLenum target, GLuint index, GLuint buffer)} */
    public static void glBindBufferBase(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLuint") int buffer) {
        GL30C.glBindBufferBase(target, index, buffer);
    }

    // --- [ glBeginTransformFeedback ] ---

    /** {@code void glBeginTransformFeedback(GLenum primitiveMode)} */
    public static void glBeginTransformFeedback(@NativeType("GLenum") int primitiveMode) {
        GL30C.glBeginTransformFeedback(primitiveMode);
    }

    // --- [ glEndTransformFeedback ] ---

    /** {@code void glEndTransformFeedback(void)} */
    public static void glEndTransformFeedback() {
        GL30C.glEndTransformFeedback();
    }

    // --- [ glTransformFeedbackVaryings ] ---

    /** {@code void glTransformFeedbackVaryings(GLuint program, GLsizei count, GLchar const * const * varyings, GLenum bufferMode)} */
    public static void nglTransformFeedbackVaryings(int program, int count, long varyings, int bufferMode) {
        GL30C.nglTransformFeedbackVaryings(program, count, varyings, bufferMode);
    }

    /** {@code void glTransformFeedbackVaryings(GLuint program, GLsizei count, GLchar const * const * varyings, GLenum bufferMode)} */
    public static void glTransformFeedbackVaryings(@NativeType("GLuint") int program, @NativeType("GLchar const * const *") PointerBuffer varyings, @NativeType("GLenum") int bufferMode) {
        GL30C.glTransformFeedbackVaryings(program, varyings, bufferMode);
    }

    /** {@code void glTransformFeedbackVaryings(GLuint program, GLsizei count, GLchar const * const * varyings, GLenum bufferMode)} */
    public static void glTransformFeedbackVaryings(@NativeType("GLuint") int program, @NativeType("GLchar const * const *") CharSequence[] varyings, @NativeType("GLenum") int bufferMode) {
        GL30C.glTransformFeedbackVaryings(program, varyings, bufferMode);
    }

    /** {@code void glTransformFeedbackVaryings(GLuint program, GLsizei count, GLchar const * const * varyings, GLenum bufferMode)} */
    public static void glTransformFeedbackVaryings(@NativeType("GLuint") int program, @NativeType("GLchar const * const *") CharSequence varying, @NativeType("GLenum") int bufferMode) {
        GL30C.glTransformFeedbackVaryings(program, varying, bufferMode);
    }

    // --- [ glGetTransformFeedbackVarying ] ---

    /** {@code void glGetTransformFeedbackVarying(GLuint program, GLuint index, GLsizei bufSize, GLsizei * length, GLsizei * size, GLenum * type, GLchar * name)} */
    public static void nglGetTransformFeedbackVarying(int program, int index, int bufSize, long length, long size, long type, long name) {
        GL30C.nglGetTransformFeedbackVarying(program, index, bufSize, length, size, type, name);
    }

    /** {@code void glGetTransformFeedbackVarying(GLuint program, GLuint index, GLsizei bufSize, GLsizei * length, GLsizei * size, GLenum * type, GLchar * name)} */
    public static void glGetTransformFeedbackVarying(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLsizei *") IntBuffer size, @NativeType("GLenum *") IntBuffer type, @NativeType("GLchar *") ByteBuffer name) {
        GL30C.glGetTransformFeedbackVarying(program, index, length, size, type, name);
    }

    /** {@code void glGetTransformFeedbackVarying(GLuint program, GLuint index, GLsizei bufSize, GLsizei * length, GLsizei * size, GLenum * type, GLchar * name)} */
    @NativeType("void")
    public static String glGetTransformFeedbackVarying(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLsizei") int bufSize, @NativeType("GLsizei *") IntBuffer size, @NativeType("GLenum *") IntBuffer type) {
        return GL30C.glGetTransformFeedbackVarying(program, index, bufSize, size, type);
    }

    /** {@code void glGetTransformFeedbackVarying(GLuint program, GLuint index, GLsizei bufSize, GLsizei * length, GLsizei * size, GLenum * type, GLchar * name)} */
    @NativeType("void")
    public static String glGetTransformFeedbackVarying(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLsizei *") IntBuffer size, @NativeType("GLenum *") IntBuffer type) {
        return glGetTransformFeedbackVarying(program, index, GL20.glGetProgrami(program, GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH), size, type);
    }

    // --- [ glBindVertexArray ] ---

    /** {@code void glBindVertexArray(GLuint array)} */
    public static void glBindVertexArray(@NativeType("GLuint") int array) {
        GL30C.glBindVertexArray(array);
    }

    // --- [ glDeleteVertexArrays ] ---

    /** {@code void glDeleteVertexArrays(GLsizei n, GLuint const * arrays)} */
    public static void nglDeleteVertexArrays(int n, long arrays) {
        GL30C.nglDeleteVertexArrays(n, arrays);
    }

    /** {@code void glDeleteVertexArrays(GLsizei n, GLuint const * arrays)} */
    public static void glDeleteVertexArrays(@NativeType("GLuint const *") IntBuffer arrays) {
        GL30C.glDeleteVertexArrays(arrays);
    }

    /** {@code void glDeleteVertexArrays(GLsizei n, GLuint const * arrays)} */
    public static void glDeleteVertexArrays(@NativeType("GLuint const *") int array) {
        GL30C.glDeleteVertexArrays(array);
    }

    // --- [ glGenVertexArrays ] ---

    /** {@code void glGenVertexArrays(GLsizei n, GLuint * arrays)} */
    public static void nglGenVertexArrays(int n, long arrays) {
        GL30C.nglGenVertexArrays(n, arrays);
    }

    /** {@code void glGenVertexArrays(GLsizei n, GLuint * arrays)} */
    public static void glGenVertexArrays(@NativeType("GLuint *") IntBuffer arrays) {
        GL30C.glGenVertexArrays(arrays);
    }

    /** {@code void glGenVertexArrays(GLsizei n, GLuint * arrays)} */
    @NativeType("void")
    public static int glGenVertexArrays() {
        return GL30C.glGenVertexArrays();
    }

    // --- [ glIsVertexArray ] ---

    /** {@code GLboolean glIsVertexArray(GLuint array)} */
    @NativeType("GLboolean")
    public static boolean glIsVertexArray(@NativeType("GLuint") int array) {
        return GL30C.glIsVertexArray(array);
    }

    /** {@code void glClearBufferiv(GLenum buffer, GLint drawbuffer, GLint const * value)} */
    public static void glClearBufferiv(@NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLint const *") int[] value) {
        GL30C.glClearBufferiv(buffer, drawbuffer, value);
    }

    /** {@code void glClearBufferuiv(GLenum buffer, GLint drawbuffer, GLint const * value)} */
    public static void glClearBufferuiv(@NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLint const *") int[] value) {
        GL30C.glClearBufferuiv(buffer, drawbuffer, value);
    }

    /** {@code void glClearBufferfv(GLenum buffer, GLint drawbuffer, GLfloat const * value)} */
    public static void glClearBufferfv(@NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLfloat const *") float[] value) {
        GL30C.glClearBufferfv(buffer, drawbuffer, value);
    }

    /** {@code void glVertexAttribI1iv(GLuint index, GLint const * v)} */
    public static void glVertexAttribI1iv(@NativeType("GLuint") int index, @NativeType("GLint const *") int[] v) {
        GL30C.glVertexAttribI1iv(index, v);
    }

    /** {@code void glVertexAttribI2iv(GLuint index, GLint const * v)} */
    public static void glVertexAttribI2iv(@NativeType("GLuint") int index, @NativeType("GLint const *") int[] v) {
        GL30C.glVertexAttribI2iv(index, v);
    }

    /** {@code void glVertexAttribI3iv(GLuint index, GLint const * v)} */
    public static void glVertexAttribI3iv(@NativeType("GLuint") int index, @NativeType("GLint const *") int[] v) {
        GL30C.glVertexAttribI3iv(index, v);
    }

    /** {@code void glVertexAttribI4iv(GLuint index, GLint const * v)} */
    public static void glVertexAttribI4iv(@NativeType("GLuint") int index, @NativeType("GLint const *") int[] v) {
        GL30C.glVertexAttribI4iv(index, v);
    }

    /** {@code void glVertexAttribI1uiv(GLuint index, GLuint const * v)} */
    public static void glVertexAttribI1uiv(@NativeType("GLuint") int index, @NativeType("GLuint const *") int[] v) {
        GL30C.glVertexAttribI1uiv(index, v);
    }

    /** {@code void glVertexAttribI2uiv(GLuint index, GLuint const * v)} */
    public static void glVertexAttribI2uiv(@NativeType("GLuint") int index, @NativeType("GLuint const *") int[] v) {
        GL30C.glVertexAttribI2uiv(index, v);
    }

    /** {@code void glVertexAttribI3uiv(GLuint index, GLuint const * v)} */
    public static void glVertexAttribI3uiv(@NativeType("GLuint") int index, @NativeType("GLuint const *") int[] v) {
        GL30C.glVertexAttribI3uiv(index, v);
    }

    /** {@code void glVertexAttribI4uiv(GLuint index, GLuint const * v)} */
    public static void glVertexAttribI4uiv(@NativeType("GLuint") int index, @NativeType("GLuint const *") int[] v) {
        GL30C.glVertexAttribI4uiv(index, v);
    }

    /** {@code void glVertexAttribI4sv(GLuint index, GLshort const * v)} */
    public static void glVertexAttribI4sv(@NativeType("GLuint") int index, @NativeType("GLshort const *") short[] v) {
        GL30C.glVertexAttribI4sv(index, v);
    }

    /** {@code void glVertexAttribI4usv(GLuint index, GLshort const * v)} */
    public static void glVertexAttribI4usv(@NativeType("GLuint") int index, @NativeType("GLshort const *") short[] v) {
        GL30C.glVertexAttribI4usv(index, v);
    }

    /** {@code void glGetVertexAttribIiv(GLuint index, GLenum pname, GLint * params)} */
    public static void glGetVertexAttribIiv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        GL30C.glGetVertexAttribIiv(index, pname, params);
    }

    /** {@code void glGetVertexAttribIuiv(GLuint index, GLenum pname, GLuint * params)} */
    public static void glGetVertexAttribIuiv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] params) {
        GL30C.glGetVertexAttribIuiv(index, pname, params);
    }

    /** {@code void glUniform1uiv(GLint location, GLsizei count, GLuint const * value)} */
    public static void glUniform1uiv(@NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        GL30C.glUniform1uiv(location, value);
    }

    /** {@code void glUniform2uiv(GLint location, GLsizei count, GLuint const * value)} */
    public static void glUniform2uiv(@NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        GL30C.glUniform2uiv(location, value);
    }

    /** {@code void glUniform3uiv(GLint location, GLsizei count, GLuint const * value)} */
    public static void glUniform3uiv(@NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        GL30C.glUniform3uiv(location, value);
    }

    /** {@code void glUniform4uiv(GLint location, GLsizei count, GLuint const * value)} */
    public static void glUniform4uiv(@NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        GL30C.glUniform4uiv(location, value);
    }

    /** {@code void glGetUniformuiv(GLuint program, GLint location, GLuint * params)} */
    public static void glGetUniformuiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint *") int[] params) {
        GL30C.glGetUniformuiv(program, location, params);
    }

    /** {@code void glDeleteRenderbuffers(GLsizei n, GLuint const * renderbuffers)} */
    public static void glDeleteRenderbuffers(@NativeType("GLuint const *") int[] renderbuffers) {
        GL30C.glDeleteRenderbuffers(renderbuffers);
    }

    /** {@code void glGenRenderbuffers(GLsizei n, GLuint * renderbuffers)} */
    public static void glGenRenderbuffers(@NativeType("GLuint *") int[] renderbuffers) {
        GL30C.glGenRenderbuffers(renderbuffers);
    }

    /** {@code void glGetRenderbufferParameteriv(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetRenderbufferParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        GL30C.glGetRenderbufferParameteriv(target, pname, params);
    }

    /** {@code void glDeleteFramebuffers(GLsizei n, GLuint const * framebuffers)} */
    public static void glDeleteFramebuffers(@NativeType("GLuint const *") int[] framebuffers) {
        GL30C.glDeleteFramebuffers(framebuffers);
    }

    /** {@code void glGenFramebuffers(GLsizei n, GLuint * framebuffers)} */
    public static void glGenFramebuffers(@NativeType("GLuint *") int[] framebuffers) {
        GL30C.glGenFramebuffers(framebuffers);
    }

    /** {@code void glGetFramebufferAttachmentParameteriv(GLenum target, GLenum attachment, GLenum pname, GLint * params)} */
    public static void glGetFramebufferAttachmentParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        GL30C.glGetFramebufferAttachmentParameteriv(target, attachment, pname, params);
    }

    /** {@code void glTexParameterIiv(GLenum target, GLenum pname, GLint const * params)} */
    public static void glTexParameterIiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        GL30C.glTexParameterIiv(target, pname, params);
    }

    /** {@code void glTexParameterIuiv(GLenum target, GLenum pname, GLuint const * params)} */
    public static void glTexParameterIuiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint const *") int[] params) {
        GL30C.glTexParameterIuiv(target, pname, params);
    }

    /** {@code void glGetTexParameterIiv(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetTexParameterIiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        GL30C.glGetTexParameterIiv(target, pname, params);
    }

    /** {@code void glGetTexParameterIuiv(GLenum target, GLenum pname, GLuint * params)} */
    public static void glGetTexParameterIuiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] params) {
        GL30C.glGetTexParameterIuiv(target, pname, params);
    }

    /** {@code void glGetIntegeri_v(GLenum target, GLuint index, GLint * data)} */
    public static void glGetIntegeri_v(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLint *") int[] data) {
        GL30C.glGetIntegeri_v(target, index, data);
    }

    /** {@code void glGetTransformFeedbackVarying(GLuint program, GLuint index, GLsizei bufSize, GLsizei * length, GLsizei * size, GLenum * type, GLchar * name)} */
    public static void glGetTransformFeedbackVarying(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLsizei *") int[] size, @NativeType("GLenum *") int[] type, @NativeType("GLchar *") ByteBuffer name) {
        GL30C.glGetTransformFeedbackVarying(program, index, length, size, type, name);
    }

    /** {@code void glDeleteVertexArrays(GLsizei n, GLuint const * arrays)} */
    public static void glDeleteVertexArrays(@NativeType("GLuint const *") int[] arrays) {
        GL30C.glDeleteVertexArrays(arrays);
    }

    /** {@code void glGenVertexArrays(GLsizei n, GLuint * arrays)} */
    public static void glGenVertexArrays(@NativeType("GLuint *") int[] arrays) {
        GL30C.glGenVertexArrays(arrays);
    }

}
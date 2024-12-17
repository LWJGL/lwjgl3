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

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class GL30C extends GL21C {

    static { GL.initialize(); }

    public static final int
        GL_MAJOR_VERSION                       = 0x821B,
        GL_MINOR_VERSION                       = 0x821C,
        GL_NUM_EXTENSIONS                      = 0x821D,
        GL_CONTEXT_FLAGS                       = 0x821E,
        GL_CONTEXT_FLAG_FORWARD_COMPATIBLE_BIT = 0x1;

    public static final int
        GL_COMPARE_REF_TO_TEXTURE = 0x884E,
        GL_CLIP_DISTANCE0         = 0x3000,
        GL_CLIP_DISTANCE1         = 0x3001,
        GL_CLIP_DISTANCE2         = 0x3002,
        GL_CLIP_DISTANCE3         = 0x3003,
        GL_CLIP_DISTANCE4         = 0x3004,
        GL_CLIP_DISTANCE5         = 0x3005,
        GL_CLIP_DISTANCE6         = 0x3006,
        GL_CLIP_DISTANCE7         = 0x3007,
        GL_MAX_CLIP_DISTANCES     = 0xD32,
        GL_MAX_VARYING_COMPONENTS = 0x8B4B;

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

    public static final int GL_CLAMP_READ_COLOR = 0x891C;

    public static final int GL_FIXED_ONLY = 0x891D;

    public static final int
        GL_DEPTH_COMPONENT32F = 0x8CAC,
        GL_DEPTH32F_STENCIL8  = 0x8CAD;

    public static final int GL_FLOAT_32_UNSIGNED_INT_24_8_REV = 0x8DAD;

    public static final int
        GL_TEXTURE_RED_TYPE   = 0x8C10,
        GL_TEXTURE_GREEN_TYPE = 0x8C11,
        GL_TEXTURE_BLUE_TYPE  = 0x8C12,
        GL_TEXTURE_ALPHA_TYPE = 0x8C13,
        GL_TEXTURE_DEPTH_TYPE = 0x8C16;

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

    public static final int GL_FRAMEBUFFER_DEFAULT = 0x8218;

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

    protected GL30C() {
        throw new UnsupportedOperationException();
    }

    // --- [ glGetStringi ] ---

    /** {@code GLubyte const * glGetStringi(GLenum name, GLuint index)} */
    public static native long nglGetStringi(int name, int index);

    /** {@code GLubyte const * glGetStringi(GLenum name, GLuint index)} */
    @NativeType("GLubyte const *")
    public static @Nullable String glGetStringi(@NativeType("GLenum") int name, @NativeType("GLuint") int index) {
        long __result = nglGetStringi(name, index);
        return memUTF8Safe(__result);
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

    /** {@code void glClearBufferuiv(GLenum buffer, GLint drawbuffer, GLint const * value)} */
    public static native void nglClearBufferuiv(int buffer, int drawbuffer, long value);

    /** {@code void glClearBufferuiv(GLenum buffer, GLint drawbuffer, GLint const * value)} */
    public static void glClearBufferuiv(@NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLint const *") IntBuffer value) {
        if (CHECKS) {
            check(value, 4);
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

    // --- [ glVertexAttribI1i ] ---

    /** {@code void glVertexAttribI1i(GLuint index, GLint x)} */
    public static native void glVertexAttribI1i(@NativeType("GLuint") int index, @NativeType("GLint") int x);

    // --- [ glVertexAttribI2i ] ---

    /** {@code void glVertexAttribI2i(GLuint index, GLint x, GLint y)} */
    public static native void glVertexAttribI2i(@NativeType("GLuint") int index, @NativeType("GLint") int x, @NativeType("GLint") int y);

    // --- [ glVertexAttribI3i ] ---

    /** {@code void glVertexAttribI3i(GLuint index, GLint x, GLint y, GLint z)} */
    public static native void glVertexAttribI3i(@NativeType("GLuint") int index, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z);

    // --- [ glVertexAttribI4i ] ---

    /** {@code void glVertexAttribI4i(GLuint index, GLint x, GLint y, GLint z, GLint w)} */
    public static native void glVertexAttribI4i(@NativeType("GLuint") int index, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z, @NativeType("GLint") int w);

    // --- [ glVertexAttribI1ui ] ---

    /** {@code void glVertexAttribI1ui(GLuint index, GLuint x)} */
    public static native void glVertexAttribI1ui(@NativeType("GLuint") int index, @NativeType("GLuint") int x);

    // --- [ glVertexAttribI2ui ] ---

    /** {@code void glVertexAttribI2ui(GLuint index, GLuint x, GLuint y)} */
    public static native void glVertexAttribI2ui(@NativeType("GLuint") int index, @NativeType("GLuint") int x, @NativeType("GLuint") int y);

    // --- [ glVertexAttribI3ui ] ---

    /** {@code void glVertexAttribI3ui(GLuint index, GLint x, GLint y, GLint z)} */
    public static native void glVertexAttribI3ui(@NativeType("GLuint") int index, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z);

    // --- [ glVertexAttribI4ui ] ---

    /** {@code void glVertexAttribI4ui(GLuint index, GLint x, GLint y, GLint z, GLint w)} */
    public static native void glVertexAttribI4ui(@NativeType("GLuint") int index, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z, @NativeType("GLint") int w);

    // --- [ glVertexAttribI1iv ] ---

    /** {@code void glVertexAttribI1iv(GLuint index, GLint const * v)} */
    public static native void nglVertexAttribI1iv(int index, long v);

    /** {@code void glVertexAttribI1iv(GLuint index, GLint const * v)} */
    public static void glVertexAttribI1iv(@NativeType("GLuint") int index, @NativeType("GLint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 1);
        }
        nglVertexAttribI1iv(index, memAddress(v));
    }

    // --- [ glVertexAttribI2iv ] ---

    /** {@code void glVertexAttribI2iv(GLuint index, GLint const * v)} */
    public static native void nglVertexAttribI2iv(int index, long v);

    /** {@code void glVertexAttribI2iv(GLuint index, GLint const * v)} */
    public static void glVertexAttribI2iv(@NativeType("GLuint") int index, @NativeType("GLint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 2);
        }
        nglVertexAttribI2iv(index, memAddress(v));
    }

    // --- [ glVertexAttribI3iv ] ---

    /** {@code void glVertexAttribI3iv(GLuint index, GLint const * v)} */
    public static native void nglVertexAttribI3iv(int index, long v);

    /** {@code void glVertexAttribI3iv(GLuint index, GLint const * v)} */
    public static void glVertexAttribI3iv(@NativeType("GLuint") int index, @NativeType("GLint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglVertexAttribI3iv(index, memAddress(v));
    }

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

    // --- [ glVertexAttribI1uiv ] ---

    /** {@code void glVertexAttribI1uiv(GLuint index, GLuint const * v)} */
    public static native void nglVertexAttribI1uiv(int index, long v);

    /** {@code void glVertexAttribI1uiv(GLuint index, GLuint const * v)} */
    public static void glVertexAttribI1uiv(@NativeType("GLuint") int index, @NativeType("GLuint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 1);
        }
        nglVertexAttribI1uiv(index, memAddress(v));
    }

    // --- [ glVertexAttribI2uiv ] ---

    /** {@code void glVertexAttribI2uiv(GLuint index, GLuint const * v)} */
    public static native void nglVertexAttribI2uiv(int index, long v);

    /** {@code void glVertexAttribI2uiv(GLuint index, GLuint const * v)} */
    public static void glVertexAttribI2uiv(@NativeType("GLuint") int index, @NativeType("GLuint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 2);
        }
        nglVertexAttribI2uiv(index, memAddress(v));
    }

    // --- [ glVertexAttribI3uiv ] ---

    /** {@code void glVertexAttribI3uiv(GLuint index, GLuint const * v)} */
    public static native void nglVertexAttribI3uiv(int index, long v);

    /** {@code void glVertexAttribI3uiv(GLuint index, GLuint const * v)} */
    public static void glVertexAttribI3uiv(@NativeType("GLuint") int index, @NativeType("GLuint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglVertexAttribI3uiv(index, memAddress(v));
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

    // --- [ glVertexAttribI4bv ] ---

    /** {@code void glVertexAttribI4bv(GLuint index, GLbyte const * v)} */
    public static native void nglVertexAttribI4bv(int index, long v);

    /** {@code void glVertexAttribI4bv(GLuint index, GLbyte const * v)} */
    public static void glVertexAttribI4bv(@NativeType("GLuint") int index, @NativeType("GLbyte const *") ByteBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttribI4bv(index, memAddress(v));
    }

    // --- [ glVertexAttribI4sv ] ---

    /** {@code void glVertexAttribI4sv(GLuint index, GLshort const * v)} */
    public static native void nglVertexAttribI4sv(int index, long v);

    /** {@code void glVertexAttribI4sv(GLuint index, GLshort const * v)} */
    public static void glVertexAttribI4sv(@NativeType("GLuint") int index, @NativeType("GLshort const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttribI4sv(index, memAddress(v));
    }

    // --- [ glVertexAttribI4ubv ] ---

    /** {@code void glVertexAttribI4ubv(GLuint index, GLbyte const * v)} */
    public static native void nglVertexAttribI4ubv(int index, long v);

    /** {@code void glVertexAttribI4ubv(GLuint index, GLbyte const * v)} */
    public static void glVertexAttribI4ubv(@NativeType("GLuint") int index, @NativeType("GLbyte const *") ByteBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttribI4ubv(index, memAddress(v));
    }

    // --- [ glVertexAttribI4usv ] ---

    /** {@code void glVertexAttribI4usv(GLuint index, GLshort const * v)} */
    public static native void nglVertexAttribI4usv(int index, long v);

    /** {@code void glVertexAttribI4usv(GLuint index, GLshort const * v)} */
    public static void glVertexAttribI4usv(@NativeType("GLuint") int index, @NativeType("GLshort const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttribI4usv(index, memAddress(v));
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
            check(params, 4);
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
            check(params, 4);
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

    // --- [ glBindFragDataLocation ] ---

    /** {@code void glBindFragDataLocation(GLuint program, GLuint colorNumber, GLchar const * name)} */
    public static native void nglBindFragDataLocation(int program, int colorNumber, long name);

    /** {@code void glBindFragDataLocation(GLuint program, GLuint colorNumber, GLchar const * name)} */
    public static void glBindFragDataLocation(@NativeType("GLuint") int program, @NativeType("GLuint") int colorNumber, @NativeType("GLchar const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        nglBindFragDataLocation(program, colorNumber, memAddress(name));
    }

    /** {@code void glBindFragDataLocation(GLuint program, GLuint colorNumber, GLchar const * name)} */
    public static void glBindFragDataLocation(@NativeType("GLuint") int program, @NativeType("GLuint") int colorNumber, @NativeType("GLchar const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            nglBindFragDataLocation(program, colorNumber, nameEncoded);
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

    // --- [ glBeginConditionalRender ] ---

    /** {@code void glBeginConditionalRender(GLuint id, GLenum mode)} */
    public static native void glBeginConditionalRender(@NativeType("GLuint") int id, @NativeType("GLenum") int mode);

    // --- [ glEndConditionalRender ] ---

    /** {@code void glEndConditionalRender(void)} */
    public static native void glEndConditionalRender();

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

    // --- [ glClampColor ] ---

    /** {@code void glClampColor(GLenum target, GLenum clamp)} */
    public static native void glClampColor(@NativeType("GLenum") int target, @NativeType("GLenum") int clamp);

    // --- [ glIsRenderbuffer ] ---

    /** {@code GLboolean glIsRenderbuffer(GLuint renderbuffer)} */
    @NativeType("GLboolean")
    public static native boolean glIsRenderbuffer(@NativeType("GLuint") int renderbuffer);

    // --- [ glBindRenderbuffer ] ---

    /** {@code void glBindRenderbuffer(GLenum target, GLuint renderbuffer)} */
    public static native void glBindRenderbuffer(@NativeType("GLenum") int target, @NativeType("GLuint") int renderbuffer);

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

    // --- [ glRenderbufferStorage ] ---

    /** {@code void glRenderbufferStorage(GLenum target, GLenum internalformat, GLsizei width, GLsizei height)} */
    public static native void glRenderbufferStorage(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

    // --- [ glRenderbufferStorageMultisample ] ---

    /** {@code void glRenderbufferStorageMultisample(GLenum target, GLsizei samples, GLenum internalformat, GLsizei width, GLsizei height)} */
    public static native void glRenderbufferStorageMultisample(@NativeType("GLenum") int target, @NativeType("GLsizei") int samples, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

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

    // --- [ glIsFramebuffer ] ---

    /** {@code GLboolean glIsFramebuffer(GLuint framebuffer)} */
    @NativeType("GLboolean")
    public static native boolean glIsFramebuffer(@NativeType("GLuint") int framebuffer);

    // --- [ glBindFramebuffer ] ---

    /** {@code void glBindFramebuffer(GLenum target, GLuint framebuffer)} */
    public static native void glBindFramebuffer(@NativeType("GLenum") int target, @NativeType("GLuint") int framebuffer);

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

    // --- [ glCheckFramebufferStatus ] ---

    /** {@code GLenum glCheckFramebufferStatus(GLenum target)} */
    @NativeType("GLenum")
    public static native int glCheckFramebufferStatus(@NativeType("GLenum") int target);

    // --- [ glFramebufferTexture1D ] ---

    /** {@code void glFramebufferTexture1D(GLenum target, GLenum attachment, GLenum textarget, GLuint texture, GLint level)} */
    public static native void glFramebufferTexture1D(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int textarget, @NativeType("GLuint") int texture, @NativeType("GLint") int level);

    // --- [ glFramebufferTexture2D ] ---

    /** {@code void glFramebufferTexture2D(GLenum target, GLenum attachment, GLenum textarget, GLuint texture, GLint level)} */
    public static native void glFramebufferTexture2D(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int textarget, @NativeType("GLuint") int texture, @NativeType("GLint") int level);

    // --- [ glFramebufferTexture3D ] ---

    /** {@code void glFramebufferTexture3D(GLenum target, GLenum attachment, GLenum textarget, GLuint texture, GLint level, GLint layer)} */
    public static native void glFramebufferTexture3D(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int textarget, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int layer);

    // --- [ glFramebufferTextureLayer ] ---

    /** {@code void glFramebufferTextureLayer(GLenum target, GLenum attachment, GLuint texture, GLint level, GLint layer)} */
    public static native void glFramebufferTextureLayer(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int layer);

    // --- [ glFramebufferRenderbuffer ] ---

    /** {@code void glFramebufferRenderbuffer(GLenum target, GLenum attachment, GLenum renderbuffertarget, GLuint renderbuffer)} */
    public static native void glFramebufferRenderbuffer(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int renderbuffertarget, @NativeType("GLuint") int renderbuffer);

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

    // --- [ glBlitFramebuffer ] ---

    /** {@code void glBlitFramebuffer(GLint srcX0, GLint srcY0, GLint srcX1, GLint srcY1, GLint dstX0, GLint dstY0, GLint dstX1, GLint dstY1, GLbitfield mask, GLenum filter)} */
    public static native void glBlitFramebuffer(@NativeType("GLint") int srcX0, @NativeType("GLint") int srcY0, @NativeType("GLint") int srcX1, @NativeType("GLint") int srcY1, @NativeType("GLint") int dstX0, @NativeType("GLint") int dstY0, @NativeType("GLint") int dstX1, @NativeType("GLint") int dstY1, @NativeType("GLbitfield") int mask, @NativeType("GLenum") int filter);

    // --- [ glGenerateMipmap ] ---

    /** {@code void glGenerateMipmap(GLenum target)} */
    public static native void glGenerateMipmap(@NativeType("GLenum") int target);

    // --- [ glTexParameterIiv ] ---

    /** {@code void glTexParameterIiv(GLenum target, GLenum pname, GLint const * params)} */
    public static native void nglTexParameterIiv(int target, int pname, long params);

    /** {@code void glTexParameterIiv(GLenum target, GLenum pname, GLint const * params)} */
    public static void glTexParameterIiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglTexParameterIiv(target, pname, memAddress(params));
    }

    /** {@code void glTexParameterIiv(GLenum target, GLenum pname, GLint const * params)} */
    public static void glTexParameterIi(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") int param) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.ints(param);
            nglTexParameterIiv(target, pname, memAddress(params));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glTexParameterIuiv ] ---

    /** {@code void glTexParameterIuiv(GLenum target, GLenum pname, GLuint const * params)} */
    public static native void nglTexParameterIuiv(int target, int pname, long params);

    /** {@code void glTexParameterIuiv(GLenum target, GLenum pname, GLuint const * params)} */
    public static void glTexParameterIuiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglTexParameterIuiv(target, pname, memAddress(params));
    }

    /** {@code void glTexParameterIuiv(GLenum target, GLenum pname, GLuint const * params)} */
    public static void glTexParameterIui(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint const *") int param) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.ints(param);
            nglTexParameterIuiv(target, pname, memAddress(params));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetTexParameterIiv ] ---

    /** {@code void glGetTexParameterIiv(GLenum target, GLenum pname, GLint * params)} */
    public static native void nglGetTexParameterIiv(int target, int pname, long params);

    /** {@code void glGetTexParameterIiv(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetTexParameterIiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetTexParameterIiv(target, pname, memAddress(params));
    }

    /** {@code void glGetTexParameterIiv(GLenum target, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetTexParameterIi(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetTexParameterIiv(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetTexParameterIuiv ] ---

    /** {@code void glGetTexParameterIuiv(GLenum target, GLenum pname, GLuint * params)} */
    public static native void nglGetTexParameterIuiv(int target, int pname, long params);

    /** {@code void glGetTexParameterIuiv(GLenum target, GLenum pname, GLuint * params)} */
    public static void glGetTexParameterIuiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetTexParameterIuiv(target, pname, memAddress(params));
    }

    /** {@code void glGetTexParameterIuiv(GLenum target, GLenum pname, GLuint * params)} */
    @NativeType("void")
    public static int glGetTexParameterIui(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetTexParameterIuiv(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glColorMaski ] ---

    /** {@code void glColorMaski(GLuint buf, GLboolean r, GLboolean g, GLboolean b, GLboolean a)} */
    public static native void glColorMaski(@NativeType("GLuint") int buf, @NativeType("GLboolean") boolean r, @NativeType("GLboolean") boolean g, @NativeType("GLboolean") boolean b, @NativeType("GLboolean") boolean a);

    // --- [ glGetBooleani_v ] ---

    /** {@code void glGetBooleani_v(GLenum target, GLuint index, GLboolean * data)} */
    public static native void nglGetBooleani_v(int target, int index, long data);

    /** {@code void glGetBooleani_v(GLenum target, GLuint index, GLboolean * data)} */
    public static void glGetBooleani_v(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLboolean *") ByteBuffer data) {
        if (CHECKS) {
            check(data, 1);
        }
        nglGetBooleani_v(target, index, memAddress(data));
    }

    /** {@code void glGetBooleani_v(GLenum target, GLuint index, GLboolean * data)} */
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

    // --- [ glEnablei ] ---

    /** {@code void glEnablei(GLenum cap, GLuint index)} */
    public static native void glEnablei(@NativeType("GLenum") int cap, @NativeType("GLuint") int index);

    // --- [ glDisablei ] ---

    /** {@code void glDisablei(GLenum target, GLuint index)} */
    public static native void glDisablei(@NativeType("GLenum") int target, @NativeType("GLuint") int index);

    // --- [ glIsEnabledi ] ---

    /** {@code GLboolean glIsEnabledi(GLenum target, GLuint index)} */
    @NativeType("GLboolean")
    public static native boolean glIsEnabledi(@NativeType("GLenum") int target, @NativeType("GLuint") int index);

    // --- [ glBindBufferRange ] ---

    /** {@code void glBindBufferRange(GLenum target, GLuint index, GLuint buffer, GLintptr offset, GLsizeiptr size)} */
    public static native void glBindBufferRange(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size);

    // --- [ glBindBufferBase ] ---

    /** {@code void glBindBufferBase(GLenum target, GLuint index, GLuint buffer)} */
    public static native void glBindBufferBase(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLuint") int buffer);

    // --- [ glBeginTransformFeedback ] ---

    /** {@code void glBeginTransformFeedback(GLenum primitiveMode)} */
    public static native void glBeginTransformFeedback(@NativeType("GLenum") int primitiveMode);

    // --- [ glEndTransformFeedback ] ---

    /** {@code void glEndTransformFeedback(void)} */
    public static native void glEndTransformFeedback();

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
        return glGetTransformFeedbackVarying(program, index, GL20.glGetProgrami(program, GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH), size, type);
    }

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

    /** {@code void glClearBufferiv(GLenum buffer, GLint drawbuffer, GLint const * value)} */
    public static void glClearBufferiv(@NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLint const *") int[] value) {
        long __functionAddress = GL.getICD().glClearBufferiv;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        callPV(buffer, drawbuffer, value, __functionAddress);
    }

    /** {@code void glClearBufferuiv(GLenum buffer, GLint drawbuffer, GLint const * value)} */
    public static void glClearBufferuiv(@NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLint const *") int[] value) {
        long __functionAddress = GL.getICD().glClearBufferuiv;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 4);
        }
        callPV(buffer, drawbuffer, value, __functionAddress);
    }

    /** {@code void glClearBufferfv(GLenum buffer, GLint drawbuffer, GLfloat const * value)} */
    public static void glClearBufferfv(@NativeType("GLenum") int buffer, @NativeType("GLint") int drawbuffer, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glClearBufferfv;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        callPV(buffer, drawbuffer, value, __functionAddress);
    }

    /** {@code void glVertexAttribI1iv(GLuint index, GLint const * v)} */
    public static void glVertexAttribI1iv(@NativeType("GLuint") int index, @NativeType("GLint const *") int[] v) {
        long __functionAddress = GL.getICD().glVertexAttribI1iv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 1);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttribI2iv(GLuint index, GLint const * v)} */
    public static void glVertexAttribI2iv(@NativeType("GLuint") int index, @NativeType("GLint const *") int[] v) {
        long __functionAddress = GL.getICD().glVertexAttribI2iv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 2);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttribI3iv(GLuint index, GLint const * v)} */
    public static void glVertexAttribI3iv(@NativeType("GLuint") int index, @NativeType("GLint const *") int[] v) {
        long __functionAddress = GL.getICD().glVertexAttribI3iv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttribI4iv(GLuint index, GLint const * v)} */
    public static void glVertexAttribI4iv(@NativeType("GLuint") int index, @NativeType("GLint const *") int[] v) {
        long __functionAddress = GL.getICD().glVertexAttribI4iv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttribI1uiv(GLuint index, GLuint const * v)} */
    public static void glVertexAttribI1uiv(@NativeType("GLuint") int index, @NativeType("GLuint const *") int[] v) {
        long __functionAddress = GL.getICD().glVertexAttribI1uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 1);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttribI2uiv(GLuint index, GLuint const * v)} */
    public static void glVertexAttribI2uiv(@NativeType("GLuint") int index, @NativeType("GLuint const *") int[] v) {
        long __functionAddress = GL.getICD().glVertexAttribI2uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 2);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttribI3uiv(GLuint index, GLuint const * v)} */
    public static void glVertexAttribI3uiv(@NativeType("GLuint") int index, @NativeType("GLuint const *") int[] v) {
        long __functionAddress = GL.getICD().glVertexAttribI3uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttribI4uiv(GLuint index, GLuint const * v)} */
    public static void glVertexAttribI4uiv(@NativeType("GLuint") int index, @NativeType("GLuint const *") int[] v) {
        long __functionAddress = GL.getICD().glVertexAttribI4uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttribI4sv(GLuint index, GLshort const * v)} */
    public static void glVertexAttribI4sv(@NativeType("GLuint") int index, @NativeType("GLshort const *") short[] v) {
        long __functionAddress = GL.getICD().glVertexAttribI4sv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glVertexAttribI4usv(GLuint index, GLshort const * v)} */
    public static void glVertexAttribI4usv(@NativeType("GLuint") int index, @NativeType("GLshort const *") short[] v) {
        long __functionAddress = GL.getICD().glVertexAttribI4usv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(index, v, __functionAddress);
    }

    /** {@code void glGetVertexAttribIiv(GLuint index, GLenum pname, GLint * params)} */
    public static void glGetVertexAttribIiv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetVertexAttribIiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(index, pname, params, __functionAddress);
    }

    /** {@code void glGetVertexAttribIuiv(GLuint index, GLenum pname, GLuint * params)} */
    public static void glGetVertexAttribIuiv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] params) {
        long __functionAddress = GL.getICD().glGetVertexAttribIuiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(index, pname, params, __functionAddress);
    }

    /** {@code void glUniform1uiv(GLint location, GLsizei count, GLuint const * value)} */
    public static void glUniform1uiv(@NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GL.getICD().glUniform1uiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length, value, __functionAddress);
    }

    /** {@code void glUniform2uiv(GLint location, GLsizei count, GLuint const * value)} */
    public static void glUniform2uiv(@NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GL.getICD().glUniform2uiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length >> 1, value, __functionAddress);
    }

    /** {@code void glUniform3uiv(GLint location, GLsizei count, GLuint const * value)} */
    public static void glUniform3uiv(@NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GL.getICD().glUniform3uiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length / 3, value, __functionAddress);
    }

    /** {@code void glUniform4uiv(GLint location, GLsizei count, GLuint const * value)} */
    public static void glUniform4uiv(@NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GL.getICD().glUniform4uiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length >> 2, value, __functionAddress);
    }

    /** {@code void glGetUniformuiv(GLuint program, GLint location, GLuint * params)} */
    public static void glGetUniformuiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint *") int[] params) {
        long __functionAddress = GL.getICD().glGetUniformuiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(program, location, params, __functionAddress);
    }

    /** {@code void glDeleteRenderbuffers(GLsizei n, GLuint const * renderbuffers)} */
    public static void glDeleteRenderbuffers(@NativeType("GLuint const *") int[] renderbuffers) {
        long __functionAddress = GL.getICD().glDeleteRenderbuffers;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(renderbuffers.length, renderbuffers, __functionAddress);
    }

    /** {@code void glGenRenderbuffers(GLsizei n, GLuint * renderbuffers)} */
    public static void glGenRenderbuffers(@NativeType("GLuint *") int[] renderbuffers) {
        long __functionAddress = GL.getICD().glGenRenderbuffers;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(renderbuffers.length, renderbuffers, __functionAddress);
    }

    /** {@code void glGetRenderbufferParameteriv(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetRenderbufferParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetRenderbufferParameteriv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** {@code void glDeleteFramebuffers(GLsizei n, GLuint const * framebuffers)} */
    public static void glDeleteFramebuffers(@NativeType("GLuint const *") int[] framebuffers) {
        long __functionAddress = GL.getICD().glDeleteFramebuffers;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(framebuffers.length, framebuffers, __functionAddress);
    }

    /** {@code void glGenFramebuffers(GLsizei n, GLuint * framebuffers)} */
    public static void glGenFramebuffers(@NativeType("GLuint *") int[] framebuffers) {
        long __functionAddress = GL.getICD().glGenFramebuffers;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(framebuffers.length, framebuffers, __functionAddress);
    }

    /** {@code void glGetFramebufferAttachmentParameteriv(GLenum target, GLenum attachment, GLenum pname, GLint * params)} */
    public static void glGetFramebufferAttachmentParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetFramebufferAttachmentParameteriv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, attachment, pname, params, __functionAddress);
    }

    /** {@code void glTexParameterIiv(GLenum target, GLenum pname, GLint const * params)} */
    public static void glTexParameterIiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        long __functionAddress = GL.getICD().glTexParameterIiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** {@code void glTexParameterIuiv(GLenum target, GLenum pname, GLuint const * params)} */
    public static void glTexParameterIuiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint const *") int[] params) {
        long __functionAddress = GL.getICD().glTexParameterIuiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** {@code void glGetTexParameterIiv(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetTexParameterIiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetTexParameterIiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** {@code void glGetTexParameterIuiv(GLenum target, GLenum pname, GLuint * params)} */
    public static void glGetTexParameterIuiv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] params) {
        long __functionAddress = GL.getICD().glGetTexParameterIuiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** {@code void glGetIntegeri_v(GLenum target, GLuint index, GLint * data)} */
    public static void glGetIntegeri_v(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLint *") int[] data) {
        long __functionAddress = GL.getICD().glGetIntegeri_v;
        if (CHECKS) {
            check(__functionAddress);
            check(data, 1);
        }
        callPV(target, index, data, __functionAddress);
    }

    /** {@code void glGetTransformFeedbackVarying(GLuint program, GLuint index, GLsizei bufSize, GLsizei * length, GLsizei * size, GLenum * type, GLchar * name)} */
    public static void glGetTransformFeedbackVarying(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLsizei *") int[] size, @NativeType("GLenum *") int[] type, @NativeType("GLchar *") ByteBuffer name) {
        long __functionAddress = GL.getICD().glGetTransformFeedbackVarying;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(length, 1);
            check(size, 1);
            check(type, 1);
        }
        callPPPPV(program, index, name.remaining(), length, size, type, memAddress(name), __functionAddress);
    }

    /** {@code void glDeleteVertexArrays(GLsizei n, GLuint const * arrays)} */
    public static void glDeleteVertexArrays(@NativeType("GLuint const *") int[] arrays) {
        long __functionAddress = GL.getICD().glDeleteVertexArrays;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(arrays.length, arrays, __functionAddress);
    }

    /** {@code void glGenVertexArrays(GLsizei n, GLuint * arrays)} */
    public static void glGenVertexArrays(@NativeType("GLuint *") int[] arrays) {
        long __functionAddress = GL.getICD().glGenVertexArrays;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(arrays.length, arrays, __functionAddress);
    }

}
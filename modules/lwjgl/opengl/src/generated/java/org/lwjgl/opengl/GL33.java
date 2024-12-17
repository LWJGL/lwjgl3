/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class GL33 extends GL32 {

    static { GL.initialize(); }

    public static final int
        GL_SRC1_COLOR           = 0x88F9,
        GL_ONE_MINUS_SRC1_COLOR = 0x88FA,
        GL_ONE_MINUS_SRC1_ALPHA = 0x88FB;

    public static final int GL_MAX_DUAL_SOURCE_DRAW_BUFFERS = 0x88FC;

    public static final int GL_ANY_SAMPLES_PASSED = 0x8C2F;

    public static final int GL_SAMPLER_BINDING = 0x8919;

    public static final int GL_RGB10_A2UI = 0x906F;

    public static final int
        GL_TEXTURE_SWIZZLE_R = 0x8E42,
        GL_TEXTURE_SWIZZLE_G = 0x8E43,
        GL_TEXTURE_SWIZZLE_B = 0x8E44,
        GL_TEXTURE_SWIZZLE_A = 0x8E45;

    public static final int GL_TEXTURE_SWIZZLE_RGBA = 0x8E46;

    public static final int GL_TIME_ELAPSED = 0x88BF;

    public static final int GL_TIMESTAMP = 0x8E28;

    public static final int GL_VERTEX_ATTRIB_ARRAY_DIVISOR = 0x88FE;

    public static final int GL_INT_2_10_10_10_REV = 0x8D9F;

    protected GL33() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBindFragDataLocationIndexed ] ---

    /** {@code void glBindFragDataLocationIndexed(GLuint program, GLuint colorNumber, GLuint index, GLchar const * name)} */
    public static void nglBindFragDataLocationIndexed(int program, int colorNumber, int index, long name) {
        GL33C.nglBindFragDataLocationIndexed(program, colorNumber, index, name);
    }

    /** {@code void glBindFragDataLocationIndexed(GLuint program, GLuint colorNumber, GLuint index, GLchar const * name)} */
    public static void glBindFragDataLocationIndexed(@NativeType("GLuint") int program, @NativeType("GLuint") int colorNumber, @NativeType("GLuint") int index, @NativeType("GLchar const *") ByteBuffer name) {
        GL33C.glBindFragDataLocationIndexed(program, colorNumber, index, name);
    }

    /** {@code void glBindFragDataLocationIndexed(GLuint program, GLuint colorNumber, GLuint index, GLchar const * name)} */
    public static void glBindFragDataLocationIndexed(@NativeType("GLuint") int program, @NativeType("GLuint") int colorNumber, @NativeType("GLuint") int index, @NativeType("GLchar const *") CharSequence name) {
        GL33C.glBindFragDataLocationIndexed(program, colorNumber, index, name);
    }

    // --- [ glGetFragDataIndex ] ---

    /** {@code GLint glGetFragDataIndex(GLuint program, GLchar const * name)} */
    public static int nglGetFragDataIndex(int program, long name) {
        return GL33C.nglGetFragDataIndex(program, name);
    }

    /** {@code GLint glGetFragDataIndex(GLuint program, GLchar const * name)} */
    @NativeType("GLint")
    public static int glGetFragDataIndex(@NativeType("GLuint") int program, @NativeType("GLchar const *") ByteBuffer name) {
        return GL33C.glGetFragDataIndex(program, name);
    }

    /** {@code GLint glGetFragDataIndex(GLuint program, GLchar const * name)} */
    @NativeType("GLint")
    public static int glGetFragDataIndex(@NativeType("GLuint") int program, @NativeType("GLchar const *") CharSequence name) {
        return GL33C.glGetFragDataIndex(program, name);
    }

    // --- [ glGenSamplers ] ---

    /** {@code void glGenSamplers(GLsizei count, GLuint * samplers)} */
    public static void nglGenSamplers(int count, long samplers) {
        GL33C.nglGenSamplers(count, samplers);
    }

    /** {@code void glGenSamplers(GLsizei count, GLuint * samplers)} */
    public static void glGenSamplers(@NativeType("GLuint *") IntBuffer samplers) {
        GL33C.glGenSamplers(samplers);
    }

    /** {@code void glGenSamplers(GLsizei count, GLuint * samplers)} */
    @NativeType("void")
    public static int glGenSamplers() {
        return GL33C.glGenSamplers();
    }

    // --- [ glDeleteSamplers ] ---

    /** {@code void glDeleteSamplers(GLsizei count, GLuint const * samplers)} */
    public static void nglDeleteSamplers(int count, long samplers) {
        GL33C.nglDeleteSamplers(count, samplers);
    }

    /** {@code void glDeleteSamplers(GLsizei count, GLuint const * samplers)} */
    public static void glDeleteSamplers(@NativeType("GLuint const *") IntBuffer samplers) {
        GL33C.glDeleteSamplers(samplers);
    }

    /** {@code void glDeleteSamplers(GLsizei count, GLuint const * samplers)} */
    public static void glDeleteSamplers(@NativeType("GLuint const *") int sampler) {
        GL33C.glDeleteSamplers(sampler);
    }

    // --- [ glIsSampler ] ---

    /** {@code GLboolean glIsSampler(GLuint sampler)} */
    @NativeType("GLboolean")
    public static boolean glIsSampler(@NativeType("GLuint") int sampler) {
        return GL33C.glIsSampler(sampler);
    }

    // --- [ glBindSampler ] ---

    /** {@code void glBindSampler(GLuint unit, GLuint sampler)} */
    public static void glBindSampler(@NativeType("GLuint") int unit, @NativeType("GLuint") int sampler) {
        GL33C.glBindSampler(unit, sampler);
    }

    // --- [ glSamplerParameteri ] ---

    /** {@code void glSamplerParameteri(GLuint sampler, GLenum pname, GLint param)} */
    public static void glSamplerParameteri(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint") int param) {
        GL33C.glSamplerParameteri(sampler, pname, param);
    }

    // --- [ glSamplerParameterf ] ---

    /** {@code void glSamplerParameterf(GLuint sampler, GLenum pname, GLfloat param)} */
    public static void glSamplerParameterf(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLfloat") float param) {
        GL33C.glSamplerParameterf(sampler, pname, param);
    }

    // --- [ glSamplerParameteriv ] ---

    /** {@code void glSamplerParameteriv(GLuint sampler, GLenum pname, GLint const * params)} */
    public static void nglSamplerParameteriv(int sampler, int pname, long params) {
        GL33C.nglSamplerParameteriv(sampler, pname, params);
    }

    /** {@code void glSamplerParameteriv(GLuint sampler, GLenum pname, GLint const * params)} */
    public static void glSamplerParameteriv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        GL33C.glSamplerParameteriv(sampler, pname, params);
    }

    // --- [ glSamplerParameterfv ] ---

    /** {@code void glSamplerParameterfv(GLuint sampler, GLenum pname, GLfloat const * params)} */
    public static void nglSamplerParameterfv(int sampler, int pname, long params) {
        GL33C.nglSamplerParameterfv(sampler, pname, params);
    }

    /** {@code void glSamplerParameterfv(GLuint sampler, GLenum pname, GLfloat const * params)} */
    public static void glSamplerParameterfv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer params) {
        GL33C.glSamplerParameterfv(sampler, pname, params);
    }

    // --- [ glSamplerParameterIiv ] ---

    /** {@code void glSamplerParameterIiv(GLuint sampler, GLenum pname, GLint const * params)} */
    public static void nglSamplerParameterIiv(int sampler, int pname, long params) {
        GL33C.nglSamplerParameterIiv(sampler, pname, params);
    }

    /** {@code void glSamplerParameterIiv(GLuint sampler, GLenum pname, GLint const * params)} */
    public static void glSamplerParameterIiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        GL33C.glSamplerParameterIiv(sampler, pname, params);
    }

    // --- [ glSamplerParameterIuiv ] ---

    /** {@code void glSamplerParameterIuiv(GLuint sampler, GLenum pname, GLuint const * params)} */
    public static void nglSamplerParameterIuiv(int sampler, int pname, long params) {
        GL33C.nglSamplerParameterIuiv(sampler, pname, params);
    }

    /** {@code void glSamplerParameterIuiv(GLuint sampler, GLenum pname, GLuint const * params)} */
    public static void glSamplerParameterIuiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLuint const *") IntBuffer params) {
        GL33C.glSamplerParameterIuiv(sampler, pname, params);
    }

    // --- [ glGetSamplerParameteriv ] ---

    /** {@code void glGetSamplerParameteriv(GLuint sampler, GLenum pname, GLint * params)} */
    public static void nglGetSamplerParameteriv(int sampler, int pname, long params) {
        GL33C.nglGetSamplerParameteriv(sampler, pname, params);
    }

    /** {@code void glGetSamplerParameteriv(GLuint sampler, GLenum pname, GLint * params)} */
    public static void glGetSamplerParameteriv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        GL33C.glGetSamplerParameteriv(sampler, pname, params);
    }

    /** {@code void glGetSamplerParameteriv(GLuint sampler, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetSamplerParameteri(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname) {
        return GL33C.glGetSamplerParameteri(sampler, pname);
    }

    // --- [ glGetSamplerParameterfv ] ---

    /** {@code void glGetSamplerParameterfv(GLuint sampler, GLenum pname, GLfloat * params)} */
    public static void nglGetSamplerParameterfv(int sampler, int pname, long params) {
        GL33C.nglGetSamplerParameterfv(sampler, pname, params);
    }

    /** {@code void glGetSamplerParameterfv(GLuint sampler, GLenum pname, GLfloat * params)} */
    public static void glGetSamplerParameterfv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        GL33C.glGetSamplerParameterfv(sampler, pname, params);
    }

    /** {@code void glGetSamplerParameterfv(GLuint sampler, GLenum pname, GLfloat * params)} */
    @NativeType("void")
    public static float glGetSamplerParameterf(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname) {
        return GL33C.glGetSamplerParameterf(sampler, pname);
    }

    // --- [ glGetSamplerParameterIiv ] ---

    /** {@code void glGetSamplerParameterIiv(GLuint sampler, GLenum pname, GLint * params)} */
    public static void nglGetSamplerParameterIiv(int sampler, int pname, long params) {
        GL33C.nglGetSamplerParameterIiv(sampler, pname, params);
    }

    /** {@code void glGetSamplerParameterIiv(GLuint sampler, GLenum pname, GLint * params)} */
    public static void glGetSamplerParameterIiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        GL33C.glGetSamplerParameterIiv(sampler, pname, params);
    }

    /** {@code void glGetSamplerParameterIiv(GLuint sampler, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetSamplerParameterIi(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname) {
        return GL33C.glGetSamplerParameterIi(sampler, pname);
    }

    // --- [ glGetSamplerParameterIuiv ] ---

    /** {@code void glGetSamplerParameterIuiv(GLuint sampler, GLenum pname, GLuint * params)} */
    public static void nglGetSamplerParameterIuiv(int sampler, int pname, long params) {
        GL33C.nglGetSamplerParameterIuiv(sampler, pname, params);
    }

    /** {@code void glGetSamplerParameterIuiv(GLuint sampler, GLenum pname, GLuint * params)} */
    public static void glGetSamplerParameterIuiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLuint *") IntBuffer params) {
        GL33C.glGetSamplerParameterIuiv(sampler, pname, params);
    }

    /** {@code void glGetSamplerParameterIuiv(GLuint sampler, GLenum pname, GLuint * params)} */
    @NativeType("void")
    public static int glGetSamplerParameterIui(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname) {
        return GL33C.glGetSamplerParameterIui(sampler, pname);
    }

    // --- [ glQueryCounter ] ---

    /** {@code void glQueryCounter(GLuint id, GLenum target)} */
    public static void glQueryCounter(@NativeType("GLuint") int id, @NativeType("GLenum") int target) {
        GL33C.glQueryCounter(id, target);
    }

    // --- [ glGetQueryObjecti64v ] ---

    /** {@code void glGetQueryObjecti64v(GLuint id, GLenum pname, GLint64 * params)} */
    public static void nglGetQueryObjecti64v(int id, int pname, long params) {
        GL33C.nglGetQueryObjecti64v(id, pname, params);
    }

    /** {@code void glGetQueryObjecti64v(GLuint id, GLenum pname, GLint64 * params)} */
    public static void glGetQueryObjecti64v(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint64 *") LongBuffer params) {
        GL33C.glGetQueryObjecti64v(id, pname, params);
    }

    /** {@code void glGetQueryObjecti64v(GLuint id, GLenum pname, GLint64 * params)} */
    public static void glGetQueryObjecti64v(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint64 *") long params) {
        GL33C.glGetQueryObjecti64v(id, pname, params);
    }

    /** {@code void glGetQueryObjecti64v(GLuint id, GLenum pname, GLint64 * params)} */
    @NativeType("void")
    public static long glGetQueryObjecti64(@NativeType("GLuint") int id, @NativeType("GLenum") int pname) {
        return GL33C.glGetQueryObjecti64(id, pname);
    }

    // --- [ glGetQueryObjectui64v ] ---

    /** {@code void glGetQueryObjectui64v(GLuint id, GLenum pname, GLuint64 * params)} */
    public static void nglGetQueryObjectui64v(int id, int pname, long params) {
        GL33C.nglGetQueryObjectui64v(id, pname, params);
    }

    /** {@code void glGetQueryObjectui64v(GLuint id, GLenum pname, GLuint64 * params)} */
    public static void glGetQueryObjectui64v(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint64 *") LongBuffer params) {
        GL33C.glGetQueryObjectui64v(id, pname, params);
    }

    /** {@code void glGetQueryObjectui64v(GLuint id, GLenum pname, GLuint64 * params)} */
    public static void glGetQueryObjectui64v(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint64 *") long params) {
        GL33C.glGetQueryObjectui64v(id, pname, params);
    }

    /** {@code void glGetQueryObjectui64v(GLuint id, GLenum pname, GLuint64 * params)} */
    @NativeType("void")
    public static long glGetQueryObjectui64(@NativeType("GLuint") int id, @NativeType("GLenum") int pname) {
        return GL33C.glGetQueryObjectui64(id, pname);
    }

    // --- [ glVertexAttribDivisor ] ---

    /** {@code void glVertexAttribDivisor(GLuint index, GLuint divisor)} */
    public static void glVertexAttribDivisor(@NativeType("GLuint") int index, @NativeType("GLuint") int divisor) {
        GL33C.glVertexAttribDivisor(index, divisor);
    }

    // --- [ glVertexP2ui ] ---

    /** {@code void glVertexP2ui(GLenum type, GLuint value)} */
    public static native void glVertexP2ui(@NativeType("GLenum") int type, @NativeType("GLuint") int value);

    // --- [ glVertexP3ui ] ---

    /** {@code void glVertexP3ui(GLenum type, GLuint value)} */
    public static native void glVertexP3ui(@NativeType("GLenum") int type, @NativeType("GLuint") int value);

    // --- [ glVertexP4ui ] ---

    /** {@code void glVertexP4ui(GLenum type, GLuint value)} */
    public static native void glVertexP4ui(@NativeType("GLenum") int type, @NativeType("GLuint") int value);

    // --- [ glVertexP2uiv ] ---

    /** {@code void glVertexP2uiv(GLenum type, GLuint const * value)} */
    public static native void nglVertexP2uiv(int type, long value);

    /** {@code void glVertexP2uiv(GLenum type, GLuint const * value)} */
    public static void glVertexP2uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nglVertexP2uiv(type, memAddress(value));
    }

    // --- [ glVertexP3uiv ] ---

    /** {@code void glVertexP3uiv(GLenum type, GLuint const * value)} */
    public static native void nglVertexP3uiv(int type, long value);

    /** {@code void glVertexP3uiv(GLenum type, GLuint const * value)} */
    public static void glVertexP3uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nglVertexP3uiv(type, memAddress(value));
    }

    // --- [ glVertexP4uiv ] ---

    /** {@code void glVertexP4uiv(GLenum type, GLuint const * value)} */
    public static native void nglVertexP4uiv(int type, long value);

    /** {@code void glVertexP4uiv(GLenum type, GLuint const * value)} */
    public static void glVertexP4uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nglVertexP4uiv(type, memAddress(value));
    }

    // --- [ glTexCoordP1ui ] ---

    /** {@code void glTexCoordP1ui(GLenum type, GLuint coords)} */
    public static native void glTexCoordP1ui(@NativeType("GLenum") int type, @NativeType("GLuint") int coords);

    // --- [ glTexCoordP2ui ] ---

    /** {@code void glTexCoordP2ui(GLenum type, GLuint coords)} */
    public static native void glTexCoordP2ui(@NativeType("GLenum") int type, @NativeType("GLuint") int coords);

    // --- [ glTexCoordP3ui ] ---

    /** {@code void glTexCoordP3ui(GLenum type, GLuint coords)} */
    public static native void glTexCoordP3ui(@NativeType("GLenum") int type, @NativeType("GLuint") int coords);

    // --- [ glTexCoordP4ui ] ---

    /** {@code void glTexCoordP4ui(GLenum type, GLuint coords)} */
    public static native void glTexCoordP4ui(@NativeType("GLenum") int type, @NativeType("GLuint") int coords);

    // --- [ glTexCoordP1uiv ] ---

    /** {@code void glTexCoordP1uiv(GLenum type, GLuint const * coords)} */
    public static native void nglTexCoordP1uiv(int type, long coords);

    /** {@code void glTexCoordP1uiv(GLenum type, GLuint const * coords)} */
    public static void glTexCoordP1uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer coords) {
        if (CHECKS) {
            check(coords, 1);
        }
        nglTexCoordP1uiv(type, memAddress(coords));
    }

    // --- [ glTexCoordP2uiv ] ---

    /** {@code void glTexCoordP2uiv(GLenum type, GLuint const * coords)} */
    public static native void nglTexCoordP2uiv(int type, long coords);

    /** {@code void glTexCoordP2uiv(GLenum type, GLuint const * coords)} */
    public static void glTexCoordP2uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer coords) {
        if (CHECKS) {
            check(coords, 1);
        }
        nglTexCoordP2uiv(type, memAddress(coords));
    }

    // --- [ glTexCoordP3uiv ] ---

    /** {@code void glTexCoordP3uiv(GLenum type, GLuint const * coords)} */
    public static native void nglTexCoordP3uiv(int type, long coords);

    /** {@code void glTexCoordP3uiv(GLenum type, GLuint const * coords)} */
    public static void glTexCoordP3uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer coords) {
        if (CHECKS) {
            check(coords, 1);
        }
        nglTexCoordP3uiv(type, memAddress(coords));
    }

    // --- [ glTexCoordP4uiv ] ---

    /** {@code void glTexCoordP4uiv(GLenum type, GLuint const * coords)} */
    public static native void nglTexCoordP4uiv(int type, long coords);

    /** {@code void glTexCoordP4uiv(GLenum type, GLuint const * coords)} */
    public static void glTexCoordP4uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer coords) {
        if (CHECKS) {
            check(coords, 1);
        }
        nglTexCoordP4uiv(type, memAddress(coords));
    }

    // --- [ glMultiTexCoordP1ui ] ---

    /** {@code void glMultiTexCoordP1ui(GLenum texture, GLenum type, GLuint coords)} */
    public static native void glMultiTexCoordP1ui(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("GLuint") int coords);

    // --- [ glMultiTexCoordP2ui ] ---

    /** {@code void glMultiTexCoordP2ui(GLenum texture, GLenum type, GLuint coords)} */
    public static native void glMultiTexCoordP2ui(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("GLuint") int coords);

    // --- [ glMultiTexCoordP3ui ] ---

    /** {@code void glMultiTexCoordP3ui(GLenum texture, GLenum type, GLuint coords)} */
    public static native void glMultiTexCoordP3ui(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("GLuint") int coords);

    // --- [ glMultiTexCoordP4ui ] ---

    /** {@code void glMultiTexCoordP4ui(GLenum texture, GLenum type, GLuint coords)} */
    public static native void glMultiTexCoordP4ui(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("GLuint") int coords);

    // --- [ glMultiTexCoordP1uiv ] ---

    /** {@code void glMultiTexCoordP1uiv(GLenum texture, GLenum type, GLuint const * coords)} */
    public static native void nglMultiTexCoordP1uiv(int texture, int type, long coords);

    /** {@code void glMultiTexCoordP1uiv(GLenum texture, GLenum type, GLuint const * coords)} */
    public static void glMultiTexCoordP1uiv(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer coords) {
        if (CHECKS) {
            check(coords, 1);
        }
        nglMultiTexCoordP1uiv(texture, type, memAddress(coords));
    }

    // --- [ glMultiTexCoordP2uiv ] ---

    /** {@code void glMultiTexCoordP2uiv(GLenum texture, GLenum type, GLuint const * coords)} */
    public static native void nglMultiTexCoordP2uiv(int texture, int type, long coords);

    /** {@code void glMultiTexCoordP2uiv(GLenum texture, GLenum type, GLuint const * coords)} */
    public static void glMultiTexCoordP2uiv(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer coords) {
        if (CHECKS) {
            check(coords, 1);
        }
        nglMultiTexCoordP2uiv(texture, type, memAddress(coords));
    }

    // --- [ glMultiTexCoordP3uiv ] ---

    /** {@code void glMultiTexCoordP3uiv(GLenum texture, GLenum type, GLuint const * coords)} */
    public static native void nglMultiTexCoordP3uiv(int texture, int type, long coords);

    /** {@code void glMultiTexCoordP3uiv(GLenum texture, GLenum type, GLuint const * coords)} */
    public static void glMultiTexCoordP3uiv(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer coords) {
        if (CHECKS) {
            check(coords, 1);
        }
        nglMultiTexCoordP3uiv(texture, type, memAddress(coords));
    }

    // --- [ glMultiTexCoordP4uiv ] ---

    /** {@code void glMultiTexCoordP4uiv(GLenum texture, GLenum type, GLuint const * coords)} */
    public static native void nglMultiTexCoordP4uiv(int texture, int type, long coords);

    /** {@code void glMultiTexCoordP4uiv(GLenum texture, GLenum type, GLuint const * coords)} */
    public static void glMultiTexCoordP4uiv(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer coords) {
        if (CHECKS) {
            check(coords, 1);
        }
        nglMultiTexCoordP4uiv(texture, type, memAddress(coords));
    }

    // --- [ glNormalP3ui ] ---

    /** {@code void glNormalP3ui(GLenum type, GLuint coords)} */
    public static native void glNormalP3ui(@NativeType("GLenum") int type, @NativeType("GLuint") int coords);

    // --- [ glNormalP3uiv ] ---

    /** {@code void glNormalP3uiv(GLenum type, GLuint const * coords)} */
    public static native void nglNormalP3uiv(int type, long coords);

    /** {@code void glNormalP3uiv(GLenum type, GLuint const * coords)} */
    public static void glNormalP3uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer coords) {
        if (CHECKS) {
            check(coords, 1);
        }
        nglNormalP3uiv(type, memAddress(coords));
    }

    // --- [ glColorP3ui ] ---

    /** {@code void glColorP3ui(GLenum type, GLuint color)} */
    public static native void glColorP3ui(@NativeType("GLenum") int type, @NativeType("GLuint") int color);

    // --- [ glColorP4ui ] ---

    /** {@code void glColorP4ui(GLenum type, GLuint color)} */
    public static native void glColorP4ui(@NativeType("GLenum") int type, @NativeType("GLuint") int color);

    // --- [ glColorP3uiv ] ---

    /** {@code void glColorP3uiv(GLenum type, GLuint const * color)} */
    public static native void nglColorP3uiv(int type, long color);

    /** {@code void glColorP3uiv(GLenum type, GLuint const * color)} */
    public static void glColorP3uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer color) {
        if (CHECKS) {
            check(color, 1);
        }
        nglColorP3uiv(type, memAddress(color));
    }

    // --- [ glColorP4uiv ] ---

    /** {@code void glColorP4uiv(GLenum type, GLuint const * color)} */
    public static native void nglColorP4uiv(int type, long color);

    /** {@code void glColorP4uiv(GLenum type, GLuint const * color)} */
    public static void glColorP4uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer color) {
        if (CHECKS) {
            check(color, 1);
        }
        nglColorP4uiv(type, memAddress(color));
    }

    // --- [ glSecondaryColorP3ui ] ---

    /** {@code void glSecondaryColorP3ui(GLenum type, GLuint color)} */
    public static native void glSecondaryColorP3ui(@NativeType("GLenum") int type, @NativeType("GLuint") int color);

    // --- [ glSecondaryColorP3uiv ] ---

    /** {@code void glSecondaryColorP3uiv(GLenum type, GLuint const * color)} */
    public static native void nglSecondaryColorP3uiv(int type, long color);

    /** {@code void glSecondaryColorP3uiv(GLenum type, GLuint const * color)} */
    public static void glSecondaryColorP3uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer color) {
        if (CHECKS) {
            check(color, 1);
        }
        nglSecondaryColorP3uiv(type, memAddress(color));
    }

    // --- [ glVertexAttribP1ui ] ---

    /** {@code void glVertexAttribP1ui(GLuint index, GLenum type, GLboolean normalized, GLuint value)} */
    public static void glVertexAttribP1ui(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint") int value) {
        GL33C.glVertexAttribP1ui(index, type, normalized, value);
    }

    // --- [ glVertexAttribP2ui ] ---

    /** {@code void glVertexAttribP2ui(GLuint index, GLenum type, GLboolean normalized, GLuint value)} */
    public static void glVertexAttribP2ui(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint") int value) {
        GL33C.glVertexAttribP2ui(index, type, normalized, value);
    }

    // --- [ glVertexAttribP3ui ] ---

    /** {@code void glVertexAttribP3ui(GLuint index, GLenum type, GLboolean normalized, GLuint value)} */
    public static void glVertexAttribP3ui(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint") int value) {
        GL33C.glVertexAttribP3ui(index, type, normalized, value);
    }

    // --- [ glVertexAttribP4ui ] ---

    /** {@code void glVertexAttribP4ui(GLuint index, GLenum type, GLboolean normalized, GLuint value)} */
    public static void glVertexAttribP4ui(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint") int value) {
        GL33C.glVertexAttribP4ui(index, type, normalized, value);
    }

    // --- [ glVertexAttribP1uiv ] ---

    /** {@code void glVertexAttribP1uiv(GLuint index, GLenum type, GLboolean normalized, GLuint const * value)} */
    public static void nglVertexAttribP1uiv(int index, int type, boolean normalized, long value) {
        GL33C.nglVertexAttribP1uiv(index, type, normalized, value);
    }

    /** {@code void glVertexAttribP1uiv(GLuint index, GLenum type, GLboolean normalized, GLuint const * value)} */
    public static void glVertexAttribP1uiv(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint const *") IntBuffer value) {
        GL33C.glVertexAttribP1uiv(index, type, normalized, value);
    }

    // --- [ glVertexAttribP2uiv ] ---

    /** {@code void glVertexAttribP2uiv(GLuint index, GLenum type, GLboolean normalized, GLuint const * value)} */
    public static void nglVertexAttribP2uiv(int index, int type, boolean normalized, long value) {
        GL33C.nglVertexAttribP2uiv(index, type, normalized, value);
    }

    /** {@code void glVertexAttribP2uiv(GLuint index, GLenum type, GLboolean normalized, GLuint const * value)} */
    public static void glVertexAttribP2uiv(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint const *") IntBuffer value) {
        GL33C.glVertexAttribP2uiv(index, type, normalized, value);
    }

    // --- [ glVertexAttribP3uiv ] ---

    /** {@code void glVertexAttribP3uiv(GLuint index, GLenum type, GLboolean normalized, GLuint const * value)} */
    public static void nglVertexAttribP3uiv(int index, int type, boolean normalized, long value) {
        GL33C.nglVertexAttribP3uiv(index, type, normalized, value);
    }

    /** {@code void glVertexAttribP3uiv(GLuint index, GLenum type, GLboolean normalized, GLuint const * value)} */
    public static void glVertexAttribP3uiv(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint const *") IntBuffer value) {
        GL33C.glVertexAttribP3uiv(index, type, normalized, value);
    }

    // --- [ glVertexAttribP4uiv ] ---

    /** {@code void glVertexAttribP4uiv(GLuint index, GLenum type, GLboolean normalized, GLuint const * value)} */
    public static void nglVertexAttribP4uiv(int index, int type, boolean normalized, long value) {
        GL33C.nglVertexAttribP4uiv(index, type, normalized, value);
    }

    /** {@code void glVertexAttribP4uiv(GLuint index, GLenum type, GLboolean normalized, GLuint const * value)} */
    public static void glVertexAttribP4uiv(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint const *") IntBuffer value) {
        GL33C.glVertexAttribP4uiv(index, type, normalized, value);
    }

    /** {@code void glGenSamplers(GLsizei count, GLuint * samplers)} */
    public static void glGenSamplers(@NativeType("GLuint *") int[] samplers) {
        GL33C.glGenSamplers(samplers);
    }

    /** {@code void glDeleteSamplers(GLsizei count, GLuint const * samplers)} */
    public static void glDeleteSamplers(@NativeType("GLuint const *") int[] samplers) {
        GL33C.glDeleteSamplers(samplers);
    }

    /** {@code void glSamplerParameteriv(GLuint sampler, GLenum pname, GLint const * params)} */
    public static void glSamplerParameteriv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        GL33C.glSamplerParameteriv(sampler, pname, params);
    }

    /** {@code void glSamplerParameterfv(GLuint sampler, GLenum pname, GLfloat const * params)} */
    public static void glSamplerParameterfv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") float[] params) {
        GL33C.glSamplerParameterfv(sampler, pname, params);
    }

    /** {@code void glSamplerParameterIiv(GLuint sampler, GLenum pname, GLint const * params)} */
    public static void glSamplerParameterIiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        GL33C.glSamplerParameterIiv(sampler, pname, params);
    }

    /** {@code void glSamplerParameterIuiv(GLuint sampler, GLenum pname, GLuint const * params)} */
    public static void glSamplerParameterIuiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLuint const *") int[] params) {
        GL33C.glSamplerParameterIuiv(sampler, pname, params);
    }

    /** {@code void glGetSamplerParameteriv(GLuint sampler, GLenum pname, GLint * params)} */
    public static void glGetSamplerParameteriv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        GL33C.glGetSamplerParameteriv(sampler, pname, params);
    }

    /** {@code void glGetSamplerParameterfv(GLuint sampler, GLenum pname, GLfloat * params)} */
    public static void glGetSamplerParameterfv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        GL33C.glGetSamplerParameterfv(sampler, pname, params);
    }

    /** {@code void glGetSamplerParameterIiv(GLuint sampler, GLenum pname, GLint * params)} */
    public static void glGetSamplerParameterIiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        GL33C.glGetSamplerParameterIiv(sampler, pname, params);
    }

    /** {@code void glGetSamplerParameterIuiv(GLuint sampler, GLenum pname, GLuint * params)} */
    public static void glGetSamplerParameterIuiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] params) {
        GL33C.glGetSamplerParameterIuiv(sampler, pname, params);
    }

    /** {@code void glGetQueryObjecti64v(GLuint id, GLenum pname, GLint64 * params)} */
    public static void glGetQueryObjecti64v(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint64 *") long[] params) {
        GL33C.glGetQueryObjecti64v(id, pname, params);
    }

    /** {@code void glGetQueryObjectui64v(GLuint id, GLenum pname, GLuint64 * params)} */
    public static void glGetQueryObjectui64v(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint64 *") long[] params) {
        GL33C.glGetQueryObjectui64v(id, pname, params);
    }

    /** {@code void glVertexP2uiv(GLenum type, GLuint const * value)} */
    public static void glVertexP2uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GL.getICD().glVertexP2uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        callPV(type, value, __functionAddress);
    }

    /** {@code void glVertexP3uiv(GLenum type, GLuint const * value)} */
    public static void glVertexP3uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GL.getICD().glVertexP3uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        callPV(type, value, __functionAddress);
    }

    /** {@code void glVertexP4uiv(GLenum type, GLuint const * value)} */
    public static void glVertexP4uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GL.getICD().glVertexP4uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        callPV(type, value, __functionAddress);
    }

    /** {@code void glTexCoordP1uiv(GLenum type, GLuint const * coords)} */
    public static void glTexCoordP1uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") int[] coords) {
        long __functionAddress = GL.getICD().glTexCoordP1uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(coords, 1);
        }
        callPV(type, coords, __functionAddress);
    }

    /** {@code void glTexCoordP2uiv(GLenum type, GLuint const * coords)} */
    public static void glTexCoordP2uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") int[] coords) {
        long __functionAddress = GL.getICD().glTexCoordP2uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(coords, 1);
        }
        callPV(type, coords, __functionAddress);
    }

    /** {@code void glTexCoordP3uiv(GLenum type, GLuint const * coords)} */
    public static void glTexCoordP3uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") int[] coords) {
        long __functionAddress = GL.getICD().glTexCoordP3uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(coords, 1);
        }
        callPV(type, coords, __functionAddress);
    }

    /** {@code void glTexCoordP4uiv(GLenum type, GLuint const * coords)} */
    public static void glTexCoordP4uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") int[] coords) {
        long __functionAddress = GL.getICD().glTexCoordP4uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(coords, 1);
        }
        callPV(type, coords, __functionAddress);
    }

    /** {@code void glMultiTexCoordP1uiv(GLenum texture, GLenum type, GLuint const * coords)} */
    public static void glMultiTexCoordP1uiv(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("GLuint const *") int[] coords) {
        long __functionAddress = GL.getICD().glMultiTexCoordP1uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(coords, 1);
        }
        callPV(texture, type, coords, __functionAddress);
    }

    /** {@code void glMultiTexCoordP2uiv(GLenum texture, GLenum type, GLuint const * coords)} */
    public static void glMultiTexCoordP2uiv(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("GLuint const *") int[] coords) {
        long __functionAddress = GL.getICD().glMultiTexCoordP2uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(coords, 1);
        }
        callPV(texture, type, coords, __functionAddress);
    }

    /** {@code void glMultiTexCoordP3uiv(GLenum texture, GLenum type, GLuint const * coords)} */
    public static void glMultiTexCoordP3uiv(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("GLuint const *") int[] coords) {
        long __functionAddress = GL.getICD().glMultiTexCoordP3uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(coords, 1);
        }
        callPV(texture, type, coords, __functionAddress);
    }

    /** {@code void glMultiTexCoordP4uiv(GLenum texture, GLenum type, GLuint const * coords)} */
    public static void glMultiTexCoordP4uiv(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("GLuint const *") int[] coords) {
        long __functionAddress = GL.getICD().glMultiTexCoordP4uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(coords, 1);
        }
        callPV(texture, type, coords, __functionAddress);
    }

    /** {@code void glNormalP3uiv(GLenum type, GLuint const * coords)} */
    public static void glNormalP3uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") int[] coords) {
        long __functionAddress = GL.getICD().glNormalP3uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(coords, 1);
        }
        callPV(type, coords, __functionAddress);
    }

    /** {@code void glColorP3uiv(GLenum type, GLuint const * color)} */
    public static void glColorP3uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") int[] color) {
        long __functionAddress = GL.getICD().glColorP3uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(color, 1);
        }
        callPV(type, color, __functionAddress);
    }

    /** {@code void glColorP4uiv(GLenum type, GLuint const * color)} */
    public static void glColorP4uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") int[] color) {
        long __functionAddress = GL.getICD().glColorP4uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(color, 1);
        }
        callPV(type, color, __functionAddress);
    }

    /** {@code void glSecondaryColorP3uiv(GLenum type, GLuint const * color)} */
    public static void glSecondaryColorP3uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") int[] color) {
        long __functionAddress = GL.getICD().glSecondaryColorP3uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(color, 1);
        }
        callPV(type, color, __functionAddress);
    }

    /** {@code void glVertexAttribP1uiv(GLuint index, GLenum type, GLboolean normalized, GLuint const * value)} */
    public static void glVertexAttribP1uiv(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint const *") int[] value) {
        GL33C.glVertexAttribP1uiv(index, type, normalized, value);
    }

    /** {@code void glVertexAttribP2uiv(GLuint index, GLenum type, GLboolean normalized, GLuint const * value)} */
    public static void glVertexAttribP2uiv(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint const *") int[] value) {
        GL33C.glVertexAttribP2uiv(index, type, normalized, value);
    }

    /** {@code void glVertexAttribP3uiv(GLuint index, GLenum type, GLboolean normalized, GLuint const * value)} */
    public static void glVertexAttribP3uiv(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint const *") int[] value) {
        GL33C.glVertexAttribP3uiv(index, type, normalized, value);
    }

    /** {@code void glVertexAttribP4uiv(GLuint index, GLenum type, GLboolean normalized, GLuint const * value)} */
    public static void glVertexAttribP4uiv(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint const *") int[] value) {
        GL33C.glVertexAttribP4uiv(index, type, normalized, value);
    }

}
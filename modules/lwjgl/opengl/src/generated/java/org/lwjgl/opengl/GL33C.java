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
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class GL33C extends GL32C {

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

    protected GL33C() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBindFragDataLocationIndexed ] ---

    /** {@code void glBindFragDataLocationIndexed(GLuint program, GLuint colorNumber, GLuint index, GLchar const * name)} */
    public static native void nglBindFragDataLocationIndexed(int program, int colorNumber, int index, long name);

    /** {@code void glBindFragDataLocationIndexed(GLuint program, GLuint colorNumber, GLuint index, GLchar const * name)} */
    public static void glBindFragDataLocationIndexed(@NativeType("GLuint") int program, @NativeType("GLuint") int colorNumber, @NativeType("GLuint") int index, @NativeType("GLchar const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        nglBindFragDataLocationIndexed(program, colorNumber, index, memAddress(name));
    }

    /** {@code void glBindFragDataLocationIndexed(GLuint program, GLuint colorNumber, GLuint index, GLchar const * name)} */
    public static void glBindFragDataLocationIndexed(@NativeType("GLuint") int program, @NativeType("GLuint") int colorNumber, @NativeType("GLuint") int index, @NativeType("GLchar const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            nglBindFragDataLocationIndexed(program, colorNumber, index, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetFragDataIndex ] ---

    /** {@code GLint glGetFragDataIndex(GLuint program, GLchar const * name)} */
    public static native int nglGetFragDataIndex(int program, long name);

    /** {@code GLint glGetFragDataIndex(GLuint program, GLchar const * name)} */
    @NativeType("GLint")
    public static int glGetFragDataIndex(@NativeType("GLuint") int program, @NativeType("GLchar const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nglGetFragDataIndex(program, memAddress(name));
    }

    /** {@code GLint glGetFragDataIndex(GLuint program, GLchar const * name)} */
    @NativeType("GLint")
    public static int glGetFragDataIndex(@NativeType("GLuint") int program, @NativeType("GLchar const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nglGetFragDataIndex(program, nameEncoded);
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

    // --- [ glSamplerParameterf ] ---

    /** {@code void glSamplerParameterf(GLuint sampler, GLenum pname, GLfloat param)} */
    public static native void glSamplerParameterf(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLfloat") float param);

    // --- [ glSamplerParameteriv ] ---

    /** {@code void glSamplerParameteriv(GLuint sampler, GLenum pname, GLint const * params)} */
    public static native void nglSamplerParameteriv(int sampler, int pname, long params);

    /** {@code void glSamplerParameteriv(GLuint sampler, GLenum pname, GLint const * params)} */
    public static void glSamplerParameteriv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglSamplerParameteriv(sampler, pname, memAddress(params));
    }

    // --- [ glSamplerParameterfv ] ---

    /** {@code void glSamplerParameterfv(GLuint sampler, GLenum pname, GLfloat const * params)} */
    public static native void nglSamplerParameterfv(int sampler, int pname, long params);

    /** {@code void glSamplerParameterfv(GLuint sampler, GLenum pname, GLfloat const * params)} */
    public static void glSamplerParameterfv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglSamplerParameterfv(sampler, pname, memAddress(params));
    }

    // --- [ glSamplerParameterIiv ] ---

    /** {@code void glSamplerParameterIiv(GLuint sampler, GLenum pname, GLint const * params)} */
    public static native void nglSamplerParameterIiv(int sampler, int pname, long params);

    /** {@code void glSamplerParameterIiv(GLuint sampler, GLenum pname, GLint const * params)} */
    public static void glSamplerParameterIiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglSamplerParameterIiv(sampler, pname, memAddress(params));
    }

    // --- [ glSamplerParameterIuiv ] ---

    /** {@code void glSamplerParameterIuiv(GLuint sampler, GLenum pname, GLuint const * params)} */
    public static native void nglSamplerParameterIuiv(int sampler, int pname, long params);

    /** {@code void glSamplerParameterIuiv(GLuint sampler, GLenum pname, GLuint const * params)} */
    public static void glSamplerParameterIuiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLuint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglSamplerParameterIuiv(sampler, pname, memAddress(params));
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

    // --- [ glGetSamplerParameterIiv ] ---

    /** {@code void glGetSamplerParameterIiv(GLuint sampler, GLenum pname, GLint * params)} */
    public static native void nglGetSamplerParameterIiv(int sampler, int pname, long params);

    /** {@code void glGetSamplerParameterIiv(GLuint sampler, GLenum pname, GLint * params)} */
    public static void glGetSamplerParameterIiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetSamplerParameterIiv(sampler, pname, memAddress(params));
    }

    /** {@code void glGetSamplerParameterIiv(GLuint sampler, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetSamplerParameterIi(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetSamplerParameterIiv(sampler, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetSamplerParameterIuiv ] ---

    /** {@code void glGetSamplerParameterIuiv(GLuint sampler, GLenum pname, GLuint * params)} */
    public static native void nglGetSamplerParameterIuiv(int sampler, int pname, long params);

    /** {@code void glGetSamplerParameterIuiv(GLuint sampler, GLenum pname, GLuint * params)} */
    public static void glGetSamplerParameterIuiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLuint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetSamplerParameterIuiv(sampler, pname, memAddress(params));
    }

    /** {@code void glGetSamplerParameterIuiv(GLuint sampler, GLenum pname, GLuint * params)} */
    @NativeType("void")
    public static int glGetSamplerParameterIui(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetSamplerParameterIuiv(sampler, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glQueryCounter ] ---

    /** {@code void glQueryCounter(GLuint id, GLenum target)} */
    public static native void glQueryCounter(@NativeType("GLuint") int id, @NativeType("GLenum") int target);

    // --- [ glGetQueryObjecti64v ] ---

    /** {@code void glGetQueryObjecti64v(GLuint id, GLenum pname, GLint64 * params)} */
    public static native void nglGetQueryObjecti64v(int id, int pname, long params);

    /** {@code void glGetQueryObjecti64v(GLuint id, GLenum pname, GLint64 * params)} */
    public static void glGetQueryObjecti64v(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint64 *") LongBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetQueryObjecti64v(id, pname, memAddress(params));
    }

    /** {@code void glGetQueryObjecti64v(GLuint id, GLenum pname, GLint64 * params)} */
    public static void glGetQueryObjecti64v(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint64 *") long params) {
        nglGetQueryObjecti64v(id, pname, params);
    }

    /** {@code void glGetQueryObjecti64v(GLuint id, GLenum pname, GLint64 * params)} */
    @NativeType("void")
    public static long glGetQueryObjecti64(@NativeType("GLuint") int id, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer params = stack.callocLong(1);
            nglGetQueryObjecti64v(id, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetQueryObjectui64v ] ---

    /** {@code void glGetQueryObjectui64v(GLuint id, GLenum pname, GLuint64 * params)} */
    public static native void nglGetQueryObjectui64v(int id, int pname, long params);

    /** {@code void glGetQueryObjectui64v(GLuint id, GLenum pname, GLuint64 * params)} */
    public static void glGetQueryObjectui64v(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint64 *") LongBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetQueryObjectui64v(id, pname, memAddress(params));
    }

    /** {@code void glGetQueryObjectui64v(GLuint id, GLenum pname, GLuint64 * params)} */
    public static void glGetQueryObjectui64v(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint64 *") long params) {
        nglGetQueryObjectui64v(id, pname, params);
    }

    /** {@code void glGetQueryObjectui64v(GLuint id, GLenum pname, GLuint64 * params)} */
    @NativeType("void")
    public static long glGetQueryObjectui64(@NativeType("GLuint") int id, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer params = stack.callocLong(1);
            nglGetQueryObjectui64v(id, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glVertexAttribDivisor ] ---

    /** {@code void glVertexAttribDivisor(GLuint index, GLuint divisor)} */
    public static native void glVertexAttribDivisor(@NativeType("GLuint") int index, @NativeType("GLuint") int divisor);

    // --- [ glVertexAttribP1ui ] ---

    /** {@code void glVertexAttribP1ui(GLuint index, GLenum type, GLboolean normalized, GLuint value)} */
    public static native void glVertexAttribP1ui(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint") int value);

    // --- [ glVertexAttribP2ui ] ---

    /** {@code void glVertexAttribP2ui(GLuint index, GLenum type, GLboolean normalized, GLuint value)} */
    public static native void glVertexAttribP2ui(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint") int value);

    // --- [ glVertexAttribP3ui ] ---

    /** {@code void glVertexAttribP3ui(GLuint index, GLenum type, GLboolean normalized, GLuint value)} */
    public static native void glVertexAttribP3ui(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint") int value);

    // --- [ glVertexAttribP4ui ] ---

    /** {@code void glVertexAttribP4ui(GLuint index, GLenum type, GLboolean normalized, GLuint value)} */
    public static native void glVertexAttribP4ui(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint") int value);

    // --- [ glVertexAttribP1uiv ] ---

    /** {@code void glVertexAttribP1uiv(GLuint index, GLenum type, GLboolean normalized, GLuint const * value)} */
    public static native void nglVertexAttribP1uiv(int index, int type, boolean normalized, long value);

    /** {@code void glVertexAttribP1uiv(GLuint index, GLenum type, GLboolean normalized, GLuint const * value)} */
    public static void glVertexAttribP1uiv(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint const *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nglVertexAttribP1uiv(index, type, normalized, memAddress(value));
    }

    // --- [ glVertexAttribP2uiv ] ---

    /** {@code void glVertexAttribP2uiv(GLuint index, GLenum type, GLboolean normalized, GLuint const * value)} */
    public static native void nglVertexAttribP2uiv(int index, int type, boolean normalized, long value);

    /** {@code void glVertexAttribP2uiv(GLuint index, GLenum type, GLboolean normalized, GLuint const * value)} */
    public static void glVertexAttribP2uiv(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint const *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nglVertexAttribP2uiv(index, type, normalized, memAddress(value));
    }

    // --- [ glVertexAttribP3uiv ] ---

    /** {@code void glVertexAttribP3uiv(GLuint index, GLenum type, GLboolean normalized, GLuint const * value)} */
    public static native void nglVertexAttribP3uiv(int index, int type, boolean normalized, long value);

    /** {@code void glVertexAttribP3uiv(GLuint index, GLenum type, GLboolean normalized, GLuint const * value)} */
    public static void glVertexAttribP3uiv(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint const *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nglVertexAttribP3uiv(index, type, normalized, memAddress(value));
    }

    // --- [ glVertexAttribP4uiv ] ---

    /** {@code void glVertexAttribP4uiv(GLuint index, GLenum type, GLboolean normalized, GLuint const * value)} */
    public static native void nglVertexAttribP4uiv(int index, int type, boolean normalized, long value);

    /** {@code void glVertexAttribP4uiv(GLuint index, GLenum type, GLboolean normalized, GLuint const * value)} */
    public static void glVertexAttribP4uiv(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint const *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nglVertexAttribP4uiv(index, type, normalized, memAddress(value));
    }

    /** {@code void glGenSamplers(GLsizei count, GLuint * samplers)} */
    public static void glGenSamplers(@NativeType("GLuint *") int[] samplers) {
        long __functionAddress = GL.getICD().glGenSamplers;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(samplers.length, samplers, __functionAddress);
    }

    /** {@code void glDeleteSamplers(GLsizei count, GLuint const * samplers)} */
    public static void glDeleteSamplers(@NativeType("GLuint const *") int[] samplers) {
        long __functionAddress = GL.getICD().glDeleteSamplers;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(samplers.length, samplers, __functionAddress);
    }

    /** {@code void glSamplerParameteriv(GLuint sampler, GLenum pname, GLint const * params)} */
    public static void glSamplerParameteriv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        long __functionAddress = GL.getICD().glSamplerParameteriv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(sampler, pname, params, __functionAddress);
    }

    /** {@code void glSamplerParameterfv(GLuint sampler, GLenum pname, GLfloat const * params)} */
    public static void glSamplerParameterfv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") float[] params) {
        long __functionAddress = GL.getICD().glSamplerParameterfv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(sampler, pname, params, __functionAddress);
    }

    /** {@code void glSamplerParameterIiv(GLuint sampler, GLenum pname, GLint const * params)} */
    public static void glSamplerParameterIiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        long __functionAddress = GL.getICD().glSamplerParameterIiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(sampler, pname, params, __functionAddress);
    }

    /** {@code void glSamplerParameterIuiv(GLuint sampler, GLenum pname, GLuint const * params)} */
    public static void glSamplerParameterIuiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLuint const *") int[] params) {
        long __functionAddress = GL.getICD().glSamplerParameterIuiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(sampler, pname, params, __functionAddress);
    }

    /** {@code void glGetSamplerParameteriv(GLuint sampler, GLenum pname, GLint * params)} */
    public static void glGetSamplerParameteriv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetSamplerParameteriv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(sampler, pname, params, __functionAddress);
    }

    /** {@code void glGetSamplerParameterfv(GLuint sampler, GLenum pname, GLfloat * params)} */
    public static void glGetSamplerParameterfv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GL.getICD().glGetSamplerParameterfv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(sampler, pname, params, __functionAddress);
    }

    /** {@code void glGetSamplerParameterIiv(GLuint sampler, GLenum pname, GLint * params)} */
    public static void glGetSamplerParameterIiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetSamplerParameterIiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(sampler, pname, params, __functionAddress);
    }

    /** {@code void glGetSamplerParameterIuiv(GLuint sampler, GLenum pname, GLuint * params)} */
    public static void glGetSamplerParameterIuiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] params) {
        long __functionAddress = GL.getICD().glGetSamplerParameterIuiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(sampler, pname, params, __functionAddress);
    }

    /** {@code void glGetQueryObjecti64v(GLuint id, GLenum pname, GLint64 * params)} */
    public static void glGetQueryObjecti64v(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint64 *") long[] params) {
        long __functionAddress = GL.getICD().glGetQueryObjecti64v;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(id, pname, params, __functionAddress);
    }

    /** {@code void glGetQueryObjectui64v(GLuint id, GLenum pname, GLuint64 * params)} */
    public static void glGetQueryObjectui64v(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint64 *") long[] params) {
        long __functionAddress = GL.getICD().glGetQueryObjectui64v;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(id, pname, params, __functionAddress);
    }

    /** {@code void glVertexAttribP1uiv(GLuint index, GLenum type, GLboolean normalized, GLuint const * value)} */
    public static void glVertexAttribP1uiv(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GL.getICD().glVertexAttribP1uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        callPV(index, type, normalized, value, __functionAddress);
    }

    /** {@code void glVertexAttribP2uiv(GLuint index, GLenum type, GLboolean normalized, GLuint const * value)} */
    public static void glVertexAttribP2uiv(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GL.getICD().glVertexAttribP2uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        callPV(index, type, normalized, value, __functionAddress);
    }

    /** {@code void glVertexAttribP3uiv(GLuint index, GLenum type, GLboolean normalized, GLuint const * value)} */
    public static void glVertexAttribP3uiv(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GL.getICD().glVertexAttribP3uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        callPV(index, type, normalized, value, __functionAddress);
    }

    /** {@code void glVertexAttribP4uiv(GLuint index, GLenum type, GLboolean normalized, GLuint const * value)} */
    public static void glVertexAttribP4uiv(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GL.getICD().glVertexAttribP4uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        callPV(index, type, normalized, value, __functionAddress);
    }

}
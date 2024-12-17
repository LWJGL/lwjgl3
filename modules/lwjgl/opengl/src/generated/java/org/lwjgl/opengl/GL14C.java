/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class GL14C extends GL13C {

    static { GL.initialize(); }

    public static final int
        GL_CONSTANT_COLOR           = 0x8001,
        GL_ONE_MINUS_CONSTANT_COLOR = 0x8002,
        GL_CONSTANT_ALPHA           = 0x8003,
        GL_ONE_MINUS_CONSTANT_ALPHA = 0x8004;

    public static final int GL_BLEND_COLOR = 0x8005;

    public static final int
        GL_FUNC_ADD = 0x8006,
        GL_MIN      = 0x8007,
        GL_MAX      = 0x8008;

    public static final int GL_BLEND_EQUATION = 0x8009;

    public static final int
        GL_FUNC_SUBTRACT         = 0x800A,
        GL_FUNC_REVERSE_SUBTRACT = 0x800B;

    public static final int
        GL_DEPTH_COMPONENT16 = 0x81A5,
        GL_DEPTH_COMPONENT24 = 0x81A6,
        GL_DEPTH_COMPONENT32 = 0x81A7;

    public static final int GL_TEXTURE_DEPTH_SIZE = 0x884A;

    public static final int
        GL_TEXTURE_COMPARE_MODE = 0x884C,
        GL_TEXTURE_COMPARE_FUNC = 0x884D;

    public static final int GL_POINT_FADE_THRESHOLD_SIZE = 0x8128;

    public static final int
        GL_BLEND_DST_RGB   = 0x80C8,
        GL_BLEND_SRC_RGB   = 0x80C9,
        GL_BLEND_DST_ALPHA = 0x80CA,
        GL_BLEND_SRC_ALPHA = 0x80CB;

    public static final int
        GL_INCR_WRAP = 0x8507,
        GL_DECR_WRAP = 0x8508;

    public static final int GL_TEXTURE_LOD_BIAS = 0x8501;

    public static final int GL_MAX_TEXTURE_LOD_BIAS = 0x84FD;

    public static final int GL_MIRRORED_REPEAT = 0x8370;

    protected GL14C() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBlendColor ] ---

    /** {@code void glBlendColor(GLfloat red, GLfloat green, GLfloat blue, GLfloat alpha)} */
    public static native void glBlendColor(@NativeType("GLfloat") float red, @NativeType("GLfloat") float green, @NativeType("GLfloat") float blue, @NativeType("GLfloat") float alpha);

    // --- [ glBlendEquation ] ---

    /** {@code void glBlendEquation(GLenum mode)} */
    public static native void glBlendEquation(@NativeType("GLenum") int mode);

    // --- [ glMultiDrawArrays ] ---

    /** {@code void glMultiDrawArrays(GLenum mode, GLint const * first, GLsizei const * count, GLsizei drawcount)} */
    public static native void nglMultiDrawArrays(int mode, long first, long count, int drawcount);

    /** {@code void glMultiDrawArrays(GLenum mode, GLint const * first, GLsizei const * count, GLsizei drawcount)} */
    public static void glMultiDrawArrays(@NativeType("GLenum") int mode, @NativeType("GLint const *") IntBuffer first, @NativeType("GLsizei const *") IntBuffer count) {
        if (CHECKS) {
            check(count, first.remaining());
        }
        nglMultiDrawArrays(mode, memAddress(first), memAddress(count), first.remaining());
    }

    // --- [ glMultiDrawElements ] ---

    /** {@code void glMultiDrawElements(GLenum mode, GLsizei * count, GLenum type, void const ** indices, GLsizei drawcount)} */
    public static native void nglMultiDrawElements(int mode, long count, int type, long indices, int drawcount);

    /** {@code void glMultiDrawElements(GLenum mode, GLsizei * count, GLenum type, void const ** indices, GLsizei drawcount)} */
    public static void glMultiDrawElements(@NativeType("GLenum") int mode, @NativeType("GLsizei *") IntBuffer count, @NativeType("GLenum") int type, @NativeType("void const **") PointerBuffer indices) {
        if (CHECKS) {
            check(indices, count.remaining());
        }
        nglMultiDrawElements(mode, memAddress(count), type, memAddress(indices), count.remaining());
    }

    // --- [ glPointParameterf ] ---

    /** {@code void glPointParameterf(GLenum pname, GLfloat param)} */
    public static native void glPointParameterf(@NativeType("GLenum") int pname, @NativeType("GLfloat") float param);

    // --- [ glPointParameteri ] ---

    /** {@code void glPointParameteri(GLenum pname, GLint param)} */
    public static native void glPointParameteri(@NativeType("GLenum") int pname, @NativeType("GLint") int param);

    // --- [ glPointParameterfv ] ---

    /** {@code void glPointParameterfv(GLenum pname, GLfloat const * params)} */
    public static native void nglPointParameterfv(int pname, long params);

    /** {@code void glPointParameterfv(GLenum pname, GLfloat const * params)} */
    public static void glPointParameterfv(@NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 3);
        }
        nglPointParameterfv(pname, memAddress(params));
    }

    // --- [ glPointParameteriv ] ---

    /** {@code void glPointParameteriv(GLenum pname, GLint const * params)} */
    public static native void nglPointParameteriv(int pname, long params);

    /** {@code void glPointParameteriv(GLenum pname, GLint const * params)} */
    public static void glPointParameteriv(@NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 3);
        }
        nglPointParameteriv(pname, memAddress(params));
    }

    // --- [ glBlendFuncSeparate ] ---

    /** {@code void glBlendFuncSeparate(GLenum sfactorRGB, GLenum dfactorRGB, GLenum sfactorAlpha, GLenum dfactorAlpha)} */
    public static native void glBlendFuncSeparate(@NativeType("GLenum") int sfactorRGB, @NativeType("GLenum") int dfactorRGB, @NativeType("GLenum") int sfactorAlpha, @NativeType("GLenum") int dfactorAlpha);

    /** {@code void glMultiDrawArrays(GLenum mode, GLint const * first, GLsizei const * count, GLsizei drawcount)} */
    public static void glMultiDrawArrays(@NativeType("GLenum") int mode, @NativeType("GLint const *") int[] first, @NativeType("GLsizei const *") int[] count) {
        long __functionAddress = GL.getICD().glMultiDrawArrays;
        if (CHECKS) {
            check(__functionAddress);
            check(count, first.length);
        }
        callPPV(mode, first, count, first.length, __functionAddress);
    }

    /** {@code void glMultiDrawElements(GLenum mode, GLsizei * count, GLenum type, void const ** indices, GLsizei drawcount)} */
    public static void glMultiDrawElements(@NativeType("GLenum") int mode, @NativeType("GLsizei *") int[] count, @NativeType("GLenum") int type, @NativeType("void const **") PointerBuffer indices) {
        long __functionAddress = GL.getICD().glMultiDrawElements;
        if (CHECKS) {
            check(__functionAddress);
            check(indices, count.length);
        }
        callPPV(mode, count, type, memAddress(indices), count.length, __functionAddress);
    }

    /** {@code void glPointParameterfv(GLenum pname, GLfloat const * params)} */
    public static void glPointParameterfv(@NativeType("GLenum") int pname, @NativeType("GLfloat const *") float[] params) {
        long __functionAddress = GL.getICD().glPointParameterfv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 3);
        }
        callPV(pname, params, __functionAddress);
    }

    /** {@code void glPointParameteriv(GLenum pname, GLint const * params)} */
    public static void glPointParameteriv(@NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        long __functionAddress = GL.getICD().glPointParameteriv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 3);
        }
        callPV(pname, params, __functionAddress);
    }

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class EXTTextureBorderClamp {

    static { GLES.initialize(); }

    public static final int GL_TEXTURE_BORDER_COLOR_EXT = 0x1004;

    public static final int GL_CLAMP_TO_BORDER_EXT = 0x812D;

    protected EXTTextureBorderClamp() {
        throw new UnsupportedOperationException();
    }

    // --- [ glTexParameterIivEXT ] ---

    /** {@code void glTexParameterIivEXT(GLenum target, GLenum pname, GLint const * params)} */
    public static native void nglTexParameterIivEXT(int target, int pname, long params);

    /** {@code void glTexParameterIivEXT(GLenum target, GLenum pname, GLint const * params)} */
    public static void glTexParameterIivEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglTexParameterIivEXT(target, pname, memAddress(params));
    }

    // --- [ glTexParameterIuivEXT ] ---

    /** {@code void glTexParameterIuivEXT(GLenum target, GLenum pname, GLuint const * params)} */
    public static native void nglTexParameterIuivEXT(int target, int pname, long params);

    /** {@code void glTexParameterIuivEXT(GLenum target, GLenum pname, GLuint const * params)} */
    public static void glTexParameterIuivEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglTexParameterIuivEXT(target, pname, memAddress(params));
    }

    // --- [ glGetTexParameterIivEXT ] ---

    /** {@code void glGetTexParameterIivEXT(GLenum target, GLenum pname, GLint * params)} */
    public static native void nglGetTexParameterIivEXT(int target, int pname, long params);

    /** {@code void glGetTexParameterIivEXT(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetTexParameterIivEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetTexParameterIivEXT(target, pname, memAddress(params));
    }

    /** {@code void glGetTexParameterIivEXT(GLenum target, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetTexParameterIiEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetTexParameterIivEXT(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetTexParameterIuivEXT ] ---

    /** {@code void glGetTexParameterIuivEXT(GLenum target, GLenum pname, GLuint * params)} */
    public static native void nglGetTexParameterIuivEXT(int target, int pname, long params);

    /** {@code void glGetTexParameterIuivEXT(GLenum target, GLenum pname, GLuint * params)} */
    public static void glGetTexParameterIuivEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetTexParameterIuivEXT(target, pname, memAddress(params));
    }

    /** {@code void glGetTexParameterIuivEXT(GLenum target, GLenum pname, GLuint * params)} */
    @NativeType("void")
    public static int glGetTexParameterIuiEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetTexParameterIuivEXT(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glSamplerParameterIivEXT ] ---

    /** {@code void glSamplerParameterIivEXT(GLuint sampler, GLenum pname, GLint const * param)} */
    public static native void nglSamplerParameterIivEXT(int sampler, int pname, long param);

    /** {@code void glSamplerParameterIivEXT(GLuint sampler, GLenum pname, GLint const * param)} */
    public static void glSamplerParameterIivEXT(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer param) {
        if (CHECKS) {
            check(param, 1);
        }
        nglSamplerParameterIivEXT(sampler, pname, memAddress(param));
    }

    // --- [ glSamplerParameterIuivEXT ] ---

    /** {@code void glSamplerParameterIuivEXT(GLuint sampler, GLenum pname, GLuint const * param)} */
    public static native void nglSamplerParameterIuivEXT(int sampler, int pname, long param);

    /** {@code void glSamplerParameterIuivEXT(GLuint sampler, GLenum pname, GLuint const * param)} */
    public static void glSamplerParameterIuivEXT(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLuint const *") IntBuffer param) {
        if (CHECKS) {
            check(param, 1);
        }
        nglSamplerParameterIuivEXT(sampler, pname, memAddress(param));
    }

    // --- [ glGetSamplerParameterIivEXT ] ---

    /** {@code void glGetSamplerParameterIivEXT(GLuint sampler, GLenum pname, GLint * params)} */
    public static native void nglGetSamplerParameterIivEXT(int sampler, int pname, long params);

    /** {@code void glGetSamplerParameterIivEXT(GLuint sampler, GLenum pname, GLint * params)} */
    public static void glGetSamplerParameterIivEXT(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetSamplerParameterIivEXT(sampler, pname, memAddress(params));
    }

    /** {@code void glGetSamplerParameterIivEXT(GLuint sampler, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetSamplerParameterIiEXT(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetSamplerParameterIivEXT(sampler, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetSamplerParameterIuivEXT ] ---

    /** {@code void glGetSamplerParameterIuivEXT(GLuint sampler, GLenum pname, GLuint * params)} */
    public static native void nglGetSamplerParameterIuivEXT(int sampler, int pname, long params);

    /** {@code void glGetSamplerParameterIuivEXT(GLuint sampler, GLenum pname, GLuint * params)} */
    public static void glGetSamplerParameterIuivEXT(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLuint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetSamplerParameterIuivEXT(sampler, pname, memAddress(params));
    }

    /** {@code void glGetSamplerParameterIuivEXT(GLuint sampler, GLenum pname, GLuint * params)} */
    @NativeType("void")
    public static int glGetSamplerParameterIuiEXT(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetSamplerParameterIuivEXT(sampler, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glTexParameterIivEXT(GLenum target, GLenum pname, GLint const * params)} */
    public static void glTexParameterIivEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        long __functionAddress = GLES.getICD().glTexParameterIivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** {@code void glTexParameterIuivEXT(GLenum target, GLenum pname, GLuint const * params)} */
    public static void glTexParameterIuivEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint const *") int[] params) {
        long __functionAddress = GLES.getICD().glTexParameterIuivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** {@code void glGetTexParameterIivEXT(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetTexParameterIivEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetTexParameterIivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** {@code void glGetTexParameterIuivEXT(GLenum target, GLenum pname, GLuint * params)} */
    public static void glGetTexParameterIuivEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetTexParameterIuivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** {@code void glSamplerParameterIivEXT(GLuint sampler, GLenum pname, GLint const * param)} */
    public static void glSamplerParameterIivEXT(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] param) {
        long __functionAddress = GLES.getICD().glSamplerParameterIivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(param, 1);
        }
        callPV(sampler, pname, param, __functionAddress);
    }

    /** {@code void glSamplerParameterIuivEXT(GLuint sampler, GLenum pname, GLuint const * param)} */
    public static void glSamplerParameterIuivEXT(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLuint const *") int[] param) {
        long __functionAddress = GLES.getICD().glSamplerParameterIuivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(param, 1);
        }
        callPV(sampler, pname, param, __functionAddress);
    }

    /** {@code void glGetSamplerParameterIivEXT(GLuint sampler, GLenum pname, GLint * params)} */
    public static void glGetSamplerParameterIivEXT(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetSamplerParameterIivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(sampler, pname, params, __functionAddress);
    }

    /** {@code void glGetSamplerParameterIuivEXT(GLuint sampler, GLenum pname, GLuint * params)} */
    public static void glGetSamplerParameterIuivEXT(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetSamplerParameterIuivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(sampler, pname, params, __functionAddress);
    }

}
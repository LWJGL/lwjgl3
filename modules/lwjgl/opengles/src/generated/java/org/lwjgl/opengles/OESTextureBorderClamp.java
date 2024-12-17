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

public class OESTextureBorderClamp {

    static { GLES.initialize(); }

    public static final int GL_TEXTURE_BORDER_COLOR_OES = 0x1004;

    public static final int GL_CLAMP_TO_BORDER_OES = 0x812D;

    protected OESTextureBorderClamp() {
        throw new UnsupportedOperationException();
    }

    // --- [ glTexParameterIivOES ] ---

    /** {@code void glTexParameterIivOES(GLenum target, GLenum pname, GLint const * params)} */
    public static native void nglTexParameterIivOES(int target, int pname, long params);

    /** {@code void glTexParameterIivOES(GLenum target, GLenum pname, GLint const * params)} */
    public static void glTexParameterIivOES(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglTexParameterIivOES(target, pname, memAddress(params));
    }

    /** {@code void glTexParameterIivOES(GLenum target, GLenum pname, GLint const * params)} */
    public static void glTexParameterIiOES(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") int param) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.ints(param);
            nglTexParameterIivOES(target, pname, memAddress(params));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glTexParameterIuivOES ] ---

    /** {@code void glTexParameterIuivOES(GLenum target, GLenum pname, GLuint const * params)} */
    public static native void nglTexParameterIuivOES(int target, int pname, long params);

    /** {@code void glTexParameterIuivOES(GLenum target, GLenum pname, GLuint const * params)} */
    public static void glTexParameterIuivOES(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglTexParameterIuivOES(target, pname, memAddress(params));
    }

    /** {@code void glTexParameterIuivOES(GLenum target, GLenum pname, GLuint const * params)} */
    public static void glTexParameterIuiOES(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint const *") int param) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.ints(param);
            nglTexParameterIuivOES(target, pname, memAddress(params));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetTexParameterIivOES ] ---

    /** {@code void glGetTexParameterIivOES(GLenum target, GLenum pname, GLint * params)} */
    public static native void nglGetTexParameterIivOES(int target, int pname, long params);

    /** {@code void glGetTexParameterIivOES(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetTexParameterIivOES(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetTexParameterIivOES(target, pname, memAddress(params));
    }

    /** {@code void glGetTexParameterIivOES(GLenum target, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetTexParameterIiOES(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetTexParameterIivOES(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetTexParameterIuivOES ] ---

    /** {@code void glGetTexParameterIuivOES(GLenum target, GLenum pname, GLuint * params)} */
    public static native void nglGetTexParameterIuivOES(int target, int pname, long params);

    /** {@code void glGetTexParameterIuivOES(GLenum target, GLenum pname, GLuint * params)} */
    public static void glGetTexParameterIuivOES(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetTexParameterIuivOES(target, pname, memAddress(params));
    }

    /** {@code void glGetTexParameterIuivOES(GLenum target, GLenum pname, GLuint * params)} */
    @NativeType("void")
    public static int glGetTexParameterIuiOES(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetTexParameterIuivOES(target, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glSamplerParameterIivOES ] ---

    /** {@code void glSamplerParameterIivOES(GLuint sampler, GLenum pname, GLint const * params)} */
    public static native void nglSamplerParameterIivOES(int sampler, int pname, long params);

    /** {@code void glSamplerParameterIivOES(GLuint sampler, GLenum pname, GLint const * params)} */
    public static void glSamplerParameterIivOES(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglSamplerParameterIivOES(sampler, pname, memAddress(params));
    }

    /** {@code void glSamplerParameterIivOES(GLuint sampler, GLenum pname, GLint const * params)} */
    public static void glSamplerParameterIiOES(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint const *") int param) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.ints(param);
            nglSamplerParameterIivOES(sampler, pname, memAddress(params));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glSamplerParameterIuivOES ] ---

    /** {@code void glSamplerParameterIuivOES(GLuint sampler, GLenum pname, GLuint const * params)} */
    public static native void nglSamplerParameterIuivOES(int sampler, int pname, long params);

    /** {@code void glSamplerParameterIuivOES(GLuint sampler, GLenum pname, GLuint const * params)} */
    public static void glSamplerParameterIuivOES(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLuint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglSamplerParameterIuivOES(sampler, pname, memAddress(params));
    }

    /** {@code void glSamplerParameterIuivOES(GLuint sampler, GLenum pname, GLuint const * params)} */
    public static void glSamplerParameterIuiOES(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLuint const *") int param) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.ints(param);
            nglSamplerParameterIuivOES(sampler, pname, memAddress(params));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetSamplerParameterIivOES ] ---

    /** {@code void glGetSamplerParameterIivOES(GLuint sampler, GLenum pname, GLint * params)} */
    public static native void nglGetSamplerParameterIivOES(int sampler, int pname, long params);

    /** {@code void glGetSamplerParameterIivOES(GLuint sampler, GLenum pname, GLint * params)} */
    public static void glGetSamplerParameterIivOES(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetSamplerParameterIivOES(sampler, pname, memAddress(params));
    }

    /** {@code void glGetSamplerParameterIivOES(GLuint sampler, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetSamplerParameterIiOES(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetSamplerParameterIivOES(sampler, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetSamplerParameterIuivOES ] ---

    /** {@code void glGetSamplerParameterIuivOES(GLuint sampler, GLenum pname, GLuint * params)} */
    public static native void nglGetSamplerParameterIuivOES(int sampler, int pname, long params);

    /** {@code void glGetSamplerParameterIuivOES(GLuint sampler, GLenum pname, GLuint * params)} */
    public static void glGetSamplerParameterIuivOES(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLuint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetSamplerParameterIuivOES(sampler, pname, memAddress(params));
    }

    /** {@code void glGetSamplerParameterIuivOES(GLuint sampler, GLenum pname, GLuint * params)} */
    @NativeType("void")
    public static int glGetSamplerParameterIuiOES(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetSamplerParameterIuivOES(sampler, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glTexParameterIivOES(GLenum target, GLenum pname, GLint const * params)} */
    public static void glTexParameterIivOES(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        long __functionAddress = GLES.getICD().glTexParameterIivOES;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** {@code void glTexParameterIuivOES(GLenum target, GLenum pname, GLuint const * params)} */
    public static void glTexParameterIuivOES(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint const *") int[] params) {
        long __functionAddress = GLES.getICD().glTexParameterIuivOES;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** {@code void glGetTexParameterIivOES(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetTexParameterIivOES(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetTexParameterIivOES;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** {@code void glGetTexParameterIuivOES(GLenum target, GLenum pname, GLuint * params)} */
    public static void glGetTexParameterIuivOES(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetTexParameterIuivOES;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** {@code void glSamplerParameterIivOES(GLuint sampler, GLenum pname, GLint const * params)} */
    public static void glSamplerParameterIivOES(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        long __functionAddress = GLES.getICD().glSamplerParameterIivOES;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(sampler, pname, params, __functionAddress);
    }

    /** {@code void glSamplerParameterIuivOES(GLuint sampler, GLenum pname, GLuint const * params)} */
    public static void glSamplerParameterIuivOES(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLuint const *") int[] params) {
        long __functionAddress = GLES.getICD().glSamplerParameterIuivOES;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(sampler, pname, params, __functionAddress);
    }

    /** {@code void glGetSamplerParameterIivOES(GLuint sampler, GLenum pname, GLint * params)} */
    public static void glGetSamplerParameterIivOES(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetSamplerParameterIivOES;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(sampler, pname, params, __functionAddress);
    }

    /** {@code void glGetSamplerParameterIuivOES(GLuint sampler, GLenum pname, GLuint * params)} */
    public static void glGetSamplerParameterIuivOES(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetSamplerParameterIuivOES;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(sampler, pname, params, __functionAddress);
    }

}
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

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/OES/OES_texture_border_clamp.txt">OES_texture_border_clamp</a> extension.
 * 
 * <p>OpenGL ES provides only a single clamping wrap mode: CLAMP_TO_EDGE. However, the ability to clamp to a constant border color can be useful to quickly
 * detect texture coordinates that exceed their expected limits or to dummy out any such accesses with transparency or a neutral color in tiling or light
 * maps.</p>
 * 
 * <p>This extension defines an additional texture clamping algorithm. CLAMP_TO_BORDER_OES clamps texture coordinates at all mipmap levels such that NEAREST
 * and LINEAR filters of clamped coordinates return only the constant border color. This does not add the ability for textures to specify borders using
 * glTexImage2D, but only to clamp to a constant border value set using glTexParameter and glSamplerParameter.</p>
 * 
 * <p>Requires {@link GLES20 GLES 2.0}.</p>
 */
public class OESTextureBorderClamp {

    static { GLES.initialize(); }

    /**
     * Accepted by the {@code pname} parameter of TexParameteriv, TexParameterfv, SamplerParameteriv, SamplerParameterfv, TexParameterIivOES,
     * TexParameterIuivOES, SamplerParameterIivOES, SamplerParameterIuivOES, GetTexParameteriv, GetTexParameterfv, GetTexParameterIivOES,
     * GetTexParameterIuivOES, GetSamplerParameteriv, GetSamplerParameterfv, GetSamplerParameterIivOES, and GetSamplerParameterIuivOES.
     */
    public static final int GL_TEXTURE_BORDER_COLOR_OES = 0x1004;

    /**
     * Accepted by the {@code param} parameter of TexParameteri, TexParameterf, SamplerParameteri and SamplerParameterf, and by the {@code params} parameter of
     * TexParameteriv, TexParameterfv, TexParameterIivOES, TexParameterIuivOES, SamplerParameterIivOES, SamplerParameterIuivOES and returned by the
     * {@code params} parameter of GetTexParameteriv, GetTexParameterfv, GetTexParameterIivOES, GetTexParameterIuivOES, GetSamplerParameteriv,
     * GetSamplerParameterfv, GetSamplerParameterIivOES, and GetSamplerParameterIuivOES when their {@code pname} parameter is TEXTURE_WRAP_S, TEXTURE_WRAP_T,
     * or TEXTURE_WRAP_R.
     */
    public static final int GL_CLAMP_TO_BORDER_OES = 0x812D;

    protected OESTextureBorderClamp() {
        throw new UnsupportedOperationException();
    }

    // --- [ glTexParameterIivOES ] ---

    public static native void nglTexParameterIivOES(int target, int pname, long params);

    public static void glTexParameterIivOES(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglTexParameterIivOES(target, pname, memAddress(params));
    }

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

    public static native void nglTexParameterIuivOES(int target, int pname, long params);

    public static void glTexParameterIuivOES(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglTexParameterIuivOES(target, pname, memAddress(params));
    }

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

    public static native void nglGetTexParameterIivOES(int target, int pname, long params);

    public static void glGetTexParameterIivOES(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetTexParameterIivOES(target, pname, memAddress(params));
    }

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

    public static native void nglGetTexParameterIuivOES(int target, int pname, long params);

    public static void glGetTexParameterIuivOES(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetTexParameterIuivOES(target, pname, memAddress(params));
    }

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

    public static native void nglSamplerParameterIivOES(int sampler, int pname, long params);

    public static void glSamplerParameterIivOES(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglSamplerParameterIivOES(sampler, pname, memAddress(params));
    }

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

    public static native void nglSamplerParameterIuivOES(int sampler, int pname, long params);

    public static void glSamplerParameterIuivOES(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLuint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglSamplerParameterIuivOES(sampler, pname, memAddress(params));
    }

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

    public static native void nglGetSamplerParameterIivOES(int sampler, int pname, long params);

    public static void glGetSamplerParameterIivOES(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetSamplerParameterIivOES(sampler, pname, memAddress(params));
    }

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

    public static native void nglGetSamplerParameterIuivOES(int sampler, int pname, long params);

    public static void glGetSamplerParameterIuivOES(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLuint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetSamplerParameterIuivOES(sampler, pname, memAddress(params));
    }

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

    /** Array version of: {@link #glTexParameterIivOES TexParameterIivOES} */
    public static void glTexParameterIivOES(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        long __functionAddress = GLES.getICD().glTexParameterIivOES;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glTexParameterIuivOES TexParameterIuivOES} */
    public static void glTexParameterIuivOES(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint const *") int[] params) {
        long __functionAddress = GLES.getICD().glTexParameterIuivOES;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glGetTexParameterIivOES GetTexParameterIivOES} */
    public static void glGetTexParameterIivOES(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetTexParameterIivOES;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glGetTexParameterIuivOES GetTexParameterIuivOES} */
    public static void glGetTexParameterIuivOES(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetTexParameterIuivOES;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glSamplerParameterIivOES SamplerParameterIivOES} */
    public static void glSamplerParameterIivOES(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        long __functionAddress = GLES.getICD().glSamplerParameterIivOES;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(sampler, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glSamplerParameterIuivOES SamplerParameterIuivOES} */
    public static void glSamplerParameterIuivOES(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLuint const *") int[] params) {
        long __functionAddress = GLES.getICD().glSamplerParameterIuivOES;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(sampler, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glGetSamplerParameterIivOES GetSamplerParameterIivOES} */
    public static void glGetSamplerParameterIivOES(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetSamplerParameterIivOES;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(sampler, pname, params, __functionAddress);
    }

    /** Array version of: {@link #glGetSamplerParameterIuivOES GetSamplerParameterIuivOES} */
    public static void glGetSamplerParameterIuivOES(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] params) {
        long __functionAddress = GLES.getICD().glGetSamplerParameterIuivOES;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(sampler, pname, params, __functionAddress);
    }

}
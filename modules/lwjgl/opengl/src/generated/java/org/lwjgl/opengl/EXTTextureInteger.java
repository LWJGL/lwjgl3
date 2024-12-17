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

public class EXTTextureInteger {

    static { GL.initialize(); }

    public static final int GL_RGBA_INTEGER_MODE_EXT = 0x8D9E;

    public static final int
        GL_RGBA32UI_EXT            = 0x8D70,
        GL_RGB32UI_EXT             = 0x8D71,
        GL_ALPHA32UI_EXT           = 0x8D72,
        GL_INTENSITY32UI_EXT       = 0x8D73,
        GL_LUMINANCE32UI_EXT       = 0x8D74,
        GL_LUMINANCE_ALPHA32UI_EXT = 0x8D75,
        GL_RGBA16UI_EXT            = 0x8D76,
        GL_RGB16UI_EXT             = 0x8D77,
        GL_ALPHA16UI_EXT           = 0x8D78,
        GL_INTENSITY16UI_EXT       = 0x8D79,
        GL_LUMINANCE16UI_EXT       = 0x8D7A,
        GL_LUMINANCE_ALPHA16UI_EXT = 0x8D7B,
        GL_RGBA8UI_EXT             = 0x8D7C,
        GL_RGB8UI_EXT              = 0x8D7D,
        GL_ALPHA8UI_EXT            = 0x8D7E,
        GL_INTENSITY8UI_EXT        = 0x8D7F,
        GL_LUMINANCE8UI_EXT        = 0x8D80,
        GL_LUMINANCE_ALPHA8UI_EXT  = 0x8D81,
        GL_RGBA32I_EXT             = 0x8D82,
        GL_RGB32I_EXT              = 0x8D83,
        GL_ALPHA32I_EXT            = 0x8D84,
        GL_INTENSITY32I_EXT        = 0x8D85,
        GL_LUMINANCE32I_EXT        = 0x8D86,
        GL_LUMINANCE_ALPHA32I_EXT  = 0x8D87,
        GL_RGBA16I_EXT             = 0x8D88,
        GL_RGB16I_EXT              = 0x8D89,
        GL_ALPHA16I_EXT            = 0x8D8A,
        GL_INTENSITY16I_EXT        = 0x8D8B,
        GL_LUMINANCE16I_EXT        = 0x8D8C,
        GL_LUMINANCE_ALPHA16I_EXT  = 0x8D8D,
        GL_RGBA8I_EXT              = 0x8D8E,
        GL_RGB8I_EXT               = 0x8D8F,
        GL_ALPHA8I_EXT             = 0x8D90,
        GL_INTENSITY8I_EXT         = 0x8D91,
        GL_LUMINANCE8I_EXT         = 0x8D92,
        GL_LUMINANCE_ALPHA8I_EXT   = 0x8D93;

    public static final int
        GL_RED_INTEGER_EXT             = 0x8D94,
        GL_GREEN_INTEGER_EXT           = 0x8D95,
        GL_BLUE_INTEGER_EXT            = 0x8D96,
        GL_ALPHA_INTEGER_EXT           = 0x8D97,
        GL_RGB_INTEGER_EXT             = 0x8D98,
        GL_RGBA_INTEGER_EXT            = 0x8D99,
        GL_BGR_INTEGER_EXT             = 0x8D9A,
        GL_BGRA_INTEGER_EXT            = 0x8D9B,
        GL_LUMINANCE_INTEGER_EXT       = 0x8D9C,
        GL_LUMINANCE_ALPHA_INTEGER_EXT = 0x8D9D;

    protected EXTTextureInteger() {
        throw new UnsupportedOperationException();
    }

    // --- [ glClearColorIiEXT ] ---

    /** {@code void glClearColorIiEXT(GLint r, GLint g, GLint b, GLint a)} */
    public static native void glClearColorIiEXT(@NativeType("GLint") int r, @NativeType("GLint") int g, @NativeType("GLint") int b, @NativeType("GLint") int a);

    // --- [ glClearColorIuiEXT ] ---

    /** {@code void glClearColorIuiEXT(GLuint r, GLuint g, GLuint b, GLuint a)} */
    public static native void glClearColorIuiEXT(@NativeType("GLuint") int r, @NativeType("GLuint") int g, @NativeType("GLuint") int b, @NativeType("GLuint") int a);

    // --- [ glTexParameterIivEXT ] ---

    /** {@code void glTexParameterIivEXT(GLenum target, GLenum pname, GLint * params)} */
    public static native void nglTexParameterIivEXT(int target, int pname, long params);

    /** {@code void glTexParameterIivEXT(GLenum target, GLenum pname, GLint * params)} */
    public static void glTexParameterIivEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglTexParameterIivEXT(target, pname, memAddress(params));
    }

    /** {@code void glTexParameterIivEXT(GLenum target, GLenum pname, GLint * params)} */
    public static void glTexParameterIiEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int param) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.ints(param);
            nglTexParameterIivEXT(target, pname, memAddress(params));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glTexParameterIuivEXT ] ---

    /** {@code void glTexParameterIuivEXT(GLenum target, GLenum pname, GLuint * params)} */
    public static native void nglTexParameterIuivEXT(int target, int pname, long params);

    /** {@code void glTexParameterIuivEXT(GLenum target, GLenum pname, GLuint * params)} */
    public static void glTexParameterIuivEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglTexParameterIuivEXT(target, pname, memAddress(params));
    }

    /** {@code void glTexParameterIuivEXT(GLenum target, GLenum pname, GLuint * params)} */
    public static void glTexParameterIuiEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint *") int param) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.ints(param);
            nglTexParameterIuivEXT(target, pname, memAddress(params));
        } finally {
            stack.setPointer(stackPointer);
        }
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

    /** {@code void glTexParameterIivEXT(GLenum target, GLenum pname, GLint * params)} */
    public static void glTexParameterIivEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glTexParameterIivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** {@code void glTexParameterIuivEXT(GLenum target, GLenum pname, GLuint * params)} */
    public static void glTexParameterIuivEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] params) {
        long __functionAddress = GL.getICD().glTexParameterIuivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** {@code void glGetTexParameterIivEXT(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetTexParameterIivEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetTexParameterIivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

    /** {@code void glGetTexParameterIuivEXT(GLenum target, GLenum pname, GLuint * params)} */
    public static void glGetTexParameterIuivEXT(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] params) {
        long __functionAddress = GL.getICD().glGetTexParameterIuivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, pname, params, __functionAddress);
    }

}
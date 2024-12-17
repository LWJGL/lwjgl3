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

public class ARBFramebufferNoAttachments {

    static { GL.initialize(); }

    public static final int
        GL_FRAMEBUFFER_DEFAULT_WIDTH                  = 0x9310,
        GL_FRAMEBUFFER_DEFAULT_HEIGHT                 = 0x9311,
        GL_FRAMEBUFFER_DEFAULT_LAYERS                 = 0x9312,
        GL_FRAMEBUFFER_DEFAULT_SAMPLES                = 0x9313,
        GL_FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS = 0x9314;

    public static final int
        GL_MAX_FRAMEBUFFER_WIDTH   = 0x9315,
        GL_MAX_FRAMEBUFFER_HEIGHT  = 0x9316,
        GL_MAX_FRAMEBUFFER_LAYERS  = 0x9317,
        GL_MAX_FRAMEBUFFER_SAMPLES = 0x9318;

    protected ARBFramebufferNoAttachments() {
        throw new UnsupportedOperationException();
    }

    // --- [ glFramebufferParameteri ] ---

    /** {@code void glFramebufferParameteri(GLenum target, GLenum pname, GLint param)} */
    public static void glFramebufferParameteri(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint") int param) {
        GL43C.glFramebufferParameteri(target, pname, param);
    }

    // --- [ glGetFramebufferParameteriv ] ---

    /** {@code void glGetFramebufferParameteriv(GLenum target, GLenum pname, GLint * params)} */
    public static void nglGetFramebufferParameteriv(int target, int pname, long params) {
        GL43C.nglGetFramebufferParameteriv(target, pname, params);
    }

    /** {@code void glGetFramebufferParameteriv(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetFramebufferParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        GL43C.glGetFramebufferParameteriv(target, pname, params);
    }

    /** {@code void glGetFramebufferParameteriv(GLenum target, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetFramebufferParameteri(@NativeType("GLenum") int target, @NativeType("GLenum") int pname) {
        return GL43C.glGetFramebufferParameteri(target, pname);
    }

    // --- [ glNamedFramebufferParameteriEXT ] ---

    /** {@code void glNamedFramebufferParameteriEXT(GLuint framebuffer, GLenum pname, GLint param)} */
    public static native void glNamedFramebufferParameteriEXT(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int pname, @NativeType("GLint") int param);

    // --- [ glGetNamedFramebufferParameterivEXT ] ---

    /** {@code void glGetNamedFramebufferParameterivEXT(GLuint framebuffer, GLenum pname, GLint * params)} */
    public static native void nglGetNamedFramebufferParameterivEXT(int framebuffer, int pname, long params);

    /** {@code void glGetNamedFramebufferParameterivEXT(GLuint framebuffer, GLenum pname, GLint * params)} */
    public static void glGetNamedFramebufferParameterivEXT(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetNamedFramebufferParameterivEXT(framebuffer, pname, memAddress(params));
    }

    /** {@code void glGetNamedFramebufferParameterivEXT(GLuint framebuffer, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetNamedFramebufferParameteriEXT(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetNamedFramebufferParameterivEXT(framebuffer, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glGetFramebufferParameteriv(GLenum target, GLenum pname, GLint * params)} */
    public static void glGetFramebufferParameteriv(@NativeType("GLenum") int target, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        GL43C.glGetFramebufferParameteriv(target, pname, params);
    }

    /** {@code void glGetNamedFramebufferParameterivEXT(GLuint framebuffer, GLenum pname, GLint * params)} */
    public static void glGetNamedFramebufferParameterivEXT(@NativeType("GLuint") int framebuffer, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetNamedFramebufferParameterivEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(framebuffer, pname, params, __functionAddress);
    }

}
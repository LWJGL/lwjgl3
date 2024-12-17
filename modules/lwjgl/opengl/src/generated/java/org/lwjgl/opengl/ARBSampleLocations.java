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

public class ARBSampleLocations {

    static { GL.initialize(); }

    public static final int
        GL_SAMPLE_LOCATION_SUBPIXEL_BITS_ARB           = 0x933D,
        GL_SAMPLE_LOCATION_PIXEL_GRID_WIDTH_ARB        = 0x933E,
        GL_SAMPLE_LOCATION_PIXEL_GRID_HEIGHT_ARB       = 0x933F,
        GL_PROGRAMMABLE_SAMPLE_LOCATION_TABLE_SIZE_ARB = 0x9340;

    public static final int
        GL_FRAMEBUFFER_PROGRAMMABLE_SAMPLE_LOCATIONS_ARB = 0x9342,
        GL_FRAMEBUFFER_SAMPLE_LOCATION_PIXEL_GRID_ARB    = 0x9343;

    protected ARBSampleLocations() {
        throw new UnsupportedOperationException();
    }

    // --- [ glFramebufferSampleLocationsfvARB ] ---

    /** {@code void glFramebufferSampleLocationsfvARB(GLenum target, GLuint start, GLsizei count, GLfloat const * v)} */
    public static native void nglFramebufferSampleLocationsfvARB(int target, int start, int count, long v);

    /** {@code void glFramebufferSampleLocationsfvARB(GLenum target, GLuint start, GLsizei count, GLfloat const * v)} */
    public static void glFramebufferSampleLocationsfvARB(@NativeType("GLenum") int target, @NativeType("GLuint") int start, @NativeType("GLfloat const *") FloatBuffer v) {
        nglFramebufferSampleLocationsfvARB(target, start, v.remaining() >> 1, memAddress(v));
    }

    // --- [ glNamedFramebufferSampleLocationsfvARB ] ---

    /** {@code void glNamedFramebufferSampleLocationsfvARB(GLuint framebuffer, GLuint start, GLsizei count, GLfloat const * v)} */
    public static native void nglNamedFramebufferSampleLocationsfvARB(int framebuffer, int start, int count, long v);

    /** {@code void glNamedFramebufferSampleLocationsfvARB(GLuint framebuffer, GLuint start, GLsizei count, GLfloat const * v)} */
    public static void glNamedFramebufferSampleLocationsfvARB(@NativeType("GLuint") int framebuffer, @NativeType("GLuint") int start, @NativeType("GLfloat const *") FloatBuffer v) {
        nglNamedFramebufferSampleLocationsfvARB(framebuffer, start, v.remaining() >> 1, memAddress(v));
    }

    // --- [ glEvaluateDepthValuesARB ] ---

    /** {@code void glEvaluateDepthValuesARB(void)} */
    public static native void glEvaluateDepthValuesARB();

    /** {@code void glFramebufferSampleLocationsfvARB(GLenum target, GLuint start, GLsizei count, GLfloat const * v)} */
    public static void glFramebufferSampleLocationsfvARB(@NativeType("GLenum") int target, @NativeType("GLuint") int start, @NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GL.getICD().glFramebufferSampleLocationsfvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, start, v.length >> 1, v, __functionAddress);
    }

    /** {@code void glNamedFramebufferSampleLocationsfvARB(GLuint framebuffer, GLuint start, GLsizei count, GLfloat const * v)} */
    public static void glNamedFramebufferSampleLocationsfvARB(@NativeType("GLuint") int framebuffer, @NativeType("GLuint") int start, @NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GL.getICD().glNamedFramebufferSampleLocationsfvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(framebuffer, start, v.length >> 1, v, __functionAddress);
    }

}
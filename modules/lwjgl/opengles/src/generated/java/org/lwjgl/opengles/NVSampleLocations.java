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
import static org.lwjgl.system.MemoryUtil.*;

public class NVSampleLocations {

    static { GLES.initialize(); }

    public static final int
        GL_SAMPLE_LOCATION_SUBPIXEL_BITS_NV           = 0x933D,
        GL_SAMPLE_LOCATION_PIXEL_GRID_WIDTH_NV        = 0x933E,
        GL_SAMPLE_LOCATION_PIXEL_GRID_HEIGHT_NV       = 0x933F,
        GL_PROGRAMMABLE_SAMPLE_LOCATION_TABLE_SIZE_NV = 0x9340;

    public static final int
        GL_SAMPLE_LOCATION_NV              = 0x8E50,
        GL_PROGRAMMABLE_SAMPLE_LOCATION_NV = 0x9341;

    public static final int
        GL_FRAMEBUFFER_PROGRAMMABLE_SAMPLE_LOCATIONS_NV = 0x9342,
        GL_FRAMEBUFFER_SAMPLE_LOCATION_PIXEL_GRID_NV    = 0x9343;

    protected NVSampleLocations() {
        throw new UnsupportedOperationException();
    }

    // --- [ glFramebufferSampleLocationsfvNV ] ---

    /** {@code void glFramebufferSampleLocationsfvNV(GLenum target, GLuint start, GLsizei count, GLfloat const * v)} */
    public static native void nglFramebufferSampleLocationsfvNV(int target, int start, int count, long v);

    /** {@code void glFramebufferSampleLocationsfvNV(GLenum target, GLuint start, GLsizei count, GLfloat const * v)} */
    public static void glFramebufferSampleLocationsfvNV(@NativeType("GLenum") int target, @NativeType("GLuint") int start, @NativeType("GLfloat const *") FloatBuffer v) {
        nglFramebufferSampleLocationsfvNV(target, start, v.remaining(), memAddress(v));
    }

    // --- [ glNamedFramebufferSampleLocationsfvNV ] ---

    /** {@code void glNamedFramebufferSampleLocationsfvNV(GLuint framebuffer, GLuint start, GLsizei count, GLfloat const * v)} */
    public static native void nglNamedFramebufferSampleLocationsfvNV(int framebuffer, int start, int count, long v);

    /** {@code void glNamedFramebufferSampleLocationsfvNV(GLuint framebuffer, GLuint start, GLsizei count, GLfloat const * v)} */
    public static void glNamedFramebufferSampleLocationsfvNV(@NativeType("GLuint") int framebuffer, @NativeType("GLuint") int start, @NativeType("GLfloat const *") FloatBuffer v) {
        nglNamedFramebufferSampleLocationsfvNV(framebuffer, start, v.remaining(), memAddress(v));
    }

    // --- [ glResolveDepthValuesNV ] ---

    /** {@code void glResolveDepthValuesNV(void)} */
    public static native void glResolveDepthValuesNV();

    /** {@code void glFramebufferSampleLocationsfvNV(GLenum target, GLuint start, GLsizei count, GLfloat const * v)} */
    public static void glFramebufferSampleLocationsfvNV(@NativeType("GLenum") int target, @NativeType("GLuint") int start, @NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GLES.getICD().glFramebufferSampleLocationsfvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, start, v.length, v, __functionAddress);
    }

    /** {@code void glNamedFramebufferSampleLocationsfvNV(GLuint framebuffer, GLuint start, GLsizei count, GLfloat const * v)} */
    public static void glNamedFramebufferSampleLocationsfvNV(@NativeType("GLuint") int framebuffer, @NativeType("GLuint") int start, @NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GLES.getICD().glNamedFramebufferSampleLocationsfvNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(framebuffer, start, v.length, v, __functionAddress);
    }

}
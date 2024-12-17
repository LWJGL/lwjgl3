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

public class NVFramebufferMixedSamples {

    static { GL.initialize(); }

    public static final int
        GL_RASTER_MULTISAMPLE_EXT       = 0x9327,
        GL_COVERAGE_MODULATION_TABLE_NV = 0x9331;

    public static final int
        GL_RASTER_SAMPLES_EXT                    = 0x9328,
        GL_MAX_RASTER_SAMPLES_EXT                = 0x9329,
        GL_RASTER_FIXED_SAMPLE_LOCATIONS_EXT     = 0x932A,
        GL_MULTISAMPLE_RASTERIZATION_ALLOWED_EXT = 0x932B,
        GL_EFFECTIVE_RASTER_SAMPLES_EXT          = 0x932C,
        GL_COLOR_SAMPLES_NV                      = 0x8E20,
        GL_DEPTH_SAMPLES_NV                      = 0x932D,
        GL_STENCIL_SAMPLES_NV                    = 0x932E,
        GL_MIXED_DEPTH_SAMPLES_SUPPORTED_NV      = 0x932F,
        GL_MIXED_STENCIL_SAMPLES_SUPPORTED_NV    = 0x9330,
        GL_COVERAGE_MODULATION_NV                = 0x9332,
        GL_COVERAGE_MODULATION_TABLE_SIZE_NV     = 0x9333;

    protected NVFramebufferMixedSamples() {
        throw new UnsupportedOperationException();
    }

    // --- [ glRasterSamplesEXT ] ---

    /** {@code void glRasterSamplesEXT(GLuint samples, GLboolean fixedsamplelocations)} */
    public static void glRasterSamplesEXT(@NativeType("GLuint") int samples, @NativeType("GLboolean") boolean fixedsamplelocations) {
        EXTRasterMultisample.glRasterSamplesEXT(samples, fixedsamplelocations);
    }

    // --- [ glCoverageModulationTableNV ] ---

    /** {@code void glCoverageModulationTableNV(GLsizei n, GLfloat const * v)} */
    public static native void nglCoverageModulationTableNV(int n, long v);

    /** {@code void glCoverageModulationTableNV(GLsizei n, GLfloat const * v)} */
    public static void glCoverageModulationTableNV(@NativeType("GLfloat const *") FloatBuffer v) {
        nglCoverageModulationTableNV(v.remaining(), memAddress(v));
    }

    // --- [ glGetCoverageModulationTableNV ] ---

    /** {@code void glGetCoverageModulationTableNV(GLsizei bufsize, GLfloat * v)} */
    public static native void nglGetCoverageModulationTableNV(int bufsize, long v);

    /** {@code void glGetCoverageModulationTableNV(GLsizei bufsize, GLfloat * v)} */
    public static void glGetCoverageModulationTableNV(@NativeType("GLfloat *") FloatBuffer v) {
        nglGetCoverageModulationTableNV(v.remaining(), memAddress(v));
    }

    // --- [ glCoverageModulationNV ] ---

    /** {@code void glCoverageModulationNV(GLenum components)} */
    public static native void glCoverageModulationNV(@NativeType("GLenum") int components);

    /** {@code void glCoverageModulationTableNV(GLsizei n, GLfloat const * v)} */
    public static void glCoverageModulationTableNV(@NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GL.getICD().glCoverageModulationTableNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v.length, v, __functionAddress);
    }

    /** {@code void glGetCoverageModulationTableNV(GLsizei bufsize, GLfloat * v)} */
    public static void glGetCoverageModulationTableNV(@NativeType("GLfloat *") float[] v) {
        long __functionAddress = GL.getICD().glGetCoverageModulationTableNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v.length, v, __functionAddress);
    }

}
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

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_framebuffer_mixed_samples.txt">NV_framebuffer_mixed_samples</a> extension.
 * 
 * <p>This extension allows multisample rendering with a raster and depth/stencil sample count that is larger than the color sample count. Rasterization and
 * the results of the depth and stencil tests together determine the portion of a pixel that is "covered". It can be useful to evaluate coverage at a
 * higher frequency than color samples are stored. This coverage is then "reduced" to a collection of covered color samples, each having an opacity value
 * corresponding to the fraction of the color sample covered. The opacity can optionally be blended into individual color samples.</p>
 * 
 * <p>In the current hardware incarnation both depth and stencil testing are supported with mixed samples, although the API accommodates supporting only one
 * or the other.</p>
 * 
 * <p>Rendering with fewer color samples than depth/stencil samples can greatly reduce the amount of memory and bandwidth consumed by the color buffer.
 * However, converting the coverage values into opacity can introduce artifacts where triangles share edges and may not be suitable for normal triangle
 * mesh rendering.</p>
 * 
 * <p>One expected use case for this functionality is Stencil-then-Cover path rendering (NV_path_rendering). The stencil step determines the coverage (in the
 * stencil buffer) for an entire path at the higher sample frequency, and then the cover step can draw the path into the lower frequency color buffer
 * using the coverage information to antialias path edges. With this two-step process, internal edges are fully covered when antialiasing is applied and
 * there is no corruption on these edges.</p>
 * 
 * <p>The key features of this extension are:</p>
 * 
 * <ul>
 * <li>It allows a framebuffer object to be considered complete when its depth or stencil samples are a multiple of the number of color samples.</li>
 * <li>It redefines SAMPLES to be the number of depth/stencil samples (if any); otherwise, it uses the number of color samples. SAMPLE_BUFFERS is one if
 * there are multisample depth/stencil attachments. Multisample rasterization and multisample fragment ops are allowed if SAMPLE_BUFFERS is one.</li>
 * <li>It replaces several error checks involving SAMPLE_BUFFERS by error checks directly referencing the number of samples in the relevant attachments.</li>
 * <li>A coverage reduction step is added to Per-Fragment Operations which converts a set of covered raster/depth/stencil samples to a set of covered
 * color samples. The coverage reduction step also includes an optional coverage modulation step, multiplying color values by a fractional opacity
 * corresponding to the number of associated raster/depth/stencil samples covered.</li>
 * </ul>
 */
public class NVFramebufferMixedSamples {

    static { GLES.initialize(); }

    /** Accepted by the {@code cap} parameter of Enable, Disable, IsEnabled. */
    public static final int
        GL_RASTER_MULTISAMPLE_EXT       = 0x9327,
        GL_COVERAGE_MODULATION_TABLE_NV = 0x9331;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv. */
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

    public static void glRasterSamplesEXT(@NativeType("GLuint") int samples, @NativeType("GLboolean") boolean fixedsamplelocations) {
        EXTRasterMultisample.glRasterSamplesEXT(samples, fixedsamplelocations);
    }

    // --- [ glCoverageModulationTableNV ] ---

    public static native void nglCoverageModulationTableNV(int n, long v);

    public static void glCoverageModulationTableNV(@NativeType("GLfloat const *") FloatBuffer v) {
        nglCoverageModulationTableNV(v.remaining(), memAddress(v));
    }

    // --- [ glGetCoverageModulationTableNV ] ---

    public static native void nglGetCoverageModulationTableNV(int bufsize, long v);

    public static void glGetCoverageModulationTableNV(@NativeType("GLfloat *") FloatBuffer v) {
        nglGetCoverageModulationTableNV(v.remaining(), memAddress(v));
    }

    // --- [ glCoverageModulationNV ] ---

    public static native void glCoverageModulationNV(@NativeType("GLenum") int components);

    /** Array version of: {@link #glCoverageModulationTableNV CoverageModulationTableNV} */
    public static void glCoverageModulationTableNV(@NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GLES.getICD().glCoverageModulationTableNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v.length, v, __functionAddress);
    }

    /** Array version of: {@link #glGetCoverageModulationTableNV GetCoverageModulationTableNV} */
    public static void glGetCoverageModulationTableNV(@NativeType("GLfloat *") float[] v) {
        long __functionAddress = GLES.getICD().glGetCoverageModulationTableNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(v.length, v, __functionAddress);
    }

}
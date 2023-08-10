/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_multisample_coverage.txt">NV_multisample_coverage</a> extension.
 * 
 * <p>The ARB_multisample extension provides a mechanism for antialiasing primitives. This mechanism allows an application to request an additional buffer,
 * the multisample buffer, that is added to the framebuffer. An application can request the number of samples per fragment that are stored in the
 * multisample buffer. Rendering proceeds by writing color, depth, and stencil values for each sample to the multisample buffer. The results are
 * automatically resolved to a single displayable color each time a pixel is updated.</p>
 * 
 * <p>Coverage Sample Anti-Aliasing (CSAA) is an extension to multisample antialiasing. The technique separates "samples" into two types of samples. "Color
 * samples" are samples with color, depth, and stencil information stored in the multisample buffer. "Coverage samples" include both color samples and
 * additional samples that only provide pixel coverage information.</p>
 * 
 * <p>This extension follows the example of the NV_framebuffer_multisample_coverage extension, which adds CSAA support for framebuffer objects. The base
 * description of multisample rendering is written in terms of coverage samples and color samples. The windows system notion of "samples" (SAMPLES_ARB) is
 * layered on top of coverage and color samples.</p>
 * 
 * <p>Requires {@link ARBMultisample ARB_multisample}.</p>
 */
public final class NVMultisampleCoverage {

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv. */
    public static final int GL_COLOR_SAMPLES_NV = 0x8E20;

    private NVMultisampleCoverage() {}

}
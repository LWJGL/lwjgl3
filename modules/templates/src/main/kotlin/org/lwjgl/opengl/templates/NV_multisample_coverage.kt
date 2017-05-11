/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val NV_multisample_coverage = "NVMultisampleCoverage".nativeClassGL("NV_multisample_coverage", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        The ARB_multisample extension provides a mechanism for antialiasing primitives. This mechanism allows an application to request an additional buffer,
        the multisample buffer, that is added to the framebuffer. An application can request the number of samples per fragment that are stored in the
        multisample buffer. Rendering proceeds by writing color, depth, and stencil values for each sample to the multisample buffer. The results are
        automatically resolved to a single displayable color each time a pixel is updated.

        Coverage Sample Anti-Aliasing (CSAA) is an extension to multisample antialiasing. The technique separates "samples" into two types of samples. "Color
        samples" are samples with color, depth, and stencil information stored in the multisample buffer. "Coverage samples" include both color samples and
        additional samples that only provide pixel coverage information.

        This extension follows the example of the NV_framebuffer_multisample_coverage extension, which adds CSAA support for framebuffer objects. The base
        description of multisample rendering is written in terms of coverage samples and color samples. The windows system notion of "samples" (SAMPLES_ARB) is
        layered on top of coverage and color samples.
    
        Requires ${ARB_multisample.link}.
        """

    IntConstant(
        """
        Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv.
        """,

        "COLOR_SAMPLES_NV"..0x8E20
    )
}

val GLX_NV_multisample_coverage = "GLXNVMultisampleCoverage".nativeClassGLX("GLX_NV_multisample_coverage", postfix = NV) {
    documentation =
        """
        Native bindings to the ${registryLink("NV", "multisample_coverage")} extension.

        GLX functionality for ${NV_multisample_coverage.link}.
        """

    IntConstant(
        """
        Accepted by the {@code attribList} parameter of glXChooseVisual, and by the {@code attrib} parameter of glXGetConfig, the
        {@code attrib_list} parameter of glXChooseFBConfig, and the {@code attribute} parameter of glXGetFBConfigAttrib.
        """,

        "COVERAGE_SAMPLES_NV".."100001",
        "COLOR_SAMPLES_NV"..0x20B3
    )
}

val WGL_NV_multisample_coverage = "WGLNVMultisampleCoverage".nativeClassWGL("WGL_NV_multisample_coverage", postfix = NV) {
    documentation =
        """
        Native bindings to the ${registryLink("NV", "multisample_coverage")} extension.

        WGL functionality for ${NV_multisample_coverage.link}.
        """

    IntConstant(
        """
        Accepted by the {@code piAttributes} parameter of wglGetPixelFormatAttribivEXT, wglGetPixelFormatAttribfvEXT, and the
        {@code piAttribIList} and {@code pfAttribIList} of wglChoosePixelFormatEXT.
        """,

        "COVERAGE_SAMPLES_NV"..0x2042,
        "COLOR_SAMPLES_NV"..0x20B9
    )
}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val NV_framebuffer_multisample_coverage = "NVFramebufferMultisampleCoverage".nativeClassGL("NV_framebuffer_multisample_coverage", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension extends the EXT_framebuffer_multisample specification by providing a new function, RenderBufferStorageMultisampleCoverageNV, that
        distinguishes between color samples and coverage samples.

        EXT_framebuffer_multisample introduced the function RenderbufferStorageMultisampleEXT as a method of defining the storage parameters for a multisample
        render buffer. This function takes a {@code samples} parameter. Using rules provided by the specification, the <samples> parameter is resolved to an actual
        number of samples that is supported by the underlying hardware. EXT_framebuffer_multisample does not specify whether {@code samples} refers to coverage
        samples or color samples.

        This extension adds the function RenderbufferStorageMultisamplCoverageNV, which takes a {@code coverageSamples} parameter as well as a
        {@code colorSamples} parameter. These two parameters give developers more fine grained control over the quality of multisampled images.

        Requires ${EXT_framebuffer_object.link}, ${EXT_framebuffer_blit.link} and ${EXT_framebuffer_multisample.link}.
        """

    IntConstant(
        "Accepted by the {@code pname} parameter of GetRenderbufferParameterivEXT.",

        "RENDERBUFFER_COVERAGE_SAMPLES_NV"..0x8CAB,
        "RENDERBUFFER_COLOR_SAMPLES_NV"..0x8E10
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetIntegerv.",

        "MAX_MULTISAMPLE_COVERAGE_MODES_NV"..0x8E11,
        "MULTISAMPLE_COVERAGE_MODES_NV"..0x8E12
    )

    void(
        "RenderbufferStorageMultisampleCoverageNV",
        "",

        GLenum.IN("target", ""),
        GLsizei.IN("coverageSamples", ""),
        GLsizei.IN("colorSamples", ""),
        GLenum.IN("internalformat", ""),
        GLsizei.IN("width", ""),
        GLsizei.IN("height", "")
    )
}
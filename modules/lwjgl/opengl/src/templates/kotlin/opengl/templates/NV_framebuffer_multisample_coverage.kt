/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_framebuffer_multisample_coverage = "NVFramebufferMultisampleCoverage".nativeClassGL("NV_framebuffer_multisample_coverage", postfix = NV) {
    IntConstant(
        "RENDERBUFFER_COVERAGE_SAMPLES_NV"..0x8CAB,
        "RENDERBUFFER_COLOR_SAMPLES_NV"..0x8E10
    )

    IntConstant(
        "MAX_MULTISAMPLE_COVERAGE_MODES_NV"..0x8E11,
        "MULTISAMPLE_COVERAGE_MODES_NV"..0x8E12
    )

    void(
        "RenderbufferStorageMultisampleCoverageNV",

        GLenum("target"),
        GLsizei("coverageSamples"),
        GLsizei("colorSamples"),
        GLenum("internalformat"),
        GLsizei("width"),
        GLsizei("height")
    )
}
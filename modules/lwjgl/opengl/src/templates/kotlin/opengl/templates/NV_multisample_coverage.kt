/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_multisample_coverage = "NVMultisampleCoverage".nativeClassGL("NV_multisample_coverage", postfix = NV) {
    IntConstant(
        "COLOR_SAMPLES_NV"..0x8E20
    )
}

val GLX_NV_multisample_coverage = "GLXNVMultisampleCoverage".nativeClassGLX("GLX_NV_multisample_coverage", postfix = NV) {
    IntConstant(
        "COVERAGE_SAMPLES_NV".."100001",
        "COLOR_SAMPLES_NV"..0x20B3
    )
}

val WGL_NV_multisample_coverage = "WGLNVMultisampleCoverage".nativeClassWGL("WGL_NV_multisample_coverage", postfix = NV) {
    IntConstant(
        "COVERAGE_SAMPLES_NV"..0x2042,
        "COLOR_SAMPLES_NV"..0x20B9
    )
}
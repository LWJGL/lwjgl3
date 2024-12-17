/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_multisample = "ARBMultisample".nativeClassGL("ARB_multisample", postfix = ARB) {
    IntConstant(
        "MULTISAMPLE_ARB"..0x809D,
        "SAMPLE_ALPHA_TO_COVERAGE_ARB"..0x809E,
        "SAMPLE_ALPHA_TO_ONE_ARB"..0x809F,
        "SAMPLE_COVERAGE_ARB"..0x80A0
    )

    IntConstant(
        "MULTISAMPLE_BIT_ARB"..0x20000000
    )

    IntConstant(
        "SAMPLE_BUFFERS_ARB"..0x80A8,
        "SAMPLES_ARB"..0x80A9,
        "SAMPLE_COVERAGE_VALUE_ARB"..0x80AA,
        "SAMPLE_COVERAGE_INVERT_ARB"..0x80AB
    )

    void(
        "SampleCoverageARB",

        GLfloat("value"),
        GLboolean("invert")
    )
}

val GLX_ARB_multisample = "GLXARBMultisample".nativeClassGLX("GLX_ARB_multisample", ARB) {
    IntConstant(
        "SAMPLE_BUFFERS_ARB".."100000",
        "SAMPLES_ARB".."100001"
    )
}

val WGL_ARB_multisample = "WGLARBMultisample".nativeClassWGL("WGL_ARB_multisample", ARB) {
    IntConstant(
        "SAMPLE_BUFFERS_ARB"..0x2041,
        "SAMPLES_ARB"..0x2042
    )
}
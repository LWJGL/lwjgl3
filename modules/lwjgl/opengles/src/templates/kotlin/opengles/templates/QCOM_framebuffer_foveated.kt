/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val QCOM_framebuffer_foveated = "QCOMFramebufferFoveated".nativeClassGLES("QCOM_framebuffer_foveated", postfix = QCOM) {
    IntConstant(
        "FOVEATION_ENABLE_BIT_QCOM"..0x1,
        "FOVEATION_SCALED_BIN_METHOD_BIT_QCOM"..0x2
    )

    void(
        "FramebufferFoveationConfigQCOM",

        GLuint("fbo"),
        GLuint("numLayers"),
        GLuint("focalPointsPerLayer"),
        GLuint("requestedFeatures"),
        Check(1)..GLuint.p("providedFeatures")
    )

    void(
        "FramebufferFoveationParametersQCOM",

        GLuint("fbo"),
        GLuint("layer"),
        GLuint("focalPoint"),
        GLfloat("focalX"),
        GLfloat("focalY"),
        GLfloat("gainX"),
        GLfloat("gainY"),
        GLfloat("foveaArea")
    )
}
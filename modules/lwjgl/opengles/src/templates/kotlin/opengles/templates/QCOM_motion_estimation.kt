/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val QCOM_motion_estimation = "QCOMMotionEstimation".nativeClassGLES("QCOM_motion_estimation", postfix = QCOM) {
    IntConstant(
        "MOTION_ESTIMATION_SEARCH_BLOCK_X_QCOM"..0x8C90,
        "MOTION_ESTIMATION_SEARCH_BLOCK_Y_QCOM"..0x8C91
    )

    void(
        "TexEstimateMotionQCOM",

        GLuint("ref"),
        GLuint("target"),
        GLuint("output")
    )

    void(
        "TexEstimateMotionRegionsQCOM",

        GLuint("ref"),
        GLuint("target"),
        GLuint("output"),
        GLuint("mask")
    )
}

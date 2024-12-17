/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val QCOM_frame_extrapolation = "QCOMFrameExtrapolation".nativeClassGLES("QCOM_frame_extrapolation", postfix = QCOM) {
    void(
        "ExtrapolateTex2DQCOM",

        GLuint("src1"),
        GLuint("src2"),
        GLuint("output"),
        GLfloat("scaleFactor")
    )
}
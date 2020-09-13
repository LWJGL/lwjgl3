/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val QCOM_motion_estimation = "QCOMMotionEstimation".nativeClassGLES("QCOM_motion_estimation", postfix = QCOM) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Motion estimation, also referred to as optical flow, is the process of producing motion vectors that convey the 2D transformation from a reference
        image to a target image. There are various uses of motion estimation, such as frame extrapolation, compression, object tracking, etc.

        This extension adds support for motion estimation in OpenGL ES by adding functions which take the reference and target images and populate an output
        texture containing the corresponding motion vectors.
        """

    IntConstant(
        "Accepted by the {@code pname} parameter of GetIntegerv, GetInteger64v, and GetFloatv.",

        "MOTION_ESTIMATION_SEARCH_BLOCK_X_QCOM"..0x8C90,
        "MOTION_ESTIMATION_SEARCH_BLOCK_Y_QCOM"..0x8C91
    )

    void(
        "TexEstimateMotionQCOM",
        "",

        GLuint("ref", ""),
        GLuint("target", ""),
        GLuint("output", "")
    )

    void(
        "TexEstimateMotionRegionsQCOM",
        "",

        GLuint("ref", ""),
        GLuint("target", ""),
        GLuint("output", ""),
        GLuint("mask", "")
    )
}

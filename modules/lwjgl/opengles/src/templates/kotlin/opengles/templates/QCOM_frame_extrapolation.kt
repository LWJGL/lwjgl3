/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val QCOM_frame_extrapolation = "QCOMFrameExtrapolation".nativeClassGLES("QCOM_frame_extrapolation", postfix = QCOM) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Frame extrapolation is the process of producing a new, future frame based on the contents of two previously rendered frames. It may be used to produce
        high frame rate display updates without incurring the full cost of traditional rendering at the higher framerate.

        This extension adds support for frame extrapolation in OpenGL ES by adding a function which takes three textures. The first two are used in sequence as
        the source frames, from which the extrapolated frame is derived. The extrapolated frame is stored in the third texture.
        """

    void(
        "ExtrapolateTex2DQCOM",
        "",

        GLuint("src1", ""),
        GLuint("src2", ""),
        GLuint("output", ""),
        GLfloat("scaleFactor", "")
    )
}
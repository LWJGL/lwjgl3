/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val QCOM_texture_foveated = "QCOMTextureFoveated".nativeClassGLES("QCOM_texture_foveated", postfix = QCOM) {
    IntConstant(
        "TEXTURE_FOVEATED_FEATURE_BITS_QCOM"..0x8BFB,
        "TEXTURE_FOVEATED_MIN_PIXEL_DENSITY_QCOM"..0x8BFC
    )

    IntConstant(
        "TEXTURE_FOVEATED_FEATURE_QUERY_QCOM"..0x8BFD,
        "TEXTURE_FOVEATED_NUM_FOCAL_POINTS_QUERY_QCOM"..0x8BFE
    )

    IntConstant(
        "FOVEATION_ENABLE_BIT_QCOM"..0x1,
        "FOVEATION_SCALED_BIN_METHOD_BIT_QCOM"..0x2
    )

    IntConstant(
        "FRAMEBUFFER_INCOMPLETE_FOVEATION_QCOM"..0x8BFF
    )

    void(
        "TextureFoveationParametersQCOM",

        GLuint("texture"),
        GLuint("layer"),
        GLuint("focalPoint"),
        float("focalX"),
        float("focalY"),
        float("gainX"),
        float("gainY"),
        float("foveaArea")
    )
}
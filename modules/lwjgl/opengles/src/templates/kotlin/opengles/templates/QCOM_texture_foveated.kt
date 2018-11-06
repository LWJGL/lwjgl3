/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val QCOM_texture_foveated = "QCOMTextureFoveated".nativeClassGLES("QCOM_texture_foveated", postfix = QCOM) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Foveated rendering is a technique that aims to reduce fragment processing workload and bandwidth by reducing the average resolution of a render target.
        Perceived image quality is kept high by leaving the focal point of rendering at full resolution.

        It exists in two major forms:
        ${ul(
            """
            Static foveated (lens matched) rendering: where the gaze point is fixed with a large fovea region and designed to match up with the lens
            characteristics.
            """,
            """
            Eye-tracked foveated rendering: where the gaze point is continuously tracked by a sensor to allow a smaller fovea region (further reducing average
            resolution)
            """
        )}

        Traditionally foveated rendering involves breaking a render target's area into smaller regions such as bins, tiles, viewports, or layers which are
        rendered to individually. Each of these regions has the geometry projected or scaled differently so that the net resolution of these layers is less
        than the original render target's resolution. When these regions are mapped back to the original render target, they create a rendered result with
        decreased quality as pixels get further from the focal point.

        Foveated rendering is currently achieved by large modifications to an applications render pipelines to manually implement the required geometry
        amplifications, blits, and projection changes. This presents a large implementation cost to an application developer and is generally inefficient as it
        can not make use of a platforms unique hardware features or optimized software paths. This extension aims to address these problems by exposing
        foveated rendering in an explicit and vendor neutral way, and by providing an interface with minimal changes to how an application specifies its render
        targets.
        """

    IntConstant(
        """
        Accepted as a value for {@code pname} for the TexParameter{if} and TexParameter{if}v commands and for the {@code pname} parameter of
        GetTexParameter{if}v.
        """,

        "TEXTURE_FOVEATED_FEATURE_BITS_QCOM"..0x8BFB,
        "TEXTURE_FOVEATED_MIN_PIXEL_DENSITY_QCOM"..0x8BFC
    )

    IntConstant(
        "Accepted as the {@code pname} parameter of GetTexParameter{if}v.",

        "TEXTURE_FOVEATED_FEATURE_QUERY_QCOM"..0x8BFD,
        "TEXTURE_FOVEATED_NUM_FOCAL_POINTS_QUERY_QCOM"..0x8BFE
    )

    IntConstant(
        """
        Accepted as a value to {@code param} for the TexParameter{if} and to {@code params} for the TexParameter{if}v commands with a {@code pname} of
        #TEXTURE_FOVEATED_FEATURE_BITS_QCOM; returned as possible values for {@code params} when GetTexParameter{if}v is queried with a {@code pname} of
        #TEXTURE_FOVEATED_FEATURE_BITS_QCOM.
        """,

        "FOVEATION_ENABLE_BIT_QCOM"..0x1,
        "FOVEATION_SCALED_BIN_METHOD_BIT_QCOM"..0x2
    )

    IntConstant(
        "Returned by #CheckFramebufferStatus().",

        "FRAMEBUFFER_INCOMPLETE_FOVEATION_QCOM"..0x8BFF
    )

    void(
        "TextureFoveationParametersQCOM",
        "",

        GLuint("texture", ""),
        GLuint("layer", ""),
        GLuint("focalPoint", ""),
        float("focalX", ""),
        float("focalY", ""),
        float("gainX", ""),
        float("gainY", ""),
        float("foveaArea", "")
    )
}
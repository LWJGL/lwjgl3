/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val QCOM_framebuffer_foveated = "QCOMFramebufferFoveated".nativeClassGLES("QCOM_framebuffer_foveated", postfix = QCOM) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Foveated rendering is a technique that aims to reduce fragment processing workload and bandwidth by reducing the average resolution of a framebuffer.
        Perceived image quality is kept high by leaving the focal point of rendering at full resolution.

        It exists in two major forms:
        ${ul(
            """
            Static foveated(lens matched) rendering: where the gaze point is fixed with a large fovea region and designed to match up with the lens
            characteristics.
            """,
            """
            Eye-tracked foveated rendering: where the gaze point is continuously tracked by a sensor to allow a smaller fovea region (further reducing average
            resolution)
            """
        )}

        Traditionally foveated rendering involves breaking a framebuffer's area into smaller regions such as bins, tiles, viewports, or layers which are
        rendered to individually. Each of these regions has the geometry projected or scaled differently so that the net resolution of these layers is less
        than the original framebuffer's resolution. When these regions are mapped back to the original framebuffer, they create a rendered result with
        decreased quality as pixels get further from the focal point.

        Foveated rendering is currently achieved by large modifications to an applications render pipelines to manually implement the required geometry
        amplifications, blits, and projection changes. This presents a large implementation cost to an application developer and is generally inefficient as it
        can not make use of a platforms unique hardware features or optimized software paths. This extension aims to address these problems by exposing
        foveated rendering in an explicit and vendor neutral way, and by providing an interface with minimal changes to how an application specifies its
        framebuffer.
        """

    IntConstant(
        "Allowed in the config input in FramebufferFoveationConfigQCOM.",

        "FOVEATION_ENABLE_BIT_QCOM"..0x1,
        "FOVEATION_SCALED_BIN_METHOD_BIT_QCOM"..0x2
    )

    void(
        "FramebufferFoveationConfigQCOM",
        "",

        GLuint.IN("fbo", ""),
        GLuint.IN("numLayers", ""),
        GLuint.IN("focalPointsPerLayer", ""),
        GLuint.IN("requestedFeatures", ""),
        Check(1)..GLuint_p.OUT("providedFeatures", "")
    )

    void(
        "FramebufferFoveationParametersQCOM",
        "",

        GLuint.IN("fbo", ""),
        GLuint.IN("layer", ""),
        GLuint.IN("focalPoint", ""),
        GLfloat.IN("focalX", ""),
        GLfloat.IN("focalY", ""),
        GLfloat.IN("gainX", ""),
        GLfloat.IN("gainY", ""),
        GLfloat.IN("foveaArea", "")
    )
}
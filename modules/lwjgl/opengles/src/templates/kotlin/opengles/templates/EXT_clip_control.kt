/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_clip_control = "EXTClipControl".nativeClassGLES("EXT_clip_control", postfix = "EXT") {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension provides additional clip control modes to configure how clip space is mapped to window space. This extension's goal is to
        ${ol(
            "allow OpenGL to effectively match Direct3D's coordinate system conventions, and",
            "potentially improve the numerical precision of the Z coordinate mapping."
        )}

        This extension is a port of GL_ARB_clip_control to OpenGL ES. For the complete overview of this extension, refer to the "Overview" section of
        {@code GL_ARB_clip_control}.
        """

    val origins = IntConstant(
        "Accepted by the {@code origin} parameter of #ClipControlEXT().",

        "LOWER_LEFT_EXT"..0x8CA1,
        "UPPER_LEFT_EXT"..0x8CA2
    ).javaDocLinks

    val depths = IntConstant(
        "Accepted by the {@code depth} parameter of #ClipControlEXT().",

        "NEGATIVE_ONE_TO_ONE_EXT"..0x935E,
        "ZERO_TO_ONE_EXT"..0x935F
    ).javaDocLinks

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "CLIP_ORIGIN_EXT"..0x935C,
        "CLIP_DEPTH_MODE_EXT"..0x935D
    )

    void(
        "ClipControlEXT",
        "",

        GLenum("origin", "", origins),
        GLenum("depth", "", depths)
    )
}
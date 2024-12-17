/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_clip_control = "EXTClipControl".nativeClassGLES("EXT_clip_control", postfix = "EXT") {
    IntConstant(
        "LOWER_LEFT_EXT"..0x8CA1,
        "UPPER_LEFT_EXT"..0x8CA2
    )

    IntConstant(
        "NEGATIVE_ONE_TO_ONE_EXT"..0x935E,
        "ZERO_TO_ONE_EXT"..0x935F
    )

    IntConstant(
        "CLIP_ORIGIN_EXT"..0x935C,
        "CLIP_DEPTH_MODE_EXT"..0x935D
    )

    void(
        "ClipControlEXT",

        GLenum("origin"),
        GLenum("depth")
    )
}
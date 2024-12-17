/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_clip_control = "ARBClipControl".nativeClassGL("ARB_clip_control") {
    IntConstant(
        "LOWER_LEFT"..0x8CA1,
        "UPPER_LEFT"..0x8CA2
    )

    IntConstant(
        "NEGATIVE_ONE_TO_ONE"..0x935E,
        "ZERO_TO_ONE"..0x935F
    )

    IntConstant(
        "CLIP_ORIGIN"..0x935C,
        "CLIP_DEPTH_MODE"..0x935D
    )

    reuse(GL45C, "ClipControl")
}
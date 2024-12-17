/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_window_rectangles = "EXTWindowRectangles".nativeClassGLES("EXT_window_rectangles", postfix = EXT) {
    IntConstant(
        "INCLUSIVE_EXT"..0x8F10,
        "EXCLUSIVE_EXT"..0x8F11
    )

    IntConstant(
        "WINDOW_RECTANGLE_EXT"..0x8F12
    )

    IntConstant(
        "WINDOW_RECTANGLE_MODE_EXT"..0x8F13,
        "MAX_WINDOW_RECTANGLES_EXT"..0x8F14,
        "NUM_WINDOW_RECTANGLES_EXT"..0x8F15
    )

    void(
        "WindowRectanglesEXT",

        GLenum("mode"),
        AutoSize(4, "box")..GLsizei("count"),
        nullable..GLint.const.p("box")
    )
}
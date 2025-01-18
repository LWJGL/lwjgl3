/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

val SDL_pen = "SDLPen".nativeClassSDL("SDL_pen") {
    IntConstant("PEN_MOUSEID".."-2")
    LongConstant("PEN_TOUCHID".."-2L")

    IntConstant(
        "PEN_INPUT_DOWN".."(1 << 0)",
        "PEN_INPUT_BUTTON_1".."(1 << 1)",
        "PEN_INPUT_BUTTON_2".."(1 << 2)",
        "PEN_INPUT_BUTTON_3".."(1 << 3)",
        "PEN_INPUT_BUTTON_4".."(1 << 4)",
        "PEN_INPUT_BUTTON_5".."(1 << 5)",
        "PEN_INPUT_ERASER_TIP".."(1 << 30)"
    )

    EnumConstant(
        "PEN_AXIS_PRESSURE".enum("0"),
        "PEN_AXIS_XTILT".enum,
        "PEN_AXIS_YTILT".enum,
        "PEN_AXIS_DISTANCE".enum,
        "PEN_AXIS_ROTATION".enum,
        "PEN_AXIS_SLIDER".enum,
        "PEN_AXIS_TANGENTIAL_PRESSURE".enum,
        "PEN_AXIS_COUNT".enum
    )
}
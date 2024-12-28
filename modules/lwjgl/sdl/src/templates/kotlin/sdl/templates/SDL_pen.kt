/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

fun SDL_pen() = SDL.apply {

    IntConstant("PEN_INPUT_DOWN".."(1 << 0)")
    IntConstant("PEN_INPUT_BUTTON_1".."(1 << 1)")
    IntConstant("PEN_INPUT_BUTTON_2".."(1 << 2)")
    IntConstant("PEN_INPUT_BUTTON_3".."(1 << 3)")
    IntConstant("PEN_INPUT_BUTTON_4".."(1 << 4)")
    IntConstant("PEN_INPUT_BUTTON_5".."(1 << 5)")
    IntConstant("PEN_INPUT_ERASER_TIP".."(1 << 30)")

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

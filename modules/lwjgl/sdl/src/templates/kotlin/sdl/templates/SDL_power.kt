/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

fun SDL_power() = SDL.apply {

    EnumConstant(
        "POWERSTATE_ERROR".enum("-1"),
        "POWERSTATE_UNKNOWN".enum,
        "POWERSTATE_ON_BATTERY".enum,
        "POWERSTATE_NO_BATTERY".enum,
        "POWERSTATE_CHARGING".enum,
        "POWERSTATE_CHARGED".enum
    )

    SDL_PowerState(
        "GetPowerInfo",

        nullable..Check(1)..int.p("seconds"),
        nullable..Check(1)..int.p("percent")
    )

}

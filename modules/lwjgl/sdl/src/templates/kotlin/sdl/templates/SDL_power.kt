/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

val SDL_power = "SDLPower".nativeClassSDL("SDL_power") {
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

        Check(1)..nullable..int.p("seconds"),
        Check(1)..nullable..int.p("percent")
    )
}
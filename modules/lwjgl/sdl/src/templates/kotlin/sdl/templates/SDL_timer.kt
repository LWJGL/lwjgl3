/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

val SDL_timer = "SDLTimer".nativeClassSDL("SDL_timer") {
    IntConstant(
        "MS_PER_SECOND".."1000",
        "US_PER_SECOND".."1000000"
    )

    LongConstant("NS_PER_SECOND".."1000000000L")

    IntConstant(
        "NS_PER_MS".."1000000",
        "NS_PER_US".."1000"
    )

    Uint64("GetTicks", void())
    Uint64("GetTicksNS", void())

    Uint64("GetPerformanceCounter", void())
    Uint64("GetPerformanceFrequency", void())

    void("Delay", Uint32("ms"))
    void("DelayNS", Uint64("ns"))
    void("DelayPrecise", Uint64("ns"))

    SDL_TimerID(
        "AddTimer",

        Uint32("interval"),
        SDL_TimerCallback("callback"),
        nullable..opaque_p("userdata")
    )

    SDL_TimerID(
        "AddTimerNS",

        Uint64("interval"),
        SDL_NSTimerCallback("callback"),
        nullable..opaque_p("userdata")
    )

    bool("RemoveTimer", SDL_TimerID("id"))

    macro(expression = "S * SDL_NS_PER_SECOND")..Uint64("SECONDS_TO_NS", Uint64("S"))
    macro(expression = "NS / SDL_NS_PER_SECOND")..Uint64("NS_TO_SECONDS", Uint64("NS"))
    macro(expression = "MS * SDL_NS_PER_MS")..Uint64("MS_TO_NS", Uint64("MS"))
    macro(expression = "NS / SDL_NS_PER_MS")..Uint64("NS_TO_MS", Uint64("NS"))
    macro(expression = "US * SDL_NS_PER_US")..Uint64("US_TO_NS", Uint64("US"))
    macro(expression = "NS / SDL_NS_PER_US")..Uint64("NS_TO_US", Uint64("NS"))
}

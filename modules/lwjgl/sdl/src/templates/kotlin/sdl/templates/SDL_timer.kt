/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

fun SDL_timer() = SDL.apply {

    IntConstant("MS_PER_SECOND".."1000")
    IntConstant("US_PER_SECOND".."1000000")
    LongConstant("NS_PER_SECOND".."1000000000")
    IntConstant("NS_PER_MS".."1000000")
    IntConstant("NS_PER_US".."1000")

    Uint64(
        "GetTicks",

        void()
    )

    Uint64(
        "GetTicksNS",

        void()
    )

    Uint64(
        "GetPerformanceCounter",

        void()
    )

    Uint64(
        "GetPerformanceFrequency",

        void()
    )

    void(
        "Delay",

        Uint32("ms")
    )

    void(
        "DelayNS",

        Uint64("ns")
    )

    void(
        "DelayPrecise",

        Uint64("ns")
    )

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

    bool(
        "RemoveTimer",

        SDL_TimerID("id")
    )

    macro(expression = "S * SDL_NS_PER_SECOND")..Uint64(
        "SDL_SECONDS_TO_NS",
        Uint64("S"),
        noPrefix = true
    )
    macro(expression = "NS / SDL_NS_PER_SECOND")..Uint64(
        "SDL_NS_TO_SECONDS",
        Uint64("NS"),
        noPrefix = true
    )
    macro(expression = "MS * SDL_NS_PER_MS")..Uint64(
        "SDL_MS_TO_NS",
        Uint64("MS"),
        noPrefix = true
    )
    macro(expression = "NS / SDL_NS_PER_MS")..Uint64(
        "SDL_NS_TO_MS",
        Uint64("NS"),
        noPrefix = true
    )
    macro(expression = "US * SDL_NS_PER_US")..Uint64(
        "SDL_US_TO_NS",
        Uint64("US"),
        noPrefix = true
    )
    macro(expression = "NS / SDL_NS_PER_US")..Uint64(
        "SDL_NS_TO_US",
        Uint64("NS"),
        noPrefix = true
    )
}

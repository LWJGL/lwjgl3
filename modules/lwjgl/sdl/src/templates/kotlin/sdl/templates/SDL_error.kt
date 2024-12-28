/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

val SDL_error = "SDLError".nativeClassSDL("SDL_error") {
    bool(
        "SetError",

        charUTF8.const.p("fmt")
    )

    bool(
        "SetErrorV",

        charUTF8.const.p("fmt"),
        va_list("ap")
    )

    bool("OutOfMemory", void())

    charUTF8.const.p("GetError", void())

    bool("ClearError", void())
}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

fun SDL_error() = SDL.apply {
    _Bool(
        "SetError",

        charUTF8.const.p("fmt")
    )

    _Bool(
        "SetErrorV",

        charUTF8.const.p("fmt"),
        va_list("ap")
    )

    _Bool(
        "OutOfMemory",

        void()
    )

    charUTF8.const.p(
        "GetError",

        void()
    )

    _Bool(
        "ClearError",

        void()
    )
}

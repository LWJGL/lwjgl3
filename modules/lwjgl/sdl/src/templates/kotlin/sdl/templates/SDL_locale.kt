/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

fun SDL_locale() = SDL.apply {
    SDL_Locale.p.p(
        "GetPreferredLocales",

        AutoSizeResult..int.p("count")
    )
}
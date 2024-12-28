/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

val SDL_locale = "SDLLocale".nativeClassSDL("SDL_locale") {
    SDL_Locale.p.p(
        "GetPreferredLocales",

        AutoSizeResult..int.p("count")
    )
}
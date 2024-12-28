/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

val SDL_loadso = "SDLLoadSO".nativeClassSDL("SDL_loadso") {
    SDL_SharedObject.p(
        "LoadObject",

        charUTF8.const.p("sofile")
    )

    SDL_FunctionPointer(
        "LoadFunction",

        SDL_SharedObject.p("handle"),
        charASCII.p("name")
    )

    void(
        "UnloadObject",

        SDL_SharedObject.p("handle")
    )
}
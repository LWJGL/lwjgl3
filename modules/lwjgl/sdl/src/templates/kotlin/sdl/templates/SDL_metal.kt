/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

val SDL_metal = "SDL_metal".nativeClassSDL {
    SDL_MetalView(
        "Metal_CreateView",

        SDL_Window.p("window")
    )

    void(
        "Metal_DestroyView",

        SDL_MetalView("view")
    )

    opaque_p(
        "Metal_GetLayer",

        SDL_MetalView("view")
    )
}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

val SDL_misc = "SDLMisc".nativeClassSDL("SDL_misc") {
    bool("OpenURL", charUTF8.const.p("url"))
}
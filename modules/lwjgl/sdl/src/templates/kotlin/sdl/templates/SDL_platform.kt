/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

val SDL_platform = "SDLPlatform".nativeClassSDL("SDL_platform") {
    charASCII.const.p("GetPlatform", void())
}
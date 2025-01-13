/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

fun SDL_platform() = SDL.apply {

    charUTF8.const.p(
        "GetPlatform",

        void()
    )

}

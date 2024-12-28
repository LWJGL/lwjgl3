/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

fun SDL_misc() = SDL.apply {

    _Bool(
        "OpenURL",

        charUTF8.const.p("url")
    )

}

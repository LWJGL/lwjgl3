/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

fun SDL_guid() = SDL.apply {
    void(
        "GUIDToString",

        SDL_GUID("guid"),
        charASCII.p("pszGUID"),
        int("cbGUID")
    )

    SDL_GUID(
        "StringToGUID",

        charASCII.const.p("pchGUID")
    )

}

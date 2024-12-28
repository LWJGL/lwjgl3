/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

val SDL_guid = "SDLGUID".nativeClassSDL("SDL_guid") {
    void(
        "GUIDToString",

        SDL_GUID("guid"),
        Check("33")..char.p("pszGUID"),
        AutoSize("pszGUID")..int("cbGUID")
    )

    SDL_GUID(
        "StringToGUID",

        charASCII.const.p("pchGUID")
    )
}
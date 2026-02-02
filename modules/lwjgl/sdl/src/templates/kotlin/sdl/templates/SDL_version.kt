/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

val SDL_version = "SDLVersion".nativeClassSDL("SDL_version") {
    IntConstant("MAJOR_VERSION".."3")
    IntConstant("MINOR_VERSION".."4")
    IntConstant("MICRO_VERSION".."1")

    int("GetVersion", void())
    charASCII.const.p("GetRevision", void())

    macro(expression = "(major) * 1000000 + (minor) * 1000 + patch")..uint32_t(
        "VERSIONNUM",

        uint32_t("major"),
        uint32_t("minor"),
        uint32_t("patch")
    )

    macro(expression = "version / 1000000")..uint32_t("VERSIONNUM_MAJOR", uint32_t("version"))
    macro(expression = "(version / 1000) % 1000")..uint32_t("VERSIONNUM_MINOR", uint32_t("version"))
    macro(expression = "version % 1000")..uint32_t("VERSIONNUM_MICRO", uint32_t("version"))

    IntConstant("VERSION".."SDL_VERSIONNUM(SDL_MAJOR_VERSION, SDL_MINOR_VERSION, SDL_MICRO_VERSION)")

    macro(expression = "SDL_VERSION >= SDL_VERSIONNUM(X, Y, Z)")..bool(
        "VERSION_ATLEAST",

        uint32_t("X"),
        uint32_t("Y"),
        uint32_t("Z")
    )
}

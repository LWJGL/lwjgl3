/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

fun SDL_version() = SDL.apply {
    IntConstant("MAJOR_VERSION".."3")
    IntConstant("MINOR_VERSION".."1")
    IntConstant("MICRO_VERSION".."8")

    int(
        "GetVersion",

        void()
    )

    charASCII.const.p(
        "GetRevision",

        void()
    )

    macro(expression = "((major) * 1000000 + (minor) * 1000 + (patch))")..uint32_t(
        "SDL_VERSIONNUM",

        uint32_t("major"),
        uint32_t("minor"),
        uint32_t("patch"),

        noPrefix = true
    )

    macro(expression = "((version) / 1000000)")..uint32_t(
        "SDL_VERSIONNUM_MAJOR",
        uint32_t("version"),
        noPrefix = true
    )

    macro(expression = "(((version) / 1000) % 1000)")..uint32_t(
        "SDL_VERSIONNUM_MINOR",
        uint32_t("version"),
        noPrefix = true
    )

    macro(expression = "((version) % 1000)")..uint32_t(
        "SDL_VERSIONNUM_MICRO",
        uint32_t("version"),
        noPrefix = true
    )

    IntConstant("VERSION".."SDL_VERSIONNUM(SDL_MAJOR_VERSION, SDL_MINOR_VERSION, SDL_MICRO_VERSION)")

    macro(expression = "(SDL_VERSION >= SDL_VERSIONNUM(X, Y, Z))")..bool(
        "SDL_VERSION_ATLEAST",

        uint32_t("X"),
        uint32_t("Y"),
        uint32_t("Z"),

        noPrefix = true
    )
}

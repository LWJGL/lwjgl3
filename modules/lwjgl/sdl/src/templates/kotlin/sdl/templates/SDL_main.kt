/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import core.windows.HINSTANCE
import org.lwjgl.generator.*
import sdl.*

val SDL_main = "SDLMain".nativeClassSDL("SDL_main") {
    void(
        "SetMainReady",

        void()
    )

    int(
        "RunApp",

        AutoSize("argv")..int("argc"),
        nullable..char.p.p("argv"),
        SDL_main_func("mainFunction"),
        nullable..opaque_p("reserved")
    )

    int(
        "EnterAppMainCallbacks",

        AutoSize("argv")..int("argc"),
        nullable..char.p.p("argv"),
        SDL_AppInit_func("appinit"),
        SDL_AppIterate_func("appiter"),
        SDL_AppEvent_func("appevent"),
        SDL_AppQuit_func("appquit")
    )

    // Windows-only
    IgnoreMissing..bool(
        "SDL_RegisterApp",

        nullable..charUTF8.p("name"),
        Uint32("style"),
        nullable..HINSTANCE("hInst")
    )

    IgnoreMissing..void(
        "SDL_UnregisterApp",

        void()
    )
}

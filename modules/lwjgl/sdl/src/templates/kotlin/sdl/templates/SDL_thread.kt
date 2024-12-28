/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

val SDL_thread = "SDLThread".nativeClassSDL("SDL_thread") {
    opaque_p(
        "GetTLS",

        Check(1)..SDL_TLSID.p("id")
    )

    bool(
        "SetTLS",

        Check(1)..SDL_TLSID.p("id"),
        nullable..opaque_p("value"),
        nullable..SDL_TLSDestructorCallback("destructor")
    )

    void("CleanupTLS", void())
}
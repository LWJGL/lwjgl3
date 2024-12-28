/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

val SDL_clipboard = "SDLClipboard".nativeClassSDL("SDL_clipboard") {
    javaImport("static org.lwjgl.sdl.SDLStdinc.*")

    bool(
        "SetClipboardText",

        charUTF8.const.p("text")
    )

    SDLFreeResult..charUTF8.p(
        "GetClipboardText",

        void()
    )

    bool(
        "HasClipboardText",

        void()
    )

    bool(
        "SetPrimarySelectionText",

        charUTF8.const.p("text")
    )

    SDLFreeResult..charUTF8.p(
        "GetPrimarySelectionText",

        void()
    )

    bool(
        "HasPrimarySelectionText",

        void()
    )

    bool(
        "SetClipboardData",

        SDL_ClipboardDataCallback("callback"),
        SDL_ClipboardCleanupCallback("cleanup"),
        nullable..opaque_p("userdata"),
        charASCII.const.p.p("mime_types"),
        AutoSize("mime_types")..size_t("num_mime_types")
    )

    bool(
        "ClearClipboardData",

        void()
    )

    void.p(
        "GetClipboardData",

        charASCII.const.p("mime_type"),
        AutoSizeResult..size_t.p("size")
    )

    bool(
        "HasClipboardData",

        charASCII.const.p("mime_type")
    )

    charASCII.p.p(
        "GetClipboardMimeTypes",

        AutoSizeResult..size_t.p("num_mime_types")
    )
}
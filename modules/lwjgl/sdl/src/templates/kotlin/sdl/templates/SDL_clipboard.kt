/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

fun SDL_clipboard() = SDL.apply {
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
        charUTF8.const.p.p("mime_types"),
        AutoSize("mime_types")..size_t("num_mime_types")
    )

    bool(
        "ClearClipboardData",

        void()
    )

    void.p(
        "GetClipboardData",

        charUTF8.const.p("mime_type"),
        AutoSizeResult..size_t.p("size")
    )

    bool(
        "HasClipboardData",

        charUTF8.const.p("mime_type")
    )

    charUTF8.p.p(
        "GetClipboardMimeTypes",

        AutoSizeResult..size_t.p("num_mime_types")
    )

}

/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

val SDL_messagebox = "SDLMessageBox".nativeClassSDL("SDL_messagebox") {
    IntConstant(
        "MESSAGEBOX_ERROR".."0x00000010",
        "MESSAGEBOX_WARNING".."0x00000020",
        "MESSAGEBOX_INFORMATION".."0x00000040",
        "MESSAGEBOX_BUTTONS_LEFT_TO_RIGHT".."0x00000080",
        "MESSAGEBOX_BUTTONS_RIGHT_TO_LEFT".."0x00000100"
    )

    IntConstant(
        "MESSAGEBOX_BUTTON_RETURNKEY_DEFAULT".."0x00000001",
        "MESSAGEBOX_BUTTON_ESCAPEKEY_DEFAULT".."0x00000002"
    )

    EnumConstant(
        "MESSAGEBOX_COLOR_BACKGROUND".enum(0),
        "MESSAGEBOX_COLOR_TEXT".enum,
        "MESSAGEBOX_COLOR_BUTTON_BORDER".enum,
        "MESSAGEBOX_COLOR_BUTTON_BACKGROUND".enum,
        "MESSAGEBOX_COLOR_BUTTON_SELECTED".enum,
        "MESSAGEBOX_COLOR_COUNT".enum
    )

    bool(
        "ShowMessageBox",

        SDL_MessageBoxData.const.p("messageboxdata"),
        Check(1)..nullable..int.p("buttonid")
    )

    bool(
        "ShowSimpleMessageBox",

        SDL_MessageBoxFlags("flags"),
        charUTF8.const.p("title"),
        charUTF8.const.p("message"),
        nullable..SDL_Window.p("window")
    )

}

/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

val SDL_tray = "SDLTray".nativeClassSDL("SDL_tray") {
    IntConstant(
        "TRAYENTRY_BUTTON".."0x00000001",
        "TRAYENTRY_CHECKBOX".."0x00000002",
        "TRAYENTRY_SUBMENU".."0x00000004",
        "TRAYENTRY_DISABLED".."0x80000000",
        "TRAYENTRY_CHECKED".."0x40000000"
    )

    SDL_Tray.p(
        "CreateTray",

        nullable..Check(1)..SDL_Surface.p("icon"),
        nullable..charUTF8.const.p("tooltip")
    )

    void(
        "SetTrayIcon",

        SDL_Tray.p("tray"),
        nullable..SDL_Surface.p("icon")
    )

    void(
        "SetTrayTooltip",

        SDL_Tray.p("tray"),
        nullable..charUTF8.const.p("tooltip")
    )

    SDL_TrayMenu.p(
        "CreateTrayMenu",

        SDL_Tray.p("tray")
    )

    SDL_TrayMenu.p(
        "CreateTraySubmenu",

        SDL_TrayEntry.p("entry")
    )

    SDL_TrayMenu.p(
        "GetTrayMenu",

        SDL_Tray.p("tray")
    )

    SDL_TrayMenu.p(
        "GetTraySubmenu",

        SDL_TrayEntry.p("entry")
    )

    SDL_TrayEntry.const.p.p(
        "GetTrayEntries",

        SDL_TrayMenu.p("menu"),
        AutoSizeResult..int.p("count")
    )

    void(
        "RemoveTrayEntry",

        SDL_TrayEntry.p("entry")
    )

    SDL_TrayEntry.p(
        "InsertTrayEntryAt",

        SDL_TrayMenu.p("menu"),
        int("pos"),
        nullable..charUTF8.const.p("label"),
        SDL_TrayEntryFlags("flags")
    )

    void(
        "SetTrayEntryLabel",

        SDL_TrayEntry.p("entry"),
        nullable..charUTF8.const.p("label")
    )

    charUTF8.const.p(
        "GetTrayEntryLabel",

        SDL_TrayEntry.p("entry")
    )

    void(
        "SetTrayEntryChecked",

        SDL_TrayEntry.p("entry"),
        bool("checked")
    )

    bool(
        "GetTrayEntryChecked",

        SDL_TrayEntry.p("entry")
    )

    void(
        "SetTrayEntryEnabled",

        SDL_TrayEntry.p("entry"),
        bool("enabled")
    )

    bool(
        "GetTrayEntryEnabled",

        SDL_TrayEntry.p("entry")
    )

    void(
        "SetTrayEntryCallback",

        SDL_TrayEntry.p("entry"),
        nullable..SDL_TrayCallback("callback"),
        nullable..opaque_p("userdata")
    )

    void(
        "ClickTrayEntry",

        SDL_TrayEntry.p("entry")
    )

    void(
        "DestroyTray",

        SDL_Tray.p("tray")
    )

    SDL_TrayMenu.p(
        "GetTrayEntryParent",

        SDL_TrayEntry.p("entry")
    )

    SDL_TrayEntry.p(
        "GetTrayMenuParentEntry",

        SDL_TrayMenu.p("menu")
    )

    SDL_Tray.p(
        "GetTrayMenuParentTray",

        SDL_TrayMenu.p("menu")
    )

    void(
        "UpdateTrays",

        void()
    )
}
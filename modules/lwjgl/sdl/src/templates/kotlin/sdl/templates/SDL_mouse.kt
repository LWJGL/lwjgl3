/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

fun SDL_mouse() = SDL.apply {

    IntConstant("BUTTON_LEFT".."1")
    IntConstant("BUTTON_MIDDLE".."2")
    IntConstant("BUTTON_RIGHT".."3")
    IntConstant("BUTTON_X1".."4")
    IntConstant("BUTTON_X2".."5")

    EnumConstant(
        "SYSTEM_CURSOR_DEFAULT".enum("0"),
        "SYSTEM_CURSOR_TEXT".enum,
        "SYSTEM_CURSOR_WAIT".enum,
        "SYSTEM_CURSOR_CROSSHAIR".enum,
        "SYSTEM_CURSOR_PROGRESS".enum,
        "SYSTEM_CURSOR_NWSE_RESIZE".enum,
        "SYSTEM_CURSOR_NESW_RESIZE".enum,
        "SYSTEM_CURSOR_EW_RESIZE".enum,
        "SYSTEM_CURSOR_NS_RESIZE".enum,
        "SYSTEM_CURSOR_MOVE".enum,
        "SYSTEM_CURSOR_NOT_ALLOWED".enum,
        "SYSTEM_CURSOR_POINTER".enum,
        "SYSTEM_CURSOR_NW_RESIZE".enum,
        "SYSTEM_CURSOR_N_RESIZE".enum,
        "SYSTEM_CURSOR_NE_RESIZE".enum,
        "SYSTEM_CURSOR_E_RESIZE".enum,
        "SYSTEM_CURSOR_SE_RESIZE".enum,
        "SYSTEM_CURSOR_S_RESIZE".enum,
        "SYSTEM_CURSOR_SW_RESIZE".enum,
        "SYSTEM_CURSOR_W_RESIZE".enum,
        "SYSTEM_CURSOR_COUNT".enum
    )

    EnumConstant(
        "MOUSEWHEEL_NORMAL".enum("0"),
        "MOUSEWHEEL_FLIPPED".enum
    )

    _Bool(
        "HasMouse",

        void()
    )

    SDL_MouseID.p(
        "GetMice",

        AutoSizeResult..int.p("count")
    )

    charUTF8.const.p(
        "GetMouseNameForID",

        SDL_MouseID("instance_id")
    )

    SDL_Window.p(
        "GetMouseFocus",

        void()
    )

    SDL_MouseButtonFlags(
        "GetMouseState",

        Check(1)..float.p("x"),
        Check(1)..float.p("y")
    )

    SDL_MouseButtonFlags(
        "GetGlobalMouseState",

        Check(1)..float.p("x"),
        Check(1)..float.p("y")
    )

    SDL_MouseButtonFlags(
        "GetRelativeMouseState",

        Check(1)..float.p("x"),
        Check(1)..float.p("y")
    )

    void(
        "WarpMouseInWindow",

        SDL_Window.p("window"),
        float("x"),
        float("y")
    )

    _Bool(
        "WarpMouseGlobal",

        float("x"),
        float("y")
    )

    _Bool(
        "SetWindowRelativeMouseMode",

        SDL_Window.p("window"),
        _Bool("enabled")
    )

    _Bool(
        "GetWindowRelativeMouseMode",

        SDL_Window.p("window")
    )

    _Bool(
        "CaptureMouse",

        _Bool("enabled")
    )

    SDL_Cursor.p(
        "CreateCursor",

        Check("w*h/8")..Uint8.const.p("data"),
        Check("w*h/8")..Uint8.const.p("mask"),
        int("w"),
        int("h"),
        int("hot_x"),
        int("hot_y")
    )

    SDL_Cursor.p(
        "CreateColorCursor",

        Check(1)..SDL_Surface.p("surface"),
        int("hot_x"),
        int("hot_y")
    )

    SDL_Cursor.p(
        "CreateSystemCursor",

        SDL_SystemCursor("id")
    )

    _Bool(
        "SetCursor",

        SDL_Cursor.p("cursor")
    )

    SDL_Cursor.p(
        "GetCursor",

        void()
    )

    SDL_Cursor.p(
        "GetDefaultCursor",

        void()
    )

    void(
        "DestroyCursor",

        SDL_Cursor.p("cursor")
    )

    _Bool(
        "ShowCursor",

        void()
    )

    _Bool(
        "HideCursor",

        void()
    )

    _Bool(
        "CursorVisible",

        void()
    )

}

/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

val SDL_mouse = "SDLMouse".nativeClassSDL("SDL_mouse") {
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

    IntConstant(
        "BUTTON_LEFT".."1",
        "BUTTON_MIDDLE".."2",
        "BUTTON_RIGHT".."3",
        "BUTTON_X1".."4",
        "BUTTON_X2".."5"
    )

    IntConstant(
        "BUTTON_LMASK".."SDL_BUTTON_MASK(SDL_BUTTON_LEFT)",
        "BUTTON_MMASK".."SDL_BUTTON_MASK(SDL_BUTTON_MIDDLE)",
        "BUTTON_RMASK".."SDL_BUTTON_MASK(SDL_BUTTON_RIGHT)",
        "BUTTON_X1MASK".."SDL_BUTTON_MASK(SDL_BUTTON_X1)",
        "BUTTON_X2MASK".."SDL_BUTTON_MASK(SDL_BUTTON_X2)"
    )

    bool("HasMouse", void())

    SDL_MouseID.p(
        "GetMice",

        AutoSizeResult..int.p("count")
    )

    charUTF8.const.p(
        "GetMouseNameForID",

        SDL_MouseID("instance_id")
    )

    SDL_Window.p("GetMouseFocus", void())

    SDL_MouseButtonFlags(
        "GetMouseState",

        Check(1)..nullable..float.p("x"),
        Check(1)..nullable..float.p("y")
    )

    SDL_MouseButtonFlags(
        "GetGlobalMouseState",

        Check(1)..nullable..float.p("x"),
        Check(1)..nullable..float.p("y")
    )

    SDL_MouseButtonFlags(
        "GetRelativeMouseState",

        Check(1)..nullable..float.p("x"),
        Check(1)..nullable..float.p("y")
    )

    void(
        "WarpMouseInWindow",

        nullable..SDL_Window.p("window"),
        float("x"),
        float("y")
    )

    bool(
        "WarpMouseGlobal",

        float("x"),
        float("y")
    )

    bool(
        "SetWindowRelativeMouseMode",

        SDL_Window.p("window"),
        bool("enabled")
    )

    bool(
        "GetWindowRelativeMouseMode",

        SDL_Window.p("window")
    )

    bool(
        "CaptureMouse",

        bool("enabled")
    )

    SDL_Cursor.p(
        "CreateCursor",

        Check("(w * h) >> 3")..Uint8.const.p("data"),
        Check("(w * h) >> 3")..Uint8.const.p("mask"),
        int("w"),
        int("h"),
        int("hot_x"),
        int("hot_y")
    )

    SDL_Cursor.p(
        "CreateColorCursor",

        SDL_Surface.p("surface"),
        int("hot_x"),
        int("hot_y")
    )

    SDL_Cursor.p(
        "CreateSystemCursor",

        SDL_SystemCursor("id")
    )

    bool(
        "SetCursor",

        SDL_Cursor.p("cursor")
    )

    SDL_Cursor.p("GetCursor", void())
    SDL_Cursor.p("GetDefaultCursor", void())

    void(
        "DestroyCursor",

        SDL_Cursor.p("cursor")
    )

    bool("ShowCursor", void())
    bool("HideCursor", void())
    bool("CursorVisible", void())

    private..macro(expression = "1 << (X - 1)")..uint32_t(
        "BUTTON_MASK",

        uint32_t("X")
    )
}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

val SDL_keyboard = "SDLKeyboard".nativeClassSDL("SDL_keyboard") {
    EnumConstant(
        "TEXTINPUT_TYPE_TEXT".enum("0"),
        "TEXTINPUT_TYPE_TEXT_NAME".enum,
        "TEXTINPUT_TYPE_TEXT_EMAIL".enum,
        "TEXTINPUT_TYPE_TEXT_USERNAME".enum,
        "TEXTINPUT_TYPE_TEXT_PASSWORD_HIDDEN".enum,
        "TEXTINPUT_TYPE_TEXT_PASSWORD_VISIBLE".enum,
        "TEXTINPUT_TYPE_NUMBER".enum,
        "TEXTINPUT_TYPE_NUMBER_PASSWORD_HIDDEN".enum,
        "TEXTINPUT_TYPE_NUMBER_PASSWORD_VISIBLE".enum
    )

    EnumConstant(
        "CAPITALIZE_NONE".enum("0"),
        "CAPITALIZE_SENTENCES".enum,
        "CAPITALIZE_WORDS".enum,
        "CAPITALIZE_LETTERS".enum
    )

    StringConstant(
        "PROP_TEXTINPUT_TYPE_NUMBER".."SDL.textinput.type",
        "PROP_TEXTINPUT_CAPITALIZATION_NUMBER".."SDL.textinput.capitalization",
        "PROP_TEXTINPUT_AUTOCORRECT_BOOLEAN".."SDL.textinput.autocorrect",
        "PROP_TEXTINPUT_MULTILINE_BOOLEAN".."SDL.textinput.multiline",
        "PROP_TEXTINPUT_ANDROID_INPUTTYPE_NUMBER".."SDL.textinput.android.inputtype"
    )

    bool("HasKeyboard", void())

    SDL_KeyboardID.p(
        "GetKeyboards",

        AutoSizeResult..int.p("count")
    )

    charUTF8.const.p(
        "GetKeyboardNameForID",

        SDL_KeyboardID("instance_id")
    )

    SDL_Window.p(
        "GetKeyboardFocus",

        void()
    )

    bool.const.p(
        "GetKeyboardState",

        AutoSizeResult..int.p("numkeys")
    )

    void("ResetKeyboard", void())

    SDL_Keymod("GetModState", void())
    void("SetModState", SDL_Keymod("modstate"))

    SDL_Keycode(
        "GetKeyFromScancode",

        SDL_Scancode("scancode"),
        SDL_Keymod("modstate"),
        bool("key_event")
    )

    SDL_Scancode(
        "GetScancodeFromKey",

        SDL_Keycode("key"),
        Check(1)..nullable..SDL_Keymod.p("modstate")
    )

    bool(
        "SetScancodeName",

        SDL_Scancode("scancode"),
        // Lifetime must be maintained by the application, so we can't use automatic String conversion here
        NullTerminated..char.const.p("name")
    )

    charUTF8.const.p("GetScancodeName", SDL_Scancode("scancode"))
    SDL_Scancode("GetScancodeFromName", charUTF8.const.p("name"))

    charUTF8.const.p("GetKeyName", SDL_Keycode("key"))
    SDL_Keycode("GetKeyFromName", charUTF8.const.p("name"))

    bool(
        "StartTextInput",

        SDL_Window.p("window")
    )

    bool(
        "StartTextInputWithProperties",

        SDL_Window.p("window"),
        SDL_PropertiesID("props")
    )

    bool("TextInputActive", SDL_Window.p("window"))
    bool("StopTextInput", SDL_Window.p("window"))
    bool("ClearComposition", SDL_Window.p("window"))

    bool(
        "SetTextInputArea",

        SDL_Window.p("window"),
        Check(1)..nullable..SDL_Rect.const.p("rect"),
        int("cursor")
    )

    bool(
        "GetTextInputArea",

        SDL_Window.p("window"),
        Check(1)..nullable..SDL_Rect.p("rect"),
        Check(1)..nullable..int.p("cursor")
    )

    bool("HasScreenKeyboardSupport", void())

    bool("ScreenKeyboardShown", SDL_Window.p("window"))
}
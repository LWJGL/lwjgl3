/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

// generate SDL_gamepad after SDL_joystick
fun SDL_joystick_gamepad() = SDL.apply {
    UnquotedStringConstant("PROP_GAMEPAD_CAP_MONO_LED_BOOLEAN".."SDL_PROP_JOYSTICK_CAP_MONO_LED_BOOLEAN")
    UnquotedStringConstant("PROP_GAMEPAD_CAP_RGB_LED_BOOLEAN".."SDL_PROP_JOYSTICK_CAP_RGB_LED_BOOLEAN")
    UnquotedStringConstant("PROP_GAMEPAD_CAP_PLAYER_LED_BOOLEAN".."SDL_PROP_JOYSTICK_CAP_PLAYER_LED_BOOLEAN")
    UnquotedStringConstant("PROP_GAMEPAD_CAP_RUMBLE_BOOLEAN".."SDL_PROP_JOYSTICK_CAP_RUMBLE_BOOLEAN")
    UnquotedStringConstant("PROP_GAMEPAD_CAP_TRIGGER_RUMBLE_BOOLEAN".."SDL_PROP_JOYSTICK_CAP_TRIGGER_RUMBLE_BOOLEAN")

    EnumConstant(
        "GAMEPAD_TYPE_UNKNOWN".enum("0"),
        "GAMEPAD_TYPE_STANDARD".enum,
        "GAMEPAD_TYPE_XBOX360".enum,
        "GAMEPAD_TYPE_XBOXONE".enum,
        "GAMEPAD_TYPE_PS3".enum,
        "GAMEPAD_TYPE_PS4".enum,
        "GAMEPAD_TYPE_PS5".enum,
        "GAMEPAD_TYPE_NINTENDO_SWITCH_PRO".enum,
        "GAMEPAD_TYPE_NINTENDO_SWITCH_JOYCON_LEFT".enum,
        "GAMEPAD_TYPE_NINTENDO_SWITCH_JOYCON_RIGHT".enum,
        "GAMEPAD_TYPE_NINTENDO_SWITCH_JOYCON_PAIR".enum,
        "GAMEPAD_TYPE_COUNT".enum
    )

    EnumConstant(
        "GAMEPAD_BUTTON_INVALID".enum("-1"),
        "GAMEPAD_BUTTON_SOUTH".enum,
        "GAMEPAD_BUTTON_EAST".enum,
        "GAMEPAD_BUTTON_WEST".enum,
        "GAMEPAD_BUTTON_NORTH".enum,
        "GAMEPAD_BUTTON_BACK".enum,
        "GAMEPAD_BUTTON_GUIDE".enum,
        "GAMEPAD_BUTTON_START".enum,
        "GAMEPAD_BUTTON_LEFT_STICK".enum,
        "GAMEPAD_BUTTON_RIGHT_STICK".enum,
        "GAMEPAD_BUTTON_LEFT_SHOULDER".enum,
        "GAMEPAD_BUTTON_RIGHT_SHOULDER".enum,
        "GAMEPAD_BUTTON_DPAD_UP".enum,
        "GAMEPAD_BUTTON_DPAD_DOWN".enum,
        "GAMEPAD_BUTTON_DPAD_LEFT".enum,
        "GAMEPAD_BUTTON_DPAD_RIGHT".enum,
        "GAMEPAD_BUTTON_MISC1".enum,
        "GAMEPAD_BUTTON_RIGHT_PADDLE1".enum,
        "GAMEPAD_BUTTON_LEFT_PADDLE1".enum,
        "GAMEPAD_BUTTON_RIGHT_PADDLE2".enum,
        "GAMEPAD_BUTTON_LEFT_PADDLE2".enum,
        "GAMEPAD_BUTTON_TOUCHPAD".enum,
        "GAMEPAD_BUTTON_MISC2".enum,
        "GAMEPAD_BUTTON_MISC3".enum,
        "GAMEPAD_BUTTON_MISC4".enum,
        "GAMEPAD_BUTTON_MISC5".enum,
        "GAMEPAD_BUTTON_MISC6".enum,
        "GAMEPAD_BUTTON_COUNT".enum
    )

    EnumConstant(
        "GAMEPAD_BUTTON_LABEL_UNKNOWN".enum("0"),
        "GAMEPAD_BUTTON_LABEL_A".enum,
        "GAMEPAD_BUTTON_LABEL_B".enum,
        "GAMEPAD_BUTTON_LABEL_X".enum,
        "GAMEPAD_BUTTON_LABEL_Y".enum,
        "GAMEPAD_BUTTON_LABEL_CROSS".enum,
        "GAMEPAD_BUTTON_LABEL_CIRCLE".enum,
        "GAMEPAD_BUTTON_LABEL_SQUARE".enum,
        "GAMEPAD_BUTTON_LABEL_TRIANGLE".enum
    )

    EnumConstant(
        "GAMEPAD_AXIS_INVALID".enum("-1"),
        "GAMEPAD_AXIS_LEFTX".enum,
        "GAMEPAD_AXIS_LEFTY".enum,
        "GAMEPAD_AXIS_RIGHTX".enum,
        "GAMEPAD_AXIS_RIGHTY".enum,
        "GAMEPAD_AXIS_LEFT_TRIGGER".enum,
        "GAMEPAD_AXIS_RIGHT_TRIGGER".enum,
        "GAMEPAD_AXIS_COUNT".enum
    )

    EnumConstant(
        "GAMEPAD_BINDTYPE_NONE".enum("0"),
        "GAMEPAD_BINDTYPE_BUTTON".enum,
        "GAMEPAD_BINDTYPE_AXIS".enum,
        "GAMEPAD_BINDTYPE_HAT".enum
    )

    int(
        "AddGamepadMapping",

        charUTF8.const.p("mapping")
    )

    int(
        "AddGamepadMappingsFromIO",

        SDL_IOStream.p("src"),
        _Bool("closeio")
    )

    int(
        "AddGamepadMappingsFromFile",

        charUTF8.const.p("file")
    )

    _Bool(
        "ReloadGamepadMappings",

        void()
    )

    charUTF8.p.p(
        "GetGamepadMappings",

        AutoSizeResult..int.p("count")
    )

    SDLFreeResult..charUTF8.p(
        "GetGamepadMappingForGUID",

        SDL_GUID("guid")
    )

    SDLFreeResult..charUTF8.p(
        "GetGamepadMapping",

        SDL_Gamepad.p("gamepad")
    )

    _Bool(
        "SetGamepadMapping",

        SDL_JoystickID("instance_id"),
        charUTF8.const.p("mapping")
    )

    _Bool(
        "HasGamepad",

        void()
    )

    SDL_JoystickID.p(
        "GetGamepads",

        AutoSizeResult..int.p("count")
    )

    _Bool(
        "IsGamepad",

        SDL_JoystickID("instance_id")
    )

    charUTF8.const.p(
        "GetGamepadNameForID",

        SDL_JoystickID("instance_id")
    )

    charUTF8.const.p(
        "GetGamepadPathForID",

        SDL_JoystickID("instance_id")
    )

    int(
        "GetGamepadPlayerIndexForID",

        SDL_JoystickID("instance_id")
    )

    SDL_GUID(
        "GetGamepadGUIDForID",

        SDL_JoystickID("instance_id")
    )

    Uint16(
        "GetGamepadVendorForID",

        SDL_JoystickID("instance_id")
    )

    Uint16(
        "GetGamepadProductForID",

        SDL_JoystickID("instance_id")
    )

    Uint16(
        "GetGamepadProductVersionForID",

        SDL_JoystickID("instance_id")
    )

    SDL_GamepadType(
        "GetGamepadTypeForID",

        SDL_JoystickID("instance_id")
    )

    SDL_GamepadType(
        "GetRealGamepadTypeForID",

        SDL_JoystickID("instance_id")
    )

    SDLFreeResult..charUTF8.p(
        "GetGamepadMappingForID",

        SDL_JoystickID("instance_id")
    )

    SDL_Gamepad.p(
        "OpenGamepad",

        SDL_JoystickID("instance_id")
    )

    SDL_Gamepad.p(
        "GetGamepadFromID",

        SDL_JoystickID("instance_id")
    )

    SDL_Gamepad.p(
        "GetGamepadFromPlayerIndex",

        int("player_index")
    )

    SDL_PropertiesID(
        "GetGamepadProperties",

        SDL_Gamepad.p("gamepad")
    )

    SDL_JoystickID(
        "GetGamepadID",

        SDL_Gamepad.p("gamepad")
    )

    charUTF8.const.p(
        "GetGamepadName",

        SDL_Gamepad.p("gamepad")
    )

    charUTF8.const.p(
        "GetGamepadPath",

        SDL_Gamepad.p("gamepad")
    )

    SDL_GamepadType(
        "GetGamepadType",

        SDL_Gamepad.p("gamepad")
    )

    SDL_GamepadType(
        "GetRealGamepadType",

        SDL_Gamepad.p("gamepad")
    )

    int(
        "GetGamepadPlayerIndex",

        SDL_Gamepad.p("gamepad")
    )

    _Bool(
        "SetGamepadPlayerIndex",

        SDL_Gamepad.p("gamepad"),
        int("player_index")
    )

    Uint16(
        "GetGamepadVendor",

        SDL_Gamepad.p("gamepad")
    )

    Uint16(
        "GetGamepadProduct",

        SDL_Gamepad.p("gamepad")
    )

    Uint16(
        "GetGamepadProductVersion",

        SDL_Gamepad.p("gamepad")
    )

    Uint16(
        "GetGamepadFirmwareVersion",

        SDL_Gamepad.p("gamepad")
    )

    charUTF8.const.p(
        "GetGamepadSerial",

        SDL_Gamepad.p("gamepad")
    )

    Uint64(
        "GetGamepadSteamHandle",

        SDL_Gamepad.p("gamepad")
    )

    SDL_JoystickConnectionState(
        "GetGamepadConnectionState",

        SDL_Gamepad.p("gamepad")
    )

    SDL_PowerState(
        "GetGamepadPowerInfo",

        SDL_Gamepad.p("gamepad"),
        Check(1)..int.p("percent")
    )

    _Bool(
        "GamepadConnected",

        SDL_Gamepad.p("gamepad")
    )

    SDL_Joystick.p(
        "GetGamepadJoystick",

        SDL_Gamepad.p("gamepad")
    )

    void(
        "SetGamepadEventsEnabled",

        _Bool("enabled")
    )

    _Bool(
        "GamepadEventsEnabled",

        void()
    )

    SDL_GamepadBinding.p.p(
        "GetGamepadBindings",

        SDL_Gamepad.p("gamepad"),
        AutoSizeResult..int.p("count")
    )

    void(
        "UpdateGamepads",

        void()
    )

    SDL_GamepadType(
        "GetGamepadTypeFromString",

        charUTF8.const.p("str")
    )

    charUTF8.const.p(
        "GetGamepadStringForType",

        SDL_GamepadType("type")
    )

    SDL_GamepadAxis(
        "GetGamepadAxisFromString",

        charUTF8.const.p("str")
    )

    charUTF8.const.p(
        "GetGamepadStringForAxis",

        SDL_GamepadAxis("axis")
    )

    _Bool(
        "GamepadHasAxis",

        SDL_Gamepad.p("gamepad"),
        SDL_GamepadAxis("axis")
    )

    Sint16(
        "GetGamepadAxis",

        SDL_Gamepad.p("gamepad"),
        SDL_GamepadAxis("axis")
    )

    SDL_GamepadButton(
        "GetGamepadButtonFromString",

        charUTF8.const.p("str")
    )

    charUTF8.const.p(
        "GetGamepadStringForButton",

        SDL_GamepadButton("button")
    )

    _Bool(
        "GamepadHasButton",

        SDL_Gamepad.p("gamepad"),
        SDL_GamepadButton("button")
    )

    _Bool(
        "GetGamepadButton",

        SDL_Gamepad.p("gamepad"),
        SDL_GamepadButton("button")
    )

    SDL_GamepadButtonLabel(
        "GetGamepadButtonLabelForType",

        SDL_GamepadType("type"),
        SDL_GamepadButton("button")
    )

    SDL_GamepadButtonLabel(
        "GetGamepadButtonLabel",

        SDL_Gamepad.p("gamepad"),
        SDL_GamepadButton("button")
    )

    int(
        "GetNumGamepadTouchpads",

        SDL_Gamepad.p("gamepad")
    )

    int(
        "GetNumGamepadTouchpadFingers",

        SDL_Gamepad.p("gamepad"),
        int("touchpad")
    )

    _Bool(
        "GetGamepadTouchpadFinger",

        SDL_Gamepad.p("gamepad"),
        int("touchpad"),
        int("finger"),
        nullable..Check(1).._Bool.p("down"),
        nullable..Check(1)..float.p("x"),
        nullable..Check(1)..float.p("y"),
        nullable..Check(1)..float.p("pressure")
    )

    _Bool(
        "GamepadHasSensor",

        SDL_Gamepad.p("gamepad"),
        SDL_SensorType("type")
    )

    _Bool(
        "SetGamepadSensorEnabled",

        SDL_Gamepad.p("gamepad"),
        SDL_SensorType("type"),
        _Bool("enabled")
    )

    _Bool(
        "GamepadSensorEnabled",

        SDL_Gamepad.p("gamepad"),
        SDL_SensorType("type")
    )

    float(
        "GetGamepadSensorDataRate",

        SDL_Gamepad.p("gamepad"),
        SDL_SensorType("type")
    )

    _Bool(
        "GetGamepadSensorData",

        SDL_Gamepad.p("gamepad"),
        SDL_SensorType("type"),
        float.p("data"),
        AutoSize("data")..int("num_values")
    )

    _Bool(
        "RumbleGamepad",

        SDL_Gamepad.p("gamepad"),
        Uint16("low_frequency_rumble"),
        Uint16("high_frequency_rumble"),
        Uint32("duration_ms")
    )

    _Bool(
        "RumbleGamepadTriggers",

        SDL_Gamepad.p("gamepad"),
        Uint16("left_rumble"),
        Uint16("right_rumble"),
        Uint32("duration_ms")
    )

    _Bool(
        "SetGamepadLED",

        SDL_Gamepad.p("gamepad"),
        Uint8("red"),
        Uint8("green"),
        Uint8("blue")
    )

    _Bool(
        "SendGamepadEffect",

        SDL_Gamepad.p("gamepad"),
        void.const.p("data"),
        AutoSize("data")..int("size")
    )

    void(
        "CloseGamepad",

        SDL_Gamepad.p("gamepad")
    )

    charUTF8.const.p(
        "GetGamepadAppleSFSymbolsNameForButton",

        SDL_Gamepad.p("gamepad"),
        SDL_GamepadButton("button")
    )

    charUTF8.const.p(
        "GetGamepadAppleSFSymbolsNameForAxis",

        SDL_Gamepad.p("gamepad"),
        SDL_GamepadAxis("axis")
    )

}

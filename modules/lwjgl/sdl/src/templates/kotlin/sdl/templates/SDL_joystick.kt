/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

fun SDL_joystick() = SDL.apply {

    IntConstant("JOYSTICK_AXIS_MAX".."32767")
    IntConstant("JOYSTICK_AXIS_MIN".."-32768")
    StringConstant("PROP_JOYSTICK_CAP_MONO_LED_BOOLEAN".."SDL.joystick.cap.mono_led")
    StringConstant("PROP_JOYSTICK_CAP_RGB_LED_BOOLEAN".."SDL.joystick.cap.rgb_led")
    StringConstant("PROP_JOYSTICK_CAP_PLAYER_LED_BOOLEAN".."SDL.joystick.cap.player_led")
    StringConstant("PROP_JOYSTICK_CAP_RUMBLE_BOOLEAN".."SDL.joystick.cap.rumble")
    StringConstant("PROP_JOYSTICK_CAP_TRIGGER_RUMBLE_BOOLEAN".."SDL.joystick.cap.trigger_rumble")
    IntConstant("HAT_CENTERED".."0x00")
    IntConstant("HAT_UP".."0x01")
    IntConstant("HAT_RIGHT".."0x02")
    IntConstant("HAT_DOWN".."0x04")
    IntConstant("HAT_LEFT".."0x08")
    IntConstant("HAT_RIGHTUP".."(SDL_HAT_RIGHT|SDL_HAT_UP)")
    IntConstant("HAT_RIGHTDOWN".."(SDL_HAT_RIGHT|SDL_HAT_DOWN)")
    IntConstant("HAT_LEFTUP".."(SDL_HAT_LEFT|SDL_HAT_UP)")
    IntConstant("HAT_LEFTDOWN".."(SDL_HAT_LEFT|SDL_HAT_DOWN)")

    EnumConstant(
        "JOYSTICK_TYPE_UNKNOWN".enum("0"),
        "JOYSTICK_TYPE_GAMEPAD".enum,
        "JOYSTICK_TYPE_WHEEL".enum,
        "JOYSTICK_TYPE_ARCADE_STICK".enum,
        "JOYSTICK_TYPE_FLIGHT_STICK".enum,
        "JOYSTICK_TYPE_DANCE_PAD".enum,
        "JOYSTICK_TYPE_GUITAR".enum,
        "JOYSTICK_TYPE_DRUM_KIT".enum,
        "JOYSTICK_TYPE_ARCADE_PAD".enum,
        "JOYSTICK_TYPE_THROTTLE".enum,
        "JOYSTICK_TYPE_COUNT".enum
    )

    EnumConstant(
        "JOYSTICK_CONNECTION_INVALID".enum("-1"),
        "JOYSTICK_CONNECTION_UNKNOWN".enum,
        "JOYSTICK_CONNECTION_WIRED".enum,
        "JOYSTICK_CONNECTION_WIRELESS".enum
    )

    void(
        "LockJoysticks",

        void()
    )

    void(
        "UnlockJoysticks",

        void()
    )

    _Bool(
        "HasJoystick",

        void()
    )

    SDL_JoystickID.p(
        "GetJoysticks",

        AutoSizeResult..int.p("count")
    )

    charUTF8.const.p(
        "GetJoystickNameForID",

        SDL_JoystickID("instance_id")
    )

    charUTF8.const.p(
        "GetJoystickPathForID",

        SDL_JoystickID("instance_id")
    )

    int(
        "GetJoystickPlayerIndexForID",

        SDL_JoystickID("instance_id")
    )

    SDL_GUID(
        "GetJoystickGUIDForID",

        SDL_JoystickID("instance_id")
    )

    Uint16(
        "GetJoystickVendorForID",

        SDL_JoystickID("instance_id")
    )

    Uint16(
        "GetJoystickProductForID",

        SDL_JoystickID("instance_id")
    )

    Uint16(
        "GetJoystickProductVersionForID",

        SDL_JoystickID("instance_id")
    )

    SDL_JoystickType(
        "GetJoystickTypeForID",

        SDL_JoystickID("instance_id")
    )

    SDL_Joystick.p(
        "OpenJoystick",

        SDL_JoystickID("instance_id")
    )

    SDL_Joystick.p(
        "GetJoystickFromID",

        SDL_JoystickID("instance_id")
    )

    SDL_Joystick.p(
        "GetJoystickFromPlayerIndex",

        int("player_index")
    )

    SDL_JoystickID(
        "AttachVirtualJoystick",

        Check(1)..SDL_VirtualJoystickDesc.const.p("desc")
    )

    _Bool(
        "DetachVirtualJoystick",

        SDL_JoystickID("instance_id")
    )

    _Bool(
        "IsJoystickVirtual",

        SDL_JoystickID("instance_id")
    )

    _Bool(
        "SetJoystickVirtualAxis",

        SDL_Joystick.p("joystick"),
        int("axis"),
        Sint16("value")
    )

    _Bool(
        "SetJoystickVirtualBall",

        SDL_Joystick.p("joystick"),
        int("ball"),
        Sint16("xrel"),
        Sint16("yrel")
    )

    _Bool(
        "SetJoystickVirtualButton",

        SDL_Joystick.p("joystick"),
        int("button"),
        _Bool("down")
    )

    _Bool(
        "SetJoystickVirtualHat",

        SDL_Joystick.p("joystick"),
        int("hat"),
        Uint8("value")
    )

    _Bool(
        "SetJoystickVirtualTouchpad",

        SDL_Joystick.p("joystick"),
        int("touchpad"),
        int("finger"),
        _Bool("down"),
        float("x"),
        float("y"),
        float("pressure")
    )

    _Bool(
        "SendJoystickVirtualSensorData",

        SDL_Joystick.p("joystick"),
        SDL_SensorType("type"),
        Uint64("sensor_timestamp"),
        float.const.p("data"),
        AutoSize("data")..int("num_values")
    )

    SDL_PropertiesID(
        "GetJoystickProperties",

        SDL_Joystick.p("joystick")
    )

    charUTF8.const.p(
        "GetJoystickName",

        SDL_Joystick.p("joystick")
    )

    charUTF8.const.p(
        "GetJoystickPath",

        SDL_Joystick.p("joystick")
    )

    int(
        "GetJoystickPlayerIndex",

        SDL_Joystick.p("joystick")
    )

    _Bool(
        "SetJoystickPlayerIndex",

        SDL_Joystick.p("joystick"),
        int("player_index")
    )

    SDL_GUID(
        "GetJoystickGUID",

        SDL_Joystick.p("joystick")
    )

    Uint16(
        "GetJoystickVendor",

        SDL_Joystick.p("joystick")
    )

    Uint16(
        "GetJoystickProduct",

        SDL_Joystick.p("joystick")
    )

    Uint16(
        "GetJoystickProductVersion",

        SDL_Joystick.p("joystick")
    )

    Uint16(
        "GetJoystickFirmwareVersion",

        SDL_Joystick.p("joystick")
    )

    charUTF8.const.p(
        "GetJoystickSerial",

        SDL_Joystick.p("joystick")
    )

    SDL_JoystickType(
        "GetJoystickType",

        SDL_Joystick.p("joystick")
    )

    void(
        "GetJoystickGUIDInfo",

        SDL_GUID("guid"),
        Check(1)..Uint16.p("vendor"),
        Check(1)..Uint16.p("product"),
        Check(1)..Uint16.p("version"),
        Check(1)..Uint16.p("crc16")
    )

    _Bool(
        "JoystickConnected",

        SDL_Joystick.p("joystick")
    )

    SDL_JoystickID(
        "GetJoystickID",

        SDL_Joystick.p("joystick")
    )

    int(
        "GetNumJoystickAxes",

        SDL_Joystick.p("joystick")
    )

    int(
        "GetNumJoystickBalls",

        SDL_Joystick.p("joystick")
    )

    int(
        "GetNumJoystickHats",

        SDL_Joystick.p("joystick")
    )

    int(
        "GetNumJoystickButtons",

        SDL_Joystick.p("joystick")
    )

    void(
        "SetJoystickEventsEnabled",

        _Bool("enabled")
    )

    _Bool(
        "JoystickEventsEnabled",

        void()
    )

    void(
        "UpdateJoysticks",

        void()
    )

    Sint16(
        "GetJoystickAxis",

        SDL_Joystick.p("joystick"),
        int("axis")
    )

    _Bool(
        "GetJoystickAxisInitialState",

        SDL_Joystick.p("joystick"),
        int("axis"),
        Check(1)..Sint16.p("state")
    )

    _Bool(
        "GetJoystickBall",

        SDL_Joystick.p("joystick"),
        int("ball"),
        Check(1)..int.p("dx"),
        Check(1)..int.p("dy")
    )

    Uint8(
        "GetJoystickHat",

        SDL_Joystick.p("joystick"),
        int("hat")
    )

    _Bool(
        "GetJoystickButton",

        SDL_Joystick.p("joystick"),
        int("button")
    )

    _Bool(
        "RumbleJoystick",

        SDL_Joystick.p("joystick"),
        Uint16("low_frequency_rumble"),
        Uint16("high_frequency_rumble"),
        Uint32("duration_ms")
    )

    _Bool(
        "RumbleJoystickTriggers",

        SDL_Joystick.p("joystick"),
        Uint16("left_rumble"),
        Uint16("right_rumble"),
        Uint32("duration_ms")
    )

    _Bool(
        "SetJoystickLED",

        SDL_Joystick.p("joystick"),
        Uint8("red"),
        Uint8("green"),
        Uint8("blue")
    )

    _Bool(
        "SendJoystickEffect",

        SDL_Joystick.p("joystick"),
        void.const.p("data"),
        AutoSize("data")..int("size")
    )

    void(
        "CloseJoystick",

        SDL_Joystick.p("joystick")
    )

    SDL_JoystickConnectionState(
        "GetJoystickConnectionState",

        SDL_Joystick.p("joystick")
    )

    SDL_PowerState(
        "GetJoystickPowerInfo",

        SDL_Joystick.p("joystick"),
        Check(1)..int.p("percent")
    )

}

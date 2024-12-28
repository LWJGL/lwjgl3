/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

val SDL_joystick = "SDLJoystick".nativeClassSDL("SDL_joystick") {
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

    IntConstant(
        "JOYSTICK_AXIS_MAX".."32767",
        "JOYSTICK_AXIS_MIN".."-32768"
    )

    StringConstant(
        "PROP_JOYSTICK_CAP_MONO_LED_BOOLEAN".."SDL.joystick.cap.mono_led",
        "PROP_JOYSTICK_CAP_RGB_LED_BOOLEAN".."SDL.joystick.cap.rgb_led",
        "PROP_JOYSTICK_CAP_PLAYER_LED_BOOLEAN".."SDL.joystick.cap.player_led",
        "PROP_JOYSTICK_CAP_RUMBLE_BOOLEAN".."SDL.joystick.cap.rumble",
        "PROP_JOYSTICK_CAP_TRIGGER_RUMBLE_BOOLEAN".."SDL.joystick.cap.trigger_rumble"
    )

    IntConstant(
        "HAT_CENTERED".."0x00",
        "HAT_UP".."0x01",
        "HAT_RIGHT".."0x02",
        "HAT_DOWN".."0x04",
        "HAT_LEFT".."0x08",
        "HAT_RIGHTUP".."(SDL_HAT_RIGHT|SDL_HAT_UP)",
        "HAT_RIGHTDOWN".."(SDL_HAT_RIGHT|SDL_HAT_DOWN)",
        "HAT_LEFTUP".."(SDL_HAT_LEFT|SDL_HAT_UP)",
        "HAT_LEFTDOWN".."(SDL_HAT_LEFT|SDL_HAT_DOWN)"
    )

    void("LockJoysticks", void())
    void("UnlockJoysticks", void())

    bool("HasJoystick", void())

    SDL_JoystickID.p(
        "GetJoysticks",

        AutoSizeResult..int.p("count")
    )

    charUTF8.const.p("GetJoystickNameForID", SDL_JoystickID("instance_id"))
    charUTF8.const.p("GetJoystickPathForID", SDL_JoystickID("instance_id"))

    int("GetJoystickPlayerIndexForID", SDL_JoystickID("instance_id"))

    SDL_GUID("GetJoystickGUIDForID", SDL_JoystickID("instance_id"))

    Uint16("GetJoystickVendorForID", SDL_JoystickID("instance_id"))
    Uint16("GetJoystickProductForID", SDL_JoystickID("instance_id"))
    Uint16("GetJoystickProductVersionForID", SDL_JoystickID("instance_id"))

    SDL_JoystickType("GetJoystickTypeForID", SDL_JoystickID("instance_id"))

    SDL_Joystick.p("OpenJoystick", SDL_JoystickID("instance_id"))

    SDL_Joystick.p("GetJoystickFromID", SDL_JoystickID("instance_id"))
    SDL_Joystick.p("GetJoystickFromPlayerIndex", int("player_index"))

    SDL_JoystickID(
        "AttachVirtualJoystick",

        SDL_VirtualJoystickDesc.const.p("desc")
    )

    bool("DetachVirtualJoystick", SDL_JoystickID("instance_id"))
    bool("IsJoystickVirtual", SDL_JoystickID("instance_id"))

    bool(
        "SetJoystickVirtualAxis",

        SDL_Joystick.p("joystick"),
        int("axis"),
        Sint16("value")
    )

    bool(
        "SetJoystickVirtualBall",

        SDL_Joystick.p("joystick"),
        int("ball"),
        Sint16("xrel"),
        Sint16("yrel")
    )

    bool(
        "SetJoystickVirtualButton",

        SDL_Joystick.p("joystick"),
        int("button"),
        bool("down")
    )

    bool(
        "SetJoystickVirtualHat",

        SDL_Joystick.p("joystick"),
        int("hat"),
        Uint8("value")
    )

    bool(
        "SetJoystickVirtualTouchpad",

        SDL_Joystick.p("joystick"),
        int("touchpad"),
        int("finger"),
        bool("down"),
        float("x"),
        float("y"),
        float("pressure")
    )

    bool(
        "SendJoystickVirtualSensorData",

        SDL_Joystick.p("joystick"),
        SDL_SensorType("type"),
        Uint64("sensor_timestamp"),
        float.const.p("data"),
        AutoSize("data")..int("num_values")
    )

    SDL_PropertiesID("GetJoystickProperties", SDL_Joystick.p("joystick"))

    charUTF8.const.p("GetJoystickName", SDL_Joystick.p("joystick"))
    charUTF8.const.p("GetJoystickPath", SDL_Joystick.p("joystick"))

    int("GetJoystickPlayerIndex", SDL_Joystick.p("joystick"))

    bool(
        "SetJoystickPlayerIndex",

        SDL_Joystick.p("joystick"),
        int("player_index")
    )

    SDL_GUID("GetJoystickGUID", SDL_Joystick.p("joystick"))

    Uint16("GetJoystickVendor", SDL_Joystick.p("joystick"))
    Uint16("GetJoystickProduct", SDL_Joystick.p("joystick"))
    Uint16("GetJoystickProductVersion", SDL_Joystick.p("joystick"))
    Uint16("GetJoystickFirmwareVersion", SDL_Joystick.p("joystick"))

    charUTF8.const.p("GetJoystickSerial", SDL_Joystick.p("joystick"))

    SDL_JoystickType("GetJoystickType", SDL_Joystick.p("joystick"))

    void(
        "GetJoystickGUIDInfo",

        SDL_GUID("guid"),
        Check(1)..nullable..Uint16.p("vendor"),
        Check(1)..nullable..Uint16.p("product"),
        Check(1)..nullable..Uint16.p("version"),
        Check(1)..nullable..Uint16.p("crc16")
    )

    bool("JoystickConnected", SDL_Joystick.p("joystick"))

    SDL_JoystickID("GetJoystickID", SDL_Joystick.p("joystick"))

    int("GetNumJoystickAxes", SDL_Joystick.p("joystick"))
    int("GetNumJoystickBalls", SDL_Joystick.p("joystick"))
    int("GetNumJoystickHats", SDL_Joystick.p("joystick"))
    int("GetNumJoystickButtons", SDL_Joystick.p("joystick"))

    void("SetJoystickEventsEnabled", bool("enabled"))
    bool("JoystickEventsEnabled", void())

    void("UpdateJoysticks", void())

    Sint16(
        "GetJoystickAxis",

        SDL_Joystick.p("joystick"),
        int("axis")
    )

    bool(
        "GetJoystickAxisInitialState",

        SDL_Joystick.p("joystick"),
        int("axis"),
        Check(1)..nullable..Sint16.p("state")
    )

    bool(
        "GetJoystickBall",

        SDL_Joystick.p("joystick"),
        int("ball"),
        Check(1)..nullable..int.p("dx"),
        Check(1)..nullable..int.p("dy")
    )

    Uint8(
        "GetJoystickHat",

        SDL_Joystick.p("joystick"),
        int("hat")
    )

    bool(
        "GetJoystickButton",

        SDL_Joystick.p("joystick"),
        int("button")
    )

    bool(
        "RumbleJoystick",

        SDL_Joystick.p("joystick"),
        Uint16("low_frequency_rumble"),
        Uint16("high_frequency_rumble"),
        Uint32("duration_ms")
    )

    bool(
        "RumbleJoystickTriggers",

        SDL_Joystick.p("joystick"),
        Uint16("left_rumble"),
        Uint16("right_rumble"),
        Uint32("duration_ms")
    )

    bool(
        "SetJoystickLED",

        SDL_Joystick.p("joystick"),
        Uint8("red"),
        Uint8("green"),
        Uint8("blue")
    )

    bool(
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
        Check(1)..nullable..int.p("percent")
    )

    customMethod("""
    /** {@code void SDL_INIT_INTERFACE(SDL_VirtualJoystickDesc * iface)} */
    public static void SDL_INIT_INTERFACE(SDL_VirtualJoystickDesc iface) {
        iface.clear();
        iface.version(SDL_VirtualJoystickDesc.SIZEOF);
    }""")
}
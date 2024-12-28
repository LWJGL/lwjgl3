/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

val SDL_events = "SDLEvents".nativeClassSDL("SDL_events") {
    EnumConstant(
        "EVENT_FIRST".enum("0"),
        "EVENT_QUIT".enum("0x100"),
        "EVENT_TERMINATING".enum,
        "EVENT_LOW_MEMORY".enum,
        "EVENT_WILL_ENTER_BACKGROUND".enum,
        "EVENT_DID_ENTER_BACKGROUND".enum,
        "EVENT_WILL_ENTER_FOREGROUND".enum,
        "EVENT_DID_ENTER_FOREGROUND".enum,
        "EVENT_LOCALE_CHANGED".enum,
        "EVENT_SYSTEM_THEME_CHANGED".enum,
        "EVENT_DISPLAY_ORIENTATION".enum("0x151"),
        "EVENT_DISPLAY_ADDED".enum,
        "EVENT_DISPLAY_REMOVED".enum,
        "EVENT_DISPLAY_MOVED".enum,
        "EVENT_DISPLAY_DESKTOP_MODE_CHANGED".enum,
        "EVENT_DISPLAY_CURRENT_MODE_CHANGED".enum,
        "EVENT_DISPLAY_CONTENT_SCALE_CHANGED".enum,
        "EVENT_DISPLAY_FIRST".enum("SDL_EVENT_DISPLAY_ORIENTATION"),
        "EVENT_DISPLAY_LAST".enum("SDL_EVENT_DISPLAY_CONTENT_SCALE_CHANGED"),
        "EVENT_WINDOW_SHOWN".enum("0x202"),
        "EVENT_WINDOW_HIDDEN".enum,
        "EVENT_WINDOW_EXPOSED".enum,
        "EVENT_WINDOW_MOVED".enum,
        "EVENT_WINDOW_RESIZED".enum,
        "EVENT_WINDOW_PIXEL_SIZE_CHANGED".enum,
        "EVENT_WINDOW_METAL_VIEW_RESIZED".enum,
        "EVENT_WINDOW_MINIMIZED".enum,
        "EVENT_WINDOW_MAXIMIZED".enum,
        "EVENT_WINDOW_RESTORED".enum,
        "EVENT_WINDOW_MOUSE_ENTER".enum,
        "EVENT_WINDOW_MOUSE_LEAVE".enum,
        "EVENT_WINDOW_FOCUS_GAINED".enum,
        "EVENT_WINDOW_FOCUS_LOST".enum,
        "EVENT_WINDOW_CLOSE_REQUESTED".enum,
        "EVENT_WINDOW_HIT_TEST".enum,
        "EVENT_WINDOW_ICCPROF_CHANGED".enum,
        "EVENT_WINDOW_DISPLAY_CHANGED".enum,
        "EVENT_WINDOW_DISPLAY_SCALE_CHANGED".enum,
        "EVENT_WINDOW_SAFE_AREA_CHANGED".enum,
        "EVENT_WINDOW_OCCLUDED".enum,
        "EVENT_WINDOW_ENTER_FULLSCREEN".enum,
        "EVENT_WINDOW_LEAVE_FULLSCREEN".enum,
        "EVENT_WINDOW_DESTROYED".enum,
        "EVENT_WINDOW_HDR_STATE_CHANGED".enum,
        "EVENT_WINDOW_FIRST".enum("SDL_EVENT_WINDOW_SHOWN"),
        "EVENT_WINDOW_LAST".enum("SDL_EVENT_WINDOW_HDR_STATE_CHANGED"),
        "EVENT_KEY_DOWN".enum("0x300"),
        "EVENT_KEY_UP".enum,
        "EVENT_TEXT_EDITING".enum,
        "EVENT_TEXT_INPUT".enum,
        "EVENT_KEYMAP_CHANGED".enum,
        "EVENT_KEYBOARD_ADDED".enum,
        "EVENT_KEYBOARD_REMOVED".enum,
        "EVENT_TEXT_EDITING_CANDIDATES".enum,
        "EVENT_MOUSE_MOTION".enum("0x400"),
        "EVENT_MOUSE_BUTTON_DOWN".enum,
        "EVENT_MOUSE_BUTTON_UP".enum,
        "EVENT_MOUSE_WHEEL".enum,
        "EVENT_MOUSE_ADDED".enum,
        "EVENT_MOUSE_REMOVED".enum,
        "EVENT_JOYSTICK_AXIS_MOTION".enum("0x600"),
        "EVENT_JOYSTICK_BALL_MOTION".enum,
        "EVENT_JOYSTICK_HAT_MOTION".enum,
        "EVENT_JOYSTICK_BUTTON_DOWN".enum,
        "EVENT_JOYSTICK_BUTTON_UP".enum,
        "EVENT_JOYSTICK_ADDED".enum,
        "EVENT_JOYSTICK_REMOVED".enum,
        "EVENT_JOYSTICK_BATTERY_UPDATED".enum,
        "EVENT_JOYSTICK_UPDATE_COMPLETE".enum,
        "EVENT_GAMEPAD_AXIS_MOTION".enum("0x650"),
        "EVENT_GAMEPAD_BUTTON_DOWN".enum,
        "EVENT_GAMEPAD_BUTTON_UP".enum,
        "EVENT_GAMEPAD_ADDED".enum,
        "EVENT_GAMEPAD_REMOVED".enum,
        "EVENT_GAMEPAD_REMAPPED".enum,
        "EVENT_GAMEPAD_TOUCHPAD_DOWN".enum,
        "EVENT_GAMEPAD_TOUCHPAD_MOTION".enum,
        "EVENT_GAMEPAD_TOUCHPAD_UP".enum,
        "EVENT_GAMEPAD_SENSOR_UPDATE".enum,
        "EVENT_GAMEPAD_UPDATE_COMPLETE".enum,
        "EVENT_GAMEPAD_STEAM_HANDLE_UPDATED".enum,
        "EVENT_FINGER_DOWN".enum("0x700"),
        "EVENT_FINGER_UP".enum,
        "EVENT_FINGER_MOTION".enum,
        "EVENT_FINGER_CANCELED".enum,
        "EVENT_CLIPBOARD_UPDATE".enum("0x900"),
        "EVENT_DROP_FILE".enum("0x1000"),
        "EVENT_DROP_TEXT".enum,
        "EVENT_DROP_BEGIN".enum,
        "EVENT_DROP_COMPLETE".enum,
        "EVENT_DROP_POSITION".enum,
        "EVENT_AUDIO_DEVICE_ADDED".enum("0x1100"),
        "EVENT_AUDIO_DEVICE_REMOVED".enum,
        "EVENT_AUDIO_DEVICE_FORMAT_CHANGED".enum,
        "EVENT_SENSOR_UPDATE".enum("0x1200"),
        "EVENT_PEN_PROXIMITY_IN".enum("0x1300"),
        "EVENT_PEN_PROXIMITY_OUT".enum,
        "EVENT_PEN_DOWN".enum,
        "EVENT_PEN_UP".enum,
        "EVENT_PEN_BUTTON_DOWN".enum,
        "EVENT_PEN_BUTTON_UP".enum,
        "EVENT_PEN_MOTION".enum,
        "EVENT_PEN_AXIS".enum,
        "EVENT_CAMERA_DEVICE_ADDED".enum("0x1400"),
        "EVENT_CAMERA_DEVICE_REMOVED".enum,
        "EVENT_CAMERA_DEVICE_APPROVED".enum,
        "EVENT_CAMERA_DEVICE_DENIED".enum,
        "EVENT_RENDER_TARGETS_RESET".enum("0x2000"),
        "EVENT_RENDER_DEVICE_RESET".enum,
        "EVENT_RENDER_DEVICE_LOST".enum,
        "EVENT_PRIVATE0".enum("0x4000"),
        "EVENT_PRIVATE1".enum,
        "EVENT_PRIVATE2".enum,
        "EVENT_PRIVATE3".enum,
        "EVENT_POLL_SENTINEL".enum("0x7F00"),
        "EVENT_USER".enum("0x8000"),
        "EVENT_LAST".enum("0xFFFF"),

        "EVENT_ENUM_PADDING".enum(0x7FFFFFFF)
    )

    EnumConstant(
        "ADDEVENT".enum("0"),
        "PEEKEVENT".enum,
        "GETEVENT".enum
    )

    void(
        "PumpEvents",

        void()
    )

    int(
        "PeepEvents",

        nullable..SDL_Event.p("events"),
        AutoSize("events")..int("numevents"),
        SDL_EventAction("action"),
        Uint32("minType"),
        Uint32("maxType")
    )

    bool(
        "HasEvent",

        Uint32("type")
    )

    bool(
        "HasEvents",

        Uint32("minType"),
        Uint32("maxType")
    )

    void(
        "FlushEvent",

        Uint32("type")
    )

    void(
        "FlushEvents",

        Uint32("minType"),
        Uint32("maxType")
    )

    bool(
        "PollEvent",

        nullable..SDL_Event.p("event")
    )

    bool(
        "WaitEvent",

        nullable..SDL_Event.p("event")
    )

    bool(
        "WaitEventTimeout",

        nullable..SDL_Event.p("event"),
        Sint32("timeoutMS")
    )

    bool(
        "PushEvent",

        SDL_Event.p("event")
    )

    void(
        "SetEventFilter",

        nullable..SDL_EventFilter("filter"),
        nullable..opaque_p("userdata")
    )

    bool(
        "GetEventFilter",

        Check(1)..nullable..SDL_EventFilter.p("filter"),
        Check(1)..nullable..opaque_p.p("userdata")
    )

    bool(
        "AddEventWatch",

        SDL_EventFilter("filter"),
        nullable..opaque_p("userdata")
    )

    void(
        "RemoveEventWatch",

        SDL_EventFilter("filter"),
        nullable..opaque_p("userdata")
    )

    void(
        "FilterEvents",

        SDL_EventFilter("filter"),
        nullable..opaque_p("userdata")
    )

    void(
        "SetEventEnabled",

        Uint32("type"),
        bool("enabled")
    )

    bool(
        "EventEnabled",

        Uint32("type")
    )

    Uint32(
        "RegisterEvents",

        int("numevents")
    )

    SDL_Window.p(
        "GetWindowFromEvent",

        SDL_Event.const.p("event")
    )
}
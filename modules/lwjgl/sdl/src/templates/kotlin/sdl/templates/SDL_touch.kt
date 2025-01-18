/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

val SDL_touch = "SDLTouch".nativeClassSDL("SDL_touch") {
    EnumConstant(
        "TOUCH_DEVICE_INVALID".enum("-1"),
        "TOUCH_DEVICE_DIRECT".enum,
        "TOUCH_DEVICE_INDIRECT_ABSOLUTE".enum,
        "TOUCH_DEVICE_INDIRECT_RELATIVE".enum
    )

    IntConstant("TOUCH_MOUSEID".."-1")
    LongConstant("MOUSE_TOUCHID".."-1L")

    SDL_TouchID.p(
        "GetTouchDevices",

        AutoSizeResult..int.p("count")
    )

    charUTF8.const.p(
        "GetTouchDeviceName",

        SDL_TouchID("touchID")
    )

    SDL_TouchDeviceType(
        "GetTouchDeviceType",

        SDL_TouchID("touchID")
    )

    SDL_Finger.p.p(
        "GetTouchFingers",

        SDL_TouchID("touchID"),
        AutoSizeResult..int.p("count")
    )
}
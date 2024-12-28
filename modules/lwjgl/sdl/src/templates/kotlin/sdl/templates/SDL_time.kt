/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

val SDL_time = "SDLTime".nativeClassSDL("SDL_time") {
    EnumConstant(
        "DATE_FORMAT_YYYYMMDD".enum("0"),
        "DATE_FORMAT_DDMMYYYY".enum,
        "DATE_FORMAT_MMDDYYYY".enum
    )

    EnumConstant(
        "TIME_FORMAT_24HR".enum("0"),
        "TIME_FORMAT_12HR".enum
    )

    bool(
        "GetDateTimeLocalePreferences",

        Check(1)..nullable..SDL_DateFormat.p("dateFormat"),
        Check(1)..nullable..SDL_TimeFormat.p("timeFormat")
    )

    bool(
        "GetCurrentTime",

        Check(1)..SDL_Time.p("ticks")
    )

    bool(
        "TimeToDateTime",

        SDL_Time("ticks"),
        SDL_DateTime.p("dt"),
        bool("localTime")
    )

    bool(
        "DateTimeToTime",

        SDL_DateTime.const.p("dt"),
        Check(1)..SDL_Time.p("ticks")
    )

    void(
        "TimeToWindows",

        SDL_Time("ticks"),
        Check(1)..nullable..Uint32.p("dwLowDateTime"),
        Check(1)..nullable..Uint32.p("dwHighDateTime")
    )

    SDL_Time(
        "TimeFromWindows",

        Uint32("dwLowDateTime"),
        Uint32("dwHighDateTime")
    )

    int(
        "GetDaysInMonth",

        int("year"),
        int("month")
    )

    int(
        "GetDayOfYear",

        int("year"),
        int("month"),
        int("day")
    )

    int(
        "GetDayOfWeek",

        int("year"),
        int("month"),
        int("day")
    )
}
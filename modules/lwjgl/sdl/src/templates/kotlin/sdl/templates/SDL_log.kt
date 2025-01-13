/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

fun SDL_log() = SDL.apply {

    EnumConstant(
        "LOG_CATEGORY_APPLICATION".enum("0"),
        "LOG_CATEGORY_ERROR".enum,
        "LOG_CATEGORY_ASSERT".enum,
        "LOG_CATEGORY_SYSTEM".enum,
        "LOG_CATEGORY_AUDIO".enum,
        "LOG_CATEGORY_VIDEO".enum,
        "LOG_CATEGORY_RENDER".enum,
        "LOG_CATEGORY_INPUT".enum,
        "LOG_CATEGORY_TEST".enum,
        "LOG_CATEGORY_GPU".enum,
        "LOG_CATEGORY_RESERVED2".enum,
        "LOG_CATEGORY_RESERVED3".enum,
        "LOG_CATEGORY_RESERVED4".enum,
        "LOG_CATEGORY_RESERVED5".enum,
        "LOG_CATEGORY_RESERVED6".enum,
        "LOG_CATEGORY_RESERVED7".enum,
        "LOG_CATEGORY_RESERVED8".enum,
        "LOG_CATEGORY_RESERVED9".enum,
        "LOG_CATEGORY_RESERVED10".enum,
        "LOG_CATEGORY_CUSTOM".enum
    )

    EnumConstant(
        "LOG_PRIORITY_INVALID".enum("0"),
        "LOG_PRIORITY_TRACE".enum,
        "LOG_PRIORITY_VERBOSE".enum,
        "LOG_PRIORITY_DEBUG".enum,
        "LOG_PRIORITY_INFO".enum,
        "LOG_PRIORITY_WARN".enum,
        "LOG_PRIORITY_ERROR".enum,
        "LOG_PRIORITY_CRITICAL".enum,
        "LOG_PRIORITY_COUNT".enum
    )

    void(
        "SetLogPriorities",

        SDL_LogPriority("priority")
    )

    void(
        "SetLogPriority",

        int("category"),
        SDL_LogPriority("priority")
    )

    SDL_LogPriority(
        "GetLogPriority",

        int("category")
    )

    void(
        "ResetLogPriorities",

        void()
    )

    bool(
        "SetLogPriorityPrefix",

        SDL_LogPriority("priority"),
        nullable..charUTF8.const.p("prefix")
    )

    // removed vararg logging functions that are useless from Java

    void(
        "LogMessage",

        int("category"),
        SDL_LogPriority("priority"),
        charUTF8.const.p("fmt")
    )

    void(
        "LogMessageV",

        int("category"),
        SDL_LogPriority("priority"),
        charUTF8.const.p("fmt"),
        va_list("ap")
    )

    SDL_LogOutputFunction(
        "GetDefaultLogOutputFunction",

        void()
    )

    void(
        "GetLogOutputFunction",

        Check(1)..ReturnParam..SDL_LogOutputFunction.p("callback"),
        Check(1)..opaque_p.p("userdata")
    )

    void(
        "SetLogOutputFunction",

        SDL_LogOutputFunction("callback"),
        nullable..opaque_p("userdata")
    )

}

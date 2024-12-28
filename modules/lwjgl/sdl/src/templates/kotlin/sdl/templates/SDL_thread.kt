/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

fun SDL_thread() = SDL.apply {

    StringConstant("PROP_THREAD_CREATE_ENTRY_FUNCTION_POINTER".."SDL.thread.create.entry_function")
    StringConstant("PROP_THREAD_CREATE_NAME_STRING".."SDL.thread.create.name")
    StringConstant("PROP_THREAD_CREATE_USERDATA_POINTER".."SDL.thread.create.userdata")
    StringConstant("PROP_THREAD_CREATE_STACKSIZE_NUMBER".."SDL.thread.create.stacksize")

    EnumConstant(
        "THREAD_PRIORITY_LOW".enum("0"),
        "THREAD_PRIORITY_NORMAL".enum,
        "THREAD_PRIORITY_HIGH".enum,
        "THREAD_PRIORITY_TIME_CRITICAL".enum
    )

    EnumConstant(
        "THREAD_UNKNOWN".enum("0"),
        "THREAD_ALIVE".enum,
        "THREAD_DETACHED".enum,
        "THREAD_COMPLETE".enum
    )

    // Thread creation is not exposed, because it would require manual JVM attachment via the JNI.

    charUTF8.const.p(
        "GetThreadName",

        SDL_Thread.p("thread")
    )

    SDL_ThreadID(
        "GetCurrentThreadID",

        void()
    )

    SDL_ThreadID(
        "GetThreadID",

        SDL_Thread.p("thread")
    )

    _Bool(
        "SetCurrentThreadPriority",

        SDL_ThreadPriority("priority")
    )

    void(
        "WaitThread",

        SDL_Thread.p("thread"),
        nullable..Check(1)..int.p("status")
    )

    SDL_ThreadState(
        "GetThreadState",

        SDL_Thread.p("thread")
    )

    void(
        "DetachThread",

        SDL_Thread.p("thread")
    )

    opaque_p(
        "GetTLS",

        nullable..Check(1)..SDL_TLSID.p("id")
    )

    _Bool(
        "SetTLS",

        nullable..Check(1)..SDL_TLSID.p("id"),
        opaque_p("value"),
        SDL_TLSDestructorCallback("destructor")
    )

    void(
        "CleanupTLS",

        void()
    )

}

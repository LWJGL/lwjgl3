/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

val SDL_asyncio = "SDLAsyncIO".nativeClassSDL("SDL_asyncio") {
    EnumConstant(
        "ASYNCIO_TASK_READ".enum("0"),
        "ASYNCIO_TASK_WRITE".enum,
        "ASYNCIO_TASK_CLOSE".enum
    )

    EnumConstant(
        "ASYNCIO_COMPLETE".enum("0"),
        "ASYNCIO_FAILURE".enum,
        "ASYNCIO_CANCELED".enum
    )

    SDL_AsyncIO.p(
        "AsyncIOFromFile",

        charUTF8.const.p("file"),
        charASCII.const.p("mode")
    )

    Sint64(
        "GetAsyncIOSize",

        SDL_AsyncIO.p("asyncio")
    )

    bool(
        "ReadAsyncIO",

        SDL_AsyncIO.p("asyncio"),
        void.p("ptr"),
        Uint64("offset"),
        AutoSize("ptr")..Uint64("size"),
        SDL_AsyncIOQueue.p("queue"),
        nullable..opaque_p("userdata")
    )

    bool(
        "WriteAsyncIO",

        SDL_AsyncIO.p("asyncio"),
        void.p("ptr"),
        Uint64("offset"),
        AutoSize("ptr")..Uint64("size"),
        SDL_AsyncIOQueue.p("queue"),
        nullable..opaque_p("userdata")
    )

    bool(
        "CloseAsyncIO",

        SDL_AsyncIO.p("asyncio"),
        bool("flush"),
        SDL_AsyncIOQueue.p("queue"),
        nullable..opaque_p("userdata")
    )

    SDL_AsyncIOQueue.p(
        "CreateAsyncIOQueue",

        void()
    )

    void(
        "DestroyAsyncIOQueue",

        SDL_AsyncIOQueue.p("queue")
    )

    bool(
        "GetAsyncIOResult",

        SDL_AsyncIOQueue.p("queue"),
        SDL_AsyncIOOutcome.p("outcome")
    )

    bool(
        "WaitAsyncIOResult",

        SDL_AsyncIOQueue.p("queue"),
        SDL_AsyncIOOutcome.p("outcome"),
        Sint32("timeoutMS")
    )

    void(
        "SignalAsyncIOQueue",

        SDL_AsyncIOQueue.p("queue")
    )

    bool(
        "LoadFileAsync",

        charUTF8.const.p("file"),
        SDL_AsyncIOQueue.p("queue"),
        nullable..opaque_p("userdata")
    )
}
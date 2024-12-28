/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

fun SDL_storage() = SDL.apply {

    SDL_Storage.p(
        "OpenTitleStorage",

        nullable..charUTF8.const.p("override"),
        SDL_PropertiesID("props")
    )

    SDL_Storage.p(
        "OpenUserStorage",

        charUTF8.const.p("org"),
        charUTF8.const.p("app"),
        SDL_PropertiesID("props")
    )

    SDL_Storage.p(
        "OpenFileStorage",

        charUTF8.const.p("path")
    )

    SDL_Storage.p(
        "OpenStorage",

        Check(1)..SDL_StorageInterface.const.p("iface"),
        nullable..opaque_p("userdata")
    )

    _Bool(
        "CloseStorage",

        SDL_Storage.p("storage")
    )

    _Bool(
        "StorageReady",

        SDL_Storage.p("storage")
    )

    _Bool(
        "GetStorageFileSize",

        SDL_Storage.p("storage"),
        charUTF8.const.p("path"),
        Check(1)..Uint64.p("length")
    )

    _Bool(
        "ReadStorageFile",

        SDL_Storage.p("storage"),
        charUTF8.const.p("path"),
        void.p("destination"),
        AutoSize("destination")..Uint64("length")
    )

    _Bool(
        "WriteStorageFile",

        SDL_Storage.p("storage"),
        charUTF8.const.p("path"),
        void.const.p("source"),
        AutoSize("source")..Uint64("length")
    )

    _Bool(
        "CreateStorageDirectory",

        SDL_Storage.p("storage"),
        charUTF8.const.p("path")
    )

    _Bool(
        "EnumerateStorageDirectory",

        SDL_Storage.p("storage"),
        charUTF8.const.p("path"),
        SDL_EnumerateDirectoryCallback("callback"),
        nullable..opaque_p("userdata")
    )

    _Bool(
        "RemoveStoragePath",

        SDL_Storage.p("storage"),
        charUTF8.const.p("path")
    )

    _Bool(
        "RenameStoragePath",

        SDL_Storage.p("storage"),
        charUTF8.const.p("oldpath"),
        charUTF8.const.p("newpath")
    )

    _Bool(
        "CopyStorageFile",

        SDL_Storage.p("storage"),
        charUTF8.const.p("oldpath"),
        charUTF8.const.p("newpath")
    )

    _Bool(
        "GetStoragePathInfo",

        SDL_Storage.p("storage"),
        charUTF8.const.p("path"),
        Check(1)..SDL_PathInfo.p("info")
    )

    Uint64(
        "GetStorageSpaceRemaining",

        SDL_Storage.p("storage")
    )

    charUTF8.p.p(
        "GlobStorageDirectory",

        SDL_Storage.p("storage"),
        charUTF8.const.p("path"),
        charUTF8.const.p("pattern"),
        SDL_GlobFlags("flags"),
        AutoSizeResult..int.p("count")
    )

}

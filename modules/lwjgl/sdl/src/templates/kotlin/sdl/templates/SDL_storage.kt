/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

val SDL_storage = "SDLStorage".nativeClassSDL("SDL_storage") {
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

        SDL_StorageInterface.const.p("iface"),
        nullable..opaque_p("userdata")
    )

    bool(
        "CloseStorage",

        SDL_Storage.p("storage")
    )

    bool(
        "StorageReady",

        SDL_Storage.p("storage")
    )

    bool(
        "GetStorageFileSize",

        SDL_Storage.p("storage"),
        charUTF8.const.p("path"),
        Check(1)..nullable..Uint64.p("length")
    )

    bool(
        "ReadStorageFile",

        SDL_Storage.p("storage"),
        charUTF8.const.p("path"),
        void.p("destination"),
        AutoSize("destination")..Uint64("length")
    )

    bool(
        "WriteStorageFile",

        SDL_Storage.p("storage"),
        charUTF8.const.p("path"),
        void.const.p("source"),
        AutoSize("source")..Uint64("length")
    )

    bool(
        "CreateStorageDirectory",

        SDL_Storage.p("storage"),
        charUTF8.const.p("path")
    )

    bool(
        "EnumerateStorageDirectory",

        SDL_Storage.p("storage"),
        nullable..charUTF8.const.p("path"),
        SDL_EnumerateDirectoryCallback("callback"),
        nullable..opaque_p("userdata")
    )

    bool(
        "RemoveStoragePath",

        SDL_Storage.p("storage"),
        charUTF8.const.p("path")
    )

    bool(
        "RenameStoragePath",

        SDL_Storage.p("storage"),
        charUTF8.const.p("oldpath"),
        charUTF8.const.p("newpath")
    )

    bool(
        "CopyStorageFile",

        SDL_Storage.p("storage"),
        charUTF8.const.p("oldpath"),
        charUTF8.const.p("newpath")
    )

    bool(
        "GetStoragePathInfo",

        SDL_Storage.p("storage"),
        charUTF8.const.p("path"),
        nullable..SDL_PathInfo.p("info")
    )

    Uint64(
        "GetStorageSpaceRemaining",

        SDL_Storage.p("storage")
    )

    charUTF8.p.p(
        "GlobStorageDirectory",

        SDL_Storage.p("storage"),
        nullable..charUTF8.const.p("path"),
        nullable..charUTF8.const.p("pattern"),
        SDL_GlobFlags("flags"),
        AutoSizeResult..int.p("count")
    )

    customMethod("""
    /** {@code void SDL_INIT_INTERFACE(SDL_StorageInterface * iface)} */
    public static void SDL_INIT_INTERFACE(SDL_StorageInterface iface) {
        iface.clear();
        iface.version(SDL_StorageInterface.SIZEOF);
    }""")
}
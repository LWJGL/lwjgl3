/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

val SDL_filesystem = "SDLFileSystem".nativeClassSDL("SDL_filesystem") {
    javaImport("static org.lwjgl.sdl.SDLStdinc.*")

    EnumConstant(
        "FOLDER_HOME".enum("0"),
        "FOLDER_DESKTOP".enum,
        "FOLDER_DOCUMENTS".enum,
        "FOLDER_DOWNLOADS".enum,
        "FOLDER_MUSIC".enum,
        "FOLDER_PICTURES".enum,
        "FOLDER_PUBLICSHARE".enum,
        "FOLDER_SAVEDGAMES".enum,
        "FOLDER_SCREENSHOTS".enum,
        "FOLDER_TEMPLATES".enum,
        "FOLDER_VIDEOS".enum,
        "FOLDER_COUNT".enum
    )

    EnumConstant(
        "PATHTYPE_NONE".enum("0"),
        "PATHTYPE_FILE".enum,
        "PATHTYPE_DIRECTORY".enum,
        "PATHTYPE_OTHER".enum
    )

    EnumConstant(
        "ENUM_CONTINUE".enum("0"),
        "ENUM_SUCCESS".enum,
        "ENUM_FAILURE".enum
    )

    charUTF8.const.p(
        "GetBasePath",

        void()
    )

    SDLFreeResult..charUTF8.p(
        "GetPrefPath",

        charUTF8.const.p("org"),
        charUTF8.const.p("app")
    )

    charUTF8.const.p(
        "GetUserFolder",

        SDL_Folder("folder")
    )

    bool(
        "CreateDirectory",

        charUTF8.const.p("path")
    )

    bool(
        "EnumerateDirectory",

        charUTF8.const.p("path"),
        SDL_EnumerateDirectoryCallback("callback"),
        nullable..opaque_p("userdata")
    )

    bool(
        "RemovePath",

        charUTF8.const.p("path")
    )

    bool(
        "RenamePath",

        charUTF8.const.p("oldpath"),
        charUTF8.const.p("newpath")
    )

    bool(
        "CopyFile",

        charUTF8.const.p("oldpath"),
        charUTF8.const.p("newpath")
    )

    bool(
        "GetPathInfo",

        charUTF8.const.p("path"),
        nullable..SDL_PathInfo.p("info")
    )

    charUTF8.p.p(
        "GlobDirectory",

        charUTF8.const.p("path"),
        nullable..charUTF8.const.p("pattern"),
        SDL_GlobFlags("flags"),
        AutoSizeResult..int.p("count")
    )

    SDLFreeResult..charUTF8.p(
        "GetCurrentDirectory",

        void()
    )
}
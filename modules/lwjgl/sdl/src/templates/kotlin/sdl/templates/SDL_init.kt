/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

val SDL_init = "SDLInit".nativeClassSDL("SDL_init") {
    IntConstant(
        "INIT_AUDIO".."0x00000010",
        "INIT_VIDEO".."0x00000020",
        "INIT_JOYSTICK".."0x00000200",
        "INIT_HAPTIC".."0x00001000",
        "INIT_GAMEPAD".."0x00002000",
        "INIT_EVENTS".."0x00004000",
        "INIT_SENSOR".."0x00008000",
        "INIT_CAMERA".."0x00010000"
    )

    /*EnumConstant(
        "APP_CONTINUE".enum("0"),
        "APP_SUCCESS".enum,
        "APP_FAILURE".enum
    )*/

    StringConstant(
        "PROP_APP_METADATA_NAME_STRING".."SDL.app.metadata.name",
        "PROP_APP_METADATA_VERSION_STRING".."SDL.app.metadata.version",
        "PROP_APP_METADATA_IDENTIFIER_STRING".."SDL.app.metadata.identifier",
        "PROP_APP_METADATA_CREATOR_STRING".."SDL.app.metadata.creator",
        "PROP_APP_METADATA_COPYRIGHT_STRING".."SDL.app.metadata.copyright",
        "PROP_APP_METADATA_URL_STRING".."SDL.app.metadata.url",
        "PROP_APP_METADATA_TYPE_STRING".."SDL.app.metadata.type"
    )

    bool("Init", SDL_InitFlags("flags"))
    bool("InitSubSystem", SDL_InitFlags("flags"))

    void("QuitSubSystem", SDL_InitFlags("flags"))

    SDL_InitFlags("WasInit", SDL_InitFlags("flags"))

    void("Quit", void())

    bool("IsMainThread", void())

    bool(
        "RunOnMainThread",

        SDL_MainThreadCallback("callback"),
        nullable..opaque_p("userdata"),
        bool("wait_complete")
    )

    bool(
        "SetAppMetadata",

        nullable..charUTF8.const.p("appname"),
        nullable..charUTF8.const.p("appversion"),
        nullable..charUTF8.const.p("appidentifier")
    )

    bool(
        "SetAppMetadataProperty",

        charASCII.const.p("name"),
        charUTF8.const.p("value")
    )

    charUTF8.const.p(
        "GetAppMetadataProperty",

        charASCII.const.p("name")
    )
}
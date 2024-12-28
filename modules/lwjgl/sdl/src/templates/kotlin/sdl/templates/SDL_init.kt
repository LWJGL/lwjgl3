/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

fun SDL_init() = SDL.apply {

    IntConstant("INIT_AUDIO".."0x00000010")
    IntConstant("INIT_VIDEO".."0x00000020")
    IntConstant("INIT_JOYSTICK".."0x00000200")
    IntConstant("INIT_HAPTIC".."0x00001000")
    IntConstant("INIT_GAMEPAD".."0x00002000")
    IntConstant("INIT_EVENTS".."0x00004000")
    IntConstant("INIT_SENSOR".."0x00008000")
    IntConstant("INIT_CAMERA".."0x00010000")
    StringConstant("PROP_APP_METADATA_NAME_STRING".."SDL.app.metadata.name")
    StringConstant("PROP_APP_METADATA_VERSION_STRING".."SDL.app.metadata.version")
    StringConstant("PROP_APP_METADATA_IDENTIFIER_STRING".."SDL.app.metadata.identifier")
    StringConstant("PROP_APP_METADATA_CREATOR_STRING".."SDL.app.metadata.creator")
    StringConstant("PROP_APP_METADATA_COPYRIGHT_STRING".."SDL.app.metadata.copyright")
    StringConstant("PROP_APP_METADATA_URL_STRING".."SDL.app.metadata.url")
    StringConstant("PROP_APP_METADATA_TYPE_STRING".."SDL.app.metadata.type")

    EnumConstant(
        "APP_CONTINUE".enum("0"),
        "APP_SUCCESS".enum,
        "APP_FAILURE".enum
    )

    _Bool(
        "Init",

        SDL_InitFlags("flags")
    )

    _Bool(
        "InitSubSystem",

        SDL_InitFlags("flags")
    )

    void(
        "QuitSubSystem",

        SDL_InitFlags("flags")
    )

    SDL_InitFlags(
        "WasInit",

        SDL_InitFlags("flags")
    )

    void(
        "Quit",

        void()
    )

    _Bool(
        "IsMainThread",

        void()
    )

    _Bool(
        "RunOnMainThread",

        SDL_MainThreadCallback("callback"),
        nullable..opaque_p("userdata"),
        _Bool("wait_complete")
    )

    _Bool(
        "SetAppMetadata",

        charUTF8.const.p("appname"),
        charUTF8.const.p("appversion"),
        charUTF8.const.p("appidentifier")
    )

    _Bool(
        "SetAppMetadataProperty",

        charUTF8.const.p("name"),
        charUTF8.const.p("value")
    )

    charUTF8.const.p(
        "GetAppMetadataProperty",

        charUTF8.const.p("name")
    )

}

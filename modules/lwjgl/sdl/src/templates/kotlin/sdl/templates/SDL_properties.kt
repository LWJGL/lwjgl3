/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

val SDL_properties = "SDLProperties".nativeClassSDL("SDL_properties") {
    EnumConstant(
        "PROPERTY_TYPE_INVALID".enum(0),
        "PROPERTY_TYPE_POINTER".enum,
        "PROPERTY_TYPE_STRING".enum,
        "PROPERTY_TYPE_NUMBER".enum,
        "PROPERTY_TYPE_FLOAT".enum,
        "PROPERTY_TYPE_BOOLEAN".enum
    )

    SDL_PropertiesID("GetGlobalProperties", void())
    SDL_PropertiesID("CreateProperties", void())

    bool(
        "CopyProperties",

        SDL_PropertiesID("src"),
        SDL_PropertiesID("dst")
    )

    bool("LockProperties", SDL_PropertiesID("props"))
    void("UnlockProperties", SDL_PropertiesID("props"))

    bool(
        "SetPointerPropertyWithCleanup",

        SDL_PropertiesID("props"),
        charASCII.const.p("name"),
        nullable..opaque_p("value"),
        nullable..SDL_CleanupPropertyCallback("cleanup"),
        nullable..opaque_p("userdata")
    )

    bool(
        "SetPointerProperty",

        SDL_PropertiesID("props"),
        charASCII.const.p("name"),
        nullable..opaque_p("value")
    )

    bool(
        "SetStringProperty",

        SDL_PropertiesID("props"),
        charASCII.const.p("name"),
        nullable..charUTF8.const.p("value")
    )

    bool(
        "SetNumberProperty",

        SDL_PropertiesID("props"),
        charASCII.const.p("name"),
        Sint64("value")
    )

    bool(
        "SetFloatProperty",

        SDL_PropertiesID("props"),
        charASCII.const.p("name"),
        float("value")
    )

    bool(
        "SetBooleanProperty",

        SDL_PropertiesID("props"),
        charASCII.const.p("name"),
        bool("value")
    )

    bool(
        "HasProperty",

        SDL_PropertiesID("props"),
        charASCII.const.p("name")
    )

    SDL_PropertyType(
        "GetPropertyType",

        SDL_PropertiesID("props"),
        charASCII.const.p("name")
    )

    opaque_p(
        "GetPointerProperty",

        SDL_PropertiesID("props"),
        charASCII.const.p("name"),
        nullable..opaque_p("default_value")
    )

    charUTF8.const.p(
        "GetStringProperty",

        SDL_PropertiesID("props"),
        charASCII.const.p("name"),
        nullable..charUTF8.const.p("default_value")
    )

    Sint64(
        "GetNumberProperty",

        SDL_PropertiesID("props"),
        charASCII.const.p("name"),
        Sint64("default_value")
    )

    float(
        "GetFloatProperty",

        SDL_PropertiesID("props"),
        charASCII.const.p("name"),
        float("default_value")
    )

    bool(
        "GetBooleanProperty",

        SDL_PropertiesID("props"),
        charASCII.const.p("name"),
        bool("default_value")
    )

    bool(
        "ClearProperty",

        SDL_PropertiesID("props"),
        charASCII.const.p("name")
    )

    bool(
        "EnumerateProperties",

        SDL_PropertiesID("props"),
        SDL_EnumeratePropertiesCallback("callback"),
        nullable..opaque_p("userdata")
    )

    void("DestroyProperties", SDL_PropertiesID("props"))
}
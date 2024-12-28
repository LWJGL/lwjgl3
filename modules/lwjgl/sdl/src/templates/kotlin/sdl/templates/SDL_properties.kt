/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package sdl.templates

import org.lwjgl.generator.*
import sdl.*

fun SDL_properties() = SDL.apply {
    EnumConstant(
        "PROPERTY_TYPE_INVALID".enum(0),
        "PROPERTY_TYPE_POINTER".enum,
        "PROPERTY_TYPE_STRING".enum,
        "PROPERTY_TYPE_NUMBER".enum,
        "PROPERTY_TYPE_FLOAT".enum,
        "PROPERTY_TYPE_BOOLEAN".enum
    )

    SDL_PropertiesID(
        "GetGlobalProperties",

        void()
    )

    SDL_PropertiesID(
        "CreateProperties",

        void()
    )

    _Bool(
        "CopyProperties",

        SDL_PropertiesID("src"),
        SDL_PropertiesID("dst")
    )

    _Bool(
        "LockProperties",

        SDL_PropertiesID("props")
    )

    void(
        "UnlockProperties",

        SDL_PropertiesID("props")
    )

    _Bool(
        "SetPointerPropertyWithCleanup",

        SDL_PropertiesID("props"),
        charUTF8.const.p("name"),
        nullable..opaque_p("value"),
        SDL_CleanupPropertyCallback("cleanup"),
        nullable..opaque_p("userdata")
    )

    _Bool(
        "SetPointerProperty",

        SDL_PropertiesID("props"),
        charUTF8.const.p("name"),
        nullable..opaque_p("value")
    )

    _Bool(
        "SetStringProperty",

        SDL_PropertiesID("props"),
        charUTF8.const.p("name"),
        charUTF8.const.p("value")
    )

    _Bool(
        "SetNumberProperty",

        SDL_PropertiesID("props"),
        charUTF8.const.p("name"),
        Sint64("value")
    )

    _Bool(
        "SetFloatProperty",

        SDL_PropertiesID("props"),
        charUTF8.const.p("name"),
        float("value")
    )

    _Bool(
        "SetBooleanProperty",

        SDL_PropertiesID("props"),
        charUTF8.const.p("name"),
        _Bool("value")
    )

    _Bool(
        "HasProperty",

        SDL_PropertiesID("props"),
        charUTF8.const.p("name")
    )

    SDL_PropertyType(
        "GetPropertyType",

        SDL_PropertiesID("props"),
        charUTF8.const.p("name")
    )

    opaque_p(
        "GetPointerProperty",

        SDL_PropertiesID("props"),
        charUTF8.const.p("name"),
        nullable..opaque_p("default_value")
    )

    charUTF8.const.p(
        "GetStringProperty",

        SDL_PropertiesID("props"),
        charUTF8.const.p("name"),
        nullable..charUTF8.const.p("default_value")
    )

    Sint64(
        "GetNumberProperty",

        SDL_PropertiesID("props"),
        charUTF8.const.p("name"),
        Sint64("default_value")
    )

    float(
        "GetFloatProperty",

        SDL_PropertiesID("props"),
        charUTF8.const.p("name"),
        float("default_value")
    )

    _Bool(
        "GetBooleanProperty",

        SDL_PropertiesID("props"),
        charUTF8.const.p("name"),
        _Bool("default_value")
    )

    _Bool(
        "ClearProperty",

        SDL_PropertiesID("props"),
        charUTF8.const.p("name")
    )

    _Bool(
        "EnumerateProperties",

        SDL_PropertiesID("props"),
        SDL_EnumeratePropertiesCallback("callback"),
        nullable..opaque_p("userdata")
    )

    void(
        "DestroyProperties",

        SDL_PropertiesID("props")
    )

}

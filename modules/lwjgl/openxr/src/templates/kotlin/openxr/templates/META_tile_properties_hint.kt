/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val META_tile_properties_hint = "METATilePropertiesHint".nativeClassXR("META_tile_properties_hint", type = "instance", postfix = "META") {
    IntConstant(
        "META_tile_properties_hint_SPEC_VERSION".."1"
    )

    StringConstant(
        "META_TILE_PROPERTIES_HINT_EXTENSION_NAME".."XR_META_tile_properties_hint"
    )

    EnumConstant(
        "TYPE_TILE_PROPERTIES_META".."1000609000",
        "TYPE_TILE_PROPERTIES_HINT_META".."1000609001"
    )

    XrResult(
        "SetTilePropertiesHintMETA",

        XrSession("session"),
        XrTilePropertiesHintMETA.const.p("properties")
    )
}
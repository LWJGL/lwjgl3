/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val META_automatic_layer_filter = "METAAutomaticLayerFilter".nativeClassXR("META_automatic_layer_filter", type = "instance", postfix = "META") {
    IntConstant(
        "META_automatic_layer_filter_SPEC_VERSION".."1"
    )

    StringConstant(
        "META_AUTOMATIC_LAYER_FILTER_EXTENSION_NAME".."XR_META_automatic_layer_filter"
    )

    EnumConstant(
        "COMPOSITION_LAYER_SETTINGS_AUTO_LAYER_FILTER_BIT_META".enum(0x00000020)
    )
}
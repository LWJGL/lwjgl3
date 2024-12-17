/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_layer_settings = "EXTLayerSettings".nativeClassVK("EXT_layer_settings", type = "instance", postfix = "EXT") {
    IntConstant(
        "EXT_LAYER_SETTINGS_SPEC_VERSION".."2"
    )

    StringConstant(
        "EXT_LAYER_SETTINGS_EXTENSION_NAME".."VK_EXT_layer_settings"
    )

    EnumConstant(
        "STRUCTURE_TYPE_LAYER_SETTINGS_CREATE_INFO_EXT".."1000496000"
    )

    EnumConstant(
        "LAYER_SETTING_TYPE_BOOL32_EXT".."0",
        "LAYER_SETTING_TYPE_INT32_EXT".."1",
        "LAYER_SETTING_TYPE_INT64_EXT".."2",
        "LAYER_SETTING_TYPE_UINT32_EXT".."3",
        "LAYER_SETTING_TYPE_UINT64_EXT".."4",
        "LAYER_SETTING_TYPE_FLOAT32_EXT".."5",
        "LAYER_SETTING_TYPE_FLOAT64_EXT".."6",
        "LAYER_SETTING_TYPE_STRING_EXT".."7"
    )
}
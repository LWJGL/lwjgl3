/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_depth_clip_enable = "EXTDepthClipEnable".nativeClassVK("EXT_depth_clip_enable", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_DEPTH_CLIP_ENABLE_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_DEPTH_CLIP_ENABLE_EXTENSION_NAME".."VK_EXT_depth_clip_enable"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLIP_ENABLE_FEATURES_EXT".."1000102000",
        "STRUCTURE_TYPE_PIPELINE_RASTERIZATION_DEPTH_CLIP_STATE_CREATE_INFO_EXT".."1000102001"
    )
}
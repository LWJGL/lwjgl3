/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_depth_clip_control = "EXTDepthClipControl".nativeClassVK("EXT_depth_clip_control", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_DEPTH_CLIP_CONTROL_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_DEPTH_CLIP_CONTROL_EXTENSION_NAME".."VK_EXT_depth_clip_control"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLIP_CONTROL_FEATURES_EXT".."1000355000",
        "STRUCTURE_TYPE_PIPELINE_VIEWPORT_DEPTH_CLIP_CONTROL_CREATE_INFO_EXT".."1000355001"
    )
}
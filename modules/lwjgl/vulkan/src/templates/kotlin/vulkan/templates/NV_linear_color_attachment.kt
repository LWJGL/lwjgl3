/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_linear_color_attachment = "NVLinearColorAttachment".nativeClassVK("NV_linear_color_attachment", type = "device", postfix = "NV") {
    IntConstant(
        "NV_LINEAR_COLOR_ATTACHMENT_SPEC_VERSION".."1"
    )

    StringConstant(
        "NV_LINEAR_COLOR_ATTACHMENT_EXTENSION_NAME".."VK_NV_linear_color_attachment"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_LINEAR_COLOR_ATTACHMENT_FEATURES_NV".."1000430000"
    )

    EnumConstantLong(
        "FORMAT_FEATURE_2_LINEAR_COLOR_ATTACHMENT_BIT_NV".enum(0x4000000000L)
    )
}
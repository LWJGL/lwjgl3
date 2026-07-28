/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_primitive_restart_index = "EXTPrimitiveRestartIndex".nativeClassVK("EXT_primitive_restart_index", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_PRIMITIVE_RESTART_INDEX_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_PRIMITIVE_RESTART_INDEX_EXTENSION_NAME".."VK_EXT_primitive_restart_index"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIMITIVE_RESTART_INDEX_FEATURES_EXT".."1000678000"
    )

    void(
        "CmdSetPrimitiveRestartIndexEXT",

        VkCommandBuffer("commandBuffer"),
        uint32_t("primitiveRestartIndex")
    )
}
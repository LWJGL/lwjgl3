/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_host_query_reset = "EXTHostQueryReset".nativeClassVK("EXT_host_query_reset", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_HOST_QUERY_RESET_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_HOST_QUERY_RESET_EXTENSION_NAME".."VK_EXT_host_query_reset"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_QUERY_RESET_FEATURES_EXT".."1000261000"
    )

    void(
        "ResetQueryPoolEXT",

        VkDevice("device"),
        VkQueryPool("queryPool"),
        uint32_t("firstQuery"),
        uint32_t("queryCount")
    )
}
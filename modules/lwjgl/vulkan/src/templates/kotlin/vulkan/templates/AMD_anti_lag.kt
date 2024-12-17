/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val AMD_anti_lag = "AMDAntiLag".nativeClassVK("AMD_anti_lag", type = "device", postfix = "AMD") {
    IntConstant(
        "AMD_ANTI_LAG_SPEC_VERSION".."1"
    )

    StringConstant(
        "AMD_ANTI_LAG_EXTENSION_NAME".."VK_AMD_anti_lag"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_ANTI_LAG_FEATURES_AMD".."1000476000",
        "STRUCTURE_TYPE_ANTI_LAG_DATA_AMD".."1000476001",
        "STRUCTURE_TYPE_ANTI_LAG_PRESENTATION_INFO_AMD".."1000476002"
    )

    EnumConstant(
        "ANTI_LAG_MODE_DRIVER_CONTROL_AMD".."0",
        "ANTI_LAG_MODE_ON_AMD".."1",
        "ANTI_LAG_MODE_OFF_AMD".."2"
    )

    EnumConstant(
        "ANTI_LAG_STAGE_INPUT_AMD".."0",
        "ANTI_LAG_STAGE_PRESENT_AMD".."1"
    )

    void(
        "AntiLagUpdateAMD",

        VkDevice("device"),
        VkAntiLagDataAMD.const.p("pData")
    )
}
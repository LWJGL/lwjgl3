/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_present_metering = "NVPresentMetering".nativeClassVK("NV_present_metering", type = "device", postfix = "NV") {
    IntConstant(
        "NV_PRESENT_METERING_SPEC_VERSION".."1"
    )

    StringConstant(
        "NV_PRESENT_METERING_EXTENSION_NAME".."VK_NV_present_metering"
    )

    EnumConstant(
        "STRUCTURE_TYPE_SET_PRESENT_CONFIG_NV".."1000613000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_METERING_FEATURES_NV".."1000613001"
    )
}
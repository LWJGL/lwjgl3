/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_robustness2 = "KHRRobustness2".nativeClassVK("KHR_robustness2", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_ROBUSTNESS_2_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_ROBUSTNESS_2_EXTENSION_NAME".."VK_KHR_robustness2"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_ROBUSTNESS_2_FEATURES_KHR".."1000286000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_ROBUSTNESS_2_PROPERTIES_KHR".."1000286001"
    )
}
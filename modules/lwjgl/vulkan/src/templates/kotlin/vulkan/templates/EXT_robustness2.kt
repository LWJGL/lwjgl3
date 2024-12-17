/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_robustness2 = "EXTRobustness2".nativeClassVK("EXT_robustness2", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_ROBUSTNESS_2_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_ROBUSTNESS_2_EXTENSION_NAME".."VK_EXT_robustness2"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_ROBUSTNESS_2_FEATURES_EXT".."1000286000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_ROBUSTNESS_2_PROPERTIES_EXT".."1000286001"
    )
}
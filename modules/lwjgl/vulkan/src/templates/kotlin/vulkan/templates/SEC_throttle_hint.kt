/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val SEC_throttle_hint = "SECThrottleHint".nativeClassVK("SEC_throttle_hint", type = "device", postfix = "SEC") {
    IntConstant(
        "SEC_THROTTLE_HINT_SPEC_VERSION".."1"
    )

    StringConstant(
        "SEC_THROTTLE_HINT_EXTENSION_NAME".."VK_SEC_throttle_hint"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_THROTTLE_HINT_FEATURES_SEC".."1000674000",
        "STRUCTURE_TYPE_THROTTLE_HINT_SUBMIT_INFO_SEC".."1000674001"
    )

    EnumConstant(
        "THROTTLE_HINT_TYPE_DEFAULT_SEC".."0",
        "THROTTLE_HINT_TYPE_LOW_SEC".."1",
        "THROTTLE_HINT_TYPE_HIGH_SEC".."2"
    )
}
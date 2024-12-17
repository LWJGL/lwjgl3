/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_present_id = "KHRPresentId".nativeClassVK("KHR_present_id", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_PRESENT_ID_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_PRESENT_ID_EXTENSION_NAME".."VK_KHR_present_id"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PRESENT_ID_KHR".."1000294000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_ID_FEATURES_KHR".."1000294001"
    )
}
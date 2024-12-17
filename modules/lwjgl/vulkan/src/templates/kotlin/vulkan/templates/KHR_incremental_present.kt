/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_incremental_present = "KHRIncrementalPresent".nativeClassVK("KHR_incremental_present", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_INCREMENTAL_PRESENT_SPEC_VERSION".."2"
    )

    StringConstant(
        "KHR_INCREMENTAL_PRESENT_EXTENSION_NAME".."VK_KHR_incremental_present"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PRESENT_REGIONS_KHR".."1000084000"
    )
}
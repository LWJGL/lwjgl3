/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_dedicated_allocation = "KHRDedicatedAllocation".nativeClassVK("KHR_dedicated_allocation", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_DEDICATED_ALLOCATION_SPEC_VERSION".."3"
    )

    StringConstant(
        "KHR_DEDICATED_ALLOCATION_EXTENSION_NAME".."VK_KHR_dedicated_allocation"
    )

    EnumConstant(
        "STRUCTURE_TYPE_MEMORY_DEDICATED_REQUIREMENTS_KHR".."1000127000",
        "STRUCTURE_TYPE_MEMORY_DEDICATED_ALLOCATE_INFO_KHR".."1000127001"
    )
}
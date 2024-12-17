/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_dedicated_allocation = "NVDedicatedAllocation".nativeClassVK("NV_dedicated_allocation", type = "device", postfix = "NV") {
    IntConstant(
        "NV_DEDICATED_ALLOCATION_SPEC_VERSION".."1"
    )

    StringConstant(
        "NV_DEDICATED_ALLOCATION_EXTENSION_NAME".."VK_NV_dedicated_allocation"
    )

    EnumConstant(
        "STRUCTURE_TYPE_DEDICATED_ALLOCATION_IMAGE_CREATE_INFO_NV".."1000026000",
        "STRUCTURE_TYPE_DEDICATED_ALLOCATION_BUFFER_CREATE_INFO_NV".."1000026001",
        "STRUCTURE_TYPE_DEDICATED_ALLOCATION_MEMORY_ALLOCATE_INFO_NV".."1000026002"
    )
}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val AMD_memory_overallocation_behavior = "AMDMemoryOverallocationBehavior".nativeClassVK("AMD_memory_overallocation_behavior", type = "device", postfix = "AMD") {
    IntConstant(
        "AMD_MEMORY_OVERALLOCATION_BEHAVIOR_SPEC_VERSION".."1"
    )

    StringConstant(
        "AMD_MEMORY_OVERALLOCATION_BEHAVIOR_EXTENSION_NAME".."VK_AMD_memory_overallocation_behavior"
    )

    EnumConstant(
        "STRUCTURE_TYPE_DEVICE_MEMORY_OVERALLOCATION_CREATE_INFO_AMD".."1000189000"
    )

    EnumConstant(
        "MEMORY_OVERALLOCATION_BEHAVIOR_DEFAULT_AMD".."0",
        "MEMORY_OVERALLOCATION_BEHAVIOR_ALLOWED_AMD".."1",
        "MEMORY_OVERALLOCATION_BEHAVIOR_DISALLOWED_AMD".."2"
    )
}
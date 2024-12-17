/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_memory_budget = "EXTMemoryBudget".nativeClassVK("EXT_memory_budget", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_MEMORY_BUDGET_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_MEMORY_BUDGET_EXTENSION_NAME".."VK_EXT_memory_budget"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_BUDGET_PROPERTIES_EXT".."1000237000"
    )
}
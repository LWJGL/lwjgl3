/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_external_memory = "NVExternalMemory".nativeClassVK("NV_external_memory", type = "device", postfix = "NV") {
    IntConstant(
        "NV_EXTERNAL_MEMORY_SPEC_VERSION".."1"
    )

    StringConstant(
        "NV_EXTERNAL_MEMORY_EXTENSION_NAME".."VK_NV_external_memory"
    )

    EnumConstant(
        "STRUCTURE_TYPE_EXTERNAL_MEMORY_IMAGE_CREATE_INFO_NV".."1000056000",
        "STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO_NV".."1000056001"
    )
}
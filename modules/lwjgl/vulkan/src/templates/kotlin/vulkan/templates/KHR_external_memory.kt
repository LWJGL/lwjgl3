/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_external_memory = "KHRExternalMemory".nativeClassVK("KHR_external_memory", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_EXTERNAL_MEMORY_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_EXTERNAL_MEMORY_EXTENSION_NAME".."VK_KHR_external_memory"
    )

    EnumConstant(
        "STRUCTURE_TYPE_EXTERNAL_MEMORY_BUFFER_CREATE_INFO_KHR".."1000072000",
        "STRUCTURE_TYPE_EXTERNAL_MEMORY_IMAGE_CREATE_INFO_KHR".."1000072001",
        "STRUCTURE_TYPE_EXPORT_MEMORY_ALLOCATE_INFO_KHR".."1000072002"
    )

    EnumConstant(
        "ERROR_INVALID_EXTERNAL_HANDLE_KHR".."-1000072003"
    )

    EnumConstant(
        "QUEUE_FAMILY_EXTERNAL_KHR".."(~1)"
    )
}
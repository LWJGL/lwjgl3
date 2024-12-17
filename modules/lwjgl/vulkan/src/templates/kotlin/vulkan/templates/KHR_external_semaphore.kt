/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_external_semaphore = "KHRExternalSemaphore".nativeClassVK("KHR_external_semaphore", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_EXTERNAL_SEMAPHORE_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_EXTERNAL_SEMAPHORE_EXTENSION_NAME".."VK_KHR_external_semaphore"
    )

    EnumConstant(
        "STRUCTURE_TYPE_EXPORT_SEMAPHORE_CREATE_INFO_KHR".."1000077000"
    )

    EnumConstant(
        "SEMAPHORE_IMPORT_TEMPORARY_BIT_KHR".enum(0x00000001)
    )
}
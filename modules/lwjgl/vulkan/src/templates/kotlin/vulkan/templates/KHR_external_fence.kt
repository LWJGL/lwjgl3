/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_external_fence = "KHRExternalFence".nativeClassVK("KHR_external_fence", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_EXTERNAL_FENCE_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_EXTERNAL_FENCE_EXTENSION_NAME".."VK_KHR_external_fence"
    )

    EnumConstant(
        "STRUCTURE_TYPE_EXPORT_FENCE_CREATE_INFO_KHR".."1000113000"
    )

    EnumConstant(
        "FENCE_IMPORT_TEMPORARY_BIT_KHR".enum(0x00000001)
    )
}
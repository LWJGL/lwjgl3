/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_dedicated_allocation_image_aliasing = "NVDedicatedAllocationImageAliasing".nativeClassVK("NV_dedicated_allocation_image_aliasing", type = "device", postfix = "NV") {
    IntConstant(
        "NV_DEDICATED_ALLOCATION_IMAGE_ALIASING_SPEC_VERSION".."1"
    )

    StringConstant(
        "NV_DEDICATED_ALLOCATION_IMAGE_ALIASING_EXTENSION_NAME".."VK_NV_dedicated_allocation_image_aliasing"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DEDICATED_ALLOCATION_IMAGE_ALIASING_FEATURES_NV".."1000240000"
    )
}
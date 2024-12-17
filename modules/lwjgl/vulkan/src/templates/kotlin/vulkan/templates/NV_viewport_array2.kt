/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_viewport_array2 = "NVViewportArray2".nativeClassVK("NV_viewport_array2", type = "device", postfix = "NV") {
    IntConstant(
        "NV_VIEWPORT_ARRAY_2_SPEC_VERSION".."1"
    )

    StringConstant(
        "NV_VIEWPORT_ARRAY_2_EXTENSION_NAME".."VK_NV_viewport_array2"
    )

    IntConstant(
        "NV_VIEWPORT_ARRAY2_SPEC_VERSION".."VK_NV_VIEWPORT_ARRAY_2_SPEC_VERSION"
    )

    StringConstant(
        "NV_VIEWPORT_ARRAY2_EXTENSION_NAME".expr("VK_NV_VIEWPORT_ARRAY_2_EXTENSION_NAME")
    )
}
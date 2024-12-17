/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val LUNARG_direct_driver_loading = "LUNARGDirectDriverLoading".nativeClassVK("LUNARG_direct_driver_loading", type = "instance", postfix = "LUNARG") {
    IntConstant(
        "LUNARG_DIRECT_DRIVER_LOADING_SPEC_VERSION".."1"
    )

    StringConstant(
        "LUNARG_DIRECT_DRIVER_LOADING_EXTENSION_NAME".."VK_LUNARG_direct_driver_loading"
    )

    EnumConstant(
        "STRUCTURE_TYPE_DIRECT_DRIVER_LOADING_INFO_LUNARG".."1000459000",
        "STRUCTURE_TYPE_DIRECT_DRIVER_LOADING_LIST_LUNARG".."1000459001"
    )

    EnumConstant(
        "DIRECT_DRIVER_LOADING_MODE_EXCLUSIVE_LUNARG".."0",
        "DIRECT_DRIVER_LOADING_MODE_INCLUSIVE_LUNARG".."1"
    )
}
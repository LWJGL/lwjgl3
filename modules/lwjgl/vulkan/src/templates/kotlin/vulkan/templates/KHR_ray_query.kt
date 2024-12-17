/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_ray_query = "KHRRayQuery".nativeClassVK("KHR_ray_query", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_RAY_QUERY_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_RAY_QUERY_EXTENSION_NAME".."VK_KHR_ray_query"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_QUERY_FEATURES_KHR".."1000348013"
    )
}
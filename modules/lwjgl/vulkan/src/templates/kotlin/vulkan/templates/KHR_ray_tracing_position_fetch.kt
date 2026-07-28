/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_ray_tracing_position_fetch = "KHRRayTracingPositionFetch".nativeClassVK("KHR_ray_tracing_position_fetch", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_RAY_TRACING_POSITION_FETCH_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_RAY_TRACING_POSITION_FETCH_EXTENSION_NAME".."VK_KHR_ray_tracing_position_fetch"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_POSITION_FETCH_FEATURES_KHR".."1000481000"
    )

    EnumConstant(
        "BUILD_ACCELERATION_STRUCTURE_ALLOW_DATA_ACCESS_BIT_KHR".enum(0x00000800),
        "BUILD_ACCELERATION_STRUCTURE_ALLOW_DATA_ACCESS_KHR".enum(0x00000800)
    )
}
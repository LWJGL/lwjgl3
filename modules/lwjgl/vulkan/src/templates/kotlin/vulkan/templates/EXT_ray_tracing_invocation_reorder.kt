/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_ray_tracing_invocation_reorder = "EXTRayTracingInvocationReorder".nativeClassVK("EXT_ray_tracing_invocation_reorder", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_RAY_TRACING_INVOCATION_REORDER_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_RAY_TRACING_INVOCATION_REORDER_EXTENSION_NAME".."VK_EXT_ray_tracing_invocation_reorder"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_INVOCATION_REORDER_FEATURES_EXT".."1000581000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_INVOCATION_REORDER_PROPERTIES_EXT".."1000581001"
    )
}
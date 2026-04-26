/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_ray_tracing_invocation_reorder = "NVRayTracingInvocationReorder".nativeClassVK("NV_ray_tracing_invocation_reorder", type = "device", postfix = "NV") {
    IntConstant(
        "NV_RAY_TRACING_INVOCATION_REORDER_SPEC_VERSION".."1"
    )

    StringConstant(
        "NV_RAY_TRACING_INVOCATION_REORDER_EXTENSION_NAME".."VK_NV_ray_tracing_invocation_reorder"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_INVOCATION_REORDER_FEATURES_NV".."1000490000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_INVOCATION_REORDER_PROPERTIES_NV".."1000490001"
    )

    EnumConstant(
        "RAY_TRACING_INVOCATION_REORDER_MODE_NONE_NV".."0",
        "RAY_TRACING_INVOCATION_REORDER_MODE_REORDER_NV".."1"
    )
}
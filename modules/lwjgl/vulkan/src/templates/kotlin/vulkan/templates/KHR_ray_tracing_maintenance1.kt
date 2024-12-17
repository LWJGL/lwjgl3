/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_ray_tracing_maintenance1 = "KHRRayTracingMaintenance1".nativeClassVK("KHR_ray_tracing_maintenance1", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_RAY_TRACING_MAINTENANCE_1_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_RAY_TRACING_MAINTENANCE_1_EXTENSION_NAME".."VK_KHR_ray_tracing_maintenance1"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_MAINTENANCE_1_FEATURES_KHR".."1000386000"
    )

    EnumConstant(
        "QUERY_TYPE_ACCELERATION_STRUCTURE_SERIALIZATION_BOTTOM_LEVEL_POINTERS_KHR".."1000386000",
        "QUERY_TYPE_ACCELERATION_STRUCTURE_SIZE_KHR".."1000386001"
    )

    EnumConstantLong(
        "PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_COPY_BIT_KHR".enum(0x10000000L)
    )

    EnumConstantLong(
        "ACCESS_2_SHADER_BINDING_TABLE_READ_BIT_KHR".enum(0x10000000000L)
    )

    EnumConstant(
        "INDIRECT_COMMANDS_TOKEN_TYPE_TRACE_RAYS2_EXT".."1000386004"
    )

    DependsOn("VK_KHR_ray_tracing_pipeline")..void(
        "CmdTraceRaysIndirect2KHR",

        VkCommandBuffer("commandBuffer"),
        VkDeviceAddress("indirectDeviceAddress")
    )
}
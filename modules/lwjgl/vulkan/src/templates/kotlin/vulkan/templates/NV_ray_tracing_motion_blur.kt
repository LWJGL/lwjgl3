/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_ray_tracing_motion_blur = "NVRayTracingMotionBlur".nativeClassVK("NV_ray_tracing_motion_blur", type = "device", postfix = "NV") {
    IntConstant(
        "NV_RAY_TRACING_MOTION_BLUR_SPEC_VERSION".."1"
    )

    StringConstant(
        "NV_RAY_TRACING_MOTION_BLUR_EXTENSION_NAME".."VK_NV_ray_tracing_motion_blur"
    )

    EnumConstant(
        "STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_MOTION_TRIANGLES_DATA_NV".."1000327000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_MOTION_BLUR_FEATURES_NV".."1000327001",
        "STRUCTURE_TYPE_ACCELERATION_STRUCTURE_MOTION_INFO_NV".."1000327002"
    )

    EnumConstant(
        "BUILD_ACCELERATION_STRUCTURE_MOTION_BIT_NV".enum(0x00000020)
    )

    EnumConstant(
        "ACCELERATION_STRUCTURE_CREATE_MOTION_BIT_NV".enum(0x00000004)
    )

    EnumConstant(
        "PIPELINE_CREATE_RAY_TRACING_ALLOW_MOTION_BIT_NV".enum(0x00100000)
    )

    EnumConstant(
        "ACCELERATION_STRUCTURE_MOTION_INSTANCE_TYPE_STATIC_NV".."0",
        "ACCELERATION_STRUCTURE_MOTION_INSTANCE_TYPE_MATRIX_MOTION_NV".."1",
        "ACCELERATION_STRUCTURE_MOTION_INSTANCE_TYPE_SRT_MOTION_NV".."2"
    )
}
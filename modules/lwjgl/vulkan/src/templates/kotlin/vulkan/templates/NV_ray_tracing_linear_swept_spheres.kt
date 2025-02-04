/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_ray_tracing_linear_swept_spheres = "NVRayTracingLinearSweptSpheres".nativeClassVK("NV_ray_tracing_linear_swept_spheres", type = "device", postfix = "NV") {
    IntConstant(
        "NV_RAY_TRACING_LINEAR_SWEPT_SPHERES_SPEC_VERSION".."1"
    )

    StringConstant(
        "NV_RAY_TRACING_LINEAR_SWEPT_SPHERES_EXTENSION_NAME".."VK_NV_ray_tracing_linear_swept_spheres"
    )

    EnumConstant(
        "GEOMETRY_TYPE_SPHERES_NV".."1000429004",
        "GEOMETRY_TYPE_LINEAR_SWEPT_SPHERES_NV".."1000429005"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_LINEAR_SWEPT_SPHERES_FEATURES_NV".."1000429008",
        "STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_LINEAR_SWEPT_SPHERES_DATA_NV".."1000429009",
        "STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_SPHERES_DATA_NV".."1000429010"
    )

    EnumConstantLong(
        "PIPELINE_CREATE_2_RAY_TRACING_ALLOW_SPHERES_AND_LINEAR_SWEPT_SPHERES_BIT_NV".enum(0x200000000L)
    )

    EnumConstantLong(
        "FORMAT_FEATURE_2_ACCELERATION_STRUCTURE_RADIUS_BUFFER_BIT_NV".enum(0x8000000000000L)
    )

    EnumConstant(
        "RAY_TRACING_LSS_INDEXING_MODE_LIST_NV".."0",
        "RAY_TRACING_LSS_INDEXING_MODE_SUCCESSIVE_NV".."1"
    )

    EnumConstant(
        "RAY_TRACING_LSS_PRIMITIVE_END_CAPS_MODE_NONE_NV".."0",
        "RAY_TRACING_LSS_PRIMITIVE_END_CAPS_MODE_CHAINED_NV".."1"
    )
}
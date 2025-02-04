/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

public final class NVRayTracingLinearSweptSpheres {

    public static final int VK_NV_RAY_TRACING_LINEAR_SWEPT_SPHERES_SPEC_VERSION = 1;

    public static final String VK_NV_RAY_TRACING_LINEAR_SWEPT_SPHERES_EXTENSION_NAME = "VK_NV_ray_tracing_linear_swept_spheres";

    public static final int
        VK_GEOMETRY_TYPE_SPHERES_NV              = 1000429004,
        VK_GEOMETRY_TYPE_LINEAR_SWEPT_SPHERES_NV = 1000429005;

    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_LINEAR_SWEPT_SPHERES_FEATURES_NV = 1000429008,
        VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_LINEAR_SWEPT_SPHERES_DATA_NV = 1000429009,
        VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_SPHERES_DATA_NV              = 1000429010;

    public static final long VK_PIPELINE_CREATE_2_RAY_TRACING_ALLOW_SPHERES_AND_LINEAR_SWEPT_SPHERES_BIT_NV = 0x200000000L;

    public static final long VK_FORMAT_FEATURE_2_ACCELERATION_STRUCTURE_RADIUS_BUFFER_BIT_NV = 0x8000000000000L;

    public static final int
        VK_RAY_TRACING_LSS_INDEXING_MODE_LIST_NV       = 0,
        VK_RAY_TRACING_LSS_INDEXING_MODE_SUCCESSIVE_NV = 1;

    public static final int
        VK_RAY_TRACING_LSS_PRIMITIVE_END_CAPS_MODE_NONE_NV    = 0,
        VK_RAY_TRACING_LSS_PRIMITIVE_END_CAPS_MODE_CHAINED_NV = 1;

    private NVRayTracingLinearSweptSpheres() {}

}
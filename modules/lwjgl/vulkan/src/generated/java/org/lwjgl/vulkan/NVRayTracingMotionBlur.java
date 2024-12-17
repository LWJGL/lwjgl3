/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

public final class NVRayTracingMotionBlur {

    public static final int VK_NV_RAY_TRACING_MOTION_BLUR_SPEC_VERSION = 1;

    public static final String VK_NV_RAY_TRACING_MOTION_BLUR_EXTENSION_NAME = "VK_NV_ray_tracing_motion_blur";

    public static final int
        VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_MOTION_TRIANGLES_DATA_NV = 1000327000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_MOTION_BLUR_FEATURES_NV      = 1000327001,
        VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_MOTION_INFO_NV                    = 1000327002;

    public static final int VK_BUILD_ACCELERATION_STRUCTURE_MOTION_BIT_NV = 0x20;

    public static final int VK_ACCELERATION_STRUCTURE_CREATE_MOTION_BIT_NV = 0x4;

    public static final int VK_PIPELINE_CREATE_RAY_TRACING_ALLOW_MOTION_BIT_NV = 0x100000;

    public static final int
        VK_ACCELERATION_STRUCTURE_MOTION_INSTANCE_TYPE_STATIC_NV        = 0,
        VK_ACCELERATION_STRUCTURE_MOTION_INSTANCE_TYPE_MATRIX_MOTION_NV = 1,
        VK_ACCELERATION_STRUCTURE_MOTION_INSTANCE_TYPE_SRT_MOTION_NV    = 2;

    private NVRayTracingMotionBlur() {}

}
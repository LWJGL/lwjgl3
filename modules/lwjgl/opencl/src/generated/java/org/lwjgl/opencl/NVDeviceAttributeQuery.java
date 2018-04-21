/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

/**
 * Native bindings to the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/nv/cl_nv_device_attribute_query.txt">nv_device_attribute_query</a> extension.
 * 
 * <p>This extension provides a mechanism to query device attributes specific to <strong>NVIDIA</strong> hardware. This will enable the programmer to
 * optimize OpenCL kernels based on the specifics of the hardware.</p>
 */
public final class NVDeviceAttributeQuery {

    /** Returns the major revision number that defines the CUDA compute capability of the device. */
    public static final int CL_DEVICE_COMPUTE_CAPABILITY_MAJOR_NV = 0x4000;

    /** Returns the minor revision number that defines the CUDA compute capability of the device. */
    public static final int CL_DEVICE_COMPUTE_CAPABILITY_MINOR_NV = 0x4001;

    /** Maximum number of 32-bit registers available to a work-group; this number is shared by all work-groups simultaneously resident on a multiprocessor. */
    public static final int CL_DEVICE_REGISTERS_PER_BLOCK_NV = 0x4002;

    /** Warp size in work-items. */
    public static final int CL_DEVICE_WARP_SIZE_NV = 0x4003;

    /** Returns {@link CL10#CL_TRUE TRUE} if the device can concurrently copy memory between host and device while executing a kernel, or {@link CL10#CL_FALSE FALSE} if not. */
    public static final int CL_DEVICE_GPU_OVERLAP_NV = 0x4004;

    /** Returns {@link CL10#CL_TRUE TRUE} if there is a run time limit for kernels executed on the device, or {@link CL10#CL_FALSE FALSE} if not. */
    public static final int CL_DEVICE_KERNEL_EXEC_TIMEOUT_NV = 0x4005;

    /** Returns {@link CL10#CL_TRUE TRUE} if the device is integrated with the memory subsystem, or {@link CL10#CL_FALSE FALSE} if not. */
    public static final int CL_DEVICE_INTEGRATED_MEMORY_NV = 0x4006;

    private NVDeviceAttributeQuery() {}

}
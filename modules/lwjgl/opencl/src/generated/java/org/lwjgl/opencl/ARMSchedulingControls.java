/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenCL/extensions/arm/cl_arm_scheduling_controls.txt">arm_scheduling_controls</a> extension.
 * 
 * <p>This extension gives applications explicit control over some aspects of work scheduling. It can be used for performance tuning or debugging.</p>
 * 
 * <p>Requires {@link CL20 OpenCL 2.0}.</p>
 */
public final class ARMSchedulingControls {

    /**
     * Accepted value for the {@code param_name} parameter to {@link CL10#clGetDeviceInfo GetDeviceInfo}.
     * 
     * <p>Returns a {@code bitfield} of the scheduling controls this device supports:</p>
     * 
     * <ul>
     * <li>{@link #CL_DEVICE_SCHEDULING_KERNEL_BATCHING_ARM DEVICE_SCHEDULING_KERNEL_BATCHING_ARM} is set when the device supports {@link #CL_QUEUE_KERNEL_BATCHING_ARM QUEUE_KERNEL_BATCHING_ARM}.</li>
     * <li>{@link #CL_DEVICE_SCHEDULING_WORKGROUP_BATCH_SIZE_ARM DEVICE_SCHEDULING_WORKGROUP_BATCH_SIZE_ARM} is set when the device supports {@link #CL_KERNEL_EXEC_INFO_WORKGROUP_BATCH_SIZE_ARM KERNEL_EXEC_INFO_WORKGROUP_BATCH_SIZE_ARM}.</li>
     * <li>{@link #CL_DEVICE_SCHEDULING_WORKGROUP_BATCH_SIZE_MODIFIER_ARM DEVICE_SCHEDULING_WORKGROUP_BATCH_SIZE_MODIFIER_ARM} is set when the device supports {@link #CL_KERNEL_EXEC_INFO_WORKGROUP_BATCH_SIZE_MODIFIER_ARM KERNEL_EXEC_INFO_WORKGROUP_BATCH_SIZE_MODIFIER_ARM}.</li>
     * </ul>
     */
    public static final int CL_DEVICE_SCHEDULING_CONTROLS_CAPABILITIES_ARM = 0x41E4;

    /** Bits of the {@code bitfield} returned by the {@link #CL_DEVICE_SCHEDULING_CONTROLS_CAPABILITIES_ARM DEVICE_SCHEDULING_CONTROLS_CAPABILITIES_ARM} query. */
    public static final int
        CL_DEVICE_SCHEDULING_KERNEL_BATCHING_ARM               = (1 << 0),
        CL_DEVICE_SCHEDULING_WORKGROUP_BATCH_SIZE_ARM          = (1 << 1),
        CL_DEVICE_SCHEDULING_WORKGROUP_BATCH_SIZE_MODIFIER_ARM = (1 << 2),
        CL_DEVICE_SCHEDULING_DEFERRED_FLUSH_ARM                = (1 << 3),
        CL_DEVICE_SCHEDULING_REGISTER_ALLOCATION_ARM           = (1 << 4),
        CL_DEVICE_SCHEDULING_WARP_THROTTLING_ARM               = (1 << 5),
        CL_DEVICE_SCHEDULING_COMPUTE_UNIT_BATCH_QUEUE_SIZE_ARM = (1 << 6),
        CL_DEVICE_SCHEDULING_COMPUTE_UNIT_LIMIT_ARM            = (1 << 7);

    /** Accepted value for the {@code param_name} parameter to {@link CL10#clGetDeviceInfo GetDeviceInfo}. */
    public static final int
        CL_DEVICE_SUPPORTED_REGISTER_ALLOCATIONS_ARM = 0x41EB,
        CL_DEVICE_MAX_WARP_COUNT_ARM                 = 0x41EA;

    /** Accepted value for the {@code param_name} parameter to {@link CL20#clSetKernelExecInfo SetKernelExecInfo}. */
    public static final int
        CL_KERNEL_EXEC_INFO_WORKGROUP_BATCH_SIZE_ARM            = 0x41E5,
        CL_KERNEL_EXEC_INFO_WORKGROUP_BATCH_SIZE_MODIFIER_ARM   = 0x41E6,
        CL_KERNEL_EXEC_INFO_WARP_COUNT_LIMIT_ARM                = 0x41E8,
        CL_KERNEL_EXEC_INFO_COMPUTE_UNIT_MAX_QUEUED_BATCHES_ARM = 0x41F1;

    /** Accepted value for the {@code properties} parameter to {@link CL20#clCreateCommandQueueWithProperties CreateCommandQueueWithProperties}. */
    public static final int
        CL_QUEUE_KERNEL_BATCHING_ARM     = 0x41E7,
        CL_QUEUE_DEFERRED_FLUSH_ARM      = 0x41EC,
        CL_QUEUE_COMPUTE_UNIT_LIMIT_ARM  = 0x41F3;

    /** Accepted value for the param_name parameter to {@link CL10#clGetKernelInfo GetKernelInfo}. */
    public static final int CL_KERNEL_MAX_WARP_COUNT_ARM = 0x41E9;

    private ARMSchedulingControls() {}

}
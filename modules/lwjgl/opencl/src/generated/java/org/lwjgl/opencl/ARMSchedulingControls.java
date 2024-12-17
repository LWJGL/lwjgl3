/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

public final class ARMSchedulingControls {

    public static final int CL_DEVICE_SCHEDULING_CONTROLS_CAPABILITIES_ARM = 0x41E4;

    public static final int
        CL_DEVICE_SCHEDULING_KERNEL_BATCHING_ARM               = (1 << 0),
        CL_DEVICE_SCHEDULING_WORKGROUP_BATCH_SIZE_ARM          = (1 << 1),
        CL_DEVICE_SCHEDULING_WORKGROUP_BATCH_SIZE_MODIFIER_ARM = (1 << 2),
        CL_DEVICE_SCHEDULING_DEFERRED_FLUSH_ARM                = (1 << 3),
        CL_DEVICE_SCHEDULING_REGISTER_ALLOCATION_ARM           = (1 << 4),
        CL_DEVICE_SCHEDULING_WARP_THROTTLING_ARM               = (1 << 5),
        CL_DEVICE_SCHEDULING_COMPUTE_UNIT_BATCH_QUEUE_SIZE_ARM = (1 << 6),
        CL_DEVICE_SCHEDULING_COMPUTE_UNIT_LIMIT_ARM            = (1 << 7);

    public static final int
        CL_DEVICE_SUPPORTED_REGISTER_ALLOCATIONS_ARM = 0x41EB,
        CL_DEVICE_MAX_WARP_COUNT_ARM                 = 0x41EA;

    public static final int
        CL_KERNEL_EXEC_INFO_WORKGROUP_BATCH_SIZE_ARM            = 0x41E5,
        CL_KERNEL_EXEC_INFO_WORKGROUP_BATCH_SIZE_MODIFIER_ARM   = 0x41E6,
        CL_KERNEL_EXEC_INFO_WARP_COUNT_LIMIT_ARM                = 0x41E8,
        CL_KERNEL_EXEC_INFO_COMPUTE_UNIT_MAX_QUEUED_BATCHES_ARM = 0x41F1;

    public static final int
        CL_QUEUE_KERNEL_BATCHING_ARM     = 0x41E7,
        CL_QUEUE_DEFERRED_FLUSH_ARM      = 0x41EC,
        CL_QUEUE_COMPUTE_UNIT_LIMIT_ARM  = 0x41F3;

    public static final int CL_KERNEL_MAX_WARP_COUNT_ARM = 0x41E9;

    private ARMSchedulingControls() {}

}
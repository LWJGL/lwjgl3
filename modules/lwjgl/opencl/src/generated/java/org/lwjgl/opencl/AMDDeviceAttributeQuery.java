/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

/**
 * Native bindings to the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/amd/cl_amd_device_attribute_query.txt">amd_device_attribute_query</a> extension.
 * 
 * <p>This extension provides a means to query AMD-specific device attributes.</p>
 */
public final class AMDDeviceAttributeQuery {

    /**
     * Accepted as the {@code param_name} parameter of {@link CL10#clGetDeviceInfo GetDeviceInfo}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CL_DEVICE_PROFILING_TIMER_OFFSET_AMD DEVICE_PROFILING_TIMER_OFFSET_AMD} - Return the offset in nano-seconds between an event timestamp and Epoch.</li>
     * <li>{@link #CL_DEVICE_TOPOLOGY_AMD DEVICE_TOPOLOGY_AMD} - Return the topology for the device.</li>
     * <li>{@link #CL_DEVICE_BOARD_NAME_AMD DEVICE_BOARD_NAME_AMD} - Return the SKU board name for the device.</li>
     * <li>{@link #CL_DEVICE_GLOBAL_FREE_MEMORY_AMD DEVICE_GLOBAL_FREE_MEMORY_AMD} - Return the global free memory in KBytes for the device.</li>
     * <li>{@link #CL_DEVICE_SIMD_PER_COMPUTE_UNIT_AMD DEVICE_SIMD_PER_COMPUTE_UNIT_AMD} - Return number of SIMD (Single Instruction Multiple Data) units per compute unit that execute in parallel.</li>
     * <li>{@link #CL_DEVICE_SIMD_WIDTH_AMD DEVICE_SIMD_WIDTH_AMD} - Return the maximum number of work items from the same work group that can be executed by a SIMD in parellel.</li>
     * <li>{@link #CL_DEVICE_SIMD_INSTRUCTION_WIDTH_AMD DEVICE_SIMD_INSTRUCTION_WIDTH_AMD} - Return the number of instructions that a SIMD can execute in parallel.</li>
     * <li>{@link #CL_DEVICE_WAVEFRONT_WIDTH_AMD DEVICE_WAVEFRONT_WIDTH_AMD} - Return the number of workitems per wavefront.</li>
     * <li>{@link #CL_DEVICE_GLOBAL_MEM_CHANNELS_AMD DEVICE_GLOBAL_MEM_CHANNELS_AMD} - Return the number of global memory channels.</li>
     * <li>{@link #CL_DEVICE_GLOBAL_MEM_CHANNEL_BANKS_AMD DEVICE_GLOBAL_MEM_CHANNEL_BANKS_AMD} - Return the number of banks in each global memory channel.</li>
     * <li>{@link #CL_DEVICE_GLOBAL_MEM_CHANNEL_BANK_WIDTH_AMD DEVICE_GLOBAL_MEM_CHANNEL_BANK_WIDTH_AMD} - Return the width in bytes of each of global memory bank.</li>
     * <li>{@link #CL_DEVICE_LOCAL_MEM_SIZE_PER_COMPUTE_UNIT_AMD DEVICE_LOCAL_MEM_SIZE_PER_COMPUTE_UNIT_AMD} - Return the local memory size in bytes per CU.</li>
     * <li>{@link #CL_DEVICE_LOCAL_MEM_BANKS_AMD DEVICE_LOCAL_MEM_BANKS_AMD} - Return the number of banks of local memory.</li>
     * <li>{@link #CL_DEVICE_THREAD_TRACE_SUPPORTED_AMD DEVICE_THREAD_TRACE_SUPPORTED_AMD} - Return 1 if thread trace is supported, 0 otherwise.</li>
     * <li>{@link #CL_DEVICE_GFXIP_MAJOR_AMD DEVICE_GFXIP_MAJOR_AMD} - Return the core engine GFXIP major version.</li>
     * <li>{@link #CL_DEVICE_GFXIP_MINOR_AMD DEVICE_GFXIP_MINOR_AMD} - Return the core engine GFXIP minor version.</li>
     * <li>{@link #CL_DEVICE_AVAILABLE_ASYNC_QUEUES_AMD DEVICE_AVAILABLE_ASYNC_QUEUES_AMD} - Return the number of available async queues.</li>
     * <li>{@link #CL_DEVICE_PREFERRED_WORK_GROUP_SIZE_AMD DEVICE_PREFERRED_WORK_GROUP_SIZE_AMD} - Return the preferred work group size.</li>
     * </ul>
     */
    public static final int
        CL_DEVICE_PROFILING_TIMER_OFFSET_AMD          = 0x4036,
        CL_DEVICE_TOPOLOGY_AMD                        = 0x4037,
        CL_DEVICE_BOARD_NAME_AMD                      = 0x4038,
        CL_DEVICE_GLOBAL_FREE_MEMORY_AMD              = 0x4039,
        CL_DEVICE_SIMD_PER_COMPUTE_UNIT_AMD           = 0x4040,
        CL_DEVICE_SIMD_WIDTH_AMD                      = 0x4041,
        CL_DEVICE_SIMD_INSTRUCTION_WIDTH_AMD          = 0x4042,
        CL_DEVICE_WAVEFRONT_WIDTH_AMD                 = 0x4043,
        CL_DEVICE_GLOBAL_MEM_CHANNELS_AMD             = 0x4044,
        CL_DEVICE_GLOBAL_MEM_CHANNEL_BANKS_AMD        = 0x4045,
        CL_DEVICE_GLOBAL_MEM_CHANNEL_BANK_WIDTH_AMD   = 0x4046,
        CL_DEVICE_LOCAL_MEM_SIZE_PER_COMPUTE_UNIT_AMD = 0x4047,
        CL_DEVICE_LOCAL_MEM_BANKS_AMD                 = 0x4048,
        CL_DEVICE_THREAD_TRACE_SUPPORTED_AMD          = 0x4049,
        CL_DEVICE_GFXIP_MAJOR_AMD                     = 0x404A,
        CL_DEVICE_GFXIP_MINOR_AMD                     = 0x404B,
        CL_DEVICE_AVAILABLE_ASYNC_QUEUES_AMD          = 0x404C,
        CL_DEVICE_PREFERRED_WORK_GROUP_SIZE_AMD       = 0x4030;

    private AMDDeviceAttributeQuery() {}

}
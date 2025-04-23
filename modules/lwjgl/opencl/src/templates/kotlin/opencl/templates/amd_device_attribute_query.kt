/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val amd_device_attribute_query = "AMDDeviceAttributeQuery".nativeClassCL("amd_device_attribute_query", AMD) {
    EnumConstant(
        "DEVICE_PROFILING_TIMER_OFFSET_AMD".enum(0x4036),
        "DEVICE_TOPOLOGY_AMD".enum(0x4037),
        "DEVICE_BOARD_NAME_AMD".enum(0x4038),
        "DEVICE_GLOBAL_FREE_MEMORY_AMD".enum(0x4039),
        "DEVICE_SIMD_PER_COMPUTE_UNIT_AMD".enum(0x4040),
        "DEVICE_SIMD_WIDTH_AMD".enum(0x4041),
        "DEVICE_SIMD_INSTRUCTION_WIDTH_AMD".enum(0x4042),
        "DEVICE_WAVEFRONT_WIDTH_AMD".enum(0x4043),
        "DEVICE_GLOBAL_MEM_CHANNELS_AMD".enum(0x4044),
        "DEVICE_GLOBAL_MEM_CHANNEL_BANKS_AMD".enum(0x4045),
        "DEVICE_GLOBAL_MEM_CHANNEL_BANK_WIDTH_AMD".enum(0x4046),
        "DEVICE_LOCAL_MEM_SIZE_PER_COMPUTE_UNIT_AMD".enum(0x4047),
        "DEVICE_LOCAL_MEM_BANKS_AMD".enum(0x4048),
        "DEVICE_THREAD_TRACE_SUPPORTED_AMD".enum(0x4049),
        "DEVICE_GFXIP_MAJOR_AMD".enum(0x404A),
        "DEVICE_GFXIP_MINOR_AMD".enum(0x404B),
        "DEVICE_AVAILABLE_ASYNC_QUEUES_AMD".enum(0x404C),
        "DEVICE_PREFERRED_WORK_GROUP_SIZE_AMD".enum(0x4030),
        "DEVICE_MAX_WORK_GROUP_SIZE_AMD".enum(0x4031),
        "DEVICE_PREFERRED_CONSTANT_BUFFER_SIZE_AMD".enum(0x4033),
        "DEVICE_PCIE_ID_AMD".enum(0x4034)
    )
}
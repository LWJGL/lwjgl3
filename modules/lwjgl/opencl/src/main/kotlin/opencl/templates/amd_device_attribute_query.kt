/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val amd_device_attribute_query = "AMDDeviceAttributeQuery".nativeClassCL("amd_device_attribute_query", AMD) {
    documentation =
        """
        Native bindings to the $extensionLink extension.

        This extension provides a means to query AMD-specific device attributes.
        """

    EnumConstant(
        "Accepted as the {@code param_name} parameter of #GetDeviceInfo().",

        "DEVICE_PROFILING_TIMER_OFFSET_AMD".enum("Return the offset in nano-seconds between an event timestamp and Epoch.", 0x4036),
        "DEVICE_TOPOLOGY_AMD".enum("Return the topology for the device.", 0x4037),
        "DEVICE_BOARD_NAME_AMD".enum("Return the SKU board name for the device.", 0x4038),
        "DEVICE_GLOBAL_FREE_MEMORY_AMD".enum("Return the global free memory in KBytes for the device.", 0x4039),
        "DEVICE_SIMD_PER_COMPUTE_UNIT_AMD".enum("Return number of SIMD (Single Instruction Multiple Data) units per compute unit that execute in parallel.", 0x4040),
        "DEVICE_SIMD_WIDTH_AMD".enum("Return the maximum number of work items from the same work group that can be executed by a SIMD in parellel.", 0x4041),
        "DEVICE_SIMD_INSTRUCTION_WIDTH_AMD".enum("Return the number of instructions that a SIMD can execute in parallel.", 0x4042),
        "DEVICE_WAVEFRONT_WIDTH_AMD".enum("Return the number of workitems per wavefront.", 0x4043),
        "DEVICE_GLOBAL_MEM_CHANNELS_AMD".enum("Return the number of global memory channels.", 0x4044),
        "DEVICE_GLOBAL_MEM_CHANNEL_BANKS_AMD".enum("Return the number of banks in each global memory channel.", 0x4045),
        "DEVICE_GLOBAL_MEM_CHANNEL_BANK_WIDTH_AMD".enum("Return the width in bytes of each of global memory bank.", 0x4046),
        "DEVICE_LOCAL_MEM_SIZE_PER_COMPUTE_UNIT_AMD".enum("Return the local memory size in bytes per CU.", 0x4047),
        "DEVICE_LOCAL_MEM_BANKS_AMD".enum("Return the number of banks of local memory.", 0x4048),
        "DEVICE_THREAD_TRACE_SUPPORTED_AMD".enum("Return 1 if thread trace is supported, 0 otherwise.", 0x4049),
        "DEVICE_GFXIP_MAJOR_AMD".enum("Return the core engine GFXIP major version.", 0x404A),
        "DEVICE_GFXIP_MINOR_AMD".enum("Return the core engine GFXIP minor version.", 0x404B),
        "DEVICE_AVAILABLE_ASYNC_QUEUES_AMD".enum("Return the number of available async queues.", 0x404C),
        "DEVICE_PREFERRED_WORK_GROUP_SIZE_AMD".enum("Return the preferred work group size.", 0x4030)
    )
}
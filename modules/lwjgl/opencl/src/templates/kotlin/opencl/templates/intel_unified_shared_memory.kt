/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val intel_unified_shared_memory = "INTELUnifiedSharedMemory".nativeClassCL("intel_unified_shared_memory", INTEL) {
    IntConstant(
        "DEVICE_HOST_MEM_CAPABILITIES_INTEL"..0x4190,
        "DEVICE_DEVICE_MEM_CAPABILITIES_INTEL"..0x4191,
        "DEVICE_SINGLE_DEVICE_SHARED_MEM_CAPABILITIES_INTEL"..0x4192,
        "DEVICE_CROSS_DEVICE_SHARED_MEM_CAPABILITIES_INTEL"..0x4193,
        "DEVICE_SHARED_SYSTEM_MEM_CAPABILITIES_INTEL"..0x4194
    )

    IntConstant(
        "UNIFIED_SHARED_MEMORY_ACCESS_INTEL".."1 << 0",
        "UNIFIED_SHARED_MEMORY_ATOMIC_ACCESS_INTEL".."1 << 1",
        "UNIFIED_SHARED_MEMORY_CONCURRENT_ACCESS_INTEL".."1 << 2",
        "UNIFIED_SHARED_MEMORY_CONCURRENT_ATOMIC_ACCESS_INTEL".."1 << 3"
    )

    IntConstant(
        "MEM_ALLOC_FLAGS_INTEL"..0x4195
    )

    EnumConstant(
        "MEM_ALLOC_WRITE_COMBINED_INTEL".enum("1 << 0"),
        "MEM_ALLOC_INITIAL_PLACEMENT_DEVICE_INTEL".enum("1 << 1"),
        "MEM_ALLOC_INITIAL_PLACEMENT_HOST_INTEL".enum("1 << 2")
    )

    IntConstant(
        "MEM_ALLOC_TYPE_INTEL"..0x419A,
        "MEM_ALLOC_BASE_PTR_INTEL"..0x419B,
        "MEM_ALLOC_SIZE_INTEL"..0x419C,
        "MEM_ALLOC_DEVICE_INTEL"..0x419D
    )

    IntConstant(
        "MEM_TYPE_UNKNOWN_INTEL"..0x4196,
        "MEM_TYPE_HOST_INTEL"..0x4197,
        "MEM_TYPE_DEVICE_INTEL"..0x4198,
        "MEM_TYPE_SHARED_INTEL"..0x4199
    )

    IntConstant(
        "KERNEL_EXEC_INFO_INDIRECT_HOST_ACCESS_INTEL"..0x4200,
        "KERNEL_EXEC_INFO_INDIRECT_DEVICE_ACCESS_INTEL"..0x4201,
        "KERNEL_EXEC_INFO_INDIRECT_SHARED_ACCESS_INTEL"..0x4202
    )

    IntConstant(
        "KERNEL_EXEC_INFO_USM_PTRS_INTEL"..0x4203
    )

    IntConstant(
        "COMMAND_MEMFILL_INTEL"..0x4204,
        "COMMAND_MEMCPY_INTEL"..0x4205,
        "COMMAND_MIGRATEMEM_INTEL"..0x4206,
        "COMMAND_MEMADVISE_INTEL"..0x4207
    )

    void.p(
        "HostMemAllocINTEL",

        cl_context("context"),
        nullable..NullTerminated..cl_mem_properties_intel.const.p("properties"),
        AutoSizeResult..size_t("size"),
        cl_uint("alignment"),
        ERROR_RET
    )

    void.p(
        "DeviceMemAllocINTEL",

        cl_context("context"),
        cl_device_id("device"),
        nullable..NullTerminated..cl_mem_properties_intel.const.p("properties"),
        AutoSizeResult..size_t("size"),
        cl_uint("alignment"),
        ERROR_RET
    )

    void.p(
        "SharedMemAllocINTEL",

        cl_context("context"),
        nullable..cl_device_id("device"),
        nullable..NullTerminated..cl_mem_properties_intel.const.p("properties"),
        AutoSizeResult..size_t("size"),
        cl_uint("alignment"),
        ERROR_RET
    )

    cl_int(
        "MemFreeINTEL",

        cl_context("context"),
        Unsafe..nullable..void.p("ptr")
    )

    cl_int(
        "MemBlockingFreeINTEL",

        cl_context("context"),
        Unsafe..nullable..void.p("ptr")
    )

    cl_int(
        "GetMemAllocInfoINTEL",

        cl_context("context"),
        Unsafe..void.const.p("ptr"),
        cl_mem_info_intel("param_name"),
        PARAM_VALUE_SIZE,
        MultiType(
            PointerMapping.DATA_INT,
            PointerMapping.DATA_POINTER
        )..nullable..void.p("param_value"),
        PARAM_VALUE_SIZE_RET
    )

    cl_int(
        "SetKernelArgMemPointerINTEL",

        cl_kernel("kernel"),
        cl_uint("arg_index"),
        MultiTypeAll..Unsafe..void.const.p("arg_value")
    )

    cl_int(
        "EnqueueMemFillINTEL",

        cl_command_queue("command_queue"),
        void.p("dst_ptr"),
        void.const.p("pattern"),
        AutoSize("pattern")..size_t("pattern_size"),
        AutoSize("dst_ptr")..size_t("size"),
        NEWL,
        EWL,
        EVENT
    )

    cl_int(
        "EnqueueMemcpyINTEL",

        cl_command_queue("command_queue"),
        cl_bool("blocking"),
        Check("size")..void.p("dst_ptr"),
        Check("size")..void.const.p("src_ptr"),
        size_t("size"),
        NEWL,
        EWL,
        EVENT
    )

    cl_int(
        "EnqueueMigrateMemINTEL",

        cl_command_queue("command_queue"),
        void.const.p("ptr"),
        AutoSize("ptr")..size_t("size"),
        cl_mem_migration_flags("flags"),
        NEWL,
        EWL,
        EVENT
    )

    cl_int(
        "EnqueueMemAdviseINTEL",

        cl_command_queue("command_queue"),
        void.const.p("ptr"),
        AutoSize("ptr")..size_t("size"),
        cl_mem_advice_intel("advice"),
        NEWL,
        EWL,
        EVENT
    )
}
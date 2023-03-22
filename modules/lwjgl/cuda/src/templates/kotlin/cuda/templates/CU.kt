/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package cuda.templates

import cuda.*
import org.lwjgl.generator.*

val CU = "CU".nativeClass(Module.CUDA, prefix = "CU", binding = NVCUDA_BINDING) {
    javaImport("static org.lwjgl.cuda.CUDA.*")

    documentation =
        """
        Contains bindings to the <a href="https://docs.nvidia.com/cuda/cuda-driver-api/index.html">CUDA Driver API</a>.

        Functionality up to CUDA version 3.2, which is the minimum version compatible with the LWJGL bindings, is guaranteed to be available. Functions
        introduced after CUDA 3.2 may or may not be missing, depending on the CUDA version available at runtime. 
        """

    IntConstant("", "CUDA_VERSION".."12010")

    IntConstant("", "IPC_HANDLE_SIZE".."64")

    EnumConstant(
        "{@code CUipcMem_flags}",

        "IPC_MEM_LAZY_ENABLE_PEER_ACCESS".enum("", 0x1)
    )

    EnumConstant(
        "{@code CUmemAttach_flags}",

        "MEM_ATTACH_GLOBAL".enum("", 0x1),
        "MEM_ATTACH_HOST".enum("", 0x2),
        "MEM_ATTACH_SINGLE".enum("", 0x4)
    )

    EnumConstant(
        "{@code CUctx_flags}",

        "CTX_SCHED_AUTO".enum("", 0x00),
        "CTX_SCHED_SPIN".enum("", 0x01),
        "CTX_SCHED_YIELD".enum("", 0x02),
        "CTX_SCHED_BLOCKING_SYNC".enum("", 0x04),
        "CTX_BLOCKING_SYNC".enum("", 0x04),
        "CTX_SCHED_MASK".enum("", 0x07),
        "CTX_MAP_HOST".enum("", 0x08),
        "CTX_LMEM_RESIZE_TO_MAX".enum("", 0x10),
        "CTX_COREDUMP_ENABLE".enum("", 0x20),
        "CTX_USER_COREDUMP_ENABLE".enum("", 0x40),
        "CTX_SYNC_MEMOPS".enum("", 0x80),
        "CTX_FLAGS_MASK".enum("", 0xFF)
    )

    EnumConstant(
        "{@code CUevent_sched_flags}",

        "EVENT_SCHED_AUTO".enum("", 0x00),
        "EVENT_SCHED_SPIN".enum("", 0x01),
        "EVENT_SCHED_YIELD".enum("", 0x02),
        "EVENT_SCHED_BLOCKING_SYNC".enum("", 0x04)
    )

    EnumConstant(
        "{@code cl_event_flags}",

        "NVCL_EVENT_SCHED_AUTO".enum("", 0x00),
        "NVCL_EVENT_SCHED_SPIN".enum("", 0x01),
        "NVCL_EVENT_SCHED_YIELD".enum("", 0x02),
        "NVCL_EVENT_SCHED_BLOCKING_SYNC".enum("", 0x04)
    ).noPrefix()

    EnumConstant(
        "{@code cl_context_flags}",

        "NVCL_CTX_SCHED_AUTO".enum("", 0x00),
        "NVCL_CTX_SCHED_SPIN".enum("", 0x01),
        "NVCL_CTX_SCHED_YIELD".enum("", 0x02),
        "NVCL_CTX_SCHED_BLOCKING_SYNC".enum("", 0x04)
    ).noPrefix()

    EnumConstant(
        "{@code CUstream_flags}",

        "STREAM_DEFAULT".enum("", 0x0),
        "STREAM_NON_BLOCKING".enum("", 0x1)
    )

    LongConstant(
        "",

        "STREAM_LEGACY"..0x1L,
        "STREAM_PER_THREAD"..0x2L
    )

    EnumConstant(
        "{@code CUevent_flags}",

        "EVENT_DEFAULT".enum("", 0x0),
        "EVENT_BLOCKING_SYNC".enum("", 0x1),
        "EVENT_DISABLE_TIMING".enum("", 0x2),
        "EVENT_INTERPROCESS".enum("", 0x4)
    )

    EnumConstant(
        "{@code CUevent_record_flags}",

        "EVENT_RECORD_DEFAULT".enum("", 0x0),
        "EVENT_RECORD_EXTERNAL".enum
    )

    EnumConstant(
        "{@code CUevent_wait_flags}",

        "EVENT_WAIT_DEFAULT".enum("", 0x0),
        "EVENT_WAIT_EXTERNAL".enum
    )

    EnumConstant(
        "{@code CUstreamWaitValue_flags}",

        "STREAM_WAIT_VALUE_GEQ".enum("", 0x0),
        "STREAM_WAIT_VALUE_EQ".enum("", 0x1),
        "STREAM_WAIT_VALUE_AND".enum("", 0x2),
        "STREAM_WAIT_VALUE_NOR".enum("", 0x3),
        "STREAM_WAIT_VALUE_FLUSH".enum("", "1<<30")
    )

    EnumConstant(
        "{@code CUstreamWriteValue_flags}",

        "STREAM_WRITE_VALUE_DEFAULT".enum("", 0x0),
        "STREAM_WRITE_VALUE_NO_MEMORY_BARRIER".enum("", 0x1)
    )

    EnumConstant(
        "{@code CUstreamBatchMemOpType}",

        "STREAM_MEM_OP_WAIT_VALUE_32".enum("", "1"),
        "STREAM_MEM_OP_WRITE_VALUE_32".enum("", "2"),
        "STREAM_MEM_OP_WAIT_VALUE_64".enum("", "4"),
        "STREAM_MEM_OP_WRITE_VALUE_64".enum("", "5"),
        "STREAM_MEM_OP_BARRIER".enum("", "6"),
        "STREAM_MEM_OP_FLUSH_REMOTE_WRITES".enum("", "3")
    )

    EnumConstant(
        "{@code CUstreamMemoryBarrier_flags}",

        "STREAM_MEMORY_BARRIER_TYPE_SYS".enum("", 0x0),
        "STREAM_MEMORY_BARRIER_TYPE_GPU".enum("", 0x1)
    )

    EnumConstant(
        "{@code CUoccupancy_flags}",

        "OCCUPANCY_DEFAULT".enum("", 0x0),
        "OCCUPANCY_DISABLE_CACHING_OVERRIDE".enum("", 0x1)
    )

    EnumConstant(
        "{@code CUstreamUpdateCaptureDependencies_flags}",

        "STREAM_ADD_CAPTURE_DEPENDENCIES".enum("", 0x0),
        "STREAM_SET_CAPTURE_DEPENDENCIES".enum("", 0x1)
    )

    EnumConstant(
        "{@code CUarray_format}",

        "AD_FORMAT_UNSIGNED_INT8".enum("", "0x01"),
        "AD_FORMAT_UNSIGNED_INT16".enum("", "0x02"),
        "AD_FORMAT_UNSIGNED_INT32".enum("", "0x03"),
        "AD_FORMAT_SIGNED_INT8".enum("", "0x08"),
        "AD_FORMAT_SIGNED_INT16".enum("", "0x09"),
        "AD_FORMAT_SIGNED_INT32".enum("", "0x0a"),
        "AD_FORMAT_HALF".enum("", "0x10"),
        "AD_FORMAT_FLOAT".enum("", "0x20"),
        "AD_FORMAT_NV12".enum("", "0xb0"),
        "AD_FORMAT_UNORM_INT8X1".enum("", "0xc0"),
        "AD_FORMAT_UNORM_INT8X2".enum("", "0xc1"),
        "AD_FORMAT_UNORM_INT8X4".enum("", "0xc2"),
        "AD_FORMAT_UNORM_INT16X1".enum("", "0xc3"),
        "AD_FORMAT_UNORM_INT16X2".enum("", "0xc4"),
        "AD_FORMAT_UNORM_INT16X4".enum("", "0xc5"),
        "AD_FORMAT_SNORM_INT8X1".enum("", "0xc6"),
        "AD_FORMAT_SNORM_INT8X2".enum("", "0xc7"),
        "AD_FORMAT_SNORM_INT8X4".enum("", "0xc8"),
        "AD_FORMAT_SNORM_INT16X1".enum("", "0xc9"),
        "AD_FORMAT_SNORM_INT16X2".enum("", "0xca"),
        "AD_FORMAT_SNORM_INT16X4".enum("", "0xcb"),
        "AD_FORMAT_BC1_UNORM".enum("", "0x91"),
        "AD_FORMAT_BC1_UNORM_SRGB".enum("", "0x92"),
        "AD_FORMAT_BC2_UNORM".enum("", "0x93"),
        "AD_FORMAT_BC2_UNORM_SRGB".enum("", "0x94"),
        "AD_FORMAT_BC3_UNORM".enum("", "0x95"),
        "AD_FORMAT_BC3_UNORM_SRGB".enum("", "0x96"),
        "AD_FORMAT_BC4_UNORM".enum("", "0x97"),
        "AD_FORMAT_BC4_SNORM".enum("", "0x98"),
        "AD_FORMAT_BC5_UNORM".enum("", "0x99"),
        "AD_FORMAT_BC5_SNORM".enum("", "0x9a"),
        "AD_FORMAT_BC6H_UF16".enum("", "0x9b"),
        "AD_FORMAT_BC6H_SF16".enum("", "0x9c"),
        "AD_FORMAT_BC7_UNORM".enum("", "0x9d"),
        "AD_FORMAT_BC7_UNORM_SRGB".enum("", "0x9e")
    )

    EnumConstant(
        "{@code CUaddress_mode}",

        "TR_ADDRESS_MODE_WRAP".enum("", 0),
        "TR_ADDRESS_MODE_CLAMP".enum("", 1),
        "TR_ADDRESS_MODE_MIRROR".enum("", 2),
        "TR_ADDRESS_MODE_BORDER".enum("", 3)
    )

    EnumConstant(
        "{@code CUfilter_mode}",

        "TR_FILTER_MODE_POINT".enum("", 0),
        "TR_FILTER_MODE_LINEAR".enum("", 1)
    )

    EnumConstant(
        "{@code CUdevice_attribute}",

        "DEVICE_ATTRIBUTE_MAX_THREADS_PER_BLOCK".enum("", "1"),
        "DEVICE_ATTRIBUTE_MAX_BLOCK_DIM_X".enum,
        "DEVICE_ATTRIBUTE_MAX_BLOCK_DIM_Y".enum,
        "DEVICE_ATTRIBUTE_MAX_BLOCK_DIM_Z".enum,
        "DEVICE_ATTRIBUTE_MAX_GRID_DIM_X".enum,
        "DEVICE_ATTRIBUTE_MAX_GRID_DIM_Y".enum,
        "DEVICE_ATTRIBUTE_MAX_GRID_DIM_Z".enum,
        "DEVICE_ATTRIBUTE_MAX_SHARED_MEMORY_PER_BLOCK".enum,
        "DEVICE_ATTRIBUTE_SHARED_MEMORY_PER_BLOCK".enum("", "8"),
        "DEVICE_ATTRIBUTE_TOTAL_CONSTANT_MEMORY".enum,
        "DEVICE_ATTRIBUTE_WARP_SIZE".enum,
        "DEVICE_ATTRIBUTE_MAX_PITCH".enum,
        "DEVICE_ATTRIBUTE_MAX_REGISTERS_PER_BLOCK".enum,
        "DEVICE_ATTRIBUTE_REGISTERS_PER_BLOCK".enum("", "12"),
        "DEVICE_ATTRIBUTE_CLOCK_RATE".enum,
        "DEVICE_ATTRIBUTE_TEXTURE_ALIGNMENT".enum,
        "DEVICE_ATTRIBUTE_GPU_OVERLAP".enum,
        "DEVICE_ATTRIBUTE_MULTIPROCESSOR_COUNT".enum,
        "DEVICE_ATTRIBUTE_KERNEL_EXEC_TIMEOUT".enum,
        "DEVICE_ATTRIBUTE_INTEGRATED".enum,
        "DEVICE_ATTRIBUTE_CAN_MAP_HOST_MEMORY".enum,
        "DEVICE_ATTRIBUTE_COMPUTE_MODE".enum,
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_WIDTH".enum,
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_WIDTH".enum,
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_HEIGHT".enum,
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_WIDTH".enum,
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_HEIGHT".enum,
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_DEPTH".enum,
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LAYERED_WIDTH".enum,
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LAYERED_HEIGHT".enum,
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LAYERED_LAYERS".enum,
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_ARRAY_WIDTH".enum("", "27"),
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_ARRAY_HEIGHT".enum,
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_ARRAY_NUMSLICES".enum,
        "DEVICE_ATTRIBUTE_SURFACE_ALIGNMENT".enum,
        "DEVICE_ATTRIBUTE_CONCURRENT_KERNELS".enum,
        "DEVICE_ATTRIBUTE_ECC_ENABLED".enum,
        "DEVICE_ATTRIBUTE_PCI_BUS_ID".enum,
        "DEVICE_ATTRIBUTE_PCI_DEVICE_ID".enum,
        "DEVICE_ATTRIBUTE_TCC_DRIVER".enum,
        "DEVICE_ATTRIBUTE_MEMORY_CLOCK_RATE".enum,
        "DEVICE_ATTRIBUTE_GLOBAL_MEMORY_BUS_WIDTH".enum,
        "DEVICE_ATTRIBUTE_L2_CACHE_SIZE".enum,
        "DEVICE_ATTRIBUTE_MAX_THREADS_PER_MULTIPROCESSOR".enum,
        "DEVICE_ATTRIBUTE_ASYNC_ENGINE_COUNT".enum,
        "DEVICE_ATTRIBUTE_UNIFIED_ADDRESSING".enum,
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_LAYERED_WIDTH".enum,
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_LAYERED_LAYERS".enum,
        "DEVICE_ATTRIBUTE_CAN_TEX2D_GATHER".enum,
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_GATHER_WIDTH".enum,
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_GATHER_HEIGHT".enum,
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_WIDTH_ALTERNATE".enum,
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_HEIGHT_ALTERNATE".enum,
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_DEPTH_ALTERNATE".enum,
        "DEVICE_ATTRIBUTE_PCI_DOMAIN_ID".enum,
        "DEVICE_ATTRIBUTE_TEXTURE_PITCH_ALIGNMENT".enum,
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURECUBEMAP_WIDTH".enum,
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURECUBEMAP_LAYERED_WIDTH".enum,
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURECUBEMAP_LAYERED_LAYERS".enum,
        "DEVICE_ATTRIBUTE_MAXIMUM_SURFACE1D_WIDTH".enum,
        "DEVICE_ATTRIBUTE_MAXIMUM_SURFACE2D_WIDTH".enum,
        "DEVICE_ATTRIBUTE_MAXIMUM_SURFACE2D_HEIGHT".enum,
        "DEVICE_ATTRIBUTE_MAXIMUM_SURFACE3D_WIDTH".enum,
        "DEVICE_ATTRIBUTE_MAXIMUM_SURFACE3D_HEIGHT".enum,
        "DEVICE_ATTRIBUTE_MAXIMUM_SURFACE3D_DEPTH".enum,
        "DEVICE_ATTRIBUTE_MAXIMUM_SURFACE1D_LAYERED_WIDTH".enum,
        "DEVICE_ATTRIBUTE_MAXIMUM_SURFACE1D_LAYERED_LAYERS".enum,
        "DEVICE_ATTRIBUTE_MAXIMUM_SURFACE2D_LAYERED_WIDTH".enum,
        "DEVICE_ATTRIBUTE_MAXIMUM_SURFACE2D_LAYERED_HEIGHT".enum,
        "DEVICE_ATTRIBUTE_MAXIMUM_SURFACE2D_LAYERED_LAYERS".enum,
        "DEVICE_ATTRIBUTE_MAXIMUM_SURFACECUBEMAP_WIDTH".enum,
        "DEVICE_ATTRIBUTE_MAXIMUM_SURFACECUBEMAP_LAYERED_WIDTH".enum,
        "DEVICE_ATTRIBUTE_MAXIMUM_SURFACECUBEMAP_LAYERED_LAYERS".enum,
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_LINEAR_WIDTH".enum,
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LINEAR_WIDTH".enum,
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LINEAR_HEIGHT".enum,
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LINEAR_PITCH".enum,
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_MIPMAPPED_WIDTH".enum,
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_MIPMAPPED_HEIGHT".enum,
        "DEVICE_ATTRIBUTE_COMPUTE_CAPABILITY_MAJOR".enum,
        "DEVICE_ATTRIBUTE_COMPUTE_CAPABILITY_MINOR".enum,
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_MIPMAPPED_WIDTH".enum,
        "DEVICE_ATTRIBUTE_STREAM_PRIORITIES_SUPPORTED".enum,
        "DEVICE_ATTRIBUTE_GLOBAL_L1_CACHE_SUPPORTED".enum,
        "DEVICE_ATTRIBUTE_LOCAL_L1_CACHE_SUPPORTED".enum,
        "DEVICE_ATTRIBUTE_MAX_SHARED_MEMORY_PER_MULTIPROCESSOR".enum,
        "DEVICE_ATTRIBUTE_MAX_REGISTERS_PER_MULTIPROCESSOR".enum,
        "DEVICE_ATTRIBUTE_MANAGED_MEMORY".enum,
        "DEVICE_ATTRIBUTE_MULTI_GPU_BOARD".enum,
        "DEVICE_ATTRIBUTE_MULTI_GPU_BOARD_GROUP_ID".enum,
        "DEVICE_ATTRIBUTE_HOST_NATIVE_ATOMIC_SUPPORTED".enum,
        "DEVICE_ATTRIBUTE_SINGLE_TO_DOUBLE_PRECISION_PERF_RATIO".enum,
        "DEVICE_ATTRIBUTE_PAGEABLE_MEMORY_ACCESS".enum,
        "DEVICE_ATTRIBUTE_CONCURRENT_MANAGED_ACCESS".enum,
        "DEVICE_ATTRIBUTE_COMPUTE_PREEMPTION_SUPPORTED".enum,
        "DEVICE_ATTRIBUTE_CAN_USE_HOST_POINTER_FOR_REGISTERED_MEM".enum,
        "DEVICE_ATTRIBUTE_CAN_USE_STREAM_MEM_OPS_V1".enum,
        "DEVICE_ATTRIBUTE_CAN_USE_64_BIT_STREAM_MEM_OPS_V1".enum,
        "DEVICE_ATTRIBUTE_CAN_USE_STREAM_WAIT_VALUE_NOR_V1".enum,
        "DEVICE_ATTRIBUTE_COOPERATIVE_LAUNCH".enum,
        "DEVICE_ATTRIBUTE_COOPERATIVE_MULTI_DEVICE_LAUNCH".enum,
        "DEVICE_ATTRIBUTE_MAX_SHARED_MEMORY_PER_BLOCK_OPTIN".enum,
        "DEVICE_ATTRIBUTE_CAN_FLUSH_REMOTE_WRITES".enum,
        "DEVICE_ATTRIBUTE_HOST_REGISTER_SUPPORTED".enum,
        "DEVICE_ATTRIBUTE_PAGEABLE_MEMORY_ACCESS_USES_HOST_PAGE_TABLES".enum,
        "DEVICE_ATTRIBUTE_DIRECT_MANAGED_MEM_ACCESS_FROM_HOST".enum,
        "DEVICE_ATTRIBUTE_VIRTUAL_ADDRESS_MANAGEMENT_SUPPORTED".enum,
        "DEVICE_ATTRIBUTE_VIRTUAL_MEMORY_MANAGEMENT_SUPPORTED".enum("", "102"),
        "DEVICE_ATTRIBUTE_HANDLE_TYPE_POSIX_FILE_DESCRIPTOR_SUPPORTED".enum,
        "DEVICE_ATTRIBUTE_HANDLE_TYPE_WIN32_HANDLE_SUPPORTED".enum,
        "DEVICE_ATTRIBUTE_HANDLE_TYPE_WIN32_KMT_HANDLE_SUPPORTED".enum,
        "DEVICE_ATTRIBUTE_MAX_BLOCKS_PER_MULTIPROCESSOR".enum,
        "DEVICE_ATTRIBUTE_GENERIC_COMPRESSION_SUPPORTED".enum,
        "DEVICE_ATTRIBUTE_MAX_PERSISTING_L2_CACHE_SIZE".enum,
        "DEVICE_ATTRIBUTE_MAX_ACCESS_POLICY_WINDOW_SIZE".enum,
        "DEVICE_ATTRIBUTE_GPU_DIRECT_RDMA_WITH_CUDA_VMM_SUPPORTED".enum,
        "DEVICE_ATTRIBUTE_RESERVED_SHARED_MEMORY_PER_BLOCK".enum,
        "DEVICE_ATTRIBUTE_SPARSE_CUDA_ARRAY_SUPPORTED".enum,
        "DEVICE_ATTRIBUTE_READ_ONLY_HOST_REGISTER_SUPPORTED".enum,
        "DEVICE_ATTRIBUTE_TIMELINE_SEMAPHORE_INTEROP_SUPPORTED".enum,
        "DEVICE_ATTRIBUTE_MEMORY_POOLS_SUPPORTED".enum,
        "DEVICE_ATTRIBUTE_GPU_DIRECT_RDMA_SUPPORTED".enum,
        "DEVICE_ATTRIBUTE_GPU_DIRECT_RDMA_FLUSH_WRITES_OPTIONS".enum,
        "DEVICE_ATTRIBUTE_GPU_DIRECT_RDMA_WRITES_ORDERING".enum,
        "DEVICE_ATTRIBUTE_MEMPOOL_SUPPORTED_HANDLE_TYPES".enum,
        "DEVICE_ATTRIBUTE_CLUSTER_LAUNCH".enum,
        "DEVICE_ATTRIBUTE_DEFERRED_MAPPING_CUDA_ARRAY_SUPPORTED".enum,
        "DEVICE_ATTRIBUTE_CAN_USE_64_BIT_STREAM_MEM_OPS".enum,
        "DEVICE_ATTRIBUTE_CAN_USE_STREAM_WAIT_VALUE_NOR".enum,
        "DEVICE_ATTRIBUTE_DMA_BUF_SUPPORTED".enum,
        "DEVICE_ATTRIBUTE_IPC_EVENT_SUPPORTED".enum,
        "DEVICE_ATTRIBUTE_MEM_SYNC_DOMAIN_COUNT".enum,
        "DEVICE_ATTRIBUTE_TENSOR_MAP_ACCESS_SUPPORTED".enum,
        "DEVICE_ATTRIBUTE_UNIFIED_FUNCTION_POINTERS".enum("", "129"),
        "DEVICE_ATTRIBUTE_MULTICAST_SUPPORTED".enum("", "132")
    )

    EnumConstant(
        "{@code CUpointer_attribute}",

        "POINTER_ATTRIBUTE_CONTEXT".enum("", "1"),
        "POINTER_ATTRIBUTE_MEMORY_TYPE".enum,
        "POINTER_ATTRIBUTE_DEVICE_POINTER".enum,
        "POINTER_ATTRIBUTE_HOST_POINTER".enum,
        "POINTER_ATTRIBUTE_P2P_TOKENS".enum,
        "POINTER_ATTRIBUTE_SYNC_MEMOPS".enum,
        "POINTER_ATTRIBUTE_BUFFER_ID".enum,
        "POINTER_ATTRIBUTE_IS_MANAGED".enum,
        "POINTER_ATTRIBUTE_DEVICE_ORDINAL".enum,
        "POINTER_ATTRIBUTE_IS_LEGACY_CUDA_IPC_CAPABLE".enum,
        "POINTER_ATTRIBUTE_RANGE_START_ADDR".enum,
        "POINTER_ATTRIBUTE_RANGE_SIZE".enum,
        "POINTER_ATTRIBUTE_MAPPED".enum,
        "POINTER_ATTRIBUTE_ALLOWED_HANDLE_TYPES".enum,
        "POINTER_ATTRIBUTE_IS_GPU_DIRECT_RDMA_CAPABLE".enum,
        "POINTER_ATTRIBUTE_ACCESS_FLAGS".enum,
        "POINTER_ATTRIBUTE_MEMPOOL_HANDLE".enum,
        "POINTER_ATTRIBUTE_MAPPING_SIZE".enum,
        "POINTER_ATTRIBUTE_MAPPING_BASE_ADDR".enum,
        "POINTER_ATTRIBUTE_MEMORY_BLOCK_ID".enum
    )

    EnumConstant(
        "{@code CUfunction_attribute}",

        "FUNC_ATTRIBUTE_MAX_THREADS_PER_BLOCK".enum("", "0"),
        "FUNC_ATTRIBUTE_SHARED_SIZE_BYTES".enum,
        "FUNC_ATTRIBUTE_CONST_SIZE_BYTES".enum,
        "FUNC_ATTRIBUTE_LOCAL_SIZE_BYTES".enum,
        "FUNC_ATTRIBUTE_NUM_REGS".enum,
        "FUNC_ATTRIBUTE_PTX_VERSION".enum,
        "FUNC_ATTRIBUTE_BINARY_VERSION".enum,
        "FUNC_ATTRIBUTE_CACHE_MODE_CA".enum,
        "FUNC_ATTRIBUTE_MAX_DYNAMIC_SHARED_SIZE_BYTES".enum,
        "FUNC_ATTRIBUTE_PREFERRED_SHARED_MEMORY_CARVEOUT".enum,
        "FUNC_ATTRIBUTE_CLUSTER_SIZE_MUST_BE_SET".enum,
        "FUNC_ATTRIBUTE_REQUIRED_CLUSTER_WIDTH".enum,
        "FUNC_ATTRIBUTE_REQUIRED_CLUSTER_HEIGHT".enum,
        "FUNC_ATTRIBUTE_REQUIRED_CLUSTER_DEPTH".enum,
        "FUNC_ATTRIBUTE_NON_PORTABLE_CLUSTER_SIZE_ALLOWED".enum,
        "FUNC_ATTRIBUTE_CLUSTER_SCHEDULING_POLICY_PREFERENCE".enum,
    )

    EnumConstant(
        "{@code CUfunc_cache}",

        "FUNC_CACHE_PREFER_NONE".enum("", 0x00),
        "FUNC_CACHE_PREFER_SHARED".enum("", 0x01),
        "FUNC_CACHE_PREFER_L1".enum("", 0x02),
        "FUNC_CACHE_PREFER_EQUAL".enum("", 0x03)
    )

    EnumConstant(
        "{@code CUsharedconfig}",

        "SHARED_MEM_CONFIG_DEFAULT_BANK_SIZE".enum("", 0x00),
        "SHARED_MEM_CONFIG_FOUR_BYTE_BANK_SIZE".enum("", 0x01),
        "SHARED_MEM_CONFIG_EIGHT_BYTE_BANK_SIZE".enum("", 0x02)
    )

    EnumConstant(
        "{@code CUshared_carveout}",

        "SHAREDMEM_CARVEOUT_DEFAULT".enum("", -1),
        "SHAREDMEM_CARVEOUT_MAX_SHARED".enum("", 100),
        "SHAREDMEM_CARVEOUT_MAX_L1".enum("", 0)
    )

    EnumConstant(
        "{@code CUmemorytype}",

        "MEMORYTYPE_HOST".enum("", 0x01),
        "MEMORYTYPE_DEVICE".enum("", 0x02),
        "MEMORYTYPE_ARRAY".enum("", 0x03),
        "MEMORYTYPE_UNIFIED".enum("", 0x04)
    )

    EnumConstant(
        "{@code CUcomputemode}",

        "COMPUTEMODE_DEFAULT".enum("", 0),
        "COMPUTEMODE_PROHIBITED".enum("", 2),
        "COMPUTEMODE_EXCLUSIVE_PROCESS".enum("", 3)
    )

    EnumConstant(
        "{@code CUmem_advise}",

        "MEM_ADVISE_SET_READ_MOSTLY".enum("", 1),
        "MEM_ADVISE_UNSET_READ_MOSTLY".enum("", 2),
        "MEM_ADVISE_SET_PREFERRED_LOCATION".enum("", 3),
        "MEM_ADVISE_UNSET_PREFERRED_LOCATION".enum("", 4),
        "MEM_ADVISE_SET_ACCESSED_BY".enum("", 5),
        "MEM_ADVISE_UNSET_ACCESSED_BY".enum("", 6)
    )

    EnumConstant(
        "{@code CUmem_range_attribute}",

        "MEM_RANGE_ATTRIBUTE_READ_MOSTLY".enum("", 1),
        "MEM_RANGE_ATTRIBUTE_PREFERRED_LOCATION".enum("", 2),
        "MEM_RANGE_ATTRIBUTE_ACCESSED_BY".enum("", 3),
        "MEM_RANGE_ATTRIBUTE_LAST_PREFETCH_LOCATION".enum("", 4)
    )

    EnumConstant(
        "{@code CUjit_option}",

        "JIT_MAX_REGISTERS".enum("", "0"),
        "JIT_THREADS_PER_BLOCK".enum,
        "JIT_WALL_TIME".enum,
        "JIT_INFO_LOG_BUFFER".enum,
        "JIT_INFO_LOG_BUFFER_SIZE_BYTES".enum,
        "JIT_ERROR_LOG_BUFFER".enum,
        "JIT_ERROR_LOG_BUFFER_SIZE_BYTES".enum,
        "JIT_OPTIMIZATION_LEVEL".enum,
        "JIT_TARGET_FROM_CUCONTEXT".enum,
        "JIT_TARGET".enum,
        "JIT_FALLBACK_STRATEGY".enum,
        "JIT_GENERATE_DEBUG_INFO".enum,
        "JIT_LOG_VERBOSE".enum,
        "JIT_GENERATE_LINE_INFO".enum,
        "JIT_CACHE_MODE".enum,
        "JIT_NEW_SM3X_OPT".enum,
        "JIT_FAST_COMPILE".enum,
        "JIT_GLOBAL_SYMBOL_NAMES".enum,
        "JIT_GLOBAL_SYMBOL_ADDRESSES".enum,
        "JIT_GLOBAL_SYMBOL_COUNT".enum,
        "JIT_LTO".enum,
        "JIT_FTZ".enum,
        "JIT_PREC_DIV".enum,
        "JIT_PREC_SQRT".enum,
        "JIT_FMA".enum,
        "JIT_REFERENCED_KERNEL_NAMES".enum,
        "JIT_REFERENCED_KERNEL_COUNT".enum,
        "JIT_REFERENCED_VARIABLE_NAMES".enum,
        "JIT_REFERENCED_VARIABLE_COUNT".enum,
        "JIT_OPTIMIZE_UNUSED_DEVICE_VARIABLES".enum,
        "JIT_POSITION_INDEPENDENT_CODE".enum,
        "JIT_NUM_OPTIONS".enum
    )

    IntConstant("", "COMPUTE_ACCELERATED_TARGET_BASE"..0x10000)

    EnumConstant(
        "{@code CUjit_target}",

        "TARGET_COMPUTE_20".enum("", "20"),
        "TARGET_COMPUTE_21".enum,
        "TARGET_COMPUTE_30".enum("", "30"),
        "TARGET_COMPUTE_32".enum("", "32"),
        "TARGET_COMPUTE_35".enum("", "35"),
        "TARGET_COMPUTE_37".enum("", "37"),
        "TARGET_COMPUTE_50".enum("", "50"),
        "TARGET_COMPUTE_52".enum("", "52"),
        "TARGET_COMPUTE_53".enum,
        "TARGET_COMPUTE_60".enum("", "60"),
        "TARGET_COMPUTE_61".enum,
        "TARGET_COMPUTE_62".enum,
        "TARGET_COMPUTE_70".enum("", "70"),
        "TARGET_COMPUTE_72".enum("", "72"),
        "TARGET_COMPUTE_75".enum("", "75"),
        "TARGET_COMPUTE_80".enum("", "80"),
        "TARGET_COMPUTE_86".enum("", "86"),
        "TARGET_COMPUTE_87".enum("", "87"),
        "TARGET_COMPUTE_89".enum("", "89"),
        "TARGET_COMPUTE_90".enum("", "90"),
        "TARGET_COMPUTE_90A".enum("", " CU_COMPUTE_ACCELERATED_TARGET_BASE + CU_TARGET_COMPUTE_90")
    )

    EnumConstant(
        "{@code CUjit_fallback}",

        "PREFER_PTX".enum("", 0),
        "PREFER_BINARY".enum
    )

    EnumConstant(
        "{@code CUjit_cacheMode}",

        "JIT_CACHE_OPTION_NONE".enum("", 0),
        "JIT_CACHE_OPTION_CG".enum,
        "JIT_CACHE_OPTION_CA".enum
    )

    EnumConstant(
        "{@code CUjitInputType}",

        "JIT_INPUT_CUBIN".enum("", "0"),
        "JIT_INPUT_PTX".enum,
        "JIT_INPUT_FATBINARY".enum,
        "JIT_INPUT_OBJECT".enum,
        "JIT_INPUT_LIBRARY".enum,
        "JIT_INPUT_NVVM".enum,
        "JIT_NUM_INPUT_TYPES".enum
    )

    EnumConstant(
        "{@code CUgraphicsRegisterFlags}",

        "GRAPHICS_REGISTER_FLAGS_NONE".enum("", 0x00),
        "GRAPHICS_REGISTER_FLAGS_READ_ONLY".enum("", 0x01),
        "GRAPHICS_REGISTER_FLAGS_WRITE_DISCARD".enum("", 0x02),
        "GRAPHICS_REGISTER_FLAGS_SURFACE_LDST".enum("", 0x04),
        "GRAPHICS_REGISTER_FLAGS_TEXTURE_GATHER".enum("", 0x08)
    )

    EnumConstant(
        "{@code CUgraphicsMapResourceFlags}",

        "GRAPHICS_MAP_RESOURCE_FLAGS_NONE".enum("", 0x00),
        "GRAPHICS_MAP_RESOURCE_FLAGS_READ_ONLY".enum("", 0x01),
        "GRAPHICS_MAP_RESOURCE_FLAGS_WRITE_DISCARD".enum("", 0x02)
    )

    EnumConstant(
        "{@code CUarray_cubemap_face}",

        "CUBEMAP_FACE_POSITIVE_X".enum("", 0x00),
        "CUBEMAP_FACE_NEGATIVE_X".enum("", 0x01),
        "CUBEMAP_FACE_POSITIVE_Y".enum("", 0x02),
        "CUBEMAP_FACE_NEGATIVE_Y".enum("", 0x03),
        "CUBEMAP_FACE_POSITIVE_Z".enum("", 0x04),
        "CUBEMAP_FACE_NEGATIVE_Z".enum("", 0x05)
    )

    EnumConstant(
        "{@code CUlimit}",

        "LIMIT_STACK_SIZE".enum("", "0x00"),
        "LIMIT_PRINTF_FIFO_SIZE".enum("", "0x01"),
        "LIMIT_MALLOC_HEAP_SIZE".enum("", "0x02"),
        "LIMIT_DEV_RUNTIME_SYNC_DEPTH".enum("", "0x03"),
        "LIMIT_DEV_RUNTIME_PENDING_LAUNCH_COUNT".enum("", "0x04"),
        "LIMIT_MAX_L2_FETCH_GRANULARITY".enum("", "0x05"),
        "LIMIT_PERSISTING_L2_CACHE_SIZE".enum("", "0x06")
    )

    EnumConstant(
        "{@code CUresourcetype}",

        "RESOURCE_TYPE_ARRAY".enum("", 0x00),
        "RESOURCE_TYPE_MIPMAPPED_ARRAY".enum("", 0x01),
        "RESOURCE_TYPE_LINEAR".enum("", 0x02),
        "RESOURCE_TYPE_PITCH2D".enum("", 0x03)
    )

    EnumConstant(
        "{@code CUaccessProperty}",

        "ACCESS_PROPERTY_NORMAL".enum("", "0"),
        "ACCESS_PROPERTY_STREAMING".enum,
        "ACCESS_PROPERTY_PERSISTING".enum
    )

    EnumConstant(
        "{@code CUgraphNodeType}",

        "GRAPH_NODE_TYPE_KERNEL".enum("", "0"),
        "GRAPH_NODE_TYPE_MEMCPY".enum,
        "GRAPH_NODE_TYPE_MEMSET".enum,
        "GRAPH_NODE_TYPE_HOST".enum,
        "GRAPH_NODE_TYPE_GRAPH".enum,
        "GRAPH_NODE_TYPE_EMPTY".enum,
        "GRAPH_NODE_TYPE_WAIT_EVENT".enum,
        "GRAPH_NODE_TYPE_EVENT_RECORD".enum,
        "GRAPH_NODE_TYPE_EXT_SEMAS_SIGNAL".enum,
        "GRAPH_NODE_TYPE_EXT_SEMAS_WAIT".enum,
        "GRAPH_NODE_TYPE_MEM_ALLOC".enum,
        "GRAPH_NODE_TYPE_MEM_FREE".enum,
        "GRAPH_NODE_TYPE_BATCH_MEM_OP".enum,
    )

    EnumConstant(
        "{@code CUgraphInstantiateResult}",

        "CUDA_GRAPH_INSTANTIATE_SUCCESS".enum("", "0"),
        "CUDA_GRAPH_INSTANTIATE_ERROR".enum,
        "CUDA_GRAPH_INSTANTIATE_INVALID_STRUCTURE".enum,
        "CUDA_GRAPH_INSTANTIATE_NODE_OPERATION_NOT_SUPPORTED".enum,
        "CUDA_GRAPH_INSTANTIATE_MULTIPLE_CTXS_NOT_SUPPORTED".enum
    ).noPrefix()

    EnumConstant(
        "{@code CUsynchronizationPolicy}",

        "SYNC_POLICY_AUTO".enum("", "1"),
        "SYNC_POLICY_SPIN".enum,
        "SYNC_POLICY_YIELD".enum,
        "SYNC_POLICY_BLOCKING_SYNC".enum
    )

    EnumConstant(
        "{@code CUclusterSchedulingPolicy}",

        "CLUSTER_SCHEDULING_POLICY_DEFAULT".enum("", "0"),
        "CLUSTER_SCHEDULING_POLICY_SPREAD".enum,
        "CLUSTER_SCHEDULING_POLICY_LOAD_BALANCING".enum
    )

    EnumConstant(
        "{@code CUlaunchMemSyncDomain}",

        "LAUNCH_MEM_SYNC_DOMAIN_DEFAULT".enum("", "0"),
        "LAUNCH_MEM_SYNC_DOMAIN_REMOTE".enum
    )

    EnumConstant(
        "{@code CUlaunchAttributeID}",

        "LAUNCH_ATTRIBUTE_IGNORE".enum("", "0"),
        "LAUNCH_ATTRIBUTE_ACCESS_POLICY_WINDOW".enum,
        "LAUNCH_ATTRIBUTE_COOPERATIVE".enum,
        "LAUNCH_ATTRIBUTE_SYNCHRONIZATION_POLICY".enum,
        "LAUNCH_ATTRIBUTE_CLUSTER_DIMENSION".enum,
        "LAUNCH_ATTRIBUTE_CLUSTER_SCHEDULING_POLICY_PREFERENCE".enum,
        "LAUNCH_ATTRIBUTE_PROGRAMMATIC_STREAM_SERIALIZATION".enum,
        "LAUNCH_ATTRIBUTE_PROGRAMMATIC_EVENT".enum,
        "LAUNCH_ATTRIBUTE_PRIORITY".enum,
        "LAUNCH_ATTRIBUTE_MEM_SYNC_DOMAIN_MAP".enum,
        "LAUNCH_ATTRIBUTE_MEM_SYNC_DOMAIN".enum
    )

    EnumConstant(
        "{@code CUkernelNodeAttrID}",

        "KERNEL_NODE_ATTRIBUTE_ACCESS_POLICY_WINDOW".enum("", "CU_LAUNCH_ATTRIBUTE_ACCESS_POLICY_WINDOW"),
        "KERNEL_NODE_ATTRIBUTE_COOPERATIVE".enum("", "CU_LAUNCH_ATTRIBUTE_COOPERATIVE"),
        "KERNEL_NODE_ATTRIBUTE_CLUSTER_DIMENSION".enum("", "CU_LAUNCH_ATTRIBUTE_CLUSTER_DIMENSION"),
        "KERNEL_NODE_ATTRIBUTE_CLUSTER_SCHEDULING_POLICY_PREFERENCE".enum("", "CU_LAUNCH_ATTRIBUTE_CLUSTER_SCHEDULING_POLICY_PREFERENCE"),
        "KERNEL_NODE_ATTRIBUTE_PRIORITY".enum("", "CU_LAUNCH_ATTRIBUTE_PRIORITY"),
        "KERNEL_NODE_ATTRIBUTE_MEM_SYNC_DOMAIN_MAP".enum("", "CU_LAUNCH_ATTRIBUTE_MEM_SYNC_DOMAIN_MAP"),
        "KERNEL_NODE_ATTRIBUTE_MEM_SYNC_DOMAIN".enum("", "CU_LAUNCH_ATTRIBUTE_MEM_SYNC_DOMAIN")
    )

    EnumConstant(
        "{@code CUstreamCaptureStatus}",

        "STREAM_CAPTURE_STATUS_NONE".enum("", 0),
        "STREAM_CAPTURE_STATUS_ACTIVE".enum("", 1),
        "STREAM_CAPTURE_STATUS_INVALIDATED".enum("", 2)
    )

    EnumConstant(
        "{@code CUstreamCaptureMode}",

        "STREAM_CAPTURE_MODE_GLOBAL".enum("", "0"),
        "STREAM_CAPTURE_MODE_THREAD_LOCAL".enum,
        "STREAM_CAPTURE_MODE_RELAXED".enum
    )

    EnumConstant(
        "{@code CUstreamAttrID}",

        "STREAM_ATTRIBUTE_ACCESS_POLICY_WINDOW".enum("", "CU_LAUNCH_ATTRIBUTE_ACCESS_POLICY_WINDOW"),
        "STREAM_ATTRIBUTE_SYNCHRONIZATION_POLICY".enum("", "CU_LAUNCH_ATTRIBUTE_SYNCHRONIZATION_POLICY"),
        "STREAM_ATTRIBUTE_PRIORITY".enum("", "CU_LAUNCH_ATTRIBUTE_PRIORITY"),
        "STREAM_ATTRIBUTE_MEM_SYNC_DOMAIN_MAP".enum("", "CU_LAUNCH_ATTRIBUTE_MEM_SYNC_DOMAIN_MAP"),
        "STREAM_ATTRIBUTE_MEM_SYNC_DOMAIN".enum("", "CU_LAUNCH_ATTRIBUTE_MEM_SYNC_DOMAIN")
    )

    EnumConstant(
        "{@code CUdriverProcAddress_flags}",

        "GET_PROC_ADDRESS_DEFAULT".enum("", "0"),
        "GET_PROC_ADDRESS_LEGACY_STREAM".enum("", "1 << 0"),
        "GET_PROC_ADDRESS_PER_THREAD_DEFAULT_STREAM".enum("", "1 << 1")
    )

    EnumConstant(
        "{@code CUdriverProcAddressQueryResult}",

        "GET_PROC_ADDRESS_SUCCESS".enum("", "0"),
        "GET_PROC_ADDRESS_SYMBOL_NOT_FOUND".enum,
        "GET_PROC_ADDRESS_VERSION_NOT_SUFFICIENT".enum
    )

    EnumConstant(
        "{@code CUexecAffinityType}",

        "EXEC_AFFINITY_TYPE_SM_COUNT".enum("", "0"),
        "EXEC_AFFINITY_TYPE_MAX".enum
    )

    EnumConstant(
        "{@code CUlibraryOption}",

        "LIBRARY_HOST_UNIVERSAL_FUNCTION_AND_DATA_TABLE".enum("", "0"),
        "LIBRARY_BINARY_IS_PRESERVED".enum,
        "LIBRARY_NUM_OPTIONS".enum
    )

    EnumConstant(
        "{@code CUresult}",

        "CUDA_SUCCESS".enum("", "0"),
        "CUDA_ERROR_INVALID_VALUE".enum,
        "CUDA_ERROR_OUT_OF_MEMORY".enum,
        "CUDA_ERROR_NOT_INITIALIZED".enum,
        "CUDA_ERROR_DEINITIALIZED".enum,
        "CUDA_ERROR_PROFILER_DISABLED".enum,
        "CUDA_ERROR_PROFILER_NOT_INITIALIZED".enum,
        "CUDA_ERROR_PROFILER_ALREADY_STARTED".enum,
        "CUDA_ERROR_PROFILER_ALREADY_STOPPED".enum,
        "CUDA_ERROR_STUB_LIBRARY".enum("", "34"),
        "CUDA_ERROR_DEVICE_UNAVAILABLE".enum("", "46"),
        "CUDA_ERROR_NO_DEVICE".enum("", "100"),
        "CUDA_ERROR_INVALID_DEVICE".enum,
        "CUDA_ERROR_DEVICE_NOT_LICENSED".enum,
        "CUDA_ERROR_INVALID_IMAGE".enum("", "200"),
        "CUDA_ERROR_INVALID_CONTEXT".enum,
        "CUDA_ERROR_CONTEXT_ALREADY_CURRENT".enum,
        "CUDA_ERROR_MAP_FAILED".enum("", "205"),
        "CUDA_ERROR_UNMAP_FAILED".enum,
        "CUDA_ERROR_ARRAY_IS_MAPPED".enum,
        "CUDA_ERROR_ALREADY_MAPPED".enum,
        "CUDA_ERROR_NO_BINARY_FOR_GPU".enum,
        "CUDA_ERROR_ALREADY_ACQUIRED".enum,
        "CUDA_ERROR_NOT_MAPPED".enum,
        "CUDA_ERROR_NOT_MAPPED_AS_ARRAY".enum,
        "CUDA_ERROR_NOT_MAPPED_AS_POINTER".enum,
        "CUDA_ERROR_ECC_UNCORRECTABLE".enum,
        "CUDA_ERROR_UNSUPPORTED_LIMIT".enum,
        "CUDA_ERROR_CONTEXT_ALREADY_IN_USE".enum,
        "CUDA_ERROR_PEER_ACCESS_UNSUPPORTED".enum,
        "CUDA_ERROR_INVALID_PTX".enum,
        "CUDA_ERROR_INVALID_GRAPHICS_CONTEXT".enum,
        "CUDA_ERROR_NVLINK_UNCORRECTABLE".enum,
        "CUDA_ERROR_JIT_COMPILER_NOT_FOUND".enum,
        "CUDA_ERROR_UNSUPPORTED_PTX_VERSION".enum,
        "CUDA_ERROR_JIT_COMPILATION_DISABLED".enum,
        "CUDA_ERROR_UNSUPPORTED_EXEC_AFFINITY".enum,
        "CUDA_ERROR_UNSUPPORTED_DEVSIDE_SYNC".enum,
        "CUDA_ERROR_INVALID_SOURCE".enum("", "300"),
        "CUDA_ERROR_FILE_NOT_FOUND".enum,
        "CUDA_ERROR_SHARED_OBJECT_SYMBOL_NOT_FOUND".enum,
        "CUDA_ERROR_SHARED_OBJECT_INIT_FAILED".enum,
        "CUDA_ERROR_OPERATING_SYSTEM".enum,
        "CUDA_ERROR_INVALID_HANDLE".enum("", "400"),
        "CUDA_ERROR_ILLEGAL_STATE".enum,
        "CUDA_ERROR_NOT_FOUND".enum("", "500"),
        "CUDA_ERROR_NOT_READY".enum("", "600"),
        "CUDA_ERROR_ILLEGAL_ADDRESS".enum("", "700"),
        "CUDA_ERROR_LAUNCH_OUT_OF_RESOURCES".enum,
        "CUDA_ERROR_LAUNCH_TIMEOUT".enum,
        "CUDA_ERROR_LAUNCH_INCOMPATIBLE_TEXTURING".enum,
        "CUDA_ERROR_PEER_ACCESS_ALREADY_ENABLED".enum,
        "CUDA_ERROR_PEER_ACCESS_NOT_ENABLED".enum,
        "CUDA_ERROR_PRIMARY_CONTEXT_ACTIVE".enum("", "708"),
        "CUDA_ERROR_CONTEXT_IS_DESTROYED".enum,
        "CUDA_ERROR_ASSERT".enum,
        "CUDA_ERROR_TOO_MANY_PEERS".enum,
        "CUDA_ERROR_HOST_MEMORY_ALREADY_REGISTERED".enum,
        "CUDA_ERROR_HOST_MEMORY_NOT_REGISTERED".enum,
        "CUDA_ERROR_HARDWARE_STACK_ERROR".enum,
        "CUDA_ERROR_ILLEGAL_INSTRUCTION".enum,
        "CUDA_ERROR_MISALIGNED_ADDRESS".enum,
        "CUDA_ERROR_INVALID_ADDRESS_SPACE".enum,
        "CUDA_ERROR_INVALID_PC".enum,
        "CUDA_ERROR_LAUNCH_FAILED".enum,
        "CUDA_ERROR_COOPERATIVE_LAUNCH_TOO_LARGE".enum,
        "CUDA_ERROR_NOT_PERMITTED".enum("", "800"),
        "CUDA_ERROR_NOT_SUPPORTED".enum,
        "CUDA_ERROR_SYSTEM_NOT_READY".enum,
        "CUDA_ERROR_SYSTEM_DRIVER_MISMATCH".enum,
        "CUDA_ERROR_COMPAT_NOT_SUPPORTED_ON_DEVICE".enum,
        "CUDA_ERROR_MPS_CONNECTION_FAILED".enum,
        "CUDA_ERROR_MPS_RPC_FAILURE".enum,
        "CUDA_ERROR_MPS_SERVER_NOT_READY".enum,
        "CUDA_ERROR_MPS_MAX_CLIENTS_REACHED".enum,
        "CUDA_ERROR_MPS_MAX_CONNECTIONS_REACHED".enum,
        "CUDA_ERROR_MPS_CLIENT_TERMINATED".enum,
        "CUDA_ERROR_CDP_NOT_SUPPORTED".enum,
        "CUDA_ERROR_CDP_VERSION_MISMATCH".enum,
        "CUDA_ERROR_STREAM_CAPTURE_UNSUPPORTED".enum("", "900"),
        "CUDA_ERROR_STREAM_CAPTURE_INVALIDATED".enum,
        "CUDA_ERROR_STREAM_CAPTURE_MERGE".enum,
        "CUDA_ERROR_STREAM_CAPTURE_UNMATCHED".enum,
        "CUDA_ERROR_STREAM_CAPTURE_UNJOINED".enum,
        "CUDA_ERROR_STREAM_CAPTURE_ISOLATION".enum,
        "CUDA_ERROR_STREAM_CAPTURE_IMPLICIT".enum,
        "CUDA_ERROR_CAPTURED_EVENT".enum,
        "CUDA_ERROR_STREAM_CAPTURE_WRONG_THREAD".enum,
        "CUDA_ERROR_TIMEOUT".enum,
        "CUDA_ERROR_GRAPH_EXEC_UPDATE_FAILURE".enum,
        "CUDA_ERROR_EXTERNAL_DEVICE".enum,
        "CUDA_ERROR_INVALID_CLUSTER_SIZE".enum,
        "CUDA_ERROR_UNKNOWN".enum("", "999")
    ).noPrefix()

    EnumConstant(
        "{@code CUdevice_P2PAttribute}",

        "DEVICE_P2P_ATTRIBUTE_PERFORMANCE_RANK".enum("", 0x01),
        "DEVICE_P2P_ATTRIBUTE_ACCESS_SUPPORTED".enum("", 0x02),
        "DEVICE_P2P_ATTRIBUTE_NATIVE_ATOMIC_SUPPORTED".enum("", 0x03),
        "DEVICE_P2P_ATTRIBUTE_ACCESS_ACCESS_SUPPORTED".enum("", 0x04),
        "DEVICE_P2P_ATTRIBUTE_CUDA_ARRAY_ACCESS_SUPPORTED".enum("", 0x04)
    )

    EnumConstant(
        "Flags for #MemHostAlloc().",

        "MEMHOSTALLOC_PORTABLE".enum("", 0x01),
        "MEMHOSTALLOC_DEVICEMAP".enum("", 0x02),
        "MEMHOSTALLOC_WRITECOMBINED".enum("", 0x04)
    )

    EnumConstant(
        "Flags for #MemHostRegister().",

        "MEMHOSTREGISTER_PORTABLE".enum("", "0x01"),
        "MEMHOSTREGISTER_DEVICEMAP".enum("", "0x02"),
        "MEMHOSTREGISTER_IOMEMORY".enum("", "0x04"),
        "MEMHOSTREGISTER_READ_ONLY".enum("", "0x08")
    )

    IntConstant("", "ARRAY_SPARSE_PROPERTIES_SINGLE_MIPTAIL".."0x1")

    EnumConstant(
        "{@code CUresourceViewFormat}",

        "RES_VIEW_FORMAT_NONE".enum("", 0x00),
        "RES_VIEW_FORMAT_UINT_1X8".enum("", 0x01),
        "RES_VIEW_FORMAT_UINT_2X8".enum("", 0x02),
        "RES_VIEW_FORMAT_UINT_4X8".enum("", 0x03),
        "RES_VIEW_FORMAT_SINT_1X8".enum("", 0x04),
        "RES_VIEW_FORMAT_SINT_2X8".enum("", 0x05),
        "RES_VIEW_FORMAT_SINT_4X8".enum("", 0x06),
        "RES_VIEW_FORMAT_UINT_1X16".enum("", 0x07),
        "RES_VIEW_FORMAT_UINT_2X16".enum("", 0x08),
        "RES_VIEW_FORMAT_UINT_4X16".enum("", 0x09),
        "RES_VIEW_FORMAT_SINT_1X16".enum("", 0x0a),
        "RES_VIEW_FORMAT_SINT_2X16".enum("", 0x0b),
        "RES_VIEW_FORMAT_SINT_4X16".enum("", 0x0c),
        "RES_VIEW_FORMAT_UINT_1X32".enum("", 0x0d),
        "RES_VIEW_FORMAT_UINT_2X32".enum("", 0x0e),
        "RES_VIEW_FORMAT_UINT_4X32".enum("", 0x0f),
        "RES_VIEW_FORMAT_SINT_1X32".enum("", 0x10),
        "RES_VIEW_FORMAT_SINT_2X32".enum("", 0x11),
        "RES_VIEW_FORMAT_SINT_4X32".enum("", 0x12),
        "RES_VIEW_FORMAT_FLOAT_1X16".enum("", 0x13),
        "RES_VIEW_FORMAT_FLOAT_2X16".enum("", 0x14),
        "RES_VIEW_FORMAT_FLOAT_4X16".enum("", 0x15),
        "RES_VIEW_FORMAT_FLOAT_1X32".enum("", 0x16),
        "RES_VIEW_FORMAT_FLOAT_2X32".enum("", 0x17),
        "RES_VIEW_FORMAT_FLOAT_4X32".enum("", 0x18),
        "RES_VIEW_FORMAT_UNSIGNED_BC1".enum("", 0x19),
        "RES_VIEW_FORMAT_UNSIGNED_BC2".enum("", 0x1a),
        "RES_VIEW_FORMAT_UNSIGNED_BC3".enum("", 0x1b),
        "RES_VIEW_FORMAT_UNSIGNED_BC4".enum("", 0x1c),
        "RES_VIEW_FORMAT_SIGNED_BC4".enum("", 0x1d),
        "RES_VIEW_FORMAT_UNSIGNED_BC5".enum("", 0x1e),
        "RES_VIEW_FORMAT_SIGNED_BC5".enum("", 0x1f),
        "RES_VIEW_FORMAT_UNSIGNED_BC6H".enum("", 0x20),
        "RES_VIEW_FORMAT_SIGNED_BC6H".enum("", 0x21),
        "RES_VIEW_FORMAT_UNSIGNED_BC7".enum("", 0x22)
    )

    IntConstant("", "TENSOR_MAP_NUM_QWORDS".."16")

    EnumConstant(
        "{@code CUtensorMapDataType}",

        "TENSOR_MAP_DATA_TYPE_UINT8".enum("", "0"),
        "TENSOR_MAP_DATA_TYPE_UINT16".enum,
        "TENSOR_MAP_DATA_TYPE_UINT32".enum,
        "TENSOR_MAP_DATA_TYPE_INT32".enum,
        "TENSOR_MAP_DATA_TYPE_UINT64".enum,
        "TENSOR_MAP_DATA_TYPE_INT64".enum,
        "TENSOR_MAP_DATA_TYPE_FLOAT16".enum,
        "TENSOR_MAP_DATA_TYPE_FLOAT32".enum,
        "TENSOR_MAP_DATA_TYPE_FLOAT64".enum,
        "TENSOR_MAP_DATA_TYPE_BFLOAT16".enum,
        "TENSOR_MAP_DATA_TYPE_FLOAT32_FTZ".enum,
        "TENSOR_MAP_DATA_TYPE_TFLOAT32".enum,
        "TENSOR_MAP_DATA_TYPE_TFLOAT32_FTZ".enum
    )

    EnumConstant(
        "{@code CUtensorMapInterleave}",

        "TENSOR_MAP_INTERLEAVE_NONE".enum("", "0"),
        "TENSOR_MAP_INTERLEAVE_16B".enum,
        "TENSOR_MAP_INTERLEAVE_32B".enum
    )

    EnumConstant(
        "{@code CUtensorMapSwizzle}",

        "TENSOR_MAP_SWIZZLE_NONE".enum("", "0"),
        "TENSOR_MAP_SWIZZLE_32B".enum,
        "TENSOR_MAP_SWIZZLE_64B".enum,
        "TENSOR_MAP_SWIZZLE_128B".enum
    )

    EnumConstant(
        "{@code CUtensorMapL2promotion}",

        "TENSOR_MAP_L2_PROMOTION_NONE".enum("", "0"),
        "TENSOR_MAP_L2_PROMOTION_L2_64B".enum,
        "TENSOR_MAP_L2_PROMOTION_L2_128B".enum,
        "TENSOR_MAP_L2_PROMOTION_L2_256B".enum
    )

    EnumConstant(
        "{@code CUtensorMapFloatOOBfill}",

        "TENSOR_MAP_FLOAT_OOB_FILL_NONE".enum("", "0"),
        "TENSOR_MAP_FLOAT_OOB_FILL_NAN_REQUEST_ZERO_FMA".enum
    )

    EnumConstant(
        "{@code CUDA_POINTER_ATTRIBUTE_ACCESS_FLAGS}",

        "POINTER_ATTRIBUTE_ACCESS_FLAG_NONE".enum("", "0x0"),
        "POINTER_ATTRIBUTE_ACCESS_FLAG_READ".enum("", "0x1"),
        "POINTER_ATTRIBUTE_ACCESS_FLAG_READWRITE".enum("", "0x3")
    )

    EnumConstant(
        "{@code CUexternalMemoryHandleType}",

        "EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD".enum("", "1"),
        "EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32".enum,
        "EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT".enum,
        "EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP".enum,
        "EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE".enum,
        "EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_RESOURCE".enum,
        "EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_RESOURCE_KMT".enum,
        "EXTERNAL_MEMORY_HANDLE_TYPE_NVSCIBUF".enum
    )

    IntConstant("", "CUDA_EXTERNAL_MEMORY_DEDICATED"..0x1).noPrefix()

    IntConstant(
        "",

        "CUDA_EXTERNAL_SEMAPHORE_SIGNAL_SKIP_NVSCIBUF_MEMSYNC".."0x01",
        "CUDA_EXTERNAL_SEMAPHORE_WAIT_SKIP_NVSCIBUF_MEMSYNC".."0x02"
    ).noPrefix()

    IntConstant(
        "",

        "CUDA_NVSCISYNC_ATTR_SIGNAL".."0x1",
        "CUDA_NVSCISYNC_ATTR_WAIT".."0x2"
    ).noPrefix()

    EnumConstant(
        "{@code CUexternalSemaphoreHandleType}",

        "EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD".enum("", "1"),
        "EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32".enum,
        "EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT".enum,
        "EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE".enum,
        "EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D11_FENCE".enum,
        "EXTERNAL_SEMAPHORE_HANDLE_TYPE_NVSCISYNC".enum,
        "EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D11_KEYED_MUTEX".enum,
        "EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D11_KEYED_MUTEX_KMT".enum,
        "EXTERNAL_SEMAPHORE_HANDLE_TYPE_TIMELINE_SEMAPHORE_FD".enum,
        "EXTERNAL_SEMAPHORE_HANDLE_TYPE_TIMELINE_SEMAPHORE_WIN32".enum
    )

    EnumConstant(
        "{@code CUmemAllocationHandleType}",

        "MEM_HANDLE_TYPE_NONE".enum("", "0x0"),
        "MEM_HANDLE_TYPE_POSIX_FILE_DESCRIPTOR".enum("", "0x1"),
        "MEM_HANDLE_TYPE_WIN32".enum("", "0x2"),
        "MEM_HANDLE_TYPE_WIN32_KMT".enum("", "0x4")
    )

    EnumConstant(
        "{@code CUmemAccess_flags}",

        "MEM_ACCESS_FLAGS_PROT_NONE".enum("", "0x0"),
        "MEM_ACCESS_FLAGS_PROT_READ".enum("", "0x1"),
        "MEM_ACCESS_FLAGS_PROT_READWRITE".enum("", "0x3")
    )

    EnumConstant(
        "{@code CUmemLocationType}",

        "MEM_LOCATION_TYPE_INVALID".enum("", "0x0"),
        "MEM_LOCATION_TYPE_DEVICE".enum("", "0x1")
    )

    EnumConstant(
        "{@code CUmemAllocationType}",

        "MEM_ALLOCATION_TYPE_INVALID".enum("", "0x0"),
        "MEM_ALLOCATION_TYPE_PINNED".enum("", "0x1")
    )

    EnumConstant(
        "{@code CUmemAllocationGranularity_flags}",

        "MEM_ALLOC_GRANULARITY_MINIMUM".enum("", "0x0"),
        "MEM_ALLOC_GRANULARITY_RECOMMENDED".enum("", "0x1")
    )


    EnumConstant(
        "{@code CUmemRangeHandleType}",

        "MEM_RANGE_HANDLE_TYPE_DMA_BUF_FD".enum("", "0x1"),
        "MEM_RANGE_HANDLE_TYPE_MAX".enum("", "0x7FFFFFFF")
    )

    EnumConstant(
        "{@code CUarraySparseSubresourceType}",

        "ARRAY_SPARSE_SUBRESOURCE_TYPE_SPARSE_LEVEL".enum("", "0"),
        "ARRAY_SPARSE_SUBRESOURCE_TYPE_MIPTAIL".enum
    )

    EnumConstant(
        "{@code CUmemOperationType}",

        "MEM_OPERATION_TYPE_MAP".enum("", "1"),
        "MEM_OPERATION_TYPE_UNMAP".enum
    )

    EnumConstant(
        "{@code CUmemHandleType}",

        "MEM_HANDLE_TYPE_GENERIC".enum("", "0")
    )

    EnumConstant(
        "{@code CUmemAllocationCompType}",

        "MEM_ALLOCATION_COMP_NONE".enum("", "0x0"),
        "MEM_ALLOCATION_COMP_GENERIC".enum("", "0x1")
    )

    IntConstant(
        "This flag if set indicates that the memory will be used as a tile pool.",

        "MEM_CREATE_USAGE_TILE_POOL".."0x1"
    )

    EnumConstant(
        "{@code CUmulticastGranularity_flags}",

        "MULTICAST_GRANULARITY_MINIMUM".enum("", "0x0"),
        "MULTICAST_GRANULARITY_RECOMMENDED".enum("", "0x1")
    )

    EnumConstant(
        "CUDA Graph Update error types {@code CUgraphExecUpdateResult}",

        "GRAPH_EXEC_UPDATE_SUCCESS".enum("", "0x0"),
        "GRAPH_EXEC_UPDATE_ERROR".enum("", "0x1"),
        "GRAPH_EXEC_UPDATE_ERROR_TOPOLOGY_CHANGED".enum("", "0x2"),
        "GRAPH_EXEC_UPDATE_ERROR_NODE_TYPE_CHANGED".enum("", "0x3"),
        "GRAPH_EXEC_UPDATE_ERROR_FUNCTION_CHANGED".enum("", "0x4"),
        "GRAPH_EXEC_UPDATE_ERROR_PARAMETERS_CHANGED".enum("", "0x5"),
        "GRAPH_EXEC_UPDATE_ERROR_NOT_SUPPORTED".enum("", "0x6"),
        "GRAPH_EXEC_UPDATE_ERROR_UNSUPPORTED_FUNCTION_CHANGE".enum("", "0x7"),
        "GRAPH_EXEC_UPDATE_ERROR_ATTRIBUTES_CHANGED".enum("", "0x8")
    )

    EnumConstant(
        "{@code CUmemPool_attribute}",

        "MEMPOOL_ATTR_REUSE_FOLLOW_EVENT_DEPENDENCIES".enum("", "1"),
        "MEMPOOL_ATTR_REUSE_ALLOW_OPPORTUNISTIC".enum,
        "MEMPOOL_ATTR_REUSE_ALLOW_INTERNAL_DEPENDENCIES".enum,
        "MEMPOOL_ATTR_RELEASE_THRESHOLD".enum,
        "MEMPOOL_ATTR_RESERVED_MEM_CURRENT".enum,
        "MEMPOOL_ATTR_RESERVED_MEM_HIGH".enum,
        "MEMPOOL_ATTR_USED_MEM_CURRENT".enum,
        "MEMPOOL_ATTR_USED_MEM_HIGH".enum
    )

    EnumConstant(
        "{@code CUgraphMem_attribute}",

        "GRAPH_MEM_ATTR_USED_MEM_CURRENT".enum("", "0"),
        "GRAPH_MEM_ATTR_USED_MEM_HIGH".enum,
        "GRAPH_MEM_ATTR_RESERVED_MEM_CURRENT".enum,
        "GRAPH_MEM_ATTR_RESERVED_MEM_HIGH".enum
    )

    EnumConstant(
        "",

        "CUDA_COOPERATIVE_LAUNCH_MULTI_DEVICE_NO_PRE_LAUNCH_SYNC".enum("", 0x01),
        "CUDA_COOPERATIVE_LAUNCH_MULTI_DEVICE_NO_POST_LAUNCH_SYNC".enum("", 0x02)
    )

    EnumConstant(
        "",

        "CUDA_ARRAY3D_LAYERED".enum("", "0x01"),
        "CUDA_ARRAY3D_2DARRAY".enum("", "0x01"),
        "CUDA_ARRAY3D_SURFACE_LDST".enum("", "0x02"),
        "CUDA_ARRAY3D_CUBEMAP".enum("", "0x04"),
        "CUDA_ARRAY3D_TEXTURE_GATHER".enum("", "0x08"),
        "CUDA_ARRAY3D_DEPTH_TEXTURE".enum("", "0x10"),
        "CUDA_ARRAY3D_COLOR_ATTACHMENT".enum("", "0x20"),
        "CUDA_ARRAY3D_SPARSE".enum("", "0x40"),
        "CUDA_ARRAY3D_DEFERRED_MAPPING".enum("", "0x80")
    ).noPrefix()

    EnumConstant(
        "Flag for #TexRefSetArray().",

        "TRSA_OVERRIDE_FORMAT".enum("", 0x01)
    )

    EnumConstant(
        "Flag for #TexRefSetFlags().",

        "TRSF_READ_AS_INTEGER".enum("", "0x01"),
        "TRSF_NORMALIZED_COORDINATES".enum("", "0x02"),
        "TRSF_SRGB".enum("", "0x10"),
        "TRSF_DISABLE_TRILINEAR_OPTIMIZATION".enum("", "0x20"),
        "TRSF_SEAMLESS_CUBEMAP".enum("", "0x40")
    )

    LongConstant(
        "",

        "LAUNCH_PARAM_END"..0x00L,
        "LAUNCH_PARAM_BUFFER_POINTER"..0x01L,
        "LAUNCH_PARAM_BUFFER_SIZE"..0x02L
    )

    IntConstant(
        "",

        "PARAM_TR_DEFAULT".."-1"
    )

    IntConstant(
        "",

        "DEVICE_CPU".."-1",
        "DEVICE_INVALID".."-2"
    )

    EnumConstant(
        "{@code CUflushGPUDirectRDMAWritesOptions}",

        "FLUSH_GPU_DIRECT_RDMA_WRITES_OPTION_HOST".enum("", "1<<0"),
        "FLUSH_GPU_DIRECT_RDMA_WRITES_OPTION_MEMOPS".enum("", "1<<1")
    )

    EnumConstant(
        "{@code CUGPUDirectRDMAWritesOrdering}",

        "GPU_DIRECT_RDMA_WRITES_ORDERING_NONE".enum("", "0"),
        "GPU_DIRECT_RDMA_WRITES_ORDERING_OWNER".enum("", "100"),
        "GPU_DIRECT_RDMA_WRITES_ORDERING_ALL_DEVICES".enum("", "200")
    )

    EnumConstant(
        "{@code CUflushGPUDirectRDMAWritesScope}",

        "FLUSH_GPU_DIRECT_RDMA_WRITES_TO_OWNER".enum("", "100"),
        "FLUSH_GPU_DIRECT_RDMA_WRITES_TO_ALL_DEVICES".enum("", "200")
    )

    EnumConstant(
        "{@code CUflushGPUDirectRDMAWritesTarget}",

        "FLUSH_GPU_DIRECT_RDMA_WRITES_TARGET_CURRENT_CTX".enum("", "0")
    )

    EnumConstant(
        "{@code CUgraphDebugDot_flags}",

        "GRAPH_DEBUG_DOT_FLAGS_VERBOSE".enum("", "1<<0"),
        "GRAPH_DEBUG_DOT_FLAGS_RUNTIME_TYPES".enum("", "1<<1"),
        "GRAPH_DEBUG_DOT_FLAGS_KERNEL_NODE_PARAMS".enum("", "1<<2"),
        "GRAPH_DEBUG_DOT_FLAGS_MEMCPY_NODE_PARAMS".enum("", "1<<3"),
        "GRAPH_DEBUG_DOT_FLAGS_MEMSET_NODE_PARAMS".enum("", "1<<4"),
        "GRAPH_DEBUG_DOT_FLAGS_HOST_NODE_PARAMS".enum("", "1<<5"),
        "GRAPH_DEBUG_DOT_FLAGS_EVENT_NODE_PARAMS".enum("", "1<<6"),
        "GRAPH_DEBUG_DOT_FLAGS_EXT_SEMAS_SIGNAL_NODE_PARAMS".enum("", "1<<7"),
        "GRAPH_DEBUG_DOT_FLAGS_EXT_SEMAS_WAIT_NODE_PARAMS".enum("", "1<<8"),
        "GRAPH_DEBUG_DOT_FLAGS_KERNEL_NODE_ATTRIBUTES".enum("", "1<<9"),
        "GRAPH_DEBUG_DOT_FLAGS_HANDLES".enum("", "1<<10"),
        "GRAPH_DEBUG_DOT_FLAGS_MEM_ALLOC_NODE_PARAMS".enum("", "1<<11"),
        "GRAPH_DEBUG_DOT_FLAGS_MEM_FREE_NODE_PARAMS".enum("", "1<<12"),
        "GRAPH_DEBUG_DOT_FLAGS_BATCH_MEM_OP_NODE_PARAMS".enum("", "1<<13"),
        "GRAPH_DEBUG_DOT_FLAGS_EXTRA_TOPO_INFO".enum("", "1<<14")
    )

    EnumConstant(
        "{@code CUuserObject_flags}",

        "USER_OBJECT_NO_DESTRUCTOR_SYNC".enum("", "1")
    )

    EnumConstant(
        "{@code CUuserObjectRetain_flags}",

        "GRAPH_USER_OBJECT_MOVE".enum("", "1")
    )

    EnumConstant(
        "{@code CUgraphInstantiate_flags}",

        "CUDA_GRAPH_INSTANTIATE_FLAG_AUTO_FREE_ON_LAUNCH".enum("", "1"),
        "CUDA_GRAPH_INSTANTIATE_FLAG_UPLOAD".enum("", "2"),
        "CUDA_GRAPH_INSTANTIATE_FLAG_DEVICE_LAUNCH".enum("", "4"),
        "CUDA_GRAPH_INSTANTIATE_FLAG_USE_NODE_PRIORITY".enum("", "8")
    ).noPrefix()

    EnumConstant(
        "{@code CUmoduleLoadingMode}",

        "MODULE_EAGER_LOADING".enum("", "0x1"),
        "MODULE_LAZY_LOADING".enum("", "0x2")
    )

    EnumConstant(
        "{@code CUcoredumpSettings}",

        "COREDUMP_ENABLE_ON_EXCEPTION".enum("", "1"),
        "COREDUMP_TRIGGER_HOST".enum,
        "COREDUMP_LIGHTWEIGHT".enum,
        "COREDUMP_ENABLE_USER_TRIGGER".enum,
        "COREDUMP_FILE".enum,
        "COREDUMP_PIPE".enum,
        "COREDUMP_MAX".enum
    )

    CUresult(
        "GetErrorString",
        "",

        CUresult("error", ""),
        Check(1)..charASCII.const.p.p("pStr", "")
    )

    CUresult(
        "GetErrorName",
        "",

        CUresult("error", ""),
        Check(1)..charASCII.const.p.p("pStr", "")
    )

    CUresult(
        "Init",
        "",

        unsigned_int("Flags", "")
    )

    CUresult(
        "DriverGetVersion",
        "",

        Check(1)..int.p("driverVersion", "")
    )

    CUresult(
        "DeviceGet",
        "",

        Check(1)..CUdevice.p("device", ""),
        int("ordinal", "")
    )

    CUresult(
        "DeviceGetCount",
        "",

        Check(1)..int.p("count", "")
    )

    CUresult(
        "DeviceGetName",
        "",

        charASCII.p("name", ""),
        AutoSize("name")..int("len", ""),
        CUdevice("dev", "")
    )

    IgnoreMissing..CUresult(
        "DeviceGetUuid",
        "",

        CUuuid.p("uuid", ""),
        CUdevice("dev", "")
    )

    IgnoreMissing..CUresult(
        "DeviceGetUuid_v2",
        "",

        CUuuid.p("uuid", ""),
        CUdevice("dev", "")
    )

    IgnoreMissing..CUresult(
        "DeviceGetLuid",
        "",

        Unsafe..char.p("luid", ""),
        Check(1)..unsigned_int.p("deviceNodeMask", ""),
        CUdevice("dev", "")
    )

    CUresult(
        "DeviceTotalMem",
        "",

        Check(1)..size_t.p("bytes", ""),
        CUdevice("dev", "")
    ).versioned()

    IgnoreMissing..CUresult(
        "DeviceGetTexture1DLinearMaxWidth",
        "",

        Check(1)..size_t.p("maxWidthInElements", ""),
        CUarray_format("format", ""),
        unsigned_int("numChannels", ""),
        CUdevice("dev", "")
    )

    CUresult(
        "DeviceGetAttribute",
        "",

        Check(1)..int.p("pi", ""),
        CUdevice_attribute("attrib", ""),
        CUdevice("dev", "")
    )

    IgnoreMissing..CUresult(
        "DeviceGetNvSciSyncAttributes",
        "",

        Unsafe..void.p("nvSciSyncAttrList", ""),
        CUdevice("dev", ""),
        int("flags", "")
    )

    IgnoreMissing..CUresult(
        "DeviceSetMemPool",
        "",

        CUdevice("dev", ""),
        CUmemoryPool("pool", "")
    )

    IgnoreMissing..CUresult(
        "DeviceGetMemPool",
        "",

        Check(1)..CUmemoryPool.p("pool", ""),
        CUdevice("dev", "")
    )

    IgnoreMissing..CUresult(
        "DeviceGetDefaultMemPool",
        "",

        Check(1)..CUmemoryPool.p("pool_out", ""),
        CUdevice("dev", "")
    )

    IgnoreMissing..CUresult(
        "DeviceGetExecAffinitySupport",
        "",

        Check(1)..int.p("pi", ""),
        CUexecAffinityType("type", ""),
        CUdevice("dev", "")
    )

    IgnoreMissing..CUresult(
        "FlushGPUDirectRDMAWrites",
        "",

        CUflushGPUDirectRDMAWritesTarget("target", ""),
        CUflushGPUDirectRDMAWritesScope("scope", "")
    )

    CUresult(
        "DeviceGetProperties",
        "",

        CUdevprop.p("prop", ""),
        CUdevice("dev", "")
    )

    CUresult(
        "DeviceComputeCapability",
        "",

        Check(1)..int.p("major", ""),
        Check(1)..int.p("minor", ""),
        CUdevice("dev", "")
    )

    IgnoreMissing..CUresult(
        "DevicePrimaryCtxRetain",
        "",

        Check(1)..CUcontext.p("pctx", ""),
        CUdevice("dev", "")
    )

    IgnoreMissing..CUresult(
        "DevicePrimaryCtxRelease",
        "",

        CUdevice("dev", "")
    ).versioned()

    IgnoreMissing..CUresult(
        "DevicePrimaryCtxSetFlags",
        "",

        CUdevice("dev", ""),
        unsigned_int("flags", "")
    ).versioned()

    IgnoreMissing..CUresult(
        "DevicePrimaryCtxGetState",
        "",

        CUdevice("dev", ""),
        Check(1)..unsigned_int.p("flags", ""),
        Check(1)..int.p("active", "")
    )

    IgnoreMissing..CUresult(
        "DevicePrimaryCtxReset",
        "",

        CUdevice("dev", "")
    ).versioned()

    CUresult(
        "CtxCreate",
        "",

        Check(1)..CUcontext.p("pctx", ""),
        unsigned_int("flags", ""),
        CUdevice("dev", "")
    ).versioned()

    IgnoreMissing..CUresult(
        "CtxCreate_v3",
        "",

        Check(1)..CUcontext.p("pctx", ""),
        CUexecAffinityParam.p("paramsArray", ""),
        AutoSize("paramsArray")..int("numParams", ""),
        unsigned_int("flags", ""),
        CUdevice("dev", "")
    )

    IgnoreMissing..CUresult(
        "CtxDestroy",
        "",

        CUcontext("ctx", "")
    ).versioned()

    IgnoreMissing..CUresult(
        "CtxPushCurrent",
        "",

        CUcontext("ctx", "")
    ).versioned()

    IgnoreMissing..CUresult(
        "CtxPopCurrent",
        "",

        Check(1)..CUcontext.p("pctx", "")
    ).versioned()

    IgnoreMissing..CUresult(
        "CtxSetCurrent",
        "",

        CUcontext("ctx", "")
    )

    IgnoreMissing..CUresult(
        "CtxGetCurrent",
        "",

        Check(1)..CUcontext.p("pctx", "")
    )

    CUresult(
        "CtxGetDevice",
        "",

        Check(1)..CUdevice.p("device", "")
    )

    IgnoreMissing..CUresult(
        "CtxGetFlags",
        "",

        Check(1)..unsigned_int.p("flags", "")
    )

    IgnoreMissing..CUresult(
        "CtxSetFlags",
        "",

        unsigned_int("flags", "")
    )

    IgnoreMissing..CUresult(
        "CtxGetId",
        "",

        nullable..CUcontext("ctx", ""),
        Check(1)..unsigned_long_long.p("ctxId", "")
    )

    CUresult(
        "CtxSynchronize",
        "",

        void()
    )

    CUresult(
        "CtxSetLimit",
        "",

        CUlimit("limit", ""),
        size_t("value", "")
    )

    CUresult(
        "CtxGetLimit",
        "",

        Check(1)..size_t.p("pvalue", ""),
        CUlimit("limit", "")
    )

    CUresult(
        "CtxGetCacheConfig",
        "",

        Check(1)..CUfunc_cache.p("pconfig", "")
    )

    CUresult(
        "CtxSetCacheConfig",
        "",

        CUfunc_cache("config", "")
    )

    IgnoreMissing..CUresult(
        "CtxGetSharedMemConfig",
        "",

        Check(1)..CUsharedconfig.p("pConfig", "")
    )

    IgnoreMissing..CUresult(
        "CtxSetSharedMemConfig",
        "",

        CUsharedconfig("config", "")
    )

    CUresult(
        "CtxGetApiVersion",
        "",

        nullable..CUcontext("ctx", ""),
        Check(1)..unsigned_int.p("version", "")
    )

    CUresult(
        "CtxGetStreamPriorityRange",
        "",

        Check(1)..nullable..int.p("leastPriority", ""),
        Check(1)..nullable..int.p("greatestPriority", "")
    )

    IgnoreMissing..CUresult(
        "CtxResetPersistingL2Cache",
        "",

        void()
    )

    IgnoreMissing..CUresult(
        "CtxGetExecAffinity",
        "",

        Check(1)..CUexecAffinityParam.p("pExecAffinity", ""),
        CUexecAffinityType("type", "")
    )

    CUresult(
        "CtxAttach",
        "",

        Check(1)..CUcontext.p("pctx", ""),
        unsigned_int("flags", "")
    )

    CUresult(
        "CtxDetach",
        "",

        CUcontext("ctx", "")
    )

    CUresult(
        "ModuleLoad",
        "",

        Check(1)..CUmodule.p("module", ""),
        charUTF8.const.p("fname", "")
    )

    CUresult(
        "ModuleLoadData",
        "",

        Check(1)..CUmodule.p("module", ""),
        Unsafe..void.const.p("image", "")
    )

    CUresult(
        "ModuleLoadDataEx",
        "",

        Check(1)..CUmodule.p("module", ""),
        Unsafe..void.const.p("image", ""),
        AutoSize("options", "optionValues")..unsigned_int("numOptions", ""),
        nullable..CUjit_option.p("options", ""),
        nullable..void.p.p("optionValues", "")
    )

    CUresult(
        "ModuleLoadFatBinary",
        "",

        Check(1)..CUmodule.p("module", ""),
        Unsafe..void.const.p("fatCubin", "")
    )

    CUresult(
        "ModuleUnload",
        "",

        CUmodule("hmod", "")
    )

    IgnoreMissing..CUresult(
        "ModuleGetLoadingMode",
        "",

        Check(1)..CUmoduleLoadingMode.p("mode", "")
    )

    CUresult(
        "ModuleGetFunction",
        "",

        Check(1)..CUfunction.p("hfunc", ""),
        CUmodule("hmod", ""),
        charUTF8.const.p("name", "")
    )

    CUresult(
        "ModuleGetGlobal",
        "",

        Check(1)..nullable..CUdeviceptr.p("dptr", ""),
        Check(1)..nullable..size_t.p("bytes", ""),
        CUmodule("hmod", ""),
        charUTF8.const.p("name", "")
    ).versioned()

    IgnoreMissing..CUresult(
        "LinkCreate",
        "",

        AutoSize("options", "optionValues")..unsigned_int("numOptions", ""),
        CUjit_option.p("options", ""),
        void.p.p("optionValues", ""),
        Check(1)..CUlinkState.p("stateOut", "")
    ).versioned()

    IgnoreMissing..CUresult(
        "LinkAddData",
        "",

        CUlinkState("state", ""),
        CUjitInputType("type", ""),
        void.p("data", ""),
        AutoSize("data")..size_t("size", ""),
        charUTF8.const.p("name", ""),
        AutoSize("options", "optionValues")..unsigned_int("numOptions", ""),
        CUjit_option.p("options", ""),
        void.p.p("optionValues", "")
    ).versioned()

    IgnoreMissing..CUresult(
        "LinkAddFile",
        "",

        CUlinkState("state", ""),
        CUjitInputType("type", ""),
        charUTF8.const.p("path", ""),
        AutoSize("options", "optionValues")..unsigned_int("numOptions", ""),
        CUjit_option.p("options", ""),
        void.p.p("optionValues", "")
    ).versioned()

    IgnoreMissing..CUresult(
        "LinkComplete",
        "",

        CUlinkState("state", ""),
        Check(1)..void.p.p("cubinOut", ""),
        Check(1)..size_t.p("sizeOut", "")
    )

    IgnoreMissing..CUresult(
        "LinkDestroy",
        "",

        CUlinkState("state", "")
    )

    CUresult(
        "ModuleGetTexRef",
        "",

        Check(1)..CUtexref.p("pTexRef", ""),
        CUmodule("hmod", ""),
        charUTF8.const.p("name", "")
    )

    CUresult(
        "ModuleGetSurfRef",
        "",

        Check(1)..CUsurfref.p("pSurfRef", ""),
        CUmodule("hmod", ""),
        charUTF8.const.p("name", "")
    )

    IgnoreMissing..CUresult(
        "LibraryLoadData",
        "",

        Check(1)..CUlibrary.p("library", ""),
        Unsafe..void.const.p("code", ""),
        nullable..CUjit_option.p("jitOptions", ""),
        nullable..void.p.p("jitOptionsValues", ""),
        AutoSize("jitOptions", "jitOptionsValues")..unsigned_int("numJitOptions", ""),
        nullable..CUlibraryOption.p("libraryOptions", ""),
        nullable..void.p.p("libraryOptionValues", ""),
        AutoSize("libraryOptions", "libraryOptionValues")..unsigned_int("numLibraryOptions", "")
    )

    IgnoreMissing..CUresult(
        "LibraryLoadFromFile",
        "",

        Check(1)..CUlibrary.p("library", ""),
        charUTF8.const.p("fileName", ""),
        nullable..CUjit_option.p("jitOptions", ""),
        nullable..void.p.p("jitOptionsValues", ""),
        AutoSize("jitOptions", "jitOptionsValues")..unsigned_int("numJitOptions", ""),
        nullable..CUlibraryOption.p("libraryOptions", ""),
        nullable..void.p.p("libraryOptionValues", ""),
        AutoSize("libraryOptions", "libraryOptionValues")..unsigned_int("numLibraryOptions", "")
    )

    IgnoreMissing..CUresult(
        "LibraryUnload",
        "",

        CUlibrary("library", "")
    )

    IgnoreMissing..CUresult(
        "LibraryGetKernel",
        "",

        Check(1)..CUkernel.p("pKernel", ""),
        CUlibrary("library", ""),
        charUTF8.const.p("name", "")
    )

    IgnoreMissing..CUresult(
        "LibraryGetModule",
        "",

        Check(1)..CUmodule.p("pMod", ""),
        CUlibrary("library", "")
    )

    IgnoreMissing..CUresult(
        "KernelGetFunction",
        "",

        Check(1)..CUfunction.p("pFunc", ""),
        CUkernel("kernel", "")
    )

    IgnoreMissing..CUresult(
        "LibraryGetGlobal",
        "",

        Check(1)..CUdeviceptr.p("dptr", ""),
        Check(1)..size_t.p("bytes", ""),
        CUlibrary("library", ""),
        charUTF8.const.p("name", "")
    )

    IgnoreMissing..CUresult(
        "LibraryGetManaged",
        "",

        Check(1)..CUdeviceptr.p("dptr", ""),
        Check(1)..size_t.p("bytes", ""),
        CUlibrary("library", ""),
        charUTF8.const.p("name", "")
    )

    IgnoreMissing..CUresult(
        "LibraryGetUnifiedFunction",
        "",

        Check(1)..void.p.p("fptr", ""),
        CUlibrary("library", ""),
        charUTF8.const.p("symbol", "")
    )

    IgnoreMissing..CUresult(
        "KernelGetAttribute",
        "",

        Check(1)..int.p("pi", ""),
        CUfunction_attribute("attrib", ""),
        CUkernel("kernel", ""),
        CUdevice("dev", "")
    )

    IgnoreMissing..CUresult(
        "KernelSetAttribute",
        "",

        CUfunction_attribute("attrib", ""),
        int("val", ""),
        CUkernel("kernel", ""),
        CUdevice("dev", "")
    )

    IgnoreMissing..CUresult(
        "KernelSetCacheConfig",
        "",

        CUkernel("kernel", ""),
        CUfunc_cache("config", ""),
        CUdevice("dev", "")
    )

    CUresult(
        "MemGetInfo",
        "",

        Check(1)..size_t.p("free", ""),
        Check(1)..size_t.p("total", "")
    ).versioned()

    CUresult(
        "MemAlloc",
        "",

        Check(1)..CUdeviceptr.p("dptr", ""),
        size_t("bytesize", "")
    ).versioned()

    CUresult(
        "MemAllocPitch",
        "",

        Check(1)..CUdeviceptr.p("dptr", ""),
        Check(1)..size_t.p("pPitch", ""),
        size_t("WidthInBytes", ""),
        size_t("Height", ""),
        unsigned_int("ElementSizeBytes", "")
    ).versioned()

    CUresult(
        "MemFree",
        "",

        CUdeviceptr("dptr", "")
    ).versioned()

    CUresult(
        "MemGetAddressRange",
        "",

        Check(1)..nullable..CUdeviceptr.p("pbase", ""),
        Check(1)..nullable..size_t.p("psize", ""),
        CUdeviceptr("dptr", "")
    ).versioned()

    CUresult(
        "MemAllocHost",
        "",

        Check(1)..void.p.p("pp", ""),
        size_t("bytesize", "")
    ).versioned()

    CUresult(
        "MemFreeHost",
        "",

        Unsafe..void.p("p", "")
    )

    CUresult(
        "MemHostAlloc",
        "",

        Check(1)..void.p.p("pp", ""),
        size_t("bytesize", ""),
        unsigned_int("Flags", "")
    )

    CUresult(
        "MemHostGetDevicePointer",
        "",

        Check(1)..CUdeviceptr.p("pdptr", ""),
        Unsafe..void.p("p", ""),
        unsigned_int("Flags", "")
    ).versioned()

    CUresult(
        "MemHostGetFlags",
        "",

        Check(1)..unsigned_int.p("pFlags", ""),
        Unsafe..void.p("p", "")
    )

    IgnoreMissing..CUresult(
        "MemAllocManaged",
        "",

        Check(1)..CUdeviceptr.p("dptr", ""),
        size_t("bytesize", ""),
        unsigned_int("flags", "")
    )

    IgnoreMissing..CUresult(
        "DeviceGetByPCIBusId",
        "",

        Check(1)..CUdevice.p("dev", ""),
        charASCII.const.p("pciBusId", "")
    )

    IgnoreMissing..CUresult(
        "DeviceGetPCIBusId",
        "",

        char.p("pciBusId", ""),
        AutoSize("pciBusId")..int("len", ""),
        CUdevice("dev", "")
    )

    IgnoreMissing..CUresult(
        "IpcGetEventHandle",
        "",

        CUipcEventHandle.p("pHandle", ""),
        CUevent("event", "")
    )

    IgnoreMissing..CUresult(
        "IpcOpenEventHandle",
        "",

        Check(1)..CUevent.p("phEvent", ""),
        CUipcEventHandle("handle", "")
    )

    IgnoreMissing..CUresult(
        "IpcGetMemHandle",
        "",

        CUipcMemHandle.p("pHandle", ""),
        CUdeviceptr("dptr", "")
    )

    IgnoreMissing..CUresult(
        "IpcOpenMemHandle",
        "",

        Check(1)..CUdeviceptr.p("pdptr", ""),
        CUipcMemHandle("handle", ""),
        unsigned_int("Flags", "")
    ).versioned()

    IgnoreMissing..CUresult(
        "IpcCloseMemHandle",
        "",

        CUdeviceptr("dptr", "")
    )

    IgnoreMissing..CUresult(
        "MemHostRegister",
        "",

        void.p("p", ""),
        AutoSize("p")..size_t("bytesize", ""),
        unsigned_int("Flags", "")
    ).versioned()

    IgnoreMissing..CUresult(
        "MemHostUnregister",
        "",

        Unsafe..void.p("p", "")
    )

    IgnoreMissing..CUresult(
        "Memcpy",
        "",

        CUdeviceptr("dst", ""),
        CUdeviceptr("src", ""),
        size_t("ByteCount", "")
    ).ptds()

    IgnoreMissing..CUresult(
        "MemcpyPeer",
        "",

        CUdeviceptr("dstDevice", ""),
        CUcontext("dstContext", ""),
        CUdeviceptr("srcDevice", ""),
        CUcontext("srcContext", ""),
        size_t("ByteCount", "")
    ).ptds()

    CUresult(
        "MemcpyHtoD",
        "",

        CUdeviceptr("dstDevice", ""),
        MultiTypeAll..void.const.p("srcHost", ""),
        AutoSize("srcHost")..size_t("ByteCount", "")
    ).ptds(2)

    CUresult(
        "MemcpyDtoH",
        "",

        MultiTypeAll..void.p("dstHost", ""),
        CUdeviceptr("srcDevice", ""),
        AutoSize("dstHost")..size_t("ByteCount", "")
    ).ptds(2)

    CUresult(
        "MemcpyDtoD",
        "",

        CUdeviceptr("dstDevice", ""),
        CUdeviceptr("srcDevice", ""),
        size_t("ByteCount", "")
    ).ptds(2)

    CUresult(
        "MemcpyDtoA",
        "",

        CUarray("dstArray", ""),
        size_t("dstOffset", ""),
        CUdeviceptr("srcDevice", ""),
        size_t("ByteCount", "")
    ).ptds(2)

    CUresult(
        "MemcpyAtoD",
        "",

        CUdeviceptr("dstDevice", ""),
        CUarray("srcArray", ""),
        size_t("srcOffset", ""),
        size_t("ByteCount", "")
    ).ptds(2)

    CUresult(
        "MemcpyHtoA",
        "",

        CUarray("dstArray", ""),
        size_t("dstOffset", ""),
        MultiTypeAll..void.const.p("srcHost", ""),
        AutoSize("srcHost")..size_t("ByteCount", "")
    ).ptds(2)

    CUresult(
        "MemcpyAtoH",
        "",

        MultiTypeAll..void.p("dstHost", ""),
        CUarray("srcArray", ""),
        size_t("srcOffset", ""),
        AutoSize("dstHost")..size_t("ByteCount", "")
    ).ptds(2)

    CUresult(
        "MemcpyAtoA",
        "",

        CUarray("dstArray", ""),
        size_t("dstOffset", ""),
        CUarray("srcArray", ""),
        size_t("srcOffset", ""),
        size_t("ByteCount", "")
    ).ptds(2)

    CUresult(
        "Memcpy2D",
        "",

        CUDA_MEMCPY2D.const.p("pCopy", "")
    ).ptds(2)

    CUresult(
        "Memcpy2DUnaligned",
        "",

        CUDA_MEMCPY2D.const.p("pCopy", "")
    ).ptds(2)

    CUresult(
        "Memcpy3D",
        "",

        CUDA_MEMCPY3D.const.p("pCopy", "")
    ).ptds(2)

    IgnoreMissing..CUresult(
        "Memcpy3DPeer",
        "",

        CUDA_MEMCPY3D_PEER.const.p("pCopy", "")
    ).ptds()

    IgnoreMissing..CUresult(
        "MemcpyAsync",
        "",

        CUdeviceptr("dst", ""),
        CUdeviceptr("src", ""),
        size_t("ByteCount", ""),
        nullable..CUstream("hStream", "")
    ).ptsz()

    IgnoreMissing..CUresult(
        "MemcpyPeerAsync",
        "",

        CUdeviceptr("dstDevice", ""),
        CUcontext("dstContext", ""),
        CUdeviceptr("srcDevice", ""),
        CUcontext("srcContext", ""),
        size_t("ByteCount", ""),
        nullable..CUstream("hStream", "")
    ).ptsz()

    CUresult(
        "MemcpyHtoDAsync",
        "",

        CUdeviceptr("dstDevice", ""),
        MultiTypeAll..void.const.p("srcHost", ""),
        AutoSize("srcHost")..size_t("ByteCount", ""),
        nullable..CUstream("hStream", "")
    ).ptsz(2)

    CUresult(
        "MemcpyDtoHAsync",
        "",

        MultiTypeAll..void.p("dstHost", ""),
        CUdeviceptr("srcDevice", ""),
        AutoSize("dstHost")..size_t("ByteCount", ""),
        nullable..CUstream("hStream", "")
    ).ptsz(2)

    CUresult(
        "MemcpyDtoDAsync",
        "",

        CUdeviceptr("dstDevice", ""),
        CUdeviceptr("srcDevice", ""),
        size_t("ByteCount", ""),
        nullable..CUstream("hStream", "")
    ).ptsz(2)

    CUresult(
        "MemcpyHtoAAsync",
        "",

        CUarray("dstArray", ""),
        size_t("dstOffset", ""),
        MultiTypeAll..void.const.p("srcHost", ""),
        AutoSize("srcHost")..size_t("ByteCount", ""),
        nullable..CUstream("hStream", "")
    ).ptsz(2)

    CUresult(
        "MemcpyAtoHAsync",
        "",

        MultiTypeAll..void.p("dstHost", ""),
        CUarray("srcArray", ""),
        size_t("srcOffset", ""),
        AutoSize("dstHost")..size_t("ByteCount", ""),
        nullable..CUstream("hStream", "")
    ).ptsz(2)

    CUresult(
        "Memcpy2DAsync",
        "",

        CUDA_MEMCPY2D.const.p("pCopy", ""),
        nullable..CUstream("hStream", "")
    ).ptsz(2)

    CUresult(
        "Memcpy3DAsync",
        "",

        CUDA_MEMCPY3D.const.p("pCopy", ""),
        nullable..CUstream("hStream", "")
    ).ptsz(2)

    IgnoreMissing..CUresult(
        "Memcpy3DPeerAsync",
        "",

        CUDA_MEMCPY3D_PEER.const.p("pCopy", ""),
        nullable..CUstream("hStream", "")
    ).ptsz()

    CUresult(
        "MemsetD8",
        "",

        CUdeviceptr("dstDevice", ""),
        unsigned_char("uc", ""),
        size_t("N", "")
    ).ptds(2)

    CUresult(
        "MemsetD16",
        "",

        CUdeviceptr("dstDevice", ""),
        unsigned_short("us", ""),
        size_t("N", "")
    ).ptds(2)

    CUresult(
        "MemsetD32",
        "",

        CUdeviceptr("dstDevice", ""),
        unsigned_int("ui", ""),
        size_t("N", "")
    ).ptds(2)

    CUresult(
        "MemsetD2D8",
        "",

        CUdeviceptr("dstDevice", ""),
        size_t("dstPitch", ""),
        unsigned_char("uc", ""),
        size_t("Width", ""),
        size_t("Height", "")
    ).ptds(2)

    CUresult(
        "MemsetD2D16",
        "",

        CUdeviceptr("dstDevice", ""),
        size_t("dstPitch", ""),
        unsigned_short("us", ""),
        size_t("Width", ""),
        size_t("Height", "")
    ).ptds(2)

    CUresult(
        "MemsetD2D32",
        "",

        CUdeviceptr("dstDevice", ""),
        size_t("dstPitch", ""),
        unsigned_int("ui", ""),
        size_t("Width", ""),
        size_t("Height", "")
    ).ptds(2)

    CUresult(
        "MemsetD8Async",
        "",

        CUdeviceptr("dstDevice", ""),
        unsigned_char("uc", ""),
        size_t("N", ""),
        nullable..CUstream("hStream", "")
    ).ptsz()

    CUresult(
        "MemsetD16Async",
        "",

        CUdeviceptr("dstDevice", ""),
        unsigned_short("us", ""),
        size_t("N", ""),
        nullable..CUstream("hStream", "")
    ).ptsz()

    CUresult(
        "MemsetD32Async",
        "",

        CUdeviceptr("dstDevice", ""),
        unsigned_int("ui", ""),
        size_t("N", ""),
        nullable..CUstream("hStream", "")
    ).ptsz()

    CUresult(
        "MemsetD2D8Async",
        "",

        CUdeviceptr("dstDevice", ""),
        size_t("dstPitch", ""),
        unsigned_char("uc", ""),
        size_t("Width", ""),
        size_t("Height", ""),
        nullable..CUstream("hStream", "")
    ).ptsz()

    CUresult(
        "MemsetD2D16Async",
        "",

        CUdeviceptr("dstDevice", ""),
        size_t("dstPitch", ""),
        unsigned_short("us", ""),
        size_t("Width", ""),
        size_t("Height", ""),
        nullable..CUstream("hStream", "")
    ).ptsz()

    CUresult(
        "MemsetD2D32Async",
        "",

        CUdeviceptr("dstDevice", ""),
        size_t("dstPitch", ""),
        unsigned_int("ui", ""),
        size_t("Width", ""),
        size_t("Height", ""),
        nullable..CUstream("hStream", "")
    ).ptsz()

    CUresult(
        "ArrayCreate",
        "",

        Check(1)..CUarray.p("pHandle", ""),
        CUDA_ARRAY_DESCRIPTOR.const.p("pAllocateArray", "")
    ).versioned()

    CUresult(
        "ArrayGetDescriptor",
        "",

        CUDA_ARRAY_DESCRIPTOR.p("pArrayDescriptor", ""),
        CUarray("hArray", "")
    ).versioned()

    IgnoreMissing..CUresult(
        "ArrayGetSparseProperties",
        "",

        CUDA_ARRAY_SPARSE_PROPERTIES.p("sparseProperties", ""),
        CUarray("array", "")
    )

    IgnoreMissing..CUresult(
        "MipmappedArrayGetSparseProperties",
        "",

        CUDA_ARRAY_SPARSE_PROPERTIES.p("sparseProperties", ""),
        CUmipmappedArray("mipmap", "")
    )

    IgnoreMissing..CUresult(
        "ArrayGetMemoryRequirements",
        "",

        CUDA_ARRAY_MEMORY_REQUIREMENTS.p("memoryRequirements", ""),
        CUarray("array", ""),
        CUdevice("device", "")
    )

    IgnoreMissing..CUresult(
        "MipmappedArrayGetMemoryRequirements",
        "",

        CUDA_ARRAY_MEMORY_REQUIREMENTS.p("memoryRequirements", ""),
        CUmipmappedArray("mipmap", ""),
        CUdevice("device", "")
    )

    IgnoreMissing..CUresult(
        "ArrayGetPlane",
        "",

        Check(1)..CUarray.p("pPlaneArray", ""),
        CUarray("hArray", ""),
        unsigned_int("planeIdx", "")
    )

    CUresult(
        "ArrayDestroy",
        "",

        CUarray("hArray", "")
    )

    CUresult(
        "Array3DCreate",
        "",

        Check(1)..CUarray.p("pHandle", ""),
        CUDA_ARRAY3D_DESCRIPTOR.const.p("pAllocateArray", "")
    ).versioned()

    CUresult(
        "Array3DGetDescriptor",
        "",

        CUDA_ARRAY3D_DESCRIPTOR.p("pArrayDescriptor", ""),
        CUarray("hArray", "")
    ).versioned()

    IgnoreMissing..CUresult(
        "MipmappedArrayCreate",
        "",

        Check(1)..CUmipmappedArray.p("pHandle", ""),
        CUDA_ARRAY3D_DESCRIPTOR.const.p("pMipmappedArrayDesc", ""),
        unsigned_int("numMipmapLevels", "")
    )

    IgnoreMissing..CUresult(
        "MipmappedArrayGetLevel",
        "",

        Check(1)..CUarray.p("pLevelArray", ""),
        CUmipmappedArray("hMipmappedArray", ""),
        unsigned_int("level", "")
    )

    IgnoreMissing..CUresult(
        "MipmappedArrayDestroy",
        "",

        CUmipmappedArray("hMipmappedArray", "")
    )

    IgnoreMissing..CUresult(
        "MemGetHandleForAddressRange",
        "",

        Unsafe..void.p("handle", ""),
        CUdeviceptr("dptr", ""),
        size_t("size", ""),
        CUmemRangeHandleType("handleType", ""),
        unsigned_long_long("flags", "")
    )

    IgnoreMissing..CUresult(
        "MemAddressReserve",
        "",

        Check(1)..CUdeviceptr.p("ptr", ""),
        size_t("size", ""),
        size_t("alignment", ""),
        CUdeviceptr("addr", ""),
        unsigned_long_long("flags", "")
    )

    IgnoreMissing..CUresult(
        "MemAddressFree",
        "",

        CUdeviceptr("ptr", ""),
        size_t("size", "")
    )

    IgnoreMissing..CUresult(
        "MemCreate",
        "",

        Check(1)..CUmemGenericAllocationHandle.p("handle", ""),
        size_t("size", ""),
        CUmemAllocationProp.const.p("prop", ""),
        unsigned_long_long("flags", "")
    )

    IgnoreMissing..CUresult(
        "MemRelease",
        "",

        CUmemGenericAllocationHandle("handle", "")
    )

    IgnoreMissing..CUresult(
        "MemMap",
        "",

        CUdeviceptr("ptr", ""),
        size_t("size", ""),
        size_t("offset", ""),
        CUmemGenericAllocationHandle("handle", ""),
        unsigned_long_long("flags", "")
    )

    IgnoreMissing..CUresult(
        "MemMapArrayAsync",
        "",

        CUarrayMapInfo.p("mapInfoList", ""),
        AutoSize("mapInfoList")..unsigned_int("count", ""),
        nullable..CUstream("hStream", "")
    ).ptsz()

    IgnoreMissing..CUresult(
        "MemUnmap",
        "",

        CUdeviceptr("ptr", ""),
        size_t("size", "")
    )

    IgnoreMissing..CUresult(
        "MemSetAccess",
        "",

        CUdeviceptr("ptr", ""),
        size_t("size", ""),
        CUmemAccessDesc.const.p("desc", ""),
        AutoSize("desc")..size_t("count", "")
    )

    IgnoreMissing..CUresult(
        "MemGetAccess",
        "",

        Check(1)..unsigned_long_long.p("flags", ""),
        CUmemLocation.const.p("location", ""),
        CUdeviceptr("ptr", "")
    )

    IgnoreMissing..CUresult(
        "MemExportToShareableHandle",
        "",

        MultiType(PointerMapping.DATA_POINTER)..Unsafe..void.p("shareableHandle", ""),
        CUmemGenericAllocationHandle("handle", ""),
        CUmemAllocationHandleType("handleType", ""),
        unsigned_long_long("flags", "")
    )

    IgnoreMissing..CUresult(
        "MemImportFromShareableHandle",
        "",

        Check(1)..CUmemGenericAllocationHandle.p("handle", ""),
        opaque_p("osHandle", ""),
        CUmemAllocationHandleType("shHandleType", "")
    )

    IgnoreMissing..CUresult(
        "MemGetAllocationGranularity",
        "",

        Check(1)..size_t.p("granularity", ""),
        CUmemAllocationProp.const.p("prop", ""),
        CUmemAllocationGranularity_flags("option", "")
    )

    IgnoreMissing..CUresult(
        "MemGetAllocationPropertiesFromHandle",
        "",

        CUmemAllocationProp.p("prop", ""),
        CUmemGenericAllocationHandle("handle", "")
    )

    IgnoreMissing..CUresult(
        "MemRetainAllocationHandle",
        "",

        Check(1)..CUmemGenericAllocationHandle.p("handle", ""),
        Unsafe..void.p("addr", "")
    )

    IgnoreMissing..CUresult(
        "MemFreeAsync",
        "",

        CUdeviceptr("dptr", ""),
        nullable..CUstream("hStream", "")
    ).ptsz()

    IgnoreMissing..CUresult(
        "MemAllocAsync",
        "",

        Check(1)..CUdeviceptr.p("dptr", ""),
        size_t("bytesize", ""),
        nullable..CUstream("hStream", "")
    ).ptsz()

    IgnoreMissing..CUresult(
        "MemPoolTrimTo",
        "",

        CUmemoryPool("pool", ""),
        size_t("minBytesToKeep", "")
    )

    IgnoreMissing..CUresult(
        "MemPoolSetAttribute",
        "",

        CUmemoryPool("pool", ""),
        CUmemPool_attribute("attr", ""),
        MultiType(PointerMapping.DATA_INT, PointerMapping.DATA_LONG)..Unsafe..void.p("value", "")
    )

    IgnoreMissing..CUresult(
        "MemPoolGetAttribute",
        "",

        CUmemoryPool("pool", ""),
        CUmemPool_attribute("attr", ""),
        MultiType(PointerMapping.DATA_INT, PointerMapping.DATA_LONG)..Unsafe..void.p("value", "")
    )

    IgnoreMissing..CUresult(
        "MemPoolSetAccess",
        "",

        CUmemoryPool("pool", ""),
        CUmemAccessDesc.const.p("map", ""),
        AutoSize("map")..size_t("count", "")
    )

    IgnoreMissing..CUresult(
        "MemPoolGetAccess",
        "",

        Check(1)..CUmemAccess_flags.p("flags", ""),
        CUmemoryPool("memPool", ""),
        CUmemLocation.p("location", "")
    )

    IgnoreMissing..CUresult(
        "MemPoolCreate",
        "",

        Check(1)..CUmemoryPool.p("pool", ""),
        CUmemPoolProps.const.p("poolProps", "")
    )

    IgnoreMissing..CUresult(
        "MemPoolDestroy",
        "",

        CUmemoryPool("pool", "")
    )

    IgnoreMissing..CUresult(
        "MemAllocFromPoolAsync",
        "",

        Check(1)..CUdeviceptr.p("dptr", ""),
        size_t("bytesize", ""),
        CUmemoryPool("pool", ""),
        nullable..CUstream("hStream", "")
    ).ptsz()

    IgnoreMissing..CUresult(
        "MemPoolExportToShareableHandle",
        "",

        MultiType(PointerMapping.DATA_POINTER)..Unsafe..void.p("handle_out", ""),
        CUmemoryPool("pool", ""),
        CUmemAllocationHandleType("handleType", ""),
        unsigned_long_long("flags", "")
    )

    IgnoreMissing..CUresult(
        "MemPoolImportFromShareableHandle",
        "",

        Check(1)..CUmemoryPool.p("pool_out", ""),
        MultiType(PointerMapping.DATA_POINTER)..Unsafe..void.p("handle", ""),
        CUmemAllocationHandleType("handleType", ""),
        unsigned_long_long("flags", "")
    )

    IgnoreMissing..CUresult(
        "MemPoolExportPointer",
        "",

        CUmemPoolPtrExportData.p("shareData_out", ""),
        CUdeviceptr("ptr", "")
    )

    IgnoreMissing..CUresult(
        "MemPoolImportPointer",
        "",

        Check(1)..CUdeviceptr.p("ptr_out", ""),
        CUmemoryPool("pool", ""),
        CUmemPoolPtrExportData.p("shareData", "")
    )

    IgnoreMissing..CUresult(
        "MulticastCreate",
        "",

        Check(1)..CUmemGenericAllocationHandle.p("mcHandle", ""),
        CUmulticastObjectProp.const.p("prop", "")
    )

    IgnoreMissing..CUresult(
        "MulticastAddDevice",
        "",

        CUmemGenericAllocationHandle("mcHandle", ""),
        CUdevice("dev", "")
    )

    IgnoreMissing..CUresult(
        "MulticastBindMem",
        "",

        CUmemGenericAllocationHandle("mcHandle", ""),
        size_t("mcOffset", ""),
        CUmemGenericAllocationHandle("memHandle", ""),
        size_t("memOffset", ""),
        size_t("size", ""),
        unsigned_long_long("flags", "")
    )

    IgnoreMissing..CUresult(
        "MulticastBindAddr",
        "",

        CUmemGenericAllocationHandle("mcHandle", ""),
        size_t("mcOffset", ""),
        CUdeviceptr("memptr", ""),
        size_t("size", ""),
        unsigned_long_long("flags", "")
    )

    IgnoreMissing..CUresult(
        "MulticastUnbind",
        "",

        CUmemGenericAllocationHandle("mcHandle", ""),
        CUdevice("dev", ""),
        size_t("mcOffset", ""),
        size_t("size", "")
    )

    IgnoreMissing..CUresult(
        "MulticastGetGranularity",
        "",

        Check(1)..size_t.p("granularity", ""),
        CUmulticastObjectProp.const.p("prop", ""),
        CUmulticastGranularity_flags("option", "")
    )

    IgnoreMissing..CUresult(
        "PointerGetAttribute",
        "",

        MultiType(
            PointerMapping.DATA_POINTER,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_LONG
        )..Unsafe..void.p("data", ""),
        CUpointer_attribute("attribute", ""),
        CUdeviceptr("ptr", "")
    )

    IgnoreMissing..CUresult(
        "MemPrefetchAsync",
        "",

        CUdeviceptr("devPtr", ""),
        size_t("count", ""),
        CUdevice("dstDevice", ""),
        nullable..CUstream("hStream", "")
    ).ptsz()

    IgnoreMissing..CUresult(
        "MemAdvise",
        "",

        CUdeviceptr("devPtr", ""),
        size_t("count", ""),
        CUmem_advise("advice", ""),
        CUdevice("device", "")
    )

    IgnoreMissing..CUresult(
        "MemRangeGetAttribute",
        "",

        void.p("data", ""),
        AutoSize("data")..size_t("dataSize", ""),
        CUmem_range_attribute("attribute", ""),
        CUdeviceptr("devPtr", ""),
        size_t("count", "")
    )

    IgnoreMissing..CUresult(
        "MemRangeGetAttributes",
        "",

        void.p.p("data", ""),
        size_t.p("dataSizes", ""),
        CUmem_range_attribute.p("attributes", ""),
        AutoSize("attributes", "data", "dataSizes")..size_t("numAttributes", ""),
        CUdeviceptr("devPtr", ""),
        size_t("count", "")
    )

    IgnoreMissing..CUresult(
        "PointerSetAttribute",
        "",

        Unsafe..void.const.p("value", ""),
        CUpointer_attribute("attribute", ""),
        CUdeviceptr("ptr", "")
    )

    IgnoreMissing..CUresult(
        "PointerGetAttributes",
        "",

        AutoSize("attributes", "data")..unsigned_int("numAttributes", ""),
        CUpointer_attribute.p("attributes", ""),
        void.p.p("data", ""),
        CUdeviceptr("ptr", "")
    )

    CUresult(
        "StreamCreate",
        "",

        Check(1)..CUstream.p("phStream", ""),
        unsigned_int("Flags", "")
    )

    CUresult(
        "StreamCreateWithPriority",
        "",

        Check(1)..CUstream.p("phStream", ""),
        unsigned_int("flags", ""),
        int("priority", "")
    )

    CUresult(
        "StreamGetPriority",
        "",

        nullable..CUstream("hStream", ""),
        Check(1)..int.p("priority", "")
    ).ptsz()

    CUresult(
        "StreamGetFlags",
        "",

        nullable..CUstream("hStream", ""),
        Check(1)..unsigned_int.p("flags", "")
    ).ptsz()

    IgnoreMissing..CUresult(
        "StreamGetId",
        "",

        nullable..CUstream("hStream", ""),
        Check(1)..unsigned_long_long.p("streamId", "")
    ).ptsz()

    IgnoreMissing..CUresult(
        "StreamGetCtx",
        "",

        nullable..CUstream("hStream", ""),
        Check(1)..CUcontext.p("pctx", "")
    ).ptsz()

    CUresult(
        "StreamWaitEvent",
        "",

        nullable..CUstream("hStream", ""),
        CUevent("hEvent", ""),
        unsigned_int("Flags", "")
    ).ptsz()

    IgnoreMissing..CUresult(
        "StreamAddCallback",
        "",

        nullable..CUstream("hStream", ""),
        CUstreamCallback("callback", ""),
        opaque_p("userData", ""),
        unsigned_int("flags", "")
    ).ptsz()

    IgnoreMissing..CUresult(
        "StreamBeginCapture",
        "",

        nullable..CUstream("hStream", "")
    ).ptsz()

    IgnoreMissing..CUresult(
        "StreamBeginCapture_v2",
        "",

        nullable..CUstream("hStream", ""),
        CUstreamCaptureMode("mode", "")
    ).ptsz()

    IgnoreMissing..CUresult(
        "ThreadExchangeStreamCaptureMode",
        "",

        Check(1)..CUstreamCaptureMode.p("mode", "")
    )

    IgnoreMissing..CUresult(
        "StreamEndCapture",
        "",

        nullable..CUstream("hStream", ""),
        Check(1)..CUgraph.p("phGraph", "")
    ).ptsz()

    IgnoreMissing..CUresult(
        "StreamIsCapturing",
        "",

        nullable..CUstream("hStream", ""),
        Check(1)..CUstreamCaptureStatus.p("captureStatus", "")
    ).ptsz()

    IgnoreMissing..CUresult(
        "StreamGetCaptureInfo",
        "",

        nullable..CUstream("hStream", ""),
        Check(1)..CUstreamCaptureStatus.p("captureStatus", ""),
        Check(1)..cuuint64_t.p("id", "")
    ).ptsz()

    IgnoreMissing..CUresult(
        "StreamGetCaptureInfo_v2",
        "",

        nullable..CUstream("hStream", ""),
        Check(1)..CUstreamCaptureStatus.p("captureStatus_out", ""),
        Check(1)..nullable..cuuint64_t.p("id_out", ""),
        Check(1)..nullable..CUgraph.p("graph_out", ""),
        Check(1)..nullable..CUgraphNode.const.p.p("dependencies_out", ""),
        Check(1)..nullable..size_t.p("numDependencies_out", "")
    ).ptsz()

    IgnoreMissing..CUresult(
        "StreamUpdateCaptureDependencies",
        "",

        nullable..CUstream("hStream", ""),
        CUgraphNode.p("dependencies", ""),
        AutoSize("dependencies")..size_t("numDependencies", ""),
        unsigned_int("flags", "")
    ).ptsz()

    IgnoreMissing..CUresult(
        "StreamAttachMemAsync",
        "",

        nullable..CUstream("hStream", ""),
        CUdeviceptr("dptr", ""),
        size_t("length", ""),
        unsigned_int("flags", "")
    ).ptsz()

    CUresult(
        "StreamQuery",
        "",

        nullable..CUstream("hStream", "")
    ).ptsz()

    CUresult(
        "StreamSynchronize",
        "",

        nullable..CUstream("hStream", "")
    ).ptsz()

    IgnoreMissing..CUresult(
        "StreamDestroy",
        "",

        nullable..CUstream("hStream", "")
    ).versioned()

    IgnoreMissing..CUresult(
        "StreamCopyAttributes",
        "",

        nullable..CUstream("dst", ""),
        nullable..CUstream("src", "")
    ).ptsz()

    IgnoreMissing..CUresult(
        "StreamGetAttribute",
        "",

        nullable..CUstream("hStream", ""),
        CUstreamAttrID("attr", ""),
        CUstreamAttrValue.p("value_out", "")
    ).ptsz()

    IgnoreMissing..CUresult(
        "StreamSetAttribute",
        "",

        nullable..CUstream("hStream", ""),
        CUstreamAttrID("attr", ""),
        CUstreamAttrValue.const.p("value", "")
    ).ptsz()

    CUresult(
        "EventCreate",
        "",

        Check(1)..CUevent.p("phEvent", ""),
        unsigned_int("Flags", "")
    )

    CUresult(
        "EventRecord",
        "",

        CUevent("hEvent", ""),
        nullable..CUstream("hStream", "")
    ).ptsz()

    IgnoreMissing..CUresult(
        "EventRecordWithFlags",
        "",

        CUevent("hEvent", ""),
        nullable..CUstream("hStream", ""),
        unsigned_int("flags", "")
    ).ptsz()

    CUresult(
        "EventQuery",
        "",

        CUevent("hEvent", "")
    )

    CUresult(
        "EventSynchronize",
        "",

        CUevent("hEvent", "")
    )

    IgnoreMissing..CUresult(
        "EventDestroy",
        "",

        CUevent("hEvent", "")
    ).versioned()

    CUresult(
        "EventElapsedTime",
        "",

        Check(1)..float.p("pMilliseconds", ""),
        CUevent("hStart", ""),
        CUevent("hEnd", "")
    )

    IgnoreMissing..CUresult(
        "ImportExternalMemory",
        "",

        Check(1)..CUexternalMemory.p("extMem_out", ""),
        CUDA_EXTERNAL_MEMORY_HANDLE_DESC.const.p("memHandleDesc", "")
    )

    IgnoreMissing..CUresult(
        "ExternalMemoryGetMappedBuffer",
        "",

        Check(1)..CUdeviceptr.p("devPtr", ""),
        CUexternalMemory("extMem", ""),
        CUDA_EXTERNAL_MEMORY_BUFFER_DESC.const.p("bufferDesc", "")
    )

    IgnoreMissing..CUresult(
        "ExternalMemoryGetMappedMipmappedArray",
        "",

        Check(1)..CUmipmappedArray.p("mipmap", ""),
        CUexternalMemory("extMem", ""),
        CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC.const.p("mipmapDesc", "")
    )

    IgnoreMissing..CUresult(
        "DestroyExternalMemory",
        "",

        CUexternalMemory("extMem", "")
    )

    IgnoreMissing..CUresult(
        "ImportExternalSemaphore",
        "",

        Check(1)..CUexternalSemaphore.p("extSem_out", ""),
        CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.const.p("semHandleDesc", "")
    )

    IgnoreMissing..CUresult(
        "SignalExternalSemaphoresAsync",
        "",

        CUexternalSemaphore.const.p("extSemArray", ""),
        CUDA_EXTERNAL_SEMAPHORE_SIGNAL_PARAMS.const.p("paramsArray", ""),
        AutoSize("extSemArray", "paramsArray")..unsigned_int("numExtSems", ""),
        nullable..CUstream("stream", "")
    ).ptsz()

    IgnoreMissing..CUresult(
        "WaitExternalSemaphoresAsync",
        "",

        CUexternalSemaphore.const.p("extSemArray", ""),
        CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.const.p("paramsArray", ""),
        AutoSize("extSemArray", "paramsArray")..unsigned_int("numExtSems", ""),
        nullable..CUstream("stream", "")
    ).ptsz()

    IgnoreMissing..CUresult(
        "DestroyExternalSemaphore",
        "",

        CUexternalSemaphore("extSem", "")
    )

    IgnoreMissing..CUresult(
        "StreamWaitValue32",
        "",

        nullable..CUstream("stream", ""),
        CUdeviceptr("addr", ""),
        cuuint32_t("value", ""),
        unsigned_int("flags", "")
    ).ptsz(2)

    IgnoreMissing..CUresult(
        "StreamWaitValue64",
        "",

        nullable..CUstream("stream", ""),
        CUdeviceptr("addr", ""),
        cuuint64_t("value", ""),
        unsigned_int("flags", "")
    ).ptsz(2)

    IgnoreMissing..CUresult(
        "StreamWriteValue32",
        "",

        nullable..CUstream("stream", ""),
        CUdeviceptr("addr", ""),
        cuuint32_t("value", ""),
        unsigned_int("flags", "")
    ).ptsz(2)

    IgnoreMissing..CUresult(
        "StreamWriteValue64",
        "",

        nullable..CUstream("stream", ""),
        CUdeviceptr("addr", ""),
        cuuint64_t("value", ""),
        unsigned_int("flags", "")
    ).ptsz(2)

    IgnoreMissing..CUresult(
        "StreamBatchMemOp",
        "",

        nullable..CUstream("stream", ""),
        AutoSize("paramArray")..unsigned_int("count", ""),
        CUstreamBatchMemOpParams.p("paramArray", ""),
        unsigned_int("flags", "")
    ).ptsz(2)

    CUresult(
        "FuncGetAttribute",
        "",

        Check(1)..int.p("pi", ""),
        CUfunction_attribute("attrib", ""),
        CUfunction("hfunc", "")
    )

    IgnoreMissing..CUresult(
        "FuncSetAttribute",
        "",

        CUfunction("hfunc", ""),
        CUfunction_attribute("attrib", ""),
        int("value", "")
    )

    CUresult(
        "FuncSetCacheConfig",
        "",

        CUfunction("hfunc", ""),
        CUfunc_cache("config", "")
    )

    IgnoreMissing..CUresult(
        "FuncSetSharedMemConfig",
        "",

        CUfunction("hfunc", ""),
        CUsharedconfig("config", "")
    )

    IgnoreMissing..CUresult(
        "FuncGetModule",
        "",

        Check(1)..CUmodule.p("hmod", ""),
        CUfunction("hfunc", "")
    )

    IgnoreMissing..CUresult(
        "LaunchKernel",
        "",

        CUfunction("f", ""),
        unsigned_int("gridDimX", ""),
        unsigned_int("gridDimY", ""),
        unsigned_int("gridDimZ", ""),
        unsigned_int("blockDimX", ""),
        unsigned_int("blockDimY", ""),
        unsigned_int("blockDimZ", ""),
        unsigned_int("sharedMemBytes", ""),
        nullable..CUstream("hStream", ""),
        Unsafe..nullable..void.p.p("kernelParams", ""),
        Unsafe..nullable..void.p.p("extra", "")
    ).ptsz()

    IgnoreMissing..CUresult(
        "LaunchKernelEx",
        "",

        CUlaunchConfig.const.p("config", ""),
        CUfunction("f", ""),
        Unsafe..nullable..void.p.p("kernelParams", ""),
        Unsafe..nullable..void.p.p("extra", "")
    ).ptsz()

    IgnoreMissing..CUresult(
        "LaunchCooperativeKernel",
        "",

        CUfunction("f", ""),
        unsigned_int("gridDimX", ""),
        unsigned_int("gridDimY", ""),
        unsigned_int("gridDimZ", ""),
        unsigned_int("blockDimX", ""),
        unsigned_int("blockDimY", ""),
        unsigned_int("blockDimZ", ""),
        unsigned_int("sharedMemBytes", ""),
        nullable..CUstream("hStream", ""),
        Unsafe..nullable..void.p.p("kernelParams", "")
    ).ptsz()

    IgnoreMissing..CUresult(
        "LaunchCooperativeKernelMultiDevice",
        "",

        CUDA_LAUNCH_PARAMS.p("launchParamsList", ""),
        AutoSize("launchParamsList")..unsigned_int("numDevices", ""),
        unsigned_int("flags", "")
    )

    IgnoreMissing..CUresult(
        "LaunchHostFunc",
        "",

        nullable..CUstream("hStream", ""),
        CUhostFn("fn", ""),
        opaque_p("userData", "")
    ).ptsz()

    CUresult(
        "FuncSetBlockShape",
        "",

        CUfunction("hfunc", ""),
        int("x", ""),
        int("y", ""),
        int("z", "")
    )

    CUresult(
        "FuncSetSharedSize",
        "",

        CUfunction("hfunc", ""),
        unsigned_int("bytes", "")
    )

    CUresult(
        "ParamSetSize",
        "",

        CUfunction("hfunc", ""),
        unsigned_int("numbytes", "")
    )

    CUresult(
        "ParamSeti",
        "",

        CUfunction("hfunc", ""),
        int("offset", ""),
        unsigned_int("value", "")
    )

    CUresult(
        "ParamSetf",
        "",

        CUfunction("hfunc", ""),
        int("offset", ""),
        float("value", "")
    )

    CUresult(
        "ParamSetv",
        "",

        CUfunction("hfunc", ""),
        int("offset", ""),
        void.p("ptr", ""),
        AutoSize("ptr")..unsigned_int("numbytes", "")
    )

    CUresult(
        "Launch",
        "",

        CUfunction("f", "")
    )

    CUresult(
        "LaunchGrid",
        "",

        CUfunction("f", ""),
        int("grid_width", ""),
        int("grid_height", "")
    )

    CUresult(
        "LaunchGridAsync",
        "",

        CUfunction("f", ""),
        int("grid_width", ""),
        int("grid_height", ""),
        nullable..CUstream("hStream", "")
    )

    CUresult(
        "ParamSetTexRef",
        "",

        CUfunction("hfunc", ""),
        int("texunit", ""),
        CUtexref("hTexRef", "")
    )

    IgnoreMissing..CUresult(
        "GraphCreate",
        "",

        Check(1)..CUgraph.p("phGraph", ""),
        unsigned_int("flags", "")
    )

    IgnoreMissing..CUresult(
        "GraphAddKernelNode",
        "",

        Check(1)..CUgraphNode.p("phGraphNode", ""),
        CUgraph("hGraph", ""),
        nullable..CUgraphNode.const.p("dependencies", ""),
        AutoSize("dependencies")..size_t("numDependencies", ""),
        CUDA_KERNEL_NODE_PARAMS.const.p("nodeParams", "")
    )

    IgnoreMissing..CUresult(
        "GraphAddKernelNode_v2",
        "",

        Check(1)..CUgraphNode.p("phGraphNode", ""),
        CUgraph("hGraph", ""),
        nullable..CUgraphNode.const.p("dependencies", ""),
        AutoSize("dependencies")..size_t("numDependencies", ""),
        CUDA_KERNEL_NODE_PARAMS_v2.const.p("nodeParams", "")
    )

    IgnoreMissing..CUresult(
        "GraphKernelNodeGetParams",
        "",

        CUgraphNode("hNode", ""),
        CUDA_KERNEL_NODE_PARAMS.p("nodeParams", "")
    )

    IgnoreMissing..CUresult(
        "GraphKernelNodeGetParams_v2",
        "",

        CUgraphNode("hNode", ""),
        CUDA_KERNEL_NODE_PARAMS_v2.p("nodeParams", "")
    )

    IgnoreMissing..CUresult(
        "GraphKernelNodeSetParams",
        "",

        CUgraphNode("hNode", ""),
        CUDA_KERNEL_NODE_PARAMS.const.p("nodeParams", "")
    )

    IgnoreMissing..CUresult(
        "GraphKernelNodeSetParams_v2",
        "",

        CUgraphNode("hNode", ""),
        CUDA_KERNEL_NODE_PARAMS_v2.const.p("nodeParams", "")
    )

    IgnoreMissing..CUresult(
        "GraphAddMemcpyNode",
        "",

        Check(1)..CUgraphNode.p("phGraphNode", ""),
        CUgraph("hGraph", ""),
        nullable..CUgraphNode.const.p("dependencies", ""),
        AutoSize("dependencies")..size_t("numDependencies", ""),
        CUDA_MEMCPY3D.const.p("copyParams", ""),
        CUcontext("ctx", "")
    )

    IgnoreMissing..CUresult(
        "GraphMemcpyNodeGetParams",
        "",

        CUgraphNode("hNode", ""),
        CUDA_MEMCPY3D.p("nodeParams", "")
    )

    IgnoreMissing..CUresult(
        "GraphMemcpyNodeSetParams",
        "",

        CUgraphNode("hNode", ""),
        CUDA_MEMCPY3D.const.p("nodeParams", "")
    )

    IgnoreMissing..CUresult(
        "GraphAddMemsetNode",
        "",

        Check(1)..CUgraphNode.p("phGraphNode", ""),
        CUgraph("hGraph", ""),
        nullable..CUgraphNode.const.p("dependencies", ""),
        AutoSize("dependencies")..size_t("numDependencies", ""),
        CUDA_MEMSET_NODE_PARAMS.const.p("memsetParams", ""),
        CUcontext("ctx", "")
    )

    IgnoreMissing..CUresult(
        "GraphMemsetNodeGetParams",
        "",

        CUgraphNode("hNode", ""),
        CUDA_MEMSET_NODE_PARAMS.p("nodeParams", "")
    )

    IgnoreMissing..CUresult(
        "GraphMemsetNodeSetParams",
        "",

        CUgraphNode("hNode", ""),
        CUDA_MEMSET_NODE_PARAMS.const.p("nodeParams", "")
    )

    IgnoreMissing..CUresult(
        "GraphAddHostNode",
        "",

        Check(1)..CUgraphNode.p("phGraphNode", ""),
        CUgraph("hGraph", ""),
        nullable..CUgraphNode.const.p("dependencies", ""),
        AutoSize("dependencies")..size_t("numDependencies", ""),
        CUDA_HOST_NODE_PARAMS.const.p("nodeParams", "")
    )

    IgnoreMissing..CUresult(
        "GraphHostNodeGetParams",
        "",

        CUgraphNode("hNode", ""),
        CUDA_HOST_NODE_PARAMS.p("nodeParams", "")
    )

    IgnoreMissing..CUresult(
        "GraphHostNodeSetParams",
        "",

        CUgraphNode("hNode", ""),
        CUDA_HOST_NODE_PARAMS.const.p("nodeParams", "")
    )

    IgnoreMissing..CUresult(
        "GraphAddChildGraphNode",
        "",

        Check(1)..CUgraphNode.p("phGraphNode", ""),
        CUgraph("hGraph", ""),
        nullable..CUgraphNode.const.p("dependencies", ""),
        AutoSize("dependencies")..size_t("numDependencies", ""),
        CUgraph("childGraph", "")
    )

    IgnoreMissing..CUresult(
        "GraphChildGraphNodeGetGraph",
        "",

        CUgraphNode("hNode", ""),
        Check(1)..CUgraph.p("phGraph", "")
    )

    IgnoreMissing..CUresult(
        "GraphAddEmptyNode",
        "",

        Check(1)..CUgraphNode.p("phGraphNode", ""),
        CUgraph("hGraph", ""),
        nullable..CUgraphNode.const.p("dependencies", ""),
        AutoSize("dependencies")..size_t("numDependencies", "")
    )

    IgnoreMissing..CUresult(
        "GraphAddEventRecordNode",
        "",

        Check(1)..CUgraphNode.p("phGraphNode", ""),
        CUgraph("hGraph", ""),
        nullable..CUgraphNode.const.p("dependencies", ""),
        AutoSize("dependencies")..size_t("numDependencies", ""),
        CUevent("event", "")
    )

    IgnoreMissing..CUresult(
        "GraphEventRecordNodeGetEvent",
        "",

        CUgraphNode("hNode", ""),
        Check(1)..CUevent.p("event_out", "")
    )

    IgnoreMissing..CUresult(
        "GraphEventRecordNodeSetEvent",
        "",

        CUgraphNode("hNode", ""),
        CUevent("event", "")
    )

    IgnoreMissing..CUresult(
        "GraphAddEventWaitNode",
        "",

        Check(1)..CUgraphNode.p("phGraphNode", ""),
        CUgraph("hGraph", ""),
        nullable..CUgraphNode.const.p("dependencies", ""),
        AutoSize("dependencies")..size_t("numDependencies", ""),
        CUevent("event", "")
    )

    IgnoreMissing..CUresult(
        "GraphEventWaitNodeGetEvent",
        "",

        CUgraphNode("hNode", ""),
        Check(1)..CUevent.p("event_out", "")
    )

    IgnoreMissing..CUresult(
        "GraphEventWaitNodeSetEvent",
        "",

        CUgraphNode("hNode", ""),
        CUevent("event", "")
    )

    IgnoreMissing..CUresult(
        "GraphAddExternalSemaphoresSignalNode",
        "",

        Check(1)..CUgraphNode.p("phGraphNode", ""),
        CUgraph("hGraph", ""),
        nullable..CUgraphNode.const.p("dependencies", ""),
        AutoSize("dependencies")..size_t("numDependencies", ""),
        CUDA_EXT_SEM_SIGNAL_NODE_PARAMS.const.p("nodeParams", "")
    )

    IgnoreMissing..CUresult(
        "GraphExternalSemaphoresSignalNodeGetParams",
        "",

        CUgraphNode("hNode", ""),
        CUDA_EXT_SEM_SIGNAL_NODE_PARAMS.p("params_out", "")
    )

    IgnoreMissing..CUresult(
        "GraphExternalSemaphoresSignalNodeSetParams",
        "",

        CUgraphNode("hNode", ""),
        CUDA_EXT_SEM_SIGNAL_NODE_PARAMS.const.p("nodeParams", "")
    )

    IgnoreMissing..CUresult(
        "GraphAddExternalSemaphoresWaitNode",
        "",

        Check(1)..CUgraphNode.p("phGraphNode", ""),
        CUgraph("hGraph", ""),
        nullable..CUgraphNode.const.p("dependencies", ""),
        AutoSize("dependencies")..size_t("numDependencies", ""),
        CUDA_EXT_SEM_WAIT_NODE_PARAMS.const.p("nodeParams", "")
    )

    IgnoreMissing..CUresult(
        "GraphExternalSemaphoresWaitNodeGetParams",
        "",

        CUgraphNode("hNode", ""),
        CUDA_EXT_SEM_WAIT_NODE_PARAMS.p("params_out", "")
    )

    IgnoreMissing..CUresult(
        "GraphExternalSemaphoresWaitNodeSetParams",
        "",

        CUgraphNode("hNode", ""),
        CUDA_EXT_SEM_WAIT_NODE_PARAMS.const.p("nodeParams", "")
    )

    IgnoreMissing..CUresult(
        "GraphAddBatchMemOpNode",
        "",

        Check(1)..CUgraphNode.p("phGraphNode", ""),
        CUgraph("hGraph", ""),
        nullable..CUgraphNode.const.p("dependencies", ""),
        AutoSize("dependencies")..size_t("numDependencies", ""),
        nullable..CUDA_BATCH_MEM_OP_NODE_PARAMS.const.p("nodeParams", "")
    )

    IgnoreMissing..CUresult(
        "GraphBatchMemOpNodeGetParams",
        "",

        CUgraphNode("hNode", ""),
        CUDA_BATCH_MEM_OP_NODE_PARAMS.p("nodeParams_out", "")
    )

    IgnoreMissing..CUresult(
        "GraphBatchMemOpNodeSetParams",
        "",

        CUgraphNode("hNode", ""),
        nullable..CUDA_BATCH_MEM_OP_NODE_PARAMS.const.p("nodeParams", "")
    )

    IgnoreMissing..CUresult(
        "GraphExecBatchMemOpNodeSetParams",
        "",

        CUgraphExec("hGraphExec", ""),
        CUgraphNode("hNode", ""),
        nullable..CUDA_BATCH_MEM_OP_NODE_PARAMS.const.p("nodeParams", "")
    )

    IgnoreMissing..CUresult(
        "GraphAddMemAllocNode",
        "",

        Check(1)..CUgraphNode.p("phGraphNode", ""),
        CUgraph("hGraph", ""),
        nullable..CUgraphNode.const.p("dependencies", ""),
        AutoSize("dependencies")..size_t("numDependencies", ""),
        CUDA_MEM_ALLOC_NODE_PARAMS.p("nodeParams", "")
    )

    IgnoreMissing..CUresult(
        "GraphMemAllocNodeGetParams",
        "",

        CUgraphNode("hNode", ""),
        CUDA_MEM_ALLOC_NODE_PARAMS.p("params_out", "")
    )

    IgnoreMissing..CUresult(
        "GraphAddMemFreeNode",
        "",

        Check(1)..CUgraphNode.p("phGraphNode", ""),
        CUgraph("hGraph", ""),
        nullable..CUgraphNode.const.p("dependencies", ""),
        AutoSize("dependencies")..size_t("numDependencies", ""),
        CUdeviceptr("dptr", "")
    )

    IgnoreMissing..CUresult(
        "GraphMemFreeNodeGetParams",
        "",

        CUgraphNode("hNode", ""),
        Check(1)..CUdeviceptr.p("dptr_out", "")
    )

    IgnoreMissing..CUresult(
        "DeviceGraphMemTrim",
        "",

        CUdevice("device", "")
    )

    IgnoreMissing..CUresult(
        "DeviceGetGraphMemAttribute",
        "",

        CUdevice("device", ""),
        CUgraphMem_attribute("attr", ""),
        MultiType(PointerMapping.DATA_LONG)..Unsafe..void.p("value", "")
    )

    IgnoreMissing..CUresult(
        "DeviceSetGraphMemAttribute",
        "",

        CUdevice("device", ""),
        CUgraphMem_attribute("attr", ""),
        MultiType(PointerMapping.DATA_LONG)..Unsafe..void.p("value", "")
    )

    IgnoreMissing..CUresult(
        "GraphClone",
        "",

        Check(1)..CUgraph.p("phGraphClone", ""),
        CUgraph("originalGraph", "")
    )

    IgnoreMissing..CUresult(
        "GraphNodeFindInClone",
        "",

        Check(1)..CUgraphNode.p("phNode", ""),
        CUgraphNode("hOriginalNode", ""),
        CUgraph("hClonedGraph", "")
    )

    IgnoreMissing..CUresult(
        "GraphNodeGetType",
        "",

        CUgraphNode("hNode", ""),
        Check(1)..CUgraphNodeType.p("type", "")
    )

    IgnoreMissing..CUresult(
        "GraphGetNodes",
        "",

        CUgraph("hGraph", ""),
        nullable..CUgraphNode.p("nodes", ""),
        AutoSize("nodes")..Check(1)..size_t.p("numNodes", "")
    )

    IgnoreMissing..CUresult(
        "GraphGetRootNodes",
        "",

        CUgraph("hGraph", ""),
        nullable..CUgraphNode.p("rootNodes", ""),
        AutoSize("rootNodes")..Check(1)..size_t.p("numRootNodes", "")
    )

    IgnoreMissing..CUresult(
        "GraphGetEdges",
        "",

        CUgraph("hGraph", ""),
        nullable..CUgraphNode.p("from", ""),
        nullable..CUgraphNode.p("to", ""),
        AutoSize("from", "to")..Check(1)..size_t.p("numEdges", "")
    )

    IgnoreMissing..CUresult(
        "GraphNodeGetDependencies",
        "",

        CUgraphNode("hNode", ""),
        nullable..CUgraphNode.p("dependencies", ""),
        AutoSize("dependencies")..Check(1)..size_t.p("numDependencies", "")
    )

    IgnoreMissing..CUresult(
        "GraphNodeGetDependentNodes",
        "",

        CUgraphNode("hNode", ""),
        nullable..CUgraphNode.p("dependentNodes", ""),
        AutoSize("dependentNodes")..Check(1)..size_t.p("numDependentNodes", "")
    )

    IgnoreMissing..CUresult(
        "GraphAddDependencies",
        "",

        CUgraph("hGraph", ""),
        nullable..CUgraphNode.const.p("from", ""),
        nullable..CUgraphNode.const.p("to", ""),
        AutoSize("from", "to")..size_t("numDependencies", "")
    )

    IgnoreMissing..CUresult(
        "GraphRemoveDependencies",
        "",

        CUgraph("hGraph", ""),
        nullable..CUgraphNode.const.p("from", ""),
        nullable..CUgraphNode.const.p("to", ""),
        AutoSize("from", "to")..size_t("numDependencies", "")
    )

    IgnoreMissing..CUresult(
        "GraphDestroyNode",
        "",

        CUgraphNode("hNode", "")
    )

    IgnoreMissing..CUresult(
        "GraphInstantiate",
        "",

        Check(1)..CUgraphExec.p("phGraphExec", ""),
        CUgraph("hGraph", ""),
        Check(1)..CUgraphNode.p("phErrorNode", ""),
        char.p("logBuffer", ""),
        AutoSize("logBuffer")..size_t("bufferSize", "")
    ).versioned()

    IgnoreMissing..CUresult(
        "GraphInstantiateWithFlags",
        "",

        Check(1)..CUgraphExec.p("phGraphExec", ""),
        CUgraph("hGraph", ""),
        unsigned_long_long("flags", "")
    )

    IgnoreMissing..CUresult(
        "GraphInstantiateWithParams",
        "",

        Check(1)..CUgraphExec.p("phGraphExec", ""),
        CUgraph("hGraph", ""),
        CUDA_GRAPH_INSTANTIATE_PARAMS.const.p("instantiateParams", "")
    ).ptsz()

    IgnoreMissing..CUresult(
        "GraphExecGetFlags",
        "",

        CUgraphExec("hGraphExec", ""),
        Check(1)..unsigned_long_long.p("flags", "")
    )

    IgnoreMissing..CUresult(
        "GraphExecKernelNodeSetParams",
        "",

        CUgraphExec("hGraphExec", ""),
        CUgraphNode("hNode", ""),
        CUDA_KERNEL_NODE_PARAMS.const.p("nodeParams", "")
    )

    IgnoreMissing..CUresult(
        "GraphExecKernelNodeSetParams_v2",
        "",

        CUgraphExec("hGraphExec", ""),
        CUgraphNode("hNode", ""),
        CUDA_KERNEL_NODE_PARAMS_v2.const.p("nodeParams", "")
    )

    IgnoreMissing..CUresult(
        "GraphExecMemcpyNodeSetParams",
        "",

        CUgraphExec("hGraphExec", ""),
        CUgraphNode("hNode", ""),
        CUDA_MEMCPY3D.const.p("copyParams", ""),
        CUcontext("ctx", "")
    )

    IgnoreMissing..CUresult(
        "GraphExecMemsetNodeSetParams",
        "",

        CUgraphExec("hGraphExec", ""),
        CUgraphNode("hNode", ""),
        CUDA_MEMSET_NODE_PARAMS.const.p("memsetParams", ""),
        CUcontext("ctx", "")
    )

    IgnoreMissing..CUresult(
        "GraphExecHostNodeSetParams",
        "",

        CUgraphExec("hGraphExec", ""),
        CUgraphNode("hNode", ""),
        CUDA_HOST_NODE_PARAMS.const.p("nodeParams", "")
    )

    IgnoreMissing..CUresult(
        "GraphExecChildGraphNodeSetParams",
        "",

        CUgraphExec("hGraphExec", ""),
        CUgraphNode("hNode", ""),
        CUgraph("childGraph", "")
    )

    IgnoreMissing..CUresult(
        "GraphExecEventRecordNodeSetEvent",
        "",

        CUgraphExec("hGraphExec", ""),
        CUgraphNode("hNode", ""),
        CUevent("event", "")
    )

    IgnoreMissing..CUresult(
        "GraphExecEventWaitNodeSetEvent",
        "",

        CUgraphExec("hGraphExec", ""),
        CUgraphNode("hNode", ""),
        CUevent("event", "")
    )

    IgnoreMissing..CUresult(
        "GraphExecExternalSemaphoresSignalNodeSetParams",
        "",

        CUgraphExec("hGraphExec", ""),
        CUgraphNode("hNode", ""),
        CUDA_EXT_SEM_SIGNAL_NODE_PARAMS.const.p("nodeParams", "")
    )

    IgnoreMissing..CUresult(
        "GraphExecExternalSemaphoresWaitNodeSetParams",
        "",

        CUgraphExec("hGraphExec", ""),
        CUgraphNode("hNode", ""),
        CUDA_EXT_SEM_WAIT_NODE_PARAMS.const.p("nodeParams", "")
    )

    IgnoreMissing..CUresult(
        "GraphNodeSetEnabled",
        "",

        CUgraphExec("hGraphExec", ""),
        CUgraphNode("hNode", ""),
        unsigned_intb("isEnabled", "")
    )

    IgnoreMissing..CUresult(
        "GraphNodeGetEnabled",
        "",

        CUgraphExec("hGraphExec", ""),
        CUgraphNode("hNode", ""),
        Check(1)..unsigned_int.p("isEnabled", "")
    )

    IgnoreMissing..CUresult(
        "GraphUpload",
        "",

        CUgraphExec("hGraphExec", ""),
        nullable..CUstream("hStream", "")
    ).ptsz()

    IgnoreMissing..CUresult(
        "GraphLaunch",
        "",

        CUgraphExec("hGraphExec", ""),
        nullable..CUstream("hStream", "")
    ).ptsz()

    IgnoreMissing..CUresult(
        "GraphExecDestroy",
        "",

        CUgraphExec("hGraphExec", "")
    )

    IgnoreMissing..CUresult(
        "GraphDestroy",
        "",

        CUgraph("hGraph", "")
    )

    IgnoreMissing..CUresult(
        "GraphExecUpdate",
        "",

        CUgraphExec("hGraphExec", ""),
        CUgraph("hGraph", ""),
        Check(1)..CUgraphNode.p("hErrorNode_out", ""),
        Check(1)..CUgraphExecUpdateResult.p("updateResult_out", "")
    )

    IgnoreMissing..CUresult(
        "GraphExecUpdate_v2",
        "",

        CUgraphExec("hGraphExec", ""),
        CUgraph("hGraph", ""),
        CUgraphExecUpdateResultInfo.p("resultInfo", "")
    )

    IgnoreMissing..CUresult(
        "GraphKernelNodeCopyAttributes",
        "",

        CUgraphNode("dst", ""),
        CUgraphNode("src", "")
    )

    IgnoreMissing..CUresult(
        "GraphKernelNodeGetAttribute",
        "",

        CUgraphNode("hNode", ""),
        CUkernelNodeAttrID("attr", ""),
        CUkernelNodeAttrValue.p("value_out", "")
    )

    IgnoreMissing..CUresult(
        "GraphKernelNodeSetAttribute",
        "",

        CUgraphNode("hNode", ""),
        CUkernelNodeAttrID("attr", ""),
        CUkernelNodeAttrValue.const.p("value", "")
    )

    IgnoreMissing..CUresult(
        "GraphDebugDotPrint",
        "",

        CUgraph("hGraph", ""),
        charUTF8.const.p("path", ""),
        unsigned_int("flags", "")
    )

    IgnoreMissing..CUresult(
        "UserObjectCreate",
        "",

        Check(1)..CUuserObject.p("object_out", ""),
        opaque_p("ptr", ""),
        CUhostFn("destroy", ""),
        unsigned_int("initialRefcount", ""),
        unsigned_int("flags", "")
    )

    IgnoreMissing..CUresult(
        "UserObjectRetain",
        "",

        CUuserObject("object", ""),
        unsigned_int("count", "")
    )

    IgnoreMissing..CUresult(
        "UserObjectRelease",
        "",

        CUuserObject("object", ""),
        unsigned_int("count", "")
    )

    IgnoreMissing..CUresult(
        "GraphRetainUserObject",
        "",

        CUgraph("graph", ""),
        CUuserObject("object", ""),
        unsigned_int("count", ""),
        unsigned_int("flags", "")
    )

    IgnoreMissing..CUresult(
        "GraphReleaseUserObject",
        "",

        CUgraph("graph", ""),
        CUuserObject("object", ""),
        unsigned_int("count", "")
    )

    IgnoreMissing..CUresult(
        "OccupancyMaxActiveBlocksPerMultiprocessor",
        "",

        Check(1)..int.p("numBlocks", ""),
        CUfunction("func", ""),
        int("blockSize", ""),
        size_t("dynamicSMemSize", "")
    )

    IgnoreMissing..CUresult(
        "OccupancyMaxActiveBlocksPerMultiprocessorWithFlags",
        "",

        Check(1)..int.p("numBlocks", ""),
        CUfunction("func", ""),
        int("blockSize", ""),
        size_t("dynamicSMemSize", ""),
        unsigned_int("flags", "")
    )

    IgnoreMissing..CUresult(
        "OccupancyMaxPotentialBlockSize",
        "",

        Check(1)..int.p("minGridSize", ""),
        Check(1)..int.p("blockSize", ""),
        CUfunction("func", ""),
        nullable..CUoccupancyB2DSize("blockSizeToDynamicSMemSize", ""),
        size_t("dynamicSMemSize", ""),
        int("blockSizeLimit", "")
    )

    IgnoreMissing..CUresult(
        "OccupancyMaxPotentialBlockSizeWithFlags",
        "",

        Check(1)..int.p("minGridSize", ""),
        Check(1)..int.p("blockSize", ""),
        CUfunction("func", ""),
        nullable..CUoccupancyB2DSize("blockSizeToDynamicSMemSize", ""),
        size_t("dynamicSMemSize", ""),
        int("blockSizeLimit", ""),
        unsigned_int("flags", "")
    )

    IgnoreMissing..CUresult(
        "OccupancyAvailableDynamicSMemPerBlock",
        "",

        Check(1)..size_t.p("dynamicSmemSize", ""),
        CUfunction("func", ""),
        int("numBlocks", ""),
        int("blockSize", "")
    )

    IgnoreMissing..CUresult(
        "OccupancyMaxPotentialClusterSize",
        "",

        Check(1)..int.p("clusterSize", ""),
        CUfunction("func", ""),
        CUlaunchConfig.const.p("config", "")
    )

    IgnoreMissing..CUresult(
        "OccupancyMaxActiveClusters",
        "",

        Check(1)..int.p("numClusters", ""),
        CUfunction("func", ""),
        CUlaunchConfig.const.p("config", "")
    )

    CUresult(
        "TexRefSetArray",
        "",

        CUtexref("hTexRef", ""),
        CUarray("hArray", ""),
        unsigned_int("Flags", "")
    )

    CUresult(
        "TexRefSetMipmappedArray",
        "",

        CUtexref("hTexRef", ""),
        CUmipmappedArray("hMipmappedArray", ""),
        unsigned_int("Flags", "")
    )

    CUresult(
        "TexRefSetAddress",
        "",

        Check(1)..size_t.p("ByteOffset", ""),
        CUtexref("hTexRef", ""),
        CUdeviceptr("dptr", ""),
        size_t("bytes", "")
    ).versioned()

    CUresult(
        "TexRefSetAddress2D",
        "",

        CUtexref("hTexRef", ""),
        CUDA_ARRAY_DESCRIPTOR.const.p("desc", ""),
        CUdeviceptr("dptr", ""),
        size_t("Pitch", "")
    ).versioned(3)

    CUresult(
        "TexRefSetFormat",
        "",

        CUtexref("hTexRef", ""),
        CUarray_format("fmt", ""),
        int("NumPackedComponents", "")
    )

    CUresult(
        "TexRefSetAddressMode",
        "",

        CUtexref("hTexRef", ""),
        int("dim", ""),
        CUaddress_mode("am", "")
    )

    CUresult(
        "TexRefSetFilterMode",
        "",

        CUtexref("hTexRef", ""),
        CUfilter_mode("fm", "")
    )

    CUresult(
        "TexRefSetMipmapFilterMode",
        "",

        CUtexref("hTexRef", ""),
        CUfilter_mode("fm", "")
    )

    CUresult(
        "TexRefSetMipmapLevelBias",
        "",

        CUtexref("hTexRef", ""),
        float("bias", "")
    )

    CUresult(
        "TexRefSetMipmapLevelClamp",
        "",

        CUtexref("hTexRef", ""),
        float("minMipmapLevelClamp", ""),
        float("maxMipmapLevelClamp", "")
    )

    CUresult(
        "TexRefSetMaxAnisotropy",
        "",

        CUtexref("hTexRef", ""),
        unsigned_int("maxAniso", "")
    )

    CUresult(
        "TexRefSetBorderColor",
        "",

        CUtexref("hTexRef", ""),
        Check(4)..float.p("pBorderColor", "")
    )

    CUresult(
        "TexRefSetFlags",
        "",

        CUtexref("hTexRef", ""),
        unsigned_int("Flags", "")
    )

    CUresult(
        "TexRefGetAddress",
        "",

        Check(1)..CUdeviceptr.p("pdptr", ""),
        CUtexref("hTexRef", "")
    ).versioned()

    CUresult(
        "TexRefGetArray",
        "",

        Check(1)..CUarray.p("phArray", ""),
        CUtexref("hTexRef", "")
    )

    CUresult(
        "TexRefGetMipmappedArray",
        "",

        Check(1)..CUmipmappedArray.p("phMipmappedArray", ""),
        CUtexref("hTexRef", "")
    )

    CUresult(
        "TexRefGetAddressMode",
        "",

        Check(1)..CUaddress_mode.p("pam", ""),
        CUtexref("hTexRef", ""),
        int("dim", "")
    )

    CUresult(
        "TexRefGetFilterMode",
        "",

        Check(1)..CUfilter_mode.p("pfm", ""),
        CUtexref("hTexRef", "")
    )

    CUresult(
        "TexRefGetFormat",
        "",

        Check(1)..CUarray_format.p("pFormat", ""),
        Check(1)..nullable..int.p("pNumChannels", ""),
        CUtexref("hTexRef", "")
    )

    CUresult(
        "TexRefGetMipmapFilterMode",
        "",

        Check(1)..CUfilter_mode.p("pfm", ""),
        CUtexref("hTexRef", "")
    )

    CUresult(
        "TexRefGetMipmapLevelBias",
        "",

        Check(1)..float.p("pbias", ""),
        CUtexref("hTexRef", "")
    )

    CUresult(
        "TexRefGetMipmapLevelClamp",
        "",

        Check(1)..float.p("pminMipmapLevelClamp", ""),
        Check(1)..float.p("pmaxMipmapLevelClamp", ""),
        CUtexref("hTexRef", "")
    )

    CUresult(
        "TexRefGetMaxAnisotropy",
        "",

        Check(1)..int.p("pmaxAniso", ""),
        CUtexref("hTexRef", "")
    )

    CUresult(
        "TexRefGetBorderColor",
        "",

        Check(4)..float.p("pBorderColor", ""),
        CUtexref("hTexRef", "")
    )

    CUresult(
        "TexRefGetFlags",
        "",

        Check(1)..unsigned_int.p("pFlags", ""),
        CUtexref("hTexRef", "")
    )

    CUresult(
        "TexRefCreate",
        "",

        Check(1)..CUtexref.p("pTexRef", "")
    )

    CUresult(
        "TexRefDestroy",
        "",

        CUtexref("hTexRef", "")
    )

    CUresult(
        "SurfRefSetArray",
        "",

        CUsurfref("hSurfRef", ""),
        CUarray("hArray", ""),
        unsigned_int("Flags", "")
    )

    CUresult(
        "SurfRefGetArray",
        "",

        Check(1)..CUarray.p("phArray", ""),
        CUsurfref("hSurfRef", "")
    )

    IgnoreMissing..CUresult(
        "TexObjectCreate",
        "",

        Check(1)..CUtexObject.p("pTexObject", ""),
        CUDA_RESOURCE_DESC.const.p("pResDesc", ""),
        CUDA_TEXTURE_DESC.const.p("pTexDesc", ""),
        CUDA_RESOURCE_VIEW_DESC.const.p("pResViewDesc", "")
    )

    IgnoreMissing..CUresult(
        "TexObjectDestroy",
        "",

        CUtexObject("texObject", "")
    )

    IgnoreMissing..CUresult(
        "TexObjectGetResourceDesc",
        "",

        CUDA_RESOURCE_DESC.p("pResDesc", ""),
        CUtexObject("texObject", "")
    )

    IgnoreMissing..CUresult(
        "TexObjectGetTextureDesc",
        "",

        CUDA_TEXTURE_DESC.p("pTexDesc", ""),
        CUtexObject("texObject", "")
    )

    IgnoreMissing..CUresult(
        "TexObjectGetResourceViewDesc",
        "",

        CUDA_RESOURCE_VIEW_DESC.p("pResViewDesc", ""),
        CUtexObject("texObject", "")
    )

    IgnoreMissing..CUresult(
        "SurfObjectCreate",
        "",

        Check(1)..CUsurfObject.p("pSurfObject", ""),
        CUDA_RESOURCE_DESC.const.p("pResDesc", "")
    )

    IgnoreMissing..CUresult(
        "SurfObjectDestroy",
        "",

        CUsurfObject("surfObject", "")
    )

    IgnoreMissing..CUresult(
        "SurfObjectGetResourceDesc",
        "",

        CUDA_RESOURCE_DESC.p("pResDesc", ""),
        CUsurfObject("surfObject", "")
    )

    IgnoreMissing..CUresult(
        "TensorMapEncodeTiled",
        "",

        CUtensorMap.p("tensorMap", ""),
        CUtensorMapDataType("tensorDataType", ""),
        unsigned_int("tensorRank", ""),
        opaque_p("globalAddress", ""),
        Check("tensorRank")..cuuint64_t.const.p("globalDim", ""),
        Check("tensorRank")..cuuint64_t.const.p("globalStrides", ""),
        Check("tensorRank")..cuuint64_t.const.p("boxDim", ""),
        Check("tensorRank")..cuuint64_t.const.p("elementStrides", ""),
        CUtensorMapInterleave("interleave", ""),
        CUtensorMapSwizzle("swizzle", ""),
        CUtensorMapL2promotion("l2Promotion", ""),
        CUtensorMapFloatOOBfill("oobFill", "")
    )

    IgnoreMissing..CUresult(
        "TensorMapEncodeIm2col",
        "",

        CUtensorMap.p("tensorMap", ""),
        CUtensorMapDataType("tensorDataType", ""),
        cuuint32_t("tensorRank", ""),
        opaque_p("globalAddress", ""),
        Check("tensorRank")..cuuint64_t.const.p("globalDim", ""),
        Check("tensorRank")..cuuint64_t.const.p("globalStrides", ""),
        Check("tensorRank - 2")..int.const.p("pixelBoxLowerCorner", ""),
        Check("tensorRank - 2")..int.const.p("pixelBoxUpperCorner", ""),
        cuuint32_t("channelsPerPixel", ""),
        cuuint32_t("pixelsPerColumn", ""),
        Check("tensorRank")..cuuint32_t.const.p("elementStrides", ""),
        CUtensorMapInterleave("interleave", ""),
        CUtensorMapSwizzle("swizzle", ""),
        CUtensorMapL2promotion("l2Promotion", ""),
        CUtensorMapFloatOOBfill("oobFill", "")
    )

    IgnoreMissing..CUresult(
        "TensorMapReplaceAddress",
        "",

        CUtensorMap.p("tensorMap", ""),
        opaque_p("globalAddress", "")
    )

    IgnoreMissing..CUresult(
        "DeviceCanAccessPeer",
        "",

        Check(1)..int.p("canAccessPeer", ""),
        CUdevice("dev", ""),
        CUdevice("peerDev", "")
    )

    IgnoreMissing..CUresult(
        "CtxEnablePeerAccess",
        "",

        CUcontext("peerContext", ""),
        unsigned_int("Flags", "")
    )

    IgnoreMissing..CUresult(
        "CtxDisablePeerAccess",
        "",

        CUcontext("peerContext", "")
    )

    IgnoreMissing..CUresult(
        "DeviceGetP2PAttribute",
        "",

        Check(1)..int.p("value", ""),
        CUdevice_P2PAttribute("attrib", ""),
        CUdevice("srcDevice", ""),
        CUdevice("dstDevice", "")
    )

    CUresult(
        "GraphicsUnregisterResource",
        "",

        CUgraphicsResource("resource", "")
    )

    CUresult(
        "GraphicsSubResourceGetMappedArray",
        "",

        Check(1)..CUarray.p("pArray", ""),
        CUgraphicsResource("resource", ""),
        unsigned_int("arrayIndex", ""),
        unsigned_int("mipLevel", "")
    )

    IgnoreMissing..CUresult(
        "GraphicsResourceGetMappedMipmappedArray",
        "",

        Check(1)..CUmipmappedArray.p("pMipmappedArray", ""),
        CUgraphicsResource("resource", "")
    )

    CUresult(
        "GraphicsResourceGetMappedPointer",
        "",

        Check(1)..CUdeviceptr.p("pDevPtr", ""),
        Check(1)..size_t.p("pSize", ""),
        CUgraphicsResource("resource", "")
    ).versioned()

    CUresult(
        "GraphicsResourceSetMapFlags",
        "",

        CUgraphicsResource("resource", ""),
        unsigned_int("flags", "")
    ).versioned()

    CUresult(
        "GraphicsMapResources",
        "",

        AutoSize("resources")..unsigned_int("count", ""),
        CUgraphicsResource.p("resources", ""),
        nullable..CUstream("hStream", "")
    ).ptsz()

    CUresult(
        "GraphicsUnmapResources",
        "",

        AutoSize("resources")..unsigned_int("count", ""),
        CUgraphicsResource.p("resources", ""),
        nullable..CUstream("hStream", "")
    ).ptsz()

    IgnoreMissing..CUresult(
        "GetProcAddress",
        "",

        charASCII.const.p("symbol", ""),
        Check(1)..void.p.p("pfn", ""),
        int("cudaVersion", ""),
        cuuint64_t("flags", "")
    )

    IgnoreMissing..CUresult(
        "GetProcAddress_v2",
        "",

        charASCII.const.p("symbol", ""),
        Check(1)..void.p.p("pfn", ""),
        int("cudaVersion", ""),
        cuuint64_t("flags", ""),
        Check(1)..nullable..CUdriverProcAddressQueryResult.p("symbolStatus", "")
    )

    IgnoreMissing..CUresult(
        "CoredumpGetAttribute",
        "",

        CUcoredumpSettings("attrib", ""),
        Unsafe..nullable..void.p("value", ""),
        Check(1)..size_t.p("size", "")
    )

    IgnoreMissing..CUresult(
        "CoredumpGetAttributeGlobal",
        "",

        CUcoredumpSettings("attrib", ""),
        Unsafe..nullable..void.p("value", ""),
        Check(1)..size_t.p("size", "")
    )

    IgnoreMissing..CUresult(
        "CoredumpSetAttribute",
        "",

        CUcoredumpSettings("attrib", ""),
        Unsafe..nullable..void.const.p("value", ""),
        Check(1)..size_t.p("size", "")
    )

    IgnoreMissing..CUresult(
        "CoredumpSetAttributeGlobal",
        "",

        CUcoredumpSettings("attrib", ""),
        Unsafe..nullable..void.const.p("value", ""),
        Check(1)..size_t.p("size", "")
    )

    CUresult(
        "GetExportTable",
        "",

        Unsafe..void.const.p.p("ppExportTable", ""),
        CUuuid.const.p("pExportTableId", "")
    )
}
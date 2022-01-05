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

    IntConstant("", "IPC_HANDLE_SIZE".."64")

    EnumConstant(
        "CUDA Ipc Mem Flags. ({@code CUipcMem_flags})",

        "IPC_MEM_LAZY_ENABLE_PEER_ACCESS".enum("Automatically enable peer access between remote devices as needed", 0x1)
    )

    EnumConstant(
        "CUDA Mem Attach Flags. ({@code CUmemAttach_flags})",

        "MEM_ATTACH_GLOBAL".enum("Memory can be accessed by any stream on any device", 0x1),
        "MEM_ATTACH_HOST".enum("Memory cannot be accessed by any stream on any device", 0x2),
        "MEM_ATTACH_SINGLE".enum("Memory can only be accessed by a single stream on the associated device", 0x4)
    )

    EnumConstant(
        "Context creation flags. ({@code CUctx_flags})",

        "CTX_SCHED_AUTO".enum("Automatic scheduling", 0x00),
        "CTX_SCHED_SPIN".enum("Set spin as default scheduling", 0x01),
        "CTX_SCHED_YIELD".enum("Set yield as default scheduling", 0x02),
        "CTX_SCHED_BLOCKING_SYNC".enum("Set blocking synchronization as default scheduling", 0x04),
        "CTX_BLOCKING_SYNC".enum(
            "Set blocking synchronization as default scheduling. This flag was deprecated as of CUDA 4.0 and was replaced with #CTX_SCHED_BLOCKING_SYNC.",
            0x04
        ),
        "CTX_SCHED_MASK".enum("", 0x07),
        "CTX_MAP_HOST".enum(
            """
            This flag was deprecated as of CUDA 11.0 and it no longer has any effect.

            All contexts as of CUDA 3.2 behave as though the flag is enabled.
            """,
            0x08
        ),
        "CTX_LMEM_RESIZE_TO_MAX".enum("Keep local memory allocation after launch", 0x10),
        "CTX_FLAGS_MASK".enum("", 0x1f)
    )

    EnumConstant(
        "Stream creation flags. ({@code CUstream_flags})",

        "STREAM_DEFAULT".enum("Default stream flag", 0x0),
        "STREAM_NON_BLOCKING".enum("Stream does not synchronize with stream 0 (the #NULL stream)", 0x1)
    )

    LongConstant(
        """
        Legacy stream handle.

        Stream handle that can be passed as a {@code CUstream} to use an implicit stream with legacy synchronization behavior.
        """,

        "STREAM_LEGACY"..0x1L
    )

    LongConstant(
        """
        Per-thread stream handle.

        Stream handle that can be passed as a {@code CUstream} to use an implicit stream with per-thread synchronization behavior.
        """,

        "STREAM_PER_THREAD"..0x2L
    )

    EnumConstant(
        "Event creation flags. ({@code CUevent_flags})",

        "EVENT_DEFAULT".enum("Default event flag", 0x0),
        "EVENT_BLOCKING_SYNC".enum("Event uses blocking synchronization", 0x1),
        "EVENT_DISABLE_TIMING".enum("Event will not record timing data", 0x2),
        "EVENT_INTERPROCESS".enum("Event is suitable for interprocess use. #EVENT_DISABLE_TIMING must be set", 0x4)
    )

    EnumConstant(
        "Event record flags. ({@code CUevent_record_flags})",

        "EVENT_RECORD_DEFAULT".enum("Default event record flag", 0x0),
        "EVENT_RECORD_EXTERNAL".enum(
            """
            When using stream capture, create an event record node instead of the default behavior.

            This flag is invalid when used outside of capture.
            """
        )
    )

    EnumConstant(
        "Event wait flags. ({@code CUevent_wait_flags})",

        "EVENT_WAIT_DEFAULT".enum("Default event wait flag", 0x0),
        "EVENT_WAIT_EXTERNAL".enum(
            """
            When using stream capture, create an event wait node instead of the default behavior.

            This flag is invalid when used outside of capture.
            """
        )
    )

    EnumConstant(
        "Flags for #StreamWaitValue32() and #StreamWaitValue64(). ({@code CUstreamWaitValue_flags})",

        "STREAM_WAIT_VALUE_GEQ".enum(
            """
            Wait until {@code (int32_t)(*addr - value) >= 0} (or {@code int64_t} for 64 bit values). Note this is a cyclic comparison which ignores
            wraparound. (Default behavior.)
            """,
            0x0
        ),
        "STREAM_WAIT_VALUE_EQ".enum("Wait until {@code *addr == value}.", 0x1),
        "STREAM_WAIT_VALUE_AND".enum("Wait until {@code (*addr & value) != 0}.", 0x2),
        "STREAM_WAIT_VALUE_NOR".enum(
            """
            Wait until {@code ~(*addr | value) != 0}. Support for this operation can be queried with #DeviceGetAttribute() and
            #DEVICE_ATTRIBUTE_CAN_USE_STREAM_WAIT_VALUE_NOR.
            """,
            0x3
        ),
        "STREAM_WAIT_VALUE_FLUSH".enum(
            """
            Follow the wait operation with a flush of outstanding remote writes.

            This means that, if a remote write operation is guaranteed to have reached the device before the wait can be satisfied, that write is guaranteed to
            be visible to downstream device work. The device is permitted to reorder remote writes internally. For example, this flag would be required if two
            remote writes arrive in a defined order, the wait is satisfied by the second write, and downstream work needs to observe the first write.

            Support for this operation is restricted to selected platforms and can be queried with {@code CU_DEVICE_ATTRIBUTE_CAN_USE_WAIT_VALUE_FLUSH}.
            """,
            "1<<30"
        )
    )

    EnumConstant(
        "Flags for #StreamWriteValue32(). ({@code CUstreamWriteValue_flags})",

        "STREAM_WRITE_VALUE_DEFAULT".enum("Default behavior", 0x0),
        "STREAM_WRITE_VALUE_NO_MEMORY_BARRIER".enum(
            """
            Permits the write to be reordered with writes which were issued before it, as a performance optimization.

            Normally, #StreamWriteValue32() will provide a memory fence before the write, which has similar semantics to {@code __threadfence_system()} but is
            scoped to the stream rather than a CUDA thread.
            """,
            0x1
        )
    )

    EnumConstant(
        "Operations for #StreamBatchMemOp(). ({@code CUstreamBatchMemOpType})",

        "STREAM_MEM_OP_WAIT_VALUE_32".enum("Represents a #StreamWaitValue32() operation", 1),
        "STREAM_MEM_OP_WRITE_VALUE_32".enum("Represents a #StreamWriteValue32() operation", 2),
        "STREAM_MEM_OP_WAIT_VALUE_64".enum("Represents a #StreamWaitValue64() operation", 4),
        "STREAM_MEM_OP_WRITE_VALUE_64".enum("Represents a #StreamWriteValue64() operation", 5),
        "STREAM_MEM_OP_FLUSH_REMOTE_WRITES".enum("This has the same effect as #STREAM_WAIT_VALUE_FLUSH, but as a standalone operation.", 3)
    )

    EnumConstant(
        "Occupancy calculator flag. ({@code CUoccupancy_flags})",

        "OCCUPANCY_DEFAULT".enum("Default behavior", 0x0),
        "OCCUPANCY_DISABLE_CACHING_OVERRIDE".enum("Assume global caching is enabled and cannot be automatically turned off", 0x1)
    )

    EnumConstant(
        "Flags for #StreamUpdateCaptureDependencies()). ({@code CUstreamUpdateCaptureDependencies_flags})",

        "STREAM_ADD_CAPTURE_DEPENDENCIES".enum("Add new nodes to the dependency set", 0x0),
        "STREAM_SET_CAPTURE_DEPENDENCIES".enum("Replace the dependency set with the new nodes", 0x1)
    )

    EnumConstant(
        "Array formats. ({@code CUarray_format})",

        "AD_FORMAT_UNSIGNED_INT8".enum("Unsigned 8-bit integers", "0x01"),
        "AD_FORMAT_UNSIGNED_INT16".enum("Unsigned 16-bit integers", "0x02"),
        "AD_FORMAT_UNSIGNED_INT32".enum("Unsigned 32-bit integers", "0x03"),
        "AD_FORMAT_SIGNED_INT8".enum("Signed 8-bit integers", "0x08"),
        "AD_FORMAT_SIGNED_INT16".enum("Signed 16-bit integers", "0x09"),
        "AD_FORMAT_SIGNED_INT32".enum("Signed 32-bit integers", "0x0a"),
        "AD_FORMAT_HALF".enum("16-bit floating point", "0x10"),
        "AD_FORMAT_FLOAT".enum("32-bit floating point", "0x20"),
        "AD_FORMAT_NV12".enum("8-bit YUV planar format, with 4:2:0 sampling", "0xb0"),
        "AD_FORMAT_UNORM_INT8X1".enum("1 channel unsigned 8-bit normalized integer", "0xc0"),
        "AD_FORMAT_UNORM_INT8X2".enum("2 channel unsigned 8-bit normalized integer", "0xc1"),
        "AD_FORMAT_UNORM_INT8X4".enum("4 channel unsigned 8-bit normalized integer", "0xc2"),
        "AD_FORMAT_UNORM_INT16X1".enum("1 channel unsigned 16-bit normalized integer", "0xc3"),
        "AD_FORMAT_UNORM_INT16X2".enum("2 channel unsigned 16-bit normalized integer", "0xc4"),
        "AD_FORMAT_UNORM_INT16X4".enum("4 channel unsigned 16-bit normalized integer", "0xc5"),
        "AD_FORMAT_SNORM_INT8X1".enum("1 channel signed 8-bit normalized integer", "0xc6"),
        "AD_FORMAT_SNORM_INT8X2".enum("2 channel signed 8-bit normalized integer", "0xc7"),
        "AD_FORMAT_SNORM_INT8X4".enum("4 channel signed 8-bit normalized integer", "0xc8"),
        "AD_FORMAT_SNORM_INT16X1".enum("1 channel signed 16-bit normalized integer", "0xc9"),
        "AD_FORMAT_SNORM_INT16X2".enum("2 channel signed 16-bit normalized integer", "0xca"),
        "AD_FORMAT_SNORM_INT16X4".enum("4 channel signed 16-bit normalized integer", "0xcb"),
        "AD_FORMAT_BC1_UNORM".enum("4 channel unsigned normalized block-compressed (BC1 compression) format", "0x91"),
        "AD_FORMAT_BC1_UNORM_SRGB".enum("4 channel unsigned normalized block-compressed (BC1 compression) format with sRGB encoding", "0x92"),
        "AD_FORMAT_BC2_UNORM".enum("4 channel unsigned normalized block-compressed (BC2 compression) format", "0x93"),
        "AD_FORMAT_BC2_UNORM_SRGB".enum("4 channel unsigned normalized block-compressed (BC2 compression) format with sRGB encoding", "0x94"),
        "AD_FORMAT_BC3_UNORM".enum("4 channel unsigned normalized block-compressed (BC3 compression) format", "0x95"),
        "AD_FORMAT_BC3_UNORM_SRGB".enum("4 channel unsigned normalized block-compressed (BC3 compression) format with sRGB encoding", "0x96"),
        "AD_FORMAT_BC4_UNORM".enum("1 channel unsigned normalized block-compressed (BC4 compression) format", "0x97"),
        "AD_FORMAT_BC4_SNORM".enum("1 channel signed normalized block-compressed (BC4 compression) format", "0x98"),
        "AD_FORMAT_BC5_UNORM".enum("2 channel unsigned normalized block-compressed (BC5 compression) format", "0x99"),
        "AD_FORMAT_BC5_SNORM".enum("2 channel signed normalized block-compressed (BC5 compression) format", "0x9a"),
        "AD_FORMAT_BC6H_UF16".enum("3 channel unsigned half-float block-compressed (BC6H compression) format", "0x9b"),
        "AD_FORMAT_BC6H_SF16".enum("3 channel signed half-float block-compressed (BC6H compression) format", "0x9c"),
        "AD_FORMAT_BC7_UNORM".enum("4 channel unsigned normalized block-compressed (BC7 compression) format", "0x9d"),
        "AD_FORMAT_BC7_UNORM_SRGB".enum("4 channel unsigned normalized block-compressed (BC7 compression) format with sRGB encoding", "0x9e")
    )

    EnumConstant(
        "Texture reference addressing modes. ({@code CUaddress_mode})",

        "TR_ADDRESS_MODE_WRAP".enum("Wrapping address mode", 0),
        "TR_ADDRESS_MODE_CLAMP".enum("Clamp to edge address mode", 1),
        "TR_ADDRESS_MODE_MIRROR".enum("Mirror address mode", 2),
        "TR_ADDRESS_MODE_BORDER".enum("Border address mode", 3)
    )

    EnumConstant(
        "Texture reference filtering modes. ({@code CUfilter_mode})",

        "TR_FILTER_MODE_POINT".enum("Point filter mode", 0),
        "TR_FILTER_MODE_LINEAR".enum("Linear filter mode", 1)
    )

    EnumConstant(
        "Device properties. ({@code CUdevice_attribute})",

        "DEVICE_ATTRIBUTE_MAX_THREADS_PER_BLOCK".enum("Maximum number of threads per block", "1"),
        "DEVICE_ATTRIBUTE_MAX_BLOCK_DIM_X".enum("Maximum block dimension X"),
        "DEVICE_ATTRIBUTE_MAX_BLOCK_DIM_Y".enum("Maximum block dimension Y"),
        "DEVICE_ATTRIBUTE_MAX_BLOCK_DIM_Z".enum("Maximum block dimension Z"),
        "DEVICE_ATTRIBUTE_MAX_GRID_DIM_X".enum("Maximum grid dimension X"),
        "DEVICE_ATTRIBUTE_MAX_GRID_DIM_Y".enum("Maximum grid dimension Y"),
        "DEVICE_ATTRIBUTE_MAX_GRID_DIM_Z".enum("Maximum grid dimension Z"),
        "DEVICE_ATTRIBUTE_MAX_SHARED_MEMORY_PER_BLOCK".enum("Maximum shared memory available per block in bytes"),
        "DEVICE_ATTRIBUTE_SHARED_MEMORY_PER_BLOCK".enum("Deprecated, use #DEVICE_ATTRIBUTE_MAX_SHARED_MEMORY_PER_BLOCK", "8"),
        "DEVICE_ATTRIBUTE_TOTAL_CONSTANT_MEMORY".enum("Memory available on device for __constant__ variables in a CUDA C kernel in bytes"),
        "DEVICE_ATTRIBUTE_WARP_SIZE".enum("Warp size in threads"),
        "DEVICE_ATTRIBUTE_MAX_PITCH".enum("Maximum pitch in bytes allowed by memory copies"),
        "DEVICE_ATTRIBUTE_MAX_REGISTERS_PER_BLOCK".enum("Maximum number of 32-bit registers available per block"),
        "DEVICE_ATTRIBUTE_REGISTERS_PER_BLOCK".enum("Deprecated, use #DEVICE_ATTRIBUTE_MAX_REGISTERS_PER_BLOCK", "12"),
        "DEVICE_ATTRIBUTE_CLOCK_RATE".enum("Typical clock frequency in kilohertz"),
        "DEVICE_ATTRIBUTE_TEXTURE_ALIGNMENT".enum("Alignment requirement for textures"),
        "DEVICE_ATTRIBUTE_GPU_OVERLAP".enum(
            "Device can possibly copy memory and execute a kernel concurrently. Deprecated. Use instead #DEVICE_ATTRIBUTE_ASYNC_ENGINE_COUNT."
        ),
        "DEVICE_ATTRIBUTE_MULTIPROCESSOR_COUNT".enum("Number of multiprocessors on device"),
        "DEVICE_ATTRIBUTE_KERNEL_EXEC_TIMEOUT".enum("Specifies whether there is a run time limit on kernels"),
        "DEVICE_ATTRIBUTE_INTEGRATED".enum("Device is integrated with host memory"),
        "DEVICE_ATTRIBUTE_CAN_MAP_HOST_MEMORY".enum("Device can map host memory into CUDA address space"),
        "DEVICE_ATTRIBUTE_COMPUTE_MODE".enum("Compute mode (See {@code CUcomputemode} for details)"),
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_WIDTH".enum("Maximum 1D texture width"),
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_WIDTH".enum("Maximum 2D texture width"),
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_HEIGHT".enum("Maximum 2D texture height"),
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_WIDTH".enum("Maximum 3D texture width"),
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_HEIGHT".enum("Maximum 3D texture height"),
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_DEPTH".enum("Maximum 3D texture depth"),
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LAYERED_WIDTH".enum("Maximum 2D layered texture width"),
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LAYERED_HEIGHT".enum("Maximum 2D layered texture height"),
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LAYERED_LAYERS".enum("Maximum layers in a 2D layered texture"),
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_ARRAY_WIDTH".enum("Deprecated, use #DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LAYERED_WIDTH", "27"),
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_ARRAY_HEIGHT".enum("Deprecated, use #DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LAYERED_HEIGHT"),
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_ARRAY_NUMSLICES".enum("Deprecated, use #DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LAYERED_LAYERS"),
        "DEVICE_ATTRIBUTE_SURFACE_ALIGNMENT".enum("Alignment requirement for surfaces"),
        "DEVICE_ATTRIBUTE_CONCURRENT_KERNELS".enum("Device can possibly execute multiple kernels concurrently"),
        "DEVICE_ATTRIBUTE_ECC_ENABLED".enum("Device has ECC support enabled"),
        "DEVICE_ATTRIBUTE_PCI_BUS_ID".enum("PCI bus ID of the device"),
        "DEVICE_ATTRIBUTE_PCI_DEVICE_ID".enum("PCI device ID of the device"),
        "DEVICE_ATTRIBUTE_TCC_DRIVER".enum("Device is using TCC driver model"),
        "DEVICE_ATTRIBUTE_MEMORY_CLOCK_RATE".enum("Peak memory clock frequency in kilohertz"),
        "DEVICE_ATTRIBUTE_GLOBAL_MEMORY_BUS_WIDTH".enum("Global memory bus width in bits"),
        "DEVICE_ATTRIBUTE_L2_CACHE_SIZE".enum("Size of L2 cache in bytes"),
        "DEVICE_ATTRIBUTE_MAX_THREADS_PER_MULTIPROCESSOR".enum("Maximum resident threads per multiprocessor"),
        "DEVICE_ATTRIBUTE_ASYNC_ENGINE_COUNT".enum("Number of asynchronous engines"),
        "DEVICE_ATTRIBUTE_UNIFIED_ADDRESSING".enum("Device shares a unified address space with the host"),
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_LAYERED_WIDTH".enum("Maximum 1D layered texture width"),
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_LAYERED_LAYERS".enum("Maximum layers in a 1D layered texture"),
        "DEVICE_ATTRIBUTE_CAN_TEX2D_GATHER".enum("Deprecated, do not use."),
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_GATHER_WIDTH".enum("Maximum 2D texture width if #CUDA_ARRAY3D_TEXTURE_GATHER is set"),
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_GATHER_HEIGHT".enum("Maximum 2D texture height if #CUDA_ARRAY3D_TEXTURE_GATHER is set"),
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_WIDTH_ALTERNATE".enum("Alternate maximum 3D texture width"),
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_HEIGHT_ALTERNATE".enum("Alternate maximum 3D texture height"),
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_DEPTH_ALTERNATE".enum("Alternate maximum 3D texture depth"),
        "DEVICE_ATTRIBUTE_PCI_DOMAIN_ID".enum("PCI domain ID of the device"),
        "DEVICE_ATTRIBUTE_TEXTURE_PITCH_ALIGNMENT".enum("Pitch alignment requirement for textures"),
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURECUBEMAP_WIDTH".enum("Maximum cubemap texture width/height"),
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURECUBEMAP_LAYERED_WIDTH".enum("Maximum cubemap layered texture width/height"),
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURECUBEMAP_LAYERED_LAYERS".enum("Maximum layers in a cubemap layered texture"),
        "DEVICE_ATTRIBUTE_MAXIMUM_SURFACE1D_WIDTH".enum("Maximum 1D surface width"),
        "DEVICE_ATTRIBUTE_MAXIMUM_SURFACE2D_WIDTH".enum("Maximum 2D surface width"),
        "DEVICE_ATTRIBUTE_MAXIMUM_SURFACE2D_HEIGHT".enum("Maximum 2D surface height"),
        "DEVICE_ATTRIBUTE_MAXIMUM_SURFACE3D_WIDTH".enum("Maximum 3D surface width"),
        "DEVICE_ATTRIBUTE_MAXIMUM_SURFACE3D_HEIGHT".enum("Maximum 3D surface height"),
        "DEVICE_ATTRIBUTE_MAXIMUM_SURFACE3D_DEPTH".enum("Maximum 3D surface depth"),
        "DEVICE_ATTRIBUTE_MAXIMUM_SURFACE1D_LAYERED_WIDTH".enum("Maximum 1D layered surface width"),
        "DEVICE_ATTRIBUTE_MAXIMUM_SURFACE1D_LAYERED_LAYERS".enum("Maximum layers in a 1D layered surface"),
        "DEVICE_ATTRIBUTE_MAXIMUM_SURFACE2D_LAYERED_WIDTH".enum("Maximum 2D layered surface width"),
        "DEVICE_ATTRIBUTE_MAXIMUM_SURFACE2D_LAYERED_HEIGHT".enum("Maximum 2D layered surface height"),
        "DEVICE_ATTRIBUTE_MAXIMUM_SURFACE2D_LAYERED_LAYERS".enum("Maximum layers in a 2D layered surface"),
        "DEVICE_ATTRIBUTE_MAXIMUM_SURFACECUBEMAP_WIDTH".enum("Maximum cubemap surface width"),
        "DEVICE_ATTRIBUTE_MAXIMUM_SURFACECUBEMAP_LAYERED_WIDTH".enum("Maximum cubemap layered surface width"),
        "DEVICE_ATTRIBUTE_MAXIMUM_SURFACECUBEMAP_LAYERED_LAYERS".enum("Maximum layers in a cubemap layered surface"),
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_LINEAR_WIDTH".enum(
            "Deprecated, do not use. Use {@code cudaDeviceGetTexture1DLinearMaxWidth()} or #DeviceGetTexture1DLinearMaxWidth() instead."
        ),
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LINEAR_WIDTH".enum("Maximum 2D linear texture width"),
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LINEAR_HEIGHT".enum("Maximum 2D linear texture height"),
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LINEAR_PITCH".enum("Maximum 2D linear texture pitch in bytes"),
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_MIPMAPPED_WIDTH".enum("Maximum mipmapped 2D texture width"),
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_MIPMAPPED_HEIGHT".enum("Maximum mipmapped 2D texture height"),
        "DEVICE_ATTRIBUTE_COMPUTE_CAPABILITY_MAJOR".enum("Major compute capability version number"),
        "DEVICE_ATTRIBUTE_COMPUTE_CAPABILITY_MINOR".enum("Minor compute capability version number"),
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_MIPMAPPED_WIDTH".enum("Maximum mipmapped 1D texture width"),
        "DEVICE_ATTRIBUTE_STREAM_PRIORITIES_SUPPORTED".enum("Device supports stream priorities"),
        "DEVICE_ATTRIBUTE_GLOBAL_L1_CACHE_SUPPORTED".enum("Device supports caching globals in L1"),
        "DEVICE_ATTRIBUTE_LOCAL_L1_CACHE_SUPPORTED".enum("Device supports caching locals in L1"),
        "DEVICE_ATTRIBUTE_MAX_SHARED_MEMORY_PER_MULTIPROCESSOR".enum("Maximum shared memory available per multiprocessor in bytes"),
        "DEVICE_ATTRIBUTE_MAX_REGISTERS_PER_MULTIPROCESSOR".enum("Maximum number of 32-bit registers available per multiprocessor"),
        "DEVICE_ATTRIBUTE_MANAGED_MEMORY".enum("Device can allocate managed memory on this system"),
        "DEVICE_ATTRIBUTE_MULTI_GPU_BOARD".enum("Device is on a multi-GPU board"),
        "DEVICE_ATTRIBUTE_MULTI_GPU_BOARD_GROUP_ID".enum("Unique id for a group of devices on the same multi-GPU board"),
        "DEVICE_ATTRIBUTE_HOST_NATIVE_ATOMIC_SUPPORTED".enum(
            """
            Link between the device and the host supports native atomic operations (this is a placeholder attribute, and is not supported on any current
            hardware)
            """
        ),
        "DEVICE_ATTRIBUTE_SINGLE_TO_DOUBLE_PRECISION_PERF_RATIO".enum(
            "Ratio of single precision performance (in floating-point operations per second) to double precision performance"
        ),
        "DEVICE_ATTRIBUTE_PAGEABLE_MEMORY_ACCESS".enum("Device supports coherently accessing pageable memory without calling cudaHostRegister on it"),
        "DEVICE_ATTRIBUTE_CONCURRENT_MANAGED_ACCESS".enum("Device can coherently access managed memory concurrently with the CPU"),
        "DEVICE_ATTRIBUTE_COMPUTE_PREEMPTION_SUPPORTED".enum("Device supports compute preemption."),
        "DEVICE_ATTRIBUTE_CAN_USE_HOST_POINTER_FOR_REGISTERED_MEM".enum("Device can access host registered memory at the same virtual address as the CPU"),
        "DEVICE_ATTRIBUTE_CAN_USE_STREAM_MEM_OPS".enum("#StreamBatchMemOp() and related APIs are supported."),
        "DEVICE_ATTRIBUTE_CAN_USE_64_BIT_STREAM_MEM_OPS".enum("64-bit operations are supported in #StreamBatchMemOp() and related APIs."),
        "DEVICE_ATTRIBUTE_CAN_USE_STREAM_WAIT_VALUE_NOR".enum("#STREAM_WAIT_VALUE_NOR is supported."),
        "DEVICE_ATTRIBUTE_COOPERATIVE_LAUNCH".enum("Device supports launching cooperative kernels via #LaunchCooperativeKernel()"),
        "DEVICE_ATTRIBUTE_COOPERATIVE_MULTI_DEVICE_LAUNCH".enum("Deprecated, #LaunchCooperativeKernelMultiDevice() is deprecated."),
        "DEVICE_ATTRIBUTE_MAX_SHARED_MEMORY_PER_BLOCK_OPTIN".enum("Maximum optin shared memory per block"),
        "DEVICE_ATTRIBUTE_CAN_FLUSH_REMOTE_WRITES".enum(
            """
            The #STREAM_WAIT_VALUE_FLUSH flag and the #STREAM_MEM_OP_FLUSH_REMOTE_WRITES MemOp are supported on the device. See {@code CUDA_MEMOP} for
            additional details.
            """
        ),
        "DEVICE_ATTRIBUTE_HOST_REGISTER_SUPPORTED".enum("Device supports host memory registration via {@code cudaHostRegister()}."),
        "DEVICE_ATTRIBUTE_PAGEABLE_MEMORY_ACCESS_USES_HOST_PAGE_TABLES".enum("Device accesses pageable memory via the host's page tables."),
        "DEVICE_ATTRIBUTE_DIRECT_MANAGED_MEM_ACCESS_FROM_HOST".enum("The host can directly access managed memory on the device without migration."),
        "DEVICE_ATTRIBUTE_VIRTUAL_ADDRESS_MANAGEMENT_SUPPORTED".enum("Deprecated, Use #DEVICE_ATTRIBUTE_VIRTUAL_MEMORY_MANAGEMENT_SUPPORTED"),
        "DEVICE_ATTRIBUTE_VIRTUAL_MEMORY_MANAGEMENT_SUPPORTED".enum(
            "Device supports virtual memory management APIs like #MemAddressReserve(), #MemCreate(), #MemMap() and related APIs",
            "102"
        ),
        "DEVICE_ATTRIBUTE_HANDLE_TYPE_POSIX_FILE_DESCRIPTOR_SUPPORTED".enum(
            "Device supports exporting memory to a posix file descriptor with #MemExportToShareableHandle(), if requested via #MemCreate()"
        ),
        "DEVICE_ATTRIBUTE_HANDLE_TYPE_WIN32_HANDLE_SUPPORTED".enum(
            "Device supports exporting memory to a Win32 NT handle with #MemExportToShareableHandle(), if requested via #MemCreate()"
        ),
        "DEVICE_ATTRIBUTE_HANDLE_TYPE_WIN32_KMT_HANDLE_SUPPORTED".enum(
            "Device supports exporting memory to a Win32 KMT handle with #MemExportToShareableHandle(), if requested via #MemCreate()"
        ),
        "DEVICE_ATTRIBUTE_MAX_BLOCKS_PER_MULTIPROCESSOR".enum("Maximum number of blocks per multiprocessor"),
        "DEVICE_ATTRIBUTE_GENERIC_COMPRESSION_SUPPORTED".enum("Device supports compression of memory"),
        "DEVICE_ATTRIBUTE_MAX_PERSISTING_L2_CACHE_SIZE".enum("Maximum L2 persisting lines capacity setting in bytes."),
        "DEVICE_ATTRIBUTE_MAX_ACCESS_POLICY_WINDOW_SIZE".enum("Maximum value of ##CUaccessPolicyWindow{@code {@code num_bytes}}."),
        "DEVICE_ATTRIBUTE_GPU_DIRECT_RDMA_WITH_CUDA_VMM_SUPPORTED".enum("Device supports specifying the GPUDirect RDMA flag with #MemCreate()"),
        "DEVICE_ATTRIBUTE_RESERVED_SHARED_MEMORY_PER_BLOCK".enum("Shared memory reserved by CUDA driver per block in bytes"),
        "DEVICE_ATTRIBUTE_SPARSE_CUDA_ARRAY_SUPPORTED".enum("Device supports sparse CUDA arrays and sparse CUDA mipmapped arrays"),
        "DEVICE_ATTRIBUTE_READ_ONLY_HOST_REGISTER_SUPPORTED".enum(
            "Device supports using the #MemHostRegister() flag #MEMHOSTREGISTER_READ_ONLY to register memory that must be mapped as read-only to the GPU"
        ),
        "DEVICE_ATTRIBUTE_TIMELINE_SEMAPHORE_INTEROP_SUPPORTED".enum("External timeline semaphore interop is supported on the device"),
        "DEVICE_ATTRIBUTE_MEMORY_POOLS_SUPPORTED".enum("Device supports using the #MemAllocAsync() and {@code cuMemPool*} family of APIs"),
        "DEVICE_ATTRIBUTE_GPU_DIRECT_RDMA_SUPPORTED".enum(
            "Device supports GPUDirect RDMA APIs, like nvidia_p2p_get_pages (see ${url("https://docs.nvidia.com/cuda/gpudirect-rdma")} for more information)"
        ),
        "DEVICE_ATTRIBUTE_GPU_DIRECT_RDMA_FLUSH_WRITES_OPTIONS".enum(
            """
            The returned attribute shall be interpreted as a bitmask, where the individual bits are described by the {@code CUflushGPUDirectRDMAWritesOptions}
            enum
            """
        ),
        "DEVICE_ATTRIBUTE_GPU_DIRECT_RDMA_WRITES_ORDERING".enum(
            """
            GPUDirect RDMA writes to the device do not need to be flushed for consumers within the scope indicated by the returned attribute. See
            {@code CUGPUDirectRDMAWritesOrdering} for the numerical values returned here.
            """
        ),
        "DEVICE_ATTRIBUTE_MEMPOOL_SUPPORTED_HANDLE_TYPES".enum("Handle types supported with mempool based IPC")
    )

    EnumConstant(
        """
        Pointer information. ({@code CUpointer_attribute})
        """,

        "POINTER_ATTRIBUTE_CONTEXT".enum("The {@code CUcontext} on which a pointer was allocated or registered", "1"),
        "POINTER_ATTRIBUTE_MEMORY_TYPE".enum("The {@code CUmemorytype} describing the physical location of a pointer"),
        "POINTER_ATTRIBUTE_DEVICE_POINTER".enum("The address at which a pointer's memory may be accessed on the device"),
        "POINTER_ATTRIBUTE_HOST_POINTER".enum("The address at which a pointer's memory may be accessed on the host"),
        "POINTER_ATTRIBUTE_P2P_TOKENS".enum("A pair of tokens for use with the {@code nv-p2p.h} Linux kernel interface"),
        "POINTER_ATTRIBUTE_SYNC_MEMOPS".enum("Synchronize every synchronous memory operation initiated on this region"),
        "POINTER_ATTRIBUTE_BUFFER_ID".enum("A process-wide unique ID for an allocated memory region"),
        "POINTER_ATTRIBUTE_IS_MANAGED".enum("Indicates if the pointer points to managed memory"),
        "POINTER_ATTRIBUTE_DEVICE_ORDINAL".enum("A device ordinal of a device on which a pointer was allocated or registered"),
        "POINTER_ATTRIBUTE_IS_LEGACY_CUDA_IPC_CAPABLE".enum(
            "1 if this pointer maps to an allocation that is suitable for {@code cudaIpcGetMemHandle()}, 0 otherwise"
        ),
        "POINTER_ATTRIBUTE_RANGE_START_ADDR".enum("Starting address for this requested pointer"),
        "POINTER_ATTRIBUTE_RANGE_SIZE".enum("Size of the address range for this requested pointer"),
        "POINTER_ATTRIBUTE_MAPPED".enum("1 if this pointer is in a valid address range that is mapped to a backing allocation, 0 otherwise"),
        "POINTER_ATTRIBUTE_ALLOWED_HANDLE_TYPES".enum("Bitmask of allowed {@code CUmemAllocationHandleType} for this allocation"),
        "POINTER_ATTRIBUTE_IS_GPU_DIRECT_RDMA_CAPABLE".enum("1 if the memory this pointer is referencing can be used with the GPUDirect RDMA API"),
        "POINTER_ATTRIBUTE_ACCESS_FLAGS".enum(
            "Returns the access flags the device associated with the current context has on the corresponding memory referenced by the pointer given"
        ),
        "POINTER_ATTRIBUTE_MEMPOOL_HANDLE".enum(
            "Returns the {@code mempoo}l handle for the allocation if it was allocated from a {@code mempool}. Otherwise returns #NULL."
        )
    )

    EnumConstant(
        "Function properties. ({@code CUfunction_attribute})",

        "FUNC_ATTRIBUTE_MAX_THREADS_PER_BLOCK".enum(
            """
            The maximum number of threads per block, beyond which a launch of the function would fail. This number depends on both the function and the device
            on which the function is currently loaded.
            """,
            0
        ),
        "FUNC_ATTRIBUTE_SHARED_SIZE_BYTES".enum(
            """
            The size in bytes of statically-allocated shared memory required by this function. This does not include dynamically-allocated shared memory
            requested by the user at runtime.
            """,
            1
        ),
        "FUNC_ATTRIBUTE_CONST_SIZE_BYTES".enum("The size in bytes of user-allocated constant memory required by this function.", 2),
        "FUNC_ATTRIBUTE_LOCAL_SIZE_BYTES".enum("The size in bytes of local memory used by each thread of this function.", 3),
        "FUNC_ATTRIBUTE_NUM_REGS".enum("The number of registers used by each thread of this function.", 4),
        "FUNC_ATTRIBUTE_PTX_VERSION".enum(
            """
            The PTX virtual architecture version for which the function was compiled.

            This value is the major PTX {@code version * 10 + the minor PTX version}, so a PTX version 1.3 function would return the value 13. Note that this
            may return the undefined value of 0 for cubins compiled prior to CUDA 3.0.
            """,
            5
        ),
        "FUNC_ATTRIBUTE_BINARY_VERSION".enum(
            """
            The binary architecture version for which the function was compiled.

            This value is the {@code major binary version * 10 + the minor binary version}, so a binary version 1.3 function would return the value 13. Note
            that this will return a value of 10 for legacy cubins that do not have a properly-encoded binary architecture version.
            """,
            6
        ),
        "FUNC_ATTRIBUTE_CACHE_MODE_CA".enum(
            "The attribute to indicate whether the function has been compiled with user specified option {@code \"-Xptxas --dlcm=ca\"} set.",
            7
        ),

        "FUNC_ATTRIBUTE_MAX_DYNAMIC_SHARED_SIZE_BYTES".enum(
            """
            The maximum size in bytes of dynamically-allocated shared memory that can be used by this function.

            If the user-specified dynamic shared memory size is larger than this value, the launch will fail.
            """,
            8
        ),

        "FUNC_ATTRIBUTE_PREFERRED_SHARED_MEMORY_CARVEOUT".enum(
            """
            On devices where the L1 cache and shared memory use the same hardware resources, this sets the shared memory carveout preference, in percent of the total shared memory. Refer to #DEVICE_ATTRIBUTE_MAX_SHARED_MEMORY_PER_MULTIPROCESSOR.

            This is only a hint, and the driver can choose a different ratio if required to execute the function.
            """,
            9
        )
    )

    EnumConstant(
        "Function cache configurations. ({@code CUfunc_cache})",

        "FUNC_CACHE_PREFER_NONE".enum("no preference for shared memory or L1 (default)", 0x00),
        "FUNC_CACHE_PREFER_SHARED".enum("prefer larger shared memory and smaller L1 cache", 0x01),
        "FUNC_CACHE_PREFER_L1".enum("prefer larger L1 cache and smaller shared memory", 0x02),
        "FUNC_CACHE_PREFER_EQUAL".enum("prefer equal sized L1 cache and shared memory", 0x03)
    )

    EnumConstant(
        "Shared memory configurations. ({@code CUsharedconfig})",

        "SHARED_MEM_CONFIG_DEFAULT_BANK_SIZE".enum("set default shared memory bank size", 0x00),
        "SHARED_MEM_CONFIG_FOUR_BYTE_BANK_SIZE".enum("set shared memory bank width to four bytes", 0x01),
        "SHARED_MEM_CONFIG_EIGHT_BYTE_BANK_SIZE".enum("set shared memory bank width to eight bytes", 0x02)
    )

    EnumConstant(
        """
        Shared memory carveout configurations. ({@code CUshared_carveout})

        These may be passed to #FuncSetAttribute().
        """,

        "SHAREDMEM_CARVEOUT_DEFAULT".enum("no preference for shared memory or L1 (default)", -1),
        "SHAREDMEM_CARVEOUT_MAX_SHARED".enum("prefer maximum available shared memory, minimum L1 cache", 100),
        "SHAREDMEM_CARVEOUT_MAX_L1".enum("prefer maximum available L1 cache, minimum shared memory", 0)
    )

    EnumConstant(
        "Memory types. ({@code CUmemorytype})",

        "MEMORYTYPE_HOST".enum("Host memory", 0x01),
        "MEMORYTYPE_DEVICE".enum("Device memory", 0x02),
        "MEMORYTYPE_ARRAY".enum("Array memory", 0x03),
        "MEMORYTYPE_UNIFIED".enum("Unified device or host memory", 0x04)
    )

    EnumConstant(
        "Compute Modes. ({@code CUcomputemode})",

        "COMPUTEMODE_DEFAULT".enum("Default compute mode (Multiple contexts allowed per device)", 0),
        "COMPUTEMODE_PROHIBITED".enum("Compute-prohibited mode (No contexts can be created on this device at this time)", 2),
        "COMPUTEMODE_EXCLUSIVE_PROCESS".enum(
            "Compute-exclusive-process mode (Only one context used by a single process can be present on this device at a time)",
            3
        )
    )

    EnumConstant(
        "Memory advise values. ({@code CUmem_advise})",

        "MEM_ADVISE_SET_READ_MOSTLY".enum("Data will mostly be read and only occassionally be written to", 1),
        "MEM_ADVISE_UNSET_READ_MOSTLY".enum("Undo the effect of #MEM_ADVISE_SET_READ_MOSTLY", 2),
        "MEM_ADVISE_SET_PREFERRED_LOCATION".enum("Set the preferred location for the data as the specified device", 3),
        "MEM_ADVISE_UNSET_PREFERRED_LOCATION".enum("Clear the preferred location for the data", 4),
        "MEM_ADVISE_SET_ACCESSED_BY".enum("Data will be accessed by the specified device, so prevent page faults as much as possible", 5),
        "MEM_ADVISE_UNSET_ACCESSED_BY".enum("Let the Unified Memory subsystem decide on the page faulting policy for the specified device", 6)
    )

    EnumConstant(
        "({@code CUmem_range_attribute})",

        "MEM_RANGE_ATTRIBUTE_READ_MOSTLY".enum("Whether the range will mostly be read and only occassionally be written to", 1),
        "MEM_RANGE_ATTRIBUTE_PREFERRED_LOCATION".enum("The preferred location of the range", 2),
        "MEM_RANGE_ATTRIBUTE_ACCESSED_BY".enum("Memory range has #MEM_ADVISE_SET_ACCESSED_BY set for specified device", 3),
        "MEM_RANGE_ATTRIBUTE_LAST_PREFETCH_LOCATION".enum("The last location to which the range was prefetched", 4)
    )

    EnumConstant(
        "Online compiler and linker options. ({@code CUjit_option})",

        "JIT_MAX_REGISTERS".enum(
            """
            Max number of registers that a thread may use.

            Option type: {@code unsigned int}. Applies to: compiler only
            """,
            0
        ),

        "JIT_THREADS_PER_BLOCK".enum(
            """
            IN: Specifies minimum number of threads per block to target compilation for

            OUT: Returns the number of threads the compiler actually targeted.

            This restricts the resource utilization fo the compiler (e.g. max registers) such that a block with the given number of threads should be able to
            launch based on register limitations. Note, this option does not currently take into account any other resource limitations, such as shared memory
            utilization.

            Cannot be combined with #JIT_TARGET. Option type: {@code unsigned int}. Applies to: compiler only
            """
        ),

        "JIT_WALL_TIME".enum(
            """
            Overwrites the option value with the total wall clock time, in milliseconds, spent in the compiler and linker.

            Option type: {@code float}. Applies to: compiler and linker
            """
        ),

        "JIT_INFO_LOG_BUFFER".enum(
            """
            Pointer to a buffer in which to print any log messages that are informational in nature (the buffer size is specified via option
            #JIT_INFO_LOG_BUFFER_SIZE_BYTES).

            Option type: {@code char *}. Applies to: compiler and linker
            """
        ),

        "JIT_INFO_LOG_BUFFER_SIZE_BYTES".enum(
            """
            IN: Log buffer size in bytes. Log messages will be capped at this size (including null terminator).

            OUT: Amount of log buffer filled with messages.

            Option type: {@code unsigned int}. Applies to: compiler and linker
            """
        ),

        "JIT_ERROR_LOG_BUFFER".enum(
            """
            Pointer to a buffer in which to print any log messages that reflect errors (the buffer size is specified via option
            #JIT_ERROR_LOG_BUFFER_SIZE_BYTES).

            Option type: {@code char *}. Applies to: compiler and linker
            """
        ),

        "JIT_ERROR_LOG_BUFFER_SIZE_BYTES".enum(
            """
            IN: Log buffer size in bytes. Log messages will be capped at this size (including null terminator).

            OUT: Amount of log buffer filled with messages.

            Option type: {@code unsigned int}. Applies to: compiler and linker
            """
        ),

        "JIT_OPTIMIZATION_LEVEL".enum(
            """
            Level of optimizations to apply to generated code (0 - 4), with 4 being the default and highest level of optimizations.

            Option type: {@code unsigned int}. Applies to: compiler only
            """
        ),

        "JIT_TARGET_FROM_CUCONTEXT".enum(
            """
            No option value required. Determines the target based on the current attached context (default).

            Option type: No option value needed. Applies to: compiler and linker
            """
        ),

        "JIT_TARGET".enum(
            """
            Target is chosen based on supplied {@code CUjit_target}. Cannot be combined with #JIT_THREADS_PER_BLOCK.

            Option type: {@code unsigned int} for enumerated type {@code CUjit_target}. Applies to: compiler and linker
            """
        ),

        "JIT_FALLBACK_STRATEGY".enum(
            """
            Specifies choice of fallback strategy if matching cubin is not found.

            Choice is based on supplied {@code CUjit_fallback}. This option cannot be used with {@code cuLink*} APIs as the linker requires exact matches.

            Option type: {@code unsigned int} for enumerated type {@code CUjit_fallback}. Applies to: compiler only
            """
        ),

        "JIT_GENERATE_DEBUG_INFO".enum(
            """
            Specifies whether to create debug information in output (-g) (0: false, default).

            Option type: {@code int}. Applies to: compiler and linker
            """
        ),

        "JIT_LOG_VERBOSE".enum(
            """
            Generate verbose log messages (0: false, default).

            Option type: {@code int}. Applies to: compiler and linker
            """
        ),

        "JIT_GENERATE_LINE_INFO".enum(
            """
            Generate line number information (-lineinfo) (0: false, default).

            Option type: {@code int}. Applies to: compiler only
            """
        ),

        "JIT_CACHE_MODE".enum(
            """
            Specifies whether to enable caching explicitly (-dlcm). Choice is based on supplied {@code CUjit_cacheMode_enum}.

            Option type: {@code unsigned int} for enumerated type {@code CUjit_cacheMode_enum}. Applies to: compiler only
            """
        ),

        "JIT_NEW_SM3X_OPT".enum("Used for internal purposes only, in this version of CUDA."),
        "JIT_FAST_COMPILE".enum("Used for internal purposes only, in this version of CUDA."),

        "JIT_GLOBAL_SYMBOL_NAMES".enum(
            """
            Array of device symbol names that will be relocated to the corresponing host addresses stored in #JIT_GLOBAL_SYMBOL_ADDRESSES.

            Must contain #JIT_GLOBAL_SYMBOL_COUNT entries. When loding a device module, driver will relocate all encountered unresolved symbols to the host
            addresses. It is only allowed to register symbols that correspond to unresolved global variables. It is illegal to register the same device symbol
            at multiple addresses.

            Option type: {@code const char **}. Applies to: dynamic linker only
            """
        ),

        "JIT_GLOBAL_SYMBOL_ADDRESSES".enum(
            """
            Array of host addresses that will be used to relocate corresponding device symbols stored in #JIT_GLOBAL_SYMBOL_NAMES.

            Must contain #JIT_GLOBAL_SYMBOL_COUNT entries.

            Option type: {@code void **}. Applies to: dynamic linker only
            """
        ),

        "JIT_GLOBAL_SYMBOL_COUNT".enum(
            """
            Number of entries in #JIT_GLOBAL_SYMBOL_NAMES and #JIT_GLOBAL_SYMBOL_ADDRESSES arrays.

            Option type: {@code unsigned int}. Applies to: dynamic linker only
            """
        ),

        "JIT_LTO".enum(
            """
            Enable link-time optimization (-dlto) for device code (0: false, default)

            Option type: {@code int}. Applies to: compiler and linker
            """
        ),
        "JIT_FTZ".enum(
            """
            Control single-precision denormals (-ftz) support (0: false, default).
            ${ul(
                "1 : flushes denormal values to zero",
                "0 : preserves denormal values"
            )} 

            Option type: {@code int}. Applies to: link-time optimization specified with #JIT_LTO
            """
        ),
        "JIT_PREC_DIV".enum(
            """
            Control single-precision floating-point division and reciprocals (-prec-div) support (1: true, default).
            ${ul(
                "1 : Enables the IEEE round-to-nearest mode",
                "0 : Enables the fast approximation mode"
            )}

            Option type: {@code int}. Applies to: link-time optimization specified with #JIT_LTO
            """
        ),
        "JIT_PREC_SQRT".enum(
            """
            Control single-precision floating-point square root (-prec-sqrt) support (1: true, default).
            ${ul(
                "1 : Enables the IEEE round-to-nearest mode",
                "0 : Enables the fast approximation mode"
            )}

            Option type: {@code int}. Applies to: link-time optimization specified with #JIT_LTO
            """
        ),
        "JIT_FMA".enum(
            """
            Enable/Disable the contraction of floating-point multiplies and adds/subtracts into floating-point multiply-add (-fma) operations (1: Enable,
            default; 0: Disable).

            Option type: {@code int}. Applies to: link-time optimization specified with #JIT_LTO
            """
        ),
        "JIT_NUM_OPTIONS".enum(
            """
            Enable/Disable the contraction of floating-point multiplies and adds/subtracts into floating-point multiply-add (-fma) operations (1: Enable,
            default; 0: Disable).

            Option type: {@code int}. Applies to: link-time optimization specified with #JIT_LTO
            """
        )
    )

    EnumConstant(
        "Online compilation targets. ({@code CUjit_target})",

        "TARGET_COMPUTE_20".enum("Compute device class 2.0", "20"),
        "TARGET_COMPUTE_21".enum("Compute device class 2.1"),
        "TARGET_COMPUTE_30".enum("Compute device class 3.0", "30"),
        "TARGET_COMPUTE_32".enum("Compute device class 3.2", "32"),
        "TARGET_COMPUTE_35".enum("Compute device class 3.5", "35"),
        "TARGET_COMPUTE_37".enum("Compute device class 3.7", "37"),
        "TARGET_COMPUTE_50".enum("Compute device class 5.0", "50"),
        "TARGET_COMPUTE_52".enum("Compute device class 5.2", "52"),
        "TARGET_COMPUTE_53".enum("Compute device class 5.3"),
        "TARGET_COMPUTE_60".enum("Compute device class 6.0.", "60"),
        "TARGET_COMPUTE_61".enum("Compute device class 6.1."),
        "TARGET_COMPUTE_62".enum("Compute device class 6.2."),
        "TARGET_COMPUTE_70".enum("Compute device class 7.0.", "70"),
        "TARGET_COMPUTE_72".enum("Compute device class 7.2.", "72"),
        "TARGET_COMPUTE_75".enum("Compute device class 7.5.", "75"),
        "TARGET_COMPUTE_80".enum("Compute device class 8.0.", "80"),
        "TARGET_COMPUTE_86".enum("Compute device class 8.6.", "86")
    )

    EnumConstant(
        "Cubin matching fallback strategies. ({@code CUjit_fallback})",

        "PREFER_PTX".enum("Prefer to compile ptx if exact binary match not found", 0),
        "PREFER_BINARY".enum("Prefer to fall back to compatible binary code if exact match not found")
    )

    EnumConstant(
        "Caching modes for {@code dlcm}. ({@code CUjit_cacheMode})",

        "JIT_CACHE_OPTION_NONE".enum("Compile with no -dlcm flag specified", 0),
        "JIT_CACHE_OPTION_CG".enum("Compile with L1 cache disabled"),
        "JIT_CACHE_OPTION_CA".enum("Compile with L1 cache enabled")
    )

    EnumConstant(
        "Device code formats. ({@code CUjitInputType})",

        "JIT_INPUT_CUBIN".enum(
            """
            Compiled device-class-specific device code

            Applicable options: none
            """,
            "0"
        ),

        "JIT_INPUT_PTX".enum(
            """
            PTX source code.

            Applicable options: PTX compiler options
            """
        ),

        "JIT_INPUT_FATBINARY".enum(
            """
            Bundle of multiple cubins and/or PTX of some device code.

            Applicable options: PTX compiler options, #JIT_FALLBACK_STRATEGY
            """
        ),

        "JIT_INPUT_OBJECT".enum(
            """
            Host object with embedded device code.

            Applicable options: PTX compiler options, #JIT_FALLBACK_STRATEGY
            """
        ),

        "JIT_INPUT_LIBRARY".enum(
            """
            Archive of host objects with embedded device code.

            Applicable options: PTX compiler options, #JIT_FALLBACK_STRATEGY
            """
        ),
        "JIT_INPUT_NVVM".enum(
            """
            High-level intermediate code for link-time optimization. 

            Applicable options: NVVM compiler options, PTX compiler options
            """
        ),
    )

    EnumConstant(
        "Flags to register a graphics resource. ({@code CUgraphicsRegisterFlags})",

        "GRAPHICS_REGISTER_FLAGS_NONE".enum("", 0x00),
        "GRAPHICS_REGISTER_FLAGS_READ_ONLY".enum("", 0x01),
        "GRAPHICS_REGISTER_FLAGS_WRITE_DISCARD".enum("", 0x02),
        "GRAPHICS_REGISTER_FLAGS_SURFACE_LDST".enum("", 0x04),
        "GRAPHICS_REGISTER_FLAGS_TEXTURE_GATHER".enum("", 0x08)
    )

    EnumConstant(
        "Flags for mapping and unmapping interop resources. ({@code CUgraphicsMapResourceFlags})",

        "GRAPHICS_MAP_RESOURCE_FLAGS_NONE".enum("", 0x00),
        "GRAPHICS_MAP_RESOURCE_FLAGS_READ_ONLY".enum("", 0x01),
        "GRAPHICS_MAP_RESOURCE_FLAGS_WRITE_DISCARD".enum("", 0x02)
    )

    EnumConstant(
        "Array indices for cube faces. ({@code CUarray_cubemap_face})",

        "CUBEMAP_FACE_POSITIVE_X".enum("Positive X face of cubemap", 0x00),
        "CUBEMAP_FACE_NEGATIVE_X".enum("Negative X face of cubemap", 0x01),
        "CUBEMAP_FACE_POSITIVE_Y".enum("Positive Y face of cubemap", 0x02),
        "CUBEMAP_FACE_NEGATIVE_Y".enum("Negative Y face of cubemap", 0x03),
        "CUBEMAP_FACE_POSITIVE_Z".enum("Positive Z face of cubemap", 0x04),
        "CUBEMAP_FACE_NEGATIVE_Z".enum("Negative Z face of cubemap", 0x05)
    )

    EnumConstant(
        "Limits. ({@code CUlimit})",

        "LIMIT_STACK_SIZE".enum("GPU thread stack size", "0x00"),
        "LIMIT_PRINTF_FIFO_SIZE".enum("GPU printf FIFO size", "0x01"),
        "LIMIT_MALLOC_HEAP_SIZE".enum("GPU malloc heap size", "0x02"),
        "LIMIT_DEV_RUNTIME_SYNC_DEPTH".enum("GPU device runtime launch synchronize depth", "0x03"),
        "LIMIT_DEV_RUNTIME_PENDING_LAUNCH_COUNT".enum("GPU device runtime pending launch count", "0x04"),
        "LIMIT_MAX_L2_FETCH_GRANULARITY".enum(
            "A value between 0 and 128 that indicates the maximum fetch granularity of L2 (in Bytes). This is a hint",
            "0x05"
        ),
        "LIMIT_PERSISTING_L2_CACHE_SIZE".enum("A size in bytes for L2 persisting lines cache size", "0x06")
    )

    EnumConstant(
        "Resource types. ({@code CUresourcetype})",

        "RESOURCE_TYPE_ARRAY".enum("Array resoure", 0x00),
        "RESOURCE_TYPE_MIPMAPPED_ARRAY".enum("Mipmapped array resource", 0x01),
        "RESOURCE_TYPE_LINEAR".enum("Linear resource", 0x02),
        "RESOURCE_TYPE_PITCH2D".enum("Pitch 2D resource", 0x03)
    )

    EnumConstant(
        "Specifies performance hint with ##CUaccessPolicyWindow for {@code hitProp} and {@code missProp} members. ({@code CUaccessProperty})",

        "ACCESS_PROPERTY_NORMAL".enum("Normal cache persistence.", "0"),
        "ACCESS_PROPERTY_STREAMING".enum("Streaming access is less likely to persit from cache."),
        "ACCESS_PROPERTY_PERSISTING".enum("Persisting access is more likely to persist in cache.")
    )

    EnumConstant(
        "Graph node types. ({@code CUgraphNodeType})",

        "GRAPH_NODE_TYPE_KERNEL".enum("GPU kernel node", "0"),
        "GRAPH_NODE_TYPE_MEMCPY".enum("Memcpy node"),
        "GRAPH_NODE_TYPE_MEMSET".enum("Memset node"),
        "GRAPH_NODE_TYPE_HOST".enum("Host (executable) node"),
        "GRAPH_NODE_TYPE_GRAPH".enum("Node which executes an embedded graph"),
        "GRAPH_NODE_TYPE_EMPTY".enum("Empty (no-op) node"),
        "GRAPH_NODE_TYPE_WAIT_EVENT".enum("External event wait node"),
        "GRAPH_NODE_TYPE_EVENT_RECORD".enum("External event record node"),
        "GRAPH_NODE_TYPE_EXT_SEMAS_SIGNAL".enum("External semaphore signal node"),
        "GRAPH_NODE_TYPE_EXT_SEMAS_WAIT".enum("External semaphore wait node"),
        "GRAPH_NODE_TYPE_MEM_ALLOC".enum("Memory Allocation Node"),
        "GRAPH_NODE_TYPE_MEM_FREE".enum("Memory Free Node")
    )

    EnumConstant(
        "{@code CUsynchronizationPolicy}",

        "SYNC_POLICY_AUTO".enum("", "1"),
        "SYNC_POLICY_SPIN".enum,
        "SYNC_POLICY_YIELD".enum,
        "SYNC_POLICY_BLOCKING_SYNC".enum
    )

    EnumConstant(
        "Graph kernel node Attributes ({@code CUkernelNodeAttrID})",

        "KERNEL_NODE_ATTRIBUTE_ACCESS_POLICY_WINDOW".enum("Identifier for ##CUkernelNodeAttrValue{@code {@code accessPolicyWindow}}.", "1"),
        "KERNEL_NODE_ATTRIBUTE_COOPERATIVE".enum("Allows a kernel node to be cooperative (see #LaunchCooperativeKernel()).")
    )

    EnumConstant(
        "Possible stream capture statuses returned by #StreamIsCapturing(). ({@code CUstreamCaptureStatus})",

        "STREAM_CAPTURE_STATUS_NONE".enum("Stream is not capturing", 0),
        "STREAM_CAPTURE_STATUS_ACTIVE".enum("Stream is actively capturing", 1),
        "STREAM_CAPTURE_STATUS_INVALIDATED".enum("Stream is part of a capture sequence that has been invalidated, but not terminated", 2)
    )

    EnumConstant(
        """
        Possible modes for stream capture thread interactions. ({@code CUstreamCaptureMode})

        For more details see #StreamBeginCapture() and #ThreadExchangeStreamCaptureMode()
        """,

        "STREAM_CAPTURE_MODE_GLOBAL".enum("", "0"),
        "STREAM_CAPTURE_MODE_THREAD_LOCAL".enum,
        "STREAM_CAPTURE_MODE_RELAXED".enum
    )

    EnumConstant(
        "Stream Attributes ({@code CUstreamAttrID})",

        "STREAM_ATTRIBUTE_ACCESS_POLICY_WINDOW".enum("Identifier for ##CUstreamAttrValue{@code {@code accessPolicyWindow}}.", "1"),
        "STREAM_ATTRIBUTE_SYNCHRONIZATION_POLICY".enum("{@code CUsynchronizationPolicy} for work queued up in this stream", "3")
    )

    EnumConstant(
        "Flags to specify search options. For more details see #GetProcAddress(). ({@code CUdriverProcAddress_flags})",

        "GET_PROC_ADDRESS_DEFAULT".enum("Default search mode for driver symbols.", "0"),
        "GET_PROC_ADDRESS_LEGACY_STREAM".enum("Search for legacy versions of driver symbols.", "1 << 0"),
        "GET_PROC_ADDRESS_PER_THREAD_DEFAULT_STREAM".enum("Search for per-thread versions of driver symbols.", "1 << 1")
    )

    EnumConstant(
        """
        Execution Affinity Types

        ({@code CUexecAffinityType})
        """,

        "EXEC_AFFINITY_TYPE_SM_COUNT".enum("Create a context with limited SMs.", "0"),
        "EXEC_AFFINITY_TYPE_MAX".enum
    )

EnumConstant(
        "Error codes. ({@code CUresult})",

        "CUDA_SUCCESS".enum(
            """
            The API call returned with no errors.

            In the case of query calls, this also means that the operation being queried is complete (see #EventQuery() and #StreamQuery()).
            """,
            "0"
        ),
        "CUDA_ERROR_INVALID_VALUE".enum(
            "This indicates that one or more of the parameters passed to the API call is not within an acceptable range of values."
        ),
        "CUDA_ERROR_OUT_OF_MEMORY".enum("The API call failed because it was unable to allocate enough memory to perform the requested operation."),
        "CUDA_ERROR_NOT_INITIALIZED".enum("This indicates that the CUDA driver has not been initialized with #Init() or that initialization has failed."),
        "CUDA_ERROR_DEINITIALIZED".enum("This indicates that the CUDA driver is in the process of shutting down."),
        "CUDA_ERROR_PROFILER_DISABLED".enum(
            """
            This indicates profiler is not initialized for this run. This can happen when the application is running with external profiling tools like visual
            profiler.
            """
        ),
        "CUDA_ERROR_PROFILER_NOT_INITIALIZED".enum(
            """
            Deprecated: This error return is deprecated as of CUDA 5.0. It is no longer an error to attempt to enable/disable the profiling via
            #ProfilerStart() or #ProfilerStop() without initialization.
            """
        ),
        "CUDA_ERROR_PROFILER_ALREADY_STARTED".enum(
            """
            Deprecated: This error return is deprecated as of CUDA 5.0. It is no longer an error to call #ProfilerStart() when profiling is already enabled.
            """
        ),
        "CUDA_ERROR_PROFILER_ALREADY_STOPPED".enum(
            """
            Deprecated: This error return is deprecated as of CUDA 5.0. It is no longer an error to call #ProfilerStop() when profiling is already disabled.
            """
        ),
        "CUDA_ERROR_STUB_LIBRARY".enum(
            """
            This indicates that the CUDA driver that the application has loaded is a stub library. Applications that run with the stub rather than a real
            driver loaded will result in CUDA API returning this error.
            """,
            "34"
        ),
        "CUDA_ERROR_NO_DEVICE".enum("This indicates that no CUDA-capable devices were detected by the installed CUDA driver.", "100"),
        "CUDA_ERROR_INVALID_DEVICE".enum(
            """
            This indicates that the device ordinal supplied by the user does not correspond to a valid CUDA device or that the action requested is invalid for
            the specified device.
            """
        ),
        "CUDA_ERROR_DEVICE_NOT_LICENSED".enum("This error indicates that the Grid license is not applied."),
        "CUDA_ERROR_INVALID_IMAGE".enum("This indicates that the device kernel image is invalid. This can also indicate an invalid CUDA module.", "200"),
        "CUDA_ERROR_INVALID_CONTEXT".enum(
            """
            This most frequently indicates that there is no context bound to the current thread. This can also be returned if the context passed to an API call
            is not a valid handle (such as a context that has had #CtxDestroy() invoked on it). This can also be returned if a user mixes different API
            versions (i.e. 3010 context with 3020 API calls). See #CtxGetApiVersion() for more details.
            """
        ),
        "CUDA_ERROR_CONTEXT_ALREADY_CURRENT".enum(
            """
            This indicated that the context being supplied as a parameter to the API call was already the active context.Deprecated: This error return is
            deprecated as of CUDA 3.2. It is no longer an error to attempt to push the active context via #CtxPushCurrent().
            """
        ),
        "CUDA_ERROR_MAP_FAILED".enum("This indicates that a map or register operation has failed.", "205"),
        "CUDA_ERROR_UNMAP_FAILED".enum("This indicates that an unmap or unregister operation has failed."),
        "CUDA_ERROR_ARRAY_IS_MAPPED".enum("This indicates that the specified array is currently mapped and thus cannot be destroyed."),
        "CUDA_ERROR_ALREADY_MAPPED".enum("This indicates that the resource is already mapped."),
        "CUDA_ERROR_NO_BINARY_FOR_GPU".enum(
            """
            This indicates that there is no kernel image available that is suitable for the device. This can occur when a user specifies code generation
            options for a particular CUDA source file that do not include the corresponding device configuration.
            """
        ),
        "CUDA_ERROR_ALREADY_ACQUIRED".enum("This indicates that a resource has already been acquired."),
        "CUDA_ERROR_NOT_MAPPED".enum("This indicates that a resource is not mapped."),
        "CUDA_ERROR_NOT_MAPPED_AS_ARRAY".enum("This indicates that a mapped resource is not available for access as an array."),
        "CUDA_ERROR_NOT_MAPPED_AS_POINTER".enum("This indicates that a mapped resource is not available for access as a pointer."),
        "CUDA_ERROR_ECC_UNCORRECTABLE".enum("This indicates that an uncorrectable ECC error was detected during execution."),
        "CUDA_ERROR_UNSUPPORTED_LIMIT".enum("This indicates that the {@code CUlimit} passed to the API call is not supported by the active device."),
        "CUDA_ERROR_CONTEXT_ALREADY_IN_USE".enum(
            """
            This indicates that the {@code CUcontext} passed to the API call can only be bound to a single CPU thread at a time but is already bound to a CPU thread.
            """
        ),
        "CUDA_ERROR_PEER_ACCESS_UNSUPPORTED".enum("This indicates that peer access is not supported across the given devices."),
        "CUDA_ERROR_INVALID_PTX".enum("This indicates that a PTX JIT compilation failed."),
        "CUDA_ERROR_INVALID_GRAPHICS_CONTEXT".enum("This indicates an error with OpenGL or DirectX context."),
        "CUDA_ERROR_NVLINK_UNCORRECTABLE".enum("This indicates that an uncorrectable NVLink error was detected during the execution."),
        "CUDA_ERROR_JIT_COMPILER_NOT_FOUND".enum("This indicates that the PTX JIT compiler library was not found."),
        "CUDA_ERROR_UNSUPPORTED_PTX_VERSION".enum("This indicates that the provided PTX was compiled with an unsupported toolchain."),
        "CUDA_ERROR_JIT_COMPILATION_DISABLED".enum("This indicates that the PTX JIT compilation was disabled."),
        "CUDA_ERROR_UNSUPPORTED_EXEC_AFFINITY".enum(
            "This indicates that the {@code CUexecAffinityType} passed to the API call is not supported by the active device."
        ),
        "CUDA_ERROR_INVALID_SOURCE".enum(
            "This indicates that the device kernel source is invalid. This includes compilation/linker errors encountered in device code or user error.",
            "300"
        ),
        "CUDA_ERROR_FILE_NOT_FOUND".enum("This indicates that the file specified was not found."),
        "CUDA_ERROR_SHARED_OBJECT_SYMBOL_NOT_FOUND".enum("This indicates that a link to a shared object failed to resolve."),
        "CUDA_ERROR_SHARED_OBJECT_INIT_FAILED".enum("This indicates that initialization of a shared object failed."),
        "CUDA_ERROR_OPERATING_SYSTEM".enum("This indicates that an OS call failed."),
        "CUDA_ERROR_INVALID_HANDLE".enum(
            """
            This indicates that a resource handle passed to the API call was not valid. Resource handles are opaque types like {@code CUstream} and
            {@code CUevent}.
            """,
            "400"
        ),
        "CUDA_ERROR_ILLEGAL_STATE".enum("This indicates that a resource required by the API call is not in a valid state to perform the requested operation."),
        "CUDA_ERROR_NOT_FOUND".enum(
            """
            This indicates that a named symbol was not found. Examples of symbols are global/constant variable names, driver function names, texture names, and
            surface names.
            """,
            "500"
        ),
        "CUDA_ERROR_NOT_READY".enum(
            """
            This indicates that asynchronous operations issued previously have not completed yet. This result is not actually an error, but must be indicated
            differently than #CUDA_SUCCESS (which indicates completion). Calls that may return this value include #EventQuery() and #StreamQuery().
            """,
            "600"
        ),
        "CUDA_ERROR_ILLEGAL_ADDRESS".enum(
            """
            While executing a kernel, the device encountered a load or store instruction on an invalid memory address. This leaves the process in an
            inconsistent state and any further CUDA work will return the same error. To continue using CUDA, the process must be terminated and relaunched.
            """,
            "700"
        ),
        "CUDA_ERROR_LAUNCH_OUT_OF_RESOURCES".enum(
            """
            This indicates that a launch did not occur because it did not have appropriate resources. This error usually indicates that the user has attempted
            to pass too many arguments to the device kernel, or the kernel launch specifies too many threads for the kernel's register count. Passing arguments
            of the wrong size (i.e. a 64-bit pointer when a 32-bit int is expected) is equivalent to passing too many arguments and can also result in this
            error.
            """
        ),
        "CUDA_ERROR_LAUNCH_TIMEOUT".enum(
            """
            This indicates that the device kernel took too long to execute. This can only occur if timeouts are enabled - see the device attribute
            #DEVICE_ATTRIBUTE_KERNEL_EXEC_TIMEOUT for more information. This leaves the process in an inconsistent state and any further CUDA work will
            return the same error. To continue using CUDA, the process must be terminated and relaunched.
            """
        ),
        "CUDA_ERROR_LAUNCH_INCOMPATIBLE_TEXTURING".enum("This error indicates a kernel launch that uses an incompatible texturing mode."),
        "CUDA_ERROR_PEER_ACCESS_ALREADY_ENABLED".enum(
            """
            This error indicates that a call to #CtxEnablePeerAccess() is trying to re-enable peer access to a context which has already had peer access to
            it enabled.
            """
        ),
        "CUDA_ERROR_PEER_ACCESS_NOT_ENABLED".enum(
            """
            This error indicates that #CtxDisablePeerAccess() is trying to disable peer access which has not been enabled yet via #CtxEnablePeerAccess().
            """
        ),
        "CUDA_ERROR_PRIMARY_CONTEXT_ACTIVE".enum(
            "This error indicates that the primary context for the specified device has already been initialized.",
            "708"
        ),
        "CUDA_ERROR_CONTEXT_IS_DESTROYED".enum(
            """
            This error indicates that the context current to the calling thread has been destroyed using #CtxDestroy(), or is a primary context which has not
            yet been initialized.
            """
        ),
        "CUDA_ERROR_ASSERT".enum(
            """
            A device-side assert triggered during kernel execution. The context cannot be used anymore, and must be destroyed. All existing device memory
            allocations from this context are invalid and must be reconstructed if the program is to continue using CUDA.
            """
        ),
        "CUDA_ERROR_TOO_MANY_PEERS".enum(
            """
            This error indicates that the hardware resources required to enable peer access have been exhausted for one or more of the devices passed to
            #CtxEnablePeerAccess().
            """
        ),
        "CUDA_ERROR_HOST_MEMORY_ALREADY_REGISTERED".enum(
            "This error indicates that the memory range passed to #MemHostRegister() has already been registered."
        ),
        "CUDA_ERROR_HOST_MEMORY_NOT_REGISTERED".enum(
            "This error indicates that the pointer passed to #MemHostUnregister() does not correspond to any currently registered memory region."
        ),
        "CUDA_ERROR_HARDWARE_STACK_ERROR".enum(
            """
            While executing a kernel, the device encountered a stack error. This can be due to stack corruption or exceeding the stack size limit. This leaves
            the process in an inconsistent state and any further CUDA work will return the same error. To continue using CUDA, the process must be terminated
            and relaunched.
            """
        ),
        "CUDA_ERROR_ILLEGAL_INSTRUCTION".enum(
            """
            While executing a kernel, the device encountered an illegal instruction. This leaves the process in an inconsistent state and any further CUDA work
            will return the same error. To continue using CUDA, the process must be terminated and relaunched.
            """
        ),
        "CUDA_ERROR_MISALIGNED_ADDRESS".enum(
            """
            While executing a kernel, the device encountered a load or store instruction on a memory address which is not aligned. This leaves the process in
            an inconsistent state and any further CUDA work will return the same error. To continue using CUDA, the process must be terminated and relaunched.
            """
        ),
        "CUDA_ERROR_INVALID_ADDRESS_SPACE".enum(
            """
            While executing a kernel, the device encountered an instruction which can only operate on memory locations in certain address spaces (global,
            shared, or local), but was supplied a memory address not belonging to an allowed address space. This leaves the process in an inconsistent state
            and any further CUDA work will return the same error. To continue using CUDA, the process must be terminated and relaunched.
            """
        ),
        "CUDA_ERROR_INVALID_PC".enum(
            """
            While executing a kernel, the device program counter wrapped its address space. This leaves the process in an inconsistent state and any further
            CUDA work will return the same error. To continue using CUDA, the process must be terminated and relaunched.
            """
        ),
        "CUDA_ERROR_LAUNCH_FAILED".enum(
            """
            An exception occurred on the device while executing a kernel. Common causes include dereferencing an invalid device pointer and accessing out of
            bounds shared memory. Less common cases can be system specific - more information about these cases can be found in the system specific user guide.
            This leaves the process in an inconsistent state and any further CUDA work will return the same error. To continue using CUDA, the process must be
            terminated and relaunched.
            """
        ),
        "CUDA_ERROR_COOPERATIVE_LAUNCH_TOO_LARGE".enum(
            """
            This error indicates that the number of blocks launched per grid for a kernel that was launched via either #LaunchCooperativeKernel() or
            #LaunchCooperativeKernelMultiDevice() exceeds the maximum number of blocks as allowed by #OccupancyMaxActiveBlocksPerMultiprocessor() or
            #OccupancyMaxActiveBlocksPerMultiprocessorWithFlags() times the number of multiprocessors as specified by the device attribute
            #DEVICE_ATTRIBUTE_MULTIPROCESSOR_COUNT.
            """
        ),
        "CUDA_ERROR_NOT_PERMITTED".enum("This error indicates that the attempted operation is not permitted.", "800"),
        "CUDA_ERROR_NOT_SUPPORTED".enum("This error indicates that the attempted operation is not supported on the current system or device."),
        "CUDA_ERROR_SYSTEM_NOT_READY".enum(
            """
            This error indicates that the system is not yet ready to start any CUDA work. To continue using CUDA, verify the system configuration is in a valid
            state and all required driver daemons are actively running. More information about this error can be found in the system specific user guide.
            """
        ),
        "CUDA_ERROR_SYSTEM_DRIVER_MISMATCH".enum(
            """
            This error indicates that there is a mismatch between the versions of the display driver and the CUDA driver. Refer to the compatibility
            documentation for supported versions.
            """
        ),
        "CUDA_ERROR_COMPAT_NOT_SUPPORTED_ON_DEVICE".enum(
            """
            This error indicates that the system was upgraded to run with forward compatibility but the visible hardware detected by CUDA does not support this
            configuration. Refer to the compatibility documentation for the supported hardware matrix or ensure that only supported hardware is visible during
            initialization via the {@code CUDA_VISIBLE_DEVICES} environment variable.
            """
        ),
        "CUDA_ERROR_MPS_CONNECTION_FAILED".enum("This error indicates that the MPS client failed to connect to the MPS control daemon or the MPS server."),
        "CUDA_ERROR_MPS_RPC_FAILURE".enum("This error indicates that the remote procedural call between the MPS server and the MPS client failed."),
        "CUDA_ERROR_MPS_SERVER_NOT_READY".enum(
            """
            This error indicates that the MPS server is not ready to accept new MPS client requests. This error can be returned when the MPS server is in the
            process of recovering from a fatal failure.
            """
        ),
        "CUDA_ERROR_MPS_MAX_CLIENTS_REACHED".enum("This error indicates that the hardware resources required to create MPS client have been exhausted."),
        "CUDA_ERROR_MPS_MAX_CONNECTIONS_REACHED".enum(
            "This error indicates the the hardware resources required to support device connections have been exhausted."
        ),
        "CUDA_ERROR_STREAM_CAPTURE_UNSUPPORTED".enum("This error indicates that the operation is not permitted when the stream is capturing.", "900"),
        "CUDA_ERROR_STREAM_CAPTURE_INVALIDATED".enum(
            "This error indicates that the current capture sequence on the stream has been invalidated due to a previous error."
        ),
        "CUDA_ERROR_STREAM_CAPTURE_MERGE".enum("This error indicates that the operation would have resulted in a merge of two independent capture sequences."),
        "CUDA_ERROR_STREAM_CAPTURE_UNMATCHED".enum("This error indicates that the capture was not initiated in this stream."),
        "CUDA_ERROR_STREAM_CAPTURE_UNJOINED".enum("This error indicates that the capture sequence contains a fork that was not joined to the primary stream."),
        "CUDA_ERROR_STREAM_CAPTURE_ISOLATION".enum(
            """
            This error indicates that a dependency would have been created which crosses the capture sequence boundary. Only implicit in-stream ordering
            dependencies are allowed to cross the boundary.
            """
        ),
        "CUDA_ERROR_STREAM_CAPTURE_IMPLICIT".enum(
            "This error indicates a disallowed implicit dependency on a current capture sequence from cudaStreamLegacy."
        ),
        "CUDA_ERROR_CAPTURED_EVENT".enum(
            "This error indicates that the operation is not permitted on an event which was last recorded in a capturing stream."
        ),
        "CUDA_ERROR_STREAM_CAPTURE_WRONG_THREAD".enum(
            """
            A stream capture sequence not initiated with the #STREAM_CAPTURE_MODE_RELAXED argument to #StreamBeginCapture() was passed to #StreamEndCapture()
            in a different thread.
            """
        ),
        "CUDA_ERROR_TIMEOUT".enum("This error indicates that the timeout specified for the wait operation has lapsed."),
        "CUDA_ERROR_GRAPH_EXEC_UPDATE_FAILURE".enum(
            """
            This error indicates that the graph update was not performed because it included changes which violated constraints specific to instantiated graph
            update.
            """
        ),
        "CUDA_ERROR_EXTERNAL_DEVICE".enum(
            """
            This indicates that an async error has occurred in a device outside of CUDA. If CUDA was waiting for an external device's signal before consuming
            shared data, the external device signaled an error indicating that the data is not valid for consumption. This leaves the process in an
            inconsistent state and any further CUDA work will return the same error. To continue using CUDA, the process must be terminated and relaunched.
            """
        ),
        "CUDA_ERROR_UNKNOWN".enum("This indicates that an unknown internal error has occurred.", "999")
    ).noPrefix()

    EnumConstant(
        "P2P Attributes. ({@code CUdevice_P2PAttribute})",

        "DEVICE_P2P_ATTRIBUTE_PERFORMANCE_RANK".enum("A relative value indicating the performance of the link between two devices", 0x01),
        "DEVICE_P2P_ATTRIBUTE_ACCESS_SUPPORTED".enum("P2P Access is enable", 0x02),
        "DEVICE_P2P_ATTRIBUTE_NATIVE_ATOMIC_SUPPORTED".enum("Atomic operation over the link supported", 0x03),
        "DEVICE_P2P_ATTRIBUTE_ACCESS_ACCESS_SUPPORTED".enum("Deprecated, use CU_DEVICE_P2P_ATTRIBUTE_CUDA_ARRAY_ACCESS_SUPPORTED instead", 0x04),
        "DEVICE_P2P_ATTRIBUTE_CUDA_ARRAY_ACCESS_SUPPORTED".enum("Accessing CUDA arrays over the link supported", 0x04)
    )

    EnumConstant(
        "Flags for #MemHostAlloc().",

        "MEMHOSTALLOC_PORTABLE".enum("If set, host memory is portable between CUDA contexts.", 0x01),
        "MEMHOSTALLOC_DEVICEMAP".enum(
            "If set, host memory is mapped into CUDA address space and #MemHostGetDevicePointer() may be called on the host pointer.",
            0x02
        ),
        "MEMHOSTALLOC_WRITECOMBINED".enum(
            """
            If set, host memory is allocated as write-combined - fast to write, faster to DMA, slow to read except via SSE4 streaming load instruction
            ({@code MOVNTDQA}).
            """,
            0x04
        )
    )

    EnumConstant(
        "Flags for #MemHostRegister().",

        "MEMHOSTREGISTER_PORTABLE".enum("If set, host memory is portable between CUDA contexts.", "0x01"),
        "MEMHOSTREGISTER_DEVICEMAP".enum(
            "If set, host memory is mapped into CUDA address space and #MemHostGetDevicePointer() may be called on the host pointer.",
            "0x02"
        ),
        "MEMHOSTREGISTER_IOMEMORY".enum(
            """
            If set, the passed memory pointer is treated as pointing to some memory-mapped I/O space, e.g. belonging to a third-party PCIe device.

            On Windows the flag is a no-op. On Linux that memory is marked as non cache-coherent for the GPU and is expected to be physically contiguous.
            It may return #CUDA_ERROR_NOT_PERMITTED if run as an unprivileged user, #CUDA_ERROR_NOT_SUPPORTED on older Linux kernel versions. On all other
            platforms, it is not supported and #CUDA_ERROR_NOT_SUPPORTED is returned.
            """,
            "0x04"
        ),
        "MEMHOSTREGISTER_READ_ONLY".enum(
            """
            If set, the passed memory pointer is treated as pointing to memory that is considered read-only by the device.

            On platforms without #DEVICE_ATTRIBUTE_PAGEABLE_MEMORY_ACCESS_USES_HOST_PAGE_TABLES, this flag is required in order to register memory mapped to
            the CPU as read-only. Support for the use of this flag can be queried from the device attribute
            #DEVICE_ATTRIBUTE_READ_ONLY_HOST_REGISTER_SUPPORTED. Using this flag with a current context associated with a device that does not have this
            attribute set will cause #MemHostRegister() to error with #CUDA_ERROR_NOT_SUPPORTED.
            """,
            "0x08"
        )
    )

    IntConstant(
        "Indicates that the layered sparse CUDA array or CUDA mipmapped array has a single mip tail region for all layers.",

        "ARRAY_SPARSE_PROPERTIES_SINGLE_MIPTAIL".."0x1"
    )

    EnumConstant(
        "Resource view format. ({@code CUresourceViewFormat})",

        "RES_VIEW_FORMAT_NONE".enum("No resource view format (use underlying resource format)", 0x00),
        "RES_VIEW_FORMAT_UINT_1X8".enum("1 channel unsigned 8-bit integers", 0x01),
        "RES_VIEW_FORMAT_UINT_2X8".enum("2 channel unsigned 8-bit integers", 0x02),
        "RES_VIEW_FORMAT_UINT_4X8".enum("4 channel unsigned 8-bit integers", 0x03),
        "RES_VIEW_FORMAT_SINT_1X8".enum("1 channel signed 8-bit integers", 0x04),
        "RES_VIEW_FORMAT_SINT_2X8".enum("2 channel signed 8-bit integers", 0x05),
        "RES_VIEW_FORMAT_SINT_4X8".enum("4 channel signed 8-bit integers", 0x06),
        "RES_VIEW_FORMAT_UINT_1X16".enum("1 channel unsigned 16-bit integers", 0x07),
        "RES_VIEW_FORMAT_UINT_2X16".enum("2 channel unsigned 16-bit integers", 0x08),
        "RES_VIEW_FORMAT_UINT_4X16".enum("4 channel unsigned 16-bit integers", 0x09),
        "RES_VIEW_FORMAT_SINT_1X16".enum("1 channel signed 16-bit integers", 0x0a),
        "RES_VIEW_FORMAT_SINT_2X16".enum("2 channel signed 16-bit integers", 0x0b),
        "RES_VIEW_FORMAT_SINT_4X16".enum("4 channel signed 16-bit integers", 0x0c),
        "RES_VIEW_FORMAT_UINT_1X32".enum("1 channel unsigned 32-bit integers", 0x0d),
        "RES_VIEW_FORMAT_UINT_2X32".enum("2 channel unsigned 32-bit integers", 0x0e),
        "RES_VIEW_FORMAT_UINT_4X32".enum("4 channel unsigned 32-bit integers", 0x0f),
        "RES_VIEW_FORMAT_SINT_1X32".enum("1 channel signed 32-bit integers", 0x10),
        "RES_VIEW_FORMAT_SINT_2X32".enum("2 channel signed 32-bit integers", 0x11),
        "RES_VIEW_FORMAT_SINT_4X32".enum("4 channel signed 32-bit integers", 0x12),
        "RES_VIEW_FORMAT_FLOAT_1X16".enum("1 channel 16-bit floating point", 0x13),
        "RES_VIEW_FORMAT_FLOAT_2X16".enum("2 channel 16-bit floating point", 0x14),
        "RES_VIEW_FORMAT_FLOAT_4X16".enum("4 channel 16-bit floating point", 0x15),
        "RES_VIEW_FORMAT_FLOAT_1X32".enum("1 channel 32-bit floating point", 0x16),
        "RES_VIEW_FORMAT_FLOAT_2X32".enum("2 channel 32-bit floating point", 0x17),
        "RES_VIEW_FORMAT_FLOAT_4X32".enum("4 channel 32-bit floating point", 0x18),
        "RES_VIEW_FORMAT_UNSIGNED_BC1".enum("Block compressed 1", 0x19),
        "RES_VIEW_FORMAT_UNSIGNED_BC2".enum("Block compressed 2", 0x1a),
        "RES_VIEW_FORMAT_UNSIGNED_BC3".enum("Block compressed 3", 0x1b),
        "RES_VIEW_FORMAT_UNSIGNED_BC4".enum("Block compressed 4 unsigned", 0x1c),
        "RES_VIEW_FORMAT_SIGNED_BC4".enum("Block compressed 4 signed", 0x1d),
        "RES_VIEW_FORMAT_UNSIGNED_BC5".enum("Block compressed 5 unsigned", 0x1e),
        "RES_VIEW_FORMAT_SIGNED_BC5".enum("Block compressed 5 signed", 0x1f),
        "RES_VIEW_FORMAT_UNSIGNED_BC6H".enum("Block compressed 6 unsigned half-float", 0x20),
        "RES_VIEW_FORMAT_SIGNED_BC6H".enum("Block compressed 6 signed half-float", 0x21),
        "RES_VIEW_FORMAT_UNSIGNED_BC7".enum("Block compressed 7", 0x22)
    )

    EnumConstant(
        "Access flags that specify the level of access the current context's device has on the memory referenced. ({@code CUDA_POINTER_ATTRIBUTE_ACCESS_FLAGS})",

        "POINTER_ATTRIBUTE_ACCESS_FLAG_NONE".enum(
            """
            No access, meaning the device cannot access this memory at all, thus must be staged through accessible memory in order to complete certain
            operations
            """,
            "0x0"
        ),
        "POINTER_ATTRIBUTE_ACCESS_FLAG_READ".enum(
            "Read-only access, meaning writes to this memory are considered invalid accesses and thus return error in that case.",
            "0x1"
        ),
        "POINTER_ATTRIBUTE_ACCESS_FLAG_READWRITE".enum("Read-write access, the device has full read-write access to the memory", "0x3")
    )

    EnumConstant(
        "External memory handle types. ({@code CUexternalMemoryHandleType})",

        "EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD".enum("Handle is an opaque file descriptor", "1"),
        "EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32".enum("Handle is an opaque shared NT handle"),
        "EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT".enum("Handle is an opaque, globally shared handle"),
        "EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP".enum("Handle is a D3D12 heap object"),
        "EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE".enum("Handle is a D3D12 committed resource"),
        "EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_RESOURCE".enum("Handle is a shared NT handle to a D3D11 resource"),
        "EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_RESOURCE_KMT".enum("Handle is a globally shared handle to a D3D11 resource"),
        "EXTERNAL_MEMORY_HANDLE_TYPE_NVSCIBUF".enum("Handle is an NvSciBuf object")
    )

    IntConstant(
        "Indicates that the external memory object is a dedicated resource.",

        "CUDA_EXTERNAL_MEMORY_DEDICATED"..0x1
    ).noPrefix()

    IntConstant(
        """
        When the {@code flags} parameter of ##CUDA_EXTERNAL_SEMAPHORE_SIGNAL_PARAMS contains this flag, it indicates that signaling an external semaphore
        object should skip performing appropriate memory synchronization operations over all the external memory objects that are imported as
        #EXTERNAL_MEMORY_HANDLE_TYPE_NVSCIBUF, which otherwise are performed by default to ensure data coherency with other importers of the same
        {@code NvSciBuf} memory objects.
        """,
        "CUDA_EXTERNAL_SEMAPHORE_SIGNAL_SKIP_NVSCIBUF_MEMSYNC".."0x01"
    ).noPrefix()

    IntConstant(
        """
        When the {@code flags} parameter of ##CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS contains this flag, it indicates that waiting on an external
        semaphore object should skip performing appropriate memory synchronization operations over all the external memory objects that are imported as
        #EXTERNAL_MEMORY_HANDLE_TYPE_NVSCIBUF, which otherwise are performed by default to ensure data coherency with other importers of the same
        {@code NvSciBuf} memory objects.
        """,

        "CUDA_EXTERNAL_SEMAPHORE_WAIT_SKIP_NVSCIBUF_MEMSYNC".."0x02"
    ).noPrefix()

    IntConstant(
        """
        When {@code flags} of #DeviceGetNvSciSyncAttributes() is set to this, it indicates that application needs signaler specific
        {@code NvSciSyncAttr} to be filled by {@code cuDeviceGetNvSciSyncAttributes}.
        """,

        "CUDA_NVSCISYNC_ATTR_SIGNAL".."0x1"
    ).noPrefix()
    IntConstant(
        """
        When {@code flags} of #DeviceGetNvSciSyncAttributes() is set to this, it indicates that application needs waiter specific {@code NvSciSyncAttr} to be
        filled by {@code cuDeviceGetNvSciSyncAttributes}.
        """,
        "CUDA_NVSCISYNC_ATTR_WAIT".."0x2"
    ).noPrefix()

    EnumConstant(
        "External semaphore handle types. ({@code CUexternalSemaphoreHandleType})",

        "EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD".enum("Handle is an opaque file descriptor", "1"),
        "EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32".enum("Handle is an opaque shared NT handle"),
        "EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT".enum("Handle is an opaque, globally shared handle"),
        "EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE".enum("Handle is a shared NT handle referencing a D3D12 fence object"),
        "EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D11_FENCE".enum("Handle is a shared NT handle referencing a D3D11 fence object"),
        "EXTERNAL_SEMAPHORE_HANDLE_TYPE_NVSCISYNC".enum("Opaque handle to NvSciSync Object"),
        "EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D11_KEYED_MUTEX".enum("Handle is a shared NT handle referencing a D3D11 keyed mutex object"),
        "EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D11_KEYED_MUTEX_KMT".enum("Handle is a globally shared handle referencing a D3D11 keyed mutex object"),
        "EXTERNAL_SEMAPHORE_HANDLE_TYPE_TIMELINE_SEMAPHORE_FD".enum("Handle is an opaque file descriptor referencing a timeline semaphore"),
        "EXTERNAL_SEMAPHORE_HANDLE_TYPE_TIMELINE_SEMAPHORE_WIN32".enum("Handle is an opaque shared NT handle referencing a timeline semaphore")
    )

    EnumConstant(
        "Flags for specifying particular handle types. ({@code CUmemAllocationHandleType})",

        "MEM_HANDLE_TYPE_NONE".enum("Does not allow any export mechanism.", "0x0"),
        "MEM_HANDLE_TYPE_POSIX_FILE_DESCRIPTOR".enum("Allows a file descriptor to be used for exporting. Permitted only on POSIX systems. ({@code int})", "0x1"),
        "MEM_HANDLE_TYPE_WIN32".enum("Allows a Win32 NT handle to be used for exporting. ({@code HANDLE})", "0x2"),
        "MEM_HANDLE_TYPE_WIN32_KMT".enum("Allows a Win32 KMT handle to be used for exporting. ({@code D3DKMT_HANDLE})", "0x4")
    )

    EnumConstant(
        "Specifies the memory protection flags for mapping. ({@code CUmemAccess_flags})",

        "MEM_ACCESS_FLAGS_PROT_NONE".enum("Default, make the address range not accessible", "0x0"),
        "MEM_ACCESS_FLAGS_PROT_READ".enum("Make the address range read accessible", "0x1"),
        "MEM_ACCESS_FLAGS_PROT_READWRITE".enum("Make the address range read-write accessible", "0x3")
    )

    EnumConstant(
        "Specifies the type of location. ({@code CUmemLocationType})",

        "MEM_LOCATION_TYPE_INVALID".enum("", "0x0"),
        "MEM_LOCATION_TYPE_DEVICE".enum("Location is a device location, thus id is a device ordinal", "0x1")
    )

    EnumConstant(
        "Defines the allocation types available. ({@code CUmemAllocationType})",

        "MEM_ALLOCATION_TYPE_INVALID".enum("", "0x0"),
        "MEM_ALLOCATION_TYPE_PINNED".enum(
            "This allocation type is 'pinned', i.e. cannot migrate from its current location while the application is actively using it",
            "0x1"
        )
    )

    EnumConstant(
        "Flag for requesting different optimal and required granularities for an allocation. ({@code CUmemAllocationGranularity_flags})",

        "MEM_ALLOC_GRANULARITY_MINIMUM".enum("Minimum required granularity for allocation", "0x0"),
        "MEM_ALLOC_GRANULARITY_RECOMMENDED".enum("Recommended granularity for allocation for best performance", "0x1")
    )

    EnumConstant(
        "Sparse subresource types. ({@code CUarraySparseSubresourceType})",

        "ARRAY_SPARSE_SUBRESOURCE_TYPE_SPARSE_LEVEL".enum("", "0"),
        "ARRAY_SPARSE_SUBRESOURCE_TYPE_MIPTAIL".enum
    )

    EnumConstant(
        "Memory operation types. ({@code CUmemOperationType})",

        "MEM_OPERATION_TYPE_MAP".enum("", "1"),
        "MEM_OPERATION_TYPE_UNMAP".enum
    )

    EnumConstant(
        "Memory handle types ({@code CUmemHandleType})",

        "MEM_HANDLE_TYPE_GENERIC".enum("", "0")
    )

    EnumConstant(
        "Specifies compression attribute for an allocation. ({@code CUmemAllocationCompType})",

        "MEM_ALLOCATION_COMP_NONE".enum("Allocating non-compressible memory", "0x0"),
        "MEM_ALLOCATION_COMP_GENERIC".enum("Allocating  compressible memory", "0x1")
    )

    IntConstant(
        "This flag if set indicates that the memory will be used as a tile pool.",

        "MEM_CREATE_USAGE_TILE_POOL".."0x1"
    )

    EnumConstant(
        "{@code CUgraphExecUpdateResult}",

        "GRAPH_EXEC_UPDATE_SUCCESS".enum("The update succeeded", "0x0"),
        "GRAPH_EXEC_UPDATE_ERROR".enum("The update failed for an unexpected reason which is described in the return value of the function", "0x1"),
        "GRAPH_EXEC_UPDATE_ERROR_TOPOLOGY_CHANGED".enum("The update failed because the topology changed", "0x2"),
        "GRAPH_EXEC_UPDATE_ERROR_NODE_TYPE_CHANGED".enum("The update failed because a node type changed", "0x3"),
        "GRAPH_EXEC_UPDATE_ERROR_FUNCTION_CHANGED".enum("The update failed because the function of a kernel node changed (CUDA driver &lt;11.2)", "0x4"),
        "GRAPH_EXEC_UPDATE_ERROR_PARAMETERS_CHANGED".enum("The update failed because the parameters changed in a way that is not supported", "0x5"),
        "GRAPH_EXEC_UPDATE_ERROR_NOT_SUPPORTED".enum("The update failed because something about the node is not supported", "0x6"),
        "GRAPH_EXEC_UPDATE_ERROR_UNSUPPORTED_FUNCTION_CHANGE".enum(
            "The update failed because the function of a kernel node changed in an unsupported way",
            "0x7"
        )
    )

    EnumConstant(
        "CUDA memory pool attributes ({@code CUmemPool_attribute})",

        "MEMPOOL_ATTR_REUSE_FOLLOW_EVENT_DEPENDENCIES".enum(
            """
            Allow #MemAllocAsync() to use memory asynchronously freed in another streams as long as a stream ordering dependency of the allocating stream on
            the free action exists. Cuda events and null stream interactions can create the required stream ordered dependencies.

            (value type = {@code int}, default enabled)
            """,
            "1"
        ),
        "MEMPOOL_ATTR_REUSE_ALLOW_OPPORTUNISTIC".enum(
            "Allow reuse of already completed frees when there is no dependency between the free and allocation. (value type = {@code int}, default enabled)"
        ),
        "MEMPOOL_ATTR_REUSE_ALLOW_INTERNAL_DEPENDENCIES".enum(
            """
            Allow #MemAllocAsync() to insert new stream dependencies in order to establish the stream ordering required to reuse a piece of memory released by
            #MemFreeAsync().

            (value type = {@code int}, default enabled).
            """
        ),
        "MEMPOOL_ATTR_RELEASE_THRESHOLD".enum(
            """
            Amount of reserved memory in bytes to hold onto before trying to release memory back to the OS.

            When more than the release threshold bytes of memory are held by the memory pool, the allocator will try to release memory back to the OS on the
            next call to stream, event or context synchronize.

            (value type = {@code cuuint64_t}, default 0)
            """
        ),
        "MEMPOOL_ATTR_RESERVED_MEM_CURRENT".enum("Amount of backing memory currently allocated for the mempool. (value type = {@code cuuint64_t})"),
        "MEMPOOL_ATTR_RESERVED_MEM_HIGH".enum(
            """
            High watermark of backing memory allocated for the {@code mempool} since the last time it was reset. High watermark can only be reset to zero.

            (value type = {@code cuuint64_t})
            """
        ),
        "MEMPOOL_ATTR_USED_MEM_CURRENT".enum("Amount of memory from the pool that is currently in use by the application (value type = {@code cuuint64_t})."),
        "MEMPOOL_ATTR_USED_MEM_HIGH".enum(
            """
            High watermark of the amount of memory from the pool that was in use by the application since the last time it was reset. High watermark can only
            be reset to zero.

            (value type = {@code cuuint64_t})
            """
        )
    )

    EnumConstant(
        "{@code CUgraphMem_attribute}",

        "GRAPH_MEM_ATTR_USED_MEM_CURRENT".enum("(value type = cuuint64_t) Amount of memory, in bytes, currently associated with graphs", "0"),
        "GRAPH_MEM_ATTR_USED_MEM_HIGH".enum(
            """
            High watermark of memory, in bytes, associated with graphs since the last time it was reset. High watermark can only be reset to zero.

            (value type = {@code cuuint64_t}) 
            """
        ),
        "GRAPH_MEM_ATTR_RESERVED_MEM_CURRENT".enum(
            "Amount of memory, in bytes, currently allocated for use by the CUDA graphs asynchronous allocator. (value type = {@code cuuint64_t})"
        ),
        "GRAPH_MEM_ATTR_RESERVED_MEM_HIGH".enum(
            "High watermark of memory, in bytes, currently allocated for use by the CUDA graphs asynchronous allocator. (value type = {@code cuuint64_t})"
        )
    )

    EnumConstant(
        "",

        "CUDA_COOPERATIVE_LAUNCH_MULTI_DEVICE_NO_PRE_LAUNCH_SYNC".enum(
            """
            If set, each kernel launched as part of #LaunchCooperativeKernelMultiDevice() only waits for prior work in the stream corresponding to that GPU to
            complete before the kernel begins execution.
            """,
            0x01
        ),
        "CUDA_COOPERATIVE_LAUNCH_MULTI_DEVICE_NO_POST_LAUNCH_SYNC".enum(
            """
            If set, any subsequent work pushed in a stream that participated in a call to #LaunchCooperativeKernelMultiDevice() will only wait for the kernel
            launched on the GPU corresponding to that stream to complete before it begins execution.
            """,
            0x02
        )
    )

    EnumConstant(
        "",

        "CUDA_ARRAY3D_LAYERED".enum(
            """
            If set, the CUDA array is a collection of layers, where each layer is either a 1D or a 2D array and the Depth member of ##CUDA_ARRAY3D_DESCRIPTOR
            specifies the number of layers, not the depth of a 3D array.
            """,
            "0x01"
        ),
        "CUDA_ARRAY3D_2DARRAY".enum("Deprecated, use #CUDA_ARRAY3D_LAYERED.", "0x01"),
        "CUDA_ARRAY3D_SURFACE_LDST".enum("This flag must be set in order to bind a surface reference to the CUDA array.", "0x02"),
        "CUDA_ARRAY3D_CUBEMAP".enum(
            """
            If set, the CUDA array is a collection of six 2D arrays, representing faces of a cube. The width of such a CUDA array must be equal to its height,
            and Depth must be six. If #CUDA_ARRAY3D_LAYERED flag is also set, then the CUDA array is a collection of cubemaps and Depth must be a multiple of
            six.
            """,
            "0x04"
        ),
        "CUDA_ARRAY3D_TEXTURE_GATHER".enum("This flag must be set in order to perform texture gather operations on a CUDA array.", "0x08"),
        "CUDA_ARRAY3D_DEPTH_TEXTURE".enum("This flag if set indicates that the CUDA array is a DEPTH_TEXTURE.", "0x10"),
        "CUDA_ARRAY3D_COLOR_ATTACHMENT".enum("This flag indicates that the CUDA array may be bound as a color target in an external graphics API.", "0x20"),
        "CUDA_ARRAY3D_SPARSE".enum(
            "This flag if set indicates that the CUDA array or CUDA mipmapped array is a sparse CUDA array or CUDA mipmapped array respectively",
            "0x40"
        )
    ).noPrefix()

    EnumConstant(
        "Flag for #TexRefSetArray().",

        "TRSA_OVERRIDE_FORMAT".enum("Override the {@code texref} format with a format inferred from the array.", 0x01)
    )

    EnumConstant(
        "Flag for #TexRefSetFlags().",

        "TRSF_READ_AS_INTEGER".enum("Read the texture as integers rather than promoting the values to floats in the range {@code [0,1]}.", "0x01"),
        "TRSF_NORMALIZED_COORDINATES".enum("Use normalized texture coordinates in the range {@code [0,1)} instead of {@code [0,dim)}.", "0x02"),
        "TRSF_SRGB".enum("Perform {@code sRGB->linear} conversion during texture read.", "0x10"),
        "TRSF_DISABLE_TRILINEAR_OPTIMIZATION".enum("Disable any trilinear filtering optimizations.", "0x20")
    )

    LongConstant(
        "End of array terminator for the {@code extra} parameter to #LaunchKernel().",

        "LAUNCH_PARAM_END"..0x00L
    )

    LongConstant(
        """
        Indicator that the next value in the {@code extra} parameter to #LaunchKernel() will be a pointer to a buffer containing all kernel parameters used for
        launching kernel {@code f}.

        This buffer needs to honor all alignment/padding requirements of the individual parameters. If #LAUNCH_PARAM_BUFFER_SIZE is not also specified in the
        {@code extra} array, then #LAUNCH_PARAM_BUFFER_POINTER will have no effect.
        """,

        "LAUNCH_PARAM_BUFFER_POINTER"..0x01L
    )

    LongConstant(
        """
        Indicator that the next value in the {@code extra} parameter to #LaunchKernel() will be a pointer to a {@code size_t} which contains the size of the
        buffer specified with #LAUNCH_PARAM_BUFFER_POINTER.

        It is required that {@code CU_LAUNCH_PARAM_BUFFER_POINTER} also be specified in the {@code extra} array if the value associated with
        {@code CU_LAUNCH_PARAM_BUFFER_SIZE} is not zero.
        """,

        "LAUNCH_PARAM_BUFFER_SIZE"..0x02L
    )

    IntConstant(
        "For texture references loaded into the module, use default texunit from texture reference.",

        "PARAM_TR_DEFAULT".."-1"
    )

    IntConstant("Device that represents the CPU.", "DEVICE_CPU".."-1")
    IntConstant("Device that represents an invalid device.", "DEVICE_INVALID".."-2")

    EnumConstant(
        "Bitmasks for #DEVICE_ATTRIBUTE_GPU_DIRECT_RDMA_FLUSH_WRITES_OPTIONS. ({@code CUflushGPUDirectRDMAWritesOptions})",

        "FLUSH_GPU_DIRECT_RDMA_WRITES_OPTION_HOST".enum(
            "#FlushGPUDirectRDMAWrites() and its CUDA Runtime API counterpart are supported on the device.",
            "1<<0"
        ),
        "FLUSH_GPU_DIRECT_RDMA_WRITES_OPTION_MEMOPS".enum(
            "The #STREAM_WAIT_VALUE_FLUSH flag and the #STREAM_MEM_OP_FLUSH_REMOTE_WRITES {@code MemOp} are supported on the device.",
            "1<<1"
        )
    )

    EnumConstant(
        "Platform native ordering for GPUDirect RDMA writes. ({@code CUGPUDirectRDMAWritesOrdering})",

        "GPU_DIRECT_RDMA_WRITES_ORDERING_NONE".enum(
            "The device does not natively support ordering of remote writes. #FlushGPUDirectRDMAWrites() can be leveraged if supported.",
            "0"
        ),
        "GPU_DIRECT_RDMA_WRITES_ORDERING_OWNER".enum(
            "Natively, the device can consistently consume remote writes, although other CUDA devices may not.",
            "100"
        ),
        "GPU_DIRECT_RDMA_WRITES_ORDERING_ALL_DEVICES".enum("Any CUDA device in the system can consistently consume remote writes to this device.", "200")
    )

    EnumConstant(
        "The scopes for #FlushGPUDirectRDMAWrites() ({@code CUflushGPUDirectRDMAWritesScope})",

        "FLUSH_GPU_DIRECT_RDMA_WRITES_TO_OWNER".enum("Blocks until remote writes are visible to the CUDA device context owning the data.", "100"),
        "FLUSH_GPU_DIRECT_RDMA_WRITES_TO_ALL_DEVICES".enum("Blocks until remote writes are visible to all CUDA device contexts.", "200")
    )

    EnumConstant(
        "The targets for #FlushGPUDirectRDMAWrites() ({@code CUflushGPUDirectRDMAWritesTarget})",

        "FLUSH_GPU_DIRECT_RDMA_WRITES_TARGET_CURRENT_CTX".enum(
            "Sets the target for {@code cuFlushGPUDirectRDMAWrites()} to the currently active CUDA device context.",
            "0"
        )
    )

    EnumConstant(
        "The additional write options for #GraphDebugDotPrint() ({@code CUgraphDebugDot_flags})",

        "GRAPH_DEBUG_DOT_FLAGS_VERBOSE".enum("", "1<<0"),
        "GRAPH_DEBUG_DOT_FLAGS_RUNTIME_TYPES".enum("Output all debug data as if every debug flag is enabled", "1<<1"),
        "GRAPH_DEBUG_DOT_FLAGS_KERNEL_NODE_PARAMS".enum("Use CUDA Runtime structures for output", "1<<2"),
        "GRAPH_DEBUG_DOT_FLAGS_MEMCPY_NODE_PARAMS".enum("Adds ##CUDA_KERNEL_NODE_PARAMS values to output", "1<<3"),
        "GRAPH_DEBUG_DOT_FLAGS_MEMSET_NODE_PARAMS".enum("Adds ##CUDA_MEMCPY3D values to output", "1<<4"),
        "GRAPH_DEBUG_DOT_FLAGS_HOST_NODE_PARAMS".enum("Adds ##CUDA_MEMSET_NODE_PARAMS values to output", "1<<5"),
        "GRAPH_DEBUG_DOT_FLAGS_EVENT_NODE_PARAMS".enum("Adds ##CUDA_HOST_NODE_PARAMS values to output", "1<<6"),
        "GRAPH_DEBUG_DOT_FLAGS_EXT_SEMAS_SIGNAL_NODE_PARAMS".enum("Adds {@code CUevent} handle from record and wait nodes to output", "1<<7"),
        "GRAPH_DEBUG_DOT_FLAGS_EXT_SEMAS_WAIT_NODE_PARAMS".enum("Adds ##CUDA_EXT_SEM_SIGNAL_NODE_PARAMS values to output", "1<<8"),
        "GRAPH_DEBUG_DOT_FLAGS_KERNEL_NODE_ATTRIBUTES".enum("Adds ##CUDA_EXT_SEM_WAIT_NODE_PARAMS values to output", "1<<9"),
        "GRAPH_DEBUG_DOT_FLAGS_HANDLES".enum("Adds {@code CUkernelNodeAttrValue} values to output", "1<<10"),
        "GRAPH_DEBUG_DOT_FLAGS_MEM_ALLOC_NODE_PARAMS".enum("Adds node handles and every kernel function handle to output", "1<<11"),
        "GRAPH_DEBUG_DOT_FLAGS_MEM_FREE_NODE_PARAMS".enum("Adds memory alloc node parameters to output", "1<<12")
    )

    EnumConstant(
        "Flags for user objects for graphs. ({@code CUuserObject_flags})",

        "USER_OBJECT_NO_DESTRUCTOR_SYNC".enum("Indicates the destructor execution is not synchronized by any CUDA handle.", "1")
    )

    EnumConstant(
        "Flags for retaining user object references for graphs. ({@code CUuserObjectRetain_flags})",

        "GRAPH_USER_OBJECT_MOVE".enum("Transfer references from the caller rather than creating new references.", "1")
    )

    EnumConstant(
        "Flags for instantiating a graph. ({@code CUgraphInstantiate_flags})",

        "CUDA_GRAPH_INSTANTIATE_FLAG_AUTO_FREE_ON_LAUNCH".enum("Automatically free memory allocated in a graph before relaunching.", "1")
    ).noPrefix()

    CUresult(
        "GetErrorString",
        """
        Gets the string description of an error code.

        Sets {@code *pStr} to the address of a NULL-terminated string description of the error code {@code error}. If the error code is not recognized,
        #CUDA_ERROR_INVALID_VALUE will be returned and {@code *pStr} will be set to the #NULL address.
        """,

        CUresult("error", "error code to convert to string"),
        Check(1)..charASCII.const.p.p("pStr", "address of the string pointer")
    )

    CUresult(
        "GetErrorName",
        """
        Gets the string representation of an error code enum name.

        Sets {@code *pStr} to the address of a NULL-terminated string representation of the name of the enum error code {@code error}. If the error code is not
        recognized, #CUDA_ERROR_INVALID_VALUE will be returned and {@code *pStr} will be set to the #NULL address.
        """,

        CUresult("error", "error code to convert to string"),
        Check(1)..charASCII.const.p.p("pStr", "address of the string pointer")
    )

    CUresult(
        "Init",
        """
        Initialize the CUDA driver API.

        Initializes the driver API and must be called before any other function from the driver API. Currently, the {@code Flags} parameter must be 0. If
        {@code cuInit()} has not been called, any function from the driver API will return #CUDA_ERROR_NOT_INITIALIZED.
        """,

        unsigned_int("Flags", "initialization flag for CUDA")
    )

    CUresult(
        "DriverGetVersion",
        """
        Returns the latest CUDA version supported by driver.

        Returns in {@code *driverVersion} the version of CUDA supported by the driver. The version is returned as ({@code 1000 × major + 10 × minor}). For
        example, CUDA 9.2 would be represented by 9020.

        This function automatically returns #CUDA_ERROR_INVALID_VALUE if {@code driverVersion} is #NULL.
        """,

        Check(1)..int.p("driverVersion", "returns the CUDA driver version")
    )

    CUresult(
        "DeviceGet",
        """
        Returns a handle to a compute device.

        Returns in {@code *device} a device handle given an ordinal in the range {@code [0, cuDeviceGetCount()-1]}.
        """,

        Check(1)..CUdevice.p("device", "returned device handle"),
        int("ordinal", "device number to get handle for")
    )

    CUresult(
        "DeviceGetCount",
        """
        Returns the number of compute-capable devices.

        Returns in {@code *count} the number of devices with compute capability greater than or equal to 2.0 that are available for execution. If there is no
        such device, {@code cuDeviceGetCount()} returns 0.
        """,

        Check(1)..int.p("count", "returned number of compute-capable devices")
    )

    CUresult(
        "DeviceGetName",
        """
        Returns an identifer string for the device.

        Returns an ASCII string identifying the device {@code dev} in the NULL-terminated string pointed to by {@code name}. {@code len} specifies the maximum
        length of the string that may be returned.
        """,

        charASCII.p("name", "returned identifier string for the device"),
        AutoSize("name")..int("len", "maximum length of string to store in {@code name}"),
        CUdevice("dev", "device to get identifier string for")
    )

    IgnoreMissing..CUresult(
        "DeviceGetUuid",
        """
        Return an UUID for the device.

        Note there is a later version of this API, #DeviceGetUuid_v2(). It will supplant this version in 12.0, which is retained for minor version.
        compatibility.

        Returns 16-octets identifing the device {@code dev} in the structure pointed by the {@code uuid}.
        """,

        CUuuid.p("uuid", "returned UUID"),
        CUdevice("dev", "device to get identifier string for")
    )

    IgnoreMissing..CUresult(
        "DeviceGetUuid_v2",
        """
        Return an UUID for the device (11.4+).

        Returns 16-octets identifing the device {@code dev} in the structure pointed by the {@code uuid}. If the device is in MIG mode, returns its MIG UUID
        which uniquely identifies the subscribed MIG compute instance.
        """,

        CUuuid.p("uuid", "returned UUID"),
        CUdevice("dev", "device to get identifier string for")
    )

    IgnoreMissing..CUresult(
        "DeviceGetLuid",
        """
        Return an LUID and device node mask for the device

        Return identifying information ({@code luid} and {@code deviceNodeMask}) to allow matching device with graphics APIs.
        """,

        Unsafe..char.p("luid", "returned LUID"),
        Check(1)..unsigned_int.p("deviceNodeMask", "returned device node mask"),
        CUdevice("dev", "device to get identifier string for")
    )

    CUresult(
        "DeviceTotalMem",
        """
        Returns the total amount of memory on the device

        Returns in {@code *bytes} the total amount of memory available on the device {@code dev} in bytes.
        """,

        Check(1)..size_t.p("bytes", "returned memory available on device in bytes"),
        CUdevice("dev", "device handle")
    ).versioned()

    IgnoreMissing..CUresult(
        "DeviceGetTexture1DLinearMaxWidth",
        """
        Returns the maximum number of elements allocatable in a 1D linear texture for a given texture element size.

        Returns in {@code maxWidthInElements} the maximum number of texture elements allocatable in a 1D linear texture for given {@code format} and {@code
        numChannels}.
        """,

        Check(1)..size_t.p("maxWidthInElements", "returned maximum number of texture elements allocatable for given {@code format} and {@code numChannels}"),
        CUarray_format("format", "texture format"),
        unsigned_int("numChannels", "number of channels per texture element"),
        CUdevice("dev", "device handle")
    )

    CUresult(
        "DeviceGetAttribute",
        """
        Returns information about the device.

        Returns in {@code *pi} the integer value of the attribute {@code attrib} on device {@code dev}. The supported attributes are:
        """,

        Check(1)..int.p("pi", "returned device attribute value"),
        CUdevice_attribute("attrib", "device attribute to query"),
        CUdevice("dev", "device handle")
    )

    IgnoreMissing..CUresult(
        "DeviceGetNvSciSyncAttributes",
        """
        Return {@code NvSciSync} attributes that this device can support.

        Returns in {@code nvSciSyncAttrList}, the properties of {@code NvSciSync} that this CUDA device, {@code dev} can support. The returned {@code
        nvSciSyncAttrList} can be used to create an {@code NvSciSync} object that matches this device's capabilities.

        If {@code NvSciSyncAttrKey_RequiredPerm} field in {@code nvSciSyncAttrList} is already set this API will return #CUDA_ERROR_INVALID_VALUE.

        The applications should set {@code nvSciSyncAttrList} to a valid {@code NvSciSyncAttrList} failing which this API will return
        #CUDA_ERROR_INVALID_HANDLE.

        The {@code flags} controls how applications intends to use the {@code NvSciSync} created from the {@code nvSciSyncAttrList}. The valid flags are:
        ${ul(
            "#CUDA_NVSCISYNC_ATTR_SIGNAL, specifies that the applications intends to signal an {@code NvSciSync} on this CUDA device.",
            "#CUDA_NVSCISYNC_ATTR_WAIT, specifies that the applications intends to wait on an {@code NvSciSync} on this CUDA device."
        )}

        At least one of these flags must be set, failing which the API returns #CUDA_ERROR_INVALID_VALUE. Both the flags are orthogonal to one another: a
        developer may set both these flags that allows to set both wait and signal specific attributes in the same {@code nvSciSyncAttrList}.
        """,

        Unsafe..void.p("nvSciSyncAttrList", "return NvSciSync attributes supported"),
        CUdevice("dev", "valid Cuda Device to get {@code NvSciSync} attributes for"),
        int("flags", "flags describing {@code NvSciSync} usage")
    )

    IgnoreMissing..CUresult(
        "DeviceSetMemPool",
        """
        Sets the current memory pool of a device

        The memory pool must be local to the specified device. #MemAllocAsync() allocates from the current mempool of the provided stream's device. By default,
        a device's current memory pool is its default memory pool.

        ${note("""Use #MemAllocFromPoolAsync() to specify asynchronous allocations from a device different than the one the stream runs on.""")}
        """,

        CUdevice("dev", ""),
        CUmemoryPool("pool", "")
    )

    IgnoreMissing..CUresult(
        "DeviceGetMemPool",
        """
        Gets the current mempool for a device.

        Returns the last pool provided to #DeviceSetMemPool() for this device or the device's default memory pool if #DeviceSetMemPool() has never been called.
        By default the current mempool is the default mempool for a device. Otherwise the returned pool must have been set with #DeviceSetMemPool().
        """,

        Check(1)..CUmemoryPool.p("pool", ""),
        CUdevice("dev", "")
    )

    IgnoreMissing..CUresult(
        "DeviceGetDefaultMemPool",
        """
        Returns the default mempool of a device.

        The default mempool of a device contains device memory from that device.
        """,

        Check(1)..CUmemoryPool.p("pool_out", ""),
        CUdevice("dev", "")
    )

    IgnoreMissing..CUresult(
        "FlushGPUDirectRDMAWrites",
        """
        Blocks until remote writes are visible to the specified scope.

        Blocks until GPUDirect RDMA writes to the target context via mappings created through APIs like nvidia_p2p_get_pages (see
        ${url("https://docs.nvidia.com/cuda/gpudirect-rdma")} for more information), are visible to the specified scope.

        If the scope equals or lies within the scope indicated by #DEVICE_ATTRIBUTE_GPU_DIRECT_RDMA_WRITES_ORDERING, the call will be a no-op and can be safely
        omitted for performance. This can be determined by comparing the numerical values between the two enums, with smaller scopes having smaller values.

        Users may query support for this API via #DEVICE_ATTRIBUTE_GPU_DIRECT_RDMA_FLUSH_WRITES_OPTIONS.
        """,

        CUflushGPUDirectRDMAWritesTarget("target", "the target of the operation, see {@code CUflushGPUDirectRDMAWritesTarget}"),
        CUflushGPUDirectRDMAWritesScope("scope", "the scope of the operation, see {@code CUflushGPUDirectRDMAWritesScope}")
    )

    CUresult(
        "DeviceGetProperties",
        """
        Returns properties for a selected device.

        Deprecated: This function was deprecated as of CUDA 5.0 and replaced by #DeviceGetAttribute().

        Returns in {@code *prop} the properties of device {@code dev}.
        """,

        CUdevprop.p("prop", "returned properties of device"),
        CUdevice("dev", "device to get properties for")
    )

    CUresult(
        "DeviceComputeCapability",
        """
        Returns the compute capability of the device.

        Deprecated: This function was deprecated as of CUDA 5.0 and its functionality superceded by #DeviceGetAttribute().

        Returns in {@code *major} and {@code *minor} the major and minor revision numbers that define the compute capability of the device {@code dev}.
        """,

        Check(1)..int.p("major", "major revision number"),
        Check(1)..int.p("minor", "minor revision number"),
        CUdevice("dev", "device handle")
    )

    IgnoreMissing..CUresult(
        "DevicePrimaryCtxRetain",
        """
        Retain the primary context on the GPU.

        Retains the primary context on the device. Once the user successfully retains the primary context, the primary context will be active and available to
        the user until the user releases it with #DevicePrimaryCtxRelease() or resets it with #DevicePrimaryCtxReset(). Unlike #CtxCreate() the newly retained
        context is not pushed onto the stack.

        Retaining the primary context for the first time will fail with #CUDA_ERROR_UNKNOWN if the compute mode of the device is #COMPUTEMODE_PROHIBITED. The
        function #DeviceGetAttribute() can be used with #DEVICE_ATTRIBUTE_COMPUTE_MODE to determine the compute mode of the device. The <i>nvidia-smi</i> tool
        can be used to set the compute mode for devices. Documentation for <i>nvidia-smi</i> can be obtained by passing a -h option to it.

        Please note that the primary context always supports pinned allocations. Other flags can be specified by #DevicePrimaryCtxSetFlags().
        """,

        Check(1)..CUcontext.p("pctx", "returned context handle of the new context"),
        CUdevice("dev", "device for which primary context is requested")
    )

    IgnoreMissing..CUresult(
        "DevicePrimaryCtxRelease",
        """
        Release the primary context on the GPU.

        Releases the primary context interop on the device. A retained context should always be released once the user is done using it. The context is
        automatically reset once the last reference to it is released. This behavior is different when the primary context was retained by the CUDA runtime
        from CUDA 4.0 and earlier. In this case, the primary context remains always active.

        Releasing a primary context that has not been previously retained will fail with #CUDA_ERROR_INVALID_CONTEXT.

        Please note that unlike #CtxDestroy() this method does not pop the context from stack in any circumstances.
        """,

        CUdevice("dev", "device which primary context is released")
    ).versioned()

    IgnoreMissing..CUresult(
        "DevicePrimaryCtxSetFlags",
        """
        Set flags for the primary context.

        Sets the flags for the primary context on the device overwriting perviously set ones.

        The three LSBs of the {@code flags} parameter can be used to control how the OS thread, which owns the CUDA context at the time of an API call,
        interacts with the OS scheduler when waiting for results from the GPU. Only one of the scheduling flags can be set when creating a context:
        ${ul(
            """
            #CTX_SCHED_SPIN: Instruct CUDA to actively spin when waiting for results from the GPU. This can decrease latency when waiting for the GPU, but
            may lower the performance of CPU threads if they are performing work in parallel with the CUDA thread.
            """,
            """
            #CTX_SCHED_YIELD: Instruct CUDA to yield its thread when waiting for results from the GPU. This can increase latency when waiting for the GPU,
            but can increase the performance of CPU threads performing work in parallel with the GPU.
            """,
            "#CTX_SCHED_BLOCKING_SYNC: Instruct CUDA to block the CPU thread on a synchronization primitive when waiting for the GPU to finish work.",
            """
            #CTX_BLOCKING_SYNC: Instruct CUDA to block the CPU thread on a synchronization primitive when waiting for the GPU to finish work.

            <b> Deprecated:</b> This flag was deprecated as of CUDA 4.0 and was replaced with #CTX_SCHED_BLOCKING_SYNC.
            """,
            """
            #CTX_SCHED_AUTO: The default value if the {@code flags} parameter is zero, uses a heuristic based on the number of active CUDA contexts in the
            process <em>C</em> and the number of logical processors in the system <em>P</em>. If <em>C</em> &gt; <em>P</em>, then CUDA will yield to other OS
            threads when waiting for the GPU (#CTX_SCHED_YIELD), otherwise CUDA will not yield while waiting for results and actively spin on the processor
            (#CTX_SCHED_SPIN). Additionally, on Tegra devices, #CTX_SCHED_AUTO uses a heuristic based on the power profile of the platform and may choose
            #CTX_SCHED_BLOCKING_SYNC for low-powered devices.
            """,
            """
            #CTX_LMEM_RESIZE_TO_MAX: Instruct CUDA to not reduce local memory after resizing local memory for a kernel. This can prevent thrashing by local
            memory allocations when launching many kernels with high local memory usage at the cost of potentially increased memory usage.

            <b> Deprecated:</b> This flag is deprecated and the behavior enabled by this flag is now the default and cannot be disabled.
            """
        )}
        """,

        CUdevice("dev", "device for which the primary context flags are set"),
        unsigned_int("flags", "new flags for the device")
    ).versioned()

    IgnoreMissing..CUresult(
        "DevicePrimaryCtxGetState",
        """
        Get the state of the primary context.

        Returns in {@code *flags} the flags for the primary context of {@code dev}, and in {@code *active} whether it is active. See
        #DevicePrimaryCtxSetFlags() for flag values.
        """,

        CUdevice("dev", "device to get primary context flags for"),
        Check(1)..unsigned_int.p("flags", "pointer to store flags"),
        Check(1)..int.p("active", "pointer to store context state; 0 = inactive, 1 = active")
    )

    IgnoreMissing..CUresult(
        "DevicePrimaryCtxReset",
        """
        Destroy all allocations and reset all state on the primary context.

        Explicitly destroys and cleans up all resources associated with the current device in the current process.

        Note that it is responsibility of the calling function to ensure that no other module in the process is using the device any more. For that reason it
        is recommended to use #DevicePrimaryCtxRelease() in most cases. However it is safe for other modules to call {@code cuDevicePrimaryCtxRelease()} even
        after resetting the device. Resetting the primary context does not release it, an application that has retained the primary context should explicitly
        release its usage.
        """,

        CUdevice("dev", "device for which primary context is destroyed")
    ).versioned()

    IgnoreMissing..CUresult(
        "DeviceGetExecAffinitySupport",
        """
        Returns information about the execution affinity support of the device.

        Returns in {@code *pi} whether execution affinity type {@code type} is supported by device {@code dev}. The supported types are:
        ${ul(
            "#EXEC_AFFINITY_TYPE_SM_COUNT: 1 if context with limited SMs is supported by the device, or 0 if not;"
        )}
        """,

        Check(1)..int.p("pi", "1 if the execution affinity type {@code type} is supported by the device, or 0 if not"),
        CUexecAffinityType("type", "execution affinity type to query"),
        CUdevice("dev", "device handle")
    )

    CUresult(
        "CtxCreate",
        """
        Create a CUDA context.

        ${note("""In most cases it is recommended to use #DevicePrimaryCtxRetain().""")}

        Creates a new CUDA context and associates it with the calling thread. The {@code flags} parameter is described below. The context is created with a
        usage count of 1 and the caller of {@code cuCtxCreate()} must call #CtxDestroy() or when done using the context. If a context is already current to the
        thread, it is supplanted by the newly created context and may be restored by a subsequent call to #CtxPopCurrent().

        The three LSBs of the {@code flags} parameter can be used to control how the OS thread, which owns the CUDA context at the time of an API call,
        interacts with the OS scheduler when waiting for results from the GPU. Only one of the scheduling flags can be set when creating a context:
        ${ul(
            """
            #CTX_SCHED_SPIN: Instruct CUDA to actively spin when waiting for results from the GPU. This can decrease latency when waiting for the GPU, but may
            lower the performance of CPU threads if they are performing work in parallel with the CUDA thread.
            """,
            """
            #CTX_SCHED_YIELD: Instruct CUDA to yield its thread when waiting for results from the GPU. This can increase latency when waiting for the GPU, but
            can increase the performance of CPU threads performing work in parallel with the GPU.
            """,
            "#CTX_SCHED_BLOCKING_SYNC: Instruct CUDA to block the CPU thread on a synchronization primitive when waiting for the GPU to finish work.",
            """
            #CTX_BLOCKING_SYNC: Instruct CUDA to block the CPU thread on a synchronization primitive when waiting for the GPU to finish work.

            <b> Deprecated:</b> This flag was deprecated as of CUDA 4.0 and was replaced with #CTX_SCHED_BLOCKING_SYNC.
            """,
            """
            #CTX_SCHED_AUTO: The default value if the {@code flags} parameter is zero, uses a heuristic based on the number of active CUDA contexts in the
            process <em>C</em> and the number of logical processors in the system <em>P</em>. If <em>C</em> &gt; <em>P</em>, then CUDA will yield to other OS
            threads when waiting for the GPU (#CTX_SCHED_YIELD), otherwise CUDA will not yield while waiting for results and actively spin on the processor
            (#CTX_SCHED_SPIN). Additionally, on Tegra devices, #CTX_SCHED_AUTO uses a heuristic based on the power profile of the platform and may choose
            #CTX_SCHED_BLOCKING_SYNC for low-powered devices.
            """,
            """
            #CTX_MAP_HOST: Instruct CUDA to support mapped pinned allocations. This flag must be set in order to allocate pinned host memory that is
            accessible to the GPU.
            """,
            """
            #CTX_LMEM_RESIZE_TO_MAX: Instruct CUDA to not reduce local memory after resizing local memory for a kernel. This can prevent thrashing by local
            memory allocations when launching many kernels with high local memory usage at the cost of potentially increased memory usage.

            <b> Deprecated:</b> This flag is deprecated and the behavior enabled by this flag is now the default and cannot be disabled. Instead, the
            per-thread stack size can be controlled with #CtxSetLimit().
            """
        )}

        Context creation will fail with #CUDA_ERROR_UNKNOWN if the compute mode of the device is #COMPUTEMODE_PROHIBITED. The function #DeviceGetAttribute()
        can be used with #DEVICE_ATTRIBUTE_COMPUTE_MODE to determine the compute mode of the device. The <i>nvidia-smi</i> tool can be used to set the compute
        mode for * devices. Documentation for <i>nvidia-smi</i> can be obtained by passing a -h option to it.
        """,

        Check(1)..CUcontext.p("pctx", "returned context handle of the new context"),
        unsigned_int("flags", "context creation flags"),
        CUdevice("dev", "device to create context on")
    ).versioned()

    IgnoreMissing..CUresult(
        "CtxCreate_v3",
        """
        Create a CUDA context with execution affinity.

        Creates a new CUDA context with execution affinity and associates it with the calling thread. The {@code paramsArray} and {@code flags} parameter are
        described below. The context is created with a usage count of 1 and the caller of #CtxCreate() must call #CtxDestroy() or when done using the
        context. If a context is already current to the thread, it is supplanted by the newly created context and may be restored by a subsequent call to
        #CtxPopCurrent().

        The type and the amount of execution resource the context can use is limited by {@code paramsArray} and {@code numParams}. The {@code paramsArray} is
        an array of {@code CUexecAffinityParam} and the {@code numParams} describes the size of the array. If two {@code CUexecAffinityParam} in the array have
        the same type, the latter execution affinity parameter overrides the former execution affinity parameter. The supported execution affinity types are:
        ${ul(
            """
            #EXEC_AFFINITY_TYPE_SM_COUNT limits the portion of SMs that the context can use. The portion of SMs is specified as the number of SMs via
            ##CUexecAffinitySmCount. This limit will be internally rounded up to the next hardware-supported amount. Hence, it is imperative to query the
            actual execution affinity of the context via #CtxGetExecAffinity()) after context creation. Currently, this attribute is only supported under
            Volta+ MPS.
            """
        )}

        The three LSBs of the {@code flags} parameter can be used to control how the OS thread, which owns the CUDA context at the time of an API call,
        interacts with the OS scheduler when waiting for results from the GPU. Only one of the scheduling flags can be set when creating a context:
        ${ul(
            """
            #CTX_SCHED_SPIN: Instruct CUDA to actively spin when waiting for results from the GPU. This can decrease latency when waiting for the GPU, but may
            lower the performance of CPU threads if they are performing work in parallel with the CUDA thread.
            """,
            """
            #CTX_SCHED_YIELD: Instruct CUDA to yield its thread when waiting for results from the GPU. This can increase latency when waiting for the GPU, but
            can increase the performance of CPU threads performing work in parallel with the GPU.
            """,
            "#CTX_SCHED_BLOCKING_SYNC: Instruct CUDA to block the CPU thread on a synchronization primitive when waiting for the GPU to finish work.",
            """
            #CTX_BLOCKING_SYNC: Instruct CUDA to block the CPU thread on a synchronization primitive when waiting for the GPU to finish work.

            <b> Deprecated:</b> This flag was deprecated as of CUDA 4.0 and was replaced with #CTX_SCHED_BLOCKING_SYNC.
            """,
            """
            #CTX_SCHED_AUTO: The default value if the {@code flags} parameter is zero, uses a heuristic based on the number of active CUDA contexts in the
            process <em>C</em> and the number of logical processors in the system <em>P</em>. If <em>C</em> &gt; <em>P</em>, then CUDA will yield to other OS
            threads when waiting for the GPU (#CTX_SCHED_YIELD), otherwise CUDA will not yield while waiting for results and actively spin on the processor
            (#CTX_SCHED_SPIN). Additionally, on Tegra devices, #CTX_SCHED_AUTO uses a heuristic based on the power profile of the platform and may choose
            #CTX_SCHED_BLOCKING_SYNC for low-powered devices.
            """,
            """
            #CTX_MAP_HOST: Instruct CUDA to support mapped pinned allocations. This flag must be set in order to allocate pinned host memory that is accessible
            to the GPU.
            """,
            """
            #CTX_LMEM_RESIZE_TO_MAX: Instruct CUDA to not reduce local memory after resizing local memory for a kernel. This can prevent thrashing by local
            memory allocations when launching many kernels with high local memory usage at the cost of potentially increased memory usage.

            <b> Deprecated:</b> This flag is deprecated and the behavior enabled by this flag is now the default and cannot be disabled. Instead, the
            per-thread stack size can be controlled with #CtxSetLimit().
            """
        )}

        Context creation will fail with #CUDA_ERROR_UNKNOWN if the compute mode of the device is #COMPUTEMODE_PROHIBITED. The function #DeviceGetAttribute()
        can be used with #DEVICE_ATTRIBUTE_COMPUTE_MODE to determine the compute mode of the device. The <i>nvidia-smi</i> tool can be used to set the compute
        mode for * devices. Documentation for <i>nvidia-smi</i> can be obtained by passing a -h option to it.
        """,

        Check(1)..CUcontext.p("pctx", "returned context handle of the new context"),
        CUexecAffinityParam.p("paramsArray", "execution affinity parameters"),
        AutoSize("paramsArray")..int("numParams", "number of execution affinity parameters"),
        unsigned_int("flags", "context creation flags"),
        CUdevice("dev", "device to create context on")
    )

    IgnoreMissing..CUresult(
        "CtxDestroy",
        """
        Destroy a CUDA context.

        Destroys the CUDA context specified by {@code ctx}. The context {@code ctx} will be destroyed regardless of how many threads it is current to. It is
        the responsibility of the calling function to ensure that no API call issues using {@code ctx} while {@code cuCtxDestroy()} is executing.

        Destroys and cleans up all resources associated with the context. It is the caller's responsibility to ensure that the context or its resources are not
        accessed or passed in subsequent API calls and doing so will result in undefined behavior. These resources include CUDA types such as {@code CUmodule},
        {@code CUfunction}, {@code CUstream}, {@code CUevent}, {@code CUarray}, {@code CUmipmappedArray}, {@code CUtexObject}, {@code CUsurfObject},
        {@code CUtexref}, {@code CUsurfref}, {@code CUgraphicsResource}, {@code CUlinkState}, {@code CUexternalMemory} and {@code CUexternalSemaphore}.

        If {@code ctx} is current to the calling thread then {@code ctx} will also be popped from the current thread's context stack (as though
        #CtxPopCurrent() were called). If {@code ctx} is current to other threads, then {@code ctx} will remain current to those threads, and attempting to
        access {@code ctx} from those threads will result in the error #CUDA_ERROR_CONTEXT_IS_DESTROYED.
        """,

        CUcontext("ctx", "context to destroy")
    ).versioned()

    IgnoreMissing..CUresult(
        "CtxPushCurrent",
        """
        Pushes a context on the current CPU thread.

        Pushes the given context {@code ctx} onto the CPU thread's stack of current contexts. The specified context becomes the CPU thread's current context,
        so all CUDA functions that operate on the current context are affected.

        The previous current context may be made current again by calling #CtxDestroy() or #CtxPopCurrent().
        """,

        CUcontext("ctx", "context to push")
    ).versioned()

    IgnoreMissing..CUresult(
        "CtxPopCurrent",
        """
        Pops the current CUDA context from the current CPU thread.

        Pops the current CUDA context from the CPU thread and passes back the old context handle in {@code *pctx}. That context may then be made current to a
        different CPU thread by calling #CtxPushCurrent().

        If a context was current to the CPU thread before #CtxCreate() or #CtxPushCurrent() was called, this function makes that context current to the CPU
        thread again.
        """,

        Check(1)..CUcontext.p("pctx", "returned new context handle")
    ).versioned()

    IgnoreMissing..CUresult(
        "CtxSetCurrent",
        """
        Binds the specified CUDA context to the calling CPU thread.

        Binds the specified CUDA context to the calling CPU thread. If {@code ctx} is #NULL then the CUDA context previously bound to the calling CPU thread is
        unbound and #CUDA_SUCCESS is returned.

        If there exists a CUDA context stack on the calling CPU thread, this will replace the top of that stack with {@code ctx}. If {@code ctx} is #NULL then
        this will be equivalent to popping the top of the calling CPU thread's CUDA context stack (or a no-op if the calling CPU thread's CUDA context stack is
        empty).
        """,

        CUcontext("ctx", "context to bind to the calling CPU thread")
    )

    IgnoreMissing..CUresult(
        "CtxGetCurrent",
        """
        Returns the CUDA context bound to the calling CPU thread.

        Returns in {@code *pctx} the CUDA context bound to the calling CPU thread. If no context is bound to the calling CPU thread then {@code *pctx} is set
        to #NULL and #CUDA_SUCCESS is returned.
        """,

        Check(1)..CUcontext.p("pctx", "returned context handle")
    )

    CUresult(
        "CtxGetDevice",
        """
        Returns the device ID for the current context.

        Returns in {@code *device} the ordinal of the current context's device.
        """,

        Check(1)..CUdevice.p("device", "returned device ID for the current context")
    )

    IgnoreMissing..CUresult(
        "CtxGetFlags",
        """
        Returns the flags for the current context.

        Returns in {@code *flags} the flags of the current context. See #CtxCreate() for flag values.
        """,

        Check(1)..unsigned_int.p("flags", "pointer to store flags of current context")
    )

    CUresult(
        "CtxSynchronize",
        """
        Block for a context's tasks to complete.

        Blocks until the device has completed all preceding requested tasks. {@code cuCtxSynchronize()} returns an error if one of the preceding tasks failed.
        If the context was created with the #CTX_SCHED_BLOCKING_SYNC flag, the CPU thread will block until the GPU context has finished its work.
        """,

        void()
    )

    CUresult(
        "CtxSetLimit",
        """
        Set resource limits.

        Setting {@code limit} to {@code value} is a request by the application to update the current limit maintained by the context. The driver is free to
        modify the requested value to meet h/w requirements (this could be clamping to minimum or maximum values, rounding up to nearest element size, etc).
        The application can use #CtxGetLimit() to find out exactly what the limit has been set to.

        Setting each {@code CUlimit} has its own specific restrictions, so each is discussed here.
        ${ul(
            """
            #LIMIT_STACK_SIZE controls the stack size in bytes of each GPU thread. The driver automatically increases the per-thread stack size for each kernel
            launch as needed. This size isn't reset back to the original value after each launch. Setting this value will take effect immediately, and if
            necessary, the device will block until all preceding requested tasks are complete.
            """,
            """
            #LIMIT_PRINTF_FIFO_SIZE controls the size in bytes of the FIFO used by the {@code printf()} device system call. Setting #LIMIT_PRINTF_FIFO_SIZE
            must be performed before launching any kernel that uses the {@code printf()} device system call, otherwise #CUDA_ERROR_INVALID_VALUE will be
            returned.
            """,
            """
            #LIMIT_MALLOC_HEAP_SIZE controls the size in bytes of the heap used by the {@code malloc()} and {@code free()} device system calls. Setting
            {@code CU_LIMIT_MALLOC_HEAP_SIZE} must be performed before launching any kernel that uses the {@code malloc()} or {@code free()} device system
            calls, otherwise #CUDA_ERROR_INVALID_VALUE will be returned.
            """,
            """
            #LIMIT_DEV_RUNTIME_SYNC_DEPTH controls the maximum nesting depth of a grid at which a thread can safely call {@code cudaDeviceSynchronize()}.
            Setting this limit must be performed before any launch of a kernel that uses the device runtime and calls {@code cudaDeviceSynchronize()} above the
            default sync depth, two levels of grids. Calls to {@code cudaDeviceSynchronize()} will fail with error code {@code cudaErrorSyncDepthExceeded} if
            the limitation is violated. This limit can be set smaller than the default or up the maximum launch depth of 24. When setting this limit, keep in
            mind that additional levels of sync depth require the driver to reserve large amounts of device memory which can no longer be used for user
            allocations. If these reservations of device memory fail, {@code cuCtxSetLimit()} will return #CUDA_ERROR_OUT_OF_MEMORY, and the limit can be reset
            to a lower value. This limit is only applicable to devices of compute capability 3.5 and higher. Attempting to set this limit on devices of compute
            capability less than 3.5 will result in the error #CUDA_ERROR_UNSUPPORTED_LIMIT being returned.
            """,
            """
            #LIMIT_DEV_RUNTIME_PENDING_LAUNCH_COUNT controls the maximum number of outstanding device runtime launches that can be made from the current
            context. A grid is outstanding from the point of launch up until the grid is known to have been completed. Device runtime launches which violate
            this limitation fail and return {@code cudaErrorLaunchPendingCountExceeded} when {@code cudaGetLastError()} is called after launch. If more pending
            launches than the default (2048 launches) are needed for a module using the device runtime, this limit can be increased. Keep in mind that being
            able to sustain additional pending launches will require the driver to reserve larger amounts of device memory upfront which can no longer be used
            for allocations. If these reservations fail, {@code cuCtxSetLimit()} will return #CUDA_ERROR_OUT_OF_MEMORY, and the limit can be reset to a lower
            value. This limit is only applicable to devices of compute capability 3.5 and higher. Attempting to set this limit on devices of compute capability
            less than 3.5 will result in the error #CUDA_ERROR_UNSUPPORTED_LIMIT being returned.
            """,
            """
            #LIMIT_MAX_L2_FETCH_GRANULARITY controls the L2 cache fetch granularity. Values can range from 0B to 128B. This is purely a performence hint and it
            can be ignored or clamped depending on the platform.
            """,
            """
            #LIMIT_PERSISTING_L2_CACHE_SIZE controls size in bytes availabe for persisting L2 cache. This is purely a performance hint and it can be ignored or
            clamped depending on the platform.
            """
        )}
        """,

        CUlimit("limit", "limit to set"),
        size_t("value", "size of limit")
    )

    CUresult(
        "CtxGetLimit",
        """
        Returns resource limits.

        Returns in {@code *pvalue} the current size of {@code limit}.
        """,

        Check(1)..size_t.p("pvalue", "returned size of limit"),
        CUlimit("limit", "limit to query")
    )

    CUresult(
        "CtxGetCacheConfig",
        """
        Returns the preferred cache configuration for the current context.

        On devices where the L1 cache and shared memory use the same hardware resources, this function returns through {@code pconfig} the preferred cache
        configuration for the current context. This is only a preference. The driver will use the requested configuration if possible, but it is free to choose
        a different configuration if required to execute functions.

        This will return a {@code pconfig} of #FUNC_CACHE_PREFER_NONE on devices where the size of the L1 cache and shared memory are fixed.
        """,

        Check(1)..CUfunc_cache.p("pconfig", "returned cache configuration")
    )

    CUresult(
        "CtxSetCacheConfig",
        """
        Sets the preferred cache configuration for the current context.

        On devices where the L1 cache and shared memory use the same hardware resources, this sets through {@code config} the preferred cache configuration for
        the current context. This is only a preference. The driver will use the requested configuration if possible, but it is free to choose a different
        configuration if required to execute the function. Any function preference set via {@code cuFuncSetCacheConfig()} will be preferred over this
        context-wide setting. Setting the context-wide cache configuration to #FUNC_CACHE_PREFER_NONE will cause subsequent kernel launches to prefer to not
        change the cache configuration unless required to launch the kernel.

        This setting does nothing on devices where the size of the L1 cache and shared memory are fixed.

        Launching a kernel with a different preference than the most recent preference setting may insert a device-side synchronization point.
        """,

        CUfunc_cache("config", "requested cache configuration")
    )

    IgnoreMissing..CUresult(
        "CtxGetSharedMemConfig",
        """
        Returns the current shared memory configuration for the current context.

        This function will return in {@code pConfig} the current size of shared memory banks in the current context. On devices with configurable shared memory
        banks, #CtxSetSharedMemConfig() can be used to change this setting, so that all subsequent kernel launches will by default use the new bank size.
        When {@code cuCtxGetSharedMemConfig} is called on devices without configurable shared memory, it will return the fixed bank size of the hardware.
        """,

        Check(1)..CUsharedconfig.p("pConfig", "returned shared memory configuration")
    )

    IgnoreMissing..CUresult(
        "CtxSetSharedMemConfig",
        """
        Sets the shared memory configuration for the current context.

        On devices with configurable shared memory banks, this function will set the context's shared memory bank size which is used for subsequent kernel
        launches.

        Changed the shared memory configuration between launches may insert a device side synchronization point between those launches.

        Changing the shared memory bank size will not increase shared memory usage or affect occupancy of kernels, but may have major effects on performance.
        Larger bank sizes will allow for greater potential bandwidth to shared memory, but will change what kinds of accesses to shared memory will result in
        bank conflicts.

        This function will do nothing on devices with fixed shared memory bank size.
        """,

        CUsharedconfig("config", "requested shared memory configuration")
    )

    CUresult(
        "CtxGetApiVersion",
        """
        Gets the context's API version.

        Returns a version number in {@code version} corresponding to the capabilities of the context (e.g. 3010 or 3020), which library developers can use to
        direct callers to a specific API version. If {@code ctx} is #NULL, returns the API version used to create the currently bound context.

        Note that new API versions are only introduced when context capabilities are changed that break binary compatibility, so the API version and driver
        version may be different. For example, it is valid for the API version to be 3020 while the driver version is 4020.
        """,

        nullable..CUcontext("ctx", "context to check"),
        Check(1)..unsigned_int.p("version", "pointer to version")
    )

    CUresult(
        "CtxGetStreamPriorityRange",
        """
        Returns numerical values that correspond to the least and greatest stream priorities.

        Returns in {@code *leastPriority} and {@code *greatestPriority} the numerical values that correspond to the least and greatest stream priorities
        respectively. Stream priorities follow a convention where lower numbers imply greater priorities. The range of meaningful stream priorities is given by
        [ {@code *greatestPriority}, {@code *leastPriority]}. If the user attempts to create a stream with a priority value that is outside the meaningful
        range as specified by this API, the priority is automatically clamped down or up to either {@code *leastPriority} or {@code *greatestPriority}
        respectively. See #StreamCreateWithPriority() for details on creating a priority stream. A #NULL may be passed in for {@code *leastPriority} or {@code
        *greatestPriority} if the value is not desired.

        This function will return {@code 0} in both {@code *leastPriority} and {@code *greatestPriority} if the current context's device does not support
        stream priorities (see #DeviceGetAttribute()).
        """,

        Check(1)..nullable..int.p("leastPriority", "pointer to an int in which the numerical value for least stream priority is returned"),
        Check(1)..nullable..int.p("greatestPriority", "pointer to an int in which the numerical value for greatest stream priority is returned")
    )

    IgnoreMissing..CUresult(
        "CtxResetPersistingL2Cache",
        """
        Resets all persisting lines in cache to normal status.

        Takes effect on function return.
        """,

        void()
    )

    IgnoreMissing..CUresult(
        "CtxGetExecAffinity",
        """
        Returns the execution affinity setting for the current context.

        Returns in {@code *pExecAffinity} the current value of {@code type}.
        """,

        Check(1)..CUexecAffinityParam.p("pExecAffinity", "returned execution affinity"),
        CUexecAffinityType("type", "execution affinity type to query")
    )

    CUresult(
        "CtxAttach",
        """
        Increment a context's usage-count.

        Deprecated: Note that this function is deprecated and should not be used.

        Increments the usage count of the context and passes back a context handle in {@code *pctx} that must be passed to #CtxDetach() when the application
        is done with the context. {@code cuCtxAttach()} fails if there is no context current to the thread.

        Currently, the {@code flags} parameter must be 0.
        """,

        Check(1)..CUcontext.p("pctx", "returned context handle of the current context"),
        unsigned_int("flags", "context attach flags (must be 0)")
    )

    CUresult(
        "CtxDetach",
        """
        Decrement a context's usage-count

        Deprecated: Note that this function is deprecated and should not be used.

        Decrements the usage count of the context {@code ctx}, and destroys the context if the usage count goes to 0. The context must be a handle that was
        passed back by #CtxCreate() or #CtxAttach(), and must be current to the calling thread.
        """,

        CUcontext("ctx", "context to destroy")
    )

    CUresult(
        "ModuleLoad",
        """
        Loads a compute module.

        Takes a filename {@code fname} and loads the corresponding module {@code module} into the current context. The CUDA driver API does not attempt to
        lazily allocate the resources needed by a module; if the memory for functions and data (constant and global) needed by the module cannot be allocated,
        {@code cuModuleLoad()} fails. The file should be a <em>cubin</em> file as output by <b>nvcc</b>, or a <em>PTX</em> file either as output by <b>nvcc</b>
        or handwritten, or a <em>fatbin</em> file as output by <b>nvcc</b> from toolchain 4.0 or later.
        """,

        Check(1)..CUmodule.p("module", "returned module"),
        charUTF8.const.p("fname", "filename of module to load")
    )

    CUresult(
        "ModuleLoadData",
        """
        Load a module's data.

        Takes a pointer {@code image} and loads the corresponding module {@code module} into the current context. The pointer may be obtained by mapping a
        <em>cubin</em> or <em>PTX</em> or <em>fatbin</em> file, passing a <em>cubin</em> or <em>PTX</em> or <em>fatbin</em> file as a NULL-terminated text
        string, or incorporating a <em>cubin</em> or <em>fatbin</em> object into the executable resources and using operating system calls such as Windows
        {@code FindResource()} to obtain the pointer.
        """,

        Check(1)..CUmodule.p("module", "returned module"),
        Unsafe..void.const.p("image", "module data to load")
    )

    CUresult(
        "ModuleLoadDataEx",
        """
        Load a module's data with options.

        Takes a pointer {@code image} and loads the corresponding module {@code module} into the current context. The pointer may be obtained by mapping a
        <em>cubin</em> or <em>PTX</em> or <em>fatbin</em> file, passing a <em>cubin</em> or <em>PTX</em> or <em>fatbin</em> file as a NULL-terminated text
        string, or incorporating a <em>cubin</em> or <em>fatbin</em> object into the executable resources and using operating system calls such as Windows
        {@code FindResource()} to obtain the pointer. Options are passed as an array via {@code options} and any corresponding parameters are passed in {@code
        optionValues}. The number of total options is supplied via {@code numOptions}. Any outputs will be returned via {@code optionValues}.
        """,

        Check(1)..CUmodule.p("module", "returned module"),
        Unsafe..void.const.p("image", "module data to load"),
        AutoSize("options", "optionValues")..unsigned_int("numOptions", "number of options"),
        nullable..CUjit_option.p("options", "options for JIT"),
        nullable..void.p.p("optionValues", "option values for JIT")
    )

    CUresult(
        "ModuleLoadFatBinary",
        """
        Load a module's data.

        Takes a pointer {@code fatCubin} and loads the corresponding module {@code module} into the current context. The pointer represents a <i>fat binary</i>
        object, which is a collection of different <em>cubin</em> and/or <em>PTX</em> files, all representing the same device code, but compiled and optimized
        for different architectures.

        Prior to CUDA 4.0, there was no documented API for constructing and using fat binary objects by programmers. Starting with CUDA 4.0, fat binary objects
        can be constructed by providing the <i>-fatbin option</i> to <b>nvcc</b>. More information can be found in the <b>nvcc</b> document.
        """,

        Check(1)..CUmodule.p("module", "returned module"),
        Unsafe..void.const.p("fatCubin", "fat binary to load")
    )

    CUresult(
        "ModuleUnload",
        """
        Unloads a module.

        Unloads a module {@code hmod} from the current context.
        """,

        CUmodule("hmod", "module to unload")
    )

    CUresult(
        "ModuleGetFunction",
        """
        Returns a function handle.

        Returns in {@code *hfunc} the handle of the function of name {@code name} located in module {@code hmod}. If no function of that name exists,
        {@code cuModuleGetFunction()} returns #CUDA_ERROR_NOT_FOUND.
        """,

        Check(1)..CUfunction.p("hfunc", "returned function handle"),
        CUmodule("hmod", "module to retrieve function from"),
        charUTF8.const.p("name", "name of function to retrieve")
    )

    CUresult(
        "ModuleGetGlobal",
        """
        Returns a global pointer from a module.

        Returns in {@code *dptr} and {@code *bytes} the base pointer and size of the global of name {@code name} located in module {@code hmod}. If no variable
        of that name exists, {@code cuModuleGetGlobal()} returns #CUDA_ERROR_NOT_FOUND. Both parameters {@code dptr} and {@code bytes} are optional. If one of
        them is #NULL, it is ignored.
        """,

        Check(1)..nullable..CUdeviceptr.p("dptr", "returned global device pointer"),
        Check(1)..nullable..size_t.p("bytes", "returned global size in bytes"),
        CUmodule("hmod", "module to retrieve global from"),
        charUTF8.const.p("name", "name of global to retrieve")
    ).versioned()

    CUresult(
        "ModuleGetTexRef",
        """
        Returns a handle to a texture reference.

        Returns in {@code *pTexRef} the handle of the texture reference of name {@code name} in the module {@code hmod}. If no texture reference of that name
        exists, {@code cuModuleGetTexRef()} returns #CUDA_ERROR_NOT_FOUND. This texture reference handle should not be destroyed, since it will be destroyed
        when the module is unloaded.
        """,

        Check(1)..CUtexref.p("pTexRef", "returned texture reference"),
        CUmodule("hmod", "module to retrieve texture reference from"),
        charUTF8.const.p("name", "name of texture reference to retrieve")
    )

    CUresult(
        "ModuleGetSurfRef",
        """
        Returns a handle to a surface reference.

        Returns in {@code *pSurfRef} the handle of the surface reference of name {@code name} in the module {@code hmod}. If no surface reference of that name
        exists, {@code cuModuleGetSurfRef()} returns #CUDA_ERROR_NOT_FOUND.
        """,

        Check(1)..CUsurfref.p("pSurfRef", "returned surface reference"),
        CUmodule("hmod", "module to retrieve surface reference from"),
        charUTF8.const.p("name", "name of surface reference to retrieve")
    )

    IgnoreMissing..CUresult(
        "LinkCreate",
        """
        Creates a pending JIT linker invocation.

        If the call is successful, the caller owns the returned {@code CUlinkState}, which should eventually be destroyed with #LinkDestroy(). The device code
        machine size (32 or 64 bit) will match the calling application.

        Both linker and compiler options may be specified. Compiler options will be applied to inputs to this linker action which must be compiled from PTX.
        The options #JIT_WALL_TIME, #JIT_INFO_LOG_BUFFER_SIZE_BYTES, and #JIT_ERROR_LOG_BUFFER_SIZE_BYTES will accumulate data until the {@code CUlinkState} is
        destroyed.

        {@code optionValues} must remain valid for the life of the {@code CUlinkState} if output options are used. No other references to inputs are maintained
        after this call returns.
        """,

        AutoSize("options", "optionValues")..unsigned_int("numOptions", "size of options arrays"),
        CUjit_option.p("options", "array of linker and compiler options"),
        void.p.p("optionValues", "array of option values, each cast to void *"),
        Check(1)..CUlinkState.p("stateOut", "on success, this will contain a {@code CUlinkState} to specify and complete this action")
    ).versioned()

    IgnoreMissing..CUresult(
        "LinkAddData",
        """
        Add an input to a pending linker invocation.

        Ownership of {@code data} is retained by the caller. No reference is retained to any inputs after this call returns.

        This method accepts only compiler options, which are used if the data must be compiled from PTX, and does not accept any of #JIT_WALL_TIME,
        #JIT_INFO_LOG_BUFFER, #JIT_ERROR_LOG_BUFFER, #JIT_TARGET_FROM_CUCONTEXT, or #JIT_TARGET.
        """,

        CUlinkState("state", "a pending linker action"),
        CUjitInputType("type", "the type of the input data"),
        void.p("data", "the input data.  PTX must be NULL-terminated."),
        AutoSize("data")..size_t("size", "the length of the input data"),
        charUTF8.const.p("name", "an optional name for this input in log messages"),
        AutoSize("options", "optionValues")..unsigned_int("numOptions", "size of options"),
        CUjit_option.p("options", "options to be applied only for this input (overrides options from #LinkCreate())"),
        void.p.p("optionValues", "array of option values, each cast to void *")
    ).versioned()

    IgnoreMissing..CUresult(
        "LinkAddFile",
        """
        Add a file input to a pending linker invocation.

        No reference is retained to any inputs after this call returns.

        This method accepts only compiler options, which are used if the input must be compiled from PTX, and does not accept any of #JIT_WALL_TIME,
        #JIT_INFO_LOG_BUFFER, #JIT_ERROR_LOG_BUFFER, #JIT_TARGET_FROM_CUCONTEXT, or #JIT_TARGET.

        This method is equivalent to invoking #LinkAddData() on the contents of the file.
        """,

        CUlinkState("state", "a pending linker action"),
        CUjitInputType("type", "the type of the input data"),
        charUTF8.const.p("path", "path to the input file"),
        AutoSize("options", "optionValues")..unsigned_int("numOptions", "size of options"),
        CUjit_option.p("options", "options to be applied only for this input (overrides options from #LinkCreate())"),
        void.p.p("optionValues", "array of option values, each cast to void *")
    ).versioned()

    IgnoreMissing..CUresult(
        "LinkComplete",
        """
        Complete a pending linker invocation.

        Completes the pending linker action and returns the cubin image for the linked device code, which can be used with #ModuleLoadData(). The cubin is
        owned by {@code state}, so it should be loaded before {@code state} is destroyed via #LinkDestroy(). This call does not destroy {@code state}.
        """,

        CUlinkState("state", "a pending linker invocation"),
        Check(1)..void.p.p("cubinOut", "on success, this will point to the output image"),
        Check(1)..size_t.p("sizeOut", "optional parameter to receive the size of the generated image")
    )

    IgnoreMissing..CUresult(
        "LinkDestroy",
        "Destroys state for a JIT linker invocation.",

        CUlinkState("state", "state object for the linker invocation")
    )

    CUresult(
        "MemGetInfo",
        """
        Gets free and total memory.

        Returns in {@code *total} the total amount of memory available to the the current context. Returns in {@code *free} the amount of memory on the device
        that is free according to the OS. CUDA is not guaranteed to be able to allocate all of the memory that the OS reports as free.
        """,

        Check(1)..size_t.p("free", "returned free memory in bytes"),
        Check(1)..size_t.p("total", "returned total memory in bytes")
    ).versioned()

    CUresult(
        "MemAlloc",
        """
        Allocates device memory.

        Allocates {@code bytesize} bytes of linear memory on the device and returns in {@code *dptr} a pointer to the allocated memory. The allocated memory is
        suitably aligned for any kind of variable. The memory is not cleared. If {@code bytesize} is 0, {@code cuMemAlloc()} returns #CUDA_ERROR_INVALID_VALUE.
        """,

        Check(1)..CUdeviceptr.p("dptr", "returned device pointer"),
        size_t("bytesize", "requested allocation size in bytes")
    ).versioned()

    CUresult(
        "MemAllocPitch",
        """
        Allocates pitched device memory.

        Allocates at least {@code WidthInBytes} * {@code Height} bytes of linear memory on the device and returns in {@code *dptr} a pointer to the allocated
        memory. The function may pad the allocation to ensure that corresponding pointers in any given row will continue to meet the alignment requirements for
        coalescing as the address is updated from row to row. {@code ElementSizeBytes} specifies the size of the largest reads and writes that will be
        performed on the memory range. {@code ElementSizeBytes} may be 4, 8 or 16 (since coalesced memory transactions are not possible on other data sizes).
        If {@code ElementSizeBytes} is smaller than the actual read/write size of a kernel, the kernel will run correctly, but possibly at reduced speed. The
        pitch returned in {@code *pPitch} by {@code cuMemAllocPitch()} is the width in bytes of the allocation. The intended usage of pitch is as a separate
        parameter of the allocation, used to compute addresses within the 2D array. Given the row and column of an array element of type <b>T</b>, the address
        is computed as:
        ${codeBlock("""
   T* pElement = (T*)((char*)BaseAddress + Row * Pitch) + Column;""")}

        The pitch returned by {@code cuMemAllocPitch()} is guaranteed to work with #Memcpy2D() under all circumstances. For allocations of 2D arrays, it is
        recommended that programmers consider performing pitch allocations using {@code cuMemAllocPitch()}. Due to alignment restrictions in the hardware, this
        is especially true if the application will be performing 2D memory copies between different regions of device memory (whether linear memory or CUDA
        arrays).

        The byte alignment of the pitch returned by {@code cuMemAllocPitch()} is guaranteed to match or exceed the alignment requirement for texture binding
        with #TexRefSetAddress2D().
        """,

        Check(1)..CUdeviceptr.p("dptr", "returned device pointer"),
        Check(1)..size_t.p("pPitch", "returned pitch of allocation in bytes"),
        size_t("WidthInBytes", "requested allocation width in bytes"),
        size_t("Height", "requested allocation height in rows"),
        unsigned_int("ElementSizeBytes", "size of largest reads/writes for range")
    ).versioned()

    CUresult(
        "MemFree",
        """
        Frees device memory.

        Frees the memory space pointed to by {@code dptr}, which must have been returned by a previous call to #MemAlloc() or #MemAllocPitch().
        """,

        CUdeviceptr("dptr", "pointer to memory to free")
    ).versioned()

    CUresult(
        "MemGetAddressRange",
        """
        Get information on memory allocations.

        Returns the base address in {@code *pbase} and size in {@code *psize} of the allocation by #MemAlloc() or #MemAllocPitch() that contains the input
        pointer {@code dptr}. Both parameters {@code pbase} and {@code psize} are optional. If one of them is #NULL, it is ignored.
        """,

        Check(1)..nullable..CUdeviceptr.p("pbase", "returned base address"),
        Check(1)..nullable..size_t.p("psize", "returned size of device memory allocation"),
        CUdeviceptr("dptr", "device pointer to query")
    ).versioned()

    CUresult(
        "MemAllocHost",
        """
        Allocates page-locked host memory.

        Allocates {@code bytesize} bytes of host memory that is page-locked and accessible to the device. The driver tracks the virtual memory ranges allocated
        with this function and automatically accelerates calls to functions such as #Memcpy(). Since the memory can be accessed directly by the device, it can
        be read or written with much higher bandwidth than pageable memory obtained with functions such as {@code malloc()}. Allocating excessive amounts of
        memory with {@code cuMemAllocHost()} may degrade system performance, since it reduces the amount of memory available to the system for paging. As a
        result, this function is best used sparingly to allocate staging areas for data exchange between host and device.

        Note all host memory allocated using {@code cuMemHostAlloc()} will automatically be immediately accessible to all contexts on all devices which support
        unified addressing (as may be queried using #DEVICE_ATTRIBUTE_UNIFIED_ADDRESSING). The device pointer that may be used to access this host memory from
        those contexts is always equal to the returned host pointer {@code *pp}. See {@code CUDA_UNIFIED} for additional details.
        """,

        Check(1)..void.p.p("pp", "returned host pointer to page-locked memory"),
        size_t("bytesize", "requested allocation size in bytes")
    ).versioned()

    CUresult(
        "MemFreeHost",
        """
        Frees page-locked host memory.

        Frees the memory space pointed to by {@code p}, which must have been returned by a previous call to #MemAllocHost().
        """,

        Unsafe..void.p("p", "pointer to memory to free")
    )

    CUresult(
        "MemHostAlloc",
        """
        Allocates page-locked host memory.

        Allocates {@code bytesize} bytes of host memory that is page-locked and accessible to the device. The driver tracks the virtual memory ranges allocated
        with this function and automatically accelerates calls to functions such as #MemcpyHtoD(). Since the memory can be accessed directly by the device,
        it can be read or written with much higher bandwidth than pageable memory obtained with functions such as {@code malloc()}. Allocating excessive
        amounts of pinned memory may degrade system performance, since it reduces the amount of memory available to the system for paging. As a result, this
        function is best used sparingly to allocate staging areas for data exchange between host and device.

        The {@code Flags} parameter enables different options to be specified that affect the allocation, as follows:
        ${ul(
            """
            #MEMHOSTALLOC_PORTABLE: The memory returned by this call will be considered as pinned memory by all CUDA contexts, not just the one that performed
            the allocation.
            """,
            """
            #MEMHOSTALLOC_DEVICEMAP: Maps the allocation into the CUDA address space. The device pointer to the memory may be obtained by calling
            #MemHostGetDevicePointer().
            """,
            """
            #MEMHOSTALLOC_WRITECOMBINED: Allocates the memory as write-combined (WC). WC memory can be transferred across the PCI Express bus more quickly on
            some system configurations, but cannot be read efficiently by most CPUs. WC memory is a good option for buffers that will be written by the CPU and
            read by the GPU via mapped pinned memory or host-&gt;device transfers.
            """
        )}

        All of these flags are orthogonal to one another: a developer may allocate memory that is portable, mapped and/or write-combined with no restrictions.

        The #MEMHOSTALLOC_DEVICEMAP flag may be specified on CUDA contexts for devices that do not support mapped pinned memory. The failure is deferred to
        #MemHostGetDevicePointer() because the memory may be mapped into other CUDA contexts via the #MEMHOSTALLOC_PORTABLE flag.

        The memory allocated by this function must be freed with #MemFreeHost().

        Note all host memory allocated using {@code cuMemHostAlloc()} will automatically be immediately accessible to all contexts on all devices which support
        unified addressing (as may be queried using #DEVICE_ATTRIBUTE_UNIFIED_ADDRESSING). Unless the flag #MEMHOSTALLOC_WRITECOMBINED is specified, the device
        pointer that may be used to access this host memory from those contexts is always equal to the returned host pointer {@code *pp}. If the flag
        #MEMHOSTALLOC_WRITECOMBINED is specified, then the function #MemHostGetDevicePointer() must be used to query the device pointer, even if the context
        supports unified addressing. See {@code CUDA_UNIFIED} for additional details.
        """,

        Check(1)..void.p.p("pp", "returned host pointer to page-locked memory"),
        size_t("bytesize", "requested allocation size in bytes"),
        unsigned_int("Flags", "flags for allocation request")
    )

    CUresult(
        "MemHostGetDevicePointer",
        """
        Passes back device pointer of mapped pinned memory.

        Passes back the device pointer {@code pdptr} corresponding to the mapped, pinned host buffer {@code p} allocated by #MemHostAlloc().

        {@code cuMemHostGetDevicePointer()} will fail if the #MEMHOSTALLOC_DEVICEMAP flag was not specified at the time the memory was allocated, or if the
        function is called on a GPU that does not support mapped pinned memory.

        For devices that have a non-zero value for the device attribute #DEVICE_ATTRIBUTE_CAN_USE_HOST_POINTER_FOR_REGISTERED_MEM, the memory can also be
        accessed from the device using the host pointer {@code p}. The device pointer returned by {@code cuMemHostGetDevicePointer()} may or may not match the
        original host pointer {@code p} and depends on the devices visible to the application. If all devices visible to the application have a non-zero value
        for the device attribute, the device pointer returned by {@code cuMemHostGetDevicePointer()} will match the original pointer {@code p}. If any device
        visible to the application has a zero value for the device attribute, the device pointer returned by {@code cuMemHostGetDevicePointer()} will not match
        the original host pointer {@code p}, but it will be suitable for use on all devices provided Unified Virtual Addressing is enabled. In such systems, it
        is valid to access the memory using either pointer on devices that have a non-zero value for the device attribute. Note however that such devices
        should access the memory using only of the two pointers and not both.

        {@code Flags} provides for future releases. For now, it must be set to 0.
        """,

        Check(1)..CUdeviceptr.p("pdptr", "returned device pointer"),
        Unsafe..void.p("p", "host pointer"),
        unsigned_int("Flags", "options (must be 0)")
    ).versioned()

    CUresult(
        "MemHostGetFlags",
        """
        Passes back flags that were used for a pinned allocation

        Passes back the flags {@code pFlags} that were specified when allocating the pinned host buffer {@code p} allocated by #MemHostAlloc().

        {@code cuMemHostGetFlags()} will fail if the pointer does not reside in an allocation performed by #MemAllocHost() or {@code cuMemHostAlloc()}.
        """,

        Check(1)..unsigned_int.p("pFlags", "returned flags word"),
        Unsafe..void.p("p", "host pointer")
    )

    IgnoreMissing..CUresult(
        "MemAllocManaged",
        """
        Allocates memory that will be automatically managed by the Unified Memory system.

        Allocates {@code bytesize} bytes of managed memory on the device and returns in {@code *dptr} a pointer to the allocated memory. If the device doesn't
        support allocating managed memory, #CUDA_ERROR_NOT_SUPPORTED is returned. Support for managed memory can be queried using the device attribute
        #DEVICE_ATTRIBUTE_MANAGED_MEMORY. The allocated memory is suitably aligned for any kind of variable. The memory is not cleared. If {@code bytesize}
        is 0, #MemAllocManaged() returns #CUDA_ERROR_INVALID_VALUE. The pointer is valid on the CPU and on all GPUs in the system that support managed memory.
        All accesses to this pointer must obey the Unified Memory programming model.

        {@code flags} specifies the default stream association for this allocation. {@code flags} must be one of #MEM_ATTACH_GLOBAL or #MEM_ATTACH_HOST. If
        #MEM_ATTACH_GLOBAL is specified, then this memory is accessible from any stream on any device. If #MEM_ATTACH_HOST is specified, then the allocation
        should not be accessed from devices that have a zero value for the device attribute #DEVICE_ATTRIBUTE_CONCURRENT_MANAGED_ACCESS; an explicit call to
        #StreamAttachMemAsync() will be required to enable access on such devices.

        If the association is later changed via #StreamAttachMemAsync() to a single stream, the default association as specifed during #MemAllocManaged() is
        restored when that stream is destroyed. For __managed__ variables, the default association is always #MEM_ATTACH_GLOBAL. Note that destroying a stream
        is an asynchronous operation, and as a result, the change to default association won't happen until all work in the stream has completed.

        Memory allocated with #MemAllocManaged() should be released with #MemFree().

        Device memory oversubscription is possible for GPUs that have a non-zero value for the device attribute #DEVICE_ATTRIBUTE_CONCURRENT_MANAGED_ACCESS.
        Managed memory on such GPUs may be evicted from device memory to host memory at any time by the Unified Memory driver in order to make room for other
        allocations.

        In a multi-GPU system where all GPUs have a non-zero value for the device attribute #DEVICE_ATTRIBUTE_CONCURRENT_MANAGED_ACCESS, managed memory may
        not be populated when this API returns and instead may be populated on access. In such systems, managed memory can migrate to any processor's memory at
        any time. The Unified Memory driver will employ heuristics to maintain data locality and prevent excessive page faults to the extent possible. The
        application can also guide the driver about memory usage patterns via #MemAdvise(). The application can also explicitly migrate memory to a desired
        processor's memory via #MemPrefetchAsync().

        In a multi-GPU system where all of the GPUs have a zero value for the device attribute #DEVICE_ATTRIBUTE_CONCURRENT_MANAGED_ACCESS and all the GPUs
        have peer-to-peer support with each other, the physical storage for managed memory is created on the GPU which is active at the time
        #MemAllocManaged() is called. All other GPUs will reference the data at reduced bandwidth via peer mappings over the PCIe bus. The Unified Memory
        driver does not migrate memory among such GPUs.

        In a multi-GPU system where not all GPUs have peer-to-peer support with each other and where the value of the device attribute
        #DEVICE_ATTRIBUTE_CONCURRENT_MANAGED_ACCESS is zero for at least one of those GPUs, the location chosen for physical storage of managed memory is
        system-dependent.
        ${ul(
            """
            On Linux, the location chosen will be device memory as long as the current set of active contexts are on devices that either have peer-to-peer
            support with each other or have a non-zero value for the device attribute #DEVICE_ATTRIBUTE_CONCURRENT_MANAGED_ACCESS. If there is an active
            context on a GPU that does not have a non-zero value for that device attribute and it does not have peer-to-peer support with the other devices
            that have active contexts on them, then the location for physical storage will be 'zero-copy' or host memory. Note that this means that managed
            memory that is located in device memory is migrated to host memory if a new context is created on a GPU that doesn't have a non-zero value for the
            device attribute and does not support peer-to-peer with at least one of the other devices that has an active context. This in turn implies that
            context creation may fail if there is insufficient host memory to migrate all managed allocations.
            """,
            """
            On Windows, the physical storage is always created in 'zero-copy' or host memory. All GPUs will reference the data at reduced bandwidth over the
            PCIe bus. In these circumstances, use of the environment variable {@code CUDA_VISIBLE_DEVICES} is recommended to restrict CUDA to only use those
            GPUs that have peer-to-peer support. Alternatively, users can also set {@code CUDA_MANAGED_FORCE_DEVICE_ALLOC} to a non-zero value to force the
            driver to always use device memory for physical storage. When this environment variable is set to a non-zero value, all contexts created in that
            process on devices that support managed memory have to be peer-to-peer compatible with each other. Context creation will fail if a context is
            created on a device that supports managed memory and is not peer-to-peer compatible with any of the other managed memory supporting devices on
            which contexts were previously created, even if those contexts have been destroyed. These environment variables are described in the CUDA
            programming guide under the "CUDA environment variables" section.
            """,
            "On ARM, managed memory is not available on discrete gpu with Drive PX-2."
        )}
        """,

        Check(1)..CUdeviceptr.p("dptr", "returned device pointer"),
        size_t("bytesize", "requested allocation size in bytes"),
        unsigned_int("flags", "must be one of #MEM_ATTACH_GLOBAL or #MEM_ATTACH_HOST")
    )

    IgnoreMissing..CUresult(
        "DeviceGetByPCIBusId",
        """
        Returns a handle to a compute device.

        Returns in {@code *device} a device handle given a PCI bus ID string.
        """,

        Check(1)..CUdevice.p("dev", "returned device handle"),
        charASCII.const.p(
            "pciBusId",
            """
            string in one of the following forms: {@code [domain]:[bus]:[device].[function] [domain]:[bus]:[device] [bus]:[device].[function]} where
            {@code domain}, {@code bus}, {@code device}, and {@code function} are all hexadecimal values
            """
        )
    )

    IgnoreMissing..CUresult(
        "DeviceGetPCIBusId",
        """
        Returns a PCI Bus Id string for the device.

        Returns an ASCII string identifying the device {@code dev} in the NULL-terminated string pointed to by {@code pciBusId}. {@code len} specifies the
        maximum length of the string that may be returned.
        """,

        char.p(
            "pciBusId",
            """
            returned identifier string for the device in the following format {@code [domain]:[bus]:[device].[function]} where {@code domain}, {@code bus},
            {@code device}, and {@code function} are all hexadecimal values. {@code pciBusId} should be large enough to store 13 characters including the
            NULL-terminator.
            """
        ),
        AutoSize("pciBusId")..int("len", "maximum length of string to store in {@code name}"),
        CUdevice("dev", "device to get identifier string for")
    )

    IgnoreMissing..CUresult(
        "IpcGetEventHandle",
        """
        Gets an interprocess handle for a previously allocated event.

        Takes as input a previously allocated event. This event must have been created with the #EVENT_INTERPROCESS and #EVENT_DISABLE_TIMING flags set. This
        opaque handle may be copied into other processes and opened with {@link \#cuIpcOpenEventHandle IpcOpenEventHandle} to allow efficient hardware
        synchronization between GPU work in different processes.

        After the event has been opened in the importing process, #EventRecord(), #EventSynchronize(), #StreamWaitEvent() and #EventQuery() may be used in
        either process. Performing operations on the imported event after the exported event has been freed with #EventDestroy() will result in undefined
        behavior.

        IPC functionality is restricted to devices with support for unified addressing on Linux and Windows operating systems. IPC functionality on Windows is
        restricted to GPUs in TCC mode.
        """,

        CUipcEventHandle.p("pHandle", "pointer to a user allocated {@code CUipcEventHandle} in which to return the opaque event handle"),
        CUevent("event", "event allocated with #EVENT_INTERPROCESS and #EVENT_DISABLE_TIMING flags")
    )

    IgnoreMissing..CUresult(
        "IpcOpenEventHandle",
        """
        Opens an interprocess event handle for use in the current process.

        Opens an interprocess event handle exported from another process with #IpcGetEventHandle(). This function returns a {@code CUevent} that behaves like a
        locally created event with the #EVENT_DISABLE_TIMING flag specified. This event must be freed with #EventDestroy().

        Performing operations on the imported event after the exported event has been freed with {@code cuEventDestroy} will result in undefined behavior.

        IPC functionality is restricted to devices with support for unified addressing on Linux and Windows operating systems. IPC functionality on Windows is
        restricted to GPUs in TCC mode.
        """,

        Check(1)..CUevent.p("phEvent", "returns the imported event"),
        CUipcEventHandle("handle", "interprocess handle to open")
    )

    IgnoreMissing..CUresult(
        "IpcGetMemHandle",
        """
        Gets an interprocess memory handle for an existing device memory allocation.

        Takes a pointer to the base of an existing device memory allocation created with #MemAlloc() and exports it for use in another process. This is a
        lightweight operation and may be called multiple times on an allocation without adverse effects.

        If a region of memory is freed with #MemFree() and a subsequent call to #MemAlloc() returns memory with the same device address, #IpcGetMemHandle()
        will return a unique handle for the new memory.

        IPC functionality is restricted to devices with support for unified addressing on Linux and Windows operating systems. IPC functionality on Windows is
        restricted to GPUs in TCC mode.
        """,

        CUipcMemHandle.p("pHandle", "pointer to user allocated {@code CUipcMemHandle} to return the handle in"),
        CUdeviceptr("dptr", "base pointer to previously allocated device memory")
    )

    IgnoreMissing..CUresult(
        "IpcOpenMemHandle",
        """
        Opens an interprocess memory handle exported from another process and returns a device pointer usable in the local process.

        Maps memory exported from another process with #IpcGetMemHandle() into the current device address space. For contexts on different devices
        {@code cuIpcOpenMemHandle} can attempt to enable peer access between the devices as if the user called #CtxEnablePeerAccess(). This behavior is
        controlled by the #IPC_MEM_LAZY_ENABLE_PEER_ACCESS flag. #DeviceCanAccessPeer() can determine if a mapping is possible.

        Contexts that may open ##CUIPCMemHandle are restricted in the following way. {@code CUipcMemHandle}s from each {@code CUdevice} in a given process may
        only be opened by one {@code CUcontext} per {@code CUdevice} per other process.

        If the memory handle has already been opened by the current context, the reference count on the handle is incremented by 1 and the existing device
        pointer is returned.

        Memory returned from {@code cuIpcOpenMemHandle} must be freed with #IpcCloseMemHandle().

        Calling #MemFree() on an exported memory region before calling {@code cuIpcCloseMemHandle} in the importing context will result in undefined behavior.

        IPC functionality is restricted to devices with support for unified addressing on Linux and Windows operating systems. IPC functionality on Windows is
        restricted to GPUs in TCC mode.

        ${note("""
        No guarantees are made about the address returned in {@code *pdptr}. In particular, multiple processes may not receive the same address for the same
        {@code handle}.""")}
        """,

        Check(1)..CUdeviceptr.p("pdptr", "returned device pointer"),
        CUipcMemHandle("handle", "{@code CUipcMemHandle} to open"),
        unsigned_int("Flags", "flags for this operation. Must be specified as #IPC_MEM_LAZY_ENABLE_PEER_ACCESS.")
    ).versioned()

    IgnoreMissing..CUresult(
        "IpcCloseMemHandle",
        """
        Attempts to close memory mapped with {@link \#cuIpcOpenMemHandle IpcOpenMemHandle}.

        Decrements the reference count of the memory returned by {@code cuIpcOpenMemHandle()} by 1. When the reference count reaches 0, this API unmaps the
        memory. The original allocation in the exporting process as well as imported mappings in other processes will be unaffected.

        Any resources used to enable peer access will be freed if this is the last mapping using them.

        IPC functionality is restricted to devices with support for unified addressing on Linux and Windows operating systems. IPC functionality on Windows is
        restricted to GPUs in TCC mode
        """,

        CUdeviceptr("dptr", "device pointer returned by {@code cuIpcOpenMemHandle()}")
    )

    IgnoreMissing..CUresult(
        "MemHostRegister",
        """
        Registers an existing host memory range for use by CUDA.

        Page-locks the memory range specified by {@code p} and {@code bytesize} and maps it for the device(s) as specified by {@code Flags}. This memory range
        also is added to the same tracking mechanism as #MemHostAlloc() to automatically accelerate calls to functions such as #MemcpyHtoD(). Since the memory
        can be accessed directly by the device, it can be read or written with much higher bandwidth than pageable memory that has not been registered.
        Page-locking excessive amounts of memory may degrade system performance, since it reduces the amount of memory available to the system for paging. As a
        result, this function is best used sparingly to register staging areas for data exchange between host and device.

        This function has limited support on Mac OS X. OS 10.7 or higher is required.

        All flags are orthogonal to one another: a developer may page-lock memory that is portable or mapped with no restrictions.

        The #MEMHOSTREGISTER_DEVICEMAP flag may be specified on CUDA contexts for devices that do not support mapped pinned memory. The failure is deferred to
        #MemHostGetDevicePointer() because the memory may be mapped into other CUDA contexts via the #MEMHOSTREGISTER_PORTABLE flag.

        For devices that have a non-zero value for the device attribute #DEVICE_ATTRIBUTE_CAN_USE_HOST_POINTER_FOR_REGISTERED_MEM, the memory can also be
        accessed from the device using the host pointer {@code p}. The device pointer returned by {@code cuMemHostGetDevicePointer()} may or may not match the
        original host pointer {@code ptr} and depends on the devices visible to the application. If all devices visible to the application have a non-zero
        value for the device attribute, the device pointer returned by {@code cuMemHostGetDevicePointer()} will match the original pointer {@code ptr}. If any
        device visible to the application has a zero value for the device attribute, the device pointer returned by {@code cuMemHostGetDevicePointer()} will
        not match the original host pointer {@code ptr}, but it will be suitable for use on all devices provided Unified Virtual Addressing is enabled. In such
        systems, it is valid to access the memory using either pointer on devices that have a non-zero value for the device attribute. Note however that such
        devices should access the memory using only of the two pointers and not both.

        The memory page-locked by this function must be unregistered with #MemHostUnregister().
        """,

        void.p("p", "host pointer to memory to page-lock"),
        AutoSize("p")..size_t("bytesize", "size in bytes of the address range to page-lock"),
        unsigned_int("Flags", "flags for allocation request", "MEMHOSTREGISTER_\\w+", LinkMode.BITFIELD)
    ).versioned()

    IgnoreMissing..CUresult(
        "MemHostUnregister",
        """
        Unregisters a memory range that was registered with #MemHostRegister().

        Unmaps the memory range whose base address is specified by {@code p}, and makes it pageable again.

        The base address must be the same one specified to #MemHostRegister().
        """,

        Unsafe..void.p("p", "host pointer to memory to unregister")
    )

    IgnoreMissing..CUresult(
        "Memcpy",
        """
        Copies memory.

        Copies data between two pointers. {@code dst} and {@code src} are base pointers of the destination and source, respectively. {@code ByteCount}
        specifies the number of bytes to copy. Note that this function infers the type of the transfer (host to host, host to device, device to device, or
        device to host) from the pointer values. This function is only allowed in contexts which support unified addressing.
        """,

        CUdeviceptr("dst", "destination unified virtual address space pointer"),
        CUdeviceptr("src", "source unified virtual address space pointer"),
        size_t("ByteCount", "size of memory copy in bytes")
    ).ptds()

    IgnoreMissing..CUresult(
        "MemcpyPeer",
        """
        Copies device memory between two contexts.

        Copies from device memory in one context to device memory in another context. {@code dstDevice} is the base device pointer of the destination memory
        and {@code dstContext} is the destination context. {@code srcDevice} is the base device pointer of the source memory and {@code srcContext} is the
        source pointer. {@code ByteCount} specifies the number of bytes to copy.
        """,

        CUdeviceptr("dstDevice", "destination device pointer"),
        CUcontext("dstContext", "destination context"),
        CUdeviceptr("srcDevice", "source device pointer"),
        CUcontext("srcContext", "source context"),
        size_t("ByteCount", "size of memory copy in bytes")
    ).ptds()

    CUresult(
        "MemcpyHtoD",
        """
        Copies memory from Host to Device.

        Copies from host memory to device memory. {@code dstDevice} and {@code srcHost} are the base addresses of the destination and source, respectively.
        {@code ByteCount} specifies the number of bytes to copy.
        """,

        CUdeviceptr("dstDevice", "destination device pointer"),
        MultiTypeAll..void.const.p("srcHost", "source host pointer"),
        AutoSize("srcHost")..size_t("ByteCount", "size of memory copy in bytes")
    ).ptds(2)

    CUresult(
        "MemcpyDtoH",
        """
        Copies memory from Device to Host.

        Copies from device to host memory. {@code dstHost} and {@code srcDevice} specify the base pointers of the destination and source, respectively. {@code
        ByteCount} specifies the number of bytes to copy.
        """,

        MultiTypeAll..void.p("dstHost", "destination host pointer"),
        CUdeviceptr("srcDevice", "source device pointer"),
        AutoSize("dstHost")..size_t("ByteCount", "size of memory copy in bytes")
    ).ptds(2)

    CUresult(
        "MemcpyDtoD",
        """
        Copies memory from Device to Device.

        Copies from device memory to device memory. {@code dstDevice} and {@code srcDevice} are the base pointers of the destination and source, respectively.
        {@code ByteCount} specifies the number of bytes to copy.
        """,

        CUdeviceptr("dstDevice", "destination device pointer"),
        CUdeviceptr("srcDevice", "source device pointer"),
        size_t("ByteCount", "size of memory copy in bytes")
    ).ptds(2)

    CUresult(
        "MemcpyDtoA",
        """
        Copies memory from Device to Array.

        Copies from device memory to a 1D CUDA array. {@code dstArray} and {@code dstOffset} specify the CUDA array handle and starting index of the
        destination data. {@code srcDevice} specifies the base pointer of the source. {@code ByteCount} specifies the number of bytes to copy.
        """,

        CUarray("dstArray", "destination array"),
        size_t("dstOffset", "offset in bytes of destination array"),
        CUdeviceptr("srcDevice", "source device pointer"),
        size_t("ByteCount", "size of memory copy in bytes")
    ).ptds(2)

    CUresult(
        "MemcpyAtoD",
        """
        Copies memory from Array to Device.

        Copies from one 1D CUDA array to device memory. {@code dstDevice} specifies the base pointer of the destination and must be naturally aligned with the
        CUDA array elements. {@code srcArray} and {@code srcOffset} specify the CUDA array handle and the offset in bytes into the array where the copy is to
        begin. {@code ByteCount} specifies the number of bytes to copy and must be evenly divisible by the array element size.
        """,

        CUdeviceptr("dstDevice", "destination device pointer"),
        CUarray("srcArray", "source array"),
        size_t("srcOffset", "offset in bytes of source array"),
        size_t("ByteCount", "size of memory copy in bytes")
    ).ptds(2)

    CUresult(
        "MemcpyHtoA",
        """
        Copies memory from Host to Array.

        Copies from host memory to a 1D CUDA array. {@code dstArray} and {@code dstOffset} specify the CUDA array handle and starting offset in bytes of the
        destination data. {@code pSrc} specifies the base address of the source. {@code ByteCount} specifies the number of bytes to copy.
        """,

        CUarray("dstArray", "destination array"),
        size_t("dstOffset", "offset in bytes of destination array"),
        MultiTypeAll..void.const.p("srcHost", "source host pointer"),
        AutoSize("srcHost")..size_t("ByteCount", "size of memory copy in bytes")
    ).ptds(2)

    CUresult(
        "MemcpyAtoH",
        """
        Copies memory from Array to Host.

        Copies from one 1D CUDA array to host memory. {@code dstHost} specifies the base pointer of the destination. {@code srcArray} and {@code srcOffset}
        specify the CUDA array handle and starting offset in bytes of the source data. {@code ByteCount} specifies the number of bytes to copy.
        """,

        MultiTypeAll..void.p("dstHost", "destination device pointer"),
        CUarray("srcArray", "source array"),
        size_t("srcOffset", "offset in bytes of source array"),
        AutoSize("dstHost")..size_t("ByteCount", "size of memory copy in bytes")
    ).ptds(2)

    CUresult(
        "MemcpyAtoA",
        """
        Copies memory from Array to Array.

        Copies from one 1D CUDA array to another. {@code dstArray} and {@code srcArray} specify the handles of the destination and source CUDA arrays for the
        copy, respectively. {@code dstOffset} and {@code srcOffset} specify the destination and source offsets in bytes into the CUDA arrays. {@code ByteCount}
        is the number of bytes to be copied. The size of the elements in the CUDA arrays need not be the same format, but the elements must be the same size;
        and count must be evenly divisible by that size.
        """,

        CUarray("dstArray", "destination array"),
        size_t("dstOffset", "offset in bytes of destination array"),
        CUarray("srcArray", "source array"),
        size_t("srcOffset", "offset in bytes of source array"),
        size_t("ByteCount", "size of memory copy in bytes")
    ).ptds(2)

    CUresult(
        "Memcpy2D",
        """
        Copies memory for 2D arrays.

        Perform a 2D memory copy according to the parameters specified in {@code pCopy}.

        If {@code srcMemoryType} is #MEMORYTYPE_UNIFIED, {@code srcDevice} and {@code srcPitch} specify the (unified virtual address space) base address of the
        source data and the bytes per row to apply. {@code srcArray} is ignored. This value may be used only if unified addressing is supported in the calling
        context.

        If {@code srcMemoryType} is #MEMORYTYPE_HOST, {@code srcHost} and {@code srcPitch} specify the (host) base address of the source data and the bytes per
        row to apply. {@code srcArray} is ignored.

        If {@code srcMemoryType} is #MEMORYTYPE_DEVICE, {@code srcDevice} and {@code srcPitch} specify the (device) base address of the source data and the
        bytes per row to apply. {@code srcArray} is ignored.

        If {@code srcMemoryType} is #MEMORYTYPE_ARRAY, {@code srcArray} specifies the handle of the source data. {@code srcHost}, {@code srcDevice} and
        {@code srcPitch} are ignored.

        If {@code dstMemoryType} is #MEMORYTYPE_HOST, {@code dstHost} and {@code dstPitch} specify the (host) base address of the destination data and the
        bytes per row to apply. {@code dstArray} is ignored.

        If {@code dstMemoryType} is #MEMORYTYPE_UNIFIED, {@code dstDevice} and {@code dstPitch} specify the (unified virtual address space) base address of the
        source data and the bytes per row to apply. {@code dstArray} is ignored. This value may be used only if unified addressing is supported in the calling
        context.

        If {@code dstMemoryType} is #MEMORYTYPE_DEVICE, {@code dstDevice} and {@code dstPitch} specify the (device) base address of the destination data and
        the bytes per row to apply. {@code dstArray} is ignored.

        If {@code dstMemoryType} is #MEMORYTYPE_ARRAY, {@code dstArray} specifies the handle of the destination data. {@code dstHost}, {@code dstDevice} and
        {@code dstPitch} are ignored.

        {@code srcXInBytes} and {@code srcY} specify the base address of the source data for the copy.

        For host pointers, the starting address is
        ${codeBlock("""
voidStart = (void*)((char*)srcHost+srcY*srcPitch + srcXInBytes);""")}

         For device pointers, the starting address is
        ${codeBlock("""
CUdeviceptr Start = srcDevice+srcY*srcPitch+srcXInBytes;""")}

        For CUDA arrays, {@code srcXInBytes} must be evenly divisible by the array element size.

        {@code dstXInBytes} and {@code dstY} specify the base address of the destination data for the copy.

        For host pointers, the base address is
        ${codeBlock("""
voiddstStart = (void*)((char*)dstHost+dstY*dstPitch + dstXInBytes);""")}

        For device pointers, the starting address is
        ${codeBlock("""
CUdeviceptr dstStart = dstDevice+dstY*dstPitch+dstXInBytes;""")}

        For CUDA arrays, {@code dstXInBytes} must be evenly divisible by the array element size.

        {@code WidthInBytes} and {@code Height} specify the width (in bytes) and height of the 2D copy being performed.

        If specified, {@code srcPitch} must be greater than or equal to {@code WidthInBytes} + {@code srcXInBytes}, and {@code dstPitch} must be greater than
        or equal to {@code WidthInBytes} + {@code dstXInBytes}.

        {@code cuMemcpy2D()} returns an error if any pitch is greater than the maximum allowed (#DEVICE_ATTRIBUTE_MAX_PITCH). {@code cuMemAllocPitch}() passes back
        pitches that always work with {@code cuMemcpy2D()}. On intra-device memory copies (device to device, CUDA array to device, CUDA array to CUDA array),
        {@code cuMemcpy2D()} may fail for pitches not computed by #MemAllocPitch(). #Memcpy2DUnaligned() does not have this restriction, but may run
        significantly slower in the cases where {@code cuMemcpy2D()} would have returned an error code.
        """,

        CUDA_MEMCPY2D.const.p("pCopy", "parameters for the memory copy")
    ).ptds(2)

    CUresult(
        "Memcpy2DUnaligned",
        """
        Copies memory for 2D arrays.

        Perform a 2D memory copy according to the parameters specified in {@code pCopy}.

        If {@code srcMemoryType} is #MEMORYTYPE_UNIFIED, {@code srcDevice} and {@code srcPitch} specify the (unified virtual address space) base address of the
        source data and the bytes per row to apply. {@code srcArray} is ignored. This value may be used only if unified addressing is supported in the calling
        context.

        If {@code srcMemoryType} is #MEMORYTYPE_HOST, {@code srcHost} and {@code srcPitch} specify the (host) base address of the source data and the bytes per
        row to apply. {@code srcArray} is ignored.

        If {@code srcMemoryType} is #MEMORYTYPE_DEVICE, {@code srcDevice} and {@code srcPitch} specify the (device) base address of the source data and the
        bytes per row to apply. {@code srcArray} is ignored.

        If {@code srcMemoryType} is #MEMORYTYPE_ARRAY, {@code srcArray} specifies the handle of the source data. {@code srcHost}, {@code srcDevice} and
        {@code srcPitch} are ignored.

        If {@code dstMemoryType} is #MEMORYTYPE_UNIFIED, {@code dstDevice} and {@code dstPitch} specify the (unified virtual address space) base address of the
        source data and the bytes per row to apply. {@code dstArray} is ignored. This value may be used only if unified addressing is supported in the calling
        context.

        If {@code dstMemoryType} is #MEMORYTYPE_HOST, {@code dstHost} and {@code dstPitch} specify the (host) base address of the destination data and the
        bytes per row to apply. {@code dstArray} is ignored.

        If {@code dstMemoryType} is #MEMORYTYPE_DEVICE, {@code dstDevice} and {@code dstPitch} specify the (device) base address of the destination data and
        the bytes per row to apply. {@code dstArray} is ignored.

        If {@code dstMemoryType} is #MEMORYTYPE_ARRAY, {@code dstArray} specifies the handle of the destination data. {@code dstHost}, {@code dstDevice} and
        {@code dstPitch} are ignored.

        {@code srcXInBytes} and {@code srcY} specify the base address of the source data for the copy.

        For host pointers, the starting address is
        ${codeBlock("""
  void* Start = (void*)((char*)srcHost+srcY*srcPitch + srcXInBytes);""")}

        For device pointers, the starting address is
        ${codeBlock("""
  CUdeviceptr Start = srcDevice+srcY*srcPitch+srcXInBytes;""")}

        For CUDA arrays, {@code srcXInBytes} must be evenly divisible by the array element size.

        {@code dstXInBytes} and {@code dstY} specify the base address of the destination data for the copy.

        For host pointers, the base address is
        ${codeBlock("""
  void* dstStart = (void*)((char*)dstHost+dstY*dstPitch + dstXInBytes);""")}

        For device pointers, the starting address is
        ${codeBlock("""
  CUdeviceptr dstStart = dstDevice+dstY*dstPitch+dstXInBytes;""")}

        For CUDA arrays, {@code dstXInBytes} must be evenly divisible by the array element size.

        {@code WidthInBytes} and {@code Height} specify the width (in bytes) and height of the 2D copy being performed.

        If specified, {@code srcPitch} must be greater than or equal to {@code WidthInBytes} + {@code srcXInBytes}, and {@code dstPitch} must be greater than
        or equal to {@code WidthInBytes} + {@code dstXInBytes}.

        #Memcpy2D() returns an error if any pitch is greater than the maximum allowed (#DEVICE_ATTRIBUTE_MAX_PITCH). #MemAllocPitch() passes back pitches that
        always work with {@code cuMemcpy2D()}. On intra-device memory copies (device to device, CUDA array to device, CUDA array to CUDA array),
        {@code cuMemcpy2D()} may fail for pitches not computed by {@code cuMemAllocPitch()}. {@code cuMemcpy2DUnaligned()} does not have this restriction, but
        may run significantly slower in the cases where {@code cuMemcpy2D()} would have returned an error code.
        """,

        CUDA_MEMCPY2D.const.p("pCopy", "parameters for the memory copy")
    ).ptds(2)

    CUresult(
        "Memcpy3D",
        """
        Copies memory for 3D arrays.

        Perform a 3D memory copy according to the parameters specified in {@code pCopy}.

        If {@code srcMemoryType} is #MEMORYTYPE_UNIFIED, {@code srcDevice} and {@code srcPitch} specify the (unified virtual address space) base address of the
        source data and the bytes per row to apply. {@code srcArray} is ignored. This value may be used only if unified addressing is supported in the calling
        context.

        If {@code srcMemoryType} is #MEMORYTYPE_HOST, {@code srcHost}, {@code srcPitch} and {@code srcHeight} specify the (host) base address of the source
        data, the bytes per row, and the height of each 2D slice of the 3D array. {@code srcArray} is ignored.

        If {@code srcMemoryType} is #MEMORYTYPE_DEVICE, {@code srcDevice}, {@code srcPitch} and {@code srcHeight} specify the (device) base address of the
        source data, the bytes per row, and the height of each 2D slice of the 3D array. {@code srcArray} is ignored.

        If {@code srcMemoryType} is #MEMORYTYPE_ARRAY, {@code srcArray} specifies the handle of the source data. {@code srcHost}, {@code srcDevice},
        {@code srcPitch} and {@code srcHeight} are ignored.

        If {@code dstMemoryType} is #MEMORYTYPE_UNIFIED, {@code dstDevice} and {@code dstPitch} specify the (unified virtual address space) base address of the
        source data and the bytes per row to apply. {@code dstArray} is ignored. This value may be used only if unified addressing is supported in the calling
        context.

        If {@code dstMemoryType} is #MEMORYTYPE_HOST, {@code dstHost} and {@code dstPitch} specify the (host) base address of the destination data, the bytes
        per row, and the height of each 2D slice of the 3D array. {@code dstArray} is ignored.

        If {@code dstMemoryType} is #MEMORYTYPE_DEVICE, {@code dstDevice} and {@code dstPitch} specify the (device) base address of the destination data, the
        bytes per row, and the height of each 2D slice of the 3D array. {@code dstArray} is ignored.

        If {@code dstMemoryType} is #MEMORYTYPE_ARRAY, {@code dstArray} specifies the handle of the destination data. {@code dstHost}, {@code dstDevice},
        {@code dstPitch} and {@code dstHeight} are ignored.

        {@code srcXInBytes}, {@code srcY} and {@code srcZ} specify the base address of the source data for the copy.

        For host pointers, the starting address is
        ${codeBlock("""
  void* Start = (void*)((char*)srcHost+(srcZ*srcHeight+srcY)*srcPitch + srcXInBytes);""")}

        For device pointers, the starting address is
        ${codeBlock("""
  CUdeviceptr Start = srcDevice+(srcZ*srcHeight+srcY)*srcPitch+srcXInBytes;""")}

        For CUDA arrays, {@code srcXInBytes} must be evenly divisible by the array element size.

        {@code dstXInBytes}, {@code dstY} and {@code dstZ} specify the base address of the destination data for the copy.

        For host pointers, the base address is
        ${codeBlock("""
  void* dstStart = (void*)((char*)dstHost+(dstZ*dstHeight+dstY)*dstPitch + dstXInBytes);""")}

        For device pointers, the starting address is
        ${codeBlock("""
  CUdeviceptr dstStart = dstDevice+(dstZ*dstHeight+dstY)*dstPitch+dstXInBytes;""")}

        For CUDA arrays, {@code dstXInBytes} must be evenly divisible by the array element size.

        {@code WidthInBytes}, {@code Height} and {@code Depth} specify the width (in bytes), height and depth of the 3D copy being performed.

        If specified, {@code srcPitch} must be greater than or equal to {@code WidthInBytes} + {@code srcXInBytes}, and {@code dstPitch} must be greater than
        or equal to {@code WidthInBytes} + {@code dstXInBytes}.

        If specified, {@code srcHeight} must be greater than or equal to {@code Height} + {@code srcY}, and {@code dstHeight} must be greater than or equal to
        {@code Height} + {@code dstY}.

        #Memcpy3D() returns an error if any pitch is greater than the maximum allowed (#DEVICE_ATTRIBUTE_MAX_PITCH).

        The {@code srcLOD} and {@code dstLOD} members of the {@code CUDA_MEMCPY3D} structure must be set to 0.

        ${note("""_sync""")}
        """,

        CUDA_MEMCPY3D.const.p("pCopy", "parameters for the memory copy")
    ).ptds(2)

    IgnoreMissing..CUresult(
        "Memcpy3DPeer",
        """
        Copies memory between contexts.

        Perform a 3D memory copy according to the parameters specified in {@code pCopy}.
        """,

        CUDA_MEMCPY3D_PEER.const.p("pCopy", "parameters for the memory copy")
    ).ptds()

    IgnoreMissing..CUresult(
        "MemcpyAsync",
        """
        Copies memory asynchronously.

        Copies data between two pointers. {@code dst} and {@code src} are base pointers of the destination and source, respectively. {@code ByteCount}
        specifies the number of bytes to copy. Note that this function infers the type of the transfer (host to host, host to device, device to device, or
        device to host) from the pointer values. This function is only allowed in contexts which support unified addressing.
        """,

        CUdeviceptr("dst", "destination unified virtual address space pointer"),
        CUdeviceptr("src", "source unified virtual address space pointer"),
        size_t("ByteCount", "size of memory copy in bytes"),
        nullable..CUstream("hStream", "stream identifier")
    ).ptsz()

    IgnoreMissing..CUresult(
        "MemcpyPeerAsync",
        """
        Copies device memory between two contexts asynchronously.

        Copies from device memory in one context to device memory in another context. {@code dstDevice} is the base device pointer of the destination memory
        and {@code dstContext} is the destination context. {@code srcDevice} is the base device pointer of the source memory and {@code srcContext} is the
        source pointer. {@code ByteCount} specifies the number of bytes to copy.
        """,

        CUdeviceptr("dstDevice", "destination device pointer"),
        CUcontext("dstContext", "destination context"),
        CUdeviceptr("srcDevice", "source device pointer"),
        CUcontext("srcContext", "source context"),
        size_t("ByteCount", "size of memory copy in bytes"),
        nullable..CUstream("hStream", "stream identifier")
    ).ptsz()

    CUresult(
        "MemcpyHtoDAsync",
        """
        Copies memory from Host to Device.

        Copies from host memory to device memory. {@code dstDevice} and {@code srcHost} are the base addresses of the destination and source, respectively.
        {@code ByteCount} specifies the number of bytes to copy.
        """,

        CUdeviceptr("dstDevice", "destination device pointer"),
        MultiTypeAll..void.const.p("srcHost", "source host pointer"),
        AutoSize("srcHost")..size_t("ByteCount", "size of memory copy in bytes"),
        nullable..CUstream("hStream", "stream identifier")
    ).ptsz(2)

    CUresult(
        "MemcpyDtoHAsync",
        """
        Copies memory from Device to Host.

        Copies from device to host memory. {@code dstHost} and {@code srcDevice} specify the base pointers of the destination and source, respectively. {@code
        ByteCount} specifies the number of bytes to copy.
        """,

        MultiTypeAll..void.p("dstHost", "destination host pointer"),
        CUdeviceptr("srcDevice", "source device pointer"),
        AutoSize("dstHost")..size_t("ByteCount", "size of memory copy in bytes"),
        nullable..CUstream("hStream", "stream identifier")
    ).ptsz(2)

    CUresult(
        "MemcpyDtoDAsync",
        """
        Copies memory from Device to Device.

        Copies from device memory to device memory. {@code dstDevice} and {@code srcDevice} are the base pointers of the destination and source, respectively.
        {@code ByteCount} specifies the number of bytes to copy.
        """,

        CUdeviceptr("dstDevice", "destination device pointer"),
        CUdeviceptr("srcDevice", "source device pointer"),
        size_t("ByteCount", "size of memory copy in bytes"),
        nullable..CUstream("hStream", "stream identifier")
    ).ptsz(2)

    CUresult(
        "MemcpyHtoAAsync",
        """
        Copies memory from Host to Array.

        Copies from host memory to a 1D CUDA array. {@code dstArray} and {@code dstOffset} specify the CUDA array handle and starting offset in bytes of the
        destination data. {@code srcHost} specifies the base address of the source. {@code ByteCount} specifies the number of bytes to copy.
        """,

        CUarray("dstArray", "destination array"),
        size_t("dstOffset", "offset in bytes of destination array"),
        MultiTypeAll..void.const.p("srcHost", "source host pointer"),
        AutoSize("srcHost")..size_t("ByteCount", "size of memory copy in bytes"),
        nullable..CUstream("hStream", "stream identifier")
    ).ptsz(2)

    CUresult(
        "MemcpyAtoHAsync",
        """
        Copies memory from Array to Host.

        Copies from one 1D CUDA array to host memory. {@code dstHost} specifies the base pointer of the destination. {@code srcArray} and {@code srcOffset}
        specify the CUDA array handle and starting offset in bytes of the source data. {@code ByteCount} specifies the number of bytes to copy.
        """,

        MultiTypeAll..void.p("dstHost", "destination pointer"),
        CUarray("srcArray", "source array"),
        size_t("srcOffset", "offset in bytes of source array"),
        AutoSize("dstHost")..size_t("ByteCount", "size of memory copy in bytes"),
        nullable..CUstream("hStream", "stream identifier")
    ).ptsz(2)

    CUresult(
        "Memcpy2DAsync",
        """
        Copies memory for 2D arrays.

        Perform a 2D memory copy according to the parameters specified in {@code pCopy}.

        If {@code srcMemoryType} is #MEMORYTYPE_HOST, {@code srcHost} and {@code srcPitch} specify the (host) base address of the source data and the bytes per
        row to apply. {@code srcArray} is ignored.

        If {@code srcMemoryType} is #MEMORYTYPE_UNIFIED, {@code srcDevice} and {@code srcPitch} specify the (unified virtual address space) base address of the
        source data and the bytes per row to apply. {@code srcArray} is ignored. This value may be used only if unified addressing is supported in the calling
        context.

        If {@code srcMemoryType} is #MEMORYTYPE_DEVICE, {@code srcDevice} and {@code srcPitch} specify the (device) base address of the source data and the
        bytes per row to apply. {@code srcArray} is ignored.

        If {@code srcMemoryType} is #MEMORYTYPE_ARRAY, {@code srcArray} specifies the handle of the source data. {@code srcHost}, {@code srcDevice} and
        {@code srcPitch} are ignored.

        If {@code dstMemoryType} is #MEMORYTYPE_UNIFIED, {@code dstDevice} and {@code dstPitch} specify the (unified virtual address space) base address of the
        source data and the bytes per row to apply. {@code dstArray} is ignored. This value may be used only if unified addressing is supported in the calling
        context.

        If {@code dstMemoryType} is #MEMORYTYPE_HOST, {@code dstHost} and {@code dstPitch} specify the (host) base address of the destination data and the
        bytes per row to apply. {@code dstArray} is ignored.

        If {@code dstMemoryType} is #MEMORYTYPE_DEVICE, {@code dstDevice} and {@code dstPitch} specify the (device) base address of the destination data and
        the bytes per row to apply. {@code dstArray} is ignored.

        If {@code dstMemoryType} is #MEMORYTYPE_ARRAY, {@code dstArray} specifies the handle of the destination data. {@code dstHost}, {@code dstDevice} and
        {@code dstPitch} are ignored.

        {@code srcXInBytes} and {@code srcY} specify the base address of the source data for the copy.

        For host pointers, the starting address is
        ${codeBlock("""
  void* Start = (void*)((char*)srcHost+srcY*srcPitch + srcXInBytes);""")}

        For device pointers, the starting address is
        ${codeBlock("""
  CUdeviceptr Start = srcDevice+srcY*srcPitch+srcXInBytes;""")}

        For CUDA arrays, {@code srcXInBytes} must be evenly divisible by the array element size.

        {@code dstXInBytes} and {@code dstY} specify the base address of the destination data for the copy.

        For host pointers, the base address is
        ${codeBlock("""
  void* dstStart = (void*)((char*)dstHost+dstY*dstPitch + dstXInBytes);""")}

        For device pointers, the starting address is
        ${codeBlock("""
  CUdeviceptr dstStart = dstDevice+dstY*dstPitch+dstXInBytes;""")}

        For CUDA arrays, {@code dstXInBytes} must be evenly divisible by the array element size.

        {@code WidthInBytes} and {@code Height} specify the width (in bytes) and height of the 2D copy being performed.

        If specified, {@code srcPitch} must be greater than or equal to {@code WidthInBytes} + {@code srcXInBytes}, and {@code dstPitch} must be greater than
        or equal to {@code WidthInBytes} + {@code dstXInBytes}.

        If specified, {@code srcPitch} must be greater than or equal to {@code WidthInBytes} + {@code srcXInBytes}, and {@code dstPitch} must be greater than
        or equal to {@code WidthInBytes} + {@code dstXInBytes}.

        If specified, {@code srcHeight} must be greater than or equal to {@code Height} + {@code srcY}, and {@code dstHeight} must be greater than or equal to
        {@code Height} + {@code dstY}.

        {@code cuMemcpy2DAsync()} returns an error if any pitch is greater than the maximum allowed (#DEVICE_ATTRIBUTE_MAX_PITCH). #MemAllocPitch() passes back
        pitches that always work with #Memcpy2D(). On intra-device memory copies (device to device, CUDA array to device, CUDA array to CUDA array),
        {@code cuMemcpy2DAsync()} may fail for pitches not computed by {@code cuMemAllocPitch()}.
        """,

        CUDA_MEMCPY2D.const.p("pCopy", "parameters for the memory copy"),
        nullable..CUstream("hStream", "stream identifier")
    ).ptsz(2)

    CUresult(
        "Memcpy3DAsync",
        """
        Copies memory for 3D arrays.

        Perform a 3D memory copy according to the parameters specified in {@code pCopy}.

        If {@code srcMemoryType} is #MEMORYTYPE_UNIFIED, {@code srcDevice} and {@code srcPitch} specify the (unified virtual address space) base address of the
        source data and the bytes per row to apply. {@code srcArray} is ignored. This value may be used only if unified addressing is supported in the calling
        context.

        If {@code srcMemoryType} is #MEMORYTYPE_HOST, {@code srcHost}, {@code srcPitch} and {@code srcHeight} specify the (host) base address of the source
        data, the bytes per row, and the height of each 2D slice of the 3D array. {@code srcArray} is ignored.

        If {@code srcMemoryType} is #MEMORYTYPE_DEVICE, {@code srcDevice}, {@code srcPitch} and {@code srcHeight} specify the (device) base address of the
        source data, the bytes per row, and the height of each 2D slice of the 3D array. {@code srcArray} is ignored.

        If {@code srcMemoryType} is #MEMORYTYPE_ARRAY, {@code srcArray} specifies the handle of the source data. {@code srcHost}, {@code srcDevice},
        {@code srcPitch} and {@code srcHeight} are ignored.

        If {@code dstMemoryType} is #MEMORYTYPE_UNIFIED, {@code dstDevice} and {@code dstPitch} specify the (unified virtual address space) base address of the
        source data and the bytes per row to apply.  {@code dstArray} is ignored. This value may be used only if unified addressing is supported in the calling
        context.

        If {@code dstMemoryType} is #MEMORYTYPE_HOST, {@code dstHost} and {@code dstPitch} specify the (host) base address of the destination data, the bytes
        per row, and the height of each 2D slice of the 3D array. {@code dstArray} is ignored.

        If {@code dstMemoryType} is #MEMORYTYPE_DEVICE, {@code dstDevice} and {@code dstPitch} specify the (device) base address of the destination data, the
        bytes per row, and the height of each 2D slice of the 3D array. {@code dstArray} is ignored.

        If {@code dstMemoryType} is #MEMORYTYPE_ARRAY, {@code dstArray} specifies the handle of the destination data. {@code dstHost}, {@code dstDevice},
        {@code dstPitch} and {@code dstHeight} are ignored.

        - {@code srcXInBytes}, {@code srcY} and {@code srcZ} specify the base address of the source data for the copy.

        For host pointers, the starting address is
        ${codeBlock("""
  void* Start = (void*)((char*)srcHost+(srcZ*srcHeight+srcY)*srcPitch + srcXInBytes);""")}

        For device pointers, the starting address is
        ${codeBlock("""
  CUdeviceptr Start = srcDevice+(srcZ*srcHeight+srcY)*srcPitch+srcXInBytes;""")}

        For CUDA arrays, {@code srcXInBytes} must be evenly divisible by the array element size.

        {@code dstXInBytes}, {@code dstY} and {@code dstZ} specify the base address of the destination data for the copy.

        For host pointers, the base address is
        ${codeBlock("""
  void* dstStart = (void*)((char*)dstHost+(dstZ*dstHeight+dstY)*dstPitch + dstXInBytes);""")}

        For device pointers, the starting address is
        ${codeBlock("""
  CUdeviceptr dstStart = dstDevice+(dstZ*dstHeight+dstY)*dstPitch+dstXInBytes;""")}

        For CUDA arrays, {@code dstXInBytes} must be evenly divisible by the array element size.

        {@code WidthInBytes}, {@code Height} and {@code Depth} specify the width (in bytes), height and depth of the 3D copy being performed.

        If specified, {@code srcPitch} must be greater than or equal to {@code WidthInBytes} + {@code srcXInBytes}, and {@code dstPitch} must be greater than
        or equal to {@code WidthInBytes} + {@code dstXInBytes}.

        If specified, {@code srcHeight} must be greater than or equal to {@code Height} + {@code srcY}, and {@code dstHeight} must be greater than or equal to
        {@code Height} + {@code dstY}.

        #Memcpy3DAsync() returns an error if any pitch is greater than the maximum allowed (#DEVICE_ATTRIBUTE_MAX_PITCH).

        The {@code srcLOD} and {@code dstLOD} members of the {@code CUDA_MEMCPY3D} structure must be set to 0.
        """,

        CUDA_MEMCPY3D.const.p("pCopy", "parameters for the memory copy"),
        nullable..CUstream("hStream", "stream identifier")
    ).ptsz(2)

    IgnoreMissing..CUresult(
        "Memcpy3DPeerAsync",
        """
        Copies memory between contexts asynchronously.

        Perform a 3D memory copy according to the parameters specified in {@code pCopy}.
        """,

        CUDA_MEMCPY3D_PEER.const.p("pCopy", "parameters for the memory copy"),
        nullable..CUstream("hStream", "stream identifier")
    ).ptsz()

    CUresult(
        "MemsetD8",
        """
        Initializes device memory.

        Sets the memory range of {@code N} 8-bit values to the specified value {@code uc}.
        """,

        CUdeviceptr("dstDevice", "destination device pointer"),
        unsigned_char("uc", "value to set"),
        size_t("N", "number of elements")
    ).ptds(2)

    CUresult(
        "MemsetD16",
        """
        Initializes device memory.

        Sets the memory range of {@code N} 16-bit values to the specified value {@code us}. The {@code dstDevice} pointer must be two byte aligned.
        """,

        CUdeviceptr("dstDevice", "destination device pointer"),
        unsigned_short("us", "value to set"),
        size_t("N", "number of elements")
    ).ptds(2)

    CUresult(
        "MemsetD32",
        """
        Initializes device memory

        Sets the memory range of {@code N} 32-bit values to the specified value {@code ui}. The {@code dstDevice} pointer must be four byte aligned.
        """,

        CUdeviceptr("dstDevice", "destination device pointer"),
        unsigned_int("ui", "value to set"),
        size_t("N", "number of elements")
    ).ptds(2)

    CUresult(
        "MemsetD2D8",
        """
        Initializes device memory.

        Sets the 2D memory range of {@code Width} 8-bit values to the specified value {@code uc}. {@code Height} specifies the number of rows to set, and
        {@code dstPitch} specifies the number of bytes between each row. This function performs fastest when the pitch is one that has been passed back by
        #MemAllocPitch().
        """,

        CUdeviceptr("dstDevice", "destination device pointer"),
        size_t("dstPitch", "pitch of destination device pointer(Unused if {@code Height} is 1)"),
        unsigned_char("uc", "value to set"),
        size_t("Width", "width of row"),
        size_t("Height", "number of rows")
    ).ptds(2)

    CUresult(
        "MemsetD2D16",
        """
        Initializes device memory.

        Sets the 2D memory range of {@code Width} 16-bit values to the specified value {@code us}. {@code Height} specifies the number of rows to set, and
        {@code dstPitch} specifies the number of bytes between each row. The {@code dstDevice} pointer and {@code dstPitch} offset must be two byte aligned.
        This function performs fastest when the pitch is one that has been passed back by #MemAllocPitch().
        """,

        CUdeviceptr("dstDevice", "destination device pointer"),
        size_t("dstPitch", "pitch of destination device pointer(Unused if {@code Height} is 1)"),
        unsigned_short("us", "value to set"),
        size_t("Width", "width of row"),
        size_t("Height", "number of rows")
    ).ptds(2)

    CUresult(
        "MemsetD2D32",
        """
        Initializes device memory.

        Sets the 2D memory range of {@code Width} 32-bit values to the specified value {@code ui}. {@code Height} specifies the number of rows to set, and
        {@code dstPitch} specifies the number of bytes between each row. The {@code dstDevice} pointer and {@code dstPitch} offset must be four byte aligned.
        This function performs fastest when the pitch is one that has been passed back by #MemAllocPitch().
        """,

        CUdeviceptr("dstDevice", "destination device pointer"),
        size_t("dstPitch", "pitch of destination device pointer(Unused if {@code Height} is 1)"),
        unsigned_int("ui", "value to set"),
        size_t("Width", "width of row"),
        size_t("Height", "number of rows")
    ).ptds(2)

    CUresult(
        "MemsetD8Async",
        """
        Sets device memory

        Sets the memory range of {@code N} 8-bit values to the specified value {@code uc}.
        """,

        CUdeviceptr("dstDevice", "destination device pointer"),
        unsigned_char("uc", "value to set"),
        size_t("N", "number of elements"),
        nullable..CUstream("hStream", "stream identifier")
    ).ptsz()

    CUresult(
        "MemsetD16Async",
        """
        Sets device memory

        Sets the memory range of {@code N} 16-bit values to the specified value {@code us}. The {@code dstDevice} pointer must be two byte aligned.
        """,

        CUdeviceptr("dstDevice", "destination device pointer"),
        unsigned_short("us", "value to set"),
        size_t("N", "number of elements"),
        nullable..CUstream("hStream", "stream identifier")
    ).ptsz()

    CUresult(
        "MemsetD32Async",
        """
        Sets device memory.

        Sets the memory range of {@code N} 32-bit values to the specified value {@code ui}. The {@code dstDevice} pointer must be four byte aligned.
        """,

        CUdeviceptr("dstDevice", "destination device pointer"),
        unsigned_int("ui", "value to set"),
        size_t("N", "number of elements"),
        nullable..CUstream("hStream", "stream identifier")
    ).ptsz()

    CUresult(
        "MemsetD2D8Async",
        """
        Sets device memory.

        Sets the 2D memory range of {@code Width} 8-bit values to the specified value {@code uc}. {@code Height} specifies the number of rows to set, and
        {@code dstPitch} specifies the number of bytes between each row. This function performs fastest when the pitch is one that has been passed back by
        #MemAllocPitch().
        """,

        CUdeviceptr("dstDevice", "destination device pointer"),
        size_t("dstPitch", "pitch of destination device pointer(Unused if {@code Height} is 1)"),
        unsigned_char("uc", "value to set"),
        size_t("Width", "width of row"),
        size_t("Height", "number of rows"),
        nullable..CUstream("hStream", "stream identifier")
    ).ptsz()

    CUresult(
        "MemsetD2D16Async",
        """
        Sets device memory.

        Sets the 2D memory range of {@code Width} 16-bit values to the specified value {@code us}. {@code Height} specifies the number of rows to set, and
        {@code dstPitch} specifies the number of bytes between each row. The {@code dstDevice} pointer and {@code dstPitch} offset must be two byte aligned.
        This function performs fastest when the pitch is one that has been passed back by #MemAllocPitch().
        """,

        CUdeviceptr("dstDevice", "destination device pointer"),
        size_t("dstPitch", "pitch of destination device pointer(Unused if {@code Height} is 1)"),
        unsigned_short("us", "value to set"),
        size_t("Width", "width of row"),
        size_t("Height", "number of rows"),
        nullable..CUstream("hStream", "stream identifier")
    ).ptsz()

    CUresult(
        "MemsetD2D32Async",
        """
        Sets device memory.

        Sets the 2D memory range of {@code Width} 32-bit values to the specified value {@code ui}. {@code Height} specifies the number of rows to set, and
        {@code dstPitch} specifies the number of bytes between each row. The {@code dstDevice} pointer and {@code dstPitch} offset must be four byte aligned.
        This function performs fastest when the pitch is one that has been passed back by #MemAllocPitch().
        """,

        CUdeviceptr("dstDevice", "destination device pointer"),
        size_t("dstPitch", "pitch of destination device pointer(Unused if {@code Height} is 1)"),
        unsigned_int("ui", "value to set"),
        size_t("Width", "width of row"),
        size_t("Height", "number of rows"),
        nullable..CUstream("hStream", "stream identifier")
    ).ptsz()

    CUresult(
        "ArrayCreate",
        """
        Creates a 1D or 2D CUDA array.

        Creates a CUDA array according to the {@code CUDA_ARRAY_DESCRIPTOR} structure {@code pAllocateArray} and returns a handle to the new CUDA array in
        {@code *pHandle}.
        """,

        Check(1)..CUarray.p("pHandle", "returned array"),
        CUDA_ARRAY_DESCRIPTOR.const.p("pAllocateArray", "array descriptor")
    ).versioned()

    CUresult(
        "ArrayGetDescriptor",
        """
        Get a 1D or 2D CUDA array descriptor.

        Returns in {@code *pArrayDescriptor} a descriptor containing information on the format and dimensions of the CUDA array {@code hArray}. It is useful
        for subroutines that have been passed a CUDA array, but need to know the CUDA array parameters for validation or other purposes.
        """,

        CUDA_ARRAY_DESCRIPTOR.p("pArrayDescriptor", "returned array descriptor"),
        CUarray("hArray", "array to get descriptor of")
    ).versioned()

    IgnoreMissing..CUresult(
        "ArrayGetSparseProperties",
        """
        Returns the layout properties of a sparse CUDA array.

        Returns the layout properties of a sparse CUDA array in {@code sparseProperties} If the CUDA array is not allocated with flag #CUDA_ARRAY3D_SPARSE
        #CUDA_ERROR_INVALID_VALUE will be returned.

        If the returned value in ##CUDA_ARRAY_SPARSE_PROPERTIES{@code flags} contains #ARRAY_SPARSE_PROPERTIES_SINGLE_MIPTAIL, then
        {@code CUDA_ARRAY_SPARSE_PROPERTIES::miptailSize} represents the total size of the array. Otherwise, it will be zero. Also, the returned value in
        {@code CUDA_ARRAY_SPARSE_PROPERTIES::miptailFirstLevel} is always zero. Note that the {@code array} must have been allocated using #ArrayCreate() or
        #Array3DCreate(). For CUDA arrays obtained using #MipmappedArrayGetLevel(), #CUDA_ERROR_INVALID_VALUE will be returned. Instead,
        #MipmappedArrayGetSparseProperties() must be used to obtain the sparse properties of the entire CUDA mipmapped array to which {@code array} belongs to.
        """,

        CUDA_ARRAY_SPARSE_PROPERTIES.p("sparseProperties", "pointer to {@code CUDA_ARRAY_SPARSE_PROPERTIES}"),
        CUarray("array", "CUDA array to get the sparse properties of")
    )

    IgnoreMissing..CUresult(
        "MipmappedArrayGetSparseProperties",
        """
        Returns the layout properties of a sparse CUDA mipmapped array.

        Returns the sparse array layout properties in {@code sparseProperties} If the CUDA mipmapped array is not allocated with flag #CUDA_ARRAY3D_SPARSE
        #CUDA_ERROR_INVALID_VALUE will be returned.

        For non-layered CUDA mipmapped arrays, ##CUDA_ARRAY_SPARSE_PROPERTIES{@code ::miptailSize} returns the size of the mip tail region. The mip tail region
        includes all mip levels whose width, height or depth is less than that of the tile. For layered CUDA mipmapped arrays, if
        {@code CUDA_ARRAY_SPARSE_PROPERTIES::flags} contains #ARRAY_SPARSE_PROPERTIES_SINGLE_MIPTAIL, then {@code CUDA_ARRAY_SPARSE_PROPERTIES::miptailSize}
        specifies the size of the mip tail of all layers combined. Otherwise, {@code CUDA_ARRAY_SPARSE_PROPERTIES::miptailSize} specifies mip tail size per
        layer. The returned value of {@code CUDA_ARRAY_SPARSE_PROPERTIES::miptailFirstLevel} is valid only if {@code CUDA_ARRAY_SPARSE_PROPERTIES::miptailSize}
        is non-zero.
        """,

        CUDA_ARRAY_SPARSE_PROPERTIES.p("sparseProperties", "pointer to {@code CUDA_ARRAY_SPARSE_PROPERTIES}"),
        CUmipmappedArray("mipmap", "CUDA mipmapped array to get the sparse properties of")
    )

    IgnoreMissing..CUresult(
        "ArrayGetPlane",
        """
        Gets a CUDA array plane from a CUDA array.

        Returns in {@code pPlaneArray} a CUDA array that represents a single format plane of the CUDA array {@code hArray}.

        If {@code planeIdx} is greater than the maximum number of planes in this array or if the array does not have a multi-planar format e.g:
        #AD_FORMAT_NV12, then #CUDA_ERROR_INVALID_VALUE is returned.

        Note that if the {@code hArray} has format #AD_FORMAT_NV12, then passing in 0 for {@code planeIdx} returns a CUDA array of the same size as {@code
        hArray} but with one channel and #AD_FORMAT_UNSIGNED_INT8 as its format. If 1 is passed for {@code planeIdx}, then the returned CUDA array has half
        the height and width of {@code hArray} with two channels and #AD_FORMAT_UNSIGNED_INT8 as its format.
        """,

        Check(1)..CUarray.p("pPlaneArray", "returned CUDA array referenced by the {@code planeIdx}"),
        CUarray("hArray", "multiplanar CUDA array"),
        unsigned_int("planeIdx", "plane index")
    )

    CUresult(
        "ArrayDestroy",
        """
        Destroys a CUDA array.

        Destroys the CUDA array {@code hArray}.
        """,

        CUarray("hArray", "array to destroy")
    )

    CUresult(
        "Array3DCreate",
        """
        Creates a 3D CUDA array.

        Creates a CUDA array according to the ##CUDA_ARRAY3D_DESCRIPTOR structure {@code pAllocateArray} and returns a handle to the new CUDA array in {@code
        *pHandle}.

        ${ul(
            """
            {@code Width}, {@code Height}, and {@code Depth} are the width, height, and depth of the CUDA array (in elements); the following types of CUDA
            arrays can be allocated:
            ${ul(
                "A 1D array is allocated if {@code Height} and {@code Depth} extents are both zero.",
                "A 2D array is allocated if only {@code Depth} extent is zero.",
                "A 3D array is allocated if all three extents are non-zero.",
                """
                A 1D layered CUDA array is allocated if only {@code Height} is zero and the #CUDA_ARRAY3D_LAYERED flag is set. Each layer is a 1D array. The
                number of layers is determined by the depth extent.
                """,
                """
                A 2D layered CUDA array is allocated if all three extents are non-zero and the #CUDA_ARRAY3D_LAYERED flag is set. Each layer is a 2D array. The
                number of layers is determined by the depth extent.
                """,
                """
                A cubemap CUDA array is allocated if all three extents are non-zero and the #CUDA_ARRAY3D_CUBEMAP flag is set. {@code Width} must be equal to
                {@code Height}, and {@code Depth} must be six. A cubemap is a special type of 2D layered CUDA array, where the six layers represent the six
                faces of a cube. The order of the six layers in memory is the same as that listed in {@code CUarray_cubemap_face}.
                """,
                """
                A cubemap layered CUDA array is allocated if all three extents are non-zero, and both, #CUDA_ARRAY3D_CUBEMAP and #CUDA_ARRAY3D_LAYERED flags
                are set. {@code Width} must be equal to {@code Height}, and {@code Depth} must be a multiple of six. A cubemap layered CUDA array is a special
                type of 2D layered CUDA array that consists of a collection of cubemaps. The first six layers represent the first cubemap, the next six layers
                form the second cubemap, and so on.
                """
            )}
            """,
            "{@code Format} specifies the format of the elements.",
            "{@code NumChannels} specifies the number of packed components per CUDA array element; it may be 1, 2, or 4;",
            """
            {@code Flags} may be set to
            ${ul(
                """
                #CUDA_ARRAY3D_LAYERED to enable creation of layered CUDA arrays. If this flag is set, {@code Depth} specifies the number of layers, not the
                depth of a 3D array.
                """,
                """
                #CUDA_ARRAY3D_SURFACE_LDST to enable surface references to be bound to the CUDA array. If this flag is not set, #SurfRefSetArray() will fail
                when attempting to bind the CUDA array to a surface reference.
                """,
                """
                #CUDA_ARRAY3D_CUBEMAP to enable creation of cubemaps. If this flag is set, {@code Width} must be equal to {@code Height}, and {@code Depth}
                must be six. If the #CUDA_ARRAY3D_LAYERED flag is also set, then {@code Depth} must be a multiple of six.
                """,
                """
                #CUDA_ARRAY3D_TEXTURE_GATHER to indicate that the CUDA array will be used for texture gather. Texture gather can only be performed on 2D CUDA
                arrays.
                """
            )}
            """
        )}

        {@code Width}, {@code Height} and {@code Depth} must meet certain size requirements as listed in the following table. All values are specified in
        elements. Note that for brevity's sake, the full name of the device attribute is not specified. For ex., TEXTURE1D_WIDTH refers to the device attribute
        #DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_WIDTH.

        Note that 2D CUDA arrays have different size requirements if the #CUDA_ARRAY3D_TEXTURE_GATHER flag is set. {@code Width} and {@code Height} must not
        be greater than #DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_GATHER_WIDTH and #DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_GATHER_HEIGHT respectively, in that
        case.

        <table>
        <tr><td><b>CUDA array type</b></td>
        <td><b>Valid extents that must always be met<br>{(width range in elements), (height range),
        (depth range)}</b></td>
        <td><b>Valid extents with CUDA_ARRAY3D_SURFACE_LDST set<br>
        {(width range in elements), (height range), (depth range)}</b></td></tr>
        <tr><td>1D</td>
        <td><small>{ (1,TEXTURE1D_WIDTH), 0, 0 }</small></td>
        <td><small>{ (1,SURFACE1D_WIDTH), 0, 0 }</small></td></tr>
        <tr><td>2D</td>
        <td><small>{ (1,TEXTURE2D_WIDTH), (1,TEXTURE2D_HEIGHT), 0 }</small></td>
        <td><small>{ (1,SURFACE2D_WIDTH), (1,SURFACE2D_HEIGHT), 0 }</small></td></tr>
        <tr><td>3D</td>
        <td><small>{ (1,TEXTURE3D_WIDTH), (1,TEXTURE3D_HEIGHT), (1,TEXTURE3D_DEPTH) }
        <br>OR<br>{ (1,TEXTURE3D_WIDTH_ALTERNATE), (1,TEXTURE3D_HEIGHT_ALTERNATE),
        (1,TEXTURE3D_DEPTH_ALTERNATE) }</small></td>
        <td><small>{ (1,SURFACE3D_WIDTH), (1,SURFACE3D_HEIGHT),
        (1,SURFACE3D_DEPTH) }</small></td></tr>
        <tr><td>1D Layered</td>
        <td><small>{ (1,TEXTURE1D_LAYERED_WIDTH), 0,
        (1,TEXTURE1D_LAYERED_LAYERS) }</small></td>
        <td><small>{ (1,SURFACE1D_LAYERED_WIDTH), 0,
        (1,SURFACE1D_LAYERED_LAYERS) }</small></td></tr>
        <tr><td>2D Layered</td>
        <td><small>{ (1,TEXTURE2D_LAYERED_WIDTH), (1,TEXTURE2D_LAYERED_HEIGHT),
        (1,TEXTURE2D_LAYERED_LAYERS) }</small></td>
        <td><small>{ (1,SURFACE2D_LAYERED_WIDTH), (1,SURFACE2D_LAYERED_HEIGHT),
        (1,SURFACE2D_LAYERED_LAYERS) }</small></td></tr>
        <tr><td>Cubemap</td>
        <td><small>{ (1,TEXTURECUBEMAP_WIDTH), (1,TEXTURECUBEMAP_WIDTH), 6 }</small></td>
        <td><small>{ (1,SURFACECUBEMAP_WIDTH),
        (1,SURFACECUBEMAP_WIDTH), 6 }</small></td></tr>
        <tr><td>Cubemap Layered</td>
        <td><small>{ (1,TEXTURECUBEMAP_LAYERED_WIDTH), (1,TEXTURECUBEMAP_LAYERED_WIDTH),
        (1,TEXTURECUBEMAP_LAYERED_LAYERS) }</small></td>
        <td><small>{ (1,SURFACECUBEMAP_LAYERED_WIDTH), (1,SURFACECUBEMAP_LAYERED_WIDTH),
        (1,SURFACECUBEMAP_LAYERED_LAYERS) }</small></td></tr>
        </table>
        """,

        Check(1)..CUarray.p("pHandle", "returned array"),
        CUDA_ARRAY3D_DESCRIPTOR.const.p("pAllocateArray", "3D array descriptor")
    ).versioned()

    CUresult(
        "Array3DGetDescriptor",
        """
        Get a 3D CUDA array descriptor.

        Returns in {@code *pArrayDescriptor} a descriptor containing information on the format and dimensions of the CUDA array {@code hArray}. It is useful
        for subroutines that have been passed a CUDA array, but need to know the CUDA array parameters for validation or other purposes.

        This function may be called on 1D and 2D arrays, in which case the {@code Height} and/or {@code Depth} members of the descriptor struct will be set to
        0.
        """,

        CUDA_ARRAY3D_DESCRIPTOR.p("pArrayDescriptor", "returned 3D array descriptor"),
        CUarray("hArray", "3D array to get descriptor of")
    ).versioned()

    IgnoreMissing..CUresult(
        "MipmappedArrayCreate",
        """
        Creates a CUDA mipmapped array.

        Creates a CUDA mipmapped array according to the ##CUDA_ARRAY3D_DESCRIPTOR structure {@code pMipmappedArrayDesc} and returns a handle to the new CUDA
        mipmapped array in {@code *pHandle}. {@code numMipmapLevels} specifies the number of mipmap levels to be allocated. This value is clamped to the range
        {@code [1, 1 + floor(log2(max(width, height, depth)))]}.

        ${ul(
            """
            {@code Width}, {@code Height}, and {@code Depth} are the width, height, and depth of the CUDA array (in elements); the following types of CUDA
            arrays can be allocated:
            ${ul(
                "A 1D mipmapped array is allocated if {@code Height} and {@code Depth} extents are both zero.",
                "A 2D mipmapped array is allocated if only {@code Depth} extent is zero.",
                "A 3D mipmapped array is allocated if all three extents are non-zero.",
                """
                A 1D layered CUDA mipmapped array is allocated if only {@code Height} is zero and the #CUDA_ARRAY3D_LAYERED flag is set. Each layer is a 1D
                array. The number of layers is determined by the depth extent.
                """,
                """
                A 2D layered CUDA mipmapped array is allocated if all three extents are non-zero and the #CUDA_ARRAY3D_LAYERED flag is set. Each layer is a 2D
                array. The number of layers is determined by the depth extent.
                """,
                """
                A cubemap CUDA mipmapped array is allocated if all three extents are non-zero and the #CUDA_ARRAY3D_CUBEMAP flag is set. {@code Width} must be
                equal to {@code Height}, and {@code Depth} must be six. A cubemap is a special type of 2D layered CUDA array, where the six layers represent
                the six faces of a cube. The order of the six layers in memory is the same as that listed in {@code CUarray_cubemap_face}.
                """,
                """
                A cubemap layered CUDA mipmapped array is allocated if all three extents are non-zero, and both, #CUDA_ARRAY3D_CUBEMAP and
                #CUDA_ARRAY3D_LAYERED flags are set. {@code Width} must be equal to {@code Height}, and {@code Depth} must be a multiple of six. A cubemap
                layered CUDA array is a special type of 2D layered CUDA array that consists of a collection of cubemaps. The first six layers represent the
                first cubemap, the next six layers form the second cubemap, and so on.
                """
            )}
            """,
            "{@code Format} specifies the format of the elements.",
            "{@code NumChannels} specifies the number of packed components per CUDA array element; it may be 1, 2, or 4;",
            """
            Flags may be set to:
            ${ul(
                """
                #CUDA_ARRAY3D_LAYERED to enable creation of layered CUDA mipmapped arrays. If this flag is set, {@code Depth} specifies the number of layers,
                not the depth of a 3D array.
                """,
                """
                #CUDA_ARRAY3D_SURFACE_LDST to enable surface references to be bound to individual mipmap levels of the CUDA mipmapped array. If this flag is
                not set, #SurfRefSetArray() will fail when attempting to bind a mipmap level of the CUDA mipmapped array to a surface reference.
                """,
                """
                #CUDA_ARRAY3D_CUBEMAP to enable creation of mipmapped cubemaps. If this flag is set, {@code Width} must be equal to {@code Height}, and
                {@code Depth} must be six. If the #CUDA_ARRAY3D_LAYERED flag is also set, then {@code Depth} must be a multiple of six.
                """,
                """
                #CUDA_ARRAY3D_TEXTURE_GATHER to indicate that the CUDA mipmapped array will be used for texture gather. Texture gather can only be performed on
                2D CUDA mipmapped arrays.
                """
            )}
            """
        )}

        {@code Width}, {@code Height} and {@code Depth} must meet certain size requirements as listed in the following table. All values are specified in
        elements. Note that for brevity's sake, the full name of the device attribute is not specified. For ex., {@code TEXTURE1D_MIPMAPPED_WIDTH} refers to
        the device attribute #DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_MIPMAPPED_WIDTH.

        <table>
        <tr><td><b>CUDA array type</b></td>
        <td><b>Valid extents that must always be met<br>{(width range in elements), (height range),
        (depth range)}</b></td>
        <td><b>Valid extents with CUDA_ARRAY3D_SURFACE_LDST set<br>
        {(width range in elements), (height range), (depth range)}</b></td></tr>
        <tr><td>1D</td>
        <td><small>{ (1,TEXTURE1D_MIPMAPPED_WIDTH), 0, 0 }</small></td>
        <td><small>{ (1,SURFACE1D_WIDTH), 0, 0 }</small></td></tr>
        <tr><td>2D</td>
        <td><small>{ (1,TEXTURE2D_MIPMAPPED_WIDTH), (1,TEXTURE2D_MIPMAPPED_HEIGHT), 0 }</small></td>
        <td><small>{ (1,SURFACE2D_WIDTH), (1,SURFACE2D_HEIGHT), 0 }</small></td></tr>
        <tr><td>3D</td>
        <td><small>{ (1,TEXTURE3D_WIDTH), (1,TEXTURE3D_HEIGHT), (1,TEXTURE3D_DEPTH) }
        <br>OR<br>{ (1,TEXTURE3D_WIDTH_ALTERNATE), (1,TEXTURE3D_HEIGHT_ALTERNATE),
        (1,TEXTURE3D_DEPTH_ALTERNATE) }</small></td>
        <td><small>{ (1,SURFACE3D_WIDTH), (1,SURFACE3D_HEIGHT),
        (1,SURFACE3D_DEPTH) }</small></td></tr>
        <tr><td>1D Layered</td>
        <td><small>{ (1,TEXTURE1D_LAYERED_WIDTH), 0,
        (1,TEXTURE1D_LAYERED_LAYERS) }</small></td>
        <td><small>{ (1,SURFACE1D_LAYERED_WIDTH), 0,
        (1,SURFACE1D_LAYERED_LAYERS) }</small></td></tr>
        <tr><td>2D Layered</td>
        <td><small>{ (1,TEXTURE2D_LAYERED_WIDTH), (1,TEXTURE2D_LAYERED_HEIGHT),
        (1,TEXTURE2D_LAYERED_LAYERS) }</small></td>
        <td><small>{ (1,SURFACE2D_LAYERED_WIDTH), (1,SURFACE2D_LAYERED_HEIGHT),
        (1,SURFACE2D_LAYERED_LAYERS) }</small></td></tr>
        <tr><td>Cubemap</td>
        <td><small>{ (1,TEXTURECUBEMAP_WIDTH), (1,TEXTURECUBEMAP_WIDTH), 6 }</small></td>
        <td><small>{ (1,SURFACECUBEMAP_WIDTH),
        (1,SURFACECUBEMAP_WIDTH), 6 }</small></td></tr>
        <tr><td>Cubemap Layered</td>
        <td><small>{ (1,TEXTURECUBEMAP_LAYERED_WIDTH), (1,TEXTURECUBEMAP_LAYERED_WIDTH),
        (1,TEXTURECUBEMAP_LAYERED_LAYERS) }</small></td>
        <td><small>{ (1,SURFACECUBEMAP_LAYERED_WIDTH), (1,SURFACECUBEMAP_LAYERED_WIDTH),
        (1,SURFACECUBEMAP_LAYERED_LAYERS) }</small></td></tr>
        </table>
        """,

        Check(1)..CUmipmappedArray.p("pHandle", "returned mipmapped array"),
        CUDA_ARRAY3D_DESCRIPTOR.const.p("pMipmappedArrayDesc", "mipmapped array descriptor"),
        unsigned_int("numMipmapLevels", "number of mipmap levels")
    )

    IgnoreMissing..CUresult(
        "MipmappedArrayGetLevel",
        """
        Gets a mipmap level of a CUDA mipmapped array.

        Returns in {@code *pLevelArray} a CUDA array that represents a single mipmap level of the CUDA mipmapped array {@code hMipmappedArray}.

        If {@code level} is greater than the maximum number of levels in this mipmapped array, #CUDA_ERROR_INVALID_VALUE is returned.
        """,

        Check(1)..CUarray.p("pLevelArray", "returned mipmap level CUDA array"),
        CUmipmappedArray("hMipmappedArray", "CUDA mipmapped array"),
        unsigned_int("level", "mipmap level")
    )

    IgnoreMissing..CUresult(
        "MipmappedArrayDestroy",
        """
        Destroys a CUDA mipmapped array.

        Destroys the CUDA mipmapped array {@code hMipmappedArray}.
        """,

        CUmipmappedArray("hMipmappedArray", "mipmapped array to destroy")
    )

    IgnoreMissing..CUresult(
        "MemAddressReserve",
        """
        Allocate an address range reservation.

        Reserves a virtual address range based on the given parameters, giving the starting address of the range in {@code ptr}. This API requires a system
        that supports UVA. The size and address parameters must be a multiple of the host page size and the alignment must be a power of two or zero for
        default alignment.
        """,

        Check(1)..CUdeviceptr.p("ptr", "resulting pointer to start of virtual address range allocated"),
        size_t("size", "size of the reserved virtual address range requested"),
        size_t("alignment", "alignment of the reserved virtual address range requested"),
        CUdeviceptr("addr", "fixed starting address range requested"),
        unsigned_long_long("flags", "currently unused, must be zero")
    )

    IgnoreMissing..CUresult(
        "MemAddressFree",
        """
        Free an address range reservation.

        Frees a virtual address range reserved by #MemAddressReserve(). The size must match what was given to {@code memAddressReserve} and the ptr given must
        match what was returned from {@code memAddressReserve}.
        """,

        CUdeviceptr("ptr", "starting address of the virtual address range to free"),
        size_t("size", "size of the virtual address region to free")
    )

    IgnoreMissing..CUresult(
        "MemCreate",
        """
        Create a CUDA memory handle representing a memory allocation of a given size described by the given properties.

        This creates a memory allocation on the target device specified through the {@code prop} strcuture. The created allocation will not have any device or
        host mappings. The generic memory {@code handle} for the allocation can be mapped to the address space of calling process via #MemMap(). This handle
        cannot be transmitted directly to other processes (see #MemExportToShareableHandle()). On Windows, the caller must also pass an
        {@code LPSECURITYATTRIBUTE} in {@code prop} to be associated with this handle which limits or allows access to this handle for a recepient process (see
        ##CUmemAllocationProp{@code ::win32HandleMetaData} for more). The {@code size} of this allocation must be a multiple of the the value given via
        #MemGetAllocationGranularity() with the #MEM_ALLOC_GRANULARITY_MINIMUM flag. If ##CUmemAllocationProp{@code ::allocFlags::usage} contains
        #MEM_CREATE_USAGE_TILE_POOL flag then the memory allocation is intended only to be used as backing tile pool for sparse CUDA arrays and sparse CUDA
        mipmapped arrays. (see #MemMapArrayAsync()).
        """,

        Check(1)..CUmemGenericAllocationHandle.p("handle", "value of handle returned. All operations on this allocation are to be performed using this handle."),
        size_t("size", "size of the allocation requested"),
        CUmemAllocationProp.const.p("prop", "properties of the allocation to create"),
        unsigned_long_long("flags", "flags for future use, must be zero now")
    )

    IgnoreMissing..CUresult(
        "MemRelease",
        """
        Release a memory handle representing a memory allocation which was previously allocated through #MemCreate().

        Frees the memory that was allocated on a device through {@code cuMemCreate}.

        The memory allocation will be freed when all outstanding mappings to the memory are unmapped and when all outstanding references to the handle
        (including it's shareable counterparts) are also released. The generic memory handle can be freed when there are still outstanding mappings made with
        this handle. Each time a recepient process imports a shareable handle, it needs to pair it with #MemRelease() for the handle to be freed. If {@code
        handle} is not a valid handle the behavior is undefined.
        """,

        CUmemGenericAllocationHandle("handle", "value of handle which was returned previously by {@code cuMemCreate}")
    )

    IgnoreMissing..CUresult(
        "MemMap",
        """
        Maps an allocation handle to a reserved virtual address range.

        Maps bytes of memory represented by {@code handle} starting from byte {@code offset} to {@code size} to address range [ {@code addr}, {@code addr} +
        {@code size]}. This range must be an address reservation previously reserved with #MemAddressReserve(), and {@code offset} + {@code size} must be less
        than the size of the memory allocation. Both {@code ptr}, {@code size}, and {@code offset} must be a multiple of the value given via
        #MemGetAllocationGranularity() with the #MEM_ALLOC_GRANULARITY_MINIMUM flag.

        Please note calling #MemMap() does not make the address accessible, the caller needs to update accessibility of a contiguous mapped VA range by
        calling #MemSetAccess().

        Once a recipient process obtains a shareable memory handle from #MemImportFromShareableHandle(), the process must use #MemMap() to map the memory
        into its address ranges before setting accessibility with #MemSetAccess().

        #MemMap() can only create mappings on VA range reservations that are not currently mapped.
        """,

        CUdeviceptr("ptr", "address where memory will be mapped"),
        size_t("size", "size of the memory mapping"),
        size_t("offset", "offset into the memory represented by - {@code handle} from which to start mapping - Note: currently must be zero"),
        CUmemGenericAllocationHandle("handle", "handle to a shareable memory"),
        unsigned_long_long("flags", "flags for future use, must be zero now")
    )

    IgnoreMissing..CUresult(
        "MemMapArrayAsync",
        """
        Maps or unmaps subregions of sparse CUDA arrays and sparse CUDA mipmapped arrays.

        Performs map or unmap operations on subregions of sparse CUDA arrays and sparse CUDA mipmapped arrays. Each operation is specified by a
        ##CUarrayMapInfo entry in the {@code mapInfoList} array of size {@code count}.

        where {@code CUarrayMapInfo::resourceType} specifies the type of resource to be operated on. If {@code CUarrayMapInfo::resourceType} is set to
        #RESOURCE_TYPE_ARRAY then {@code CUarrayMapInfo::resource::array} must be set to a valid sparse CUDA array handle. The CUDA array must be
        either a 2D, 2D layered or 3D CUDA array and must have been allocated using #ArrayCreate() or #Array3DCreate() with the flag #CUDA_ARRAY3D_SPARSE.
        For CUDA arrays obtained using #MipmappedArrayGetLevel(), #CUDA_ERROR_INVALID_VALUE will be returned. If {@code CUarrayMapInfo::resourceType} is set to
        #RESOURCE_TYPE_MIPMAPPED_ARRAY then {@code CUarrayMapInfo::resource::mipmap} must be set to a valid sparse CUDA mipmapped array handle.
        The CUDA mipmapped array must be either a 2D, 2D layered or 3D CUDA mipmapped array and must have been allocated using #MipmappedArrayCreate() with
        the flag #CUDA_ARRAY3D_SPARSE.

        {@code CUarrayMapInfo::subresourceType} specifies the type of subresource within the resource.

        where #ARRAY_SPARSE_SUBRESOURCE_TYPE_SPARSE_LEVEL indicates a sparse-miplevel which spans at least one tile in every dimension. The remaining miplevels
        which are too small to span at least one tile in any dimension constitute the mip tail region as indicated by #ARRAY_SPARSE_SUBRESOURCE_TYPE_MIPTAIL
        subresource type.

        If {@code CUarrayMapInfo::subresourceType} is set to #ARRAY_SPARSE_SUBRESOURCE_TYPE_SPARSE_LEVEL then
        {@code CUarrayMapInfo::subresource::sparseLevel} struct must contain valid array subregion offsets and extents. The
        {@code CUarrayMapInfo::subresource::sparseLevel::offsetX}, {@code CUarrayMapInfo::subresource::sparseLevel::offsetY} and
        {@code CUarrayMapInfo::subresource::sparseLevel::offsetZ} must specify valid X, Y and Z offsets respectively. The
        {@code CUarrayMapInfo::subresource::sparseLevel::extentWidth}, {@code CUarrayMapInfo::subresource::sparseLevel::extentHeight} and
        {@code CUarrayMapInfo::subresource::sparseLevel::extentDepth} must specify valid width, height and depth extents respectively. These offsets and
        extents must be aligned to the corresponding tile dimension. For CUDA mipmapped arrays {@code CUarrayMapInfo::subresource::sparseLevel::level} must
        specify a valid mip level index. Otherwise, must be zero. For layered CUDA arrays and layered CUDA mipmapped arrays
        {@code CUarrayMapInfo::subresource::sparseLevel::layer} must specify a valid layer index. Otherwise, must be zero.
        {@code CUarrayMapInfo::subresource::sparseLevel::offsetZ} must be zero and {@code CUarrayMapInfo::subresource::sparseLevel::extentDepth} must be set to
        1 for 2D and 2D layered CUDA arrays and CUDA mipmapped arrays. Tile extents can be obtained by calling #ArrayGetSparseProperties() and
        #MipmappedArrayGetSparseProperties()

        If {@code CUarrayMapInfo::subresourceType} is set to #ARRAY_SPARSE_SUBRESOURCE_TYPE_MIPTAIL then {@code CUarrayMapInfo::subresource::miptail} struct
        must contain valid mip tail offset in {@code CUarrayMapInfo::subresource::miptail::offset} and size in
        {@code CUarrayMapInfo::subresource::miptail::size}. Both, mip tail offset and mip tail size must be aligned to the tile size. For layered CUDA
        mipmapped arrays which don't have the flag #ARRAY_SPARSE_PROPERTIES_SINGLE_MIPTAIL set in ##CUDA_ARRAY_SPARSE_PROPERTIES{@code ::flags} as returned by
        #MipmappedArrayGetSparseProperties(), {@code CUarrayMapInfo::subresource::miptail::layer} must specify a valid layer index. Otherwise, must be zero.

        {@code CUarrayMapInfo::memOperationType} specifies the type of operation.

        If {@code CUarrayMapInfo::memOperationType} is set to #MEM_OPERATION_TYPE_MAP then the subresource will be mapped onto the tile pool memory specified
        by {@code CUarrayMapInfo::memHandle} at offset {@code CUarrayMapInfo::offset}. The tile pool allocation has to be created by specifying the
        #MEM_CREATE_USAGE_TILE_POOL flag when calling #MemCreate(). Also, {@code CUarrayMapInfo::memHandleType} must be set to #MEM_HANDLE_TYPE_GENERIC.

        If {@code CUarrayMapInfo::memOperationType} is set to #MEM_OPERATION_TYPE_UNMAP then an unmapping operation is performed.
        {@code CUarrayMapInfo::memHandle} must be NULL.

        {@code CUarrayMapInfo::deviceBitMask} specifies the list of devices that must map or unmap physical memory. Currently, this mask must have exactly one
        bit set, and the corresponding device must match the device associated with the stream. If {@code CUarrayMapInfo::memOperationType} is set to
        #MEM_OPERATION_TYPE_MAP, the device must also match the device associated with the tile pool memory allocation as specified by
        {@code CUarrayMapInfo::memHandle}.

        {@code CUarrayMapInfo::flags} and {@code CUarrayMapInfo::reserved[]} are unused and must be set to zero.
        """,

        CUarrayMapInfo.p("mapInfoList", "list of {@code CUarrayMapInfo}"),
        AutoSize("mapInfoList")..unsigned_int("count", "count of {@code CUarrayMapInfo} in {@code mapInfoList}"),
        nullable..CUstream("hStream", "stream identifier for the stream to use for map or unmap operations")
    ).ptsz()

    IgnoreMissing..CUresult(
        "MemUnmap",
        """
        Unmap the backing memory of a given address range.

        The range must be the entire contiguous address range that was mapped to. In other words, #MemUnmap() cannot unmap a sub-range of an address range
        mapped by #MemCreate() / #MemMap(). Any backing memory allocations will be freed if there are no existing mappings and there are no unreleased memory
        handles.

        When #MemUnmap() returns successfully the address range is converted to an address reservation and can be used for a future calls to #MemMap(). Any
        new mapping to this virtual address will need to have access granted through #MemSetAccess(), as all mappings start with no accessibility setup.
        """,

        CUdeviceptr("ptr", "starting address for the virtual address range to unmap"),
        size_t("size", "size of the virtual address range to unmap")
    )

    IgnoreMissing..CUresult(
        "MemSetAccess",
        """
        Set the access flags for each location specified in {@code desc} for the given virtual address range.

        Given the virtual address range via {@code ptr} and {@code size}, and the locations in the array given by {@code desc} and {@code count}, set the
        access flags for the target locations. The range must be a fully mapped address range containing all allocations created by #MemMap() / #MemCreate().
        """,

        CUdeviceptr("ptr", "starting address for the virtual address range"),
        size_t("size", "length of the virtual address range"),
        CUmemAccessDesc.const.p("desc", "array of {@code CUmemAccessDesc} that describe how to change the - mapping for each location specified"),
        AutoSize("desc")..size_t("count", "number of {@code CUmemAccessDesc} in {@code desc}")
    )

    IgnoreMissing..CUresult(
        "MemGetAccess",
        "Get the access {@code flags} set for the given {@code location} and {@code ptr}.",

        Check(1)..unsigned_long_long.p("flags", "flags set for this location"),
        CUmemLocation.const.p("location", "location in which to check the flags for"),
        CUdeviceptr("ptr", "address in which to check the access flags for")
    )

    IgnoreMissing..CUresult(
        "MemExportToShareableHandle",
        """
        Exports an allocation to a requested shareable handle type.

        Given a CUDA memory handle, create a shareable memory allocation handle that can be used to share the memory with other processes. The recipient
        process can convert the shareable handle back into a CUDA memory handle using #MemImportFromShareableHandle() and map it with #MemMap(). The
        implementation of what this handle is and how it can be transferred is defined by the requested handle type in {@code handleType}.

        Once all shareable handles are closed and the allocation is released, the allocated memory referenced will be released back to the OS and uses of the
        CUDA handle afterward will lead to undefined behavior.

        This API can also be used in conjunction with other APIs (e.g. Vulkan, OpenGL) that support importing memory from the shareable type
        """,

        MultiType(PointerMapping.DATA_POINTER)..Unsafe..void.p("shareableHandle", "pointer to the location in which to store the requested handle type"),
        CUmemGenericAllocationHandle("handle", "CUDA handle for the memory allocation"),
        CUmemAllocationHandleType("handleType", "type of shareable handle requested (defines type and size of the {@code shareableHandle} output parameter)"),
        unsigned_long_long("flags", "reserved, must be zero")
    )

    IgnoreMissing..CUresult(
        "MemImportFromShareableHandle",
        """
        Imports an allocation from a requested shareable handle type.

        If the current process cannot support the memory described by this shareable handle, this API will error as #CUDA_ERROR_NOT_SUPPORTED.

        ${note("""
        Importing shareable handles exported from some graphics APIs(VUlkan, OpenGL, etc) created on devices under an SLI group may not be supported, and thus
        this API will return #CUDA_ERROR_NOT_SUPPORTED. There is no guarantee that the contents of {@code handle} will be the same CUDA memory handle for the
        same given OS shareable handle, or the same underlying allocation.
        """)}
        """,

        Check(1)..CUmemGenericAllocationHandle.p("handle", "CUDA Memory handle for the memory allocation"),
        opaque_p("osHandle", "shareable Handle representing the memory allocation that is to be imported"),
        CUmemAllocationHandleType("shHandleType", "handle type of the exported handle {@code CUmemAllocationHandleType}")
    )

    IgnoreMissing..CUresult(
        "MemGetAllocationGranularity",
        """
        Calculates either the minimal or recommended granularity.

        Calculates either the minimal or recommended granularity for a given allocation specification and returns it in granularity. This granularity can be
        used as a multiple for alignment, size, or address mapping.
        """,

        Check(1)..size_t.p("granularity", "returned granularity"),
        CUmemAllocationProp.const.p("prop", "property for which to determine the granularity for"),
        CUmemAllocationGranularity_flags("option", "determines which granularity to return")
    )

    IgnoreMissing..CUresult(
        "MemGetAllocationPropertiesFromHandle",
        "Retrieve the contents of the property structure defining properties for this handle.",

        CUmemAllocationProp.p("prop", "pointer to a properties structure which will hold the information about this handle"),
        CUmemGenericAllocationHandle("handle", "handle which to perform the query on")
    )

    IgnoreMissing..CUresult(
        "MemRetainAllocationHandle",
        """
        Given an address {@code addr}, returns the allocation handle of the backing memory allocation.

        The handle is guaranteed to be the same handle value used to map the memory. If the address requested is not mapped, the function will fail. The
        returned handle must be released with corresponding number of calls to #MemRelease().

        ${note("""The address {@code addr}, can be any address in a range previously mapped by #MemMap(), and not necessarily the start address.""")}
        """,

        Check(1)..CUmemGenericAllocationHandle.p("handle", "CUDA Memory handle for the backing memory allocation"),
        Unsafe..void.p("addr", "memory address to query, that has been mapped previously")
    )

    IgnoreMissing..CUresult(
        "MemFreeAsync",
        """
        Frees memory with stream ordered semantics.

        Inserts a free operation into {@code hStream}. The allocation must not be accessed after stream execution reaches the free. After this API returns,
        accessing the memory from any subsequent work launched on the GPU or querying its pointer attributes results in undefined behavior.

        ${note("""During stream capture, this function results in the creation of a free node and must therefore be passed the address of a graph
        allocation.""")}
        """,

        CUdeviceptr("dptr", "memory to free"),
        nullable..CUstream("hStream", "the stream establishing the stream ordering contract")
    ).ptsz()

    IgnoreMissing..CUresult(
        "MemAllocAsync",
        """
        Allocates memory with stream ordered semantics

        Inserts an allocation operation into {@code hStream}. A pointer to the allocated memory is returned immediately in {@code *dptr}. The allocation must
        not be accessed until the the allocation operation completes. The allocation comes from the memory pool current to the stream's device.

        ${note("""The default memory pool of a device contains device memory from that device.""")}

        ${note("""Basic stream ordering allows future work submitted into the same stream to use the allocation. Stream query, stream synchronize, and CUDA
        events can be used to guarantee that the allocation operation completes before work submitted in a separate stream runs.""")}

        ${note("""During stream capture, this function results in the creation of an allocation node. In this case, the allocation is owned by the graph
        instead of the memory pool. The memory pool's properties are used to set the node's creation parameters.""")}
        """,

        Check(1)..CUdeviceptr.p("dptr", "returned device pointer"),
        size_t("bytesize", "number of bytes to allocate"),
        nullable..CUstream("hStream", "the stream establishing the stream ordering contract and the memory pool to allocate from")
    ).ptsz()

    IgnoreMissing..CUresult(
        "MemPoolTrimTo",
        """
        Tries to release memory back to the OS.

        Releases memory back to the OS until the pool contains fewer than {@code minBytesToKeep} reserved bytes, or there is no more memory that the allocator
        can safely release. The allocator cannot release OS allocations that back outstanding asynchronous allocations. The OS allocations may happen at
        different granularity from the user allocations.

        ${note("""Allocations that have not been freed count as outstanding.""")}

        ${note("""Allocations that have been asynchronously freed but whose completion has not been observed on the host (eg. by a synchronize) can count as
        outstanding.""")}
        """,

        CUmemoryPool("pool", "the memory pool to trim"),
        size_t(
            "minBytesToKeep",
            """
            if the pool has less than {@code minBytesToKeep} reserved, the {@code TrimTo} operation is a no-op. Otherwise the pool will be guaranteed to have
            at least {@code minBytesToKeep} bytes reserved after the operation.
            """
        )
    )

    IgnoreMissing..CUresult(
        "MemPoolSetAttribute",
        "Sets attributes of a memory pool.",

        CUmemoryPool("pool", "the memory pool to modify"),
        CUmemPool_attribute("attr", "the attribute to modify", "MEMPOOL_ATTR_\\w+"),
        MultiType(PointerMapping.DATA_INT, PointerMapping.DATA_LONG)..Unsafe..void.p("value", "pointer to the value to assign")
    )

    IgnoreMissing..CUresult(
        "MemPoolGetAttribute",
        "Gets attributes of a memory pool.",

        CUmemoryPool("pool", "the memory pool to get attributes of"),
        CUmemPool_attribute("attr", "the attribute to get", "MEMPOOL_ATTR_\\w+"),
        MultiType(PointerMapping.DATA_INT, PointerMapping.DATA_LONG)..Unsafe..void.p("value", "retrieved value")
    )

    IgnoreMissing..CUresult(
        "MemPoolSetAccess",
        "Controls visibility of pools between devices.",

        CUmemoryPool("pool", "the pool being modified"),
        CUmemAccessDesc.const.p("map", "array of access descriptors. Each descriptor instructs the access to enable for a single gpu."),
        AutoSize("map")..size_t("count", "number of descriptors in the map array")
    )

    IgnoreMissing..CUresult(
        "MemPoolGetAccess",
        """
        Returns the accessibility of a pool from a device.

        Returns the accessibility of the pool's memory from the specified location.
        """,

        Check(1)..CUmemAccess_flags.p("flags", "the accessibility of the pool from the specified location"),
        CUmemoryPool("memPool", "the pool being queried"),
        CUmemLocation.p("location", "the location accessing the pool")
    )

    IgnoreMissing..CUresult(
        "MemPoolCreate",
        """
        Creates a memory pool.

        Creates a CUDA memory pool and returns the handle in {@code pool}. The {@code poolProps} determines the properties of the pool such as the backing
        device and IPC capabilities.

        By default, the pool's memory will be accessible from the device it is allocated on.

        ${note("""Specifying #MEM_HANDLE_TYPE_NONE creates a memory pool that will not support IPC.""")}
        """,

        Check(1)..CUmemoryPool.p("pool", ""),
        CUmemPoolProps.const.p("poolProps", "")
    )

    IgnoreMissing..CUresult(
        "MemPoolDestroy",
        """
        Destroys the specified memory pool.

        If any pointers obtained from this pool haven't been freed or the pool has free operations that haven't completed when #MemPoolDestroy() is invoked,
        the function will return immediately and the resources associated with the pool will be released automatically once there are no more outstanding
        allocations.

        Destroying the current mempool of a device sets the default mempool of that device as the current mempool for that device.

        ${note("""A device's default memory pool cannot be destroyed.""")}
        """,

        CUmemoryPool("pool", "")
    )

    IgnoreMissing..CUresult(
        "MemAllocFromPoolAsync",
        """
        Allocates memory from a specified pool with stream ordered semantics.

        Inserts an allocation operation into {@code hStream}. A pointer to the allocated memory is returned immediately in {@code *dptr}. The allocation must
        not be accessed until the the allocation operation completes. The allocation comes from the specified memory pool.

        ${note("""The specified memory pool may be from a device different than that of the specified {@code hStream}.""")}

        ${ul(
            """
            Basic stream ordering allows future work submitted into the same stream to use the allocation. Stream query, stream synchronize, and CUDA events
            can be used to guarantee that the allocation operation completes before work submitted in a separate stream runs.
            """
        )}

        ${note("""During stream capture, this function results in the creation of an allocation node. In this case, the allocation is owned by the graph
        instead of the memory pool. The memory pool's properties are used to set the node's creation parameters.""")}
        """,

        Check(1)..CUdeviceptr.p("dptr", "returned device pointer"),
        size_t("bytesize", "number of bytes to allocate"),
        CUmemoryPool("pool", "the pool to allocate from"),
        nullable..CUstream("hStream", "the stream establishing the stream ordering semantic")
    ).ptsz()

    IgnoreMissing..CUresult(
        "MemPoolExportToShareableHandle",
        """
        Exports a memory pool to the requested handle type.

        Given an IPC capable mempool, create an OS handle to share the pool with another process. A recipient process can convert the shareable handle into a
        mempool with #MemPoolImportFromShareableHandle(). Individual pointers can then be shared with the #MemPoolExportPointer() and
        #MemPoolImportPointer() APIs. The implementation of what the shareable handle is and how it can be transferred is defined by the requested handle
        type.

        ${note("""To create an IPC capable mempool, create a mempool with a {@code CUmemAllocationHandleType} other than #MEM_HANDLE_TYPE_NONE.""")}
        """,

        MultiType(PointerMapping.DATA_POINTER)..Unsafe..void.p("handle_out", "returned OS handle"),
        CUmemoryPool("pool", "pool to export"),
        CUmemAllocationHandleType("handleType", "the type of handle to create"),
        unsigned_long_long("flags", "must be 0")
    )

    IgnoreMissing..CUresult(
        "MemPoolImportFromShareableHandle",
        """
        Imports a memory pool from a shared handle.

        Specific allocations can be imported from the imported pool with #MemPoolImportPointer().

        ${note("""Imported memory pools do not support creating new allocations. As such imported memory pools may not be used in #DeviceSetMemPool() or
        #MemAllocFromPoolAsync() calls.""")}
        """,

        Check(1)..CUmemoryPool.p("pool_out", "returned memory pool"),
        MultiType(PointerMapping.DATA_POINTER)..Unsafe..void.p("handle", "OS handle of the pool to open"),
        CUmemAllocationHandleType("handleType", "the type of handle being imported"),
        unsigned_long_long("flags", "must be 0")
    )

    IgnoreMissing..CUresult(
        "MemPoolExportPointer",
        """
        Export data to share a memory pool allocation between processes.

        Constructs {@code shareData_out} for sharing a specific allocation from an already shared memory pool. The recipient process can import the allocation
        with the #MemPoolImportPointer() api. The data is not a handle and may be shared through any IPC mechanism.
        """,

        CUmemPoolPtrExportData.p("shareData_out", "returned export data"),
        CUdeviceptr("ptr", "pointer to memory being exported")
    )

    IgnoreMissing..CUresult(
        "MemPoolImportPointer",
        """
        Import a memory pool allocation from another process.

        Returns in {@code ptr_out} a pointer to the imported memory. The imported memory must not be accessed before the allocation operation completes in the
        exporting process. The imported memory must be freed from all importing processes before being freed in the exporting process. The pointer may be freed
        with #MemFree() or #MemFreeAsync(). If {@code cuMemFreeAsync} is used, the free must be completed on the importing process before the free operation on
        the exporting process.

        ${note("""The {@code cuMemFreeAsync} api may be used in the exporting process before the cuMemFreeAsync operation completes in its stream as long as
        the {@code cuMemFreeAsync} in the exporting process specifies a stream with a stream dependency on the importing process's {@code cuMemFreeAsync}.""")}
        """,

        Check(1)..CUdeviceptr.p("ptr_out", "pointer to imported memory"),
        CUmemoryPool("pool", "pool from which to import"),
        CUmemPoolPtrExportData.p("shareData", "data specifying the memory to import")
    )

    IgnoreMissing..CUresult(
        "PointerGetAttribute",
        """
        Returns information about a pointer.

        The supported attributes are:
        ${ul(
            """
            #POINTER_ATTRIBUTE_CONTEXT: Returns in {@code *data} the {@code CUcontext} in which {@code ptr} was allocated or registered. The type of
            {@code data} must be {@code CUcontext *}.

            If {@code ptr} was not allocated by, mapped by, or registered with a {@code CUcontext} which uses unified virtual addressing then
            #CUDA_ERROR_INVALID_VALUE is returned.
            """,
            """
            #POINTER_ATTRIBUTE_MEMORY_TYPE:

            Returns in {@code *data} the physical memory type of the memory that {@code ptr} addresses as a {@code CUmemorytype} enumerated value. The type of
            {@code data} must be unsigned int.

            If {@code ptr} addresses device memory then {@code *data} is set to #MEMORYTYPE_DEVICE. The particular {@code CUdevice} on which the memory resides
            is the {@code CUdevice} of the {@code CUcontext} returned by the #POINTER_ATTRIBUTE_CONTEXT attribute of {@code ptr}.

            If {@code ptr} addresses host memory then {@code *data} is set to #MEMORYTYPE_HOST.

            If {@code ptr} was not allocated by, mapped by, or registered with a {@code CUcontext} which uses unified virtual addressing then
            #CUDA_ERROR_INVALID_VALUE is returned.

            If the current {@code CUcontext} does not support unified virtual addressing then #CUDA_ERROR_INVALID_CONTEXT is returned.
            """,
            """
            #POINTER_ATTRIBUTE_DEVICE_POINTER: Returns in {@code *data} the device pointer value through which {@code ptr} may be accessed by kernels running
            in the current {@code CUcontext}. The type of {@code data} must be {@code CUdeviceptr *}.

            If there exists no device pointer value through which kernels running in the current {@code CUcontext} may access {@code ptr} then
            #CUDA_ERROR_INVALID_VALUE is returned.

            If there is no current {@code CUcontext} then #CUDA_ERROR_INVALID_CONTEXT is returned.

            Except in the exceptional disjoint addressing cases discussed below, the value returned in {@code *data} will equal the input value {@code ptr}.
            """,
            """
            #POINTER_ATTRIBUTE_HOST_POINTER: Returns in {@code *data} the host pointer value through which {@code ptr} may be accessed by by the host program.
            The type of {@code data} must be {@code void **}. If there exists no host pointer value through which the host program may directly access
            {@code ptr} then #CUDA_ERROR_INVALID_VALUE is returned.

            Except in the exceptional disjoint addressing cases discussed below, the value returned in {@code *data} will equal the input value {@code ptr}.
            """,
            """
            #POINTER_ATTRIBUTE_P2P_TOKENS: Returns in {@code *data} two tokens for use with the nv-p2p.h Linux kernel interface. {@code data} must be a struct
            of type ##CUDA_POINTER_ATTRIBUTE_P2P_TOKENS.

            {@code ptr} must be a pointer to memory obtained from #MemAlloc(). Note that {@code p2pToken} and {@code vaSpaceToken} are only valid for the
            lifetime of the source allocation. A subsequent allocation at the same address may return completely different tokens. Querying this attribute has
            a side effect of setting the attribute #POINTER_ATTRIBUTE_SYNC_MEMOPS for the region of memory that {@code ptr} points to.
            """,
            """
            #POINTER_ATTRIBUTE_SYNC_MEMOPS:

            A boolean attribute which when set, ensures that synchronous memory operations initiated on the region of memory that {@code ptr} points to will
            always synchronize. See further documentation in the section titled "API synchronization behavior" to learn more about cases when synchronous
            memory operations can exhibit asynchronous behavior.
            """,
            """
            #POINTER_ATTRIBUTE_BUFFER_ID: Returns in {@code *data} a buffer ID which is guaranteed to be unique within the process. {@code data} must point to
            an unsigned long long.

            {@code ptr} must be a pointer to memory obtained from a CUDA memory allocation API. Every memory allocation from any of the CUDA memory allocation
            APIs will have a unique ID over a process lifetime. Subsequent allocations do not reuse IDs from previous freed allocations. IDs are only unique
            within a single process.
            """,
            """
            #POINTER_ATTRIBUTE_IS_MANAGED: Returns in {@code *data} a boolean that indicates whether the pointer points to managed memory or not.

            If {@code ptr} is not a valid CUDA pointer then #CUDA_ERROR_INVALID_VALUE is returned.
            """,
            """
            #POINTER_ATTRIBUTE_DEVICE_ORDINAL: Returns in {@code *data} an integer representing a device ordinal of a device against which the memory was
            allocated or registered.
            """,
            """
            #POINTER_ATTRIBUTE_IS_LEGACY_CUDA_IPC_CAPABLE: Returns in {@code *data} a boolean that indicates if this pointer maps to an allocation that is
            suitable for {@code cudaIpcGetMemHandle()}.
            """,
            """
            #POINTER_ATTRIBUTE_RANGE_START_ADDR: Returns in {@code *data} the starting address for the allocation referenced by the device pointer {@code ptr}.
            Note that this is not necessarily the address of the mapped region, but the address of the mappable address range {@code ptr} references (e.g. from
            #MemAddressReserve()).
            """,
            """
            #POINTER_ATTRIBUTE_RANGE_SIZE: Returns in {@code *data} the size for the allocation referenced by the device pointer {@code ptr}. Note that this is
            not necessarily the size of the mapped region, but the size of the mappable address range {@code ptr} references (e.g. from #MemAddressReserve()).
            To retrieve the size of the mapped region, see #MemGetAddressRange().
            """,
            """
            #POINTER_ATTRIBUTE_MAPPED: Returns in {@code *data} a boolean that indicates if this pointer is in a valid address range that is mapped to a
            backing allocation.
            """,
            """
            #POINTER_ATTRIBUTE_ALLOWED_HANDLE_TYPES: Returns a bitmask of the allowed handle types for an allocation that may be passed to
            #MemExportToShareableHandle().
            """,
            "#POINTER_ATTRIBUTE_MEMPOOL_HANDLE: Returns in {@code *data} the handle to the mempool that the allocation was obtained from."
        )}

        Note that for most allocations in the unified virtual address space the host and device pointer for accessing the allocation will be the same. The
        exceptions to this are - user memory registered using #MemHostRegister() - host memory allocated using #MemHostAlloc() with the
        #MEMHOSTALLOC_WRITECOMBINED flag For these types of allocation there will exist separate, disjoint host and device addresses for accessing the
        allocation. In particular
        ${ul(
            "The host address will correspond to an invalid unmapped device address (which will result in an exception if accessed from the device)",
            "The device address will correspond to an invalid unmapped host address (which will result in an exception if accessed from the host)."
        )}

        For these types of allocations, querying #POINTER_ATTRIBUTE_HOST_POINTER and #POINTER_ATTRIBUTE_DEVICE_POINTER may be used to retrieve the host and
        device addresses from either address.
        """,

        MultiType(
            PointerMapping.DATA_POINTER,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_LONG
        )..Unsafe..void.p("data", "returned pointer attribute value"),
        CUpointer_attribute("attribute", "pointer attribute to query"),
        CUdeviceptr("ptr", "pointer")
    )

    IgnoreMissing..CUresult(
        "MemPrefetchAsync",
        """
        Prefetches memory to the specified destination device,

        Prefetches memory to the specified destination device. {@code devPtr} is the base device pointer of the memory to be prefetched and {@code dstDevice}
        is the destination device. {@code count} specifies the number of bytes to copy. {@code hStream} is the stream in which the operation is enqueued. The
        memory range must refer to managed memory allocated via #MemAllocManaged() or declared via __managed__ variables.

        Passing in #DEVICE_CPU for {@code dstDevice} will prefetch the data to host memory. If {@code dstDevice} is a GPU, then the device attribute
        #DEVICE_ATTRIBUTE_CONCURRENT_MANAGED_ACCESS must be non-zero. Additionally, {@code hStream} must be associated with a device that has a non-zero
        value for the device attribute #DEVICE_ATTRIBUTE_CONCURRENT_MANAGED_ACCESS.

        The start address and end address of the memory range will be rounded down and rounded up respectively to be aligned to CPU page size before the
        prefetch operation is enqueued in the stream.

        If no physical memory has been allocated for this region, then this memory region will be populated and mapped on the destination device. If there's
        insufficient memory to prefetch the desired region, the Unified Memory driver may evict pages from other #MemAllocManaged() allocations to host memory
        in order to make room. Device memory allocated using #MemAlloc() or #ArrayCreate() will not be evicted.

        By default, any mappings to the previous location of the migrated pages are removed and mappings for the new location are only setup on {@code
        dstDevice}. The exact behavior however also depends on the settings applied to this memory range via #MemAdvise() as described below:

        If #MEM_ADVISE_SET_READ_MOSTLY was set on any subset of this memory range, then that subset will create a read-only copy of the pages on {@code
        dstDevice}.

        If #MEM_ADVISE_SET_PREFERRED_LOCATION was called on any subset of this memory range, then the pages will be migrated to {@code dstDevice} even if
        {@code dstDevice} is not the preferred location of any pages in the memory range.

        If #MEM_ADVISE_SET_ACCESSED_BY was called on any subset of this memory range, then mappings to those pages from all the appropriate processors are
        updated to refer to the new location if establishing such a mapping is possible. Otherwise, those mappings are cleared.

        Note that this API is not required for functionality and only serves to improve performance by allowing the application to migrate data to a suitable
        location before it is accessed. Memory accesses to this range are always coherent and are allowed even when the data is actively being migrated.

        Note that this function is asynchronous with respect to the host and all work on other devices.
        """,

        CUdeviceptr("devPtr", "pointer to be prefetched"),
        size_t("count", "size in bytes"),
        CUdevice("dstDevice", "destination device to prefetch to"),
        nullable..CUstream("hStream", "stream to enqueue prefetch operation")
    ).ptsz()

    IgnoreMissing..CUresult(
        "MemAdvise",
        """
        Advise about the usage of a given memory range.

        Advise the Unified Memory subsystem about the usage pattern for the memory range starting at {@code devPtr} with a size of {@code count} bytes. The
        start address and end address of the memory range will be rounded down and rounded up respectively to be aligned to CPU page size before the advice is
        applied. The memory range must refer to managed memory allocated via #MemAllocManaged() or declared via __managed__ variables. The memory range
        could also refer to system-allocated pageable memory provided it represents a valid, host-accessible region of memory and all additional constraints
        imposed by {@code advice} as outlined below are also satisfied. Specifying an invalid system-allocated pageable memory range results in an error being
        returned.

        The {@code advice} parameter can take the following values:
        ${ul(
            """
            #MEM_ADVISE_SET_READ_MOSTLY: This implies that the data is mostly going to be read from and only occasionally written to. Any read accesses
            from any processor to this region will create a read-only copy of at least the accessed pages in that processor's memory. Additionally, if
            #MemPrefetchAsync() is called on this region, it will create a read-only copy of the data on the destination processor. If any processor writes to
            this region, all copies of the corresponding page will be invalidated except for the one where the write occurred. The {@code device} argument is
            ignored for this advice. Note that for a page to be read-duplicated, the accessing processor must either be the CPU or a GPU that has a non-zero
            value for the device attribute #DEVICE_ATTRIBUTE_CONCURRENT_MANAGED_ACCESS. Also, if a context is created on a device that does not have the
            device attribute #DEVICE_ATTRIBUTE_CONCURRENT_MANAGED_ACCESS set, then read-duplication will not occur until all such contexts are destroyed.
            If the memory region refers to valid system-allocated pageable memory, then the accessing device must have a non-zero value for the device
            attribute #DEVICE_ATTRIBUTE_PAGEABLE_MEMORY_ACCESS for a read-only copy to be created on that device. Note however that if the accessing device
            also has a non-zero value for the device attribute #DEVICE_ATTRIBUTE_PAGEABLE_MEMORY_ACCESS_USES_HOST_PAGE_TABLES, then setting this advice
            will not create a read-only copy when that device accesses this memory region.
            """,
            """
            #MEM_ADVISE_UNSET_READ_MOSTLY: Undoes the effect of #MEM_ADVISE_SET_READ_MOSTLY and also prevents the Unified Memory driver from attempting
            heuristic read-duplication on the memory range. Any read-duplicated copies of the data will be collapsed into a single copy. The location for the
            collapsed copy will be the preferred location if the page has a preferred location and one of the read-duplicated copies was resident at that
            location. Otherwise, the location chosen is arbitrary.
            """,
            """
            #MEM_ADVISE_SET_PREFERRED_LOCATION: This advice sets the preferred location for the data to be the memory belonging to {@code device}. Passing
            in CU_DEVICE_CPU for {@code device} sets the preferred location as host memory. If {@code device} is a GPU, then it must have a non-zero value for
            the device attribute #DEVICE_ATTRIBUTE_CONCURRENT_MANAGED_ACCESS. Setting the preferred location does not cause data to migrate to that
            location immediately. Instead, it guides the migration policy when a fault occurs on that memory region. If the data is already in its preferred
            location and the faulting processor can establish a mapping without requiring the data to be migrated, then data migration will be avoided. On the
            other hand, if the data is not in its preferred location or if a direct mapping cannot be established, then it will be migrated to the processor
            accessing it. It is important to note that setting the preferred location does not prevent data prefetching done using #MemPrefetchAsync(). Having
            a preferred location can override the page thrash detection and resolution logic in the Unified Memory driver. Normally, if a page is detected to
            be constantly thrashing between for example host and device memory, the page may eventually be pinned to host memory by the Unified Memory driver.
            But if the preferred location is set as device memory, then the page will continue to thrash indefinitely. If #MEM_ADVISE_SET_READ_MOSTLY is
            also set on this memory region or any subset of it, then the policies associated with that advice will override the policies of this advice, unless
            read accesses from {@code device} will not result in a read-only copy being created on that device as outlined in description for the advice
            #MEM_ADVISE_SET_READ_MOSTLY. If the memory region refers to valid system-allocated pageable memory, then {@code device} must have a non-zero
            value for the device attribute #DEVICE_ATTRIBUTE_PAGEABLE_MEMORY_ACCESS. Additionally, if {@code device} has a non-zero value for the device
            attribute #DEVICE_ATTRIBUTE_PAGEABLE_MEMORY_ACCESS_USES_HOST_PAGE_TABLES, then this call has no effect. Note however that this behavior may
            change in the future.
            """,
            "#MEM_ADVISE_UNSET_PREFERRED_LOCATION: Undoes the effect of #MEM_ADVISE_SET_PREFERRED_LOCATION and changes the preferred location to none.",
            """
            #MEM_ADVISE_SET_ACCESSED_BY: This advice implies that the data will be accessed by {@code device}. Passing in #DEVICE_CPU for {@code
            device} will set the advice for the CPU. If {@code device} is a GPU, then the device attribute #DEVICE_ATTRIBUTE_CONCURRENT_MANAGED_ACCESS must
            be non-zero. This advice does not cause data migration and has no impact on the location of the data per se. Instead, it causes the data to always
            be mapped in the specified processor's page tables, as long as the location of the data permits a mapping to be established. If the data gets
            migrated for any reason, the mappings are updated accordingly. This advice is recommended in scenarios where data locality is not important, but
            avoiding faults is. Consider for example a system containing multiple GPUs with peer-to-peer access enabled, where the data located on one GPU is
            occasionally accessed by peer GPUs. In such scenarios, migrating data over to the other GPUs is not as important because the accesses are
            infrequent and the overhead of migration may be too high. But preventing faults can still help improve performance, and so having a mapping set up
            in advance is useful. Note that on CPU access of this data, the data may be migrated to host memory because the CPU typically cannot access device
            memory directly. Any GPU that had the #MEM_ADVISE_SET_ACCESSED_BY flag set for this data will now have its mapping updated to point to the page
            in host memory. If #MEM_ADVISE_SET_READ_MOSTLY is also set on this memory region or any subset of it, then the policies associated with that
            advice will override the policies of this advice. Additionally, if the preferred location of this memory region or any subset of it is also {@code
            device}, then the policies associated with #MEM_ADVISE_SET_PREFERRED_LOCATION will override the policies of this advice. If the memory region
            refers to valid system-allocated pageable memory, then {@code device} must have a non-zero value for the device attribute
            #DEVICE_ATTRIBUTE_PAGEABLE_MEMORY_ACCESS. Additionally, if {@code device} has a non-zero value for the device attribute
            #DEVICE_ATTRIBUTE_PAGEABLE_MEMORY_ACCESS_USES_HOST_PAGE_TABLES, then this call has no effect.
            """,
            """
            #MEM_ADVISE_UNSET_ACCESSED_BY: Undoes the effect of #MEM_ADVISE_SET_ACCESSED_BY. Any mappings to the data from {@code device} may be
            removed at any time causing accesses to result in non-fatal page faults. If the memory region refers to valid system-allocated pageable memory,
            then {@code device} must have a non-zero value for the device attribute #DEVICE_ATTRIBUTE_PAGEABLE_MEMORY_ACCESS. Additionally, if {@code
            device} has a non-zero value for the device attribute #DEVICE_ATTRIBUTE_PAGEABLE_MEMORY_ACCESS_USES_HOST_PAGE_TABLES, then this call has no
            effect.
            """
        )}
        """,

        CUdeviceptr("devPtr", "pointer to memory to set the advice for"),
        size_t("count", "size in bytes of the memory range"),
        CUmem_advise("advice", "advice to be applied for the specified memory range"),
        CUdevice("device", "device to apply the advice for")
    )

    IgnoreMissing..CUresult(
        "MemRangeGetAttribute",
        """
        Query an attribute of a given memory range.

        Query an attribute about the memory range starting at {@code devPtr} with a size of {@code count} bytes. The memory range must refer to managed memory
        allocated via #MemAllocManaged() or declared via __managed__ variables.

        The {@code attribute} parameter can take the following values:
        ${ul(
            """
            #MEM_RANGE_ATTRIBUTE_READ_MOSTLY: If this attribute is specified, {@code data} will be interpreted as a 32-bit integer, and {@code dataSize}
            must be 4. The result returned will be 1 if all pages in the given memory range have read-duplication enabled, or 0 otherwise.
            """,
            """
            #MEM_RANGE_ATTRIBUTE_PREFERRED_LOCATION: If this attribute is specified, {@code data} will be interpreted as a 32-bit integer, and {@code
            dataSize} must be 4. The result returned will be a GPU device id if all pages in the memory range have that GPU as their preferred location, or it
            will be CU_DEVICE_CPU if all pages in the memory range have the CPU as their preferred location, or it will be CU_DEVICE_INVALID if either all the
            pages don't have the same preferred location or some of the pages don't have a preferred location at all. Note that the actual location of the
            pages in the memory range at the time of the query may be different from the preferred location.
            """,
            """
            #MEM_RANGE_ATTRIBUTE_ACCESSED_BY: If this attribute is specified, {@code data} will be interpreted as an array of 32-bit integers, and {@code
            dataSize} must be a non-zero multiple of 4. The result returned will be a list of device ids that had #MEM_ADVISE_SET_ACCESSED_BY set for that
            entire memory range. If any device does not have that advice set for the entire memory range, that device will not be included. If {@code data} is
            larger than the number of devices that have that advice set for that memory range, CU_DEVICE_INVALID will be returned in all the extra space
            provided. For ex., if {@code dataSize} is 12 (i.e. {@code data} has 3 elements) and only device 0 has the advice set, then the result returned will
            be { 0, CU_DEVICE_INVALID, CU_DEVICE_INVALID }. If {@code data} is smaller than the number of devices that have that advice set, then only as many
            devices will be returned as can fit in the array. There is no guarantee on which specific devices will be returned, however.
            """,
            """
            #MEM_RANGE_ATTRIBUTE_LAST_PREFETCH_LOCATION: If this attribute is specified, {@code data} will be interpreted as a 32-bit integer, and {@code
            dataSize} must be 4. The result returned will be the last location to which all pages in the memory range were prefetched explicitly via
            #MemPrefetchAsync(). This will either be a GPU id or CU_DEVICE_CPU depending on whether the last location for prefetch was a GPU or the CPU
            respectively. If any page in the memory range was never explicitly prefetched or if all pages were not prefetched to the same location,
            CU_DEVICE_INVALID will be returned. Note that this simply returns the last location that the applicaton requested to prefetch the memory range to.
            It gives no indication as to whether the prefetch operation to that location has completed or even begun.
            """
        )}
        """,

        void.p("data", "a pointers to a memory location where the result of each attribute query will be written to"),
        AutoSize("data")..size_t("dataSize", "the size of {@code data}"),
        CUmem_range_attribute("attribute", "the attribute to query"),
        CUdeviceptr("devPtr", "start of the range to query"),
        size_t("count", "size of the range to query")
    )

    IgnoreMissing..CUresult(
        "MemRangeGetAttributes",
        """
        Query attributes of a given memory range.

        Query attributes of the memory range starting at {@code devPtr} with a size of {@code count} bytes. The memory range must refer to managed memory
        allocated via #MemAllocManaged() or declared via __managed__ variables. The {@code attributes} array will be interpreted to have {@code numAttributes}
        entries. The {@code dataSizes} array will also be interpreted to have {@code numAttributes} entries. The results of the query will be stored in {@code data}.

        The list of supported attributes are given below. Please refer to #MemRangeGetAttribute() for attribute descriptions and restrictions.

        ${ul(
            "#MEM_RANGE_ATTRIBUTE_READ_MOSTLY",
            "#MEM_RANGE_ATTRIBUTE_PREFERRED_LOCATION",
            "#MEM_RANGE_ATTRIBUTE_ACCESSED_BY",
            "#MEM_RANGE_ATTRIBUTE_LAST_PREFETCH_LOCATION"
        )}
        """,

        void.p.p("data", "a two-dimensional array containing pointers to memory locations where the result of each attribute query will be written to"),
        size_t.p("dataSizes", "array containing the sizes of each result"),
        CUmem_range_attribute.p(
            "attributes",
            "an array of attributes to query (numAttributes and the number of attributes in this array should match)",
            "MEM_RANGE_ATTRIBUTE_\\w+"),
        AutoSize(
            "attributes",
            "data",
            "dataSizes"
        )..size_t("numAttributes", "number of attributes to query"),
        CUdeviceptr("devPtr", "start of the range to query"),
        size_t("count", "size of the range to query")
    )

    IgnoreMissing..CUresult(
        "PointerSetAttribute",
        """
        Set attributes on a previously allocated memory region.

        The supported attributes are:
        ${ul(
            """
            #POINTER_ATTRIBUTE_SYNC_MEMOPS: A boolean attribute that can either be set (1) or unset (0).

            When set, the region of memory that {@code ptr} points to is guaranteed to always synchronize memory operations that are synchronous. If there are
            some previously initiated synchronous memory operations that are pending when this attribute is set, the function does not return until those
            memory operations are complete. See further documentation in the section titled "API synchronization behavior" to learn more about cases when
            synchronous memory operations can exhibit asynchronous behavior. {@code value} will be considered as a pointer to an unsigned integer to which this
            attribute is to be set.
            """
        )}
        """,

        Unsafe..void.const.p("value", "pointer to memory containing the value to be set"),
        CUpointer_attribute("attribute", "pointer attribute to set"),
        CUdeviceptr("ptr", "pointer to a memory region allocated using CUDA memory allocation APIs")
    )

    IgnoreMissing..CUresult(
        "PointerGetAttributes",
        """
        Returns information about a pointer.

        Unlike #PointerGetAttribute(), this function will not return an error when the {@code ptr} encountered is not a valid CUDA pointer. Instead, the
        attributes are assigned default #NULL values and #CUDA_SUCCESS is returned.

        If {@code ptr} was not allocated by, mapped by, or registered with a {@code CUcontext} which uses UVA (Unified Virtual Addressing),
        #CUDA_ERROR_INVALID_CONTEXT is returned.
        """,

        AutoSize("attributes", "data")..unsigned_int("numAttributes", "number of attributes to query"),
        CUpointer_attribute.p(
            "attributes", "an array of attributes to query (numAttributes and the number of attributes in this array should match)",
            "POINTER_ATTRIBUTE_\\w+"
        ),
        void.p.p("data", "a two-dimensional array containing pointers to memory locations where the result of each attribute query will be written to"),
        CUdeviceptr("ptr", "pointer to query")
    )

    CUresult(
        "StreamCreate",
        """
        Create a stream.

        Creates a stream and returns a handle in {@code phStream}. The {@code Flags} argument determines behaviors of the stream.

        Valid values for {@code Flags} are:

        ${ul(
            "#STREAM_DEFAULT: Default stream creation flag.",
            """
            #STREAM_NON_BLOCKING: Specifies that work running in the created stream may run concurrently with work in stream 0 (the NULL stream), and that
            the created stream should perform no implicit synchronization with stream 0.
            """
        )}
        """,

        Check(1)..CUstream.p("phStream", "returned newly created stream"),
        unsigned_int("Flags", "parameters for stream creation")
    )

    CUresult(
        "StreamCreateWithPriority",
        """
        Create a stream with the given priority.

        Creates a stream with the specified priority and returns a handle in {@code phStream}. This API alters the scheduler priority of work in the stream.
        Work in a higher priority stream may preempt work already executing in a low priority stream.

        {@code priority} follows a convention where lower numbers represent higher priorities. {@code 0} represents default priority. The range of meaningful
        numerical priorities can be queried using #CtxGetStreamPriorityRange(). If the specified priority is outside the numerical range returned by
        #CtxGetStreamPriorityRange(), it will automatically be clamped to the lowest or the highest number in the range.

        ${note("""Stream priorities are supported only on GPUs with compute capability 3.5 or higher.""")}

        ${note("""In the current implementation, only compute kernels launched in priority streams are affected by the stream's priority. Stream priorities
        have no effect on host-to-device and device-to-host memory operations.""")}
        """,

        Check(1)..CUstream.p("phStream", "returned newly created stream"),
        unsigned_int("flags", "flags for stream creation. See #StreamCreate() for a list of valid flags"),
        int(
            "priority",
            """
            stream priority. Lower numbers represent higher priorities. See #CtxGetStreamPriorityRange() for more information about meaningful stream
            priorities that can be passed.
            """
        )
    )

    CUresult(
        "StreamGetPriority",
        """
        Query the priority of a given stream.

        Query the priority of a stream created using #StreamCreate() or #StreamCreateWithPriority() and return the priority in {@code priority}. Note that if
        the stream was created with a priority outside the numerical range returned by #CtxGetStreamPriorityRange(), this function returns the clamped
        priority. See #StreamCreateWithPriority() for details about priority clamping.
        """,

        nullable..CUstream("hStream", "handle to the stream to be queried"),
        Check(1)..int.p("priority", "pointer to a signed integer in which the stream's priority is returned")
    ).ptsz()

    CUresult(
        "StreamGetFlags",
        """
        Query the flags of a given stream.

        Query the flags of a stream created using #StreamCreate() or #StreamCreateWithPriority() and return the flags in {@code flags}.
        """,

        nullable..CUstream("hStream", "handle to the stream to be queried"),
        Check(1)..unsigned_int.p(
            "flags",
            """
            pointer to an unsigned integer in which the stream's flags are returned The value returned in {@code flags} is a logical 'OR' of all flags that
            were used while creating this stream. See #StreamCreate() for the list of valid flags.
            """
        )
    ).ptsz()

    IgnoreMissing..CUresult(
        "StreamGetCtx",
        """
        Query the context associated with a stream.

        Returns the CUDA context that the stream is associated with.

        The stream handle {@code hStream} can refer to any of the following:
        ${ul(
            """
            a stream created via any of the CUDA driver APIs such as #StreamCreate() and #StreamCreateWithPriority(), or their runtime API equivalents such as
            {@code cudaStreamCreate()}, {@code cudaStreamCreateWithFlags()} and {@code cudaStreamCreateWithPriority()}. The returned context is the context
            that was active in the calling thread when the stream was created. Passing an invalid handle will result in undefined behavior.
            """,
            """
            any of the special streams such as the #NULL stream, #STREAM_LEGACY and #STREAM_PER_THREAD. The runtime API equivalents of these are also accepted,
            which are #NULL, {@code cudaStreamLegacy()} and {@code cudaStreamPerThread()} respectively. Specifying any of the special handles will return the
            context current to the calling thread. If no context is current to the calling thread, #CUDA_ERROR_INVALID_CONTEXT is returned.                
            """
        )}
        """,

        nullable..CUstream("hStream", "handle to the stream to be queried"),
        Check(1)..CUcontext.p("pctx", "returned context associated with the stream")
    ).ptsz()

    CUresult(
        "StreamWaitEvent",
        """
        Make a compute stream wait on an event.

        Makes all future work submitted to {@code hStream} wait for all work captured in {@code hEvent}. See #EventRecord() for details on what is captured
        by an event. The synchronization will be performed efficiently on the device when applicable. {@code hEvent} may be from a different context or device
        than {@code hStream}.
        """,

        nullable..CUstream("hStream", "stream to wait"),
        CUevent("hEvent", "event to wait on (may not be #NULL)", "EVENT_WAIT_\\w+"),
        unsigned_int("Flags", "see {@code CUevent_capture_flags}")
    ).ptsz()

    IgnoreMissing..CUresult(
        "StreamAddCallback",
        """
        Add a callback to a compute stream.

        ${note("""This function is slated for eventual deprecation and removal. If you do not require the callback to execute in case of a device error,
        consider using #LaunchHostFunc(). Additionally, this function is not supported with #StreamBeginCapture() and #StreamEndCapture(), unlike
        #LaunchHostFunc().""")}

        Adds a callback to be called on the host after all currently enqueued items in the stream have completed. For each {@code cuStreamAddCallback} call,
        the callback will be executed exactly once. The callback will block later work in the stream until it is finished.

        The callback may be passed #CUDA_SUCCESS or an error code. In the event of a device error, all subsequently executed callbacks will receive an
        appropriate {@code CUresult}.

        Callbacks must not make any CUDA API calls. Attempting to use a CUDA API will result in #CUDA_ERROR_NOT_PERMITTED. Callbacks must not perform any
        synchronization that may depend on outstanding device work or other callbacks that are not mandated to run earlier. Callbacks without a mandated order
        (in independent streams) execute in undefined order and may be serialized.

        For the purposes of Unified Memory, callback execution makes a number of guarantees:
        ${ul(
            """
            The callback stream is considered idle for the duration of the callback. Thus, for example, a callback may always use memory attached to the
            callback stream.
            """,
            """
            The start of execution of a callback has the same effect as synchronizing an event recorded in the same stream immediately prior to the callback.
            It thus synchronizes streams which have been "joined" prior to the callback.
            """,
            """
            Adding device work to any stream does not have the effect of making the stream active until all preceding host functions and stream callbacks have
            executed. Thus, for example, a callback might use global attached memory even if work has been added to another stream, if the work has been
            ordered behind the callback with an event.
            """,
            """
            Completion of a callback does not cause a stream to become active except as described above. The callback stream will remain idle if no device work
            follows the callback, and will remain idle across consecutive callbacks without device work in between. Thus, for example, stream synchronization
            can be done by signaling from a callback at the end of the stream.
            """
        )}
        """,

        nullable..CUstream("hStream", "stream to add callback to"),
        CUstreamCallback("callback", "the function to call once preceding stream operations are complete"),
        opaque_p("userData", "user specified data to be passed to the callback function"),
        unsigned_int("flags", "reserved for future use, must be 0")
    ).ptsz()

    IgnoreMissing..CUresult(
        "StreamBeginCapture",
        """
        Begins graph capture on a stream.

        Begin graph capture on {@code hStream}. When a stream is in capture mode, all operations pushed into the stream will not be executed, but will instead
        be captured into a graph, which will be returned via #StreamEndCapture(). Capture may not be initiated if {@code stream} is #STREAM_LEGACY. Capture
        must be ended on the same stream in which it was initiated, and it may only be initiated if the stream is not already in capture mode. The capture mode
        may be queried via #StreamIsCapturing(). A unique id representing the capture sequence may be queried via #StreamGetCaptureInfo().

        ${note("""Kernels captured using this API must not use texture and surface references. Reading or writing through any texture or surface reference is
        undefined behavior. This restriction does not apply to texture and surface objects.""")}
        """,

        nullable..CUstream("hStream", "stream in which to initiate capture")
    ).ptsz()

    IgnoreMissing..CUresult(
        "StreamBeginCapture_v2",
        """
        Begins graph capture on a stream.

        Begin graph capture on {@code hStream}. When a stream is in capture mode, all operations pushed into the stream will not be executed, but will instead
        be captured into a graph, which will be returned via #StreamEndCapture(). Capture may not be initiated if {@code stream} is #STREAM_LEGACY. Capture
        must be ended on the same stream in which it was initiated, and it may only be initiated if the stream is not already in capture mode. The capture mode
        may be queried via #StreamIsCapturing(). A unique id representing the capture sequence may be queried via #StreamGetCaptureInfo().

        If {@code mode} is not #STREAM_CAPTURE_MODE_RELAXED, #StreamEndCapture() must be called on this stream from the same thread.

        ${note("""Kernels captured using this API must not use texture and surface references. Reading or writing through any texture or surface reference is
        undefined behavior. This restriction does not apply to texture and surface objects.""")}
        """,

        nullable..CUstream("hStream", "stream in which to initiate capture"),
        CUstreamCaptureMode(
            "mode",
            """
            controls the interaction of this capture sequence with other API calls that are potentially unsafe. For more details see
            #ThreadExchangeStreamCaptureMode().
            """
        )
    ).ptsz()

    IgnoreMissing..CUresult(
        "ThreadExchangeStreamCaptureMode",
        """
        Swaps the stream capture interaction mode for a thread.

        Sets the calling thread's stream capture interaction mode to the value contained in {@code *mode}, and overwrites {@code *mode} with the previous mode
        for the thread. To facilitate deterministic behavior across function or module boundaries, callers are encouraged to use this API in a push-pop
        fashion:
        ${codeBlock("""
CUstreamCaptureMode mode = desiredMode
cuThreadExchangeStreamCaptureMode(&mode);
...
cuThreadExchangeStreamCaptureMode(&mode); // restore previous mode""")}

        During stream capture (see #StreamBeginCapture()), some actions, such as a call to {@code cudaMalloc}, may be unsafe. In the case of {@code cudaMalloc},
        the operation is not enqueued asynchronously to a stream, and is not observed by stream capture. Therefore, if the sequence of operations captured via
        #StreamBeginCapture() depended on the allocation being replayed whenever the graph is launched, the captured graph would be invalid.

        Therefore, stream capture places restrictions on API calls that can be made within or concurrently to a #StreamBeginCapture()-#StreamEndCapture()
        sequence. This behavior can be controlled via this API and flags to {@code cuStreamBeginCapture}.

        A thread's mode is one of the following:
        ${ul(
            """
            #STREAM_CAPTURE_MODE_GLOBAL: This is the default mode.

            If the local thread has an ongoing capture sequence that was not initiated with #STREAM_CAPTURE_MODE_RELAXED at #StreamBeginCapture(), or if any
            other thread has a concurrent capture sequence initiated with #STREAM_CAPTURE_MODE_GLOBAL, this thread is prohibited from potentially unsafe API
            calls.
            """,
            """
            #STREAM_CAPTURE_MODE_THREAD_LOCAL: If the local thread has an ongoing capture sequence not initiated with {@code CU_STREAM_CAPTURE_MODE_RELAXED},
            it is prohibited from potentially unsafe API calls. Concurrent capture sequences in other threads are ignored.
            """,
            """
            #STREAM_CAPTURE_MODE_RELAXED: The local thread is not prohibited from potentially unsafe API calls. Note that the thread is still prohibited from
            API calls which necessarily conflict with stream capture, for example, attempting #EventQuery() on an event that was last recorded inside a capture
            sequence.
            """
        )}
        """,

        Check(1)..CUstreamCaptureMode.p("mode", "pointer to mode value to swap with the current mode")
    )

    IgnoreMissing..CUresult(
        "StreamEndCapture",
        """
        Ends capture on a stream, returning the captured graph.

        End capture on {@code hStream}, returning the captured graph via {@code phGraph}. Capture must have been initiated on {@code hStream} via a call to
        #StreamBeginCapture(). If capture was invalidated, due to a violation of the rules of stream capture, then a NULL graph will be returned.

        If the {@code mode} argument to #StreamBeginCapture() was not #STREAM_CAPTURE_MODE_RELAXED, this call must be from the same thread as
        #StreamBeginCapture().
        """,

        nullable..CUstream("hStream", "stream to query"),
        Check(1)..CUgraph.p("phGraph", "the captured graph")
    ).ptsz()

    IgnoreMissing..CUresult(
        "StreamIsCapturing",
        """
        Returns a stream's capture status.

        Return the capture status of {@code hStream} via {@code captureStatus}. After a successful call, {@code *captureStatus} will contain one of the
        following:

        ${ul(
            "#STREAM_CAPTURE_STATUS_NONE: The stream is not capturing.",
            "#STREAM_CAPTURE_STATUS_ACTIVE: The stream is capturing.",
            """
            #STREAM_CAPTURE_STATUS_INVALIDATED: The stream was capturing but an error has invalidated the capture sequence. The capture sequence must be
            terminated with #StreamEndCapture() on the stream where it was initiated in order to continue using {@code hStream}.
            """
        )}

        Note that, if this is called on #STREAM_LEGACY (the "null stream") while a blocking stream in the same context is capturing, it will return
        #CUDA_ERROR_STREAM_CAPTURE_IMPLICIT and {@code *captureStatus} is unspecified after the call. The blocking stream capture is not invalidated.

        When a blocking stream is capturing, the legacy stream is in an unusable state until the blocking stream capture is terminated. The legacy stream is
        not supported for stream capture, but attempted use would have an implicit dependency on the capturing stream(s).
        """,

        nullable..CUstream("hStream", "stream to query"),
        Check(1)..CUstreamCaptureStatus.p("captureStatus", "returns the stream's capture status")
    ).ptsz()

    IgnoreMissing..CUresult(
        "StreamGetCaptureInfo",
        """
        Query capture status of a stream.

        Query the capture status of a stream and and get an id for the capture sequence, which is unique over the lifetime of the process.

        If called on #STREAM_LEGACY (the "null stream") while a stream not created with #STREAM_NON_BLOCKING is capturing, returns
        #CUDA_ERROR_STREAM_CAPTURE_IMPLICIT.

        A valid id is returned only if both of the following are true:
        ${ul(
            "the call returns #SUCCESS",
            "{@code captureStatus} is set to #STREAM_CAPTURE_STATUS_ACTIVE"
        )}
        """,
        nullable..CUstream("hStream", ""),
        Check(1)..CUstreamCaptureStatus.p("captureStatus", ""),
        Check(1)..cuuint64_t.p("id", "")
    ).ptsz()

    IgnoreMissing..CUresult(
        "StreamGetCaptureInfo_v2",
        """
        Query a stream's capture state (11.3+).

        Query stream state related to stream capture.

        If called on #STREAM_LEGACY (the "null stream") while a stream not created with #STREAM_NON_BLOCKING is capturing, returns
        #CUDA_ERROR_STREAM_CAPTURE_IMPLICIT.

        Valid data (other than capture status) is returned only if both of the following are true:
        ${ul(
            "the call returns CUDA_SUCCESS",
            "the returned capture status is #STREAM_CAPTURE_STATUS_ACTIVE"
        )}

        This version of {@code cuStreamGetCaptureInfo} is introduced in CUDA 11.3 and will supplant the previous version in 12.0. Developers requiring
        compatibility across minor versions to CUDA 11.0 (driver version 445) should use #StreamGetCaptureInfo() or include a fallback path.
        """,

        nullable..CUstream("hStream", "the stream to query"),
        Check(1)..CUstreamCaptureStatus.p("captureStatus_out", "location to return the capture status of the stream; required"),
        Check(1)..nullable..cuuint64_t.p(
            "id_out",
            "optional location to return an id for the capture sequence, which is unique over the lifetime of the process"
        ),
        Check(1)..nullable..CUgraph.p(
            "graph_out",
            """
            optional location to return the graph being captured into.

            All operations other than destroy and node removal are permitted on the graph while the capture sequence is in progress. This API does not transfer
            ownership of the graph, which is transferred or destroyed at #StreamEndCapture(). Note that the graph handle may be invalidated before end of
            capture for certain errors. Nodes that are or become unreachable from the original stream at #StreamEndCapture() due to direct actions on the graph
            do not trigger #CUDA_ERROR_STREAM_CAPTURE_UNJOINED.
            """
        ),
        Check(1)..nullable..CUgraphNode.const.p.p(
            "dependencies_out",
            """
            optional location to store a pointer to an array of nodes.

            The next node to be captured in the stream will depend on this set of nodes, absent operations such as event wait which modify this set. The array
            pointer is valid until the next API call which operates on the stream or until end of capture. The node handles may be copied out and are valid
            until they or the graph is destroyed. The driver-owned array may also be passed directly to APIs that operate on the graph (not the stream) without
            copying.
            """
        ),
        Check(1)..nullable..size_t.p("numDependencies_out", "optional location to store the size of the array returned in {@code dependencies_out}")
    ).ptsz()

    IgnoreMissing..CUresult(
        "StreamUpdateCaptureDependencies",
        """
        Update the set of dependencies in a capturing stream (11.3+).

        Modifies the dependency set of a capturing stream. The dependency set is the set of nodes that the next captured node in the stream will depend on.

        Valid flags are #STREAM_ADD_CAPTURE_DEPENDENCIES and #STREAM_SET_CAPTURE_DEPENDENCIES. These control whether the set passed to the API is added
        to the existing set or replaces it. A flags value of 0 defaults to #STREAM_ADD_CAPTURE_DEPENDENCIES.

        Nodes that are removed from the dependency set via this API do not result in #CUDA_ERROR_STREAM_CAPTURE_UNJOINED if they are unreachable from the
        stream at #StreamEndCapture().

        Returns #CUDA_ERROR_ILLEGAL_STATE if the stream is not capturing.

        This API is new in CUDA 11.3. Developers requiring compatibility across minor versions to CUDA 11.0 should not use this API or provide a fallback.
        """,

        nullable..CUstream("hStream", ""),
        CUgraphNode.p("dependencies", ""),
        AutoSize("dependencies")..size_t("numDependencies", ""),
        unsigned_int("flags", "")
    ).ptsz()

    IgnoreMissing..CUresult(
        "StreamAttachMemAsync",
        """
        Attach memory to a stream asynchronously.

        Enqueues an operation in {@code hStream} to specify stream association of {@code length} bytes of memory starting from {@code dptr}. This function is a
        stream-ordered operation, meaning that it is dependent on, and will only take effect when, previous work in stream has completed. Any previous
        association is automatically replaced.

        {@code dptr} must point to one of the following types of memories:

        ${ul(
            "managed memory declared using the __managed__ keyword or allocated with #MemAllocManaged().",
            """
            a valid host-accessible region of system-allocated pageable memory. This type of memory may only be specified if the device associated with the
            stream reports a non-zero value for the device attribute #DEVICE_ATTRIBUTE_PAGEABLE_MEMORY_ACCESS.
            """
        )}

        For managed allocations, {@code length} must be either zero or the entire allocation's size. Both indicate that the entire allocation's stream
        association is being changed. Currently, it is not possible to change stream association for a portion of a managed allocation.

        For pageable host allocations, {@code length} must be non-zero.

        The stream association is specified using {@code flags} which must be one of {@code CUmemAttach_flags}. If the #MEM_ATTACH_GLOBAL flag is specified,
        the memory can be accessed by any stream on any device. If the #MEM_ATTACH_HOST flag is specified, the program makes a guarantee that it won't access
        the memory on the device from any stream on a device that has a zero value for the device attribute #DEVICE_ATTRIBUTE_CONCURRENT_MANAGED_ACCESS. If
        the #MEM_ATTACH_SINGLE flag is specified and {@code hStream} is associated with a device that has a zero value for the device attribute
        #DEVICE_ATTRIBUTE_CONCURRENT_MANAGED_ACCESS, the program makes a guarantee that it will only access the memory on the device from {@code hStream}.
        It is illegal to attach singly to the NULL stream, because the NULL stream is a virtual global stream and not a specific stream. An error will be
        returned in this case.

        When memory is associated with a single stream, the Unified Memory system will allow CPU access to this memory region so long as all operations in
        {@code hStream} have completed, regardless of whether other streams are active. In effect, this constrains exclusive ownership of the managed memory
        region by an active GPU to per-stream activity instead of whole-GPU activity.

        Accessing memory on the device from streams that are not associated with it will produce undefined results. No error checking is performed by the
        Unified Memory system to ensure that kernels launched into other streams do not access this region.

        It is a program's responsibility to order calls to #StreamAttachMemAsync() via events, synchronization or other means to ensure legal access to memory
        at all times. Data visibility and coherency will be changed appropriately for all kernels which follow a stream-association change.

        If {@code hStream} is destroyed while data is associated with it, the association is removed and the association reverts to the default visibility of
        the allocation as specified at #MemAllocManaged(). For __managed__ variables, the default association is always #MEM_ATTACH_GLOBAL. Note that
        destroying a stream is an asynchronous operation, and as a result, the change to default association won't happen until all work in the stream has
        completed.
        """,

        nullable..CUstream("hStream", "stream in which to enqueue the attach operation"),
        CUdeviceptr(
            "dptr",
            "pointer to memory (must be a pointer to managed memory or to a valid host-accessible region of system-allocated pageable memory)"
        ),
        size_t("length", "length of memory"),
        unsigned_int("flags", "must be one of {@code CUmemAttach_flags}")
    ).ptsz()

    CUresult(
        "StreamQuery",
        """
        Determine status of a compute stream.

        Returns #CUDA_SUCCESS if all operations in the stream specified by {@code hStream} have completed, or #CUDA_ERROR_NOT_READY if not.

        For the purposes of Unified Memory, a return value of #CUDA_SUCCESS is equivalent to having called #StreamSynchronize().
        """,

        nullable..CUstream("hStream", "stream to query status of")
    ).ptsz()

    CUresult(
        "StreamSynchronize",
        """
        Wait until a stream's tasks are completed.

        Waits until the device has completed all operations in the stream specified by {@code hStream}. If the context was created with the
        #CTX_SCHED_BLOCKING_SYNC flag, the CPU thread will block until the stream is finished with all of its tasks.
        """,

        nullable..CUstream("hStream", "stream to wait for")
    ).ptsz()

    IgnoreMissing..CUresult(
        "StreamDestroy",
        """
        Destroys a stream.

        Destroys the stream specified by {@code hStream}.

        In case the device is still doing work in the stream {@code hStream} when #StreamDestroy() is called, the function will return immediately and the
        resources associated with {@code hStream} will be released automatically once the device has completed all work in {@code hStream}.
        """,

        nullable..CUstream("hStream", "stream to destroy")
    ).versioned()

    IgnoreMissing..CUresult(
        "StreamCopyAttributes",
        """
        Copies attributes from source stream to destination stream.

        Copies attributes from source stream {@code src} to destination stream {@code dst}. Both streams must have the same context.
        """,

        nullable..CUstream("dst", "destination stream"),
        nullable..CUstream("src", "source stream For list of attributes see {@code CUstreamAttrID}")
    ).ptsz()

    IgnoreMissing..CUresult(
        "StreamGetAttribute",
        """
        Queries stream attribute.

        Queries attribute {@code attr} from {@code hStream} and stores it in corresponding member of {@code value_out}.
        """,

        nullable..CUstream("hStream", ""),
        CUstreamAttrID("attr", ""),
        CUstreamAttrValue.p("value_out", "")
    ).ptsz()

    IgnoreMissing..CUresult(
        "StreamSetAttribute",
        """
        Sets stream attribute.

        Sets attribute {@code attr} on {@code hStream} from corresponding attribute of {@code value}. The updated attribute will be applied to subsequent work
        submitted to the stream. It will not affect previously submitted work.
        """,

        nullable..CUstream("hStream", ""),
        CUstreamAttrID("attr", ""),
        CUstreamAttrValue.const.p("value", "")
    ).ptsz()

    CUresult(
        "EventCreate",
        """
        Creates an event.

        Creates an event {@code *phEvent} for the current context with the flags specified via {@code Flags}. Valid flags include:
        ${ul(
            "#EVENT_DEFAULT: Default event creation flag.",
            """
            #EVENT_BLOCKING_SYNC: Specifies that the created event should use blocking synchronization. A CPU thread that uses #EventSynchronize() to
            wait on an event created with this flag will block until the event has actually been recorded.
            """,
            """
            #EVENT_DISABLE_TIMING: Specifies that the created event does not need to record timing data. Events created with this flag specified and the
            #EVENT_BLOCKING_SYNC flag not specified will provide the best performance when used with #StreamWaitEvent() and #EventQuery().
            """,
            """
            #EVENT_INTERPROCESS: Specifies that the created event may be used as an interprocess event by #IpcGetEventHandle(). #EVENT_INTERPROCESS
            must be specified along with #EVENT_DISABLE_TIMING.
            """
        )}
        """,

        Check(1)..CUevent.p("phEvent", "returns newly created event"),
        unsigned_int("Flags", "event creation flags")
    )

    CUresult(
        "EventRecord",
        """
        Records an event.

        Captures in {@code hEvent} the contents of {@code hStream} at the time of this call. {@code hEvent} and {@code hStream} must be from the same context.
        Calls such as #EventQuery() or #StreamWaitEvent() will then examine or wait for completion of the work that was captured. Uses of {@code hStream}
        after this call do not modify {@code hEvent}. See note on default stream behavior for what is captured in the default case.

        #EventRecord() can be called multiple times on the same event and will overwrite the previously captured state. Other APIs such as
        #StreamWaitEvent() use the most recently captured state at the time of the API call, and are not affected by later calls to #EventRecord().
        Before the first call to #EventRecord(), an event represents an empty set of work, so for example #EventQuery() would return #CUDA_SUCCESS.
        """,

        CUevent("hEvent", "event to record"),
        nullable..CUstream("hStream", "stream to record event for")
    ).ptsz()

    IgnoreMissing..CUresult(
        "EventRecordWithFlags",
        """
        Records an event.

        Captures in {@code hEvent} the contents of {@code hStream} at the time of this call. {@code hEvent} and {@code hStream} must be from the same context.
        Calls such as #EventQuery() or #StreamWaitEvent() will then examine or wait for completion of the work that was captured. Uses of {@code hStream}
        after this call do not modify {@code hEvent}. See note on default stream behavior for what is captured in the default case.

        #EventRecordWithFlags() can be called multiple times on the same event and will overwrite the previously captured state. Other APIs such as
        #StreamWaitEvent() use the most recently captured state at the time of the API call, and are not affected by later calls to
        #EventRecordWithFlags(). Before the first call to #EventRecordWithFlags(), an event represents an empty set of work, so for example
        #EventQuery() would return #CUDA_SUCCESS.

        flags include:
        ${ul(
            "#EVENT_RECORD_DEFAULT: Default event creation flag.",
            """
            #EVENT_RECORD_EXTERNAL: Event is captured in the graph as an external event node when performing stream capture. This flag is invalid outside
            of stream capture.
            """
        )}
        """,

        CUevent("hEvent", "event to record"),
        nullable..CUstream("hStream", "stream to record event for"),
        unsigned_int("flags", "see {@code CUevent_capture_flags}")
    ).ptsz()

    CUresult(
        "EventQuery",
        """
        Queries an event's status.

        Queries the status of all work currently captured by {@code hEvent}. See #EventRecord() for details on what is captured by an event.

        Returns #CUDA_SUCCESS if all captured work has been completed, or #CUDA_ERROR_NOT_READY if any captured work is incomplete.

        For the purposes of Unified Memory, a return value of #CUDA_SUCCESS is equivalent to having called #EventSynchronize().
        """,

        CUevent("hEvent", "event to query")
    )

    CUresult(
        "EventSynchronize",
        """
        Waits for an event to complete.

        Waits until the completion of all work currently captured in {@code hEvent}. See #EventRecord() for details on what is captured by an event.

        Waiting for an event that was created with the #EVENT_BLOCKING_SYNC flag will cause the calling CPU thread to block until the event has been
        completed by the device. If the #EVENT_BLOCKING_SYNC flag has not been set, then the CPU thread will busy-wait until the event has been completed
        by the device.
        """,

        CUevent("hEvent", "event to wait for")
    )

    IgnoreMissing..CUresult(
        "EventDestroy",
        """
        Destroys an event.

        Destroys the event specified by {@code hEvent}.

        An event may be destroyed before it is complete (i.e., while #EventQuery() would return #CUDA_ERROR_NOT_READY). In this case, the call does not
        block on completion of the event, and any associated resources will automatically be released asynchronously at completion.
        """,

        CUevent("hEvent", "event to destroy")
    ).versioned()

    CUresult(
        "EventElapsedTime",
        """
        Computes the elapsed time between two events.

        Computes the elapsed time between two events (in milliseconds with a resolution of around 0.5 microseconds).

        If either event was last recorded in a non-#NULL stream, the resulting time may be greater than expected (even if both used the same stream handle).
        This happens because the #EventRecord() operation takes place asynchronously and there is no guarantee that the measured latency is actually just
        between the two events. Any number of other different stream operations could execute in between the two measured events, thus altering the timing in a
        significant way.

        If #EventRecord() has not been called on either event then #CUDA_ERROR_INVALID_HANDLE is returned. If #EventRecord() has been called on both
        events but one or both of them has not yet been completed (that is, #EventQuery() would return #CUDA_ERROR_NOT_READY on at least one of the
        events), #CUDA_ERROR_NOT_READY is returned. If either event was created with the #EVENT_DISABLE_TIMING flag, then this function will return
        #CUDA_ERROR_INVALID_HANDLE.
        """,

        Check(1)..float.p("pMilliseconds", "time between {@code hStart} and {@code hEnd} in ms"),
        CUevent("hStart", "starting event"),
        CUevent("hEnd", "ending event")
    )

    IgnoreMissing..CUresult(
        "ImportExternalMemory",
        """
        Imports an external memory object.

        Imports an externally allocated memory object and returns a handle to that in {@code extMem_out}.

        The properties of the handle being imported must be described in {@code memHandleDesc}. 

        If {@code ::type} is #EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD, then {@code ::handle::fd} must be a valid file descriptor referencing a memory object.
        Ownership of the file descriptor is transferred to the CUDA driver when the handle is imported successfully. Performing any operations on the file
        descriptor after it is imported results in undefined behavior.

        If {@code ::type} is #EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32, then exactly one of {@code ::handle::win32::handle} and {@code ::handle::win32::name}
        must not be #NULL. If {@code ::handle::win32::handle} is not #NULL, then it must represent a valid shared NT handle that references a memory object.
        Ownership of this handle is not transferred to CUDA after the import operation, so the application must release the handle using the appropriate system
        call. If {@code ::handle::win32::name} is not NULL, then it must point to a NULL-terminated array of UTF-16 characters that
        refers to a memory object.

        If {@code ::type} is #EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT, then {@code ::handle::win32::handle} must be non-#NULL and
        {@code ::handle::win32::name} must be #NULL. The handle specified must be a globally shared KMT handle. This handle does not hold a reference to the
        underlying object, and thus will be invalid when all references to the memory object are destroyed.

        If {@code ::type} is #EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP, then exactly one of {@code ::handle::win32::handle} and {@code ::handle::win32::name}
        must not be #NULL. If {@code ::handle::win32::handle} is not #NULL, then it must represent a valid shared NT handle that is returned by
        {@code ID3D12Device::CreateSharedHandle} when referring to a {@code ID3D12Heap} object. This handle holds a reference to the underlying object. If
        {@code ::handle::win32::name} is not #NULL, then it must point to a #NULL-terminated array of UTF-16 characters that refers to a {@code ID3D12Heap}
        object.

        If {@code ::type} is #EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE, then exactly one of {@code ::handle::win32::handle} and {@code ::handle::win32::name}
        must not be NULL. If {@code ::handle::win32::handle} is not #NULL, then it must represent a valid shared NT handle that is returned by
        {@code ID3D12Device::CreateSharedHandle} when referring to a {@code ID3D12Resource} object. This handle holds a reference to the underlying object. If
        {@code ::handle::win32::name} is not #NULL, then it must point to a #NULL-terminated array of UTF-16 characters that refers to a {@code ID3D12Resource}
        object.

        If {@code ::type} is #EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_RESOURCE, then {@code ::handle::win32::handle} must represent a valid shared NT handle that is\
        returned by {@code IDXGIResource1::CreateSharedHandle} when referring to a {@code ID3D11Resource} object. If {@code ::handle::win32::name} is not
        #NULL, then it must point to a #NULL-terminated array of UTF-16 characters that refers to a {@code ID3D11Resource} object.

        If {@code ::type} is #EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_RESOURCE_KMT, then {@code ::handle::win32::handle} must represent a valid shared KMT handle
        that is returned by {@code IDXGIResource::GetSharedHandle} when referring to a {@code ID3D11Resource} object and {@code ::handle::win32::name} must be
        #NULL.

        If {@code ::type} is #EXTERNAL_MEMORY_HANDLE_TYPE_NVSCIBUF, then {@code ::handle::nvSciBufObject} must be non-#NULL and reference a valid
        {@code NvSciBuf} object. If the {@code NvSciBuf} object imported into CUDA is also mapped by other drivers, then the application must use
        #WaitExternalSemaphoresAsync() or #SignalExternalSemaphoresAsync() as appropriate barriers to maintain coherence between CUDA and the other drivers.
        See #CUDA_EXTERNAL_SEMAPHORE_SIGNAL_SKIP_NVSCIBUF_MEMSYNC and #CUDA_EXTERNAL_SEMAPHORE_WAIT_SKIP_NVSCIBUF_MEMSYNC for memory synchronization.

        The size of the memory object must be specified in {@code ::size}.

        Specifying the flag #CUDA_EXTERNAL_MEMORY_DEDICATED in {@code ::flags} indicates that the resource is a dedicated resource. The definition of what a
        dedicated resource is outside the scope of this extension. This flag must be set if {@code ::type} is one of the following:
        ${ul(
            "#EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE",
            "#EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_RESOURCE",
            "#EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_RESOURCE_KMT"
        )}

        ${note("""If the Vulkan memory imported into CUDA is mapped on the CPU then the application must use
        {@code vkInvalidateMappedMemoryRanges}/{@code vkFlushMappedMemoryRanges} as well as appropriate Vulkan pipeline barriers to maintain coherence between
        CPU and GPU. For more information on these APIs, please refer to "Synchronization and Cache Control" chapter from Vulkan specification.""")}
        """,

        Check(1)..CUexternalMemory.p("extMem_out", "returned handle to an external memory object"),
        CUDA_EXTERNAL_MEMORY_HANDLE_DESC.const.p("memHandleDesc", "memory import handle descriptor")
    )

    IgnoreMissing..CUresult(
        "ExternalMemoryGetMappedBuffer",
        """
        Maps a buffer onto an imported memory object.

        Maps a buffer onto an imported memory object and returns a device pointer in {@code devPtr}.

        The properties of the buffer being mapped must be described in {@code bufferDesc}.

        The offset and size have to be suitably aligned to match the requirements of the external API. Mapping two buffers whose ranges overlap may or may not
        result in the same virtual address being returned for the overlapped portion. In such cases, the application must ensure that all accesses to that
        region from the GPU are volatile. Otherwise writes made via one address are not guaranteed to be visible via the other address, even if they're issued
        by the same thread. It is recommended that applications map the combined range instead of mapping separate buffers and then apply the appropriate
        offsets to the returned pointer to derive the individual buffers.

        The returned pointer {@code devPtr} must be freed using #MemFree().
        """,

        Check(1)..CUdeviceptr.p("devPtr", "returned device pointer to buffer"),
        CUexternalMemory("extMem", "handle to external memory object"),
        CUDA_EXTERNAL_MEMORY_BUFFER_DESC.const.p("bufferDesc", "buffer descriptor")
    )

    IgnoreMissing..CUresult(
        "ExternalMemoryGetMappedMipmappedArray",
        """
        Maps a CUDA mipmapped array onto an external memory object.

        Maps a CUDA mipmapped array onto an external object and returns a handle to it in {@code mipmap}.

        The properties of the CUDA mipmapped array being mapped must be described in {@code mipmapDesc}.

        {@code ::offset} is the offset in the memory object where the base level of the mipmap chain is. {@code ::arrayDesc} describes the format, dimensions
        and type of the base level of the mipmap chain. For further details on these parameters, please refer to the documentation for #MipmappedArrayCreate().
        Note that if the mipmapped array is bound as a color target in the graphics API, then the flag #CUDA_ARRAY3D_COLOR_ATTACHMENT must be specified in
        {@code ::arrayDesc::Flags}. {@code ::numLevels} specifies the total number of levels in the mipmap chain.

        If {@code extMem} was imported from a handle of type #EXTERNAL_MEMORY_HANDLE_TYPE_NVSCIBUF, then {@code ::numLevels} must be equal to 1.

        The returned CUDA mipmapped array must be freed using #MipmappedArrayDestroy().
        """,

        Check(1)..CUmipmappedArray.p("mipmap", "returned CUDA mipmapped array"),
        CUexternalMemory("extMem", "handle to external memory object"),
        CUDA_EXTERNAL_MEMORY_MIPMAPPED_ARRAY_DESC.const.p("mipmapDesc", "CUDA array descriptor")
    )

    IgnoreMissing..CUresult(
        "DestroyExternalMemory",
        """
        Destroys an external memory object.

        Destroys the specified external memory object. Any existing buffers and CUDA mipmapped arrays mapped onto this object must no longer be used and must
        be explicitly freed using #MemFree() and #MipmappedArrayDestroy() respectively.
        """,

        CUexternalMemory("extMem", "external memory object to be destroyed")
    )

    IgnoreMissing..CUresult(
        "ImportExternalSemaphore",
        """
        Imports an external semaphore.

        Imports an externally allocated synchronization object and returns a handle to that in {@code extSem_out}.

        The properties of the handle being imported must be described in {@code semHandleDesc}.

        If {@code ::type} is #EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD, then {@code ::handle::fd} must be a valid file descriptor referencing a synchronization
        object. Ownership of the file descriptor is transferred to the CUDA driver when the handle is imported successfully. Performing any operations on the
        file descriptor after it is imported results in undefined behavior.

        If {@code ::type} is #EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32, then exactly one of {@code ::handle::win32::handle} and
        {@code ::handle::win32::name} must not be #NULL. If {@code ::handle::win32::handle} is not #NULL, then it must represent a valid shared NT handle that
        references a synchronization object. Ownership of this handle is not transferred to CUDA after the import operation, so the application must release
        the handle using the appropriate system call. If {@code ::handle::win32::name} is not #NULL, then it must name a valid synchronization object.

        If {@code ::type} is #EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT, then {@code ::handle::win32::handle} must be non-NULL and
        {@code ::handle::win32::name} must be #NULL. The handle specified must be a globally shared KMT handle. This handle does not hold a reference to the
        underlying object, and thus will be invalid when all references to the synchronization object are destroyed.

        If {@code ::type} is #EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE, then exactly one of {@code ::handle::win32::handle} and {@code ::handle::win32::name}
        must not be #NULL. If {@code ::handle::win32::handle} is not #NULL, then it must represent a valid shared NT handle that is returned by
        {@code ID3D12Device::CreateSharedHandle} when referring to a {@code ID3D12Fence} object. This handle holds a reference to the underlying object. If
        {@code ::handle::win32::name} is not #NULL, then it must name a valid synchronization object that refers to a valid {@code ID3D12Fence} object.

        If {@code ::type} is #EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D11_FENCE, then {@code ::handle::win32::handle} represents a valid shared NT handle that is
        returned by {@code ID3D11Fence::CreateSharedHandle}. If {@code ::handle::win32::name} is not #NULL, then it must name a valid synchronization object
        that refers to a valid {@code ID3D11Fence} object.

        If {@code ::type} is #EXTERNAL_SEMAPHORE_HANDLE_TYPE_NVSCISYNC, then {@code ::handle::nvSciSyncObj} represents a valid {@code NvSciSyncObj}.

        #EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D11_KEYED_MUTEX, then {@code ::handle::win32::handle} represents a valid shared NT handle that is returned by
        {@code IDXGIResource1::CreateSharedHandle} when referring to a {@code IDXGIKeyedMutex} object. If {@code ::handle::win32::name} is not #NULL, then it
        must name a valid synchronization object that refers to a valid {@code IDXGIKeyedMutex} object.

        If {@code ::type} is #EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D11_KEYED_MUTEX_KMT, then {@code ::handle::win32::handle} represents a valid shared KMT handle
        that is returned by {@code IDXGIResource::GetSharedHandle} when referring to a {@code IDXGIKeyedMutex} object and {@code ::handle::win32::name} must be
        #NULL.

        If {@code ::type} is #EXTERNAL_SEMAPHORE_HANDLE_TYPE_TIMELINE_SEMAPHORE_FD, then {@code ::handle::fd} must be a valid file descriptor referencing a
        synchronization object. Ownership of the file descriptor is transferred to the CUDA driver when the handle is imported successfully. Performing any
        operations on the file descriptor after it is imported results in undefined behavior.

        If {@code ::type} is #EXTERNAL_SEMAPHORE_HANDLE_TYPE_TIMELINE_SEMAPHORE_WIN32, then exactly one of {@code ::handle::win32::handle} and
        {@code ::handle::win32::name} must not be #NULL. If {@code ::handle::win32::handle} is not #NULL, then it must represent a valid shared NT handle that
        references a synchronization object. Ownership of this handle is not transferred to CUDA after the import operation, so the application must release
        the handle using the appropriate system call. If {@code ::handle::win32::name} is not #NULL, then it must name a valid synchronization object.
        """,

        Check(1)..CUexternalSemaphore.p("extSem_out", "returned handle to an external semaphore"),
        CUDA_EXTERNAL_SEMAPHORE_HANDLE_DESC.const.p("semHandleDesc", "semaphore import handle descriptor")
    )

    IgnoreMissing..CUresult(
        "SignalExternalSemaphoresAsync",
        """
        Signals a set of external semaphore objects,

        Enqueues a signal operation on a set of externally allocated semaphore object in the specified stream. The operations will be executed when all prior
        operations in the stream complete.

        The exact semantics of signaling a semaphore depends on the type of the object.

        If the semaphore object is any one of the following types: #EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD,
        #EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32, #EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT then signaling the semaphore will set it to the
        signaled state.

        If the semaphore object is any one of the following types: #EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE,
        #EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D11_FENCE, #EXTERNAL_SEMAPHORE_HANDLE_TYPE_TIMELINE_SEMAPHORE_FD,
        #EXTERNAL_SEMAPHORE_HANDLE_TYPE_TIMELINE_SEMAPHORE_WIN32 then the semaphore will be set to the value specified in {@code ::params::fence::value}.

        If the semaphore object is of the type #EXTERNAL_SEMAPHORE_HANDLE_TYPE_NVSCISYNC this API sets
        {@code ::params::nvSciSync::fence} to a value that can be used by subsequent waiters of the same {@code NvSciSync} object to order operations with
        those currently submitted in {@code stream}. Such an update will overwrite previous contents of {@code ::params::nvSciSync::fence}. By default,
        signaling such an external semaphore object causes appropriate memory synchronization operations to be performed over all external memory objects that
        are imported as #EXTERNAL_MEMORY_HANDLE_TYPE_NVSCIBUF. This ensures that any subsequent accesses made by other importers of the same set of NvSciBuf
        memory object(s) are coherent. These operations can be skipped by specifying the flag #CUDA_EXTERNAL_SEMAPHORE_SIGNAL_SKIP_NVSCIBUF_MEMSYNC, which can
        be used as a performance optimization when data coherency is not required. But specifying this flag in scenarios where data coherency is required
        results in undefined behavior. Also, for semaphore object of the type #EXTERNAL_SEMAPHORE_HANDLE_TYPE_NVSCISYNC, if the {@code NvSciSyncAttrList} used
        to create the {@code NvSciSyncObj} had not set the flags in #DeviceGetNvSciSyncAttributes() to #CUDA_NVSCISYNC_ATTR_SIGNAL, this API will return
        #CUDA_ERROR_NOT_SUPPORTED.

        If the semaphore object is any one of the following types: #EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D11_KEYED_MUTEX,
        #EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D11_KEYED_MUTEX_KMT then the keyed mutex will be released with the key specified in {@code ::params::keyedmutex::key}.
        """,

        CUexternalSemaphore.const.p("extSemArray", "set of external semaphores to be signaled"),
        CUDA_EXTERNAL_SEMAPHORE_SIGNAL_PARAMS.const.p("paramsArray", "array of semaphore parameters"),
        AutoSize("extSemArray", "paramsArray")..unsigned_int("numExtSems", "number of semaphores to signal"),
        nullable..CUstream("stream", "stream to enqueue the signal operations in")
    ).ptsz()

    IgnoreMissing..CUresult(
        "WaitExternalSemaphoresAsync",
        """
        Waits on a set of external semaphore objects.

        Enqueues a wait operation on a set of externally allocated semaphore object in the specified stream. The operations will be executed when all prior
        operations in the stream complete.

        The exact semantics of waiting on a semaphore depends on the type of the object.

        If the semaphore object is any one of the following types: #EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD,
        #EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32, #EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT then waiting on the semaphore will wait until
        the semaphore reaches the signaled state. The semaphore will then be reset to the unsignaled state. Therefore for every signal operation, there can
        only be one wait operation.

        If the semaphore object is any one of the following types: #EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE,
        #EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D11_FENCE, #EXTERNAL_SEMAPHORE_HANDLE_TYPE_TIMELINE_SEMAPHORE_FD,
        #EXTERNAL_SEMAPHORE_HANDLE_TYPE_TIMELINE_SEMAPHORE_WIN32 then waiting on the semaphore will wait until the value of the semaphore is greater than
        or equal to {@code ::params::fence::value}.

        If the semaphore object is of the type #EXTERNAL_SEMAPHORE_HANDLE_TYPE_NVSCISYNC then, waiting on the semaphore will wait until the
        {@code ::params::nvSciSync::fence} is signaled by the signaler of the NvSciSyncObj that was associated with this semaphore object. By default, waiting
        on such an external semaphore object causes appropriate memory synchronization operations to be performed over all external memory objects that are
        imported as #EXTERNAL_MEMORY_HANDLE_TYPE_NVSCIBUF. This ensures that any subsequent accesses made by other importers of the same set of
        {@code NvSciBuf} memory object(s) are coherent. These operations can be skipped by specifying the flag
        #CUDA_EXTERNAL_SEMAPHORE_WAIT_SKIP_NVSCIBUF_MEMSYNC, which can be used as a performance optimization when data coherency is not required. But
        specifying this flag in scenarios where data coherency is required results in undefined behavior. Also, for semaphore object of the type
        #EXTERNAL_SEMAPHORE_HANDLE_TYPE_NVSCISYNC, if the {@code NvSciSyncAttrList} used to create the {@code NvSciSyncObj} had not set the flags in
        #DeviceGetNvSciSyncAttributes() to #CUDA_NVSCISYNC_ATTR_WAIT, this API will return #CUDA_ERROR_NOT_SUPPORTED.

        If the semaphore object is any one of the following types: #EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D11_KEYED_MUTEX,
        #EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D11_KEYED_MUTEX_KMT then the keyed mutex will be acquired when it is released with the key specified in
        {@code ::params::keyedmutex::key} or until the timeout specified by {@code ::params::keyedmutex::timeoutMs} has lapsed. The timeout interval can either
        be a finite value specified in milliseconds or an infinite value. In case an infinite value is specified the timeout never elapses. The windows
        {@code INFINITE} macro must be used to specify infinite timeout.
        """,

        CUexternalSemaphore.const.p("extSemArray", "external semaphores to be waited on"),
        CUDA_EXTERNAL_SEMAPHORE_WAIT_PARAMS.const.p("paramsArray", "array of semaphore parameters"),
        AutoSize("extSemArray", "paramsArray")..unsigned_int("numExtSems", "number of semaphores to wait on"),
        nullable..CUstream("stream", "stream to enqueue the wait operations in")
    ).ptsz()

    IgnoreMissing..CUresult(
        "DestroyExternalSemaphore",
        """
        Destroys an external semaphore.

        Destroys an external semaphore object and releases any references to the underlying resource. Any outstanding signals or waits must have completed
        before the semaphore is destroyed.
        """,

        CUexternalSemaphore("extSem", "external semaphore to be destroyed")
    )

    IgnoreMissing..CUresult(
        "StreamWaitValue32",
        """
        Wait on a memory location.

        Enqueues a synchronization of the stream on the given memory location. Work ordered after the operation will block until the given condition on the
        memory is satisfied. By default, the condition is to wait for {@code (int32_t)(*addr - value) >= 0}, a cyclic greater-or-equal. Other condition types
        can be specified via {@code flags}.

        If the memory was registered via #MemHostRegister(), the device pointer should be obtained with #MemHostGetDevicePointer(). This function cannot be
        used with managed memory (#MemAllocManaged()).

        Support for this can be queried with #DeviceGetAttribute() and #DEVICE_ATTRIBUTE_CAN_USE_STREAM_MEM_OPS.

        Support for #STREAM_WAIT_VALUE_NOR can be queried with #DeviceGetAttribute() and #DEVICE_ATTRIBUTE_CAN_USE_STREAM_WAIT_VALUE_NOR.
        """,

        nullable..CUstream("stream", "the stream to synchronize on the memory location"),
        CUdeviceptr("addr", "the memory location to wait on"),
        cuuint32_t("value", "the value to compare with the memory location"),
        unsigned_int("flags", "see {@code CUstreamWaitValue_flags}")
    ).ptsz()

    IgnoreMissing..CUresult(
        "StreamWaitValue64",
        """
        Wait on a memory location.

        Enqueues a synchronization of the stream on the given memory location. Work ordered after the operation will block until the given condition on the
        memory is satisfied. By default, the condition is to wait for {@code (int64_t)(*addr - value) >= 0}, a cyclic greater-or-equal. Other condition types
        can be specified via {@code flags}.

        If the memory was registered via #MemHostRegister(), the device pointer should be obtained with #MemHostGetDevicePointer().

        Support for this can be queried with #DeviceGetAttribute() and #DEVICE_ATTRIBUTE_CAN_USE_64_BIT_STREAM_MEM_OPS.
        """,

        nullable..CUstream("stream", "the stream to synchronize on the memory location"),
        CUdeviceptr("addr", "the memory location to wait on"),
        cuuint64_t("value", "the value to compare with the memory location"),
        unsigned_int("flags", "see {@code CUstreamWaitValue_flags}")
    ).ptsz()

    IgnoreMissing..CUresult(
        "StreamWriteValue32",
        """
        Write a value to memory.

        Write a value to memory. Unless the #STREAM_WRITE_VALUE_NO_MEMORY_BARRIER flag is passed, the write is preceded by a system-wide memory fence,
        equivalent to a {@code __threadfence_system()} but scoped to the stream rather than a CUDA thread.

        If the memory was registered via #MemHostRegister(), the device pointer should be obtained with #MemHostGetDevicePointer(). This function cannot
        be used with managed memory (#MemAllocManaged()).

        Support for this can be queried with #DeviceGetAttribute() and #DEVICE_ATTRIBUTE_CAN_USE_STREAM_MEM_OPS.
        """,

        nullable..CUstream("stream", "the stream to do the write in"),
        CUdeviceptr("addr", "the device address to write to"),
        cuuint32_t("value", "the value to write"),
        unsigned_int("flags", "see {@code CUstreamWriteValue_flags}")
    ).ptsz()

    IgnoreMissing..CUresult(
        "StreamWriteValue64",
        """
        Write a value to memory.

        Write a value to memory. Unless the #STREAM_WRITE_VALUE_NO_MEMORY_BARRIER flag is passed, the write is preceded by a system-wide memory fence,
        equivalent to a {@code __threadfence_system()} but scoped to the stream rather than a CUDA thread.

        If the memory was registered via #MemHostRegister(), the device pointer should be obtained with #MemHostGetDevicePointer().

        Support for this can be queried with #DeviceGetAttribute() and #DEVICE_ATTRIBUTE_CAN_USE_64_BIT_STREAM_MEM_OPS.
        """,

        nullable..CUstream("stream", "the stream to do the write in"),
        CUdeviceptr("addr", "the device address to write to"),
        cuuint64_t("value", "the value to write"),
        unsigned_int("flags", "see {@code CUstreamWriteValue_flags}")
    )

    IgnoreMissing..CUresult(
        "StreamBatchMemOp",
        """
        Batch operations to synchronize the stream via memory operations.

        This is a batch version of #StreamWaitValue32() and #StreamWriteValue32(). Batching operations may avoid some performance overhead in both the
        API call and the device execution versus adding them to the stream in separate API calls. The operations are enqueued in the order they appear in the
        array.

        See {@code CUstreamBatchMemOpType} for the full set of supported operations, and #StreamWaitValue32(), #StreamWaitValue64(), #StreamWriteValue32(),
        and #StreamWriteValue64() for details of specific operations.

        Basic support for this can be queried with #DeviceGetAttribute() and #DEVICE_ATTRIBUTE_CAN_USE_STREAM_MEM_OPS. See related APIs for details on
        querying support for specific operations.
        """,

        nullable..CUstream("stream", "the stream to enqueue the operations in"),
        AutoSize("paramArray")..unsigned_int("count", "the number of operations in the array. Must be less than 256."),
        CUstreamBatchMemOpParams.p("paramArray", "the types and parameters of the individual operations"),
        unsigned_int("flags", "reserved for future expansion; must be 0")
    ).ptsz()

    CUresult(
        "FuncGetAttribute",
        """
        Returns information about a function.

        Returns in {@code *pi} the integer value of the attribute {@code attrib} on the kernel given by {@code hfunc}. The supported attributes are:

        ${ul(
            """
            #FUNC_ATTRIBUTE_MAX_THREADS_PER_BLOCK: The maximum number of threads per block, beyond which a launch of the function would fail. This number
            depends on both the function and the device on which the function is currently loaded.
            """,
            """
            #FUNC_ATTRIBUTE_SHARED_SIZE_BYTES: The size in bytes of statically-allocated shared memory per block required by this function. This does not
            include dynamically-allocated shared memory requested by the user at runtime.
            """,
            "#FUNC_ATTRIBUTE_CONST_SIZE_BYTES: The size in bytes of user-allocated constant memory required by this function.",
            "#FUNC_ATTRIBUTE_LOCAL_SIZE_BYTES: The size in bytes of local memory used by each thread of this function.",
            "#FUNC_ATTRIBUTE_NUM_REGS: The number of registers used by each thread of this function.",
            """
            #FUNC_ATTRIBUTE_PTX_VERSION: The PTX virtual architecture version for which the function was compiled. This value is the major PTX version * 10
            + the minor PTX version, so a PTX version 1.3 function would return the value 13. Note that this may return the undefined value of 0 for cubins
            compiled prior to CUDA 3.0.
            """,
            """
            #FUNC_ATTRIBUTE_BINARY_VERSION: The binary architecture version for which the function was compiled. This value is the major binary version *
            10 + the minor binary version, so a binary version 1.3 function would return the value 13. Note that this will return a value of 10 for legacy
            cubins that do not have a properly-encoded binary architecture version.
            """,
            """
            #FUNC_ATTRIBUTE_CACHE_MODE_CA: The attribute to indicate whether the function has been compiled with user specified option "-Xptxas --dlcm=ca"
            set.
            """,
            "#FUNC_ATTRIBUTE_MAX_DYNAMIC_SHARED_SIZE_BYTES: The maximum size in bytes of dynamically-allocated shared memory.",
            "#FUNC_ATTRIBUTE_PREFERRED_SHARED_MEMORY_CARVEOUT: Preferred shared memory-L1 cache split ratio in percent of total shared memory."
        )}
        """,

        Check(1)..int.p("pi", "returned attribute value"),
        CUfunction_attribute("attrib", "attribute requested"),
        CUfunction("hfunc", "function to query attribute of")
    )

    IgnoreMissing..CUresult(
        "FuncSetAttribute",
        """
        Sets information about a function.

        This call sets the value of a specified attribute {@code attrib} on the kernel given by {@code hfunc} to an integer value specified by {@code val} This
        function returns #CUDA_SUCCESS if the new value of the attribute could be successfully set. If the set fails, this call will return an error. Not all
        attributes can have values set. Attempting to set a value on a read-only attribute will result in an error (#CUDA_ERROR_INVALID_VALUE).

        Supported attributes for the cuFuncSetAttribute call are:
        ${ul(
            """
            #FUNC_ATTRIBUTE_MAX_DYNAMIC_SHARED_SIZE_BYTES: This maximum size in bytes of dynamically-allocated shared memory. The value should contain the
            requested maximum size of dynamically-allocated shared memory. The sum of this value and the function attribute
            #FUNC_ATTRIBUTE_SHARED_SIZE_BYTES cannot exceed the device attribute #DEVICE_ATTRIBUTE_MAX_SHARED_MEMORY_PER_BLOCK_OPTIN. The maximal size
            of requestable dynamic shared memory may differ by GPU architecture.
            """,
            """
            #FUNC_ATTRIBUTE_PREFERRED_SHARED_MEMORY_CARVEOUT: On devices where the L1 cache and shared memory use the same hardware resources, this sets
            the shared memory carveout preference, in percent of the total shared memory. See #DEVICE_ATTRIBUTE_MAX_SHARED_MEMORY_PER_MULTIPROCESSOR This
            is only a hint, and the driver can choose a different ratio if required to execute the function.
            """
        )}
        """,

        CUfunction("hfunc", "function to query attribute of"),
        CUfunction_attribute("attrib", "attribute requested"),
        int("value", "the value to set")
    )

    CUresult(
        "FuncSetCacheConfig",
        """
        Sets the preferred cache configuration for a device function.

        On devices where the L1 cache and shared memory use the same hardware resources, this sets through {@code config} the preferred cache configuration for
        the device function {@code hfunc}. This is only a preference. The driver will use the requested configuration if possible, but it is free to choose a
        different configuration if required to execute {@code hfunc}. Any context-wide preference set via #CtxSetCacheConfig() will be overridden by this
        per-function setting unless the per-function setting is #FUNC_CACHE_PREFER_NONE. In that case, the current context-wide setting will be used.

        This setting does nothing on devices where the size of the L1 cache and shared memory are fixed.

        Launching a kernel with a different preference than the most recent preference setting may insert a device-side synchronization point.

        The supported cache configurations are:
        ${ul(
            "#FUNC_CACHE_PREFER_NONE: no preference for shared memory or L1 (default)",
            "#FUNC_CACHE_PREFER_SHARED: prefer larger shared memory and smaller L1 cache",
            "#FUNC_CACHE_PREFER_L1: prefer larger L1 cache and smaller shared memory",
            "#FUNC_CACHE_PREFER_EQUAL: prefer equal sized L1 cache and shared memory"
        )}
        """,

        CUfunction("hfunc", "kernel to configure cache for"),
        CUfunc_cache("config", "requested cache configuration")
    )

    IgnoreMissing..CUresult(
        "FuncSetSharedMemConfig",
        """
        Sets the shared memory configuration for a device function.

        On devices with configurable shared memory banks, this function will force all subsequent launches of the specified device function to have the given
        shared memory bank size configuration. On any given launch of the function, the shared memory configuration of the device will be temporarily changed
        if needed to suit the function's preferred configuration. Changes in shared memory configuration between subsequent launches of functions, may
        introduce a device side synchronization point.

        Any per-function setting of shared memory bank size set via #FuncSetSharedMemConfig() will override the context wide setting set with
        #CtxSetSharedMemConfig().

        Changing the shared memory bank size will not increase shared memory usage or affect occupancy of kernels, but may have major effects on performance.
        Larger bank sizes will allow for greater potential bandwidth to shared memory, but will change what kinds of accesses to shared memory will result in
        bank conflicts.

        This function will do nothing on devices with fixed shared memory bank size.

        The supported bank configurations are:

        ${ul(
            "#SHARED_MEM_CONFIG_DEFAULT_BANK_SIZE: use the context's shared memory configuration when launching this function.",
            "#SHARED_MEM_CONFIG_FOUR_BYTE_BANK_SIZE: set shared memory bank width to be natively four bytes when launching this function.",
            "#SHARED_MEM_CONFIG_EIGHT_BYTE_BANK_SIZE: set shared memory bank width to be natively eight bytes when launching this function."
        )}
        """,

        CUfunction("hfunc", "kernel to be given a shared memory config"),
        CUsharedconfig("config", "requested shared memory configuration")
    )

    IgnoreMissing..CUresult(
        "FuncGetModule",
        """
        Returns a module handle.

        Returns in {@code *hmod} the handle of the module that function {@code hfunc} is located in. The lifetime of the module corresponds to the lifetime of
        the context it was loaded in or until the module is explicitly unloaded.

        The CUDA runtime manages its own modules loaded into the primary context. If the handle returned by this API refers to a module loaded by the CUDA
        runtime, calling #ModuleUnload() on that module will result in undefined behavior.
        """,

        Check(1)..CUmodule.p("hmod", "returned module handle"),
        CUfunction("hfunc", "function to retrieve module for")
    )

    IgnoreMissing..CUresult(
        "LaunchKernel",
        """
        Launches a CUDA function.

        Invokes the kernel {@code f} on a {@code gridDimX} x {@code gridDimY} x {@code gridDimZ} grid of blocks. Each block contains {@code blockDimX} x {@code
        blockDimY} x {@code blockDimZ} threads.

        {@code sharedMemBytes} sets the amount of dynamic shared memory that will be available to each thread block.

        Kernel parameters to {@code f} can be specified in one of two ways:
        ${ol(
            """
            Kernel parameters can be specified via {@code kernelParams}.

            If {@code f} has N parameters, then {@code kernelParams} needs to be an array of N pointers. Each of {@code kernelParams[0]} through
            {@code kernelParams[N-1]} must point to a region of memory from which the actual kernel parameter will be copied. The number of kernel parameters
            and their offsets and sizes do not need to be specified as that information is retrieved directly from the kernel's image.
            """,
            """
            Kernel parameters can also be packaged by the application into a single buffer that is passed in via the {@code extra} parameter.

            This places the burden on the application of knowing each kernel parameter's size and alignment/padding within the buffer. Here is an example of
            using the {@code extra} parameter in this manner:
            ${codeBlock("""
size_t argBufferSize;
char argBuffer[256];

// populate argBuffer and argBufferSize

void *config[] = {
    CU_LAUNCH_PARAM_BUFFER_POINTER, argBuffer,
    CU_LAUNCH_PARAM_BUFFER_SIZE,    &argBufferSize,
    CU_LAUNCH_PARAM_END
};
status = cuLaunchKernel(f, gx, gy, gz, bx, by, bz, sh, s, NULL, config);""")}
            """
        )}

        The {@code extra} parameter exists to allow {@code cuLaunchKernel()} to take additional less commonly used arguments. {@code extra} specifies a list of
        names of extra settings and their corresponding values. Each extra setting name is immediately followed by the corresponding value. The list must be
        terminated with either #NULL or #LAUNCH_PARAM_END.
        ${ul(
            "#LAUNCH_PARAM_END, which indicates the end of the {@code extra} array",
            """
            #LAUNCH_PARAM_BUFFER_POINTER, which specifies that the next value in {@code extra} will be a pointer to a buffer containing all the kernel
            parameters for launching kernel {@code f}
            """,
            """
            #LAUNCH_PARAM_BUFFER_SIZE, which specifies that the next value in {@code extra} will be a pointer to a size_t containing the size of the buffer
            specified with #LAUNCH_PARAM_BUFFER_POINTER
            """
        )}

        The error #CUDA_ERROR_INVALID_VALUE will be returned if kernel parameters are specified with both {@code kernelParams} and {@code extra} (i.e. both
        {@code kernelParams} and {@code extra} are non-#NULL).

        Calling {@code cuLaunchKernel()} invalidates the persistent function state set through the following deprecated APIs: #FuncSetBlockShape(),
        #FuncSetSharedSize(), #ParamSetSize(), #ParamSeti(), #ParamSetf(), #ParamSetv().

        Note that to use #LaunchKernel(), the kernel {@code f} must either have been compiled with toolchain version 3.2 or later so that it will contain
        kernel parameter information, or have no kernel parameters. If either of these conditions is not met, then #LaunchKernel() will return
        #CUDA_ERROR_INVALID_IMAGE.
        """,

        CUfunction("f", "kernel to launch"),
        unsigned_int("gridDimX", "width of grid in blocks"),
        unsigned_int("gridDimY", "height of grid in blocks"),
        unsigned_int("gridDimZ", "depth of grid in blocks"),
        unsigned_int("blockDimX", "x dimension of each thread block"),
        unsigned_int("blockDimY", "y dimension of each thread block"),
        unsigned_int("blockDimZ", "z dimension of each thread block"),
        unsigned_int("sharedMemBytes", "dynamic shared-memory size per thread block in bytes"),
        nullable..CUstream("hStream", "stream identifier"),
        Unsafe..nullable..void.p.p("kernelParams", "array of pointers to kernel parameters"),
        Unsafe..nullable..void.p.p("extra", "extra options")
    ).ptsz()

    IgnoreMissing..CUresult(
        "LaunchCooperativeKernel",
        """
        Launches a CUDA function where thread blocks can cooperate and synchronize as they execute.

        Invokes the kernel {@code f} on a {@code gridDimX} x {@code gridDimY} x {@code gridDimZ} grid of blocks. Each block contains {@code blockDimX} x {@code
        blockDimY} x {@code blockDimZ} threads.

        {@code sharedMemBytes} sets the amount of dynamic shared memory that will be available to each thread block.

        The device on which this kernel is invoked must have a non-zero value for the device attribute #DEVICE_ATTRIBUTE_COOPERATIVE_LAUNCH.

        The total number of blocks launched cannot exceed the maximum number of blocks per multiprocessor as returned by
        #OccupancyMaxActiveBlocksPerMultiprocessor() (or #OccupancyMaxActiveBlocksPerMultiprocessorWithFlags()) times the number of multiprocessors as
        specified by the device attribute #DEVICE_ATTRIBUTE_MULTIPROCESSOR_COUNT.

        The kernel cannot make use of CUDA dynamic parallelism.

        Kernel parameters must be specified via {@code kernelParams}. If {@code f} has N parameters, then {@code kernelParams} needs to be an array of N
        pointers. Each of {@code kernelParams[0]} through {@code kernelParams[N-1]} must point to a region of memory from which the actual kernel parameter
        will be copied. The number of kernel parameters and their offsets and sizes do not need to be specified as that information is retrieved directly from
        the kernel's image.

        Calling #LaunchCooperativeKernel() sets persistent function state that is the same as function state set through #LaunchKernel() API

        When the kernel {@code f} is launched via #LaunchCooperativeKernel(), the previous block shape, shared size and parameter info associated with
        {@code f} is overwritten.

        Note that to use #LaunchCooperativeKernel(), the kernel {@code f} must either have been compiled with toolchain version 3.2 or later so that it will
        contain kernel parameter information, or have no kernel parameters. If either of these conditions is not met, then #LaunchCooperativeKernel() will
        return #CUDA_ERROR_INVALID_IMAGE.
        """,

        CUfunction("f", "kernel to launch"),
        unsigned_int("gridDimX", "width of grid in blocks"),
        unsigned_int("gridDimY", "height of grid in blocks"),
        unsigned_int("gridDimZ", "depth of grid in blocks"),
        unsigned_int("blockDimX", "x dimension of each thread block"),
        unsigned_int("blockDimY", "y dimension of each thread block"),
        unsigned_int("blockDimZ", "z dimension of each thread block"),
        unsigned_int("sharedMemBytes", "dynamic shared-memory size per thread block in bytes"),
        nullable..CUstream("hStream", "stream identifier"),
        Unsafe..nullable..void.p.p("kernelParams", "array of pointers to kernel parameters")
    ).ptsz()

    IgnoreMissing..CUresult(
        "LaunchCooperativeKernelMultiDevice",
        """
        Launches CUDA functions on multiple devices where thread blocks can cooperate and synchronize as they executeDeprecated: This function is deprecated as
        of CUDA 11.3.

        Invokes kernels as specified in the {@code launchParamsList} array where each element of the array specifies all the parameters required to perform a
        single kernel launch. These kernels can cooperate and synchronize as they execute. The size of the array is specified by {@code numDevices}.

        No two kernels can be launched on the same device. All the devices targeted by this multi-device launch must be identical. All devices must have a
        non-zero value for the device attribute #DEVICE_ATTRIBUTE_COOPERATIVE_MULTI_DEVICE_LAUNCH.

        All kernels launched must be identical with respect to the compiled code. Note that any __device__ __constant__ or __managed__ variables present
        in the module that owns the kernel launched on each device, are independently instantiated on every device. It is the application's responsibility to
        ensure these variables are initialized and used appropriately.

        The size of the grids as specified in blocks, the size of the blocks themselves and the amount of shared memory used by each thread block must also
        match across all launched kernels.

        The streams used to launch these kernels must have been created via either #StreamCreate() or #StreamCreateWithPriority(). The #NULL stream or
        #STREAM_LEGACY or #STREAM_PER_THREAD cannot be used.

        The total number of blocks launched per kernel cannot exceed the maximum number of blocks per multiprocessor as returned by
        #OccupancyMaxActiveBlocksPerMultiprocessor() (or #OccupancyMaxActiveBlocksPerMultiprocessorWithFlags()) times the number of multiprocessors as
        specified by the device attribute #DEVICE_ATTRIBUTE_MULTIPROCESSOR_COUNT. Since the total number of blocks launched per device has to match across
        all devices, the maximum number of blocks that can be launched per device will be limited by the device with the least number of multiprocessors.

        The kernels cannot make use of CUDA dynamic parallelism.

        ${ul(
            "{@code CUDA_LAUNCH_PARAMS::function} specifies the kernel to be launched. All functions must be identical with respect to the compiled code.",
            "{@code CUDA_LAUNCH_PARAMS::gridDimX} is the width of the grid in blocks. This must match across all kernels launched.",
            "{@code CUDA_LAUNCH_PARAMS::gridDimY} is the height of the grid in blocks. This must match across all kernels launched.",
            "{@code CUDA_LAUNCH_PARAMS::gridDimZ} is the depth of the grid in blocks. This must match across all kernels launched.",
            "{@code CUDA_LAUNCH_PARAMS::blockDimX} is the X dimension of each thread block. This must match across all kernels launched.",
            "{@code CUDA_LAUNCH_PARAMS::blockDimX} is the Y dimension of each thread block. This must match across all kernels launched.",
            "{@code CUDA_LAUNCH_PARAMS::blockDimZ} is the Z dimension of each thread block. This must match across all kernels launched.",
            """
            {@code CUDA_LAUNCH_PARAMS::sharedMemBytes} is the dynamic shared-memory size per thread block in bytes. This must match across all kernels
            launched.
            """,
            """
            {@code CUDA_LAUNCH_PARAMS::hStream} is the handle to the stream to perform the launch in. This cannot be the #NULL stream or #STREAM_LEGACY or
            #STREAM_PER_THREAD. The CUDA context associated with this stream must match that associated with {@code CUDA_LAUNCH_PARAMS::function}.
            """,
            """
            {@code CUDA_LAUNCH_PARAMS::kernelParams} is an array of pointers to kernel parameters. If {@code ::function} has N parameters, then
            {@code ::kernelParams} needs to be an array of N pointers. Each of {@code ::kernelParams[0]} through {@code ::kernelParams[N-1]} must point to a
            region of memory from which the actual kernel parameter will be copied. The number of kernel parameters and their offsets and sizes do not need to
            be specified as that information is retrieved directly from the kernel's image.
            """
        )}

        By default, the kernel won't begin execution on any GPU until all prior work in all the specified streams has completed. This behavior can be
        overridden by specifying the flag #CUDA_COOPERATIVE_LAUNCH_MULTI_DEVICE_NO_PRE_LAUNCH_SYNC. When this flag is specified, each kernel will only wait
        for prior work in the stream corresponding to that GPU to complete before it begins execution.

        Similarly, by default, any subsequent work pushed in any of the specified streams will not begin execution until the kernels on all GPUs have
        completed. This behavior can be overridden by specifying the flag #CUDA_COOPERATIVE_LAUNCH_MULTI_DEVICE_NO_POST_LAUNCH_SYNC. When this flag is
        specified, any subsequent work pushed in any of the specified streams will only wait for the kernel launched on the GPU corresponding to that stream to
        complete before it begins execution.

        Calling #LaunchCooperativeKernelMultiDevice() sets persistent function state that is the same as function state set through #LaunchKernel() API
        when called individually for each element in {@code launchParamsList}.

        When kernels are launched via #LaunchCooperativeKernelMultiDevice(), the previous block shape, shared size and parameter info associated with each
        {@code CUDA_LAUNCH_PARAMS::function} in {@code launchParamsList} is overwritten.

        Note that to use #LaunchCooperativeKernelMultiDevice(), the kernels must either have been compiled with toolchain version 3.2 or later so that it
        will contain kernel parameter information, or have no kernel parameters. If either of these conditions is not met, then
        #LaunchCooperativeKernelMultiDevice() will return #CUDA_ERROR_INVALID_IMAGE.
        """,

        CUDA_LAUNCH_PARAMS.p("launchParamsList", "list of launch parameters, one per device"),
        AutoSize("launchParamsList")..unsigned_int("numDevices", "size of the {@code launchParamsList} array"),
        unsigned_int("flags", "flags to control launch behavior")
    )

    IgnoreMissing..CUresult(
        "LaunchHostFunc",
        """
        Enqueues a host function call in a stream.

        Enqueues a host function to run in a stream. The function will be called after currently enqueued work and will block work added after it.

        The host function must not make any CUDA API calls. Attempting to use a CUDA API may result in #CUDA_ERROR_NOT_PERMITTED, but this is not required.
        The host function must not perform any synchronization that may depend on outstanding CUDA work not mandated to run earlier. Host functions without a
        mandated order (such as in independent streams) execute in undefined order and may be serialized.

        For the purposes of Unified Memory, execution makes a number of guarantees:
        ${ul(
            """
             The stream is considered idle for the duration of the function's execution. Thus, for example, the function may always use memory attached to the
             stream it was enqueued in.
            """,
            """
            The start of execution of the function has the same effect as synchronizing an event recorded in the same stream immediately prior to the function.
            It thus synchronizes streams which have been "joined" prior to the function.
            """,
            """
            Adding device work to any stream does not have the effect of making the stream active until all preceding host functions and stream callbacks have
            executed. Thus, for example, a function might use global attached memory even if work has been added to another stream, if the work has been
            ordered behind the function call with an event.
            """,
            """
            Completion of the function does not cause a stream to become active except as described above. The stream will remain idle if no device work
            follows the function, and will remain idle across consecutive host functions or stream callbacks without device work in between. Thus, for example,
            stream synchronization can be done by signaling from a host function at the end of the stream.
            """
        )}

        Note that, in contrast to #StreamAddCallback(), the function will not be called in the event of an error in the CUDA context.
        """,

        nullable..CUstream("hStream", "stream to enqueue function call in"),
        CUhostFn("fn", "the function to call once preceding stream operations are complete"),
        opaque_p("userData", "user-specified data to be passed to the function")
    ).ptsz()

    CUresult(
        "FuncSetBlockShape",
        """
        Sets the block-dimensions for the function. (Deprecated) 

        Specifies the {@code x}, {@code y}, and {@code z} dimensions of the thread blocks that are created when the kernel given by {@code hfunc} is launched.
        """,

        CUfunction("hfunc", "kernel to specify dimensions of"),
        int("x", "x dimension"),
        int("y", "y dimension"),
        int("z", "z dimension")
    )

    CUresult(
        "FuncSetSharedSize",
        """
        Sets the dynamic shared-memory size for the function. (Deprecated) 

        Sets through {@code bytes} the amount of dynamic shared memory that will be available to each thread block when the kernel given by {@code hfunc} is
        launched.
        """,

        CUfunction("hfunc", "kernel to specify dynamic shared-memory size for"),
        unsigned_int("bytes", "dynamic shared-memory size per thread in bytes")
    )

    CUresult(
        "ParamSetSize",
        """
        Sets the parameter size for the function. (Deprecated)

        Sets through {@code numbytes} the total size in bytes needed by the function parameters of the kernel corresponding to {@code hfunc}.
        """,

        CUfunction("hfunc", "kernel to set parameter size for"),
        unsigned_int("numbytes", "size of parameter list in bytes")
    )

    CUresult(
        "ParamSeti",
        """
        Adds an integer parameter to the function's argument listDeprecated: 

        Sets an integer parameter that will be specified the next time the kernel corresponding to {@code hfunc} will be invoked. {@code offset} is a byte
        offset.
        """,

        CUfunction("hfunc", "kernel to add parameter to"),
        int("offset", "offset to add parameter to argument list"),
        unsigned_int("value", "value of parameter")
    )

    CUresult(
        "ParamSetf",
        """
        Adds a floating-point parameter to the function's argument list. (Deprecated) 

        Sets a floating-point parameter that will be specified the next time the kernel corresponding to {@code hfunc} will be invoked. {@code offset} is a
        byte offset.
        """,

        CUfunction("hfunc", "kernel to add parameter to"),
        int("offset", "offset to add parameter to argument list"),
        float("value", "value of parameter")
    )

    CUresult(
        "ParamSetv",
        """
        Adds arbitrary data to the function's argument list. (Deprecated) 

        Copies an arbitrary amount of data (specified in {@code numbytes}) from {@code ptr} into the parameter space of the kernel corresponding to
        {@code hfunc}. {@code offset} is a byte offset.
        """,

        CUfunction("hfunc", "kernel to add data to"),
        int("offset", "offset to add data to argument list"),
        void.p("ptr", "pointer to arbitrary data"),
        AutoSize("ptr")..unsigned_int("numbytes", "size of data to copy in bytes")
    )

    CUresult(
        "Launch",
        """
        Launches a CUDA function. (Deprecated) 

        Invokes the kernel {@code f} on a 1 x 1 x 1 grid of blocks. The block contains the number of threads specified by a previous call to
        #FuncSetBlockShape().

        The block shape, dynamic shared memory size, and parameter information must be set using #FuncSetBlockShape(), #FuncSetSharedSize(),
        #ParamSetSize(), #ParamSeti(), #ParamSetf(), and #ParamSetv() prior to calling this function.

        Launching a function via #LaunchKernel() invalidates the function's block shape, dynamic shared memory size, and parameter information. After
        launching via cuLaunchKernel, this state must be re-initialized prior to calling this function. Failure to do so results in undefined behavior.
        """,

        CUfunction("f", "kernel to launch")
    )

    CUresult(
        "LaunchGrid",
        """
        Launches a CUDA function. (Deprecated) 

        Invokes the kernel {@code f} on a {@code grid_width} x {@code grid_height} grid of blocks. Each block contains the number of threads specified by a
        previous call to #FuncSetBlockShape().

        The block shape, dynamic shared memory size, and parameter information must be set using #FuncSetBlockShape(), #FuncSetSharedSize(),
        #ParamSetSize(), #ParamSeti(), #ParamSetf(), and #ParamSetv() prior to calling this function.

        Launching a function via #LaunchKernel() invalidates the function's block shape, dynamic shared memory size, and parameter information. After
        launching via cuLaunchKernel, this state must be re-initialized prior to calling this function. Failure to do so results in undefined behavior.
        """,

        CUfunction("f", "kernel to launch"),
        int("grid_width", "width of grid in blocks"),
        int("grid_height", "height of grid in blocks")
    )

    CUresult(
        "LaunchGridAsync",
        """
        Launches a CUDA function. (Deprecated)

        Invokes the kernel {@code f} on a {@code grid_width} x {@code grid_height} grid of blocks. Each block contains the number of threads specified by a
        previous call to #FuncSetBlockShape().

        The block shape, dynamic shared memory size, and parameter information must be set using #FuncSetBlockShape(), #FuncSetSharedSize(),
        #ParamSetSize(), #ParamSeti(), #ParamSetf(), and #ParamSetv() prior to calling this function.

        Launching a function via #LaunchKernel() invalidates the function's block shape, dynamic shared memory size, and parameter information. After
        launching via cuLaunchKernel, this state must be re-initialized prior to calling this function. Failure to do so results in undefined behavior.

        ${note("""In certain cases where cubins are created with no ABI (i.e., using {@code ptxas} {@code --abi-compile} {@code no}), this function may
        serialize kernel launches. The CUDA driver retains asynchronous behavior by growing the per-thread stack as needed per launch and not shrinking it
        afterwards.""")}
        """,

        CUfunction("f", "kernel to launch"),
        int("grid_width", "width of grid in blocks"),
        int("grid_height", "height of grid in blocks"),
        nullable..CUstream("hStream", "stream identifier")
    )

    CUresult(
        "ParamSetTexRef",
        """
        Adds a texture-reference to the function's argument list. (Deprecated)

        Makes the CUDA array or linear memory bound to the texture reference {@code hTexRef} available to a device program as a texture. In this version of
        CUDA, the texture-reference must be obtained via #ModuleGetTexRef() and the {@code texunit} parameter must be set to #PARAM_TR_DEFAULT.
        """,

        CUfunction("hfunc", "kernel to add texture-reference to"),
        int("texunit", "texture unit (must be #PARAM_TR_DEFAULT)"),
        CUtexref("hTexRef", "texture-reference to add to argument list")
    )

    IgnoreMissing..CUresult(
        "GraphCreate",
        """
        Creates a graph.

        Creates an empty graph, which is returned via {@code phGraph}.
        """,

        Check(1)..CUgraph.p("phGraph", "returns newly created graph"),
        unsigned_int("flags", "graph creation flags, must be 0")
    )

    IgnoreMissing..CUresult(
        "GraphAddKernelNode",
        """
        Creates a kernel execution node and adds it to a graph.

        Creates a new kernel execution node and adds it to {@code hGraph} with {@code numDependencies} dependencies specified via {@code dependencies} and
        arguments specified in {@code nodeParams}. It is possible for {@code numDependencies} to be 0, in which case the node will be placed at the root of the
        graph. {@code dependencies} may not have any duplicate entries. A handle to the new node will be returned in {@code phGraphNode}.

        When the graph is launched, the node will invoke kernel {@code func} on a ({@code gridDimX} x {@code gridDimY} x {@code gridDimZ}) grid of blocks. Each
        block contains ({@code blockDimX} x {@code blockDimY} x {@code blockDimZ}) threads.

        {@code sharedMemBytes} sets the amount of dynamic shared memory that will be available to each thread block.

        Kernel parameters to {@code func} can be specified in one of two ways:
        ${ol(
            """
            Kernel parameters can be specified via {@code kernelParams}. If the kernel has N parameters, then {@code kernelParams} needs to be an array of N
            pointers. Each pointer, from {@code kernelParams[0]} to {@code kernelParams[N-1]}, points to the region of memory from which the actual parameter
            will be copied. The number of kernel parameters and their offsets and sizes do not need to be specified as that information is retrieved directly
            from the kernel's image.
            """,
            """
            Kernel parameters for non-cooperative kernels can also be packaged by the application into a single buffer that is passed in via {@code extra}.
            This places the burden on the application of knowing each kernel parameter's size and alignment/padding within the buffer. The {@code extra}
            parameter exists to allow this function to take additional less commonly used arguments. {@code extra} specifies a list of names of extra settings
            and their corresponding values. Each extra setting name is immediately followed by the corresponding value. The list must be terminated with either
            #NULL or #LAUNCH_PARAM_END.
            ${ul(
                "#LAUNCH_PARAM_END, which indicates the end of the {@code extra} array;",
                """
                #LAUNCH_PARAM_BUFFER_POINTER, which specifies that the next value in {@code extra} will be a pointer to a buffer containing all the kernel
                parameters for launching kernel {@code func;}
                """,
                """
                #LAUNCH_PARAM_BUFFER_SIZE, which specifies that the next value in {@code extra} will be a pointer to a size_t containing the size of the buffer
                specified with #LAUNCH_PARAM_BUFFER_POINTER;
                """
            )}
            """
        )}

        The error #CUDA_ERROR_INVALID_VALUE will be returned if kernel parameters are specified with both {@code kernelParams} and {@code extra} (i.e. both
        {@code kernelParams} and {@code extra} are non-NULL). #CUDA_ERROR_INVALID_VALUE will be returned if {@code extra} is used for a cooperative kernel.

        The {@code kernelParams} or {@code extra} array, as well as the argument values it points to, are copied during this call.

        ${note("""Kernels launched using graphs must not use texture and surface references. Reading or writing through any texture or surface reference is
        undefined behavior. This restriction does not apply to texture and surface objects.""")}
        """,

        Check(1)..CUgraphNode.p("phGraphNode", "returns newly created node"),
        CUgraph("hGraph", "graph to which to add the node"),
        nullable..CUgraphNode.const.p("dependencies", "dependencies of the node"),
        AutoSize("dependencies")..size_t("numDependencies", "number of dependencies"),
        CUDA_KERNEL_NODE_PARAMS.const.p("nodeParams", "parameters for the GPU execution node")
    )

    IgnoreMissing..CUresult(
        "GraphKernelNodeGetParams",
        """
        Returns a kernel node's parameters.

        Returns the parameters of kernel node {@code hNode} in {@code nodeParams}. The {@code kernelParams} or {@code extra} array returned in
        {@code nodeParams}, as well as the argument values it points to, are owned by the node. This memory remains valid until the node is destroyed or its
        parameters are modified, and should not be modified directly. Use #GraphKernelNodeSetParams() to update the parameters of this node.

        The params will contain either {@code kernelParams} or {@code extra}, according to which of these was most recently set on the node.
        """,

        CUgraphNode("hNode", "node to get the parameters for"),
        CUDA_KERNEL_NODE_PARAMS.p("nodeParams", "pointer to return the parameters")
    )

    IgnoreMissing..CUresult(
        "GraphKernelNodeSetParams",
        """
        Sets a kernel node's parameters.

        Sets the parameters of kernel node {@code hNode} to {@code nodeParams}.
        """,

        CUgraphNode("hNode", "node to set the parameters for"),
        CUDA_KERNEL_NODE_PARAMS.const.p("nodeParams", "parameters to copy")
    )

    IgnoreMissing..CUresult(
        "GraphAddMemcpyNode",
        """
        Creates a memcpy node and adds it to a graph.

        Creates a new memcpy node and adds it to {@code hGraph} with {@code numDependencies} dependencies specified via {@code dependencies}. It is possible
        for {@code numDependencies} to be 0, in which case the node will be placed at the root of the graph. {@code dependencies} may not have any duplicate
        entries. A handle to the new node will be returned in {@code phGraphNode}.

        When the graph is launched, the node will perform the memcpy described by {@code copyParams}. See #Memcpy3D() for a description of the structure and
        its restrictions.

        Memcpy nodes have some additional restrictions with regards to managed memory, if the system contains at least one device which has a zero value for
        the device attribute #DEVICE_ATTRIBUTE_CONCURRENT_MANAGED_ACCESS. If one or more of the operands refer to managed memory, then using the memory
        type #MEMORYTYPE_UNIFIED is disallowed for those operand(s). The managed memory will be treated as residing on either the host or the device,
        depending on which memory type is specified.
        """,

        Check(1)..CUgraphNode.p("phGraphNode", "returns newly created node"),
        CUgraph("hGraph", "graph to which to add the node"),
        nullable..CUgraphNode.const.p("dependencies", "dependencies of the node"),
        AutoSize("dependencies")..size_t("numDependencies", "number of dependencies"),
        CUDA_MEMCPY3D.const.p("copyParams", "parameters for the memory copy"),
        CUcontext("ctx", "context on which to run the node")
    )

    IgnoreMissing..CUresult(
        "GraphMemcpyNodeGetParams",
        """
        Returns a memcpy node's parameters.

        Returns the parameters of memcpy node {@code hNode} in {@code nodeParams}.
        """,

        CUgraphNode("hNode", "node to get the parameters for"),
        CUDA_MEMCPY3D.p("nodeParams", "pointer to return the parameters")
    )

    IgnoreMissing..CUresult(
        "GraphMemcpyNodeSetParams",
        """
        Sets a memcpy node's parameters.

        Sets the parameters of memcpy node {@code hNode} to {@code nodeParams}.
        """,

        CUgraphNode("hNode", "node to set the parameters for"),
        CUDA_MEMCPY3D.const.p("nodeParams", "parameters to copy")
    )

    IgnoreMissing..CUresult(
        "GraphAddMemsetNode",
        """
        Creates a memset node and adds it to a graph.

        Creates a new memset node and adds it to {@code hGraph} with {@code numDependencies} dependencies specified via {@code dependencies}. It is possible
        for {@code numDependencies} to be 0, in which case the node will be placed at the root of the graph. {@code dependencies} may not have any duplicate
        entries. A handle to the new node will be returned in {@code phGraphNode}.

        The element size must be 1, 2, or 4 bytes. When the graph is launched, the node will perform the memset described by {@code memsetParams}.
        """,

        Check(1)..CUgraphNode.p("phGraphNode", "returns newly created node"),
        CUgraph("hGraph", "graph to which to add the node"),
        nullable..CUgraphNode.const.p("dependencies", "dependencies of the node"),
        AutoSize("dependencies")..size_t("numDependencies", "number of dependencies"),
        CUDA_MEMSET_NODE_PARAMS.const.p("memsetParams", "parameters for the memory set"),
        CUcontext("ctx", "context on which to run the node")
    )

    IgnoreMissing..CUresult(
        "GraphMemsetNodeGetParams",
        """
        Returns a memset node's parameters.

        Returns the parameters of memset node {@code hNode} in {@code nodeParams}.
        """,

        CUgraphNode("hNode", "node to get the parameters for"),
        CUDA_MEMSET_NODE_PARAMS.p("nodeParams", "pointer to return the parameters")
    )

    IgnoreMissing..CUresult(
        "GraphMemsetNodeSetParams",
        """
        Sets a memset node's parameters.

        Sets the parameters of memset node {@code hNode} to {@code nodeParams}.
        """,

        CUgraphNode("hNode", "node to set the parameters for"),
        CUDA_MEMSET_NODE_PARAMS.const.p("nodeParams", "parameters to copy")
    )

    IgnoreMissing..CUresult(
        "GraphAddHostNode",
        """
        Creates a host execution node and adds it to a graph.

        Creates a new CPU execution node and adds it to {@code hGraph} with {@code numDependencies} dependencies specified via {@code dependencies} and
        arguments specified in {@code nodeParams}. It is possible for {@code numDependencies} to be 0, in which case the node will be placed at the root of the
        graph. {@code dependencies} may not have any duplicate entries. A handle to the new node will be returned in {@code phGraphNode}.

        When the graph is launched, the node will invoke the specified CPU function. Host nodes are not supported under MPS with pre-Volta GPUs.
        """,

        Check(1)..CUgraphNode.p("phGraphNode", "returns newly created node"),
        CUgraph("hGraph", "graph to which to add the node"),
        nullable..CUgraphNode.const.p("dependencies", "dependencies of the node"),
        AutoSize("dependencies")..size_t("numDependencies", "number of dependencies"),
        CUDA_HOST_NODE_PARAMS.const.p("nodeParams", "parameters for the host node")
    )

    IgnoreMissing..CUresult(
        "GraphHostNodeGetParams",
        """
        Returns a host node's parameters.

        Returns the parameters of host node {@code hNode} in {@code nodeParams}.
        """,

        CUgraphNode("hNode", "node to get the parameters for"),
        CUDA_HOST_NODE_PARAMS.p("nodeParams", "pointer to return the parameters")
    )

    IgnoreMissing..CUresult(
        "GraphHostNodeSetParams",
        """
        Sets a host node's parameters.

        Sets the parameters of host node {@code hNode} to {@code nodeParams}.
        """,

        CUgraphNode("hNode", "node to set the parameters for"),
        CUDA_HOST_NODE_PARAMS.const.p("nodeParams", "parameters to copy")
    )

    IgnoreMissing..CUresult(
        "GraphAddChildGraphNode",
        """
        Creates a child graph node and adds it to a graph.

        Creates a new node which executes an embedded graph, and adds it to {@code hGraph} with {@code numDependencies} dependencies specified via {@code
        dependencies}. It is possible for {@code numDependencies} to be 0, in which case the node will be placed at the root of the graph. {@code dependencies}
        may not have any duplicate entries. A handle to the new node will be returned in {@code phGraphNode}.

        If {@code hGraph} contains allocation or free nodes, this call will return an error.

        The node executes an embedded child graph. The child graph is cloned in this call.
        """,

        Check(1)..CUgraphNode.p("phGraphNode", "returns newly created node"),
        CUgraph("hGraph", "graph to which to add the node"),
        nullable..CUgraphNode.const.p("dependencies", "dependencies of the node"),
        AutoSize("dependencies")..size_t("numDependencies", "number of dependencies"),
        CUgraph("childGraph", "the graph to clone into this node")
    )

    IgnoreMissing..CUresult(
        "GraphChildGraphNodeGetGraph",
        """
        Gets a handle to the embedded graph of a child graph node.

        Gets a handle to the embedded graph in a child graph node. This call does not clone the graph. Changes to the graph will be reflected in the node, and
        the node retains ownership of the graph.

        Allocation and free nodes cannot be added to the returned graph. Attempting to do so will return an error.
        """,

        CUgraphNode("hNode", "node to get the embedded graph for"),
        Check(1)..CUgraph.p("phGraph", "location to store a handle to the graph")
    )

    IgnoreMissing..CUresult(
        "GraphAddEmptyNode",
        """
        Creates an empty node and adds it to a graph.

        Creates a new node which performs no operation, and adds it to {@code hGraph} with {@code numDependencies} dependencies specified via {@code
        dependencies}. It is possible for {@code numDependencies} to be 0, in which case the node will be placed at the root of the graph. {@code dependencies}
        may not have any duplicate entries. A handle to the new node will be returned in {@code phGraphNode}.

        An empty node performs no operation during execution, but can be used for transitive ordering. For example, a phased execution graph with 2 groups of n
        nodes with a barrier between them can be represented using an empty node and 2*n dependency edges, rather than no empty node and n^2 dependency edges.
        """,

        Check(1)..CUgraphNode.p("phGraphNode", "returns newly created node"),
        CUgraph("hGraph", "graph to which to add the node"),
        nullable..CUgraphNode.const.p("dependencies", "dependencies of the node"),
        AutoSize("dependencies")..size_t("numDependencies", "number of dependencies")
    )

    IgnoreMissing..CUresult(
        "GraphAddEventRecordNode",
        """
        Creates an event record node and adds it to a graph.

        Creates a new event record node and adds it to {@code hGraph} with {@code numDependencies} dependencies specified via {@code dependencies} and event
        specified in {@code event}. It is possible for {@code numDependencies} to be 0, in which case the node will be placed at the root of the graph. {@code
        dependencies} may not have any duplicate entries. A handle to the new node will be returned in {@code phGraphNode}.

        Each launch of the graph will record {@code event} to capture execution of the node's dependencies.
        """,

        Check(1)..CUgraphNode.p("phGraphNode", "returns newly created node"),
        CUgraph("hGraph", "graph to which to add the node"),
        nullable..CUgraphNode.const.p("dependencies", "dependencies of the node"),
        AutoSize("dependencies")..size_t("numDependencies", "number of dependencies"),
        CUevent("event", "event for the node")
    )

    IgnoreMissing..CUresult(
        "GraphEventRecordNodeGetEvent",
        """
        Returns the event associated with an event record node.

        Returns the event of event record node {@code hNode} in {@code event_out}.
        """,

        CUgraphNode("hNode", "node to get the event for"),
        Check(1)..CUevent.p("event_out", "pointer to return the event")
    )

    IgnoreMissing..CUresult(
        "GraphEventRecordNodeSetEvent",
        """
        Sets an event record node's event.

        Sets the event of event record node {@code hNode} to {@code event}.
        """,

        CUgraphNode("hNode", "node to set the event for"),
        CUevent("event", "event to use")
    )

    IgnoreMissing..CUresult(
        "GraphAddEventWaitNode",
        """
        Creates an event wait node and adds it to a graph.

        Creates a new event wait node and adds it to {@code hGraph} with {@code numDependencies} dependencies specified via {@code dependencies} and event
        specified in {@code event}. It is possible for {@code numDependencies} to be 0, in which case the node will be placed at the root of the graph. {@code
        dependencies} may not have any duplicate entries. A handle to the new node will be returned in {@code phGraphNode}.

        The graph node will wait for all work captured in {@code event}. See #EventRecord() for details on what is captured by an event. {@code event} may
        be from a different context or device than the launch stream.
        """,

        Check(1)..CUgraphNode.p("phGraphNode", "returns newly created node"),
        CUgraph("hGraph", "graph to which to add the node"),
        nullable..CUgraphNode.const.p("dependencies", "dependencies of the node"),
        AutoSize("dependencies")..size_t("numDependencies", "number of dependencies"),
        CUevent("event", "event for the node")
    )

    IgnoreMissing..CUresult(
        "GraphEventWaitNodeGetEvent",
        """
        Returns the event associated with an event wait node.

        Returns the event of event wait node {@code hNode} in {@code event_out}.
        """,

        CUgraphNode("hNode", "node to get the event for"),
        Check(1)..CUevent.p("event_out", "pointer to return the event")
    )

    IgnoreMissing..CUresult(
        "GraphEventWaitNodeSetEvent",
        """
        Sets an event wait node's event.

        Sets the event of event wait node {@code hNode} to {@code event}.
        """,

        CUgraphNode("hNode", "node to set the event for"),
        CUevent("event", "event to use")
    )

    IgnoreMissing..CUresult(
        "GraphAddExternalSemaphoresSignalNode",
        """
        Creates an external semaphore signal node and adds it to a graph.

        Creates a new external semaphore signal node and adds it to {@code hGraph} with {@code numDependencies} dependencies specified via {@code dependencies}
        and arguments specified in {@code nodeParams}. It is possible for {@code numDependencies} to be 0, in which case the node will be placed at the root of
        the graph. {@code dependencies} may not have any duplicate entries. A handle to the new node will be returned in {@code phGraphNode}.

        Performs a signal operation on a set of externally allocated semaphore objects when the node is launched. The operation(s) will occur after all of the
        node's dependencies have completed.
        """,

        Check(1)..CUgraphNode.p("phGraphNode", "returns newly created node"),
        CUgraph("hGraph", "graph to which to add the node"),
        nullable..CUgraphNode.const.p("dependencies", "dependencies of the node"),
        AutoSize("dependencies")..size_t("numDependencies", "number of dependencies"),
        CUDA_EXT_SEM_SIGNAL_NODE_PARAMS.const.p("nodeParams", "parameters for the node")
    )

    IgnoreMissing..CUresult(
        "GraphExternalSemaphoresSignalNodeGetParams",
        """
        Returns an external semaphore signal node's parameters.

        Returns the parameters of an external semaphore signal node {@code hNode} in {@code params_out}. The {@code extSemArray} and {@code paramsArray}
        returned in {@code params_out}, are owned by the node. This memory remains valid until the node is destroyed or its parameters are modified, and should
        not be modified directly. Use #GraphExternalSemaphoresSignalNodeSetParams() to update the parameters of this node.
        """,

        CUgraphNode("hNode", "node to get the parameters for"),
        CUDA_EXT_SEM_SIGNAL_NODE_PARAMS.p("params_out", "pointer to return the parameters")
    )

    IgnoreMissing..CUresult(
        "GraphExternalSemaphoresSignalNodeSetParams",
        """
        Sets an external semaphore signal node's parameters.

        Sets the parameters of an external semaphore signal node {@code hNode} to {@code nodeParams}.
        """,

        CUgraphNode("hNode", "node to set the parameters for"),
        CUDA_EXT_SEM_SIGNAL_NODE_PARAMS.const.p("nodeParams", "parameters to copy")
    )

    IgnoreMissing..CUresult(
        "GraphAddExternalSemaphoresWaitNode",
        """
        Creates an external semaphore wait node and adds it to a graph.

        Creates a new external semaphore wait node and adds it to {@code hGraph} with {@code numDependencies} dependencies specified via {@code dependencies}
        and arguments specified in {@code nodeParams}. It is possible for {@code numDependencies} to be 0, in which case the node will be placed at the root of
        the graph. {@code dependencies} may not have any duplicate entries. A handle to the new node will be returned in {@code phGraphNode}.

        Performs a wait operation on a set of externally allocated semaphore objects when the node is launched. The node's dependencies will not be launched
        until the wait operation has completed.
        """,

        Check(1)..CUgraphNode.p("phGraphNode", "returns newly created node"),
        CUgraph("hGraph", "graph to which to add the node"),
        nullable..CUgraphNode.const.p("dependencies", "dependencies of the node"),
        AutoSize("dependencies")..size_t("numDependencies", "number of dependencies"),
        CUDA_EXT_SEM_WAIT_NODE_PARAMS.const.p("nodeParams", "parameters for the node")
    )

    IgnoreMissing..CUresult(
        "GraphExternalSemaphoresWaitNodeGetParams",
        """
        Returns an external semaphore wait node's parameters.

        Returns the parameters of an external semaphore wait node {@code hNode} in {@code params_out}. The {@code extSemArray} and {@code paramsArray} returned
        in {@code params_out}, are owned by the node. This memory remains valid until the node is destroyed or its parameters are modified, and should not be
        modified directly. Use #GraphExternalSemaphoresSignalNodeSetParams() to update the parameters of this node.
        """,

        CUgraphNode("hNode", "node to get the parameters for"),
        CUDA_EXT_SEM_WAIT_NODE_PARAMS.p("params_out", "pointer to return the parameters")
    )

    IgnoreMissing..CUresult(
        "GraphExternalSemaphoresWaitNodeSetParams",
        """
        Sets an external semaphore wait node's parameters.

        Sets the parameters of an external semaphore wait node {@code hNode} to {@code nodeParams}.
        """,

        CUgraphNode("hNode", "node to set the parameters for"),
        CUDA_EXT_SEM_WAIT_NODE_PARAMS.const.p("nodeParams", "parameters to copy")
    )

    IgnoreMissing..CUresult(
        "GraphAddMemAllocNode",
        """
        Creates an allocation node and adds it to a graph.

        Creates a new allocation node and adds it to {@code hGraph} with {@code numDependencies} dependencies specified via {@code dependencies} and arguments
        specified in {@code nodeParams}. It is possible for {@code numDependencies} to be 0, in which case the node will be placed at the root of the graph.
        {@code dependencies} may not have any duplicate entries. A handle to the new node will be returned in {@code phGraphNode}.

        When #GraphAddMemAllocNode() creates an allocation node, it returns the address of the allocation in {@code nodeParams.dptr}. The allocation's address
        remains fixed across instantiations and launches.

        If the allocation is freed in the same graph, by creating a free node using #GraphAddMemFreeNode(), the allocation can be accessed by nodes ordered
        after the allocation node but before the free node. These allocations cannot be freed outside the owning graph, and they can only be freed once in the
        owning graph.

        If the allocation is not freed in the same graph, then it can be accessed not only by nodes in the graph which are ordered after the allocation node,
        but also by stream operations ordered after the graph's execution but before the allocation is freed.

        Allocations which are not freed in the same graph can be freed by:
        ${ul(
            "passing the allocation to #MemFreeAsync() or #MemFree();",
            "launching a graph with a free node for that allocation; or",
            """
            specifying #CUDA_GRAPH_INSTANTIATE_FLAG_AUTO_FREE_ON_LAUNCH during instantiation, which makes each launch behave as though it called
            #MemFreeAsync() for every unfreed allocation.
            """
        )}

        It is not possible to free an allocation in both the owning graph and another graph. If the allocation is freed in the same graph, a free node cannot
        be added to another graph. If the allocation is freed in another graph, a free node can no longer be added to the owning graph.

        The following restrictions apply to graphs which contain allocation and/or memory free nodes:
        ${ul(
            "Nodes and edges of the graph cannot be deleted.",
            "The graph cannot be used in a child node.",
            "Only one instantiation of the graph may exist at any point in time.",
            "The graph cannot be cloned."
        )}
        """,

        Check(1)..CUgraphNode.p("phGraphNode", "returns newly created node"),
        CUgraph("hGraph", "graph to which to add the node"),
        nullable..CUgraphNode.const.p("dependencies", "dependencies of the node"),
        AutoSize("dependencies")..size_t("numDependencies", "number of dependencies"),
        CUDA_MEM_ALLOC_NODE_PARAMS.p("nodeParams", "parameters for the node")
    )

    IgnoreMissing..CUresult(
        "GraphMemAllocNodeGetParams",
        """
        Returns a memory alloc node's parameters.

        Returns the parameters of a memory alloc node {@code hNode} in {@code params_out}. The {@code poolProps} and {@code accessDescs} returned in {@code
        params_out}, are owned by the node. This memory remains valid until the node is destroyed. The returned parameters must not be modified.
        """,

        CUgraphNode("hNode", "node to get the parameters for"),
        CUDA_MEM_ALLOC_NODE_PARAMS.p("params_out", "pointer to return the parameters")
    )

    IgnoreMissing..CUresult(
        "GraphAddMemFreeNode",
        """
        Creates a memory free node and adds it to a graph.

        Creates a new memory free node and adds it to {@code hGraph} with {@code numDependencies} dependencies specified via {@code dependencies} and arguments
        specified in {@code nodeParams}. It is possible for {@code numDependencies} to be 0, in which case the node will be placed at the root of the graph.
        {@code dependencies} may not have any duplicate entries. A handle to the new node will be returned in {@code phGraphNode}.

        #GraphAddMemFreeNode() will return #CUDA_ERROR_INVALID_VALUE if the user attempts to free:
        ${ul(
            "an allocation twice in the same graph.",
            "an address that was not returned by an allocation node.",
            "an invalid address."
        )}

        The following restrictions apply to graphs which contain allocation and/or memory free nodes:
        ${ul(
            "Nodes and edges of the graph cannot be deleted.",
            "The graph cannot be used in a child node.",
            "Only one instantiation of the graph may exist at any point in time.",
            "The graph cannot be cloned."
        )}
        """,

        Check(1)..CUgraphNode.p("phGraphNode", "returns newly created node"),
        CUgraph("hGraph", "graph to which to add the node"),
        nullable..CUgraphNode.const.p("dependencies", "dependencies of the node"),
        AutoSize("dependencies")..size_t("numDependencies", "number of dependencies"),
        CUdeviceptr("dptr", "address of memory to free")
    )

    IgnoreMissing..CUresult(
        "GraphMemFreeNodeGetParams",
        """
        Returns a memory free node's parameters.

        Returns the address of a memory free node {@code hNode} in {@code dptr_out}.
        """,

        CUgraphNode("hNode", "node to get the parameters for"),
        Check(1)..CUdeviceptr.p("dptr_out", "pointer to return the device address")
    )

    IgnoreMissing..CUresult(
        "DeviceGraphMemTrim",
        """
        Free unused memory that was cached on the specified device for use with graphs back to the OS.

        Blocks which are not in use by a graph that is either currently executing or scheduled to execute are freed back to the operating system.
        """,

        CUdevice("device", "the device for which cached memory should be freed")
    )

    IgnoreMissing..CUresult(
        "DeviceGetGraphMemAttribute",
        """
        Query asynchronous allocation attributes related to graphs.

        Valid attributes are:
        ${ul(
            "#GRAPH_MEM_ATTR_USED_MEM_CURRENT: Amount of memory, in bytes, currently associated with graphs",
            """
            #GRAPH_MEM_ATTR_USED_MEM_HIGH: High watermark of memory, in bytes, associated with graphs since the last time it was reset. High watermark can
            only be reset to zero.
            """,
            "#GRAPH_MEM_ATTR_RESERVED_MEM_CURRENT: Amount of memory, in bytes, currently allocated for use by the CUDA graphs asynchronous allocator.",
            "#GRAPH_MEM_ATTR_RESERVED_MEM_HIGH: High watermark of memory, in bytes, currently allocated for use by the CUDA graphs asynchronous allocator."
        )}
        """,

        CUdevice("device", "specifies the scope of the query"),
        CUgraphMem_attribute("attr", "attribute to get"),
        MultiType(PointerMapping.DATA_LONG)..Unsafe..void.p("value", "retrieved value")
    )

    IgnoreMissing..CUresult(
        "DeviceSetGraphMemAttribute",
        """
        Set asynchronous allocation attributes related to graphs.

        Valid attributes are:
        ${ul(
            """
            #GRAPH_MEM_ATTR_USED_MEM_HIGH: High watermark of memory, in bytes, associated with graphs since the last time it was reset. High watermark can
            only be reset to zero.
            """,
            "#GRAPH_MEM_ATTR_RESERVED_MEM_HIGH: High watermark of memory, in bytes, currently allocated for use by the CUDA graphs asynchronous allocator."
        )}
        """,

        CUdevice("device", "specifies the scope of the query"),
        CUgraphMem_attribute("attr", "attribute to get"),
        MultiType(PointerMapping.DATA_LONG)..Unsafe..void.p("value", "pointer to value to set")
    )

    IgnoreMissing..CUresult(
        "GraphClone",
        """
        Clones a graph.

        This function creates a copy of {@code originalGraph} and returns it in {@code phGraphClone}. All parameters are copied into the cloned graph. The
        original graph may be modified after this call without affecting the clone.

        Child graph nodes in the original graph are recursively copied into the clone.
        """,

        Check(1)..CUgraph.p("phGraphClone", "returns newly created cloned graph"),
        CUgraph("originalGraph", "graph to clone")
    )

    IgnoreMissing..CUresult(
        "GraphNodeFindInClone",
        """
        Finds a cloned version of a node.

        This function returns the node in {@code hClonedGraph} corresponding to {@code hOriginalNode} in the original graph.

        {@code hClonedGraph} must have been cloned from {@code hOriginalGraph} via #GraphClone(). {@code hOriginalNode} must have been in {@code
        hOriginalGraph} at the time of the call to #GraphClone(), and the corresponding cloned node in {@code hClonedGraph} must not have been removed. The
        cloned node is then returned via {@code phClonedNode}.
        """,

        Check(1)..CUgraphNode.p("phNode", "returns handle to the cloned node"),
        CUgraphNode("hOriginalNode", "handle to the original node"),
        CUgraph("hClonedGraph", "cloned graph to query")
    )

    IgnoreMissing..CUresult(
        "GraphNodeGetType",
        """
        Returns a node's type.

        Returns the node type of {@code hNode} in {@code type}.
        """,

        CUgraphNode("hNode", "node to query"),
        Check(1)..CUgraphNodeType.p("type", "pointer to return the node type")
    )

    IgnoreMissing..CUresult(
        "GraphGetNodes",
        """
        Returns a graph's nodes.

        Returns a list of {@code hGraph's} nodes. {@code nodes} may be #NULL, in which case this function will return the number of nodes in {@code numNodes}.
        Otherwise, {@code numNodes} entries will be filled in. If {@code numNodes} is higher than the actual number of nodes, the remaining entries in {@code
        nodes} will be set to #NULL, and the number of nodes actually obtained will be returned in {@code numNodes}.
        """,

        CUgraph("hGraph", "graph to query"),
        nullable..CUgraphNode.p("nodes", "pointer to return the nodes"),
        AutoSize("nodes")..Check(1)..size_t.p("numNodes", "see description")
    )

    IgnoreMissing..CUresult(
        "GraphGetRootNodes",
        """
        Returns a graph's root nodes.

        Returns a list of {@code hGraph's} root nodes. {@code rootNodes} may be #NULL, in which case this function will return the number of root nodes in
        {@code numRootNodes}. Otherwise, {@code numRootNodes} entries will be filled in. If {@code numRootNodes} is higher than the actual number of root
        nodes, the remaining entries in {@code rootNodes} will be set to #NULL, and the number of nodes actually obtained will be returned in {@code
        numRootNodes}.
        """,

        CUgraph("hGraph", "graph to query"),
        nullable..CUgraphNode.p("rootNodes", "pointer to return the root nodes"),
        AutoSize("rootNodes")..Check(1)..size_t.p("numRootNodes", "see description") // TODO:
    )

    IgnoreMissing..CUresult(
        "GraphGetEdges",
        """
        Returns a graph's dependency edges.

        Returns a list of {@code hGraph's} dependency edges. Edges are returned via corresponding indices in {@code from} and {@code to;} that is, the node in
        {@code to[i]} has a dependency on the node in {@code from[i]}. {@code from} and {@code to} may both be #NULL, in which case this function only returns
        the number of edges in {@code numEdges}. Otherwise, {@code numEdges} entries will be filled in. If {@code numEdges} is higher than the actual number of
        edges, the remaining entries in {@code from} and {@code to} will be set to #NULL, and the number of edges actually returned will be written to
        {@code numEdges}.
        """,

        CUgraph("hGraph", "graph to get the edges from"),
        nullable..CUgraphNode.p("from", "location to return edge endpoints"),
        nullable..CUgraphNode.p("to", "location to return edge endpoints"),
        AutoSize("from", "to")..Check(1)..size_t.p("numEdges", "see description")
    )

    IgnoreMissing..CUresult(
        "GraphNodeGetDependencies",
        """
        Returns a node's dependencies.

        Returns a list of {@code node's} dependencies. {@code dependencies} may be #NULL, in which case this function will return the number of dependencies in
        {@code numDependencies}. Otherwise, {@code numDependencies} entries will be filled in. If {@code numDependencies} is higher than the actual number of
        dependencies, the remaining entries in {@code dependencies} will be set to #NULL, and the number of nodes actually obtained will be returned in
        {@code numDependencies}.
        """,

        CUgraphNode("hNode", "node to query"),
        nullable..CUgraphNode.p("dependencies", "pointer to return the dependencies"),
        AutoSize("dependencies")..Check(1)..size_t.p("numDependencies", "see description")
    )

    IgnoreMissing..CUresult(
        "GraphNodeGetDependentNodes",
        """
        Returns a node's dependent nodes.

        Returns a list of {@code node's} dependent nodes. {@code dependentNodes} may be #NULL, in which case this function will return the number of dependent
        nodes in {@code numDependentNodes}. Otherwise, {@code numDependentNodes} entries will be filled in. If {@code numDependentNodes} is higher than the
        actual number of dependent nodes, the remaining entries in {@code dependentNodes} will be set to #NULL, and the number of nodes actually obtained will
        be returned in {@code numDependentNodes}.
        """,

        CUgraphNode("hNode", "node to query"),
        nullable..CUgraphNode.p("dependentNodes", "pointer to return the dependent nodes"),
        AutoSize("dependentNodes")..Check(1)..size_t.p("numDependentNodes", "see description")
    )

    IgnoreMissing..CUresult(
        "GraphAddDependencies",
        """
        Adds dependency edges to a graph.

        The number of dependencies to be added is defined by {@code numDependencies} Elements in {@code from} and {@code to} at corresponding indices define a
        dependency. Each node in {@code from} and {@code to} must belong to {@code hGraph}.

        If {@code numDependencies} is 0, elements in {@code from} and {@code to} will be ignored. Specifying an existing dependency will return an error.
        """,

        CUgraph("hGraph", "graph to which dependencies are added"),
        nullable..CUgraphNode.const.p("from", "array of nodes that provide the dependencies"),
        nullable..CUgraphNode.const.p("to", "array of dependent nodes"),
        AutoSize("from", "to")..size_t("numDependencies", "number of dependencies to be added")
    )

    IgnoreMissing..CUresult(
        "GraphRemoveDependencies",
        """
        Removes dependency edges from a graph.

        The number of {@code dependencies} to be removed is defined by {@code numDependencies}. Elements in {@code from} and {@code to} at corresponding
        indices define a dependency. Each node in {@code from} and {@code to} must belong to {@code hGraph}.

        If {@code numDependencies} is 0, elements in {@code from} and {@code to} will be ignored. Specifying a non-existing dependency will return an error.

        Dependencies cannot be removed from graphs which contain allocation or free nodes. Any attempt to do so will return an error.
        """,

        CUgraph("hGraph", "graph from which to remove dependencies"),
        nullable..CUgraphNode.const.p("from", "array of nodes that provide the dependencies"),
        nullable..CUgraphNode.const.p("to", "array of dependent nodes"),
        AutoSize("from", "to")..size_t("numDependencies", "number of dependencies to be removed")
    )

    IgnoreMissing..CUresult(
        "GraphDestroyNode",
        """
        Remove a node from the graph.

        Removes {@code hNode} from its graph. This operation also severs any dependencies of other nodes on {@code hNode} and vice versa.

        Nodes which belong to a graph which contains allocation or free nodes cannot be destroyed. Any attempt to do so will return an error.
        """,

        CUgraphNode("hNode", "node to remove")
    )

    IgnoreMissing..CUresult(
        "GraphInstantiate",
        """
        Creates an executable graph from a graph.

        Instantiates {@code hGraph} as an executable graph. The graph is validated for any structural constraints or intra-node constraints which were not
        previously validated. If instantiation is successful, a handle to the instantiated graph is returned in {@code phGraphExec}.

        If there are any errors, diagnostic information may be returned in {@code errorNode} and {@code logBuffer}. This is the primary way to inspect
        instantiation errors. The output will be null terminated unless the diagnostics overflow the buffer. In this case, they will be truncated, and the last
        byte can be inspected to determine if truncation occurred.
        """,

        Check(1)..CUgraphExec.p("phGraphExec", "returns instantiated graph"),
        CUgraph("hGraph", "graph to instantiate"),
        Check(1)..CUgraphNode.p("phErrorNode", "in case of an instantiation error, this may be modified to indicate a node contributing to the error"),
        char.p("logBuffer", "a character buffer to store diagnostic messages"),
        AutoSize("logBuffer")..size_t("bufferSize", "size of the log buffer in bytes")
    ).versioned()

    IgnoreMissing..CUresult(
        "GraphInstantiateWithFlags",
        """
        Creates an executable graph from a graph.

        Instantiates {@code hGraph} as an executable graph. The graph is validated for any structural constraints or intra-node constraints which were not
        previously validated. If instantiation is successful, a handle to the instantiated graph is returned in {@code phGraphExec}.

        The {@code flags} parameter controls the behavior of instantiation and subsequent graph launches. Valid flags are:
        ${ul(
            """
            #CUDA_GRAPH_INSTANTIATE_FLAG_AUTO_FREE_ON_LAUNCH, which configures a graph containing memory allocation nodes to automatically free any unfreed
            memory allocations before the graph is relaunched.
            """
        )}

        If {@code hGraph} contains any allocation or free nodes, there can be at most one executable graph in existence for that graph at a time.

        An attempt to instantiate a second executable graph before destroying the first with #GraphExecDestroy() will result in an error.
        """,

        Check(1)..CUgraphExec.p("phGraphExec", "returns instantiated graph"),
        CUgraph("hGraph", "graph to instantiate"),
        unsigned_long_long("flags", "flags to control instantiation. See {@code CUgraphInstantiate_flags}.")
    )

    IgnoreMissing..CUresult(
        "GraphExecKernelNodeSetParams",
        """
        Sets the parameters for a kernel node in the given {@code graphExec}.

        Sets the parameters of a kernel node in an executable graph {@code hGraphExec}. The node is identified by the corresponding node {@code hNode} in the
        non-executable graph, from which the executable graph was instantiated.

        {@code hNode} must not have been removed from the original graph. The {@code func} field of {@code nodeParams} cannot be modified and must match the
        original value. All other values can be modified.

        The modifications take effect at the next launch of {@code hGraphExec}. Already enqueued or running launches of {@code hGraphExec} are not affected by
        this call. {@code hNode} is also not modified by this call.
        """,

        CUgraphExec("hGraphExec", "the executable graph in which to set the specified node"),
        CUgraphNode("hNode", "kernel node from the graph from which graphExec was instantiated"),
        CUDA_KERNEL_NODE_PARAMS.const.p("nodeParams", "updated parameters to set")
    )

    IgnoreMissing..CUresult(
        "GraphExecMemcpyNodeSetParams",
        """
        Sets the parameters for a memcpy node in the given {@code graphExec}.

        Updates the work represented by {@code hNode} in {@code hGraphExec} as though {@code hNode} had contained {@code copyParams} at instantiation.
        {@code hNode} must remain in the graph which was used to instantiate {@code hGraphExec}. Changed edges to and from {@code hNode} are ignored.

        The source and destination memory in {@code copyParams} must be allocated from the same contexts as the original source and destination memory. Both
        the instantiation-time memory operands and the memory operands in {@code copyParams} must be 1-dimensional. Zero-length operations are not supported.

        The modifications only affect future launches of {@code hGraphExec}. Already enqueued or running launches of {@code hGraphExec} are not affected by
        this call. hNode is also not modified by this call.

        Returns #CUDA_ERROR_INVALID_VALUE if the memory operands' mappings changed or either the original or new memory operands are multidimensional.
        """,

        CUgraphExec("hGraphExec", "the executable graph in which to set the specified node"),
        CUgraphNode("hNode", "memcpy node from the graph which was used to instantiate graphExec"),
        CUDA_MEMCPY3D.const.p("copyParams", "the updated parameters to set"),
        CUcontext("ctx", "context on which to run the node")
    )

    IgnoreMissing..CUresult(
        "GraphExecMemsetNodeSetParams",
        """
        Sets the parameters for a {@code memset} node in the given {@code graphExec}.

        Updates the work represented by {@code hNode} in {@code hGraphExec} as though {@code hNode} had contained {@code memsetParams} at instantiation.
        {@code hNode} must remain in the graph which was used to instantiate {@code hGraphExec}. Changed edges to and from {@code hNode} are ignored.

        The destination memory in {@code memsetParams} must be allocated from the same contexts as the original destination memory. Both the instantiation-time
        memory operand and the memory operand in {@code memsetParams} must be 1-dimensional. Zero-length operations are not supported.

        The modifications only affect future launches of {@code hGraphExec}. Already enqueued or running launches of {@code hGraphExec} are not affected by
        this call. hNode is also not modified by this call.

        Returns CUDA_ERROR_INVALID_VALUE if the memory operand's mappings changed or either the original or new memory operand are multidimensional.
        """,

        CUgraphExec("hGraphExec", "the executable graph in which to set the specified node"),
        CUgraphNode("hNode", "memset node from the graph which was used to instantiate graphExec"),
        CUDA_MEMSET_NODE_PARAMS.const.p("memsetParams", "the updated parameters to set"),
        CUcontext("ctx", "context on which to run the node")
    )

    IgnoreMissing..CUresult(
        "GraphExecHostNodeSetParams",
        """
        Sets the parameters for a host node in the given {@code graphExec}.

        Updates the work represented by {@code hNode} in {@code hGraphExec} as though {@code hNode} had contained {@code nodeParams} at instantiation.
        {@code hNode} must remain in the graph which was used to instantiate {@code hGraphExec}. Changed edges to and from {@code hNode} are ignored.

        The modifications only affect future launches of {@code hGraphExec}. Already enqueued or running launches of {@code hGraphExec} are not affected by
        this call. hNode is also not modified by this call.
        """,

        CUgraphExec("hGraphExec", "the executable graph in which to set the specified node"),
        CUgraphNode("hNode", "host node from the graph which was used to instantiate graphExec"),
        CUDA_HOST_NODE_PARAMS.const.p("nodeParams", "the updated parameters to set")
    )

    IgnoreMissing..CUresult(
        "GraphExecChildGraphNodeSetParams",
        """
        Updates node parameters in the child graph node in the given {@code graphExec}.

        Updates the work represented by {@code hNode} in {@code hGraphExec} as though the nodes contained in {@code hNode's} graph had the parameters contained
        in {@code childGraph's} nodes at instantiation. {@code hNode} must remain in the graph which was used to instantiate {@code hGraphExec}. Changed edges
        to and from {@code hNode} are ignored.

        The modifications only affect future launches of {@code hGraphExec}. Already enqueued or running launches of {@code hGraphExec} are not affected by
        this call. {@code hNode} is also not modified by this call.

        The topology of {@code childGraph}, as well as the node insertion order, must match that of the graph contained in {@code hNode}. See
        #GraphExecUpdate() for a list of restrictions on what can be updated in an instantiated graph. The update is recursive, so child graph nodes
        contained within the top level child graph will also be updated.
        """,

        CUgraphExec("hGraphExec", "the executable graph in which to set the specified node"),
        CUgraphNode("hNode", "host node from the graph which was used to instantiate {@code graphExec}"),
        CUgraph("childGraph", "the graph supplying the updated parameters")
    )

    IgnoreMissing..CUresult(
        "GraphExecEventRecordNodeSetEvent",
        """
        Sets the event for an event record node in the given {@code graphExec}.

        Sets the event of an event record node in an executable graph {@code hGraphExec}. The node is identified by the corresponding node {@code hNode} in the
        non-executable graph, from which the executable graph was instantiated.

        The modifications only affect future launches of {@code hGraphExec}. Already enqueued or running launches of {@code hGraphExec} are not affected by
        this call. {@code hNode} is also not modified by this call.
        """,

        CUgraphExec("hGraphExec", "the executable graph in which to set the specified node"),
        CUgraphNode("hNode", "event record node from the graph from which graphExec was instantiated"),
        CUevent("event", "updated event to use")
    )

    IgnoreMissing..CUresult(
        "GraphExecEventWaitNodeSetEvent",
        """
        Sets the event for an event wait node in the given {@code graphExec}.

        Sets the event of an event wait node in an executable graph {@code hGraphExec}. The node is identified by the corresponding node {@code hNode} in the
        non-executable graph, from which the executable graph was instantiated.

        The modifications only affect future launches of {@code hGraphExec}. Already enqueued or running launches of {@code hGraphExec} are not affected by
        this call. {@code hNode} is also not modified by this call.
        """,

        CUgraphExec("hGraphExec", "the executable graph in which to set the specified node"),
        CUgraphNode("hNode", "event wait node from the graph from which graphExec was instantiated"),
        CUevent("event", "updated event to use")
    )

    IgnoreMissing..CUresult(
        "GraphExecExternalSemaphoresSignalNodeSetParams",
        """
        Sets the parameters for an external semaphore signal node in the given {@code graphExec}.

        Sets the parameters of an external semaphore signal node in an executable graph {@code hGraphExec}. The node is identified by the corresponding node
        {@code hNode} in the non-executable graph, from which the executable graph was instantiated.

        {@code hNode} must not have been removed from the original graph.

        The modifications only affect future launches of {@code hGraphExec}. Already enqueued or running launches of {@code hGraphExec} are not affected by
        this call. {@code hNode} is also not modified by this call.

        Changing {@code nodeParams->numExtSems} is not supported.
        """,

        CUgraphExec("hGraphExec", "the executable graph in which to set the specified node"),
        CUgraphNode("hNode", "semaphore signal node from the graph from which graphExec was instantiated"),
        CUDA_EXT_SEM_SIGNAL_NODE_PARAMS.const.p("nodeParams", "updated Parameters to set")
    )

    IgnoreMissing..CUresult(
        "GraphExecExternalSemaphoresWaitNodeSetParams",
        """
        Sets the parameters for an external semaphore wait node in the given graphExec.

        Sets the parameters of an external semaphore wait node in an executable graph {@code hGraphExec}. The node is identified by the corresponding node
        {@code hNode} in the non-executable graph, from which the executable graph was instantiated.

        {@code hNode} must not have been removed from the original graph.

        The modifications only affect future launches of {@code hGraphExec}. Already enqueued or running launches of {@code hGraphExec} are not affected by
        this call. {@code hNode} is also not modified by this call.

        Changing {@code nodeParams->numExtSems} is not supported.
        """,

        CUgraphExec("hGraphExec", "the executable graph in which to set the specified node"),
        CUgraphNode("hNode", "semaphore wait node from the graph from which graphExec was instantiated"),
        CUDA_EXT_SEM_WAIT_NODE_PARAMS.const.p("nodeParams", "updated Parameters to set")
    )

    IgnoreMissing..CUresult(
        "GraphUpload",
        """
        Uploads an executable graph in a stream.

        Uploads {@code hGraphExec} to the device in {@code hStream} without executing it. Uploads of the same {@code hGraphExec} will be serialized. Each
        upload is ordered behind both any previous work in {@code hStream} and any previous launches of {@code hGraphExec}. Uses memory cached by {@code
        stream} to back the allocations owned by {@code hGraphExec}.
        """,

        CUgraphExec("hGraphExec", "executable graph to upload"),
        nullable..CUstream("hStream", "stream in which to upload the graph")
    ).ptsz()

    IgnoreMissing..CUresult(
        "GraphLaunch",
        """
        Launches an executable graph in a stream.

        Executes {@code hGraphExec} in {@code hStream}. Only one instance of {@code hGraphExec} may be executing at a time. Each launch is ordered behind both
        any previous work in {@code hStream} and any previous launches of {@code hGraphExec}. To execute a graph concurrently, it must be instantiated multiple
        times into multiple executable graphs.

        If any allocations created by {@code hGraphExec} remain unfreed (from a previous launch) and {@code hGraphExec} was not instantiated with
        #CUDA_GRAPH_INSTANTIATE_FLAG_AUTO_FREE_ON_LAUNCH, the launch will fail with #CUDA_ERROR_INVALID_VALUE.
        """,

        CUgraphExec("hGraphExec", "executable graph to launch"),
        nullable..CUstream("hStream", "stream in which to launch the graph")
    ).ptsz()

    IgnoreMissing..CUresult(
        "GraphExecDestroy",
        """
        Destroys an executable graph.

        Destroys the executable graph specified by {@code hGraphExec}, as well as all of its executable nodes. If the executable graph is in-flight, it will
        not be terminated, but rather freed asynchronously on completion.
        """,

        CUgraphExec("hGraphExec", "executable graph to destroy")
    )

    IgnoreMissing..CUresult(
        "GraphDestroy",
        """
        Destroys a graph.

        Destroys the graph specified by {@code hGraph}, as well as all of its nodes.
        """,

        CUgraph("hGraph", "graph to destroy")
    )

    IgnoreMissing..CUresult(
        "GraphExecUpdate",
        """
        Check whether an executable graph can be updated with a graph and perform the update if possible.

        Updates the node parameters in the instantiated graph specified by {@code hGraphExec} with the node parameters in a topologically identical graph
        specified by {@code hGraph}.

        Limitations:
        ${ul(
            """
            Kernel nodes:
            ${ul(
                "The owning context of the function cannot change.",
                "A node whose function originally did not use CUDA dynamic parallelism cannot be updated to a function which uses CDP"
            )}
            """,
            """
            Memset and memcpy nodes:
            ${ul(
                "The CUDA device(s) to which the operand(s) was allocated/mapped cannot change.",
                "The source/destination memory must be allocated from the same contexts as the original source/destination memory.",
                "Only 1D memsets can be changed."
            )}
            """,
            """
            Additional memcpy node restrictions:
            ${ul(
                "Changing either the source or destination memory type(i.e. CU_MEMORYTYPE_DEVICE, CU_MEMORYTYPE_ARRAY, etc.) is not supported."
            )}
            """,
            """
            External semaphore wait nodes and record nodes:
            ${ul(
                "Changing either the source or destination memory type(i.e. CU_MEMORYTYPE_DEVICE, CU_MEMORYTYPE_ARRAY, etc.) is not supported."
            )}
            """
        )}

        Note: The API may add further restrictions in future releases. The return code should always be checked.

        {@code cuGraphExecUpdate} sets {@code updateResult_out} to #GRAPH_EXEC_UPDATE_ERROR_TOPOLOGY_CHANGED under the following conditions:
        ${ul(
            "The count of nodes directly in {@code hGraphExec} and {@code hGraph} differ, in which case {@code hErrorNode_out} is #NULL.",
            "A node is deleted in {@code hGraph} but not not its pair from {@code hGraphExec}, in which case {@code hErrorNode_out} is #NULL.",
            """
            A node is deleted in {@code hGraphExec} but not its pair from {@code hGraph}, in which case {@code hErrorNode_out} is the pairless node from {@code
            hGraph}.
            """,
            "The dependent nodes of a pair differ, in which case {@code hErrorNode_out} is the node from {@code hGraph}."
        )}

        {@code cuGraphExecUpdate} sets {@code updateResult_out} to:
        ${ul(
            "#GRAPH_EXEC_UPDATE_ERROR if passed an invalid value.",
            "#GRAPH_EXEC_UPDATE_ERROR_TOPOLOGY_CHANGED if the graph topology changed",
            """
            #GRAPH_EXEC_UPDATE_ERROR_NODE_TYPE_CHANGED if the type of a node changed, in which case {@code hErrorNode_out} is set to the node from
            {@code hGraph}.
            """,
            """
            #GRAPH_EXEC_UPDATE_ERROR_UNSUPPORTED_FUNCTION_CHANGE if the function changed in an unsupported way(see note above), in which case
            {@code hErrorNode_out} is set to the node from {@code hGraph}
            """,
            """
            #GRAPH_EXEC_UPDATE_ERROR_PARAMETERS_CHANGED if any parameters to a node changed in a way that is not supported, in which case
            {@code hErrorNode_out} is set to the node from {@code hGraph}.
            """,
            """
            #GRAPH_EXEC_UPDATE_ERROR_NOT_SUPPORTED if something about a node is unsupported, like the node's type or configuration, in which case
            {@code hErrorNode_out} is set to the node from {@code hGraph}
            """
        )}

        If {@code updateResult_out} isn't set in one of the situations described above, the update check passes and cuGraphExecUpdate updates
        {@code hGraphExec} to match the contents of {@code hGraph}. If an error happens during the update, {@code updateResult_out} will be set to
        #GRAPH_EXEC_UPDATE_ERROR; otherwise, {@code updateResult_out} is set to #GRAPH_EXEC_UPDATE_SUCCESS.

        {@code cuGraphExecUpdate} returns #CUDA_SUCCESS when the updated was performed successfully. It returns #CUDA_ERROR_GRAPH_EXEC_UPDATE_FAILURE if the
        graph update was not performed because it included changes which violated constraints specific to instantiated graph update.
        """,

        CUgraphExec("hGraphExec", "the instantiated graph to be updated"),
        CUgraph("hGraph", "the graph containing the updated parameters"),
        Check(1)..CUgraphNode.p("hErrorNode_out", "the node which caused the permissibility check to forbid the update, if any"),
        Check(1)..CUgraphExecUpdateResult.p("updateResult_out", "whether the graph update was permitted. If was forbidden, the reason why.")
    )

    IgnoreMissing..CUresult(
        "GraphKernelNodeCopyAttributes",
        """
        Copies attributes from source node to destination node.

        Copies attributes from source node {@code src} to destination node {@code dst}. Both node must have the same context.
        """,

        CUgraphNode("dst", "destination node"),
        CUgraphNode("src", "source node. For list of attributes see {@code CUkernelNodeAttrID}.")
    )

    IgnoreMissing..CUresult(
        "GraphKernelNodeGetAttribute",
        """
        Queries node attribute.

        Queries attribute {@code attr} from node {@code hNode} and stores it in corresponding member of {@code value_out}.
        """,

        CUgraphNode("hNode", ""),
        CUkernelNodeAttrID("attr", ""),
        CUkernelNodeAttrValue.p("value_out", "")
    )

    IgnoreMissing..CUresult(
        "GraphKernelNodeSetAttribute",
        """
        Sets node attribute.

        Sets attribute {@code attr} on node {@code hNode} from corresponding attribute of {@code value}.
        """,

        CUgraphNode("hNode", ""),
        CUkernelNodeAttrID("attr", ""),
        CUkernelNodeAttrValue.const.p("value", "")
    )

    IgnoreMissing..CUresult(
        "GraphDebugDotPrint",
        """
        Write a DOT file describing graph structure.

        Using the provided {@code hGraph}, write to {@code path} a DOT formatted description of the graph. By default this includes the graph topology, node
        types, node id, kernel names and memcpy direction. {@code flags} can be specified to write more detailed information about each node type such as
        parameter values, kernel attributes, node and function handles.
        """,

        CUgraph("hGraph", "the graph to create a DOT file from"),
        charUTF8.const.p("path", "the path to write the DOT file to"),
        unsigned_int("flags", "flags from {@code CUgraphDebugDot_flags} for specifying which additional node information to write")
    )

    IgnoreMissing..CUresult(
        "UserObjectCreate",
        """
        Create a user object.

        Create a user object with the specified destructor callback and initial reference count. The initial references are owned by the caller.

        Destructor callbacks cannot make CUDA API calls and should avoid blocking behavior, as they are executed by a shared internal thread. Another thread
        may be signaled to perform such actions, if it does not block forward progress of tasks scheduled through CUDA.

        See CUDA User Objects in the CUDA C++ Programming Guide for more information on user objects.
        """,

        Check(1)..CUuserObject.p("object_out", "location to return the user object handle"),
        opaque_p("ptr", "the pointer to pass to the destroy function"),
        CUhostFn("destroy", "callback to free the user object when it is no longer in use"),
        unsigned_int(
            "initialRefcount",
            "the initial refcount to create the object with, typically 1. The initial references are owned by the calling thread."
        ),
        unsigned_int(
            "flags",
            """
            currently it is required to pass #USER_OBJECT_NO_DESTRUCTOR_SYNC, which is the only defined flag. This indicates that the destroy callback
            cannot be waited on by any CUDA API. Users requiring synchronization of the callback should signal its completion manually.
            """
        )
    )

    IgnoreMissing..CUresult(
        "UserObjectRetain",
        """
        Retain a reference to a user object.

        Retains new references to a user object. The new references are owned by the caller.

        See CUDA User Objects in the CUDA C++ Programming Guide for more information on user objects.
        """,

        CUuserObject("object", "the object to retain"),
        unsigned_int("count", "the number of references to retain, typically 1. Must be nonzero and not larger than INT_MAX.")
    )

    IgnoreMissing..CUresult(
        "UserObjectRelease",
        """
        Release a reference to a user object.

        Releases user object references owned by the caller. The object's destructor is invoked if the reference count reaches zero.

        It is undefined behavior to release references not owned by the caller, or to use a user object handle after all references are released.

        See CUDA User Objects in the CUDA C++ Programming Guide for more information on user objects.
        """,

        CUuserObject("object", "the object to release"),
        unsigned_int("count", "the number of references to release, typically 1. Must be nonzero and not larger than INT_MAX.")
    )

    IgnoreMissing..CUresult(
        "GraphRetainUserObject",
        """
        Retain a reference to a user object from a graph.

        Creates or moves user object references that will be owned by a CUDA graph.

        See CUDA User Objects in the CUDA C++ Programming Guide for more information on user objects.
        """,

        CUgraph("graph", "the graph to associate the reference with"),
        CUuserObject("object", "the user object to retain a reference for"),
        unsigned_int("count", "the number of references to add to the graph, typically 1. Must be nonzero and not larger than INT_MAX."),
        unsigned_int(
            "flags",
            """
            the optional flag #GRAPH_USER_OBJECT_MOVE transfers references from the calling thread, rather than create new references. Pass 0 to create new
            references.
            """
        )
    )

    IgnoreMissing..CUresult(
        "GraphReleaseUserObject",
        """
        Release a user object reference from a graph.

        Releases user object references owned by a graph.

        See CUDA User Objects in the CUDA C++ Programming Guide for more information on user objects.
        """,

        CUgraph("graph", "the graph that will release the reference"),
        CUuserObject("object", "the user object to release a reference for"),
        unsigned_int("count", "the number of references to release, typically 1. Must be nonzero and not larger than INT_MAX.")
    )

    IgnoreMissing..CUresult(
        "OccupancyMaxActiveBlocksPerMultiprocessor",
        """
        Returns occupancy of a function.

        Returns in {@code *numBlocks} the number of the maximum active blocks per streaming multiprocessor.
        """,

        Check(1)..int.p("numBlocks", "returned occupancy"),
        CUfunction("func", "kernel for which occupancy is calculated"),
        int("blockSize", "block size the kernel is intended to be launched with"),
        size_t("dynamicSMemSize", "per-block dynamic shared memory usage intended, in bytes")
    )

    IgnoreMissing..CUresult(
        "OccupancyMaxActiveBlocksPerMultiprocessorWithFlags",
        """
        Returns occupancy of a function.

        Returns in {@code *numBlocks} the number of the maximum active blocks per streaming multiprocessor.

        The {@code Flags} parameter controls how special cases are handled. The valid flags are:
        ${ul(
            "#OCCUPANCY_DEFAULT, which maintains the default behavior as #OccupancyMaxActiveBlocksPerMultiprocessor();",
            """
            #OCCUPANCY_DISABLE_CACHING_OVERRIDE, which suppresses the default behavior on platform where global caching affects occupancy. On such
            platforms, if caching is enabled, but per-block SM resource usage would result in zero occupancy, the occupancy calculator will calculate the
            occupancy as if caching is disabled. Setting #OCCUPANCY_DISABLE_CACHING_OVERRIDE makes the occupancy calculator to return 0 in such cases. More
            information can be found about this feature in the "Unified L1/Texture Cache" section of the Maxwell tuning guide.
            """
        )}
        """,

        Check(1)..int.p("numBlocks", "returned occupancy"),
        CUfunction("func", "kernel for which occupancy is calculated"),
        int("blockSize", "block size the kernel is intended to be launched with"),
        size_t("dynamicSMemSize", "per-block dynamic shared memory usage intended, in bytes"),
        unsigned_int("flags", "requested behavior for the occupancy calculator")
    )

    IgnoreMissing..CUresult(
        "OccupancyMaxPotentialBlockSize",
        """
        Suggest a launch configuration with reasonable occupancy.

        Returns in {@code *blockSize} a reasonable block size that can achieve the maximum occupancy (or, the maximum number of active warps with the fewest
        blocks per multiprocessor), and in {@code *minGridSize} the minimum grid size to achieve the maximum occupancy.

        If {@code blockSizeLimit} is 0, the configurator will use the maximum block size permitted by the device / function instead.

        If per-block dynamic shared memory allocation is not needed, the user should leave both {@code blockSizeToDynamicSMemSize} and {@code dynamicSMemSize}
        as 0.

        If per-block dynamic shared memory allocation is needed, then if the dynamic shared memory size is constant regardless of block size, the size should
        be passed through {@code dynamicSMemSize}, and {@code blockSizeToDynamicSMemSize} should be #NULL.

        Otherwise, if the per-block dynamic shared memory size varies with different block sizes, the user needs to provide a unary function through {@code
        blockSizeToDynamicSMemSize} that computes the dynamic shared memory needed by {@code func} for any given block size. {@code dynamicSMemSize} is
        ignored. An example signature is:
        ${codeBlock("""
// Take block size, returns dynamic shared memory needed
size_t blockToSmem(int blockSize);""")}
        """,

        Check(1)..int.p("minGridSize", "returned minimum grid size needed to achieve the maximum occupancy"),
        Check(1)..int.p("blockSize", "returned maximum block size that can achieve the maximum occupancy"),
        CUfunction("func", "kernel for which launch configuration is calculated"),
        nullable..CUoccupancyB2DSize(
            "blockSizeToDynamicSMemSize",
            "a function that calculates how much per-block dynamic shared memory {@code func} uses based on the block size"
        ),
        size_t("dynamicSMemSize", "dynamic shared memory usage intended, in bytes"),
        int("blockSizeLimit", "the maximum block size {@code func} is designed to handle")
    )

    IgnoreMissing..CUresult(
        "OccupancyMaxPotentialBlockSizeWithFlags",
        """
        Suggest a launch configuration with reasonable occupancy.

        An extended version of #OccupancyMaxPotentialBlockSize(). In addition to arguments passed to #OccupancyMaxPotentialBlockSize(),
        #OccupancyMaxPotentialBlockSizeWithFlags() also takes a {@code Flags} parameter.

        The {@code Flags} parameter controls how special cases are handled. The valid flags are:
        ${ul(
            "#OCCUPANCY_DEFAULT, which maintains the default behavior as #OccupancyMaxPotentialBlockSize();",
            """
            #OCCUPANCY_DISABLE_CACHING_OVERRIDE, which suppresses the default behavior on platform where global caching affects occupancy. On such
            platforms, the launch configurations that produces maximal occupancy might not support global caching. Setting
            #OCCUPANCY_DISABLE_CACHING_OVERRIDE guarantees that the the produced launch configuration is global caching compatible at a potential cost of
            occupancy. More information can be found about this feature in the "Unified L1/Texture Cache" section of the Maxwell tuning guide.
            """
        )}
        """,

        Check(1)..int.p("minGridSize", "returned minimum grid size needed to achieve the maximum occupancy"),
        Check(1)..int.p("blockSize", "returned maximum block size that can achieve the maximum occupancy"),
        CUfunction("func", "kernel for which launch configuration is calculated"),
        nullable..CUoccupancyB2DSize(
            "blockSizeToDynamicSMemSize",
            "a function that calculates how much per-block dynamic shared memory {@code func} uses based on the block size"
        ),
        size_t("dynamicSMemSize", "dynamic shared memory usage intended, in bytes"),
        int("blockSizeLimit", "the maximum block size {@code func} is designed to handle"),
        unsigned_int("flags", "options")
    )

    IgnoreMissing..CUresult(
        "OccupancyAvailableDynamicSMemPerBlock",
        """
        Returns dynamic shared memory available per block when launching {@code numBlocks} blocks on SM.

        Returns in {@code *dynamicSmemSize} the maximum size of dynamic shared memory to allow {@code numBlocks} blocks per SM.
        """,

        Check(1)..size_t.p("dynamicSmemSize", "returned maximum dynamic shared memory"),
        CUfunction("func", "kernel function for which occupancy is calculated"),
        int("numBlocks", "number of blocks to fit on SM"),
        int("blockSize", "size of the blocks")
    )

    CUresult(
        "TexRefSetArray",
        """
        Binds an array as a texture reference. (Deprecated) 

        Binds the CUDA array {@code hArray} to the texture reference {@code hTexRef}. Any previous address or CUDA array state associated with the texture
        reference is superseded by this function. {@code Flags} must be set to #TRSA_OVERRIDE_FORMAT. Any CUDA array previously bound to {@code hTexRef} is
        unbound.
        """,

        CUtexref("hTexRef", "texture reference to bind"),
        CUarray("hArray", "array to bind"),
        unsigned_int("Flags", "options (must be #TRSA_OVERRIDE_FORMAT)")
    )

    CUresult(
        "TexRefSetMipmappedArray",
        """
        Binds a mipmapped array to a texture reference. (Deprecated) 

        Binds the CUDA mipmapped array {@code hMipmappedArray} to the texture reference {@code hTexRef}. Any previous address or CUDA array state associated
        with the texture reference is superseded by this function. {@code Flags} must be set to #TRSA_OVERRIDE_FORMAT. Any CUDA array previously bound to
        {@code hTexRef} is unbound.
        """,

        CUtexref("hTexRef", "texture reference to bind"),
        CUmipmappedArray("hMipmappedArray", "mipmapped array to bind"),
        unsigned_int("Flags", "options (must be #TRSA_OVERRIDE_FORMAT)")
    )

    CUresult(
        "TexRefSetAddress",
        """
        Binds an address as a texture reference. (Deprecated) 

        Binds a linear address range to the texture reference {@code hTexRef}. Any previous address or CUDA array state associated with the texture reference
        is superseded by this function. Any memory previously bound to {@code hTexRef} is unbound.

        Since the hardware enforces an alignment requirement on texture base addresses, #TexRefSetAddress() passes back a byte offset in {@code *ByteOffset}
        that must be applied to texture fetches in order to read from the desired memory. This offset must be divided by the texel size and passed to kernels
        that read from the texture so they can be applied to the {@code tex1Dfetch()} function.

        If the device memory pointer was returned from #MemAlloc(), the offset is guaranteed to be 0 and #NULL may be passed as the {@code ByteOffset}
        parameter.

        The total number of elements (or texels) in the linear address range cannot exceed #DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_LINEAR_WIDTH. The number of
        elements is computed as ({@code bytes} / {@code bytesPerElement}), where {@code bytesPerElement} is determined from the data format and number of
        components set using #TexRefSetFormat().
        """,

        Check(1)..size_t.p("ByteOffset", "returned byte offset"),
        CUtexref("hTexRef", "texture reference to bind"),
        CUdeviceptr("dptr", "device pointer to bind"),
        size_t("bytes", "size of memory to bind in bytes")
    ).versioned()

    CUresult(
        "TexRefSetAddress2D",
        """
        Binds an address as a 2D texture reference. (Deprecated)

        Binds a linear address range to the texture reference {@code hTexRef}. Any previous address or CUDA array state associated with the texture reference
        is superseded by this function. Any memory previously bound to {@code hTexRef} is unbound.

        Using a {@code tex2D()} function inside a kernel requires a call to either #TexRefSetArray() to bind the corresponding texture reference to an array,
        or #TexRefSetAddress2D() to bind the texture reference to linear memory.

        Function calls to #TexRefSetFormat() cannot follow calls to #TexRefSetAddress2D() for the same texture reference.

        It is required that {@code dptr} be aligned to the appropriate hardware-specific texture alignment. You can query this value using the device attribute
        #DEVICE_ATTRIBUTE_TEXTURE_ALIGNMENT. If an unaligned {@code dptr} is supplied, #CUDA_ERROR_INVALID_VALUE is returned.

        {@code Pitch} has to be aligned to the hardware-specific texture pitch alignment. This value can be queried using the device attribute
        #DEVICE_ATTRIBUTE_TEXTURE_PITCH_ALIGNMENT. If an unaligned {@code Pitch} is supplied, #CUDA_ERROR_INVALID_VALUE is returned.

        {@code Width} and {@code Height}, which are specified in elements (or texels), cannot exceed #DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LINEAR_WIDTH and
        #DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LINEAR_HEIGHT respectively. {@code Pitch}, which is specified in bytes, cannot exceed
        #DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LINEAR_PITCH.
        """,

        CUtexref("hTexRef", "texture reference to bind"),
        CUDA_ARRAY_DESCRIPTOR.const.p("desc", "descriptor of CUDA array"),
        CUdeviceptr("dptr", "device pointer to bind"),
        size_t("Pitch", "line pitch in bytes")
    ).versioned(3)

    CUresult(
        "TexRefSetFormat",
        """
        Sets the format for a texture reference. (Deprecated) 

        Specifies the format of the data to be read by the texture reference {@code hTexRef}. {@code fmt} and {@code NumPackedComponents} are exactly analogous
        to the {@code Format} and {@code NumChannels} members of the ##CUDA_ARRAY_DESCRIPTOR structure: They specify the format of each component and the
        number of components per array element.
        """,

        CUtexref("hTexRef", "texture reference"),
        CUarray_format("fmt", "format to set"),
        int("NumPackedComponents", "number of components per array element")
    )

    CUresult(
        "TexRefSetAddressMode",
        """
        Sets the addressing mode for a texture reference. (Deprecated) 

        Specifies the addressing mode {@code am} for the given dimension {@code dim} of the texture reference {@code hTexRef}. If {@code dim} is zero, the
        addressing mode is applied to the first parameter of the functions used to fetch from the texture; if {@code dim} is 1, the second, and so on.

        Note that this call has no effect if {@code hTexRef} is bound to linear memory. Also, if the flag, #TRSF_NORMALIZED_COORDINATES, is not set, the
        only supported address mode is #TR_ADDRESS_MODE_CLAMP.
        """,

        CUtexref("hTexRef", "texture reference"),
        int("dim", "dimension"),
        CUaddress_mode("am", "addressing mode to set")
    )

    CUresult(
        "TexRefSetFilterMode",
        """
        Sets the filtering mode for a texture reference. (Deprecated) 

        Specifies the filtering mode {@code fm} to be used when reading memory through the texture reference {@code hTexRef}.

        Note that this call has no effect if {@code hTexRef} is bound to linear memory.
        """,

        CUtexref("hTexRef", "texture reference"),
        CUfilter_mode("fm", "filtering mode to set")
    )

    CUresult(
        "TexRefSetMipmapFilterMode",
        """
        Sets the mipmap filtering mode for a texture reference (Deprecated) 

        Specifies the mipmap filtering mode {@code fm} to be used when reading memory through the texture reference {@code hTexRef}.

        Note that this call has no effect if {@code hTexRef} is not bound to a mipmapped array.
        """,

        CUtexref("hTexRef", "texture reference"),
        CUfilter_mode("fm", "filtering mode to set")
    )

    CUresult(
        "TexRefSetMipmapLevelBias",
        """
        Sets the mipmap level bias for a texture reference. (Deprecated) 

        Specifies the mipmap level bias {@code bias} to be added to the specified mipmap level when reading memory through the texture reference
        {@code hTexRef}.

        Note that this call has no effect if {@code hTexRef} is not bound to a mipmapped array.
        """,

        CUtexref("hTexRef", "texture reference"),
        float("bias", "mipmap level bias")
    )

    CUresult(
        "TexRefSetMipmapLevelClamp",
        """
        Sets the mipmap min/max mipmap level clamps for a texture reference. (Deprecated) 

        Specifies the min/max mipmap level clamps, {@code minMipmapLevelClamp} and {@code maxMipmapLevelClamp} respectively, to be used when reading memory
        through the texture reference {@code hTexRef}.

        Note that this call has no effect if {@code hTexRef} is not bound to a mipmapped array.
        """,

        CUtexref("hTexRef", "texture reference"),
        float("minMipmapLevelClamp", "mipmap min level clamp"),
        float("maxMipmapLevelClamp", "mipmap max level clamp")
    )

    CUresult(
        "TexRefSetMaxAnisotropy",
        """
        Sets the maximum anisotropy for a texture reference. (Deprecated) 

        Specifies the maximum anisotropy {@code maxAniso} to be used when reading memory through the texture reference {@code hTexRef}.

        Note that this call has no effect if {@code hTexRef} is bound to linear memory.
        """,

        CUtexref("hTexRef", "texture reference"),
        unsigned_int("maxAniso", "maximum anisotropy")
    )

    CUresult(
        "TexRefSetBorderColor",
        """
        Sets the border color for a texture reference. (Deprecated) 

        Specifies the value of the RGBA color via the {@code pBorderColor} to the texture reference {@code hTexRef}. The color value supports only float type
        and holds color components in the following sequence: {@code pBorderColor[0]} holds 'R' component {@code pBorderColor[1]} holds 'G' component
        {@code pBorderColor[2]} holds 'B' component {@code pBorderColor[3]} holds 'A' component.

        Note that the color values can be set only when the Address mode is set to #TR_ADDRESS_MODE_BORDER using #TexRefSetAddressMode(). Applications using
        integer border color values have to "reinterpret_cast" their values to float.
        """,

        CUtexref("hTexRef", "texture reference"),
        Check(4)..float.p("pBorderColor", "RGBA color")
    )

    CUresult(
        "TexRefSetFlags",
        """
        Sets the flags for a texture reference. (Deprecated) 

        Specifies optional flags via {@code Flags} to specify the behavior of data returned through the texture reference {@code hTexRef}. The valid flags are:
        ${ul(
            """
            #TRSF_READ_AS_INTEGER, which suppresses the default behavior of having the texture promote integer data to floating point data in the range [0,
            1]. Note that texture with 32-bit integer format would not be promoted, regardless of whether or not this flag is specified;
            """,
            """
            #TRSF_NORMALIZED_COORDINATES, which suppresses the default behavior of having the texture coordinates range from [0, Dim) where Dim is the
            width or height of the CUDA array. Instead, the texture coordinates [0, 1.0) reference the entire breadth of the array dimension;
            """,
            """
            #TRSF_DISABLE_TRILINEAR_OPTIMIZATION, which disables any trilinear filtering optimizations. Trilinear optimizations improve texture filtering
            performance by allowing bilinear filtering on textures in scenarios where it can closely approximate the expected results.
            """
        )}
        """,

        CUtexref("hTexRef", "texture reference"),
        unsigned_int("Flags", "optional flags to set")
    )

    CUresult(
        "TexRefGetAddress",
        """
        Gets the address associated with a texture reference. (Deprecated) 

        Returns in {@code *pdptr} the base address bound to the texture reference {@code hTexRef}, or returns #CUDA_ERROR_INVALID_VALUE if the texture
        reference is not bound to any device memory range.
        """,

        Check(1)..CUdeviceptr.p("pdptr", "returned device address"),
        CUtexref("hTexRef", "texture reference")
    ).versioned()

    CUresult(
        "TexRefGetArray",
        """
        Gets the array bound to a texture reference. (Deprecated) 

        Returns in {@code *phArray} the CUDA array bound to the texture reference {@code hTexRef}, or returns #CUDA_ERROR_INVALID_VALUE if the texture
        reference is not bound to any CUDA array.
        """,

        Check(1)..CUarray.p("phArray", "returned array"),
        CUtexref("hTexRef", "texture reference")
    )

    CUresult(
        "TexRefGetMipmappedArray",
        """
        Gets the mipmapped array bound to a texture reference. (Deprecated) 

        Returns in {@code *phMipmappedArray} the CUDA mipmapped array bound to the texture reference {@code hTexRef}, or returns #CUDA_ERROR_INVALID_VALUE if
        the texture reference is not bound to any CUDA mipmapped array.
        """,

        Check(1)..CUmipmappedArray.p("phMipmappedArray", "returned mipmapped array"),
        CUtexref("hTexRef", "texture reference")
    )

    CUresult(
        "TexRefGetAddressMode",
        """
        Gets the addressing mode used by a texture reference. (Deprecated) 

        Returns in {@code *pam} the addressing mode corresponding to the dimension {@code dim} of the texture reference {@code hTexRef}. Currently, the only
        valid value for {@code dim} are 0 and 1.
        """,

        Check(1)..CUaddress_mode.p("pam", "returned addressing mode"),
        CUtexref("hTexRef", "texture reference"),
        int("dim", "dimension")
    )

    CUresult(
        "TexRefGetFilterMode",
        """
        Gets the filter-mode used by a texture reference. (Deprecated) 

        Returns in {@code *pfm} the filtering mode of the texture reference {@code hTexRef}.
        """,

        Check(1)..CUfilter_mode.p("pfm", "returned filtering mode"),
        CUtexref("hTexRef", "texture reference")
    )

    CUresult(
        "TexRefGetFormat",
        """
        Gets the format used by a texture reference. (Deprecated) 

        Returns in {@code *pFormat} and {@code *pNumChannels} the format and number of components of the CUDA array bound to the texture reference
        {@code hTexRef}. If {@code pFormat} or {@code pNumChannels} is #NULL, it will be ignored.
        """,

        Check(1)..CUarray_format.p("pFormat", "returned format"),
        Check(1)..nullable..int.p("pNumChannels", "returned number of components"),
        CUtexref("hTexRef", "texture reference")
    )

    CUresult(
        "TexRefGetMipmapFilterMode",
        """
        Gets the mipmap filtering mode for a texture reference. (Deprecated) 

        Returns the mipmap filtering mode in {@code pfm} that's used when reading memory through the texture reference {@code hTexRef}.
        """,

        Check(1)..CUfilter_mode.p("pfm", "returned mipmap filtering mode"),
        CUtexref("hTexRef", "texture reference")
    )

    CUresult(
        "TexRefGetMipmapLevelBias",
        """
        Gets the mipmap level bias for a texture reference. (Deprecated) 

        Returns the mipmap level bias in {@code pBias} that's added to the specified mipmap level when reading memory through the texture reference {@code
        hTexRef}.
        """,

        Check(1)..float.p("pbias", "returned mipmap level bias"),
        CUtexref("hTexRef", "texture reference")
    )

    CUresult(
        "TexRefGetMipmapLevelClamp",
        """
        Gets the min/max mipmap level clamps for a texture reference. (Deprecated) 

        Returns the min/max mipmap level clamps in {@code pminMipmapLevelClamp} and {@code pmaxMipmapLevelClamp} that's used when reading memory through the
        texture reference {@code hTexRef}.
        """,

        Check(1)..float.p("pminMipmapLevelClamp", "returned mipmap min level clamp"),
        Check(1)..float.p("pmaxMipmapLevelClamp", "returned mipmap max level clamp"),
        CUtexref("hTexRef", "texture reference")
    )

    CUresult(
        "TexRefGetMaxAnisotropy",
        """
        Gets the maximum anisotropy for a texture reference. (Deprecated) 

        Returns the maximum anisotropy in {@code pmaxAniso} that's used when reading memory through the texture reference {@code hTexRef}.
        """,

        Check(1)..int.p("pmaxAniso", "returned maximum anisotropy"),
        CUtexref("hTexRef", "texture reference")
    )

    CUresult(
        "TexRefGetBorderColor",
        """
        Gets the border color used by a texture reference. (Deprecated) 

        Returns in {@code pBorderColor}, values of the RGBA color used by the texture reference {@code hTexRef}. The color value is of type float and holds
        color components in the following sequence: pBorderColor[0] holds 'R' component pBorderColor[1] holds 'G' component pBorderColor[2] holds 'B' component
        pBorderColor[3] holds 'A' component
        """,

        Check(4)..float.p("pBorderColor", "returned Type and Value of RGBA color"),
        CUtexref("hTexRef", "texture reference")
    )

    CUresult(
        "TexRefGetFlags",
        """
        Gets the flags used by a texture reference. (Deprecated) 

        Returns in {@code *pFlags} the flags of the texture reference {@code hTexRef}.
        """,

        Check(1)..unsigned_int.p("pFlags", "returned flags"),
        CUtexref("hTexRef", "texture reference")
    )

    CUresult(
        "TexRefCreate",
        """
        Creates a texture reference. (Deprecated) 

        Creates a texture reference and returns its handle in {@code *pTexRef}. Once created, the application must call #TexRefSetArray() or
        #TexRefSetAddress() to associate the reference with allocated memory. Other texture reference functions are used to specify the format and
        interpretation (addressing, filtering, etc.) to be used when the memory is read through this texture reference.
        """,

        Check(1)..CUtexref.p("pTexRef", "returned texture reference")
    )

    CUresult(
        "TexRefDestroy",
        """
        Destroys a texture reference. (Deprecated) 

        Destroys the texture reference specified by {@code hTexRef}.
        """,

        CUtexref("hTexRef", "texture reference to destroy")
    )

    CUresult(
        "SurfRefSetArray",
        """
        Sets the CUDA array for a surface reference.Deprecated: 

        Sets the CUDA array {@code hArray} to be read and written by the surface reference {@code hSurfRef}. Any previous CUDA array state associated with the
        surface reference is superseded by this function. {@code Flags} must be set to 0. The #CUDA_ARRAY3D_SURFACE_LDST flag must have been set for the CUDA
        array. Any CUDA array previously bound to {@code hSurfRef} is unbound.
        """,

        CUsurfref("hSurfRef", "surface reference handle"),
        CUarray("hArray", "CUDA array handle"),
        unsigned_int("Flags", "set to 0")
    )

    CUresult(
        "SurfRefGetArray",
        """
        Passes back the CUDA array bound to a surface reference. (Deprecated) 

        Returns in {@code *phArray} the CUDA array bound to the surface reference {@code hSurfRef}, or returns #CUDA_ERROR_INVALID_VALUE if the surface
        reference is not bound to any CUDA array.
        """,

        Check(1)..CUarray.p("phArray", "surface reference handle"),
        CUsurfref("hSurfRef", "surface reference handle")
    )

    IgnoreMissing..CUresult(
        "TexObjectCreate",
        """
        Creates a texture object.

        Creates a texture object and returns it in {@code pTexObject}. {@code pResDesc} describes the data to texture from. {@code pTexDesc} describes how the
        data should be sampled. {@code pResViewDesc} is an optional argument that specifies an alternate format for the data described by {@code pResDesc}, and
        also describes the subresource region to restrict access to when texturing. {@code pResViewDesc} can only be specified if the type of resource is a
        CUDA array or a CUDA mipmapped array.

        Texture objects are only supported on devices of compute capability 3.0 or higher. Additionally, a texture object is an opaque value, and, as such,
        should only be accessed through CUDA API calls.

        ${ul(
            """
            If {@code CUDA_RESOURCE_DESC::resType} is set to #RESOURCE_TYPE_ARRAY, {@code CUDA_RESOURCE_DESC::res::array::hArray} must be set to a valid CUDA
            array handle.
            """,
            """
            If {@code CUDA_RESOURCE_DESC::resType} is set to #RESOURCE_TYPE_MIPMAPPED_ARRAY, {@code CUDA_RESOURCE_DESC::res::mipmap::hMipmappedArray} must be
            set to a valid CUDA mipmapped array handle.
            """,
            """
            If {@code CUDA_RESOURCE_DESC::resType} is set to #RESOURCE_TYPE_LINEAR, {@code CUDA_RESOURCE_DESC::res::linear::devPtr} must be set to a valid
            device pointer, that is aligned to #DEVICE_ATTRIBUTE_TEXTURE_ALIGNMENT. {@code CUDA_RESOURCE_DESC::res::linear::format} and
            {@code CUDA_RESOURCE_DESC::res::linear::numChannels} describe the format of each component and the number of components per array element.
            {@code CUDA_RESOURCE_DESC::res::linear::sizeInBytes} specifies the size of the array in bytes. The total number of elements in the linear address
            range cannot exceed #DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_LINEAR_WIDTH. The number of elements is computed as
            {@code (sizeInBytes / (sizeof(format) * numChannels)).}
            """,
            """
            If {@code CUDA_RESOURCE_DESC::resType} is set to #RESOURCE_TYPE_PITCH2D, {@code CUDA_RESOURCE_DESC::res::pitch2D::devPtr} must be set to a valid
            device pointer, that is aligned to #DEVICE_ATTRIBUTE_TEXTURE_ALIGNMENT. {@code CUDA_RESOURCE_DESC::res::pitch2D::format} and
            {@code CUDA_RESOURCE_DESC::res::pitch2D::numChannels} describe the format of each component and the number of components per array element.
            {@code CUDA_RESOURCE_DESC::res::pitch2D::width} and {@code CUDA_RESOURCE_DESC::res::pitch2D::height} specify the width and height of the array in
            elements, and cannot exceed #DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LINEAR_WIDTH and #DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LINEAR_HEIGHT respectively.
            {@code CUDA_RESOURCE_DESC::res::pitch2D::pitchInBytes} specifies the pitch between two rows in bytes and has to be aligned to
            #DEVICE_ATTRIBUTE_TEXTURE_PITCH_ALIGNMENT. Pitch cannot exceed #DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LINEAR_PITCH.
            """,
            "{@code flags} must be set to zero.",
        )}

        ${ul(
            """
            {@code CUDA_TEXTURE_DESC::addressMode} specifies the addressing mode for each dimension of the texture data. This is ignored if
            {@code CUDA_RESOURCE_DESC::resType} is #RESOURCE_TYPE_LINEAR. Also, if the flag, #TRSF_NORMALIZED_COORDINATES is not set, the only supported
            address mode is #TR_ADDRESS_MODE_CLAMP.
            """,
            """
            {@code CUDA_TEXTURE_DESC::filterMode} specifies the filtering mode to be used when fetching from the texture. This is ignored if
            {@code CUDA_RESOURCE_DESC::resType} is #RESOURCE_TYPE_LINEAR.
            """,
            """
            {@code CUDA_TEXTURE_DESC::flags} can be any combination of the following:
            ${ul(
                """
                #TRSF_READ_AS_INTEGER, which suppresses the default behavior of having the texture promote integer data to floating point data in the range [0,
                1]. Note that texture with 32-bit integer format would not be promoted, regardless of whether or not this flag is specified.
                """,
                """
                #TRSF_NORMALIZED_COORDINATES, which suppresses the default behavior of having the texture coordinates range from [0, Dim) where Dim is the
                width or height of the CUDA array. Instead, the texture coordinates [0, 1.0) reference the entire breadth of the array dimension; Note that for
                CUDA mipmapped arrays, this flag has to be set.
                """,
                """
                #TRSF_DISABLE_TRILINEAR_OPTIMIZATION, which disables any trilinear filtering optimizations. Trilinear optimizations improve texture filtering
                performance by allowing bilinear filtering on textures in scenarios where it can closely approximate the expected results.
                """
            )}
            """,
            """
            {@code CUDA_TEXTURE_DESC::maxAnisotropy} specifies the maximum anisotropy ratio to be used when doing anisotropic filtering. This value will be
            clamped to the range [1,16].
            """,
            "{@code CUDA_TEXTURE_DESC::mipmapFilterMode} specifies the filter mode when the calculated mipmap level lies between two defined mipmap levels.",
            "{@code CUDA_TEXTURE_DESC::mipmapLevelBias} specifies the offset to be applied to the calculated mipmap level.",
            "{@code CUDA_TEXTURE_DESC::minMipmapLevelClamp} specifies the lower end of the mipmap level range to clamp access to.",
            "{@code CUDA_TEXTURE_DESC::maxMipmapLevelClamp} specifies the upper end of the mipmap level range to clamp access to."
        )}

        ${ul(
            """
            {@code CUDA_RESOURCE_VIEW_DESC::format} specifies how the data contained in the CUDA array or CUDA mipmapped array should be interpreted. Note that
            this can incur a change in size of the texture data. If the resource view format is a block compressed format, then the underlying CUDA array or
            CUDA mipmapped array has to have a base of format #AD_FORMAT_UNSIGNED_INT32. with 2 or 4 channels, depending on the block compressed format. For
            ex., BC1 and BC4 require the underlying CUDA array to have a format of #AD_FORMAT_UNSIGNED_INT32 with 2 channels. The other BC formats require
            the underlying resource to have the same base format but with 4 channels.
            """,
            """
            {@code CUDA_RESOURCE_VIEW_DESC::width} specifies the new width of the texture data. If the resource view format is a block compressed format, this
            value has to be 4 times the original width of the resource. For non block compressed formats, this value has to be equal to that of the original
            resource.
            """,
            """
            {@code CUDA_RESOURCE_VIEW_DESC::height} specifies the new height of the texture data. If the resource view format is a block compressed format,
            this value has to be 4 times the original height of the resource. For non block compressed formats, this value has to be equal to that of the
            original resource.
            """,
            "{@code CUDA_RESOURCE_VIEW_DESC::depth} specifies the new depth of the texture data. This value has to be equal to that of the original resource.",
            """
            {@code CUDA_RESOURCE_VIEW_DESC::firstMipmapLevel} specifies the most detailed mipmap level. This will be the new mipmap level zero. For
            non-mipmapped resources, this value has to be zero. {@code CUDA_TEXTURE_DESC::minMipmapLevelClamp} and
            {@code CUDA_TEXTURE_DESC::maxMipmapLevelClamp} will be relative to this value. For ex., if the {@code firstMipmapLevel} is set to 2, and a
            {@code minMipmapLevelClamp} of 1.2 is specified, then the actual minimum mipmap level clamp will be 3.2.
            """,
            """
            {@code CUDA_RESOURCE_VIEW_DESC::lastMipmapLevel} specifies the least detailed mipmap level. For non-mipmapped resources, this value has to be zero.
            """,
            """
            {@code CUDA_RESOURCE_VIEW_DESC::firstLayer} specifies the first layer index for layered textures. This will be the new layer zero. For non-layered
            resources, this value has to be zero.
            """,
            """
            {@code CUDA_RESOURCE_VIEW_DESC::lastLayer} specifies the last layer index for layered textures. For non-layered resources, this value has to be
            zero.
            """
        )}
        """,

        Check(1)..CUtexObject.p("pTexObject", "texture object to create"),
        CUDA_RESOURCE_DESC.const.p("pResDesc", "resource descriptor"),
        CUDA_TEXTURE_DESC.const.p("pTexDesc", "texture descriptor"),
        CUDA_RESOURCE_VIEW_DESC.const.p("pResViewDesc", "resource view descriptor")
    )

    IgnoreMissing..CUresult(
        "TexObjectDestroy",
        """
        Destroys a texture object.

        Destroys the texture object specified by {@code texObject}.
        """,

        CUtexObject("texObject", "texture object to destroy")
    )

    IgnoreMissing..CUresult(
        "TexObjectGetResourceDesc",
        """
        Returns a texture object's resource descriptor.

        Returns the resource descriptor for the texture object specified by {@code texObject}.
        """,

        CUDA_RESOURCE_DESC.p("pResDesc", "resource descriptor"),
        CUtexObject("texObject", "texture object")
    )

    IgnoreMissing..CUresult(
        "TexObjectGetTextureDesc",
        """
        Returns a texture object's texture descriptor.

        Returns the texture descriptor for the texture object specified by {@code texObject}.
        """,

        CUDA_TEXTURE_DESC.p("pTexDesc", "texture descriptor"),
        CUtexObject("texObject", "texture object")
    )

    IgnoreMissing..CUresult(
        "TexObjectGetResourceViewDesc",
        """
        Returns a texture object's resource view descriptor.

        Returns the resource view descriptor for the texture object specified by {@code texObject}. If no resource view was set for {@code texObject}, the
        #CUDA_ERROR_INVALID_VALUE is returned.
        """,

        CUDA_RESOURCE_VIEW_DESC.p("pResViewDesc", "resource view descriptor"),
        CUtexObject("texObject", "texture object")
    )

    IgnoreMissing..CUresult(
        "SurfObjectCreate",
        """
        Creates a surface object.

        Creates a surface object and returns it in {@code pSurfObject}. {@code pResDesc} describes the data to perform surface load/stores on.
        {@code CUDA_RESOURCE_DESC::resType} must be #RESOURCE_TYPE_ARRAY and {@code CUDA_RESOURCE_DESC::res::array::hArray} must be set to a valid CUDA array
        handle. {@code CUDA_RESOURCE_DESC::flags} must be set to zero.

        Surface objects are only supported on devices of compute capability 3.0 or higher. Additionally, a surface object is an opaque value, and, as such,
        should only be accessed through CUDA API calls.
        """,

        Check(1)..CUsurfObject.p("pSurfObject", "surface object to create"),
        CUDA_RESOURCE_DESC.const.p("pResDesc", "resource descriptor")
    )

    IgnoreMissing..CUresult(
        "SurfObjectDestroy",
        """
        Destroys a surface object.

        Destroys the surface object specified by {@code surfObject}.
        """,

        CUsurfObject("surfObject", "surface object to destroy")
    )

    IgnoreMissing..CUresult(
        "SurfObjectGetResourceDesc",
        """
        Returns a surface object's resource descriptor.

        Returns the resource descriptor for the surface object specified by {@code surfObject}.
        """,

        CUDA_RESOURCE_DESC.p("pResDesc", "resource descriptor"),
        CUsurfObject("surfObject", "surface object")
    )

    IgnoreMissing..CUresult(
        "DeviceCanAccessPeer",
        """
        Queries if a device may directly access a peer device's memory.

        Returns in {@code *canAccessPeer} a value of 1 if contexts on {@code dev} are capable of directly accessing memory from contexts on {@code peerDev} and
        0 otherwise. If direct access of {@code peerDev} from {@code dev} is possible, then access may be enabled on two specific contexts by calling
        #CtxEnablePeerAccess().
        """,

        Check(1)..int.p("canAccessPeer", "returned access capability"),
        CUdevice("dev", "device from which allocations on {@code peerDev} are to be directly accessed"),
        CUdevice("peerDev", "device on which the allocations to be directly accessed by {@code dev} reside")
    )

    IgnoreMissing..CUresult(
        "CtxEnablePeerAccess",
        """
        Enables direct access to memory allocations in a peer context.

        If both the current context and {@code peerContext} are on devices which support unified addressing (as may be queried using
        #DEVICE_ATTRIBUTE_UNIFIED_ADDRESSING) and same major compute capability, then on success all allocations from {@code peerContext} will immediately
        be accessible by the current context. See ref for additional details.

        Note that access granted by this call is unidirectional and that in order to access memory from the current context in {@code peerContext}, a separate
        symmetric call to #CtxEnablePeerAccess() is required.

        Note that there are both device-wide and system-wide limitations per system configuration, as noted in the CUDA Programming Guide under the section
        "Peer-to-Peer Memory Access".

        Returns #CUDA_ERROR_PEER_ACCESS_UNSUPPORTED if #DeviceCanAccessPeer() indicates that the {@code CUdevice} of the current context cannot directly access
        memory from the {@code CUdevice} of {@code peerContext}.

        Returns #CUDA_ERROR_PEER_ACCESS_ALREADY_ENABLED if direct access of {@code peerContext} from the current context has already been enabled.

        Returns #CUDA_ERROR_TOO_MANY_PEERS if direct peer access is not possible because hardware resources required for peer access have been exhausted.

        Returns #CUDA_ERROR_INVALID_CONTEXT if there is no current context, {@code peerContext} is not a valid context, or if the current context is {@code
        peerContext}.

        Returns #CUDA_ERROR_INVALID_VALUE if {@code Flags} is not 0.
        """,

        CUcontext("peerContext", "peer context to enable direct access to from the current context"),
        unsigned_int("Flags", "reserved for future use and must be set to 0")
    )

    IgnoreMissing..CUresult(
        "CtxDisablePeerAccess",
        """
        Disables direct access to memory allocations in a peer context and unregisters any registered allocations.

        Returns #CUDA_ERROR_PEER_ACCESS_NOT_ENABLED if direct peer access has not yet been enabled from {@code peerContext} to the current context.

        Returns #CUDA_ERROR_INVALID_CONTEXT if there is no current context, or if {@code peerContext} is not a valid context.
        """,

        CUcontext("peerContext", "peer context to disable direct access to")
    )

    IgnoreMissing..CUresult(
        "DeviceGetP2PAttribute",
        """
        Queries attributes of the link between two devices.

        Returns in {@code *value} the value of the requested attribute {@code attrib} of the link between {@code srcDevice} and {@code dstDevice}. The
        supported attributes are:
        ${ul(
            "#DEVICE_P2P_ATTRIBUTE_PERFORMANCE_RANK: A relative value indicating the performance of the link between two devices.",
            "#DEVICE_P2P_ATTRIBUTE_ACCESS_SUPPORTED P2P: 1 if P2P Access is enable.",
            "#DEVICE_P2P_ATTRIBUTE_NATIVE_ATOMIC_SUPPORTED: 1 if Atomic operations over the link are supported.",
            "#DEVICE_P2P_ATTRIBUTE_CUDA_ARRAY_ACCESS_SUPPORTED: 1 if cudaArray can be accessed over the link."
        )}

        Returns #CUDA_ERROR_INVALID_DEVICE if {@code srcDevice} or {@code dstDevice} are not valid or if they represent the same device.

        Returns #CUDA_ERROR_INVALID_VALUE if {@code attrib} is not valid or if {@code value} is a null pointer.
        """,

        Check(1)..int.p("value", "returned value of the requested attribute"),
        CUdevice_P2PAttribute("attrib", "the requested attribute of the link between {@code srcDevice} and {@code dstDevice}"),
        CUdevice("srcDevice", "the source device of the target link"),
        CUdevice("dstDevice", "the destination device of the target link")
    )

    CUresult(
        "GraphicsUnregisterResource",
        """
        Unregisters a graphics resource for access by CUDA.

        Unregisters the graphics resource {@code resource} so it is not accessible by CUDA unless registered again.

        If {@code resource} is invalid then #CUDA_ERROR_INVALID_HANDLE is returned.
        """,

        CUgraphicsResource("resource", "resource to unregister")
    )

    CUresult(
        "GraphicsSubResourceGetMappedArray",
        """
        Get an array through which to access a subresource of a mapped graphics resource.

        Returns in {@code *pArray} an array through which the subresource of the mapped graphics resource {@code resource} which corresponds to array index
        {@code arrayIndex} and mipmap level {@code mipLevel} may be accessed. The value set in {@code *pArray} may change every time that {@code resource} is
        mapped.

        If {@code resource} is not a texture then it cannot be accessed via an array and #CUDA_ERROR_NOT_MAPPED_AS_ARRAY is returned. If {@code arrayIndex} is
        not a valid array index for {@code resource} then #CUDA_ERROR_INVALID_VALUE is returned. If {@code mipLevel} is not a valid mipmap level for {@code
        resource} then #CUDA_ERROR_INVALID_VALUE is returned. If {@code resource} is not mapped then #CUDA_ERROR_NOT_MAPPED is returned.
        """,

        Check(1)..CUarray.p("pArray", "returned array through which a subresource of {@code resource} may be accessed"),
        CUgraphicsResource("resource", "mapped resource to access"),
        unsigned_int(
            "arrayIndex",
            "array index for array textures or cubemap face index as defined by {@code CUarray_cubemap_face} for cubemap textures for the subresource to access"
        ),
        unsigned_int("mipLevel", "mipmap level for the subresource to access")
    )

    IgnoreMissing..CUresult(
        "GraphicsResourceGetMappedMipmappedArray",
        """
        Get a mipmapped array through which to access a mapped graphics resource.

        Returns in {@code *pMipmappedArray} a mipmapped array through which the mapped graphics resource {@code resource}. The value set in
        {@code *pMipmappedArray} may change every time that {@code resource} is mapped.

        If {@code resource} is not a texture then it cannot be accessed via a mipmapped array and #CUDA_ERROR_NOT_MAPPED_AS_ARRAY is returned. If {@code
        resource} is not mapped then #CUDA_ERROR_NOT_MAPPED is returned.
        """,

        Check(1)..CUmipmappedArray.p("pMipmappedArray", "returned mipmapped array through which {@code resource} may be accessed"),
        CUgraphicsResource("resource", "mapped resource to access")
    )

    CUresult(
        "GraphicsResourceGetMappedPointer",
        """
        Get a device pointer through which to access a mapped graphics resource.

        Returns in {@code *pDevPtr} a pointer through which the mapped graphics resource {@code resource} may be accessed. Returns in {@code pSize} the size of
        the memory in bytes which may be accessed from that pointer. The value set in {@code pPointer} may change every time that {@code resource} is mapped.

        If {@code resource} is not a buffer then it cannot be accessed via a pointer and #CUDA_ERROR_NOT_MAPPED_AS_POINTER is returned. If {@code resource} is
        not mapped then #CUDA_ERROR_NOT_MAPPED is returned. *
        """,

        Check(1)..CUdeviceptr.p("pDevPtr", "returned pointer through which {@code resource} may be accessed"),
        Check(1)..size_t.p("pSize", "returned size of the buffer accessible starting at {@code *pPointer}"),
        CUgraphicsResource("resource", "mapped resource to access")
    ).versioned()

    CUresult(
        "GraphicsResourceSetMapFlags",
        """
        Set usage flags for mapping a graphics resource.

        Set {@code flags} for mapping the graphics resource {@code resource}.

        Changes to {@code flags} will take effect the next time {@code resource} is mapped. The {@code flags} argument may be any of the following:
        ${ul(
            """
            #GRAPHICS_MAP_RESOURCE_FLAGS_NONE: Specifies no hints about how this resource will be used. It is therefore assumed that this resource will be
            read from and written to by CUDA kernels. This is the default value.
            """,
            "#GRAPHICS_MAP_RESOURCE_FLAGS_READ_ONLY: Specifies that CUDA kernels which access this resource will not write to this resource.",
            """
            #GRAPHICS_MAP_RESOURCE_FLAGS_WRITE_DISCARD: Specifies that CUDA kernels which access this resource will not read from this resource and will
            write over the entire contents of the resource, so none of the data previously stored in the resource will be preserved.
            """
        )}

        If {@code resource} is presently mapped for access by CUDA then #CUDA_ERROR_ALREADY_MAPPED is returned. If {@code flags} is not one of the above
        values then #CUDA_ERROR_INVALID_VALUE is returned.
        """,

        CUgraphicsResource("resource", "registered resource to set flags for"),
        unsigned_int("flags", "parameters for resource mapping")
    ).versioned()

    CUresult(
        "GraphicsMapResources",
        """
        Map graphics resources for access by CUDA.

        Maps the {@code count} graphics resources in {@code resources} for access by CUDA.

        The resources in {@code resources} may be accessed by CUDA until they are unmapped. The graphics API from which {@code resources} were registered
        should not access any resources while they are mapped by CUDA. If an application does so, the results are undefined.

        This function provides the synchronization guarantee that any graphics calls issued before #GraphicsMapResources() will complete before any
        subsequent CUDA work issued in {@code stream} begins.

        If {@code resources} includes any duplicate entries then #CUDA_ERROR_INVALID_HANDLE is returned. If any of {@code resources} are presently mapped for
        access by CUDA then #CUDA_ERROR_ALREADY_MAPPED is returned.
        """,

        AutoSize("resources")..unsigned_int("count", "number of resources to map"),
        CUgraphicsResource.p("resources", "resources to map for CUDA usage"),
        nullable..CUstream("hStream", "stream with which to synchronize")
    ).ptsz()

    CUresult(
        "GraphicsUnmapResources",
        """
        Unmap graphics resources.

        Unmaps the {@code count} graphics resources in {@code resources}.

        Once unmapped, the resources in {@code resources} may not be accessed by CUDA until they are mapped again.

        This function provides the synchronization guarantee that any CUDA work issued in {@code stream} before #GraphicsUnmapResources() will complete
        before any subsequently issued graphics work begins.

        If {@code resources} includes any duplicate entries then #CUDA_ERROR_INVALID_HANDLE is returned. If any of {@code resources} are not presently mapped
        for access by CUDA then #CUDA_ERROR_NOT_MAPPED is returned.
        """,

        AutoSize("resources")..unsigned_int("count", "number of resources to unmap"),
        CUgraphicsResource.p("resources", "resources to unmap"),
        nullable..CUstream("hStream", "stream with which to synchronize")
    ).ptsz()

    IgnoreMissing..CUresult(
        "GetProcAddress",
        """
        Returns the requested driver API function pointer.

        Returns in {@code **pfn} the address of the CUDA driver function for the requested CUDA version and flags.

        The CUDA version is specified as (1000 * major + 10 * minor), so CUDA 11.2 should be specified as 11020. For a requested driver symbol, if the
        specified CUDA version is greater than or equal to the CUDA version in which the driver symbol was introduced, this API will return the function
        pointer to the corresponding versioned function.

        The pointer returned by the API should be cast to a function pointer matching the requested driver function's definition in the API header file. The
        function pointer typedef can be picked up from the corresponding typedefs header file. For example, cudaTypedefs.h consists of function pointer
        typedefs for driver APIs defined in cuda.h.

        The API will return #CUDA_ERROR_NOT_FOUND if the requested driver function is not supported on the platform, no ABI compatible driver function exists
        for the specified {@code cudaVersion} or if the driver symbol is invalid.

        The requested flags can be:
        ${ul(
            """
            #GET_PROC_ADDRESS_DEFAULT: This is the default mode. This is equivalent to #GET_PROC_ADDRESS_PER_THREAD_DEFAULT_STREAM if the code is
            compiled with --default-stream per-thread compilation flag or the macro {@code CUDA_API_PER_THREAD_DEFAULT_STREAM} is defined;
            #GET_PROC_ADDRESS_LEGACY_STREAM otherwise.
            """,
            """
            #GET_PROC_ADDRESS_LEGACY_STREAM: This will enable the search for all driver symbols that match the requested driver symbol name except the
            corresponding per-thread versions.
            """,
            """
            #GET_PROC_ADDRESS_PER_THREAD_DEFAULT_STREAM: This will enable the search for all driver symbols that match the requested driver symbol name
            including the per-thread versions. If a per-thread version is not found, the API will return the legacy version of the driver function.
            """
        )}
        """,

        charASCII.const.p(
            "symbol",
            """
            the base name of the driver API function to look for. As an example, for the driver API {@code cuMemAlloc_v2()}, {@code symbol} would be
            {@code cuMemAlloc} and {@code cudaVersion} would be the ABI compatible CUDA version for the {@code _v2} variant.
            """
        ),
        Check(1)..void.p.p("pfn", "location to return the function pointer to the requested driver function"),
        int("cudaVersion", "the CUDA version to look for the requested driver symbol"),
        cuuint64_t("flags", "flags to specify search options")
    )

    CUresult(
        "GetExportTable",
        "",

        Unsafe..void.const.p.p("ppExportTable", ""),
        CUuuid.const.p("pExportTableId", "")
    )
}
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

        This class includes functionality up to CUDA version 3.2, which is the minimum version compatible with the LWJGL bindings.
        """

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

        "MEMHOSTREGISTER_PORTABLE".enum("If set, host memory is portable between CUDA contexts.", 0x01),
        "MEMHOSTREGISTER_DEVICEMAP".enum(
            "If set, host memory is mapped into CUDA address space and #MemHostGetDevicePointer() may be called on the host pointer.",
            0x02
        ),
        "MEMHOSTREGISTER_IOMEMORY".enum(
            """
            If set, the passed memory pointer is treated as pointing to some memory-mapped I/O space, e.g. belonging to a third-party PCIe device.

            On Windows the flag is a no-op. On Linux that memory is marked as non cache-coherent for the GPU and is expected to be physically contiguous.
            It may return #CUDA_ERROR_NOT_PERMITTED if run as an unprivileged user, #CUDA_ERROR_NOT_SUPPORTED on older Linux kernel versions. On all other
            platforms, it is not supported and #CUDA_ERROR_NOT_SUPPORTED is returned.
            """,
            0x04
        )
    )

    EnumConstant(
        "",

        "CUDA_ARRAY3D_LAYERED".enum(
            """
            If set, the CUDA array is a collection of layers, where each layer is either a 1D or a 2D array and the Depth member of ##CUDA_ARRAY3D_DESCRIPTOR
            specifies the number of layers, not the depth of a 3D array.
            """,
            0x01
        ),
        "CUDA_ARRAY3D_2DARRAY".enum("Deprecated, use #CUDA_ARRAY3D_LAYERED.", 0x01),
        "CUDA_ARRAY3D_SURFACE_LDST".enum("This flag must be set in order to bind a surface reference to the CUDA array.", 0x02),
        "CUDA_ARRAY3D_CUBEMAP".enum(
            """
            If set, the CUDA array is a collection of six 2D arrays, representing faces of a cube. The width of such a CUDA array must be equal to its height,
            and Depth must be six. If #CUDA_ARRAY3D_LAYERED flag is also set, then the CUDA array is a collection of cubemaps and Depth must be a multiple of
            six.
            """,
            0x04
        ),
        "CUDA_ARRAY3D_TEXTURE_GATHER".enum("This flag must be set in order to perform texture gather operations on a CUDA array.", 0x08),
        "CUDA_ARRAY3D_DEPTH_TEXTURE".enum("This flag if set indicates that the CUDA array is a DEPTH_TEXTURE.", 0x10),
        "CUDA_ARRAY3D_COLOR_ATTACHMENT".enum("This flag indicates that the CUDA array may be bound as a color target in an external graphics API.", 0x20)
    ).noPrefix()

    EnumConstant(
        "Flag for #TexRefSetArray().",

        "TRSA_OVERRIDE_FORMAT".enum("Override the {@code texref} format with a format inferred from the array.", 0x01)
    )

    EnumConstant(
        "Flag for #TexRefSetFlags().",

        "TRSF_READ_AS_INTEGER".enum("Read the texture as integers rather than promoting the values to floats in the range {@code [0,1]}.", 0x01),
        "TRSF_NORMALIZED_COORDINATES".enum("Use normalized texture coordinates in the range {@code [0,1)} instead of {@code [0,dim)}.", 0x02),
        "TRSF_SRGB".enum("Perform {@code sRGB->linear} conversion during texture read.", 0x10)
    )

    IntConstant(
        "For texture references loaded into the module, use default texunit from texture reference.",

        "PARAM_TR_DEFAULT".."-1"
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
        "CTX_MAP_HOST".enum("Support mapped pinned allocations", 0x08),
        "CTX_LMEM_RESIZE_TO_MAX".enum("Keep local memory allocation after launch", 0x10),
        "CTX_FLAGS_MASK".enum("", 0x1f)
    )

    EnumConstant(
        "Stream creation flags. ({@code CUstream_flags})",

        "STREAM_DEFAULT".enum("Default stream flag", 0x0),
        "STREAM_NON_BLOCKING".enum("Stream does not synchronize with stream 0 (the #NULL stream)", 0x1)
    )

    EnumConstant(
        "Event creation flags. ({@code CUevent_flags})",

        "EVENT_DEFAULT".enum("Default event flag", 0x0),
        "EVENT_BLOCKING_SYNC".enum("Event uses blocking synchronization", 0x1),
        "EVENT_DISABLE_TIMING".enum("Event will not record timing data", 0x2),
        "EVENT_INTERPROCESS".enum("Event is suitable for interprocess use. #EVENT_DISABLE_TIMING must be set", 0x4)
    )

    EnumConstant(
        "Array formats. ({@code CUarray_format})",

        "AD_FORMAT_UNSIGNED_INT8".enum("Unsigned 8-bit integers", 0x01),
        "AD_FORMAT_UNSIGNED_INT16".enum("Unsigned 16-bit integers", 0x02),
        "AD_FORMAT_UNSIGNED_INT32".enum("Unsigned 32-bit integers", 0x03),
        "AD_FORMAT_SIGNED_INT8".enum("Signed 8-bit integers", 0x08),
        "AD_FORMAT_SIGNED_INT16".enum("Signed 16-bit integers", 0x09),
        "AD_FORMAT_SIGNED_INT32".enum("Signed 32-bit integers", 0x0a),
        "AD_FORMAT_HALF".enum("16-bit floating point", 0x10),
        "AD_FORMAT_FLOAT".enum("32-bit floating point", 0x20)
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

        "DEVICE_ATTRIBUTE_MAX_THREADS_PER_BLOCK".enum("Maximum number of threads per block", 1),
        "DEVICE_ATTRIBUTE_MAX_BLOCK_DIM_X".enum("Maximum block dimension X", 2),
        "DEVICE_ATTRIBUTE_MAX_BLOCK_DIM_Y".enum("Maximum block dimension Y", 3),
        "DEVICE_ATTRIBUTE_MAX_BLOCK_DIM_Z".enum("Maximum block dimension Z", 4),
        "DEVICE_ATTRIBUTE_MAX_GRID_DIM_X".enum("Maximum grid dimension X", 5),
        "DEVICE_ATTRIBUTE_MAX_GRID_DIM_Y".enum("Maximum grid dimension Y", 6),
        "DEVICE_ATTRIBUTE_MAX_GRID_DIM_Z".enum("Maximum grid dimension Z", 7),
        "DEVICE_ATTRIBUTE_MAX_SHARED_MEMORY_PER_BLOCK".enum("Maximum shared memory available per block in bytes", 8),
        "DEVICE_ATTRIBUTE_SHARED_MEMORY_PER_BLOCK".enum("Deprecated, use #DEVICE_ATTRIBUTE_MAX_SHARED_MEMORY_PER_BLOCK", 8),
        "DEVICE_ATTRIBUTE_TOTAL_CONSTANT_MEMORY".enum("Memory available on device for {@code __constant__} variables in a CUDA C kernel in bytes", 9),
        "DEVICE_ATTRIBUTE_WARP_SIZE".enum("Warp size in threads", 10),
        "DEVICE_ATTRIBUTE_MAX_PITCH".enum("Maximum pitch in bytes allowed by memory copies", 11),
        "DEVICE_ATTRIBUTE_MAX_REGISTERS_PER_BLOCK".enum("Maximum number of 32-bit registers available per block", 12),
        "DEVICE_ATTRIBUTE_REGISTERS_PER_BLOCK".enum("Deprecated, use #DEVICE_ATTRIBUTE_MAX_REGISTERS_PER_BLOCK", 12),
        "DEVICE_ATTRIBUTE_CLOCK_RATE".enum("Typical clock frequency in kilohertz", 13),
        "DEVICE_ATTRIBUTE_TEXTURE_ALIGNMENT".enum("Alignment requirement for textures", 14),
        "DEVICE_ATTRIBUTE_GPU_OVERLAP".enum(
            "Device can possibly copy memory and execute a kernel concurrently. Deprecated. Use instead #DEVICE_ATTRIBUTE_ASYNC_ENGINE_COUNT.",
            15
        ),
        "DEVICE_ATTRIBUTE_MULTIPROCESSOR_COUNT".enum("Number of multiprocessors on device", 16),
        "DEVICE_ATTRIBUTE_KERNEL_EXEC_TIMEOUT".enum("Specifies whether there is a run time limit on kernels", 17),
        "DEVICE_ATTRIBUTE_INTEGRATED".enum("Device is integrated with host memory", 18),
        "DEVICE_ATTRIBUTE_CAN_MAP_HOST_MEMORY".enum("Device can map host memory into CUDA address space", 19),
        "DEVICE_ATTRIBUTE_COMPUTE_MODE".enum("Compute mode (See {@code CUcomputemode} for details)", 20),
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_WIDTH".enum("Maximum 1D texture width", 21),
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_WIDTH".enum("Maximum 2D texture width", 22),
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_HEIGHT".enum("Maximum 2D texture height", 23),
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_WIDTH".enum("Maximum 3D texture width", 24),
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_HEIGHT".enum("Maximum 3D texture height", 25),
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_DEPTH".enum("Maximum 3D texture depth", 26),
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LAYERED_WIDTH".enum("Maximum 2D layered texture width", 27),
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LAYERED_HEIGHT".enum("Maximum 2D layered texture height", 28),
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LAYERED_LAYERS".enum("Maximum layers in a 2D layered texture", 29),
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_ARRAY_WIDTH".enum("Deprecated, use #DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LAYERED_WIDTH", 27),
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_ARRAY_HEIGHT".enum("Deprecated, use #DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LAYERED_HEIGHT", 28),
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_ARRAY_NUMSLICES".enum("Deprecated, use #DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LAYERED_LAYERS", 29),
        "DEVICE_ATTRIBUTE_SURFACE_ALIGNMENT".enum("Alignment requirement for surfaces", 30),
        "DEVICE_ATTRIBUTE_CONCURRENT_KERNELS".enum("Device can possibly execute multiple kernels concurrently", 31),
        "DEVICE_ATTRIBUTE_ECC_ENABLED".enum("Device has ECC support enabled", 32),
        "DEVICE_ATTRIBUTE_PCI_BUS_ID".enum("PCI bus ID of the device", 33),
        "DEVICE_ATTRIBUTE_PCI_DEVICE_ID".enum("PCI device ID of the device", 34),
        "DEVICE_ATTRIBUTE_TCC_DRIVER".enum("Device is using TCC driver model", 35),
        "DEVICE_ATTRIBUTE_MEMORY_CLOCK_RATE".enum("Peak memory clock frequency in kilohertz", 36),
        "DEVICE_ATTRIBUTE_GLOBAL_MEMORY_BUS_WIDTH".enum("Global memory bus width in bits", 37),
        "DEVICE_ATTRIBUTE_L2_CACHE_SIZE".enum("Size of L2 cache in bytes", 38),
        "DEVICE_ATTRIBUTE_MAX_THREADS_PER_MULTIPROCESSOR".enum("Maximum resident threads per multiprocessor", 39),
        "DEVICE_ATTRIBUTE_ASYNC_ENGINE_COUNT".enum("Number of asynchronous engines", 40),
        "DEVICE_ATTRIBUTE_UNIFIED_ADDRESSING".enum("Device shares a unified address space with the host", 41),
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_LAYERED_WIDTH".enum("Maximum 1D layered texture width", 42),
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_LAYERED_LAYERS".enum("Maximum layers in a 1D layered texture", 43),
        "DEVICE_ATTRIBUTE_CAN_TEX2D_GATHER".enum("Deprecated, do not use.", 44),
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_GATHER_WIDTH".enum("Maximum 2D texture width if #CUDA_ARRAY3D_TEXTURE_GATHER is set", 45),
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_GATHER_HEIGHT".enum("Maximum 2D texture height if #CUDA_ARRAY3D_TEXTURE_GATHER is set", 46),
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_WIDTH_ALTERNATE".enum("Alternate maximum 3D texture width", 47),
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_HEIGHT_ALTERNATE".enum("Alternate maximum 3D texture height", 48),
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_DEPTH_ALTERNATE".enum("Alternate maximum 3D texture depth", 49),
        "DEVICE_ATTRIBUTE_PCI_DOMAIN_ID".enum("PCI domain ID of the device", 50),
        "DEVICE_ATTRIBUTE_TEXTURE_PITCH_ALIGNMENT".enum("Pitch alignment requirement for textures", 51),
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURECUBEMAP_WIDTH".enum("Maximum cubemap texture width/height", 52),
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURECUBEMAP_LAYERED_WIDTH".enum("Maximum cubemap layered texture width/height", 53),
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURECUBEMAP_LAYERED_LAYERS".enum("Maximum layers in a cubemap layered texture", 54),
        "DEVICE_ATTRIBUTE_MAXIMUM_SURFACE1D_WIDTH".enum("Maximum 1D surface width", 55),
        "DEVICE_ATTRIBUTE_MAXIMUM_SURFACE2D_WIDTH".enum("Maximum 2D surface width", 56),
        "DEVICE_ATTRIBUTE_MAXIMUM_SURFACE2D_HEIGHT".enum("Maximum 2D surface height", 57),
        "DEVICE_ATTRIBUTE_MAXIMUM_SURFACE3D_WIDTH".enum("Maximum 3D surface width", 58),
        "DEVICE_ATTRIBUTE_MAXIMUM_SURFACE3D_HEIGHT".enum("Maximum 3D surface height", 59),
        "DEVICE_ATTRIBUTE_MAXIMUM_SURFACE3D_DEPTH".enum("Maximum 3D surface depth", 60),
        "DEVICE_ATTRIBUTE_MAXIMUM_SURFACE1D_LAYERED_WIDTH".enum("Maximum 1D layered surface width", 61),
        "DEVICE_ATTRIBUTE_MAXIMUM_SURFACE1D_LAYERED_LAYERS".enum("Maximum layers in a 1D layered surface", 62),
        "DEVICE_ATTRIBUTE_MAXIMUM_SURFACE2D_LAYERED_WIDTH".enum("Maximum 2D layered surface width", 63),
        "DEVICE_ATTRIBUTE_MAXIMUM_SURFACE2D_LAYERED_HEIGHT".enum("Maximum 2D layered surface height", 64),
        "DEVICE_ATTRIBUTE_MAXIMUM_SURFACE2D_LAYERED_LAYERS".enum("Maximum layers in a 2D layered surface", 65),
        "DEVICE_ATTRIBUTE_MAXIMUM_SURFACECUBEMAP_WIDTH".enum("Maximum cubemap surface width", 66),
        "DEVICE_ATTRIBUTE_MAXIMUM_SURFACECUBEMAP_LAYERED_WIDTH".enum("Maximum cubemap layered surface width", 67),
        "DEVICE_ATTRIBUTE_MAXIMUM_SURFACECUBEMAP_LAYERED_LAYERS".enum("Maximum layers in a cubemap layered surface", 68),
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_LINEAR_WIDTH".enum("Maximum 1D linear texture width", 69),
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LINEAR_WIDTH".enum("Maximum 2D linear texture width", 70),
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LINEAR_HEIGHT".enum("Maximum 2D linear texture height", 71),
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LINEAR_PITCH".enum("Maximum 2D linear texture pitch in bytes", 72),
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_MIPMAPPED_WIDTH".enum("Maximum mipmapped 2D texture width", 73),
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_MIPMAPPED_HEIGHT".enum("Maximum mipmapped 2D texture height", 74),
        "DEVICE_ATTRIBUTE_COMPUTE_CAPABILITY_MAJOR".enum("Major compute capability version number", 75),
        "DEVICE_ATTRIBUTE_COMPUTE_CAPABILITY_MINOR".enum("Minor compute capability version number", 76),
        "DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_MIPMAPPED_WIDTH".enum("Maximum mipmapped 1D texture width", 77),
        "DEVICE_ATTRIBUTE_STREAM_PRIORITIES_SUPPORTED".enum("Device supports stream priorities", 78),
        "DEVICE_ATTRIBUTE_GLOBAL_L1_CACHE_SUPPORTED".enum("Device supports caching globals in L1", 79),
        "DEVICE_ATTRIBUTE_LOCAL_L1_CACHE_SUPPORTED".enum("Device supports caching locals in L1", 80),
        "DEVICE_ATTRIBUTE_MAX_SHARED_MEMORY_PER_MULTIPROCESSOR".enum("Maximum shared memory available per multiprocessor in bytes", 81),
        "DEVICE_ATTRIBUTE_MAX_REGISTERS_PER_MULTIPROCESSOR".enum("Maximum number of 32-bit registers available per multiprocessor", 82),
        "DEVICE_ATTRIBUTE_MANAGED_MEMORY".enum("Device can allocate managed memory on this system", 83),
        "DEVICE_ATTRIBUTE_MULTI_GPU_BOARD".enum("Device is on a multi-GPU board", 84),
        "DEVICE_ATTRIBUTE_MULTI_GPU_BOARD_GROUP_ID".enum("Unique id for a group of devices on the same multi-GPU board", 85),
        "DEVICE_ATTRIBUTE_HOST_NATIVE_ATOMIC_SUPPORTED".enum(
            """
            Link between the device and the host supports native atomic operations (this is a placeholder attribute, and is not supported on any current
            hardware)
            """,
            86
        ),
        "DEVICE_ATTRIBUTE_SINGLE_TO_DOUBLE_PRECISION_PERF_RATIO".enum(
            "Ratio of single precision performance (in floating-point operations per second) to double precision performance",
            87
        ),
        "DEVICE_ATTRIBUTE_PAGEABLE_MEMORY_ACCESS".enum("Device supports coherently accessing pageable memory without calling cudaHostRegister on it", 88),
        "DEVICE_ATTRIBUTE_CONCURRENT_MANAGED_ACCESS".enum("Device can coherently access managed memory concurrently with the CPU", 89),
        "DEVICE_ATTRIBUTE_COMPUTE_PREEMPTION_SUPPORTED".enum("Device supports compute preemption.", 90),
        "DEVICE_ATTRIBUTE_CAN_USE_HOST_POINTER_FOR_REGISTERED_MEM".enum("Device can access host registered memory at the same virtual address as the CPU", 91),
        "DEVICE_ATTRIBUTE_CAN_USE_STREAM_MEM_OPS".enum("#StreamBatchMemOp() and related APIs are supported.", 92),
        "DEVICE_ATTRIBUTE_CAN_USE_64_BIT_STREAM_MEM_OPS".enum("64-bit operations are supported in #StreamBatchMemOp() and related APIs.", 93),
        "DEVICE_ATTRIBUTE_CAN_USE_STREAM_WAIT_VALUE_NOR".enum("#STREAM_WAIT_VALUE_NOR is supported.", 94),
        "DEVICE_ATTRIBUTE_COOPERATIVE_LAUNCH".enum("Device supports launching cooperative kernels via #LaunchCooperativeKernel()", 95),
        "DEVICE_ATTRIBUTE_COOPERATIVE_MULTI_DEVICE_LAUNCH".enum(
            "Device can participate in cooperative kernels launched via #LaunchCooperativeKernelMultiDevice()",
            96
        ),
        "DEVICE_ATTRIBUTE_MAX_SHARED_MEMORY_PER_BLOCK_OPTIN".enum("Maximum optin shared memory per block", 97),
        "DEVICE_ATTRIBUTE_CAN_FLUSH_REMOTE_WRITES".enum(
            "Both the #STREAM_WAIT_VALUE_FLUSH flag and the #STREAM_MEM_OP_FLUSH_REMOTE_WRITES MemOp are supported on the device.",
            98
        ),
        "DEVICE_ATTRIBUTE_HOST_REGISTER_SUPPORTED".enum("Device supports host memory registration via {@code cudaHostRegister()}.", 99),
        "DEVICE_ATTRIBUTE_PAGEABLE_MEMORY_ACCESS_USES_HOST_PAGE_TABLES".enum("Device accesses pageable memory via the host's page tables.", 100),
        "DEVICE_ATTRIBUTE_DIRECT_MANAGED_MEM_ACCESS_FROM_HOST".enum("The host can directly access managed memory on the device without migration.", 101)
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
        )
    )

    EnumConstant(
        "Online compilation targets. ({@code CUjit_target})",

        "TARGET_COMPUTE_20".enum("Compute device class 2.0", 20),
        "TARGET_COMPUTE_21".enum("Compute device class 2.1", 21),
        "TARGET_COMPUTE_30".enum("Compute device class 3.0", 30),
        "TARGET_COMPUTE_32".enum("Compute device class 3.2", 32),
        "TARGET_COMPUTE_35".enum("Compute device class 3.5", 35),
        "TARGET_COMPUTE_37".enum("Compute device class 3.7", 37),
        "TARGET_COMPUTE_50".enum("Compute device class 5.0", 50),
        "TARGET_COMPUTE_52".enum("Compute device class 5.2", 52),
        "TARGET_COMPUTE_53".enum("Compute device class 5.3", 53),
        "TARGET_COMPUTE_60".enum("Compute device class 6.0.", 60),
        "TARGET_COMPUTE_61".enum("Compute device class 6.1.", 61),
        "TARGET_COMPUTE_62".enum("Compute device class 6.2.", 62),
        "TARGET_COMPUTE_70".enum("Compute device class 7.0.", 70),
        "TARGET_COMPUTE_72".enum("Compute device class 7.2.", 72),
        "TARGET_COMPUTE_75".enum("Compute device class 7.5.", 75)
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

        "LIMIT_STACK_SIZE".enum("GPU thread stack size", 0x00),
        "LIMIT_PRINTF_FIFO_SIZE".enum("GPU printf FIFO size", 0x01),
        "LIMIT_MALLOC_HEAP_SIZE".enum("GPU malloc heap size", 0x02),
        "LIMIT_DEV_RUNTIME_SYNC_DEPTH".enum("GPU device runtime launch synchronize depth", 0x03),
        "LIMIT_DEV_RUNTIME_PENDING_LAUNCH_COUNT".enum("GPU device runtime pending launch count", 0x04),
        "LIMIT_MAX_L2_FETCH_GRANULARITY".enum("A value between 0 and 128 that indicates the maximum fetch granularity of L2 (in Bytes). This is a hint", 0x05)
    )

    EnumConstant(
        "Error codes. ({@code CUresult})",

        "CUDA_SUCCESS".enum(
            """
            The API call returned with no errors.

            In the case of query calls, this also means that the operation being queried is complete (see #EventQuery() and #StreamQuery()).
            """,
            0
        ),

        "CUDA_ERROR_INVALID_VALUE".enum(
            "This indicates that one or more of the parameters passed to the API call is not within an acceptable range of values.",
            1
        ),
        "CUDA_ERROR_OUT_OF_MEMORY".enum("The API call failed because it was unable to allocate enough memory to perform the requested operation.", 2),
        "CUDA_ERROR_NOT_INITIALIZED".enum("This indicates that the CUDA driver has not been initialized with #Init() or that initialization has failed.", 3),
        "CUDA_ERROR_DEINITIALIZED".enum("This indicates that the CUDA driver is in the process of shutting down.", 4),
        "CUDA_ERROR_PROFILER_DISABLED".enum(
            """
            This indicates profiler is not initialized for this run. This can happen when the application is running with external profiling tools like visual
            profiler.
            """,
            5
        ),
        "CUDA_ERROR_PROFILER_NOT_INITIALIZED".enum(
            """
            This error return is deprecated as of CUDA 5.0.

            It is no longer an error to attempt to enable/disable the profiling via #ProfilerStart() or #ProfilerStop() without initialization.
            """,
            6
        ),
        "CUDA_ERROR_PROFILER_ALREADY_STARTED".enum(
            """
            This error return is deprecated as of CUDA 5.0.

            It is no longer an error to call #ProfilerStart() when profiling is already enabled.
            """,
            7
        ),
        "CUDA_ERROR_PROFILER_ALREADY_STOPPED".enum(
            """
            This error return is deprecated as of CUDA 5.0.

            It is no longer an error to call #ProfilerStop() when profiling is already disabled.
            """,
            8
        ),
        "CUDA_ERROR_NO_DEVICE".enum("This indicates that no CUDA-capable devices were detected by the installed CUDA driver.", 100),
        "CUDA_ERROR_INVALID_DEVICE".enum("This indicates that the device ordinal supplied by the user does not correspond to a valid CUDA device.", 101),
        "CUDA_ERROR_INVALID_IMAGE".enum("This indicates that the device kernel image is invalid. This can also indicate an invalid CUDA module.", 200),
        "CUDA_ERROR_INVALID_CONTEXT".enum(
            """
            This most frequently indicates that there is no context bound to the current thread.
            This can also be returned if the context passed to an API call is not a valid handle (such as a context that has had #CtxDestroy() invoked on it).
            This can also be returned if a user mixes different API versions (i.e. 3010 context with 3020 API calls).

            See #CtxGetApiVersion() for more details.
            """,
            201
        ),
        "CUDA_ERROR_CONTEXT_ALREADY_CURRENT".enum(
            """
            This indicated that the context being supplied as a parameter to the API call was already the active context.

            This error return is deprecated as of CUDA 3.2. It is no longer an error to attempt to push the active context via #CtxPushCurrent().
            """,
            202
        ),
        "CUDA_ERROR_MAP_FAILED".enum("This indicates that a map or register operation has failed.", 205),
        "CUDA_ERROR_UNMAP_FAILED".enum("This indicates that an unmap or unregister operation has failed.", 206),
        "CUDA_ERROR_ARRAY_IS_MAPPED".enum("This indicates that the specified array is currently mapped and thus cannot be destroyed.", 207),
        "CUDA_ERROR_ALREADY_MAPPED".enum("This indicates that the resource is already mapped.", 208),
        "CUDA_ERROR_NO_BINARY_FOR_GPU".enum(
            """
            This indicates that there is no kernel image available that is suitable for the device.

            This can occur when a user specifies code generation options for a particular CUDA source file that do not include the corresponding device
            configuration.
            """,
            209
        ),
        "CUDA_ERROR_ALREADY_ACQUIRED".enum("This indicates that a resource has already been acquired.", 210),
        "CUDA_ERROR_NOT_MAPPED".enum("This indicates that a resource is not mapped.", 211),
        "CUDA_ERROR_NOT_MAPPED_AS_ARRAY".enum("This indicates that a mapped resource is not available for access as an array.", 212),
        "CUDA_ERROR_NOT_MAPPED_AS_POINTER".enum("This indicates that a mapped resource is not available for access as a pointer.", 213),
        "CUDA_ERROR_ECC_UNCORRECTABLE".enum("This indicates that an uncorrectable ECC error was detected during execution.", 214),
        "CUDA_ERROR_UNSUPPORTED_LIMIT".enum("This indicates that the {@code CUlimit} passed to the API call is not supported by the active device.", 215),
        "CUDA_ERROR_CONTEXT_ALREADY_IN_USE".enum(
            """
            This indicates that the {@code CUcontext} passed to the API call can only be bound to a single CPU thread at a time but is already bound to a CPU
            thread.
            """,
            216
        ),
        "CUDA_ERROR_PEER_ACCESS_UNSUPPORTED".enum("This indicates that peer access is not supported across the given devices.", 217),
        "CUDA_ERROR_INVALID_PTX".enum("This indicates that a PTX JIT compilation failed.", 218),
        "CUDA_ERROR_INVALID_GRAPHICS_CONTEXT".enum("This indicates an error with OpenGL or DirectX context.", 219),
        "CUDA_ERROR_NVLINK_UNCORRECTABLE".enum("This indicates that an uncorrectable NVLink error was detected during the execution.", 220),
        "CUDA_ERROR_JIT_COMPILER_NOT_FOUND".enum("This indicates that the PTX JIT compiler library was not found.", 221),
        "CUDA_ERROR_INVALID_SOURCE".enum("This indicates that the device kernel source is invalid.", 300),
        "CUDA_ERROR_FILE_NOT_FOUND".enum("This indicates that the file specified was not found.", 301),
        "CUDA_ERROR_SHARED_OBJECT_SYMBOL_NOT_FOUND".enum("This indicates that a link to a shared object failed to resolve.", 302),
        "CUDA_ERROR_SHARED_OBJECT_INIT_FAILED".enum("This indicates that initialization of a shared object failed.", 303),
        "CUDA_ERROR_OPERATING_SYSTEM".enum("This indicates that an OS call failed.", 304),
        "CUDA_ERROR_INVALID_HANDLE".enum(
            """
            This indicates that a resource handle passed to the API call was not valid.

            Resource handles are opaque types like {@code CUstream} and {@code CUevent}.
            """,
            400
        ),
        "CUDA_ERROR_ILLEGAL_STATE".enum(
            "This indicates that a resource required by the API call is not in a valid state to perform the requested operation.",
            401
        ),
        "CUDA_ERROR_NOT_FOUND".enum(
            "This indicates that a named symbol was not found. Examples of symbols are global/constant variable names, texture names, and surface names.",
            500
        ),
        "CUDA_ERROR_NOT_READY".enum(
            """
            This indicates that asynchronous operations issued previously have not completed yet.

            This result is not actually an error, but must be indicated differently than #CUDA_SUCCESS (which indicates completion). Calls that may return this
            value include #EventQuery() and #StreamQuery().
            """,
            600
        ),
        "CUDA_ERROR_ILLEGAL_ADDRESS".enum(
            """
            While executing a kernel, the device encountered a load or store instruction on an invalid memory address.

            This leaves the process in an inconsistent state and any further CUDA work will return the same error. To continue using CUDA, the process must be
            terminated and relaunched.
            """,
            700
        ),
        "CUDA_ERROR_LAUNCH_OUT_OF_RESOURCES".enum(
            """
            This indicates that a launch did not occur because it did not have appropriate resources.

            This error usually indicates that the user has attempted to pass too many arguments to the device kernel, or the kernel launch specifies too many
            threads for the kernel's register count. Passing arguments of the wrong size (i.e. a 64-bit pointer when a 32-bit int is expected) is equivalent to
            passing too many arguments and can also result in this error.
            """,
            701
        ),
        "CUDA_ERROR_LAUNCH_TIMEOUT".enum(
            """
            This indicates that the device kernel took too long to execute.

            This can only occur if timeouts are enabled - see the device attribute #DEVICE_ATTRIBUTE_KERNEL_EXEC_TIMEOUT for more information. This leaves the
            process in an inconsistent state and any further CUDA work will return the same error. To continue using CUDA, the process must be terminated and
            relaunched.
            """,
            702
        ),
        "CUDA_ERROR_LAUNCH_INCOMPATIBLE_TEXTURING".enum("This error indicates a kernel launch that uses an incompatible texturing mode.", 703),
        "CUDA_ERROR_PEER_ACCESS_ALREADY_ENABLED".enum(
            """
            This error indicates that a call to #CtxEnablePeerAccess() is trying to re-enable peer access to a context which has already had peer access to it
            enabled.
            """,
            704
        ),
        "CUDA_ERROR_PEER_ACCESS_NOT_ENABLED".enum(
            "This error indicates that #CtxDisablePeerAccess() is trying to disable peer access which has not been enabled yet via #CtxEnablePeerAccess().",
            705
        ),
        "CUDA_ERROR_PRIMARY_CONTEXT_ACTIVE".enum("This error indicates that the primary context for the specified device has already been initialized.", 708),
        "CUDA_ERROR_CONTEXT_IS_DESTROYED".enum(
            """
            This error indicates that the context current to the calling thread has been destroyed using #CtxDestroy(), or is a primary context which has not
            yet been initialized.
            """,
            709
        ),
        "CUDA_ERROR_ASSERT".enum(
            """
            A device-side assert triggered during kernel execution.

            The context cannot be used anymore, and must be destroyed. All existing device memory allocations from this context are invalid and must be
            reconstructed if the program is to continue using CUDA.
            """,
            710
        ),
        "CUDA_ERROR_TOO_MANY_PEERS".enum(
            """
            This error indicates that the hardware resources required to enable peer access have been exhausted for one or more of the devices passed to
            #CtxEnablePeerAccess().
            """,
            711
        ),
        "CUDA_ERROR_HOST_MEMORY_ALREADY_REGISTERED".enum(
            "This error indicates that the memory range passed to #MemHostRegister() has already been registered.",
            712
        ),
        "CUDA_ERROR_HOST_MEMORY_NOT_REGISTERED".enum(
            "This error indicates that the pointer passed to #MemHostUnregister() does not correspond to any currently registered memory region.",
            713
        ),
        "CUDA_ERROR_HARDWARE_STACK_ERROR".enum(
            """
            While executing a kernel, the device encountered a stack error.

            This can be due to stack corruption or exceeding the stack size limit. This leaves the process in an inconsistent state and any further CUDA work
            will return the same error. To continue using CUDA, the process must be terminated and relaunched.
            """,
            714
        ),
        "CUDA_ERROR_ILLEGAL_INSTRUCTION".enum(
            """
            While executing a kernel, the device encountered an illegal instruction.

            This leaves the process in an inconsistent state and any further CUDA work will return the same error. To continue using CUDA, the process must be
            terminated and relaunched.
            """,
            715
        ),
        "CUDA_ERROR_MISALIGNED_ADDRESS".enum(
            """
            While executing a kernel, the device encountered a load or store instruction on a memory address which is not aligned.

            This leaves the process in an inconsistent state and any further CUDA work will return the same error. To continue using CUDA, the process must be
            terminated and relaunched.
            """,
            716
        ),
        "CUDA_ERROR_INVALID_ADDRESS_SPACE".enum(
            """
            While executing a kernel, the device encountered an instruction which can only operate on memory locations in certain address spaces (global,
            shared, or local), but was supplied a memory address not belonging to an allowed address space.

            This leaves the process in an inconsistent state and any further CUDA work will return the same error. To continue using CUDA, the process must be
            terminated and relaunched.
            """,
            717
        ),
        "CUDA_ERROR_INVALID_PC".enum(
            """
            While executing a kernel, the device program counter wrapped its address space.

            This leaves the process in an inconsistent state and any further CUDA work will return the same error. To continue using CUDA, the process must be
            terminated and relaunched.
            """,
            718
        ),
        "CUDA_ERROR_LAUNCH_FAILED".enum(
            """
            An exception occurred on the device while executing a kernel.

            Common causes include dereferencing an invalid device pointer and accessing out of bounds shared memory. Less common cases can be system specific -
            more information about these cases can be found in the system specific user guide.This leaves the process in an inconsistent state and any further
            CUDA work will return the same error. To continue using CUDA, the process must be terminated and relaunched.
            """,
            719
        ),
        "CUDA_ERROR_COOPERATIVE_LAUNCH_TOO_LARGE".enum(
            """
            This error indicates that the number of blocks launched per grid for a kernel that was launched via either #LaunchCooperativeKernel() or
            #LaunchCooperativeKernelMultiDevice() exceeds the maximum number of blocks as allowed by #OccupancyMaxActiveBlocksPerMultiprocessor() or
            #OccupancyMaxActiveBlocksPerMultiprocessorWithFlags() times the number of multiprocessors as specified by the device attribute
            #DEVICE_ATTRIBUTE_MULTIPROCESSOR_COUNT.
            """,
            720
        ),
        "CUDA_ERROR_NOT_PERMITTED".enum("This error indicates that the attempted operation is not permitted.", 800),
        "CUDA_ERROR_NOT_SUPPORTED".enum("This error indicates that the attempted operation is not supported on the current system or device.", 801),
        "CUDA_ERROR_SYSTEM_NOT_READY".enum(
            """
            This error indicates that the system is not yet ready to start any CUDA work.

            To continue using CUDA, verify the system configuration is in a valid state and all required driver daemons are actively running. More information
            about this error can be found in the system specific user guide.
            """,
            802
        ),
        "CUDA_ERROR_SYSTEM_DRIVER_MISMATCH".enum(
            """
            This error indicates that there is a mismatch between the versions of the display driver and the CUDA driver.

            Refer to the compatibility documentation for supported versions.
            """
        ),
        "CUDA_ERROR_COMPAT_NOT_SUPPORTED_ON_DEVICE".enum(
            """
            This error indicates that the system was upgraded to run with forward compatibility but the visible hardware detected by CUDA does not support this
            configuration.

            Refer to the compatibility documentation for the supported hardware matrix or ensure that only supported hardware is visible during initialization
            via the {@code CUDA_VISIBLE_DEVICES} environment variable.
            """
        ),
        "CUDA_ERROR_STREAM_CAPTURE_UNSUPPORTED".enum("This error indicates that the operation is not permitted when the stream is capturing.", 900),
        "CUDA_ERROR_STREAM_CAPTURE_INVALIDATED".enum(
            "This error indicates that the current capture sequence on the stream has been invalidated due to a previous error.",
            901
        ),
        "CUDA_ERROR_STREAM_CAPTURE_MERGE".enum(
            "This error indicates that the operation would have resulted in a merge of two independent capture sequences.",
            902
        ),
        "CUDA_ERROR_STREAM_CAPTURE_UNMATCHED".enum("This error indicates that the capture was not initiated in this stream.", 903),
        "CUDA_ERROR_STREAM_CAPTURE_UNJOINED".enum(
            "This error indicates that the capture sequence contains a fork that was not joined to the primary stream.",
            904
        ),
        "CUDA_ERROR_STREAM_CAPTURE_ISOLATION".enum(
            """
            This error indicates that a dependency would have been created which crosses the capture sequence boundary.

            Only implicit in-stream ordering dependencies are allowed to cross the boundary.
            """,
            905
        ),
        "CUDA_ERROR_STREAM_CAPTURE_IMPLICIT".enum(
            "This error indicates a disallowed implicit dependency on a current capture sequence from cudaStreamLegacy.",
            906
        ),
        "CUDA_ERROR_CAPTURED_EVENT".enum(
            "This error indicates that the operation is not permitted on an event which was last recorded in a capturing stream.",
            907
        ),
        "CUDA_ERROR_STREAM_CAPTURE_WRONG_THREAD".enum(
            """
            A stream capture sequence not initiated with the #STREAM_CAPTURE_MODE_RELAXED argument to #StreamBeginCapture() was passed to #StreamEndCapture()
            in a different thread.
            """
        ),
        "CUDA_ERROR_UNKNOWN".enum("This indicates that an unknown internal error has occurred.", 999)
    ).noPrefix()

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

    CUresult(
        "DeviceTotalMem",
        "",

        Check(1)..size_t.p("bytes", ""),
        CUdevice("dev", "")
    ).versioned()

    CUresult(
        "DeviceGetAttribute",
        "",

        Check(1)..int.p("pi", ""),
        CUdevice_attribute("attrib", ""),
        CUdevice("dev", "")
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

    CUresult(
        "CtxCreate",
        "",

        Check(1)..CUcontext.p("pctx", ""),
        unsigned_int("flags", ""),
        CUdevice("dev", "")
    ).versioned()

    CUresult(
        "CtxGetDevice",
        "",

        Check(1)..CUdevice.p("device", "")
    )

    CUresult("CtxSynchronize", "", void())

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
        charASCII.const.p("fname", "")
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

    CUresult(
        "ModuleGetFunction",
        "",

        Check(1)..CUfunction.p("hfunc", ""),
        CUmodule("hmod", ""),
        charASCII.const.p("name", "")
    )

    CUresult(
        "ModuleGetGlobal",
        "",

        Check(1)..nullable..CUdeviceptr.p("dptr", ""),
        Check(1)..nullable..size_t.p("bytes", ""),
        CUmodule("hmod", ""),
        charASCII.const.p("name", "")
    ).versioned()

    CUresult(
        "ModuleGetTexRef",
        "",

        Check(1)..CUtexref.p("pTexRef", ""),
        CUmodule("hmod", ""),
        charASCII.const.p("name", "")
    )

    CUresult(
        "ModuleGetSurfRef",
        "",

        Check(1)..CUsurfref.p("pSurfRef", ""),
        CUmodule("hmod", ""),
        charASCII.const.p("name", "")
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

        CUstream("hStream", ""),
        Check(1)..int.p("priority", "")
    ).ptsz()

    CUresult(
        "StreamGetFlags",
        "",

        CUstream("hStream", ""),
        Check(1)..unsigned_int.p("flags", "")
    ).ptsz()

    CUresult(
        "StreamWaitEvent",
        "",

        nullable..CUstream("hStream", ""),
        CUevent("hEvent", ""),
        unsigned_int("Flags", "")
    ).ptsz()

    CUresult(
        "StreamAddCallback",
        "",

        nullable..CUstream("hStream", ""),
        CUstreamCallback("callback", ""),
        opaque_p("userData", ""),
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

    CUresult(
        "EventElapsedTime",
        "",

        Check(1)..float.p("pMilliseconds", ""),
        CUevent("hStart", ""),
        CUevent("hEnd", "")
    )

    CUresult(
        "FuncGetAttribute",
        "",

        Check(1)..int.p("pi", ""),
        CUfunction_attribute("attrib", ""),
        CUfunction("hfunc", "")
    )

    CUresult(
        "FuncSetCacheConfig",
        "",

        CUfunction("hfunc", ""),
        CUfunc_cache("config", "")
    )

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

        Check(1)..nullable..size_t.p("ByteOffset", ""),
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

        Check(1)..nullable..CUarray_format.p("pFormat", ""),
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

    CUresult(
        "GetExportTable",
        "",

        Unsafe..void.const.p.p("ppExportTable", ""),
        CUuuid.const.p("pExportTableId", "")
    )
}
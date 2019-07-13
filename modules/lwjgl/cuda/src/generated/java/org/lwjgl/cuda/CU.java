/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.cuda;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.Pointer.*;

import static org.lwjgl.cuda.CUDA.*;

/**
 * Contains bindings to the <a href="https://docs.nvidia.com/cuda/cuda-driver-api/index.html">CUDA Driver API</a>.
 * 
 * <p>This class includes functionality up to CUDA version 3.2, which is the minimum version compatible with the LWJGL bindings.</p>
 */
public class CU {

    /**
     * Flags for {@link #cuMemHostAlloc MemHostAlloc}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_MEMHOSTALLOC_PORTABLE MEMHOSTALLOC_PORTABLE} - If set, host memory is portable between CUDA contexts.</li>
     * <li>{@link #CU_MEMHOSTALLOC_DEVICEMAP MEMHOSTALLOC_DEVICEMAP} - If set, host memory is mapped into CUDA address space and {@link #cuMemHostGetDevicePointer MemHostGetDevicePointer} may be called on the host pointer.</li>
     * <li>{@link #CU_MEMHOSTALLOC_WRITECOMBINED MEMHOSTALLOC_WRITECOMBINED} - 
     * If set, host memory is allocated as write-combined - fast to write, faster to DMA, slow to read except via SSE4 streaming load instruction
     * ({@code MOVNTDQA}).
     * </li>
     * </ul>
     */
    public static final int
        CU_MEMHOSTALLOC_PORTABLE      = 0x1,
        CU_MEMHOSTALLOC_DEVICEMAP     = 0x2,
        CU_MEMHOSTALLOC_WRITECOMBINED = 0x4;

    /**
     * Flags for {@link CU40#cuMemHostRegister MemHostRegister}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_MEMHOSTREGISTER_PORTABLE MEMHOSTREGISTER_PORTABLE} - If set, host memory is portable between CUDA contexts.</li>
     * <li>{@link #CU_MEMHOSTREGISTER_DEVICEMAP MEMHOSTREGISTER_DEVICEMAP} - If set, host memory is mapped into CUDA address space and {@link #cuMemHostGetDevicePointer MemHostGetDevicePointer} may be called on the host pointer.</li>
     * <li>{@link #CU_MEMHOSTREGISTER_IOMEMORY MEMHOSTREGISTER_IOMEMORY} - 
     * If set, the passed memory pointer is treated as pointing to some memory-mapped I/O space, e.g. belonging to a third-party PCIe device.
     * 
     * <p>On Windows the flag is a no-op. On Linux that memory is marked as non cache-coherent for the GPU and is expected to be physically contiguous.
     * It may return {@link #CUDA_ERROR_NOT_PERMITTED} if run as an unprivileged user, {@link #CUDA_ERROR_NOT_SUPPORTED} on older Linux kernel versions. On all other
     * platforms, it is not supported and {@link #CUDA_ERROR_NOT_SUPPORTED} is returned.</p>
     * </li>
     * </ul>
     */
    public static final int
        CU_MEMHOSTREGISTER_PORTABLE  = 0x1,
        CU_MEMHOSTREGISTER_DEVICEMAP = 0x2,
        CU_MEMHOSTREGISTER_IOMEMORY  = 0x4;

    /**
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CUDA_ARRAY3D_LAYERED CUDA_ARRAY3D_LAYERED} - 
     * If set, the CUDA array is a collection of layers, where each layer is either a 1D or a 2D array and the Depth member of {@link CUDA_ARRAY3D_DESCRIPTOR}
     * specifies the number of layers, not the depth of a 3D array.
     * </li>
     * <li>{@link #CUDA_ARRAY3D_2DARRAY CUDA_ARRAY3D_2DARRAY} - Deprecated, use {@link #CUDA_ARRAY3D_LAYERED}.</li>
     * <li>{@link #CUDA_ARRAY3D_SURFACE_LDST CUDA_ARRAY3D_SURFACE_LDST} - This flag must be set in order to bind a surface reference to the CUDA array.</li>
     * <li>{@link #CUDA_ARRAY3D_CUBEMAP CUDA_ARRAY3D_CUBEMAP} - 
     * If set, the CUDA array is a collection of six 2D arrays, representing faces of a cube. The width of such a CUDA array must be equal to its height,
     * and Depth must be six. If {@link #CUDA_ARRAY3D_LAYERED} flag is also set, then the CUDA array is a collection of cubemaps and Depth must be a multiple of
     * six.
     * </li>
     * <li>{@link #CUDA_ARRAY3D_TEXTURE_GATHER CUDA_ARRAY3D_TEXTURE_GATHER} - This flag must be set in order to perform texture gather operations on a CUDA array.</li>
     * <li>{@link #CUDA_ARRAY3D_DEPTH_TEXTURE CUDA_ARRAY3D_DEPTH_TEXTURE} - This flag if set indicates that the CUDA array is a DEPTH_TEXTURE.</li>
     * <li>{@link #CUDA_ARRAY3D_COLOR_ATTACHMENT CUDA_ARRAY3D_COLOR_ATTACHMENT} - This flag indicates that the CUDA array may be bound as a color target in an external graphics API.</li>
     * </ul>
     */
    public static final int
        CUDA_ARRAY3D_LAYERED          = 0x1,
        CUDA_ARRAY3D_2DARRAY          = 0x1,
        CUDA_ARRAY3D_SURFACE_LDST     = 0x2,
        CUDA_ARRAY3D_CUBEMAP          = 0x4,
        CUDA_ARRAY3D_TEXTURE_GATHER   = 0x8,
        CUDA_ARRAY3D_DEPTH_TEXTURE    = 0x10,
        CUDA_ARRAY3D_COLOR_ATTACHMENT = 0x20;

    /**
     * Flag for {@link #cuTexRefSetArray TexRefSetArray}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_TRSA_OVERRIDE_FORMAT TRSA_OVERRIDE_FORMAT} - Override the {@code texref} format with a format inferred from the array.</li>
     * </ul>
     */
    public static final int CU_TRSA_OVERRIDE_FORMAT = 0x1;

    /**
     * Flag for {@link #cuTexRefSetFlags TexRefSetFlags}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_TRSF_READ_AS_INTEGER TRSF_READ_AS_INTEGER} - Read the texture as integers rather than promoting the values to floats in the range {@code [0,1]}.</li>
     * <li>{@link #CU_TRSF_NORMALIZED_COORDINATES TRSF_NORMALIZED_COORDINATES} - Use normalized texture coordinates in the range {@code [0,1)} instead of {@code [0,dim)}.</li>
     * <li>{@link #CU_TRSF_SRGB TRSF_SRGB} - Perform {@code sRGB->linear} conversion during texture read.</li>
     * </ul>
     */
    public static final int
        CU_TRSF_READ_AS_INTEGER        = 0x1,
        CU_TRSF_NORMALIZED_COORDINATES = 0x2,
        CU_TRSF_SRGB                   = 0x10;

    /** For texture references loaded into the module, use default texunit from texture reference. */
    public static final int CU_PARAM_TR_DEFAULT = -1;

    /**
     * Context creation flags. ({@code CUctx_flags})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_CTX_SCHED_AUTO CTX_SCHED_AUTO} - Automatic scheduling</li>
     * <li>{@link #CU_CTX_SCHED_SPIN CTX_SCHED_SPIN} - Set spin as default scheduling</li>
     * <li>{@link #CU_CTX_SCHED_YIELD CTX_SCHED_YIELD} - Set yield as default scheduling</li>
     * <li>{@link #CU_CTX_SCHED_BLOCKING_SYNC CTX_SCHED_BLOCKING_SYNC} - Set blocking synchronization as default scheduling</li>
     * <li>{@link #CU_CTX_BLOCKING_SYNC CTX_BLOCKING_SYNC} - Set blocking synchronization as default scheduling. This flag was deprecated as of CUDA 4.0 and was replaced with {@link #CU_CTX_SCHED_BLOCKING_SYNC CTX_SCHED_BLOCKING_SYNC}.</li>
     * <li>{@link #CU_CTX_SCHED_MASK CTX_SCHED_MASK}</li>
     * <li>{@link #CU_CTX_MAP_HOST CTX_MAP_HOST} - Support mapped pinned allocations</li>
     * <li>{@link #CU_CTX_LMEM_RESIZE_TO_MAX CTX_LMEM_RESIZE_TO_MAX} - Keep local memory allocation after launch</li>
     * <li>{@link #CU_CTX_FLAGS_MASK CTX_FLAGS_MASK}</li>
     * </ul>
     */
    public static final int
        CU_CTX_SCHED_AUTO          = 0x0,
        CU_CTX_SCHED_SPIN          = 0x1,
        CU_CTX_SCHED_YIELD         = 0x2,
        CU_CTX_SCHED_BLOCKING_SYNC = 0x4,
        CU_CTX_BLOCKING_SYNC       = 0x4,
        CU_CTX_SCHED_MASK          = 0x7,
        CU_CTX_MAP_HOST            = 0x8,
        CU_CTX_LMEM_RESIZE_TO_MAX  = 0x10,
        CU_CTX_FLAGS_MASK          = 0x1F;

    /**
     * Stream creation flags. ({@code CUstream_flags})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_STREAM_DEFAULT STREAM_DEFAULT} - Default stream flag</li>
     * <li>{@link #CU_STREAM_NON_BLOCKING STREAM_NON_BLOCKING} - Stream does not synchronize with stream 0 (the {@code NULL} stream)</li>
     * </ul>
     */
    public static final int
        CU_STREAM_DEFAULT      = 0x0,
        CU_STREAM_NON_BLOCKING = 0x1;

    /**
     * Event creation flags. ({@code CUevent_flags})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_EVENT_DEFAULT EVENT_DEFAULT} - Default event flag</li>
     * <li>{@link #CU_EVENT_BLOCKING_SYNC EVENT_BLOCKING_SYNC} - Event uses blocking synchronization</li>
     * <li>{@link #CU_EVENT_DISABLE_TIMING EVENT_DISABLE_TIMING} - Event will not record timing data</li>
     * <li>{@link #CU_EVENT_INTERPROCESS EVENT_INTERPROCESS} - Event is suitable for interprocess use. {@link #CU_EVENT_DISABLE_TIMING EVENT_DISABLE_TIMING} must be set</li>
     * </ul>
     */
    public static final int
        CU_EVENT_DEFAULT        = 0x0,
        CU_EVENT_BLOCKING_SYNC  = 0x1,
        CU_EVENT_DISABLE_TIMING = 0x2,
        CU_EVENT_INTERPROCESS   = 0x4;

    /**
     * Array formats. ({@code CUarray_format})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_AD_FORMAT_UNSIGNED_INT8 AD_FORMAT_UNSIGNED_INT8} - Unsigned 8-bit integers</li>
     * <li>{@link #CU_AD_FORMAT_UNSIGNED_INT16 AD_FORMAT_UNSIGNED_INT16} - Unsigned 16-bit integers</li>
     * <li>{@link #CU_AD_FORMAT_UNSIGNED_INT32 AD_FORMAT_UNSIGNED_INT32} - Unsigned 32-bit integers</li>
     * <li>{@link #CU_AD_FORMAT_SIGNED_INT8 AD_FORMAT_SIGNED_INT8} - Signed 8-bit integers</li>
     * <li>{@link #CU_AD_FORMAT_SIGNED_INT16 AD_FORMAT_SIGNED_INT16} - Signed 16-bit integers</li>
     * <li>{@link #CU_AD_FORMAT_SIGNED_INT32 AD_FORMAT_SIGNED_INT32} - Signed 32-bit integers</li>
     * <li>{@link #CU_AD_FORMAT_HALF AD_FORMAT_HALF} - 16-bit floating point</li>
     * <li>{@link #CU_AD_FORMAT_FLOAT AD_FORMAT_FLOAT} - 32-bit floating point</li>
     * </ul>
     */
    public static final int
        CU_AD_FORMAT_UNSIGNED_INT8  = 0x1,
        CU_AD_FORMAT_UNSIGNED_INT16 = 0x2,
        CU_AD_FORMAT_UNSIGNED_INT32 = 0x3,
        CU_AD_FORMAT_SIGNED_INT8    = 0x8,
        CU_AD_FORMAT_SIGNED_INT16   = 0x9,
        CU_AD_FORMAT_SIGNED_INT32   = 0xA,
        CU_AD_FORMAT_HALF           = 0x10,
        CU_AD_FORMAT_FLOAT          = 0x20;

    /**
     * Texture reference addressing modes. ({@code CUaddress_mode})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_TR_ADDRESS_MODE_WRAP TR_ADDRESS_MODE_WRAP} - Wrapping address mode</li>
     * <li>{@link #CU_TR_ADDRESS_MODE_CLAMP TR_ADDRESS_MODE_CLAMP} - Clamp to edge address mode</li>
     * <li>{@link #CU_TR_ADDRESS_MODE_MIRROR TR_ADDRESS_MODE_MIRROR} - Mirror address mode</li>
     * <li>{@link #CU_TR_ADDRESS_MODE_BORDER TR_ADDRESS_MODE_BORDER} - Border address mode</li>
     * </ul>
     */
    public static final int
        CU_TR_ADDRESS_MODE_WRAP   = 0x0,
        CU_TR_ADDRESS_MODE_CLAMP  = 0x1,
        CU_TR_ADDRESS_MODE_MIRROR = 0x2,
        CU_TR_ADDRESS_MODE_BORDER = 0x3;

    /**
     * Texture reference filtering modes. ({@code CUfilter_mode})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_TR_FILTER_MODE_POINT TR_FILTER_MODE_POINT} - Point filter mode</li>
     * <li>{@link #CU_TR_FILTER_MODE_LINEAR TR_FILTER_MODE_LINEAR} - Linear filter mode</li>
     * </ul>
     */
    public static final int
        CU_TR_FILTER_MODE_POINT  = 0x0,
        CU_TR_FILTER_MODE_LINEAR = 0x1;

    /**
     * Device properties. ({@code CUdevice_attribute})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAX_THREADS_PER_BLOCK DEVICE_ATTRIBUTE_MAX_THREADS_PER_BLOCK} - Maximum number of threads per block</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAX_BLOCK_DIM_X DEVICE_ATTRIBUTE_MAX_BLOCK_DIM_X} - Maximum block dimension X</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAX_BLOCK_DIM_Y DEVICE_ATTRIBUTE_MAX_BLOCK_DIM_Y} - Maximum block dimension Y</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAX_BLOCK_DIM_Z DEVICE_ATTRIBUTE_MAX_BLOCK_DIM_Z} - Maximum block dimension Z</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAX_GRID_DIM_X DEVICE_ATTRIBUTE_MAX_GRID_DIM_X} - Maximum grid dimension X</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAX_GRID_DIM_Y DEVICE_ATTRIBUTE_MAX_GRID_DIM_Y} - Maximum grid dimension Y</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAX_GRID_DIM_Z DEVICE_ATTRIBUTE_MAX_GRID_DIM_Z} - Maximum grid dimension Z</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAX_SHARED_MEMORY_PER_BLOCK DEVICE_ATTRIBUTE_MAX_SHARED_MEMORY_PER_BLOCK} - Maximum shared memory available per block in bytes</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_SHARED_MEMORY_PER_BLOCK DEVICE_ATTRIBUTE_SHARED_MEMORY_PER_BLOCK} - Deprecated, use {@link #CU_DEVICE_ATTRIBUTE_MAX_SHARED_MEMORY_PER_BLOCK DEVICE_ATTRIBUTE_MAX_SHARED_MEMORY_PER_BLOCK}</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_TOTAL_CONSTANT_MEMORY DEVICE_ATTRIBUTE_TOTAL_CONSTANT_MEMORY} - Memory available on device for {@code __constant__} variables in a CUDA C kernel in bytes</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_WARP_SIZE DEVICE_ATTRIBUTE_WARP_SIZE} - Warp size in threads</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAX_PITCH DEVICE_ATTRIBUTE_MAX_PITCH} - Maximum pitch in bytes allowed by memory copies</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAX_REGISTERS_PER_BLOCK DEVICE_ATTRIBUTE_MAX_REGISTERS_PER_BLOCK} - Maximum number of 32-bit registers available per block</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_REGISTERS_PER_BLOCK DEVICE_ATTRIBUTE_REGISTERS_PER_BLOCK} - Deprecated, use {@link #CU_DEVICE_ATTRIBUTE_MAX_REGISTERS_PER_BLOCK DEVICE_ATTRIBUTE_MAX_REGISTERS_PER_BLOCK}</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_CLOCK_RATE DEVICE_ATTRIBUTE_CLOCK_RATE} - Typical clock frequency in kilohertz</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_TEXTURE_ALIGNMENT DEVICE_ATTRIBUTE_TEXTURE_ALIGNMENT} - Alignment requirement for textures</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_GPU_OVERLAP DEVICE_ATTRIBUTE_GPU_OVERLAP} - Device can possibly copy memory and execute a kernel concurrently. Deprecated. Use instead {@link #CU_DEVICE_ATTRIBUTE_ASYNC_ENGINE_COUNT DEVICE_ATTRIBUTE_ASYNC_ENGINE_COUNT}.</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MULTIPROCESSOR_COUNT DEVICE_ATTRIBUTE_MULTIPROCESSOR_COUNT} - Number of multiprocessors on device</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_KERNEL_EXEC_TIMEOUT DEVICE_ATTRIBUTE_KERNEL_EXEC_TIMEOUT} - Specifies whether there is a run time limit on kernels</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_INTEGRATED DEVICE_ATTRIBUTE_INTEGRATED} - Device is integrated with host memory</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_CAN_MAP_HOST_MEMORY DEVICE_ATTRIBUTE_CAN_MAP_HOST_MEMORY} - Device can map host memory into CUDA address space</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_COMPUTE_MODE DEVICE_ATTRIBUTE_COMPUTE_MODE} - Compute mode (See {@code CUcomputemode} for details)</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_WIDTH DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_WIDTH} - Maximum 1D texture width</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_WIDTH DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_WIDTH} - Maximum 2D texture width</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_HEIGHT DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_HEIGHT} - Maximum 2D texture height</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_WIDTH DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_WIDTH} - Maximum 3D texture width</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_HEIGHT DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_HEIGHT} - Maximum 3D texture height</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_DEPTH DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_DEPTH} - Maximum 3D texture depth</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LAYERED_WIDTH DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LAYERED_WIDTH} - Maximum 2D layered texture width</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LAYERED_HEIGHT DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LAYERED_HEIGHT} - Maximum 2D layered texture height</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LAYERED_LAYERS DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LAYERED_LAYERS} - Maximum layers in a 2D layered texture</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_ARRAY_WIDTH DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_ARRAY_WIDTH} - Deprecated, use {@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LAYERED_WIDTH DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LAYERED_WIDTH}</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_ARRAY_HEIGHT DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_ARRAY_HEIGHT} - Deprecated, use {@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LAYERED_HEIGHT DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LAYERED_HEIGHT}</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_ARRAY_NUMSLICES DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_ARRAY_NUMSLICES} - Deprecated, use {@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LAYERED_LAYERS DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LAYERED_LAYERS}</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_SURFACE_ALIGNMENT DEVICE_ATTRIBUTE_SURFACE_ALIGNMENT} - Alignment requirement for surfaces</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_CONCURRENT_KERNELS DEVICE_ATTRIBUTE_CONCURRENT_KERNELS} - Device can possibly execute multiple kernels concurrently</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_ECC_ENABLED DEVICE_ATTRIBUTE_ECC_ENABLED} - Device has ECC support enabled</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_PCI_BUS_ID DEVICE_ATTRIBUTE_PCI_BUS_ID} - PCI bus ID of the device</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_PCI_DEVICE_ID DEVICE_ATTRIBUTE_PCI_DEVICE_ID} - PCI device ID of the device</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_TCC_DRIVER DEVICE_ATTRIBUTE_TCC_DRIVER} - Device is using TCC driver model</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MEMORY_CLOCK_RATE DEVICE_ATTRIBUTE_MEMORY_CLOCK_RATE} - Peak memory clock frequency in kilohertz</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_GLOBAL_MEMORY_BUS_WIDTH DEVICE_ATTRIBUTE_GLOBAL_MEMORY_BUS_WIDTH} - Global memory bus width in bits</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_L2_CACHE_SIZE DEVICE_ATTRIBUTE_L2_CACHE_SIZE} - Size of L2 cache in bytes</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAX_THREADS_PER_MULTIPROCESSOR DEVICE_ATTRIBUTE_MAX_THREADS_PER_MULTIPROCESSOR} - Maximum resident threads per multiprocessor</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_ASYNC_ENGINE_COUNT DEVICE_ATTRIBUTE_ASYNC_ENGINE_COUNT} - Number of asynchronous engines</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_UNIFIED_ADDRESSING DEVICE_ATTRIBUTE_UNIFIED_ADDRESSING} - Device shares a unified address space with the host</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_LAYERED_WIDTH DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_LAYERED_WIDTH} - Maximum 1D layered texture width</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_LAYERED_LAYERS DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_LAYERED_LAYERS} - Maximum layers in a 1D layered texture</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_CAN_TEX2D_GATHER DEVICE_ATTRIBUTE_CAN_TEX2D_GATHER} - Deprecated, do not use.</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_GATHER_WIDTH DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_GATHER_WIDTH} - Maximum 2D texture width if {@link #CUDA_ARRAY3D_TEXTURE_GATHER} is set</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_GATHER_HEIGHT DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_GATHER_HEIGHT} - Maximum 2D texture height if {@link #CUDA_ARRAY3D_TEXTURE_GATHER} is set</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_WIDTH_ALTERNATE DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_WIDTH_ALTERNATE} - Alternate maximum 3D texture width</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_HEIGHT_ALTERNATE DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_HEIGHT_ALTERNATE} - Alternate maximum 3D texture height</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_DEPTH_ALTERNATE DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_DEPTH_ALTERNATE} - Alternate maximum 3D texture depth</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_PCI_DOMAIN_ID DEVICE_ATTRIBUTE_PCI_DOMAIN_ID} - PCI domain ID of the device</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_TEXTURE_PITCH_ALIGNMENT DEVICE_ATTRIBUTE_TEXTURE_PITCH_ALIGNMENT} - Pitch alignment requirement for textures</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURECUBEMAP_WIDTH DEVICE_ATTRIBUTE_MAXIMUM_TEXTURECUBEMAP_WIDTH} - Maximum cubemap texture width/height</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURECUBEMAP_LAYERED_WIDTH DEVICE_ATTRIBUTE_MAXIMUM_TEXTURECUBEMAP_LAYERED_WIDTH} - Maximum cubemap layered texture width/height</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURECUBEMAP_LAYERED_LAYERS DEVICE_ATTRIBUTE_MAXIMUM_TEXTURECUBEMAP_LAYERED_LAYERS} - Maximum layers in a cubemap layered texture</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE1D_WIDTH DEVICE_ATTRIBUTE_MAXIMUM_SURFACE1D_WIDTH} - Maximum 1D surface width</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE2D_WIDTH DEVICE_ATTRIBUTE_MAXIMUM_SURFACE2D_WIDTH} - Maximum 2D surface width</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE2D_HEIGHT DEVICE_ATTRIBUTE_MAXIMUM_SURFACE2D_HEIGHT} - Maximum 2D surface height</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE3D_WIDTH DEVICE_ATTRIBUTE_MAXIMUM_SURFACE3D_WIDTH} - Maximum 3D surface width</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE3D_HEIGHT DEVICE_ATTRIBUTE_MAXIMUM_SURFACE3D_HEIGHT} - Maximum 3D surface height</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE3D_DEPTH DEVICE_ATTRIBUTE_MAXIMUM_SURFACE3D_DEPTH} - Maximum 3D surface depth</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE1D_LAYERED_WIDTH DEVICE_ATTRIBUTE_MAXIMUM_SURFACE1D_LAYERED_WIDTH} - Maximum 1D layered surface width</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE1D_LAYERED_LAYERS DEVICE_ATTRIBUTE_MAXIMUM_SURFACE1D_LAYERED_LAYERS} - Maximum layers in a 1D layered surface</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE2D_LAYERED_WIDTH DEVICE_ATTRIBUTE_MAXIMUM_SURFACE2D_LAYERED_WIDTH} - Maximum 2D layered surface width</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE2D_LAYERED_HEIGHT DEVICE_ATTRIBUTE_MAXIMUM_SURFACE2D_LAYERED_HEIGHT} - Maximum 2D layered surface height</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE2D_LAYERED_LAYERS DEVICE_ATTRIBUTE_MAXIMUM_SURFACE2D_LAYERED_LAYERS} - Maximum layers in a 2D layered surface</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACECUBEMAP_WIDTH DEVICE_ATTRIBUTE_MAXIMUM_SURFACECUBEMAP_WIDTH} - Maximum cubemap surface width</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACECUBEMAP_LAYERED_WIDTH DEVICE_ATTRIBUTE_MAXIMUM_SURFACECUBEMAP_LAYERED_WIDTH} - Maximum cubemap layered surface width</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACECUBEMAP_LAYERED_LAYERS DEVICE_ATTRIBUTE_MAXIMUM_SURFACECUBEMAP_LAYERED_LAYERS} - Maximum layers in a cubemap layered surface</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_LINEAR_WIDTH DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_LINEAR_WIDTH} - Maximum 1D linear texture width</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LINEAR_WIDTH DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LINEAR_WIDTH} - Maximum 2D linear texture width</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LINEAR_HEIGHT DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LINEAR_HEIGHT} - Maximum 2D linear texture height</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LINEAR_PITCH DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LINEAR_PITCH} - Maximum 2D linear texture pitch in bytes</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_MIPMAPPED_WIDTH DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_MIPMAPPED_WIDTH} - Maximum mipmapped 2D texture width</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_MIPMAPPED_HEIGHT DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_MIPMAPPED_HEIGHT} - Maximum mipmapped 2D texture height</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_COMPUTE_CAPABILITY_MAJOR DEVICE_ATTRIBUTE_COMPUTE_CAPABILITY_MAJOR} - Major compute capability version number</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_COMPUTE_CAPABILITY_MINOR DEVICE_ATTRIBUTE_COMPUTE_CAPABILITY_MINOR} - Minor compute capability version number</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_MIPMAPPED_WIDTH DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_MIPMAPPED_WIDTH} - Maximum mipmapped 1D texture width</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_STREAM_PRIORITIES_SUPPORTED DEVICE_ATTRIBUTE_STREAM_PRIORITIES_SUPPORTED} - Device supports stream priorities</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_GLOBAL_L1_CACHE_SUPPORTED DEVICE_ATTRIBUTE_GLOBAL_L1_CACHE_SUPPORTED} - Device supports caching globals in L1</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_LOCAL_L1_CACHE_SUPPORTED DEVICE_ATTRIBUTE_LOCAL_L1_CACHE_SUPPORTED} - Device supports caching locals in L1</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAX_SHARED_MEMORY_PER_MULTIPROCESSOR DEVICE_ATTRIBUTE_MAX_SHARED_MEMORY_PER_MULTIPROCESSOR} - Maximum shared memory available per multiprocessor in bytes</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAX_REGISTERS_PER_MULTIPROCESSOR DEVICE_ATTRIBUTE_MAX_REGISTERS_PER_MULTIPROCESSOR} - Maximum number of 32-bit registers available per multiprocessor</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MANAGED_MEMORY DEVICE_ATTRIBUTE_MANAGED_MEMORY} - Device can allocate managed memory on this system</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MULTI_GPU_BOARD DEVICE_ATTRIBUTE_MULTI_GPU_BOARD} - Device is on a multi-GPU board</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MULTI_GPU_BOARD_GROUP_ID DEVICE_ATTRIBUTE_MULTI_GPU_BOARD_GROUP_ID} - Unique id for a group of devices on the same multi-GPU board</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_HOST_NATIVE_ATOMIC_SUPPORTED DEVICE_ATTRIBUTE_HOST_NATIVE_ATOMIC_SUPPORTED} - 
     * Link between the device and the host supports native atomic operations (this is a placeholder attribute, and is not supported on any current
     * hardware)
     * </li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_SINGLE_TO_DOUBLE_PRECISION_PERF_RATIO DEVICE_ATTRIBUTE_SINGLE_TO_DOUBLE_PRECISION_PERF_RATIO} - Ratio of single precision performance (in floating-point operations per second) to double precision performance</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_PAGEABLE_MEMORY_ACCESS DEVICE_ATTRIBUTE_PAGEABLE_MEMORY_ACCESS} - Device supports coherently accessing pageable memory without calling cudaHostRegister on it</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_CONCURRENT_MANAGED_ACCESS DEVICE_ATTRIBUTE_CONCURRENT_MANAGED_ACCESS} - Device can coherently access managed memory concurrently with the CPU</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_COMPUTE_PREEMPTION_SUPPORTED DEVICE_ATTRIBUTE_COMPUTE_PREEMPTION_SUPPORTED} - Device supports compute preemption.</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_CAN_USE_HOST_POINTER_FOR_REGISTERED_MEM DEVICE_ATTRIBUTE_CAN_USE_HOST_POINTER_FOR_REGISTERED_MEM} - Device can access host registered memory at the same virtual address as the CPU</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_CAN_USE_STREAM_MEM_OPS DEVICE_ATTRIBUTE_CAN_USE_STREAM_MEM_OPS} - {@link CU80#cuStreamBatchMemOp StreamBatchMemOp} and related APIs are supported.</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_CAN_USE_64_BIT_STREAM_MEM_OPS DEVICE_ATTRIBUTE_CAN_USE_64_BIT_STREAM_MEM_OPS} - 64-bit operations are supported in {@link CU80#cuStreamBatchMemOp StreamBatchMemOp} and related APIs.</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_CAN_USE_STREAM_WAIT_VALUE_NOR DEVICE_ATTRIBUTE_CAN_USE_STREAM_WAIT_VALUE_NOR} - {@link CU80#CU_STREAM_WAIT_VALUE_NOR STREAM_WAIT_VALUE_NOR} is supported.</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_COOPERATIVE_LAUNCH DEVICE_ATTRIBUTE_COOPERATIVE_LAUNCH} - Device supports launching cooperative kernels via {@link CU90#cuLaunchCooperativeKernel LaunchCooperativeKernel}</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_COOPERATIVE_MULTI_DEVICE_LAUNCH DEVICE_ATTRIBUTE_COOPERATIVE_MULTI_DEVICE_LAUNCH} - Device can participate in cooperative kernels launched via {@link CU90#cuLaunchCooperativeKernelMultiDevice LaunchCooperativeKernelMultiDevice}</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_MAX_SHARED_MEMORY_PER_BLOCK_OPTIN DEVICE_ATTRIBUTE_MAX_SHARED_MEMORY_PER_BLOCK_OPTIN} - Maximum optin shared memory per block</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_CAN_FLUSH_REMOTE_WRITES DEVICE_ATTRIBUTE_CAN_FLUSH_REMOTE_WRITES} - Both the {@link CU80#CU_STREAM_WAIT_VALUE_FLUSH STREAM_WAIT_VALUE_FLUSH} flag and the {@link CU80#CU_STREAM_MEM_OP_FLUSH_REMOTE_WRITES STREAM_MEM_OP_FLUSH_REMOTE_WRITES} MemOp are supported on the device.</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_HOST_REGISTER_SUPPORTED DEVICE_ATTRIBUTE_HOST_REGISTER_SUPPORTED} - Device supports host memory registration via {@code cudaHostRegister()}.</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_PAGEABLE_MEMORY_ACCESS_USES_HOST_PAGE_TABLES DEVICE_ATTRIBUTE_PAGEABLE_MEMORY_ACCESS_USES_HOST_PAGE_TABLES} - Device accesses pageable memory via the host's page tables.</li>
     * <li>{@link #CU_DEVICE_ATTRIBUTE_DIRECT_MANAGED_MEM_ACCESS_FROM_HOST DEVICE_ATTRIBUTE_DIRECT_MANAGED_MEM_ACCESS_FROM_HOST} - The host can directly access managed memory on the device without migration.</li>
     * </ul>
     */
    public static final int
        CU_DEVICE_ATTRIBUTE_MAX_THREADS_PER_BLOCK                        = 0x1,
        CU_DEVICE_ATTRIBUTE_MAX_BLOCK_DIM_X                              = 0x2,
        CU_DEVICE_ATTRIBUTE_MAX_BLOCK_DIM_Y                              = 0x3,
        CU_DEVICE_ATTRIBUTE_MAX_BLOCK_DIM_Z                              = 0x4,
        CU_DEVICE_ATTRIBUTE_MAX_GRID_DIM_X                               = 0x5,
        CU_DEVICE_ATTRIBUTE_MAX_GRID_DIM_Y                               = 0x6,
        CU_DEVICE_ATTRIBUTE_MAX_GRID_DIM_Z                               = 0x7,
        CU_DEVICE_ATTRIBUTE_MAX_SHARED_MEMORY_PER_BLOCK                  = 0x8,
        CU_DEVICE_ATTRIBUTE_SHARED_MEMORY_PER_BLOCK                      = 0x8,
        CU_DEVICE_ATTRIBUTE_TOTAL_CONSTANT_MEMORY                        = 0x9,
        CU_DEVICE_ATTRIBUTE_WARP_SIZE                                    = 0xA,
        CU_DEVICE_ATTRIBUTE_MAX_PITCH                                    = 0xB,
        CU_DEVICE_ATTRIBUTE_MAX_REGISTERS_PER_BLOCK                      = 0xC,
        CU_DEVICE_ATTRIBUTE_REGISTERS_PER_BLOCK                          = 0xC,
        CU_DEVICE_ATTRIBUTE_CLOCK_RATE                                   = 0xD,
        CU_DEVICE_ATTRIBUTE_TEXTURE_ALIGNMENT                            = 0xE,
        CU_DEVICE_ATTRIBUTE_GPU_OVERLAP                                  = 0xF,
        CU_DEVICE_ATTRIBUTE_MULTIPROCESSOR_COUNT                         = 0x10,
        CU_DEVICE_ATTRIBUTE_KERNEL_EXEC_TIMEOUT                          = 0x11,
        CU_DEVICE_ATTRIBUTE_INTEGRATED                                   = 0x12,
        CU_DEVICE_ATTRIBUTE_CAN_MAP_HOST_MEMORY                          = 0x13,
        CU_DEVICE_ATTRIBUTE_COMPUTE_MODE                                 = 0x14,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_WIDTH                      = 0x15,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_WIDTH                      = 0x16,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_HEIGHT                     = 0x17,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_WIDTH                      = 0x18,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_HEIGHT                     = 0x19,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_DEPTH                      = 0x1A,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LAYERED_WIDTH              = 0x1B,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LAYERED_HEIGHT             = 0x1C,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LAYERED_LAYERS             = 0x1D,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_ARRAY_WIDTH                = 0x1B,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_ARRAY_HEIGHT               = 0x1C,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_ARRAY_NUMSLICES            = 0x1D,
        CU_DEVICE_ATTRIBUTE_SURFACE_ALIGNMENT                            = 0x1E,
        CU_DEVICE_ATTRIBUTE_CONCURRENT_KERNELS                           = 0x1F,
        CU_DEVICE_ATTRIBUTE_ECC_ENABLED                                  = 0x20,
        CU_DEVICE_ATTRIBUTE_PCI_BUS_ID                                   = 0x21,
        CU_DEVICE_ATTRIBUTE_PCI_DEVICE_ID                                = 0x22,
        CU_DEVICE_ATTRIBUTE_TCC_DRIVER                                   = 0x23,
        CU_DEVICE_ATTRIBUTE_MEMORY_CLOCK_RATE                            = 0x24,
        CU_DEVICE_ATTRIBUTE_GLOBAL_MEMORY_BUS_WIDTH                      = 0x25,
        CU_DEVICE_ATTRIBUTE_L2_CACHE_SIZE                                = 0x26,
        CU_DEVICE_ATTRIBUTE_MAX_THREADS_PER_MULTIPROCESSOR               = 0x27,
        CU_DEVICE_ATTRIBUTE_ASYNC_ENGINE_COUNT                           = 0x28,
        CU_DEVICE_ATTRIBUTE_UNIFIED_ADDRESSING                           = 0x29,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_LAYERED_WIDTH              = 0x2A,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_LAYERED_LAYERS             = 0x2B,
        CU_DEVICE_ATTRIBUTE_CAN_TEX2D_GATHER                             = 0x2C,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_GATHER_WIDTH               = 0x2D,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_GATHER_HEIGHT              = 0x2E,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_WIDTH_ALTERNATE            = 0x2F,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_HEIGHT_ALTERNATE           = 0x30,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE3D_DEPTH_ALTERNATE            = 0x31,
        CU_DEVICE_ATTRIBUTE_PCI_DOMAIN_ID                                = 0x32,
        CU_DEVICE_ATTRIBUTE_TEXTURE_PITCH_ALIGNMENT                      = 0x33,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURECUBEMAP_WIDTH                 = 0x34,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURECUBEMAP_LAYERED_WIDTH         = 0x35,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURECUBEMAP_LAYERED_LAYERS        = 0x36,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE1D_WIDTH                      = 0x37,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE2D_WIDTH                      = 0x38,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE2D_HEIGHT                     = 0x39,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE3D_WIDTH                      = 0x3A,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE3D_HEIGHT                     = 0x3B,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE3D_DEPTH                      = 0x3C,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE1D_LAYERED_WIDTH              = 0x3D,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE1D_LAYERED_LAYERS             = 0x3E,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE2D_LAYERED_WIDTH              = 0x3F,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE2D_LAYERED_HEIGHT             = 0x40,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACE2D_LAYERED_LAYERS             = 0x41,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACECUBEMAP_WIDTH                 = 0x42,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACECUBEMAP_LAYERED_WIDTH         = 0x43,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_SURFACECUBEMAP_LAYERED_LAYERS        = 0x44,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_LINEAR_WIDTH               = 0x45,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LINEAR_WIDTH               = 0x46,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LINEAR_HEIGHT              = 0x47,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_LINEAR_PITCH               = 0x48,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_MIPMAPPED_WIDTH            = 0x49,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE2D_MIPMAPPED_HEIGHT           = 0x4A,
        CU_DEVICE_ATTRIBUTE_COMPUTE_CAPABILITY_MAJOR                     = 0x4B,
        CU_DEVICE_ATTRIBUTE_COMPUTE_CAPABILITY_MINOR                     = 0x4C,
        CU_DEVICE_ATTRIBUTE_MAXIMUM_TEXTURE1D_MIPMAPPED_WIDTH            = 0x4D,
        CU_DEVICE_ATTRIBUTE_STREAM_PRIORITIES_SUPPORTED                  = 0x4E,
        CU_DEVICE_ATTRIBUTE_GLOBAL_L1_CACHE_SUPPORTED                    = 0x4F,
        CU_DEVICE_ATTRIBUTE_LOCAL_L1_CACHE_SUPPORTED                     = 0x50,
        CU_DEVICE_ATTRIBUTE_MAX_SHARED_MEMORY_PER_MULTIPROCESSOR         = 0x51,
        CU_DEVICE_ATTRIBUTE_MAX_REGISTERS_PER_MULTIPROCESSOR             = 0x52,
        CU_DEVICE_ATTRIBUTE_MANAGED_MEMORY                               = 0x53,
        CU_DEVICE_ATTRIBUTE_MULTI_GPU_BOARD                              = 0x54,
        CU_DEVICE_ATTRIBUTE_MULTI_GPU_BOARD_GROUP_ID                     = 0x55,
        CU_DEVICE_ATTRIBUTE_HOST_NATIVE_ATOMIC_SUPPORTED                 = 0x56,
        CU_DEVICE_ATTRIBUTE_SINGLE_TO_DOUBLE_PRECISION_PERF_RATIO        = 0x57,
        CU_DEVICE_ATTRIBUTE_PAGEABLE_MEMORY_ACCESS                       = 0x58,
        CU_DEVICE_ATTRIBUTE_CONCURRENT_MANAGED_ACCESS                    = 0x59,
        CU_DEVICE_ATTRIBUTE_COMPUTE_PREEMPTION_SUPPORTED                 = 0x5A,
        CU_DEVICE_ATTRIBUTE_CAN_USE_HOST_POINTER_FOR_REGISTERED_MEM      = 0x5B,
        CU_DEVICE_ATTRIBUTE_CAN_USE_STREAM_MEM_OPS                       = 0x5C,
        CU_DEVICE_ATTRIBUTE_CAN_USE_64_BIT_STREAM_MEM_OPS                = 0x5D,
        CU_DEVICE_ATTRIBUTE_CAN_USE_STREAM_WAIT_VALUE_NOR                = 0x5E,
        CU_DEVICE_ATTRIBUTE_COOPERATIVE_LAUNCH                           = 0x5F,
        CU_DEVICE_ATTRIBUTE_COOPERATIVE_MULTI_DEVICE_LAUNCH              = 0x60,
        CU_DEVICE_ATTRIBUTE_MAX_SHARED_MEMORY_PER_BLOCK_OPTIN            = 0x61,
        CU_DEVICE_ATTRIBUTE_CAN_FLUSH_REMOTE_WRITES                      = 0x62,
        CU_DEVICE_ATTRIBUTE_HOST_REGISTER_SUPPORTED                      = 0x63,
        CU_DEVICE_ATTRIBUTE_PAGEABLE_MEMORY_ACCESS_USES_HOST_PAGE_TABLES = 0x64,
        CU_DEVICE_ATTRIBUTE_DIRECT_MANAGED_MEM_ACCESS_FROM_HOST          = 0x65;

    /**
     * Function properties. ({@code CUfunction_attribute})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_FUNC_ATTRIBUTE_MAX_THREADS_PER_BLOCK FUNC_ATTRIBUTE_MAX_THREADS_PER_BLOCK} - 
     * The maximum number of threads per block, beyond which a launch of the function would fail. This number depends on both the function and the device
     * on which the function is currently loaded.
     * </li>
     * <li>{@link #CU_FUNC_ATTRIBUTE_SHARED_SIZE_BYTES FUNC_ATTRIBUTE_SHARED_SIZE_BYTES} - 
     * The size in bytes of statically-allocated shared memory required by this function. This does not include dynamically-allocated shared memory
     * requested by the user at runtime.
     * </li>
     * <li>{@link #CU_FUNC_ATTRIBUTE_CONST_SIZE_BYTES FUNC_ATTRIBUTE_CONST_SIZE_BYTES} - The size in bytes of user-allocated constant memory required by this function.</li>
     * <li>{@link #CU_FUNC_ATTRIBUTE_LOCAL_SIZE_BYTES FUNC_ATTRIBUTE_LOCAL_SIZE_BYTES} - The size in bytes of local memory used by each thread of this function.</li>
     * <li>{@link #CU_FUNC_ATTRIBUTE_NUM_REGS FUNC_ATTRIBUTE_NUM_REGS} - The number of registers used by each thread of this function.</li>
     * <li>{@link #CU_FUNC_ATTRIBUTE_PTX_VERSION FUNC_ATTRIBUTE_PTX_VERSION} - 
     * The PTX virtual architecture version for which the function was compiled.
     * 
     * <p>This value is the major PTX {@code version * 10 + the minor PTX version}, so a PTX version 1.3 function would return the value 13. Note that this
     * may return the undefined value of 0 for cubins compiled prior to CUDA 3.0.</p>
     * </li>
     * <li>{@link #CU_FUNC_ATTRIBUTE_BINARY_VERSION FUNC_ATTRIBUTE_BINARY_VERSION} - 
     * The binary architecture version for which the function was compiled.
     * 
     * <p>This value is the {@code major binary version * 10 + the minor binary version}, so a binary version 1.3 function would return the value 13. Note
     * that this will return a value of 10 for legacy cubins that do not have a properly-encoded binary architecture version.</p>
     * </li>
     * <li>{@link #CU_FUNC_ATTRIBUTE_CACHE_MODE_CA FUNC_ATTRIBUTE_CACHE_MODE_CA} - The attribute to indicate whether the function has been compiled with user specified option {@code "-Xptxas --dlcm=ca"} set.</li>
     * <li>{@link #CU_FUNC_ATTRIBUTE_MAX_DYNAMIC_SHARED_SIZE_BYTES FUNC_ATTRIBUTE_MAX_DYNAMIC_SHARED_SIZE_BYTES} - 
     * The maximum size in bytes of dynamically-allocated shared memory that can be used by this function.
     * 
     * <p>If the user-specified dynamic shared memory size is larger than this value, the launch will fail.</p>
     * </li>
     * <li>{@link #CU_FUNC_ATTRIBUTE_PREFERRED_SHARED_MEMORY_CARVEOUT FUNC_ATTRIBUTE_PREFERRED_SHARED_MEMORY_CARVEOUT} - 
     * On devices where the L1 cache and shared memory use the same hardware resources, this sets the shared memory carveout preference, in percent of the total shared memory. Refer to {@link #CU_DEVICE_ATTRIBUTE_MAX_SHARED_MEMORY_PER_MULTIPROCESSOR DEVICE_ATTRIBUTE_MAX_SHARED_MEMORY_PER_MULTIPROCESSOR}.
     * 
     * <p>This is only a hint, and the driver can choose a different ratio if required to execute the function.</p>
     * </li>
     * </ul>
     */
    public static final int
        CU_FUNC_ATTRIBUTE_MAX_THREADS_PER_BLOCK            = 0x0,
        CU_FUNC_ATTRIBUTE_SHARED_SIZE_BYTES                = 0x1,
        CU_FUNC_ATTRIBUTE_CONST_SIZE_BYTES                 = 0x2,
        CU_FUNC_ATTRIBUTE_LOCAL_SIZE_BYTES                 = 0x3,
        CU_FUNC_ATTRIBUTE_NUM_REGS                         = 0x4,
        CU_FUNC_ATTRIBUTE_PTX_VERSION                      = 0x5,
        CU_FUNC_ATTRIBUTE_BINARY_VERSION                   = 0x6,
        CU_FUNC_ATTRIBUTE_CACHE_MODE_CA                    = 0x7,
        CU_FUNC_ATTRIBUTE_MAX_DYNAMIC_SHARED_SIZE_BYTES    = 0x8,
        CU_FUNC_ATTRIBUTE_PREFERRED_SHARED_MEMORY_CARVEOUT = 0x9;

    /**
     * Function cache configurations. ({@code CUfunc_cache})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_FUNC_CACHE_PREFER_NONE FUNC_CACHE_PREFER_NONE} - no preference for shared memory or L1 (default)</li>
     * <li>{@link #CU_FUNC_CACHE_PREFER_SHARED FUNC_CACHE_PREFER_SHARED} - prefer larger shared memory and smaller L1 cache</li>
     * <li>{@link #CU_FUNC_CACHE_PREFER_L1 FUNC_CACHE_PREFER_L1} - prefer larger L1 cache and smaller shared memory</li>
     * <li>{@link #CU_FUNC_CACHE_PREFER_EQUAL FUNC_CACHE_PREFER_EQUAL} - prefer equal sized L1 cache and shared memory</li>
     * </ul>
     */
    public static final int
        CU_FUNC_CACHE_PREFER_NONE   = 0x0,
        CU_FUNC_CACHE_PREFER_SHARED = 0x1,
        CU_FUNC_CACHE_PREFER_L1     = 0x2,
        CU_FUNC_CACHE_PREFER_EQUAL  = 0x3;

    /**
     * Memory types. ({@code CUmemorytype})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_MEMORYTYPE_HOST MEMORYTYPE_HOST} - Host memory</li>
     * <li>{@link #CU_MEMORYTYPE_DEVICE MEMORYTYPE_DEVICE} - Device memory</li>
     * <li>{@link #CU_MEMORYTYPE_ARRAY MEMORYTYPE_ARRAY} - Array memory</li>
     * <li>{@link #CU_MEMORYTYPE_UNIFIED MEMORYTYPE_UNIFIED} - Unified device or host memory</li>
     * </ul>
     */
    public static final int
        CU_MEMORYTYPE_HOST    = 0x1,
        CU_MEMORYTYPE_DEVICE  = 0x2,
        CU_MEMORYTYPE_ARRAY   = 0x3,
        CU_MEMORYTYPE_UNIFIED = 0x4;

    /**
     * Compute Modes. ({@code CUcomputemode})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_COMPUTEMODE_DEFAULT COMPUTEMODE_DEFAULT} - Default compute mode (Multiple contexts allowed per device)</li>
     * <li>{@link #CU_COMPUTEMODE_PROHIBITED COMPUTEMODE_PROHIBITED} - Compute-prohibited mode (No contexts can be created on this device at this time)</li>
     * <li>{@link #CU_COMPUTEMODE_EXCLUSIVE_PROCESS COMPUTEMODE_EXCLUSIVE_PROCESS} - Compute-exclusive-process mode (Only one context used by a single process can be present on this device at a time)</li>
     * </ul>
     */
    public static final int
        CU_COMPUTEMODE_DEFAULT           = 0x0,
        CU_COMPUTEMODE_PROHIBITED        = 0x2,
        CU_COMPUTEMODE_EXCLUSIVE_PROCESS = 0x3;

    /**
     * Online compiler and linker options. ({@code CUjit_option})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_JIT_MAX_REGISTERS JIT_MAX_REGISTERS} - 
     * Max number of registers that a thread may use.
     * 
     * <p>Option type: {@code unsigned int}. Applies to: compiler only</p>
     * </li>
     * <li>{@link #CU_JIT_THREADS_PER_BLOCK JIT_THREADS_PER_BLOCK} - 
     * IN: Specifies minimum number of threads per block to target compilation for
     * 
     * <p>OUT: Returns the number of threads the compiler actually targeted.</p>
     * 
     * <p>This restricts the resource utilization fo the compiler (e.g. max registers) such that a block with the given number of threads should be able to
     * launch based on register limitations. Note, this option does not currently take into account any other resource limitations, such as shared memory
     * utilization.</p>
     * 
     * <p>Cannot be combined with {@link #CU_JIT_TARGET JIT_TARGET}. Option type: {@code unsigned int}. Applies to: compiler only</p>
     * </li>
     * <li>{@link #CU_JIT_WALL_TIME JIT_WALL_TIME} - 
     * Overwrites the option value with the total wall clock time, in milliseconds, spent in the compiler and linker.
     * 
     * <p>Option type: {@code float}. Applies to: compiler and linker</p>
     * </li>
     * <li>{@link #CU_JIT_INFO_LOG_BUFFER JIT_INFO_LOG_BUFFER} - 
     * Pointer to a buffer in which to print any log messages that are informational in nature (the buffer size is specified via option
     * {@link #CU_JIT_INFO_LOG_BUFFER_SIZE_BYTES JIT_INFO_LOG_BUFFER_SIZE_BYTES}).
     * 
     * <p>Option type: {@code char *}. Applies to: compiler and linker</p>
     * </li>
     * <li>{@link #CU_JIT_INFO_LOG_BUFFER_SIZE_BYTES JIT_INFO_LOG_BUFFER_SIZE_BYTES} - 
     * IN: Log buffer size in bytes. Log messages will be capped at this size (including null terminator).
     * 
     * <p>OUT: Amount of log buffer filled with messages.</p>
     * 
     * <p>Option type: {@code unsigned int}. Applies to: compiler and linker</p>
     * </li>
     * <li>{@link #CU_JIT_ERROR_LOG_BUFFER JIT_ERROR_LOG_BUFFER} - 
     * Pointer to a buffer in which to print any log messages that reflect errors (the buffer size is specified via option
     * {@link #CU_JIT_ERROR_LOG_BUFFER_SIZE_BYTES JIT_ERROR_LOG_BUFFER_SIZE_BYTES}).
     * 
     * <p>Option type: {@code char *}. Applies to: compiler and linker</p>
     * </li>
     * <li>{@link #CU_JIT_ERROR_LOG_BUFFER_SIZE_BYTES JIT_ERROR_LOG_BUFFER_SIZE_BYTES} - 
     * IN: Log buffer size in bytes. Log messages will be capped at this size (including null terminator).
     * 
     * <p>OUT: Amount of log buffer filled with messages.</p>
     * 
     * <p>Option type: {@code unsigned int}. Applies to: compiler and linker</p>
     * </li>
     * <li>{@link #CU_JIT_OPTIMIZATION_LEVEL JIT_OPTIMIZATION_LEVEL} - 
     * Level of optimizations to apply to generated code (0 - 4), with 4 being the default and highest level of optimizations.
     * 
     * <p>Option type: {@code unsigned int}. Applies to: compiler only</p>
     * </li>
     * <li>{@link #CU_JIT_TARGET_FROM_CUCONTEXT JIT_TARGET_FROM_CUCONTEXT} - 
     * No option value required. Determines the target based on the current attached context (default).
     * 
     * <p>Option type: No option value needed. Applies to: compiler and linker</p>
     * </li>
     * <li>{@link #CU_JIT_TARGET JIT_TARGET} - 
     * Target is chosen based on supplied {@code CUjit_target}. Cannot be combined with {@link #CU_JIT_THREADS_PER_BLOCK JIT_THREADS_PER_BLOCK}.
     * 
     * <p>Option type: {@code unsigned int} for enumerated type {@code CUjit_target}. Applies to: compiler and linker</p>
     * </li>
     * <li>{@link #CU_JIT_FALLBACK_STRATEGY JIT_FALLBACK_STRATEGY} - 
     * Specifies choice of fallback strategy if matching cubin is not found.
     * 
     * <p>Choice is based on supplied {@code CUjit_fallback}. This option cannot be used with {@code cuLink*} APIs as the linker requires exact matches.</p>
     * 
     * <p>Option type: {@code unsigned int} for enumerated type {@code CUjit_fallback}. Applies to: compiler only</p>
     * </li>
     * <li>{@link #CU_JIT_GENERATE_DEBUG_INFO JIT_GENERATE_DEBUG_INFO} - 
     * Specifies whether to create debug information in output (-g) (0: false, default).
     * 
     * <p>Option type: {@code int}. Applies to: compiler and linker</p>
     * </li>
     * <li>{@link #CU_JIT_LOG_VERBOSE JIT_LOG_VERBOSE} - 
     * Generate verbose log messages (0: false, default).
     * 
     * <p>Option type: {@code int}. Applies to: compiler and linker</p>
     * </li>
     * <li>{@link #CU_JIT_GENERATE_LINE_INFO JIT_GENERATE_LINE_INFO} - 
     * Generate line number information (-lineinfo) (0: false, default).
     * 
     * <p>Option type: {@code int}. Applies to: compiler only</p>
     * </li>
     * <li>{@link #CU_JIT_CACHE_MODE JIT_CACHE_MODE} - 
     * Specifies whether to enable caching explicitly (-dlcm). Choice is based on supplied {@code CUjit_cacheMode_enum}.
     * 
     * <p>Option type: {@code unsigned int} for enumerated type {@code CUjit_cacheMode_enum}. Applies to: compiler only</p>
     * </li>
     * <li>{@link #CU_JIT_NEW_SM3X_OPT JIT_NEW_SM3X_OPT} - Used for internal purposes only, in this version of CUDA.</li>
     * <li>{@link #CU_JIT_FAST_COMPILE JIT_FAST_COMPILE} - Used for internal purposes only, in this version of CUDA.</li>
     * <li>{@link #CU_JIT_GLOBAL_SYMBOL_NAMES JIT_GLOBAL_SYMBOL_NAMES} - 
     * Array of device symbol names that will be relocated to the corresponing host addresses stored in {@link #CU_JIT_GLOBAL_SYMBOL_ADDRESSES JIT_GLOBAL_SYMBOL_ADDRESSES}.
     * 
     * <p>Must contain {@link #CU_JIT_GLOBAL_SYMBOL_COUNT JIT_GLOBAL_SYMBOL_COUNT} entries. When loding a device module, driver will relocate all encountered unresolved symbols to the host
     * addresses. It is only allowed to register symbols that correspond to unresolved global variables. It is illegal to register the same device symbol
     * at multiple addresses.</p>
     * 
     * <p>Option type: {@code const char **}. Applies to: dynamic linker only</p>
     * </li>
     * <li>{@link #CU_JIT_GLOBAL_SYMBOL_ADDRESSES JIT_GLOBAL_SYMBOL_ADDRESSES} - 
     * Array of host addresses that will be used to relocate corresponding device symbols stored in {@link #CU_JIT_GLOBAL_SYMBOL_NAMES JIT_GLOBAL_SYMBOL_NAMES}.
     * 
     * <p>Must contain {@link #CU_JIT_GLOBAL_SYMBOL_COUNT JIT_GLOBAL_SYMBOL_COUNT} entries.</p>
     * 
     * <p>Option type: {@code void **}. Applies to: dynamic linker only</p>
     * </li>
     * <li>{@link #CU_JIT_GLOBAL_SYMBOL_COUNT JIT_GLOBAL_SYMBOL_COUNT} - 
     * Number of entries in {@link #CU_JIT_GLOBAL_SYMBOL_NAMES JIT_GLOBAL_SYMBOL_NAMES} and {@link #CU_JIT_GLOBAL_SYMBOL_ADDRESSES JIT_GLOBAL_SYMBOL_ADDRESSES} arrays.
     * 
     * <p>Option type: {@code unsigned int}. Applies to: dynamic linker only</p>
     * </li>
     * </ul>
     */
    public static final int
        CU_JIT_MAX_REGISTERS               = 0x0,
        CU_JIT_THREADS_PER_BLOCK           = 0x1,
        CU_JIT_WALL_TIME                   = 0x2,
        CU_JIT_INFO_LOG_BUFFER             = 0x3,
        CU_JIT_INFO_LOG_BUFFER_SIZE_BYTES  = 0x4,
        CU_JIT_ERROR_LOG_BUFFER            = 0x5,
        CU_JIT_ERROR_LOG_BUFFER_SIZE_BYTES = 0x6,
        CU_JIT_OPTIMIZATION_LEVEL          = 0x7,
        CU_JIT_TARGET_FROM_CUCONTEXT       = 0x8,
        CU_JIT_TARGET                      = 0x9,
        CU_JIT_FALLBACK_STRATEGY           = 0xA,
        CU_JIT_GENERATE_DEBUG_INFO         = 0xB,
        CU_JIT_LOG_VERBOSE                 = 0xC,
        CU_JIT_GENERATE_LINE_INFO          = 0xD,
        CU_JIT_CACHE_MODE                  = 0xE,
        CU_JIT_NEW_SM3X_OPT                = 0xF,
        CU_JIT_FAST_COMPILE                = 0x10,
        CU_JIT_GLOBAL_SYMBOL_NAMES         = 0x11,
        CU_JIT_GLOBAL_SYMBOL_ADDRESSES     = 0x12,
        CU_JIT_GLOBAL_SYMBOL_COUNT         = 0x13;

    /**
     * Online compilation targets. ({@code CUjit_target})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_TARGET_COMPUTE_20 TARGET_COMPUTE_20} - Compute device class 2.0</li>
     * <li>{@link #CU_TARGET_COMPUTE_21 TARGET_COMPUTE_21} - Compute device class 2.1</li>
     * <li>{@link #CU_TARGET_COMPUTE_30 TARGET_COMPUTE_30} - Compute device class 3.0</li>
     * <li>{@link #CU_TARGET_COMPUTE_32 TARGET_COMPUTE_32} - Compute device class 3.2</li>
     * <li>{@link #CU_TARGET_COMPUTE_35 TARGET_COMPUTE_35} - Compute device class 3.5</li>
     * <li>{@link #CU_TARGET_COMPUTE_37 TARGET_COMPUTE_37} - Compute device class 3.7</li>
     * <li>{@link #CU_TARGET_COMPUTE_50 TARGET_COMPUTE_50} - Compute device class 5.0</li>
     * <li>{@link #CU_TARGET_COMPUTE_52 TARGET_COMPUTE_52} - Compute device class 5.2</li>
     * <li>{@link #CU_TARGET_COMPUTE_53 TARGET_COMPUTE_53} - Compute device class 5.3</li>
     * <li>{@link #CU_TARGET_COMPUTE_60 TARGET_COMPUTE_60} - Compute device class 6.0.</li>
     * <li>{@link #CU_TARGET_COMPUTE_61 TARGET_COMPUTE_61} - Compute device class 6.1.</li>
     * <li>{@link #CU_TARGET_COMPUTE_62 TARGET_COMPUTE_62} - Compute device class 6.2.</li>
     * <li>{@link #CU_TARGET_COMPUTE_70 TARGET_COMPUTE_70} - Compute device class 7.0.</li>
     * <li>{@link #CU_TARGET_COMPUTE_72 TARGET_COMPUTE_72} - Compute device class 7.2.</li>
     * <li>{@link #CU_TARGET_COMPUTE_75 TARGET_COMPUTE_75} - Compute device class 7.5.</li>
     * </ul>
     */
    public static final int
        CU_TARGET_COMPUTE_20 = 0x14,
        CU_TARGET_COMPUTE_21 = 0x15,
        CU_TARGET_COMPUTE_30 = 0x1E,
        CU_TARGET_COMPUTE_32 = 0x20,
        CU_TARGET_COMPUTE_35 = 0x23,
        CU_TARGET_COMPUTE_37 = 0x25,
        CU_TARGET_COMPUTE_50 = 0x32,
        CU_TARGET_COMPUTE_52 = 0x34,
        CU_TARGET_COMPUTE_53 = 0x35,
        CU_TARGET_COMPUTE_60 = 0x3C,
        CU_TARGET_COMPUTE_61 = 0x3D,
        CU_TARGET_COMPUTE_62 = 0x3E,
        CU_TARGET_COMPUTE_70 = 0x46,
        CU_TARGET_COMPUTE_72 = 0x48,
        CU_TARGET_COMPUTE_75 = 0x4B;

    /**
     * Cubin matching fallback strategies. ({@code CUjit_fallback})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_PREFER_PTX PREFER_PTX} - Prefer to compile ptx if exact binary match not found</li>
     * <li>{@link #CU_PREFER_BINARY PREFER_BINARY} - Prefer to fall back to compatible binary code if exact match not found</li>
     * </ul>
     */
    public static final int
        CU_PREFER_PTX    = 0x0,
        CU_PREFER_BINARY = 0x1;

    /**
     * Caching modes for {@code dlcm}. ({@code CUjit_cacheMode})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_JIT_CACHE_OPTION_NONE JIT_CACHE_OPTION_NONE} - Compile with no -dlcm flag specified</li>
     * <li>{@link #CU_JIT_CACHE_OPTION_CG JIT_CACHE_OPTION_CG} - Compile with L1 cache disabled</li>
     * <li>{@link #CU_JIT_CACHE_OPTION_CA JIT_CACHE_OPTION_CA} - Compile with L1 cache enabled</li>
     * </ul>
     */
    public static final int
        CU_JIT_CACHE_OPTION_NONE = 0x0,
        CU_JIT_CACHE_OPTION_CG   = 0x1,
        CU_JIT_CACHE_OPTION_CA   = 0x2;

    /**
     * Flags to register a graphics resource. ({@code CUgraphicsRegisterFlags})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_GRAPHICS_REGISTER_FLAGS_NONE GRAPHICS_REGISTER_FLAGS_NONE}</li>
     * <li>{@link #CU_GRAPHICS_REGISTER_FLAGS_READ_ONLY GRAPHICS_REGISTER_FLAGS_READ_ONLY}</li>
     * <li>{@link #CU_GRAPHICS_REGISTER_FLAGS_WRITE_DISCARD GRAPHICS_REGISTER_FLAGS_WRITE_DISCARD}</li>
     * <li>{@link #CU_GRAPHICS_REGISTER_FLAGS_SURFACE_LDST GRAPHICS_REGISTER_FLAGS_SURFACE_LDST}</li>
     * <li>{@link #CU_GRAPHICS_REGISTER_FLAGS_TEXTURE_GATHER GRAPHICS_REGISTER_FLAGS_TEXTURE_GATHER}</li>
     * </ul>
     */
    public static final int
        CU_GRAPHICS_REGISTER_FLAGS_NONE           = 0x0,
        CU_GRAPHICS_REGISTER_FLAGS_READ_ONLY      = 0x1,
        CU_GRAPHICS_REGISTER_FLAGS_WRITE_DISCARD  = 0x2,
        CU_GRAPHICS_REGISTER_FLAGS_SURFACE_LDST   = 0x4,
        CU_GRAPHICS_REGISTER_FLAGS_TEXTURE_GATHER = 0x8;

    /**
     * Flags for mapping and unmapping interop resources. ({@code CUgraphicsMapResourceFlags})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_GRAPHICS_MAP_RESOURCE_FLAGS_NONE GRAPHICS_MAP_RESOURCE_FLAGS_NONE}</li>
     * <li>{@link #CU_GRAPHICS_MAP_RESOURCE_FLAGS_READ_ONLY GRAPHICS_MAP_RESOURCE_FLAGS_READ_ONLY}</li>
     * <li>{@link #CU_GRAPHICS_MAP_RESOURCE_FLAGS_WRITE_DISCARD GRAPHICS_MAP_RESOURCE_FLAGS_WRITE_DISCARD}</li>
     * </ul>
     */
    public static final int
        CU_GRAPHICS_MAP_RESOURCE_FLAGS_NONE          = 0x0,
        CU_GRAPHICS_MAP_RESOURCE_FLAGS_READ_ONLY     = 0x1,
        CU_GRAPHICS_MAP_RESOURCE_FLAGS_WRITE_DISCARD = 0x2;

    /**
     * Array indices for cube faces. ({@code CUarray_cubemap_face})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_CUBEMAP_FACE_POSITIVE_X CUBEMAP_FACE_POSITIVE_X} - Positive X face of cubemap</li>
     * <li>{@link #CU_CUBEMAP_FACE_NEGATIVE_X CUBEMAP_FACE_NEGATIVE_X} - Negative X face of cubemap</li>
     * <li>{@link #CU_CUBEMAP_FACE_POSITIVE_Y CUBEMAP_FACE_POSITIVE_Y} - Positive Y face of cubemap</li>
     * <li>{@link #CU_CUBEMAP_FACE_NEGATIVE_Y CUBEMAP_FACE_NEGATIVE_Y} - Negative Y face of cubemap</li>
     * <li>{@link #CU_CUBEMAP_FACE_POSITIVE_Z CUBEMAP_FACE_POSITIVE_Z} - Positive Z face of cubemap</li>
     * <li>{@link #CU_CUBEMAP_FACE_NEGATIVE_Z CUBEMAP_FACE_NEGATIVE_Z} - Negative Z face of cubemap</li>
     * </ul>
     */
    public static final int
        CU_CUBEMAP_FACE_POSITIVE_X = 0x0,
        CU_CUBEMAP_FACE_NEGATIVE_X = 0x1,
        CU_CUBEMAP_FACE_POSITIVE_Y = 0x2,
        CU_CUBEMAP_FACE_NEGATIVE_Y = 0x3,
        CU_CUBEMAP_FACE_POSITIVE_Z = 0x4,
        CU_CUBEMAP_FACE_NEGATIVE_Z = 0x5;

    /**
     * Limits. ({@code CUlimit})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_LIMIT_STACK_SIZE LIMIT_STACK_SIZE} - GPU thread stack size</li>
     * <li>{@link #CU_LIMIT_PRINTF_FIFO_SIZE LIMIT_PRINTF_FIFO_SIZE} - GPU printf FIFO size</li>
     * <li>{@link #CU_LIMIT_MALLOC_HEAP_SIZE LIMIT_MALLOC_HEAP_SIZE} - GPU malloc heap size</li>
     * <li>{@link #CU_LIMIT_DEV_RUNTIME_SYNC_DEPTH LIMIT_DEV_RUNTIME_SYNC_DEPTH} - GPU device runtime launch synchronize depth</li>
     * <li>{@link #CU_LIMIT_DEV_RUNTIME_PENDING_LAUNCH_COUNT LIMIT_DEV_RUNTIME_PENDING_LAUNCH_COUNT} - GPU device runtime pending launch count</li>
     * <li>{@link #CU_LIMIT_MAX_L2_FETCH_GRANULARITY LIMIT_MAX_L2_FETCH_GRANULARITY} - A value between 0 and 128 that indicates the maximum fetch granularity of L2 (in Bytes). This is a hint</li>
     * </ul>
     */
    public static final int
        CU_LIMIT_STACK_SIZE                       = 0x0,
        CU_LIMIT_PRINTF_FIFO_SIZE                 = 0x1,
        CU_LIMIT_MALLOC_HEAP_SIZE                 = 0x2,
        CU_LIMIT_DEV_RUNTIME_SYNC_DEPTH           = 0x3,
        CU_LIMIT_DEV_RUNTIME_PENDING_LAUNCH_COUNT = 0x4,
        CU_LIMIT_MAX_L2_FETCH_GRANULARITY         = 0x5;

    /**
     * Error codes. ({@code CUresult})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CUDA_SUCCESS CUDA_SUCCESS} - 
     * The API call returned with no errors.
     * 
     * <p>In the case of query calls, this also means that the operation being queried is complete (see {@link #cuEventQuery EventQuery} and {@link #cuStreamQuery StreamQuery}).</p>
     * </li>
     * <li>{@link #CUDA_ERROR_INVALID_VALUE CUDA_ERROR_INVALID_VALUE} - This indicates that one or more of the parameters passed to the API call is not within an acceptable range of values.</li>
     * <li>{@link #CUDA_ERROR_OUT_OF_MEMORY CUDA_ERROR_OUT_OF_MEMORY} - The API call failed because it was unable to allocate enough memory to perform the requested operation.</li>
     * <li>{@link #CUDA_ERROR_NOT_INITIALIZED CUDA_ERROR_NOT_INITIALIZED} - This indicates that the CUDA driver has not been initialized with {@link #cuInit Init} or that initialization has failed.</li>
     * <li>{@link #CUDA_ERROR_DEINITIALIZED CUDA_ERROR_DEINITIALIZED} - This indicates that the CUDA driver is in the process of shutting down.</li>
     * <li>{@link #CUDA_ERROR_PROFILER_DISABLED CUDA_ERROR_PROFILER_DISABLED} - 
     * This indicates profiler is not initialized for this run. This can happen when the application is running with external profiling tools like visual
     * profiler.
     * </li>
     * <li>{@link #CUDA_ERROR_PROFILER_NOT_INITIALIZED CUDA_ERROR_PROFILER_NOT_INITIALIZED} - 
     * This error return is deprecated as of CUDA 5.0.
     * 
     * <p>It is no longer an error to attempt to enable/disable the profiling via {@link CUDAProfiler#cuProfilerStart ProfilerStart} or {@link CUDAProfiler#cuProfilerStop ProfilerStop} without initialization.</p>
     * </li>
     * <li>{@link #CUDA_ERROR_PROFILER_ALREADY_STARTED CUDA_ERROR_PROFILER_ALREADY_STARTED} - 
     * This error return is deprecated as of CUDA 5.0.
     * 
     * <p>It is no longer an error to call {@link CUDAProfiler#cuProfilerStart ProfilerStart} when profiling is already enabled.</p>
     * </li>
     * <li>{@link #CUDA_ERROR_PROFILER_ALREADY_STOPPED CUDA_ERROR_PROFILER_ALREADY_STOPPED} - 
     * This error return is deprecated as of CUDA 5.0.
     * 
     * <p>It is no longer an error to call {@link CUDAProfiler#cuProfilerStop ProfilerStop} when profiling is already disabled.</p>
     * </li>
     * <li>{@link #CUDA_ERROR_NO_DEVICE CUDA_ERROR_NO_DEVICE} - This indicates that no CUDA-capable devices were detected by the installed CUDA driver.</li>
     * <li>{@link #CUDA_ERROR_INVALID_DEVICE CUDA_ERROR_INVALID_DEVICE} - This indicates that the device ordinal supplied by the user does not correspond to a valid CUDA device.</li>
     * <li>{@link #CUDA_ERROR_INVALID_IMAGE CUDA_ERROR_INVALID_IMAGE} - This indicates that the device kernel image is invalid. This can also indicate an invalid CUDA module.</li>
     * <li>{@link #CUDA_ERROR_INVALID_CONTEXT CUDA_ERROR_INVALID_CONTEXT} - 
     * This most frequently indicates that there is no context bound to the current thread.
     * This can also be returned if the context passed to an API call is not a valid handle (such as a context that has had {@link CU40#cuCtxDestroy CtxDestroy} invoked on it).
     * This can also be returned if a user mixes different API versions (i.e. 3010 context with 3020 API calls).
     * 
     * <p>See {@link #cuCtxGetApiVersion CtxGetApiVersion} for more details.</p>
     * </li>
     * <li>{@link #CUDA_ERROR_CONTEXT_ALREADY_CURRENT CUDA_ERROR_CONTEXT_ALREADY_CURRENT} - 
     * This indicated that the context being supplied as a parameter to the API call was already the active context.
     * 
     * <p>This error return is deprecated as of CUDA 3.2. It is no longer an error to attempt to push the active context via {@link CU40#cuCtxPushCurrent CtxPushCurrent}.</p>
     * </li>
     * <li>{@link #CUDA_ERROR_MAP_FAILED CUDA_ERROR_MAP_FAILED} - This indicates that a map or register operation has failed.</li>
     * <li>{@link #CUDA_ERROR_UNMAP_FAILED CUDA_ERROR_UNMAP_FAILED} - This indicates that an unmap or unregister operation has failed.</li>
     * <li>{@link #CUDA_ERROR_ARRAY_IS_MAPPED CUDA_ERROR_ARRAY_IS_MAPPED} - This indicates that the specified array is currently mapped and thus cannot be destroyed.</li>
     * <li>{@link #CUDA_ERROR_ALREADY_MAPPED CUDA_ERROR_ALREADY_MAPPED} - This indicates that the resource is already mapped.</li>
     * <li>{@link #CUDA_ERROR_NO_BINARY_FOR_GPU CUDA_ERROR_NO_BINARY_FOR_GPU} - 
     * This indicates that there is no kernel image available that is suitable for the device.
     * 
     * <p>This can occur when a user specifies code generation options for a particular CUDA source file that do not include the corresponding device
     * configuration.</p>
     * </li>
     * <li>{@link #CUDA_ERROR_ALREADY_ACQUIRED CUDA_ERROR_ALREADY_ACQUIRED} - This indicates that a resource has already been acquired.</li>
     * <li>{@link #CUDA_ERROR_NOT_MAPPED CUDA_ERROR_NOT_MAPPED} - This indicates that a resource is not mapped.</li>
     * <li>{@link #CUDA_ERROR_NOT_MAPPED_AS_ARRAY CUDA_ERROR_NOT_MAPPED_AS_ARRAY} - This indicates that a mapped resource is not available for access as an array.</li>
     * <li>{@link #CUDA_ERROR_NOT_MAPPED_AS_POINTER CUDA_ERROR_NOT_MAPPED_AS_POINTER} - This indicates that a mapped resource is not available for access as a pointer.</li>
     * <li>{@link #CUDA_ERROR_ECC_UNCORRECTABLE CUDA_ERROR_ECC_UNCORRECTABLE} - This indicates that an uncorrectable ECC error was detected during execution.</li>
     * <li>{@link #CUDA_ERROR_UNSUPPORTED_LIMIT CUDA_ERROR_UNSUPPORTED_LIMIT} - This indicates that the {@code CUlimit} passed to the API call is not supported by the active device.</li>
     * <li>{@link #CUDA_ERROR_CONTEXT_ALREADY_IN_USE CUDA_ERROR_CONTEXT_ALREADY_IN_USE} - 
     * This indicates that the {@code CUcontext} passed to the API call can only be bound to a single CPU thread at a time but is already bound to a CPU
     * thread.
     * </li>
     * <li>{@link #CUDA_ERROR_PEER_ACCESS_UNSUPPORTED CUDA_ERROR_PEER_ACCESS_UNSUPPORTED} - This indicates that peer access is not supported across the given devices.</li>
     * <li>{@link #CUDA_ERROR_INVALID_PTX CUDA_ERROR_INVALID_PTX} - This indicates that a PTX JIT compilation failed.</li>
     * <li>{@link #CUDA_ERROR_INVALID_GRAPHICS_CONTEXT CUDA_ERROR_INVALID_GRAPHICS_CONTEXT} - This indicates an error with OpenGL or DirectX context.</li>
     * <li>{@link #CUDA_ERROR_NVLINK_UNCORRECTABLE CUDA_ERROR_NVLINK_UNCORRECTABLE} - This indicates that an uncorrectable NVLink error was detected during the execution.</li>
     * <li>{@link #CUDA_ERROR_JIT_COMPILER_NOT_FOUND CUDA_ERROR_JIT_COMPILER_NOT_FOUND} - This indicates that the PTX JIT compiler library was not found.</li>
     * <li>{@link #CUDA_ERROR_INVALID_SOURCE CUDA_ERROR_INVALID_SOURCE} - This indicates that the device kernel source is invalid.</li>
     * <li>{@link #CUDA_ERROR_FILE_NOT_FOUND CUDA_ERROR_FILE_NOT_FOUND} - This indicates that the file specified was not found.</li>
     * <li>{@link #CUDA_ERROR_SHARED_OBJECT_SYMBOL_NOT_FOUND CUDA_ERROR_SHARED_OBJECT_SYMBOL_NOT_FOUND} - This indicates that a link to a shared object failed to resolve.</li>
     * <li>{@link #CUDA_ERROR_SHARED_OBJECT_INIT_FAILED CUDA_ERROR_SHARED_OBJECT_INIT_FAILED} - This indicates that initialization of a shared object failed.</li>
     * <li>{@link #CUDA_ERROR_OPERATING_SYSTEM CUDA_ERROR_OPERATING_SYSTEM} - This indicates that an OS call failed.</li>
     * <li>{@link #CUDA_ERROR_INVALID_HANDLE CUDA_ERROR_INVALID_HANDLE} - 
     * This indicates that a resource handle passed to the API call was not valid.
     * 
     * <p>Resource handles are opaque types like {@code CUstream} and {@code CUevent}.</p>
     * </li>
     * <li>{@link #CUDA_ERROR_ILLEGAL_STATE CUDA_ERROR_ILLEGAL_STATE} - This indicates that a resource required by the API call is not in a valid state to perform the requested operation.</li>
     * <li>{@link #CUDA_ERROR_NOT_FOUND CUDA_ERROR_NOT_FOUND} - This indicates that a named symbol was not found. Examples of symbols are global/constant variable names, texture names, and surface names.</li>
     * <li>{@link #CUDA_ERROR_NOT_READY CUDA_ERROR_NOT_READY} - 
     * This indicates that asynchronous operations issued previously have not completed yet.
     * 
     * <p>This result is not actually an error, but must be indicated differently than {@link #CUDA_SUCCESS} (which indicates completion). Calls that may return this
     * value include {@link #cuEventQuery EventQuery} and {@link #cuStreamQuery StreamQuery}.</p>
     * </li>
     * <li>{@link #CUDA_ERROR_ILLEGAL_ADDRESS CUDA_ERROR_ILLEGAL_ADDRESS} - 
     * While executing a kernel, the device encountered a load or store instruction on an invalid memory address.
     * 
     * <p>This leaves the process in an inconsistent state and any further CUDA work will return the same error. To continue using CUDA, the process must be
     * terminated and relaunched.</p>
     * </li>
     * <li>{@link #CUDA_ERROR_LAUNCH_OUT_OF_RESOURCES CUDA_ERROR_LAUNCH_OUT_OF_RESOURCES} - 
     * This indicates that a launch did not occur because it did not have appropriate resources.
     * 
     * <p>This error usually indicates that the user has attempted to pass too many arguments to the device kernel, or the kernel launch specifies too many
     * threads for the kernel's register count. Passing arguments of the wrong size (i.e. a 64-bit pointer when a 32-bit int is expected) is equivalent to
     * passing too many arguments and can also result in this error.</p>
     * </li>
     * <li>{@link #CUDA_ERROR_LAUNCH_TIMEOUT CUDA_ERROR_LAUNCH_TIMEOUT} - 
     * This indicates that the device kernel took too long to execute.
     * 
     * <p>This can only occur if timeouts are enabled - see the device attribute {@link #CU_DEVICE_ATTRIBUTE_KERNEL_EXEC_TIMEOUT DEVICE_ATTRIBUTE_KERNEL_EXEC_TIMEOUT} for more information. This leaves the
     * process in an inconsistent state and any further CUDA work will return the same error. To continue using CUDA, the process must be terminated and
     * relaunched.</p>
     * </li>
     * <li>{@link #CUDA_ERROR_LAUNCH_INCOMPATIBLE_TEXTURING CUDA_ERROR_LAUNCH_INCOMPATIBLE_TEXTURING} - This error indicates a kernel launch that uses an incompatible texturing mode.</li>
     * <li>{@link #CUDA_ERROR_PEER_ACCESS_ALREADY_ENABLED CUDA_ERROR_PEER_ACCESS_ALREADY_ENABLED} - 
     * This error indicates that a call to {@link CU40#cuCtxEnablePeerAccess CtxEnablePeerAccess} is trying to re-enable peer access to a context which has already had peer access to it
     * enabled.
     * </li>
     * <li>{@link #CUDA_ERROR_PEER_ACCESS_NOT_ENABLED CUDA_ERROR_PEER_ACCESS_NOT_ENABLED} - This error indicates that {@link CU40#cuCtxDisablePeerAccess CtxDisablePeerAccess} is trying to disable peer access which has not been enabled yet via {@link CU40#cuCtxEnablePeerAccess CtxEnablePeerAccess}.</li>
     * <li>{@link #CUDA_ERROR_PRIMARY_CONTEXT_ACTIVE CUDA_ERROR_PRIMARY_CONTEXT_ACTIVE} - This error indicates that the primary context for the specified device has already been initialized.</li>
     * <li>{@link #CUDA_ERROR_CONTEXT_IS_DESTROYED CUDA_ERROR_CONTEXT_IS_DESTROYED} - 
     * This error indicates that the context current to the calling thread has been destroyed using {@link CU40#cuCtxDestroy CtxDestroy}, or is a primary context which has not
     * yet been initialized.
     * </li>
     * <li>{@link #CUDA_ERROR_ASSERT CUDA_ERROR_ASSERT} - 
     * A device-side assert triggered during kernel execution.
     * 
     * <p>The context cannot be used anymore, and must be destroyed. All existing device memory allocations from this context are invalid and must be
     * reconstructed if the program is to continue using CUDA.</p>
     * </li>
     * <li>{@link #CUDA_ERROR_TOO_MANY_PEERS CUDA_ERROR_TOO_MANY_PEERS} - 
     * This error indicates that the hardware resources required to enable peer access have been exhausted for one or more of the devices passed to
     * {@link CU40#cuCtxEnablePeerAccess CtxEnablePeerAccess}.
     * </li>
     * <li>{@link #CUDA_ERROR_HOST_MEMORY_ALREADY_REGISTERED CUDA_ERROR_HOST_MEMORY_ALREADY_REGISTERED} - This error indicates that the memory range passed to {@link CU40#cuMemHostRegister MemHostRegister} has already been registered.</li>
     * <li>{@link #CUDA_ERROR_HOST_MEMORY_NOT_REGISTERED CUDA_ERROR_HOST_MEMORY_NOT_REGISTERED} - This error indicates that the pointer passed to {@link CU40#cuMemHostUnregister MemHostUnregister} does not correspond to any currently registered memory region.</li>
     * <li>{@link #CUDA_ERROR_HARDWARE_STACK_ERROR CUDA_ERROR_HARDWARE_STACK_ERROR} - 
     * While executing a kernel, the device encountered a stack error.
     * 
     * <p>This can be due to stack corruption or exceeding the stack size limit. This leaves the process in an inconsistent state and any further CUDA work
     * will return the same error. To continue using CUDA, the process must be terminated and relaunched.</p>
     * </li>
     * <li>{@link #CUDA_ERROR_ILLEGAL_INSTRUCTION CUDA_ERROR_ILLEGAL_INSTRUCTION} - 
     * While executing a kernel, the device encountered an illegal instruction.
     * 
     * <p>This leaves the process in an inconsistent state and any further CUDA work will return the same error. To continue using CUDA, the process must be
     * terminated and relaunched.</p>
     * </li>
     * <li>{@link #CUDA_ERROR_MISALIGNED_ADDRESS CUDA_ERROR_MISALIGNED_ADDRESS} - 
     * While executing a kernel, the device encountered a load or store instruction on a memory address which is not aligned.
     * 
     * <p>This leaves the process in an inconsistent state and any further CUDA work will return the same error. To continue using CUDA, the process must be
     * terminated and relaunched.</p>
     * </li>
     * <li>{@link #CUDA_ERROR_INVALID_ADDRESS_SPACE CUDA_ERROR_INVALID_ADDRESS_SPACE} - 
     * While executing a kernel, the device encountered an instruction which can only operate on memory locations in certain address spaces (global,
     * shared, or local), but was supplied a memory address not belonging to an allowed address space.
     * 
     * <p>This leaves the process in an inconsistent state and any further CUDA work will return the same error. To continue using CUDA, the process must be
     * terminated and relaunched.</p>
     * </li>
     * <li>{@link #CUDA_ERROR_INVALID_PC CUDA_ERROR_INVALID_PC} - 
     * While executing a kernel, the device program counter wrapped its address space.
     * 
     * <p>This leaves the process in an inconsistent state and any further CUDA work will return the same error. To continue using CUDA, the process must be
     * terminated and relaunched.</p>
     * </li>
     * <li>{@link #CUDA_ERROR_LAUNCH_FAILED CUDA_ERROR_LAUNCH_FAILED} - 
     * An exception occurred on the device while executing a kernel.
     * 
     * <p>Common causes include dereferencing an invalid device pointer and accessing out of bounds shared memory. Less common cases can be system specific -
     * more information about these cases can be found in the system specific user guide.This leaves the process in an inconsistent state and any further
     * CUDA work will return the same error. To continue using CUDA, the process must be terminated and relaunched.</p>
     * </li>
     * <li>{@link #CUDA_ERROR_COOPERATIVE_LAUNCH_TOO_LARGE CUDA_ERROR_COOPERATIVE_LAUNCH_TOO_LARGE} - 
     * This error indicates that the number of blocks launched per grid for a kernel that was launched via either {@link CU90#cuLaunchCooperativeKernel LaunchCooperativeKernel} or
     * {@link CU90#cuLaunchCooperativeKernelMultiDevice LaunchCooperativeKernelMultiDevice} exceeds the maximum number of blocks as allowed by {@link CU65#cuOccupancyMaxActiveBlocksPerMultiprocessor OccupancyMaxActiveBlocksPerMultiprocessor} or
     * {@link CU65#cuOccupancyMaxActiveBlocksPerMultiprocessorWithFlags OccupancyMaxActiveBlocksPerMultiprocessorWithFlags} times the number of multiprocessors as specified by the device attribute
     * {@link #CU_DEVICE_ATTRIBUTE_MULTIPROCESSOR_COUNT DEVICE_ATTRIBUTE_MULTIPROCESSOR_COUNT}.
     * </li>
     * <li>{@link #CUDA_ERROR_NOT_PERMITTED CUDA_ERROR_NOT_PERMITTED} - This error indicates that the attempted operation is not permitted.</li>
     * <li>{@link #CUDA_ERROR_NOT_SUPPORTED CUDA_ERROR_NOT_SUPPORTED} - This error indicates that the attempted operation is not supported on the current system or device.</li>
     * <li>{@link #CUDA_ERROR_SYSTEM_NOT_READY CUDA_ERROR_SYSTEM_NOT_READY} - 
     * This error indicates that the system is not yet ready to start any CUDA work.
     * 
     * <p>To continue using CUDA, verify the system configuration is in a valid state and all required driver daemons are actively running. More information
     * about this error can be found in the system specific user guide.</p>
     * </li>
     * <li>{@link #CUDA_ERROR_SYSTEM_DRIVER_MISMATCH CUDA_ERROR_SYSTEM_DRIVER_MISMATCH} - 
     * This error indicates that there is a mismatch between the versions of the display driver and the CUDA driver.
     * 
     * <p>Refer to the compatibility documentation for supported versions.</p>
     * </li>
     * <li>{@link #CUDA_ERROR_COMPAT_NOT_SUPPORTED_ON_DEVICE CUDA_ERROR_COMPAT_NOT_SUPPORTED_ON_DEVICE} - 
     * This error indicates that the system was upgraded to run with forward compatibility but the visible hardware detected by CUDA does not support this
     * configuration.
     * 
     * <p>Refer to the compatibility documentation for the supported hardware matrix or ensure that only supported hardware is visible during initialization
     * via the {@code CUDA_VISIBLE_DEVICES} environment variable.</p>
     * </li>
     * <li>{@link #CUDA_ERROR_STREAM_CAPTURE_UNSUPPORTED CUDA_ERROR_STREAM_CAPTURE_UNSUPPORTED} - This error indicates that the operation is not permitted when the stream is capturing.</li>
     * <li>{@link #CUDA_ERROR_STREAM_CAPTURE_INVALIDATED CUDA_ERROR_STREAM_CAPTURE_INVALIDATED} - This error indicates that the current capture sequence on the stream has been invalidated due to a previous error.</li>
     * <li>{@link #CUDA_ERROR_STREAM_CAPTURE_MERGE CUDA_ERROR_STREAM_CAPTURE_MERGE} - This error indicates that the operation would have resulted in a merge of two independent capture sequences.</li>
     * <li>{@link #CUDA_ERROR_STREAM_CAPTURE_UNMATCHED CUDA_ERROR_STREAM_CAPTURE_UNMATCHED} - This error indicates that the capture was not initiated in this stream.</li>
     * <li>{@link #CUDA_ERROR_STREAM_CAPTURE_UNJOINED CUDA_ERROR_STREAM_CAPTURE_UNJOINED} - This error indicates that the capture sequence contains a fork that was not joined to the primary stream.</li>
     * <li>{@link #CUDA_ERROR_STREAM_CAPTURE_ISOLATION CUDA_ERROR_STREAM_CAPTURE_ISOLATION} - 
     * This error indicates that a dependency would have been created which crosses the capture sequence boundary.
     * 
     * <p>Only implicit in-stream ordering dependencies are allowed to cross the boundary.</p>
     * </li>
     * <li>{@link #CUDA_ERROR_STREAM_CAPTURE_IMPLICIT CUDA_ERROR_STREAM_CAPTURE_IMPLICIT} - This error indicates a disallowed implicit dependency on a current capture sequence from cudaStreamLegacy.</li>
     * <li>{@link #CUDA_ERROR_CAPTURED_EVENT CUDA_ERROR_CAPTURED_EVENT} - This error indicates that the operation is not permitted on an event which was last recorded in a capturing stream.</li>
     * <li>{@link #CUDA_ERROR_STREAM_CAPTURE_WRONG_THREAD CUDA_ERROR_STREAM_CAPTURE_WRONG_THREAD} - 
     * A stream capture sequence not initiated with the {@link CU101#CU_STREAM_CAPTURE_MODE_RELAXED STREAM_CAPTURE_MODE_RELAXED} argument to {@link CU100#cuStreamBeginCapture StreamBeginCapture} was passed to {@link CU100#cuStreamEndCapture StreamEndCapture}
     * in a different thread.
     * </li>
     * <li>{@link #CUDA_ERROR_UNKNOWN CUDA_ERROR_UNKNOWN} - This indicates that an unknown internal error has occurred.</li>
     * </ul>
     */
    public static final int
        CUDA_SUCCESS                              = 0x0,
        CUDA_ERROR_INVALID_VALUE                  = 0x1,
        CUDA_ERROR_OUT_OF_MEMORY                  = 0x2,
        CUDA_ERROR_NOT_INITIALIZED                = 0x3,
        CUDA_ERROR_DEINITIALIZED                  = 0x4,
        CUDA_ERROR_PROFILER_DISABLED              = 0x5,
        CUDA_ERROR_PROFILER_NOT_INITIALIZED       = 0x6,
        CUDA_ERROR_PROFILER_ALREADY_STARTED       = 0x7,
        CUDA_ERROR_PROFILER_ALREADY_STOPPED       = 0x8,
        CUDA_ERROR_NO_DEVICE                      = 0x64,
        CUDA_ERROR_INVALID_DEVICE                 = 0x65,
        CUDA_ERROR_INVALID_IMAGE                  = 0xC8,
        CUDA_ERROR_INVALID_CONTEXT                = 0xC9,
        CUDA_ERROR_CONTEXT_ALREADY_CURRENT        = 0xCA,
        CUDA_ERROR_MAP_FAILED                     = 0xCD,
        CUDA_ERROR_UNMAP_FAILED                   = 0xCE,
        CUDA_ERROR_ARRAY_IS_MAPPED                = 0xCF,
        CUDA_ERROR_ALREADY_MAPPED                 = 0xD0,
        CUDA_ERROR_NO_BINARY_FOR_GPU              = 0xD1,
        CUDA_ERROR_ALREADY_ACQUIRED               = 0xD2,
        CUDA_ERROR_NOT_MAPPED                     = 0xD3,
        CUDA_ERROR_NOT_MAPPED_AS_ARRAY            = 0xD4,
        CUDA_ERROR_NOT_MAPPED_AS_POINTER          = 0xD5,
        CUDA_ERROR_ECC_UNCORRECTABLE              = 0xD6,
        CUDA_ERROR_UNSUPPORTED_LIMIT              = 0xD7,
        CUDA_ERROR_CONTEXT_ALREADY_IN_USE         = 0xD8,
        CUDA_ERROR_PEER_ACCESS_UNSUPPORTED        = 0xD9,
        CUDA_ERROR_INVALID_PTX                    = 0xDA,
        CUDA_ERROR_INVALID_GRAPHICS_CONTEXT       = 0xDB,
        CUDA_ERROR_NVLINK_UNCORRECTABLE           = 0xDC,
        CUDA_ERROR_JIT_COMPILER_NOT_FOUND         = 0xDD,
        CUDA_ERROR_INVALID_SOURCE                 = 0x12C,
        CUDA_ERROR_FILE_NOT_FOUND                 = 0x12D,
        CUDA_ERROR_SHARED_OBJECT_SYMBOL_NOT_FOUND = 0x12E,
        CUDA_ERROR_SHARED_OBJECT_INIT_FAILED      = 0x12F,
        CUDA_ERROR_OPERATING_SYSTEM               = 0x130,
        CUDA_ERROR_INVALID_HANDLE                 = 0x190,
        CUDA_ERROR_ILLEGAL_STATE                  = 0x191,
        CUDA_ERROR_NOT_FOUND                      = 0x1F4,
        CUDA_ERROR_NOT_READY                      = 0x258,
        CUDA_ERROR_ILLEGAL_ADDRESS                = 0x2BC,
        CUDA_ERROR_LAUNCH_OUT_OF_RESOURCES        = 0x2BD,
        CUDA_ERROR_LAUNCH_TIMEOUT                 = 0x2BE,
        CUDA_ERROR_LAUNCH_INCOMPATIBLE_TEXTURING  = 0x2BF,
        CUDA_ERROR_PEER_ACCESS_ALREADY_ENABLED    = 0x2C0,
        CUDA_ERROR_PEER_ACCESS_NOT_ENABLED        = 0x2C1,
        CUDA_ERROR_PRIMARY_CONTEXT_ACTIVE         = 0x2C4,
        CUDA_ERROR_CONTEXT_IS_DESTROYED           = 0x2C5,
        CUDA_ERROR_ASSERT                         = 0x2C6,
        CUDA_ERROR_TOO_MANY_PEERS                 = 0x2C7,
        CUDA_ERROR_HOST_MEMORY_ALREADY_REGISTERED = 0x2C8,
        CUDA_ERROR_HOST_MEMORY_NOT_REGISTERED     = 0x2C9,
        CUDA_ERROR_HARDWARE_STACK_ERROR           = 0x2CA,
        CUDA_ERROR_ILLEGAL_INSTRUCTION            = 0x2CB,
        CUDA_ERROR_MISALIGNED_ADDRESS             = 0x2CC,
        CUDA_ERROR_INVALID_ADDRESS_SPACE          = 0x2CD,
        CUDA_ERROR_INVALID_PC                     = 0x2CE,
        CUDA_ERROR_LAUNCH_FAILED                  = 0x2CF,
        CUDA_ERROR_COOPERATIVE_LAUNCH_TOO_LARGE   = 0x2D0,
        CUDA_ERROR_NOT_PERMITTED                  = 0x320,
        CUDA_ERROR_NOT_SUPPORTED                  = 0x321,
        CUDA_ERROR_SYSTEM_NOT_READY               = 0x322,
        CUDA_ERROR_SYSTEM_DRIVER_MISMATCH         = 0x323,
        CUDA_ERROR_COMPAT_NOT_SUPPORTED_ON_DEVICE = 0x324,
        CUDA_ERROR_STREAM_CAPTURE_UNSUPPORTED     = 0x384,
        CUDA_ERROR_STREAM_CAPTURE_INVALIDATED     = 0x385,
        CUDA_ERROR_STREAM_CAPTURE_MERGE           = 0x386,
        CUDA_ERROR_STREAM_CAPTURE_UNMATCHED       = 0x387,
        CUDA_ERROR_STREAM_CAPTURE_UNJOINED        = 0x388,
        CUDA_ERROR_STREAM_CAPTURE_ISOLATION       = 0x389,
        CUDA_ERROR_STREAM_CAPTURE_IMPLICIT        = 0x38A,
        CUDA_ERROR_CAPTURED_EVENT                 = 0x38B,
        CUDA_ERROR_STREAM_CAPTURE_WRONG_THREAD    = 0x38C,
        CUDA_ERROR_UNKNOWN                        = 0x3E7;

    protected CU() {
        throw new UnsupportedOperationException();
    }

    private static final SharedLibrary NVCUDA = Library.loadNative(CU.class, "org.lwjgl.cuda", Configuration.CUDA_LIBRARY_NAME, "nvcuda");

    /** Contains the function pointers loaded from the NVCUDA {@link SharedLibrary}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GetErrorString                    = apiGetFunctionAddress(NVCUDA, "cuGetErrorString"),
            GetErrorName                      = apiGetFunctionAddress(NVCUDA, "cuGetErrorName"),
            Init                              = apiGetFunctionAddress(NVCUDA, "cuInit"),
            DriverGetVersion                  = apiGetFunctionAddress(NVCUDA, "cuDriverGetVersion"),
            DeviceGet                         = apiGetFunctionAddress(NVCUDA, "cuDeviceGet"),
            DeviceGetCount                    = apiGetFunctionAddress(NVCUDA, "cuDeviceGetCount"),
            DeviceGetName                     = apiGetFunctionAddress(NVCUDA, "cuDeviceGetName"),
            DeviceTotalMem                    = apiGetFunctionAddress(NVCUDA, __CUDA_API_VERSION("cuDeviceTotalMem", 2)),
            DeviceGetAttribute                = apiGetFunctionAddress(NVCUDA, "cuDeviceGetAttribute"),
            DeviceGetProperties               = apiGetFunctionAddress(NVCUDA, "cuDeviceGetProperties"),
            DeviceComputeCapability           = apiGetFunctionAddress(NVCUDA, "cuDeviceComputeCapability"),
            CtxCreate                         = apiGetFunctionAddress(NVCUDA, __CUDA_API_VERSION("cuCtxCreate", 2)),
            CtxGetDevice                      = apiGetFunctionAddress(NVCUDA, "cuCtxGetDevice"),
            CtxSynchronize                    = apiGetFunctionAddress(NVCUDA, "cuCtxSynchronize"),
            CtxSetLimit                       = apiGetFunctionAddress(NVCUDA, "cuCtxSetLimit"),
            CtxGetLimit                       = apiGetFunctionAddress(NVCUDA, "cuCtxGetLimit"),
            CtxGetCacheConfig                 = apiGetFunctionAddress(NVCUDA, "cuCtxGetCacheConfig"),
            CtxSetCacheConfig                 = apiGetFunctionAddress(NVCUDA, "cuCtxSetCacheConfig"),
            CtxGetApiVersion                  = apiGetFunctionAddress(NVCUDA, "cuCtxGetApiVersion"),
            CtxGetStreamPriorityRange         = apiGetFunctionAddress(NVCUDA, "cuCtxGetStreamPriorityRange"),
            CtxAttach                         = apiGetFunctionAddress(NVCUDA, "cuCtxAttach"),
            CtxDetach                         = apiGetFunctionAddress(NVCUDA, "cuCtxDetach"),
            ModuleLoad                        = apiGetFunctionAddress(NVCUDA, "cuModuleLoad"),
            ModuleLoadData                    = apiGetFunctionAddress(NVCUDA, "cuModuleLoadData"),
            ModuleLoadDataEx                  = apiGetFunctionAddress(NVCUDA, "cuModuleLoadDataEx"),
            ModuleLoadFatBinary               = apiGetFunctionAddress(NVCUDA, "cuModuleLoadFatBinary"),
            ModuleUnload                      = apiGetFunctionAddress(NVCUDA, "cuModuleUnload"),
            ModuleGetFunction                 = apiGetFunctionAddress(NVCUDA, "cuModuleGetFunction"),
            ModuleGetGlobal                   = apiGetFunctionAddress(NVCUDA, __CUDA_API_VERSION("cuModuleGetGlobal", 2)),
            ModuleGetTexRef                   = apiGetFunctionAddress(NVCUDA, "cuModuleGetTexRef"),
            ModuleGetSurfRef                  = apiGetFunctionAddress(NVCUDA, "cuModuleGetSurfRef"),
            MemGetInfo                        = apiGetFunctionAddress(NVCUDA, __CUDA_API_VERSION("cuMemGetInfo", 2)),
            MemAlloc                          = apiGetFunctionAddress(NVCUDA, __CUDA_API_VERSION("cuMemAlloc", 2)),
            MemAllocPitch                     = apiGetFunctionAddress(NVCUDA, __CUDA_API_VERSION("cuMemAllocPitch", 2)),
            MemFree                           = apiGetFunctionAddress(NVCUDA, __CUDA_API_VERSION("cuMemFree", 2)),
            MemGetAddressRange                = apiGetFunctionAddress(NVCUDA, __CUDA_API_VERSION("cuMemGetAddressRange", 2)),
            MemAllocHost                      = apiGetFunctionAddress(NVCUDA, __CUDA_API_VERSION("cuMemAllocHost", 2)),
            MemFreeHost                       = apiGetFunctionAddress(NVCUDA, "cuMemFreeHost"),
            MemHostAlloc                      = apiGetFunctionAddress(NVCUDA, "cuMemHostAlloc"),
            MemHostGetDevicePointer           = apiGetFunctionAddress(NVCUDA, __CUDA_API_VERSION("cuMemHostGetDevicePointer", 2)),
            MemHostGetFlags                   = apiGetFunctionAddress(NVCUDA, "cuMemHostGetFlags"),
            MemcpyHtoD                        = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTDS(__CUDA_API_VERSION("cuMemcpyHtoD", 2))),
            MemcpyDtoH                        = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTDS(__CUDA_API_VERSION("cuMemcpyDtoH", 2))),
            MemcpyDtoD                        = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTDS(__CUDA_API_VERSION("cuMemcpyDtoD", 2))),
            MemcpyDtoA                        = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTDS(__CUDA_API_VERSION("cuMemcpyDtoA", 2))),
            MemcpyAtoD                        = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTDS(__CUDA_API_VERSION("cuMemcpyAtoD", 2))),
            MemcpyHtoA                        = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTDS(__CUDA_API_VERSION("cuMemcpyHtoA", 2))),
            MemcpyAtoH                        = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTDS(__CUDA_API_VERSION("cuMemcpyAtoH", 2))),
            MemcpyAtoA                        = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTDS(__CUDA_API_VERSION("cuMemcpyAtoA", 2))),
            Memcpy2D                          = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTDS(__CUDA_API_VERSION("cuMemcpy2D", 2))),
            Memcpy2DUnaligned                 = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTDS(__CUDA_API_VERSION("cuMemcpy2DUnaligned", 2))),
            Memcpy3D                          = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTDS(__CUDA_API_VERSION("cuMemcpy3D", 2))),
            MemcpyHtoDAsync                   = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTSZ(__CUDA_API_VERSION("cuMemcpyHtoDAsync", 2))),
            MemcpyDtoHAsync                   = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTSZ(__CUDA_API_VERSION("cuMemcpyDtoHAsync", 2))),
            MemcpyDtoDAsync                   = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTSZ(__CUDA_API_VERSION("cuMemcpyDtoDAsync", 2))),
            MemcpyHtoAAsync                   = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTSZ(__CUDA_API_VERSION("cuMemcpyHtoAAsync", 2))),
            MemcpyAtoHAsync                   = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTSZ(__CUDA_API_VERSION("cuMemcpyAtoHAsync", 2))),
            Memcpy2DAsync                     = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTSZ(__CUDA_API_VERSION("cuMemcpy2DAsync", 2))),
            Memcpy3DAsync                     = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTSZ(__CUDA_API_VERSION("cuMemcpy3DAsync", 2))),
            MemsetD8                          = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTDS(__CUDA_API_VERSION("cuMemsetD8", 2))),
            MemsetD16                         = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTDS(__CUDA_API_VERSION("cuMemsetD16", 2))),
            MemsetD32                         = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTDS(__CUDA_API_VERSION("cuMemsetD32", 2))),
            MemsetD2D8                        = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTDS(__CUDA_API_VERSION("cuMemsetD2D8", 2))),
            MemsetD2D16                       = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTDS(__CUDA_API_VERSION("cuMemsetD2D16", 2))),
            MemsetD2D32                       = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTDS(__CUDA_API_VERSION("cuMemsetD2D32", 2))),
            MemsetD8Async                     = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTSZ("cuMemsetD8Async")),
            MemsetD16Async                    = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTSZ("cuMemsetD16Async")),
            MemsetD32Async                    = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTSZ("cuMemsetD32Async")),
            MemsetD2D8Async                   = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTSZ("cuMemsetD2D8Async")),
            MemsetD2D16Async                  = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTSZ("cuMemsetD2D16Async")),
            MemsetD2D32Async                  = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTSZ("cuMemsetD2D32Async")),
            ArrayCreate                       = apiGetFunctionAddress(NVCUDA, __CUDA_API_VERSION("cuArrayCreate", 2)),
            ArrayGetDescriptor                = apiGetFunctionAddress(NVCUDA, __CUDA_API_VERSION("cuArrayGetDescriptor", 2)),
            ArrayDestroy                      = apiGetFunctionAddress(NVCUDA, "cuArrayDestroy"),
            Array3DCreate                     = apiGetFunctionAddress(NVCUDA, __CUDA_API_VERSION("cuArray3DCreate", 2)),
            Array3DGetDescriptor              = apiGetFunctionAddress(NVCUDA, __CUDA_API_VERSION("cuArray3DGetDescriptor", 2)),
            StreamCreate                      = apiGetFunctionAddress(NVCUDA, "cuStreamCreate"),
            StreamCreateWithPriority          = apiGetFunctionAddress(NVCUDA, "cuStreamCreateWithPriority"),
            StreamGetPriority                 = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTSZ("cuStreamGetPriority")),
            StreamGetFlags                    = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTSZ("cuStreamGetFlags")),
            StreamWaitEvent                   = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTSZ("cuStreamWaitEvent")),
            StreamAddCallback                 = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTSZ("cuStreamAddCallback")),
            StreamQuery                       = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTSZ("cuStreamQuery")),
            StreamSynchronize                 = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTSZ("cuStreamSynchronize")),
            EventCreate                       = apiGetFunctionAddress(NVCUDA, "cuEventCreate"),
            EventRecord                       = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTSZ("cuEventRecord")),
            EventQuery                        = apiGetFunctionAddress(NVCUDA, "cuEventQuery"),
            EventSynchronize                  = apiGetFunctionAddress(NVCUDA, "cuEventSynchronize"),
            EventElapsedTime                  = apiGetFunctionAddress(NVCUDA, "cuEventElapsedTime"),
            FuncGetAttribute                  = apiGetFunctionAddress(NVCUDA, "cuFuncGetAttribute"),
            FuncSetCacheConfig                = apiGetFunctionAddress(NVCUDA, "cuFuncSetCacheConfig"),
            FuncSetBlockShape                 = apiGetFunctionAddress(NVCUDA, "cuFuncSetBlockShape"),
            FuncSetSharedSize                 = apiGetFunctionAddress(NVCUDA, "cuFuncSetSharedSize"),
            ParamSetSize                      = apiGetFunctionAddress(NVCUDA, "cuParamSetSize"),
            ParamSeti                         = apiGetFunctionAddress(NVCUDA, "cuParamSeti"),
            ParamSetf                         = apiGetFunctionAddress(NVCUDA, "cuParamSetf"),
            ParamSetv                         = apiGetFunctionAddress(NVCUDA, "cuParamSetv"),
            Launch                            = apiGetFunctionAddress(NVCUDA, "cuLaunch"),
            LaunchGrid                        = apiGetFunctionAddress(NVCUDA, "cuLaunchGrid"),
            LaunchGridAsync                   = apiGetFunctionAddress(NVCUDA, "cuLaunchGridAsync"),
            ParamSetTexRef                    = apiGetFunctionAddress(NVCUDA, "cuParamSetTexRef"),
            TexRefSetArray                    = apiGetFunctionAddress(NVCUDA, "cuTexRefSetArray"),
            TexRefSetMipmappedArray           = apiGetFunctionAddress(NVCUDA, "cuTexRefSetMipmappedArray"),
            TexRefSetAddress                  = apiGetFunctionAddress(NVCUDA, __CUDA_API_VERSION("cuTexRefSetAddress", 2)),
            TexRefSetAddress2D                = apiGetFunctionAddress(NVCUDA, __CUDA_API_VERSION("cuTexRefSetAddress2D", 3)),
            TexRefSetFormat                   = apiGetFunctionAddress(NVCUDA, "cuTexRefSetFormat"),
            TexRefSetAddressMode              = apiGetFunctionAddress(NVCUDA, "cuTexRefSetAddressMode"),
            TexRefSetFilterMode               = apiGetFunctionAddress(NVCUDA, "cuTexRefSetFilterMode"),
            TexRefSetMipmapFilterMode         = apiGetFunctionAddress(NVCUDA, "cuTexRefSetMipmapFilterMode"),
            TexRefSetMipmapLevelBias          = apiGetFunctionAddress(NVCUDA, "cuTexRefSetMipmapLevelBias"),
            TexRefSetMipmapLevelClamp         = apiGetFunctionAddress(NVCUDA, "cuTexRefSetMipmapLevelClamp"),
            TexRefSetMaxAnisotropy            = apiGetFunctionAddress(NVCUDA, "cuTexRefSetMaxAnisotropy"),
            TexRefSetBorderColor              = apiGetFunctionAddress(NVCUDA, "cuTexRefSetBorderColor"),
            TexRefSetFlags                    = apiGetFunctionAddress(NVCUDA, "cuTexRefSetFlags"),
            TexRefGetAddress                  = apiGetFunctionAddress(NVCUDA, __CUDA_API_VERSION("cuTexRefGetAddress", 2)),
            TexRefGetArray                    = apiGetFunctionAddress(NVCUDA, "cuTexRefGetArray"),
            TexRefGetMipmappedArray           = apiGetFunctionAddress(NVCUDA, "cuTexRefGetMipmappedArray"),
            TexRefGetAddressMode              = apiGetFunctionAddress(NVCUDA, "cuTexRefGetAddressMode"),
            TexRefGetFilterMode               = apiGetFunctionAddress(NVCUDA, "cuTexRefGetFilterMode"),
            TexRefGetFormat                   = apiGetFunctionAddress(NVCUDA, "cuTexRefGetFormat"),
            TexRefGetMipmapFilterMode         = apiGetFunctionAddress(NVCUDA, "cuTexRefGetMipmapFilterMode"),
            TexRefGetMipmapLevelBias          = apiGetFunctionAddress(NVCUDA, "cuTexRefGetMipmapLevelBias"),
            TexRefGetMipmapLevelClamp         = apiGetFunctionAddress(NVCUDA, "cuTexRefGetMipmapLevelClamp"),
            TexRefGetMaxAnisotropy            = apiGetFunctionAddress(NVCUDA, "cuTexRefGetMaxAnisotropy"),
            TexRefGetBorderColor              = apiGetFunctionAddress(NVCUDA, "cuTexRefGetBorderColor"),
            TexRefGetFlags                    = apiGetFunctionAddress(NVCUDA, "cuTexRefGetFlags"),
            TexRefCreate                      = apiGetFunctionAddress(NVCUDA, "cuTexRefCreate"),
            TexRefDestroy                     = apiGetFunctionAddress(NVCUDA, "cuTexRefDestroy"),
            SurfRefSetArray                   = apiGetFunctionAddress(NVCUDA, "cuSurfRefSetArray"),
            SurfRefGetArray                   = apiGetFunctionAddress(NVCUDA, "cuSurfRefGetArray"),
            GraphicsUnregisterResource        = apiGetFunctionAddress(NVCUDA, "cuGraphicsUnregisterResource"),
            GraphicsSubResourceGetMappedArray = apiGetFunctionAddress(NVCUDA, "cuGraphicsSubResourceGetMappedArray"),
            GraphicsResourceGetMappedPointer  = apiGetFunctionAddress(NVCUDA, __CUDA_API_VERSION("cuGraphicsResourceGetMappedPointer", 2)),
            GraphicsResourceSetMapFlags       = apiGetFunctionAddress(NVCUDA, __CUDA_API_VERSION("cuGraphicsResourceSetMapFlags", 2)),
            GraphicsMapResources              = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTSZ("cuGraphicsMapResources")),
            GraphicsUnmapResources            = apiGetFunctionAddress(NVCUDA, __CUDA_API_PTSZ("cuGraphicsUnmapResources")),
            GetExportTable                    = apiGetFunctionAddress(NVCUDA, "cuGetExportTable");

    }

    /** Returns the NVCUDA {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return NVCUDA;
    }

    // --- [ cuGetErrorString ] ---

    public static int ncuGetErrorString(int error, long pStr) {
        long __functionAddress = Functions.GetErrorString;
        return callPI(error, pStr, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuGetErrorString(@NativeType("CUresult") int error, @NativeType("char const **") PointerBuffer pStr) {
        if (CHECKS) {
            check(pStr, 1);
        }
        return ncuGetErrorString(error, memAddress(pStr));
    }

    // --- [ cuGetErrorName ] ---

    public static int ncuGetErrorName(int error, long pStr) {
        long __functionAddress = Functions.GetErrorName;
        return callPI(error, pStr, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuGetErrorName(@NativeType("CUresult") int error, @NativeType("char const **") PointerBuffer pStr) {
        if (CHECKS) {
            check(pStr, 1);
        }
        return ncuGetErrorName(error, memAddress(pStr));
    }

    // --- [ cuInit ] ---

    @NativeType("CUresult")
    public static int cuInit(@NativeType("unsigned int") int Flags) {
        long __functionAddress = Functions.Init;
        return callI(Flags, __functionAddress);
    }

    // --- [ cuDriverGetVersion ] ---

    public static int ncuDriverGetVersion(long driverVersion) {
        long __functionAddress = Functions.DriverGetVersion;
        return callPI(driverVersion, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuDriverGetVersion(@NativeType("int *") IntBuffer driverVersion) {
        if (CHECKS) {
            check(driverVersion, 1);
        }
        return ncuDriverGetVersion(memAddress(driverVersion));
    }

    // --- [ cuDeviceGet ] ---

    public static int ncuDeviceGet(long device, int ordinal) {
        long __functionAddress = Functions.DeviceGet;
        return callPI(device, ordinal, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuDeviceGet(@NativeType("CUdevice *") IntBuffer device, int ordinal) {
        if (CHECKS) {
            check(device, 1);
        }
        return ncuDeviceGet(memAddress(device), ordinal);
    }

    // --- [ cuDeviceGetCount ] ---

    public static int ncuDeviceGetCount(long count) {
        long __functionAddress = Functions.DeviceGetCount;
        return callPI(count, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuDeviceGetCount(@NativeType("int *") IntBuffer count) {
        if (CHECKS) {
            check(count, 1);
        }
        return ncuDeviceGetCount(memAddress(count));
    }

    // --- [ cuDeviceGetName ] ---

    public static int ncuDeviceGetName(long name, int len, int dev) {
        long __functionAddress = Functions.DeviceGetName;
        return callPI(name, len, dev, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuDeviceGetName(@NativeType("char *") ByteBuffer name, @NativeType("CUdevice") int dev) {
        return ncuDeviceGetName(memAddress(name), name.remaining(), dev);
    }

    // --- [ cuDeviceTotalMem ] ---

    public static int ncuDeviceTotalMem(long bytes, int dev) {
        long __functionAddress = Functions.DeviceTotalMem;
        return callPI(bytes, dev, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuDeviceTotalMem(@NativeType("size_t *") PointerBuffer bytes, @NativeType("CUdevice") int dev) {
        if (CHECKS) {
            check(bytes, 1);
        }
        return ncuDeviceTotalMem(memAddress(bytes), dev);
    }

    // --- [ cuDeviceGetAttribute ] ---

    public static int ncuDeviceGetAttribute(long pi, int attrib, int dev) {
        long __functionAddress = Functions.DeviceGetAttribute;
        return callPI(pi, attrib, dev, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuDeviceGetAttribute(@NativeType("int *") IntBuffer pi, @NativeType("CUdevice_attribute") int attrib, @NativeType("CUdevice") int dev) {
        if (CHECKS) {
            check(pi, 1);
        }
        return ncuDeviceGetAttribute(memAddress(pi), attrib, dev);
    }

    // --- [ cuDeviceGetProperties ] ---

    public static int ncuDeviceGetProperties(long prop, int dev) {
        long __functionAddress = Functions.DeviceGetProperties;
        return callPI(prop, dev, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuDeviceGetProperties(@NativeType("CUdevprop *") CUdevprop prop, @NativeType("CUdevice") int dev) {
        return ncuDeviceGetProperties(prop.address(), dev);
    }

    // --- [ cuDeviceComputeCapability ] ---

    public static int ncuDeviceComputeCapability(long major, long minor, int dev) {
        long __functionAddress = Functions.DeviceComputeCapability;
        return callPPI(major, minor, dev, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuDeviceComputeCapability(@NativeType("int *") IntBuffer major, @NativeType("int *") IntBuffer minor, @NativeType("CUdevice") int dev) {
        if (CHECKS) {
            check(major, 1);
            check(minor, 1);
        }
        return ncuDeviceComputeCapability(memAddress(major), memAddress(minor), dev);
    }

    // --- [ cuCtxCreate ] ---

    public static int ncuCtxCreate(long pctx, int flags, int dev) {
        long __functionAddress = Functions.CtxCreate;
        return callPI(pctx, flags, dev, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuCtxCreate(@NativeType("CUcontext *") PointerBuffer pctx, @NativeType("unsigned int") int flags, @NativeType("CUdevice") int dev) {
        if (CHECKS) {
            check(pctx, 1);
        }
        return ncuCtxCreate(memAddress(pctx), flags, dev);
    }

    // --- [ cuCtxGetDevice ] ---

    public static int ncuCtxGetDevice(long device) {
        long __functionAddress = Functions.CtxGetDevice;
        return callPI(device, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuCtxGetDevice(@NativeType("CUdevice *") IntBuffer device) {
        if (CHECKS) {
            check(device, 1);
        }
        return ncuCtxGetDevice(memAddress(device));
    }

    // --- [ cuCtxSynchronize ] ---

    @NativeType("CUresult")
    public static int cuCtxSynchronize() {
        long __functionAddress = Functions.CtxSynchronize;
        return callI(__functionAddress);
    }

    // --- [ cuCtxSetLimit ] ---

    @NativeType("CUresult")
    public static int cuCtxSetLimit(@NativeType("CUlimit") int limit, @NativeType("size_t") long value) {
        long __functionAddress = Functions.CtxSetLimit;
        return callPI(limit, value, __functionAddress);
    }

    // --- [ cuCtxGetLimit ] ---

    public static int ncuCtxGetLimit(long pvalue, int limit) {
        long __functionAddress = Functions.CtxGetLimit;
        return callPI(pvalue, limit, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuCtxGetLimit(@NativeType("size_t *") PointerBuffer pvalue, @NativeType("CUlimit") int limit) {
        if (CHECKS) {
            check(pvalue, 1);
        }
        return ncuCtxGetLimit(memAddress(pvalue), limit);
    }

    // --- [ cuCtxGetCacheConfig ] ---

    public static int ncuCtxGetCacheConfig(long pconfig) {
        long __functionAddress = Functions.CtxGetCacheConfig;
        return callPI(pconfig, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuCtxGetCacheConfig(@NativeType("CUfunc_cache *") IntBuffer pconfig) {
        if (CHECKS) {
            check(pconfig, 1);
        }
        return ncuCtxGetCacheConfig(memAddress(pconfig));
    }

    // --- [ cuCtxSetCacheConfig ] ---

    @NativeType("CUresult")
    public static int cuCtxSetCacheConfig(@NativeType("CUfunc_cache") int config) {
        long __functionAddress = Functions.CtxSetCacheConfig;
        return callI(config, __functionAddress);
    }

    // --- [ cuCtxGetApiVersion ] ---

    public static int ncuCtxGetApiVersion(long ctx, long version) {
        long __functionAddress = Functions.CtxGetApiVersion;
        return callPPI(ctx, version, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuCtxGetApiVersion(@NativeType("CUcontext") long ctx, @NativeType("unsigned int *") IntBuffer version) {
        if (CHECKS) {
            check(version, 1);
        }
        return ncuCtxGetApiVersion(ctx, memAddress(version));
    }

    // --- [ cuCtxGetStreamPriorityRange ] ---

    public static int ncuCtxGetStreamPriorityRange(long leastPriority, long greatestPriority) {
        long __functionAddress = Functions.CtxGetStreamPriorityRange;
        return callPPI(leastPriority, greatestPriority, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuCtxGetStreamPriorityRange(@Nullable @NativeType("int *") IntBuffer leastPriority, @Nullable @NativeType("int *") IntBuffer greatestPriority) {
        if (CHECKS) {
            checkSafe(leastPriority, 1);
            checkSafe(greatestPriority, 1);
        }
        return ncuCtxGetStreamPriorityRange(memAddressSafe(leastPriority), memAddressSafe(greatestPriority));
    }

    // --- [ cuCtxAttach ] ---

    public static int ncuCtxAttach(long pctx, int flags) {
        long __functionAddress = Functions.CtxAttach;
        return callPI(pctx, flags, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuCtxAttach(@NativeType("CUcontext *") PointerBuffer pctx, @NativeType("unsigned int") int flags) {
        if (CHECKS) {
            check(pctx, 1);
        }
        return ncuCtxAttach(memAddress(pctx), flags);
    }

    // --- [ cuCtxDetach ] ---

    @NativeType("CUresult")
    public static int cuCtxDetach(@NativeType("CUcontext") long ctx) {
        long __functionAddress = Functions.CtxDetach;
        if (CHECKS) {
            check(ctx);
        }
        return callPI(ctx, __functionAddress);
    }

    // --- [ cuModuleLoad ] ---

    public static int ncuModuleLoad(long module, long fname) {
        long __functionAddress = Functions.ModuleLoad;
        return callPPI(module, fname, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuModuleLoad(@NativeType("CUmodule *") PointerBuffer module, @NativeType("char const *") ByteBuffer fname) {
        if (CHECKS) {
            check(module, 1);
            checkNT1(fname);
        }
        return ncuModuleLoad(memAddress(module), memAddress(fname));
    }

    @NativeType("CUresult")
    public static int cuModuleLoad(@NativeType("CUmodule *") PointerBuffer module, @NativeType("char const *") CharSequence fname) {
        if (CHECKS) {
            check(module, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(fname, true);
            long fnameEncoded = stack.getPointerAddress();
            return ncuModuleLoad(memAddress(module), fnameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ cuModuleLoadData ] ---

    public static int ncuModuleLoadData(long module, long image) {
        long __functionAddress = Functions.ModuleLoadData;
        return callPPI(module, image, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuModuleLoadData(@NativeType("CUmodule *") PointerBuffer module, @NativeType("void const *") ByteBuffer image) {
        if (CHECKS) {
            check(module, 1);
        }
        return ncuModuleLoadData(memAddress(module), memAddress(image));
    }

    // --- [ cuModuleLoadDataEx ] ---

    public static int ncuModuleLoadDataEx(long module, long image, int numOptions, long options, long optionValues) {
        long __functionAddress = Functions.ModuleLoadDataEx;
        return callPPPPI(module, image, numOptions, options, optionValues, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuModuleLoadDataEx(@NativeType("CUmodule *") PointerBuffer module, @NativeType("void const *") ByteBuffer image, @Nullable @NativeType("CUjit_option *") IntBuffer options, @Nullable @NativeType("void **") PointerBuffer optionValues) {
        if (CHECKS) {
            check(module, 1);
            checkSafe(optionValues, remainingSafe(options));
        }
        return ncuModuleLoadDataEx(memAddress(module), memAddress(image), remainingSafe(options), memAddressSafe(options), memAddressSafe(optionValues));
    }

    // --- [ cuModuleLoadFatBinary ] ---

    public static int ncuModuleLoadFatBinary(long module, long fatCubin) {
        long __functionAddress = Functions.ModuleLoadFatBinary;
        return callPPI(module, fatCubin, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuModuleLoadFatBinary(@NativeType("CUmodule *") PointerBuffer module, @NativeType("void const *") ByteBuffer fatCubin) {
        if (CHECKS) {
            check(module, 1);
        }
        return ncuModuleLoadFatBinary(memAddress(module), memAddress(fatCubin));
    }

    // --- [ cuModuleUnload ] ---

    @NativeType("CUresult")
    public static int cuModuleUnload(@NativeType("CUmodule") long hmod) {
        long __functionAddress = Functions.ModuleUnload;
        if (CHECKS) {
            check(hmod);
        }
        return callPI(hmod, __functionAddress);
    }

    // --- [ cuModuleGetFunction ] ---

    public static int ncuModuleGetFunction(long hfunc, long hmod, long name) {
        long __functionAddress = Functions.ModuleGetFunction;
        if (CHECKS) {
            check(hmod);
        }
        return callPPPI(hfunc, hmod, name, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuModuleGetFunction(@NativeType("CUfunction *") PointerBuffer hfunc, @NativeType("CUmodule") long hmod, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            check(hfunc, 1);
            checkNT1(name);
        }
        return ncuModuleGetFunction(memAddress(hfunc), hmod, memAddress(name));
    }

    @NativeType("CUresult")
    public static int cuModuleGetFunction(@NativeType("CUfunction *") PointerBuffer hfunc, @NativeType("CUmodule") long hmod, @NativeType("char const *") CharSequence name) {
        if (CHECKS) {
            check(hfunc, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return ncuModuleGetFunction(memAddress(hfunc), hmod, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ cuModuleGetGlobal ] ---

    public static int ncuModuleGetGlobal(long dptr, long bytes, long hmod, long name) {
        long __functionAddress = Functions.ModuleGetGlobal;
        if (CHECKS) {
            check(hmod);
        }
        return callPPPPI(dptr, bytes, hmod, name, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuModuleGetGlobal(@Nullable @NativeType("CUdeviceptr *") PointerBuffer dptr, @Nullable @NativeType("size_t *") PointerBuffer bytes, @NativeType("CUmodule") long hmod, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkSafe(dptr, 1);
            checkSafe(bytes, 1);
            checkNT1(name);
        }
        return ncuModuleGetGlobal(memAddressSafe(dptr), memAddressSafe(bytes), hmod, memAddress(name));
    }

    @NativeType("CUresult")
    public static int cuModuleGetGlobal(@Nullable @NativeType("CUdeviceptr *") PointerBuffer dptr, @Nullable @NativeType("size_t *") PointerBuffer bytes, @NativeType("CUmodule") long hmod, @NativeType("char const *") CharSequence name) {
        if (CHECKS) {
            checkSafe(dptr, 1);
            checkSafe(bytes, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return ncuModuleGetGlobal(memAddressSafe(dptr), memAddressSafe(bytes), hmod, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ cuModuleGetTexRef ] ---

    public static int ncuModuleGetTexRef(long pTexRef, long hmod, long name) {
        long __functionAddress = Functions.ModuleGetTexRef;
        if (CHECKS) {
            check(hmod);
        }
        return callPPPI(pTexRef, hmod, name, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuModuleGetTexRef(@NativeType("CUtexref *") PointerBuffer pTexRef, @NativeType("CUmodule") long hmod, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            check(pTexRef, 1);
            checkNT1(name);
        }
        return ncuModuleGetTexRef(memAddress(pTexRef), hmod, memAddress(name));
    }

    @NativeType("CUresult")
    public static int cuModuleGetTexRef(@NativeType("CUtexref *") PointerBuffer pTexRef, @NativeType("CUmodule") long hmod, @NativeType("char const *") CharSequence name) {
        if (CHECKS) {
            check(pTexRef, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return ncuModuleGetTexRef(memAddress(pTexRef), hmod, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ cuModuleGetSurfRef ] ---

    public static int ncuModuleGetSurfRef(long pSurfRef, long hmod, long name) {
        long __functionAddress = Functions.ModuleGetSurfRef;
        if (CHECKS) {
            check(hmod);
        }
        return callPPPI(pSurfRef, hmod, name, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuModuleGetSurfRef(@NativeType("CUsurfref *") PointerBuffer pSurfRef, @NativeType("CUmodule") long hmod, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            check(pSurfRef, 1);
            checkNT1(name);
        }
        return ncuModuleGetSurfRef(memAddress(pSurfRef), hmod, memAddress(name));
    }

    @NativeType("CUresult")
    public static int cuModuleGetSurfRef(@NativeType("CUsurfref *") PointerBuffer pSurfRef, @NativeType("CUmodule") long hmod, @NativeType("char const *") CharSequence name) {
        if (CHECKS) {
            check(pSurfRef, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return ncuModuleGetSurfRef(memAddress(pSurfRef), hmod, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ cuMemGetInfo ] ---

    public static int ncuMemGetInfo(long free, long total) {
        long __functionAddress = Functions.MemGetInfo;
        return callPPI(free, total, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuMemGetInfo(@NativeType("size_t *") PointerBuffer free, @NativeType("size_t *") PointerBuffer total) {
        if (CHECKS) {
            check(free, 1);
            check(total, 1);
        }
        return ncuMemGetInfo(memAddress(free), memAddress(total));
    }

    // --- [ cuMemAlloc ] ---

    public static int ncuMemAlloc(long dptr, long bytesize) {
        long __functionAddress = Functions.MemAlloc;
        return callPPI(dptr, bytesize, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuMemAlloc(@NativeType("CUdeviceptr *") PointerBuffer dptr, @NativeType("size_t") long bytesize) {
        if (CHECKS) {
            check(dptr, 1);
        }
        return ncuMemAlloc(memAddress(dptr), bytesize);
    }

    // --- [ cuMemAllocPitch ] ---

    public static int ncuMemAllocPitch(long dptr, long pPitch, long WidthInBytes, long Height, int ElementSizeBytes) {
        long __functionAddress = Functions.MemAllocPitch;
        return callPPPPI(dptr, pPitch, WidthInBytes, Height, ElementSizeBytes, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuMemAllocPitch(@NativeType("CUdeviceptr *") PointerBuffer dptr, @NativeType("size_t *") PointerBuffer pPitch, @NativeType("size_t") long WidthInBytes, @NativeType("size_t") long Height, @NativeType("unsigned int") int ElementSizeBytes) {
        if (CHECKS) {
            check(dptr, 1);
            check(pPitch, 1);
        }
        return ncuMemAllocPitch(memAddress(dptr), memAddress(pPitch), WidthInBytes, Height, ElementSizeBytes);
    }

    // --- [ cuMemFree ] ---

    @NativeType("CUresult")
    public static int cuMemFree(@NativeType("CUdeviceptr") long dptr) {
        long __functionAddress = Functions.MemFree;
        if (CHECKS) {
            check(dptr);
        }
        return callPI(dptr, __functionAddress);
    }

    // --- [ cuMemGetAddressRange ] ---

    public static int ncuMemGetAddressRange(long pbase, long psize, long dptr) {
        long __functionAddress = Functions.MemGetAddressRange;
        if (CHECKS) {
            check(dptr);
        }
        return callPPPI(pbase, psize, dptr, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuMemGetAddressRange(@Nullable @NativeType("CUdeviceptr *") PointerBuffer pbase, @Nullable @NativeType("size_t *") PointerBuffer psize, @NativeType("CUdeviceptr") long dptr) {
        if (CHECKS) {
            checkSafe(pbase, 1);
            checkSafe(psize, 1);
        }
        return ncuMemGetAddressRange(memAddressSafe(pbase), memAddressSafe(psize), dptr);
    }

    // --- [ cuMemAllocHost ] ---

    public static int ncuMemAllocHost(long pp, long bytesize) {
        long __functionAddress = Functions.MemAllocHost;
        return callPPI(pp, bytesize, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuMemAllocHost(@NativeType("void **") PointerBuffer pp, @NativeType("size_t") long bytesize) {
        if (CHECKS) {
            check(pp, 1);
        }
        return ncuMemAllocHost(memAddress(pp), bytesize);
    }

    // --- [ cuMemFreeHost ] ---

    public static int ncuMemFreeHost(long p) {
        long __functionAddress = Functions.MemFreeHost;
        return callPI(p, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuMemFreeHost(@NativeType("void *") ByteBuffer p) {
        return ncuMemFreeHost(memAddress(p));
    }

    // --- [ cuMemHostAlloc ] ---

    public static int ncuMemHostAlloc(long pp, long bytesize, int Flags) {
        long __functionAddress = Functions.MemHostAlloc;
        return callPPI(pp, bytesize, Flags, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuMemHostAlloc(@NativeType("void **") PointerBuffer pp, @NativeType("size_t") long bytesize, @NativeType("unsigned int") int Flags) {
        if (CHECKS) {
            check(pp, 1);
        }
        return ncuMemHostAlloc(memAddress(pp), bytesize, Flags);
    }

    // --- [ cuMemHostGetDevicePointer ] ---

    public static int ncuMemHostGetDevicePointer(long pdptr, long p, int Flags) {
        long __functionAddress = Functions.MemHostGetDevicePointer;
        return callPPI(pdptr, p, Flags, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuMemHostGetDevicePointer(@NativeType("CUdeviceptr *") PointerBuffer pdptr, @NativeType("void *") ByteBuffer p, @NativeType("unsigned int") int Flags) {
        if (CHECKS) {
            check(pdptr, 1);
        }
        return ncuMemHostGetDevicePointer(memAddress(pdptr), memAddress(p), Flags);
    }

    // --- [ cuMemHostGetFlags ] ---

    public static int ncuMemHostGetFlags(long pFlags, long p) {
        long __functionAddress = Functions.MemHostGetFlags;
        return callPPI(pFlags, p, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuMemHostGetFlags(@NativeType("unsigned int *") IntBuffer pFlags, @NativeType("void *") ByteBuffer p) {
        if (CHECKS) {
            check(pFlags, 1);
        }
        return ncuMemHostGetFlags(memAddress(pFlags), memAddress(p));
    }

    // --- [ cuMemcpyHtoD ] ---

    public static int ncuMemcpyHtoD(long dstDevice, long srcHost, long ByteCount) {
        long __functionAddress = Functions.MemcpyHtoD;
        if (CHECKS) {
            check(dstDevice);
        }
        return callPPPI(dstDevice, srcHost, ByteCount, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuMemcpyHtoD(@NativeType("CUdeviceptr") long dstDevice, @NativeType("void const *") ByteBuffer srcHost) {
        return ncuMemcpyHtoD(dstDevice, memAddress(srcHost), srcHost.remaining());
    }

    @NativeType("CUresult")
    public static int cuMemcpyHtoD(@NativeType("CUdeviceptr") long dstDevice, @NativeType("void const *") ShortBuffer srcHost) {
        return ncuMemcpyHtoD(dstDevice, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << 1);
    }

    @NativeType("CUresult")
    public static int cuMemcpyHtoD(@NativeType("CUdeviceptr") long dstDevice, @NativeType("void const *") IntBuffer srcHost) {
        return ncuMemcpyHtoD(dstDevice, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << 2);
    }

    @NativeType("CUresult")
    public static int cuMemcpyHtoD(@NativeType("CUdeviceptr") long dstDevice, @NativeType("void const *") LongBuffer srcHost) {
        return ncuMemcpyHtoD(dstDevice, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << 3);
    }

    @NativeType("CUresult")
    public static int cuMemcpyHtoD(@NativeType("CUdeviceptr") long dstDevice, @NativeType("void const *") FloatBuffer srcHost) {
        return ncuMemcpyHtoD(dstDevice, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << 2);
    }

    @NativeType("CUresult")
    public static int cuMemcpyHtoD(@NativeType("CUdeviceptr") long dstDevice, @NativeType("void const *") DoubleBuffer srcHost) {
        return ncuMemcpyHtoD(dstDevice, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << 3);
    }

    @NativeType("CUresult")
    public static int cuMemcpyHtoD(@NativeType("CUdeviceptr") long dstDevice, @NativeType("void const *") PointerBuffer srcHost) {
        return ncuMemcpyHtoD(dstDevice, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << POINTER_SHIFT);
    }

    // --- [ cuMemcpyDtoH ] ---

    public static int ncuMemcpyDtoH(long dstHost, long srcDevice, long ByteCount) {
        long __functionAddress = Functions.MemcpyDtoH;
        if (CHECKS) {
            check(srcDevice);
        }
        return callPPPI(dstHost, srcDevice, ByteCount, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuMemcpyDtoH(@NativeType("void *") ByteBuffer dstHost, @NativeType("CUdeviceptr") long srcDevice) {
        return ncuMemcpyDtoH(memAddress(dstHost), srcDevice, dstHost.remaining());
    }

    @NativeType("CUresult")
    public static int cuMemcpyDtoH(@NativeType("void *") ShortBuffer dstHost, @NativeType("CUdeviceptr") long srcDevice) {
        return ncuMemcpyDtoH(memAddress(dstHost), srcDevice, Integer.toUnsignedLong(dstHost.remaining()) << 1);
    }

    @NativeType("CUresult")
    public static int cuMemcpyDtoH(@NativeType("void *") IntBuffer dstHost, @NativeType("CUdeviceptr") long srcDevice) {
        return ncuMemcpyDtoH(memAddress(dstHost), srcDevice, Integer.toUnsignedLong(dstHost.remaining()) << 2);
    }

    @NativeType("CUresult")
    public static int cuMemcpyDtoH(@NativeType("void *") LongBuffer dstHost, @NativeType("CUdeviceptr") long srcDevice) {
        return ncuMemcpyDtoH(memAddress(dstHost), srcDevice, Integer.toUnsignedLong(dstHost.remaining()) << 3);
    }

    @NativeType("CUresult")
    public static int cuMemcpyDtoH(@NativeType("void *") FloatBuffer dstHost, @NativeType("CUdeviceptr") long srcDevice) {
        return ncuMemcpyDtoH(memAddress(dstHost), srcDevice, Integer.toUnsignedLong(dstHost.remaining()) << 2);
    }

    @NativeType("CUresult")
    public static int cuMemcpyDtoH(@NativeType("void *") DoubleBuffer dstHost, @NativeType("CUdeviceptr") long srcDevice) {
        return ncuMemcpyDtoH(memAddress(dstHost), srcDevice, Integer.toUnsignedLong(dstHost.remaining()) << 3);
    }

    @NativeType("CUresult")
    public static int cuMemcpyDtoH(@NativeType("void *") PointerBuffer dstHost, @NativeType("CUdeviceptr") long srcDevice) {
        return ncuMemcpyDtoH(memAddress(dstHost), srcDevice, Integer.toUnsignedLong(dstHost.remaining()) << POINTER_SHIFT);
    }

    // --- [ cuMemcpyDtoD ] ---

    @NativeType("CUresult")
    public static int cuMemcpyDtoD(@NativeType("CUdeviceptr") long dstDevice, @NativeType("CUdeviceptr") long srcDevice, @NativeType("size_t") long ByteCount) {
        long __functionAddress = Functions.MemcpyDtoD;
        if (CHECKS) {
            check(dstDevice);
            check(srcDevice);
        }
        return callPPPI(dstDevice, srcDevice, ByteCount, __functionAddress);
    }

    // --- [ cuMemcpyDtoA ] ---

    @NativeType("CUresult")
    public static int cuMemcpyDtoA(@NativeType("CUarray") long dstArray, @NativeType("size_t") long dstOffset, @NativeType("CUdeviceptr") long srcDevice, @NativeType("size_t") long ByteCount) {
        long __functionAddress = Functions.MemcpyDtoA;
        if (CHECKS) {
            check(dstArray);
            check(srcDevice);
        }
        return callPPPPI(dstArray, dstOffset, srcDevice, ByteCount, __functionAddress);
    }

    // --- [ cuMemcpyAtoD ] ---

    @NativeType("CUresult")
    public static int cuMemcpyAtoD(@NativeType("CUdeviceptr") long dstDevice, @NativeType("CUarray") long srcArray, @NativeType("size_t") long srcOffset, @NativeType("size_t") long ByteCount) {
        long __functionAddress = Functions.MemcpyAtoD;
        if (CHECKS) {
            check(dstDevice);
            check(srcArray);
        }
        return callPPPPI(dstDevice, srcArray, srcOffset, ByteCount, __functionAddress);
    }

    // --- [ cuMemcpyHtoA ] ---

    public static int ncuMemcpyHtoA(long dstArray, long dstOffset, long srcHost, long ByteCount) {
        long __functionAddress = Functions.MemcpyHtoA;
        if (CHECKS) {
            check(dstArray);
        }
        return callPPPPI(dstArray, dstOffset, srcHost, ByteCount, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuMemcpyHtoA(@NativeType("CUarray") long dstArray, @NativeType("size_t") long dstOffset, @NativeType("void const *") ByteBuffer srcHost) {
        return ncuMemcpyHtoA(dstArray, dstOffset, memAddress(srcHost), srcHost.remaining());
    }

    @NativeType("CUresult")
    public static int cuMemcpyHtoA(@NativeType("CUarray") long dstArray, @NativeType("size_t") long dstOffset, @NativeType("void const *") ShortBuffer srcHost) {
        return ncuMemcpyHtoA(dstArray, dstOffset, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << 1);
    }

    @NativeType("CUresult")
    public static int cuMemcpyHtoA(@NativeType("CUarray") long dstArray, @NativeType("size_t") long dstOffset, @NativeType("void const *") IntBuffer srcHost) {
        return ncuMemcpyHtoA(dstArray, dstOffset, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << 2);
    }

    @NativeType("CUresult")
    public static int cuMemcpyHtoA(@NativeType("CUarray") long dstArray, @NativeType("size_t") long dstOffset, @NativeType("void const *") LongBuffer srcHost) {
        return ncuMemcpyHtoA(dstArray, dstOffset, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << 3);
    }

    @NativeType("CUresult")
    public static int cuMemcpyHtoA(@NativeType("CUarray") long dstArray, @NativeType("size_t") long dstOffset, @NativeType("void const *") FloatBuffer srcHost) {
        return ncuMemcpyHtoA(dstArray, dstOffset, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << 2);
    }

    @NativeType("CUresult")
    public static int cuMemcpyHtoA(@NativeType("CUarray") long dstArray, @NativeType("size_t") long dstOffset, @NativeType("void const *") DoubleBuffer srcHost) {
        return ncuMemcpyHtoA(dstArray, dstOffset, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << 3);
    }

    @NativeType("CUresult")
    public static int cuMemcpyHtoA(@NativeType("CUarray") long dstArray, @NativeType("size_t") long dstOffset, @NativeType("void const *") PointerBuffer srcHost) {
        return ncuMemcpyHtoA(dstArray, dstOffset, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << POINTER_SHIFT);
    }

    // --- [ cuMemcpyAtoH ] ---

    public static int ncuMemcpyAtoH(long dstHost, long srcArray, long srcOffset, long ByteCount) {
        long __functionAddress = Functions.MemcpyAtoH;
        if (CHECKS) {
            check(srcArray);
        }
        return callPPPPI(dstHost, srcArray, srcOffset, ByteCount, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuMemcpyAtoH(@NativeType("void *") ByteBuffer dstHost, @NativeType("CUarray") long srcArray, @NativeType("size_t") long srcOffset) {
        return ncuMemcpyAtoH(memAddress(dstHost), srcArray, srcOffset, dstHost.remaining());
    }

    @NativeType("CUresult")
    public static int cuMemcpyAtoH(@NativeType("void *") ShortBuffer dstHost, @NativeType("CUarray") long srcArray, @NativeType("size_t") long srcOffset) {
        return ncuMemcpyAtoH(memAddress(dstHost), srcArray, srcOffset, Integer.toUnsignedLong(dstHost.remaining()) << 1);
    }

    @NativeType("CUresult")
    public static int cuMemcpyAtoH(@NativeType("void *") IntBuffer dstHost, @NativeType("CUarray") long srcArray, @NativeType("size_t") long srcOffset) {
        return ncuMemcpyAtoH(memAddress(dstHost), srcArray, srcOffset, Integer.toUnsignedLong(dstHost.remaining()) << 2);
    }

    @NativeType("CUresult")
    public static int cuMemcpyAtoH(@NativeType("void *") LongBuffer dstHost, @NativeType("CUarray") long srcArray, @NativeType("size_t") long srcOffset) {
        return ncuMemcpyAtoH(memAddress(dstHost), srcArray, srcOffset, Integer.toUnsignedLong(dstHost.remaining()) << 3);
    }

    @NativeType("CUresult")
    public static int cuMemcpyAtoH(@NativeType("void *") FloatBuffer dstHost, @NativeType("CUarray") long srcArray, @NativeType("size_t") long srcOffset) {
        return ncuMemcpyAtoH(memAddress(dstHost), srcArray, srcOffset, Integer.toUnsignedLong(dstHost.remaining()) << 2);
    }

    @NativeType("CUresult")
    public static int cuMemcpyAtoH(@NativeType("void *") DoubleBuffer dstHost, @NativeType("CUarray") long srcArray, @NativeType("size_t") long srcOffset) {
        return ncuMemcpyAtoH(memAddress(dstHost), srcArray, srcOffset, Integer.toUnsignedLong(dstHost.remaining()) << 3);
    }

    @NativeType("CUresult")
    public static int cuMemcpyAtoH(@NativeType("void *") PointerBuffer dstHost, @NativeType("CUarray") long srcArray, @NativeType("size_t") long srcOffset) {
        return ncuMemcpyAtoH(memAddress(dstHost), srcArray, srcOffset, Integer.toUnsignedLong(dstHost.remaining()) << POINTER_SHIFT);
    }

    // --- [ cuMemcpyAtoA ] ---

    @NativeType("CUresult")
    public static int cuMemcpyAtoA(@NativeType("CUarray") long dstArray, @NativeType("size_t") long dstOffset, @NativeType("CUarray") long srcArray, @NativeType("size_t") long srcOffset, @NativeType("size_t") long ByteCount) {
        long __functionAddress = Functions.MemcpyAtoA;
        if (CHECKS) {
            check(dstArray);
            check(srcArray);
        }
        return callPPPPPI(dstArray, dstOffset, srcArray, srcOffset, ByteCount, __functionAddress);
    }

    // --- [ cuMemcpy2D ] ---

    public static int ncuMemcpy2D(long pCopy) {
        long __functionAddress = Functions.Memcpy2D;
        if (CHECKS) {
            CUDA_MEMCPY2D.validate(pCopy);
        }
        return callPI(pCopy, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuMemcpy2D(@NativeType("CUDA_MEMCPY2D const *") CUDA_MEMCPY2D pCopy) {
        return ncuMemcpy2D(pCopy.address());
    }

    // --- [ cuMemcpy2DUnaligned ] ---

    public static int ncuMemcpy2DUnaligned(long pCopy) {
        long __functionAddress = Functions.Memcpy2DUnaligned;
        if (CHECKS) {
            CUDA_MEMCPY2D.validate(pCopy);
        }
        return callPI(pCopy, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuMemcpy2DUnaligned(@NativeType("CUDA_MEMCPY2D const *") CUDA_MEMCPY2D pCopy) {
        return ncuMemcpy2DUnaligned(pCopy.address());
    }

    // --- [ cuMemcpy3D ] ---

    public static int ncuMemcpy3D(long pCopy) {
        long __functionAddress = Functions.Memcpy3D;
        if (CHECKS) {
            CUDA_MEMCPY3D.validate(pCopy);
        }
        return callPI(pCopy, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuMemcpy3D(@NativeType("CUDA_MEMCPY3D const *") CUDA_MEMCPY3D pCopy) {
        return ncuMemcpy3D(pCopy.address());
    }

    // --- [ cuMemcpyHtoDAsync ] ---

    public static int ncuMemcpyHtoDAsync(long dstDevice, long srcHost, long ByteCount, long hStream) {
        long __functionAddress = Functions.MemcpyHtoDAsync;
        if (CHECKS) {
            check(dstDevice);
        }
        return callPPPPI(dstDevice, srcHost, ByteCount, hStream, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuMemcpyHtoDAsync(@NativeType("CUdeviceptr") long dstDevice, @NativeType("void const *") ByteBuffer srcHost, @NativeType("CUstream") long hStream) {
        return ncuMemcpyHtoDAsync(dstDevice, memAddress(srcHost), srcHost.remaining(), hStream);
    }

    @NativeType("CUresult")
    public static int cuMemcpyHtoDAsync(@NativeType("CUdeviceptr") long dstDevice, @NativeType("void const *") ShortBuffer srcHost, @NativeType("CUstream") long hStream) {
        return ncuMemcpyHtoDAsync(dstDevice, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << 1, hStream);
    }

    @NativeType("CUresult")
    public static int cuMemcpyHtoDAsync(@NativeType("CUdeviceptr") long dstDevice, @NativeType("void const *") IntBuffer srcHost, @NativeType("CUstream") long hStream) {
        return ncuMemcpyHtoDAsync(dstDevice, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << 2, hStream);
    }

    @NativeType("CUresult")
    public static int cuMemcpyHtoDAsync(@NativeType("CUdeviceptr") long dstDevice, @NativeType("void const *") LongBuffer srcHost, @NativeType("CUstream") long hStream) {
        return ncuMemcpyHtoDAsync(dstDevice, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << 3, hStream);
    }

    @NativeType("CUresult")
    public static int cuMemcpyHtoDAsync(@NativeType("CUdeviceptr") long dstDevice, @NativeType("void const *") FloatBuffer srcHost, @NativeType("CUstream") long hStream) {
        return ncuMemcpyHtoDAsync(dstDevice, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << 2, hStream);
    }

    @NativeType("CUresult")
    public static int cuMemcpyHtoDAsync(@NativeType("CUdeviceptr") long dstDevice, @NativeType("void const *") DoubleBuffer srcHost, @NativeType("CUstream") long hStream) {
        return ncuMemcpyHtoDAsync(dstDevice, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << 3, hStream);
    }

    @NativeType("CUresult")
    public static int cuMemcpyHtoDAsync(@NativeType("CUdeviceptr") long dstDevice, @NativeType("void const *") PointerBuffer srcHost, @NativeType("CUstream") long hStream) {
        return ncuMemcpyHtoDAsync(dstDevice, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << POINTER_SHIFT, hStream);
    }

    // --- [ cuMemcpyDtoHAsync ] ---

    public static int ncuMemcpyDtoHAsync(long dstHost, long srcDevice, long ByteCount, long hStream) {
        long __functionAddress = Functions.MemcpyDtoHAsync;
        if (CHECKS) {
            check(srcDevice);
        }
        return callPPPPI(dstHost, srcDevice, ByteCount, hStream, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuMemcpyDtoHAsync(@NativeType("void *") ByteBuffer dstHost, @NativeType("CUdeviceptr") long srcDevice, @NativeType("CUstream") long hStream) {
        return ncuMemcpyDtoHAsync(memAddress(dstHost), srcDevice, dstHost.remaining(), hStream);
    }

    @NativeType("CUresult")
    public static int cuMemcpyDtoHAsync(@NativeType("void *") ShortBuffer dstHost, @NativeType("CUdeviceptr") long srcDevice, @NativeType("CUstream") long hStream) {
        return ncuMemcpyDtoHAsync(memAddress(dstHost), srcDevice, Integer.toUnsignedLong(dstHost.remaining()) << 1, hStream);
    }

    @NativeType("CUresult")
    public static int cuMemcpyDtoHAsync(@NativeType("void *") IntBuffer dstHost, @NativeType("CUdeviceptr") long srcDevice, @NativeType("CUstream") long hStream) {
        return ncuMemcpyDtoHAsync(memAddress(dstHost), srcDevice, Integer.toUnsignedLong(dstHost.remaining()) << 2, hStream);
    }

    @NativeType("CUresult")
    public static int cuMemcpyDtoHAsync(@NativeType("void *") LongBuffer dstHost, @NativeType("CUdeviceptr") long srcDevice, @NativeType("CUstream") long hStream) {
        return ncuMemcpyDtoHAsync(memAddress(dstHost), srcDevice, Integer.toUnsignedLong(dstHost.remaining()) << 3, hStream);
    }

    @NativeType("CUresult")
    public static int cuMemcpyDtoHAsync(@NativeType("void *") FloatBuffer dstHost, @NativeType("CUdeviceptr") long srcDevice, @NativeType("CUstream") long hStream) {
        return ncuMemcpyDtoHAsync(memAddress(dstHost), srcDevice, Integer.toUnsignedLong(dstHost.remaining()) << 2, hStream);
    }

    @NativeType("CUresult")
    public static int cuMemcpyDtoHAsync(@NativeType("void *") DoubleBuffer dstHost, @NativeType("CUdeviceptr") long srcDevice, @NativeType("CUstream") long hStream) {
        return ncuMemcpyDtoHAsync(memAddress(dstHost), srcDevice, Integer.toUnsignedLong(dstHost.remaining()) << 3, hStream);
    }

    @NativeType("CUresult")
    public static int cuMemcpyDtoHAsync(@NativeType("void *") PointerBuffer dstHost, @NativeType("CUdeviceptr") long srcDevice, @NativeType("CUstream") long hStream) {
        return ncuMemcpyDtoHAsync(memAddress(dstHost), srcDevice, Integer.toUnsignedLong(dstHost.remaining()) << POINTER_SHIFT, hStream);
    }

    // --- [ cuMemcpyDtoDAsync ] ---

    @NativeType("CUresult")
    public static int cuMemcpyDtoDAsync(@NativeType("CUdeviceptr") long dstDevice, @NativeType("CUdeviceptr") long srcDevice, @NativeType("size_t") long ByteCount, @NativeType("CUstream") long hStream) {
        long __functionAddress = Functions.MemcpyDtoDAsync;
        if (CHECKS) {
            check(dstDevice);
            check(srcDevice);
        }
        return callPPPPI(dstDevice, srcDevice, ByteCount, hStream, __functionAddress);
    }

    // --- [ cuMemcpyHtoAAsync ] ---

    public static int ncuMemcpyHtoAAsync(long dstArray, long dstOffset, long srcHost, long ByteCount, long hStream) {
        long __functionAddress = Functions.MemcpyHtoAAsync;
        if (CHECKS) {
            check(dstArray);
        }
        return callPPPPPI(dstArray, dstOffset, srcHost, ByteCount, hStream, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuMemcpyHtoAAsync(@NativeType("CUarray") long dstArray, @NativeType("size_t") long dstOffset, @NativeType("void const *") ByteBuffer srcHost, @NativeType("CUstream") long hStream) {
        return ncuMemcpyHtoAAsync(dstArray, dstOffset, memAddress(srcHost), srcHost.remaining(), hStream);
    }

    @NativeType("CUresult")
    public static int cuMemcpyHtoAAsync(@NativeType("CUarray") long dstArray, @NativeType("size_t") long dstOffset, @NativeType("void const *") ShortBuffer srcHost, @NativeType("CUstream") long hStream) {
        return ncuMemcpyHtoAAsync(dstArray, dstOffset, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << 1, hStream);
    }

    @NativeType("CUresult")
    public static int cuMemcpyHtoAAsync(@NativeType("CUarray") long dstArray, @NativeType("size_t") long dstOffset, @NativeType("void const *") IntBuffer srcHost, @NativeType("CUstream") long hStream) {
        return ncuMemcpyHtoAAsync(dstArray, dstOffset, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << 2, hStream);
    }

    @NativeType("CUresult")
    public static int cuMemcpyHtoAAsync(@NativeType("CUarray") long dstArray, @NativeType("size_t") long dstOffset, @NativeType("void const *") LongBuffer srcHost, @NativeType("CUstream") long hStream) {
        return ncuMemcpyHtoAAsync(dstArray, dstOffset, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << 3, hStream);
    }

    @NativeType("CUresult")
    public static int cuMemcpyHtoAAsync(@NativeType("CUarray") long dstArray, @NativeType("size_t") long dstOffset, @NativeType("void const *") FloatBuffer srcHost, @NativeType("CUstream") long hStream) {
        return ncuMemcpyHtoAAsync(dstArray, dstOffset, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << 2, hStream);
    }

    @NativeType("CUresult")
    public static int cuMemcpyHtoAAsync(@NativeType("CUarray") long dstArray, @NativeType("size_t") long dstOffset, @NativeType("void const *") DoubleBuffer srcHost, @NativeType("CUstream") long hStream) {
        return ncuMemcpyHtoAAsync(dstArray, dstOffset, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << 3, hStream);
    }

    @NativeType("CUresult")
    public static int cuMemcpyHtoAAsync(@NativeType("CUarray") long dstArray, @NativeType("size_t") long dstOffset, @NativeType("void const *") PointerBuffer srcHost, @NativeType("CUstream") long hStream) {
        return ncuMemcpyHtoAAsync(dstArray, dstOffset, memAddress(srcHost), Integer.toUnsignedLong(srcHost.remaining()) << POINTER_SHIFT, hStream);
    }

    // --- [ cuMemcpyAtoHAsync ] ---

    public static int ncuMemcpyAtoHAsync(long dstHost, long srcArray, long srcOffset, long ByteCount, long hStream) {
        long __functionAddress = Functions.MemcpyAtoHAsync;
        if (CHECKS) {
            check(srcArray);
        }
        return callPPPPPI(dstHost, srcArray, srcOffset, ByteCount, hStream, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuMemcpyAtoHAsync(@NativeType("void *") ByteBuffer dstHost, @NativeType("CUarray") long srcArray, @NativeType("size_t") long srcOffset, @NativeType("CUstream") long hStream) {
        return ncuMemcpyAtoHAsync(memAddress(dstHost), srcArray, srcOffset, dstHost.remaining(), hStream);
    }

    @NativeType("CUresult")
    public static int cuMemcpyAtoHAsync(@NativeType("void *") ShortBuffer dstHost, @NativeType("CUarray") long srcArray, @NativeType("size_t") long srcOffset, @NativeType("CUstream") long hStream) {
        return ncuMemcpyAtoHAsync(memAddress(dstHost), srcArray, srcOffset, Integer.toUnsignedLong(dstHost.remaining()) << 1, hStream);
    }

    @NativeType("CUresult")
    public static int cuMemcpyAtoHAsync(@NativeType("void *") IntBuffer dstHost, @NativeType("CUarray") long srcArray, @NativeType("size_t") long srcOffset, @NativeType("CUstream") long hStream) {
        return ncuMemcpyAtoHAsync(memAddress(dstHost), srcArray, srcOffset, Integer.toUnsignedLong(dstHost.remaining()) << 2, hStream);
    }

    @NativeType("CUresult")
    public static int cuMemcpyAtoHAsync(@NativeType("void *") LongBuffer dstHost, @NativeType("CUarray") long srcArray, @NativeType("size_t") long srcOffset, @NativeType("CUstream") long hStream) {
        return ncuMemcpyAtoHAsync(memAddress(dstHost), srcArray, srcOffset, Integer.toUnsignedLong(dstHost.remaining()) << 3, hStream);
    }

    @NativeType("CUresult")
    public static int cuMemcpyAtoHAsync(@NativeType("void *") FloatBuffer dstHost, @NativeType("CUarray") long srcArray, @NativeType("size_t") long srcOffset, @NativeType("CUstream") long hStream) {
        return ncuMemcpyAtoHAsync(memAddress(dstHost), srcArray, srcOffset, Integer.toUnsignedLong(dstHost.remaining()) << 2, hStream);
    }

    @NativeType("CUresult")
    public static int cuMemcpyAtoHAsync(@NativeType("void *") DoubleBuffer dstHost, @NativeType("CUarray") long srcArray, @NativeType("size_t") long srcOffset, @NativeType("CUstream") long hStream) {
        return ncuMemcpyAtoHAsync(memAddress(dstHost), srcArray, srcOffset, Integer.toUnsignedLong(dstHost.remaining()) << 3, hStream);
    }

    @NativeType("CUresult")
    public static int cuMemcpyAtoHAsync(@NativeType("void *") PointerBuffer dstHost, @NativeType("CUarray") long srcArray, @NativeType("size_t") long srcOffset, @NativeType("CUstream") long hStream) {
        return ncuMemcpyAtoHAsync(memAddress(dstHost), srcArray, srcOffset, Integer.toUnsignedLong(dstHost.remaining()) << POINTER_SHIFT, hStream);
    }

    // --- [ cuMemcpy2DAsync ] ---

    public static int ncuMemcpy2DAsync(long pCopy, long hStream) {
        long __functionAddress = Functions.Memcpy2DAsync;
        if (CHECKS) {
            CUDA_MEMCPY2D.validate(pCopy);
        }
        return callPPI(pCopy, hStream, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuMemcpy2DAsync(@NativeType("CUDA_MEMCPY2D const *") CUDA_MEMCPY2D pCopy, @NativeType("CUstream") long hStream) {
        return ncuMemcpy2DAsync(pCopy.address(), hStream);
    }

    // --- [ cuMemcpy3DAsync ] ---

    public static int ncuMemcpy3DAsync(long pCopy, long hStream) {
        long __functionAddress = Functions.Memcpy3DAsync;
        if (CHECKS) {
            CUDA_MEMCPY3D.validate(pCopy);
        }
        return callPPI(pCopy, hStream, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuMemcpy3DAsync(@NativeType("CUDA_MEMCPY3D const *") CUDA_MEMCPY3D pCopy, @NativeType("CUstream") long hStream) {
        return ncuMemcpy3DAsync(pCopy.address(), hStream);
    }

    // --- [ cuMemsetD8 ] ---

    @NativeType("CUresult")
    public static int cuMemsetD8(@NativeType("CUdeviceptr") long dstDevice, @NativeType("unsigned char") byte uc, @NativeType("size_t") long N) {
        long __functionAddress = Functions.MemsetD8;
        if (CHECKS) {
            check(dstDevice);
        }
        return callPPI(dstDevice, uc, N, __functionAddress);
    }

    // --- [ cuMemsetD16 ] ---

    @NativeType("CUresult")
    public static int cuMemsetD16(@NativeType("CUdeviceptr") long dstDevice, @NativeType("unsigned short") short us, @NativeType("size_t") long N) {
        long __functionAddress = Functions.MemsetD16;
        if (CHECKS) {
            check(dstDevice);
        }
        return callPPI(dstDevice, us, N, __functionAddress);
    }

    // --- [ cuMemsetD32 ] ---

    @NativeType("CUresult")
    public static int cuMemsetD32(@NativeType("CUdeviceptr") long dstDevice, @NativeType("unsigned int") int ui, @NativeType("size_t") long N) {
        long __functionAddress = Functions.MemsetD32;
        if (CHECKS) {
            check(dstDevice);
        }
        return callPPI(dstDevice, ui, N, __functionAddress);
    }

    // --- [ cuMemsetD2D8 ] ---

    @NativeType("CUresult")
    public static int cuMemsetD2D8(@NativeType("CUdeviceptr") long dstDevice, @NativeType("size_t") long dstPitch, @NativeType("unsigned char") byte uc, @NativeType("size_t") long Width, @NativeType("size_t") long Height) {
        long __functionAddress = Functions.MemsetD2D8;
        if (CHECKS) {
            check(dstDevice);
        }
        return callPPPPI(dstDevice, dstPitch, uc, Width, Height, __functionAddress);
    }

    // --- [ cuMemsetD2D16 ] ---

    @NativeType("CUresult")
    public static int cuMemsetD2D16(@NativeType("CUdeviceptr") long dstDevice, @NativeType("size_t") long dstPitch, @NativeType("unsigned short") short us, @NativeType("size_t") long Width, @NativeType("size_t") long Height) {
        long __functionAddress = Functions.MemsetD2D16;
        if (CHECKS) {
            check(dstDevice);
        }
        return callPPPPI(dstDevice, dstPitch, us, Width, Height, __functionAddress);
    }

    // --- [ cuMemsetD2D32 ] ---

    @NativeType("CUresult")
    public static int cuMemsetD2D32(@NativeType("CUdeviceptr") long dstDevice, @NativeType("size_t") long dstPitch, @NativeType("unsigned int") int ui, @NativeType("size_t") long Width, @NativeType("size_t") long Height) {
        long __functionAddress = Functions.MemsetD2D32;
        if (CHECKS) {
            check(dstDevice);
        }
        return callPPPPI(dstDevice, dstPitch, ui, Width, Height, __functionAddress);
    }

    // --- [ cuMemsetD8Async ] ---

    @NativeType("CUresult")
    public static int cuMemsetD8Async(@NativeType("CUdeviceptr") long dstDevice, @NativeType("unsigned char") byte uc, @NativeType("size_t") long N, @NativeType("CUstream") long hStream) {
        long __functionAddress = Functions.MemsetD8Async;
        if (CHECKS) {
            check(dstDevice);
        }
        return callPPPI(dstDevice, uc, N, hStream, __functionAddress);
    }

    // --- [ cuMemsetD16Async ] ---

    @NativeType("CUresult")
    public static int cuMemsetD16Async(@NativeType("CUdeviceptr") long dstDevice, @NativeType("unsigned short") short us, @NativeType("size_t") long N, @NativeType("CUstream") long hStream) {
        long __functionAddress = Functions.MemsetD16Async;
        if (CHECKS) {
            check(dstDevice);
        }
        return callPPPI(dstDevice, us, N, hStream, __functionAddress);
    }

    // --- [ cuMemsetD32Async ] ---

    @NativeType("CUresult")
    public static int cuMemsetD32Async(@NativeType("CUdeviceptr") long dstDevice, @NativeType("unsigned int") int ui, @NativeType("size_t") long N, @NativeType("CUstream") long hStream) {
        long __functionAddress = Functions.MemsetD32Async;
        if (CHECKS) {
            check(dstDevice);
        }
        return callPPPI(dstDevice, ui, N, hStream, __functionAddress);
    }

    // --- [ cuMemsetD2D8Async ] ---

    @NativeType("CUresult")
    public static int cuMemsetD2D8Async(@NativeType("CUdeviceptr") long dstDevice, @NativeType("size_t") long dstPitch, @NativeType("unsigned char") byte uc, @NativeType("size_t") long Width, @NativeType("size_t") long Height, @NativeType("CUstream") long hStream) {
        long __functionAddress = Functions.MemsetD2D8Async;
        if (CHECKS) {
            check(dstDevice);
        }
        return callPPPPPI(dstDevice, dstPitch, uc, Width, Height, hStream, __functionAddress);
    }

    // --- [ cuMemsetD2D16Async ] ---

    @NativeType("CUresult")
    public static int cuMemsetD2D16Async(@NativeType("CUdeviceptr") long dstDevice, @NativeType("size_t") long dstPitch, @NativeType("unsigned short") short us, @NativeType("size_t") long Width, @NativeType("size_t") long Height, @NativeType("CUstream") long hStream) {
        long __functionAddress = Functions.MemsetD2D16Async;
        if (CHECKS) {
            check(dstDevice);
        }
        return callPPPPPI(dstDevice, dstPitch, us, Width, Height, hStream, __functionAddress);
    }

    // --- [ cuMemsetD2D32Async ] ---

    @NativeType("CUresult")
    public static int cuMemsetD2D32Async(@NativeType("CUdeviceptr") long dstDevice, @NativeType("size_t") long dstPitch, @NativeType("unsigned int") int ui, @NativeType("size_t") long Width, @NativeType("size_t") long Height, @NativeType("CUstream") long hStream) {
        long __functionAddress = Functions.MemsetD2D32Async;
        if (CHECKS) {
            check(dstDevice);
        }
        return callPPPPPI(dstDevice, dstPitch, ui, Width, Height, hStream, __functionAddress);
    }

    // --- [ cuArrayCreate ] ---

    public static int ncuArrayCreate(long pHandle, long pAllocateArray) {
        long __functionAddress = Functions.ArrayCreate;
        return callPPI(pHandle, pAllocateArray, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuArrayCreate(@NativeType("CUarray *") PointerBuffer pHandle, @NativeType("CUDA_ARRAY_DESCRIPTOR const *") CUDA_ARRAY_DESCRIPTOR pAllocateArray) {
        if (CHECKS) {
            check(pHandle, 1);
        }
        return ncuArrayCreate(memAddress(pHandle), pAllocateArray.address());
    }

    // --- [ cuArrayGetDescriptor ] ---

    public static int ncuArrayGetDescriptor(long pArrayDescriptor, long hArray) {
        long __functionAddress = Functions.ArrayGetDescriptor;
        if (CHECKS) {
            check(hArray);
        }
        return callPPI(pArrayDescriptor, hArray, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuArrayGetDescriptor(@NativeType("CUDA_ARRAY_DESCRIPTOR *") CUDA_ARRAY_DESCRIPTOR pArrayDescriptor, @NativeType("CUarray") long hArray) {
        return ncuArrayGetDescriptor(pArrayDescriptor.address(), hArray);
    }

    // --- [ cuArrayDestroy ] ---

    @NativeType("CUresult")
    public static int cuArrayDestroy(@NativeType("CUarray") long hArray) {
        long __functionAddress = Functions.ArrayDestroy;
        if (CHECKS) {
            check(hArray);
        }
        return callPI(hArray, __functionAddress);
    }

    // --- [ cuArray3DCreate ] ---

    public static int ncuArray3DCreate(long pHandle, long pAllocateArray) {
        long __functionAddress = Functions.Array3DCreate;
        return callPPI(pHandle, pAllocateArray, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuArray3DCreate(@NativeType("CUarray *") PointerBuffer pHandle, @NativeType("CUDA_ARRAY3D_DESCRIPTOR const *") CUDA_ARRAY3D_DESCRIPTOR pAllocateArray) {
        if (CHECKS) {
            check(pHandle, 1);
        }
        return ncuArray3DCreate(memAddress(pHandle), pAllocateArray.address());
    }

    // --- [ cuArray3DGetDescriptor ] ---

    public static int ncuArray3DGetDescriptor(long pArrayDescriptor, long hArray) {
        long __functionAddress = Functions.Array3DGetDescriptor;
        if (CHECKS) {
            check(hArray);
        }
        return callPPI(pArrayDescriptor, hArray, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuArray3DGetDescriptor(@NativeType("CUDA_ARRAY3D_DESCRIPTOR *") CUDA_ARRAY3D_DESCRIPTOR pArrayDescriptor, @NativeType("CUarray") long hArray) {
        return ncuArray3DGetDescriptor(pArrayDescriptor.address(), hArray);
    }

    // --- [ cuStreamCreate ] ---

    public static int ncuStreamCreate(long phStream, int Flags) {
        long __functionAddress = Functions.StreamCreate;
        return callPI(phStream, Flags, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuStreamCreate(@NativeType("CUstream *") PointerBuffer phStream, @NativeType("unsigned int") int Flags) {
        if (CHECKS) {
            check(phStream, 1);
        }
        return ncuStreamCreate(memAddress(phStream), Flags);
    }

    // --- [ cuStreamCreateWithPriority ] ---

    public static int ncuStreamCreateWithPriority(long phStream, int flags, int priority) {
        long __functionAddress = Functions.StreamCreateWithPriority;
        return callPI(phStream, flags, priority, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuStreamCreateWithPriority(@NativeType("CUstream *") PointerBuffer phStream, @NativeType("unsigned int") int flags, int priority) {
        if (CHECKS) {
            check(phStream, 1);
        }
        return ncuStreamCreateWithPriority(memAddress(phStream), flags, priority);
    }

    // --- [ cuStreamGetPriority ] ---

    public static int ncuStreamGetPriority(long hStream, long priority) {
        long __functionAddress = Functions.StreamGetPriority;
        if (CHECKS) {
            check(hStream);
        }
        return callPPI(hStream, priority, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuStreamGetPriority(@NativeType("CUstream") long hStream, @NativeType("int *") IntBuffer priority) {
        if (CHECKS) {
            check(priority, 1);
        }
        return ncuStreamGetPriority(hStream, memAddress(priority));
    }

    // --- [ cuStreamGetFlags ] ---

    public static int ncuStreamGetFlags(long hStream, long flags) {
        long __functionAddress = Functions.StreamGetFlags;
        if (CHECKS) {
            check(hStream);
        }
        return callPPI(hStream, flags, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuStreamGetFlags(@NativeType("CUstream") long hStream, @NativeType("unsigned int *") IntBuffer flags) {
        if (CHECKS) {
            check(flags, 1);
        }
        return ncuStreamGetFlags(hStream, memAddress(flags));
    }

    // --- [ cuStreamWaitEvent ] ---

    @NativeType("CUresult")
    public static int cuStreamWaitEvent(@NativeType("CUstream") long hStream, @NativeType("CUevent") long hEvent, @NativeType("unsigned int") int Flags) {
        long __functionAddress = Functions.StreamWaitEvent;
        if (CHECKS) {
            check(hEvent);
        }
        return callPPI(hStream, hEvent, Flags, __functionAddress);
    }

    // --- [ cuStreamAddCallback ] ---

    public static int ncuStreamAddCallback(long hStream, long callback, long userData, int flags) {
        long __functionAddress = Functions.StreamAddCallback;
        if (CHECKS) {
            check(userData);
        }
        return callPPPI(hStream, callback, userData, flags, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuStreamAddCallback(@NativeType("CUstream") long hStream, @NativeType("void (*) (CUstream, CUresult, void *)") CUstreamCallbackI callback, @NativeType("void *") long userData, @NativeType("unsigned int") int flags) {
        return ncuStreamAddCallback(hStream, callback.address(), userData, flags);
    }

    // --- [ cuStreamQuery ] ---

    @NativeType("CUresult")
    public static int cuStreamQuery(@NativeType("CUstream") long hStream) {
        long __functionAddress = Functions.StreamQuery;
        return callPI(hStream, __functionAddress);
    }

    // --- [ cuStreamSynchronize ] ---

    @NativeType("CUresult")
    public static int cuStreamSynchronize(@NativeType("CUstream") long hStream) {
        long __functionAddress = Functions.StreamSynchronize;
        return callPI(hStream, __functionAddress);
    }

    // --- [ cuEventCreate ] ---

    public static int ncuEventCreate(long phEvent, int Flags) {
        long __functionAddress = Functions.EventCreate;
        return callPI(phEvent, Flags, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuEventCreate(@NativeType("CUevent *") PointerBuffer phEvent, @NativeType("unsigned int") int Flags) {
        if (CHECKS) {
            check(phEvent, 1);
        }
        return ncuEventCreate(memAddress(phEvent), Flags);
    }

    // --- [ cuEventRecord ] ---

    @NativeType("CUresult")
    public static int cuEventRecord(@NativeType("CUevent") long hEvent, @NativeType("CUstream") long hStream) {
        long __functionAddress = Functions.EventRecord;
        if (CHECKS) {
            check(hEvent);
        }
        return callPPI(hEvent, hStream, __functionAddress);
    }

    // --- [ cuEventQuery ] ---

    @NativeType("CUresult")
    public static int cuEventQuery(@NativeType("CUevent") long hEvent) {
        long __functionAddress = Functions.EventQuery;
        if (CHECKS) {
            check(hEvent);
        }
        return callPI(hEvent, __functionAddress);
    }

    // --- [ cuEventSynchronize ] ---

    @NativeType("CUresult")
    public static int cuEventSynchronize(@NativeType("CUevent") long hEvent) {
        long __functionAddress = Functions.EventSynchronize;
        if (CHECKS) {
            check(hEvent);
        }
        return callPI(hEvent, __functionAddress);
    }

    // --- [ cuEventElapsedTime ] ---

    public static int ncuEventElapsedTime(long pMilliseconds, long hStart, long hEnd) {
        long __functionAddress = Functions.EventElapsedTime;
        if (CHECKS) {
            check(hStart);
            check(hEnd);
        }
        return callPPPI(pMilliseconds, hStart, hEnd, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuEventElapsedTime(@NativeType("float *") FloatBuffer pMilliseconds, @NativeType("CUevent") long hStart, @NativeType("CUevent") long hEnd) {
        if (CHECKS) {
            check(pMilliseconds, 1);
        }
        return ncuEventElapsedTime(memAddress(pMilliseconds), hStart, hEnd);
    }

    // --- [ cuFuncGetAttribute ] ---

    public static int ncuFuncGetAttribute(long pi, int attrib, long hfunc) {
        long __functionAddress = Functions.FuncGetAttribute;
        if (CHECKS) {
            check(hfunc);
        }
        return callPPI(pi, attrib, hfunc, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuFuncGetAttribute(@NativeType("int *") IntBuffer pi, @NativeType("CUfunction_attribute") int attrib, @NativeType("CUfunction") long hfunc) {
        if (CHECKS) {
            check(pi, 1);
        }
        return ncuFuncGetAttribute(memAddress(pi), attrib, hfunc);
    }

    // --- [ cuFuncSetCacheConfig ] ---

    @NativeType("CUresult")
    public static int cuFuncSetCacheConfig(@NativeType("CUfunction") long hfunc, @NativeType("CUfunc_cache") int config) {
        long __functionAddress = Functions.FuncSetCacheConfig;
        if (CHECKS) {
            check(hfunc);
        }
        return callPI(hfunc, config, __functionAddress);
    }

    // --- [ cuFuncSetBlockShape ] ---

    @NativeType("CUresult")
    public static int cuFuncSetBlockShape(@NativeType("CUfunction") long hfunc, int x, int y, int z) {
        long __functionAddress = Functions.FuncSetBlockShape;
        if (CHECKS) {
            check(hfunc);
        }
        return callPI(hfunc, x, y, z, __functionAddress);
    }

    // --- [ cuFuncSetSharedSize ] ---

    @NativeType("CUresult")
    public static int cuFuncSetSharedSize(@NativeType("CUfunction") long hfunc, @NativeType("unsigned int") int bytes) {
        long __functionAddress = Functions.FuncSetSharedSize;
        if (CHECKS) {
            check(hfunc);
        }
        return callPI(hfunc, bytes, __functionAddress);
    }

    // --- [ cuParamSetSize ] ---

    @NativeType("CUresult")
    public static int cuParamSetSize(@NativeType("CUfunction") long hfunc, @NativeType("unsigned int") int numbytes) {
        long __functionAddress = Functions.ParamSetSize;
        if (CHECKS) {
            check(hfunc);
        }
        return callPI(hfunc, numbytes, __functionAddress);
    }

    // --- [ cuParamSeti ] ---

    @NativeType("CUresult")
    public static int cuParamSeti(@NativeType("CUfunction") long hfunc, int offset, @NativeType("unsigned int") int value) {
        long __functionAddress = Functions.ParamSeti;
        if (CHECKS) {
            check(hfunc);
        }
        return callPI(hfunc, offset, value, __functionAddress);
    }

    // --- [ cuParamSetf ] ---

    @NativeType("CUresult")
    public static int cuParamSetf(@NativeType("CUfunction") long hfunc, int offset, float value) {
        long __functionAddress = Functions.ParamSetf;
        if (CHECKS) {
            check(hfunc);
        }
        return callPI(hfunc, offset, value, __functionAddress);
    }

    // --- [ cuParamSetv ] ---

    public static int ncuParamSetv(long hfunc, int offset, long ptr, int numbytes) {
        long __functionAddress = Functions.ParamSetv;
        if (CHECKS) {
            check(hfunc);
        }
        return callPPI(hfunc, offset, ptr, numbytes, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuParamSetv(@NativeType("CUfunction") long hfunc, int offset, @NativeType("void *") ByteBuffer ptr) {
        return ncuParamSetv(hfunc, offset, memAddress(ptr), ptr.remaining());
    }

    // --- [ cuLaunch ] ---

    @NativeType("CUresult")
    public static int cuLaunch(@NativeType("CUfunction") long f) {
        long __functionAddress = Functions.Launch;
        if (CHECKS) {
            check(f);
        }
        return callPI(f, __functionAddress);
    }

    // --- [ cuLaunchGrid ] ---

    @NativeType("CUresult")
    public static int cuLaunchGrid(@NativeType("CUfunction") long f, int grid_width, int grid_height) {
        long __functionAddress = Functions.LaunchGrid;
        if (CHECKS) {
            check(f);
        }
        return callPI(f, grid_width, grid_height, __functionAddress);
    }

    // --- [ cuLaunchGridAsync ] ---

    @NativeType("CUresult")
    public static int cuLaunchGridAsync(@NativeType("CUfunction") long f, int grid_width, int grid_height, @NativeType("CUstream") long hStream) {
        long __functionAddress = Functions.LaunchGridAsync;
        if (CHECKS) {
            check(f);
        }
        return callPPI(f, grid_width, grid_height, hStream, __functionAddress);
    }

    // --- [ cuParamSetTexRef ] ---

    @NativeType("CUresult")
    public static int cuParamSetTexRef(@NativeType("CUfunction") long hfunc, int texunit, @NativeType("CUtexref") long hTexRef) {
        long __functionAddress = Functions.ParamSetTexRef;
        if (CHECKS) {
            check(hfunc);
            check(hTexRef);
        }
        return callPPI(hfunc, texunit, hTexRef, __functionAddress);
    }

    // --- [ cuTexRefSetArray ] ---

    @NativeType("CUresult")
    public static int cuTexRefSetArray(@NativeType("CUtexref") long hTexRef, @NativeType("CUarray") long hArray, @NativeType("unsigned int") int Flags) {
        long __functionAddress = Functions.TexRefSetArray;
        if (CHECKS) {
            check(hTexRef);
            check(hArray);
        }
        return callPPI(hTexRef, hArray, Flags, __functionAddress);
    }

    // --- [ cuTexRefSetMipmappedArray ] ---

    @NativeType("CUresult")
    public static int cuTexRefSetMipmappedArray(@NativeType("CUtexref") long hTexRef, @NativeType("CUmipmappedArray") long hMipmappedArray, @NativeType("unsigned int") int Flags) {
        long __functionAddress = Functions.TexRefSetMipmappedArray;
        if (CHECKS) {
            check(hTexRef);
            check(hMipmappedArray);
        }
        return callPPI(hTexRef, hMipmappedArray, Flags, __functionAddress);
    }

    // --- [ cuTexRefSetAddress ] ---

    public static int ncuTexRefSetAddress(long ByteOffset, long hTexRef, long dptr, long bytes) {
        long __functionAddress = Functions.TexRefSetAddress;
        if (CHECKS) {
            check(hTexRef);
            check(dptr);
        }
        return callPPPPI(ByteOffset, hTexRef, dptr, bytes, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuTexRefSetAddress(@Nullable @NativeType("size_t *") PointerBuffer ByteOffset, @NativeType("CUtexref") long hTexRef, @NativeType("CUdeviceptr") long dptr, @NativeType("size_t") long bytes) {
        if (CHECKS) {
            checkSafe(ByteOffset, 1);
        }
        return ncuTexRefSetAddress(memAddressSafe(ByteOffset), hTexRef, dptr, bytes);
    }

    // --- [ cuTexRefSetAddress2D ] ---

    public static int ncuTexRefSetAddress2D(long hTexRef, long desc, long dptr, long Pitch) {
        long __functionAddress = Functions.TexRefSetAddress2D;
        if (CHECKS) {
            check(hTexRef);
            check(dptr);
        }
        return callPPPPI(hTexRef, desc, dptr, Pitch, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuTexRefSetAddress2D(@NativeType("CUtexref") long hTexRef, @NativeType("CUDA_ARRAY_DESCRIPTOR const *") CUDA_ARRAY_DESCRIPTOR desc, @NativeType("CUdeviceptr") long dptr, @NativeType("size_t") long Pitch) {
        return ncuTexRefSetAddress2D(hTexRef, desc.address(), dptr, Pitch);
    }

    // --- [ cuTexRefSetFormat ] ---

    @NativeType("CUresult")
    public static int cuTexRefSetFormat(@NativeType("CUtexref") long hTexRef, @NativeType("CUarray_format") int fmt, int NumPackedComponents) {
        long __functionAddress = Functions.TexRefSetFormat;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPI(hTexRef, fmt, NumPackedComponents, __functionAddress);
    }

    // --- [ cuTexRefSetAddressMode ] ---

    @NativeType("CUresult")
    public static int cuTexRefSetAddressMode(@NativeType("CUtexref") long hTexRef, int dim, @NativeType("CUaddress_mode") int am) {
        long __functionAddress = Functions.TexRefSetAddressMode;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPI(hTexRef, dim, am, __functionAddress);
    }

    // --- [ cuTexRefSetFilterMode ] ---

    @NativeType("CUresult")
    public static int cuTexRefSetFilterMode(@NativeType("CUtexref") long hTexRef, @NativeType("CUfilter_mode") int fm) {
        long __functionAddress = Functions.TexRefSetFilterMode;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPI(hTexRef, fm, __functionAddress);
    }

    // --- [ cuTexRefSetMipmapFilterMode ] ---

    @NativeType("CUresult")
    public static int cuTexRefSetMipmapFilterMode(@NativeType("CUtexref") long hTexRef, @NativeType("CUfilter_mode") int fm) {
        long __functionAddress = Functions.TexRefSetMipmapFilterMode;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPI(hTexRef, fm, __functionAddress);
    }

    // --- [ cuTexRefSetMipmapLevelBias ] ---

    @NativeType("CUresult")
    public static int cuTexRefSetMipmapLevelBias(@NativeType("CUtexref") long hTexRef, float bias) {
        long __functionAddress = Functions.TexRefSetMipmapLevelBias;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPI(hTexRef, bias, __functionAddress);
    }

    // --- [ cuTexRefSetMipmapLevelClamp ] ---

    @NativeType("CUresult")
    public static int cuTexRefSetMipmapLevelClamp(@NativeType("CUtexref") long hTexRef, float minMipmapLevelClamp, float maxMipmapLevelClamp) {
        long __functionAddress = Functions.TexRefSetMipmapLevelClamp;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPI(hTexRef, minMipmapLevelClamp, maxMipmapLevelClamp, __functionAddress);
    }

    // --- [ cuTexRefSetMaxAnisotropy ] ---

    @NativeType("CUresult")
    public static int cuTexRefSetMaxAnisotropy(@NativeType("CUtexref") long hTexRef, @NativeType("unsigned int") int maxAniso) {
        long __functionAddress = Functions.TexRefSetMaxAnisotropy;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPI(hTexRef, maxAniso, __functionAddress);
    }

    // --- [ cuTexRefSetBorderColor ] ---

    public static int ncuTexRefSetBorderColor(long hTexRef, long pBorderColor) {
        long __functionAddress = Functions.TexRefSetBorderColor;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPPI(hTexRef, pBorderColor, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuTexRefSetBorderColor(@NativeType("CUtexref") long hTexRef, @NativeType("float *") FloatBuffer pBorderColor) {
        if (CHECKS) {
            check(pBorderColor, 4);
        }
        return ncuTexRefSetBorderColor(hTexRef, memAddress(pBorderColor));
    }

    // --- [ cuTexRefSetFlags ] ---

    @NativeType("CUresult")
    public static int cuTexRefSetFlags(@NativeType("CUtexref") long hTexRef, @NativeType("unsigned int") int Flags) {
        long __functionAddress = Functions.TexRefSetFlags;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPI(hTexRef, Flags, __functionAddress);
    }

    // --- [ cuTexRefGetAddress ] ---

    public static int ncuTexRefGetAddress(long pdptr, long hTexRef) {
        long __functionAddress = Functions.TexRefGetAddress;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPPI(pdptr, hTexRef, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuTexRefGetAddress(@NativeType("CUdeviceptr *") PointerBuffer pdptr, @NativeType("CUtexref") long hTexRef) {
        if (CHECKS) {
            check(pdptr, 1);
        }
        return ncuTexRefGetAddress(memAddress(pdptr), hTexRef);
    }

    // --- [ cuTexRefGetArray ] ---

    public static int ncuTexRefGetArray(long phArray, long hTexRef) {
        long __functionAddress = Functions.TexRefGetArray;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPPI(phArray, hTexRef, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuTexRefGetArray(@NativeType("CUarray *") PointerBuffer phArray, @NativeType("CUtexref") long hTexRef) {
        if (CHECKS) {
            check(phArray, 1);
        }
        return ncuTexRefGetArray(memAddress(phArray), hTexRef);
    }

    // --- [ cuTexRefGetMipmappedArray ] ---

    public static int ncuTexRefGetMipmappedArray(long phMipmappedArray, long hTexRef) {
        long __functionAddress = Functions.TexRefGetMipmappedArray;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPPI(phMipmappedArray, hTexRef, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuTexRefGetMipmappedArray(@NativeType("CUmipmappedArray *") PointerBuffer phMipmappedArray, @NativeType("CUtexref") long hTexRef) {
        if (CHECKS) {
            check(phMipmappedArray, 1);
        }
        return ncuTexRefGetMipmappedArray(memAddress(phMipmappedArray), hTexRef);
    }

    // --- [ cuTexRefGetAddressMode ] ---

    public static int ncuTexRefGetAddressMode(long pam, long hTexRef, int dim) {
        long __functionAddress = Functions.TexRefGetAddressMode;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPPI(pam, hTexRef, dim, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuTexRefGetAddressMode(@NativeType("CUaddress_mode *") IntBuffer pam, @NativeType("CUtexref") long hTexRef, int dim) {
        if (CHECKS) {
            check(pam, 1);
        }
        return ncuTexRefGetAddressMode(memAddress(pam), hTexRef, dim);
    }

    // --- [ cuTexRefGetFilterMode ] ---

    public static int ncuTexRefGetFilterMode(long pfm, long hTexRef) {
        long __functionAddress = Functions.TexRefGetFilterMode;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPPI(pfm, hTexRef, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuTexRefGetFilterMode(@NativeType("CUfilter_mode *") IntBuffer pfm, @NativeType("CUtexref") long hTexRef) {
        if (CHECKS) {
            check(pfm, 1);
        }
        return ncuTexRefGetFilterMode(memAddress(pfm), hTexRef);
    }

    // --- [ cuTexRefGetFormat ] ---

    public static int ncuTexRefGetFormat(long pFormat, long pNumChannels, long hTexRef) {
        long __functionAddress = Functions.TexRefGetFormat;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPPPI(pFormat, pNumChannels, hTexRef, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuTexRefGetFormat(@Nullable @NativeType("CUarray_format *") IntBuffer pFormat, @Nullable @NativeType("int *") IntBuffer pNumChannels, @NativeType("CUtexref") long hTexRef) {
        if (CHECKS) {
            checkSafe(pFormat, 1);
            checkSafe(pNumChannels, 1);
        }
        return ncuTexRefGetFormat(memAddressSafe(pFormat), memAddressSafe(pNumChannels), hTexRef);
    }

    // --- [ cuTexRefGetMipmapFilterMode ] ---

    public static int ncuTexRefGetMipmapFilterMode(long pfm, long hTexRef) {
        long __functionAddress = Functions.TexRefGetMipmapFilterMode;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPPI(pfm, hTexRef, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuTexRefGetMipmapFilterMode(@NativeType("CUfilter_mode *") IntBuffer pfm, @NativeType("CUtexref") long hTexRef) {
        if (CHECKS) {
            check(pfm, 1);
        }
        return ncuTexRefGetMipmapFilterMode(memAddress(pfm), hTexRef);
    }

    // --- [ cuTexRefGetMipmapLevelBias ] ---

    public static int ncuTexRefGetMipmapLevelBias(long pbias, long hTexRef) {
        long __functionAddress = Functions.TexRefGetMipmapLevelBias;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPPI(pbias, hTexRef, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuTexRefGetMipmapLevelBias(@NativeType("float *") FloatBuffer pbias, @NativeType("CUtexref") long hTexRef) {
        if (CHECKS) {
            check(pbias, 1);
        }
        return ncuTexRefGetMipmapLevelBias(memAddress(pbias), hTexRef);
    }

    // --- [ cuTexRefGetMipmapLevelClamp ] ---

    public static int ncuTexRefGetMipmapLevelClamp(long pminMipmapLevelClamp, long pmaxMipmapLevelClamp, long hTexRef) {
        long __functionAddress = Functions.TexRefGetMipmapLevelClamp;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPPPI(pminMipmapLevelClamp, pmaxMipmapLevelClamp, hTexRef, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuTexRefGetMipmapLevelClamp(@NativeType("float *") FloatBuffer pminMipmapLevelClamp, @NativeType("float *") FloatBuffer pmaxMipmapLevelClamp, @NativeType("CUtexref") long hTexRef) {
        if (CHECKS) {
            check(pminMipmapLevelClamp, 1);
            check(pmaxMipmapLevelClamp, 1);
        }
        return ncuTexRefGetMipmapLevelClamp(memAddress(pminMipmapLevelClamp), memAddress(pmaxMipmapLevelClamp), hTexRef);
    }

    // --- [ cuTexRefGetMaxAnisotropy ] ---

    public static int ncuTexRefGetMaxAnisotropy(long pmaxAniso, long hTexRef) {
        long __functionAddress = Functions.TexRefGetMaxAnisotropy;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPPI(pmaxAniso, hTexRef, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuTexRefGetMaxAnisotropy(@NativeType("int *") IntBuffer pmaxAniso, @NativeType("CUtexref") long hTexRef) {
        if (CHECKS) {
            check(pmaxAniso, 1);
        }
        return ncuTexRefGetMaxAnisotropy(memAddress(pmaxAniso), hTexRef);
    }

    // --- [ cuTexRefGetBorderColor ] ---

    public static int ncuTexRefGetBorderColor(long pBorderColor, long hTexRef) {
        long __functionAddress = Functions.TexRefGetBorderColor;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPPI(pBorderColor, hTexRef, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuTexRefGetBorderColor(@NativeType("float *") FloatBuffer pBorderColor, @NativeType("CUtexref") long hTexRef) {
        if (CHECKS) {
            check(pBorderColor, 4);
        }
        return ncuTexRefGetBorderColor(memAddress(pBorderColor), hTexRef);
    }

    // --- [ cuTexRefGetFlags ] ---

    public static int ncuTexRefGetFlags(long pFlags, long hTexRef) {
        long __functionAddress = Functions.TexRefGetFlags;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPPI(pFlags, hTexRef, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuTexRefGetFlags(@NativeType("unsigned int *") IntBuffer pFlags, @NativeType("CUtexref") long hTexRef) {
        if (CHECKS) {
            check(pFlags, 1);
        }
        return ncuTexRefGetFlags(memAddress(pFlags), hTexRef);
    }

    // --- [ cuTexRefCreate ] ---

    public static int ncuTexRefCreate(long pTexRef) {
        long __functionAddress = Functions.TexRefCreate;
        return callPI(pTexRef, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuTexRefCreate(@NativeType("CUtexref *") PointerBuffer pTexRef) {
        if (CHECKS) {
            check(pTexRef, 1);
        }
        return ncuTexRefCreate(memAddress(pTexRef));
    }

    // --- [ cuTexRefDestroy ] ---

    @NativeType("CUresult")
    public static int cuTexRefDestroy(@NativeType("CUtexref") long hTexRef) {
        long __functionAddress = Functions.TexRefDestroy;
        if (CHECKS) {
            check(hTexRef);
        }
        return callPI(hTexRef, __functionAddress);
    }

    // --- [ cuSurfRefSetArray ] ---

    @NativeType("CUresult")
    public static int cuSurfRefSetArray(@NativeType("CUsurfref") long hSurfRef, @NativeType("CUarray") long hArray, @NativeType("unsigned int") int Flags) {
        long __functionAddress = Functions.SurfRefSetArray;
        if (CHECKS) {
            check(hSurfRef);
            check(hArray);
        }
        return callPPI(hSurfRef, hArray, Flags, __functionAddress);
    }

    // --- [ cuSurfRefGetArray ] ---

    public static int ncuSurfRefGetArray(long phArray, long hSurfRef) {
        long __functionAddress = Functions.SurfRefGetArray;
        if (CHECKS) {
            check(hSurfRef);
        }
        return callPPI(phArray, hSurfRef, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuSurfRefGetArray(@NativeType("CUarray *") PointerBuffer phArray, @NativeType("CUsurfref") long hSurfRef) {
        if (CHECKS) {
            check(phArray, 1);
        }
        return ncuSurfRefGetArray(memAddress(phArray), hSurfRef);
    }

    // --- [ cuGraphicsUnregisterResource ] ---

    @NativeType("CUresult")
    public static int cuGraphicsUnregisterResource(@NativeType("CUgraphicsResource") long resource) {
        long __functionAddress = Functions.GraphicsUnregisterResource;
        if (CHECKS) {
            check(resource);
        }
        return callPI(resource, __functionAddress);
    }

    // --- [ cuGraphicsSubResourceGetMappedArray ] ---

    public static int ncuGraphicsSubResourceGetMappedArray(long pArray, long resource, int arrayIndex, int mipLevel) {
        long __functionAddress = Functions.GraphicsSubResourceGetMappedArray;
        if (CHECKS) {
            check(resource);
        }
        return callPPI(pArray, resource, arrayIndex, mipLevel, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuGraphicsSubResourceGetMappedArray(@NativeType("CUarray *") PointerBuffer pArray, @NativeType("CUgraphicsResource") long resource, @NativeType("unsigned int") int arrayIndex, @NativeType("unsigned int") int mipLevel) {
        if (CHECKS) {
            check(pArray, 1);
        }
        return ncuGraphicsSubResourceGetMappedArray(memAddress(pArray), resource, arrayIndex, mipLevel);
    }

    // --- [ cuGraphicsResourceGetMappedPointer ] ---

    public static int ncuGraphicsResourceGetMappedPointer(long pDevPtr, long pSize, long resource) {
        long __functionAddress = Functions.GraphicsResourceGetMappedPointer;
        if (CHECKS) {
            check(resource);
        }
        return callPPPI(pDevPtr, pSize, resource, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuGraphicsResourceGetMappedPointer(@NativeType("CUdeviceptr *") PointerBuffer pDevPtr, @NativeType("size_t *") PointerBuffer pSize, @NativeType("CUgraphicsResource") long resource) {
        if (CHECKS) {
            check(pDevPtr, 1);
            check(pSize, 1);
        }
        return ncuGraphicsResourceGetMappedPointer(memAddress(pDevPtr), memAddress(pSize), resource);
    }

    // --- [ cuGraphicsResourceSetMapFlags ] ---

    @NativeType("CUresult")
    public static int cuGraphicsResourceSetMapFlags(@NativeType("CUgraphicsResource") long resource, @NativeType("unsigned int") int flags) {
        long __functionAddress = Functions.GraphicsResourceSetMapFlags;
        if (CHECKS) {
            check(resource);
        }
        return callPI(resource, flags, __functionAddress);
    }

    // --- [ cuGraphicsMapResources ] ---

    public static int ncuGraphicsMapResources(int count, long resources, long hStream) {
        long __functionAddress = Functions.GraphicsMapResources;
        return callPPI(count, resources, hStream, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuGraphicsMapResources(@NativeType("CUgraphicsResource *") PointerBuffer resources, @NativeType("CUstream") long hStream) {
        return ncuGraphicsMapResources(resources.remaining(), memAddress(resources), hStream);
    }

    // --- [ cuGraphicsUnmapResources ] ---

    public static int ncuGraphicsUnmapResources(int count, long resources, long hStream) {
        long __functionAddress = Functions.GraphicsUnmapResources;
        return callPPI(count, resources, hStream, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuGraphicsUnmapResources(@NativeType("CUgraphicsResource *") PointerBuffer resources, @NativeType("CUstream") long hStream) {
        return ncuGraphicsUnmapResources(resources.remaining(), memAddress(resources), hStream);
    }

    // --- [ cuGetExportTable ] ---

    public static int ncuGetExportTable(long ppExportTable, long pExportTableId) {
        long __functionAddress = Functions.GetExportTable;
        return callPPI(ppExportTable, pExportTableId, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuGetExportTable(@NativeType("void const **") PointerBuffer ppExportTable, @NativeType("CUuuid const *") CUuuid pExportTableId) {
        return ncuGetExportTable(memAddress(ppExportTable), pExportTableId.address());
    }

}
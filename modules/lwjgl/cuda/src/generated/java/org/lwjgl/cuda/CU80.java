/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.cuda;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.cuda.CUDA.*;

/** Contains bindings to <a href="https://docs.nvidia.com/cuda/cuda-driver-api/index.html">CUDA Driver API</a>. */
public class CU80 extends CU70 {

    /** Device that represents the CPU. */
    public static final int CU_DEVICE_CPU = -1;

    /** Device that represents an invalid device. */
    public static final int CU_DEVICE_INVALID = -2;

    /**
     * Flags for {@link #cuStreamWaitValue32 StreamWaitValue32} and {@link #cuStreamWaitValue64 StreamWaitValue64}. ({@code CUstreamWaitValue_flags})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_STREAM_WAIT_VALUE_GEQ STREAM_WAIT_VALUE_GEQ} - 
     * Wait until {@code (int32_t)(*addr - value) >= 0} (or {@code int64_t} for 64 bit values). Note this is a cyclic comparison which ignores
     * wraparound. (Default behavior.)
     * </li>
     * <li>{@link #CU_STREAM_WAIT_VALUE_EQ STREAM_WAIT_VALUE_EQ} - Wait until {@code *addr == value}.</li>
     * <li>{@link #CU_STREAM_WAIT_VALUE_AND STREAM_WAIT_VALUE_AND} - Wait until {@code (*addr & value) != 0}.</li>
     * <li>{@link #CU_STREAM_WAIT_VALUE_NOR STREAM_WAIT_VALUE_NOR} - 
     * Wait until {@code ~(*addr | value) != 0}. Support for this operation can be queried with {@link CU#cuDeviceGetAttribute DeviceGetAttribute} and
     * {@link CU#CU_DEVICE_ATTRIBUTE_CAN_USE_STREAM_WAIT_VALUE_NOR DEVICE_ATTRIBUTE_CAN_USE_STREAM_WAIT_VALUE_NOR}.
     * </li>
     * <li>{@link #CU_STREAM_WAIT_VALUE_FLUSH STREAM_WAIT_VALUE_FLUSH} - 
     * Follow the wait operation with a flush of outstanding remote writes.
     * 
     * <p>This means that, if a remote write operation is guaranteed to have reached the device before the wait can be satisfied, that write is guaranteed to
     * be visible to downstream device work. The device is permitted to reorder remote writes internally. For example, this flag would be required if two
     * remote writes arrive in a defined order, the wait is satisfied by the second write, and downstream work needs to observe the first write.</p>
     * 
     * <p>Support for this operation is restricted to selected platforms and can be queried with {@code CU_DEVICE_ATTRIBUTE_CAN_USE_WAIT_VALUE_FLUSH}.</p>
     * </li>
     * </ul>
     */
    public static final int
        CU_STREAM_WAIT_VALUE_GEQ   = 0x0,
        CU_STREAM_WAIT_VALUE_EQ    = 0x1,
        CU_STREAM_WAIT_VALUE_AND   = 0x2,
        CU_STREAM_WAIT_VALUE_NOR   = 0x3,
        CU_STREAM_WAIT_VALUE_FLUSH = 1<<30;

    /**
     * Flags for {@link #cuStreamWriteValue32 StreamWriteValue32}. ({@code CUstreamWriteValue_flags})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_STREAM_WRITE_VALUE_DEFAULT STREAM_WRITE_VALUE_DEFAULT} - Default behavior</li>
     * <li>{@link #CU_STREAM_WRITE_VALUE_NO_MEMORY_BARRIER STREAM_WRITE_VALUE_NO_MEMORY_BARRIER} - 
     * Permits the write to be reordered with writes which were issued before it, as a performance optimization.
     * 
     * <p>Normally, {@link #cuStreamWriteValue32 StreamWriteValue32} will provide a memory fence before the write, which has similar semantics to {@code __threadfence_system()} but is
     * scoped to the stream rather than a CUDA thread.</p>
     * </li>
     * </ul>
     */
    public static final int
        CU_STREAM_WRITE_VALUE_DEFAULT           = 0x0,
        CU_STREAM_WRITE_VALUE_NO_MEMORY_BARRIER = 0x1;

    /**
     * Operations for {@link #cuStreamBatchMemOp StreamBatchMemOp}. ({@code CUstreamBatchMemOpType})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_STREAM_MEM_OP_WAIT_VALUE_32 STREAM_MEM_OP_WAIT_VALUE_32} - Represents a {@link #cuStreamWaitValue32 StreamWaitValue32} operation</li>
     * <li>{@link #CU_STREAM_MEM_OP_WRITE_VALUE_32 STREAM_MEM_OP_WRITE_VALUE_32} - Represents a {@link #cuStreamWriteValue32 StreamWriteValue32} operation</li>
     * <li>{@link #CU_STREAM_MEM_OP_WAIT_VALUE_64 STREAM_MEM_OP_WAIT_VALUE_64} - Represents a {@link #cuStreamWaitValue64 StreamWaitValue64} operation</li>
     * <li>{@link #CU_STREAM_MEM_OP_WRITE_VALUE_64 STREAM_MEM_OP_WRITE_VALUE_64} - Represents a {@link #cuStreamWriteValue64 StreamWriteValue64} operation</li>
     * <li>{@link #CU_STREAM_MEM_OP_FLUSH_REMOTE_WRITES STREAM_MEM_OP_FLUSH_REMOTE_WRITES} - This has the same effect as {@link #CU_STREAM_WAIT_VALUE_FLUSH STREAM_WAIT_VALUE_FLUSH}, but as a standalone operation.</li>
     * </ul>
     */
    public static final int
        CU_STREAM_MEM_OP_WAIT_VALUE_32       = 0x1,
        CU_STREAM_MEM_OP_WRITE_VALUE_32      = 0x2,
        CU_STREAM_MEM_OP_WAIT_VALUE_64       = 0x4,
        CU_STREAM_MEM_OP_WRITE_VALUE_64      = 0x5,
        CU_STREAM_MEM_OP_FLUSH_REMOTE_WRITES = 0x3;

    /**
     * Memory advise values. ({@code CUmem_advise})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_MEM_ADVISE_SET_READ_MOSTLY MEM_ADVISE_SET_READ_MOSTLY} - Data will mostly be read and only occassionally be written to</li>
     * <li>{@link #CU_MEM_ADVISE_UNSET_READ_MOSTLY MEM_ADVISE_UNSET_READ_MOSTLY} - Undo the effect of {@link #CU_MEM_ADVISE_SET_READ_MOSTLY MEM_ADVISE_SET_READ_MOSTLY}</li>
     * <li>{@link #CU_MEM_ADVISE_SET_PREFERRED_LOCATION MEM_ADVISE_SET_PREFERRED_LOCATION} - Set the preferred location for the data as the specified device</li>
     * <li>{@link #CU_MEM_ADVISE_UNSET_PREFERRED_LOCATION MEM_ADVISE_UNSET_PREFERRED_LOCATION} - Clear the preferred location for the data</li>
     * <li>{@link #CU_MEM_ADVISE_SET_ACCESSED_BY MEM_ADVISE_SET_ACCESSED_BY} - Data will be accessed by the specified device, so prevent page faults as much as possible</li>
     * <li>{@link #CU_MEM_ADVISE_UNSET_ACCESSED_BY MEM_ADVISE_UNSET_ACCESSED_BY} - Let the Unified Memory subsystem decide on the page faulting policy for the specified device</li>
     * </ul>
     */
    public static final int
        CU_MEM_ADVISE_SET_READ_MOSTLY          = 0x1,
        CU_MEM_ADVISE_UNSET_READ_MOSTLY        = 0x2,
        CU_MEM_ADVISE_SET_PREFERRED_LOCATION   = 0x3,
        CU_MEM_ADVISE_UNSET_PREFERRED_LOCATION = 0x4,
        CU_MEM_ADVISE_SET_ACCESSED_BY          = 0x5,
        CU_MEM_ADVISE_UNSET_ACCESSED_BY        = 0x6;

    /**
     * ({@code CUmem_range_attribute})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_MEM_RANGE_ATTRIBUTE_READ_MOSTLY MEM_RANGE_ATTRIBUTE_READ_MOSTLY} - Whether the range will mostly be read and only occassionally be written to</li>
     * <li>{@link #CU_MEM_RANGE_ATTRIBUTE_PREFERRED_LOCATION MEM_RANGE_ATTRIBUTE_PREFERRED_LOCATION} - The preferred location of the range</li>
     * <li>{@link #CU_MEM_RANGE_ATTRIBUTE_ACCESSED_BY MEM_RANGE_ATTRIBUTE_ACCESSED_BY} - Memory range has {@link #CU_MEM_ADVISE_SET_ACCESSED_BY MEM_ADVISE_SET_ACCESSED_BY} set for specified device</li>
     * <li>{@link #CU_MEM_RANGE_ATTRIBUTE_LAST_PREFETCH_LOCATION MEM_RANGE_ATTRIBUTE_LAST_PREFETCH_LOCATION} - The last location to which the range was prefetched</li>
     * </ul>
     */
    public static final int
        CU_MEM_RANGE_ATTRIBUTE_READ_MOSTLY            = 0x1,
        CU_MEM_RANGE_ATTRIBUTE_PREFERRED_LOCATION     = 0x2,
        CU_MEM_RANGE_ATTRIBUTE_ACCESSED_BY            = 0x3,
        CU_MEM_RANGE_ATTRIBUTE_LAST_PREFETCH_LOCATION = 0x4;

    /**
     * P2P Attributes. ({@code CUdevice_P2PAttribute})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CU_DEVICE_P2P_ATTRIBUTE_PERFORMANCE_RANK DEVICE_P2P_ATTRIBUTE_PERFORMANCE_RANK} - A relative value indicating the performance of the link between two devices</li>
     * <li>{@link #CU_DEVICE_P2P_ATTRIBUTE_ACCESS_SUPPORTED DEVICE_P2P_ATTRIBUTE_ACCESS_SUPPORTED} - P2P Access is enable</li>
     * <li>{@link #CU_DEVICE_P2P_ATTRIBUTE_NATIVE_ATOMIC_SUPPORTED DEVICE_P2P_ATTRIBUTE_NATIVE_ATOMIC_SUPPORTED} - Atomic operation over the link supported</li>
     * <li>{@link #CU_DEVICE_P2P_ATTRIBUTE_ACCESS_ACCESS_SUPPORTED DEVICE_P2P_ATTRIBUTE_ACCESS_ACCESS_SUPPORTED} - Deprecated, use CU_DEVICE_P2P_ATTRIBUTE_CUDA_ARRAY_ACCESS_SUPPORTED instead</li>
     * <li>{@link #CU_DEVICE_P2P_ATTRIBUTE_CUDA_ARRAY_ACCESS_SUPPORTED DEVICE_P2P_ATTRIBUTE_CUDA_ARRAY_ACCESS_SUPPORTED} - Accessing CUDA arrays over the link supported</li>
     * </ul>
     */
    public static final int
        CU_DEVICE_P2P_ATTRIBUTE_PERFORMANCE_RANK            = 0x1,
        CU_DEVICE_P2P_ATTRIBUTE_ACCESS_SUPPORTED            = 0x2,
        CU_DEVICE_P2P_ATTRIBUTE_NATIVE_ATOMIC_SUPPORTED     = 0x3,
        CU_DEVICE_P2P_ATTRIBUTE_ACCESS_ACCESS_SUPPORTED     = 0x4,
        CU_DEVICE_P2P_ATTRIBUTE_CUDA_ARRAY_ACCESS_SUPPORTED = 0x4;

    protected CU80() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code CU.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            MemPrefetchAsync      = apiGetFunctionAddress(CU.getLibrary(), __CUDA_API_PTSZ("cuMemPrefetchAsync")),
            MemAdvise             = apiGetFunctionAddress(CU.getLibrary(), "cuMemAdvise"),
            MemRangeGetAttribute  = apiGetFunctionAddress(CU.getLibrary(), "cuMemRangeGetAttribute"),
            MemRangeGetAttributes = apiGetFunctionAddress(CU.getLibrary(), "cuMemRangeGetAttributes"),
            StreamWaitValue32     = apiGetFunctionAddress(CU.getLibrary(), __CUDA_API_PTSZ("cuStreamWaitValue32")),
            StreamWaitValue64     = apiGetFunctionAddress(CU.getLibrary(), __CUDA_API_PTSZ("cuStreamWaitValue64")),
            StreamWriteValue32    = apiGetFunctionAddress(CU.getLibrary(), __CUDA_API_PTSZ("cuStreamWriteValue32")),
            StreamWriteValue64    = apiGetFunctionAddress(CU.getLibrary(), __CUDA_API_PTSZ("cuStreamWriteValue64")),
            StreamBatchMemOp      = apiGetFunctionAddress(CU.getLibrary(), __CUDA_API_PTSZ("cuStreamBatchMemOp")),
            DeviceGetP2PAttribute = apiGetFunctionAddress(CU.getLibrary(), "cuDeviceGetP2PAttribute");

    }

    // --- [ cuMemPrefetchAsync ] ---

    @NativeType("CUresult")
    public static int cuMemPrefetchAsync(@NativeType("CUdeviceptr") long devPtr, @NativeType("size_t") long count, @NativeType("CUdevice") int dstDevice, @NativeType("CUstream") long hStream) {
        long __functionAddress = Functions.MemPrefetchAsync;
        if (CHECKS) {
            check(devPtr);
        }
        return callPPPI(devPtr, count, dstDevice, hStream, __functionAddress);
    }

    // --- [ cuMemAdvise ] ---

    @NativeType("CUresult")
    public static int cuMemAdvise(@NativeType("CUdeviceptr") long devPtr, @NativeType("size_t") long count, @NativeType("CUmem_advise") int advice, @NativeType("CUdevice") int device) {
        long __functionAddress = Functions.MemAdvise;
        if (CHECKS) {
            check(devPtr);
        }
        return callPPI(devPtr, count, advice, device, __functionAddress);
    }

    // --- [ cuMemRangeGetAttribute ] ---

    public static int ncuMemRangeGetAttribute(long data, long dataSize, int attribute, long devPtr, long count) {
        long __functionAddress = Functions.MemRangeGetAttribute;
        if (CHECKS) {
            check(devPtr);
        }
        return callPPPPI(data, dataSize, attribute, devPtr, count, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuMemRangeGetAttribute(@NativeType("void *") ByteBuffer data, @NativeType("CUmem_range_attribute") int attribute, @NativeType("CUdeviceptr") long devPtr, @NativeType("size_t") long count) {
        return ncuMemRangeGetAttribute(memAddress(data), data.remaining(), attribute, devPtr, count);
    }

    // --- [ cuMemRangeGetAttributes ] ---

    public static int ncuMemRangeGetAttributes(long data, long dataSizes, long attributes, long numAttributes, long devPtr, long count) {
        long __functionAddress = Functions.MemRangeGetAttributes;
        if (CHECKS) {
            check(devPtr);
        }
        return callPPPPPPI(data, dataSizes, attributes, numAttributes, devPtr, count, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuMemRangeGetAttributes(@NativeType("void **") PointerBuffer data, @NativeType("size_t *") PointerBuffer dataSizes, @NativeType("CUmem_range_attribute *") IntBuffer attributes, @NativeType("CUdeviceptr") long devPtr, @NativeType("size_t") long count) {
        if (CHECKS) {
            check(data, attributes.remaining());
            check(dataSizes, attributes.remaining());
        }
        return ncuMemRangeGetAttributes(memAddress(data), memAddress(dataSizes), memAddress(attributes), attributes.remaining(), devPtr, count);
    }

    // --- [ cuStreamWaitValue32 ] ---

    @NativeType("CUresult")
    public static int cuStreamWaitValue32(@NativeType("CUstream") long stream, @NativeType("CUdeviceptr") long addr, @NativeType("cuuint32_t") int value, @NativeType("unsigned int") int flags) {
        long __functionAddress = Functions.StreamWaitValue32;
        if (CHECKS) {
            check(addr);
        }
        return callPPI(stream, addr, value, flags, __functionAddress);
    }

    // --- [ cuStreamWaitValue64 ] ---

    @NativeType("CUresult")
    public static int cuStreamWaitValue64(@NativeType("CUstream") long stream, @NativeType("CUdeviceptr") long addr, @NativeType("cuuint64_t") long value, @NativeType("unsigned int") int flags) {
        long __functionAddress = Functions.StreamWaitValue64;
        if (CHECKS) {
            check(addr);
        }
        return callPPJI(stream, addr, value, flags, __functionAddress);
    }

    // --- [ cuStreamWriteValue32 ] ---

    @NativeType("CUresult")
    public static int cuStreamWriteValue32(@NativeType("CUstream") long stream, @NativeType("CUdeviceptr") long addr, @NativeType("cuuint32_t") int value, @NativeType("unsigned int") int flags) {
        long __functionAddress = Functions.StreamWriteValue32;
        if (CHECKS) {
            check(addr);
        }
        return callPPI(stream, addr, value, flags, __functionAddress);
    }

    // --- [ cuStreamWriteValue64 ] ---

    @NativeType("CUresult")
    public static int cuStreamWriteValue64(@NativeType("CUstream") long stream, @NativeType("CUdeviceptr") long addr, @NativeType("cuuint64_t") long value, @NativeType("unsigned int") int flags) {
        long __functionAddress = Functions.StreamWriteValue64;
        if (CHECKS) {
            check(addr);
        }
        return callPPJI(stream, addr, value, flags, __functionAddress);
    }

    // --- [ cuStreamBatchMemOp ] ---

    public static int ncuStreamBatchMemOp(long stream, int count, long paramArray, int flags) {
        long __functionAddress = Functions.StreamBatchMemOp;
        return callPPI(stream, count, paramArray, flags, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuStreamBatchMemOp(@NativeType("CUstream") long stream, @NativeType("CUstreamBatchMemOpParams *") CUstreamBatchMemOpParams.Buffer paramArray, @NativeType("unsigned int") int flags) {
        return ncuStreamBatchMemOp(stream, paramArray.remaining(), paramArray.address(), flags);
    }

    // --- [ cuDeviceGetP2PAttribute ] ---

    public static int ncuDeviceGetP2PAttribute(long value, int attrib, int srcDevice, int dstDevice) {
        long __functionAddress = Functions.DeviceGetP2PAttribute;
        return callPI(value, attrib, srcDevice, dstDevice, __functionAddress);
    }

    @NativeType("CUresult")
    public static int cuDeviceGetP2PAttribute(@NativeType("int *") IntBuffer value, @NativeType("CUdevice_P2PAttribute") int attrib, @NativeType("CUdevice") int srcDevice, @NativeType("CUdevice") int dstDevice) {
        if (CHECKS) {
            check(value, 1);
        }
        return ncuDeviceGetP2PAttribute(memAddress(value), attrib, srcDevice, dstDevice);
    }

}
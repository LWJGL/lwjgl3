/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package cuda.templates

import cuda.*
import org.lwjgl.generator.*

val CU80 = "CU80".nativeClass(Module.CUDA, prefix = "CU", binding = NVCUDA_BINDING_DELEGATE) {
    javaImport("static org.lwjgl.cuda.CUDA.*")
    extends = CU70
    documentation = "Contains bindings to <a href=\"https://docs.nvidia.com/cuda/cuda-driver-api/index.html\">CUDA Driver API</a>."

    IntConstant("Device that represents the CPU.", "DEVICE_CPU".."-1")
    IntConstant("Device that represents an invalid device.", "DEVICE_INVALID".."-2")

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
        "P2P Attributes. ({@code CUdevice_P2PAttribute})",

        "DEVICE_P2P_ATTRIBUTE_PERFORMANCE_RANK".enum("A relative value indicating the performance of the link between two devices", 0x01),
        "DEVICE_P2P_ATTRIBUTE_ACCESS_SUPPORTED".enum("P2P Access is enable", 0x02),
        "DEVICE_P2P_ATTRIBUTE_NATIVE_ATOMIC_SUPPORTED".enum("Atomic operation over the link supported", 0x03),
        "DEVICE_P2P_ATTRIBUTE_ACCESS_ACCESS_SUPPORTED".enum("Deprecated, use CU_DEVICE_P2P_ATTRIBUTE_CUDA_ARRAY_ACCESS_SUPPORTED instead", 0x04),
        "DEVICE_P2P_ATTRIBUTE_CUDA_ARRAY_ACCESS_SUPPORTED".enum("Accessing CUDA arrays over the link supported", 0x04)
    )

    CUresult(
        "MemPrefetchAsync",
        "",

        CUdeviceptr("devPtr", ""),
        size_t("count", ""),
        CUdevice("dstDevice", ""),
        nullable..CUstream("hStream", "")
    ).ptsz()

    CUresult(
        "MemAdvise",
        "",

        CUdeviceptr("devPtr", ""),
        size_t("count", ""),
        CUmem_advise("advice", ""),
        CUdevice("device", "")
    )

    CUresult(
        "MemRangeGetAttribute",
        "",

        void.p("data", ""),
        AutoSize("data")..size_t("dataSize", ""),
        CUmem_range_attribute("attribute", ""),
        CUdeviceptr("devPtr", ""),
        size_t("count", "")
    )

    CUresult(
        "MemRangeGetAttributes",
        "",

        void.p.p("data", ""),
        size_t.p("dataSizes", ""),
        CUmem_range_attribute.p("attributes", ""),
        AutoSize("attributes", "data", "dataSizes")..size_t("numAttributes", ""),
        CUdeviceptr("devPtr", ""),
        size_t("count", "")
    )

    CUresult(
        "StreamWaitValue32",
        "",

        nullable..CUstream("stream", ""),
        CUdeviceptr("addr", ""),
        cuuint32_t("value", ""),
        unsigned_int("flags", "")
    ).ptsz()

    CUresult(
        "StreamWaitValue64",
        "",

        nullable..CUstream("stream", ""),
        CUdeviceptr("addr", ""),
        cuuint64_t("value", ""),
        unsigned_int("flags", "")
    ).ptsz()

    CUresult(
        "StreamWriteValue32",
        "",

        nullable..CUstream("stream", ""),
        CUdeviceptr("addr", ""),
        cuuint32_t("value", ""),
        unsigned_int("flags", "")
    ).ptsz()

    CUresult(
        "StreamWriteValue64",
        "",

        nullable..CUstream("stream", ""),
        CUdeviceptr("addr", ""),
        cuuint64_t("value", ""),
        unsigned_int("flags", "")
    ).ptsz()

    CUresult(
        "StreamBatchMemOp",
        "",

        nullable..CUstream("stream", ""),
        AutoSize("paramArray")..unsigned_int("count", ""),
        CUstreamBatchMemOpParams.p("paramArray", ""),
        unsigned_int("flags", "")
    ).ptsz()

    CUresult(
        "DeviceGetP2PAttribute",
        "",

        Check(1)..int.p("value", ""),
        CUdevice_P2PAttribute("attrib", ""),
        CUdevice("srcDevice", ""),
        CUdevice("dstDevice", "")
    )
}
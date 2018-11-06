/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package cuda.templates

import cuda.*
import org.lwjgl.generator.*

val CU40 = "CU40".nativeClass(Module.CUDA, prefix = "CU", binding = NVCUDA_BINDING_DELEGATE) {
    javaImport("static org.lwjgl.cuda.CUDA.*")
    extends = CU
    documentation = "Contains bindings to <a href=\"https://docs.nvidia.com/cuda/cuda-driver-api/index.html\">CUDA Driver API</a>."

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

    EnumConstant(
        "Pointer information. ({@code CUpointer_attribute})",

        "POINTER_ATTRIBUTE_CONTEXT".enum("The {@code CUcontext} on which a pointer was allocated or registered", 1),
        "POINTER_ATTRIBUTE_MEMORY_TYPE".enum("The {@code CUmemorytype} describing the physical location of a pointer", 2),
        "POINTER_ATTRIBUTE_DEVICE_POINTER".enum("The address at which a pointer's memory may be accessed on the device", 3),
        "POINTER_ATTRIBUTE_HOST_POINTER".enum("The address at which a pointer's memory may be accessed on the host", 4),
        "POINTER_ATTRIBUTE_P2P_TOKENS".enum("A pair of tokens for use with the nv-p2p.h Linux kernel interface", 5),
        "POINTER_ATTRIBUTE_SYNC_MEMOPS".enum("Synchronize every synchronous memory operation initiated on this region", 6),
        "POINTER_ATTRIBUTE_BUFFER_ID".enum("A process-wide unique ID for an allocated memory region", 7),
        "POINTER_ATTRIBUTE_IS_MANAGED".enum("Indicates if the pointer points to managed memory", 8),
        "POINTER_ATTRIBUTE_DEVICE_ORDINAL".enum("A device ordinal of a device on which a pointer was allocated or registered", 9)
    )

    CUresult(
        "CtxDestroy",
        "",

        CUcontext("ctx", "")
    ).versioned()

    CUresult(
        "CtxPushCurrent",
        "",

        CUcontext("ctx", "")
    ).versioned()

    CUresult(
        "CtxPopCurrent",
        "",

        Check(1)..CUcontext.p("pctx", "")
    ).versioned()

    CUresult(
        "CtxSetCurrent",
        "",

        nullable..CUcontext("ctx", "")
    )

    CUresult(
        "CtxGetCurrent",
        "",

        Check(1)..CUcontext.p("pctx", "")
    )

    CUresult(
        "MemHostRegister",
        "",

        void.p("p", ""),
        AutoSize("p")..size_t("bytesize", ""),
        unsigned_int("Flags", "")
    ).versioned()

    CUresult(
        "MemHostUnregister",
        "",

        Unsafe..void.p("p", "")
    )

    CUresult(
        "Memcpy",
        "",

        CUdeviceptr("dst", ""),
        CUdeviceptr("src", ""),
        size_t("ByteCount", "")
    ).ptds()

    CUresult(
        "MemcpyPeer",
        "",

        CUdeviceptr("dstDevice", ""),
        CUcontext("dstContext", ""),
        CUdeviceptr("srcDevice", ""),
        CUcontext("srcContext", ""),
        size_t("ByteCount", "")
    ).ptds()

    CUresult(
        "Memcpy3DPeer",
        "",

        CUDA_MEMCPY3D_PEER.const.p("pCopy", "")
    ).ptds()

    CUresult(
        "MemcpyAsync",
        "",

        CUdeviceptr("dst", ""),
        CUdeviceptr("src", ""),
        size_t("ByteCount", ""),
        nullable..CUstream("hStream", "")
    ).ptsz()

    CUresult(
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
        "Memcpy3DPeerAsync",
        "",

        CUDA_MEMCPY3D_PEER.const.p("pCopy", ""),
        nullable..CUstream("hStream", "")
    ).ptsz()

    CUresult(
        "PointerGetAttribute",
        "",

        Unsafe..void.p("data", ""),
        CUpointer_attribute("attribute", ""),
        CUdeviceptr("ptr", "")
    )

    CUresult(
        "StreamDestroy",
        "",

        CUstream("hStream", "")
    ).versioned()

    CUresult(
        "EventDestroy",
        "",

        CUevent("hEvent", "")
    ).versioned()

    CUresult(
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

    CUresult(
        "DeviceCanAccessPeer",
        "",

        Check(1)..int.p("canAccessPeer", ""),
        CUdevice("dev", ""),
        CUdevice("peerDev", "")
    )

    CUresult(
        "CtxEnablePeerAccess",
        "",

        CUcontext("peerContext", ""),
        unsigned_int("Flags", "")
    )

    CUresult(
        "CtxDisablePeerAccess",
        "",

        CUcontext("peerContext", "")
    )
}
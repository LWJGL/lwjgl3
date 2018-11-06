/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package cuda.templates

import cuda.*
import org.lwjgl.generator.*

val CU41 = "CU41".nativeClass(Module.CUDA, prefix = "CU", binding = NVCUDA_BINDING_DELEGATE) {
    extends = CU40
    documentation = "Contains bindings to <a href=\"https://docs.nvidia.com/cuda/cuda-driver-api/index.html\">CUDA Driver API</a>."

    IntConstant("", "IPC_HANDLE_SIZE".."64")

    EnumConstant(
        "CUDA Ipc Mem Flags. ({@code CUipcMem_flags})",

        "IPC_MEM_LAZY_ENABLE_PEER_ACCESS".enum("Automatically enable peer access between remote devices as needed", 0x1)
    )

    CUresult(
        "DeviceGetByPCIBusId",
        "",

        Check(1)..CUdevice.p.OUT("dev", ""),
        charASCII.const.p("pciBusId", "")
    )

    CUresult(
        "DeviceGetPCIBusId",
        "",

        charASCII.p.OUT("pciBusId", ""),
        AutoSize("pciBusId")..int("len", ""),
        CUdevice("dev", "")
    )

    CUresult(
        "IpcGetEventHandle",
        "",

        CUipcEventHandle.p.OUT("pHandle", ""),
        CUevent("event", "")
    )

    CUresult(
        "IpcOpenEventHandle",
        "",

        Check(1)..CUevent.p.OUT("phEvent", ""),
        CUipcEventHandle("handle", "")
    )

    CUresult(
        "IpcGetMemHandle",
        "",

        CUipcMemHandle.p.OUT("pHandle", ""),
        CUdeviceptr("dptr", "")
    )

    CUresult(
        "IpcOpenMemHandle",
        "",

        Check(1)..CUdeviceptr.p.OUT("pdptr", ""),
        CUipcMemHandle("handle", ""),
        unsigned_int("Flags", "")
    )

    CUresult(
        "IpcCloseMemHandle",
        "",

        CUdeviceptr("dptr", "")
    )
}
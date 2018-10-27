/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package cuda.templates

import cuda.*
import org.lwjgl.generator.*

val CU60 = "CU60".nativeClass(Module.CUDA, prefix = "CU", binding = NVCUDA_BINDING_DELEGATE) {
    javaImport("static org.lwjgl.cuda.CUDA.*")
    extends = CU55
    documentation = "Contains bindings to <a href=\"https://docs.nvidia.com/cuda/cuda-driver-api/index.html\">CUDA Driver API</a>."

    EnumConstant(
        "CUDA Mem Attach Flags. ({@code CUmemAttach_flags})",

        "MEM_ATTACH_GLOBAL".enum("Memory can be accessed by any stream on any device", 0x1),
        "MEM_ATTACH_HOST".enum("Memory cannot be accessed by any stream on any device", 0x2),
        "MEM_ATTACH_SINGLE".enum("Memory can only be accessed by a single stream on the associated device", 0x4)
    )

    CUresult(
        "MemAllocManaged",
        "",

        Check(1)..CUdeviceptr.p.OUT("dptr", ""),
        size_t.IN("bytesize", ""),
        unsigned_int.IN("flags", "")
    )

    CUresult(
        "PointerSetAttribute",
        "",

        Unsafe..void.const.p.IN("value", ""),
        CUpointer_attribute.IN("attribute", ""),
        CUdeviceptr.IN("ptr", "")
    )

    CUresult(
        "StreamAttachMemAsync",
        "",

        nullable..CUstream.IN("hStream", ""),
        CUdeviceptr.IN("dptr", ""),
        size_t.IN("length", ""),
        unsigned_int.IN("flags", "")
    ).ptsz()
}
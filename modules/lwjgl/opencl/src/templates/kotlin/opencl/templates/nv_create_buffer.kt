/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val nv_create_buffer = "NVCreateBuffer".nativeClassCL("nv_create_buffer", NV) {
    documentation = "Native bindings to the $extensionLink extension."

    IntConstant(
        "",

        "MEM_LOCATION_HOST_NV".."(1 << 0)",
        "MEM_PINNED_NV".."(1 << 1)"
    )

    val CreateBuffer = CL10["CreateBuffer"]
    cl_mem(
        "CreateBufferNV",
        "",

        CreateBuffer["context"],
        CreateBuffer["flags"],
        cl_mem_flags_NV("flags_NV", ""),
        CreateBuffer["size"],
        CreateBuffer["host_ptr"],
        CreateBuffer["errcode_ret"]
    )
}
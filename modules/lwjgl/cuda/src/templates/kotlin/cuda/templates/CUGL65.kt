/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package cuda.templates

import cuda.*
import org.lwjgl.generator.*

val CUGL65 = "CUGL65".nativeClass(Module.CUDA, prefix = "CU", binding = NVCUDA_BINDING_DELEGATE) {
    javaImport("static org.lwjgl.cuda.CUDA.*")
    extends = CUGL
    documentation =
        """
        Contains bindings to <a href="https://docs.nvidia.com/cuda/cuda-driver-api/group__CUDA__GL.html\#group__CUDA__GL">CUDA Driver OpenGL
        Interoperability API</a>.
        """

    EnumConstant(
        "CUDA devices corresponding to an OpenGL device. ({@code CUGLDeviceList})",

        "GL_DEVICE_LIST_ALL".enum("The CUDA devices for all GPUs used by the current OpenGL context.", 0x01),
        "GL_DEVICE_LIST_CURRENT_FRAME".enum("The CUDA devices for the GPUs used by the current OpenGL context in its currently rendering frame."),
        "GL_DEVICE_LIST_NEXT_FRAME".enum("The CUDA devices for the GPUs to be used by the current OpenGL context in the next frame.")
    )

    CUresult(
        "GLGetDevices",
        "",

        Check(1)..unsigned_int.p("pCudaDeviceCount", ""),
        CUdevice.p("pCudaDevices", ""),
        AutoSize("pCudaDevices")..unsigned_int("cudaDeviceCount", ""),
        CUGLDeviceList("deviceList", "")
    ).versioned()
}
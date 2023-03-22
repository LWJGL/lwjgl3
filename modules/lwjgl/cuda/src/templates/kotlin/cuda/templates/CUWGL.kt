/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package cuda.templates

import cuda.*
import org.lwjgl.generator.*

val CUWGL = "CUWGL".nativeClass(Module.CUDA, prefix = "CU", binding = NVCUDA_BINDING_DELEGATE) {
    javaImport("static org.lwjgl.cuda.CUDA.*")
    documentation =
        """
        Contains bindings to <a href="https://docs.nvidia.com/cuda/cuda-driver-api/group__CUDA__GL.html\#group__CUDA__GL">CUDA Driver OpenGL
        Interoperability API</a>.

        This class contains Windows-specific functionality.
        """

    CUresult(
        "WGLGetDevice",
        "",

        Check(1)..CUdevice.p("pDevice", ""),
        HGPUNV("hGpu", "")
    )
}
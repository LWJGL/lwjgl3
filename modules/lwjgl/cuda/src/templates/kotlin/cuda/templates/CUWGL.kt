/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package cuda.templates

import cuda.*
import org.lwjgl.generator.*

val CUWGL = "CUWGL".nativeClass(Module.CUDA, prefix = "CU", binding = NVCUDA_BINDING_DELEGATE) {
    javaImport("static org.lwjgl.cuda.CUDA.*")

    CUresult(
        "WGLGetDevice",

        Check(1)..CUdevice.p("pDevice"),
        HGPUNV("hGpu")
    )
}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*
import core.windows.*

val WGL_NV_gpu_affinity = "WGLNVGPUAffinity".nativeClassWGL("WGL_NV_gpu_affinity", NV) {
    val wglMakeCurrent = "WGL#wglMakeCurrent()"
    val wglMakeContextCurrentARB = "#MakeContextCurrentARB()"

    IntConstant(
        "ERROR_INCOMPATIBLE_AFFINITY_MASKS_NV"..0x20D0
    ).noPrefix()

    IntConstant(
        "ERROR_MISSING_AFFINITY_MASK_NV"..0x20D1
    ).noPrefix()

    // Functions

    BOOL(
        "EnumGpusNV",

        UINT("gpuIndex"),
        Check(1)..HGPUNV.p("gpu")
    )

    BOOL(
        "EnumGpuDevicesNV",

        HGPUNV("gpu"),
        UINT("deviceIndex"),
        PGPU_DEVICE("gpuDevice")
    )

    HDC(
        "CreateAffinityDCNV",

        NullTerminated..HGPUNV.const.p("gpuList")
    )

    BOOL(
        "EnumGpusFromAffinityDCNV",

        HDC("affinityDC"),
        UINT("gpuIndex"),
        Check(1)..HGPUNV.p("gpu")
    )

    BOOL(
        "DeleteDCNV",

        HDC("hdc")
    )
}
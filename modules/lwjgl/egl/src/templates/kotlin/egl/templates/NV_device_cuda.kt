/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val NV_device_cuda = "NVDeviceCUDA".nativeClassEGL("NV_device_cuda", postfix = NV) {
    IntConstant(
        "CUDA_DEVICE_NV"..0x323A
    )
}
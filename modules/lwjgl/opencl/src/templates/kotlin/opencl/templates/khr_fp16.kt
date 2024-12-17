/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val khr_fp16 = "KHRFP16".nativeClassCL("khr_fp16", KHR) {

    IntConstant(
        "DEVICE_HALF_FP_CONFIG"..0x1033
    )

}
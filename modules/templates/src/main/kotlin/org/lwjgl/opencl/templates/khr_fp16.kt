/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

val khr_fp16 = "KHRFP16".nativeClassCL("khr_fp16", KHR) {

    documentation = "Native bindings to the $extensionName extension."

    IntConstant(
        "cl_device_info",

        "DEVICE_HALF_FP_CONFIG"..0x1033
    )

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val khr_fp64 = "KHRFP64".nativeClassCL("khr_fp64", KHR) {

    IntConstant(
        "DEVICE_DOUBLE_FP_CONFIG"..0x1032
    )

}
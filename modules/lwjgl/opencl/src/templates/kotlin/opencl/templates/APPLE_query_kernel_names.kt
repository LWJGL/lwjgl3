/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val APPLE_query_kernel_names = "APPLEQueryKernelNames".nativeClassCL("APPLE_query_kernel_names", APPLE) {
    IntConstant(
        "PROGRAM_NUM_KERNELS_APPLE"..0x10000004
    )

    IntConstant(
        "PROGRAM_KERNEL_NAMES_APPLE"..0x10000005
    )
}
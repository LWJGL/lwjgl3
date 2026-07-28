/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val intel_kernel_allocations_info = "INTELKernelAllocationsInfo".nativeClassCL("intel_kernel_allocations_info", INTEL) {
    IntConstant(
        "KERNEL_ALLOCATIONS_INFO_INTEL"..0x425A
    )
}
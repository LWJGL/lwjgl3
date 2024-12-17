/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val intel_subgroups = "INTELSubgroups".nativeClassCL("intel_subgroups", INTEL) {
    IntConstant(
        "KERNEL_MAX_SUB_GROUP_SIZE_FOR_NDRANGE_KHR"..0x2033,
        "KERNEL_SUB_GROUP_COUNT_FOR_NDRANGE_KHR"..0x2034
    )
}
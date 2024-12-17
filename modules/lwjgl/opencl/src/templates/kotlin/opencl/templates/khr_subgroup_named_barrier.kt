/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val khr_subgroup_named_barrier = "KHRSubgroupNamedBarrier".nativeClassCL("khr_subgroup_named_barrier", KHR) {
    IntConstant(
        "DEVICE_MAX_NAMED_BARRIER_COUNT_KHR"..0x2035
    )
}
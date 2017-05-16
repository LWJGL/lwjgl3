/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

val khr_subgroup_named_barrier = "KHRSubgroupNamedBarrier".nativeClassCL("khr_subgroup_named_barrier", KHR) {
    documentation =
        """
        Native bindings to the $extensionName extension.

        This extension adds barrier operations that cover subsets of an OpenCL work-group.
        """

    IntConstant(
        "Maximum number of named barriers in a work-group for any given kernel-instance running on the device. The minimum value is 8.",

        "DEVICE_MAX_NAMED_BARRIER_COUNT_KHR"..0x2035
    )
}
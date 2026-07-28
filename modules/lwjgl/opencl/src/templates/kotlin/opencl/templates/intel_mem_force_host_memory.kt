/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val intel_mem_force_host_memory = "INTELMemForceHostMemory".nativeClassCL("intel_mem_force_host_memory", INTEL) {
    LongConstant(
        "MEM_FORCE_HOST_MEMORY_INTEL".."(1L << 20)"
    )
}

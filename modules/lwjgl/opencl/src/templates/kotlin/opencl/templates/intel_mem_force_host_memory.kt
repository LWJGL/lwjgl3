/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val intel_mem_force_host_memory = "INTELMemForceHostMemory".nativeClassCL("intel_mem_force_host_memory", INTEL) {
    IntConstant(
        "MEM_FORCE_HOST_MEMORY_INTEL".."(1 << 20)"
    )
}

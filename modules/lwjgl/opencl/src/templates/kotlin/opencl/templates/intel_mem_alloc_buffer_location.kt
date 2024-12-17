/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val intel_mem_alloc_buffer_location = "INTELMemAllocBufferLocation".nativeClassCL("intel_mem_alloc_buffer_location", INTEL) {
    IntConstant(
        "MEM_ALLOC_BUFFER_LOCATION_INTEL"..0x419E
    )
}
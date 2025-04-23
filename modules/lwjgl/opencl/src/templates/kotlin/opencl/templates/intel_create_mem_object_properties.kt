/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val intel_create_mem_object_properties = "INTELCreateMemObjectProperties".nativeClassCL("intel_create_mem_object_properties", INTEL) {
    IntConstant(
        "MEM_LOCALLY_UNCACHED_RESOURCE_INTEL"..0x4218,
        "MEM_DEVICE_ID_INTEL"..0x4219,
    )
}
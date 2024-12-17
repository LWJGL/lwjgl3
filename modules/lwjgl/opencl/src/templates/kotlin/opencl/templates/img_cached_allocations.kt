/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val img_cached_allocations = "IMGCachedAllocations".nativeClassCL("img_cached_allocations", IMG) {
    IntConstant(
        "MEM_USE_UNCACHED_CPU_MEMORY_IMG".."1 << 26",
        "MEM_USE_CACHED_CPU_MEMORY_IMG".."1 << 27"
    )
}
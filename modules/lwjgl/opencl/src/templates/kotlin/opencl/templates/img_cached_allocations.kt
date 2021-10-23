/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val img_cached_allocations = "IMGCachedAllocations".nativeClassCL("img_cached_allocations", IMG) {
    documentation =
        """
        Native bindings to the $extensionLink extension.

        This extension extends the functionality provided by #CreateBuffer() and #CreateImage() to allow the OpenCL implementation to allocate memory on the
        device which is also cached on the host CPU.
        
        Requires ${CL12.link}.
        """

    IntConstant(
        "Accepted value for the {@code flags} parameter to #CreateBuffer() and #CreateImage().",

        "MEM_USE_UNCACHED_CPU_MEMORY_IMG".."1 << 26",
        "MEM_USE_CACHED_CPU_MEMORY_IMG".."1 << 27"
    )
}
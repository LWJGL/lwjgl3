/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val intel_mem_force_host_memory = "INTELMemForceHostMemory".nativeClassCL("intel_mem_force_host_memory", INTEL) {
    documentation =
        """
        Native bindings to the $extensionLink extension.

        This extension allows an application to override driver heuristics to force allocation of a buffer memory object in host memory. Host memory is
        described in the {@code cl_intel_unified_shared_memory} extension.

        Allocating a buffer memory object in host memory trades off wide accessibility and transfer benefits for higher per-access costs. Buffer memory objects
        in host memory may also be subject to additional usage restrictions.

        Requires {@link CL12 OpenCL 1.2}.
        """

    IntConstant(
        "Flag of type {@code cl_mem_flags}, used when creating a buffer object to force allocation of a buffer memory object in host memory.",

        "MEM_FORCE_HOST_MEMORY_INTEL".."(1 << 20)"
    )
}

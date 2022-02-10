/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val arm_protected_memory_allocation = "ARMProtectedMemoryAllocation".nativeClassCL("arm_protected_memory_allocation", ARM) {
    documentation =
        """
        Native bindings to the $extensionLink extension.

        This extensions enables the creation of buffers and images backed by protected memory, i.e. memory protected using TrustZone Media Protection.

        Requires ${CL12.link}.
        """

    IntConstant(
        """
        New flag added to {@code cl_mem_flags}.

        Specifies that the memory object being created will be backed by protected memory. When this flag is present, the only host flag allowed is
        #MEM_HOST_NO_ACCESS. If host flags are omitted, {@code CL_MEM_HOST_NO_ACCESS} is assumed.
        """,

        "MEM_PROTECTED_ALLOC_ARM".."1 << 36"
    )
}
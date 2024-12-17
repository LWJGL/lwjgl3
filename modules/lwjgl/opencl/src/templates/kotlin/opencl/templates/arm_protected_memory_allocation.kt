/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val arm_protected_memory_allocation = "ARMProtectedMemoryAllocation".nativeClassCL("arm_protected_memory_allocation", ARM) {
    IntConstant(
        "MEM_PROTECTED_ALLOC_ARM".."1 << 36"
    )
}
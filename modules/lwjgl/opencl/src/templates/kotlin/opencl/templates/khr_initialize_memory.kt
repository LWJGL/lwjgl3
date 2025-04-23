/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val khr_initialize_memory = "KHRInitializeMemory".nativeClassCL("khr_initialize_memory", KHR) {
    IntConstant(
        "CONTEXT_MEMORY_INITIALIZE_KHR"..0x2030
    )

    IntConstant(
        "CONTEXT_MEMORY_INITIALIZE_LOCAL_KHR".."1 << 0",
        "CONTEXT_MEMORY_INITIALIZE_PRIVATE_KHR".."1 << 1",
    )
}
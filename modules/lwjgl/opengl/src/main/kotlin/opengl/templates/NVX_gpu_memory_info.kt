/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val NVX_gpu_memory_info = "NVXGPUMemoryInfo".nativeClassGL("NVX_gpu_memory_info", postfix = NVX) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        GL_NVX_gpu_memory_info provides applications visibility into GPU hardware memory utilization in order to allow the application to effectively manage
        its resource allocations in the scope of the current available GPU memory.
    
        Requires ${GL20.core}
        """

    IntConstant(
        "Accepted by the {@code param} parameter of GetIntegerv.",

        "GPU_MEMORY_INFO_DEDICATED_VIDMEM_NVX"..0x9047,
        "GPU_MEMORY_INFO_TOTAL_AVAILABLE_MEMORY_NVX"..0x9048,
        "GPU_MEMORY_INFO_CURRENT_AVAILABLE_VIDMEM_NVX"..0x9049,
        "GPU_MEMORY_INFO_EVICTION_COUNT_NVX"..0x904A,
        "GPU_MEMORY_INFO_EVICTED_MEMORY_NVX"..0x904B
    )
}

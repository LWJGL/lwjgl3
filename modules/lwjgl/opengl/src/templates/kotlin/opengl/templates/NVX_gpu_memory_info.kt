/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NVX_gpu_memory_info = "NVXGPUMemoryInfo".nativeClassGL("NVX_gpu_memory_info", postfix = NVX) {
    IntConstant(
        "GPU_MEMORY_INFO_DEDICATED_VIDMEM_NVX"..0x9047,
        "GPU_MEMORY_INFO_TOTAL_AVAILABLE_MEMORY_NVX"..0x9048,
        "GPU_MEMORY_INFO_CURRENT_AVAILABLE_VIDMEM_NVX"..0x9049,
        "GPU_MEMORY_INFO_EVICTION_COUNT_NVX"..0x904A,
        "GPU_MEMORY_INFO_EVICTED_MEMORY_NVX"..0x904B
    )
}

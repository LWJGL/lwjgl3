/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_external_memory_dma_buf = "EXTExternalMemoryDmaBuf".nativeClassVK("EXT_external_memory_dma_buf", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_EXTERNAL_MEMORY_DMA_BUF_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_EXTERNAL_MEMORY_DMA_BUF_EXTENSION_NAME".."VK_EXT_external_memory_dma_buf"
    )

    EnumConstant(
        "EXTERNAL_MEMORY_HANDLE_TYPE_DMA_BUF_BIT_EXT".enum(0x00000200)
    )
}
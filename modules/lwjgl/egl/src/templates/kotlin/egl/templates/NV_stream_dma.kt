/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val NV_stream_dma = "NVStreamDMA".nativeClassEGL("NV_stream_dma", postfix = NV) {
    IntConstant(
        "STREAM_DMA_NV"..0x3371,
        "STREAM_DMA_SERVER_NV"..0x3372
    )
}
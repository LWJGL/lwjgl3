/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val NV_stream_fifo_next = "NVStreamFIFONext".nativeClassEGL("NV_stream_fifo_next", postfix = NV) {
    IntConstant(
        "PENDING_FRAME_NV"..0x3329
    )

    IntConstant(
        "STREAM_TIME_PENDING_NV"..0x332A
    )
}
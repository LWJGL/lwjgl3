/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val NV_stream_fifo_synchronous = "NVStreamFIFOSynchronous".nativeClassEGL("NV_stream_fifo_synchronous", postfix = NV) {
    IntConstant(
        "STREAM_FIFO_SYNCHRONOUS_NV"..0x3336
    )
}
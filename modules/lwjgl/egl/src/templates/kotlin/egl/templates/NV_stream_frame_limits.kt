/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val NV_stream_frame_limits = "NVStreamFrameLimits".nativeClassEGL("NV_stream_frame_limits", postfix = NV) {
    IntConstant(
        "PRODUCER_MAX_FRAME_HINT_NV"..0x3337,
        "CONSUMER_MAX_FRAME_HINT_NV"..0x3338
    )
}
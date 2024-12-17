/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val NV_stream_remote = "NVStreamRemote".nativeClassEGL("NV_stream_remote", postfix = NV) {
    IntConstant(
        "STREAM_STATE_INITIALIZING_NV"..0x3240
    )

    IntConstant(
        "STREAM_TYPE_NV"..0x3241,
        "STREAM_PROTOCOL_NV"..0x3242,
        "STREAM_ENDPOINT_NV"..0x3243
    )

    IntConstant(
        "STREAM_LOCAL_NV"..0x3244
    )

    IntConstant(
        "STREAM_CROSS_OBJECT_NV"..0x334D,
        "STREAM_CROSS_DISPLAY_NV"..0x334E,
        "STREAM_CROSS_PROCESS_NV"..0x3245,
        "STREAM_CROSS_PARTITION_NV"..0x323F,
        "STREAM_CROSS_SYSTEM_NV"..0x334F
    )

    IntConstant(
        "STREAM_PROTOCOL_FD_NV"..0x3246
    )

    IntConstant(
        "STREAM_PRODUCER_NV"..0x3247,
        "STREAM_CONSUMER_NV"..0x3248
    )
}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val NV_stream_metadata = "NVStreamMetadata".nativeClassEGL("NV_stream_metadata", postfix = NV) {
    IntConstant(
        "MAX_STREAM_METADATA_BLOCKS_NV"..0x3250,
        "MAX_STREAM_METADATA_BLOCK_SIZE_NV"..0x3251,
        "MAX_STREAM_METADATA_TOTAL_SIZE_NV"..0x3252
    )

    IntConstant(
        "PRODUCER_METADATA_NV"..0x3253,
        "CONSUMER_METADATA_NV"..0x3254,
        "PENDING_METADATA_NV"..0x3328
    )

    IntConstant(
        "METADATA0_SIZE_NV"..0x3255,
        "METADATA1_SIZE_NV"..0x3256,
        "METADATA2_SIZE_NV"..0x3257,
        "METADATA3_SIZE_NV"..0x3258,
        "METADATA0_TYPE_NV"..0x3259,
        "METADATA1_TYPE_NV"..0x325A,
        "METADATA2_TYPE_NV"..0x325B,
        "METADATA3_TYPE_NV"..0x325C
    )

    EGLBoolean(
        "QueryDisplayAttribNV",

        EGLDisplay("dpy"),
        EGLint("attribute"),
        Check(1)..EGLAttrib.p("value")
    )

    EGLBoolean(
        "SetStreamMetadataNV",

        EGLDisplay("dpy"),
        EGLStreamKHR("stream"),
        EGLint("n"),
        EGLint("offset"),
        AutoSize("data")..EGLint("size"),
        void.const.p("data")
    )

    EGLBoolean(
        "QueryStreamMetadataNV",

        EGLDisplay("dpy"),
        EGLStreamKHR("stream"),
        EGLenum("name"),
        EGLint("n"),
        EGLint("offset"),
        AutoSize("data")..EGLint("size"),
        void.p("data")
    )
}
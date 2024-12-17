/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val NV_stream_consumer_gltexture_yuv = "NVStreamConsumerGLTextureYUV".nativeClassEGL("NV_stream_consumer_gltexture_yuv", postfix = NV) {
    IntConstant(
        "YUV_PLANE0_TEXTURE_UNIT_NV"..0x332C,
        "YUV_PLANE1_TEXTURE_UNIT_NV"..0x332D,
        "YUV_PLANE2_TEXTURE_UNIT_NV"..0x332E
    )

    IntConstant(
        "YUV_NUMBER_OF_PLANES_EXT"..0x3311
    )

    IntConstant(
        "YUV_BUFFER_EXT"..0x3300
    )

    EGLBoolean(
        "StreamConsumerGLTextureExternalAttribsNV",

        EGLDisplay("dpy"),
        EGLStreamKHR("stream"),
        nullable..noneTerminated..EGLAttrib.const.p("attrib_list")
    )
}
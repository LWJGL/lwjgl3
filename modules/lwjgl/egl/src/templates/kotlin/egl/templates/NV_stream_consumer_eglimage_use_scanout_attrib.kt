/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val NV_stream_consumer_eglimage_use_scanout_attrib = "NVStreamConsumerEGLImageUseScanoutAttrib".nativeClassEGL("NV_stream_consumer_eglimage_use_scanout_attrib", postfix = NV) {
    IntConstant(
        "STREAM_CONSUMER_IMAGE_USE_SCANOUT_NV"..0x3378
    )
}
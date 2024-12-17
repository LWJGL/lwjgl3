/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EXT_stream_consumer_egloutput = "EXTStreamConsumerEGLOutput".nativeClassEGL("EXT_stream_consumer_egloutput", postfix = EXT) {
    EGLBoolean(
        "StreamConsumerOutputEXT",

        EGLDisplay("dpy"),
        EGLStreamKHR("stream"),
        EGLOutputLayerEXT("layer")
    )
}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val NV_post_sub_buffer = "NVPostSubBuffer".nativeClassEGL("NV_post_sub_buffer", postfix = NV) {
    IntConstant(
        "POST_SUB_BUFFER_SUPPORTED_NV"..0x30BE
    )

    EGLBoolean(
        "PostSubBufferNV",

        EGLDisplay("dpy"),
        EGLSurface("surface"),
        EGLint("x"),
        EGLint("y"),
        EGLint("width"),
        EGLint("height")
    )
}
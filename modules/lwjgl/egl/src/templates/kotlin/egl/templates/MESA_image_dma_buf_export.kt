/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val MESA_image_dma_buf_export = "MESAImageDMABufExport".nativeClassEGL("MESA_image_dma_buf_export", postfix = MESA) {
    EGLBoolean(
        "ExportDMABUFImageQueryMESA",

        EGLDisplay("dpy"),
        EGLImageKHR("image"),
        nullable..Check(1)..int.p("fourcc"),
        nullable..Check(1)..int.p("num_planes"),
        nullable..Check(1)..EGLuint64KHR.p("modifiers")
    )

    EGLBoolean(
        "ExportDMABUFImageMESA",

        EGLDisplay("dpy"),
        EGLImageKHR("image"),
        nullable..Check(1)..int.p("fds"),
        nullable..Check(1)..EGLint.p("strides"),
        nullable..Check(1)..EGLint.p("offsets")
    )
}
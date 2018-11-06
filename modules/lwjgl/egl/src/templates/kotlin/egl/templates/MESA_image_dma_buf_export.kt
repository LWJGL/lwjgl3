/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val MESA_image_dma_buf_export = "MESAImageDMABufExport".nativeClassEGL("MESA_image_dma_buf_export", postfix = MESA) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension provides entry points for integrating EGLImage with the dma-buf infrastructure. The extension allows creating a Linux dma_buf file
        descriptor or multiple file descriptors, in the case of multi-plane YUV image, from an EGLImage.

        It is designed to provide the complementary functionality to EGL_EXT_image_dma_buf_import.

        Requires ${EGL14.core} and ${KHR_image_base.link}. The EGL implementation must be running on a Linux kernel supporting the dma_buf buffer sharing
        mechanism.
        """

    EGLBoolean(
        "ExportDMABUFImageQueryMESA",
        "",

        EGLDisplay("dpy", ""),
        EGLImageKHR("image", ""),
        nullable..Check(1)..int.p("fourcc", ""),
        nullable..Check(1)..int.p("num_planes", ""),
        nullable..Check(1)..EGLuint64KHR.p("modifiers", "")
    )

    EGLBoolean(
        "ExportDMABUFImageMESA",
        "",

        EGLDisplay("dpy", ""),
        EGLImageKHR("image", ""),
        nullable..Check(1)..int.p("fds", ""),
        nullable..Check(1)..EGLint.p("strides", ""),
        nullable..Check(1)..EGLint.p("offsets", "")
    )
}
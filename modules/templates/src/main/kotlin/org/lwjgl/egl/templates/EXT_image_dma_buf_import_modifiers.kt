/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val EXT_image_dma_buf_import_modifiers = "EXTImageDMABufImportModifiers".nativeClassEGL("EXT_image_dma_buf_import_modifiers", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension builds on ${EXT_image_dma_buf_import.link}, in order to support format modifiers used for tiling, compression, and additional non-linear
        modes. It also adds support for a fourth auxiliary plane, and queries for the implementation-supported types.

        Requires ${EXT_image_dma_buf_import.link}.
        """

    IntConstant(
        "Accepted as an attribute in the {@code attrib_list} parameter of #CreateImageKHR().",

        "DMA_BUF_PLANE0_MODIFIER_LO_EXT"..0x3443,
        "DMA_BUF_PLANE0_MODIFIER_HI_EXT"..0x3444,
        "DMA_BUF_PLANE1_MODIFIER_LO_EXT"..0x3445,
        "DMA_BUF_PLANE1_MODIFIER_HI_EXT"..0x3446,
        "DMA_BUF_PLANE2_MODIFIER_LO_EXT"..0x3447,
        "DMA_BUF_PLANE2_MODIFIER_HI_EXT"..0x3448,
        "DMA_BUF_PLANE3_FD_EXT"..0x3440,
        "DMA_BUF_PLANE3_OFFSET_EXT"..0x3441,
        "DMA_BUF_PLANE3_PITCH_EXT"..0x3442,
        "DMA_BUF_PLANE3_MODIFIER_LO_EXT"..0x3449,
        "DMA_BUF_PLANE3_MODIFIER_HI_EXT"..0x344A
    )

    EGLBoolean(
        "QueryDmaBufFormatsEXT",
        "",

        EGLDisplay.IN("dpy", ""),
        AutoSize("formats")..EGLint.IN("max_formats", ""),
        nullable..EGLint_p.OUT("formats", ""),
        Check(1)..EGLint_p.OUT("num_formats", "")
    )

    EGLBoolean(
        "QueryDmaBufModifiersEXT",
        "",

        EGLDisplay.IN("dpy", ""),
        EGLint.IN("format", ""),
        AutoSize("modifiers", "external_only")..EGLint.IN("max_modifiers", ""),
        nullable..EGLuint64KHR_p.OUT("modifiers", ""),
        nullable..EGLBoolean_p.OUT("external_only", ""),
        Check(1)..EGLint_p.OUT("num_modifiers", "")
    )
}
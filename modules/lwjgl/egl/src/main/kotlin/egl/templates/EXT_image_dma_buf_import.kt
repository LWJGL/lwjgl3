/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val EXT_image_dma_buf_import = "EXTImageDMABufImport".nativeClassEGL("EXT_image_dma_buf_import", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension allows creating an EGLImage from a Linux dma_buf file descriptor or multiple file descriptors in the case of multi-plane YUV images.

        Requires ${EGL12.core} and ${KHR_image_base.link}. The EGL implementation must be running on a Linux kernel supporting the dma_buf buffer sharing
        mechanism.
        """

    IntConstant(
        "",

        "LINUX_DMA_BUF_EXT"..0x3270,
        "LINUX_DRM_FOURCC_EXT"..0x3271,
        "DMA_BUF_PLANE0_FD_EXT"..0x3272,
        "DMA_BUF_PLANE0_OFFSET_EXT"..0x3273,
        "DMA_BUF_PLANE0_PITCH_EXT"..0x3274,
        "DMA_BUF_PLANE1_FD_EXT"..0x3275,
        "DMA_BUF_PLANE1_OFFSET_EXT"..0x3276,
        "DMA_BUF_PLANE1_PITCH_EXT"..0x3277,
        "DMA_BUF_PLANE2_FD_EXT"..0x3278,
        "DMA_BUF_PLANE2_OFFSET_EXT"..0x3279,
        "DMA_BUF_PLANE2_PITCH_EXT"..0x327A,
        "YUV_COLOR_SPACE_HINT_EXT"..0x327B,
        "SAMPLE_RANGE_HINT_EXT"..0x327C,
        "YUV_CHROMA_HORIZONTAL_SITING_HINT_EXT"..0x327D,
        "YUV_CHROMA_VERTICAL_SITING_HINT_EXT"..0x327E,
        "ITU_REC601_EXT"..0x327F,
        "ITU_REC709_EXT"..0x3280,
        "ITU_REC2020_EXT"..0x3281,
        "YUV_FULL_RANGE_EXT"..0x3282,
        "YUV_NARROW_RANGE_EXT"..0x3283,
        "YUV_CHROMA_SITING_0_EXT"..0x3284,
        "YUV_CHROMA_SITING_0_5_EXT"..0x3285
    )
}
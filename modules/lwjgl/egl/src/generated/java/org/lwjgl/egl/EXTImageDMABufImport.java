/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/EXT/EGL_EXT_image_dma_buf_import.txt">EXT_image_dma_buf_import</a> extension.
 * 
 * <p>This extension allows creating an EGLImage from a Linux dma_buf file descriptor or multiple file descriptors in the case of multi-plane YUV images.</p>
 * 
 * <p>Requires {@link EGL12 EGL 1.2} and {@link KHRImageBase KHR_image_base}. The EGL implementation must be running on a Linux kernel supporting the dma_buf buffer sharing
 * mechanism.</p>
 */
public final class EXTImageDMABufImport {

    public static final int
        EGL_LINUX_DMA_BUF_EXT                     = 0x3270,
        EGL_LINUX_DRM_FOURCC_EXT                  = 0x3271,
        EGL_DMA_BUF_PLANE0_FD_EXT                 = 0x3272,
        EGL_DMA_BUF_PLANE0_OFFSET_EXT             = 0x3273,
        EGL_DMA_BUF_PLANE0_PITCH_EXT              = 0x3274,
        EGL_DMA_BUF_PLANE1_FD_EXT                 = 0x3275,
        EGL_DMA_BUF_PLANE1_OFFSET_EXT             = 0x3276,
        EGL_DMA_BUF_PLANE1_PITCH_EXT              = 0x3277,
        EGL_DMA_BUF_PLANE2_FD_EXT                 = 0x3278,
        EGL_DMA_BUF_PLANE2_OFFSET_EXT             = 0x3279,
        EGL_DMA_BUF_PLANE2_PITCH_EXT              = 0x327A,
        EGL_YUV_COLOR_SPACE_HINT_EXT              = 0x327B,
        EGL_SAMPLE_RANGE_HINT_EXT                 = 0x327C,
        EGL_YUV_CHROMA_HORIZONTAL_SITING_HINT_EXT = 0x327D,
        EGL_YUV_CHROMA_VERTICAL_SITING_HINT_EXT   = 0x327E,
        EGL_ITU_REC601_EXT                        = 0x327F,
        EGL_ITU_REC709_EXT                        = 0x3280,
        EGL_ITU_REC2020_EXT                       = 0x3281,
        EGL_YUV_FULL_RANGE_EXT                    = 0x3282,
        EGL_YUV_NARROW_RANGE_EXT                  = 0x3283,
        EGL_YUV_CHROMA_SITING_0_EXT               = 0x3284,
        EGL_YUV_CHROMA_SITING_0_5_EXT             = 0x3285;

    private EXTImageDMABufImport() {}

}
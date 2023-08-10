/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/NV/EGL_NV_stream_consumer_eglimage_use_scanout_attrib.txt">NV_stream_consumer_eglimage_use_scanout_attrib</a> extension.
 * 
 * <p>This extension allows clients to specify to EGL implementations if the images frames in the {@code EGLStream} acquired as {@code EGLImages} are to be
 * scanned out directly by display hardware.</p>
 * 
 * <p>Requires {@link NVStreamConsumerEGLImage NV_stream_consumer_eglimage}.</p>
 */
public final class NVStreamConsumerEGLImageUseScanoutAttrib {

    /** Accepted as an attribute name in the {@code attrib_list} parameter of {@link NVStreamConsumerEGLImage#eglStreamImageConsumerConnectNV StreamImageConsumerConnectNV}. */
    public static final int EGL_STREAM_CONSUMER_IMAGE_USE_SCANOUT_NV = 0x3378;

    private NVStreamConsumerEGLImageUseScanoutAttrib() {}

}
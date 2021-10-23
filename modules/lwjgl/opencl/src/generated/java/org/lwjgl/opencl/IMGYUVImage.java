/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

/**
 * Native bindings to the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/img/cl_img_yuv_image.txt">img_yuv_image</a> extension.
 * 
 * <p>This extension provides new image formats to read YUV images, such as those provided by cameras on mobile devices.</p>
 * 
 * <p>Requires {@link CL12 CL12}.</p>
 */
public final class IMGYUVImage {

    /** New values accepted for the {@code image_channel_order} member in {@link CLImageFormat}. */
    public static final int
        CL_NV21_IMG = 0x40D0,
        CL_YV12_IMG = 0x40D1;

    private IMGYUVImage() {}

}
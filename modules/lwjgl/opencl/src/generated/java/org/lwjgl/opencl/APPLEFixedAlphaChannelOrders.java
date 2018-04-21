/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

/**
 * Native bindings to the <strong>APPLE_fixed_alpha_channel_orders</strong> extension.
 * 
 * <p>These selectors may be passed to {@link CL10#clCreateImage2D CreateImage2D} in the cl_image_format.image_channel_order field. They are like {@link CL10#CL_BGRA BGRA} and {@link CL10#CL_ARGB ARGB} except
 * that the alpha channel to be ignored.  On calls to {@code read_imagef}, the alpha will be 0xff (1.0f) if the sample falls in the image and 0 if it does
 * not fall in the image. On calls to {@code write_imagef}, the alpha value is ignored and 0xff (1.0f) is written. These formats are currently only
 * available for the {@link CL10#CL_UNORM_INT8 UNORM_INT8} cl_channel_type. They are intended to support legacy image formats.</p>
 */
public final class APPLEFixedAlphaChannelOrders {

    public static final int
        CL_1RGB_APPLE = 0x10000006,
        CL_BGR1_APPLE = 0x10000007;

    private APPLEFixedAlphaChannelOrders() {}

}
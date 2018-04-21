/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

/** Native bindings to the <strong>khr_image2d_from_buffer</strong> extension. */
public final class KHRImage2DFromBuffer {

    /**
     * Accepted as the {@code param_name} parameter of {@link CL10#clGetDeviceInfo GetDeviceInfo}.
     * 
     * <p>Returns the row pitch alignment size in pixels for images created from a buffer. The value returned must be a power of 2. If the device does not support
     * images, this value should be 0.</p>
     */
    public static final int CL_DEVICE_IMAGE_PITCH_ALIGNMENT = 0x104A;

    /**
     * Accepted as the {@code param_name} parameter of {@link CL10#clGetDeviceInfo GetDeviceInfo}.
     * 
     * <p>This query should be used when an image is created from a buffer which was created using {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}. The value returned must be a
     * power of 2.</p>
     * 
     * <p>This query specifies the minimum alignment in pixels of the {@code host_ptr} specified to {@link CL10#clCreateBuffer CreateBuffer}. If the device does not support
     * images, this value should be 0.</p>
     */
    public static final int CL_DEVICE_IMAGE_BASE_ADDRESS_ALIGNMENT = 0x104B;

    private KHRImage2DFromBuffer() {}

}
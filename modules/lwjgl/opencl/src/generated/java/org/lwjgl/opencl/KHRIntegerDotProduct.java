/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

/**
 * Native bindings to the <strong>khr_integer_dot_product</strong> extension.
 * 
 * <p>This extension adds support for SPIR-V instructions and OpenCL C built-in functions to compute the dot product of vectors of integers.</p>
 */
public final class KHRIntegerDotProduct {

    /** Accepted value for the param_name parameter to {@link CL10#clGetDeviceInfo GetDeviceInfo}. */
    public static final int
        CL_DEVICE_INTEGER_DOT_PRODUCT_CAPABILITIES_KHR                          = 0x1073,
        CL_DEVICE_INTEGER_DOT_PRODUCT_ACCELERATION_PROPERTIES_8BIT_KHR          = 0x1074,
        CL_DEVICE_INTEGER_DOT_PRODUCT_ACCELERATION_PROPERTIES_4x8BIT_PACKED_KHR = 0x1075;

    /** {@code cl_device_integer_dot_product_capabilities_khr} */
    public static final int
        CL_DEVICE_INTEGER_DOT_PRODUCT_INPUT_4x8BIT_PACKED_KHR = (1 << 0),
        CL_DEVICE_INTEGER_DOT_PRODUCT_INPUT_4x8BIT_KHR        = (1 << 1);

    private KHRIntegerDotProduct() {}

}
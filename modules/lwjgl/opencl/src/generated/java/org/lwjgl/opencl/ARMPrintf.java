/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

/**
 * Native bindings to the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/arm/cl_arm_printf.txt">arm_printf</a> extension.
 * 
 * <p>This extension enables the device side printf built in function for OpenCL C versions prior to 1.2. It also extends the {@code cl_context_properties}
 * enumeration to allow a user defined {@code printf} callback and/or {@code printf} buffer size.</p>
 * 
 * <p>The {@code printf} built in function should be used for debugging purposes only and may have a significant negative impact on the performance of an
 * OpenCL application.</p>
 */
public final class ARMPrintf {

    /**
     * Accepted by the {@code properties} argument to {@link CL10#clCreateContext CreateContext}.
     * 
     * <p>Property value: {@code void printf_callback(const char *buffer, size_t len, size_t complete, void *user_data)}</p>
     * 
     * <p>Specifies a pointer to function to be invoked when printf data is available. Upon invocation the arguments are set to the following values.</p>
     * 
     * <ul>
     * <li>{@code buffer} is a pointer to a character array of size {@code len} created by printf.</li>
     * <li>{@code len} is the number of new characters in {@code buffer}.</li>
     * <li>{@code complete} is set to a non zero value if there is no more data in the device's printf buffer.</li>
     * <li>{@code user_data} is the {@code user_data} parameter specified to {@link CL10#clCreateContext CreateContext}.</li>
     * </ul>
     * 
     * <p>If this property is not specified, no callback will be registered and any printf output from a kernel will be discarded.</p>
     */
    public static final int CL_PRINTF_CALLBACK_ARM = 0x40B0;

    /**
     * Accepted by the {@code properties} argument to {@link CL10#clCreateContext CreateContext}.
     * 
     * <p>Property value: {@code size_t}</p>
     * 
     * <p>Specifies the size of printf buffer allocations to use within the driver. A printf buffer is allocated per device per context, within a context the
     * buffer will be shared between kernels executing on a device. The implementation is free to round up or ignore this value.</p>
     * 
     * <p>If this property is not specified an implementation defined default size will be chosen. For OpenCL driver versions prior to OpenCL 1.2 this value will
     * be 1 MiB. For driver versions of OpenCL 1.2 or greater this value is defined by the {@link CL12#CL_DEVICE_PRINTF_BUFFER_SIZE DEVICE_PRINTF_BUFFER_SIZE} parameter name for
     * {@link CL10#clGetDeviceInfo GetDeviceInfo}.</p>
     */
    public static final int CL_PRINTF_BUFFERSIZE_ARM = 0x40B1;

    private ARMPrintf() {}

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <strong>khr_create_command_queue</strong> extension.
 * 
 * <p>This extension allows OpenCL 1.x devices to support an equivalent of the {@link CL20#clCreateCommandQueueWithProperties CreateCommandQueueWithProperties} API that was added in OpenCL 2.0. This
 * allows OpenCL 1.x devices to support other optional extensions or features that use the {@code clCreateCommandQueueWithProperties} API to specify
 * additional command queue properties that cannot be specified using the OpenCL 1.x {@code clCreateCommandQueue} API.</p>
 * 
 * <p>No new command queue properties are required by this extension. Applications may use the existing {@link CL10#CL_DEVICE_QUEUE_PROPERTIES DEVICE_QUEUE_PROPERTIES} query to determine command
 * queue properties that are supported by the device.</p>
 * 
 * <p>OpenCL 2.x devices may support this extension for compatibility. In this scenario, the function added by this extension will have the same capabilities
 * as the core {@code clCreateCommandQueueWithProperties} API. Applications that only target OpenCL 2.x devices should use the core OpenCL 2.x
 * {@code clCreateCommandQueueWithProperties} API instead of this extension API.</p>
 */
public class KHRCreateCommandQueue {

    protected KHRCreateCommandQueue() {
        throw new UnsupportedOperationException();
    }

    // --- [ clCreateCommandQueueWithPropertiesKHR ] ---

    /** Unsafe version of: {@link #clCreateCommandQueueWithPropertiesKHR CreateCommandQueueWithPropertiesKHR} */
    public static long nclCreateCommandQueueWithPropertiesKHR(long context, long device, long properties, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateCommandQueueWithPropertiesKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(device);
        }
        return callPPPPP(context, device, properties, errcode_ret, __functionAddress);
    }

    /**
     * @param context     a valid OpenCL context
     * @param device      a device associated with context. It can either be in the list of devices specified when context is created using {@link CL10#clCreateContext CreateContext} or have the same
     *                    device type as device type specified when context is created using {@link CL10#clCreateContextFromType CreateContextFromType}.
     * @param properties  a list of properties for the command-queue and their corresponding values. Each property name is immediately followed by the corresponding desired
     *                    value. The list is terminated with {@code 0}. If a supported property and its value is not specified in properties, its default value will be used.
     *                    {@code properties} can be {@code NULL} in which case the default values for supported command-queue properties will be used. Must be:<br><table><tr><td>{@link CL10#CL_QUEUE_PROPERTIES QUEUE_PROPERTIES}</td></tr></table>
     * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return a valid non-zero command-queue and {@code errcode_ret} is set to {@link CL10#CL_SUCCESS SUCCESS} if the command-queue is created successfully. Otherwise, it returns a {@code NULL} value
     *         with one of the following error values returned in {@code errcode_ret}:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link CL10#CL_INVALID_DEVICE INVALID_DEVICE} if {@code device} is not a valid device or is not associated with {@code context}.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if values specified in {@code properties} are not valid.</li>
     *         <li>{@link CL10#CL_INVALID_QUEUE_PROPERTIES INVALID_QUEUE_PROPERTIES} if values specified in {@code properties} are valid but are not supported by the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     */
    @NativeType("cl_command_queue")
    public static long clCreateCommandQueueWithPropertiesKHR(@NativeType("cl_context") long context, @NativeType("cl_device_id") long device, @Nullable @NativeType("cl_queue_properties_khr const *") LongBuffer properties, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return nclCreateCommandQueueWithPropertiesKHR(context, device, memAddressSafe(properties), memAddressSafe(errcode_ret));
    }

    /** Array version of: {@link #clCreateCommandQueueWithPropertiesKHR CreateCommandQueueWithPropertiesKHR} */
    @NativeType("cl_command_queue")
    public static long clCreateCommandQueueWithPropertiesKHR(@NativeType("cl_context") long context, @NativeType("cl_device_id") long device, @Nullable @NativeType("cl_queue_properties_khr const *") long[] properties, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateCommandQueueWithPropertiesKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(device);
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return callPPPPP(context, device, properties, errcode_ret, __functionAddress);
    }

}
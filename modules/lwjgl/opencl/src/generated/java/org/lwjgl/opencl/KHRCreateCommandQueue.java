/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class KHRCreateCommandQueue {

    protected KHRCreateCommandQueue() {
        throw new UnsupportedOperationException();
    }

    // --- [ clCreateCommandQueueWithPropertiesKHR ] ---

    /** {@code cl_command_queue clCreateCommandQueueWithPropertiesKHR(cl_context context, cl_device_id device, cl_queue_properties_khr const * properties, cl_int * errcode_ret)} */
    public static long nclCreateCommandQueueWithPropertiesKHR(long context, long device, long properties, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateCommandQueueWithPropertiesKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(device);
        }
        return callPPPPP(context, device, properties, errcode_ret, __functionAddress);
    }

    /** {@code cl_command_queue clCreateCommandQueueWithPropertiesKHR(cl_context context, cl_device_id device, cl_queue_properties_khr const * properties, cl_int * errcode_ret)} */
    @NativeType("cl_command_queue")
    public static long clCreateCommandQueueWithPropertiesKHR(@NativeType("cl_context") long context, @NativeType("cl_device_id") long device, @NativeType("cl_queue_properties_khr const *") @Nullable LongBuffer properties, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return nclCreateCommandQueueWithPropertiesKHR(context, device, memAddressSafe(properties), memAddressSafe(errcode_ret));
    }

    /** {@code cl_command_queue clCreateCommandQueueWithPropertiesKHR(cl_context context, cl_device_id device, cl_queue_properties_khr const * properties, cl_int * errcode_ret)} */
    @NativeType("cl_command_queue")
    public static long clCreateCommandQueueWithPropertiesKHR(@NativeType("cl_context") long context, @NativeType("cl_device_id") long device, @NativeType("cl_queue_properties_khr const *") long @Nullable [] properties, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
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
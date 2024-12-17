/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class APPLECommandQueuePriority {

    public static final int
        CL_QUEUE_PRIORITY_APPLE            = 0x10000013,
        CL_QUEUE_PRIORITY_BACKGROUND_APPLE = 0x10000015,
        CL_QUEUE_PRIORITY_DEFAULT_APPLE    = 0x10000017;

    protected APPLECommandQueuePriority() {
        throw new UnsupportedOperationException();
    }

    // --- [ clCreateCommandQueueWithPropertiesAPPLE ] ---

    /** {@code cl_command_queue clCreateCommandQueueWithPropertiesAPPLE(cl_context context, cl_device_id device, cl_queue_properties_APPLE const * properties, cl_int * errcode_ret)} */
    public static long nclCreateCommandQueueWithPropertiesAPPLE(long context, long device, long properties, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateCommandQueueWithPropertiesAPPLE;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(device);
        }
        return callPPPPP(context, device, properties, errcode_ret, __functionAddress);
    }

    /** {@code cl_command_queue clCreateCommandQueueWithPropertiesAPPLE(cl_context context, cl_device_id device, cl_queue_properties_APPLE const * properties, cl_int * errcode_ret)} */
    @NativeType("cl_command_queue")
    public static long clCreateCommandQueueWithPropertiesAPPLE(@NativeType("cl_context") long context, @NativeType("cl_device_id") long device, @NativeType("cl_queue_properties_APPLE const *") PointerBuffer properties, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNT(properties);
            checkSafe(errcode_ret, 1);
        }
        return nclCreateCommandQueueWithPropertiesAPPLE(context, device, memAddress(properties), memAddressSafe(errcode_ret));
    }

    /** {@code cl_command_queue clCreateCommandQueueWithPropertiesAPPLE(cl_context context, cl_device_id device, cl_queue_properties_APPLE const * properties, cl_int * errcode_ret)} */
    @NativeType("cl_command_queue")
    public static long clCreateCommandQueueWithPropertiesAPPLE(@NativeType("cl_context") long context, @NativeType("cl_device_id") long device, @NativeType("cl_queue_properties_APPLE const *") PointerBuffer properties, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateCommandQueueWithPropertiesAPPLE;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(device);
            checkNT(properties);
            checkSafe(errcode_ret, 1);
        }
        return callPPPPP(context, device, memAddress(properties), errcode_ret, __functionAddress);
    }

}
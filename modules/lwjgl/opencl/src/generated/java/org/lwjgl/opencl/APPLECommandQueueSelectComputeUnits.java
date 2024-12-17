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

public class APPLECommandQueueSelectComputeUnits {

    public static final int CL_QUEUE_NUM_COMPUTE_UNITS_APPLE = 0x10000014;

    protected APPLECommandQueueSelectComputeUnits() {
        throw new UnsupportedOperationException();
    }

    // --- [ clCreateCommandQueueWithPropertiesAPPLE ] ---

    /** {@code cl_command_queue clCreateCommandQueueWithPropertiesAPPLE(cl_context context, cl_device_id device, cl_queue_properties_APPLE const * properties, cl_int * errcode_ret)} */
    public static long nclCreateCommandQueueWithPropertiesAPPLE(long context, long device, long properties, long errcode_ret) {
        return APPLECommandQueuePriority.nclCreateCommandQueueWithPropertiesAPPLE(context, device, properties, errcode_ret);
    }

    /** {@code cl_command_queue clCreateCommandQueueWithPropertiesAPPLE(cl_context context, cl_device_id device, cl_queue_properties_APPLE const * properties, cl_int * errcode_ret)} */
    @NativeType("cl_command_queue")
    public static long clCreateCommandQueueWithPropertiesAPPLE(@NativeType("cl_context") long context, @NativeType("cl_device_id") long device, @NativeType("cl_queue_properties_APPLE const *") PointerBuffer properties, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        return APPLECommandQueuePriority.clCreateCommandQueueWithPropertiesAPPLE(context, device, properties, errcode_ret);
    }

    /** {@code cl_command_queue clCreateCommandQueueWithPropertiesAPPLE(cl_context context, cl_device_id device, cl_queue_properties_APPLE const * properties, cl_int * errcode_ret)} */
    @NativeType("cl_command_queue")
    public static long clCreateCommandQueueWithPropertiesAPPLE(@NativeType("cl_context") long context, @NativeType("cl_device_id") long device, @NativeType("cl_queue_properties_APPLE const *") PointerBuffer properties, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        return APPLECommandQueuePriority.clCreateCommandQueueWithPropertiesAPPLE(context, device, properties, errcode_ret);
    }

}
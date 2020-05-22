/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to the <strong>APPLE_command_queue_priority</strong> extension. */
public class APPLECommandQueuePriority {

    public static final int
        CL_QUEUE_PRIORITY_APPLE            = 0x10000013,
        CL_QUEUE_PRIORITY_BACKGROUND_APPLE = 0x10000015,
        CL_QUEUE_PRIORITY_DEFAULT_APPLE    = 0x10000017;

    protected APPLECommandQueuePriority() {
        throw new UnsupportedOperationException();
    }

    // --- [ clCreateCommandQueueWithPropertiesAPPLE ] ---

    /** Unsafe version of: {@link #clCreateCommandQueueWithPropertiesAPPLE CreateCommandQueueWithPropertiesAPPLE} */
    public static long nclCreateCommandQueueWithPropertiesAPPLE(long context, long device, long properties, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateCommandQueueWithPropertiesAPPLE;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(device);
        }
        return callPPPPP(context, device, properties, errcode_ret, __functionAddress);
    }

    /** @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned. */
    @NativeType("cl_command_queue")
    public static long clCreateCommandQueueWithPropertiesAPPLE(@NativeType("cl_context") long context, @NativeType("cl_device_id") long device, @NativeType("cl_queue_properties_APPLE const *") PointerBuffer properties, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNT(properties);
            checkSafe(errcode_ret, 1);
        }
        return nclCreateCommandQueueWithPropertiesAPPLE(context, device, memAddress(properties), memAddressSafe(errcode_ret));
    }

    /** Array version of: {@link #clCreateCommandQueueWithPropertiesAPPLE CreateCommandQueueWithPropertiesAPPLE} */
    @NativeType("cl_command_queue")
    public static long clCreateCommandQueueWithPropertiesAPPLE(@NativeType("cl_context") long context, @NativeType("cl_device_id") long device, @NativeType("cl_queue_properties_APPLE const *") PointerBuffer properties, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
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
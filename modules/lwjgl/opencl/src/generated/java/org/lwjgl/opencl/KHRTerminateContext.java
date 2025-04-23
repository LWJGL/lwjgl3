/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class KHRTerminateContext {

    public static final int CL_DEVICE_TERMINATE_CAPABILITY_KHR = 0x2031;

    public static final int CL_CONTEXT_TERMINATE_KHR = 0x2032;

    public static final int CL_DEVICE_TERMINATE_CAPABILITY_CONTEXT_KHR = 1 << 0;

    public static final int CL_CONTEXT_TERMINATED_KHR = -1121;

    protected KHRTerminateContext() {
        throw new UnsupportedOperationException();
    }

    // --- [ clTerminateContextKHR ] ---

    /** {@code cl_int clTerminateContextKHR(cl_context context)} */
    @NativeType("cl_int")
    public static int clTerminateContextKHR(@NativeType("cl_context") long context) {
        long __functionAddress = CL.getICD().clTerminateContextKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return callPI(context, __functionAddress);
    }

}
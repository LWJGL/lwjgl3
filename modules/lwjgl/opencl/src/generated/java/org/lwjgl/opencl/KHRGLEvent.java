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

public class KHRGLEvent {

    public static final int CL_COMMAND_GL_FENCE_SYNC_OBJECT_KHR = 0x200D;

    protected KHRGLEvent() {
        throw new UnsupportedOperationException();
    }

    // --- [ clCreateEventFromGLsyncKHR ] ---

    /** {@code cl_event clCreateEventFromGLsyncKHR(cl_context context, GLsync sync, cl_int * errcode_ret)} */
    public static long nclCreateEventFromGLsyncKHR(long context, long sync, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateEventFromGLsyncKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(sync);
        }
        return callPPPP(context, sync, errcode_ret, __functionAddress);
    }

    /** {@code cl_event clCreateEventFromGLsyncKHR(cl_context context, GLsync sync, cl_int * errcode_ret)} */
    @NativeType("cl_event")
    public static long clCreateEventFromGLsyncKHR(@NativeType("cl_context") long context, @NativeType("GLsync") long sync, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateEventFromGLsyncKHR(context, sync, memAddressSafe(errcode_ret));
    }

    /** {@code cl_event clCreateEventFromGLsyncKHR(cl_context context, GLsync sync, cl_int * errcode_ret)} */
    @NativeType("cl_event")
    public static long clCreateEventFromGLsyncKHR(@NativeType("cl_context") long context, @NativeType("GLsync") long sync, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateEventFromGLsyncKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(sync);
            checkSafe(errcode_ret, 1);
        }
        return callPPPP(context, sync, errcode_ret, __functionAddress);
    }

}
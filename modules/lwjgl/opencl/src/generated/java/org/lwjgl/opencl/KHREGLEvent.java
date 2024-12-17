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

public class KHREGLEvent {

    public static final int CL_INVALID_EGL_OBJECT_KHR = -1093;

    public static final int CL_COMMAND_EGL_FENCE_SYNC_OBJECT_KHR = 0x202F;

    protected KHREGLEvent() {
        throw new UnsupportedOperationException();
    }

    // --- [ clCreateEventFromEGLSyncKHR ] ---

    /** {@code cl_event clCreateEventFromEGLSyncKHR(cl_context context, CLeglSyncKHR sync, CLeglDisplayKHR display, cl_int * errcode_ret)} */
    public static long nclCreateEventFromEGLSyncKHR(long context, long sync, long display, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateEventFromEGLSyncKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(sync);
            check(display);
        }
        return callPPPPP(context, sync, display, errcode_ret, __functionAddress);
    }

    /** {@code cl_event clCreateEventFromEGLSyncKHR(cl_context context, CLeglSyncKHR sync, CLeglDisplayKHR display, cl_int * errcode_ret)} */
    @NativeType("cl_event")
    public static long clCreateEventFromEGLSyncKHR(@NativeType("cl_context") long context, @NativeType("CLeglSyncKHR") long sync, @NativeType("CLeglDisplayKHR") long display, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateEventFromEGLSyncKHR(context, sync, display, memAddressSafe(errcode_ret));
    }

    /** {@code cl_event clCreateEventFromEGLSyncKHR(cl_context context, CLeglSyncKHR sync, CLeglDisplayKHR display, cl_int * errcode_ret)} */
    @NativeType("cl_event")
    public static long clCreateEventFromEGLSyncKHR(@NativeType("cl_context") long context, @NativeType("CLeglSyncKHR") long sync, @NativeType("CLeglDisplayKHR") long display, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateEventFromEGLSyncKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(sync);
            check(display);
            checkSafe(errcode_ret, 1);
        }
        return callPPPPP(context, sync, display, errcode_ret, __functionAddress);
    }

}
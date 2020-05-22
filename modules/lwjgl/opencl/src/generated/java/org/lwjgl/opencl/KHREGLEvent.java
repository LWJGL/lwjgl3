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
 * Native bindings to the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/khr/cl_khr_egl_event.txt">khr_egl_event</a> extension.
 * 
 * <p>This extension allows creating OpenCL event objects linked to EGL fence sync objects, potentially improving efficiency of sharing images and buffers
 * between the two APIs. The companion {@code EGL_KHR_cl_event} extension provides the complementary functionality of creating an EGL sync object from an
 * OpenCL event object.</p>
 */
public class KHREGLEvent {

    /** Returned by clCreateEventFromEGLSyncKHR if sync is not a valid EGLSyncKHR handle created with respect to EGLDisplay display. */
    public static final int CL_INVALID_EGL_OBJECT_KHR = -1093;

    /** Returned by {@link CL10#clGetEventInfo GetEventInfo} when param_name is {@link CL10#CL_EVENT_COMMAND_TYPE EVENT_COMMAND_TYPE}. */
    public static final int CL_COMMAND_EGL_FENCE_SYNC_OBJECT_KHR = 0x202F;

    protected KHREGLEvent() {
        throw new UnsupportedOperationException();
    }

    // --- [ clCreateEventFromEGLSyncKHR ] ---

    /** Unsafe version of: {@link #clCreateEventFromEGLSyncKHR CreateEventFromEGLSyncKHR} */
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

    /**
     * Creates a linked event object.
     *
     * @param context     a valid OpenCL context
     * @param sync        the name of a sync object of type {@link org.lwjgl.egl.EGL15#EGL_SYNC_FENCE} created with respect to {@code EGLDisplay display}.
     * @param display     an {@code EGLDisplay}
     * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     */
    @NativeType("cl_event")
    public static long clCreateEventFromEGLSyncKHR(@NativeType("cl_context") long context, @NativeType("CLeglSyncKHR") long sync, @NativeType("CLeglDisplayKHR") long display, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateEventFromEGLSyncKHR(context, sync, display, memAddressSafe(errcode_ret));
    }

    /** Array version of: {@link #clCreateEventFromEGLSyncKHR CreateEventFromEGLSyncKHR} */
    @NativeType("cl_event")
    public static long clCreateEventFromEGLSyncKHR(@NativeType("cl_context") long context, @NativeType("CLeglSyncKHR") long sync, @NativeType("CLeglDisplayKHR") long display, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
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
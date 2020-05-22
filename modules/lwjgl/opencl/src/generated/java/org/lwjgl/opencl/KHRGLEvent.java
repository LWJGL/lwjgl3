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
 * Native bindings to the <strong>khr_gl_event</strong> extension.
 * 
 * <p>This extension allows creating OpenCL event objects linked to OpenGL fence sync objects, potentially improving efficiency of sharing images and buffers
 * between the two APIs. The companion {@code GL_ARB_cl_event} extension provides the complementary functionality of creating an OpenGL sync object from
 * an OpenCL event object.</p>
 * 
 * <p>In addition, this extension modifies the behavior of {@link CL10GL#clEnqueueAcquireGLObjects EnqueueAcquireGLObjects} and {@link CL10GL#clEnqueueReleaseGLObjects EnqueueReleaseGLObjects} to implicitly guarantee synchronization
 * with an OpenGL context bound in the same thread as the OpenCL context.</p>
 */
public class KHRGLEvent {

    /** Returned by {@link CL10#clGetEventInfo GetEventInfo} when {@code param_name} is {@link CL10#CL_EVENT_COMMAND_TYPE EVENT_COMMAND_TYPE}. */
    public static final int CL_COMMAND_GL_FENCE_SYNC_OBJECT_KHR = 0x200D;

    protected KHRGLEvent() {
        throw new UnsupportedOperationException();
    }

    // --- [ clCreateEventFromGLsyncKHR ] ---

    /** Unsafe version of: {@link #clCreateEventFromGLsyncKHR CreateEventFromGLsyncKHR} */
    public static long nclCreateEventFromGLsyncKHR(long context, long sync, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateEventFromGLsyncKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(sync);
        }
        return callPPPP(context, sync, errcode_ret, __functionAddress);
    }

    /**
     * Creates an OpenCL event object from an OpenGL fence sync object.
     *
     * @param context     the OpenCL context in which to create the event object
     * @param sync        the OpenGL fence sync object
     * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     */
    @NativeType("cl_event")
    public static long clCreateEventFromGLsyncKHR(@NativeType("cl_context") long context, @NativeType("GLsync") long sync, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateEventFromGLsyncKHR(context, sync, memAddressSafe(errcode_ret));
    }

    /** Array version of: {@link #clCreateEventFromGLsyncKHR CreateEventFromGLsyncKHR} */
    @NativeType("cl_event")
    public static long clCreateEventFromGLsyncKHR(@NativeType("cl_context") long context, @NativeType("GLsync") long sync, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
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
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <strong>khr_terminate_context</strong> extension.
 * 
 * <p>OpenCL provides an API to release a context. This operation is done only after all queues, memory object, programs and kernels are released, which in
 * turn might wait for all ongoing operations to complete. However, there are cases in which a fast release is required, or release operation cannot be
 * done, as commands are stuck in mid execution. An example of the first case can be program termination due to exception, or quick shutdown due to low
 * power. Examples of the second case are when a kernel is running too long, or gets stuck, or it may result from user action which makes the results of
 * the computation unnecessary.</p>
 * 
 * <p>In many cases, the driver or the device is capable of speeding up the closure of ongoing operations when the results are no longer required in a much
 * more expedient manner than waiting for all previously enqueued operations to finish.</p>
 * 
 * <p>This extension implements a new query to check whether a device can terminate an OpenCL context and adds an API to terminate a context.</p>
 */
public class KHRTerminateContext {

    /**
     * Describes the termination capability of the OpenCL device. This is a bitfield where a value of {@code CL_DEVICE_TERMINATE_CAPABILITY_CONTEXT_KHR}
     * indicates that context termination is supported.
     */
    public static final int CL_DEVICE_TERMINATE_CAPABILITY_KHR = 0x200F;

    /** Specifies whether the context can be terminated. The default value is {@link CL10#CL_FALSE FALSE}. */
    public static final int CL_CONTEXT_TERMINATE_KHR = 0x2010;

    protected KHRTerminateContext() {
        throw new UnsupportedOperationException();
    }

    // --- [ clTerminateContextKHR ] ---

    /**
     * Terminates all pending work associated with the context and renders all data owned by the context invalid. It is the responsibility of the application
     * to release all objects associated with the context being terminated.
     * 
     * <p>When a context is terminated:</p>
     * 
     * <ul>
     * <li>The execution status of enqueued commands will be {@code TERMINATED_KHR}. Event objects can be queried using {@link CL10#clGetEventInfo GetEventInfo}. Event
     * callbacks can be registered and registered event callbacks will be called with {@code event_command_exec_status} set to {@code TERMINATED_KHR}.
     * {@link CL10#clWaitForEvents WaitForEvents} will return immediately for commands associated with event objects specified in {@code event_list}. The status of user
     * events can be set. Event objects can be retained and released. {@link CL10#clGetEventProfilingInfo GetEventProfilingInfo} returns {@link CL10#CL_PROFILING_INFO_NOT_AVAILABLE PROFILING_INFO_NOT_AVAILABLE}.</li>
     * <li>The context is considered to be terminated. A callback function registered when the context was created will be called. Only queries, retain and
     * release operations can be performed on the context. All other APIs that use a context as an argument will return {@code CONTEXT_TERMINATED_KHR}.</li>
     * <li>The contents of the memory regions of the memory objects is undefined. Queries, registering a destructor callback, retain and release operations can
     * be performed on the memory objects.</li>
     * <li>Once a context has been terminated, all OpenCL API calls that create objects or enqueue commands will return {@code CONTEXT_TERMINATED_KHR}. APIs
     * that release OpenCL objects will continue to operate as though {@code clTerminateContextKHR} was not called.</li>
     * <li>The behavior of callbacks will remain unchanged, and will report appropriate error, if executing after termination of context. This behavior is
     * similar to enqueued commands, after the command queue has become invalid.</li>
     * </ul>
     *
     * @param context the context to terminate
     *
     * @return {@link CL10#CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         "{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid OpenCL context.",
     *         "{@code CONTEXT_TERMINATED_KHR} if {@code context} has already been terminated.",
     *         "{@link CL10#CL_INVALID_OPERATION INVALID_OPERATION} if {@code context} was not created with {@link #CL_CONTEXT_TERMINATE_KHR CONTEXT_TERMINATE_KHR} set to {@link CL10#CL_TRUE TRUE}.",
     *         OORE,
     *         OOHME
     */
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
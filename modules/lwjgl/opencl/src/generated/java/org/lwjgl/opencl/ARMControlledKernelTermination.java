/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

/**
 * Native bindings to the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/arm/cl_arm_controlled_kernel_termination.txt">arm_controlled_kernel_termination</a> extension.
 * 
 * <p>This extension enables the controlled termination of kernels using a built-in function.</p>
 * 
 * <p>It also enables the termination reason to be queried on devices that support it. This makes it possible to end the execution of a successful search
 * kernel early or implement assert-like functionality using {@code printf}.</p>
 */
public final class ARMControlledKernelTermination {

    /** Error code to indicate kernel terminated with failure. */
    public static final int CL_COMMAND_TERMINATED_ITSELF_WITH_FAILURE_ARM = -1108;

    /** Accepted value for the {@code param_name} parameter to {@link CL10#clGetDeviceInfo GetDeviceInfo}. */
    public static final int CL_DEVICE_CONTROLLED_TERMINATION_CAPABILITIES_ARM = 0x41EE;

    /** Bit fields for controlled termination feature query. */
    public static final int
        CL_DEVICE_CONTROLLED_TERMINATION_SUCCESS_ARM = (1 << 0),
        CL_DEVICE_CONTROLLED_TERMINATION_FAILURE_ARM = (1 << 1),
        CL_DEVICE_CONTROLLED_TERMINATION_QUERY_ARM   = (1 << 2);

    /** Accepted value for the {@code param_name} parameter to {@link CL10#clGetEventInfo GetEventInfo}. */
    public static final int CL_EVENT_COMMAND_TERMINATION_REASON_ARM = 0x41ED;

    /** Values returned for event termination reason query. */
    public static final int
        CL_COMMAND_TERMINATION_COMPLETION_ARM         = 0,
        CL_COMMAND_TERMINATION_CONTROLLED_SUCCESS_ARM = 1,
        CL_COMMAND_TERMINATION_CONTROLLED_FAILURE_ARM = 2,
        CL_COMMAND_TERMINATION_ERROR_ARM              = 3;

    private ARMControlledKernelTermination() {}

}
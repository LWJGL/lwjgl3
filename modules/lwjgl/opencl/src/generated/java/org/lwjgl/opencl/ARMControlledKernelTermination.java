/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

public final class ARMControlledKernelTermination {

    public static final int CL_COMMAND_TERMINATED_ITSELF_WITH_FAILURE_ARM = -1108;

    public static final int CL_DEVICE_CONTROLLED_TERMINATION_CAPABILITIES_ARM = 0x41EE;

    public static final int
        CL_DEVICE_CONTROLLED_TERMINATION_SUCCESS_ARM = (1 << 0),
        CL_DEVICE_CONTROLLED_TERMINATION_FAILURE_ARM = (1 << 1),
        CL_DEVICE_CONTROLLED_TERMINATION_QUERY_ARM   = (1 << 2);

    public static final int CL_EVENT_COMMAND_TERMINATION_REASON_ARM = 0x41ED;

    public static final int
        CL_COMMAND_TERMINATION_COMPLETION_ARM         = 0,
        CL_COMMAND_TERMINATION_CONTROLLED_SUCCESS_ARM = 1,
        CL_COMMAND_TERMINATION_CONTROLLED_FAILURE_ARM = 2,
        CL_COMMAND_TERMINATION_ERROR_ARM              = 3;

    private ARMControlledKernelTermination() {}

}
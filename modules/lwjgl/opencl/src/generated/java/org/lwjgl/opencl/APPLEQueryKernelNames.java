/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

/**
 * Native bindings to the <strong>APPLE_query_kernel_names</strong> extension.
 * 
 * <p>These selectors may be passed to {@link CL10#clGetProgramInfo GetProgramInfo} to obtain information about the kernel functions in a {@code cl_program}. The {@code cl_program}
 * must be successfully built with {@link CL10#clBuildProgram BuildProgram} for at least one device to succeed. Otherwise {@link CL10#CL_INVALID_PROGRAM_EXECUTABLE INVALID_PROGRAM_EXECUTABLE} is returned.</p>
 */
public final class APPLEQueryKernelNames {

    /** Returns a cl_uint for number of kernels in program. */
    public static final int CL_PROGRAM_NUM_KERNELS_APPLE = 0x10000004;

    /** Returns a ';' delimited char[] containing the names of kernels in program. */
    public static final int CL_PROGRAM_KERNEL_NAMES_APPLE = 0x10000005;

    private APPLEQueryKernelNames() {}

}
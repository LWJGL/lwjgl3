/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

/**
 * Native bindings to the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/intel/cl_intel_required_subgroup_size.txt">intel_required_subgroup_size</a> extension.
 * 
 * <p>The goal of this extension is to allow programmers to optionally specify the required subgroup size for a kernel function. This information is
 * important for the correctness of many subgroup algorithms, and in some cases may be used by the compiler to generate more optimal code.</p>
 * 
 * <p>Requires {@link CL21 CL21} or {@link INTELSubgroups intel_subgroups}.</p>
 */
public final class INTELRequiredSubgroupSize {

    /** Accepted as the {@code param_name} parameter of {@link CL10#clGetDeviceInfo GetDeviceInfo}. */
    public static final int CL_DEVICE_SUB_GROUP_SIZES_INTEL = 0x4108;

    /** Accepted as the {@code param_name} parameter of {@link CL10#clGetKernelWorkGroupInfo GetKernelWorkGroupInfo}. */
    public static final int CL_KERNEL_SPILL_MEM_SIZE_INTEL = 0x4109;

    /** Accepted as the {@code param_name} parameter of {@link CL21#clGetKernelSubGroupInfo GetKernelSubGroupInfo} and/or {@link KHRSubgroups#clGetKernelSubGroupInfoKHR GetKernelSubGroupInfoKHR}. */
    public static final int CL_KERNEL_COMPILE_SUB_GROUP_SIZE_INTEL = 0x410A;

    private INTELRequiredSubgroupSize() {}

}
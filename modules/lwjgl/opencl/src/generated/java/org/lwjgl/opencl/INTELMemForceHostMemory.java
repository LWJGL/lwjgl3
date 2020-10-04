/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

/**
 * Native bindings to the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/intel/cl_intel_mem_force_host_memory.txt">intel_mem_force_host_memory</a> extension.
 * 
 * <p>This extension allows an application to override driver heuristics to force allocation of a buffer memory object in host memory. Host memory is
 * described in the {@code cl_intel_unified_shared_memory} extension.</p>
 * 
 * <p>Allocating a buffer memory object in host memory trades off wide accessibility and transfer benefits for higher per-access costs. Buffer memory objects
 * in host memory may also be subject to additional usage restrictions.</p>
 * 
 * <p>Requires {@link CL12 OpenCL 1.2}.</p>
 */
public final class INTELMemForceHostMemory {

    /** Flag of type {@code cl_mem_flags}, used when creating a buffer object to force allocation of a buffer memory object in host memory. */
    public static final int CL_MEM_FORCE_HOST_MEMORY_INTEL = (1 << 20);

    private INTELMemForceHostMemory() {}

}
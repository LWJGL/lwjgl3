/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

/**
 * Native bindings to the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/arm/cl_arm_protected_memory_allocation.txt">arm_protected_memory_allocation</a> extension.
 * 
 * <p>This extensions enables the creation of buffers and images backed by protected memory, i.e. memory protected using TrustZone Media Protection.</p>
 * 
 * <p>Requires {@link CL12 CL12}.</p>
 */
public final class ARMProtectedMemoryAllocation {

    /**
     * New flag added to {@code cl_mem_flags}.
     * 
     * <p>Specifies that the memory object being created will be backed by protected memory. When this flag is present, the only host flag allowed is
     * {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}. If host flags are omitted, {@code CL_MEM_HOST_NO_ACCESS} is assumed.</p>
     */
    public static final int CL_MEM_PROTECTED_ALLOC_ARM = 1 << 36;

    private ARMProtectedMemoryAllocation() {}

}
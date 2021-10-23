/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

/**
 * Native bindings to the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/img/cl_img_cached_allocations.txt">img_cached_allocations</a> extension.
 * 
 * <p>This extension extends the functionality provided by {@link CL10#clCreateBuffer CreateBuffer} and {@link CL12#clCreateImage CreateImage} to allow the OpenCL implementation to allocate memory on the
 * device which is also cached on the host CPU.</p>
 * 
 * <p>Requires {@link CL12 CL12}.</p>
 */
public final class IMGCachedAllocations {

    /** Accepted value for the {@code flags} parameter to {@link CL10#clCreateBuffer CreateBuffer} and {@link CL12#clCreateImage CreateImage}. */
    public static final int
        CL_MEM_USE_UNCACHED_CPU_MEMORY_IMG = 1 << 26,
        CL_MEM_USE_CACHED_CPU_MEMORY_IMG   = 1 << 27;

    private IMGCachedAllocations() {}

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

/**
 * Native bindings to the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/intel/cl_intel_mem_alloc_buffer_location.txt">intel_mem_alloc_buffer_location</a> extension.
 * 
 * <p>On some devices, global memory may be partitioned into disjoint regions. This may be to enable control over specific characteristics such as available
 * bandwidths on memory interfaces, or performance on types of access patterns.</p>
 * 
 * <p>This extension allows a user to explicitly specify the partition/region of global memory in which an allocation should reside, by passing an
 * implementation defined numerical ID that identifies the region to the allocation function.</p>
 * 
 * <p>Requires {@link CL30 CL30} or {@link INTELCreateBufferWithProperties intel_create_buffer_with_properties}.</p>
 */
public final class INTELMemAllocBufferLocation {

    /**
     * Accepted property for the {@code properties} parameter to {@link INTELCreateBufferWithProperties#clCreateBufferWithPropertiesINTEL CreateBufferWithPropertiesINTEL}, {@link CL30#clCreateBufferWithProperties CreateBufferWithProperties}, {@link INTELUnifiedSharedMemory#clDeviceMemAllocINTEL DeviceMemAllocINTEL}),
     * {@link INTELUnifiedSharedMemory#clSharedMemAllocINTEL SharedMemAllocINTEL}, {@link INTELUnifiedSharedMemory#clHostMemAllocINTEL HostMemAllocINTEL} to specify requested global memory type ID.
     * 
     * <p>It can be passed into {@link INTELUnifiedSharedMemory#clGetMemAllocInfoINTEL GetMemAllocInfoINTEL} to get the buffer location of allocated usm memory, as well as {@link CL10#clGetMemObjectInfo GetMemObjectInfo} to get buffer location
     * of the buffer. If no property was specified, then the ID corresponding to default global memory is returned.</p>
     */
    public static final int CL_MEM_ALLOC_BUFFER_LOCATION_INTEL = 0x419E;

    private INTELMemAllocBufferLocation() {}

}
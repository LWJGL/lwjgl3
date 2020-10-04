/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

/**
 * Native bindings to the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/intel/cl_intel_mem_channel_property.txt">intel_mem_channel_property</a> extension.
 * 
 * <p>On some accelerators, manual partitioning of buffers across different regions of memory may result in higher performance by spreading high-demand
 * memory across different interfaces or ports of a memory.</p>
 * 
 * <p>This extension allows programmers to request that a buffer allocation be implemented in a particular region of memory.</p>
 * 
 * <p>Requires {@link INTELCreateBufferWithProperties intel_create_buffer_with_properties}.</p>
 */
public final class INTELMemChannelProperty {

    /** Accepted property for the {@code properties} parameter to {@link INTELCreateBufferWithProperties#clCreateBufferWithPropertiesINTEL CreateBufferWithPropertiesINTEL} to specify the requested channel for the buffer. */
    public static final int CL_MEM_CHANNEL_INTEL = 0x4213;

    private INTELMemChannelProperty() {}

}
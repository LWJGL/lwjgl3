/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

/**
 * Native bindings to the <strong>khr_initialize_memory</strong> extension.
 * 
 * <p>This extension adds support for initializing local and private memory before a kernel begins execution.</p>
 * 
 * <p>Memory is allocated in various forms in OpenCL both explicitly (global memory) or implicitly (local, private memory). This allocation so far does not
 * provide a straightforward mechanism to initialize the memory on allocation. In other words what is lacking is the equivalent of calloc for the
 * currently supported malloc like capability. This functionality is useful for a variety of reasons including ease of debugging, application controlled
 * limiting of visibility to previous contents of memory and in some cases, optimization.</p>
 */
public final class KHRInitializeMemory {

    /**
     * Accepted as a property name in the {@code properties} parameter of {@link CL10#clCreateContext CreateContext}.
     * 
     * <p>Describes which memory types for the context must be initialized. This is a bit-field, where the following values are currently supported:</p>
     * 
     * <ul>
     * <li>{@code CL_CONTEXT_MEMORY_INITIALIZE_LOCAL_KHR} &ndash; Initialize local memory to zeros.</li>
     * <li>{@code CL_CONTEXT_MEMORY_INITIALIZE_PRIVATE_KHR} &ndash; Initialize private memory to zeros.</li>
     * </ul>
     */
    public static final int CL_CONTEXT_MEMORY_INITIALIZE_KHR = 0x200E;

    private KHRInitializeMemory() {}

}
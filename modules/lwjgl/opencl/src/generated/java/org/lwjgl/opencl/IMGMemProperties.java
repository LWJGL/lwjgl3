/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

/**
 * Native bindings to the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/img/cl_img_mem_properties.txt">img_mem_properties</a> extension.
 * 
 * <p>This extension provides additional properties that can be passed to {@link CL30#clCreateBufferWithProperties CreateBufferWithProperties}.</p>
 * 
 * <p>Requires {@link CL30 CL30}.</p>
 */
public final class IMGMemProperties {

    /** Accepted propertie(s) for the {@code properties} parameter to {@link CL30#clCreateBufferWithProperties CreateBufferWithProperties}. */
    public static final int CL_MEM_ALLOC_FLAGS_IMG = 0x40D7;

    /** Accepted {@code values} for {@code cl_mem_alloc_flags_img}. */
    public static final int CL_MEM_ALLOC_RELAX_REQUIREMENTS_IMG = 1 << 0;

    private IMGMemProperties() {}

}
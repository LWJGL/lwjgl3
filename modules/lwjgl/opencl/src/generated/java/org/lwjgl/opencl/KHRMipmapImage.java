/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

/**
 * Native bindings to the <strong>khr_mipmap_image</strong> extension.
 * 
 * <p>This extension adds support to create a mip-mapped image, enqueue commands to read/write/copy/map a region of a mipmapped image and built-in functions
 * that can be used to read a mip-mapped image in an OpenCL C program.</p>
 */
public final class KHRMipmapImage {

    /** cl_sampler_info */
    public static final int
        CL_SAMPLER_MIP_FILTER_MODE_KHR = 0x1155,
        CL_SAMPLER_LOD_MIN_KHR         = 0x1156,
        CL_SAMPLER_LOD_MAX_KHR         = 0x1157;

    private KHRMipmapImage() {}

}
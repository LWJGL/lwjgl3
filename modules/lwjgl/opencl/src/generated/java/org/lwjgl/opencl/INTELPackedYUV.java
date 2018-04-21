/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

/**
 * Native bindings to the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/intel/cl_intel_packed_yuv.txt">intel_packed_yuv</a> extension.
 * 
 * <p>The purpose of this extension is to provide OpenCL support for packed YUV images.</p>
 * 
 * <p>Requires {@link CL12 CL12}.</p>
 */
public final class INTELPackedYUV {

    /** Accepted as {@code image_channel_order} of {@code cl_image_format}. */
    public static final int
        CL_YUYV_INTEL = 0x4076,
        CL_UYVY_INTEL = 0x4077,
        CL_YVYU_INTEL = 0x4078,
        CL_VYUY_INTEL = 0x4079;

    private INTELPackedYUV() {}

}
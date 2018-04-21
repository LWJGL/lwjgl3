/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

/**
 * Native bindings to the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/intel/cl_intel_planar_yuv.txt">intel_planar_yuv</a> extension.
 * 
 * <p>The purpose of this extension is to provide OpenCL support for the Planar YUV (YCbCr) image formats. {@link #CL_NV12_INTEL NV12_INTEL} format must be supported; support for
 * other Planar YUV formats that may be defined in this extension is optional.</p>
 * 
 * <p>The extension introduces two new cl_mem_flags:</p>
 * 
 * <ul>
 * <li>{@link #CL_MEM_NO_ACCESS_INTEL MEM_NO_ACCESS_INTEL} which should be used together with image formats for which device does not support reading from or writing to at OpenCL
 * kernels level, but are still useful in other use cases.</li>
 * <li>{@link #CL_MEM_ACCESS_FLAGS_UNRESTRICTED_INTEL MEM_ACCESS_FLAGS_UNRESTRICTED_INTEL} which may be used to relax the memory access rights specified in {@code cl_mem_flags} at memory object
 * creation time and allow to access and modify the contents of the underlying data storage in unrestricted way e.g. by creating another memory object
 * from that memory object or using dedicated device mechanisms.</li>
 * </ul>
 * 
 * <p>Requires {@link CL12 CL12}.</p>
 */
public final class INTELPlanarYUV {

    /** Accepted as {@code cl_mem_flags}. */
    public static final int
        CL_MEM_NO_ACCESS_INTEL                 = 1 << 24,
        CL_MEM_ACCESS_FLAGS_UNRESTRICTED_INTEL = 1 << 25;

    /** Accepted as {@code image_channel_order} of {@link CLImageFormat}. */
    public static final int CL_NV12_INTEL = 0x410E;

    /** Accepted as arguments passed to {@link CL10#clGetDeviceInfo GetDeviceInfo}. */
    public static final int
        CL_DEVICE_PLANAR_YUV_MAX_WIDTH_INTEL  = 0x417E,
        CL_DEVICE_PLANAR_YUV_MAX_HEIGHT_INTEL = 0x417F;

    private INTELPlanarYUV() {}

}
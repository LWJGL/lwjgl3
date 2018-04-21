/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

/**
 * Native bindings to the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/intel/cl_intel_egl_image_yuv.txt">intel_egl_image_yuv</a> extension.
 * 
 * <p>The goal of this extension is to increase interoperability between OpenCL and EGL by introducing support for planar YUV images. Specifically, this
 * extension adds the ability to create OpenCL memory objects representing individual planes of an EGL planar YUV image.</p>
 * 
 * <p>Requires {@link CL12 CL12} and {@link KHREGLImage khr_egl_image}.</p>
 */
public final class INTELEGLImageYUV {

    /**
     * Accepted as property in {@code properties} parameter of function {@link KHREGLImage#clCreateFromEGLImageKHR CreateFromEGLImageKHR} and as {@code param_name} parameter of function
     * {@link CL10#clGetImageInfo GetImageInfo}.
     */
    public static final int CL_EGL_YUV_PLANE_INTEL = 0x4107;

    private INTELEGLImageYUV() {}

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

/**
 * Native bindings to the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/ext/cl_ext_cxx_for_opencl.txt">ext_cxx_for_opencl</a> extension.
 * 
 * <p>This extension adds support for building programs written using the C++ for OpenCL kernel language. It also enables applications to query the version
 * of the language supported by the device compiler.</p>
 * 
 * <p>This extension requires OpenCL 3.0 with OpenCL C 2.0 support or OpenCL 2.x and cl_khr_extended_versioning.</p>
 */
public final class EXTCXXForOpencl {

    /** Accepted value for the {@code param_name} parameter to {@link CL10#clGetDeviceInfo GetDeviceInfo}. */
    public static final int CL_DEVICE_CXX_FOR_OPENCL_NUMERIC_VERSION_EXT = 0x4230;

    private EXTCXXForOpencl() {}

}
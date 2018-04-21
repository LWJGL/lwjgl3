/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

/**
 * Native bindings to the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/intel/cl_intel_simultaneous_sharing.txt">intel_simultaneous_sharing</a> extension.
 * 
 * <p>Currently OpenCL 1.2 Extension Spec forbids to specify interoperability with multiple graphics APIs at {@link CL10#clCreateContext CreateContext} or
 * {@link CL10#clCreateContextFromType CreateContextFromType} time and defines that {@link CL10#CL_INVALID_OPERATION INVALID_OPERATION} should be returned in such cases as noted e.g. in chapters dedicated to
 * sharing memory objects with Direct3D 10 and Direct3D 11.</p>
 * 
 * <p>The goal of this extension is to relax the restrictions and allow to specify simultaneously these combinations of interoperabilities that are supported
 * by a given OpenCL device.</p>
 * 
 * <p>Requires {@link CL12 CL12}.</p>
 */
public final class INTELSimultaneousSharing {

    /**
     * Accepted as a property being queried in the {@code param_name} parameter of {@link CL10#clGetDeviceInfo GetDeviceInfo}.
     * 
     * <p>Returns the number ({@code cl_uint}) of supported combinations of graphics API interoperabilities that can be enabled simultaneously within the same
     * context.</p>
     * 
     * <p>The minimum value is 1.</p>
     */
    public static final int CL_DEVICE_SIMULTANEOUS_INTEROPS_INTEL = 0x4104;

    /**
     * Accepted as a property being queried in the {@code param_name} parameter of {@link CL10#clGetDeviceInfo GetDeviceInfo}.
     * 
     * <p>Returns a {@code cl_uint} list of {@code n} combinations of context property names describing graphic APIs that the device can interoperate with
     * simultaneously by specifying the combination in the {@code properties} parameter of {@link CL10#clCreateContext CreateContext} and {@link CL10#clCreateContextFromType CreateContextFromType}.</p>
     * 
     * <p>Each combination is a set of 2 or more property names and is terminated with zero.</p>
     * 
     * <p>{@code n} is the value returned by the query for {@link #CL_DEVICE_NUM_SIMULTANEOUS_INTEROPS_INTEL DEVICE_NUM_SIMULTANEOUS_INTEROPS_INTEL}.</p>
     */
    public static final int CL_DEVICE_NUM_SIMULTANEOUS_INTEROPS_INTEL = 0x4105;

    private INTELSimultaneousSharing() {}

}
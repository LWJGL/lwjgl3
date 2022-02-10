/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

/**
 * Native bindings to the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/intel/cl_intel_device_attribute_query.txt">intel_device_attribute_query</a> extension.
 * 
 * <p>This extension can be used to query additional information about Intel OpenCL devices. The additional information may be useful to tailor a specific
 * workload to the properties of the device.</p>
 */
public final class INTELDeviceAttributeQuery {

    /**
     * Possible values accepted as the {@code param_name} parameter of {@link CL10#clGetDeviceInfo GetDeviceInfo}, depending on the device type and the extension version.
     * 
     * <p>Additional queries may be added in subsequent versions of the extension.</p>
     */
    public static final int
        CL_DEVICE_IP_VERSION_INTEL               = 0x4250,
        CL_DEVICE_ID_INTEL                       = 0x4251,
        CL_DEVICE_NUM_SLICES_INTEL               = 0x4252,
        CL_DEVICE_NUM_SUB_SLICES_PER_SLICE_INTEL = 0x4253,
        CL_DEVICE_NUM_EUS_PER_SUB_SLICE_INTEL    = 0x4254,
        CL_DEVICE_NUM_THREADS_PER_EU_INTEL       = 0x4255,
        CL_DEVICE_FEATURE_CAPABILITIES_INTEL     = 0x4256;

    /**
     * Bitfield type describing the feature capabilities of a device. ({@code cl_device_feature_capabilities_intel})
     * 
     * <p>Additional feature flags may be added in subsequent versions of the extension.</p>
     */
    public static final int
        CL_DEVICE_FEATURE_FLAG_DP4A_INTEL = 1 << 0,
        CL_DEVICE_FEATURE_FLAG_DPAS_INTEL = 1 << 1;

    private INTELDeviceAttributeQuery() {}

}
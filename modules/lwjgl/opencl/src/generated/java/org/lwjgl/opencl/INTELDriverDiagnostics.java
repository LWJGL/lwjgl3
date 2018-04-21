/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

/**
 * Native bindings to the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/intel/cl_intel_driver_diagnostics.txt">intel_driver_diagnostics</a> extension.
 * 
 * <p>The OpenCL specification allows registering a callback function during OpenCL context creation that will be called whenever there is an error. This
 * extension extends this mechanism by allowing the driver to pass additional strings containing diagnostic information. The diagnostic messages can help
 * to understand how the driver works and can provide guidance to modify an application to improve performance.</p>
 * 
 * <p>Requires {@link CL12 CL12}.</p>
 */
public final class INTELDriverDiagnostics {

    /** Accepted as a property name in the {@code properties} parameter of {@link CL10#clCreateContext CreateContext} and {@link CL10#clCreateContextFromType CreateContextFromType}. */
    public static final int CL_CONTEXT_SHOW_DIAGNOSTICS_INTEL = 0x4106;

    /**
     * The value for the property {@link #CL_CONTEXT_SHOW_DIAGNOSTICS_INTEL CONTEXT_SHOW_DIAGNOSTICS_INTEL} is a bitfield of type {@code cl_diagnostic_verbose_level_intel} that controls the types of
     * diagnostic messages that are reported.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CL_CONTEXT_DIAGNOSTICS_LEVEL_GOOD_INTEL CONTEXT_DIAGNOSTICS_LEVEL_GOOD_INTEL} - Messages under good verbose level report good use cases to verify that the driver is used properly and optimally.</li>
     * <li>{@link #CL_CONTEXT_DIAGNOSTICS_LEVEL_BAD_INTEL CONTEXT_DIAGNOSTICS_LEVEL_BAD_INTEL} - Messages under bad verbose level report cases that may result in degraded performance.</li>
     * <li>{@link #CL_CONTEXT_DIAGNOSTICS_LEVEL_NEUTRAL_INTEL CONTEXT_DIAGNOSTICS_LEVEL_NEUTRAL_INTEL} - 
     * Messages under neutral verbose level report cases that may or may not have performance implications. Additionally, neutral diagnostic messages may
     * inform developers about specific internal driver properties.
     * </li>
     * </ul>
     */
    public static final int
        CL_CONTEXT_DIAGNOSTICS_LEVEL_GOOD_INTEL    = 0x1,
        CL_CONTEXT_DIAGNOSTICS_LEVEL_BAD_INTEL     = 0x2,
        CL_CONTEXT_DIAGNOSTICS_LEVEL_NEUTRAL_INTEL = 0x4;

    private INTELDriverDiagnostics() {}

}
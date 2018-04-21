/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

/**
 * Native bindings to the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/intel/cl_intel_motion_estimation.txt">intel_motion_estimation</a> extension.
 * 
 * <p>This document presents the motion estimation extension for OpenCL. This extension includes a set of host-callable functions for frame-based motion
 * estimation and introduces motion estimators, or also "motion estimation accelerator objects". These accelerator objects provide an abstraction of
 * software- and/or hardware-accelerated functions for motion estimation, which can be provided by select OpenCL vendors.</p>
 * 
 * <p>This extension depends on the OpenCL 1.2 built-in kernel infrastructure and on the accelerator extension, which provides an abstraction for
 * domain-specific acceleration in the OpenCL runtime.</p>
 * 
 * <p>Requires {@link INTELAccelerator intel_accelerator}.</p>
 */
public final class INTELMotionEstimation {

    /**
     * Accepted as a type in the {@code accelerator_type} parameter of {@link INTELAccelerator#clCreateAcceleratorINTEL CreateAcceleratorINTEL}. Creates a full-frame motion estimation
     * accelerator.
     */
    public static final int CL_ACCELERATOR_TYPE_MOTION_ESTIMATION_INTEL = 0x0;

    /** Accepted as types to the fields of {@code cl_motion_estimator_desc_intel}. */
    public static final int
        CL_ME_MB_TYPE_16x16_INTEL            = 0x0,
        CL_ME_MB_TYPE_8x8_INTEL              = 0x1,
        CL_ME_MB_TYPE_4x4_INTEL              = 0x2,
        CL_ME_SUBPIXEL_MODE_INTEGER_INTEL    = 0x0,
        CL_ME_SUBPIXEL_MODE_HPEL_INTEL       = 0x1,
        CL_ME_SUBPIXEL_MODE_QPEL_INTEL       = 0x2,
        CL_ME_SAD_ADJUST_MODE_NONE_INTEL     = 0x0,
        CL_ME_SAD_ADJUST_MODE_HAAR_INTEL     = 0x1,
        CL_ME_SEARCH_PATH_RADIUS_2_2_INTEL   = 0x0,
        CL_ME_SEARCH_PATH_RADIUS_4_4_INTEL   = 0x1,
        CL_ME_SEARCH_PATH_RADIUS_16_12_INTEL = 0x5;

    private INTELMotionEstimation() {}

}
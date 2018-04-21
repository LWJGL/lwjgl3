/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

/**
 * Native bindings to the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/intel/cl_intel_device_side_avc_motion_estimation.txt">intel_device_side_avc_motion_estimation</a> extension.
 * 
 * <p>Video motion estimation (VME) is defined as of set motion estimation operations that are used to determine the motion vectors, intra estimation angles
 * and macroblock partitioning combination that best describe the transformation to the source macroblock, from blocks in one or more previous reference
 * pictures (inter-prediction), or from other blocks in the same source picture (intra-prediction). It does this by searching for spatial and temporal
 * patterns on the current and various forward and backward reference pictures.</p>
 * 
 * <p>The goal of this extension is to provide programmers with a fine- grained interface to the AVC VME media sampler in Intel graphics processors. It
 * describes the specification of low-level built-in functions, callable from OpenCL kernels, that facilitate the programming of the VME media sampler to
 * evaluate specific AVC motion estimation operations. If only a coarser-level interface at the level of built-in kernels suffices, then the Intel vendor
 * extensions cl_intel_motion_estimation and cl_advanced_motion_estimation may be considered.</p>
 * 
 * <p>Built-in functions are defined for all the major operations of the VME media sampler. The major operations of the AVC VME media sampler in Intel
 * Graphics Processors can be described as follows:</p>
 * 
 * <p>1. Integer motion estimation (IME)</p>
 * 
 * <p>Perform motion estimation on a given source macroblock in a source image over a single or dual reference window in a reference image, at full-pixel
 * resolution, to determine the best integer motion vectors and their associated distortions, and the best macroblock shape partitioning combination.</p>
 * 
 * <p>2. Motion estimation refinement (REF)</p>
 * 
 * <p>Perform refinement operations on the results of IME. The two sub- operations are:</p>
 * 
 * <p>Fractional motion estimation (FME)</p>
 * 
 * <p>Perform sub-pixel refinement on the results of an IME operation. half-pixel (HPEL) or quarter-pixel (QPEL) refinements are performed to determine the
 * best sub-pixel motion vectors and their associated distortions.</p>
 * 
 * <p>Bidirectional motion estimation (BME)</p>
 * 
 * <p>Perform bidirectional refinement on the results of an IME operation using two reference images to check if the bidirectional mode using two references
 * yields lesser distortions. An FME can optionally be performed implicitly as part of a bidirectional refinement.</p>
 * 
 * <p>3. Skip and Intra check (SIC)</p>
 * 
 * <p>Performs the following two sub-operations:</p>
 * 
 * <p>Skip check (SKC)</p>
 * 
 * <p>Compute the pixel distortion of a user-specified shape and motion vector combination. The VME media sampler fetches necessary pixels, performs
 * fractional and bidirectional filtering (as necessary), and then computes the distortion between the derived reference and source. The skip decision can
 * optionally be enhanced to include a 4x4 forward transform, the results of which are compared against a user specified threshold to emulate the effects
 * of the forward quantization zeroing effect.</p>
 * 
 * <p>Intra prediction estimation (IPE)</p>
 * 
 * <p>Perform intra prediction on a given source macroblock to determine the best intra prediction modes and the best shape partitioning combination.</p>
 * 
 * <p>Requires {@link CL12 CL12} and {@link INTELSubgroups intel_subgroups}.</p>
 */
public final class INTELDeviceSideAVCMotionEstimation {

    /** Accepted as arguments to {@link CL10#clGetDeviceInfo GetDeviceInfo}. */
    public static final int
        CL_DEVICE_AVC_ME_VERSION_INTEL                      = 0x410B,
        CL_DEVICE_AVC_ME_SUPPORTS_TEXTURE_SAMPLER_USE_INTEL = 0x410C,
        CL_DEVICE_AVC_ME_SUPPORTS_PREEMPTION_INTEL          = 0x410D;

    /** Additional valid constant values returned by {@link CL10#clGetDeviceInfo GetDeviceInfo}. */
    public static final int CL_AVC_ME_VERSION_1_INTEL = 0x1;

    private INTELDeviceSideAVCMotionEstimation() {}

}
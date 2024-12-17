/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val intel_device_side_avc_motion_estimation = "INTELDeviceSideAVCMotionEstimation".nativeClassCL("intel_device_side_avc_motion_estimation", INTEL) {
    IntConstant(
        "DEVICE_AVC_ME_VERSION_INTEL"..0x410B,
        "DEVICE_AVC_ME_SUPPORTS_TEXTURE_SAMPLER_USE_INTEL"..0x410C,
        "DEVICE_AVC_ME_SUPPORTS_PREEMPTION_INTEL"..0x410D
    )

    IntConstant(
        "AVC_ME_VERSION_1_INTEL"..0x1
    )
}
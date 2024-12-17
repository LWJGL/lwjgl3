/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val intel_simultaneous_sharing = "INTELSimultaneousSharing".nativeClassCL("intel_simultaneous_sharing", INTEL) {
    IntConstant(
        "DEVICE_SIMULTANEOUS_INTEROPS_INTEL"..0x4104
    )

    IntConstant(
        "DEVICE_NUM_SIMULTANEOUS_INTEROPS_INTEL"..0x4105
    )
}
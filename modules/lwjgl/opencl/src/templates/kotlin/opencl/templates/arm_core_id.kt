/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val arm_core_id = "ARMCoreID".nativeClassCL("arm_core_id", ARM) {
    IntConstant(
        "DEVICE_COMPUTE_UNITS_BITFIELD_ARM"..0x40BF
    )
}

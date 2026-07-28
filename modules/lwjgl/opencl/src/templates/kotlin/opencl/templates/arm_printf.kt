/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val arm_printf = "ARMPrintf".nativeClassCL("arm_printf", ARM) {
    LongConstant(
        "PRINTF_CALLBACK_ARM"..0x40B0L,
        "PRINTF_BUFFERSIZE_ARM"..0x40B1L
    )
}
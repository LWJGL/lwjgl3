/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val intel_mem_channel_property = "INTELMemChannelProperty".nativeClassCL("intel_mem_channel_property", INTEL) {
    IntConstant(
        "MEM_CHANNEL_INTEL"..0x4213
    )
}

/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val intel_mem_channel_property = "INTELMemChannelProperty".nativeClassCL("intel_mem_channel_property", INTEL) {
    documentation =
        """
        Native bindings to the $extensionLink extension.

        On some accelerators, manual partitioning of buffers across different regions of memory may result in higher performance by spreading high-demand
        memory across different interfaces or ports of a memory.

        This extension allows programmers to request that a buffer allocation be implemented in a particular region of memory.

        Requires ${intel_create_buffer_with_properties.link}.
        """

    IntConstant(
        "Accepted property for the {@code properties} parameter to #CreateBufferWithPropertiesINTEL() to specify the requested channel for the buffer.",

        "MEM_CHANNEL_INTEL"..0x4213
    )
}

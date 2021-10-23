/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val img_mem_properties = "IMGMemProperties".nativeClassCL("img_mem_properties", IMG) {
    documentation =
        """
        Native bindings to the $extensionLink extension.

        This extension provides additional properties that can be passed to #CreateBufferWithProperties().
        
        Requires ${CL30.link}.
        """

    IntConstant(
        "Accepted propertie(s) for the {@code properties} parameter to #CreateBufferWithProperties().",

        "MEM_ALLOC_FLAGS_IMG"..0x40D7
    )

    IntConstant(
        "Accepted {@code values} for {@code cl_mem_alloc_flags_img}.",

        "MEM_ALLOC_RELAX_REQUIREMENTS_IMG".."1 << 0"
    )
}
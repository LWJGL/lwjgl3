/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val img_mem_properties = "IMGMemProperties".nativeClassCL("img_mem_properties", IMG) {
    IntConstant(
        "MEM_ALLOC_FLAGS_IMG"..0x40D7
    )

    IntConstant(
        "MEM_ALLOC_RELAX_REQUIREMENTS_IMG".."1 << 0"
    )
}
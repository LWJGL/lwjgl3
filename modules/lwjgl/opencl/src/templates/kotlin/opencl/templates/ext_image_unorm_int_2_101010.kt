/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val ext_image_unorm_int_2_101010 = "EXTImageUnormInt2101010".nativeClassCL("ext_image_unorm_int_2_101010", EXT) {
    IntConstant(
        "UNORM_INT_2_101010_EXT"..0x10E5
    )
}
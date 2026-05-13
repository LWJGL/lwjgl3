/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val ext_image_unsigned_10x6_12x4_14x2 = "EXTImageUnsigned_10x6_12x4_14x2".nativeClassCL("ext_image_unsigned_10x6_12x4_14x2", EXT) {
    IntConstant(
        "UNSIGNED_INT10X6_EXT"..0x10E6,
        "UNSIGNED_INT12X4_EXT"..0x10E7,
        "UNSIGNED_INT14X2_EXT"..0x10E8,
        "UNORM_INT10X6_EXT"..0x10E1,
        "UNORM_INT12X4_EXT"..0x10E9,
        "UNORM_INT14X2_EXT"..0x10EA
    )
}
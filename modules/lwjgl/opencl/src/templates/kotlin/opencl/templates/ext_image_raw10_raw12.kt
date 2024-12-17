/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val ext_image_raw10_raw12 = "EXTImageRaw10Raw12".nativeClassCL("ext_image_raw10_raw12", EXT) {
    IntConstant(
        "UNSIGNED_INT_RAW10_EXT"..0x10E3,
        "UNSIGNED_INT_RAW12_EXT"..0x10E4
    )
}
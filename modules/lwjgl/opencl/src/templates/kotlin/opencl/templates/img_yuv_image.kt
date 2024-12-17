/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val img_yuv_image = "IMGYUVImage".nativeClassCL("img_yuv_image", IMG) {
    IntConstant(
        "NV21_IMG"..0x40D0,
        "YV12_IMG"..0x40D1
    )
}
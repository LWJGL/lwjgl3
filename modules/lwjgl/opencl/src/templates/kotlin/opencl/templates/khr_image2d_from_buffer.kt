/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val khr_image2d_from_buffer = "KHRImage2DFromBuffer".nativeClassCL("khr_image2d_from_buffer", KHR) {

    IntConstant(
        "DEVICE_IMAGE_PITCH_ALIGNMENT"..0x104A
    )

    IntConstant(
        "DEVICE_IMAGE_BASE_ADDRESS_ALIGNMENT"..0x104B
    )

}
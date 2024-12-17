/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val khr_depth_images = "KHRDepthImages".nativeClassCL("khr_depth_images", KHR) {

    IntConstant(
        "DEPTH"..0x10BD
    )

}
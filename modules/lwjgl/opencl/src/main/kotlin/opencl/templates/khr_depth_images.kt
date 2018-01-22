/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

val khr_depth_images = "KHRDepthImages".nativeClassCL("khr_depth_images", KHR) {

    documentation = "Native bindings to the $extensionName extension."

    IntConstant(
        "cl_channel_order",

        "DEPTH"..0x10BD
    )

}
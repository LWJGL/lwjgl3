/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

val khr_mipmap_image = "KHRMipmapImage".nativeClassCL("khr_mipmap_image", KHR) {
    documentation =
        """
        Native bindings to the $extensionName extension.

        This extension adds support to create a mip-mapped image, enqueue commands to read/write/copy/map a region of a mipmapped image and built-in functions
        that can be used to read a mip-mapped image in an OpenCL C program.
        """

    IntConstant(
        "cl_sampler_info",

        "SAMPLER_MIP_FILTER_MODE_KHR"..0x1155,
        "SAMPLER_LOD_MIN_KHR"..0x1156,
        "SAMPLER_LOD_MAX_KHR"..0x1157
    )
}
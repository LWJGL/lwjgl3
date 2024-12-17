/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val khr_mipmap_image = "KHRMipmapImage".nativeClassCL("khr_mipmap_image", KHR) {
    IntConstant(
        "SAMPLER_MIP_FILTER_MODE_KHR"..0x1155,
        "SAMPLER_LOD_MIN_KHR"..0x1156,
        "SAMPLER_LOD_MAX_KHR"..0x1157
    )
}
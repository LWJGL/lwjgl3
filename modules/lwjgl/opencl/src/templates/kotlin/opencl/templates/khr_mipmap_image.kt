/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val khr_mipmap_image = "KHRMipmapImage".nativeClassCL("khr_mipmap_image", KHR) {
    LongConstant(
        "SAMPLER_MIP_FILTER_MODE_KHR"..0x1155L,
        "SAMPLER_LOD_MIN_KHR"..0x1156L,
        "SAMPLER_LOD_MAX_KHR"..0x1157L
    )
}
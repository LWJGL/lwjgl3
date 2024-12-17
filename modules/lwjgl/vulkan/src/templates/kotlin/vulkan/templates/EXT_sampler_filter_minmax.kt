/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_sampler_filter_minmax = "EXTSamplerFilterMinmax".nativeClassVK("EXT_sampler_filter_minmax", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_SAMPLER_FILTER_MINMAX_SPEC_VERSION".."2"
    )

    StringConstant(
        "EXT_SAMPLER_FILTER_MINMAX_EXTENSION_NAME".."VK_EXT_sampler_filter_minmax"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_FILTER_MINMAX_PROPERTIES_EXT".."1000130000",
        "STRUCTURE_TYPE_SAMPLER_REDUCTION_MODE_CREATE_INFO_EXT".."1000130001"
    )

    EnumConstant(
        "FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_MINMAX_BIT_EXT".enum(0x00010000)
    )

    EnumConstant(
        "SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_EXT".."0",
        "SAMPLER_REDUCTION_MODE_MIN_EXT".."1",
        "SAMPLER_REDUCTION_MODE_MAX_EXT".."2"
    )
}
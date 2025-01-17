/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_framebuffer_mixed_samples = "NVFramebufferMixedSamples".nativeClassVK("NV_framebuffer_mixed_samples", type = "device", postfix = "NV") {
    IntConstant(
        "NV_FRAMEBUFFER_MIXED_SAMPLES_SPEC_VERSION".."1"
    )

    StringConstant(
        "NV_FRAMEBUFFER_MIXED_SAMPLES_EXTENSION_NAME".."VK_NV_framebuffer_mixed_samples"
    )

    EnumConstant(
        "STRUCTURE_TYPE_ATTACHMENT_SAMPLE_COUNT_INFO_NV".."1000044008",
        "STRUCTURE_TYPE_PIPELINE_COVERAGE_MODULATION_STATE_CREATE_INFO_NV".."1000152000"
    )

    EnumConstant(
        "COVERAGE_MODULATION_MODE_NONE_NV".."0",
        "COVERAGE_MODULATION_MODE_RGB_NV".."1",
        "COVERAGE_MODULATION_MODE_ALPHA_NV".."2",
        "COVERAGE_MODULATION_MODE_RGBA_NV".."3"
    )
}
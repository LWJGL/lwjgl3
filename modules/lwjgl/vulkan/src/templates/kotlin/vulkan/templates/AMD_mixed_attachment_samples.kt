/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val AMD_mixed_attachment_samples = "AMDMixedAttachmentSamples".nativeClassVK("AMD_mixed_attachment_samples", type = "device", postfix = "AMD") {
    IntConstant(
        "AMD_MIXED_ATTACHMENT_SAMPLES_SPEC_VERSION".."1"
    )

    StringConstant(
        "AMD_MIXED_ATTACHMENT_SAMPLES_EXTENSION_NAME".."VK_AMD_mixed_attachment_samples"
    )

    EnumConstant(
        "STRUCTURE_TYPE_ATTACHMENT_SAMPLE_COUNT_INFO_AMD".."1000044008"
    )
}
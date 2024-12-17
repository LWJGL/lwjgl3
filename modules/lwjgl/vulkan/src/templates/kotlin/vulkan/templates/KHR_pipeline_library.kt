/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_pipeline_library = "KHRPipelineLibrary".nativeClassVK("KHR_pipeline_library", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_PIPELINE_LIBRARY_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_PIPELINE_LIBRARY_EXTENSION_NAME".."VK_KHR_pipeline_library"
    )

    EnumConstant(
        "PIPELINE_CREATE_LIBRARY_BIT_KHR".enum(0x00000800)
    )

    EnumConstant(
        "STRUCTURE_TYPE_PIPELINE_LIBRARY_CREATE_INFO_KHR".."1000290000"
    )
}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_pipeline_properties = "EXTPipelineProperties".nativeClassVK("EXT_pipeline_properties", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_PIPELINE_PROPERTIES_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_PIPELINE_PROPERTIES_EXTENSION_NAME".."VK_EXT_pipeline_properties"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PIPELINE_PROPERTIES_IDENTIFIER_EXT".."1000372000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_PROPERTIES_FEATURES_EXT".."1000372001",
        "STRUCTURE_TYPE_PIPELINE_INFO_EXT".."1000372001"
    )

    VkResult(
        "GetPipelinePropertiesEXT",

        VkDevice("device"),
        VkPipelineInfoEXT.const.p("pPipelineInfo"),
        nullable..VkBaseOutStructure.p("pPipelineProperties")
    )
}
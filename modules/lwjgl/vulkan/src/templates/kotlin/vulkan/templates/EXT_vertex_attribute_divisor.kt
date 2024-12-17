/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_vertex_attribute_divisor = "EXTVertexAttributeDivisor".nativeClassVK("EXT_vertex_attribute_divisor", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_VERTEX_ATTRIBUTE_DIVISOR_SPEC_VERSION".."3"
    )

    StringConstant(
        "EXT_VERTEX_ATTRIBUTE_DIVISOR_EXTENSION_NAME".."VK_EXT_vertex_attribute_divisor"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_PROPERTIES_EXT".."1000190000",
        "STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO_EXT".."1000190001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_FEATURES_EXT".."1000190002"
    )
}
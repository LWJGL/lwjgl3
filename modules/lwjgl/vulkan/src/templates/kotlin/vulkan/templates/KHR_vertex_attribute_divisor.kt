/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_vertex_attribute_divisor = "KHRVertexAttributeDivisor".nativeClassVK("KHR_vertex_attribute_divisor", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_VERTEX_ATTRIBUTE_DIVISOR_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_VERTEX_ATTRIBUTE_DIVISOR_EXTENSION_NAME".."VK_KHR_vertex_attribute_divisor"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO_KHR".."1000190001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_FEATURES_KHR".."1000190002",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_PROPERTIES_KHR".."1000525000"
    )
}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_vertex_attribute_robustness = "EXTVertexAttributeRobustness".nativeClassVK("EXT_vertex_attribute_robustness", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_VERTEX_ATTRIBUTE_ROBUSTNESS_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_VERTEX_ATTRIBUTE_ROBUSTNESS_EXTENSION_NAME".."VK_EXT_vertex_attribute_robustness"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_ROBUSTNESS_FEATURES_EXT".."1000608000"
    )
}
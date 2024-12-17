/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_legacy_vertex_attributes = "EXTLegacyVertexAttributes".nativeClassVK("EXT_legacy_vertex_attributes", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_LEGACY_VERTEX_ATTRIBUTES_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_LEGACY_VERTEX_ATTRIBUTES_EXTENSION_NAME".."VK_EXT_legacy_vertex_attributes"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_LEGACY_VERTEX_ATTRIBUTES_FEATURES_EXT".."1000495000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_LEGACY_VERTEX_ATTRIBUTES_PROPERTIES_EXT".."1000495001"
    )
}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_provoking_vertex = "EXTProvokingVertex".nativeClassVK("EXT_provoking_vertex", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_PROVOKING_VERTEX_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_PROVOKING_VERTEX_EXTENSION_NAME".."VK_EXT_provoking_vertex"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PROVOKING_VERTEX_FEATURES_EXT".."1000254000",
        "STRUCTURE_TYPE_PIPELINE_RASTERIZATION_PROVOKING_VERTEX_STATE_CREATE_INFO_EXT".."1000254001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PROVOKING_VERTEX_PROPERTIES_EXT".."1000254002"
    )

    EnumConstant(
        "PROVOKING_VERTEX_MODE_FIRST_VERTEX_EXT".."0",
        "PROVOKING_VERTEX_MODE_LAST_VERTEX_EXT".."1"
    )
}
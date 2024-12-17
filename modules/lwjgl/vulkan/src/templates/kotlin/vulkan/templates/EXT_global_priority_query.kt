/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_global_priority_query = "EXTGlobalPriorityQuery".nativeClassVK("EXT_global_priority_query", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_GLOBAL_PRIORITY_QUERY_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_GLOBAL_PRIORITY_QUERY_EXTENSION_NAME".."VK_EXT_global_priority_query"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_GLOBAL_PRIORITY_QUERY_FEATURES_EXT".."1000388000",
        "STRUCTURE_TYPE_QUEUE_FAMILY_GLOBAL_PRIORITY_PROPERTIES_EXT".."1000388001"
    )

    EnumConstant(
        "MAX_GLOBAL_PRIORITY_SIZE_EXT".."16"
    )
}
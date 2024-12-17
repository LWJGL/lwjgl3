/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_primitives_generated_query = "EXTPrimitivesGeneratedQuery".nativeClassVK("EXT_primitives_generated_query", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_PRIMITIVES_GENERATED_QUERY_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_PRIMITIVES_GENERATED_QUERY_EXTENSION_NAME".."VK_EXT_primitives_generated_query"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIMITIVES_GENERATED_QUERY_FEATURES_EXT".."1000382000"
    )

    EnumConstant(
        "QUERY_TYPE_PRIMITIVES_GENERATED_EXT".."1000382000"
    )
}
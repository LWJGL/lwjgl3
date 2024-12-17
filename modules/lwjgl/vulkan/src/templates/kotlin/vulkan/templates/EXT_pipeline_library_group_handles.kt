/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_pipeline_library_group_handles = "EXTPipelineLibraryGroupHandles".nativeClassVK("EXT_pipeline_library_group_handles", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_PIPELINE_LIBRARY_GROUP_HANDLES_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_PIPELINE_LIBRARY_GROUP_HANDLES_EXTENSION_NAME".."VK_EXT_pipeline_library_group_handles"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_LIBRARY_GROUP_HANDLES_FEATURES_EXT".."1000498000"
    )
}
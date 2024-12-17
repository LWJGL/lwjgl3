/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_pipeline_creation_cache_control = "EXTPipelineCreationCacheControl".nativeClassVK("EXT_pipeline_creation_cache_control", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_PIPELINE_CREATION_CACHE_CONTROL_SPEC_VERSION".."3"
    )

    StringConstant(
        "EXT_PIPELINE_CREATION_CACHE_CONTROL_EXTENSION_NAME".."VK_EXT_pipeline_creation_cache_control"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_CREATION_CACHE_CONTROL_FEATURES_EXT".."1000297000"
    )

    EnumConstant(
        "PIPELINE_CREATE_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT_EXT".enum(0x00000100),
        "PIPELINE_CREATE_EARLY_RETURN_ON_FAILURE_BIT_EXT".enum(0x00000200)
    )

    EnumConstant(
        "PIPELINE_COMPILE_REQUIRED_EXT".."1000297000",
        "ERROR_PIPELINE_COMPILE_REQUIRED_EXT".."1000297000"
    )

    EnumConstant(
        "PIPELINE_CACHE_CREATE_EXTERNALLY_SYNCHRONIZED_BIT_EXT".enum(0x00000001)
    )
}
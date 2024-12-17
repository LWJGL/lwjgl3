/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_pipeline_protected_access = "EXTPipelineProtectedAccess".nativeClassVK("EXT_pipeline_protected_access", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_PIPELINE_PROTECTED_ACCESS_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_PIPELINE_PROTECTED_ACCESS_EXTENSION_NAME".."VK_EXT_pipeline_protected_access"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_PROTECTED_ACCESS_FEATURES_EXT".."1000466000"
    )

    EnumConstant(
        "PIPELINE_CREATE_NO_PROTECTED_ACCESS_BIT_EXT".enum(0x08000000),
        "PIPELINE_CREATE_PROTECTED_ACCESS_ONLY_BIT_EXT".enum(0x40000000)
    )
}
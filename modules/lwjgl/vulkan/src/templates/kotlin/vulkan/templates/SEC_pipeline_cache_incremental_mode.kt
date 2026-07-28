/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val SEC_pipeline_cache_incremental_mode = "SECPipelineCacheIncrementalMode".nativeClassVK("SEC_pipeline_cache_incremental_mode", type = "device", postfix = "SEC") {
    IntConstant(
        "SEC_PIPELINE_CACHE_INCREMENTAL_MODE_SPEC_VERSION".."1"
    )

    StringConstant(
        "SEC_PIPELINE_CACHE_INCREMENTAL_MODE_EXTENSION_NAME".."VK_SEC_pipeline_cache_incremental_mode"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_CACHE_INCREMENTAL_MODE_FEATURES_SEC".."1000637000"
    )
}
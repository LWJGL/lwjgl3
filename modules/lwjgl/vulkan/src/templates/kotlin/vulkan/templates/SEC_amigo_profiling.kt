/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val SEC_amigo_profiling = "SECAmigoProfiling".nativeClassVK("SEC_amigo_profiling", type = "device", postfix = "SEC") {
    IntConstant(
        "SEC_AMIGO_PROFILING_SPEC_VERSION".."1"
    )

    StringConstant(
        "SEC_AMIGO_PROFILING_EXTENSION_NAME".."VK_SEC_amigo_profiling"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_AMIGO_PROFILING_FEATURES_SEC".."1000485000",
        "STRUCTURE_TYPE_AMIGO_PROFILING_SUBMIT_INFO_SEC".."1000485001"
    )
}
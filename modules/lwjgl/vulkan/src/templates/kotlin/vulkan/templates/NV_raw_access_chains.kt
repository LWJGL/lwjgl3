/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_raw_access_chains = "NVRawAccessChains".nativeClassVK("NV_raw_access_chains", type = "device", postfix = "NV") {
    IntConstant(
        "NV_RAW_ACCESS_CHAINS_SPEC_VERSION".."1"
    )

    StringConstant(
        "NV_RAW_ACCESS_CHAINS_EXTENSION_NAME".."VK_NV_raw_access_chains"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_RAW_ACCESS_CHAINS_FEATURES_NV".."1000555000"
    )
}
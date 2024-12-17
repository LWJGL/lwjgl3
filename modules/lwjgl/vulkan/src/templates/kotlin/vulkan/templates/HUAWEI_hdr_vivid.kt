/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val HUAWEI_hdr_vivid = "HUAWEIHdrVivid".nativeClassVK("HUAWEI_hdr_vivid", type = "device", postfix = "HUAWEI") {
    IntConstant(
        "HUAWEI_HDR_VIVID_SPEC_VERSION".."1"
    )

    StringConstant(
        "HUAWEI_HDR_VIVID_EXTENSION_NAME".."VK_HUAWEI_hdr_vivid"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_HDR_VIVID_FEATURES_HUAWEI".."1000590000",
        "STRUCTURE_TYPE_HDR_VIVID_DYNAMIC_METADATA_HUAWEI".."1000590001"
    )
}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_low_latency = "NVLowLatency".nativeClassVK("NV_low_latency", type = "device", postfix = "NV") {
    IntConstant(
        "NV_LOW_LATENCY_SPEC_VERSION".."1"
    )

    StringConstant(
        "NV_LOW_LATENCY_EXTENSION_NAME".."VK_NV_low_latency"
    )

    EnumConstant(
        "STRUCTURE_TYPE_QUERY_LOW_LATENCY_SUPPORT_NV".."1000310000"
    )
}
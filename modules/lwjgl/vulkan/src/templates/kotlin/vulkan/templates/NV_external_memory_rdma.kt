/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_external_memory_rdma = "NVExternalMemoryRdma".nativeClassVK("NV_external_memory_rdma", type = "device", postfix = "NV") {
    IntConstant(
        "NV_EXTERNAL_MEMORY_RDMA_SPEC_VERSION".."1"
    )

    StringConstant(
        "NV_EXTERNAL_MEMORY_RDMA_EXTENSION_NAME".."VK_NV_external_memory_rdma"
    )

    EnumConstant(
        "STRUCTURE_TYPE_MEMORY_GET_REMOTE_ADDRESS_INFO_NV".."1000371000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_MEMORY_RDMA_FEATURES_NV".."1000371001"
    )

    EnumConstant(
        "MEMORY_PROPERTY_RDMA_CAPABLE_BIT_NV".enum(0x00000100)
    )

    EnumConstant(
        "EXTERNAL_MEMORY_HANDLE_TYPE_RDMA_ADDRESS_BIT_NV".enum(0x00001000)
    )

    VkResult(
        "GetMemoryRemoteAddressNV",

        VkDevice("device"),
        VkMemoryGetRemoteAddressInfoNV.const.p("pMemoryGetRemoteAddressInfo"),
        Check(1)..VkRemoteAddressNV.p("pAddress")
    )
}
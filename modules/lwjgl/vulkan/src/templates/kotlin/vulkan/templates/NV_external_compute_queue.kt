/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_external_compute_queue = "NVExternalComputeQueue".nativeClassVK("NV_external_compute_queue", type = "device", postfix = "NV") {
    IntConstant(
        "NV_EXTERNAL_COMPUTE_QUEUE_SPEC_VERSION".."1"
    )

    StringConstant(
        "NV_EXTERNAL_COMPUTE_QUEUE_EXTENSION_NAME".."VK_NV_external_compute_queue"
    )

    EnumConstant(
        "STRUCTURE_TYPE_EXTERNAL_COMPUTE_QUEUE_DEVICE_CREATE_INFO_NV".."1000556000",
        "STRUCTURE_TYPE_EXTERNAL_COMPUTE_QUEUE_CREATE_INFO_NV".."1000556001",
        "STRUCTURE_TYPE_EXTERNAL_COMPUTE_QUEUE_DATA_PARAMS_NV".."1000556002",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_COMPUTE_QUEUE_PROPERTIES_NV".."1000556003"
    )

    EnumConstant(
        "OBJECT_TYPE_EXTERNAL_COMPUTE_QUEUE_NV".."1000556000"
    )

    VkResult(
        "CreateExternalComputeQueueNV",

        VkDevice("device"),
        VkExternalComputeQueueCreateInfoNV.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkExternalComputeQueueNV.p("pExternalQueue")
    )

    void(
        "DestroyExternalComputeQueueNV",

        VkDevice("device"),
        VkExternalComputeQueueNV("externalQueue"),
        nullable..VkAllocationCallbacks.const.p("pAllocator")
    )

    void(
        "GetExternalComputeQueueDataNV",

        VkExternalComputeQueueNV("externalQueue"),
        VkExternalComputeQueueDataParamsNV.p("params"),
        Check(1)..void.p("pData")
    )
}
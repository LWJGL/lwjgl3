/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_deferred_host_operations = "KHRDeferredHostOperations".nativeClassVK("KHR_deferred_host_operations", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_DEFERRED_HOST_OPERATIONS_SPEC_VERSION".."4"
    )

    StringConstant(
        "KHR_DEFERRED_HOST_OPERATIONS_EXTENSION_NAME".."VK_KHR_deferred_host_operations"
    )

    EnumConstant(
        "OBJECT_TYPE_DEFERRED_OPERATION_KHR".."1000268000"
    )

    EnumConstant(
        "THREAD_IDLE_KHR".."1000268000",
        "THREAD_DONE_KHR".."1000268001",
        "OPERATION_DEFERRED_KHR".."1000268002",
        "OPERATION_NOT_DEFERRED_KHR".."1000268003"
    )

    VkResult(
        "CreateDeferredOperationKHR",

        VkDevice("device"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkDeferredOperationKHR.p("pDeferredOperation")
    )

    void(
        "DestroyDeferredOperationKHR",

        VkDevice("device"),
        VkDeferredOperationKHR("operation"),
        nullable..VkAllocationCallbacks.const.p("pAllocator")
    )

    uint32_t(
        "GetDeferredOperationMaxConcurrencyKHR",

        VkDevice("device"),
        VkDeferredOperationKHR("operation")
    )

    VkResult(
        "GetDeferredOperationResultKHR",

        VkDevice("device"),
        VkDeferredOperationKHR("operation")
    )

    VkResult(
        "DeferredOperationJoinKHR",

        VkDevice("device"),
        VkDeferredOperationKHR("operation")
    )
}
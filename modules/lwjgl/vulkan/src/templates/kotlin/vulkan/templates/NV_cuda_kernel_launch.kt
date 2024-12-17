/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_cuda_kernel_launch = "NVCudaKernelLaunch".nativeClassVK("NV_cuda_kernel_launch", type = "device", postfix = "NV") {
    IntConstant(
        "NV_CUDA_KERNEL_LAUNCH_SPEC_VERSION".."2"
    )

    StringConstant(
        "NV_CUDA_KERNEL_LAUNCH_EXTENSION_NAME".."VK_NV_cuda_kernel_launch"
    )

    EnumConstant(
        "STRUCTURE_TYPE_CUDA_MODULE_CREATE_INFO_NV".."1000307000",
        "STRUCTURE_TYPE_CUDA_FUNCTION_CREATE_INFO_NV".."1000307001",
        "STRUCTURE_TYPE_CUDA_LAUNCH_INFO_NV".."1000307002",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_CUDA_KERNEL_LAUNCH_FEATURES_NV".."1000307003",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_CUDA_KERNEL_LAUNCH_PROPERTIES_NV".."1000307004"
    )

    EnumConstant(
        "OBJECT_TYPE_CUDA_MODULE_NV".."1000307000",
        "OBJECT_TYPE_CUDA_FUNCTION_NV".."1000307001"
    )

    EnumConstant(
        "DEBUG_REPORT_OBJECT_TYPE_CUDA_MODULE_NV_EXT".."1000307000",
        "DEBUG_REPORT_OBJECT_TYPE_CUDA_FUNCTION_NV_EXT".."1000307001"
    )

    VkResult(
        "CreateCudaModuleNV",

        VkDevice("device"),
        VkCudaModuleCreateInfoNV.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkCudaModuleNV.p("pModule")
    )

    VkResult(
        "GetCudaModuleCacheNV",

        VkDevice("device"),
        VkCudaModuleNV("module"),
        AutoSize("pCacheData")..Check(1)..size_t.p("pCacheSize"),
        nullable..void.p("pCacheData")
    )

    VkResult(
        "CreateCudaFunctionNV",

        VkDevice("device"),
        VkCudaFunctionCreateInfoNV.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkCudaFunctionNV.p("pFunction")
    )

    void(
        "DestroyCudaModuleNV",

        VkDevice("device"),
        VkCudaModuleNV("module"),
        nullable..VkAllocationCallbacks.const.p("pAllocator")
    )

    void(
        "DestroyCudaFunctionNV",

        VkDevice("device"),
        VkCudaFunctionNV("function"),
        nullable..VkAllocationCallbacks.const.p("pAllocator")
    )

    void(
        "CmdCudaLaunchKernelNV",

        VkCommandBuffer("commandBuffer"),
        VkCudaLaunchInfoNV.const.p("pLaunchInfo")
    )
}
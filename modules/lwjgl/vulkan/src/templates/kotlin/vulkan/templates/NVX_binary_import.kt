/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NVX_binary_import = "NVXBinaryImport".nativeClassVK("NVX_binary_import", type = "device", postfix = "NVX") {
    IntConstant(
        "NVX_BINARY_IMPORT_SPEC_VERSION".."2"
    )

    StringConstant(
        "NVX_BINARY_IMPORT_EXTENSION_NAME".."VK_NVX_binary_import"
    )

    EnumConstant(
        "STRUCTURE_TYPE_CU_MODULE_CREATE_INFO_NVX".."1000029000",
        "STRUCTURE_TYPE_CU_FUNCTION_CREATE_INFO_NVX".."1000029001",
        "STRUCTURE_TYPE_CU_LAUNCH_INFO_NVX".."1000029002",
        "STRUCTURE_TYPE_CU_MODULE_TEXTURING_MODE_CREATE_INFO_NVX".."1000029004"
    )

    EnumConstant(
        "OBJECT_TYPE_CU_MODULE_NVX".."1000029000",
        "OBJECT_TYPE_CU_FUNCTION_NVX".."1000029001"
    )

    EnumConstant(
        "DEBUG_REPORT_OBJECT_TYPE_CU_MODULE_NVX_EXT".."1000029000",
        "DEBUG_REPORT_OBJECT_TYPE_CU_FUNCTION_NVX_EXT".."1000029001"
    )

    VkResult(
        "CreateCuModuleNVX",

        VkDevice("device"),
        VkCuModuleCreateInfoNVX.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkCuModuleNVX.p("pModule")
    )

    VkResult(
        "CreateCuFunctionNVX",

        VkDevice("device"),
        VkCuFunctionCreateInfoNVX.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkCuFunctionNVX.p("pFunction")
    )

    void(
        "DestroyCuModuleNVX",

        VkDevice("device"),
        VkCuModuleNVX("module"),
        nullable..VkAllocationCallbacks.const.p("pAllocator")
    )

    void(
        "DestroyCuFunctionNVX",

        VkDevice("device"),
        VkCuFunctionNVX("function"),
        nullable..VkAllocationCallbacks.const.p("pAllocator")
    )

    void(
        "CmdCuLaunchKernelNVX",

        VkCommandBuffer("commandBuffer"),
        VkCuLaunchInfoNVX.const.p("pLaunchInfo")
    )
}
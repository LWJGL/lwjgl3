/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_validation_cache = "EXTValidationCache".nativeClassVK("EXT_validation_cache", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_VALIDATION_CACHE_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_VALIDATION_CACHE_EXTENSION_NAME".."VK_EXT_validation_cache"
    )

    EnumConstant(
        "STRUCTURE_TYPE_VALIDATION_CACHE_CREATE_INFO_EXT".."1000160000",
        "STRUCTURE_TYPE_SHADER_MODULE_VALIDATION_CACHE_CREATE_INFO_EXT".."1000160001"
    )

    EnumConstant(
        "OBJECT_TYPE_VALIDATION_CACHE_EXT".."1000160000"
    )

    EnumConstant(
        "VALIDATION_CACHE_HEADER_VERSION_ONE_EXT".."1"
    )

    VkResult(
        "CreateValidationCacheEXT",

        VkDevice("device"),
        VkValidationCacheCreateInfoEXT.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkValidationCacheEXT.p("pValidationCache")
    )

    void(
        "DestroyValidationCacheEXT",

        VkDevice("device"),
        VkValidationCacheEXT("validationCache"),
        nullable..VkAllocationCallbacks.const.p("pAllocator")
    )

    VkResult(
        "MergeValidationCachesEXT",

        VkDevice("device"),
        VkValidationCacheEXT("dstCache"),
        AutoSize("pSrcCaches")..uint32_t("srcCacheCount"),
        VkValidationCacheEXT.const.p("pSrcCaches")
    )

    VkResult(
        "GetValidationCacheDataEXT",

        VkDevice("device"),
        VkValidationCacheEXT("validationCache"),
        AutoSize("pData")..Check(1)..size_t.p("pDataSize"),
        nullable..void.p("pData")
    )
}
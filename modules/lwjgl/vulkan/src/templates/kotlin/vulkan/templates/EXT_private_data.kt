/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_private_data = "EXTPrivateData".nativeClassVK("EXT_private_data", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_PRIVATE_DATA_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_PRIVATE_DATA_EXTENSION_NAME".."VK_EXT_private_data"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIVATE_DATA_FEATURES_EXT".."1000295000",
        "STRUCTURE_TYPE_DEVICE_PRIVATE_DATA_CREATE_INFO_EXT".."1000295001",
        "STRUCTURE_TYPE_PRIVATE_DATA_SLOT_CREATE_INFO_EXT".."1000295002"
    )

    EnumConstant(
        "OBJECT_TYPE_PRIVATE_DATA_SLOT_EXT".."1000295000"
    )

    VkResult(
        "CreatePrivateDataSlotEXT",

        VkDevice("device"),
        VkPrivateDataSlotCreateInfo.const.p("pCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator"),
        Check(1)..VkPrivateDataSlot.p("pPrivateDataSlot")
    )

    void(
        "DestroyPrivateDataSlotEXT",

        VkDevice("device"),
        VkPrivateDataSlot("privateDataSlot"),
        nullable..VkAllocationCallbacks.const.p("pAllocator")
    )

    VkResult(
        "SetPrivateDataEXT",

        VkDevice("device"),
        VkObjectType("objectType"),
        uint64_t("objectHandle"),
        VkPrivateDataSlot("privateDataSlot"),
        uint64_t("data")
    )

    void(
        "GetPrivateDataEXT",

        VkDevice("device"),
        VkObjectType("objectType"),
        uint64_t("objectHandle"),
        VkPrivateDataSlot("privateDataSlot"),
        Check(1)..uint64_t.p("pData")
    )
}
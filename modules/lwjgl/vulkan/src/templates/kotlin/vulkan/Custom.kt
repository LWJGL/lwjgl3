/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package vulkan

import org.lwjgl.generator.*
import vulkan.templates.*

fun templateCustomization() {
    PFN_vkDebugReportCallbackEXT.function.apply {
        additionalCode = """
    /**
     * Converts the specified {@link VkDebugReportCallbackEXT} argument to a String.
     *
     * <p>This method may only be used inside a {@code VkDebugReportCallbackEXT} invocation.</p>
     *
     * @param string the argument to decode
     *
     * @return the message as a String
     */
    public static String getString(long string) {
        return memUTF8(string);
    }
    """
    }

    VkMemoryRequirements.definition.apply {
        this["size"].mutable()
        this["alignment"].mutable()
        this["memoryTypeBits"].mutable()
    }

    VkShaderModuleCreateInfo.definition.apply {
        AutoSize("pCode")..this["codeSize"]
        PrimitiveType("uint32_t", PrimitiveMapping.BYTE).const.p("pCode")
            .replace(this["pCode"])
    }

    VkLayerSettingEXT.definition.apply {
        this["valueCount"].clearModifiers()
    }

    VK10.apply {
        IntConstant(
            "API_VERSION_1_0".."VK_MAKE_API_VERSION(0, 1, 0, 0)"
        )

        IntConstant(
            "HEADER_VERSION".."343"
        )

        LongConstant(
            "NULL_HANDLE"..0L
        )

        macro(expression = "(variant << 29) | (major << 22) | (minor << 12) | patch")..uint32_t(
            "VK_MAKE_API_VERSION",

            uint32_t("variant"),
            uint32_t("major"),
            uint32_t("minor"),
            uint32_t("patch"),

            noPrefix = true
        )

        macro(expression = "version >>> 29")..uint32_t(
            "VK_API_VERSION_VARIANT",

            uint32_t("version"),

            noPrefix = true
        )

        macro(expression = "(version >>> 22) & 0x7F")..uint32_t(
            "VK_API_VERSION_MAJOR",

            uint32_t("version"),

            noPrefix = true
        )

        macro(expression = "(version >>> 12) & 0x3FF")..uint32_t(
            "VK_API_VERSION_MINOR",

            uint32_t("version"),

            noPrefix = true
        )

        macro(expression = "version & 0xFFF")..uint32_t(
            "VK_API_VERSION_PATCH",

            uint32_t("version"),

            noPrefix = true
        )

        macro(expression = "(major << 22) | (minor << 12) | patch")..uint32_t(
            "VK_MAKE_VERSION",

            uint32_t("major"),
            uint32_t("minor"),
            uint32_t("patch"),

            noPrefix = true
        )

        macro(expression = "version >>> 22")..uint32_t(
            "VK_VERSION_MAJOR",

            uint32_t("version"),

            noPrefix = true
        )

        macro(expression = "(version >>> 12) & 0x3FF")..uint32_t(
            "VK_VERSION_MINOR",

            uint32_t("version"),

            noPrefix = true
        )

        macro(expression = "version & 0xFFF")..uint32_t(
            "VK_VERSION_PATCH",

            uint32_t("version"),

            noPrefix = true
        )

        IntConstant(
            "MAX_PHYSICAL_DEVICE_NAME_SIZE".."256",
            "UUID_SIZE".."16",
            "MAX_EXTENSION_NAME_SIZE".."256",
            "MAX_DESCRIPTION_SIZE".."256",
            "MAX_MEMORY_TYPES".."32",
            "MAX_MEMORY_HEAPS".."16",
            "REMAINING_MIP_LEVELS".."(~0)",
            "REMAINING_ARRAY_LAYERS".."(~0)",
            "ATTACHMENT_UNUSED".."(~0)",
            "TRUE".."1",
            "FALSE".."0",
            "QUEUE_FAMILY_IGNORED".."(~0)",
            "SUBPASS_EXTERNAL".."(~0)"
        )

        FloatConstant(
            "LOD_CLAMP_NONE".."1000.0f"
        )

        LongConstant(
            "WHOLE_SIZE".."(~0L)"
        )

        nullable..this["GetInstanceProcAddr"].getParam("instance")

        MultiType(
            PointerMapping.DATA_INT,
            PointerMapping.DATA_LONG
        )..this["GetQueryPoolResults"].getParam("pData")

        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_LONG,
            PointerMapping.DATA_FLOAT,
            PointerMapping.DATA_DOUBLE
        )..this["CmdUpdateBuffer"].getParam("pData")

        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_LONG,
            PointerMapping.DATA_FLOAT,
            PointerMapping.DATA_DOUBLE
        )..this["CmdPushConstants"].getParam("pValues")

        SingleValue("pSubmit")..this["QueueSubmit"].getParam("pSubmits")
        SingleValue("pMemoryRange")..this["FlushMappedMemoryRanges"].getParam("pMemoryRanges")
        SingleValue("pMemoryRange")..this["InvalidateMappedMemoryRanges"].getParam("pMemoryRanges")
        SingleValue("pBindInfo")..this["QueueBindSparse"].getParam("pBindInfo")
        SingleValue("pFence")..this["ResetFences"].getParam("pFences")
        SingleValue("pFence")..this["WaitForFences"].getParam("pFences")
        SingleValue("pDescriptorSet")..this["FreeDescriptorSets"].getParam("pDescriptorSets")
        SingleValue("pRange")..this["CmdClearColorImage"].getParam("pRanges")
        SingleValue("pRange")..this["CmdClearDepthStencilImage"].getParam("pRanges")
        SingleValue("pRegion")..this["CmdResolveImage"].getParam("pRegions")
        SingleValue("pCommandBuffer")..this["CmdExecuteCommands"].getParam("pCommandBuffers")
        SingleValue("pCommandBuffer")..this["FreeCommandBuffers"].getParam("pCommandBuffers")
    }

    VK11.apply {
        IntConstant(
            "API_VERSION_1_1".."VK_MAKE_API_VERSION(0, 1, 1, 0)"
        )

        IntConstant(
            "LUID_SIZE".."8",
            "QUEUE_FAMILY_EXTERNAL".."(~0-1)",
            "MAX_DEVICE_GROUP_SIZE".."32"
        )
    }

    VK12.apply {
        IntConstant(
            "API_VERSION_1_2".."VK_MAKE_API_VERSION(0, 1, 2, 0)"
        )

        IntConstant(
            "MAX_DRIVER_NAME_SIZE".."256",
            "MAX_DRIVER_INFO_SIZE".."256"
        )
    }

    VK13.apply {
        IntConstant(
            "API_VERSION_1_3".."VK_MAKE_API_VERSION(0, 1, 3, 0)"
        )
    }

    VK14.apply {
        IntConstant(
            "API_VERSION_1_4".."VK_MAKE_API_VERSION(0, 1, 4, 0)"
        )

        IntConstant(
            "MAX_GLOBAL_PRIORITY_SIZE".."16"
        )
    }

    NV_ray_tracing.apply {
        MultiType(PointerMapping.DATA_LONG)..this["GetAccelerationStructureHandleNV"].getParam("pData")
    }
}
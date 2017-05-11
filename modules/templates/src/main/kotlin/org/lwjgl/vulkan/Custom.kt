/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.vulkan

import org.lwjgl.generator.*
import org.lwjgl.vulkan.templates.*

val KHX = "KHX"

fun templateCustomization() {
    PFN_vkDebugReportCallbackEXT.signature.apply {
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

    VkShaderModuleCreateInfo.definition.apply {
        AutoSize("pCode")..this["codeSize"]
        PointerType("const uint32_t", PointerMapping.DATA_BYTE).member("pCode", "points to code that is used to create the shader module")
            .replace(this["pCode"])
    }

    VK10.apply {
        IntConstant(
            """
            The API version number for Vulkan 1.0.

            The patch version number in this macro will always be zero. The supported patch version for a physical device <b>can</b> be queried with
            #GetPhysicalDeviceProperties().
            """,

            "API_VERSION_1_0".."VK_MAKE_VERSION(1, 0, 0)"
        )

        LongConstant(
            """
            The reserved handle {@code VK_NULL_HANDLE} <b>can</b> be passed in place of valid object handles when explicitly called out in the specification. Any
            command that creates an object successfully <b>must</b> not return {@code VK_NULL_HANDLE}. It is valid to pass {@code VK_NULL_HANDLE} to any
            {@code vkDestroy*} or {@code vkFree*} command, which will silently ignore these values.
            """,

            "NULL_HANDLE"..0L
        )

        macro(expression = "(major << 22) | (minor << 12) | patch")..uint32_t(
            "VK_MAKE_VERSION",
            """
            Constructs an API version number.

            This macro <b>can</b> be used when constructing the ##VkApplicationInfo{@code ::pname:apiVersion} parameter passed to #CreateInstance().
            """,

            uint32_t.IN("major", "the major version number"),
            uint32_t.IN("minor", "the minor version number"),
            uint32_t.IN("patch", "the patch version number"),

            noPrefix = true
        )

        macro(expression = "version >> 22")..uint32_t(
            "VK_VERSION_MAJOR",
            "Extracts the API major version number from a packed version number.",

            uint32_t.IN("version", "the Vulkan API version"),

            noPrefix = true
        )

        macro(expression = "(version >> 12) & 0x3FF")..uint32_t(
            "VK_VERSION_MINOR",
            "Extracts the API minor version number from a packed version number.",

            uint32_t.IN("version", "the Vulkan API version"),

            noPrefix = true
        )

        macro(expression = "version & 0xFFF")..uint32_t(
            "VK_VERSION_PATCH",
            "Extracts the API patch version number from a packed version number.",

            uint32_t.IN("version", "the Vulkan API version"),

            noPrefix = true
        )

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

    VkDeviceGroupPresentCapabilitiesKHX.definition.apply {
        javaImport("static org.lwjgl.vulkan.KHXDeviceGroupCreation.*")
    }

    VkPhysicalDeviceGroupPropertiesKHX.definition.apply {
        javaImport("static org.lwjgl.vulkan.KHXDeviceGroupCreation.*")
    }

    VkPhysicalDeviceIDPropertiesKHX.definition.apply {
        javaImport(
            "static org.lwjgl.vulkan.VK10.*",
            "static org.lwjgl.vulkan.KHXExternalMemoryCapabilities.*"
        )
    }
}
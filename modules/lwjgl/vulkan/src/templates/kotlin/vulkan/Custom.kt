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

    VkShaderModuleCreateInfo.definition.apply {
        AutoSize("pCode")..this["codeSize"]
        PrimitiveType("uint32_t", PrimitiveMapping.BYTE).const.p("pCode", "points to code that is used to create the shader module")
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

        IntConstant(
            "The Vulkan registry version used to generate the LWJGL bindings.",
            "HEADER_VERSION".."107"
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

            uint32_t("major", "the major version number"),
            uint32_t("minor", "the minor version number"),
            uint32_t("patch", "the patch version number"),

            noPrefix = true
        )

        macro(expression = "version >> 22")..uint32_t(
            "VK_VERSION_MAJOR",
            "Extracts the API major version number from a packed version number.",

            uint32_t("version", "the Vulkan API version"),

            noPrefix = true
        )

        macro(expression = "(version >> 12) & 0x3FF")..uint32_t(
            "VK_VERSION_MINOR",
            "Extracts the API minor version number from a packed version number.",

            uint32_t("version", "the Vulkan API version"),

            noPrefix = true
        )

        macro(expression = "version & 0xFFF")..uint32_t(
            "VK_VERSION_PATCH",
            "Extracts the API patch version number from a packed version number.",

            uint32_t("version", "the Vulkan API version"),

            noPrefix = true
        )

        IntConstant(
            "API Constants",

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
            "API Constants",

            "LOD_CLAMP_NONE".."1000.0f"
        )

        LongConstant(
            "API Constants",

            "WHOLE_SIZE".."(~0L)"
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

    VK11.apply {
        documentation =
            """
            The core Vulkan 1.1 functionality.

            Vulkan Version 1.1 <em>promoted</em> a number of key extensions into the core API:

            ${ul(
                KHR_16bit_storage.link,
                KHR_bind_memory2.link,
                KHR_dedicated_allocation.link,
                KHR_descriptor_update_template.link,
                KHR_device_group.link,
                KHR_device_group_creation.link,
                KHR_external_memory.link,
                KHR_external_memory_capabilities.link,
                KHR_external_semaphore.link,
                KHR_external_semaphore_capabilities.link,
                KHR_external_fence.link,
                KHR_external_fence_capabilities.link,
                KHR_get_memory_requirements2.link,
                KHR_get_physical_device_properties2.link,
                KHR_maintenance1.link,
                KHR_maintenance2.link,
                KHR_maintenance3.link,
                KHR_multiview.link,
                KHR_relaxed_block_layout.link,
                KHR_sampler_ycbcr_conversion.link,
                KHR_shader_draw_parameters.link,
                KHR_storage_buffer_storage_class.link,
                KHR_variable_pointers.link
            )}

            The only changes to the functionality added by these extensions were to {@code VK_KHR_shader_draw_parameters}, which had a
            <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html\#features-features-shaderDrawParameters">feature bit</a>
            added to determine support in the core API, and
            <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html\#features-features-variablePointersStorageBuffer">{@code variablePointersStorageBuffer}</a>
            from {@code VK_KHR_variable_pointers} was made optional.

            Additionally, Vulkan 1.1 added support for {@link VkPhysicalDeviceSubgroupProperties subgroup operations},
            {@link VkPhysicalDeviceProtectedMemoryFeatures protected memory}, and a new command to {@link VK11\#vkEnumerateInstanceVersion enumerate the
            instance version}.
            """

        IntConstant(
            "The API version number for Vulkan 1.1.",
            "API_VERSION_1_1".."VK10.VK_MAKE_VERSION(1, 1, 0)"
        )

        IntConstant(
            "API Constants",

            "LUID_SIZE".."8",
            "QUEUE_FAMILY_EXTERNAL".."(~0-1)",
            "MAX_DEVICE_GROUP_SIZE".."32"
        )
    }

    VkDeviceGroupPresentCapabilitiesKHR.definition.apply {
        javaImport("static org.lwjgl.vulkan.VK11.*")
    }

    VkPhysicalDeviceGroupProperties.definition.apply {
        javaImport("static org.lwjgl.vulkan.VK11.*")
    }

    VkPhysicalDeviceIDProperties.definition.apply {
        javaImport("static org.lwjgl.vulkan.VK10.*")
        javaImport("static org.lwjgl.vulkan.VK11.*")
    }

    NV_ray_tracing.apply {
        MultiType(PointerMapping.DATA_LONG)..this["GetAccelerationStructureHandleNV"].getParam("pData")
    }
}
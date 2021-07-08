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
            "HEADER_VERSION".."172"
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

        macro(expression = "version >>> 22")..uint32_t(
            "VK_VERSION_MAJOR",
            "Extracts the API major version number from a packed version number.",

            uint32_t("version", "the Vulkan API version"),

            noPrefix = true
        )

        macro(expression = "(version >>> 12) & 0x3FF")..uint32_t(
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
            "LUID_SIZE".."8",
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
            "QUEUE_FAMILY_EXTERNAL".."(~0-1)",
            "SUBPASS_EXTERNAL".."(~0)",
            "MAX_DEVICE_GROUP_SIZE".."32",
            "MAX_DRIVER_NAME_SIZE".."256",
            "MAX_DRIVER_INFO_SIZE".."256"
        )

        FloatConstant(
            "API Constants",

            "LOD_CLAMP_NONE".."1000.0f"
        )

        LongConstant(
            "API Constants",

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
            <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-features-shaderDrawParameters">feature bit</a>
            added to determine support in the core API, and
            <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-features-variablePointersStorageBuffer">{@code variablePointersStorageBuffer}</a>
            from {@code VK_KHR_variable_pointers} was made optional.

            Additionally, Vulkan 1.1 added support for {@link VkPhysicalDeviceSubgroupProperties subgroup operations},
            {@link VkPhysicalDeviceProtectedMemoryFeatures protected memory}, and a new command to {@link VK11\#vkEnumerateInstanceVersion enumerate the
            instance version}.
            """

        IntConstant(
            "The API version number for Vulkan 1.1.",
            "API_VERSION_1_1".."VK_MAKE_VERSION(1, 1, 0)"
        )
    }

    VK12.apply {
        documentation =
            """
            The core Vulkan 1.2 functionality.

            Vulkan Version 1.2 <em>promoted</em> a number of key extensions into the core API:

            ${ul(
                KHR_8bit_storage.link,
                KHR_buffer_device_address.link,
                KHR_create_renderpass2.link,
                KHR_depth_stencil_resolve.link,
                KHR_draw_indirect_count.link,
                KHR_driver_properties.link,
                KHR_image_format_list.link,
                KHR_imageless_framebuffer.link,
                KHR_sampler_mirror_clamp_to_edge.link,
                KHR_separate_depth_stencil_layouts.link,
                KHR_shader_atomic_int64.link,
                KHR_shader_float16_int8.link,
                KHR_shader_float_controls.link,
                KHR_shader_subgroup_extended_types.link,
                KHR_spirv_1_4.link,
                KHR_timeline_semaphore.link,
                KHR_uniform_buffer_standard_layout.link,
                KHR_vulkan_memory_model.link,
                EXT_descriptor_indexing.link,
                EXT_host_query_reset.link,
                EXT_sampler_filter_minmax.link,
                EXT_scalar_block_layout.link,
                EXT_separate_stencil_usage.link,
                EXT_shader_viewport_index_layer.link
            )}

            All differences in behavior between these extensions and the corresponding Vulkan 1.2 functionality are summarized below.

            <h3>Differences relative to {@code VK_KHR_8bit_storage}</h3> 
            
            If the {@code VK_KHR_8bit_storage} extension is not supported, support for the SPIR-V {@code StorageBuffer8BitAccess} capability in shader modules
            is optional. Support for this feature is defined by ##VkPhysicalDeviceVulkan12Features{@code ::storageBuffer8BitAccess} when queried via
            #GetPhysicalDeviceFeatures2().
            
            <h3>Differences relative to {@code VK_KHR_draw_indirect_count}</h3>
            
            If the {@code VK_KHR_draw_indirect_count} extension is not supported, support for the entry points #CmdDrawIndirectCount() and
            #CmdDrawIndexedIndirectCount() is optional. Support for this feature is defined by ##VkPhysicalDeviceVulkan12Features{@code ::drawIndirectCount}
            when queried via #GetPhysicalDeviceFeatures2().
            
            <h3>Differences relative to {@code VK_KHR_sampler_mirror_clamp_to_edge}</h3> 
            
            If the {@code VK_KHR_sampler_mirror_clamp_to_edge} extension is not supported, support for the {@code VkSamplerAddressMode}
            #SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE is optional. Support for this feature is defined by
            ##VkPhysicalDeviceVulkan12Features{@code ::samplerMirrorClampToEdge} when queried via #GetPhysicalDeviceFeatures2().
            
            <h3>Differences relative to {@code VK_EXT_descriptor_indexing}</h3> 
            
            If the {@code VK_EXT_descriptor_indexing} extension is not supported, support for the {@code descriptorIndexing} feature is optional. Support for
            this feature is defined by ##VkPhysicalDeviceVulkan12Features{@code ::descriptorIndexing} when queried via #GetPhysicalDeviceFeatures2().
            
            <h3>Differences relative to {@code VK_EXT_scalar_block_layout}</h3>
            
            If the {@code VK_EXT_scalar_block_layout} extension is not supported, support for the {@code scalarBlockLayout} feature is optional. Support for
            this feature is defined by ##VkPhysicalDeviceVulkan12Features{@code ::scalarBlockLayout} when queried via #GetPhysicalDeviceFeatures2().
            
            <h3>Differences relative to {@code VK_EXT_shader_viewport_index_layer}</h3>
            
            If the {@code VK_EXT_shader_viewport_index_layer} extension is not supported, support for the {@code ShaderViewportIndexLayerEXT} SPIR-V capability
            is optional. Support for this feature is defined by ##VkPhysicalDeviceVulkan12Features{@code ::shaderOutputViewportIndex} and
            ##VkPhysicalDeviceVulkan12Features{@code ::shaderOutputLayer} when queried via #GetPhysicalDeviceFeatures2().
            
            <h3>Additional Vulkan 1.2 Feature Support</h3>
            
            In addition to the promoted extensions described above, Vulkan 1.2 added support for:
            ${ul(
                "SPIR-V version 1.4.",
                "SPIR-V version 1.5.",
                """
                The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-samplerMirrorClampToEdge">samplerMirrorClampToEdge</a>
                feature which indicates whether the implementation supports the #SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE sampler address mode.
                """,
                "The {@code ShaderNonUniform} capability in SPIR-V version 1.5.",
                """
                The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-shaderOutputViewportIndex">shaderOutputViewportIndex</a>
                feature which indicates that the
                <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#spirvenv-capabilities-table-shader-viewport-index">{@code ShaderViewportIndex}</a>
                capability can be used.
                """,
                """
                The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-shaderOutputLayer">shaderOutputLayer</a>
                feature which indicates that the
                <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#spirvenv-capabilities-table-shader-layer">{@code ShaderLayer}</a>
                capability can be used.
                """,
                """
                The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-subgroupBroadcastDynamicId">subgroupBroadcastDynamicId</a> 
                feature which allows the "{@code Id}" operand of {@code OpGroupNonUniformBroadcast} to be dynamically uniform within a subgroup, and the
                "{@code Index}" operand of {@code OpGroupNonUniformQuadBroadcast} to be dynamically uniform within a derivative group, in shader modules of
                version 1.5 or higher.
                """,
                """
                The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-drawIndirectCount">drawIndirectCount</a>
                feature which indicates whether the #CmdDrawIndirectCount() and #CmdDrawIndexedIndirectCount() functions can be used.
                """,
                """
                The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-descriptorIndexing">descriptorIndexing</a>
                feature which indicates the implementation supports the minimum number of descriptor indexing features as defined in the
                <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-requirements">Feature Requirements</a>
                section.
                """,
                """
                The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-samplerFilterMinmax">samplerFilterMinmax</a>
                feature which indicates whether the implementation supports the minimum number of image formats that support the
                #FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_MINMAX_BIT feature bit as defined by the
                <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#limits-filterMinmaxSingleComponentFormats-minimum-requirements">{@code filterMinmaxSingleComponentFormats}</a>
                property minimum requirements.
                """,
                """
                The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#limits-framebufferIntegerColorSampleCounts">framebufferIntegerColorSampleCounts</a>
                limit which indicates the color sample counts that are supported for all framebuffer color attachments with integer formats.
                """
            )}
            """

        IntConstant(
            "The API version number for Vulkan 1.2.",
            "API_VERSION_1_2".."VK_MAKE_VERSION(1, 2, 0)"
        )
    }

    NV_ray_tracing.apply {
        MultiType(PointerMapping.DATA_LONG)..this["GetAccelerationStructureHandleNV"].getParam("pData")
    }

    val VkAccelerationStructureInstanceKHR = VkAccelerationStructureInstanceKHR.definition

    VkAccelerationStructureInstanceKHR["instanceCustomIndex"]
        .getter("nbitfield0(struct) & 0x00_FF_FFFF")
        .setter("nbitfield0(struct, (nbitfield0(struct) & 0xFF_00_0000) | (value & 0x00_FF_FFFF))")
    VkAccelerationStructureInstanceKHR["mask"]
        .getter("nbitfield0(struct) >>> 24")
        .setter("nbitfield0(struct, (value << 24) | (nbitfield0(struct) & 0x00_FF_FFFF))")

    VkAccelerationStructureInstanceKHR["instanceShaderBindingTableRecordOffset"]
        .getter("nbitfield1(struct) & 0x00_FF_FFFF")
        .setter("nbitfield1(struct, (nbitfield1(struct) & 0xFF_00_0000) | (value & 0x00_FF_FFFF))")
    VkAccelerationStructureInstanceKHR["flags"]
        .getter("nbitfield1(struct) >>> 24")
        .setter("nbitfield1(struct, (value << 24) | (nbitfield1(struct) & 0x00_FF_FFFF))")

    val VkAccelerationStructureInstanceNV = VkAccelerationStructureInstanceNV.definition

    VkAccelerationStructureInstanceNV["instanceCustomIndex"].copyAccessors(VkAccelerationStructureInstanceKHR["instanceCustomIndex"])
    VkAccelerationStructureInstanceNV["mask"].copyAccessors(VkAccelerationStructureInstanceKHR["mask"])
    VkAccelerationStructureInstanceNV["instanceShaderBindingTableRecordOffset"].copyAccessors(VkAccelerationStructureInstanceKHR["instanceShaderBindingTableRecordOffset"])
    VkAccelerationStructureInstanceNV["flags"].copyAccessors(VkAccelerationStructureInstanceKHR["flags"])
}
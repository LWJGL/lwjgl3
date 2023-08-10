/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_shader_module_identifier = "EXTShaderModuleIdentifier".nativeClassVK("EXT_shader_module_identifier", type = "device", postfix = "EXT") {
    documentation =
        """
        Some applications generate SPIR-V code at runtime. When pipeline caches are primed, either explicitly through e.g. {@code VkPipelineCache} mechanisms, or implicitly through driver managed caches, having to re-generate SPIR-V modules is redundant. SPIR-V modules could be cached on disk by an application, but the extra disk size requirement might be prohibitive in some use cases.

        This extension adds the ability for an application to query a small identifier associated with a {@code VkShaderModule}. On subsequent runs of the application, the same identifier <b>can</b> be provided in lieu of a {@code VkShaderModule} object. A pipeline creation call with such a module <b>may</b> succeed if a pipeline could be created without invoking compilation, and information inside the SPIR-V module is not required by the implementation.

        #PIPELINE_CREATE_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT <b>must</b> be used if only the identifier is provided, and this use case is intended to work like a non-blocking, speculative compile. Applications <b>can</b> fallback as necessary.

        The main motivation for identifying the module itself and not the entire pipeline is that pipeline identifiers change when a driver is updated, but module identifiers are expected to be stable for any particular driver implementation. This approach is helpful for shader pre-compilation systems which can prime pipeline caches ahead of time. When on-disk pipeline caches are updated, the same shader identifiers could lead to a pipeline cache hit.

        <h5>VK_EXT_shader_module_identifier</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_shader_module_identifier}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>463</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2} and {@link EXTPipelineCreationCacheControl VK_EXT_pipeline_creation_cache_control}</dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Hans-Kristian Arntzen <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_shader_module_identifier]%20@HansKristian-Work%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_shader_module_identifier%20extension*">HansKristian-Work</a></li>
            </ul></dd>

            <dt><b>Extension Proposal</b></dt>
            <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_EXT_shader_module_identifier.adoc">VK_EXT_shader_module_identifier</a></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2022-05-16</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Hans-Kristian Arntzen, Valve</li>
                <li>Ricardo Garcia, Igalia</li>
                <li>Piers Daniell, NVIDIA</li>
                <li>Jan-Harald Fredriksen, Arm</li>
                <li>Tom Olson, Arm</li>
                <li>Faith Ekstrand, Collabora</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_SHADER_MODULE_IDENTIFIER_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_SHADER_MODULE_IDENTIFIER_EXTENSION_NAME".."VK_EXT_shader_module_identifier"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MODULE_IDENTIFIER_FEATURES_EXT".."1000462000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MODULE_IDENTIFIER_PROPERTIES_EXT".."1000462001",
        "STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_MODULE_IDENTIFIER_CREATE_INFO_EXT".."1000462002",
        "STRUCTURE_TYPE_SHADER_MODULE_IDENTIFIER_EXT".."1000462003"
    )

    EnumConstant(
        "VK_MAX_SHADER_MODULE_IDENTIFIER_SIZE_EXT",

        "MAX_SHADER_MODULE_IDENTIFIER_SIZE_EXT".."32"
    )

    void(
        "GetShaderModuleIdentifierEXT",
        """
        Query a unique identifier for a shader module.

        <h5>C Specification</h5>
        Shader modules have unique identifiers associated with them. To query an implementation provided identifier, call:

        <pre><code>
￿void vkGetShaderModuleIdentifierEXT(
￿    VkDevice                                    device,
￿    VkShaderModule                              shaderModule,
￿    VkShaderModuleIdentifierEXT*                pIdentifier);</code></pre>

        <h5>Description</h5>
        The identifier returned by the implementation <b>must</b> only depend on {@code shaderIdentifierAlgorithmUUID} and information provided in the ##VkShaderModuleCreateInfo which created {@code shaderModule}. The implementation <b>may</b> return equal identifiers for two different ##VkShaderModuleCreateInfo structures if the difference does not affect pipeline compilation. Identifiers are only meaningful on different {@code VkDevice} objects if the device the identifier was queried from had the same <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-shaderModuleIdentifierAlgorithmUUID">{@code shaderModuleIdentifierAlgorithmUUID}</a> as the device consuming the identifier.

        <h5>Valid Usage</h5>
        <ul>
            <li><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shaderModuleIdentifier">{@code shaderModuleIdentifier}</a> feature <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code shaderModule} <b>must</b> be a valid {@code VkShaderModule} handle</li>
            <li>{@code pIdentifier} <b>must</b> be a valid pointer to a ##VkShaderModuleIdentifierEXT structure</li>
            <li>{@code shaderModule} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>See Also</h5>
        ##VkShaderModuleIdentifierEXT
        """,

        VkDevice("device", "the logical device that created the shader module."),
        VkShaderModule("shaderModule", "the handle of the shader module."),
        VkShaderModuleIdentifierEXT.p("pIdentifier", "a pointer to the returned ##VkShaderModuleIdentifierEXT.")
    )

    void(
        "GetShaderModuleCreateInfoIdentifierEXT",
        """
        Query a unique identifier for a shader module create info.

        <h5>C Specification</h5>
        ##VkShaderModuleCreateInfo structures have unique identifiers associated with them. To query an implementation provided identifier, call:

        <pre><code>
￿void vkGetShaderModuleCreateInfoIdentifierEXT(
￿    VkDevice                                    device,
￿    const VkShaderModuleCreateInfo*             pCreateInfo,
￿    VkShaderModuleIdentifierEXT*                pIdentifier);</code></pre>

        <h5>Description</h5>
        The identifier returned by implementation <b>must</b> only depend on {@code shaderIdentifierAlgorithmUUID} and information provided in the ##VkShaderModuleCreateInfo. The implementation <b>may</b> return equal identifiers for two different ##VkShaderModuleCreateInfo structures if the difference does not affect pipeline compilation. Identifiers are only meaningful on different {@code VkDevice} objects if the device the identifier was queried from had the same <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-shaderModuleIdentifierAlgorithmUUID">{@code shaderModuleIdentifierAlgorithmUUID}</a> as the device consuming the identifier.

        The identifier returned by the implementation in #GetShaderModuleCreateInfoIdentifierEXT() <b>must</b> be equal to the identifier returned by #GetShaderModuleIdentifierEXT() given equivalent definitions of ##VkShaderModuleCreateInfo and any chained {@code pNext} structures.

        <h5>Valid Usage</h5>
        <ul>
            <li><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shaderModuleIdentifier">{@code shaderModuleIdentifier}</a> feature <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid ##VkShaderModuleCreateInfo structure</li>
            <li>{@code pIdentifier} <b>must</b> be a valid pointer to a ##VkShaderModuleIdentifierEXT structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkShaderModuleCreateInfo, ##VkShaderModuleIdentifierEXT
        """,

        VkDevice("device", "the logical device that <b>can</b> create a {@code VkShaderModule} from {@code pCreateInfo}."),
        VkShaderModuleCreateInfo.const.p("pCreateInfo", "a pointer to a ##VkShaderModuleCreateInfo structure."),
        VkShaderModuleIdentifierEXT.p("pIdentifier", "a pointer to the returned ##VkShaderModuleIdentifierEXT.")
    )
}
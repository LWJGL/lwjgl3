/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_vertex_input_dynamic_state = "EXTVertexInputDynamicState".nativeClassVK("EXT_vertex_input_dynamic_state", type = "device", postfix = "EXT") {
    documentation =
        """
        One of the states that contributes to the combinatorial explosion of pipeline state objects that need to be created, is the vertex input binding and attribute descriptions. By allowing them to be dynamic applications may reduce the number of pipeline objects they need to create.

        This extension adds dynamic state support for what is normally static state in ##VkPipelineVertexInputStateCreateInfo.

        <h5>VK_EXT_vertex_input_dynamic_state</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_vertex_input_dynamic_state}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>353</dd>

            <dt><b>Revision</b></dt>
            <dd>2</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Piers Daniell <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_vertex_input_dynamic_state]%20@pdaniell-nv%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_vertex_input_dynamic_state%20extension%3E%3E">pdaniell-nv</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2020-08-21</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Spencer Fricke, Samsung</li>
                <li>Stu Smith, AMD</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_VERTEX_INPUT_DYNAMIC_STATE_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "EXT_VERTEX_INPUT_DYNAMIC_STATE_EXTENSION_NAME".."VK_EXT_vertex_input_dynamic_state"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_INPUT_DYNAMIC_STATE_FEATURES_EXT".."1000352000",
        "STRUCTURE_TYPE_VERTEX_INPUT_BINDING_DESCRIPTION_2_EXT".."1000352001",
        "STRUCTURE_TYPE_VERTEX_INPUT_ATTRIBUTE_DESCRIPTION_2_EXT".."1000352002"
    )

    EnumConstant(
        "Extends {@code VkDynamicState}.",

        "DYNAMIC_STATE_VERTEX_INPUT_EXT".."1000352000"
    )

    void(
        "CmdSetVertexInputEXT",
        """
        Set the vertex input state dynamically for a command buffer.

        <h5>C Specification</h5>
        To <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically set</a> the vertex input attribute and vertex input binding descriptions, call:

        <pre><code>
￿void vkCmdSetVertexInputEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    vertexBindingDescriptionCount,
￿    const VkVertexInputBindingDescription2EXT*  pVertexBindingDescriptions,
￿    uint32_t                                    vertexAttributeDescriptionCount,
￿    const VkVertexInputAttributeDescription2EXT* pVertexAttributeDescriptions);</code></pre>

        <h5>Description</h5>
        This command sets the vertex input attribute and vertex input binding descriptions state for subsequent drawing commands when the graphics pipeline is created with #DYNAMIC_STATE_VERTEX_INPUT_EXT set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the ##VkGraphicsPipelineCreateInfo{@code ::pVertexInputState} values used to create the currently active pipeline.

        If the bound pipeline state object was also created with the #DYNAMIC_STATE_VERTEX_INPUT_BINDING_STRIDE dynamic state enabled, then #CmdBindVertexBuffers2() can be used instead of {@code vkCmdSetVertexInputEXT} to dynamically set the stride.

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-vertexInputDynamicState">vertexInputDynamicState</a> feature <b>must</b> be enabled</li>
            <li>{@code vertexBindingDescriptionCount} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxVertexInputBindings}</li>
            <li>{@code vertexAttributeDescriptionCount} <b>must</b> be less than or equal to ##VkPhysicalDeviceLimits{@code ::maxVertexInputAttributes}</li>
            <li>For every {@code binding} specified by each element of {@code pVertexAttributeDescriptions}, a ##VkVertexInputBindingDescription2EXT <b>must</b> exist in {@code pVertexBindingDescriptions} with the same value of {@code binding}</li>
            <li>All elements of {@code pVertexBindingDescriptions} <b>must</b> describe distinct binding numbers</li>
            <li>All elements of {@code pVertexAttributeDescriptions} <b>must</b> describe distinct attribute locations</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>If {@code vertexBindingDescriptionCount} is not 0, {@code pVertexBindingDescriptions} <b>must</b> be a valid pointer to an array of {@code vertexBindingDescriptionCount} valid ##VkVertexInputBindingDescription2EXT structures</li>
            <li>If {@code vertexAttributeDescriptionCount} is not 0, {@code pVertexAttributeDescriptions} <b>must</b> be a valid pointer to an array of {@code vertexAttributeDescriptionCount} valid ##VkVertexInputAttributeDescription2EXT structures</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkVertexInputAttributeDescription2EXT, ##VkVertexInputBindingDescription2EXT
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        AutoSize("pVertexBindingDescriptions")..uint32_t("vertexBindingDescriptionCount", "the number of vertex binding descriptions provided in {@code pVertexBindingDescriptions}."),
        nullable..VkVertexInputBindingDescription2EXT.const.p("pVertexBindingDescriptions", "a pointer to an array of ##VkVertexInputBindingDescription2EXT structures."),
        AutoSize("pVertexAttributeDescriptions")..uint32_t("vertexAttributeDescriptionCount", "the number of vertex attribute descriptions provided in {@code pVertexAttributeDescriptions}."),
        nullable..VkVertexInputAttributeDescription2EXT.const.p("pVertexAttributeDescriptions", "a pointer to an array of ##VkVertexInputAttributeDescription2EXT structures.")
    )
}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_extended_dynamic_state2 = "EXTExtendedDynamicState2".nativeClassVK("EXT_extended_dynamic_state2", type = "device", postfix = "EXT") {
    documentation =
        """
        This extension adds some more dynamic state to support applications that need to reduce the number of pipeline state objects they compile and bind.

        <h5>Promotion to Vulkan 1.3</h5>
        This extension has been partially promoted. The dynamic state enumerants #DYNAMIC_STATE_DEPTH_BIAS_ENABLE_EXT, #DYNAMIC_STATE_PRIMITIVE_RESTART_ENABLE_EXT, and #DYNAMIC_STATE_RASTERIZER_DISCARD_ENABLE_EXT; and the corresponding entry points in this extension are included in core Vulkan 1.3, with the EXT suffix omitted. The enumerants and entry points for dynamic logic operation and patch control points are not promoted, nor is the feature structure. Extension interfaces that were promoted remain available as aliases of the core functionality.

        <h5>VK_EXT_extended_dynamic_state2</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_extended_dynamic_state2}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>378</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2} or <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#versions-1.1">Version 1.1</a></dd>

            <dt><b>Deprecation state</b></dt>
            <dd><ul>
                <li><em>Promoted</em> to <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#versions-1.3-promotions">Vulkan 1.3</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Vikram Kushwaha <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_extended_dynamic_state2]%20@vkushwaha-nv%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_extended_dynamic_state2%20extension*">vkushwaha-nv</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2021-04-12</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>Promoted to Vulkan 1.3 Core</li>
            </ul></dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Vikram Kushwaha, NVIDIA</li>
                <li>Piers Daniell, NVIDIA</li>
                <li>Jeff Bolz, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_EXTENDED_DYNAMIC_STATE_2_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_EXTENDED_DYNAMIC_STATE_2_EXTENSION_NAME".."VK_EXT_extended_dynamic_state2"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_2_FEATURES_EXT".."1000377000"
    )

    EnumConstant(
        "Extends {@code VkDynamicState}.",

        "DYNAMIC_STATE_PATCH_CONTROL_POINTS_EXT".."1000377000",
        "DYNAMIC_STATE_RASTERIZER_DISCARD_ENABLE_EXT".."1000377001",
        "DYNAMIC_STATE_DEPTH_BIAS_ENABLE_EXT".."1000377002",
        "DYNAMIC_STATE_LOGIC_OP_EXT".."1000377003",
        "DYNAMIC_STATE_PRIMITIVE_RESTART_ENABLE_EXT".."1000377004"
    )

    void(
        "CmdSetPatchControlPointsEXT",
        """
        Specify the number of control points per patch dynamically for a command buffer.

        <h5>C Specification</h5>
        To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically set</a> the number of control points per patch, call:

        <pre><code>
￿void vkCmdSetPatchControlPointsEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    patchControlPoints);</code></pre>

        <h5>Description</h5>
        This command sets the number of control points per patch for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-objects">shader objects</a>, or when the graphics pipeline is created with #DYNAMIC_STATE_PATCH_CONTROL_POINTS_EXT set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the ##VkPipelineTessellationStateCreateInfo{@code ::patchControlPoints} value used to create the currently active pipeline.

        <h5>Valid Usage</h5>
        <ul>
            <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-extendedDynamicState2PatchControlPoints">{@code extendedDynamicState2PatchControlPoints}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
            <li>{@code patchControlPoints} <b>must</b> be greater than zero and less than or equal to ##VkPhysicalDeviceLimits{@code ::maxTessellationPatchSize}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        uint32_t("patchControlPoints", "specifies the number of control points per patch.")
    )

    void(
        "CmdSetRasterizerDiscardEnableEXT",
        "See #CmdSetRasterizerDiscardEnable().",

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkBool32("rasterizerDiscardEnable", "controls whether primitives are discarded immediately before the rasterization stage.")
    )

    void(
        "CmdSetDepthBiasEnableEXT",
        "See #CmdSetDepthBiasEnable().",

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkBool32("depthBiasEnable", "controls whether to bias fragment depth values.")
    )

    void(
        "CmdSetLogicOpEXT",
        """
        Select which logical operation to apply for blend state dynamically for a command buffer.

        <h5>C Specification</h5>
        To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically set</a> the logical operation to apply for blend state, call:

        <pre><code>
￿void vkCmdSetLogicOpEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    VkLogicOp                                   logicOp);</code></pre>

        <h5>Description</h5>
        This command sets the logical operation for blend state for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-objects">shader objects</a>, or when the graphics pipeline is created with #DYNAMIC_STATE_LOGIC_OP_EXT set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the ##VkPipelineColorBlendStateCreateInfo{@code ::logicOp} value used to create the currently active pipeline.

        <h5>Valid Usage</h5>
        <ul>
            <li>Either the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-extendedDynamicState2LogicOp">{@code extendedDynamicState2LogicOp}</a> feature or the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-shaderObject">{@code shaderObject}</a> feature or both <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code logicOp} <b>must</b> be a valid {@code VkLogicOp} value</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkLogicOp("logicOp", "specifies the logical operation to apply for blend state.")
    )

    void(
        "CmdSetPrimitiveRestartEnableEXT",
        "See #CmdSetPrimitiveRestartEnable().",

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkBool32("primitiveRestartEnable", "controls whether a special vertex index value is treated as restarting the assembly of primitives. It behaves in the same way as ##VkPipelineInputAssemblyStateCreateInfo{@code ::primitiveRestartEnable}")
    )
}
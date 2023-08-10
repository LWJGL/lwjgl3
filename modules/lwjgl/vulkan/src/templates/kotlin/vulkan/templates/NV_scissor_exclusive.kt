/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_scissor_exclusive = "NVScissorExclusive".nativeClassVK("NV_scissor_exclusive", type = "device", postfix = "NV") {
    documentation =
        """
        This extension adds support for an exclusive scissor test to Vulkan. The exclusive scissor test behaves like the scissor test, except that the exclusive scissor test fails for pixels inside the corresponding rectangle and passes for pixels outside the rectangle. If the same rectangle is used for both the scissor and exclusive scissor tests, the exclusive scissor test will pass if and only if the scissor test fails.

        Version 2 of this extension introduces #DYNAMIC_STATE_EXCLUSIVE_SCISSOR_ENABLE_NV and #CmdSetExclusiveScissorEnableNV(). Applications that use this dynamic state must ensure the implementation advertises at least {@code specVersion} 2 of this extension.

        <h5>VK_NV_scissor_exclusive</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_NV_scissor_exclusive}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>206</dd>

            <dt><b>Revision</b></dt>
            <dd>2</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Pat Brown <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NV_scissor_exclusive]%20@nvpbrown%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NV_scissor_exclusive%20extension*">nvpbrown</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2023-01-18</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd>None</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Pat Brown, NVIDIA</li>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Piers Daniell, NVIDIA</li>
                <li>Daniel Koch, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "NV_SCISSOR_EXCLUSIVE_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "NV_SCISSOR_EXCLUSIVE_EXTENSION_NAME".."VK_NV_scissor_exclusive"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PIPELINE_VIEWPORT_EXCLUSIVE_SCISSOR_STATE_CREATE_INFO_NV".."1000205000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_EXCLUSIVE_SCISSOR_FEATURES_NV".."1000205002"
    )

    EnumConstant(
        "Extends {@code VkDynamicState}.",

        "DYNAMIC_STATE_EXCLUSIVE_SCISSOR_ENABLE_NV".."1000205000",
        "DYNAMIC_STATE_EXCLUSIVE_SCISSOR_NV".."1000205001"
    )

    void(
        "CmdSetExclusiveScissorEnableNV",
        """
        Dynamically enable each exclusive scissor for a command buffer.

        <h5>C Specification</h5>
        To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically set</a> whether an exclusive scissor is enabled or not, call:

        <pre><code>
￿void vkCmdSetExclusiveScissorEnableNV(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    firstExclusiveScissor,
￿    uint32_t                                    exclusiveScissorCount,
￿    const VkBool32*                             pExclusiveScissorEnables);</code></pre>

        <h5>Description</h5>
        The exclusive scissor enables taken from element <code>i</code> of {@code pExclusiveScissorEnables} replace the current state for the scissor index <code>firstExclusiveScissor + i</code>, for <code>i</code> in <code>[0, exclusiveScissorCount)</code>.

        This command sets the exclusive scissor enable for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-objects">shader objects</a>, or when the graphics pipeline is created with #DYNAMIC_STATE_EXCLUSIVE_SCISSOR_ENABLE_NV set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is implied by the ##VkPipelineViewportExclusiveScissorStateCreateInfoNV{@code ::exclusiveScissorCount} value used to create the currently active pipeline, where all {@code exclusiveScissorCount} exclusive scissors are implicitly enabled and the remainder up to ##VkPhysicalDeviceLimits{@code ::maxViewports} are implicitly disabled.

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-exclusiveScissor">{@code exclusiveScissor}</a> feature <b>must</b> be enabled, and the implementation <b>must</b> support at least {@code specVersion} 2 of the {@link NVScissorExclusive VK_NV_scissor_exclusive} extension</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pExclusiveScissorEnables} <b>must</b> be a valid pointer to an array of {@code exclusiveScissorCount} {@code VkBool32} values</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
            <li>{@code exclusiveScissorCount} <b>must</b> be greater than 0</li>
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
        uint32_t("firstExclusiveScissor", "the index of the first exclusive scissor rectangle whose state is updated by the command."),
        AutoSize("pExclusiveScissorEnables")..uint32_t("exclusiveScissorCount", "the number of exclusive scissor rectangles updated by the command."),
        VkBool32.const.p("pExclusiveScissorEnables", "a pointer to an array of {@code VkBool32} values defining whether the exclusive scissor is enabled.")
    )

    void(
        "CmdSetExclusiveScissorNV",
        """
        Set exclusive scissor rectangles dynamically for a command buffer.

        <h5>C Specification</h5>
        To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically set</a> the exclusive scissor rectangles, call:

        <pre><code>
￿void vkCmdSetExclusiveScissorNV(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    firstExclusiveScissor,
￿    uint32_t                                    exclusiveScissorCount,
￿    const VkRect2D*                             pExclusiveScissors);</code></pre>

        <h5>Description</h5>
        The scissor rectangles taken from element <code>i</code> of {@code pExclusiveScissors} replace the current state for the scissor index <code>firstExclusiveScissor + i</code>, for <code>i</code> in <code>[0, exclusiveScissorCount)</code>.

        This command sets the exclusive scissor rectangles for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-objects">shader objects</a>, or when the graphics pipeline is created with #DYNAMIC_STATE_EXCLUSIVE_SCISSOR_NV set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the ##VkPipelineViewportExclusiveScissorStateCreateInfoNV{@code ::pExclusiveScissors} values used to create the currently active pipeline.

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-exclusiveScissor">{@code exclusiveScissor}</a> feature <b>must</b> be enabled</li>
            <li>The sum of {@code firstExclusiveScissor} and {@code exclusiveScissorCount} <b>must</b> be between 1 and ##VkPhysicalDeviceLimits{@code ::maxViewports}, inclusive</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-multiViewport">{@code multiViewport}</a> feature is not enabled, {@code firstExclusiveScissor} <b>must</b> be 0</li>
            <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-multiViewport">{@code multiViewport}</a> feature is not enabled, {@code exclusiveScissorCount} <b>must</b> be 1</li>
            <li>The {@code x} and {@code y} members of {@code offset} in each member of {@code pExclusiveScissors} <b>must</b> be greater than or equal to 0</li>
            <li>Evaluation of <code>(offset.x + extent.width)</code> for each member of {@code pExclusiveScissors} <b>must</b> not cause a signed integer addition overflow</li>
            <li>Evaluation of <code>(offset.y + extent.height)</code> for each member of {@code pExclusiveScissors} <b>must</b> not cause a signed integer addition overflow</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pExclusiveScissors} <b>must</b> be a valid pointer to an array of {@code exclusiveScissorCount} ##VkRect2D structures</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
            <li>{@code exclusiveScissorCount} <b>must</b> be greater than 0</li>
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

        <h5>See Also</h5>
        ##VkRect2D
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        uint32_t("firstExclusiveScissor", "the index of the first exclusive scissor rectangle whose state is updated by the command."),
        AutoSize("pExclusiveScissors")..uint32_t("exclusiveScissorCount", "the number of exclusive scissor rectangles updated by the command."),
        VkRect2D.const.p("pExclusiveScissors", "a pointer to an array of ##VkRect2D structures defining exclusive scissor rectangles.")
    )
}
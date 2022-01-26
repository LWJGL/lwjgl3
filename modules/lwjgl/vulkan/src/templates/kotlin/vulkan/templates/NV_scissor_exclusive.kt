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

        <h5>VK_NV_scissor_exclusive</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_NV_scissor_exclusive}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>206</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Pat Brown <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NV_scissor_exclusive]%20@nvpbrown%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NV_scissor_exclusive%20extension%3E%3E">nvpbrown</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2018-07-31</dd>

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

        "NV_SCISSOR_EXCLUSIVE_SPEC_VERSION".."1"
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

        "DYNAMIC_STATE_EXCLUSIVE_SCISSOR_NV".."1000205001"
    )

    void(
        "CmdSetExclusiveScissorNV",
        """
        Set exclusive scissor rectangles dynamically for a command buffer.

        <h5>C Specification</h5>
        To <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically set</a> the exclusive scissor rectangles, call:

        <pre><code>
￿void vkCmdSetExclusiveScissorNV(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    firstExclusiveScissor,
￿    uint32_t                                    exclusiveScissorCount,
￿    const VkRect2D*                             pExclusiveScissors);</code></pre>

        <h5>Description</h5>
        The scissor rectangles taken from element <code>i</code> of {@code pExclusiveScissors} replace the current state for the scissor index <code>firstExclusiveScissor + i</code>, for <code>i</code> in <code>[0, exclusiveScissorCount)</code>.

        This command sets the exclusive scissor rectangles for subsequent drawing commands when the graphics pipeline is created with #DYNAMIC_STATE_EXCLUSIVE_SCISSOR_NV set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the ##VkPipelineViewportExclusiveScissorStateCreateInfoNV{@code ::pExclusiveScissors} values used to create the currently active pipeline.

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-exclusiveScissor">exclusive scissor</a> feature <b>must</b> be enabled</li>
            <li>The sum of {@code firstExclusiveScissor} and {@code exclusiveScissorCount} <b>must</b> be between 1 and ##VkPhysicalDeviceLimits{@code ::maxViewports}, inclusive</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-multiViewport">multiple viewports</a> feature is not enabled, {@code firstExclusiveScissor} <b>must</b> be 0</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-multiViewport">multiple viewports</a> feature is not enabled, {@code exclusiveScissorCount} <b>must</b> be 1</li>
            <li>The {@code x} and {@code y} members of {@code offset} in each member of {@code pExclusiveScissors} <b>must</b> be greater than or equal to 0</li>
            <li>Evaluation of <code>(offset.x + extent.width)</code> for each member of {@code pExclusiveScissors} <b>must</b> not cause a signed integer addition overflow</li>
            <li>Evaluation of <code>(offset.y + extent.height)</code> for each member of {@code pExclusiveScissors} <b>must</b> not cause a signed integer addition overflow</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pExclusiveScissors} <b>must</b> be a valid pointer to an array of {@code exclusiveScissorCount} ##VkRect2D structures</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>{@code exclusiveScissorCount} <b>must</b> be greater than 0</li>
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
        ##VkRect2D
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        uint32_t("firstExclusiveScissor", "the index of the first exclusive scissor rectangle whose state is updated by the command."),
        AutoSize("pExclusiveScissors")..uint32_t("exclusiveScissorCount", "the number of exclusive scissor rectangles updated by the command."),
        VkRect2D.const.p("pExclusiveScissors", "a pointer to an array of ##VkRect2D structures defining exclusive scissor rectangles.")
    )
}
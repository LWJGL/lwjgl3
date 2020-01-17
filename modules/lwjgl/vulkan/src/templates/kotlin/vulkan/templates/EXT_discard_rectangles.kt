/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_discard_rectangles = "EXTDiscardRectangles".nativeClassVK("EXT_discard_rectangles", type = "device", postfix = EXT) {
    documentation =
        """
        This extension provides additional orthogonally aligned "{@code discard rectangles}" specified in framebuffer-space coordinates that restrict rasterization of all points, lines and triangles.

        From zero to an implementation-dependent limit (specified by {@code maxDiscardRectangles}) number of discard rectangles can be operational at once. When one or more discard rectangles are active, rasterized fragments can either survive if the fragment is within any of the operational discard rectangles (#DISCARD_RECTANGLE_MODE_INCLUSIVE_EXT mode) or be rejected if the fragment is within any of the operational discard rectangles (#DISCARD_RECTANGLE_MODE_EXCLUSIVE_EXT mode).

        These discard rectangles operate orthogonally to the existing scissor test functionality. The discard rectangles can be different for each physical device in a device group by specifying the device mask and setting discard rectangle dynamic state.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_discard_rectangles}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>100</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Piers Daniell <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_EXT_discard_rectangles:%20&amp;body=@pdaniell-nv%20">pdaniell-nv</a></li>
            </ul></dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2016-12-22</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>Interacts with {@link KHRDeviceGroup VK_KHR_device_group}</li>
                <li>Interacts with Vulkan 1.1</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Daniel Koch, NVIDIA</li>
                <li>Jeff Bolz, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_DISCARD_RECTANGLES_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_DISCARD_RECTANGLES_EXTENSION_NAME".."VK_EXT_discard_rectangles"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DISCARD_RECTANGLE_PROPERTIES_EXT".."1000099000",
        "STRUCTURE_TYPE_PIPELINE_DISCARD_RECTANGLE_STATE_CREATE_INFO_EXT".."1000099001"
    )

    EnumConstant(
        "Extends {@code VkDynamicState}.",

        "DYNAMIC_STATE_DISCARD_RECTANGLE_EXT".."1000099000"
    )

    EnumConstant(
        """
        VkDiscardRectangleModeEXT - Specify the discard rectangle mode

        <h5>Description</h5>
        <ul>
            <li>#DISCARD_RECTANGLE_MODE_INCLUSIVE_EXT specifies that a fragment within any discard rectangle satisfies the test.</li>
            <li>#DISCARD_RECTANGLE_MODE_EXCLUSIVE_EXT specifies that a fragment not within any of the discard rectangles satisfies the test.</li>
        </ul>

        <h5>See Also</h5>
        ##VkPipelineDiscardRectangleStateCreateInfoEXT
        """,

        "DISCARD_RECTANGLE_MODE_INCLUSIVE_EXT".."0",
        "DISCARD_RECTANGLE_MODE_EXCLUSIVE_EXT".."1"
    )

    void(
        "CmdSetDiscardRectangleEXT",
        """
        Set discard rectangles dynamically.

        <h5>C Specification</h5>
        If the pipeline state object was created with the #DYNAMIC_STATE_DISCARD_RECTANGLE_EXT dynamic state enabled, the discard rectangles are dynamically set and changed with the command:

        <pre><code>
￿void vkCmdSetDiscardRectangleEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    firstDiscardRectangle,
￿    uint32_t                                    discardRectangleCount,
￿    const VkRect2D*                             pDiscardRectangles);</code></pre>

        <h5>Description</h5>
        The discard rectangle taken from element <code>i</code> of {@code pDiscardRectangles} replace the current state for the discard rectangle index <code>firstDiscardRectangle + i</code>, for <code>i</code> in <code>[0, discardRectangleCount)</code>.

        <h5>Valid Usage</h5>
        <ul>
            <li>The bound graphics pipeline <b>must</b> have been created with the #DYNAMIC_STATE_DISCARD_RECTANGLE_EXT dynamic state enabled</li>
            <li>The sum of {@code firstDiscardRectangle} and {@code discardRectangleCount} <b>must</b> be less than or equal to ##VkPhysicalDeviceDiscardRectanglePropertiesEXT{@code ::maxDiscardRectangles}</li>
            <li>The {@code x} and {@code y} member of {@code offset} in each ##VkRect2D element of {@code pDiscardRectangles} <b>must</b> be greater than or equal to 0</li>
            <li>Evaluation of <code>(offset.x + extent.width)</code> in each ##VkRect2D element of {@code pDiscardRectangles} <b>must</b> not cause a signed integer addition overflow</li>
            <li>Evaluation of <code>(offset.y + extent.height)</code> in each ##VkRect2D element of {@code pDiscardRectangles} <b>must</b> not cause a signed integer addition overflow</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pDiscardRectangles} <b>must</b> be a valid pointer to an array of {@code discardRectangleCount} ##VkRect2D structures</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>{@code discardRectangleCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td><td></td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkRect2D
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        uint32_t("firstDiscardRectangle", "the index of the first discard rectangle whose state is updated by the command."),
        AutoSize("pDiscardRectangles")..uint32_t("discardRectangleCount", "the number of discard rectangles whose state are updated by the command."),
        VkRect2D.const.p("pDiscardRectangles", "a pointer to an array of ##VkRect2D structures specifying discard rectangles.")
    )
}
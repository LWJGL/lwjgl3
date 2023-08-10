/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_discard_rectangles = "EXTDiscardRectangles".nativeClassVK("EXT_discard_rectangles", type = "device", postfix = "EXT") {
    documentation =
        """
        This extension provides additional orthogonally aligned “{@code discard rectangles}” specified in framebuffer-space coordinates that restrict rasterization of all points, lines and triangles.

        From zero to an implementation-dependent limit (specified by {@code maxDiscardRectangles}) number of discard rectangles can be operational at once. When one or more discard rectangles are active, rasterized fragments can either survive if the fragment is within any of the operational discard rectangles (#DISCARD_RECTANGLE_MODE_INCLUSIVE_EXT mode) or be rejected if the fragment is within any of the operational discard rectangles (#DISCARD_RECTANGLE_MODE_EXCLUSIVE_EXT mode).

        These discard rectangles operate orthogonally to the existing scissor test functionality. The discard rectangles can be different for each physical device in a device group by specifying the device mask and setting discard rectangle dynamic state.

        Version 2 of this extension introduces new dynamic states #DYNAMIC_STATE_DISCARD_RECTANGLE_ENABLE_EXT and #DYNAMIC_STATE_DISCARD_RECTANGLE_MODE_EXT, and the corresponding functions #CmdSetDiscardRectangleEnableEXT() and #CmdSetDiscardRectangleModeEXT(). Applications that use these dynamic states must ensure the implementation advertises at least {@code specVersion} 2 of this extension.

        <h5>VK_EXT_discard_rectangles</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_discard_rectangles}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>100</dd>

            <dt><b>Revision</b></dt>
            <dd>2</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2} or <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#versions-1.1">Version 1.1</a></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Piers Daniell <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_discard_rectangles]%20@pdaniell-nv%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_discard_rectangles%20extension*">pdaniell-nv</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2023-01-18</dd>

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

        "EXT_DISCARD_RECTANGLES_SPEC_VERSION".."2"
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

        "DYNAMIC_STATE_DISCARD_RECTANGLE_EXT".."1000099000",
        "DYNAMIC_STATE_DISCARD_RECTANGLE_ENABLE_EXT".."1000099001",
        "DYNAMIC_STATE_DISCARD_RECTANGLE_MODE_EXT".."1000099002"
    )

    EnumConstant(
        """
        VkDiscardRectangleModeEXT - Specify the discard rectangle mode

        <h5>Description</h5>
        <ul>
            <li>#DISCARD_RECTANGLE_MODE_INCLUSIVE_EXT specifies that the discard rectangle test is inclusive.</li>
            <li>#DISCARD_RECTANGLE_MODE_EXCLUSIVE_EXT specifies that the discard rectangle test is exclusive.</li>
        </ul>

        <h5>See Also</h5>
        ##VkPipelineDiscardRectangleStateCreateInfoEXT, #CmdSetDiscardRectangleModeEXT()
        """,

        "DISCARD_RECTANGLE_MODE_INCLUSIVE_EXT".."0",
        "DISCARD_RECTANGLE_MODE_EXCLUSIVE_EXT".."1"
    )

    void(
        "CmdSetDiscardRectangleEXT",
        """
        Set discard rectangles dynamically for a command buffer.

        <h5>C Specification</h5>
        To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically set</a> the discard rectangles, call:

        <pre><code>
￿void vkCmdSetDiscardRectangleEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    firstDiscardRectangle,
￿    uint32_t                                    discardRectangleCount,
￿    const VkRect2D*                             pDiscardRectangles);</code></pre>

        <h5>Description</h5>
        The discard rectangle taken from element <code>i</code> of {@code pDiscardRectangles} replace the current state for the discard rectangle at index <code>firstDiscardRectangle + i</code>, for <code>i</code> in <code>[0, discardRectangleCount)</code>.

        This command sets the discard rectangles for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-objects">shader objects</a>, or when the graphics pipeline is created with #DYNAMIC_STATE_DISCARD_RECTANGLE_EXT set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the ##VkPipelineDiscardRectangleStateCreateInfoEXT{@code ::pDiscardRectangles} values used to create the currently active pipeline.

        <h5>Valid Usage</h5>
        <ul>
            <li>The sum of {@code firstDiscardRectangle} and {@code discardRectangleCount} <b>must</b> be less than or equal to ##VkPhysicalDeviceDiscardRectanglePropertiesEXT{@code ::maxDiscardRectangles}</li>
            <li>The {@code x} and {@code y} member of {@code offset} in each ##VkRect2D element of {@code pDiscardRectangles} <b>must</b> be greater than or equal to 0</li>
            <li>Evaluation of <code>(offset.x + extent.width)</code> in each ##VkRect2D element of {@code pDiscardRectangles} <b>must</b> not cause a signed integer addition overflow</li>
            <li>Evaluation of <code>(offset.y + extent.height)</code> in each ##VkRect2D element of {@code pDiscardRectangles} <b>must</b> not cause a signed integer addition overflow</li>
            <li>If this command is recorded in a secondary command buffer with ##VkCommandBufferInheritanceViewportScissorInfoNV{@code ::viewportScissor2D} enabled, then this function <b>must</b> not be called</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pDiscardRectangles} <b>must</b> be a valid pointer to an array of {@code discardRectangleCount} ##VkRect2D structures</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
            <li>This command <b>must</b> only be called outside of a video coding scope</li>
            <li>{@code discardRectangleCount} <b>must</b> be greater than 0</li>
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
        uint32_t("firstDiscardRectangle", "the index of the first discard rectangle whose state is updated by the command."),
        AutoSize("pDiscardRectangles")..uint32_t("discardRectangleCount", "the number of discard rectangles whose state are updated by the command."),
        VkRect2D.const.p("pDiscardRectangles", "a pointer to an array of ##VkRect2D structures specifying discard rectangles.")
    )

    void(
        "CmdSetDiscardRectangleEnableEXT",
        """
        Enable discard rectangles dynamically for a command buffer.

        <h5>C Specification</h5>
        To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically set</a> whether discard rectangles are enabled, call:

        <pre><code>
￿void vkCmdSetDiscardRectangleEnableEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    VkBool32                                    discardRectangleEnable);</code></pre>

        <h5>Description</h5>
        This command sets the discard rectangle enable for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-objects">shader objects</a>, or when the graphics pipeline is created with #DYNAMIC_STATE_DISCARD_RECTANGLE_ENABLE_EXT set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is implied by the ##VkPipelineDiscardRectangleStateCreateInfoEXT{@code ::discardRectangleCount} value used to create the currently active pipeline, where a non-zero {@code discardRectangleCount} implicitly enables discard rectangles, otherwise they are disabled.

        <h5>Valid Usage</h5>
        <ul>
            <li>The {@link EXTDiscardRectangles VK_EXT_discard_rectangles} extension <b>must</b> be enabled, and the implementation <b>must</b> support at least {@code specVersion} 2 of this extension</li>
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
        VkBool32("discardRectangleEnable", "specifies whether discard rectangles are enabled or not.")
    )

    void(
        "CmdSetDiscardRectangleModeEXT",
        """
        Sets the discard rectangle mode dynamically for a command buffer.

        <h5>C Specification</h5>
        To <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically set</a> the discard rectangle mode, call:

        <pre><code>
￿void vkCmdSetDiscardRectangleModeEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    VkDiscardRectangleModeEXT                   discardRectangleMode);</code></pre>

        <h5>Description</h5>
        This command sets the discard rectangle mode for subsequent drawing commands when drawing using <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#shaders-objects">shader objects</a>, or when the graphics pipeline is created with #DYNAMIC_STATE_DISCARD_RECTANGLE_MODE_EXT set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the ##VkPipelineDiscardRectangleStateCreateInfoEXT{@code ::discardRectangleMode} value used to create the currently active pipeline.

        <h5>Valid Usage</h5>
        <ul>
            <li>The {@link EXTDiscardRectangles VK_EXT_discard_rectangles} extension <b>must</b> be enabled, and the implementation <b>must</b> support at least {@code specVersion} 2 of this extension</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code discardRectangleMode} <b>must</b> be a valid {@code VkDiscardRectangleModeEXT} value</li>
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
        VkDiscardRectangleModeEXT("discardRectangleMode", "specifies the discard rectangle mode for all discard rectangles, either inclusive or exclusive.")
    )
}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_line_rasterization = "EXTLineRasterization".nativeClassVK("EXT_line_rasterization", type = "device", postfix = "EXT") {
    documentation =
        """
        This extension adds some line rasterization features that are commonly used in CAD applications and supported in other APIs like OpenGL. Bresenham-style line rasterization is supported, smooth rectangular lines (coverage to alpha) are supported, and stippled lines are supported for all three line rasterization modes.

        <h5>VK_EXT_line_rasterization</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_line_rasterization}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>260</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
            </ul></dd>

            <dt><b>Special Use</b></dt>
            <dd><ul>
                <li><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#extendingvulkan-compatibility-specialuse">CAD support</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Jeff Bolz <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_line_rasterization]%20@jeffbolznv%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_line_rasterization%20extension%3E%3E">jeffbolznv</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2019-05-09</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Allen Jensen, NVIDIA</li>
                <li>Jason Ekstrand, Intel</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_LINE_RASTERIZATION_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_LINE_RASTERIZATION_EXTENSION_NAME".."VK_EXT_line_rasterization"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES_EXT".."1000259000",
        "STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO_EXT".."1000259001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_PROPERTIES_EXT".."1000259002"
    )

    EnumConstant(
        "Extends {@code VkDynamicState}.",

        "DYNAMIC_STATE_LINE_STIPPLE_EXT".."1000259000"
    )

    EnumConstant(
        """
        VkLineRasterizationModeEXT - Line rasterization modes

        <h5>Description</h5>
        <ul>
            <li>#LINE_RASTERIZATION_MODE_DEFAULT_EXT is equivalent to #LINE_RASTERIZATION_MODE_RECTANGULAR_EXT if ##VkPhysicalDeviceLimits{@code ::strictLines} is #TRUE, otherwise lines are drawn as non-{@code strictLines} parallelograms. Both of these modes are defined in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#primsrast-lines-basic">Basic Line Segment Rasterization</a>.</li>
            <li>#LINE_RASTERIZATION_MODE_RECTANGULAR_EXT specifies lines drawn as if they were rectangles extruded from the line</li>
            <li>#LINE_RASTERIZATION_MODE_BRESENHAM_EXT specifies lines drawn by determining which pixel diamonds the line intersects and exits, as defined in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#primsrast-lines-bresenham">Bresenham Line Segment Rasterization</a>.</li>
            <li>#LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH_EXT specifies lines drawn if they were rectangles extruded from the line, with alpha falloff, as defined in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#primsrast-lines-smooth">Smooth Lines</a>.</li>
        </ul>

        <h5>See Also</h5>
        ##VkPipelineRasterizationLineStateCreateInfoEXT
        """,

        "LINE_RASTERIZATION_MODE_DEFAULT_EXT".."0",
        "LINE_RASTERIZATION_MODE_RECTANGULAR_EXT".."1",
        "LINE_RASTERIZATION_MODE_BRESENHAM_EXT".."2",
        "LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH_EXT".."3"
    )

    void(
        "CmdSetLineStippleEXT",
        """
        Set line stipple dynamically for a command buffer.

        <h5>C Specification</h5>
        To <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically set</a> the line stipple state, call:

        <pre><code>
￿void vkCmdSetLineStippleEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    uint32_t                                    lineStippleFactor,
￿    uint16_t                                    lineStipplePattern);</code></pre>

        <h5>Description</h5>
        This command sets the line stipple state for subsequent drawing commands when the graphics pipeline is created with #DYNAMIC_STATE_LINE_STIPPLE_EXT set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the ##VkPipelineRasterizationLineStateCreateInfoEXT{@code ::lineStippleFactor} and ##VkPipelineRasterizationLineStateCreateInfoEXT{@code ::lineStipplePattern} values used to create the currently active pipeline.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code lineStippleFactor} <b>must</b> be in the range <code>[1,256]</code></li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
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
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        uint32_t("lineStippleFactor", "the repeat factor used in stippled line rasterization."),
        uint16_t("lineStipplePattern", "the bit pattern used in stippled line rasterization.")
    )
}
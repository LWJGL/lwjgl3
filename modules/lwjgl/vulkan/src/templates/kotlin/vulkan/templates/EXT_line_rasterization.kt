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

        <h5>Promotion to {@code VK_KHR_line_rasterization}</h5>
        All functionality in this extension is included in {@link KHRLineRasterization VK_KHR_line_rasterization}, with the suffix changed to KHR. The original enum names are still available as aliases of the KHR functionality.

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
            <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2} or <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#versions-1.1">Version 1.1</a></dd>

            <dt><b>Deprecation State</b></dt>
            <dd><ul>
                <li><em>Promoted</em> to {@link KHRLineRasterization VK_KHR_line_rasterization} extension</li>
            </ul></dd>

            <dt><b>Special Use</b></dt>
            <dd><ul>
                <li><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#extendingvulkan-compatibility-specialuse">CAD support</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Jeff Bolz <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_line_rasterization]%20@jeffbolznv%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_line_rasterization%20extension*">jeffbolznv</a></li>
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
                <li>Faith Ekstrand, Intel</li>
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
        VkLineRasterizationModeKHR - Line rasterization modes

        <h5>Description</h5>
        <ul>
            <li>#LINE_RASTERIZATION_MODE_DEFAULT_KHR is equivalent to #LINE_RASTERIZATION_MODE_RECTANGULAR_KHR if ##VkPhysicalDeviceLimits{@code ::strictLines} is #TRUE, otherwise lines are drawn as non-{@code strictLines} parallelograms. Both of these modes are defined in <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#primsrast-lines-basic">Basic Line Segment Rasterization</a>.</li>
            <li>#LINE_RASTERIZATION_MODE_RECTANGULAR_KHR specifies lines drawn as if they were rectangles extruded from the line</li>
            <li>#LINE_RASTERIZATION_MODE_BRESENHAM_KHR specifies lines drawn by determining which pixel diamonds the line intersects and exits, as defined in <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#primsrast-lines-bresenham">Bresenham Line Segment Rasterization</a>.</li>
            <li>#LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH_KHR specifies lines drawn if they were rectangles extruded from the line, with alpha falloff, as defined in <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#primsrast-lines-smooth">Smooth Lines</a>.</li>
        </ul>

        <h5>See Also</h5>
        ##VkPipelineRasterizationLineStateCreateInfoKHR, #CmdSetLineRasterizationModeEXT()
        """,

        "LINE_RASTERIZATION_MODE_DEFAULT_KHR".."0",
        "LINE_RASTERIZATION_MODE_DEFAULT_EXT".."0",
        "LINE_RASTERIZATION_MODE_RECTANGULAR_KHR".."1",
        "LINE_RASTERIZATION_MODE_RECTANGULAR_EXT".."1",
        "LINE_RASTERIZATION_MODE_BRESENHAM_KHR".."2",
        "LINE_RASTERIZATION_MODE_BRESENHAM_EXT".."2",
        "LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH_KHR".."3",
        "LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH_EXT".."3"
    )

    void(
        "CmdSetLineStippleEXT",
        "See #CmdSetLineStippleKHR().",

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        uint32_t("lineStippleFactor", "the repeat factor used in stippled line rasterization."),
        uint16_t("lineStipplePattern", "the bit pattern used in stippled line rasterization.")
    )
}
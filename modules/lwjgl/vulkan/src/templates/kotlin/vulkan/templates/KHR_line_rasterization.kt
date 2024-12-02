/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_line_rasterization = "KHRLineRasterization".nativeClassVK("KHR_line_rasterization", type = "device", postfix = "KHR") {
    documentation =
        """
        This extension adds some line rasterization features that are commonly used in CAD applications and supported in other APIs like OpenGL. Bresenham-style line rasterization is supported, smooth rectangular lines (coverage to alpha) are supported, and stippled lines are supported for all three line rasterization modes.

        <h5>Promotion to Vulkan 1.4</h5>
        Functionality in this extension is included in core Vulkan 1.4 with the KHR suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.

        When <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#versions-1.4">Version 1.4</a> is supported, the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#features-bresenhamLines">{@code bresenhamLines}</a> feature must be supported.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_line_rasterization}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>535</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2} or <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#versions-1.1">Version 1.1</a></dd>

            <dt><b>Deprecation State</b></dt>
            <dd><ul>
                <li><em>Promoted</em> to Vulkan 1.4</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Piers Daniell <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_line_rasterization]%20@pdaniell-nv%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_line_rasterization%20extension*">pdaniell-nv</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2023-06-08</dd>

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

        "KHR_LINE_RASTERIZATION_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_LINE_RASTERIZATION_EXTENSION_NAME".."VK_KHR_line_rasterization"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES_KHR".."1000259000",
        "STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO_KHR".."1000259001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_PROPERTIES_KHR".."1000259002"
    )

    EnumConstant(
        "Extends {@code VkDynamicState}.",

        "DYNAMIC_STATE_LINE_STIPPLE_KHR".."1000259000"
    )

    EnumConstant(
        "Extends {@code VkLineRasterizationMode}.",

        "LINE_RASTERIZATION_MODE_DEFAULT_KHR".."0",
        "LINE_RASTERIZATION_MODE_RECTANGULAR_KHR".."1",
        "LINE_RASTERIZATION_MODE_BRESENHAM_KHR".."2",
        "LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH_KHR".."3"
    )

    void(
        "CmdSetLineStippleKHR",
        "See #CmdSetLineStipple().",

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        uint32_t("lineStippleFactor", "the repeat factor used in stippled line rasterization."),
        uint16_t("lineStipplePattern", "the bit pattern used in stippled line rasterization.")
    )
}
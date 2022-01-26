/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NVX_multiview_per_view_attributes = "NVXMultiviewPerViewAttributes".nativeClassVK("NVX_multiview_per_view_attributes", type = "device", postfix = "NVX") {
    documentation =
        """
        This extension adds a new way to write shaders to be used with multiview subpasses, where the attributes for all views are written out by a single invocation of the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader stages</a>. Related SPIR-V and GLSL extensions {@code SPV_NVX_multiview_per_view_attributes} and {@code GL_NVX_multiview_per_view_attributes} introduce per-view position and viewport mask attributes arrays, and this extension defines how those per-view attribute arrays are interpreted by Vulkan. Pipelines using per-view attributes <b>may</b> only execute the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#pipeline-graphics-subsets-pre-rasterization">pre-rasterization shader stages</a> once for all views rather than once per-view, which reduces redundant shading work.

        A subpass creation flag controls whether the subpass uses this extension. A subpass <b>must</b> either exclusively use this extension or not use it at all.

        Some Vulkan implementations only support the position attribute varying between views in the X component. A subpass can declare via a second creation flag whether all pipelines compiled for this subpass will obey this restriction.

        Shaders that use the new per-view outputs (e.g. {@code gl_PositionPerViewNV}) <b>must</b> also write the non-per-view output ({@code gl_Position}), and the values written <b>must</b> be such that {@code gl_Position = gl_PositionPerViewNV[gl_ViewIndex]} for all views in the subpass. Implementations are free to either use the per-view outputs or the non-per-view outputs, whichever would be more efficient.

        If {@link NVViewportArray2 VK_NV_viewport_array2} is not also supported and enabled, the per-view viewport mask <b>must</b> not be used.

        <h5>Examples</h5>
        <pre><code>
￿\#version 450 core
￿
￿\#extension GL_KHX_multiview : enable
￿\#extension GL_NVX_multiview_per_view_attributes : enable
￿
￿layout(location = 0) in vec4 position;
￿layout(set = 0, binding = 0) uniform Block { mat4 mvpPerView[2]; } buf;
￿
￿void main()
￿{
￿    // Output both per-view positions and gl_Position as a function
￿    // of gl_ViewIndex
￿    gl_PositionPerViewNV[0] = buf.mvpPerView[0] * position;
￿    gl_PositionPerViewNV[1] = buf.mvpPerView[1] * position;
￿    gl_Position = buf.mvpPerView[gl_ViewIndex] * position;
￿}</code></pre>

        <h5>VK_NVX_multiview_per_view_attributes</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_NVX_multiview_per_view_attributes}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>98</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRMultiview VK_KHR_multiview}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Jeff Bolz <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NVX_multiview_per_view_attributes]%20@jeffbolznv%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NVX_multiview_per_view_attributes%20extension%3E%3E">jeffbolznv</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2017-01-13</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>This extension requires <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/NV/SPV_NVX_multiview_per_view_attributes.html">{@code SPV_NVX_multiview_per_view_attributes}</a></li>
                <li>This extension provides API support for <a target="_blank" href="https://github.com/KhronosGroup/GLSL/blob/master/extensions/nvx/GL_NVX_multiview_per_view_attributes.txt">{@code GL_NVX_multiview_per_view_attributes}</a></li>
                <li>This extension interacts with {@link NVViewportArray2 VK_NV_viewport_array2}.</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Daniel Koch, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "NVX_MULTIVIEW_PER_VIEW_ATTRIBUTES_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "NVX_MULTIVIEW_PER_VIEW_ATTRIBUTES_EXTENSION_NAME".."VK_NVX_multiview_per_view_attributes"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_ATTRIBUTES_PROPERTIES_NVX".."1000097000"
    )

    EnumConstant(
        "Extends {@code VkSubpassDescriptionFlagBits}.",

        "SUBPASS_DESCRIPTION_PER_VIEW_ATTRIBUTES_BIT_NVX".enum(0x00000001),
        "SUBPASS_DESCRIPTION_PER_VIEW_POSITION_X_ONLY_BIT_NVX".enum(0x00000002)
    )
}
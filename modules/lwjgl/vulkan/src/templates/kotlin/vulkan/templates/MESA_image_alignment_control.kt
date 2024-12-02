/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val MESA_image_alignment_control = "MESAImageAlignmentControl".nativeClassVK("MESA_image_alignment_control", type = "device", postfix = "MESA") {
    documentation =
        """
        This extension allows applications to request a narrower alignment for images than an implementation would otherwise require. Some implementations internally support multiple image layouts in #IMAGE_TILING_OPTIMAL, each with different alignment requirements and performance trade-offs. In some API layering use cases such as D3D12, it is beneficial to be able to control the alignment, since certain alignments for placed resources are guaranteed to be supported, and emulating that expectation requires unnecessary padding of allocations.

        ##VkImageAlignmentControlCreateInfoMESA <b>can</b> be chained to ##VkImageCreateInfo, requesting that the alignment is no more than the provided alignment. If the requested alignment is not supported for a given ##VkImageCreateInfo, a larger alignment <b>may</b> be returned.

        While something similar could be achieved with {@link EXTImageDrmFormatModifier VK_EXT_image_drm_format_modifier} in theory, this is not the intended way to use that extension. Format modifiers are generally used for externally shareable images, and would not be platform portable. It is also a cumbersome API to use just to lower the alignment.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_MESA_image_alignment_control}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>576</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2} or <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#versions-1.1">Version 1.1</a></dd>

            <dt><b>Special Use</b></dt>
            <dd><ul>
                <li><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#extendingvulkan-compatibility-specialuse">D3D support</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Hans-Kristian Arntzen <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_MESA_image_alignment_control]%20@HansKristian-Work%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_MESA_image_alignment_control%20extension*">HansKristian-Work</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2024-05-03</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Hans-Kristian Arntzen, Valve</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "MESA_IMAGE_ALIGNMENT_CONTROL_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "MESA_IMAGE_ALIGNMENT_CONTROL_EXTENSION_NAME".."VK_MESA_image_alignment_control"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_ALIGNMENT_CONTROL_FEATURES_MESA".."1000575000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_ALIGNMENT_CONTROL_PROPERTIES_MESA".."1000575001",
        "STRUCTURE_TYPE_IMAGE_ALIGNMENT_CONTROL_CREATE_INFO_MESA".."1000575002"
    )
}
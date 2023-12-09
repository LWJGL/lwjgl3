/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_vertex_attribute_divisor = "KHRVertexAttributeDivisor".nativeClassVK("KHR_vertex_attribute_divisor", type = "device", postfix = "KHR") {
    documentation =
        """
        This extension is based on the {@link EXTVertexAttributeDivisor VK_EXT_vertex_attribute_divisor} extension. The only difference is the new property {@code supportsNonZeroFirstInstance}, which indicates support for non-zero values in {@code firstInstance}. This allows the extension to be supported on implementations that have traditionally only supported OpenGL ES.

        <h5>VK_KHR_vertex_attribute_divisor</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_vertex_attribute_divisor}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>526</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2} or <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#versions-1.1">Version 1.1</a></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Shahbaz Youssefi <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_vertex_attribute_divisor]%20@syoussefi%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_vertex_attribute_divisor%20extension*">syoussefi</a></li>
            </ul></dd>

            <dt><b>Extension Proposal</b></dt>
            <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_KHR_vertex_attribute_divisor.adoc">VK_KHR_vertex_attribute_divisor</a></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2023-09-20</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Shahbaz Youssefi, Google</li>
                <li>Contributors to {@link EXTVertexAttributeDivisor VK_EXT_vertex_attribute_divisor}</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_VERTEX_ATTRIBUTE_DIVISOR_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_VERTEX_ATTRIBUTE_DIVISOR_EXTENSION_NAME".."VK_KHR_vertex_attribute_divisor"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_PROPERTIES_KHR".."1000525000",
        "STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO_KHR".."1000190001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_FEATURES_KHR".."1000190002"
    )
}
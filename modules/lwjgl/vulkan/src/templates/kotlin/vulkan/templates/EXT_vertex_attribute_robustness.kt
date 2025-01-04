/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_vertex_attribute_robustness = "EXTVertexAttributeRobustness".nativeClassVK("EXT_vertex_attribute_robustness", type = "device", postfix = "EXT") {
    documentation =
        """
        It can be detrimental to performance for applications to have to define fake vertex attribute locations and buffer bindings for vertex shaders that may reference attribute locations for which there is no vertex data.

        This extension allows applications to not have to specify fake vertex attribute locations, and if the vertex shader reads those attributes it will read (0,0,0,0) or (0,0,0,1).

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_vertex_attribute_robustness}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>609</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2} or <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#versions-1.1">Version 1.1</a></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Piers Daniell <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_vertex_attribute_robustness]%20@pdaniell-nv%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_vertex_attribute_robustness%20extension*">pdaniell-nv</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2024-11-01</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Daniel Story, Nintendo</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_VERTEX_ATTRIBUTE_ROBUSTNESS_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_VERTEX_ATTRIBUTE_ROBUSTNESS_EXTENSION_NAME".."VK_EXT_vertex_attribute_robustness"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_ROBUSTNESS_FEATURES_EXT".."1000608000"
    )
}
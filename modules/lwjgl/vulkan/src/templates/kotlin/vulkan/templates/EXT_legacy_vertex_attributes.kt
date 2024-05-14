/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_legacy_vertex_attributes = "EXTLegacyVertexAttributes".nativeClassVK("EXT_legacy_vertex_attributes", type = "device", postfix = "EXT") {
    documentation =
        """
        This extension adds support for legacy features of (non-64-bit) vertex attributes as found in OpenGL:

        <ul>
            <li>Vertex attributes loaded from arbitrary buffer alignments</li>
            <li>Vertex attributes using arbitrary strides</li>
            <li>Vertex attributes where the component data type of the binding does not match the component numeric type of the shader input</li>
        </ul>

        These features are only usable with dynamic vertex input. Unaligned loads of vertex attributes may incur performance penalties, indicated with a property.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_legacy_vertex_attributes}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>496</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link EXTVertexInputDynamicState VK_EXT_vertex_input_dynamic_state}</dd>

            <dt><b>Special Use</b></dt>
            <dd><ul>
                <li><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#extendingvulkan-compatibility-specialuse">OpenGL / ES support</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Mike Blumenkrantz <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_legacy_vertex_attributes]%20@zmike%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_legacy_vertex_attributes%20extension*">zmike</a></li>
            </ul></dd>

            <dt><b>Extension Proposal</b></dt>
            <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_EXT_legacy_vertex_attributes.adoc">VK_EXT_legacy_vertex_attributes</a></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2024-02-23</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Mike Blumenkrantz, Valve</li>
                <li>Piers Daniell, NVIDIA</li>
                <li>Spencer Fricke, LunarG</li>
                <li>Alyssa Rosenzweig, Valve</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_LEGACY_VERTEX_ATTRIBUTES_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_LEGACY_VERTEX_ATTRIBUTES_EXTENSION_NAME".."VK_EXT_legacy_vertex_attributes"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_LEGACY_VERTEX_ATTRIBUTES_FEATURES_EXT".."1000495000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_LEGACY_VERTEX_ATTRIBUTES_PROPERTIES_EXT".."1000495001"
    )
}
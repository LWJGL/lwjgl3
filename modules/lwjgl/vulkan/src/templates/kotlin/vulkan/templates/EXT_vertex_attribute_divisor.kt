/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_vertex_attribute_divisor = "EXTVertexAttributeDivisor".nativeClassVK("EXT_vertex_attribute_divisor", type = "device", postfix = EXT) {
    documentation =
        """
        This extension allows instance-rate vertex attributes to be repeated for certain number of instances instead of advancing for every instance when instanced rendering is enabled.

        <h5>Examples</h5>
        To create a vertex binding such that the first binding uses instanced rendering and the same attribute is used for every 4 draw instances, an application could use the following set of structures:

        <pre><code>
￿    const VkVertexInputBindingDivisorDescriptionEXT divisorDesc =
￿    {
￿        0,
￿        4
￿    };
￿
￿    const VkPipelineVertexInputDivisorStateCreateInfoEXT divisorInfo =
￿    {
￿        VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO_EXT, // sType
￿        NULL,                                                             // pNext
￿        1,                                                                // vertexBindingDivisorCount
￿        &amp;divisorDesc                                                      // pVertexBindingDivisors
￿    }
￿
￿    const VkVertexInputBindingDescription binding =
￿    {
￿        0,                                                                // binding
￿        sizeof(Vertex),                                                   // stride
￿        VK_VERTEX_INPUT_RATE_INSTANCE                                     // inputRate
￿    };
￿
￿    const VkPipelineVertexInputStateCreateInfo viInfo =
￿    {
￿        VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_CREATE_INFO,              // sType
￿        &amp;divisorInfo,                                                     // pNext
￿        ...
￿    };
￿    //...</code></pre>

        <h5>VK_EXT_vertex_attribute_divisor</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_vertex_attribute_divisor}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>191</dd>

            <dt><b>Revision</b></dt>
            <dd>3</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Vikram Kushwaha <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_EXT_vertex_attribute_divisor:%20&amp;body=@vkushwaha%20">vkushwaha</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2018-08-03</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Vikram Kushwaha, NVIDIA</li>
                <li>Jason Ekstrand, Intel</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_VERTEX_ATTRIBUTE_DIVISOR_SPEC_VERSION".."3"
    )

    StringConstant(
        "The extension name.",

        "EXT_VERTEX_ATTRIBUTE_DIVISOR_EXTENSION_NAME".."VK_EXT_vertex_attribute_divisor"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_PROPERTIES_EXT".."1000190000",
        "STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO_EXT".."1000190001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_FEATURES_EXT".."1000190002"
    )
}
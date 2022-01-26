/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_provoking_vertex = "EXTProvokingVertex".nativeClassVK("EXT_provoking_vertex", type = "device", postfix = "EXT") {
    documentation =
        """
        This extension allows changing the provoking vertex convention between Vulkan’s default convention (first vertex) and OpenGL’s convention (last vertex).

        This extension is intended for use by API-translation layers that implement APIs like OpenGL on top of Vulkan, and need to match the source API’s provoking vertex convention. Applications using Vulkan directly should use Vulkan’s default convention.

        <h5>VK_EXT_provoking_vertex</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_provoking_vertex}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>255</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
            </ul></dd>

            <dt><b>Special Use</b></dt>
            <dd><ul>
                <li><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#extendingvulkan-compatibility-specialuse">OpenGL / ES support</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Jesse Hall <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_provoking_vertex]%20@jessehall%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_provoking_vertex%20extension%3E%3E">jessehall</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2021-02-22</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Alexis Hétu, Google</li>
                <li>Bill Licea-Kane, Qualcomm</li>
                <li>Daniel Koch, Nvidia</li>
                <li>Jamie Madill, Google</li>
                <li>Jan-Harald Fredriksen, Arm</li>
                <li>Jason Ekstrand, Intel</li>
                <li>Jeff Bolz, Nvidia</li>
                <li>Jeff Leger, Qualcomm</li>
                <li>Jesse Hall, Google</li>
                <li>Jörg Wagner, Arm</li>
                <li>Matthew Netsch, Qualcomm</li>
                <li>Mike Blumenkrantz, Valve</li>
                <li>Piers Daniell, Nvidia</li>
                <li>Tobias Hector, AMD</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_PROVOKING_VERTEX_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_PROVOKING_VERTEX_EXTENSION_NAME".."VK_EXT_provoking_vertex"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PROVOKING_VERTEX_FEATURES_EXT".."1000254000",
        "STRUCTURE_TYPE_PIPELINE_RASTERIZATION_PROVOKING_VERTEX_STATE_CREATE_INFO_EXT".."1000254001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PROVOKING_VERTEX_PROPERTIES_EXT".."1000254002"
    )

    EnumConstant(
        """
        VkProvokingVertexModeEXT - Specify which vertex in a primitive is the provoking vertex

        <h5>Description</h5>
        <ul>
            <li>#PROVOKING_VERTEX_MODE_FIRST_VERTEX_EXT specifies that the provoking vertex is the first non-adjacency vertex in the list of vertices used by a primitive.</li>
            <li>#PROVOKING_VERTEX_MODE_LAST_VERTEX_EXT specifies that the provoking vertex is the last non-adjacency vertex in the list of vertices used by a primitive.</li>
        </ul>

        These modes are described more precisely in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#drawing-primitive-topologies">Primitive Topologies</a>.

        <h5>See Also</h5>
        ##VkPipelineRasterizationProvokingVertexStateCreateInfoEXT
        """,

        "PROVOKING_VERTEX_MODE_FIRST_VERTEX_EXT".."0",
        "PROVOKING_VERTEX_MODE_LAST_VERTEX_EXT".."1"
    )
}
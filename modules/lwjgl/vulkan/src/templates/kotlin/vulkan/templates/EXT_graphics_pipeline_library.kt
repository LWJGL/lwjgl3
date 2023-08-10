/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_graphics_pipeline_library = "EXTGraphicsPipelineLibrary".nativeClassVK("EXT_graphics_pipeline_library", type = "device", postfix = "EXT") {
    documentation =
        """
        This extension allows the separate compilation of four distinct parts of graphics pipelines, with the intent of allowing faster pipeline loading for applications reusing the same shaders or state in multiple pipelines. Each part can be independently compiled into a graphics pipeline library, with a final link step required to create an executable pipeline that can be bound to a command buffer.

        <h5>VK_EXT_graphics_pipeline_library</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_graphics_pipeline_library}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>321</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2} and {@link KHRPipelineLibrary VK_KHR_pipeline_library}</dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Tobias Hector <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_graphics_pipeline_library]%20@tobski%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_graphics_pipeline_library%20extension*">tobski</a></li>
            </ul></dd>

            <dt><b>Extension Proposal</b></dt>
            <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_EXT_graphics_pipeline_library.adoc">VK_EXT_graphics_pipeline_library</a></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2021-08-17</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Tobias Hector, AMD</li>
                <li>Chris Glover, Google</li>
                <li>Jeff Leger, Qualcomm</li>
                <li>Jan-Harald Fredriksen, Arm</li>
                <li>Piers Daniell, NVidia</li>
                <li>Boris Zanin, Mobica</li>
                <li>Krzysztof Niski, NVidia</li>
                <li>Dan Ginsburg, Valve</li>
                <li>Sebastian Aaltonen, Unity</li>
                <li>Arseny Kapoulkine, Roblox</li>
                <li>Calle Lejdfors, Ubisoft</li>
                <li>Tiago Rodrigues, Ubisoft</li>
                <li>Francois Duranleau, Gameloft</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_GRAPHICS_PIPELINE_LIBRARY_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_GRAPHICS_PIPELINE_LIBRARY_EXTENSION_NAME".."VK_EXT_graphics_pipeline_library"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_GRAPHICS_PIPELINE_LIBRARY_FEATURES_EXT".."1000320000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_GRAPHICS_PIPELINE_LIBRARY_PROPERTIES_EXT".."1000320001",
        "STRUCTURE_TYPE_GRAPHICS_PIPELINE_LIBRARY_CREATE_INFO_EXT".."1000320002"
    )

    EnumConstant(
        "Extends {@code VkPipelineCreateFlagBits}.",

        "PIPELINE_CREATE_RETAIN_LINK_TIME_OPTIMIZATION_INFO_BIT_EXT".enum(0x00800000),
        "PIPELINE_CREATE_LINK_TIME_OPTIMIZATION_BIT_EXT".enum(0x00000400)
    )

    EnumConstant(
        "Extends {@code VkPipelineLayoutCreateFlagBits}.",

        "PIPELINE_LAYOUT_CREATE_INDEPENDENT_SETS_BIT_EXT".enum(0x00000002)
    )

    EnumConstant(
        """
        VkGraphicsPipelineLibraryFlagBitsEXT - Bitmask specifying the subset of a graphics pipeline to compile

        <h5>Description</h5>
        <ul>
            <li>#GRAPHICS_PIPELINE_LIBRARY_VERTEX_INPUT_INTERFACE_BIT_EXT specifies that a pipeline will include <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-graphics-subsets-vertex-input">vertex input interface state</a>.</li>
            <li>#GRAPHICS_PIPELINE_LIBRARY_PRE_RASTERIZATION_SHADERS_BIT_EXT specifies that a pipeline will include <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-graphics-subsets-pre-rasterization">pre-rasterization shader state</a>.</li>
            <li>#GRAPHICS_PIPELINE_LIBRARY_FRAGMENT_SHADER_BIT_EXT specifies that a pipeline will include <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-graphics-subsets-fragment-shader">fragment shader state</a>.</li>
            <li>#GRAPHICS_PIPELINE_LIBRARY_FRAGMENT_OUTPUT_INTERFACE_BIT_EXT specifies that a pipeline will include <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-graphics-subsets-fragment-output">fragment output interface state</a>.</li>
        </ul>
        """,

        "GRAPHICS_PIPELINE_LIBRARY_VERTEX_INPUT_INTERFACE_BIT_EXT".enum(0x00000001),
        "GRAPHICS_PIPELINE_LIBRARY_PRE_RASTERIZATION_SHADERS_BIT_EXT".enum(0x00000002),
        "GRAPHICS_PIPELINE_LIBRARY_FRAGMENT_SHADER_BIT_EXT".enum(0x00000004),
        "GRAPHICS_PIPELINE_LIBRARY_FRAGMENT_OUTPUT_INTERFACE_BIT_EXT".enum(0x00000008)
    )
}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_fragment_density_map = "EXTFragmentDensityMap".nativeClassVK("EXT_fragment_density_map", type = "device", postfix = "EXT") {
    documentation =
        """
        This extension allows an application to specify areas of the render target where the fragment shader may be invoked fewer times. These fragments are broadcasted out to multiple pixels to cover the render target.

        The primary use of this extension is to reduce workloads in areas where lower quality may not be perceived such as the distorted edges of a lens or the periphery of a user’s gaze.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_fragment_density_map}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>219</dd>

            <dt><b>Revision</b></dt>
            <dd>2</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2} or <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#versions-1.1">Version 1.1</a></dd>

            <dt><b>API Interactions</b></dt>
            <dd><ul>
                <li>Interacts with VK_VERSION_1_3</li>
                <li>Interacts with VK_KHR_dynamic_rendering</li>
                <li>Interacts with VK_KHR_format_feature_flags2</li>
            </ul></dd>

            <dt><b>SPIR-V Dependencies</b></dt>
            <dd><ul>
                <li><a href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/EXT/SPV_EXT_fragment_invocation_density.html">SPV_EXT_fragment_invocation_density</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Matthew Netsch <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_fragment_density_map]%20@mnetsch%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_fragment_density_map%20extension*">mnetsch</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2021-09-30</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>This extension provides API support for <a href="https://github.com/KhronosGroup/GLSL/blob/main/extensions/ext/GLSL_EXT_fragment_invocation_density.txt">{@code GL_EXT_fragment_invocation_density}</a></li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Matthew Netsch, Qualcomm Technologies, Inc.</li>
                <li>Robert VanReenen, Qualcomm Technologies, Inc.</li>
                <li>Jonathan Wicks, Qualcomm Technologies, Inc.</li>
                <li>Tate Hornbeck, Qualcomm Technologies, Inc.</li>
                <li>Sam Holmes, Qualcomm Technologies, Inc.</li>
                <li>Jeff Leger, Qualcomm Technologies, Inc.</li>
                <li>Jan-Harald Fredriksen, ARM</li>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Pat Brown, NVIDIA</li>
                <li>Daniel Rakos, AMD</li>
                <li>Piers Daniell, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_FRAGMENT_DENSITY_MAP_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "EXT_FRAGMENT_DENSITY_MAP_EXTENSION_NAME".."VK_EXT_fragment_density_map"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_FEATURES_EXT".."1000218000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_PROPERTIES_EXT".."1000218001",
        "STRUCTURE_TYPE_RENDER_PASS_FRAGMENT_DENSITY_MAP_CREATE_INFO_EXT".."1000218002"
    )

    EnumConstant(
        "Extends {@code VkImageCreateFlagBits}.",

        "IMAGE_CREATE_SUBSAMPLED_BIT_EXT".enum(0x00004000)
    )

    EnumConstant(
        "Extends {@code VkImageLayout}.",

        "IMAGE_LAYOUT_FRAGMENT_DENSITY_MAP_OPTIMAL_EXT".."1000218000"
    )

    EnumConstant(
        "Extends {@code VkAccessFlagBits}.",

        "ACCESS_FRAGMENT_DENSITY_MAP_READ_BIT_EXT".enum(0x01000000)
    )

    EnumConstant(
        "Extends {@code VkFormatFeatureFlagBits}.",

        "FORMAT_FEATURE_FRAGMENT_DENSITY_MAP_BIT_EXT".enum(0x01000000)
    )

    EnumConstant(
        "Extends {@code VkImageUsageFlagBits}.",

        "IMAGE_USAGE_FRAGMENT_DENSITY_MAP_BIT_EXT".enum(0x00000200)
    )

    EnumConstant(
        "Extends {@code VkImageViewCreateFlagBits}.",

        "IMAGE_VIEW_CREATE_FRAGMENT_DENSITY_MAP_DYNAMIC_BIT_EXT".enum(0x00000001)
    )

    EnumConstant(
        "Extends {@code VkPipelineStageFlagBits}.",

        "PIPELINE_STAGE_FRAGMENT_DENSITY_PROCESS_BIT_EXT".enum(0x00800000)
    )

    EnumConstant(
        "Extends {@code VkSamplerCreateFlagBits}.",

        "SAMPLER_CREATE_SUBSAMPLED_BIT_EXT".enum(0x00000001),
        "SAMPLER_CREATE_SUBSAMPLED_COARSE_RECONSTRUCTION_BIT_EXT".enum(0x00000002)
    )

    EnumConstantLong(
        "Extends {@code VkFormatFeatureFlagBits2}.",

        "FORMAT_FEATURE_2_FRAGMENT_DENSITY_MAP_BIT_EXT".enum(0x01000000L)
    )

    EnumConstant(
        "Extends {@code VkPipelineCreateFlagBits}.",

        "PIPELINE_CREATE_RENDERING_FRAGMENT_DENSITY_MAP_ATTACHMENT_BIT_EXT".enum(0x00400000),
        "PIPELINE_RASTERIZATION_STATE_CREATE_FRAGMENT_DENSITY_MAP_ATTACHMENT_BIT_EXT".enum(0x00400000)
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_RENDERING_FRAGMENT_DENSITY_MAP_ATTACHMENT_INFO_EXT".."1000044007"
    )
}
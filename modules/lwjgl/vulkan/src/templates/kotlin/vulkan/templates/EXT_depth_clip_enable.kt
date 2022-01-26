/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_depth_clip_enable = "EXTDepthClipEnable".nativeClassVK("EXT_depth_clip_enable", type = "device", postfix = "EXT") {
    documentation =
        """
        This extension allows the depth clipping operation, that is normally implicitly controlled by ##VkPipelineRasterizationStateCreateInfo{@code ::depthClampEnable}, to instead be controlled explicitly by ##VkPipelineRasterizationDepthClipStateCreateInfoEXT{@code ::depthClipEnable}.

        This is useful for translating DX content which assumes depth clamping is always enabled, but depth clip can be controlled by the DepthClipEnable rasterization state (D3D12_RASTERIZER_DESC).

        <h5>VK_EXT_depth_clip_enable</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_depth_clip_enable}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>103</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
            </ul></dd>

            <dt><b>Special Use</b></dt>
            <dd><ul>
                <li><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#extendingvulkan-compatibility-specialuse">D3D support</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Piers Daniell <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_depth_clip_enable]%20@pdaniell-nv%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_depth_clip_enable%20extension%3E%3E">pdaniell-nv</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2018-12-20</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Daniel Rakos, AMD</li>
                <li>Henri Verbeet, CodeWeavers</li>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Philip Rebohle, DXVK</li>
                <li>Tobias Hector, AMD</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_DEPTH_CLIP_ENABLE_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_DEPTH_CLIP_ENABLE_EXTENSION_NAME".."VK_EXT_depth_clip_enable"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLIP_ENABLE_FEATURES_EXT".."1000102000",
        "STRUCTURE_TYPE_PIPELINE_RASTERIZATION_DEPTH_CLIP_STATE_CREATE_INFO_EXT".."1000102001"
    )
}
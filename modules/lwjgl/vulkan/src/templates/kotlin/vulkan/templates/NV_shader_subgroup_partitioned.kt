/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_shader_subgroup_partitioned = "NVShaderSubgroupPartitioned".nativeClassVK("NV_shader_subgroup_partitioned", type = "device", postfix = NV) {
    documentation =
        """
        This extension enables support for a new class of subgroup operations via the <a target="_blank" href="https://github.com/KhronosGroup/GLSL/blob/master/extensions/nv/GL_NV_shader_subgroup_partitioned.txt">{@code GL_NV_shader_subgroup_partitioned}</a> GLSL extension and <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/NV/SPV_NV_shader_subgroup_partitioned.html">{@code SPV_NV_shader_subgroup_partitioned}</a> SPIR-V extension. Support for these new operations is advertised via the #SUBGROUP_FEATURE_PARTITIONED_BIT_NV bit.

        This extension requires Vulkan 1.1, for general subgroup support.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_NV_shader_subgroup_partitioned}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>199</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.1</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Jeff Bolz <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_NV_shader_subgroup_partitioned:%20&amp;body=@jeffbolznv%20">jeffbolznv</a></li>
            </ul></dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2018-03-17</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jeff Bolz, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "NV_SHADER_SUBGROUP_PARTITIONED_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "NV_SHADER_SUBGROUP_PARTITIONED_EXTENSION_NAME".."VK_NV_shader_subgroup_partitioned"
    )

    EnumConstant(
        "Extends {@code VkSubgroupFeatureFlagBits}.",

        "SUBGROUP_FEATURE_PARTITIONED_BIT_NV".enum(0x00000100)
    )
}
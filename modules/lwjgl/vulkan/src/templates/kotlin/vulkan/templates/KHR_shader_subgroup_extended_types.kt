/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_shader_subgroup_extended_types = "KHRShaderSubgroupExtendedTypes".nativeClassVK("KHR_shader_subgroup_extended_types", type = "device", postfix = KHR) {
    documentation =
        """
        This extension enables the Non Uniform Group Operations in SPIR-V to support 8-bit integer, 16-bit integer, 64-bit integer, 16-bit floating-point, and vectors of these types.

        <h5>Promotion to Vulkan 1.2</h5>
        All functionality in this extension is included in core Vulkan 1.2, with the KHR suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_shader_subgroup_extended_types}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>176</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.1</li>
            </ul></dd>

            <dt><b>Deprecation state</b></dt>
            <dd><ul>
                <li><em>Promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#versions-1.2-promotions">Vulkan 1.2</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Neil Henning <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_KHR_shader_subgroup_extended_types:%20&amp;body=@sheredom%20">sheredom</a></li>
            </ul></dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2019-01-08</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>Promoted to Vulkan 1.2 Core</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Jan-Harald Fredriksen, Arm</li>
                <li>Neil Henning, AMD</li>
                <li>Daniel Koch, NVIDIA</li>
                <li>Jeff Leger, Qualcomm</li>
                <li>Graeme Leese, Broadcom</li>
                <li>David Neto, Google</li>
                <li>Daniel Rakos, AMD</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_SHADER_SUBGROUP_EXTENDED_TYPES_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_SHADER_SUBGROUP_EXTENDED_TYPES_EXTENSION_NAME".."VK_KHR_shader_subgroup_extended_types"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_EXTENDED_TYPES_FEATURES_KHR".."1000175000"
    )
}
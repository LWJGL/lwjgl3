/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_shader_subgroup_rotate = "KHRShaderSubgroupRotate".nativeClassVK("KHR_shader_subgroup_rotate", type = "device", postfix = "KHR") {
    documentation =
        """
        <ul>
            <li>
                Extending ##VkPhysicalDeviceFeatures2, ##VkDeviceCreateInfo:
                <ul>
                    <li>##VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR</li>
                </ul>
            </li>
        </ul>

        <h5>Promotion to Vulkan 1.4</h5>
        Functionality in this extension is included in core Vulkan 1.4 with the KHR suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_shader_subgroup_rotate}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>417</dd>

            <dt><b>Revision</b></dt>
            <dd>2</dd>

            <dt><b>SPIR-V Dependencies</b></dt>
            <dd><ul>
                <li><a href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/KHR/SPV_KHR_subgroup_rotate.html">SPV_KHR_subgroup_rotate</a></li>
            </ul></dd>

            <dt><b>Deprecation State</b></dt>
            <dd><ul>
                <li><em>Promoted</em> to Vulkan 1.4</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Kevin Petit <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_shader_subgroup_rotate]%20@kpet%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_shader_subgroup_rotate%20extension*">kpet</a></li>
            </ul></dd>

            <dt><b>Extension Proposal</b></dt>
            <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_KHR_shader_subgroup_rotate.adoc">VK_KHR_shader_subgroup_rotate</a></dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2024-01-29</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Kévin Petit, Arm Ltd.</li>
                <li>Tobias Hector, AMD</li>
                <li>Jon Leech, Khronos</li>
                <li>Matthew Netsch, Qualcomm</li>
                <li>Jan-Harald Fredriksen, Arm Ltd.</li>
                <li>Graeme Leese, Broadcom</li>
                <li>Tom Olson, Arm Ltd.</li>
                <li>Spencer Fricke, LunarG Inc.</li>
            </ul></dd>
        </dl>

        This extension adds support for the subgroup rotate instruction defined in SPV_KHR_subgroup_rotate.
        """

    IntConstant(
        "The extension specification version.",

        "KHR_SHADER_SUBGROUP_ROTATE_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "KHR_SHADER_SUBGROUP_ROTATE_EXTENSION_NAME".."VK_KHR_shader_subgroup_rotate"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_ROTATE_FEATURES_KHR".."1000416000"
    )

    EnumConstant(
        "Extends {@code VkSubgroupFeatureFlagBits}.",

        "SUBGROUP_FEATURE_ROTATE_BIT_KHR".enum(0x00000200),
        "SUBGROUP_FEATURE_ROTATE_CLUSTERED_BIT_KHR".enum(0x00000400)
    )
}
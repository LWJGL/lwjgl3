/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_subgroup_size_control = "EXTSubgroupSizeControl".nativeClassVK("EXT_subgroup_size_control", type = "device", postfix = "EXT") {
    documentation =
        """
        This extension enables an implementation to control the subgroup size by allowing a varying subgroup size and also specifying a required subgroup size.

        It extends the subgroup support in Vulkan 1.1 to allow an implementation to expose a varying subgroup size. Previously Vulkan exposed a single subgroup size per physical device, with the expectation that implementations will behave as if all subgroups have the same size. Some implementations <b>may</b> dispatch shaders with a varying subgroup size for different subgroups. As a result they could implicitly split a large subgroup into smaller subgroups or represent a small subgroup as a larger subgroup, some of whose invocations were inactive on launch.

        To aid developers in understanding the performance characteristics of their programs, this extension exposes a minimum and maximum subgroup size that a physical device supports and a pipeline create flag to enable that pipeline to vary its subgroup size. If enabled, any {@code SubgroupSize} decorated variables in the SPIR-V shader modules provided to pipeline creation <b>may</b> vary between the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-minSubgroupSize">minimum</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-maxSubgroupSize">maximum</a> subgroup sizes.

        An implementation is also optionally allowed to support specifying a required subgroup size for a given pipeline stage. Implementations advertise which <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-requiredSubgroupSizeStages">stages support a required subgroup size</a>, and any pipeline of a supported stage can be passed a ##VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT structure to set the subgroup size for that shader stage of the pipeline. For compute shaders, this requires the developer to query the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-maxComputeWorkgroupSubgroups">{@code maxComputeWorkgroupSubgroups}</a> and ensure that:

        <code>s = { WorkGroupSize.x &times; WorkGroupSize.y &times; WorkgroupSize.z &le; SubgroupSize &times; maxComputeWorkgroupSubgroups }</code>

        Developers can also specify a new pipeline shader stage create flag that requires the implementation to have fully populated subgroups within local workgroups. This requires the workgroup size in the X dimension to be a multiple of the subgroup size.

        <h5>Promotion to Vulkan 1.3</h5>
        Functionality in this extension is included in core Vulkan 1.3, with the EXT suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.

        <h5>VK_EXT_subgroup_size_control</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_subgroup_size_control}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>226</dd>

            <dt><b>Revision</b></dt>
            <dd>2</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.1</li>
            </ul></dd>

            <dt><b>Deprecation state</b></dt>
            <dd><ul>
                <li><em>Promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#versions-1.3-promotions">Vulkan 1.3</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Neil Henning <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_subgroup_size_control]%20@sheredom%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_subgroup_size_control%20extension%3E%3E">sheredom</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2019-03-05</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>Promoted to Vulkan 1.3 Core</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Jason Ekstrand, Intel</li>
                <li>Sławek Grajewski, Intel</li>
                <li>Jesse Hall, Google</li>
                <li>Neil Henning, AMD</li>
                <li>Daniel Koch, NVIDIA</li>
                <li>Jeff Leger, Qualcomm</li>
                <li>Graeme Leese, Broadcom</li>
                <li>Allan MacKinnon, Google</li>
                <li>Mariusz Merecki, Intel</li>
                <li>Graham Wihlidal, Electronic Arts</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_SUBGROUP_SIZE_CONTROL_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "EXT_SUBGROUP_SIZE_CONTROL_EXTENSION_NAME".."VK_EXT_subgroup_size_control"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_PROPERTIES_EXT".."1000225000",
        "STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_REQUIRED_SUBGROUP_SIZE_CREATE_INFO_EXT".."1000225001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_FEATURES_EXT".."1000225002"
    )

    EnumConstant(
        "Extends {@code VkPipelineShaderStageCreateFlagBits}.",

        "PIPELINE_SHADER_STAGE_CREATE_ALLOW_VARYING_SUBGROUP_SIZE_BIT_EXT".enum(0x00000001),
        "PIPELINE_SHADER_STAGE_CREATE_REQUIRE_FULL_SUBGROUPS_BIT_EXT".enum(0x00000002)
    )
}
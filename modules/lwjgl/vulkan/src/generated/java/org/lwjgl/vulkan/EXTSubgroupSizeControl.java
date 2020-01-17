/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * <h5>Short Description</h5>
 * 
 * <p>Enables an implementation to control the subgroup size by allowing a varying subgroup size and also specifying a required subgroup size.</p>
 * 
 * <h5>Description</h5>
 * 
 * <p>This extension extends the subgroup support in Vulkan 1.1 to allow an implementation to expose a varying subgroup size. Previously Vulkan exposed a single subgroup size per physical device, with the expectation that implementations will behave as if all subgroups have the same size. Some implementations <b>may</b> dispatch shaders with a varying subgroup size for different subgroups. As a result they could implicitly split a large subgroup into smaller subgroups or represent a small subgroup as a larger subgroup, some of whose invocations were inactive on launch.</p>
 * 
 * <p>To aid developers in understanding the performance characteristics of their programs, this extension exposes a minimum and maximum subgroup size that a physical device supports and a pipeline create flag to enable that pipeline to vary its subgroup size. If enabled, any {@code SubgroupSize} decorated variables in the SPIR-V shader modules provided to pipeline creation <b>may</b> vary between the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#limits-min-subgroup-size">minimum</a> and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#limits-max-subgroup-size">maximum</a> subgroup sizes.</p>
 * 
 * <p>An implementation is also optionally allowed to support specifying a required subgroup size for a given pipeline stage. Implementations advertise which <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#limits-required-subgroup-size-stages"> stages support a required subgroup size</a>, and any pipeline of a supported stage can be passed a {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT} structure to set the subgroup size for that shader stage of the pipeline. For compute shaders, this requires the developer to query the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#limits-max-subgroups-per-workgroup"> {@code maxComputeWorkgroupSubgroups}</a> and ensure that:</p>
 * 
 * <p><code>s = {WorkGroupSize.x * WorkGroupSize.y * WorkgroupSize.z &le; SubgroupSize * maxComputeWorkgroupSubgroups }</code></p>
 * 
 * <p>Developers can also specify a new pipeline shader stage create flag that requires the implementation to have fully populated subgroups within local workgroups. This requires the workgroup size in the X dimension to be a multiple of the subgroup size.</p>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_subgroup_size_control}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>226</dd>
 * <dt><b>Revision</b></dt>
 * <dd>2</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.1</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Neil Henning <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_EXT_subgroup_size_control:%20&amp;body=@sheredom%20">sheredom</a></li>
 * </ul></dd>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2019-03-05</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Jason Ekstrand, Intel</li>
 * <li>Sławek Grajewski, Intel</li>
 * <li>Jesse Hall, Google</li>
 * <li>Neil Henning, AMD</li>
 * <li>Daniel Koch, NVIDIA</li>
 * <li>Jeff Leger, Qualcomm</li>
 * <li>Graeme Leese, Broadcom</li>
 * <li>Allan MacKinnon, Google</li>
 * <li>Mariusz Merecki, Intel</li>
 * <li>Graham Wihlidal, Electronic Arts</li>
 * </ul></dd>
 * </dl>
 */
public final class EXTSubgroupSizeControl {

    /** The extension specification version. */
    public static final int VK_EXT_SUBGROUP_SIZE_CONTROL_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String VK_EXT_SUBGROUP_SIZE_CONTROL_EXTENSION_NAME = "VK_EXT_subgroup_size_control";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_PROPERTIES_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_REQUIRED_SUBGROUP_SIZE_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_REQUIRED_SUBGROUP_SIZE_CREATE_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_FEATURES_EXT}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_PROPERTIES_EXT         = 1000225000,
        VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_REQUIRED_SUBGROUP_SIZE_CREATE_INFO_EXT = 1000225001,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_FEATURES_EXT           = 1000225002;

    /**
     * Extends {@code VkPipelineShaderStageCreateFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_PIPELINE_SHADER_STAGE_CREATE_ALLOW_VARYING_SUBGROUP_SIZE_BIT_EXT PIPELINE_SHADER_STAGE_CREATE_ALLOW_VARYING_SUBGROUP_SIZE_BIT_EXT}</li>
     * <li>{@link #VK_PIPELINE_SHADER_STAGE_CREATE_REQUIRE_FULL_SUBGROUPS_BIT_EXT PIPELINE_SHADER_STAGE_CREATE_REQUIRE_FULL_SUBGROUPS_BIT_EXT}</li>
     * </ul>
     */
    public static final int
        VK_PIPELINE_SHADER_STAGE_CREATE_ALLOW_VARYING_SUBGROUP_SIZE_BIT_EXT = 0x1,
        VK_PIPELINE_SHADER_STAGE_CREATE_REQUIRE_FULL_SUBGROUPS_BIT_EXT      = 0x2;

    private EXTSubgroupSizeControl() {}

}
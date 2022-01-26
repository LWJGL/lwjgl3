/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_fragment_shading_rate_enums = "NVFragmentShadingRateEnums".nativeClassVK("NV_fragment_shading_rate_enums", type = "device", postfix = "NV") {
    documentation =
        """
        This extension builds on the fragment shading rate functionality provided by the VK_KHR_fragment_shading_rate extension, adding support for “{@code supersample}” fragment shading rates that trigger multiple fragment shader invocations per pixel as well as a “{@code no invocations}” shading rate that discards any portions of a primitive that would use that shading rate.

        <h5>VK_NV_fragment_shading_rate_enums</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_NV_fragment_shading_rate_enums}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>327</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRFragmentShadingRate VK_KHR_fragment_shading_rate}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Pat Brown <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NV_fragment_shading_rate_enums]%20@nvpbrown%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NV_fragment_shading_rate_enums%20extension%3E%3E">nvpbrown</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2020-09-02</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Pat Brown, NVIDIA</li>
                <li>Jeff Bolz, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "NV_FRAGMENT_SHADING_RATE_ENUMS_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "NV_FRAGMENT_SHADING_RATE_ENUMS_EXTENSION_NAME".."VK_NV_fragment_shading_rate_enums"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_PROPERTIES_NV".."1000326000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_ENUMS_FEATURES_NV".."1000326001",
        "STRUCTURE_TYPE_PIPELINE_FRAGMENT_SHADING_RATE_ENUM_STATE_CREATE_INFO_NV".."1000326002"
    )

    EnumConstant(
        """
        VkFragmentShadingRateTypeNV - Enumeration with fragment shading rate types

        <h5>Description</h5>
        <ul>
            <li>#FRAGMENT_SHADING_RATE_TYPE_FRAGMENT_SIZE_NV specifies that a graphics pipeline should obtain its pipeline fragment shading rate and shading rate combiner state from the ##VkPipelineFragmentShadingRateStateCreateInfoKHR structure and that any state specified by the ##VkPipelineFragmentShadingRateEnumStateCreateInfoNV structure should be ignored.</li>
            <li>#FRAGMENT_SHADING_RATE_TYPE_ENUMS_NV specifies that a graphics pipeline should obtain its pipeline fragment shading rate and shading rate combiner state from the ##VkPipelineFragmentShadingRateEnumStateCreateInfoNV structure and that any state specified by the ##VkPipelineFragmentShadingRateStateCreateInfoKHR structure should be ignored.</li>
        </ul>

        <h5>See Also</h5>
        ##VkPipelineFragmentShadingRateEnumStateCreateInfoNV
        """,

        "FRAGMENT_SHADING_RATE_TYPE_FRAGMENT_SIZE_NV".."0",
        "FRAGMENT_SHADING_RATE_TYPE_ENUMS_NV".."1"
    )

    EnumConstant(
        """
        VkFragmentShadingRateNV - Enumeration with fragment shading rates

        <h5>Description</h5>
        <ul>
            <li>#FRAGMENT_SHADING_RATE_1_INVOCATION_PER_PIXEL_NV specifies a fragment size of 1x1 pixels.</li>
            <li>#FRAGMENT_SHADING_RATE_1_INVOCATION_PER_1X2_PIXELS_NV specifies a fragment size of 1x2 pixels.</li>
            <li>#FRAGMENT_SHADING_RATE_1_INVOCATION_PER_2X1_PIXELS_NV specifies a fragment size of 2x1 pixels.</li>
            <li>#FRAGMENT_SHADING_RATE_1_INVOCATION_PER_2X2_PIXELS_NV specifies a fragment size of 2x2 pixels.</li>
            <li>#FRAGMENT_SHADING_RATE_1_INVOCATION_PER_2X4_PIXELS_NV specifies a fragment size of 2x4 pixels.</li>
            <li>#FRAGMENT_SHADING_RATE_1_INVOCATION_PER_4X2_PIXELS_NV specifies a fragment size of 4x2 pixels.</li>
            <li>#FRAGMENT_SHADING_RATE_1_INVOCATION_PER_4X4_PIXELS_NV specifies a fragment size of 4x4 pixels.</li>
            <li>#FRAGMENT_SHADING_RATE_2_INVOCATIONS_PER_PIXEL_NV specifies a fragment size of 1x1 pixels, with two fragment shader invocations per fragment.</li>
            <li>#FRAGMENT_SHADING_RATE_4_INVOCATIONS_PER_PIXEL_NV specifies a fragment size of 1x1 pixels, with four fragment shader invocations per fragment.</li>
            <li>#FRAGMENT_SHADING_RATE_8_INVOCATIONS_PER_PIXEL_NV specifies a fragment size of 1x1 pixels, with eight fragment shader invocations per fragment.</li>
            <li>#FRAGMENT_SHADING_RATE_16_INVOCATIONS_PER_PIXEL_NV specifies a fragment size of 1x1 pixels, with sixteen fragment shader invocations per fragment.</li>
            <li>#FRAGMENT_SHADING_RATE_NO_INVOCATIONS_NV specifies that any portions of a primitive that use that shading rate should be discarded without invoking any fragment shader.</li>
        </ul>

        To use the shading rates #FRAGMENT_SHADING_RATE_2_INVOCATIONS_PER_PIXEL_NV, #FRAGMENT_SHADING_RATE_4_INVOCATIONS_PER_PIXEL_NV, #FRAGMENT_SHADING_RATE_8_INVOCATIONS_PER_PIXEL_NV, and #FRAGMENT_SHADING_RATE_16_INVOCATIONS_PER_PIXEL_NV as a pipeline, primitive, or attachment shading rate, the {@code supersampleFragmentShadingRates} feature <b>must</b> be enabled. To use the shading rate #FRAGMENT_SHADING_RATE_NO_INVOCATIONS_NV as a pipeline, primitive, or attachment shading rate, the {@code noInvocationFragmentShadingRates} feature <b>must</b> be enabled.

        <h5>See Also</h5>
        ##VkPipelineFragmentShadingRateEnumStateCreateInfoNV, #CmdSetFragmentShadingRateEnumNV()
        """,

        "FRAGMENT_SHADING_RATE_1_INVOCATION_PER_PIXEL_NV".."0",
        "FRAGMENT_SHADING_RATE_1_INVOCATION_PER_1X2_PIXELS_NV".."1",
        "FRAGMENT_SHADING_RATE_1_INVOCATION_PER_2X1_PIXELS_NV".."4",
        "FRAGMENT_SHADING_RATE_1_INVOCATION_PER_2X2_PIXELS_NV".."5",
        "FRAGMENT_SHADING_RATE_1_INVOCATION_PER_2X4_PIXELS_NV".."6",
        "FRAGMENT_SHADING_RATE_1_INVOCATION_PER_4X2_PIXELS_NV".."9",
        "FRAGMENT_SHADING_RATE_1_INVOCATION_PER_4X4_PIXELS_NV".."10",
        "FRAGMENT_SHADING_RATE_2_INVOCATIONS_PER_PIXEL_NV".."11",
        "FRAGMENT_SHADING_RATE_4_INVOCATIONS_PER_PIXEL_NV".."12",
        "FRAGMENT_SHADING_RATE_8_INVOCATIONS_PER_PIXEL_NV".."13",
        "FRAGMENT_SHADING_RATE_16_INVOCATIONS_PER_PIXEL_NV".."14",
        "FRAGMENT_SHADING_RATE_NO_INVOCATIONS_NV".."15"
    )

    void(
        "CmdSetFragmentShadingRateEnumNV",
        """
        Set pipeline fragment shading rate dynamically for a command buffer using enums.

        <h5>C Specification</h5>
        To <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically set</a> the pipeline fragment shading rate and combiner operation, call:

        <pre><code>
￿void vkCmdSetFragmentShadingRateEnumNV(
￿    VkCommandBuffer                             commandBuffer,
￿    VkFragmentShadingRateNV                     shadingRate,
￿    const VkFragmentShadingRateCombinerOpKHR    combinerOps[2]);</code></pre>

        <h5>Description</h5>
        This command sets the pipeline fragment shading rate and combiner operation for subsequent drawing commands when the graphics pipeline is created with #DYNAMIC_STATE_FRAGMENT_SHADING_RATE_KHR set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the ##VkPipelineFragmentShadingRateEnumStateCreateInfoNV values used to create the currently active pipeline.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        This command allows specifying additional shading rates beyond those supported by #CmdSetFragmentShadingRateKHR(). For more information, refer to the {@link NVFragmentShadingRateEnums VK_NV_fragment_shading_rate_enums} appendix.
        </div>

        <h5>Valid Usage</h5>
        <ul>
            <li>If <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-pipelineFragmentShadingRate">{@code pipelineFragmentShadingRate}</a> is not enabled, {@code shadingRate} <b>must</b> be #FRAGMENT_SHADING_RATE_1_INVOCATION_PER_PIXEL_NV</li>
            <li>If <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-supersampleFragmentShadingRates">{@code supersampleFragmentShadingRates}</a> is not enabled, {@code shadingRate} <b>must</b> not be #FRAGMENT_SHADING_RATE_2_INVOCATIONS_PER_PIXEL_NV, #FRAGMENT_SHADING_RATE_4_INVOCATIONS_PER_PIXEL_NV, #FRAGMENT_SHADING_RATE_8_INVOCATIONS_PER_PIXEL_NV, or #FRAGMENT_SHADING_RATE_16_INVOCATIONS_PER_PIXEL_NV</li>
            <li>If <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-noInvocationFragmentShadingRates">{@code noInvocationFragmentShadingRates}</a> is not enabled, {@code shadingRate} <b>must</b> not be #FRAGMENT_SHADING_RATE_NO_INVOCATIONS_NV</li>
            <li><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-fragmentShadingRateEnums">{@code fragmentShadingRateEnums}</a> <b>must</b> be enabled</li>
            <li>One of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-pipelineFragmentShadingRate">{@code pipelineFragmentShadingRate}</a>, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-primitiveFragmentShadingRate">{@code primitiveFragmentShadingRate}</a>, or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-attachmentFragmentShadingRate">{@code attachmentFragmentShadingRate}</a> <b>must</b> be enabled</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-primitiveFragmentShadingRate">{@code primitiveFragmentShadingRate} feature</a> is not enabled, {@code combinerOps}[0] <b>must</b> be #FRAGMENT_SHADING_RATE_COMBINER_OP_KEEP_KHR</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-attachmentFragmentShadingRate">{@code attachmentFragmentShadingRate} feature</a> is not enabled, {@code combinerOps}[1] <b>must</b> be #FRAGMENT_SHADING_RATE_COMBINER_OP_KEEP_KHR</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-fragmentShadingRateNonTrivialCombinerOps">{@code fragmentSizeNonTrivialCombinerOps}</a> limit is not supported, elements of {@code combinerOps} <b>must</b> be either #FRAGMENT_SHADING_RATE_COMBINER_OP_KEEP_KHR or #FRAGMENT_SHADING_RATE_COMBINER_OP_REPLACE_KHR</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code shadingRate} <b>must</b> be a valid {@code VkFragmentShadingRateNV} value</li>
            <li>Any given element of {@code combinerOps} <b>must</b> be a valid {@code VkFragmentShadingRateCombinerOpKHR} value</li>
            <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#commandbuffers-lifecycle">recording state</a></li>
            <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
            <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
        </table>
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkFragmentShadingRateNV("shadingRate", "specifies a {@code VkFragmentShadingRateNV} enum indicating the pipeline fragment shading rate for subsequent drawing commands."),
        Check(2)..VkFragmentShadingRateCombinerOpKHR.const.p("combinerOps", "specifies a {@code VkFragmentShadingRateCombinerOpKHR} determining how the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\\#primsrast-fragment-shading-rate-pipeline\">pipeline</a>, <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\\#primsrast-fragment-shading-rate-primitive\">primitive</a>, and <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\\#primsrast-fragment-shading-rate-attachment\">attachment shading rates</a> are <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\\#primsrast-fragment-shading-rate-combining\">combined</a> for fragments generated by subsequent drawing commands.")
    )
}
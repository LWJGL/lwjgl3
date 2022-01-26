/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_fragment_shading_rate = "KHRFragmentShadingRate".nativeClassVK("KHR_fragment_shading_rate", type = "device", postfix = "KHR") {
    documentation =
        """
        This extension adds the ability to change the rate at which fragments are shaded. Rather than the usual single fragment invocation for each pixel covered by a primitive, multiple pixels can be shaded by a single fragment shader invocation.

        Up to three methods are available to the application to change the fragment shading rate:

        <ul>
            <li><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#primsrast-fragment-shading-rate-pipeline">Pipeline Fragment Shading Rate</a>, which allows the specification of a rate per-draw.</li>
            <li><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#primsrast-fragment-shading-rate-primitive">Primitive Fragment Shading Rate</a>, which allows the specification of a rate per primitive, specified during shading.</li>
            <li><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#primsrast-fragment-shading-rate-attachment">Attachment Fragment Shading Rate</a>, which allows the specification of a rate per-region of the framebuffer, specified in a specialized image attachment.</li>
        </ul>

        Additionally, these rates can all be specified and combined in order to adjust the overall detail in the image at each point.

        This functionality can be used to focus shading efforts where higher levels of detail are needed in some parts of a scene compared to others. This can be particularly useful in high resolution rendering, or for XR contexts.

        This extension also adds support for the {@code SPV_KHR_fragment_shading_rate} extension which enables setting the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#primsrast-fragment-shading-rate-primitive">primitive fragment shading rate</a>, and allows querying the final shading rate from a fragment shader.

        <h5>VK_KHR_fragment_shading_rate</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_fragment_shading_rate}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>227</dd>

            <dt><b>Revision</b></dt>
            <dd>2</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRCreateRenderpass2 VK_KHR_create_renderpass2}</li>
                <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Tobias Hector <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_fragment_shading_rate]%20@tobski%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_fragment_shading_rate%20extension%3E%3E">tobski</a></li>
            </ul></dd>

            <dt><b>Extension Proposal</b></dt>
            <dd><a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_KHR_fragment_shading_rate.asciidoc">VK_KHR_fragment_shading_rate</a></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2021-09-30</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>This extension requires <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/KHR/SPV_KHR_fragment_shading_rate.html">{@code SPV_KHR_fragment_shading_rate}</a>.</li>
                <li>This extension provides API support for <a target="_blank" href="https://github.com/KhronosGroup/GLSL/blob/master/extensions/ext/GLSL_EXT_fragment_shading_rate.txt">{@code GL_EXT_fragment_shading_rate}</a></li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Tobias Hector, AMD</li>
                <li>Guennadi Riguer, AMD</li>
                <li>Matthaeus Chajdas, AMD</li>
                <li>Pat Brown, Nvidia</li>
                <li>Matthew Netsch, Qualcomm</li>
                <li>Slawomir Grajewski, Intel</li>
                <li>Jan-Harald Fredriksen, Arm</li>
                <li>Jeff Bolz, Nvidia</li>
                <li>Arseny Kapoulkine, Roblox</li>
                <li>Contributors to the VK_NV_shading_rate_image specification</li>
                <li>Contributors to the VK_EXT_fragment_density_map specification</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_FRAGMENT_SHADING_RATE_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "KHR_FRAGMENT_SHADING_RATE_EXTENSION_NAME".."VK_KHR_fragment_shading_rate"
    )

    EnumConstant(
        "Extends {@code VkImageLayout}.",

        "IMAGE_LAYOUT_FRAGMENT_SHADING_RATE_ATTACHMENT_OPTIMAL_KHR".."1000164003"
    )

    EnumConstant(
        "Extends {@code VkDynamicState}.",

        "DYNAMIC_STATE_FRAGMENT_SHADING_RATE_KHR".."1000226000"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_FRAGMENT_SHADING_RATE_ATTACHMENT_INFO_KHR".."1000226000",
        "STRUCTURE_TYPE_PIPELINE_FRAGMENT_SHADING_RATE_STATE_CREATE_INFO_KHR".."1000226001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_PROPERTIES_KHR".."1000226002",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_FEATURES_KHR".."1000226003",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_KHR".."1000226004"
    )

    EnumConstant(
        "Extends {@code VkAccessFlagBits}.",

        "ACCESS_FRAGMENT_SHADING_RATE_ATTACHMENT_READ_BIT_KHR".enum(0x00800000)
    )

    EnumConstant(
        "Extends {@code VkImageUsageFlagBits}.",

        "IMAGE_USAGE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR".enum(0x00000100)
    )

    EnumConstant(
        "Extends {@code VkPipelineStageFlagBits}.",

        "PIPELINE_STAGE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR".enum(0x00400000)
    )

    EnumConstant(
        "Extends {@code VkFormatFeatureFlagBits}.",

        "FORMAT_FEATURE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR".enum(0x40000000)
    )

    EnumConstantLong(
        "Extends {@code VkFormatFeatureFlagBits2}.",

        "FORMAT_FEATURE_2_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR".enum(0x40000000L)
    )

    EnumConstant(
        """
        VkFragmentShadingRateCombinerOpKHR - Control how fragment shading rates are combined

        <h5>Description</h5>
        <ul>
            <li>#FRAGMENT_SHADING_RATE_COMBINER_OP_KEEP_KHR specifies a combiner operation of <code>combine(A<sub>xy</sub>,B<sub>xy</sub>) = A<sub>xy</sub></code>.</li>
            <li>#FRAGMENT_SHADING_RATE_COMBINER_OP_REPLACE_KHR specifies a combiner operation of <code>combine(A<sub>xy</sub>,B<sub>xy</sub>) = B<sub>xy</sub></code>.</li>
            <li>#FRAGMENT_SHADING_RATE_COMBINER_OP_MIN_KHR specifies a combiner operation of <code>combine(A<sub>xy</sub>,B<sub>xy</sub>) = min(A<sub>xy</sub>,B<sub>xy</sub>)</code>.</li>
            <li>#FRAGMENT_SHADING_RATE_COMBINER_OP_MAX_KHR specifies a combiner operation of <code>combine(A<sub>xy</sub>,B<sub>xy</sub>) = max(A<sub>xy</sub>,B<sub>xy</sub>)</code>.</li>
            <li>#FRAGMENT_SHADING_RATE_COMBINER_OP_MUL_KHR specifies a combiner operation of <code>combine(A<sub>xy</sub>,B<sub>xy</sub>) = A<sub>xy</sub>*B<sub>xy</sub></code>.</li>
        </ul>

        where <code>combine(A<sub>xy</sub>,B<sub>xy</sub>)</code> is the combine operation, and <code>A<sub>xy</sub></code> and <code>B<sub>xy</sub></code> are the inputs to the operation.

        If <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-fragmentShadingRateStrictMultiplyCombiner">{@code fragmentShadingRateStrictMultiplyCombiner}</a> is #FALSE, using #FRAGMENT_SHADING_RATE_COMBINER_OP_MUL_KHR with values of 1 for both A and B in the same dimension results in the value 2 being produced for that dimension. See the definition of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-fragmentShadingRateStrictMultiplyCombiner">{@code fragmentShadingRateStrictMultiplyCombiner}</a> for more information.

        These operations are performed in a component-wise fashion.

        <h5>See Also</h5>
        ##VkPipelineFragmentShadingRateEnumStateCreateInfoNV, ##VkPipelineFragmentShadingRateStateCreateInfoKHR, #CmdSetFragmentShadingRateEnumNV(), #CmdSetFragmentShadingRateKHR()
        """,

        "FRAGMENT_SHADING_RATE_COMBINER_OP_KEEP_KHR".."0",
        "FRAGMENT_SHADING_RATE_COMBINER_OP_REPLACE_KHR".."1",
        "FRAGMENT_SHADING_RATE_COMBINER_OP_MIN_KHR".."2",
        "FRAGMENT_SHADING_RATE_COMBINER_OP_MAX_KHR".."3",
        "FRAGMENT_SHADING_RATE_COMBINER_OP_MUL_KHR".."4"
    )

    VkResult(
        "GetPhysicalDeviceFragmentShadingRatesKHR",
        """
        Get available shading rates for a physical device.

        <h5>C Specification</h5>
        To query available shading rates, call:

        <pre><code>
￿VkResult vkGetPhysicalDeviceFragmentShadingRatesKHR(
￿    VkPhysicalDevice                            physicalDevice,
￿    uint32_t*                                   pFragmentShadingRateCount,
￿    VkPhysicalDeviceFragmentShadingRateKHR*     pFragmentShadingRates);</code></pre>

        <h5>Description</h5>
        If {@code pFragmentShadingRates} is {@code NULL}, then the number of fragment shading rates available is returned in {@code pFragmentShadingRateCount}. Otherwise, {@code pFragmentShadingRateCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pFragmentShadingRates} array, and on return the variable is overwritten with the number of structures actually written to {@code pFragmentShadingRates}. If {@code pFragmentShadingRateCount} is less than the number of fragment shading rates available, at most {@code pFragmentShadingRateCount} structures will be written, and #INCOMPLETE will be returned instead of #SUCCESS, to indicate that not all the available fragment shading rates were returned.

        The returned array of fragment shading rates <b>must</b> be ordered from largest {@code fragmentSize.width} value to smallest, and each set of fragment shading rates with the same {@code fragmentSize.width} value <b>must</b> be ordered from largest {@code fragmentSize.height} to smallest. Any two entries in the array <b>must</b> not have the same {@code fragmentSize} values.

        For any entry in the array, the following rules also apply:

        <ul>
            <li>The value of {@code fragmentSize.width} <b>must</b> be less than or equal to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-maxFragmentSize">{@code maxFragmentSize.width}</a>.</li>
            <li>The value of {@code fragmentSize.width} <b>must</b> be greater than or equal to 1.</li>
            <li>The value of {@code fragmentSize.width} <b>must</b> be a power-of-two.</li>
            <li>The value of {@code fragmentSize.height} <b>must</b> be less than or equal to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-maxFragmentSize">{@code maxFragmentSize.height}</a>.</li>
            <li>The value of {@code fragmentSize.height} <b>must</b> be greater than or equal to 1.</li>
            <li>The value of {@code fragmentSize.height} <b>must</b> be a power-of-two.</li>
            <li>The highest sample count in {@code sampleCounts} <b>must</b> be less than or equal to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-maxFragmentShadingRateRasterizationSamples">{@code maxFragmentShadingRateRasterizationSamples}</a>.</li>
            <li>The product of {@code fragmentSize.width}, {@code fragmentSize.height}, and the highest sample count in {@code sampleCounts} <b>must</b> be less than or equal to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-maxFragmentShadingRateCoverageSamples">{@code maxFragmentShadingRateCoverageSamples}</a>.</li>
        </ul>

        Implementations <b>must</b> support at least the following shading rates:

        <table class="lwjgl">
            <thead><tr><th>{@code sampleCounts}</th><th>{@code fragmentSize}</th></tr></thead>
            <tbody>
                <tr><td>#SAMPLE_COUNT_1_BIT | #SAMPLE_COUNT_4_BIT</td><td>{2,2}</td></tr>
                <tr><td>#SAMPLE_COUNT_1_BIT | #SAMPLE_COUNT_4_BIT</td><td>{2,1}</td></tr>
                <tr><td>~0</td><td>{1,1}</td></tr>
            </tbody>
        </table>

        If <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-framebufferColorSampleCounts">{@code framebufferColorSampleCounts}</a>, includes #SAMPLE_COUNT_2_BIT, the required rates <b>must</b> also include #SAMPLE_COUNT_2_BIT.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Including the {1,1} fragment size is done for completeness; it has no actual effect on the support of rendering without setting the fragment size. All sample counts and render pass transforms are supported for this rate.
        </div>

        The returned set of fragment shading rates <b>must</b> be returned in the native (rotated) coordinate system. For rasterization using render pass {@code transform} not equal to #SURFACE_TRANSFORM_IDENTITY_BIT_KHR, the application <b>must</b> transform the returned fragment shading rates into the current (unrotated) coordinate system to get the supported rates for that transform.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        For example, consider an implementation returning support for 4x2, but not 2x4 in the set of supported fragment shading rates. This means that for transforms #SURFACE_TRANSFORM_ROTATE_90_BIT_KHR and #SURFACE_TRANSFORM_ROTATE_270_BIT_KHR, 2x4 is a supported rate, but 4x2 is an unsupported rate.
        </div>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code pFragmentShadingRateCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
            <li>If the value referenced by {@code pFragmentShadingRateCount} is not 0, and {@code pFragmentShadingRates} is not {@code NULL}, {@code pFragmentShadingRates} <b>must</b> be a valid pointer to an array of {@code pFragmentShadingRateCount} ##VkPhysicalDeviceFragmentShadingRateKHR structures</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#INCOMPLETE</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkPhysicalDeviceFragmentShadingRateKHR
        """,

        VkPhysicalDevice("physicalDevice", "the handle to the physical device whose properties will be queried."),
        AutoSize("pFragmentShadingRates")..Check(1)..uint32_t.p("pFragmentShadingRateCount", "a pointer to an integer related to the number of fragment shading rates available or queried, as described below."),
        nullable..VkPhysicalDeviceFragmentShadingRateKHR.p("pFragmentShadingRates", "either {@code NULL} or a pointer to an array of ##VkPhysicalDeviceFragmentShadingRateKHR structures.")
    )

    void(
        "CmdSetFragmentShadingRateKHR",
        """
        Set pipeline fragment shading rate and combiner operation dynamically for a command buffer.

        <h5>C Specification</h5>
        To <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#pipelines-dynamic-state">dynamically set</a> the pipeline fragment shading rate and combiner operation, call:

        <pre><code>
￿void vkCmdSetFragmentShadingRateKHR(
￿    VkCommandBuffer                             commandBuffer,
￿    const VkExtent2D*                           pFragmentSize,
￿    const VkFragmentShadingRateCombinerOpKHR    combinerOps[2]);</code></pre>

        <h5>Description</h5>
        This command sets the pipeline fragment shading rate and combiner operation for subsequent drawing commands when the graphics pipeline is created with #DYNAMIC_STATE_FRAGMENT_SHADING_RATE_KHR set in ##VkPipelineDynamicStateCreateInfo{@code ::pDynamicStates}. Otherwise, this state is specified by the ##VkPipelineFragmentShadingRateStateCreateInfoKHR values used to create the currently active pipeline.

        <h5>Valid Usage</h5>
        <ul>
            <li>If <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-pipelineFragmentShadingRate">{@code pipelineFragmentShadingRate}</a> is not enabled, {@code pFragmentSize→width} <b>must</b> be 1</li>
            <li>If <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-pipelineFragmentShadingRate">{@code pipelineFragmentShadingRate}</a> is not enabled, {@code pFragmentSize→height} <b>must</b> be 1</li>
            <li>One of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-pipelineFragmentShadingRate">{@code pipelineFragmentShadingRate}</a>, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-primitiveFragmentShadingRate">{@code primitiveFragmentShadingRate}</a>, or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-attachmentFragmentShadingRate">{@code attachmentFragmentShadingRate}</a> <b>must</b> be enabled</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-primitiveFragmentShadingRate">{@code primitiveFragmentShadingRate} feature</a> is not enabled, {@code combinerOps}[0] <b>must</b> be #FRAGMENT_SHADING_RATE_COMBINER_OP_KEEP_KHR</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#features-attachmentFragmentShadingRate">{@code attachmentFragmentShadingRate} feature</a> is not enabled, {@code combinerOps}[1] <b>must</b> be #FRAGMENT_SHADING_RATE_COMBINER_OP_KEEP_KHR</li>
            <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-fragmentShadingRateNonTrivialCombinerOps">{@code fragmentSizeNonTrivialCombinerOps}</a> limit is not supported, elements of {@code combinerOps} <b>must</b> be either #FRAGMENT_SHADING_RATE_COMBINER_OP_KEEP_KHR or #FRAGMENT_SHADING_RATE_COMBINER_OP_REPLACE_KHR</li>
            <li>{@code pFragmentSize→width} <b>must</b> be greater than or equal to 1</li>
            <li>{@code pFragmentSize→height} <b>must</b> be greater than or equal to 1</li>
            <li>{@code pFragmentSize→width} <b>must</b> be a power-of-two value</li>
            <li>{@code pFragmentSize→height} <b>must</b> be a power-of-two value</li>
            <li>{@code pFragmentSize→width} <b>must</b> be less than or equal to 4</li>
            <li>{@code pFragmentSize→height} <b>must</b> be less than or equal to 4</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
            <li>{@code pFragmentSize} <b>must</b> be a valid pointer to a valid ##VkExtent2D structure</li>
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

        <h5>See Also</h5>
        ##VkExtent2D
        """,

        VkCommandBuffer("commandBuffer", "the command buffer into which the command will be recorded."),
        VkExtent2D.const.p("pFragmentSize", "specifies the pipeline fragment shading rate for subsequent drawing commands."),
        Check(2)..VkFragmentShadingRateCombinerOpKHR.const.p("combinerOps", "specifies a {@code VkFragmentShadingRateCombinerOpKHR} determining how the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\\#primsrast-fragment-shading-rate-pipeline\">pipeline</a>, <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\\#primsrast-fragment-shading-rate-primitive\">primitive</a>, and <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\\#primsrast-fragment-shading-rate-attachment\">attachment shading rates</a> are <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\\#primsrast-fragment-shading-rate-combining\">combined</a> for fragments generated by subsequent drawing commands.")
    )
}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_coverage_reduction_mode = "NVCoverageReductionMode".nativeClassVK("NV_coverage_reduction_mode", type = "device", postfix = NV) {
    documentation =
        """
        When using a framebuffer with mixed samples, a per-fragment coverage reduction operation is performed which generates a color sample mask from the coverage mask. This extension defines the following modes to control how this reduction is performed.

        <ul>
            <li>Merge: When there are more raster samples than color samples, there is an implementation dependent association of each raster sample to a color sample. In the merge mode, the reduced color sample mask is computed such that the bit for each color sample is 1 if any of the associated bits in the fragment’s coverage is on, and 0 otherwise. This is the default mode.</li>
            <li>Truncate: When there are more raster samples (N) than color samples(M), there is one to one association of the first M raster samples to the M color samples and the coverage bits for the other raster samples are ignored.</li>
        </ul>

        When the number of raster samples is equal to the color samples, there is a one to one mapping between them in either of the above modes.

        The new command #GetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV() can be used to query the various raster, color, depth/stencil sample count and reduction mode combinations that are supported by the implementation. This extension would allow an implementation to support the behavior of both {@code VK_NV_framebuffer_mixed_samples} and {@code VK_AMD_mixed_attachment_samples} extensions simultaneously.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_NV_coverage_reduction_mode}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>251</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Kedarnath Thangudu <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_NV_coverage_reduction_mode:%20&amp;body=@kthangudu%20">kthangudu</a></li>
            </ul></dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2019-01-29</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Kedarnath Thangudu, NVIDIA</li>
                <li>Jeff Bolz, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "NV_COVERAGE_REDUCTION_MODE_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "NV_COVERAGE_REDUCTION_MODE_EXTENSION_NAME".."VK_NV_coverage_reduction_mode"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_COVERAGE_REDUCTION_MODE_FEATURES_NV".."1000250000",
        "STRUCTURE_TYPE_PIPELINE_COVERAGE_REDUCTION_STATE_CREATE_INFO_NV".."1000250001",
        "STRUCTURE_TYPE_FRAMEBUFFER_MIXED_SAMPLES_COMBINATION_NV".."1000250002"
    )

    EnumConstant(
        """
        VkCoverageReductionModeNV - Specify the coverage reduction mode

        <h5>Description</h5>
        <ul>
            <li>#COVERAGE_REDUCTION_MODE_MERGE_NV: In this mode, there is an implementation-dependent association of each raster sample to a color sample. The reduced color sample mask is computed such that the bit for each color sample is 1 if any of the associated bits in the fragment&#8217;s coverage is on, and 0 otherwise.</li>
            <li>#COVERAGE_REDUCTION_MODE_TRUNCATE_NV: In this mode, only the first <code>M</code> raster samples are associated with the color samples such that raster sample <code>i</code> maps to color sample <code>i</code>, where <code>M</code> is the number of color samples.</li>
        </ul>

        <h5>See Also</h5>
        ##VkFramebufferMixedSamplesCombinationNV, ##VkPipelineCoverageReductionStateCreateInfoNV
        """,

        "COVERAGE_REDUCTION_MODE_MERGE_NV".."0",
        "COVERAGE_REDUCTION_MODE_TRUNCATE_NV".."1"
    )

    VkResult(
        "GetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV",
        """
        Query supported sample count combinations.

        <h5>C Specification</h5>
        To query the set of mixed sample combinations of coverage reduction mode, rasterization samples and color, depth, stencil attachment sample counts that are supported by a physical device, call:

        <pre><code>
￿VkResult vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV(
￿    VkPhysicalDevice                            physicalDevice,
￿    uint32_t*                                   pCombinationCount,
￿    VkFramebufferMixedSamplesCombinationNV*     pCombinations);</code></pre>

        <h5>Description</h5>
        If {@code pCombinations} is {@code NULL}, then the number of supported combinations for the given {@code physicalDevice} is returned in {@code pCombinationCount}. Otherwise, {@code pCombinationCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pCombinations} array, and on return the variable is overwritten with the number of values actually written to {@code pCombinations}. If the value of {@code pCombinationCount} is less than the number of combinations supported for the given {@code physicalDevice}, at most {@code pCombinationCount} values will be written {@code pCombinations} and #INCOMPLETE will be returned instead of #SUCCESS to indicate that not all the supported values were returned.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code pCombinationCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
            <li>If the value referenced by {@code pCombinationCount} is not 0, and {@code pCombinations} is not {@code NULL}, {@code pCombinations} <b>must</b> be a valid pointer to an array of {@code pCombinationCount} ##VkFramebufferMixedSamplesCombinationNV structures</li>
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
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkFramebufferMixedSamplesCombinationNV
        """,

        VkPhysicalDevice("physicalDevice", "the physical device from which to query the set of combinations."),
        AutoSize("pCombinations")..Check(1)..uint32_t.p("pCombinationCount", "a pointer to an integer related to the number of combinations available or queried, as described below."),
        nullable..VkFramebufferMixedSamplesCombinationNV.p("pCombinations", "either {@code NULL} or a pointer to an array of ##VkFramebufferMixedSamplesCombinationNV values, indicating the supported combinations of coverage reduction mode, rasterization samples, and color, depth, stencil attachment sample counts.")
    )
}
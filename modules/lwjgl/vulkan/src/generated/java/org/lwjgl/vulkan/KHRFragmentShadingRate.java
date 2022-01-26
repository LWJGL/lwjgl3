/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * This extension adds the ability to change the rate at which fragments are shaded. Rather than the usual single fragment invocation for each pixel covered by a primitive, multiple pixels can be shaded by a single fragment shader invocation.
 * 
 * <p>Up to three methods are available to the application to change the fragment shading rate:</p>
 * 
 * <ul>
 * <li><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-fragment-shading-rate-pipeline">Pipeline Fragment Shading Rate</a>, which allows the specification of a rate per-draw.</li>
 * <li><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-fragment-shading-rate-primitive">Primitive Fragment Shading Rate</a>, which allows the specification of a rate per primitive, specified during shading.</li>
 * <li><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-fragment-shading-rate-attachment">Attachment Fragment Shading Rate</a>, which allows the specification of a rate per-region of the framebuffer, specified in a specialized image attachment.</li>
 * </ul>
 * 
 * <p>Additionally, these rates can all be specified and combined in order to adjust the overall detail in the image at each point.</p>
 * 
 * <p>This functionality can be used to focus shading efforts where higher levels of detail are needed in some parts of a scene compared to others. This can be particularly useful in high resolution rendering, or for XR contexts.</p>
 * 
 * <p>This extension also adds support for the {@code SPV_KHR_fragment_shading_rate} extension which enables setting the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-fragment-shading-rate-primitive">primitive fragment shading rate</a>, and allows querying the final shading rate from a fragment shader.</p>
 * 
 * <h5>VK_KHR_fragment_shading_rate</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_fragment_shading_rate}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>227</dd>
 * <dt><b>Revision</b></dt>
 * <dd>2</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRCreateRenderpass2 VK_KHR_create_renderpass2}</li>
 * <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Tobias Hector <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_fragment_shading_rate]%20@tobski%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_fragment_shading_rate%20extension%3E%3E">tobski</a></li>
 * </ul></dd>
 * <dt><b>Extension Proposal</b></dt>
 * <dd><a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_KHR_fragment_shading_rate.asciidoc">VK_KHR_fragment_shading_rate</a></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2021-09-30</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension requires <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/KHR/SPV_KHR_fragment_shading_rate.html">{@code SPV_KHR_fragment_shading_rate}</a>.</li>
 * <li>This extension provides API support for <a target="_blank" href="https://github.com/KhronosGroup/GLSL/blob/master/extensions/ext/GLSL_EXT_fragment_shading_rate.txt">{@code GL_EXT_fragment_shading_rate}</a></li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Tobias Hector, AMD</li>
 * <li>Guennadi Riguer, AMD</li>
 * <li>Matthaeus Chajdas, AMD</li>
 * <li>Pat Brown, Nvidia</li>
 * <li>Matthew Netsch, Qualcomm</li>
 * <li>Slawomir Grajewski, Intel</li>
 * <li>Jan-Harald Fredriksen, Arm</li>
 * <li>Jeff Bolz, Nvidia</li>
 * <li>Arseny Kapoulkine, Roblox</li>
 * <li>Contributors to the VK_NV_shading_rate_image specification</li>
 * <li>Contributors to the VK_EXT_fragment_density_map specification</li>
 * </ul></dd>
 * </dl>
 */
public class KHRFragmentShadingRate {

    /** The extension specification version. */
    public static final int VK_KHR_FRAGMENT_SHADING_RATE_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String VK_KHR_FRAGMENT_SHADING_RATE_EXTENSION_NAME = "VK_KHR_fragment_shading_rate";

    /** Extends {@code VkImageLayout}. */
    public static final int VK_IMAGE_LAYOUT_FRAGMENT_SHADING_RATE_ATTACHMENT_OPTIMAL_KHR = 1000164003;

    /** Extends {@code VkDynamicState}. */
    public static final int VK_DYNAMIC_STATE_FRAGMENT_SHADING_RATE_KHR = 1000226000;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_FRAGMENT_SHADING_RATE_ATTACHMENT_INFO_KHR STRUCTURE_TYPE_FRAGMENT_SHADING_RATE_ATTACHMENT_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PIPELINE_FRAGMENT_SHADING_RATE_STATE_CREATE_INFO_KHR STRUCTURE_TYPE_PIPELINE_FRAGMENT_SHADING_RATE_STATE_CREATE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_PROPERTIES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_FEATURES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_FRAGMENT_SHADING_RATE_ATTACHMENT_INFO_KHR            = 1000226000,
        VK_STRUCTURE_TYPE_PIPELINE_FRAGMENT_SHADING_RATE_STATE_CREATE_INFO_KHR = 1000226001,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_PROPERTIES_KHR = 1000226002,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_FEATURES_KHR   = 1000226003,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_KHR            = 1000226004;

    /** Extends {@code VkAccessFlagBits}. */
    public static final int VK_ACCESS_FRAGMENT_SHADING_RATE_ATTACHMENT_READ_BIT_KHR = 0x800000;

    /** Extends {@code VkImageUsageFlagBits}. */
    public static final int VK_IMAGE_USAGE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR = 0x100;

    /** Extends {@code VkPipelineStageFlagBits}. */
    public static final int VK_PIPELINE_STAGE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR = 0x400000;

    /** Extends {@code VkFormatFeatureFlagBits}. */
    public static final int VK_FORMAT_FEATURE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR = 0x40000000;

    /** Extends {@code VkFormatFeatureFlagBits2}. */
    public static final long VK_FORMAT_FEATURE_2_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_KHR = 0x40000000L;

    /**
     * VkFragmentShadingRateCombinerOpKHR - Control how fragment shading rates are combined
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_FRAGMENT_SHADING_RATE_COMBINER_OP_KEEP_KHR FRAGMENT_SHADING_RATE_COMBINER_OP_KEEP_KHR} specifies a combiner operation of <code>combine(A<sub>xy</sub>,B<sub>xy</sub>) = A<sub>xy</sub></code>.</li>
     * <li>{@link #VK_FRAGMENT_SHADING_RATE_COMBINER_OP_REPLACE_KHR FRAGMENT_SHADING_RATE_COMBINER_OP_REPLACE_KHR} specifies a combiner operation of <code>combine(A<sub>xy</sub>,B<sub>xy</sub>) = B<sub>xy</sub></code>.</li>
     * <li>{@link #VK_FRAGMENT_SHADING_RATE_COMBINER_OP_MIN_KHR FRAGMENT_SHADING_RATE_COMBINER_OP_MIN_KHR} specifies a combiner operation of <code>combine(A<sub>xy</sub>,B<sub>xy</sub>) = min(A<sub>xy</sub>,B<sub>xy</sub>)</code>.</li>
     * <li>{@link #VK_FRAGMENT_SHADING_RATE_COMBINER_OP_MAX_KHR FRAGMENT_SHADING_RATE_COMBINER_OP_MAX_KHR} specifies a combiner operation of <code>combine(A<sub>xy</sub>,B<sub>xy</sub>) = max(A<sub>xy</sub>,B<sub>xy</sub>)</code>.</li>
     * <li>{@link #VK_FRAGMENT_SHADING_RATE_COMBINER_OP_MUL_KHR FRAGMENT_SHADING_RATE_COMBINER_OP_MUL_KHR} specifies a combiner operation of <code>combine(A<sub>xy</sub>,B<sub>xy</sub>) = A<sub>xy</sub>*B<sub>xy</sub></code>.</li>
     * </ul>
     * 
     * <p>where <code>combine(A<sub>xy</sub>,B<sub>xy</sub>)</code> is the combine operation, and <code>A<sub>xy</sub></code> and <code>B<sub>xy</sub></code> are the inputs to the operation.</p>
     * 
     * <p>If <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-fragmentShadingRateStrictMultiplyCombiner">{@code fragmentShadingRateStrictMultiplyCombiner}</a> is {@link VK10#VK_FALSE FALSE}, using {@link #VK_FRAGMENT_SHADING_RATE_COMBINER_OP_MUL_KHR FRAGMENT_SHADING_RATE_COMBINER_OP_MUL_KHR} with values of 1 for both A and B in the same dimension results in the value 2 being produced for that dimension. See the definition of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-fragmentShadingRateStrictMultiplyCombiner">{@code fragmentShadingRateStrictMultiplyCombiner}</a> for more information.</p>
     * 
     * <p>These operations are performed in a component-wise fashion.</p>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkPipelineFragmentShadingRateEnumStateCreateInfoNV}, {@link VkPipelineFragmentShadingRateStateCreateInfoKHR}, {@link NVFragmentShadingRateEnums#vkCmdSetFragmentShadingRateEnumNV CmdSetFragmentShadingRateEnumNV}, {@link #vkCmdSetFragmentShadingRateKHR CmdSetFragmentShadingRateKHR}</p>
     */
    public static final int
        VK_FRAGMENT_SHADING_RATE_COMBINER_OP_KEEP_KHR    = 0,
        VK_FRAGMENT_SHADING_RATE_COMBINER_OP_REPLACE_KHR = 1,
        VK_FRAGMENT_SHADING_RATE_COMBINER_OP_MIN_KHR     = 2,
        VK_FRAGMENT_SHADING_RATE_COMBINER_OP_MAX_KHR     = 3,
        VK_FRAGMENT_SHADING_RATE_COMBINER_OP_MUL_KHR     = 4;

    protected KHRFragmentShadingRate() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetPhysicalDeviceFragmentShadingRatesKHR ] ---

    /**
     * Unsafe version of: {@link #vkGetPhysicalDeviceFragmentShadingRatesKHR GetPhysicalDeviceFragmentShadingRatesKHR}
     *
     * @param pFragmentShadingRateCount a pointer to an integer related to the number of fragment shading rates available or queried, as described below.
     */
    public static int nvkGetPhysicalDeviceFragmentShadingRatesKHR(VkPhysicalDevice physicalDevice, long pFragmentShadingRateCount, long pFragmentShadingRates) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceFragmentShadingRatesKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(physicalDevice.address(), pFragmentShadingRateCount, pFragmentShadingRates, __functionAddress);
    }

    /**
     * Get available shading rates for a physical device.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To query available shading rates, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetPhysicalDeviceFragmentShadingRatesKHR(
     *     VkPhysicalDevice                            physicalDevice,
     *     uint32_t*                                   pFragmentShadingRateCount,
     *     VkPhysicalDeviceFragmentShadingRateKHR*     pFragmentShadingRates);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>If {@code pFragmentShadingRates} is {@code NULL}, then the number of fragment shading rates available is returned in {@code pFragmentShadingRateCount}. Otherwise, {@code pFragmentShadingRateCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pFragmentShadingRates} array, and on return the variable is overwritten with the number of structures actually written to {@code pFragmentShadingRates}. If {@code pFragmentShadingRateCount} is less than the number of fragment shading rates available, at most {@code pFragmentShadingRateCount} structures will be written, and {@link VK10#VK_INCOMPLETE INCOMPLETE} will be returned instead of {@link VK10#VK_SUCCESS SUCCESS}, to indicate that not all the available fragment shading rates were returned.</p>
     * 
     * <p>The returned array of fragment shading rates <b>must</b> be ordered from largest {@code fragmentSize.width} value to smallest, and each set of fragment shading rates with the same {@code fragmentSize.width} value <b>must</b> be ordered from largest {@code fragmentSize.height} to smallest. Any two entries in the array <b>must</b> not have the same {@code fragmentSize} values.</p>
     * 
     * <p>For any entry in the array, the following rules also apply:</p>
     * 
     * <ul>
     * <li>The value of {@code fragmentSize.width} <b>must</b> be less than or equal to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-maxFragmentSize">{@code maxFragmentSize.width}</a>.</li>
     * <li>The value of {@code fragmentSize.width} <b>must</b> be greater than or equal to 1.</li>
     * <li>The value of {@code fragmentSize.width} <b>must</b> be a power-of-two.</li>
     * <li>The value of {@code fragmentSize.height} <b>must</b> be less than or equal to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-maxFragmentSize">{@code maxFragmentSize.height}</a>.</li>
     * <li>The value of {@code fragmentSize.height} <b>must</b> be greater than or equal to 1.</li>
     * <li>The value of {@code fragmentSize.height} <b>must</b> be a power-of-two.</li>
     * <li>The highest sample count in {@code sampleCounts} <b>must</b> be less than or equal to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-maxFragmentShadingRateRasterizationSamples">{@code maxFragmentShadingRateRasterizationSamples}</a>.</li>
     * <li>The product of {@code fragmentSize.width}, {@code fragmentSize.height}, and the highest sample count in {@code sampleCounts} <b>must</b> be less than or equal to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-maxFragmentShadingRateCoverageSamples">{@code maxFragmentShadingRateCoverageSamples}</a>.</li>
     * </ul>
     * 
     * <p>Implementations <b>must</b> support at least the following shading rates:</p>
     * 
     * <table class="lwjgl">
     * <thead><tr><th>{@code sampleCounts}</th><th>{@code fragmentSize}</th></tr></thead>
     * <tbody>
     * <tr><td>{@link VK10#VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT} | {@link VK10#VK_SAMPLE_COUNT_4_BIT SAMPLE_COUNT_4_BIT}</td><td>{2,2}</td></tr>
     * <tr><td>{@link VK10#VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT} | {@link VK10#VK_SAMPLE_COUNT_4_BIT SAMPLE_COUNT_4_BIT}</td><td>{2,1}</td></tr>
     * <tr><td>~0</td><td>{1,1}</td></tr>
     * </tbody>
     * </table>
     * 
     * <p>If <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-framebufferColorSampleCounts">{@code framebufferColorSampleCounts}</a>, includes {@link VK10#VK_SAMPLE_COUNT_2_BIT SAMPLE_COUNT_2_BIT}, the required rates <b>must</b> also include {@link VK10#VK_SAMPLE_COUNT_2_BIT SAMPLE_COUNT_2_BIT}.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Including the {1,1} fragment size is done for completeness; it has no actual effect on the support of rendering without setting the fragment size. All sample counts and render pass transforms are supported for this rate.</p>
     * </div>
     * 
     * <p>The returned set of fragment shading rates <b>must</b> be returned in the native (rotated) coordinate system. For rasterization using render pass {@code transform} not equal to {@link KHRSurface#VK_SURFACE_TRANSFORM_IDENTITY_BIT_KHR SURFACE_TRANSFORM_IDENTITY_BIT_KHR}, the application <b>must</b> transform the returned fragment shading rates into the current (unrotated) coordinate system to get the supported rates for that transform.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>For example, consider an implementation returning support for 4x2, but not 2x4 in the set of supported fragment shading rates. This means that for transforms {@link KHRSurface#VK_SURFACE_TRANSFORM_ROTATE_90_BIT_KHR SURFACE_TRANSFORM_ROTATE_90_BIT_KHR} and {@link KHRSurface#VK_SURFACE_TRANSFORM_ROTATE_270_BIT_KHR SURFACE_TRANSFORM_ROTATE_270_BIT_KHR}, 2x4 is a supported rate, but 4x2 is an unsupported rate.</p>
     * </div>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
     * <li>{@code pFragmentShadingRateCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
     * <li>If the value referenced by {@code pFragmentShadingRateCount} is not 0, and {@code pFragmentShadingRates} is not {@code NULL}, {@code pFragmentShadingRates} <b>must</b> be a valid pointer to an array of {@code pFragmentShadingRateCount} {@link VkPhysicalDeviceFragmentShadingRateKHR} structures</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * <li>{@link VK10#VK_INCOMPLETE INCOMPLETE}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkPhysicalDeviceFragmentShadingRateKHR}</p>
     *
     * @param physicalDevice            the handle to the physical device whose properties will be queried.
     * @param pFragmentShadingRateCount a pointer to an integer related to the number of fragment shading rates available or queried, as described below.
     * @param pFragmentShadingRates     either {@code NULL} or a pointer to an array of {@link VkPhysicalDeviceFragmentShadingRateKHR} structures.
     */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceFragmentShadingRatesKHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") IntBuffer pFragmentShadingRateCount, @Nullable @NativeType("VkPhysicalDeviceFragmentShadingRateKHR *") VkPhysicalDeviceFragmentShadingRateKHR.Buffer pFragmentShadingRates) {
        if (CHECKS) {
            check(pFragmentShadingRateCount, 1);
            checkSafe(pFragmentShadingRates, pFragmentShadingRateCount.get(pFragmentShadingRateCount.position()));
        }
        return nvkGetPhysicalDeviceFragmentShadingRatesKHR(physicalDevice, memAddress(pFragmentShadingRateCount), memAddressSafe(pFragmentShadingRates));
    }

    // --- [ vkCmdSetFragmentShadingRateKHR ] ---

    /** Unsafe version of: {@link #vkCmdSetFragmentShadingRateKHR CmdSetFragmentShadingRateKHR} */
    public static void nvkCmdSetFragmentShadingRateKHR(VkCommandBuffer commandBuffer, long pFragmentSize, long combinerOps) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetFragmentShadingRateKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPPV(commandBuffer.address(), pFragmentSize, combinerOps, __functionAddress);
    }

    /**
     * Set pipeline fragment shading rate and combiner operation dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the pipeline fragment shading rate and combiner operation, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetFragmentShadingRateKHR(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkExtent2D*                           pFragmentSize,
     *     const VkFragmentShadingRateCombinerOpKHR    combinerOps[2]);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the pipeline fragment shading rate and combiner operation for subsequent drawing commands when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_FRAGMENT_SHADING_RATE_KHR DYNAMIC_STATE_FRAGMENT_SHADING_RATE_KHR} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineFragmentShadingRateStateCreateInfoKHR} values used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-pipelineFragmentShadingRate">{@code pipelineFragmentShadingRate}</a> is not enabled, {@code pFragmentSize→width} <b>must</b> be 1</li>
     * <li>If <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-pipelineFragmentShadingRate">{@code pipelineFragmentShadingRate}</a> is not enabled, {@code pFragmentSize→height} <b>must</b> be 1</li>
     * <li>One of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-pipelineFragmentShadingRate">{@code pipelineFragmentShadingRate}</a>, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-primitiveFragmentShadingRate">{@code primitiveFragmentShadingRate}</a>, or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-attachmentFragmentShadingRate">{@code attachmentFragmentShadingRate}</a> <b>must</b> be enabled</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-primitiveFragmentShadingRate">{@code primitiveFragmentShadingRate} feature</a> is not enabled, {@code combinerOps}[0] <b>must</b> be {@link #VK_FRAGMENT_SHADING_RATE_COMBINER_OP_KEEP_KHR FRAGMENT_SHADING_RATE_COMBINER_OP_KEEP_KHR}</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-attachmentFragmentShadingRate">{@code attachmentFragmentShadingRate} feature</a> is not enabled, {@code combinerOps}[1] <b>must</b> be {@link #VK_FRAGMENT_SHADING_RATE_COMBINER_OP_KEEP_KHR FRAGMENT_SHADING_RATE_COMBINER_OP_KEEP_KHR}</li>
     * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-fragmentShadingRateNonTrivialCombinerOps">{@code fragmentSizeNonTrivialCombinerOps}</a> limit is not supported, elements of {@code combinerOps} <b>must</b> be either {@link #VK_FRAGMENT_SHADING_RATE_COMBINER_OP_KEEP_KHR FRAGMENT_SHADING_RATE_COMBINER_OP_KEEP_KHR} or {@link #VK_FRAGMENT_SHADING_RATE_COMBINER_OP_REPLACE_KHR FRAGMENT_SHADING_RATE_COMBINER_OP_REPLACE_KHR}</li>
     * <li>{@code pFragmentSize→width} <b>must</b> be greater than or equal to 1</li>
     * <li>{@code pFragmentSize→height} <b>must</b> be greater than or equal to 1</li>
     * <li>{@code pFragmentSize→width} <b>must</b> be a power-of-two value</li>
     * <li>{@code pFragmentSize→height} <b>must</b> be a power-of-two value</li>
     * <li>{@code pFragmentSize→width} <b>must</b> be less than or equal to 4</li>
     * <li>{@code pFragmentSize→height} <b>must</b> be less than or equal to 4</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pFragmentSize} <b>must</b> be a valid pointer to a valid {@link VkExtent2D} structure</li>
     * <li>Any given element of {@code combinerOps} <b>must</b> be a valid {@code VkFragmentShadingRateCombinerOpKHR} value</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
     * <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Command Properties</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkExtent2D}</p>
     *
     * @param commandBuffer the command buffer into which the command will be recorded.
     * @param pFragmentSize specifies the pipeline fragment shading rate for subsequent drawing commands.
     * @param combinerOps   specifies a {@code VkFragmentShadingRateCombinerOpKHR} determining how the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-fragment-shading-rate-pipeline">pipeline</a>, <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-fragment-shading-rate-primitive">primitive</a>, and <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-fragment-shading-rate-attachment">attachment shading rates</a> are <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-fragment-shading-rate-combining">combined</a> for fragments generated by subsequent drawing commands.
     */
    public static void vkCmdSetFragmentShadingRateKHR(VkCommandBuffer commandBuffer, @NativeType("VkExtent2D const *") VkExtent2D pFragmentSize, @NativeType("VkFragmentShadingRateCombinerOpKHR const *") IntBuffer combinerOps) {
        if (CHECKS) {
            check(combinerOps, 2);
        }
        nvkCmdSetFragmentShadingRateKHR(commandBuffer, pFragmentSize.address(), memAddress(combinerOps));
    }

    /** Array version of: {@link #vkGetPhysicalDeviceFragmentShadingRatesKHR GetPhysicalDeviceFragmentShadingRatesKHR} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceFragmentShadingRatesKHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") int[] pFragmentShadingRateCount, @Nullable @NativeType("VkPhysicalDeviceFragmentShadingRateKHR *") VkPhysicalDeviceFragmentShadingRateKHR.Buffer pFragmentShadingRates) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceFragmentShadingRatesKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pFragmentShadingRateCount, 1);
            checkSafe(pFragmentShadingRates, pFragmentShadingRateCount[0]);
        }
        return callPPPI(physicalDevice.address(), pFragmentShadingRateCount, memAddressSafe(pFragmentShadingRates), __functionAddress);
    }

    /** Array version of: {@link #vkCmdSetFragmentShadingRateKHR CmdSetFragmentShadingRateKHR} */
    public static void vkCmdSetFragmentShadingRateKHR(VkCommandBuffer commandBuffer, @NativeType("VkExtent2D const *") VkExtent2D pFragmentSize, @NativeType("VkFragmentShadingRateCombinerOpKHR const *") int[] combinerOps) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetFragmentShadingRateKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(combinerOps, 2);
        }
        callPPPV(commandBuffer.address(), pFragmentSize.address(), combinerOps, __functionAddress);
    }

}
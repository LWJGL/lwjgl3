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
 * When using a framebuffer with mixed samples, a per-fragment coverage reduction operation is performed which generates color sample coverage from the pixel coverage. This extension defines the following modes to control how this reduction is performed.
 * 
 * <ul>
 * <li>Merge: When there are more samples in the pixel coverage than color samples, there is an implementation-dependent association of each pixel coverage sample to a color sample. In the merge mode, the color sample coverage is computed such that only if any associated sample in the pixel coverage is covered, the color sample is covered. This is the default mode.</li>
 * <li>Truncate: When there are more raster samples (N) than color samples(M), there is one to one association of the first M raster samples to the M color samples; other raster samples are ignored.</li>
 * </ul>
 * 
 * <p>When the number of raster samples is equal to the color samples, there is a one to one mapping between them in either of the above modes.</p>
 * 
 * <p>The new command {@link #vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV GetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV} can be used to query the various raster, color, depth/stencil sample count and reduction mode combinations that are supported by the implementation. This extension would allow an implementation to support the behavior of both {@code VK_NV_framebuffer_mixed_samples} and {@code VK_AMD_mixed_attachment_samples} extensions simultaneously.</p>
 * 
 * <h5>VK_NV_coverage_reduction_mode</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_NV_coverage_reduction_mode}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>251</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Kedarnath Thangudu <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NV_coverage_reduction_mode]%20@kthangudu%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NV_coverage_reduction_mode%20extension%3E%3E">kthangudu</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2019-01-29</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Kedarnath Thangudu, NVIDIA</li>
 * <li>Jeff Bolz, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public class NVCoverageReductionMode {

    /** The extension specification version. */
    public static final int VK_NV_COVERAGE_REDUCTION_MODE_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_NV_COVERAGE_REDUCTION_MODE_EXTENSION_NAME = "VK_NV_coverage_reduction_mode";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COVERAGE_REDUCTION_MODE_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_COVERAGE_REDUCTION_MODE_FEATURES_NV}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PIPELINE_COVERAGE_REDUCTION_STATE_CREATE_INFO_NV STRUCTURE_TYPE_PIPELINE_COVERAGE_REDUCTION_STATE_CREATE_INFO_NV}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_FRAMEBUFFER_MIXED_SAMPLES_COMBINATION_NV STRUCTURE_TYPE_FRAMEBUFFER_MIXED_SAMPLES_COMBINATION_NV}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COVERAGE_REDUCTION_MODE_FEATURES_NV = 1000250000,
        VK_STRUCTURE_TYPE_PIPELINE_COVERAGE_REDUCTION_STATE_CREATE_INFO_NV    = 1000250001,
        VK_STRUCTURE_TYPE_FRAMEBUFFER_MIXED_SAMPLES_COMBINATION_NV            = 1000250002;

    /**
     * VkCoverageReductionModeNV - Specify the coverage reduction mode
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_COVERAGE_REDUCTION_MODE_MERGE_NV COVERAGE_REDUCTION_MODE_MERGE_NV} specifies that each color sample will be associated with an implementation-dependent subset of samples in the pixel coverage. If any of those associated samples are covered, the color sample is covered.</li>
     * <li>{@link #VK_COVERAGE_REDUCTION_MODE_TRUNCATE_NV COVERAGE_REDUCTION_MODE_TRUNCATE_NV} specifies that for color samples present in the color attachments, a color sample is covered if the pixel coverage sample with the same <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-multisampling-coverage-mask">sample index</a> <code>i</code> is covered; other pixel coverage samples are discarded.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkFramebufferMixedSamplesCombinationNV}, {@link VkPipelineCoverageReductionStateCreateInfoNV}</p>
     */
    public static final int
        VK_COVERAGE_REDUCTION_MODE_MERGE_NV    = 0,
        VK_COVERAGE_REDUCTION_MODE_TRUNCATE_NV = 1;

    protected NVCoverageReductionMode() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV ] ---

    /**
     * Unsafe version of: {@link #vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV GetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV}
     *
     * @param pCombinationCount a pointer to an integer related to the number of combinations available or queried, as described below.
     */
    public static int nvkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV(VkPhysicalDevice physicalDevice, long pCombinationCount, long pCombinations) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(physicalDevice.address(), pCombinationCount, pCombinations, __functionAddress);
    }

    /**
     * Query supported sample count combinations.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To query the set of mixed sample combinations of coverage reduction mode, rasterization samples and color, depth, stencil attachment sample counts that are supported by a physical device, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV(
     *     VkPhysicalDevice                            physicalDevice,
     *     uint32_t*                                   pCombinationCount,
     *     VkFramebufferMixedSamplesCombinationNV*     pCombinations);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>If {@code pCombinations} is {@code NULL}, then the number of supported combinations for the given {@code physicalDevice} is returned in {@code pCombinationCount}. Otherwise, {@code pCombinationCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pCombinations} array, and on return the variable is overwritten with the number of values actually written to {@code pCombinations}. If the value of {@code pCombinationCount} is less than the number of combinations supported for the given {@code physicalDevice}, at most {@code pCombinationCount} values will be written to {@code pCombinations}, and {@link VK10#VK_INCOMPLETE INCOMPLETE} will be returned instead of {@link VK10#VK_SUCCESS SUCCESS}, to indicate that not all the supported values were returned.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
     * <li>{@code pCombinationCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
     * <li>If the value referenced by {@code pCombinationCount} is not 0, and {@code pCombinations} is not {@code NULL}, {@code pCombinations} <b>must</b> be a valid pointer to an array of {@code pCombinationCount} {@link VkFramebufferMixedSamplesCombinationNV} structures</li>
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
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkFramebufferMixedSamplesCombinationNV}</p>
     *
     * @param physicalDevice    the physical device from which to query the set of combinations.
     * @param pCombinationCount a pointer to an integer related to the number of combinations available or queried, as described below.
     * @param pCombinations     either {@code NULL} or a pointer to an array of {@link VkFramebufferMixedSamplesCombinationNV} values, indicating the supported combinations of coverage reduction mode, rasterization samples, and color, depth, stencil attachment sample counts.
     */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") IntBuffer pCombinationCount, @Nullable @NativeType("VkFramebufferMixedSamplesCombinationNV *") VkFramebufferMixedSamplesCombinationNV.Buffer pCombinations) {
        if (CHECKS) {
            check(pCombinationCount, 1);
            checkSafe(pCombinations, pCombinationCount.get(pCombinationCount.position()));
        }
        return nvkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV(physicalDevice, memAddress(pCombinationCount), memAddressSafe(pCombinations));
    }

    /** Array version of: {@link #vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV GetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") int[] pCombinationCount, @Nullable @NativeType("VkFramebufferMixedSamplesCombinationNV *") VkFramebufferMixedSamplesCombinationNV.Buffer pCombinations) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV;
        if (CHECKS) {
            check(__functionAddress);
            check(pCombinationCount, 1);
            checkSafe(pCombinations, pCombinationCount[0]);
        }
        return callPPPI(physicalDevice.address(), pCombinationCount, memAddressSafe(pCombinations), __functionAddress);
    }

}
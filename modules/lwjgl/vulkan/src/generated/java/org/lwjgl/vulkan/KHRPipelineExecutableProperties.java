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
 * When a pipeline is created, its state and shaders are compiled into zero or more device-specific executables, which are used when executing commands against that pipeline. This extension adds a mechanism to query properties and statistics about the different executables produced by the pipeline compilation process. This is intended to be used by debugging and performance tools to allow them to provide more detailed information to the user. Certain compile-time shader statistics provided through this extension may be useful to developers for debugging or performance analysis.
 * 
 * <h5>VK_KHR_pipeline_executable_properties</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_pipeline_executable_properties}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>270</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
 * </ul></dd>
 * <dt><b>Special Use</b></dt>
 * <dd><ul>
 * <li><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#extendingvulkan-compatibility-specialuse">Developer tools</a></li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Jason Ekstrand <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_KHR_pipeline_executable_properties:%20&amp;body=@jekstrand%20">jekstrand</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2019-05-28</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Jason Ekstrand, Intel</li>
 * <li>Ian Romanick, Intel</li>
 * <li>Kenneth Graunke, Intel</li>
 * <li>Baldur Karlsson, Valve</li>
 * <li>Jesse Hall, Google</li>
 * <li>Jeff Bolz, Nvidia</li>
 * <li>Piers Daniel, Nvidia</li>
 * <li>Tobias Hector, AMD</li>
 * <li>Jan-Harald Fredriksen, ARM</li>
 * <li>Tom Olson, ARM</li>
 * <li>Daniel Koch, Nvidia</li>
 * <li>Spencer Fricke, Samsung</li>
 * </ul></dd>
 * </dl>
 */
public class KHRPipelineExecutableProperties {

    /** The extension specification version. */
    public static final int VK_KHR_PIPELINE_EXECUTABLE_PROPERTIES_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_PIPELINE_EXECUTABLE_PROPERTIES_EXTENSION_NAME = "VK_KHR_pipeline_executable_properties";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_EXECUTABLE_PROPERTIES_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_EXECUTABLE_PROPERTIES_FEATURES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PIPELINE_INFO_KHR STRUCTURE_TYPE_PIPELINE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_PROPERTIES_KHR STRUCTURE_TYPE_PIPELINE_EXECUTABLE_PROPERTIES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_INFO_KHR STRUCTURE_TYPE_PIPELINE_EXECUTABLE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_STATISTIC_KHR STRUCTURE_TYPE_PIPELINE_EXECUTABLE_STATISTIC_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_INTERNAL_REPRESENTATION_KHR STRUCTURE_TYPE_PIPELINE_EXECUTABLE_INTERNAL_REPRESENTATION_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_EXECUTABLE_PROPERTIES_FEATURES_KHR = 1000269000,
        VK_STRUCTURE_TYPE_PIPELINE_INFO_KHR                                           = 1000269001,
        VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_PROPERTIES_KHR                          = 1000269002,
        VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_INFO_KHR                                = 1000269003,
        VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_STATISTIC_KHR                           = 1000269004,
        VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_INTERNAL_REPRESENTATION_KHR             = 1000269005;

    /**
     * Extends {@code VkPipelineCreateFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_PIPELINE_CREATE_CAPTURE_STATISTICS_BIT_KHR PIPELINE_CREATE_CAPTURE_STATISTICS_BIT_KHR}</li>
     * <li>{@link #VK_PIPELINE_CREATE_CAPTURE_INTERNAL_REPRESENTATIONS_BIT_KHR PIPELINE_CREATE_CAPTURE_INTERNAL_REPRESENTATIONS_BIT_KHR}</li>
     * </ul>
     */
    public static final int
        VK_PIPELINE_CREATE_CAPTURE_STATISTICS_BIT_KHR               = 0x40,
        VK_PIPELINE_CREATE_CAPTURE_INTERNAL_REPRESENTATIONS_BIT_KHR = 0x80;

    /**
     * VkPipelineExecutableStatisticFormatKHR - Enum describing a pipeline executable statistic
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_BOOL32_KHR PIPELINE_EXECUTABLE_STATISTIC_FORMAT_BOOL32_KHR} specifies that the statistic is returned as a 32-bit boolean value which <b>must</b> be either {@link VK10#VK_TRUE TRUE} or {@link VK10#VK_FALSE FALSE} and <b>should</b> be read from the {@code b32} field of {@link VkPipelineExecutableStatisticValueKHR}.</li>
     * <li>{@link #VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_INT64_KHR PIPELINE_EXECUTABLE_STATISTIC_FORMAT_INT64_KHR} specifies that the statistic is returned as a signed 64-bit integer and <b>should</b> be read from the {@code i64} field of {@link VkPipelineExecutableStatisticValueKHR}.</li>
     * <li>{@link #VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_UINT64_KHR PIPELINE_EXECUTABLE_STATISTIC_FORMAT_UINT64_KHR} specifies that the statistic is returned as an unsigned 64-bit integer and <b>should</b> be read from the {@code u64} field of {@link VkPipelineExecutableStatisticValueKHR}.</li>
     * <li>{@link #VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_FLOAT64_KHR PIPELINE_EXECUTABLE_STATISTIC_FORMAT_FLOAT64_KHR} specifies that the statistic is returned as a 64-bit floating-point value and <b>should</b> be read from the {@code f64} field of {@link VkPipelineExecutableStatisticValueKHR}.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkPipelineExecutableStatisticKHR}</p>
     */
    public static final int
        VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_BOOL32_KHR  = 0,
        VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_INT64_KHR   = 1,
        VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_UINT64_KHR  = 2,
        VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_FLOAT64_KHR = 3;

    protected KHRPipelineExecutableProperties() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetPipelineExecutablePropertiesKHR ] ---

    /**
     * Unsafe version of: {@link #vkGetPipelineExecutablePropertiesKHR GetPipelineExecutablePropertiesKHR}
     *
     * @param pExecutableCount a pointer to an integer related to the number of pipeline executables available or queried, as described below.
     */
    public static int nvkGetPipelineExecutablePropertiesKHR(VkDevice device, long pPipelineInfo, long pExecutableCount, long pProperties) {
        long __functionAddress = device.getCapabilities().vkGetPipelineExecutablePropertiesKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(device.address(), pPipelineInfo, pExecutableCount, pProperties, __functionAddress);
    }

    /**
     * Get the executables associated with a pipeline.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>When a pipeline is created, its state and shaders are compiled into zero or more device-specific executables, which are used when executing commands against that pipeline. To query the properties of these executables, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetPipelineExecutablePropertiesKHR(
     *     VkDevice                                    device,
     *     const VkPipelineInfoKHR*                    pPipelineInfo,
     *     uint32_t*                                   pExecutableCount,
     *     VkPipelineExecutablePropertiesKHR*          pProperties);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>If {@code pProperties} is {@code NULL}, then the number of executables associated with the pipeline is returned in {@code pExecutableCount}. Otherwise, {@code pExecutableCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pProperties} array, and on return the variable is overwritten with the number of structures actually written to {@code pProperties}. If {@code pExecutableCount} is less than the number of executables associated with the pipeline, at most {@code pExecutableCount} structures will be written and {@code vkGetPipelineExecutablePropertiesKHR} will return {@link VK10#VK_INCOMPLETE INCOMPLETE}.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-pipelineExecutableInfo">{@code pipelineExecutableInfo}</a> <b>must</b> be enabled</li>
     * <li>{@code pipeline} member of {@code pPipelineInfo} <b>must</b> have been created with {@code device}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pPipelineInfo} <b>must</b> be a valid pointer to a valid {@link VkPipelineInfoKHR} structure</li>
     * <li>{@code pExecutableCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
     * <li>If the value referenced by {@code pExecutableCount} is not 0, and {@code pProperties} is not {@code NULL}, {@code pProperties} <b>must</b> be a valid pointer to an array of {@code pExecutableCount} {@link VkPipelineExecutablePropertiesKHR} structures</li>
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
     * <p>{@link VkPipelineExecutablePropertiesKHR}, {@link VkPipelineInfoKHR}</p>
     *
     * @param device           the device that created the pipeline.
     * @param pPipelineInfo    describes the pipeline being queried.
     * @param pExecutableCount a pointer to an integer related to the number of pipeline executables available or queried, as described below.
     * @param pProperties      either {@code NULL} or a pointer to an array of {@link VkPipelineExecutablePropertiesKHR} structures.
     */
    @NativeType("VkResult")
    public static int vkGetPipelineExecutablePropertiesKHR(VkDevice device, @NativeType("VkPipelineInfoKHR const *") VkPipelineInfoKHR pPipelineInfo, @NativeType("uint32_t *") IntBuffer pExecutableCount, @Nullable @NativeType("VkPipelineExecutablePropertiesKHR *") VkPipelineExecutablePropertiesKHR.Buffer pProperties) {
        if (CHECKS) {
            check(pExecutableCount, 1);
            checkSafe(pProperties, pExecutableCount.get(pExecutableCount.position()));
        }
        return nvkGetPipelineExecutablePropertiesKHR(device, pPipelineInfo.address(), memAddress(pExecutableCount), memAddressSafe(pProperties));
    }

    // --- [ vkGetPipelineExecutableStatisticsKHR ] ---

    /**
     * Unsafe version of: {@link #vkGetPipelineExecutableStatisticsKHR GetPipelineExecutableStatisticsKHR}
     *
     * @param pStatisticCount a pointer to an integer related to the number of statistics available or queried, as described below.
     */
    public static int nvkGetPipelineExecutableStatisticsKHR(VkDevice device, long pExecutableInfo, long pStatisticCount, long pStatistics) {
        long __functionAddress = device.getCapabilities().vkGetPipelineExecutableStatisticsKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(device.address(), pExecutableInfo, pStatisticCount, pStatistics, __functionAddress);
    }

    /**
     * Get compile time statistics associated with a pipeline executable.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Each pipeline executable <b>may</b> have a set of statistics associated with it that are generated by the pipeline compilation process. These statistics <b>may</b> include things such as instruction counts, amount of spilling (if any), maximum number of simultaneous threads, or anything else which <b>may</b> aid developers in evaluating the expected performance of a shader. To query the compile-time statistics associated with a pipeline executable, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetPipelineExecutableStatisticsKHR(
     *     VkDevice                                    device,
     *     const VkPipelineExecutableInfoKHR*          pExecutableInfo,
     *     uint32_t*                                   pStatisticCount,
     *     VkPipelineExecutableStatisticKHR*           pStatistics);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>If {@code pStatistics} is {@code NULL}, then the number of statistics associated with the pipeline executable is returned in {@code pStatisticCount}. Otherwise, {@code pStatisticCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pStatistics} array, and on return the variable is overwritten with the number of structures actually written to {@code pStatistics}. If {@code pStatisticCount} is less than the number of statistics associated with the pipeline executable, at most {@code pStatisticCount} structures will be written and {@code vkGetPipelineExecutableStatisticsKHR} will return {@link VK10#VK_INCOMPLETE INCOMPLETE}.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-pipelineExecutableInfo">{@code pipelineExecutableInfo}</a> <b>must</b> be enabled</li>
     * <li>{@code pipeline} member of {@code pExecutableInfo} <b>must</b> have been created with {@code device}</li>
     * <li>{@code pipeline} member of {@code pExecutableInfo} <b>must</b> have been created with {@link #VK_PIPELINE_CREATE_CAPTURE_STATISTICS_BIT_KHR PIPELINE_CREATE_CAPTURE_STATISTICS_BIT_KHR}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pExecutableInfo} <b>must</b> be a valid pointer to a valid {@link VkPipelineExecutableInfoKHR} structure</li>
     * <li>{@code pStatisticCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
     * <li>If the value referenced by {@code pStatisticCount} is not 0, and {@code pStatistics} is not {@code NULL}, {@code pStatistics} <b>must</b> be a valid pointer to an array of {@code pStatisticCount} {@link VkPipelineExecutableStatisticKHR} structures</li>
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
     * <p>{@link VkPipelineExecutableInfoKHR}, {@link VkPipelineExecutableStatisticKHR}</p>
     *
     * @param device          the device that created the pipeline.
     * @param pExecutableInfo describes the pipeline executable being queried.
     * @param pStatisticCount a pointer to an integer related to the number of statistics available or queried, as described below.
     * @param pStatistics     either {@code NULL} or a pointer to an array of {@link VkPipelineExecutableStatisticKHR} structures.
     */
    @NativeType("VkResult")
    public static int vkGetPipelineExecutableStatisticsKHR(VkDevice device, @NativeType("VkPipelineExecutableInfoKHR const *") VkPipelineExecutableInfoKHR pExecutableInfo, @NativeType("uint32_t *") IntBuffer pStatisticCount, @Nullable @NativeType("VkPipelineExecutableStatisticKHR *") VkPipelineExecutableStatisticKHR.Buffer pStatistics) {
        if (CHECKS) {
            check(pStatisticCount, 1);
            checkSafe(pStatistics, pStatisticCount.get(pStatisticCount.position()));
        }
        return nvkGetPipelineExecutableStatisticsKHR(device, pExecutableInfo.address(), memAddress(pStatisticCount), memAddressSafe(pStatistics));
    }

    // --- [ vkGetPipelineExecutableInternalRepresentationsKHR ] ---

    /**
     * Unsafe version of: {@link #vkGetPipelineExecutableInternalRepresentationsKHR GetPipelineExecutableInternalRepresentationsKHR}
     *
     * @param pInternalRepresentationCount a pointer to an integer related to the number of internal representations available or queried, as described below.
     */
    public static int nvkGetPipelineExecutableInternalRepresentationsKHR(VkDevice device, long pExecutableInfo, long pInternalRepresentationCount, long pInternalRepresentations) {
        long __functionAddress = device.getCapabilities().vkGetPipelineExecutableInternalRepresentationsKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(device.address(), pExecutableInfo, pInternalRepresentationCount, pInternalRepresentations, __functionAddress);
    }

    /**
     * Get internal representations of the pipeline executable.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Each pipeline executable <b>may</b> have one or more text or binary internal representations associated with it which are generated as part of the compile process. These <b>may</b> include the final shader assembly, a binary form of the compiled shader, or the shader compiler's internal representation at any number of intermediate compile steps. To query the internal representations associated with a pipeline executable, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetPipelineExecutableInternalRepresentationsKHR(
     *     VkDevice                                    device,
     *     const VkPipelineExecutableInfoKHR*          pExecutableInfo,
     *     uint32_t*                                   pInternalRepresentationCount,
     *     VkPipelineExecutableInternalRepresentationKHR* pInternalRepresentations);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>If {@code pInternalRepresentations} is {@code NULL}, then the number of internal representations associated with the pipeline executable is returned in {@code pInternalRepresentationCount}. Otherwise, {@code pInternalRepresentationCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pInternalRepresentations} array, and on return the variable is overwritten with the number of structures actually written to {@code pInternalRepresentations}. If {@code pInternalRepresentationCount} is less than the number of internal representations associated with the pipeline executable, at most {@code pInternalRepresentationCount} structures will be written and {@code vkGetPipelineExecutableInternalRepresentationsKHR} will return {@link VK10#VK_INCOMPLETE INCOMPLETE}.</p>
     * 
     * <p>While the details of the internal representations remain implementation dependent, the implementation <b>should</b> order the internal representations in the order in which they occur in the compile pipeline with the final shader assembly (if any) last.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-pipelineExecutableInfo">{@code pipelineExecutableInfo}</a> <b>must</b> be enabled</li>
     * <li>{@code pipeline} member of {@code pExecutableInfo} <b>must</b> have been created with {@code device}</li>
     * <li>{@code pipeline} member of {@code pExecutableInfo} <b>must</b> have been created with {@link #VK_PIPELINE_CREATE_CAPTURE_INTERNAL_REPRESENTATIONS_BIT_KHR PIPELINE_CREATE_CAPTURE_INTERNAL_REPRESENTATIONS_BIT_KHR}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pExecutableInfo} <b>must</b> be a valid pointer to a valid {@link VkPipelineExecutableInfoKHR} structure</li>
     * <li>{@code pInternalRepresentationCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
     * <li>If the value referenced by {@code pInternalRepresentationCount} is not 0, and {@code pInternalRepresentations} is not {@code NULL}, {@code pInternalRepresentations} <b>must</b> be a valid pointer to an array of {@code pInternalRepresentationCount} {@link VkPipelineExecutableInternalRepresentationKHR} structures</li>
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
     * <p>{@link VkPipelineExecutableInfoKHR}, {@link VkPipelineExecutableInternalRepresentationKHR}</p>
     *
     * @param device                       the device that created the pipeline.
     * @param pExecutableInfo              describes the pipeline executable being queried.
     * @param pInternalRepresentationCount a pointer to an integer related to the number of internal representations available or queried, as described below.
     * @param pInternalRepresentations     either {@code NULL} or a pointer to an array of {@link VkPipelineExecutableInternalRepresentationKHR} structures.
     */
    @NativeType("VkResult")
    public static int vkGetPipelineExecutableInternalRepresentationsKHR(VkDevice device, @NativeType("VkPipelineExecutableInfoKHR const *") VkPipelineExecutableInfoKHR pExecutableInfo, @NativeType("uint32_t *") IntBuffer pInternalRepresentationCount, @Nullable @NativeType("VkPipelineExecutableInternalRepresentationKHR *") VkPipelineExecutableInternalRepresentationKHR.Buffer pInternalRepresentations) {
        if (CHECKS) {
            check(pInternalRepresentationCount, 1);
            checkSafe(pInternalRepresentations, pInternalRepresentationCount.get(pInternalRepresentationCount.position()));
        }
        return nvkGetPipelineExecutableInternalRepresentationsKHR(device, pExecutableInfo.address(), memAddress(pInternalRepresentationCount), memAddressSafe(pInternalRepresentations));
    }

    /** Array version of: {@link #vkGetPipelineExecutablePropertiesKHR GetPipelineExecutablePropertiesKHR} */
    @NativeType("VkResult")
    public static int vkGetPipelineExecutablePropertiesKHR(VkDevice device, @NativeType("VkPipelineInfoKHR const *") VkPipelineInfoKHR pPipelineInfo, @NativeType("uint32_t *") int[] pExecutableCount, @Nullable @NativeType("VkPipelineExecutablePropertiesKHR *") VkPipelineExecutablePropertiesKHR.Buffer pProperties) {
        long __functionAddress = device.getCapabilities().vkGetPipelineExecutablePropertiesKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pExecutableCount, 1);
            checkSafe(pProperties, pExecutableCount[0]);
        }
        return callPPPPI(device.address(), pPipelineInfo.address(), pExecutableCount, memAddressSafe(pProperties), __functionAddress);
    }

    /** Array version of: {@link #vkGetPipelineExecutableStatisticsKHR GetPipelineExecutableStatisticsKHR} */
    @NativeType("VkResult")
    public static int vkGetPipelineExecutableStatisticsKHR(VkDevice device, @NativeType("VkPipelineExecutableInfoKHR const *") VkPipelineExecutableInfoKHR pExecutableInfo, @NativeType("uint32_t *") int[] pStatisticCount, @Nullable @NativeType("VkPipelineExecutableStatisticKHR *") VkPipelineExecutableStatisticKHR.Buffer pStatistics) {
        long __functionAddress = device.getCapabilities().vkGetPipelineExecutableStatisticsKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pStatisticCount, 1);
            checkSafe(pStatistics, pStatisticCount[0]);
        }
        return callPPPPI(device.address(), pExecutableInfo.address(), pStatisticCount, memAddressSafe(pStatistics), __functionAddress);
    }

    /** Array version of: {@link #vkGetPipelineExecutableInternalRepresentationsKHR GetPipelineExecutableInternalRepresentationsKHR} */
    @NativeType("VkResult")
    public static int vkGetPipelineExecutableInternalRepresentationsKHR(VkDevice device, @NativeType("VkPipelineExecutableInfoKHR const *") VkPipelineExecutableInfoKHR pExecutableInfo, @NativeType("uint32_t *") int[] pInternalRepresentationCount, @Nullable @NativeType("VkPipelineExecutableInternalRepresentationKHR *") VkPipelineExecutableInternalRepresentationKHR.Buffer pInternalRepresentations) {
        long __functionAddress = device.getCapabilities().vkGetPipelineExecutableInternalRepresentationsKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pInternalRepresentationCount, 1);
            checkSafe(pInternalRepresentations, pInternalRepresentationCount[0]);
        }
        return callPPPPI(device.address(), pExecutableInfo.address(), pInternalRepresentationCount, memAddressSafe(pInternalRepresentations), __functionAddress);
    }

}
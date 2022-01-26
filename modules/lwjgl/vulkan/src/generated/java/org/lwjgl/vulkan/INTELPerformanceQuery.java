/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * This extension allows an application to capture performance data to be interpreted by a external application or library.
 * 
 * <p>Such a library is available at : <a target="_blank" href="https://github.com/intel/metrics-discovery">https://github.com/intel/metrics-discovery</a></p>
 * 
 * <p>Performance analysis tools such as <a target="_blank" href="https://software.intel.com/content/www/us/en/develop/tools/graphics-performance-analyzers.html">Graphics Performance Analyzers</a> make use of this extension and the metrics-discovery library to present the data in a human readable way.</p>
 * 
 * <h5>Example Code</h5>
 * 
 * <pre><code>
 * // A previously created device
 * VkDevice device;
 * 
 * // A queue derived from the device
 * VkQueue queue;
 * 
 * VkInitializePerformanceApiInfoINTEL performanceApiInfoIntel = {
 *   VK_STRUCTURE_TYPE_INITIALIZE_PERFORMANCE_API_INFO_INTEL,
 *   NULL,
 *   NULL
 * };
 * 
 * vkInitializePerformanceApiINTEL(
 *   device,
 *   &amp;performanceApiInfoIntel);
 * 
 * VkQueryPoolPerformanceQueryCreateInfoINTEL queryPoolIntel = {
 *   VK_STRUCTURE_TYPE_QUERY_POOL_CREATE_INFO_INTEL,
 *   NULL,
 *   VK_QUERY_POOL_SAMPLING_MODE_MANUAL_INTEL,
 * };
 * 
 * VkQueryPoolCreateInfo queryPoolCreateInfo = {
 *   VK_STRUCTURE_TYPE_QUERY_POOL_CREATE_INFO,
 *   &amp;queryPoolIntel,
 *   0,
 *   VK_QUERY_TYPE_PERFORMANCE_QUERY_INTEL,
 *   1,
 *   0
 * };
 * 
 * VkQueryPool queryPool;
 * 
 * VkResult result = vkCreateQueryPool(
 *   device,
 *   &amp;queryPoolCreateInfo,
 *   NULL,
 *   &amp;queryPool);
 * 
 * assert(VK_SUCCESS == result);
 * 
 * // A command buffer we want to record counters on
 * VkCommandBuffer commandBuffer;
 * 
 * VkCommandBufferBeginInfo commandBufferBeginInfo = {
 *   VK_STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO,
 *   NULL,
 *   VK_COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT,
 *   NULL
 * };
 * 
 * result = vkBeginCommandBuffer(commandBuffer, &amp;commandBufferBeginInfo);
 * 
 * assert(VK_SUCCESS == result);
 * 
 * vkCmdResetQueryPool(
 *   commandBuffer,
 *   queryPool,
 *   0,
 *   1);
 * 
 * vkCmdBeginQuery(
 *   commandBuffer,
 *   queryPool,
 *   0,
 *   0);
 * 
 * // Perform the commands you want to get performance information on
 * // ...
 * 
 * // Perform a barrier to ensure all previous commands were complete before
 * // ending the query
 * vkCmdPipelineBarrier(commandBuffer,
 *   VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT,
 *   VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT,
 *   0,
 *   0,
 *   NULL,
 *   0,
 *   NULL,
 *   0,
 *   NULL);
 * 
 * vkCmdEndQuery(
 *   commandBuffer,
 *   queryPool,
 *   0);
 * 
 * result = vkEndCommandBuffer(commandBuffer);
 * 
 * assert(VK_SUCCESS == result);
 * 
 * VkPerformanceConfigurationAcquireInfoINTEL performanceConfigurationAcquireInfo = {
 *   VK_STRUCTURE_TYPE_PERFORMANCE_CONFIGURATION_ACQUIRE_INFO_INTEL,
 *   NULL,
 *   VK_PERFORMANCE_CONFIGURATION_TYPE_COMMAND_QUEUE_METRICS_DISCOVERY_ACTIVATED_INTEL
 * };
 * 
 * VkPerformanceConfigurationINTEL performanceConfigurationIntel;
 * 
 * result = vkAcquirePerformanceConfigurationINTEL(
 *   device,
 *   &amp;performanceConfigurationAcquireInfo,
 *   &amp;performanceConfigurationIntel);
 * 
 * vkQueueSetPerformanceConfigurationINTEL(queue, performanceConfigurationIntel);
 * 
 * assert(VK_SUCCESS == result);
 * 
 * // Submit the command buffer and wait for its completion
 * // ...
 * 
 * result = vkReleasePerformanceConfigurationINTEL(
 *   device,
 *   performanceConfigurationIntel);
 * 
 * assert(VK_SUCCESS == result);
 * 
 * // Get the report size from metrics-discovery's QueryReportSize
 * 
 * result = vkGetQueryPoolResults(
 *   device,
 *   queryPool,
 *   0, 1, QueryReportSize,
 *   data, QueryReportSize, 0);
 * 
 * assert(VK_SUCCESS == result);
 * 
 * // The data can then be passed back to metrics-discovery from which
 * // human readable values can be queried.</code></pre>
 * 
 * <h5>VK_INTEL_performance_query</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_INTEL_performance_query}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>211</dd>
 * <dt><b>Revision</b></dt>
 * <dd>2</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * </ul></dd>
 * <dt><b>Special Use</b></dt>
 * <dd><ul>
 * <li><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#extendingvulkan-compatibility-specialuse">Developer tools</a></li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Lionel Landwerlin <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_INTEL_performance_query]%20@llandwerlin%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_INTEL_performance_query%20extension%3E%3E">llandwerlin</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2018-05-16</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Lionel Landwerlin, Intel</li>
 * <li>Piotr Maciejewski, Intel</li>
 * </ul></dd>
 * </dl>
 */
public class INTELPerformanceQuery {

    /** The extension specification version. */
    public static final int VK_INTEL_PERFORMANCE_QUERY_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String VK_INTEL_PERFORMANCE_QUERY_EXTENSION_NAME = "VK_INTEL_performance_query";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_QUERY_POOL_PERFORMANCE_QUERY_CREATE_INFO_INTEL STRUCTURE_TYPE_QUERY_POOL_PERFORMANCE_QUERY_CREATE_INFO_INTEL}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_QUERY_POOL_CREATE_INFO_INTEL STRUCTURE_TYPE_QUERY_POOL_CREATE_INFO_INTEL}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_INITIALIZE_PERFORMANCE_API_INFO_INTEL STRUCTURE_TYPE_INITIALIZE_PERFORMANCE_API_INFO_INTEL}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PERFORMANCE_MARKER_INFO_INTEL STRUCTURE_TYPE_PERFORMANCE_MARKER_INFO_INTEL}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PERFORMANCE_STREAM_MARKER_INFO_INTEL STRUCTURE_TYPE_PERFORMANCE_STREAM_MARKER_INFO_INTEL}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PERFORMANCE_OVERRIDE_INFO_INTEL STRUCTURE_TYPE_PERFORMANCE_OVERRIDE_INFO_INTEL}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PERFORMANCE_CONFIGURATION_ACQUIRE_INFO_INTEL STRUCTURE_TYPE_PERFORMANCE_CONFIGURATION_ACQUIRE_INFO_INTEL}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_QUERY_POOL_PERFORMANCE_QUERY_CREATE_INFO_INTEL = 1000210000,
        VK_STRUCTURE_TYPE_QUERY_POOL_CREATE_INFO_INTEL                   = 1000210000,
        VK_STRUCTURE_TYPE_INITIALIZE_PERFORMANCE_API_INFO_INTEL          = 1000210001,
        VK_STRUCTURE_TYPE_PERFORMANCE_MARKER_INFO_INTEL                  = 1000210002,
        VK_STRUCTURE_TYPE_PERFORMANCE_STREAM_MARKER_INFO_INTEL           = 1000210003,
        VK_STRUCTURE_TYPE_PERFORMANCE_OVERRIDE_INFO_INTEL                = 1000210004,
        VK_STRUCTURE_TYPE_PERFORMANCE_CONFIGURATION_ACQUIRE_INFO_INTEL   = 1000210005;

    /** Extends {@code VkQueryType}. */
    public static final int VK_QUERY_TYPE_PERFORMANCE_QUERY_INTEL = 1000210000;

    /** Extends {@code VkObjectType}. */
    public static final int VK_OBJECT_TYPE_PERFORMANCE_CONFIGURATION_INTEL = 1000210000;

    /**
     * VkPerformanceConfigurationTypeINTEL - Type of performance configuration
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkPerformanceConfigurationAcquireInfoINTEL}</p>
     */
    public static final int VK_PERFORMANCE_CONFIGURATION_TYPE_COMMAND_QUEUE_METRICS_DISCOVERY_ACTIVATED_INTEL = 0;

    /**
     * VkQueryPoolSamplingModeINTEL - Enum specifying how performance queries should be captured
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_QUERY_POOL_SAMPLING_MODE_MANUAL_INTEL QUERY_POOL_SAMPLING_MODE_MANUAL_INTEL} is the default mode in which the application calls {@link VK10#vkCmdBeginQuery CmdBeginQuery} and {@link VK10#vkCmdEndQuery CmdEndQuery} to record performance data.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkQueryPoolPerformanceQueryCreateInfoINTEL}</p>
     */
    public static final int VK_QUERY_POOL_SAMPLING_MODE_MANUAL_INTEL = 0;

    /**
     * VkPerformanceOverrideTypeINTEL - Performance override type
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_PERFORMANCE_OVERRIDE_TYPE_NULL_HARDWARE_INTEL PERFORMANCE_OVERRIDE_TYPE_NULL_HARDWARE_INTEL} turns all rendering operations into noop.</li>
     * <li>{@link #VK_PERFORMANCE_OVERRIDE_TYPE_FLUSH_GPU_CACHES_INTEL PERFORMANCE_OVERRIDE_TYPE_FLUSH_GPU_CACHES_INTEL} stalls the stream of commands until all previously emitted commands have completed and all caches been flushed and invalidated.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkPerformanceOverrideInfoINTEL}</p>
     */
    public static final int
        VK_PERFORMANCE_OVERRIDE_TYPE_NULL_HARDWARE_INTEL    = 0,
        VK_PERFORMANCE_OVERRIDE_TYPE_FLUSH_GPU_CACHES_INTEL = 1;

    /**
     * VkPerformanceParameterTypeINTEL - Parameters that can be queried
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_PERFORMANCE_PARAMETER_TYPE_HW_COUNTERS_SUPPORTED_INTEL PERFORMANCE_PARAMETER_TYPE_HW_COUNTERS_SUPPORTED_INTEL} has a boolean result which tells whether hardware counters can be captured.</li>
     * <li>{@link #VK_PERFORMANCE_PARAMETER_TYPE_STREAM_MARKER_VALID_BITS_INTEL PERFORMANCE_PARAMETER_TYPE_STREAM_MARKER_VALID_BITS_INTEL} has a 32 bits integer result which tells how many bits can be written into the {@link VkPerformanceValueINTEL} value.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link #vkGetPerformanceParameterINTEL GetPerformanceParameterINTEL}</p>
     */
    public static final int
        VK_PERFORMANCE_PARAMETER_TYPE_HW_COUNTERS_SUPPORTED_INTEL    = 0,
        VK_PERFORMANCE_PARAMETER_TYPE_STREAM_MARKER_VALID_BITS_INTEL = 1;

    /**
     * VkPerformanceValueTypeINTEL - Type of the parameters that can be queried
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkPerformanceValueINTEL}</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_PERFORMANCE_VALUE_TYPE_UINT32_INTEL PERFORMANCE_VALUE_TYPE_UINT32_INTEL}</li>
     * <li>{@link #VK_PERFORMANCE_VALUE_TYPE_UINT64_INTEL PERFORMANCE_VALUE_TYPE_UINT64_INTEL}</li>
     * <li>{@link #VK_PERFORMANCE_VALUE_TYPE_FLOAT_INTEL PERFORMANCE_VALUE_TYPE_FLOAT_INTEL}</li>
     * <li>{@link #VK_PERFORMANCE_VALUE_TYPE_BOOL_INTEL PERFORMANCE_VALUE_TYPE_BOOL_INTEL}</li>
     * <li>{@link #VK_PERFORMANCE_VALUE_TYPE_STRING_INTEL PERFORMANCE_VALUE_TYPE_STRING_INTEL}</li>
     * </ul>
     */
    public static final int
        VK_PERFORMANCE_VALUE_TYPE_UINT32_INTEL = 0,
        VK_PERFORMANCE_VALUE_TYPE_UINT64_INTEL = 1,
        VK_PERFORMANCE_VALUE_TYPE_FLOAT_INTEL  = 2,
        VK_PERFORMANCE_VALUE_TYPE_BOOL_INTEL   = 3,
        VK_PERFORMANCE_VALUE_TYPE_STRING_INTEL = 4;

    protected INTELPerformanceQuery() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkInitializePerformanceApiINTEL ] ---

    /** Unsafe version of: {@link #vkInitializePerformanceApiINTEL InitializePerformanceApiINTEL} */
    public static int nvkInitializePerformanceApiINTEL(VkDevice device, long pInitializeInfo) {
        long __functionAddress = device.getCapabilities().vkInitializePerformanceApiINTEL;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(device.address(), pInitializeInfo, __functionAddress);
    }

    /**
     * Initialize a device for performance queries.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Prior to creating a performance query pool, initialize the device for performance queries with the call:</p>
     * 
     * <pre><code>
     * VkResult vkInitializePerformanceApiINTEL(
     *     VkDevice                                    device,
     *     const VkInitializePerformanceApiInfoINTEL*  pInitializeInfo);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pInitializeInfo} <b>must</b> be a valid pointer to a valid {@link VkInitializePerformanceApiInfoINTEL} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_TOO_MANY_OBJECTS ERROR_TOO_MANY_OBJECTS}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkInitializePerformanceApiInfoINTEL}</p>
     *
     * @param device          the logical device used for the queries.
     * @param pInitializeInfo a pointer to a {@link VkInitializePerformanceApiInfoINTEL} structure specifying initialization parameters.
     */
    @NativeType("VkResult")
    public static int vkInitializePerformanceApiINTEL(VkDevice device, @NativeType("VkInitializePerformanceApiInfoINTEL const *") VkInitializePerformanceApiInfoINTEL pInitializeInfo) {
        return nvkInitializePerformanceApiINTEL(device, pInitializeInfo.address());
    }

    // --- [ vkUninitializePerformanceApiINTEL ] ---

    /**
     * Uninitialize a device for performance queries.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Once performance query operations have completed, uninitalize the device for performance queries with the call:</p>
     * 
     * <pre><code>
     * void vkUninitializePerformanceApiINTEL(
     *     VkDevice                                    device);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * </ul>
     *
     * @param device the logical device used for the queries.
     */
    public static void vkUninitializePerformanceApiINTEL(VkDevice device) {
        long __functionAddress = device.getCapabilities().vkUninitializePerformanceApiINTEL;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(device.address(), __functionAddress);
    }

    // --- [ vkCmdSetPerformanceMarkerINTEL ] ---

    /** Unsafe version of: {@link #vkCmdSetPerformanceMarkerINTEL CmdSetPerformanceMarkerINTEL} */
    public static int nvkCmdSetPerformanceMarkerINTEL(VkCommandBuffer commandBuffer, long pMarkerInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetPerformanceMarkerINTEL;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(commandBuffer.address(), pMarkerInfo, __functionAddress);
    }

    /**
     * Markers.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To help associate query results with a particular point at which an application emitted commands, markers can be set into the command buffers with the call:</p>
     * 
     * <pre><code>
     * VkResult vkCmdSetPerformanceMarkerINTEL(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkPerformanceMarkerInfoINTEL*         pMarkerInfo);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pMarkerInfo} <b>must</b> be a valid pointer to a valid {@link VkPerformanceMarkerInfoINTEL} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, compute, or transfer operations</li>
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
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics Compute Transfer</td></tr></tbody>
     * </table>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_TOO_MANY_OBJECTS ERROR_TOO_MANY_OBJECTS}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkPerformanceMarkerInfoINTEL}</p>
     */
    @NativeType("VkResult")
    public static int vkCmdSetPerformanceMarkerINTEL(VkCommandBuffer commandBuffer, @NativeType("VkPerformanceMarkerInfoINTEL const *") VkPerformanceMarkerInfoINTEL pMarkerInfo) {
        return nvkCmdSetPerformanceMarkerINTEL(commandBuffer, pMarkerInfo.address());
    }

    // --- [ vkCmdSetPerformanceStreamMarkerINTEL ] ---

    /** Unsafe version of: {@link #vkCmdSetPerformanceStreamMarkerINTEL CmdSetPerformanceStreamMarkerINTEL} */
    public static int nvkCmdSetPerformanceStreamMarkerINTEL(VkCommandBuffer commandBuffer, long pMarkerInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetPerformanceStreamMarkerINTEL;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(commandBuffer.address(), pMarkerInfo, __functionAddress);
    }

    /**
     * Markers.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>When monitoring the behavior of an application wihtin the dataset generated by the entire set of applications running on the system, it is useful to identify draw calls within a potentially huge amount of performance data. To do so, application can generate stream markers that will be used to trace back a particular draw call with a particular performance data item.</p>
     * 
     * <pre><code>
     * VkResult vkCmdSetPerformanceStreamMarkerINTEL(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkPerformanceStreamMarkerInfoINTEL*   pMarkerInfo);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pMarkerInfo} <b>must</b> be a valid pointer to a valid {@link VkPerformanceStreamMarkerInfoINTEL} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, compute, or transfer operations</li>
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
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics Compute Transfer</td></tr></tbody>
     * </table>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_TOO_MANY_OBJECTS ERROR_TOO_MANY_OBJECTS}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkPerformanceStreamMarkerInfoINTEL}</p>
     */
    @NativeType("VkResult")
    public static int vkCmdSetPerformanceStreamMarkerINTEL(VkCommandBuffer commandBuffer, @NativeType("VkPerformanceStreamMarkerInfoINTEL const *") VkPerformanceStreamMarkerInfoINTEL pMarkerInfo) {
        return nvkCmdSetPerformanceStreamMarkerINTEL(commandBuffer, pMarkerInfo.address());
    }

    // --- [ vkCmdSetPerformanceOverrideINTEL ] ---

    /** Unsafe version of: {@link #vkCmdSetPerformanceOverrideINTEL CmdSetPerformanceOverrideINTEL} */
    public static int nvkCmdSetPerformanceOverrideINTEL(VkCommandBuffer commandBuffer, long pOverrideInfo) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetPerformanceOverrideINTEL;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(commandBuffer.address(), pOverrideInfo, __functionAddress);
    }

    /**
     * Performance override settings.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Some applications might want measure the effect of a set of commands with a different settings. It is possible to override a particular settings using :</p>
     * 
     * <pre><code>
     * VkResult vkCmdSetPerformanceOverrideINTEL(
     *     VkCommandBuffer                             commandBuffer,
     *     const VkPerformanceOverrideInfoINTEL*       pOverrideInfo);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code pOverrideInfo} <b>must</b> not be used with a {@code VkPerformanceOverrideTypeINTEL} that is not reported available by {@code vkGetPerformanceParameterINTEL}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pOverrideInfo} <b>must</b> be a valid pointer to a valid {@link VkPerformanceOverrideInfoINTEL} structure</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, compute, or transfer operations</li>
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
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Graphics Compute Transfer</td></tr></tbody>
     * </table>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_TOO_MANY_OBJECTS ERROR_TOO_MANY_OBJECTS}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkPerformanceOverrideInfoINTEL}</p>
     *
     * @param commandBuffer the command buffer where the override takes place.
     * @param pOverrideInfo a pointer to a {@link VkPerformanceOverrideInfoINTEL} structure selecting the parameter to override.
     */
    @NativeType("VkResult")
    public static int vkCmdSetPerformanceOverrideINTEL(VkCommandBuffer commandBuffer, @NativeType("VkPerformanceOverrideInfoINTEL const *") VkPerformanceOverrideInfoINTEL pOverrideInfo) {
        return nvkCmdSetPerformanceOverrideINTEL(commandBuffer, pOverrideInfo.address());
    }

    // --- [ vkAcquirePerformanceConfigurationINTEL ] ---

    /** Unsafe version of: {@link #vkAcquirePerformanceConfigurationINTEL AcquirePerformanceConfigurationINTEL} */
    public static int nvkAcquirePerformanceConfigurationINTEL(VkDevice device, long pAcquireInfo, long pConfiguration) {
        long __functionAddress = device.getCapabilities().vkAcquirePerformanceConfigurationINTEL;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(device.address(), pAcquireInfo, pConfiguration, __functionAddress);
    }

    /**
     * Acquire the performance query capability.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To acquire a device performance configuration, call:</p>
     * 
     * <pre><code>
     * VkResult vkAcquirePerformanceConfigurationINTEL(
     *     VkDevice                                    device,
     *     const VkPerformanceConfigurationAcquireInfoINTEL* pAcquireInfo,
     *     VkPerformanceConfigurationINTEL*            pConfiguration);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pAcquireInfo} <b>must</b> be a valid pointer to a valid {@link VkPerformanceConfigurationAcquireInfoINTEL} structure</li>
     * <li>{@code pConfiguration} <b>must</b> be a valid pointer to a {@code VkPerformanceConfigurationINTEL} handle</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_TOO_MANY_OBJECTS ERROR_TOO_MANY_OBJECTS}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkPerformanceConfigurationAcquireInfoINTEL}</p>
     *
     * @param device         the logical device that the performance query commands will be submitted to.
     * @param pAcquireInfo   a pointer to a {@link VkPerformanceConfigurationAcquireInfoINTEL} structure, specifying the performance configuration to acquire.
     * @param pConfiguration a pointer to a {@code VkPerformanceConfigurationINTEL} handle in which the resulting configuration object is returned.
     */
    @NativeType("VkResult")
    public static int vkAcquirePerformanceConfigurationINTEL(VkDevice device, @NativeType("VkPerformanceConfigurationAcquireInfoINTEL const *") VkPerformanceConfigurationAcquireInfoINTEL pAcquireInfo, @NativeType("VkPerformanceConfigurationINTEL *") LongBuffer pConfiguration) {
        if (CHECKS) {
            check(pConfiguration, 1);
        }
        return nvkAcquirePerformanceConfigurationINTEL(device, pAcquireInfo.address(), memAddress(pConfiguration));
    }

    // --- [ vkReleasePerformanceConfigurationINTEL ] ---

    /**
     * Release a configuration to capture performance data.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To release a device performance configuration, call:</p>
     * 
     * <pre><code>
     * VkResult vkReleasePerformanceConfigurationINTEL(
     *     VkDevice                                    device,
     *     VkPerformanceConfigurationINTEL             configuration);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code configuration} <b>must</b> not be released before all command buffers submitted while the configuration was set are in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">pending state</a></li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>If {@code configuration} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code configuration} <b>must</b> be a valid {@code VkPerformanceConfigurationINTEL} handle</li>
     * <li>If {@code configuration} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code configuration} <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_TOO_MANY_OBJECTS ERROR_TOO_MANY_OBJECTS}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * </ul></dd>
     * </dl>
     *
     * @param device        the device associated to the configuration object to release.
     * @param configuration the configuration object to release.
     */
    @NativeType("VkResult")
    public static int vkReleasePerformanceConfigurationINTEL(VkDevice device, @NativeType("VkPerformanceConfigurationINTEL") long configuration) {
        long __functionAddress = device.getCapabilities().vkReleasePerformanceConfigurationINTEL;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJI(device.address(), configuration, __functionAddress);
    }

    // --- [ vkQueueSetPerformanceConfigurationINTEL ] ---

    /**
     * Set a performance query.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To set a performance configuration, call:</p>
     * 
     * <pre><code>
     * VkResult vkQueueSetPerformanceConfigurationINTEL(
     *     VkQueue                                     queue,
     *     VkPerformanceConfigurationINTEL             configuration);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code queue} <b>must</b> be a valid {@code VkQueue} handle</li>
     * <li>{@code configuration} <b>must</b> be a valid {@code VkPerformanceConfigurationINTEL} handle</li>
     * <li>Both of {@code configuration}, and {@code queue} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
     * </ul>
     * 
     * <h5>Command Properties</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
     * <tbody><tr><td>-</td><td>-</td><td>Any</td></tr></tbody>
     * </table>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_TOO_MANY_OBJECTS ERROR_TOO_MANY_OBJECTS}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * </ul></dd>
     * </dl>
     *
     * @param queue         the queue on which the configuration will be used.
     * @param configuration the configuration to use.
     */
    @NativeType("VkResult")
    public static int vkQueueSetPerformanceConfigurationINTEL(VkQueue queue, @NativeType("VkPerformanceConfigurationINTEL") long configuration) {
        long __functionAddress = queue.getCapabilities().vkQueueSetPerformanceConfigurationINTEL;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJI(queue.address(), configuration, __functionAddress);
    }

    // --- [ vkGetPerformanceParameterINTEL ] ---

    /** Unsafe version of: {@link #vkGetPerformanceParameterINTEL GetPerformanceParameterINTEL} */
    public static int nvkGetPerformanceParameterINTEL(VkDevice device, int parameter, long pValue) {
        long __functionAddress = device.getCapabilities().vkGetPerformanceParameterINTEL;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(device.address(), parameter, pValue, __functionAddress);
    }

    /**
     * Query performance capabilities of the device.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Some performance query features of a device can be discovered with the call:</p>
     * 
     * <pre><code>
     * VkResult vkGetPerformanceParameterINTEL(
     *     VkDevice                                    device,
     *     VkPerformanceParameterTypeINTEL             parameter,
     *     VkPerformanceValueINTEL*                    pValue);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code parameter} <b>must</b> be a valid {@code VkPerformanceParameterTypeINTEL} value</li>
     * <li>{@code pValue} <b>must</b> be a valid pointer to a {@link VkPerformanceValueINTEL} structure</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_TOO_MANY_OBJECTS ERROR_TOO_MANY_OBJECTS}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkPerformanceValueINTEL}</p>
     *
     * @param device    the logical device to query.
     * @param parameter the parameter to query.
     * @param pValue    a pointer to a {@link VkPerformanceValueINTEL} structure in which the type and value of the parameter are returned.
     */
    @NativeType("VkResult")
    public static int vkGetPerformanceParameterINTEL(VkDevice device, @NativeType("VkPerformanceParameterTypeINTEL") int parameter, @NativeType("VkPerformanceValueINTEL *") VkPerformanceValueINTEL pValue) {
        return nvkGetPerformanceParameterINTEL(device, parameter, pValue.address());
    }

    /** Array version of: {@link #vkAcquirePerformanceConfigurationINTEL AcquirePerformanceConfigurationINTEL} */
    @NativeType("VkResult")
    public static int vkAcquirePerformanceConfigurationINTEL(VkDevice device, @NativeType("VkPerformanceConfigurationAcquireInfoINTEL const *") VkPerformanceConfigurationAcquireInfoINTEL pAcquireInfo, @NativeType("VkPerformanceConfigurationINTEL *") long[] pConfiguration) {
        long __functionAddress = device.getCapabilities().vkAcquirePerformanceConfigurationINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(pConfiguration, 1);
        }
        return callPPPI(device.address(), pAcquireInfo.address(), pConfiguration, __functionAddress);
    }

}
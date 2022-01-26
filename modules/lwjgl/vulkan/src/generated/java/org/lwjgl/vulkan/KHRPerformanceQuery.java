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
 * The {@code VK_KHR_performance_query} extension adds a mechanism to allow querying of performance counters for use in applications and by profiling tools.
 * 
 * <p>Each queue family <b>may</b> expose counters that <b>can</b> be enabled on a queue of that family. We extend {@code VkQueryType} to add a new query type for performance queries, and chain a structure on {@link VkQueryPoolCreateInfo} to specify the performance queries to enable.</p>
 * 
 * <h5>Examples</h5>
 * 
 * <p>The following example shows how to find what performance counters a queue family supports, setup a query pool to record these performance counters, how to add the query pool to the command buffer to record information, and how to get the results from the query pool.</p>
 * 
 * <pre><code>
 * // A previously created physical device
 * VkPhysicalDevice physicalDevice;
 * 
 * // One of the queue families our device supports
 * uint32_t queueFamilyIndex;
 * 
 * uint32_t counterCount;
 * 
 * // Get the count of counters supported
 * vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR(
 *   physicalDevice,
 *   queueFamilyIndex,
 *   &amp;counterCount,
 *   NULL,
 *   NULL);
 * 
 * VkPerformanceCounterKHR* counters =
 *   malloc(sizeof(VkPerformanceCounterKHR) * counterCount);
 * VkPerformanceCounterDescriptionKHR* counterDescriptions =
 *   malloc(sizeof(VkPerformanceCounterDescriptionKHR) * counterCount);
 * 
 * // Get the counters supported
 * vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR(
 *   physicalDevice,
 *   queueFamilyIndex,
 *   &amp;counterCount,
 *   counters,
 *   counterDescriptions);
 * 
 * // Try to enable the first 8 counters
 * uint32_t enabledCounters[8];
 * 
 * const uint32_t enabledCounterCount = min(counterCount, 8));
 * 
 * for (uint32_t i = 0; i &lt; enabledCounterCount; i++) {
 *   enabledCounters[i] = i;
 * }
 * 
 * // A previously created device that had the performanceCounterQueryPools feature
 * // set to VK_TRUE
 * VkDevice device;
 * 
 * VkQueryPoolPerformanceCreateInfoKHR performanceQueryCreateInfo = {
 *   VK_STRUCTURE_TYPE_QUERY_POOL_PERFORMANCE_CREATE_INFO_KHR,
 *   NULL,
 * 
 *   // Specify the queue family that this performance query is performed on
 *   queueFamilyIndex,
 * 
 *   // The number of counters to enable
 *   enabledCounterCount,
 * 
 *   // The array of indices of counters to enable
 *   enabledCounters
 * };
 * 
 * 
 * // Get the number of passes our counters will require.
 * uint32_t numPasses;
 * 
 * vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR(
 *   physicalDevice,
 *   &amp;performanceQueryCreateInfo,
 *   &amp;numPasses);
 * 
 * VkQueryPoolCreateInfo queryPoolCreateInfo = {
 *   VK_STRUCTURE_TYPE_QUERY_POOL_CREATE_INFO,
 *   &amp;performanceQueryCreateInfo,
 *   0,
 * 
 *   // Using our new query type here
 *   VK_QUERY_TYPE_PERFORMANCE_QUERY_KHR,
 * 
 *   1,
 * 
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
 * // A queue from queueFamilyIndex
 * VkQueue queue;
 * 
 * // A command buffer we want to record counters on
 * VkCommandBuffer commandBuffer;
 * 
 * VkCommandBufferBeginInfo commandBufferBeginInfo = {
 *   VK_STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO,
 *   NULL,
 *   0,
 *   NULL
 * };
 * 
 * VkAcquireProfilingLockInfoKHR lockInfo = {
 *   VK_STRUCTURE_TYPE_ACQUIRE_PROFILING_LOCK_INFO_KHR,
 *   NULL,
 *   0,
 *   UINT64_MAX // Wait forever for the lock
 * };
 * 
 * // Acquire the profiling lock before we record command buffers
 * // that will use performance queries
 * 
 * result = vkAcquireProfilingLockKHR(device, &amp;lockInfo);
 * 
 * assert(VK_SUCCESS == result);
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
 * for (uint32_t counterPass = 0; counterPass &lt; numPasses; counterPass++) {
 * 
 *   VkPerformanceQuerySubmitInfoKHR performanceQuerySubmitInfo = {
 *     VK_STRUCTURE_TYPE_PERFORMANCE_QUERY_SUBMIT_INFO_KHR,
 *     NULL,
 *     counterPass
 *   };
 * 
 * 
 *   // Submit the command buffer and wait for its completion
 *   // ...
 * }
 * 
 * // Release the profiling lock after the command buffer is no longer in the
 * // pending state.
 * vkReleaseProfilingLockKHR(device);
 * 
 * result = vkResetCommandBuffer(commandBuffer, 0);
 * 
 * assert(VK_SUCCESS == result);
 * 
 * // Create an array to hold the results of all counters
 * VkPerformanceCounterResultKHR* recordedCounters = malloc(
 *   sizeof(VkPerformanceCounterResultKHR) * enabledCounterCount);
 * 
 * result = vkGetQueryPoolResults(
 *   device,
 *   queryPool,
 *   0,
 *   1,
 *   sizeof(VkPerformanceCounterResultKHR) * enabledCounterCount,
 *   recordedCounters,
 *   sizeof(VkPerformanceCounterResultKHR),
 *   NULL);
 * 
 * // recordedCounters is filled with our counters, we will look at one for posterity
 * switch (counters[0].storage) {
 *   case VK_PERFORMANCE_COUNTER_STORAGE_INT32:
 *     // use recordCounters[0].int32 to get at the counter result!
 *     break;
 *   case VK_PERFORMANCE_COUNTER_STORAGE_INT64:
 *     // use recordCounters[0].int64 to get at the counter result!
 *     break;
 *   case VK_PERFORMANCE_COUNTER_STORAGE_UINT32:
 *     // use recordCounters[0].uint32 to get at the counter result!
 *     break;
 *   case VK_PERFORMANCE_COUNTER_STORAGE_UINT64:
 *     // use recordCounters[0].uint64 to get at the counter result!
 *     break;
 *   case VK_PERFORMANCE_COUNTER_STORAGE_FLOAT32:
 *     // use recordCounters[0].float32 to get at the counter result!
 *     break;
 *   case VK_PERFORMANCE_COUNTER_STORAGE_FLOAT64:
 *     // use recordCounters[0].float64 to get at the counter result!
 *     break;
 * }</code></pre>
 * 
 * <h5>VK_KHR_performance_query</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_performance_query}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>117</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
 * </ul></dd>
 * <dt><b>Special Use</b></dt>
 * <dd><ul>
 * <li><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#extendingvulkan-compatibility-specialuse">Developer tools</a></li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Alon Or-bach <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_performance_query]%20@alonorbach%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_performance_query%20extension%3E%3E">alonorbach</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2019-10-08</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Jesse Barker, Unity Technologies</li>
 * <li>Kenneth Benzie, Codeplay</li>
 * <li>Jan-Harald Fredriksen, ARM</li>
 * <li>Jeff Leger, Qualcomm</li>
 * <li>Jesse Hall, Google</li>
 * <li>Tobias Hector, AMD</li>
 * <li>Neil Henning, Codeplay</li>
 * <li>Baldur Karlsson</li>
 * <li>Lionel Landwerlin, Intel</li>
 * <li>Peter Lohrmann, AMD</li>
 * <li>Alon Or-bach, Samsung</li>
 * <li>Daniel Rakos, AMD</li>
 * <li>Niklas Smedberg, Unity Technologies</li>
 * <li>Igor Ostrowski, Intel</li>
 * </ul></dd>
 * </dl>
 */
public class KHRPerformanceQuery {

    /** The extension specification version. */
    public static final int VK_KHR_PERFORMANCE_QUERY_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_PERFORMANCE_QUERY_EXTENSION_NAME = "VK_KHR_performance_query";

    /** Extends {@code VkQueryType}. */
    public static final int VK_QUERY_TYPE_PERFORMANCE_QUERY_KHR = 1000116000;

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_QUERY_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_QUERY_FEATURES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_QUERY_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_QUERY_PROPERTIES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_QUERY_POOL_PERFORMANCE_CREATE_INFO_KHR STRUCTURE_TYPE_QUERY_POOL_PERFORMANCE_CREATE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PERFORMANCE_QUERY_SUBMIT_INFO_KHR STRUCTURE_TYPE_PERFORMANCE_QUERY_SUBMIT_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_ACQUIRE_PROFILING_LOCK_INFO_KHR STRUCTURE_TYPE_ACQUIRE_PROFILING_LOCK_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PERFORMANCE_COUNTER_KHR STRUCTURE_TYPE_PERFORMANCE_COUNTER_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PERFORMANCE_COUNTER_DESCRIPTION_KHR STRUCTURE_TYPE_PERFORMANCE_COUNTER_DESCRIPTION_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_QUERY_FEATURES_KHR   = 1000116000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_QUERY_PROPERTIES_KHR = 1000116001,
        VK_STRUCTURE_TYPE_QUERY_POOL_PERFORMANCE_CREATE_INFO_KHR           = 1000116002,
        VK_STRUCTURE_TYPE_PERFORMANCE_QUERY_SUBMIT_INFO_KHR                = 1000116003,
        VK_STRUCTURE_TYPE_ACQUIRE_PROFILING_LOCK_INFO_KHR                  = 1000116004,
        VK_STRUCTURE_TYPE_PERFORMANCE_COUNTER_KHR                          = 1000116005,
        VK_STRUCTURE_TYPE_PERFORMANCE_COUNTER_DESCRIPTION_KHR              = 1000116006;

    /**
     * VkPerformanceCounterUnitKHR - Supported counter unit types
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_PERFORMANCE_COUNTER_UNIT_GENERIC_KHR PERFORMANCE_COUNTER_UNIT_GENERIC_KHR} - the performance counter unit is a generic data point.</li>
     * <li>{@link #VK_PERFORMANCE_COUNTER_UNIT_PERCENTAGE_KHR PERFORMANCE_COUNTER_UNIT_PERCENTAGE_KHR} - the performance counter unit is a percentage (%).</li>
     * <li>{@link #VK_PERFORMANCE_COUNTER_UNIT_NANOSECONDS_KHR PERFORMANCE_COUNTER_UNIT_NANOSECONDS_KHR} - the performance counter unit is a value of nanoseconds (ns).</li>
     * <li>{@link #VK_PERFORMANCE_COUNTER_UNIT_BYTES_KHR PERFORMANCE_COUNTER_UNIT_BYTES_KHR} - the performance counter unit is a value of bytes.</li>
     * <li>{@link #VK_PERFORMANCE_COUNTER_UNIT_BYTES_PER_SECOND_KHR PERFORMANCE_COUNTER_UNIT_BYTES_PER_SECOND_KHR} - the performance counter unit is a value of bytes/s.</li>
     * <li>{@link #VK_PERFORMANCE_COUNTER_UNIT_KELVIN_KHR PERFORMANCE_COUNTER_UNIT_KELVIN_KHR} - the performance counter unit is a temperature reported in Kelvin.</li>
     * <li>{@link #VK_PERFORMANCE_COUNTER_UNIT_WATTS_KHR PERFORMANCE_COUNTER_UNIT_WATTS_KHR} - the performance counter unit is a value of watts (W).</li>
     * <li>{@link #VK_PERFORMANCE_COUNTER_UNIT_VOLTS_KHR PERFORMANCE_COUNTER_UNIT_VOLTS_KHR} - the performance counter unit is a value of volts (V).</li>
     * <li>{@link #VK_PERFORMANCE_COUNTER_UNIT_AMPS_KHR PERFORMANCE_COUNTER_UNIT_AMPS_KHR} - the performance counter unit is a value of amps (A).</li>
     * <li>{@link #VK_PERFORMANCE_COUNTER_UNIT_HERTZ_KHR PERFORMANCE_COUNTER_UNIT_HERTZ_KHR} - the performance counter unit is a value of hertz (Hz).</li>
     * <li>{@link #VK_PERFORMANCE_COUNTER_UNIT_CYCLES_KHR PERFORMANCE_COUNTER_UNIT_CYCLES_KHR} - the performance counter unit is a value of cycles.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkPerformanceCounterKHR}</p>
     */
    public static final int
        VK_PERFORMANCE_COUNTER_UNIT_GENERIC_KHR          = 0,
        VK_PERFORMANCE_COUNTER_UNIT_PERCENTAGE_KHR       = 1,
        VK_PERFORMANCE_COUNTER_UNIT_NANOSECONDS_KHR      = 2,
        VK_PERFORMANCE_COUNTER_UNIT_BYTES_KHR            = 3,
        VK_PERFORMANCE_COUNTER_UNIT_BYTES_PER_SECOND_KHR = 4,
        VK_PERFORMANCE_COUNTER_UNIT_KELVIN_KHR           = 5,
        VK_PERFORMANCE_COUNTER_UNIT_WATTS_KHR            = 6,
        VK_PERFORMANCE_COUNTER_UNIT_VOLTS_KHR            = 7,
        VK_PERFORMANCE_COUNTER_UNIT_AMPS_KHR             = 8,
        VK_PERFORMANCE_COUNTER_UNIT_HERTZ_KHR            = 9,
        VK_PERFORMANCE_COUNTER_UNIT_CYCLES_KHR           = 10;

    /**
     * VkPerformanceCounterScopeKHR - Supported counter scope types
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_PERFORMANCE_COUNTER_SCOPE_COMMAND_BUFFER_KHR PERFORMANCE_COUNTER_SCOPE_COMMAND_BUFFER_KHR} - the performance counter scope is a single complete command buffer.</li>
     * <li>{@link #VK_PERFORMANCE_COUNTER_SCOPE_RENDER_PASS_KHR PERFORMANCE_COUNTER_SCOPE_RENDER_PASS_KHR} - the performance counter scope is zero or more complete render passes. The performance query containing the performance counter <b>must</b> begin and end outside a render pass instance.</li>
     * <li>{@link #VK_PERFORMANCE_COUNTER_SCOPE_COMMAND_KHR PERFORMANCE_COUNTER_SCOPE_COMMAND_KHR} - the performance counter scope is zero or more commands.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkPerformanceCounterKHR}</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_QUERY_SCOPE_COMMAND_BUFFER_KHR QUERY_SCOPE_COMMAND_BUFFER_KHR}</li>
     * <li>{@link #VK_QUERY_SCOPE_RENDER_PASS_KHR QUERY_SCOPE_RENDER_PASS_KHR}</li>
     * <li>{@link #VK_QUERY_SCOPE_COMMAND_KHR QUERY_SCOPE_COMMAND_KHR}</li>
     * </ul>
     */
    public static final int
        VK_PERFORMANCE_COUNTER_SCOPE_COMMAND_BUFFER_KHR = 0,
        VK_PERFORMANCE_COUNTER_SCOPE_RENDER_PASS_KHR    = 1,
        VK_PERFORMANCE_COUNTER_SCOPE_COMMAND_KHR        = 2,
        VK_QUERY_SCOPE_COMMAND_BUFFER_KHR               = 0,
        VK_QUERY_SCOPE_RENDER_PASS_KHR                  = 1,
        VK_QUERY_SCOPE_COMMAND_KHR                      = 2;

    /**
     * VkPerformanceCounterStorageKHR - Supported counter storage types
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_PERFORMANCE_COUNTER_STORAGE_INT32_KHR PERFORMANCE_COUNTER_STORAGE_INT32_KHR} - the performance counter storage is a 32-bit signed integer.</li>
     * <li>{@link #VK_PERFORMANCE_COUNTER_STORAGE_INT64_KHR PERFORMANCE_COUNTER_STORAGE_INT64_KHR} - the performance counter storage is a 64-bit signed integer.</li>
     * <li>{@link #VK_PERFORMANCE_COUNTER_STORAGE_UINT32_KHR PERFORMANCE_COUNTER_STORAGE_UINT32_KHR} - the performance counter storage is a 32-bit unsigned integer.</li>
     * <li>{@link #VK_PERFORMANCE_COUNTER_STORAGE_UINT64_KHR PERFORMANCE_COUNTER_STORAGE_UINT64_KHR} - the performance counter storage is a 64-bit unsigned integer.</li>
     * <li>{@link #VK_PERFORMANCE_COUNTER_STORAGE_FLOAT32_KHR PERFORMANCE_COUNTER_STORAGE_FLOAT32_KHR} - the performance counter storage is a 32-bit floating-point.</li>
     * <li>{@link #VK_PERFORMANCE_COUNTER_STORAGE_FLOAT64_KHR PERFORMANCE_COUNTER_STORAGE_FLOAT64_KHR} - the performance counter storage is a 64-bit floating-point.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkPerformanceCounterKHR}</p>
     */
    public static final int
        VK_PERFORMANCE_COUNTER_STORAGE_INT32_KHR   = 0,
        VK_PERFORMANCE_COUNTER_STORAGE_INT64_KHR   = 1,
        VK_PERFORMANCE_COUNTER_STORAGE_UINT32_KHR  = 2,
        VK_PERFORMANCE_COUNTER_STORAGE_UINT64_KHR  = 3,
        VK_PERFORMANCE_COUNTER_STORAGE_FLOAT32_KHR = 4,
        VK_PERFORMANCE_COUNTER_STORAGE_FLOAT64_KHR = 5;

    /**
     * VkPerformanceCounterDescriptionFlagBitsKHR - Bitmask specifying usage behavior for a counter
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_PERFORMANCE_COUNTER_DESCRIPTION_PERFORMANCE_IMPACTING_BIT_KHR PERFORMANCE_COUNTER_DESCRIPTION_PERFORMANCE_IMPACTING_BIT_KHR} specifies that recording the counter <b>may</b> have a noticeable performance impact.</li>
     * <li>{@link #VK_PERFORMANCE_COUNTER_DESCRIPTION_CONCURRENTLY_IMPACTED_BIT_KHR PERFORMANCE_COUNTER_DESCRIPTION_CONCURRENTLY_IMPACTED_BIT_KHR} specifies that concurrently recording the counter while other submitted command buffers are running <b>may</b> impact the accuracy of the recording.</li>
     * </ul>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_PERFORMANCE_COUNTER_DESCRIPTION_PERFORMANCE_IMPACTING_KHR PERFORMANCE_COUNTER_DESCRIPTION_PERFORMANCE_IMPACTING_KHR}</li>
     * <li>{@link #VK_PERFORMANCE_COUNTER_DESCRIPTION_CONCURRENTLY_IMPACTED_KHR PERFORMANCE_COUNTER_DESCRIPTION_CONCURRENTLY_IMPACTED_KHR}</li>
     * </ul>
     */
    public static final int
        VK_PERFORMANCE_COUNTER_DESCRIPTION_PERFORMANCE_IMPACTING_BIT_KHR = 0x1,
        VK_PERFORMANCE_COUNTER_DESCRIPTION_PERFORMANCE_IMPACTING_KHR     = 0x1,
        VK_PERFORMANCE_COUNTER_DESCRIPTION_CONCURRENTLY_IMPACTED_BIT_KHR = 0x2,
        VK_PERFORMANCE_COUNTER_DESCRIPTION_CONCURRENTLY_IMPACTED_KHR     = 0x2;

    protected KHRPerformanceQuery() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR ] ---

    /**
     * Unsafe version of: {@link #vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR EnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR}
     *
     * @param pCounterCount a pointer to an integer related to the number of counters available or queried, as described below.
     */
    public static int nvkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR(VkPhysicalDevice physicalDevice, int queueFamilyIndex, long pCounterCount, long pCounters, long pCounterDescriptions) {
        long __functionAddress = physicalDevice.getCapabilities().vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(physicalDevice.address(), queueFamilyIndex, pCounterCount, pCounters, pCounterDescriptions, __functionAddress);
    }

    /**
     * Reports properties of the performance query counters available on a queue family of a device.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To enumerate the performance query counters available on a queue family of a physical device, call:</p>
     * 
     * <pre><code>
     * VkResult vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR(
     *     VkPhysicalDevice                            physicalDevice,
     *     uint32_t                                    queueFamilyIndex,
     *     uint32_t*                                   pCounterCount,
     *     VkPerformanceCounterKHR*                    pCounters,
     *     VkPerformanceCounterDescriptionKHR*         pCounterDescriptions);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>If {@code pCounters} is {@code NULL} and {@code pCounterDescriptions} is {@code NULL}, then the number of counters available is returned in {@code pCounterCount}. Otherwise, {@code pCounterCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pCounters}, {@code pCounterDescriptions}, or both arrays and on return the variable is overwritten with the number of structures actually written out. If {@code pCounterCount} is less than the number of counters available, at most {@code pCounterCount} structures will be written, and {@link VK10#VK_INCOMPLETE INCOMPLETE} will be returned instead of {@link VK10#VK_SUCCESS SUCCESS}, to indicate that not all the available counters were returned.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
     * <li>{@code pCounterCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
     * <li>If the value referenced by {@code pCounterCount} is not 0, and {@code pCounters} is not {@code NULL}, {@code pCounters} <b>must</b> be a valid pointer to an array of {@code pCounterCount} {@link VkPerformanceCounterKHR} structures</li>
     * <li>If the value referenced by {@code pCounterCount} is not 0, and {@code pCounterDescriptions} is not {@code NULL}, {@code pCounterDescriptions} <b>must</b> be a valid pointer to an array of {@code pCounterCount} {@link VkPerformanceCounterDescriptionKHR} structures</li>
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
     * <li>{@link VK10#VK_ERROR_INITIALIZATION_FAILED ERROR_INITIALIZATION_FAILED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkPerformanceCounterDescriptionKHR}, {@link VkPerformanceCounterKHR}</p>
     *
     * @param physicalDevice       the handle to the physical device whose queue family performance query counter properties will be queried.
     * @param queueFamilyIndex     the index into the queue family of the physical device we want to get properties for.
     * @param pCounterCount        a pointer to an integer related to the number of counters available or queried, as described below.
     * @param pCounters            either {@code NULL} or a pointer to an array of {@link VkPerformanceCounterKHR} structures.
     * @param pCounterDescriptions either {@code NULL} or a pointer to an array of {@link VkPerformanceCounterDescriptionKHR} structures.
     */
    @NativeType("VkResult")
    public static int vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t") int queueFamilyIndex, @NativeType("uint32_t *") IntBuffer pCounterCount, @Nullable @NativeType("VkPerformanceCounterKHR *") VkPerformanceCounterKHR.Buffer pCounters, @Nullable @NativeType("VkPerformanceCounterDescriptionKHR *") VkPerformanceCounterDescriptionKHR.Buffer pCounterDescriptions) {
        if (CHECKS) {
            check(pCounterCount, 1);
            checkSafe(pCounters, pCounterCount.get(pCounterCount.position()));
            checkSafe(pCounterDescriptions, pCounterCount.get(pCounterCount.position()));
        }
        return nvkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR(physicalDevice, queueFamilyIndex, memAddress(pCounterCount), memAddressSafe(pCounters), memAddressSafe(pCounterDescriptions));
    }

    // --- [ vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR ] ---

    /** Unsafe version of: {@link #vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR GetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR} */
    public static void nvkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR(VkPhysicalDevice physicalDevice, long pPerformanceQueryCreateInfo, long pNumPasses) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR;
        if (CHECKS) {
            check(__functionAddress);
            VkQueryPoolPerformanceCreateInfoKHR.validate(pPerformanceQueryCreateInfo);
        }
        callPPPV(physicalDevice.address(), pPerformanceQueryCreateInfo, pNumPasses, __functionAddress);
    }

    /**
     * Reports the number of passes require for a performance query pool type.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To query the number of passes required to query a performance query pool on a physical device, call:</p>
     * 
     * <pre><code>
     * void vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR(
     *     VkPhysicalDevice                            physicalDevice,
     *     const VkQueryPoolPerformanceCreateInfoKHR*  pPerformanceQueryCreateInfo,
     *     uint32_t*                                   pNumPasses);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The {@code pPerformanceQueryCreateInfo} member {@link VkQueryPoolPerformanceCreateInfoKHR}{@code ::queueFamilyIndex} <b>must</b> be a queue family of {@code physicalDevice}. The number of passes required to capture the counters specified in the {@code pPerformanceQueryCreateInfo} member {@link VkQueryPoolPerformanceCreateInfoKHR}{@code ::pCounters} is returned in {@code pNumPasses}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
     * <li>{@code pPerformanceQueryCreateInfo} <b>must</b> be a valid pointer to a valid {@link VkQueryPoolPerformanceCreateInfoKHR} structure</li>
     * <li>{@code pNumPasses} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkQueryPoolPerformanceCreateInfoKHR}</p>
     *
     * @param physicalDevice              the handle to the physical device whose queue family performance query counter properties will be queried.
     * @param pPerformanceQueryCreateInfo a pointer to a {@link VkQueryPoolPerformanceCreateInfoKHR} of the performance query that is to be created.
     * @param pNumPasses                  a pointer to an integer related to the number of passes required to query the performance query pool, as described below.
     */
    public static void vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR(VkPhysicalDevice physicalDevice, @NativeType("VkQueryPoolPerformanceCreateInfoKHR const *") VkQueryPoolPerformanceCreateInfoKHR pPerformanceQueryCreateInfo, @NativeType("uint32_t *") IntBuffer pNumPasses) {
        if (CHECKS) {
            check(pNumPasses, 1);
        }
        nvkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR(physicalDevice, pPerformanceQueryCreateInfo.address(), memAddress(pNumPasses));
    }

    // --- [ vkAcquireProfilingLockKHR ] ---

    /** Unsafe version of: {@link #vkAcquireProfilingLockKHR AcquireProfilingLockKHR} */
    public static int nvkAcquireProfilingLockKHR(VkDevice device, long pInfo) {
        long __functionAddress = device.getCapabilities().vkAcquireProfilingLockKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(device.address(), pInfo, __functionAddress);
    }

    /**
     * Acquires the profiling lock.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To record and submit a command buffer containing a performance query pool the profiling lock <b>must</b> be held. The profiling lock <b>must</b> be acquired prior to any call to {@link VK10#vkBeginCommandBuffer BeginCommandBuffer} that will be using a performance query pool. The profiling lock <b>must</b> be held while any command buffer containing a performance query pool is in the <em>recording</em>, <em>executable</em>, or <em>pending state</em>. To acquire the profiling lock, call:</p>
     * 
     * <pre><code>
     * VkResult vkAcquireProfilingLockKHR(
     *     VkDevice                                    device,
     *     const VkAcquireProfilingLockInfoKHR*        pInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Implementations <b>may</b> allow multiple actors to hold the profiling lock concurrently.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pInfo} <b>must</b> be a valid pointer to a valid {@link VkAcquireProfilingLockInfoKHR} structure</li>
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
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_TIMEOUT TIMEOUT}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAcquireProfilingLockInfoKHR}</p>
     *
     * @param device the logical device to profile.
     * @param pInfo  a pointer to a {@link VkAcquireProfilingLockInfoKHR} structure containing information about how the profiling is to be acquired.
     */
    @NativeType("VkResult")
    public static int vkAcquireProfilingLockKHR(VkDevice device, @NativeType("VkAcquireProfilingLockInfoKHR const *") VkAcquireProfilingLockInfoKHR pInfo) {
        return nvkAcquireProfilingLockKHR(device, pInfo.address());
    }

    // --- [ vkReleaseProfilingLockKHR ] ---

    /**
     * Releases the profiling lock.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To release the profiling lock, call:</p>
     * 
     * <pre><code>
     * void vkReleaseProfilingLockKHR(
     *     VkDevice                                    device);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The profiling lock of {@code device} <b>must</b> have been held via a previous successful call to {@link #vkAcquireProfilingLockKHR AcquireProfilingLockKHR}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * </ul>
     *
     * @param device the logical device to cease profiling on.
     */
    public static void vkReleaseProfilingLockKHR(VkDevice device) {
        long __functionAddress = device.getCapabilities().vkReleaseProfilingLockKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(device.address(), __functionAddress);
    }

    /** Array version of: {@link #vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR EnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR} */
    @NativeType("VkResult")
    public static int vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t") int queueFamilyIndex, @NativeType("uint32_t *") int[] pCounterCount, @Nullable @NativeType("VkPerformanceCounterKHR *") VkPerformanceCounterKHR.Buffer pCounters, @Nullable @NativeType("VkPerformanceCounterDescriptionKHR *") VkPerformanceCounterDescriptionKHR.Buffer pCounterDescriptions) {
        long __functionAddress = physicalDevice.getCapabilities().vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pCounterCount, 1);
            checkSafe(pCounters, pCounterCount[0]);
            checkSafe(pCounterDescriptions, pCounterCount[0]);
        }
        return callPPPPI(physicalDevice.address(), queueFamilyIndex, pCounterCount, memAddressSafe(pCounters), memAddressSafe(pCounterDescriptions), __functionAddress);
    }

    /** Array version of: {@link #vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR GetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR} */
    public static void vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR(VkPhysicalDevice physicalDevice, @NativeType("VkQueryPoolPerformanceCreateInfoKHR const *") VkQueryPoolPerformanceCreateInfoKHR pPerformanceQueryCreateInfo, @NativeType("uint32_t *") int[] pNumPasses) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pNumPasses, 1);
            VkQueryPoolPerformanceCreateInfoKHR.validate(pPerformanceQueryCreateInfo.address());
        }
        callPPPV(physicalDevice.address(), pPerformanceQueryCreateInfo.address(), pNumPasses, __functionAddress);
    }

}
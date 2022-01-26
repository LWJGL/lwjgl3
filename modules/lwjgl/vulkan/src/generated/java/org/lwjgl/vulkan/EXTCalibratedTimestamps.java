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
 * This extension provides an interface to query calibrated timestamps obtained quasi simultaneously from two time domains.
 * 
 * <h5>VK_EXT_calibrated_timestamps</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_calibrated_timestamps}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>185</dd>
 * <dt><b>Revision</b></dt>
 * <dd>2</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Daniel Rakos <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_calibrated_timestamps]%20@drakos-amd%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_calibrated_timestamps%20extension%3E%3E">drakos-amd</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2018-10-04</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Matthaeus G. Chajdas, AMD</li>
 * <li>Alan Harrison, AMD</li>
 * <li>Derrick Owens, AMD</li>
 * <li>Daniel Rakos, AMD</li>
 * <li>Jason Ekstrand, Intel</li>
 * <li>Keith Packard, Valve</li>
 * </ul></dd>
 * </dl>
 */
public class EXTCalibratedTimestamps {

    /** The extension specification version. */
    public static final int VK_EXT_CALIBRATED_TIMESTAMPS_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String VK_EXT_CALIBRATED_TIMESTAMPS_EXTENSION_NAME = "VK_EXT_calibrated_timestamps";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_CALIBRATED_TIMESTAMP_INFO_EXT = 1000184000;

    /**
     * VkTimeDomainEXT - Supported time domains
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_TIME_DOMAIN_DEVICE_EXT TIME_DOMAIN_DEVICE_EXT} specifies the device time domain. Timestamp values in this time domain use the same units and are comparable with device timestamp values captured using {@link VK10#vkCmdWriteTimestamp CmdWriteTimestamp} or {@link VK13#vkCmdWriteTimestamp2 CmdWriteTimestamp2} and are defined to be incrementing according to the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-timestampPeriod">timestampPeriod</a> of the device.</li>
     * <li>{@link #VK_TIME_DOMAIN_CLOCK_MONOTONIC_EXT TIME_DOMAIN_CLOCK_MONOTONIC_EXT} specifies the CLOCK_MONOTONIC time domain available on POSIX platforms. Timestamp values in this time domain are in units of nanoseconds and are comparable with platform timestamp values captured using the POSIX clock_gettime API as computed by this example:</li>
     * </ul>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>An implementation supporting {@link EXTCalibratedTimestamps VK_EXT_calibrated_timestamps} will use the same time domain for all its {@code VkQueue} so that timestamp values reported for {@link #VK_TIME_DOMAIN_DEVICE_EXT TIME_DOMAIN_DEVICE_EXT} can be matched to any timestamp captured through {@link VK10#vkCmdWriteTimestamp CmdWriteTimestamp} or {@link VK13#vkCmdWriteTimestamp2 CmdWriteTimestamp2} .</p>
     * </div>
     * 
     * <pre><code>
     * struct timespec tv;
     * clock_gettime(CLOCK_MONOTONIC, &amp;tv);
     * return tv.tv_nsec + tv.tv_sec*1000000000ull;</code></pre>
     * 
     * <ul>
     * <li>{@link #VK_TIME_DOMAIN_CLOCK_MONOTONIC_RAW_EXT TIME_DOMAIN_CLOCK_MONOTONIC_RAW_EXT} specifies the CLOCK_MONOTONIC_RAW time domain available on POSIX platforms. Timestamp values in this time domain are in units of nanoseconds and are comparable with platform timestamp values captured using the POSIX clock_gettime API as computed by this example:</li>
     * </ul>
     * 
     * <pre><code>
     * struct timespec tv;
     * clock_gettime(CLOCK_MONOTONIC_RAW, &amp;tv);
     * return tv.tv_nsec + tv.tv_sec*1000000000ull;</code></pre>
     * 
     * <ul>
     * <li>{@link #VK_TIME_DOMAIN_QUERY_PERFORMANCE_COUNTER_EXT TIME_DOMAIN_QUERY_PERFORMANCE_COUNTER_EXT} specifies the performance counter (QPC) time domain available on Windows. Timestamp values in this time domain are in the same units as those provided by the Windows QueryPerformanceCounter API and are comparable with platform timestamp values captured using that API as computed by this example:</li>
     * </ul>
     * 
     * <pre><code>
     * LARGE_INTEGER counter;
     * QueryPerformanceCounter(&amp;counter);
     * return counter.QuadPart;</code></pre>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkCalibratedTimestampInfoEXT}, {@link #vkGetPhysicalDeviceCalibrateableTimeDomainsEXT GetPhysicalDeviceCalibrateableTimeDomainsEXT}</p>
     */
    public static final int
        VK_TIME_DOMAIN_DEVICE_EXT                    = 0,
        VK_TIME_DOMAIN_CLOCK_MONOTONIC_EXT           = 1,
        VK_TIME_DOMAIN_CLOCK_MONOTONIC_RAW_EXT       = 2,
        VK_TIME_DOMAIN_QUERY_PERFORMANCE_COUNTER_EXT = 3;

    protected EXTCalibratedTimestamps() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetPhysicalDeviceCalibrateableTimeDomainsEXT ] ---

    /**
     * Unsafe version of: {@link #vkGetPhysicalDeviceCalibrateableTimeDomainsEXT GetPhysicalDeviceCalibrateableTimeDomainsEXT}
     *
     * @param pTimeDomainCount a pointer to an integer related to the number of calibrateable time domains available or queried, as described below.
     */
    public static int nvkGetPhysicalDeviceCalibrateableTimeDomainsEXT(VkPhysicalDevice physicalDevice, long pTimeDomainCount, long pTimeDomains) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceCalibrateableTimeDomainsEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(physicalDevice.address(), pTimeDomainCount, pTimeDomains, __functionAddress);
    }

    /**
     * Query calibrateable time domains.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To query the set of time domains for which a physical device supports timestamp calibration, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetPhysicalDeviceCalibrateableTimeDomainsEXT(
     *     VkPhysicalDevice                            physicalDevice,
     *     uint32_t*                                   pTimeDomainCount,
     *     VkTimeDomainEXT*                            pTimeDomains);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>If {@code pTimeDomains} is {@code NULL}, then the number of calibrateable time domains supported for the given {@code physicalDevice} is returned in {@code pTimeDomainCount}. Otherwise, {@code pTimeDomainCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pTimeDomains} array, and on return the variable is overwritten with the number of values actually written to {@code pTimeDomains}. If the value of {@code pTimeDomainCount} is less than the number of calibrateable time domains supported, at most {@code pTimeDomainCount} values will be written to {@code pTimeDomains}, and {@link VK10#VK_INCOMPLETE INCOMPLETE} will be returned instead of {@link VK10#VK_SUCCESS SUCCESS}, to indicate that not all the available time domains were returned.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
     * <li>{@code pTimeDomainCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
     * <li>If the value referenced by {@code pTimeDomainCount} is not 0, and {@code pTimeDomains} is not {@code NULL}, {@code pTimeDomains} <b>must</b> be a valid pointer to an array of {@code pTimeDomainCount} {@code VkTimeDomainEXT} values</li>
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
     * @param physicalDevice   the physical device from which to query the set of calibrateable time domains.
     * @param pTimeDomainCount a pointer to an integer related to the number of calibrateable time domains available or queried, as described below.
     * @param pTimeDomains     either {@code NULL} or a pointer to an array of {@code VkTimeDomainEXT} values, indicating the supported calibrateable time domains.
     */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceCalibrateableTimeDomainsEXT(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") IntBuffer pTimeDomainCount, @Nullable @NativeType("VkTimeDomainEXT *") IntBuffer pTimeDomains) {
        if (CHECKS) {
            check(pTimeDomainCount, 1);
            checkSafe(pTimeDomains, pTimeDomainCount.get(pTimeDomainCount.position()));
        }
        return nvkGetPhysicalDeviceCalibrateableTimeDomainsEXT(physicalDevice, memAddress(pTimeDomainCount), memAddressSafe(pTimeDomains));
    }

    // --- [ vkGetCalibratedTimestampsEXT ] ---

    /**
     * Unsafe version of: {@link #vkGetCalibratedTimestampsEXT GetCalibratedTimestampsEXT}
     *
     * @param timestampCount the number of timestamps to query.
     */
    public static int nvkGetCalibratedTimestampsEXT(VkDevice device, int timestampCount, long pTimestampInfos, long pTimestamps, long pMaxDeviation) {
        long __functionAddress = device.getCapabilities().vkGetCalibratedTimestampsEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(device.address(), timestampCount, pTimestampInfos, pTimestamps, pMaxDeviation, __functionAddress);
    }

    /**
     * Query calibrated timestamps.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>In order to be able to correlate the time a particular operation took place at on timelines of different time domains (e.g. a device operation vs a host operation), Vulkan allows querying calibrated timestamps from multiple time domains.</p>
     * 
     * <p>To query calibrated timestamps from a set of time domains, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetCalibratedTimestampsEXT(
     *     VkDevice                                    device,
     *     uint32_t                                    timestampCount,
     *     const VkCalibratedTimestampInfoEXT*         pTimestampInfos,
     *     uint64_t*                                   pTimestamps,
     *     uint64_t*                                   pMaxDeviation);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>The maximum deviation <b>may</b> vary between calls to {@code vkGetCalibratedTimestampsEXT} even for the same set of time domains due to implementation and platform specific reasons. It is the application’s responsibility to assess whether the returned maximum deviation makes the timestamp values suitable for any particular purpose and <b>can</b> choose to re-issue the timestamp calibration call pursuing a lower devation value.</p>
     * </div>
     * 
     * <p>Calibrated timestamp values <b>can</b> be extrapolated to estimate future coinciding timestamp values, however, depending on the nature of the time domains and other properties of the platform extrapolating values over a sufficiently long period of time <b>may</b> no longer be accurate enough to fit any particular purpose, so applications are expected to re-calibrate the timestamps on a regular basis.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pTimestampInfos} <b>must</b> be a valid pointer to an array of {@code timestampCount} valid {@link VkCalibratedTimestampInfoEXT} structures</li>
     * <li>{@code pTimestamps} <b>must</b> be a valid pointer to an array of {@code timestampCount} {@code uint64_t} values</li>
     * <li>{@code pMaxDeviation} <b>must</b> be a valid pointer to a {@code uint64_t} value</li>
     * <li>{@code timestampCount} <b>must</b> be greater than 0</li>
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
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkCalibratedTimestampInfoEXT}</p>
     *
     * @param device          the logical device used to perform the query.
     * @param pTimestampInfos a pointer to an array of {@code timestampCount} {@link VkCalibratedTimestampInfoEXT} structures, describing the time domains the calibrated timestamps should be captured from.
     * @param pTimestamps     a pointer to an array of {@code timestampCount} 64-bit unsigned integer values in which the requested calibrated timestamp values are returned.
     * @param pMaxDeviation   a pointer to a 64-bit unsigned integer value in which the strictly positive maximum deviation, in nanoseconds, of the calibrated timestamp values is returned.
     */
    @NativeType("VkResult")
    public static int vkGetCalibratedTimestampsEXT(VkDevice device, @NativeType("VkCalibratedTimestampInfoEXT const *") VkCalibratedTimestampInfoEXT.Buffer pTimestampInfos, @NativeType("uint64_t *") LongBuffer pTimestamps, @NativeType("uint64_t *") LongBuffer pMaxDeviation) {
        if (CHECKS) {
            check(pTimestamps, pTimestampInfos.remaining());
            check(pMaxDeviation, 1);
        }
        return nvkGetCalibratedTimestampsEXT(device, pTimestampInfos.remaining(), pTimestampInfos.address(), memAddress(pTimestamps), memAddress(pMaxDeviation));
    }

    /** Array version of: {@link #vkGetPhysicalDeviceCalibrateableTimeDomainsEXT GetPhysicalDeviceCalibrateableTimeDomainsEXT} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceCalibrateableTimeDomainsEXT(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") int[] pTimeDomainCount, @Nullable @NativeType("VkTimeDomainEXT *") int[] pTimeDomains) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceCalibrateableTimeDomainsEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pTimeDomainCount, 1);
            checkSafe(pTimeDomains, pTimeDomainCount[0]);
        }
        return callPPPI(physicalDevice.address(), pTimeDomainCount, pTimeDomains, __functionAddress);
    }

    /** Array version of: {@link #vkGetCalibratedTimestampsEXT GetCalibratedTimestampsEXT} */
    @NativeType("VkResult")
    public static int vkGetCalibratedTimestampsEXT(VkDevice device, @NativeType("VkCalibratedTimestampInfoEXT const *") VkCalibratedTimestampInfoEXT.Buffer pTimestampInfos, @NativeType("uint64_t *") long[] pTimestamps, @NativeType("uint64_t *") long[] pMaxDeviation) {
        long __functionAddress = device.getCapabilities().vkGetCalibratedTimestampsEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pTimestamps, pTimestampInfos.remaining());
            check(pMaxDeviation, 1);
        }
        return callPPPPI(device.address(), pTimestampInfos.remaining(), pTimestampInfos.address(), pTimestamps, pMaxDeviation, __functionAddress);
    }

}
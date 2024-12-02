/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * This extension provides an interface to query calibrated timestamps obtained quasi simultaneously from two time domains.
 * 
 * <h5>Promotion to {@code VK_KHR_calibrated_timestamps}</h5>
 * 
 * <p>All functionality in this extension is included in {@link KHRCalibratedTimestamps VK_KHR_calibrated_timestamps}, with the suffix changed to KHR. The original enum names are still available as aliases of the KHR functionality.</p>
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
 * <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2} or <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#versions-1.1">Version 1.1</a></dd>
 * <dt><b>Deprecation State</b></dt>
 * <dd><ul>
 * <li><em>Promoted</em> to {@link KHRCalibratedTimestamps VK_KHR_calibrated_timestamps} extension</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Daniel Rakos <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_calibrated_timestamps]%20@drakos-amd%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_calibrated_timestamps%20extension*">drakos-amd</a></li>
 * </ul></dd>
 * <dt><b>Extension Proposal</b></dt>
 * <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_EXT_calibrated_timestamps.adoc">VK_EXT_calibrated_timestamps</a></dd>
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
 * <li>Faith Ekstrand, Intel</li>
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
     * Extends {@code VkTimeDomainKHR}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_TIME_DOMAIN_DEVICE_EXT TIME_DOMAIN_DEVICE_EXT}</li>
     * <li>{@link #VK_TIME_DOMAIN_CLOCK_MONOTONIC_EXT TIME_DOMAIN_CLOCK_MONOTONIC_EXT}</li>
     * <li>{@link #VK_TIME_DOMAIN_CLOCK_MONOTONIC_RAW_EXT TIME_DOMAIN_CLOCK_MONOTONIC_RAW_EXT}</li>
     * <li>{@link #VK_TIME_DOMAIN_QUERY_PERFORMANCE_COUNTER_EXT TIME_DOMAIN_QUERY_PERFORMANCE_COUNTER_EXT}</li>
     * </ul>
     */
    public static final int
        VK_TIME_DOMAIN_DEVICE_EXT                    = 0,
        VK_TIME_DOMAIN_CLOCK_MONOTONIC_EXT           = 1,
        VK_TIME_DOMAIN_CLOCK_MONOTONIC_RAW_EXT       = 2,
        VK_TIME_DOMAIN_QUERY_PERFORMANCE_COUNTER_EXT = 3;

    /**
     * VkTimeDomainKHR - Supported time domains
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_TIME_DOMAIN_DEVICE_KHR TIME_DOMAIN_DEVICE_KHR} specifies the device time domain. Timestamp values in this time domain use the same units and are comparable with device timestamp values captured using {@link VK10#vkCmdWriteTimestamp CmdWriteTimestamp} or {@link VK13#vkCmdWriteTimestamp2 CmdWriteTimestamp2} and are defined to be incrementing according to the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#limits-timestampPeriod">{@code timestampPeriod}</a> of the device.</li>
     * <li>{@link #VK_TIME_DOMAIN_CLOCK_MONOTONIC_KHR TIME_DOMAIN_CLOCK_MONOTONIC_KHR} specifies the CLOCK_MONOTONIC time domain available on POSIX platforms. Timestamp values in this time domain are in units of nanoseconds and are comparable with platform timestamp values captured using the POSIX clock_gettime API as computed by this example:</li>
     * </ul>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>An implementation supporting {@link KHRCalibratedTimestamps VK_KHR_calibrated_timestamps} or {@link EXTCalibratedTimestamps VK_EXT_calibrated_timestamps} will use the same time domain for all its {@code VkQueue} so that timestamp values reported for {@link #VK_TIME_DOMAIN_DEVICE_KHR TIME_DOMAIN_DEVICE_KHR} can be matched to any timestamp captured through {@link VK10#vkCmdWriteTimestamp CmdWriteTimestamp} or {@link VK13#vkCmdWriteTimestamp2 CmdWriteTimestamp2} .</p>
     * </div>
     * 
     * <pre><code>
     * struct timespec tv;
     * clock_gettime(CLOCK_MONOTONIC, &amp;tv);
     * return tv.tv_nsec + tv.tv_sec*1000000000ull;</code></pre>
     * 
     * <ul>
     * <li>{@link #VK_TIME_DOMAIN_CLOCK_MONOTONIC_RAW_KHR TIME_DOMAIN_CLOCK_MONOTONIC_RAW_KHR} specifies the CLOCK_MONOTONIC_RAW time domain available on POSIX platforms. Timestamp values in this time domain are in units of nanoseconds and are comparable with platform timestamp values captured using the POSIX clock_gettime API as computed by this example:</li>
     * </ul>
     * 
     * <pre><code>
     * struct timespec tv;
     * clock_gettime(CLOCK_MONOTONIC_RAW, &amp;tv);
     * return tv.tv_nsec + tv.tv_sec*1000000000ull;</code></pre>
     * 
     * <ul>
     * <li>{@link #VK_TIME_DOMAIN_QUERY_PERFORMANCE_COUNTER_KHR TIME_DOMAIN_QUERY_PERFORMANCE_COUNTER_KHR} specifies the performance counter (QPC) time domain available on Windows. Timestamp values in this time domain are in the same units as those provided by the Windows QueryPerformanceCounter API and are comparable with platform timestamp values captured using that API as computed by this example:</li>
     * </ul>
     * 
     * <pre><code>
     * LARGE_INTEGER counter;
     * QueryPerformanceCounter(&amp;counter);
     * return counter.QuadPart;</code></pre>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkCalibratedTimestampInfoKHR}, {@link #vkGetPhysicalDeviceCalibrateableTimeDomainsEXT GetPhysicalDeviceCalibrateableTimeDomainsEXT}, {@link KHRCalibratedTimestamps#vkGetPhysicalDeviceCalibrateableTimeDomainsKHR GetPhysicalDeviceCalibrateableTimeDomainsKHR}</p>
     */
    public static final int
        VK_TIME_DOMAIN_DEVICE_KHR                    = 0,
        VK_TIME_DOMAIN_CLOCK_MONOTONIC_KHR           = 1,
        VK_TIME_DOMAIN_CLOCK_MONOTONIC_RAW_KHR       = 2,
        VK_TIME_DOMAIN_QUERY_PERFORMANCE_COUNTER_KHR = 3;

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
     * See {@link KHRCalibratedTimestamps#vkGetPhysicalDeviceCalibrateableTimeDomainsKHR GetPhysicalDeviceCalibrateableTimeDomainsKHR}.
     *
     * @param physicalDevice   the physical device from which to query the set of calibrateable time domains.
     * @param pTimeDomainCount a pointer to an integer related to the number of calibrateable time domains available or queried, as described below.
     * @param pTimeDomains     either {@code NULL} or a pointer to an array of {@code VkTimeDomainKHR} values, indicating the supported calibrateable time domains.
     */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceCalibrateableTimeDomainsEXT(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") IntBuffer pTimeDomainCount, @NativeType("VkTimeDomainKHR *") @Nullable IntBuffer pTimeDomains) {
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
     * See {@link KHRCalibratedTimestamps#vkGetCalibratedTimestampsKHR GetCalibratedTimestampsKHR}.
     *
     * @param device          the logical device used to perform the query.
     * @param pTimestampInfos a pointer to an array of {@code timestampCount} {@link VkCalibratedTimestampInfoKHR} structures, describing the time domains the calibrated timestamps should be captured from.
     * @param pTimestamps     a pointer to an array of {@code timestampCount} 64-bit unsigned integer values in which the requested calibrated timestamp values are returned.
     * @param pMaxDeviation   a pointer to a 64-bit unsigned integer value in which the strictly positive maximum deviation, in nanoseconds, of the calibrated timestamp values is returned.
     */
    @NativeType("VkResult")
    public static int vkGetCalibratedTimestampsEXT(VkDevice device, @NativeType("VkCalibratedTimestampInfoKHR const *") VkCalibratedTimestampInfoKHR.Buffer pTimestampInfos, @NativeType("uint64_t *") LongBuffer pTimestamps, @NativeType("uint64_t *") LongBuffer pMaxDeviation) {
        if (CHECKS) {
            check(pTimestamps, pTimestampInfos.remaining());
            check(pMaxDeviation, 1);
        }
        return nvkGetCalibratedTimestampsEXT(device, pTimestampInfos.remaining(), pTimestampInfos.address(), memAddress(pTimestamps), memAddress(pMaxDeviation));
    }

    /** Array version of: {@link #vkGetPhysicalDeviceCalibrateableTimeDomainsEXT GetPhysicalDeviceCalibrateableTimeDomainsEXT} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceCalibrateableTimeDomainsEXT(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") int[] pTimeDomainCount, @NativeType("VkTimeDomainKHR *") int @Nullable [] pTimeDomains) {
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
    public static int vkGetCalibratedTimestampsEXT(VkDevice device, @NativeType("VkCalibratedTimestampInfoKHR const *") VkCalibratedTimestampInfoKHR.Buffer pTimestampInfos, @NativeType("uint64_t *") long[] pTimestamps, @NativeType("uint64_t *") long[] pMaxDeviation) {
        long __functionAddress = device.getCapabilities().vkGetCalibratedTimestampsEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pTimestamps, pTimestampInfos.remaining());
            check(pMaxDeviation, 1);
        }
        return callPPPPI(device.address(), pTimestampInfos.remaining(), pTimestampInfos.address(), pTimestamps, pMaxDeviation, __functionAddress);
    }

}
/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_calibrated_timestamps = "EXTCalibratedTimestamps".nativeClassVK("EXT_calibrated_timestamps", type = "device", postfix = "EXT") {
    documentation =
        """
        This extension provides an interface to query calibrated timestamps obtained quasi simultaneously from two time domains.

        <h5>VK_EXT_calibrated_timestamps</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_calibrated_timestamps}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>185</dd>

            <dt><b>Revision</b></dt>
            <dd>2</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Daniel Rakos <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_calibrated_timestamps]%20@drakos-amd%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_calibrated_timestamps%20extension%3E%3E">drakos-amd</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2018-10-04</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Matthaeus G. Chajdas, AMD</li>
                <li>Alan Harrison, AMD</li>
                <li>Derrick Owens, AMD</li>
                <li>Daniel Rakos, AMD</li>
                <li>Jason Ekstrand, Intel</li>
                <li>Keith Packard, Valve</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_CALIBRATED_TIMESTAMPS_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "EXT_CALIBRATED_TIMESTAMPS_EXTENSION_NAME".."VK_EXT_calibrated_timestamps"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_CALIBRATED_TIMESTAMP_INFO_EXT".."1000184000"
    )

    EnumConstant(
        """
        VkTimeDomainEXT - Supported time domains

        <h5>Description</h5>
        <ul>
            <li>#TIME_DOMAIN_DEVICE_EXT specifies the device time domain. Timestamp values in this time domain use the same units and are comparable with device timestamp values captured using #CmdWriteTimestamp() or #CmdWriteTimestamp2() and are defined to be incrementing according to the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#limits-timestampPeriod">timestampPeriod</a> of the device.</li>
            <li>#TIME_DOMAIN_CLOCK_MONOTONIC_EXT specifies the CLOCK_MONOTONIC time domain available on POSIX platforms. Timestamp values in this time domain are in units of nanoseconds and are comparable with platform timestamp values captured using the POSIX clock_gettime API as computed by this example:</li>
        </ul>

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        An implementation supporting {@link EXTCalibratedTimestamps VK_EXT_calibrated_timestamps} will use the same time domain for all its {@code VkQueue} so that timestamp values reported for #TIME_DOMAIN_DEVICE_EXT can be matched to any timestamp captured through #CmdWriteTimestamp() or #CmdWriteTimestamp2() .
        </div>

        <pre><code>
￿struct timespec tv;
￿clock_gettime(CLOCK_MONOTONIC, &amp;tv);
￿return tv.tv_nsec + tv.tv_sec*1000000000ull;</code></pre>

        <ul>
            <li>#TIME_DOMAIN_CLOCK_MONOTONIC_RAW_EXT specifies the CLOCK_MONOTONIC_RAW time domain available on POSIX platforms. Timestamp values in this time domain are in units of nanoseconds and are comparable with platform timestamp values captured using the POSIX clock_gettime API as computed by this example:</li>
        </ul>

        <pre><code>
￿struct timespec tv;
￿clock_gettime(CLOCK_MONOTONIC_RAW, &amp;tv);
￿return tv.tv_nsec + tv.tv_sec*1000000000ull;</code></pre>

        <ul>
            <li>#TIME_DOMAIN_QUERY_PERFORMANCE_COUNTER_EXT specifies the performance counter (QPC) time domain available on Windows. Timestamp values in this time domain are in the same units as those provided by the Windows QueryPerformanceCounter API and are comparable with platform timestamp values captured using that API as computed by this example:</li>
        </ul>

        <pre><code>
￿LARGE_INTEGER counter;
￿QueryPerformanceCounter(&amp;counter);
￿return counter.QuadPart;</code></pre>

        <h5>See Also</h5>
        ##VkCalibratedTimestampInfoEXT, #GetPhysicalDeviceCalibrateableTimeDomainsEXT()
        """,

        "TIME_DOMAIN_DEVICE_EXT".."0",
        "TIME_DOMAIN_CLOCK_MONOTONIC_EXT".."1",
        "TIME_DOMAIN_CLOCK_MONOTONIC_RAW_EXT".."2",
        "TIME_DOMAIN_QUERY_PERFORMANCE_COUNTER_EXT".."3"
    )

    VkResult(
        "GetPhysicalDeviceCalibrateableTimeDomainsEXT",
        """
        Query calibrateable time domains.

        <h5>C Specification</h5>
        To query the set of time domains for which a physical device supports timestamp calibration, call:

        <pre><code>
￿VkResult vkGetPhysicalDeviceCalibrateableTimeDomainsEXT(
￿    VkPhysicalDevice                            physicalDevice,
￿    uint32_t*                                   pTimeDomainCount,
￿    VkTimeDomainEXT*                            pTimeDomains);</code></pre>

        <h5>Description</h5>
        If {@code pTimeDomains} is {@code NULL}, then the number of calibrateable time domains supported for the given {@code physicalDevice} is returned in {@code pTimeDomainCount}. Otherwise, {@code pTimeDomainCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pTimeDomains} array, and on return the variable is overwritten with the number of values actually written to {@code pTimeDomains}. If the value of {@code pTimeDomainCount} is less than the number of calibrateable time domains supported, at most {@code pTimeDomainCount} values will be written to {@code pTimeDomains}, and #INCOMPLETE will be returned instead of #SUCCESS, to indicate that not all the available time domains were returned.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code pTimeDomainCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
            <li>If the value referenced by {@code pTimeDomainCount} is not 0, and {@code pTimeDomains} is not {@code NULL}, {@code pTimeDomains} <b>must</b> be a valid pointer to an array of {@code pTimeDomainCount} {@code VkTimeDomainEXT} values</li>
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
        """,

        VkPhysicalDevice("physicalDevice", "the physical device from which to query the set of calibrateable time domains."),
        AutoSize("pTimeDomains")..Check(1)..uint32_t.p("pTimeDomainCount", "a pointer to an integer related to the number of calibrateable time domains available or queried, as described below."),
        nullable..VkTimeDomainEXT.p("pTimeDomains", "either {@code NULL} or a pointer to an array of {@code VkTimeDomainEXT} values, indicating the supported calibrateable time domains.")
    )

    VkResult(
        "GetCalibratedTimestampsEXT",
        """
        Query calibrated timestamps.

        <h5>C Specification</h5>
        In order to be able to correlate the time a particular operation took place at on timelines of different time domains (e.g. a device operation vs a host operation), Vulkan allows querying calibrated timestamps from multiple time domains.

        To query calibrated timestamps from a set of time domains, call:

        <pre><code>
￿VkResult vkGetCalibratedTimestampsEXT(
￿    VkDevice                                    device,
￿    uint32_t                                    timestampCount,
￿    const VkCalibratedTimestampInfoEXT*         pTimestampInfos,
￿    uint64_t*                                   pTimestamps,
￿    uint64_t*                                   pMaxDeviation);</code></pre>

        <h5>Description</h5>
        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        The maximum deviation <b>may</b> vary between calls to {@code vkGetCalibratedTimestampsEXT} even for the same set of time domains due to implementation and platform specific reasons. It is the application’s responsibility to assess whether the returned maximum deviation makes the timestamp values suitable for any particular purpose and <b>can</b> choose to re-issue the timestamp calibration call pursuing a lower devation value.
        </div>

        Calibrated timestamp values <b>can</b> be extrapolated to estimate future coinciding timestamp values, however, depending on the nature of the time domains and other properties of the platform extrapolating values over a sufficiently long period of time <b>may</b> no longer be accurate enough to fit any particular purpose, so applications are expected to re-calibrate the timestamps on a regular basis.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pTimestampInfos} <b>must</b> be a valid pointer to an array of {@code timestampCount} valid ##VkCalibratedTimestampInfoEXT structures</li>
            <li>{@code pTimestamps} <b>must</b> be a valid pointer to an array of {@code timestampCount} {@code uint64_t} values</li>
            <li>{@code pMaxDeviation} <b>must</b> be a valid pointer to a {@code uint64_t} value</li>
            <li>{@code timestampCount} <b>must</b> be greater than 0</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkCalibratedTimestampInfoEXT
        """,

        VkDevice("device", "the logical device used to perform the query."),
        AutoSize("pTimestampInfos", "pTimestamps")..uint32_t("timestampCount", "the number of timestamps to query."),
        VkCalibratedTimestampInfoEXT.const.p("pTimestampInfos", "a pointer to an array of {@code timestampCount} ##VkCalibratedTimestampInfoEXT structures, describing the time domains the calibrated timestamps should be captured from."),
        uint64_t.p("pTimestamps", "a pointer to an array of {@code timestampCount} 64-bit unsigned integer values in which the requested calibrated timestamp values are returned."),
        Check(1)..uint64_t.p("pMaxDeviation", "a pointer to a 64-bit unsigned integer value in which the strictly positive maximum deviation, in nanoseconds, of the calibrated timestamp values is returned.")
    )
}
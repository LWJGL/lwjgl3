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

        <h5>Promotion to {@code VK_KHR_calibrated_timestamps}</h5>
        All functionality in this extension is included in {@link KHRCalibratedTimestamps VK_KHR_calibrated_timestamps}, with the suffix changed to KHR. The original enum names are still available as aliases of the KHR functionality.

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
            <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2} or <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#versions-1.1">Version 1.1</a></dd>

            <dt><b>Deprecation State</b></dt>
            <dd><ul>
                <li><em>Promoted</em> to {@link KHRCalibratedTimestamps VK_KHR_calibrated_timestamps} extension</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Daniel Rakos <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_calibrated_timestamps]%20@drakos-amd%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_calibrated_timestamps%20extension*">drakos-amd</a></li>
            </ul></dd>

            <dt><b>Extension Proposal</b></dt>
            <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_EXT_calibrated_timestamps.adoc">VK_EXT_calibrated_timestamps</a></dd>
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
                <li>Faith Ekstrand, Intel</li>
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
        "Extends {@code VkTimeDomainKHR}.",

        "TIME_DOMAIN_DEVICE_EXT".."0",
        "TIME_DOMAIN_CLOCK_MONOTONIC_EXT".."1",
        "TIME_DOMAIN_CLOCK_MONOTONIC_RAW_EXT".."2",
        "TIME_DOMAIN_QUERY_PERFORMANCE_COUNTER_EXT".."3"
    )

    EnumConstant(
        """
        VkTimeDomainKHR - Supported time domains

        <h5>Description</h5>
        <ul>
            <li>#TIME_DOMAIN_DEVICE_KHR specifies the device time domain. Timestamp values in this time domain use the same units and are comparable with device timestamp values captured using #CmdWriteTimestamp() or #CmdWriteTimestamp2() and are defined to be incrementing according to the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#limits-timestampPeriod">{@code timestampPeriod}</a> of the device.</li>
            <li>#TIME_DOMAIN_CLOCK_MONOTONIC_KHR specifies the CLOCK_MONOTONIC time domain available on POSIX platforms. Timestamp values in this time domain are in units of nanoseconds and are comparable with platform timestamp values captured using the POSIX clock_gettime API as computed by this example:</li>
        </ul>

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        An implementation supporting {@link KHRCalibratedTimestamps VK_KHR_calibrated_timestamps} or {@link EXTCalibratedTimestamps VK_EXT_calibrated_timestamps} will use the same time domain for all its {@code VkQueue} so that timestamp values reported for #TIME_DOMAIN_DEVICE_KHR can be matched to any timestamp captured through #CmdWriteTimestamp() or #CmdWriteTimestamp2() .
        </div>

        <pre><code>
￿struct timespec tv;
￿clock_gettime(CLOCK_MONOTONIC, &amp;tv);
￿return tv.tv_nsec + tv.tv_sec*1000000000ull;</code></pre>

        <ul>
            <li>#TIME_DOMAIN_CLOCK_MONOTONIC_RAW_KHR specifies the CLOCK_MONOTONIC_RAW time domain available on POSIX platforms. Timestamp values in this time domain are in units of nanoseconds and are comparable with platform timestamp values captured using the POSIX clock_gettime API as computed by this example:</li>
        </ul>

        <pre><code>
￿struct timespec tv;
￿clock_gettime(CLOCK_MONOTONIC_RAW, &amp;tv);
￿return tv.tv_nsec + tv.tv_sec*1000000000ull;</code></pre>

        <ul>
            <li>#TIME_DOMAIN_QUERY_PERFORMANCE_COUNTER_KHR specifies the performance counter (QPC) time domain available on Windows. Timestamp values in this time domain are in the same units as those provided by the Windows QueryPerformanceCounter API and are comparable with platform timestamp values captured using that API as computed by this example:</li>
        </ul>

        <pre><code>
￿LARGE_INTEGER counter;
￿QueryPerformanceCounter(&amp;counter);
￿return counter.QuadPart;</code></pre>

        <h5>See Also</h5>
        ##VkCalibratedTimestampInfoKHR, #GetPhysicalDeviceCalibrateableTimeDomainsEXT(), #GetPhysicalDeviceCalibrateableTimeDomainsKHR()
        """,

        "TIME_DOMAIN_DEVICE_KHR".."0",
        "TIME_DOMAIN_CLOCK_MONOTONIC_KHR".."1",
        "TIME_DOMAIN_CLOCK_MONOTONIC_RAW_KHR".."2",
        "TIME_DOMAIN_QUERY_PERFORMANCE_COUNTER_KHR".."3"
    )

    VkResult(
        "GetPhysicalDeviceCalibrateableTimeDomainsEXT",
        "See #GetPhysicalDeviceCalibrateableTimeDomainsKHR().",

        VkPhysicalDevice("physicalDevice", "the physical device from which to query the set of calibrateable time domains."),
        AutoSize("pTimeDomains")..Check(1)..uint32_t.p("pTimeDomainCount", "a pointer to an integer related to the number of calibrateable time domains available or queried, as described below."),
        nullable..VkTimeDomainKHR.p("pTimeDomains", "either {@code NULL} or a pointer to an array of {@code VkTimeDomainKHR} values, indicating the supported calibrateable time domains.")
    )

    VkResult(
        "GetCalibratedTimestampsEXT",
        "See #GetCalibratedTimestampsKHR().",

        VkDevice("device", "the logical device used to perform the query."),
        AutoSize("pTimestampInfos", "pTimestamps")..uint32_t("timestampCount", "the number of timestamps to query."),
        VkCalibratedTimestampInfoKHR.const.p("pTimestampInfos", "a pointer to an array of {@code timestampCount} ##VkCalibratedTimestampInfoKHR structures, describing the time domains the calibrated timestamps should be captured from."),
        uint64_t.p("pTimestamps", "a pointer to an array of {@code timestampCount} 64-bit unsigned integer values in which the requested calibrated timestamp values are returned."),
        Check(1)..uint64_t.p("pMaxDeviation", "a pointer to a 64-bit unsigned integer value in which the strictly positive maximum deviation, in nanoseconds, of the calibrated timestamp values is returned.")
    )
}
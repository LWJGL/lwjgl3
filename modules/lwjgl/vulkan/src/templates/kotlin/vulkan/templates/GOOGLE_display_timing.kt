/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val GOOGLE_display_timing = "GOOGLEDisplayTiming".nativeClassVK("GOOGLE_display_timing", type = "device", postfix = "GOOGLE") {
    documentation =
        """
        This device extension allows an application that uses the {@link KHRSwapchain VK_KHR_swapchain} extension to obtain information about the presentation engine’s display, to obtain timing information about each present, and to schedule a present to happen no earlier than a desired time. An application can use this to minimize various visual anomalies (e.g. stuttering).

        Traditional game and real-time animation applications need to correctly position their geometry for when the presentable image will be presented to the user. To accomplish this, applications need various timing information about the presentation engine’s display. They need to know when presentable images were actually presented, and when they could have been presented. Applications also need to tell the presentation engine to display an image no sooner than a given time. This allows the application to avoid stuttering, so the animation looks smooth to the user.

        This extension treats variable-refresh-rate (VRR) displays as if they are fixed-refresh-rate (FRR) displays.

        <h5>Examples</h5>
        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        The example code for the this extension (like the {@link KHRSurface VK_KHR_surface} and {@code VK_GOOGLE_display_timing} extensions) is contained in the cube demo that is shipped with the official Khronos SDK, and is being kept up-to-date in that location (see: <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Tools/blob/master/cube/cube.c">https://github.com/KhronosGroup/Vulkan-Tools/blob/master/cube/cube.c</a> ).
        </div>

        <h5>VK_GOOGLE_display_timing</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_GOOGLE_display_timing}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>93</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRSwapchain VK_KHR_swapchain}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Ian Elliott <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_GOOGLE_display_timing]%20@ianelliottus%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_GOOGLE_display_timing%20extension%3E%3E">ianelliottus</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2017-02-14</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Ian Elliott, Google</li>
                <li>Jesse Hall, Google</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "GOOGLE_DISPLAY_TIMING_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "GOOGLE_DISPLAY_TIMING_EXTENSION_NAME".."VK_GOOGLE_display_timing"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PRESENT_TIMES_INFO_GOOGLE".."1000092000"
    )

    VkResult(
        "GetRefreshCycleDurationGOOGLE",
        """
        Obtain the RC duration of the PE’s display.

        <h5>C Specification</h5>
        To query the duration of a refresh cycle (RC) for the presentation engine’s display, call:

        <pre><code>
￿VkResult vkGetRefreshCycleDurationGOOGLE(
￿    VkDevice                                    device,
￿    VkSwapchainKHR                              swapchain,
￿    VkRefreshCycleDurationGOOGLE*               pDisplayTimingProperties);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code swapchain} <b>must</b> be a valid {@code VkSwapchainKHR} handle</li>
            <li>{@code pDisplayTimingProperties} <b>must</b> be a valid pointer to a ##VkRefreshCycleDurationGOOGLE structure</li>
            <li>Both of {@code device}, and {@code swapchain} <b>must</b> have been created, allocated, or retrieved from the same {@code VkInstance}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code swapchain} <b>must</b> be externally synchronized</li>
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
                <li>#ERROR_DEVICE_LOST</li>
                <li>#ERROR_SURFACE_LOST_KHR</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkRefreshCycleDurationGOOGLE
        """,

        VkDevice("device", "the device associated with {@code swapchain}."),
        VkSwapchainKHR("swapchain", "the swapchain to obtain the refresh duration for."),
        VkRefreshCycleDurationGOOGLE.p("pDisplayTimingProperties", "a pointer to a ##VkRefreshCycleDurationGOOGLE structure.")
    )

    VkResult(
        "GetPastPresentationTimingGOOGLE",
        """
        Obtain timing of a previously-presented image.

        <h5>C Specification</h5>
        The implementation will maintain a limited amount of history of timing information about previous presents. Because of the asynchronous nature of the presentation engine, the timing information for a given #QueuePresentKHR() command will become available some time later. These time values can be asynchronously queried, and will be returned if available. All time values are in nanoseconds, relative to a monotonically-increasing clock (e.g. {@code CLOCK_MONOTONIC} (see clock_gettime(2)) on Android and Linux).

        To asynchronously query the presentation engine, for newly-available timing information about one or more previous presents to a given swapchain, call:

        <pre><code>
￿VkResult vkGetPastPresentationTimingGOOGLE(
￿    VkDevice                                    device,
￿    VkSwapchainKHR                              swapchain,
￿    uint32_t*                                   pPresentationTimingCount,
￿    VkPastPresentationTimingGOOGLE*             pPresentationTimings);</code></pre>

        <h5>Description</h5>
        If {@code pPresentationTimings} is {@code NULL}, then the number of newly-available timing records for the given {@code swapchain} is returned in {@code pPresentationTimingCount}. Otherwise, {@code pPresentationTimingCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pPresentationTimings} array, and on return the variable is overwritten with the number of structures actually written to {@code pPresentationTimings}. If the value of {@code pPresentationTimingCount} is less than the number of newly-available timing records, at most {@code pPresentationTimingCount} structures will be written, and #INCOMPLETE will be returned instead of #SUCCESS, to indicate that not all the available timing records were returned.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code swapchain} <b>must</b> be a valid {@code VkSwapchainKHR} handle</li>
            <li>{@code pPresentationTimingCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
            <li>If the value referenced by {@code pPresentationTimingCount} is not 0, and {@code pPresentationTimings} is not {@code NULL}, {@code pPresentationTimings} <b>must</b> be a valid pointer to an array of {@code pPresentationTimingCount} ##VkPastPresentationTimingGOOGLE structures</li>
            <li>Both of {@code device}, and {@code swapchain} <b>must</b> have been created, allocated, or retrieved from the same {@code VkInstance}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code swapchain} <b>must</b> be externally synchronized</li>
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
                <li>#ERROR_DEVICE_LOST</li>
                <li>#ERROR_OUT_OF_DATE_KHR</li>
                <li>#ERROR_SURFACE_LOST_KHR</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkPastPresentationTimingGOOGLE
        """,

        VkDevice("device", "the device associated with {@code swapchain}."),
        VkSwapchainKHR("swapchain", "the swapchain to obtain presentation timing information duration for."),
        AutoSize("pPresentationTimings")..Check(1)..uint32_t.p("pPresentationTimingCount", "a pointer to an integer related to the number of ##VkPastPresentationTimingGOOGLE structures to query, as described below."),
        nullable..VkPastPresentationTimingGOOGLE.p("pPresentationTimings", "either {@code NULL} or a pointer to an array of ##VkPastPresentationTimingGOOGLE structures.")
    )
}
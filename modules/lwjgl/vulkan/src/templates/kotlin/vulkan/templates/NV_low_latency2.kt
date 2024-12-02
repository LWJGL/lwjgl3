/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_low_latency2 = "NVLowLatency2".nativeClassVK("NV_low_latency2", type = "device", postfix = "NV") {
    documentation =
        """
        <ul>
            <li>#GetLatencyTimingsNV()</li>
            <li>#LatencySleepNV()</li>
            <li>#QueueNotifyOutOfBandNV()</li>
            <li>#SetLatencyMarkerNV()</li>
            <li>#SetLatencySleepModeNV()</li>
        </ul>

        <h5>Description</h5>
        This extension gives applications timing suggestions on when to start the recording of new frames to reduce the latency between input sampling and frame presentation. Applications can accomplish this through the extension by calling #SetLatencySleepModeNV() to allow the driver to pace a given swapchain, then calling #LatencySleepNV() before input sampling to delay the start of the CPU side work. Additional methods and structures are provided to give insight into the latency pipeline of an application through the latency markers. {@link NVLowLatency VK_NV_low_latency} provides legacy support for applications that make use of the NVIDIA Reflex SDK whereas new implementations should use the {@link NVLowLatency2 VK_NV_low_latency2} extension.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_NV_low_latency2}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>506</dd>

            <dt><b>Revision</b></dt>
            <dd>2</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#versions-1.2">Version 1.2</a> or {@link KHRTimelineSemaphore VK_KHR_timeline_semaphore}</dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Charles Hansen <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NV_low_latency2]%20@cshansen%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NV_low_latency2%20extension*">cshansen</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2023-09-25</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Charles Hansen, NVIDIA</li>
                <li>Liam Middlebrook, NVIDIA</li>
                <li>Lionel Duc, NVIDIA</li>
                <li>James Jones, NVIDIA</li>
                <li>Eric Sullivan, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "NV_LOW_LATENCY_2_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "NV_LOW_LATENCY_2_EXTENSION_NAME".."VK_NV_low_latency2"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_LATENCY_SLEEP_MODE_INFO_NV".."1000505000",
        "STRUCTURE_TYPE_LATENCY_SLEEP_INFO_NV".."1000505001",
        "STRUCTURE_TYPE_SET_LATENCY_MARKER_INFO_NV".."1000505002",
        "STRUCTURE_TYPE_GET_LATENCY_MARKER_INFO_NV".."1000505003",
        "STRUCTURE_TYPE_LATENCY_TIMINGS_FRAME_REPORT_NV".."1000505004",
        "STRUCTURE_TYPE_LATENCY_SUBMISSION_PRESENT_ID_NV".."1000505005",
        "STRUCTURE_TYPE_OUT_OF_BAND_QUEUE_TYPE_INFO_NV".."1000505006",
        "STRUCTURE_TYPE_SWAPCHAIN_LATENCY_CREATE_INFO_NV".."1000505007",
        "STRUCTURE_TYPE_LATENCY_SURFACE_CAPABILITIES_NV".."1000505008"
    )

    EnumConstant(
        """
        VkLatencyMarkerNV - Structure used to mark different points in latency

        <h5>Description</h5>
        The members of the {@code VkLatencyMarkerNV} are used as arguments for #SetLatencyMarkerNV() in the use cases described below:

        <ul>
            <li>#LATENCY_MARKER_SIMULATION_START_NV <b>should</b> be called at the start of the simulation execution each frame, but after the call to {@code vkLatencySleepNV}.</li>
            <li>#LATENCY_MARKER_SIMULATION_END_NV <b>should</b> be called at the end of the simulation execution each frame.</li>
            <li>#LATENCY_MARKER_RENDERSUBMIT_START_NV <b>should</b> be called at the beginning of the render submission execution each frame. This <b>should</b> be wherever Vulkan API calls are made and <b>must</b> not span into asynchronous rendering.</li>
            <li>#LATENCY_MARKER_RENDERSUBMIT_END_NV <b>should</b> be called at the end of the render submission execution each frame.</li>
            <li>#LATENCY_MARKER_PRESENT_START_NV <b>should</b> be called just before {@code vkQueuePresentKHR}.</li>
            <li>#LATENCY_MARKER_PRESENT_END_NV <b>should</b> be called when {@code vkQueuePresentKHR} returns.</li>
            <li>#LATENCY_MARKER_INPUT_SAMPLE_NV <b>should</b> be called just before the application gathers input data.</li>
            <li>#LATENCY_MARKER_TRIGGER_FLASH_NV <b>should</b> be called anywhere between #LATENCY_MARKER_SIMULATION_START_NV and #LATENCY_MARKER_SIMULATION_END_NV whenever a left mouse click occurs.</li>
        </ul>

        <h5>See Also</h5>
        ##VkSetLatencyMarkerInfoNV
        """,

        "LATENCY_MARKER_SIMULATION_START_NV".."0",
        "LATENCY_MARKER_SIMULATION_END_NV".."1",
        "LATENCY_MARKER_RENDERSUBMIT_START_NV".."2",
        "LATENCY_MARKER_RENDERSUBMIT_END_NV".."3",
        "LATENCY_MARKER_PRESENT_START_NV".."4",
        "LATENCY_MARKER_PRESENT_END_NV".."5",
        "LATENCY_MARKER_INPUT_SAMPLE_NV".."6",
        "LATENCY_MARKER_TRIGGER_FLASH_NV".."7",
        "LATENCY_MARKER_OUT_OF_BAND_RENDERSUBMIT_START_NV".."8",
        "LATENCY_MARKER_OUT_OF_BAND_RENDERSUBMIT_END_NV".."9",
        "LATENCY_MARKER_OUT_OF_BAND_PRESENT_START_NV".."10",
        "LATENCY_MARKER_OUT_OF_BAND_PRESENT_END_NV".."11"
    )

    EnumConstant(
        """
        VkOutOfBandQueueTypeNV - Type of out of band queue

        <h5>Description</h5>
        The members of the {@code VkOutOfBandQueueTypeNV} are used to describe the queue type in ##VkOutOfBandQueueTypeInfoNV as described below:

        <ul>
            <li>#OUT_OF_BAND_QUEUE_TYPE_RENDER_NV specifies that work will be submitted to this queue.</li>
            <li>#OUT_OF_BAND_QUEUE_TYPE_PRESENT_NV specifies that this queue will be presented from.</li>
        </ul>

        <h5>See Also</h5>
        ##VkOutOfBandQueueTypeInfoNV
        """,

        "OUT_OF_BAND_QUEUE_TYPE_RENDER_NV".."0",
        "OUT_OF_BAND_QUEUE_TYPE_PRESENT_NV".."1"
    )

    VkResult(
        "SetLatencySleepModeNV",
        """
        Enable or Disable low latency mode on a swapchain.

        <h5>C Specification</h5>
        To enable or disable low latency mode on a swapchain, call:

        <pre><code>
￿VkResult vkSetLatencySleepModeNV(
￿    VkDevice                                    device,
￿    VkSwapchainKHR                              swapchain,
￿    const VkLatencySleepModeInfoNV*             pSleepModeInfo);</code></pre>

        <h5>Description</h5>
        If {@code pSleepModeInfo} is {@code NULL}, {@code vkSetLatencySleepModeNV} will disable low latency mode, low latency boost, and set the minimum present interval previously specified by ##VkLatencySleepModeInfoNV to zero on {@code swapchain}. As an exception to the normal rules for objects which are externally synchronized, the swapchain passed to {@code vkSetLatencySleepModeNV} <b>may</b> be simultaneously used by other threads in calls to functions other than #DestroySwapchainKHR(). Access to the swapchain data associated with this extension <b>must</b> be atomic within the implementation.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code swapchain} <b>must</b> be a valid {@code VkSwapchainKHR} handle</li>
            <li>{@code pSleepModeInfo} <b>must</b> be a valid pointer to a valid ##VkLatencySleepModeInfoNV structure</li>
            <li>{@code swapchain} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_INITIALIZATION_FAILED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkLatencySleepModeInfoNV
        """,

        VkDevice("device", "the device associated with {@code swapchain}."),
        VkSwapchainKHR("swapchain", "the swapchain to enable or disable low latency mode on."),
        VkLatencySleepModeInfoNV.const.p("pSleepModeInfo", "{@code NULL} or a pointer to a ##VkLatencySleepModeInfoNV structure specifying the parameters of the latency sleep mode.")
    )

    VkResult(
        "LatencySleepNV",
        """
        Trigger low latency mode Sleep.

        <h5>C Specification</h5>
        To provide the synchronization primitive used to delay host CPU work for lower latency rendering, call:

        <pre><code>
￿VkResult vkLatencySleepNV(
￿    VkDevice                                    device,
￿    VkSwapchainKHR                              swapchain,
￿    const VkLatencySleepInfoNV*                 pSleepInfo);</code></pre>

        <h5>Description</h5>
        {@code vkLatencySleepNV} returns immediately. Applications <b>should</b> use #WaitSemaphores() with {@code pSleepInfo→signalSemaphore} to delay host CPU work. CPU work refers to application work done before presenting which includes but is not limited to: input sampling, simulation, command buffer recording, command buffer submission, and present submission. Applications <b>should</b> call this function before input sampling, and exactly once between presents.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code swapchain} <b>must</b> be a valid {@code VkSwapchainKHR} handle</li>
            <li>{@code pSleepInfo} <b>must</b> be a valid pointer to a valid ##VkLatencySleepInfoNV structure</li>
            <li>{@code swapchain} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkLatencySleepInfoNV
        """,

        VkDevice("device", "the device associated with {@code swapchain}."),
        VkSwapchainKHR("swapchain", "the swapchain to delay associated CPU work based on ##VkLatencySubmissionPresentIdNV submissions."),
        VkLatencySleepInfoNV.const.p("pSleepInfo", "a pointer to a ##VkLatencySleepInfoNV structure specifying the parameters of the latency sleep.")
    )

    void(
        "SetLatencyMarkerNV",
        """
        Pass in marker for timing info.

        <h5>C Specification</h5>
        An application <b>can</b> provide timestamps at various stages of its frame generation work by calling:

        <pre><code>
￿void vkSetLatencyMarkerNV(
￿    VkDevice                                    device,
￿    VkSwapchainKHR                              swapchain,
￿    const VkSetLatencyMarkerInfoNV*             pLatencyMarkerInfo);</code></pre>

        <h5>Description</h5>
        At the beginning and end of simulation and render threads and beginning and end of #QueuePresentKHR() calls, {@code vkSetLatencyMarkerNV} <b>can</b> be called to provide timestamps for the application’s reference. These timestamps are returned with a call to #GetLatencyTimingsNV() alongside driver provided timestamps at various points of interest with regards to latency within the application. As an exception to the normal rules for objects which are externally synchronized, the swapchain passed to {@code vkSetLatencyMarkerNV} <b>may</b> be simultaneously used by other threads in calls to functions other than #DestroySwapchainKHR(). Access to the swapchain data associated with this extension <b>must</b> be atomic within the implementation.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code swapchain} <b>must</b> be a valid {@code VkSwapchainKHR} handle</li>
            <li>{@code pLatencyMarkerInfo} <b>must</b> be a valid pointer to a valid ##VkSetLatencyMarkerInfoNV structure</li>
            <li>{@code swapchain} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>See Also</h5>
        ##VkSetLatencyMarkerInfoNV
        """,

        VkDevice("device", "the device associated with {@code swapchain}."),
        VkSwapchainKHR("swapchain", "the swapchain to capture timestamps on."),
        VkSetLatencyMarkerInfoNV.const.p("pLatencyMarkerInfo", "")
    )

    void(
        "GetLatencyTimingsNV",
        """
        Get latency marker results.

        <h5>C Specification</h5>
        To get an array containing the newest collected latency data, call:

        <pre><code>
￿void vkGetLatencyTimingsNV(
￿    VkDevice                                    device,
￿    VkSwapchainKHR                              swapchain,
￿    VkGetLatencyMarkerInfoNV*                   pLatencyMarkerInfo);</code></pre>

        <h5>Description</h5>
        The timings returned by {@code vkGetLatencyTimingsNV} contain the timestamps requested from #SetLatencyMarkerNV() and additional implementation-specific markers defined in ##VkLatencyTimingsFrameReportNV.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code swapchain} <b>must</b> be a valid {@code VkSwapchainKHR} handle</li>
            <li>{@code pLatencyMarkerInfo} <b>must</b> be a valid pointer to a ##VkGetLatencyMarkerInfoNV structure</li>
            <li>{@code swapchain} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>See Also</h5>
        ##VkGetLatencyMarkerInfoNV
        """,

        VkDevice("device", "the device associated with {@code swapchain}."),
        VkSwapchainKHR("swapchain", "the swapchain to return data from."),
        VkGetLatencyMarkerInfoNV.p("pLatencyMarkerInfo", "")
    )

    void(
        "QueueNotifyOutOfBandNV",
        """
        Notify out of band queue.

        <h5>C Specification</h5>
        To mark a queue as <em>out of band</em>, so that all {@code vkQueueSubmit} calls on the queue are ignored for latency evaluation, call:

        <pre><code>
￿void vkQueueNotifyOutOfBandNV(
￿    VkQueue                                     queue,
￿    const VkOutOfBandQueueTypeInfoNV*           pQueueTypeInfo);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code queue} <b>must</b> be a valid {@code VkQueue} handle</li>
            <li>{@code pQueueTypeInfo} <b>must</b> be a valid pointer to a valid ##VkOutOfBandQueueTypeInfoNV structure</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html\#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
            <tbody><tr><td>-</td><td>-</td><td>-</td><td>Any</td><td>-</td></tr></tbody>
        </table>

        <h5>See Also</h5>
        ##VkOutOfBandQueueTypeInfoNV
        """,

        VkQueue("queue", "the VkQueue to be marked as out of band."),
        VkOutOfBandQueueTypeInfoNV.const.p("pQueueTypeInfo", "a pointer to a ##VkOutOfBandQueueTypeInfoNV structure specifying the queue type.")
    )
}
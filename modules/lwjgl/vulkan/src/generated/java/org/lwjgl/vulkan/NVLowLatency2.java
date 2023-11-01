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
 * <ul>
 * <li>{@link #vkGetLatencyTimingsNV GetLatencyTimingsNV}</li>
 * <li>{@link #vkLatencySleepNV LatencySleepNV}</li>
 * <li>{@link #vkQueueNotifyOutOfBandNV QueueNotifyOutOfBandNV}</li>
 * <li>{@link #vkSetLatencyMarkerNV SetLatencyMarkerNV}</li>
 * <li>{@link #vkSetLatencySleepModeNV SetLatencySleepModeNV}</li>
 * </ul>
 * 
 * <h5>Description</h5>
 * 
 * <p>This extension gives applications timing suggestions on when to start the recording of new frames to reduce the latency between input sampling and frame presentation. Applications can accomplish this through the extension by calling {@link #vkSetLatencySleepModeNV SetLatencySleepModeNV} to allow the driver to pace a given swapchain, then calling {@link #vkLatencySleepNV LatencySleepNV} before input sampling to delay the start of the CPU side work. Additional methods and structures are provided to give insight into the latency pipeline of an application through the latency markers. {@link NVLowLatency VK_NV_low_latency} provides legacy support for applications that make use of the NVIDIA Reflex SDK whereas new implementations should use the {@link NVLowLatency2 VK_NV_low_latency2} extension.</p>
 * 
 * <h5>VK_NV_low_latency2</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_NV_low_latency2}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>506</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Charles Hansen <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NV_low_latency2]%20@cshansen%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NV_low_latency2%20extension*">cshansen</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2023-09-25</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Charles Hansen, NVIDIA</li>
 * <li>Liam Middlebrook, NVIDIA</li>
 * <li>Lionel Duc, NVIDIA</li>
 * <li>James Jones, NVIDIA</li>
 * <li>Eric Sullivan, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public class NVLowLatency2 {

    /** The extension specification version. */
    public static final int VK_NV_LOW_LATENCY_2_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_NV_LOW_LATENCY_2_EXTENSION_NAME = "VK_NV_low_latency2";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_LATENCY_SLEEP_MODE_INFO_NV STRUCTURE_TYPE_LATENCY_SLEEP_MODE_INFO_NV}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_LATENCY_SLEEP_INFO_NV STRUCTURE_TYPE_LATENCY_SLEEP_INFO_NV}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SET_LATENCY_MARKER_INFO_NV STRUCTURE_TYPE_SET_LATENCY_MARKER_INFO_NV}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_GET_LATENCY_MARKER_INFO_NV STRUCTURE_TYPE_GET_LATENCY_MARKER_INFO_NV}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_LATENCY_TIMINGS_FRAME_REPORT_NV STRUCTURE_TYPE_LATENCY_TIMINGS_FRAME_REPORT_NV}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_LATENCY_SUBMISSION_PRESENT_ID_NV STRUCTURE_TYPE_LATENCY_SUBMISSION_PRESENT_ID_NV}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_OUT_OF_BAND_QUEUE_TYPE_INFO_NV STRUCTURE_TYPE_OUT_OF_BAND_QUEUE_TYPE_INFO_NV}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SWAPCHAIN_LATENCY_CREATE_INFO_NV STRUCTURE_TYPE_SWAPCHAIN_LATENCY_CREATE_INFO_NV}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_LATENCY_SURFACE_CAPABILITIES_NV STRUCTURE_TYPE_LATENCY_SURFACE_CAPABILITIES_NV}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_LATENCY_SLEEP_MODE_INFO_NV       = 1000505000,
        VK_STRUCTURE_TYPE_LATENCY_SLEEP_INFO_NV            = 1000505001,
        VK_STRUCTURE_TYPE_SET_LATENCY_MARKER_INFO_NV       = 1000505002,
        VK_STRUCTURE_TYPE_GET_LATENCY_MARKER_INFO_NV       = 1000505003,
        VK_STRUCTURE_TYPE_LATENCY_TIMINGS_FRAME_REPORT_NV  = 1000505004,
        VK_STRUCTURE_TYPE_LATENCY_SUBMISSION_PRESENT_ID_NV = 1000505005,
        VK_STRUCTURE_TYPE_OUT_OF_BAND_QUEUE_TYPE_INFO_NV   = 1000505006,
        VK_STRUCTURE_TYPE_SWAPCHAIN_LATENCY_CREATE_INFO_NV = 1000505007,
        VK_STRUCTURE_TYPE_LATENCY_SURFACE_CAPABILITIES_NV  = 1000505008;

    /**
     * VkLatencyMarkerNV - Structure used to mark different points in latency
     * 
     * <h5>Description</h5>
     * 
     * <p>The members of the {@code VkLatencyMarkerNV} are used as arguments for {@link #vkSetLatencyMarkerNV SetLatencyMarkerNV} in the use cases described below:</p>
     * 
     * <ul>
     * <li>{@link #VK_LATENCY_MARKER_SIMULATION_START_NV LATENCY_MARKER_SIMULATION_START_NV} <b>should</b> be called at the start of the simulation execution each frame, but after the call to {@code vkLatencySleepNV}.</li>
     * <li>{@link #VK_LATENCY_MARKER_SIMULATION_END_NV LATENCY_MARKER_SIMULATION_END_NV} <b>should</b> be called at the end of the simulation execution each frame.</li>
     * <li>{@link #VK_LATENCY_MARKER_RENDERSUBMIT_START_NV LATENCY_MARKER_RENDERSUBMIT_START_NV} <b>should</b> be called at the beginning of the render submission execution each frame. This <b>should</b> be wherever Vulkan API calls are made and <b>must</b> not span into asynchronous rendering.</li>
     * <li>{@link #VK_LATENCY_MARKER_RENDERSUBMIT_END_NV LATENCY_MARKER_RENDERSUBMIT_END_NV} <b>should</b> be called at the end of the render submission execution each frame.</li>
     * <li>{@link #VK_LATENCY_MARKER_PRESENT_START_NV LATENCY_MARKER_PRESENT_START_NV} <b>should</b> be called just before {@code vkQueuePresentKHR}.</li>
     * <li>{@link #VK_LATENCY_MARKER_PRESENT_END_NV LATENCY_MARKER_PRESENT_END_NV} <b>should</b> be called when {@code vkQueuePresentKHR} returns.</li>
     * <li>{@link #VK_LATENCY_MARKER_INPUT_SAMPLE_NV LATENCY_MARKER_INPUT_SAMPLE_NV} <b>should</b> be called just before the application gathers input data.</li>
     * <li>{@link #VK_LATENCY_MARKER_TRIGGER_FLASH_NV LATENCY_MARKER_TRIGGER_FLASH_NV} <b>should</b> be called anywhere between {@link #VK_LATENCY_MARKER_SIMULATION_START_NV LATENCY_MARKER_SIMULATION_START_NV} and {@link #VK_LATENCY_MARKER_SIMULATION_END_NV LATENCY_MARKER_SIMULATION_END_NV} whenever a left mouse click occurs.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkSetLatencyMarkerInfoNV}</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_LATENCY_MARKER_OUT_OF_BAND_RENDERSUBMIT_START_NV LATENCY_MARKER_OUT_OF_BAND_RENDERSUBMIT_START_NV}</li>
     * <li>{@link #VK_LATENCY_MARKER_OUT_OF_BAND_RENDERSUBMIT_END_NV LATENCY_MARKER_OUT_OF_BAND_RENDERSUBMIT_END_NV}</li>
     * <li>{@link #VK_LATENCY_MARKER_OUT_OF_BAND_PRESENT_START_NV LATENCY_MARKER_OUT_OF_BAND_PRESENT_START_NV}</li>
     * <li>{@link #VK_LATENCY_MARKER_OUT_OF_BAND_PRESENT_END_NV LATENCY_MARKER_OUT_OF_BAND_PRESENT_END_NV}</li>
     * </ul>
     */
    public static final int
        VK_LATENCY_MARKER_SIMULATION_START_NV               = 0,
        VK_LATENCY_MARKER_SIMULATION_END_NV                 = 1,
        VK_LATENCY_MARKER_RENDERSUBMIT_START_NV             = 2,
        VK_LATENCY_MARKER_RENDERSUBMIT_END_NV               = 3,
        VK_LATENCY_MARKER_PRESENT_START_NV                  = 4,
        VK_LATENCY_MARKER_PRESENT_END_NV                    = 5,
        VK_LATENCY_MARKER_INPUT_SAMPLE_NV                   = 6,
        VK_LATENCY_MARKER_TRIGGER_FLASH_NV                  = 7,
        VK_LATENCY_MARKER_OUT_OF_BAND_RENDERSUBMIT_START_NV = 8,
        VK_LATENCY_MARKER_OUT_OF_BAND_RENDERSUBMIT_END_NV   = 9,
        VK_LATENCY_MARKER_OUT_OF_BAND_PRESENT_START_NV      = 10,
        VK_LATENCY_MARKER_OUT_OF_BAND_PRESENT_END_NV        = 11;

    /**
     * VkOutOfBandQueueTypeNV - Type of out of band queue
     * 
     * <h5>Description</h5>
     * 
     * <p>The members of the {@code VkOutOfBandQueueTypeNV} are used to describe the queue type in {@link VkOutOfBandQueueTypeInfoNV} as described below:</p>
     * 
     * <ul>
     * <li>{@link #VK_OUT_OF_BAND_QUEUE_TYPE_RENDER_NV OUT_OF_BAND_QUEUE_TYPE_RENDER_NV} indicates that work will be submitted to this queue.</li>
     * <li>{@link #VK_OUT_OF_BAND_QUEUE_TYPE_PRESENT_NV OUT_OF_BAND_QUEUE_TYPE_PRESENT_NV} indicates that this queue will be presented from.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkOutOfBandQueueTypeInfoNV}</p>
     */
    public static final int
        VK_OUT_OF_BAND_QUEUE_TYPE_RENDER_NV  = 0,
        VK_OUT_OF_BAND_QUEUE_TYPE_PRESENT_NV = 1;

    protected NVLowLatency2() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkSetLatencySleepModeNV ] ---

    /** Unsafe version of: {@link #vkSetLatencySleepModeNV SetLatencySleepModeNV} */
    public static int nvkSetLatencySleepModeNV(VkDevice device, long swapchain, long pSleepModeInfo) {
        long __functionAddress = device.getCapabilities().vkSetLatencySleepModeNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(device.address(), swapchain, pSleepModeInfo, __functionAddress);
    }

    /**
     * Enable or Disable low latency mode on a swapchain.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To enable or disable low latency mode on a swapchain, call:</p>
     * 
     * <pre><code>
     * VkResult vkSetLatencySleepModeNV(
     *     VkDevice                                    device,
     *     VkSwapchainKHR                              swapchain,
     *     const VkLatencySleepModeInfoNV*             pSleepModeInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>If {@code pSleepModeInfo} is {@code NULL}, {@code vkSetLatencySleepModeNV} will disable low latency mode, low latency boost, and set the minimum present interval previously specified by {@link VkLatencySleepModeInfoNV} to zero on {@code swapchain}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code swapchain} <b>must</b> be a valid {@code VkSwapchainKHR} handle</li>
     * <li>{@code pSleepModeInfo} <b>must</b> be a valid pointer to a valid {@link VkLatencySleepModeInfoNV} structure</li>
     * <li>{@code swapchain} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
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
     * <li>{@link VK10#VK_ERROR_INITIALIZATION_FAILED ERROR_INITIALIZATION_FAILED}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkLatencySleepModeInfoNV}</p>
     *
     * @param device         the device associated with {@code swapchain}.
     * @param swapchain      the swapchain to enable or disable low latency mode on.
     * @param pSleepModeInfo {@code NULL} or a pointer to a {@link VkLatencySleepModeInfoNV} structure specifying the parameters of the latency sleep mode.
     */
    @NativeType("VkResult")
    public static int vkSetLatencySleepModeNV(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain, @NativeType("VkLatencySleepModeInfoNV const *") VkLatencySleepModeInfoNV pSleepModeInfo) {
        return nvkSetLatencySleepModeNV(device, swapchain, pSleepModeInfo.address());
    }

    // --- [ vkLatencySleepNV ] ---

    /** Unsafe version of: {@link #vkLatencySleepNV LatencySleepNV} */
    public static int nvkLatencySleepNV(VkDevice device, long swapchain, long pSleepInfo) {
        long __functionAddress = device.getCapabilities().vkLatencySleepNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(device.address(), swapchain, pSleepInfo, __functionAddress);
    }

    /**
     * Trigger low latency mode Sleep.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To provide the synchronization primitive used to delay host CPU work for lower latency rendering, call:</p>
     * 
     * <pre><code>
     * VkResult vkLatencySleepNV(
     *     VkDevice                                    device,
     *     VkSwapchainKHR                              swapchain,
     *     const VkLatencySleepInfoNV*                 pSleepInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@code vkLatencySleepNV} returns immediately. Applications <b>should</b> use {@link VK12#vkWaitSemaphores WaitSemaphores} with {@code pSleepInfo}{@code ::signalSemaphore} to delay host CPU work. CPU work refers to application work done before presenting which includes but is not limited to: input sampling, simulation, command buffer recording, command buffer submission, and present submission. It is recommended to call this function before input sampling. When using this function, it <b>should</b> be called exactly once between presents.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code swapchain} <b>must</b> be a valid {@code VkSwapchainKHR} handle</li>
     * <li>{@code pSleepInfo} <b>must</b> be a valid pointer to a valid {@link VkLatencySleepInfoNV} structure</li>
     * <li>{@code swapchain} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
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
     * <li>{@link VK10#VK_ERROR_UNKNOWN ERROR_UNKNOWN}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkLatencySleepInfoNV}</p>
     *
     * @param device     the device associated with {@code swapchain}.
     * @param swapchain  the swapchain to delay associated CPU work based on {@link VkLatencySubmissionPresentIdNV} submissions.
     * @param pSleepInfo a pointer to a {@link VkLatencySleepInfoNV} structure specifying the parameters of the latency sleep.
     */
    @NativeType("VkResult")
    public static int vkLatencySleepNV(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain, @NativeType("VkLatencySleepInfoNV const *") VkLatencySleepInfoNV pSleepInfo) {
        return nvkLatencySleepNV(device, swapchain, pSleepInfo.address());
    }

    // --- [ vkSetLatencyMarkerNV ] ---

    /** Unsafe version of: {@link #vkSetLatencyMarkerNV SetLatencyMarkerNV} */
    public static void nvkSetLatencyMarkerNV(VkDevice device, long swapchain, long pLatencyMarkerInfo) {
        long __functionAddress = device.getCapabilities().vkSetLatencyMarkerNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(device.address(), swapchain, pLatencyMarkerInfo, __functionAddress);
    }

    /**
     * Pass in marker for timing info.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>An application <b>can</b> provide timestamps at various stages of its frame generation work by calling:</p>
     * 
     * <pre><code>
     * void vkSetLatencyMarkerNV(
     *     VkDevice                                    device,
     *     VkSwapchainKHR                              swapchain,
     *     const VkSetLatencyMarkerInfoNV*             pLatencyMarkerInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>At the beginning and end of simulation and render threads and beginning and end of {@link KHRSwapchain#vkQueuePresentKHR QueuePresentKHR} calls, {@code vkSetLatencyMarkerNV} <b>can</b> be called to provide timestamps for the application’s reference. These timestamps are returned with a call to {@link #vkGetLatencyTimingsNV GetLatencyTimingsNV} alongside driver provided timestamps at various points of interest with regards to latency within the application.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code swapchain} <b>must</b> be a valid {@code VkSwapchainKHR} handle</li>
     * <li>{@code pLatencyMarkerInfo} <b>must</b> be a valid pointer to a valid {@link VkSetLatencyMarkerInfoNV} structure</li>
     * <li>{@code swapchain} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkSetLatencyMarkerInfoNV}</p>
     *
     * @param device    the device associated with {@code swapchain}.
     * @param swapchain the swapchain to capture timestamps on.
     */
    public static void vkSetLatencyMarkerNV(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain, @NativeType("VkSetLatencyMarkerInfoNV const *") VkSetLatencyMarkerInfoNV pLatencyMarkerInfo) {
        nvkSetLatencyMarkerNV(device, swapchain, pLatencyMarkerInfo.address());
    }

    // --- [ vkGetLatencyTimingsNV ] ---

    /** Unsafe version of: {@link #vkGetLatencyTimingsNV GetLatencyTimingsNV} */
    public static void nvkGetLatencyTimingsNV(VkDevice device, long swapchain, long pTimingCount, long pLatencyMarkerInfo) {
        long __functionAddress = device.getCapabilities().vkGetLatencyTimingsNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPPV(device.address(), swapchain, pTimingCount, pLatencyMarkerInfo, __functionAddress);
    }

    /**
     * Get latency marker results.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To get an array containing the newest collected latency data, call:</p>
     * 
     * <pre><code>
     * void vkGetLatencyTimingsNV(
     *     VkDevice                                    device,
     *     VkSwapchainKHR                              swapchain,
     *     uint32_t*                                   pTimingCount,
     *     VkGetLatencyMarkerInfoNV*                   pLatencyMarkerInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The timings returned by {@code vkGetLatencyTimingsNV} contain the timestamps requested from {@link #vkSetLatencyMarkerNV SetLatencyMarkerNV} and additional implementation-specific markers defined in {@link VkLatencyTimingsFrameReportNV}. If {@code pTimings} is {@code NULL}, then the maximum number of queryable frame data is returned in {@code pTimingCount}. Otherwise, {@code pTimingCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pTimings} array in {@code pGetLatencyMarkerInfo}, and on return the variable is overwritten with the number of values actually written to {@code pTimings}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code swapchain} <b>must</b> be a valid {@code VkSwapchainKHR} handle</li>
     * <li>{@code pTimingCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
     * <li>{@code pLatencyMarkerInfo} <b>must</b> be a valid pointer to a {@link VkGetLatencyMarkerInfoNV} structure</li>
     * <li>{@code swapchain} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkGetLatencyMarkerInfoNV}</p>
     *
     * @param device       the device associated with {@code swapchain}.
     * @param swapchain    the swapchain to return data from.
     * @param pTimingCount a pointer to an integer related to the number of of previous frames of latency data available or queried, as described below.
     */
    public static void vkGetLatencyTimingsNV(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain, @NativeType("uint32_t *") IntBuffer pTimingCount, @NativeType("VkGetLatencyMarkerInfoNV *") VkGetLatencyMarkerInfoNV pLatencyMarkerInfo) {
        if (CHECKS) {
            check(pTimingCount, 1);
        }
        nvkGetLatencyTimingsNV(device, swapchain, memAddress(pTimingCount), pLatencyMarkerInfo.address());
    }

    // --- [ vkQueueNotifyOutOfBandNV ] ---

    /** Unsafe version of: {@link #vkQueueNotifyOutOfBandNV QueueNotifyOutOfBandNV} */
    public static void nvkQueueNotifyOutOfBandNV(VkQueue queue, long pQueueTypeInfo) {
        long __functionAddress = queue.getCapabilities().vkQueueNotifyOutOfBandNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(queue.address(), pQueueTypeInfo, __functionAddress);
    }

    /**
     * Notify out of band queue.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>An application can mark a queue as Out of Band to indicate that all {@code vkQueueSubmit} calls on this queue are ignored for latency evaluation by calling:</p>
     * 
     * <pre><code>
     * void vkQueueNotifyOutOfBandNV(
     *     VkQueue                                     queue,
     *     const VkOutOfBandQueueTypeInfoNV*           pQueueTypeInfo);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code queue} <b>must</b> be a valid {@code VkQueue} handle</li>
     * <li>{@code pQueueTypeInfo} <b>must</b> be a valid pointer to a valid {@link VkOutOfBandQueueTypeInfoNV} structure</li>
     * </ul>
     * 
     * <h5>Command Properties</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>-</td><td>-</td><td>-</td><td>Any</td><td>-</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkOutOfBandQueueTypeInfoNV}</p>
     *
     * @param queue          the VkQueue to be marked as out of band.
     * @param pQueueTypeInfo a pointer to a {@link VkOutOfBandQueueTypeInfoNV} structure specifying the queue type.
     */
    public static void vkQueueNotifyOutOfBandNV(VkQueue queue, @NativeType("VkOutOfBandQueueTypeInfoNV const *") VkOutOfBandQueueTypeInfoNV pQueueTypeInfo) {
        nvkQueueNotifyOutOfBandNV(queue, pQueueTypeInfo.address());
    }

    /** Array version of: {@link #vkGetLatencyTimingsNV GetLatencyTimingsNV} */
    public static void vkGetLatencyTimingsNV(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain, @NativeType("uint32_t *") int[] pTimingCount, @NativeType("VkGetLatencyMarkerInfoNV *") VkGetLatencyMarkerInfoNV pLatencyMarkerInfo) {
        long __functionAddress = device.getCapabilities().vkGetLatencyTimingsNV;
        if (CHECKS) {
            check(__functionAddress);
            check(pTimingCount, 1);
        }
        callPJPPV(device.address(), swapchain, pTimingCount, pLatencyMarkerInfo.address(), __functionAddress);
    }

}
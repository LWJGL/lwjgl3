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
 * This extension defines a set of utility functions for use with the {@link KHRDisplay VK_KHR_display} and {@link KHRDisplaySwapchain VK_KHR_display_swapchain} extensions.
 * 
 * <h5>VK_EXT_display_control</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_display_control}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>92</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link EXTDisplaySurfaceCounter VK_EXT_display_surface_counter}</li>
 * <li>Requires {@link KHRSwapchain VK_KHR_swapchain}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>James Jones <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_display_control]%20@cubanismo%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_display_control%20extension%3E%3E">cubanismo</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2016-12-13</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Pierre Boudier, NVIDIA</li>
 * <li>James Jones, NVIDIA</li>
 * <li>Damien Leone, NVIDIA</li>
 * <li>Pierre-Loup Griffais, Valve</li>
 * <li>Daniel Vetter, Intel</li>
 * </ul></dd>
 * </dl>
 */
public class EXTDisplayControl {

    /** The extension specification version. */
    public static final int VK_EXT_DISPLAY_CONTROL_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_DISPLAY_CONTROL_EXTENSION_NAME = "VK_EXT_display_control";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_DISPLAY_POWER_INFO_EXT STRUCTURE_TYPE_DISPLAY_POWER_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DEVICE_EVENT_INFO_EXT STRUCTURE_TYPE_DEVICE_EVENT_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DISPLAY_EVENT_INFO_EXT STRUCTURE_TYPE_DISPLAY_EVENT_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SWAPCHAIN_COUNTER_CREATE_INFO_EXT STRUCTURE_TYPE_SWAPCHAIN_COUNTER_CREATE_INFO_EXT}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_DISPLAY_POWER_INFO_EXT            = 1000091000,
        VK_STRUCTURE_TYPE_DEVICE_EVENT_INFO_EXT             = 1000091001,
        VK_STRUCTURE_TYPE_DISPLAY_EVENT_INFO_EXT            = 1000091002,
        VK_STRUCTURE_TYPE_SWAPCHAIN_COUNTER_CREATE_INFO_EXT = 1000091003;

    /**
     * VkDisplayPowerStateEXT - Possible power states for a display
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_DISPLAY_POWER_STATE_OFF_EXT DISPLAY_POWER_STATE_OFF_EXT} specifies that the display is powered down.</li>
     * <li>{@link #VK_DISPLAY_POWER_STATE_SUSPEND_EXT DISPLAY_POWER_STATE_SUSPEND_EXT} specifies that the display is put into a low power mode, from which it <b>may</b> be able to transition back to {@link #VK_DISPLAY_POWER_STATE_ON_EXT DISPLAY_POWER_STATE_ON_EXT} more quickly than if it were in {@link #VK_DISPLAY_POWER_STATE_OFF_EXT DISPLAY_POWER_STATE_OFF_EXT}. This state <b>may</b> be the same as {@link #VK_DISPLAY_POWER_STATE_OFF_EXT DISPLAY_POWER_STATE_OFF_EXT}.</li>
     * <li>{@link #VK_DISPLAY_POWER_STATE_ON_EXT DISPLAY_POWER_STATE_ON_EXT} specifies that the display is powered on.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkDisplayPowerInfoEXT}</p>
     */
    public static final int
        VK_DISPLAY_POWER_STATE_OFF_EXT     = 0,
        VK_DISPLAY_POWER_STATE_SUSPEND_EXT = 1,
        VK_DISPLAY_POWER_STATE_ON_EXT      = 2;

    /**
     * VkDeviceEventTypeEXT - Events that can occur on a device object
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_DEVICE_EVENT_TYPE_DISPLAY_HOTPLUG_EXT DEVICE_EVENT_TYPE_DISPLAY_HOTPLUG_EXT} specifies that the fence is signaled when a display is plugged into or unplugged from the specified device. Applications <b>can</b> use this notification to determine when they need to re-enumerate the available displays on a device.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkDeviceEventInfoEXT}</p>
     */
    public static final int VK_DEVICE_EVENT_TYPE_DISPLAY_HOTPLUG_EXT = 0;

    /**
     * VkDisplayEventTypeEXT - Events that can occur on a display object
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_DISPLAY_EVENT_TYPE_FIRST_PIXEL_OUT_EXT DISPLAY_EVENT_TYPE_FIRST_PIXEL_OUT_EXT} specifies that the fence is signaled when the first pixel of the next display refresh cycle leaves the display engine for the display.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkDisplayEventInfoEXT}</p>
     */
    public static final int VK_DISPLAY_EVENT_TYPE_FIRST_PIXEL_OUT_EXT = 0;

    protected EXTDisplayControl() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkDisplayPowerControlEXT ] ---

    /** Unsafe version of: {@link #vkDisplayPowerControlEXT DisplayPowerControlEXT} */
    public static int nvkDisplayPowerControlEXT(VkDevice device, long display, long pDisplayPowerInfo) {
        long __functionAddress = device.getCapabilities().vkDisplayPowerControlEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(device.address(), display, pDisplayPowerInfo, __functionAddress);
    }

    /**
     * Set the power state of a display.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To set the power state of a display, call:</p>
     * 
     * <pre><code>
     * VkResult vkDisplayPowerControlEXT(
     *     VkDevice                                    device,
     *     VkDisplayKHR                                display,
     *     const VkDisplayPowerInfoEXT*                pDisplayPowerInfo);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code display} <b>must</b> be a valid {@code VkDisplayKHR} handle</li>
     * <li>{@code pDisplayPowerInfo} <b>must</b> be a valid pointer to a valid {@link VkDisplayPowerInfoEXT} structure</li>
     * <li>Both of {@code device}, and {@code display} <b>must</b> have been created, allocated, or retrieved from the same {@code VkPhysicalDevice}</li>
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
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkDisplayPowerInfoEXT}</p>
     *
     * @param device            a logical device associated with {@code display}.
     * @param display           the display whose power state is modified.
     * @param pDisplayPowerInfo a pointer to a {@link VkDisplayPowerInfoEXT} structure specifying the new power state of {@code display}.
     */
    @NativeType("VkResult")
    public static int vkDisplayPowerControlEXT(VkDevice device, @NativeType("VkDisplayKHR") long display, @NativeType("VkDisplayPowerInfoEXT const *") VkDisplayPowerInfoEXT pDisplayPowerInfo) {
        return nvkDisplayPowerControlEXT(device, display, pDisplayPowerInfo.address());
    }

    // --- [ vkRegisterDeviceEventEXT ] ---

    /** Unsafe version of: {@link #vkRegisterDeviceEventEXT RegisterDeviceEventEXT} */
    public static int nvkRegisterDeviceEventEXT(VkDevice device, long pDeviceEventInfo, long pAllocator, long pFence) {
        long __functionAddress = device.getCapabilities().vkRegisterDeviceEventEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(device.address(), pDeviceEventInfo, pAllocator, pFence, __functionAddress);
    }

    /**
     * Signal a fence when a device event occurs.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To create a fence that will be signaled when an event occurs on a device, call:</p>
     * 
     * <pre><code>
     * VkResult vkRegisterDeviceEventEXT(
     *     VkDevice                                    device,
     *     const VkDeviceEventInfoEXT*                 pDeviceEventInfo,
     *     const VkAllocationCallbacks*                pAllocator,
     *     VkFence*                                    pFence);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pDeviceEventInfo} <b>must</b> be a valid pointer to a valid {@link VkDeviceEventInfoEXT} structure</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>{@code pFence} <b>must</b> be a valid pointer to a {@code VkFence} handle</li>
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
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}, {@link VkDeviceEventInfoEXT}</p>
     *
     * @param device           a logical device on which the event <b>may</b> occur.
     * @param pDeviceEventInfo a pointer to a {@link VkDeviceEventInfoEXT} structure describing the event of interest to the application.
     * @param pAllocator       controls host memory allocation as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     * @param pFence           a pointer to a handle in which the resulting fence object is returned.
     */
    @NativeType("VkResult")
    public static int vkRegisterDeviceEventEXT(VkDevice device, @NativeType("VkDeviceEventInfoEXT const *") VkDeviceEventInfoEXT pDeviceEventInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkFence *") LongBuffer pFence) {
        if (CHECKS) {
            check(pFence, 1);
        }
        return nvkRegisterDeviceEventEXT(device, pDeviceEventInfo.address(), memAddressSafe(pAllocator), memAddress(pFence));
    }

    // --- [ vkRegisterDisplayEventEXT ] ---

    /** Unsafe version of: {@link #vkRegisterDisplayEventEXT RegisterDisplayEventEXT} */
    public static int nvkRegisterDisplayEventEXT(VkDevice device, long display, long pDisplayEventInfo, long pAllocator, long pFence) {
        long __functionAddress = device.getCapabilities().vkRegisterDisplayEventEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPPPI(device.address(), display, pDisplayEventInfo, pAllocator, pFence, __functionAddress);
    }

    /**
     * Signal a fence when a display event occurs.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To create a fence that will be signaled when an event occurs on a {@code VkDisplayKHR} object, call:</p>
     * 
     * <pre><code>
     * VkResult vkRegisterDisplayEventEXT(
     *     VkDevice                                    device,
     *     VkDisplayKHR                                display,
     *     const VkDisplayEventInfoEXT*                pDisplayEventInfo,
     *     const VkAllocationCallbacks*                pAllocator,
     *     VkFence*                                    pFence);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code display} <b>must</b> be a valid {@code VkDisplayKHR} handle</li>
     * <li>{@code pDisplayEventInfo} <b>must</b> be a valid pointer to a valid {@link VkDisplayEventInfoEXT} structure</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>{@code pFence} <b>must</b> be a valid pointer to a {@code VkFence} handle</li>
     * <li>Both of {@code device}, and {@code display} <b>must</b> have been created, allocated, or retrieved from the same {@code VkPhysicalDevice}</li>
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
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}, {@link VkDisplayEventInfoEXT}</p>
     *
     * @param device            a logical device associated with {@code display}
     * @param display           the display on which the event <b>may</b> occur.
     * @param pDisplayEventInfo a pointer to a {@link VkDisplayEventInfoEXT} structure describing the event of interest to the application.
     * @param pAllocator        controls host memory allocation as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a> chapter.
     * @param pFence            a pointer to a handle in which the resulting fence object is returned.
     */
    @NativeType("VkResult")
    public static int vkRegisterDisplayEventEXT(VkDevice device, @NativeType("VkDisplayKHR") long display, @NativeType("VkDisplayEventInfoEXT const *") VkDisplayEventInfoEXT pDisplayEventInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkFence *") LongBuffer pFence) {
        if (CHECKS) {
            check(pFence, 1);
        }
        return nvkRegisterDisplayEventEXT(device, display, pDisplayEventInfo.address(), memAddressSafe(pAllocator), memAddress(pFence));
    }

    // --- [ vkGetSwapchainCounterEXT ] ---

    /** Unsafe version of: {@link #vkGetSwapchainCounterEXT GetSwapchainCounterEXT} */
    public static int nvkGetSwapchainCounterEXT(VkDevice device, long swapchain, int counter, long pCounterValue) {
        long __functionAddress = device.getCapabilities().vkGetSwapchainCounterEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJPI(device.address(), swapchain, counter, pCounterValue, __functionAddress);
    }

    /**
     * Query the current value of a surface counter.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The requested counters become active when the first presentation command for the associated swapchain is processed by the presentation engine. To query the value of an active counter, use:</p>
     * 
     * <pre><code>
     * VkResult vkGetSwapchainCounterEXT(
     *     VkDevice                                    device,
     *     VkSwapchainKHR                              swapchain,
     *     VkSurfaceCounterFlagBitsEXT                 counter,
     *     uint64_t*                                   pCounterValue);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>If a counter is not available because the swapchain is out of date, the implementation <b>may</b> return {@link KHRSwapchain#VK_ERROR_OUT_OF_DATE_KHR ERROR_OUT_OF_DATE_KHR}.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>One or more present commands on {@code swapchain} <b>must</b> have been processed by the presentation engine</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code swapchain} <b>must</b> be a valid {@code VkSwapchainKHR} handle</li>
     * <li>{@code counter} <b>must</b> be a valid {@code VkSurfaceCounterFlagBitsEXT} value</li>
     * <li>{@code pCounterValue} <b>must</b> be a valid pointer to a {@code uint64_t} value</li>
     * <li>Both of {@code device}, and {@code swapchain} <b>must</b> have been created, allocated, or retrieved from the same {@code VkInstance}</li>
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
     * <li>{@link VK10#VK_ERROR_DEVICE_LOST ERROR_DEVICE_LOST}</li>
     * <li>{@link KHRSwapchain#VK_ERROR_OUT_OF_DATE_KHR ERROR_OUT_OF_DATE_KHR}</li>
     * </ul></dd>
     * </dl>
     *
     * @param device        the {@code VkDevice} associated with {@code swapchain}.
     * @param swapchain     the swapchain from which to query the counter value.
     * @param counter       a {@code VkSurfaceCounterFlagBitsEXT} value specifying the counter to query.
     * @param pCounterValue will return the current value of the counter.
     */
    @NativeType("VkResult")
    public static int vkGetSwapchainCounterEXT(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain, @NativeType("VkSurfaceCounterFlagBitsEXT") int counter, @NativeType("uint64_t *") LongBuffer pCounterValue) {
        if (CHECKS) {
            check(pCounterValue, 1);
        }
        return nvkGetSwapchainCounterEXT(device, swapchain, counter, memAddress(pCounterValue));
    }

    /** Array version of: {@link #vkRegisterDeviceEventEXT RegisterDeviceEventEXT} */
    @NativeType("VkResult")
    public static int vkRegisterDeviceEventEXT(VkDevice device, @NativeType("VkDeviceEventInfoEXT const *") VkDeviceEventInfoEXT pDeviceEventInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkFence *") long[] pFence) {
        long __functionAddress = device.getCapabilities().vkRegisterDeviceEventEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pFence, 1);
        }
        return callPPPPI(device.address(), pDeviceEventInfo.address(), memAddressSafe(pAllocator), pFence, __functionAddress);
    }

    /** Array version of: {@link #vkRegisterDisplayEventEXT RegisterDisplayEventEXT} */
    @NativeType("VkResult")
    public static int vkRegisterDisplayEventEXT(VkDevice device, @NativeType("VkDisplayKHR") long display, @NativeType("VkDisplayEventInfoEXT const *") VkDisplayEventInfoEXT pDisplayEventInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkFence *") long[] pFence) {
        long __functionAddress = device.getCapabilities().vkRegisterDisplayEventEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pFence, 1);
        }
        return callPJPPPI(device.address(), display, pDisplayEventInfo.address(), memAddressSafe(pAllocator), pFence, __functionAddress);
    }

    /** Array version of: {@link #vkGetSwapchainCounterEXT GetSwapchainCounterEXT} */
    @NativeType("VkResult")
    public static int vkGetSwapchainCounterEXT(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain, @NativeType("VkSurfaceCounterFlagBitsEXT") int counter, @NativeType("uint64_t *") long[] pCounterValue) {
        long __functionAddress = device.getCapabilities().vkGetSwapchainCounterEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pCounterValue, 1);
        }
        return callPJPI(device.address(), swapchain, counter, pCounterValue, __functionAddress);
    }

}
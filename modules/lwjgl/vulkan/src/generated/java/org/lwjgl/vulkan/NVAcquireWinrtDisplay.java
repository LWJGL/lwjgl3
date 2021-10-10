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
 * This extension allows an application to take exclusive control of a display on Windows 10 provided that the display is not already controlled by a compositor. Examples of compositors include the Windows desktop compositor, other applications using this Vulkan extension, and applications that <a target="_blank" href="https://docs.microsoft.com/en-us/uwp/api/windows.devices.display.core.displaymanager.tryacquiretarget">“{@code Acquire}”</a> a <a target="_blank" href="https://docs.microsoft.com/en-us/uwp/api/windows.devices.display.core.displaytarget">“{@code DisplayTarget}”</a> using a <a target="_blank" href="https://docs.microsoft.com/en-us/uwp/api/">“{@code WinRT}”</a> command such as <a target="_blank" href="https://docs.microsoft.com/en-us/uwp/api/windows.devices.display.core.displaymanager.tryacquiretarget">“{@code winrt::Windows::Devices::Display::Core::DisplayManager.TryAcquireTarget()}”</a>.
 * 
 * <p>When control is acquired the application has exclusive access to the display until control is released or the application terminates. An application’s attempt to acquire is denied if a different application has already acquired the display.</p>
 * 
 * <h5>VK_NV_acquire_winrt_display</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_NV_acquire_winrt_display}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>346</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link EXTDirectModeDisplay VK_EXT_direct_mode_display}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Jeff Juliano <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NV_acquire_winrt_display]%20@jjuliano%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NV_acquire_winrt_display%20extension%3E%3E">jjuliano</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2020-09-29</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Jeff Juliano, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public class NVAcquireWinrtDisplay {

    /** The extension specification version. */
    public static final int VK_NV_ACQUIRE_WINRT_DISPLAY_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_NV_ACQUIRE_WINRT_DISPLAY_EXTENSION_NAME = "VK_NV_acquire_winrt_display";

    protected NVAcquireWinrtDisplay() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkAcquireWinrtDisplayNV ] ---

    /**
     * Acquire access to a VkDisplayKHR.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To acquire permission to directly access a display in Vulkan on Windows 10, call:</p>
     * 
     * <pre><code>
     * VkResult vkAcquireWinrtDisplayNV(
     *     VkPhysicalDevice                            physicalDevice,
     *     VkDisplayKHR                                display);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>All permissions necessary to control the display are granted to the Vulkan instance associated with {@code physicalDevice} until the display is released or the application is terminated. Permission to access the display <b>may</b> be revoked by events that cause Windows 10 itself to lose access to {@code display}. If this has happened, operations which require access to the display <b>must</b> fail with an appropriate error code. If permission to access {@code display} has already been acquired by another entity, the call <b>must</b> return the error code {@link VK10#VK_ERROR_INITIALIZATION_FAILED ERROR_INITIALIZATION_FAILED}.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>The Vulkan instance acquires control of a <a target="_blank" href="https://docs.microsoft.com/en-us/uwp/api/windows.devices.display.core.displaytarget">“{@code winrt::Windows::Devices::Display::Core::DisplayTarget}”</a> by performing an operation equivalent to <a target="_blank" href="https://docs.microsoft.com/en-us/uwp/api/windows.devices.display.core.displaymanager.tryacquiretarget">“{@code winrt::Windows::Devices::Display::Core::DisplayManager.TryAcquireTarget()}”</a> on the “{@code DisplayTarget}”.</p>
     * </div>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>One example of when Windows 10 loses access to a display is when the display is hot-unplugged.</p>
     * </div>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>One example of when a display has already been acquired by another entity is when the Windows desktop compositor (DWM) is in control of the display. Beginning with Windows 10 version 2004 it is possible to cause DWM to release a display by using the “{@code Advanced display settings}” sub-page of the “{@code Display settings}” control panel. {@link #vkAcquireWinrtDisplayNV AcquireWinrtDisplayNV} does not itself cause DWM to release a display; this action must be performed outside of Vulkan.</p>
     * </div>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
     * <li>{@code display} <b>must</b> be a valid {@code VkDisplayKHR} handle</li>
     * <li>{@code display} <b>must</b> have been created, allocated, or retrieved from {@code physicalDevice}</li>
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
     * <li>{@link VK10#VK_ERROR_INITIALIZATION_FAILED ERROR_INITIALIZATION_FAILED}</li>
     * </ul></dd>
     * </dl>
     *
     * @param physicalDevice The physical device the display is on.
     * @param display        The display the caller wishes to control in Vulkan.
     */
    @NativeType("VkResult")
    public static int vkAcquireWinrtDisplayNV(VkPhysicalDevice physicalDevice, @NativeType("VkDisplayKHR") long display) {
        long __functionAddress = physicalDevice.getCapabilities().vkAcquireWinrtDisplayNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJI(physicalDevice.address(), display, __functionAddress);
    }

    // --- [ vkGetWinrtDisplayNV ] ---

    /** Unsafe version of: {@link #vkGetWinrtDisplayNV GetWinrtDisplayNV} */
    public static int nvkGetWinrtDisplayNV(VkPhysicalDevice physicalDevice, int deviceRelativeId, long pDisplay) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetWinrtDisplayNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(physicalDevice.address(), deviceRelativeId, pDisplay, __functionAddress);
    }

    /**
     * Query the VkDisplayKHR corresponding to a WinRT DisplayTarget.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>When acquiring displays on Windows 10, an application may also wish to enumerate and identify them using a native handle rather than a {@code VkDisplayKHR} handle.</p>
     * 
     * <p>To determine the {@code VkDisplayKHR} handle corresponding to a <a target="_blank" href="https://docs.microsoft.com/en-us/uwp/api/windows.devices.display.core.displaytarget">“{@code winrt::Windows::Devices::Display::Core::DisplayTarget}”</a>, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetWinrtDisplayNV(
     *     VkPhysicalDevice                            physicalDevice,
     *     uint32_t                                    deviceRelativeId,
     *     VkDisplayKHR*                               pDisplay);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>If there is no {@code VkDisplayKHR} corresponding to {@code deviceRelativeId} on {@code physicalDevice}, {@link VK10#VK_NULL_HANDLE NULL_HANDLE} <b>must</b> be returned in {@code pDisplay}.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
     * <li>{@code pDisplay} <b>must</b> be a valid pointer to a {@code VkDisplayKHR} handle</li>
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
     * <li>{@link VK10#VK_ERROR_INITIALIZATION_FAILED ERROR_INITIALIZATION_FAILED}</li>
     * </ul></dd>
     * </dl>
     *
     * @param physicalDevice   The physical device on which to query the display handle.
     * @param deviceRelativeId The value of the <a target="_blank" href="https://docs.microsoft.com/en-us/uwp/api/windows.devices.display.core.displaytarget.adapterrelativeid">“AdapterRelativeId”</a> property of a <a target="_blank" href="https://docs.microsoft.com/en-us/uwp/api/windows.devices.display.core.displaytarget">“DisplayTarget”</a> that is enumerated by a <a target="_blank" href="https://docs.microsoft.com/en-us/uwp/api/windows.devices.display.core.displayadapter">“DisplayAdapter”</a> with an <a target="_blank" href="https://docs.microsoft.com/en-us/uwp/api/windows.devices.display.core.displayadapter.id">“Id”</a> property matching the {@code deviceLUID} property of a {@link VkPhysicalDeviceIDProperties} for {@code physicalDevice}.
     * @param pDisplay         The corresponding {@code VkDisplayKHR} handle will be returned here.
     */
    @NativeType("VkResult")
    public static int vkGetWinrtDisplayNV(VkPhysicalDevice physicalDevice, @NativeType("uint32_t") int deviceRelativeId, @NativeType("VkDisplayKHR *") LongBuffer pDisplay) {
        if (CHECKS) {
            check(pDisplay, 1);
        }
        return nvkGetWinrtDisplayNV(physicalDevice, deviceRelativeId, memAddress(pDisplay));
    }

    /** Array version of: {@link #vkGetWinrtDisplayNV GetWinrtDisplayNV} */
    @NativeType("VkResult")
    public static int vkGetWinrtDisplayNV(VkPhysicalDevice physicalDevice, @NativeType("uint32_t") int deviceRelativeId, @NativeType("VkDisplayKHR *") long[] pDisplay) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetWinrtDisplayNV;
        if (CHECKS) {
            check(__functionAddress);
            check(pDisplay, 1);
        }
        return callPPI(physicalDevice.address(), deviceRelativeId, pDisplay, __functionAddress);
    }

}
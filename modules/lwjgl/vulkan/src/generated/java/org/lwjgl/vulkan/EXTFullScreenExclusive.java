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
 * This extension allows applications to set the policy for swapchain creation and presentation mechanisms relating to full-screen access. Implementations may be able to acquire exclusive access to a particular display for an application window that covers the whole screen. This can increase performance on some systems by bypassing composition, however it can also result in disruptive or expensive transitions in the underlying windowing system when a change occurs.
 * 
 * <p>Applications can choose between explicitly disallowing or allowing this behavior, letting the implementation decide, or managing this mode of operation directly using the new {@link #vkAcquireFullScreenExclusiveModeEXT AcquireFullScreenExclusiveModeEXT} and {@link #vkReleaseFullScreenExclusiveModeEXT ReleaseFullScreenExclusiveModeEXT} commands.</p>
 * 
 * <h5>VK_EXT_full_screen_exclusive</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_full_screen_exclusive}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>256</dd>
 * <dt><b>Revision</b></dt>
 * <dd>4</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
 * <li>Requires {@link KHRSurface VK_KHR_surface}</li>
 * <li>Requires {@link KHRGetSurfaceCapabilities2 VK_KHR_get_surface_capabilities2}</li>
 * <li>Requires {@link KHRSwapchain VK_KHR_swapchain}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>James Jones <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_full_screen_exclusive]%20@cubanismo%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_full_screen_exclusive%20extension%3E%3E">cubanismo</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2019-03-12</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>Interacts with Vulkan 1.1</li>
 * <li>Interacts with {@link KHRDeviceGroup VK_KHR_device_group}</li>
 * <li>Interacts with {@link KHRWin32Surface VK_KHR_win32_surface}</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Hans-Kristian Arntzen, ARM</li>
 * <li>Slawomir Grajewski, Intel</li>
 * <li>Tobias Hector, AMD</li>
 * <li>James Jones, NVIDIA</li>
 * <li>Daniel Rakos, AMD</li>
 * <li>Jeff Juliano, NVIDIA</li>
 * <li>Joshua Schnarr, NVIDIA</li>
 * <li>Aaron Hagan, AMD</li>
 * </ul></dd>
 * </dl>
 */
public class EXTFullScreenExclusive {

    /** The extension specification version. */
    public static final int VK_EXT_FULL_SCREEN_EXCLUSIVE_SPEC_VERSION = 4;

    /** The extension name. */
    public static final String VK_EXT_FULL_SCREEN_EXCLUSIVE_EXTENSION_NAME = "VK_EXT_full_screen_exclusive";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_SURFACE_FULL_SCREEN_EXCLUSIVE_INFO_EXT STRUCTURE_TYPE_SURFACE_FULL_SCREEN_EXCLUSIVE_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_FULL_SCREEN_EXCLUSIVE_EXT STRUCTURE_TYPE_SURFACE_CAPABILITIES_FULL_SCREEN_EXCLUSIVE_EXT}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_SURFACE_FULL_SCREEN_EXCLUSIVE_INFO_EXT         = 1000255000,
        VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_FULL_SCREEN_EXCLUSIVE_EXT = 1000255002;

    /** Extends {@code VkResult}. */
    public static final int VK_ERROR_FULL_SCREEN_EXCLUSIVE_MODE_LOST_EXT = -1000255000;

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_SURFACE_FULL_SCREEN_EXCLUSIVE_WIN32_INFO_EXT = 1000255001;

    /**
     * VkFullScreenExclusiveEXT - Hint values an application can specify affecting full-screen transition behavior
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_FULL_SCREEN_EXCLUSIVE_DEFAULT_EXT FULL_SCREEN_EXCLUSIVE_DEFAULT_EXT} indicates the implementation <b>should</b> determine the appropriate full-screen method by whatever means it deems appropriate.</li>
     * <li>{@link #VK_FULL_SCREEN_EXCLUSIVE_ALLOWED_EXT FULL_SCREEN_EXCLUSIVE_ALLOWED_EXT} indicates the implementation <b>may</b> use full-screen exclusive mechanisms when available. Such mechanisms <b>may</b> result in better performance and/or the availability of different presentation capabilities, but <b>may</b> require a more disruptive transition during swapchain initialization, first presentation and/or destruction.</li>
     * <li>{@link #VK_FULL_SCREEN_EXCLUSIVE_DISALLOWED_EXT FULL_SCREEN_EXCLUSIVE_DISALLOWED_EXT} indicates the implementation <b>should</b> avoid using full-screen mechanisms which rely on disruptive transitions.</li>
     * <li>{@link #VK_FULL_SCREEN_EXCLUSIVE_APPLICATION_CONTROLLED_EXT FULL_SCREEN_EXCLUSIVE_APPLICATION_CONTROLLED_EXT} indicates the application will manage full-screen exclusive mode by using the {@link #vkAcquireFullScreenExclusiveModeEXT AcquireFullScreenExclusiveModeEXT} and {@link #vkReleaseFullScreenExclusiveModeEXT ReleaseFullScreenExclusiveModeEXT} commands.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkSurfaceFullScreenExclusiveInfoEXT}</p>
     */
    public static final int
        VK_FULL_SCREEN_EXCLUSIVE_DEFAULT_EXT                = 0,
        VK_FULL_SCREEN_EXCLUSIVE_ALLOWED_EXT                = 1,
        VK_FULL_SCREEN_EXCLUSIVE_DISALLOWED_EXT             = 2,
        VK_FULL_SCREEN_EXCLUSIVE_APPLICATION_CONTROLLED_EXT = 3;

    protected EXTFullScreenExclusive() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetPhysicalDeviceSurfacePresentModes2EXT ] ---

    /**
     * Unsafe version of: {@link #vkGetPhysicalDeviceSurfacePresentModes2EXT GetPhysicalDeviceSurfacePresentModes2EXT}
     *
     * @param pPresentModeCount a pointer to an integer related to the number of presentation modes available or queried, as described below.
     */
    public static int nvkGetPhysicalDeviceSurfacePresentModes2EXT(VkPhysicalDevice physicalDevice, long pSurfaceInfo, long pPresentModeCount, long pPresentModes) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSurfacePresentModes2EXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(physicalDevice.address(), pSurfaceInfo, pPresentModeCount, pPresentModes, __functionAddress);
    }

    /**
     * Query supported presentation modes.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Alternatively, to query the supported presentation modes for a surface combined with select other fixed swapchain creation parameters, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetPhysicalDeviceSurfacePresentModes2EXT(
     *     VkPhysicalDevice                            physicalDevice,
     *     const VkPhysicalDeviceSurfaceInfo2KHR*      pSurfaceInfo,
     *     uint32_t*                                   pPresentModeCount,
     *     VkPresentModeKHR*                           pPresentModes);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@code vkGetPhysicalDeviceSurfacePresentModes2EXT} behaves similarly to {@link KHRSurface#vkGetPhysicalDeviceSurfacePresentModesKHR GetPhysicalDeviceSurfacePresentModesKHR}, with the ability to specify extended inputs via chained input structures.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>If the {@link GOOGLESurfacelessQuery VK_GOOGLE_surfaceless_query} extension is not enabled, {@code pSurfaceInfo→surface} <b>must</b> be a valid {@code VkSurfaceKHR} handle</li>
     * <li>If {@code pSurfaceInfo→surface} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, it <b>must</b> be supported by {@code physicalDevice}, as reported by {@link KHRSurface#vkGetPhysicalDeviceSurfaceSupportKHR GetPhysicalDeviceSurfaceSupportKHR} or an equivalent platform-specific mechanism</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
     * <li>{@code pSurfaceInfo} <b>must</b> be a valid pointer to a valid {@link VkPhysicalDeviceSurfaceInfo2KHR} structure</li>
     * <li>{@code pPresentModeCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
     * <li>If the value referenced by {@code pPresentModeCount} is not 0, and {@code pPresentModes} is not {@code NULL}, {@code pPresentModes} <b>must</b> be a valid pointer to an array of {@code pPresentModeCount} {@code VkPresentModeKHR} values</li>
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
     * <li>{@link KHRSurface#VK_ERROR_SURFACE_LOST_KHR ERROR_SURFACE_LOST_KHR}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkPhysicalDeviceSurfaceInfo2KHR}</p>
     *
     * @param physicalDevice    the physical device that will be associated with the swapchain to be created, as described for {@link KHRSwapchain#vkCreateSwapchainKHR CreateSwapchainKHR}.
     * @param pSurfaceInfo      a pointer to a {@link VkPhysicalDeviceSurfaceInfo2KHR} structure describing the surface and other fixed parameters that would be consumed by {@link KHRSwapchain#vkCreateSwapchainKHR CreateSwapchainKHR}.
     * @param pPresentModeCount a pointer to an integer related to the number of presentation modes available or queried, as described below.
     * @param pPresentModes     either {@code NULL} or a pointer to an array of {@code VkPresentModeKHR} values, indicating the supported presentation modes.
     */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceSurfacePresentModes2EXT(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceSurfaceInfo2KHR const *") VkPhysicalDeviceSurfaceInfo2KHR pSurfaceInfo, @NativeType("uint32_t *") IntBuffer pPresentModeCount, @Nullable @NativeType("VkPresentModeKHR *") IntBuffer pPresentModes) {
        if (CHECKS) {
            check(pPresentModeCount, 1);
            checkSafe(pPresentModes, pPresentModeCount.get(pPresentModeCount.position()));
        }
        return nvkGetPhysicalDeviceSurfacePresentModes2EXT(physicalDevice, pSurfaceInfo.address(), memAddress(pPresentModeCount), memAddressSafe(pPresentModes));
    }

    // --- [ vkAcquireFullScreenExclusiveModeEXT ] ---

    /**
     * Acquire full-screen exclusive mode for a swapchain.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To acquire exclusive full-screen access for a swapchain, call:</p>
     * 
     * <pre><code>
     * VkResult vkAcquireFullScreenExclusiveModeEXT(
     *     VkDevice                                    device,
     *     VkSwapchainKHR                              swapchain);</code></pre>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code swapchain} <b>must</b> not be in the retired state</li>
     * <li>{@code swapchain} <b>must</b> be a swapchain created with a {@link VkSurfaceFullScreenExclusiveInfoEXT} structure, with {@code fullScreenExclusive} set to {@link #VK_FULL_SCREEN_EXCLUSIVE_APPLICATION_CONTROLLED_EXT FULL_SCREEN_EXCLUSIVE_APPLICATION_CONTROLLED_EXT}</li>
     * <li>{@code swapchain} <b>must</b> not currently have exclusive full-screen access</li>
     * </ul>
     * 
     * <p>A return value of {@link VK10#VK_SUCCESS SUCCESS} indicates that the {@code swapchain} successfully acquired exclusive full-screen access. The swapchain will retain this exclusivity until either the application releases exclusive full-screen access with {@link #vkReleaseFullScreenExclusiveModeEXT ReleaseFullScreenExclusiveModeEXT}, destroys the swapchain, or if any of the swapchain commands return {@link #VK_ERROR_FULL_SCREEN_EXCLUSIVE_MODE_LOST_EXT ERROR_FULL_SCREEN_EXCLUSIVE_MODE_LOST_EXT} indicating that the mode was lost because of platform-specific changes.</p>
     * 
     * <p>If the swapchain was unable to acquire exclusive full-screen access to the display then {@link VK10#VK_ERROR_INITIALIZATION_FAILED ERROR_INITIALIZATION_FAILED} is returned. An application <b>can</b> attempt to acquire exclusive full-screen access again for the same swapchain even if this command fails, or if {@link #VK_ERROR_FULL_SCREEN_EXCLUSIVE_MODE_LOST_EXT ERROR_FULL_SCREEN_EXCLUSIVE_MODE_LOST_EXT} has been returned by a swapchain command.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code swapchain} <b>must</b> be a valid {@code VkSwapchainKHR} handle</li>
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
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_INITIALIZATION_FAILED ERROR_INITIALIZATION_FAILED}</li>
     * <li>{@link KHRSurface#VK_ERROR_SURFACE_LOST_KHR ERROR_SURFACE_LOST_KHR}</li>
     * </ul></dd>
     * </dl>
     *
     * @param device    the device associated with {@code swapchain}.
     * @param swapchain the swapchain to acquire exclusive full-screen access for.
     */
    @NativeType("VkResult")
    public static int vkAcquireFullScreenExclusiveModeEXT(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain) {
        long __functionAddress = device.getCapabilities().vkAcquireFullScreenExclusiveModeEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJI(device.address(), swapchain, __functionAddress);
    }

    // --- [ vkReleaseFullScreenExclusiveModeEXT ] ---

    /**
     * Release full-screen exclusive mode from a swapchain.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To release exclusive full-screen access from a swapchain, call:</p>
     * 
     * <pre><code>
     * VkResult vkReleaseFullScreenExclusiveModeEXT(
     *     VkDevice                                    device,
     *     VkSwapchainKHR                              swapchain);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Applications will not be able to present to {@code swapchain} after this call until exclusive full-screen access is reacquired. This is usually useful to handle when an application is minimised or otherwise intends to stop presenting for a time.</p>
     * </div>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code swapchain} <b>must</b> not be in the retired state</li>
     * <li>{@code swapchain} <b>must</b> be a swapchain created with a {@link VkSurfaceFullScreenExclusiveInfoEXT} structure, with {@code fullScreenExclusive} set to {@link #VK_FULL_SCREEN_EXCLUSIVE_APPLICATION_CONTROLLED_EXT FULL_SCREEN_EXCLUSIVE_APPLICATION_CONTROLLED_EXT}</li>
     * </ul>
     *
     * @param device    the device associated with {@code swapchain}.
     * @param swapchain the swapchain to release exclusive full-screen access from.
     */
    @NativeType("VkResult")
    public static int vkReleaseFullScreenExclusiveModeEXT(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain) {
        long __functionAddress = device.getCapabilities().vkReleaseFullScreenExclusiveModeEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJI(device.address(), swapchain, __functionAddress);
    }

    // --- [ vkGetDeviceGroupSurfacePresentModes2EXT ] ---

    /** Unsafe version of: {@link #vkGetDeviceGroupSurfacePresentModes2EXT GetDeviceGroupSurfacePresentModes2EXT} */
    public static int nvkGetDeviceGroupSurfacePresentModes2EXT(VkDevice device, long pSurfaceInfo, long pModes) {
        long __functionAddress = device.getCapabilities().vkGetDeviceGroupSurfacePresentModes2EXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(device.address(), pSurfaceInfo, pModes, __functionAddress);
    }

    /**
     * Query device group present capabilities for a surface.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Alternatively, to query the supported device group presentation modes for a surface combined with select other fixed swapchain creation parameters, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetDeviceGroupSurfacePresentModes2EXT(
     *     VkDevice                                    device,
     *     const VkPhysicalDeviceSurfaceInfo2KHR*      pSurfaceInfo,
     *     VkDeviceGroupPresentModeFlagsKHR*           pModes);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@code vkGetDeviceGroupSurfacePresentModes2EXT} behaves similarly to {@link KHRSwapchain#vkGetDeviceGroupSurfacePresentModesKHR GetDeviceGroupSurfacePresentModesKHR}, with the ability to specify extended inputs via chained input structures.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code pSurfaceInfo→surface} <b>must</b> be supported by all physical devices associated with {@code device}, as reported by {@link KHRSurface#vkGetPhysicalDeviceSurfaceSupportKHR GetPhysicalDeviceSurfaceSupportKHR} or an equivalent platform-specific mechanism</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pSurfaceInfo} <b>must</b> be a valid pointer to a valid {@link VkPhysicalDeviceSurfaceInfo2KHR} structure</li>
     * <li>{@code pModes} <b>must</b> be a valid pointer to a {@code VkDeviceGroupPresentModeFlagsKHR} value</li>
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
     * <li>{@link KHRSurface#VK_ERROR_SURFACE_LOST_KHR ERROR_SURFACE_LOST_KHR}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkPhysicalDeviceSurfaceInfo2KHR}</p>
     *
     * @param device       the logical device.
     * @param pSurfaceInfo a pointer to a {@link VkPhysicalDeviceSurfaceInfo2KHR} structure describing the surface and other fixed parameters that would be consumed by {@link KHRSwapchain#vkCreateSwapchainKHR CreateSwapchainKHR}.
     * @param pModes       a pointer to a {@code VkDeviceGroupPresentModeFlagsKHR} in which the supported device group present modes for the surface are returned.
     */
    @NativeType("VkResult")
    public static int vkGetDeviceGroupSurfacePresentModes2EXT(VkDevice device, @NativeType("VkPhysicalDeviceSurfaceInfo2KHR const *") VkPhysicalDeviceSurfaceInfo2KHR pSurfaceInfo, @NativeType("VkDeviceGroupPresentModeFlagsKHR *") IntBuffer pModes) {
        if (CHECKS) {
            check(pModes, 1);
        }
        return nvkGetDeviceGroupSurfacePresentModes2EXT(device, pSurfaceInfo.address(), memAddress(pModes));
    }

    /** Array version of: {@link #vkGetPhysicalDeviceSurfacePresentModes2EXT GetPhysicalDeviceSurfacePresentModes2EXT} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceSurfacePresentModes2EXT(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceSurfaceInfo2KHR const *") VkPhysicalDeviceSurfaceInfo2KHR pSurfaceInfo, @NativeType("uint32_t *") int[] pPresentModeCount, @Nullable @NativeType("VkPresentModeKHR *") int[] pPresentModes) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSurfacePresentModes2EXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pPresentModeCount, 1);
            checkSafe(pPresentModes, pPresentModeCount[0]);
        }
        return callPPPPI(physicalDevice.address(), pSurfaceInfo.address(), pPresentModeCount, pPresentModes, __functionAddress);
    }

    /** Array version of: {@link #vkGetDeviceGroupSurfacePresentModes2EXT GetDeviceGroupSurfacePresentModes2EXT} */
    @NativeType("VkResult")
    public static int vkGetDeviceGroupSurfacePresentModes2EXT(VkDevice device, @NativeType("VkPhysicalDeviceSurfaceInfo2KHR const *") VkPhysicalDeviceSurfaceInfo2KHR pSurfaceInfo, @NativeType("VkDeviceGroupPresentModeFlagsKHR *") int[] pModes) {
        long __functionAddress = device.getCapabilities().vkGetDeviceGroupSurfacePresentModes2EXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pModes, 1);
        }
        return callPPPI(device.address(), pSurfaceInfo.address(), pModes, __functionAddress);
    }

}
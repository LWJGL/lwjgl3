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
 * This extension provides new entry points to query device surface capabilities in a way that can be easily extended by other extensions, without introducing any further entry points. This extension can be considered the {@link KHRSurface VK_KHR_surface} equivalent of the {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2} extension.
 * 
 * <h5>VK_KHR_get_surface_capabilities2</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_get_surface_capabilities2}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Instance extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>120</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRSurface VK_KHR_surface}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>James Jones <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_get_surface_capabilities2]%20@cubanismo%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_get_surface_capabilities2%20extension%3E%3E">cubanismo</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2017-02-27</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Ian Elliott, Google</li>
 * <li>James Jones, NVIDIA</li>
 * <li>Alon Or-bach, Samsung</li>
 * </ul></dd>
 * </dl>
 */
public class KHRGetSurfaceCapabilities2 {

    /** The extension specification version. */
    public static final int VK_KHR_GET_SURFACE_CAPABILITIES_2_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_GET_SURFACE_CAPABILITIES_2_EXTENSION_NAME = "VK_KHR_get_surface_capabilities2";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SURFACE_INFO_2_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_SURFACE_INFO_2_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_2_KHR STRUCTURE_TYPE_SURFACE_CAPABILITIES_2_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SURFACE_FORMAT_2_KHR STRUCTURE_TYPE_SURFACE_FORMAT_2_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SURFACE_INFO_2_KHR = 1000119000,
        VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_2_KHR         = 1000119001,
        VK_STRUCTURE_TYPE_SURFACE_FORMAT_2_KHR               = 1000119002;

    protected KHRGetSurfaceCapabilities2() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetPhysicalDeviceSurfaceCapabilities2KHR ] ---

    /** Unsafe version of: {@link #vkGetPhysicalDeviceSurfaceCapabilities2KHR GetPhysicalDeviceSurfaceCapabilities2KHR} */
    public static int nvkGetPhysicalDeviceSurfaceCapabilities2KHR(VkPhysicalDevice physicalDevice, long pSurfaceInfo, long pSurfaceCapabilities) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSurfaceCapabilities2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(physicalDevice.address(), pSurfaceInfo, pSurfaceCapabilities, __functionAddress);
    }

    /**
     * Reports capabilities of a surface on a physical device.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To query the basic capabilities of a surface defined by the core or extensions, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetPhysicalDeviceSurfaceCapabilities2KHR(
     *     VkPhysicalDevice                            physicalDevice,
     *     const VkPhysicalDeviceSurfaceInfo2KHR*      pSurfaceInfo,
     *     VkSurfaceCapabilities2KHR*                  pSurfaceCapabilities);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@code vkGetPhysicalDeviceSurfaceCapabilities2KHR} behaves similarly to {@link KHRSurface#vkGetPhysicalDeviceSurfaceCapabilitiesKHR GetPhysicalDeviceSurfaceCapabilitiesKHR}, with the ability to specify extended inputs via chained input structures, and to return extended information via chained output structures.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code pSurfaceInfo→surface} <b>must</b> be a valid {@code VkSurfaceKHR} handle</li>
     * <li>{@code pSurfaceInfo→surface} <b>must</b> be supported by {@code physicalDevice}, as reported by {@link KHRSurface#vkGetPhysicalDeviceSurfaceSupportKHR GetPhysicalDeviceSurfaceSupportKHR} or an equivalent platform-specific mechanism</li>
     * </ul>
     * 
     * <ul>
     * <li>If a {@link VkSurfaceCapabilitiesFullScreenExclusiveEXT} structure is included in the {@code pNext} chain of {@code pSurfaceCapabilities}, a {@link VkSurfaceFullScreenExclusiveWin32InfoEXT} structure <b>must</b> be included in the {@code pNext} chain of {@code pSurfaceInfo}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
     * <li>{@code pSurfaceInfo} <b>must</b> be a valid pointer to a valid {@link VkPhysicalDeviceSurfaceInfo2KHR} structure</li>
     * <li>{@code pSurfaceCapabilities} <b>must</b> be a valid pointer to a {@link VkSurfaceCapabilities2KHR} structure</li>
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
     * <p>{@link VkPhysicalDeviceSurfaceInfo2KHR}, {@link VkSurfaceCapabilities2KHR}</p>
     *
     * @param physicalDevice       the physical device that will be associated with the swapchain to be created, as described for {@link KHRSwapchain#vkCreateSwapchainKHR CreateSwapchainKHR}.
     * @param pSurfaceInfo         a pointer to a {@link VkPhysicalDeviceSurfaceInfo2KHR} structure describing the surface and other fixed parameters that would be consumed by {@link KHRSwapchain#vkCreateSwapchainKHR CreateSwapchainKHR}.
     * @param pSurfaceCapabilities a pointer to a {@link VkSurfaceCapabilities2KHR} structure in which the capabilities are returned.
     */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceSurfaceCapabilities2KHR(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceSurfaceInfo2KHR const *") VkPhysicalDeviceSurfaceInfo2KHR pSurfaceInfo, @NativeType("VkSurfaceCapabilities2KHR *") VkSurfaceCapabilities2KHR pSurfaceCapabilities) {
        return nvkGetPhysicalDeviceSurfaceCapabilities2KHR(physicalDevice, pSurfaceInfo.address(), pSurfaceCapabilities.address());
    }

    // --- [ vkGetPhysicalDeviceSurfaceFormats2KHR ] ---

    /**
     * Unsafe version of: {@link #vkGetPhysicalDeviceSurfaceFormats2KHR GetPhysicalDeviceSurfaceFormats2KHR}
     *
     * @param pSurfaceFormatCount a pointer to an integer related to the number of format tuples available or queried, as described below.
     */
    public static int nvkGetPhysicalDeviceSurfaceFormats2KHR(VkPhysicalDevice physicalDevice, long pSurfaceInfo, long pSurfaceFormatCount, long pSurfaceFormats) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSurfaceFormats2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(physicalDevice.address(), pSurfaceInfo, pSurfaceFormatCount, pSurfaceFormats, __functionAddress);
    }

    /**
     * Query color formats supported by surface.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To query the supported swapchain format tuples for a surface, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetPhysicalDeviceSurfaceFormats2KHR(
     *     VkPhysicalDevice                            physicalDevice,
     *     const VkPhysicalDeviceSurfaceInfo2KHR*      pSurfaceInfo,
     *     uint32_t*                                   pSurfaceFormatCount,
     *     VkSurfaceFormat2KHR*                        pSurfaceFormats);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@link #vkGetPhysicalDeviceSurfaceFormats2KHR GetPhysicalDeviceSurfaceFormats2KHR} behaves similarly to {@link KHRSurface#vkGetPhysicalDeviceSurfaceFormatsKHR GetPhysicalDeviceSurfaceFormatsKHR}, with the ability to be extended via {@code pNext} chains.</p>
     * 
     * <p>If {@code pSurfaceFormats} is {@code NULL}, then the number of format tuples supported for the given {@code surface} is returned in {@code pSurfaceFormatCount}. Otherwise, {@code pSurfaceFormatCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pSurfaceFormats} array, and on return the variable is overwritten with the number of structures actually written to {@code pSurfaceFormats}. If the value of {@code pSurfaceFormatCount} is less than the number of format tuples supported, at most {@code pSurfaceFormatCount} structures will be written, and {@link VK10#VK_INCOMPLETE INCOMPLETE} will be returned instead of {@link VK10#VK_SUCCESS SUCCESS}, to indicate that not all the available values were returned.</p>
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
     * <li>{@code pSurfaceFormatCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
     * <li>If the value referenced by {@code pSurfaceFormatCount} is not 0, and {@code pSurfaceFormats} is not {@code NULL}, {@code pSurfaceFormats} <b>must</b> be a valid pointer to an array of {@code pSurfaceFormatCount} {@link VkSurfaceFormat2KHR} structures</li>
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
     * <p>{@link VkPhysicalDeviceSurfaceInfo2KHR}, {@link VkSurfaceFormat2KHR}</p>
     *
     * @param physicalDevice      the physical device that will be associated with the swapchain to be created, as described for {@link KHRSwapchain#vkCreateSwapchainKHR CreateSwapchainKHR}.
     * @param pSurfaceInfo        a pointer to a {@link VkPhysicalDeviceSurfaceInfo2KHR} structure describing the surface and other fixed parameters that would be consumed by {@link KHRSwapchain#vkCreateSwapchainKHR CreateSwapchainKHR}.
     * @param pSurfaceFormatCount a pointer to an integer related to the number of format tuples available or queried, as described below.
     * @param pSurfaceFormats     either {@code NULL} or a pointer to an array of {@link VkSurfaceFormat2KHR} structures.
     */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceSurfaceFormats2KHR(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceSurfaceInfo2KHR const *") VkPhysicalDeviceSurfaceInfo2KHR pSurfaceInfo, @NativeType("uint32_t *") IntBuffer pSurfaceFormatCount, @Nullable @NativeType("VkSurfaceFormat2KHR *") VkSurfaceFormat2KHR.Buffer pSurfaceFormats) {
        if (CHECKS) {
            check(pSurfaceFormatCount, 1);
            checkSafe(pSurfaceFormats, pSurfaceFormatCount.get(pSurfaceFormatCount.position()));
        }
        return nvkGetPhysicalDeviceSurfaceFormats2KHR(physicalDevice, pSurfaceInfo.address(), memAddress(pSurfaceFormatCount), memAddressSafe(pSurfaceFormats));
    }

    /** Array version of: {@link #vkGetPhysicalDeviceSurfaceFormats2KHR GetPhysicalDeviceSurfaceFormats2KHR} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceSurfaceFormats2KHR(VkPhysicalDevice physicalDevice, @NativeType("VkPhysicalDeviceSurfaceInfo2KHR const *") VkPhysicalDeviceSurfaceInfo2KHR pSurfaceInfo, @NativeType("uint32_t *") int[] pSurfaceFormatCount, @Nullable @NativeType("VkSurfaceFormat2KHR *") VkSurfaceFormat2KHR.Buffer pSurfaceFormats) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceSurfaceFormats2KHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pSurfaceFormatCount, 1);
            checkSafe(pSurfaceFormats, pSurfaceFormatCount[0]);
        }
        return callPPPPI(physicalDevice.address(), pSurfaceInfo.address(), pSurfaceFormatCount, memAddressSafe(pSurfaceFormats), __functionAddress);
    }

}
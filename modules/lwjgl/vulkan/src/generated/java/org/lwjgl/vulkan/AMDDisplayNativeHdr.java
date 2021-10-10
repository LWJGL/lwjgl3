/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * This extension introduces the following display native HDR features to Vulkan:
 * 
 * <ul>
 * <li>A new {@code VkColorSpaceKHR} enum for setting the native display colorspace. For example, this color space would be set by the swapchain to use the native color space in Freesync2 displays.</li>
 * <li>Local dimming control</li>
 * </ul>
 * 
 * <h5>Examples</h5>
 * 
 * <p>None.</p>
 * 
 * <h5>VK_AMD_display_native_hdr</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_AMD_display_native_hdr}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>214</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
 * <li>Requires {@link KHRGetSurfaceCapabilities2 VK_KHR_get_surface_capabilities2}</li>
 * <li>Requires {@link KHRSwapchain VK_KHR_swapchain}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Matthaeus G. Chajdas <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_AMD_display_native_hdr]%20@anteru%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_AMD_display_native_hdr%20extension%3E%3E">anteru</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2018-12-18</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Matthaeus G. Chajdas, AMD</li>
 * <li>Aaron Hagan, AMD</li>
 * <li>Aric Cyr, AMD</li>
 * <li>Timothy Lottes, AMD</li>
 * <li>Derrick Owens, AMD</li>
 * <li>Daniel Rakos, AMD</li>
 * </ul></dd>
 * </dl>
 */
public class AMDDisplayNativeHdr {

    /** The extension specification version. */
    public static final int VK_AMD_DISPLAY_NATIVE_HDR_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_AMD_DISPLAY_NATIVE_HDR_EXTENSION_NAME = "VK_AMD_display_native_hdr";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_DISPLAY_NATIVE_HDR_SURFACE_CAPABILITIES_AMD STRUCTURE_TYPE_DISPLAY_NATIVE_HDR_SURFACE_CAPABILITIES_AMD}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SWAPCHAIN_DISPLAY_NATIVE_HDR_CREATE_INFO_AMD STRUCTURE_TYPE_SWAPCHAIN_DISPLAY_NATIVE_HDR_CREATE_INFO_AMD}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_DISPLAY_NATIVE_HDR_SURFACE_CAPABILITIES_AMD  = 1000213000,
        VK_STRUCTURE_TYPE_SWAPCHAIN_DISPLAY_NATIVE_HDR_CREATE_INFO_AMD = 1000213001;

    /** Extends {@code VkColorSpaceKHR}. */
    public static final int VK_COLOR_SPACE_DISPLAY_NATIVE_AMD = 1000213000;

    protected AMDDisplayNativeHdr() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkSetLocalDimmingAMD ] ---

    /**
     * Set Local Dimming.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>The local dimming HDR setting may also be changed over the life of a swapchain by calling:</p>
     * 
     * <pre><code>
     * void vkSetLocalDimmingAMD(
     *     VkDevice                                    device,
     *     VkSwapchainKHR                              swapChain,
     *     VkBool32                                    localDimmingEnable);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code swapChain} <b>must</b> be a valid {@code VkSwapchainKHR} handle</li>
     * <li>Both of {@code device}, and {@code swapChain} <b>must</b> have been created, allocated, or retrieved from the same {@code VkInstance}</li>
     * </ul>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@link VkDisplayNativeHdrSurfaceCapabilitiesAMD}{@code ::localDimmingSupport} <b>must</b> be supported</li>
     * </ul>
     *
     * @param device             the device associated with {@code swapChain}.
     * @param swapChain          handle to enable local dimming.
     * @param localDimmingEnable specifies whether local dimming is enabled for the swapchain.
     */
    public static void vkSetLocalDimmingAMD(VkDevice device, @NativeType("VkSwapchainKHR") long swapChain, @NativeType("VkBool32") boolean localDimmingEnable) {
        long __functionAddress = device.getCapabilities().vkSetLocalDimmingAMD;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJV(device.address(), swapChain, localDimmingEnable ? 1 : 0, __functionAddress);
    }

}
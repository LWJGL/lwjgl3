/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension extends {@link VkSurfaceCapabilities2KHR}, providing applications a way to query whether swapchains <b>can</b> be created with the {@link KHRSwapchain#VK_SWAPCHAIN_CREATE_PROTECTED_BIT_KHR SWAPCHAIN_CREATE_PROTECTED_BIT_KHR} flag set.
 * 
 * <p>Vulkan 1.1 added (optional) support for protect memory and protected resources including buffers ({@link VK11#VK_BUFFER_CREATE_PROTECTED_BIT BUFFER_CREATE_PROTECTED_BIT}), images ({@link VK11#VK_IMAGE_CREATE_PROTECTED_BIT IMAGE_CREATE_PROTECTED_BIT}), and swapchains ({@link KHRSwapchain#VK_SWAPCHAIN_CREATE_PROTECTED_BIT_KHR SWAPCHAIN_CREATE_PROTECTED_BIT_KHR}). However, on implementations which support multiple windowing systems, not all window systems <b>may</b> be able to provide a protected display path.</p>
 * 
 * <p>This extension provides a way to query if a protected swapchain created for a surface (and thus a specific windowing system) <b>can</b> be displayed on screen. It extends the existing {@link VkSurfaceCapabilities2KHR} structure with a new {@link VkSurfaceProtectedCapabilitiesKHR} structure from which the application <b>can</b> obtain information about support for protected swapchain creation through {@link KHRGetSurfaceCapabilities2#vkGetPhysicalDeviceSurfaceCapabilities2KHR GetPhysicalDeviceSurfaceCapabilities2KHR}.</p>
 * 
 * <h5>VK_KHR_surface_protected_capabilities</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_surface_protected_capabilities}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Instance extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>240</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.1</li>
 * <li>Requires {@link KHRGetSurfaceCapabilities2 VK_KHR_get_surface_capabilities2}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Sandeep Shinde <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_surface_protected_capabilities]%20@sashinde%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_surface_protected_capabilities%20extension%3E%3E">sashinde</a></li>
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
 * <li>Sandeep Shinde, NVIDIA</li>
 * <li>James Jones, NVIDIA</li>
 * <li>Daniel Koch, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public final class KHRSurfaceProtectedCapabilities {

    /** The extension specification version. */
    public static final int VK_KHR_SURFACE_PROTECTED_CAPABILITIES_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_SURFACE_PROTECTED_CAPABILITIES_EXTENSION_NAME = "VK_KHR_surface_protected_capabilities";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_SURFACE_PROTECTED_CAPABILITIES_KHR = 1000239000;

    private KHRSurfaceProtectedCapabilities() {}

}
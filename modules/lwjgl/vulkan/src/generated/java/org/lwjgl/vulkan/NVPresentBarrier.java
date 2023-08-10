/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension adds support for synchronizing corresponding presentation requests across multiple swapchains using the <em>present barrier</em>.
 * 
 * <h5>VK_NV_present_barrier</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_NV_present_barrier}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>293</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2} and {@link KHRSurface VK_KHR_surface} and {@link KHRGetSurfaceCapabilities2 VK_KHR_get_surface_capabilities2} and {@link KHRSwapchain VK_KHR_swapchain}</dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Liya Li <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NV_present_barrier]%20@liyli%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NV_present_barrier%20extension*">liyli</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2022-05-16</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Liya Li, Nvidia</li>
 * <li>Martin Schwarzer, Nvidia</li>
 * <li>Andy Wolf, Nvidia</li>
 * <li>Ian Williams, Nvidia</li>
 * <li>Ben Morris, Nvidia</li>
 * <li>James Jones, Nvidia</li>
 * <li>Jeff Juliano, Nvidia</li>
 * </ul></dd>
 * </dl>
 */
public final class NVPresentBarrier {

    /** The extension specification version. */
    public static final int VK_NV_PRESENT_BARRIER_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_NV_PRESENT_BARRIER_EXTENSION_NAME = "VK_NV_present_barrier";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_BARRIER_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_BARRIER_FEATURES_NV}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_PRESENT_BARRIER_NV STRUCTURE_TYPE_SURFACE_CAPABILITIES_PRESENT_BARRIER_NV}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_BARRIER_CREATE_INFO_NV STRUCTURE_TYPE_SWAPCHAIN_PRESENT_BARRIER_CREATE_INFO_NV}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRESENT_BARRIER_FEATURES_NV = 1000292000,
        VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_PRESENT_BARRIER_NV     = 1000292001,
        VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_BARRIER_CREATE_INFO_NV    = 1000292002;

    private NVPresentBarrier() {}

}
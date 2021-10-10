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
 * This extension extends {@link KHRSwapchain VK_KHR_swapchain} to enable creation of a shared presentable image. This allows the application to use the image while the presention engine is accessing it, in order to reduce the latency between rendering and presentation.
 * 
 * <h5>VK_KHR_shared_presentable_image</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_shared_presentable_image}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>112</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRSwapchain VK_KHR_swapchain}</li>
 * <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
 * <li>Requires {@link KHRGetSurfaceCapabilities2 VK_KHR_get_surface_capabilities2}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Alon Or-bach <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_shared_presentable_image]%20@alonorbach%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_shared_presentable_image%20extension%3E%3E">alonorbach</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2017-03-20</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Alon Or-bach, Samsung Electronics</li>
 * <li>Ian Elliott, Google</li>
 * <li>Jesse Hall, Google</li>
 * <li>Pablo Ceballos, Google</li>
 * <li>Chris Forbes, Google</li>
 * <li>Jeff Juliano, NVIDIA</li>
 * <li>James Jones, NVIDIA</li>
 * <li>Daniel Rakos, AMD</li>
 * <li>Tobias Hector, Imagination Technologies</li>
 * <li>Graham Connor, Imagination Technologies</li>
 * <li>Michael Worcester, Imagination Technologies</li>
 * <li>Cass Everitt, Oculus</li>
 * <li>Johannes Van Waveren, Oculus</li>
 * </ul></dd>
 * </dl>
 */
public class KHRSharedPresentableImage {

    /** The extension specification version. */
    public static final int VK_KHR_SHARED_PRESENTABLE_IMAGE_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_SHARED_PRESENTABLE_IMAGE_EXTENSION_NAME = "VK_KHR_shared_presentable_image";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_SHARED_PRESENT_SURFACE_CAPABILITIES_KHR = 1000111000;

    /**
     * Extends {@code VkPresentModeKHR}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR}</li>
     * <li>{@link #VK_PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR}</li>
     * </ul>
     */
    public static final int
        VK_PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR     = 1000111000,
        VK_PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR = 1000111001;

    /** Extends {@code VkImageLayout}. */
    public static final int VK_IMAGE_LAYOUT_SHARED_PRESENT_KHR = 1000111000;

    protected KHRSharedPresentableImage() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetSwapchainStatusKHR ] ---

    /**
     * Get a swapchain’s status.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>In order to query a swapchain’s status when rendering to a shared presentable image, call:</p>
     * 
     * <pre><code>
     * VkResult vkGetSwapchainStatusKHR(
     *     VkDevice                                    device,
     *     VkSwapchainKHR                              swapchain);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code swapchain} <b>must</b> be a valid {@code VkSwapchainKHR} handle</li>
     * <li>Both of {@code device}, and {@code swapchain} <b>must</b> have been created, allocated, or retrieved from the same {@code VkInstance}</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code swapchain} <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * <li>{@link KHRSwapchain#VK_SUBOPTIMAL_KHR SUBOPTIMAL_KHR}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_DEVICE_LOST ERROR_DEVICE_LOST}</li>
     * <li>{@link KHRSwapchain#VK_ERROR_OUT_OF_DATE_KHR ERROR_OUT_OF_DATE_KHR}</li>
     * <li>{@link KHRSurface#VK_ERROR_SURFACE_LOST_KHR ERROR_SURFACE_LOST_KHR}</li>
     * <li>{@link EXTFullScreenExclusive#VK_ERROR_FULL_SCREEN_EXCLUSIVE_MODE_LOST_EXT ERROR_FULL_SCREEN_EXCLUSIVE_MODE_LOST_EXT}</li>
     * </ul></dd>
     * </dl>
     *
     * @param device    the device associated with {@code swapchain}.
     * @param swapchain the swapchain to query.
     */
    @NativeType("VkResult")
    public static int vkGetSwapchainStatusKHR(VkDevice device, @NativeType("VkSwapchainKHR") long swapchain) {
        long __functionAddress = device.getCapabilities().vkGetSwapchainStatusKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPJI(device.address(), swapchain, __functionAddress);
    }

}
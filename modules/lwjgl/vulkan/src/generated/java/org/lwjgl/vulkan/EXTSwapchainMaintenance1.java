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
 * {@link EXTSwapchainMaintenance1 VK_EXT_swapchain_maintenance1} adds a collection of window system integration features that were intentionally left out or overlooked in the original {@link KHRSwapchain VK_KHR_swapchain} extension.
 * 
 * <p>The new features are as follows:</p>
 * 
 * <ul>
 * <li>Specify a fence that will be signaled when the resources associated with a present operation <b>can</b> be safely destroyed.</li>
 * <li>Allow changing the present mode a swapchain is using at per-present granularity.</li>
 * <li>Allow applications to define the behavior when presenting a swapchain image to a surface with different dimensions than the image. Using this feature <b>may</b> allow implementations to avoid returning {@link KHRSwapchain#VK_ERROR_OUT_OF_DATE_KHR ERROR_OUT_OF_DATE_KHR} in this situation.</li>
 * <li>Allow applications to defer swapchain memory allocation for improved startup time and memory footprint.</li>
 * <li>Allow applications to release previously acquired images without presenting them.</li>
 * </ul>
 * 
 * <h5>VK_EXT_swapchain_maintenance1</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_swapchain_maintenance1}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>276</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link KHRSwapchain VK_KHR_swapchain} and {@link EXTSurfaceMaintenance1 VK_EXT_surface_maintenance1} and {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Shahbaz Youssefi <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_swapchain_maintenance1]%20@syoussefi%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_swapchain_maintenance1%20extension*">syoussefi</a></li>
 * </ul></dd>
 * <dt><b>Extension Proposal</b></dt>
 * <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_EXT_swapchain_maintenance1.adoc">VK_EXT_swapchain_maintenance1</a></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2022-10-28</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Jeff Juliano, NVIDIA</li>
 * <li>Shahbaz Youssefi, Google</li>
 * <li>Chris Forbes, Google</li>
 * <li>Ian Elliott, Google</li>
 * <li>Yiwei Zhang, Google</li>
 * <li>Charlie Lao, Google</li>
 * <li>Lina Versace, Google</li>
 * <li>Ralph Potter, Samsung</li>
 * <li>Igor Nazarov, Samsung</li>
 * <li>Hyunchang Kim, Samsung</li>
 * <li>Suenghwan Lee, Samsung</li>
 * <li>Munseong Kang, Samsung</li>
 * <li>Joonyong Park, Samsung</li>
 * <li>Hans-Kristian Arntzen, Valve</li>
 * <li>Lisa Wu, Arm</li>
 * <li>Daniel Stone, Collabora</li>
 * <li>Pan Gao, Huawei</li>
 * </ul></dd>
 * </dl>
 */
public class EXTSwapchainMaintenance1 {

    /** The extension specification version. */
    public static final int VK_EXT_SWAPCHAIN_MAINTENANCE_1_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_SWAPCHAIN_MAINTENANCE_1_EXTENSION_NAME = "VK_EXT_swapchain_maintenance1";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SWAPCHAIN_MAINTENANCE_1_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_SWAPCHAIN_MAINTENANCE_1_FEATURES_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_FENCE_INFO_EXT STRUCTURE_TYPE_SWAPCHAIN_PRESENT_FENCE_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_MODES_CREATE_INFO_EXT STRUCTURE_TYPE_SWAPCHAIN_PRESENT_MODES_CREATE_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_MODE_INFO_EXT STRUCTURE_TYPE_SWAPCHAIN_PRESENT_MODE_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_SCALING_CREATE_INFO_EXT STRUCTURE_TYPE_SWAPCHAIN_PRESENT_SCALING_CREATE_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_RELEASE_SWAPCHAIN_IMAGES_INFO_EXT STRUCTURE_TYPE_RELEASE_SWAPCHAIN_IMAGES_INFO_EXT}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SWAPCHAIN_MAINTENANCE_1_FEATURES_EXT = 1000275000,
        VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_FENCE_INFO_EXT                     = 1000275001,
        VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_MODES_CREATE_INFO_EXT              = 1000275002,
        VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_MODE_INFO_EXT                      = 1000275003,
        VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_SCALING_CREATE_INFO_EXT            = 1000275004,
        VK_STRUCTURE_TYPE_RELEASE_SWAPCHAIN_IMAGES_INFO_EXT                    = 1000275005;

    /** Extends {@code VkSwapchainCreateFlagBitsKHR}. */
    public static final int VK_SWAPCHAIN_CREATE_DEFERRED_MEMORY_ALLOCATION_BIT_EXT = 0x8;

    protected EXTSwapchainMaintenance1() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkReleaseSwapchainImagesEXT ] ---

    /** Unsafe version of: {@link #vkReleaseSwapchainImagesEXT ReleaseSwapchainImagesEXT} */
    public static int nvkReleaseSwapchainImagesEXT(VkDevice device, long pReleaseInfo) {
        long __functionAddress = device.getCapabilities().vkReleaseSwapchainImagesEXT;
        if (CHECKS) {
            check(__functionAddress);
            VkReleaseSwapchainImagesInfoEXT.validate(pReleaseInfo);
        }
        return callPPI(device.address(), pReleaseInfo, __functionAddress);
    }

    /**
     * Release previously acquired but unused images.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To release images previously acquired through {@link KHRSwapchain#vkAcquireNextImage2KHR AcquireNextImage2KHR} or {@link KHRSwapchain#vkAcquireNextImageKHR AcquireNextImageKHR}, call:</p>
     * 
     * <pre><code>
     * VkResult vkReleaseSwapchainImagesEXT(
     *     VkDevice                                    device,
     *     const VkReleaseSwapchainImagesInfoEXT*      pReleaseInfo);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>Only images that are not in use by the device <b>can</b> be released.</p>
     * 
     * <p>Releasing images is a read-only operation that will not affect the content of the released images. Upon reacquiring the image, the image contents and its layout will be the same as they were prior to releasing it. However, if a mechanism other than Vulkan is used to modify the platform window associated with the swapchain, the content of all presentable images in the swapchain becomes undefined.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>This functionality is useful during swapchain recreation, where acquired images from the old swapchain can be released instead of presented.</p>
     * </div>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pReleaseInfo} <b>must</b> be a valid pointer to a valid {@link VkReleaseSwapchainImagesInfoEXT} structure</li>
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
     * <li>{@link KHRSurface#VK_ERROR_SURFACE_LOST_KHR ERROR_SURFACE_LOST_KHR}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkReleaseSwapchainImagesInfoEXT}</p>
     *
     * @param device       the device associated with {@link VkReleaseSwapchainImagesInfoEXT}{@code ::swapchain}.
     * @param pReleaseInfo a pointer to a {@link VkReleaseSwapchainImagesInfoEXT} structure containing parameters of the release.
     */
    @NativeType("VkResult")
    public static int vkReleaseSwapchainImagesEXT(VkDevice device, @NativeType("VkReleaseSwapchainImagesInfoEXT const *") VkReleaseSwapchainImagesInfoEXT pReleaseInfo) {
        return nvkReleaseSwapchainImagesEXT(device, pReleaseInfo.address());
    }

}
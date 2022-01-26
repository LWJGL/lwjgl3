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
 * This extension provides an API to create a swapchain directly on a device’s display without any underlying window system.
 * 
 * <h5>Examples</h5>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>The example code for the {@link KHRDisplay VK_KHR_display} and {@code VK_KHR_display_swapchain} extensions was removed from the appendix after revision 1.0.43. The display swapchain creation example code was ported to the cube demo that is shipped with the official Khronos SDK, and is being kept up-to-date in that location (see: <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Tools/blob/master/cube/cube.c">https://github.com/KhronosGroup/Vulkan-Tools/blob/master/cube/cube.c</a>).</p>
 * </div>
 * 
 * <h5>VK_KHR_display_swapchain</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_display_swapchain}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>4</dd>
 * <dt><b>Revision</b></dt>
 * <dd>10</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRSwapchain VK_KHR_swapchain}</li>
 * <li>Requires {@link KHRDisplay VK_KHR_display}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>James Jones <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_display_swapchain]%20@cubanismo%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_display_swapchain%20extension%3E%3E">cubanismo</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2017-03-13</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>James Jones, NVIDIA</li>
 * <li>Jeff Vigil, Qualcomm</li>
 * <li>Jesse Hall, Google</li>
 * </ul></dd>
 * </dl>
 */
public class KHRDisplaySwapchain {

    /** The extension specification version. */
    public static final int VK_KHR_DISPLAY_SWAPCHAIN_SPEC_VERSION = 10;

    /** The extension name. */
    public static final String VK_KHR_DISPLAY_SWAPCHAIN_EXTENSION_NAME = "VK_KHR_display_swapchain";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_DISPLAY_PRESENT_INFO_KHR = 1000003000;

    /** Extends {@code VkResult}. */
    public static final int VK_ERROR_INCOMPATIBLE_DISPLAY_KHR = -1000003001;

    protected KHRDisplaySwapchain() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCreateSharedSwapchainsKHR ] ---

    /**
     * Unsafe version of: {@link #vkCreateSharedSwapchainsKHR CreateSharedSwapchainsKHR}
     *
     * @param swapchainCount the number of swapchains to create.
     */
    public static int nvkCreateSharedSwapchainsKHR(VkDevice device, int swapchainCount, long pCreateInfos, long pAllocator, long pSwapchains) {
        long __functionAddress = device.getCapabilities().vkCreateSharedSwapchainsKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(device.address(), swapchainCount, pCreateInfos, pAllocator, pSwapchains, __functionAddress);
    }

    /**
     * Create multiple swapchains that share presentable images.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>When the {@code VK_KHR_display_swapchain} extension is enabled, multiple swapchains that share presentable images are created by calling:</p>
     * 
     * <pre><code>
     * VkResult vkCreateSharedSwapchainsKHR(
     *     VkDevice                                    device,
     *     uint32_t                                    swapchainCount,
     *     const VkSwapchainCreateInfoKHR*             pCreateInfos,
     *     const VkAllocationCallbacks*                pAllocator,
     *     VkSwapchainKHR*                             pSwapchains);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>{@code vkCreateSharedSwapchainsKHR} is similar to {@link KHRSwapchain#vkCreateSwapchainKHR CreateSwapchainKHR}, except that it takes an array of {@link VkSwapchainCreateInfoKHR} structures, and returns an array of swapchain objects.</p>
     * 
     * <p>The swapchain creation parameters that affect the properties and number of presentable images <b>must</b> match between all the swapchains. If the displays used by any of the swapchains do not use the same presentable image layout or are incompatible in a way that prevents sharing images, swapchain creation will fail with the result code {@link #VK_ERROR_INCOMPATIBLE_DISPLAY_KHR ERROR_INCOMPATIBLE_DISPLAY_KHR}. If any error occurs, no swapchains will be created. Images presented to multiple swapchains <b>must</b> be re-acquired from all of them before transitioning away from {@link KHRSwapchain#VK_IMAGE_LAYOUT_PRESENT_SRC_KHR IMAGE_LAYOUT_PRESENT_SRC_KHR}. After destroying one or more of the swapchains, the remaining swapchains and the presentable images <b>can</b> continue to be used.</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pCreateInfos} <b>must</b> be a valid pointer to an array of {@code swapchainCount} valid {@link VkSwapchainCreateInfoKHR} structures</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>{@code pSwapchains} <b>must</b> be a valid pointer to an array of {@code swapchainCount} {@code VkSwapchainKHR} handles</li>
     * <li>{@code swapchainCount} <b>must</b> be greater than 0</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code pCreateInfos}[].surface <b>must</b> be externally synchronized</li>
     * <li>Host access to {@code pCreateInfos}[].oldSwapchain <b>must</b> be externally synchronized</li>
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
     * <li>{@link #VK_ERROR_INCOMPATIBLE_DISPLAY_KHR ERROR_INCOMPATIBLE_DISPLAY_KHR}</li>
     * <li>{@link VK10#VK_ERROR_DEVICE_LOST ERROR_DEVICE_LOST}</li>
     * <li>{@link KHRSurface#VK_ERROR_SURFACE_LOST_KHR ERROR_SURFACE_LOST_KHR}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}, {@link VkSwapchainCreateInfoKHR}</p>
     *
     * @param device       the device to create the swapchains for.
     * @param pCreateInfos a pointer to an array of {@link VkSwapchainCreateInfoKHR} structures specifying the parameters of the created swapchains.
     * @param pAllocator   the allocator used for host memory allocated for the swapchain objects when there is no more specific allocator available (see <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a>).
     * @param pSwapchains  a pointer to an array of {@code VkSwapchainKHR} handles in which the created swapchain objects will be returned.
     */
    @NativeType("VkResult")
    public static int vkCreateSharedSwapchainsKHR(VkDevice device, @NativeType("VkSwapchainCreateInfoKHR const *") VkSwapchainCreateInfoKHR.Buffer pCreateInfos, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkSwapchainKHR *") LongBuffer pSwapchains) {
        if (CHECKS) {
            check(pSwapchains, pCreateInfos.remaining());
        }
        return nvkCreateSharedSwapchainsKHR(device, pCreateInfos.remaining(), pCreateInfos.address(), memAddressSafe(pAllocator), memAddress(pSwapchains));
    }

    /** Array version of: {@link #vkCreateSharedSwapchainsKHR CreateSharedSwapchainsKHR} */
    @NativeType("VkResult")
    public static int vkCreateSharedSwapchainsKHR(VkDevice device, @NativeType("VkSwapchainCreateInfoKHR const *") VkSwapchainCreateInfoKHR.Buffer pCreateInfos, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkSwapchainKHR *") long[] pSwapchains) {
        long __functionAddress = device.getCapabilities().vkCreateSharedSwapchainsKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pSwapchains, pCreateInfos.remaining());
        }
        return callPPPPI(device.address(), pCreateInfos.remaining(), pCreateInfos.address(), memAddressSafe(pAllocator), pSwapchains, __functionAddress);
    }

}
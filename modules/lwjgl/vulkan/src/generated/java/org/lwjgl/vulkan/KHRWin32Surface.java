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
 * The {@code VK_KHR_win32_surface} extension is an instance extension. It provides a mechanism to create a {@code VkSurfaceKHR} object (defined by the {@link KHRSurface VK_KHR_surface} extension) that refers to a Win32 {@code HWND}, as well as a query to determine support for rendering to the windows desktop.
 * 
 * <h5>VK_KHR_win32_surface</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_win32_surface}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Instance extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>10</dd>
 * <dt><b>Revision</b></dt>
 * <dd>6</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRSurface VK_KHR_surface}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Jesse Hall <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_KHR_win32_surface:%20&amp;body=@critsec%20">critsec</a></li>
 * <li>Ian Elliott <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_KHR_win32_surface:%20&amp;body=@ianelliottus%20">ianelliottus</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2017-04-24</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Patrick Doane, Blizzard</li>
 * <li>Jason Ekstrand, Intel</li>
 * <li>Ian Elliott, LunarG</li>
 * <li>Courtney Goeltzenleuchter, LunarG</li>
 * <li>Jesse Hall, Google</li>
 * <li>James Jones, NVIDIA</li>
 * <li>Antoine Labour, Google</li>
 * <li>Jon Leech, Khronos</li>
 * <li>David Mao, AMD</li>
 * <li>Norbert Nopper, Freescale</li>
 * <li>Alon Or-bach, Samsung</li>
 * <li>Daniel Rakos, AMD</li>
 * <li>Graham Sellers, AMD</li>
 * <li>Ray Smith, ARM</li>
 * <li>Jeff Vigil, Qualcomm</li>
 * <li>Chia-I Wu, LunarG</li>
 * </ul></dd>
 * </dl>
 */
public class KHRWin32Surface {

    /** The extension specification version. */
    public static final int VK_KHR_WIN32_SURFACE_SPEC_VERSION = 6;

    /** The extension name. */
    public static final String VK_KHR_WIN32_SURFACE_EXTENSION_NAME = "VK_KHR_win32_surface";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_WIN32_SURFACE_CREATE_INFO_KHR = 1000009000;

    protected KHRWin32Surface() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCreateWin32SurfaceKHR ] ---

    /** Unsafe version of: {@link #vkCreateWin32SurfaceKHR CreateWin32SurfaceKHR} */
    public static int nvkCreateWin32SurfaceKHR(VkInstance instance, long pCreateInfo, long pAllocator, long pSurface) {
        long __functionAddress = instance.getCapabilities().vkCreateWin32SurfaceKHR;
        if (CHECKS) {
            check(__functionAddress);
            VkWin32SurfaceCreateInfoKHR.validate(pCreateInfo);
            if (pAllocator != NULL) { VkAllocationCallbacks.validate(pAllocator); }
        }
        return callPPPPI(instance.address(), pCreateInfo, pAllocator, pSurface, __functionAddress);
    }

    /**
     * Create a {@code VkSurfaceKHR} object for an Win32 native window.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To create a {@code VkSurfaceKHR} object for a Win32 window, call:</p>
     * 
     * <pre><code>
     * VkResult vkCreateWin32SurfaceKHR(
     *     VkInstance                                  instance,
     *     const VkWin32SurfaceCreateInfoKHR*          pCreateInfo,
     *     const VkAllocationCallbacks*                pAllocator,
     *     VkSurfaceKHR*                               pSurface);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
     * <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid {@link VkWin32SurfaceCreateInfoKHR} structure</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>{@code pSurface} <b>must</b> be a valid pointer to a {@code VkSurfaceKHR} handle</li>
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
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}, {@link VkWin32SurfaceCreateInfoKHR}</p>
     *
     * @param instance    the instance to associate the surface with.
     * @param pCreateInfo a pointer to a {@link VkWin32SurfaceCreateInfoKHR} structure containing parameters affecting the creation of the surface object.
     * @param pAllocator  the allocator used for host memory allocated for the surface object when there is no more specific allocator available (see <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a>).
     * @param pSurface    a pointer to a {@code VkSurfaceKHR} handle in which the created surface object is returned.
     */
    @NativeType("VkResult")
    public static int vkCreateWin32SurfaceKHR(VkInstance instance, @NativeType("VkWin32SurfaceCreateInfoKHR const *") VkWin32SurfaceCreateInfoKHR pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkSurfaceKHR *") LongBuffer pSurface) {
        if (CHECKS) {
            check(pSurface, 1);
        }
        return nvkCreateWin32SurfaceKHR(instance, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pSurface));
    }

    // --- [ vkGetPhysicalDeviceWin32PresentationSupportKHR ] ---

    /**
     * query queue family support for presentation on a Win32 display.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To determine whether a queue family of a physical device supports presentation to the Microsoft Windows desktop, call:</p>
     * 
     * <pre><code>
     * VkBool32 vkGetPhysicalDeviceWin32PresentationSupportKHR(
     *     VkPhysicalDevice                            physicalDevice,
     *     uint32_t                                    queueFamilyIndex);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This platform-specific function <b>can</b> be called prior to creating a surface.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>{@code queueFamilyIndex} <b>must</b> be less than {@code pQueueFamilyPropertyCount} returned by {@code vkGetPhysicalDeviceQueueFamilyProperties} for the given {@code physicalDevice}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
     * </ul>
     *
     * @param physicalDevice   the physical device.
     * @param queueFamilyIndex the queue family index.
     */
    @NativeType("VkBool32")
    public static boolean vkGetPhysicalDeviceWin32PresentationSupportKHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t") int queueFamilyIndex) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceWin32PresentationSupportKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(physicalDevice.address(), queueFamilyIndex, __functionAddress) != 0;
    }

    /** Array version of: {@link #vkCreateWin32SurfaceKHR CreateWin32SurfaceKHR} */
    @NativeType("VkResult")
    public static int vkCreateWin32SurfaceKHR(VkInstance instance, @NativeType("VkWin32SurfaceCreateInfoKHR const *") VkWin32SurfaceCreateInfoKHR pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkSurfaceKHR *") long[] pSurface) {
        long __functionAddress = instance.getCapabilities().vkCreateWin32SurfaceKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pSurface, 1);
            VkWin32SurfaceCreateInfoKHR.validate(pCreateInfo.address());
            if (pAllocator != null) { VkAllocationCallbacks.validate(pAllocator.address()); }
        }
        return callPPPPI(instance.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pSurface, __functionAddress);
    }

}
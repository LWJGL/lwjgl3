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
 * The {@code VK_KHR_xlib_surface} extension is an instance extension. It provides a mechanism to create a {@code VkSurfaceKHR} object (defined by the {@link KHRSurface VK_KHR_surface} extension) that refers to an X11 {@code Window}, using the Xlib client-side library, as well as a query to determine support for rendering via Xlib.
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_xlib_surface}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Instance extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>5</dd>
 * <dt><b>Revision</b></dt>
 * <dd>6</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRSurface VK_KHR_surface}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Jesse Hall <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_KHR_xlib_surface:%20&amp;body=@critsec%20">critsec</a></li>
 * <li>Ian Elliott <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_KHR_xlib_surface:%20&amp;body=@ianelliottus%20">ianelliottus</a></li>
 * </ul></dd>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2015-11-28</dd>
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
public class KHRXlibSurface {

    /** The extension specification version. */
    public static final int VK_KHR_XLIB_SURFACE_SPEC_VERSION = 6;

    /** The extension name. */
    public static final String VK_KHR_XLIB_SURFACE_EXTENSION_NAME = "VK_KHR_xlib_surface";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_XLIB_SURFACE_CREATE_INFO_KHR = 1000004000;

    protected KHRXlibSurface() {
        throw new UnsupportedOperationException();
    }

    static boolean checkCapsInstance(FunctionProvider provider, java.util.Map<String, Long> caps, java.util.Set<String> ext) {
        return ext.contains("VK_KHR_xlib_surface") && VK.checkExtension("VK_KHR_xlib_surface",
               VK.isSupported(provider, "vkCreateXlibSurfaceKHR", caps)
            && VK.isSupported(provider, "vkGetPhysicalDeviceXlibPresentationSupportKHR", caps)
        );
    }

    // --- [ vkCreateXlibSurfaceKHR ] ---

    /** Unsafe version of: {@link #vkCreateXlibSurfaceKHR CreateXlibSurfaceKHR} */
    public static int nvkCreateXlibSurfaceKHR(VkInstance instance, long pCreateInfo, long pAllocator, long pSurface) {
        long __functionAddress = instance.getCapabilities().vkCreateXlibSurfaceKHR;
        if (CHECKS) {
            check(__functionAddress);
            VkXlibSurfaceCreateInfoKHR.validate(pCreateInfo);
            if (pAllocator != NULL) { VkAllocationCallbacks.validate(pAllocator); }
        }
        return callPPPPI(instance.address(), pCreateInfo, pAllocator, pSurface, __functionAddress);
    }

    /**
     * Create a {@code VkSurfaceKHR} object for an X11 window, using the Xlib client-side library.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To create a {@code VkSurfaceKHR} object for an X11 window, using the Xlib client-side library, call:</p>
     * 
     * <pre><code>
     * VkResult vkCreateXlibSurfaceKHR(
     *     VkInstance                                  instance,
     *     const VkXlibSurfaceCreateInfoKHR*           pCreateInfo,
     *     const VkAllocationCallbacks*                pAllocator,
     *     VkSurfaceKHR*                               pSurface);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
     * <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid {@link VkXlibSurfaceCreateInfoKHR} structure</li>
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
     * <p>{@link VkAllocationCallbacks}, {@link VkXlibSurfaceCreateInfoKHR}</p>
     *
     * @param instance    the instance to associate the surface with.
     * @param pCreateInfo a pointer to an instance of the {@link VkXlibSurfaceCreateInfoKHR} structure containing the parameters affecting the creation of the surface object.
     * @param pAllocator  the allocator used for host memory allocated for the surface object when there is no more specific allocator available (see <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a>).
     * @param pSurface    points to a {@code VkSurfaceKHR} handle in which the created surface object is returned.
     */
    @NativeType("VkResult")
    public static int vkCreateXlibSurfaceKHR(VkInstance instance, @NativeType("VkXlibSurfaceCreateInfoKHR const *") VkXlibSurfaceCreateInfoKHR pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkSurfaceKHR *") LongBuffer pSurface) {
        if (CHECKS) {
            check(pSurface, 1);
        }
        return nvkCreateXlibSurfaceKHR(instance, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pSurface));
    }

    // --- [ vkGetPhysicalDeviceXlibPresentationSupportKHR ] ---

    /**
     * Query physical device for presentation to X11 server using Xlib.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To determine whether a queue family of a physical device supports presentation to an X11 server, using the Xlib client-side library, call:</p>
     * 
     * <pre><code>
     * VkBool32 vkGetPhysicalDeviceXlibPresentationSupportKHR(
     *     VkPhysicalDevice                            physicalDevice,
     *     uint32_t                                    queueFamilyIndex,
     *     Display*                                    dpy,
     *     VisualID                                    visualID);</code></pre>
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
     * <li>{@code dpy} <b>must</b> be a valid pointer to a {@code Display} value</li>
     * </ul>
     *
     * @param physicalDevice   the physical device.
     * @param queueFamilyIndex the queue family index.
     * @param dpy              a pointer to an Xlib {@code Display} connection to the server.
     */
    @NativeType("VkBool32")
    public static boolean vkGetPhysicalDeviceXlibPresentationSupportKHR(VkPhysicalDevice physicalDevice, @NativeType("uint32_t") int queueFamilyIndex, @NativeType("Display *") long dpy, @NativeType("VisualID") long visualID) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceXlibPresentationSupportKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
        }
        return callPPNI(physicalDevice.address(), queueFamilyIndex, dpy, visualID, __functionAddress) != 0;
    }

    /** Array version of: {@link #vkCreateXlibSurfaceKHR CreateXlibSurfaceKHR} */
    @NativeType("VkResult")
    public static int vkCreateXlibSurfaceKHR(VkInstance instance, @NativeType("VkXlibSurfaceCreateInfoKHR const *") VkXlibSurfaceCreateInfoKHR pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkSurfaceKHR *") long[] pSurface) {
        long __functionAddress = instance.getCapabilities().vkCreateXlibSurfaceKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pSurface, 1);
            VkXlibSurfaceCreateInfoKHR.validate(pCreateInfo.address());
            if (pAllocator != null) { VkAllocationCallbacks.validate(pAllocator.address()); }
        }
        return callPPPPI(instance.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pSurface, __functionAddress);
    }

}
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
 * The {@code VK_KHR_android_surface} extension is an instance extension. It provides a mechanism to create a {@code VkSurfaceKHR} object (defined by the {@link KHRSurface VK_KHR_surface} extension) that refers to an {@code ANativeWindow}, Android’s native surface type. The {@code ANativeWindow} represents the producer endpoint of any buffer queue, regardless of consumer endpoint. Common consumer endpoints for {@code ANativeWindows} are the system window compositor, video encoders, and application-specific compositors importing the images through a {@code SurfaceTexture}.
 * 
 * <h5>VK_KHR_android_surface</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_android_surface}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Instance extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>9</dd>
 * <dt><b>Revision</b></dt>
 * <dd>6</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link KHRSurface VK_KHR_surface}</dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Jesse Hall <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_android_surface]%20@critsec%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_android_surface%20extension*">critsec</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2016-01-14</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Patrick Doane, Blizzard</li>
 * <li>Faith Ekstrand, Intel</li>
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
public class KHRAndroidSurface {

    /** The extension specification version. */
    public static final int VK_KHR_ANDROID_SURFACE_SPEC_VERSION = 6;

    /** The extension name. */
    public static final String VK_KHR_ANDROID_SURFACE_EXTENSION_NAME = "VK_KHR_android_surface";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_ANDROID_SURFACE_CREATE_INFO_KHR = 1000008000;

    protected KHRAndroidSurface() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCreateAndroidSurfaceKHR ] ---

    /** Unsafe version of: {@link #vkCreateAndroidSurfaceKHR CreateAndroidSurfaceKHR} */
    public static int nvkCreateAndroidSurfaceKHR(VkInstance instance, long pCreateInfo, long pAllocator, long pSurface) {
        long __functionAddress = instance.getCapabilities().vkCreateAndroidSurfaceKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(instance.address(), pCreateInfo, pAllocator, pSurface, __functionAddress);
    }

    /**
     * Create a {@code VkSurfaceKHR} object for an Android native window.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To create a {@code VkSurfaceKHR} object for an Android native window, call:</p>
     * 
     * <pre><code>
     * VkResult vkCreateAndroidSurfaceKHR(
     *     VkInstance                                  instance,
     *     const VkAndroidSurfaceCreateInfoKHR*        pCreateInfo,
     *     const VkAllocationCallbacks*                pAllocator,
     *     VkSurfaceKHR*                               pSurface);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>During the lifetime of a surface created using a particular {@code ANativeWindow} handle any attempts to create another surface for the same {@code ANativeWindow} and any attempts to connect to the same {@code ANativeWindow} through other platform mechanisms will fail.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>In particular, only one {@code VkSurfaceKHR} <b>can</b> exist at a time for a given window. Similarly, a native window <b>cannot</b> be used by both a {@code VkSurfaceKHR} and {@code EGLSurface} simultaneously.</p>
     * </div>
     * 
     * <p>If successful, {@code vkCreateAndroidSurfaceKHR} increments the {@code ANativeWindow}’s reference count, and {@code vkDestroySurfaceKHR} will decrement it.</p>
     * 
     * <p>On Android, when a swapchain’s {@code imageExtent} does not match the surface’s {@code currentExtent}, the presentable images will be scaled to the surface’s dimensions during presentation. {@code minImageExtent} is <code>(1,1)</code>, and {@code maxImageExtent} is the maximum image size supported by the consumer. For the system compositor, {@code currentExtent} is the window size (i.e. the consumer’s preferred size).</p>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
     * <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid {@link VkAndroidSurfaceCreateInfoKHR} structure</li>
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
     * <li>{@link KHRSurface#VK_ERROR_NATIVE_WINDOW_IN_USE_KHR ERROR_NATIVE_WINDOW_IN_USE_KHR}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}, {@link VkAndroidSurfaceCreateInfoKHR}</p>
     *
     * @param instance    the instance to associate the surface with.
     * @param pCreateInfo a pointer to a {@link VkAndroidSurfaceCreateInfoKHR} structure containing parameters affecting the creation of the surface object.
     * @param pAllocator  the allocator used for host memory allocated for the surface object when there is no more specific allocator available (see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a>).
     * @param pSurface    a pointer to a {@code VkSurfaceKHR} handle in which the created surface object is returned.
     */
    @NativeType("VkResult")
    public static int vkCreateAndroidSurfaceKHR(VkInstance instance, @NativeType("VkAndroidSurfaceCreateInfoKHR const *") VkAndroidSurfaceCreateInfoKHR pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkSurfaceKHR *") LongBuffer pSurface) {
        if (CHECKS) {
            check(pSurface, 1);
        }
        return nvkCreateAndroidSurfaceKHR(instance, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pSurface));
    }

    /** Array version of: {@link #vkCreateAndroidSurfaceKHR CreateAndroidSurfaceKHR} */
    @NativeType("VkResult")
    public static int vkCreateAndroidSurfaceKHR(VkInstance instance, @NativeType("VkAndroidSurfaceCreateInfoKHR const *") VkAndroidSurfaceCreateInfoKHR pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkSurfaceKHR *") long[] pSurface) {
        long __functionAddress = instance.getCapabilities().vkCreateAndroidSurfaceKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(pSurface, 1);
        }
        return callPPPPI(instance.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pSurface, __functionAddress);
    }

}
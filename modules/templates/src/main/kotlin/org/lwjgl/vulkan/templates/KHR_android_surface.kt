/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.system.android.*
import org.lwjgl.vulkan.*

val KHR_android_surface = "KHRAndroidSurface".nativeClassVK("KHR_android_surface", type = "instance", postfix = KHR) {
    documentation =
        """
        The {@code VK_KHR_android_surface} extension is an instance extension. It provides a mechanism to create a {@code VkSurfaceKHR} object (defined by the {@code VK_KHR_surface} extension) that refers to an {@code ANativeWindow}, Android's native surface type. The {@code ANativeWindow} represents the producer endpoint of any buffer queue, regardless of consumer endpoint. Common consumer endpoints for {@code ANativeWindows} are the system window compositor, video encoders, and application-specific compositors importing the images through a SurfaceTexture.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>VK_KHR_android_surface</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Instance extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>9</dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2016-01-14</dd>

            <dt><b>Revision</b></dt>
            <dd>6</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Dependencies</b></dt>
            <dd><ul>
                <li>This extension is written against version 1.0 of the Vulkan API.</li>
                <li>Requires VK_KHR_surface.</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Patrick Doane, Blizzard</li>
                <li>Jason Ekstrand, Intel</li>
                <li>Ian Elliott, LunarG</li>
                <li>Courtney Goeltzenleuchter, LunarG</li>
                <li>Jesse Hall, Google</li>
                <li>James Jones, NVIDIA</li>
                <li>Antoine Labour, Google</li>
                <li>Jon Leech, Khronos</li>
                <li>David Mao, AMD</li>
                <li>Norbert Nopper, Freescale</li>
                <li>Alon Or-bach, Samsung</li>
                <li>Daniel Rakos, AMD</li>
                <li>Graham Sellers, AMD</li>
                <li>Ray Smith, ARM</li>
                <li>Jeff Vigil, Qualcomm</li>
                <li>Chia-I Wu, LunarG</li>
            </ul></dd>

            <dt><b>Contacts</b></dt>
            <dd><ul>
                <li>Jesse Hall, Google</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_ANDROID_SURFACE_SPEC_VERSION".."6"
    )

    StringConstant(
        "The extension name.",

        "KHR_ANDROID_SURFACE_EXTENSION_NAME".."VK_KHR_android_surface"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_ANDROID_SURFACE_CREATE_INFO_KHR".."1000008000"
    )

    VkResult(
        "CreateAndroidSurfaceKHR",
        """
        Create a {@code VkSurfaceKHR} object for an Android native window.

        <h5>C Specification</h5>
        To create a {@code VkSurfaceKHR} object for an Android native window, call:

        <pre><code>VkResult vkCreateAndroidSurfaceKHR(
￿    VkInstance                                  instance,
￿    const VkAndroidSurfaceCreateInfoKHR*        pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkSurfaceKHR*                               pSurface);</code></pre>

        <h5>Description</h5>
        During the lifetime of a surface created using a particular {@code ANativeWindow} handle any attempts to create another surface for the same {@code ANativeWindow} and any attempts to connect to the same {@code ANativeWindow} through other platform mechanisms will fail.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>NOTE</h5>
        In particular, only one {@code VkSurfaceKHR} <b>can</b> exist at a time for a given window. Similarly, a native window <b>cannot</b> be used by both a {@code VkSurfaceKHR} and EGLSurface simultaneously.
        </div>

        If successful, #CreateAndroidSurfaceKHR() increments the {@code ANativeWindow}'s reference count, and #DestroySurfaceKHR() will decrement it.

        On Android, when a swapchain's {@code imageExtent} does not match the surface's {@code currentExtent}, the presentable images will be scaled to the surface's dimensions during presentation. {@code minImageExtent} is <code>(1,1)</code>, and {@code maxImageExtent} is the maximum image size supported by the consumer. For the system compositor, {@code currentExtent} is the window size (i.e. the consumer's preferred size).

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid ##VkAndroidSurfaceCreateInfoKHR structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pSurface} <b>must</b> be a pointer to a {@code VkSurfaceKHR} handle</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_NATIVE_WINDOW_IN_USE_KHR</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkAndroidSurfaceCreateInfoKHR
        """,

        VkInstance.IN("instance", "the instance to associate the surface with."),
        const..VkAndroidSurfaceCreateInfoKHR.p.IN("pCreateInfo", "a pointer to an instance of the ##VkAndroidSurfaceCreateInfoKHR structure containing parameters affecting the creation of the surface object."),
        nullable..const..VkAllocationCallbacks.p.IN("pAllocator", "the allocator used for host memory allocated for the surface object when there is no more specific allocator available (see <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-allocation\">Memory Allocation</a>)."),
        Check(1)..VkSurfaceKHR.p.OUT("pSurface", "points to a {@code VkSurfaceKHR} handle in which the created surface object is returned.")
    )
}
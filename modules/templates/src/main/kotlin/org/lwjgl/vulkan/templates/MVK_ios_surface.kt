/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val MVK_ios_surface = "MVKIosSurface".nativeClassVK("MVK_ios_surface", type = "instance", postfix = MVK) {
    documentation =
        """
        The {@code VK_MVK_ios_surface} extension is an instance extension. It provides a mechanism to create a {@code VkSurfaceKHR} object (defined by the {@code VK_KHR_surface} extension) that refers to a {@code UIView}, the native surface type of iOS, which is underpinned by a {@code CAMetalLayer}, to support rendering to the surface using Apple's Metal framework.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>VK_MVK_ios_surface</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Instance extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>123</dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2017-02-24</dd>

            <dt><b>Revision</b></dt>
            <dd>2</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Dependencies</b></dt>
            <dd><ul>
                <li>This extension is written against version 1.0 of the Vulkan API.</li>
                <li>Requires VK_KHR_surface.</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Bill Hollings, The Brenwill Workshop Ltd.</li>
            </ul></dd>

            <dt><b>Contacts</b></dt>
            <dd><ul>
                <li>Bill Hollings, The Brenwill Workshop Ltd.</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "MVK_IOS_SURFACE_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "MVK_IOS_SURFACE_EXTENSION_NAME".."VK_MVK_ios_surface"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_IOS_SURFACE_CREATE_INFO_MVK".."1000122000"
    )

    VkResult(
        "CreateIOSSurfaceMVK",
        """
        Create a VkSurfaceKHR object for an iOS UIView.

        <h5>C Specification</h5>
        To create a {@code VkSurfaceKHR} object for an iOS {@code UIView}, call:

        <code><pre>
￿VkResult vkCreateIOSSurfaceMVK(
￿    VkInstance                                  instance,
￿    const VkIOSSurfaceCreateInfoMVK*            pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkSurfaceKHR*                               pSurface);</pre></code>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid ##VkIOSSurfaceCreateInfoMVK structure</li>
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
        ##VkAllocationCallbacks, ##VkIOSSurfaceCreateInfoMVK
        """,

        VkInstance.IN("instance", "the instance with which to associate the surface."),
        const..VkIOSSurfaceCreateInfoMVK.p.IN("pCreateInfo", "a pointer to an instance of the ##VkIOSSurfaceCreateInfoMVK structure containing parameters affecting the creation of the surface object."),
        nullable..const..VkAllocationCallbacks.p.IN("pAllocator", "the allocator used for host memory allocated for the surface object when there is no more specific allocator available (see <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-allocation\">Memory Allocation</a>)."),
        Check(1)..VkSurfaceKHR.p.OUT("pSurface", "points to a {@code VkSurfaceKHR} handle in which the created surface object is returned.")
    )
}
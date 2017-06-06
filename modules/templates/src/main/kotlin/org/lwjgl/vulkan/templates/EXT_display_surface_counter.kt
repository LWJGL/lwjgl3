/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val EXT_display_surface_counter = "EXTDisplaySurfaceCounter".nativeClassVK("EXT_display_surface_counter", type = "instance", postfix = EXT) {
    documentation =
        """
        This is extension defines a vertical blanking period counter associated with display surfaces. It provides a mechanism to query support for such a counter from a {@code VkSurfaceKHR} object.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>VK_EXT_display_surface_counter</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Instance extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>91</dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2016-12-13</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Dependencies</b></dt>
            <dd><ul>
                <li>This extension is written against version 1.0.37 of the Vulkan API.</li>
                <li>Requires VK_KHR_display</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Pierre Boudier, NVIDIA</li>
                <li>James Jones, NVIDIA</li>
                <li>Damien Leone, NVIDIA</li>
                <li>Pierre-Loup Griffais, Valve</li>
                <li>Daniel Vetter, Intel</li>
            </ul></dd>

            <dt><b>Contacts</b></dt>
            <dd><ul>
                <li>James Jones, NVIDIA (jajones 'at' nvidia.com)</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_DISPLAY_SURFACE_COUNTER_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_DISPLAY_SURFACE_COUNTER_EXTENSION_NAME".."VK_EXT_display_surface_counter"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_SURFACE_CAPABILITIES2_EXT".."1000090000"
    )

    EnumConstant(
        """
        VkSurfaceCounterFlagBitsEXT - Surface-relative counter types

        <h5>Description</h5>
        <ul>
            <li>#SURFACE_COUNTER_VBLANK_EXT indicates a counter incrementing once every time a vertical blanking period occurs on the display associated with the surface.</li>
        </ul>

        <h5>See Also</h5>
        {@code VkSurfaceCounterFlagsEXT}, #GetSwapchainCounterEXT()
        """,

        "SURFACE_COUNTER_VBLANK_EXT".enum(0x00000001)
    )

    VkResult(
        "GetPhysicalDeviceSurfaceCapabilities2EXT",
        """
        Query surface capabilities.

        <h5>C Specification</h5>
        To query the basic capabilities of a surface, needed in order to create a swapchain, call:

        <code><pre>
￿VkResult vkGetPhysicalDeviceSurfaceCapabilities2EXT(
￿    VkPhysicalDevice                            physicalDevice,
￿    VkSurfaceKHR                                surface,
￿    VkSurfaceCapabilities2EXT*                  pSurfaceCapabilities);</pre></code>

        <h5>Description</h5>
        #GetPhysicalDeviceSurfaceCapabilities2EXT() behaves similarly to #GetPhysicalDeviceSurfaceCapabilitiesKHR(), with the ability to return extended information by adding extension structures to its {@code pNext} chain.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code surface} <b>must</b> be a valid {@code VkSurfaceKHR} handle</li>
            <li>{@code pSurfaceCapabilities} <b>must</b> be a pointer to a ##VkSurfaceCapabilities2EXT structure</li>
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
                <li>#ERROR_SURFACE_LOST_KHR</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkSurfaceCapabilities2EXT
        """,

        VkPhysicalDevice.IN("physicalDevice", "the physical device that will be associated with the swapchain to be created, as described for #CreateSwapchainKHR()."),
        VkSurfaceKHR.IN("surface", "the surface that will be associated with the swapchain."),
        VkSurfaceCapabilities2EXT.p.OUT("pSurfaceCapabilities", "a pointer to an instance of the ##VkSurfaceCapabilities2EXT structure in which the capabilities are returned.")
    )
}
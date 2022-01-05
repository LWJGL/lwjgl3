/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_display_surface_counter = "EXTDisplaySurfaceCounter".nativeClassVK("EXT_display_surface_counter", type = "instance", postfix = "EXT") {
    documentation =
        """
        This extension defines a vertical blanking period counter associated with display surfaces. It provides a mechanism to query support for such a counter from a {@code VkSurfaceKHR} object.

        <h5>VK_EXT_display_surface_counter</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_display_surface_counter}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Instance extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>91</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRDisplay VK_KHR_display}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>James Jones <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_display_surface_counter]%20@cubanismo%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_display_surface_counter%20extension%3E%3E">cubanismo</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2016-12-13</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Pierre Boudier, NVIDIA</li>
                <li>James Jones, NVIDIA</li>
                <li>Damien Leone, NVIDIA</li>
                <li>Pierre-Loup Griffais, Valve</li>
                <li>Daniel Vetter, Intel</li>
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

        "STRUCTURE_TYPE_SURFACE_CAPABILITIES_2_EXT".."1000090000",
        "STRUCTURE_TYPE_SURFACE_CAPABILITIES2_EXT".."1000090000"
    )

    EnumConstant(
        """
        VkSurfaceCounterFlagBitsEXT - Surface-relative counter types

        <h5>Description</h5>
        <ul>
            <li>#SURFACE_COUNTER_VBLANK_BIT_EXT specifies a counter incrementing once every time a vertical blanking period occurs on the display associated with the surface.</li>
        </ul>

        <h5>See Also</h5>
        #GetSwapchainCounterEXT()
        """,

        "SURFACE_COUNTER_VBLANK_BIT_EXT".enum(0x00000001),
        "SURFACE_COUNTER_VBLANK_EXT".enum(0x00000001)
    )

    VkResult(
        "GetPhysicalDeviceSurfaceCapabilities2EXT",
        """
        Query surface capabilities.

        <h5>C Specification</h5>
        To query the basic capabilities of a surface, needed in order to create a swapchain, call:

        <pre><code>
￿VkResult vkGetPhysicalDeviceSurfaceCapabilities2EXT(
￿    VkPhysicalDevice                            physicalDevice,
￿    VkSurfaceKHR                                surface,
￿    VkSurfaceCapabilities2EXT*                  pSurfaceCapabilities);</code></pre>

        <h5>Description</h5>
        {@code vkGetPhysicalDeviceSurfaceCapabilities2EXT} behaves similarly to #GetPhysicalDeviceSurfaceCapabilitiesKHR(), with the ability to return extended information by adding extending structures to the {@code pNext} chain of its {@code pSurfaceCapabilities} parameter.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code surface} <b>must</b> be a valid {@code VkSurfaceKHR} handle</li>
            <li>{@code surface} <b>must</b> be supported by {@code physicalDevice}, as reported by #GetPhysicalDeviceSurfaceSupportKHR() or an equivalent platform-specific mechanism</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code surface} <b>must</b> be a valid {@code VkSurfaceKHR} handle</li>
            <li>{@code pSurfaceCapabilities} <b>must</b> be a valid pointer to a ##VkSurfaceCapabilities2EXT structure</li>
            <li>Both of {@code physicalDevice}, and {@code surface} <b>must</b> have been created, allocated, or retrieved from the same {@code VkInstance}</li>
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

        VkPhysicalDevice("physicalDevice", "the physical device that will be associated with the swapchain to be created, as described for #CreateSwapchainKHR()."),
        VkSurfaceKHR("surface", "the surface that will be associated with the swapchain."),
        VkSurfaceCapabilities2EXT.p("pSurfaceCapabilities", "a pointer to a ##VkSurfaceCapabilities2EXT structure in which the capabilities are returned.")
    )
}
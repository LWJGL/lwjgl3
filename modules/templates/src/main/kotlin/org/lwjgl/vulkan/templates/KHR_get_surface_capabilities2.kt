/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val KHR_get_surface_capabilities2 = "KHRGetSurfaceCapabilities2".nativeClassVK("KHR_get_surface_capabilities2", type = "instance", postfix = KHR) {
    documentation =
        """
        This extension provides new entry points to query device surface capabilities in a way that can be easily extended by other extensions, without introducing any further entry points. This extension can be considered the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VK_KHR_surface">VK_KHR_surface</a> equivalent of the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\#VK_KHR_get_physical_device_properties2"> VK_KHR_get_physical_device_properties2</a> extension.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>VK_KHR_get_surface_capabilities2</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Instance extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>120</dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2017-02-27</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Dependencies</b></dt>
            <dd><ul>
                <li>This extension is written against version 1.0 of the Vulkan API.</li>
                <li>This extension requires VK_KHR_surface.</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Ian Elliott, Google</li>
                <li>James Jones, NVIDIA</li>
                <li>Alon Or-bach, Samsung</li>
            </ul></dd>

            <dt><b>Contacts</b></dt>
            <dd><ul>
                <li>James Jones, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_GET_SURFACE_CAPABILITIES_2_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_GET_SURFACE_CAPABILITIES_2_EXTENSION_NAME".."VK_KHR_get_surface_capabilities2"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SURFACE_INFO_2_KHR".."1000119000",
        "STRUCTURE_TYPE_SURFACE_CAPABILITIES_2_KHR".."1000119001",
        "STRUCTURE_TYPE_SURFACE_FORMAT_2_KHR".."1000119002"
    )

    VkResult(
        "GetPhysicalDeviceSurfaceCapabilities2KHR",
        """
        Reports capabilities of a surface on a physical device.

        <h5>C Specification</h5>
        To query the basic capabilities of a surface defined by the core or extensions, call:

        <code><pre>
￿VkResult vkGetPhysicalDeviceSurfaceCapabilities2KHR(
￿    VkPhysicalDevice                            physicalDevice,
￿    const VkPhysicalDeviceSurfaceInfo2KHR*      pSurfaceInfo,
￿    VkSurfaceCapabilities2KHR*                  pSurfaceCapabilities);</pre></code>

        <h5>Description</h5>
        #GetPhysicalDeviceSurfaceCapabilities2KHR() behaves similarly to #GetPhysicalDeviceSurfaceCapabilitiesKHR(), with the ability to specify extended inputs via chained input structures, and to return extended information via chained output structures.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code pSurfaceInfo} <b>must</b> be a pointer to a valid ##VkPhysicalDeviceSurfaceInfo2KHR structure</li>
            <li>{@code pSurfaceCapabilities} <b>must</b> be a pointer to a ##VkSurfaceCapabilities2KHR structure</li>
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
        ##VkPhysicalDeviceSurfaceInfo2KHR, ##VkSurfaceCapabilities2KHR
        """,

        VkPhysicalDevice.IN("physicalDevice", "the physical device that will be associated with the swapchain to be created, as described for #CreateSwapchainKHR()."),
        const..VkPhysicalDeviceSurfaceInfo2KHR.p.IN("pSurfaceInfo", "points to an instance of the ##VkPhysicalDeviceSurfaceInfo2KHR structure, describing the surface and other fixed parameters that would be consumed by #CreateSwapchainKHR()."),
        VkSurfaceCapabilities2KHR.p.OUT("pSurfaceCapabilities", "points to an instance of the ##VkSurfaceCapabilities2KHR structure in which the capabilities are returned.")
    )

    VkResult(
        "GetPhysicalDeviceSurfaceFormats2KHR",
        """
        Query color formats supported by surface.

        <h5>C Specification</h5>
        To query the supported swapchain format tuples for a surface, call:

        <code><pre>
￿VkResult vkGetPhysicalDeviceSurfaceFormats2KHR(
￿    VkPhysicalDevice                            physicalDevice,
￿    const VkPhysicalDeviceSurfaceInfo2KHR*      pSurfaceInfo,
￿    uint32_t*                                   pSurfaceFormatCount,
￿    VkSurfaceFormat2KHR*                        pSurfaceFormats);</pre></code>

        <h5>Description</h5>
        If {@code pSurfaceFormats} is {@code NULL}, then the number of format tuples supported for the given {@code surface} is returned in {@code pSurfaceFormatCount}. The number of format tuples supported will be greater than or equal to 1. Otherwise, {@code pSurfaceFormatCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pSurfaceFormats} array, and on return the variable is overwritten with the number of structures actually written to {@code pSurfaceFormats}. If the value of {@code pSurfaceFormatCount} is less than the number of format tuples supported, at most {@code pSurfaceFormatCount} structures will be written. If {@code pSurfaceFormatCount} is smaller than the number of format tuples supported for the surface parameters described in {@code pSurfaceInfo}, #INCOMPLETE will be returned instead of #SUCCESS to indicate that not all the available values were returned.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code pSurfaceInfo} <b>must</b> be a pointer to a valid ##VkPhysicalDeviceSurfaceInfo2KHR structure</li>
            <li>{@code pSurfaceFormatCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
            <li>If the value referenced by {@code pSurfaceFormatCount} is not 0, and {@code pSurfaceFormats} is not {@code NULL}, {@code pSurfaceFormats} <b>must</b> be a pointer to an array of {@code pSurfaceFormatCount} ##VkSurfaceFormat2KHR structures</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#INCOMPLETE</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_SURFACE_LOST_KHR</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkPhysicalDeviceSurfaceInfo2KHR, ##VkSurfaceFormat2KHR
        """,

        VkPhysicalDevice.IN("physicalDevice", "the physical device that will be associated with the swapchain to be created, as described for #CreateSwapchainKHR()."),
        const..VkPhysicalDeviceSurfaceInfo2KHR.p.IN("pSurfaceInfo", "points to an instance of the ##VkPhysicalDeviceSurfaceInfo2KHR structure, describing the surface and other fixed parameters that would be consumed by #CreateSwapchainKHR()."),
        AutoSize("pSurfaceFormats")..Check(1)..uint32_t_p.INOUT("pSurfaceFormatCount", "a pointer to an integer related to the number of format tuples available or queried, as described below."),
        nullable..VkSurfaceFormat2KHR.p.OUT("pSurfaceFormats", "either {@code NULL} or a pointer to an array of ##VkSurfaceFormat2KHR structures.")
    )
}
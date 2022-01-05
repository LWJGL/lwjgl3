/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_get_surface_capabilities2 = "KHRGetSurfaceCapabilities2".nativeClassVK("KHR_get_surface_capabilities2", type = "instance", postfix = "KHR") {
    documentation =
        """
        This extension provides new entry points to query device surface capabilities in a way that can be easily extended by other extensions, without introducing any further entry points. This extension can be considered the {@link KHRSurface VK_KHR_surface} equivalent of the {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2} extension.

        <h5>VK_KHR_get_surface_capabilities2</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_get_surface_capabilities2}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Instance extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>120</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRSurface VK_KHR_surface}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>James Jones <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_get_surface_capabilities2]%20@cubanismo%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_get_surface_capabilities2%20extension%3E%3E">cubanismo</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2017-02-27</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Ian Elliott, Google</li>
                <li>James Jones, NVIDIA</li>
                <li>Alon Or-bach, Samsung</li>
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

        <pre><code>
￿VkResult vkGetPhysicalDeviceSurfaceCapabilities2KHR(
￿    VkPhysicalDevice                            physicalDevice,
￿    const VkPhysicalDeviceSurfaceInfo2KHR*      pSurfaceInfo,
￿    VkSurfaceCapabilities2KHR*                  pSurfaceCapabilities);</code></pre>

        <h5>Description</h5>
        {@code vkGetPhysicalDeviceSurfaceCapabilities2KHR} behaves similarly to #GetPhysicalDeviceSurfaceCapabilitiesKHR(), with the ability to specify extended inputs via chained input structures, and to return extended information via chained output structures.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code pSurfaceInfo→surface} <b>must</b> be a valid {@code VkSurfaceKHR} handle</li>
            <li>{@code pSurfaceInfo→surface} <b>must</b> be supported by {@code physicalDevice}, as reported by #GetPhysicalDeviceSurfaceSupportKHR() or an equivalent platform-specific mechanism</li>
        </ul>

        <ul>
            <li>If a ##VkSurfaceCapabilitiesFullScreenExclusiveEXT structure is included in the {@code pNext} chain of {@code pSurfaceCapabilities}, a ##VkSurfaceFullScreenExclusiveWin32InfoEXT structure <b>must</b> be included in the {@code pNext} chain of {@code pSurfaceInfo}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code pSurfaceInfo} <b>must</b> be a valid pointer to a valid ##VkPhysicalDeviceSurfaceInfo2KHR structure</li>
            <li>{@code pSurfaceCapabilities} <b>must</b> be a valid pointer to a ##VkSurfaceCapabilities2KHR structure</li>
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

        VkPhysicalDevice("physicalDevice", "the physical device that will be associated with the swapchain to be created, as described for #CreateSwapchainKHR()."),
        VkPhysicalDeviceSurfaceInfo2KHR.const.p("pSurfaceInfo", "a pointer to a ##VkPhysicalDeviceSurfaceInfo2KHR structure describing the surface and other fixed parameters that would be consumed by #CreateSwapchainKHR()."),
        VkSurfaceCapabilities2KHR.p("pSurfaceCapabilities", "a pointer to a ##VkSurfaceCapabilities2KHR structure in which the capabilities are returned.")
    )

    VkResult(
        "GetPhysicalDeviceSurfaceFormats2KHR",
        """
        Query color formats supported by surface.

        <h5>C Specification</h5>
        To query the supported swapchain format tuples for a surface, call:

        <pre><code>
￿VkResult vkGetPhysicalDeviceSurfaceFormats2KHR(
￿    VkPhysicalDevice                            physicalDevice,
￿    const VkPhysicalDeviceSurfaceInfo2KHR*      pSurfaceInfo,
￿    uint32_t*                                   pSurfaceFormatCount,
￿    VkSurfaceFormat2KHR*                        pSurfaceFormats);</code></pre>

        <h5>Description</h5>
        #GetPhysicalDeviceSurfaceFormats2KHR() behaves similarly to #GetPhysicalDeviceSurfaceFormatsKHR(), with the ability to be extended via {@code pNext} chains.

        If {@code pSurfaceFormats} is {@code NULL}, then the number of format tuples supported for the given {@code surface} is returned in {@code pSurfaceFormatCount}. Otherwise, {@code pSurfaceFormatCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pSurfaceFormats} array, and on return the variable is overwritten with the number of structures actually written to {@code pSurfaceFormats}. If the value of {@code pSurfaceFormatCount} is less than the number of format tuples supported, at most {@code pSurfaceFormatCount} structures will be written, and #INCOMPLETE will be returned instead of #SUCCESS, to indicate that not all the available values were returned.

        <h5>Valid Usage</h5>
        <ul>
            <li>If the {@link GOOGLESurfacelessQuery VK_GOOGLE_surfaceless_query} extension is not enabled, {@code pSurfaceInfo→surface} <b>must</b> be a valid {@code VkSurfaceKHR} handle</li>
            <li>If {@code pSurfaceInfo→surface} is not #NULL_HANDLE, it <b>must</b> be supported by {@code physicalDevice}, as reported by #GetPhysicalDeviceSurfaceSupportKHR() or an equivalent platform-specific mechanism</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code pSurfaceInfo} <b>must</b> be a valid pointer to a valid ##VkPhysicalDeviceSurfaceInfo2KHR structure</li>
            <li>{@code pSurfaceFormatCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
            <li>If the value referenced by {@code pSurfaceFormatCount} is not 0, and {@code pSurfaceFormats} is not {@code NULL}, {@code pSurfaceFormats} <b>must</b> be a valid pointer to an array of {@code pSurfaceFormatCount} ##VkSurfaceFormat2KHR structures</li>
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

        VkPhysicalDevice("physicalDevice", "the physical device that will be associated with the swapchain to be created, as described for #CreateSwapchainKHR()."),
        VkPhysicalDeviceSurfaceInfo2KHR.const.p("pSurfaceInfo", "a pointer to a ##VkPhysicalDeviceSurfaceInfo2KHR structure describing the surface and other fixed parameters that would be consumed by #CreateSwapchainKHR()."),
        AutoSize("pSurfaceFormats")..Check(1)..uint32_t.p("pSurfaceFormatCount", "a pointer to an integer related to the number of format tuples available or queried, as described below."),
        nullable..VkSurfaceFormat2KHR.p("pSurfaceFormats", "either {@code NULL} or a pointer to an array of ##VkSurfaceFormat2KHR structures.")
    )
}
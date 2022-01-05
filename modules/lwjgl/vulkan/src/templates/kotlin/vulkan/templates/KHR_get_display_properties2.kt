/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_get_display_properties2 = "KHRGetDisplayProperties2".nativeClassVK("KHR_get_display_properties2", type = "instance", postfix = "KHR") {
    documentation =
        """
        This extension provides new entry points to query device display properties and capabilities in a way that can be easily extended by other extensions, without introducing any further entry points. This extension can be considered the {@link KHRDisplay VK_KHR_display} equivalent of the {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2} extension.

        <h5>VK_KHR_get_display_properties2</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_get_display_properties2}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Instance extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>122</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRDisplay VK_KHR_display}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>James Jones <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_get_display_properties2]%20@cubanismo%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_get_display_properties2%20extension%3E%3E">cubanismo</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2017-02-21</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Ian Elliott, Google</li>
                <li>James Jones, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_GET_DISPLAY_PROPERTIES_2_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_GET_DISPLAY_PROPERTIES_2_EXTENSION_NAME".."VK_KHR_get_display_properties2"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_DISPLAY_PROPERTIES_2_KHR".."1000121000",
        "STRUCTURE_TYPE_DISPLAY_PLANE_PROPERTIES_2_KHR".."1000121001",
        "STRUCTURE_TYPE_DISPLAY_MODE_PROPERTIES_2_KHR".."1000121002",
        "STRUCTURE_TYPE_DISPLAY_PLANE_INFO_2_KHR".."1000121003",
        "STRUCTURE_TYPE_DISPLAY_PLANE_CAPABILITIES_2_KHR".."1000121004"
    )

    VkResult(
        "GetPhysicalDeviceDisplayProperties2KHR",
        """
        Query information about the available displays.

        <h5>C Specification</h5>
        To query information about the available displays, call:

        <pre><code>
￿VkResult vkGetPhysicalDeviceDisplayProperties2KHR(
￿    VkPhysicalDevice                            physicalDevice,
￿    uint32_t*                                   pPropertyCount,
￿    VkDisplayProperties2KHR*                    pProperties);</code></pre>

        <h5>Description</h5>
        {@code vkGetPhysicalDeviceDisplayProperties2KHR} behaves similarly to #GetPhysicalDeviceDisplayPropertiesKHR(), with the ability to return extended information via chained output structures.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code pPropertyCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
            <li>If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not {@code NULL}, {@code pProperties} <b>must</b> be a valid pointer to an array of {@code pPropertyCount} ##VkDisplayProperties2KHR structures</li>
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
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkDisplayProperties2KHR
        """,

        VkPhysicalDevice("physicalDevice", "a physical device."),
        AutoSize("pProperties")..Check(1)..uint32_t.p("pPropertyCount", "a pointer to an integer related to the number of display devices available or queried, as described below."),
        nullable..VkDisplayProperties2KHR.p("pProperties", "either {@code NULL} or a pointer to an array of ##VkDisplayProperties2KHR structures.")
    )

    VkResult(
        "GetPhysicalDeviceDisplayPlaneProperties2KHR",
        """
        Query information about the available display planes.

        <h5>C Specification</h5>
        To query the properties of a device’s display planes, call:

        <pre><code>
￿VkResult vkGetPhysicalDeviceDisplayPlaneProperties2KHR(
￿    VkPhysicalDevice                            physicalDevice,
￿    uint32_t*                                   pPropertyCount,
￿    VkDisplayPlaneProperties2KHR*               pProperties);</code></pre>

        <h5>Description</h5>
        {@code vkGetPhysicalDeviceDisplayPlaneProperties2KHR} behaves similarly to #GetPhysicalDeviceDisplayPlanePropertiesKHR(), with the ability to return extended information via chained output structures.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code pPropertyCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
            <li>If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not {@code NULL}, {@code pProperties} <b>must</b> be a valid pointer to an array of {@code pPropertyCount} ##VkDisplayPlaneProperties2KHR structures</li>
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
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkDisplayPlaneProperties2KHR
        """,

        VkPhysicalDevice("physicalDevice", "a physical device."),
        AutoSize("pProperties")..Check(1)..uint32_t.p("pPropertyCount", "a pointer to an integer related to the number of display planes available or queried, as described below."),
        nullable..VkDisplayPlaneProperties2KHR.p("pProperties", "either {@code NULL} or a pointer to an array of ##VkDisplayPlaneProperties2KHR structures.")
    )

    VkResult(
        "GetDisplayModeProperties2KHR",
        """
        Query information about the available display modes.

        <h5>C Specification</h5>
        To query the properties of a device’s built-in display modes, call:

        <pre><code>
￿VkResult vkGetDisplayModeProperties2KHR(
￿    VkPhysicalDevice                            physicalDevice,
￿    VkDisplayKHR                                display,
￿    uint32_t*                                   pPropertyCount,
￿    VkDisplayModeProperties2KHR*                pProperties);</code></pre>

        <h5>Description</h5>
        {@code vkGetDisplayModeProperties2KHR} behaves similarly to #GetDisplayModePropertiesKHR(), with the ability to return extended information via chained output structures.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code display} <b>must</b> be a valid {@code VkDisplayKHR} handle</li>
            <li>{@code pPropertyCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
            <li>If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not {@code NULL}, {@code pProperties} <b>must</b> be a valid pointer to an array of {@code pPropertyCount} ##VkDisplayModeProperties2KHR structures</li>
            <li>{@code display} <b>must</b> have been created, allocated, or retrieved from {@code physicalDevice}</li>
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
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkDisplayModeProperties2KHR
        """,

        VkPhysicalDevice("physicalDevice", "the physical device associated with {@code display}."),
        VkDisplayKHR("display", "the display to query."),
        AutoSize("pProperties")..Check(1)..uint32_t.p("pPropertyCount", "a pointer to an integer related to the number of display modes available or queried, as described below."),
        nullable..VkDisplayModeProperties2KHR.p("pProperties", "either {@code NULL} or a pointer to an array of ##VkDisplayModeProperties2KHR structures.")
    )

    VkResult(
        "GetDisplayPlaneCapabilities2KHR",
        """
        Query capabilities of a mode and plane combination.

        <h5>C Specification</h5>
        To query the capabilities of a given mode and plane combination, call:

        <pre><code>
￿VkResult vkGetDisplayPlaneCapabilities2KHR(
￿    VkPhysicalDevice                            physicalDevice,
￿    const VkDisplayPlaneInfo2KHR*               pDisplayPlaneInfo,
￿    VkDisplayPlaneCapabilities2KHR*             pCapabilities);</code></pre>

        <h5>Description</h5>
        {@code vkGetDisplayPlaneCapabilities2KHR} behaves similarly to #GetDisplayPlaneCapabilitiesKHR(), with the ability to specify extended inputs via chained input structures, and to return extended information via chained output structures.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code pDisplayPlaneInfo} <b>must</b> be a valid pointer to a valid ##VkDisplayPlaneInfo2KHR structure</li>
            <li>{@code pCapabilities} <b>must</b> be a valid pointer to a ##VkDisplayPlaneCapabilities2KHR structure</li>
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
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkDisplayPlaneCapabilities2KHR, ##VkDisplayPlaneInfo2KHR
        """,

        VkPhysicalDevice("physicalDevice", "the physical device associated with {@code pDisplayPlaneInfo}."),
        VkDisplayPlaneInfo2KHR.const.p("pDisplayPlaneInfo", "a pointer to a ##VkDisplayPlaneInfo2KHR structure describing the plane and mode."),
        VkDisplayPlaneCapabilities2KHR.p("pCapabilities", "a pointer to a ##VkDisplayPlaneCapabilities2KHR structure in which the capabilities are returned.")
    )
}
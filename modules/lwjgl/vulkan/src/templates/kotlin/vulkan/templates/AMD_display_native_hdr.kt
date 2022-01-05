/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val AMD_display_native_hdr = "AMDDisplayNativeHdr".nativeClassVK("AMD_display_native_hdr", type = "device", postfix = "AMD") {
    documentation =
        """
        This extension introduces the following display native HDR features to Vulkan:

        <ul>
            <li>A new {@code VkColorSpaceKHR} enum for setting the native display colorspace. For example, this color space would be set by the swapchain to use the native color space in Freesync2 displays.</li>
            <li>Local dimming control</li>
        </ul>

        <h5>Examples</h5>
        None.

        <h5>VK_AMD_display_native_hdr</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_AMD_display_native_hdr}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>214</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
                <li>Requires {@link KHRGetSurfaceCapabilities2 VK_KHR_get_surface_capabilities2}</li>
                <li>Requires {@link KHRSwapchain VK_KHR_swapchain}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Matthaeus G. Chajdas <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_AMD_display_native_hdr]%20@anteru%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_AMD_display_native_hdr%20extension%3E%3E">anteru</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2018-12-18</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Matthaeus G. Chajdas, AMD</li>
                <li>Aaron Hagan, AMD</li>
                <li>Aric Cyr, AMD</li>
                <li>Timothy Lottes, AMD</li>
                <li>Derrick Owens, AMD</li>
                <li>Daniel Rakos, AMD</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "AMD_DISPLAY_NATIVE_HDR_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "AMD_DISPLAY_NATIVE_HDR_EXTENSION_NAME".."VK_AMD_display_native_hdr"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_DISPLAY_NATIVE_HDR_SURFACE_CAPABILITIES_AMD".."1000213000",
        "STRUCTURE_TYPE_SWAPCHAIN_DISPLAY_NATIVE_HDR_CREATE_INFO_AMD".."1000213001"
    )

    EnumConstant(
        "Extends {@code VkColorSpaceKHR}.",

        "COLOR_SPACE_DISPLAY_NATIVE_AMD".."1000213000"
    )

    void(
        "SetLocalDimmingAMD",
        """
        Set Local Dimming.

        <h5>C Specification</h5>
        The local dimming HDR setting may also be changed over the life of a swapchain by calling:

        <pre><code>
￿void vkSetLocalDimmingAMD(
￿    VkDevice                                    device,
￿    VkSwapchainKHR                              swapChain,
￿    VkBool32                                    localDimmingEnable);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code swapChain} <b>must</b> be a valid {@code VkSwapchainKHR} handle</li>
            <li>Both of {@code device}, and {@code swapChain} <b>must</b> have been created, allocated, or retrieved from the same {@code VkInstance}</li>
        </ul>

        <h5>Valid Usage</h5>
        <ul>
            <li>##VkDisplayNativeHdrSurfaceCapabilitiesAMD{@code ::localDimmingSupport} <b>must</b> be supported</li>
        </ul>
        """,

        VkDevice("device", "the device associated with {@code swapChain}."),
        VkSwapchainKHR("swapChain", "handle to enable local dimming."),
        VkBool32("localDimmingEnable", "specifies whether local dimming is enabled for the swapchain.")
    )
}
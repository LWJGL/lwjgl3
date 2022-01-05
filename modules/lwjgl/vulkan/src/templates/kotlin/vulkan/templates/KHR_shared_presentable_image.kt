/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_shared_presentable_image = "KHRSharedPresentableImage".nativeClassVK("KHR_shared_presentable_image", type = "device", postfix = "KHR") {
    documentation =
        """
        This extension extends {@link KHRSwapchain VK_KHR_swapchain} to enable creation of a shared presentable image. This allows the application to use the image while the presention engine is accessing it, in order to reduce the latency between rendering and presentation.

        <h5>VK_KHR_shared_presentable_image</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_shared_presentable_image}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>112</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRSwapchain VK_KHR_swapchain}</li>
                <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
                <li>Requires {@link KHRGetSurfaceCapabilities2 VK_KHR_get_surface_capabilities2}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Alon Or-bach <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_shared_presentable_image]%20@alonorbach%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_shared_presentable_image%20extension%3E%3E">alonorbach</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2017-03-20</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Alon Or-bach, Samsung Electronics</li>
                <li>Ian Elliott, Google</li>
                <li>Jesse Hall, Google</li>
                <li>Pablo Ceballos, Google</li>
                <li>Chris Forbes, Google</li>
                <li>Jeff Juliano, NVIDIA</li>
                <li>James Jones, NVIDIA</li>
                <li>Daniel Rakos, AMD</li>
                <li>Tobias Hector, Imagination Technologies</li>
                <li>Graham Connor, Imagination Technologies</li>
                <li>Michael Worcester, Imagination Technologies</li>
                <li>Cass Everitt, Oculus</li>
                <li>Johannes Van Waveren, Oculus</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_SHARED_PRESENTABLE_IMAGE_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_SHARED_PRESENTABLE_IMAGE_EXTENSION_NAME".."VK_KHR_shared_presentable_image"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_SHARED_PRESENT_SURFACE_CAPABILITIES_KHR".."1000111000"
    )

    EnumConstant(
        "Extends {@code VkPresentModeKHR}.",

        "PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR".."1000111000",
        "PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR".."1000111001"
    )

    EnumConstant(
        "Extends {@code VkImageLayout}.",

        "IMAGE_LAYOUT_SHARED_PRESENT_KHR".."1000111000"
    )

    VkResult(
        "GetSwapchainStatusKHR",
        """
        Get a swapchain’s status.

        <h5>C Specification</h5>
        In order to query a swapchain’s status when rendering to a shared presentable image, call:

        <pre><code>
￿VkResult vkGetSwapchainStatusKHR(
￿    VkDevice                                    device,
￿    VkSwapchainKHR                              swapchain);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code swapchain} <b>must</b> be a valid {@code VkSwapchainKHR} handle</li>
            <li>Both of {@code device}, and {@code swapchain} <b>must</b> have been created, allocated, or retrieved from the same {@code VkInstance}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code swapchain} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SUBOPTIMAL_KHR</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_DEVICE_LOST</li>
                <li>#ERROR_OUT_OF_DATE_KHR</li>
                <li>#ERROR_SURFACE_LOST_KHR</li>
                <li>#ERROR_FULL_SCREEN_EXCLUSIVE_MODE_LOST_EXT</li>
            </ul></dd>
        </dl>
        """,

        VkDevice("device", "the device associated with {@code swapchain}."),
        VkSwapchainKHR("swapchain", "the swapchain to query.")
    )
}